package o;

import androidx.core.graphics.Insets;
import com.okinc.tradingbot.impl.share.ShareChartDataPoint;
import com.okinc.uilab.okinteractivelinechart.OKVerticalSeparatorView;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import o.C55159xeg;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wqQ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C53697wqQ {
    public static final C53697wqQ copydefault = new C53697wqQ();

    private C53697wqQ() {
    }

    public final void copydefault(@NotNull C55159xeg c55159xeg, @NotNull C55159xeg.ActionBar<ShareChartDataPoint> actionBar, boolean z, Insets insets, java.lang.Float f, java.lang.Float f2, @androidx.annotation.ColorInt int i, @androidx.annotation.ColorInt int i2, java.lang.Float f3, java.lang.Float f4, C55159xeg.StateListAnimator stateListAnimator, C55159xeg.StateListAnimator stateListAnimator2, OKVerticalSeparatorView.LineStyle lineStyle) {
        Intrinsics.checkNotNullParameter(c55159xeg, "");
        Intrinsics.checkNotNullParameter(actionBar, "");
        c55159xeg.setAdapter(actionBar);
        android.content.Context context = c55159xeg.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        c55159xeg.setConfig(new C55098xdY(context, new C55159xeg.Application(i, i2, 0, 0, 0, 0, 0), f, f2, null, insets, stateListAnimator2, null, f4, stateListAnimator, f3, null, java.lang.Boolean.FALSE, lineStyle, z ? new C55159xeg.TaskDescription(i, i2, C55298xhM.dp2px$default(1.0f, null, 1, null), C55298xhM.dp2px$default(1.0f, null, 1, null)) : null, java.lang.Boolean.valueOf(z), 2192, null).KWHzl());
    }

    public final kotlin.Pair<java.lang.Integer, java.lang.Integer> copydefault(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        C33512mxp c33512mxp = C33512mxp.AEQbTJ;
        android.content.Context contextKWHzl = C55374xij.KWHzl(context, 32, c33512mxp.isConnected() == 0 ? C52761wXj.LoaderManager.DXXBbs : C52761wXj.LoaderManager.ODWQjV);
        return new kotlin.Pair<>(java.lang.Integer.valueOf(C33512mxp.tradeRiseGraph$default(c33512mxp, contextKWHzl, 0.0f, 2, null)), java.lang.Integer.valueOf(C33512mxp.tradeFallGraph$default(c33512mxp, contextKWHzl, 0.0f, 2, null)));
    }
}
