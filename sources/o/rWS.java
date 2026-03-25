package o;

import java.util.Calendar;

/* JADX INFO: loaded from: classes23.dex */
public final class rWS {
    public static final rWS KWHzl = new rWS();

    private rWS() {
    }

    public static /* synthetic */ Calendar getDateFilterTodayDate$default(rWS rws, int i, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        return rws.KWHzl(i);
    }

    public final Calendar KWHzl(int i) {
        Calendar calendar = Calendar.getInstance();
        calendar.add(6, i);
        return calendar;
    }
}
