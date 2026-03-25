package o;

import android.view.ViewGroup;
import androidx.viewpager2.widget.ViewPager2;
import com.okinc.market.search.features.navigation.selection.ui.model.SelectionNavSearchSubPage;
import com.okinc.unify_trade.biz.BizInstrument;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qSf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C40340qSf extends AbstractC40336qSb {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int OLrzqt = 8;
    public final /* synthetic */ C40344qSj AEQbTJ = new C40344qSj();
    public final int KWHzl;
    public Function2<? super java.lang.String, ? super java.lang.String, Unit> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC40285qQe
    public int EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(@NotNull Function2<? super java.lang.String, ? super java.lang.String, Unit> function2) {
        Intrinsics.checkNotNullParameter(function2, "");
        this.copydefault = function2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC40285qQe
    public void OLrzqt(@NotNull androidx.fragment.app.Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "");
        this.AEQbTJ.KWHzl(fragment);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC40285qQe
    public void copydefault(java.lang.String str) {
        this.AEQbTJ.KWHzl(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC40285qQe
    public void copydefault(@NotNull java.util.Set<? extends BizInstrument> set) {
        Intrinsics.checkNotNullParameter(set, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC40285qQe
    public <T extends InterfaceC40518qYv> void copydefault(@NotNull T t, @NotNull InterfaceC49363unD interfaceC49363unD, @NotNull Function2<? super T, ? super java.lang.Integer, Unit> function2) {
        Intrinsics.checkNotNullParameter(t, "");
        Intrinsics.checkNotNullParameter(interfaceC49363unD, "");
        Intrinsics.checkNotNullParameter(function2, "");
        this.AEQbTJ.EZpvd(t, interfaceC49363unD, function2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC40285qQe
    public void djBIcL() {
        this.AEQbTJ.KWHzl();
    }

    /* JADX INFO: renamed from: o.qSf$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.qSf.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final C40340qSf copydefault(@NotNull java.util.List<java.lang.String> list) {
            Intrinsics.checkNotNullParameter(list, "");
            return (C40340qSf) jSA.EZpvd(new C40340qSf(), C56390yDp.OLrzqt("key.voucher_instrument_id_list", list.toArray(new java.lang.String[0])));
        }
    }

    @Override // o.AbstractC40285qQe
    public void KWHzl(@NotNull android.widget.FrameLayout frameLayout) {
        Intrinsics.checkNotNullParameter(frameLayout, "");
        super.OLrzqt(frameLayout);
    }

    @Override // o.AbstractC40285qQe
    public void EZpvd(@NotNull android.widget.FrameLayout frameLayout) {
        ViewPager2 viewPager2;
        C55254xgV c55254xgV;
        Intrinsics.checkNotNullParameter(frameLayout, "");
        C42821rde c42821rdeFetchVPNInfo = fetchVPNInfo();
        if (c42821rdeFetchVPNInfo != null && (c55254xgV = c42821rdeFetchVPNInfo.copydefault) != null) {
            c55254xgV.setVisibility(8);
        }
        C42821rde c42821rdeFetchVPNInfo2 = fetchVPNInfo();
        if (c42821rdeFetchVPNInfo2 == null || (viewPager2 = c42821rdeFetchVPNInfo2.valueOf) == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = viewPager2.getLayoutParams();
        if (layoutParams != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.topMargin = 20;
            viewPager2.setLayoutParams(marginLayoutParams);
            return;
        }
        throw new java.lang.NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
    }

    @Override // o.AbstractC40285qQe
    public void AEQbTJ(kotlin.Pair<? extends BizInstrument, java.lang.Long> pair) {
        BizInstrument first;
        super.AEQbTJ(pair);
        if (pair == null || (first = pair.getFirst()) == null) {
            return;
        }
        Function2<? super java.lang.String, ? super java.lang.String, Unit> function2 = this.copydefault;
        if (function2 != null) {
            function2.invoke(first.getInstId(), first.getInstType());
        }
        dismissAllowingStateLoss();
    }

    @Override // o.AbstractC40285qQe
    public java.util.List<SelectionNavSearchSubPage> values() {
        return C56402yEa.EZpvd(SelectionNavSearchSubPage.FUTURES_VOUCHER);
    }
}
