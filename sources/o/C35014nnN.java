package o;

import androidx.fragment.app.FragmentResultListener;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.account.api.model.security.otp.OtpEventTracker;
import com.okinc.kline.api.bean.MarketCoinInfo;
import com.okinc.unify_trade.biz.DexInstrument;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.AbstractC55470xkZ;
import o.InterfaceC27808kEb;
import o.oKA;
import o.qZH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nnN, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C35014nnN extends AbstractC35003nnC implements InterfaceC27808kEb {
    public final /* synthetic */ kDL hDKMBd = new kDL();
    public final Function1<AbstractC55470xkZ.StateListAnimator, Unit> getNewProxyInstance = new Function1() { // from class: o.nnT
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function1
        public final java.lang.Object invoke(java.lang.Object obj) {
            return C35014nnN.KWHzl(this.AEQbTJ, (AbstractC55470xkZ.StateListAnimator) obj);
        }
    };

    /* JADX INFO: renamed from: o.nnN$Activity */
    public static final /* synthetic */ class Activity implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.AEQbTJ = function1;
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
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(java.lang.Object obj) {
            this.AEQbTJ.invoke(obj);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC27808kEb
    public void AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.hDKMBd.AEQbTJ(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC27808kEb
    public void AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.hDKMBd.AEQbTJ(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC27808kEb
    public void AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.hDKMBd.AEQbTJ(str, str2, str3, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC35003nnC, o.AbstractC34904nlJ
    public java.lang.String AkhnZx() {
        return "Home_Rank_New";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC27808kEb
    public void EZpvd(@NotNull DexInstrument dexInstrument, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(dexInstrument, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.hDKMBd.EZpvd(dexInstrument, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC27808kEb
    public void EZpvd(@NotNull java.lang.String str, java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        this.hDKMBd.EZpvd(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC27808kEb
    public void EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        this.hDKMBd.EZpvd(str, str2, str3, str4, str5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC27808kEb
    public void OLrzqt() {
        this.hDKMBd.OLrzqt();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC27808kEb
    public void OLrzqt(@NotNull DexInstrument dexInstrument, @NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(dexInstrument, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.hDKMBd.OLrzqt(dexInstrument, str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC27808kEb
    public void OLrzqt(@NotNull java.lang.String str, java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        this.hDKMBd.OLrzqt(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC27808kEb
    public void aZ_() {
        this.hDKMBd.aZ_();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC27808kEb
    public void ba_() {
        this.hDKMBd.ba_();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC27808kEb
    public void copydefault(@NotNull java.lang.String str, java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        this.hDKMBd.copydefault(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC27808kEb
    public void copydefault(@NotNull java.lang.String str, java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, java.lang.String str6, java.lang.Boolean bool) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        this.hDKMBd.copydefault(str, str2, str3, str4, str5, str6, bool);
    }

    @Override // o.AbstractC34904nlJ
    public boolean fARcdN() {
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC35003nnC
    public int zsXlph() {
        return qZH.ActionBar.invokespecialRtjmuc;
    }

    public static final Unit KWHzl(C35014nnN c35014nnN, AbstractC55470xkZ.StateListAnimator stateListAnimator) {
        oKA oka;
        Intrinsics.checkNotNullParameter(stateListAnimator, "");
        if (!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) stateListAnimator.DbNXlk())) {
            InterfaceC27808kEb interfaceC27808kEbEZpvd = C27807kEa.EZpvd(c35014nnN);
            if (interfaceC27808kEbEZpvd != null) {
                InterfaceC27808kEb.StateListAnimator.trackRankingTradingPairClick$default(interfaceC27808kEbEZpvd, OtpEventTracker.OTP_EVENT_VALUE_NEW, "spot", C33129mqd.gEmmrt(java.lang.Integer.valueOf(stateListAnimator.AEQbTJ() + 1)), stateListAnimator.copydefault(), "spot", null, null, 96, null);
            }
            MarketCoinInfo marketCoinInfo = new MarketCoinInfo(stateListAnimator.copydefault(), "SPOT", (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 28, (DefaultConstructorMarker) null);
            android.content.Context context = c35014nnN.getContext();
            if (context != null && (oka = (oKA) C43251rlk.OLrzqt(oKA.class)) != null) {
                oKA.TaskDescription.gotoNewKlinePage$default(oka, context, marketCoinInfo, null, null, null, null, null, null, c35014nnN.AkhnZx(), null, null, 1788, null);
            }
        }
        return Unit.INSTANCE;
    }

    @Override // o.AbstractC35003nnC
    public void zuBGHE() {
        wlaJM().KWHzl().observe(this, new Activity(new Function1() { // from class: o.nnM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C35014nnN.AEQbTJ(this.EZpvd, (Unit) obj);
            }
        }));
    }

    public static final Unit AEQbTJ(C35014nnN c35014nnN, Unit unit) {
        RecyclerView recyclerView;
        qZX qzxAubY = c35014nnN.AubY();
        if (qzxAubY != null && (recyclerView = qzxAubY.djBIcL) != null && recyclerView.getAdapter() == null) {
            recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
            recyclerView.setAdapter(c35014nnN.AuCTelauCTel());
        }
        C59534zip c59534zipAuCTelauCTel = c35014nnN.AuCTelauCTel();
        if (c59534zipAuCTelauCTel != null) {
            c59534zipAuCTelauCTel.notifyDataSetChanged();
        }
        return Unit.INSTANCE;
    }

    @Override // o.AbstractC35003nnC
    public C59534zip AxsJAY() {
        C59534zip c59534zip = new C59534zip();
        c59534zip.setItems(wlaJM().AhwBna());
        c59534zip.register(AbstractC55470xkZ.StateListAnimator.class, new C34948nmA(this.getNewProxyInstance, new Function0() { // from class: o.nnP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C35014nnN.copydefault(this.KWHzl);
            }
        }, this));
        return c59534zip;
    }

    @Override // o.AbstractC35003nnC
    public C59534zip copydefault() {
        C59534zip c59534zip = new C59534zip();
        c59534zip.setItems(wlaJM().EZpvd());
        c59534zip.register(AbstractC55470xkZ.ActionBar.class).copydefault(new C41673qvJ("", true, this, copydefault("spot")), new C34911nlQ(copydefault("spot"), this)).OLrzqt(new InterfaceC59526zih() { // from class: o.nnS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC59526zih
            public final java.lang.Class EZpvd(int i, java.lang.Object obj) {
                return C35014nnN.OLrzqt(i, (AbstractC55470xkZ.ActionBar) obj);
            }
        });
        c59534zip.register(AbstractC55470xkZ.Application.class, new C34985nml(this, zsXlph()));
        return c59534zip;
    }

    public static final java.lang.Class OLrzqt(int i, AbstractC55470xkZ.ActionBar actionBar) {
        Intrinsics.checkNotNullParameter(actionBar, "");
        return yDY.gEmmrt("CALL_AUCTION", "PRE_QUOTE").contains(actionBar.fARcdN()) ? C34911nlQ.class : C41673qvJ.class;
    }

    @Override // o.AbstractC34904nlJ, o.InterfaceC34987nmn
    public void copydefault(int i) {
        InterfaceC27808kEb interfaceC27808kEbEZpvd = C27807kEa.EZpvd(this);
        if (interfaceC27808kEbEZpvd != null) {
            interfaceC27808kEbEZpvd.OLrzqt(OtpEventTracker.OTP_EVENT_VALUE_NEW, "spot");
        }
        AEQbTJ(i);
    }

    private final void AEQbTJ(int i) {
        InterfaceC34987nmn interfaceC34987nmn;
        if (C27563jxZ.OLrzqt.fetchVPNInfo()) {
            android.content.Context context = getContext();
            if (context != null) {
                sZQ.EZpvd.EZpvd(context, OtpEventTracker.OTP_EVENT_VALUE_NEW);
                return;
            }
            return;
        }
        if (this instanceof C35047nnu) {
            interfaceC34987nmn = this;
        } else {
            androidx.fragment.app.Fragment parentFragment = getParentFragment();
            while (parentFragment != null && !(parentFragment instanceof C35047nnu)) {
                parentFragment = parentFragment.getParentFragment();
            }
            if (!(parentFragment instanceof C35047nnu)) {
                parentFragment = null;
            }
            interfaceC34987nmn = (C35047nnu) parentFragment;
        }
        C35047nnu c35047nnu = (C35047nnu) interfaceC34987nmn;
        java.lang.Boolean boolValueOf = c35047nnu != null ? java.lang.Boolean.valueOf(c35047nnu.AuCTelauCTel()) : null;
        android.content.Intent intent = new android.content.Intent(getContext(), (java.lang.Class<?>) ActivityC34993nmt.class);
        intent.putExtra("ranking_id", i);
        intent.putExtra("ranking_tab_key", Intrinsics.EZpvd(boolValueOf, java.lang.Boolean.TRUE) ? "RANKING_NEW_LISTINGS" : "RANKING_NEW_LISTINGS_SPOT");
        startActivity(intent);
    }

    @Override // o.AbstractC34904nlJ, o.AbstractC32998moE
    public void onVisible() {
        androidx.fragment.app.Fragment parentFragment;
        androidx.fragment.app.FragmentManager childFragmentManager;
        InterfaceC27808kEb interfaceC27808kEbEZpvd;
        super.onVisible();
        android.view.View view = getView();
        if (view != null && view.isShown() && view.isAttachedToWindow()) {
            if (view.getGlobalVisibleRect(new android.graphics.Rect()) && view.getHeight() > 0 && C33129mqd.copydefault(java.lang.Float.valueOf(r1.height() / view.getHeight()), java.lang.Float.valueOf(0.5f)) && (interfaceC27808kEbEZpvd = C27807kEa.EZpvd(this)) != null) {
                interfaceC27808kEbEZpvd.copydefault(OtpEventTracker.OTP_EVENT_VALUE_NEW, "spot");
            }
        }
        androidx.fragment.app.Fragment parentFragment2 = getParentFragment();
        if (parentFragment2 == null || (parentFragment = parentFragment2.getParentFragment()) == null || (childFragmentManager = parentFragment.getChildFragmentManager()) == null) {
            return;
        }
        childFragmentManager.setFragmentResultListener("REQUEST_CLICK_ARROW", this, new FragmentResultListener() { // from class: o.nnU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.fragment.app.FragmentResultListener
            public final void onFragmentResult(java.lang.String str, android.os.Bundle bundle) {
                C35014nnN.KWHzl(this.KWHzl, str, bundle);
            }
        });
    }

    public static final void KWHzl(C35014nnN c35014nnN, java.lang.String str, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(bundle, "");
        if (Intrinsics.EZpvd((java.lang.Object) bundle.getString("type"), (java.lang.Object) "new-coin-rank")) {
            c35014nnN.AEQbTJ(0);
        }
    }

    @Override // o.AbstractC35003nnC, o.AbstractC32998moE
    public void onInvisible() {
        androidx.fragment.app.Fragment parentFragment;
        androidx.fragment.app.FragmentManager childFragmentManager;
        super.onInvisible();
        androidx.fragment.app.Fragment parentFragment2 = getParentFragment();
        if (parentFragment2 == null || (parentFragment = parentFragment2.getParentFragment()) == null || (childFragmentManager = parentFragment.getChildFragmentManager()) == null) {
            return;
        }
        childFragmentManager.clearFragmentResultListener("REQUEST_CLICK_ARROW");
    }

    @Override // o.AbstractC35003nnC
    public void gHZMYf() {
        InterfaceC34987nmn interfaceC34987nmn;
        if (this instanceof C35047nnu) {
            interfaceC34987nmn = this;
        } else {
            androidx.fragment.app.Fragment parentFragment = getParentFragment();
            while (parentFragment != null && !(parentFragment instanceof C35047nnu)) {
                parentFragment = parentFragment.getParentFragment();
            }
            if (!(parentFragment instanceof C35047nnu)) {
                parentFragment = null;
            }
            interfaceC34987nmn = (C35047nnu) parentFragment;
        }
        C35047nnu c35047nnu = (C35047nnu) interfaceC34987nmn;
        if (c35047nnu != null) {
            c35047nnu.copydefault();
        }
    }

    public static final Unit copydefault(C35014nnN c35014nnN) {
        boolean z = c35014nnN instanceof C35047nnu;
        java.lang.Object obj = c35014nnN;
        if (!z) {
            androidx.fragment.app.Fragment parentFragment = c35014nnN.getParentFragment();
            while (parentFragment != null && !(parentFragment instanceof C35047nnu)) {
                parentFragment = parentFragment.getParentFragment();
            }
            if (!(parentFragment instanceof C35047nnu)) {
                parentFragment = null;
            }
            obj = (C35047nnu) parentFragment;
        }
        C35047nnu c35047nnu = (C35047nnu) obj;
        if (c35047nnu != null) {
            c35047nnu.AwvSrB();
        }
        return Unit.INSTANCE;
    }
}
