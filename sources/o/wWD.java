package o;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.viewinterop.AndroidView_androidKt;
import androidx.profileinstaller.ProfileVerifier;
import com.amplifyframework.ui.liveness.ml.FaceDetector;
import com.okinc.business.defi.biz.core.error.WalletImportError;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class wWD {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final Unit KWHzl(Modifier modifier, int i, int i2, int i3, int i4, java.lang.String str, int i5, int i6, Composer composer, int i7) {
        EZpvd(modifier, i, i2, i3, i4, str, composer, RecomposeScopeImplKt.updateChangedFlags(i5 | 1), i6);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:132:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0111  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void EZpvd(Modifier modifier, int i, int i2, int i3, int i4, @NotNull final java.lang.String str, Composer composer, final int i5, final int i6) {
        Modifier modifier2;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        final int i12;
        int i13;
        final int i14;
        Modifier modifier3;
        final int i15;
        final int i16;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        java.lang.Object objRememberedValue;
        boolean z5;
        boolean z6;
        java.lang.Object objRememberedValue2;
        final int i17;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(str, "");
        Composer composerStartRestartGroup = composer.startRestartGroup(170099605);
        int i18 = i6 & 1;
        if (i18 != 0) {
            i7 = i5 | 6;
            modifier2 = modifier;
        } else if ((i5 & 6) == 0) {
            modifier2 = modifier;
            i7 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i5;
        } else {
            modifier2 = modifier;
            i7 = i5;
        }
        int i19 = i6 & 2;
        if (i19 != 0) {
            i7 |= 48;
        } else {
            if ((i5 & 48) == 0) {
                i8 = i;
                i7 |= composerStartRestartGroup.changed(i8) ? 32 : 16;
            }
            i9 = i6 & 4;
            if (i9 == 0) {
                i7 |= MLKEMEngine.KyberPolyBytes;
            } else {
                if ((i5 & MLKEMEngine.KyberPolyBytes) == 0) {
                    i10 = i2;
                    i7 |= composerStartRestartGroup.changed(i10) ? 256 : 128;
                }
                i11 = i6 & 8;
                if (i11 != 0) {
                    i7 |= 3072;
                } else {
                    if ((i5 & 3072) == 0) {
                        i12 = i3;
                        i7 |= composerStartRestartGroup.changed(i12) ? 2048 : 1024;
                    }
                    i13 = i6 & 16;
                    if (i13 != 0) {
                        if ((i5 & 24576) == 0) {
                            i14 = i4;
                            i7 |= composerStartRestartGroup.changed(i14) ? 16384 : 8192;
                        }
                        if ((i6 & 32) != 0) {
                            i7 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                        } else if ((i5 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                            i7 |= composerStartRestartGroup.changed(str) ? 131072 : 65536;
                        }
                        if ((i7 & 74899) != 74898 || !composerStartRestartGroup.getSkipping()) {
                            modifier3 = i18 == 0 ? Modifier.Companion : modifier2;
                            i15 = i19 == 0 ? -4 : i8;
                            i16 = i9 == 0 ? 6 : i10;
                            if (i11 != 0) {
                                i12 = 0;
                            }
                            if (i13 != 0) {
                                i14 = -2;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(170099605, i7, -1, "com.okinc.tradingbot.impl.widget.compose.OKTag (OKTagCompose.kt:26)");
                            }
                            composerStartRestartGroup.startReplaceableGroup(815255813);
                            z = (i7 & WalletImportError.ERROR_CODE_AA_EXIST) != 32;
                            int i20 = i7 & FaceDetector.NUM_BOXES;
                            z2 = i20 != 256;
                            z3 = (i7 & 7168) != 2048;
                            z4 = (57344 & i7) != 16384;
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (!(z | z2 | z3 | z4) || objRememberedValue == Composer.Companion.getEmpty()) {
                                objRememberedValue = new Function1() { // from class: o.wWE
                                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                    @Override // kotlin.jvm.functions.Function1
                                    public final java.lang.Object invoke(java.lang.Object obj) {
                                        return wWD.OLrzqt(i15, i16, i12, i14, (android.content.Context) obj);
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            Function1 function1 = (Function1) objRememberedValue;
                            composerStartRestartGroup.endReplaceableGroup();
                            composerStartRestartGroup.startReplaceableGroup(815270004);
                            z5 = (458752 & i7) != 131072;
                            z6 = i20 == 256;
                            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            if (!(z5 | z6) || objRememberedValue2 == Composer.Companion.getEmpty()) {
                                objRememberedValue2 = new Function1() { // from class: o.wWH
                                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                    @Override // kotlin.jvm.functions.Function1
                                    public final java.lang.Object invoke(java.lang.Object obj) {
                                        return wWD.AEQbTJ(str, i16, (C55251xgS) obj);
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            AndroidView_androidKt.AndroidView(function1, modifier3, (Function1) objRememberedValue2, composerStartRestartGroup, (i7 << 3) & WalletImportError.ERROR_CODE_AA_EXIST, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            i8 = i15;
                            i17 = i16;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            modifier3 = modifier2;
                            i17 = i10;
                        }
                        final int i21 = i14;
                        final int i22 = i12;
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                            final Modifier modifier4 = modifier3;
                            final int i23 = i8;
                            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: o.wWF
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                @Override // kotlin.jvm.functions.Function2
                                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                    return wWD.KWHzl(modifier4, i23, i17, i22, i21, str, i5, i6, (Composer) obj, ((java.lang.Integer) obj2).intValue());
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i7 |= 24576;
                    i14 = i4;
                    if ((i6 & 32) != 0) {
                    }
                    if ((i7 & 74899) != 74898) {
                        if (i18 == 0) {
                        }
                        if (i19 == 0) {
                        }
                        if (i9 == 0) {
                        }
                        if (i11 != 0) {
                        }
                        if (i13 != 0) {
                        }
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        composerStartRestartGroup.startReplaceableGroup(815255813);
                        if ((i7 & WalletImportError.ERROR_CODE_AA_EXIST) != 32) {
                        }
                        int i202 = i7 & FaceDetector.NUM_BOXES;
                        if (i202 != 256) {
                        }
                        if ((i7 & 7168) != 2048) {
                        }
                        if ((57344 & i7) != 16384) {
                        }
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (!(z | z2 | z3 | z4)) {
                            objRememberedValue = new Function1() { // from class: o.wWE
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                @Override // kotlin.jvm.functions.Function1
                                public final java.lang.Object invoke(java.lang.Object obj) {
                                    return wWD.OLrzqt(i15, i16, i12, i14, (android.content.Context) obj);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            Function1 function12 = (Function1) objRememberedValue;
                            composerStartRestartGroup.endReplaceableGroup();
                            composerStartRestartGroup.startReplaceableGroup(815270004);
                            if ((458752 & i7) != 131072) {
                            }
                            if (i202 == 256) {
                            }
                            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            if (!(z5 | z6)) {
                                objRememberedValue2 = new Function1() { // from class: o.wWH
                                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                    @Override // kotlin.jvm.functions.Function1
                                    public final java.lang.Object invoke(java.lang.Object obj) {
                                        return wWD.AEQbTJ(str, i16, (C55251xgS) obj);
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                                composerStartRestartGroup.endReplaceableGroup();
                                AndroidView_androidKt.AndroidView(function12, modifier3, (Function1) objRememberedValue2, composerStartRestartGroup, (i7 << 3) & WalletImportError.ERROR_CODE_AA_EXIST, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                i8 = i15;
                                i17 = i16;
                            }
                        }
                    }
                    final int i212 = i14;
                    final int i222 = i12;
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                i12 = i3;
                i13 = i6 & 16;
                if (i13 != 0) {
                }
                i14 = i4;
                if ((i6 & 32) != 0) {
                }
                if ((i7 & 74899) != 74898) {
                }
                final int i2122 = i14;
                final int i2222 = i12;
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            i10 = i2;
            i11 = i6 & 8;
            if (i11 != 0) {
            }
            i12 = i3;
            i13 = i6 & 16;
            if (i13 != 0) {
            }
            i14 = i4;
            if ((i6 & 32) != 0) {
            }
            if ((i7 & 74899) != 74898) {
            }
            final int i21222 = i14;
            final int i22222 = i12;
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        i8 = i;
        i9 = i6 & 4;
        if (i9 == 0) {
        }
        i10 = i2;
        i11 = i6 & 8;
        if (i11 != 0) {
        }
        i12 = i3;
        i13 = i6 & 16;
        if (i13 != 0) {
        }
        i14 = i4;
        if ((i6 & 32) != 0) {
        }
        if ((i7 & 74899) != 74898) {
        }
        final int i212222 = i14;
        final int i222222 = i12;
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    public static final C55251xgS OLrzqt(int i, int i2, int i3, int i4, android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        C55251xgS c55251xgS = new C55251xgS(context, null, 0, 6, null);
        c55251xgS.setOKDSSize(i);
        c55251xgS.setOKDSStyle(i2);
        c55251xgS.setTagPaint(i3);
        c55251xgS.setTagType(i4);
        if (i2 == 6) {
            c55251xgS.setBackgroundTintList(android.content.res.ColorStateList.valueOf(C33070mpX.OLrzqt(C52761wXj.Activity.dHguZz, context)));
        }
        return c55251xgS;
    }

    public static final Unit AEQbTJ(java.lang.String str, int i, C55251xgS c55251xgS) {
        Intrinsics.checkNotNullParameter(c55251xgS, "");
        c55251xgS.setText(str);
        if (i == 6) {
            int i2 = C52761wXj.Activity.dHguZz;
            android.content.Context context = c55251xgS.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            c55251xgS.setBackgroundTintList(android.content.res.ColorStateList.valueOf(C33070mpX.OLrzqt(i2, context)));
        }
        return Unit.INSTANCE;
    }
}
