package Lesson05Task10;

//10. Create enum for days of the week.
//    Write a program which will be printing the number of a day according to day of the week.
//    Example:
//    If today is Sunday - print 1;
//    If today is Monday - print 2
//    ...
//1) Use switch(day of the week) to pass the day of the week.

public class Task10 {

    public static void main(String[] args) {
//        Date today = new Date(); //deprecated ((
//        int dayOfWeek = Calendar.DAY_OF_WEEK; // Sunday - 1 ((
        Week today = Week.MONDAY;

        switch (today){
            case MONDAY : {
                System.out.println("Monday");
                break;
            }
            case TUESDAY: {
                System.out.println("Tuesday");
                break;
            }
            case WEDNESDAY: {
                System.out.println("Wednesday");
                break;
            }
            case THURSDAY: {
                System.out.println("Monday");
                break;
                    }
            case FRIDAY: {
                System.out.println("Monday");
                break;
            }
            case SATURDAY: {
                System.out.println("Monday");
                break;
            }
            case SUNDAY: {
                System.out.println("Monday");
                break;
            }
            default: {
                System.out.println("Unknown");
            }
        }
    }
}

enum Week {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;
/*  MONDAY(1), TUESDAY(2), WEDNESDAY(3), THURSDAY(4), FRIDAY(5), SATURDAY(6), SUNDAY(7);
    private int number;
    Week(int number) {this.number = number;}
    public int getNumber() {return number;}*/
}
