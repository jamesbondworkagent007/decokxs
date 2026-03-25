package o;

/* JADX INFO: renamed from: o.tUu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C46450tUu {
    public static final C46450tUu copydefault = new C46450tUu();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt(int i) {
        if (i != 0) {
            if (i == 1) {
                return "MARGIN";
            }
            if (i == 2) {
                return "SWAP";
            }
            if (i == 3) {
                return "FUTURES";
            }
            if (i == 4) {
                return "OPTION";
            }
        }
        return "SPOT";
    }

    private C46450tUu() {
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final int OLrzqt(java.lang.String str) {
        if (str != null) {
            switch (str.hashCode()) {
                case -2027980370:
                    if (str.equals("MARGIN")) {
                        return 1;
                    }
                    break;
                case -1956807563:
                    if (str.equals("OPTION")) {
                        return 4;
                    }
                    break;
                case 2552066:
                    str.equals("SPOT");
                    break;
                case 2558355:
                    if (str.equals("SWAP")) {
                        return 2;
                    }
                    break;
                case 214415088:
                    if (str.equals("FUTURES")) {
                        return 3;
                    }
                    break;
            }
        }
        return 0;
    }
}
