package o;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.ViewCompositionStrategy;
import com.okinc.planet_api.publisher.PlanetPublisherPluginPreviewType;
import com.okinc.tradingbot.impl.planet.model.BotUiState;
import com.okinc.tradingbot.impl.planet.ui.PlanetOngoingBotWrapperView$composeView$1$1$1$1;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wqi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C53715wqi extends android.widget.FrameLayout {
    public final MutableState OLrzqt;
    public final MutableState copydefault;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0016: CONSTRUCTOR 
  (r7v0 android.content.Context)
  (wrap:android.util.AttributeSet:0x0005: TERNARY null = ((wrap:int:0x0000: ARITH (r12v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r8v0 android.util.AttributeSet))
  (wrap:int:0x000b: TERNARY null = ((wrap:int:0x0006: ARITH (r12v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r9v0 int))
  (r10v0 com.okinc.tradingbot.impl.planet.model.BotUiState)
  (wrap:com.okinc.planet_api.publisher.PlanetPublisherPluginPreviewType:?: TERNARY null = ((wrap:int:0x000c: ARITH (r12v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (wrap:com.okinc.planet_api.publisher.PlanetPublisherPluginPreviewType:0x0010: SGET  A[WRAPPED] (LINE:27) com.okinc.planet_api.publisher.PlanetPublisherPluginPreviewType.PUBLISHER com.okinc.planet_api.publisher.PlanetPublisherPluginPreviewType) : (r11v0 com.okinc.planet_api.publisher.PlanetPublisherPluginPreviewType))
 A[MD:(android.content.Context, android.util.AttributeSet, int, com.okinc.tradingbot.impl.planet.model.BotUiState, com.okinc.planet_api.publisher.PlanetPublisherPluginPreviewType):void (m)] (LINE:22) call: o.wqi.<init>(android.content.Context, android.util.AttributeSet, int, com.okinc.tradingbot.impl.planet.model.BotUiState, com.okinc.planet_api.publisher.PlanetPublisherPluginPreviewType):void type: THIS */
    public /* synthetic */ C53715wqi(android.content.Context context, android.util.AttributeSet attributeSet, int i, BotUiState botUiState, PlanetPublisherPluginPreviewType planetPublisherPluginPreviewType, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i, botUiState, (i2 & 16) != 0 ? PlanetPublisherPluginPreviewType.PUBLISHER : planetPublisherPluginPreviewType);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C53715wqi(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i, @NotNull BotUiState botUiState, @NotNull PlanetPublisherPluginPreviewType planetPublisherPluginPreviewType) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(botUiState, "");
        Intrinsics.checkNotNullParameter(planetPublisherPluginPreviewType, "");
        this.OLrzqt = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(botUiState, null, 2, null);
        this.copydefault = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(planetPublisherPluginPreviewType, null, 2, null);
        ComposeView composeView = new ComposeView(context, null, 0, 6, null);
        composeView.setViewCompositionStrategy(ViewCompositionStrategy.DisposeOnDetachedFromWindow.INSTANCE);
        composeView.setContent(ComposableLambdaKt.composableLambdaInstance(-2689423, true, new StateListAnimator()));
        addView(composeView, -1, -2);
    }

    /* JADX INFO: renamed from: o.wqi$StateListAnimator */
    public static final class StateListAnimator implements Function2<Composer, java.lang.Integer, Unit> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator() {
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
                    ComposerKt.traceEventStart(-2689423, i, -1, "com.okinc.tradingbot.impl.planet.ui.PlanetOngoingBotWrapperView.<anonymous>.<anonymous> (PlanetOngoingBotWrapperView.kt:38)");
                }
                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null);
                BotUiState botUiStateKWHzl = C53715wqi.this.KWHzl();
                PlanetPublisherPluginPreviewType planetPublisherPluginPreviewTypeEZpvd = C53715wqi.this.EZpvd();
                C53715wqi c53715wqi = C53715wqi.this;
                composer.startReplaceableGroup(-274310660);
                boolean zChanged = composer.changed(c53715wqi);
                java.lang.Object objRememberedValue = composer.rememberedValue();
                if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
                    objRememberedValue = new PlanetOngoingBotWrapperView$composeView$1$1$1$1(c53715wqi);
                    composer.updateRememberedValue(objRememberedValue);
                }
                composer.endReplaceableGroup();
                C53711wqe.EZpvd(modifierFillMaxWidth$default, botUiStateKWHzl, planetPublisherPluginPreviewTypeEZpvd, (Function0) ((InterfaceC56555yJs) objRememberedValue), composer, 6, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                    return;
                }
                return;
            }
            composer.skipToGroupEnd();
        }
    }

    public static /* synthetic */ void update$default(C53715wqi c53715wqi, BotUiState botUiState, PlanetPublisherPluginPreviewType planetPublisherPluginPreviewType, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            planetPublisherPluginPreviewType = c53715wqi.EZpvd();
        }
        c53715wqi.OLrzqt(botUiState, planetPublisherPluginPreviewType);
    }

    public final void OLrzqt(@NotNull BotUiState botUiState, @NotNull PlanetPublisherPluginPreviewType planetPublisherPluginPreviewType) {
        Intrinsics.checkNotNullParameter(botUiState, "");
        Intrinsics.checkNotNullParameter(planetPublisherPluginPreviewType, "");
        EZpvd(botUiState);
        KWHzl(planetPublisherPluginPreviewType);
    }

    public final void AEQbTJ() {
        try {
            Result.Application application = Result.Companion;
            if (hasOnClickListeners()) {
                performClick();
            } else {
                android.view.ViewParent parent = getParent();
                android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
                if (viewGroup != null && viewGroup.hasOnClickListeners()) {
                    viewGroup.performClick();
                }
            }
            Result.m7377constructorimpl(Unit.INSTANCE);
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: T */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final BotUiState KWHzl() {
        return (BotUiState) this.OLrzqt.getValue();
    }

    private final void EZpvd(BotUiState botUiState) {
        this.OLrzqt.setValue(botUiState);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: T */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final PlanetPublisherPluginPreviewType EZpvd() {
        return (PlanetPublisherPluginPreviewType) this.copydefault.getValue();
    }

    private final void KWHzl(PlanetPublisherPluginPreviewType planetPublisherPluginPreviewType) {
        this.copydefault.setValue(planetPublisherPluginPreviewType);
    }
}
