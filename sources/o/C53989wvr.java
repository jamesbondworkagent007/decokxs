package o;

import android.view.View;
import androidx.core.os.BundleKt;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.Observer;
import androidx.lifecycle.TradeLiveData;
import com.okinc.biz.TacticsType;
import com.okinc.tradingbot.impl.order.strategy.data.BotStopType;
import com.okinc.tradingbot.impl.strategy.dialog.StopBotDialogFragment$subscribeOnUIChange$3;
import com.okinc.tradingbot.impl.strategy.dialog.StopBotDialogFragment$subscribeOnUIChange$4;
import com.okinc.tradingbot.impl.strategy.viewmodel.StopBotPresenter;
import com.okinc.unify_trade.biz.PlaceOrderCondition;
import com.okinc.unify_trade.biz.StrategyStopReq;
import com.okinc.unify_trade.biz.StrategyStopResponse;
import com.okinc.unify_trade.biz.TacticsVoucherInfo;
import com.okinc.unify_trade.biz.VoucherStatus;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C48033uCm;
import o.C55688xof;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wvr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C53989wvr extends AbstractC53916wuX<AbstractC48518uUj, StopBotPresenter> {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int djBIcL = 8;
    public Function0<Unit> AkhnZx;
    public TacticsVoucherInfo AuCTel;
    public BotStopType fIwbmz;
    public java.lang.String fJNWhG;
    public java.lang.String fetchVPNInfo;
    public java.lang.String gEmmrt;
    public java.lang.String isConnected;
    public java.lang.String uzCIH;
    public java.lang.String values;
    public final int AhwBna = C48033uCm.Activity.jh;
    public java.lang.String DbNXlk = "";
    public java.lang.String AYXKKw = "";

    /* JADX INFO: renamed from: o.wvr$Dialog */
    public static final /* synthetic */ class Dialog implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Dialog(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.KWHzl = function1;
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
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(java.lang.Object obj) {
            this.KWHzl.invoke(obj);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC49945uyC
    public int AEQbTJ() {
        return this.AhwBna;
    }

    @Override // o.wXX
    public boolean getHasFooter() {
        return true;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ AbstractC48518uUj copydefault(C53989wvr c53989wvr) {
        return (AbstractC48518uUj) c53989wvr.values();
    }

    /* JADX INFO: renamed from: o.wvr$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.wvr.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    private final java.lang.String AuCTel() {
        android.os.Bundle arguments = getArguments();
        if (arguments != null) {
            return arguments.getString("COPY_TYPE_KEY");
        }
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v4, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.wXX, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        getFieldNames();
        uzCIH();
        getNewProxyInstance();
        if (Intrinsics.EZpvd((java.lang.Object) this.DbNXlk, (java.lang.Object) TacticsType.TACTICS_GRDE.getConstant())) {
            ((StopBotPresenter) OLrzqt()).EZpvd(new StopBotPresenter.StateListAnimator.Application(this.AYXKKw));
        }
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) this, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.setStyle(1);
        wxq.setTitle(((StopBotPresenter) OLrzqt()).OLrzqt(this.DbNXlk, this.gEmmrt));
        android.widget.TextView textViewAYXKKw = wxq.AYXKKw();
        android.content.Context context = wxq.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        textViewAYXKKw.setPaddingRelative(0, 0, C55298xhM.OLrzqt(38, context), 0);
        wxq.KWHzl().setVisibility(0);
        wxq.AEQbTJ().setVisibility(8);
        wxq.setDividerVisibility(true);
        android.widget.ImageView imageViewKWHzl = wxq.KWHzl();
        imageViewKWHzl.setOnClickListener(new FragmentManager(imageViewKWHzl, 1000L, this));
    }

    @Override // o.wXX
    public void onFooterCreated(@NotNull wYF wyf) {
        Intrinsics.checkNotNullParameter(wyf, "");
        super.onFooterCreated(wyf);
        wyf.setType(5);
        wyf.setPrimaryText(C33070mpX.AYXKKw(C48033uCm.Fragment.hrNTAI));
        wyf.setOKDSSize(44);
        wyf.setOnClickListener(new PendingIntent(wyf, 1000L, this));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    private final void getNewProxyInstance() {
        TradeLiveData<java.util.List<StrategyStopResponse>> tradeLiveDataOLrzqt = ((StopBotPresenter) OLrzqt()).OLrzqt();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        tradeLiveDataOLrzqt.observe(viewLifecycleOwner, new Dialog(new Function1() { // from class: o.wvp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C53989wvr.EZpvd(this.KWHzl, (java.util.List) obj);
            }
        }));
        ((StopBotPresenter) OLrzqt()).getAggregateErrorLiveData().observe(getViewLifecycleOwner(), new Dialog(new Function1() { // from class: o.wvo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C53989wvr.KWHzl(this.EZpvd, (androidx.core.util.Pair) obj);
            }
        }));
        LifecycleOwner viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "");
        wUL.safeLaunch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner2), null, null, new StopBotDialogFragment$subscribeOnUIChange$3(this, null), 3, null);
        LifecycleOwner viewLifecycleOwner3 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner3, "");
        wUL.safeLaunch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner3), null, null, new StopBotDialogFragment$subscribeOnUIChange$4(this, null), 3, null);
    }

    public static final Unit EZpvd(C53989wvr c53989wvr, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        Function0<Unit> function0 = c53989wvr.AkhnZx;
        if (function0 != null) {
            function0.invoke();
        }
        c53989wvr.dismissAllowingStateLoss();
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: F */
    /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r2v7, resolved type: S */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit KWHzl(C53989wvr c53989wvr, androidx.core.util.Pair pair) {
        java.lang.String message;
        if (Intrinsics.EZpvd(pair.first, (java.lang.Object) ((StopBotPresenter) c53989wvr.OLrzqt()).KWHzl().bB_()) && (message = ((java.lang.Exception) pair.second).getMessage()) != null) {
            C55326xho.toastWithFailedIcon$default(message, 0, 1, (java.lang.Object) null);
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v6, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public final void AEQbTJ(StopBotPresenter.Application application) {
        ((AbstractC48518uUj) values()).KWHzl.setText(application.KWHzl());
        ((AbstractC48518uUj) values()).EZpvd.setText(application.AEQbTJ());
        ((AbstractC48518uUj) values()).AEQbTJ.setText(application.copydefault());
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v6, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    private final void uzCIH() {
        wQL wql = ((AbstractC48518uUj) values()).EZpvd;
        wql.setOnClickListener(new StateListAnimator(wql, 1000L, this));
        wQL wql2 = ((AbstractC48518uUj) values()).AEQbTJ;
        wql2.setOnClickListener(new Application(wql2, 1000L, this));
        wQL wql3 = ((AbstractC48518uUj) values()).KWHzl;
        wql3.setOnClickListener(new Activity(wql3, 1000L, this));
    }

    /* JADX INFO: renamed from: o.wvr$Activity */
    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ C53989wvr OLrzqt;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, C53989wvr c53989wvr) {
            this.copydefault = view;
            this.AEQbTJ = j;
            this.OLrzqt = c53989wvr;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.AEQbTJ || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                if (C53989wvr.copydefault(this.OLrzqt).KWHzl.isSelected()) {
                    return;
                }
                this.OLrzqt.OLrzqt(BotStopType.StopAndSellToUsdt);
            }
        }
    }

    /* JADX INFO: renamed from: o.wvr$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ C53989wvr OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, C53989wvr c53989wvr) {
            this.AEQbTJ = view;
            this.EZpvd = j;
            this.OLrzqt = c53989wvr;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.EZpvd || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                if (C53989wvr.copydefault(this.OLrzqt).AEQbTJ.isSelected()) {
                    return;
                }
                this.OLrzqt.OLrzqt(BotStopType.StopButNotSell);
            }
        }
    }

    /* JADX INFO: renamed from: o.wvr$FragmentManager */
    public static final class FragmentManager implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ android.view.View OLrzqt;
        public final /* synthetic */ C53989wvr copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public FragmentManager(android.view.View view, long j, C53989wvr c53989wvr) {
            this.OLrzqt = view;
            this.AEQbTJ = j;
            this.copydefault = c53989wvr;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.AEQbTJ || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                this.copydefault.dismissAllowingStateLoss();
            }
        }
    }

    /* JADX INFO: renamed from: o.wvr$PendingIntent */
    public static final class PendingIntent implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ C53989wvr EZpvd;
        public final /* synthetic */ android.view.View OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public PendingIntent(android.view.View view, long j, C53989wvr c53989wvr) {
            this.OLrzqt = view;
            this.AEQbTJ = j;
            this.EZpvd = c53989wvr;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r11v7, resolved type: Presenter */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.AEQbTJ || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                StopBotPresenter stopBotPresenter = (StopBotPresenter) this.EZpvd.OLrzqt();
                java.lang.String str = this.EZpvd.AYXKKw;
                java.lang.String str2 = this.EZpvd.isConnected;
                java.lang.String str3 = this.EZpvd.DbNXlk;
                BotStopType botStopType = this.EZpvd.fIwbmz;
                stopBotPresenter.EZpvd(new StopBotPresenter.StateListAnimator.C0677StateListAnimator(new StrategyStopReq(str, str2, str3, botStopType != null ? botStopType.getCode() : null, (PlaceOrderCondition) null, (java.lang.String) null, 48, (DefaultConstructorMarker) null)));
            }
        }
    }

    /* JADX INFO: renamed from: o.wvr$StateListAnimator */
    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ C53989wvr AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ android.view.View KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, C53989wvr c53989wvr) {
            this.KWHzl = view;
            this.EZpvd = j;
            this.AEQbTJ = c53989wvr;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.EZpvd || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                if (C53989wvr.copydefault(this.AEQbTJ).EZpvd.isSelected()) {
                    return;
                }
                this.AEQbTJ.OLrzqt(BotStopType.StopAndSell);
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v4, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v8, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r1v3, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    private final void getFieldNames() {
        wQL wql = ((AbstractC48518uUj) values()).KWHzl;
        if (Intrinsics.EZpvd((java.lang.Object) this.DbNXlk, (java.lang.Object) "grid")) {
            java.lang.String str = this.isConnected;
            java.util.List listSplit$default = str != null ? StringsKt__StringsKt.split$default((java.lang.CharSequence) str, new java.lang.String[]{"-"}, false, 0, 6, (java.lang.Object) null) : null;
            Intrinsics.copydefault(wql);
            wql.setVisibility((!Intrinsics.EZpvd((java.lang.Object) this.fetchVPNInfo, (java.lang.Object) "USDT") || listSplit$default == null || CollectionsKt___CollectionsKt.KWHzl((java.lang.Iterable<? extends java.lang.String>) ((java.lang.Iterable<? extends java.lang.Object>) listSplit$default), this.fetchVPNInfo)) ? 8 : 0);
        }
        OLrzqt(fIwbmz());
        fARcdN();
        ((AbstractC48518uUj) values()).OLrzqt.setLineSpacing(20.0f, 1.0f);
        TacticsVoucherInfo tacticsVoucherInfo = this.AuCTel;
        if (tacticsVoucherInfo != null) {
            android.widget.TextView textView = ((AbstractC48518uUj) values()).copydefault;
            Intrinsics.checkNotNullExpressionValue(textView, "");
            textView.setVisibility((tacticsVoucherInfo.getHasVoucher() && tacticsVoucherInfo.getVoucherStatus() != VoucherStatus.LossInsuranceVoucherStatus.EXPIRED && C33129mqd.AEQbTJ(this.uzCIH, 0)) ? 0 : 8);
            ((AbstractC48518uUj) values()).copydefault.setText(C33070mpX.AYXKKw(C55688xof.Application.GGlJim));
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v6, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public final void OLrzqt(BotStopType botStopType) {
        this.fIwbmz = botStopType;
        ((AbstractC48518uUj) values()).EZpvd.setSelected(botStopType == BotStopType.StopAndSell);
        ((AbstractC48518uUj) values()).AEQbTJ.setSelected(botStopType == BotStopType.StopButNotSell);
        ((AbstractC48518uUj) values()).KWHzl.setSelected(botStopType == BotStopType.StopAndSellToUsdt);
        fARcdN();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public final BotStopType fIwbmz() {
        BotStopType botStopType;
        wQL wql = ((AbstractC48518uUj) values()).KWHzl;
        Intrinsics.checkNotNullExpressionValue(wql, "");
        if (wql.getVisibility() == 0) {
            botStopType = BotStopType.StopAndSellToUsdt;
        } else {
            BotStopType[] botStopTypeArrValues = BotStopType.values();
            int length = botStopTypeArrValues.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    botStopType = null;
                    break;
                }
                BotStopType botStopType2 = botStopTypeArrValues[i];
                if (botStopType2 == this.fIwbmz) {
                    botStopType = botStopType2;
                    break;
                }
                i++;
            }
            if (botStopType == null) {
                botStopType = BotStopType.StopAndSell;
            }
        }
        this.fIwbmz = botStopType;
        Intrinsics.copydefault(botStopType);
        return botStopType;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v10, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v4, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v7, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r1v12, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r1v16, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r1v23, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r1v29, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r1v6, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public final void fARcdN() {
        java.lang.String strAYXKKw;
        java.lang.String str = this.DbNXlk;
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) TacticsType.TACTICS_CONTRACT_GRID.getConstant())) {
            android.widget.TextView textView = ((AbstractC48518uUj) values()).OLrzqt;
            Intrinsics.copydefault(textView);
            textView.setVisibility(((AbstractC48518uUj) values()).AEQbTJ.isSelected() ? 0 : 8);
            textView.setText(C33070mpX.AYXKKw(C55688xof.Application.invokeSuspend));
            return;
        }
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) TacticsType.TACTICS_GRDE.getConstant())) {
            if (Intrinsics.EZpvd((java.lang.Object) AuCTel(), (java.lang.Object) "3")) {
                android.widget.TextView textView2 = ((AbstractC48518uUj) values()).OLrzqt;
                Intrinsics.copydefault(textView2);
                textView2.setVisibility(0);
                if (((AbstractC48518uUj) values()).EZpvd.isSelected() || ((AbstractC48518uUj) values()).KWHzl.isSelected()) {
                    strAYXKKw = C33070mpX.AYXKKw(C55688xof.Application.getTransportControls);
                } else {
                    strAYXKKw = C33070mpX.AYXKKw(C55688xof.Application.getPlaybackInfo);
                }
                textView2.setText(strAYXKKw);
                return;
            }
            android.widget.TextView textView3 = ((AbstractC48518uUj) values()).OLrzqt;
            Intrinsics.copydefault(textView3);
            if (!((AbstractC48518uUj) values()).EZpvd.isSelected() && !((AbstractC48518uUj) values()).KWHzl.isSelected()) {
                i = 8;
            }
            textView3.setVisibility(i);
            textView3.setText(C33070mpX.AYXKKw(C48033uCm.Fragment.QYvkLl));
        }
    }

    /* JADX INFO: renamed from: o.wvr$ActionBar */
    public static final class ActionBar {
        public static final int AEQbTJ = TacticsVoucherInfo.$stable;
        public final java.lang.String AYXKKw;
        public final java.lang.String AhwBna;
        public final java.lang.String EZpvd;
        public final java.lang.String KWHzl;
        public final java.lang.String OLrzqt;
        public final java.lang.String copydefault;
        public final Function0<Unit> djBIcL;
        public final java.lang.String fetchVPNInfo;
        public final java.lang.String gEmmrt;
        public final java.lang.String isConnected;
        public final java.lang.String valueOf;
        public final TacticsVoucherInfo values;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar() {
            this(null, null, null, null, null, null, null, null, null, null, null, null, 4095, null);
        }

        public ActionBar(@NotNull java.lang.String str, @NotNull java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8, TacticsVoucherInfo tacticsVoucherInfo, java.lang.String str9, java.lang.String str10, Function0<Unit> function0) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            this.EZpvd = str;
            this.OLrzqt = str2;
            this.valueOf = str3;
            this.AYXKKw = str4;
            this.isConnected = str5;
            this.copydefault = str6;
            this.AhwBna = str7;
            this.gEmmrt = str8;
            this.values = tacticsVoucherInfo;
            this.fetchVPNInfo = str9;
            this.KWHzl = str10;
            this.djBIcL = function0;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0079: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r26v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r14v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r26v0 int) & (2 int) A[WRAPPED]) == (0 int)) ? (r15v0 java.lang.String) : (""))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0011: ARITH (r26v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001a: ARITH (r26v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r17v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0022: ARITH (r26v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r18v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002a: ARITH (r26v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r19v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0032: ARITH (r26v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r20v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003a: ARITH (r26v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r21v0 java.lang.String))
  (wrap:com.okinc.unify_trade.biz.TacticsVoucherInfo:?: TERNARY null = ((wrap:int:0x0042: ARITH (r26v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.unify_trade.biz.TacticsVoucherInfo) : (r22v0 com.okinc.unify_trade.biz.TacticsVoucherInfo))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004a: ARITH (r26v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r23v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0052: ARITH (r26v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r24v0 java.lang.String))
  (wrap:kotlin.jvm.functions.Function0:?: TERNARY null = ((wrap:int:0x005a: ARITH (r26v0 int) & (2048 int) A[WRAPPED]) == (0 int)) ? (r25v0 kotlin.jvm.functions.Function0) : (null kotlin.jvm.functions.Function0))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.unify_trade.biz.TacticsVoucherInfo, java.lang.String, java.lang.String, kotlin.jvm.functions.Function0<kotlin.Unit>):void (m)] (LINE:258) call: o.wvr.ActionBar.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.unify_trade.biz.TacticsVoucherInfo, java.lang.String, java.lang.String, kotlin.jvm.functions.Function0):void type: THIS */
        public /* synthetic */ ActionBar(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8, TacticsVoucherInfo tacticsVoucherInfo, java.lang.String str9, java.lang.String str10, Function0 function0, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) == 0 ? str2 : "", (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) != 0 ? null : str8, (i & 256) != 0 ? null : tacticsVoucherInfo, (i & 512) != 0 ? null : str9, (i & 1024) != 0 ? null : str10, (i & 2048) == 0 ? function0 : null);
        }

        public final C53989wvr KWHzl() {
            C53989wvr c53989wvr = new C53989wvr();
            c53989wvr.setArguments(BundleKt.bundleOf(C56390yDp.OLrzqt("bot_type", this.OLrzqt), C56390yDp.OLrzqt("trade_symbol", this.isConnected), C56390yDp.OLrzqt("bot_name", this.copydefault), C56390yDp.OLrzqt("inst_id", this.valueOf), C56390yDp.OLrzqt("inst_type", this.AYXKKw), C56390yDp.OLrzqt("COPY_TYPE_KEY", this.KWHzl)));
            c53989wvr.AYXKKw = this.EZpvd;
            c53989wvr.DbNXlk = this.OLrzqt;
            c53989wvr.isConnected = this.valueOf;
            c53989wvr.values = this.AYXKKw;
            c53989wvr.fJNWhG = this.isConnected;
            c53989wvr.gEmmrt = this.copydefault;
            c53989wvr.fIwbmz = BotStopType.Companion.OLrzqt(this.AhwBna);
            c53989wvr.fetchVPNInfo = this.gEmmrt;
            c53989wvr.AuCTel = this.values;
            c53989wvr.uzCIH = this.fetchVPNInfo;
            c53989wvr.AkhnZx = this.djBIcL;
            return c53989wvr;
        }
    }
}
