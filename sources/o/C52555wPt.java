package o;

import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.Observer;
import androidx.lifecycle.TradeLiveData;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.tradingbot.impl.strategy.social.BotLeadProfitSharePresenter;
import com.okinc.tradingbot.impl.strategy.social.BotLeaderProfitShareDetailFragment$initListener$3;
import com.okinc.unify_trade.biz.BotLeadProfitProfitDetails;
import com.okinc.unify_trade.biz.BotLeadProfitProfitDetailsUser;
import com.okinc.unify_trade.bot.data.CommonEmptyData;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.C48033uCm;
import o.C55688xof;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wPt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C52555wPt extends wPB<uRO, BotLeadProfitSharePresenter> {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int OLrzqt = 8;
    public Function0<java.lang.String> AEQbTJ;
    public java.lang.String copydefault = "";
    public final C43316rmw KWHzl = new C43316rmw();

    /* JADX INFO: renamed from: o.wPt$Activity */
    public static final /* synthetic */ class Activity implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.OLrzqt = function1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean equals(java.lang.Object obj) {
            if ((obj instanceof Observer) && (obj instanceof InterfaceC56514yIe)) {
                return Intrinsics.EZpvd(getFunctionDelegate(), ((InterfaceC56514yIe) obj).getFunctionDelegate());
            }
            return false;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC56514yIe
        public final InterfaceC56388yDn<?> getFunctionDelegate() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(java.lang.Object obj) {
            this.OLrzqt.invoke(obj);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC49945uyC
    public int AEQbTJ() {
        return C48033uCm.Activity.fGQ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(Function0<java.lang.String> function0) {
        this.AEQbTJ = function0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.copydefault = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Possible override for method o.uyC.isConnected()Lcom/okinc/unify_trade/refactor/presenter/AbsPresenter; */
    /* JADX DEBUG: Possible override for method o.wPB.isConnected()V */
    public final java.lang.String isConnected() {
        return this.copydefault;
    }

    /* JADX INFO: renamed from: o.wPt$StateListAnimator */
    /* JADX INFO: loaded from: classes24.dex */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.wPt.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final C52555wPt AEQbTJ(@NotNull java.lang.String str, @NotNull Function0<java.lang.String> function0) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(function0, "");
            C52555wPt c52555wPt = new C52555wPt();
            c52555wPt.copydefault(str);
            c52555wPt.KWHzl(function0);
            return c52555wPt;
        }
    }

    @Override // o.wXX
    public void onHeaderCreated(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onHeaderCreated(wxq);
        wxq.setStyle(2);
        wxq.valueOf().setVisibility(8);
        wxq.setDividerVisibility(false);
    }

    @Override // o.wXX, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        ejfBZ();
        AuCTel();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    private final void ejfBZ() {
        ((uRO) values()).KWHzl.setLayoutManager(new LinearLayoutManager(requireContext(), 1, false));
        ((uRO) values()).KWHzl.setAdapter(this.KWHzl);
        this.KWHzl.register(CommonEmptyData.class, new C50041uzt(null, 1, 0 == true ? 1 : 0));
        this.KWHzl.register(BotLeadProfitProfitDetailsUser.class, new C51257vjc(this.AEQbTJ));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v4, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    private final void AuCTel() {
        C56109xwc<java.lang.Exception> c56109xwcAhwBna = ((BotLeadProfitSharePresenter) OLrzqt()).OLrzqt().AhwBna();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        c56109xwcAhwBna.observe(viewLifecycleOwner, new Activity(new Function1() { // from class: o.wPv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C52555wPt.KWHzl(this.EZpvd, (java.lang.Exception) obj);
            }
        }));
        TradeLiveData<java.util.List<BotLeadProfitProfitDetails>> tradeLiveDataKWHzl = ((BotLeadProfitSharePresenter) OLrzqt()).KWHzl();
        LifecycleOwner viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "");
        tradeLiveDataKWHzl.observe(viewLifecycleOwner2, new Activity(new Function1() { // from class: o.wPs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C52555wPt.copydefault(this.AEQbTJ, (java.util.List) obj);
            }
        }));
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new BotLeaderProfitShareDetailFragment$initListener$3(this, null), 3, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r12v3, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit KWHzl(C52555wPt c52555wPt, java.lang.Exception exc) {
        Intrinsics.checkNotNullParameter(exc, "");
        C49952uyJ.updateDataOrEmpty$default(c52555wPt.KWHzl, yDY.AhwBna(), C33070mpX.AYXKKw(C55688xof.Application.ActivityResultRegistryOwner), C55298xhM.dp2px$default(10.0f, null, 1, null), null, null, false, 56, null);
        RecyclerView recyclerView = ((uRO) c52555wPt.values()).KWHzl;
        ViewGroup.LayoutParams layoutParams = ((uRO) c52555wPt.values()).KWHzl.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            marginLayoutParams.bottomMargin = C55298xhM.dp2px$default(100.0f, null, 1, null);
        } else {
            marginLayoutParams = null;
        }
        recyclerView.setLayoutParams(marginLayoutParams);
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) c52555wPt, false, (java.lang.String) null, 2, (java.lang.Object) null);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v11, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r14v3, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r14v9, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit copydefault(C52555wPt c52555wPt, java.util.List list) {
        java.util.List<BotLeadProfitProfitDetailsUser> listAhwBna;
        java.util.List<BotLeadProfitProfitDetailsUser> details;
        Intrinsics.checkNotNullParameter(list, "");
        C43316rmw c43316rmw = c52555wPt.KWHzl;
        BotLeadProfitProfitDetails botLeadProfitProfitDetails = (BotLeadProfitProfitDetails) CollectionsKt___CollectionsKt.AkhnZx(list, 0);
        if (botLeadProfitProfitDetails == null || (listAhwBna = botLeadProfitProfitDetails.getDetails()) == null) {
            listAhwBna = yDY.AhwBna();
        }
        C49952uyJ.updateDataOrEmpty$default(c43316rmw, listAhwBna, C33070mpX.AYXKKw(C55688xof.Application.ActivityResultRegistryOwner), C55298xhM.dp2px$default(10.0f, null, 1, null), null, null, false, 56, null);
        BotLeadProfitProfitDetails botLeadProfitProfitDetails2 = (BotLeadProfitProfitDetails) CollectionsKt___CollectionsKt.AkhnZx(list, 0);
        if (botLeadProfitProfitDetails2 != null && (details = botLeadProfitProfitDetails2.getDetails()) != null && C33129mqd.KWHzl((java.util.Collection) details)) {
            RecyclerView recyclerView = ((uRO) c52555wPt.values()).KWHzl;
            ViewGroup.LayoutParams layoutParams = ((uRO) c52555wPt.values()).KWHzl.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
            if (marginLayoutParams != null) {
                marginLayoutParams.topMargin = C55298xhM.dp2px$default(10.0f, null, 1, null);
                marginLayoutParams.bottomMargin = C55298xhM.dp2px$default(10.0f, null, 1, null);
            } else {
                marginLayoutParams = null;
            }
            recyclerView.setLayoutParams(marginLayoutParams);
        } else {
            RecyclerView recyclerView2 = ((uRO) c52555wPt.values()).KWHzl;
            ViewGroup.LayoutParams layoutParams2 = ((uRO) c52555wPt.values()).KWHzl.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
            if (marginLayoutParams2 != null) {
                marginLayoutParams2.bottomMargin = C55298xhM.dp2px$default(100.0f, null, 1, null);
            } else {
                marginLayoutParams2 = null;
            }
            recyclerView2.setLayoutParams(marginLayoutParams2);
        }
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) c52555wPt, true, (java.lang.String) null, 2, (java.lang.Object) null);
        return Unit.INSTANCE;
    }
}
