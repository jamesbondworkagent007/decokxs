package o;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.viewinterop.AndroidView_androidKt;
import androidx.core.graphics.Insets;
import androidx.profileinstaller.ProfileVerifier;
import com.amplifyframework.ui.liveness.ml.FaceDetector;
import com.google.api.client.googleapis.media.MediaHttpDownloader;
import com.okinc.business.defi.biz.core.error.WalletImportError;
import com.okinc.tradingbot.impl.common.model.TextColor;
import com.okinc.tradingbot.impl.share.ShareChartDataPoint;
import com.okinc.uilab.okinteractivelinechart.OKVerticalSeparatorView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import o.C55159xeg;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import org.jetbrains.annotations.NotNull;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: loaded from: classes11.dex */
public final class wVO {
    public static final boolean KWHzl() {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final Unit OLrzqt(Modifier modifier, java.util.List list, TextColor textColor, java.lang.Float f, java.lang.Float f2, java.lang.Float f3, java.lang.Float f4, Function0 function0, C55159xeg.StateListAnimator stateListAnimator, C55159xeg.StateListAnimator stateListAnimator2, OKVerticalSeparatorView.LineStyle lineStyle, Insets insets, boolean z, int i, int i2, int i3, Composer composer, int i4) {
        KWHzl(modifier, list, textColor, f, f2, f3, f4, function0, stateListAnimator, stateListAnimator2, lineStyle, insets, z, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0147 A[PHI: r27
  0x0147: PHI (r27v13 int) = (r27v12 int), (r27v34 int), (r27v35 int) binds: [B:99:0x012a, B:109:0x0145, B:108:0x0142] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:113:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0301  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0308  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x030b  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0330  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x0378  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x038f  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x03b9  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x03d5  */
    /* JADX WARN: Removed duplicated region for block: B:272:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0124 A[PHI: r27
  0x0124: PHI (r27v11 int) = (r27v10 int), (r27v42 int), (r27v43 int) binds: [B:86:0x0107, B:96:0x0122, B:95:0x011f] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void KWHzl(Modifier modifier, @NotNull final java.util.List<ShareChartDataPoint> list, @NotNull final TextColor textColor, java.lang.Float f, java.lang.Float f2, java.lang.Float f3, java.lang.Float f4, Function0<java.lang.Boolean> function0, C55159xeg.StateListAnimator stateListAnimator, C55159xeg.StateListAnimator stateListAnimator2, OKVerticalSeparatorView.LineStyle lineStyle, Insets insets, boolean z, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        java.lang.Float f5;
        java.lang.Float f6;
        java.lang.Float f7;
        java.lang.Float f8;
        Function0<java.lang.Boolean> function02;
        C55159xeg.StateListAnimator stateListAnimator3;
        boolean z2;
        boolean z3;
        java.lang.Object objRememberedValue;
        final wVK wvk;
        boolean z4;
        boolean zChanged;
        boolean z5;
        boolean zChangedInstance;
        Function0<java.lang.Boolean> function03;
        boolean z6;
        boolean z7;
        boolean z8;
        final OKVerticalSeparatorView.LineStyle lineStyle2;
        boolean z9;
        final Insets insets2;
        boolean z10;
        C55159xeg.StateListAnimator stateListAnimator4;
        boolean z11;
        boolean z12;
        java.lang.Object objRememberedValue2;
        int i15;
        final C55159xeg.StateListAnimator stateListAnimator5;
        Function0<java.lang.Boolean> function04;
        Composer composer2;
        C55159xeg.StateListAnimator stateListAnimator6;
        final wVK wvk2;
        boolean zChanged2;
        boolean zChangedInstance2;
        boolean z13;
        java.lang.Object objRememberedValue3;
        final Function0<java.lang.Boolean> function05;
        final OKVerticalSeparatorView.LineStyle lineStyle3;
        final Function0<java.lang.Boolean> function06;
        final Modifier modifier2;
        final java.lang.Float f9;
        final C55159xeg.StateListAnimator stateListAnimator7;
        final java.lang.Float f10;
        final Insets insets3;
        final C55159xeg.StateListAnimator stateListAnimator8;
        final java.lang.Float f11;
        final boolean z14;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(textColor, "");
        Composer composerStartRestartGroup = composer.startRestartGroup(1742228151);
        int i16 = i3 & 1;
        if (i16 != 0) {
            i4 = i | 6;
        } else if ((i & 6) == 0) {
            i4 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i & 48) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(list) ? 32 : 16;
        }
        if ((i3 & 4) != 0) {
            i4 |= MLKEMEngine.KyberPolyBytes;
        } else if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i4 |= composerStartRestartGroup.changed(textColor) ? 256 : 128;
        }
        int i17 = i3 & 8;
        if (i17 != 0) {
            i4 |= 3072;
        } else {
            if ((i & 3072) == 0) {
                i4 |= composerStartRestartGroup.changed(f) ? 2048 : 1024;
            }
            i5 = i3 & 16;
            if (i5 == 0) {
                i4 |= 24576;
            } else {
                if ((i & 24576) == 0) {
                    i4 |= composerStartRestartGroup.changed(f2) ? 16384 : 8192;
                }
                i6 = i3 & 32;
                if (i6 != 0) {
                    i4 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                    i4 |= composerStartRestartGroup.changed(f3) ? 131072 : 65536;
                }
                i7 = i3 & 64;
                if (i7 != 0) {
                    i4 |= 1572864;
                } else if ((i & 1572864) == 0) {
                    i4 |= composerStartRestartGroup.changed(f4) ? 1048576 : 524288;
                }
                i8 = i3 & 128;
                if (i8 != 0) {
                    i4 |= 12582912;
                } else if ((i & 12582912) == 0) {
                    i4 |= composerStartRestartGroup.changedInstance(function0) ? 8388608 : 4194304;
                }
                i9 = i3 & 256;
                int i18 = 100663296;
                if (i9 != 0) {
                    i4 |= i18;
                } else if ((i & 100663296) == 0) {
                    i18 = (i & 134217728) == 0 ? composerStartRestartGroup.changed(stateListAnimator) : composerStartRestartGroup.changedInstance(stateListAnimator) ? 67108864 : MediaHttpDownloader.MAXIMUM_CHUNK_SIZE;
                    i4 |= i18;
                }
                i10 = i3 & 512;
                int i19 = com.google.android.exoplayer2.C.ENCODING_PCM_32BIT;
                if (i10 != 0) {
                    i4 |= i19;
                } else if ((i & com.google.android.exoplayer2.C.ENCODING_PCM_32BIT) == 0) {
                    i19 = (i & 1073741824) == 0 ? composerStartRestartGroup.changed(stateListAnimator2) : composerStartRestartGroup.changedInstance(stateListAnimator2) ? 536870912 : 268435456;
                    i4 |= i19;
                }
                i11 = i3 & 1024;
                if (i11 != 0) {
                    i12 = i2 | 6;
                } else if ((i2 & 6) == 0) {
                    i12 = i2 | (composerStartRestartGroup.changed(lineStyle) ? 4 : 2);
                } else {
                    i12 = i2;
                }
                i13 = i3 & 2048;
                if (i13 != 0) {
                    i12 |= 48;
                } else if ((i2 & 48) == 0) {
                    i12 |= composerStartRestartGroup.changedInstance(insets) ? 32 : 16;
                }
                int i20 = i12;
                i14 = i3 & 4096;
                if (i14 == 0) {
                    if ((i2 & MLKEMEngine.KyberPolyBytes) == 0) {
                        i20 |= composerStartRestartGroup.changed(z) ? 256 : 128;
                    }
                    if ((i4 & 306783379) == 306783378 || (i20 & CipherSuite.TLS_RSA_PSK_WITH_3DES_EDE_CBC_SHA) != 146 || !composerStartRestartGroup.getSkipping()) {
                        Modifier modifier3 = i16 == 0 ? Modifier.Companion : modifier;
                        f5 = i17 == 0 ? null : f;
                        f6 = i5 == 0 ? null : f2;
                        f7 = i6 == 0 ? null : f3;
                        f8 = i7 == 0 ? null : f4;
                        if (i8 == 0) {
                            composerStartRestartGroup.startReplaceableGroup(-1717667803);
                            java.lang.Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue4 == Composer.Companion.getEmpty()) {
                                objRememberedValue4 = new Function0() { // from class: o.wVL
                                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                    @Override // kotlin.jvm.functions.Function0
                                    public final java.lang.Object invoke() {
                                        return java.lang.Boolean.valueOf(wVO.KWHzl());
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            function02 = (Function0) objRememberedValue4;
                        } else {
                            function02 = function0;
                        }
                        C55159xeg.StateListAnimator stateListAnimator9 = i9 == 0 ? null : stateListAnimator;
                        stateListAnimator3 = i10 == 0 ? null : stateListAnimator2;
                        OKVerticalSeparatorView.LineStyle lineStyle4 = i11 == 0 ? null : lineStyle;
                        Insets insets4 = i13 == 0 ? null : insets;
                        z2 = i14 == 0 ? true : z;
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1742228151, i4, i20, "com.okinc.tradingbot.impl.widget.compose.ChartView (ChartView.kt:33)");
                        }
                        composerStartRestartGroup.startReplaceableGroup(-1717657524);
                        int i21 = i4 & FaceDetector.NUM_BOXES;
                        z3 = i21 != 256;
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (!z3 || objRememberedValue == Composer.Companion.getEmpty()) {
                            objRememberedValue = new wVK(textColor instanceof TextColor.Up);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        wvk = (wVK) objRememberedValue;
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.startReplaceableGroup(-1717651514);
                        z4 = i21 != 256;
                        zChanged = composerStartRestartGroup.changed(wvk);
                        z5 = (i20 & FaceDetector.NUM_BOXES) != 256;
                        zChangedInstance = composerStartRestartGroup.changedInstance(insets4);
                        function03 = function02;
                        z6 = (i4 & 7168) != 2048;
                        z7 = (57344 & i4) != 16384;
                        z8 = (458752 & i4) != 131072;
                        lineStyle2 = lineStyle4;
                        z9 = (3670016 & i4) != 1048576;
                        insets2 = insets4;
                        z10 = (234881024 & i4) != 67108864 || ((134217728 & i4) != 0 && composerStartRestartGroup.changedInstance(stateListAnimator9));
                        stateListAnimator4 = stateListAnimator9;
                        z11 = (1879048192 & i4) != 536870912 || ((1073741824 & i4) != 0 && composerStartRestartGroup.changedInstance(stateListAnimator3));
                        z12 = (i20 & 14) != 4;
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if ((!(z9 | z8 | z4 | zChanged | z5 | zChangedInstance | z6 | z7 | z10 | z11) && !z12) || objRememberedValue2 == Composer.Companion.getEmpty()) {
                            final boolean z15 = z2;
                            i15 = i4;
                            final java.lang.Float f12 = f5;
                            final java.lang.Float f13 = f6;
                            final java.lang.Float f14 = f7;
                            final java.lang.Float f15 = f8;
                            stateListAnimator5 = stateListAnimator4;
                            function04 = function03;
                            composer2 = composerStartRestartGroup;
                            final C55159xeg.StateListAnimator stateListAnimator10 = stateListAnimator3;
                            stateListAnimator6 = stateListAnimator3;
                            wvk2 = wvk;
                            objRememberedValue2 = new Function1() { // from class: o.wVN
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                @Override // kotlin.jvm.functions.Function1
                                public final java.lang.Object invoke(java.lang.Object obj) {
                                    return wVO.AEQbTJ(textColor, wvk, z15, insets2, f12, f13, f14, f15, stateListAnimator5, stateListAnimator10, lineStyle2, (android.content.Context) obj);
                                }
                            };
                            composer2.updateRememberedValue(objRememberedValue2);
                        } else {
                            function04 = function03;
                            i15 = i4;
                            composer2 = composerStartRestartGroup;
                            stateListAnimator5 = stateListAnimator4;
                            stateListAnimator6 = stateListAnimator3;
                            wvk2 = wvk;
                        }
                        Function1 function1 = (Function1) objRememberedValue2;
                        composer2.endReplaceableGroup();
                        composer2.startReplaceableGroup(-1717606720);
                        zChanged2 = composer2.changed(wvk2);
                        zChangedInstance2 = composer2.changedInstance(list);
                        z13 = (29360128 & i15) == 8388608;
                        objRememberedValue3 = composer2.rememberedValue();
                        if ((!(zChanged2 | zChangedInstance2) && !z13) || objRememberedValue3 == Composer.Companion.getEmpty()) {
                            function05 = function04;
                            objRememberedValue3 = new Function1() { // from class: o.wVT
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                @Override // kotlin.jvm.functions.Function1
                                public final java.lang.Object invoke(java.lang.Object obj) {
                                    return wVO.EZpvd(wvk2, list, function05, (C55159xeg) obj);
                                }
                            };
                            composer2.updateRememberedValue(objRememberedValue3);
                        } else {
                            function05 = function04;
                        }
                        composer2.endReplaceableGroup();
                        AndroidView_androidKt.AndroidView(function1, modifier3, (Function1) objRememberedValue3, composer2, (i15 << 3) & WalletImportError.ERROR_CODE_AA_EXIST, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        lineStyle3 = lineStyle2;
                        function06 = function05;
                        modifier2 = modifier3;
                        f9 = f5;
                        stateListAnimator7 = stateListAnimator5;
                        f10 = f7;
                        insets3 = insets2;
                        stateListAnimator8 = stateListAnimator6;
                        f11 = f8;
                        z14 = z2;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        modifier2 = modifier;
                        f9 = f;
                        f6 = f2;
                        f10 = f3;
                        f11 = f4;
                        function06 = function0;
                        stateListAnimator7 = stateListAnimator;
                        stateListAnimator8 = stateListAnimator2;
                        insets3 = insets;
                        z14 = z;
                        composer2 = composerStartRestartGroup;
                        lineStyle3 = lineStyle;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        final java.lang.Float f16 = f6;
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: o.wVR
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function2
                            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                return wVO.OLrzqt(modifier2, list, textColor, f9, f16, f10, f11, function06, stateListAnimator7, stateListAnimator8, lineStyle3, insets3, z14, i, i2, i3, (Composer) obj, ((java.lang.Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                i20 |= MLKEMEngine.KyberPolyBytes;
                if ((i4 & 306783379) == 306783378) {
                    if (i16 == 0) {
                    }
                    if (i17 == 0) {
                    }
                    if (i5 == 0) {
                    }
                    if (i6 == 0) {
                    }
                    if (i7 == 0) {
                    }
                    if (i8 == 0) {
                    }
                    if (i9 == 0) {
                    }
                    if (i10 == 0) {
                    }
                    if (i11 == 0) {
                    }
                    if (i13 == 0) {
                    }
                    if (i14 == 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    composerStartRestartGroup.startReplaceableGroup(-1717657524);
                    int i212 = i4 & FaceDetector.NUM_BOXES;
                    if (i212 != 256) {
                    }
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (!z3) {
                        objRememberedValue = new wVK(textColor instanceof TextColor.Up);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        wvk = (wVK) objRememberedValue;
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.startReplaceableGroup(-1717651514);
                        if (i212 != 256) {
                        }
                        zChanged = composerStartRestartGroup.changed(wvk);
                        if ((i20 & FaceDetector.NUM_BOXES) != 256) {
                        }
                        zChangedInstance = composerStartRestartGroup.changedInstance(insets4);
                        function03 = function02;
                        if ((i4 & 7168) != 2048) {
                        }
                        if ((57344 & i4) != 16384) {
                        }
                        if ((458752 & i4) != 131072) {
                        }
                        lineStyle2 = lineStyle4;
                        if ((3670016 & i4) != 1048576) {
                        }
                        insets2 = insets4;
                        if ((234881024 & i4) != 67108864) {
                            stateListAnimator4 = stateListAnimator9;
                            if ((1879048192 & i4) != 536870912) {
                                if ((i20 & 14) != 4) {
                                }
                                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                                if (!(z9 | z8 | z4 | zChanged | z5 | zChangedInstance | z6 | z7 | z10 | z11 | z12)) {
                                    final boolean z152 = z2;
                                    i15 = i4;
                                    final java.lang.Float f122 = f5;
                                    final java.lang.Float f132 = f6;
                                    final java.lang.Float f142 = f7;
                                    final java.lang.Float f152 = f8;
                                    stateListAnimator5 = stateListAnimator4;
                                    function04 = function03;
                                    composer2 = composerStartRestartGroup;
                                    final C55159xeg.StateListAnimator stateListAnimator102 = stateListAnimator3;
                                    stateListAnimator6 = stateListAnimator3;
                                    wvk2 = wvk;
                                    objRememberedValue2 = new Function1() { // from class: o.wVN
                                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                        @Override // kotlin.jvm.functions.Function1
                                        public final java.lang.Object invoke(java.lang.Object obj) {
                                            return wVO.AEQbTJ(textColor, wvk, z152, insets2, f122, f132, f142, f152, stateListAnimator5, stateListAnimator102, lineStyle2, (android.content.Context) obj);
                                        }
                                    };
                                    composer2.updateRememberedValue(objRememberedValue2);
                                    Function1 function12 = (Function1) objRememberedValue2;
                                    composer2.endReplaceableGroup();
                                    composer2.startReplaceableGroup(-1717606720);
                                    zChanged2 = composer2.changed(wvk2);
                                    zChangedInstance2 = composer2.changedInstance(list);
                                    if ((29360128 & i15) == 8388608) {
                                    }
                                    objRememberedValue3 = composer2.rememberedValue();
                                    if (!(zChanged2 | zChangedInstance2 | z13)) {
                                        function05 = function04;
                                        objRememberedValue3 = new Function1() { // from class: o.wVT
                                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                            @Override // kotlin.jvm.functions.Function1
                                            public final java.lang.Object invoke(java.lang.Object obj) {
                                                return wVO.EZpvd(wvk2, list, function05, (C55159xeg) obj);
                                            }
                                        };
                                        composer2.updateRememberedValue(objRememberedValue3);
                                        composer2.endReplaceableGroup();
                                        AndroidView_androidKt.AndroidView(function12, modifier3, (Function1) objRememberedValue3, composer2, (i15 << 3) & WalletImportError.ERROR_CODE_AA_EXIST, 0);
                                        if (ComposerKt.isTraceInProgress()) {
                                        }
                                        lineStyle3 = lineStyle2;
                                        function06 = function05;
                                        modifier2 = modifier3;
                                        f9 = f5;
                                        stateListAnimator7 = stateListAnimator5;
                                        f10 = f7;
                                        insets3 = insets2;
                                        stateListAnimator8 = stateListAnimator6;
                                        f11 = f8;
                                        z14 = z2;
                                    }
                                }
                            }
                        }
                    }
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            i6 = i3 & 32;
            if (i6 != 0) {
            }
            i7 = i3 & 64;
            if (i7 != 0) {
            }
            i8 = i3 & 128;
            if (i8 != 0) {
            }
            i9 = i3 & 256;
            int i182 = 100663296;
            if (i9 != 0) {
            }
            i10 = i3 & 512;
            int i192 = com.google.android.exoplayer2.C.ENCODING_PCM_32BIT;
            if (i10 != 0) {
            }
            i11 = i3 & 1024;
            if (i11 != 0) {
            }
            i13 = i3 & 2048;
            if (i13 != 0) {
            }
            int i202 = i12;
            i14 = i3 & 4096;
            if (i14 == 0) {
            }
            if ((i4 & 306783379) == 306783378) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        i5 = i3 & 16;
        if (i5 == 0) {
        }
        i6 = i3 & 32;
        if (i6 != 0) {
        }
        i7 = i3 & 64;
        if (i7 != 0) {
        }
        i8 = i3 & 128;
        if (i8 != 0) {
        }
        i9 = i3 & 256;
        int i1822 = 100663296;
        if (i9 != 0) {
        }
        i10 = i3 & 512;
        int i1922 = com.google.android.exoplayer2.C.ENCODING_PCM_32BIT;
        if (i10 != 0) {
        }
        i11 = i3 & 1024;
        if (i11 != 0) {
        }
        i13 = i3 & 2048;
        if (i13 != 0) {
        }
        int i2022 = i12;
        i14 = i3 & 4096;
        if (i14 == 0) {
        }
        if ((i4 & 306783379) == 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    public static final C55159xeg AEQbTJ(TextColor textColor, wVK wvk, boolean z, Insets insets, java.lang.Float f, java.lang.Float f2, java.lang.Float f3, java.lang.Float f4, C55159xeg.StateListAnimator stateListAnimator, C55159xeg.StateListAnimator stateListAnimator2, OKVerticalSeparatorView.LineStyle lineStyle, android.content.Context context) {
        int iTradeFallGraph$default;
        int i;
        Intrinsics.checkNotNullParameter(context, "");
        C55159xeg c55159xeg = new C55159xeg(context, null, 0, 6, null);
        if (textColor instanceof TextColor.Zero) {
            int i2 = C52761wXj.Activity.fdOvFl;
            android.content.Context context2 = c55159xeg.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            int iOLrzqt = C33070mpX.OLrzqt(i2, context2);
            int i3 = C52761wXj.Activity.fdOvFl;
            android.content.Context context3 = c55159xeg.getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "");
            iTradeFallGraph$default = C33070mpX.OLrzqt(i3, context3);
            i = iOLrzqt;
        } else {
            C33512mxp c33512mxp = C33512mxp.AEQbTJ;
            android.content.Context context4 = c55159xeg.getContext();
            Intrinsics.checkNotNullExpressionValue(context4, "");
            int iTradeRiseGraph$default = C33512mxp.tradeRiseGraph$default(c33512mxp, context4, 0.0f, 2, null);
            android.content.Context context5 = c55159xeg.getContext();
            Intrinsics.checkNotNullExpressionValue(context5, "");
            iTradeFallGraph$default = C33512mxp.tradeFallGraph$default(c33512mxp, context5, 0.0f, 2, null);
            i = iTradeRiseGraph$default;
        }
        C53697wqQ.copydefault.copydefault(c55159xeg, wvk, z, insets, f, f2, i, iTradeFallGraph$default, f3, f4, stateListAnimator, stateListAnimator2, lineStyle);
        c55159xeg.setClipChildren(false);
        c55159xeg.setClipToPadding(false);
        return c55159xeg;
    }

    public static final Unit EZpvd(wVK wvk, java.util.List list, Function0 function0, C55159xeg c55159xeg) {
        Intrinsics.checkNotNullParameter(c55159xeg, "");
        android.view.ViewParent parent = c55159xeg.getParent();
        android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.setClipChildren(false);
            viewGroup.setClipToPadding(false);
        }
        wvk.EZpvd((java.util.List<ShareChartDataPoint>) list, !((java.lang.Boolean) function0.invoke()).booleanValue());
        return Unit.INSTANCE;
    }
}
