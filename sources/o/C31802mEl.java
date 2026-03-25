package o;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import com.okinc.cruilib.compose.effect.UpdatedEffectKt$UpdatedEffect$1$1;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mEl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C31802mEl {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final Unit KWHzl(java.lang.Object obj, Function2 function2, int i, Composer composer, int i2) {
        AEQbTJ(obj, function2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void AEQbTJ(final java.lang.Object obj, @NotNull final Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends java.lang.Object> function2, Composer composer, final int i) {
        int i2;
        Intrinsics.checkNotNullParameter(function2, "");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1846021783);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(obj) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function2) ? 32 : 16;
        }
        if ((i2 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1846021783, i2, -1, "com.okinc.cruilib.compose.effect.UpdatedEffect (UpdatedEffect.kt:14)");
            }
            composerStartRestartGroup.startReplaceableGroup(1140810738);
            java.lang.Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.Companion;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(java.lang.Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            MutableState mutableState = (MutableState) objRememberedValue;
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.startReplaceableGroup(1140812768);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(function2);
            java.lang.Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = new UpdatedEffectKt$UpdatedEffect$1$1(function2, mutableState, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceableGroup();
            EffectsKt.LaunchedEffect(obj, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends java.lang.Object>) objRememberedValue2, composerStartRestartGroup, i2 & 14);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: o.mEi
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                    return C31802mEl.KWHzl(obj, function2, i, (Composer) obj2, ((java.lang.Integer) obj3).intValue());
                }
            });
        }
    }

    public static final boolean AEQbTJ(MutableState<java.lang.Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    public static final void KWHzl(MutableState<java.lang.Boolean> mutableState, boolean z) {
        mutableState.setValue(java.lang.Boolean.valueOf(z));
    }
}
