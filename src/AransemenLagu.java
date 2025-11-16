public class AransemenLagu {
        private String judulLagu = "Remaja by HIVI";
    
    public void aturAransemen() {
        Instrument[] instruments = new Instrument[3];
        
        instruments[0] = new Instrument() {
            public void mainkan(String judulLagu) {
                System.out.println("Piano -> melodi lembut dengan tempo 80 BPM");
            }
        };
        
        instruments[1] = new Instrument() {
            public void mainkan(String judulLagu) {
                System.out.println("Gitar -> ritme cepat dengan tempo 120 BPM");
            }
        };
        
        instruments[2] = new Instrument() {
            public void mainkan(String judulLagu) {
                System.out.println("Drum -> ketukan dinamis dengan tempo 100 BPM");
            }
        };
        
        for (Instrument instrument : instruments) {
            instrument.mainkan(judulLagu);
        }
    }
    
    public void improvisasi(Instrument instrument) {
        instrument.mainkan(judulLagu);
    }
}
