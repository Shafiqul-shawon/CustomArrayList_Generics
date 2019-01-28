package CA.CustomArrayList;

public class Customer {
	
	private String name;
    private int Pps;
    private String email;
    private int age;    


    
    public Customer(String name, int Pps, String email, int age) {

        if (name==null)
            throw new IllegalArgumentException("Name cannot be null");

        if (email==null)
            throw new IllegalArgumentException("Email cannot be null");

        if (name.trim().length()==0)
            throw new IllegalArgumentException("Name cannot be empty");

        if (Pps<=0)
            throw new IllegalArgumentException("Not positiove Ppss are not allowed");

        if (age<18)
            throw new IllegalArgumentException("Customer mush be at least 18 year old");

        this.name = name;
        this.Pps = Pps;             
        this.email = email;
        this.age = age;
    }

    
    public String getName() {
        return name;
    }

    
    public int getPps() {
        return Pps;     
    }

   
    public String getEmail() {
        return email;
    }

    
    public int getAge() {
        return age;
    }


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Pps;
		result = prime * result + age;
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}


	// equals method implemented
	// kaj: override korlo
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		if (Pps != other.Pps)
			return false;
		if (age != other.age)
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

}
