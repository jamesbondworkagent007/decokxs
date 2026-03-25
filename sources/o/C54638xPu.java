package o;

import com.okinc.tradeapi.bean.TradeGroupData;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xPu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C54638xPu {
    public static long AEQbTJ;
    public static java.util.List<TradeGroupData> KWHzl;
    public static java.util.Locale copydefault;
    public static final C54638xPu OLrzqt = new C54638xPu();
    public static final int EZpvd = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(long j) {
        AEQbTJ = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(java.util.List<TradeGroupData> list) {
        KWHzl = list;
    }

    private C54638xPu() {
    }

    public final InterfaceC58217yxC AEQbTJ(@NotNull C54452xIy c54452xIy, @NotNull java.util.Locale locale, @NotNull InterfaceC55701xos<java.util.List<TradeGroupData>> interfaceC55701xos) {
        Intrinsics.checkNotNullParameter(c54452xIy, "");
        Intrinsics.checkNotNullParameter(locale, "");
        Intrinsics.checkNotNullParameter(interfaceC55701xos, "");
        if (android.os.SystemClock.elapsedRealtime() - AEQbTJ >= 600000 || !Intrinsics.EZpvd(copydefault, locale) || !C33129mqd.KWHzl((java.util.Collection) KWHzl)) {
            copydefault = locale;
            return c54452xIy.copydefault("17", new TaskDescription(interfaceC55701xos));
        }
        java.util.List<TradeGroupData> listAhwBna = KWHzl;
        if (listAhwBna == null) {
            listAhwBna = yDY.AhwBna();
        }
        interfaceC55701xos.EZpvd(true, listAhwBna, null);
        return null;
    }

    /* JADX INFO: renamed from: o.xPu$TaskDescription */
    public static final class TaskDescription implements InterfaceC55701xos<java.util.List<? extends TradeGroupData>> {
        public final /* synthetic */ InterfaceC55701xos<java.util.List<TradeGroupData>> AEQbTJ;

        public TaskDescription(InterfaceC55701xos<java.util.List<TradeGroupData>> interfaceC55701xos) {
            this.AEQbTJ = interfaceC55701xos;
        }

        /* JADX DEBUG: Method merged with bridge method: EZpvd(ZLjava/lang/Object;Ljava/lang/Exception;)V */
        @Override // o.InterfaceC55701xos
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public void EZpvd(boolean z, java.util.List<TradeGroupData> list, java.lang.Exception exc) {
            java.util.List<TradeGroupData> listAhwBna;
            if (z && C33129mqd.KWHzl((java.util.Collection) list)) {
                C54638xPu c54638xPu = C54638xPu.OLrzqt;
                c54638xPu.EZpvd(android.os.SystemClock.elapsedRealtime());
                if (list == null || (listAhwBna = CollectionsKt___CollectionsKt.AxsJAYsNCnLh(list)) == null) {
                    listAhwBna = yDY.AhwBna();
                }
                c54638xPu.OLrzqt(listAhwBna);
            }
            this.AEQbTJ.EZpvd(z, list, exc);
        }
    }
}
