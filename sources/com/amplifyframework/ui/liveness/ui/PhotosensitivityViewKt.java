package com.amplifyframework.ui.liveness.ui;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.AndroidAlertDialog_androidKt;
import androidx.compose.material3.ButtonKt;
import androidx.compose.material3.IconButtonKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.profileinstaller.ProfileVerifier;
import com.amplifyframework.ui.liveness.R;
import com.amplifyframework.ui.liveness.ui.PhotosensitivityViewKt;
import com.google.android.exoplayer2.C;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.yHO;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class PhotosensitivityViewKt {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GetReadyViewPreview$lambda$8(int i, Composer composer, int i2) {
        GetReadyViewPreview(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PhotosensitivityAlert$lambda$2(Function0 function0, int i, Composer composer, int i2) {
        PhotosensitivityAlert(function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PhotosensitivityView$lambda$7(Function0 function0, int i, Composer composer, int i2) {
        PhotosensitivityView(function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void PhotosensitivityAlert(@NotNull final Function0<Unit> function0, Composer composer, final int i) {
        int i2;
        Composer composer2;
        Intrinsics.checkNotNullParameter(function0, "");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1680697541);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1680697541, i2, -1, "com.amplifyframework.ui.liveness.ui.PhotosensitivityAlert (PhotosensitivityView.kt:40)");
            }
            composerStartRestartGroup.startReplaceableGroup(24184428);
            boolean z = (i2 & 14) == 4;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.amplifyframework.ui.liveness.ui.PhotosensitivityViewKt$$ExternalSyntheticLambda3
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return PhotosensitivityViewKt.PhotosensitivityAlert$lambda$1$lambda$0(function0);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            ComposableLambda composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1518272499, true, new AnonymousClass2(function0));
            ComposableSingletons$PhotosensitivityViewKt composableSingletons$PhotosensitivityViewKt = ComposableSingletons$PhotosensitivityViewKt.INSTANCE;
            Function2<Composer, Integer, Unit> function2M6064getLambda2$OKCompliance_ok_compliance_dynamic_aws_impl = composableSingletons$PhotosensitivityViewKt.m6064getLambda2$OKCompliance_ok_compliance_dynamic_aws_impl();
            Function2<Composer, Integer, Unit> function2M6065getLambda3$OKCompliance_ok_compliance_dynamic_aws_impl = composableSingletons$PhotosensitivityViewKt.m6065getLambda3$OKCompliance_ok_compliance_dynamic_aws_impl();
            composer2 = composerStartRestartGroup;
            AndroidAlertDialog_androidKt.m1495AlertDialogOix01E0((Function0) objRememberedValue, composableLambda, null, null, null, function2M6064getLambda2$OKCompliance_ok_compliance_dynamic_aws_impl, function2M6065getLambda3$OKCompliance_ok_compliance_dynamic_aws_impl, null, 0L, 0L, 0L, 0L, 0.0f, null, composer2, 1769520, 0, 16284);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.amplifyframework.ui.liveness.ui.PhotosensitivityViewKt$$ExternalSyntheticLambda4
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return PhotosensitivityViewKt.PhotosensitivityAlert$lambda$2(function0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: renamed from: com.amplifyframework.ui.liveness.ui.PhotosensitivityViewKt$PhotosensitivityAlert$2, reason: invalid class name */
    public static final class AnonymousClass2 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ Function0<Unit> $onDismiss;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AnonymousClass2(Function0<Unit> function0) {
            this.$onDismiss = function0;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function2
        public /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 3) != 2 || !composer.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1518272499, i, -1, "com.amplifyframework.ui.liveness.ui.PhotosensitivityAlert.<anonymous> (PhotosensitivityView.kt:58)");
                }
                composer.startReplaceableGroup(-1303510901);
                boolean zChanged = composer.changed(this.$onDismiss);
                final Function0<Unit> function0 = this.$onDismiss;
                Object objRememberedValue = composer.rememberedValue();
                if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.amplifyframework.ui.liveness.ui.PhotosensitivityViewKt$PhotosensitivityAlert$2$$ExternalSyntheticLambda0
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return PhotosensitivityViewKt.AnonymousClass2.invoke$lambda$1$lambda$0(function0);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue);
                }
                composer.endReplaceableGroup();
                ButtonKt.TextButton((Function0) objRememberedValue, null, false, null, null, null, null, null, null, ComposableSingletons$PhotosensitivityViewKt.INSTANCE.m6063getLambda1$OKCompliance_ok_compliance_dynamic_aws_impl(), composer, C.ENCODING_PCM_32BIT, TypedValues.PositionType.TYPE_POSITION_TYPE);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                    return;
                }
                return;
            }
            composer.skipToGroupEnd();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(Function0 function0) {
            function0.invoke();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PhotosensitivityAlert$lambda$1$lambda$0(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }

    public static final void PhotosensitivityView(@NotNull final Function0<Unit> function0, Composer composer, final int i) {
        int i2;
        Composer composer2;
        Intrinsics.checkNotNullParameter(function0, "");
        Composer composerStartRestartGroup = composer.startRestartGroup(-310646630);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-310646630, i2, -1, "com.amplifyframework.ui.liveness.ui.PhotosensitivityView (PhotosensitivityView.kt:72)");
            }
            Alignment.Companion companion = Alignment.Companion;
            Alignment.Vertical centerVertically = companion.getCenterVertically();
            Modifier.Companion companion2 = Modifier.Companion;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null);
            MaterialTheme materialTheme = MaterialTheme.INSTANCE;
            int i3 = MaterialTheme.$stable;
            float f = 12;
            Modifier modifierM675paddingqDBjuR0$default = PaddingKt.m675paddingqDBjuR0$default(BackgroundKt.m350backgroundbw27NRU$default(modifierFillMaxWidth$default, materialTheme.getColorScheme(composerStartRestartGroup, i3).m1556getErrorContainer0d7_KjU(), null, 2, null), Dp.m5414constructorimpl(f), Dp.m5414constructorimpl(f), 0.0f, Dp.m5414constructorimpl(f), 4, null);
            composerStartRestartGroup.startReplaceableGroup(693286680);
            Arrangement arrangement = Arrangement.INSTANCE;
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getStart(), centerVertically, composerStartRestartGroup, 48);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
            yHO<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> yhoMaterializerOf = LayoutKt.materializerOf(modifierM675paddingqDBjuR0$default);
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
            Updater.m2790setimpl(composerM2783constructorimpl, measurePolicyRowMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m2790setimpl(composerM2783constructorimpl, density, companion3.getSetDensity());
            Updater.m2790setimpl(composerM2783constructorimpl, layoutDirection, companion3.getSetLayoutDirection());
            Updater.m2790setimpl(composerM2783constructorimpl, viewConfiguration, companion3.getSetViewConfiguration());
            composerStartRestartGroup.enableReusing();
            yhoMaterializerOf.invoke(SkippableUpdater.m2774boximpl(SkippableUpdater.m2775constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            int i4 = i2;
            Modifier modifierWeight$default = RowScope.weight$default(RowScopeInstance.INSTANCE, PaddingKt.m675paddingqDBjuR0$default(companion2, 0.0f, 0.0f, Dp.m5414constructorimpl(6), 0.0f, 11, null), 1.0f, false, 2, null);
            composerStartRestartGroup.startReplaceableGroup(-483455358);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion.getStart(), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            Density density2 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection2 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration2 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
            yHO<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> yhoMaterializerOf2 = LayoutKt.materializerOf(modifierWeight$default);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor2);
            } else {
                composerStartRestartGroup.useNode();
            }
            composerStartRestartGroup.disableReusing();
            Composer composerM2783constructorimpl2 = Updater.m2783constructorimpl(composerStartRestartGroup);
            Updater.m2790setimpl(composerM2783constructorimpl2, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m2790setimpl(composerM2783constructorimpl2, density2, companion3.getSetDensity());
            Updater.m2790setimpl(composerM2783constructorimpl2, layoutDirection2, companion3.getSetLayoutDirection());
            Updater.m2790setimpl(composerM2783constructorimpl2, viewConfiguration2, companion3.getSetViewConfiguration());
            composerStartRestartGroup.enableReusing();
            yhoMaterializerOf2.invoke(SkippableUpdater.m2774boximpl(SkippableUpdater.m2775constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            TextKt.m2072Text4IGK_g(StringResources_androidKt.stringResource(R.string.amplify_ui_liveness_get_ready_photosensitivity_title, composerStartRestartGroup, 0), (Modifier) null, materialTheme.getColorScheme(composerStartRestartGroup, i3).m1562getOnErrorContainer0d7_KjU(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, materialTheme.getTypography(composerStartRestartGroup, i3).getTitleMedium(), composerStartRestartGroup, 0, 0, 65530);
            TextKt.m2072Text4IGK_g(StringResources_androidKt.stringResource(R.string.amplify_ui_liveness_get_ready_photosensitivity_description, composerStartRestartGroup, 0), (Modifier) null, materialTheme.getColorScheme(composerStartRestartGroup, i3).m1562getOnErrorContainer0d7_KjU(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, materialTheme.getTypography(composerStartRestartGroup, i3).getBodyMedium(), composerStartRestartGroup, 0, 0, 65530);
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            composer2 = composerStartRestartGroup;
            composer2.startReplaceableGroup(-984151340);
            boolean z = (i4 & 14) == 4;
            Object objRememberedValue = composer2.rememberedValue();
            if (z || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.amplifyframework.ui.liveness.ui.PhotosensitivityViewKt$$ExternalSyntheticLambda0
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return PhotosensitivityViewKt.PhotosensitivityView$lambda$6$lambda$5$lambda$4(function0);
                    }
                };
                composer2.updateRememberedValue(objRememberedValue);
            }
            composer2.endReplaceableGroup();
            IconButtonKt.IconButton((Function0) objRememberedValue, null, false, null, null, ComposableSingletons$PhotosensitivityViewKt.INSTANCE.m6066getLambda4$OKCompliance_ok_compliance_dynamic_aws_impl(), composer2, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 30);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.amplifyframework.ui.liveness.ui.PhotosensitivityViewKt$$ExternalSyntheticLambda1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return PhotosensitivityViewKt.PhotosensitivityView$lambda$7(function0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PhotosensitivityView$lambda$6$lambda$5$lambda$4(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }

    private static final void GetReadyViewPreview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-688006454);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-688006454, i, -1, "com.amplifyframework.ui.liveness.ui.GetReadyViewPreview (PhotosensitivityView.kt:120)");
            }
            LivenessPreviewContainerKt.LivenessPreviewContainer(null, null, null, ComposableSingletons$PhotosensitivityViewKt.INSTANCE.m6067getLambda5$OKCompliance_ok_compliance_dynamic_aws_impl(), composerStartRestartGroup, 3072, 7);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.amplifyframework.ui.liveness.ui.PhotosensitivityViewKt$$ExternalSyntheticLambda2
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return PhotosensitivityViewKt.GetReadyViewPreview$lambda$8(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
