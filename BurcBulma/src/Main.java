import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int month,day;
        boolean isError = false;
        String burc = "";
        Scanner scan = new Scanner(System.in);

        System.out.print("Doğduğunuz ay :");
        month = scan.nextInt();

        System.out.print("Doğduğunuz gün :");
        day = scan.nextInt();


            if (month == 1) {
                if (day >= 1 && day <= 31) {
                    if (day < 22) {
                        burc = "Oğlak";
                    } else {
                        burc = "Kova";
                    }
                } else {
                    isError = true;
                }
            }
            if (month == 2) {
                if (day >= 1 && day <= 28) {
                    if (day < 21) {
                        burc = "Kova";
                    } else {
                        burc = "Balık";
                    }
                } else {
                    isError = true;
                }
            }
            if (month == 3) {
                if ((day >= 1 && day <= 31)) {
                    if (day < 21) {
                        burc = "Balık";
                    } else {
                        burc = "Koç";
                    }
                } else {
                    isError = true;
                }
            }
            if (month == 4) {
                if ((day >= 1 && day <= 30)) {
                    if (day < 21) {
                        burc = "Koç";
                    } else {
                        burc = "Boğa";
                    }
                } else {
                    isError = true;
                }
            }
            if (month == 5) {
                if ((day >= 1 && day <= 31)) {
                    if (day < 22) {
                        burc = "Boğa";
                    } else {
                        burc = "İkizler";
                    }
                } else {
                    isError = true;
                }
            }
            if (month == 6) {
                if ((day >= 1 && day <= 30)) {
                    if (day < 23) {
                        burc = "İkizler";
                    } else {
                        burc = "Yengeç";
                    }
                } else {
                    isError = true;
                }
            }
            if (month == 7) {
                if ((day >= 1 && day <= 31)) {
                    if (day < 22) {
                        burc = "Yengeç";
                    } else {
                        burc = "Aslan";
                    }
                } else {
                    isError = true;
                }
            }
            if (month == 8) {
                if ((day >= 1 && day <= 31)) {
                    if (day < 23) {
                        burc = "Aslan";
                    } else {
                        burc = "Başak";
                    }
                } else {
                    isError = true;
                }
            }
            if (month == 9) {
                if ((day >= 1 && day <= 31)) {
                    if (day < 23) {
                        burc = "Başak";
                    } else {
                        burc = "Terazi";
                    }
                } else {
                    isError = true;
                }
            }
            if (month == 10) {
                if ((day >= 1 && day <= 31)) {
                    if (day < 23) {
                        burc = "Terazi";
                    } else {
                        burc = "Akrep";
                    }
                } else {
                    isError = true;
                }
            }
            if (month == 11) {
                if ((day >= 1 && day <= 31)) {
                    if (day < 23) {
                        burc = "Akrep";
                    } else {
                        burc = "Yay";
                    }
                } else {
                    isError = true;
                }
            }
            if (month == 12) {
                if ((day >= 1 && day <= 31)) {
                    if (day < 23) {
                        burc = "Yay";
                    } else {
                        burc = "Oğlak";
                    }
                } else {
                    isError = true;
                }
            }
            if(month>=1 && month<= 12){
                System.out.println("Burcunuz : " + burc);
            }else {
                System.out.println("Hatalı Sayı Girdiniz");
            }
        }
        }


