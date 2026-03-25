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
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.C55688xof;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class uIC {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final Unit EZpvd(Modifier modifier, boolean z, C48179uHx c48179uHx, C48179uHx c48179uHx2, Function0 function0, int i, int i2, Composer composer, int i3) {
        KWHzl(modifier, z, c48179uHx, c48179uHx2, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final class StateListAnimator implements yHO<ColumnScope, Composer, java.lang.Integer, Unit> {
        public final /* synthetic */ C48179uHx AEQbTJ;
        public final /* synthetic */ boolean KWHzl;
        public final /* synthetic */ C48179uHx OLrzqt;
        public final /* synthetic */ Function0<Unit> copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(C48179uHx c48179uHx, C48179uHx c48179uHx2, boolean z, Function0<Unit> function0) {
            this.AEQbTJ = c48179uHx;
            this.OLrzqt = c48179uHx2;
            this.KWHzl = z;
            this.copydefault = function0;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // o.yHO
        public /* synthetic */ Unit invoke(ColumnScope columnScope, Composer composer, java.lang.Integer num) {
            AEQbTJ(columnScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void AEQbTJ(ColumnScope columnScope, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(columnScope, "");
            if ((i & 17) != 16 || !composer.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-88483847, i, -1, "com.okinc.tradingbot.impl.botDetail.ui.StartStopConditionComposable.<anonymous> (StartStopConditionComposable.kt:17)");
                }
                uHB.KWHzl(StringResources_androidKt.stringResource(C55688xof.Application.sendMediaButton, composer, 0), this.AEQbTJ.KWHzl(), null, false, null, composer, 27648, 4);
                if (this.OLrzqt != null) {
                    java.lang.String strStringResource = StringResources_androidKt.stringResource(C55688xof.Application.setShuffleModeEnabledRemoved, composer, 0);
                    java.lang.String strKWHzl = this.OLrzqt.KWHzl();
                    boolean z = this.KWHzl;
                    uHB.KWHzl(strStringResource, strKWHzl, null, z, z ? this.copydefault : null, composer, 0, 4);
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                    return;
                }
                return;
            }
            composer.skipToGroupEnd();
        }
    }

    public static final void KWHzl(Modifier modifier, final boolean z, @NotNull final C48179uHx c48179uHx, final C48179uHx c48179uHx2, @NotNull final Function0<Unit> function0, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        Intrinsics.checkNotNullParameter(c48179uHx, "");
        Intrinsics.checkNotNullParameter(function0, "");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1702677052);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= MLKEMEngine.KyberPolyBytes;
        } else if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i3 |= composerStartRestartGroup.changed(c48179uHx) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changed(c48179uHx2) ? 2048 : 1024;
        }
        if ((i2 & 16) != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function0) ? 16384 : 8192;
        }
        if ((i3 & 9363) != 9362 || !composerStartRestartGroup.getSkipping()) {
            if (i4 != 0) {
                modifier2 = Modifier.Companion;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1702677052, i3, -1, "com.okinc.tradingbot.impl.botDetail.ui.StartStopConditionComposable (StartStopConditionComposable.kt:15)");
            }
            uHB.AEQbTJ(modifier2, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -88483847, true, new StateListAnimator(c48179uHx, c48179uHx2, z, function0)), composerStartRestartGroup, (i3 & 14) | 48, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final Modifier modifier3 = modifier2;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: o.uIA
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return uIC.EZpvd(modifier3, z, c48179uHx, c48179uHx2, function0, i, i2, (Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }
}
