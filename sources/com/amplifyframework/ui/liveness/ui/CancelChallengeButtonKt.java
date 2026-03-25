package com.amplifyframework.ui.liveness.ui;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.filled.CloseKt;
import androidx.compose.material3.ColorSchemeKt;
import androidx.compose.material3.IconButtonKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.unit.Dp;
import androidx.profileinstaller.ProfileVerifier;
import com.amplifyframework.ui.liveness.R;
import com.amplifyframework.ui.liveness.ml.FaceDetector;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import org.jetbrains.annotations.NotNull;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: loaded from: classes21.dex */
public final class CancelChallengeButtonKt {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CancelChallengeButton$lambda$0(Modifier modifier, Function0 function0, int i, int i2, Composer composer, int i3) {
        CancelChallengeButton(modifier, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CancelChallengeButton$lambda$1(Modifier modifier, String str, Function0 function0, int i, int i2, Composer composer, int i3) {
        CancelChallengeButton(modifier, str, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CancelChallengeButtonCustomThemePreview$lambda$3(int i, Composer composer, int i2) {
        CancelChallengeButtonCustomThemePreview(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CancelChallengeButtonPreview$lambda$2(int i, Composer composer, int i2) {
        CancelChallengeButtonPreview(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void CancelChallengeButton(final Modifier modifier, @NotNull final Function0<Unit> function0, Composer composer, final int i, final int i2) {
        int i3;
        Intrinsics.checkNotNullParameter(function0, "");
        Composer composerStartRestartGroup = composer.startRestartGroup(-459075495);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if ((i3 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (i4 != 0) {
                modifier = Modifier.Companion;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-459075495, i3, -1, "com.amplifyframework.ui.liveness.ui.CancelChallengeButton (CancelChallengeButton.kt:39)");
            }
            CancelChallengeButton(modifier, StringResources_androidKt.stringResource(R.string.amplify_ui_liveness_challenge_a11y_cancel_content_description, composerStartRestartGroup, 0), function0, composerStartRestartGroup, (i3 & 14) | ((i3 << 3) & FaceDetector.NUM_BOXES), 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.amplifyframework.ui.liveness.ui.CancelChallengeButtonKt$$ExternalSyntheticLambda0
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CancelChallengeButtonKt.CancelChallengeButton$lambda$0(modifier, function0, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void CancelChallengeButton(Modifier modifier, final String str, final Function0<Unit> function0, Composer composer, final int i, final int i2) {
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(663829248);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(str) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= MLKEMEngine.KyberPolyBytes;
        } else if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function0) ? 256 : 128;
        }
        if ((i3 & CipherSuite.TLS_RSA_PSK_WITH_3DES_EDE_CBC_SHA) != 146 || !composerStartRestartGroup.getSkipping()) {
            if (i4 != 0) {
                modifier = Modifier.Companion;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(663829248, i3, -1, "com.amplifyframework.ui.liveness.ui.CancelChallengeButton (CancelChallengeButton.kt:54)");
            }
            IconButtonKt.IconButton(function0, SizeKt.m718size3ABfNKs(BackgroundKt.m349backgroundbw27NRU(modifier, MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable).m1554getBackground0d7_KjU(), RoundedCornerShapeKt.getCircleShape()), Dp.m5414constructorimpl(44)), false, null, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1956116419, true, new Function2<Composer, Integer, Unit>() { // from class: com.amplifyframework.ui.liveness.ui.CancelChallengeButtonKt.CancelChallengeButton.2
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function2
                public /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i5) {
                    if ((i5 & 3) != 2 || !composer2.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1956116419, i5, -1, "com.amplifyframework.ui.liveness.ui.CancelChallengeButton.<anonymous> (CancelChallengeButton.kt:61)");
                        }
                        IconKt.m1756Iconww6aTOc(CloseKt.getClose(Icons.INSTANCE.getDefault()), str, (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer2, MaterialTheme.$stable).m1560getOnBackground0d7_KjU(), composer2, 0, 4);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    composer2.skipToGroupEnd();
                }
            }), composerStartRestartGroup, ((i3 >> 6) & 14) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 28);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        final Modifier modifier2 = modifier;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.amplifyframework.ui.liveness.ui.CancelChallengeButtonKt$$ExternalSyntheticLambda1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CancelChallengeButtonKt.CancelChallengeButton$lambda$1(modifier2, str, function0, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void CancelChallengeButtonPreview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(7722218);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(7722218, i, -1, "com.amplifyframework.ui.liveness.ui.CancelChallengeButtonPreview (CancelChallengeButton.kt:72)");
            }
            LivenessPreviewContainerKt.LivenessPreviewContainer(null, null, null, ComposableSingletons$CancelChallengeButtonKt.INSTANCE.m6056getLambda1$OKCompliance_ok_compliance_dynamic_aws_impl(), composerStartRestartGroup, 3072, 7);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.amplifyframework.ui.liveness.ui.CancelChallengeButtonKt$$ExternalSyntheticLambda2
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CancelChallengeButtonKt.CancelChallengeButtonPreview$lambda$2(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void CancelChallengeButtonCustomThemePreview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-639504148);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-639504148, i, -1, "com.amplifyframework.ui.liveness.ui.CancelChallengeButtonCustomThemePreview (CancelChallengeButton.kt:80)");
            }
            Color.Companion companion = Color.Companion;
            LivenessPreviewContainerKt.LivenessPreviewContainer(ColorSchemeKt.m1618lightColorSchemeG1PFcw$default(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, companion.m3176getBlue0d7_KjU(), companion.m3187getYellow0d7_KjU(), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 536846335, null), null, null, ComposableSingletons$CancelChallengeButtonKt.INSTANCE.m6057getLambda2$OKCompliance_ok_compliance_dynamic_aws_impl(), composerStartRestartGroup, 3072, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.amplifyframework.ui.liveness.ui.CancelChallengeButtonKt$$ExternalSyntheticLambda3
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CancelChallengeButtonKt.CancelChallengeButtonCustomThemePreview$lambda$3(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
