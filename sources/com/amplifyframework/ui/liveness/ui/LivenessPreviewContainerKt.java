package com.amplifyframework.ui.liveness.ui;

import androidx.compose.material3.ColorScheme;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.MaterialThemeKt;
import androidx.compose.material3.Shapes;
import androidx.compose.material3.Typography;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.amplifyframework.ui.liveness.ml.FaceDetector;
import com.okinc.business.defi.biz.core.error.WalletImportError;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public final class LivenessPreviewContainerKt {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LivenessPreviewContainer$lambda$0(ColorScheme colorScheme, Shapes shapes, Typography typography, Function2 function2, int i, int i2, Composer composer, int i3) {
        LivenessPreviewContainer(colorScheme, shapes, typography, function2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:73:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00f4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void LivenessPreviewContainer(ColorScheme colorScheme, Shapes shapes, Typography typography, @NotNull final Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, final int i, final int i2) {
        int i3;
        Intrinsics.checkNotNullParameter(function2, "");
        Composer composerStartRestartGroup = composer.startRestartGroup(1574152038);
        if ((i & 6) == 0) {
            i3 = (((i2 & 1) == 0 && composerStartRestartGroup.changed(colorScheme)) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= ((i2 & 2) == 0 && composerStartRestartGroup.changed(shapes)) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i3 |= ((i2 & 4) == 0 && composerStartRestartGroup.changed(typography)) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function2) ? 2048 : 1024;
        }
        if ((i3 & 1171) != 1170 || !composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0 && !composerStartRestartGroup.getDefaultsInvalid()) {
                composerStartRestartGroup.skipToGroupEnd();
                if ((i2 & 1) != 0) {
                    i3 &= -15;
                }
                if ((i2 & 2) != 0) {
                    i3 &= -113;
                }
                if ((i2 & 4) != 0) {
                    i3 &= -897;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                MaterialThemeKt.MaterialTheme(colorScheme, shapes, typography, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -580206062, true, new Function2<Composer, Integer, Unit>() { // from class: com.amplifyframework.ui.liveness.ui.LivenessPreviewContainerKt.LivenessPreviewContainer.1
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
                    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                    @Override // kotlin.jvm.functions.Function2
                    public /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i4) {
                        if ((i4 & 3) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-580206062, i4, -1, "com.amplifyframework.ui.liveness.ui.LivenessPreviewContainer.<anonymous> (LivenessPreviewContainer.kt:35)");
                        }
                        function2.invoke(composer2, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }), composerStartRestartGroup, (i3 & 14) | 3072 | (i3 & WalletImportError.ERROR_CODE_AA_EXIST) | (i3 & FaceDetector.NUM_BOXES), 0);
                if (ComposerKt.isTraceInProgress()) {
                }
            } else {
                if ((i2 & 1) != 0) {
                    colorScheme = LivenessColorScheme.INSTANCE.m6084default(composerStartRestartGroup, 6);
                    i3 &= -15;
                }
                if ((i2 & 2) != 0) {
                    shapes = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, MaterialTheme.$stable);
                    i3 &= -113;
                }
                if ((i2 & 4) != 0) {
                    typography = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, MaterialTheme.$stable);
                    i3 &= -897;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1574152038, i3, -1, "com.amplifyframework.ui.liveness.ui.LivenessPreviewContainer (LivenessPreviewContainer.kt:29)");
                }
                MaterialThemeKt.MaterialTheme(colorScheme, shapes, typography, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -580206062, true, new Function2<Composer, Integer, Unit>() { // from class: com.amplifyframework.ui.liveness.ui.LivenessPreviewContainerKt.LivenessPreviewContainer.1
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
                    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                    @Override // kotlin.jvm.functions.Function2
                    public /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i4) {
                        if ((i4 & 3) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-580206062, i4, -1, "com.amplifyframework.ui.liveness.ui.LivenessPreviewContainer.<anonymous> (LivenessPreviewContainer.kt:35)");
                        }
                        function2.invoke(composer2, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }), composerStartRestartGroup, (i3 & 14) | 3072 | (i3 & WalletImportError.ERROR_CODE_AA_EXIST) | (i3 & FaceDetector.NUM_BOXES), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        final ColorScheme colorScheme2 = colorScheme;
        final Shapes shapes2 = shapes;
        final Typography typography2 = typography;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.amplifyframework.ui.liveness.ui.LivenessPreviewContainerKt$$ExternalSyntheticLambda0
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return LivenessPreviewContainerKt.LivenessPreviewContainer$lambda$0(colorScheme2, shapes2, typography2, function2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
