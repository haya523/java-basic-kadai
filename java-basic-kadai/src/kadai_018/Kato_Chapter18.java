package kadai_018;

public abstract class Kato_Chapter18 {
	public String familyName;
    public String givenName;
    public String address;

    public Kato_Chapter18() {
        this.familyName = "加藤";
        this.address = "東京都中野区〇×";
    }
    public void commonIntroduce() {
        System.out.println("名前: " + familyName + " " + givenName);
        System.out.println("住所: " + address);
    }

    public abstract void eachIntroduce();

    public void execIntroduce() {
        commonIntroduce();
        eachIntroduce();
        System.out.println("");
    }
}
