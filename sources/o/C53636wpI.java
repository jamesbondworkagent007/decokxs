package o;

import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.CubicBezierEasing;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ProduceStateScope;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.core.graphics.Insets;
import androidx.profileinstaller.ProfileVerifier;
import com.amplifyframework.ui.liveness.ml.FaceDetector;
import com.okinc.business.defi.biz.core.error.WalletImportError;
import com.okinc.tradingbot.impl.common.model.TextColor;
import com.okinc.tradingbot.impl.planet.ui.BotChartViewComposeKt$BotChartView$pnlChartData$1$1;
import com.okinc.tradingbot.impl.share.ShareChartDataPoint;
import com.okinc.uilab.okinteractivelinechart.OKVerticalSeparatorView;
import com.okinc.unify_trade.biz.StrategyProfitResponse;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.C55159xeg;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wpI, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C53636wpI {
    public static final CubicBezierEasing EZpvd = new CubicBezierEasing(0.42f, 0.0f, 0.58f, 1.0f);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final Unit KWHzl(Modifier modifier, TextColor textColor, boolean z, java.util.List list, int i, int i2, Composer composer, int i3) {
        KWHzl(modifier, textColor, z, list, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final Unit KWHzl(TextColor textColor, java.util.List list, float f, C55159xeg.StateListAnimator stateListAnimator, Insets insets, Function0 function0, int i, Composer composer, int i2) {
        KWHzl(textColor, (java.util.List<ShareChartDataPoint>) list, f, stateListAnimator, insets, (Function0<java.lang.Boolean>) function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final boolean KWHzl() {
        return true;
    }

    public static final void KWHzl(Modifier modifier, @NotNull final TextColor textColor, final boolean z, @NotNull final java.util.List<StrategyProfitResponse> list, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        java.lang.Object obj;
        float f;
        int i4;
        int i5;
        final Modifier modifier3;
        Composer composer2;
        Composer composer3;
        Intrinsics.checkNotNullParameter(textColor, "");
        Intrinsics.checkNotNullParameter(list, "");
        Composer composerStartRestartGroup = composer.startRestartGroup(902212060);
        int i6 = i2 & 1;
        if (i6 != 0) {
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
            i3 |= composerStartRestartGroup.changed(textColor) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= MLKEMEngine.KyberPolyBytes;
        } else if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i3 |= composerStartRestartGroup.changed(z) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(list) ? 2048 : 1024;
        }
        if ((i3 & 1171) != 1170 || !composerStartRestartGroup.getSkipping()) {
            Modifier modifier4 = i6 != 0 ? Modifier.Companion : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(902212060, i3, -1, "com.okinc.tradingbot.impl.planet.ui.BotChartView (BotChartViewCompose.kt:51)");
            }
            android.content.Context context = (android.content.Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            composerStartRestartGroup.startReplaceableGroup(996969035);
            boolean zChanged = composerStartRestartGroup.changed(context);
            java.lang.Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = java.lang.Float.valueOf(C55298xhM.EZpvd(2.0f, context));
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            float fFloatValue = ((java.lang.Number) objRememberedValue).floatValue();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.startReplaceableGroup(996972993);
            java.lang.Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.Companion;
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = Insets.of(0, 4, 0, 4);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            Insets insets = (Insets) objRememberedValue2;
            composerStartRestartGroup.endReplaceableGroup();
            Intrinsics.copydefault(insets);
            composerStartRestartGroup.startReplaceableGroup(996974948);
            java.lang.Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = new C55159xeg.StateListAnimator(null, java.lang.Float.valueOf(0.0f), null, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            C55159xeg.StateListAnimator stateListAnimator = (C55159xeg.StateListAnimator) objRememberedValue3;
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.startReplaceableGroup(996984468);
            java.lang.Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue4 == companion.getEmpty()) {
                objRememberedValue4 = new Function0() { // from class: o.wpN
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return java.lang.Boolean.valueOf(C53636wpI.KWHzl());
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            Function0 function0 = (Function0) objRememberedValue4;
            composerStartRestartGroup.endReplaceableGroup();
            java.util.List listAhwBna = yDY.AhwBna();
            composerStartRestartGroup.startReplaceableGroup(996994712);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(list);
            java.lang.Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue5 == companion.getEmpty()) {
                objRememberedValue5 = new BotChartViewComposeKt$BotChartView$pnlChartData$1$1(list, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
            }
            composerStartRestartGroup.endReplaceableGroup();
            androidx.compose.runtime.State stateProduceState = SnapshotStateKt.produceState(listAhwBna, list, (Function2<? super ProduceStateScope<java.util.List>, ? super Continuation<? super Unit>, ? extends java.lang.Object>) objRememberedValue5, composerStartRestartGroup, ((i3 >> 6) & WalletImportError.ERROR_CODE_AA_EXIST) | 6);
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(SizeKt.m704height3ABfNKs(modifier4, androidx.compose.ui.unit.Dp.m5414constructorimpl(60)), 0.0f, 1, null);
            composerStartRestartGroup.startReplaceableGroup(997019215);
            java.lang.Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue6 == companion.getEmpty()) {
                objRememberedValue6 = new Function1() { // from class: o.wpJ
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return C53636wpI.OLrzqt((GraphicsLayerScope) obj2);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
            }
            composerStartRestartGroup.endReplaceableGroup();
            Modifier modifierGraphicsLayer = GraphicsLayerModifierKt.graphicsLayer(modifierFillMaxWidth$default, (Function1) objRememberedValue6);
            composerStartRestartGroup.startReplaceableGroup(733328855);
            MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.Companion.getTopStart(), false, composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
            yHO<SkippableUpdater<ComposeUiNode>, Composer, java.lang.Integer, Unit> yhoModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierGraphicsLayer);
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
            Updater.m2790setimpl(composerM2783constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m2790setimpl(composerM2783constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, java.lang.Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (composerM2783constructorimpl.getInserting() || !Intrinsics.EZpvd(composerM2783constructorimpl.rememberedValue(), java.lang.Integer.valueOf(currentCompositeKeyHash))) {
                composerM2783constructorimpl.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash));
                composerM2783constructorimpl.apply(java.lang.Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            yhoModifierMaterializerOf.invoke(SkippableUpdater.m2774boximpl(SkippableUpdater.m2775constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            if (z) {
                composerStartRestartGroup.startReplaceableGroup(1039469652);
                KWHzl(textColor, (java.util.List<ShareChartDataPoint>) stateProduceState.getValue(), fFloatValue, stateListAnimator, insets, (Function0<java.lang.Boolean>) function0, composerStartRestartGroup, ((i3 >> 3) & 14) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE | (C55159xeg.StateListAnimator.AEQbTJ << 9));
                composerStartRestartGroup.endReplaceableGroup();
                obj = null;
                i4 = 1;
                modifier3 = modifier4;
                composer2 = composerStartRestartGroup;
                i5 = 0;
                f = 0.0f;
            } else {
                composerStartRestartGroup.startReplaceableGroup(1039866173);
                EnterTransition enterTransitionFadeIn$default = EnterExitTransitionKt.fadeIn$default(AnimationSpecKt.tween(500, 65, EZpvd), 0.0f, 2, null);
                ExitTransition exitTransitionFadeOut$default = EnterExitTransitionKt.fadeOut$default(AnimationSpecKt.tween$default(200, 0, EasingKt.getFastOutLinearInEasing(), 2, null), 0.0f, 2, null);
                ComposableLambda composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -633078434, true, new TaskDescription(textColor, stateProduceState, fFloatValue, stateListAnimator, insets, function0));
                obj = null;
                f = 0.0f;
                i4 = 1;
                i5 = 0;
                modifier3 = modifier4;
                composer2 = composerStartRestartGroup;
                AnimatedVisibilityKt.AnimatedVisibility(true, (Modifier) null, enterTransitionFadeIn$default, exitTransitionFadeOut$default, (java.lang.String) null, (yHO<? super AnimatedVisibilityScope, ? super Composer, ? super java.lang.Integer, Unit>) composableLambda, composer2, 196998, 18);
                composer2.endReplaceableGroup();
            }
            composer3 = composer2;
            BoxKt.Box(SizeKt.fillMaxSize$default(modifier3, f, i4, obj), composer3, i5);
            composer3.endReplaceableGroup();
            composer3.endNode();
            composer3.endReplaceableGroup();
            composer3.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            modifier3 = modifier2;
            composer3 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: o.wpM
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                    return C53636wpI.KWHzl(modifier3, textColor, z, list, i, i2, (Composer) obj2, ((java.lang.Integer) obj3).intValue());
                }
            });
        }
    }

    public static final Unit OLrzqt(GraphicsLayerScope graphicsLayerScope) {
        Intrinsics.checkNotNullParameter(graphicsLayerScope, "");
        graphicsLayerScope.setClip(false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.wpI$TaskDescription */
    public static final class TaskDescription implements yHO<AnimatedVisibilityScope, Composer, java.lang.Integer, Unit> {
        public final /* synthetic */ Insets AEQbTJ;
        public final /* synthetic */ Function0<java.lang.Boolean> EZpvd;
        public final /* synthetic */ androidx.compose.runtime.State<java.util.List<ShareChartDataPoint>> KWHzl;
        public final /* synthetic */ TextColor OLrzqt;
        public final /* synthetic */ float copydefault;
        public final /* synthetic */ C55159xeg.StateListAnimator djBIcL;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: androidx.compose.runtime.State<? extends java.util.List<com.okinc.tradingbot.impl.share.ShareChartDataPoint>> */
        /* JADX WARN: Multi-variable type inference failed */
        public TaskDescription(TextColor textColor, androidx.compose.runtime.State<? extends java.util.List<ShareChartDataPoint>> state, float f, C55159xeg.StateListAnimator stateListAnimator, Insets insets, Function0<java.lang.Boolean> function0) {
            this.OLrzqt = textColor;
            this.KWHzl = state;
            this.copydefault = f;
            this.djBIcL = stateListAnimator;
            this.AEQbTJ = insets;
            this.EZpvd = function0;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // o.yHO
        public /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer, java.lang.Integer num) {
            OLrzqt(animatedVisibilityScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void OLrzqt(AnimatedVisibilityScope animatedVisibilityScope, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(animatedVisibilityScope, "");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-633078434, i, -1, "com.okinc.tradingbot.impl.planet.ui.BotChartView.<anonymous>.<anonymous> (BotChartViewCompose.kt:128)");
            }
            C53636wpI.KWHzl(this.OLrzqt, this.KWHzl.getValue(), this.copydefault, this.djBIcL, this.AEQbTJ, this.EZpvd, composer, (C55159xeg.StateListAnimator.AEQbTJ << 9) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    public static final void KWHzl(final TextColor textColor, final java.util.List<ShareChartDataPoint> list, final float f, final C55159xeg.StateListAnimator stateListAnimator, final Insets insets, final Function0<java.lang.Boolean> function0, Composer composer, final int i) {
        int i2;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-12423120);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(textColor) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(list) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= composerStartRestartGroup.changed(f) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= (i & 4096) == 0 ? composerStartRestartGroup.changed(stateListAnimator) : composerStartRestartGroup.changedInstance(stateListAnimator) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(insets) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function0) ? 131072 : 65536;
        }
        if ((74899 & i2) != 74898 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-12423120, i2, -1, "com.okinc.tradingbot.impl.planet.ui.ChartViewContent (BotChartViewCompose.kt:154)");
            }
            Modifier modifierM704height3ABfNKs = SizeKt.m704height3ABfNKs(Modifier.Companion, androidx.compose.ui.unit.Dp.m5414constructorimpl(60));
            composerStartRestartGroup.startReplaceableGroup(-1648747191);
            java.lang.Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new Function1() { // from class: o.wpL
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C53636wpI.AEQbTJ((GraphicsLayerScope) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            Modifier modifierGraphicsLayer = GraphicsLayerModifierKt.graphicsLayer(modifierM704height3ABfNKs, (Function1) objRememberedValue);
            OKVerticalSeparatorView.LineStyle lineStyle = OKVerticalSeparatorView.LineStyle.None;
            int i3 = i2 << 6;
            int i4 = C55159xeg.StateListAnimator.AEQbTJ;
            composer2 = composerStartRestartGroup;
            wVO.KWHzl(modifierGraphicsLayer, list, textColor, java.lang.Float.valueOf(f), java.lang.Float.valueOf(0.0f), java.lang.Float.valueOf(0.0f), java.lang.Float.valueOf(0.0f), function0, stateListAnimator, stateListAnimator, lineStyle, insets, false, composer2, (i3 & 29360128) | ((i2 << 3) & 7168) | (i2 & WalletImportError.ERROR_CODE_AA_EXIST) | 1794054 | (i3 & FaceDetector.NUM_BOXES) | (i4 << 24) | ((i2 << 15) & 234881024) | (i4 << 27) | ((i2 << 18) & 1879048192), ((i2 >> 9) & WalletImportError.ERROR_CODE_AA_EXIST) | 390, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: o.wpK
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return C53636wpI.KWHzl(textColor, list, f, stateListAnimator, insets, function0, i, (Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final Unit AEQbTJ(GraphicsLayerScope graphicsLayerScope) {
        Intrinsics.checkNotNullParameter(graphicsLayerScope, "");
        graphicsLayerScope.setClip(false);
        return Unit.INSTANCE;
    }
}
