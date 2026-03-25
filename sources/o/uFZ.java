package o;

import androidx.compose.animation.AnimationModifierKt;
import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.text.BasicTextKt;
import androidx.compose.material3.DividerKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.RotateKt;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.ColorResources_androidKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.PrimitiveResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.AnnotatedString;
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
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import com.okinc.business.defi.biz.core.error.WalletImportError;
import com.okinc.tradingbot.impl.aiBot.dto.PreviewAiStrategyResponseDto;
import com.okinc.tradingbot.impl.aiBot.ui.preview.PreviewAiStrategyResultComposableKt$PreviewAiStrategyResultComposable$1$1;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.C48033uCm;
import o.C52761wXj;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import org.jetbrains.annotations.NotNull;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: loaded from: classes19.dex */
public final class uFZ {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final Unit AEQbTJ(Modifier modifier, java.lang.String str, java.lang.String str2, java.lang.String str3, Function0 function0, int i, int i2, Composer composer, int i3) {
        AEQbTJ(modifier, str, str2, str3, (Function0<Unit>) function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final Unit AEQbTJ(PreviewAiStrategyResponseDto previewAiStrategyResponseDto, Function1 function1, Function1 function12, Modifier modifier, int i, int i2, Composer composer, int i3) {
        OLrzqt(previewAiStrategyResponseDto, function1, function12, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final Unit EZpvd(Modifier modifier, java.lang.String str, java.lang.String str2, int i, int i2, Composer composer, int i3) {
        KWHzl(modifier, str, str2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final Unit EZpvd(java.lang.String str, java.lang.String str2, boolean z, float f, boolean z2, int i, Composer composer, int i2) {
        KWHzl(str, str2, z, f, z2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final Unit EZpvd(Function0 function0, int i, Composer composer, int i2) {
        OLrzqt((Function0<Unit>) function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final Unit OLrzqt(boolean z, float f, int i, Composer composer, int i2) {
        KWHzl(z, f, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Class process forced to load method for inline: androidx.compose.foundation.ScrollKt.verticalScroll$default(androidx.compose.ui.Modifier, androidx.compose.foundation.ScrollState, boolean, androidx.compose.foundation.gestures.FlingBehavior, boolean, int, java.lang.Object):androidx.compose.ui.Modifier */
    /* JADX WARN: Removed duplicated region for block: B:101:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x02cc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void OLrzqt(@NotNull final PreviewAiStrategyResponseDto previewAiStrategyResponseDto, @NotNull final Function1<? super java.lang.Boolean, Unit> function1, @NotNull final Function1<? super java.lang.String, Unit> function12, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        java.lang.Object objRememberedValue;
        Composer.Companion companion;
        androidx.compose.runtime.State state;
        boolean z;
        java.lang.Object objRememberedValue2;
        int currentCompositeKeyHash;
        Composer composerM2783constructorimpl;
        Function2<ComposeUiNode, java.lang.Integer, Unit> setCompositeKeyHash;
        boolean z2;
        boolean z3;
        java.lang.Object objRememberedValue3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(previewAiStrategyResponseDto, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function12, "");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1662809296);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(previewAiStrategyResponseDto) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= MLKEMEngine.KyberPolyBytes;
        } else if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function12) ? 256 : 128;
        }
        int i5 = i2 & 8;
        if (i5 == 0) {
            if ((i & 3072) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
            }
            i4 = i3;
            if ((i4 & 1171) == 1170 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier3 = i5 == 0 ? Modifier.Companion : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1662809296, i4, -1, "com.okinc.tradingbot.impl.aiBot.ui.preview.PreviewAiStrategyResultComposable (PreviewAiStrategyResultComposable.kt:58)");
                }
                final ScrollState scrollStateRememberScrollState = ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1);
                Modifier.Companion companion2 = Modifier.Companion;
                Modifier modifierM673paddingVpY3zN4$default = PaddingKt.m673paddingVpY3zN4$default(companion2, PrimitiveResources_androidKt.dimensionResource(C52761wXj.StateListAnimator.AEQbTJ, composerStartRestartGroup, 0), 0.0f, 2, null);
                composerStartRestartGroup.startReplaceableGroup(764962604);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.Companion;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = SnapshotStateKt.derivedStateOf(new Function0() { // from class: o.uGd
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return java.lang.Boolean.valueOf(uFZ.EZpvd(scrollStateRememberScrollState));
                        }
                    });
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                state = (androidx.compose.runtime.State) objRememberedValue;
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.startReplaceableGroup(764974276);
                z = (i4 & WalletImportError.ERROR_CODE_AA_EXIST) != 32;
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (!z || objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = new PreviewAiStrategyResultComposableKt$PreviewAiStrategyResultComposable$1$1(state, function1, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                EffectsKt.LaunchedEffect(scrollStateRememberScrollState, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends java.lang.Object>) objRememberedValue2, composerStartRestartGroup, 0);
                float f = 16;
                float f2 = 24;
                Modifier modifierM675paddingqDBjuR0$default = PaddingKt.m675paddingqDBjuR0$default(ScrollKt.verticalScroll$default(SizeKt.fillMaxSize$default(modifier3, 0.0f, 1, null), scrollStateRememberScrollState, false, null, false, 14, null), 0.0f, androidx.compose.ui.unit.Dp.m5414constructorimpl(f), 0.0f, androidx.compose.ui.unit.Dp.m5414constructorimpl(f2), 5, null);
                float f3 = 12;
                Arrangement.HorizontalOrVertical horizontalOrVerticalM582spacedBy0680j_4 = Arrangement.INSTANCE.m582spacedBy0680j_4(androidx.compose.ui.unit.Dp.m5414constructorimpl(f3));
                composerStartRestartGroup.startReplaceableGroup(-483455358);
                MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(horizontalOrVerticalM582spacedBy0680j_4, Alignment.Companion.getStart(), composerStartRestartGroup, 6);
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
                Function0<ComposeUiNode> constructor = companion3.getConstructor();
                yHO<SkippableUpdater<ComposeUiNode>, Composer, java.lang.Integer, Unit> yhoModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM675paddingqDBjuR0$default);
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
                Updater.m2790setimpl(composerM2783constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
                Updater.m2790setimpl(composerM2783constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                if (!composerM2783constructorimpl.getInserting() || !Intrinsics.EZpvd(composerM2783constructorimpl.rememberedValue(), java.lang.Integer.valueOf(currentCompositeKeyHash))) {
                    composerM2783constructorimpl.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash));
                    composerM2783constructorimpl.apply(java.lang.Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                yhoModifierMaterializerOf.invoke(SkippableUpdater.m2774boximpl(SkippableUpdater.m2775constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(2058660585);
                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                KWHzl(modifierM673paddingVpY3zN4$default, StringResources_androidKt.stringResource(C48033uCm.Fragment.OBJEWx, composerStartRestartGroup, 0), StringResources_androidKt.stringResource(C48033uCm.Fragment.DCUTEI, composerStartRestartGroup, 0), composerStartRestartGroup, 0, 0);
                java.lang.String strStringResource = StringResources_androidKt.stringResource(C48033uCm.Fragment.dmfpNf, composerStartRestartGroup, 0);
                java.lang.String strAEQbTJ = previewAiStrategyResponseDto.AEQbTJ();
                composerStartRestartGroup.startReplaceableGroup(-2008654043);
                z2 = (i4 & FaceDetector.NUM_BOXES) != 256;
                z3 = (i4 & 14) != 4;
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (!(z3 | z2) || objRememberedValue3 == companion.getEmpty()) {
                    objRememberedValue3 = new Function0() { // from class: o.uGi
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return uFZ.EZpvd(function12, previewAiStrategyResponseDto);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                composerStartRestartGroup.endReplaceableGroup();
                AEQbTJ(modifierM673paddingVpY3zN4$default, strStringResource, (java.lang.String) null, strAEQbTJ, (Function0<Unit>) objRememberedValue3, composerStartRestartGroup, 0, 4);
                AEQbTJ(modifierM673paddingVpY3zN4$default, StringResources_androidKt.stringResource(C48033uCm.Fragment.QkdxfA, composerStartRestartGroup, 0), (java.lang.String) null, previewAiStrategyResponseDto.EZpvd(), (Function0<Unit>) null, composerStartRestartGroup, 0, 20);
                DividerKt.m1696Divider9IZ8Weo(PaddingKt.m675paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), 0.0f, androidx.compose.ui.unit.Dp.m5414constructorimpl(f2), 0.0f, androidx.compose.ui.unit.Dp.m5414constructorimpl(f3), 5, null), androidx.compose.ui.unit.Dp.m5414constructorimpl((float) 0.5d), ColorResources_androidKt.colorResource(C52761wXj.Activity.zuBGHE, composerStartRestartGroup, 0), composerStartRestartGroup, 54, 0);
                AEQbTJ(PaddingKt.m675paddingqDBjuR0$default(companion2, 0.0f, 0.0f, 0.0f, androidx.compose.ui.unit.Dp.m5414constructorimpl(f), 7, null).then(modifierM673paddingVpY3zN4$default), StringResources_androidKt.stringResource(C48033uCm.Fragment.QHmsKR, composerStartRestartGroup, 0), StringResources_androidKt.stringResource(C48033uCm.Fragment.getPostValueLengthLimit, composerStartRestartGroup, 0), previewAiStrategyResponseDto.copydefault(), (Function0<Unit>) null, composerStartRestartGroup, 0, 16);
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = modifier3;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                final Modifier modifier4 = modifier2;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: o.uGf
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return uFZ.AEQbTJ(previewAiStrategyResponseDto, function1, function12, modifier4, i, i2, (Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 3072;
        modifier2 = modifier;
        i4 = i3;
        if ((i4 & 1171) == 1170) {
            if (i5 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            final ScrollState scrollStateRememberScrollState2 = ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1);
            Modifier.Companion companion22 = Modifier.Companion;
            Modifier modifierM673paddingVpY3zN4$default2 = PaddingKt.m673paddingVpY3zN4$default(companion22, PrimitiveResources_androidKt.dimensionResource(C52761wXj.StateListAnimator.AEQbTJ, composerStartRestartGroup, 0), 0.0f, 2, null);
            composerStartRestartGroup.startReplaceableGroup(764962604);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            companion = Composer.Companion;
            if (objRememberedValue == companion.getEmpty()) {
            }
            state = (androidx.compose.runtime.State) objRememberedValue;
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.startReplaceableGroup(764974276);
            if ((i4 & WalletImportError.ERROR_CODE_AA_EXIST) != 32) {
            }
            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (!z) {
                objRememberedValue2 = new PreviewAiStrategyResultComposableKt$PreviewAiStrategyResultComposable$1$1(state, function1, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                composerStartRestartGroup.endReplaceableGroup();
                EffectsKt.LaunchedEffect(scrollStateRememberScrollState2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends java.lang.Object>) objRememberedValue2, composerStartRestartGroup, 0);
                float f4 = 16;
                float f22 = 24;
                Modifier modifierM675paddingqDBjuR0$default2 = PaddingKt.m675paddingqDBjuR0$default(ScrollKt.verticalScroll$default(SizeKt.fillMaxSize$default(modifier3, 0.0f, 1, null), scrollStateRememberScrollState2, false, null, false, 14, null), 0.0f, androidx.compose.ui.unit.Dp.m5414constructorimpl(f4), 0.0f, androidx.compose.ui.unit.Dp.m5414constructorimpl(f22), 5, null);
                float f32 = 12;
                Arrangement.HorizontalOrVertical horizontalOrVerticalM582spacedBy0680j_42 = Arrangement.INSTANCE.m582spacedBy0680j_4(androidx.compose.ui.unit.Dp.m5414constructorimpl(f32));
                composerStartRestartGroup.startReplaceableGroup(-483455358);
                MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(horizontalOrVerticalM582spacedBy0680j_42, Alignment.Companion.getStart(), composerStartRestartGroup, 6);
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion32 = ComposeUiNode.Companion;
                Function0<ComposeUiNode> constructor2 = companion32.getConstructor();
                yHO<SkippableUpdater<ComposeUiNode>, Composer, java.lang.Integer, Unit> yhoModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierM675paddingqDBjuR0$default2);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                }
                composerStartRestartGroup.startReusableNode();
                if (!composerStartRestartGroup.getInserting()) {
                }
                composerM2783constructorimpl = Updater.m2783constructorimpl(composerStartRestartGroup);
                Updater.m2790setimpl(composerM2783constructorimpl, measurePolicyColumnMeasurePolicy2, companion32.getSetMeasurePolicy());
                Updater.m2790setimpl(composerM2783constructorimpl, currentCompositionLocalMap2, companion32.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion32.getSetCompositeKeyHash();
                if (!composerM2783constructorimpl.getInserting()) {
                    composerM2783constructorimpl.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash));
                    composerM2783constructorimpl.apply(java.lang.Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    yhoModifierMaterializerOf2.invoke(SkippableUpdater.m2774boximpl(SkippableUpdater.m2775constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(2058660585);
                    ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                    KWHzl(modifierM673paddingVpY3zN4$default2, StringResources_androidKt.stringResource(C48033uCm.Fragment.OBJEWx, composerStartRestartGroup, 0), StringResources_androidKt.stringResource(C48033uCm.Fragment.DCUTEI, composerStartRestartGroup, 0), composerStartRestartGroup, 0, 0);
                    java.lang.String strStringResource2 = StringResources_androidKt.stringResource(C48033uCm.Fragment.dmfpNf, composerStartRestartGroup, 0);
                    java.lang.String strAEQbTJ2 = previewAiStrategyResponseDto.AEQbTJ();
                    composerStartRestartGroup.startReplaceableGroup(-2008654043);
                    if ((i4 & FaceDetector.NUM_BOXES) != 256) {
                    }
                    if ((i4 & 14) != 4) {
                    }
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (!(z3 | z2)) {
                        objRememberedValue3 = new Function0() { // from class: o.uGi
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                return uFZ.EZpvd(function12, previewAiStrategyResponseDto);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        composerStartRestartGroup.endReplaceableGroup();
                        AEQbTJ(modifierM673paddingVpY3zN4$default2, strStringResource2, (java.lang.String) null, strAEQbTJ2, (Function0<Unit>) objRememberedValue3, composerStartRestartGroup, 0, 4);
                        AEQbTJ(modifierM673paddingVpY3zN4$default2, StringResources_androidKt.stringResource(C48033uCm.Fragment.QkdxfA, composerStartRestartGroup, 0), (java.lang.String) null, previewAiStrategyResponseDto.EZpvd(), (Function0<Unit>) null, composerStartRestartGroup, 0, 20);
                        DividerKt.m1696Divider9IZ8Weo(PaddingKt.m675paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(companion22, 0.0f, 1, null), 0.0f, androidx.compose.ui.unit.Dp.m5414constructorimpl(f22), 0.0f, androidx.compose.ui.unit.Dp.m5414constructorimpl(f32), 5, null), androidx.compose.ui.unit.Dp.m5414constructorimpl((float) 0.5d), ColorResources_androidKt.colorResource(C52761wXj.Activity.zuBGHE, composerStartRestartGroup, 0), composerStartRestartGroup, 54, 0);
                        AEQbTJ(PaddingKt.m675paddingqDBjuR0$default(companion22, 0.0f, 0.0f, 0.0f, androidx.compose.ui.unit.Dp.m5414constructorimpl(f4), 7, null).then(modifierM673paddingVpY3zN4$default2), StringResources_androidKt.stringResource(C48033uCm.Fragment.QHmsKR, composerStartRestartGroup, 0), StringResources_androidKt.stringResource(C48033uCm.Fragment.getPostValueLengthLimit, composerStartRestartGroup, 0), previewAiStrategyResponseDto.copydefault(), (Function0<Unit>) null, composerStartRestartGroup, 0, 16);
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endNode();
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endReplaceableGroup();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        modifier2 = modifier3;
                    }
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    public static final boolean EZpvd(ScrollState scrollState) {
        int maxValue = scrollState.getMaxValue();
        return maxValue == 0 || scrollState.getValue() >= maxValue + (-50);
    }

    public static final Unit EZpvd(Function1 function1, PreviewAiStrategyResponseDto previewAiStrategyResponseDto) {
        function1.invoke(previewAiStrategyResponseDto.AEQbTJ());
        return Unit.INSTANCE;
    }

    public static final void KWHzl(Modifier modifier, final java.lang.String str, final java.lang.String str2, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        Modifier modifier3;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1946458212);
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
            i3 |= composerStartRestartGroup.changed(str2) ? 256 : 128;
        }
        int i5 = i3;
        if ((i5 & CipherSuite.TLS_RSA_PSK_WITH_3DES_EDE_CBC_SHA) != 146 || !composerStartRestartGroup.getSkipping()) {
            modifier3 = i4 != 0 ? Modifier.Companion : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1946458212, i5, -1, "com.okinc.tradingbot.impl.aiBot.ui.preview.SystemPromptHeader (PreviewAiStrategyResultComposable.kt:137)");
            }
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null);
            composerStartRestartGroup.startReplaceableGroup(-483455358);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composerStartRestartGroup, 0);
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
            Updater.m2790setimpl(composerM2783constructorimpl, measurePolicyColumnMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m2790setimpl(composerM2783constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, java.lang.Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (composerM2783constructorimpl.getInserting() || !Intrinsics.EZpvd(composerM2783constructorimpl.rememberedValue(), java.lang.Integer.valueOf(currentCompositeKeyHash))) {
                composerM2783constructorimpl.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash));
                composerM2783constructorimpl.apply(java.lang.Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            yhoModifierMaterializerOf.invoke(SkippableUpdater.m2774boximpl(SkippableUpdater.m2775constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            TextKt.m2072Text4IGK_g(str, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, C52698wVa.OLrzqt(C52761wXj.LoaderManager.zsXlph, java.lang.Integer.valueOf(C52761wXj.Activity.fdOvFl), composerStartRestartGroup, 0, 0), composerStartRestartGroup, (i5 >> 3) & 14, 0, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE);
            TextKt.m2072Text4IGK_g(str2, PaddingKt.m675paddingqDBjuR0$default(Modifier.Companion, 0.0f, androidx.compose.ui.unit.Dp.m5414constructorimpl(4), 0.0f, 0.0f, 13, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, C52698wVa.OLrzqt(C52761wXj.LoaderManager.zuBGHE, java.lang.Integer.valueOf(C52761wXj.Activity.QwvEab), composerStartRestartGroup, 0, 0), composerStartRestartGroup, ((i5 >> 6) & 14) | 48, 0, 65532);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: o.uGh
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return uFZ.EZpvd(modifier4, str, str2, i, i2, (Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX DEBUG: Class process forced to load method for inline: androidx.compose.animation.AnimationModifierKt.animateContentSize$default(androidx.compose.ui.Modifier, androidx.compose.animation.core.FiniteAnimationSpec, kotlin.jvm.functions.Function2, int, java.lang.Object):androidx.compose.ui.Modifier */
    /* JADX DEBUG: Class process forced to load method for inline: o.uEs.buildAnnotatedString-HtGKTqQ$default(o.uEs, java.lang.String, long, long, androidx.compose.ui.graphics.Color, int, int, java.lang.Object):androidx.compose.ui.text.AnnotatedString */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x02ef  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x02fb  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x032c  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0364  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0368  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0381  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x03b8  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x03d4  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x03e0  */
    /* JADX WARN: Removed duplicated region for block: B:146:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01d5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AEQbTJ(Modifier modifier, final java.lang.String str, java.lang.String str2, final java.lang.String str3, Function0<Unit> function0, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        java.lang.String str4;
        int i4;
        Function0<Unit> function02;
        Modifier modifier3;
        java.lang.Object objRememberedValue;
        Composer.Companion companion;
        java.lang.Object objRememberedValue2;
        final MutableState mutableState;
        Function0<Unit> function03;
        long jColorResource;
        long jColorResource2;
        boolean z;
        boolean zChanged;
        boolean zChanged2;
        java.lang.Object objRememberedValue3;
        Modifier modifierEZpvd;
        int currentCompositeKeyHash;
        Composer composerM2783constructorimpl;
        Function2<ComposeUiNode, java.lang.Integer, Unit> setCompositeKeyHash;
        int currentCompositeKeyHash2;
        Composer composerM2783constructorimpl2;
        Function2<ComposeUiNode, java.lang.Integer, Unit> setCompositeKeyHash2;
        java.lang.Object objRememberedValue4;
        final Function0<Unit> function04;
        final java.lang.String str5;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1990637352);
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
        int i6 = i2 & 4;
        if (i6 != 0) {
            i3 |= MLKEMEngine.KyberPolyBytes;
        } else {
            if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
                str4 = str2;
                i3 |= composerStartRestartGroup.changed(str4) ? 256 : 128;
            }
            if ((i2 & 8) == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                i3 |= composerStartRestartGroup.changed(str3) ? 2048 : 1024;
            }
            i4 = i2 & 16;
            if (i4 != 0) {
                if ((i & 24576) == 0) {
                    function02 = function0;
                    i3 |= composerStartRestartGroup.changedInstance(function02) ? 16384 : 8192;
                }
                if ((i3 & 9363) != 9362 || !composerStartRestartGroup.getSkipping()) {
                    modifier3 = i5 == 0 ? Modifier.Companion : modifier2;
                    java.lang.String str6 = i6 == 0 ? null : str4;
                    Function0<Unit> function05 = i4 == 0 ? null : function02;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1990637352, i3, -1, "com.okinc.tradingbot.impl.aiBot.ui.preview.ExpandableSection (PreviewAiStrategyResultComposable.kt:176)");
                    }
                    composerStartRestartGroup.startReplaceableGroup(1193375393);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion = Composer.Companion;
                    if (objRememberedValue == companion.getEmpty()) {
                        objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(java.lang.Boolean.FALSE, null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    final MutableState mutableState2 = (MutableState) objRememberedValue;
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.startReplaceableGroup(1193377345);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue2 == companion.getEmpty()) {
                        objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(java.lang.Boolean.FALSE, null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    mutableState = (MutableState) objRememberedValue2;
                    composerStartRestartGroup.endReplaceableGroup();
                    function03 = function05;
                    androidx.compose.runtime.State<java.lang.Float> stateAnimateFloatAsState = AnimateAsStateKt.animateFloatAsState(!AEQbTJ((MutableState<java.lang.Boolean>) mutableState2) ? 180.0f : 0.0f, AnimationSpecKt.tween$default(PsExtractor.VIDEO_STREAM_MASK, 0, null, 6, null), 0.0f, "chevronRotation", null, composerStartRestartGroup, 3120, 20);
                    jColorResource = ColorResources_androidKt.colorResource(C52761wXj.Activity.QKudOq, composerStartRestartGroup, 0);
                    jColorResource2 = ColorResources_androidKt.colorResource(C52761wXj.Activity.QwvEab, composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(1193394517);
                    z = (i3 & 7168) != 2048;
                    zChanged = composerStartRestartGroup.changed(jColorResource);
                    zChanged2 = composerStartRestartGroup.changed(jColorResource2);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (!(z | zChanged | zChanged2) || objRememberedValue3 == companion.getEmpty()) {
                        objRememberedValue3 = C48093uEs.EZpvd.copydefault(str3, jColorResource, jColorResource2, (24 & 8) != 0 ? null : null, (24 & 16) != 0 ? -1 : 0);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    AnnotatedString annotatedString = (AnnotatedString) objRememberedValue3;
                    composerStartRestartGroup.endReplaceableGroup();
                    float f = 12;
                    Modifier modifierM675paddingqDBjuR0$default = PaddingKt.m675paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null), 0.0f, androidx.compose.ui.unit.Dp.m5414constructorimpl(f), 0.0f, 0.0f, 13, null);
                    composerStartRestartGroup.startReplaceableGroup(1193408209);
                    if (!KWHzl((MutableState<java.lang.Boolean>) mutableState)) {
                        Modifier.Companion companion2 = Modifier.Companion;
                        composerStartRestartGroup.startReplaceableGroup(1193410555);
                        java.lang.Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue5 == companion.getEmpty()) {
                            objRememberedValue5 = new Function0() { // from class: o.uGj
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                @Override // kotlin.jvm.functions.Function0
                                public final java.lang.Object invoke() {
                                    return uFZ.EZpvd(mutableState2);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        modifierEZpvd = C49551uqg.EZpvd(companion2, (Function0) objRememberedValue5);
                    } else {
                        modifierEZpvd = Modifier.Companion;
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Modifier modifierThen = modifierM675paddingqDBjuR0$default.then(modifierEZpvd);
                    composerStartRestartGroup.startReplaceableGroup(-483455358);
                    Arrangement.Vertical top = Arrangement.INSTANCE.getTop();
                    Alignment.Companion companion3 = Alignment.Companion;
                    MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion3.getStart(), composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(-1323940314);
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    ComposeUiNode.Companion companion4 = ComposeUiNode.Companion;
                    Function0<ComposeUiNode> constructor = companion4.getConstructor();
                    yHO<SkippableUpdater<ComposeUiNode>, Composer, java.lang.Integer, Unit> yhoModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierThen);
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
                    Updater.m2790setimpl(composerM2783constructorimpl, measurePolicyColumnMeasurePolicy, companion4.getSetMeasurePolicy());
                    Updater.m2790setimpl(composerM2783constructorimpl, currentCompositionLocalMap, companion4.getSetResolvedCompositionLocals());
                    setCompositeKeyHash = companion4.getSetCompositeKeyHash();
                    if (!composerM2783constructorimpl.getInserting() || !Intrinsics.EZpvd(composerM2783constructorimpl.rememberedValue(), java.lang.Integer.valueOf(currentCompositeKeyHash))) {
                        composerM2783constructorimpl.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash));
                        composerM2783constructorimpl.apply(java.lang.Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    yhoModifierMaterializerOf.invoke(SkippableUpdater.m2774boximpl(SkippableUpdater.m2775constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(2058660585);
                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                    boolean zKWHzl = KWHzl((MutableState<java.lang.Boolean>) mutableState);
                    float fKWHzl = KWHzl(stateAnimateFloatAsState);
                    int i7 = i3 >> 3;
                    KWHzl(str, str6, zKWHzl, fKWHzl, str6 == null, composerStartRestartGroup, (i7 & 14) | (i7 & WalletImportError.ERROR_CODE_AA_EXIST));
                    Modifier.Companion companion5 = Modifier.Companion;
                    SpacerKt.Spacer(SizeKt.m704height3ABfNKs(companion5, androidx.compose.ui.unit.Dp.m5414constructorimpl(f)), composerStartRestartGroup, 6);
                    Modifier modifierAnimateContentSize$default = AnimationModifierKt.animateContentSize$default(SizeKt.wrapContentHeight$default(SizeKt.fillMaxWidth$default(companion5, 0.0f, 1, null), companion3.getTop(), false, 2, null), AnimationSpecKt.spring$default(0.0f, 400.0f, null, 5, null), null, 2, null);
                    composerStartRestartGroup.startReplaceableGroup(733328855);
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(companion3.getTopStart(), false, composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(-1323940314);
                    currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Function0<ComposeUiNode> constructor2 = companion4.getConstructor();
                    yHO<SkippableUpdater<ComposeUiNode>, Composer, java.lang.Integer, Unit> yhoModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierAnimateContentSize$default);
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (!composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor2);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerM2783constructorimpl2 = Updater.m2783constructorimpl(composerStartRestartGroup);
                    Updater.m2790setimpl(composerM2783constructorimpl2, measurePolicyRememberBoxMeasurePolicy, companion4.getSetMeasurePolicy());
                    Updater.m2790setimpl(composerM2783constructorimpl2, currentCompositionLocalMap2, companion4.getSetResolvedCompositionLocals());
                    setCompositeKeyHash2 = companion4.getSetCompositeKeyHash();
                    if (!composerM2783constructorimpl2.getInserting() || !Intrinsics.EZpvd(composerM2783constructorimpl2.rememberedValue(), java.lang.Integer.valueOf(currentCompositeKeyHash2))) {
                        composerM2783constructorimpl2.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash2));
                        composerM2783constructorimpl2.apply(java.lang.Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                    }
                    yhoModifierMaterializerOf2.invoke(SkippableUpdater.m2774boximpl(SkippableUpdater.m2775constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(2058660585);
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    TextStyle textStyleOLrzqt = C52698wVa.OLrzqt(C52761wXj.LoaderManager.KWHzl, java.lang.Integer.valueOf(C52761wXj.Activity.fdOvFl), composerStartRestartGroup, 0, 0);
                    int i8 = !AEQbTJ((MutableState<java.lang.Boolean>) mutableState2) ? Integer.MAX_VALUE : 10;
                    int iM5334getEllipsisgIe3tQ8 = TextOverflow.Companion.m5334getEllipsisgIe3tQ8();
                    composerStartRestartGroup.startReplaceableGroup(-1860523046);
                    objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue4 == companion.getEmpty()) {
                        objRememberedValue4 = new Function1() { // from class: o.uGk
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj) {
                                return uFZ.OLrzqt(mutableState2, mutableState, (TextLayoutResult) obj);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    BasicTextKt.m931BasicTextRWo7tUw(annotatedString, null, textStyleOLrzqt, (Function1) objRememberedValue4, iM5334getEllipsisgIe3tQ8, false, i8, 0, null, null, composerStartRestartGroup, 27648, 930);
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.startReplaceableGroup(-711788538);
                    if (function03 != null) {
                        OLrzqt(function03, composerStartRestartGroup, (i3 >> 12) & 14);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function04 = function03;
                    str5 = str6;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    modifier3 = modifier2;
                    str5 = str4;
                    function04 = function02;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    final Modifier modifier4 = modifier3;
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: o.uGl
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            return uFZ.AEQbTJ(modifier4, str, str5, str3, function04, i, i2, (Composer) obj, ((java.lang.Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 24576;
            function02 = function0;
            if ((i3 & 9363) != 9362) {
                if (i5 == 0) {
                }
                if (i6 == 0) {
                }
                if (i4 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                composerStartRestartGroup.startReplaceableGroup(1193375393);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.Companion;
                if (objRememberedValue == companion.getEmpty()) {
                }
                final MutableState mutableState22 = (MutableState) objRememberedValue;
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.startReplaceableGroup(1193377345);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                }
                mutableState = (MutableState) objRememberedValue2;
                composerStartRestartGroup.endReplaceableGroup();
                function03 = function05;
                androidx.compose.runtime.State<java.lang.Float> stateAnimateFloatAsState2 = AnimateAsStateKt.animateFloatAsState(!AEQbTJ((MutableState<java.lang.Boolean>) mutableState22) ? 180.0f : 0.0f, AnimationSpecKt.tween$default(PsExtractor.VIDEO_STREAM_MASK, 0, null, 6, null), 0.0f, "chevronRotation", null, composerStartRestartGroup, 3120, 20);
                jColorResource = ColorResources_androidKt.colorResource(C52761wXj.Activity.QKudOq, composerStartRestartGroup, 0);
                jColorResource2 = ColorResources_androidKt.colorResource(C52761wXj.Activity.QwvEab, composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(1193394517);
                if ((i3 & 7168) != 2048) {
                }
                zChanged = composerStartRestartGroup.changed(jColorResource);
                zChanged2 = composerStartRestartGroup.changed(jColorResource2);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (!(z | zChanged | zChanged2)) {
                    objRememberedValue3 = C48093uEs.EZpvd.copydefault(str3, jColorResource, jColorResource2, (24 & 8) != 0 ? null : null, (24 & 16) != 0 ? -1 : 0);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    AnnotatedString annotatedString2 = (AnnotatedString) objRememberedValue3;
                    composerStartRestartGroup.endReplaceableGroup();
                    float f2 = 12;
                    Modifier modifierM675paddingqDBjuR0$default2 = PaddingKt.m675paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null), 0.0f, androidx.compose.ui.unit.Dp.m5414constructorimpl(f2), 0.0f, 0.0f, 13, null);
                    composerStartRestartGroup.startReplaceableGroup(1193408209);
                    if (!KWHzl((MutableState<java.lang.Boolean>) mutableState)) {
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Modifier modifierThen2 = modifierM675paddingqDBjuR0$default2.then(modifierEZpvd);
                    composerStartRestartGroup.startReplaceableGroup(-483455358);
                    Arrangement.Vertical top2 = Arrangement.INSTANCE.getTop();
                    Alignment.Companion companion32 = Alignment.Companion;
                    MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(top2, companion32.getStart(), composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(-1323940314);
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    ComposeUiNode.Companion companion42 = ComposeUiNode.Companion;
                    Function0<ComposeUiNode> constructor3 = companion42.getConstructor();
                    yHO<SkippableUpdater<ComposeUiNode>, Composer, java.lang.Integer, Unit> yhoModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(modifierThen2);
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (!composerStartRestartGroup.getInserting()) {
                    }
                    composerM2783constructorimpl = Updater.m2783constructorimpl(composerStartRestartGroup);
                    Updater.m2790setimpl(composerM2783constructorimpl, measurePolicyColumnMeasurePolicy2, companion42.getSetMeasurePolicy());
                    Updater.m2790setimpl(composerM2783constructorimpl, currentCompositionLocalMap3, companion42.getSetResolvedCompositionLocals());
                    setCompositeKeyHash = companion42.getSetCompositeKeyHash();
                    if (!composerM2783constructorimpl.getInserting()) {
                        composerM2783constructorimpl.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash));
                        composerM2783constructorimpl.apply(java.lang.Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        yhoModifierMaterializerOf3.invoke(SkippableUpdater.m2774boximpl(SkippableUpdater.m2775constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(2058660585);
                        ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                        boolean zKWHzl2 = KWHzl((MutableState<java.lang.Boolean>) mutableState);
                        float fKWHzl2 = KWHzl(stateAnimateFloatAsState2);
                        if (str6 == null) {
                        }
                        int i72 = i3 >> 3;
                        KWHzl(str, str6, zKWHzl2, fKWHzl2, str6 == null, composerStartRestartGroup, (i72 & 14) | (i72 & WalletImportError.ERROR_CODE_AA_EXIST));
                        Modifier.Companion companion52 = Modifier.Companion;
                        SpacerKt.Spacer(SizeKt.m704height3ABfNKs(companion52, androidx.compose.ui.unit.Dp.m5414constructorimpl(f2)), composerStartRestartGroup, 6);
                        Modifier modifierAnimateContentSize$default2 = AnimationModifierKt.animateContentSize$default(SizeKt.wrapContentHeight$default(SizeKt.fillMaxWidth$default(companion52, 0.0f, 1, null), companion32.getTop(), false, 2, null), AnimationSpecKt.spring$default(0.0f, 400.0f, null, 5, null), null, 2, null);
                        composerStartRestartGroup.startReplaceableGroup(733328855);
                        MeasurePolicy measurePolicyRememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(companion32.getTopStart(), false, composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(-1323940314);
                        currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap22 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Function0<ComposeUiNode> constructor22 = companion42.getConstructor();
                        yHO<SkippableUpdater<ComposeUiNode>, Composer, java.lang.Integer, Unit> yhoModifierMaterializerOf22 = LayoutKt.modifierMaterializerOf(modifierAnimateContentSize$default2);
                        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (!composerStartRestartGroup.getInserting()) {
                        }
                        composerM2783constructorimpl2 = Updater.m2783constructorimpl(composerStartRestartGroup);
                        Updater.m2790setimpl(composerM2783constructorimpl2, measurePolicyRememberBoxMeasurePolicy2, companion42.getSetMeasurePolicy());
                        Updater.m2790setimpl(composerM2783constructorimpl2, currentCompositionLocalMap22, companion42.getSetResolvedCompositionLocals());
                        setCompositeKeyHash2 = companion42.getSetCompositeKeyHash();
                        if (!composerM2783constructorimpl2.getInserting()) {
                            composerM2783constructorimpl2.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash2));
                            composerM2783constructorimpl2.apply(java.lang.Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                            yhoModifierMaterializerOf22.invoke(SkippableUpdater.m2774boximpl(SkippableUpdater.m2775constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                            composerStartRestartGroup.startReplaceableGroup(2058660585);
                            BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                            TextStyle textStyleOLrzqt2 = C52698wVa.OLrzqt(C52761wXj.LoaderManager.KWHzl, java.lang.Integer.valueOf(C52761wXj.Activity.fdOvFl), composerStartRestartGroup, 0, 0);
                            int i82 = !AEQbTJ((MutableState<java.lang.Boolean>) mutableState22) ? Integer.MAX_VALUE : 10;
                            int iM5334getEllipsisgIe3tQ82 = TextOverflow.Companion.m5334getEllipsisgIe3tQ8();
                            composerStartRestartGroup.startReplaceableGroup(-1860523046);
                            objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue4 == companion.getEmpty()) {
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            BasicTextKt.m931BasicTextRWo7tUw(annotatedString2, null, textStyleOLrzqt2, (Function1) objRememberedValue4, iM5334getEllipsisgIe3tQ82, false, i82, 0, null, null, composerStartRestartGroup, 27648, 930);
                            composerStartRestartGroup.endReplaceableGroup();
                            composerStartRestartGroup.endNode();
                            composerStartRestartGroup.endReplaceableGroup();
                            composerStartRestartGroup.endReplaceableGroup();
                            composerStartRestartGroup.startReplaceableGroup(-711788538);
                            if (function03 != null) {
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            composerStartRestartGroup.endReplaceableGroup();
                            composerStartRestartGroup.endNode();
                            composerStartRestartGroup.endReplaceableGroup();
                            composerStartRestartGroup.endReplaceableGroup();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            function04 = function03;
                            str5 = str6;
                        }
                    }
                }
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        str4 = str2;
        if ((i2 & 8) == 0) {
        }
        i4 = i2 & 16;
        if (i4 != 0) {
        }
        function02 = function0;
        if ((i3 & 9363) != 9362) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    public static final Unit EZpvd(MutableState mutableState) {
        KWHzl(mutableState, !AEQbTJ((MutableState<java.lang.Boolean>) mutableState));
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(MutableState mutableState, MutableState mutableState2, TextLayoutResult textLayoutResult) {
        Intrinsics.checkNotNullParameter(textLayoutResult, "");
        if (!AEQbTJ((MutableState<java.lang.Boolean>) mutableState) && !KWHzl((MutableState<java.lang.Boolean>) mutableState2)) {
            AEQbTJ(mutableState2, textLayoutResult.getHasVisualOverflow());
        }
        return Unit.INSTANCE;
    }

    public static final void KWHzl(final java.lang.String str, final java.lang.String str2, final boolean z, final float f, final boolean z2, Composer composer, final int i) {
        int i2;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1869866491);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(str2) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= composerStartRestartGroup.changed(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changed(f) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changed(z2) ? 16384 : 8192;
        }
        int i3 = i2;
        if ((i3 & 9363) != 9362 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1869866491, i3, -1, "com.okinc.tradingbot.impl.aiBot.ui.preview.SectionHeader (PreviewAiStrategyResultComposable.kt:264)");
            }
            Modifier.Companion companion = Modifier.Companion;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.HorizontalOrVertical spaceBetween = arrangement.getSpaceBetween();
            Alignment.Companion companion2 = Alignment.Companion;
            Alignment.Vertical centerVertically = companion2.getCenterVertically();
            composerStartRestartGroup.startReplaceableGroup(693286680);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(spaceBetween, centerVertically, composerStartRestartGroup, 54);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
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
            Updater.m2790setimpl(composerM2783constructorimpl, measurePolicyRowMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m2790setimpl(composerM2783constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, java.lang.Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (composerM2783constructorimpl.getInserting() || !Intrinsics.EZpvd(composerM2783constructorimpl.rememberedValue(), java.lang.Integer.valueOf(currentCompositeKeyHash))) {
                composerM2783constructorimpl.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash));
                composerM2783constructorimpl.apply(java.lang.Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            yhoModifierMaterializerOf.invoke(SkippableUpdater.m2774boximpl(SkippableUpdater.m2775constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            if (z2 && str2 != null) {
                composerStartRestartGroup.startReplaceableGroup(1976129119);
                Modifier modifierM675paddingqDBjuR0$default = PaddingKt.m675paddingqDBjuR0$default(RowScope.weight$default(rowScopeInstance, companion, 1.0f, false, 2, null), 0.0f, 0.0f, 0.0f, androidx.compose.ui.unit.Dp.m5414constructorimpl(12), 7, null);
                Arrangement.HorizontalOrVertical horizontalOrVerticalM582spacedBy0680j_4 = arrangement.m582spacedBy0680j_4(androidx.compose.ui.unit.Dp.m5414constructorimpl(4));
                composerStartRestartGroup.startReplaceableGroup(-483455358);
                MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(horizontalOrVerticalM582spacedBy0680j_4, companion2.getStart(), composerStartRestartGroup, 6);
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
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
                Updater.m2790setimpl(composerM2783constructorimpl2, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
                Updater.m2790setimpl(composerM2783constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, java.lang.Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
                if (composerM2783constructorimpl2.getInserting() || !Intrinsics.EZpvd(composerM2783constructorimpl2.rememberedValue(), java.lang.Integer.valueOf(currentCompositeKeyHash2))) {
                    composerM2783constructorimpl2.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash2));
                    composerM2783constructorimpl2.apply(java.lang.Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                }
                yhoModifierMaterializerOf2.invoke(SkippableUpdater.m2774boximpl(SkippableUpdater.m2775constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(2058660585);
                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                Arrangement.HorizontalOrVertical spaceBetween2 = arrangement.getSpaceBetween();
                Alignment.Vertical centerVertically2 = companion2.getCenterVertically();
                composerStartRestartGroup.startReplaceableGroup(693286680);
                MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(spaceBetween2, centerVertically2, composerStartRestartGroup, 54);
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Function0<ComposeUiNode> constructor3 = companion3.getConstructor();
                yHO<SkippableUpdater<ComposeUiNode>, Composer, java.lang.Integer, Unit> yhoModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(modifierFillMaxWidth$default2);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor3);
                } else {
                    composerStartRestartGroup.useNode();
                }
                Composer composerM2783constructorimpl3 = Updater.m2783constructorimpl(composerStartRestartGroup);
                Updater.m2790setimpl(composerM2783constructorimpl3, measurePolicyRowMeasurePolicy2, companion3.getSetMeasurePolicy());
                Updater.m2790setimpl(composerM2783constructorimpl3, currentCompositionLocalMap3, companion3.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, java.lang.Integer, Unit> setCompositeKeyHash3 = companion3.getSetCompositeKeyHash();
                if (composerM2783constructorimpl3.getInserting() || !Intrinsics.EZpvd(composerM2783constructorimpl3.rememberedValue(), java.lang.Integer.valueOf(currentCompositeKeyHash3))) {
                    composerM2783constructorimpl3.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash3));
                    composerM2783constructorimpl3.apply(java.lang.Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                }
                yhoModifierMaterializerOf3.invoke(SkippableUpdater.m2774boximpl(SkippableUpdater.m2775constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(2058660585);
                TextKt.m2072Text4IGK_g(str, RowScope.weight$default(rowScopeInstance, companion, 1.0f, false, 2, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, C52698wVa.OLrzqt(C52761wXj.LoaderManager.zsXlph, java.lang.Integer.valueOf(C52761wXj.Activity.fdOvFl), composerStartRestartGroup, 0, 0), composerStartRestartGroup, i3 & 14, 0, 65532);
                int i4 = i3 >> 6;
                KWHzl(z, f, composerStartRestartGroup, (i4 & 14) | (i4 & WalletImportError.ERROR_CODE_AA_EXIST));
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                TextKt.m2072Text4IGK_g(str2, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, C52698wVa.OLrzqt(C52761wXj.LoaderManager.zuBGHE, java.lang.Integer.valueOf(C52761wXj.Activity.QwvEab), composerStartRestartGroup, 0, 0), composerStartRestartGroup, (i3 >> 3) & 14, 0, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE);
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                composer2 = composerStartRestartGroup;
            } else {
                composerStartRestartGroup.startReplaceableGroup(1977225279);
                TextKt.m2072Text4IGK_g(str, RowScope.weight$default(rowScopeInstance, companion, 1.0f, false, 2, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, C52698wVa.OLrzqt(C52761wXj.LoaderManager.DGOPHZ, java.lang.Integer.valueOf(C52761wXj.Activity.fdOvFl), composerStartRestartGroup, 0, 0), composerStartRestartGroup, i3 & 14, 0, 65532);
                int i5 = i3 >> 6;
                composer2 = composerStartRestartGroup;
                KWHzl(z, f, composer2, (i5 & 14) | (i5 & WalletImportError.ERROR_CODE_AA_EXIST));
                composer2.endReplaceableGroup();
            }
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
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: o.uGg
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return uFZ.EZpvd(str, str2, z, f, z2, i, (Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void KWHzl(final boolean z, final float f, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1899391186);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(f) ? 32 : 16;
        }
        if ((i2 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1899391186, i2, -1, "com.okinc.tradingbot.impl.aiBot.ui.preview.ExpandChevron (PreviewAiStrategyResultComposable.kt:318)");
            }
            if (z) {
                IconKt.m1755Iconww6aTOc(PainterResources_androidKt.painterResource(C52761wXj.TaskDescription.call, composerStartRestartGroup, 0), (java.lang.String) null, RotateKt.rotate(SizeKt.m718size3ABfNKs(Modifier.Companion, androidx.compose.ui.unit.Dp.m5414constructorimpl(16)), f), ColorResources_androidKt.colorResource(C52761wXj.Activity.Dmq, composerStartRestartGroup, 0), composerStartRestartGroup, 48, 0);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: o.uGn
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return uFZ.OLrzqt(z, f, i, (Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void OLrzqt(final Function0<Unit> function0, Composer composer, final int i) {
        int i2;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(609345584);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(609345584, i2, -1, "com.okinc.tradingbot.impl.aiBot.ui.preview.CopyButton (PreviewAiStrategyResultComposable.kt:335)");
            }
            Modifier.Companion companion = Modifier.Companion;
            float f = 8;
            Modifier modifierM675paddingqDBjuR0$default = PaddingKt.m675paddingqDBjuR0$default(C49551uqg.EZpvd(companion, function0), 0.0f, androidx.compose.ui.unit.Dp.m5414constructorimpl(f), 0.0f, 0.0f, 13, null);
            Alignment.Vertical centerVertically = Alignment.Companion.getCenterVertically();
            Arrangement.HorizontalOrVertical horizontalOrVerticalM582spacedBy0680j_4 = Arrangement.INSTANCE.m582spacedBy0680j_4(androidx.compose.ui.unit.Dp.m5414constructorimpl(f));
            composerStartRestartGroup.startReplaceableGroup(693286680);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(horizontalOrVerticalM582spacedBy0680j_4, centerVertically, composerStartRestartGroup, 54);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
            yHO<SkippableUpdater<ComposeUiNode>, Composer, java.lang.Integer, Unit> yhoModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM675paddingqDBjuR0$default);
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
            Updater.m2790setimpl(composerM2783constructorimpl, measurePolicyRowMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m2790setimpl(composerM2783constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, java.lang.Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (composerM2783constructorimpl.getInserting() || !Intrinsics.EZpvd(composerM2783constructorimpl.rememberedValue(), java.lang.Integer.valueOf(currentCompositeKeyHash))) {
                composerM2783constructorimpl.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash));
                composerM2783constructorimpl.apply(java.lang.Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            yhoModifierMaterializerOf.invoke(SkippableUpdater.m2774boximpl(SkippableUpdater.m2775constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            IconKt.m1755Iconww6aTOc(PainterResources_androidKt.painterResource(C52761wXj.TaskDescription.zAEkPU, composerStartRestartGroup, 0), (java.lang.String) null, SizeKt.m718size3ABfNKs(companion, androidx.compose.ui.unit.Dp.m5414constructorimpl(16)), ColorResources_androidKt.colorResource(C52761wXj.Activity.QwvEab, composerStartRestartGroup, 0), composerStartRestartGroup, 432, 0);
            composer2 = composerStartRestartGroup;
            TextKt.m2072Text4IGK_g(StringResources_androidKt.stringResource(C48033uCm.Fragment.RlQdEF, composerStartRestartGroup, 0), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, C52698wVa.OLrzqt(C52761wXj.LoaderManager.zuBGHE, java.lang.Integer.valueOf(C52761wXj.Activity.QwvEab), composerStartRestartGroup, 0, 0), composer2, 0, 0, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: o.uGe
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return uFZ.EZpvd(function0, i, (Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final boolean AEQbTJ(androidx.compose.runtime.State<java.lang.Boolean> state) {
        return state.getValue().booleanValue();
    }

    public static final boolean AEQbTJ(MutableState<java.lang.Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    public static final void KWHzl(MutableState<java.lang.Boolean> mutableState, boolean z) {
        mutableState.setValue(java.lang.Boolean.valueOf(z));
    }

    public static final boolean KWHzl(MutableState<java.lang.Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    public static final void AEQbTJ(MutableState<java.lang.Boolean> mutableState, boolean z) {
        mutableState.setValue(java.lang.Boolean.valueOf(z));
    }

    public static final float KWHzl(androidx.compose.runtime.State<java.lang.Float> state) {
        return state.getValue().floatValue();
    }
}
