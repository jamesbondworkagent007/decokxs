package o;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.ColorResources_androidKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.PrimitiveResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.profileinstaller.ProfileVerifier;
import com.amplifyframework.ui.liveness.ml.FaceDetector;
import com.google.android.exoplayer2.audio.WavUtil;
import com.google.api.client.googleapis.media.MediaHttpDownloader;
import com.okinc.business.defi.biz.core.error.WalletImportError;
import com.okinc.tradingbot.impl.widget.compose.BotIconStacksStyle;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.C48033uCm;
import o.C52761wXj;
import o.C55688xof;
import o.uIN;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import org.jetbrains.annotations.NotNull;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: loaded from: classes19.dex */
public final class uIN {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final Unit EZpvd(Modifier modifier, C48174uHs c48174uHs, boolean z, boolean z2, boolean z3, Function0 function0, Function0 function02, Function0 function03, Function0 function04, Function0 function05, int i, int i2, Composer composer, int i3) {
        copydefault(modifier, c48174uHs, z, z2, z3, function0, function02, function03, function04, function05, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final Unit EZpvd(java.lang.String str, Function0 function0, Modifier modifier, int i, int i2, Composer composer, int i3) {
        copydefault(str, (Function0<Unit>) function0, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final Unit KWHzl(Modifier modifier, java.lang.String str, java.lang.String str2, int i, boolean z, Function0 function0, int i2, int i3, Composer composer, int i4) {
        KWHzl(modifier, str, str2, i, z, (Function0<Unit>) function0, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final Unit OLrzqt(java.lang.String str, java.lang.String str2, java.lang.String str3, java.util.List list, Function0 function0, Modifier modifier, int i, int i2, Composer composer, int i3) {
        KWHzl(str, str2, str3, (java.util.List<C48178uHw>) list, (Function0<Unit>) function0, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final Unit copydefault(Modifier modifier, Function2 function2, int i, int i2, Composer composer, int i3) {
        KWHzl(modifier, function2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final Unit copydefault(Modifier modifier, boolean z, java.lang.String str, yHO yho, int i, int i2, Composer composer, int i3) {
        OLrzqt(modifier, z, str, yho, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final Unit copydefault(java.lang.String str, java.lang.String str2, java.lang.String str3, Function0 function0, Modifier modifier, int i, int i2, Composer composer, int i3) {
        AEQbTJ(str, str2, str3, function0, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final Unit djBIcL() {
        return Unit.INSTANCE;
    }

    public static final Unit AhwBna() {
        return Unit.INSTANCE;
    }

    public static final Unit gEmmrt() {
        return Unit.INSTANCE;
    }

    public static final Unit AYXKKw() {
        return Unit.INSTANCE;
    }

    public static final Unit valueOf() {
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0300  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0393  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x03b9  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x03ef  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x043b  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0450  */
    /* JADX WARN: Removed duplicated region for block: B:192:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0120  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void copydefault(Modifier modifier, @NotNull final C48174uHs c48174uHs, boolean z, boolean z2, boolean z3, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, Function0<Unit> function04, Function0<Unit> function05, Composer composer, final int i, final int i2) {
        int i3;
        int i4;
        boolean z4;
        int i5;
        boolean z5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        boolean z6;
        Function0<Unit> function06;
        Function0<Unit> function07;
        Function0<Unit> function08;
        Function0<Unit> function09;
        Function0<Unit> function010;
        Modifier modifier2;
        int currentCompositeKeyHash;
        Composer composerM2783constructorimpl;
        Function2<ComposeUiNode, java.lang.Integer, Unit> setCompositeKeyHash;
        int i11;
        float f;
        final boolean z7;
        final boolean z8;
        final Function0<Unit> function011;
        final Function0<Unit> function012;
        final Function0<Unit> function013;
        final Function0<Unit> function014;
        final Function0<Unit> function015;
        final boolean z9;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(c48174uHs, "");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1013862875);
        int i12 = i2 & 1;
        if (i12 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(c48174uHs) ? 32 : 16;
        }
        int i13 = i2 & 4;
        if (i13 != 0) {
            i3 |= MLKEMEngine.KyberPolyBytes;
        } else {
            if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
                i3 |= composerStartRestartGroup.changed(z) ? 256 : 128;
            }
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else {
                if ((i & 3072) == 0) {
                    z4 = z2;
                    i3 |= composerStartRestartGroup.changed(z4) ? 2048 : 1024;
                }
                i5 = i2 & 16;
                if (i5 == 0) {
                    if ((i & 24576) == 0) {
                        z5 = z3;
                        i3 |= composerStartRestartGroup.changed(z5) ? 16384 : 8192;
                    }
                    i6 = i2 & 32;
                    if (i6 == 0) {
                        i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    } else if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                        i3 |= composerStartRestartGroup.changedInstance(function0) ? 131072 : 65536;
                    }
                    i7 = i2 & 64;
                    if (i7 == 0) {
                        i3 |= 1572864;
                    } else if ((i & 1572864) == 0) {
                        i3 |= composerStartRestartGroup.changedInstance(function02) ? 1048576 : 524288;
                    }
                    i8 = i2 & 128;
                    if (i8 == 0) {
                        i3 |= 12582912;
                    } else if ((i & 12582912) == 0) {
                        i3 |= composerStartRestartGroup.changedInstance(function03) ? 8388608 : 4194304;
                    }
                    i9 = i2 & 256;
                    if (i9 == 0) {
                        i3 |= 100663296;
                    } else if ((i & 100663296) == 0) {
                        i3 |= composerStartRestartGroup.changedInstance(function04) ? 67108864 : MediaHttpDownloader.MAXIMUM_CHUNK_SIZE;
                    }
                    i10 = i2 & 512;
                    if (i10 == 0) {
                        i3 |= com.google.android.exoplayer2.C.ENCODING_PCM_32BIT;
                    } else if ((i & com.google.android.exoplayer2.C.ENCODING_PCM_32BIT) == 0) {
                        i3 |= composerStartRestartGroup.changedInstance(function05) ? 536870912 : 268435456;
                    }
                    if ((i3 & 306783379) == 306783378 || !composerStartRestartGroup.getSkipping()) {
                        Modifier modifier3 = i12 == 0 ? Modifier.Companion : modifier;
                        z6 = i13 == 0 ? false : z;
                        if (i4 != 0) {
                            z4 = false;
                        }
                        boolean z10 = i5 == 0 ? false : z5;
                        if (i6 == 0) {
                            composerStartRestartGroup.startReplaceableGroup(408491674);
                            java.lang.Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.Companion.getEmpty()) {
                                objRememberedValue = new Function0() { // from class: o.uIV
                                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                    @Override // kotlin.jvm.functions.Function0
                                    public final java.lang.Object invoke() {
                                        return uIN.djBIcL();
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            function06 = (Function0) objRememberedValue;
                            composerStartRestartGroup.endReplaceableGroup();
                        } else {
                            function06 = function0;
                        }
                        if (i7 == 0) {
                            composerStartRestartGroup.startReplaceableGroup(408493018);
                            java.lang.Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue2 == Composer.Companion.getEmpty()) {
                                objRememberedValue2 = new Function0() { // from class: o.uIW
                                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                    @Override // kotlin.jvm.functions.Function0
                                    public final java.lang.Object invoke() {
                                        return uIN.AhwBna();
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            function07 = (Function0) objRememberedValue2;
                        } else {
                            function07 = function02;
                        }
                        if (i8 == 0) {
                            composerStartRestartGroup.startReplaceableGroup(408494586);
                            java.lang.Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue3 == Composer.Companion.getEmpty()) {
                                objRememberedValue3 = new Function0() { // from class: o.uJa
                                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                    @Override // kotlin.jvm.functions.Function0
                                    public final java.lang.Object invoke() {
                                        return uIN.gEmmrt();
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                            }
                            function08 = (Function0) objRememberedValue3;
                            composerStartRestartGroup.endReplaceableGroup();
                        } else {
                            function08 = function03;
                        }
                        if (i9 == 0) {
                            composerStartRestartGroup.startReplaceableGroup(408495770);
                            java.lang.Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue4 == Composer.Companion.getEmpty()) {
                                objRememberedValue4 = new Function0() { // from class: o.uIZ
                                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                    @Override // kotlin.jvm.functions.Function0
                                    public final java.lang.Object invoke() {
                                        return uIN.AYXKKw();
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                            }
                            function09 = (Function0) objRememberedValue4;
                            composerStartRestartGroup.endReplaceableGroup();
                        } else {
                            function09 = function04;
                        }
                        if (i10 == 0) {
                            composerStartRestartGroup.startReplaceableGroup(408497146);
                            java.lang.Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue5 == Composer.Companion.getEmpty()) {
                                objRememberedValue5 = new Function0() { // from class: o.uIP
                                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                    @Override // kotlin.jvm.functions.Function0
                                    public final java.lang.Object invoke() {
                                        return uIN.valueOf();
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                            }
                            function010 = (Function0) objRememberedValue5;
                            composerStartRestartGroup.endReplaceableGroup();
                        } else {
                            function010 = function05;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1013862875, i3, -1, "com.okinc.tradingbot.impl.botDetail.ui.llmSignal.LLMSignalDetailsComposable (LLMSignalDetailsComposable.kt:82)");
                        }
                        modifier2 = modifier3;
                        float f2 = 20;
                        Modifier modifierM675paddingqDBjuR0$default = PaddingKt.m675paddingqDBjuR0$default(PaddingKt.m673paddingVpY3zN4$default(ScrollKt.verticalScroll$default(modifier3, ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), false, null, false, 14, null), PrimitiveResources_androidKt.dimensionResource(C52761wXj.StateListAnimator.AEQbTJ, composerStartRestartGroup, 0), 0.0f, 2, null), 0.0f, androidx.compose.ui.unit.Dp.m5414constructorimpl(f2), 0.0f, androidx.compose.ui.unit.Dp.m5414constructorimpl(24), 5, null);
                        Arrangement.HorizontalOrVertical horizontalOrVerticalM582spacedBy0680j_4 = Arrangement.INSTANCE.m582spacedBy0680j_4(androidx.compose.ui.unit.Dp.m5414constructorimpl(f2));
                        composerStartRestartGroup.startReplaceableGroup(-483455358);
                        MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(horizontalOrVerticalM582spacedBy0680j_4, Alignment.Companion.getStart(), composerStartRestartGroup, 6);
                        composerStartRestartGroup.startReplaceableGroup(-1323940314);
                        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        ComposeUiNode.Companion companion = ComposeUiNode.Companion;
                        Function0<ComposeUiNode> constructor = companion.getConstructor();
                        yHO<SkippableUpdater<ComposeUiNode>, Composer, java.lang.Integer, Unit> yhoModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM675paddingqDBjuR0$default);
                        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (!composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(constructor);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        composerM2783constructorimpl = Updater.m2783constructorimpl(composerStartRestartGroup);
                        Updater.m2790setimpl(composerM2783constructorimpl, measurePolicyColumnMeasurePolicy, companion.getSetMeasurePolicy());
                        Updater.m2790setimpl(composerM2783constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                        setCompositeKeyHash = companion.getSetCompositeKeyHash();
                        if (!composerM2783constructorimpl.getInserting() || !Intrinsics.EZpvd(composerM2783constructorimpl.rememberedValue(), java.lang.Integer.valueOf(currentCompositeKeyHash))) {
                            composerM2783constructorimpl.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash));
                            composerM2783constructorimpl.apply(java.lang.Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        yhoModifierMaterializerOf.invoke(SkippableUpdater.m2774boximpl(SkippableUpdater.m2775constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(2058660585);
                        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                        KWHzl(c48174uHs.EZpvd().OLrzqt(), c48174uHs.EZpvd().AEQbTJ(), c48174uHs.KWHzl(), c48174uHs.djBIcL(), function06, (Modifier) null, composerStartRestartGroup, (i3 >> 3) & 57344, 32);
                        AEQbTJ(c48174uHs.AEQbTJ(), c48174uHs.OLrzqt(), c48174uHs.valueOf(), function08, null, composerStartRestartGroup, (i3 >> 12) & 7168, 16);
                        composerStartRestartGroup.startReplaceableGroup(1420953049);
                        if (c48174uHs.AYXKKw().length() > 0) {
                            copydefault(c48174uHs.AYXKKw(), function07, (Modifier) null, composerStartRestartGroup, (i3 >> 15) & WalletImportError.ERROR_CODE_AA_EXIST, 4);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.startReplaceableGroup(1420961607);
                        if (z6) {
                            i11 = 1;
                            f = 0.0f;
                        } else {
                            f = 0.0f;
                            i11 = 1;
                            C52736wWl.KWHzl(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), 52, 260, StringResources_androidKt.stringResource(z4 ? C48033uCm.Fragment.QOLQEE : C55688xof.Application.PlaybackStateCompat1, composerStartRestartGroup, 0), null, null, function09, composerStartRestartGroup, ((i3 >> 6) & 3670016) | 438, 48);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.startReplaceableGroup(1420976926);
                        if (z4 && z10) {
                            C52736wWl.KWHzl(SizeKt.fillMaxWidth$default(Modifier.Companion, f, i11, null), 52, 260, StringResources_androidKt.stringResource(C48033uCm.Fragment.QKVWgx, composerStartRestartGroup, 0), null, null, function010, composerStartRestartGroup, ((i3 >> 9) & 3670016) | 438, 48);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endNode();
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endReplaceableGroup();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        z7 = z6;
                        z8 = z10;
                        function011 = function06;
                        function012 = function07;
                        function013 = function08;
                        function014 = function09;
                        boolean z11 = z4;
                        function015 = function010;
                        z9 = z11;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        modifier2 = modifier;
                        z7 = z;
                        function011 = function0;
                        function012 = function02;
                        function013 = function03;
                        function014 = function04;
                        z9 = z4;
                        z8 = z5;
                        function015 = function05;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        final Modifier modifier4 = modifier2;
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: o.uIS
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function2
                            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                return uIN.EZpvd(modifier4, c48174uHs, z7, z9, z8, function011, function012, function013, function014, function015, i, i2, (Composer) obj, ((java.lang.Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                i3 |= 24576;
                z5 = z3;
                i6 = i2 & 32;
                if (i6 == 0) {
                }
                i7 = i2 & 64;
                if (i7 == 0) {
                }
                i8 = i2 & 128;
                if (i8 == 0) {
                }
                i9 = i2 & 256;
                if (i9 == 0) {
                }
                i10 = i2 & 512;
                if (i10 == 0) {
                }
                if ((i3 & 306783379) == 306783378) {
                    if (i12 == 0) {
                    }
                    if (i13 == 0) {
                    }
                    if (i4 != 0) {
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
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier2 = modifier3;
                    float f22 = 20;
                    Modifier modifierM675paddingqDBjuR0$default2 = PaddingKt.m675paddingqDBjuR0$default(PaddingKt.m673paddingVpY3zN4$default(ScrollKt.verticalScroll$default(modifier3, ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), false, null, false, 14, null), PrimitiveResources_androidKt.dimensionResource(C52761wXj.StateListAnimator.AEQbTJ, composerStartRestartGroup, 0), 0.0f, 2, null), 0.0f, androidx.compose.ui.unit.Dp.m5414constructorimpl(f22), 0.0f, androidx.compose.ui.unit.Dp.m5414constructorimpl(24), 5, null);
                    Arrangement.HorizontalOrVertical horizontalOrVerticalM582spacedBy0680j_42 = Arrangement.INSTANCE.m582spacedBy0680j_4(androidx.compose.ui.unit.Dp.m5414constructorimpl(f22));
                    composerStartRestartGroup.startReplaceableGroup(-483455358);
                    MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(horizontalOrVerticalM582spacedBy0680j_42, Alignment.Companion.getStart(), composerStartRestartGroup, 6);
                    composerStartRestartGroup.startReplaceableGroup(-1323940314);
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
                    Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
                    yHO<SkippableUpdater<ComposeUiNode>, Composer, java.lang.Integer, Unit> yhoModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierM675paddingqDBjuR0$default2);
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (!composerStartRestartGroup.getInserting()) {
                    }
                    composerM2783constructorimpl = Updater.m2783constructorimpl(composerStartRestartGroup);
                    Updater.m2790setimpl(composerM2783constructorimpl, measurePolicyColumnMeasurePolicy2, companion2.getSetMeasurePolicy());
                    Updater.m2790setimpl(composerM2783constructorimpl, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
                    setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                    if (!composerM2783constructorimpl.getInserting()) {
                        composerM2783constructorimpl.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash));
                        composerM2783constructorimpl.apply(java.lang.Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        yhoModifierMaterializerOf2.invoke(SkippableUpdater.m2774boximpl(SkippableUpdater.m2775constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(2058660585);
                        ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                        KWHzl(c48174uHs.EZpvd().OLrzqt(), c48174uHs.EZpvd().AEQbTJ(), c48174uHs.KWHzl(), c48174uHs.djBIcL(), function06, (Modifier) null, composerStartRestartGroup, (i3 >> 3) & 57344, 32);
                        AEQbTJ(c48174uHs.AEQbTJ(), c48174uHs.OLrzqt(), c48174uHs.valueOf(), function08, null, composerStartRestartGroup, (i3 >> 12) & 7168, 16);
                        composerStartRestartGroup.startReplaceableGroup(1420953049);
                        if (c48174uHs.AYXKKw().length() > 0) {
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.startReplaceableGroup(1420961607);
                        if (z6) {
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.startReplaceableGroup(1420976926);
                        if (z4) {
                            C52736wWl.KWHzl(SizeKt.fillMaxWidth$default(Modifier.Companion, f, i11, null), 52, 260, StringResources_androidKt.stringResource(C48033uCm.Fragment.QKVWgx, composerStartRestartGroup, 0), null, null, function010, composerStartRestartGroup, ((i3 >> 9) & 3670016) | 438, 48);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endNode();
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endReplaceableGroup();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        z7 = z6;
                        z8 = z10;
                        function011 = function06;
                        function012 = function07;
                        function013 = function08;
                        function014 = function09;
                        boolean z112 = z4;
                        function015 = function010;
                        z9 = z112;
                    }
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            z4 = z2;
            i5 = i2 & 16;
            if (i5 == 0) {
            }
            z5 = z3;
            i6 = i2 & 32;
            if (i6 == 0) {
            }
            i7 = i2 & 64;
            if (i7 == 0) {
            }
            i8 = i2 & 128;
            if (i8 == 0) {
            }
            i9 = i2 & 256;
            if (i9 == 0) {
            }
            i10 = i2 & 512;
            if (i10 == 0) {
            }
            if ((i3 & 306783379) == 306783378) {
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        z4 = z2;
        i5 = i2 & 16;
        if (i5 == 0) {
        }
        z5 = z3;
        i6 = i2 & 32;
        if (i6 == 0) {
        }
        i7 = i2 & 64;
        if (i7 == 0) {
        }
        i8 = i2 & 128;
        if (i8 == 0) {
        }
        i9 = i2 & 256;
        if (i9 == 0) {
        }
        i10 = i2 & 512;
        if (i10 == 0) {
        }
        if ((i3 & 306783379) == 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    public static final class TaskDescription implements Function2<Composer, java.lang.Integer, Unit> {
        public final /* synthetic */ java.util.List<C48178uHw> AEQbTJ;
        public final /* synthetic */ java.lang.String EZpvd;
        public final /* synthetic */ java.lang.String KWHzl;
        public final /* synthetic */ Function0<Unit> OLrzqt;
        public final /* synthetic */ java.lang.String copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(java.lang.String str, java.lang.String str2, java.lang.String str3, Function0<Unit> function0, java.util.List<C48178uHw> list) {
            this.KWHzl = str;
            this.copydefault = str2;
            this.EZpvd = str3;
            this.OLrzqt = function0;
            this.AEQbTJ = list;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function2
        public /* synthetic */ Unit invoke(Composer composer, java.lang.Integer num) {
            AEQbTJ(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void AEQbTJ(Composer composer, int i) {
            if ((i & 3) != 2 || !composer.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1086518067, i, -1, "com.okinc.tradingbot.impl.botDetail.ui.llmSignal.SignalInfoSection.<anonymous> (LLMSignalDetailsComposable.kt:153)");
                }
                Arrangement.HorizontalOrVertical horizontalOrVerticalM582spacedBy0680j_4 = Arrangement.INSTANCE.m582spacedBy0680j_4(androidx.compose.ui.unit.Dp.m5414constructorimpl(16));
                java.lang.String str = this.KWHzl;
                java.lang.String str2 = this.copydefault;
                java.lang.String str3 = this.EZpvd;
                Function0<Unit> function0 = this.OLrzqt;
                java.util.List<C48178uHw> list = this.AEQbTJ;
                composer.startReplaceableGroup(-483455358);
                Modifier.Companion companion = Modifier.Companion;
                MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(horizontalOrVerticalM582spacedBy0680j_4, Alignment.Companion.getStart(), composer, 6);
                composer.startReplaceableGroup(-1323940314);
                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
                Function0<ComposeUiNode> constructor = companion2.getConstructor();
                yHO<SkippableUpdater<ComposeUiNode>, Composer, java.lang.Integer, Unit> yhoModifierMaterializerOf = LayoutKt.modifierMaterializerOf(companion);
                if (!(composer.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer.startReusableNode();
                if (composer.getInserting()) {
                    composer.createNode(constructor);
                } else {
                    composer.useNode();
                }
                Composer composerM2783constructorimpl = Updater.m2783constructorimpl(composer);
                Updater.m2790setimpl(composerM2783constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                Updater.m2790setimpl(composerM2783constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, java.lang.Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                if (composerM2783constructorimpl.getInserting() || !Intrinsics.EZpvd(composerM2783constructorimpl.rememberedValue(), java.lang.Integer.valueOf(currentCompositeKeyHash))) {
                    composerM2783constructorimpl.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash));
                    composerM2783constructorimpl.apply(java.lang.Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                yhoModifierMaterializerOf.invoke(SkippableUpdater.m2774boximpl(SkippableUpdater.m2775constructorimpl(composer)), composer, 0);
                composer.startReplaceableGroup(2058660585);
                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                uIN.OLrzqt(null, false, StringResources_androidKt.stringResource(C48033uCm.Fragment.ffGIBT, composer, 0), ComposableLambdaKt.composableLambda(composer, -566912743, true, new Activity(str2, str3)), composer, 3072, 3);
                uIN.KWHzl((Modifier) null, StringResources_androidKt.stringResource(C48033uCm.Fragment.fXHmeK, composer, 0), str, 0, false, (Function0<Unit>) null, composer, 0, 57);
                uIN.OLrzqt(null, false, StringResources_androidKt.stringResource(C48033uCm.Fragment.iZzfmt, composer, 0), ComposableLambdaKt.composableLambda(composer, 125763857, true, new C0976TaskDescription(function0, list)), composer, 3072, 3);
                composer.endReplaceableGroup();
                composer.endNode();
                composer.endReplaceableGroup();
                composer.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                    return;
                }
                return;
            }
            composer.skipToGroupEnd();
        }

        public static final class Activity implements yHO<RowScope, Composer, java.lang.Integer, Unit> {
            public final /* synthetic */ java.lang.String AEQbTJ;
            public final /* synthetic */ java.lang.String EZpvd;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public Activity(java.lang.String str, java.lang.String str2) {
                this.AEQbTJ = str;
                this.EZpvd = str2;
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // o.yHO
            public /* synthetic */ Unit invoke(RowScope rowScope, Composer composer, java.lang.Integer num) {
                KWHzl(rowScope, composer, num.intValue());
                return Unit.INSTANCE;
            }

            public final void KWHzl(RowScope rowScope, Composer composer, int i) {
                Intrinsics.checkNotNullParameter(rowScope, "");
                if ((i & 17) != 16 || !composer.getSkipping()) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-566912743, i, -1, "com.okinc.tradingbot.impl.botDetail.ui.llmSignal.SignalInfoSection.<anonymous>.<anonymous>.<anonymous> (LLMSignalDetailsComposable.kt:158)");
                    }
                    Arrangement.HorizontalOrVertical horizontalOrVerticalM582spacedBy0680j_4 = Arrangement.INSTANCE.m582spacedBy0680j_4(androidx.compose.ui.unit.Dp.m5414constructorimpl(4));
                    Alignment.Companion companion = Alignment.Companion;
                    Alignment.Vertical centerVertically = companion.getCenterVertically();
                    java.lang.String str = this.AEQbTJ;
                    java.lang.String str2 = this.EZpvd;
                    composer.startReplaceableGroup(693286680);
                    Modifier.Companion companion2 = Modifier.Companion;
                    MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(horizontalOrVerticalM582spacedBy0680j_4, centerVertically, composer, 54);
                    composer.startReplaceableGroup(-1323940314);
                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                    ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
                    Function0<ComposeUiNode> constructor = companion3.getConstructor();
                    yHO<SkippableUpdater<ComposeUiNode>, Composer, java.lang.Integer, Unit> yhoModifierMaterializerOf = LayoutKt.modifierMaterializerOf(companion2);
                    if (!(composer.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer.startReusableNode();
                    if (composer.getInserting()) {
                        composer.createNode(constructor);
                    } else {
                        composer.useNode();
                    }
                    Composer composerM2783constructorimpl = Updater.m2783constructorimpl(composer);
                    Updater.m2790setimpl(composerM2783constructorimpl, measurePolicyRowMeasurePolicy, companion3.getSetMeasurePolicy());
                    Updater.m2790setimpl(composerM2783constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, java.lang.Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                    if (composerM2783constructorimpl.getInserting() || !Intrinsics.EZpvd(composerM2783constructorimpl.rememberedValue(), java.lang.Integer.valueOf(currentCompositeKeyHash))) {
                        composerM2783constructorimpl.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash));
                        composerM2783constructorimpl.apply(java.lang.Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    yhoModifierMaterializerOf.invoke(SkippableUpdater.m2774boximpl(SkippableUpdater.m2775constructorimpl(composer)), composer, 0);
                    composer.startReplaceableGroup(2058660585);
                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                    float f = 20;
                    Modifier modifierM350backgroundbw27NRU$default = BackgroundKt.m350backgroundbw27NRU$default(ClipKt.clip(SizeKt.m718size3ABfNKs(companion2, androidx.compose.ui.unit.Dp.m5414constructorimpl(f)), RoundedCornerShapeKt.m924RoundedCornerShape0680j_4(androidx.compose.ui.unit.Dp.m5414constructorimpl(10))), ColorResources_androidKt.colorResource(C52761wXj.Activity.invokespecialODCBUN, composer, 0), null, 2, null);
                    composer.startReplaceableGroup(733328855);
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(companion.getTopStart(), false, composer, 0);
                    composer.startReplaceableGroup(-1323940314);
                    int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
                    Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                    yHO<SkippableUpdater<ComposeUiNode>, Composer, java.lang.Integer, Unit> yhoModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierM350backgroundbw27NRU$default);
                    if (!(composer.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer.startReusableNode();
                    if (composer.getInserting()) {
                        composer.createNode(constructor2);
                    } else {
                        composer.useNode();
                    }
                    Composer composerM2783constructorimpl2 = Updater.m2783constructorimpl(composer);
                    Updater.m2790setimpl(composerM2783constructorimpl2, measurePolicyRememberBoxMeasurePolicy, companion3.getSetMeasurePolicy());
                    Updater.m2790setimpl(composerM2783constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, java.lang.Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
                    if (composerM2783constructorimpl2.getInserting() || !Intrinsics.EZpvd(composerM2783constructorimpl2.rememberedValue(), java.lang.Integer.valueOf(currentCompositeKeyHash2))) {
                        composerM2783constructorimpl2.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash2));
                        composerM2783constructorimpl2.apply(java.lang.Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                    }
                    yhoModifierMaterializerOf2.invoke(SkippableUpdater.m2774boximpl(SkippableUpdater.m2775constructorimpl(composer)), composer, 0);
                    composer.startReplaceableGroup(2058660585);
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    C52727wWc.OLrzqt(SizeKt.m718size3ABfNKs(companion2, androidx.compose.ui.unit.Dp.m5414constructorimpl(f)), str2, C52761wXj.TaskDescription.DuR, composer, 6, 0);
                    composer.endReplaceableGroup();
                    composer.endNode();
                    composer.endReplaceableGroup();
                    composer.endReplaceableGroup();
                    TextKt.m2072Text4IGK_g(str, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.Companion.m5334getEllipsisgIe3tQ8(), false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, C52698wVa.OLrzqt(C52761wXj.LoaderManager.gHZMYf, java.lang.Integer.valueOf(C52761wXj.Activity.fdOvFl), composer, 0, 0), composer, 0, 3120, 55294);
                    composer.endReplaceableGroup();
                    composer.endNode();
                    composer.endReplaceableGroup();
                    composer.endReplaceableGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        return;
                    }
                    return;
                }
                composer.skipToGroupEnd();
            }
        }

        /* JADX INFO: renamed from: o.uIN$TaskDescription$TaskDescription, reason: collision with other inner class name */
        public static final class C0976TaskDescription implements yHO<RowScope, Composer, java.lang.Integer, Unit> {
            public final /* synthetic */ java.util.List<C48178uHw> KWHzl;
            public final /* synthetic */ Function0<Unit> copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public C0976TaskDescription(Function0<Unit> function0, java.util.List<C48178uHw> list) {
                this.copydefault = function0;
                this.KWHzl = list;
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // o.yHO
            public /* synthetic */ Unit invoke(RowScope rowScope, Composer composer, java.lang.Integer num) {
                copydefault(rowScope, composer, num.intValue());
                return Unit.INSTANCE;
            }

            public final void copydefault(RowScope rowScope, Composer composer, int i) {
                Intrinsics.checkNotNullParameter(rowScope, "");
                if ((i & 17) != 16 || !composer.getSkipping()) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(125763857, i, -1, "com.okinc.tradingbot.impl.botDetail.ui.llmSignal.SignalInfoSection.<anonymous>.<anonymous>.<anonymous> (LLMSignalDetailsComposable.kt:198)");
                    }
                    Modifier.Companion companion = Modifier.Companion;
                    Modifier modifierEZpvd = C49551uqg.EZpvd(companion, this.copydefault);
                    Arrangement arrangement = Arrangement.INSTANCE;
                    Arrangement.HorizontalOrVertical horizontalOrVerticalM582spacedBy0680j_4 = arrangement.m582spacedBy0680j_4(androidx.compose.ui.unit.Dp.m5414constructorimpl(10));
                    Alignment.Companion companion2 = Alignment.Companion;
                    Alignment.Vertical centerVertically = companion2.getCenterVertically();
                    java.util.List<C48178uHw> list = this.KWHzl;
                    composer.startReplaceableGroup(693286680);
                    MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(horizontalOrVerticalM582spacedBy0680j_4, centerVertically, composer, 54);
                    composer.startReplaceableGroup(-1323940314);
                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                    ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
                    Function0<ComposeUiNode> constructor = companion3.getConstructor();
                    yHO<SkippableUpdater<ComposeUiNode>, Composer, java.lang.Integer, Unit> yhoModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierEZpvd);
                    if (!(composer.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer.startReusableNode();
                    if (composer.getInserting()) {
                        composer.createNode(constructor);
                    } else {
                        composer.useNode();
                    }
                    Composer composerM2783constructorimpl = Updater.m2783constructorimpl(composer);
                    Updater.m2790setimpl(composerM2783constructorimpl, measurePolicyRowMeasurePolicy, companion3.getSetMeasurePolicy());
                    Updater.m2790setimpl(composerM2783constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, java.lang.Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                    if (composerM2783constructorimpl.getInserting() || !Intrinsics.EZpvd(composerM2783constructorimpl.rememberedValue(), java.lang.Integer.valueOf(currentCompositeKeyHash))) {
                        composerM2783constructorimpl.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash));
                        composerM2783constructorimpl.apply(java.lang.Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    yhoModifierMaterializerOf.invoke(SkippableUpdater.m2774boximpl(SkippableUpdater.m2775constructorimpl(composer)), composer, 0);
                    composer.startReplaceableGroup(2058660585);
                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                    if (list.size() == 1) {
                        composer.startReplaceableGroup(495288643);
                        Arrangement.HorizontalOrVertical horizontalOrVerticalM582spacedBy0680j_42 = arrangement.m582spacedBy0680j_4(androidx.compose.ui.unit.Dp.m5414constructorimpl(4));
                        Alignment.Vertical centerVertically2 = companion2.getCenterVertically();
                        composer.startReplaceableGroup(693286680);
                        MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(horizontalOrVerticalM582spacedBy0680j_42, centerVertically2, composer, 54);
                        composer.startReplaceableGroup(-1323940314);
                        int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                        CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
                        Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                        yHO<SkippableUpdater<ComposeUiNode>, Composer, java.lang.Integer, Unit> yhoModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(companion);
                        if (!(composer.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer.startReusableNode();
                        if (composer.getInserting()) {
                            composer.createNode(constructor2);
                        } else {
                            composer.useNode();
                        }
                        Composer composerM2783constructorimpl2 = Updater.m2783constructorimpl(composer);
                        Updater.m2790setimpl(composerM2783constructorimpl2, measurePolicyRowMeasurePolicy2, companion3.getSetMeasurePolicy());
                        Updater.m2790setimpl(composerM2783constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, java.lang.Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
                        if (composerM2783constructorimpl2.getInserting() || !Intrinsics.EZpvd(composerM2783constructorimpl2.rememberedValue(), java.lang.Integer.valueOf(currentCompositeKeyHash2))) {
                            composerM2783constructorimpl2.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash2));
                            composerM2783constructorimpl2.apply(java.lang.Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                        }
                        yhoModifierMaterializerOf2.invoke(SkippableUpdater.m2774boximpl(SkippableUpdater.m2775constructorimpl(composer)), composer, 0);
                        composer.startReplaceableGroup(2058660585);
                        C52727wWc.OLrzqt(ClipKt.clip(PaddingKt.m671padding3ABfNKs(BorderKt.m361borderxT4_qwU(SizeKt.m718size3ABfNKs(companion, androidx.compose.ui.unit.Dp.m5414constructorimpl(20)), androidx.compose.ui.unit.Dp.m5414constructorimpl(1), ColorResources_androidKt.colorResource(C52761wXj.Activity.iUnTnt, composer, 0), RoundedCornerShapeKt.getCircleShape()), androidx.compose.ui.unit.Dp.m5414constructorimpl((float) 0.5d)), RoundedCornerShapeKt.getCircleShape()), ((C48178uHw) CollectionsKt___CollectionsKt.AuCTelauCTel(list)).KWHzl(), C52761wXj.TaskDescription.DuR, composer, 0, 0);
                        TextKt.m2072Text4IGK_g(((C48178uHw) CollectionsKt___CollectionsKt.AuCTelauCTel(list)).copydefault(), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, C52698wVa.OLrzqt(C52761wXj.LoaderManager.gHZMYf, java.lang.Integer.valueOf(C52761wXj.Activity.fdOvFl), composer, 0, 0), composer, 0, 0, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE);
                        composer.endReplaceableGroup();
                        composer.endNode();
                        composer.endReplaceableGroup();
                        composer.endReplaceableGroup();
                        composer.endReplaceableGroup();
                    } else if (!list.isEmpty()) {
                        composer.startReplaceableGroup(496844285);
                        Arrangement.Horizontal end = arrangement.getEnd();
                        Alignment.Vertical centerVertically3 = companion2.getCenterVertically();
                        composer.startReplaceableGroup(693286680);
                        MeasurePolicy measurePolicyRowMeasurePolicy3 = RowKt.rowMeasurePolicy(end, centerVertically3, composer, 54);
                        composer.startReplaceableGroup(-1323940314);
                        int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                        CompositionLocalMap currentCompositionLocalMap3 = composer.getCurrentCompositionLocalMap();
                        Function0<ComposeUiNode> constructor3 = companion3.getConstructor();
                        yHO<SkippableUpdater<ComposeUiNode>, Composer, java.lang.Integer, Unit> yhoModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(companion);
                        if (!(composer.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer.startReusableNode();
                        if (composer.getInserting()) {
                            composer.createNode(constructor3);
                        } else {
                            composer.useNode();
                        }
                        Composer composerM2783constructorimpl3 = Updater.m2783constructorimpl(composer);
                        Updater.m2790setimpl(composerM2783constructorimpl3, measurePolicyRowMeasurePolicy3, companion3.getSetMeasurePolicy());
                        Updater.m2790setimpl(composerM2783constructorimpl3, currentCompositionLocalMap3, companion3.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, java.lang.Integer, Unit> setCompositeKeyHash3 = companion3.getSetCompositeKeyHash();
                        if (composerM2783constructorimpl3.getInserting() || !Intrinsics.EZpvd(composerM2783constructorimpl3.rememberedValue(), java.lang.Integer.valueOf(currentCompositeKeyHash3))) {
                            composerM2783constructorimpl3.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash3));
                            composerM2783constructorimpl3.apply(java.lang.Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                        }
                        yhoModifierMaterializerOf3.invoke(SkippableUpdater.m2774boximpl(SkippableUpdater.m2775constructorimpl(composer)), composer, 0);
                        composer.startReplaceableGroup(2058660585);
                        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
                        java.util.Iterator<T> it = list.iterator();
                        while (it.hasNext()) {
                            arrayList.add(((C48178uHw) it.next()).KWHzl());
                        }
                        C52716wVs.AEQbTJ(null, arrayList, androidx.compose.ui.unit.Dp.m5414constructorimpl(20), 0, 2, BotIconStacksStyle.COMPACT, false, composer, 221568, 73);
                        IconKt.m1755Iconww6aTOc(PainterResources_androidKt.painterResource(C52761wXj.TaskDescription.DGOPHZDGOPHZ, composer, 0), (java.lang.String) null, SizeKt.m718size3ABfNKs(Modifier.Companion, androidx.compose.ui.unit.Dp.m5414constructorimpl(16)), ColorResources_androidKt.colorResource(C52761wXj.Activity.fdOvFl, composer, 0), composer, 432, 0);
                        composer.endReplaceableGroup();
                        composer.endNode();
                        composer.endReplaceableGroup();
                        composer.endReplaceableGroup();
                        composer.endReplaceableGroup();
                    } else {
                        composer.startReplaceableGroup(497938709);
                        composer.endReplaceableGroup();
                    }
                    composer.endReplaceableGroup();
                    composer.endNode();
                    composer.endReplaceableGroup();
                    composer.endReplaceableGroup();
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

    /* JADX WARN: Removed duplicated region for block: B:26:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:87:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void KWHzl(final java.lang.String str, final java.lang.String str2, final java.lang.String str3, final java.util.List<C48178uHw> list, final Function0<Unit> function0, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        int i4;
        Modifier modifier2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-416170781);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else {
            if ((i & 48) == 0) {
                i3 |= composerStartRestartGroup.changed(str2) ? 32 : 16;
            }
            if ((i2 & 4) == 0) {
                i3 |= MLKEMEngine.KyberPolyBytes;
            } else {
                if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
                    i3 |= composerStartRestartGroup.changed(str3) ? 256 : 128;
                }
                if ((i2 & 8) != 0) {
                    i3 |= 3072;
                } else {
                    if ((i & 3072) == 0) {
                        i3 |= composerStartRestartGroup.changedInstance(list) ? 2048 : 1024;
                    }
                    if ((i2 & 16) == 0) {
                        i3 |= 24576;
                    } else if ((i & 24576) == 0) {
                        i3 |= composerStartRestartGroup.changedInstance(function0) ? 16384 : 8192;
                    }
                    i4 = i2 & 32;
                    if (i4 != 0) {
                        if ((196608 & i) == 0) {
                            modifier2 = modifier;
                            i3 |= composerStartRestartGroup.changed(modifier2) ? 131072 : 65536;
                        }
                        if ((74899 & i3) != 74898 || !composerStartRestartGroup.getSkipping()) {
                            Modifier modifier3 = i4 == 0 ? Modifier.Companion : modifier2;
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-416170781, i3, -1, "com.okinc.tradingbot.impl.botDetail.ui.llmSignal.SignalInfoSection (LLMSignalDetailsComposable.kt:151)");
                            }
                            KWHzl(modifier3, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1086518067, true, new TaskDescription(str3, str, str2, function0, list)), composerStartRestartGroup, ((i3 >> 15) & 14) | 48, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier2 = modifier3;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                            final Modifier modifier4 = modifier2;
                            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: o.uIQ
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                @Override // kotlin.jvm.functions.Function2
                                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                    return uIN.OLrzqt(str, str2, str3, list, function0, modifier4, i, i2, (Composer) obj, ((java.lang.Integer) obj2).intValue());
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    modifier2 = modifier;
                    if ((74899 & i3) != 74898) {
                        if (i4 == 0) {
                        }
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        KWHzl(modifier3, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1086518067, true, new TaskDescription(str3, str, str2, function0, list)), composerStartRestartGroup, ((i3 >> 15) & 14) | 48, 0);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        modifier2 = modifier3;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                if ((i2 & 16) == 0) {
                }
                i4 = i2 & 32;
                if (i4 != 0) {
                }
                modifier2 = modifier;
                if ((74899 & i3) != 74898) {
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            if ((i2 & 8) != 0) {
            }
            if ((i2 & 16) == 0) {
            }
            i4 = i2 & 32;
            if (i4 != 0) {
            }
            modifier2 = modifier;
            if ((74899 & i3) != 74898) {
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        if ((i2 & 4) == 0) {
        }
        if ((i2 & 8) != 0) {
        }
        if ((i2 & 16) == 0) {
        }
        i4 = i2 & 32;
        if (i4 != 0) {
        }
        modifier2 = modifier;
        if ((74899 & i3) != 74898) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    public static final class Activity implements Function2<Composer, java.lang.Integer, Unit> {
        public final /* synthetic */ java.lang.String EZpvd;
        public final /* synthetic */ java.lang.String KWHzl;
        public final /* synthetic */ Function0<Unit> OLrzqt;
        public final /* synthetic */ java.lang.String copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(java.lang.String str, java.lang.String str2, java.lang.String str3, Function0<Unit> function0) {
            this.EZpvd = str;
            this.copydefault = str2;
            this.KWHzl = str3;
            this.OLrzqt = function0;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function2
        public /* synthetic */ Unit invoke(Composer composer, java.lang.Integer num) {
            EZpvd(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void EZpvd(Composer composer, int i) {
            if ((i & 3) != 2 || !composer.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-758999626, i, -1, "com.okinc.tradingbot.impl.botDetail.ui.llmSignal.DataSettingsSection.<anonymous> (LLMSignalDetailsComposable.kt:274)");
                }
                Arrangement.HorizontalOrVertical horizontalOrVerticalM582spacedBy0680j_4 = Arrangement.INSTANCE.m582spacedBy0680j_4(androidx.compose.ui.unit.Dp.m5414constructorimpl(16));
                java.lang.String str = this.EZpvd;
                java.lang.String str2 = this.copydefault;
                java.lang.String str3 = this.KWHzl;
                Function0<Unit> function0 = this.OLrzqt;
                composer.startReplaceableGroup(-483455358);
                Modifier.Companion companion = Modifier.Companion;
                MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(horizontalOrVerticalM582spacedBy0680j_4, Alignment.Companion.getStart(), composer, 6);
                composer.startReplaceableGroup(-1323940314);
                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
                Function0<ComposeUiNode> constructor = companion2.getConstructor();
                yHO<SkippableUpdater<ComposeUiNode>, Composer, java.lang.Integer, Unit> yhoModifierMaterializerOf = LayoutKt.modifierMaterializerOf(companion);
                if (!(composer.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer.startReusableNode();
                if (composer.getInserting()) {
                    composer.createNode(constructor);
                } else {
                    composer.useNode();
                }
                Composer composerM2783constructorimpl = Updater.m2783constructorimpl(composer);
                Updater.m2790setimpl(composerM2783constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                Updater.m2790setimpl(composerM2783constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, java.lang.Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                if (composerM2783constructorimpl.getInserting() || !Intrinsics.EZpvd(composerM2783constructorimpl.rememberedValue(), java.lang.Integer.valueOf(currentCompositeKeyHash))) {
                    composerM2783constructorimpl.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash));
                    composerM2783constructorimpl.apply(java.lang.Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                yhoModifierMaterializerOf.invoke(SkippableUpdater.m2774boximpl(SkippableUpdater.m2775constructorimpl(composer)), composer, 0);
                composer.startReplaceableGroup(2058660585);
                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                uIN.KWHzl((Modifier) null, StringResources_androidKt.stringResource(C48033uCm.Fragment.OuxcSI, composer, 0), str, 0, false, (Function0<Unit>) null, composer, 0, 57);
                uIN.KWHzl((Modifier) null, StringResources_androidKt.stringResource(C48033uCm.Fragment.DGUQLI, composer, 0), str2, 0, false, (Function0<Unit>) null, composer, 0, 57);
                uIN.KWHzl((Modifier) null, StringResources_androidKt.stringResource(C48033uCm.Fragment.QSBOWP, composer, 0), str3, 3, true, function0, composer, 27648, 1);
                composer.endReplaceableGroup();
                composer.endNode();
                composer.endReplaceableGroup();
                composer.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                    return;
                }
                return;
            }
            composer.skipToGroupEnd();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:73:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AEQbTJ(final java.lang.String str, final java.lang.String str2, final java.lang.String str3, final Function0<Unit> function0, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1652830880);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(str2) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= MLKEMEngine.KyberPolyBytes;
        } else if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i3 |= composerStartRestartGroup.changed(str3) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function0) ? 2048 : 1024;
        }
        int i4 = i2 & 16;
        if (i4 == 0) {
            if ((i & 24576) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 16384 : 8192;
            }
            if ((i3 & 9363) == 9362 || !composerStartRestartGroup.getSkipping()) {
                modifier3 = i4 == 0 ? Modifier.Companion : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1652830880, i3, -1, "com.okinc.tradingbot.impl.botDetail.ui.llmSignal.DataSettingsSection (LLMSignalDetailsComposable.kt:272)");
                }
                KWHzl(modifier3, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -758999626, true, new Activity(str, str2, str3, function0)), composerStartRestartGroup, ((i3 >> 12) & 14) | 48, 0);
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
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: o.uIO
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return uIN.copydefault(str, str2, str3, function0, modifier4, i, i2, (Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 24576;
        modifier2 = modifier;
        if ((i3 & 9363) == 9362) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            KWHzl(modifier3, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -758999626, true, new Activity(str, str2, str3, function0)), composerStartRestartGroup, ((i3 >> 12) & 14) | 48, 0);
            if (ComposerKt.isTraceInProgress()) {
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    public static final class StateListAnimator implements Function2<Composer, java.lang.Integer, Unit> {
        public final /* synthetic */ java.lang.String EZpvd;
        public final /* synthetic */ Function0<Unit> KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(Function0<Unit> function0, java.lang.String str) {
            this.KWHzl = function0;
            this.EZpvd = str;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function2
        public /* synthetic */ Unit invoke(Composer composer, java.lang.Integer num) {
            KWHzl(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void KWHzl(Composer composer, int i) {
            if ((i & 3) != 2 || !composer.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(506672461, i, -1, "com.okinc.tradingbot.impl.botDetail.ui.llmSignal.PromptSection.<anonymous> (LLMSignalDetailsComposable.kt:310)");
                }
                Arrangement arrangement = Arrangement.INSTANCE;
                float f = 16;
                Arrangement.HorizontalOrVertical horizontalOrVerticalM582spacedBy0680j_4 = arrangement.m582spacedBy0680j_4(androidx.compose.ui.unit.Dp.m5414constructorimpl(f));
                Function0<Unit> function0 = this.KWHzl;
                java.lang.String str = this.EZpvd;
                composer.startReplaceableGroup(-483455358);
                Modifier.Companion companion = Modifier.Companion;
                Alignment.Companion companion2 = Alignment.Companion;
                MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(horizontalOrVerticalM582spacedBy0680j_4, companion2.getStart(), composer, 6);
                composer.startReplaceableGroup(-1323940314);
                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
                Function0<ComposeUiNode> constructor = companion3.getConstructor();
                yHO<SkippableUpdater<ComposeUiNode>, Composer, java.lang.Integer, Unit> yhoModifierMaterializerOf = LayoutKt.modifierMaterializerOf(companion);
                if (!(composer.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer.startReusableNode();
                if (composer.getInserting()) {
                    composer.createNode(constructor);
                } else {
                    composer.useNode();
                }
                Composer composerM2783constructorimpl = Updater.m2783constructorimpl(composer);
                Updater.m2790setimpl(composerM2783constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
                Updater.m2790setimpl(composerM2783constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, java.lang.Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                if (composerM2783constructorimpl.getInserting() || !Intrinsics.EZpvd(composerM2783constructorimpl.rememberedValue(), java.lang.Integer.valueOf(currentCompositeKeyHash))) {
                    composerM2783constructorimpl.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash));
                    composerM2783constructorimpl.apply(java.lang.Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                yhoModifierMaterializerOf.invoke(SkippableUpdater.m2774boximpl(SkippableUpdater.m2775constructorimpl(composer)), composer, 0);
                composer.startReplaceableGroup(2058660585);
                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                Modifier modifierEZpvd = C49551uqg.EZpvd(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), function0);
                Arrangement.HorizontalOrVertical spaceBetween = arrangement.getSpaceBetween();
                Alignment.Vertical centerVertically = companion2.getCenterVertically();
                composer.startReplaceableGroup(693286680);
                MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(spaceBetween, centerVertically, composer, 54);
                composer.startReplaceableGroup(-1323940314);
                int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
                Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                yHO<SkippableUpdater<ComposeUiNode>, Composer, java.lang.Integer, Unit> yhoModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierEZpvd);
                if (!(composer.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer.startReusableNode();
                if (composer.getInserting()) {
                    composer.createNode(constructor2);
                } else {
                    composer.useNode();
                }
                Composer composerM2783constructorimpl2 = Updater.m2783constructorimpl(composer);
                Updater.m2790setimpl(composerM2783constructorimpl2, measurePolicyRowMeasurePolicy, companion3.getSetMeasurePolicy());
                Updater.m2790setimpl(composerM2783constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, java.lang.Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
                if (composerM2783constructorimpl2.getInserting() || !Intrinsics.EZpvd(composerM2783constructorimpl2.rememberedValue(), java.lang.Integer.valueOf(currentCompositeKeyHash2))) {
                    composerM2783constructorimpl2.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash2));
                    composerM2783constructorimpl2.apply(java.lang.Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                }
                yhoModifierMaterializerOf2.invoke(SkippableUpdater.m2774boximpl(SkippableUpdater.m2775constructorimpl(composer)), composer, 0);
                composer.startReplaceableGroup(2058660585);
                TextKt.m2072Text4IGK_g(StringResources_androidKt.stringResource(C48033uCm.Fragment.fFgQHt, composer, 0), RowScope.weight$default(RowScopeInstance.INSTANCE, companion, 1.0f, false, 2, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, C52698wVa.OLrzqt(C52761wXj.LoaderManager.gHZMYf, java.lang.Integer.valueOf(C52761wXj.Activity.fdOvFl), composer, 0, 0), composer, 0, 0, 65532);
                IconKt.m1755Iconww6aTOc(PainterResources_androidKt.painterResource(C52761wXj.TaskDescription.iHkeWl, composer, 0), (java.lang.String) null, SizeKt.m718size3ABfNKs(companion, androidx.compose.ui.unit.Dp.m5414constructorimpl(f)), ColorResources_androidKt.colorResource(C52761wXj.Activity.Dmq, composer, 0), composer, 432, 0);
                composer.endReplaceableGroup();
                composer.endNode();
                composer.endReplaceableGroup();
                composer.endReplaceableGroup();
                composer.startReplaceableGroup(1806122382);
                if (str.length() > 0) {
                    TextKt.m2072Text4IGK_g(str, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.Companion.m5334getEllipsisgIe3tQ8(), false, 12, 0, (Function1<? super TextLayoutResult, Unit>) null, C52698wVa.OLrzqt(C52761wXj.LoaderManager.AYXKKw, java.lang.Integer.valueOf(C52761wXj.Activity.Dmq), composer, 0, 0), composer, 0, 3120, 55294);
                }
                composer.endReplaceableGroup();
                composer.endReplaceableGroup();
                composer.endNode();
                composer.endReplaceableGroup();
                composer.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                    return;
                }
                return;
            }
            composer.skipToGroupEnd();
        }
    }

    public static final void copydefault(final java.lang.String str, final Function0<Unit> function0, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(407987703);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= MLKEMEngine.KyberPolyBytes;
        } else if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i3 |= composerStartRestartGroup.changed(modifier) ? 256 : 128;
        }
        if ((i3 & CipherSuite.TLS_RSA_PSK_WITH_3DES_EDE_CBC_SHA) != 146 || !composerStartRestartGroup.getSkipping()) {
            if (i4 != 0) {
                modifier = Modifier.Companion;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(407987703, i3, -1, "com.okinc.tradingbot.impl.botDetail.ui.llmSignal.PromptSection (LLMSignalDetailsComposable.kt:308)");
            }
            KWHzl(modifier, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 506672461, true, new StateListAnimator(function0, str)), composerStartRestartGroup, ((i3 >> 6) & 14) | 48, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        final Modifier modifier2 = modifier;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: o.uIR
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return uIN.EZpvd(str, function0, modifier2, i, i2, (Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:107:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x012a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void KWHzl(Modifier modifier, final java.lang.String str, final java.lang.String str2, int i, boolean z, Function0<Unit> function0, Composer composer, final int i2, final int i3) {
        Modifier modifier2;
        int i4;
        int i5;
        int i6;
        int i7;
        boolean z2;
        int i8;
        Function0<Unit> function02;
        Modifier modifier3;
        final int i9;
        java.lang.Object objRememberedValue;
        Composer.Companion companion;
        int i10;
        java.lang.Object objRememberedValue2;
        final boolean z3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-860894980);
        int i11 = i3 & 1;
        if (i11 != 0) {
            i4 = i2 | 6;
            modifier2 = modifier;
        } else if ((i2 & 6) == 0) {
            modifier2 = modifier;
            i4 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i2;
        } else {
            modifier2 = modifier;
            i4 = i2;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else {
            if ((i2 & 48) == 0) {
                i4 |= composerStartRestartGroup.changed(str) ? 32 : 16;
            }
            if ((i3 & 4) == 0) {
                i4 |= MLKEMEngine.KyberPolyBytes;
            } else {
                if ((i2 & MLKEMEngine.KyberPolyBytes) == 0) {
                    i4 |= composerStartRestartGroup.changed(str2) ? 256 : 128;
                }
                i5 = i3 & 8;
                if (i5 != 0) {
                    i4 |= 3072;
                } else {
                    if ((i2 & 3072) == 0) {
                        i6 = i;
                        i4 |= composerStartRestartGroup.changed(i6) ? 2048 : 1024;
                    }
                    i7 = i3 & 16;
                    if (i7 == 0) {
                        i4 |= 24576;
                    } else {
                        if ((i2 & 24576) == 0) {
                            z2 = z;
                            i4 |= composerStartRestartGroup.changed(z2) ? 16384 : 8192;
                        }
                        i8 = i3 & 32;
                        if (i8 == 0) {
                            if ((196608 & i2) == 0) {
                                function02 = function0;
                                i4 |= composerStartRestartGroup.changedInstance(function02) ? 131072 : 65536;
                            }
                            if ((74899 & i4) == 74898 || !composerStartRestartGroup.getSkipping()) {
                                modifier3 = i11 == 0 ? Modifier.Companion : modifier2;
                                i9 = i5 == 0 ? 1 : i6;
                                boolean z4 = i7 == 0 ? false : z2;
                                Function0<Unit> function03 = i8 == 0 ? null : function02;
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-860894980, i4, -1, "com.okinc.tradingbot.impl.botDetail.ui.llmSignal.InfoRow (LLMSignalDetailsComposable.kt:359)");
                                }
                                composerStartRestartGroup.startReplaceableGroup(343091664);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                companion = Composer.Companion;
                                if (objRememberedValue != companion.getEmpty()) {
                                    i10 = 2;
                                    objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(java.lang.Boolean.FALSE, null, 2, null);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                } else {
                                    i10 = 2;
                                }
                                MutableState mutableState = (MutableState) objRememberedValue;
                                composerStartRestartGroup.endReplaceableGroup();
                                composerStartRestartGroup.startReplaceableGroup(343093698);
                                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue2 == companion.getEmpty()) {
                                    objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, i10, null);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                Modifier modifier4 = modifier3;
                                OLrzqt(modifier4, true, str, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1563380178, true, new Application(z4, function03, ColorResources_androidKt.colorResource(C52761wXj.Activity.iUnTnt, composerStartRestartGroup, 0), str2, i9, mutableState, (MutableState) objRememberedValue2)), composerStartRestartGroup, (i4 & 14) | 3120 | ((i4 << 3) & FaceDetector.NUM_BOXES), 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                z3 = z4;
                                function02 = function03;
                            } else {
                                composerStartRestartGroup.skipToGroupEnd();
                                modifier3 = modifier2;
                                i9 = i6;
                                z3 = z2;
                            }
                            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup == null) {
                                final Modifier modifier5 = modifier3;
                                final Function0<Unit> function04 = function02;
                                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: o.uIX
                                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                    @Override // kotlin.jvm.functions.Function2
                                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                        return uIN.KWHzl(modifier5, str, str2, i9, z3, function04, i2, i3, (Composer) obj, ((java.lang.Integer) obj2).intValue());
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        i4 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                        function02 = function0;
                        if ((74899 & i4) == 74898) {
                            if (i11 == 0) {
                            }
                            if (i5 == 0) {
                            }
                            if (i7 == 0) {
                            }
                            if (i8 == 0) {
                            }
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            composerStartRestartGroup.startReplaceableGroup(343091664);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            companion = Composer.Companion;
                            if (objRememberedValue != companion.getEmpty()) {
                            }
                            MutableState mutableState2 = (MutableState) objRememberedValue;
                            composerStartRestartGroup.endReplaceableGroup();
                            composerStartRestartGroup.startReplaceableGroup(343093698);
                            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue2 == companion.getEmpty()) {
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            Modifier modifier42 = modifier3;
                            OLrzqt(modifier42, true, str, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1563380178, true, new Application(z4, function03, ColorResources_androidKt.colorResource(C52761wXj.Activity.iUnTnt, composerStartRestartGroup, 0), str2, i9, mutableState2, (MutableState) objRememberedValue2)), composerStartRestartGroup, (i4 & 14) | 3120 | ((i4 << 3) & FaceDetector.NUM_BOXES), 0);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            z3 = z4;
                            function02 = function03;
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                        }
                    }
                    z2 = z;
                    i8 = i3 & 32;
                    if (i8 == 0) {
                    }
                    function02 = function0;
                    if ((74899 & i4) == 74898) {
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                    }
                }
                i6 = i;
                i7 = i3 & 16;
                if (i7 == 0) {
                }
                z2 = z;
                i8 = i3 & 32;
                if (i8 == 0) {
                }
                function02 = function0;
                if ((74899 & i4) == 74898) {
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            i5 = i3 & 8;
            if (i5 != 0) {
            }
            i6 = i;
            i7 = i3 & 16;
            if (i7 == 0) {
            }
            z2 = z;
            i8 = i3 & 32;
            if (i8 == 0) {
            }
            function02 = function0;
            if ((74899 & i4) == 74898) {
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        if ((i3 & 4) == 0) {
        }
        i5 = i3 & 8;
        if (i5 != 0) {
        }
        i6 = i;
        i7 = i3 & 16;
        if (i7 == 0) {
        }
        z2 = z;
        i8 = i3 & 32;
        if (i8 == 0) {
        }
        function02 = function0;
        if ((74899 & i4) == 74898) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    public static final class Application implements yHO<RowScope, Composer, java.lang.Integer, Unit> {
        public final /* synthetic */ int AEQbTJ;
        public final /* synthetic */ long AYXKKw;
        public final /* synthetic */ java.lang.String AhwBna;
        public final /* synthetic */ MutableState<java.lang.Boolean> EZpvd;
        public final /* synthetic */ Function0<Unit> KWHzl;
        public final /* synthetic */ MutableState<TextLayoutResult> OLrzqt;
        public final /* synthetic */ boolean copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(boolean z, Function0<Unit> function0, long j, java.lang.String str, int i, MutableState<java.lang.Boolean> mutableState, MutableState<TextLayoutResult> mutableState2) {
            this.copydefault = z;
            this.KWHzl = function0;
            this.AYXKKw = j;
            this.AhwBna = str;
            this.AEQbTJ = i;
            this.EZpvd = mutableState;
            this.OLrzqt = mutableState2;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // o.yHO
        public /* synthetic */ Unit invoke(RowScope rowScope, Composer composer, java.lang.Integer num) {
            OLrzqt(rowScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void OLrzqt(RowScope rowScope, Composer composer, int i) {
            int i2;
            Intrinsics.checkNotNullParameter(rowScope, "");
            if ((i & 6) == 0) {
                i2 = i | (composer.changed(rowScope) ? 4 : 2);
            } else {
                i2 = i;
            }
            if ((i2 & 19) != 18 || !composer.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1563380178, i2, -1, "com.okinc.tradingbot.impl.botDetail.ui.llmSignal.InfoRow.<anonymous> (LLMSignalDetailsComposable.kt:369)");
                }
                Modifier modifierDrawBehind = Modifier.Companion;
                Modifier modifierAlignByBaseline = rowScope.alignByBaseline(modifierDrawBehind);
                composer.startReplaceableGroup(-199936240);
                if (this.copydefault && uIN.EZpvd(this.EZpvd)) {
                    composer.startReplaceableGroup(-199933142);
                    boolean zChanged = composer.changed(this.KWHzl);
                    final Function0<Unit> function0 = this.KWHzl;
                    java.lang.Object objRememberedValue = composer.rememberedValue();
                    if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
                        objRememberedValue = new Function0() { // from class: o.uJb
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                return uIN.Application.AEQbTJ(function0);
                            }
                        };
                        composer.updateRememberedValue(objRememberedValue);
                    }
                    composer.endReplaceableGroup();
                    Modifier modifierEZpvd = C49551uqg.EZpvd(modifierDrawBehind, (Function0) objRememberedValue);
                    composer.startReplaceableGroup(-199929082);
                    boolean zChanged2 = composer.changed(this.AYXKKw);
                    final long j = this.AYXKKw;
                    final MutableState<TextLayoutResult> mutableState = this.OLrzqt;
                    java.lang.Object objRememberedValue2 = composer.rememberedValue();
                    if (zChanged2 || objRememberedValue2 == Composer.Companion.getEmpty()) {
                        objRememberedValue2 = new Function1() { // from class: o.uJc
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj) {
                                return uIN.Application.EZpvd(j, mutableState, (DrawScope) obj);
                            }
                        };
                        composer.updateRememberedValue(objRememberedValue2);
                    }
                    composer.endReplaceableGroup();
                    modifierDrawBehind = DrawModifierKt.drawBehind(modifierEZpvd, (Function1) objRememberedValue2);
                }
                composer.endReplaceableGroup();
                Modifier modifierThen = modifierAlignByBaseline.then(modifierDrawBehind);
                TextStyle textStyleOLrzqt = C52698wVa.OLrzqt(C52761wXj.LoaderManager.gHZMYf, java.lang.Integer.valueOf(C52761wXj.Activity.fdOvFl), composer, 0, 0);
                int iM5287getEnde0LSkKk = TextAlign.Companion.m5287getEnde0LSkKk();
                int iM5334getEllipsisgIe3tQ8 = TextOverflow.Companion.m5334getEllipsisgIe3tQ8();
                java.lang.String str = this.AhwBna;
                TextAlign textAlignM5279boximpl = TextAlign.m5279boximpl(iM5287getEnde0LSkKk);
                int i3 = this.AEQbTJ;
                composer.startReplaceableGroup(-199863687);
                final MutableState<java.lang.Boolean> mutableState2 = this.EZpvd;
                final MutableState<TextLayoutResult> mutableState3 = this.OLrzqt;
                java.lang.Object objRememberedValue3 = composer.rememberedValue();
                if (objRememberedValue3 == Composer.Companion.getEmpty()) {
                    objRememberedValue3 = new Function1() { // from class: o.uIY
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return uIN.Application.EZpvd(mutableState2, mutableState3, (TextLayoutResult) obj);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue3);
                }
                composer.endReplaceableGroup();
                TextKt.m2072Text4IGK_g(str, modifierThen, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, textAlignM5279boximpl, 0L, iM5334getEllipsisgIe3tQ8, false, i3, 0, (Function1<? super TextLayoutResult, Unit>) objRememberedValue3, textStyleOLrzqt, composer, 0, 196656, 22012);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                    return;
                }
                return;
            }
            composer.skipToGroupEnd();
        }

        public static final Unit AEQbTJ(Function0 function0) {
            if (function0 != null) {
                function0.invoke();
            }
            return Unit.INSTANCE;
        }

        public static final Unit EZpvd(long j, MutableState mutableState, DrawScope drawScope) {
            Intrinsics.checkNotNullParameter(drawScope, "");
            TextLayoutResult textLayoutResultAEQbTJ = uIN.AEQbTJ(mutableState);
            if (textLayoutResultAEQbTJ == null) {
                return Unit.INSTANCE;
            }
            float fMo516toPx0680j_4 = drawScope.mo516toPx0680j_4(androidx.compose.ui.unit.Dp.m5414constructorimpl(1));
            float f = 2;
            float fMo516toPx0680j_42 = drawScope.mo516toPx0680j_4(androidx.compose.ui.unit.Dp.m5414constructorimpl(f));
            float fMo516toPx0680j_43 = drawScope.mo516toPx0680j_4(androidx.compose.ui.unit.Dp.m5414constructorimpl(f));
            int lineCount = textLayoutResultAEQbTJ.getLineCount();
            int i = 0;
            while (i < lineCount) {
                float lineBottom = textLayoutResultAEQbTJ.getLineBottom(i);
                float lineLeft = textLayoutResultAEQbTJ.getLineLeft(i);
                float lineRight = textLayoutResultAEQbTJ.getLineRight(i);
                float f2 = lineBottom - (fMo516toPx0680j_4 / f);
                float f3 = lineLeft;
                while (f3 < lineRight) {
                    DrawScope.m3678drawLineNGM6Ib0$default(drawScope, j, OffsetKt.Offset(f3, f2), OffsetKt.Offset(C56548yJl.valueOf(f3 + fMo516toPx0680j_42, lineRight), f2), fMo516toPx0680j_4, 0, null, 0.0f, null, 0, 496, null);
                    f3 += fMo516toPx0680j_42 + fMo516toPx0680j_43;
                    f2 = f2;
                    lineRight = lineRight;
                    i = i;
                    lineCount = lineCount;
                    f = f;
                    textLayoutResultAEQbTJ = textLayoutResultAEQbTJ;
                }
                i++;
            }
            return Unit.INSTANCE;
        }

        public static final Unit EZpvd(MutableState mutableState, MutableState mutableState2, TextLayoutResult textLayoutResult) {
            Intrinsics.checkNotNullParameter(textLayoutResult, "");
            uIN.EZpvd(mutableState, textLayoutResult.getHasVisualOverflow());
            uIN.OLrzqt(mutableState2, textLayoutResult);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0275  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void OLrzqt(Modifier modifier, boolean z, final java.lang.String str, final yHO<? super RowScope, ? super Composer, ? super java.lang.Integer, Unit> yho, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        boolean z2;
        Modifier modifier3;
        boolean z3;
        int currentCompositeKeyHash;
        Composer composerM2783constructorimpl;
        Function2<ComposeUiNode, java.lang.Integer, Unit> setCompositeKeyHash;
        int currentCompositeKeyHash2;
        Composer composerM2783constructorimpl2;
        Function2<ComposeUiNode, java.lang.Integer, Unit> setCompositeKeyHash2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(401244488);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 == 0) {
            if ((i & 48) == 0) {
                z2 = z;
                i3 |= composerStartRestartGroup.changed(z2) ? 32 : 16;
            }
            if ((i2 & 4) == 0) {
                i3 |= MLKEMEngine.KyberPolyBytes;
            } else if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
                i3 |= composerStartRestartGroup.changed(str) ? 256 : 128;
            }
            if ((i2 & 8) == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(yho) ? 2048 : 1024;
            }
            if ((i3 & 1171) == 1170 || !composerStartRestartGroup.getSkipping()) {
                modifier3 = i4 == 0 ? Modifier.Companion : modifier2;
                z3 = i5 == 0 ? false : z2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(401244488, i3, -1, "com.okinc.tradingbot.impl.botDetail.ui.llmSignal.InfoRow (LLMSignalDetailsComposable.kt:432)");
                }
                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null);
                Alignment.Companion companion = Alignment.Companion;
                Alignment.Vertical top = !z3 ? companion.getTop() : companion.getCenterVertically();
                composerStartRestartGroup.startReplaceableGroup(693286680);
                Arrangement arrangement = Arrangement.INSTANCE;
                MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getStart(), top, composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
                Function0<ComposeUiNode> constructor = companion2.getConstructor();
                yHO<SkippableUpdater<ComposeUiNode>, Composer, java.lang.Integer, Unit> yhoModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierFillMaxWidth$default);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (!composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM2783constructorimpl = Updater.m2783constructorimpl(composerStartRestartGroup);
                Updater.m2790setimpl(composerM2783constructorimpl, measurePolicyRowMeasurePolicy, companion2.getSetMeasurePolicy());
                Updater.m2790setimpl(composerM2783constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                if (!composerM2783constructorimpl.getInserting() || !Intrinsics.EZpvd(composerM2783constructorimpl.rememberedValue(), java.lang.Integer.valueOf(currentCompositeKeyHash))) {
                    composerM2783constructorimpl.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash));
                    composerM2783constructorimpl.apply(java.lang.Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                yhoModifierMaterializerOf.invoke(SkippableUpdater.m2774boximpl(SkippableUpdater.m2775constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(2058660585);
                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                Modifier.Companion companion3 = Modifier.Companion;
                Modifier modifierWeight$default = RowScope.weight$default(rowScopeInstance, companion3, 1.0f, false, 2, null);
                if (z3) {
                    rowScopeInstance.alignByBaseline(modifierWeight$default);
                }
                int i6 = i3 >> 6;
                TextKt.m2072Text4IGK_g(str, modifierWeight$default, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, C52698wVa.OLrzqt(C52761wXj.LoaderManager.gHZMYf, java.lang.Integer.valueOf(C52761wXj.Activity.fdOvFl), composerStartRestartGroup, 0, 0), composerStartRestartGroup, i6 & 14, 0, 65532);
                Modifier modifierWeight$default2 = RowScope.weight$default(rowScopeInstance, companion3, 1.0f, false, 2, null);
                if (z3) {
                    rowScopeInstance.alignByBaseline(modifierWeight$default2);
                }
                Arrangement.Horizontal end = arrangement.getEnd();
                composerStartRestartGroup.startReplaceableGroup(693286680);
                MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(end, Alignment.Companion.getTop(), composerStartRestartGroup, 6);
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
                yHO<SkippableUpdater<ComposeUiNode>, Composer, java.lang.Integer, Unit> yhoModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierWeight$default2);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (!composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor2);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM2783constructorimpl2 = Updater.m2783constructorimpl(composerStartRestartGroup);
                Updater.m2790setimpl(composerM2783constructorimpl2, measurePolicyRowMeasurePolicy2, companion2.getSetMeasurePolicy());
                Updater.m2790setimpl(composerM2783constructorimpl2, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
                setCompositeKeyHash2 = companion2.getSetCompositeKeyHash();
                if (!composerM2783constructorimpl2.getInserting() || !Intrinsics.EZpvd(composerM2783constructorimpl2.rememberedValue(), java.lang.Integer.valueOf(currentCompositeKeyHash2))) {
                    composerM2783constructorimpl2.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash2));
                    composerM2783constructorimpl2.apply(java.lang.Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                }
                yhoModifierMaterializerOf2.invoke(SkippableUpdater.m2774boximpl(SkippableUpdater.m2775constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(2058660585);
                yho.invoke(rowScopeInstance, composerStartRestartGroup, java.lang.Integer.valueOf((i6 & WalletImportError.ERROR_CODE_AA_EXIST) | 6));
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
                z3 = z2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                final Modifier modifier4 = modifier3;
                final boolean z4 = z3;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: o.uIU
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return uIN.copydefault(modifier4, z4, str, yho, i, i2, (Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 48;
        z2 = z;
        if ((i2 & 4) == 0) {
        }
        if ((i2 & 8) == 0) {
        }
        if ((i3 & 1171) == 1170) {
            if (i4 == 0) {
            }
            if (i5 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null);
            Alignment.Companion companion4 = Alignment.Companion;
            if (!z3) {
            }
            composerStartRestartGroup.startReplaceableGroup(693286680);
            Arrangement arrangement2 = Arrangement.INSTANCE;
            MeasurePolicy measurePolicyRowMeasurePolicy3 = RowKt.rowMeasurePolicy(arrangement2.getStart(), top, composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion22 = ComposeUiNode.Companion;
            Function0<ComposeUiNode> constructor3 = companion22.getConstructor();
            yHO<SkippableUpdater<ComposeUiNode>, Composer, java.lang.Integer, Unit> yhoModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(modifierFillMaxWidth$default2);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
            }
            composerStartRestartGroup.startReusableNode();
            if (!composerStartRestartGroup.getInserting()) {
            }
            composerM2783constructorimpl = Updater.m2783constructorimpl(composerStartRestartGroup);
            Updater.m2790setimpl(composerM2783constructorimpl, measurePolicyRowMeasurePolicy3, companion22.getSetMeasurePolicy());
            Updater.m2790setimpl(composerM2783constructorimpl, currentCompositionLocalMap3, companion22.getSetResolvedCompositionLocals());
            setCompositeKeyHash = companion22.getSetCompositeKeyHash();
            if (!composerM2783constructorimpl.getInserting()) {
                composerM2783constructorimpl.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash));
                composerM2783constructorimpl.apply(java.lang.Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                yhoModifierMaterializerOf3.invoke(SkippableUpdater.m2774boximpl(SkippableUpdater.m2775constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(2058660585);
                RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                Modifier.Companion companion32 = Modifier.Companion;
                Modifier modifierWeight$default3 = RowScope.weight$default(rowScopeInstance2, companion32, 1.0f, false, 2, null);
                if (z3) {
                }
                int i62 = i3 >> 6;
                TextKt.m2072Text4IGK_g(str, modifierWeight$default3, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, C52698wVa.OLrzqt(C52761wXj.LoaderManager.gHZMYf, java.lang.Integer.valueOf(C52761wXj.Activity.fdOvFl), composerStartRestartGroup, 0, 0), composerStartRestartGroup, i62 & 14, 0, 65532);
                Modifier modifierWeight$default22 = RowScope.weight$default(rowScopeInstance2, companion32, 1.0f, false, 2, null);
                if (z3) {
                }
                Arrangement.Horizontal end2 = arrangement2.getEnd();
                composerStartRestartGroup.startReplaceableGroup(693286680);
                MeasurePolicy measurePolicyRowMeasurePolicy22 = RowKt.rowMeasurePolicy(end2, Alignment.Companion.getTop(), composerStartRestartGroup, 6);
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap22 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Function0<ComposeUiNode> constructor22 = companion22.getConstructor();
                yHO<SkippableUpdater<ComposeUiNode>, Composer, java.lang.Integer, Unit> yhoModifierMaterializerOf22 = LayoutKt.modifierMaterializerOf(modifierWeight$default22);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                }
                composerStartRestartGroup.startReusableNode();
                if (!composerStartRestartGroup.getInserting()) {
                }
                composerM2783constructorimpl2 = Updater.m2783constructorimpl(composerStartRestartGroup);
                Updater.m2790setimpl(composerM2783constructorimpl2, measurePolicyRowMeasurePolicy22, companion22.getSetMeasurePolicy());
                Updater.m2790setimpl(composerM2783constructorimpl2, currentCompositionLocalMap22, companion22.getSetResolvedCompositionLocals());
                setCompositeKeyHash2 = companion22.getSetCompositeKeyHash();
                if (!composerM2783constructorimpl2.getInserting()) {
                    composerM2783constructorimpl2.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash2));
                    composerM2783constructorimpl2.apply(java.lang.Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                    yhoModifierMaterializerOf22.invoke(SkippableUpdater.m2774boximpl(SkippableUpdater.m2775constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(2058660585);
                    yho.invoke(rowScopeInstance2, composerStartRestartGroup, java.lang.Integer.valueOf((i62 & WalletImportError.ERROR_CODE_AA_EXIST) | 6));
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    public static final void KWHzl(final Modifier modifier, final Function2<? super Composer, ? super java.lang.Integer, Unit> function2, Composer composer, final int i, final int i2) {
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1156016108);
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
            i3 |= composerStartRestartGroup.changedInstance(function2) ? 32 : 16;
        }
        if ((i3 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (i4 != 0) {
                modifier = Modifier.Companion;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1156016108, i3, -1, "com.okinc.tradingbot.impl.botDetail.ui.llmSignal.SectionContainer (LLMSignalDetailsComposable.kt:468)");
            }
            Modifier modifierM672paddingVpY3zN4 = PaddingKt.m672paddingVpY3zN4(BackgroundKt.m349backgroundbw27NRU(SizeKt.fillMaxWidth$default(modifier, 0.0f, 1, null), ColorResources_androidKt.colorResource(C52761wXj.Activity.invokespecialaKhcqp, composerStartRestartGroup, 0), RoundedCornerShapeKt.m924RoundedCornerShape0680j_4(androidx.compose.ui.unit.Dp.m5414constructorimpl(10))), androidx.compose.ui.unit.Dp.m5414constructorimpl(12), androidx.compose.ui.unit.Dp.m5414constructorimpl(16));
            composerStartRestartGroup.startReplaceableGroup(733328855);
            MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.Companion.getTopStart(), false, composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            Function0<ComposeUiNode> constructor = companion.getConstructor();
            yHO<SkippableUpdater<ComposeUiNode>, Composer, java.lang.Integer, Unit> yhoModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM672paddingVpY3zN4);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM2783constructorimpl = Updater.m2783constructorimpl(composerStartRestartGroup);
            Updater.m2790setimpl(composerM2783constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m2790setimpl(composerM2783constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, java.lang.Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (composerM2783constructorimpl.getInserting() || !Intrinsics.EZpvd(composerM2783constructorimpl.rememberedValue(), java.lang.Integer.valueOf(currentCompositeKeyHash))) {
                composerM2783constructorimpl.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash));
                composerM2783constructorimpl.apply(java.lang.Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            yhoModifierMaterializerOf.invoke(SkippableUpdater.m2774boximpl(SkippableUpdater.m2775constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            function2.invoke(composerStartRestartGroup, java.lang.Integer.valueOf((i3 >> 3) & 14));
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: o.uIT
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return uIN.copydefault(modifier, function2, i, i2, (Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final boolean EZpvd(MutableState<java.lang.Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    public static final void EZpvd(MutableState<java.lang.Boolean> mutableState, boolean z) {
        mutableState.setValue(java.lang.Boolean.valueOf(z));
    }

    public static final TextLayoutResult AEQbTJ(MutableState<TextLayoutResult> mutableState) {
        return mutableState.getValue();
    }

    public static final void OLrzqt(MutableState<TextLayoutResult> mutableState, TextLayoutResult textLayoutResult) {
        mutableState.setValue(textLayoutResult);
    }
}
