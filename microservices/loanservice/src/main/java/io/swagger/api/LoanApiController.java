package io.swagger.api;


import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
import io.swagger.exception.ResourceNotFoundException;
import io.swagger.model.Loan;
import io.swagger.service.LoanService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-11-27T12:29:55.795Z")

@RestController
@RequestMapping("/api")
public class LoanApiController implements LoanApi {

    @Autowired
    LoanService service;

    private static final Logger log = LoggerFactory.getLogger(LoanApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public LoanApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<Void> addPet(@ApiParam(value = "Pet object that needs to be added to the store", required = true) @Valid @RequestBody Loan body) throws ResourceNotFoundException{
        String accept = request.getHeader("Accept");

        service.addCheckout(body);
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<Void> deletePet(@ApiParam(value = "Pet id to delete", required = true) @PathVariable("petId") Long petId, @ApiParam(value = "") @RequestHeader(value = "api_key", required = false) String apiKey) throws ResourceNotFoundException {
        String accept = request.getHeader("Accept");
        service.deleteCheckout(petId);
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    @ApiOperation(value = "Get an employee by Id")
    @GetMapping("/pet/{id}")
    public ResponseEntity< Loan> getEmployeeById     (
            @ApiParam(value = "Employee id from which employee object will retrieve", required = true) @PathVariable(value = "id") Long employeeId) throws ResourceNotFoundException {
       Loan employee = service.getCheckoutById(employeeId);
        return ResponseEntity.ok().body(employee);

    }

    public ResponseEntity<Void> updatePet(@ApiParam(value = "Pet object that needs to be added to the store", required = true) @Valid @RequestBody Loan body) throws ResourceNotFoundException {
        String accept = request.getHeader("Accept");
        service.updateCheckout(body);
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

}
