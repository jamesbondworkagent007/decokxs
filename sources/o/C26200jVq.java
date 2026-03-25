package o;

import androidx.activity.result.ActivityResultCaller;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import com.okinc.business.market.common.constants.TimeIntervalType;
import com.okinc.business.market.features.filter.domain.AdvancedFilter;
import com.okinc.business.market.features.filter.ui.params.FilterConfig;
import com.okinc.business.market.features.filter.ui.params.FilterRangeFragmentParams;
import com.okinc.business.market.features.filter.ui.params.FilterRankFragmentParams;
import com.okinc.business.market.features.filter.ui.params.FilterTabFragmentParams;
import kotlin.jvm.internal.Intrinsics;
import o.C26203jVt;
import o.C26205jVv;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jVq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C26200jVq extends FragmentStateAdapter {
    public final FilterTabFragmentParams KWHzl;
    public final androidx.fragment.app.FragmentManager copydefault;

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return 2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26200jVq(@NotNull androidx.fragment.app.Fragment fragment, FilterTabFragmentParams filterTabFragmentParams) {
        super(fragment.getChildFragmentManager(), fragment.getLifecycle());
        Intrinsics.checkNotNullParameter(fragment, "");
        this.KWHzl = filterTabFragmentParams;
        androidx.fragment.app.FragmentManager childFragmentManager = fragment.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        this.copydefault = childFragmentManager;
    }

    @Override // androidx.viewpager2.adapter.FragmentStateAdapter
    public androidx.fragment.app.Fragment createFragment(int i) {
        if (i == 0) {
            C26205jVv.StateListAnimator stateListAnimator = C26205jVv.Companion;
            FilterTabFragmentParams filterTabFragmentParams = this.KWHzl;
            AdvancedFilter advancedFilterOLrzqt = filterTabFragmentParams != null ? filterTabFragmentParams.OLrzqt() : null;
            FilterTabFragmentParams filterTabFragmentParams2 = this.KWHzl;
            AdvancedFilter advancedFilterEZpvd = filterTabFragmentParams2 != null ? filterTabFragmentParams2.EZpvd() : null;
            FilterTabFragmentParams filterTabFragmentParams3 = this.KWHzl;
            return stateListAnimator.AEQbTJ(new FilterRankFragmentParams(advancedFilterOLrzqt, advancedFilterEZpvd, filterTabFragmentParams3 != null ? filterTabFragmentParams3.AhwBna() : null));
        }
        C26203jVt.ActionBar actionBar = C26203jVt.Companion;
        FilterTabFragmentParams filterTabFragmentParams4 = this.KWHzl;
        AdvancedFilter advancedFilterOLrzqt2 = filterTabFragmentParams4 != null ? filterTabFragmentParams4.OLrzqt() : null;
        FilterTabFragmentParams filterTabFragmentParams5 = this.KWHzl;
        AdvancedFilter advancedFilterEZpvd2 = filterTabFragmentParams5 != null ? filterTabFragmentParams5.EZpvd() : null;
        FilterTabFragmentParams filterTabFragmentParams6 = this.KWHzl;
        FilterConfig filterConfigKWHzl = filterTabFragmentParams6 != null ? filterTabFragmentParams6.KWHzl() : null;
        FilterTabFragmentParams filterTabFragmentParams7 = this.KWHzl;
        TimeIntervalType timeIntervalTypeAhwBna = filterTabFragmentParams7 != null ? filterTabFragmentParams7.AhwBna() : null;
        FilterTabFragmentParams filterTabFragmentParams8 = this.KWHzl;
        java.lang.String strCopydefault = filterTabFragmentParams8 != null ? filterTabFragmentParams8.copydefault() : null;
        if (strCopydefault == null) {
            strCopydefault = "";
        }
        return actionBar.AEQbTJ(new FilterRangeFragmentParams(advancedFilterOLrzqt2, advancedFilterEZpvd2, filterConfigKWHzl, timeIntervalTypeAhwBna, strCopydefault));
    }

    public final InterfaceC26193jVj OLrzqt(int i) {
        ActivityResultCaller activityResultCallerFindFragmentByTag = this.copydefault.findFragmentByTag("f" + i);
        if (activityResultCallerFindFragmentByTag instanceof InterfaceC26193jVj) {
            return (InterfaceC26193jVj) activityResultCallerFindFragmentByTag;
        }
        return null;
    }

    public final void copydefault(int i) {
        InterfaceC26193jVj interfaceC26193jVjOLrzqt = OLrzqt(i);
        if (interfaceC26193jVjOLrzqt != null) {
            interfaceC26193jVjOLrzqt.KWHzl();
        }
    }

    public final void EZpvd() {
        AdvancedFilter advancedFilterAEQbTJ;
        InterfaceC26193jVj interfaceC26193jVjOLrzqt;
        AdvancedFilter advancedFilterAEQbTJ2;
        InterfaceC26193jVj interfaceC26193jVjOLrzqt2 = OLrzqt(0);
        if (interfaceC26193jVjOLrzqt2 == null || (advancedFilterAEQbTJ = interfaceC26193jVjOLrzqt2.AEQbTJ()) == null || (interfaceC26193jVjOLrzqt = OLrzqt(1)) == null || (advancedFilterAEQbTJ2 = interfaceC26193jVjOLrzqt.AEQbTJ()) == null) {
            return;
        }
        AdvancedFilter advancedFilter = new AdvancedFilter(advancedFilterAEQbTJ2.copydefault(), advancedFilterAEQbTJ2.OLrzqt(), advancedFilterAEQbTJ2.KWHzl(), advancedFilterAEQbTJ2.iwGUEr(), advancedFilterAEQbTJ2.getNewProxyInstance(), advancedFilterAEQbTJ2.uzCIH(), advancedFilterAEQbTJ2.AwvSrB(), advancedFilterAEQbTJ2.sSMYrx(), advancedFilterAEQbTJ2.AxsJAY(), advancedFilterAEQbTJ2.zLjUOn(), advancedFilterAEQbTJ2.zsXlph(), advancedFilterAEQbTJ2.getFieldNames(), advancedFilterAEQbTJ2.wlaJM(), advancedFilterAEQbTJ2.AubY(), advancedFilterAEQbTJ2.AuCTelauCTel(), advancedFilterAEQbTJ2.AkhnZx(), advancedFilterAEQbTJ2.DbNXlk(), advancedFilterAEQbTJ2.valueOf(), advancedFilterAEQbTJ2.gEmmrt(), advancedFilterAEQbTJ2.values(), advancedFilterAEQbTJ2.djBIcL(), advancedFilterAEQbTJ2.hDKMBd(), advancedFilterAEQbTJ2.fIwbmz(), advancedFilterAEQbTJ2.AuCTel(), advancedFilterAEQbTJ2.fARcdN(), advancedFilterAEQbTJ2.ejfBZ(), advancedFilterAEQbTJ2.AhwBna(), advancedFilterAEQbTJ2.AYXKKw(), advancedFilterAEQbTJ.EZpvd(), advancedFilterAEQbTJ.isConnected(), advancedFilterAEQbTJ2.fetchVPNInfo(), advancedFilterAEQbTJ2.fJNWhG(), advancedFilterAEQbTJ2.AEQbTJ(), false, 0, 2, null);
        jUD jud = jUD.copydefault;
        FilterTabFragmentParams filterTabFragmentParams = this.KWHzl;
        java.lang.String strCopydefault = filterTabFragmentParams != null ? filterTabFragmentParams.copydefault() : null;
        if (strCopydefault == null) {
            strCopydefault = "";
        }
        jud.KWHzl(strCopydefault, advancedFilter);
    }
}
