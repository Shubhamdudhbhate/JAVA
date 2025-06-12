        System.out.println("Enter a any  number in  (1 to 3): ");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("You selected Option 1");
                break;
            case 2:
                System.out.println("You selected Option 2");
                break;
            case 3:
                System.out.println("You selected Option 3");
                break;
            default:
                System.out.println("Invalid choice");
        }

        sc.close();