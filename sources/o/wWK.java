package o;

import android.view.View;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.viewinterop.AndroidView_androidKt;
import androidx.profileinstaller.ProfileVerifier;
import com.amplifyframework.ui.liveness.ml.FaceDetector;
import com.google.api.client.googleapis.media.MediaHttpDownloader;
import com.okinc.business.defi.biz.core.error.WalletImportError;
import com.okinc.uilab.item.OKRegularCell;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* JADX INFO: loaded from: classes19.dex */
public final class wWK {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final Unit EZpvd(Modifier modifier, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.Integer num, java.lang.Integer num2, int i, int i2, Function0 function0, Function0 function02, int i3, int i4, Composer composer, int i5) {
        OLrzqt(modifier, str, str2, str3, num, num2, i, i2, function0, function02, composer, RecomposeScopeImplKt.updateChangedFlags(i3 | 1), i4);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:201:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x011b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void OLrzqt(Modifier modifier, java.lang.String str, java.lang.String str2, java.lang.String str3, @androidx.annotation.DrawableRes java.lang.Integer num, @androidx.annotation.ColorRes java.lang.Integer num2, int i, int i2, Function0<Unit> function0, Function0<Unit> function02, Composer composer, final int i3, final int i4) {
        int i5;
        int i6;
        java.lang.String str4;
        int i7;
        java.lang.String str5;
        int i8;
        java.lang.Integer num3;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        java.lang.String str6;
        final int i14;
        final int i15;
        java.lang.Object objRememberedValue;
        Composer.Companion companion;
        final C55068xcv c55068xcv;
        boolean z;
        Modifier modifier2;
        boolean z2;
        boolean zChangedInstance;
        final Function0<Unit> function03;
        java.lang.Object objRememberedValue2;
        boolean z3;
        boolean z4;
        boolean zChangedInstance2;
        boolean z5;
        boolean z6;
        final Function0<Unit> function04;
        boolean z7;
        final java.lang.Integer num4;
        boolean z8;
        boolean z9;
        java.lang.Object objRememberedValue3;
        final java.lang.String str7;
        final java.lang.String str8;
        final java.lang.Integer num5;
        final java.lang.String str9;
        final java.lang.Integer num6;
        final Function0<Unit> function05;
        final int i16;
        final int i17;
        final Function0<Unit> function06;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(6709367);
        int i18 = i4 & 1;
        if (i18 != 0) {
            i5 = i3 | 6;
        } else if ((i3 & 6) == 0) {
            i5 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i3;
        } else {
            i5 = i3;
        }
        int i19 = i4 & 2;
        if (i19 != 0) {
            i5 |= 48;
        } else {
            if ((i3 & 48) == 0) {
                i5 |= composerStartRestartGroup.changed(str) ? 32 : 16;
            }
            i6 = i4 & 4;
            if (i6 == 0) {
                i5 |= MLKEMEngine.KyberPolyBytes;
            } else {
                if ((i3 & MLKEMEngine.KyberPolyBytes) == 0) {
                    str4 = str2;
                    i5 |= composerStartRestartGroup.changed(str4) ? 256 : 128;
                }
                i7 = i4 & 8;
                if (i7 != 0) {
                    i5 |= 3072;
                } else {
                    if ((i3 & 3072) == 0) {
                        str5 = str3;
                        i5 |= composerStartRestartGroup.changed(str5) ? 2048 : 1024;
                    }
                    i8 = i4 & 16;
                    if (i8 != 0) {
                        if ((i3 & 24576) == 0) {
                            num3 = num;
                            i5 |= composerStartRestartGroup.changed(num3) ? 16384 : 8192;
                        }
                        i9 = i4 & 32;
                        if (i9 != 0) {
                            i5 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                        } else if ((i3 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                            i5 |= composerStartRestartGroup.changed(num2) ? 131072 : 65536;
                        }
                        i10 = i4 & 64;
                        if (i10 != 0) {
                            i5 |= 1572864;
                        } else if ((i3 & 1572864) == 0) {
                            i5 |= composerStartRestartGroup.changed(i) ? 1048576 : 524288;
                        }
                        i11 = i4 & 128;
                        if (i11 != 0) {
                            i5 |= 12582912;
                        } else if ((i3 & 12582912) == 0) {
                            i5 |= composerStartRestartGroup.changed(i2) ? 8388608 : 4194304;
                        }
                        i12 = i4 & 256;
                        if (i12 != 0) {
                            i5 |= 100663296;
                        } else if ((i3 & 100663296) == 0) {
                            i5 |= composerStartRestartGroup.changedInstance(function0) ? 67108864 : MediaHttpDownloader.MAXIMUM_CHUNK_SIZE;
                        }
                        i13 = i4 & 512;
                        if (i13 != 0) {
                            i5 |= com.google.android.exoplayer2.C.ENCODING_PCM_32BIT;
                        } else if ((i3 & com.google.android.exoplayer2.C.ENCODING_PCM_32BIT) == 0) {
                            i5 |= composerStartRestartGroup.changedInstance(function02) ? 536870912 : 268435456;
                        }
                        if ((i5 & 306783379) != 306783378 || !composerStartRestartGroup.getSkipping()) {
                            Modifier modifier3 = i18 == 0 ? Modifier.Companion : modifier;
                            str6 = i19 == 0 ? null : str;
                            if (i6 != 0) {
                                str4 = null;
                            }
                            if (i7 != 0) {
                                str5 = null;
                            }
                            if (i8 != 0) {
                                num3 = null;
                            }
                            java.lang.Integer num7 = i9 == 0 ? null : num2;
                            i14 = i10 == 0 ? -4 : i;
                            i15 = i11 == 0 ? 0 : i2;
                            Function0<Unit> function07 = i12 == 0 ? null : function0;
                            Function0<Unit> function08 = i13 == 0 ? function02 : null;
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(6709367, i5, -1, "com.okinc.tradingbot.impl.widget.compose.RegularCell (RegularCell.kt:30)");
                            }
                            android.content.Context context = (android.content.Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                            composerStartRestartGroup.startReplaceableGroup(1551034402);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            companion = Composer.Companion;
                            if (objRememberedValue == companion.getEmpty()) {
                                objRememberedValue = new C55068xcv(context, null, 0, 6, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            c55068xcv = (C55068xcv) objRememberedValue;
                            composerStartRestartGroup.endReplaceableGroup();
                            composerStartRestartGroup.startReplaceableGroup(1551038184);
                            z = (3670016 & i5) != 1048576;
                            modifier2 = modifier3;
                            z2 = (29360128 & i5) != 8388608;
                            zChangedInstance = composerStartRestartGroup.changedInstance(c55068xcv);
                            function03 = function07;
                            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            if (!(z2 | z | zChangedInstance) || objRememberedValue2 == companion.getEmpty()) {
                                objRememberedValue2 = new Function1() { // from class: o.wWJ
                                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                    @Override // kotlin.jvm.functions.Function1
                                    public final java.lang.Object invoke(java.lang.Object obj) {
                                        return wWK.EZpvd(i14, i15, c55068xcv, (android.content.Context) obj);
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            }
                            Function1 function1 = (Function1) objRememberedValue2;
                            composerStartRestartGroup.endReplaceableGroup();
                            composerStartRestartGroup.startReplaceableGroup(1551051314);
                            z3 = (i5 & WalletImportError.ERROR_CODE_AA_EXIST) != 32;
                            z4 = (i5 & FaceDetector.NUM_BOXES) != 256;
                            zChangedInstance2 = composerStartRestartGroup.changedInstance(c55068xcv);
                            int i20 = i15;
                            int i21 = i14;
                            z5 = (i5 & 7168) != 2048;
                            z6 = (57344 & i5) != 16384;
                            function04 = function08;
                            z7 = (458752 & i5) != 131072;
                            num4 = num7;
                            z8 = (1879048192 & i5) != 536870912;
                            int i22 = i5;
                            z9 = (234881024 & i5) != 67108864;
                            objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                            if (!(z5 | z3 | z4 | zChangedInstance2 | z6 | z7 | z8 | z9) || objRememberedValue3 == companion.getEmpty()) {
                                final java.lang.String str10 = str6;
                                final java.lang.String str11 = str4;
                                final java.lang.String str12 = str5;
                                final java.lang.Integer num8 = num3;
                                objRememberedValue3 = new Function1() { // from class: o.wWL
                                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                    @Override // kotlin.jvm.functions.Function1
                                    public final java.lang.Object invoke(java.lang.Object obj) {
                                        return wWK.KWHzl(str10, str11, c55068xcv, str12, num8, num4, function04, function03, (OKRegularCell) obj);
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            AndroidView_androidKt.AndroidView(function1, modifier2, (Function1) objRememberedValue3, composerStartRestartGroup, (i22 << 3) & WalletImportError.ERROR_CODE_AA_EXIST, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            str7 = str6;
                            str8 = str4;
                            num5 = num3;
                            str9 = str5;
                            num6 = num4;
                            function05 = function03;
                            i16 = i20;
                            i17 = i21;
                            function06 = function04;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            modifier2 = modifier;
                            str7 = str;
                            num6 = num2;
                            i17 = i;
                            i16 = i2;
                            function05 = function0;
                            str8 = str4;
                            num5 = num3;
                            str9 = str5;
                            function06 = function02;
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                            final Modifier modifier4 = modifier2;
                            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: o.wWM
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                @Override // kotlin.jvm.functions.Function2
                                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                    return wWK.EZpvd(modifier4, str7, str8, str9, num5, num6, i17, i16, function05, function06, i3, i4, (Composer) obj, ((java.lang.Integer) obj2).intValue());
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i5 |= 24576;
                    num3 = num;
                    i9 = i4 & 32;
                    if (i9 != 0) {
                    }
                    i10 = i4 & 64;
                    if (i10 != 0) {
                    }
                    i11 = i4 & 128;
                    if (i11 != 0) {
                    }
                    i12 = i4 & 256;
                    if (i12 != 0) {
                    }
                    i13 = i4 & 512;
                    if (i13 != 0) {
                    }
                    if ((i5 & 306783379) != 306783378) {
                        if (i18 == 0) {
                        }
                        if (i19 == 0) {
                        }
                        if (i6 != 0) {
                        }
                        if (i7 != 0) {
                        }
                        if (i8 != 0) {
                        }
                        if (i9 == 0) {
                        }
                        if (i10 == 0) {
                        }
                        if (i11 == 0) {
                        }
                        if (i12 == 0) {
                        }
                        if (i13 == 0) {
                        }
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        android.content.Context context2 = (android.content.Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                        composerStartRestartGroup.startReplaceableGroup(1551034402);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        companion = Composer.Companion;
                        if (objRememberedValue == companion.getEmpty()) {
                        }
                        c55068xcv = (C55068xcv) objRememberedValue;
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.startReplaceableGroup(1551038184);
                        if ((3670016 & i5) != 1048576) {
                        }
                        modifier2 = modifier3;
                        if ((29360128 & i5) != 8388608) {
                        }
                        zChangedInstance = composerStartRestartGroup.changedInstance(c55068xcv);
                        function03 = function07;
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (!(z2 | z | zChangedInstance)) {
                            objRememberedValue2 = new Function1() { // from class: o.wWJ
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                @Override // kotlin.jvm.functions.Function1
                                public final java.lang.Object invoke(java.lang.Object obj) {
                                    return wWK.EZpvd(i14, i15, c55068xcv, (android.content.Context) obj);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            Function1 function12 = (Function1) objRememberedValue2;
                            composerStartRestartGroup.endReplaceableGroup();
                            composerStartRestartGroup.startReplaceableGroup(1551051314);
                            if ((i5 & WalletImportError.ERROR_CODE_AA_EXIST) != 32) {
                            }
                            if ((i5 & FaceDetector.NUM_BOXES) != 256) {
                            }
                            zChangedInstance2 = composerStartRestartGroup.changedInstance(c55068xcv);
                            int i202 = i15;
                            int i212 = i14;
                            if ((i5 & 7168) != 2048) {
                            }
                            if ((57344 & i5) != 16384) {
                            }
                            function04 = function08;
                            if ((458752 & i5) != 131072) {
                            }
                            num4 = num7;
                            if ((1879048192 & i5) != 536870912) {
                            }
                            int i222 = i5;
                            if ((234881024 & i5) != 67108864) {
                            }
                            objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                            if (!(z5 | z3 | z4 | zChangedInstance2 | z6 | z7 | z8 | z9)) {
                                final java.lang.String str102 = str6;
                                final java.lang.String str112 = str4;
                                final java.lang.String str122 = str5;
                                final java.lang.Integer num82 = num3;
                                objRememberedValue3 = new Function1() { // from class: o.wWL
                                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                    @Override // kotlin.jvm.functions.Function1
                                    public final java.lang.Object invoke(java.lang.Object obj) {
                                        return wWK.KWHzl(str102, str112, c55068xcv, str122, num82, num4, function04, function03, (OKRegularCell) obj);
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                                composerStartRestartGroup.endReplaceableGroup();
                                AndroidView_androidKt.AndroidView(function12, modifier2, (Function1) objRememberedValue3, composerStartRestartGroup, (i222 << 3) & WalletImportError.ERROR_CODE_AA_EXIST, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                str7 = str6;
                                str8 = str4;
                                num5 = num3;
                                str9 = str5;
                                num6 = num4;
                                function05 = function03;
                                i16 = i202;
                                i17 = i212;
                                function06 = function04;
                            }
                        }
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                str5 = str3;
                i8 = i4 & 16;
                if (i8 != 0) {
                }
                num3 = num;
                i9 = i4 & 32;
                if (i9 != 0) {
                }
                i10 = i4 & 64;
                if (i10 != 0) {
                }
                i11 = i4 & 128;
                if (i11 != 0) {
                }
                i12 = i4 & 256;
                if (i12 != 0) {
                }
                i13 = i4 & 512;
                if (i13 != 0) {
                }
                if ((i5 & 306783379) != 306783378) {
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            str4 = str2;
            i7 = i4 & 8;
            if (i7 != 0) {
            }
            str5 = str3;
            i8 = i4 & 16;
            if (i8 != 0) {
            }
            num3 = num;
            i9 = i4 & 32;
            if (i9 != 0) {
            }
            i10 = i4 & 64;
            if (i10 != 0) {
            }
            i11 = i4 & 128;
            if (i11 != 0) {
            }
            i12 = i4 & 256;
            if (i12 != 0) {
            }
            i13 = i4 & 512;
            if (i13 != 0) {
            }
            if ((i5 & 306783379) != 306783378) {
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        i6 = i4 & 4;
        if (i6 == 0) {
        }
        str4 = str2;
        i7 = i4 & 8;
        if (i7 != 0) {
        }
        str5 = str3;
        i8 = i4 & 16;
        if (i8 != 0) {
        }
        num3 = num;
        i9 = i4 & 32;
        if (i9 != 0) {
        }
        i10 = i4 & 64;
        if (i10 != 0) {
        }
        i11 = i4 & 128;
        if (i11 != 0) {
        }
        i12 = i4 & 256;
        if (i12 != 0) {
        }
        i13 = i4 & 512;
        if (i13 != 0) {
        }
        if ((i5 & 306783379) != 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    public static final OKRegularCell EZpvd(int i, int i2, C55068xcv c55068xcv, android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        OKRegularCell oKRegularCell = new OKRegularCell(context, null, 0, 6, null);
        oKRegularCell.setSize(i);
        oKRegularCell.setCellStyle(i2);
        c55068xcv.setTextAppearance(C52761wXj.LoaderManager.zuBGHE);
        c55068xcv.setTextColor(C33070mpX.OLrzqt(C52761wXj.Activity.QwvEab, context));
        oKRegularCell.addView(c55068xcv);
        return oKRegularCell;
    }

    public static final Unit KWHzl(java.lang.String str, java.lang.String str2, C55068xcv c55068xcv, java.lang.String str3, java.lang.Integer num, java.lang.Integer num2, final Function0 function0, final Function0 function02, OKRegularCell oKRegularCell) {
        Intrinsics.checkNotNullParameter(oKRegularCell, "");
        if (str != null) {
            oKRegularCell.setTitle(str);
        }
        if (str2 != null) {
            oKRegularCell.setDescription(str2);
        }
        c55068xcv.setText(str3);
        oKRegularCell.OLrzqt().setVisibility(num != null ? 0 : 8);
        if (num != null) {
            if (num2 != null) {
                int iIntValue = num2.intValue();
                android.widget.ImageView imageViewOLrzqt = oKRegularCell.OLrzqt();
                android.content.Context context = oKRegularCell.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                imageViewOLrzqt.setImageTintList(C33070mpX.copydefault(iIntValue, context));
            }
            oKRegularCell.setIcon(num.intValue());
        } else {
            oKRegularCell.setIcon((android.graphics.drawable.Drawable) null);
        }
        if (function0 != null) {
            android.widget.ImageView imageViewOLrzqt2 = oKRegularCell.OLrzqt();
            android.content.Context context2 = oKRegularCell.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            C55296xhK.EZpvd((android.view.View) imageViewOLrzqt2, C55298xhM.KWHzl(56.0f, context2));
            oKRegularCell.OLrzqt().setOnClickListener(new View.OnClickListener() { // from class: o.wWQ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    wWK.OLrzqt(function0, view);
                }
            });
        } else {
            oKRegularCell.OLrzqt().setOnClickListener(null);
        }
        if (function02 != null) {
            oKRegularCell.setOnClickListener(new View.OnClickListener() { // from class: o.wWO
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    wWK.KWHzl(function02, view);
                }
            });
        } else {
            oKRegularCell.setOnClickListener(null);
            oKRegularCell.setClickable(false);
        }
        return Unit.INSTANCE;
    }

    public static final void OLrzqt(Function0 function0, android.view.View view) {
        function0.invoke();
    }

    public static final void KWHzl(Function0 function0, android.view.View view) {
        function0.invoke();
    }
}
