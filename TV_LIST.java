package project;

public class TVLIST {
    Scanner sc = new Scanner(System.in);
    ArrayList<TV> list = new ArrayList<>();
    TV tv;
    String id ;
    int tmp = 0;
    
    void AddNew(){
        System.out.println("Ban muon them loai TV nao: ");
        System.out.println("1: TV_SAMSUNG\n2: TV_SONY");
        tmp = sc.nextInt();
        if(tmp == 1){
            tv = new TV_SAMSUNG();
            tv.Input();
            list.add(tv);
        }
        if(tmp == 2){
            tv = new TV_SONY();
            tv.Input();
            list.add(tv);
        }
    }
    
    void Update(){
        sc.nextLine();
        System.out.println("Moi ban nhap ID can Update: ");
        id = sc.nextLine();
        for(TV tv:list){
            if(tv.getTvID().equals(id)){
                System.out.println("Moi ban nhap lai thong tin: ");
                tv.Input();
            }
        }
    }
    
    void Delete(){
        sc.nextLine();
        System.out.println("Moi ban nhap ID can Delete: ");
        id = sc.nextLine();
        for(TV tv:list){
            if(tv.getTvID().equals(id)){
                list.remove(tv);
            }
        }
    }
    
    void Find(){
        sc.nextLine();
        System.out.println("Moi ban nhap ID can Find: ");
        id = sc.nextLine();
        for(TV tv:list){
            if(tv.getTvID().equals(id)){
                tv.Output();
            }
        }
    }
    
    void Menu(){
        tmp = 0;
        while(tmp != 5){
            System.out.println("Ban muon chon chuc nang nao:");
            System.out.println("1: Add New\n2: Update\n3: Delete\n4: Find\n5: Exit");
            tmp = sc.nextInt();
            switch(tmp){
                case 1:
                    AddNew();
                    break;
                case 2:
                    Update();
                    break;
                case 3:
                    Delete();
                    break;
                case 4:
                    Find();
                    break;
            }
        }
    }
        
}

