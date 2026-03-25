package o;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentResultListener;
import androidx.lifecycle.Observer;
import com.appsflyer.AppsFlyerProperties;
import com.okinc.rxutils.RxBus;
import com.okinc.tradingbot.impl.market_place.bot_copy.presenter.SignalBotCopyPresenter;
import com.okinc.tradingbot.impl.strategy.bean.SignalDetailCard;
import com.okinc.tradingbot.impl.strategy.bean.SignalProfitCard;
import com.okinc.tradingbot.impl.strategy.bean.SignalTypeData;
import com.okinc.unify_trade.biz.AutoVipProfitInfo;
import com.okinc.unify_trade.biz.BotTradeData;
import com.okinc.unify_trade.biz.EntrySignalOrderAmtParam;
import com.okinc.unify_trade.biz.ExitSignalOrderAmtParam;
import com.okinc.unify_trade.biz.SignalBotReq;
import com.okinc.unify_trade.biz.SignalDetails;
import com.okinc.unify_trade.biz.SignalListItem;
import com.okinc.unify_trade.biz.SignalTriggerDetails;
import com.okinc.unify_trade.biz.ThirdSignalDetail;
import com.okinc.unify_trade.bot.data.ShareData;
import com.okinc.unify_trade.bot.data.TacticsData;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C48033uCm;
import o.C51396vmI;
import o.C51399vmL;
import o.C51427vmn;
import o.C52761wXj;
import o.C53698wqR;
import o.C55688xof;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.vin, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class ActivityC51215vin extends AbstractActivityC51218viq<uTI, SignalBotCopyPresenter> {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int gEmmrt = 8;
    public java.lang.String AhwBna;
    public android.widget.Toast valueOf;

    /* JADX INFO: renamed from: o.vin$FragmentManager */
    public static final /* synthetic */ class FragmentManager implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public FragmentManager(Function1 function1) {
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractActivityC54499xKr
    public int AYXKKw() {
        return C48033uCm.Activity.DMb;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ SignalBotCopyPresenter AEQbTJ(ActivityC51215vin activityC51215vin) {
        return (SignalBotCopyPresenter) activityC51215vin.gHZMYf();
    }

    /* JADX INFO: renamed from: o.vin$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.vin.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public static /* synthetic */ void startActivity$default(TaskDescription taskDescription, android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
            if ((i & 4) != 0) {
                str2 = "";
            }
            if ((i & 8) != 0) {
                str3 = null;
            }
            taskDescription.KWHzl(context, str, str2, str3);
        }

        public final void KWHzl(@NotNull android.content.Context context, @NotNull java.lang.String str, @NotNull java.lang.String str2, java.lang.String str3) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) ActivityC51215vin.class);
            intent.putExtra("signal_bot_id", str);
            intent.putExtra("from", str2);
            intent.putExtra(AppsFlyerProperties.CHANNEL, str3);
            context.startActivity(intent);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v5, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r4v1, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r4v3, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r4v6, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractActivityC51218viq, o.AbstractActivityC48163uHh, o.AbstractActivityC54499xKr, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        SignalBotCopyPresenter signalBotCopyPresenter = (SignalBotCopyPresenter) gHZMYf();
        java.lang.String stringExtra = getIntent().getStringExtra("signal_bot_id");
        if (stringExtra == null) {
            stringExtra = "";
        }
        signalBotCopyPresenter.EZpvd(stringExtra);
        SignalBotCopyPresenter signalBotCopyPresenter2 = (SignalBotCopyPresenter) gHZMYf();
        java.lang.String stringExtra2 = getIntent().getStringExtra("from");
        signalBotCopyPresenter2.copydefault(stringExtra2 != null ? stringExtra2 : "");
        C55867xrz.KWHzl.AhwBna(((SignalBotCopyPresenter) gHZMYf()).copydefault());
        AEQbTJ();
        AhwBna();
        djBIcL();
        isConnected();
        values();
        ((SignalBotCopyPresenter) gHZMYf()).OLrzqt();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public final void AEQbTJ() {
        ((uTI) sSMYrx()).OLrzqt.copydefault(((SignalBotCopyPresenter) gHZMYf()).KWHzl());
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    private final void AhwBna() {
        showLoading();
        ConstraintLayout constraintLayout = ((uTI) sSMYrx()).KWHzl;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
        constraintLayout.setVisibility(8);
        ((SignalBotCopyPresenter) gHZMYf()).zLjUOn();
        this.AhwBna = getIntent().getStringExtra(AppsFlyerProperties.CHANNEL);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v12, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v15, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v6, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v9, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    private final void djBIcL() {
        ((uTI) sSMYrx()).djBIcL.setOnScrollChangeListener(new View.OnScrollChangeListener() { // from class: o.viy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnScrollChangeListener
            public final void onScrollChange(android.view.View view, int i, int i2, int i3, int i4) {
                ActivityC51215vin.EZpvd(this.copydefault, view, i, i2, i3, i4);
            }
        });
        AppCompatImageView appCompatImageView = ((uTI) sSMYrx()).AhwBna;
        appCompatImageView.setOnClickListener(new Activity(appCompatImageView, 1000L, this));
        android.widget.ImageView imageView = ((uTI) sSMYrx()).copydefault;
        imageView.setOnClickListener(new ActionBar(imageView, 1000L, this));
        ((uTI) sSMYrx()).copydefault.setImageTintList(android.content.res.ColorStateList.valueOf(ContextCompat.getColor(this, C52761wXj.Activity.DeEinT)));
        AppCompatImageView appCompatImageView2 = ((uTI) sSMYrx()).valueOf;
        appCompatImageView2.setOnClickListener(new StateListAnimator(appCompatImageView2, 1000L, this));
        C52794wYp c52794wYp = ((uTI) sSMYrx()).DbNXlk;
        c52794wYp.setOnClickListener(new Application(c52794wYp, 1000L, this));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void EZpvd(ActivityC51215vin activityC51215vin, android.view.View view, int i, int i2, int i3, int i4) {
        int height = ((uTI) activityC51215vin.sSMYrx()).isConnected.getHeight() * 3;
        ((uTI) activityC51215vin.sSMYrx()).gEmmrt.setAlpha(i2 == 0 ? 0.0f : (i2 < 0 || i2 > height) ? 1.0f : i2 / height);
    }

    public static /* synthetic */ void useSignalBot$default(ActivityC51215vin activityC51215vin, java.lang.String str, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            z = true;
        }
        activityC51215vin.AEQbTJ(str, z);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r2v3, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public final void AEQbTJ(java.lang.String str, boolean z) {
        SignalDetails signalDetailsFIwbmz = ((SignalBotCopyPresenter) gHZMYf()).fIwbmz();
        if (Intrinsics.EZpvd((java.lang.Object) signalDetailsFIwbmz.getUserSubscriptionType(), (java.lang.Object) "free")) {
            C55867xrz.KWHzl.gEmmrt(((SignalBotCopyPresenter) gHZMYf()).copydefault(), "use");
            java.lang.String signalChanId = signalDetailsFIwbmz.getSignalChanId();
            java.lang.String signalChanName = signalDetailsFIwbmz.getSignalChanName();
            java.lang.String type = signalDetailsFIwbmz.getType();
            java.lang.String str2 = "signal_bot";
            java.lang.String str3 = "";
            java.lang.String str4 = "SWAP";
            ActivityC52122vzt.Companion.OLrzqt(this, new BotTradeData(str2, str3, str4, (android.os.Parcelable) new SignalListItem((java.lang.String) null, signalChanId, signalChanName, (java.lang.String) null, signalDetailsFIwbmz.getUserSubscriptionType(), signalDetailsFIwbmz.getProfitSharingRatio(), signalDetailsFIwbmz.getSubscriptionFee(), signalDetailsFIwbmz.getUsername(), signalDetailsFIwbmz.getAvatar(), type, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, false, 31753, (DefaultConstructorMarker) null), false, (java.lang.String) null, (java.lang.String) null, false, (java.util.List) null, 496, (DefaultConstructorMarker) null), (244 & 4) != 0 ? null : null, (244 & 8) != 0 ? null : "copy_signal_detail", (244 & 16) != 0 ? null : null, (244 & 32) != 0 ? null : null, (244 & 64) != 0 ? null : null, (244 & 128) != 0 ? "2" : null);
            return;
        }
        if (z) {
            C55326xho.toastWithSuccessfulIcon$default(C55688xof.Application.DuQ, 0, 1, (java.lang.Object) null);
        }
        C51427vmn.ActionBar actionBar = C51427vmn.Companion;
        androidx.fragment.app.FragmentManager supportFragmentManager = getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
        actionBar.OLrzqt(signalDetailsFIwbmz, str, supportFragmentManager);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v10, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v5, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public final void gEmmrt() {
        C55867xrz.KWHzl.gEmmrt(((SignalBotCopyPresenter) gHZMYf()).copydefault(), "subscribe");
        java.util.List<SignalTypeData> listDjBIcL = ((SignalBotCopyPresenter) gHZMYf()).djBIcL();
        if (listDjBIcL.size() == 1) {
            java.lang.String strKWHzl = ((SignalTypeData) CollectionsKt___CollectionsKt.AuCTelauCTel(listDjBIcL)).KWHzl();
            SignalDetails signalDetailsKWHzl = ((SignalBotCopyPresenter) gHZMYf()).KWHzl(strKWHzl);
            if (Intrinsics.EZpvd((java.lang.Object) strKWHzl, (java.lang.Object) "free")) {
                ((SignalBotCopyPresenter) gHZMYf()).copydefault(signalDetailsKWHzl);
                return;
            }
            if (Intrinsics.EZpvd((java.lang.Object) strKWHzl, (java.lang.Object) "profit_sharing")) {
                useSignalBot$default(this, null, false, 3, null);
                return;
            }
            C51396vmI.Activity activity = C51396vmI.Companion;
            androidx.fragment.app.FragmentManager supportFragmentManager = getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
            activity.AEQbTJ(signalDetailsKWHzl, supportFragmentManager);
            return;
        }
        C51399vmL.Application application = C51399vmL.Companion;
        androidx.fragment.app.FragmentManager supportFragmentManager2 = getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager2, "");
        application.OLrzqt(listDjBIcL, supportFragmentManager2);
    }

    /* JADX INFO: renamed from: o.vin$ActionBar */
    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ ActivityC51215vin KWHzl;
        public final /* synthetic */ android.view.View OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, ActivityC51215vin activityC51215vin) {
            this.OLrzqt = view;
            this.AEQbTJ = j;
            this.KWHzl = activityC51215vin;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.AEQbTJ || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                this.KWHzl.finish();
            }
        }
    }

    /* JADX INFO: renamed from: o.vin$Activity */
    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ ActivityC51215vin KWHzl;
        public final /* synthetic */ long OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, ActivityC51215vin activityC51215vin) {
            this.AEQbTJ = view;
            this.OLrzqt = j;
            this.KWHzl = activityC51215vin;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.OLrzqt || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                this.KWHzl.finish();
            }
        }
    }

    /* JADX INFO: renamed from: o.vin$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ ActivityC51215vin copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, ActivityC51215vin activityC51215vin) {
            this.EZpvd = view;
            this.OLrzqt = j;
            this.copydefault = activityC51215vin;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.OLrzqt || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                if (ActivityC51215vin.AEQbTJ(this.copydefault).hDKMBd()) {
                    ActivityC51215vin.useSignalBot$default(this.copydefault, null, false, 1, null);
                } else {
                    this.copydefault.gEmmrt();
                }
            }
        }
    }

    /* JADX INFO: renamed from: o.vin$StateListAnimator */
    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ ActivityC51215vin OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, ActivityC51215vin activityC51215vin) {
            this.KWHzl = view;
            this.copydefault = j;
            this.OLrzqt = activityC51215vin;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.copydefault || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                C55867xrz.KWHzl.gEmmrt(ActivityC51215vin.AEQbTJ(this.OLrzqt).copydefault(), "share");
                ActivityC51215vin.AEQbTJ(this.OLrzqt).AubY();
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    private final void valueOf() {
        ((uTI) sSMYrx()).DbNXlk.setText(((SignalBotCopyPresenter) gHZMYf()).hDKMBd() ? C33070mpX.AYXKKw(C55688xof.Application.createSocket) : C33070mpX.AYXKKw(C55688xof.Application.getDefaultCipherSuites));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public final void copydefault(SignalProfitCard signalProfitCard) {
        ((uTI) sSMYrx()).AYXKKw.OLrzqt(signalProfitCard);
        ShareData shareData = ((SignalBotCopyPresenter) gHZMYf()).DbNXlk().getShareData();
        java.lang.String backtestProfitRate = signalProfitCard.djBIcL().getBacktestProfitRate();
        if (backtestProfitRate == null) {
            backtestProfitRate = "0";
        }
        shareData.setMainDataValue(backtestProfitRate);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v12, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v15, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v18, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v21, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v24, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v28, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v31, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v4, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v8, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    private final void values() {
        ((SignalBotCopyPresenter) gHZMYf()).AEQbTJ().fJNWhG().observe(this, new FragmentManager(new Function1() { // from class: o.viD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC51215vin.OLrzqt(this.OLrzqt, (kotlin.Pair) obj);
            }
        }));
        ((SignalBotCopyPresenter) gHZMYf()).AEQbTJ().AuCTel().observe(this, new FragmentManager(new Function1() { // from class: o.viF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC51215vin.OLrzqt(this.copydefault, ((java.lang.Boolean) obj).booleanValue());
            }
        }));
        ((SignalBotCopyPresenter) gHZMYf()).AEQbTJ().fARcdN().observe(this, new FragmentManager(new Function1() { // from class: o.viG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC51215vin.AEQbTJ(this.OLrzqt, (kotlin.Pair) obj);
            }
        }));
        ((SignalBotCopyPresenter) gHZMYf()).AuCTel().observe(this, new FragmentManager(new Function1() { // from class: o.viI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC51215vin.KWHzl(this.OLrzqt, (SignalProfitCard) obj);
            }
        }));
        ((SignalBotCopyPresenter) gHZMYf()).AkhnZx().observe(this, new FragmentManager(new Function1() { // from class: o.vit
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC51215vin.EZpvd(this.EZpvd, (TacticsData) obj);
            }
        }));
        ((SignalBotCopyPresenter) gHZMYf()).getAggregateLoadingLiveData().observe(this, new FragmentManager(new Function1() { // from class: o.vis
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC51215vin.KWHzl(this.EZpvd, (androidx.core.util.Pair) obj);
            }
        }));
        ((SignalBotCopyPresenter) gHZMYf()).getAggregateErrorLiveData().observe(this, new FragmentManager(new Function1() { // from class: o.viv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC51215vin.OLrzqt(this.AEQbTJ, (androidx.core.util.Pair) obj);
            }
        }));
        ((SignalBotCopyPresenter) gHZMYf()).AEQbTJ().AuCTel().observe(this, new FragmentManager(new Function1() { // from class: o.viu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC51215vin.copydefault(this.AEQbTJ, ((java.lang.Boolean) obj).booleanValue());
            }
        }));
        ((SignalBotCopyPresenter) gHZMYf()).getFieldNames().observe(this, new FragmentManager(new Function1() { // from class: o.viw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC51215vin.AEQbTJ(this.EZpvd, (java.lang.String) obj);
            }
        }));
        ((SignalBotCopyPresenter) gHZMYf()).gEmmrt().observe(this, new FragmentManager(new Function1() { // from class: o.viA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC51215vin.KWHzl(this.EZpvd, (java.util.List) obj);
            }
        }));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v10, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v13, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v6, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v10, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v5, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r3v1, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r4v8, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit OLrzqt(final ActivityC51215vin activityC51215vin, kotlin.Pair pair) {
        java.util.List<SignalTriggerDetails> list;
        Intrinsics.checkNotNullParameter(pair, "");
        java.lang.String str = (java.lang.String) pair.getFirst();
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) ((SignalBotCopyPresenter) activityC51215vin.gHZMYf()).AEQbTJ().EZpvd())) {
            java.lang.Object second = pair.getSecond();
            list = second instanceof java.util.List ? (java.util.List) second : null;
            if (list != null) {
                SignalDetailCard signalDetailCardAEQbTJ = ((SignalBotCopyPresenter) activityC51215vin.gHZMYf()).EZpvd().KWHzl(list);
                ((uTI) activityC51215vin.sSMYrx()).gEmmrt.setText(signalDetailCardAEQbTJ.copydefault());
                ((uTI) activityC51215vin.sSMYrx()).AEQbTJ.AEQbTJ(signalDetailCardAEQbTJ, new Function1() { // from class: o.viE
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return ActivityC51215vin.EZpvd(this.EZpvd, (SignalDetailCard) obj);
                    }
                });
                activityC51215vin.valueOf();
            }
        } else if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) ((SignalBotCopyPresenter) activityC51215vin.gHZMYf()).AEQbTJ().AEQbTJ())) {
            java.lang.Object second2 = pair.getSecond();
            list = second2 instanceof java.util.List ? (java.util.List) second2 : null;
            if (list != null) {
                activityC51215vin.copydefault(new C53874wti(((SignalBotCopyPresenter) activityC51215vin.gHZMYf()).AhwBna()).KWHzl(list));
            }
        } else if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) ((SignalBotCopyPresenter) activityC51215vin.gHZMYf()).AEQbTJ().AhwBna())) {
            java.lang.Object second3 = pair.getSecond();
            list = second3 instanceof java.util.List ? (java.util.List) second3 : null;
            if (list != null) {
                ((uTI) activityC51215vin.sSMYrx()).values.OLrzqt(new C53876wtk().KWHzl2(list));
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit EZpvd(ActivityC51215vin activityC51215vin, SignalDetailCard signalDetailCard) {
        Intrinsics.checkNotNullParameter(signalDetailCard, "");
        ((SignalBotCopyPresenter) activityC51215vin.gHZMYf()).EZpvd(signalDetailCard.AEQbTJ());
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(ActivityC51215vin activityC51215vin, boolean z) {
        rVN.reportFullyDrawn$default(activityC51215vin, z, (java.lang.String) null, 2, (java.lang.Object) null);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r1v4, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit AEQbTJ(final ActivityC51215vin activityC51215vin, kotlin.Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        pUU.copydefault(activityC51215vin.getTAG(), pair.getFirst() + " request failed cause by " + ((java.lang.Exception) pair.getSecond()).getMessage());
        ConstraintLayout constraintLayout = ((uTI) activityC51215vin.sSMYrx()).KWHzl;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
        constraintLayout.setVisibility(0);
        C55173xeu c55173xeu = ((uTI) activityC51215vin.sSMYrx()).EZpvd;
        java.lang.String message = ((java.lang.Exception) pair.getSecond()).getMessage();
        c55173xeu.setSubTitle((java.lang.CharSequence) (message != null ? message : ""));
        c55173xeu.setRetryClickListener(new View.OnClickListener() { // from class: o.vix
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                ActivityC51215vin.KWHzl(this.EZpvd, view);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void KWHzl(ActivityC51215vin activityC51215vin, android.view.View view) {
        ConstraintLayout constraintLayout = ((uTI) activityC51215vin.sSMYrx()).KWHzl;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
        constraintLayout.setVisibility(8);
        activityC51215vin.AhwBna();
    }

    public static final Unit KWHzl(ActivityC51215vin activityC51215vin, SignalProfitCard signalProfitCard) {
        Intrinsics.checkNotNullParameter(signalProfitCard, "");
        activityC51215vin.copydefault(signalProfitCard);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit EZpvd(ActivityC51215vin activityC51215vin, TacticsData tacticsData) {
        Intrinsics.checkNotNullParameter(tacticsData, "");
        C53698wqR.TaskDescription.share$default(C53698wqR.Companion, tacticsData, activityC51215vin, ((InterfaceC49317umK) C43251rlk.copydefault(InterfaceC49317umK.class)).AEQbTJ(((SignalBotCopyPresenter) activityC51215vin.gHZMYf()).fIwbmz().getTraderUniqueName()), null, false, null, 40, null);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: F */
    /* JADX DEBUG: Multi-variable search result rejected for r10v1, resolved type: S */
    /* JADX DEBUG: Multi-variable search result rejected for r10v6, resolved type: S */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v5, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit KWHzl(ActivityC51215vin activityC51215vin, androidx.core.util.Pair pair) {
        java.lang.String str = (java.lang.String) pair.first;
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) ((SignalBotCopyPresenter) activityC51215vin.gHZMYf()).AYXKKw().bB_())) {
            if (((java.lang.Boolean) pair.second).booleanValue()) {
                activityC51215vin.showLoading();
            } else {
                activityC51215vin.dismissLoading();
            }
        } else if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) ((SignalBotCopyPresenter) activityC51215vin.gHZMYf()).iwGUEr().bB_())) {
            if (((java.lang.Boolean) pair.second).booleanValue()) {
                activityC51215vin.valueOf = C55328xhq.showWithLoading$default(C55328xhq.OLrzqt, C33070mpX.AYXKKw(C55688xof.Application.haRtnV), null, 6000, null, 0, 0, 58, null);
            } else {
                android.widget.Toast toast = activityC51215vin.valueOf;
                if (toast != null) {
                    toast.cancel();
                }
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: F */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: S */
    /* JADX DEBUG: Multi-variable search result rejected for r2v5, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit OLrzqt(ActivityC51215vin activityC51215vin, androidx.core.util.Pair pair) {
        java.lang.String message;
        java.lang.String str = (java.lang.String) pair.first;
        if ((Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) ((SignalBotCopyPresenter) activityC51215vin.gHZMYf()).iwGUEr().bB_()) || Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) ((SignalBotCopyPresenter) activityC51215vin.gHZMYf()).isConnected().bB_())) && (message = ((java.lang.Exception) pair.second).getMessage()) != null) {
            C55326xho.toastWithFailedIcon$default(message, 0, 1, (java.lang.Object) null);
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit copydefault(ActivityC51215vin activityC51215vin, boolean z) {
        if (z) {
            C55173xeu c55173xeu = ((uTI) activityC51215vin.sSMYrx()).EZpvd;
            Intrinsics.checkNotNullExpressionValue(c55173xeu, "");
            c55173xeu.setVisibility(8);
        }
        activityC51215vin.releaseLoading();
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v10, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v12, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v6, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r12v1, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r13v2, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r13v5, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit AEQbTJ(final ActivityC51215vin activityC51215vin, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        C55867xrz.KWHzl.djBIcL();
        ((uTI) activityC51215vin.sSMYrx()).DbNXlk.setText(C33070mpX.AYXKKw(C55688xof.Application.createSocket));
        SignalDetails signalDetailsFIwbmz = ((SignalBotCopyPresenter) activityC51215vin.gHZMYf()).fIwbmz();
        signalDetailsFIwbmz.setSubscriptionType(((SignalBotCopyPresenter) activityC51215vin.gHZMYf()).fARcdN());
        signalDetailsFIwbmz.setUserSubscriptionType(((SignalBotCopyPresenter) activityC51215vin.gHZMYf()).fARcdN());
        signalDetailsFIwbmz.setSubscribed(true);
        ((uTI) activityC51215vin.sSMYrx()).AEQbTJ.KWHzl(new SignalDetailCard(signalDetailsFIwbmz, null, null, ((SignalBotCopyPresenter) activityC51215vin.gHZMYf()).ejfBZ(), null, null, null, 118, null));
        java.lang.String userSubscriptionType = signalDetailsFIwbmz.getUserSubscriptionType();
        if (Intrinsics.EZpvd((java.lang.Object) userSubscriptionType, (java.lang.Object) "free")) {
            final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(activityC51215vin);
            viewOnClickListenerC54939xaY.setTitle(C33070mpX.AYXKKw(C55688xof.Application.hBORwR));
            viewOnClickListenerC54939xaY.EZpvd(C33070mpX.AYXKKw(C55688xof.Application.zagaMW));
            viewOnClickListenerC54939xaY.AEQbTJ(C33070mpX.AYXKKw(C55688xof.Application.onCreate), new View.OnClickListener() { // from class: o.vir
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    ActivityC51215vin.copydefault(viewOnClickListenerC54939xaY, view);
                }
            });
            viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) C33070mpX.AYXKKw(C55688xof.Application.ijmTNW), new View.OnClickListener() { // from class: o.vip
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    ActivityC51215vin.copydefault(this.EZpvd, viewOnClickListenerC54939xaY, view);
                }
            });
            viewOnClickListenerC54939xaY.show();
        } else if (Intrinsics.EZpvd((java.lang.Object) userSubscriptionType, (java.lang.Object) "subscription")) {
            useSignalBot$default(activityC51215vin, null, false, 3, null);
        }
        RxBus.AEQbTJ(new C55943xtV(((SignalBotCopyPresenter) activityC51215vin.gHZMYf()).fetchVPNInfo()));
        return Unit.INSTANCE;
    }

    public static final void copydefault(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        C55867xrz.KWHzl.AYXKKw("i_know");
        viewOnClickListenerC54939xaY.dismiss();
    }

    public static final void copydefault(ActivityC51215vin activityC51215vin, ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        C55867xrz.KWHzl.AYXKKw("use");
        useSignalBot$default(activityC51215vin, null, false, 3, null);
        viewOnClickListenerC54939xaY.dismiss();
    }

    public static final Unit KWHzl(ActivityC51215vin activityC51215vin, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        vYH vyhAEQbTJ = vYH.Companion.AEQbTJ(new SignalBotReq((java.lang.String) null, (java.lang.String) null, new java.util.ArrayList(list), (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (EntrySignalOrderAmtParam) null, (ExitSignalOrderAmtParam) null, false, (ThirdSignalDetail) null, false, (java.util.ArrayList) null, (java.lang.String) null, (AutoVipProfitInfo) null, 32763, (DefaultConstructorMarker) null));
        androidx.fragment.app.FragmentManager supportFragmentManager = activityC51215vin.getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
        vyhAEQbTJ.show(supportFragmentManager);
        return Unit.INSTANCE;
    }

    private final void isConnected() {
        getSupportFragmentManager().setFragmentResultListener("BOT_PERIOD_SELECT", this, new FragmentResultListener() { // from class: o.viB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.fragment.app.FragmentResultListener
            public final void onFragmentResult(java.lang.String str, android.os.Bundle bundle) {
                ActivityC51215vin.EZpvd(this.EZpvd, str, bundle);
            }
        });
        getSupportFragmentManager().setFragmentResultListener("SUB_SELECT_TYPE", this, new FragmentResultListener() { // from class: o.viz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.fragment.app.FragmentResultListener
            public final void onFragmentResult(java.lang.String str, android.os.Bundle bundle) {
                ActivityC51215vin.copydefault(this.copydefault, str, bundle);
            }
        });
        getSupportFragmentManager().setFragmentResultListener("SUB_CONFIRM_TYPE", this, new FragmentResultListener() { // from class: o.viC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.fragment.app.FragmentResultListener
            public final void onFragmentResult(java.lang.String str, android.os.Bundle bundle) {
                ActivityC51215vin.djBIcL(this.copydefault, str, bundle);
            }
        });
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void EZpvd(ActivityC51215vin activityC51215vin, java.lang.String str, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(bundle, "");
        ((SignalBotCopyPresenter) activityC51215vin.gHZMYf()).AuCTelauCTel();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v2, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r4v1, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void copydefault(ActivityC51215vin activityC51215vin, java.lang.String str, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(bundle, "");
        java.lang.String string = bundle.getString("SUB_SELECT_TYPE");
        if (string == null) {
            string = "";
        }
        SignalDetails signalDetailsKWHzl = ((SignalBotCopyPresenter) activityC51215vin.gHZMYf()).KWHzl(string);
        if (Intrinsics.EZpvd((java.lang.Object) string, (java.lang.Object) "free")) {
            ((SignalBotCopyPresenter) activityC51215vin.gHZMYf()).copydefault(signalDetailsKWHzl);
            return;
        }
        if (Intrinsics.EZpvd((java.lang.Object) string, (java.lang.Object) "profit_sharing")) {
            useSignalBot$default(activityC51215vin, string, false, 2, null);
            return;
        }
        C51396vmI.Activity activity = C51396vmI.Companion;
        androidx.fragment.app.FragmentManager supportFragmentManager = activityC51215vin.getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
        activity.AEQbTJ(signalDetailsKWHzl, supportFragmentManager);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void djBIcL(ActivityC51215vin activityC51215vin, java.lang.String str, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(bundle, "");
        SignalBotCopyPresenter signalBotCopyPresenter = (SignalBotCopyPresenter) activityC51215vin.gHZMYf();
        SignalDetails signalDetails = (SignalDetails) bundle.getParcelable("SUB_CONFIRM_DATA");
        if (signalDetails == null) {
            signalDetails = new SignalDetails(null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, 67108863, null);
        }
        signalBotCopyPresenter.copydefault(signalDetails);
    }

    @Override // o.AbstractActivityC51218viq, o.AbstractActivityC54499xKr, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        java.lang.String str = this.AhwBna;
        if (str != null) {
            C56058xve.Companion.copydefault().AEQbTJ(str);
        }
    }

    @Override // o.AbstractActivityC51218viq, o.AbstractActivityC48163uHh, o.AbstractActivityC54499xKr, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.AbstractActivityC51218viq, o.AbstractActivityC48163uHh, o.AbstractActivityC54499xKr, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // o.AbstractActivityC51218viq, o.AbstractActivityC48163uHh, o.AbstractActivityC54499xKr, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // o.AbstractActivityC51218viq, o.AbstractActivityC48163uHh, o.AbstractActivityC54499xKr, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
