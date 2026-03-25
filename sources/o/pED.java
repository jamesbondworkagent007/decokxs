package o;

import java.util.Calendar;

/* JADX INFO: loaded from: classes9.dex */
public final class pED {
    public static final pED KWHzl = new pED();
    public static java.lang.String OLrzqt = "0";
    public static java.lang.String AEQbTJ = "8";
    public static final int copydefault = 8;

    private pED() {
    }

    public final java.lang.String EZpvd() {
        InterfaceC46557tYt interfaceC46557tYt = (InterfaceC46557tYt) C43251rlk.OLrzqt(InterfaceC46557tYt.class);
        return ((interfaceC46557tYt == null || interfaceC46557tYt.EZpvd() != 2) && C36246oUr.copydefault().ODWQjV() >= 360) ? OLrzqt : AEQbTJ;
    }

    public final long AEQbTJ(int i) {
        Calendar calendar = Calendar.getInstance();
        calendar.add(1, -i);
        return calendar.getTimeInMillis();
    }
}
