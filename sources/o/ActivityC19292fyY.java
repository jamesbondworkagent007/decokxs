package o;

import android.view.View;
import android.view.ViewGroup;
import androidx.core.content.ContextCompat;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.FlowExtKt;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.shape.RoundedCornerTreatment;
import com.okinc.business.defi.wallet.mine.walletbind.WalletBindCeFiSelectWalletActivity$initView$2;
import com.okinc.business.defi.wallet.mine.walletbind.WalletBindCeFiSelectWalletActivity$initView$3;
import com.okinc.business.defi.wallet.mine.walletbind.WalletBindCeFiSelectWalletActivity$initView$4;
import com.okinc.business.defi.wallet.mine.walletbind.WalletBindCeFiSelectWalletActivity$observeData$1;
import com.okinc.business.defi.wallet.mine.walletbind.WalletBindCeFiSelectWalletActivity$observeData$2;
import com.okinc.business.defi.wallet.mine.walletbind.WalletBindCeFiSelectWalletActivity$observeData$3;
import com.okinc.business.defi.wallet.mine.walletbind.WalletBindCeFiSelectWalletActivity$observeData$4;
import com.okinc.business.defi.wallet.mine.walletbind.datasource.BindCeFiDeeplinkParams;
import com.okinc.business.defi.wallet.mine.walletbind.datasource.Intention;
import com.okinc.business.defi.wallet.mine.walletbind.datasource.ValidateNonceResponseBody;
import com.okinc.business.defi.wallet.mine.walletbind.viewmodel.WalletBindCeFiSelectViewModel;
import com.okinc.wallet.api.bean.WalletInfo;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.StateFlow;
import o.C13754dXa;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fyY, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class ActivityC19292fyY extends AbstractActivityC19309fyp {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int KWHzl = 8;
    public AbstractC16243egJ AYXKKw;
    public BindCeFiDeeplinkParams AhwBna;
    public final InterfaceC56387yDm gEmmrt;
    public java.lang.String valueOf = "";
    public java.lang.String djBIcL = "";

    public ActivityC19292fyY() {
        final Function0 function0 = null;
        this.gEmmrt = new ViewModelLazy(C56524yIo.AEQbTJ(WalletBindCeFiSelectViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.defi.wallet.mine.walletbind.WalletBindCeFiSelectWalletActivity$special$$inlined$viewModels$default$2
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                ViewModelStore viewModelStore = this.getViewModelStore();
                Intrinsics.checkNotNullExpressionValue(viewModelStore, "");
                return viewModelStore;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.defi.wallet.mine.walletbind.WalletBindCeFiSelectWalletActivity$special$$inlined$viewModels$default$1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory = this.getDefaultViewModelProviderFactory();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "");
                return defaultViewModelProviderFactory;
            }
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.defi.wallet.mine.walletbind.WalletBindCeFiSelectWalletActivity$special$$inlined$viewModels$default$3
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function02 = function0;
                if (function02 != null && (creationExtras = (CreationExtras) function02.invoke()) != null) {
                    return creationExtras;
                }
                CreationExtras defaultViewModelCreationExtras = this.getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "");
                return defaultViewModelCreationExtras;
            }
        });
    }

    /* JADX DEBUG: Possible override for method o.fyp.KWHzl()V */
    public final WalletBindCeFiSelectViewModel KWHzl() {
        return (WalletBindCeFiSelectViewModel) this.gEmmrt.getValue();
    }

    /* JADX INFO: renamed from: o.fyY$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.fyY.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final void EZpvd(@NotNull android.content.Context context, @NotNull BindCeFiDeeplinkParams bindCeFiDeeplinkParams) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(bindCeFiDeeplinkParams, "");
            android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) ActivityC19292fyY.class);
            intent.putExtra("PARAMS_KEY", bindCeFiDeeplinkParams);
            context.startActivity(intent);
        }
    }

    @Override // o.AbstractActivityC19309fyp, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        java.lang.String nonce;
        super.onCreate(bundle);
        this.AYXKKw = (AbstractC16243egJ) DataBindingUtil.setContentView(this, C13754dXa.TaskDescription.AYXKKw);
        BindCeFiDeeplinkParams bindCeFiDeeplinkParams = (BindCeFiDeeplinkParams) getIntent().getParcelableExtra("PARAMS_KEY");
        this.AhwBna = bindCeFiDeeplinkParams;
        if (bindCeFiDeeplinkParams == null || (nonce = bindCeFiDeeplinkParams.getNonce()) == null) {
            nonce = "";
        }
        this.valueOf = nonce;
        valueOf();
        djBIcL();
        KWHzl().KWHzl(this.valueOf);
        AYXKKw();
        getWindow().getDecorView().post(new java.lang.Runnable() { // from class: o.fze
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                ActivityC19292fyY.AhwBna(this.KWHzl);
            }
        });
    }

    public static final void AhwBna(ActivityC19292fyY activityC19292fyY) {
        rVN.reportFullyDrawn$default((android.app.Activity) activityC19292fyY, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    private final void AYXKKw() {
        StateFlow<java.lang.Boolean> stateFlowAYXKKw = KWHzl().AYXKKw();
        Lifecycle lifecycle = getLifecycle();
        Intrinsics.checkNotNullExpressionValue(lifecycle, "");
        FlowKt.launchIn(FlowKt.onEach(FlowExtKt.flowWithLifecycle$default(stateFlowAYXKKw, lifecycle, null, 2, null), new WalletBindCeFiSelectWalletActivity$observeData$1(this, null)), LifecycleOwnerKt.getLifecycleScope(this));
        StateFlow<ValidateNonceResponseBody> stateFlowOLrzqt = KWHzl().OLrzqt();
        Lifecycle lifecycle2 = getLifecycle();
        Intrinsics.checkNotNullExpressionValue(lifecycle2, "");
        FlowKt.launchIn(FlowKt.onEach(FlowExtKt.flowWithLifecycle$default(stateFlowOLrzqt, lifecycle2, null, 2, null), new WalletBindCeFiSelectWalletActivity$observeData$2(null)), LifecycleOwnerKt.getLifecycleScope(this));
        SharedFlow<kotlin.Pair<java.lang.String, java.lang.String>> sharedFlowKWHzl = KWHzl().KWHzl();
        Lifecycle lifecycle3 = getLifecycle();
        Intrinsics.checkNotNullExpressionValue(lifecycle3, "");
        FlowKt.launchIn(FlowKt.onEach(FlowExtKt.flowWithLifecycle$default(sharedFlowKWHzl, lifecycle3, null, 2, null), new WalletBindCeFiSelectWalletActivity$observeData$3(this, null)), LifecycleOwnerKt.getLifecycleScope(this));
        SharedFlow<java.lang.String> sharedFlowCopydefault = KWHzl().copydefault();
        Lifecycle lifecycle4 = getLifecycle();
        Intrinsics.checkNotNullExpressionValue(lifecycle4, "");
        FlowKt.launchIn(FlowKt.onEach(FlowExtKt.flowWithLifecycle$default(sharedFlowCopydefault, lifecycle4, null, 2, null), new WalletBindCeFiSelectWalletActivity$observeData$4(null)), LifecycleOwnerKt.getLifecycleScope(this));
    }

    private final void valueOf() {
        C55008xbo c55008xbo;
        C55009xbp c55009xbpFIwbmz;
        C52794wYp c52794wYp;
        C55008xbo c55008xbo2;
        C55009xbp c55009xbpFIwbmz2;
        C55008xbo c55008xbo3;
        C55009xbp c55009xbpFIwbmz3;
        C55008xbo c55008xbo4;
        C55009xbp c55009xbpFIwbmz4;
        C55008xbo c55008xbo5;
        C33537myN c33537myN;
        AbstractC16243egJ abstractC16243egJ = this.AYXKKw;
        if (abstractC16243egJ != null && (c33537myN = abstractC16243egJ.AEQbTJ) != null) {
            c33537myN.setBackListener(new View.OnClickListener() { // from class: o.fyV
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    ActivityC19292fyY.KWHzl(this.OLrzqt, view);
                }
            });
        }
        ShapeableImageView shapeableImageView = new ShapeableImageView(this);
        int dimensionPixelSize = shapeableImageView.getResources().getDimensionPixelSize(C52761wXj.StateListAnimator.ejfBZ);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(dimensionPixelSize, dimensionPixelSize);
        marginLayoutParams.setMarginEnd(shapeableImageView.getResources().getDimensionPixelSize(C52761wXj.StateListAnimator.fARcdN));
        shapeableImageView.setLayoutParams(marginLayoutParams);
        shapeableImageView.setShapeAppearanceModel(shapeableImageView.getShapeAppearanceModel().toBuilder().setAllCorners(new RoundedCornerTreatment()).setAllCornerSizes(shapeableImageView.getContext().getResources().getDimensionPixelSize(C52761wXj.StateListAnimator.fJNWhG)).build());
        AbstractC16243egJ abstractC16243egJ2 = this.AYXKKw;
        if (abstractC16243egJ2 != null && (c55008xbo5 = abstractC16243egJ2.EZpvd) != null) {
            c55008xbo5.setSizeType(44);
        }
        AhwBna();
        AbstractC16243egJ abstractC16243egJ3 = this.AYXKKw;
        if (abstractC16243egJ3 != null && (c55008xbo4 = abstractC16243egJ3.EZpvd) != null && (c55009xbpFIwbmz4 = c55008xbo4.fIwbmz()) != null) {
            c55009xbpFIwbmz4.addView(shapeableImageView, 0);
        }
        AbstractC16243egJ abstractC16243egJ4 = this.AYXKKw;
        if (abstractC16243egJ4 != null && (c55008xbo3 = abstractC16243egJ4.EZpvd) != null && (c55009xbpFIwbmz3 = c55008xbo3.fIwbmz()) != null) {
            C55009xbp.replaceFunctionDrawable$default(c55009xbpFIwbmz3, ContextCompat.getDrawable(this, C52761wXj.TaskDescription.OJuSTm), 0, 0, 6, null);
        }
        AbstractC16243egJ abstractC16243egJ5 = this.AYXKKw;
        if (abstractC16243egJ5 != null && (c55008xbo2 = abstractC16243egJ5.EZpvd) != null && (c55009xbpFIwbmz2 = c55008xbo2.fIwbmz()) != null) {
            c55009xbpFIwbmz2.setInterceptEvent(true);
        }
        StateFlow<WalletInfo> stateFlowEZpvd = KWHzl().EZpvd();
        Lifecycle lifecycle = getLifecycle();
        Intrinsics.checkNotNullExpressionValue(lifecycle, "");
        FlowKt.launchIn(FlowKt.onEach(FlowExtKt.flowWithLifecycle$default(stateFlowEZpvd, lifecycle, null, 2, null), new WalletBindCeFiSelectWalletActivity$initView$2(this, shapeableImageView, null)), LifecycleOwnerKt.getLifecycleScope(this));
        SharedFlow<java.lang.Boolean> sharedFlowAEQbTJ = KWHzl().AEQbTJ();
        Lifecycle lifecycle2 = getLifecycle();
        Intrinsics.checkNotNullExpressionValue(lifecycle2, "");
        FlowKt.launchIn(FlowKt.onEach(FlowKt.distinctUntilChanged(FlowExtKt.flowWithLifecycle$default(sharedFlowAEQbTJ, lifecycle2, null, 2, null)), new WalletBindCeFiSelectWalletActivity$initView$3(this, null)), LifecycleOwnerKt.getLifecycleScope(this));
        SharedFlow<java.lang.String> sharedFlowGEmmrt = KWHzl().gEmmrt();
        Lifecycle lifecycle3 = getLifecycle();
        Intrinsics.checkNotNullExpressionValue(lifecycle3, "");
        FlowKt.launchIn(FlowKt.onEach(FlowExtKt.flowWithLifecycle$default(sharedFlowGEmmrt, lifecycle3, null, 2, null), new WalletBindCeFiSelectWalletActivity$initView$4(this, null)), LifecycleOwnerKt.getLifecycleScope(this));
        AbstractC16243egJ abstractC16243egJ6 = this.AYXKKw;
        if (abstractC16243egJ6 != null && (c52794wYp = abstractC16243egJ6.copydefault) != null) {
            c52794wYp.setOnClickListener(new Application(c52794wYp, 1000L, this));
        }
        AbstractC16243egJ abstractC16243egJ7 = this.AYXKKw;
        if (abstractC16243egJ7 == null || (c55008xbo = abstractC16243egJ7.EZpvd) == null || (c55009xbpFIwbmz = c55008xbo.fIwbmz()) == null) {
            return;
        }
        c55009xbpFIwbmz.setOnClickListener(new Activity(c55009xbpFIwbmz, 1000L, this));
    }

    public static final void KWHzl(ActivityC19292fyY activityC19292fyY, android.view.View view) {
        java.lang.String sourceAppPackageName;
        Intention intention;
        WalletBindCeFiSelectViewModel walletBindCeFiSelectViewModelKWHzl = activityC19292fyY.KWHzl();
        BindCeFiDeeplinkParams bindCeFiDeeplinkParams = activityC19292fyY.AhwBna;
        if (bindCeFiDeeplinkParams == null || (sourceAppPackageName = bindCeFiDeeplinkParams.getSourceAppPackageName()) == null) {
            sourceAppPackageName = "";
        }
        BindCeFiDeeplinkParams bindCeFiDeeplinkParams2 = activityC19292fyY.AhwBna;
        if (bindCeFiDeeplinkParams2 == null || (intention = bindCeFiDeeplinkParams2.getIntention()) == null) {
            intention = Intention.EXCHANGE_MANAGEMENT;
        }
        walletBindCeFiSelectViewModelKWHzl.copydefault(sourceAppPackageName, intention);
    }

    /* JADX INFO: renamed from: o.fyY$ActionBar */
    public static final class ActionBar implements Function0<Unit> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar() {
        }

        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function0
        public /* synthetic */ Unit invoke() {
            AEQbTJ();
            return Unit.INSTANCE;
        }

        public final void AEQbTJ() {
            ActivityC19292fyY.this.finish();
        }
    }

    public final void AhwBna() {
        C55008xbo c55008xbo;
        android.widget.LinearLayout linearLayoutEjfBZ;
        C55008xbo c55008xbo2;
        C55009xbp c55009xbpFIwbmz;
        AbstractC16243egJ abstractC16243egJ = this.AYXKKw;
        if (abstractC16243egJ != null && (c55008xbo2 = abstractC16243egJ.EZpvd) != null && (c55009xbpFIwbmz = c55008xbo2.fIwbmz()) != null) {
            c55009xbpFIwbmz.setBackgroundResource(C52761wXj.Activity.invokespecialDPHOMC);
        }
        AbstractC16243egJ abstractC16243egJ2 = this.AYXKKw;
        if (abstractC16243egJ2 == null || (c55008xbo = abstractC16243egJ2.EZpvd) == null || (linearLayoutEjfBZ = c55008xbo.ejfBZ()) == null) {
            return;
        }
        linearLayoutEjfBZ.setBackground(null);
    }

    public final void EZpvd(WalletInfo walletInfo, android.widget.ImageView imageView) {
        C55008xbo c55008xbo;
        C55008xbo c55008xbo2;
        C55008xbo c55008xbo3;
        AbstractC16243egJ abstractC16243egJ = this.AYXKKw;
        if (abstractC16243egJ != null && (c55008xbo3 = abstractC16243egJ.EZpvd) != null) {
            c55008xbo3.values();
        }
        AhwBna();
        if (walletInfo != null) {
            AbstractC16243egJ abstractC16243egJ2 = this.AYXKKw;
            if (abstractC16243egJ2 != null && (c55008xbo = abstractC16243egJ2.EZpvd) != null) {
                c55008xbo.setText(walletInfo.OLrzqt());
            }
            C14725dqq.copydefault(imageView, walletInfo.copydefault(), C13754dXa.Activity.RlQdEF, new Function1() { // from class: o.fyW
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return ActivityC19292fyY.EZpvd((C5335Nt) obj);
                }
            }, 32.0f);
            imageView.setVisibility(C33129mqd.OLrzqt((java.lang.CharSequence) walletInfo.copydefault()) ? 0 : 8);
            return;
        }
        AbstractC16243egJ abstractC16243egJ3 = this.AYXKKw;
        if (abstractC16243egJ3 != null && (c55008xbo2 = abstractC16243egJ3.EZpvd) != null) {
            c55008xbo2.setText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.zuBGHE));
        }
        imageView.setVisibility(8);
    }

    public static final Unit EZpvd(C5335Nt c5335Nt) {
        Intrinsics.checkNotNullParameter(c5335Nt, "");
        c5335Nt.EZpvd((NN<android.graphics.Bitmap>) new C5417Qx(C55298xhM.dp2px$default(4.0f, null, 1, null)));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.fyY$Activity */
    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ ActivityC19292fyY copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, ActivityC19292fyY activityC19292fyY) {
            this.AEQbTJ = view;
            this.KWHzl = j;
            this.copydefault = activityC19292fyY;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.KWHzl || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                this.copydefault.djBIcL();
            }
        }
    }

    /* JADX INFO: renamed from: o.fyY$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ ActivityC19292fyY AEQbTJ;
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, ActivityC19292fyY activityC19292fyY) {
            this.EZpvd = view;
            this.copydefault = j;
            this.AEQbTJ = activityC19292fyY;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.copydefault || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                C19356fzj c19356fzjEZpvd = C19356fzj.Companion.EZpvd(this.AEQbTJ.KWHzl().EZpvd().getValue(), this.AEQbTJ.KWHzl().OLrzqt().getValue(), this.AEQbTJ.AhwBna, this.AEQbTJ.new ActionBar());
                androidx.fragment.app.FragmentManager supportFragmentManager = this.AEQbTJ.getSupportFragmentManager();
                Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
                c19356fzjEZpvd.show(supportFragmentManager);
            }
        }
    }

    public final void djBIcL() {
        java.lang.Object objM7377constructorimpl;
        java.lang.String chainIndex;
        try {
            Result.Application application = Result.Companion;
            BindCeFiDeeplinkParams bindCeFiDeeplinkParams = this.AhwBna;
            objM7377constructorimpl = Result.m7377constructorimpl((bindCeFiDeeplinkParams == null || (chainIndex = bindCeFiDeeplinkParams.getChainIndex()) == null) ? null : java.lang.Long.valueOf(java.lang.Long.parseLong(chainIndex)));
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
            objM7377constructorimpl = null;
        }
        java.lang.Long l = (java.lang.Long) objM7377constructorimpl;
        InterfaceC54824xWr interfaceC54824xWr = (InterfaceC54824xWr) C43251rlk.copydefault(InterfaceC54824xWr.class);
        androidx.fragment.app.FragmentManager supportFragmentManager = getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
        WalletInfo value = KWHzl().EZpvd().getValue();
        interfaceC54824xWr.copydefault(supportFragmentManager, value != null ? value.KWHzl() : null, l, new TaskDescription());
    }

    /* JADX INFO: renamed from: o.fyY$TaskDescription */
    public static final class TaskDescription implements InterfaceC54857xXx {
        public TaskDescription() {
        }

        @Override // o.InterfaceC54857xXx
        public void OLrzqt(WalletInfo walletInfo) {
            Intrinsics.checkNotNullParameter(walletInfo, "");
            ActivityC19292fyY.this.KWHzl().copydefault(walletInfo);
        }
    }

    @Override // o.AbstractActivityC33041mov, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        java.lang.String sourceAppPackageName;
        Intention intention;
        super.onBackPressed();
        WalletBindCeFiSelectViewModel walletBindCeFiSelectViewModelKWHzl = KWHzl();
        BindCeFiDeeplinkParams bindCeFiDeeplinkParams = this.AhwBna;
        if (bindCeFiDeeplinkParams == null || (sourceAppPackageName = bindCeFiDeeplinkParams.getSourceAppPackageName()) == null) {
            sourceAppPackageName = "";
        }
        BindCeFiDeeplinkParams bindCeFiDeeplinkParams2 = this.AhwBna;
        if (bindCeFiDeeplinkParams2 == null || (intention = bindCeFiDeeplinkParams2.getIntention()) == null) {
            intention = Intention.EXCHANGE_MANAGEMENT;
        }
        walletBindCeFiSelectViewModelKWHzl.copydefault(sourceAppPackageName, intention);
    }

    @Override // o.AbstractActivityC19309fyp, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.AbstractActivityC19309fyp, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // o.AbstractActivityC19309fyp, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // o.AbstractActivityC19309fyp, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
