package o;

import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.fragment.app.FragmentResultListener;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.lifecycle.TradeLiveData;
import com.okinc.liveness.lca.EopTrackEvent;
import com.okinc.tradingbot.impl.strategy.viewmodel.BotStopActionPresenter;
import com.okinc.unify_trade.biz.GridStopInfoDto;
import com.okinc.unify_trade.biz.PlaceOrderCondition;
import com.okinc.unify_trade.biz.SlippageControl;
import com.okinc.unify_trade.biz.StopAmtInfo;
import com.okinc.unify_trade.biz.StrategyConfigInfo;
import com.okinc.unify_trade.biz.StrategyStopReq;
import com.okinc.unify_trade.biz.StrategyStopResponse;
import java.math.RoundingMode;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C48033uCm;
import o.C52761wXj;
import o.C55688xof;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wtr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C53883wtr extends AbstractC53912wuT<AbstractC48455uSa, BotStopActionPresenter> {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int OLrzqt = 8;
    public boolean AhwBna;
    public Function0<Unit> DbNXlk;
    public final int fetchVPNInfo = C48033uCm.Activity.geLlBI;
    public java.lang.String copydefault = "";
    public java.lang.String djBIcL = "";
    public java.lang.String gEmmrt = "";
    public java.lang.String AEQbTJ = "";
    public java.lang.String valueOf = "1";
    public java.lang.String KWHzl = "";
    public java.lang.String AYXKKw = "";

    /* JADX INFO: renamed from: o.wtr$ActionBar */
    public static final /* synthetic */ class ActionBar implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.copydefault = function1;
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
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(java.lang.Object obj) {
            this.copydefault.invoke(obj);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC49945uyC
    public int AEQbTJ() {
        return this.fetchVPNInfo;
    }

    @Override // o.wXX
    public boolean getHasFooter() {
        return true;
    }

    /* JADX INFO: renamed from: o.wtr$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.wtr.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final C53883wtr AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, @NotNull java.lang.String str6, boolean z, @NotNull Function0<Unit> function0) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            Intrinsics.checkNotNullParameter(str5, "");
            Intrinsics.checkNotNullParameter(str6, "");
            Intrinsics.checkNotNullParameter(function0, "");
            C53883wtr c53883wtr = new C53883wtr();
            c53883wtr.valueOf = str5;
            c53883wtr.copydefault = str;
            c53883wtr.djBIcL = str2;
            c53883wtr.gEmmrt = str3;
            c53883wtr.AEQbTJ = str4;
            c53883wtr.AhwBna = z;
            c53883wtr.AYXKKw = str6;
            c53883wtr.DbNXlk = function0;
            return c53883wtr;
        }
    }

    @Override // o.wXX, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        getFieldNames();
        isConnected();
        uzCIH();
        fIwbmz();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    private final void getFieldNames() {
        if (this.AhwBna) {
            LinearLayoutCompat linearLayoutCompat = ((AbstractC48455uSa) values()).EZpvd;
            Intrinsics.checkNotNullExpressionValue(linearLayoutCompat, "");
            linearLayoutCompat.setVisibility(8);
        }
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.setStyle(1);
        wxq.setTitle(C33069mpW.OLrzqt(C33070mpX.AYXKKw(C55688xof.Application.unregisterOnBackInvokedCallback), C56423yEv.EZpvd(C56390yDp.OLrzqt("botName", C56033xvF.iwGUEr(this.copydefault)))));
        android.widget.TextView textViewAYXKKw = wxq.AYXKKw();
        android.content.Context context = wxq.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        textViewAYXKKw.setPaddingRelative(0, 0, C55298xhM.OLrzqt(38, context), 0);
        wxq.KWHzl().setVisibility(0);
        wxq.AEQbTJ().setVisibility(8);
        wxq.setDividerVisibility(false);
        android.widget.ImageView imageViewKWHzl = wxq.KWHzl();
        imageViewKWHzl.setOnClickListener(new Activity(imageViewKWHzl, 1000L, this));
    }

    @Override // o.wXX
    public void onFooterCreated(@NotNull wYF wyf) {
        Intrinsics.checkNotNullParameter(wyf, "");
        super.onFooterCreated(wyf);
        wyf.setType(5);
        wyf.setPrimaryText(C33070mpX.AYXKKw(C48033uCm.Fragment.hrNTAI));
        wyf.setOKDSSize(44);
        wyf.setOnClickListener(new StateListAnimator(wyf, 1000L, this));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v5, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r3v3, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: Binding */
    /* JADX DEBUG: Possible override for method o.uyC.isConnected()Lcom/okinc/unify_trade/refactor/presenter/AbsPresenter; */
    /* JADX WARN: Multi-variable type inference failed */
    public final void isConnected() {
        xOR xorCopydefault;
        if (Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) "contract_grid")) {
            InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
            boolean z = (interfaceC54581xNrOLrzqt == null || (xorCopydefault = interfaceC54581xNrOLrzqt.copydefault()) == null || xorCopydefault.AYXKKw()) ? false : true;
            android.view.View view = ((AbstractC48455uSa) values()).fetchVPNInfo;
            Intrinsics.checkNotNullExpressionValue(view, "");
            boolean z2 = !z;
            view.setVisibility(z2 ? 8 : 0);
            C53573wnz c53573wnz = ((AbstractC48455uSa) values()).valueOf;
            Intrinsics.checkNotNullExpressionValue(c53573wnz, "");
            c53573wnz.setVisibility(z2 ? 8 : 0);
            return;
        }
        android.view.View view2 = ((AbstractC48455uSa) values()).fetchVPNInfo;
        Intrinsics.checkNotNullExpressionValue(view2, "");
        view2.setVisibility(8);
        C53573wnz c53573wnz2 = ((AbstractC48455uSa) values()).valueOf;
        Intrinsics.checkNotNullExpressionValue(c53573wnz2, "");
        c53573wnz2.setVisibility(8);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v4, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0075  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void fJNWhG() {
        StrategyConfigInfo strategyConfigInfoAEQbTJ;
        SlippageControl slippageControl;
        java.lang.String bidSlippage;
        C53573wnz c53573wnz = ((AbstractC48455uSa) values()).valueOf;
        Intrinsics.copydefault(c53573wnz);
        if (c53573wnz.getVisibility() != 0 || (strategyConfigInfoAEQbTJ = ((BotStopActionPresenter) OLrzqt()).AEQbTJ()) == null || (slippageControl = strategyConfigInfoAEQbTJ.getSlippageControl()) == null) {
            return;
        }
        java.lang.String str = this.AYXKKw;
        int iHashCode = str.hashCode();
        if (iHashCode != 3327612) {
            if (iHashCode != 109413500) {
                if (iHashCode == 1844321735 && str.equals("neutral")) {
                    java.lang.String bidSlippage2 = slippageControl.getBidSlippage();
                    bidSlippage = bidSlippage2 != null ? C33129mqd.EZpvd(bidSlippage2, slippageControl.getAskSlippage()) : null;
                } else {
                    bidSlippage = "";
                }
            } else if (str.equals("short")) {
                bidSlippage = slippageControl.getAskSlippage();
                if (bidSlippage == null) {
                }
            }
        } else if (str.equals("long")) {
            bidSlippage = slippageControl.getBidSlippage();
            if (bidSlippage == null) {
            }
        }
        this.KWHzl = bidSlippage == null ? "" : bidSlippage;
        refreshSlippageControl$default(this, xMR.copydefault.EZpvd(bidSlippage != null ? bidSlippage : "", 4, 0, RoundingMode.FLOOR), false, 2, null);
    }

    /* JADX INFO: renamed from: o.wtr$Activity */
    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ C53883wtr AEQbTJ;
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ long OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, C53883wtr c53883wtr) {
            this.EZpvd = view;
            this.OLrzqt = j;
            this.AEQbTJ = c53883wtr;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.OLrzqt || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                this.AEQbTJ.dismissAllowingStateLoss();
            }
        }
    }

    /* JADX INFO: renamed from: o.wtr$StateListAnimator */
    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ C53883wtr EZpvd;
        public final /* synthetic */ android.view.View OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, C53883wtr c53883wtr) {
            this.OLrzqt = view;
            this.AEQbTJ = j;
            this.EZpvd = c53883wtr;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r11v7, resolved type: Presenter */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.AEQbTJ || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                C49402unq.copydefault((wYF) this.OLrzqt, "GRID_BOT_STOP", C56424yEw.gEmmrt(C56390yDp.OLrzqt("botType", this.EZpvd.copydefault), C56390yDp.OLrzqt("stopType", this.EZpvd.valueOf)), new java.lang.Class[0]);
                ((BotStopActionPresenter) this.EZpvd.OLrzqt()).copydefault(new StrategyStopReq(this.EZpvd.AEQbTJ, this.EZpvd.djBIcL, this.EZpvd.copydefault, this.EZpvd.valueOf, (PlaceOrderCondition) null, this.EZpvd.KWHzl, 16, (DefaultConstructorMarker) null));
            }
        }
    }

    public static /* synthetic */ void refreshSlippageControl$default(C53883wtr c53883wtr, java.lang.String str, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            z = true;
        }
        c53883wtr.AEQbTJ(str, z);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v1, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public final void AEQbTJ(java.lang.String str, boolean z) {
        java.lang.String strValueOf;
        if (z) {
            int i = C48033uCm.Fragment.DzOuPm;
            if (str == null) {
                str = "";
            }
            strValueOf = C33069mpW.copydefault(i, C56423yEv.EZpvd(C56390yDp.OLrzqt("slippagePct", str)));
        } else {
            strValueOf = java.lang.String.valueOf(str);
        }
        ((AbstractC48455uSa) values()).valueOf.setActiveContent(strValueOf);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v8, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    private final void fIwbmz() {
        ((AbstractC48455uSa) values()).OLrzqt.setOnClickListener(new View.OnClickListener() { // from class: o.wtw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C53883wtr.KWHzl(this.EZpvd, view);
            }
        });
        ((AbstractC48455uSa) values()).EZpvd.setOnClickListener(new View.OnClickListener() { // from class: o.wtz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C53883wtr.djBIcL(this.AEQbTJ, view);
            }
        });
        if (Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) "contract_grid")) {
            ((AbstractC48455uSa) values()).valueOf.setOnClickListener(new View.OnClickListener() { // from class: o.wty
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C53883wtr.AEQbTJ(this.EZpvd, view);
                }
            });
            getParentFragmentManager().setFragmentResultListener("slippage_control_settings", this, new FragmentResultListener() { // from class: o.wtA
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // androidx.fragment.app.FragmentResultListener
                public final void onFragmentResult(java.lang.String str, android.os.Bundle bundle) {
                    C53883wtr.KWHzl(this.OLrzqt, str, bundle);
                }
            });
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v2, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void KWHzl(C53883wtr c53883wtr, android.view.View view) {
        c53883wtr.valueOf = "1";
        java.util.List<GridStopInfoDto> value = ((BotStopActionPresenter) c53883wtr.OLrzqt()).OLrzqt().getValue();
        if (value != null) {
            c53883wtr.AEQbTJ(value);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v2, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void djBIcL(C53883wtr c53883wtr, android.view.View view) {
        c53883wtr.valueOf = "2";
        java.util.List<GridStopInfoDto> value = ((BotStopActionPresenter) c53883wtr.OLrzqt()).OLrzqt().getValue();
        if (value != null) {
            c53883wtr.AEQbTJ(value);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r15v1, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void AEQbTJ(C53883wtr c53883wtr, android.view.View view) {
        C50308vJp.Companion.AEQbTJ((1600 & 1) != 0 ? false : false, (1600 & 2) != 0 ? "" : EopTrackEvent.CLOSE, (1600 & 4) != 0 ? null : "", (1600 & 8) != 0 ? "" : c53883wtr.djBIcL, (1600 & 16) != 0 ? "" : c53883wtr.gEmmrt, (1600 & 32) != 0 ? "" : c53883wtr.AYXKKw, (1600 & 64) == 0 ? null : "", (1600 & 128) != 0 ? null : c53883wtr.KWHzl, (1600 & 256) != 0 ? null : ((BotStopActionPresenter) c53883wtr.OLrzqt()).AEQbTJ(), (1600 & 512) != 0 ? null : null, (1600 & 1024) == 0 ? null : null).show(c53883wtr.getParentFragmentManager(), C50308vJp.class.getSimpleName());
    }

    public static final void KWHzl(C53883wtr c53883wtr, java.lang.String str, android.os.Bundle bundle) {
        java.lang.String strAYXKKw;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(bundle, "");
        java.lang.String string = bundle.getString("slippage_ratio_params");
        c53883wtr.KWHzl = string != null ? string : "";
        if (string == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) string)) {
            strAYXKKw = C33070mpX.AYXKKw(C48033uCm.Fragment.zlzhuY);
        } else {
            strAYXKKw = java.lang.String.valueOf(xMR.copydefault.EZpvd(string, 4, 0, RoundingMode.FLOOR));
        }
        c53883wtr.AEQbTJ(strAYXKKw, false);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v13, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v17, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v21, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v23, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v5, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v8, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00bc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void uzCIH() {
        if (Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) "contract_grid")) {
            TradeLiveData<StrategyConfigInfo> tradeLiveDataKWHzl = ((BotStopActionPresenter) OLrzqt()).KWHzl();
            LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
            Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
            tradeLiveDataKWHzl.observe(viewLifecycleOwner, new ActionBar(new Function1() { // from class: o.wtv
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C53883wtr.OLrzqt(this.KWHzl, (StrategyConfigInfo) obj);
                }
            }));
        }
        ((BotStopActionPresenter) OLrzqt()).getAggregateErrorLiveData().observe(getViewLifecycleOwner(), new ActionBar(new Function1() { // from class: o.wtu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C53883wtr.OLrzqt(this.OLrzqt, (androidx.core.util.Pair) obj);
            }
        }));
        TradeLiveData<java.util.List<StrategyStopResponse>> tradeLiveDataEZpvd = ((BotStopActionPresenter) OLrzqt()).EZpvd();
        LifecycleOwner viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "");
        tradeLiveDataEZpvd.observe(viewLifecycleOwner2, new ActionBar(new Function1() { // from class: o.wts
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C53883wtr.OLrzqt(this.EZpvd, (java.util.List) obj);
            }
        }));
        TradeLiveData<java.util.List<GridStopInfoDto>> tradeLiveDataOLrzqt = ((BotStopActionPresenter) OLrzqt()).OLrzqt();
        LifecycleOwner viewLifecycleOwner3 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner3, "");
        tradeLiveDataOLrzqt.observe(viewLifecycleOwner3, new ActionBar(new Function1() { // from class: o.wtx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C53883wtr.copydefault(this.AEQbTJ, (java.util.List) obj);
            }
        }));
        java.lang.String str = this.copydefault;
        int iHashCode = str.hashCode();
        if (iHashCode != -1831183611) {
            if (iHashCode != -1402017003) {
                if (iHashCode == -512749997 && str.equals("contract_grid")) {
                    ((BotStopActionPresenter) OLrzqt()).KWHzl(this.AEQbTJ);
                }
            } else if (str.equals("contract_dca")) {
                ((BotStopActionPresenter) OLrzqt()).EZpvd(this.AEQbTJ);
            }
        } else if (str.equals("spot_dca")) {
        }
        if (Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) "contract_grid")) {
            ((BotStopActionPresenter) OLrzqt()).OLrzqt(this.djBIcL);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit OLrzqt(C53883wtr c53883wtr, StrategyConfigInfo strategyConfigInfo) {
        Intrinsics.checkNotNullParameter(strategyConfigInfo, "");
        ((BotStopActionPresenter) c53883wtr.OLrzqt()).copydefault(strategyConfigInfo);
        c53883wtr.fJNWhG();
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r3v1, resolved type: S */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit OLrzqt(C53883wtr c53883wtr, androidx.core.util.Pair pair) {
        if (((BotStopActionPresenter) c53883wtr.OLrzqt()).copydefault().contains(pair.first)) {
            rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) c53883wtr, false, (java.lang.String) null, 2, (java.lang.Object) null);
        }
        java.lang.String message = ((java.lang.Exception) pair.second).getMessage();
        if (message != null) {
            C55326xho.toastWithFailedIcon$default(message, 0, 1, (java.lang.Object) null);
        }
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(C53883wtr c53883wtr, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        Function0<Unit> function0 = c53883wtr.DbNXlk;
        if (function0 != null) {
            function0.invoke();
        }
        c53883wtr.dismissAllowingStateLoss();
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(C53883wtr c53883wtr, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        c53883wtr.AEQbTJ((java.util.List<GridStopInfoDto>) list);
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) c53883wtr, true, (java.lang.String) null, 2, (java.lang.Object) null);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r5v3, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    private final void AEQbTJ(java.util.List<GridStopInfoDto> list) {
        java.lang.Object next;
        java.lang.Object next2;
        java.lang.String strAYXKKw;
        java.lang.String ccy;
        java.lang.String ccy2;
        java.lang.String ccy3;
        java.lang.String amount;
        java.lang.String ccy4;
        java.lang.String amount2;
        java.lang.String ccy5;
        java.util.List<StopAmtInfo> sellCoinAmount;
        StopAmtInfo stopAmtInfo;
        java.lang.String ccy6;
        java.lang.String ccy7;
        java.lang.String ccy8;
        java.lang.String amount3;
        java.lang.String ccy9;
        java.lang.String amount4;
        java.lang.String ccy10;
        java.lang.String ccy11;
        java.lang.String amount5;
        java.lang.String ccy12;
        java.lang.String ccy13;
        java.lang.String ccy14;
        java.lang.String amount6;
        java.lang.String amount7;
        java.lang.String amount8;
        java.lang.String strAYXKKw2;
        java.util.Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (Intrinsics.EZpvd((java.lang.Object) ((GridStopInfoDto) next).getStopType(), (java.lang.Object) "1")) {
                    break;
                }
            }
        }
        java.util.Iterator<T> it2 = list.iterator();
        while (true) {
            if (!it2.hasNext()) {
                next2 = null;
                break;
            } else {
                next2 = it2.next();
                if (Intrinsics.EZpvd((java.lang.Object) ((GridStopInfoDto) next2).getStopType(), (java.lang.Object) "2")) {
                    break;
                }
            }
        }
        kotlin.Pair pairOLrzqt = C56390yDp.OLrzqt(next, next2);
        GridStopInfoDto gridStopInfoDto = (GridStopInfoDto) pairOLrzqt.component1();
        GridStopInfoDto gridStopInfoDto2 = (GridStopInfoDto) pairOLrzqt.component2();
        AbstractC48455uSa abstractC48455uSa = (AbstractC48455uSa) values();
        if (Intrinsics.EZpvd((java.lang.Object) this.valueOf, (java.lang.Object) "1")) {
            abstractC48455uSa.OLrzqt.setSelected(true);
            abstractC48455uSa.EZpvd.setSelected(false);
            AppCompatTextView appCompatTextView = abstractC48455uSa.AEQbTJ;
            if (Intrinsics.EZpvd((java.lang.Object) "spot_dca", (java.lang.Object) this.copydefault)) {
                strAYXKKw2 = C33070mpX.AYXKKw(C48033uCm.Fragment.QYvkLl);
            } else {
                strAYXKKw2 = C33070mpX.AYXKKw(C55688xof.Application.reportWhenCompleteforInline);
            }
            appCompatTextView.setText(strAYXKKw2);
            abstractC48455uSa.AEQbTJ.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.QwvEab));
        } else {
            abstractC48455uSa.OLrzqt.setSelected(false);
            abstractC48455uSa.EZpvd.setSelected(true);
            AppCompatTextView appCompatTextView2 = abstractC48455uSa.AEQbTJ;
            if (Intrinsics.EZpvd((java.lang.Object) "spot_dca", (java.lang.Object) this.copydefault)) {
                strAYXKKw = C33070mpX.AYXKKw(C55688xof.Application.IMediaControllerCallbackStubProxy);
            } else {
                strAYXKKw = C33070mpX.AYXKKw(C55688xof.Application.invokeSuspend);
            }
            appCompatTextView2.setText(strAYXKKw);
            abstractC48455uSa.AEQbTJ.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.gdmIOq));
        }
        java.lang.String str = this.copydefault;
        int iHashCode = str.hashCode();
        java.lang.String str2 = "";
        if (iHashCode != -1831183611) {
            if (iHashCode != -1402017003) {
                if (iHashCode != -512749997 || !str.equals("contract_grid")) {
                    return;
                }
            } else if (!str.equals("contract_dca")) {
                return;
            }
            if (gridStopInfoDto != null) {
                AppCompatTextView appCompatTextView3 = abstractC48455uSa.KWHzl;
                java.lang.String str3 = this.djBIcL;
                java.lang.String str4 = this.gEmmrt;
                StopAmtInfo curTotalPnL = gridStopInfoDto.getCurTotalPnL();
                java.lang.String botPnl$default = C56033xvF.getBotPnl$default(str3, str4, (curTotalPnL == null || (amount8 = curTotalPnL.getAmount()) == null) ? "" : amount8, null, false, true, null, false, null, null, null, 2008, null);
                StopAmtInfo curTotalPnL2 = gridStopInfoDto.getCurTotalPnL();
                if (curTotalPnL2 == null || (ccy12 = curTotalPnL2.getCcy()) == null) {
                    ccy12 = "";
                }
                appCompatTextView3.setText(botPnl$default + " " + ccy12);
                AppCompatTextView appCompatTextView4 = abstractC48455uSa.KWHzl;
                StopAmtInfo curTotalPnL3 = gridStopInfoDto.getCurTotalPnL();
                appCompatTextView4.setTextColor(C56033xvF.OLrzqt((java.lang.Object) (curTotalPnL3 != null ? curTotalPnL3.getAmount() : null)));
                AppCompatTextView appCompatTextView5 = abstractC48455uSa.isConnected;
                java.lang.String str5 = this.djBIcL;
                java.lang.String str6 = this.gEmmrt;
                StopAmtInfo estFeeForClose = gridStopInfoDto.getEstFeeForClose();
                java.lang.String botPnl$default2 = C56033xvF.getBotPnl$default(str5, str6, (estFeeForClose == null || (amount7 = estFeeForClose.getAmount()) == null) ? "" : amount7, null, false, true, null, false, null, null, null, 2008, null);
                StopAmtInfo estFeeForClose2 = gridStopInfoDto.getEstFeeForClose();
                if (estFeeForClose2 == null || (ccy13 = estFeeForClose2.getCcy()) == null) {
                    ccy13 = "";
                }
                appCompatTextView5.setText(botPnl$default2 + " " + ccy13);
                abstractC48455uSa.isConnected.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.fdOvFl));
                AppCompatTextView appCompatTextView6 = abstractC48455uSa.djBIcL;
                java.lang.String str7 = this.djBIcL;
                java.lang.String str8 = this.gEmmrt;
                StopAmtInfo estTotalPnLAfterClose = gridStopInfoDto.getEstTotalPnLAfterClose();
                java.lang.String botPnl$default3 = C56033xvF.getBotPnl$default(str7, str8, (estTotalPnLAfterClose == null || (amount6 = estTotalPnLAfterClose.getAmount()) == null) ? "" : amount6, null, false, true, null, false, null, null, null, 2008, null);
                StopAmtInfo estTotalPnLAfterClose2 = gridStopInfoDto.getEstTotalPnLAfterClose();
                if (estTotalPnLAfterClose2 == null || (ccy14 = estTotalPnLAfterClose2.getCcy()) == null) {
                    ccy14 = "";
                }
                appCompatTextView6.setText(botPnl$default3 + " " + ccy14);
                AppCompatTextView appCompatTextView7 = abstractC48455uSa.djBIcL;
                StopAmtInfo estTotalPnLAfterClose3 = gridStopInfoDto.getEstTotalPnLAfterClose();
                appCompatTextView7.setTextColor(C56033xvF.OLrzqt((java.lang.Object) (estTotalPnLAfterClose3 != null ? estTotalPnLAfterClose3.getAmount() : null)));
            }
            if (gridStopInfoDto2 != null) {
                AppCompatTextView appCompatTextView8 = abstractC48455uSa.copydefault;
                java.lang.String strAYXKKw3 = C33070mpX.AYXKKw(C55688xof.Application.onRepeatModeChanged);
                kotlin.Pair[] pairArr = new kotlin.Pair[2];
                java.lang.String str9 = this.gEmmrt;
                java.lang.String str10 = this.djBIcL;
                StopAmtInfo curPosSz = gridStopInfoDto2.getCurPosSz();
                pairArr[0] = C56390yDp.OLrzqt("cryptoPosition", C56033xvF.getBotAmount$default(str9, str10, (curPosSz == null || (amount5 = curPosSz.getAmount()) == null) ? "" : amount5, null, false, null, 56, null));
                StopAmtInfo curPosSz2 = gridStopInfoDto2.getCurPosSz();
                if (curPosSz2 != null && (ccy11 = curPosSz2.getCcy()) != null) {
                    str2 = ccy11;
                }
                pairArr[1] = C56390yDp.OLrzqt("ccy", str2);
                appCompatTextView8.setText(C33069mpW.OLrzqt(strAYXKKw3, C56424yEw.gEmmrt(pairArr)));
                return;
            }
            return;
        }
        if (str.equals("spot_dca")) {
            if (gridStopInfoDto != null) {
                LinearLayoutCompat linearLayoutCompat = abstractC48455uSa.DbNXlk;
                Intrinsics.checkNotNullExpressionValue(linearLayoutCompat, "");
                linearLayoutCompat.setVisibility(8);
                AppCompatTextView appCompatTextView9 = abstractC48455uSa.AhwBna;
                int i = C55688xof.Application.getCallingPackage;
                StopAmtInfo stopAmtInfo2 = (StopAmtInfo) CollectionsKt___CollectionsKt.AkhnZx(gridStopInfoDto.getSellCoinAmount(), 0);
                if (stopAmtInfo2 == null || (ccy6 = stopAmtInfo2.getCcy()) == null) {
                    ccy6 = "";
                }
                appCompatTextView9.setText(C33069mpW.copydefault(i, C56423yEv.EZpvd(C56390yDp.OLrzqt("baseCcy", ccy6))));
                abstractC48455uSa.gEmmrt.setText(C33069mpW.copydefault(C55688xof.Application.onExtrasChanged, C56423yEv.EZpvd(C56390yDp.OLrzqt("sellAmount", ""))));
                AppCompatTextView appCompatTextView10 = abstractC48455uSa.KWHzl;
                StopAmtInfo stopAmtInfo3 = (StopAmtInfo) CollectionsKt___CollectionsKt.AkhnZx(gridStopInfoDto.getSellCoinAmount(), 0);
                java.lang.String str11 = (stopAmtInfo3 == null || (ccy10 = stopAmtInfo3.getCcy()) == null) ? "" : ccy10;
                StopAmtInfo stopAmtInfo4 = (StopAmtInfo) CollectionsKt___CollectionsKt.AkhnZx(gridStopInfoDto.getSellCoinAmount(), 0);
                java.lang.String str12 = (stopAmtInfo4 == null || (amount4 = stopAmtInfo4.getAmount()) == null) ? "" : amount4;
                RoundingMode roundingMode = RoundingMode.UP;
                java.lang.String strFmtBotValueBySymbol$default = C56033xvF.fmtBotValueBySymbol$default(str11, str12, roundingMode, false, null, false, null, null, null, null, null, 2040, null);
                StopAmtInfo stopAmtInfo5 = (StopAmtInfo) CollectionsKt___CollectionsKt.AkhnZx(gridStopInfoDto.getSellCoinAmount(), 0);
                if (stopAmtInfo5 == null || (ccy7 = stopAmtInfo5.getCcy()) == null) {
                    ccy7 = "";
                }
                appCompatTextView10.setText(strFmtBotValueBySymbol$default + " " + ccy7);
                abstractC48455uSa.KWHzl.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.fdOvFl));
                abstractC48455uSa.AYXKKw.setText(C33069mpW.copydefault(C55688xof.Application.onQueueChanged, C56423yEv.EZpvd(C56390yDp.OLrzqt("returnAmount", ""))));
                AppCompatTextView appCompatTextView11 = abstractC48455uSa.isConnected;
                StopAmtInfo stopAmtInfo6 = (StopAmtInfo) CollectionsKt___CollectionsKt.AkhnZx(gridStopInfoDto.getReturnCoinAmount(), 0);
                java.lang.String str13 = (stopAmtInfo6 == null || (ccy9 = stopAmtInfo6.getCcy()) == null) ? "" : ccy9;
                StopAmtInfo stopAmtInfo7 = (StopAmtInfo) CollectionsKt___CollectionsKt.AkhnZx(gridStopInfoDto.getReturnCoinAmount(), 0);
                java.lang.String strFmtBotValueBySymbol$default2 = C56033xvF.fmtBotValueBySymbol$default(str13, (stopAmtInfo7 == null || (amount3 = stopAmtInfo7.getAmount()) == null) ? "" : amount3, roundingMode, false, null, false, null, null, null, null, null, 2040, null);
                StopAmtInfo stopAmtInfo8 = (StopAmtInfo) CollectionsKt___CollectionsKt.AkhnZx(gridStopInfoDto.getReturnCoinAmount(), 0);
                if (stopAmtInfo8 == null || (ccy8 = stopAmtInfo8.getCcy()) == null) {
                    ccy8 = "";
                }
                appCompatTextView11.setText(strFmtBotValueBySymbol$default2 + " " + ccy8);
                abstractC48455uSa.isConnected.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.fdOvFl));
            }
            if (gridStopInfoDto2 != null) {
                AppCompatTextView appCompatTextView12 = abstractC48455uSa.AkhnZx;
                int i2 = C55688xof.Application.release;
                if (gridStopInfoDto == null || (sellCoinAmount = gridStopInfoDto.getSellCoinAmount()) == null || (stopAmtInfo = (StopAmtInfo) CollectionsKt___CollectionsKt.AkhnZx(sellCoinAmount, 0)) == null || (ccy = stopAmtInfo.getCcy()) == null) {
                    ccy = "";
                }
                appCompatTextView12.setText(C33069mpW.copydefault(i2, C56423yEv.EZpvd(C56390yDp.OLrzqt("baseCcy", ccy))));
                AppCompatTextView appCompatTextView13 = abstractC48455uSa.copydefault;
                int i3 = C55688xof.Application.onQueueChanged;
                StopAmtInfo stopAmtInfo9 = (StopAmtInfo) CollectionsKt___CollectionsKt.AkhnZx(gridStopInfoDto2.getReturnCoinAmount(), 0);
                java.lang.String str14 = (stopAmtInfo9 == null || (ccy5 = stopAmtInfo9.getCcy()) == null) ? "" : ccy5;
                StopAmtInfo stopAmtInfo10 = (StopAmtInfo) CollectionsKt___CollectionsKt.AkhnZx(gridStopInfoDto2.getReturnCoinAmount(), 0);
                java.lang.String str15 = (stopAmtInfo10 == null || (amount2 = stopAmtInfo10.getAmount()) == null) ? "" : amount2;
                RoundingMode roundingMode2 = RoundingMode.UP;
                java.lang.String strFmtBotValueBySymbol$default3 = C56033xvF.fmtBotValueBySymbol$default(str14, str15, roundingMode2, false, null, false, null, null, null, null, null, 2040, null);
                StopAmtInfo stopAmtInfo11 = (StopAmtInfo) CollectionsKt___CollectionsKt.AkhnZx(gridStopInfoDto2.getReturnCoinAmount(), 0);
                if (stopAmtInfo11 == null || (ccy2 = stopAmtInfo11.getCcy()) == null) {
                    ccy2 = "";
                }
                StopAmtInfo stopAmtInfo12 = (StopAmtInfo) CollectionsKt___CollectionsKt.AkhnZx(gridStopInfoDto2.getReturnCoinAmount(), 1);
                java.lang.String str16 = (stopAmtInfo12 == null || (ccy4 = stopAmtInfo12.getCcy()) == null) ? "" : ccy4;
                StopAmtInfo stopAmtInfo13 = (StopAmtInfo) CollectionsKt___CollectionsKt.AkhnZx(gridStopInfoDto2.getReturnCoinAmount(), 1);
                java.lang.String strFmtBotValueBySymbol$default4 = C56033xvF.fmtBotValueBySymbol$default(str16, (stopAmtInfo13 == null || (amount = stopAmtInfo13.getAmount()) == null) ? "" : amount, roundingMode2, false, null, false, null, null, null, null, null, 2040, null);
                StopAmtInfo stopAmtInfo14 = (StopAmtInfo) CollectionsKt___CollectionsKt.AkhnZx(gridStopInfoDto2.getReturnCoinAmount(), 1);
                if (stopAmtInfo14 != null && (ccy3 = stopAmtInfo14.getCcy()) != null) {
                    str2 = ccy3;
                }
                appCompatTextView13.setText(C33069mpW.copydefault(i3, C56423yEv.EZpvd(C56390yDp.OLrzqt("returnAmount", strFmtBotValueBySymbol$default3 + " " + ccy2 + ", " + strFmtBotValueBySymbol$default4 + " " + str2))));
            }
        }
    }
}
