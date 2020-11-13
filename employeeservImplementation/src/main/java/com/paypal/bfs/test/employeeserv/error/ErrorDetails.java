

package com.paypal.bfs.test.employeeserv.error;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class ErrorDetails {
    
    private Date timestamp;
    private String message;
    private String details;
    
    public ErrorDetails(Date timestamp, String message, String details) {
        super();
        this.timestamp = timestamp;
        this.message = message;
        this.details = details;
    }
    
    

}
