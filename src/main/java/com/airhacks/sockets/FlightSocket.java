/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.airhacks.sockets;

import javax.ejb.Startup;
import javax.inject.Singleton;
import javax.websocket.OnClose;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.server.ServerEndpoint;

/**
 *
 * @author Alex
 */
@Startup
@Singleton
@ServerEndpoint("/flight")
public class FlightSocket {

    private Session session;
    @OnOpen
    public void connect(Session session){
        this.session = session;
        System.out.println("Opening flight socket!");
    }
    
    @OnClose
    public void close(){
        this.session = null;
         System.out.println("Closing flight socket!");
    }
    
    @OnMessage
    public void message(String msg){
        String s = "I received" + msg;
        System.out.println(s);
        this.session.getAsyncRemote().sendText(s);
    }
}
