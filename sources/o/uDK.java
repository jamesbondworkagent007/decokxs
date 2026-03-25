package o;

import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.material3.DividerKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.ColorResources_androidKt;
import androidx.compose.ui.res.PrimitiveResources_androidKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import com.okinc.business.defi.biz.core.error.WalletImportError;
import com.okinc.tradingbot.impl.aiBot.domain.model.Indicator;
import com.okinc.tradingbot.impl.aiBot.domain.model.IndicatorSectionUiModel;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.StateFlow;
import o.AbstractC48071uDx;
import o.C48033uCm;
import o.C52761wXj;
import o.uDK;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class uDK {
    public static final float AEQbTJ = androidx.compose.ui.unit.Dp.m5414constructorimpl(40);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final Unit AEQbTJ(Modifier modifier, java.lang.String str, int i, int i2, Composer composer, int i3) {
        copydefault(modifier, str, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final Unit EZpvd(Modifier modifier, int i, int i2, Composer composer, int i3) {
        OLrzqt(modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final Unit EZpvd(Modifier modifier, Indicator indicator, Function0 function0, Function0 function02, int i, int i2, Composer composer, int i3) {
        AEQbTJ(modifier, indicator, (Function0<Unit>) function0, (Function0<Unit>) function02, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final Unit KWHzl(java.lang.String str, Modifier modifier, int i, int i2, Composer composer, int i3) {
        OLrzqt(str, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final Unit copydefault(Modifier modifier, uDU udu, Function1 function1, Function1 function12, float f, int i, int i2, Composer composer, int i3) {
        copydefault(modifier, udu, function1, function12, f, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final Unit copydefault(StateFlow stateFlow, Function0 function0, Function1 function1, Function1 function12, int i, Composer composer, int i2) {
        EZpvd(stateFlow, function0, function1, function12, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void EZpvd(@NotNull final StateFlow<? extends uLU<uDU>> stateFlow, @NotNull final Function0<Unit> function0, @NotNull final Function1<? super Indicator, Unit> function1, @NotNull final Function1<? super Indicator, Unit> function12, Composer composer, final int i) {
        int i2;
        Intrinsics.checkNotNullParameter(stateFlow, "");
        Intrinsics.checkNotNullParameter(function0, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function12, "");
        Composer composerStartRestartGroup = composer.startRestartGroup(-303161925);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(stateFlow) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function1) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function12) ? 2048 : 1024;
        }
        if ((i2 & 1171) != 1170 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-303161925, i2, -1, "com.okinc.tradingbot.impl.aiBot.ui.indicators.TechnicalIndicatorsComposable (TechnicalIndicatorsComposable.kt:71)");
            }
            androidx.compose.runtime.State stateCollectAsState = SnapshotStateKt.collectAsState(stateFlow, null, composerStartRestartGroup, i2 & 14, 1);
            uDU uduOLrzqt = OLrzqt((androidx.compose.runtime.State<? extends uLU<uDU>>) stateCollectAsState).OLrzqt();
            if (uduOLrzqt == null) {
                uduOLrzqt = new uDU(null, 0, 0, false, 15, null);
            }
            boolean zEZpvd = uduOLrzqt.EZpvd();
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null);
            uLU<uDU> uluOLrzqt = OLrzqt((androidx.compose.runtime.State<? extends uLU<uDU>>) stateCollectAsState);
            composerStartRestartGroup.startReplaceableGroup(436218306);
            boolean z = (i2 & WalletImportError.ERROR_CODE_AA_EXIST) == 32;
            java.lang.Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new Function0() { // from class: o.uDM
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return uDK.copydefault(function0);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            wWN.copydefault(modifierFillMaxSize$default, null, null, uluOLrzqt, (Function0) objRememberedValue, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1468554111, true, new TaskDescription(uduOLrzqt, function12, function1, zEZpvd)), composerStartRestartGroup, 196614, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: o.uDL
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return uDK.copydefault(stateFlow, function0, function1, function12, i, (Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final class TaskDescription implements yHO<BoxScope, Composer, java.lang.Integer, Unit> {
        public final /* synthetic */ Function1<Indicator, Unit> AEQbTJ;
        public final /* synthetic */ uDU KWHzl;
        public final /* synthetic */ Function1<Indicator, Unit> OLrzqt;
        public final /* synthetic */ boolean copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super com.okinc.tradingbot.impl.aiBot.domain.model.Indicator, kotlin.Unit> */
        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super com.okinc.tradingbot.impl.aiBot.domain.model.Indicator, kotlin.Unit> */
        /* JADX WARN: Multi-variable type inference failed */
        public TaskDescription(uDU udu, Function1<? super Indicator, Unit> function1, Function1<? super Indicator, Unit> function12, boolean z) {
            this.KWHzl = udu;
            this.OLrzqt = function1;
            this.AEQbTJ = function12;
            this.copydefault = z;
        }

        public static final int EZpvd(int i) {
            return i;
        }

        public static final int KWHzl(int i) {
            return i;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // o.yHO
        public /* synthetic */ Unit invoke(BoxScope boxScope, Composer composer, java.lang.Integer num) {
            KWHzl(boxScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void KWHzl(BoxScope boxScope, Composer composer, int i) {
            int i2;
            Intrinsics.checkNotNullParameter(boxScope, "");
            if ((i & 6) == 0) {
                i2 = i | (composer.changed(boxScope) ? 4 : 2);
            } else {
                i2 = i;
            }
            if ((i2 & 19) != 18 || !composer.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1468554111, i2, -1, "com.okinc.tradingbot.impl.aiBot.ui.indicators.TechnicalIndicatorsComposable.<anonymous> (TechnicalIndicatorsComposable.kt:82)");
                }
                if (this.KWHzl.AEQbTJ().isEmpty()) {
                    composer.startReplaceableGroup(530231109);
                    wWN.AEQbTJ(boxScope.align(Modifier.Companion, Alignment.Companion.getCenter()), 0, null, composer, 0, 6);
                    composer.endReplaceableGroup();
                } else {
                    composer.startReplaceableGroup(530366951);
                    Modifier.Companion companion = Modifier.Companion;
                    Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
                    uDU udu = this.KWHzl;
                    Function1<Indicator, Unit> function1 = this.OLrzqt;
                    Function1<Indicator, Unit> function12 = this.AEQbTJ;
                    boolean z = this.copydefault;
                    composer.startReplaceableGroup(733328855);
                    Alignment.Companion companion2 = Alignment.Companion;
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(companion2.getTopStart(), false, composer, 0);
                    composer.startReplaceableGroup(-1323940314);
                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                    ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
                    Function0<ComposeUiNode> constructor = companion3.getConstructor();
                    yHO<SkippableUpdater<ComposeUiNode>, Composer, java.lang.Integer, Unit> yhoModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierFillMaxSize$default);
                    if (!(composer.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer.startReusableNode();
                    if (composer.getInserting()) {
                        composer.createNode(constructor);
                    } else {
                        composer.useNode();
                    }
                    Composer composerM2783constructorimpl = Updater.m2783constructorimpl(composer);
                    Updater.m2790setimpl(composerM2783constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion3.getSetMeasurePolicy());
                    Updater.m2790setimpl(composerM2783constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, java.lang.Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                    if (composerM2783constructorimpl.getInserting() || !Intrinsics.EZpvd(composerM2783constructorimpl.rememberedValue(), java.lang.Integer.valueOf(currentCompositeKeyHash))) {
                        composerM2783constructorimpl.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash));
                        composerM2783constructorimpl.apply(java.lang.Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    yhoModifierMaterializerOf.invoke(SkippableUpdater.m2774boximpl(SkippableUpdater.m2775constructorimpl(composer)), composer, 0);
                    composer.startReplaceableGroup(2058660585);
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    uDK.copydefault(SizeKt.fillMaxSize$default(companion, 0.0f, 1, null), udu, function1, function12, uDK.AEQbTJ, composer, 24582, 0);
                    Modifier modifierAlign = boxScopeInstance.align(companion, companion2.getBottomCenter());
                    EnterTransition enterTransitionFadeIn$default = EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null);
                    composer.startReplaceableGroup(449839348);
                    java.lang.Object objRememberedValue = composer.rememberedValue();
                    Composer.Companion companion4 = Composer.Companion;
                    if (objRememberedValue == companion4.getEmpty()) {
                        objRememberedValue = new Function1() { // from class: o.uDW
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj) {
                                return java.lang.Integer.valueOf(uDK.TaskDescription.EZpvd(((java.lang.Integer) obj).intValue()));
                            }
                        };
                        composer.updateRememberedValue(objRememberedValue);
                    }
                    composer.endReplaceableGroup();
                    EnterTransition enterTransitionPlus = enterTransitionFadeIn$default.plus(EnterExitTransitionKt.slideInVertically$default(null, (Function1) objRememberedValue, 1, null));
                    ExitTransition exitTransitionFadeOut$default = EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null);
                    composer.startReplaceableGroup(449841460);
                    java.lang.Object objRememberedValue2 = composer.rememberedValue();
                    if (objRememberedValue2 == companion4.getEmpty()) {
                        objRememberedValue2 = new Function1() { // from class: o.uDX
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj) {
                                return java.lang.Integer.valueOf(uDK.TaskDescription.KWHzl(((java.lang.Integer) obj).intValue()));
                            }
                        };
                        composer.updateRememberedValue(objRememberedValue2);
                    }
                    composer.endReplaceableGroup();
                    AnimatedVisibilityKt.AnimatedVisibility(z, modifierAlign, enterTransitionPlus, exitTransitionFadeOut$default.plus(EnterExitTransitionKt.slideOutVertically$default(null, (Function1) objRememberedValue2, 1, null)), (java.lang.String) null, ComposableLambdaKt.composableLambda(composer, -102504445, true, new ActionBar(udu)), composer, 200064, 16);
                    composer.endReplaceableGroup();
                    composer.endNode();
                    composer.endReplaceableGroup();
                    composer.endReplaceableGroup();
                    composer.endReplaceableGroup();
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                    return;
                }
                return;
            }
            composer.skipToGroupEnd();
        }

        public static final class ActionBar implements yHO<AnimatedVisibilityScope, Composer, java.lang.Integer, Unit> {
            public final /* synthetic */ uDU OLrzqt;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public ActionBar(uDU udu) {
                this.OLrzqt = udu;
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // o.yHO
            public /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer, java.lang.Integer num) {
                EZpvd(animatedVisibilityScope, composer, num.intValue());
                return Unit.INSTANCE;
            }

            public final void EZpvd(AnimatedVisibilityScope animatedVisibilityScope, Composer composer, int i) {
                Intrinsics.checkNotNullParameter(animatedVisibilityScope, "");
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-102504445, i, -1, "com.okinc.tradingbot.impl.aiBot.ui.indicators.TechnicalIndicatorsComposable.<anonymous>.<anonymous>.<anonymous> (TechnicalIndicatorsComposable.kt:105)");
                }
                int i2 = C48033uCm.Fragment.AxsJAYaxsJAY;
                int iKWHzl = this.OLrzqt.KWHzl();
                uDK.OLrzqt(C33069mpW.copydefault(i2, C56423yEv.EZpvd(C56390yDp.OLrzqt("max", pTB.formatICUNumber$default(java.lang.Integer.valueOf(iKWHzl), null, C38307pTy.Companion.EZpvd(0), null, null, 13, null)))), BackgroundKt.m350backgroundbw27NRU$default(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), ColorResources_androidKt.colorResource(C52761wXj.Activity.EZpvd, composer, 0), null, 2, null), composer, 0, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }
    }

    public static final Unit copydefault(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:113:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x010e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void copydefault(Modifier modifier, final uDU udu, final Function1<? super Indicator, Unit> function1, final Function1<? super Indicator, Unit> function12, float f, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        float f2;
        Modifier modifier3;
        final androidx.compose.runtime.State stateRememberUpdatedState;
        final androidx.compose.runtime.State stateRememberUpdatedState2;
        boolean zChanged;
        boolean zChanged2;
        java.lang.Object objRememberedValue;
        final java.util.List list;
        boolean zChangedInstance;
        boolean zChanged3;
        boolean zChanged4;
        java.lang.Object objRememberedValue2;
        final float f3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(1440284275);
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
            i3 |= composerStartRestartGroup.changed(udu) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= MLKEMEngine.KyberPolyBytes;
        } else if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function1) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function12) ? 2048 : 1024;
        }
        int i5 = i2 & 16;
        if (i5 == 0) {
            if ((i & 24576) == 0) {
                f2 = f;
                i3 |= composerStartRestartGroup.changed(f2) ? 16384 : 8192;
            }
            if ((i3 & 9363) == 9362 || !composerStartRestartGroup.getSkipping()) {
                modifier3 = i4 == 0 ? Modifier.Companion : modifier2;
                boolean z = false;
                float fM5414constructorimpl = i5 == 0 ? androidx.compose.ui.unit.Dp.m5414constructorimpl(0) : f2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1440284275, i3, -1, "com.okinc.tradingbot.impl.aiBot.ui.indicators.IndicatorsList (TechnicalIndicatorsComposable.kt:132)");
                }
                stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(function1, composerStartRestartGroup, (i3 >> 6) & 14);
                stateRememberUpdatedState2 = SnapshotStateKt.rememberUpdatedState(function12, composerStartRestartGroup, (i3 >> 9) & 14);
                java.util.List<IndicatorSectionUiModel> listAEQbTJ = udu.AEQbTJ();
                boolean zCopydefault = udu.copydefault();
                composerStartRestartGroup.startReplaceableGroup(2118161802);
                zChanged = composerStartRestartGroup.changed(listAEQbTJ);
                zChanged2 = composerStartRestartGroup.changed(zCopydefault);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!(zChanged | zChanged2) || objRememberedValue == Composer.Companion.getEmpty()) {
                    java.util.List listOLrzqt = C56402yEa.OLrzqt();
                    int i6 = 0;
                    for (java.lang.Object obj : udu.AEQbTJ()) {
                        if (i6 < 0) {
                            yDY.AYXKKw();
                        }
                        IndicatorSectionUiModel indicatorSectionUiModel = (IndicatorSectionUiModel) obj;
                        if (i6 > 0) {
                            listOLrzqt.add(new AbstractC48071uDx.ActionBar(indicatorSectionUiModel.AEQbTJ()));
                        }
                        listOLrzqt.add(new AbstractC48071uDx.TaskDescription(indicatorSectionUiModel.AEQbTJ()));
                        for (Indicator indicator : indicatorSectionUiModel.OLrzqt()) {
                            listOLrzqt.add(new AbstractC48071uDx.StateListAnimator(indicator, (udu.copydefault() || indicator.gEmmrt()) ? true : z));
                            z = false;
                        }
                        i6++;
                        z = false;
                    }
                    objRememberedValue = C56402yEa.fARcdN(listOLrzqt);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                list = (java.util.List) objRememberedValue;
                composerStartRestartGroup.endReplaceableGroup();
                Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(modifier3, 0.0f, 1, null);
                PaddingValues paddingValuesM668PaddingValuesa9UjIt4$default = PaddingKt.m668PaddingValuesa9UjIt4$default(0.0f, 0.0f, 0.0f, fM5414constructorimpl, 7, null);
                composerStartRestartGroup.startReplaceableGroup(2118192445);
                zChangedInstance = composerStartRestartGroup.changedInstance(list);
                zChanged3 = composerStartRestartGroup.changed(stateRememberUpdatedState);
                zChanged4 = composerStartRestartGroup.changed(stateRememberUpdatedState2);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (!(zChangedInstance | zChanged3 | zChanged4) || objRememberedValue2 == Composer.Companion.getEmpty()) {
                    objRememberedValue2 = new Function1() { // from class: o.uDR
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj2) {
                            return uDK.copydefault(list, stateRememberUpdatedState, stateRememberUpdatedState2, (LazyListScope) obj2);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                LazyDslKt.LazyColumn(modifierFillMaxSize$default, null, paddingValuesM668PaddingValuesa9UjIt4$default, false, null, null, null, false, (Function1) objRememberedValue2, composerStartRestartGroup, 0, 250);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                f3 = fM5414constructorimpl;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
                f3 = f2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                final Modifier modifier4 = modifier3;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: o.uDO
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                        return uDK.copydefault(modifier4, udu, function1, function12, f3, i, i2, (Composer) obj2, ((java.lang.Integer) obj3).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 24576;
        f2 = f;
        if ((i3 & 9363) == 9362) {
            if (i4 == 0) {
            }
            boolean z2 = false;
            if (i5 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(function1, composerStartRestartGroup, (i3 >> 6) & 14);
            stateRememberUpdatedState2 = SnapshotStateKt.rememberUpdatedState(function12, composerStartRestartGroup, (i3 >> 9) & 14);
            java.util.List<IndicatorSectionUiModel> listAEQbTJ2 = udu.AEQbTJ();
            boolean zCopydefault2 = udu.copydefault();
            composerStartRestartGroup.startReplaceableGroup(2118161802);
            zChanged = composerStartRestartGroup.changed(listAEQbTJ2);
            zChanged2 = composerStartRestartGroup.changed(zCopydefault2);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (!(zChanged | zChanged2)) {
                java.util.List listOLrzqt2 = C56402yEa.OLrzqt();
                int i62 = 0;
                while (r10.hasNext()) {
                }
                objRememberedValue = C56402yEa.fARcdN(listOLrzqt2);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                list = (java.util.List) objRememberedValue;
                composerStartRestartGroup.endReplaceableGroup();
                Modifier modifierFillMaxSize$default2 = SizeKt.fillMaxSize$default(modifier3, 0.0f, 1, null);
                PaddingValues paddingValuesM668PaddingValuesa9UjIt4$default2 = PaddingKt.m668PaddingValuesa9UjIt4$default(0.0f, 0.0f, 0.0f, fM5414constructorimpl, 7, null);
                composerStartRestartGroup.startReplaceableGroup(2118192445);
                zChangedInstance = composerStartRestartGroup.changedInstance(list);
                zChanged3 = composerStartRestartGroup.changed(stateRememberUpdatedState);
                zChanged4 = composerStartRestartGroup.changed(stateRememberUpdatedState2);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (!(zChangedInstance | zChanged3 | zChanged4)) {
                    objRememberedValue2 = new Function1() { // from class: o.uDR
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj2) {
                            return uDK.copydefault(list, stateRememberUpdatedState, stateRememberUpdatedState2, (LazyListScope) obj2);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    composerStartRestartGroup.endReplaceableGroup();
                    LazyDslKt.LazyColumn(modifierFillMaxSize$default2, null, paddingValuesM668PaddingValuesa9UjIt4$default2, false, null, null, null, false, (Function1) objRememberedValue2, composerStartRestartGroup, 0, 250);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    f3 = fM5414constructorimpl;
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    public static final Unit copydefault(final java.util.List list, final androidx.compose.runtime.State state, final androidx.compose.runtime.State state2, LazyListScope lazyListScope) {
        Intrinsics.checkNotNullParameter(lazyListScope, "");
        final Function1 function1 = new Function1() { // from class: o.uDQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return uDK.copydefault((AbstractC48071uDx) obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.uDS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return uDK.EZpvd((AbstractC48071uDx) obj);
            }
        };
        lazyListScope.items(list.size(), new Function1<java.lang.Integer, java.lang.Object>() { // from class: com.okinc.tradingbot.impl.aiBot.ui.indicators.TechnicalIndicatorsComposableKt$IndicatorsList_FJfuzF0$lambda$16$lambda$15$$inlined$items$1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // kotlin.jvm.functions.Function1
            public /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int i) {
                return function1.invoke(list.get(i));
            }
        }, new Function1<java.lang.Integer, java.lang.Object>() { // from class: com.okinc.tradingbot.impl.aiBot.ui.indicators.TechnicalIndicatorsComposableKt$IndicatorsList_FJfuzF0$lambda$16$lambda$15$$inlined$items$2
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // kotlin.jvm.functions.Function1
            public /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int i) {
                return function12.invoke(list.get(i));
            }
        }, ComposableLambdaKt.composableLambdaInstance(-632812321, true, new yHT<LazyItemScope, java.lang.Integer, Composer, java.lang.Integer, Unit>() { // from class: com.okinc.tradingbot.impl.aiBot.ui.indicators.TechnicalIndicatorsComposableKt$IndicatorsList_FJfuzF0$lambda$16$lambda$15$$inlined$items$3
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(4);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object] */
            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // o.yHT
            public /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
                invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull LazyItemScope lazyItemScope, int i, Composer composer, int i2) {
                int i3;
                Intrinsics.checkNotNullParameter(lazyItemScope, "");
                if ((i2 & 14) == 0) {
                    i3 = (composer.changed(lazyItemScope) ? 4 : 2) | i2;
                } else {
                    i3 = i2;
                }
                if ((i2 & WalletImportError.ERROR_CODE_AA_EXIST) == 0) {
                    i3 |= composer.changed(i) ? 32 : 16;
                }
                if ((i3 & 731) == 146 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-632812321, i3, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:144)");
                }
                AbstractC48071uDx abstractC48071uDx = (AbstractC48071uDx) list.get(i);
                composer.startReplaceableGroup(-623587181);
                if (abstractC48071uDx instanceof AbstractC48071uDx.ActionBar) {
                    composer.startReplaceableGroup(-623555810);
                    uDK.OLrzqt(PaddingKt.m672paddingVpY3zN4(Modifier.Companion, PrimitiveResources_androidKt.dimensionResource(C52761wXj.StateListAnimator.AEQbTJ, composer, 0), Dp.m5414constructorimpl(16)), composer, 0, 0);
                    composer.endReplaceableGroup();
                } else if (abstractC48071uDx instanceof AbstractC48071uDx.TaskDescription) {
                    composer.startReplaceableGroup(-623225226);
                    uDK.copydefault(PaddingKt.m673paddingVpY3zN4$default(Modifier.Companion, PrimitiveResources_androidKt.dimensionResource(C52761wXj.StateListAnimator.AEQbTJ, composer, 0), 0.0f, 2, null), ((AbstractC48071uDx.TaskDescription) abstractC48071uDx).KWHzl(), composer, 0, 0);
                    composer.endReplaceableGroup();
                } else {
                    if (!(abstractC48071uDx instanceof AbstractC48071uDx.StateListAnimator)) {
                        composer.startReplaceableGroup(-435757712);
                        composer.endReplaceableGroup();
                        throw new NoWhenBranchMatchedException();
                    }
                    composer.startReplaceableGroup(-622939902);
                    Indicator indicatorEZpvd = ((AbstractC48071uDx.StateListAnimator) abstractC48071uDx).EZpvd();
                    composer.startReplaceableGroup(-435733178);
                    boolean zChanged = composer.changed(state);
                    boolean zChanged2 = composer.changed(abstractC48071uDx);
                    Object objRememberedValue = composer.rememberedValue();
                    if ((zChanged | zChanged2) || objRememberedValue == Composer.Companion.getEmpty()) {
                        objRememberedValue = new uDK.ActionBar(abstractC48071uDx, state);
                        composer.updateRememberedValue(objRememberedValue);
                    }
                    Function0 function0 = (Function0) objRememberedValue;
                    composer.endReplaceableGroup();
                    composer.startReplaceableGroup(-435730393);
                    boolean zChanged3 = composer.changed(state2);
                    boolean zChanged4 = composer.changed(abstractC48071uDx);
                    Object objRememberedValue2 = composer.rememberedValue();
                    if ((zChanged3 | zChanged4) || objRememberedValue2 == Composer.Companion.getEmpty()) {
                        objRememberedValue2 = new uDK.Activity(abstractC48071uDx, state2);
                        composer.updateRememberedValue(objRememberedValue2);
                    }
                    composer.endReplaceableGroup();
                    uDK.AEQbTJ((Modifier) null, indicatorEZpvd, (Function0<Unit>) function0, (Function0<Unit>) objRememberedValue2, composer, 0, 1);
                    composer.endReplaceableGroup();
                }
                composer.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        return Unit.INSTANCE;
    }

    public static final java.lang.Object copydefault(AbstractC48071uDx abstractC48071uDx) {
        Intrinsics.checkNotNullParameter(abstractC48071uDx, "");
        return abstractC48071uDx.OLrzqt();
    }

    public static final java.lang.Object EZpvd(AbstractC48071uDx abstractC48071uDx) {
        Intrinsics.checkNotNullParameter(abstractC48071uDx, "");
        if (abstractC48071uDx instanceof AbstractC48071uDx.ActionBar) {
            return "divider";
        }
        if (abstractC48071uDx instanceof AbstractC48071uDx.TaskDescription) {
            return "header";
        }
        if (abstractC48071uDx instanceof AbstractC48071uDx.StateListAnimator) {
            return "indicator";
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final class ActionBar implements Function0<Unit> {
        public final /* synthetic */ AbstractC48071uDx EZpvd;
        public final /* synthetic */ androidx.compose.runtime.State<Function1<Indicator, Unit>> KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: androidx.compose.runtime.State<? extends kotlin.jvm.functions.Function1<? super com.okinc.tradingbot.impl.aiBot.domain.model.Indicator, kotlin.Unit>> */
        /* JADX WARN: Multi-variable type inference failed */
        public ActionBar(AbstractC48071uDx abstractC48071uDx, androidx.compose.runtime.State<? extends Function1<? super Indicator, Unit>> state) {
            this.EZpvd = abstractC48071uDx;
            this.KWHzl = state;
        }

        public final void AEQbTJ() {
            uDK.KWHzl(this.KWHzl).invoke(((AbstractC48071uDx.StateListAnimator) this.EZpvd).EZpvd());
        }

        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function0
        public /* synthetic */ Unit invoke() {
            AEQbTJ();
            return Unit.INSTANCE;
        }
    }

    public static final class Activity implements Function0<Unit> {
        public final /* synthetic */ androidx.compose.runtime.State<Function1<Indicator, Unit>> EZpvd;
        public final /* synthetic */ AbstractC48071uDx KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: androidx.compose.runtime.State<? extends kotlin.jvm.functions.Function1<? super com.okinc.tradingbot.impl.aiBot.domain.model.Indicator, kotlin.Unit>> */
        /* JADX WARN: Multi-variable type inference failed */
        public Activity(AbstractC48071uDx abstractC48071uDx, androidx.compose.runtime.State<? extends Function1<? super Indicator, Unit>> state) {
            this.KWHzl = abstractC48071uDx;
            this.EZpvd = state;
        }

        public final void KWHzl() {
            uDK.EZpvd(this.EZpvd).invoke(((AbstractC48071uDx.StateListAnimator) this.KWHzl).EZpvd());
        }

        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function0
        public /* synthetic */ Unit invoke() {
            KWHzl();
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void OLrzqt(final java.lang.String str, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        final Modifier modifier2;
        int i4;
        Composer composer2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(1231829182);
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
                    ComposerKt.traceEventStart(1231829182, i4, -1, "com.okinc.tradingbot.impl.aiBot.ui.indicators.FooterHint (TechnicalIndicatorsComposable.kt:207)");
                }
                Modifier modifier4 = modifier3;
                composer2 = composerStartRestartGroup;
                TextKt.m2072Text4IGK_g(str, PaddingKt.m672paddingVpY3zN4(modifier3, PrimitiveResources_androidKt.dimensionResource(C52761wXj.StateListAnimator.AEQbTJ, composerStartRestartGroup, 0), androidx.compose.ui.unit.Dp.m5414constructorimpl(8)), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, C52698wVa.OLrzqt(C52761wXj.LoaderManager.AYXKKw, java.lang.Integer.valueOf(C52761wXj.Activity.DQzvGN), composerStartRestartGroup, 0, 0), composer2, i4 & 14, 0, 65532);
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
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: o.uDJ
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return uDK.KWHzl(str, modifier2, i, i2, (Composer) obj, ((java.lang.Integer) obj2).intValue());
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
            Modifier modifier42 = modifier3;
            composer2 = composerStartRestartGroup;
            TextKt.m2072Text4IGK_g(str, PaddingKt.m672paddingVpY3zN4(modifier3, PrimitiveResources_androidKt.dimensionResource(C52761wXj.StateListAnimator.AEQbTJ, composerStartRestartGroup, 0), androidx.compose.ui.unit.Dp.m5414constructorimpl(8)), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, C52698wVa.OLrzqt(C52761wXj.LoaderManager.AYXKKw, java.lang.Integer.valueOf(C52761wXj.Activity.DQzvGN), composerStartRestartGroup, 0, 0), composer2, i4 & 14, 0, 65532);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier2 = modifier42;
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    public static final void AEQbTJ(Modifier modifier, final Indicator indicator, final Function0<Unit> function0, final Function0<Unit> function02, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        Modifier modifier3;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1457488041);
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
            i3 |= composerStartRestartGroup.changed(indicator) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= MLKEMEngine.KyberPolyBytes;
        } else if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function0) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function02) ? 2048 : 1024;
        }
        if ((i3 & 1171) != 1170 || !composerStartRestartGroup.getSkipping()) {
            modifier3 = i4 != 0 ? Modifier.Companion : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1457488041, i3, -1, "com.okinc.tradingbot.impl.aiBot.ui.indicators.IndicatorRow (TechnicalIndicatorsComposable.kt:224)");
            }
            int i5 = i3 << 18;
            wWK.OLrzqt(SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null), indicator.KWHzl(), null, indicator.gEmmrt() ? indicator.copydefault() : null, java.lang.Integer.valueOf(indicator.gEmmrt() ? C52761wXj.TaskDescription.gqESXP : C52761wXj.TaskDescription.QqiRNA), java.lang.Integer.valueOf(C52761wXj.Activity.fdOvFl), 0, 0, function0, function02, composerStartRestartGroup, (234881024 & i5) | 12582912 | (i5 & 1879048192), 68);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: o.uDP
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return uDK.EZpvd(modifier4, indicator, function0, function02, i, i2, (Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void copydefault(Modifier modifier, final java.lang.String str, Composer composer, final int i, final int i2) {
        final Modifier modifier2;
        int i3;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(390350166);
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
        int i5 = i3;
        if ((i5 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            Modifier modifier3 = i4 != 0 ? Modifier.Companion : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(390350166, i5, -1, "com.okinc.tradingbot.impl.aiBot.ui.indicators.SectionHeader (TechnicalIndicatorsComposable.kt:246)");
            }
            Modifier modifier4 = modifier3;
            composer2 = composerStartRestartGroup;
            TextKt.m2072Text4IGK_g(str, PaddingKt.m673paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(SizeKt.wrapContentHeight$default(modifier3, null, false, 3, null), 0.0f, 1, null), 0.0f, androidx.compose.ui.unit.Dp.m5414constructorimpl(12), 1, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, C52698wVa.OLrzqt(C52761wXj.LoaderManager.valueOf, java.lang.Integer.valueOf(C52761wXj.Activity.QwvEab), composerStartRestartGroup, 0, 0), composer2, (i5 >> 3) & 14, 0, 65532);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = modifier4;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: o.uDN
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return uDK.AEQbTJ(modifier2, str, i, i2, (Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void OLrzqt(final Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(-889683525);
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
                ComposerKt.traceEventStart(-889683525, i3, -1, "com.okinc.tradingbot.impl.aiBot.ui.indicators.SectionDivider (TechnicalIndicatorsComposable.kt:263)");
            }
            DividerKt.m1696Divider9IZ8Weo(SizeKt.fillMaxWidth$default(modifier, 0.0f, 1, null), androidx.compose.ui.unit.Dp.m5414constructorimpl((float) 0.5d), ColorResources_androidKt.colorResource(C52761wXj.Activity.zuBGHE, composerStartRestartGroup, 0), composerStartRestartGroup, 48, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: o.uDV
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return uDK.EZpvd(modifier, i, i2, (Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final uLU<uDU> OLrzqt(androidx.compose.runtime.State<? extends uLU<uDU>> state) {
        return state.getValue();
    }

    public static final Function1<Indicator, Unit> KWHzl(androidx.compose.runtime.State<? extends Function1<? super Indicator, Unit>> state) {
        return (Function1) state.getValue();
    }

    public static final Function1<Indicator, Unit> EZpvd(androidx.compose.runtime.State<? extends Function1<? super Indicator, Unit>> state) {
        return (Function1) state.getValue();
    }
}
