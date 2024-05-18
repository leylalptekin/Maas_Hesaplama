public class employee {
    String name;
    double salary;
    int workHours;
    int hireYear;


    employee(String name,double salary,int workHours,int hireYear){
        this.name=name;
        this.salary=salary;
        this.workHours=workHours;
        this.hireYear=hireYear;
    }

    public double tax(){
        double tax =0;
        if(salary>=1000){
            tax = salary*0.03;
        }
        return tax;
    }

    public int bonus(){
        int bonus=0;

        if (workHours>40){
            bonus =(workHours-40)*30;
        }
        return bonus;
    }

    public double raiseSalary(){
        double raise=0;

        if (2021-hireYear<10) {
            raise = salary * (0.05);
        }
        if (2021-hireYear<20) {
            raise = salary * (0.10);
        }
        if (2021-hireYear>20) {
            raise = salary * (0.15);
        }
        return raise;
    }

    public String toString(){
        return
                "Adı:"+ name +
                        "\nMaaşı:"+salary +
                        "\nÇalışma Saati:"+workHours +
                        "\nBaşlangıç Yılı:"+hireYear +
                        "\nVergi:"+tax() +
                        "\nBonus:"+bonus() +
                        "\nMaaş Artışı:"+raiseSalary() +
                        "\nVergi ve Bonuslar ile birlikte maaş:"+(salary-tax()+bonus()) +
                        "\nToplam Maaş:"+(salary+raiseSalary());
    }
}
