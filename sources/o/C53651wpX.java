package o;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.FlowLayoutKt;
import androidx.compose.foundation.layout.FlowRowScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextOverflow;
import com.amplifyframework.ui.liveness.ml.FaceDetector;
import com.google.android.exoplayer2.audio.WavUtil;
import com.okinc.tradingbot.impl.planet.model.BotUiExtras;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.C48033uCm;
import o.C52761wXj;
import o.C55688xof;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wpX, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C53651wpX {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final Unit copydefault(Modifier modifier, BotUiExtras botUiExtras, java.lang.String str, java.lang.String str2, boolean z, int i, int i2, Composer composer, int i3) {
        OLrzqt(modifier, botUiExtras, str, str2, z, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final Unit copydefault(Modifier modifier, java.lang.String str, long j, java.lang.String str2, int i, int i2, Composer composer, int i3) {
        copydefault(modifier, str, j, str2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final Unit copydefault(Modifier modifier, java.lang.String str, java.lang.String str2, TextStyle textStyle, int i, int i2, Composer composer, int i3) {
        AEQbTJ(modifier, str, str2, textStyle, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final void copydefault(Modifier modifier, @NotNull final java.lang.String str, final long j, @NotNull final java.lang.String str2, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        final Modifier modifier3;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Composer composerStartRestartGroup = composer.startRestartGroup(1432601837);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
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
            i3 |= composerStartRestartGroup.changed(j) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changed(str2) ? 2048 : 1024;
        }
        int i5 = i3;
        if ((i5 & 1171) != 1170 || !composerStartRestartGroup.getSkipping()) {
            Modifier modifier4 = i4 != 0 ? Modifier.Companion : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1432601837, i5, -1, "com.okinc.tradingbot.impl.planet.ui.BotMetrics (BotMetricsCompose.kt:38)");
            }
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null);
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.HorizontalOrVertical horizontalOrVerticalM582spacedBy0680j_4 = arrangement.m582spacedBy0680j_4(androidx.compose.ui.unit.Dp.m5414constructorimpl(6));
            Arrangement.HorizontalOrVertical horizontalOrVerticalM582spacedBy0680j_42 = arrangement.m582spacedBy0680j_4(androidx.compose.ui.unit.Dp.m5414constructorimpl(16));
            composerStartRestartGroup.startReplaceableGroup(1098475987);
            MeasurePolicy measurePolicyRowMeasurementHelper = FlowLayoutKt.rowMeasurementHelper(horizontalOrVerticalM582spacedBy0680j_42, horizontalOrVerticalM582spacedBy0680j_4, Integer.MAX_VALUE, composerStartRestartGroup, 54);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            Function0<ComposeUiNode> constructor = companion.getConstructor();
            yHO<SkippableUpdater<ComposeUiNode>, Composer, java.lang.Integer, Unit> yhoModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierFillMaxWidth$default);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM2783constructorimpl = Updater.m2783constructorimpl(composerStartRestartGroup);
            Updater.m2790setimpl(composerM2783constructorimpl, measurePolicyRowMeasurementHelper, companion.getSetMeasurePolicy());
            Updater.m2790setimpl(composerM2783constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, java.lang.Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (composerM2783constructorimpl.getInserting() || !Intrinsics.EZpvd(composerM2783constructorimpl.rememberedValue(), java.lang.Integer.valueOf(currentCompositeKeyHash))) {
                composerM2783constructorimpl.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash));
                composerM2783constructorimpl.apply(java.lang.Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            yhoModifierMaterializerOf.invoke(SkippableUpdater.m2774boximpl(SkippableUpdater.m2775constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            FlowRowScopeInstance flowRowScopeInstance = FlowRowScopeInstance.INSTANCE;
            java.lang.String strStringResource = StringResources_androidKt.stringResource(C48033uCm.Fragment.dSJNDS, composerStartRestartGroup, 0);
            TextStyle textStyleOLrzqt = C52698wVa.OLrzqt(C52761wXj.LoaderManager.QOLQEE, null, composerStartRestartGroup, 0, 2);
            Modifier modifier5 = modifier4;
            AEQbTJ(null, strStringResource, str, textStyleOLrzqt.m4941copyv2rsoow((16777214 & 1) != 0 ? textStyleOLrzqt.spanStyle.m4882getColor0d7_KjU() : j, (16777214 & 2) != 0 ? textStyleOLrzqt.spanStyle.m4883getFontSizeXSAIIZE() : 0L, (16777214 & 4) != 0 ? textStyleOLrzqt.spanStyle.getFontWeight() : null, (16777214 & 8) != 0 ? textStyleOLrzqt.spanStyle.m4884getFontStyle4Lr2A7w() : null, (16777214 & 16) != 0 ? textStyleOLrzqt.spanStyle.m4885getFontSynthesisZQGJjVo() : null, (16777214 & 32) != 0 ? textStyleOLrzqt.spanStyle.getFontFamily() : null, (16777214 & 64) != 0 ? textStyleOLrzqt.spanStyle.getFontFeatureSettings() : null, (16777214 & 128) != 0 ? textStyleOLrzqt.spanStyle.m4886getLetterSpacingXSAIIZE() : 0L, (16777214 & 256) != 0 ? textStyleOLrzqt.spanStyle.m4881getBaselineShift5SSeXJ0() : null, (16777214 & 512) != 0 ? textStyleOLrzqt.spanStyle.getTextGeometricTransform() : null, (16777214 & 1024) != 0 ? textStyleOLrzqt.spanStyle.getLocaleList() : null, (16777214 & 2048) != 0 ? textStyleOLrzqt.spanStyle.m4880getBackground0d7_KjU() : 0L, (16777214 & 4096) != 0 ? textStyleOLrzqt.spanStyle.getTextDecoration() : null, (16777214 & 8192) != 0 ? textStyleOLrzqt.spanStyle.getShadow() : null, (16777214 & 16384) != 0 ? textStyleOLrzqt.spanStyle.getDrawStyle() : null, (16777214 & 32768) != 0 ? textStyleOLrzqt.paragraphStyle.m4838getTextAlignbuA522U() : null, (16777214 & 65536) != 0 ? textStyleOLrzqt.paragraphStyle.m4840getTextDirectionmmuk1to() : null, (16777214 & 131072) != 0 ? textStyleOLrzqt.paragraphStyle.m4837getLineHeightXSAIIZE() : 0L, (16777214 & 262144) != 0 ? textStyleOLrzqt.paragraphStyle.getTextIndent() : null, (16777214 & 524288) != 0 ? textStyleOLrzqt.platformStyle : null, (16777214 & 1048576) != 0 ? textStyleOLrzqt.paragraphStyle.getLineHeightStyle() : null, (16777214 & 2097152) != 0 ? textStyleOLrzqt.paragraphStyle.m4835getLineBreakLgCVezo() : null, (16777214 & 4194304) != 0 ? textStyleOLrzqt.paragraphStyle.m4833getHyphensEaSxIns() : null, (16777214 & 8388608) != 0 ? textStyleOLrzqt.paragraphStyle.getTextMotion() : null), composerStartRestartGroup, (i5 << 3) & FaceDetector.NUM_BOXES, 1);
            AEQbTJ(null, StringResources_androidKt.stringResource(C48033uCm.Fragment.HJWChPHhYHK, composerStartRestartGroup, 0), str2, C52698wVa.OLrzqt(C52761wXj.LoaderManager.QOLQEE, java.lang.Integer.valueOf(C52761wXj.Activity.fdOvFl), composerStartRestartGroup, 0, 0), composerStartRestartGroup, (i5 >> 3) & FaceDetector.NUM_BOXES, 1);
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier3 = modifier5;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            modifier3 = modifier2;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: o.wpU
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return C53651wpX.copydefault(modifier3, str, j, str2, i, i2, (Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:68:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01f7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AEQbTJ(Modifier modifier, @NotNull final java.lang.String str, @NotNull final java.lang.String str2, TextStyle textStyle, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        TextStyle textStyle2;
        Modifier modifier3;
        TextStyle textStyleOLrzqt;
        int i4;
        int currentCompositeKeyHash;
        Composer composerM2783constructorimpl;
        Function2<ComposeUiNode, java.lang.Integer, Unit> setCompositeKeyHash;
        Composer composer2;
        final TextStyle textStyle3;
        final Modifier modifier4;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1417469179);
        int i5 = i2 & 1;
        if (i5 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
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
            i3 |= composerStartRestartGroup.changed(str2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            if ((i2 & 8) == 0) {
                textStyle2 = textStyle;
                int i6 = composerStartRestartGroup.changed(textStyle2) ? 2048 : 1024;
                i3 |= i6;
            } else {
                textStyle2 = textStyle;
            }
            i3 |= i6;
        } else {
            textStyle2 = textStyle;
        }
        if ((i3 & 1171) != 1170 || !composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                Modifier modifier5 = i5 != 0 ? Modifier.Companion : modifier2;
                if ((i2 & 8) != 0) {
                    modifier3 = modifier5;
                    textStyleOLrzqt = C52698wVa.OLrzqt(C52761wXj.LoaderManager.DTwDnp, java.lang.Integer.valueOf(C52761wXj.Activity.fdOvFl), composerStartRestartGroup, 0, 0);
                    i4 = i3 & (-7169);
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1417469179, i4, -1, "com.okinc.tradingbot.impl.planet.ui.MetricItem (BotMetricsCompose.kt:70)");
                    }
                    Modifier modifierWrapContentWidth$default = SizeKt.wrapContentWidth$default(modifier3, null, false, 3, null);
                    Arrangement.HorizontalOrVertical horizontalOrVerticalM582spacedBy0680j_4 = Arrangement.INSTANCE.m582spacedBy0680j_4(androidx.compose.ui.unit.Dp.m5414constructorimpl(4));
                    composerStartRestartGroup.startReplaceableGroup(693286680);
                    MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(horizontalOrVerticalM582spacedBy0680j_4, Alignment.Companion.getTop(), composerStartRestartGroup, 6);
                    composerStartRestartGroup.startReplaceableGroup(-1323940314);
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    ComposeUiNode.Companion companion = ComposeUiNode.Companion;
                    Function0<ComposeUiNode> constructor = companion.getConstructor();
                    yHO<SkippableUpdater<ComposeUiNode>, Composer, java.lang.Integer, Unit> yhoModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierWrapContentWidth$default);
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (!composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerM2783constructorimpl = Updater.m2783constructorimpl(composerStartRestartGroup);
                    Updater.m2790setimpl(composerM2783constructorimpl, measurePolicyRowMeasurePolicy, companion.getSetMeasurePolicy());
                    Updater.m2790setimpl(composerM2783constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                    setCompositeKeyHash = companion.getSetCompositeKeyHash();
                    if (!composerM2783constructorimpl.getInserting() || !Intrinsics.EZpvd(composerM2783constructorimpl.rememberedValue(), java.lang.Integer.valueOf(currentCompositeKeyHash))) {
                        composerM2783constructorimpl.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash));
                        composerM2783constructorimpl.apply(java.lang.Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    yhoModifierMaterializerOf.invoke(SkippableUpdater.m2774boximpl(SkippableUpdater.m2775constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(2058660585);
                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                    int i7 = i4;
                    Modifier modifier6 = modifier3;
                    composer2 = composerStartRestartGroup;
                    TextKt.m2072Text4IGK_g(str, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, C52698wVa.OLrzqt(C52761wXj.LoaderManager.QOLQEE, java.lang.Integer.valueOf(C52761wXj.Activity.QwvEab), composerStartRestartGroup, 0, 0), composer2, (i7 >> 3) & 14, 0, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE);
                    TextKt.m2072Text4IGK_g(str2, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.Companion.m5334getEllipsisgIe3tQ8(), false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, textStyleOLrzqt, composer2, (i7 >> 6) & 14, ((i7 << 9) & 3670016) | 432, 59390);
                    composer2.endReplaceableGroup();
                    composer2.endNode();
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    textStyle3 = textStyleOLrzqt;
                    modifier4 = modifier6;
                } else {
                    modifier2 = modifier5;
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                if ((i2 & 8) != 0) {
                    i3 &= -7169;
                }
            }
            modifier3 = modifier2;
            i4 = i3;
            textStyleOLrzqt = textStyle2;
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            Modifier modifierWrapContentWidth$default2 = SizeKt.wrapContentWidth$default(modifier3, null, false, 3, null);
            Arrangement.HorizontalOrVertical horizontalOrVerticalM582spacedBy0680j_42 = Arrangement.INSTANCE.m582spacedBy0680j_4(androidx.compose.ui.unit.Dp.m5414constructorimpl(4));
            composerStartRestartGroup.startReplaceableGroup(693286680);
            MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(horizontalOrVerticalM582spacedBy0680j_42, Alignment.Companion.getTop(), composerStartRestartGroup, 6);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
            yHO<SkippableUpdater<ComposeUiNode>, Composer, java.lang.Integer, Unit> yhoModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierWrapContentWidth$default2);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
            }
            composerStartRestartGroup.startReusableNode();
            if (!composerStartRestartGroup.getInserting()) {
            }
            composerM2783constructorimpl = Updater.m2783constructorimpl(composerStartRestartGroup);
            Updater.m2790setimpl(composerM2783constructorimpl, measurePolicyRowMeasurePolicy2, companion2.getSetMeasurePolicy());
            Updater.m2790setimpl(composerM2783constructorimpl, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
            setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (!composerM2783constructorimpl.getInserting()) {
                composerM2783constructorimpl.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash));
                composerM2783constructorimpl.apply(java.lang.Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                yhoModifierMaterializerOf2.invoke(SkippableUpdater.m2774boximpl(SkippableUpdater.m2775constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(2058660585);
                RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                int i72 = i4;
                Modifier modifier62 = modifier3;
                composer2 = composerStartRestartGroup;
                TextKt.m2072Text4IGK_g(str, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, C52698wVa.OLrzqt(C52761wXj.LoaderManager.QOLQEE, java.lang.Integer.valueOf(C52761wXj.Activity.QwvEab), composerStartRestartGroup, 0, 0), composer2, (i72 >> 3) & 14, 0, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE);
                TextKt.m2072Text4IGK_g(str2, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.Companion.m5334getEllipsisgIe3tQ8(), false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, textStyleOLrzqt, composer2, (i72 >> 6) & 14, ((i72 << 9) & 3670016) | 432, 59390);
                composer2.endReplaceableGroup();
                composer2.endNode();
                composer2.endReplaceableGroup();
                composer2.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                }
                textStyle3 = textStyleOLrzqt;
                modifier4 = modifier62;
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            modifier4 = modifier2;
            textStyle3 = textStyle2;
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: o.wqb
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return C53651wpX.copydefault(modifier4, str, str2, textStyle3, i, i2, (Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void OLrzqt(Modifier modifier, @NotNull final BotUiExtras botUiExtras, @NotNull final java.lang.String str, @NotNull final java.lang.String str2, final boolean z, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        Modifier modifier3;
        Intrinsics.checkNotNullParameter(botUiExtras, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1788557937);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(botUiExtras) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= MLKEMEngine.KyberPolyBytes;
        } else if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i3 |= composerStartRestartGroup.changed(str) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changed(str2) ? 2048 : 1024;
        }
        if ((i2 & 16) != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            i3 |= composerStartRestartGroup.changed(z) ? 16384 : 8192;
        }
        int i5 = i3;
        if ((i5 & 9363) != 9362 || !composerStartRestartGroup.getSkipping()) {
            modifier3 = i4 != 0 ? Modifier.Companion : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1788557937, i5, -1, "com.okinc.tradingbot.impl.planet.ui.BotExpandedMetrics (BotMetricsCompose.kt:102)");
            }
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null);
            Arrangement arrangement = Arrangement.INSTANCE;
            float f = 8;
            Arrangement.HorizontalOrVertical horizontalOrVerticalM582spacedBy0680j_4 = arrangement.m582spacedBy0680j_4(androidx.compose.ui.unit.Dp.m5414constructorimpl(f));
            composerStartRestartGroup.startReplaceableGroup(693286680);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(horizontalOrVerticalM582spacedBy0680j_4, Alignment.Companion.getTop(), composerStartRestartGroup, 6);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            Function0<ComposeUiNode> constructor = companion.getConstructor();
            yHO<SkippableUpdater<ComposeUiNode>, Composer, java.lang.Integer, Unit> yhoModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierFillMaxWidth$default);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM2783constructorimpl = Updater.m2783constructorimpl(composerStartRestartGroup);
            Updater.m2790setimpl(composerM2783constructorimpl, measurePolicyRowMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m2790setimpl(composerM2783constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, java.lang.Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (composerM2783constructorimpl.getInserting() || !Intrinsics.EZpvd(composerM2783constructorimpl.rememberedValue(), java.lang.Integer.valueOf(currentCompositeKeyHash))) {
                composerM2783constructorimpl.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash));
                composerM2783constructorimpl.apply(java.lang.Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            yhoModifierMaterializerOf.invoke(SkippableUpdater.m2774boximpl(SkippableUpdater.m2775constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            Modifier.Companion companion2 = Modifier.Companion;
            Modifier modifierM675paddingqDBjuR0$default = PaddingKt.m675paddingqDBjuR0$default(RowScope.weight$default(rowScopeInstance, companion2, 1.0f, false, 2, null), 0.0f, androidx.compose.ui.unit.Dp.m5414constructorimpl(f), 0.0f, 0.0f, 13, null);
            Arrangement.HorizontalOrVertical horizontalOrVerticalM582spacedBy0680j_42 = arrangement.m582spacedBy0680j_4(androidx.compose.ui.unit.Dp.m5414constructorimpl(6));
            Arrangement.HorizontalOrVertical horizontalOrVerticalM582spacedBy0680j_43 = arrangement.m582spacedBy0680j_4(androidx.compose.ui.unit.Dp.m5414constructorimpl(16));
            composerStartRestartGroup.startReplaceableGroup(1098475987);
            MeasurePolicy measurePolicyRowMeasurementHelper = FlowLayoutKt.rowMeasurementHelper(horizontalOrVerticalM582spacedBy0680j_43, horizontalOrVerticalM582spacedBy0680j_42, Integer.MAX_VALUE, composerStartRestartGroup, 54);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor2 = companion.getConstructor();
            yHO<SkippableUpdater<ComposeUiNode>, Composer, java.lang.Integer, Unit> yhoModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierM675paddingqDBjuR0$default);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor2);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM2783constructorimpl2 = Updater.m2783constructorimpl(composerStartRestartGroup);
            Updater.m2790setimpl(composerM2783constructorimpl2, measurePolicyRowMeasurementHelper, companion.getSetMeasurePolicy());
            Updater.m2790setimpl(composerM2783constructorimpl2, currentCompositionLocalMap2, companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, java.lang.Integer, Unit> setCompositeKeyHash2 = companion.getSetCompositeKeyHash();
            if (composerM2783constructorimpl2.getInserting() || !Intrinsics.EZpvd(composerM2783constructorimpl2.rememberedValue(), java.lang.Integer.valueOf(currentCompositeKeyHash2))) {
                composerM2783constructorimpl2.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash2));
                composerM2783constructorimpl2.apply(java.lang.Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            yhoModifierMaterializerOf2.invoke(SkippableUpdater.m2774boximpl(SkippableUpdater.m2775constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            FlowRowScopeInstance flowRowScopeInstance = FlowRowScopeInstance.INSTANCE;
            AEQbTJ(null, StringResources_androidKt.stringResource(C48033uCm.Fragment.HJWChPHhYHK, composerStartRestartGroup, 0), str2, null, composerStartRestartGroup, (i5 >> 3) & FaceDetector.NUM_BOXES, 9);
            if (Intrinsics.EZpvd(botUiExtras, BotUiExtras.Nothing.EZpvd)) {
                composerStartRestartGroup.startReplaceableGroup(-115575080);
                if (str.length() > 0 && !Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "--")) {
                    AEQbTJ(null, StringResources_androidKt.stringResource(C55688xof.Application.onTabUnselected, composerStartRestartGroup, 0), str, null, composerStartRestartGroup, i5 & FaceDetector.NUM_BOXES, 9);
                }
                composerStartRestartGroup.endReplaceableGroup();
            } else if (botUiExtras instanceof BotUiExtras.RecurringBuy) {
                composerStartRestartGroup.startReplaceableGroup(-115205963);
                AEQbTJ(null, StringResources_androidKt.stringResource(C55688xof.Application.PlaybackStateCompatRepeatMode, composerStartRestartGroup, 0), ((BotUiExtras.RecurringBuy) botUiExtras).OLrzqt(), null, composerStartRestartGroup, 0, 9);
                composerStartRestartGroup.endReplaceableGroup();
            } else if (botUiExtras instanceof BotUiExtras.SignalBot) {
                composerStartRestartGroup.startReplaceableGroup(-114926002);
                BotUiExtras.SignalBot signalBot = (BotUiExtras.SignalBot) botUiExtras;
                if (signalBot.AEQbTJ().length() > 0) {
                    AEQbTJ(null, StringResources_androidKt.stringResource(C48033uCm.Fragment.UkCIYP, composerStartRestartGroup, 0), signalBot.AEQbTJ(), null, composerStartRestartGroup, 0, 9);
                }
                composerStartRestartGroup.endReplaceableGroup();
            } else {
                if (!(botUiExtras instanceof BotUiExtras.SmartArbitrage)) {
                    composerStartRestartGroup.startReplaceableGroup(-1666297105);
                    composerStartRestartGroup.endReplaceableGroup();
                    throw new NoWhenBranchMatchedException();
                }
                composerStartRestartGroup.startReplaceableGroup(-114545074);
                AEQbTJ(null, StringResources_androidKt.stringResource(C55688xof.Application.getViewModelStore, composerStartRestartGroup, 0), C53418wlC.KWHzl(((BotUiExtras.SmartArbitrage) botUiExtras).EZpvd()), null, composerStartRestartGroup, 0, 9);
                composerStartRestartGroup.endReplaceableGroup();
            }
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.startReplaceableGroup(109090653);
            if (z) {
                SpacerKt.Spacer(SizeKt.m718size3ABfNKs(companion2, androidx.compose.ui.unit.Dp.m5414constructorimpl(28)), composerStartRestartGroup, 6);
            }
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            modifier3 = modifier2;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final Modifier modifier4 = modifier3;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: o.wqc
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return C53651wpX.copydefault(modifier4, botUiExtras, str, str2, z, i, i2, (Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }
}
