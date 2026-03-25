package o;

import android.view.View;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.viewinterop.AndroidView_androidKt;
import androidx.profileinstaller.ProfileVerifier;
import com.amplifyframework.ui.liveness.ml.FaceDetector;
import com.google.api.client.googleapis.media.MediaHttpDownloader;
import com.okinc.business.defi.biz.core.error.WalletImportError;
import com.okinc.tradingbot.impl.widget.compose.HelperLabelType;
import com.okinc.tradingbot.impl.widget.compose.UnderlineStyle;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wWs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C52743wWs {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final Unit KWHzl(java.lang.String str, Modifier modifier, HelperLabelType helperLabelType, UnderlineStyle underlineStyle, int i, long j, int i2, java.lang.Integer num, android.view.View view, TextAlign textAlign, Function0 function0, int i3, int i4, int i5, Composer composer, int i6) {
        OLrzqt(str, modifier, helperLabelType, underlineStyle, i, j, i2, num, view, textAlign, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i3 | 1), RecomposeScopeImplKt.updateChangedFlags(i4), i5);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final Unit OLrzqt(java.lang.String str, Modifier modifier, UnderlineStyle underlineStyle, int i, long j, int i2, Function0 function0, int i3, int i4, Composer composer, int i5) {
        AEQbTJ(str, modifier, underlineStyle, i, j, i2, (Function0<Unit>) function0, composer, RecomposeScopeImplKt.updateChangedFlags(i3 | 1), i4);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x02fc  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0301  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0308  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0314  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0323  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x032a  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0331  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0341  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x034d A[PHI: r14 r16 r36
  0x034d: PHI (r14v17 int) = (r14v12 int), (r14v19 int) binds: [B:249:0x034b, B:246:0x033a] A[DONT_GENERATE, DONT_INLINE]
  0x034d: PHI (r16v6 kotlin.jvm.functions.Function0<kotlin.Unit>) = (r16v4 kotlin.jvm.functions.Function0<kotlin.Unit>), (r16v8 kotlin.jvm.functions.Function0<kotlin.Unit>) binds: [B:249:0x034b, B:246:0x033a] A[DONT_GENERATE, DONT_INLINE]
  0x034d: PHI (r36v3 int) = (r36v1 int), (r36v4 int) binds: [B:249:0x034b, B:246:0x033a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0356  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x035e  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x0361  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x0370  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x0378  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x03b1  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x03c7  */
    /* JADX WARN: Removed duplicated region for block: B:269:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x011a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void OLrzqt(@NotNull final java.lang.String str, Modifier modifier, HelperLabelType helperLabelType, UnderlineStyle underlineStyle, @androidx.annotation.StyleRes int i, long j, int i2, @androidx.annotation.LayoutRes java.lang.Integer num, android.view.View view, TextAlign textAlign, Function0<Unit> function0, Composer composer, final int i3, final int i4, final int i5) {
        int i6;
        int i7;
        int i8;
        UnderlineStyle underlineStyle2;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        Modifier modifier2;
        HelperLabelType helperLabelType2;
        UnderlineStyle underlineStyle3;
        int i18;
        long jM3185getUnspecified0d7_KjU;
        int i19;
        java.lang.Integer num2;
        android.view.View view2;
        TextAlign textAlign2;
        Function0<Unit> function02;
        boolean z;
        boolean z2;
        Modifier modifier3;
        boolean z3;
        boolean z4;
        boolean zChangedInstance;
        boolean z5;
        boolean z6;
        int i20;
        int i21;
        boolean z7;
        final int i22;
        boolean z8;
        boolean z9;
        java.lang.Object objRememberedValue;
        int i23;
        boolean z10;
        int i24;
        boolean z11;
        int i25;
        boolean z12;
        int i26;
        boolean z13;
        boolean z14;
        boolean zChangedInstance2;
        int i27;
        int i28;
        boolean z15;
        int i29;
        Function0<Unit> function03;
        int i30;
        int i31;
        int i32;
        int i33;
        boolean z16;
        boolean z17;
        java.lang.Object objRememberedValue2;
        final android.view.View view3;
        final HelperLabelType helperLabelType3;
        final UnderlineStyle underlineStyle4;
        final int i34;
        final Function0<Unit> function04;
        final long j2;
        final TextAlign textAlign3;
        final int i35;
        final java.lang.Integer num3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(str, "");
        Composer composerStartRestartGroup = composer.startRestartGroup(-29626741);
        if ((i5 & 1) != 0) {
            i6 = i3 | 6;
        } else if ((i3 & 6) == 0) {
            i6 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i3;
        } else {
            i6 = i3;
        }
        int i36 = i5 & 2;
        if (i36 != 0) {
            i6 |= 48;
        } else {
            if ((i3 & 48) == 0) {
                i6 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
            }
            i7 = i5 & 4;
            if (i7 == 0) {
                i6 |= MLKEMEngine.KyberPolyBytes;
            } else {
                if ((i3 & MLKEMEngine.KyberPolyBytes) == 0) {
                    i6 |= composerStartRestartGroup.changed(helperLabelType) ? 256 : 128;
                }
                i8 = i5 & 8;
                if (i8 != 0) {
                    i6 |= 3072;
                } else {
                    if ((i3 & 3072) == 0) {
                        underlineStyle2 = underlineStyle;
                        i6 |= composerStartRestartGroup.changed(underlineStyle2) ? 2048 : 1024;
                    }
                    if ((i3 & 24576) == 0) {
                        i6 |= ((i5 & 16) == 0 && composerStartRestartGroup.changed(i)) ? 16384 : 8192;
                    }
                    i9 = i5 & 32;
                    if (i9 == 0) {
                        i6 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    } else if ((i3 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                        i6 |= composerStartRestartGroup.changed(j) ? 131072 : 65536;
                    }
                    i10 = i5 & 64;
                    if (i10 == 0) {
                        i6 |= 1572864;
                        i11 = i2;
                    } else {
                        i11 = i2;
                        if ((i3 & 1572864) == 0) {
                            i6 |= composerStartRestartGroup.changed(i11) ? 1048576 : 524288;
                        }
                    }
                    i12 = i5 & 128;
                    if (i12 == 0) {
                        i6 |= 12582912;
                    } else if ((i3 & 12582912) == 0) {
                        i6 |= composerStartRestartGroup.changed(num) ? 8388608 : 4194304;
                    }
                    i13 = i5 & 256;
                    if (i13 == 0) {
                        i6 |= 100663296;
                    } else if ((i3 & 100663296) == 0) {
                        i6 |= composerStartRestartGroup.changedInstance(view) ? 67108864 : MediaHttpDownloader.MAXIMUM_CHUNK_SIZE;
                    }
                    i14 = i5 & 512;
                    if (i14 == 0) {
                        i6 |= com.google.android.exoplayer2.C.ENCODING_PCM_32BIT;
                    } else if ((i3 & com.google.android.exoplayer2.C.ENCODING_PCM_32BIT) == 0) {
                        i6 |= composerStartRestartGroup.changed(textAlign) ? 536870912 : 268435456;
                    }
                    i15 = i5 & 1024;
                    if (i15 == 0) {
                        i17 = i4 | 6;
                    } else {
                        if ((i4 & 6) != 0) {
                            i16 = i4;
                            if ((i6 & 306783379) != 306783378 || (i16 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
                                composerStartRestartGroup.startDefaults();
                                if ((i3 & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                                    modifier2 = i36 == 0 ? Modifier.Companion : modifier;
                                    helperLabelType2 = i7 == 0 ? HelperLabelType.Regular : helperLabelType;
                                    underlineStyle3 = i8 == 0 ? UnderlineStyle.Dotted : underlineStyle2;
                                    if ((i5 & 16) == 0) {
                                        i18 = C52761wXj.LoaderManager.zuBGHE;
                                        i6 &= -57345;
                                    } else {
                                        i18 = i;
                                    }
                                    jM3185getUnspecified0d7_KjU = i9 == 0 ? Color.Companion.m3185getUnspecified0d7_KjU() : j;
                                    i19 = i10 == 0 ? Integer.MAX_VALUE : i11;
                                    num2 = i12 == 0 ? null : num;
                                    view2 = i13 == 0 ? null : view;
                                    textAlign2 = i14 == 0 ? null : textAlign;
                                    if (i15 == 0) {
                                    }
                                    composerStartRestartGroup.endDefaults();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-29626741, i6, i16, "com.okinc.tradingbot.impl.widget.compose.OKHelperLabel (OKHelperLabel.kt:46)");
                                    }
                                    composerStartRestartGroup.startReplaceableGroup(1269822440);
                                    int i37 = i6 & FaceDetector.NUM_BOXES;
                                    z = i37 == 256;
                                    int i38 = i6 & 7168;
                                    z2 = i38 == 2048;
                                    modifier3 = modifier2;
                                    int i39 = i6 & 3670016;
                                    z3 = i39 == 1048576;
                                    int i40 = i6 & 29360128;
                                    z4 = i40 == 8388608;
                                    zChangedInstance = composerStartRestartGroup.changedInstance(view2);
                                    int i41 = i16 & 14;
                                    z5 = i41 == 4;
                                    int i42 = i6 & 14;
                                    z6 = i42 == 4;
                                    i20 = (i6 & 57344) ^ 24576;
                                    final TextAlign textAlign4 = textAlign2;
                                    if (i20 <= 16384 || !composerStartRestartGroup.changed(i18)) {
                                        i21 = i20;
                                        if ((i6 & 24576) != 16384) {
                                            z7 = false;
                                        }
                                        int i43 = 458752 & i6;
                                        i22 = i18;
                                        z8 = i43 == 131072;
                                        int i44 = i6;
                                        z9 = (i6 & 1879048192) == 536870912;
                                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                                        if ((z9 | z7 | z6 | z4 | z3 | z | z2 | zChangedInstance | z5 | z8) || objRememberedValue == Composer.Companion.getEmpty()) {
                                            final HelperLabelType helperLabelType4 = helperLabelType2;
                                            final UnderlineStyle underlineStyle5 = underlineStyle3;
                                            final int i45 = i19;
                                            final java.lang.Integer num4 = num2;
                                            final android.view.View view4 = view2;
                                            final Function0<Unit> function05 = function02;
                                            final long j3 = jM3185getUnspecified0d7_KjU;
                                            objRememberedValue = new Function1() { // from class: o.wWr
                                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                                @Override // kotlin.jvm.functions.Function1
                                                public final java.lang.Object invoke(java.lang.Object obj) {
                                                    return C52743wWs.EZpvd(helperLabelType4, underlineStyle5, i45, num4, view4, function05, str, i22, j3, textAlign4, (android.content.Context) obj);
                                                }
                                            };
                                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                        }
                                        Function1 function1 = (Function1) objRememberedValue;
                                        composerStartRestartGroup.endReplaceableGroup();
                                        composerStartRestartGroup.startReplaceableGroup(1269869831);
                                        if (i42 != 4) {
                                            z10 = true;
                                            i23 = i39;
                                        } else {
                                            i23 = i39;
                                            z10 = false;
                                        }
                                        if (i23 != 1048576) {
                                            z11 = true;
                                            i24 = i37;
                                        } else {
                                            i24 = i37;
                                            z11 = false;
                                        }
                                        if (i24 != 256) {
                                            z12 = true;
                                            i25 = i38;
                                        } else {
                                            i25 = i38;
                                            z12 = false;
                                        }
                                        if (i25 != 2048) {
                                            z13 = true;
                                            i26 = i40;
                                        } else {
                                            i26 = i40;
                                            z13 = false;
                                        }
                                        z14 = i26 != 8388608;
                                        zChangedInstance2 = composerStartRestartGroup.changedInstance(view2);
                                        if (i41 != 4) {
                                            z15 = true;
                                            i27 = i21;
                                            i28 = 16384;
                                        } else {
                                            i27 = i21;
                                            i28 = 16384;
                                            z15 = false;
                                        }
                                        if (i27 <= i28) {
                                            i29 = i22;
                                            if (composerStartRestartGroup.changed(i29)) {
                                                function03 = function02;
                                                i30 = i29;
                                                i31 = i44;
                                            }
                                            i32 = i31;
                                            z16 = true;
                                            i33 = i43;
                                            z17 = i33 == 131072;
                                            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                                            if ((z14 | z10 | z11 | z12 | z13 | zChangedInstance2 | z15 | z16 | z17) || objRememberedValue2 == Composer.Companion.getEmpty()) {
                                                final int i46 = i19;
                                                final HelperLabelType helperLabelType5 = helperLabelType2;
                                                final UnderlineStyle underlineStyle6 = underlineStyle3;
                                                final java.lang.Integer num5 = num2;
                                                final android.view.View view5 = view2;
                                                final Function0<Unit> function06 = function03;
                                                final int i47 = i30;
                                                final long j4 = jM3185getUnspecified0d7_KjU;
                                                objRememberedValue2 = new Function1() { // from class: o.wWv
                                                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                                    @Override // kotlin.jvm.functions.Function1
                                                    public final java.lang.Object invoke(java.lang.Object obj) {
                                                        return C52743wWs.KWHzl(str, i46, helperLabelType5, underlineStyle6, num5, view5, function06, i47, j4, (C55258xgZ) obj);
                                                    }
                                                };
                                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                                            }
                                            composerStartRestartGroup.endReplaceableGroup();
                                            AndroidView_androidKt.AndroidView(function1, modifier3, (Function1) objRememberedValue2, composerStartRestartGroup, i32 & WalletImportError.ERROR_CODE_AA_EXIST, 0);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                            view3 = view2;
                                            helperLabelType3 = helperLabelType2;
                                            underlineStyle4 = underlineStyle3;
                                            i34 = i19;
                                            function04 = function03;
                                            j2 = jM3185getUnspecified0d7_KjU;
                                            textAlign3 = textAlign4;
                                            i35 = i30;
                                            num3 = num2;
                                        } else {
                                            i29 = i22;
                                        }
                                        function03 = function02;
                                        i30 = i29;
                                        i31 = i44;
                                        if ((i31 & 24576) != i28) {
                                            i32 = i31;
                                            z16 = true;
                                            i33 = i43;
                                        } else {
                                            i32 = i31;
                                            i33 = i43;
                                            z16 = false;
                                        }
                                        if (i33 == 131072) {
                                        }
                                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                                        if (z14 | z10 | z11 | z12 | z13 | zChangedInstance2 | z15 | z16 | z17) {
                                            final int i462 = i19;
                                            final HelperLabelType helperLabelType52 = helperLabelType2;
                                            final UnderlineStyle underlineStyle62 = underlineStyle3;
                                            final java.lang.Integer num52 = num2;
                                            final android.view.View view52 = view2;
                                            final Function0 function062 = function03;
                                            final int i472 = i30;
                                            final long j42 = jM3185getUnspecified0d7_KjU;
                                            objRememberedValue2 = new Function1() { // from class: o.wWv
                                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                                @Override // kotlin.jvm.functions.Function1
                                                public final java.lang.Object invoke(java.lang.Object obj) {
                                                    return C52743wWs.KWHzl(str, i462, helperLabelType52, underlineStyle62, num52, view52, function062, i472, j42, (C55258xgZ) obj);
                                                }
                                            };
                                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                                            composerStartRestartGroup.endReplaceableGroup();
                                            AndroidView_androidKt.AndroidView(function1, modifier3, (Function1) objRememberedValue2, composerStartRestartGroup, i32 & WalletImportError.ERROR_CODE_AA_EXIST, 0);
                                            if (ComposerKt.isTraceInProgress()) {
                                            }
                                            view3 = view2;
                                            helperLabelType3 = helperLabelType2;
                                            underlineStyle4 = underlineStyle3;
                                            i34 = i19;
                                            function04 = function03;
                                            j2 = jM3185getUnspecified0d7_KjU;
                                            textAlign3 = textAlign4;
                                            i35 = i30;
                                            num3 = num2;
                                        }
                                    } else {
                                        i21 = i20;
                                    }
                                    z7 = true;
                                    int i432 = 458752 & i6;
                                    i22 = i18;
                                    if (i432 == 131072) {
                                    }
                                    int i442 = i6;
                                    if ((i6 & 1879048192) == 536870912) {
                                    }
                                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                                    if (z9 | z7 | z6 | z4 | z3 | z | z2 | zChangedInstance | z5 | z8) {
                                        final HelperLabelType helperLabelType42 = helperLabelType2;
                                        final UnderlineStyle underlineStyle52 = underlineStyle3;
                                        final int i452 = i19;
                                        final java.lang.Integer num42 = num2;
                                        final android.view.View view42 = view2;
                                        final Function0 function052 = function02;
                                        final long j32 = jM3185getUnspecified0d7_KjU;
                                        objRememberedValue = new Function1() { // from class: o.wWr
                                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                            @Override // kotlin.jvm.functions.Function1
                                            public final java.lang.Object invoke(java.lang.Object obj) {
                                                return C52743wWs.EZpvd(helperLabelType42, underlineStyle52, i452, num42, view42, function052, str, i22, j32, textAlign4, (android.content.Context) obj);
                                            }
                                        };
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                        Function1 function12 = (Function1) objRememberedValue;
                                        composerStartRestartGroup.endReplaceableGroup();
                                        composerStartRestartGroup.startReplaceableGroup(1269869831);
                                        if (i42 != 4) {
                                        }
                                        if (i23 != 1048576) {
                                        }
                                        if (i24 != 256) {
                                        }
                                        if (i25 != 2048) {
                                        }
                                        if (i26 != 8388608) {
                                        }
                                        zChangedInstance2 = composerStartRestartGroup.changedInstance(view2);
                                        if (i41 != 4) {
                                        }
                                        if (i27 <= i28) {
                                        }
                                        function03 = function02;
                                        i30 = i29;
                                        i31 = i442;
                                        if ((i31 & 24576) != i28) {
                                        }
                                        if (i33 == 131072) {
                                        }
                                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                                        if (z14 | z10 | z11 | z12 | z13 | zChangedInstance2 | z15 | z16 | z17) {
                                        }
                                    }
                                } else {
                                    composerStartRestartGroup.skipToGroupEnd();
                                    if ((i5 & 16) != 0) {
                                        i6 &= -57345;
                                    }
                                    modifier2 = modifier;
                                    helperLabelType2 = helperLabelType;
                                    i18 = i;
                                    jM3185getUnspecified0d7_KjU = j;
                                    num2 = num;
                                    view2 = view;
                                    textAlign2 = textAlign;
                                    i19 = i11;
                                    underlineStyle3 = underlineStyle2;
                                }
                                composerStartRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                composerStartRestartGroup.startReplaceableGroup(1269822440);
                                int i372 = i6 & FaceDetector.NUM_BOXES;
                                if (i372 == 256) {
                                }
                                int i382 = i6 & 7168;
                                if (i382 == 2048) {
                                }
                                modifier3 = modifier2;
                                int i392 = i6 & 3670016;
                                if (i392 == 1048576) {
                                }
                                int i402 = i6 & 29360128;
                                if (i402 == 8388608) {
                                }
                                zChangedInstance = composerStartRestartGroup.changedInstance(view2);
                                int i412 = i16 & 14;
                                if (i412 == 4) {
                                }
                                int i422 = i6 & 14;
                                if (i422 == 4) {
                                }
                                i20 = (i6 & 57344) ^ 24576;
                                final TextAlign textAlign42 = textAlign2;
                                if (i20 <= 16384) {
                                    i21 = i20;
                                    if ((i6 & 24576) != 16384) {
                                        z7 = true;
                                    }
                                    int i4322 = 458752 & i6;
                                    i22 = i18;
                                    if (i4322 == 131072) {
                                    }
                                    int i4422 = i6;
                                    if ((i6 & 1879048192) == 536870912) {
                                    }
                                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                                    if (z9 | z7 | z6 | z4 | z3 | z | z2 | zChangedInstance | z5 | z8) {
                                    }
                                }
                            } else {
                                composerStartRestartGroup.skipToGroupEnd();
                                modifier3 = modifier;
                                helperLabelType3 = helperLabelType;
                                i35 = i;
                                j2 = j;
                                num3 = num;
                                view3 = view;
                                textAlign3 = textAlign;
                                i34 = i11;
                                underlineStyle4 = underlineStyle2;
                                function04 = function0;
                            }
                            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup != null) {
                                final Modifier modifier4 = modifier3;
                                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: o.wWt
                                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                    @Override // kotlin.jvm.functions.Function2
                                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                        return C52743wWs.KWHzl(str, modifier4, helperLabelType3, underlineStyle4, i35, j2, i34, num3, view3, textAlign3, function04, i3, i4, i5, (Composer) obj, ((java.lang.Integer) obj2).intValue());
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        i17 = i4 | (composerStartRestartGroup.changedInstance(function0) ? 4 : 2);
                    }
                    i16 = i17;
                    if ((i6 & 306783379) != 306783378) {
                        composerStartRestartGroup.startDefaults();
                        if ((i3 & 1) != 0) {
                            if (i36 == 0) {
                            }
                            if (i7 == 0) {
                            }
                            if (i8 == 0) {
                            }
                            if ((i5 & 16) == 0) {
                            }
                            if (i9 == 0) {
                            }
                            if (i10 == 0) {
                            }
                            if (i12 == 0) {
                            }
                            if (i13 == 0) {
                            }
                            if (i14 == 0) {
                            }
                            function02 = i15 == 0 ? function0 : null;
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            composerStartRestartGroup.startReplaceableGroup(1269822440);
                            int i3722 = i6 & FaceDetector.NUM_BOXES;
                            if (i3722 == 256) {
                            }
                            int i3822 = i6 & 7168;
                            if (i3822 == 2048) {
                            }
                            modifier3 = modifier2;
                            int i3922 = i6 & 3670016;
                            if (i3922 == 1048576) {
                            }
                            int i4022 = i6 & 29360128;
                            if (i4022 == 8388608) {
                            }
                            zChangedInstance = composerStartRestartGroup.changedInstance(view2);
                            int i4122 = i16 & 14;
                            if (i4122 == 4) {
                            }
                            int i4222 = i6 & 14;
                            if (i4222 == 4) {
                            }
                            i20 = (i6 & 57344) ^ 24576;
                            final TextAlign textAlign422 = textAlign2;
                            if (i20 <= 16384) {
                            }
                        }
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                underlineStyle2 = underlineStyle;
                if ((i3 & 24576) == 0) {
                }
                i9 = i5 & 32;
                if (i9 == 0) {
                }
                i10 = i5 & 64;
                if (i10 == 0) {
                }
                i12 = i5 & 128;
                if (i12 == 0) {
                }
                i13 = i5 & 256;
                if (i13 == 0) {
                }
                i14 = i5 & 512;
                if (i14 == 0) {
                }
                i15 = i5 & 1024;
                if (i15 == 0) {
                }
                i16 = i17;
                if ((i6 & 306783379) != 306783378) {
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            i8 = i5 & 8;
            if (i8 != 0) {
            }
            underlineStyle2 = underlineStyle;
            if ((i3 & 24576) == 0) {
            }
            i9 = i5 & 32;
            if (i9 == 0) {
            }
            i10 = i5 & 64;
            if (i10 == 0) {
            }
            i12 = i5 & 128;
            if (i12 == 0) {
            }
            i13 = i5 & 256;
            if (i13 == 0) {
            }
            i14 = i5 & 512;
            if (i14 == 0) {
            }
            i15 = i5 & 1024;
            if (i15 == 0) {
            }
            i16 = i17;
            if ((i6 & 306783379) != 306783378) {
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        i7 = i5 & 4;
        if (i7 == 0) {
        }
        i8 = i5 & 8;
        if (i8 != 0) {
        }
        underlineStyle2 = underlineStyle;
        if ((i3 & 24576) == 0) {
        }
        i9 = i5 & 32;
        if (i9 == 0) {
        }
        i10 = i5 & 64;
        if (i10 == 0) {
        }
        i12 = i5 & 128;
        if (i12 == 0) {
        }
        i13 = i5 & 256;
        if (i13 == 0) {
        }
        i14 = i5 & 512;
        if (i14 == 0) {
        }
        i15 = i5 & 1024;
        if (i15 == 0) {
        }
        i16 = i17;
        if ((i6 & 306783379) != 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    public static final C55258xgZ EZpvd(HelperLabelType helperLabelType, UnderlineStyle underlineStyle, int i, java.lang.Integer num, android.view.View view, final Function0 function0, java.lang.String str, int i2, long j, TextAlign textAlign, android.content.Context context) {
        C55320xhi c55320xhiKWHzl;
        C55320xhi c55320xhiKWHzl2;
        Intrinsics.checkNotNullParameter(context, "");
        C55258xgZ c55258xgZ = new C55258xgZ(context, null, 0, 6, null);
        c55258xgZ.setHelperLabelType(helperLabelType.getValue());
        c55258xgZ.setUnderlineStyle(underlineStyle.getValue());
        c55258xgZ.setMaxLines(i);
        if (num != null) {
            c55258xgZ.setAttachmentViewId(num.intValue());
        }
        if (view != null) {
            c55258xgZ.setAttachingView(view);
        }
        if (function0 != null) {
            c55258xgZ.setClickAction(new View.OnClickListener() { // from class: o.wWx
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view2) {
                    C52743wWs.copydefault(function0, view2);
                }
            });
        }
        c55258xgZ.setTextValue(str);
        c55258xgZ.setTextAppearance(i2);
        if (!Color.m3150equalsimpl0(j, Color.Companion.m3185getUnspecified0d7_KjU())) {
            c55258xgZ.setTextColor(ColorKt.m3203toArgb8_81llA(j));
            C55312xha c55312xhaValueOf = c55258xgZ.valueOf();
            if (c55312xhaValueOf != null && (c55320xhiKWHzl2 = c55312xhaValueOf.KWHzl()) != null) {
                c55320xhiKWHzl2.setUnderlineColor(ColorKt.m3203toArgb8_81llA(j));
            }
        }
        if (textAlign != null) {
            int iM5285unboximpl = textAlign.m5285unboximpl();
            C55312xha c55312xhaValueOf2 = c55258xgZ.valueOf();
            if (c55312xhaValueOf2 != null && (c55320xhiKWHzl = c55312xhaValueOf2.KWHzl()) != null) {
                c55320xhiKWHzl.setTextAlignment(TextAlign.m5282equalsimpl0(iM5285unboximpl, TextAlign.Companion.m5291getStarte0LSkKk()) ? 5 : 6);
            }
        }
        return c55258xgZ;
    }

    public static final void copydefault(Function0 function0, android.view.View view) {
        function0.invoke();
    }

    public static final Unit KWHzl(java.lang.String str, int i, HelperLabelType helperLabelType, UnderlineStyle underlineStyle, java.lang.Integer num, android.view.View view, final Function0 function0, int i2, long j, C55258xgZ c55258xgZ) {
        Intrinsics.checkNotNullParameter(c55258xgZ, "");
        c55258xgZ.setTextValue(str);
        c55258xgZ.setMaxLines(i);
        c55258xgZ.setHelperLabelType(helperLabelType.getValue());
        c55258xgZ.setUnderlineStyle(underlineStyle.getValue());
        if (num != null) {
            c55258xgZ.setAttachmentViewId(num.intValue());
        }
        if (view != null) {
            c55258xgZ.setAttachingView(view);
        }
        if (function0 != null) {
            c55258xgZ.setClickAction(new View.OnClickListener() { // from class: o.wWu
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view2) {
                    C52743wWs.OLrzqt(function0, view2);
                }
            });
        }
        c55258xgZ.setTextAppearance(i2);
        if (!Color.m3150equalsimpl0(j, Color.Companion.m3185getUnspecified0d7_KjU())) {
            c55258xgZ.setTextColor(ColorKt.m3203toArgb8_81llA(j));
        }
        return Unit.INSTANCE;
    }

    public static final void OLrzqt(Function0 function0, android.view.View view) {
        function0.invoke();
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:120:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x011f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AEQbTJ(@NotNull final java.lang.String str, Modifier modifier, UnderlineStyle underlineStyle, @androidx.annotation.StyleRes int i, long j, int i2, Function0<Unit> function0, Composer composer, final int i3, final int i4) {
        int i5;
        int i6;
        UnderlineStyle underlineStyle2;
        int i7;
        int i8;
        long jM3185getUnspecified0d7_KjU;
        int i9;
        int i10;
        int i11;
        Function0<Unit> function02;
        Modifier modifier2;
        Composer composer2;
        final Modifier modifier3;
        final UnderlineStyle underlineStyle3;
        final int i12;
        final long j2;
        final int i13;
        final Function0<Unit> function03;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(str, "");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1083404171);
        if ((i4 & 1) != 0) {
            i5 = i3 | 6;
        } else if ((i3 & 6) == 0) {
            i5 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i3;
        } else {
            i5 = i3;
        }
        int i14 = i4 & 2;
        if (i14 != 0) {
            i5 |= 48;
        } else {
            if ((i3 & 48) == 0) {
                i5 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
            }
            i6 = i4 & 4;
            if (i6 == 0) {
                i5 |= MLKEMEngine.KyberPolyBytes;
            } else {
                if ((i3 & MLKEMEngine.KyberPolyBytes) == 0) {
                    underlineStyle2 = underlineStyle;
                    i5 |= composerStartRestartGroup.changed(underlineStyle2) ? 256 : 128;
                }
                if ((i3 & 3072) == 0) {
                    if ((i4 & 8) == 0) {
                        i7 = i;
                        int i15 = composerStartRestartGroup.changed(i7) ? 2048 : 1024;
                        i5 |= i15;
                    } else {
                        i7 = i;
                    }
                    i5 |= i15;
                } else {
                    i7 = i;
                }
                i8 = i4 & 16;
                if (i8 != 0) {
                    i5 |= 24576;
                } else {
                    if ((i3 & 24576) == 0) {
                        jM3185getUnspecified0d7_KjU = j;
                        i5 |= composerStartRestartGroup.changed(jM3185getUnspecified0d7_KjU) ? 16384 : 8192;
                    }
                    i9 = i4 & 32;
                    if (i9 != 0) {
                        if ((196608 & i3) == 0) {
                            i10 = i2;
                            i5 |= composerStartRestartGroup.changed(i10) ? 131072 : 65536;
                        }
                        i11 = i4 & 64;
                        if (i11 != 0) {
                            i5 |= 1572864;
                        } else if ((i3 & 1572864) == 0) {
                            i5 |= composerStartRestartGroup.changedInstance(function0) ? 1048576 : 524288;
                        }
                        if ((i5 & 599187) != 599186 || !composerStartRestartGroup.getSkipping()) {
                            composerStartRestartGroup.startDefaults();
                            if ((i3 & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                                Modifier modifier4 = i14 == 0 ? Modifier.Companion : modifier;
                                if (i6 != 0) {
                                    underlineStyle2 = UnderlineStyle.Dotted;
                                }
                                if ((i4 & 8) != 0) {
                                    i5 &= -7169;
                                    i7 = C52761wXj.LoaderManager.zuBGHE;
                                }
                                if (i8 != 0) {
                                    jM3185getUnspecified0d7_KjU = Color.Companion.m3185getUnspecified0d7_KjU();
                                }
                                if (i9 != 0) {
                                    i10 = Integer.MAX_VALUE;
                                }
                                if (i11 == 0) {
                                    modifier2 = modifier4;
                                    function02 = null;
                                } else {
                                    function02 = function0;
                                    modifier2 = modifier4;
                                }
                            } else {
                                composerStartRestartGroup.skipToGroupEnd();
                                if ((i4 & 8) != 0) {
                                    i5 &= -7169;
                                }
                                modifier2 = modifier;
                                function02 = function0;
                            }
                            UnderlineStyle underlineStyle4 = underlineStyle2;
                            int i16 = i7;
                            long j3 = jM3185getUnspecified0d7_KjU;
                            int i17 = i10;
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1083404171, i5, -1, "com.okinc.tradingbot.impl.widget.compose.OKHelperLabelUnderlined (OKHelperLabel.kt:140)");
                            }
                            int i18 = i5 << 3;
                            composer2 = composerStartRestartGroup;
                            OLrzqt(str, modifier2, HelperLabelType.Underlined, underlineStyle4, i16, j3, i17, null, null, null, function02, composerStartRestartGroup, (i5 & 14) | MLKEMEngine.KyberPolyBytes | (i5 & WalletImportError.ERROR_CODE_AA_EXIST) | (i18 & 7168) | (57344 & i18) | (458752 & i18) | (i18 & 3670016), (i5 >> 18) & 14, FaceDetector.NUM_BOXES);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier3 = modifier2;
                            underlineStyle3 = underlineStyle4;
                            i12 = i16;
                            j2 = j3;
                            i13 = i17;
                            function03 = function02;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            modifier3 = modifier;
                            underlineStyle3 = underlineStyle2;
                            i12 = i7;
                            j2 = jM3185getUnspecified0d7_KjU;
                            i13 = i10;
                            composer2 = composerStartRestartGroup;
                            function03 = function0;
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: o.wWw
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                @Override // kotlin.jvm.functions.Function2
                                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                    return C52743wWs.OLrzqt(str, modifier3, underlineStyle3, i12, j2, i13, function03, i3, i4, (Composer) obj, ((java.lang.Integer) obj2).intValue());
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i5 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    i10 = i2;
                    i11 = i4 & 64;
                    if (i11 != 0) {
                    }
                    if ((i5 & 599187) != 599186) {
                        composerStartRestartGroup.startDefaults();
                        if ((i3 & 1) != 0) {
                            if (i14 == 0) {
                            }
                            if (i6 != 0) {
                            }
                            if ((i4 & 8) != 0) {
                            }
                            if (i8 != 0) {
                            }
                            if (i9 != 0) {
                            }
                            if (i11 == 0) {
                            }
                            UnderlineStyle underlineStyle42 = underlineStyle2;
                            int i162 = i7;
                            long j32 = jM3185getUnspecified0d7_KjU;
                            int i172 = i10;
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            int i182 = i5 << 3;
                            composer2 = composerStartRestartGroup;
                            OLrzqt(str, modifier2, HelperLabelType.Underlined, underlineStyle42, i162, j32, i172, null, null, null, function02, composerStartRestartGroup, (i5 & 14) | MLKEMEngine.KyberPolyBytes | (i5 & WalletImportError.ERROR_CODE_AA_EXIST) | (i182 & 7168) | (57344 & i182) | (458752 & i182) | (i182 & 3670016), (i5 >> 18) & 14, FaceDetector.NUM_BOXES);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            modifier3 = modifier2;
                            underlineStyle3 = underlineStyle42;
                            i12 = i162;
                            j2 = j32;
                            i13 = i172;
                            function03 = function02;
                        }
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                jM3185getUnspecified0d7_KjU = j;
                i9 = i4 & 32;
                if (i9 != 0) {
                }
                i10 = i2;
                i11 = i4 & 64;
                if (i11 != 0) {
                }
                if ((i5 & 599187) != 599186) {
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            underlineStyle2 = underlineStyle;
            if ((i3 & 3072) == 0) {
            }
            i8 = i4 & 16;
            if (i8 != 0) {
            }
            jM3185getUnspecified0d7_KjU = j;
            i9 = i4 & 32;
            if (i9 != 0) {
            }
            i10 = i2;
            i11 = i4 & 64;
            if (i11 != 0) {
            }
            if ((i5 & 599187) != 599186) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        i6 = i4 & 4;
        if (i6 == 0) {
        }
        underlineStyle2 = underlineStyle;
        if ((i3 & 3072) == 0) {
        }
        i8 = i4 & 16;
        if (i8 != 0) {
        }
        jM3185getUnspecified0d7_KjU = j;
        i9 = i4 & 32;
        if (i9 != 0) {
        }
        i10 = i2;
        i11 = i4 & 64;
        if (i11 != 0) {
        }
        if ((i5 & 599187) != 599186) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }
}
