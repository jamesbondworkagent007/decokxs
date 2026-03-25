package o;

import android.view.View;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.viewinterop.AndroidView_androidKt;
import androidx.profileinstaller.ProfileVerifier;
import com.amplifyframework.ui.liveness.ml.FaceDetector;
import com.google.api.client.googleapis.media.MediaHttpDownloader;
import com.okinc.business.defi.biz.core.error.WalletImportError;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.uqi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C49553uqi {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final Unit KWHzl(Modifier modifier, boolean z, boolean z2, boolean z3, int i, int i2, int i3, java.lang.String str, View.OnClickListener onClickListener, int i4, int i5, Composer composer, int i6) {
        OLrzqt(modifier, z, z2, z3, i, i2, i3, str, onClickListener, composer, RecomposeScopeImplKt.updateChangedFlags(i4 | 1), i5);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:199:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0121  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void OLrzqt(Modifier modifier, boolean z, boolean z2, boolean z3, final int i, final int i2, int i3, @NotNull final java.lang.String str, View.OnClickListener onClickListener, Composer composer, final int i4, final int i5) {
        int i6;
        int i7;
        boolean z4;
        int i8;
        boolean z5;
        int i9;
        int i10;
        View.OnClickListener onClickListener2;
        boolean z6;
        boolean z7;
        int i11;
        int i12;
        boolean z8;
        int i13;
        boolean z9;
        int i14;
        boolean z10;
        int i15;
        boolean z11;
        int i16;
        boolean z12;
        int i17;
        boolean z13;
        int i18;
        boolean z14;
        boolean zChangedInstance;
        int i19;
        java.lang.Object objRememberedValue;
        int i20;
        int i21;
        boolean z15;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        boolean z16;
        boolean z17;
        boolean z18;
        int i28;
        boolean z19;
        int i29;
        boolean z20;
        int i30;
        boolean z21;
        boolean z22;
        java.lang.Object objRememberedValue2;
        final boolean z23;
        final View.OnClickListener onClickListener3;
        final int i31;
        final Modifier modifier2;
        final boolean z24;
        final boolean z25;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(str, "");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1229196096);
        int i32 = i5 & 1;
        if (i32 != 0) {
            i6 = i4 | 6;
        } else if ((i4 & 6) == 0) {
            i6 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i4;
        } else {
            i6 = i4;
        }
        int i33 = i5 & 2;
        if (i33 != 0) {
            i6 |= 48;
        } else {
            if ((i4 & 48) == 0) {
                i6 |= composerStartRestartGroup.changed(z) ? 32 : 16;
            }
            i7 = i5 & 4;
            if (i7 == 0) {
                i6 |= MLKEMEngine.KyberPolyBytes;
            } else {
                if ((i4 & MLKEMEngine.KyberPolyBytes) == 0) {
                    z4 = z2;
                    i6 |= composerStartRestartGroup.changed(z4) ? 256 : 128;
                }
                i8 = i5 & 8;
                if (i8 != 0) {
                    i6 |= 3072;
                } else {
                    if ((i4 & 3072) == 0) {
                        z5 = z3;
                        i6 |= composerStartRestartGroup.changed(z5) ? 2048 : 1024;
                    }
                    if ((i5 & 16) != 0) {
                        if ((i4 & 24576) == 0) {
                            i6 |= composerStartRestartGroup.changed(i) ? 16384 : 8192;
                        }
                        if ((i5 & 32) != 0) {
                            i6 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                        } else if ((i4 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                            i6 |= composerStartRestartGroup.changed(i2) ? 131072 : 65536;
                        }
                        i9 = i5 & 64;
                        if (i9 != 0) {
                            i6 |= 1572864;
                        } else if ((i4 & 1572864) == 0) {
                            i6 |= composerStartRestartGroup.changed(i3) ? 1048576 : 524288;
                        }
                        if ((i5 & 128) != 0) {
                            i6 |= 12582912;
                        } else if ((i4 & 12582912) == 0) {
                            i6 |= composerStartRestartGroup.changed(str) ? 8388608 : 4194304;
                        }
                        i10 = i5 & 256;
                        if (i10 != 0) {
                            i6 |= 100663296;
                            onClickListener2 = onClickListener;
                        } else {
                            onClickListener2 = onClickListener;
                            if ((i4 & 100663296) == 0) {
                                i6 |= composerStartRestartGroup.changedInstance(onClickListener2) ? 67108864 : MediaHttpDownloader.MAXIMUM_CHUNK_SIZE;
                            }
                        }
                        if ((i6 & 38347923) != 38347922 || !composerStartRestartGroup.getSkipping()) {
                            Modifier modifier3 = i32 == 0 ? Modifier.Companion : modifier;
                            z6 = i33 == 0 ? true : z;
                            z7 = i7 == 0 ? true : z4;
                            if (i8 != 0) {
                                z5 = true;
                            }
                            i11 = i9 == 0 ? -1 : i3;
                            if (i10 != 0) {
                                onClickListener2 = null;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1229196096, i6, -1, "com.okinc.tradeuilib.components.wrapcompose.OKButtonWrap (OKButtonWrap.kt:26)");
                            }
                            composerStartRestartGroup.startReplaceableGroup(1088086324);
                            i12 = i6 & WalletImportError.ERROR_CODE_AA_EXIST;
                            z8 = i12 != 32;
                            i13 = i6 & FaceDetector.NUM_BOXES;
                            z9 = i13 != 256;
                            i14 = i6 & 7168;
                            z10 = i14 != 2048;
                            i15 = i6 & 57344;
                            z11 = i15 != 16384;
                            i16 = i6 & 458752;
                            z12 = i16 != 131072;
                            i17 = i6 & 3670016;
                            z13 = i17 != 1048576;
                            i18 = i6 & 29360128;
                            z14 = i18 != 8388608;
                            zChangedInstance = composerStartRestartGroup.changedInstance(onClickListener2);
                            i19 = i6;
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if ((!(z8 | z9 | z10 | z11 | z12 | z13 | z14) && !zChangedInstance) || objRememberedValue == Composer.Companion.getEmpty()) {
                                final boolean z26 = z6;
                                final boolean z27 = z7;
                                i20 = i19;
                                final boolean z28 = z5;
                                i21 = i15;
                                z15 = z5;
                                i22 = i18;
                                i23 = i14;
                                final int i34 = i11;
                                i24 = i17;
                                i25 = i13;
                                i26 = i16;
                                i27 = i12;
                                final View.OnClickListener onClickListener4 = onClickListener2;
                                Function1 function1 = new Function1() { // from class: o.uqj
                                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                    @Override // kotlin.jvm.functions.Function1
                                    public final java.lang.Object invoke(java.lang.Object obj) {
                                        return C49553uqi.AEQbTJ(z26, z27, z28, i, i2, i34, str, onClickListener4, (android.content.Context) obj);
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(function1);
                                objRememberedValue = function1;
                            } else {
                                i21 = i15;
                                i26 = i16;
                                i24 = i17;
                                i22 = i18;
                                z15 = z5;
                                i23 = i14;
                                i20 = i19;
                                i25 = i13;
                                i27 = i12;
                            }
                            Function1 function12 = (Function1) objRememberedValue;
                            composerStartRestartGroup.endReplaceableGroup();
                            composerStartRestartGroup.startReplaceableGroup(1088097050);
                            z16 = i27 != 32;
                            z17 = i25 != 256;
                            z18 = i23 != 2048;
                            if (i21 != 16384) {
                                i28 = i26;
                                z19 = true;
                            } else {
                                i28 = i26;
                                z19 = false;
                            }
                            if (i28 != 131072) {
                                i29 = i24;
                                z20 = true;
                            } else {
                                i29 = i24;
                                z20 = false;
                            }
                            if (i29 != 1048576) {
                                i30 = i22;
                                z21 = true;
                            } else {
                                i30 = i22;
                                z21 = false;
                            }
                            z22 = i30 == 8388608;
                            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            if (!(z16 | z17 | z18 | z19 | z20 | z21 | z22) || objRememberedValue2 == Composer.Companion.getEmpty()) {
                                final boolean z29 = z6;
                                final boolean z30 = z7;
                                final boolean z31 = z15;
                                final int i35 = i11;
                                Function1 function13 = new Function1() { // from class: o.uqm
                                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                    @Override // kotlin.jvm.functions.Function1
                                    public final java.lang.Object invoke(java.lang.Object obj) {
                                        return C49553uqi.copydefault(z29, z30, z31, i, i2, i35, str, (C52794wYp) obj);
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(function13);
                                objRememberedValue2 = function13;
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            AndroidView_androidKt.AndroidView(function12, modifier3, (Function1) objRememberedValue2, composerStartRestartGroup, (i20 << 3) & WalletImportError.ERROR_CODE_AA_EXIST, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            z23 = z15;
                            onClickListener3 = onClickListener2;
                            i31 = i11;
                            modifier2 = modifier3;
                            z24 = z6;
                            z25 = z7;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            modifier2 = modifier;
                            z24 = z;
                            z25 = z4;
                            onClickListener3 = onClickListener2;
                            z23 = z5;
                            i31 = i3;
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: o.uqo
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                @Override // kotlin.jvm.functions.Function2
                                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                    return C49553uqi.KWHzl(modifier2, z24, z25, z23, i, i2, i31, str, onClickListener3, i4, i5, (Composer) obj, ((java.lang.Integer) obj2).intValue());
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i6 |= 24576;
                    if ((i5 & 32) != 0) {
                    }
                    i9 = i5 & 64;
                    if (i9 != 0) {
                    }
                    if ((i5 & 128) != 0) {
                    }
                    i10 = i5 & 256;
                    if (i10 != 0) {
                    }
                    if ((i6 & 38347923) != 38347922) {
                        if (i32 == 0) {
                        }
                        if (i33 == 0) {
                        }
                        if (i7 == 0) {
                        }
                        if (i8 != 0) {
                        }
                        if (i9 == 0) {
                        }
                        if (i10 != 0) {
                        }
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        composerStartRestartGroup.startReplaceableGroup(1088086324);
                        i12 = i6 & WalletImportError.ERROR_CODE_AA_EXIST;
                        if (i12 != 32) {
                        }
                        i13 = i6 & FaceDetector.NUM_BOXES;
                        if (i13 != 256) {
                        }
                        i14 = i6 & 7168;
                        if (i14 != 2048) {
                        }
                        i15 = i6 & 57344;
                        if (i15 != 16384) {
                        }
                        i16 = i6 & 458752;
                        if (i16 != 131072) {
                        }
                        i17 = i6 & 3670016;
                        if (i17 != 1048576) {
                        }
                        i18 = i6 & 29360128;
                        if (i18 != 8388608) {
                        }
                        zChangedInstance = composerStartRestartGroup.changedInstance(onClickListener2);
                        i19 = i6;
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (!(z8 | z9 | z10 | z11 | z12 | z13 | z14 | zChangedInstance)) {
                            final boolean z262 = z6;
                            final boolean z272 = z7;
                            i20 = i19;
                            final boolean z282 = z5;
                            i21 = i15;
                            z15 = z5;
                            i22 = i18;
                            i23 = i14;
                            final int i342 = i11;
                            i24 = i17;
                            i25 = i13;
                            i26 = i16;
                            i27 = i12;
                            final View.OnClickListener onClickListener42 = onClickListener2;
                            Function1 function14 = new Function1() { // from class: o.uqj
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                @Override // kotlin.jvm.functions.Function1
                                public final java.lang.Object invoke(java.lang.Object obj) {
                                    return C49553uqi.AEQbTJ(z262, z272, z282, i, i2, i342, str, onClickListener42, (android.content.Context) obj);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(function14);
                            objRememberedValue = function14;
                            Function1 function122 = (Function1) objRememberedValue;
                            composerStartRestartGroup.endReplaceableGroup();
                            composerStartRestartGroup.startReplaceableGroup(1088097050);
                            if (i27 != 32) {
                            }
                            if (i25 != 256) {
                            }
                            if (i23 != 2048) {
                            }
                            if (i21 != 16384) {
                            }
                            if (i28 != 131072) {
                            }
                            if (i29 != 1048576) {
                            }
                            if (i30 == 8388608) {
                            }
                            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            if (!(z16 | z17 | z18 | z19 | z20 | z21 | z22)) {
                                final boolean z292 = z6;
                                final boolean z302 = z7;
                                final boolean z312 = z15;
                                final int i352 = i11;
                                Function1 function132 = new Function1() { // from class: o.uqm
                                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                    @Override // kotlin.jvm.functions.Function1
                                    public final java.lang.Object invoke(java.lang.Object obj) {
                                        return C49553uqi.copydefault(z292, z302, z312, i, i2, i352, str, (C52794wYp) obj);
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(function132);
                                objRememberedValue2 = function132;
                                composerStartRestartGroup.endReplaceableGroup();
                                AndroidView_androidKt.AndroidView(function122, modifier3, (Function1) objRememberedValue2, composerStartRestartGroup, (i20 << 3) & WalletImportError.ERROR_CODE_AA_EXIST, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                z23 = z15;
                                onClickListener3 = onClickListener2;
                                i31 = i11;
                                modifier2 = modifier3;
                                z24 = z6;
                                z25 = z7;
                            }
                        }
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                z5 = z3;
                if ((i5 & 16) != 0) {
                }
                if ((i5 & 32) != 0) {
                }
                i9 = i5 & 64;
                if (i9 != 0) {
                }
                if ((i5 & 128) != 0) {
                }
                i10 = i5 & 256;
                if (i10 != 0) {
                }
                if ((i6 & 38347923) != 38347922) {
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            z4 = z2;
            i8 = i5 & 8;
            if (i8 != 0) {
            }
            z5 = z3;
            if ((i5 & 16) != 0) {
            }
            if ((i5 & 32) != 0) {
            }
            i9 = i5 & 64;
            if (i9 != 0) {
            }
            if ((i5 & 128) != 0) {
            }
            i10 = i5 & 256;
            if (i10 != 0) {
            }
            if ((i6 & 38347923) != 38347922) {
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        i7 = i5 & 4;
        if (i7 == 0) {
        }
        z4 = z2;
        i8 = i5 & 8;
        if (i8 != 0) {
        }
        z5 = z3;
        if ((i5 & 16) != 0) {
        }
        if ((i5 & 32) != 0) {
        }
        i9 = i5 & 64;
        if (i9 != 0) {
        }
        if ((i5 & 128) != 0) {
        }
        i10 = i5 & 256;
        if (i10 != 0) {
        }
        if ((i6 & 38347923) != 38347922) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    public static final C52794wYp AEQbTJ(boolean z, boolean z2, boolean z3, int i, int i2, int i3, java.lang.String str, View.OnClickListener onClickListener, android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        C52794wYp c52794wYp = new C52794wYp(context, null, 0, 6, null);
        c52794wYp.setClickable(z);
        c52794wYp.setEnabled(z2);
        c52794wYp.setFocusable(z3);
        c52794wYp.setOKDSSize(i);
        c52794wYp.setOKDSType(i2);
        c52794wYp.setOKDSPill(i3);
        c52794wYp.setText(str);
        c52794wYp.setOnClickListener(onClickListener);
        return c52794wYp;
    }

    public static final Unit copydefault(boolean z, boolean z2, boolean z3, int i, int i2, int i3, java.lang.String str, C52794wYp c52794wYp) {
        Intrinsics.checkNotNullParameter(c52794wYp, "");
        c52794wYp.setClickable(z);
        c52794wYp.setEnabled(z2);
        c52794wYp.setFocusable(z3);
        c52794wYp.setOKDSSize(i);
        c52794wYp.setOKDSType(i2);
        c52794wYp.setOKDSPill(i3);
        c52794wYp.setText(str);
        return Unit.INSTANCE;
    }
}
