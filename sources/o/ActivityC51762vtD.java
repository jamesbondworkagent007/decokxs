package o;

import android.text.InputFilter;
import android.view.View;
import android.widget.TextView;
import androidx.lifecycle.Observer;
import com.okinc.business.defi.wallet.transaction.moduleModel.bean.DataInputModuleModel;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.liveness.lca.EopTrackEvent;
import com.okinc.rxutils.RxBus;
import com.okinc.uilab.edit.OKEditText;
import com.okinc.unify_trade.biz.AutoVipProfitInfo;
import com.okinc.unify_trade.biz.EntrySignalOrderAmtParam;
import com.okinc.unify_trade.biz.ExitSignalOrderAmtParam;
import com.okinc.unify_trade.biz.SignalBotReq;
import com.okinc.unify_trade.biz.SignalListItem;
import com.okinc.unify_trade.biz.SignalPublishInfo;
import com.okinc.unify_trade.biz.StrategyConfigInfo;
import com.okinc.unify_trade.biz.ThirdSignalDetail;
import com.okinc.unify_trade.bot.data.SignalCoinPairItemData;
import com.okinc.unify_trade.bot.signalbot.viewmodel.BotSignalPublishPresenter;
import com.okinc.web3.security.track.Web3SecurityTrackEvent;
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
import o.vYH;
import o.vYW;
import o.vZA;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.vtD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class ActivityC51762vtD extends AbstractActivityC48163uHh<uYD, BotSignalPublishPresenter> {
    public static final ActionBar Companion = new ActionBar(null);
    public final Function2<C47988uAv, java.lang.String, Unit> KWHzl = new Function2() { // from class: o.vtH
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
            return ActivityC51762vtD.OLrzqt(this.OLrzqt, (C47988uAv) obj, (java.lang.String) obj2);
        }
    };

    /* JADX INFO: renamed from: o.vtD$LoaderManager */
    public static final /* synthetic */ class LoaderManager implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public LoaderManager(Function1 function1) {
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
        return C48033uCm.Activity.GhqvEQ;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ uYD AEQbTJ(ActivityC51762vtD activityC51762vtD) {
        return (uYD) activityC51762vtD.sSMYrx();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ BotSignalPublishPresenter EZpvd(ActivityC51762vtD activityC51762vtD) {
        return (BotSignalPublishPresenter) activityC51762vtD.gHZMYf();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v2, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit OLrzqt(ActivityC51762vtD activityC51762vtD, C47988uAv c47988uAv, java.lang.String str) {
        Intrinsics.checkNotNullParameter(c47988uAv, "");
        if (Intrinsics.EZpvd(c47988uAv, ((uYD) activityC51762vtD.sSMYrx()).AYXKKw)) {
            activityC51762vtD.KWHzl();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.vtD$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.vtD.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final void AEQbTJ(@NotNull android.content.Context context, @NotNull SignalPublishInfo signalPublishInfo) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(signalPublishInfo, "");
            android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) ActivityC51762vtD.class);
            intent.putExtra("data", signalPublishInfo);
            context.startActivity(intent);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v1, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractActivityC48163uHh, o.AbstractActivityC54499xKr, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        OLrzqt();
        AhwBna();
        djBIcL();
        EZpvd();
        gEmmrt();
        ((BotSignalPublishPresenter) gHZMYf()).AEQbTJ();
        C32866mlf.onEvent$default("SignalPublish_Full_Page_View", (TrackChannel[]) null, new Function1() { // from class: o.vtL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC51762vtD.AEQbTJ(this.EZpvd, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
        rVN.reportFullyDrawn$default((android.app.Activity) this, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r8v1, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit AEQbTJ(ActivityC51762vtD activityC51762vtD, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        SignalPublishInfo signalPublishInfoValueOf = ((BotSignalPublishPresenter) activityC51762vtD.gHZMYf()).valueOf();
        EventParamsList.put$default(eventParamsList, "from", C33129mqd.OLrzqt((java.lang.CharSequence) (signalPublishInfoValueOf != null ? signalPublishInfoValueOf.getSignalStatus() : null)) ? "2" : "1", false, 4, null);
        SignalPublishInfo signalPublishInfoValueOf2 = ((BotSignalPublishPresenter) activityC51762vtD.gHZMYf()).valueOf();
        EventParamsList.put$default(eventParamsList, "status", C33129mqd.OLrzqt((java.lang.CharSequence) (signalPublishInfoValueOf2 != null ? signalPublishInfoValueOf2.getSignalStatus() : null)) ? "Modify_release" : "First_release", false, 4, null);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    private final void OLrzqt() {
        ((BotSignalPublishPresenter) gHZMYf()).KWHzl((SignalPublishInfo) getIntent().getParcelableExtra("data"));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v10, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v14, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v19, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v22, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v25, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v28, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v31, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v36, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v41, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v6, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r3v8, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    private final void AhwBna() {
        java.lang.String recommendLeverage;
        java.lang.String recommendInvestAmount;
        ((uYD) sSMYrx()).fetchVPNInfo.setActivated(true);
        ((uYD) sSMYrx()).isConnected.setActivated(true);
        AEQbTJ(((uYD) sSMYrx()).copydefault.copydefault());
        AEQbTJ(((uYD) sSMYrx()).copydefault.EZpvd());
        SignalPublishInfo signalPublishInfoValueOf = ((BotSignalPublishPresenter) gHZMYf()).valueOf();
        KWHzl(signalPublishInfoValueOf != null ? signalPublishInfoValueOf.getSignalStatus() : null);
        C51784vtZ c51784vtZ = ((uYD) sSMYrx()).fJNWhG;
        c51784vtZ.setRemoveCoinPairCallback(new Function1() { // from class: o.vtM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC51762vtD.OLrzqt(this.KWHzl, (SignalCoinPairItemData) obj);
            }
        });
        c51784vtZ.setShowSelectedPairCallback(new Function0() { // from class: o.vtO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return ActivityC51762vtD.gEmmrt(this.KWHzl);
            }
        });
        ((uYD) sSMYrx()).copydefault.setSubscribeTypeCallback(new Function1() { // from class: o.vtN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC51762vtD.KWHzl(this.OLrzqt, (java.lang.String) obj);
            }
        });
        ((uYD) sSMYrx()).copydefault.setCbCheckedCallback(new Function2() { // from class: o.vtK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return ActivityC51762vtD.copydefault(this.copydefault, (java.lang.String) obj, ((java.lang.Boolean) obj2).booleanValue());
            }
        });
        C50191vFg c50191vFg = ((uYD) sSMYrx()).valueOf;
        c50191vFg.setTextPlaceHolder(C33070mpX.AYXKKw(C55688xof.Application.handleOnBackPressed));
        c50191vFg.KWHzl(C33070mpX.copydefault(C52761wXj.Activity.aappFQ));
        SignalPublishInfo signalPublishInfoValueOf2 = ((BotSignalPublishPresenter) gHZMYf()).valueOf();
        if (signalPublishInfoValueOf2 == null || (recommendLeverage = signalPublishInfoValueOf2.getRecommendLeverage()) == null) {
            recommendLeverage = "10";
        }
        c50191vFg.OLrzqt(recommendLeverage);
        C47988uAv c47988uAv = ((uYD) sSMYrx()).AYXKKw;
        c47988uAv.setOnTextChangeCallback(this.KWHzl);
        c47988uAv.setInputUnit("USDT");
        c47988uAv.setMaxDecimal(2);
        SignalPublishInfo signalPublishInfoValueOf3 = ((BotSignalPublishPresenter) gHZMYf()).valueOf();
        if (signalPublishInfoValueOf3 == null || (recommendInvestAmount = signalPublishInfoValueOf3.getRecommendInvestAmount()) == null) {
            recommendInvestAmount = "";
        }
        C47988uAv.setInputContent$default(c47988uAv, recommendInvestAmount, false, false, 6, null);
        android.widget.TextView textView = ((uYD) sSMYrx()).ejfBZ;
        android.graphics.drawable.Drawable drawableKWHzl = C33070mpX.KWHzl(C52761wXj.TaskDescription.fzHEvu);
        if (drawableKWHzl != null) {
            drawableKWHzl.setBounds(0, 0, C55298xhM.dp2px$default(14.0f, null, 1, null), C55298xhM.dp2px$default(14.0f, null, 1, null));
        } else {
            drawableKWHzl = null;
        }
        textView.setCompoundDrawablesRelative(drawableKWHzl, null, null, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit OLrzqt(ActivityC51762vtD activityC51762vtD, SignalCoinPairItemData signalCoinPairItemData) {
        Intrinsics.checkNotNullParameter(signalCoinPairItemData, "");
        ((BotSignalPublishPresenter) activityC51762vtD.gHZMYf()).AEQbTJ(signalCoinPairItemData);
        ((uYD) activityC51762vtD.sSMYrx()).fJNWhG.EZpvd(((BotSignalPublishPresenter) activityC51762vtD.gHZMYf()).AYXKKw());
        activityC51762vtD.KWHzl();
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit gEmmrt(ActivityC51762vtD activityC51762vtD) {
        vYH.Activity activity = vYH.Companion;
        java.util.ArrayList<SignalCoinPairItemData> arrayListAYXKKw = ((BotSignalPublishPresenter) activityC51762vtD.gHZMYf()).AYXKKw();
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(arrayListAYXKKw, 10));
        java.util.Iterator<T> it = arrayListAYXKKw.iterator();
        while (it.hasNext()) {
            arrayList.add(((SignalCoinPairItemData) it.next()).getInstId());
        }
        activity.AEQbTJ(new SignalBotReq((java.lang.String) null, (java.lang.String) null, arrayList, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (EntrySignalOrderAmtParam) null, (ExitSignalOrderAmtParam) null, false, (ThirdSignalDetail) null, false, (java.util.ArrayList) null, (java.lang.String) null, (AutoVipProfitInfo) null, 32763, (DefaultConstructorMarker) null)).show(activityC51762vtD.getSupportFragmentManager(), "SignalBotInstIdsDialog");
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit KWHzl(ActivityC51762vtD activityC51762vtD, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        ((BotSignalPublishPresenter) activityC51762vtD.gHZMYf()).copydefault(str);
        activityC51762vtD.KWHzl();
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v2, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit copydefault(final ActivityC51762vtD activityC51762vtD, java.lang.String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        if (z) {
            ((uYD) activityC51762vtD.sSMYrx()).AkhnZx.post(new java.lang.Runnable() { // from class: o.vtX
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    ActivityC51762vtD.AhwBna(this.EZpvd);
                }
            });
        }
        activityC51762vtD.AEQbTJ(Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "profit_sharing") ? "profits_sharing" : "subscription");
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void AhwBna(ActivityC51762vtD activityC51762vtD) {
        ((uYD) activityC51762vtD.sSMYrx()).AkhnZx.fullScroll(130);
    }

    /* JADX INFO: renamed from: o.vtD$Activity */
    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ ActivityC51762vtD EZpvd;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, ActivityC51762vtD activityC51762vtD) {
            this.KWHzl = view;
            this.copydefault = j;
            this.EZpvd = activityC51762vtD;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.copydefault || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                vYW.ActionBar actionBar = vYW.Companion;
                java.lang.String strEZpvd = ActivityC51762vtD.AEQbTJ(this.EZpvd).valueOf.EZpvd();
                StrategyConfigInfo value = ActivityC51762vtD.EZpvd(this.EZpvd).copydefault().getValue();
                java.lang.String leveragePercents = value != null ? value.getLeveragePercents() : null;
                StrategyConfigInfo value2 = ActivityC51762vtD.EZpvd(this.EZpvd).copydefault().getValue();
                java.lang.String minLever = value2 != null ? value2.getMinLever() : null;
                StrategyConfigInfo value3 = ActivityC51762vtD.EZpvd(this.EZpvd).copydefault().getValue();
                actionBar.EZpvd(strEZpvd, leveragePercents, minLever, value3 != null ? value3.getMaxLever() : null, this.EZpvd.getSupportFragmentManager(), ActivityC51762vtD.EZpvd(this.EZpvd).values(), ActivityC51762vtD.EZpvd(this.EZpvd).AYXKKw(), this.EZpvd.new Fragment());
            }
        }
    }

    /* JADX INFO: renamed from: o.vtD$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ ActivityC51762vtD EZpvd;
        public final /* synthetic */ long OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, ActivityC51762vtD activityC51762vtD) {
            this.AEQbTJ = view;
            this.OLrzqt = j;
            this.EZpvd = activityC51762vtD;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.OLrzqt || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                this.EZpvd.AEQbTJ(EopTrackEvent.EXIT);
                this.EZpvd.finish();
            }
        }
    }

    /* JADX INFO: renamed from: o.vtD$StateListAnimator */
    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ ActivityC51762vtD EZpvd;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, ActivityC51762vtD activityC51762vtD) {
            this.copydefault = view;
            this.OLrzqt = j;
            this.EZpvd = activityC51762vtD;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.OLrzqt || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                BotSignalPublishPresenter botSignalPublishPresenterEZpvd = ActivityC51762vtD.EZpvd(this.EZpvd);
                android.text.Editable text = ActivityC51762vtD.AEQbTJ(this.EZpvd).fetchVPNInfo.getText();
                java.lang.String strGEmmrt = C33129mqd.gEmmrt(text != null ? StringsKt__StringsKt.hDKMBd(text) : null);
                android.text.Editable text2 = ActivityC51762vtD.AEQbTJ(this.EZpvd).isConnected.getText();
                botSignalPublishPresenterEZpvd.KWHzl(strGEmmrt, C33129mqd.gEmmrt(text2 != null ? StringsKt__StringsKt.hDKMBd(text2) : null), ActivityC51762vtD.AEQbTJ(this.EZpvd).copydefault.AEQbTJ(), ActivityC51762vtD.AEQbTJ(this.EZpvd).copydefault.djBIcL(), ActivityC51762vtD.AEQbTJ(this.EZpvd).valueOf.EZpvd(), ActivityC51762vtD.AEQbTJ(this.EZpvd).AYXKKw.AkhnZx());
                this.EZpvd.AEQbTJ(Web3SecurityTrackEvent.VALUE_CONFIRM);
            }
        }
    }

    /* JADX INFO: renamed from: o.vtD$TaskDescription */
    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ ActivityC51762vtD copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, ActivityC51762vtD activityC51762vtD) {
            this.KWHzl = view;
            this.EZpvd = j;
            this.copydefault = activityC51762vtD;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.EZpvd || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                ActivityC51762vtD.EZpvd(this.copydefault).OLrzqt();
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v10, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public final boolean copydefault() {
        android.text.Editable text = ((uYD) sSMYrx()).fetchVPNInfo.getText();
        java.lang.CharSequence charSequenceHDKMBd = text != null ? StringsKt__StringsKt.hDKMBd(text) : null;
        C33129mqd.OLrzqt(charSequenceHDKMBd);
        boolean zAEQbTJ = ((BotSignalPublishPresenter) gHZMYf()).AEQbTJ(C33129mqd.gEmmrt(charSequenceHDKMBd));
        ((uYD) sSMYrx()).gEmmrt.setText(C33129mqd.gEmmrt(charSequenceHDKMBd).length() + "/50");
        android.widget.TextView textView = ((uYD) sSMYrx()).djBIcL;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        textView.setVisibility(zAEQbTJ ? 8 : 0);
        return zAEQbTJ;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v10, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v15, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v5, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r2v6, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    private final boolean AEQbTJ() {
        if (StringsKt__StringsKt.fARcdN((java.lang.CharSequence) ((uYD) sSMYrx()).AYXKKw.AkhnZx())) {
            ((uYD) sSMYrx()).AYXKKw.copydefault();
            return false;
        }
        if (C33129mqd.valueOf(((uYD) sSMYrx()).AYXKKw.AkhnZx(), 0)) {
            ((uYD) sSMYrx()).AYXKKw.setInputErrorMsg(C33069mpW.copydefault(C55688xof.Application.ActivityResultContractsPickMultipleVisualMediaCompanion, C56424yEw.gEmmrt(C56390yDp.OLrzqt("fieldName", C33070mpX.AYXKKw(C55688xof.Application.ActivityComposeUtilsKt)), C56390yDp.OLrzqt("lowLimit", xMR.copydefault.copydefault("0")))));
            return false;
        }
        ((uYD) sSMYrx()).AYXKKw.copydefault();
        return true;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractActivityC54499xKr, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        ((uYD) sSMYrx()).AYXKKw.setOnTextChangeCallback(null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v11, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v4, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r3v1, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r3v10, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r3v13, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r3v16, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r3v19, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r3v4, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r3v7, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public final void OLrzqt(int i, final int i2) {
        java.lang.String signalChanName;
        java.lang.String signalDescription;
        OKEditText oKEditText = ((uYD) sSMYrx()).fetchVPNInfo;
        java.lang.String str = "";
        Intrinsics.checkNotNullExpressionValue(oKEditText, "");
        KWHzl(oKEditText, i);
        OKEditText oKEditText2 = ((uYD) sSMYrx()).isConnected;
        Intrinsics.checkNotNullExpressionValue(oKEditText2, "");
        KWHzl(oKEditText2, i2);
        OKEditText oKEditText3 = ((uYD) sSMYrx()).fetchVPNInfo;
        Intrinsics.checkNotNullExpressionValue(oKEditText3, "");
        C33606mzd.AEQbTJ(oKEditText3, new Function1() { // from class: o.vtF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC51762vtD.copydefault(this.EZpvd, (java.lang.CharSequence) obj);
            }
        });
        OKEditText oKEditText4 = ((uYD) sSMYrx()).fetchVPNInfo;
        SignalPublishInfo signalPublishInfoValueOf = ((BotSignalPublishPresenter) gHZMYf()).valueOf();
        if (signalPublishInfoValueOf == null || (signalChanName = signalPublishInfoValueOf.getSignalChanName()) == null) {
            signalChanName = "";
        }
        oKEditText4.setText(signalChanName);
        ((uYD) sSMYrx()).gEmmrt.setText("0/50");
        OKEditText oKEditText5 = ((uYD) sSMYrx()).isConnected;
        Intrinsics.checkNotNullExpressionValue(oKEditText5, "");
        C33606mzd.AEQbTJ(oKEditText5, new Function1() { // from class: o.vtG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC51762vtD.OLrzqt(this.AEQbTJ, i2, (java.lang.CharSequence) obj);
            }
        });
        OKEditText oKEditText6 = ((uYD) sSMYrx()).isConnected;
        SignalPublishInfo signalPublishInfoValueOf2 = ((BotSignalPublishPresenter) gHZMYf()).valueOf();
        if (signalPublishInfoValueOf2 != null && (signalDescription = signalPublishInfoValueOf2.getSignalDescription()) != null) {
            str = signalDescription;
        }
        oKEditText6.setText(str);
        ((uYD) sSMYrx()).isConnected.setHint(C33069mpW.copydefault(C55688xof.Application.onNavigationEvent, C56423yEv.EZpvd(C56390yDp.OLrzqt(DataInputModuleModel.DataInputItem.INPUT_TYPE_NUMBER, xMR.copydefault.copydefault(java.lang.String.valueOf(i2))))));
    }

    public static final Unit copydefault(ActivityC51762vtD activityC51762vtD, java.lang.CharSequence charSequence) {
        activityC51762vtD.KWHzl();
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit OLrzqt(ActivityC51762vtD activityC51762vtD, int i, java.lang.CharSequence charSequence) {
        android.widget.TextView textView = ((uYD) activityC51762vtD.sSMYrx()).KWHzl;
        int length = charSequence != null ? charSequence.length() : 0;
        textView.setText(length + "/" + xMR.copydefault.copydefault(java.lang.String.valueOf(i)));
        activityC51762vtD.KWHzl();
        return Unit.INSTANCE;
    }

    public final void AEQbTJ(C47988uAv c47988uAv) {
        int i = C48033uCm.Application.removeReporter;
        C49960uyR.EZpvd(this, c47988uAv, java.lang.Integer.valueOf(i), c47988uAv, C55298xhM.dpInt$default(75, (android.content.Context) null, 1, (java.lang.Object) null));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v11, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r2v2, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r2v5, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r2v8, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public final void KWHzl(java.lang.String str) {
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "publish_rejected")) {
            ((uYD) sSMYrx()).AuCTel.setTitle(C33070mpX.AYXKKw(C55688xof.Application.invokespecialhrnhsO));
            ((uYD) sSMYrx()).AuCTel.setMessage(C33070mpX.AYXKKw(C55688xof.Application.fGT));
        } else {
            ((uYD) sSMYrx()).AuCTel.setTitle(C33070mpX.AYXKKw(C55688xof.Application.OGitdB));
            ((uYD) sSMYrx()).AuCTel.setMessage(C33070mpX.AYXKKw(C55688xof.Application.avCqka));
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v10, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v13, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v7, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    private final void djBIcL() {
        ((BotSignalPublishPresenter) gHZMYf()).AhwBna().observe(this, new LoaderManager(new Function1() { // from class: o.vtT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC51762vtD.EZpvd(this.OLrzqt, (java.util.ArrayList) obj);
            }
        }));
        ((BotSignalPublishPresenter) gHZMYf()).djBIcL().AhwBna().observe(this, new Observer() { // from class: o.vtQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.lifecycle.Observer
            public final void onChanged(java.lang.Object obj) {
                ActivityC51762vtD.EZpvd((java.lang.Exception) obj);
            }
        });
        ((BotSignalPublishPresenter) gHZMYf()).gEmmrt().observe(this, new LoaderManager(new Function1() { // from class: o.vtV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC51762vtD.copydefault(this.AEQbTJ, (SignalListItem) obj);
            }
        }));
        ((BotSignalPublishPresenter) gHZMYf()).copydefault().observe(this, new LoaderManager(new Function1() { // from class: o.vtW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC51762vtD.copydefault(this.AEQbTJ, (StrategyConfigInfo) obj);
            }
        }));
        ((BotSignalPublishPresenter) gHZMYf()).getAggregateErrorLiveData().observe(this, new LoaderManager(new Function1() { // from class: o.vtY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC51762vtD.copydefault(this.EZpvd, (androidx.core.util.Pair) obj);
            }
        }));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r9v1, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r9v4, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit EZpvd(final ActivityC51762vtD activityC51762vtD, java.util.ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        java.lang.String strEZpvd = ((uYD) activityC51762vtD.sSMYrx()).valueOf.EZpvd();
        vZA vzaNewInstance$default = vZA.Activity.newInstance$default(vZA.Companion, ((BotSignalPublishPresenter) activityC51762vtD.gHZMYf()).OLrzqt(strEZpvd), strEZpvd, null, new Function2() { // from class: o.vtS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return ActivityC51762vtD.KWHzl(this.EZpvd, (java.util.List) obj, ((java.lang.Boolean) obj2).booleanValue());
            }
        }, 4, null);
        androidx.fragment.app.FragmentManager supportFragmentManager = activityC51762vtD.getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
        vzaNewInstance$default.show(supportFragmentManager);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r3v1, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit KWHzl(ActivityC51762vtD activityC51762vtD, java.util.List list, boolean z) {
        Intrinsics.checkNotNullParameter(list, "");
        ((BotSignalPublishPresenter) activityC51762vtD.gHZMYf()).copydefault(list, z);
        ((uYD) activityC51762vtD.sSMYrx()).fJNWhG.EZpvd(list);
        activityC51762vtD.KWHzl();
        return Unit.INSTANCE;
    }

    public static final void EZpvd(java.lang.Exception exc) {
        Intrinsics.checkNotNullParameter(exc, "");
        java.lang.String message = exc.getMessage();
        if (message != null) {
            C55326xho.toastWithFailedIcon$default(message, 0, 1, (java.lang.Object) null);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit copydefault(ActivityC51762vtD activityC51762vtD, SignalListItem signalListItem) {
        Intrinsics.checkNotNullParameter(signalListItem, "");
        SignalPublishInfo signalPublishInfoValueOf = ((BotSignalPublishPresenter) activityC51762vtD.gHZMYf()).valueOf();
        if (C33129mqd.OLrzqt((java.lang.CharSequence) (signalPublishInfoValueOf != null ? signalPublishInfoValueOf.getSignalStatus() : null))) {
            activityC51762vtD.setResult(-1);
        } else {
            RxBus.KWHzl("signal_publish_success");
        }
        activityC51762vtD.finish();
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(ActivityC51762vtD activityC51762vtD, StrategyConfigInfo strategyConfigInfo) {
        Intrinsics.checkNotNullParameter(strategyConfigInfo, "");
        activityC51762vtD.OLrzqt(C33129mqd.AEQbTJ(java.lang.Integer.valueOf(C33129mqd.AhwBna(strategyConfigInfo.getMaxNumberOfSignalName())), 0) ? C33129mqd.AhwBna(strategyConfigInfo.getMaxNumberOfSignalName()) : 30, C33129mqd.AEQbTJ(java.lang.Integer.valueOf(C33129mqd.AhwBna(strategyConfigInfo.getMaxNumberOfSignalDescription())), 0) ? C33129mqd.AhwBna(strategyConfigInfo.getMaxNumberOfSignalDescription()) : 500);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: F */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit copydefault(ActivityC51762vtD activityC51762vtD, androidx.core.util.Pair pair) {
        if (Intrinsics.EZpvd(pair.first, (java.lang.Object) ((BotSignalPublishPresenter) activityC51762vtD.gHZMYf()).EZpvd().bB_())) {
            activityC51762vtD.OLrzqt(30, 500);
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v12, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v6, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v9, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    private final void EZpvd() {
        android.widget.ImageView imageView = ((uYD) sSMYrx()).AEQbTJ;
        imageView.setOnClickListener(new Application(imageView, 1000L, this));
        ((uYD) sSMYrx()).copydefault.setChargeTypeChangedCallback(new Function1() { // from class: o.vtP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC51762vtD.AEQbTJ(this.EZpvd, ((java.lang.Boolean) obj).booleanValue());
            }
        });
        C50191vFg c50191vFg = ((uYD) sSMYrx()).valueOf;
        c50191vFg.setOnClickListener(new Activity(c50191vFg, 1000L, this));
        C52794wYp c52794wYp = ((uYD) sSMYrx()).OLrzqt;
        c52794wYp.setOnClickListener(new StateListAnimator(c52794wYp, 1000L, this));
        android.widget.FrameLayout frameLayout = ((uYD) sSMYrx()).uzCIH;
        frameLayout.setOnClickListener(new TaskDescription(frameLayout, 1000L, this));
        C59541ziw.EZpvd(this, this, new Dialog());
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit AEQbTJ(final ActivityC51762vtD activityC51762vtD, boolean z) {
        ((uYD) activityC51762vtD.sSMYrx()).AkhnZx.post(new java.lang.Runnable() { // from class: o.vtR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                ActivityC51762vtD.djBIcL(this.AEQbTJ);
            }
        });
        activityC51762vtD.AEQbTJ(z ? "Free" : "Paid");
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void djBIcL(ActivityC51762vtD activityC51762vtD) {
        ((uYD) activityC51762vtD.sSMYrx()).AkhnZx.fullScroll(130);
    }

    /* JADX INFO: renamed from: o.vtD$Fragment */
    public static final class Fragment implements Function2<java.lang.String, java.util.ArrayList<SignalCoinPairItemData>, Unit> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Fragment() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function2
        public /* synthetic */ Unit invoke(java.lang.String str, java.util.ArrayList<SignalCoinPairItemData> arrayList) {
            KWHzl(str, arrayList);
            return Unit.INSTANCE;
        }

        public final void KWHzl(java.lang.String str, java.util.ArrayList<SignalCoinPairItemData> arrayList) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(arrayList, "");
            ActivityC51762vtD.AEQbTJ(ActivityC51762vtD.this).valueOf.OLrzqt(str);
            ActivityC51762vtD.EZpvd(ActivityC51762vtD.this).OLrzqt(arrayList);
            ActivityC51762vtD.AEQbTJ(ActivityC51762vtD.this).fJNWhG.EZpvd(ActivityC51762vtD.EZpvd(ActivityC51762vtD.this).AYXKKw());
            ActivityC51762vtD.this.KWHzl();
        }
    }

    /* JADX INFO: renamed from: o.vtD$Dialog */
    public static final class Dialog implements InterfaceC59496ziD {
        public Dialog() {
        }

        @Override // o.InterfaceC59496ziD
        public void OLrzqt(boolean z) {
            if (z) {
                return;
            }
            ActivityC51762vtD.AEQbTJ(ActivityC51762vtD.this).fetchVPNInfo.clearFocus();
            ActivityC51762vtD.AEQbTJ(ActivityC51762vtD.this).isConnected.clearFocus();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v10, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v15, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: Binding */
    /* JADX DEBUG: Possible override for method o.xKr.KWHzl()Ljava/lang/Class; */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void KWHzl() {
        boolean z;
        if (copydefault()) {
            android.text.Editable text = ((uYD) sSMYrx()).isConnected.getText();
            if (C33129mqd.OLrzqt(text != null ? StringsKt__StringsKt.hDKMBd(text) : null) && (!((BotSignalPublishPresenter) gHZMYf()).AYXKKw().isEmpty()) && (!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) ((uYD) sSMYrx()).valueOf.EZpvd())) && AEQbTJ()) {
                z = true;
            }
        } else {
            z = false;
        }
        ((uYD) sSMYrx()).OLrzqt.setEnabled(z && ((uYD) sSMYrx()).copydefault.KWHzl());
    }

    private final void KWHzl(final android.widget.EditText editText, int i) {
        editText.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: o.vtI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(android.widget.TextView textView, int i2, android.view.KeyEvent keyEvent) {
                return ActivityC51762vtD.EZpvd(textView, i2, keyEvent);
            }
        });
        editText.setFilters(new android.text.InputFilter[]{new android.text.InputFilter() { // from class: o.vtJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.text.InputFilter
            public final java.lang.CharSequence filter(java.lang.CharSequence charSequence, int i2, int i3, android.text.Spanned spanned, int i4, int i5) {
                return ActivityC51762vtD.AEQbTJ(editText, charSequence, i2, i3, spanned, i4, i5);
            }
        }, new InputFilter.LengthFilter(i)});
    }

    public static final boolean EZpvd(android.widget.TextView textView, int i, android.view.KeyEvent keyEvent) {
        java.lang.CharSequence text = textView.getText();
        Intrinsics.checkNotNullExpressionValue(text, "");
        return StringsKt__StringsKt.fARcdN(text) && keyEvent != null && keyEvent.getKeyCode() == 66;
    }

    public static final java.lang.CharSequence AEQbTJ(android.widget.EditText editText, java.lang.CharSequence charSequence, int i, int i2, android.text.Spanned spanned, int i3, int i4) {
        Intrinsics.copydefault(charSequence);
        if (StringsKt__StringsKt.fARcdN(charSequence)) {
            android.text.Editable text = editText.getText();
            Intrinsics.checkNotNullExpressionValue(text, "");
            if (StringsKt__StringsKt.fARcdN(text)) {
                return "";
            }
        }
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    private final void gEmmrt() {
        uYD uyd = (uYD) sSMYrx();
        C49960uyR.setWindowSoftInput$default(this, uyd.AYXKKw, java.lang.Integer.valueOf(C48033uCm.Application.fvQaOB), uyd.AYXKKw, 0, 8, (java.lang.Object) null);
    }

    public final void AEQbTJ(final java.lang.String str) {
        C32866mlf.onEvent$default("SignalPublish_Full_Page_Click", (TrackChannel[]) null, new Function1() { // from class: o.vtC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC51762vtD.KWHzl(this.copydefault, str, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r13v1, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r14v1, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit KWHzl(ActivityC51762vtD activityC51762vtD, java.lang.String str, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        SignalPublishInfo signalPublishInfoValueOf = ((BotSignalPublishPresenter) activityC51762vtD.gHZMYf()).valueOf();
        EventParamsList.put$default(eventParamsList, "from", C33129mqd.OLrzqt((java.lang.CharSequence) (signalPublishInfoValueOf != null ? signalPublishInfoValueOf.getSignalStatus() : null)) ? "2" : "1", false, 4, null);
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_BUTTON_NAME, str, false, 4, null);
        EventParamsList.put$default(eventParamsList, "token_name", ((BotSignalPublishPresenter) activityC51762vtD.gHZMYf()).KWHzl(), false, 4, null);
        EventParamsList.put$default(eventParamsList, "profit_sharing_ratio", ((uYD) activityC51762vtD.sSMYrx()).copydefault.OLrzqt(), false, 4, null);
        return Unit.INSTANCE;
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
