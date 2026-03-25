package o;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.FragmentResultListener;
import androidx.lifecycle.Observer;
import com.okinc.business.defi.biz.core.error.WalletImportError;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.tradingbot.impl.order.strategy.dcd.view.DcdPnlChartView;
import com.okinc.tradingbot.impl.order.strategy.ordercomfirm.BotOrderConfirmFragment;
import com.okinc.unify_trade.biz.DcdBotQuotesDetail;
import com.okinc.unify_trade.biz.ProductItemResp;
import com.okinc.unify_trade.biz.StrategyResponse;
import com.okinc.unify_trade.bot.data.DcdPnlChartData;
import com.okinc.unify_trade.bot.data.DcdProductListReq;
import com.okinc.unify_trade.bot.dcd.config.DcdTpMode;
import com.okinc.unify_trade.bot.dcd.presenter.DcdProductDetailPresenter;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C48033uCm;
import o.vLH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.vLg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class ActivityC50353vLg extends AbstractActivityC48163uHh<uYM, DcdProductDetailPresenter> {
    public static final Application Companion = new Application(null);

    /* JADX INFO: renamed from: o.vLg$Activity */
    public static final /* synthetic */ class Activity implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(Function1 function1) {
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

    /* JADX INFO: renamed from: o.vLg$TaskDescription */
    public final /* synthetic */ class TaskDescription {
        public static final /* synthetic */ int[] OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[DcdTpMode.values().length];
            try {
                iArr[DcdTpMode.BUY_PRICE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[DcdTpMode.CUSTOM_PRICE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[DcdTpMode.DECIMAL.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            OLrzqt = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractActivityC54499xKr
    public int AYXKKw() {
        return C48033uCm.Activity.hgxRZI;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ uYM KWHzl(ActivityC50353vLg activityC50353vLg) {
        return (uYM) activityC50353vLg.sSMYrx();
    }

    /* JADX INFO: renamed from: o.vLg$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.vLg.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public static /* synthetic */ void open$default(Application application, android.content.Context context, ProductItemResp productItemResp, DcdProductListReq dcdProductListReq, boolean z, int i, java.lang.Object obj) {
            if ((i & 8) != 0) {
                z = false;
            }
            application.copydefault(context, productItemResp, dcdProductListReq, z);
        }

        public final void copydefault(@NotNull android.content.Context context, ProductItemResp productItemResp, DcdProductListReq dcdProductListReq, boolean z) {
            Intrinsics.checkNotNullParameter(context, "");
            android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) ActivityC50353vLg.class);
            intent.putExtra("bot_item_data", productItemResp);
            intent.putExtra("bot_trade_data", dcdProductListReq);
            intent.putExtra("advancedMode", z);
            context.startActivity(intent);
        }
    }

    public final boolean copydefault() {
        return getIntent().getBooleanExtra("advancedMode", false);
    }

    @Override // o.AbstractActivityC48163uHh, o.AbstractActivityC54499xKr, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        djBIcL();
        AhwBna();
        valueOf();
        gEmmrt();
        KWHzl();
        C32866mlf.onEvent$default("DCDBot_ProductList_DetailsPage_View", (TrackChannel[]) null, (Function1) null, 3, (java.lang.Object) null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v6, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    private final void djBIcL() {
        ((uYM) sSMYrx()).KWHzl.setOnInvestChangeCallback(new Function1() { // from class: o.vLo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC50353vLg.copydefault(this.OLrzqt, (java.lang.String) obj);
            }
        });
        ((uYM) sSMYrx()).AhwBna.EZpvd(copydefault());
        ((uYM) sSMYrx()).AhwBna.setOnTpModeChange(new Function1() { // from class: o.vLq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC50353vLg.AEQbTJ(this.AEQbTJ, (DcdTpMode) obj);
            }
        });
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit copydefault(ActivityC50353vLg activityC50353vLg, java.lang.String str) {
        DcdProductDetailPresenter.fetchQuotes$default((DcdProductDetailPresenter) activityC50353vLg.gHZMYf(), str, true, false, 4, null);
        if (str == null) {
            str = "";
        }
        activityC50353vLg.OLrzqt(str);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v1, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit AEQbTJ(final ActivityC50353vLg activityC50353vLg, final DcdTpMode dcdTpMode) {
        Intrinsics.checkNotNullParameter(dcdTpMode, "");
        C32866mlf.onEvent$default("DCDBot_ProductList_TakeProfitMode_Click", (TrackChannel[]) null, new Function1() { // from class: o.vLl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC50353vLg.copydefault(this.OLrzqt, dcdTpMode, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
        final NestedScrollView nestedScrollView = ((uYM) activityC50353vLg.sSMYrx()).AYXKKw;
        nestedScrollView.post(new java.lang.Runnable() { // from class: o.vLm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                ActivityC50353vLg.AEQbTJ(nestedScrollView);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(ActivityC50353vLg activityC50353vLg, DcdTpMode dcdTpMode, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("type", activityC50353vLg.copydefault(dcdTpMode), true);
        return Unit.INSTANCE;
    }

    public static final void AEQbTJ(NestedScrollView nestedScrollView) {
        nestedScrollView.smoothScrollTo(0, nestedScrollView.getChildAt(0).getHeight());
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v6, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    private final void AhwBna() {
        ((uYM) sSMYrx()).AYXKKw.setOnScrollChangeListener(new View.OnScrollChangeListener() { // from class: o.vLk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnScrollChangeListener
            public final void onScrollChange(android.view.View view, int i, int i2, int i3, int i4) {
                ActivityC50353vLg.AEQbTJ(this.OLrzqt, view, i, i2, i3, i4);
            }
        });
        C52794wYp c52794wYp = ((uYM) sSMYrx()).EZpvd;
        c52794wYp.setOnClickListener(new StateListAnimator(c52794wYp, 1000L, this));
        AppCompatImageView appCompatImageView = ((uYM) sSMYrx()).AEQbTJ;
        appCompatImageView.setOnClickListener(new ActionBar(appCompatImageView, 1000L, this));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void AEQbTJ(ActivityC50353vLg activityC50353vLg, android.view.View view, int i, int i2, int i3, int i4) {
        int height = ((uYM) activityC50353vLg.sSMYrx()).valueOf.getHeight() * 3;
        ((uYM) activityC50353vLg.sSMYrx()).djBIcL.setAlpha(i2 == 0 ? 0.0f : (i2 < 0 || i2 > height) ? 1.0f : i2 / height);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public final void AEQbTJ() {
        java.lang.String instId;
        java.lang.String instType;
        BotOrderConfirmFragment.TaskDescription taskDescription = BotOrderConfirmFragment.Companion;
        DcdProductListReq dcdProductListReqEZpvd = ((DcdProductDetailPresenter) gHZMYf()).EZpvd();
        if (dcdProductListReqEZpvd == null || (instId = dcdProductListReqEZpvd.getInstId()) == null) {
            instId = "";
        }
        DcdProductListReq dcdProductListReqEZpvd2 = ((DcdProductDetailPresenter) gHZMYf()).EZpvd();
        if (dcdProductListReqEZpvd2 == null || (instType = dcdProductListReqEZpvd2.getInstType()) == null) {
            instType = "";
        }
        BotOrderConfirmFragment botOrderConfirmFragmentCopydefault = taskDescription.copydefault(instId, instType, ((DcdProductDetailPresenter) gHZMYf()).OLrzqt(((uYM) sSMYrx()).KWHzl.OLrzqt(), ((uYM) sSMYrx()).AhwBna.OLrzqt()), (248 & 8) != 0 ? false : false, (248 & 16) != 0 ? null : null, (248 & 32) != 0 ? "" : null, (248 & 64) != 0 ? null : null, (248 & 128) != 0 ? null : null);
        androidx.fragment.app.FragmentManager supportFragmentManager = getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
        botOrderConfirmFragmentCopydefault.show(supportFragmentManager);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v12, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v15, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v18, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v7, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    private final void valueOf() {
        ((DcdProductDetailPresenter) gHZMYf()).gEmmrt().observe(this, new Activity(new Function1() { // from class: o.vLr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC50353vLg.KWHzl(this.EZpvd, (DcdBotQuotesDetail) obj);
            }
        }));
        ((DcdProductDetailPresenter) gHZMYf()).copydefault().AhwBna().observe(this, new Activity(new Function1() { // from class: o.vLs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC50353vLg.OLrzqt(this.EZpvd, (java.lang.Exception) obj);
            }
        }));
        ((DcdProductDetailPresenter) gHZMYf()).AEQbTJ().observe(this, new Activity(new Function1() { // from class: o.vLp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC50353vLg.EZpvd(this.copydefault, ((java.lang.Boolean) obj).booleanValue());
            }
        }));
        getSupportFragmentManager().setFragmentResultListener("tag_confirm_callback", this, new FragmentResultListener() { // from class: o.vLv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.fragment.app.FragmentResultListener
            public final void onFragmentResult(java.lang.String str, android.os.Bundle bundle) {
                ActivityC50353vLg.EZpvd(this.copydefault, str, bundle);
            }
        });
        getSupportFragmentManager().setFragmentResultListener("bot_order", this, new FragmentResultListener() { // from class: o.vLx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.fragment.app.FragmentResultListener
            public final void onFragmentResult(java.lang.String str, android.os.Bundle bundle) {
                ActivityC50353vLg.OLrzqt(this.AEQbTJ, str, bundle);
            }
        });
        ((DcdProductDetailPresenter) gHZMYf()).OLrzqt().observe(this, new Activity(new Function1() { // from class: o.vLy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC50353vLg.copydefault(this.copydefault, (java.util.List) obj);
            }
        }));
        ((DcdProductDetailPresenter) gHZMYf()).getAggregateLoadingLiveData().observe(this, new Activity(new Function1() { // from class: o.vLu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC50353vLg.EZpvd(this.KWHzl, (androidx.core.util.Pair) obj);
            }
        }));
        ((DcdProductDetailPresenter) gHZMYf()).getAggregateErrorLiveData().observe(this, new Activity(new Function1() { // from class: o.vLw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC50353vLg.AEQbTJ(this.EZpvd, (androidx.core.util.Pair) obj);
            }
        }));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r1v3, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit KWHzl(ActivityC50353vLg activityC50353vLg, DcdBotQuotesDetail dcdBotQuotesDetail) {
        Intrinsics.checkNotNullParameter(dcdBotQuotesDetail, "");
        activityC50353vLg.copydefault(dcdBotQuotesDetail);
        ((uYM) activityC50353vLg.sSMYrx()).KWHzl.OLrzqt(dcdBotQuotesDetail);
        ((uYM) activityC50353vLg.sSMYrx()).AhwBna.EZpvd(dcdBotQuotesDetail);
        java.lang.String absYieldPercentage = dcdBotQuotesDetail.getAbsYieldPercentage();
        activityC50353vLg.EZpvd(absYieldPercentage != null ? absYieldPercentage : "");
        rVN.reportFullyDrawn$default((android.app.Activity) activityC50353vLg, true, (java.lang.String) null, 2, (java.lang.Object) null);
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(ActivityC50353vLg activityC50353vLg, java.lang.Exception exc) {
        Intrinsics.checkNotNullParameter(exc, "");
        activityC50353vLg.EZpvd();
        rVN.reportFullyDrawn$default((android.app.Activity) activityC50353vLg, false, (java.lang.String) null, 2, (java.lang.Object) null);
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(ActivityC50353vLg activityC50353vLg, boolean z) {
        activityC50353vLg.OLrzqt();
        return Unit.INSTANCE;
    }

    public static final void EZpvd(ActivityC50353vLg activityC50353vLg, java.lang.String str, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(bundle, "");
        activityC50353vLg.AEQbTJ();
    }

    public static final void OLrzqt(ActivityC50353vLg activityC50353vLg, java.lang.String str, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(bundle, "");
        activityC50353vLg.values();
    }

    public static final Unit copydefault(ActivityC50353vLg activityC50353vLg, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        StrategyResponse strategyResponse = (StrategyResponse) CollectionsKt___CollectionsKt.firstOrNull(list);
        ActivityC51150vhb.Companion.AEQbTJ(activityC50353vLg, (WalletImportError.ERROR_CODE_AA_EXIST & 2) != 0 ? null : "dcd_bot", (WalletImportError.ERROR_CODE_AA_EXIST & 4) != 0 ? null : strategyResponse != null ? strategyResponse.getAlgoId() : null, (WalletImportError.ERROR_CODE_AA_EXIST & 8) != 0 ? null : null, (WalletImportError.ERROR_CODE_AA_EXIST & 16) != 0 ? false : false, (WalletImportError.ERROR_CODE_AA_EXIST & 32) != 0 ? null : null, (WalletImportError.ERROR_CODE_AA_EXIST & 64) == 0 ? null : null);
        activityC50353vLg.finish();
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: F */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r3v1, resolved type: S */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit EZpvd(ActivityC50353vLg activityC50353vLg, androidx.core.util.Pair pair) {
        if (Intrinsics.EZpvd(pair.first, (java.lang.Object) ((DcdProductDetailPresenter) activityC50353vLg.gHZMYf()).KWHzl().bB_())) {
            if (((java.lang.Boolean) pair.second).booleanValue()) {
                activityC50353vLg.showLoading();
            } else {
                activityC50353vLg.dismissLoading();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: F */
    /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r2v7, resolved type: S */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit AEQbTJ(ActivityC50353vLg activityC50353vLg, androidx.core.util.Pair pair) {
        java.lang.String message;
        if (Intrinsics.EZpvd(pair.first, (java.lang.Object) ((DcdProductDetailPresenter) activityC50353vLg.gHZMYf()).KWHzl().bB_()) && (message = ((java.lang.Exception) pair.second).getMessage()) != null) {
            C55326xho.toastWithFailedIcon$default(message, 0, 1, (java.lang.Object) null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.vLg$ActionBar */
    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ ActivityC50353vLg EZpvd;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, ActivityC50353vLg activityC50353vLg) {
            this.copydefault = view;
            this.OLrzqt = j;
            this.EZpvd = activityC50353vLg;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.OLrzqt || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                this.EZpvd.finish();
            }
        }
    }

    /* JADX INFO: renamed from: o.vLg$StateListAnimator */
    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ ActivityC50353vLg KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, ActivityC50353vLg activityC50353vLg) {
            this.AEQbTJ = view;
            this.EZpvd = j;
            this.KWHzl = activityC50353vLg;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.EZpvd || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                if (ActivityC50353vLg.KWHzl(this.KWHzl).KWHzl.valueOf() && ActivityC50353vLg.KWHzl(this.KWHzl).AhwBna.copydefault()) {
                    vLH.Activity activity = vLH.Companion;
                    androidx.fragment.app.FragmentManager supportFragmentManager = this.KWHzl.getSupportFragmentManager();
                    Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
                    if (activity.EZpvd(supportFragmentManager)) {
                        return;
                    }
                    C32866mlf.onEvent$default("DCDBot_ProductList_Create_Click", (TrackChannel[]) null, (Function1) null, 3, (java.lang.Object) null);
                    this.KWHzl.AEQbTJ();
                }
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    private final void values() {
        C32866mlf.onEvent$default("DCDBot_Create_PlaceOrder_Click", (TrackChannel[]) null, (Function1) null, 3, (java.lang.Object) null);
        ((DcdProductDetailPresenter) gHZMYf()).KWHzl(((uYM) sSMYrx()).KWHzl.OLrzqt(), ((uYM) sSMYrx()).AhwBna.OLrzqt());
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public final void copydefault(DcdBotQuotesDetail dcdBotQuotesDetail) {
        ((uYM) sSMYrx()).copydefault.EZpvd(dcdBotQuotesDetail);
        ((uYM) sSMYrx()).djBIcL.setText(((uYM) sSMYrx()).copydefault.OLrzqt());
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v4, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v5, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    private final void gEmmrt() {
        ((DcdProductDetailPresenter) gHZMYf()).KWHzl((ProductItemResp) getIntent().getParcelableExtra("bot_item_data"));
        ((DcdProductDetailPresenter) gHZMYf()).AEQbTJ((DcdProductListReq) getIntent().getParcelableExtra("bot_trade_data"));
        DcdProductDetailPresenter.fetchQuotes$default((DcdProductDetailPresenter) gHZMYf(), ((uYM) sSMYrx()).KWHzl.OLrzqt(), false, false, 6, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r1v4, resolved type: Binding */
    /* JADX DEBUG: Possible override for method o.xKr.KWHzl()Ljava/lang/Class; */
    /* JADX WARN: Multi-variable type inference failed */
    public final void KWHzl() {
        DcdPnlChartData dcdPnlChartDataKWHzl = ((DcdProductDetailPresenter) gHZMYf()).KWHzl(((uYM) sSMYrx()).KWHzl.OLrzqt());
        DcdPnlChartView dcdPnlChartView = ((uYM) sSMYrx()).OLrzqt;
        dcdPnlChartView.copydefault(dcdPnlChartDataKWHzl);
        dcdPnlChartView.OLrzqt(dcdPnlChartDataKWHzl.getMApy());
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public final void OLrzqt(java.lang.String str) {
        ((uYM) sSMYrx()).OLrzqt.AEQbTJ(str);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public final void EZpvd(java.lang.String str) {
        ((uYM) sSMYrx()).OLrzqt.OLrzqt(str);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractActivityC48163uHh, o.AbstractActivityC54499xKr, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        C50392vMs c50392vMs = ((uYM) sSMYrx()).KWHzl;
        DcdProductListReq dcdProductListReqEZpvd = ((DcdProductDetailPresenter) gHZMYf()).EZpvd();
        c50392vMs.AEQbTJ(dcdProductListReqEZpvd != null ? dcdProductListReqEZpvd.getInstId() : null);
    }

    public final void EZpvd() {
        ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(this);
        viewOnClickListenerC54939xaY.setTitle(C33070mpX.AYXKKw(C48033uCm.Fragment.QIZEnU));
        viewOnClickListenerC54939xaY.EZpvd(C33070mpX.AYXKKw(C48033uCm.Fragment.QXDzTk));
        viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) C33070mpX.AYXKKw(C48033uCm.Fragment.hrNTAI), new View.OnClickListener() { // from class: o.vLt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                ActivityC50353vLg.copydefault(this.EZpvd, view);
            }
        });
        viewOnClickListenerC54939xaY.show();
    }

    public static final void copydefault(ActivityC50353vLg activityC50353vLg, android.view.View view) {
        activityC50353vLg.finish();
    }

    /* JADX DEBUG: Possible override for method o.xKr.OLrzqt()Lcom/okinc/unify_trade/refactor/presenter/AbsPresenter; */
    public final void OLrzqt() {
        final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(this);
        viewOnClickListenerC54939xaY.setTitle(C33070mpX.AYXKKw(C48033uCm.Fragment.RKcVTr));
        viewOnClickListenerC54939xaY.EZpvd(C33070mpX.AYXKKw(C48033uCm.Fragment.RVsVBY));
        viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) C33070mpX.AYXKKw(C48033uCm.Fragment.QDqgQU), new View.OnClickListener() { // from class: o.vLi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                ActivityC50353vLg.OLrzqt(this.OLrzqt, viewOnClickListenerC54939xaY, view);
            }
        });
        viewOnClickListenerC54939xaY.AEQbTJ(C33070mpX.AYXKKw(C48033uCm.Fragment.OJuSTm), new View.OnClickListener() { // from class: o.vLn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                ActivityC50353vLg.AEQbTJ(this.OLrzqt, view);
            }
        });
        viewOnClickListenerC54939xaY.show();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void OLrzqt(ActivityC50353vLg activityC50353vLg, ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        ((DcdProductDetailPresenter) activityC50353vLg.gHZMYf()).EZpvd(((uYM) activityC50353vLg.sSMYrx()).KWHzl.OLrzqt());
        viewOnClickListenerC54939xaY.dismiss();
    }

    public static final void AEQbTJ(ActivityC50353vLg activityC50353vLg, android.view.View view) {
        activityC50353vLg.finish();
    }

    public final java.lang.String copydefault(DcdTpMode dcdTpMode) {
        int i = TaskDescription.OLrzqt[dcdTpMode.ordinal()];
        if (i == 1) {
            return "buy_price";
        }
        if (i == 2) {
            return "custom";
        }
        if (i == 3) {
            return "raise_percentage";
        }
        throw new NoWhenBranchMatchedException();
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
