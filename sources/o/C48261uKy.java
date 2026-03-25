package o;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.DividerKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.res.ColorResources_androidKt;
import androidx.profileinstaller.ProfileVerifier;
import com.amplifyframework.ui.liveness.ml.FaceDetector;
import com.google.api.client.googleapis.media.MediaHttpDownloader;
import com.okinc.business.defi.biz.core.error.WalletImportError;
import com.okinc.unify_trade.bot.data.TacticsData;
import com.okinc.unify_trade.bot.list.CardStyle;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.uKy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C48261uKy {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final Unit OLrzqt(uJO ujo, Function0 function0, boolean z, java.lang.Integer num, boolean z2, CardStyle cardStyle, Function0 function02, Function0 function03, Function0 function04, yHO yho, Function2 function2, int i, int i2, int i3, Composer composer, int i4) {
        EZpvd(ujo, function0, z, num, z2, cardStyle, function02, function03, function04, yho, function2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd() {
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ() {
        return Unit.INSTANCE;
    }

    public static final Unit djBIcL() {
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x030a  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0318  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x031d  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x032c  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0378  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x03d3  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x03df  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x03e3  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0410  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0447  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0459  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0464  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x04aa  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x056c  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0580  */
    /* JADX WARN: Removed duplicated region for block: B:252:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0126  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void EZpvd(@NotNull final uJO ujo, @NotNull final Function0<TacticsData> function0, boolean z, java.lang.Integer num, boolean z2, CardStyle cardStyle, Function0<Unit> function02, Function0<Unit> function03, Function0<Unit> function04, @NotNull final yHO<? super java.lang.String, ? super TacticsData, ? super Function0<Unit>, Unit> yho, @NotNull final Function2<? super java.lang.String, ? super TacticsData, Unit> function2, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        boolean z3;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        CardStyle cardStyle2;
        final Function0<Unit> function05;
        Function0<Unit> function06;
        Function0<Unit> function07;
        android.content.Context context;
        androidx.compose.runtime.State stateRememberUpdatedState;
        boolean z4;
        boolean z5;
        java.lang.Object objRememberedValue;
        androidx.compose.runtime.State state;
        uJN ujn;
        boolean zChanged;
        boolean zChanged2;
        boolean z6;
        boolean zChanged3;
        java.lang.Object objRememberedValue2;
        boolean z7;
        boolean zChanged4;
        java.lang.Object objRememberedValue3;
        java.lang.Integer num2;
        Modifier modifierM675paddingqDBjuR0$default;
        int currentCompositeKeyHash;
        Composer composerM2783constructorimpl;
        Function2<ComposeUiNode, java.lang.Integer, Unit> setCompositeKeyHash;
        uJL ujlCopydefault;
        Modifier.Companion companion;
        final Function0<Unit> function08;
        final boolean z8;
        final CardStyle cardStyle3;
        final Function0<Unit> function09;
        final java.lang.Integer num3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(ujo, "");
        Intrinsics.checkNotNullParameter(function0, "");
        Intrinsics.checkNotNullParameter(yho, "");
        Intrinsics.checkNotNullParameter(function2, "");
        Composer composerStartRestartGroup = composer.startRestartGroup(1634865602);
        if ((i3 & 1) != 0) {
            i4 = i | 6;
        } else if ((i & 6) == 0) {
            i4 = (composerStartRestartGroup.changed(ujo) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i & 48) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        int i13 = i3 & 4;
        if (i13 != 0) {
            i4 |= MLKEMEngine.KyberPolyBytes;
        } else {
            if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
                z3 = z;
                i4 |= composerStartRestartGroup.changed(z3) ? 256 : 128;
            }
            i5 = i3 & 8;
            if (i5 == 0) {
                i4 |= 3072;
            } else {
                if ((i & 3072) == 0) {
                    i4 |= composerStartRestartGroup.changed(num) ? 2048 : 1024;
                }
                i6 = i3 & 16;
                if (i6 != 0) {
                    i4 |= 24576;
                } else {
                    if ((i & 24576) == 0) {
                        i4 |= composerStartRestartGroup.changed(z2) ? 16384 : 8192;
                    }
                    i7 = i3 & 32;
                    if (i7 == 0) {
                        i4 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    } else if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                        i4 |= composerStartRestartGroup.changed(cardStyle) ? 131072 : 65536;
                    }
                    i8 = i3 & 64;
                    if (i8 == 0) {
                        i4 |= 1572864;
                    } else if ((i & 1572864) == 0) {
                        i4 |= composerStartRestartGroup.changedInstance(function02) ? 1048576 : 524288;
                    }
                    i9 = i3 & 128;
                    if (i9 == 0) {
                        i4 |= 12582912;
                    } else if ((i & 12582912) == 0) {
                        i4 |= composerStartRestartGroup.changedInstance(function03) ? 8388608 : 4194304;
                    }
                    i10 = i3 & 256;
                    if (i10 == 0) {
                        i4 |= 100663296;
                    } else if ((i & 100663296) == 0) {
                        i4 |= composerStartRestartGroup.changedInstance(function04) ? 67108864 : MediaHttpDownloader.MAXIMUM_CHUNK_SIZE;
                    }
                    if ((i3 & 512) != 0) {
                        if ((805306368 & i) == 0) {
                            i11 = composerStartRestartGroup.changedInstance(yho) ? 536870912 : 268435456;
                        }
                        if ((i3 & 1024) != 0) {
                            i12 = i2 | 6;
                        } else if ((i2 & 6) == 0) {
                            i12 = i2 | (composerStartRestartGroup.changedInstance(function2) ? 4 : 2);
                        } else {
                            i12 = i2;
                        }
                        if ((i4 & 306783379) != 306783378 || (i12 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
                            if (i13 != 0) {
                                z3 = false;
                            }
                            java.lang.Integer num4 = i5 == 0 ? null : num;
                            boolean z9 = i6 == 0 ? true : z2;
                            cardStyle2 = i7 == 0 ? null : cardStyle;
                            if (i8 == 0) {
                                composerStartRestartGroup.startReplaceableGroup(-1695200731);
                                java.lang.Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue4 == Composer.Companion.getEmpty()) {
                                    objRememberedValue4 = new Function0() { // from class: o.uKB
                                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                        @Override // kotlin.jvm.functions.Function0
                                        public final java.lang.Object invoke() {
                                            return C48261uKy.EZpvd();
                                        }
                                    };
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                                }
                                function05 = (Function0) objRememberedValue4;
                                composerStartRestartGroup.endReplaceableGroup();
                            } else {
                                function05 = function02;
                            }
                            if (i9 == 0) {
                                composerStartRestartGroup.startReplaceableGroup(-1695199611);
                                java.lang.Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue5 == Composer.Companion.getEmpty()) {
                                    objRememberedValue5 = new Function0() { // from class: o.uKE
                                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                        @Override // kotlin.jvm.functions.Function0
                                        public final java.lang.Object invoke() {
                                            return C48261uKy.AEQbTJ();
                                        }
                                    };
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                                }
                                function06 = (Function0) objRememberedValue5;
                                composerStartRestartGroup.endReplaceableGroup();
                            } else {
                                function06 = function03;
                            }
                            if (i10 == 0) {
                                composerStartRestartGroup.startReplaceableGroup(-1695198395);
                                java.lang.Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue6 == Composer.Companion.getEmpty()) {
                                    objRememberedValue6 = new Function0() { // from class: o.uKA
                                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                        @Override // kotlin.jvm.functions.Function0
                                        public final java.lang.Object invoke() {
                                            return C48261uKy.djBIcL();
                                        }
                                    };
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                                }
                                function07 = (Function0) objRememberedValue6;
                                composerStartRestartGroup.endReplaceableGroup();
                            } else {
                                function07 = function04;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1634865602, i4, i12, "com.okinc.tradingbot.impl.botList.ui.cell.LLMBotCellComposable (LLMBotCellComposable.kt:51)");
                            }
                            context = (android.content.Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                            android.content.res.Configuration configuration = (android.content.res.Configuration) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalConfiguration());
                            stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(yho, composerStartRestartGroup, (i4 >> 27) & 14);
                            androidx.compose.runtime.State stateRememberUpdatedState2 = SnapshotStateKt.rememberUpdatedState(function2, composerStartRestartGroup, i12 & 14);
                            androidx.compose.runtime.State stateRememberUpdatedState3 = SnapshotStateKt.rememberUpdatedState(function0, composerStartRestartGroup, (i4 >> 3) & 14);
                            composerStartRestartGroup.startReplaceableGroup(-1695179357);
                            int i14 = i4 & 14;
                            z4 = i14 != 4;
                            z5 = (i4 & 458752) != 131072;
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if ((!z5 && !z4) || objRememberedValue == Composer.Companion.getEmpty()) {
                                state = stateRememberUpdatedState;
                                uJN ujn2 = new uJN(ujo.isConnected(), cardStyle2 != null ? ujo.DbNXlk() : cardStyle2, ujo.QOLQEE());
                                composerStartRestartGroup.updateRememberedValue(ujn2);
                                objRememberedValue = ujn2;
                            } else {
                                state = stateRememberUpdatedState;
                            }
                            ujn = (uJN) objRememberedValue;
                            composerStartRestartGroup.endReplaceableGroup();
                            boolean zAuCTelauCTel = ujo.AuCTelauCTel();
                            int size = ujo.getFieldNames().size();
                            composerStartRestartGroup.startReplaceableGroup(-1695168129);
                            zChanged = composerStartRestartGroup.changed(ujn);
                            zChanged2 = composerStartRestartGroup.changed(zAuCTelauCTel);
                            Function0<Unit> function010 = function07;
                            z6 = (i4 & FaceDetector.NUM_BOXES) != 256;
                            zChanged3 = composerStartRestartGroup.changed(size);
                            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            if (!(z6 | zChanged2 | zChanged | zChanged3) || objRememberedValue2 == Composer.Companion.getEmpty()) {
                                objRememberedValue2 = java.lang.Boolean.valueOf(!ujn.copydefault() && ujo.AuCTelauCTel() && !z3 && (ujo.getFieldNames().isEmpty() ^ true));
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            }
                            boolean zBooleanValue = ((java.lang.Boolean) objRememberedValue2).booleanValue();
                            composerStartRestartGroup.endReplaceableGroup();
                            composerStartRestartGroup.startReplaceableGroup(-1695158669);
                            z7 = i14 != 4;
                            zChanged4 = composerStartRestartGroup.changed(configuration);
                            objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                            if (!(z7 | zChanged4) || objRememberedValue3 == Composer.Companion.getEmpty()) {
                                objRememberedValue3 = uKC.OLrzqt(ujo, context);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                            }
                            C48266uLc c48266uLc = (C48266uLc) objRememberedValue3;
                            composerStartRestartGroup.endReplaceableGroup();
                            float fM5414constructorimpl = androidx.compose.ui.unit.Dp.m5414constructorimpl(num4 == null ? num4.intValue() : 16);
                            composerStartRestartGroup.startReplaceableGroup(-1695149240);
                            if (!z3) {
                                num2 = num4;
                                float f = 16;
                                modifierM675paddingqDBjuR0$default = PaddingKt.m674paddingqDBjuR0(C49551uqg.EZpvd(BackgroundKt.m349backgroundbw27NRU(PaddingKt.m675paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), 0.0f, 0.0f, 0.0f, androidx.compose.ui.unit.Dp.m5414constructorimpl(12), 7, null), ColorResources_androidKt.colorResource(C52761wXj.Activity.hgxRZI, composerStartRestartGroup, 0), RoundedCornerShapeKt.m924RoundedCornerShape0680j_4(androidx.compose.ui.unit.Dp.m5414constructorimpl(f))), function05), androidx.compose.ui.unit.Dp.m5414constructorimpl(f), fM5414constructorimpl, androidx.compose.ui.unit.Dp.m5414constructorimpl(f), androidx.compose.ui.unit.Dp.m5414constructorimpl(f));
                            } else {
                                num2 = num4;
                                modifierM675paddingqDBjuR0$default = PaddingKt.m675paddingqDBjuR0$default(C49551uqg.EZpvd(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), function05), 0.0f, fM5414constructorimpl, 0.0f, 0.0f, 13, null);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            composerStartRestartGroup.startReplaceableGroup(-483455358);
                            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composerStartRestartGroup, 0);
                            composerStartRestartGroup.startReplaceableGroup(-1323940314);
                            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
                            Function0<ComposeUiNode> constructor = companion2.getConstructor();
                            yHO<SkippableUpdater<ComposeUiNode>, Composer, java.lang.Integer, Unit> yhoModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM675paddingqDBjuR0$default);
                            boolean z10 = z3;
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
                            Updater.m2790setimpl(composerM2783constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                            Updater.m2790setimpl(composerM2783constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                            setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                            if (!composerM2783constructorimpl.getInserting() || !Intrinsics.EZpvd(composerM2783constructorimpl.rememberedValue(), java.lang.Integer.valueOf(currentCompositeKeyHash))) {
                                composerM2783constructorimpl.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash));
                                composerM2783constructorimpl.apply(java.lang.Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                            }
                            yhoModifierMaterializerOf.invoke(SkippableUpdater.m2774boximpl(SkippableUpdater.m2775constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                            composerStartRestartGroup.startReplaceableGroup(2058660585);
                            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                            int i15 = i4 >> 15;
                            uKG.AEQbTJ(ujo, function05, function06, composerStartRestartGroup, (i15 & WalletImportError.ERROR_CODE_AA_EXIST) | i14 | (i15 & FaceDetector.NUM_BOXES));
                            ujlCopydefault = ujo.copydefault();
                            if (ujlCopydefault == null) {
                                ujlCopydefault = null;
                                composerStartRestartGroup.startReplaceableGroup(-556812971);
                                if (ujlCopydefault != null) {
                                    SpacerKt.Spacer(SizeKt.m704height3ABfNKs(Modifier.Companion, androidx.compose.ui.unit.Dp.m5414constructorimpl(20)), composerStartRestartGroup, 6);
                                    C48240uKd.KWHzl(null, ujlCopydefault.EZpvd(), ujlCopydefault.OLrzqt(), function010, composerStartRestartGroup, i15 & 7168, 1);
                                    Unit unit = Unit.INSTANCE;
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                companion = Modifier.Companion;
                                float f2 = 20;
                                SpacerKt.Spacer(SizeKt.m704height3ABfNKs(companion, androidx.compose.ui.unit.Dp.m5414constructorimpl(f2)), composerStartRestartGroup, 6);
                                uKS.EZpvd(ujo, c48266uLc, ujn, composerStartRestartGroup, i14);
                                composerStartRestartGroup.startReplaceableGroup(-556796935);
                                if (zBooleanValue) {
                                    SpacerKt.Spacer(SizeKt.m704height3ABfNKs(companion, androidx.compose.ui.unit.Dp.m5414constructorimpl(f2)), composerStartRestartGroup, 6);
                                    uKZ.KWHzl(ujo.EZpvd(), ujo.getFieldNames(), ujo.AYXKKw(), null, composerStartRestartGroup, 0, 8);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                uKZ.AEQbTJ(PaddingKt.m675paddingqDBjuR0$default(companion, 0.0f, androidx.compose.ui.unit.Dp.m5414constructorimpl(f2), 0.0f, 0.0f, 13, null), ujo.gEmmrt(), EZpvd(stateRememberUpdatedState3), KWHzl(state), copydefault(stateRememberUpdatedState2), composerStartRestartGroup, 6, 0);
                                composerStartRestartGroup.startReplaceableGroup(-556779431);
                                if (!z10 && z9) {
                                    DividerKt.m1696Divider9IZ8Weo(PaddingKt.m675paddingqDBjuR0$default(companion, 0.0f, androidx.compose.ui.unit.Dp.m5414constructorimpl(24), 0.0f, 0.0f, 13, null), androidx.compose.ui.unit.Dp.m5414constructorimpl((float) 0.5d), ColorResources_androidKt.colorResource(C52761wXj.Activity.zuBGHE, composerStartRestartGroup, 0), composerStartRestartGroup, 54, 0);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                composerStartRestartGroup.endReplaceableGroup();
                                composerStartRestartGroup.endNode();
                                composerStartRestartGroup.endReplaceableGroup();
                                composerStartRestartGroup.endReplaceableGroup();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                z3 = z10;
                                function08 = function06;
                                z8 = z9;
                                cardStyle3 = cardStyle2;
                                function09 = function010;
                                num3 = num2;
                            } else {
                                if (!(!(ujlCopydefault.EZpvd() == 1.0f))) {
                                }
                                composerStartRestartGroup.startReplaceableGroup(-556812971);
                                if (ujlCopydefault != null) {
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                companion = Modifier.Companion;
                                float f22 = 20;
                                SpacerKt.Spacer(SizeKt.m704height3ABfNKs(companion, androidx.compose.ui.unit.Dp.m5414constructorimpl(f22)), composerStartRestartGroup, 6);
                                uKS.EZpvd(ujo, c48266uLc, ujn, composerStartRestartGroup, i14);
                                composerStartRestartGroup.startReplaceableGroup(-556796935);
                                if (zBooleanValue) {
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                uKZ.AEQbTJ(PaddingKt.m675paddingqDBjuR0$default(companion, 0.0f, androidx.compose.ui.unit.Dp.m5414constructorimpl(f22), 0.0f, 0.0f, 13, null), ujo.gEmmrt(), EZpvd(stateRememberUpdatedState3), KWHzl(state), copydefault(stateRememberUpdatedState2), composerStartRestartGroup, 6, 0);
                                composerStartRestartGroup.startReplaceableGroup(-556779431);
                                if (!z10) {
                                    DividerKt.m1696Divider9IZ8Weo(PaddingKt.m675paddingqDBjuR0$default(companion, 0.0f, androidx.compose.ui.unit.Dp.m5414constructorimpl(24), 0.0f, 0.0f, 13, null), androidx.compose.ui.unit.Dp.m5414constructorimpl((float) 0.5d), ColorResources_androidKt.colorResource(C52761wXj.Activity.zuBGHE, composerStartRestartGroup, 0), composerStartRestartGroup, 54, 0);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                composerStartRestartGroup.endReplaceableGroup();
                                composerStartRestartGroup.endNode();
                                composerStartRestartGroup.endReplaceableGroup();
                                composerStartRestartGroup.endReplaceableGroup();
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                z3 = z10;
                                function08 = function06;
                                z8 = z9;
                                cardStyle3 = cardStyle2;
                                function09 = function010;
                                num3 = num2;
                            }
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            num3 = num;
                            z8 = z2;
                            cardStyle3 = cardStyle;
                            function05 = function02;
                            function08 = function03;
                            function09 = function04;
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                            final boolean z11 = z3;
                            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: o.uKD
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                @Override // kotlin.jvm.functions.Function2
                                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                    return C48261uKy.OLrzqt(ujo, function0, z11, num3, z8, cardStyle3, function05, function08, function09, yho, function2, i, i2, i3, (Composer) obj, ((java.lang.Integer) obj2).intValue());
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i11 = com.google.android.exoplayer2.C.ENCODING_PCM_32BIT;
                    i4 |= i11;
                    if ((i3 & 1024) != 0) {
                    }
                    if ((i4 & 306783379) != 306783378) {
                        if (i13 != 0) {
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
                        context = (android.content.Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                        android.content.res.Configuration configuration2 = (android.content.res.Configuration) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalConfiguration());
                        stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(yho, composerStartRestartGroup, (i4 >> 27) & 14);
                        androidx.compose.runtime.State stateRememberUpdatedState22 = SnapshotStateKt.rememberUpdatedState(function2, composerStartRestartGroup, i12 & 14);
                        androidx.compose.runtime.State stateRememberUpdatedState32 = SnapshotStateKt.rememberUpdatedState(function0, composerStartRestartGroup, (i4 >> 3) & 14);
                        composerStartRestartGroup.startReplaceableGroup(-1695179357);
                        int i142 = i4 & 14;
                        if (i142 != 4) {
                        }
                        if ((i4 & 458752) != 131072) {
                        }
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (!(z5 | z4)) {
                            state = stateRememberUpdatedState;
                            uJN ujn22 = new uJN(ujo.isConnected(), cardStyle2 != null ? ujo.DbNXlk() : cardStyle2, ujo.QOLQEE());
                            composerStartRestartGroup.updateRememberedValue(ujn22);
                            objRememberedValue = ujn22;
                            ujn = (uJN) objRememberedValue;
                            composerStartRestartGroup.endReplaceableGroup();
                            boolean zAuCTelauCTel2 = ujo.AuCTelauCTel();
                            int size2 = ujo.getFieldNames().size();
                            composerStartRestartGroup.startReplaceableGroup(-1695168129);
                            zChanged = composerStartRestartGroup.changed(ujn);
                            zChanged2 = composerStartRestartGroup.changed(zAuCTelauCTel2);
                            Function0<Unit> function0102 = function07;
                            if ((i4 & FaceDetector.NUM_BOXES) != 256) {
                            }
                            zChanged3 = composerStartRestartGroup.changed(size2);
                            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            if (!(z6 | zChanged2 | zChanged | zChanged3)) {
                                if (ujn.copydefault()) {
                                    objRememberedValue2 = java.lang.Boolean.valueOf(!ujn.copydefault() && ujo.AuCTelauCTel() && !z3 && (ujo.getFieldNames().isEmpty() ^ true));
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                                    boolean zBooleanValue2 = ((java.lang.Boolean) objRememberedValue2).booleanValue();
                                    composerStartRestartGroup.endReplaceableGroup();
                                    composerStartRestartGroup.startReplaceableGroup(-1695158669);
                                    if (i142 != 4) {
                                    }
                                    zChanged4 = composerStartRestartGroup.changed(configuration2);
                                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                                    if (!(z7 | zChanged4)) {
                                        objRememberedValue3 = uKC.OLrzqt(ujo, context);
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                                        C48266uLc c48266uLc2 = (C48266uLc) objRememberedValue3;
                                        composerStartRestartGroup.endReplaceableGroup();
                                        float fM5414constructorimpl2 = androidx.compose.ui.unit.Dp.m5414constructorimpl(num4 == null ? num4.intValue() : 16);
                                        composerStartRestartGroup.startReplaceableGroup(-1695149240);
                                        if (!z3) {
                                        }
                                        composerStartRestartGroup.endReplaceableGroup();
                                        composerStartRestartGroup.startReplaceableGroup(-483455358);
                                        MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composerStartRestartGroup, 0);
                                        composerStartRestartGroup.startReplaceableGroup(-1323940314);
                                        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                                        CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                                        ComposeUiNode.Companion companion22 = ComposeUiNode.Companion;
                                        Function0<ComposeUiNode> constructor2 = companion22.getConstructor();
                                        yHO<SkippableUpdater<ComposeUiNode>, Composer, java.lang.Integer, Unit> yhoModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierM675paddingqDBjuR0$default);
                                        boolean z102 = z3;
                                        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                                        }
                                        composerStartRestartGroup.startReusableNode();
                                        if (!composerStartRestartGroup.getInserting()) {
                                        }
                                        composerM2783constructorimpl = Updater.m2783constructorimpl(composerStartRestartGroup);
                                        Updater.m2790setimpl(composerM2783constructorimpl, measurePolicyColumnMeasurePolicy2, companion22.getSetMeasurePolicy());
                                        Updater.m2790setimpl(composerM2783constructorimpl, currentCompositionLocalMap2, companion22.getSetResolvedCompositionLocals());
                                        setCompositeKeyHash = companion22.getSetCompositeKeyHash();
                                        if (!composerM2783constructorimpl.getInserting()) {
                                            composerM2783constructorimpl.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash));
                                            composerM2783constructorimpl.apply(java.lang.Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                            yhoModifierMaterializerOf2.invoke(SkippableUpdater.m2774boximpl(SkippableUpdater.m2775constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                                            composerStartRestartGroup.startReplaceableGroup(2058660585);
                                            ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                                            int i152 = i4 >> 15;
                                            uKG.AEQbTJ(ujo, function05, function06, composerStartRestartGroup, (i152 & WalletImportError.ERROR_CODE_AA_EXIST) | i142 | (i152 & FaceDetector.NUM_BOXES));
                                            ujlCopydefault = ujo.copydefault();
                                            if (ujlCopydefault == null) {
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                i7 = i3 & 32;
                if (i7 == 0) {
                }
                i8 = i3 & 64;
                if (i8 == 0) {
                }
                i9 = i3 & 128;
                if (i9 == 0) {
                }
                i10 = i3 & 256;
                if (i10 == 0) {
                }
                if ((i3 & 512) != 0) {
                }
                i4 |= i11;
                if ((i3 & 1024) != 0) {
                }
                if ((i4 & 306783379) != 306783378) {
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            i6 = i3 & 16;
            if (i6 != 0) {
            }
            i7 = i3 & 32;
            if (i7 == 0) {
            }
            i8 = i3 & 64;
            if (i8 == 0) {
            }
            i9 = i3 & 128;
            if (i9 == 0) {
            }
            i10 = i3 & 256;
            if (i10 == 0) {
            }
            if ((i3 & 512) != 0) {
            }
            i4 |= i11;
            if ((i3 & 1024) != 0) {
            }
            if ((i4 & 306783379) != 306783378) {
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        z3 = z;
        i5 = i3 & 8;
        if (i5 == 0) {
        }
        i6 = i3 & 16;
        if (i6 != 0) {
        }
        i7 = i3 & 32;
        if (i7 == 0) {
        }
        i8 = i3 & 64;
        if (i8 == 0) {
        }
        i9 = i3 & 128;
        if (i9 == 0) {
        }
        i10 = i3 & 256;
        if (i10 == 0) {
        }
        if ((i3 & 512) != 0) {
        }
        i4 |= i11;
        if ((i3 & 1024) != 0) {
        }
        if ((i4 & 306783379) != 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    public static final yHO<java.lang.String, TacticsData, Function0<Unit>, Unit> KWHzl(androidx.compose.runtime.State<? extends yHO<? super java.lang.String, ? super TacticsData, ? super Function0<Unit>, Unit>> state) {
        return (yHO) state.getValue();
    }

    public static final Function2<java.lang.String, TacticsData, Unit> copydefault(androidx.compose.runtime.State<? extends Function2<? super java.lang.String, ? super TacticsData, Unit>> state) {
        return (Function2) state.getValue();
    }

    public static final Function0<TacticsData> EZpvd(androidx.compose.runtime.State<? extends Function0<TacticsData>> state) {
        return state.getValue();
    }
}
