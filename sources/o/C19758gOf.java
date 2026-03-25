package o;

import androidx.core.app.FrameMetricsAggregator;
import com.okinc.business.defi.api.model.tx.signdata.MultiTransferSignData;
import com.okinc.business.dex.trade.order.domain.model.OrderSubStatus;
import com.okinc.business.trade.features.home.ui.ConfirmOrderTag;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C23274hvD;
import o.InterfaceC30395laO;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.gOf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C19758gOf {
    public static final C19758gOf AEQbTJ = new C19758gOf();

    private C19758gOf() {
    }

    public final OrderSubStatus OLrzqt(java.lang.String str) {
        return OrderSubStatus.Companion.KWHzl(C33129mqd.AhwBna(str));
    }

    public final boolean AEQbTJ(java.lang.String str) {
        return Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) MultiTransferSignData.DEFAULT_INTERVAL) || Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "-2");
    }

    public final boolean valueOf(java.lang.String str) {
        return Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "1") || AEQbTJ(str);
    }

    public final boolean AEQbTJ(java.lang.String str, boolean z) {
        return z ? OLrzqt(str).isTerminalState() : valueOf(str);
    }

    public final boolean KWHzl(java.lang.String str, boolean z) {
        if (z) {
            return yDY.gEmmrt(OrderSubStatus.Failed, OrderSubStatus.Cancelled, OrderSubStatus.Expired).contains(OLrzqt(str));
        }
        return AEQbTJ(str);
    }

    public final boolean KWHzl(java.lang.String str) {
        return str == null || Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "11");
    }

    public final boolean copydefault(java.lang.String str, @NotNull java.lang.String str2, boolean z) {
        Intrinsics.checkNotNullParameter(str2, "");
        return KWHzl(str) && AEQbTJ(str2, z);
    }

    public final java.lang.String OLrzqt(java.lang.String str, @NotNull java.lang.String str2, boolean z) {
        Intrinsics.checkNotNullParameter(str2, "");
        return KWHzl(str2, z) ? "--" : EZpvd(str);
    }

    public final java.lang.String EZpvd(java.lang.String str) {
        if (str == null || str.length() == 0) {
            return C23272hvB.formatScientificCurrency$default(C23272hvB.KWHzl, "0", false, null, false, false, false, false, null, false, false, FrameMetricsAggregator.EVERY_DURATION, null);
        }
        return C23272hvB.formatScientificCurrency$default(C23272hvB.KWHzl, str, false, null, false, false, false, false, null, false, false, FrameMetricsAggregator.EVERY_DURATION, null);
    }

    public final java.lang.String copydefault(java.lang.String str) {
        if (str == null) {
            return null;
        }
        java.lang.String str2 = ((StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str) ^ true) && C33129mqd.AhwBna(str, 0)) ? str : null;
        if (str2 != null) {
            return C23311hvo.formatPercentWithSymbol$default(str2, false, 0, 0, null, null, 31, null);
        }
        return null;
    }

    public final C30516lcd copydefault(java.lang.String str, java.lang.String str2) {
        return new C30516lcd(C33070mpX.AYXKKw(C23274hvD.Fragment.launchdefault), EZpvd(str), ConfirmOrderTag.BOOST, InterfaceC30395laO.StateListAnimator.copydefault, null, false, copydefault(str2), InterfaceC30395laO.Application.AEQbTJ, 48, null);
    }
}
