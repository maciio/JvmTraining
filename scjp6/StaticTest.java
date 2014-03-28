rule "Graduate Preschool"
                   salience 10
                   no-loop
                   when
                      stuey : Student( grade == "Preschool" )
                      uniform:
                   then
                      System.out.println( "Graduating " + stuey.getName() + " from Preschool" );
                      stuey.setGrade("Kindergarten")
//                      stuey.setUniform(new Uniform(Color.BLUE, Size.S );
//                      update (stuey);
                end

                rule "Graduate Kindergarten"
                   salience 10
                   no-loop
                   when
                      stuey : Student( grade == "Kindergarten" )
                   then
                      System.out.println( "Graduating " + stuey.getName() + " from Kindergarten" );
//                      stuey.setUniform(new Uniform(Color.RED, Size.M );
                      stuey.setGrade("1st");
                end

                rule "Graduate 1st Grade"
                   // Student won't get past Kindergarten
                   // because Kindergarten rule doesn't
                   // call the update() method
                   salience 10
                   when
                      stuey : Student( grade == "1st" )
                   then
                      System.out.println( "Graduating " + stuey.getName() + " from 1st" );
                      stuey.setGrade("2nd");
                end