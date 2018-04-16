/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.airhacks;

import java.io.IOException;
import java.util.Date;
import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerRequestFilter;

/**
 *
 * @author Alex
 */
public class RequestLogger implements ContainerRequestFilter{

    @Override
    public void filter(ContainerRequestContext crc) throws IOException {
       System.out.println(new Date().toString()+ "["+ crc.getMethod()+"]"+ crc.getRequest());
    }
    
}
