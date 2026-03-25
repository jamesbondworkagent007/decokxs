package com.amplifyframework.ui.liveness.ui;

import android.app.Activity;
import android.content.Context;
import android.view.Window;
import android.view.WindowManager;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.amplifyframework.ui.liveness.util.ExtensionsKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class AlwaysOnMaxBrightnessScreenKt {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AlwaysOnMaxBrightnessScreen$lambda$6(int i, Composer composer, int i2) {
        AlwaysOnMaxBrightnessScreen(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void AlwaysOnMaxBrightnessScreen(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1509067708);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1509067708, i, -1, "com.amplifyframework.ui.liveness.ui.AlwaysOnMaxBrightnessScreen (AlwaysOnMaxBrightnessScreen.kt:25)");
            }
            final Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            Unit unit = Unit.INSTANCE;
            composerStartRestartGroup.startReplaceableGroup(423108592);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(context);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.amplifyframework.ui.liveness.ui.AlwaysOnMaxBrightnessScreenKt$$ExternalSyntheticLambda0
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return AlwaysOnMaxBrightnessScreenKt.AlwaysOnMaxBrightnessScreen$lambda$5$lambda$4(context, (DisposableEffectScope) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            EffectsKt.DisposableEffect(unit, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue, composerStartRestartGroup, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.amplifyframework.ui.liveness.ui.AlwaysOnMaxBrightnessScreenKt$$ExternalSyntheticLambda1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AlwaysOnMaxBrightnessScreenKt.AlwaysOnMaxBrightnessScreen$lambda$6(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DisposableEffectResult AlwaysOnMaxBrightnessScreen$lambda$5$lambda$4(Context context, DisposableEffectScope disposableEffectScope) {
        Intrinsics.checkNotNullParameter(disposableEffectScope, "");
        final Activity activityFindActivity = ExtensionsKt.findActivity(context);
        if (activityFindActivity != null) {
            final float f = activityFindActivity.getWindow().getAttributes().screenBrightness;
            activityFindActivity.getWindow().addFlags(128);
            Window window = activityFindActivity.getWindow();
            WindowManager.LayoutParams attributes = activityFindActivity.getWindow().getAttributes();
            attributes.screenBrightness = 1.0f;
            window.setAttributes(attributes);
            return new DisposableEffectResult() { // from class: com.amplifyframework.ui.liveness.ui.AlwaysOnMaxBrightnessScreenKt$AlwaysOnMaxBrightnessScreen$lambda$5$lambda$4$$inlined$onDispose$2
                @Override // androidx.compose.runtime.DisposableEffectResult
                public void dispose() {
                    activityFindActivity.getWindow().clearFlags(128);
                    Window window2 = activityFindActivity.getWindow();
                    WindowManager.LayoutParams attributes2 = activityFindActivity.getWindow().getAttributes();
                    attributes2.screenBrightness = f;
                    window2.setAttributes(attributes2);
                }
            };
        }
        return new DisposableEffectResult() { // from class: com.amplifyframework.ui.liveness.ui.AlwaysOnMaxBrightnessScreenKt$AlwaysOnMaxBrightnessScreen$lambda$5$lambda$4$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public void dispose() {
            }
        };
    }
}
