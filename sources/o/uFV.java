package o;

import android.os.Build;
import android.view.View;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.ViewCompositionStrategy;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.core.content.IntentCompat;
import androidx.core.os.BundleKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.google.android.material.appbar.MaterialToolbar;
import com.okinc.tradingbot.impl.aiBot.dto.PreviewAiStrategyResponseDto;
import com.okinc.tradingbot.impl.aiBot.ui.preview.PreviewAiStrategyResultActivity$observeViewModel$1;
import com.okinc.tradingbot.impl.aiBot.ui.preview.PreviewAiStrategyViewModel;
import com.okinc.unify_trade.biz.AiOrderReq;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C48033uCm;
import o.C55284xgz;
import o.C55688xof;
import o.uFV;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public final class uFV extends uFX {
    public static final Activity Companion = new Activity(null);
    public static final int OLrzqt = 8;
    public C48312uMv AYXKKw;
    public final InterfaceC56387yDm djBIcL;
    public PreviewAiStrategyResponseDto valueOf;

    public uFV() {
        final Function0 function0 = null;
        this.djBIcL = new ViewModelLazy(C56524yIo.AEQbTJ(PreviewAiStrategyViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.tradingbot.impl.aiBot.ui.preview.PreviewAiStrategyResultActivity$special$$inlined$viewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.tradingbot.impl.aiBot.ui.preview.PreviewAiStrategyResultActivity$special$$inlined$viewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.tradingbot.impl.aiBot.ui.preview.PreviewAiStrategyResultActivity$special$$inlined$viewModels$default$3
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

    /* JADX DEBUG: Possible override for method o.uFX.OLrzqt()V */
    public final PreviewAiStrategyViewModel OLrzqt() {
        return (PreviewAiStrategyViewModel) this.djBIcL.getValue();
    }

    @Override // o.uFX, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        C48312uMv c48312uMvKWHzl = C48312uMv.KWHzl(getLayoutInflater());
        this.AYXKKw = c48312uMvKWHzl;
        C48312uMv c48312uMv = null;
        if (c48312uMvKWHzl == null) {
            Intrinsics.gEmmrt("");
            c48312uMvKWHzl = null;
        }
        setContentView(c48312uMvKWHzl.getRoot());
        C48312uMv c48312uMv2 = this.AYXKKw;
        if (c48312uMv2 == null) {
            Intrinsics.gEmmrt("");
        } else {
            c48312uMv = c48312uMv2;
        }
        ConstraintLayout root = c48312uMv.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        C52712wVo.AEQbTJ(root);
        valueOf();
        AhwBna();
        android.content.Intent intent = getIntent();
        Intrinsics.checkNotNullExpressionValue(intent, "");
        AiOrderReq aiOrderReq = (AiOrderReq) ((android.os.Parcelable) IntentCompat.getParcelableExtra(intent, "extra_order_req", AiOrderReq.class));
        if (aiOrderReq != null) {
            OLrzqt().OLrzqt(aiOrderReq);
        } else {
            finish();
        }
    }

    private final void valueOf() {
        C48312uMv c48312uMv = this.AYXKKw;
        if (c48312uMv == null) {
            Intrinsics.gEmmrt("");
            c48312uMv = null;
        }
        c48312uMv.OLrzqt.setNavigationOnClickListener(new View.OnClickListener() { // from class: o.uFU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                uFV.AEQbTJ(this.copydefault, view);
            }
        });
    }

    public static final void AEQbTJ(uFV ufv, android.view.View view) {
        ufv.setResult(0);
        ufv.finish();
    }

    private final void AhwBna() {
        C52692wUv.flowAndCollect$default(OLrzqt().fJNWhG(), this, null, new PreviewAiStrategyResultActivity$observeViewModel$1(this, null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void djBIcL() {
        C48312uMv c48312uMv = this.AYXKKw;
        C48312uMv c48312uMv2 = null;
        if (c48312uMv == null) {
            Intrinsics.gEmmrt("");
            c48312uMv = null;
        }
        Group group = c48312uMv.EZpvd;
        Intrinsics.checkNotNullExpressionValue(group, "");
        group.setVisibility(0);
        C48312uMv c48312uMv3 = this.AYXKKw;
        if (c48312uMv3 == null) {
            Intrinsics.gEmmrt("");
            c48312uMv3 = null;
        }
        Group group2 = c48312uMv3.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(group2, "");
        group2.setVisibility(8);
        C48312uMv c48312uMv4 = this.AYXKKw;
        if (c48312uMv4 == null) {
            Intrinsics.gEmmrt("");
        } else {
            c48312uMv2 = c48312uMv4;
        }
        MaterialToolbar materialToolbar = c48312uMv2.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(materialToolbar, "");
        materialToolbar.setVisibility(8);
    }

    public final void gEmmrt() {
        C48312uMv c48312uMv = this.AYXKKw;
        C48312uMv c48312uMv2 = null;
        if (c48312uMv == null) {
            Intrinsics.gEmmrt("");
            c48312uMv = null;
        }
        Group group = c48312uMv.EZpvd;
        Intrinsics.checkNotNullExpressionValue(group, "");
        group.setVisibility(8);
        C48312uMv c48312uMv3 = this.AYXKKw;
        if (c48312uMv3 == null) {
            Intrinsics.gEmmrt("");
            c48312uMv3 = null;
        }
        Group group2 = c48312uMv3.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(group2, "");
        group2.setVisibility(0);
        C48312uMv c48312uMv4 = this.AYXKKw;
        if (c48312uMv4 == null) {
            Intrinsics.gEmmrt("");
            c48312uMv4 = null;
        }
        MaterialToolbar materialToolbar = c48312uMv4.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(materialToolbar, "");
        materialToolbar.setVisibility(0);
        C48312uMv c48312uMv5 = this.AYXKKw;
        if (c48312uMv5 == null) {
            Intrinsics.gEmmrt("");
            c48312uMv5 = null;
        }
        c48312uMv5.OLrzqt.setTitle(C33070mpX.AYXKKw(C48033uCm.Fragment.DCJXGO));
        C48312uMv c48312uMv6 = this.AYXKKw;
        if (c48312uMv6 == null) {
            Intrinsics.gEmmrt("");
            c48312uMv6 = null;
        }
        AEQbTJ(c48312uMv6);
        C48312uMv c48312uMv7 = this.AYXKKw;
        if (c48312uMv7 == null) {
            Intrinsics.gEmmrt("");
        } else {
            c48312uMv2 = c48312uMv7;
        }
        C52794wYp c52794wYpCopydefault = c48312uMv2.KWHzl.copydefault();
        if (c52794wYpCopydefault != null) {
            AEQbTJ(c52794wYpCopydefault);
        }
    }

    public final void copydefault(java.lang.Throwable th) {
        android.content.Intent intent = new android.content.Intent();
        java.lang.String message = th.getMessage();
        if (message == null) {
            message = "";
        }
        if (message.length() == 0) {
            message = C43422row.OLrzqt();
        }
        intent.putExtra("extra_error_message", message);
        setResult(0, intent);
        finish();
    }

    public final void AEQbTJ(C48312uMv c48312uMv) {
        PreviewAiStrategyResponseDto previewAiStrategyResponseDto = this.valueOf;
        if (previewAiStrategyResponseDto == null) {
            return;
        }
        c48312uMv.copydefault.setViewCompositionStrategy(ViewCompositionStrategy.DisposeOnViewTreeLifecycleDestroyed.INSTANCE);
        c48312uMv.copydefault.setContent(ComposableLambdaKt.composableLambdaInstance(662248962, true, new ActionBar(previewAiStrategyResponseDto, this)));
    }

    public static final class ActionBar implements Function2<Composer, java.lang.Integer, Unit> {
        public final /* synthetic */ uFV AEQbTJ;
        public final /* synthetic */ PreviewAiStrategyResponseDto copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(PreviewAiStrategyResponseDto previewAiStrategyResponseDto, uFV ufv) {
            this.copydefault = previewAiStrategyResponseDto;
            this.AEQbTJ = ufv;
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
                    ComposerKt.traceEventStart(662248962, i, -1, "com.okinc.tradingbot.impl.aiBot.ui.preview.PreviewAiStrategyResultActivity.setupContent.<anonymous> (PreviewAiStrategyResultActivity.kt:126)");
                }
                PreviewAiStrategyResponseDto previewAiStrategyResponseDto = this.copydefault;
                composer.startReplaceableGroup(-1052830322);
                boolean zChangedInstance = composer.changedInstance(this.AEQbTJ);
                final uFV ufv = this.AEQbTJ;
                java.lang.Object objRememberedValue = composer.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.Companion.getEmpty()) {
                    objRememberedValue = new Function1() { // from class: o.uGb
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return uFV.ActionBar.KWHzl(ufv, ((java.lang.Boolean) obj).booleanValue());
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue);
                }
                Function1 function1 = (Function1) objRememberedValue;
                composer.endReplaceableGroup();
                composer.startReplaceableGroup(-1052822914);
                boolean zChangedInstance2 = composer.changedInstance(this.AEQbTJ);
                final uFV ufv2 = this.AEQbTJ;
                java.lang.Object objRememberedValue2 = composer.rememberedValue();
                if (zChangedInstance2 || objRememberedValue2 == Composer.Companion.getEmpty()) {
                    objRememberedValue2 = new Function1() { // from class: o.uGa
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return uFV.ActionBar.KWHzl(ufv2, (java.lang.String) obj);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue2);
                }
                composer.endReplaceableGroup();
                uFZ.OLrzqt(previewAiStrategyResponseDto, function1, (Function1) objRememberedValue2, null, composer, 0, 8);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                    return;
                }
                return;
            }
            composer.skipToGroupEnd();
        }

        public static final Unit KWHzl(uFV ufv, boolean z) {
            C48312uMv c48312uMv = ufv.AYXKKw;
            C48312uMv c48312uMv2 = null;
            if (c48312uMv == null) {
                Intrinsics.gEmmrt("");
                c48312uMv = null;
            }
            C52794wYp c52794wYpCopydefault = c48312uMv.KWHzl.copydefault();
            if (c52794wYpCopydefault != null) {
                C48312uMv c48312uMv3 = ufv.AYXKKw;
                if (c48312uMv3 == null) {
                    Intrinsics.gEmmrt("");
                } else {
                    c48312uMv2 = c48312uMv3;
                }
                C52794wYp c52794wYpCopydefault2 = c48312uMv2.KWHzl.copydefault();
                c52794wYpCopydefault.setEnabled((c52794wYpCopydefault2 != null ? c52794wYpCopydefault2.isEnabled() : false) | z);
            }
            return Unit.INSTANCE;
        }

        public static final Unit KWHzl(uFV ufv, java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            ufv.copydefault(str);
            if (Build.VERSION.SDK_INT <= 33) {
                ufv.AYXKKw();
            }
            return Unit.INSTANCE;
        }
    }

    public final void AEQbTJ(C52794wYp c52794wYp) {
        final PreviewAiStrategyResponseDto previewAiStrategyResponseDto = this.valueOf;
        if (previewAiStrategyResponseDto == null) {
            return;
        }
        c52794wYp.setOKDSType(257);
        c52794wYp.setOKDSSize(52);
        c52794wYp.setText(getString(C55688xof.Application.PipHintTrackerKt));
        c52794wYp.setEnabled(false);
        c52794wYp.setOnClickListener(new View.OnClickListener() { // from class: o.uFW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                uFV.AEQbTJ(this.EZpvd, previewAiStrategyResponseDto, view);
            }
        });
    }

    public static final void AEQbTJ(uFV ufv, PreviewAiStrategyResponseDto previewAiStrategyResponseDto, android.view.View view) {
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("extra_trading_strategy", previewAiStrategyResponseDto.AEQbTJ());
        ufv.setResult(-1, intent);
        ufv.finish();
    }

    public final void copydefault(java.lang.String str) {
        java.lang.Object systemService = getSystemService("clipboard");
        Intrinsics.copydefault(systemService, "");
        ((android.content.ClipboardManager) systemService).setPrimaryClip(android.content.ClipData.newPlainText("AI Strategy", str));
    }

    public final void AYXKKw() {
        C55284xgz.Activity activity = C55284xgz.Companion;
        C48312uMv c48312uMv = this.AYXKKw;
        if (c48312uMv == null) {
            Intrinsics.gEmmrt("");
            c48312uMv = null;
        }
        ComposeView composeView = c48312uMv.copydefault;
        Intrinsics.checkNotNullExpressionValue(composeView, "");
        java.lang.String string = getString(C48033uCm.Fragment.sVaiLC);
        Intrinsics.checkNotNullExpressionValue(string, "");
        C55284xgz c55284xgzKWHzl = activity.KWHzl(composeView, string);
        if (c55284xgzKWHzl != null) {
            c55284xgzKWHzl.isConnected(3);
            c55284xgzKWHzl.hDKMBd();
        }
    }

    /* JADX INFO: loaded from: classes19.dex */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.uFV.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final android.content.Intent AEQbTJ(@NotNull android.content.Context context, @NotNull AiOrderReq aiOrderReq) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(aiOrderReq, "");
            android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) uFV.class);
            intent.putExtras(BundleKt.bundleOf(C56390yDp.OLrzqt("extra_order_req", aiOrderReq)));
            return intent;
        }
    }

    @Override // o.uFX, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.uFX, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // o.uFX, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // o.uFX, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
