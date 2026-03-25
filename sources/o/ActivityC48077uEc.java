package o;

import android.view.View;
import androidx.activity.OnBackPressedCallback;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.foundation.text.selection.TextSelectionColors;
import androidx.compose.foundation.text.selection.TextSelectionColorsKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.ColorResources_androidKt;
import androidx.compose.ui.res.PrimitiveResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.IntentCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.okinc.tradingbot.impl.aiBot.ui.markdown.BotMarkdownEditorActivity$observeViewModel$1;
import com.okinc.tradingbot.impl.aiBot.ui.markdown.BotMarkdownEditorViewModel;
import com.okinc.unify_trade.biz.AiOrderReq;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.ActivityC48077uEc;
import o.C48033uCm;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.uEc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class ActivityC48077uEc extends AbstractActivityC48095uEu {
    public static final Application Companion = new Application(null);
    public static final int KWHzl = 8;
    public C48305uMo AEQbTJ;
    public final ActivityResultLauncher<android.content.Intent> AYXKKw;
    public java.lang.String EZpvd;
    public final boolean OLrzqt;
    public final InterfaceC56387yDm djBIcL;
    public final InterfaceC56387yDm isConnected;
    public AiOrderReq valueOf;
    public java.lang.String AhwBna = "";
    public java.lang.String gEmmrt = "";
    public final StateListAnimator copydefault = new StateListAnimator();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractActivityC33041mov
    public boolean getApplyNavigationBarInsets() {
        return this.OLrzqt;
    }

    public ActivityC48077uEc() {
        final Function0 function0 = null;
        this.isConnected = new ViewModelLazy(C56524yIo.AEQbTJ(BotMarkdownEditorViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.tradingbot.impl.aiBot.ui.markdown.BotMarkdownEditorActivity$special$$inlined$viewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.tradingbot.impl.aiBot.ui.markdown.BotMarkdownEditorActivity$special$$inlined$viewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.tradingbot.impl.aiBot.ui.markdown.BotMarkdownEditorActivity$special$$inlined$viewModels$default$3
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
        ActivityResultLauncher<android.content.Intent> activityResultLauncherRegisterForActivityResult = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: o.uDY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(java.lang.Object obj) {
                ActivityC48077uEc.KWHzl(this.KWHzl, (ActivityResult) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult, "");
        this.AYXKKw = activityResultLauncherRegisterForActivityResult;
        this.djBIcL = C56392yDr.copydefault(new Function0() { // from class: o.uEb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return ActivityC48077uEc.KWHzl();
            }
        });
        this.EZpvd = "";
    }

    /* JADX INFO: renamed from: o.uEc$Application */
    /* JADX INFO: loaded from: classes19.dex */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.uEc.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public static /* synthetic */ android.content.Intent newIntent$default(Application application, android.content.Context context, java.lang.String str, AiOrderReq aiOrderReq, int i, java.lang.Object obj) {
            if ((i & 2) != 0) {
                str = "";
            }
            if ((i & 4) != 0) {
                aiOrderReq = null;
            }
            return application.OLrzqt(context, str, aiOrderReq);
        }

        public final android.content.Intent OLrzqt(@NotNull android.content.Context context, @NotNull java.lang.String str, AiOrderReq aiOrderReq) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(str, "");
            android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) ActivityC48077uEc.class);
            intent.putExtra("ExtraInitialContent", str);
            if (aiOrderReq != null) {
                intent.putExtra("ExtraOrderReq", aiOrderReq);
            }
            return intent;
        }
    }

    public final BotMarkdownEditorViewModel AEQbTJ() {
        return (BotMarkdownEditorViewModel) this.isConnected.getValue();
    }

    /* JADX INFO: renamed from: o.uEc$StateListAnimator */
    public static final class StateListAnimator extends OnBackPressedCallback {
        public StateListAnimator() {
            super(true);
        }

        @Override // androidx.activity.OnBackPressedCallback
        public void handleOnBackPressed() {
            ActivityC48077uEc.this.isConnected();
        }
    }

    public static final void KWHzl(ActivityC48077uEc activityC48077uEc, ActivityResult activityResult) {
        C48305uMo c48305uMo;
        android.widget.FrameLayout frameLayout;
        int resultCode = activityResult.getResultCode();
        C55284xgz c55284xgz = null;
        if (resultCode == -1) {
            android.content.Intent data = activityResult.getData();
            java.lang.String stringExtra = data != null ? data.getStringExtra("extra_trading_strategy") : null;
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("ExtraOriginalPrompt", activityC48077uEc.EZpvd);
            intent.putExtra("ExtraTradingStrategy", stringExtra);
            activityC48077uEc.setResult(-1, intent);
            activityC48077uEc.finish();
            return;
        }
        if (resultCode != 0) {
            return;
        }
        android.content.Intent data2 = activityResult.getData();
        java.lang.String stringExtra2 = data2 != null ? data2.getStringExtra("extra_error_message") : null;
        if (stringExtra2 == null || stringExtra2.length() == 0 || (c48305uMo = activityC48077uEc.AEQbTJ) == null || (frameLayout = c48305uMo.AEQbTJ) == null) {
            return;
        }
        C55284xgz c55284xgzKWHzl = C55284xgz.Companion.KWHzl(frameLayout, stringExtra2);
        if (c55284xgzKWHzl != null) {
            c55284xgzKWHzl.AEQbTJ(frameLayout);
            c55284xgz = c55284xgzKWHzl;
        }
        if (c55284xgz != null) {
            c55284xgz.hDKMBd();
        }
    }

    public final android.graphics.drawable.Drawable OLrzqt() {
        return (android.graphics.drawable.Drawable) this.djBIcL.getValue();
    }

    public static final android.graphics.drawable.Drawable KWHzl() {
        android.graphics.drawable.Drawable drawableKWHzl = C33070mpX.KWHzl(C52761wXj.TaskDescription.zAEkPU);
        if (drawableKWHzl == null) {
            return null;
        }
        drawableKWHzl.setBounds(0, 0, C55298xhM.dpInt$default(12.0f, (android.content.Context) null, 1, (java.lang.Object) null), C55298xhM.dpInt$default(12.0f, (android.content.Context) null, 1, (java.lang.Object) null));
        return drawableKWHzl;
    }

    @Override // o.AbstractActivityC48095uEu, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        C48305uMo c48305uMoAEQbTJ = C48305uMo.AEQbTJ(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(c48305uMoAEQbTJ, "");
        this.AEQbTJ = c48305uMoAEQbTJ;
        setContentView(c48305uMoAEQbTJ.getRoot());
        ConstraintLayout root = c48305uMoAEQbTJ.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        C52712wVo.AEQbTJ(root);
        android.content.Intent intent = getIntent();
        Intrinsics.checkNotNullExpressionValue(intent, "");
        this.valueOf = (AiOrderReq) ((android.os.Parcelable) IntentCompat.getParcelableExtra(intent, "ExtraOrderReq", AiOrderReq.class));
        getOnBackPressedDispatcher().addCallback(this, this.copydefault);
        DbNXlk();
        AEQbTJ().AEQbTJ();
        c48305uMoAEQbTJ.copydefault.setTitle(C33070mpX.AYXKKw(C48033uCm.Fragment.RKDWNf));
        c48305uMoAEQbTJ.copydefault.setNavigationOnClickListener(new View.OnClickListener() { // from class: o.uEh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                ActivityC48077uEc.KWHzl(this.OLrzqt, view);
            }
        });
        C52794wYp c52794wYp = c48305uMoAEQbTJ.EZpvd;
        c52794wYp.setOnClickListener(new TaskDescription(c52794wYp, 1000L, this, c48305uMoAEQbTJ));
        java.lang.String stringExtra = getIntent().getStringExtra("ExtraInitialContent");
        java.lang.String str = stringExtra != null ? stringExtra : "";
        this.AhwBna = str;
        this.EZpvd = str;
        c48305uMoAEQbTJ.EZpvd.setEnabled(str.length() > 0 && this.AhwBna.length() <= 20000);
        c48305uMoAEQbTJ.OLrzqt.setContent(ComposableLambdaKt.composableLambdaInstance(-183775736, true, new Activity(c48305uMoAEQbTJ)));
    }

    public static final void KWHzl(ActivityC48077uEc activityC48077uEc, android.view.View view) {
        activityC48077uEc.isConnected();
    }

    /* JADX INFO: renamed from: o.uEc$TaskDescription */
    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ ActivityC48077uEc AEQbTJ;
        public final /* synthetic */ C48305uMo KWHzl;
        public final /* synthetic */ android.view.View OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, ActivityC48077uEc activityC48077uEc, C48305uMo c48305uMo) {
            this.OLrzqt = view;
            this.copydefault = j;
            this.AEQbTJ = activityC48077uEc;
            this.KWHzl = c48305uMo;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.copydefault || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                C33054mpH.OLrzqt(this.AEQbTJ, this.KWHzl.getRoot());
                this.KWHzl.OLrzqt.clearFocus();
                this.AEQbTJ.gEmmrt();
            }
        }
    }

    /* JADX INFO: renamed from: o.uEc$Activity */
    /* JADX INFO: loaded from: classes19.dex */
    public static final class Activity implements Function2<Composer, java.lang.Integer, Unit> {
        public final /* synthetic */ C48305uMo KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(C48305uMo c48305uMo) {
            this.KWHzl = c48305uMo;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function2
        public /* synthetic */ Unit invoke(Composer composer, java.lang.Integer num) {
            copydefault(composer, num.intValue());
            return Unit.INSTANCE;
        }

        /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [187=4] */
        public final void copydefault(Composer composer, int i) {
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-183775736, i, -1, "com.okinc.tradingbot.impl.aiBot.ui.markdown.BotMarkdownEditorActivity.onCreate.<anonymous> (BotMarkdownEditorActivity.kt:186)");
            }
            composer.startReplaceableGroup(-223328181);
            ActivityC48077uEc activityC48077uEc = ActivityC48077uEc.this;
            java.lang.Object objRememberedValue = composer.rememberedValue();
            if (objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new TextFieldValue(activityC48077uEc.AhwBna, 0L, (TextRange) null, 6, (DefaultConstructorMarker) null), null, 2, null);
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceableGroup();
            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{TextSelectionColorsKt.getLocalTextSelectionColors().provides(new TextSelectionColors(ColorKt.Color(C33070mpX.copydefault(C52761wXj.Activity.OJuSTm)), ColorKt.Color(C33070mpX.copydefault(C52761wXj.Activity.sElUiK)), null))}, ComposableLambdaKt.composableLambda(composer, -1760358072, true, new AnonymousClass4(ActivityC48077uEc.this, this.KWHzl, (MutableState) objRememberedValue)), composer, 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: renamed from: o.uEc$Activity$4, reason: invalid class name */
        public static final class AnonymousClass4 implements Function2<Composer, java.lang.Integer, Unit> {
            public final /* synthetic */ MutableState<TextFieldValue> EZpvd;
            public final /* synthetic */ C48305uMo OLrzqt;
            public final /* synthetic */ ActivityC48077uEc copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass4(ActivityC48077uEc activityC48077uEc, C48305uMo c48305uMo, MutableState<TextFieldValue> mutableState) {
                this.copydefault = activityC48077uEc;
                this.OLrzqt = c48305uMo;
                this.EZpvd = mutableState;
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // kotlin.jvm.functions.Function2
            public /* synthetic */ Unit invoke(Composer composer, java.lang.Integer num) {
                AEQbTJ(composer, num.intValue());
                return Unit.INSTANCE;
            }

            public final void AEQbTJ(Composer composer, int i) {
                final MutableState<TextFieldValue> mutableState;
                if ((i & 3) != 2 || !composer.getSkipping()) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1760358072, i, -1, "com.okinc.tradingbot.impl.aiBot.ui.markdown.BotMarkdownEditorActivity.onCreate.<anonymous>.<anonymous> (BotMarkdownEditorActivity.kt:194)");
                    }
                    Modifier.Companion companion = Modifier.Companion;
                    Modifier modifierImePadding = WindowInsetsPadding_androidKt.imePadding(WindowInsetsPadding_androidKt.navigationBarsPadding(SizeKt.fillMaxSize$default(companion, 0.0f, 1, null)));
                    final ActivityC48077uEc activityC48077uEc = this.copydefault;
                    final C48305uMo c48305uMo = this.OLrzqt;
                    final MutableState<TextFieldValue> mutableState2 = this.EZpvd;
                    composer.startReplaceableGroup(-483455358);
                    Arrangement arrangement = Arrangement.INSTANCE;
                    Arrangement.Vertical top = arrangement.getTop();
                    Alignment.Companion companion2 = Alignment.Companion;
                    MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion2.getStart(), composer, 0);
                    composer.startReplaceableGroup(-1323940314);
                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                    ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
                    Function0<ComposeUiNode> constructor = companion3.getConstructor();
                    yHO<SkippableUpdater<ComposeUiNode>, Composer, java.lang.Integer, Unit> yhoModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierImePadding);
                    if (!(composer.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer.startReusableNode();
                    if (composer.getInserting()) {
                        composer.createNode(constructor);
                    } else {
                        composer.useNode();
                    }
                    Composer composerM2783constructorimpl = Updater.m2783constructorimpl(composer);
                    Updater.m2790setimpl(composerM2783constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
                    Updater.m2790setimpl(composerM2783constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, java.lang.Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                    if (composerM2783constructorimpl.getInserting() || !Intrinsics.EZpvd(composerM2783constructorimpl.rememberedValue(), java.lang.Integer.valueOf(currentCompositeKeyHash))) {
                        composerM2783constructorimpl.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash));
                        composerM2783constructorimpl.apply(java.lang.Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    yhoModifierMaterializerOf.invoke(SkippableUpdater.m2774boximpl(SkippableUpdater.m2775constructorimpl(composer)), composer, 0);
                    composer.startReplaceableGroup(2058660585);
                    Modifier modifierM675paddingqDBjuR0$default = PaddingKt.m675paddingqDBjuR0$default(PaddingKt.m673paddingVpY3zN4$default(ColumnScope.weight$default(ColumnScopeInstance.INSTANCE, companion, 1.0f, false, 2, null), PrimitiveResources_androidKt.dimensionResource(C52761wXj.StateListAnimator.AEQbTJ, composer, 0), 0.0f, 2, null), 0.0f, androidx.compose.ui.unit.Dp.m5414constructorimpl(6), 0.0f, 0.0f, 13, null);
                    TextFieldValue textFieldValueEZpvd = Activity.EZpvd(mutableState2);
                    composer.startReplaceableGroup(-130804228);
                    boolean zChangedInstance = composer.changedInstance(activityC48077uEc);
                    boolean zChangedInstance2 = composer.changedInstance(c48305uMo);
                    java.lang.Object objRememberedValue = composer.rememberedValue();
                    if ((zChangedInstance | zChangedInstance2) || objRememberedValue == Composer.Companion.getEmpty()) {
                        objRememberedValue = new Function1() { // from class: o.uEg
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj) {
                                return ActivityC48077uEc.Activity.AnonymousClass4.AEQbTJ(activityC48077uEc, c48305uMo, mutableState2, (TextFieldValue) obj);
                            }
                        };
                        composer.updateRememberedValue(objRememberedValue);
                    }
                    composer.endReplaceableGroup();
                    C48086uEl.OLrzqt(modifierM675paddingqDBjuR0$default, textFieldValueEZpvd, (Function1) objRememberedValue, StringResources_androidKt.stringResource(C48033uCm.Fragment.zuWLRA, composer, 0), AccessibilityNodeInfoCompat.EXTRA_DATA_TEXT_CHARACTER_LOCATION_ARG_MAX_LENGTH, composer, 24576, 0);
                    final long jColorResource = ColorResources_androidKt.colorResource(C52761wXj.Activity.zuBGHE, composer, 0);
                    Modifier modifierWrapContentHeight$default = SizeKt.wrapContentHeight$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), null, false, 3, null);
                    composer.startReplaceableGroup(-130773987);
                    boolean zChanged = composer.changed(jColorResource);
                    java.lang.Object objRememberedValue2 = composer.rememberedValue();
                    if (zChanged || objRememberedValue2 == Composer.Companion.getEmpty()) {
                        objRememberedValue2 = new Function1() { // from class: o.uEd
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj) {
                                return ActivityC48077uEc.Activity.AnonymousClass4.KWHzl(jColorResource, (DrawScope) obj);
                            }
                        };
                        composer.updateRememberedValue(objRememberedValue2);
                    }
                    composer.endReplaceableGroup();
                    Modifier modifierM672paddingVpY3zN4 = PaddingKt.m672paddingVpY3zN4(DrawModifierKt.drawBehind(modifierWrapContentHeight$default, (Function1) objRememberedValue2), PrimitiveResources_androidKt.dimensionResource(C52761wXj.StateListAnimator.AEQbTJ, composer, 0), androidx.compose.ui.unit.Dp.m5414constructorimpl(14));
                    composer.startReplaceableGroup(693286680);
                    MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getStart(), companion2.getTop(), composer, 0);
                    composer.startReplaceableGroup(-1323940314);
                    int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
                    Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                    yHO<SkippableUpdater<ComposeUiNode>, Composer, java.lang.Integer, Unit> yhoModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierM672paddingVpY3zN4);
                    if (!(composer.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer.startReusableNode();
                    if (composer.getInserting()) {
                        composer.createNode(constructor2);
                    } else {
                        composer.useNode();
                    }
                    Composer composerM2783constructorimpl2 = Updater.m2783constructorimpl(composer);
                    Updater.m2790setimpl(composerM2783constructorimpl2, measurePolicyRowMeasurePolicy, companion3.getSetMeasurePolicy());
                    Updater.m2790setimpl(composerM2783constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, java.lang.Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
                    if (composerM2783constructorimpl2.getInserting() || !Intrinsics.EZpvd(composerM2783constructorimpl2.rememberedValue(), java.lang.Integer.valueOf(currentCompositeKeyHash2))) {
                        composerM2783constructorimpl2.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash2));
                        composerM2783constructorimpl2.apply(java.lang.Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                    }
                    yhoModifierMaterializerOf2.invoke(SkippableUpdater.m2774boximpl(SkippableUpdater.m2775constructorimpl(composer)), composer, 0);
                    composer.startReplaceableGroup(2058660585);
                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                    java.lang.String strStringResource = StringResources_androidKt.stringResource(C48033uCm.Fragment.accept, composer, 0);
                    android.graphics.drawable.Drawable drawableOLrzqt = activityC48077uEc.OLrzqt();
                    composer.startReplaceableGroup(-2126392832);
                    boolean zChangedInstance3 = composer.changedInstance(activityC48077uEc);
                    boolean zChangedInstance4 = composer.changedInstance(c48305uMo);
                    java.lang.Object objRememberedValue3 = composer.rememberedValue();
                    if ((zChangedInstance3 || zChangedInstance4) || objRememberedValue3 == Composer.Companion.getEmpty()) {
                        mutableState = mutableState2;
                        objRememberedValue3 = new Function0() { // from class: o.uEm
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                return ActivityC48077uEc.Activity.AnonymousClass4.KWHzl(activityC48077uEc, c48305uMo, mutableState);
                            }
                        };
                        composer.updateRememberedValue(objRememberedValue3);
                    } else {
                        mutableState = mutableState2;
                    }
                    composer.endReplaceableGroup();
                    C52736wWl.KWHzl(null, 28, 260, strStringResource, null, drawableOLrzqt, (Function0) objRememberedValue3, composer, 432, 17);
                    int length = 20000 - Activity.EZpvd(mutableState).getText().length();
                    boolean z = length < 0;
                    TextKt.m2072Text4IGK_g(pTB.formatICUNumber$default(java.lang.Integer.valueOf(length), null, C38307pTy.Companion.EZpvd(0), null, null, 13, null), rowScopeInstance.align(RowScope.weight$default(rowScopeInstance, PaddingKt.m675paddingqDBjuR0$default(companion, androidx.compose.ui.unit.Dp.m5414constructorimpl(12), 0.0f, 0.0f, 0.0f, 14, null), 1.0f, false, 2, null), companion2.getCenterVertically()), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m5279boximpl(TextAlign.Companion.m5287getEnde0LSkKk()), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, C52698wVa.OLrzqt(C52761wXj.LoaderManager.QOLQEE, java.lang.Integer.valueOf(z ? C52761wXj.Activity.clearRegistrations : C52761wXj.Activity.v), composer, 0, 0), composer, 0, 0, 65020);
                    composer.endReplaceableGroup();
                    composer.endNode();
                    composer.endReplaceableGroup();
                    composer.endReplaceableGroup();
                    composer.endReplaceableGroup();
                    composer.endNode();
                    composer.endReplaceableGroup();
                    composer.endReplaceableGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        return;
                    }
                    return;
                }
                composer.skipToGroupEnd();
            }

            public static final Unit AEQbTJ(ActivityC48077uEc activityC48077uEc, C48305uMo c48305uMo, MutableState mutableState, TextFieldValue textFieldValue) {
                Intrinsics.checkNotNullParameter(textFieldValue, "");
                Activity.EZpvd(mutableState, textFieldValue);
                activityC48077uEc.EZpvd = textFieldValue.getText();
                c48305uMo.EZpvd.setEnabled(textFieldValue.getText().length() > 0 && textFieldValue.getText().length() <= 20000);
                return Unit.INSTANCE;
            }

            public static final Unit KWHzl(ActivityC48077uEc activityC48077uEc, C48305uMo c48305uMo, MutableState mutableState) {
                if (!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) activityC48077uEc.gEmmrt)) {
                    Activity.EZpvd(mutableState, TextFieldValue.m5138copy3r_uNRQ$default(Activity.EZpvd(mutableState), activityC48077uEc.gEmmrt, 0L, (TextRange) null, 6, (java.lang.Object) null));
                    activityC48077uEc.EZpvd = activityC48077uEc.gEmmrt;
                    c48305uMo.EZpvd.setEnabled(activityC48077uEc.gEmmrt.length() <= 20000);
                }
                return Unit.INSTANCE;
            }

            public static final Unit KWHzl(long j, DrawScope drawScope) {
                Intrinsics.checkNotNullParameter(drawScope, "");
                float fMo516toPx0680j_4 = drawScope.mo516toPx0680j_4(androidx.compose.ui.unit.Dp.m5414constructorimpl((float) 0.5d));
                float f = fMo516toPx0680j_4 / 2;
                DrawScope.m3678drawLineNGM6Ib0$default(drawScope, j, OffsetKt.Offset(0.0f, f), OffsetKt.Offset(androidx.compose.ui.geometry.Size.m2979getWidthimpl(drawScope.mo3691getSizeNHjbRc()), f), fMo516toPx0680j_4, 0, null, 0.0f, null, 0, 496, null);
                return Unit.INSTANCE;
            }
        }

        public static final TextFieldValue EZpvd(MutableState<TextFieldValue> mutableState) {
            return mutableState.getValue();
        }

        public static final void EZpvd(MutableState<TextFieldValue> mutableState, TextFieldValue textFieldValue) {
            mutableState.setValue(textFieldValue);
        }
    }

    private final void DbNXlk() {
        C52692wUv.flowAndCollect$default(AEQbTJ().fJNWhG(), this, null, new BotMarkdownEditorActivity$observeViewModel$1(this, null), 2, null);
    }

    public final void gEmmrt() {
        AiOrderReq aiOrderReq = this.valueOf;
        if (aiOrderReq == null) {
            finish();
            return;
        }
        this.AYXKKw.launch(uFV.Companion.AEQbTJ(this, aiOrderReq.copy((4351 & 1) != 0 ? aiOrderReq.aiModel : null, (4351 & 2) != 0 ? aiOrderReq.instIds : null, (4351 & 4) != 0 ? aiOrderReq.instType : null, (4351 & 8) != 0 ? aiOrderReq.ordType : null, (4351 & 16) != 0 ? aiOrderReq.tdMode : null, (4351 & 32) != 0 ? aiOrderReq.dataSetting : null, (4351 & 64) != 0 ? aiOrderReq.userPrompt : this.EZpvd, (4351 & 128) != 0 ? aiOrderReq.userPromptEn : null, (4351 & 256) != 0 ? aiOrderReq.totalAmt : null, (4351 & 512) != 0 ? aiOrderReq.quoteCcy : null, (4351 & 1024) != 0 ? aiOrderReq.tpRatio : null, (4351 & 2048) != 0 ? aiOrderReq.slRatio : null, (4351 & 4096) != 0 ? aiOrderReq.systemPromptVersion : null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void isConnected() {
        if (AhwBna()) {
            djBIcL();
        } else {
            finish();
        }
    }

    public final boolean AhwBna() {
        return !Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) this.AhwBna);
    }

    public final void djBIcL() {
        final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(this);
        viewOnClickListenerC54939xaY.setTitle(C33070mpX.AYXKKw(C48033uCm.Fragment.DXXBbs));
        viewOnClickListenerC54939xaY.EZpvd(C33070mpX.AYXKKw(C48033uCm.Fragment.ODWQjV));
        viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) C33070mpX.AYXKKw(C48033uCm.Fragment.DeEinT), new View.OnClickListener() { // from class: o.uEe
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                ActivityC48077uEc.AEQbTJ(viewOnClickListenerC54939xaY, this, view);
            }
        });
        viewOnClickListenerC54939xaY.AEQbTJ(C33070mpX.AYXKKw(C48033uCm.Fragment.gSBher), new View.OnClickListener() { // from class: o.uEf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                ActivityC48077uEc.EZpvd(viewOnClickListenerC54939xaY, view);
            }
        });
        viewOnClickListenerC54939xaY.show();
    }

    public static final void AEQbTJ(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, ActivityC48077uEc activityC48077uEc, android.view.View view) {
        viewOnClickListenerC54939xaY.dismiss();
        activityC48077uEc.finish();
    }

    public static final void EZpvd(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        viewOnClickListenerC54939xaY.dismiss();
    }

    @Override // o.AbstractActivityC48095uEu, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        this.copydefault.remove();
        this.AEQbTJ = null;
        super.onDestroy();
    }

    @Override // o.AbstractActivityC48095uEu, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.AbstractActivityC48095uEu, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // o.AbstractActivityC48095uEu, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // o.AbstractActivityC48095uEu, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
