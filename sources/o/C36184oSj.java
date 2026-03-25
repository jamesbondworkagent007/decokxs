package o;

import com.okinc.unify_trade.biz.UserTierData;
import java.math.RoundingMode;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.oSj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C36184oSj {
    public static final java.lang.String OLrzqt(@NotNull UserTierData userTierData) {
        Intrinsics.checkNotNullParameter(userTierData, "");
        return xMR.copydefault.AEQbTJ(userTierData.getMmr(), 2, RoundingMode.HALF_UP);
    }

    public static final java.lang.String AEQbTJ(@NotNull UserTierData userTierData) {
        Intrinsics.checkNotNullParameter(userTierData, "");
        return xMR.copydefault.EZpvd(userTierData.getMaxLeverage(), 2);
    }

    public static final java.lang.String copydefault(@NotNull UserTierData userTierData) {
        Intrinsics.checkNotNullParameter(userTierData, "");
        return xMR.copydefault.AEQbTJ(userTierData.getImr(), 2, RoundingMode.HALF_UP);
    }

    public static final java.lang.String EZpvd(@NotNull UserTierData userTierData) {
        Intrinsics.checkNotNullParameter(userTierData, "");
        return xMR.copydefault.copydefault(userTierData.getMaxAmount());
    }
}
