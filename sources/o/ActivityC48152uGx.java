package o;

import android.view.View;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.platform.ViewCompositionStrategy;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.os.BundleCompat;
import androidx.core.os.BundleKt;
import androidx.lifecycle.FlowExtKt;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.okinc.core.util.SPUtils;
import com.okinc.tradingbot.impl.aiBot.domain.model.Indicator;
import com.okinc.tradingbot.impl.aiBot.domain.model.MarketSignalConfigUiModel;
import com.okinc.tradingbot.impl.aiBot.domain.model.MarketSignalSelectionResult;
import com.okinc.tradingbot.impl.aiBot.ui.signal.EditMarketSignalActivity$observeViewModel$1;
import com.okinc.tradingbot.impl.aiBot.ui.signal.EditMarketSignalActivity$onCreate$1;
import com.okinc.tradingbot.impl.aiBot.ui.signal.EditMarketSignalViewModel;
import com.okinc.unify_trade.biz.DataSetting;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import o.AbstractC48145uGq;
import o.ActivityC48152uGx;
import o.C48033uCm;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.uGx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class ActivityC48152uGx extends AbstractActivityC48156uHa {
    public final ActivityResultLauncher<android.content.Intent> KWHzl;
    public final InterfaceC56387yDm OLrzqt;
    public static final Activity Companion = new Activity(null);
    public static final int copydefault = 8;
    public static final java.lang.String AEQbTJ = "ShouldShowMarketSignalIntroSheet";

    public ActivityC48152uGx() {
        final Function0 function0 = null;
        this.OLrzqt = new ViewModelLazy(C56524yIo.AEQbTJ(EditMarketSignalViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.tradingbot.impl.aiBot.ui.signal.EditMarketSignalActivity$special$$inlined$viewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.tradingbot.impl.aiBot.ui.signal.EditMarketSignalActivity$special$$inlined$viewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.tradingbot.impl.aiBot.ui.signal.EditMarketSignalActivity$special$$inlined$viewModels$default$3
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
        ActivityResultLauncher<android.content.Intent> activityResultLauncherRegisterForActivityResult = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: o.uGu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(java.lang.Object obj) {
                ActivityC48152uGx.EZpvd(this.EZpvd, (ActivityResult) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult, "");
        this.KWHzl = activityResultLauncherRegisterForActivityResult;
    }

    /* JADX INFO: renamed from: o.uGx$Activity */
    /* JADX INFO: loaded from: classes19.dex */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.uGx.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final android.content.Intent OLrzqt(@NotNull android.content.Context context, @NotNull MarketSignalConfigUiModel marketSignalConfigUiModel, @NotNull DataSetting dataSetting, @NotNull DataSetting dataSetting2) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(marketSignalConfigUiModel, "");
            Intrinsics.checkNotNullParameter(dataSetting, "");
            Intrinsics.checkNotNullParameter(dataSetting2, "");
            android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) ActivityC48152uGx.class);
            intent.putExtras(BundleKt.bundleOf(C56390yDp.OLrzqt("ConfigKey", marketSignalConfigUiModel), C56390yDp.OLrzqt("SelectionKey", dataSetting), C56390yDp.OLrzqt("DefaultSelectionKey", dataSetting2)));
            return intent;
        }
    }

    /* JADX DEBUG: Possible override for method o.uHa.AEQbTJ()V */
    public final EditMarketSignalViewModel AEQbTJ() {
        return (EditMarketSignalViewModel) this.OLrzqt.getValue();
    }

    public static final void EZpvd(ActivityC48152uGx activityC48152uGx, ActivityResult activityResult) {
        android.content.Intent data;
        android.os.Bundle extras;
        if (activityResult.getResultCode() != -1 || (data = activityResult.getData()) == null || (extras = data.getExtras()) == null) {
            return;
        }
        java.util.List parcelableArrayList = BundleCompat.getParcelableArrayList(extras, "extra_selected_indicators", Indicator.class);
        if (parcelableArrayList == null) {
            parcelableArrayList = yDY.AhwBna();
        }
        activityC48152uGx.AEQbTJ().AEQbTJ(new AbstractC48145uGq.FragmentManager(parcelableArrayList));
    }

    @Override // o.AbstractActivityC48156uHa, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        C48298uMh c48298uMhAEQbTJ = C48298uMh.AEQbTJ(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(c48298uMhAEQbTJ, "");
        setContentView(c48298uMhAEQbTJ.getRoot());
        EZpvd(c48298uMhAEQbTJ);
        copydefault(c48298uMhAEQbTJ);
        OLrzqt(c48298uMhAEQbTJ);
        AEQbTJ(c48298uMhAEQbTJ);
        KWHzl(c48298uMhAEQbTJ);
        java.lang.String str = AEQbTJ;
        if (SPUtils.getBoolean(str, true)) {
            SPUtils.put(str, java.lang.Boolean.FALSE);
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new EditMarketSignalActivity$onCreate$1(this, null), 3, null);
        }
    }

    public final void EZpvd(C48298uMh c48298uMh) {
        ConstraintLayout root = c48298uMh.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        C52712wVo.AEQbTJ(root);
    }

    public final void copydefault(C48298uMh c48298uMh) {
        c48298uMh.EZpvd.setTitle(C33070mpX.AYXKKw(C48033uCm.Fragment.DarRvM));
        c48298uMh.EZpvd.setNavigationOnClickListener(new View.OnClickListener() { // from class: o.uGw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                ActivityC48152uGx.AYXKKw(this.copydefault, view);
            }
        });
    }

    public static final void AYXKKw(ActivityC48152uGx activityC48152uGx, android.view.View view) {
        activityC48152uGx.finish();
    }

    /* JADX INFO: renamed from: o.uGx$Application */
    public static final class Application implements Function2<Composer, java.lang.Integer, Unit> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function2
        public /* synthetic */ Unit invoke(Composer composer, java.lang.Integer num) {
            EZpvd(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void EZpvd(Composer composer, int i) {
            if ((i & 3) != 2 || !composer.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(407026330, i, -1, "com.okinc.tradingbot.impl.aiBot.ui.signal.EditMarketSignalActivity.setupContent.<anonymous> (EditMarketSignalActivity.kt:135)");
                }
                EditMarketSignalViewModel editMarketSignalViewModelAEQbTJ = ActivityC48152uGx.this.AEQbTJ();
                composer.startReplaceableGroup(1892028311);
                boolean zChangedInstance = composer.changedInstance(ActivityC48152uGx.this);
                final ActivityC48152uGx activityC48152uGx = ActivityC48152uGx.this;
                java.lang.Object objRememberedValue = composer.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.Companion.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: o.uGC
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return ActivityC48152uGx.Application.OLrzqt(activityC48152uGx);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue);
                }
                Function0 function0 = (Function0) objRememberedValue;
                composer.endReplaceableGroup();
                composer.startReplaceableGroup(1892050818);
                boolean zChangedInstance2 = composer.changedInstance(ActivityC48152uGx.this);
                final ActivityC48152uGx activityC48152uGx2 = ActivityC48152uGx.this;
                java.lang.Object objRememberedValue2 = composer.rememberedValue();
                if (zChangedInstance2 || objRememberedValue2 == Composer.Companion.getEmpty()) {
                    objRememberedValue2 = new Function0() { // from class: o.uGB
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return ActivityC48152uGx.Application.copydefault(activityC48152uGx2);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue2);
                }
                composer.endReplaceableGroup();
                C48154uGz.AEQbTJ(editMarketSignalViewModelAEQbTJ, function0, (Function0) objRememberedValue2, composer, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                    return;
                }
                return;
            }
            composer.skipToGroupEnd();
        }

        public static final Unit OLrzqt(ActivityC48152uGx activityC48152uGx) {
            activityC48152uGx.KWHzl.launch(ActivityC48073uDz.Companion.copydefault(activityC48152uGx, activityC48152uGx.AEQbTJ().OLrzqt(), activityC48152uGx.AEQbTJ().KWHzl(), activityC48152uGx.AEQbTJ().EZpvd()));
            return Unit.INSTANCE;
        }

        public static final Unit copydefault(ActivityC48152uGx activityC48152uGx) {
            uGY ugyOLrzqt = uGY.Companion.OLrzqt();
            androidx.fragment.app.FragmentManager supportFragmentManager = activityC48152uGx.getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
            C49662usl.EZpvd(ugyOLrzqt, supportFragmentManager, "IntroEditMarketSignalBottomSheet");
            return Unit.INSTANCE;
        }
    }

    public final void OLrzqt(C48298uMh c48298uMh) {
        c48298uMh.copydefault.setViewCompositionStrategy(ViewCompositionStrategy.DisposeOnViewTreeLifecycleDestroyed.INSTANCE);
        c48298uMh.copydefault.setContent(ComposableLambdaKt.composableLambdaInstance(407026330, true, new Application()));
    }

    public final void AEQbTJ(C48298uMh c48298uMh) {
        wYF wyf = c48298uMh.KWHzl;
        wyf.setType(14);
        wyf.setPrimaryText(C33070mpX.AYXKKw(C48033uCm.Fragment.DcNNRp));
        wyf.setSecondaryText(C33070mpX.AYXKKw(C48033uCm.Fragment.ODXsMY));
        C52794wYp c52794wYpCopydefault = wyf.copydefault();
        if (c52794wYpCopydefault != null) {
            c52794wYpCopydefault.setEnabled(false);
        }
        C52794wYp c52794wYpCopydefault2 = wyf.copydefault();
        if (c52794wYpCopydefault2 != null) {
            c52794wYpCopydefault2.setOnClickListener(new View.OnClickListener() { // from class: o.uGv
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    ActivityC48152uGx.KWHzl(this.AEQbTJ, view);
                }
            });
        }
        C52794wYp c52794wYpAEQbTJ = wyf.AEQbTJ();
        if (c52794wYpAEQbTJ != null) {
            c52794wYpAEQbTJ.setOKDSType(260);
        }
        C52794wYp c52794wYpAEQbTJ2 = wyf.AEQbTJ();
        if (c52794wYpAEQbTJ2 != null) {
            c52794wYpAEQbTJ2.setEnabled(false);
        }
        C52794wYp c52794wYpAEQbTJ3 = wyf.AEQbTJ();
        if (c52794wYpAEQbTJ3 != null) {
            c52794wYpAEQbTJ3.setOnClickListener(new View.OnClickListener() { // from class: o.uGt
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    ActivityC48152uGx.EZpvd(this.AEQbTJ, view);
                }
            });
        }
    }

    public static final void KWHzl(ActivityC48152uGx activityC48152uGx, android.view.View view) {
        MarketSignalSelectionResult marketSignalSelectionResultAEQbTJ = activityC48152uGx.AEQbTJ().AEQbTJ();
        if (marketSignalSelectionResultAEQbTJ != null) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("SelectionResultKey", marketSignalSelectionResultAEQbTJ);
            Unit unit = Unit.INSTANCE;
            activityC48152uGx.setResult(-1, intent);
        } else {
            activityC48152uGx.setResult(0);
        }
        activityC48152uGx.finish();
    }

    public static final void EZpvd(ActivityC48152uGx activityC48152uGx, android.view.View view) {
        activityC48152uGx.AEQbTJ().AEQbTJ(AbstractC48145uGq.ActionBar.copydefault);
    }

    public final void KWHzl(C48298uMh c48298uMh) {
        StateFlow<uLU<uGU>> stateFlowCopydefault = AEQbTJ().copydefault();
        Lifecycle lifecycle = getLifecycle();
        Intrinsics.checkNotNullExpressionValue(lifecycle, "");
        FlowKt.launchIn(FlowKt.onEach(FlowExtKt.flowWithLifecycle$default(stateFlowCopydefault, lifecycle, null, 2, null), new EditMarketSignalActivity$observeViewModel$1(c48298uMh, null)), LifecycleOwnerKt.getLifecycleScope(this));
    }

    @Override // o.AbstractActivityC48156uHa, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.AbstractActivityC48156uHa, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // o.AbstractActivityC48156uHa, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // o.AbstractActivityC48156uHa, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
