package o;

import androidx.compose.animation.AnimationModifierKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.viewinterop.AndroidView_androidKt;
import androidx.profileinstaller.ProfileVerifier;
import com.amplifyframework.ui.liveness.ml.FaceDetector;
import com.google.api.client.googleapis.media.MediaHttpDownloader;
import com.immomo.mls.fun.constants.TextAlign;
import com.okinc.business.defi.biz.core.error.WalletImportError;
import com.okinc.tradingbot.impl.widget.compose.InputFieldKt$InputField$1$1;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.C52761wXj;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wWd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C52728wWd {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final Unit OLrzqt(Modifier modifier, java.lang.String str, Function1 function1, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i, java.lang.String str5, int i2, java.lang.Integer num, int i3, int i4, int i5, int i6, Composer composer, int i7) {
        copydefault(modifier, str, function1, str2, str3, str4, i, str5, i2, num, i3, composer, RecomposeScopeImplKt.updateChangedFlags(i4 | 1), RecomposeScopeImplKt.updateChangedFlags(i5), i6);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0168 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:119:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0321  */
    /* JADX WARN: Removed duplicated region for block: B:218:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0120  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void copydefault(Modifier modifier, java.lang.String str, @NotNull final Function1<? super java.lang.String, Unit> function1, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i, java.lang.String str5, int i2, java.lang.Integer num, int i3, Composer composer, final int i4, final int i5, final int i6) {
        int i7;
        java.lang.String str6;
        int i8;
        java.lang.String str7;
        int i9;
        java.lang.String str8;
        int i10;
        int i11;
        int i12;
        java.lang.String str9;
        int i13;
        int i14;
        int i15;
        int i16;
        java.lang.String str10;
        int i17;
        final int i18;
        java.lang.Integer num2;
        final int i19;
        java.lang.String str11;
        java.lang.Object objRememberedValue;
        Composer.Companion companion;
        final C55008xbo c55008xbo;
        boolean z;
        boolean zChangedInstance;
        java.lang.Object objRememberedValue2;
        boolean zChangedInstance2;
        boolean z2;
        boolean z3;
        java.lang.Object objRememberedValue3;
        boolean z4;
        boolean z5;
        boolean z6;
        int i20;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        java.lang.Object objRememberedValue4;
        final java.lang.String str12;
        final java.lang.String str13;
        final java.lang.String str14;
        final int i21;
        final java.lang.String str15;
        final int i22;
        final Modifier modifier2;
        final java.lang.Integer num3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(function1, "");
        Composer composerStartRestartGroup = composer.startRestartGroup(1197329772);
        int i23 = i6 & 1;
        if (i23 != 0) {
            i7 = i4 | 6;
        } else if ((i4 & 6) == 0) {
            i7 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i4;
        } else {
            i7 = i4;
        }
        int i24 = i6 & 2;
        if (i24 != 0) {
            i7 |= 48;
        } else {
            if ((i4 & 48) == 0) {
                str6 = str;
                i7 |= composerStartRestartGroup.changed(str6) ? 32 : 16;
            }
            if ((i6 & 4) == 0) {
                i7 |= MLKEMEngine.KyberPolyBytes;
            } else if ((i4 & MLKEMEngine.KyberPolyBytes) == 0) {
                i7 |= composerStartRestartGroup.changedInstance(function1) ? 256 : 128;
            }
            i8 = i6 & 8;
            if (i8 == 0) {
                i7 |= 3072;
            } else {
                if ((i4 & 3072) == 0) {
                    str7 = str2;
                    i7 |= composerStartRestartGroup.changed(str7) ? 2048 : 1024;
                }
                i9 = i6 & 16;
                if (i9 != 0) {
                    i7 |= 24576;
                } else {
                    if ((i4 & 24576) == 0) {
                        str8 = str3;
                        i7 |= composerStartRestartGroup.changed(str8) ? 16384 : 8192;
                    }
                    i10 = i6 & 32;
                    if (i10 == 0) {
                        i7 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    } else if ((i4 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                        i7 |= composerStartRestartGroup.changed(str4) ? 131072 : 65536;
                    }
                    i11 = i6 & 64;
                    if (i11 == 0) {
                        i7 |= 1572864;
                    } else if ((i4 & 1572864) == 0) {
                        i7 |= composerStartRestartGroup.changed(i) ? 1048576 : 524288;
                    }
                    i12 = i6 & 256;
                    if (i12 == 0) {
                        i7 |= 100663296;
                    } else {
                        if ((i4 & 100663296) == 0) {
                            str9 = "";
                            i7 |= composerStartRestartGroup.changed(i2) ? 67108864 : MediaHttpDownloader.MAXIMUM_CHUNK_SIZE;
                        }
                        i13 = i6 & 512;
                        if (i13 != 0) {
                            i7 |= com.google.android.exoplayer2.C.ENCODING_PCM_32BIT;
                        } else if ((i4 & com.google.android.exoplayer2.C.ENCODING_PCM_32BIT) == 0) {
                            i7 |= composerStartRestartGroup.changed(num) ? 536870912 : 268435456;
                        }
                        i14 = i6 & 1024;
                        if (i14 != 0) {
                            i16 = i5 | 6;
                        } else {
                            if ((i5 & 6) != 0) {
                                i15 = i5;
                                if ((i7 & 302589075) == 302589074 || (i15 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
                                    Modifier modifier3 = i23 == 0 ? Modifier.Companion : modifier;
                                    if (i24 != 0) {
                                        str6 = str9;
                                    }
                                    if (i8 != 0) {
                                        str7 = str9;
                                    }
                                    if (i9 != 0) {
                                        str8 = str9;
                                    }
                                    str10 = i10 == 0 ? null : str4;
                                    i17 = i11 == 0 ? 8 : i;
                                    java.lang.String str16 = (i6 & 128) == 0 ? null : str5;
                                    i18 = i12 == 0 ? 2 : i2;
                                    num2 = i13 == 0 ? null : num;
                                    i19 = i14 == 0 ? 40 : i3;
                                    if (ComposerKt.isTraceInProgress()) {
                                        str11 = str16;
                                    } else {
                                        str11 = str16;
                                        ComposerKt.traceEventStart(1197329772, i7, i15, "com.okinc.tradingbot.impl.widget.compose.InputField (InputField.kt:43)");
                                    }
                                    android.content.Context context = (android.content.Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                                    composerStartRestartGroup.startReplaceableGroup(73011649);
                                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                                    companion = Composer.Companion;
                                    if (objRememberedValue == companion.getEmpty()) {
                                        objRememberedValue = new C55008xbo(context, null, 0, 6, null);
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                    }
                                    c55008xbo = (C55008xbo) objRememberedValue;
                                    composerStartRestartGroup.endReplaceableGroup();
                                    composerStartRestartGroup.startReplaceableGroup(73014263);
                                    int i25 = 458752 & i7;
                                    z = i25 != 131072;
                                    zChangedInstance = composerStartRestartGroup.changedInstance(c55008xbo);
                                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                                    if (!(z | zChangedInstance) || objRememberedValue2 == companion.getEmpty()) {
                                        objRememberedValue2 = new InputFieldKt$InputField$1$1(str10, c55008xbo, null);
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                                    }
                                    composerStartRestartGroup.endReplaceableGroup();
                                    EffectsKt.LaunchedEffect(str10, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends java.lang.Object>) objRememberedValue2, composerStartRestartGroup, (i7 >> 15) & 14);
                                    Modifier modifierAnimateContentSize$default = AnimationModifierKt.animateContentSize$default(modifier3, null, null, 3, null);
                                    composerStartRestartGroup.startReplaceableGroup(73023333);
                                    zChangedInstance2 = composerStartRestartGroup.changedInstance(c55008xbo);
                                    Modifier modifier4 = modifier3;
                                    z2 = (i15 & 14) != 4;
                                    z3 = (234881024 & i7) != 67108864;
                                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                                    if (!(z2 | zChangedInstance2 | z3) || objRememberedValue3 == companion.getEmpty()) {
                                        objRememberedValue3 = new Function1() { // from class: o.wWe
                                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                            @Override // kotlin.jvm.functions.Function1
                                            public final java.lang.Object invoke(java.lang.Object obj) {
                                                return C52728wWd.EZpvd(c55008xbo, i19, i18, (android.content.Context) obj);
                                            }
                                        };
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                                    }
                                    Function1 function12 = (Function1) objRememberedValue3;
                                    composerStartRestartGroup.endReplaceableGroup();
                                    composerStartRestartGroup.startReplaceableGroup(73035583);
                                    z4 = (i7 & WalletImportError.ERROR_CODE_AA_EXIST) != 32;
                                    z5 = (1879048192 & i7) != 536870912;
                                    z6 = (i7 & 7168) != 2048;
                                    i20 = i19;
                                    z7 = (57344 & i7) != 16384;
                                    z8 = i25 != 131072;
                                    int i26 = i18;
                                    z9 = (3670016 & i7) != 1048576;
                                    z10 = (i7 & FaceDetector.NUM_BOXES) == 256;
                                    objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                                    if (!(z7 | z4 | z5 | z6 | z8 | z9 | z10) || objRememberedValue4 == companion.getEmpty()) {
                                        final java.lang.String str17 = str6;
                                        final java.lang.Integer num4 = num2;
                                        final java.lang.String str18 = str7;
                                        final java.lang.String str19 = str8;
                                        final java.lang.String str20 = str10;
                                        final int i27 = i17;
                                        objRememberedValue4 = new Function1() { // from class: o.wWh
                                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                            @Override // kotlin.jvm.functions.Function1
                                            public final java.lang.Object invoke(java.lang.Object obj) {
                                                return C52728wWd.EZpvd(str17, num4, str18, str19, str20, i27, function1, (C55008xbo) obj);
                                            }
                                        };
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                                    }
                                    composerStartRestartGroup.endReplaceableGroup();
                                    AndroidView_androidKt.AndroidView(function12, modifierAnimateContentSize$default, (Function1) objRememberedValue4, composerStartRestartGroup, 0, 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                    str12 = str11;
                                    str13 = str10;
                                    str14 = str8;
                                    i21 = i17;
                                    str15 = str7;
                                    i22 = i26;
                                    modifier2 = modifier4;
                                    num3 = num2;
                                } else {
                                    composerStartRestartGroup.skipToGroupEnd();
                                    modifier2 = modifier;
                                    str13 = str4;
                                    i21 = i;
                                    str12 = str5;
                                    i22 = i2;
                                    i20 = i3;
                                    str14 = str8;
                                    str15 = str7;
                                    num3 = num;
                                }
                                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                                if (scopeUpdateScopeEndRestartGroup == null) {
                                    final java.lang.String str21 = str6;
                                    final int i28 = i20;
                                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: o.wWi
                                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                        @Override // kotlin.jvm.functions.Function2
                                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                            return C52728wWd.OLrzqt(modifier2, str21, function1, str15, str14, str13, i21, str12, i22, num3, i28, i4, i5, i6, (Composer) obj, ((java.lang.Integer) obj2).intValue());
                                        }
                                    });
                                    return;
                                }
                                return;
                            }
                            i16 = i5 | (composerStartRestartGroup.changed(i3) ? 4 : 2);
                        }
                        i15 = i16;
                        if ((i7 & 302589075) == 302589074) {
                        }
                        if (i23 == 0) {
                        }
                        if (i24 != 0) {
                        }
                        if (i8 != 0) {
                        }
                        if (i9 != 0) {
                        }
                        if (i10 == 0) {
                        }
                        if (i11 == 0) {
                        }
                        if ((i6 & 128) == 0) {
                        }
                        if (i12 == 0) {
                        }
                        if (i13 == 0) {
                        }
                        if (i14 == 0) {
                        }
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        android.content.Context context2 = (android.content.Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                        composerStartRestartGroup.startReplaceableGroup(73011649);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        companion = Composer.Companion;
                        if (objRememberedValue == companion.getEmpty()) {
                        }
                        c55008xbo = (C55008xbo) objRememberedValue;
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.startReplaceableGroup(73014263);
                        int i252 = 458752 & i7;
                        if (i252 != 131072) {
                        }
                        zChangedInstance = composerStartRestartGroup.changedInstance(c55008xbo);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (!(z | zChangedInstance)) {
                            objRememberedValue2 = new InputFieldKt$InputField$1$1(str10, c55008xbo, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            composerStartRestartGroup.endReplaceableGroup();
                            EffectsKt.LaunchedEffect(str10, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends java.lang.Object>) objRememberedValue2, composerStartRestartGroup, (i7 >> 15) & 14);
                            Modifier modifierAnimateContentSize$default2 = AnimationModifierKt.animateContentSize$default(modifier3, null, null, 3, null);
                            composerStartRestartGroup.startReplaceableGroup(73023333);
                            zChangedInstance2 = composerStartRestartGroup.changedInstance(c55008xbo);
                            Modifier modifier42 = modifier3;
                            if ((i15 & 14) != 4) {
                            }
                            if ((234881024 & i7) != 67108864) {
                            }
                            objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                            if (!(z2 | zChangedInstance2 | z3)) {
                                objRememberedValue3 = new Function1() { // from class: o.wWe
                                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                    @Override // kotlin.jvm.functions.Function1
                                    public final java.lang.Object invoke(java.lang.Object obj) {
                                        return C52728wWd.EZpvd(c55008xbo, i19, i18, (android.content.Context) obj);
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                                Function1 function122 = (Function1) objRememberedValue3;
                                composerStartRestartGroup.endReplaceableGroup();
                                composerStartRestartGroup.startReplaceableGroup(73035583);
                                if ((i7 & WalletImportError.ERROR_CODE_AA_EXIST) != 32) {
                                }
                                if ((1879048192 & i7) != 536870912) {
                                }
                                if ((i7 & 7168) != 2048) {
                                }
                                i20 = i19;
                                if ((57344 & i7) != 16384) {
                                }
                                if (i252 != 131072) {
                                }
                                int i262 = i18;
                                if ((3670016 & i7) != 1048576) {
                                }
                                if ((i7 & FaceDetector.NUM_BOXES) == 256) {
                                }
                                objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                                if (!(z7 | z4 | z5 | z6 | z8 | z9 | z10)) {
                                    final java.lang.String str172 = str6;
                                    final java.lang.Integer num42 = num2;
                                    final java.lang.String str182 = str7;
                                    final java.lang.String str192 = str8;
                                    final java.lang.String str202 = str10;
                                    final int i272 = i17;
                                    objRememberedValue4 = new Function1() { // from class: o.wWh
                                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                        @Override // kotlin.jvm.functions.Function1
                                        public final java.lang.Object invoke(java.lang.Object obj) {
                                            return C52728wWd.EZpvd(str172, num42, str182, str192, str202, i272, function1, (C55008xbo) obj);
                                        }
                                    };
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                                    composerStartRestartGroup.endReplaceableGroup();
                                    AndroidView_androidKt.AndroidView(function122, modifierAnimateContentSize$default2, (Function1) objRememberedValue4, composerStartRestartGroup, 0, 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                    str12 = str11;
                                    str13 = str10;
                                    str14 = str8;
                                    i21 = i17;
                                    str15 = str7;
                                    i22 = i262;
                                    modifier2 = modifier42;
                                    num3 = num2;
                                }
                            }
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                        }
                    }
                    str9 = "";
                    i13 = i6 & 512;
                    if (i13 != 0) {
                    }
                    i14 = i6 & 1024;
                    if (i14 != 0) {
                    }
                    i15 = i16;
                    if ((i7 & 302589075) == 302589074) {
                    }
                    if (i23 == 0) {
                    }
                    if (i24 != 0) {
                    }
                    if (i8 != 0) {
                    }
                    if (i9 != 0) {
                    }
                    if (i10 == 0) {
                    }
                    if (i11 == 0) {
                    }
                    if ((i6 & 128) == 0) {
                    }
                    if (i12 == 0) {
                    }
                    if (i13 == 0) {
                    }
                    if (i14 == 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    android.content.Context context22 = (android.content.Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                    composerStartRestartGroup.startReplaceableGroup(73011649);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion = Composer.Companion;
                    if (objRememberedValue == companion.getEmpty()) {
                    }
                    c55008xbo = (C55008xbo) objRememberedValue;
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.startReplaceableGroup(73014263);
                    int i2522 = 458752 & i7;
                    if (i2522 != 131072) {
                    }
                    zChangedInstance = composerStartRestartGroup.changedInstance(c55008xbo);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (!(z | zChangedInstance)) {
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                    }
                }
                str8 = str3;
                i10 = i6 & 32;
                if (i10 == 0) {
                }
                i11 = i6 & 64;
                if (i11 == 0) {
                }
                i12 = i6 & 256;
                if (i12 == 0) {
                }
                str9 = "";
                i13 = i6 & 512;
                if (i13 != 0) {
                }
                i14 = i6 & 1024;
                if (i14 != 0) {
                }
                i15 = i16;
                if ((i7 & 302589075) == 302589074) {
                }
                if (i23 == 0) {
                }
                if (i24 != 0) {
                }
                if (i8 != 0) {
                }
                if (i9 != 0) {
                }
                if (i10 == 0) {
                }
                if (i11 == 0) {
                }
                if ((i6 & 128) == 0) {
                }
                if (i12 == 0) {
                }
                if (i13 == 0) {
                }
                if (i14 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                android.content.Context context222 = (android.content.Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                composerStartRestartGroup.startReplaceableGroup(73011649);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.Companion;
                if (objRememberedValue == companion.getEmpty()) {
                }
                c55008xbo = (C55008xbo) objRememberedValue;
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.startReplaceableGroup(73014263);
                int i25222 = 458752 & i7;
                if (i25222 != 131072) {
                }
                zChangedInstance = composerStartRestartGroup.changedInstance(c55008xbo);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (!(z | zChangedInstance)) {
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            str7 = str2;
            i9 = i6 & 16;
            if (i9 != 0) {
            }
            str8 = str3;
            i10 = i6 & 32;
            if (i10 == 0) {
            }
            i11 = i6 & 64;
            if (i11 == 0) {
            }
            i12 = i6 & 256;
            if (i12 == 0) {
            }
            str9 = "";
            i13 = i6 & 512;
            if (i13 != 0) {
            }
            i14 = i6 & 1024;
            if (i14 != 0) {
            }
            i15 = i16;
            if ((i7 & 302589075) == 302589074) {
            }
            if (i23 == 0) {
            }
            if (i24 != 0) {
            }
            if (i8 != 0) {
            }
            if (i9 != 0) {
            }
            if (i10 == 0) {
            }
            if (i11 == 0) {
            }
            if ((i6 & 128) == 0) {
            }
            if (i12 == 0) {
            }
            if (i13 == 0) {
            }
            if (i14 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            android.content.Context context2222 = (android.content.Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            composerStartRestartGroup.startReplaceableGroup(73011649);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            companion = Composer.Companion;
            if (objRememberedValue == companion.getEmpty()) {
            }
            c55008xbo = (C55008xbo) objRememberedValue;
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.startReplaceableGroup(73014263);
            int i252222 = 458752 & i7;
            if (i252222 != 131072) {
            }
            zChangedInstance = composerStartRestartGroup.changedInstance(c55008xbo);
            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (!(z | zChangedInstance)) {
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        str6 = str;
        if ((i6 & 4) == 0) {
        }
        i8 = i6 & 8;
        if (i8 == 0) {
        }
        str7 = str2;
        i9 = i6 & 16;
        if (i9 != 0) {
        }
        str8 = str3;
        i10 = i6 & 32;
        if (i10 == 0) {
        }
        i11 = i6 & 64;
        if (i11 == 0) {
        }
        i12 = i6 & 256;
        if (i12 == 0) {
        }
        str9 = "";
        i13 = i6 & 512;
        if (i13 != 0) {
        }
        i14 = i6 & 1024;
        if (i14 != 0) {
        }
        i15 = i16;
        if ((i7 & 302589075) == 302589074) {
        }
        if (i23 == 0) {
        }
        if (i24 != 0) {
        }
        if (i8 != 0) {
        }
        if (i9 != 0) {
        }
        if (i10 == 0) {
        }
        if (i11 == 0) {
        }
        if ((i6 & 128) == 0) {
        }
        if (i12 == 0) {
        }
        if (i13 == 0) {
        }
        if (i14 == 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        android.content.Context context22222 = (android.content.Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
        composerStartRestartGroup.startReplaceableGroup(73011649);
        objRememberedValue = composerStartRestartGroup.rememberedValue();
        companion = Composer.Companion;
        if (objRememberedValue == companion.getEmpty()) {
        }
        c55008xbo = (C55008xbo) objRememberedValue;
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.startReplaceableGroup(73014263);
        int i2522222 = 458752 & i7;
        if (i2522222 != 131072) {
        }
        zChangedInstance = composerStartRestartGroup.changedInstance(c55008xbo);
        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
        if (!(z | zChangedInstance)) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    public static final C55008xbo EZpvd(C55008xbo c55008xbo, int i, int i2, android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        android.widget.TextView textViewFJNWhG = c55008xbo.fJNWhG();
        if (textViewFJNWhG != null) {
            textViewFJNWhG.setTextAppearance(C52761wXj.LoaderManager.KWHzl);
        }
        android.widget.TextView textViewFJNWhG2 = c55008xbo.fJNWhG();
        if (textViewFJNWhG2 != null) {
            textViewFJNWhG2.setTextColor(C33070mpX.OLrzqt(C52761wXj.Activity.DCUTEIddSDPG, context));
        }
        c55008xbo.setSizeType(i);
        C55001xbh c55001xbhAkhnZx = c55008xbo.AkhnZx();
        if (c55001xbhAkhnZx != null) {
            c55001xbhAkhnZx.setInputType(i2);
        }
        return c55008xbo;
    }

    public static final Unit EZpvd(java.lang.String str, java.lang.Integer num, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i, Function1 function1, C55008xbo c55008xbo) {
        C55001xbh c55001xbhAkhnZx;
        Intrinsics.checkNotNullParameter(c55008xbo, "");
        C55001xbh c55001xbhAkhnZx2 = c55008xbo.AkhnZx();
        if (!Intrinsics.EZpvd((java.lang.Object) (c55001xbhAkhnZx2 != null ? c55001xbhAkhnZx2.isConnected() : null), (java.lang.Object) str) && (c55001xbhAkhnZx = c55008xbo.AkhnZx()) != null) {
            c55001xbhAkhnZx.setPlainNumericText(str);
        }
        if (num != null) {
            c55008xbo.setTitleType(num.intValue());
        }
        android.widget.TextView textViewFJNWhG = c55008xbo.fJNWhG();
        if (!Intrinsics.EZpvd((java.lang.Object) (textViewFJNWhG != null ? textViewFJNWhG.getText() : null), (java.lang.Object) str2)) {
            android.widget.TextView textViewFJNWhG2 = c55008xbo.fJNWhG();
            if (textViewFJNWhG2 != null) {
                textViewFJNWhG2.setText(str2);
            }
            android.widget.TextView textViewFJNWhG3 = c55008xbo.fJNWhG();
            if (textViewFJNWhG3 != null) {
                int i2 = C52761wXj.Activity.DCUTEIddSDPG;
                android.content.Context context = c55008xbo.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                textViewFJNWhG3.setTextColor(C33070mpX.OLrzqt(i2, context));
            }
        }
        c55008xbo.setHintText(str3);
        if (str4 != null) {
            c55008xbo.setErrorText(str4);
        } else {
            c55008xbo.values();
        }
        C55001xbh c55001xbhAkhnZx3 = c55008xbo.AkhnZx();
        if (c55001xbhAkhnZx3 != null) {
            c55001xbhAkhnZx3.EZpvd(i);
        }
        C55001xbh c55001xbhAkhnZx4 = c55008xbo.AkhnZx();
        if (c55001xbhAkhnZx4 != null) {
            c55001xbhAkhnZx4.addTextChangedListener(new StateListAnimator(function1, c55008xbo));
        }
        C55001xbh c55001xbhAkhnZx5 = c55008xbo.AkhnZx();
        if (c55001xbhAkhnZx5 != null) {
            c55001xbhAkhnZx5.setGravity(TextAlign.LEFT);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.wWd$StateListAnimator */
    public static final class StateListAnimator implements android.text.TextWatcher {
        public final /* synthetic */ Function1 KWHzl;
        public final /* synthetic */ C55008xbo copydefault;

        @Override // android.text.TextWatcher
        public void beforeTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        }

        public StateListAnimator(Function1 function1, C55008xbo c55008xbo) {
            this.KWHzl = function1;
            this.copydefault = c55008xbo;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(android.text.Editable editable) {
            Function1 function1 = this.KWHzl;
            C55001xbh c55001xbhAkhnZx = this.copydefault.AkhnZx();
            java.lang.String strIsConnected = c55001xbhAkhnZx != null ? c55001xbhAkhnZx.isConnected() : null;
            if (strIsConnected == null) {
                strIsConnected = "";
            }
            function1.invoke(strIsConnected);
        }
    }
}
