package Lesson05Task02;

public enum Month {
    //JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE, JULY, AUGUST, SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER;
    JANUARY("Январь"), FEBRUARY("Февраль"), MARCH("Март"), APRIL("Апрель"),
    MAY("Май"), JUNE("Июнь"), JULY("Июль"), AUGUST("Август"),
    SEPTEMBER("Сентябрь"), OCTOBER("Октябрь"), NOVEMBER("Ноябрь"), DECEMBER("Декабрь");

    private String translation;

    Month(String translation) {
        this.translation = translation;
    }

    public String getTranslation() {
        return translation;
    }

    public void setTranslation(String translation) {
        this.translation = translation;
    }
}
