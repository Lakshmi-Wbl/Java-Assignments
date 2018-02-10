package com.General;

public final class ImmutableClassExample {

	
		    private final String name;
		    private final String mobile;

		    public  ImmutableClassExample(String name, String mobile) {
		        this.name = name;
		        this.mobile = mobile;
		    }
		  
		    public String getName(){
		        return name;
		    }
		  
		    public String getMobile(){
		        return mobile;
		    }
		}


		


