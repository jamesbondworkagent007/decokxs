package o;

import android.view.View;
import androidx.lifecycle.Observer;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.okinc.tradingbot.impl.order.strategy.contractdca.presenter.ContractDcaTriggerRsiPresenter;
import com.okinc.unify_trade.biz.DcaTriggerParam;
import com.okinc.unify_trade.biz.RsiTrigger;
import com.okinc.unify_trade.biz.TradeMenuItemBean;
import com.okinc.unify_trade.bot.config.TimeFrame;
import com.okinc.unify_trade.bot.config.TriggerCond;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C48033uCm;
import o.C52761wXj;
import o.C55688xof;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: renamed from: o.vCx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class ActivityC50127vCx extends AbstractActivityC48163uHh<uYI, ContractDcaTriggerRsiPresenter> {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int KWHzl = 8;
    public boolean OLrzqt;

    /* JADX INFO: renamed from: o.vCx$TaskDescription */
    public static final /* synthetic */ class TaskDescription implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(Function1 function1) {
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
    @Override // o.AbstractActivityC54499xKr
    public int AYXKKw() {
        return C48033uCm.Activity.zzJhsT;
    }

    /* JADX INFO: renamed from: o.vCx$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.vCx.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v1, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractActivityC48163uHh, o.AbstractActivityC54499xKr, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        valueOf();
        AkhnZx();
        values();
        isConnected();
        ((ContractDcaTriggerRsiPresenter) gHZMYf()).djBIcL();
        rVN.reportFullyDrawn$default((android.app.Activity) this, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v4, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    private final void valueOf() {
        ContractDcaTriggerRsiPresenter contractDcaTriggerRsiPresenter = (ContractDcaTriggerRsiPresenter) gHZMYf();
        android.content.Intent intent = getIntent();
        contractDcaTriggerRsiPresenter.copydefault(intent != null ? (DcaTriggerParam) intent.getParcelableExtra("triggerSign") : null);
        ContractDcaTriggerRsiPresenter contractDcaTriggerRsiPresenter2 = (ContractDcaTriggerRsiPresenter) gHZMYf();
        android.content.Intent intent2 = getIntent();
        contractDcaTriggerRsiPresenter2.AEQbTJ(intent2 != null ? intent2.getStringExtra(HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION) : null);
        ContractDcaTriggerRsiPresenter contractDcaTriggerRsiPresenter3 = (ContractDcaTriggerRsiPresenter) gHZMYf();
        android.content.Intent intent3 = getIntent();
        contractDcaTriggerRsiPresenter3.copydefault(intent3 != null ? intent3.getStringExtra("bot_inst_id") : null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    private final void AkhnZx() {
        OLrzqt();
        djBIcL();
        AEQbTJ();
        gEmmrt();
        KWHzl();
        AhwBna();
        C47988uAv c47988uAv = ((uYI) sSMYrx()).DbNXlk;
        int i = C48033uCm.Application.zXhzOT;
        C49960uyR.EZpvd(this, c47988uAv, java.lang.Integer.valueOf(i), ((uYI) sSMYrx()).DbNXlk, C55298xhM.dpInt$default(83.0f, (android.content.Context) null, 1, (java.lang.Object) null));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: Binding */
    /* JADX DEBUG: Possible override for method o.xKr.OLrzqt()Lcom/okinc/unify_trade/refactor/presenter/AbsPresenter; */
    /* JADX WARN: Multi-variable type inference failed */
    public final void OLrzqt() {
        final boolean zEZpvd = Intrinsics.EZpvd((java.lang.Object) ((ContractDcaTriggerRsiPresenter) gHZMYf()).AEQbTJ(), (java.lang.Object) "long");
        java.lang.String str = zEZpvd ? "images/trading_bot/android/trade_rsi_kline_futures_dca_long.png" : "images/trading_bot/android/trade_rsi_kline_futures_dca_short.png";
        android.widget.ImageView imageView = ((uYI) sSMYrx()).ejfBZ;
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        C33054mpH.EZpvd(imageView, C43454rpb.copydefault(str, this, true), (WebSocketProtocol.PAYLOAD_SHORT & 2) != 0 ? 0 : C52761wXj.TaskDescription.DuR, (WebSocketProtocol.PAYLOAD_SHORT & 4) != 0 ? null : null, (WebSocketProtocol.PAYLOAD_SHORT & 8) != 0 ? -1 : 0, (WebSocketProtocol.PAYLOAD_SHORT & 16) == 0 ? 0 : -1, (WebSocketProtocol.PAYLOAD_SHORT & 32) != 0 ? null : new Function0() { // from class: o.vCz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return ActivityC50127vCx.AEQbTJ(this.OLrzqt, zEZpvd);
            }
        }, (WebSocketProtocol.PAYLOAD_SHORT & 64) == 0 ? null : null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r5v1, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit AEQbTJ(ActivityC50127vCx activityC50127vCx, boolean z) {
        android.widget.TextView textView = ((uYI) activityC50127vCx.sSMYrx()).isConnected;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        textView.setVisibility(z ^ true ? 0 : 8);
        android.widget.TextView textView2 = ((uYI) activityC50127vCx.sSMYrx()).AkhnZx;
        Intrinsics.checkNotNullExpressionValue(textView2, "");
        textView2.setVisibility(z ? 0 : 8);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public final void djBIcL() {
        ((uYI) sSMYrx()).fIwbmz.setText(C33574myy.setupSpanStyles$default(C33069mpW.copydefault(C55688xof.Application.fdt, C56423yEv.EZpvd(C56390yDp.OLrzqt("termRsi", C33070mpX.AYXKKw(C55688xof.Application.OTwTPd)))), new java.lang.String[]{C33070mpX.AYXKKw(C55688xof.Application.OTwTPd)}, 0, null, false, new Function1() { // from class: o.vCI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC50127vCx.copydefault(this.OLrzqt, (java.util.List) obj);
            }
        }, 14, null));
    }

    public static final Unit copydefault(ActivityC50127vCx activityC50127vCx, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        list.add(new android.text.style.TextAppearanceSpan(activityC50127vCx, C52761wXj.LoaderManager.ODXsMY));
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r1v2, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public final void AEQbTJ() {
        java.lang.String timePeriod;
        C47988uAv c47988uAv = ((uYI) sSMYrx()).gEmmrt;
        C47988uAv.setInputLabel$default(c47988uAv, C33070mpX.AYXKKw(C55688xof.Application.fromMediaItem), null, 2, null);
        DcaTriggerParam dcaTriggerParamEZpvd = ((ContractDcaTriggerRsiPresenter) gHZMYf()).EZpvd();
        if (dcaTriggerParamEZpvd == null || (timePeriod = dcaTriggerParamEZpvd.getTimePeriod()) == null) {
            timePeriod = "";
        }
        C47988uAv.setInputContent$default(c47988uAv, timePeriod, false, false, 6, null);
        c47988uAv.setInputHint("2-100");
        c47988uAv.setOnTextChangeCallback(new Function2() { // from class: o.vCF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return ActivityC50127vCx.EZpvd(this.KWHzl, (C47988uAv) obj, (java.lang.String) obj2);
            }
        });
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v2, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit EZpvd(ActivityC50127vCx activityC50127vCx, C47988uAv c47988uAv, java.lang.String str) {
        Intrinsics.checkNotNullParameter(c47988uAv, "");
        DcaTriggerParam dcaTriggerParamEZpvd = ((ContractDcaTriggerRsiPresenter) activityC50127vCx.gHZMYf()).EZpvd();
        if (dcaTriggerParamEZpvd != null) {
            dcaTriggerParamEZpvd.setTimePeriod(str);
        }
        if (activityC50127vCx.EZpvd()) {
            ((ContractDcaTriggerRsiPresenter) activityC50127vCx.gHZMYf()).djBIcL();
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r1v2, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public final void gEmmrt() {
        C53530wnI c53530wnI = ((uYI) sSMYrx()).fJNWhG;
        c53530wnI.setTitleText(C33070mpX.AYXKKw(C55688xof.Application.getACTION_SYSTEM_FALLBACK_PICK_IMAGESannotations));
        java.util.List<TradeMenuItemBean> listGEmmrt = ((ContractDcaTriggerRsiPresenter) gHZMYf()).gEmmrt();
        androidx.fragment.app.FragmentManager supportFragmentManager = getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
        c53530wnI.setTypeMenu(listGEmmrt, supportFragmentManager, new Function1() { // from class: o.vCC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC50127vCx.AEQbTJ(this.OLrzqt, (TradeMenuItemBean) obj);
            }
        });
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r3v1, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit AEQbTJ(ActivityC50127vCx activityC50127vCx, TradeMenuItemBean tradeMenuItemBean) {
        Intrinsics.checkNotNullParameter(tradeMenuItemBean, "");
        java.lang.Object data = tradeMenuItemBean.getData();
        Intrinsics.copydefault(data, "");
        java.lang.String mode = ((TriggerCond) data).getMode();
        DcaTriggerParam dcaTriggerParamEZpvd = ((ContractDcaTriggerRsiPresenter) activityC50127vCx.gHZMYf()).EZpvd();
        if (dcaTriggerParamEZpvd != null) {
            dcaTriggerParamEZpvd.setTriggerCond(mode);
        }
        pUU.KWHzl(activityC50127vCx.getTAG(), "triggerCond: " + mode);
        ((ContractDcaTriggerRsiPresenter) activityC50127vCx.gHZMYf()).djBIcL();
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v5, resolved type: Presenter */
    /* JADX DEBUG: Possible override for method o.xKr.KWHzl()Ljava/lang/Class; */
    /* JADX WARN: Multi-variable type inference failed */
    public final void KWHzl() {
        C47988uAv c47988uAv = ((uYI) sSMYrx()).DbNXlk;
        c47988uAv.setMaxDecimal(0);
        DcaTriggerParam dcaTriggerParamEZpvd = ((ContractDcaTriggerRsiPresenter) gHZMYf()).EZpvd();
        C47988uAv.setInputContent$default(c47988uAv, dcaTriggerParamEZpvd != null ? dcaTriggerParamEZpvd.getThold() : null, false, false, 6, null);
        C47988uAv.setInputLabel$default(c47988uAv, Intrinsics.EZpvd((java.lang.Object) ((ContractDcaTriggerRsiPresenter) gHZMYf()).AEQbTJ(), (java.lang.Object) "long") ? C33070mpX.AYXKKw(C55688xof.Application.FYtjSf) : C33070mpX.AYXKKw(C55688xof.Application.clearRegistrations), null, 2, null);
        c47988uAv.setOnTextChangeCallback(new Function2() { // from class: o.vCD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return ActivityC50127vCx.KWHzl(this.EZpvd, (C47988uAv) obj, (java.lang.String) obj2);
            }
        });
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v2, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r3v2, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit KWHzl(ActivityC50127vCx activityC50127vCx, C47988uAv c47988uAv, java.lang.String str) {
        Intrinsics.checkNotNullParameter(c47988uAv, "");
        pUU.KWHzl(activityC50127vCx.getTAG(), "oversoldThreshold: " + str);
        DcaTriggerParam dcaTriggerParamEZpvd = ((ContractDcaTriggerRsiPresenter) activityC50127vCx.gHZMYf()).EZpvd();
        if (dcaTriggerParamEZpvd != null) {
            dcaTriggerParamEZpvd.setThold(str);
        }
        activityC50127vCx.EZpvd(str);
        if (activityC50127vCx.copydefault()) {
            ((ContractDcaTriggerRsiPresenter) activityC50127vCx.gHZMYf()).djBIcL();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.vCx$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ ActivityC50127vCx KWHzl;
        public final /* synthetic */ long OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, ActivityC50127vCx activityC50127vCx) {
            this.EZpvd = view;
            this.OLrzqt = j;
            this.KWHzl = activityC50127vCx;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.OLrzqt || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                this.KWHzl.finish();
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r1v2, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public final void AhwBna() {
        C53530wnI c53530wnI = ((uYI) sSMYrx()).fARcdN;
        c53530wnI.setTitleText(C33070mpX.AYXKKw(C55688xof.Application.heceqZ));
        java.util.List<TradeMenuItemBean> listCopydefault = ((ContractDcaTriggerRsiPresenter) gHZMYf()).copydefault();
        androidx.fragment.app.FragmentManager supportFragmentManager = getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
        c53530wnI.setTypeMenu(listCopydefault, supportFragmentManager, new Function1() { // from class: o.vCG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC50127vCx.OLrzqt(this.copydefault, (TradeMenuItemBean) obj);
            }
        });
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r3v1, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit OLrzqt(ActivityC50127vCx activityC50127vCx, TradeMenuItemBean tradeMenuItemBean) {
        Intrinsics.checkNotNullParameter(tradeMenuItemBean, "");
        java.lang.Object data = tradeMenuItemBean.getData();
        Intrinsics.copydefault(data, "");
        java.lang.String frame = ((TimeFrame) data).getFrame();
        DcaTriggerParam dcaTriggerParamEZpvd = ((ContractDcaTriggerRsiPresenter) activityC50127vCx.gHZMYf()).EZpvd();
        if (dcaTriggerParamEZpvd != null) {
            dcaTriggerParamEZpvd.setTimeframe(frame);
        }
        pUU.KWHzl(activityC50127vCx.getTAG(), "timeframe: " + frame);
        ((ContractDcaTriggerRsiPresenter) activityC50127vCx.gHZMYf()).djBIcL();
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v6, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v9, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    private final void values() {
        ((uYI) sSMYrx()).EZpvd.setOnClickListener(new View.OnClickListener() { // from class: o.vCL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                ActivityC50127vCx.EZpvd(this.KWHzl, view);
            }
        });
        ((uYI) sSMYrx()).AEQbTJ.setOnClickListener(new View.OnClickListener() { // from class: o.vCK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                ActivityC50127vCx.copydefault(this.OLrzqt, view);
            }
        });
        ((uYI) sSMYrx()).fetchVPNInfo.setOnClickListener(new View.OnClickListener() { // from class: o.vCB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                ActivityC50127vCx.AYXKKw(this.OLrzqt, view);
            }
        });
        android.widget.ImageView imageView = ((uYI) sSMYrx()).OLrzqt;
        imageView.setOnClickListener(new Application(imageView, 1000L, this));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void EZpvd(ActivityC50127vCx activityC50127vCx, android.view.View view) {
        if (activityC50127vCx.copydefault() && activityC50127vCx.EZpvd()) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("data", ((ContractDcaTriggerRsiPresenter) activityC50127vCx.gHZMYf()).EZpvd());
            Unit unit = Unit.INSTANCE;
            activityC50127vCx.setResult(-1, intent);
            activityC50127vCx.finish();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v3, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r2v6, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void copydefault(ActivityC50127vCx activityC50127vCx, android.view.View view) {
        activityC50127vCx.OLrzqt = !activityC50127vCx.OLrzqt;
        ((uYI) activityC50127vCx.sSMYrx()).fIwbmz.setMaxLines(activityC50127vCx.OLrzqt ? Integer.MAX_VALUE : 2);
        ((uYI) activityC50127vCx.sSMYrx()).AEQbTJ.setText(C33070mpX.AYXKKw(activityC50127vCx.OLrzqt ? C55688xof.Application.getNavigationItemCount : C55688xof.Application.getDisplayOptions));
    }

    public static final void AYXKKw(ActivityC50127vCx activityC50127vCx, android.view.View view) {
        final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(activityC50127vCx);
        viewOnClickListenerC54939xaY.EZpvd(activityC50127vCx.getString(C55688xof.Application.DNMMPQ));
        java.lang.String string = activityC50127vCx.getString(C55688xof.Application.QWSkGZ);
        Intrinsics.checkNotNullExpressionValue(string, "");
        viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) string, new View.OnClickListener() { // from class: o.vCJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view2) {
                ActivityC50127vCx.copydefault(viewOnClickListenerC54939xaY, view2);
            }
        });
        viewOnClickListenerC54939xaY.show();
    }

    public static final void copydefault(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        viewOnClickListenerC54939xaY.dismiss();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v10, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v13, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v22, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v4, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r3v1, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r3v4, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r5v5, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public final void EZpvd(java.lang.String str) {
        boolean zGEmmrt;
        java.lang.String strCopydefault;
        if (Intrinsics.EZpvd((java.lang.Object) ((ContractDcaTriggerRsiPresenter) gHZMYf()).AEQbTJ(), (java.lang.Object) "long")) {
            DcaTriggerParam dcaTriggerParamEZpvd = ((ContractDcaTriggerRsiPresenter) gHZMYf()).EZpvd();
            zGEmmrt = C33129mqd.AEQbTJ(str, dcaTriggerParamEZpvd != null ? dcaTriggerParamEZpvd.getTholdWarning() : null);
        } else {
            DcaTriggerParam dcaTriggerParamEZpvd2 = ((ContractDcaTriggerRsiPresenter) gHZMYf()).EZpvd();
            zGEmmrt = C33129mqd.gEmmrt(str, dcaTriggerParamEZpvd2 != null ? dcaTriggerParamEZpvd2.getTholdWarning() : null);
        }
        android.widget.TextView textView = ((uYI) sSMYrx()).values;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        textView.setVisibility(zGEmmrt ? 0 : 8);
        android.widget.TextView textView2 = ((uYI) sSMYrx()).values;
        if (Intrinsics.EZpvd((java.lang.Object) ((ContractDcaTriggerRsiPresenter) gHZMYf()).AEQbTJ(), (java.lang.Object) "long")) {
            int i = C55688xof.Application.UJEglR;
            DcaTriggerParam dcaTriggerParamEZpvd3 = ((ContractDcaTriggerRsiPresenter) gHZMYf()).EZpvd();
            strCopydefault = C33069mpW.copydefault(i, C56423yEv.EZpvd(C56390yDp.OLrzqt("tholdNum", java.lang.String.valueOf(dcaTriggerParamEZpvd3 != null ? dcaTriggerParamEZpvd3.getTholdWarning() : null))));
        } else {
            int i2 = C55688xof.Application.dlRikr;
            DcaTriggerParam dcaTriggerParamEZpvd4 = ((ContractDcaTriggerRsiPresenter) gHZMYf()).EZpvd();
            strCopydefault = C33069mpW.copydefault(i2, C56423yEv.EZpvd(C56390yDp.OLrzqt("tholdNum", java.lang.String.valueOf(dcaTriggerParamEZpvd4 != null ? dcaTriggerParamEZpvd4.getTholdWarning() : null))));
        }
        textView2.setText(strCopydefault);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    private final void isConnected() {
        ((ContractDcaTriggerRsiPresenter) gHZMYf()).KWHzl().observe(this, new TaskDescription(new Function1() { // from class: o.vCA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC50127vCx.OLrzqt(this.copydefault, (RsiTrigger) obj);
            }
        }));
        ((ContractDcaTriggerRsiPresenter) gHZMYf()).OLrzqt().AhwBna().observe(this, new TaskDescription(new Function1() { // from class: o.vCE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC50127vCx.copydefault(this.OLrzqt, (java.lang.Exception) obj);
            }
        }));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit OLrzqt(ActivityC50127vCx activityC50127vCx, RsiTrigger rsiTrigger) {
        java.lang.String strCopydefault;
        Intrinsics.checkNotNullParameter(rsiTrigger, "");
        android.widget.TextView textView = ((uYI) activityC50127vCx.sSMYrx()).AuCTel;
        if (C33129mqd.OLrzqt((java.lang.CharSequence) rsiTrigger.getTriggerNum())) {
            xMR xmr = xMR.copydefault;
            java.lang.String triggerNum = rsiTrigger.getTriggerNum();
            strCopydefault = xmr.copydefault(triggerNum != null ? triggerNum : "");
        } else {
            strCopydefault = "--";
        }
        textView.setText(strCopydefault);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit copydefault(ActivityC50127vCx activityC50127vCx, java.lang.Exception exc) {
        Intrinsics.checkNotNullParameter(exc, "");
        ((uYI) activityC50127vCx.sSMYrx()).AuCTel.setText("--");
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r2v4, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public final boolean EZpvd() {
        java.lang.String strEZpvd = ((ContractDcaTriggerRsiPresenter) gHZMYf()).EZpvd(((uYI) sSMYrx()).gEmmrt.AkhnZx(), 2, 100, ((uYI) sSMYrx()).gEmmrt.values());
        boolean zFARcdN = StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strEZpvd);
        if (zFARcdN) {
            ((uYI) sSMYrx()).gEmmrt.copydefault();
        } else {
            ((uYI) sSMYrx()).gEmmrt.setInputErrorMsg(strEZpvd);
        }
        return zFARcdN;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r2v4, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public final boolean copydefault() {
        java.lang.String strEZpvd = ((ContractDcaTriggerRsiPresenter) gHZMYf()).EZpvd(((uYI) sSMYrx()).DbNXlk.AkhnZx(), 1, 100, ((uYI) sSMYrx()).DbNXlk.values());
        boolean zFARcdN = StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strEZpvd);
        if (zFARcdN) {
            ((uYI) sSMYrx()).DbNXlk.copydefault();
        } else {
            ((uYI) sSMYrx()).DbNXlk.setInputErrorMsg(strEZpvd);
        }
        return zFARcdN;
    }

    @Override // o.AbstractActivityC48163uHh, o.AbstractActivityC54499xKr, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.AbstractActivityC48163uHh, o.AbstractActivityC54499xKr, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // o.AbstractActivityC48163uHh, o.AbstractActivityC54499xKr, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // o.AbstractActivityC48163uHh, o.AbstractActivityC54499xKr, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
