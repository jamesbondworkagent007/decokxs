package com.amplifyframework.ui.liveness.ui;

import androidx.compose.foundation.CanvasKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.LifecycleOwner;
import com.amplifyframework.predictions.aws.models.ColorDisplayInformation;
import com.amplifyframework.predictions.aws.models.RgbColor;
import com.amplifyframework.ui.liveness.model.FreshnessColorFrame;
import com.amplifyframework.ui.liveness.model.SceneType;
import com.amplifyframework.ui.liveness.state.FreshnessState;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.yHT;
import okhttp3.internal.ws.WebSocketProtocol;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class FreshnessChallengeKt {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FreshnessChallenge$lambda$13(Object obj, Modifier modifier, List list, yHT yht, Function0 function0, int i, Composer composer, int i2) {
        FreshnessChallenge(obj, modifier, list, yht, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FreshnessChallenge$lambda$5(Object obj, Modifier modifier, List list, yHT yht, Function0 function0, int i, Composer composer, int i2) {
        FreshnessChallenge(obj, modifier, list, yht, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final State<Long> nextFrameMillis(Composer composer, int i) {
        composer.startReplaceableGroup(-765723155);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-765723155, i, -1, "com.amplifyframework.ui.liveness.ui.nextFrameMillis (FreshnessChallenge.kt:38)");
        }
        composer.startReplaceableGroup(-1268639963);
        Object objRememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.Companion;
        if (objRememberedValue == companion.getEmpty()) {
            objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Long.valueOf(System.currentTimeMillis()), null, 2, null);
            composer.updateRememberedValue(objRememberedValue);
        }
        MutableState mutableState = (MutableState) objRememberedValue;
        composer.endReplaceableGroup();
        LifecycleOwner lifecycleOwner = (LifecycleOwner) composer.consume(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
        Unit unit = Unit.INSTANCE;
        composer.startReplaceableGroup(-1268635516);
        boolean zChangedInstance = composer.changedInstance(lifecycleOwner);
        Object objRememberedValue2 = composer.rememberedValue();
        if (zChangedInstance || objRememberedValue2 == companion.getEmpty()) {
            objRememberedValue2 = new FreshnessChallengeKt$nextFrameMillis$1$1(lifecycleOwner, mutableState, null);
            composer.updateRememberedValue(objRememberedValue2);
        }
        composer.endReplaceableGroup();
        EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return mutableState;
    }

    public static final void FreshnessChallenge(@NotNull final Object obj, @NotNull final Modifier modifier, @NotNull final List<ColorDisplayInformation> list, @NotNull final yHT<? super RgbColor, ? super RgbColor, ? super Integer, ? super Long, Unit> yht, @NotNull final Function0<Unit> function0, Composer composer, final int i) {
        int i2;
        Intrinsics.checkNotNullParameter(obj, "");
        Intrinsics.checkNotNullParameter(modifier, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(yht, "");
        Intrinsics.checkNotNullParameter(function0, "");
        Composer composerStartRestartGroup = composer.startRestartGroup(-476378447);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(obj) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(list) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(yht) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function0) ? 16384 : 8192;
        }
        if ((i2 & 9363) != 9362 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-476378447, i2, -1, "com.amplifyframework.ui.liveness.ui.FreshnessChallenge (FreshnessChallenge.kt:60)");
            }
            State stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(yht, composerStartRestartGroup, (i2 >> 9) & 14);
            State stateRememberUpdatedState2 = SnapshotStateKt.rememberUpdatedState(function0, composerStartRestartGroup, (i2 >> 12) & 14);
            composerStartRestartGroup.startReplaceableGroup(-537441552);
            boolean zChanged = composerStartRestartGroup.changed(obj);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new FreshnessState(list, FreshnessChallenge$lambda$2(stateRememberUpdatedState), FreshnessChallenge$lambda$3(stateRememberUpdatedState2));
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            final FreshnessState freshnessState = (FreshnessState) objRememberedValue;
            composerStartRestartGroup.endReplaceableGroup();
            if (freshnessState.getPlaybackEnded()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.amplifyframework.ui.liveness.ui.FreshnessChallengeKt$$ExternalSyntheticLambda0
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj2, Object obj3) {
                            return FreshnessChallengeKt.FreshnessChallenge$lambda$5(obj, modifier, list, yht, function0, i, (Composer) obj2, ((Integer) obj3).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            final State<Long> stateNextFrameMillis = nextFrameMillis(composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(-537434204);
            boolean zChanged2 = composerStartRestartGroup.changed(obj);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged2 || objRememberedValue2 == Composer.Companion.getEmpty()) {
                objRememberedValue2 = SnapshotStateKt.derivedStateOf(new Function0() { // from class: com.amplifyframework.ui.liveness.ui.FreshnessChallengeKt$$ExternalSyntheticLambda1
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return FreshnessChallengeKt.FreshnessChallenge$lambda$7$lambda$6(freshnessState, stateNextFrameMillis);
                    }
                });
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            final State state = (State) objRememberedValue2;
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.startReplaceableGroup(-537428312);
            boolean zChanged3 = composerStartRestartGroup.changed(state);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChanged3 || objRememberedValue3 == Composer.Companion.getEmpty()) {
                objRememberedValue3 = new Function1() { // from class: com.amplifyframework.ui.liveness.ui.FreshnessChallengeKt$$ExternalSyntheticLambda2
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return FreshnessChallengeKt.FreshnessChallenge$lambda$12$lambda$11(state, (DrawScope) obj2);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            composerStartRestartGroup.endReplaceableGroup();
            CanvasKt.Canvas(modifier, (Function1) objRememberedValue3, composerStartRestartGroup, (i2 >> 3) & 14);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup2 = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup2 != null) {
            scopeUpdateScopeEndRestartGroup2.updateScope(new Function2() { // from class: com.amplifyframework.ui.liveness.ui.FreshnessChallengeKt$$ExternalSyntheticLambda3
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return FreshnessChallengeKt.FreshnessChallenge$lambda$13(obj, modifier, list, yht, function0, i, (Composer) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FreshnessColorFrame FreshnessChallenge$lambda$7$lambda$6(FreshnessState freshnessState, State state) {
        return freshnessState.nextFrame(((Number) state.getValue()).longValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FreshnessChallenge$lambda$12$lambda$11(State state, DrawScope drawScope) {
        Intrinsics.checkNotNullParameter(drawScope, "");
        FreshnessColorFrame freshnessColorFrameFreshnessChallenge$lambda$8 = FreshnessChallenge$lambda$8(state);
        if (freshnessColorFrameFreshnessChallenge$lambda$8 != null) {
            SceneType sceneType = freshnessColorFrameFreshnessChallenge$lambda$8.getSceneType();
            if (sceneType instanceof SceneType.DownScroll) {
                float fM2976getHeightimpl = Size.m2976getHeightimpl(drawScope.mo3691getSizeNHjbRc()) * freshnessColorFrameFreshnessChallenge$lambda$8.getSceneCompletionPercentage();
                DrawScope.m3686drawRectnJ9OG0$default(drawScope, freshnessColorFrameFreshnessChallenge$lambda$8.m6053getCurrentColor0d7_KjU(), 0L, SizeKt.Size(Size.m2979getWidthimpl(drawScope.mo3691getSizeNHjbRc()), fM2976getHeightimpl), 0.0f, null, null, 0, 122, null);
                Color colorM6054getPreviousColorQN2ZGVo = freshnessColorFrameFreshnessChallenge$lambda$8.m6054getPreviousColorQN2ZGVo();
                if (colorM6054getPreviousColorQN2ZGVo != null) {
                    colorM6054getPreviousColorQN2ZGVo.m3159unboximpl();
                    DrawScope.m3686drawRectnJ9OG0$default(drawScope, freshnessColorFrameFreshnessChallenge$lambda$8.m6054getPreviousColorQN2ZGVo().m3159unboximpl(), OffsetKt.Offset(0.0f, fM2976getHeightimpl), SizeKt.Size(Size.m2979getWidthimpl(drawScope.mo3691getSizeNHjbRc()), Size.m2976getHeightimpl(drawScope.mo3691getSizeNHjbRc()) - ((int) fM2976getHeightimpl)), 0.0f, null, null, 0, 120, null);
                }
            } else {
                if (!(sceneType instanceof SceneType.Flat)) {
                    throw new NoWhenBranchMatchedException();
                }
                DrawScope.m3686drawRectnJ9OG0$default(drawScope, freshnessColorFrameFreshnessChallenge$lambda$8.m6053getCurrentColor0d7_KjU(), 0L, 0L, 0.0f, null, null, 0, WebSocketProtocol.PAYLOAD_SHORT, null);
            }
        }
        return Unit.INSTANCE;
    }

    private static final yHT<RgbColor, RgbColor, Integer, Long, Unit> FreshnessChallenge$lambda$2(State<? extends yHT<? super RgbColor, ? super RgbColor, ? super Integer, ? super Long, Unit>> state) {
        return (yHT) state.getValue();
    }

    private static final Function0<Unit> FreshnessChallenge$lambda$3(State<? extends Function0<Unit>> state) {
        return state.getValue();
    }

    private static final FreshnessColorFrame FreshnessChallenge$lambda$8(State<FreshnessColorFrame> state) {
        return state.getValue();
    }
}
