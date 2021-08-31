package com.company;

public class Pet extends Record {
    private String name;
    private Species species;
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public Species getSpecies() {
        return species;
    }
    
    public void setSpecies(Species species) {
        this.species = species;
    }
    

    
    @Override
    public void askData() {
        name = InputUtils.askString("Name");
        Help.showHelp(2);
        var strSpecies = InputUtils.askString("Species");
    
        species = Species.findBySpecies(strSpecies);
    
    
    }
    
    @Override
    public String toString() {
        var tmp = super.toString();
        return tmp + ", name='" + name + '\'' +
                ", species='" + species + '\'';
    
    }
    
    public boolean contains(String substr) {
        return super.contains(substr)
                || name.toLowerCase().contains(substr)
                || species.toString().toLowerCase().contains(substr)
                ;
    }
    
}
