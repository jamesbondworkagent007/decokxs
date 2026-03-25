package o;

import com.okinc.core.util.SPUtils;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class pEM {
    public static final pEM AEQbTJ = new pEM();

    private pEM() {
    }

    public final java.lang.String copydefault() {
        java.lang.String string = SPUtils.getString("chart_candle_color_rise", "");
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public final void AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        SPUtils.put("chart_candle_color_rise", str);
    }

    public final java.lang.String KWHzl() {
        java.lang.String string = SPUtils.getString("chart_candle_color_down", "");
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public final void EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        SPUtils.put("chart_candle_color_down", str);
    }

    public final boolean EZpvd() {
        java.lang.Integer num = SPUtils.getInt("chart_model_rise", 0);
        return num != null && num.intValue() == 1;
    }

    public final boolean AEQbTJ() {
        java.lang.Integer num = SPUtils.getInt("chart_model_down", 0);
        return num != null && num.intValue() == 1;
    }

    public final void AEQbTJ(int i) {
        SPUtils.put("chart_model_rise", java.lang.Integer.valueOf(i));
    }

    public final void copydefault(int i) {
        SPUtils.put("chart_model_down", java.lang.Integer.valueOf(i));
    }

    public final boolean OLrzqt() {
        return SPUtils.getBoolean("bot_grid_drag_tips", true);
    }

    public final void AEQbTJ(boolean z) {
        SPUtils.put("bot_grid_drag_tips", java.lang.Boolean.valueOf(z));
    }
}
