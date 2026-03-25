package o;

import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.res.StringResources_androidKt;
import com.amplifyframework.ui.liveness.ml.FaceDetector;
import com.okinc.business.defi.biz.core.error.WalletImportError;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.C48033uCm;
import o.C55688xof;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import org.jetbrains.annotations.NotNull;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: renamed from: o.uIu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C48203uIu {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final Unit AEQbTJ(Modifier modifier, java.lang.String str, java.lang.String str2, int i, int i2, Composer composer, int i3) {
        AEQbTJ(modifier, str, str2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final void AEQbTJ(Modifier modifier, @NotNull final java.lang.String str, @NotNull final java.lang.String str2, Composer composer, final int i, final int i2) {
        int i3;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Composer composerStartRestartGroup = composer.startRestartGroup(-59352008);
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
            i3 |= composerStartRestartGroup.changed(str) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= MLKEMEngine.KyberPolyBytes;
        } else if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i3 |= composerStartRestartGroup.changed(str2) ? 256 : 128;
        }
        if ((i3 & CipherSuite.TLS_RSA_PSK_WITH_3DES_EDE_CBC_SHA) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (i4 != 0) {
                modifier = Modifier.Companion;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-59352008, i3, -1, "com.okinc.tradingbot.impl.botDetail.ui.SafetyOrderDetailsComposable (SafetyOrderDetailsComposable.kt:15)");
            }
            composerStartRestartGroup.startReplaceableGroup(136837531);
            boolean z = (i3 & WalletImportError.ERROR_CODE_AA_EXIST) == 32;
            boolean z2 = (i3 & FaceDetector.NUM_BOXES) == 256;
            java.lang.Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if ((z | z2) || objRememberedValue == Composer.Companion.getEmpty()) {
                java.lang.String strAYXKKw = C33070mpX.AYXKKw(C55688xof.Application.startIntentSenderForResult);
                xMR xmr = xMR.copydefault;
                objRememberedValue = xMR.formatDownToFixed$default(xmr, str2, 0, 2, null) + strAYXKKw + " | " + xMR.formatDownToFixed$default(xmr, str, 0, 2, null) + strAYXKKw;
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            uHB.AEQbTJ(modifier, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1063616787, true, new Activity((java.lang.String) objRememberedValue)), composerStartRestartGroup, (i3 & 14) | 48, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        final Modifier modifier2 = modifier;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: o.uIw
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return C48203uIu.AEQbTJ(modifier2, str, str2, i, i2, (Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: renamed from: o.uIu$Activity */
    public static final class Activity implements yHO<ColumnScope, Composer, java.lang.Integer, Unit> {
        public final /* synthetic */ java.lang.String EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(java.lang.String str) {
            this.EZpvd = str;
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
                    ComposerKt.traceEventStart(-1063616787, i, -1, "com.okinc.tradingbot.impl.botDetail.ui.SafetyOrderDetailsComposable.<anonymous> (SafetyOrderDetailsComposable.kt:24)");
                }
                uHB.KWHzl(StringResources_androidKt.stringResource(C48033uCm.Fragment.DBxZfM, composer, 0), this.EZpvd, null, false, null, composer, 3072, 20);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                    return;
                }
                return;
            }
            composer.skipToGroupEnd();
        }
    }
}
