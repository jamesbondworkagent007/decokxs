package com.amplifyframework.ui.liveness.ui;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.ColorSchemeKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.Shapes;
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
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.PlatformTextStyle;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
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
import com.amplifyframework.ui.liveness.R;
import com.okinc.business.defi.biz.core.error.WalletImportError;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.yHO;

/* JADX INFO: loaded from: classes21.dex */
public final class RecordingIndicatorKt {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RecordingIndicator$lambda$0(Modifier modifier, int i, int i2, Composer composer, int i3) {
        RecordingIndicator(modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RecordingIndicator$lambda$2(String str, Modifier modifier, int i, int i2, Composer composer, int i3) {
        RecordingIndicator(str, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RecordingIndicatorCustomThemePreview$lambda$5(int i, Composer composer, int i2) {
        RecordingIndicatorCustomThemePreview(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RecordingIndicatorLongLabelPreview$lambda$4(int i, Composer composer, int i2) {
        RecordingIndicatorLongLabelPreview(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RecordingIndicatorPreview$lambda$3(int i, Composer composer, int i2) {
        RecordingIndicatorPreview(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void RecordingIndicator(final Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(-679090479);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i3 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (i4 != 0) {
                modifier = Modifier.Companion;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-679090479, i3, -1, "com.amplifyframework.ui.liveness.ui.RecordingIndicator (RecordingIndicator.kt:48)");
            }
            RecordingIndicator(StringResources_androidKt.stringResource(R.string.amplify_ui_liveness_challenge_recording_indicator_label, composerStartRestartGroup, 0), modifier, composerStartRestartGroup, (i3 << 3) & WalletImportError.ERROR_CODE_AA_EXIST, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.amplifyframework.ui.liveness.ui.RecordingIndicatorKt$$ExternalSyntheticLambda3
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return RecordingIndicatorKt.RecordingIndicator$lambda$0(modifier, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void RecordingIndicator(final String str, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        final Modifier modifier2;
        int i4;
        Composer composer2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(1751891124);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 == 0) {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            i4 = i3;
            if ((i4 & 19) == 18 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier3 = i5 == 0 ? Modifier.Companion : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1751891124, i4, -1, "com.amplifyframework.ui.liveness.ui.RecordingIndicator (RecordingIndicator.kt:58)");
                }
                Alignment.Companion companion = Alignment.Companion;
                Alignment.Horizontal centerHorizontally = companion.getCenterHorizontally();
                Arrangement.Vertical verticalM584spacedByD5KLDUw = Arrangement.INSTANCE.m584spacedByD5KLDUw(Dp.m5414constructorimpl(7), companion.getCenterVertically());
                Modifier modifierM702defaultMinSizeVpY3zN4 = SizeKt.m702defaultMinSizeVpY3zN4(SizeKt.wrapContentSize$default(modifier3, companion.getCenter(), false, 2, null), Dp.m5414constructorimpl(42), Dp.m5414constructorimpl(63));
                MaterialTheme materialTheme = MaterialTheme.INSTANCE;
                int i6 = MaterialTheme.$stable;
                Modifier modifierM671padding3ABfNKs = PaddingKt.m671padding3ABfNKs(BackgroundKt.m349backgroundbw27NRU(modifierM702defaultMinSizeVpY3zN4, materialTheme.getColorScheme(composerStartRestartGroup, i6).m1554getBackground0d7_KjU(), materialTheme.getShapes(composerStartRestartGroup, i6).getSmall()), Dp.m5414constructorimpl(8));
                composerStartRestartGroup.startReplaceableGroup(-483455358);
                MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(verticalM584spacedByD5KLDUw, centerHorizontally, composerStartRestartGroup, 54);
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
                Function0<ComposeUiNode> constructor = companion2.getConstructor();
                yHO<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> yhoMaterializerOf = LayoutKt.materializerOf(modifierM671padding3ABfNKs);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (!composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerStartRestartGroup.disableReusing();
                Composer composerM2783constructorimpl = Updater.m2783constructorimpl(composerStartRestartGroup);
                Updater.m2790setimpl(composerM2783constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                Updater.m2790setimpl(composerM2783constructorimpl, density, companion2.getSetDensity());
                Updater.m2790setimpl(composerM2783constructorimpl, layoutDirection, companion2.getSetLayoutDirection());
                Updater.m2790setimpl(composerM2783constructorimpl, viewConfiguration, companion2.getSetViewConfiguration());
                composerStartRestartGroup.enableReusing();
                yhoMaterializerOf.invoke(SkippableUpdater.m2774boximpl(SkippableUpdater.m2775constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(2058660585);
                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                BoxKt.Box(BackgroundKt.m350backgroundbw27NRU$default(ClipKt.clip(SizeKt.m718size3ABfNKs(Modifier.Companion, Dp.m5414constructorimpl(17)), RoundedCornerShapeKt.getCircleShape()), ColorKt.Color(4294518310L), null, 2, null), composerStartRestartGroup, 0);
                Modifier modifier4 = modifier3;
                composer2 = composerStartRestartGroup;
                TextKt.m2072Text4IGK_g(str, (Modifier) null, materialTheme.getColorScheme(composerStartRestartGroup, i6).m1560getOnBackground0d7_KjU(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, materialTheme.getTypography(composerStartRestartGroup, i6).getLabelMedium(), composer2, i4 & 14, 0, 65530);
                composer2.endReplaceableGroup();
                composer2.endNode();
                composer2.endReplaceableGroup();
                composer2.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = modifier4;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                composer2 = composerStartRestartGroup;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.amplifyframework.ui.liveness.ui.RecordingIndicatorKt$$ExternalSyntheticLambda1
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return RecordingIndicatorKt.RecordingIndicator$lambda$2(str, modifier2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 48;
        modifier2 = modifier;
        i4 = i3;
        if ((i4 & 19) == 18) {
            if (i5 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            Alignment.Companion companion3 = Alignment.Companion;
            Alignment.Horizontal centerHorizontally2 = companion3.getCenterHorizontally();
            Arrangement.Vertical verticalM584spacedByD5KLDUw2 = Arrangement.INSTANCE.m584spacedByD5KLDUw(Dp.m5414constructorimpl(7), companion3.getCenterVertically());
            Modifier modifierM702defaultMinSizeVpY3zN42 = SizeKt.m702defaultMinSizeVpY3zN4(SizeKt.wrapContentSize$default(modifier3, companion3.getCenter(), false, 2, null), Dp.m5414constructorimpl(42), Dp.m5414constructorimpl(63));
            MaterialTheme materialTheme2 = MaterialTheme.INSTANCE;
            int i62 = MaterialTheme.$stable;
            Modifier modifierM671padding3ABfNKs2 = PaddingKt.m671padding3ABfNKs(BackgroundKt.m349backgroundbw27NRU(modifierM702defaultMinSizeVpY3zN42, materialTheme2.getColorScheme(composerStartRestartGroup, i62).m1554getBackground0d7_KjU(), materialTheme2.getShapes(composerStartRestartGroup, i62).getSmall()), Dp.m5414constructorimpl(8));
            composerStartRestartGroup.startReplaceableGroup(-483455358);
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(verticalM584spacedByD5KLDUw2, centerHorizontally2, composerStartRestartGroup, 54);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            Density density2 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection2 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration2 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposeUiNode.Companion companion22 = ComposeUiNode.Companion;
            Function0<ComposeUiNode> constructor2 = companion22.getConstructor();
            yHO<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> yhoMaterializerOf2 = LayoutKt.materializerOf(modifierM671padding3ABfNKs2);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
            }
            composerStartRestartGroup.startReusableNode();
            if (!composerStartRestartGroup.getInserting()) {
            }
            composerStartRestartGroup.disableReusing();
            Composer composerM2783constructorimpl2 = Updater.m2783constructorimpl(composerStartRestartGroup);
            Updater.m2790setimpl(composerM2783constructorimpl2, measurePolicyColumnMeasurePolicy2, companion22.getSetMeasurePolicy());
            Updater.m2790setimpl(composerM2783constructorimpl2, density2, companion22.getSetDensity());
            Updater.m2790setimpl(composerM2783constructorimpl2, layoutDirection2, companion22.getSetLayoutDirection());
            Updater.m2790setimpl(composerM2783constructorimpl2, viewConfiguration2, companion22.getSetViewConfiguration());
            composerStartRestartGroup.enableReusing();
            yhoMaterializerOf2.invoke(SkippableUpdater.m2774boximpl(SkippableUpdater.m2775constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
            BoxKt.Box(BackgroundKt.m350backgroundbw27NRU$default(ClipKt.clip(SizeKt.m718size3ABfNKs(Modifier.Companion, Dp.m5414constructorimpl(17)), RoundedCornerShapeKt.getCircleShape()), ColorKt.Color(4294518310L), null, 2, null), composerStartRestartGroup, 0);
            Modifier modifier42 = modifier3;
            composer2 = composerStartRestartGroup;
            TextKt.m2072Text4IGK_g(str, (Modifier) null, materialTheme2.getColorScheme(composerStartRestartGroup, i62).m1560getOnBackground0d7_KjU(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, materialTheme2.getTypography(composerStartRestartGroup, i62).getLabelMedium(), composer2, i4 & 14, 0, 65530);
            composer2.endReplaceableGroup();
            composer2.endNode();
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier2 = modifier42;
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    private static final void RecordingIndicatorPreview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(48634698);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(48634698, i, -1, "com.amplifyframework.ui.liveness.ui.RecordingIndicatorPreview (RecordingIndicator.kt:88)");
            }
            LivenessPreviewContainerKt.LivenessPreviewContainer(null, null, null, ComposableSingletons$RecordingIndicatorKt.INSTANCE.m6069getLambda1$OKCompliance_ok_compliance_dynamic_aws_impl(), composerStartRestartGroup, 3072, 7);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.amplifyframework.ui.liveness.ui.RecordingIndicatorKt$$ExternalSyntheticLambda4
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return RecordingIndicatorKt.RecordingIndicatorPreview$lambda$3(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void RecordingIndicatorLongLabelPreview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-213870102);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-213870102, i, -1, "com.amplifyframework.ui.liveness.ui.RecordingIndicatorLongLabelPreview (RecordingIndicator.kt:96)");
            }
            LivenessPreviewContainerKt.LivenessPreviewContainer(null, null, null, ComposableSingletons$RecordingIndicatorKt.INSTANCE.m6070getLambda2$OKCompliance_ok_compliance_dynamic_aws_impl(), composerStartRestartGroup, 3072, 7);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.amplifyframework.ui.liveness.ui.RecordingIndicatorKt$$ExternalSyntheticLambda2
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return RecordingIndicatorKt.RecordingIndicatorLongLabelPreview$lambda$4(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void RecordingIndicatorCustomThemePreview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(32974826);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(32974826, i, -1, "com.amplifyframework.ui.liveness.ui.RecordingIndicatorCustomThemePreview (RecordingIndicator.kt:104)");
            }
            Color.Companion companion = Color.Companion;
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
            TextStyle textStyle11 = null;
            TextStyle textStyle12 = null;
            TextStyle textStyle13 = null;
            LivenessPreviewContainerKt.LivenessPreviewContainer(ColorSchemeKt.m1618lightColorSchemeG1PFcw$default(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, companion.m3176getBlue0d7_KjU(), companion.m3187getYellow0d7_KjU(), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 536846335, null), new Shapes(null, RoundedCornerShapeKt.m924RoundedCornerShape0680j_4(Dp.m5414constructorimpl(0)), null, null, null, 29, null), new Typography(textStyle, textStyle2, textStyle3, textStyle4, textStyle5, textStyle6, textStyle7, textStyle8, textStyle9, textStyle10, textStyle11, textStyle12, textStyle13, new TextStyle(0L, TextUnitKt.getSp(28), FontWeight.Companion.getBold(), null, null, FontFamily.Companion.getCursive(), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (TextAlign) null, (TextDirection) null, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, 4194265, (DefaultConstructorMarker) null), null, 24575, null), ComposableSingletons$RecordingIndicatorKt.INSTANCE.m6071getLambda3$OKCompliance_ok_compliance_dynamic_aws_impl(), composerStartRestartGroup, 3072, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.amplifyframework.ui.liveness.ui.RecordingIndicatorKt$$ExternalSyntheticLambda0
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return RecordingIndicatorKt.RecordingIndicatorCustomThemePreview$lambda$5(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
