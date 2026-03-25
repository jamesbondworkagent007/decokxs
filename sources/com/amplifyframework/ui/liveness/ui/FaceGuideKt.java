package com.amplifyframework.ui.liveness.ui;

import android.graphics.RectF;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
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
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.BlendMode;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.Fill;
import androidx.compose.ui.graphics.drawscope.Stroke;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.DpKt;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import com.amplifyframework.ui.liveness.ml.FaceDetector;
import com.amplifyframework.ui.liveness.ui.helper.VideoViewportSize;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.yHO;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class FaceGuideKt {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FaceGuidePreview$lambda$6(int i, Composer composer, int i2) {
        FaceGuidePreview(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FaceGuide_ww6aTOc$lambda$1(Modifier modifier, RectF rectF, VideoViewportSize videoViewportSize, long j, int i, int i2, Composer composer, int i3) {
        m6073FaceGuideww6aTOc(modifier, rectF, videoViewportSize, j, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FaceGuide_ww6aTOc$lambda$4(Modifier modifier, RectF rectF, VideoViewportSize videoViewportSize, long j, int i, int i2, Composer composer, int i3) {
        m6073FaceGuideww6aTOc(modifier, rectF, videoViewportSize, j, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:90:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:91:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: FaceGuide-ww6aTOc, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m6073FaceGuideww6aTOc(@NotNull final Modifier modifier, final RectF rectF, @NotNull final VideoViewportSize videoViewportSize, long j, Composer composer, final int i, final int i2) {
        int i3;
        final long j2;
        int i4;
        long jM3186getWhite0d7_KjU;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        final RectF scaledBoundingRect;
        Composer composer2;
        final long j3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup2;
        Intrinsics.checkNotNullParameter(modifier, "");
        Intrinsics.checkNotNullParameter(videoViewportSize, "");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1793627454);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(rectF) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= MLKEMEngine.KyberPolyBytes;
        } else if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i3 |= composerStartRestartGroup.changed(videoViewportSize) ? 256 : 128;
        }
        int i5 = i2 & 8;
        if (i5 == 0) {
            if ((i & 3072) == 0) {
                j2 = j;
                i3 |= composerStartRestartGroup.changed(j2) ? 2048 : 1024;
            }
            i4 = i3;
            if ((i4 & 1171) == 1170 || !composerStartRestartGroup.getSkipping()) {
                jM3186getWhite0d7_KjU = i5 == 0 ? Color.Companion.m3186getWhite0d7_KjU() : j2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1793627454, i4, -1, "com.amplifyframework.ui.liveness.ui.FaceGuide (FaceGuide.kt:44)");
                }
                if (rectF != null || (scaledBoundingRect = videoViewportSize.getScaledBoundingRect(rectF)) == null) {
                    final long j4 = jM3186getWhite0d7_KjU;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.amplifyframework.ui.liveness.ui.FaceGuideKt$$ExternalSyntheticLambda0
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return FaceGuideKt.FaceGuide_ww6aTOc$lambda$1(modifier, rectF, videoViewportSize, j4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                long j5 = jM3186getWhite0d7_KjU;
                Modifier modifierM3305graphicsLayerAp8cVGQ$default = GraphicsLayerModifierKt.m3305graphicsLayerAp8cVGQ$default(modifier, 0.0f, 0.0f, 0.99f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, null, 0L, 0L, 0, 131067, null);
                composer2 = composerStartRestartGroup;
                composer2.startReplaceableGroup(-1624228320);
                boolean z = (i4 & 7168) == 2048;
                boolean z2 = (i4 & FaceDetector.NUM_BOXES) == 256;
                boolean zChangedInstance = composer2.changedInstance(scaledBoundingRect);
                Object objRememberedValue = composer2.rememberedValue();
                if (((z | z2) || zChangedInstance) || objRememberedValue == Composer.Companion.getEmpty()) {
                    j3 = j5;
                    objRememberedValue = new Function1() { // from class: com.amplifyframework.ui.liveness.ui.FaceGuideKt$$ExternalSyntheticLambda1
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return FaceGuideKt.FaceGuide_ww6aTOc$lambda$3$lambda$2(j3, videoViewportSize, scaledBoundingRect, (DrawScope) obj);
                        }
                    };
                    composer2.updateRememberedValue(objRememberedValue);
                } else {
                    j3 = j5;
                }
                composer2.endReplaceableGroup();
                CanvasKt.Canvas(modifierM3305graphicsLayerAp8cVGQ$default, (Function1) objRememberedValue, composer2, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                j2 = j3;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                composer2 = composerStartRestartGroup;
            }
            scopeUpdateScopeEndRestartGroup2 = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup2 == null) {
                scopeUpdateScopeEndRestartGroup2.updateScope(new Function2() { // from class: com.amplifyframework.ui.liveness.ui.FaceGuideKt$$ExternalSyntheticLambda2
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return FaceGuideKt.FaceGuide_ww6aTOc$lambda$4(modifier, rectF, videoViewportSize, j2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 3072;
        j2 = j;
        i4 = i3;
        if ((i4 & 1171) == 1170) {
            if (i5 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            if (rectF != null) {
            }
            final long j42 = jM3186getWhite0d7_KjU;
            if (ComposerKt.isTraceInProgress()) {
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        scopeUpdateScopeEndRestartGroup2 = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup2 == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FaceGuide_ww6aTOc$lambda$3$lambda$2(long j, VideoViewportSize videoViewportSize, RectF rectF, DrawScope drawScope) {
        Intrinsics.checkNotNullParameter(drawScope, "");
        DrawScope.m3686drawRectnJ9OG0$default(drawScope, j, 0L, drawScope.mo3691getSizeNHjbRc(), 0.0f, null, null, 0, 122, null);
        float f = 2;
        long jOffset = OffsetKt.Offset((Size.m2979getWidthimpl(drawScope.mo3691getSizeNHjbRc()) - IntSize.m5574getWidthimpl(videoViewportSize.m6100getViewportPixelSizeYbymL2g())) / f, (Size.m2976getHeightimpl(drawScope.mo3691getSizeNHjbRc()) - IntSize.m5573getHeightimpl(videoViewportSize.m6100getViewportPixelSizeYbymL2g())) / f);
        long jOffset2 = OffsetKt.Offset(Offset.m2910getXimpl(jOffset) + rectF.left, Offset.m2911getYimpl(jOffset) + rectF.top);
        long jSize = SizeKt.Size(rectF.right - rectF.left, rectF.bottom - rectF.top);
        DrawScope.m3680drawOvalnJ9OG0$default(drawScope, ColorKt.Color(4289639351L), jOffset2, jSize, 0.0f, new Stroke(drawScope.mo516toPx0680j_4(Dp.m5414constructorimpl(4)), 0.0f, 0, 0, null, 30, null), null, 0, 104, null);
        DrawScope.m3680drawOvalnJ9OG0$default(drawScope, Color.Companion.m3184getTransparent0d7_KjU(), jOffset2, jSize, 0.0f, Fill.INSTANCE, null, BlendMode.Companion.m3092getSrcOut0nO6VwU(), 40, null);
        return Unit.INSTANCE;
    }

    public static final void FaceGuidePreview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-159545886);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-159545886, i, -1, "com.amplifyframework.ui.liveness.ui.FaceGuidePreview (FaceGuide.kt:95)");
            }
            Modifier.Companion companion = Modifier.Companion;
            float f = 1080;
            float f2 = 1920;
            Modifier modifierM350backgroundbw27NRU$default = BackgroundKt.m350backgroundbw27NRU$default(androidx.compose.foundation.layout.SizeKt.m720sizeVpY3zN4(companion, Dp.m5414constructorimpl(f), Dp.m5414constructorimpl(f2)), Color.Companion.m3183getRed0d7_KjU(), null, 2, null);
            composerStartRestartGroup.startReplaceableGroup(733328855);
            MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.Companion.getTopStart(), false, composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
            yHO<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> yhoMaterializerOf = LayoutKt.materializerOf(modifierM350backgroundbw27NRU$default);
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
            Updater.m2790setimpl(composerM2783constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m2790setimpl(composerM2783constructorimpl, density, companion2.getSetDensity());
            Updater.m2790setimpl(composerM2783constructorimpl, layoutDirection, companion2.getSetLayoutDirection());
            Updater.m2790setimpl(composerM2783constructorimpl, viewConfiguration, companion2.getSetViewConfiguration());
            composerStartRestartGroup.enableReusing();
            yhoMaterializerOf.invoke(SkippableUpdater.m2774boximpl(SkippableUpdater.m2775constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            m6073FaceGuideww6aTOc(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(companion, 0.0f, 1, null), new RectF(50.0f, 50.0f, 200.0f, 400.0f), new VideoViewportSize(IntSizeKt.IntSize(1080, 2100), IntSizeKt.IntSize(1080, 1920), DpKt.m5436DpSizeYgX7TsA(Dp.m5414constructorimpl(f), Dp.m5414constructorimpl(f2)), null), 0L, composerStartRestartGroup, 6, 8);
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.amplifyframework.ui.liveness.ui.FaceGuideKt$$ExternalSyntheticLambda3
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return FaceGuideKt.FaceGuidePreview$lambda$6(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
