package o;

import android.view.View;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.okinc.components.track.TrackChannel;
import com.okinc.tradingbot.impl.market_place.bot_copy.bean.BotLeadProfitProfitTopDetails;
import com.okinc.tradingbot.impl.market_place.bot_copy.presenter.BotProfitDetailModel;
import com.okinc.unify_trade.biz.BotLeadProfitProfitOrderDetails;
import com.okinc.unify_trade.biz.BotLeadProfitProfitUserListDetails;
import com.okinc.unify_trade.bot.data.CommonEmptyData;
import com.okinc.unify_trade.bot.market_place.userpage.BotLeadStrateShowData;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.ActivityC52272wFg;
import o.C48033uCm;
import o.C55688xof;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.vhp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class ActivityC51164vhp extends AbstractActivityC48163uHh<uLX, BotProfitDetailModel> {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int OLrzqt = 8;
    public C43316rmw AEQbTJ;
    public BotLeadStrateShowData EZpvd;

    /* JADX INFO: renamed from: o.vhp$Activity */
    public static final /* synthetic */ class Activity implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(Function1 function1) {
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
    public static final void EZpvd(BotLeadProfitProfitOrderDetails botLeadProfitProfitOrderDetails) {
        Intrinsics.checkNotNullParameter(botLeadProfitProfitOrderDetails, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractActivityC54499xKr
    public int AYXKKw() {
        return C48033uCm.Activity.KWHzl;
    }

    @Override // o.AbstractActivityC48163uHh, o.AbstractActivityC33041mov
    public boolean getApplyNavigationBarInsets() {
        return true;
    }

    /* JADX INFO: renamed from: o.vhp$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.vhp.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public static /* synthetic */ void startActivity$default(ActionBar actionBar, android.content.Context context, BotLeadStrateShowData botLeadStrateShowData, int i, java.lang.Object obj) {
            if ((i & 2) != 0) {
                botLeadStrateShowData = null;
            }
            actionBar.EZpvd(context, botLeadStrateShowData);
        }

        public final void EZpvd(@NotNull android.content.Context context, BotLeadStrateShowData botLeadStrateShowData) {
            Intrinsics.checkNotNullParameter(context, "");
            android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) ActivityC51164vhp.class);
            intent.putExtra("bot_document_leadstrate", botLeadStrateShowData);
            C49950uyH.startTradeActivity$default(context, intent, null, 2, null);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractActivityC48163uHh, o.AbstractActivityC54499xKr, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        copydefault();
        ((BotProfitDetailModel) gHZMYf()).KWHzl(this.EZpvd);
        AEQbTJ();
        djBIcL();
        gEmmrt();
        valueOf();
        KWHzl();
    }

    public final void copydefault() {
        this.EZpvd = (BotLeadStrateShowData) getIntent().getParcelableExtra("bot_document_leadstrate");
    }

    @Override // o.AbstractActivityC48163uHh, o.AbstractActivityC54499xKr, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        AhwBna();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v6, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    private final void gEmmrt() {
        ((uLX) sSMYrx()).KWHzl.OLrzqt(new InterfaceC57903yrG() { // from class: o.vhr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC57903yrG
            public final void copydefault(InterfaceC57934yrl interfaceC57934yrl) {
                ActivityC51164vhp.EZpvd(this.OLrzqt, interfaceC57934yrl);
            }
        });
        ((uLX) sSMYrx()).KWHzl.KWHzl(new InterfaceC57900yrD() { // from class: o.vhs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC57900yrD
            public final void EZpvd(InterfaceC57934yrl interfaceC57934yrl) {
                ActivityC51164vhp.OLrzqt(this.OLrzqt, interfaceC57934yrl);
            }
        });
        C52794wYp c52794wYp = ((uLX) sSMYrx()).djBIcL;
        c52794wYp.setOnClickListener(new StateListAnimator(c52794wYp, 1000L, this));
    }

    public static final void EZpvd(ActivityC51164vhp activityC51164vhp, InterfaceC57934yrl interfaceC57934yrl) {
        Intrinsics.checkNotNullParameter(interfaceC57934yrl, "");
        activityC51164vhp.AhwBna();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void OLrzqt(ActivityC51164vhp activityC51164vhp, InterfaceC57934yrl interfaceC57934yrl) {
        java.lang.String algoId;
        java.lang.String str = "";
        Intrinsics.checkNotNullParameter(interfaceC57934yrl, "");
        BotProfitDetailModel botProfitDetailModel = (BotProfitDetailModel) activityC51164vhp.gHZMYf();
        BotLeadStrateShowData botLeadStrateShowData = activityC51164vhp.EZpvd;
        if (botLeadStrateShowData != null && (algoId = botLeadStrateShowData.getAlgoId()) != null) {
            str = algoId;
        }
        botProfitDetailModel.AEQbTJ(str);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    private final void AhwBna() {
        java.lang.String algoId;
        BotProfitDetailModel botProfitDetailModel = (BotProfitDetailModel) gHZMYf();
        BotLeadStrateShowData botLeadStrateShowData = this.EZpvd;
        if (botLeadStrateShowData == null || (algoId = botLeadStrateShowData.getAlgoId()) == null) {
            algoId = "";
        }
        botProfitDetailModel.copydefault(algoId);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v13, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v6, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v9, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    private final void valueOf() {
        ((BotProfitDetailModel) gHZMYf()).OLrzqt().observe(this, new Activity(new Function1() { // from class: o.vhy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC51164vhp.copydefault(this.copydefault, ((java.lang.Boolean) obj).booleanValue());
            }
        }));
        ((BotProfitDetailModel) gHZMYf()).AhwBna().observe(this, new Activity(new Function1() { // from class: o.vhx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC51164vhp.AEQbTJ(this.OLrzqt, ((java.lang.Boolean) obj).booleanValue());
            }
        }));
        ((BotProfitDetailModel) gHZMYf()).KWHzl().observe(this, new Observer() { // from class: o.vhw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.lifecycle.Observer
            public final void onChanged(java.lang.Object obj) {
                ActivityC51164vhp.EZpvd((BotLeadProfitProfitOrderDetails) obj);
            }
        });
        ((BotProfitDetailModel) gHZMYf()).EZpvd().AhwBna().observe(this, new Activity(new Function1() { // from class: o.vhu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC51164vhp.KWHzl(this.copydefault, (java.lang.Exception) obj);
            }
        }));
        ((BotProfitDetailModel) gHZMYf()).copydefault().AhwBna().observe(this, new Activity(new Function1() { // from class: o.vhv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC51164vhp.OLrzqt(this.AEQbTJ, (java.lang.Exception) obj);
            }
        }));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r3v1, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r3v4, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r3v7, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit copydefault(ActivityC51164vhp activityC51164vhp, boolean z) {
        activityC51164vhp.EZpvd();
        activityC51164vhp.OLrzqt();
        ((uLX) activityC51164vhp.sSMYrx()).KWHzl.AEQbTJ();
        ((uLX) activityC51164vhp.sSMYrx()).KWHzl.valueOf();
        C52794wYp c52794wYp = ((uLX) activityC51164vhp.sSMYrx()).djBIcL;
        Intrinsics.checkNotNullExpressionValue(c52794wYp, "");
        c52794wYp.setVisibility(0);
        android.widget.LinearLayout linearLayout = ((uLX) activityC51164vhp.sSMYrx()).gEmmrt;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "");
        linearLayout.setVisibility(0);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r1v5, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r2v2, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit AEQbTJ(ActivityC51164vhp activityC51164vhp, boolean z) {
        if (z) {
            ((uLX) activityC51164vhp.sSMYrx()).KWHzl.AhwBna(false);
            ((uLX) activityC51164vhp.sSMYrx()).KWHzl.AYXKKw();
        } else {
            ((uLX) activityC51164vhp.sSMYrx()).KWHzl.AhwBna(true);
        }
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(ActivityC51164vhp activityC51164vhp, java.lang.Exception exc) {
        Intrinsics.checkNotNullParameter(exc, "");
        activityC51164vhp.OLrzqt(true);
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(ActivityC51164vhp activityC51164vhp, java.lang.Exception exc) {
        Intrinsics.checkNotNullParameter(exc, "");
        activityC51164vhp.OLrzqt(true);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Presenter */
    /* JADX DEBUG: Possible override for method o.xKr.OLrzqt()Lcom/okinc/unify_trade/refactor/presenter/AbsPresenter; */
    /* JADX WARN: Multi-variable type inference failed */
    public final void OLrzqt() {
        C43316rmw c43316rmw = this.AEQbTJ;
        if (c43316rmw != null) {
            C49952uyJ.updateDataOrEmpty$default(c43316rmw, ((BotProfitDetailModel) gHZMYf()).AEQbTJ(), C33070mpX.AYXKKw(C55688xof.Application.OnBackPressedDispatcherApi33ImplExternalSyntheticLambda0), 16, null, null, false, 56, null);
        }
        OLrzqt(false);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    private final void djBIcL() {
        ((uLX) sSMYrx()).AEQbTJ.setLayoutManager(new LinearLayoutManager(this, 1, false));
        ((uLX) sSMYrx()).AEQbTJ.setAdapter(this.AEQbTJ);
    }

    public final void AEQbTJ() {
        C43316rmw c43316rmw = new C43316rmw();
        c43316rmw.register(CommonEmptyData.class, new C50041uzt(null, 1, null));
        c43316rmw.register(BotLeadProfitProfitTopDetails.class, new C51256vjb());
        c43316rmw.register(BotLeadProfitProfitUserListDetails.class, new C51259vje(new Function0() { // from class: o.vht
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return ActivityC51164vhp.KWHzl(this.KWHzl);
            }
        }));
        this.AEQbTJ = c43316rmw;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final java.lang.String KWHzl(ActivityC51164vhp activityC51164vhp) {
        java.lang.String profitSharingCcy;
        BotLeadProfitProfitOrderDetails value = ((BotProfitDetailModel) activityC51164vhp.gHZMYf()).KWHzl().getValue();
        return (value == null || (profitSharingCcy = value.getProfitSharingCcy()) == null) ? "" : profitSharingCcy;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r1v4, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r1v7, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public final void OLrzqt(boolean z) {
        if (z) {
            android.widget.LinearLayout linearLayout = ((uLX) sSMYrx()).AYXKKw;
            Intrinsics.checkNotNullExpressionValue(linearLayout, "");
            linearLayout.setVisibility(0);
            C55173xeu c55173xeu = ((uLX) sSMYrx()).copydefault;
            java.lang.String string = getString(C55688xof.Application.ComponentActivityApi33Impl);
            Intrinsics.checkNotNullExpressionValue(string, "");
            c55173xeu.setTitle(string);
            c55173xeu.setSubTitle((java.lang.CharSequence) C33070mpX.AYXKKw(C48033uCm.Fragment.RTWSvT));
            java.lang.String string2 = getString(C48033uCm.Fragment.OHqIaq);
            Intrinsics.checkNotNullExpressionValue(string2, "");
            c55173xeu.setRetry(string2);
            c55173xeu.setRetryClickListener(new View.OnClickListener() { // from class: o.vhq
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    ActivityC51164vhp.copydefault(this.EZpvd, view);
                }
            });
        } else {
            android.widget.LinearLayout linearLayout2 = ((uLX) sSMYrx()).AYXKKw;
            Intrinsics.checkNotNullExpressionValue(linearLayout2, "");
            linearLayout2.setVisibility(8);
        }
        rVN.reportFullyDrawn$default(this, !z, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    public static final void copydefault(ActivityC51164vhp activityC51164vhp, android.view.View view) {
        activityC51164vhp.AhwBna();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX DEBUG: Possible override for method o.xKr.KWHzl()Ljava/lang/Class; */
    /* JADX WARN: Multi-variable type inference failed */
    public final void KWHzl() {
        C55113xdn.showLoading$default(((uLX) sSMYrx()).OLrzqt, 0L, 1, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public final void EZpvd() {
        ((uLX) sSMYrx()).OLrzqt.copydefault();
    }

    @Override // o.AbstractActivityC54499xKr, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        EZpvd();
        super.onDestroy();
    }

    /* JADX INFO: renamed from: o.vhp$StateListAnimator */
    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ ActivityC51164vhp copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, ActivityC51164vhp activityC51164vhp) {
            this.AEQbTJ = view;
            this.KWHzl = j;
            this.copydefault = activityC51164vhp;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            java.lang.String algoId;
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.KWHzl || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                ActivityC52272wFg.Application application = ActivityC52272wFg.Companion;
                ActivityC51164vhp activityC51164vhp = this.copydefault;
                BotLeadStrateShowData botLeadStrateShowData = activityC51164vhp.EZpvd;
                if (botLeadStrateShowData == null || (algoId = botLeadStrateShowData.getAlgoId()) == null) {
                    algoId = "";
                }
                BotLeadStrateShowData botLeadStrateShowData2 = this.copydefault.EZpvd;
                java.lang.String botType = botLeadStrateShowData2 != null ? botLeadStrateShowData2.getBotType() : null;
                if (botType == null) {
                    botType = "";
                }
                application.KWHzl(activityC51164vhp, algoId, botType, (984 & 8) != 0 ? null : null, (984 & 16) != 0 ? "" : null, (984 & 32) != 0 ? null : 67108864, (984 & 64) != 0 ? null : null, (984 & 128) != 0 ? null : null, (984 & 256) != 0 ? false : false, (984 & 512) != 0 ? false : false);
                this.copydefault.fetchVPNInfo();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void fetchVPNInfo() {
        C32866mlf.onEvent$default("LeadBotProfitSharing_CheckDetails_Button_Click", (TrackChannel[]) null, (Function1) null, 3, (java.lang.Object) null);
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
    public void onStart() {
        super.onStart();
    }
}
