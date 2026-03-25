package o;

import com.okinc.core.util.SPUtils;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.dRp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C13607dRp {
    public static final C13607dRp AEQbTJ = new C13607dRp();

    private C13607dRp() {
    }

    public final void AEQbTJ(boolean z) {
        SPUtils.put("hide_small_value_and_risky_transaction", java.lang.Boolean.valueOf(z), "wallet_mine_config_file");
    }

    public final boolean KWHzl() {
        return SPUtils.getBoolean("hide_small_value_and_risky_transaction", true, "wallet_mine_config_file");
    }

    public final boolean AEQbTJ() {
        return SPUtils.getBoolean("hide_low_value_asset_key", true, "wallet_mine_config_file");
    }

    public final void copydefault(boolean z) {
        SPUtils.put("hide_low_value_asset_key", java.lang.Boolean.valueOf(z), "wallet_mine_config_file");
    }

    public final java.lang.String EZpvd() {
        java.lang.String string = SPUtils.getString("low_value_tiny_threshold_key", "1", "wallet_mine_config_file");
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public final void AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        SPUtils.put("low_value_tiny_threshold_key", str, "wallet_mine_config_file");
    }
}
