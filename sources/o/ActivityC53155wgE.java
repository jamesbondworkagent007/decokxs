package o;

import android.view.View;
import androidx.lifecycle.Observer;
import com.okinc.tradeuilib.widget.oktinputlayout.core.InputLayoutState;
import com.okinc.tradingbot.impl.order.strategy.spotdca.viewmodel.SpotDcaTriggerRsiPresenter;
import com.okinc.unify_trade.biz.DcaTriggerParam;
import com.okinc.unify_trade.biz.RsiTrigger;
import com.okinc.unify_trade.biz.TradeMenuItemBean;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.C48033uCm;
import o.C52761wXj;
import o.C55688xof;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: renamed from: o.wgE, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class ActivityC53155wgE extends AbstractActivityC48163uHh<uYV, SpotDcaTriggerRsiPresenter> {
    public boolean KWHzl;
    public final InterfaceC56387yDm OLrzqt = C56392yDr.copydefault(new Function0() { // from class: o.wgH
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return ActivityC53155wgE.AYXKKw(this.OLrzqt);
        }
    });
    public final Function2<C47988uAv, java.lang.String, Unit> EZpvd = new Function2() { // from class: o.wgL
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
            return ActivityC53155wgE.KWHzl(this.EZpvd, (C47988uAv) obj, (java.lang.String) obj2);
        }
    };

    /* JADX INFO: renamed from: o.wgE$Activity */
    public static final /* synthetic */ class Activity implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(Function1 function1) {
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
    @Override // o.AbstractActivityC54499xKr
    public int AYXKKw() {
        return C48033uCm.Activity.config;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ uYV OLrzqt(ActivityC53155wgE activityC53155wgE) {
        return (uYV) activityC53155wgE.sSMYrx();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ SpotDcaTriggerRsiPresenter copydefault(ActivityC53155wgE activityC53155wgE) {
        return (SpotDcaTriggerRsiPresenter) activityC53155wgE.gHZMYf();
    }

    private final java.lang.String copydefault() {
        return (java.lang.String) this.OLrzqt.getValue();
    }

    public static final java.lang.String AYXKKw(ActivityC53155wgE activityC53155wgE) {
        android.content.Intent intent = activityC53155wgE.getIntent();
        if (intent != null) {
            return intent.getStringExtra("bot_inst_id");
        }
        return null;
    }

    @Override // o.AbstractActivityC48163uHh, o.AbstractActivityC54499xKr, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        EZpvd();
        djBIcL();
        KWHzl();
        OLrzqt();
        rVN.reportFullyDrawn$default((android.app.Activity) this, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    private final void EZpvd() {
        java.util.ArrayList parcelableArrayListExtra;
        SpotDcaTriggerRsiPresenter spotDcaTriggerRsiPresenter = (SpotDcaTriggerRsiPresenter) gHZMYf();
        android.content.Intent intent = getIntent();
        spotDcaTriggerRsiPresenter.AEQbTJ((intent == null || (parcelableArrayListExtra = intent.getParcelableArrayListExtra("data")) == null) ? null : (DcaTriggerParam) CollectionsKt___CollectionsKt.firstOrNull(parcelableArrayListExtra));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r1v12, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r1v15, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r1v18, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r1v21, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v3, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v9, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r2v11, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r2v14, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r2v17, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r2v20, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r2v22, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r2v25, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r2v28, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r2v31, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r2v38, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r2v4, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r3v16, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r3v7, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r4v1, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r5v14, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r5v3, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r5v6, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    private final void djBIcL() {
        java.lang.String tholdWarning;
        java.lang.String timePeriod;
        android.widget.ImageView imageView = ((uYV) sSMYrx()).AkhnZx;
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        C33054mpH.EZpvd(imageView, C43454rpb.copydefault("images/trading_bot/android/trade_rsi_kline_spot_dca.png", this, true), (WebSocketProtocol.PAYLOAD_SHORT & 2) != 0 ? 0 : C52761wXj.TaskDescription.DuR, (WebSocketProtocol.PAYLOAD_SHORT & 4) != 0 ? null : null, (WebSocketProtocol.PAYLOAD_SHORT & 8) != 0 ? -1 : 0, (WebSocketProtocol.PAYLOAD_SHORT & 16) == 0 ? 0 : -1, (WebSocketProtocol.PAYLOAD_SHORT & 32) != 0 ? null : new Function0() { // from class: o.wgK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return ActivityC53155wgE.KWHzl(this.KWHzl);
            }
        }, (WebSocketProtocol.PAYLOAD_SHORT & 64) == 0 ? null : null);
        C49960uyR.EZpvd(this, ((uYV) sSMYrx()).fJNWhG, java.lang.Integer.valueOf(C48033uCm.Application.zXhzOT), ((uYV) sSMYrx()).fJNWhG, C55298xhM.dpInt$default(83.0f, (android.content.Context) null, 1, (java.lang.Object) null));
        C47988uAv c47988uAv = ((uYV) sSMYrx()).AYXKKw;
        C47988uAv.setInputLabel$default(c47988uAv, C33070mpX.AYXKKw(C55688xof.Application.fromMediaItem), null, 2, null);
        InputLayoutState inputLayoutState = InputLayoutState.GREY_UN_CLICKABLE;
        C47988uAv.setInputLayoutState$default(c47988uAv, inputLayoutState, false, 2, null);
        DcaTriggerParam dcaTriggerParamEZpvd = ((SpotDcaTriggerRsiPresenter) gHZMYf()).EZpvd();
        C47988uAv.setInputContent$default(c47988uAv, (dcaTriggerParamEZpvd == null || (timePeriod = dcaTriggerParamEZpvd.getTimePeriod()) == null) ? "" : timePeriod, false, false, 6, null);
        C47988uAv c47988uAv2 = ((uYV) sSMYrx()).ejfBZ;
        C47988uAv.setInputLayoutState$default(c47988uAv2, inputLayoutState, false, 2, null);
        c47988uAv2.setInputUnit(C33070mpX.AYXKKw(C55688xof.Application.MediaBrowserCompatSearchResultReceiver));
        c47988uAv2.setInputUnitBolded(true);
        ((uYV) sSMYrx()).DbNXlk.setTitleText(C33070mpX.AYXKKw(C55688xof.Application.heceqZ));
        C53530wnI c53530wnI = ((uYV) sSMYrx()).DbNXlk;
        java.util.List<TradeMenuItemBean> listKWHzl = ((SpotDcaTriggerRsiPresenter) gHZMYf()).KWHzl();
        androidx.fragment.app.FragmentManager supportFragmentManager = getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
        c53530wnI.setTypeMenu(listKWHzl, supportFragmentManager, new Function1() { // from class: o.wgM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC53155wgE.OLrzqt(this.AEQbTJ, (TradeMenuItemBean) obj);
            }
        });
        ((uYV) sSMYrx()).fetchVPNInfo.setText(C33574myy.setupSpanStyles$default(C33069mpW.copydefault(C55688xof.Application.DGUQLI, C56423yEv.EZpvd(C56390yDp.OLrzqt("termRsi", C33070mpX.AYXKKw(C55688xof.Application.OTwTPd)))), new java.lang.String[]{C33070mpX.AYXKKw(C55688xof.Application.OTwTPd)}, 0, null, false, new Function1() { // from class: o.wgN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC53155wgE.OLrzqt(this.KWHzl, (java.util.List) obj);
            }
        }, 14, null));
        C47988uAv c47988uAv3 = ((uYV) sSMYrx()).fJNWhG;
        DcaTriggerParam dcaTriggerParamEZpvd2 = ((SpotDcaTriggerRsiPresenter) gHZMYf()).EZpvd();
        C47988uAv.setInputContent$default(c47988uAv3, dcaTriggerParamEZpvd2 != null ? dcaTriggerParamEZpvd2.getThold() : null, false, false, 6, null);
        ((uYV) sSMYrx()).fJNWhG.setMaxDecimal(0);
        android.widget.TextView textView = ((uYV) sSMYrx()).gEmmrt;
        int i = C55688xof.Application.DGOPHZDGOPHZ;
        DcaTriggerParam dcaTriggerParamEZpvd3 = ((SpotDcaTriggerRsiPresenter) gHZMYf()).EZpvd();
        if (dcaTriggerParamEZpvd3 == null || (tholdWarning = dcaTriggerParamEZpvd3.getTholdWarning()) == null) {
            tholdWarning = "";
        }
        textView.setText(C33069mpW.copydefault(i, C56423yEv.EZpvd(C56390yDp.OLrzqt("tholdNum", tholdWarning))));
        android.widget.TextView textView2 = ((uYV) sSMYrx()).gEmmrt;
        Intrinsics.checkNotNullExpressionValue(textView2, "");
        DcaTriggerParam dcaTriggerParamEZpvd4 = ((SpotDcaTriggerRsiPresenter) gHZMYf()).EZpvd();
        java.lang.String thold = dcaTriggerParamEZpvd4 != null ? dcaTriggerParamEZpvd4.getThold() : null;
        DcaTriggerParam dcaTriggerParamEZpvd5 = ((SpotDcaTriggerRsiPresenter) gHZMYf()).EZpvd();
        textView2.setVisibility(C33129mqd.copydefault(thold, dcaTriggerParamEZpvd5 != null ? dcaTriggerParamEZpvd5.getTholdWarning() : null) ? 0 : 8);
        C52794wYp c52794wYp = ((uYV) sSMYrx()).copydefault;
        c52794wYp.setOnClickListener(new ActionBar(c52794wYp, 1000L, this));
        ((uYV) sSMYrx()).AEQbTJ.setOnClickListener(new View.OnClickListener() { // from class: o.wgP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                ActivityC53155wgE.copydefault(this.copydefault, view);
            }
        });
        ((uYV) sSMYrx()).valueOf.setOnClickListener(new View.OnClickListener() { // from class: o.wgQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                ActivityC53155wgE.EZpvd(this.OLrzqt, view);
            }
        });
        ((uYV) sSMYrx()).fJNWhG.setOnTextChangeCallback(this.EZpvd);
        ((SpotDcaTriggerRsiPresenter) gHZMYf()).AEQbTJ(((uYV) sSMYrx()).fJNWhG.AkhnZx(), copydefault());
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit KWHzl(ActivityC53155wgE activityC53155wgE) {
        android.widget.TextView textView = ((uYV) activityC53155wgE.sSMYrx()).isConnected;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        textView.setVisibility(0);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r3v1, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit OLrzqt(ActivityC53155wgE activityC53155wgE, TradeMenuItemBean tradeMenuItemBean) {
        Intrinsics.checkNotNullParameter(tradeMenuItemBean, "");
        DcaTriggerParam dcaTriggerParamEZpvd = ((SpotDcaTriggerRsiPresenter) activityC53155wgE.gHZMYf()).EZpvd();
        if (dcaTriggerParamEZpvd != null) {
            java.lang.Object data = tradeMenuItemBean.getData();
            Intrinsics.copydefault(data, "");
            dcaTriggerParamEZpvd.setTimeframe((java.lang.String) data);
        }
        ((SpotDcaTriggerRsiPresenter) activityC53155wgE.gHZMYf()).AEQbTJ(((uYV) activityC53155wgE.sSMYrx()).fJNWhG.AkhnZx(), activityC53155wgE.copydefault());
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(ActivityC53155wgE activityC53155wgE, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        list.add(new android.text.style.TextAppearanceSpan(activityC53155wgE, C52761wXj.LoaderManager.ODXsMY));
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v3, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r2v6, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void copydefault(ActivityC53155wgE activityC53155wgE, android.view.View view) {
        activityC53155wgE.KWHzl = !activityC53155wgE.KWHzl;
        ((uYV) activityC53155wgE.sSMYrx()).fetchVPNInfo.setMaxLines(activityC53155wgE.KWHzl ? Integer.MAX_VALUE : 2);
        ((uYV) activityC53155wgE.sSMYrx()).AEQbTJ.setText(C33070mpX.AYXKKw(activityC53155wgE.KWHzl ? C55688xof.Application.getNavigationItemCount : C55688xof.Application.getDisplayOptions));
    }

    public static final void EZpvd(ActivityC53155wgE activityC53155wgE, android.view.View view) {
        final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(activityC53155wgE);
        viewOnClickListenerC54939xaY.EZpvd(activityC53155wgE.getString(C55688xof.Application.DNMMPQ));
        java.lang.String string = activityC53155wgE.getString(C55688xof.Application.QWSkGZ);
        Intrinsics.checkNotNullExpressionValue(string, "");
        viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) string, new View.OnClickListener() { // from class: o.wgJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view2) {
                ActivityC53155wgE.EZpvd(viewOnClickListenerC54939xaY, view2);
            }
        });
        viewOnClickListenerC54939xaY.show();
    }

    public static final void EZpvd(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        viewOnClickListenerC54939xaY.dismiss();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    private final void KWHzl() {
        ((SpotDcaTriggerRsiPresenter) gHZMYf()).AEQbTJ().observe(this, new Activity(new Function1() { // from class: o.wgI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC53155wgE.KWHzl(this.copydefault, (RsiTrigger) obj);
            }
        }));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit KWHzl(ActivityC53155wgE activityC53155wgE, RsiTrigger rsiTrigger) {
        Intrinsics.checkNotNullParameter(rsiTrigger, "");
        ((uYV) activityC53155wgE.sSMYrx()).AuCTel.setText(rsiTrigger.getTriggerNum());
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    private final void OLrzqt() {
        C52794wYp c52794wYp = ((uYV) sSMYrx()).copydefault;
        c52794wYp.setOnClickListener(new TaskDescription(c52794wYp, 1000L, this));
        android.widget.ImageView imageView = ((uYV) sSMYrx()).OLrzqt;
        imageView.setOnClickListener(new StateListAnimator(imageView, 1000L, this));
    }

    /* JADX INFO: renamed from: o.wgE$ActionBar */
    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ android.view.View OLrzqt;
        public final /* synthetic */ ActivityC53155wgE copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, ActivityC53155wgE activityC53155wgE) {
            this.OLrzqt = view;
            this.KWHzl = j;
            this.copydefault = activityC53155wgE;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.KWHzl || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                if (ActivityC53155wgE.OLrzqt(this.copydefault).fJNWhG.hDKMBd() && ActivityC53155wgE.OLrzqt(this.copydefault).fJNWhG.KWHzl()) {
                    DcaTriggerParam dcaTriggerParamEZpvd = ActivityC53155wgE.copydefault(this.copydefault).EZpvd();
                    if (dcaTriggerParamEZpvd != null) {
                        dcaTriggerParamEZpvd.setThold(ActivityC53155wgE.OLrzqt(this.copydefault).fJNWhG.AkhnZx());
                    }
                    ActivityC53155wgE activityC53155wgE = this.copydefault;
                    android.content.Intent intent = new android.content.Intent();
                    intent.putExtra("data", yDY.copydefault(ActivityC53155wgE.copydefault(this.copydefault).EZpvd()));
                    Unit unit = Unit.INSTANCE;
                    activityC53155wgE.setResult(-1, intent);
                }
            }
        }
    }

    /* JADX INFO: renamed from: o.wgE$StateListAnimator */
    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ ActivityC53155wgE AEQbTJ;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, ActivityC53155wgE activityC53155wgE) {
            this.copydefault = view;
            this.KWHzl = j;
            this.AEQbTJ = activityC53155wgE;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.KWHzl || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                this.AEQbTJ.finish();
            }
        }
    }

    /* JADX INFO: renamed from: o.wgE$TaskDescription */
    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ ActivityC53155wgE EZpvd;
        public final /* synthetic */ android.view.View KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, ActivityC53155wgE activityC53155wgE) {
            this.KWHzl = view;
            this.AEQbTJ = j;
            this.EZpvd = activityC53155wgE;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.AEQbTJ || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                if (ActivityC53155wgE.OLrzqt(this.EZpvd).fJNWhG.hDKMBd() && ActivityC53155wgE.OLrzqt(this.EZpvd).fJNWhG.KWHzl()) {
                    DcaTriggerParam dcaTriggerParamEZpvd = ActivityC53155wgE.copydefault(this.EZpvd).EZpvd();
                    if (dcaTriggerParamEZpvd != null) {
                        dcaTriggerParamEZpvd.setThold(ActivityC53155wgE.OLrzqt(this.EZpvd).fJNWhG.AkhnZx());
                    }
                    ActivityC53155wgE activityC53155wgE = this.EZpvd;
                    android.content.Intent intent = new android.content.Intent();
                    intent.putExtra("data", yDY.copydefault(ActivityC53155wgE.copydefault(this.EZpvd).EZpvd()));
                    Unit unit = Unit.INSTANCE;
                    activityC53155wgE.setResult(-1, intent);
                    this.EZpvd.finish();
                }
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r4v6, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit KWHzl(ActivityC53155wgE activityC53155wgE, C47988uAv c47988uAv, java.lang.String str) {
        Intrinsics.checkNotNullParameter(c47988uAv, "");
        android.widget.TextView textView = ((uYV) activityC53155wgE.sSMYrx()).gEmmrt;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        java.lang.String strAkhnZx = c47988uAv.AkhnZx();
        DcaTriggerParam dcaTriggerParamEZpvd = ((SpotDcaTriggerRsiPresenter) activityC53155wgE.gHZMYf()).EZpvd();
        textView.setVisibility(C33129mqd.copydefault(strAkhnZx, dcaTriggerParamEZpvd != null ? dcaTriggerParamEZpvd.getTholdWarning() : null) ? 0 : 8);
        ((SpotDcaTriggerRsiPresenter) activityC53155wgE.gHZMYf()).AEQbTJ(c47988uAv.AkhnZx(), activityC53155wgE.copydefault());
        activityC53155wgE.AEQbTJ();
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v11, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v5, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v8, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public final void AEQbTJ() {
        java.lang.String strAkhnZx = ((uYV) sSMYrx()).fJNWhG.AkhnZx();
        if (C33129mqd.AEQbTJ(strAkhnZx, 100)) {
            ((uYV) sSMYrx()).fJNWhG.setInputErrorMsg(C33069mpW.copydefault(C55688xof.Application.QSLkRj, C56424yEw.gEmmrt(C56390yDp.OLrzqt("fieldName", C33070mpX.AYXKKw(C55688xof.Application.hCLrkq)), C56390yDp.OLrzqt("minValue", "100"))));
        } else if (C33129mqd.gEmmrt(strAkhnZx, 1)) {
            ((uYV) sSMYrx()).fJNWhG.setInputErrorMsg(C33069mpW.copydefault(C55688xof.Application.QwvEab, C56424yEw.gEmmrt(C56390yDp.OLrzqt("fieldName", C33070mpX.AYXKKw(C55688xof.Application.hCLrkq)), C56390yDp.OLrzqt("minValue", "1"))));
        } else {
            ((uYV) sSMYrx()).fJNWhG.copydefault();
        }
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
