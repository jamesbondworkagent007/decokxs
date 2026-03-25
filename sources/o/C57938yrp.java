package o;

/* JADX INFO: renamed from: o.yrp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public class C57938yrp {
    public static final C57938yrp AEQbTJ;
    public static final C57938yrp AYXKKw;
    public static final C57938yrp AhwBna;
    public static final C57938yrp[] DbNXlk;
    public static final C57938yrp EZpvd;
    public static final C57938yrp KWHzl;
    public static final C57938yrp OLrzqt;
    public static final C57938yrp copydefault;
    public static final C57938yrp djBIcL;
    public static final C57938yrp fetchVPNInfo;
    public static final C57938yrp gEmmrt;
    public static final C57938yrp isConnected;
    public static final C57938yrp valueOf;
    public final boolean AkhnZx;
    public final int values;

    static {
        C57938yrp c57938yrp = new C57938yrp(0, false);
        gEmmrt = c57938yrp;
        C57938yrp c57938yrp2 = new C57938yrp(1, true);
        OLrzqt = c57938yrp2;
        C57938yrp c57938yrp3 = new C57938yrp(2, false);
        isConnected = c57938yrp3;
        C57938yrp c57938yrp4 = new C57938yrp(3, true);
        fetchVPNInfo = c57938yrp4;
        C57938yrp c57938yrp5 = new C57938yrp(4, false);
        AYXKKw = c57938yrp5;
        C57938yrp c57938yrp6 = new C57938yrp(5, true);
        valueOf = c57938yrp6;
        C57938yrp c57938yrp7 = new C57938yrp(6, false);
        djBIcL = c57938yrp7;
        C57938yrp c57938yrp8 = new C57938yrp(7, true);
        AhwBna = c57938yrp8;
        C57938yrp c57938yrp9 = new C57938yrp(8, false);
        copydefault = c57938yrp9;
        C57938yrp c57938yrp10 = new C57938yrp(9, true);
        AEQbTJ = c57938yrp10;
        C57938yrp c57938yrp11 = new C57938yrp(10, false);
        EZpvd = c57938yrp11;
        C57938yrp c57938yrp12 = new C57938yrp(10, true);
        KWHzl = c57938yrp12;
        DbNXlk = new C57938yrp[]{c57938yrp, c57938yrp2, c57938yrp3, c57938yrp4, c57938yrp5, c57938yrp6, c57938yrp7, c57938yrp8, c57938yrp9, c57938yrp10, c57938yrp11, c57938yrp12};
    }

    public C57938yrp(int i, boolean z) {
        this.values = i;
        this.AkhnZx = z;
    }

    public C57938yrp copydefault() {
        if (!this.AkhnZx) {
            return this;
        }
        C57938yrp c57938yrp = DbNXlk[this.values - 1];
        return !c57938yrp.AkhnZx ? c57938yrp : gEmmrt;
    }

    public C57938yrp AEQbTJ() {
        return !this.AkhnZx ? DbNXlk[this.values + 1] : this;
    }

    public boolean EZpvd(C57938yrp c57938yrp) {
        int i = this.values;
        int i2 = c57938yrp.values;
        return i < i2 || ((!this.AkhnZx || AEQbTJ == this) && i == i2);
    }
}
