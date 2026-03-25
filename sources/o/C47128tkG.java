package o;

import com.okinc.okrisk.signals.p0.SyncSignal;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tkG, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C47128tkG {
    public static final C47128tkG KWHzl = new C47128tkG();

    private C47128tkG() {
    }

    public final java.lang.String copydefault(@NotNull java.util.Map<java.lang.String, java.lang.String> map) {
        Intrinsics.checkNotNullParameter(map, "");
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.util.List<SyncSignal.SignalKey> listGEmmrt = yDY.gEmmrt(SyncSignal.SignalKey.TIME_STAMP, SyncSignal.SignalKey.ANDROID_ID);
        sb.append(map.get(SyncSignal.SignalKey.TRANSACTION_ID.getKey()));
        for (SyncSignal.SignalKey signalKey : listGEmmrt) {
            if (map.get(signalKey.getKey()) != null) {
                sb.append(map.get(signalKey.getKey()));
            }
        }
        C47137tkP c47137tkP = C47137tkP.KWHzl;
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return c47137tkP.EZpvd(string);
    }
}
