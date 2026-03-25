package o;

import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.lifecycle.TradeLiveData;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.core.widget.OKSlidingTabLayout;
import com.okinc.tradingbot.impl.strategy.fragment.tactics_trade.BotOrderListPresenter;
import com.okinc.unify_trade.biz.OrderPositionData;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C32113mPz;
import o.C48033uCm;
import o.C55688xof;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wJb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C52375wJb extends AbstractC54505xKx<uZW, BotOrderListPresenter> {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int KWHzl = 8;
    public OKSlidingTabLayout AYXKKw;
    public int EZpvd;
    public C33547myX OLrzqt;
    public final InterfaceC56387yDm AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.wJa
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C52375wJb.copydefault(this.EZpvd);
        }
    });
    public final int copydefault = C48033uCm.Activity.fAklCm;

    /* JADX INFO: renamed from: o.wJb$Application */
    public static final /* synthetic */ class Application implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(Function1 function1) {
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

    @Override // o.AbstractC54505xKx
    public boolean bv_() {
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return this.copydefault;
    }

    /* JADX INFO: renamed from: o.wJb$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.wJb.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public static /* synthetic */ C52375wJb newInstance$default(ActionBar actionBar, int i, java.lang.String str, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                i = 0;
            }
            return actionBar.copydefault(i, str);
        }

        public final C52375wJb copydefault(int i, @NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            C52375wJb c52375wJb = new C52375wJb();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putInt("index", i);
            bundle.putString("strategyType", str);
            c52375wJb.setArguments(bundle);
            return c52375wJb;
        }
    }

    public final C52385wJl copydefault() {
        return (C52385wJl) this.AEQbTJ.getValue();
    }

    public static final C52385wJl copydefault(C52375wJb c52375wJb) {
        FragmentActivity fragmentActivityRequireActivity = c52375wJb.requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
        androidx.fragment.app.FragmentManager childFragmentManager = c52375wJb.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        return new C52385wJl(fragmentActivityRequireActivity, childFragmentManager, c52375wJb, null, 8, null);
    }

    @Override // o.AbstractC56129xww, o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        android.os.Bundle arguments = getArguments();
        this.EZpvd = arguments != null ? arguments.getInt("index", 0) : 0;
        this.AYXKKw = (OKSlidingTabLayout) view.findViewById(C48033uCm.Application.UseExperimental);
        this.OLrzqt = (C33547myX) view.findViewById(C48033uCm.Application.mutate);
        KWHzl();
        C33547myX c33547myX = this.OLrzqt;
        OKSlidingTabLayout oKSlidingTabLayout = null;
        if (c33547myX == null) {
            Intrinsics.gEmmrt("");
            c33547myX = null;
        }
        c33547myX.setAdapter(copydefault());
        C33547myX c33547myX2 = this.OLrzqt;
        if (c33547myX2 == null) {
            Intrinsics.gEmmrt("");
            c33547myX2 = null;
        }
        c33547myX2.setOffscreenPageLimit(copydefault().getCount() - 1);
        OKSlidingTabLayout oKSlidingTabLayout2 = this.AYXKKw;
        if (oKSlidingTabLayout2 == null) {
            Intrinsics.gEmmrt("");
            oKSlidingTabLayout2 = null;
        }
        C33547myX c33547myX3 = this.OLrzqt;
        if (c33547myX3 == null) {
            Intrinsics.gEmmrt("");
            c33547myX3 = null;
        }
        oKSlidingTabLayout2.setViewPager(c33547myX3);
        if (this.EZpvd >= copydefault().getCount()) {
            this.EZpvd = 0;
        }
        OKSlidingTabLayout oKSlidingTabLayout3 = this.AYXKKw;
        if (oKSlidingTabLayout3 == null) {
            Intrinsics.gEmmrt("");
            oKSlidingTabLayout3 = null;
        }
        oKSlidingTabLayout3.setOnTabSelectListener(new TaskDescription());
        OKSlidingTabLayout oKSlidingTabLayout4 = this.AYXKKw;
        if (oKSlidingTabLayout4 == null) {
            Intrinsics.gEmmrt("");
        } else {
            oKSlidingTabLayout = oKSlidingTabLayout4;
        }
        oKSlidingTabLayout.setCurrentTab(this.EZpvd, false);
        djBIcL();
    }

    /* JADX INFO: renamed from: o.wJb$TaskDescription */
    public static final class TaskDescription implements InterfaceC33549myZ {
        @Override // o.InterfaceC33549myZ
        public void KWHzl(int i) {
        }

        public TaskDescription() {
        }

        @Override // o.InterfaceC33549myZ
        public void OLrzqt(int i) {
            C52375wJb.this.AEQbTJ();
        }
    }

    private final void djBIcL() {
        TradeLiveData<OrderPositionData> tradeLiveDataCopydefault = dxcTrN().copydefault();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        tradeLiveDataCopydefault.observe(viewLifecycleOwner, new Application(new Function1() { // from class: o.wJe
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C52375wJb.KWHzl(this.OLrzqt, (OrderPositionData) obj);
            }
        }));
    }

    public static final Unit KWHzl(C52375wJb c52375wJb, OrderPositionData orderPositionData) {
        Intrinsics.checkNotNullParameter(orderPositionData, "");
        c52375wJb.AEQbTJ(orderPositionData.getStrategyOrderTotalAmt());
        return Unit.INSTANCE;
    }

    @Override // o.AbstractC54505xKx, o.AbstractC32998moE
    public void onVisible() {
        super.onVisible();
        dxcTrN().AkhnZx();
        AEQbTJ();
    }

    public final void KWHzl() {
        android.os.Bundle arguments = getArguments();
        java.lang.String string = arguments != null ? arguments.getString("strategyType") : null;
        if (string == null || string.length() == 0 || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) string)) {
            string = "all_bot";
        }
        dxcTrN().valueOf().setBotType(string);
    }

    public final void AEQbTJ() {
        C33547myX c33547myX = this.OLrzqt;
        if (c33547myX == null) {
            Intrinsics.gEmmrt("");
            c33547myX = null;
        }
        final java.lang.String str = c33547myX.getCurrentItem() == 0 ? "pendding" : "history";
        try {
            C32866mlf.KWHzl("trade_strategy_list_type", (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.wJd
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C52375wJb.EZpvd(str, (EventParamsList) obj);
                }
            });
        } catch (java.lang.Exception unused) {
        }
    }

    public static final Unit EZpvd(java.lang.String str, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("type", str, true);
        return Unit.INSTANCE;
    }

    public final void AEQbTJ(java.lang.String str) {
        OKSlidingTabLayout oKSlidingTabLayout = this.AYXKKw;
        if (oKSlidingTabLayout == null) {
            Intrinsics.gEmmrt("");
            oKSlidingTabLayout = null;
        }
        android.view.View viewFindViewById = oKSlidingTabLayout.findViewById(C32113mPz.FragmentManager.hBpjJd);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "");
        android.widget.TextView textView = (android.widget.TextView) viewFindViewById;
        java.lang.String strCopydefault = C33129mqd.AEQbTJ(str, "0") ? xMR.copydefault.copydefault(str) : "0";
        FragmentActivity activity = getActivity();
        java.lang.String strKWHzl = activity != null ? C33069mpW.KWHzl(activity, C55688xof.Application.scanPackages, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("num", strCopydefault))) : null;
        textView.setText(C33070mpX.AYXKKw(C55688xof.Application.ActivityResultRegistryKtrememberLauncherForActivityResult1invokeinlinedonDispose1) + " " + strKWHzl);
    }
}
