package o;

import android.view.View;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.os.BundleCompat;
import androidx.core.os.BundleKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.okinc.tradingbot.impl.aiBot.domain.model.Indicator;
import com.okinc.tradingbot.impl.aiBot.domain.model.IndicatorSectionUiModel;
import com.okinc.tradingbot.impl.aiBot.ui.indicators.TechnicalIndicatorsActivity$onCreate$6;
import com.okinc.tradingbot.impl.aiBot.ui.indicators.TechnicalIndicatorsViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.StateFlow;
import o.AbstractC48070uDw;
import o.ActivityC48073uDz;
import o.C48033uCm;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.uDz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class ActivityC48073uDz extends AbstractActivityC48050uDc {
    public final InterfaceC56387yDm AYXKKw;
    public ActivityResultLauncher<C48069uDv> valueOf;
    public static final Application Companion = new Application(null);
    public static final int AEQbTJ = 8;

    public ActivityC48073uDz() {
        final Function0 function0 = null;
        this.AYXKKw = new ViewModelLazy(C56524yIo.AEQbTJ(TechnicalIndicatorsViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.tradingbot.impl.aiBot.ui.indicators.TechnicalIndicatorsActivity$special$$inlined$viewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.tradingbot.impl.aiBot.ui.indicators.TechnicalIndicatorsActivity$special$$inlined$viewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.tradingbot.impl.aiBot.ui.indicators.TechnicalIndicatorsActivity$special$$inlined$viewModels$default$3
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

    /* JADX DEBUG: Possible override for method o.uDc.OLrzqt()V */
    public final TechnicalIndicatorsViewModel OLrzqt() {
        return (TechnicalIndicatorsViewModel) this.AYXKKw.getValue();
    }

    @Override // o.AbstractActivityC48050uDc, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        uMD umdKWHzl = uMD.KWHzl(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(umdKWHzl, "");
        setContentView(umdKWHzl.getRoot());
        ConstraintLayout root = umdKWHzl.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        C52712wVo.AEQbTJ(root);
        umdKWHzl.KWHzl.setTitle(C33070mpX.AYXKKw(C48033uCm.Fragment.QSBOWP));
        umdKWHzl.KWHzl.setNavigationOnClickListener(new View.OnClickListener() { // from class: o.uDB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                ActivityC48073uDz.copydefault(this.EZpvd, view);
            }
        });
        android.os.Bundle extras = getIntent().getExtras();
        if (extras == null) {
            extras = BundleKt.bundleOf();
        }
        java.util.List parcelableArrayList = BundleCompat.getParcelableArrayList(extras, "extra_pre_loaded_sections", IndicatorSectionUiModel.class);
        if (parcelableArrayList == null) {
            parcelableArrayList = yDY.AhwBna();
        }
        android.os.Bundle extras2 = getIntent().getExtras();
        if (extras2 == null) {
            extras2 = BundleKt.bundleOf();
        }
        java.util.List parcelableArrayList2 = BundleCompat.getParcelableArrayList(extras2, "extra_default_sections", IndicatorSectionUiModel.class);
        if (parcelableArrayList2 == null) {
            parcelableArrayList2 = yDY.AhwBna();
        }
        OLrzqt().KWHzl(new AbstractC48070uDw.ActionBar(parcelableArrayList, parcelableArrayList2, getIntent().getIntExtra("extra_max_indicators", 6)));
        this.valueOf = registerForActivityResult(new C48072uDy(), new ActivityResultCallback() { // from class: o.uDC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(java.lang.Object obj) {
                ActivityC48073uDz.KWHzl(this.KWHzl, (Indicator) obj);
            }
        });
        umdKWHzl.EZpvd.setContent(ComposableLambdaKt.composableLambdaInstance(-126374563, true, new ActionBar()));
        C52794wYp c52794wYpAEQbTJ = umdKWHzl.copydefault.AEQbTJ();
        if (c52794wYpAEQbTJ != null) {
            c52794wYpAEQbTJ.setOKDSType(260);
        }
        C52794wYp c52794wYpAEQbTJ2 = umdKWHzl.copydefault.AEQbTJ();
        if (c52794wYpAEQbTJ2 != null) {
            c52794wYpAEQbTJ2.setText(C33070mpX.AYXKKw(C48033uCm.Fragment.ODXsMY));
            c52794wYpAEQbTJ2.setOnClickListener(new View.OnClickListener() { // from class: o.uDD
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    ActivityC48073uDz.EZpvd(this.KWHzl, view);
                }
            });
        }
        C52794wYp c52794wYpCopydefault = umdKWHzl.copydefault.copydefault();
        if (c52794wYpCopydefault != null) {
            c52794wYpCopydefault.setOnClickListener(new View.OnClickListener() { // from class: o.uDA
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    ActivityC48073uDz.valueOf(this.EZpvd, view);
                }
            });
        }
        C52692wUv.flowAndCollect$default(OLrzqt().EZpvd(), this, null, new TechnicalIndicatorsActivity$onCreate$6(umdKWHzl, null), 2, null);
    }

    public static final void copydefault(ActivityC48073uDz activityC48073uDz, android.view.View view) {
        activityC48073uDz.onBackPressed();
    }

    public static final void KWHzl(ActivityC48073uDz activityC48073uDz, Indicator indicator) {
        if (indicator != null) {
            activityC48073uDz.OLrzqt().KWHzl(new AbstractC48070uDw.TaskDescription(indicator));
        }
    }

    /* JADX INFO: renamed from: o.uDz$ActionBar */
    public static final class ActionBar implements Function2<Composer, java.lang.Integer, Unit> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function2
        public /* synthetic */ Unit invoke(Composer composer, java.lang.Integer num) {
            AEQbTJ(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void AEQbTJ(Composer composer, int i) {
            if ((i & 3) != 2 || !composer.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-126374563, i, -1, "com.okinc.tradingbot.impl.aiBot.ui.indicators.TechnicalIndicatorsActivity.onCreate.<anonymous> (TechnicalIndicatorsActivity.kt:74)");
                }
                StateFlow<uLU<uDU>> stateFlowEZpvd = ActivityC48073uDz.this.OLrzqt().EZpvd();
                composer.startReplaceableGroup(-1958639406);
                boolean zChangedInstance = composer.changedInstance(ActivityC48073uDz.this);
                final ActivityC48073uDz activityC48073uDz = ActivityC48073uDz.this;
                java.lang.Object objRememberedValue = composer.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.Companion.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: o.uDG
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return ActivityC48073uDz.ActionBar.AEQbTJ(activityC48073uDz);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue);
                }
                Function0 function0 = (Function0) objRememberedValue;
                composer.endReplaceableGroup();
                composer.startReplaceableGroup(-1958635202);
                boolean zChangedInstance2 = composer.changedInstance(ActivityC48073uDz.this);
                final ActivityC48073uDz activityC48073uDz2 = ActivityC48073uDz.this;
                java.lang.Object objRememberedValue2 = composer.rememberedValue();
                if (zChangedInstance2 || objRememberedValue2 == Composer.Companion.getEmpty()) {
                    objRememberedValue2 = new Function1() { // from class: o.uDI
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return ActivityC48073uDz.ActionBar.KWHzl(activityC48073uDz2, (Indicator) obj);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue2);
                }
                Function1 function1 = (Function1) objRememberedValue2;
                composer.endReplaceableGroup();
                composer.startReplaceableGroup(-1958659433);
                boolean zChangedInstance3 = composer.changedInstance(ActivityC48073uDz.this);
                final ActivityC48073uDz activityC48073uDz3 = ActivityC48073uDz.this;
                java.lang.Object objRememberedValue3 = composer.rememberedValue();
                if (zChangedInstance3 || objRememberedValue3 == Composer.Companion.getEmpty()) {
                    objRememberedValue3 = new Function1() { // from class: o.uDF
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return ActivityC48073uDz.ActionBar.AEQbTJ(activityC48073uDz3, (Indicator) obj);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue3);
                }
                composer.endReplaceableGroup();
                uDK.EZpvd(stateFlowEZpvd, function0, function1, (Function1) objRememberedValue3, composer, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                    return;
                }
                return;
            }
            composer.skipToGroupEnd();
        }

        public static final Unit AEQbTJ(ActivityC48073uDz activityC48073uDz, Indicator indicator) {
            Intrinsics.checkNotNullParameter(indicator, "");
            int iOLrzqt = activityC48073uDz.OLrzqt().OLrzqt();
            uDU uduOLrzqt = activityC48073uDz.OLrzqt().EZpvd().getValue().OLrzqt();
            int iKWHzl = uduOLrzqt != null ? uduOLrzqt.KWHzl() : 6;
            ActivityResultLauncher activityResultLauncher = activityC48073uDz.valueOf;
            if (activityResultLauncher == null) {
                Intrinsics.gEmmrt("");
                activityResultLauncher = null;
            }
            activityResultLauncher.launch(new C48069uDv(indicator, iOLrzqt, iKWHzl));
            return Unit.INSTANCE;
        }

        public static final Unit AEQbTJ(ActivityC48073uDz activityC48073uDz) {
            activityC48073uDz.OLrzqt().KWHzl(AbstractC48070uDw.StateListAnimator.KWHzl);
            return Unit.INSTANCE;
        }

        public static final Unit KWHzl(ActivityC48073uDz activityC48073uDz, Indicator indicator) {
            Intrinsics.checkNotNullParameter(indicator, "");
            activityC48073uDz.OLrzqt().KWHzl(new AbstractC48070uDw.Activity(indicator.EZpvd()));
            return Unit.INSTANCE;
        }
    }

    public static final void EZpvd(ActivityC48073uDz activityC48073uDz, android.view.View view) {
        activityC48073uDz.OLrzqt().KWHzl(AbstractC48070uDw.Application.AEQbTJ);
    }

    public static final void valueOf(ActivityC48073uDz activityC48073uDz, android.view.View view) {
        activityC48073uDz.valueOf();
    }

    public final void valueOf() {
        java.util.List<Indicator> listAEQbTJ = OLrzqt().AEQbTJ();
        android.content.Intent intent = new android.content.Intent();
        intent.putParcelableArrayListExtra("extra_selected_indicators", new java.util.ArrayList<>(listAEQbTJ));
        setResult(-1, intent);
        finish();
    }

    /* JADX INFO: renamed from: o.uDz$Application */
    /* JADX INFO: loaded from: classes19.dex */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.uDz.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.uDz$Application */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ android.content.Intent createIntent$default(Application application, android.content.Context context, java.util.List list, java.util.List list2, int i, int i2, java.lang.Object obj) {
            if ((i2 & 2) != 0) {
                list = yDY.AhwBna();
            }
            if ((i2 & 4) != 0) {
                list2 = yDY.AhwBna();
            }
            if ((i2 & 8) != 0) {
                i = 6;
            }
            return application.copydefault(context, list, list2, i);
        }

        public final android.content.Intent copydefault(@NotNull android.content.Context context, @NotNull java.util.List<IndicatorSectionUiModel> list, @NotNull java.util.List<IndicatorSectionUiModel> list2, int i) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(list2, "");
            android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) ActivityC48073uDz.class);
            intent.putParcelableArrayListExtra("extra_pre_loaded_sections", new java.util.ArrayList<>(list));
            intent.putParcelableArrayListExtra("extra_default_sections", new java.util.ArrayList<>(list2));
            intent.putExtra("extra_max_indicators", i);
            return intent;
        }
    }

    @Override // o.AbstractActivityC48050uDc, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.AbstractActivityC48050uDc, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // o.AbstractActivityC48050uDc, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // o.AbstractActivityC48050uDc, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
