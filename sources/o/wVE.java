package o;

import android.view.ViewGroup;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.viewinterop.AndroidView_androidKt;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.profileinstaller.ProfileVerifier;
import com.amplifyframework.ui.liveness.ml.FaceDetector;
import com.google.android.material.textfield.TextInputLayout;
import com.google.api.client.googleapis.media.MediaHttpDownloader;
import com.okinc.business.defi.biz.core.error.WalletImportError;
import com.okinc.tradeuilib.widget.oktinputlayout.appendview.InputLayoutBothSidesViewState;
import com.okinc.tradeuilib.widget.oktinputlayout.core.InputLayoutState;
import com.okinc.tradingbot.impl.widget.compose.BotInputKt$BotInput$1$1;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.C49511upt;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* JADX INFO: loaded from: classes11.dex */
public final class wVE {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final Unit AEQbTJ(Modifier modifier, java.lang.String str, Function1 function1, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, int i, java.lang.String str7, InputLayoutState inputLayoutState, InputLayoutBothSidesViewState inputLayoutBothSidesViewState, boolean z, Function1 function12, Function1 function13, boolean z2, Function0 function0, boolean z3, Function0 function02, boolean z4, boolean z5, boolean z6, Function1 function14, boolean z7, int i2, android.view.View view, int i3, int i4, int i5, int i6, Composer composer, int i7) {
        AEQbTJ(modifier, str, function1, str2, str3, str4, str5, str6, i, str7, inputLayoutState, inputLayoutBothSidesViewState, z, function12, function13, z2, function0, z3, function02, z4, z5, z6, function14, z7, i2, view, composer, RecomposeScopeImplKt.updateChangedFlags(i3 | 1), RecomposeScopeImplKt.updateChangedFlags(i4), RecomposeScopeImplKt.updateChangedFlags(i5), i6);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final C47988uAv copydefault(C47988uAv c47988uAv, android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        return c47988uAv;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x02d7  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x0312  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x0364  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x0366  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x0369  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x036f  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x0371  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x0375  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x0377  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x037b  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x037e  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x0382  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x0385  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x0389  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x038c  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x0391  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x0395  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x0397  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x039b  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x039e  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x03a2  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x03a4  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x03a8  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x03ab  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x03af  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x03b2  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x03b8  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x03ba  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x03be  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x03c0  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x03c4  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x03c7  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x03cd  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x03d0  */
    /* JADX WARN: Removed duplicated region for block: B:324:0x03d4  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x03d7  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x03db  */
    /* JADX WARN: Removed duplicated region for block: B:328:0x03de  */
    /* JADX WARN: Removed duplicated region for block: B:330:0x03e2  */
    /* JADX WARN: Removed duplicated region for block: B:331:0x03e5  */
    /* JADX WARN: Removed duplicated region for block: B:333:0x03e9  */
    /* JADX WARN: Removed duplicated region for block: B:334:0x03ec  */
    /* JADX WARN: Removed duplicated region for block: B:336:0x03f0  */
    /* JADX WARN: Removed duplicated region for block: B:337:0x03f3  */
    /* JADX WARN: Removed duplicated region for block: B:339:0x03f7  */
    /* JADX WARN: Removed duplicated region for block: B:340:0x03fa  */
    /* JADX WARN: Removed duplicated region for block: B:342:0x03fe  */
    /* JADX WARN: Removed duplicated region for block: B:343:0x0400  */
    /* JADX WARN: Removed duplicated region for block: B:345:0x0404  */
    /* JADX WARN: Removed duplicated region for block: B:346:0x0407  */
    /* JADX WARN: Removed duplicated region for block: B:349:0x040d  */
    /* JADX WARN: Removed duplicated region for block: B:350:0x0410  */
    /* JADX WARN: Removed duplicated region for block: B:353:0x0416  */
    /* JADX WARN: Removed duplicated region for block: B:354:0x0418  */
    /* JADX WARN: Removed duplicated region for block: B:357:0x0420  */
    /* JADX WARN: Removed duplicated region for block: B:358:0x042d  */
    /* JADX WARN: Removed duplicated region for block: B:361:0x0459  */
    /* JADX WARN: Removed duplicated region for block: B:377:0x04cd  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:380:0x04e9  */
    /* JADX WARN: Removed duplicated region for block: B:381:0x04eb  */
    /* JADX WARN: Removed duplicated region for block: B:386:0x04fe  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:391:0x0529  */
    /* JADX WARN: Removed duplicated region for block: B:394:0x0543  */
    /* JADX WARN: Removed duplicated region for block: B:395:0x0545  */
    /* JADX WARN: Removed duplicated region for block: B:398:0x054d  */
    /* JADX WARN: Removed duplicated region for block: B:399:0x054f  */
    /* JADX WARN: Removed duplicated region for block: B:402:0x0555  */
    /* JADX WARN: Removed duplicated region for block: B:403:0x0557  */
    /* JADX WARN: Removed duplicated region for block: B:406:0x0563  */
    /* JADX WARN: Removed duplicated region for block: B:407:0x0565  */
    /* JADX WARN: Removed duplicated region for block: B:410:0x0570  */
    /* JADX WARN: Removed duplicated region for block: B:411:0x0572  */
    /* JADX WARN: Removed duplicated region for block: B:414:0x057d  */
    /* JADX WARN: Removed duplicated region for block: B:415:0x057f  */
    /* JADX WARN: Removed duplicated region for block: B:418:0x058a  */
    /* JADX WARN: Removed duplicated region for block: B:419:0x058c  */
    /* JADX WARN: Removed duplicated region for block: B:422:0x0592  */
    /* JADX WARN: Removed duplicated region for block: B:423:0x0594  */
    /* JADX WARN: Removed duplicated region for block: B:426:0x059f  */
    /* JADX WARN: Removed duplicated region for block: B:427:0x05a1  */
    /* JADX WARN: Removed duplicated region for block: B:430:0x05ac  */
    /* JADX WARN: Removed duplicated region for block: B:431:0x05ae  */
    /* JADX WARN: Removed duplicated region for block: B:434:0x05b7  */
    /* JADX WARN: Removed duplicated region for block: B:435:0x05b9  */
    /* JADX WARN: Removed duplicated region for block: B:438:0x05c3  */
    /* JADX WARN: Removed duplicated region for block: B:439:0x05c5  */
    /* JADX WARN: Removed duplicated region for block: B:442:0x05d0  */
    /* JADX WARN: Removed duplicated region for block: B:443:0x05d2  */
    /* JADX WARN: Removed duplicated region for block: B:446:0x05dd  */
    /* JADX WARN: Removed duplicated region for block: B:447:0x05df  */
    /* JADX WARN: Removed duplicated region for block: B:450:0x05ea  */
    /* JADX WARN: Removed duplicated region for block: B:451:0x05ec  */
    /* JADX WARN: Removed duplicated region for block: B:454:0x05f7  */
    /* JADX WARN: Removed duplicated region for block: B:455:0x05f9  */
    /* JADX WARN: Removed duplicated region for block: B:458:0x0602  */
    /* JADX WARN: Removed duplicated region for block: B:459:0x0604  */
    /* JADX WARN: Removed duplicated region for block: B:462:0x060c  */
    /* JADX WARN: Removed duplicated region for block: B:463:0x060e  */
    /* JADX WARN: Removed duplicated region for block: B:466:0x0618  */
    /* JADX WARN: Removed duplicated region for block: B:467:0x061a  */
    /* JADX WARN: Removed duplicated region for block: B:470:0x0624  */
    /* JADX WARN: Removed duplicated region for block: B:471:0x0626  */
    /* JADX WARN: Removed duplicated region for block: B:474:0x0630  */
    /* JADX WARN: Removed duplicated region for block: B:479:0x0668  */
    /* JADX WARN: Removed duplicated region for block: B:482:0x06be  */
    /* JADX WARN: Removed duplicated region for block: B:486:0x06fb  */
    /* JADX WARN: Removed duplicated region for block: B:488:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0124  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AEQbTJ(Modifier modifier, java.lang.String str, Function1<? super java.lang.String, Unit> function1, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, int i, java.lang.String str7, InputLayoutState inputLayoutState, InputLayoutBothSidesViewState inputLayoutBothSidesViewState, boolean z, Function1<? super java.lang.Boolean, Unit> function12, Function1<? super java.lang.String, Unit> function13, boolean z2, Function0<Unit> function0, boolean z3, Function0<Unit> function02, boolean z4, boolean z5, boolean z6, Function1<? super java.lang.Float, Unit> function14, boolean z7, int i2, android.view.View view, Composer composer, final int i3, final int i4, final int i5, final int i6) {
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int i30;
        int i31;
        int i32;
        int i33;
        java.lang.String str8;
        java.lang.String str9;
        java.lang.String str10;
        java.lang.String str11;
        Function1<? super java.lang.String, Unit> function15;
        boolean z8;
        Function0<Unit> function03;
        boolean z9;
        Function0<Unit> function04;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        android.view.View view2;
        Function1<? super java.lang.String, Unit> function16;
        Function1<? super java.lang.Boolean, Unit> function17;
        final androidx.compose.runtime.State stateRememberUpdatedState;
        java.lang.Object objRememberedValue;
        Composer.Companion companion;
        final InputLayoutState inputLayoutState2;
        int i34;
        java.lang.String str12;
        int i35;
        final C47988uAv c47988uAv;
        boolean z14;
        boolean zChangedInstance;
        java.lang.Object objRememberedValue2;
        boolean zChangedInstance2;
        java.lang.Object objRememberedValue3;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        final java.lang.String str13;
        boolean z19;
        final java.lang.String str14;
        boolean z20;
        final InputLayoutBothSidesViewState inputLayoutBothSidesViewState2;
        boolean z21;
        boolean z22;
        final java.lang.String str15;
        boolean z23;
        boolean z24;
        boolean z25;
        boolean z26;
        boolean z27;
        boolean z28;
        boolean z29;
        boolean z30;
        boolean z31;
        boolean z32;
        boolean z33;
        boolean z34;
        boolean z35;
        boolean zChanged;
        boolean zChangedInstance3;
        java.lang.Object objRememberedValue4;
        final int i36;
        final boolean z36;
        final java.lang.String str16;
        final java.lang.String str17;
        final Function1<? super java.lang.Boolean, Unit> function18;
        final java.lang.String str18;
        Function1<? super java.lang.String, Unit> function19;
        final boolean z37;
        final Function0<Unit> function05;
        final boolean z38;
        final boolean z39;
        final boolean z40;
        final Function1<? super java.lang.String, Unit> function110;
        final Function1<? super java.lang.Float, Unit> function111;
        final InputLayoutState inputLayoutState3;
        final java.lang.String str19;
        final int i37;
        final java.lang.String str20;
        final java.lang.String str21;
        final InputLayoutBothSidesViewState inputLayoutBothSidesViewState3;
        final java.lang.String str22;
        final android.view.View view3;
        final Modifier modifier2;
        final boolean z41;
        final Function0<Unit> function06;
        final boolean z42;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1892683322);
        int i38 = i6 & 1;
        if (i38 != 0) {
            i7 = i3 | 6;
        } else if ((i3 & 6) == 0) {
            i7 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i3;
        } else {
            i7 = i3;
        }
        int i39 = i6 & 2;
        if (i39 != 0) {
            i7 |= 48;
        } else {
            if ((i3 & 48) == 0) {
                i7 |= composerStartRestartGroup.changed(str) ? 32 : 16;
            }
            i8 = i6 & 4;
            if (i8 == 0) {
                i7 |= MLKEMEngine.KyberPolyBytes;
            } else {
                if ((i3 & MLKEMEngine.KyberPolyBytes) == 0) {
                    i7 |= composerStartRestartGroup.changedInstance(function1) ? 256 : 128;
                }
                i9 = i6 & 8;
                if (i9 != 0) {
                    i7 |= 3072;
                } else {
                    if ((i3 & 3072) == 0) {
                        i7 |= composerStartRestartGroup.changed(str2) ? 2048 : 1024;
                    }
                    i10 = i6 & 16;
                    if (i10 == 0) {
                        i7 |= 24576;
                    } else {
                        if ((i3 & 24576) == 0) {
                            i7 |= composerStartRestartGroup.changed(str3) ? 16384 : 8192;
                        }
                        i11 = i6 & 32;
                        if (i11 != 0) {
                            i7 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                        } else if ((i3 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                            i7 |= composerStartRestartGroup.changed(str4) ? 131072 : 65536;
                        }
                        i12 = i6 & 64;
                        if (i12 != 0) {
                            i7 |= 1572864;
                        } else if ((i3 & 1572864) == 0) {
                            i7 |= composerStartRestartGroup.changed(str5) ? 1048576 : 524288;
                        }
                        i13 = i6 & 128;
                        if (i13 != 0) {
                            i7 |= 12582912;
                        } else if ((i3 & 12582912) == 0) {
                            i7 |= composerStartRestartGroup.changed(str6) ? 8388608 : 4194304;
                        }
                        i14 = i6 & 256;
                        if (i14 != 0) {
                            i7 |= 100663296;
                        } else if ((i3 & 100663296) == 0) {
                            i7 |= composerStartRestartGroup.changed(i) ? 67108864 : MediaHttpDownloader.MAXIMUM_CHUNK_SIZE;
                        }
                        i15 = i6 & 512;
                        if (i15 != 0) {
                            i7 |= com.google.android.exoplayer2.C.ENCODING_PCM_32BIT;
                        } else if ((i3 & com.google.android.exoplayer2.C.ENCODING_PCM_32BIT) == 0) {
                            i7 |= composerStartRestartGroup.changed(str7) ? 536870912 : 268435456;
                        }
                        i16 = i6 & 1024;
                        if (i16 != 0) {
                            i17 = i4 | 6;
                        } else if ((i4 & 6) == 0) {
                            i17 = i4 | (composerStartRestartGroup.changed(inputLayoutState) ? 4 : 2);
                        } else {
                            i17 = i4;
                        }
                        i18 = i6 & 2048;
                        if (i18 != 0) {
                            i17 |= 48;
                        } else if ((i4 & 48) == 0) {
                            i17 |= composerStartRestartGroup.changed(inputLayoutBothSidesViewState) ? 32 : 16;
                        }
                        int i40 = i17;
                        i19 = i6 & 8192;
                        if (i19 != 0) {
                            i40 |= 3072;
                        } else {
                            if ((i4 & 3072) == 0) {
                                i40 |= composerStartRestartGroup.changedInstance(function12) ? 2048 : 1024;
                            }
                            i20 = i6 & 16384;
                            if (i20 == 0) {
                                i40 |= 24576;
                                i21 = i20;
                            } else {
                                i21 = i20;
                                if ((i4 & 24576) == 0) {
                                    i40 |= composerStartRestartGroup.changedInstance(function13) ? 16384 : 8192;
                                }
                                i22 = i6 & 32768;
                                if (i22 != 0) {
                                    i40 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                                } else if ((i4 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                                    i40 |= composerStartRestartGroup.changed(z2) ? 131072 : 65536;
                                }
                                i23 = i6 & 65536;
                                if (i23 != 0) {
                                    i40 |= 1572864;
                                } else if ((i4 & 1572864) == 0) {
                                    i40 |= composerStartRestartGroup.changedInstance(function0) ? 1048576 : 524288;
                                }
                                i24 = i6 & 131072;
                                if (i24 != 0) {
                                    i40 |= 12582912;
                                } else if ((i4 & 12582912) == 0) {
                                    i40 |= composerStartRestartGroup.changed(z3) ? 8388608 : 4194304;
                                }
                                i25 = i6 & 262144;
                                if (i25 != 0) {
                                    i40 |= 100663296;
                                } else if ((i4 & 100663296) == 0) {
                                    i40 |= composerStartRestartGroup.changedInstance(function02) ? 67108864 : MediaHttpDownloader.MAXIMUM_CHUNK_SIZE;
                                }
                                i26 = i6 & 524288;
                                if (i26 != 0) {
                                    i40 |= com.google.android.exoplayer2.C.ENCODING_PCM_32BIT;
                                } else if ((i4 & com.google.android.exoplayer2.C.ENCODING_PCM_32BIT) == 0) {
                                    i40 |= composerStartRestartGroup.changed(z4) ? 536870912 : 268435456;
                                }
                                i27 = i6 & 1048576;
                                if (i27 != 0) {
                                    i28 = i5 | 6;
                                } else if ((i5 & 6) == 0) {
                                    i28 = i5 | (composerStartRestartGroup.changed(z5) ? 4 : 2);
                                } else {
                                    i28 = i5;
                                }
                                i29 = i6 & 2097152;
                                if (i29 != 0) {
                                    i28 |= 48;
                                } else if ((i5 & 48) == 0) {
                                    i28 |= composerStartRestartGroup.changed(z6) ? 32 : 16;
                                }
                                int i41 = i28;
                                i30 = i6 & 4194304;
                                if (i30 != 0) {
                                    i41 |= MLKEMEngine.KyberPolyBytes;
                                } else {
                                    if ((i5 & MLKEMEngine.KyberPolyBytes) == 0) {
                                        i41 |= composerStartRestartGroup.changedInstance(function14) ? 256 : 128;
                                    }
                                    i31 = i6 & 8388608;
                                    if (i31 == 0) {
                                        i41 |= 3072;
                                    } else {
                                        if ((i5 & 3072) == 0) {
                                            i41 |= composerStartRestartGroup.changed(z7) ? 2048 : 1024;
                                        }
                                        i32 = i6 & 16777216;
                                        if (i32 == 0) {
                                            if ((i5 & 24576) == 0) {
                                                i41 |= composerStartRestartGroup.changed(i2) ? 16384 : 8192;
                                            }
                                            i33 = i6 & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE;
                                            if (i33 == 0) {
                                                i41 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                                            } else if ((i5 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                                                i41 |= composerStartRestartGroup.changedInstance(view) ? 131072 : 65536;
                                            }
                                            if ((i7 & 306783379) == 306783378 || (306783251 & i40) != 306783250 || (74899 & i41) != 74898 || !composerStartRestartGroup.getSkipping()) {
                                                Modifier modifier3 = i38 == 0 ? Modifier.Companion : modifier;
                                                java.lang.String str23 = i39 == 0 ? "" : str;
                                                Function1<? super java.lang.String, Unit> function112 = i8 == 0 ? null : function1;
                                                str8 = i9 == 0 ? "" : str2;
                                                str9 = i10 == 0 ? "" : str3;
                                                str10 = i11 == 0 ? "" : str4;
                                                java.lang.String str24 = i12 == 0 ? str5 : "";
                                                str11 = i13 == 0 ? null : str6;
                                                int i42 = i14 == 0 ? 8 : i;
                                                java.lang.String str25 = i15 == 0 ? null : str7;
                                                InputLayoutState inputLayoutState4 = i16 == 0 ? InputLayoutState.NORMAL : inputLayoutState;
                                                InputLayoutBothSidesViewState inputLayoutBothSidesViewState4 = i18 == 0 ? InputLayoutBothSidesViewState.NORMAL : inputLayoutBothSidesViewState;
                                                boolean z43 = (i6 & 4096) == 0 ? true : z;
                                                Function1<? super java.lang.Boolean, Unit> function113 = i19 == 0 ? null : function12;
                                                function15 = i21 == 0 ? null : function13;
                                                z8 = i22 == 0 ? false : z2;
                                                function03 = i23 == 0 ? null : function0;
                                                z9 = i24 == 0 ? false : z3;
                                                function04 = i25 == 0 ? null : function02;
                                                z10 = i26 == 0 ? false : z4;
                                                z11 = i27 == 0 ? false : z5;
                                                z12 = i29 == 0 ? false : z6;
                                                Function1<? super java.lang.Float, Unit> function114 = i30 == 0 ? null : function14;
                                                z13 = i31 == 0 ? false : z7;
                                                boolean z44 = z43;
                                                int i43 = i32 == 0 ? 0 : i2;
                                                Modifier modifier4 = modifier3;
                                                view2 = i33 == 0 ? null : view;
                                                if (ComposerKt.isTraceInProgress()) {
                                                    function16 = function112;
                                                    function17 = function113;
                                                } else {
                                                    function17 = function113;
                                                    function16 = function112;
                                                    ComposerKt.traceEventStart(-1892683322, i7, i40, "com.okinc.tradingbot.impl.widget.compose.BotInput (BotInput.kt:99)");
                                                }
                                                android.content.Context context = (android.content.Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                                                stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(function114, composerStartRestartGroup, (i41 >> 6) & 14);
                                                Function1<? super java.lang.Float, Unit> function115 = function114;
                                                composerStartRestartGroup.startReplaceableGroup(693094479);
                                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                                companion = Composer.Companion;
                                                inputLayoutState2 = inputLayoutState4;
                                                if (objRememberedValue != companion.getEmpty()) {
                                                    uSI usiEZpvd = uSI.EZpvd(android.view.LayoutInflater.from(context));
                                                    if (i43 == 1) {
                                                        i35 = i43;
                                                        ConstraintLayout constraintLayout = (ConstraintLayout) usiEZpvd.getRoot().findViewById(C49511upt.Application.finit);
                                                        if (constraintLayout != null) {
                                                            ViewGroup.LayoutParams layoutParams = constraintLayout.getLayoutParams();
                                                            if (layoutParams != null) {
                                                                str12 = str25;
                                                                layoutParams.height = C55298xhM.copydefault(48.0f, context);
                                                                constraintLayout.setLayoutParams(layoutParams);
                                                            } else {
                                                                throw new java.lang.NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                                                            }
                                                        } else {
                                                            str12 = str25;
                                                        }
                                                        TextInputLayout textInputLayout = (TextInputLayout) usiEZpvd.getRoot().findViewById(C49511upt.Application.dxcTrN);
                                                        if (textInputLayout != null) {
                                                            i34 = i42;
                                                            textInputLayout.setPaddingRelative(textInputLayout.getPaddingStart(), C55298xhM.copydefault(4.0f, context), textInputLayout.getPaddingEnd(), C55298xhM.copydefault(4.0f, context));
                                                            Unit unit = Unit.INSTANCE;
                                                        } else {
                                                            i34 = i42;
                                                        }
                                                    } else {
                                                        i34 = i42;
                                                        str12 = str25;
                                                        i35 = i43;
                                                    }
                                                    objRememberedValue = usiEZpvd.getRoot();
                                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                                } else {
                                                    i34 = i42;
                                                    str12 = str25;
                                                    i35 = i43;
                                                }
                                                c47988uAv = (C47988uAv) objRememberedValue;
                                                composerStartRestartGroup.endReplaceableGroup();
                                                Intrinsics.copydefault(c47988uAv);
                                                composerStartRestartGroup.startReplaceableGroup(693120749);
                                                int i44 = 29360128 & i7;
                                                z14 = i44 != 8388608;
                                                zChangedInstance = composerStartRestartGroup.changedInstance(c47988uAv);
                                                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                                                if (!(z14 | zChangedInstance) || objRememberedValue2 == companion.getEmpty()) {
                                                    objRememberedValue2 = new BotInputKt$BotInput$1$1(str11, c47988uAv, null);
                                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                                                }
                                                composerStartRestartGroup.endReplaceableGroup();
                                                EffectsKt.LaunchedEffect(str11, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends java.lang.Object>) objRememberedValue2, composerStartRestartGroup, (i7 >> 21) & 14);
                                                composerStartRestartGroup.startReplaceableGroup(693128921);
                                                zChangedInstance2 = composerStartRestartGroup.changedInstance(c47988uAv);
                                                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                                                if (!zChangedInstance2 || objRememberedValue3 == companion.getEmpty()) {
                                                    objRememberedValue3 = new Function1() { // from class: o.wVJ
                                                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                                        @Override // kotlin.jvm.functions.Function1
                                                        public final java.lang.Object invoke(java.lang.Object obj) {
                                                            return wVE.copydefault(c47988uAv, (android.content.Context) obj);
                                                        }
                                                    };
                                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                                                }
                                                Function1 function116 = (Function1) objRememberedValue3;
                                                composerStartRestartGroup.endReplaceableGroup();
                                                composerStartRestartGroup.startReplaceableGroup(693132860);
                                                z15 = (i7 & WalletImportError.ERROR_CODE_AA_EXIST) != 32;
                                                z16 = (i7 & 7168) != 2048;
                                                z17 = (i40 & WalletImportError.ERROR_CODE_AA_EXIST) != 32;
                                                z18 = (57344 & i7) != 16384;
                                                str13 = str11;
                                                z19 = (458752 & i7) != 131072;
                                                str14 = str24;
                                                z20 = (3670016 & i7) != 1048576;
                                                inputLayoutBothSidesViewState2 = inputLayoutBothSidesViewState4;
                                                z21 = (1879048192 & i40) != 536870912;
                                                z22 = i44 != 8388608;
                                                str15 = str23;
                                                z23 = (234881024 & i7) != 67108864;
                                                z24 = (1879048192 & i7) != 536870912;
                                                z25 = (i40 & 14) != 4;
                                                z26 = (i41 & 7168) != 2048;
                                                z27 = (458752 & i40) != 131072;
                                                z28 = (3670016 & i40) != 1048576;
                                                z29 = (29360128 & i40) != 8388608;
                                                z30 = (234881024 & i40) != 67108864;
                                                z31 = (i41 & 14) != 4;
                                                z32 = (i41 & WalletImportError.ERROR_CODE_AA_EXIST) != 32;
                                                int i45 = i7;
                                                z33 = (i7 & FaceDetector.NUM_BOXES) != 256;
                                                z34 = (i40 & 7168) != 2048;
                                                z35 = (i40 & 57344) == 16384;
                                                zChanged = composerStartRestartGroup.changed(stateRememberUpdatedState);
                                                zChangedInstance3 = composerStartRestartGroup.changedInstance(view2);
                                                objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                                                if (!(z19 | z16 | z15 | z17 | z18 | z20 | z21 | z22 | z23 | z24 | z25 | z26 | z27 | z28 | z29 | z30 | z31 | z32 | z33 | z34 | z35 | zChanged | zChangedInstance3) || objRememberedValue4 == companion.getEmpty()) {
                                                    final java.lang.String str26 = str8;
                                                    final java.lang.String str27 = str9;
                                                    final java.lang.String str28 = str10;
                                                    final boolean z45 = z10;
                                                    final int i46 = i34;
                                                    final java.lang.String str29 = str12;
                                                    final boolean z46 = z13;
                                                    final boolean z47 = z8;
                                                    final Function0<Unit> function07 = function03;
                                                    final boolean z48 = z9;
                                                    final Function0<Unit> function08 = function04;
                                                    final boolean z49 = z11;
                                                    final boolean z50 = z12;
                                                    final android.view.View view4 = view2;
                                                    final Function1<? super java.lang.String, Unit> function117 = function16;
                                                    final Function1<? super java.lang.Boolean, Unit> function118 = function17;
                                                    final Function1<? super java.lang.String, Unit> function119 = function15;
                                                    objRememberedValue4 = new Function1() { // from class: o.wVH
                                                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                                        @Override // kotlin.jvm.functions.Function1
                                                        public final java.lang.Object invoke(java.lang.Object obj) {
                                                            return wVE.AEQbTJ(str15, str26, inputLayoutBothSidesViewState2, str27, str28, str14, z45, str13, i46, str29, inputLayoutState2, z46, z47, function07, z48, function08, z49, z50, view4, function117, function118, function119, stateRememberUpdatedState, (C47988uAv) obj);
                                                        }
                                                    };
                                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                                                }
                                                composerStartRestartGroup.endReplaceableGroup();
                                                AndroidView_androidKt.AndroidView(function116, modifier4, (Function1) objRememberedValue4, composerStartRestartGroup, (i45 << 3) & WalletImportError.ERROR_CODE_AA_EXIST, 0);
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                }
                                                i36 = i35;
                                                z36 = z44;
                                                str16 = str8;
                                                str17 = str9;
                                                function18 = function17;
                                                str18 = str10;
                                                function19 = function15;
                                                z37 = z8;
                                                function05 = function04;
                                                z38 = z10;
                                                z39 = z11;
                                                z40 = z12;
                                                function110 = function16;
                                                function111 = function115;
                                                inputLayoutState3 = inputLayoutState2;
                                                str19 = str12;
                                                i37 = i34;
                                                str20 = str13;
                                                str21 = str14;
                                                inputLayoutBothSidesViewState3 = inputLayoutBothSidesViewState2;
                                                str22 = str15;
                                                view3 = view2;
                                                modifier2 = modifier4;
                                                z41 = z13;
                                                function06 = function03;
                                                z42 = z9;
                                            } else {
                                                composerStartRestartGroup.skipToGroupEnd();
                                                modifier2 = modifier;
                                                str22 = str;
                                                function110 = function1;
                                                str16 = str2;
                                                str17 = str3;
                                                str18 = str4;
                                                str21 = str5;
                                                str20 = str6;
                                                i37 = i;
                                                str19 = str7;
                                                inputLayoutState3 = inputLayoutState;
                                                inputLayoutBothSidesViewState3 = inputLayoutBothSidesViewState;
                                                z36 = z;
                                                function18 = function12;
                                                function19 = function13;
                                                z37 = z2;
                                                function06 = function0;
                                                z42 = z3;
                                                function05 = function02;
                                                z38 = z4;
                                                z39 = z5;
                                                z40 = z6;
                                                function111 = function14;
                                                z41 = z7;
                                                i36 = i2;
                                                view3 = view;
                                            }
                                            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                                            if (scopeUpdateScopeEndRestartGroup == null) {
                                                final Function1<? super java.lang.String, Unit> function120 = function19;
                                                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: o.wVM
                                                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                                    @Override // kotlin.jvm.functions.Function2
                                                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                                        return wVE.AEQbTJ(modifier2, str22, function110, str16, str17, str18, str21, str20, i37, str19, inputLayoutState3, inputLayoutBothSidesViewState3, z36, function18, function120, z37, function06, z42, function05, z38, z39, z40, function111, z41, i36, view3, i3, i4, i5, i6, (Composer) obj, ((java.lang.Integer) obj2).intValue());
                                                    }
                                                });
                                                return;
                                            }
                                            return;
                                        }
                                        i41 |= 24576;
                                        i33 = i6 & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE;
                                        if (i33 == 0) {
                                        }
                                        if ((i7 & 306783379) == 306783378) {
                                            if (i38 == 0) {
                                            }
                                            if (i39 == 0) {
                                            }
                                            if (i8 == 0) {
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
                                            if (i14 == 0) {
                                            }
                                            if (i15 == 0) {
                                            }
                                            if (i16 == 0) {
                                            }
                                            if (i18 == 0) {
                                            }
                                            if ((i6 & 4096) == 0) {
                                            }
                                            if (i19 == 0) {
                                            }
                                            if (i21 == 0) {
                                            }
                                            if (i22 == 0) {
                                            }
                                            if (i23 == 0) {
                                            }
                                            if (i24 == 0) {
                                            }
                                            if (i25 == 0) {
                                            }
                                            if (i26 == 0) {
                                            }
                                            if (i27 == 0) {
                                            }
                                            if (i29 == 0) {
                                            }
                                            if (i30 == 0) {
                                            }
                                            if (i31 == 0) {
                                            }
                                            boolean z442 = z43;
                                            if (i32 == 0) {
                                            }
                                            Modifier modifier42 = modifier3;
                                            if (i33 == 0) {
                                            }
                                            if (ComposerKt.isTraceInProgress()) {
                                            }
                                            android.content.Context context2 = (android.content.Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                                            stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(function114, composerStartRestartGroup, (i41 >> 6) & 14);
                                            Function1<? super java.lang.Float, Unit> function1152 = function114;
                                            composerStartRestartGroup.startReplaceableGroup(693094479);
                                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                                            companion = Composer.Companion;
                                            inputLayoutState2 = inputLayoutState4;
                                            if (objRememberedValue != companion.getEmpty()) {
                                            }
                                            c47988uAv = (C47988uAv) objRememberedValue;
                                            composerStartRestartGroup.endReplaceableGroup();
                                            Intrinsics.copydefault(c47988uAv);
                                            composerStartRestartGroup.startReplaceableGroup(693120749);
                                            int i442 = 29360128 & i7;
                                            if (i442 != 8388608) {
                                            }
                                            zChangedInstance = composerStartRestartGroup.changedInstance(c47988uAv);
                                            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                                            if (!(z14 | zChangedInstance)) {
                                                objRememberedValue2 = new BotInputKt$BotInput$1$1(str11, c47988uAv, null);
                                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                                                composerStartRestartGroup.endReplaceableGroup();
                                                EffectsKt.LaunchedEffect(str11, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends java.lang.Object>) objRememberedValue2, composerStartRestartGroup, (i7 >> 21) & 14);
                                                composerStartRestartGroup.startReplaceableGroup(693128921);
                                                zChangedInstance2 = composerStartRestartGroup.changedInstance(c47988uAv);
                                                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                                                if (!zChangedInstance2) {
                                                    objRememberedValue3 = new Function1() { // from class: o.wVJ
                                                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                                        @Override // kotlin.jvm.functions.Function1
                                                        public final java.lang.Object invoke(java.lang.Object obj) {
                                                            return wVE.copydefault(c47988uAv, (android.content.Context) obj);
                                                        }
                                                    };
                                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                                                    Function1 function1162 = (Function1) objRememberedValue3;
                                                    composerStartRestartGroup.endReplaceableGroup();
                                                    composerStartRestartGroup.startReplaceableGroup(693132860);
                                                    if ((i7 & WalletImportError.ERROR_CODE_AA_EXIST) != 32) {
                                                    }
                                                    if ((i7 & 7168) != 2048) {
                                                    }
                                                    if ((i40 & WalletImportError.ERROR_CODE_AA_EXIST) != 32) {
                                                    }
                                                    if ((57344 & i7) != 16384) {
                                                    }
                                                    str13 = str11;
                                                    if ((458752 & i7) != 131072) {
                                                    }
                                                    str14 = str24;
                                                    if ((3670016 & i7) != 1048576) {
                                                    }
                                                    inputLayoutBothSidesViewState2 = inputLayoutBothSidesViewState4;
                                                    if ((1879048192 & i40) != 536870912) {
                                                    }
                                                    if (i442 != 8388608) {
                                                    }
                                                    str15 = str23;
                                                    z23 = (234881024 & i7) != 67108864;
                                                    z24 = (1879048192 & i7) != 536870912;
                                                    z25 = (i40 & 14) != 4;
                                                    z26 = (i41 & 7168) != 2048;
                                                    z27 = (458752 & i40) != 131072;
                                                    z28 = (3670016 & i40) != 1048576;
                                                    z29 = (29360128 & i40) != 8388608;
                                                    z30 = (234881024 & i40) != 67108864;
                                                    if ((i41 & 14) != 4) {
                                                    }
                                                    if ((i41 & WalletImportError.ERROR_CODE_AA_EXIST) != 32) {
                                                    }
                                                    int i452 = i7;
                                                    z33 = (i7 & FaceDetector.NUM_BOXES) != 256;
                                                    if ((i40 & 7168) != 2048) {
                                                    }
                                                    if ((i40 & 57344) == 16384) {
                                                    }
                                                    zChanged = composerStartRestartGroup.changed(stateRememberUpdatedState);
                                                    zChangedInstance3 = composerStartRestartGroup.changedInstance(view2);
                                                    objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                                                    if (!(z19 | z16 | z15 | z17 | z18 | z20 | z21 | z22 | z23 | z24 | z25 | z26 | z27 | z28 | z29 | z30 | z31 | z32 | z33 | z34 | z35 | zChanged | zChangedInstance3)) {
                                                        final java.lang.String str262 = str8;
                                                        final java.lang.String str272 = str9;
                                                        final java.lang.String str282 = str10;
                                                        final boolean z452 = z10;
                                                        final int i462 = i34;
                                                        final java.lang.String str292 = str12;
                                                        final boolean z462 = z13;
                                                        final boolean z472 = z8;
                                                        final Function0 function072 = function03;
                                                        final boolean z482 = z9;
                                                        final Function0 function082 = function04;
                                                        final boolean z492 = z11;
                                                        final boolean z502 = z12;
                                                        final android.view.View view42 = view2;
                                                        final Function1 function1172 = function16;
                                                        final Function1 function1182 = function17;
                                                        final Function1 function1192 = function15;
                                                        objRememberedValue4 = new Function1() { // from class: o.wVH
                                                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                                            @Override // kotlin.jvm.functions.Function1
                                                            public final java.lang.Object invoke(java.lang.Object obj) {
                                                                return wVE.AEQbTJ(str15, str262, inputLayoutBothSidesViewState2, str272, str282, str14, z452, str13, i462, str292, inputLayoutState2, z462, z472, function072, z482, function082, z492, z502, view42, function1172, function1182, function1192, stateRememberUpdatedState, (C47988uAv) obj);
                                                            }
                                                        };
                                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                                                        composerStartRestartGroup.endReplaceableGroup();
                                                        AndroidView_androidKt.AndroidView(function1162, modifier42, (Function1) objRememberedValue4, composerStartRestartGroup, (i452 << 3) & WalletImportError.ERROR_CODE_AA_EXIST, 0);
                                                        if (ComposerKt.isTraceInProgress()) {
                                                        }
                                                        i36 = i35;
                                                        z36 = z442;
                                                        str16 = str8;
                                                        str17 = str9;
                                                        function18 = function17;
                                                        str18 = str10;
                                                        function19 = function15;
                                                        z37 = z8;
                                                        function05 = function04;
                                                        z38 = z10;
                                                        z39 = z11;
                                                        z40 = z12;
                                                        function110 = function16;
                                                        function111 = function1152;
                                                        inputLayoutState3 = inputLayoutState2;
                                                        str19 = str12;
                                                        i37 = i34;
                                                        str20 = str13;
                                                        str21 = str14;
                                                        inputLayoutBothSidesViewState3 = inputLayoutBothSidesViewState2;
                                                        str22 = str15;
                                                        view3 = view2;
                                                        modifier2 = modifier42;
                                                        z41 = z13;
                                                        function06 = function03;
                                                        z42 = z9;
                                                    }
                                                }
                                            }
                                        }
                                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                                        if (scopeUpdateScopeEndRestartGroup == null) {
                                        }
                                    }
                                    i32 = i6 & 16777216;
                                    if (i32 == 0) {
                                    }
                                    i33 = i6 & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE;
                                    if (i33 == 0) {
                                    }
                                    if ((i7 & 306783379) == 306783378) {
                                    }
                                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                                    if (scopeUpdateScopeEndRestartGroup == null) {
                                    }
                                }
                                i31 = i6 & 8388608;
                                if (i31 == 0) {
                                }
                                i32 = i6 & 16777216;
                                if (i32 == 0) {
                                }
                                i33 = i6 & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE;
                                if (i33 == 0) {
                                }
                                if ((i7 & 306783379) == 306783378) {
                                }
                                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                                if (scopeUpdateScopeEndRestartGroup == null) {
                                }
                            }
                            i22 = i6 & 32768;
                            if (i22 != 0) {
                            }
                            i23 = i6 & 65536;
                            if (i23 != 0) {
                            }
                            i24 = i6 & 131072;
                            if (i24 != 0) {
                            }
                            i25 = i6 & 262144;
                            if (i25 != 0) {
                            }
                            i26 = i6 & 524288;
                            if (i26 != 0) {
                            }
                            i27 = i6 & 1048576;
                            if (i27 != 0) {
                            }
                            i29 = i6 & 2097152;
                            if (i29 != 0) {
                            }
                            int i412 = i28;
                            i30 = i6 & 4194304;
                            if (i30 != 0) {
                            }
                            i31 = i6 & 8388608;
                            if (i31 == 0) {
                            }
                            i32 = i6 & 16777216;
                            if (i32 == 0) {
                            }
                            i33 = i6 & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE;
                            if (i33 == 0) {
                            }
                            if ((i7 & 306783379) == 306783378) {
                            }
                            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup == null) {
                            }
                        }
                        i20 = i6 & 16384;
                        if (i20 == 0) {
                        }
                        i22 = i6 & 32768;
                        if (i22 != 0) {
                        }
                        i23 = i6 & 65536;
                        if (i23 != 0) {
                        }
                        i24 = i6 & 131072;
                        if (i24 != 0) {
                        }
                        i25 = i6 & 262144;
                        if (i25 != 0) {
                        }
                        i26 = i6 & 524288;
                        if (i26 != 0) {
                        }
                        i27 = i6 & 1048576;
                        if (i27 != 0) {
                        }
                        i29 = i6 & 2097152;
                        if (i29 != 0) {
                        }
                        int i4122 = i28;
                        i30 = i6 & 4194304;
                        if (i30 != 0) {
                        }
                        i31 = i6 & 8388608;
                        if (i31 == 0) {
                        }
                        i32 = i6 & 16777216;
                        if (i32 == 0) {
                        }
                        i33 = i6 & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE;
                        if (i33 == 0) {
                        }
                        if ((i7 & 306783379) == 306783378) {
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                        }
                    }
                    i11 = i6 & 32;
                    if (i11 != 0) {
                    }
                    i12 = i6 & 64;
                    if (i12 != 0) {
                    }
                    i13 = i6 & 128;
                    if (i13 != 0) {
                    }
                    i14 = i6 & 256;
                    if (i14 != 0) {
                    }
                    i15 = i6 & 512;
                    if (i15 != 0) {
                    }
                    i16 = i6 & 1024;
                    if (i16 != 0) {
                    }
                    i18 = i6 & 2048;
                    if (i18 != 0) {
                    }
                    int i402 = i17;
                    i19 = i6 & 8192;
                    if (i19 != 0) {
                    }
                    i20 = i6 & 16384;
                    if (i20 == 0) {
                    }
                    i22 = i6 & 32768;
                    if (i22 != 0) {
                    }
                    i23 = i6 & 65536;
                    if (i23 != 0) {
                    }
                    i24 = i6 & 131072;
                    if (i24 != 0) {
                    }
                    i25 = i6 & 262144;
                    if (i25 != 0) {
                    }
                    i26 = i6 & 524288;
                    if (i26 != 0) {
                    }
                    i27 = i6 & 1048576;
                    if (i27 != 0) {
                    }
                    i29 = i6 & 2097152;
                    if (i29 != 0) {
                    }
                    int i41222 = i28;
                    i30 = i6 & 4194304;
                    if (i30 != 0) {
                    }
                    i31 = i6 & 8388608;
                    if (i31 == 0) {
                    }
                    i32 = i6 & 16777216;
                    if (i32 == 0) {
                    }
                    i33 = i6 & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE;
                    if (i33 == 0) {
                    }
                    if ((i7 & 306783379) == 306783378) {
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                    }
                }
                i10 = i6 & 16;
                if (i10 == 0) {
                }
                i11 = i6 & 32;
                if (i11 != 0) {
                }
                i12 = i6 & 64;
                if (i12 != 0) {
                }
                i13 = i6 & 128;
                if (i13 != 0) {
                }
                i14 = i6 & 256;
                if (i14 != 0) {
                }
                i15 = i6 & 512;
                if (i15 != 0) {
                }
                i16 = i6 & 1024;
                if (i16 != 0) {
                }
                i18 = i6 & 2048;
                if (i18 != 0) {
                }
                int i4022 = i17;
                i19 = i6 & 8192;
                if (i19 != 0) {
                }
                i20 = i6 & 16384;
                if (i20 == 0) {
                }
                i22 = i6 & 32768;
                if (i22 != 0) {
                }
                i23 = i6 & 65536;
                if (i23 != 0) {
                }
                i24 = i6 & 131072;
                if (i24 != 0) {
                }
                i25 = i6 & 262144;
                if (i25 != 0) {
                }
                i26 = i6 & 524288;
                if (i26 != 0) {
                }
                i27 = i6 & 1048576;
                if (i27 != 0) {
                }
                i29 = i6 & 2097152;
                if (i29 != 0) {
                }
                int i412222 = i28;
                i30 = i6 & 4194304;
                if (i30 != 0) {
                }
                i31 = i6 & 8388608;
                if (i31 == 0) {
                }
                i32 = i6 & 16777216;
                if (i32 == 0) {
                }
                i33 = i6 & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE;
                if (i33 == 0) {
                }
                if ((i7 & 306783379) == 306783378) {
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            i9 = i6 & 8;
            if (i9 != 0) {
            }
            i10 = i6 & 16;
            if (i10 == 0) {
            }
            i11 = i6 & 32;
            if (i11 != 0) {
            }
            i12 = i6 & 64;
            if (i12 != 0) {
            }
            i13 = i6 & 128;
            if (i13 != 0) {
            }
            i14 = i6 & 256;
            if (i14 != 0) {
            }
            i15 = i6 & 512;
            if (i15 != 0) {
            }
            i16 = i6 & 1024;
            if (i16 != 0) {
            }
            i18 = i6 & 2048;
            if (i18 != 0) {
            }
            int i40222 = i17;
            i19 = i6 & 8192;
            if (i19 != 0) {
            }
            i20 = i6 & 16384;
            if (i20 == 0) {
            }
            i22 = i6 & 32768;
            if (i22 != 0) {
            }
            i23 = i6 & 65536;
            if (i23 != 0) {
            }
            i24 = i6 & 131072;
            if (i24 != 0) {
            }
            i25 = i6 & 262144;
            if (i25 != 0) {
            }
            i26 = i6 & 524288;
            if (i26 != 0) {
            }
            i27 = i6 & 1048576;
            if (i27 != 0) {
            }
            i29 = i6 & 2097152;
            if (i29 != 0) {
            }
            int i4122222 = i28;
            i30 = i6 & 4194304;
            if (i30 != 0) {
            }
            i31 = i6 & 8388608;
            if (i31 == 0) {
            }
            i32 = i6 & 16777216;
            if (i32 == 0) {
            }
            i33 = i6 & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE;
            if (i33 == 0) {
            }
            if ((i7 & 306783379) == 306783378) {
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        i8 = i6 & 4;
        if (i8 == 0) {
        }
        i9 = i6 & 8;
        if (i9 != 0) {
        }
        i10 = i6 & 16;
        if (i10 == 0) {
        }
        i11 = i6 & 32;
        if (i11 != 0) {
        }
        i12 = i6 & 64;
        if (i12 != 0) {
        }
        i13 = i6 & 128;
        if (i13 != 0) {
        }
        i14 = i6 & 256;
        if (i14 != 0) {
        }
        i15 = i6 & 512;
        if (i15 != 0) {
        }
        i16 = i6 & 1024;
        if (i16 != 0) {
        }
        i18 = i6 & 2048;
        if (i18 != 0) {
        }
        int i402222 = i17;
        i19 = i6 & 8192;
        if (i19 != 0) {
        }
        i20 = i6 & 16384;
        if (i20 == 0) {
        }
        i22 = i6 & 32768;
        if (i22 != 0) {
        }
        i23 = i6 & 65536;
        if (i23 != 0) {
        }
        i24 = i6 & 131072;
        if (i24 != 0) {
        }
        i25 = i6 & 262144;
        if (i25 != 0) {
        }
        i26 = i6 & 524288;
        if (i26 != 0) {
        }
        i27 = i6 & 1048576;
        if (i27 != 0) {
        }
        i29 = i6 & 2097152;
        if (i29 != 0) {
        }
        int i41222222 = i28;
        i30 = i6 & 4194304;
        if (i30 != 0) {
        }
        i31 = i6 & 8388608;
        if (i31 == 0) {
        }
        i32 = i6 & 16777216;
        if (i32 == 0) {
        }
        i33 = i6 & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE;
        if (i33 == 0) {
        }
        if ((i7 & 306783379) == 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    public static final Unit AEQbTJ(java.lang.String str, java.lang.String str2, InputLayoutBothSidesViewState inputLayoutBothSidesViewState, java.lang.String str3, java.lang.String str4, java.lang.String str5, boolean z, java.lang.String str6, int i, java.lang.String str7, InputLayoutState inputLayoutState, boolean z2, boolean z3, Function0 function0, boolean z4, Function0 function02, boolean z5, boolean z6, android.view.View view, final Function1 function1, final Function1 function12, final Function1 function13, androidx.compose.runtime.State state, final C47988uAv c47988uAv) {
        Intrinsics.checkNotNullParameter(c47988uAv, "");
        if (!Intrinsics.EZpvd((java.lang.Object) c47988uAv.AkhnZx(), (java.lang.Object) str)) {
            C47988uAv.setInputContent$default(c47988uAv, str, false, false, 6, null);
        }
        if (!Intrinsics.EZpvd((java.lang.Object) c47988uAv.values(), (java.lang.Object) str2)) {
            c47988uAv.AEQbTJ(str2, inputLayoutBothSidesViewState);
        }
        c47988uAv.setInputHint(str3);
        if (str4.length() > 0) {
            c47988uAv.setFloatingHint(str4);
        }
        if (!Intrinsics.EZpvd((java.lang.Object) c47988uAv.fARcdN(), (java.lang.Object) str5)) {
            c47988uAv.setInputUnit(str5);
            c47988uAv.setInputUnitBolded(z);
        }
        if (str6 != null) {
            c47988uAv.setInputErrorMsg(str6);
        } else {
            c47988uAv.copydefault();
        }
        c47988uAv.setMaxDecimal(i);
        c47988uAv.setMaxValue(str7);
        C47988uAv.setInputLayoutState$default(c47988uAv, inputLayoutState, false, 2, null);
        if (z2) {
            c47988uAv.setNegativeMode();
        } else {
            c47988uAv.setPositiveMode();
        }
        c47988uAv.setLabelClickable(z3, function0);
        c47988uAv.setUnitClickable(z4, function02);
        if (z5 && !c47988uAv.iwGUEr()) {
            C47988uAv.showInputSeekBar$default(c47988uAv, null, z6, 1, null);
        }
        c47988uAv.setPercentVisible(z5 ? 0 : 8);
        c47988uAv.setOnTextChangeCallback(new Function2() { // from class: o.wVB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return wVE.KWHzl(function1, c47988uAv, (C47988uAv) obj, (java.lang.String) obj2);
            }
        });
        c47988uAv.setOnFocusChangeCallback(new Function2() { // from class: o.wVI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return wVE.KWHzl(function12, (C47988uAv) obj, ((java.lang.Boolean) obj2).booleanValue());
            }
        });
        c47988uAv.setOnMaxValueTriggerCallback(new Function1() { // from class: o.wVF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return wVE.copydefault(function13, (java.lang.String) obj);
            }
        });
        final Function1<java.lang.Float, Unit> function1Copydefault = copydefault(state);
        if (function1Copydefault != null) {
            c47988uAv.setPercentSeekBarListener(new Function1() { // from class: o.wVG
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return wVE.copydefault(function1Copydefault, ((java.lang.Float) obj).floatValue());
                }
            });
        }
        if (view != null) {
            c47988uAv.setInputBasicsFunctionButton(view);
        }
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(Function1 function1, C47988uAv c47988uAv, C47988uAv c47988uAv2, java.lang.String str) {
        Intrinsics.checkNotNullParameter(c47988uAv2, "");
        if (function1 != null) {
            if (str == null) {
                str = "";
            }
            function1.invoke(str);
        }
        if (c47988uAv.getNewProxyInstance() && c47988uAv.fJNWhG() != 0.0f) {
            c47988uAv.OLrzqt(false);
        }
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(Function1 function1, C47988uAv c47988uAv, boolean z) {
        Intrinsics.checkNotNullParameter(c47988uAv, "");
        if (function1 != null) {
            function1.invoke(java.lang.Boolean.valueOf(z));
        }
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(Function1 function1, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (function1 != null) {
            function1.invoke(str);
        }
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(Function1 function1, float f) {
        function1.invoke(java.lang.Float.valueOf(f));
        return Unit.INSTANCE;
    }

    public static final Function1<java.lang.Float, Unit> copydefault(androidx.compose.runtime.State<? extends Function1<? super java.lang.Float, Unit>> state) {
        return (Function1) state.getValue();
    }
}
