package o;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.ViewCompat;
import com.airbnb.lottie.LottieAnimationView;
import com.okinc.business.defi.biz.core.error.WalletImportError;
import com.okinc.business.dex.api.bean.CoinDetailRedirection;
import com.okinc.business.dex.api.bean.OKDCoinDetailConfig;
import com.okinc.business.dex.api.bean.OKDSourceType;
import com.okinc.business.dex.api.bean.RedirectionType;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.drv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C14783drv extends ConstraintLayout {
    public Function0<Unit> AYXKKw;
    public Function0<Unit> AhwBna;
    public int EZpvd;
    public AbstractC17165exe KWHzl;
    public java.lang.String OLrzqt;
    public final C43316rmw copydefault;
    public boolean djBIcL;
    public final C14737drB gEmmrt;
    public java.util.List<C14738drC> valueOf;
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int AEQbTJ = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C14783drv(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C14783drv(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPnlListDetailCallback(Function0<Unit> function0) {
        this.AYXKKw = function0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPnlListRetryCallback(Function0<Unit> function0) {
        this.AhwBna = function0;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:30) call: o.drv.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C14783drv(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14783drv(@NotNull final android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        AbstractC17165exe abstractC17165exeEZpvd = AbstractC17165exe.EZpvd(android.view.LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(abstractC17165exeEZpvd, "");
        this.KWHzl = abstractC17165exeEZpvd;
        C43316rmw c43316rmw = new C43316rmw();
        this.copydefault = c43316rmw;
        this.gEmmrt = new C14737drB(new Function1() { // from class: o.drt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C14783drv.copydefault(this.OLrzqt, context, (C14738drC) obj);
            }
        });
        this.EZpvd = 1;
        this.djBIcL = true;
        this.OLrzqt = "";
        AbstractC17165exe abstractC17165exe = this.KWHzl;
        AppCompatImageView appCompatImageView = abstractC17165exe.KWHzl;
        appCompatImageView.setOnClickListener(new Application(appCompatImageView, 1000L, this));
        AppCompatTextView appCompatTextView = abstractC17165exe.copydefault;
        appCompatTextView.setOnClickListener(new Activity(appCompatTextView, 1000L, this));
        ViewCompat.setNestedScrollingEnabled(abstractC17165exe.AEQbTJ, false);
        abstractC17165exe.AEQbTJ.setHasFixedSize(true);
        abstractC17165exe.AEQbTJ.setAdapter(c43316rmw);
    }

    /* JADX INFO: renamed from: o.drv$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.drv.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    public static final Unit copydefault(C14783drv c14783drv, android.content.Context context, C14738drC c14738drC) {
        Intrinsics.checkNotNullParameter(c14738drC, "");
        OKDCoinDetailConfig oKDCoinDetailConfig = new OKDCoinDetailConfig(OKDSourceType.WALLET_SOURCE, C33129mqd.gEmmrt(c14738drC.AEQbTJ()), c14738drC.EZpvd(), c14738drC.AYXKKw(), null, null, null, new CoinDetailRedirection(RedirectionType.TRADER_DETAIL, c14783drv.OLrzqt), WalletImportError.ERROR_CODE_AA_EXIST, null);
        gKO gko = (gKO) C43251rlk.copydefault(gKO.class);
        android.app.Activity activityOLrzqt = C33569myt.OLrzqt(context);
        if (activityOLrzqt == null) {
            return Unit.INSTANCE;
        }
        gko.OLrzqt(activityOLrzqt, oKDCoinDetailConfig);
        return Unit.INSTANCE;
    }

    public static final void AEQbTJ(C14783drv c14783drv) {
        Function0<Unit> function0;
        if (c14783drv.copydefault.getItems().isEmpty()) {
            return;
        }
        java.util.List<?> items = c14783drv.copydefault.getItems();
        Intrinsics.checkNotNullExpressionValue(items, "");
        if ((CollectionsKt___CollectionsKt.firstOrNull(items) instanceof C14317djF) || (function0 = c14783drv.AYXKKw) == null) {
            return;
        }
        function0.invoke();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.copydefault.register(C14738drC.class, this.gEmmrt);
    }

    public static /* synthetic */ void setData$default(C14783drv c14783drv, java.lang.String str, java.util.List list, int i, boolean z, int i2, java.lang.Object obj) {
        if ((i2 & 8) != 0) {
            z = true;
        }
        c14783drv.setData(str, list, i, z);
    }

    public final void setData(@NotNull java.lang.String str, java.util.List<C14738drC> list, int i, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        this.OLrzqt = str;
        this.valueOf = list;
        this.EZpvd = i;
        this.djBIcL = z;
        this.gEmmrt.AEQbTJ(z);
        if (i == 1) {
            OLrzqt();
            this.KWHzl.KWHzl.setVisibility(8);
            this.KWHzl.AEQbTJ.setVisibility(8);
            this.KWHzl.EZpvd.setVisibility(8);
            return;
        }
        if (i == 2) {
            EZpvd();
            this.KWHzl.KWHzl.setVisibility(8);
            this.KWHzl.AEQbTJ.setVisibility(8);
            C55173xeu c55173xeu = this.KWHzl.EZpvd;
            c55173xeu.setVisibility(0);
            c55173xeu.setSubTitle((java.lang.CharSequence) C33070mpX.AYXKKw(C13754dXa.FragmentManager.DcMfJKffREWX));
            c55173xeu.setEmptyTypeImage(8);
            c55173xeu.setRetry(C33070mpX.AYXKKw(C13754dXa.FragmentManager.DcMfJKfNUfqk));
            c55173xeu.setRetryClickListener(new View.OnClickListener() { // from class: o.drx
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C14783drv.setData$lambda$5$lambda$4(this.copydefault, view);
                }
            });
            return;
        }
        if (i != 3) {
            return;
        }
        EZpvd();
        if (list == null || list.isEmpty()) {
            this.KWHzl.KWHzl.setVisibility(8);
            this.KWHzl.AEQbTJ.setVisibility(8);
            C55173xeu c55173xeu2 = this.KWHzl.EZpvd;
            c55173xeu2.setVisibility(0);
            c55173xeu2.setSubTitle((java.lang.CharSequence) C33070mpX.AYXKKw(C13754dXa.FragmentManager.UimiPO));
            c55173xeu2.setEmptyTypeImage(7);
            c55173xeu2.setRetry("");
            Intrinsics.copydefault(c55173xeu2);
            return;
        }
        this.KWHzl.EZpvd.setVisibility(8);
        this.KWHzl.KWHzl.setVisibility(0);
        this.KWHzl.AEQbTJ.setVisibility(0);
        C33064mpR.OLrzqt(this.copydefault, (java.util.List<? extends java.lang.Object>) list);
    }

    public static final void setData$lambda$5$lambda$4(C14783drv c14783drv, android.view.View view) {
        Function0<Unit> function0 = c14783drv.AhwBna;
        if (function0 != null) {
            function0.invoke();
        }
    }

    private final void OLrzqt() {
        LottieAnimationView lottieAnimationView = this.KWHzl.OLrzqt;
        lottieAnimationView.setAnimation(C13754dXa.Fragment.DbNXlk);
        lottieAnimationView.playAnimation();
        lottieAnimationView.setRepeatCount(-1);
        lottieAnimationView.setVisibility(0);
    }

    private final void EZpvd() {
        LottieAnimationView lottieAnimationView = this.KWHzl.OLrzqt;
        lottieAnimationView.setVisibility(8);
        lottieAnimationView.pauseAnimation();
        lottieAnimationView.cancelAnimation();
    }

    public final long KWHzl() {
        C14738drC c14738drC;
        java.lang.String strAEQbTJ;
        java.util.List<C14738drC> list = this.valueOf;
        if (list == null || (c14738drC = (C14738drC) CollectionsKt___CollectionsKt.firstOrNull(list)) == null || (strAEQbTJ = c14738drC.AEQbTJ()) == null) {
            return Long.MIN_VALUE;
        }
        return java.lang.Long.parseLong(strAEQbTJ);
    }

    /* JADX INFO: renamed from: o.drv$Activity */
    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ C14783drv OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, C14783drv c14783drv) {
            this.EZpvd = view;
            this.KWHzl = j;
            this.OLrzqt = c14783drv;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.KWHzl || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                C14783drv.AEQbTJ(this.OLrzqt);
            }
        }
    }

    /* JADX INFO: renamed from: o.drv$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ C14783drv copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, C14783drv c14783drv) {
            this.KWHzl = view;
            this.AEQbTJ = j;
            this.copydefault = c14783drv;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.AEQbTJ || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                C14783drv.AEQbTJ(this.copydefault);
            }
        }
    }

    public final void copydefault() {
        int i;
        boolean z = this.djBIcL;
        if (z && (i = this.EZpvd) == 3) {
            setData(this.OLrzqt, this.valueOf, i, z);
        }
    }
}
