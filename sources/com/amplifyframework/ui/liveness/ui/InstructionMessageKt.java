package com.amplifyframework.ui.liveness.ui;

import android.content.Context;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material3.ColorSchemeKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.ProgressIndicatorKt;
import androidx.compose.material3.TextKt;
import androidx.compose.material3.Typography;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.PlatformTextStyle;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.Hyphens;
import androidx.compose.ui.text.style.LineBreak;
import androidx.compose.ui.text.style.LineHeightStyle;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextDirection;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.core.content.ContextCompat;
import com.amplifyframework.ui.liveness.R;
import com.amplifyframework.ui.liveness.model.LivenessCheckState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.yHO;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class InstructionMessageKt {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FaceOvalInstructionMessage$lambda$6(String str, int i, int i2, Composer composer, int i3) {
        FaceOvalInstructionMessage(str, i, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InstructionMessage$lambda$1(LivenessCheckState livenessCheckState, int i, Composer composer, int i2) {
        InstructionMessage(livenessCheckState, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InstructionMessage$lambda$2(LivenessCheckState livenessCheckState, int i, Composer composer, int i2) {
        InstructionMessage(livenessCheckState, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InstructionMessage$lambda$4(String str, boolean z, int i, Composer composer, int i2) {
        InstructionMessage(str, z, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InstructionMessageCustomThemePreview$lambda$10(int i, Composer composer, int i2) {
        InstructionMessageCustomThemePreview(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InstructionMessageMultiLinePreview$lambda$9(int i, Composer composer, int i2) {
        InstructionMessageMultiLinePreview(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InstructionMessagePreview$lambda$7(int i, Composer composer, int i2) {
        InstructionMessagePreview(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InstructionMessageProgressPreview$lambda$8(int i, Composer composer, int i2) {
        InstructionMessageProgressPreview(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void InstructionMessage(@NotNull final LivenessCheckState livenessCheckState, Composer composer, final int i) {
        int i2;
        Intrinsics.checkNotNullParameter(livenessCheckState, "");
        Composer composerStartRestartGroup = composer.startRestartGroup(-865905072);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(livenessCheckState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-865905072, i2, -1, "com.amplifyframework.ui.liveness.ui.InstructionMessage (InstructionMessage.kt:49)");
            }
            Integer instructionId = livenessCheckState.getInstructionId();
            composerStartRestartGroup.startReplaceableGroup(23049349);
            String strStringResource = instructionId == null ? null : StringResources_androidKt.stringResource(instructionId.intValue(), composerStartRestartGroup, 0);
            composerStartRestartGroup.endReplaceableGroup();
            if (strStringResource == null) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.amplifyframework.ui.liveness.ui.InstructionMessageKt$$ExternalSyntheticLambda5
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return InstructionMessageKt.InstructionMessage$lambda$1(livenessCheckState, i, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            if (livenessCheckState.isActionable()) {
                composerStartRestartGroup.startReplaceableGroup(714609460);
                FaceOvalInstructionMessage(strStringResource, livenessCheckState.getColorType(), composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceableGroup();
            } else {
                composerStartRestartGroup.startReplaceableGroup(714713093);
                InstructionMessage(strStringResource, true, composerStartRestartGroup, 48);
                composerStartRestartGroup.endReplaceableGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup2 = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup2 != null) {
            scopeUpdateScopeEndRestartGroup2.updateScope(new Function2() { // from class: com.amplifyframework.ui.liveness.ui.InstructionMessageKt$$ExternalSyntheticLambda6
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return InstructionMessageKt.InstructionMessage$lambda$2(livenessCheckState, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void InstructionMessage(final String str, final boolean z, Composer composer, final int i) {
        int i2;
        int i3;
        MaterialTheme materialTheme;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1131024079);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(z) ? 32 : 16;
        }
        int i4 = i2;
        if ((i4 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1131024079, i4, -1, "com.amplifyframework.ui.liveness.ui.InstructionMessage (InstructionMessage.kt:61)");
            }
            Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            int color = ContextCompat.getColor(context, R.color.bg_kyc_aws_tip);
            int color2 = ContextCompat.getColor(context, R.color.kyc_aws_tip_white);
            Alignment.Vertical centerVertically = Alignment.Companion.getCenterVertically();
            Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
            Modifier.Companion companion = Modifier.Companion;
            long jColor = ColorKt.Color(color);
            MaterialTheme materialTheme2 = MaterialTheme.INSTANCE;
            int i5 = MaterialTheme.$stable;
            float f = 16;
            Modifier modifierM672paddingVpY3zN4 = PaddingKt.m672paddingVpY3zN4(BackgroundKt.m349backgroundbw27NRU(companion, jColor, materialTheme2.getShapes(composerStartRestartGroup, i5).getSmall()), Dp.m5414constructorimpl(f), Dp.m5414constructorimpl(12));
            composerStartRestartGroup.startReplaceableGroup(693286680);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(center, centerVertically, composerStartRestartGroup, 54);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
            yHO<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> yhoMaterializerOf = LayoutKt.materializerOf(modifierM672paddingVpY3zN4);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            composerStartRestartGroup.disableReusing();
            Composer composerM2783constructorimpl = Updater.m2783constructorimpl(composerStartRestartGroup);
            Updater.m2790setimpl(composerM2783constructorimpl, measurePolicyRowMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m2790setimpl(composerM2783constructorimpl, density, companion2.getSetDensity());
            Updater.m2790setimpl(composerM2783constructorimpl, layoutDirection, companion2.getSetLayoutDirection());
            Updater.m2790setimpl(composerM2783constructorimpl, viewConfiguration, companion2.getSetViewConfiguration());
            composerStartRestartGroup.enableReusing();
            yhoMaterializerOf.invoke(SkippableUpdater.m2774boximpl(SkippableUpdater.m2775constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            composerStartRestartGroup.startReplaceableGroup(154483263);
            if (z) {
                i3 = i5;
                materialTheme = materialTheme2;
                ProgressIndicatorKt.m1853CircularProgressIndicatorLxG7B9w(SizeKt.m718size3ABfNKs(companion, Dp.m5414constructorimpl(f)), materialTheme2.getColorScheme(composerStartRestartGroup, i5).m1573getPrimary0d7_KjU(), Dp.m5414constructorimpl(2), 0L, 0, composerStartRestartGroup, 390, 24);
                SpacerKt.Spacer(SizeKt.m718size3ABfNKs(companion, Dp.m5414constructorimpl(8)), composerStartRestartGroup, 6);
            } else {
                i3 = i5;
                materialTheme = materialTheme2;
            }
            composerStartRestartGroup.endReplaceableGroup();
            long jColor2 = ColorKt.Color(color2);
            TextStyle bodyMedium = materialTheme.getTypography(composerStartRestartGroup, i3).getBodyMedium();
            composer2 = composerStartRestartGroup;
            TextKt.m2072Text4IGK_g(str, (Modifier) null, jColor2, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m5279boximpl(TextAlign.Companion.m5286getCentere0LSkKk()), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, bodyMedium, composer2, i4 & 14, 0, 65018);
            composer2.endReplaceableGroup();
            composer2.endNode();
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.amplifyframework.ui.liveness.ui.InstructionMessageKt$$ExternalSyntheticLambda2
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return InstructionMessageKt.InstructionMessage$lambda$4(str, z, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void FaceOvalInstructionMessage(final String str, final int i, Composer composer, final int i2) {
        int i3;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-229626903);
        if ((i2 & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(i) ? 32 : 16;
        }
        int i4 = i3;
        if ((i4 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-229626903, i4, -1, "com.amplifyframework.ui.liveness.ui.FaceOvalInstructionMessage (InstructionMessage.kt:98)");
            }
            Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            int color = ContextCompat.getColor(context, R.color.bg_kyc_aws_tip);
            int color2 = ContextCompat.getColor(context, R.color.kyc_aws_tip_white);
            int color3 = ContextCompat.getColor(context, R.color.kyc_aws_tip_green);
            int color4 = ContextCompat.getColor(context, R.color.kyc_aws_tip_red);
            if (i == 1) {
                color2 = color3;
            } else if (i == 2) {
                color2 = color4;
            }
            Alignment.Vertical centerVertically = Alignment.Companion.getCenterVertically();
            Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
            Modifier.Companion companion = Modifier.Companion;
            long jColor = ColorKt.Color(color);
            MaterialTheme materialTheme = MaterialTheme.INSTANCE;
            int i5 = MaterialTheme.$stable;
            Modifier modifierM672paddingVpY3zN4 = PaddingKt.m672paddingVpY3zN4(BackgroundKt.m349backgroundbw27NRU(companion, jColor, materialTheme.getShapes(composerStartRestartGroup, i5).getSmall()), Dp.m5414constructorimpl(10), Dp.m5414constructorimpl(6));
            composerStartRestartGroup.startReplaceableGroup(693286680);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(center, centerVertically, composerStartRestartGroup, 54);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
            yHO<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> yhoMaterializerOf = LayoutKt.materializerOf(modifierM672paddingVpY3zN4);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            composerStartRestartGroup.disableReusing();
            Composer composerM2783constructorimpl = Updater.m2783constructorimpl(composerStartRestartGroup);
            Updater.m2790setimpl(composerM2783constructorimpl, measurePolicyRowMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m2790setimpl(composerM2783constructorimpl, density, companion2.getSetDensity());
            Updater.m2790setimpl(composerM2783constructorimpl, layoutDirection, companion2.getSetLayoutDirection());
            Updater.m2790setimpl(composerM2783constructorimpl, viewConfiguration, companion2.getSetViewConfiguration());
            composerStartRestartGroup.enableReusing();
            yhoMaterializerOf.invoke(SkippableUpdater.m2774boximpl(SkippableUpdater.m2775constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            composer2 = composerStartRestartGroup;
            TextKt.m2072Text4IGK_g(str, (Modifier) null, ColorKt.Color(color2), TextUnitKt.getSp(18), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m5279boximpl(TextAlign.Companion.m5286getCentere0LSkKk()), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, materialTheme.getTypography(composerStartRestartGroup, i5).getHeadlineLarge(), composer2, (i4 & 14) | 3072, 0, 65010);
            composer2.endReplaceableGroup();
            composer2.endNode();
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.amplifyframework.ui.liveness.ui.InstructionMessageKt$$ExternalSyntheticLambda7
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return InstructionMessageKt.FaceOvalInstructionMessage$lambda$6(str, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void InstructionMessagePreview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(360732522);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(360732522, i, -1, "com.amplifyframework.ui.liveness.ui.InstructionMessagePreview (InstructionMessage.kt:159)");
            }
            LivenessPreviewContainerKt.LivenessPreviewContainer(null, null, null, ComposableSingletons$InstructionMessageKt.INSTANCE.m6059getLambda1$OKCompliance_ok_compliance_dynamic_aws_impl(), composerStartRestartGroup, 3072, 7);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.amplifyframework.ui.liveness.ui.InstructionMessageKt$$ExternalSyntheticLambda0
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return InstructionMessageKt.InstructionMessagePreview$lambda$7(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void InstructionMessageProgressPreview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-1062951753);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1062951753, i, -1, "com.amplifyframework.ui.liveness.ui.InstructionMessageProgressPreview (InstructionMessage.kt:166)");
            }
            LivenessPreviewContainerKt.LivenessPreviewContainer(null, null, null, ComposableSingletons$InstructionMessageKt.INSTANCE.m6060getLambda2$OKCompliance_ok_compliance_dynamic_aws_impl(), composerStartRestartGroup, 3072, 7);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.amplifyframework.ui.liveness.ui.InstructionMessageKt$$ExternalSyntheticLambda1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return InstructionMessageKt.InstructionMessageProgressPreview$lambda$8(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void InstructionMessageMultiLinePreview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-1848821655);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1848821655, i, -1, "com.amplifyframework.ui.liveness.ui.InstructionMessageMultiLinePreview (InstructionMessage.kt:183)");
            }
            LivenessPreviewContainerKt.LivenessPreviewContainer(null, null, null, ComposableSingletons$InstructionMessageKt.INSTANCE.m6061getLambda3$OKCompliance_ok_compliance_dynamic_aws_impl(), composerStartRestartGroup, 3072, 7);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.amplifyframework.ui.liveness.ui.InstructionMessageKt$$ExternalSyntheticLambda4
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return InstructionMessageKt.InstructionMessageMultiLinePreview$lambda$9(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void InstructionMessageCustomThemePreview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(801428532);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(801428532, i, -1, "com.amplifyframework.ui.liveness.ui.InstructionMessageCustomThemePreview (InstructionMessage.kt:194)");
            }
            Color.Companion companion = Color.Companion;
            long j = 0;
            FontStyle fontStyle = null;
            FontSynthesis fontSynthesis = null;
            TextStyle textStyle = null;
            TextStyle textStyle2 = null;
            TextStyle textStyle3 = null;
            TextStyle textStyle4 = null;
            TextStyle textStyle5 = null;
            TextStyle textStyle6 = null;
            TextStyle textStyle7 = null;
            TextStyle textStyle8 = null;
            TextStyle textStyle9 = null;
            TextStyle textStyle10 = null;
            LivenessPreviewContainerKt.LivenessPreviewContainer(ColorSchemeKt.m1618lightColorSchemeG1PFcw$default(companion.m3186getWhite0d7_KjU(), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, companion.m3176getBlue0d7_KjU(), companion.m3187getYellow0d7_KjU(), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 536846334, null), null, new Typography(textStyle, textStyle2, textStyle3, textStyle4, textStyle5, textStyle6, textStyle7, textStyle8, textStyle9, textStyle10, new TextStyle(j, TextUnitKt.getSp(26), FontWeight.Companion.getLight(), fontStyle, fontSynthesis, FontFamily.Companion.getCursive(), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (TextAlign) null, (TextDirection) null, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, 4194265, (DefaultConstructorMarker) null), null, null, null, null, 31743, null), ComposableSingletons$InstructionMessageKt.INSTANCE.m6062getLambda4$OKCompliance_ok_compliance_dynamic_aws_impl(), composerStartRestartGroup, 3072, 2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.amplifyframework.ui.liveness.ui.InstructionMessageKt$$ExternalSyntheticLambda3
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return InstructionMessageKt.InstructionMessageCustomThemePreview$lambda$10(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
