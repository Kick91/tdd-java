package com.coding;


import org.junit.Test;
import static org.junit.Assert.*;


public class MemberTest {
    @Test
    public  void should_increase_60_point_when_recharge_56_yuan() {
        Member member = new Member();
        member.recharge(56);
        assertEquals(60,member.getPoint());
    }
    @Test
    public void  should_increase_90_point_when_recharge_68_yuan() {
    	Member member=new Member();
    	member.recharge(68);
        assertEquals(90,member.getPoint());	
    }
}

