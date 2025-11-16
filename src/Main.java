public class Main {
            public static void main(String[] args) {
        AransemenLagu lagu = new AransemenLagu();
        
        System.out.println("=== ARANSEMEN LAGU ===");
        lagu.aturAransemen();
        
        System.out.println("\n=== IMPROVISASI ===");
        lagu.improvisasi(new Instrument() {
            public void mainkan(String judulLagu) {
                System.out.println("Biola memainkan improvisasi dengan nada tinggi dan tempo 90 BPM");
            }
        });
    }
}
