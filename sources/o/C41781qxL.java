package o;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.okinc.market.time.filter.PeriodEnum;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qxL, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C41781qxL {
    public static final C41781qxL OLrzqt = new C41781qxL();

    private C41781qxL() {
    }

    public static /* synthetic */ java.util.Map buildRankParams$default(C41781qxL c41781qxL, java.lang.String str, java.lang.String str2, java.lang.String str3, PeriodEnum periodEnum, int i, int i2, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            str = null;
        }
        java.lang.String str4 = str;
        if ((i3 & 16) != 0) {
            i = 350;
        }
        int i4 = i;
        if ((i3 & 32) != 0) {
            i2 = 0;
        }
        return c41781qxL.KWHzl(str4, str2, str3, periodEnum, i4, i2);
    }

    public final java.util.Map<java.lang.String, java.lang.String> KWHzl(java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull PeriodEnum periodEnum, int i, int i2) {
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(periodEnum, "");
        java.util.Map mapOLrzqt = C56423yEv.OLrzqt();
        if (str != null) {
        }
        mapOLrzqt.put("type", str2);
        mapOLrzqt.put("num", java.lang.String.valueOf(i));
        mapOLrzqt.put("rank", java.lang.String.valueOf(i2));
        mapOLrzqt.put("zone", str3);
        if (periodEnum != PeriodEnum.RANKING_PERIOD_1D) {
            mapOLrzqt.put(TypedValues.CycleType.S_WAVE_PERIOD, periodEnum.getInputPara());
        }
        return C56423yEv.AYXKKw(mapOLrzqt);
    }
}
