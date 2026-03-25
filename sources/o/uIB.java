package o;

import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.res.StringResources_androidKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.C55688xof;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class uIB {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final Unit AEQbTJ(Modifier modifier, C48180uHy c48180uHy, int i, int i2, Composer composer, int i3) {
        KWHzl(modifier, c48180uHy, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final class TaskDescription implements yHO<ColumnScope, Composer, java.lang.Integer, Unit> {
        public final /* synthetic */ C48180uHy EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(C48180uHy c48180uHy) {
            this.EZpvd = c48180uHy;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // o.yHO
        public /* synthetic */ Unit invoke(ColumnScope columnScope, Composer composer, java.lang.Integer num) {
            EZpvd(columnScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void EZpvd(ColumnScope columnScope, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(columnScope, "");
            if ((i & 17) != 16 || !composer.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-456057335, i, -1, "com.okinc.tradingbot.impl.botDetail.ui.StopLossComposable.<anonymous> (StopLossComposable.kt:14)");
                }
                uHB.KWHzl(StringResources_androidKt.stringResource(C55688xof.Application.run, composer, 0), this.EZpvd.AEQbTJ(), null, false, null, composer, 27648, 4);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                    return;
                }
                return;
            }
            composer.skipToGroupEnd();
        }
    }

    public static final void KWHzl(final Modifier modifier, @NotNull final C48180uHy c48180uHy, Composer composer, final int i, final int i2) {
        int i3;
        Intrinsics.checkNotNullParameter(c48180uHy, "");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1236187116);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(c48180uHy) ? 32 : 16;
        }
        if ((i3 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (i4 != 0) {
                modifier = Modifier.Companion;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1236187116, i3, -1, "com.okinc.tradingbot.impl.botDetail.ui.StopLossComposable (StopLossComposable.kt:12)");
            }
            uHB.AEQbTJ(modifier, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -456057335, true, new TaskDescription(c48180uHy)), composerStartRestartGroup, (i3 & 14) | 48, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: o.uID
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return uIB.AEQbTJ(modifier, c48180uHy, i, i2, (Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }
}
