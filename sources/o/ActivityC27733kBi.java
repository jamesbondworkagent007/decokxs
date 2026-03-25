package o;

import android.view.View;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.app.FrameMetricsAggregator;
import androidx.core.content.IntentCompat;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.amplifyframework.ui.liveness.ml.FaceDetector;
import com.amplifyframework.ui.liveness.state.FreshnessState;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import com.google.android.material.tabs.TabLayout;
import com.google.common.base.Ascii;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.okinc.business.defi.biz.core.error.WalletImportError;
import com.okinc.business.market.features.vibes.domain.VibesSortType;
import com.okinc.business.market.features.vibes.domain.VibesTimeRange;
import com.okinc.business.market.features.vibes.ui.DiscoverProfileParams;
import com.okinc.business.market.features.vibes.ui.VibesActivityParams;
import com.okinc.business.market.features.vibes.ui.VibesAnalysisActivity$onCreate$1;
import com.okinc.business.market.features.vibes.ui.VibesAnalysisActivity$setupListeners$1;
import com.okinc.business.market.features.vibes.ui.VibesAnalysisActivity$setupListeners$2;
import com.okinc.business.market.features.vibes.ui.VibesAnalysisActivity$setupListeners$3;
import com.okinc.business.market.features.vibes.ui.VibesAnalysisActivity$setupListeners$4;
import com.okinc.business.market.features.vibes.ui.VibesAnalysisActivity$setupListeners$5;
import com.okinc.business.market.features.vibes.ui.VibesKolUiModel;
import com.okinc.business.market.features.vibes.ui.VibesViewModel;
import com.okinc.business.market.widget.bottom_sheet.SingleSelectionParams;
import com.okinc.business.market.widget.bottom_sheet.SingleSelectionUiModel;
import com.okinc.core.util.SPUtils;
import com.okinc.dapp.bean.VibeFeedsParamsBean;
import com.okinc.localization.util.format.DisplaySign;
import java.util.Scanner;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C22366hdx;
import o.C23274hvD;
import o.C28019kLx;
import o.C52761wXj;
import o.InterfaceC27728kBd;
import o.InterfaceC27746kBv;
import o.kBA;
import o.kBE;
import o.kLC;
import okio.Utf8;
import org.jetbrains.annotations.NotNull;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: renamed from: o.kBi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class ActivityC27733kBi extends AbstractActivityC33013moT implements kLC {
    public final InterfaceC56387yDm KWHzl;
    public static final Application Companion = new Application(null);
    public static final int AEQbTJ = 8;
    public final InterfaceC56387yDm OLrzqt = C56392yDr.copydefault(new Function0() { // from class: o.kBu
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return ActivityC27733kBi.valueOf(this.OLrzqt);
        }
    });
    public final InterfaceC56387yDm EZpvd = C56392yDr.copydefault(new Function0() { // from class: o.kBx
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return ActivityC27733kBi.AYXKKw(this.KWHzl);
        }
    });

    /* JADX INFO: renamed from: o.kBi$StateListAnimator */
    /* JADX INFO: loaded from: classes15.dex */
    public final /* synthetic */ class StateListAnimator {
        public static final /* synthetic */ int[] EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[VibesViewModel.Companion.ChartDisplayUnit.values().length];
            try {
                iArr[VibesViewModel.Companion.ChartDisplayUnit.PRICE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[VibesViewModel.Companion.ChartDisplayUnit.MCAP.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            EZpvd = iArr;
        }
    }

    public ActivityC27733kBi() {
        final Function0 function0 = null;
        this.KWHzl = new ViewModelLazy(C56524yIo.AEQbTJ(VibesViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.market.features.vibes.ui.VibesAnalysisActivity$special$$inlined$viewModels$default$2
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
        }, new Function0() { // from class: o.kBy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return ActivityC27733kBi.isConnected(this.EZpvd);
            }
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.market.features.vibes.ui.VibesAnalysisActivity$special$$inlined$viewModels$default$3
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

    /* JADX INFO: renamed from: o.kBi$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.kBi.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    public final C22365hdw EZpvd() {
        return (C22365hdw) this.OLrzqt.getValue();
    }

    public static final C22365hdw valueOf(ActivityC27733kBi activityC27733kBi) {
        C22365hdw c22365hdwKWHzl = C22365hdw.KWHzl(activityC27733kBi.getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(c22365hdwKWHzl, "");
        return c22365hdwKWHzl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final VibesActivityParams AYXKKw() {
        VibesActivityParams vibesActivityParams;
        android.content.Intent intent = getIntent();
        return (intent == null || (vibesActivityParams = (VibesActivityParams) ((android.os.Parcelable) IntentCompat.getParcelableExtra(intent, "analysis_params", VibesActivityParams.class))) == null) ? new VibesActivityParams(null, 0L, 3, null) : vibesActivityParams;
    }

    public final VibesViewModel AEQbTJ() {
        return (VibesViewModel) this.KWHzl.getValue();
    }

    public static final ViewModelProvider.Factory isConnected(ActivityC27733kBi activityC27733kBi) {
        return new kAL(activityC27733kBi);
    }

    public final C27729kBe copydefault() {
        return (C27729kBe) this.EZpvd.getValue();
    }

    public static final C27729kBe AYXKKw(final ActivityC27733kBi activityC27733kBi) {
        return new C27729kBe(new Function1() { // from class: o.kBn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC27733kBi.AEQbTJ(this.AEQbTJ, (VibesKolUiModel) obj);
            }
        }, new Function1() { // from class: o.kBt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC27733kBi.OLrzqt(this.AEQbTJ, (VibesKolUiModel) obj);
            }
        });
    }

    public static final Unit AEQbTJ(ActivityC27733kBi activityC27733kBi, VibesKolUiModel vibesKolUiModel) {
        Intrinsics.checkNotNullParameter(vibesKolUiModel, "");
        trackVibesEvent$default(activityC27733kBi, "kol_table_profile", null, null, null, null, 30, null);
        gotoProfileActivity$default(activityC27733kBi, vibesKolUiModel.EZpvd(), vibesKolUiModel.gEmmrt(), vibesKolUiModel.AhwBna(), null, 8, null);
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(ActivityC27733kBi activityC27733kBi, VibesKolUiModel vibesKolUiModel) {
        kAV kavOLrzqt;
        kAV kavOLrzqt2;
        Intrinsics.checkNotNullParameter(vibesKolUiModel, "");
        java.lang.String strKWHzl = null;
        trackVibesEvent$default(activityC27733kBi, "kol_table_x", null, null, null, null, 30, null);
        long jValueOf = C33129mqd.valueOf(vibesKolUiModel.KWHzl());
        InterfaceC27746kBv value = activityC27733kBi.AEQbTJ().copydefault().getValue();
        InterfaceC27746kBv.ActionBar actionBar = value instanceof InterfaceC27746kBv.ActionBar ? (InterfaceC27746kBv.ActionBar) value : null;
        java.lang.String strValueOf = (actionBar == null || (kavOLrzqt2 = actionBar.OLrzqt()) == null) ? null : kavOLrzqt2.valueOf();
        java.lang.String str = strValueOf != null ? strValueOf : "";
        java.lang.String strCopydefault = activityC27733kBi.AYXKKw().copydefault();
        java.lang.String strCopydefault2 = vibesKolUiModel.copydefault();
        InterfaceC27746kBv value2 = activityC27733kBi.AEQbTJ().copydefault().getValue();
        InterfaceC27746kBv.ActionBar actionBar2 = value2 instanceof InterfaceC27746kBv.ActionBar ? (InterfaceC27746kBv.ActionBar) value2 : null;
        if (actionBar2 != null && (kavOLrzqt = actionBar2.OLrzqt()) != null) {
            strKWHzl = kavOLrzqt.KWHzl();
        }
        activityC27733kBi.EZpvd(jValueOf, str, strCopydefault, strCopydefault2, C33129mqd.AhwBna(strKWHzl), activityC27733kBi.AEQbTJ().OLrzqt().getValue().copydefault().getDiscoverDuration(), activityC27733kBi.AEQbTJ().OLrzqt().getValue().copydefault().getDiscoverUnit().getValue());
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.kBi$TaskDescription */
    public static final class TaskDescription<T> implements java.util.Comparator {
        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return yET.KWHzl(java.lang.Integer.valueOf(((kBC) t).djBIcL() * (-1)), java.lang.Integer.valueOf(((kBC) t2).djBIcL() * (-1)));
        }
    }

    @Override // o.kLC
    public void AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        VibesViewModel vibesViewModelAEQbTJ = AEQbTJ();
        long jKWHzl = AYXKKw().KWHzl();
        java.lang.String strCopydefault = AYXKKw().copydefault();
        VibesSortType.Application application = VibesSortType.Companion;
        vibesViewModelAEQbTJ.EZpvd(jKWHzl, strCopydefault, application.copydefault(str), str2);
        if (Intrinsics.EZpvd((java.lang.Object) str2, (java.lang.Object) "source.treemap")) {
            EZpvd().fetchVPNInfo.setSelected(false);
            trackVibesEvent$default(this, "kol_heatmap_sort", null, null, application.copydefault(str), null, 22, null);
        } else if (Intrinsics.EZpvd((java.lang.Object) str2, (java.lang.Object) "source.list")) {
            EZpvd().isConnected.setSelected(false);
            trackVibesEvent$default(this, "kol_table_sort", null, null, null, application.copydefault(str), 14, null);
        }
    }

    @Override // o.kLC
    public void EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        kLC.Application.KWHzl(this, str);
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "source.treemap")) {
            EZpvd().fetchVPNInfo.setSelected(false);
        } else if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "source.list")) {
            EZpvd().isConnected.setSelected(false);
        }
    }

    @Override // o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setContentView(EZpvd().getRoot());
        EZpvd().getRoot().setContentDescription("web3_dex_market_vibes_analysis_container");
        VibesViewModel.loadData$default(AEQbTJ(), java.lang.String.valueOf(AYXKKw().KWHzl()), AYXKKw().copydefault(), false, 4, null);
        valueOf();
        djBIcL();
        gEmmrt();
        copydefault(true);
        C25389ivm.safeLaunch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new VibesAnalysisActivity$onCreate$1(this, null), 3, null);
    }

    private final void gEmmrt() {
        final C22365hdw c22365hdwEZpvd = EZpvd();
        c22365hdwEZpvd.fIwbmz.EZpvd().copydefault().setAnimation(C52761wXj.PendingIntent.fetchVPNInfo);
        c22365hdwEZpvd.iwGUEr.setNoMoreDataEffective(true);
        c22365hdwEZpvd.iwGUEr.AhwBna(false);
        c22365hdwEZpvd.iwGUEr.OLrzqt(new InterfaceC57903yrG() { // from class: o.kBp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC57903yrG
            public final void copydefault(InterfaceC57934yrl interfaceC57934yrl) {
                ActivityC27733kBi.copydefault(this.KWHzl, c22365hdwEZpvd, interfaceC57934yrl);
            }
        });
    }

    /* JADX INFO: renamed from: o.kBi$Activity */
    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ ActivityC27733kBi AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ C22365hdw OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, C22365hdw c22365hdw, ActivityC27733kBi activityC27733kBi) {
            this.KWHzl = view;
            this.EZpvd = j;
            this.OLrzqt = c22365hdw;
            this.AEQbTJ = activityC27733kBi;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.EZpvd || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                this.OLrzqt.values.setSelected(true);
                this.AEQbTJ.KWHzl();
            }
        }
    }

    /* JADX INFO: renamed from: o.kBi$Dialog */
    public static final class Dialog implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ ActivityC27733kBi copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Dialog(android.view.View view, long j, ActivityC27733kBi activityC27733kBi) {
            this.AEQbTJ = view;
            this.OLrzqt = j;
            this.copydefault = activityC27733kBi;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.OLrzqt || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(this.copydefault);
                ViewOnClickListenerC54939xaY.addPrimaryButton$default(viewOnClickListenerC54939xaY, C33070mpX.AYXKKw(C23274hvD.Fragment.OcIXYQ), (View.OnClickListener) null, 2, (java.lang.Object) null);
                viewOnClickListenerC54939xaY.setTitle(C22366hdx.StateListAnimator.finit);
                viewOnClickListenerC54939xaY.copydefault(C22366hdx.StateListAnimator.dxcTrN);
                viewOnClickListenerC54939xaY.show();
            }
        }
    }

    /* JADX INFO: renamed from: o.kBi$Fragment */
    public static final class Fragment implements View.OnClickListener {
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ ActivityC27733kBi copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Fragment(android.view.View view, long j, ActivityC27733kBi activityC27733kBi) {
            this.EZpvd = view;
            this.OLrzqt = j;
            this.copydefault = activityC27733kBi;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.OLrzqt || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(this.copydefault);
                ViewOnClickListenerC54939xaY.addPrimaryButton$default(viewOnClickListenerC54939xaY, C33070mpX.AYXKKw(C23274hvD.Fragment.OcIXYQ), (View.OnClickListener) null, 2, (java.lang.Object) null);
                viewOnClickListenerC54939xaY.setTitle(C22366hdx.StateListAnimator.dNCPSb);
                viewOnClickListenerC54939xaY.copydefault(C22366hdx.StateListAnimator.fZBcTu);
                viewOnClickListenerC54939xaY.show();
            }
        }
    }

    /* JADX INFO: renamed from: o.kBi$FragmentManager */
    public static final class FragmentManager implements View.OnClickListener {
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ ActivityC27733kBi OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public FragmentManager(android.view.View view, long j, ActivityC27733kBi activityC27733kBi) {
            this.EZpvd = view;
            this.KWHzl = j;
            this.OLrzqt = activityC27733kBi;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.KWHzl || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(this.OLrzqt);
                java.lang.String string = this.OLrzqt.getString(C23274hvD.Fragment.OcIXYQ);
                Intrinsics.checkNotNullExpressionValue(string, "");
                ViewOnClickListenerC54939xaY.addPrimaryButton$default(viewOnClickListenerC54939xaY, string, (View.OnClickListener) null, 2, (java.lang.Object) null);
                VibesSortType vibesSortTypeEZpvd = this.OLrzqt.AEQbTJ().OLrzqt().getValue().EZpvd();
                viewOnClickListenerC54939xaY.setTitle(this.OLrzqt.getString(vibesSortTypeEZpvd.getNameResId()));
                viewOnClickListenerC54939xaY.copydefault(vibesSortTypeEZpvd.getTooltipResId());
                viewOnClickListenerC54939xaY.show();
            }
        }
    }

    /* JADX INFO: renamed from: o.kBi$LoaderManager */
    public static final class LoaderManager implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ ActivityC27733kBi OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public LoaderManager(android.view.View view, long j, ActivityC27733kBi activityC27733kBi) {
            this.AEQbTJ = view;
            this.KWHzl = j;
            this.OLrzqt = activityC27733kBi;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.KWHzl || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(this.OLrzqt);
                ViewOnClickListenerC54939xaY.addPrimaryButton$default(viewOnClickListenerC54939xaY, C33070mpX.AYXKKw(C23274hvD.Fragment.OcIXYQ), (View.OnClickListener) null, 2, (java.lang.Object) null);
                viewOnClickListenerC54939xaY.setTitle(C22366hdx.StateListAnimator.djSkpj);
                viewOnClickListenerC54939xaY.copydefault(C22366hdx.StateListAnimator.fFgQHt);
                viewOnClickListenerC54939xaY.show();
            }
        }
    }

    /* JADX INFO: renamed from: o.kBi$PendingIntent */
    public static final class PendingIntent implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ ActivityC27733kBi copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public PendingIntent(android.view.View view, long j, ActivityC27733kBi activityC27733kBi) {
            this.AEQbTJ = view;
            this.OLrzqt = j;
            this.copydefault = activityC27733kBi;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            kAV kavOLrzqt;
            kAT katAEQbTJ;
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.OLrzqt || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(this.copydefault);
                java.lang.String strAhwBna = null;
                ViewOnClickListenerC54939xaY.addPrimaryButton$default(viewOnClickListenerC54939xaY, C33070mpX.AYXKKw(C23274hvD.Fragment.OcIXYQ), (View.OnClickListener) null, 2, (java.lang.Object) null);
                viewOnClickListenerC54939xaY.setTitle(C23274hvD.Fragment.dispatchOnContextAvailable);
                kBG kbg = kBG.AEQbTJ;
                InterfaceC27746kBv value = this.copydefault.AEQbTJ().copydefault().getValue();
                InterfaceC27746kBv.ActionBar actionBar = value instanceof InterfaceC27746kBv.ActionBar ? (InterfaceC27746kBv.ActionBar) value : null;
                if (actionBar != null && (kavOLrzqt = actionBar.OLrzqt()) != null && (katAEQbTJ = kavOLrzqt.AEQbTJ()) != null) {
                    strAhwBna = katAEQbTJ.AhwBna();
                }
                if (strAhwBna == null) {
                    strAhwBna = "";
                }
                viewOnClickListenerC54939xaY.copydefault(kbg.copydefault(strAhwBna));
                viewOnClickListenerC54939xaY.show();
            }
        }
    }

    /* JADX INFO: renamed from: o.kBi$SharedElementCallback */
    public static final class SharedElementCallback implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ C22365hdw EZpvd;
        public final /* synthetic */ ActivityC27733kBi OLrzqt;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public SharedElementCallback(android.view.View view, long j, C22365hdw c22365hdw, ActivityC27733kBi activityC27733kBi) {
            this.copydefault = view;
            this.AEQbTJ = j;
            this.EZpvd = c22365hdw;
            this.OLrzqt = activityC27733kBi;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.AEQbTJ || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                this.EZpvd.fetchVPNInfo.setSelected(true);
                C28019kLx.Activity activity = C28019kLx.Companion;
                SingleSelectionUiModel[] singleSelectionUiModelArr = new SingleSelectionUiModel[3];
                VibesSortType vibesSortType = VibesSortType.ENGAGEMENTS;
                int value = vibesSortType.getValue();
                java.lang.String string = this.OLrzqt.getString(vibesSortType.getNameResId());
                Intrinsics.checkNotNullExpressionValue(string, "");
                singleSelectionUiModelArr[0] = new SingleSelectionUiModel(java.lang.String.valueOf(value), string, this.OLrzqt.AEQbTJ().OLrzqt().getValue().KWHzl() == vibesSortType);
                VibesSortType vibesSortType2 = VibesSortType.IMPRESSIONS;
                int value2 = vibesSortType2.getValue();
                java.lang.String string2 = this.OLrzqt.getString(vibesSortType2.getNameResId());
                Intrinsics.checkNotNullExpressionValue(string2, "");
                singleSelectionUiModelArr[1] = new SingleSelectionUiModel(java.lang.String.valueOf(value2), string2, this.OLrzqt.AEQbTJ().OLrzqt().getValue().KWHzl() == vibesSortType2);
                VibesSortType vibesSortType3 = VibesSortType.MENTIONS;
                int value3 = vibesSortType3.getValue();
                java.lang.String string3 = this.OLrzqt.getString(vibesSortType3.getNameResId());
                Intrinsics.checkNotNullExpressionValue(string3, "");
                singleSelectionUiModelArr[2] = new SingleSelectionUiModel(java.lang.String.valueOf(value3), string3, this.OLrzqt.AEQbTJ().OLrzqt().getValue().KWHzl() == vibesSortType3);
                C28019kLx c28019kLxKWHzl = activity.KWHzl(new SingleSelectionParams(yDY.gEmmrt(singleSelectionUiModelArr), "source.treemap", java.lang.String.valueOf(this.OLrzqt.AEQbTJ().OLrzqt().getValue().KWHzl().getValue())));
                androidx.fragment.app.FragmentManager supportFragmentManager = this.OLrzqt.getSupportFragmentManager();
                Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
                c28019kLxKWHzl.show(supportFragmentManager);
            }
        }
    }

    /* JADX INFO: renamed from: o.kBi$TaskStackBuilder */
    public static final class TaskStackBuilder implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ ActivityC27733kBi EZpvd;
        public final /* synthetic */ long KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskStackBuilder(android.view.View view, long j, ActivityC27733kBi activityC27733kBi) {
            this.AEQbTJ = view;
            this.KWHzl = j;
            this.EZpvd = activityC27733kBi;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.KWHzl || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                ActivityC27733kBi.showDisclaimerDialog$default(this.EZpvd, false, 1, null);
            }
        }
    }

    /* JADX INFO: renamed from: o.kBi$VoiceInteractor */
    public static final class VoiceInteractor implements View.OnClickListener {
        public final /* synthetic */ ActivityC27733kBi AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ C22365hdw OLrzqt;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public VoiceInteractor(android.view.View view, long j, C22365hdw c22365hdw, ActivityC27733kBi activityC27733kBi) {
            this.copydefault = view;
            this.EZpvd = j;
            this.OLrzqt = c22365hdw;
            this.AEQbTJ = activityC27733kBi;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.EZpvd || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                this.OLrzqt.isConnected.setSelected(true);
                C28019kLx.Activity activity = C28019kLx.Companion;
                SingleSelectionUiModel[] singleSelectionUiModelArr = new SingleSelectionUiModel[3];
                VibesSortType vibesSortType = VibesSortType.ENGAGEMENTS;
                int value = vibesSortType.getValue();
                java.lang.String string = this.AEQbTJ.getString(vibesSortType.getNameResId());
                Intrinsics.checkNotNullExpressionValue(string, "");
                singleSelectionUiModelArr[0] = new SingleSelectionUiModel(java.lang.String.valueOf(value), string, this.AEQbTJ.AEQbTJ().OLrzqt().getValue().EZpvd() == vibesSortType);
                VibesSortType vibesSortType2 = VibesSortType.IMPRESSIONS;
                int value2 = vibesSortType2.getValue();
                java.lang.String string2 = this.AEQbTJ.getString(vibesSortType2.getNameResId());
                Intrinsics.checkNotNullExpressionValue(string2, "");
                singleSelectionUiModelArr[1] = new SingleSelectionUiModel(java.lang.String.valueOf(value2), string2, this.AEQbTJ.AEQbTJ().OLrzqt().getValue().EZpvd() == vibesSortType2);
                VibesSortType vibesSortType3 = VibesSortType.MENTIONS;
                int value3 = vibesSortType3.getValue();
                java.lang.String string3 = this.AEQbTJ.getString(vibesSortType3.getNameResId());
                Intrinsics.checkNotNullExpressionValue(string3, "");
                singleSelectionUiModelArr[2] = new SingleSelectionUiModel(java.lang.String.valueOf(value3), string3, this.AEQbTJ.AEQbTJ().OLrzqt().getValue().EZpvd() == vibesSortType3);
                C28019kLx c28019kLxKWHzl = activity.KWHzl(new SingleSelectionParams(yDY.gEmmrt(singleSelectionUiModelArr), "source.list", java.lang.String.valueOf(this.AEQbTJ.AEQbTJ().OLrzqt().getValue().EZpvd().getValue())));
                androidx.fragment.app.FragmentManager supportFragmentManager = this.AEQbTJ.getSupportFragmentManager();
                Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
                c28019kLxKWHzl.show(supportFragmentManager);
            }
        }
    }

    public static final void copydefault(ActivityC27733kBi activityC27733kBi, C22365hdw c22365hdw, InterfaceC57934yrl interfaceC57934yrl) {
        Intrinsics.checkNotNullParameter(interfaceC57934yrl, "");
        VibesViewModel.loadData$default(activityC27733kBi.AEQbTJ(), java.lang.String.valueOf(activityC27733kBi.AYXKKw().KWHzl()), activityC27733kBi.AYXKKw().copydefault(), false, 4, null);
        c22365hdw.iwGUEr.AEQbTJ();
    }

    private final void djBIcL() {
        C22365hdw c22365hdwEZpvd = EZpvd();
        c22365hdwEZpvd.getNewProxyInstance.setAdapter(copydefault());
        c22365hdwEZpvd.getNewProxyInstance.setItemAnimator(null);
        OLrzqt();
        C55258xgZ c55258xgZ = c22365hdwEZpvd.QbewEr;
        c55258xgZ.setOnClickListener(new PendingIntent(c55258xgZ, 1000L, this));
        C55258xgZ c55258xgZ2 = c22365hdwEZpvd.QKVWgx;
        c55258xgZ2.setOnClickListener(new Dialog(c55258xgZ2, 1000L, this));
        C55258xgZ c55258xgZ3 = c22365hdwEZpvd.zLjUOn;
        c55258xgZ3.setOnClickListener(new LoaderManager(c55258xgZ3, 1000L, this));
        C55258xgZ c55258xgZ4 = c22365hdwEZpvd.zuBGHE;
        c55258xgZ4.setOnClickListener(new Fragment(c55258xgZ4, 1000L, this));
        C55258xgZ c55258xgZ5 = c22365hdwEZpvd.OcIXYQ;
        c55258xgZ5.setOnClickListener(new FragmentManager(c55258xgZ5, 1000L, this));
        C33537myN c33537myN = c22365hdwEZpvd.KWHzl;
        c33537myN.setBackVisible(0);
        c33537myN.setSubDoVisible(0);
        c33537myN.setSubDoImageVisible(0);
        c33537myN.setSubDoImageResource(C52761wXj.TaskDescription.GGlJim);
        c33537myN.getDoImage().setBackground(null);
        c33537myN.getDoImage().setImageTintList(C25382ivf.copydefault(C52761wXj.Activity.fdOvFl));
        android.widget.ImageView doImage = c33537myN.getDoImage();
        doImage.setOnClickListener(new TaskStackBuilder(doImage, 1000L, this));
        c33537myN.getTitle().setText(C33070mpX.AYXKKw(C22366hdx.StateListAnimator.ORxRYg));
        C55052xcf c55052xcf = c22365hdwEZpvd.fetchVPNInfo;
        c55052xcf.setOnClickListener(new SharedElementCallback(c55052xcf, 1000L, c22365hdwEZpvd, this));
        C55052xcf c55052xcf2 = c22365hdwEZpvd.isConnected;
        c55052xcf2.setOnClickListener(new VoiceInteractor(c55052xcf2, 1000L, c22365hdwEZpvd, this));
    }

    private final void valueOf() {
        C25389ivm.safeLaunch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new VibesAnalysisActivity$setupListeners$1(this, null), 3, null);
        C25389ivm.safeLaunch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new VibesAnalysisActivity$setupListeners$2(this, null), 3, null);
        C25389ivm.safeLaunch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new VibesAnalysisActivity$setupListeners$3(this, null), 3, null);
        C25389ivm.safeLaunch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new VibesAnalysisActivity$setupListeners$4(this, null), 3, null);
        C25389ivm.safeLaunch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new VibesAnalysisActivity$setupListeners$5(this, null), 3, null);
    }

    public final void KWHzl(kBE kbe) {
        C55113xdn c55113xdn = EZpvd().zsXlph;
        Intrinsics.checkNotNullExpressionValue(c55113xdn, "");
        boolean z = kbe instanceof kBE.ActionBar;
        int i = 0;
        c55113xdn.setVisibility(z ? 0 : 8);
        C55173xeu c55173xeu = EZpvd().AubY;
        Intrinsics.checkNotNullExpressionValue(c55173xeu, "");
        boolean z2 = kbe instanceof kBE.Application;
        c55173xeu.setVisibility((z2 || (kbe instanceof kBE.Activity)) ? 0 : 8);
        C27732kBh c27732kBh = EZpvd().QVAiDq;
        Intrinsics.checkNotNullExpressionValue(c27732kBh, "");
        boolean z3 = kbe instanceof kBE.TaskDescription;
        c27732kBh.setVisibility(z3 ? 0 : 8);
        if (z) {
            return;
        }
        if (z2) {
            C55173xeu c55173xeu2 = EZpvd().AubY;
            c55173xeu2.setTitle(C33070mpX.AYXKKw(C23274hvD.Fragment.ActivityResultKt));
            c55173xeu2.setSubTitle((java.lang.CharSequence) C33070mpX.AYXKKw(C23274hvD.Fragment.RbMRq));
            c55173xeu2.setRetry(C33070mpX.AYXKKw(C23274hvD.Fragment.EZpvd));
            c55173xeu2.setEmptyTypeImage(2);
            c55173xeu2.setRetryClickListener(new View.OnClickListener() { // from class: o.kBg
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    ActivityC27733kBi.valueOf(this.EZpvd, view);
                }
            });
            Intrinsics.copydefault(c55173xeu2);
            return;
        }
        if (kbe instanceof kBE.Activity) {
            EZpvd().AubY.setSubTitle((java.lang.CharSequence) C33070mpX.AYXKKw(C23274hvD.Fragment.isConnected));
            EZpvd().AubY.setEmptyTypeImage(6);
            EZpvd().AubY.setTitle("");
            EZpvd().AubY.setRetry("");
            return;
        }
        if (!z3) {
            throw new NoWhenBranchMatchedException();
        }
        java.util.List listEZpvd = CollectionsKt___CollectionsKt.EZpvd(((kBE.TaskDescription) kbe).copydefault(), new TaskDescription());
        kBC kbc = (kBC) CollectionsKt___CollectionsKt.firstOrNull(listEZpvd);
        int iDjBIcL = kbc != null ? kbc.djBIcL() : 0;
        kBC kbc2 = (kBC) CollectionsKt___CollectionsKt.wlaJM(listEZpvd);
        int iMax = java.lang.Math.max(iDjBIcL - ((kbc2 != null ? kbc2.djBIcL() : 0) * 2), 1);
        C27732kBh c27732kBh2 = EZpvd().QVAiDq;
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listEZpvd, 10));
        for (java.lang.Object obj : listEZpvd) {
            int i2 = i + 1;
            if (i < 0) {
                yDY.AYXKKw();
            }
            kBC kbc3 = (kBC) obj;
            arrayList.add(new C27726kBb(C33129mqd.AEQbTJ(java.lang.Integer.valueOf(kbc3.djBIcL() + iMax)), kbc3.EZpvd((247 & 1) != 0 ? kbc3.EZpvd : null, (247 & 2) != 0 ? kbc3.OLrzqt : null, (247 & 4) != 0 ? kbc3.AYXKKw : 0, (247 & 8) != 0 ? kbc3.valueOf : java.lang.String.valueOf(i2), (247 & 16) != 0 ? kbc3.KWHzl : null, (247 & 32) != 0 ? kbc3.AEQbTJ : null, (247 & 64) != 0 ? kbc3.copydefault : null, (247 & 128) != 0 ? kbc3.gEmmrt : null)));
            i = i2;
        }
        android.view.LayoutInflater layoutInflater = getLayoutInflater();
        Intrinsics.checkNotNullExpressionValue(layoutInflater, "");
        c27732kBh2.setItems(arrayList, new kBD(layoutInflater, new Function1() { // from class: o.kBl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj2) {
                return ActivityC27733kBi.EZpvd(this.EZpvd, (kBC) obj2);
            }
        }));
    }

    public static final void valueOf(ActivityC27733kBi activityC27733kBi, android.view.View view) {
        VibesViewModel vibesViewModelAEQbTJ = activityC27733kBi.AEQbTJ();
        long jKWHzl = activityC27733kBi.AYXKKw().KWHzl();
        vibesViewModelAEQbTJ.copydefault(java.lang.String.valueOf(jKWHzl), activityC27733kBi.AYXKKw().copydefault(), activityC27733kBi.AEQbTJ().OLrzqt().getValue().KWHzl(), activityC27733kBi.AEQbTJ().OLrzqt().getValue().copydefault());
    }

    public static final Unit EZpvd(ActivityC27733kBi activityC27733kBi, kBC kbc) {
        Intrinsics.checkNotNullParameter(kbc, "");
        trackVibesEvent$default(activityC27733kBi, "kol_heatmap", null, null, null, null, 30, null);
        gotoProfileActivity$default(activityC27733kBi, kbc.OLrzqt(), kbc.EZpvd(), kbc.copydefault(), null, 8, null);
        return Unit.INSTANCE;
    }

    public final void AEQbTJ(InterfaceC27728kBd interfaceC27728kBd) {
        C22365hdw c22365hdwEZpvd = EZpvd();
        C55113xdn c55113xdn = c22365hdwEZpvd.AkhnZx;
        Intrinsics.checkNotNullExpressionValue(c55113xdn, "");
        boolean z = interfaceC27728kBd instanceof InterfaceC27728kBd.Activity;
        c55113xdn.setVisibility(z ? 0 : 8);
        C33546myW c33546myW = c22365hdwEZpvd.iwGUEr;
        Intrinsics.checkNotNullExpressionValue(c33546myW, "");
        c33546myW.setVisibility(z ^ true ? 0 : 8);
        if (interfaceC27728kBd instanceof InterfaceC27728kBd.Application) {
            return;
        }
        C33546myW c33546myW2 = c22365hdwEZpvd.iwGUEr;
        Intrinsics.checkNotNullExpressionValue(c33546myW2, "");
        C57589ylK.KWHzl(c33546myW2, true);
    }

    public final void KWHzl(kBA kba) {
        C55113xdn c55113xdn = EZpvd().fARcdN;
        Intrinsics.checkNotNullExpressionValue(c55113xdn, "");
        boolean z = kba instanceof kBA.TaskDescription;
        c55113xdn.setVisibility((z || (kba instanceof kBA.Application)) ? 0 : 8);
        if (z) {
            copydefault().submitList(yDY.AhwBna());
        }
        C55173xeu c55173xeu = EZpvd().ejfBZ;
        Intrinsics.checkNotNullExpressionValue(c55173xeu, "");
        boolean z2 = kba instanceof kBA.Activity;
        c55173xeu.setVisibility((z2 || (kba instanceof kBA.ActionBar)) ? 0 : 8);
        if (z) {
            return;
        }
        if (z2) {
            EZpvd().ejfBZ.setTitle(C33070mpX.AYXKKw(C23274hvD.Fragment.ActivityResultKt));
            EZpvd().ejfBZ.setSubTitle((java.lang.CharSequence) C33070mpX.AYXKKw(C23274hvD.Fragment.RbMRq));
            EZpvd().ejfBZ.setEmptyTypeImage(2);
            EZpvd().ejfBZ.setRetry(C33070mpX.AYXKKw(C23274hvD.Fragment.EZpvd));
            EZpvd().ejfBZ.setRetryClickListener(new View.OnClickListener() { // from class: o.kBo
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    ActivityC27733kBi.copydefault(this.AEQbTJ, view);
                }
            });
            return;
        }
        if (kba instanceof kBA.ActionBar) {
            EZpvd().ejfBZ.setSubTitle((java.lang.CharSequence) C33070mpX.AYXKKw(C23274hvD.Fragment.isConnected));
            EZpvd().ejfBZ.setEmptyTypeImage(6);
            EZpvd().ejfBZ.setTitle("");
            EZpvd().ejfBZ.setRetry("");
            return;
        }
        if (!(kba instanceof kBA.Application)) {
            throw new NoWhenBranchMatchedException();
        }
        copydefault().submitList(((kBA.Application) kba).KWHzl(), new java.lang.Runnable() { // from class: o.kBm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                ActivityC27733kBi.AhwBna(this.EZpvd);
            }
        });
    }

    public static final void copydefault(ActivityC27733kBi activityC27733kBi, android.view.View view) {
        VibesViewModel vibesViewModelAEQbTJ = activityC27733kBi.AEQbTJ();
        long jKWHzl = activityC27733kBi.AYXKKw().KWHzl();
        vibesViewModelAEQbTJ.AEQbTJ(java.lang.String.valueOf(jKWHzl), activityC27733kBi.AYXKKw().copydefault(), activityC27733kBi.AEQbTJ().OLrzqt().getValue().EZpvd(), activityC27733kBi.AEQbTJ().OLrzqt().getValue().copydefault());
    }

    public static final void AhwBna(ActivityC27733kBi activityC27733kBi) {
        C55113xdn c55113xdn = activityC27733kBi.EZpvd().fARcdN;
        Intrinsics.checkNotNullExpressionValue(c55113xdn, "");
        c55113xdn.setVisibility(8);
    }

    public final void copydefault(C27750kBz c27750kBz) {
        C22365hdw c22365hdwEZpvd = EZpvd();
        C55052xcf c55052xcf = c22365hdwEZpvd.fetchVPNInfo;
        java.lang.String string = getString(c27750kBz.KWHzl().getNameResId());
        Intrinsics.checkNotNullExpressionValue(string, "");
        c55052xcf.setTitle(string);
        C55052xcf c55052xcf2 = c22365hdwEZpvd.isConnected;
        java.lang.String string2 = getString(c27750kBz.EZpvd().getNameResId());
        Intrinsics.checkNotNullExpressionValue(string2, "");
        c55052xcf2.setTitle(string2);
        c22365hdwEZpvd.OcIXYQ.setTextValue(getString(c27750kBz.EZpvd().getNameResId()));
    }

    public final void AEQbTJ(InterfaceC27746kBv interfaceC27746kBv) {
        C22365hdw c22365hdwEZpvd = EZpvd();
        C55113xdn c55113xdn = c22365hdwEZpvd.EZpvd;
        Intrinsics.checkNotNullExpressionValue(c55113xdn, "");
        boolean z = interfaceC27746kBv instanceof InterfaceC27746kBv.Application;
        c55113xdn.setVisibility(z ? 0 : 8);
        C55173xeu c55173xeu = c22365hdwEZpvd.copydefault;
        Intrinsics.checkNotNullExpressionValue(c55173xeu, "");
        boolean z2 = interfaceC27746kBv instanceof InterfaceC27746kBv.TaskDescription;
        c55173xeu.setVisibility(z2 ? 0 : 8);
        LinearLayoutCompat linearLayoutCompat = c22365hdwEZpvd.AuCTel;
        Intrinsics.checkNotNullExpressionValue(linearLayoutCompat, "");
        boolean z3 = interfaceC27746kBv instanceof InterfaceC27746kBv.ActionBar;
        linearLayoutCompat.setVisibility(z3 ? 0 : 8);
        LinearLayoutCompat linearLayoutCompat2 = c22365hdwEZpvd.fJNWhG;
        Intrinsics.checkNotNullExpressionValue(linearLayoutCompat2, "");
        linearLayoutCompat2.setVisibility(z3 ? 0 : 8);
        if (z) {
            return;
        }
        if (z2) {
            c22365hdwEZpvd.copydefault.setRetry(C33070mpX.AYXKKw(C23274hvD.Fragment.EZpvd));
            c22365hdwEZpvd.copydefault.setRetryClickListener(new View.OnClickListener() { // from class: o.kBq
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    ActivityC27733kBi.AEQbTJ(this.KWHzl, view);
                }
            });
            return;
        }
        if (!z3) {
            throw new NoWhenBranchMatchedException();
        }
        rVN.reportFullyDrawn$default((android.app.Activity) this, true, (java.lang.String) null, 2, (java.lang.Object) null);
        InterfaceC27746kBv.ActionBar actionBar = (InterfaceC27746kBv.ActionBar) interfaceC27746kBv;
        copydefault().OLrzqt(actionBar.OLrzqt().AYXKKw());
        kAT katAEQbTJ = actionBar.OLrzqt().AEQbTJ();
        c22365hdwEZpvd.ORxRYg.setText(C23319hvw.getFormattedNumberICU$default(katAEQbTJ.AhwBna(), null, C38307pTy.Companion.KWHzl(2, 2), null, null, false, false, 61, null));
        c22365hdwEZpvd.RJOkX.setText(katAEQbTJ.AYXKKw().length() == 0 ? "--" : kLY.formatPercentage$default(katAEQbTJ.AYXKKw(), DisplaySign.EXCEPT_ZERO, false, null, null, 14, null));
        c22365hdwEZpvd.RJOkX.setTextColor(AEQbTJ(katAEQbTJ.AYXKKw()));
        c22365hdwEZpvd.sSMYrx.setText(C23319hvw.getFormattedNumberICU$default(katAEQbTJ.OLrzqt(), null, null, null, null, false, false, 63, null));
        c22365hdwEZpvd.QOLQEE.setText(katAEQbTJ.gEmmrt().length() == 0 ? "--" : kLY.formatPercentage$default(katAEQbTJ.gEmmrt(), DisplaySign.EXCEPT_ZERO, false, null, null, 14, null));
        c22365hdwEZpvd.QOLQEE.setTextColor(AEQbTJ(katAEQbTJ.gEmmrt()));
        c22365hdwEZpvd.AuCTelauCTel.setText(C23319hvw.getFormattedNumberICU$default(katAEQbTJ.EZpvd(), null, null, null, null, false, false, 63, null));
        c22365hdwEZpvd.wlaJM.setText(katAEQbTJ.AEQbTJ().length() == 0 ? "--" : kLY.formatPercentage$default(katAEQbTJ.AEQbTJ(), DisplaySign.EXCEPT_ZERO, false, null, null, 14, null));
        c22365hdwEZpvd.wlaJM.setTextColor(AEQbTJ(katAEQbTJ.AEQbTJ()));
        c22365hdwEZpvd.gHZMYf.setText(C23319hvw.getFormattedNumberICU$default(katAEQbTJ.KWHzl(), null, null, null, null, false, false, 63, null));
        c22365hdwEZpvd.AwvSrB.setText(katAEQbTJ.copydefault().length() != 0 ? kLY.formatPercentage$default(katAEQbTJ.copydefault(), DisplaySign.EXCEPT_ZERO, false, null, null, 14, null) : "--");
        c22365hdwEZpvd.AwvSrB.setTextColor(AEQbTJ(katAEQbTJ.copydefault()));
    }

    public static final void AEQbTJ(ActivityC27733kBi activityC27733kBi, android.view.View view) {
        activityC27733kBi.AEQbTJ().EZpvd();
    }

    public static /* synthetic */ void showDisclaimerDialog$default(ActivityC27733kBi activityC27733kBi, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        activityC27733kBi.copydefault(z);
    }

    public final void copydefault(boolean z) {
        if (z) {
            if (C22416heu.ORxRYg()) {
                C25352ivB.showOKDialogCheckboxWithCallback$default(this, C33070mpX.AYXKKw(C23274hvD.Fragment.ReportDrawnKtReportDrawnWhenfullyDrawnReporter1), C33070mpX.AYXKKw(C23274hvD.Fragment.ReportDrawnKtReportDrawnWhen1invokeinlinedonDispose1), C33070mpX.AYXKKw(C22366hdx.StateListAnimator.QfsBiF), C22366hdx.StateListAnimator.QOLQEE, null, new Function1() { // from class: o.kBr
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return ActivityC27733kBi.AEQbTJ(this.copydefault, ((java.lang.Boolean) obj).booleanValue());
                    }
                }, 16, null);
            }
        } else {
            if (C22416heu.AuCTelauCTel()) {
                return;
            }
            C25352ivB.OLrzqt(this, C33070mpX.AYXKKw(C23274hvD.Fragment.ReportDrawnKtReportDrawnWhenfullyDrawnReporter1), C33070mpX.AYXKKw(C23274hvD.Fragment.ReportDrawnKtReportDrawnWhen1invokeinlinedonDispose1), C22366hdx.StateListAnimator.QOLQEE);
        }
    }

    public static final Unit AEQbTJ(ActivityC27733kBi activityC27733kBi, boolean z) {
        activityC27733kBi.AEQbTJ(!z);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void gotoProfileActivity$default(ActivityC27733kBi activityC27733kBi, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = "";
        }
        if ((i & 2) != 0) {
            str2 = "";
        }
        if ((i & 4) != 0) {
            str3 = "";
        }
        if ((i & 8) != 0) {
            str4 = "";
        }
        activityC27733kBi.AEQbTJ(str, str2, str3, str4);
    }

    public final void AEQbTJ(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        android.content.Intent intent = new android.content.Intent(this, (java.lang.Class<?>) kAW.class);
        intent.putExtra("discover_profile.params", new DiscoverProfileParams(str, str2, str3, str4));
        startActivity(intent);
    }

    public final void EZpvd(long j, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, long j2, int i2) {
        xWA xwa;
        java.util.List listKWHzl = C43251rlk.KWHzl(C56524yIo.AEQbTJ(xWA.class));
        if (listKWHzl == null || (xwa = (xWA) CollectionsKt___CollectionsKt.AuCTelauCTel(listKWHzl)) == null) {
            return;
        }
        xwa.copydefault(this, new VibeFeedsParamsBean(j, java.lang.String.valueOf(AYXKKw().KWHzl()), str, str2, i, j2, i2, str3));
    }

    public final void OLrzqt() {
        C22365hdw c22365hdwEZpvd = EZpvd();
        C55244xgL c55244xgL = c22365hdwEZpvd.uzCIH;
        TabLayout.Tab tag = c55244xgL.values().setText(C33070mpX.AYXKKw(C22366hdx.StateListAnimator.RJOkX)).setTag(VibesTimeRange.TIME_24H);
        Intrinsics.checkNotNullExpressionValue(tag, "");
        c55244xgL.AEQbTJ(tag);
        TabLayout.Tab tag2 = c55244xgL.values().setText(C33070mpX.AYXKKw(C22366hdx.StateListAnimator.UeEOUB)).setTag(VibesTimeRange.TIME_3D);
        Intrinsics.checkNotNullExpressionValue(tag2, "");
        c55244xgL.copydefault(tag2, true);
        TabLayout.Tab tag3 = c55244xgL.values().setText(C33070mpX.AYXKKw(C22366hdx.StateListAnimator.aKErDB)).setTag(VibesTimeRange.TIME_7D);
        Intrinsics.checkNotNullExpressionValue(tag3, "");
        c55244xgL.AEQbTJ(tag3);
        TabLayout.Tab tag4 = c55244xgL.values().setText(C33070mpX.AYXKKw(C22366hdx.StateListAnimator.QbewEr)).setTag(VibesTimeRange.TIME_30D);
        Intrinsics.checkNotNullExpressionValue(tag4, "");
        c55244xgL.AEQbTJ(tag4);
        c55244xgL.copydefault(new ActionBar());
        c22365hdwEZpvd.values.setTitle(C33070mpX.AYXKKw(C22366hdx.StateListAnimator.QUSxYX));
        C55052xcf c55052xcf = c22365hdwEZpvd.values;
        c55052xcf.setOnClickListener(new Activity(c55052xcf, 1000L, c22365hdwEZpvd, this));
        c22365hdwEZpvd.values.setOKDSSize(-4);
    }

    /* JADX INFO: renamed from: o.kBi$ActionBar */
    public static final class ActionBar implements TabLayout.OnTabSelectedListener {
        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabReselected(TabLayout.Tab tab) {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabUnselected(TabLayout.Tab tab) {
        }

        public ActionBar() {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabSelected(TabLayout.Tab tab) {
            ActivityC27733kBi activityC27733kBi = ActivityC27733kBi.this;
            java.lang.Object tag = tab != null ? tab.getTag() : null;
            VibesTimeRange vibesTimeRange = tag instanceof VibesTimeRange ? (VibesTimeRange) tag : null;
            if (vibesTimeRange == null) {
                vibesTimeRange = VibesTimeRange.TIME_3D;
            }
            ActivityC27733kBi.trackVibesEvent$default(activityC27733kBi, "time_dimension", null, vibesTimeRange.getTrackKey(), null, null, 26, null);
            VibesViewModel vibesViewModelAEQbTJ = ActivityC27733kBi.this.AEQbTJ();
            java.lang.Object tag2 = tab != null ? tab.getTag() : null;
            VibesTimeRange vibesTimeRange2 = tag2 instanceof VibesTimeRange ? (VibesTimeRange) tag2 : null;
            if (vibesTimeRange2 == null) {
                vibesTimeRange2 = VibesTimeRange.TIME_3D;
            }
            vibesViewModelAEQbTJ.copydefault(vibesTimeRange2);
        }
    }

    public final void KWHzl() {
        EZpvd();
        VibesViewModel.Companion.ChartDisplayUnit value = AEQbTJ().AYXKKw().getValue();
        kMS[] kmsArr = new kMS[2];
        java.lang.String strAYXKKw = C33070mpX.AYXKKw(C22366hdx.StateListAnimator.QUSxYX);
        VibesViewModel.Companion.ChartDisplayUnit chartDisplayUnit = VibesViewModel.Companion.ChartDisplayUnit.PRICE;
        kmsArr[0] = new kMS(strAYXKKw, null, null, null, value == chartDisplayUnit, chartDisplayUnit, 14, null);
        java.lang.String strAYXKKw2 = C33070mpX.AYXKKw(C22366hdx.StateListAnimator.QVAiDq);
        VibesViewModel.Companion.ChartDisplayUnit chartDisplayUnit2 = VibesViewModel.Companion.ChartDisplayUnit.MCAP;
        kmsArr[1] = new kMS(strAYXKKw2, null, null, null, value == chartDisplayUnit2, chartDisplayUnit2, 14, null);
        kMY.Companion.OLrzqt(yDY.gEmmrt(kmsArr), "", new Function1() { // from class: o.kBs
            private static char[] AEQbTJ;
            private static long KWHzl;
            private static final byte[] $$c = {76, Ascii.SYN, Ascii.SO, Ascii.RS};
            private static final int $$d = 38;
            private static int $10 = 0;
            private static int $11 = 1;
            private static final byte[] $$a = {70, 44, 80, Utf8.REPLACEMENT_BYTE, Ascii.CR, Ascii.ETB, -25, Ascii.FF, -36, 35, Ascii.EM};
            private static final int $$b = 202;
            private static int EZpvd = 0;
            private static int copydefault = 1;

            /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0026). Please report as a decompilation issue!!! */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            private static java.lang.String $$e(byte b, short s, byte b2) {
                int i;
                int i2 = 114 - b;
                byte[] bArr = $$c;
                int i3 = (s * 2) + 4;
                int i4 = b2 * 2;
                byte[] bArr2 = new byte[1 - i4];
                int i5 = 0 - i4;
                if (bArr == 0) {
                    int i6 = i3;
                    i = 0;
                    i3++;
                    i2 += i6;
                    bArr2[i] = (byte) i2;
                    if (i == i5) {
                        return new java.lang.String(bArr2, 0);
                    }
                    i++;
                    i6 = bArr[i3];
                    i3++;
                    i2 += i6;
                    bArr2[i] = (byte) i2;
                    if (i == i5) {
                    }
                } else {
                    i = 0;
                    bArr2[i] = (byte) i2;
                    if (i == i5) {
                    }
                }
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0029). Please report as a decompilation issue!!! */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            private static void a(int i, byte b, int i2, java.lang.Object[] objArr) {
                int i3;
                int i4 = i + 4;
                byte[] bArr = $$a;
                int i5 = b + 65;
                byte[] bArr2 = new byte[4 - i2];
                int i6 = 3 - i2;
                if (bArr == null) {
                    int i7 = i6;
                    int i8 = 0;
                    i5 = i7 + (-i5) + 16;
                    i3 = i8;
                    bArr2[i3] = (byte) i5;
                    i8 = i3 + 1;
                    if (i3 == i6) {
                        objArr[0] = new java.lang.String(bArr2, 0);
                        return;
                    }
                    i4++;
                    i7 = i5;
                    i5 = bArr[i4];
                    i5 = i7 + (-i5) + 16;
                    i3 = i8;
                    bArr2[i3] = (byte) i5;
                    i8 = i3 + 1;
                    if (i3 == i6) {
                    }
                } else {
                    i3 = 0;
                    bArr2[i3] = (byte) i5;
                    i8 = i3 + 1;
                    if (i3 == i6) {
                    }
                }
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                int i = 2 % 2;
                int i2 = EZpvd + 33;
                copydefault = i2 % 128;
                if (i2 % 2 == 0) {
                    ActivityC27733kBi.EZpvd(this.OLrzqt, (kMS) obj);
                    java.lang.Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
                Unit unitEZpvd = ActivityC27733kBi.EZpvd(this.OLrzqt, (kMS) obj);
                int i3 = copydefault + 83;
                EZpvd = i3 % 128;
                if (i3 % 2 != 0) {
                    int i4 = 35 / 0;
                }
                return unitEZpvd;
            }

            /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [82=4, 86=4] */
            /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
            private static void b(char c, int i, int i2, java.lang.Object[] objArr) throws java.lang.Throwable {
                int i3 = 2 % 2;
                Zn zn = new Zn();
                long[] jArr = new long[i];
                zn.EZpvd = 0;
                while (zn.EZpvd < i) {
                    int i4 = $10 + 61;
                    $11 = i4 % 128;
                    if (i4 % 2 == 0) {
                        int i5 = zn.EZpvd;
                        try {
                            java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(AEQbTJ[i2 / i5])};
                            java.lang.Object objEZpvd = YY.EZpvd(927695670);
                            if (objEZpvd == null) {
                                byte b = (byte) ($$d & 11);
                                byte b2 = (byte) (b - 2);
                                objEZpvd = YY.EZpvd(217, 4, (char) 0, 862670410, false, $$e(b, b2, b2), new java.lang.Class[]{java.lang.Integer.TYPE});
                            }
                            try {
                                java.lang.Object[] objArr3 = {java.lang.Long.valueOf(((java.lang.Long) ((java.lang.reflect.Method) objEZpvd).invoke(null, objArr2)).longValue()), java.lang.Long.valueOf(i5), java.lang.Long.valueOf(KWHzl), java.lang.Integer.valueOf(c)};
                                java.lang.Object objEZpvd2 = YY.EZpvd(-297691357);
                                if (objEZpvd2 == null) {
                                    byte b3 = (byte) 0;
                                    byte b4 = b3;
                                    objEZpvd2 = YY.EZpvd(TypedValues.CycleType.TYPE_WAVE_PERIOD, 5, (char) 0, -362718625, false, $$e(b3, b4, b4), new java.lang.Class[]{java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Integer.TYPE});
                                }
                                jArr[i5] = ((java.lang.Long) ((java.lang.reflect.Method) objEZpvd2).invoke(null, objArr3)).longValue();
                                try {
                                    java.lang.Object[] objArr4 = {zn, zn};
                                    java.lang.Object objEZpvd3 = YY.EZpvd(1191971121);
                                    if (objEZpvd3 == null) {
                                        byte b5 = (byte) 1;
                                        byte b6 = (byte) (b5 - 1);
                                        objEZpvd3 = YY.EZpvd(226, 4, (char) 0, 1127007309, false, $$e(b5, b6, b6), new java.lang.Class[]{java.lang.Object.class, java.lang.Object.class});
                                    }
                                    ((java.lang.reflect.Method) objEZpvd3).invoke(null, objArr4);
                                } catch (java.lang.Throwable th) {
                                    java.lang.Throwable cause = th.getCause();
                                    if (cause == null) {
                                        throw th;
                                    }
                                    throw cause;
                                }
                            } catch (java.lang.Throwable th2) {
                                java.lang.Throwable cause2 = th2.getCause();
                                if (cause2 == null) {
                                    throw th2;
                                }
                                throw cause2;
                            }
                        } catch (java.lang.Throwable th3) {
                            java.lang.Throwable cause3 = th3.getCause();
                            if (cause3 == null) {
                                throw th3;
                            }
                            throw cause3;
                        }
                    } else {
                        int i6 = zn.EZpvd;
                        try {
                            java.lang.Object[] objArr5 = {java.lang.Integer.valueOf(AEQbTJ[i2 + i6])};
                            java.lang.Object objEZpvd4 = YY.EZpvd(927695670);
                            if (objEZpvd4 == null) {
                                byte b7 = (byte) ($$d & 11);
                                byte b8 = (byte) (b7 - 2);
                                objEZpvd4 = YY.EZpvd(217, 4, (char) 0, 862670410, false, $$e(b7, b8, b8), new java.lang.Class[]{java.lang.Integer.TYPE});
                            }
                            java.lang.Object[] objArr6 = {java.lang.Long.valueOf(((java.lang.Long) ((java.lang.reflect.Method) objEZpvd4).invoke(null, objArr5)).longValue()), java.lang.Long.valueOf(i6), java.lang.Long.valueOf(KWHzl), java.lang.Integer.valueOf(c)};
                            java.lang.Object objEZpvd5 = YY.EZpvd(-297691357);
                            if (objEZpvd5 == null) {
                                byte b9 = (byte) 0;
                                byte b10 = b9;
                                objEZpvd5 = YY.EZpvd(TypedValues.CycleType.TYPE_WAVE_PERIOD, 5, (char) 0, -362718625, false, $$e(b9, b10, b10), new java.lang.Class[]{java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Integer.TYPE});
                            }
                            jArr[i6] = ((java.lang.Long) ((java.lang.reflect.Method) objEZpvd5).invoke(null, objArr6)).longValue();
                            java.lang.Object[] objArr7 = {zn, zn};
                            java.lang.Object objEZpvd6 = YY.EZpvd(1191971121);
                            if (objEZpvd6 == null) {
                                byte b11 = (byte) 1;
                                byte b12 = (byte) (b11 - 1);
                                objEZpvd6 = YY.EZpvd(226, 4, (char) 0, 1127007309, false, $$e(b11, b12, b12), new java.lang.Class[]{java.lang.Object.class, java.lang.Object.class});
                            }
                            ((java.lang.reflect.Method) objEZpvd6).invoke(null, objArr7);
                        } catch (java.lang.Throwable th4) {
                            java.lang.Throwable cause4 = th4.getCause();
                            if (cause4 == null) {
                                throw th4;
                            }
                            throw cause4;
                        }
                    }
                }
                char[] cArr = new char[i];
                zn.EZpvd = 0;
                int i7 = $10 + 123;
                $11 = i7 % 128;
                int i8 = i7 % 2;
                while (zn.EZpvd < i) {
                    cArr[zn.EZpvd] = (char) jArr[zn.EZpvd];
                    java.lang.Object[] objArr8 = {zn, zn};
                    java.lang.Object objEZpvd7 = YY.EZpvd(1191971121);
                    if (objEZpvd7 == null) {
                        byte b13 = (byte) 1;
                        byte b14 = (byte) (b13 - 1);
                        objEZpvd7 = YY.EZpvd(226, 4, (char) 0, 1127007309, false, $$e(b13, b14, b14), new java.lang.Class[]{java.lang.Object.class, java.lang.Object.class});
                    }
                    ((java.lang.reflect.Method) objEZpvd7).invoke(null, objArr8);
                }
                objArr[0] = new java.lang.String(cArr);
            }

            static {
                char[] cArr = new char[1959];
                java.nio.ByteBuffer.wrap("îá\u0099ó\u0000\u0019\u0088³3\u0085º\u0014\"·\u00adÍTbÜ\u0089GÝÎnv\u008aá\u0014hq\u0010\u009d\u009b:\u0002U\u008aé5&¼I$Ü¯\u001bVAÞ÷I\u001cñ¡\f©{»âQjûÑÍX\\ÀÿO\u0085¶*>Á¥\u0095,&\u0094Â\u0003\\\u008a(òØyfà\nh\u009b×y^\u0002Æ¹MC´\r<º\u0005prbë\u0088c\"Ø\u0014Q\u0085É&F\\¿ó7\u0018¬L%ÿ\u009d\u001b\n\u0085\u0083òû\u0011p¡éÕJò=÷¤\u0016,¥\u0097\u0096\u001e\r\u0086¤\tÖð`x\u0090ãÂj!Ò\u0096E7Ìo´\u008e?+¦].ì\u0091.\u0018v\u0080ò\u000b\u001aòVzñí\tU¥ÜÇ\f©{ºâ@jîÑÍX_À÷OÇ¶>>Õ¥\u0093,%\f©{ºâ@jîÑÍXHÀùO\u0084¶`>×¥\u008e,:\u0094ÚÜN«K2·º\t\u0001d\u0088®\u0010\u0013\u009f!fûî\u0006uVüÝD;Ó\u0081Zû\"7©\u00850éGe0w©\u0099!5\u009aO\u0013Ø\u008br\u0004Fýòu\u001eîYg÷ß\u0000H ÝWª\u00133¹»L\u0000.\u0089÷\u0011G\u009edg\u009fïat;ý\u0084EfÒÉ[\u009f#M¨Û1©¹\u0013\u0006á\u008fµ\u0017\u0006\u009cðeëýü\u008a¸\u0013\u0012\u009bç \u0085©\\1ì¾ÏG4ÏÊT\u0090Ý/eÍòb{4\u0003æ\u0088p\u0011\u0002\u0099¸&J¯\u001e7\u00ad¼[ECð\u0086\u0087\u0083\u001eb\u0096Ñ-¹¤q<Ò³éJ\rÂáY±ÐUhéÿEv\u0015\u000eð\u0085[\u001cn\u0094\u0098+]éê\u009e¸\u0007]\u008fí4\u0083½M\u0017Ð`\u0094\f©{¬âMjþÑ\u0096X^ÀýOÆ¶,>Î¥\u0092,z\u0094Ä\u0003f\u008a5òÄy@à\"hé×s^\u0017Æ¦MU´T<½«X\u0013â\u009a\u0091\u0001H\u0089üð\u0084\f©{¬âMjþÑ\u0096X^ÀýOÆ¶,>Î¥\u0092,z\u0094Ä\u0003f\u008a5òÄy@à\"hé×m^\u0000Æ¤MP\f©{¬âMjþÑ\u0096X^ÀýOÆ¶\">Î¥\u009e,z\u0094Æ\u0003j\u008a:òßysà\u0002h±×K^?Æ»MR´\u0016<®«\u0019\u0013ÿ\u009a\u008a\f©{»âQjûÑÍXUÀõO\u0084¶;>À¥\u0089,0\u0094Ù\u0003w\fô{°â\u001ajïÑ\u0097XRÀüO\u008d¶`>Ï¥\u0093,&\u0094Þû\u0096\u008cÄ\u0015+\u009d\u0080&ù¯k7\u0080¸òADí\u0098\u009a\u009e\u0003w\u008bÓ0°¹%!Ç®±W\u0013ßóD¾Í\u001duèâFk\f\u0013í\u0098T\fè{ºâYjøÑ\u0091X]ìW\u009b\u0013\u0002¹\u008a^13¸÷ W¯?V\u008eÞpEqÌ\u009bthãÎj\u008e\u0012t\u0099Ô\u0000¯\u0088\u00137Ë¾£&\r\u00adñ\fá{ºâZjôv¿\u0001ó\u0098\u000f\u0010·«Â\"\u0001º\u00ad5\u008eÌtD\u0097ßÆV2î\u0081y.ð?\u0088\u009c\u0003:\u009aD\u0012ø\u00ad3$\u0015¼å7\u0019ÎEF¹Ñ\u0018i¤àÇ{\u0016ó\u0085\u008aÆ\u0005x\u009d\u009a\u0014é¯o'\u0081¾%IvÁ\u009cX2ÓBkü\fö{ºâFjþÑ\u008bXHÀäOÇ¶=>Þ¥\u008f,{\u0094È\u0003g\u008avòÕysà\rh±×z^\\Æ¬MP´\f<ð«Q\u0013í\u009a\u008e\u0001_\u0089Ìð\u008f\u007f1çÓn Õ\"]ÈÄl3?»ß\"{\fö{ºâFjþÑ\u008bXHÀäOÇ¶=>Þ¥\u008f,{\u0094È\u0003g\u008avòÕysà\rh±×z^\\Æ¹MO´W<½«F\u0013å\u009e+égp\u009bø#CVÊ\u0095R9Ý\u001a$à¬\u00037R¾¦\u0006\u0015\u0091º\u0018«`\bë®rÐúlE§Ì\u0081Tdß\u0092&\u008a®o9\u008b\u00812ìï\u009b£\u0002_\u008aç1\u0092¸Q ý¯ÞV$ÞÇE\u0096ÌbtÑã~jo\u0012Ì\u0099j\u0000\u0014\u0088¨7c¾E& \u00adVTNÜªKMóö¼àË¬RPÚèa\u009dè^pòÿÑ\u0006+\u008eÈ\u0015\u0099\u009cm$Þ³q:`BÃÉeP\u001bØ§glîJv¯ýY\u0004A\u008c¥\u001bO£ù\\½+ð²\u0016:¸\u0081Ü\b\u0010¸8Ï>V×Þse\u0010ì\u0085tlû\u0017\u0002»\u008aC\u0011\u0001\u0098¡ H\fð{½â[jõÑ\u0085XNÀõO\u009a¶:>jI\u0011ÐñX_ã$jÿòO}+\u0084\u008a\fb\fó{±â_jãÑ\u008dXLÀþ¼&ËtR\u0085Ú!aLè\u0091p&ÿG\u000e;y\u007fàÕh2Ó_Z\u009bÂ;MS´â<\u001c§\u001d.þ\u0096\u0000\u0001º\u0088þð\u001d{¼(T_\u0019ÆÿNQõ~|©äD\fá{ºâZjèÑ\u0090XRÀóî³\u0099è\u0000\b\u0088º3Âº\u0000\"¡\u00adäTdÜÍG\u0098\fá{ºâZjèÑ\u0090XRÀóO¶¶6>\u009f¥Ê,\n\u0094\u009c\u00037f\u0083\u0011Ç\u0088m\u0000\u008a»ç2#ª\u0083%ëÜZT¤Ï¥FOþ²i\u0010àJ\u0098ª3'DiÝ\u008d\fã{²âAjáÑ\u0083XOÀÿO\u009b\fÇ{¯âDj\u00adÑ°XNÀþO\u009d¶'>Ê¥\u0099,u\u0094Ì\u0003l\u008a*ò\u0091yUà\u0007h¶×r^\u001fÆ®\fÇ{±âPjÿÑ\u008dXRÀôOÉ¶\u001d>ã¥·,u\u0094È\u0003v\u008a1òÝybàOh¢×r^\u0000ÆëMX´A<ètN\u00038\u009aÙ\u0012v©\u0004 Û¸}7@Î\u0094FjÝ>TüìA{ÿò¸\u008aT\u0001ë\u0098Æ\u0010+¯û&\u0089¾b5ÑÌÈDaÓák3âX\fô{°â\u001ajåÑ\u0083XIÀôO\u009e¶/>Õ¥\u0099\fá{°âXjéÑ\u0084XRÀãO\u0081\fð{½â[jõÑÚX\r\fô{¾âZjîÑ\u008aXN\fô{°â\u001ajýÑ\u0090XTÀôO\u009c¶->Ó¥Ò,7\u0094Ø\u0003b\u008a6òÕ\fô{°â\u001ajæÑ\u0087XIÀþO\u008c¶\">\u0089¥\u008d,0\u0094Ç\u0003v\f·Ì1»u\"ßª;\u0011B\u0098\u009d\u0000 \u008f^vîÖý\fô{°â\u001ajïÑ\u0097XRÀüO\u008d¶`>×¥\u008e,:\u0094Î\u0003v\u008a;òÅ\fà{ªâXjáÑ½XCÀ¨Oß´\u000fÃKZáÒ\u0014ilà©x\u0007÷v\u000e\u009b\u0086:\u001dn\u0094À,6»\u009d2ÑJ:Á\u009fXýÐQo\u0092\r\u0002zYã¹k\u000bÐsY±Á\u0010N%·Þ? ¤t-\u0099\u0095.\u0002\u0085\u008bÕó7x\u0087áåiDÓ\u008b¤Ð=0µ\u0082\u000eú\u00878\u001f\u0099\u0090Üi\\áõz ó\u0010K³Ü\rUY-\u0084¦\u0004?=·\u0098\bX\u0081\u007f\u0019Ä\u0092$kvãÆt4Ì\u0085EÐÞ(VÁ/´\u0019\u009bnÀ÷ \u007f\u0092ÄêM(Õ\u0089Z¼£S+²°é9H\u0081¼\u0016\u001c\u009f}ç¸l\bõ~}\u0091Â\u0000KmÓßX?¡q)Í¾.\u0010wg,þÌv~Í\u0006DÄÜeSPª®\"S¹\u00050»\u0088\u0004\u001f£\u0096¾î\beöü\u009bt=ËóBÜÚkQÆþ¼\u0089í\u0010\u0006\u0098·#Óª\u00032â½ÇDwÌ\u0091WþÞof\u0087ñ6xj\u0000\u0082\u008b.\u0012m\u009aá%x¬\u00194¹¿\u001aFAÎíY\u000fá£hÑó\u0004{\u0091\u0002Í\u008d$\u0015Í\fô{°â\u001ajïÑ\u008dXTÀäO\u0085¶!>Æ¥\u0098,0\u0094Ø\fô{°â\u001ajïÑ\u008dXTÀäO\u0080¶#>Æ¥\u009b,0\u0094\u0084\u0003a\u008a-òØyzà\u000bhê×{^\u001bÆ¥MG´\u001c<¬«G\u0013þ\u009a\u008c\u0001T\u0089ç\fÇ{±âPjÿÑ\u008dXRÀôOÄ¶6>\u009f¥Ê\fô{°â\u001ajïÑ\u0097XRÀüO\u008d¶`>Ã¥\u0095,&\u0094Ú\u0003o\u008a9òÈy8à\u0006h \fò{ºâGjùÑÏ\u001c\u0098kÆò*z\u008eÁ»H?Ð\u0091_ý¦\u0017.¡µî<O\u0084¨\u0013Y\u009a_â´i\u000eðhxÀO³8þ¡\u001d)¼\u0092\u0088\u001b\u0017\u0083£\f\u0083õg}\u0082æÑo\u007f×\u0085@\"Ée±\u0086éó\u009e¾\u0007]\u008fü4È½L%òªÃS,ÛÂ@\u0093É4qñædo=\u0017Ø\u009cw\u0005\u0019\u008d¡\u0002¢uïì\fd\u00adß\u0099V\u001dÎ£A\u0092¸w0\u0091«Í\"_\u009a\u009b\r3\u0084cü\u0097w*îNfè\fô{°â\u001ajæÑ\u0087XIÀþO\u008c¶\">\u0089¥\u009d,;\u0094Î\u0003q\u008a7òØyràAhµ×x^\u001fÆ¾MD\fô{°â\u001ajïÑ\u008dXTÀäOÇ¶?>Â¥\u0091, \u0094\u0084\u0003b\u008a.òÕyIà\u0001h¥×p^\u0017Ü¶«ò2Xº \u0001Ä\u0088\u0014\u0010ü\u009fÉfyî\u008cuÒüsDÆÓ'Zs\"\u009d©30H¸ô\u0007/\u008eB\u0016à\u009d\fdO\fô{°â\u001ajýÑ\u0090XTÀôO\u009c¶->Ó¥Ò,7\u0094ß\u0003j\u008a4òÕy8à\th\u00ad×s^\u0015Æ®MR´\t<¬«^\u0013â\u009a\u0091\u0003ñtµí\u001feûÞ\u009eWMÏá@\u0089¹&1\u008cª\u009b#%\u009bÆ\fj\u00859ý\u009avuï\u0003g¯Ø\u007fQ\u0012É¼BU»\u000e3²¤\\\u001cý\fô{°â\u001ajþÑ\u009bXHÀäO\u008c¶#>ø¥\u0099,-\u0094Þ\u0003-\u008a:òÄy\u007fà\u0003h ×3^\u0014Æ¢MN´\u001e<»«E\u0013ü\u009a\u0097\u0001S\u0089ýð\u009c\fô{°â\u001ajûÑ\u0087XUÀôO\u0086¶<>\u0089¥\u009e, \u0094Ã\u0003o\u008a<ò\u009fypà\u0006hª×z^\u0017Æ¹MP´\u000b<·«Y\u0013ø\fô{°â\u001ajûÑ\u0087XUÀôO\u0086¶<>ø¥\u0098,9\u0094Á\u0003n\u008avòÓycà\u0006h¨×y^\\Æ\u00adMI´\u0017<¹«R\u0013þ\u009a\u0095\u0001H\u0089úð\u0086\u007f5÷[ÿ³\u0088¡\u0011K\u0099á\"×«P3ï¼\u009eE!ÍâV\u0096ß&gÀð|\f©{»âQjûÑÍXHÀÿO\u008a¶%>Â¥\u0088,z\u0094È\u0003b\u008a+òÔytà\u000ehª×y^-Æ¬ME´\u0017<§«S§¼Ð®IDÁîzØó]kêä\u009f\u001d0\u0095×\u000e\u009d\u0087o?Ø¨s!#YÝÒgJ\u0085=\u0097¤},×\u0097á\u001ed\u0086Ó\t¦ð\txîã¤jVÒ÷EJÌ\u0019´è?^\u0006\u0080q\u0085èd`×ÛäRcÊÜE\u00ad¼\u00124Ñ¯¡&\u000e\u009eâ\tI\u0080\u0014\f©{¬âMjþÑ\u0096X^ÀýOÆ¶\">Î¥\u009e,z\u0094Æ\u0003j\u008a:òÒyIà\u0002h¥×q^\u001eÆ¤MC´&<º«R\u0013î\u009a\u0090\u0001]\u0089Ìð\u0099\u007f$çËn\u008aÕz]ÞÄmf\r\u0011\u001f\u0088õ\u0000_»i2ýªG%9ÜµTdÏ(F\u0082\f©{»âQjûÑÍXYÀãO\u009d¶\u0011>Ó¥\u0095,8\u0094Ï4\"C0ÚÚRpéF`Ãøtw\u0001\u008e®\u0006I\u009d\u0003\u0014ñ¬C;û²§Ê\\AòØ\u0088P+ïóf\u008bþ$\f©{¬âMjþÑ\u0096X^ÀýOÆ¶\">Î¥\u009e,z\u0094Æ\u0003j\u008a:òÓyeà\u001bh¢×r^\u001eÆ¯ME´\u000b<\u0081«]\u0013â\u009a\u008c\u0001\u0014\u0089àð\u0087\f©{»âQjûÑÍXYÀãO\u009d¶/>Ä¥\u009f,0\f©{»âQjûÑÍXYÀãO\u009d¶)>Þ¥\u008e,:\f©{»âQjûÑÍXYÀãO\u009d¶#>Â¥\u009b,;\f©{»âQjûÑÍXYÀãO\u009d¶!>Õ¥\u0095,0\f©{»âQjûÑÍXYÀãO\u009d¶8>Ê¥\u008f,2\f©{»âQjûÑÍXYÀãO\u009d¶>>À¥\u009d,<\u0094Ú\u0003`\f©{»âQjûÑÍXYÀãO\u009d¶\u0011>Î¥\u0091,0°IÇ[^µÖ\u0019mcäô|\u0014óf\nÙ\u0082)\u0019p\u0090Ú(+¿\u00876ËN~ÅØ\\÷ÔFkÒâðzXñ´\bò\u008b¿ü¤eLíïVÛßZGïÈ\u00911<¹Þ\"\u009d«0\u0013\u0093\u0084W\r=uÓþSg\u0011ï³PyÙ\u0001A¹Êp3\u0000»¤,E\u0094ÿ\u001d\u0081\u009föèðq\u0019ù½BÞËKS¦ÜÙ%a\u00ad\u00976Ñ¿~\u0007\u0086X\u001d/\u0012¶ù>\u0006\u0085s\f©{¯âFjâÑ\u0081X\u0014ÀãO\u008c¶\">Á¥Ó,8\u0094Ë\u0003s\u008a+m½\u001añ\u0083\t\u000b½°Ò9\b¡¯.\u009b×u_\u0094ÄÌMmõ\u0090b6ëw\u0093\u0085\u0018d\u0081@\t÷\fê{¶âVjÊÑ®X~ÀÃO¶¶,>Ô¥\u0088,{\u0094Ù\u0003l\f©{ºâ@jîÑÍXVÀõO\u008d¶'>Æ¥£,6\u0094Å\u0003g\u008a=òÒyeàAh¼×p^\u001e¸.ÏyV\u008bÞ\"e[ì\u0085t;û@\u0002ï\u008a\u001e\f©{ºâ@jîÑÍXVÀÿO\u009c¶ >Ó¥\u008f\f©{»âUjùÑ\u0083X\u0014ÀôO\u0086¶9>É¥\u0090,:\u0094Ë\u0003g\u008a+ò\u009ey8à\u000bh´×2^\u0013Æ»MP´\n<ð«O\u0013á\u009a\u0089\u0086ûñýh\u0014à°[ÓÒFJ¡ÅË<i´\u009c/À¦a\u001e\u0097×\u0099 è9\u0000±±\nÜ\u0083\n\u001b»\u0094Ù\f©{»âUjùÑ\u0083X\u0014ÀýO\u0080¶=>Ä¥Ó,%\u0094Ø\u0003l\u008a>òØyzà\nh·×2^\u0011Æ¾MR´V<î«\u0018\u0013ï\u009a\u008a\u0001W\u0089½ð\u0085\u007f(çÅn\u008dÕ;]ÛÄk3)»Ä\"'©\u0003\u0011¢\u0098q\u0007\u0000\u008f£öN}\u001d".getBytes("ISO-8859-1")).asCharBuffer().get(cArr, 0, 1959);
                AEQbTJ = cArr;
                KWHzl = 2160533104571022303L;
            }

            /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
            /* JADX WARN: Removed duplicated region for block: B:100:0x08b1  */
            /* JADX WARN: Removed duplicated region for block: B:102:0x098e  */
            /* JADX WARN: Removed duplicated region for block: B:141:0x0ca4  */
            /* JADX WARN: Removed duplicated region for block: B:142:0x0d55  */
            /* JADX WARN: Removed duplicated region for block: B:163:0x0de1  */
            /* JADX WARN: Removed duplicated region for block: B:164:0x0ed6  */
            /* JADX WARN: Removed duplicated region for block: B:210:0x1250  */
            /* JADX WARN: Removed duplicated region for block: B:212:0x1253  */
            /* JADX WARN: Removed duplicated region for block: B:213:0x1259  */
            /* JADX WARN: Removed duplicated region for block: B:223:0x1352  */
            /* JADX WARN: Removed duplicated region for block: B:224:0x1406  */
            /* JADX WARN: Removed duplicated region for block: B:295:0x1f94 A[Catch: all -> 0x018e, TryCatch #8 {all -> 0x018e, blocks: (B:10:0x0093, B:12:0x00a0, B:13:0x00ca, B:27:0x0273, B:29:0x0280, B:30:0x02ac, B:40:0x041d, B:42:0x042a, B:43:0x0457, B:70:0x06ab, B:72:0x06b1, B:73:0x06d7, B:110:0x0a0d, B:112:0x0a1a, B:113:0x0a45, B:128:0x0c30, B:130:0x0c3a, B:131:0x0c5f, B:165:0x0ee8, B:167:0x0ef2, B:168:0x0f1d, B:178:0x102b, B:180:0x1035, B:181:0x1060, B:225:0x1409, B:227:0x140f, B:228:0x1436, B:233:0x159b, B:235:0x15ac, B:236:0x15d0, B:244:0x1737, B:246:0x1741, B:247:0x176c, B:249:0x1775, B:251:0x178d, B:252:0x17bd, B:293:0x1f8a, B:295:0x1f94, B:296:0x1fb9, B:312:0x21dd, B:314:0x21ea, B:315:0x2215, B:389:0x2942, B:391:0x294f, B:392:0x2975, B:323:0x22e5, B:325:0x22f2, B:326:0x231e, B:331:0x23d5, B:333:0x23e2, B:334:0x240e, B:299:0x1fc5, B:301:0x1fdd, B:302:0x2007, B:261:0x1c94, B:263:0x1c9e, B:265:0x1cce, B:272:0x1cec, B:274:0x1cf9, B:275:0x1d29, B:214:0x1278, B:216:0x1285, B:217:0x12b6, B:116:0x0a59, B:118:0x0a66, B:119:0x0a91, B:48:0x051c, B:50:0x0526, B:51:0x0551, B:57:0x0577, B:59:0x0581, B:60:0x05ac), top: B:433:0x0093 }] */
            /* JADX WARN: Removed duplicated region for block: B:298:0x1fc2  */
            /* JADX WARN: Removed duplicated region for block: B:299:0x1fc5 A[Catch: all -> 0x018e, TryCatch #8 {all -> 0x018e, blocks: (B:10:0x0093, B:12:0x00a0, B:13:0x00ca, B:27:0x0273, B:29:0x0280, B:30:0x02ac, B:40:0x041d, B:42:0x042a, B:43:0x0457, B:70:0x06ab, B:72:0x06b1, B:73:0x06d7, B:110:0x0a0d, B:112:0x0a1a, B:113:0x0a45, B:128:0x0c30, B:130:0x0c3a, B:131:0x0c5f, B:165:0x0ee8, B:167:0x0ef2, B:168:0x0f1d, B:178:0x102b, B:180:0x1035, B:181:0x1060, B:225:0x1409, B:227:0x140f, B:228:0x1436, B:233:0x159b, B:235:0x15ac, B:236:0x15d0, B:244:0x1737, B:246:0x1741, B:247:0x176c, B:249:0x1775, B:251:0x178d, B:252:0x17bd, B:293:0x1f8a, B:295:0x1f94, B:296:0x1fb9, B:312:0x21dd, B:314:0x21ea, B:315:0x2215, B:389:0x2942, B:391:0x294f, B:392:0x2975, B:323:0x22e5, B:325:0x22f2, B:326:0x231e, B:331:0x23d5, B:333:0x23e2, B:334:0x240e, B:299:0x1fc5, B:301:0x1fdd, B:302:0x2007, B:261:0x1c94, B:263:0x1c9e, B:265:0x1cce, B:272:0x1cec, B:274:0x1cf9, B:275:0x1d29, B:214:0x1278, B:216:0x1285, B:217:0x12b6, B:116:0x0a59, B:118:0x0a66, B:119:0x0a91, B:48:0x051c, B:50:0x0526, B:51:0x0551, B:57:0x0577, B:59:0x0581, B:60:0x05ac), top: B:433:0x0093 }] */
            /* JADX WARN: Removed duplicated region for block: B:347:0x25e5  */
            /* JADX WARN: Removed duplicated region for block: B:351:0x26a6  */
            /* JADX WARN: Removed duplicated region for block: B:371:0x2760  */
            /* JADX WARN: Removed duplicated region for block: B:372:0x2810  */
            /* JADX WARN: Removed duplicated region for block: B:384:0x286a  */
            /* JADX WARN: Removed duplicated region for block: B:455:0x275a A[SYNTHETIC] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public static java.lang.Object[] KWHzl(android.content.Context context, int i, int i2, int i3) throws java.lang.Throwable {
                java.lang.String str;
                java.lang.String str2;
                int i4;
                int i5;
                int i6;
                int i7;
                int i8;
                java.lang.String str3;
                int i9;
                int i10;
                int i11;
                long j;
                java.lang.String str4;
                int i12;
                int i13;
                int i14;
                java.lang.String str5;
                java.lang.String str6;
                int i15;
                int i16;
                boolean z;
                java.lang.String str7;
                int i17;
                long j2;
                int i18;
                java.lang.String str8;
                int i19;
                java.lang.Object[] objArr;
                char c;
                char c2;
                int i20;
                java.lang.String[][] strArr;
                int i21;
                java.util.ArrayList arrayList;
                java.lang.String str9;
                java.util.ArrayList arrayList2;
                java.lang.Object objEZpvd;
                java.lang.Object objInvoke;
                int i22;
                int i23;
                int i24;
                int i25;
                char c3;
                int i26;
                java.lang.String str10;
                int i27;
                int i28;
                int i29;
                long j3;
                int i30;
                int i31;
                java.lang.Object[] objArr2;
                java.lang.String next;
                int i32;
                java.lang.Object[] objArr3;
                int i33;
                java.lang.Object[] objArr4;
                long jLongValue;
                java.lang.String next2;
                int i34;
                int i35 = i;
                int i36 = 2;
                int i37 = 2 % 2;
                int i38 = 1;
                java.lang.Object[] objArr5 = new java.lang.Object[1];
                char c4 = 0;
                b((char) 0, 8, 717, objArr5);
                java.lang.String str11 = (java.lang.String) objArr5[0];
                java.lang.Object[] objArr6 = new java.lang.Object[1];
                b((char) 6922, 2, FreshnessState.FIRST_SCENE_ALPHA, objArr6);
                java.lang.String str12 = (java.lang.String) objArr6[0];
                int i39 = 4;
                java.lang.String[] strArr2 = new java.lang.String[4];
                java.lang.Object[] objArr7 = new java.lang.Object[1];
                b((char) 57928, 27, 0, objArr7);
                strArr2[0] = (java.lang.String) objArr7[0];
                java.lang.Object[] objArr8 = new java.lang.Object[1];
                b((char) 0, 25, 27, objArr8);
                strArr2[1] = (java.lang.String) objArr8[0];
                java.lang.Object[] objArr9 = new java.lang.Object[1];
                b((char) 2521, 18, 52, objArr9);
                strArr2[2] = (java.lang.String) objArr9[0];
                int i40 = copydefault;
                int i41 = ((i40 | 19) << 1) - (i40 ^ 19);
                EZpvd = i41 % 128;
                if (i41 % 2 != 0) {
                    java.lang.Object[] objArr10 = new java.lang.Object[1];
                    b((char) 18011, 28, 70, objArr10);
                    strArr2[3] = (java.lang.String) objArr10[0];
                } else {
                    java.lang.Object[] objArr11 = new java.lang.Object[1];
                    b((char) 18011, 28, 70, objArr11);
                    strArr2[3] = (java.lang.String) objArr11[0];
                }
                int i42 = 0;
                while (true) {
                    if (i42 >= i39) {
                        str = str11;
                        str2 = str12;
                        i4 = i35;
                        break;
                    }
                    int i43 = copydefault + 35;
                    EZpvd = i43 % 128;
                    int i44 = i43 % i36;
                    try {
                        java.lang.Object[] objArr12 = {strArr2[i42]};
                        java.lang.Object objEZpvd2 = YY.EZpvd(-924280847);
                        if (objEZpvd2 == null) {
                            byte b = (byte) (-1);
                            byte b2 = (byte) (b & 49);
                            java.lang.Object[] objArr13 = new java.lang.Object[i38];
                            a(b, b2, (byte) (b2 & 7), objArr13);
                            java.lang.String str13 = (java.lang.String) objArr13[c4];
                            java.lang.Class[] clsArr = new java.lang.Class[i38];
                            clsArr[c4] = java.lang.String.class;
                            objEZpvd2 = YY.EZpvd(FrameMetricsAggregator.EVERY_DURATION, 5, (char) 43308, -859284851, false, str13, clsArr);
                        }
                        long jLongValue2 = ((java.lang.Long) ((java.lang.reflect.Method) objEZpvd2).invoke(null, objArr12)).longValue();
                        long j4 = 1347398358;
                        str = str11;
                        long j5 = 764;
                        str2 = str12;
                        long j6 = -1;
                        long jMyPid = ((long) android.os.Process.myPid()) ^ j6;
                        long j7 = (jMyPid | j4) ^ j6;
                        long j8 = ((j4 ^ j6) | jLongValue2) ^ j6;
                        long j9 = (((long) 765) * j4) + (((long) (-1527)) * jLongValue2) + ((jLongValue2 | j7) * j5) + (((long) (-1528)) * (j8 | ((jMyPid | jLongValue2) ^ j6))) + (j5 * (j8 | (j6 ^ (j4 | (jLongValue2 ^ j6))) | j7)) + ((long) (-1658566452));
                        int i45 = ((int) (j9 >> 32)) & ((((1346371650 | r2) * (-196)) - 1241764494) + (((~(1391625714 | i35)) | 45254064) * CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA256));
                        int i46 = (int) j9;
                        int startElapsedRealtime = (int) android.os.Process.getStartElapsedRealtime();
                        int i47 = ~startElapsedRealtime;
                        int i48 = (-1879226229) + (((~((-158271514) | i47)) | 21233673) * (-1188));
                        int i49 = (~(startElapsedRealtime | 158271513)) | 21233673;
                        int i50 = ~((-1278954897) | i47);
                        int i51 = i46 & (i48 + ((i49 | i50) * 594) + (((~(158271513 | i47)) | 1141917056 | i50) * 594));
                        if (((i45 & i51) | (i45 ^ i51)) != 0) {
                            i4 = ((i42 & 190) + (i42 | 190)) ^ i35;
                            break;
                        }
                        i42++;
                        str11 = str;
                        str12 = str2;
                        i36 = 2;
                        i38 = 1;
                        c4 = 0;
                        i39 = 4;
                    } catch (java.lang.Throwable th) {
                        java.lang.Throwable cause = th.getCause();
                        if (cause != null) {
                            throw cause;
                        }
                        throw th;
                    }
                }
                if (i4 != i35) {
                    java.lang.Object[] objArr14 = {new int[]{(i | i) & (~(i & i))}, null, new int[]{i35}, new int[]{i4}, null};
                    int i52 = ~i35;
                    int i53 = 960869381 + (((~((-468310380) | i52)) | (~((-806564161) | i35))) * 217) + (((~((-468310380) | i35)) | 268505408) * 217) + (((~((-806564161) | i52)) | 468310379) * 217);
                    int i54 = (i53 & 16) + (16 | i53);
                    int i55 = i54 * (-559);
                    int i56 = i3 * 561;
                    int i57 = (((i55 & i56) + (i55 | i56)) - (~(-(-((~((i52 ^ i54) | (i52 & i54))) * (-560)))))) - 1;
                    int i58 = (~i3) | i54;
                    int i59 = (~((i35 & i58) | (i58 ^ i35))) * (-560);
                    int i60 = ((i57 | i59) << 1) - (i59 ^ i57);
                    int i61 = ~i54;
                    int i62 = ~((i61 & i3) | (i61 ^ i3));
                    int i63 = ~((i52 & i3) | (i52 ^ i3));
                    int i64 = ((i62 & i63) | (i62 ^ i63)) * 560;
                    int i65 = ((i60 | i64) << 1) - (i64 ^ i60);
                    int i66 = i65 << 13;
                    int i67 = (i66 & (~i65)) | ((~i66) & i65);
                    int i68 = i67 ^ (i67 >>> 17);
                    int i69 = i68 << 5;
                    return objArr14;
                }
                java.lang.Object[] objArr15 = new java.lang.Object[1];
                b((char) 0, 12, 98, objArr15);
                java.lang.String str14 = (java.lang.String) objArr15[0];
                java.lang.Object[] objArr16 = new java.lang.Object[1];
                b((char) 0, 13, WalletImportError.ERROR_CODE_AA_CREATE_KEY, objArr16);
                java.lang.String str15 = (java.lang.String) objArr16[0];
                java.lang.Object[] objArr17 = new java.lang.Object[1];
                b((char) 53479, 18, 123, objArr17);
                java.lang.String[] strArr3 = {str14, str15, (java.lang.String) objArr17[0]};
                int i70 = 0;
                int i71 = 3;
                while (true) {
                    if (i70 >= i71) {
                        i5 = i35;
                        break;
                    }
                    java.lang.Object[] objArr18 = {strArr3[i70]};
                    java.lang.Object objEZpvd3 = YY.EZpvd(1704729038);
                    if (objEZpvd3 == null) {
                        byte b3 = (byte) 1;
                        byte b4 = (byte) (b3 + 2);
                        java.lang.Object[] objArr19 = new java.lang.Object[1];
                        a(b3, b4, (byte) (b4 - 2), objArr19);
                        objEZpvd3 = YY.EZpvd(FrameMetricsAggregator.EVERY_DURATION, 5, (char) 43308, 1639765170, false, (java.lang.String) objArr19[0], new java.lang.Class[]{java.lang.String.class});
                    }
                    long jLongValue3 = ((java.lang.Long) ((java.lang.reflect.Method) objEZpvd3).invoke(null, objArr18)).longValue();
                    long j10 = 175126813;
                    long j11 = -712;
                    long j12 = -1;
                    long j13 = jLongValue3 ^ j12;
                    long j14 = i35;
                    long j15 = j14 ^ j12;
                    long j16 = (j15 | j10) ^ j12;
                    long j17 = ((long) (-340723540)) + (((long) (-711)) * j10) + (((long) 713) * jLongValue3) + ((((j13 | j10) ^ j12) | j16) * j11) + (j11 * ((((j13 | j15) | j10) ^ j12) | (j12 ^ (j14 | (jLongValue3 | j10))))) + (((long) 712) * (j13 | j16));
                    int i72 = ((~(43476412 | i35)) * TypedValues.CycleType.TYPE_EASING) + 803107214;
                    int i73 = ~i35;
                    int i74 = ((int) (j17 >> 32)) & (i72 + (((~(43476412 | i73)) | 34760108) * TypedValues.CycleType.TYPE_EASING));
                    int i75 = ((int) j17) & ((-381976775) + (((~(1200035800 | i73)) | (~(237190609 | i35))) * 217) + (((~(1200035800 | i35)) | (-1336360922)) * 217) + (((~(237190609 | i73)) | (-1200035801)) * 217));
                    if (((i75 & i74) | (i74 ^ i75)) != 0) {
                        int i76 = (i70 ^ SubsamplingScaleImageView.ORIENTATION_270) + ((i70 & SubsamplingScaleImageView.ORIENTATION_270) << 1);
                        i5 = (i76 & i73) | ((~i76) & i35);
                        break;
                    }
                    i70++;
                    i71 = 3;
                }
                if (i5 != i35) {
                    java.lang.Object[] objArr20 = {new int[1], null, new int[]{i35}, new int[]{i5}, null};
                    int iMaxMemory = (int) java.lang.Runtime.getRuntime().maxMemory();
                    int i77 = ~iMaxMemory;
                    int i78 = 1765295579 + (((~(i77 | 786068061)) | (~((-488806479) | i77)) | 287344642) * 464) + (((-201461837) | iMaxMemory) * (-464)) + (((~(iMaxMemory | 786068061)) | 287344642) * 464);
                    int i79 = -(-(i78 * (-489)));
                    int i80 = (7856 ^ i79) + ((i79 & 7856) << 1);
                    int i81 = ~i78;
                    int i82 = (i81 & (-17)) | ((-17) ^ i81);
                    int i83 = ~i35;
                    int i84 = ((i82 & i83) | (i82 ^ i83)) * (-490);
                    int i85 = ((i80 | i84) << 1) - (i84 ^ i80);
                    int i86 = ~i78;
                    int i87 = ~(i86 | 16);
                    int i88 = ~((i35 & i86) | (i86 ^ i35));
                    int i89 = -(-((i85 - (~(-(-(((i88 & i87) | (i87 ^ i88)) * 490))))) - 8331));
                    int i90 = ((i3 | i89) << 1) - (i89 ^ i3);
                    int i91 = i90 << 13;
                    int i92 = (i91 | i90) & (~(i90 & i91));
                    int i93 = i92 >>> 17;
                    int i94 = ((~i92) & i93) | ((~i93) & i92);
                    int i95 = i94 << 5;
                    ((int[]) objArr20[0])[0] = (i94 | i95) & (~(i94 & i95));
                    return objArr20;
                }
                java.lang.Object[] objArr21 = new java.lang.Object[1];
                b((char) 19404, 14, CipherSuite.TLS_PSK_WITH_AES_256_CBC_SHA, objArr21);
                java.lang.Object[] objArr22 = {(java.lang.String) objArr21[0]};
                java.lang.Object objEZpvd4 = YY.EZpvd(-924280847);
                if (objEZpvd4 == null) {
                    byte b5 = (byte) (-1);
                    byte b6 = (byte) (b5 & 49);
                    java.lang.Object[] objArr23 = new java.lang.Object[1];
                    a(b5, b6, (byte) (b6 & 7), objArr23);
                    objEZpvd4 = YY.EZpvd(FrameMetricsAggregator.EVERY_DURATION, 5, (char) 43308, -859284851, false, (java.lang.String) objArr23[0], new java.lang.Class[]{java.lang.String.class});
                }
                long jLongValue4 = ((java.lang.Long) ((java.lang.reflect.Method) objEZpvd4).invoke(null, objArr22)).longValue();
                long j18 = 1101890941;
                long j19 = -1;
                long j20 = j18 ^ j19;
                long j21 = i35;
                long j22 = j21 ^ j19;
                long j23 = (((long) (-563)) * j18) + (((long) 565) * jLongValue4) + (((long) (-564)) * (j20 | (((jLongValue4 ^ j19) | j22) ^ j19) | ((jLongValue4 | j21) ^ j19))) + (((long) 1128) * (((j20 | jLongValue4) | j21) ^ j19)) + (((long) 564) * (((j20 | j22) ^ j19) | ((j18 | jLongValue4) ^ j19))) + ((long) (-1413059035));
                int i96 = ~i35;
                int i97 = (((int) (j23 >> 32)) & ((((33588224 | r8) * (-970)) - 242582208) + (((~(1472521233 | i96)) | 1438933009) * 970))) ^ (((int) j23) & ((((-736577693) + (((~((-271303312) | i96)) | 268517509) * (-108))) + ((((~(1165923098 | i35)) | 1163137296) | (~((-1165923099) | i96))) * 54)) + ((i35 | 1163137296) * 54)));
                C50988veY.KWHzl();
                C50988veY.KWHzl();
                if (((r3 & r8) | i97) != 0) {
                    i6 = (i35 & (-267)) | (i96 & 266);
                } else {
                    java.lang.Object[] objArr24 = new java.lang.Object[1];
                    b((char) 53667, 24, CipherSuite.TLS_DH_anon_WITH_SEED_CBC_SHA, objArr24);
                    java.lang.Object[] objArr25 = {(java.lang.String) objArr24[0]};
                    java.lang.Object objEZpvd5 = YY.EZpvd(1845277648);
                    if (objEZpvd5 == null) {
                        byte b7 = (byte) 1;
                        byte b8 = (byte) (b7 + 2);
                        java.lang.Object[] objArr26 = new java.lang.Object[1];
                        a(b7, b8, (byte) (b8 - 2), objArr26);
                        objEZpvd5 = YY.EZpvd(531, 5, (char) 0, 1776058028, false, (java.lang.String) objArr26[0], new java.lang.Class[]{java.lang.String.class});
                    }
                    java.lang.String str16 = (java.lang.String) ((java.lang.reflect.Method) objEZpvd5).invoke(null, objArr25);
                    if (str16 == null || str16.length() == 0) {
                        java.lang.Object[] objArr27 = new java.lang.Object[1];
                        b((char) 61704, 24, CipherSuite.TLS_DHE_PSK_WITH_AES_256_CBC_SHA384, objArr27);
                        java.lang.Object[] objArr28 = {(java.lang.String) objArr27[0]};
                        java.lang.Object objEZpvd6 = YY.EZpvd(1845277648);
                        if (objEZpvd6 == null) {
                            byte b9 = (byte) 1;
                            byte b10 = (byte) (b9 + 2);
                            java.lang.Object[] objArr29 = new java.lang.Object[1];
                            a(b9, b10, (byte) (b10 - 2), objArr29);
                            objEZpvd6 = YY.EZpvd(531, 5, (char) 0, 1776058028, false, (java.lang.String) objArr29[0], new java.lang.Class[]{java.lang.String.class});
                        }
                        java.lang.String str17 = (java.lang.String) ((java.lang.reflect.Method) objEZpvd6).invoke(null, objArr28);
                        i6 = (str17 == null || str17.length() == 0) ? i35 : (~(i35 & 267)) & (i35 | 267);
                    } else {
                        i6 = i35 ^ 267;
                    }
                }
                if (i6 == i35) {
                    java.lang.Object objEZpvd7 = YY.EZpvd(1039002550);
                    if (objEZpvd7 == null) {
                        byte b11 = (byte) 3;
                        byte b12 = (byte) (b11 - 3);
                        java.lang.Object[] objArr30 = new java.lang.Object[1];
                        a(b11, b12, b12, objArr30);
                        objEZpvd7 = YY.EZpvd(TypedValues.MotionType.TYPE_QUANTIZE_MOTIONSTEPS, 5, (char) 0, 969746122, false, (java.lang.String) objArr30[0], new java.lang.Class[0]);
                    }
                    long jLongValue5 = ((java.lang.Long) ((java.lang.reflect.Method) objEZpvd7).invoke(null, null)).longValue();
                    long j24 = 1992696280;
                    long j25 = 46;
                    long j26 = jLongValue5 ^ j19;
                    long j27 = (j25 * j24) + (j25 * jLongValue5) + (((long) (-90)) * (j24 | ((j26 | j22) ^ j19))) + (((long) (-45)) * (((j26 | j21) ^ j19) | ((jLongValue5 | j24) ^ j19))) + (((long) 45) * (j26 | (((j24 ^ j19) | j21) ^ j19) | ((j22 | j24) ^ j19))) + ((long) 11487306);
                    int iFreeMemory = (int) java.lang.Runtime.getRuntime().freeMemory();
                    int i98 = ~iFreeMemory;
                    int i99 = ((int) (j27 >> 32)) & ((-1708553494) + ((~((-1057921657) | i98)) * (-560)) + ((~(iFreeMemory | (-336105505))) * (-560)) + (((~((-1799819229) | i98)) | 1078003076) * 560));
                    int iMyUid = android.os.Process.myUid();
                    int i100 = ((int) j27) & ((-1587633331) + (((~((-862805614) | iMyUid)) | 573330988 | (~((-574420797) | iMyUid))) * (-744)) + (((~iMyUid) | (-863895422)) * 744) + ((iMyUid | (-573330989)) * 744));
                    if (i != 0) {
                        int i101 = (-2) - (i ^ (-1));
                        i7 = 1;
                        i8 = i35 ^ ((i101 ^ 200) + ((i101 & 200) << 1));
                    } else {
                        i7 = 1;
                        i8 = i35;
                    }
                    if (i8 != i35) {
                        int[] iArr = new int[i7];
                        int[] iArr2 = new int[i7];
                        int i102 = copydefault + 21;
                        int i103 = i102 % 128;
                        EZpvd = i103;
                        int i104 = i102 % 2;
                        iArr[0] = i35;
                        iArr2[0] = i8;
                        java.lang.Object[] objArr31 = {new int[i7], null, iArr, iArr2, null};
                        int i105 = 1324839961 + (((~((-497542538) | i96)) | (~((-777332003) | i35))) * 1900) + (((~(i96 | 777332002)) | (~(i35 | 497542537))) * (-950)) + (((~(i35 | 777332002)) | (~(i96 | 497542537))) * 950);
                        int i106 = i103 + 71;
                        copydefault = i106 % 128;
                        int i107 = i106 % 2;
                        int iKWHzl = C50988veY.KWHzl();
                        if (i107 == 0) {
                            i34 = (-62062592) >> (i105 + 949);
                        } else {
                            int i108 = i105 * 949;
                            i34 = (i108 | (-15152)) + ((-15152) & i108);
                        }
                        int i109 = ~i105;
                        int i110 = ~((i109 & iKWHzl) | (i109 ^ iKWHzl));
                        int i111 = i34 + ((-948) * ((i110 & (-17)) | ((-17) ^ i110)));
                        int i112 = ~i105;
                        int i113 = (-17) | i112;
                        int i114 = ~iKWHzl;
                        int i115 = -(-((~((i114 & i113) | (i113 ^ i114))) * (-948)));
                        int i116 = (i111 & i115) + (i115 | i111);
                        int i117 = (16 | i112) * 948;
                        int i118 = (i116 & i117) + (i117 | i116);
                        int i119 = ((i3 | i118) << 1) - (i3 ^ i118);
                        int i120 = i119 ^ (i119 << 13);
                        int i121 = i120 ^ (i120 >>> 17);
                        int i122 = i121 << 5;
                        ((int[]) objArr31[0])[0] = (i121 | i122) & (~(i121 & i122));
                        return objArr31;
                    }
                    int i123 = i7;
                    java.lang.Object[] objArr32 = new java.lang.Object[i123];
                    b((char) 64559, 20, 203, objArr32);
                    java.lang.String str18 = (java.lang.String) objArr32[0];
                    java.lang.Object[] objArr33 = new java.lang.Object[i123];
                    b((char) 58638, 6, 223, objArr33);
                    java.lang.String str19 = (java.lang.String) objArr33[0];
                    java.io.File file = new java.io.File(str18);
                    if (file.exists() && file.isFile()) {
                        try {
                            str3 = str2;
                            try {
                                Scanner scannerUseDelimiter = new Scanner(new java.io.FileInputStream(file)).useDelimiter(str3);
                                next2 = scannerUseDelimiter.hasNext() ? scannerUseDelimiter.next() : "";
                                scannerUseDelimiter.close();
                            } catch (java.io.IOException unused) {
                            }
                        } catch (java.io.IOException unused2) {
                            str3 = str2;
                        }
                        i9 = next2.contains(str19) ? (~(i35 & 262)) & (i35 | 262) : i35;
                        if (i9 == i35) {
                        }
                        return objArr4;
                    }
                    str3 = str2;
                    if (i9 == i35) {
                        objArr4 = new java.lang.Object[]{new int[]{((~i) & i) | ((~i) & i)}, null, new int[]{i35}, new int[]{i9}, null};
                        int i124 = ~(862510758 | i96);
                        int i125 = (-1402193181) + ((143925249 | i124) * (-712)) + (((~((-143925250) | i96)) | (~(1006436007 | i35))) * (-712)) + ((i124 | (-412363782)) * 712);
                        int i126 = i125 * 561;
                        int i127 = ((-8944) ^ i126) + ((i126 & (-8944)) << 1);
                        int i128 = ~i35;
                        int i129 = -(-((~((i128 & 16) | (i128 ^ 16))) * (-560)));
                        int i130 = ((i127 | i129) << 1) - (i129 ^ i127);
                        int i131 = (~i125) | 16;
                        int i132 = -(-((~((i131 & i35) | (i131 ^ i35))) * (-560)));
                        int i133 = (i130 & i132) + (i132 | i130) + (((~((-17) | i125)) | (~((i96 ^ i125) | (i125 & i96)))) * 560);
                        int i134 = i133 * 714;
                        int i135 = -(-(i3 * (-712)));
                        int i136 = (i134 & i135) + (i134 | i135);
                        int i137 = ~i133;
                        int i138 = ~((i137 & i96) | (i137 ^ i96));
                        int i139 = ~i133;
                        int i140 = ~((i139 & i3) | (i139 ^ i3));
                        int i141 = (i138 & i140) | (i138 ^ i140);
                        int i142 = ~i3;
                        int i143 = (i142 & i133) | (i142 ^ i133);
                        int i144 = (i35 & i143) | (i143 ^ i35);
                        int i145 = ~i144;
                        int i146 = ((i141 & i145) | (i141 ^ i145)) * (-713);
                        int i147 = ((((i136 | i146) << 1) - (i146 ^ i136)) - (~((~i144) * 1426))) - 1;
                        int i148 = -(-((~((~i3) | i96)) * 713));
                        int i149 = (i147 & i148) + (i148 | i147);
                        int i150 = i149 << 13;
                        int i151 = (i150 & (~i149)) | ((~i150) & i149);
                        int i152 = i151 >>> 17;
                        int i153 = (i151 | i152) & (~(i151 & i152));
                        int i154 = i153 << 5;
                    } else {
                        java.lang.String[] strArr4 = new java.lang.String[4];
                        java.lang.Object[] objArr34 = new java.lang.Object[1];
                        b((char) 0, 31, 231, objArr34);
                        strArr4[0] = (java.lang.String) objArr34[0];
                        java.lang.Object[] objArr35 = new java.lang.Object[1];
                        b((char) 0, 23, 262, objArr35);
                        strArr4[1] = (java.lang.String) objArr35[0];
                        java.lang.Object[] objArr36 = new java.lang.Object[1];
                        b((char) 0, 28, 285, objArr36);
                        strArr4[2] = (java.lang.String) objArr36[0];
                        int i155 = EZpvd;
                        int i156 = 1;
                        int i157 = (i155 ^ 45) + ((i155 & 45) << 1);
                        copydefault = i157 % 128;
                        if (i157 % 2 == 0) {
                            java.lang.Object[] objArr37 = new java.lang.Object[1];
                            b((char) 0, 14, 5011, objArr37);
                            strArr4[3] = (java.lang.String) objArr37[0];
                            i10 = 4;
                        } else {
                            java.lang.Object[] objArr38 = new java.lang.Object[1];
                            b((char) 0, 14, 313, objArr38);
                            strArr4[3] = (java.lang.String) objArr38[0];
                            i10 = 4;
                            i156 = 0;
                        }
                        while (true) {
                            if (i156 >= i10) {
                                i11 = i96;
                                j = j21;
                                str4 = str3;
                                i12 = i35;
                                break;
                            }
                            int i158 = EZpvd;
                            int i159 = (i158 & 121) + (i158 | 121);
                            copydefault = i159 % 128;
                            if (i159 % 2 == 0) {
                                java.lang.Object[] objArr39 = {strArr4[i156]};
                                java.lang.Object objEZpvd8 = YY.EZpvd(1229107605);
                                if (objEZpvd8 == null) {
                                    byte b13 = (byte) 3;
                                    byte b14 = (byte) (b13 - 3);
                                    java.lang.Object[] objArr40 = new java.lang.Object[1];
                                    a(b13, b14, b14, objArr40);
                                    objEZpvd8 = YY.EZpvd(FrameMetricsAggregator.EVERY_DURATION, 5, (char) 43308, 1298300137, false, (java.lang.String) objArr40[0], new java.lang.Class[]{java.lang.String.class});
                                }
                                jLongValue = ((java.lang.Long) ((java.lang.reflect.Method) objEZpvd8).invoke(null, objArr39)).longValue();
                                int i160 = 63 / 0;
                            } else {
                                java.lang.Object[] objArr41 = {strArr4[i156]};
                                java.lang.Object objEZpvd9 = YY.EZpvd(1229107605);
                                if (objEZpvd9 == null) {
                                    byte b15 = (byte) 3;
                                    byte b16 = (byte) (b15 - 3);
                                    java.lang.Object[] objArr42 = new java.lang.Object[1];
                                    a(b15, b16, b16, objArr42);
                                    objEZpvd9 = YY.EZpvd(FrameMetricsAggregator.EVERY_DURATION, 5, (char) 43308, 1298300137, false, (java.lang.String) objArr42[0], new java.lang.Class[]{java.lang.String.class});
                                }
                                jLongValue = ((java.lang.Long) ((java.lang.reflect.Method) objEZpvd9).invoke(null, objArr41)).longValue();
                            }
                            int i161 = copydefault + 99;
                            EZpvd = i161 % 128;
                            int i162 = i161 % 2;
                            long j28 = -93362437;
                            str4 = str3;
                            java.lang.String[] strArr5 = strArr4;
                            j = j21;
                            long j29 = (((long) 714) * j28) + (((long) (-712)) * jLongValue);
                            long j30 = j28 ^ j19;
                            i11 = i96;
                            long jMaxMemory = (int) java.lang.Runtime.getRuntime().maxMemory();
                            long j31 = jMaxMemory ^ j19;
                            long j32 = ((j30 | j31) ^ j19) | ((j30 | jLongValue) ^ j19);
                            long j33 = jLongValue ^ j19;
                            long j34 = ((j28 | j33) | jMaxMemory) ^ j19;
                            long j35 = j29 + (((long) (-713)) * (j32 | j34)) + (((long) 1426) * j34) + (((long) 713) * ((j33 | j31) ^ j19)) + ((long) 2121196723);
                            int iElapsedRealtime = (int) android.os.SystemClock.elapsedRealtime();
                            int i163 = (~((-569616022) | iElapsedRealtime)) | 565356053;
                            int i164 = ((int) (j35 >> 32)) & (1537498186 + (i163 * 992) + ((i163 | (~((~iElapsedRealtime) | 871870357))) * (-496)) + ((iElapsedRealtime | 867610389) * 496));
                            int i165 = ~android.os.Process.myPid();
                            int i166 = ((int) j35) & (1295166720 + (((~((-499536041) | i165)) | 1936762450) * (-983)) + (((~(i165 | 1936762450)) | (-2146891515)) * 983));
                            if (((i164 & i166) | (i164 ^ i166)) != 0) {
                                int i167 = -(-(i156 * 503));
                                int i168 = (126756 ^ i167) + ((i167 & 126756) << 1);
                                int i169 = (i156 ^ 252) | (i156 & 252);
                                int i170 = i169 * (-502);
                                int i171 = (i168 ^ i170) + ((i168 & i170) << 1);
                                int i172 = ~i156;
                                int i173 = ~((i172 & (-253)) | ((-253) ^ i172));
                                int i174 = ~i35;
                                int i175 = ~(((-253) & i174) | ((-253) ^ i174));
                                int i176 = (i173 & i175) | (i173 ^ i175);
                                int i177 = ~((i169 & i35) | (i169 ^ i35));
                                int i178 = -(-(((i177 & i176) | (i176 ^ i177)) * (-502)));
                                int i179 = (i171 ^ i178) + ((i178 & i171) << 1);
                                int i180 = ((-253) & i174) | ((-253) ^ i174);
                                int i181 = ~((i180 & i156) | (i180 ^ i156));
                                int i182 = i156 | 252;
                                int i183 = ~((i182 & i35) | (i182 ^ i35));
                                int i184 = i179 + (((i181 & i183) | (i181 ^ i183)) * 502);
                                i12 = (~(i35 & i184)) & (i184 | i35);
                                break;
                            }
                            i156 = (i156 & 1) + (i156 | 1);
                            str3 = str4;
                            strArr4 = strArr5;
                            j21 = j;
                            i96 = i11;
                            i10 = 4;
                        }
                        if (i12 != i35) {
                            int i185 = copydefault + 69;
                            EZpvd = i185 % 128;
                            int i186 = i185 % 2;
                            java.lang.Object[] objArr43 = {new int[]{i ^ (i << 5)}, null, new int[]{i35}, new int[]{i12}, null};
                            int i187 = ((((~(i35 | (-39887138))) | 832328714) * 501) - 1913569916) + ((~(i11 | (-39887138))) * 501);
                            int i188 = -(-((i187 ^ 16) + ((i187 & 16) << 1)));
                            int i189 = (i3 ^ i188) + ((i188 & i3) << 1);
                            int i190 = (i189 << 13) ^ i189;
                            int i191 = i190 >>> 17;
                            int i192 = (i190 | i191) & (~(i190 & i191));
                            return objArr43;
                        }
                        java.lang.Object[] objArr44 = new java.lang.Object[1];
                        b((char) 0, 13, 327, objArr44);
                        java.lang.Object[] objArr45 = {(java.lang.String) objArr44[0]};
                        java.lang.Object objEZpvd10 = YY.EZpvd(1845277648);
                        if (objEZpvd10 == null) {
                            byte b17 = (byte) 1;
                            byte b18 = (byte) (b17 + 2);
                            java.lang.Object[] objArr46 = new java.lang.Object[1];
                            a(b17, b18, (byte) (b18 - 2), objArr46);
                            objEZpvd10 = YY.EZpvd(531, 5, (char) 0, 1776058028, false, (java.lang.String) objArr46[0], new java.lang.Class[]{java.lang.String.class});
                        }
                        java.lang.String str20 = (java.lang.String) ((java.lang.reflect.Method) objEZpvd10).invoke(null, objArr45);
                        if (str20 != null) {
                            java.lang.Object[] objArr47 = new java.lang.Object[1];
                            b((char) 63358, 9, 340, objArr47);
                            if (str20.contains((java.lang.String) objArr47[0])) {
                                int i193 = EZpvd + 79;
                                copydefault = i193 % 128;
                                if (i193 % 2 == 0) {
                                    i13 = i11;
                                    i14 = (i35 & (-9309)) | (i13 & 9308);
                                } else {
                                    i13 = i11;
                                    i14 = (~(i35 & 250)) & (i35 | 250);
                                }
                            }
                            if (i14 == i35) {
                                objArr4 = new java.lang.Object[]{new int[1], null, new int[]{i35}, new int[]{i14}, null};
                                int i194 = (-1107234909) + ((~(i35 | 1069373500)) * 216) + (((-172612) | i13) * (-216)) + (((~(i13 | 1069373500)) | 205501039) * 216);
                                int i195 = ((i194 | 16) << 1) - (16 ^ i194);
                                int iKWHzl2 = C50988veY.KWHzl();
                                int i196 = ((((i195 * 673) - (~(-(-(i3 * (-1343)))))) - 1) - (~(((~((i195 ^ iKWHzl2) | (i195 & iKWHzl2))) | i3) * 672))) - 1;
                                int i197 = ~i195;
                                int i198 = ~iKWHzl2;
                                int i199 = ~((i197 & i198) | (i197 ^ i198));
                                int i200 = ~((i3 ^ iKWHzl2) | (i3 & iKWHzl2));
                                int i201 = -(-(((i199 & i200) | (i199 ^ i200)) * (-672)));
                                int i202 = (i196 ^ i201) + ((i196 & i201) << 1);
                                int i203 = ~i3;
                                int i204 = ~iKWHzl2;
                                int i205 = ~((i204 & i203) | (i203 ^ i204));
                                int i206 = ~i3;
                                int i207 = ~((i195 & i206) | (i206 ^ i195));
                                int i208 = ((i207 & i205) | (i205 ^ i207)) * 672;
                                int i209 = ((i202 | i208) << 1) - (i208 ^ i202);
                                int i210 = i209 << 13;
                                int i211 = (i210 | i209) & (~(i209 & i210));
                                int i212 = i211 >>> 17;
                                int i213 = ((~i211) & i212) | ((~i212) & i211);
                                int i214 = i213 << 5;
                                ((int[]) objArr4[0])[0] = ((~i213) & i214) | ((~i214) & i213);
                            } else {
                                java.lang.Object[] objArr48 = new java.lang.Object[1];
                                b((char) 57649, 17, 349, objArr48);
                                java.lang.String str21 = (java.lang.String) objArr48[0];
                                int i215 = EZpvd + 65;
                                copydefault = i215 % 128;
                                if (i215 % 2 == 0) {
                                    java.lang.Object[] objArr49 = new java.lang.Object[1];
                                    b((char) 0, 2, 28958, objArr49);
                                    str5 = (java.lang.String) objArr49[0];
                                } else {
                                    java.lang.Object[] objArr50 = new java.lang.Object[1];
                                    b((char) 0, 6, 366, objArr50);
                                    str5 = (java.lang.String) objArr50[0];
                                }
                                java.io.File file2 = new java.io.File(str21);
                                if (file2.exists()) {
                                    int i216 = copydefault - (-1);
                                    EZpvd = i216 % 128;
                                    int i217 = i216 % 2;
                                    if (file2.isFile()) {
                                        try {
                                            str6 = str4;
                                            try {
                                                Scanner scannerUseDelimiter2 = new Scanner(new java.io.FileInputStream(file2)).useDelimiter(str6);
                                                java.lang.String next3 = scannerUseDelimiter2.hasNext() ? scannerUseDelimiter2.next() : "";
                                                scannerUseDelimiter2.close();
                                                if (next3.contains(str5)) {
                                                    i15 = (~(i35 & 251)) & (i35 | 251);
                                                }
                                            } catch (java.io.IOException unused3) {
                                            }
                                        } catch (java.io.IOException unused4) {
                                            str6 = str4;
                                        }
                                        if (i15 == i35) {
                                            objArr4 = new java.lang.Object[]{new int[]{(i | i) & (~(i & i))}, null, new int[]{i35}, new int[]{i15}, null};
                                            int i218 = 1921530146 + ((i35 | 550314336) * (-859)) + (((~(550314336 | i13)) | (~((-537731393) | i35))) * 859) + (((~((-724560204) | i13)) | 186828811) * 859);
                                            int i219 = i218 * (-67);
                                            int i220 = (1104 ^ i219) + ((i219 & 1104) << 1);
                                            int i221 = ~i218;
                                            int i222 = ~(((-17) ^ i221) | ((-17) & i221) | i13);
                                            int i223 = ~((i218 ^ 16) | (i218 & 16));
                                            int i224 = (i222 & i223) | (i222 ^ i223);
                                            int i225 = ~((i218 ^ i35) | (i218 & i35));
                                            int i226 = -(-(((i224 & i225) | (i224 ^ i225)) * (-68)));
                                            int i227 = ((i220 | i226) << 1) - (i226 ^ i220);
                                            int i228 = ~i35;
                                            int i229 = ((-17) ^ i228) | ((-17) & i228);
                                            int i230 = i227 + ((~((i218 & i229) | (i229 ^ i218))) * (-68));
                                            int i231 = -(-(((~((i221 & i228) | (i221 ^ i228))) | (-17)) * 68));
                                            int i232 = (i230 ^ i231) + ((i231 & i230) << 1);
                                            int i233 = i232 * 370;
                                            int i234 = i3 * 370;
                                            int i235 = (i233 ^ i234) + ((i233 & i234) << 1);
                                            int i236 = i232 | i3;
                                            int i237 = -(-(((i236 & i228) | (i236 ^ i228)) * (-369)));
                                            int i238 = (i235 ^ i237) + ((i237 & i235) << 1);
                                            int i239 = ~((~i232) | i13);
                                            int i240 = -(-(((i239 & i3) | (i3 ^ i239)) * (-369)));
                                            int i241 = (i238 ^ i240) + ((i240 & i238) << 1);
                                            int i242 = ~((~i3) | i232);
                                            int i243 = ~((i35 & i232) | (i232 ^ i35));
                                            int i244 = (i243 & i242) | (i242 ^ i243);
                                            int i245 = ~i232;
                                            int i246 = (i241 - (~((i244 | (~(i3 | ((i245 & i13) | (i245 ^ i13))))) * 369))) - 1;
                                            int i247 = (i246 << 13) ^ i246;
                                            int i248 = i247 >>> 17;
                                            int i249 = ((~i247) & i248) | ((~i248) & i247);
                                            int i250 = i249 << 5;
                                        } else {
                                            java.lang.Object[] objArr51 = new java.lang.Object[1];
                                            b((char) 57507, 23, 372, objArr51);
                                            java.lang.Object[] objArr52 = {(java.lang.String) objArr51[0]};
                                            java.lang.Object objEZpvd11 = YY.EZpvd(1845277648);
                                            if (objEZpvd11 == null) {
                                                byte b19 = (byte) 1;
                                                byte b20 = (byte) (b19 + 2);
                                                java.lang.Object[] objArr53 = new java.lang.Object[1];
                                                a(b19, b20, (byte) (b20 - 2), objArr53);
                                                objEZpvd11 = YY.EZpvd(531, 5, (char) 0, 1776058028, false, (java.lang.String) objArr53[0], new java.lang.Class[]{java.lang.String.class});
                                            }
                                            java.lang.String lowerCase = ((java.lang.String) ((java.lang.reflect.Method) objEZpvd11).invoke(null, objArr52)).toLowerCase();
                                            java.lang.Object[] objArr54 = new java.lang.Object[1];
                                            b((char) 0, 4, 395, objArr54);
                                            int i251 = lowerCase.contains((java.lang.String) objArr54[0]) ^ true ? i35 : (i35 & (-265)) | (i13 & 264);
                                            if (i251 != i35) {
                                                java.lang.Object[] objArr55 = {new int[]{((~i) & i) | ((~i) & i)}, null, new int[]{i35}, new int[]{i251}, null};
                                                int i252 = (-2022234569) + (((~(1073542651 | i13)) | 201331888) * 220) + (((~(762066171 | i13)) | 512808368) * (-440)) + ((i35 | 1073542651) * 220);
                                                int i253 = (i3 - (~((i252 & 16) + (16 | i252)))) - 1;
                                                int i254 = i253 << 13;
                                                int i255 = (i253 | i254) & (~(i253 & i254));
                                                int i256 = i255 >>> 17;
                                                int i257 = (i255 | i256) & (~(i255 & i256));
                                                int i258 = i257 << 5;
                                                int i259 = EZpvd;
                                                int i260 = ((i259 | 93) << 1) - (i259 ^ 93);
                                                copydefault = i260 % 128;
                                                int i261 = i260 % 2;
                                                return objArr55;
                                            }
                                            java.lang.Object[] objArr56 = new java.lang.Object[1];
                                            b((char) 31305, 42, 399, objArr56);
                                            java.lang.String str22 = (java.lang.String) objArr56[0];
                                            java.lang.Object[] objArr57 = new java.lang.Object[1];
                                            b((char) 0, 40, 441, objArr57);
                                            java.lang.String str23 = (java.lang.String) objArr57[0];
                                            java.lang.Object[] objArr58 = new java.lang.Object[1];
                                            b((char) 0, 27, 481, objArr58);
                                            java.lang.String str24 = (java.lang.String) objArr58[0];
                                            java.lang.Object[] objArr59 = new java.lang.Object[1];
                                            b((char) 37597, 27, TypedValues.PositionType.TYPE_CURVE_FIT, objArr59);
                                            java.lang.String str25 = (java.lang.String) objArr59[0];
                                            java.lang.Object[] objArr60 = new java.lang.Object[1];
                                            b((char) 57369, 27, 535, objArr60);
                                            java.lang.String str26 = (java.lang.String) objArr60[0];
                                            java.lang.Object[] objArr61 = new java.lang.Object[1];
                                            b((char) 45078, 27, 562, objArr61);
                                            java.lang.String[] strArr6 = {str22, str23, str24, str25, str26, (java.lang.String) objArr61[0]};
                                            int i262 = 0;
                                            int i263 = 6;
                                            while (true) {
                                                if (i262 >= i263) {
                                                    i16 = i35;
                                                    break;
                                                }
                                                java.lang.Object[] objArr62 = {strArr6[i262]};
                                                java.lang.Object objEZpvd12 = YY.EZpvd(1845277648);
                                                if (objEZpvd12 == null) {
                                                    byte b21 = (byte) 1;
                                                    byte b22 = (byte) (b21 + 2);
                                                    java.lang.Object[] objArr63 = new java.lang.Object[1];
                                                    a(b21, b22, (byte) (b22 - 2), objArr63);
                                                    objEZpvd12 = YY.EZpvd(531, 5, (char) 0, 1776058028, false, (java.lang.String) objArr63[0], new java.lang.Class[]{java.lang.String.class});
                                                }
                                                java.lang.String str27 = (java.lang.String) ((java.lang.reflect.Method) objEZpvd12).invoke(null, objArr62);
                                                if (str27 != null && str27.length() != 0) {
                                                    i16 = (i35 & (-266)) | (i13 & 265);
                                                    break;
                                                }
                                                i262++;
                                                i263 = 6;
                                            }
                                            if (i16 != i35) {
                                                int i264 = EZpvd;
                                                int i265 = i264 + 103;
                                                copydefault = i265 % 128;
                                                if (i265 % 2 == 0) {
                                                    java.lang.Object[] objArr64 = new java.lang.Object[5];
                                                    i32 = 1;
                                                    objArr64[1] = new int[1];
                                                    objArr64[4] = new int[1];
                                                    objArr64[4] = new int[1];
                                                    objArr3 = objArr64;
                                                    i33 = 2;
                                                } else {
                                                    i32 = 1;
                                                    java.lang.Object[] objArr65 = new java.lang.Object[5];
                                                    objArr65[0] = new int[1];
                                                    objArr65[2] = new int[1];
                                                    objArr65[3] = new int[1];
                                                    objArr3 = objArr65;
                                                    i33 = 16;
                                                }
                                                int i266 = (i264 ^ 85) + ((i264 & 85) << i32);
                                                copydefault = i266 % 128;
                                                if (i266 % 2 == 0) {
                                                    ((int[]) objArr3[3])[i32] = i35;
                                                    ((int[]) objArr3[2])[0] = i16;
                                                    objArr3[i32] = null;
                                                    objArr3[4] = null;
                                                } else {
                                                    ((int[]) objArr3[2])[0] = i35;
                                                    ((int[]) objArr3[3])[0] = i16;
                                                    objArr3[i32] = null;
                                                    objArr3[4] = null;
                                                }
                                                int i267 = (int) java.lang.Runtime.getRuntime().totalMemory();
                                                int i268 = ~i267;
                                                int i269 = 1324839961 + (((~((-1075757665) | i268)) | (~((-199116876) | i267))) * 1900) + (((~(i268 | 199116875)) | (~(i267 | 1075757664))) * (-950)) + (((~(i267 | 199116875)) | (~(i268 | 1075757664))) * 950);
                                                int i270 = i33 * (-1529);
                                                int i271 = -(-(i269 * (-764)));
                                                int i272 = (i270 ^ i271) + ((i270 & i271) << 1);
                                                int i273 = ~i33;
                                                int i274 = ~i269;
                                                int i275 = (i273 ^ i274) | (i273 & i274);
                                                int i276 = ~((i275 & i13) | (i275 ^ i13));
                                                int i277 = ~((i273 ^ i269) | (i273 & i269) | i35);
                                                int i278 = (i276 & i277) | (i276 ^ i277);
                                                int i279 = ~i269;
                                                int i280 = (i279 ^ i33) | (i279 & i33);
                                                int i281 = ~((i280 & i35) | (i280 ^ i35));
                                                int i282 = -(-(((i278 & i281) | (i278 ^ i281)) * 765));
                                                int i283 = ((i272 | i282) << 1) - (i272 ^ i282);
                                                int i284 = ~((i273 & i279) | (i273 ^ i279));
                                                int i285 = ~i33;
                                                int i286 = ~(i13 | i285);
                                                int i287 = i283 + (((i284 & i286) | (i284 ^ i286)) * 1530);
                                                int i288 = ~(i285 | i35);
                                                int i289 = ~i35;
                                                int i290 = (i289 & i274) | (i274 ^ i289);
                                                int i291 = -(-(((~((i290 & i33) | (i290 ^ i33))) | i288) * 765));
                                                int i292 = (i287 ^ i291) + ((i291 & i287) << 1);
                                                int iKWHzl3 = C50988veY.KWHzl();
                                                int i293 = i292 * 1773;
                                                int i294 = -(-(i3 * (-885)));
                                                int i295 = (i293 & i294) + (i293 | i294);
                                                int i296 = ~i292;
                                                int i297 = ~i3;
                                                int i298 = ~((i296 & i297) | (i296 ^ i297));
                                                int i299 = ~i3;
                                                int i300 = EZpvd;
                                                int i301 = (i300 & 47) + (i300 | 47);
                                                copydefault = i301 % 128;
                                                int i302 = i301 % 2;
                                                int i303 = ~(i299 | iKWHzl3);
                                                int i304 = (i298 & i303) | (i298 ^ i303);
                                                int i305 = ~iKWHzl3;
                                                int i306 = (i305 & i292) | (i305 ^ i292);
                                                int i307 = ~((i306 ^ i3) | (i306 & i3));
                                                int i308 = (i295 - (~(886 * ((i304 & i307) | (i304 ^ i307))))) - 1;
                                                int i309 = ~iKWHzl3;
                                                int i310 = ((~((i309 & i3) | (i309 ^ i3))) | i292) * (-1772);
                                                int i311 = (((i308 ^ i310) + ((i310 & i308) << 1)) - (~((~i306) * 886))) - 1;
                                                int i312 = i311 << 13;
                                                int i313 = (i312 | i311) & (~(i311 & i312));
                                                int i314 = i313 ^ (i313 >>> 17);
                                                int i315 = i314 << 5;
                                                ((int[]) objArr3[0])[0] = ((~i314) & i315) | ((~i315) & i314);
                                                return objArr3;
                                            }
                                            java.lang.Object[] objArr66 = new java.lang.Object[1];
                                            b((char) 57649, 17, 349, objArr66);
                                            java.lang.String str28 = (java.lang.String) objArr66[0];
                                            java.lang.Object[] objArr67 = new java.lang.Object[1];
                                            b((char) 20557, 6, 589, objArr67);
                                            java.lang.String str29 = (java.lang.String) objArr67[0];
                                            java.io.File file3 = new java.io.File(str28);
                                            if (file3.exists() && file3.isFile()) {
                                                try {
                                                    Scanner scannerUseDelimiter3 = new Scanner(new java.io.FileInputStream(file3)).useDelimiter(str6);
                                                    if (scannerUseDelimiter3.hasNext()) {
                                                        int i316 = copydefault + 105;
                                                        EZpvd = i316 % 128;
                                                        int i317 = i316 % 2;
                                                        next = scannerUseDelimiter3.next();
                                                    } else {
                                                        next = "";
                                                    }
                                                    scannerUseDelimiter3.close();
                                                    if (next.contains(str29)) {
                                                        z = true;
                                                    }
                                                } catch (java.io.IOException unused5) {
                                                }
                                                if (z) {
                                                }
                                                if (i17 == i35) {
                                                }
                                            } else {
                                                z = false;
                                                if (z) {
                                                    java.lang.Object[] objArr68 = new java.lang.Object[1];
                                                    b((char) 46225, 13, 595, objArr68);
                                                    java.lang.String str30 = (java.lang.String) objArr68[0];
                                                    java.lang.Object[] objArr69 = new java.lang.Object[1];
                                                    b((char) 0, 9, TypedValues.MotionType.TYPE_DRAW_PATH, objArr69);
                                                    java.lang.Object[] objArr70 = {str30, (java.lang.String) objArr69[0]};
                                                    java.lang.Object objEZpvd13 = YY.EZpvd(-1888477952);
                                                    if (objEZpvd13 == null) {
                                                        byte b23 = (byte) 3;
                                                        byte b24 = (byte) (b23 - 3);
                                                        java.lang.Object[] objArr71 = new java.lang.Object[1];
                                                        a(b23, b24, b24, objArr71);
                                                        objEZpvd13 = YY.EZpvd(200, 4, (char) 45158, -1957638020, false, (java.lang.String) objArr71[0], new java.lang.Class[]{java.lang.String.class, java.lang.String.class});
                                                    }
                                                    long jLongValue6 = ((java.lang.Long) ((java.lang.reflect.Method) objEZpvd13).invoke(null, objArr70)).longValue();
                                                    long j36 = 950654013;
                                                    str7 = str6;
                                                    long j37 = -494;
                                                    long j38 = 495;
                                                    long j39 = j36 | j22;
                                                    long j40 = (j37 * j36) + (j37 * jLongValue6) + (((long) (-495)) * ((j36 | jLongValue6) ^ j19)) + (j38 * j39) + (j38 * ((((j36 ^ j19) | (jLongValue6 ^ j19)) ^ j19) | (j39 ^ j19))) + ((long) (-2123509446));
                                                    int i318 = ((int) (j40 >> 32)) & ((-648392522) + (((~(371319197 | i13)) | (~((-1808545609) | i35))) * 210) + (((~((-33562889) | i13)) | (~(2146301917 | i35))) * 210));
                                                    int i319 = ((int) j40) & ((-1020018631) + (((-1359036417) | i35) * (-676)) + (((~(749354323 | i13)) | 1359036416) * 676) + (((~((-2108386563) | i13)) | 749350146 | (~(2108390739 | i35))) * 676));
                                                    i17 = ((int) ((long) ((i319 & i318) | (i318 ^ i319)))) != 0 ? i35 ^ 261 : i35;
                                                } else {
                                                    i17 = i35 ^ 260;
                                                    str7 = str6;
                                                }
                                                if (i17 == i35) {
                                                    objArr2 = new java.lang.Object[]{new int[1], null, new int[]{i35}, new int[]{i17}, null};
                                                    int startElapsedRealtime2 = (int) android.os.Process.getStartElapsedRealtime();
                                                    int i320 = ~startElapsedRealtime2;
                                                    int i321 = (((~((-729321729) | i320)) | (~(1006436327 | startElapsedRealtime2))) * 988) + 1257211291 + (((~(startElapsedRealtime2 | (-997759941))) | 268438212 | (~(i320 | 1006436327))) * 988);
                                                    int i322 = 8351 - (~(-(-(i321 * (-520)))));
                                                    int i323 = -(-(((~((i13 ^ i321) | (i13 & i321))) | 16) * (-1042)));
                                                    int i324 = (i322 ^ i323) + ((i322 & i323) << 1);
                                                    int i325 = ((i321 ^ i35) | (i321 & i35)) * 521;
                                                    int i326 = (i324 & i325) + (i325 | i324);
                                                    int i327 = ~i321;
                                                    int i328 = ~((i327 & (-17)) | ((-17) ^ i327));
                                                    int i329 = ~((i35 & (-17)) | ((-17) ^ i35));
                                                    int i330 = (i329 & i328) | (i328 ^ i329);
                                                    int i331 = 16 | i13;
                                                    int i332 = ~((i331 & i321) | (i331 ^ i321));
                                                    int i333 = ((i330 & i332) | (i330 ^ i332)) * 521;
                                                    int i334 = i3 + (i326 ^ i333) + ((i333 & i326) << 1);
                                                    int i335 = i334 << 13;
                                                    int i336 = ((~i334) & i335) | ((~i335) & i334);
                                                    int i337 = i336 >>> 17;
                                                    int i338 = (i336 | i337) & (~(i336 & i337));
                                                    int i339 = i338 << 5;
                                                    ((int[]) objArr2[0])[0] = (i338 | i339) & (~(i338 & i339));
                                                } else {
                                                    java.lang.Object objEZpvd14 = YY.EZpvd(1163119633);
                                                    if (objEZpvd14 == null) {
                                                        byte b25 = (byte) 3;
                                                        byte b26 = (byte) (b25 - 3);
                                                        java.lang.Object[] objArr72 = new java.lang.Object[1];
                                                        a(b25, b26, b26, objArr72);
                                                        objEZpvd14 = YY.EZpvd(635, 5, (char) 40467, 1098056045, false, (java.lang.String) objArr72[0], new java.lang.Class[0]);
                                                    }
                                                    long jLongValue7 = ((java.lang.Long) ((java.lang.reflect.Method) objEZpvd14).invoke(null, null)).longValue();
                                                    long j41 = -286141824;
                                                    long j42 = 614;
                                                    long jMyPid2 = android.os.Process.myPid();
                                                    long j43 = j41 ^ j19;
                                                    long j44 = (j43 | jLongValue7) ^ j19;
                                                    long j45 = jLongValue7 ^ j19;
                                                    long j46 = (((long) 615) * j41) + (((long) (-613)) * jLongValue7) + ((jMyPid2 | j44 | ((j45 | j41) ^ j19)) * j42);
                                                    long j47 = jMyPid2 ^ j19;
                                                    long j48 = j46 + (((long) (-1228)) * (((j43 | j47) ^ j19) | j44 | ((j47 | jLongValue7) ^ j19))) + (j42 * ((((j43 | j45) | j47) ^ j19) | (((j47 | j41) | jLongValue7) ^ j19))) + ((long) (-1631617625));
                                                    int iMyPid = android.os.Process.myPid();
                                                    int i340 = ((int) (j48 >> 32)) & ((-282630838) + (((~(485471197 | iMyPid)) | 537919488) * (-140)) + ((~(1023390685 | iMyPid)) * 70) + (((~(iMyPid | 951755213)) | 609554960) * 70));
                                                    int i341 = ((int) j48) & ((((~(1728343901 | r3)) * TypedValues.CycleType.TYPE_EASING) - 1051269075) + (((~((~new java.util.Random().nextInt(1175394666)) | 1728343901)) | 1124084312) * TypedValues.CycleType.TYPE_EASING));
                                                    if (((i341 & i340) | (i340 ^ i341)) == 1) {
                                                        objArr2 = new java.lang.Object[]{new int[1], null, new int[]{i35}, new int[]{i35}, null};
                                                        int iFreeMemory2 = (int) java.lang.Runtime.getRuntime().freeMemory();
                                                        int i342 = (-470177224) + (((~((-676491574) | iFreeMemory2)) | 537006388) * 345) + (((~((-676491574) | (~iFreeMemory2))) | 61376578) * 345) + ((~(iFreeMemory2 | (-537006389))) * 345);
                                                        int iKWHzl4 = C50988veY.KWHzl();
                                                        int i343 = i342 * (-380);
                                                        int i344 = i3 * 382;
                                                        int i345 = (i343 & i344) + (i343 | i344);
                                                        int i346 = (i3 ^ iKWHzl4) | (i3 & iKWHzl4);
                                                        int i347 = ~i342;
                                                        int i348 = -(-(((i346 & i347) | (i346 ^ i347)) * (-381)));
                                                        int i349 = (i345 ^ i348) + ((i348 & i345) << 1);
                                                        int i350 = ~((~i342) | (~i3));
                                                        int i351 = ~((~iKWHzl4) | i3);
                                                        int i352 = i349 + (((i351 & i350) | (i350 ^ i351) | (~((i342 ^ i3) | (i342 & i3)))) * 381) + ((~((i347 ^ i3) | (i3 & i347))) * 381);
                                                        int i353 = i352 << 13;
                                                        int i354 = (i353 & (~i352)) | ((~i353) & i352);
                                                        int i355 = i354 >>> 17;
                                                        int i356 = ((~i354) & i355) | ((~i355) & i354);
                                                        int i357 = i356 << 5;
                                                        ((int[]) objArr2[0])[0] = (i356 | i357) & (~(i356 & i357));
                                                    } else {
                                                        java.lang.Object[] objArr73 = {1};
                                                        java.lang.Object objEZpvd15 = YY.EZpvd(140339483);
                                                        if (objEZpvd15 == null) {
                                                            byte b27 = (byte) 3;
                                                            byte b28 = (byte) (b27 - 3);
                                                            java.lang.Object[] objArr74 = new java.lang.Object[1];
                                                            a(b27, b28, b28, objArr74);
                                                            objEZpvd15 = YY.EZpvd(393, 5, (char) 5431, 209560679, false, (java.lang.String) objArr74[0], new java.lang.Class[]{java.lang.Integer.TYPE});
                                                        }
                                                        long jLongValue8 = ((java.lang.Long) ((java.lang.reflect.Method) objEZpvd15).invoke(null, objArr73)).longValue();
                                                        long j49 = 1162719543;
                                                        long j50 = -381;
                                                        long j51 = j49 ^ j19;
                                                        long j52 = 381;
                                                        long j53 = (((long) (-380)) * j49) + (((long) 382) * jLongValue8) + ((jLongValue8 | j | j51) * j50) + ((((j51 | (jLongValue8 ^ j19)) ^ j19) | ((j22 | jLongValue8) ^ j19) | ((j49 | jLongValue8) ^ j19)) * j52) + (j52 * ((j51 | jLongValue8) ^ j19)) + ((long) 727212080);
                                                        int elapsedCpuTime = (int) android.os.Process.getElapsedCpuTime();
                                                        int i358 = ((int) (j53 >> 32)) & (1704617878 + (((~((-1445133007) | elapsedCpuTime)) | 1411558022) * 305) + (((~((~elapsedCpuTime) | (-1445133007))) | 1412607878) * 305));
                                                        int i359 = ((int) j53) & (1209049143 + (((-1359482945) | i13) * 494) + (((~(750218645 | i13)) | (-1361662294)) * 494));
                                                        int i360 = ((int) ((long) ((i358 & i359) | (i358 ^ i359)))) != 0 ? (~(i35 & 220)) & (i35 | 220) : i35;
                                                        if (i360 != i35) {
                                                            java.lang.Object[] objArr75 = {new int[]{((~i) & i) | ((~i) & i)}, null, new int[]{i35}, new int[]{i360}, null};
                                                            int i361 = 1757293436 + (((-196116481) | i35) * (-627)) + (((~((-810305512) | i35)) | 464569028) * (-627)) + (((~(810305511 | i13)) | (~(464569028 | i35))) * 627);
                                                            int i362 = i361 * 517;
                                                            int i363 = ((-8240) & i362) + (i362 | (-8240));
                                                            int i364 = ~i361;
                                                            int i365 = (~((i364 & i35) | (i364 ^ i35))) | (~((i13 ^ 16) | (i13 & 16)));
                                                            int i366 = ~((i13 ^ i361) | (i13 & i361));
                                                            int i367 = -(-(((i365 & i366) | (i365 ^ i366)) * (-516)));
                                                            int i368 = ((i363 | i367) << 1) - (i367 ^ i363);
                                                            int i369 = ~i361;
                                                            int i370 = ~((i369 & (-17)) | ((-17) ^ i369) | i35);
                                                            int i371 = (i13 & (-17)) | ((-17) ^ i13);
                                                            int i372 = ~((i371 & i361) | (i371 ^ i361));
                                                            int i373 = ((i370 & i372) | (i370 ^ i372)) * 516;
                                                            int i374 = (i368 ^ i373) + ((i373 & i368) << 1);
                                                            int i375 = ~(((-17) & i361) | ((-17) ^ i361));
                                                            int i376 = ~i35;
                                                            int i377 = -(-(((~((i376 & i361) | (i376 ^ i361))) | i375) * 516));
                                                            int i378 = -(-((i374 ^ i377) + ((i377 & i374) << 1)));
                                                            int i379 = (i3 ^ i378) + ((i378 & i3) << 1);
                                                            int i380 = i379 << 13;
                                                            int i381 = (i380 | i379) & (~(i379 & i380));
                                                            int i382 = i381 ^ (i381 >>> 17);
                                                            int i383 = i382 << 5;
                                                            return objArr75;
                                                        }
                                                        java.lang.Object[] objArr76 = new java.lang.Object[1];
                                                        b((char) 57507, 23, 372, objArr76);
                                                        java.lang.Object[] objArr77 = {(java.lang.String) objArr76[0]};
                                                        java.lang.Object objEZpvd16 = YY.EZpvd(1845277648);
                                                        if (objEZpvd16 == null) {
                                                            byte b29 = (byte) 1;
                                                            byte b30 = (byte) (b29 + 2);
                                                            java.lang.Object[] objArr78 = new java.lang.Object[1];
                                                            a(b29, b30, (byte) (b30 - 2), objArr78);
                                                            objEZpvd16 = YY.EZpvd(531, 5, (char) 0, 1776058028, false, (java.lang.String) objArr78[0], new java.lang.Class[]{java.lang.String.class});
                                                        }
                                                        java.lang.Object objInvoke2 = ((java.lang.reflect.Method) objEZpvd16).invoke(null, objArr77);
                                                        if (objInvoke2 != null) {
                                                            java.lang.Object[] objArr79 = {objInvoke2, 42};
                                                            java.lang.Object objEZpvd17 = YY.EZpvd(1485637403);
                                                            if (objEZpvd17 == null) {
                                                                byte b31 = (byte) 3;
                                                                byte b32 = (byte) (b31 - 3);
                                                                java.lang.Object[] objArr80 = new java.lang.Object[1];
                                                                a(b31, b32, b32, objArr80);
                                                                objEZpvd17 = YY.EZpvd(398, 5, (char) 0, 1554893415, false, (java.lang.String) objArr80[0], new java.lang.Class[]{java.lang.String.class, java.lang.Integer.TYPE});
                                                            }
                                                            long jLongValue9 = ((java.lang.Long) ((java.lang.reflect.Method) objEZpvd17).invoke(null, objArr79)).longValue();
                                                            long j54 = 580735493;
                                                            long j55 = -721;
                                                            long j56 = j54 ^ j19;
                                                            long j57 = jLongValue9 ^ j19;
                                                            long j58 = (j54 | jLongValue9) ^ j19;
                                                            long j59 = (j55 * j54) + (j55 * jLongValue9) + (((long) 1444) * (j22 | ((j56 | j57) ^ j19) | j58)) + (((long) (-1444)) * (j58 | ((j54 | j) ^ j19) | ((jLongValue9 | j) ^ j19))) + (((long) 722) * (((j56 | jLongValue9) ^ j19) | ((j57 | j54) ^ j19))) + ((long) 747218037);
                                                            int iElapsedRealtime2 = (int) android.os.SystemClock.elapsedRealtime();
                                                            int i384 = ~iElapsedRealtime2;
                                                            int i385 = ((int) (j59 >> 32)) & ((-1453938172) + (((-513133824) | (~((-1950360235) | i384))) * 519) + (((~(i384 | (-335544491))) | (~((-177589334) | iElapsedRealtime2))) * (-519)) + (((~((-513133824) | iElapsedRealtime2)) | 1950360234) * 519));
                                                            int i386 = ~(((int) java.lang.Runtime.getRuntime().freeMemory()) | 899482434);
                                                            if (((((int) j59) & (((17104960 | i386) * (-196)) + 768052685 + ((i386 | 882377474) * CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA256))) | i385) == 1986687685) {
                                                                i19 = i35;
                                                                j2 = j50;
                                                                str8 = str7;
                                                                i20 = 1;
                                                                c2 = 0;
                                                                i18 = -1;
                                                            }
                                                            java.lang.Object[] objArr81 = new java.lang.Object[i20];
                                                            b((char) 27255, 16, 698, objArr81);
                                                            java.lang.Object[] objArr82 = {(java.lang.String) objArr81[c2]};
                                                            objEZpvd = YY.EZpvd(1845277648);
                                                            if (objEZpvd == null) {
                                                                byte b33 = (byte) 1;
                                                                byte b34 = (byte) (b33 + 2);
                                                                java.lang.Object[] objArr83 = new java.lang.Object[1];
                                                                a(b33, b34, (byte) (b34 - 2), objArr83);
                                                                objEZpvd = YY.EZpvd(531, 5, (char) 0, 1776058028, false, (java.lang.String) objArr83[0], new java.lang.Class[]{java.lang.String.class});
                                                            }
                                                            objInvoke = ((java.lang.reflect.Method) objEZpvd).invoke(null, objArr82);
                                                            if (objInvoke != null) {
                                                                i22 = 0;
                                                            } else {
                                                                java.lang.Object[] objArr84 = {objInvoke, 42};
                                                                java.lang.Object objEZpvd18 = YY.EZpvd(1485637403);
                                                                if (objEZpvd18 == null) {
                                                                    byte b35 = (byte) 3;
                                                                    byte b36 = (byte) (b35 - 3);
                                                                    java.lang.Object[] objArr85 = new java.lang.Object[1];
                                                                    a(b35, b36, b36, objArr85);
                                                                    objEZpvd18 = YY.EZpvd(398, 5, (char) 0, 1554893415, false, (java.lang.String) objArr85[0], new java.lang.Class[]{java.lang.String.class, java.lang.Integer.TYPE});
                                                                }
                                                                long jLongValue10 = ((java.lang.Long) ((java.lang.reflect.Method) objEZpvd18).invoke(null, objArr84)).longValue();
                                                                int i387 = EZpvd;
                                                                int i388 = ((i387 | 63) << 1) - (i387 ^ 63);
                                                                copydefault = i388 % 128;
                                                                int i389 = i388 % 2;
                                                                long j60 = 401259320;
                                                                long j61 = (((long) (-665)) * j60) + (((long) 334) * jLongValue10);
                                                                long j62 = j60 ^ j19;
                                                                long j63 = 333;
                                                                long jElapsedRealtime = (int) android.os.SystemClock.elapsedRealtime();
                                                                long j64 = jElapsedRealtime ^ j19;
                                                                long j65 = j61 + (((long) (-333)) * j62) + ((((j62 | j64) ^ j19) | ((jLongValue10 | jElapsedRealtime) ^ j19)) * j63) + (j63 * (((jElapsedRealtime | j62) ^ j19) | ((j64 | jLongValue10) ^ j19))) + ((long) 926694210);
                                                                int i390 = ((int) (j65 >> 32)) & ((((~(808142387 | i19)) | 1241588242) * 398) + 698174090 + (((~(808142387 | i13)) | 1241588242) * 398));
                                                                int i391 = ((int) j65) & (31517542 + (((~(608373841 | i13)) | 828852568) * (-983)) + (((~(828852568 | i13)) | 67109889) * 983));
                                                            }
                                                            if (i22 != 1986687685 || i22 == -1514516938) {
                                                                i23 = i3;
                                                                i24 = i19;
                                                                i25 = i13;
                                                            } else {
                                                                java.lang.Object[] objArr86 = new java.lang.Object[1];
                                                                b((char) 62234, 14, 1413, objArr86);
                                                                java.lang.String str31 = (java.lang.String) objArr86[0];
                                                                java.lang.Object[] objArr87 = new java.lang.Object[1];
                                                                b((char) 0, 26, 1427, objArr87);
                                                                java.lang.String str32 = (java.lang.String) objArr87[0];
                                                                java.lang.Object[] objArr88 = new java.lang.Object[1];
                                                                b((char) 43797, 17, 1453, objArr88);
                                                                java.lang.String str33 = (java.lang.String) objArr88[0];
                                                                java.lang.Object[] objArr89 = new java.lang.Object[1];
                                                                b((char) 17964, 17, 1470, objArr89);
                                                                java.lang.String str34 = (java.lang.String) objArr89[0];
                                                                java.lang.Object[] objArr90 = new java.lang.Object[1];
                                                                b((char) 2601, 15, 1487, objArr90);
                                                                java.lang.String str35 = (java.lang.String) objArr90[0];
                                                                java.lang.Object[] objArr91 = new java.lang.Object[1];
                                                                b((char) 0, 37, 1502, objArr91);
                                                                java.lang.String str36 = (java.lang.String) objArr91[0];
                                                                java.lang.Object[] objArr92 = new java.lang.Object[1];
                                                                b((char) 27300, 12, 1539, objArr92);
                                                                java.lang.String str37 = (java.lang.String) objArr92[0];
                                                                java.lang.Object[] objArr93 = new java.lang.Object[1];
                                                                b((char) 0, 13, 1551, objArr93);
                                                                java.lang.String str38 = (java.lang.String) objArr93[0];
                                                                java.lang.Object[] objArr94 = new java.lang.Object[1];
                                                                b((char) 14475, 22, 1564, objArr94);
                                                                java.lang.String str39 = (java.lang.String) objArr94[0];
                                                                java.lang.Object[] objArr95 = new java.lang.Object[1];
                                                                b((char) 0, 31, 1586, objArr95);
                                                                java.lang.String str40 = (java.lang.String) objArr95[0];
                                                                java.lang.Object[] objArr96 = new java.lang.Object[1];
                                                                b((char) 0, 12, 1617, objArr96);
                                                                java.lang.String str41 = (java.lang.String) objArr96[0];
                                                                java.lang.Object[] objArr97 = new java.lang.Object[1];
                                                                b((char) 0, 12, 1629, objArr97);
                                                                java.lang.String str42 = (java.lang.String) objArr97[0];
                                                                java.lang.Object[] objArr98 = new java.lang.Object[1];
                                                                b((char) 0, 12, 1641, objArr98);
                                                                java.lang.String str43 = (java.lang.String) objArr98[0];
                                                                java.lang.Object[] objArr99 = new java.lang.Object[1];
                                                                b((char) 0, 12, 1653, objArr99);
                                                                java.lang.String str44 = (java.lang.String) objArr99[0];
                                                                java.lang.Object[] objArr100 = new java.lang.Object[1];
                                                                b((char) 0, 12, 1665, objArr100);
                                                                java.lang.String str45 = (java.lang.String) objArr100[0];
                                                                java.lang.Object[] objArr101 = new java.lang.Object[1];
                                                                b((char) 0, 14, 1677, objArr101);
                                                                java.lang.String str46 = (java.lang.String) objArr101[0];
                                                                java.lang.Object[] objArr102 = new java.lang.Object[1];
                                                                b((char) 0, 12, 1691, objArr102);
                                                                java.lang.String str47 = (java.lang.String) objArr102[0];
                                                                java.lang.Object[] objArr103 = new java.lang.Object[1];
                                                                b((char) 48352, 24, 1703, objArr103);
                                                                java.lang.String str48 = (java.lang.String) objArr103[0];
                                                                java.lang.Object[] objArr104 = new java.lang.Object[1];
                                                                b((char) 34582, 28, 1727, objArr104);
                                                                java.lang.String[] strArr7 = {str31, str32, str33, str34, str35, str36, str37, str38, str39, str40, str41, str42, str43, str44, str45, str46, str47, str48, (java.lang.String) objArr104[0]};
                                                                int i392 = 19;
                                                                int i393 = 0;
                                                                while (true) {
                                                                    if (i393 >= i392) {
                                                                        i24 = i19;
                                                                        i25 = i13;
                                                                        i393 = i18;
                                                                        break;
                                                                    }
                                                                    java.lang.String str49 = strArr7[i393];
                                                                    java.lang.Object[] objArr105 = {str49};
                                                                    java.lang.Object objEZpvd19 = YY.EZpvd(1229107605);
                                                                    if (objEZpvd19 == null) {
                                                                        byte b37 = (byte) 3;
                                                                        byte b38 = (byte) (b37 - 3);
                                                                        java.lang.Object[] objArr106 = new java.lang.Object[1];
                                                                        a(b37, b38, b38, objArr106);
                                                                        objEZpvd19 = YY.EZpvd(FrameMetricsAggregator.EVERY_DURATION, 5, (char) 43308, 1298300137, false, (java.lang.String) objArr106[0], new java.lang.Class[]{java.lang.String.class});
                                                                    }
                                                                    long jLongValue11 = ((java.lang.Long) ((java.lang.reflect.Method) objEZpvd19).invoke(null, objArr105)).longValue();
                                                                    long j66 = 1631967337;
                                                                    long j67 = -375;
                                                                    long j68 = (j67 * j66) + (j67 * jLongValue11);
                                                                    long j69 = 376;
                                                                    long j70 = j66 ^ j19;
                                                                    long j71 = (j66 | jLongValue11) ^ j19;
                                                                    i25 = i13;
                                                                    long j72 = j68 + ((j | ((j70 | (jLongValue11 ^ j19)) ^ j19) | j71) * j69) + (((long) (-376)) * (((j22 | j66) ^ j19) | j71)) + (j69 * (((j70 | j) ^ j19) | jLongValue11)) + ((long) 395866949);
                                                                    int i394 = ~((int) java.lang.Runtime.getRuntime().totalMemory());
                                                                    int i395 = ~(1476902133 | i394);
                                                                    int i396 = ((int) (j72 >> 32)) & (709019774 + (((-39675723) | i395) * 764) + (((~(i394 | (-39675723))) | 336960) * (-1528)) + (((-1515903936) | i395) * 764));
                                                                    int i397 = ((int) j72) & (19131917 + ((i19 | 553680913) * 988) + (((~(i25 | 1669365873)) | 72690052) * (-1976)) + ((553680913 | (~((-1188375013) | i19)) | (~(i25 | 1188375012))) * 988));
                                                                    if (((i397 & i396) | (i396 ^ i397)) != 0) {
                                                                        i24 = i19;
                                                                        break;
                                                                    }
                                                                    java.lang.Object[] objArr107 = new java.lang.Object[1];
                                                                    b((char) 0, 14, 1677, objArr107);
                                                                    if (str49.equals((java.lang.String) objArr107[0])) {
                                                                        int i398 = copydefault + 125;
                                                                        EZpvd = i398 % 128;
                                                                        if (i398 % 2 != 0) {
                                                                            java.lang.Object[] objArr108 = {str49};
                                                                            java.lang.Object objEZpvd20 = YY.EZpvd(1704729038);
                                                                            if (objEZpvd20 == null) {
                                                                                byte b39 = (byte) 1;
                                                                                byte b40 = (byte) (b39 + 2);
                                                                                java.lang.Object[] objArr109 = new java.lang.Object[1];
                                                                                a(b39, b40, (byte) (b40 - 2), objArr109);
                                                                                objEZpvd20 = YY.EZpvd(FrameMetricsAggregator.EVERY_DURATION, 5, (char) 43308, 1639765170, false, (java.lang.String) objArr109[0], new java.lang.Class[]{java.lang.String.class});
                                                                            }
                                                                            long jLongValue12 = ((java.lang.Long) ((java.lang.reflect.Method) objEZpvd20).invoke(null, objArr108)).longValue();
                                                                            long j73 = 1337287162;
                                                                            long j74 = -574;
                                                                            long j75 = j73 ^ j19;
                                                                            long jElapsedRealtime2 = (int) android.os.SystemClock.elapsedRealtime();
                                                                            long j76 = jElapsedRealtime2 ^ j19;
                                                                            long j77 = ((jLongValue12 ^ j19) | jElapsedRealtime2) ^ j19;
                                                                            long j78 = (j74 * j73) + (j74 * jLongValue12) + (((long) 1150) * (((j75 | j76) ^ j19) | j77)) + (((long) (-575)) * (j77 | ((j76 | jLongValue12) ^ j19))) + (((long) 575) * (((j75 | jElapsedRealtime2) ^ j19) | ((j76 | j73) ^ j19))) + ((long) (-1502883889));
                                                                            i24 = i;
                                                                            int i399 = ((int) (j78 << 88)) & ((-2036665422) + ((i24 | 301995264) * 988) + (((~(i25 | 332444980)) | 1074331714) * (-1976)) + ((301995264 | (~((-1104781431) | i24)) | (~(i25 | 1104781430))) * 988));
                                                                            int i400 = ~((int) android.os.Process.getStartElapsedRealtime());
                                                                            int i401 = ~(1869586182 | i400);
                                                                            int i402 = ((int) j78) & ((-1369390923) + ((988154703 | i401) * 764) + (((~(i400 | 988154703)) | 1158255616) * (-1528)) + ((1435079753 | i401) * 764));
                                                                            if (((i402 & i399) | (i399 ^ i402)) != 0) {
                                                                                break;
                                                                            }
                                                                        } else {
                                                                            i24 = i19;
                                                                            java.lang.Object[] objArr110 = {str49};
                                                                            java.lang.Object objEZpvd21 = YY.EZpvd(1704729038);
                                                                            if (objEZpvd21 == null) {
                                                                                byte b41 = (byte) 1;
                                                                                byte b42 = (byte) (b41 + 2);
                                                                                java.lang.Object[] objArr111 = new java.lang.Object[1];
                                                                                a(b41, b42, (byte) (b42 - 2), objArr111);
                                                                                objEZpvd21 = YY.EZpvd(FrameMetricsAggregator.EVERY_DURATION, 5, (char) 43308, 1639765170, false, (java.lang.String) objArr111[0], new java.lang.Class[]{java.lang.String.class});
                                                                            }
                                                                            long jLongValue13 = ((java.lang.Long) ((java.lang.reflect.Method) objEZpvd21).invoke(null, objArr110)).longValue();
                                                                            long j79 = 208701613;
                                                                            long j80 = j79 ^ j19;
                                                                            long jNextInt = new java.util.Random().nextInt();
                                                                            long j81 = (((long) 284) * j79) + (((long) (-282)) * jLongValue13) + (((long) (-283)) * (((j80 | jLongValue13) ^ j19) | ((j80 | jNextInt) ^ j19)));
                                                                            long j82 = 283;
                                                                            long j83 = jLongValue13 ^ j19;
                                                                            long j84 = j81 + (((j83 | j79) ^ j19) * j82) + (j82 * (((j80 | j83) | jNextInt) ^ j19)) + ((long) (-374298340));
                                                                            int iNextInt = new java.util.Random().nextInt(1981281358);
                                                                            int i403 = ~iNextInt;
                                                                            int i404 = ((int) (j84 >> 32)) & (2095972266 + (((~(166639509 | i403)) | 1270586901) * (-328)) + ((1270586901 | iNextInt) * CipherSuite.TLS_DH_DSS_WITH_AES_128_GCM_SHA256) + (((~(iNextInt | (-166639510))) | 162174485 | (~(i403 | 1275051925))) * CipherSuite.TLS_DH_DSS_WITH_AES_128_GCM_SHA256));
                                                                            int iElapsedRealtime3 = (int) android.os.SystemClock.elapsedRealtime();
                                                                            int i405 = ~iElapsedRealtime3;
                                                                            int i406 = ((int) j84) & ((-1416138351) + (((-287916106) | iElapsedRealtime3) * (-676)) + (((~(1825979910 | i405)) | 287916105) * 676) + (((~(iElapsedRealtime3 | 2113896015)) | (~(i405 | (-1031760976))) | 743844870) * 676));
                                                                            if (((i404 & i406) | (i404 ^ i406)) != 0) {
                                                                                break;
                                                                            }
                                                                        }
                                                                    } else {
                                                                        i24 = i19;
                                                                    }
                                                                    i393 = (i393 & 1) + (i393 | 1);
                                                                    i19 = i24;
                                                                    i13 = i25;
                                                                    i392 = 19;
                                                                }
                                                                if (i393 >= 0) {
                                                                    int i407 = 81640 + (i393 * 628);
                                                                    int i408 = ((i393 ^ i24) | (i393 & i24) | (-131)) * (-627);
                                                                    int i409 = (i407 & i408) + (i408 | i407);
                                                                    int i410 = ~i393;
                                                                    int i411 = ~((i410 & i24) | (i410 ^ i24));
                                                                    int i412 = ((i411 & 130) | (i411 ^ 130)) * (-627);
                                                                    int i413 = ((i409 | i412) << 1) - (i412 ^ i409);
                                                                    int i414 = ~((i25 ^ i393) | (i25 & i393));
                                                                    int i415 = ~(i24 | 130);
                                                                    int i416 = i413 + (((i414 & i415) | (i414 ^ i415)) * 627);
                                                                    int i417 = (~(i24 & i416)) & (i416 | i24);
                                                                    if (i417 != i24) {
                                                                        java.lang.Object[] objArr112 = {new int[1], null, new int[]{i24}, new int[]{i417}, null};
                                                                        int iNextInt2 = new java.util.Random().nextInt();
                                                                        int i418 = 1832882762 + (((~((~iNextInt2) | (-591793722))) | 683080818) * (-235)) + (((~((-591793722) | iNextInt2)) | 683080818) * (-470)) + (((~(iNextInt2 | (-54526474))) | 145813570) * 235) + 16;
                                                                        int i419 = (i418 * (-958)) + (i3 * (-958));
                                                                        int i420 = ~i3;
                                                                        int i421 = ~(i420 | i25);
                                                                        int i422 = ~i418;
                                                                        int i423 = ~((i422 ^ i24) | (i422 & i24));
                                                                        int i424 = (i421 & i423) | (i421 ^ i423);
                                                                        int i425 = ~(i25 | i418);
                                                                        int i426 = -(-(((i424 & i425) | (i424 ^ i425)) * 959));
                                                                        int i427 = ((i419 | i426) << 1) - (i419 ^ i426);
                                                                        int i428 = (~(i418 | i3)) * (-959);
                                                                        int i429 = ((i427 | i428) << 1) - (i428 ^ i427);
                                                                        int i430 = ~i24;
                                                                        int i431 = ~((i430 & i422) | (i422 ^ i430));
                                                                        int i432 = ~((i420 & i24) | (i420 ^ i24));
                                                                        int i433 = (i431 & i432) | (i431 ^ i432);
                                                                        int i434 = ~((i418 ^ i24) | (i418 & i24));
                                                                        int i435 = -(-(((i433 & i434) | (i433 ^ i434)) * 959));
                                                                        int i436 = (i429 & i435) + (i435 | i429);
                                                                        int i437 = i436 << 13;
                                                                        int i438 = (i437 & (~i436)) | ((~i437) & i436);
                                                                        int i439 = i438 >>> 17;
                                                                        int i440 = ((~i438) & i439) | ((~i439) & i438);
                                                                        int i441 = i440 << 5;
                                                                        ((int[]) objArr112[0])[0] = ((~i440) & i441) | ((~i441) & i440);
                                                                        return objArr112;
                                                                    }
                                                                }
                                                                i23 = i3;
                                                            }
                                                            c3 = 0;
                                                            java.lang.Object[] objArr113 = new java.lang.Object[1];
                                                            b((char) 37727, 13, 1755, objArr113);
                                                            java.lang.String str50 = (java.lang.String) objArr113[0];
                                                            java.lang.Object[] objArr114 = new java.lang.Object[1];
                                                            b((char) 21675, 5, 1768, objArr114);
                                                            java.lang.String[] strArr8 = {str50, (java.lang.String) objArr114[0]};
                                                            java.lang.Object[] objArr115 = new java.lang.Object[1];
                                                            b((char) 0, 15, 1773, objArr115);
                                                            java.lang.String str51 = (java.lang.String) objArr115[0];
                                                            java.lang.Object[] objArr116 = new java.lang.Object[1];
                                                            b((char) 24924, 19, 1788, objArr116);
                                                            java.lang.String str52 = (java.lang.String) objArr116[0];
                                                            java.lang.Object[] objArr117 = new java.lang.Object[1];
                                                            b((char) 0, 14, 1807, objArr117);
                                                            java.lang.String[] strArr9 = {str51, str52, (java.lang.String) objArr117[0]};
                                                            java.lang.Object[] objArr118 = new java.lang.Object[1];
                                                            b((char) 0, 21, 1821, objArr118);
                                                            java.lang.String str53 = (java.lang.String) objArr118[0];
                                                            java.lang.Object[] objArr119 = new java.lang.Object[1];
                                                            b((char) 46282, 10, 1842, objArr119);
                                                            java.lang.String[] strArr10 = {str53, (java.lang.String) objArr119[0]};
                                                            java.lang.Object[] objArr120 = new java.lang.Object[1];
                                                            b((char) 0, 11, 1852, objArr120);
                                                            java.lang.String str54 = (java.lang.String) objArr120[0];
                                                            java.lang.Object[] objArr121 = new java.lang.Object[1];
                                                            b((char) 20557, 6, 589, objArr121);
                                                            java.lang.String[] strArr11 = {str54, (java.lang.String) objArr121[0]};
                                                            java.lang.Object[] objArr122 = new java.lang.Object[1];
                                                            b((char) 0, 28, 1863, objArr122);
                                                            java.lang.String str55 = (java.lang.String) objArr122[0];
                                                            java.lang.Object[] objArr123 = new java.lang.Object[1];
                                                            b((char) 46282, 10, 1842, objArr123);
                                                            java.lang.String[][] strArr12 = {strArr8, strArr9, strArr10, strArr11, new java.lang.String[]{str55, (java.lang.String) objArr123[0]}};
                                                            i26 = 0;
                                                            int i442 = i18;
                                                            loop5: while (true) {
                                                                if (i26 < 5) {
                                                                    str10 = str8;
                                                                    i27 = 1;
                                                                    i28 = i24;
                                                                    break;
                                                                }
                                                                java.lang.String[] strArr13 = strArr12[i26];
                                                                java.lang.String str56 = strArr13[c3];
                                                                java.lang.String[] strArr14 = (java.lang.String[]) java.util.Arrays.copyOfRange(strArr13, 1, strArr13.length);
                                                                int length = strArr14.length;
                                                                int i443 = 0;
                                                                while (i443 < length) {
                                                                    java.lang.String str57 = strArr14[i443];
                                                                    int i444 = (i442 & (-2)) + (i442 | (-2));
                                                                    i442 = ((i444 | 3) << 1) - (i444 ^ 3);
                                                                    java.io.File file4 = new java.io.File(str56);
                                                                    if (file4.exists() && file4.isFile()) {
                                                                        try {
                                                                            Scanner scanner = new Scanner(new java.io.FileInputStream(file4));
                                                                            str10 = str8;
                                                                            try {
                                                                                Scanner scannerUseDelimiter4 = scanner.useDelimiter(str10);
                                                                                java.lang.String next4 = scannerUseDelimiter4.hasNext() ? scannerUseDelimiter4.next() : "";
                                                                                scannerUseDelimiter4.close();
                                                                                if (next4.contains(str57)) {
                                                                                    int iKWHzl5 = C50988veY.KWHzl();
                                                                                    int i445 = i442 * 829;
                                                                                    int i446 = (140930 ^ i445) + ((i445 & 140930) << 1);
                                                                                    int i447 = ~i442;
                                                                                    int i448 = ~((i447 & (-171)) | ((-171) ^ i447));
                                                                                    int i449 = ~iKWHzl5;
                                                                                    int i450 = (i449 & CipherSuite.TLS_DHE_PSK_WITH_AES_128_GCM_SHA256) | (i449 ^ CipherSuite.TLS_DHE_PSK_WITH_AES_128_GCM_SHA256);
                                                                                    int i451 = (i448 | (~((i450 & i442) | (i450 ^ i442)))) * (-828);
                                                                                    int i452 = (i446 ^ i451) + ((i451 & i446) << 1);
                                                                                    int i453 = (i442 ^ CipherSuite.TLS_DHE_PSK_WITH_AES_128_GCM_SHA256) | (i442 & CipherSuite.TLS_DHE_PSK_WITH_AES_128_GCM_SHA256);
                                                                                    int i454 = ~iKWHzl5;
                                                                                    int i455 = ((i454 & i453) | (i453 ^ i454)) * (-828);
                                                                                    int i456 = (i452 ^ i455) + ((i455 & i452) << 1) + ((~i453) * 828);
                                                                                    i28 = (~(i24 & i456)) & (i24 | i456);
                                                                                    i27 = 1;
                                                                                    break loop5;
                                                                                }
                                                                            } catch (java.io.IOException unused6) {
                                                                                continue;
                                                                            }
                                                                        } catch (java.io.IOException unused7) {
                                                                            str10 = str8;
                                                                        }
                                                                    } else {
                                                                        str10 = str8;
                                                                    }
                                                                    i443++;
                                                                    str8 = str10;
                                                                }
                                                                i26 = ((i26 | 1) << 1) - (i26 ^ 1);
                                                                c3 = 0;
                                                            }
                                                            if (i28 == i24) {
                                                                java.lang.Object[] objArr124 = new java.lang.Object[5];
                                                                int[] iArr3 = new int[i27];
                                                                objArr124[0] = iArr3;
                                                                int[] iArr4 = new int[i27];
                                                                objArr124[2] = iArr4;
                                                                int[] iArr5 = new int[i27];
                                                                objArr124[3] = iArr5;
                                                                iArr4[0] = i24;
                                                                iArr5[0] = i28;
                                                                objArr124[i27] = null;
                                                                objArr124[4] = null;
                                                                int i457 = 561106369 + ((737342027 | i24) * 614) + (((~((-815230075) | i25)) | 546463818 | (~(i25 | 459644465))) * (-1228)) + (((~((-268766257) | i25)) | (~(i25 | 1006108283))) * 614);
                                                                int i458 = (13759 - (~(-(-(i457 * (-858)))))) + (((i24 ^ 16) | (i24 & 16)) * (-859));
                                                                int i459 = ~((i25 ^ 16) | (i25 & 16));
                                                                int i460 = ~i457;
                                                                int i461 = ~(((-17) & i460) | ((-17) ^ i460) | i24);
                                                                int i462 = ((i459 & i461) | (i459 ^ i461)) * 859;
                                                                int i463 = (i458 ^ i462) + ((i458 & i462) << 1);
                                                                int i464 = ~i457;
                                                                int i465 = ~i24;
                                                                int i466 = ~((i464 & i465) | (i464 ^ i465));
                                                                int i467 = ~((i460 ^ 16) | (16 & i460));
                                                                int i468 = -(-(((i466 & i467) | (i466 ^ i467)) * 859));
                                                                int i469 = -(-(((i463 | i468) << 1) - (i468 ^ i463)));
                                                                int i470 = (i23 & i469) + (i469 | i23);
                                                                int i471 = i470 << 13;
                                                                int i472 = (i471 | i470) & (~(i470 & i471));
                                                                int i473 = i472 ^ (i472 >>> 17);
                                                                iArr3[0] = i473 ^ (i473 << 5);
                                                                return objArr124;
                                                            }
                                                            int i474 = i27;
                                                            try {
                                                                java.lang.Object[] objArr125 = new java.lang.Object[i474];
                                                                b((char) 35410, 13, 1891, objArr125);
                                                                java.lang.String str58 = (java.lang.String) objArr125[0];
                                                                java.lang.Object[] objArr126 = new java.lang.Object[i474];
                                                                b((char) 56152, 8, 1904, objArr126);
                                                                java.lang.String str59 = (java.lang.String) objArr126[0];
                                                                java.io.File file5 = new java.io.File(str58);
                                                                if (file5.exists() && file5.isFile()) {
                                                                    try {
                                                                        Scanner scannerUseDelimiter5 = new Scanner(new java.io.FileInputStream(file5)).useDelimiter(str10);
                                                                        java.lang.String next5 = scannerUseDelimiter5.hasNext() ? scannerUseDelimiter5.next() : "";
                                                                        scannerUseDelimiter5.close();
                                                                        if (next5.contains(str59)) {
                                                                            i29 = i24 ^ 150;
                                                                        }
                                                                    } catch (java.io.IOException unused8) {
                                                                    }
                                                                } else {
                                                                    i29 = i24;
                                                                }
                                                            } catch (java.lang.Exception unused9) {
                                                                i29 = (~(i24 & CipherSuite.TLS_DH_DSS_WITH_SEED_CBC_SHA)) & (i24 | CipherSuite.TLS_DH_DSS_WITH_SEED_CBC_SHA);
                                                            }
                                                            if (i29 != i24) {
                                                                java.lang.Object[] objArr127 = {new int[]{(i | i) & (~(i & i))}, null, new int[]{i24}, new int[]{i29}, null};
                                                                int i475 = EZpvd;
                                                                int i476 = (i475 & 25) + (i475 | 25);
                                                                copydefault = i476 % 128;
                                                                int i477 = i476 % 2;
                                                                int i478 = (-343613887) + (((~(i24 | 858067786)) | 416806753) * 191) + (((~(i25 | 858067786)) | 148038689) * 191);
                                                                int i479 = (-13008) + (i478 * 408);
                                                                int i480 = ~((~i478) | 16);
                                                                int i481 = (i24 ^ 16) | (i24 & 16);
                                                                int i482 = ~i481;
                                                                int i483 = -(-(((i480 & i482) | (i480 ^ i482)) * (-814)));
                                                                int i484 = (i479 ^ i483) + ((i483 & i479) << 1);
                                                                int i485 = ~i478;
                                                                int i486 = ~i24;
                                                                int i487 = ~((i485 & i486) | (i485 ^ i486));
                                                                int i488 = ~(((-17) ^ i478) | ((-17) & i478));
                                                                int i489 = (i487 & i488) | (i487 ^ i488);
                                                                int i490 = ~i481;
                                                                int i491 = i484 + (((i489 & i490) | (i489 ^ i490)) * 407);
                                                                int i492 = (~((-17) | i24)) | (~(((-17) ^ i478) | ((-17) & i478)));
                                                                int i493 = ~((i478 ^ i24) | (i478 & i24));
                                                                int i494 = ((i492 & i493) | (i492 ^ i493)) * 407;
                                                                int i495 = ((i491 | i494) << 1) - (i494 ^ i491);
                                                                int i496 = ((i23 | i495) << 1) - (i23 ^ i495);
                                                                int i497 = i496 << 13;
                                                                int i498 = ((~i496) & i497) | ((~i497) & i496);
                                                                int i499 = i498 >>> 17;
                                                                int i500 = (i498 | i499) & (~(i498 & i499));
                                                                int i501 = i500 << 5;
                                                                return objArr127;
                                                            }
                                                            java.lang.Object[] objArr128 = new java.lang.Object[1];
                                                            b((char) 0, 47, 1912, objArr128);
                                                            java.lang.Object[] objArr129 = {(java.lang.String) objArr128[0]};
                                                            java.lang.Object objEZpvd22 = YY.EZpvd(1229107605);
                                                            if (objEZpvd22 == null) {
                                                                byte b43 = (byte) 3;
                                                                byte b44 = (byte) (b43 - 3);
                                                                java.lang.Object[] objArr130 = new java.lang.Object[1];
                                                                a(b43, b44, b44, objArr130);
                                                                objEZpvd22 = YY.EZpvd(FrameMetricsAggregator.EVERY_DURATION, 5, (char) 43308, 1298300137, false, (java.lang.String) objArr130[0], new java.lang.Class[]{java.lang.String.class});
                                                            }
                                                            long jLongValue14 = ((java.lang.Long) ((java.lang.reflect.Method) objEZpvd22).invoke(null, objArr129)).longValue();
                                                            int i502 = EZpvd;
                                                            int i503 = ((i502 | 73) << 1) - (i502 ^ 73);
                                                            copydefault = i503 % 128;
                                                            if (i503 % 2 == 0) {
                                                                long j85 = 2018154581;
                                                                long j86 = j85 ^ j19;
                                                                long j87 = 191;
                                                                long jMyUid = android.os.Process.myUid();
                                                                j3 = (j2 * j85) + (((long) 192) * jLongValue14) + (((long) (-191)) * j86) + ((j85 | ((jLongValue14 | jMyUid) ^ j19)) * j87) + (j87 * ((((jMyUid ^ j19) | jLongValue14) ^ j19) | ((j86 | jLongValue14) ^ j19))) + ((long) 9679705);
                                                                i30 = (int) (j3 << 85);
                                                                int iNextInt3 = new java.util.Random().nextInt();
                                                                int i504 = ~(2119376988 | iNextInt3);
                                                                i31 = 83832868 + (((-2130438910) | i504) * (-814)) + ((i504 | (~((~iNextInt3) | 682150577)) | 671088656) * 407) + (((~(iNextInt3 | (-682150578))) | (~((-2119376989) | iNextInt3)) | 671088656) * 407);
                                                            } else {
                                                                long j88 = 943076306;
                                                                long j89 = -743;
                                                                long j90 = j88 | jLongValue14;
                                                                long jMyUid2 = android.os.Process.myUid();
                                                                long j91 = 744;
                                                                j3 = (j89 * j88) + (j89 * jLongValue14) + (((long) (-744)) * ((j90 ^ j19) | ((j88 | jMyUid2) ^ j19) | ((jLongValue14 | jMyUid2) ^ j19))) + (((((j88 ^ j19) | (jLongValue14 ^ j19)) ^ j19) | (jMyUid2 ^ j19)) * j91) + (j91 * (j90 | jMyUid2)) + ((long) 1084757980);
                                                                i30 = (int) (j3 >> 32);
                                                                int iFreeMemory3 = (int) java.lang.Runtime.getRuntime().freeMemory();
                                                                int i505 = ~(1513461747 | iFreeMemory3);
                                                                int i506 = ~iFreeMemory3;
                                                                i31 = (-470940180) + ((i505 | (~((-134546835) | i506))) * 497) + (((~(iFreeMemory3 | (-134546835))) | (~(1478825971 | i506)) | 34635776) * 497);
                                                            }
                                                            int startElapsedRealtime3 = (int) android.os.Process.getStartElapsedRealtime();
                                                            int i507 = ((i30 & i31) | (((int) j3) & (2024945354 + ((~((-556089382) | startElapsedRealtime3)) * 623) + (((~startElapsedRealtime3) | 134218112) * (-623)) + (((~(startElapsedRealtime3 | (-929548840))) | (~(507677570 | startElapsedRealtime3)) | 556089381) * 623)))) * 263;
                                                            int i508 = (i507 | i24) & (~(i24 & i507));
                                                            if (i508 != i24) {
                                                                java.lang.Object[] objArr131 = {new int[1], null, new int[]{i24}, new int[]{i508}, null};
                                                                int iNextInt4 = new java.util.Random().nextInt();
                                                                int i509 = ~iNextInt4;
                                                                int i510 = ~(483340533 | i509);
                                                                int i511 = 1665295219 + ((589351170 | i510) * (-712)) + (((~(iNextInt4 | 1072691703)) | (~(i509 | (-589351171)))) * (-712)) + (((-791534007) | i510) * 712);
                                                                int i512 = i3 + (i511 ^ 16) + ((16 & i511) << 1);
                                                                int i513 = i512 << 13;
                                                                int i514 = (i512 | i513) & (~(i512 & i513));
                                                                int i515 = i514 >>> 17;
                                                                int i516 = ((~i514) & i515) | ((~i515) & i514);
                                                                int i517 = i516 << 5;
                                                                ((int[]) objArr131[0])[0] = ((~i516) & i517) | ((~i517) & i516);
                                                                return objArr131;
                                                            }
                                                            java.lang.Object[] objArr132 = new java.lang.Object[5];
                                                            objArr132[0] = new int[1];
                                                            int[] iArr6 = new int[1];
                                                            objArr132[2] = iArr6;
                                                            int i518 = EZpvd + 11;
                                                            int i519 = i518 % 128;
                                                            copydefault = i519;
                                                            if (i518 % 2 == 0) {
                                                                objArr132[3] = new int[1];
                                                            } else {
                                                                objArr132[3] = new int[1];
                                                            }
                                                            int i520 = ((i519 | 61) << 1) - (i519 ^ 61);
                                                            EZpvd = i520 % 128;
                                                            int i521 = i520 % 2;
                                                            iArr6[0] = i24;
                                                            ((int[]) objArr132[3])[0] = i24;
                                                            objArr132[1] = null;
                                                            objArr132[4] = null;
                                                            int i522 = ~android.os.Process.myTid();
                                                            int i523 = i3 + 719830538 + (((~((-1018654823) | i522)) | (-256219718)) * (-983)) + (((~(i522 | (-256219718))) | 54561281) * 983);
                                                            int i524 = i523 << 13;
                                                            int i525 = (i523 | i524) & (~(i523 & i524));
                                                            int i526 = i525 >>> 17;
                                                            int i527 = (i525 | i526) & (~(i525 & i526));
                                                            int i528 = copydefault + 93;
                                                            EZpvd = i528 % 128;
                                                            int i529 = i528 % 2;
                                                            ((int[]) objArr132[0])[0] = i527 ^ (i527 << 5);
                                                            return objArr132;
                                                        }
                                                        java.lang.Object[] objArr133 = new java.lang.Object[1];
                                                        b((char) 57507, 23, 372, objArr133);
                                                        java.lang.String str60 = (java.lang.String) objArr133[0];
                                                        java.lang.Object[] objArr134 = new java.lang.Object[1];
                                                        b((char) 12971, 10, 617, objArr134);
                                                        java.lang.String str61 = (java.lang.String) objArr134[0];
                                                        java.lang.Object[] objArr135 = new java.lang.Object[1];
                                                        b((char) 0, 7, 627, objArr135);
                                                        java.lang.String str62 = (java.lang.String) objArr135[0];
                                                        java.lang.Object[] objArr136 = new java.lang.Object[1];
                                                        b((char) 45251, 8, 634, objArr136);
                                                        java.lang.Object[] objArr137 = new java.lang.Object[1];
                                                        b((char) 719, 17, 642, objArr137);
                                                        java.lang.Object[] objArr138 = new java.lang.Object[1];
                                                        b((char) 9380, 7, 659, objArr138);
                                                        java.lang.Object[] objArr139 = new java.lang.Object[1];
                                                        b((char) 0, 7, 666, objArr139);
                                                        int i530 = EZpvd;
                                                        int i531 = (i530 & 29) + (i530 | 29);
                                                        copydefault = i531 % 128;
                                                        int i532 = i531 % 2;
                                                        java.lang.Object[] objArr140 = new java.lang.Object[1];
                                                        b((char) 57938, 11, 673, objArr140);
                                                        java.lang.Object[] objArr141 = new java.lang.Object[1];
                                                        b((char) 0, 14, 684, objArr141);
                                                        java.lang.String[] strArr15 = {(java.lang.String) objArr137[0], (java.lang.String) objArr138[0], (java.lang.String) objArr139[0], (java.lang.String) objArr140[0], (java.lang.String) objArr141[0]};
                                                        java.lang.Object[] objArr142 = new java.lang.Object[1];
                                                        b((char) 27255, 16, 698, objArr142);
                                                        java.lang.String str63 = (java.lang.String) objArr142[0];
                                                        java.lang.Object[] objArr143 = new java.lang.Object[1];
                                                        b((char) 16338, 3, 714, objArr143);
                                                        java.lang.String str64 = (java.lang.String) objArr143[0];
                                                        java.lang.Object[] objArr144 = new java.lang.Object[1];
                                                        b((char) 0, 22, 725, objArr144);
                                                        java.lang.String str65 = (java.lang.String) objArr144[0];
                                                        java.lang.Object[] objArr145 = new java.lang.Object[1];
                                                        b((char) 0, 25, 747, objArr145);
                                                        java.lang.String str66 = (java.lang.String) objArr145[0];
                                                        java.lang.Object[] objArr146 = new java.lang.Object[1];
                                                        j2 = j50;
                                                        b((char) 30857, 28, 772, objArr146);
                                                        java.lang.String str67 = (java.lang.String) objArr146[0];
                                                        i18 = -1;
                                                        java.lang.Object[] objArr147 = new java.lang.Object[1];
                                                        b((char) 0, 11, 800, objArr147);
                                                        java.lang.String str68 = (java.lang.String) objArr147[0];
                                                        java.lang.Object[] objArr148 = new java.lang.Object[1];
                                                        b((char) 0, 8, 811, objArr148);
                                                        java.lang.String str69 = (java.lang.String) objArr148[0];
                                                        java.lang.Object[] objArr149 = new java.lang.Object[1];
                                                        b((char) 0, 6, 819, objArr149);
                                                        java.lang.String str70 = (java.lang.String) objArr149[0];
                                                        java.lang.Object[] objArr150 = new java.lang.Object[1];
                                                        b((char) 0, 6, 825, objArr150);
                                                        java.lang.Object[] objArr151 = new java.lang.Object[1];
                                                        b((char) 0, 16, 831, objArr151);
                                                        java.lang.String str71 = (java.lang.String) objArr151[0];
                                                        java.lang.Object[] objArr152 = new java.lang.Object[1];
                                                        b((char) 0, 7, 666, objArr152);
                                                        java.lang.String str72 = (java.lang.String) objArr152[0];
                                                        java.lang.Object[] objArr153 = new java.lang.Object[1];
                                                        b((char) 45251, 8, 634, objArr153);
                                                        java.lang.Object[] objArr154 = new java.lang.Object[1];
                                                        b((char) 0, 14, 847, objArr154);
                                                        java.lang.String str73 = (java.lang.String) objArr154[0];
                                                        java.lang.Object[] objArr155 = new java.lang.Object[1];
                                                        b((char) 0, 1, 861, objArr155);
                                                        java.lang.Object[] objArr156 = new java.lang.Object[1];
                                                        b((char) 49349, 9, 862, objArr156);
                                                        java.lang.String str74 = (java.lang.String) objArr156[0];
                                                        java.lang.Object[] objArr157 = new java.lang.Object[1];
                                                        b((char) 55883, 1, 871, objArr157);
                                                        java.lang.Object[] objArr158 = new java.lang.Object[1];
                                                        b((char) 0, 16, 872, objArr158);
                                                        java.lang.String str75 = (java.lang.String) objArr158[0];
                                                        java.lang.Object[] objArr159 = new java.lang.Object[1];
                                                        b((char) 16338, 3, 714, objArr159);
                                                        java.lang.String str76 = (java.lang.String) objArr159[0];
                                                        java.lang.Object[] objArr160 = new java.lang.Object[1];
                                                        b((char) 9380, 7, 659, objArr160);
                                                        java.lang.String str77 = (java.lang.String) objArr160[0];
                                                        java.lang.Object[] objArr161 = new java.lang.Object[1];
                                                        b((char) 0, 8, 888, objArr161);
                                                        java.lang.String str78 = (java.lang.String) objArr161[0];
                                                        java.lang.Object[] objArr162 = new java.lang.Object[1];
                                                        b((char) 57938, 11, 673, objArr162);
                                                        java.lang.String str79 = (java.lang.String) objArr162[0];
                                                        java.lang.Object[] objArr163 = new java.lang.Object[1];
                                                        b((char) 0, 14, 684, objArr163);
                                                        java.lang.Object[] objArr164 = new java.lang.Object[1];
                                                        b((char) 47355, 20, FaceDetector.NUM_BOXES, objArr164);
                                                        java.lang.String str80 = (java.lang.String) objArr164[0];
                                                        java.lang.Object[] objArr165 = new java.lang.Object[1];
                                                        b((char) 483, 19, 916, objArr165);
                                                        java.lang.String str81 = (java.lang.String) objArr165[0];
                                                        java.lang.Object[] objArr166 = new java.lang.Object[1];
                                                        b((char) 57194, 31, 935, objArr166);
                                                        java.lang.String str82 = (java.lang.String) objArr166[0];
                                                        java.lang.Object[] objArr167 = new java.lang.Object[1];
                                                        b((char) 5498, 26, 966, objArr167);
                                                        java.lang.String str83 = (java.lang.String) objArr167[0];
                                                        java.lang.Object[] objArr168 = new java.lang.Object[1];
                                                        b((char) 7318, 23, 992, objArr168);
                                                        java.lang.String str84 = (java.lang.String) objArr168[0];
                                                        java.lang.Object[] objArr169 = new java.lang.Object[1];
                                                        str8 = str7;
                                                        b((char) 62045, 33, 1015, objArr169);
                                                        java.lang.Object[] objArr170 = new java.lang.Object[1];
                                                        char c5 = 0;
                                                        b((char) 0, 13, 1048, objArr170);
                                                        java.lang.String str85 = (java.lang.String) objArr170[0];
                                                        java.lang.Object[] objArr171 = new java.lang.Object[1];
                                                        b((char) 0, 7, 627, objArr171);
                                                        java.lang.Object[] objArr172 = new java.lang.Object[1];
                                                        b((char) 0, 30, 1061, objArr172);
                                                        java.lang.String str86 = (java.lang.String) objArr172[0];
                                                        java.lang.Object[] objArr173 = new java.lang.Object[1];
                                                        b((char) 0, 11, 1091, objArr173);
                                                        java.lang.Object[] objArr174 = new java.lang.Object[1];
                                                        b((char) 0, 19, 1102, objArr174);
                                                        java.lang.String str87 = (java.lang.String) objArr174[0];
                                                        java.lang.Object[] objArr175 = new java.lang.Object[1];
                                                        b((char) 0, 5, 1121, objArr175);
                                                        java.lang.Object[] objArr176 = new java.lang.Object[1];
                                                        b((char) 4215, 19, 1126, objArr176);
                                                        java.lang.Object[] objArr177 = new java.lang.Object[1];
                                                        b((char) 17220, 16, 1145, objArr177);
                                                        java.lang.Object[] objArr178 = new java.lang.Object[1];
                                                        b((char) 58628, 19, 1161, objArr178);
                                                        java.lang.Object[] objArr179 = new java.lang.Object[1];
                                                        b((char) 3669, 19, 1180, objArr179);
                                                        java.lang.Object[] objArr180 = new java.lang.Object[1];
                                                        b((char) 0, 23, 1199, objArr180);
                                                        java.lang.Object[] objArr181 = new java.lang.Object[1];
                                                        b((char) 0, 21, 1222, objArr181);
                                                        java.lang.Object[] objArr182 = new java.lang.Object[1];
                                                        b((char) 53314, 24, 1243, objArr182);
                                                        java.lang.String str88 = str;
                                                        java.lang.Object[] objArr183 = new java.lang.Object[1];
                                                        b((char) 0, 28, 1267, objArr183);
                                                        java.lang.Object[] objArr184 = new java.lang.Object[1];
                                                        b((char) 3845, 27, 1295, objArr184);
                                                        java.lang.Object[] objArr185 = new java.lang.Object[1];
                                                        b((char) 0, 31, 1322, objArr185);
                                                        java.lang.Object[] objArr186 = new java.lang.Object[1];
                                                        b((char) 0, 27, 1353, objArr186);
                                                        java.lang.Object[] objArr187 = new java.lang.Object[1];
                                                        b((char) 0, 32, 1380, objArr187);
                                                        java.lang.String[][] strArr16 = {new java.lang.String[]{str60, str61, str62, (java.lang.String) objArr136[0]}, strArr15, new java.lang.String[]{str63, str64, str, str65, str66, str67}, new java.lang.String[]{str68, str69, str70, (java.lang.String) objArr150[0]}, new java.lang.String[]{str71, str72, (java.lang.String) objArr153[0]}, new java.lang.String[]{str73, (java.lang.String) objArr155[0]}, new java.lang.String[]{str74, (java.lang.String) objArr157[0]}, new java.lang.String[]{str75, str76, str77, str78, str79, (java.lang.String) objArr163[0]}, new java.lang.String[]{str80, str81, str82, str83, str84, (java.lang.String) objArr169[0], str}, new java.lang.String[]{str85, (java.lang.String) objArr171[0]}, new java.lang.String[]{str86, (java.lang.String) objArr173[0]}, new java.lang.String[]{str87, (java.lang.String) objArr175[0]}, new java.lang.String[]{(java.lang.String) objArr176[0]}, new java.lang.String[]{(java.lang.String) objArr177[0]}, new java.lang.String[]{(java.lang.String) objArr178[0]}, new java.lang.String[]{(java.lang.String) objArr179[0]}, new java.lang.String[]{(java.lang.String) objArr180[0]}, new java.lang.String[]{(java.lang.String) objArr181[0]}, new java.lang.String[]{(java.lang.String) objArr182[0], str88}, new java.lang.String[]{(java.lang.String) objArr183[0], str88}, new java.lang.String[]{(java.lang.String) objArr184[0], str88}, new java.lang.String[]{(java.lang.String) objArr185[0], str88}, new java.lang.String[]{(java.lang.String) objArr186[0], str88}, new java.lang.String[]{(java.lang.String) objArr187[0], str88}};
                                                        java.util.ArrayList arrayList3 = new java.util.ArrayList();
                                                        int i533 = i35;
                                                        int i534 = 0;
                                                        int i535 = 0;
                                                        while (i534 < 24) {
                                                            java.lang.String[] strArr17 = strArr16[i534];
                                                            java.lang.Object[] objArr188 = {strArr17[c5]};
                                                            java.lang.Object objEZpvd23 = YY.EZpvd(1845277648);
                                                            if (objEZpvd23 == null) {
                                                                byte b45 = (byte) 1;
                                                                byte b46 = (byte) (b45 + 2);
                                                                strArr = strArr16;
                                                                java.lang.Object[] objArr189 = new java.lang.Object[1];
                                                                a(b45, b46, (byte) (b46 - 2), objArr189);
                                                                objEZpvd23 = YY.EZpvd(531, 5, (char) 0, 1776058028, false, (java.lang.String) objArr189[0], new java.lang.Class[]{java.lang.String.class});
                                                            } else {
                                                                strArr = strArr16;
                                                            }
                                                            java.lang.String str89 = (java.lang.String) ((java.lang.reflect.Method) objEZpvd23).invoke(null, objArr188);
                                                            java.lang.String[] strArr18 = (java.lang.String[]) java.util.Arrays.copyOfRange(strArr17, 1, strArr17.length);
                                                            if (str89 == null || str89.length() == 0) {
                                                                i21 = i35;
                                                                arrayList = arrayList3;
                                                            } else {
                                                                if (strArr17.length != 1) {
                                                                    java.lang.Object[] objArr190 = {str89, strArr18};
                                                                    java.lang.Object objEZpvd24 = YY.EZpvd(-1100697334);
                                                                    if (objEZpvd24 == null) {
                                                                        byte b47 = (byte) 3;
                                                                        byte b48 = (byte) (b47 - 3);
                                                                        java.lang.Object[] objArr191 = new java.lang.Object[1];
                                                                        a(b47, b48, b48, objArr191);
                                                                        objEZpvd24 = YY.EZpvd(449, 5, (char) 22140, -1169916810, false, (java.lang.String) objArr191[0], new java.lang.Class[]{java.lang.String.class, java.lang.String[].class});
                                                                    }
                                                                    long jLongValue15 = ((java.lang.Long) ((java.lang.reflect.Method) objEZpvd24).invoke(null, objArr190)).longValue();
                                                                    long j92 = -134926253;
                                                                    str9 = str89;
                                                                    arrayList2 = arrayList3;
                                                                    long j93 = 216;
                                                                    long j94 = (((long) 217) * j92) + (((long) (-215)) * jLongValue15) + (((j92 | j) ^ j19) * j93) + (((long) (-216)) * (j92 | (jLongValue15 ^ j19) | j22)) + (j93 * (((j22 | j92) ^ j19) | jLongValue15)) + ((long) 1148933283);
                                                                    int i536 = (int) java.lang.Runtime.getRuntime().totalMemory();
                                                                    int i537 = ~i536;
                                                                    int i538 = ((int) (j94 >> 32)) & (1871737038 + (((~(680026549 | i537)) | (~((-2117252961) | i536))) * 1900) + (((~(i537 | 2117252960)) | (~((-680026550) | i536))) * (-950)) + (((~(i536 | 2117252960)) | (~(i537 | (-680026550)))) * 950));
                                                                    int i539 = (int) j94;
                                                                    int elapsedCpuTime2 = (int) android.os.Process.getElapsedCpuTime();
                                                                    int i540 = 722347601 + (((-1537506912) | elapsedCpuTime2) * CipherSuite.TLS_PSK_WITH_AES_128_CBC_SHA);
                                                                    int i541 = ~elapsedCpuTime2;
                                                                    if ((i538 | (i539 & (i540 + (((~((-1537506912) | i541)) | 27273237) * (-280)) + (((~(elapsedCpuTime2 | (-27273238))) | (~(100280501 | i541)) | (-1610514176)) * CipherSuite.TLS_PSK_WITH_AES_128_CBC_SHA)))) == 0) {
                                                                        i21 = i;
                                                                        arrayList = arrayList2;
                                                                    }
                                                                } else {
                                                                    str9 = str89;
                                                                    arrayList2 = arrayList3;
                                                                }
                                                                i535++;
                                                                int i542 = i534 + 10;
                                                                i21 = i;
                                                                i533 = ((~i542) & i21) | (i542 & i13);
                                                                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                                                                java.lang.String str90 = str9;
                                                                sb.append(str90);
                                                                java.lang.Object[] objArr192 = new java.lang.Object[1];
                                                                b((char) 64487, 1, 1412, objArr192);
                                                                sb.append((java.lang.String) objArr192[0]);
                                                                sb.append(str90);
                                                                arrayList = arrayList2;
                                                                arrayList.add(sb.toString());
                                                            }
                                                            i534 = ((i534 | 1) << 1) - (i534 ^ 1);
                                                            i35 = i21;
                                                            arrayList3 = arrayList;
                                                            strArr16 = strArr;
                                                            c5 = 0;
                                                        }
                                                        i19 = i35;
                                                        java.util.ArrayList arrayList4 = arrayList3;
                                                        if (i535 > 2) {
                                                            objArr = new java.lang.Object[]{new int[1], arrayList4, new int[]{i19}, new int[]{i533}, null};
                                                            int iMyPid2 = android.os.Process.myPid();
                                                            int i543 = ~iMyPid2;
                                                            int i544 = 1039952382 + (((~((-166432861) | i543)) | 1108441679) * 519) + (((~(i543 | (-166363153))) | (~(1274804831 | iMyPid2))) * (-519)) + (((~(iMyPid2 | 1108441679)) | 166432860) * 519);
                                                            int i545 = (i544 << 1) - i544;
                                                            int i546 = i545 ^ (i545 << 13);
                                                            int i547 = i546 >>> 17;
                                                            int i548 = ((~i546) & i547) | ((~i547) & i546);
                                                            int i549 = i548 << 5;
                                                            ((int[]) objArr[0])[0] = (i548 | i549) & (~(i548 & i549));
                                                            c = 0;
                                                        } else {
                                                            objArr = new java.lang.Object[]{new int[1], null, new int[]{i19}, new int[]{i19}, null};
                                                            int i550 = -(-((((54264097 | r0) * (-970)) - 987172083) + (((~((~((int) java.lang.Runtime.getRuntime().freeMemory())) | 389811685)) | 335547588) * 970)));
                                                            int i551 = i550 << 13;
                                                            int i552 = (i550 | i551) & (~(i550 & i551));
                                                            int i553 = i552 >>> 17;
                                                            int i554 = (i552 | i553) & (~(i552 & i553));
                                                            int i555 = i554 << 5;
                                                            int i556 = ((~i554) & i555) | ((~i555) & i554);
                                                            c = 0;
                                                            ((int[]) objArr[0])[0] = i556;
                                                        }
                                                        int i557 = ((int[]) objArr[3])[c];
                                                        if (i557 != i19) {
                                                            java.lang.Object[] objArr193 = new java.lang.Object[5];
                                                            objArr193[c] = new int[1];
                                                            int[] iArr7 = new int[1];
                                                            objArr193[2] = iArr7;
                                                            int[] iArr8 = new int[1];
                                                            objArr193[3] = iArr8;
                                                            java.util.List list = (java.util.List) objArr[1];
                                                            iArr7[c] = i19;
                                                            iArr8[c] = i557;
                                                            objArr193[1] = list;
                                                            objArr193[4] = null;
                                                            int iNextInt5 = new java.util.Random().nextInt(738497022);
                                                            int i558 = (~((-522852596) | iNextInt5)) | 201461936;
                                                            int i559 = 297295707 + (i558 * 992) + ((i558 | (~((~iNextInt5) | 1073412603))) * (-496)) + ((iNextInt5 | 752021944) * 496);
                                                            int i560 = (i3 - (~((i559 ^ 16) + ((16 & i559) << 1)))) - 1;
                                                            int i561 = i560 << 13;
                                                            int i562 = ((~i560) & i561) | ((~i561) & i560);
                                                            int i563 = i562 >>> 17;
                                                            int i564 = (i562 | i563) & (~(i562 & i563));
                                                            ((int[]) objArr193[0])[0] = i564 ^ (i564 << 5);
                                                            return objArr193;
                                                        }
                                                        c2 = c;
                                                        i20 = 1;
                                                        java.lang.Object[] objArr812 = new java.lang.Object[i20];
                                                        b((char) 27255, 16, 698, objArr812);
                                                        java.lang.Object[] objArr822 = {(java.lang.String) objArr812[c2]};
                                                        objEZpvd = YY.EZpvd(1845277648);
                                                        if (objEZpvd == null) {
                                                        }
                                                        objInvoke = ((java.lang.reflect.Method) objEZpvd).invoke(null, objArr822);
                                                        if (objInvoke != null) {
                                                        }
                                                        if (i22 != 1986687685) {
                                                            i23 = i3;
                                                            i24 = i19;
                                                            i25 = i13;
                                                        }
                                                        c3 = 0;
                                                        java.lang.Object[] objArr1132 = new java.lang.Object[1];
                                                        b((char) 37727, 13, 1755, objArr1132);
                                                        java.lang.String str502 = (java.lang.String) objArr1132[0];
                                                        java.lang.Object[] objArr1142 = new java.lang.Object[1];
                                                        b((char) 21675, 5, 1768, objArr1142);
                                                        java.lang.String[] strArr82 = {str502, (java.lang.String) objArr1142[0]};
                                                        java.lang.Object[] objArr1152 = new java.lang.Object[1];
                                                        b((char) 0, 15, 1773, objArr1152);
                                                        java.lang.String str512 = (java.lang.String) objArr1152[0];
                                                        java.lang.Object[] objArr1162 = new java.lang.Object[1];
                                                        b((char) 24924, 19, 1788, objArr1162);
                                                        java.lang.String str522 = (java.lang.String) objArr1162[0];
                                                        java.lang.Object[] objArr1172 = new java.lang.Object[1];
                                                        b((char) 0, 14, 1807, objArr1172);
                                                        java.lang.String[] strArr92 = {str512, str522, (java.lang.String) objArr1172[0]};
                                                        java.lang.Object[] objArr1182 = new java.lang.Object[1];
                                                        b((char) 0, 21, 1821, objArr1182);
                                                        java.lang.String str532 = (java.lang.String) objArr1182[0];
                                                        java.lang.Object[] objArr1192 = new java.lang.Object[1];
                                                        b((char) 46282, 10, 1842, objArr1192);
                                                        java.lang.String[] strArr102 = {str532, (java.lang.String) objArr1192[0]};
                                                        java.lang.Object[] objArr1202 = new java.lang.Object[1];
                                                        b((char) 0, 11, 1852, objArr1202);
                                                        java.lang.String str542 = (java.lang.String) objArr1202[0];
                                                        java.lang.Object[] objArr1212 = new java.lang.Object[1];
                                                        b((char) 20557, 6, 589, objArr1212);
                                                        java.lang.String[] strArr112 = {str542, (java.lang.String) objArr1212[0]};
                                                        java.lang.Object[] objArr1222 = new java.lang.Object[1];
                                                        b((char) 0, 28, 1863, objArr1222);
                                                        java.lang.String str552 = (java.lang.String) objArr1222[0];
                                                        java.lang.Object[] objArr1232 = new java.lang.Object[1];
                                                        b((char) 46282, 10, 1842, objArr1232);
                                                        java.lang.String[][] strArr122 = {strArr82, strArr92, strArr102, strArr112, new java.lang.String[]{str552, (java.lang.String) objArr1232[0]}};
                                                        i26 = 0;
                                                        int i4422 = i18;
                                                        loop5: while (true) {
                                                            if (i26 < 5) {
                                                            }
                                                            i26 = ((i26 | 1) << 1) - (i26 ^ 1);
                                                            c3 = 0;
                                                        }
                                                        if (i28 == i24) {
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    str6 = str4;
                                } else {
                                    str6 = str4;
                                }
                                i15 = i35;
                                if (i15 == i35) {
                                }
                            }
                        }
                        i13 = i11;
                        i14 = i35;
                        if (i14 == i35) {
                        }
                    }
                    return objArr4;
                }
                objArr2 = new java.lang.Object[]{new int[1], null, new int[]{i35}, new int[]{i6}, null};
                int iMaxMemory2 = (int) java.lang.Runtime.getRuntime().maxMemory();
                int i565 = ~iMaxMemory2;
                int i566 = 990153415 + (((~((-479280113) | i565)) | 201394864 | (~((-795594428) | i565)) | (~(1073479675 | iMaxMemory2))) * (-84));
                int i567 = (~(iMaxMemory2 | (-795594428))) | 479280112;
                int i568 = ~(i565 | 795594427);
                int i569 = i566 + ((i567 | i568) * (-84)) + (((-1073479676) | i568) * 84);
                int i570 = ((i569 | 16) << 1) - (16 ^ i569);
                int iKWHzl6 = C50988veY.KWHzl();
                int i571 = i570 * 595;
                int i572 = i3 * (-1187);
                int i573 = ((i571 | i572) << 1) - (i571 ^ i572);
                int i574 = ~i570;
                int i575 = ~(i574 | i3);
                int i576 = ~iKWHzl6;
                int i577 = ~((i576 ^ i3) | (i576 & i3));
                int i578 = i573 + (((i575 & i577) | (i575 ^ i577)) * (-1188));
                int i579 = ~((i574 & i3) | (i574 ^ i3));
                int i580 = ~i3;
                int i581 = ~((i580 ^ iKWHzl6) | (i580 & iKWHzl6));
                int i582 = (i579 & i581) | (i579 ^ i581);
                int i583 = ~iKWHzl6;
                int i584 = ~(i583 | i570);
                int i585 = ((i582 & i584) | (i582 ^ i584)) * 594;
                int i586 = (i578 ^ i585) + ((i585 & i578) << 1);
                int i587 = ~i3;
                int i588 = ~((i587 & i583) | (i587 ^ i583));
                int i589 = ~((i580 ^ i570) | (i580 & i570));
                int i590 = (i588 & i589) | (i588 ^ i589);
                int i591 = ~((i570 & i576) | (i576 ^ i570));
                int i592 = -(-(((i591 & i590) | (i590 ^ i591)) * 594));
                int i593 = (i586 & i592) + (i592 | i586);
                int i594 = i593 << 13;
                int i595 = (i594 | i593) & (~(i593 & i594));
                int i596 = i595 >>> 17;
                int i597 = (i595 | i596) & (~(i595 & i596));
                ((int[]) objArr2[0])[0] = i597 ^ (i597 << 5);
                return objArr2;
            }
        }).show(getSupportFragmentManager(), "DexSelectionBottomSheet");
    }

    public static final Unit EZpvd(ActivityC27733kBi activityC27733kBi, kMS kms) {
        java.lang.String str;
        activityC27733kBi.EZpvd().values.setSelected(false);
        if (kms != null) {
            java.lang.Object objAYXKKw = kms.AYXKKw();
            Intrinsics.copydefault(objAYXKKw, "");
            int i = StateListAnimator.EZpvd[((VibesViewModel.Companion.ChartDisplayUnit) objAYXKKw).ordinal()];
            if (i == 1) {
                str = FirebaseAnalytics.Param.PRICE;
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                str = "mcap";
            }
            trackVibesEvent$default(activityC27733kBi, "price_mcap_toggle", str, null, null, null, 28, null);
            VibesViewModel vibesViewModelAEQbTJ = activityC27733kBi.AEQbTJ();
            java.lang.Object objAYXKKw2 = kms.AYXKKw();
            Intrinsics.copydefault(objAYXKKw2, "");
            vibesViewModelAEQbTJ.copydefault((VibesViewModel.Companion.ChartDisplayUnit) objAYXKKw2);
            activityC27733kBi.EZpvd().values.setTitle(kms.EZpvd());
        }
        return Unit.INSTANCE;
    }

    public final int AEQbTJ(java.lang.String str) {
        if (C33129mqd.OLrzqt(str, "0")) {
            return C25382ivf.KWHzl(C52761wXj.Activity.QwvEab);
        }
        if (C33129mqd.AEQbTJ(str, "0")) {
            C33512mxp c33512mxp = C33512mxp.AEQbTJ;
            android.content.Context context = EZpvd().getRoot().getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            return C33512mxp.tradeRiseDefault$default(c33512mxp, context, 0.0f, 2, null);
        }
        C33512mxp c33512mxp2 = C33512mxp.AEQbTJ;
        android.content.Context context2 = EZpvd().getRoot().getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        return C33512mxp.tradeFallDefault$default(c33512mxp2, context2, 0.0f, 2, null);
    }

    public static /* synthetic */ void trackVibesEvent$default(ActivityC27733kBi activityC27733kBi, java.lang.String str, java.lang.String str2, java.lang.String str3, VibesSortType vibesSortType, VibesSortType vibesSortType2, int i, java.lang.Object obj) {
        activityC27733kBi.AEQbTJ(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : vibesSortType, (i & 16) != 0 ? null : vibesSortType2);
    }

    public final void AEQbTJ(java.lang.String str, java.lang.String str2, java.lang.String str3, VibesSortType vibesSortType, VibesSortType vibesSortType2) {
        VibesViewModel vibesViewModelAEQbTJ = AEQbTJ();
        long jKWHzl = AYXKKw().KWHzl();
        vibesViewModelAEQbTJ.copydefault(str, str2, str3, vibesSortType, vibesSortType2, java.lang.String.valueOf(jKWHzl), AYXKKw().copydefault());
    }

    public final void AEQbTJ(boolean z) {
        SPUtils.put("key_dex_vibes_disclaimer", java.lang.Boolean.valueOf(z));
    }

    @Override // o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
