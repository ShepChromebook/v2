package v2_maybe;

public class Animal {
    private String name;
    private int health;
    private int strength;
    private int stamina;
    /**
     * constructs an Animal object
     * @param n 'name' is a String
     * @param h 'health' is an int
     * @param str 'strength' is an int
     * @param stam 'stamina' is an int
     */
    Animal(String n, int h, int str, int stam) {
        name = n;
        health = h;
        strength = str;
        stamina = stam;
    }
    /**
     * Overrides toString method, @return the animal name
     */
    @Override
    public String toString() {
        return this.name;
    }


    /**
     * @return the health attribute, of int type, of the object
     */
    public int getHealth() {
        return health;
    }

    /**
     * @return the stamina attribute, an int variable, of an animal object
     */
    public int getStamina(){
        return stamina;
    }

    /**
     * @return strength
     */
    public int getStrength(){
        return strength;
    }

    /** Decreases the health of an Animal object by a certain amount; if the result ends up being negative, health will be set to zero
     * @param amount - int variable dictating the amount to decrease health by
     */
    public void decreaseHealth(int amount) {
        health = (health-amount<0) ? 0 : health-amount;
    }
    /** Decreases the stamina attribute of an Animal object by adding the parameter (negative parameters can be used to subtract stamina); the stamina attribute will never be less than 0
     *  @param amount is an int variable.
     */
    public void decreaseStamina(int amount){
        stamina = (stamina-amount<0) ? 0 : stamina-amount;
    }

    /** Sets the strength attribute of an Animal object
     *@param amount is an int variable.
     */
    public void setStrength(int amount){
        strength=amount;
    }
    /**
     *@param amount is an int variable.
     */
    public void setHealth( int amount) {
        health=amount;
    }
    /**
     * @param amount is an int variable
     */
    public void setStamina(int amount){
        stamina=amount;
    }
}
