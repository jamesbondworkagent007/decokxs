package o;

import com.okinc.kline.data.TimeIntervalItem;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.rsR, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C43603rsR {
    public static final C43603rsR AEQbTJ = new C43603rsR();
    public static java.lang.String EZpvd = "";
    public static final int OLrzqt = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        EZpvd = str;
    }

    private C43603rsR() {
    }

    public final java.lang.String OLrzqt(@NotNull TimeIntervalItem timeIntervalItem) {
        Intrinsics.checkNotNullParameter(timeIntervalItem, "");
        java.lang.String timeKLine = timeIntervalItem.getTimeKLine();
        if (timeIntervalItem.timeInterval < 360) {
            return timeKLine;
        }
        InterfaceC46557tYt interfaceC46557tYt = (InterfaceC46557tYt) C43251rlk.OLrzqt(InterfaceC46557tYt.class);
        if (interfaceC46557tYt != null && interfaceC46557tYt.EZpvd() == 2) {
            return timeKLine;
        }
        return timeKLine + "utc";
    }

    public final TimeIntervalItem OLrzqt(int i) {
        java.util.ArrayList<TimeIntervalItem> arrayListAEQbTJ;
        InterfaceC39509ptg interfaceC39509ptgDjBIcL = pFN.OLrzqt.djBIcL();
        java.lang.Object obj = null;
        if (interfaceC39509ptgDjBIcL == null || (arrayListAEQbTJ = interfaceC39509ptgDjBIcL.AEQbTJ()) == null) {
            return null;
        }
        java.util.Iterator<T> it = arrayListAEQbTJ.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            java.lang.Object next = it.next();
            if (((TimeIntervalItem) next).timeInterval == i) {
                obj = next;
                break;
            }
        }
        return (TimeIntervalItem) obj;
    }
}
