package o;

import android.graphics.Color;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.lifecycle.FlowExtKt;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.appsflyer.AppsFlyerProperties;
import com.okinc.account.api.model.security.otp.OtpEventTracker;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.liveness.lca.EopTrackEvent;
import com.okinc.p2p.api.OtcExtraKeys;
import com.okinc.social_trade_api.data.BusinessLine;
import com.okinc.tradeapi.bean.BizApiException;
import com.okinc.tradingbot.impl.market_place.bot_copy.BotCopyActivity$addObserver$8;
import com.okinc.tradingbot.impl.market_place.bot_copy.itembinder.BotCopyTraderInfoData;
import com.okinc.tradingbot.impl.market_place.bot_copy.presenter.StgyCopyPresenter;
import com.okinc.unify_trade.biz.BotLeadOverviewModel;
import com.okinc.unify_trade.biz.BotTradeData;
import com.okinc.unify_trade.biz.LossInsurance;
import com.okinc.unify_trade.biz.MpStgyInfo;
import com.okinc.unify_trade.biz.MpStgyParam;
import com.okinc.unify_trade.bot.data.BotGuideData;
import com.okinc.unify_trade.bot.data.MpStgyCopyProfitChangeData;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
import o.ActivityC51071vgB;
import o.C32113mPz;
import o.C48033uCm;
import o.C51294vkM;
import o.C52761wXj;
import o.C52812wZg;
import o.C55688xof;
import o.InterfaceC49317umK;
import o.InterfaceC49496upe;
import o.wUE;
import okhttp3.internal.ws.WebSocketProtocol;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.vgB, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class ActivityC51071vgB extends AbstractActivityC51212vik<AbstractC48304uMn, StgyCopyPresenter> {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int KWHzl = 8;
    public java.lang.String valueOf = "0";
    public java.lang.String djBIcL = "";
    public boolean AYXKKw = true;
    public boolean OLrzqt = true;
    public java.lang.String EZpvd = "";
    public final C43316rmw gEmmrt = new C43316rmw();
    public int AEQbTJ = -1;

    /* JADX INFO: renamed from: o.vgB$TaskStackBuilder */
    public static final /* synthetic */ class TaskStackBuilder implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskStackBuilder(Function1 function1) {
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
        return C48033uCm.Activity.AhwBna;
    }

    @Override // o.AbstractActivityC48163uHh, o.AbstractActivityC33041mov
    public boolean getApplyNavigationBarInsets() {
        return true;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ StgyCopyPresenter djBIcL(ActivityC51071vgB activityC51071vgB) {
        return (StgyCopyPresenter) activityC51071vgB.gHZMYf();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ AbstractC48304uMn gEmmrt(ActivityC51071vgB activityC51071vgB) {
        return (AbstractC48304uMn) activityC51071vgB.sSMYrx();
    }

    /* JADX INFO: renamed from: o.vgB$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.vgB.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public static /* synthetic */ void startActivity$default(TaskDescription taskDescription, android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.Integer num, java.lang.String str3, int i, java.lang.Object obj) {
            java.lang.String str4 = (i & 2) != 0 ? "" : str;
            java.lang.String str5 = (i & 4) != 0 ? "" : str2;
            if ((i & 8) != 0) {
                num = 0;
            }
            taskDescription.EZpvd(context, str4, str5, num, (i & 16) != 0 ? "" : str3);
        }

        public final void EZpvd(@NotNull android.content.Context context, java.lang.String str, @NotNull java.lang.String str2, java.lang.Integer num, java.lang.String str3) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(str2, "");
            android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) ActivityC51071vgB.class);
            intent.putExtra("id", str);
            intent.putExtra("type", str2);
            if (num != null) {
                intent.addFlags(num.intValue());
            }
            if (str3 != null) {
                intent.putExtra(AppsFlyerProperties.CHANNEL, str3);
            }
            C49950uyH.startTradeActivity$default(context, intent, null, 2, null);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v2, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r2v4, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r2v6, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractActivityC51212vik, o.AbstractActivityC48163uHh, o.AbstractActivityC54499xKr, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        C33567myr.AEQbTJ(getWindow());
        C33567myr.copydefault(this);
        wlaJM();
        ((StgyCopyPresenter) gHZMYf()).AYXKKw(this.djBIcL);
        AubY();
        values();
        AhwBna();
        valueOf();
        getNewProxyInstance();
        ((StgyCopyPresenter) gHZMYf()).gEmmrt(this.djBIcL);
        ((StgyCopyPresenter) gHZMYf()).AEQbTJ();
    }

    private final void wlaJM() {
        java.lang.String stringExtra = getIntent().getStringExtra("id");
        if (stringExtra == null) {
            stringExtra = "0";
        }
        this.valueOf = stringExtra;
        java.lang.String stringExtra2 = getIntent().getStringExtra("type");
        if (stringExtra2 == null) {
            stringExtra2 = "";
        }
        this.djBIcL = stringExtra2;
        java.lang.String stringExtra3 = getIntent().getStringExtra(AppsFlyerProperties.CHANNEL);
        this.EZpvd = stringExtra3 != null ? stringExtra3 : "";
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    private final void AubY() {
        android.widget.ImageView imageView = ((AbstractC48304uMn) sSMYrx()).DbNXlk;
        imageView.setOnClickListener(new Application(imageView, 1000L, this));
        android.widget.ImageView imageView2 = ((AbstractC48304uMn) sSMYrx()).zsXlph;
        imageView2.setOnClickListener(new ActionBar(imageView2, 1000L, this));
    }

    /* JADX INFO: renamed from: o.vgB$ActionBar */
    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ ActivityC51071vgB KWHzl;
        public final /* synthetic */ long OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, ActivityC51071vgB activityC51071vgB) {
            this.EZpvd = view;
            this.OLrzqt = j;
            this.KWHzl = activityC51071vgB;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.OLrzqt || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                this.KWHzl.OLrzqt("share_bot");
                ActivityC51071vgB.djBIcL(this.KWHzl).AEQbTJ(this.KWHzl);
            }
        }
    }

    /* JADX INFO: renamed from: o.vgB$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ ActivityC51071vgB EZpvd;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, ActivityC51071vgB activityC51071vgB) {
            this.copydefault = view;
            this.KWHzl = j;
            this.EZpvd = activityC51071vgB;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.KWHzl || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                if (this.EZpvd.AYXKKw) {
                    ActivityC51071vgB.djBIcL(this.EZpvd).KWHzl(this.EZpvd.valueOf);
                } else {
                    ActivityC51071vgB.djBIcL(this.EZpvd).fetchVPNInfo(this.EZpvd.valueOf);
                }
                C32866mlf.onEvent$default("TradingBot_BotMarketplace_BotCardFavorite_Click", (TrackChannel[]) null, this.EZpvd.new Activity(), 1, (java.lang.Object) null);
            }
        }
    }

    /* JADX INFO: renamed from: o.vgB$Dialog */
    public static final class Dialog implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ ActivityC51071vgB OLrzqt;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Dialog(android.view.View view, long j, ActivityC51071vgB activityC51071vgB) {
            this.copydefault = view;
            this.AEQbTJ = j;
            this.OLrzqt = activityC51071vgB;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.AEQbTJ || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                this.OLrzqt.OLrzqt(OtpEventTracker.OTP_EVENT_VALUE_CANCEL);
                this.OLrzqt.finish();
            }
        }
    }

    /* JADX INFO: renamed from: o.vgB$Fragment */
    public static final class Fragment implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ ActivityC51071vgB copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Fragment(android.view.View view, long j, ActivityC51071vgB activityC51071vgB) {
            this.AEQbTJ = view;
            this.KWHzl = j;
            this.copydefault = activityC51071vgB;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.KWHzl || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                if (this.copydefault.AEQbTJ()) {
                    StgyCopyPresenter stgyCopyPresenterDjBIcL = ActivityC51071vgB.djBIcL(this.copydefault);
                    ActivityC51071vgB activityC51071vgB = this.copydefault;
                    stgyCopyPresenterDjBIcL.AEQbTJ(activityC51071vgB.djBIcL, activityC51071vgB, StgyCopyPresenter.Activity.ActionBar.KWHzl);
                }
            }
        }
    }

    /* JADX INFO: renamed from: o.vgB$FragmentManager */
    public static final class FragmentManager implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ ActivityC51071vgB EZpvd;
        public final /* synthetic */ android.view.View OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public FragmentManager(android.view.View view, long j, ActivityC51071vgB activityC51071vgB) {
            this.OLrzqt = view;
            this.AEQbTJ = j;
            this.EZpvd = activityC51071vgB;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.AEQbTJ || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                this.EZpvd.AkhnZx();
            }
        }
    }

    /* JADX INFO: renamed from: o.vgB$PendingIntent */
    public static final class PendingIntent implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ ActivityC51071vgB copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public PendingIntent(android.view.View view, long j, ActivityC51071vgB activityC51071vgB) {
            this.EZpvd = view;
            this.AEQbTJ = j;
            this.copydefault = activityC51071vgB;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.AEQbTJ || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                this.copydefault.finish();
            }
        }
    }

    /* JADX INFO: renamed from: o.vgB$StateListAnimator */
    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ ActivityC51071vgB EZpvd;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, ActivityC51071vgB activityC51071vgB) {
            this.KWHzl = view;
            this.copydefault = j;
            this.EZpvd = activityC51071vgB;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.copydefault || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                this.EZpvd.AkhnZx();
            }
        }
    }

    /* JADX INFO: renamed from: o.vgB$Activity */
    public static final class Activity implements Function1<EventParamsList, Unit> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(EventParamsList eventParamsList) {
            copydefault(eventParamsList);
            return Unit.INSTANCE;
        }

        public final void copydefault(EventParamsList eventParamsList) {
            Intrinsics.checkNotNullParameter(eventParamsList, "");
            EventParamsList.put$default(eventParamsList, "bot_type", ActivityC51071vgB.this.djBIcL, false, 4, null);
            EventParamsList.put$default(eventParamsList, "copy_type", ActivityC51071vgB.this.gEmmrt(), false, 4, null);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public final void values() {
        ((AbstractC48304uMn) sSMYrx()).iwGUEr.setLayoutManager(new LinearLayoutManager(this));
        ((AbstractC48304uMn) sSMYrx()).iwGUEr.setAdapter(this.gEmmrt);
        this.gEmmrt.register(MpStgyCopyProfitChangeData.class, new C51246vjR());
        this.gEmmrt.register(C55848xrg.class, new C51233vjE());
        this.gEmmrt.register(C51245vjQ.class, new C51248vjT());
        this.gEmmrt.register(BotCopyTraderInfoData.class, new C51198viW(new Function1() { // from class: o.vgH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC51071vgB.AEQbTJ(this.AEQbTJ, (BotCopyTraderInfoData) obj);
            }
        }));
        this.gEmmrt.register(C51237vjI.class, new C51234vjF(new Function0() { // from class: o.vgG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return ActivityC51071vgB.AhwBna(this.EZpvd);
            }
        }));
        this.gEmmrt.register(BotGuideData.class, new C51229vjA());
    }

    public static final Unit AEQbTJ(ActivityC51071vgB activityC51071vgB, BotCopyTraderInfoData botCopyTraderInfoData) {
        Intrinsics.checkNotNullParameter(botCopyTraderInfoData, "");
        InterfaceC49317umK.Application.navigateToTraderBusinessLinePage$default((InterfaceC49317umK) C43251rlk.copydefault(InterfaceC49317umK.class), activityC51071vgB, botCopyTraderInfoData.AYXKKw(), BusinessLine.Bots, null, null, 24, null);
        activityC51071vgB.OLrzqt("trader_avatar");
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit AhwBna(ActivityC51071vgB activityC51071vgB) {
        ((StgyCopyPresenter) activityC51071vgB.gHZMYf()).AEQbTJ(activityC51071vgB.djBIcL, activityC51071vgB, StgyCopyPresenter.Activity.TaskDescription.copydefault);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public final void AhwBna() {
        C52794wYp c52794wYp = ((AbstractC48304uMn) sSMYrx()).AEQbTJ;
        c52794wYp.setOnClickListener(new Fragment(c52794wYp, 1000L, this));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public final void fetchVPNInfo() {
        java.lang.String strAYXKKw;
        if (((StgyCopyPresenter) gHZMYf()).finit()) {
            strAYXKKw = C33070mpX.AYXKKw(C55688xof.Application.hfeTOA);
        } else {
            strAYXKKw = C33070mpX.AYXKKw(C55688xof.Application.dpErvT);
        }
        ((AbstractC48304uMn) sSMYrx()).AEQbTJ.setText(strAYXKKw);
    }

    public final boolean AEQbTJ() {
        boolean zAYXKKw;
        xOW newProxyInstance;
        if (Intrinsics.EZpvd((java.lang.Object) this.djBIcL, (java.lang.Object) "contract_grid") || Intrinsics.EZpvd((java.lang.Object) this.djBIcL, (java.lang.Object) "contract_dca")) {
            InterfaceC54581xNr interfaceC54581xNrCopydefault = C54589xNz.EZpvd.copydefault();
            zAYXKKw = (interfaceC54581xNrCopydefault == null || (newProxyInstance = interfaceC54581xNrCopydefault.getNewProxyInstance()) == null) ? false : newProxyInstance.AYXKKw();
        } else {
            zAYXKKw = true;
        }
        if (!zAYXKKw) {
            final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(this);
            viewOnClickListenerC54939xaY.EZpvd(C33070mpX.AYXKKw(C55688xof.Application.DtnWsU));
            viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) C33070mpX.AYXKKw(C55688xof.Application.aWJMta), new View.OnClickListener() { // from class: o.vgO
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    ActivityC51071vgB.EZpvd(this.EZpvd, viewOnClickListenerC54939xaY, view);
                }
            });
            viewOnClickListenerC54939xaY.AEQbTJ(C33070mpX.AYXKKw(C55688xof.Application.processStrongAuthMessage), new View.OnClickListener() { // from class: o.vgT
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    ActivityC51071vgB.copydefault(viewOnClickListenerC54939xaY, view);
                }
            });
            viewOnClickListenerC54939xaY.show();
        }
        return zAYXKKw;
    }

    public static final void EZpvd(ActivityC51071vgB activityC51071vgB, ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        InterfaceC49496upe.Application.startAccountModeActivity$default(C53685wqE.copydefault.copydefault(), activityC51071vgB, null, java.lang.Boolean.TRUE, 2, null);
        viewOnClickListenerC54939xaY.dismiss();
    }

    public static final void copydefault(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        viewOnClickListenerC54939xaY.dismiss();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public final void ejfBZ() {
        ((StgyCopyPresenter) gHZMYf()).AhwBna(this.valueOf);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractActivityC51212vik, o.AbstractActivityC48163uHh, o.AbstractActivityC54499xKr, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        if (!this.OLrzqt) {
            ((StgyCopyPresenter) gHZMYf()).fvQaOB();
        }
        this.OLrzqt = false;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v12, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v15, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v18, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v21, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v6, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v9, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    private final void getNewProxyInstance() {
        ((StgyCopyPresenter) gHZMYf()).RcXXUw().observe(this, new TaskStackBuilder(new Function1() { // from class: o.vgE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC51071vgB.OLrzqt(this.copydefault, ((java.lang.Boolean) obj).booleanValue());
            }
        }));
        ((StgyCopyPresenter) gHZMYf()).AxsJAY().observe(this, new TaskStackBuilder(new Function1() { // from class: o.vgF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC51071vgB.AEQbTJ(this.KWHzl, (java.util.List) obj);
            }
        }));
        ((StgyCopyPresenter) gHZMYf()).AubY().observe(this, new TaskStackBuilder(new Function1() { // from class: o.vgI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC51071vgB.copydefault(this.copydefault, (BotLeadOverviewModel) obj);
            }
        }));
        ((StgyCopyPresenter) gHZMYf()).zsXlph().observe(this, new TaskStackBuilder(new Function1() { // from class: o.vgL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC51071vgB.KWHzl(this.AEQbTJ, (java.util.List) obj);
            }
        }));
        ((StgyCopyPresenter) gHZMYf()).sSMYrx().observe(this, new TaskStackBuilder(new Function1() { // from class: o.vgN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC51071vgB.AYXKKw(this.OLrzqt, (java.util.List) obj);
            }
        }));
        ((StgyCopyPresenter) gHZMYf()).getAggregateErrorLiveData().observe(this, new TaskStackBuilder(new Function1() { // from class: o.vgM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC51071vgB.EZpvd(this.KWHzl, (androidx.core.util.Pair) obj);
            }
        }));
        ((StgyCopyPresenter) gHZMYf()).getAggregateLoadingLiveData().observe(this, new TaskStackBuilder(new Function1() { // from class: o.vgP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC51071vgB.KWHzl(this.EZpvd, (androidx.core.util.Pair) obj);
            }
        }));
        SharedFlow<StgyCopyPresenter.Activity> sharedFlowQUSxYX = ((StgyCopyPresenter) gHZMYf()).QUSxYX();
        Lifecycle lifecycle = getLifecycle();
        Intrinsics.checkNotNullExpressionValue(lifecycle, "");
        FlowKt.launchIn(FlowKt.onEach(FlowExtKt.flowWithLifecycle(sharedFlowQUSxYX, lifecycle, Lifecycle.State.RESUMED), new BotCopyActivity$addObserver$8(this, null)), LifecycleOwnerKt.getLifecycleScope(this));
    }

    public static final Unit OLrzqt(ActivityC51071vgB activityC51071vgB, boolean z) {
        if (z) {
            activityC51071vgB.ejfBZ();
        } else {
            showLoadError$default(activityC51071vgB, null, 1, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r2v2, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit AEQbTJ(ActivityC51071vgB activityC51071vgB, java.util.List list) {
        LossInsurance lossInsurance;
        Intrinsics.checkNotNullParameter(list, "");
        ((StgyCopyPresenter) activityC51071vgB.gHZMYf()).fZBcTu();
        MpStgyInfo mpStgyInfo = (MpStgyInfo) CollectionsKt___CollectionsKt.firstOrNull(list);
        if (mpStgyInfo != null && (lossInsurance = mpStgyInfo.getLossInsurance()) != null) {
            if (lossInsurance.getEligible() && Intrinsics.EZpvd((java.lang.Object) lossInsurance.getVoucherStatus(), (java.lang.Object) "issued")) {
                java.lang.String voucherValue = lossInsurance.getVoucherValue();
                if (voucherValue == null) {
                    voucherValue = "--";
                }
                activityC51071vgB.AEQbTJ(voucherValue);
            }
            ((StgyCopyPresenter) activityC51071vgB.gHZMYf()).djBIcL().fZBcTu().setValue(lossInsurance);
        }
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(ActivityC51071vgB activityC51071vgB, BotLeadOverviewModel botLeadOverviewModel) {
        Intrinsics.checkNotNullParameter(botLeadOverviewModel, "");
        activityC51071vgB.KWHzl();
        activityC51071vgB.isConnected();
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r2v11, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r2v14, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r2v17, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r2v8, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit KWHzl(ActivityC51071vgB activityC51071vgB, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        activityC51071vgB.AYXKKw = false;
        C55326xho.EZpvd(C33070mpX.AYXKKw(C55688xof.Application.HJWChPzRXNTw), 1000);
        if (C33492mxV.OLrzqt() || C33129mqd.valueOf(java.lang.Integer.valueOf(activityC51071vgB.AEQbTJ), activityC51071vgB.OLrzqt())) {
            ((AbstractC48304uMn) activityC51071vgB.sSMYrx()).DbNXlk.setImageTintList(android.content.res.ColorStateList.valueOf(ContextCompat.getColor(activityC51071vgB, C52761wXj.Activity.zblBkD)));
        } else {
            ((AbstractC48304uMn) activityC51071vgB.sSMYrx()).DbNXlk.setImageTintList(android.content.res.ColorStateList.valueOf(ContextCompat.getColor(activityC51071vgB, C52761wXj.Activity.fdOvFl)));
        }
        ((AbstractC48304uMn) activityC51071vgB.sSMYrx()).DbNXlk.setImageDrawable(C33070mpX.KWHzl(C52761wXj.TaskDescription.UkCIYP));
        ((StgyCopyPresenter) activityC51071vgB.gHZMYf()).EZpvd();
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r3v11, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r3v14, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r3v5, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r3v8, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit AYXKKw(ActivityC51071vgB activityC51071vgB, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        activityC51071vgB.AYXKKw = true;
        C55326xho.EZpvd(C33070mpX.AYXKKw(C55688xof.Application.OqCbbx), 1000);
        if (C33492mxV.OLrzqt() || C33129mqd.valueOf(java.lang.Integer.valueOf(activityC51071vgB.AEQbTJ), activityC51071vgB.OLrzqt())) {
            ((AbstractC48304uMn) activityC51071vgB.sSMYrx()).DbNXlk.setImageTintList(android.content.res.ColorStateList.valueOf(C33070mpX.copydefault(C52761wXj.Activity.isReflectionWorking)));
        } else {
            ((AbstractC48304uMn) activityC51071vgB.sSMYrx()).DbNXlk.setImageTintList(android.content.res.ColorStateList.valueOf(C33070mpX.copydefault(C52761wXj.Activity.gdmIOq)));
        }
        ((AbstractC48304uMn) activityC51071vgB.sSMYrx()).DbNXlk.setImageDrawable(C33070mpX.KWHzl(C52761wXj.TaskDescription.QezThh));
        ((StgyCopyPresenter) activityC51071vgB.gHZMYf()).EZpvd();
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: F */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v10, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v5, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r4v1, resolved type: S */
    /* JADX DEBUG: Multi-variable search result rejected for r4v4, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r5v2, resolved type: S */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit EZpvd(ActivityC51071vgB activityC51071vgB, androidx.core.util.Pair pair) {
        java.lang.String message;
        java.lang.String str = (java.lang.String) pair.first;
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) ((StgyCopyPresenter) activityC51071vgB.gHZMYf()).gHZMYf().bB_())) {
            activityC51071vgB.EZpvd((java.lang.Exception) pair.second);
            rVN.reportFullyDrawn$default((android.app.Activity) activityC51071vgB, false, (java.lang.String) null, 2, (java.lang.Object) null);
        } else if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) ((StgyCopyPresenter) activityC51071vgB.gHZMYf()).zLjUOn().bB_())) {
            activityC51071vgB.KWHzl();
            activityC51071vgB.isConnected();
        } else if ((Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) ((StgyCopyPresenter) activityC51071vgB.gHZMYf()).AwvSrB().bB_()) || Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) ((StgyCopyPresenter) activityC51071vgB.gHZMYf()).zuBGHE().bB_())) && (message = ((java.lang.Exception) pair.second).getMessage()) != null) {
            C55326xho.toastWithFailedIcon$default(message, 0, 1, (java.lang.Object) null);
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: F */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v5, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r3v1, resolved type: S */
    /* JADX DEBUG: Multi-variable search result rejected for r3v10, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r3v4, resolved type: S */
    /* JADX DEBUG: Multi-variable search result rejected for r3v7, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit KWHzl(ActivityC51071vgB activityC51071vgB, androidx.core.util.Pair pair) {
        java.lang.String str = (java.lang.String) pair.first;
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) ((StgyCopyPresenter) activityC51071vgB.gHZMYf()).gHZMYf().bB_())) {
            if (!((java.lang.Boolean) pair.second).booleanValue()) {
                return Unit.INSTANCE;
            }
            android.widget.RelativeLayout relativeLayout = ((AbstractC48304uMn) activityC51071vgB.sSMYrx()).getFieldNames;
            Intrinsics.checkNotNullExpressionValue(relativeLayout, "");
            relativeLayout.setVisibility(0);
            ConstraintLayout constraintLayout = ((AbstractC48304uMn) activityC51071vgB.sSMYrx()).OLrzqt;
            Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
            constraintLayout.setVisibility(8);
            activityC51071vgB.zsXlph();
        } else if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) ((StgyCopyPresenter) activityC51071vgB.gHZMYf()).aKErDB().bB_()) && ((java.lang.Boolean) pair.second).booleanValue()) {
            activityC51071vgB.zsXlph();
        }
        return Unit.INSTANCE;
    }

    public final void AEQbTJ(final java.lang.String str) {
        postDelay(new java.lang.Runnable() { // from class: o.vgS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                ActivityC51071vgB.EZpvd(this.OLrzqt, str);
            }
        }, 300L);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v1, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void EZpvd(ActivityC51071vgB activityC51071vgB, java.lang.String str) {
        C52812wZg c52812wZg = new C52812wZg(activityC51071vgB);
        android.widget.LinearLayout linearLayout = ((AbstractC48304uMn) activityC51071vgB.sSMYrx()).fJNWhG;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "");
        C52812wZg.StateListAnimator stateListAnimator = new C52812wZg.StateListAnimator(linearLayout);
        stateListAnimator.EZpvd(3);
        stateListAnimator.AEQbTJ(C33070mpX.AYXKKw(C55688xof.Application.StringRes));
        stateListAnimator.OLrzqt(C33069mpW.copydefault(C55688xof.Application.RequiresOptInLevel, C56423yEv.EZpvd(C56390yDp.OLrzqt(OtcExtraKeys.AMOUNT, str))));
        c52812wZg.AEQbTJ(stateListAnimator).OLrzqt(0).fARcdN();
    }

    public static /* synthetic */ void showLoadError$default(ActivityC51071vgB activityC51071vgB, java.lang.Exception exc, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            exc = null;
        }
        activityC51071vgB.EZpvd(exc);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r1v2, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public final void EZpvd(java.lang.Exception exc) {
        java.lang.String strAYXKKw;
        java.lang.String strAYXKKw2;
        KWHzl();
        android.widget.RelativeLayout relativeLayout = ((AbstractC48304uMn) sSMYrx()).getFieldNames;
        Intrinsics.checkNotNullExpressionValue(relativeLayout, "");
        int i = 8;
        relativeLayout.setVisibility(8);
        if ((exc instanceof BizApiException) && Intrinsics.EZpvd((java.lang.Object) ((BizApiException) exc).getCode(), (java.lang.Object) C56120xwn.valueOf.AkhnZx())) {
            i = 9;
            strAYXKKw = "";
        } else {
            strAYXKKw = C33070mpX.AYXKKw(C48033uCm.Fragment.OHqIaq);
        }
        ConstraintLayout constraintLayout = ((AbstractC48304uMn) sSMYrx()).OLrzqt;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
        constraintLayout.setVisibility(0);
        C55173xeu c55173xeu = ((AbstractC48304uMn) sSMYrx()).AhwBna;
        c55173xeu.setEmptyTypeImage(i);
        if (exc == null || (strAYXKKw2 = exc.getMessage()) == null) {
            strAYXKKw2 = C33070mpX.AYXKKw(C48033uCm.Fragment.RTWSvT);
        }
        c55173xeu.setSubTitle((java.lang.CharSequence) strAYXKKw2);
        c55173xeu.setRetry(strAYXKKw);
        c55173xeu.setRetryClickListener(new View.OnClickListener() { // from class: o.vgJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                ActivityC51071vgB.OLrzqt(this.OLrzqt, view);
            }
        });
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r2v6, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void OLrzqt(ActivityC51071vgB activityC51071vgB, android.view.View view) {
        if (Intrinsics.EZpvd(((StgyCopyPresenter) activityC51071vgB.gHZMYf()).RcXXUw().getValue(), java.lang.Boolean.TRUE)) {
            activityC51071vgB.ejfBZ();
        } else {
            ((StgyCopyPresenter) activityC51071vgB.gHZMYf()).gEmmrt(activityC51071vgB.djBIcL);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public final void isConnected() {
        ((StgyCopyPresenter) gHZMYf()).djBIcL(this.djBIcL);
        AuCTel();
        fARcdN();
        DbNXlk();
        fIwbmz();
        fetchVPNInfo();
        ((StgyCopyPresenter) gHZMYf()).valueOf(this.djBIcL);
        rVN.reportFullyDrawn$default((android.app.Activity) this, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public final void DbNXlk() {
        C51601vqB.refreshCircleCoins$default(((AbstractC48304uMn) sSMYrx()).AYXKKw, ((StgyCopyPresenter) gHZMYf()).fetchVPNInfo(), 2, 0, 4, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v10, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v14, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v17, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v2, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v4, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r3v3, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r4v2, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public final void fIwbmz() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(new MpStgyCopyProfitChangeData((kotlin.Pair) ((StgyCopyPresenter) gHZMYf()).UeEOUB(), ((StgyCopyPresenter) gHZMYf()).QOLQEE(), C56405yEd.zLjUOn(((StgyCopyPresenter) gHZMYf()).RJOkX()), (java.lang.String) null, false, false, 56, (DefaultConstructorMarker) null));
        arrayList.add(new C51245vjQ(((StgyCopyPresenter) gHZMYf()).QVAiDq()));
        arrayList.add(new C55848xrg(C55298xhM.dp2px$default(8.0f, null, 1, null), C33070mpX.copydefault(C52761wXj.Activity.wlaJM), 0, 0, false, 28, null));
        arrayList.add(new C51237vjI(((StgyCopyPresenter) gHZMYf()).fJNWhG(), ((StgyCopyPresenter) gHZMYf()).finit(), ((StgyCopyPresenter) gHZMYf()).values()));
        arrayList.add(new C55848xrg(C55298xhM.dp2px$default(8.0f, null, 1, null), C33070mpX.copydefault(C52761wXj.Activity.wlaJM), 0, 0, false, 28, null));
        BotCopyTraderInfoData botCopyTraderInfoDataAuCTelauCTel = ((StgyCopyPresenter) gHZMYf()).AuCTelauCTel();
        if (botCopyTraderInfoDataAuCTelauCTel != null) {
            arrayList.add(botCopyTraderInfoDataAuCTelauCTel);
            arrayList.add(new C55848xrg(C55298xhM.dp2px$default(8.0f, null, 1, null), C33070mpX.copydefault(C52761wXj.Activity.wlaJM), 0, 0, false, 28, null));
        }
        arrayList.add(((StgyCopyPresenter) gHZMYf()).KWHzl());
        C33064mpR.OLrzqt(this.gEmmrt, (java.util.List<? extends java.lang.Object>) arrayList);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v10, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v13, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v16, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v19, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v22, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v28, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v31, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v34, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v37, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v4, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v7, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v14, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r1v17, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r1v20, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v28, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v3, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v34, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v37, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v40, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v44, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v48, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v51, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v55, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v6, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v63, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v9, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r2v5, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x018f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void fARcdN() {
        int i;
        android.graphics.drawable.Drawable drawable = ContextCompat.getDrawable(this, ((StgyCopyPresenter) gHZMYf()).gEmmrt());
        java.lang.String strAkhnZx = ((StgyCopyPresenter) gHZMYf()).AkhnZx();
        if (drawable != null) {
            DrawableCompat.setTint(drawable, ContextCompat.getColor(this, C52761wXj.Activity.spnCvw));
        }
        ((AbstractC48304uMn) sSMYrx()).fetchVPNInfo.setImageDrawable(drawable);
        ((AbstractC48304uMn) sSMYrx()).uzCIH.setBackground(C33070mpX.KWHzl(C48033uCm.ActionBar.AhwBna));
        ((AbstractC48304uMn) sSMYrx()).QKVWgx.setText(strAkhnZx);
        ((AbstractC48304uMn) sSMYrx()).QOLQEE.setText(((StgyCopyPresenter) gHZMYf()).AhwBna());
        djBIcL();
        ((AbstractC48304uMn) sSMYrx()).AxsJAY.setText(((StgyCopyPresenter) gHZMYf()).ejfBZ());
        ((AbstractC48304uMn) sSMYrx()).zuBGHE.setText(((StgyCopyPresenter) gHZMYf()).AuCTel());
        android.widget.TextView textView = ((AbstractC48304uMn) sSMYrx()).AuCTelauCTel;
        int i2 = C48033uCm.Fragment.RqmePg;
        java.lang.String strFARcdN = ((StgyCopyPresenter) gHZMYf()).fARcdN();
        java.lang.String strAEQbTJ = o.TaskDescription.AEQbTJ(((StgyCopyPresenter) gHZMYf()).iwGUEr()).AEQbTJ();
        if (strFARcdN == null || strFARcdN.length() == 0) {
            strFARcdN = strAEQbTJ;
        }
        textView.setText(C33069mpW.copydefault(i2, C56423yEv.EZpvd(C56390yDp.OLrzqt("ccy", strFARcdN))));
        kotlin.Pair<java.lang.Boolean, java.lang.String> pairIRxXKY = ((StgyCopyPresenter) gHZMYf()).djBIcL().iRxXKY();
        android.widget.TextView textView2 = ((AbstractC48304uMn) sSMYrx()).AubY;
        Intrinsics.checkNotNullExpressionValue(textView2, "");
        int i3 = 8;
        textView2.setVisibility(pairIRxXKY.getFirst().booleanValue() ? 0 : 8);
        ((AbstractC48304uMn) sSMYrx()).AubY.setText(pairIRxXKY.getSecond());
        android.widget.TextView textView3 = ((AbstractC48304uMn) sSMYrx()).AwvSrB;
        Intrinsics.checkNotNullExpressionValue(textView3, "");
        MpStgyParam mpStgyParamDNCPSb = ((StgyCopyPresenter) gHZMYf()).dNCPSb();
        if (Intrinsics.EZpvd((java.lang.Object) (mpStgyParamDNCPSb != null ? mpStgyParamDNCPSb.getAlgoOrdType() : null), (java.lang.Object) "contract_dca")) {
            i = 0;
        } else {
            MpStgyParam mpStgyParamDNCPSb2 = ((StgyCopyPresenter) gHZMYf()).dNCPSb();
            if (!Intrinsics.EZpvd((java.lang.Object) (mpStgyParamDNCPSb2 != null ? mpStgyParamDNCPSb2.getAlgoOrdType() : null), (java.lang.Object) "contract_grid")) {
                i = 8;
            }
        }
        textView3.setVisibility(i);
        android.widget.TextView textView4 = ((AbstractC48304uMn) sSMYrx()).sSMYrx;
        Intrinsics.checkNotNullExpressionValue(textView4, "");
        MpStgyParam mpStgyParamDNCPSb3 = ((StgyCopyPresenter) gHZMYf()).dNCPSb();
        if (Intrinsics.EZpvd((java.lang.Object) (mpStgyParamDNCPSb3 != null ? mpStgyParamDNCPSb3.getAlgoOrdType() : null), (java.lang.Object) "contract_dca")) {
            i3 = 0;
        } else {
            MpStgyParam mpStgyParamDNCPSb4 = ((StgyCopyPresenter) gHZMYf()).dNCPSb();
            if (Intrinsics.EZpvd((java.lang.Object) (mpStgyParamDNCPSb4 != null ? mpStgyParamDNCPSb4.getAlgoOrdType() : null), (java.lang.Object) "contract_grid")) {
            }
        }
        textView4.setVisibility(i3);
        android.widget.TextView textView5 = ((AbstractC48304uMn) sSMYrx()).AwvSrB;
        textView5.setText(((StgyCopyPresenter) gHZMYf()).isConnected());
        textView5.setTextColor(((StgyCopyPresenter) gHZMYf()).KWHzl(true));
        textView5.setBackgroundTintList(android.content.res.ColorStateList.valueOf(((StgyCopyPresenter) gHZMYf()).AEQbTJ(true)));
        android.widget.TextView textView6 = ((AbstractC48304uMn) sSMYrx()).sSMYrx;
        textView6.setText(C56033xvF.getBotLever$default(((StgyCopyPresenter) gHZMYf()).wlaJM(), false, 2, null));
        textView6.setTextColor(((StgyCopyPresenter) gHZMYf()).KWHzl(true));
        textView6.setBackgroundTintList(android.content.res.ColorStateList.valueOf(((StgyCopyPresenter) gHZMYf()).AEQbTJ(true)));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v11, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v14, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v17, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v20, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v23, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v27, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v30, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v5, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v8, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r1v4, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r4v2, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public final void djBIcL() {
        if (((StgyCopyPresenter) gHZMYf()).finit()) {
            android.widget.TextView textView = ((AbstractC48304uMn) sSMYrx()).gHZMYf;
            Intrinsics.checkNotNullExpressionValue(textView, "");
            textView.setVisibility(8);
            android.widget.FrameLayout frameLayout = ((AbstractC48304uMn) sSMYrx()).values;
            Intrinsics.checkNotNullExpressionValue(frameLayout, "");
            frameLayout.setVisibility(0);
            AppCompatTextView appCompatTextView = ((AbstractC48304uMn) sSMYrx()).zLjUOn;
            Intrinsics.checkNotNullExpressionValue(appCompatTextView, "");
            appCompatTextView.setVisibility(0);
            BotLeadOverviewModel botLeadOverviewModelAYXKKw = ((StgyCopyPresenter) gHZMYf()).AYXKKw();
            wUE wue = wUE.OLrzqt;
            android.widget.ImageView imageView = ((AbstractC48304uMn) sSMYrx()).copydefault;
            Intrinsics.checkNotNullExpressionValue(imageView, "");
            java.lang.String avatar = botLeadOverviewModelAYXKKw.getAvatar();
            if (avatar == null) {
                avatar = "";
            }
            wue.KWHzl(imageView, wUE.Application.m8784constructorimpl$default(avatar, null, 2, null));
            AppCompatTextView appCompatTextView2 = ((AbstractC48304uMn) sSMYrx()).zLjUOn;
            java.lang.String username = botLeadOverviewModelAYXKKw.getUsername();
            appCompatTextView2.setText(username != null ? username : "");
            android.widget.FrameLayout frameLayout2 = ((AbstractC48304uMn) sSMYrx()).values;
            frameLayout2.setOnClickListener(new StateListAnimator(frameLayout2, 1000L, this));
            AppCompatTextView appCompatTextView3 = ((AbstractC48304uMn) sSMYrx()).zLjUOn;
            appCompatTextView3.setOnClickListener(new FragmentManager(appCompatTextView3, 1000L, this));
            return;
        }
        C56071xvr c56071xvr = C56071xvr.gEmmrt;
        MpStgyParam mpStgyParamDNCPSb = ((StgyCopyPresenter) gHZMYf()).dNCPSb();
        if (c56071xvr.EZpvd(mpStgyParamDNCPSb != null ? mpStgyParamDNCPSb.getProfitSharingRatio() : null)) {
            android.widget.TextView textView2 = ((AbstractC48304uMn) sSMYrx()).gHZMYf;
            Intrinsics.checkNotNullExpressionValue(textView2, "");
            textView2.setVisibility(8);
        } else {
            ((AbstractC48304uMn) sSMYrx()).gHZMYf.setText(C33069mpW.copydefault(C55688xof.Application.DzCpqu, C56423yEv.EZpvd(C56390yDp.OLrzqt("creatorName", ((StgyCopyPresenter) gHZMYf()).DbNXlk()))));
            android.widget.TextView textView3 = ((AbstractC48304uMn) sSMYrx()).gHZMYf;
            Intrinsics.checkNotNullExpressionValue(textView3, "");
            textView3.setVisibility(0);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public final void AkhnZx() {
        InterfaceC49317umK.Application.showUserCenterPage$default((InterfaceC49317umK) C43251rlk.copydefault(InterfaceC49317umK.class), this, ((StgyCopyPresenter) gHZMYf()).fFgQHt(), null, "StrategyLeadTrade", 4, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v6, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public final void AuCTel() {
        boolean zHDKMBd = ((StgyCopyPresenter) gHZMYf()).hDKMBd();
        this.AYXKKw = zHDKMBd;
        android.graphics.drawable.Drawable drawable = null;
        if (zHDKMBd) {
            android.widget.ImageView imageView = ((AbstractC48304uMn) sSMYrx()).DbNXlk;
            android.graphics.drawable.Drawable drawableKWHzl = C33070mpX.KWHzl(C52761wXj.TaskDescription.QezThh);
            if (drawableKWHzl != null) {
                drawableKWHzl.setTint(C33070mpX.copydefault(C52761wXj.Activity.invokespecialsiEkQe));
                drawable = drawableKWHzl;
            }
            imageView.setImageDrawable(drawable);
            return;
        }
        android.widget.ImageView imageView2 = ((AbstractC48304uMn) sSMYrx()).DbNXlk;
        android.graphics.drawable.Drawable drawableKWHzl2 = C33070mpX.KWHzl(C52761wXj.TaskDescription.UkCIYP);
        if (drawableKWHzl2 != null) {
            drawableKWHzl2.setTint(C33070mpX.copydefault(C52761wXj.Activity.zblBkD));
            drawable = drawableKWHzl2;
        }
        imageView2.setImageDrawable(drawable);
    }

    public final void EZpvd() {
        final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(this);
        viewOnClickListenerC54939xaY.setTitle(C33070mpX.AYXKKw(C55688xof.Application.xxhdY));
        viewOnClickListenerC54939xaY.EZpvd(C33070mpX.AYXKKw(C55688xof.Application.HJWChPhFGucI));
        viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) C33070mpX.AYXKKw(C55688xof.Application.iOIMNp), new View.OnClickListener() { // from class: o.vgC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                ActivityC51071vgB.OLrzqt(this.EZpvd, viewOnClickListenerC54939xaY, view);
            }
        });
        viewOnClickListenerC54939xaY.AEQbTJ(C33070mpX.AYXKKw(C55688xof.Application.iRgjgR), new View.OnClickListener() { // from class: o.vgK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                ActivityC51071vgB.AEQbTJ(viewOnClickListenerC54939xaY, view);
            }
        });
        viewOnClickListenerC54939xaY.show();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v4, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void OLrzqt(ActivityC51071vgB activityC51071vgB, ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        ActivityC52122vzt.Companion.OLrzqt(activityC51071vgB, new BotTradeData(activityC51071vgB.djBIcL, ((StgyCopyPresenter) activityC51071vgB.gHZMYf()).iwGUEr(), ((StgyCopyPresenter) activityC51071vgB.gHZMYf()).getFieldNames(), ((StgyCopyPresenter) activityC51071vgB.gHZMYf()).valueOf(), false, (java.lang.String) null, (java.lang.String) null, false, (java.util.List) null, 496, (DefaultConstructorMarker) null), (244 & 4) != 0 ? null : null, (244 & 8) != 0 ? null : "copy_bot_detail", (244 & 16) != 0 ? null : null, (244 & 32) != 0 ? null : null, (244 & 64) != 0 ? null : null, (244 & 128) != 0 ? "2" : null);
        viewOnClickListenerC54939xaY.dismiss();
    }

    public static final void AEQbTJ(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        viewOnClickListenerC54939xaY.dismiss();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v12, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v15, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v19, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v26, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v31, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v35, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v6, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v9, resolved type: Binding */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00ed  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void valueOf() {
        ((AbstractC48304uMn) sSMYrx()).isConnected.setImageDrawable(C33070mpX.KWHzl(C52761wXj.TaskDescription.fHqPtx));
        android.widget.ImageView imageView = ((AbstractC48304uMn) sSMYrx()).isConnected;
        imageView.setOnClickListener(new Dialog(imageView, 1000L, this));
        ((AbstractC48304uMn) sSMYrx()).AkhnZx.setImageTintList(android.content.res.ColorStateList.valueOf(ContextCompat.getColor(this, C52761wXj.Activity.DeEinT)));
        ((AbstractC48304uMn) sSMYrx()).AkhnZx.setImageDrawable(C33070mpX.KWHzl(C52761wXj.TaskDescription.fHqPtx));
        android.widget.ImageView imageView2 = ((AbstractC48304uMn) sSMYrx()).AkhnZx;
        imageView2.setOnClickListener(new PendingIntent(imageView2, 1000L, this));
        ((AbstractC48304uMn) sSMYrx()).isConnected.setImageTintList(android.content.res.ColorStateList.valueOf(ContextCompat.getColor(this, C52761wXj.Activity.OxbLUn)));
        java.lang.String str = this.djBIcL;
        switch (str.hashCode()) {
            case -1831183611:
                if (str.equals("spot_dca")) {
                    android.widget.ImageView imageView3 = ((AbstractC48304uMn) sSMYrx()).valueOf;
                    Intrinsics.checkNotNullExpressionValue(imageView3, "");
                    C33054mpH.EZpvd(imageView3, C43454rpb.copydefault("images/trading_bot/android/market_place_grid_bg.webp", this, false), (WebSocketProtocol.PAYLOAD_SHORT & 2) != 0 ? 0 : 0, (WebSocketProtocol.PAYLOAD_SHORT & 4) != 0 ? null : null, (WebSocketProtocol.PAYLOAD_SHORT & 8) != 0 ? -1 : 0, (WebSocketProtocol.PAYLOAD_SHORT & 16) == 0 ? 0 : -1, (WebSocketProtocol.PAYLOAD_SHORT & 32) != 0 ? null : null, (WebSocketProtocol.PAYLOAD_SHORT & 64) == 0 ? null : null);
                } else {
                    ((AbstractC48304uMn) sSMYrx()).valueOf.setBackgroundColor(C33070mpX.copydefault(C32113mPz.ActionBar.djBIcL));
                }
                break;
            case -1402017003:
                if (!str.equals("contract_dca")) {
                }
                break;
            case -1216369070:
                if (str.equals("smart_portfolio")) {
                    android.widget.ImageView imageView4 = ((AbstractC48304uMn) sSMYrx()).valueOf;
                    Intrinsics.checkNotNullExpressionValue(imageView4, "");
                    C33054mpH.EZpvd(imageView4, C43454rpb.copydefault("images/trading_bot/android/market_palce_rec_bg.webp", this, false), (WebSocketProtocol.PAYLOAD_SHORT & 2) != 0 ? 0 : 0, (WebSocketProtocol.PAYLOAD_SHORT & 4) != 0 ? null : null, (WebSocketProtocol.PAYLOAD_SHORT & 8) != 0 ? -1 : 0, (WebSocketProtocol.PAYLOAD_SHORT & 16) == 0 ? 0 : -1, (WebSocketProtocol.PAYLOAD_SHORT & 32) != 0 ? null : null, (WebSocketProtocol.PAYLOAD_SHORT & 64) == 0 ? null : null);
                    break;
                }
                break;
            case -512749997:
                if (!str.equals("contract_grid")) {
                }
                break;
            case 3181382:
                if (!str.equals("grid")) {
                }
                break;
            case 1165749981:
                if (!str.equals("recurring")) {
                }
                break;
        }
        C33567myr.AEQbTJ(getWindow());
        C33567myr.copydefault(this);
        C33567myr.AEQbTJ(this);
        ((AbstractC48304uMn) sSMYrx()).valueOf.getViewTreeObserver().addOnGlobalLayoutListener(new LoaderManager());
    }

    /* JADX INFO: renamed from: o.vgB$LoaderManager */
    public static final class LoaderManager implements ViewTreeObserver.OnGlobalLayoutListener {
        public LoaderManager() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            ActivityC51071vgB.gEmmrt(ActivityC51071vgB.this).gEmmrt.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            final java.lang.String strOLrzqt = ActivityC51071vgB.this.OLrzqt();
            C51294vkM c51294vkM = ActivityC51071vgB.gEmmrt(ActivityC51071vgB.this).wlaJM;
            final ActivityC51071vgB activityC51071vgB = ActivityC51071vgB.this;
            c51294vkM.setOnObservableScrollViewListener(new C51294vkM.Activity() { // from class: o.vgQ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.C51294vkM.Activity
                public final void copydefault(int i, int i2, int i3, int i4) {
                    ActivityC51071vgB.LoaderManager.copydefault(activityC51071vgB, strOLrzqt, i, i2, i3, i4);
                }
            });
        }

        public static final void copydefault(final ActivityC51071vgB activityC51071vgB, java.lang.String str, int i, int i2, int i3, int i4) {
            activityC51071vgB.AEQbTJ = i2;
            if (!C33492mxV.OLrzqt()) {
                if (!C33129mqd.valueOf(java.lang.Integer.valueOf(i2), 0)) {
                    if (C33129mqd.AEQbTJ(java.lang.Integer.valueOf(i2), 0) && C33129mqd.gEmmrt(java.lang.Integer.valueOf(i2), str)) {
                        float fDjBIcL = C33129mqd.djBIcL(C33129mqd.divS$default(java.lang.Float.valueOf(i2), str, null, null, null, 14, null));
                        activityC51071vgB.KWHzl(fDjBIcL, C33070mpX.copydefault(C52761wXj.Activity.DGgkXd), new yHT() { // from class: o.vgR
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // o.yHT
                            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
                                return ActivityC51071vgB.LoaderManager.AhwBna(activityC51071vgB, ((java.lang.Float) obj).floatValue(), ((java.lang.Integer) obj2).intValue(), ((java.lang.Integer) obj3).intValue(), ((java.lang.Integer) obj4).intValue());
                            }
                        });
                        activityC51071vgB.KWHzl(fDjBIcL, C33070mpX.copydefault(C52761wXj.Activity.fdOvFl), new yHT() { // from class: o.vgY
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // o.yHT
                            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
                                return ActivityC51071vgB.LoaderManager.gEmmrt(activityC51071vgB, ((java.lang.Float) obj).floatValue(), ((java.lang.Integer) obj2).intValue(), ((java.lang.Integer) obj3).intValue(), ((java.lang.Integer) obj4).intValue());
                            }
                        });
                        ActivityC51071vgB.gEmmrt(activityC51071vgB).DTwDnp.setText(ActivityC51071vgB.djBIcL(activityC51071vgB).AhwBna());
                        activityC51071vgB.KWHzl(fDjBIcL, C33070mpX.copydefault(C52761wXj.Activity.fdOvFl), new yHT() { // from class: o.vgX
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // o.yHT
                            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
                                return ActivityC51071vgB.LoaderManager.AYXKKw(activityC51071vgB, ((java.lang.Float) obj).floatValue(), ((java.lang.Integer) obj2).intValue(), ((java.lang.Integer) obj3).intValue(), ((java.lang.Integer) obj4).intValue());
                            }
                        });
                        if (activityC51071vgB.AYXKKw) {
                            activityC51071vgB.KWHzl(fDjBIcL, C33070mpX.copydefault(C52761wXj.Activity.gdmIOq), new yHT() { // from class: o.vgW
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                @Override // o.yHT
                                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
                                    return ActivityC51071vgB.LoaderManager.values(activityC51071vgB, ((java.lang.Float) obj).floatValue(), ((java.lang.Integer) obj2).intValue(), ((java.lang.Integer) obj3).intValue(), ((java.lang.Integer) obj4).intValue());
                                }
                            });
                            return;
                        } else {
                            activityC51071vgB.KWHzl(fDjBIcL, C33070mpX.copydefault(C52761wXj.Activity.fdOvFl), new yHT() { // from class: o.vgZ
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                @Override // o.yHT
                                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
                                    return ActivityC51071vgB.LoaderManager.DbNXlk(activityC51071vgB, ((java.lang.Float) obj).floatValue(), ((java.lang.Integer) obj2).intValue(), ((java.lang.Integer) obj3).intValue(), ((java.lang.Integer) obj4).intValue());
                                }
                            });
                            return;
                        }
                    }
                    ActivityC51071vgB.gEmmrt(activityC51071vgB).gEmmrt.setBackgroundColor(Color.argb(255, 255, 255, 255));
                    ActivityC51071vgB.gEmmrt(activityC51071vgB).DTwDnp.setTextColor(Color.argb(255, 0, 0, 0));
                    ActivityC51071vgB.gEmmrt(activityC51071vgB).DTwDnp.setText(ActivityC51071vgB.djBIcL(activityC51071vgB).AhwBna());
                    ActivityC51071vgB.gEmmrt(activityC51071vgB).isConnected.setImageTintList(android.content.res.ColorStateList.valueOf(C33070mpX.copydefault(C52761wXj.Activity.fdOvFl)));
                    ActivityC51071vgB.gEmmrt(activityC51071vgB).zsXlph.setImageTintList(android.content.res.ColorStateList.valueOf(C33070mpX.copydefault(C52761wXj.Activity.fdOvFl)));
                    if (activityC51071vgB.AYXKKw) {
                        ActivityC51071vgB.gEmmrt(activityC51071vgB).DbNXlk.setImageTintList(android.content.res.ColorStateList.valueOf(C33070mpX.copydefault(C52761wXj.Activity.gdmIOq)));
                    } else {
                        android.content.res.ColorStateList colorStateListValueOf = android.content.res.ColorStateList.valueOf(C33070mpX.copydefault(C52761wXj.Activity.fdOvFl));
                        Intrinsics.checkNotNullExpressionValue(colorStateListValueOf, "");
                        ActivityC51071vgB.gEmmrt(activityC51071vgB).DbNXlk.setImageTintList(colorStateListValueOf);
                    }
                    C33567myr.EZpvd(activityC51071vgB);
                    return;
                }
                ActivityC51071vgB.gEmmrt(activityC51071vgB).isConnected.setImageDrawable(C33070mpX.KWHzl(C52761wXj.TaskDescription.fHqPtx));
                ActivityC51071vgB.gEmmrt(activityC51071vgB).isConnected.setImageTintList(android.content.res.ColorStateList.valueOf(C33070mpX.copydefault(C52761wXj.Activity.zblBkD)));
                ActivityC51071vgB.gEmmrt(activityC51071vgB).zsXlph.setImageTintList(android.content.res.ColorStateList.valueOf(C33070mpX.copydefault(C52761wXj.Activity.zblBkD)));
                ActivityC51071vgB.gEmmrt(activityC51071vgB).gEmmrt.setBackgroundColor(Color.argb(0, 255, 255, 255));
                ActivityC51071vgB.gEmmrt(activityC51071vgB).DTwDnp.setText("");
                if (activityC51071vgB.AYXKKw) {
                    ActivityC51071vgB.gEmmrt(activityC51071vgB).DbNXlk.setImageTintList(android.content.res.ColorStateList.valueOf(C33070mpX.copydefault(C52761wXj.Activity.isReflectionWorking)));
                } else {
                    android.content.res.ColorStateList colorStateListValueOf2 = android.content.res.ColorStateList.valueOf(C33070mpX.copydefault(C52761wXj.Activity.zblBkD));
                    Intrinsics.checkNotNullExpressionValue(colorStateListValueOf2, "");
                    ActivityC51071vgB.gEmmrt(activityC51071vgB).DbNXlk.setImageTintList(colorStateListValueOf2);
                }
                C33567myr.AEQbTJ(activityC51071vgB);
                return;
            }
            if (!C33129mqd.valueOf(java.lang.Integer.valueOf(i2), 0)) {
                if (C33129mqd.AEQbTJ(java.lang.Integer.valueOf(i2), 0) && C33129mqd.gEmmrt(java.lang.Integer.valueOf(i2), str)) {
                    float fDjBIcL2 = C33129mqd.djBIcL(C33129mqd.divS$default(java.lang.Float.valueOf(i2), str, null, null, null, 14, null));
                    activityC51071vgB.KWHzl(fDjBIcL2, C33070mpX.copydefault(C52761wXj.Activity.DGgkXd), new yHT() { // from class: o.vgV
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // o.yHT
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
                            return ActivityC51071vgB.LoaderManager.AkhnZx(activityC51071vgB, ((java.lang.Float) obj).floatValue(), ((java.lang.Integer) obj2).intValue(), ((java.lang.Integer) obj3).intValue(), ((java.lang.Integer) obj4).intValue());
                        }
                    });
                    activityC51071vgB.KWHzl(fDjBIcL2, C33070mpX.copydefault(C52761wXj.Activity.fdOvFl), new yHT() { // from class: o.vhe
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // o.yHT
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
                            return ActivityC51071vgB.LoaderManager.isConnected(activityC51071vgB, ((java.lang.Float) obj).floatValue(), ((java.lang.Integer) obj2).intValue(), ((java.lang.Integer) obj3).intValue(), ((java.lang.Integer) obj4).intValue());
                        }
                    });
                    ActivityC51071vgB.gEmmrt(activityC51071vgB).DTwDnp.setText(ActivityC51071vgB.djBIcL(activityC51071vgB).AhwBna());
                    return;
                }
                ActivityC51071vgB.gEmmrt(activityC51071vgB).gEmmrt.setBackgroundColor(Color.argb(255, 0, 0, 0));
                ActivityC51071vgB.gEmmrt(activityC51071vgB).DTwDnp.setTextColor(Color.argb(255, 255, 255, 255));
                ActivityC51071vgB.gEmmrt(activityC51071vgB).DTwDnp.setText(ActivityC51071vgB.djBIcL(activityC51071vgB).AhwBna());
                return;
            }
            ActivityC51071vgB.gEmmrt(activityC51071vgB).gEmmrt.setBackgroundColor(Color.argb(0, 0, 0, 0));
            ActivityC51071vgB.gEmmrt(activityC51071vgB).DTwDnp.setText("");
        }

        public static final Unit AhwBna(ActivityC51071vgB activityC51071vgB, float f, int i, int i2, int i3) {
            ActivityC51071vgB.gEmmrt(activityC51071vgB).gEmmrt.setBackgroundColor(Color.argb((int) f, i, i2, i3));
            return Unit.INSTANCE;
        }

        public static final Unit gEmmrt(ActivityC51071vgB activityC51071vgB, float f, int i, int i2, int i3) {
            ActivityC51071vgB.gEmmrt(activityC51071vgB).DTwDnp.setTextColor(Color.argb((int) f, i, i2, i3));
            return Unit.INSTANCE;
        }

        public static final Unit AYXKKw(ActivityC51071vgB activityC51071vgB, float f, int i, int i2, int i3) {
            int i4 = (int) f;
            ActivityC51071vgB.gEmmrt(activityC51071vgB).isConnected.setImageTintList(android.content.res.ColorStateList.valueOf(Color.argb(i4, i, i2, i3)));
            ActivityC51071vgB.gEmmrt(activityC51071vgB).zsXlph.setImageTintList(android.content.res.ColorStateList.valueOf(Color.argb(i4, i, i2, i3)));
            return Unit.INSTANCE;
        }

        public static final Unit values(ActivityC51071vgB activityC51071vgB, float f, int i, int i2, int i3) {
            ActivityC51071vgB.gEmmrt(activityC51071vgB).DbNXlk.setImageTintList(android.content.res.ColorStateList.valueOf(Color.argb((int) f, i, i2, i3)));
            return Unit.INSTANCE;
        }

        public static final Unit DbNXlk(ActivityC51071vgB activityC51071vgB, float f, int i, int i2, int i3) {
            android.content.res.ColorStateList colorStateListValueOf = android.content.res.ColorStateList.valueOf(Color.argb((int) f, i, i2, i3));
            Intrinsics.checkNotNullExpressionValue(colorStateListValueOf, "");
            ActivityC51071vgB.gEmmrt(activityC51071vgB).DbNXlk.setImageTintList(colorStateListValueOf);
            return Unit.INSTANCE;
        }

        public static final Unit AkhnZx(ActivityC51071vgB activityC51071vgB, float f, int i, int i2, int i3) {
            ActivityC51071vgB.gEmmrt(activityC51071vgB).gEmmrt.setBackgroundColor(Color.argb((int) f, i, i2, i3));
            return Unit.INSTANCE;
        }

        public static final Unit isConnected(ActivityC51071vgB activityC51071vgB, float f, int i, int i2, int i3) {
            ActivityC51071vgB.gEmmrt(activityC51071vgB).DTwDnp.setTextColor(Color.argb((int) f, i, i2, i3));
            return Unit.INSTANCE;
        }
    }

    public final void KWHzl(float f, int i, yHT<? super java.lang.Float, ? super java.lang.Integer, ? super java.lang.Integer, ? super java.lang.Integer, Unit> yht) {
        yht.invoke(java.lang.Float.valueOf(f * 255), java.lang.Integer.valueOf((16711680 & i) >> 16), java.lang.Integer.valueOf((65280 & i) >> 8), java.lang.Integer.valueOf(i & 255));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX DEBUG: Possible override for method o.xKr.OLrzqt()Lcom/okinc/unify_trade/refactor/presenter/AbsPresenter; */
    /* JADX WARN: Multi-variable type inference failed */
    public final java.lang.String OLrzqt() {
        return C33129mqd.gEmmrt(java.lang.Float.valueOf(((AbstractC48304uMn) sSMYrx()).getNewProxyInstance.getY()));
    }

    public final void OLrzqt(final java.lang.String str) {
        C32866mlf.onEvent$default("TradingBot_Pop_Button_Click", (TrackChannel[]) null, new Function1() { // from class: o.vgD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC51071vgB.AEQbTJ(this.EZpvd, str, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit AEQbTJ(ActivityC51071vgB activityC51071vgB, java.lang.String str, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "bot_type", activityC51071vgB.djBIcL, false, 4, null);
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_BUTTON_NAME, str, false, 4, null);
        EventParamsList.put$default(eventParamsList, "copy_type", activityC51071vgB.gEmmrt(), false, 4, null);
        java.lang.String str2 = activityC51071vgB.EZpvd;
        EventParamsList.put$default(eventParamsList, AppsFlyerProperties.CHANNEL, str2 == null ? "" : str2, false, 4, null);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public final java.lang.String gEmmrt() {
        return ((StgyCopyPresenter) gHZMYf()).finit() ? "profit_sharing" : "non_profit_sharing";
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    private final void zsXlph() {
        showLoading(0L);
        android.view.View view = ((AbstractC48304uMn) sSMYrx()).hDKMBd;
        Intrinsics.checkNotNullExpressionValue(view, "");
        view.setVisibility(0);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX DEBUG: Possible override for method o.xKr.KWHzl()Ljava/lang/Class; */
    /* JADX WARN: Multi-variable type inference failed */
    public final void KWHzl() {
        releaseLoading();
        android.view.View view = ((AbstractC48304uMn) sSMYrx()).hDKMBd;
        Intrinsics.checkNotNullExpressionValue(view, "");
        view.setVisibility(8);
    }

    @Override // o.AbstractActivityC51212vik, o.AbstractActivityC54499xKr, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        java.lang.String str = this.EZpvd;
        if (str.length() <= 0) {
            str = null;
        }
        if (str != null) {
            C56058xve.Companion.copydefault().AEQbTJ(str);
        }
    }

    @Override // o.AbstractActivityC51212vik, o.AbstractActivityC48163uHh, o.AbstractActivityC54499xKr, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.AbstractActivityC51212vik, o.AbstractActivityC48163uHh, o.AbstractActivityC54499xKr, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // o.AbstractActivityC51212vik, o.AbstractActivityC48163uHh, o.AbstractActivityC54499xKr, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
