//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package players;

public class Defender extends Player {
    private int hits;

    public Defender(int hits, int years, String name) {
        this.hits = hits;
        this.name = name;
        this.age = years;
    }

    public int getAge() {
        return this.age;
    }

    public String getName() {
        return this.name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHits(int hits) {
        this.hits = hits;
    }

    public int getHits() {
        return this.hits;
    }
}
