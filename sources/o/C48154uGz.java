package o;

import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.FlowLayoutKt;
import androidx.compose.foundation.layout.FlowRowScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.IconButtonKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.SurfaceKt;
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
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.ColorResources_androidKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.PrimitiveResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.amplifyframework.ui.liveness.ml.FaceDetector;
import com.google.android.exoplayer2.audio.WavUtil;
import com.okinc.business.defi.biz.core.error.WalletImportError;
import com.okinc.tradingbot.impl.aiBot.domain.model.Indicator;
import com.okinc.tradingbot.impl.aiBot.domain.model.TimeframeModel;
import com.okinc.tradingbot.impl.aiBot.ui.signal.EditMarketSignalViewModel;
import com.okinc.tradingbot.impl.widget.compose.HelperLabelType;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC48145uGq;
import o.C48033uCm;
import o.C48154uGz;
import o.C52761wXj;
import o.uLU;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import org.jetbrains.annotations.NotNull;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: renamed from: o.uGz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C48154uGz {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final Unit AEQbTJ(Modifier modifier, Indicator indicator, Function0 function0, int i, int i2, Composer composer, int i3) {
        EZpvd(modifier, indicator, (Function0<Unit>) function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final Unit AEQbTJ(uGU ugu, Function0 function0, Function1 function1, Function1 function12, Function0 function02, Function1 function13, int i, Composer composer, int i2) {
        copydefault(ugu, function0, function1, function12, function02, function13, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final Unit EZpvd(int i, java.util.List list, java.util.List list2, Function1 function1, int i2, Composer composer, int i3) {
        KWHzl(i, (java.util.List<TimeframeModel>) list, (java.util.List<TimeframeModel>) list2, (Function1<? super TimeframeModel, Unit>) function1, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final Unit EZpvd(Modifier modifier, java.util.List list, Function1 function1, int i, int i2, Composer composer, int i3) {
        OLrzqt(modifier, (java.util.List<? extends Indicator>) list, (Function1<? super java.lang.String, Unit>) function1, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final Unit EZpvd(java.lang.String str, Function0 function0, int i, Composer composer, int i2) {
        copydefault(str, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final Unit KWHzl(EditMarketSignalViewModel editMarketSignalViewModel, Function0 function0, Function0 function02, int i, Composer composer, int i2) {
        AEQbTJ(editMarketSignalViewModel, function0, function02, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final Unit OLrzqt(Modifier modifier, Function0 function0, int i, int i2, Composer composer, int i3) {
        OLrzqt(modifier, (Function0<Unit>) function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final Unit OLrzqt(java.util.List list, java.lang.String str, Function1 function1, int i, Composer composer, int i2) {
        copydefault(list, str, function1, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void AEQbTJ(@NotNull final EditMarketSignalViewModel editMarketSignalViewModel, @NotNull final Function0<Unit> function0, @NotNull final Function0<Unit> function02, Composer composer, final int i) {
        int i2;
        Intrinsics.checkNotNullParameter(editMarketSignalViewModel, "");
        Intrinsics.checkNotNullParameter(function0, "");
        Intrinsics.checkNotNullParameter(function02, "");
        Composer composerStartRestartGroup = composer.startRestartGroup(-559572040);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(editMarketSignalViewModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function02) ? 256 : 128;
        }
        if ((i2 & CipherSuite.TLS_RSA_PSK_WITH_3DES_EDE_CBC_SHA) != 146 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-559572040, i2, -1, "com.okinc.tradingbot.impl.aiBot.ui.signal.EditMarketSignalComposable (EditMarketSignalComposable.kt:62)");
            }
            androidx.compose.runtime.State stateCollectAsState = SnapshotStateKt.collectAsState(editMarketSignalViewModel.copydefault(), null, composerStartRestartGroup, 0, 1);
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null);
            uLU<uGU> uluCopydefault = copydefault((androidx.compose.runtime.State<? extends uLU<uGU>>) stateCollectAsState);
            composerStartRestartGroup.startReplaceableGroup(730127006);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(editMarketSignalViewModel);
            java.lang.Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new Function0() { // from class: o.uGE
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return C48154uGz.copydefault(editMarketSignalViewModel);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            wWN.copydefault(modifierFillMaxSize$default, null, null, uluCopydefault, (Function0) objRememberedValue, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 266171774, true, new Application(function02, editMarketSignalViewModel, function0, stateCollectAsState)), composerStartRestartGroup, 196614, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: o.uGF
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return C48154uGz.KWHzl(editMarketSignalViewModel, function0, function02, i, (Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final Unit copydefault(EditMarketSignalViewModel editMarketSignalViewModel) {
        editMarketSignalViewModel.AEQbTJ(AbstractC48145uGq.TaskDescription.AEQbTJ);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.uGz$Application */
    public static final class Application implements yHO<BoxScope, Composer, java.lang.Integer, Unit> {
        public final /* synthetic */ androidx.compose.runtime.State<uLU<uGU>> AEQbTJ;
        public final /* synthetic */ Function0<Unit> KWHzl;
        public final /* synthetic */ Function0<Unit> OLrzqt;
        public final /* synthetic */ EditMarketSignalViewModel copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: androidx.compose.runtime.State<? extends o.uLU<o.uGU>> */
        /* JADX WARN: Multi-variable type inference failed */
        public Application(Function0<Unit> function0, EditMarketSignalViewModel editMarketSignalViewModel, Function0<Unit> function02, androidx.compose.runtime.State<? extends uLU<uGU>> state) {
            this.KWHzl = function0;
            this.copydefault = editMarketSignalViewModel;
            this.OLrzqt = function02;
            this.AEQbTJ = state;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // o.yHO
        public /* synthetic */ Unit invoke(BoxScope boxScope, Composer composer, java.lang.Integer num) {
            copydefault(boxScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void copydefault(BoxScope boxScope, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(boxScope, "");
            if ((i & 17) != 16 || !composer.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(266171774, i, -1, "com.okinc.tradingbot.impl.aiBot.ui.signal.EditMarketSignalComposable.<anonymous> (EditMarketSignalComposable.kt:72)");
                }
                uLU uluCopydefault = C48154uGz.copydefault(this.AEQbTJ);
                uLU.ActionBar actionBar = uluCopydefault instanceof uLU.ActionBar ? (uLU.ActionBar) uluCopydefault : null;
                uGU ugu = actionBar != null ? (uGU) actionBar.KWHzl() : null;
                if (ugu != null) {
                    Function0<Unit> function0 = this.KWHzl;
                    composer.startReplaceableGroup(598864114);
                    boolean zChangedInstance = composer.changedInstance(this.copydefault);
                    final EditMarketSignalViewModel editMarketSignalViewModel = this.copydefault;
                    java.lang.Object objRememberedValue = composer.rememberedValue();
                    if (zChangedInstance || objRememberedValue == Composer.Companion.getEmpty()) {
                        objRememberedValue = new Function1() { // from class: o.uGN
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj) {
                                return C48154uGz.Application.KWHzl(editMarketSignalViewModel, (java.lang.String) obj);
                            }
                        };
                        composer.updateRememberedValue(objRememberedValue);
                    }
                    Function1 function1 = (Function1) objRememberedValue;
                    composer.endReplaceableGroup();
                    composer.startReplaceableGroup(598869554);
                    boolean zChangedInstance2 = composer.changedInstance(this.copydefault);
                    final EditMarketSignalViewModel editMarketSignalViewModel2 = this.copydefault;
                    java.lang.Object objRememberedValue2 = composer.rememberedValue();
                    if (zChangedInstance2 || objRememberedValue2 == Composer.Companion.getEmpty()) {
                        objRememberedValue2 = new Function1() { // from class: o.uGP
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj) {
                                return C48154uGz.Application.copydefault(editMarketSignalViewModel2, (TimeframeModel) obj);
                            }
                        };
                        composer.updateRememberedValue(objRememberedValue2);
                    }
                    Function1 function12 = (Function1) objRememberedValue2;
                    composer.endReplaceableGroup();
                    Function0<Unit> function02 = this.OLrzqt;
                    composer.startReplaceableGroup(598876689);
                    boolean zChangedInstance3 = composer.changedInstance(this.copydefault);
                    final EditMarketSignalViewModel editMarketSignalViewModel3 = this.copydefault;
                    java.lang.Object objRememberedValue3 = composer.rememberedValue();
                    if (zChangedInstance3 || objRememberedValue3 == Composer.Companion.getEmpty()) {
                        objRememberedValue3 = new Function1() { // from class: o.uGS
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj) {
                                return C48154uGz.Application.EZpvd(editMarketSignalViewModel3, (java.lang.String) obj);
                            }
                        };
                        composer.updateRememberedValue(objRememberedValue3);
                    }
                    composer.endReplaceableGroup();
                    C48154uGz.copydefault(ugu, function0, function1, function12, function02, (Function1) objRememberedValue3, composer, 0);
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                    return;
                }
                return;
            }
            composer.skipToGroupEnd();
        }

        public static final Unit KWHzl(EditMarketSignalViewModel editMarketSignalViewModel, java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            editMarketSignalViewModel.AEQbTJ(new AbstractC48145uGq.Activity(str));
            return Unit.INSTANCE;
        }

        public static final Unit copydefault(EditMarketSignalViewModel editMarketSignalViewModel, TimeframeModel timeframeModel) {
            Intrinsics.checkNotNullParameter(timeframeModel, "");
            editMarketSignalViewModel.AEQbTJ(new AbstractC48145uGq.StateListAnimator(timeframeModel));
            return Unit.INSTANCE;
        }

        public static final Unit EZpvd(EditMarketSignalViewModel editMarketSignalViewModel, java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            editMarketSignalViewModel.AEQbTJ(new AbstractC48145uGq.Application(str));
            return Unit.INSTANCE;
        }
    }

    public static final void copydefault(final uGU ugu, final Function0<Unit> function0, final Function1<? super java.lang.String, Unit> function1, final Function1<? super TimeframeModel, Unit> function12, final Function0<Unit> function02, final Function1<? super java.lang.String, Unit> function13, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1434138668);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(ugu) ? 4 : 2) | i;
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
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function02) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function13) ? 131072 : 65536;
        }
        if ((i2 & 74899) != 74898 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1434138668, i2, -1, "com.okinc.tradingbot.impl.aiBot.ui.signal.EditMarketSignalContent (EditMarketSignalComposable.kt:101)");
            }
            Modifier modifierM673paddingVpY3zN4$default = PaddingKt.m673paddingVpY3zN4$default(SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null), PrimitiveResources_androidKt.dimensionResource(C52761wXj.StateListAnimator.AEQbTJ, composerStartRestartGroup, 0), 0.0f, 2, null);
            composerStartRestartGroup.startReplaceableGroup(238236279);
            boolean z = (i2 & WalletImportError.ERROR_CODE_AA_EXIST) == 32;
            boolean z2 = (i2 & 14) == 4;
            boolean z3 = (i2 & FaceDetector.NUM_BOXES) == 256;
            boolean z4 = (i2 & 7168) == 2048;
            boolean z5 = (458752 & i2) == 131072;
            boolean z6 = (i2 & 57344) == 16384;
            java.lang.Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if ((z5 | z | z2 | z3 | z4 | z6) || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new Function1() { // from class: o.uGy
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C48154uGz.KWHzl(ugu, function0, function1, function12, function13, function02, (LazyListScope) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            LazyDslKt.LazyColumn(modifierM673paddingVpY3zN4$default, null, null, false, null, null, null, false, (Function1) objRememberedValue, composerStartRestartGroup, 0, 254);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: o.uGG
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return C48154uGz.AEQbTJ(ugu, function0, function1, function12, function02, function13, i, (Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: renamed from: o.uGz$StateListAnimator */
    public static final class StateListAnimator implements yHO<LazyItemScope, Composer, java.lang.Integer, Unit> {
        public final /* synthetic */ Function1<java.lang.String, Unit> AEQbTJ;
        public final /* synthetic */ Function0<Unit> EZpvd;
        public final /* synthetic */ uGU KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> */
        /* JADX WARN: Multi-variable type inference failed */
        public StateListAnimator(Function0<Unit> function0, uGU ugu, Function1<? super java.lang.String, Unit> function1) {
            this.EZpvd = function0;
            this.KWHzl = ugu;
            this.AEQbTJ = function1;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // o.yHO
        public /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, java.lang.Integer num) {
            copydefault(lazyItemScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void copydefault(LazyItemScope lazyItemScope, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(lazyItemScope, "");
            if ((i & 17) != 16 || !composer.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-597492800, i, -1, "com.okinc.tradingbot.impl.aiBot.ui.signal.EditMarketSignalContent.<anonymous>.<anonymous>.<anonymous> (EditMarketSignalComposable.kt:109)");
                }
                SpacerKt.Spacer(SizeKt.m704height3ABfNKs(Modifier.Companion, androidx.compose.ui.unit.Dp.m5414constructorimpl(12)), composer, 6);
                C48154uGz.copydefault(StringResources_androidKt.stringResource(C48033uCm.Fragment.OuxcSI, composer, 0), this.EZpvd, composer, 0);
                C48154uGz.copydefault(this.KWHzl.EZpvd().KWHzl(), this.KWHzl.gEmmrt(), this.AEQbTJ, composer, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                    return;
                }
                return;
            }
            composer.skipToGroupEnd();
        }
    }

    public static final Unit KWHzl(uGU ugu, Function0 function0, Function1 function1, Function1 function12, Function1 function13, Function0 function02, LazyListScope lazyListScope) {
        Intrinsics.checkNotNullParameter(lazyListScope, "");
        LazyListScope.item$default(lazyListScope, null, null, ComposableLambdaKt.composableLambdaInstance(-597492800, true, new StateListAnimator(function0, ugu, function1)), 3, null);
        LazyListScope.item$default(lazyListScope, null, null, ComposableLambdaKt.composableLambdaInstance(-844234825, true, new Activity(function0, ugu, function12)), 3, null);
        LazyListScope.item$default(lazyListScope, null, null, ComposableLambdaKt.composableLambdaInstance(-786252552, true, new TaskDescription(function0)), 3, null);
        if (!ugu.valueOf().isEmpty()) {
            LazyListScope.item$default(lazyListScope, null, null, ComposableLambdaKt.composableLambdaInstance(866010843, true, new ActionBar(ugu, function13)), 3, null);
        }
        LazyListScope.item$default(lazyListScope, null, null, ComposableLambdaKt.composableLambdaInstance(-728270279, true, new LoaderManager(function02)), 3, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.uGz$Activity */
    public static final class Activity implements yHO<LazyItemScope, Composer, java.lang.Integer, Unit> {
        public final /* synthetic */ uGU KWHzl;
        public final /* synthetic */ Function0<Unit> OLrzqt;
        public final /* synthetic */ Function1<TimeframeModel, Unit> copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super com.okinc.tradingbot.impl.aiBot.domain.model.TimeframeModel, kotlin.Unit> */
        /* JADX WARN: Multi-variable type inference failed */
        public Activity(Function0<Unit> function0, uGU ugu, Function1<? super TimeframeModel, Unit> function1) {
            this.OLrzqt = function0;
            this.KWHzl = ugu;
            this.copydefault = function1;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // o.yHO
        public /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, java.lang.Integer num) {
            AEQbTJ(lazyItemScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void AEQbTJ(LazyItemScope lazyItemScope, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(lazyItemScope, "");
            if ((i & 17) != 16 || !composer.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-844234825, i, -1, "com.okinc.tradingbot.impl.aiBot.ui.signal.EditMarketSignalContent.<anonymous>.<anonymous>.<anonymous> (EditMarketSignalComposable.kt:125)");
                }
                SpacerKt.Spacer(SizeKt.m704height3ABfNKs(Modifier.Companion, androidx.compose.ui.unit.Dp.m5414constructorimpl(16)), composer, 6);
                C48154uGz.copydefault(StringResources_androidKt.stringResource(C48033uCm.Fragment.DGUQLI, composer, 0), this.OLrzqt, composer, 0);
                C48154uGz.KWHzl(this.KWHzl.EZpvd().EZpvd(), this.KWHzl.EZpvd().AEQbTJ(), this.KWHzl.AhwBna(), this.copydefault, composer, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                    return;
                }
                return;
            }
            composer.skipToGroupEnd();
        }
    }

    /* JADX INFO: renamed from: o.uGz$TaskDescription */
    public static final class TaskDescription implements yHO<LazyItemScope, Composer, java.lang.Integer, Unit> {
        public final /* synthetic */ Function0<Unit> AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(Function0<Unit> function0) {
            this.AEQbTJ = function0;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // o.yHO
        public /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, java.lang.Integer num) {
            EZpvd(lazyItemScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void EZpvd(LazyItemScope lazyItemScope, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(lazyItemScope, "");
            if ((i & 17) != 16 || !composer.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-786252552, i, -1, "com.okinc.tradingbot.impl.aiBot.ui.signal.EditMarketSignalContent.<anonymous>.<anonymous>.<anonymous> (EditMarketSignalComposable.kt:142)");
                }
                SpacerKt.Spacer(SizeKt.m704height3ABfNKs(Modifier.Companion, androidx.compose.ui.unit.Dp.m5414constructorimpl(16)), composer, 6);
                C48154uGz.copydefault(StringResources_androidKt.stringResource(C48033uCm.Fragment.QSBOWP, composer, 0), this.AEQbTJ, composer, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                    return;
                }
                return;
            }
            composer.skipToGroupEnd();
        }
    }

    /* JADX INFO: renamed from: o.uGz$ActionBar */
    public static final class ActionBar implements yHO<LazyItemScope, Composer, java.lang.Integer, Unit> {
        public final /* synthetic */ Function1<java.lang.String, Unit> AEQbTJ;
        public final /* synthetic */ uGU copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> */
        /* JADX WARN: Multi-variable type inference failed */
        public ActionBar(uGU ugu, Function1<? super java.lang.String, Unit> function1) {
            this.copydefault = ugu;
            this.AEQbTJ = function1;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // o.yHO
        public /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, java.lang.Integer num) {
            KWHzl(lazyItemScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void KWHzl(LazyItemScope lazyItemScope, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(lazyItemScope, "");
            if ((i & 6) == 0) {
                i |= composer.changed(lazyItemScope) ? 4 : 2;
            }
            if ((i & 19) != 18 || !composer.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(866010843, i, -1, "com.okinc.tradingbot.impl.aiBot.ui.signal.EditMarketSignalContent.<anonymous>.<anonymous>.<anonymous> (EditMarketSignalComposable.kt:153)");
                }
                Modifier.Companion companion = Modifier.Companion;
                C48154uGz.OLrzqt(LazyItemScope.animateItemPlacement$default(lazyItemScope, companion, null, 1, null), this.copydefault.valueOf(), this.AEQbTJ, composer, 0, 0);
                SpacerKt.Spacer(SizeKt.m704height3ABfNKs(companion, androidx.compose.ui.unit.Dp.m5414constructorimpl(12)), composer, 6);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                    return;
                }
                return;
            }
            composer.skipToGroupEnd();
        }
    }

    /* JADX INFO: renamed from: o.uGz$LoaderManager */
    public static final class LoaderManager implements yHO<LazyItemScope, Composer, java.lang.Integer, Unit> {
        public final /* synthetic */ Function0<Unit> KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public LoaderManager(Function0<Unit> function0) {
            this.KWHzl = function0;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // o.yHO
        public /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, java.lang.Integer num) {
            KWHzl(lazyItemScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void KWHzl(LazyItemScope lazyItemScope, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(lazyItemScope, "");
            if ((i & 6) == 0) {
                i |= composer.changed(lazyItemScope) ? 4 : 2;
            }
            if ((i & 19) != 18 || !composer.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-728270279, i, -1, "com.okinc.tradingbot.impl.aiBot.ui.signal.EditMarketSignalContent.<anonymous>.<anonymous>.<anonymous> (EditMarketSignalComposable.kt:164)");
                }
                Modifier.Companion companion = Modifier.Companion;
                C48154uGz.OLrzqt(LazyItemScope.animateItemPlacement$default(lazyItemScope, SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), null, 1, null), this.KWHzl, composer, 0, 0);
                SpacerKt.Spacer(SizeKt.m704height3ABfNKs(companion, androidx.compose.ui.unit.Dp.m5414constructorimpl(16)), composer, 6);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                    return;
                }
                return;
            }
            composer.skipToGroupEnd();
        }
    }

    public static final void OLrzqt(Modifier modifier, final java.util.List<? extends Indicator> list, final Function1<? super java.lang.String, Unit> function1, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        Modifier modifier3;
        Composer composerStartRestartGroup = composer.startRestartGroup(147225249);
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
            i3 |= composerStartRestartGroup.changedInstance(list) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= MLKEMEngine.KyberPolyBytes;
        } else if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function1) ? 256 : 128;
        }
        int i5 = i3;
        if ((i5 & CipherSuite.TLS_RSA_PSK_WITH_3DES_EDE_CBC_SHA) != 146 || !composerStartRestartGroup.getSkipping()) {
            modifier3 = i4 != 0 ? Modifier.Companion : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(147225249, i5, -1, "com.okinc.tradingbot.impl.aiBot.ui.signal.IndicatorsFlow (EditMarketSignalComposable.kt:182)");
            }
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null);
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.HorizontalOrVertical horizontalOrVerticalM582spacedBy0680j_4 = arrangement.m582spacedBy0680j_4(androidx.compose.ui.unit.Dp.m5414constructorimpl(8));
            Arrangement.HorizontalOrVertical horizontalOrVerticalM582spacedBy0680j_42 = arrangement.m582spacedBy0680j_4(androidx.compose.ui.unit.Dp.m5414constructorimpl(12));
            composerStartRestartGroup.startReplaceableGroup(1098475987);
            MeasurePolicy measurePolicyRowMeasurementHelper = FlowLayoutKt.rowMeasurementHelper(horizontalOrVerticalM582spacedBy0680j_4, horizontalOrVerticalM582spacedBy0680j_42, 2, composerStartRestartGroup, 438);
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
            composerStartRestartGroup.startReplaceableGroup(-1037274572);
            for (final Indicator indicator : list) {
                Modifier modifierWeight = flowRowScopeInstance.weight(Modifier.Companion, 1.0f, true);
                composerStartRestartGroup.startReplaceableGroup(1501377677);
                boolean z = (i5 & FaceDetector.NUM_BOXES) == 256;
                boolean zChanged = composerStartRestartGroup.changed(indicator);
                java.lang.Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if ((z | zChanged) || objRememberedValue == Composer.Companion.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: o.uGK
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return C48154uGz.copydefault(function1, indicator);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                EZpvd(modifierWeight, indicator, (Function0<Unit>) objRememberedValue, composerStartRestartGroup, 0, 0);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: o.uGI
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return C48154uGz.EZpvd(modifier4, list, function1, i, i2, (Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final Unit copydefault(Function1 function1, Indicator indicator) {
        function1.invoke(indicator.EZpvd());
        return Unit.INSTANCE;
    }

    public static final void copydefault(final java.lang.String str, final Function0<Unit> function0, Composer composer, final int i) {
        int i2;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(661705834);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if ((i2 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(661705834, i2, -1, "com.okinc.tradingbot.impl.aiBot.ui.signal.SectionHeader (EditMarketSignalComposable.kt:201)");
            }
            final androidx.compose.runtime.State stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(function0, composerStartRestartGroup, (i2 >> 3) & 14);
            Modifier modifierM673paddingVpY3zN4$default = PaddingKt.m673paddingVpY3zN4$default(Modifier.Companion, 0.0f, androidx.compose.ui.unit.Dp.m5414constructorimpl(12), 1, null);
            HelperLabelType helperLabelType = HelperLabelType.Icon;
            int i3 = C52761wXj.LoaderManager.AwvSrB;
            long jColorResource = ColorResources_androidKt.colorResource(C52761wXj.Activity.fdOvFl, composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(223096681);
            boolean zChanged = composerStartRestartGroup.changed(stateRememberUpdatedState);
            java.lang.Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new Function0() { // from class: o.uGJ
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return C48154uGz.OLrzqt(stateRememberUpdatedState);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            composer2 = composerStartRestartGroup;
            C52743wWs.OLrzqt(str, modifierM673paddingVpY3zN4$default, helperLabelType, null, i3, jColorResource, 1, null, null, null, (Function0) objRememberedValue, composerStartRestartGroup, (i2 & 14) | 1573296, 0, TypedValues.Custom.TYPE_BOOLEAN);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: o.uGQ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return C48154uGz.EZpvd(str, function0, i, (Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final Unit OLrzqt(androidx.compose.runtime.State state) {
        KWHzl(state).invoke();
        return Unit.INSTANCE;
    }

    public static final void copydefault(final java.util.List<java.lang.String> list, final java.lang.String str, final Function1<? super java.lang.String, Unit> function1, Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-2023603193);
        int i2 = (i & 6) == 0 ? (composerStartRestartGroup.changedInstance(list) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(str) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function1) ? 256 : 128;
        }
        if ((i2 & CipherSuite.TLS_RSA_PSK_WITH_3DES_EDE_CBC_SHA) != 146 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2023603193, i2, -1, "com.okinc.tradingbot.impl.aiBot.ui.signal.TimeChipSelectionGroup (EditMarketSignalComposable.kt:221)");
            }
            composerStartRestartGroup.startReplaceableGroup(-935392046);
            boolean zChanged = composerStartRestartGroup.changed(list);
            boolean z = (i2 & WalletImportError.ERROR_CODE_AA_EXIST) == 32;
            java.lang.Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if ((zChanged | z) || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = SnapshotStateKt.mutableStateListOf();
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            SnapshotStateList snapshotStateList = (SnapshotStateList) objRememberedValue;
            composerStartRestartGroup.endReplaceableGroup();
            snapshotStateList.clear();
            java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
            for (java.lang.String str2 : list) {
                arrayList.add(new wVQ(str2, Intrinsics.EZpvd((java.lang.Object) str2, (java.lang.Object) str), true));
            }
            snapshotStateList.addAll(arrayList);
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null);
            composerStartRestartGroup.startReplaceableGroup(-935374411);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(list);
            boolean z2 = (i2 & FaceDetector.NUM_BOXES) == 256;
            java.lang.Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if ((zChangedInstance | z2) || objRememberedValue2 == Composer.Companion.getEmpty()) {
                objRememberedValue2 = new Function1() { // from class: o.uGM
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C48154uGz.copydefault(list, function1, ((java.lang.Integer) obj).intValue());
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceableGroup();
            wVS.EZpvd(modifierFillMaxWidth$default, snapshotStateList, 36, 3, (Function1) objRememberedValue2, composerStartRestartGroup, 3462, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: o.uGL
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return C48154uGz.OLrzqt(list, str, function1, i, (Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final Unit copydefault(java.util.List list, Function1 function1, int i) {
        function1.invoke((java.lang.String) list.get(i));
        return Unit.INSTANCE;
    }

    public static final void KWHzl(final int i, final java.util.List<TimeframeModel> list, final java.util.List<TimeframeModel> list2, final Function1<? super TimeframeModel, Unit> function1, Composer composer, final int i2) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1377957410);
        int i3 = (i2 & 6) == 0 ? (composerStartRestartGroup.changed(i) ? 4 : 2) | i2 : i2;
        if ((i2 & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(list) ? 32 : 16;
        }
        if ((i2 & MLKEMEngine.KyberPolyBytes) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(list2) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function1) ? 2048 : 1024;
        }
        if ((i3 & 1171) != 1170 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1377957410, i3, -1, "com.okinc.tradingbot.impl.aiBot.ui.signal.TimeChipMultiSelectionGroup (EditMarketSignalComposable.kt:255)");
            }
            composerStartRestartGroup.startReplaceableGroup(-690278645);
            boolean zChanged = composerStartRestartGroup.changed(list);
            boolean zChanged2 = composerStartRestartGroup.changed(list2);
            boolean z = (i3 & 14) == 4;
            java.lang.Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if ((zChanged | zChanged2 | z) || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = SnapshotStateKt.mutableStateListOf();
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            SnapshotStateList snapshotStateList = (SnapshotStateList) objRememberedValue;
            composerStartRestartGroup.endReplaceableGroup();
            snapshotStateList.clear();
            java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
            for (TimeframeModel timeframeModel : list) {
                arrayList.add(new wVQ(timeframeModel.EZpvd(), list2.contains(timeframeModel), list2.contains(timeframeModel) || list2.size() < i));
            }
            snapshotStateList.addAll(arrayList);
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null);
            composerStartRestartGroup.startReplaceableGroup(-690258523);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(list);
            boolean z2 = (i3 & 7168) == 2048;
            java.lang.Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if ((zChangedInstance | z2) || objRememberedValue2 == Composer.Companion.getEmpty()) {
                objRememberedValue2 = new Function1() { // from class: o.uGD
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C48154uGz.OLrzqt(list, function1, ((java.lang.Integer) obj).intValue());
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceableGroup();
            wVS.EZpvd(modifierFillMaxWidth$default, snapshotStateList, 36, 3, (Function1) objRememberedValue2, composerStartRestartGroup, 3462, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: o.uGH
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return C48154uGz.EZpvd(i, list, list2, function1, i2, (Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final Unit OLrzqt(java.util.List list, Function1 function1, int i) {
        function1.invoke((TimeframeModel) list.get(i));
        return Unit.INSTANCE;
    }

    public static final void EZpvd(Modifier modifier, final Indicator indicator, final Function0<Unit> function0, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        Modifier modifier3;
        Composer composerStartRestartGroup = composer.startRestartGroup(2066302117);
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
        if ((i3 & CipherSuite.TLS_RSA_PSK_WITH_3DES_EDE_CBC_SHA) != 146 || !composerStartRestartGroup.getSkipping()) {
            modifier3 = i4 != 0 ? Modifier.Companion : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2066302117, i3, -1, "com.okinc.tradingbot.impl.aiBot.ui.signal.SelectedIndicatorChip (EditMarketSignalComposable.kt:288)");
            }
            AnimatedVisibilityKt.AnimatedVisibility(true, modifier3, EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.expandHorizontally$default(null, null, false, null, 15, null)), EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.shrinkHorizontally$default(null, null, false, null, 15, null)), (java.lang.String) null, (yHO<? super AnimatedVisibilityScope, ? super Composer, ? super java.lang.Integer, Unit>) ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1739663565, true, new PendingIntent(indicator, function0)), composerStartRestartGroup, ((i3 << 3) & WalletImportError.ERROR_CODE_AA_EXIST) | 200070, 16);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: o.uGR
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return C48154uGz.AEQbTJ(modifier4, indicator, function0, i, i2, (Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: renamed from: o.uGz$PendingIntent */
    public static final class PendingIntent implements yHO<AnimatedVisibilityScope, Composer, java.lang.Integer, Unit> {
        public final /* synthetic */ Indicator AEQbTJ;
        public final /* synthetic */ Function0<Unit> KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public PendingIntent(Indicator indicator, Function0<Unit> function0) {
            this.AEQbTJ = indicator;
            this.KWHzl = function0;
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
                ComposerKt.traceEventStart(1739663565, i, -1, "com.okinc.tradingbot.impl.aiBot.ui.signal.SelectedIndicatorChip.<anonymous> (EditMarketSignalComposable.kt:295)");
            }
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null);
            RoundedCornerShape roundedCornerShapeM924RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m924RoundedCornerShape0680j_4(androidx.compose.ui.unit.Dp.m5414constructorimpl(8));
            long jColorResource = ColorResources_androidKt.colorResource(C52761wXj.Activity.invokespecialDPHOMC, composer, 0);
            final Indicator indicator = this.AEQbTJ;
            final Function0<Unit> function0 = this.KWHzl;
            SurfaceKt.m1994SurfaceT9BRK9s(modifierFillMaxWidth$default, roundedCornerShapeM924RoundedCornerShape0680j_4, jColorResource, 0L, 0.0f, 0.0f, null, ComposableLambdaKt.composableLambda(composer, 385941586, true, new Function2<Composer, java.lang.Integer, Unit>() { // from class: o.uGz.PendingIntent.5
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function2
                public /* synthetic */ Unit invoke(Composer composer2, java.lang.Integer num) {
                    KWHzl(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void KWHzl(Composer composer2, int i2) {
                    if ((i2 & 3) != 2 || !composer2.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(385941586, i2, -1, "com.okinc.tradingbot.impl.aiBot.ui.signal.SelectedIndicatorChip.<anonymous>.<anonymous> (EditMarketSignalComposable.kt:300)");
                        }
                        Modifier.Companion companion = Modifier.Companion;
                        float f = 16;
                        Modifier modifierM672paddingVpY3zN4 = PaddingKt.m672paddingVpY3zN4(companion, androidx.compose.ui.unit.Dp.m5414constructorimpl(12), androidx.compose.ui.unit.Dp.m5414constructorimpl(f));
                        Arrangement.HorizontalOrVertical horizontalOrVerticalM582spacedBy0680j_4 = Arrangement.INSTANCE.m582spacedBy0680j_4(androidx.compose.ui.unit.Dp.m5414constructorimpl(8));
                        Alignment.Vertical centerVertically = Alignment.Companion.getCenterVertically();
                        Indicator indicator2 = indicator;
                        Function0<Unit> function02 = function0;
                        composer2.startReplaceableGroup(693286680);
                        MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(horizontalOrVerticalM582spacedBy0680j_4, centerVertically, composer2, 54);
                        composer2.startReplaceableGroup(-1323940314);
                        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                        ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
                        Function0<ComposeUiNode> constructor = companion2.getConstructor();
                        yHO<SkippableUpdater<ComposeUiNode>, Composer, java.lang.Integer, Unit> yhoModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM672paddingVpY3zN4);
                        if (!(composer2.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor);
                        } else {
                            composer2.useNode();
                        }
                        Composer composerM2783constructorimpl = Updater.m2783constructorimpl(composer2);
                        Updater.m2790setimpl(composerM2783constructorimpl, measurePolicyRowMeasurePolicy, companion2.getSetMeasurePolicy());
                        Updater.m2790setimpl(composerM2783constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, java.lang.Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                        if (composerM2783constructorimpl.getInserting() || !Intrinsics.EZpvd(composerM2783constructorimpl.rememberedValue(), java.lang.Integer.valueOf(currentCompositeKeyHash))) {
                            composerM2783constructorimpl.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash));
                            composerM2783constructorimpl.apply(java.lang.Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        yhoModifierMaterializerOf.invoke(SkippableUpdater.m2774boximpl(SkippableUpdater.m2775constructorimpl(composer2)), composer2, 0);
                        composer2.startReplaceableGroup(2058660585);
                        TextKt.m2072Text4IGK_g(uGW.KWHzl(indicator2), RowScope.weight$default(RowScopeInstance.INSTANCE, companion, 1.0f, false, 2, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.Companion.m5334getEllipsisgIe3tQ8(), false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, C52698wVa.OLrzqt(C52761wXj.LoaderManager.zuBGHE, java.lang.Integer.valueOf(C52761wXj.Activity.fdOvFl), composer2, 0, 0), composer2, 0, 3120, 55292);
                        IconButtonKt.IconButton(function02, SizeKt.m718size3ABfNKs(companion, androidx.compose.ui.unit.Dp.m5414constructorimpl(f)), false, null, null, C48143uGo.AEQbTJ.OLrzqt(), composer2, 196656, 28);
                        composer2.endReplaceableGroup();
                        composer2.endNode();
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    composer2.skipToGroupEnd();
                }
            }), composer, 12582918, 120);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    public static final void OLrzqt(Modifier modifier, final Function0<Unit> function0, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        final Modifier modifier3;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-743636762);
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
            i3 |= composerStartRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if ((i3 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            Modifier modifier4 = i4 != 0 ? Modifier.Companion : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-743636762, i3, -1, "com.okinc.tradingbot.impl.aiBot.ui.signal.AddIndicatorButton (EditMarketSignalComposable.kt:334)");
            }
            float f = 16;
            Modifier modifierEZpvd = C49551uqg.EZpvd(PaddingKt.m673paddingVpY3zN4$default(BackgroundKt.m349backgroundbw27NRU(SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null), ColorResources_androidKt.colorResource(C52761wXj.Activity.invokespecialDPHOMC, composerStartRestartGroup, 0), RoundedCornerShapeKt.m924RoundedCornerShape0680j_4(androidx.compose.ui.unit.Dp.m5414constructorimpl(8))), 0.0f, androidx.compose.ui.unit.Dp.m5414constructorimpl(f), 1, null), function0);
            Arrangement arrangement = Arrangement.INSTANCE;
            float fM5414constructorimpl = androidx.compose.ui.unit.Dp.m5414constructorimpl(4);
            Alignment.Companion companion = Alignment.Companion;
            Arrangement.Horizontal horizontalM583spacedByD5KLDUw = arrangement.m583spacedByD5KLDUw(fM5414constructorimpl, companion.getCenterHorizontally());
            Alignment.Vertical centerVertically = companion.getCenterVertically();
            composerStartRestartGroup.startReplaceableGroup(693286680);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(horizontalM583spacedByD5KLDUw, centerVertically, composerStartRestartGroup, 54);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
            yHO<SkippableUpdater<ComposeUiNode>, Composer, java.lang.Integer, Unit> yhoModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierEZpvd);
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
            IconKt.m1755Iconww6aTOc(PainterResources_androidKt.painterResource(C52761wXj.TaskDescription.fzHEvu, composerStartRestartGroup, 0), "plus icon", SizeKt.m718size3ABfNKs(Modifier.Companion, androidx.compose.ui.unit.Dp.m5414constructorimpl(f)), ColorResources_androidKt.colorResource(C52761wXj.Activity.fdOvFl, composerStartRestartGroup, 0), composerStartRestartGroup, 432, 0);
            modifier3 = modifier4;
            composer2 = composerStartRestartGroup;
            TextKt.m2072Text4IGK_g(StringResources_androidKt.stringResource(C48033uCm.Fragment.QKudOq, composerStartRestartGroup, 0), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, C52698wVa.OLrzqt(C52761wXj.LoaderManager.gHZMYf, java.lang.Integer.valueOf(C52761wXj.Activity.fdOvFl), composerStartRestartGroup, 0, 0), composer2, 0, 0, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE);
            composer2.endReplaceableGroup();
            composer2.endNode();
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            modifier3 = modifier2;
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: o.uGO
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return C48154uGz.OLrzqt(modifier3, function0, i, i2, (Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final uLU<uGU> copydefault(androidx.compose.runtime.State<? extends uLU<uGU>> state) {
        return state.getValue();
    }

    public static final Function0<Unit> KWHzl(androidx.compose.runtime.State<? extends Function0<Unit>> state) {
        return state.getValue();
    }
}
