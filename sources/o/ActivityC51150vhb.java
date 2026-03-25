package o;

import android.view.View;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.core.util.SPUtils;
import com.okinc.rxutils.RxBus;
import com.okinc.tradingbot.impl.market_place.bot_copy.BotCopySuccessActivity$initRateView$1$1;
import com.okinc.tradingbot.impl.market_place.bot_copy.BotCopySuccessActivity$subscribeOnUIChange$1$1;
import com.okinc.tradingbot.impl.market_place.bot_copy.presenter.BotCopySuccessPresenter;
import com.okinc.tradingbot.impl.strategy.bean.StrategyItemData;
import com.okinc.unify_trade.biz.StrategyDetailsResponse;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.C48033uCm;
import o.C52761wXj;
import o.C55688xof;
import o.C56058xve;
import o.InterfaceC43294rma;
import o.vSR;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.vhb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class ActivityC51150vhb extends AbstractActivityC48163uHh<AbstractC48640uYx, BotCopySuccessPresenter> {
    public static final Application Companion = new Application(null);
    public static final int KWHzl = 8;
    public boolean AEQbTJ;
    public java.lang.String EZpvd = "";
    public java.lang.String gEmmrt = "";
    public java.lang.String OLrzqt = "";

    /* JADX INFO: renamed from: o.vhb$FragmentManager */
    public static final /* synthetic */ class FragmentManager implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public FragmentManager(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.EZpvd = function1;
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
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(java.lang.Object obj) {
            this.EZpvd.invoke(obj);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractActivityC54499xKr
    public int AYXKKw() {
        return C48033uCm.Activity.DXd;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0004: CHECK_CAST (com.okinc.tradingbot.impl.market_place.bot_copy.presenter.BotCopySuccessPresenter) (wrap:Presenter:0x0000: INVOKE (r0v0 o.vhb) VIRTUAL call: o.xKr.gHZMYf():com.okinc.unify_trade.refactor.presenter.AbsPresenter A[MD:():Presenter extends com.okinc.unify_trade.refactor.presenter.AbsPresenter (m), WRAPPED] (LINE:69)) */
    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ BotCopySuccessPresenter EZpvd(ActivityC51150vhb activityC51150vhb) {
        return (BotCopySuccessPresenter) activityC51150vhb.gHZMYf();
    }

    /* JADX INFO: renamed from: o.vhb$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.vhb.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final void AEQbTJ(@NotNull android.content.Context context, java.lang.String str, java.lang.String str2, java.util.HashMap<java.lang.String, java.lang.String> map, boolean z, java.lang.String str3, java.lang.Integer num) {
            Intrinsics.checkNotNullParameter(context, "");
            android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) ActivityC51150vhb.class);
            if (map != null) {
                intent.putExtra("bot_track_param", map);
            }
            intent.putExtra("type", str);
            intent.putExtra("id", str2);
            intent.putExtra("from", z);
            intent.putExtra("path", str3);
            if (num != null) {
                num.intValue();
                intent.putExtra("key_flag", num.intValue());
            }
            C49950uyH.startTradeActivity$default(context, intent, null, 2, null);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v7, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r4v16, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r4v18, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r4v21, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r4v23, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractActivityC48163uHh, o.AbstractActivityC54499xKr, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        java.lang.String stringExtra = getIntent().getStringExtra("id");
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.EZpvd = stringExtra;
        java.lang.String stringExtra2 = getIntent().getStringExtra("type");
        if (stringExtra2 == null) {
            stringExtra2 = "";
        }
        this.gEmmrt = stringExtra2;
        this.AEQbTJ = getIntent().getBooleanExtra("from", false);
        java.lang.String stringExtra3 = getIntent().getStringExtra("path");
        this.OLrzqt = stringExtra3 != null ? stringExtra3 : "";
        android.content.Intent intent = getIntent();
        java.io.Serializable serializableExtra = intent != null ? intent.getSerializableExtra("bot_track_param") : null;
        C56058xve.Companion.copydefault().AEQbTJ(serializableExtra instanceof java.util.HashMap ? (java.util.HashMap) serializableExtra : null);
        AhwBna();
        ((BotCopySuccessPresenter) gHZMYf()).KWHzl(this.EZpvd, this.gEmmrt);
        KWHzl();
        EZpvd();
        AEQbTJ(((BotCopySuccessPresenter) gHZMYf()).fetchVPNInfo());
        gEmmrt();
        AEQbTJ();
        ((BotCopySuccessPresenter) gHZMYf()).AkhnZx();
        valueOf();
        EZpvd(((BotCopySuccessPresenter) gHZMYf()).djBIcL(), ((BotCopySuccessPresenter) gHZMYf()).valueOf());
        OLrzqt();
        djBIcL();
        rVN.reportFullyDrawn$default((android.app.Activity) this, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    public final void djBIcL() {
        C55867xrz.trackOrderPlacementEvent$default(C55867xrz.KWHzl, this.EZpvd, this.gEmmrt, getTAG(), null, 8, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public final void AEQbTJ() {
        ((AbstractC48640uYx) sSMYrx()).copydefault.EZpvd().setOnClickListener(new View.OnClickListener() { // from class: o.vho
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                ActivityC51150vhb.copydefault(this.OLrzqt, view);
            }
        });
    }

    public static final void copydefault(ActivityC51150vhb activityC51150vhb, android.view.View view) {
        activityC51150vhb.finish();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v3, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    private final void gEmmrt() {
        ((AbstractC48640uYx) sSMYrx()).KWHzl.setText(((BotCopySuccessPresenter) gHZMYf()).AEQbTJ());
        ((AbstractC48640uYx) sSMYrx()).KWHzl.setTextColor(((BotCopySuccessPresenter) gHZMYf()).KWHzl());
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public final void OLrzqt(java.lang.String str) {
        ((AbstractC48640uYx) sSMYrx()).KWHzl.setText(str);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public final void AEQbTJ(java.lang.String str) {
        ((AbstractC48640uYx) sSMYrx()).djBIcL.setText(str);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public final void EZpvd() {
        C55376xil c55376xil = ((AbstractC48640uYx) sSMYrx()).valueOf;
        Intrinsics.checkNotNullExpressionValue(c55376xil, "");
        c55376xil.setVisibility(((BotCopySuccessPresenter) gHZMYf()).isConnected() ? 0 : 8);
        C55376xil c55376xil2 = ((AbstractC48640uYx) sSMYrx()).valueOf;
        c55376xil2.setOnClickListener(new Activity(c55376xil2, 1000L, this));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Binding */
    /* JADX DEBUG: Possible override for method o.xKr.KWHzl()Ljava/lang/Class; */
    /* JADX WARN: Multi-variable type inference failed */
    public final void KWHzl() {
        C52794wYp c52794wYpAEQbTJ;
        C52794wYp c52794wYpCopydefault;
        C52794wYp c52794wYpCopydefault2;
        java.util.ArrayList<java.lang.String> arrayListOLrzqt = ((BotCopySuccessPresenter) gHZMYf()).OLrzqt();
        wYF wyf = ((AbstractC48640uYx) sSMYrx()).OLrzqt;
        if (arrayListOLrzqt.size() == 1) {
            wyf.setType(5);
            java.lang.String str = (java.lang.String) CollectionsKt___CollectionsKt.AuCTelauCTel(arrayListOLrzqt);
            wyf.setPrimaryText(EZpvd(str));
            C52794wYp c52794wYpCopydefault3 = wyf.copydefault();
            if (c52794wYpCopydefault3 != null) {
                c52794wYpCopydefault3.setOnClickListener(new StateListAnimator(c52794wYpCopydefault3, 1000L, this, str));
            }
            if (!Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "btn_detail") || (c52794wYpCopydefault2 = wyf.copydefault()) == null) {
                return;
            }
            c52794wYpCopydefault2.setContentDescription("viewDetailsButton");
            return;
        }
        if (arrayListOLrzqt.size() >= 2) {
            wyf.setType(7);
            java.lang.String str2 = arrayListOLrzqt.get(0);
            Intrinsics.checkNotNullExpressionValue(str2, "");
            java.lang.String str3 = str2;
            java.lang.String str4 = arrayListOLrzqt.get(1);
            Intrinsics.checkNotNullExpressionValue(str4, "");
            java.lang.String str5 = str4;
            wyf.setPrimaryText(EZpvd(str3));
            wyf.setSecondaryText(EZpvd(str5));
            C52794wYp c52794wYpCopydefault4 = wyf.copydefault();
            if (c52794wYpCopydefault4 != null) {
                c52794wYpCopydefault4.setOnClickListener(new TaskDescription(c52794wYpCopydefault4, 1000L, this, str3));
            }
            C52794wYp c52794wYpAEQbTJ2 = wyf.AEQbTJ();
            if (c52794wYpAEQbTJ2 != null) {
                c52794wYpAEQbTJ2.setOnClickListener(new ActionBar(c52794wYpAEQbTJ2, 1000L, this, str5));
            }
            C52794wYp c52794wYpAEQbTJ3 = wyf.AEQbTJ();
            if (c52794wYpAEQbTJ3 != null) {
                c52794wYpAEQbTJ3.setOKDSType(260);
            }
            if (Intrinsics.EZpvd((java.lang.Object) str3, (java.lang.Object) "btn_detail") && (c52794wYpCopydefault = wyf.copydefault()) != null) {
                c52794wYpCopydefault.setContentDescription("viewDetailsButton");
            }
            if (!Intrinsics.EZpvd((java.lang.Object) str5, (java.lang.Object) "btn_more") || (c52794wYpAEQbTJ = wyf.AEQbTJ()) == null) {
                return;
            }
            c52794wYpAEQbTJ.setContentDescription("moreButton");
        }
    }

    /* JADX INFO: renamed from: o.vhb$ActionBar */
    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ ActivityC51150vhb EZpvd;
        public final /* synthetic */ java.lang.String KWHzl;
        public final /* synthetic */ android.view.View OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, ActivityC51150vhb activityC51150vhb, java.lang.String str) {
            this.OLrzqt = view;
            this.copydefault = j;
            this.EZpvd = activityC51150vhb;
            this.KWHzl = str;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.copydefault || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                this.EZpvd.copydefault(this.KWHzl);
            }
        }
    }

    /* JADX INFO: renamed from: o.vhb$Activity */
    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ ActivityC51150vhb copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, ActivityC51150vhb activityC51150vhb) {
            this.KWHzl = view;
            this.AEQbTJ = j;
            this.copydefault = activityC51150vhb;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.AEQbTJ || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this.copydefault), null, null, new BotCopySuccessActivity$initRateView$1$1(this.copydefault, null), 3, null);
            }
        }
    }

    /* JADX INFO: renamed from: o.vhb$StateListAnimator */
    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ ActivityC51150vhb EZpvd;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ java.lang.String copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, ActivityC51150vhb activityC51150vhb, java.lang.String str) {
            this.AEQbTJ = view;
            this.KWHzl = j;
            this.EZpvd = activityC51150vhb;
            this.copydefault = str;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.KWHzl || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                this.EZpvd.copydefault(this.copydefault);
            }
        }
    }

    /* JADX INFO: renamed from: o.vhb$TaskDescription */
    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ ActivityC51150vhb EZpvd;
        public final /* synthetic */ java.lang.String KWHzl;
        public final /* synthetic */ android.view.View OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, ActivityC51150vhb activityC51150vhb, java.lang.String str) {
            this.OLrzqt = view;
            this.AEQbTJ = j;
            this.EZpvd = activityC51150vhb;
            this.KWHzl = str;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.AEQbTJ || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                this.EZpvd.copydefault(this.KWHzl);
            }
        }
    }

    public final java.lang.String EZpvd(java.lang.String str) {
        int iHashCode = str.hashCode();
        if (iHashCode != -1480919148) {
            if (iHashCode != 1508545087) {
                if (iHashCode == 2108231512 && str.equals("btn_more")) {
                    return C33070mpX.AYXKKw(C55688xof.Application.OeawrH);
                }
            } else if (str.equals("my_bots")) {
                return C33070mpX.AYXKKw(C55688xof.Application.gtdfxv);
            }
        } else if (str.equals("btn_detail")) {
            return C33070mpX.AYXKKw(C55688xof.Application.OAUGar);
        }
        return C33070mpX.AYXKKw(C55688xof.Application.OeawrH);
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.wFg.Application.startActivity$default(o.wFg$Application, android.content.Context, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, com.okinc.unify_trade.bot.data.TacticsData, boolean, boolean, int, java.lang.Object):void */
    public final void copydefault(java.lang.String str) {
        int iHashCode = str.hashCode();
        if (iHashCode == -1480919148) {
            if (str.equals("btn_detail")) {
                C32866mlf.onEvent$default("BotPlaceOrder_CreateSuccess_Button_Click", (TrackChannel[]) null, new Function1() { // from class: o.vhl
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return ActivityC51150vhb.copydefault((EventParamsList) obj);
                    }
                }, 1, (java.lang.Object) null);
                ActivityC52272wFg.Companion.KWHzl(this, this.EZpvd, this.gEmmrt, (984 & 8) != 0 ? null : null, (984 & 16) != 0 ? "" : null, (984 & 32) != 0 ? null : getIntent().hasExtra("key_flag") ? java.lang.Integer.valueOf(getIntent().getIntExtra("key_flag", 0)) : null, (984 & 64) != 0 ? null : null, (984 & 128) != 0 ? null : null, (984 & 256) != 0 ? false : false, (984 & 512) != 0 ? false : false);
                finish();
                return;
            }
            return;
        }
        if (iHashCode == 1508545087) {
            if (str.equals("my_bots")) {
                ActivityC51686vrh.Companion.EZpvd(this, (24 & 2) != 0 ? "" : "1", (24 & 4) != 0 ? "" : "", (24 & 8) != 0 ? "" : null, (24 & 16) != 0 ? "" : null);
                finish();
                return;
            }
            return;
        }
        if (iHashCode == 2108231512 && str.equals("btn_more")) {
            C32866mlf.onEvent$default("BotPlaceOrder_CreateSuccess_Button_Click", (TrackChannel[]) null, new Function1() { // from class: o.vhm
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return ActivityC51150vhb.EZpvd((EventParamsList) obj);
                }
            }, 1, (java.lang.Object) null);
            InterfaceC43294rma.Application.processDeeplink$default((InterfaceC43294rma) C43248rlh.KWHzl.AEQbTJ(InterfaceC43294rma.class), this, this.AEQbTJ ? this.OLrzqt : C56071xvr.getBotMpPagePath$default(C56071xvr.gEmmrt, null, null, false, 7, null), null, new Function1() { // from class: o.vhk
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return ActivityC51150vhb.KWHzl((AbstractC43238rlX) obj);
                }
            }, 4, null);
            finish();
        }
    }

    public static final Unit copydefault(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "button_type", "view_details", false, 4, null);
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "button_type", "explore_bots", false, 4, null);
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(AbstractC43238rlX abstractC43238rlX) {
        Intrinsics.checkNotNullParameter(abstractC43238rlX, "");
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v12, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v6, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v9, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    private final void valueOf() {
        C56109xwc<java.lang.Exception> c56109xwcAhwBna;
        C56109xwc<java.lang.Exception> c56109xwcAhwBna2;
        MutableLiveData<kotlin.Pair<java.lang.String, java.lang.Boolean>> mutableLiveDataValues = ((BotCopySuccessPresenter) gHZMYf()).values();
        if (mutableLiveDataValues != null) {
            mutableLiveDataValues.observe(this, new FragmentManager(new Function1() { // from class: o.vha
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return ActivityC51150vhb.OLrzqt(this.EZpvd, (kotlin.Pair) obj);
                }
            }));
        }
        MutableLiveData<StrategyItemData> mutableLiveDataAYXKKw = ((BotCopySuccessPresenter) gHZMYf()).AYXKKw();
        if (mutableLiveDataAYXKKw != null) {
            mutableLiveDataAYXKKw.observe(this, new FragmentManager(new Function1() { // from class: o.vhc
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return ActivityC51150vhb.AEQbTJ(this.OLrzqt, (StrategyItemData) obj);
                }
            }));
        }
        MutableLiveData<C55804xqp<StrategyDetailsResponse>> mutableLiveDataCopydefault = ((BotCopySuccessPresenter) gHZMYf()).copydefault();
        if (mutableLiveDataCopydefault != null) {
            mutableLiveDataCopydefault.observe(this, new FragmentManager(new Function1() { // from class: o.vhi
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return ActivityC51150vhb.copydefault(this.copydefault, (C55804xqp) obj);
                }
            }));
        }
        C56258xzS c56258xzSGEmmrt = ((BotCopySuccessPresenter) gHZMYf()).gEmmrt();
        if (c56258xzSGEmmrt != null && (c56109xwcAhwBna2 = c56258xzSGEmmrt.AhwBna()) != null) {
            c56109xwcAhwBna2.observe(this, new FragmentManager(new Function1() { // from class: o.vhh
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return ActivityC51150vhb.KWHzl(this.OLrzqt, (java.lang.Exception) obj);
                }
            }));
        }
        C54301xDi c54301xDiEZpvd = ((BotCopySuccessPresenter) gHZMYf()).EZpvd();
        if (c54301xDiEZpvd == null || (c56109xwcAhwBna = c54301xDiEZpvd.AhwBna()) == null) {
            return;
        }
        c56109xwcAhwBna.observe(this, new FragmentManager(new Function1() { // from class: o.vhf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC51150vhb.copydefault(this.EZpvd, (java.lang.Exception) obj);
            }
        }));
    }

    public static final Unit OLrzqt(ActivityC51150vhb activityC51150vhb, kotlin.Pair pair) {
        if (pair == null) {
            return Unit.INSTANCE;
        }
        java.lang.String str = (java.lang.String) pair.component1();
        boolean zBooleanValue = ((java.lang.Boolean) pair.component2()).booleanValue();
        activityC51150vhb.AEQbTJ(str);
        if (zBooleanValue) {
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(activityC51150vhb), null, null, new BotCopySuccessActivity$subscribeOnUIChange$1$1(activityC51150vhb, null), 3, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r2v12, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r2v6, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r2v9, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit AEQbTJ(ActivityC51150vhb activityC51150vhb, StrategyItemData strategyItemData) {
        activityC51150vhb.OLrzqt(((BotCopySuccessPresenter) activityC51150vhb.gHZMYf()).AEQbTJ());
        if (Intrinsics.EZpvd((java.lang.Object) activityC51150vhb.gEmmrt, (java.lang.Object) "dcd_bot")) {
            if (((BotCopySuccessPresenter) activityC51150vhb.gHZMYf()).DbNXlk()) {
                activityC51150vhb.AEQbTJ(((BotCopySuccessPresenter) activityC51150vhb.gHZMYf()).fetchVPNInfo());
            }
            activityC51150vhb.EZpvd(((BotCopySuccessPresenter) activityC51150vhb.gHZMYf()).djBIcL(), ((BotCopySuccessPresenter) activityC51150vhb.gHZMYf()).valueOf());
            activityC51150vhb.copydefault();
            activityC51150vhb.KWHzl();
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r2v10, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r2v4, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r2v7, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit copydefault(ActivityC51150vhb activityC51150vhb, C55804xqp c55804xqp) {
        activityC51150vhb.OLrzqt(((BotCopySuccessPresenter) activityC51150vhb.gHZMYf()).AEQbTJ());
        if (((BotCopySuccessPresenter) activityC51150vhb.gHZMYf()).DbNXlk()) {
            activityC51150vhb.AEQbTJ(((BotCopySuccessPresenter) activityC51150vhb.gHZMYf()).fetchVPNInfo());
        }
        activityC51150vhb.EZpvd(((BotCopySuccessPresenter) activityC51150vhb.gHZMYf()).djBIcL(), ((BotCopySuccessPresenter) activityC51150vhb.gHZMYf()).valueOf());
        activityC51150vhb.copydefault();
        activityC51150vhb.KWHzl();
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(ActivityC51150vhb activityC51150vhb, java.lang.Exception exc) {
        Intrinsics.checkNotNullParameter(exc, "");
        activityC51150vhb.OLrzqt(C33070mpX.AYXKKw(C55688xof.Application.fmdvVn));
        activityC51150vhb.KWHzl(exc.getMessage());
        pUU.copydefault(activityC51150vhb.getTAG(), "Get pending order fail cause by: " + exc.getMessage());
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(ActivityC51150vhb activityC51150vhb, java.lang.Exception exc) {
        Intrinsics.checkNotNullParameter(exc, "");
        activityC51150vhb.OLrzqt(C33070mpX.AYXKKw(C55688xof.Application.fmdvVn));
        activityC51150vhb.AEQbTJ(C33070mpX.AYXKKw(C55688xof.Application.dkJJWw));
        activityC51150vhb.EZpvd(C52761wXj.PendingIntent.valueOf, 0);
        activityC51150vhb.KWHzl(exc.getMessage());
        pUU.copydefault(activityC51150vhb.getTAG(), "Get pending order fail cause by: " + exc.getMessage());
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0010  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void KWHzl(java.lang.String str) {
        if (str != null) {
            if (str.length() == 0) {
                str = C33070mpX.AYXKKw(C48033uCm.Fragment.QCjLjM);
            }
            if (str == null) {
            }
        } else {
            str = C33070mpX.AYXKKw(C48033uCm.Fragment.QCjLjM);
        }
        C55326xho.toastWithFailedIcon$default(str, 0, 1, (java.lang.Object) null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v4, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r1v2, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r3v1, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r3v4, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public final void EZpvd(int i, int i2) {
        if (C33129mqd.AhwBna(java.lang.Integer.valueOf(i), 0) && C33129mqd.AhwBna(java.lang.Integer.valueOf(i), ((AbstractC48640uYx) sSMYrx()).AEQbTJ.getAnimation())) {
            ((AbstractC48640uYx) sSMYrx()).AEQbTJ.setAnimation(i);
            ((AbstractC48640uYx) sSMYrx()).AEQbTJ.setRepeatCount(i2);
            ((AbstractC48640uYx) sSMYrx()).AEQbTJ.playAnimation();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public final void copydefault() {
        C55376xil c55376xil = ((AbstractC48640uYx) sSMYrx()).valueOf;
        Intrinsics.checkNotNullExpressionValue(c55376xil, "");
        c55376xil.setVisibility(((BotCopySuccessPresenter) gHZMYf()).isConnected() ? 0 : 8);
    }

    /* JADX DEBUG: Possible override for method o.xKr.OLrzqt()Lcom/okinc/unify_trade/refactor/presenter/AbsPresenter; */
    public final void OLrzqt() {
        AbstractC58185ywX abstractC58185ywXAEQbTJ = RxBus.AEQbTJ(vSS.class, "");
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        AbstractC58185ywX abstractC58185ywXKWHzl = C58156yvv.EZpvd(abstractC58185ywXAEQbTJ, this).KWHzl(C58266yxz.OLrzqt());
        final Function1 function1 = new Function1() { // from class: o.vhj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC51150vhb.EZpvd(this.EZpvd, (vSS) obj);
            }
        };
        abstractC58185ywXKWHzl.AEQbTJ(new InterfaceC58227yxM() { // from class: o.vhg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                ActivityC51150vhb.AEQbTJ(function1, obj);
            }
        });
    }

    public static final void AEQbTJ(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v1, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit EZpvd(final ActivityC51150vhb activityC51150vhb, vSS vss) {
        ((AbstractC48640uYx) activityC51150vhb.sSMYrx()).getRoot().postDelayed(new java.lang.Runnable() { // from class: o.vhn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                ActivityC51150vhb.AEQbTJ(this.OLrzqt);
            }
        }, 200L);
        RxBus.AEQbTJ(vSS.class);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.vSR.StateListAnimator.newInstance$default(o.vSR$StateListAnimator, java.lang.String, boolean, boolean, int, java.lang.Object):o.vSR */
    public static final void AEQbTJ(ActivityC51150vhb activityC51150vhb) {
        vSR.StateListAnimator.newInstance$default(vSR.Companion, activityC51150vhb.EZpvd, false, false, 6, null).show(activityC51150vhb.getSupportFragmentManager(), "CopyTradingviewInfoDialog");
    }

    public final void AhwBna() {
        C56058xve.Activity activityEZpvd = C56058xve.Companion.copydefault().EZpvd();
        if (Intrinsics.EZpvd((java.lang.Object) (activityEZpvd != null ? activityEZpvd.copydefault() : null), (java.lang.Object) "explore")) {
            SPUtils.put("OKTS_SMARTARB_BOT_CREATED_FROM_EXPLORE" + C55697xoo.OLrzqt.gEmmrt(), "true", "MLS_PREFERENCE");
        }
    }

    @Override // o.AbstractActivityC54499xKr, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        RxBus.AEQbTJ(vSS.class);
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
