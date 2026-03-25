package o;

import com.okinc.business.invest_biz.data.bean.response.DashboardInvestmentInfo;
import com.okinc.business.invest_biz.data.contants.InvestmentKind;
import com.okinc.business.invest_biz.ui.widget.defi_dashboard.binder.UiDashboardTokenItemType;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC27286jsN;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jti, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C27360jti {
    public static final InterfaceC27286jsN OLrzqt(@NotNull AbstractC27363jtl abstractC27363jtl) {
        Intrinsics.checkNotNullParameter(abstractC27363jtl, "");
        DashboardInvestmentInfo dashboardInvestmentInfo = (DashboardInvestmentInfo) CollectionsKt___CollectionsKt.firstOrNull(abstractC27363jtl.AYXKKw());
        java.lang.Long lValueOf = dashboardInvestmentInfo != null ? java.lang.Long.valueOf(dashboardInvestmentInfo.KWHzl()) : null;
        InterfaceC9738bbJ interfaceC9738bbJOLrzqt = C23580iBq.AEQbTJ.OLrzqt();
        if (interfaceC9738bbJOLrzqt != null && interfaceC9738bbJOLrzqt.QfsBiF()) {
            return InterfaceC27286jsN.Application.KWHzl;
        }
        if (abstractC27363jtl.AYXKKw().size() > 1) {
            return new InterfaceC27286jsN.StateListAnimator(abstractC27363jtl.OLrzqt(), abstractC27363jtl.AEQbTJ(), abstractC27363jtl.KWHzl(), abstractC27363jtl.copydefault(), abstractC27363jtl.AYXKKw());
        }
        if ((lValueOf == null || lValueOf.longValue() != 0) && lValueOf != null) {
            return new InterfaceC27286jsN.ActionBar(lValueOf.longValue(), "", java.lang.Long.valueOf(abstractC27363jtl.OLrzqt()), null, java.lang.Integer.valueOf(InvestmentKind.Default.getValue()));
        }
        if (lValueOf != null && lValueOf.longValue() == 0 && abstractC27363jtl.valueOf() == UiDashboardTokenItemType.BORROW && C33129mqd.OLrzqt((java.lang.CharSequence) abstractC27363jtl.AkhnZx())) {
            return new InterfaceC27286jsN.TaskDescription(abstractC27363jtl.AkhnZx());
        }
        return new InterfaceC27286jsN.StateListAnimator(abstractC27363jtl.OLrzqt(), abstractC27363jtl.AEQbTJ(), abstractC27363jtl.KWHzl(), abstractC27363jtl.copydefault(), abstractC27363jtl.AYXKKw());
    }
}
