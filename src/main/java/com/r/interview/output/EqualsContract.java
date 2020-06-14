package com.r.interview.output;

public class EqualsContract {

    /*1. Reflective
    * 2. Symmetric
    * 3. Transitive
    * 4. Consistent
    * */

    public static void main(String[] args) {
        SuperHero batman = new SuperHero("Batman");
        SuperHero batmanCB = new SuperHero("Batman");
        SuperHero batmanRP = new SuperHero("Batman");

        System.out.println("Transitive");
        System.out.println(batman.equals(batmanCB)
                && batmanCB.equals(batmanRP)
                && batmanRP.equals(batman));

        System.out.println("Reflective");
        System.out.println(batman.equals(batman));

        System.out.println("Symmetric");
        System.out.println(batman.equals(batmanCB) && batmanCB.equals(batman));


        System.out.println("Consistent");
        System.out.println(batman.equals(batmanCB));
        System.out.println("Consistent, even on multiple calls.");
        System.out.println(batman.equals(batmanCB));
        System.out.println("But, When property change, only then consistent result can change");
        batman.setName("OwlMan");
        System.out.println(batman.equals(batmanCB));

    }

    static class SuperHero {
        private String name;

        public SuperHero(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;

            if (o == null || getClass() != o.getClass()) return false;

            SuperHero superHero = (SuperHero) o;

            return new org.apache.commons.lang3.builder.EqualsBuilder()
                    .append(name, superHero.name)
                    .isEquals();
        }

        @Override
        public int hashCode() {
            return new org.apache.commons.lang3.builder.HashCodeBuilder(17, 37)
                    .append(name)
                    .toHashCode();
        }
    }
}
