package o;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.viewinterop.AndroidView_androidKt;
import com.amplifyframework.ui.liveness.ml.FaceDetector;
import com.okinc.business.defi.biz.core.error.WalletImportError;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.uqn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C49558uqn {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final Unit KWHzl(Modifier modifier, java.lang.String str, int i, int i2, int i3, int i4, Composer composer, int i5) {
        EZpvd(modifier, str, i, i2, composer, RecomposeScopeImplKt.updateChangedFlags(i3 | 1), i4);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:95:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void EZpvd(Modifier modifier, @NotNull final java.lang.String str, final int i, int i2, Composer composer, final int i3, final int i4) {
        Modifier modifier2;
        int i5;
        final int i6;
        Modifier modifier3;
        boolean z;
        boolean z2;
        boolean z3;
        java.lang.Object objRememberedValue;
        boolean z4;
        boolean z5;
        java.lang.Object objRememberedValue2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(str, "");
        Composer composerStartRestartGroup = composer.startRestartGroup(1294012072);
        int i7 = i4 & 1;
        if (i7 != 0) {
            i5 = i3 | 6;
            modifier2 = modifier;
        } else if ((i3 & 6) == 0) {
            modifier2 = modifier;
            i5 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i3;
        } else {
            modifier2 = modifier;
            i5 = i3;
        }
        if ((i4 & 2) != 0) {
            i5 |= 48;
        } else if ((i3 & 48) == 0) {
            i5 |= composerStartRestartGroup.changed(str) ? 32 : 16;
        }
        if ((i4 & 4) != 0) {
            i5 |= MLKEMEngine.KyberPolyBytes;
        } else if ((i3 & MLKEMEngine.KyberPolyBytes) == 0) {
            i5 |= composerStartRestartGroup.changed(i) ? 256 : 128;
        }
        int i8 = i4 & 8;
        if (i8 == 0) {
            if ((i3 & 3072) == 0) {
                i6 = i2;
                i5 |= composerStartRestartGroup.changed(i6) ? 2048 : 1024;
            }
            if ((i5 & 1171) == 1170 || !composerStartRestartGroup.getSkipping()) {
                modifier3 = i7 == 0 ? Modifier.Companion : modifier2;
                if (i8 != 0) {
                    i6 = -1;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1294012072, i5, -1, "com.okinc.tradeuilib.components.wrapcompose.OKTagWrap (OKTagWrap.kt:16)");
                }
                composerStartRestartGroup.startReplaceableGroup(-99514257);
                z = (i5 & FaceDetector.NUM_BOXES) != 256;
                int i9 = i5 & 7168;
                z2 = i9 != 2048;
                int i10 = i5 & WalletImportError.ERROR_CODE_AA_EXIST;
                z3 = i10 != 32;
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!(z | z2 | z3) || objRememberedValue == Composer.Companion.getEmpty()) {
                    objRememberedValue = new Function1() { // from class: o.uqu
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return C49558uqn.AEQbTJ(i, i6, str, (android.content.Context) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                Function1 function1 = (Function1) objRememberedValue;
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.startReplaceableGroup(-99507897);
                z4 = i9 != 2048;
                z5 = i10 == 32;
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (!(z4 | z5) || objRememberedValue2 == Composer.Companion.getEmpty()) {
                    objRememberedValue2 = new Function1() { // from class: o.uqq
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return C49558uqn.KWHzl(i6, str, (C55251xgS) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                AndroidView_androidKt.AndroidView(function1, modifier3, (Function1) objRememberedValue2, composerStartRestartGroup, (i5 << 3) & WalletImportError.ERROR_CODE_AA_EXIST, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                final Modifier modifier4 = modifier3;
                final int i11 = i6;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: o.uqr
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return C49558uqn.KWHzl(modifier4, str, i, i11, i3, i4, (Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i5 |= 3072;
        i6 = i2;
        if ((i5 & 1171) == 1170) {
            if (i7 == 0) {
            }
            if (i8 != 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            composerStartRestartGroup.startReplaceableGroup(-99514257);
            if ((i5 & FaceDetector.NUM_BOXES) != 256) {
            }
            int i92 = i5 & 7168;
            if (i92 != 2048) {
            }
            int i102 = i5 & WalletImportError.ERROR_CODE_AA_EXIST;
            if (i102 != 32) {
            }
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (!(z | z2 | z3)) {
                objRememberedValue = new Function1() { // from class: o.uqu
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C49558uqn.AEQbTJ(i, i6, str, (android.content.Context) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                Function1 function12 = (Function1) objRememberedValue;
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.startReplaceableGroup(-99507897);
                if (i92 != 2048) {
                }
                if (i102 == 32) {
                }
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (!(z4 | z5)) {
                    objRememberedValue2 = new Function1() { // from class: o.uqq
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return C49558uqn.KWHzl(i6, str, (C55251xgS) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    composerStartRestartGroup.endReplaceableGroup();
                    AndroidView_androidKt.AndroidView(function12, modifier3, (Function1) objRememberedValue2, composerStartRestartGroup, (i5 << 3) & WalletImportError.ERROR_CODE_AA_EXIST, 0);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    public static final C55251xgS AEQbTJ(int i, int i2, java.lang.String str, android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        C55251xgS c55251xgS = new C55251xgS(context, null, 0, 6, null);
        c55251xgS.setOKDSSize(i);
        if (i2 != -1) {
            c55251xgS.setOKDSStyle(i2);
        }
        c55251xgS.setText(str);
        return c55251xgS;
    }

    public static final Unit KWHzl(int i, java.lang.String str, C55251xgS c55251xgS) {
        Intrinsics.checkNotNullParameter(c55251xgS, "");
        if (i != -1) {
            c55251xgS.setOKDSStyle(i);
        }
        c55251xgS.setText(str);
        return Unit.INSTANCE;
    }
}
