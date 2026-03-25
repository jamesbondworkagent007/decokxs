package o;

/* JADX INFO: loaded from: classes2.dex */
public final class AG {
    public static final InterfaceC57843yq AEQbTJ;
    public static final InterfaceC57843yq EZpvd;
    public static final InterfaceC57843yq KWHzl;
    public static final AG OLrzqt = new AG();
    public static final InterfaceC57843yq copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InterfaceC57843yq EZpvd() {
        return EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InterfaceC57843yq KWHzl() {
        return KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InterfaceC57843yq OLrzqt() {
        return AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InterfaceC57843yq copydefault() {
        return copydefault;
    }

    private AG() {
    }

    static {
        C58002yt c58002yt = new C58002yt();
        c58002yt.AEQbTJ("state", "idle");
        AEQbTJ = c58002yt.AEQbTJ();
        C58002yt c58002yt2 = new C58002yt();
        c58002yt2.AEQbTJ("state", "acquired");
        KWHzl = c58002yt2.AEQbTJ();
        C58002yt c58002yt3 = new C58002yt();
        c58002yt3.AEQbTJ("state", "queued");
        EZpvd = c58002yt3.AEQbTJ();
        C58002yt c58002yt4 = new C58002yt();
        c58002yt4.AEQbTJ("state", "in-flight");
        copydefault = c58002yt4.AEQbTJ();
    }
}
