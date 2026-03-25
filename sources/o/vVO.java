package o;

import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.TextKt;
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
import androidx.compose.ui.res.ColorResources_androidKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.compose.ui.unit.TextUnitType;
import androidx.profileinstaller.ProfileVerifier;
import com.amplifyframework.ui.liveness.ml.FaceDetector;
import com.google.api.client.googleapis.media.MediaHttpDownloader;
import com.okinc.business.defi.biz.core.error.WalletImportError;
import com.okinc.tradingbot.impl.order.strategy.recurring.presenter.RecurringBuyModifyInvestmentViewModel;
import com.okinc.tradingbot.impl.widget.compose.HelperLabelType;
import com.okinc.tradingbot.impl.widget.compose.UnderlineStyle;
import com.okinc.unify_trade.biz.RecurringListItem;
import java.math.RoundingMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.C48033uCm;
import o.C52761wXj;
import o.C55688xof;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: loaded from: classes11.dex */
public final class vVO {

    public final /* synthetic */ class Activity {
        public static final /* synthetic */ int[] AEQbTJ;
        public static final /* synthetic */ int[] copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[RecurringBuyModifyInvestmentViewModel.InputValidationError.values().length];
            try {
                iArr[RecurringBuyModifyInvestmentViewModel.InputValidationError.BELOW_MINIMUM.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[RecurringBuyModifyInvestmentViewModel.InputValidationError.EXCEEDS_AVAILABLE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            AEQbTJ = iArr;
            int[] iArr2 = new int[RecurringBuyModifyInvestmentViewModel.Mode.values().length];
            try {
                iArr2[RecurringBuyModifyInvestmentViewModel.Mode.MODIFY_AMOUNT.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr2[RecurringBuyModifyInvestmentViewModel.Mode.INVEST_MORE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            copydefault = iArr2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final Unit AEQbTJ(java.lang.String str, int i, Composer composer, int i2) {
        KWHzl(str, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final Unit AEQbTJ(java.lang.String str, Function0 function0, int i, Composer composer, int i2) {
        EZpvd(str, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final Unit AEQbTJ(java.lang.String str, boolean z, Function0 function0, int i, Composer composer, int i2) {
        OLrzqt(str, z, (Function0<Unit>) function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final Unit EZpvd(RecurringBuyModifyInvestmentViewModel.Mode mode, java.lang.String str, Function1 function1, java.lang.String str2, java.lang.String str3, java.lang.String str4, boolean z, Function1 function12, int i, int i2, Composer composer, int i3) {
        AEQbTJ(mode, str, (Function1<? super java.lang.String, Unit>) function1, str2, str3, str4, z, (Function1<? super java.lang.Float, Unit>) function12, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final Unit EZpvd(RecurringBuyModifyInvestmentViewModel recurringBuyModifyInvestmentViewModel, RecurringBuyModifyInvestmentViewModel.Mode mode, java.lang.String str, Function1 function1, Function1 function12, Function0 function0, Function0 function02, Function0 function03, Function0 function04, int i, Composer composer, int i2) {
        EZpvd(recurringBuyModifyInvestmentViewModel, mode, str, function1, function12, function0, function02, function03, function04, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final Unit KWHzl(java.util.List list, boolean z, Function0 function0, int i, Composer composer, int i2) {
        OLrzqt((java.util.List<RecurringListItem>) list, z, (Function0<Unit>) function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final Unit copydefault(java.lang.String str, boolean z, Function0 function0, int i, Composer composer, int i2) {
        AEQbTJ(str, z, (Function0<Unit>) function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void EZpvd(final RecurringBuyModifyInvestmentViewModel recurringBuyModifyInvestmentViewModel, final RecurringBuyModifyInvestmentViewModel.Mode mode, final java.lang.String str, final Function1<? super java.lang.String, Unit> function1, final Function1<? super java.lang.Float, Unit> function12, final Function0<Unit> function0, final Function0<Unit> function02, final Function0<Unit> function03, final Function0<Unit> function04, Composer composer, final int i) {
        int i2;
        java.lang.String strCopydefault;
        Composer composer2;
        int i3;
        int i4;
        java.lang.String strStringResource;
        Composer composerStartRestartGroup = composer.startRestartGroup(1046182071);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(recurringBuyModifyInvestmentViewModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(mode) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= composerStartRestartGroup.changed(str) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function1) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function12) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function0) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function02) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function03) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function04) ? 67108864 : MediaHttpDownloader.MAXIMUM_CHUNK_SIZE;
        }
        int i5 = i2;
        if ((38347923 & i5) != 38347922 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1046182071, i5, -1, "com.okinc.tradingbot.impl.order.strategy.recurring.view.RecurringBuyModifyInvestmentContent (RecurringBuyModifyInvestmentBottomSheet.kt:315)");
            }
            androidx.compose.runtime.State stateCollectAsState = SnapshotStateKt.collectAsState(recurringBuyModifyInvestmentViewModel.iwGUEr(), null, composerStartRestartGroup, 0, 1);
            androidx.compose.runtime.State stateCollectAsState2 = SnapshotStateKt.collectAsState(recurringBuyModifyInvestmentViewModel.ejfBZ(), null, composerStartRestartGroup, 0, 1);
            androidx.compose.runtime.State stateCollectAsState3 = SnapshotStateKt.collectAsState(recurringBuyModifyInvestmentViewModel.gEmmrt(), null, composerStartRestartGroup, 0, 1);
            androidx.compose.runtime.State stateCollectAsState4 = SnapshotStateKt.collectAsState(recurringBuyModifyInvestmentViewModel.AYXKKw(), null, composerStartRestartGroup, 0, 1);
            androidx.compose.runtime.State stateCollectAsState5 = SnapshotStateKt.collectAsState(recurringBuyModifyInvestmentViewModel.DbNXlk(), null, composerStartRestartGroup, 0, 1);
            androidx.compose.runtime.State stateCollectAsState6 = SnapshotStateKt.collectAsState(recurringBuyModifyInvestmentViewModel.getFieldNames(), null, composerStartRestartGroup, 0, 1);
            RecurringBuyModifyInvestmentViewModel.InputValidationError inputValidationErrorDjBIcL = djBIcL(stateCollectAsState6);
            kotlin.Pair<? extends java.lang.String, ? extends java.lang.String> pairEZpvd = EZpvd((androidx.compose.runtime.State<uLP>) stateCollectAsState2);
            composerStartRestartGroup.startReplaceableGroup(-1443462431);
            boolean zChanged = composerStartRestartGroup.changed(inputValidationErrorDjBIcL);
            boolean zChanged2 = composerStartRestartGroup.changed(pairEZpvd);
            java.lang.Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if ((zChanged2 | zChanged) || objRememberedValue == Composer.Companion.getEmpty()) {
                RecurringBuyModifyInvestmentViewModel.InputValidationError inputValidationErrorDjBIcL2 = djBIcL(stateCollectAsState6);
                int i6 = inputValidationErrorDjBIcL2 == null ? -1 : Activity.AEQbTJ[inputValidationErrorDjBIcL2.ordinal()];
                if (i6 != -1) {
                    if (i6 == 1) {
                        strCopydefault = C33069mpW.copydefault(C55688xof.Application.UlJrfe, C56424yEw.gEmmrt(C56390yDp.OLrzqt("fieldName", C33070mpX.AYXKKw(C55688xof.Application.setFlags)), C56390yDp.OLrzqt("minValue", xMR.copydefault.copydefault(uLP.KWHzl(EZpvd((androidx.compose.runtime.State<uLP>) stateCollectAsState2)))), C56390yDp.OLrzqt("unit", recurringBuyModifyInvestmentViewModel.isConnected())));
                    } else {
                        if (i6 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        strCopydefault = C33070mpX.AYXKKw(C55688xof.Application.fERRXa);
                    }
                    objRememberedValue = strCopydefault;
                } else {
                    objRememberedValue = null;
                }
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            java.lang.String str2 = (java.lang.String) objRememberedValue;
            composerStartRestartGroup.endReplaceableGroup();
            Modifier.Companion companion = Modifier.Companion;
            float f = 24;
            float f2 = 8;
            Modifier modifierM675paddingqDBjuR0$default = PaddingKt.m675paddingqDBjuR0$default(PaddingKt.m673paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), androidx.compose.ui.unit.Dp.m5414constructorimpl(f), 0.0f, 2, null), 0.0f, androidx.compose.ui.unit.Dp.m5414constructorimpl(f2), 0.0f, androidx.compose.ui.unit.Dp.m5414constructorimpl(f), 5, null);
            Arrangement.HorizontalOrVertical horizontalOrVerticalM582spacedBy0680j_4 = Arrangement.INSTANCE.m582spacedBy0680j_4(androidx.compose.ui.unit.Dp.m5414constructorimpl(f2));
            composerStartRestartGroup.startReplaceableGroup(-483455358);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(horizontalOrVerticalM582spacedBy0680j_4, Alignment.Companion.getStart(), composerStartRestartGroup, 6);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
            yHO<SkippableUpdater<ComposeUiNode>, Composer, java.lang.Integer, Unit> yhoModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM675paddingqDBjuR0$default);
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
            Updater.m2790setimpl(composerM2783constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m2790setimpl(composerM2783constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, java.lang.Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (composerM2783constructorimpl.getInserting() || !Intrinsics.EZpvd(composerM2783constructorimpl.rememberedValue(), java.lang.Integer.valueOf(currentCompositeKeyHash))) {
                composerM2783constructorimpl.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash));
                composerM2783constructorimpl.apply(java.lang.Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            yhoModifierMaterializerOf.invoke(SkippableUpdater.m2774boximpl(SkippableUpdater.m2775constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            java.lang.String strAEQbTJ = uLP.AEQbTJ(EZpvd((androidx.compose.runtime.State<uLP>) stateCollectAsState2));
            int i7 = i5 >> 3;
            composer2 = composerStartRestartGroup;
            AEQbTJ(mode, str, function1, strAEQbTJ, recurringBuyModifyInvestmentViewModel.isConnected(), str2, mode == RecurringBuyModifyInvestmentViewModel.Mode.INVEST_MORE, function12, composerStartRestartGroup, (i7 & WalletImportError.ERROR_CODE_AA_EXIST) | (i7 & 14) | (i7 & FaceDetector.NUM_BOXES) | ((i5 << 9) & 29360128), 0);
            EZpvd(uLP.AEQbTJ(AEQbTJ((androidx.compose.runtime.State<uLP>) stateCollectAsState)), function04, composer2, (i5 >> 21) & WalletImportError.ERROR_CODE_AA_EXIST);
            composer2.startReplaceableGroup(1874971360);
            if (recurringBuyModifyInvestmentViewModel.wlaJM()) {
                OLrzqt(recurringBuyModifyInvestmentViewModel.fJNWhG(), recurringBuyModifyInvestmentViewModel.wlaJM(), function0, composer2, (i5 >> 9) & FaceDetector.NUM_BOXES);
            }
            composer2.endReplaceableGroup();
            int[] iArr = Activity.copydefault;
            int i8 = iArr[mode.ordinal()];
            if (i8 != 1) {
                i3 = 2;
                if (i8 != 2) {
                    composer2.startReplaceableGroup(1874981155);
                    composer2.endReplaceableGroup();
                    throw new NoWhenBranchMatchedException();
                }
                composer2.startReplaceableGroup(-2004891202);
                AEQbTJ(copydefault((androidx.compose.runtime.State<java.lang.String>) stateCollectAsState4), recurringBuyModifyInvestmentViewModel.wlaJM(), function02, composer2, (i5 >> 12) & FaceDetector.NUM_BOXES);
                OLrzqt(OLrzqt((androidx.compose.runtime.State<java.lang.String>) stateCollectAsState5), recurringBuyModifyInvestmentViewModel.wlaJM(), function03, composer2, (i5 >> 15) & FaceDetector.NUM_BOXES);
                composer2.endReplaceableGroup();
                Unit unit = Unit.INSTANCE;
                i4 = 0;
            } else {
                i3 = 2;
                composer2.startReplaceableGroup(-2005097352);
                i4 = 0;
                KWHzl(KWHzl(stateCollectAsState3), composer2, 0);
                composer2.endReplaceableGroup();
                Unit unit2 = Unit.INSTANCE;
            }
            int i9 = iArr[mode.ordinal()];
            if (i9 == 1) {
                composer2.startReplaceableGroup(1875008378);
                strStringResource = StringResources_androidKt.stringResource(C48033uCm.Fragment.hlXVux, composer2, i4);
                composer2.endReplaceableGroup();
            } else {
                if (i9 != i3) {
                    composer2.startReplaceableGroup(1875006295);
                    composer2.endReplaceableGroup();
                    throw new NoWhenBranchMatchedException();
                }
                composer2.startReplaceableGroup(1875012884);
                strStringResource = StringResources_androidKt.stringResource(C48033uCm.Fragment.RuDPQV, composer2, i4);
                composer2.endReplaceableGroup();
            }
            TextStyle textStyleOLrzqt = C52698wVa.OLrzqt(C52761wXj.LoaderManager.AYXKKw, null, composer2, i4, i3);
            TextKt.m2072Text4IGK_g(strStringResource, PaddingKt.m675paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), 0.0f, androidx.compose.ui.unit.Dp.m5414constructorimpl(16), 0.0f, 0.0f, 13, null), ColorResources_androidKt.colorResource(C52761wXj.Activity.QwvEab, composer2, i4), TextUnitKt.m5607TextUnitanM5pPY(12.0f, TextUnitType.Companion.m5628getSpUIouoOA()), (FontStyle) null, FontWeight.Companion.getW400(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, textStyleOLrzqt, composer2, 196656, 0, 65488);
            composer2.endReplaceableGroup();
            composer2.endNode();
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: o.vVZ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return vVO.EZpvd(recurringBuyModifyInvestmentViewModel, mode, str, function1, function12, function0, function02, function03, function04, i, (Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0300  */
    /* JADX WARN: Removed duplicated region for block: B:140:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0112  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AEQbTJ(final RecurringBuyModifyInvestmentViewModel.Mode mode, final java.lang.String str, final Function1<? super java.lang.String, Unit> function1, final java.lang.String str2, final java.lang.String str3, final java.lang.String str4, boolean z, Function1<? super java.lang.Float, Unit> function12, Composer composer, final int i, final int i2) {
        int i3;
        int i4;
        boolean z2;
        int i5;
        Function1<? super java.lang.Float, Unit> function13;
        int currentCompositeKeyHash;
        Composer composerM2783constructorimpl;
        Function2<ComposeUiNode, java.lang.Integer, Unit> setCompositeKeyHash;
        int i6;
        int i7;
        int i8;
        boolean z3;
        boolean z4;
        java.lang.Object objRememberedValue;
        Composer composer2;
        final boolean z5;
        final Function1<? super java.lang.Float, Unit> function14;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(1852137455);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(mode) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(str) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= MLKEMEngine.KyberPolyBytes;
        } else if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function1) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changed(str2) ? 2048 : 1024;
        }
        if ((i2 & 16) != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            i3 |= composerStartRestartGroup.changed(str3) ? 16384 : 8192;
        }
        if ((i2 & 32) != 0) {
            i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        } else {
            if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                i3 |= composerStartRestartGroup.changed(str4) ? 131072 : 65536;
            }
            i4 = i2 & 64;
            if (i4 != 0) {
                if ((1572864 & i) == 0) {
                    z2 = z;
                    i3 |= composerStartRestartGroup.changed(z2) ? 1048576 : 524288;
                }
                i5 = i2 & 128;
                if (i5 != 0) {
                    i3 |= 12582912;
                    function13 = function12;
                } else {
                    function13 = function12;
                    if ((i & 12582912) == 0) {
                        i3 |= composerStartRestartGroup.changedInstance(function13) ? 8388608 : 4194304;
                    }
                }
                if ((i3 & 4793491) != 4793490 || !composerStartRestartGroup.getSkipping()) {
                    boolean z6 = i4 == 0 ? false : z2;
                    Function1<? super java.lang.Float, Unit> function15 = i5 == 0 ? null : function13;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1852137455, i3, -1, "com.okinc.tradingbot.impl.order.strategy.recurring.view.InvestmentAmountSection (RecurringBuyModifyInvestmentBottomSheet.kt:425)");
                    }
                    Arrangement.HorizontalOrVertical horizontalOrVerticalM582spacedBy0680j_4 = Arrangement.INSTANCE.m582spacedBy0680j_4(androidx.compose.ui.unit.Dp.m5414constructorimpl(8));
                    composerStartRestartGroup.startReplaceableGroup(-483455358);
                    Modifier.Companion companion = Modifier.Companion;
                    MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(horizontalOrVerticalM582spacedBy0680j_4, Alignment.Companion.getStart(), composerStartRestartGroup, 6);
                    composerStartRestartGroup.startReplaceableGroup(-1323940314);
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
                    Function0<ComposeUiNode> constructor = companion2.getConstructor();
                    yHO<SkippableUpdater<ComposeUiNode>, Composer, java.lang.Integer, Unit> yhoModifierMaterializerOf = LayoutKt.modifierMaterializerOf(companion);
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
                    i6 = Activity.copydefault[mode.ordinal()];
                    if (i6 != 1) {
                        i7 = C55688xof.Application.setFlags;
                    } else {
                        if (i6 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        i7 = C55688xof.Application.getAudioAttributes;
                    }
                    i8 = i3;
                    z3 = false;
                    TextKt.m2072Text4IGK_g(StringResources_androidKt.stringResource(i7, composerStartRestartGroup, 0), (Modifier) null, ColorResources_androidKt.colorResource(C52761wXj.Activity.fdOvFl, composerStartRestartGroup, 0), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, C52698wVa.OLrzqt(C52761wXj.LoaderManager.gHZMYf, null, composerStartRestartGroup, 0, 2), composerStartRestartGroup, 0, 0, 65530);
                    composerStartRestartGroup.startReplaceableGroup(654288950);
                    int i9 = i8 & 7168;
                    z4 = i9 != 2048;
                    if ((57344 & i8) == 16384) {
                        z3 = true;
                    }
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (!(z4 | z3) || objRememberedValue == Composer.Companion.getEmpty()) {
                        objRememberedValue = str2 + " (" + str3 + ")";
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    int i10 = i8 << 6;
                    composer2 = composerStartRestartGroup;
                    wVE.AEQbTJ(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), str, function1, str2, null, (java.lang.String) objRememberedValue, str3, str4, 2, null, null, null, false, null, null, false, null, false, null, false, z6, false, function15, false, 1, null, composer2, (i8 & WalletImportError.ERROR_CODE_AA_EXIST) | 100663302 | (i8 & FaceDetector.NUM_BOXES) | i9 | (i10 & 3670016) | (i10 & 29360128), 0, ((i8 >> 18) & 14) | 24624 | ((i8 >> 15) & FaceDetector.NUM_BOXES), 42991120);
                    composer2.endReplaceableGroup();
                    composer2.endNode();
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z5 = z6;
                    function14 = function15;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    composer2 = composerStartRestartGroup;
                    z5 = z2;
                    function14 = function13;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: o.vVU
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            return vVO.EZpvd(mode, str, function1, str2, str3, str4, z5, function14, i, i2, (Composer) obj, ((java.lang.Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 1572864;
            z2 = z;
            i5 = i2 & 128;
            if (i5 != 0) {
            }
            if ((i3 & 4793491) != 4793490) {
                if (i4 == 0) {
                }
                if (i5 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                Arrangement.HorizontalOrVertical horizontalOrVerticalM582spacedBy0680j_42 = Arrangement.INSTANCE.m582spacedBy0680j_4(androidx.compose.ui.unit.Dp.m5414constructorimpl(8));
                composerStartRestartGroup.startReplaceableGroup(-483455358);
                Modifier.Companion companion3 = Modifier.Companion;
                MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(horizontalOrVerticalM582spacedBy0680j_42, Alignment.Companion.getStart(), composerStartRestartGroup, 6);
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion22 = ComposeUiNode.Companion;
                Function0<ComposeUiNode> constructor2 = companion22.getConstructor();
                yHO<SkippableUpdater<ComposeUiNode>, Composer, java.lang.Integer, Unit> yhoModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(companion3);
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
                    i6 = Activity.copydefault[mode.ordinal()];
                    if (i6 != 1) {
                    }
                    i8 = i3;
                    z3 = false;
                    TextKt.m2072Text4IGK_g(StringResources_androidKt.stringResource(i7, composerStartRestartGroup, 0), (Modifier) null, ColorResources_androidKt.colorResource(C52761wXj.Activity.fdOvFl, composerStartRestartGroup, 0), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, C52698wVa.OLrzqt(C52761wXj.LoaderManager.gHZMYf, null, composerStartRestartGroup, 0, 2), composerStartRestartGroup, 0, 0, 65530);
                    composerStartRestartGroup.startReplaceableGroup(654288950);
                    int i92 = i8 & 7168;
                    if (i92 != 2048) {
                    }
                    if ((57344 & i8) == 16384) {
                    }
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (!(z4 | z3)) {
                        objRememberedValue = str2 + " (" + str3 + ")";
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        composerStartRestartGroup.endReplaceableGroup();
                        int i102 = i8 << 6;
                        composer2 = composerStartRestartGroup;
                        wVE.AEQbTJ(SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null), str, function1, str2, null, (java.lang.String) objRememberedValue, str3, str4, 2, null, null, null, false, null, null, false, null, false, null, false, z6, false, function15, false, 1, null, composer2, (i8 & WalletImportError.ERROR_CODE_AA_EXIST) | 100663302 | (i8 & FaceDetector.NUM_BOXES) | i92 | (i102 & 3670016) | (i102 & 29360128), 0, ((i8 >> 18) & 14) | 24624 | ((i8 >> 15) & FaceDetector.NUM_BOXES), 42991120);
                        composer2.endReplaceableGroup();
                        composer2.endNode();
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        z5 = z6;
                        function14 = function15;
                    }
                }
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        i4 = i2 & 64;
        if (i4 != 0) {
        }
        z2 = z;
        i5 = i2 & 128;
        if (i5 != 0) {
        }
        if ((i3 & 4793491) != 4793490) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    public static final void EZpvd(final java.lang.String str, Function0<Unit> function0, Composer composer, final int i) {
        int i2;
        Composer composer2;
        final Function0<Unit> function02;
        Composer composerStartRestartGroup = composer.startRestartGroup(188623902);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        int i3 = i2;
        if ((i3 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(188623902, i3, -1, "com.okinc.tradingbot.impl.order.strategy.recurring.view.AvailableBalanceRow (RecurringBuyModifyInvestmentBottomSheet.kt:465)");
            }
            Modifier.Companion companion = Modifier.Companion;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.HorizontalOrVertical spaceBetween = arrangement.getSpaceBetween();
            Alignment.Companion companion2 = Alignment.Companion;
            Alignment.Vertical centerVertically = companion2.getCenterVertically();
            composerStartRestartGroup.startReplaceableGroup(693286680);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(spaceBetween, centerVertically, composerStartRestartGroup, 54);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
            yHO<SkippableUpdater<ComposeUiNode>, Composer, java.lang.Integer, Unit> yhoModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierFillMaxWidth$default);
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
            Updater.m2790setimpl(composerM2783constructorimpl, measurePolicyRowMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m2790setimpl(composerM2783constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, java.lang.Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (composerM2783constructorimpl.getInserting() || !Intrinsics.EZpvd(composerM2783constructorimpl.rememberedValue(), java.lang.Integer.valueOf(currentCompositeKeyHash))) {
                composerM2783constructorimpl.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash));
                composerM2783constructorimpl.apply(java.lang.Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            yhoModifierMaterializerOf.invoke(SkippableUpdater.m2774boximpl(SkippableUpdater.m2775constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            java.lang.String strStringResource = StringResources_androidKt.stringResource(C55688xof.Application.ActionBarTabListener, composerStartRestartGroup, 0);
            TextStyle textStyleOLrzqt = C52698wVa.OLrzqt(C52761wXj.LoaderManager.QOLQEE, null, composerStartRestartGroup, 0, 2);
            long jColorResource = ColorResources_androidKt.colorResource(C52761wXj.Activity.aappFQ, composerStartRestartGroup, 0);
            TextUnitType.Companion companion4 = TextUnitType.Companion;
            TextKt.m2072Text4IGK_g(strStringResource, SizeKt.wrapContentSize$default(companion, null, false, 3, null), jColorResource, TextUnitKt.m5607TextUnitanM5pPY(12.0f, companion4.m5628getSpUIouoOA()), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, textStyleOLrzqt, composerStartRestartGroup, 48, 0, 65520);
            Modifier modifierWrapContentSize$default = SizeKt.wrapContentSize$default(companion, null, false, 3, null);
            Alignment.Vertical centerVertically2 = companion2.getCenterVertically();
            Arrangement.HorizontalOrVertical horizontalOrVerticalM582spacedBy0680j_4 = arrangement.m582spacedBy0680j_4(androidx.compose.ui.unit.Dp.m5414constructorimpl(4.0f));
            composerStartRestartGroup.startReplaceableGroup(693286680);
            MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(horizontalOrVerticalM582spacedBy0680j_4, centerVertically2, composerStartRestartGroup, 54);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
            yHO<SkippableUpdater<ComposeUiNode>, Composer, java.lang.Integer, Unit> yhoModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierWrapContentSize$default);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor2);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM2783constructorimpl2 = Updater.m2783constructorimpl(composerStartRestartGroup);
            Updater.m2790setimpl(composerM2783constructorimpl2, measurePolicyRowMeasurePolicy2, companion3.getSetMeasurePolicy());
            Updater.m2790setimpl(composerM2783constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, java.lang.Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
            if (composerM2783constructorimpl2.getInserting() || !Intrinsics.EZpvd(composerM2783constructorimpl2.rememberedValue(), java.lang.Integer.valueOf(currentCompositeKeyHash2))) {
                composerM2783constructorimpl2.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash2));
                composerM2783constructorimpl2.apply(java.lang.Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            yhoModifierMaterializerOf2.invoke(SkippableUpdater.m2774boximpl(SkippableUpdater.m2775constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            TextKt.m2072Text4IGK_g(str, (Modifier) null, ColorResources_androidKt.colorResource(C52761wXj.Activity.fdOvFl, composerStartRestartGroup, 0), TextUnitKt.m5607TextUnitanM5pPY(12.0f, companion4.m5628getSpUIouoOA()), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, C52698wVa.OLrzqt(C52761wXj.LoaderManager.QOLQEE, null, composerStartRestartGroup, 0, 2), composerStartRestartGroup, i3 & 14, 0, 65522);
            float f = 16;
            Modifier modifierM718size3ABfNKs = SizeKt.m718size3ABfNKs(companion, androidx.compose.ui.unit.Dp.m5414constructorimpl(f));
            composer2 = composerStartRestartGroup;
            composer2.startReplaceableGroup(825282649);
            boolean z = (i3 & WalletImportError.ERROR_CODE_AA_EXIST) == 32;
            java.lang.Object objRememberedValue = composer2.rememberedValue();
            if (z || objRememberedValue == Composer.Companion.getEmpty()) {
                function02 = function0;
                objRememberedValue = new Function0() { // from class: o.vVV
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return vVO.EZpvd(function02);
                    }
                };
                composer2.updateRememberedValue(objRememberedValue);
            } else {
                function02 = function0;
            }
            composer2.endReplaceableGroup();
            Modifier modifierM383clickableXHw0xAI$default = ClickableKt.m383clickableXHw0xAI$default(modifierM718size3ABfNKs, false, null, null, (Function0) objRememberedValue, 7, null);
            Alignment center = companion2.getCenter();
            composer2.startReplaceableGroup(733328855);
            MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, composer2, 6);
            composer2.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor3 = companion3.getConstructor();
            yHO<SkippableUpdater<ComposeUiNode>, Composer, java.lang.Integer, Unit> yhoModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(modifierM383clickableXHw0xAI$default);
            if (!(composer2.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer2.startReusableNode();
            if (composer2.getInserting()) {
                composer2.createNode(constructor3);
            } else {
                composer2.useNode();
            }
            Composer composerM2783constructorimpl3 = Updater.m2783constructorimpl(composer2);
            Updater.m2790setimpl(composerM2783constructorimpl3, measurePolicyRememberBoxMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m2790setimpl(composerM2783constructorimpl3, currentCompositionLocalMap3, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, java.lang.Integer, Unit> setCompositeKeyHash3 = companion3.getSetCompositeKeyHash();
            if (composerM2783constructorimpl3.getInserting() || !Intrinsics.EZpvd(composerM2783constructorimpl3.rememberedValue(), java.lang.Integer.valueOf(currentCompositeKeyHash3))) {
                composerM2783constructorimpl3.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash3));
                composerM2783constructorimpl3.apply(java.lang.Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
            }
            yhoModifierMaterializerOf3.invoke(SkippableUpdater.m2774boximpl(SkippableUpdater.m2775constructorimpl(composer2)), composer2, 0);
            composer2.startReplaceableGroup(2058660585);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            IconKt.m1755Iconww6aTOc(PainterResources_androidKt.painterResource(C52761wXj.TaskDescription.fzHEvu, composer2, 0), (java.lang.String) null, SizeKt.m718size3ABfNKs(companion, androidx.compose.ui.unit.Dp.m5414constructorimpl(f)), ColorResources_androidKt.colorResource(C52761wXj.Activity.fdOvFl, composer2, 0), composer2, 432, 0);
            composer2.endReplaceableGroup();
            composer2.endNode();
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            composer2.endNode();
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            composer2.endNode();
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
            function02 = function0;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: o.vVX
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return vVO.AEQbTJ(str, function02, i, (Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final Unit EZpvd(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }

    public static final void OLrzqt(final java.util.List<RecurringListItem> list, final boolean z, Function0<Unit> function0, Composer composer, int i) {
        int i2;
        int i3;
        Composer composer2;
        final int i4;
        final Function0<Unit> function02;
        Composer composerStartRestartGroup = composer.startRestartGroup(876966039);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(list) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function0) ? 256 : 128;
        }
        int i5 = i2;
        if ((i5 & CipherSuite.TLS_RSA_PSK_WITH_3DES_EDE_CBC_SHA) != 146 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(876966039, i5, -1, "com.okinc.tradingbot.impl.order.strategy.recurring.view.TargetAllocationRow (RecurringBuyModifyInvestmentBottomSheet.kt:513)");
            }
            Modifier.Companion companion = Modifier.Companion;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            Arrangement.HorizontalOrVertical spaceBetween = Arrangement.INSTANCE.getSpaceBetween();
            Alignment.Vertical centerVertically = Alignment.Companion.getCenterVertically();
            composerStartRestartGroup.startReplaceableGroup(693286680);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(spaceBetween, centerVertically, composerStartRestartGroup, 54);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
            yHO<SkippableUpdater<ComposeUiNode>, Composer, java.lang.Integer, Unit> yhoModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierFillMaxWidth$default);
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
            Updater.m2790setimpl(composerM2783constructorimpl, measurePolicyRowMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m2790setimpl(composerM2783constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, java.lang.Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (composerM2783constructorimpl.getInserting() || !Intrinsics.EZpvd(composerM2783constructorimpl.rememberedValue(), java.lang.Integer.valueOf(currentCompositeKeyHash))) {
                composerM2783constructorimpl.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash));
                composerM2783constructorimpl.apply(java.lang.Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            yhoModifierMaterializerOf.invoke(SkippableUpdater.m2774boximpl(SkippableUpdater.m2775constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            java.lang.String strStringResource = StringResources_androidKt.stringResource(C48033uCm.Fragment.YFmri, composerStartRestartGroup, 0);
            TextStyle textStyleOLrzqt = C52698wVa.OLrzqt(C52761wXj.LoaderManager.QOLQEE, null, composerStartRestartGroup, 0, 2);
            long jColorResource = ColorResources_androidKt.colorResource(C52761wXj.Activity.aappFQ, composerStartRestartGroup, 0);
            TextUnitType.Companion companion3 = TextUnitType.Companion;
            TextKt.m2072Text4IGK_g(strStringResource, SizeKt.wrapContentSize$default(companion, null, false, 3, null), jColorResource, TextUnitKt.m5607TextUnitanM5pPY(12.0f, companion3.m5628getSpUIouoOA()), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, textStyleOLrzqt, composerStartRestartGroup, 48, 0, 65520);
            composerStartRestartGroup.startReplaceableGroup(1533610443);
            boolean zChanged = composerStartRestartGroup.changed(list);
            java.lang.Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
                i3 = 0;
                java.lang.String strJoinToString$default = CollectionsKt___CollectionsKt.joinToString$default(list, ", ", null, null, 2, "...", new Function1() { // from class: o.vVW
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return vVO.AEQbTJ((RecurringListItem) obj);
                    }
                }, 6, null);
                if (strJoinToString$default.length() == 0) {
                    strJoinToString$default = "--";
                }
                objRememberedValue = strJoinToString$default;
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            } else {
                i3 = 0;
            }
            java.lang.String str = (java.lang.String) objRememberedValue;
            composerStartRestartGroup.endReplaceableGroup();
            if (z) {
                composerStartRestartGroup.startReplaceableGroup(297966626);
                composer2 = composerStartRestartGroup;
                i4 = i;
                function02 = function0;
                C52743wWs.OLrzqt(str, null, HelperLabelType.Underlined, UnderlineStyle.Dotted, C52761wXj.LoaderManager.QOLQEE, ColorResources_androidKt.colorResource(C52761wXj.Activity.fdOvFl, composerStartRestartGroup, i3), 0, null, null, null, function0, composer2, 3456, (i5 >> 6) & 14, 962);
                composer2.endReplaceableGroup();
            } else {
                composer2 = composerStartRestartGroup;
                i4 = i;
                function02 = function0;
                composer2.startReplaceableGroup(298338533);
                TextKt.m2072Text4IGK_g(str, (Modifier) null, ColorResources_androidKt.colorResource(C52761wXj.Activity.fdOvFl, composer2, i3), TextUnitKt.m5607TextUnitanM5pPY(12.0f, companion3.m5628getSpUIouoOA()), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, C52698wVa.OLrzqt(C52761wXj.LoaderManager.QOLQEE, null, composer2, i3, 2), composer2, 0, 0, 65522);
                composer2.endReplaceableGroup();
            }
            composer2.endReplaceableGroup();
            composer2.endNode();
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
            i4 = i;
            function02 = function0;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: o.vVT
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return vVO.KWHzl(list, z, function02, i4, (Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final java.lang.CharSequence AEQbTJ(RecurringListItem recurringListItem) {
        Intrinsics.checkNotNullParameter(recurringListItem, "");
        return recurringListItem.getCcy() + " " + pTB.formatICUPercent$default(xMR.copydefault.OLrzqt((java.lang.Object) recurringListItem.getRatio()), RoundingMode.DOWN, C38307pTy.Companion.EZpvd(0), null, java.lang.Double.valueOf(C33129mqd.AEQbTJ(java.lang.Float.valueOf(100.0f))), null, 20, null);
    }

    public static final void KWHzl(final java.lang.String str, Composer composer, final int i) {
        int i2;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1499068150);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1499068150, i2, -1, "com.okinc.tradingbot.impl.order.strategy.recurring.view.EstRecurringTimesRow (RecurringBuyModifyInvestmentBottomSheet.kt:568)");
            }
            Modifier.Companion companion = Modifier.Companion;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            Arrangement.HorizontalOrVertical spaceBetween = Arrangement.INSTANCE.getSpaceBetween();
            Alignment.Vertical centerVertically = Alignment.Companion.getCenterVertically();
            composerStartRestartGroup.startReplaceableGroup(693286680);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(spaceBetween, centerVertically, composerStartRestartGroup, 54);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
            yHO<SkippableUpdater<ComposeUiNode>, Composer, java.lang.Integer, Unit> yhoModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierFillMaxWidth$default);
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
            Updater.m2790setimpl(composerM2783constructorimpl, measurePolicyRowMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m2790setimpl(composerM2783constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, java.lang.Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (composerM2783constructorimpl.getInserting() || !Intrinsics.EZpvd(composerM2783constructorimpl.rememberedValue(), java.lang.Integer.valueOf(currentCompositeKeyHash))) {
                composerM2783constructorimpl.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash));
                composerM2783constructorimpl.apply(java.lang.Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            yhoModifierMaterializerOf.invoke(SkippableUpdater.m2774boximpl(SkippableUpdater.m2775constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            java.lang.String strStringResource = StringResources_androidKt.stringResource(C48033uCm.Fragment.onComplete, composerStartRestartGroup, 0);
            TextStyle textStyleOLrzqt = C52698wVa.OLrzqt(C52761wXj.LoaderManager.QOLQEE, null, composerStartRestartGroup, 0, 2);
            long jColorResource = ColorResources_androidKt.colorResource(C52761wXj.Activity.aappFQ, composerStartRestartGroup, 0);
            TextUnitType.Companion companion3 = TextUnitType.Companion;
            TextKt.m2072Text4IGK_g(strStringResource, SizeKt.wrapContentSize$default(companion, null, false, 3, null), jColorResource, TextUnitKt.m5607TextUnitanM5pPY(12.0f, companion3.m5628getSpUIouoOA()), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, textStyleOLrzqt, composerStartRestartGroup, 48, 0, 65520);
            composer2 = composerStartRestartGroup;
            TextKt.m2072Text4IGK_g(str, (Modifier) null, ColorResources_androidKt.colorResource(C52761wXj.Activity.fdOvFl, composerStartRestartGroup, 0), TextUnitKt.m5607TextUnitanM5pPY(12.0f, companion3.m5628getSpUIouoOA()), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, C52698wVa.OLrzqt(C52761wXj.LoaderManager.QOLQEE, null, composerStartRestartGroup, 0, 2), composer2, i2 & 14, 0, 65522);
            composer2.endReplaceableGroup();
            composer2.endNode();
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: o.vVY
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return vVO.AEQbTJ(str, i, (Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void AEQbTJ(final java.lang.String str, final boolean z, final Function0<Unit> function0, Composer composer, final int i) {
        int i2;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1138275465);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function0) ? 256 : 128;
        }
        int i3 = i2;
        if ((i3 & CipherSuite.TLS_RSA_PSK_WITH_3DES_EDE_CBC_SHA) != 146 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1138275465, i3, -1, "com.okinc.tradingbot.impl.order.strategy.recurring.view.AveragePriceRow (RecurringBuyModifyInvestmentBottomSheet.kt:596)");
            }
            Modifier.Companion companion = Modifier.Companion;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            Arrangement.HorizontalOrVertical spaceBetween = Arrangement.INSTANCE.getSpaceBetween();
            Alignment.Vertical centerVertically = Alignment.Companion.getCenterVertically();
            composerStartRestartGroup.startReplaceableGroup(693286680);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(spaceBetween, centerVertically, composerStartRestartGroup, 54);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
            yHO<SkippableUpdater<ComposeUiNode>, Composer, java.lang.Integer, Unit> yhoModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierFillMaxWidth$default);
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
            Updater.m2790setimpl(composerM2783constructorimpl, measurePolicyRowMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m2790setimpl(composerM2783constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, java.lang.Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (composerM2783constructorimpl.getInserting() || !Intrinsics.EZpvd(composerM2783constructorimpl.rememberedValue(), java.lang.Integer.valueOf(currentCompositeKeyHash))) {
                composerM2783constructorimpl.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash));
                composerM2783constructorimpl.apply(java.lang.Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            yhoModifierMaterializerOf.invoke(SkippableUpdater.m2774boximpl(SkippableUpdater.m2775constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            java.lang.String strStringResource = StringResources_androidKt.stringResource(C48033uCm.Fragment.hBUiXU, composerStartRestartGroup, 0);
            TextStyle textStyleOLrzqt = C52698wVa.OLrzqt(C52761wXj.LoaderManager.QOLQEE, null, composerStartRestartGroup, 0, 2);
            long jColorResource = ColorResources_androidKt.colorResource(C52761wXj.Activity.aappFQ, composerStartRestartGroup, 0);
            TextUnitType.Companion companion3 = TextUnitType.Companion;
            TextKt.m2072Text4IGK_g(strStringResource, SizeKt.wrapContentSize$default(companion, null, false, 3, null), jColorResource, TextUnitKt.m5607TextUnitanM5pPY(12.0f, companion3.m5628getSpUIouoOA()), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, textStyleOLrzqt, composerStartRestartGroup, 48, 0, 65520);
            if (z) {
                composerStartRestartGroup.startReplaceableGroup(-283007360);
                composer2 = composerStartRestartGroup;
                C52743wWs.OLrzqt(str, null, HelperLabelType.Underlined, UnderlineStyle.Dotted, C52761wXj.LoaderManager.QOLQEE, ColorResources_androidKt.colorResource(C52761wXj.Activity.fdOvFl, composerStartRestartGroup, 0), 1, null, null, null, function0, composer2, (i3 & 14) | 1576320, (i3 >> 6) & 14, 898);
                composer2.endReplaceableGroup();
            } else {
                composer2 = composerStartRestartGroup;
                composer2.startReplaceableGroup(-282607646);
                TextKt.m2072Text4IGK_g(str, (Modifier) null, ColorResources_androidKt.colorResource(C52761wXj.Activity.fdOvFl, composer2, 0), TextUnitKt.m5607TextUnitanM5pPY(12.0f, companion3.m5628getSpUIouoOA()), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, C52698wVa.OLrzqt(C52761wXj.LoaderManager.QOLQEE, null, composer2, 0, 2), composer2, i3 & 14, 0, 65522);
                composer2.endReplaceableGroup();
            }
            composer2.endReplaceableGroup();
            composer2.endNode();
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: o.vWc
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return vVO.copydefault(str, z, function0, i, (Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void OLrzqt(final java.lang.String str, final boolean z, final Function0<Unit> function0, Composer composer, final int i) {
        int i2;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1277232094);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function0) ? 256 : 128;
        }
        int i3 = i2;
        if ((i3 & CipherSuite.TLS_RSA_PSK_WITH_3DES_EDE_CBC_SHA) != 146 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1277232094, i3, -1, "com.okinc.tradingbot.impl.order.strategy.recurring.view.LastPriceRow (RecurringBuyModifyInvestmentBottomSheet.kt:636)");
            }
            Modifier.Companion companion = Modifier.Companion;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            Arrangement.HorizontalOrVertical spaceBetween = Arrangement.INSTANCE.getSpaceBetween();
            Alignment.Vertical centerVertically = Alignment.Companion.getCenterVertically();
            composerStartRestartGroup.startReplaceableGroup(693286680);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(spaceBetween, centerVertically, composerStartRestartGroup, 54);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
            yHO<SkippableUpdater<ComposeUiNode>, Composer, java.lang.Integer, Unit> yhoModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierFillMaxWidth$default);
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
            Updater.m2790setimpl(composerM2783constructorimpl, measurePolicyRowMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m2790setimpl(composerM2783constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, java.lang.Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (composerM2783constructorimpl.getInserting() || !Intrinsics.EZpvd(composerM2783constructorimpl.rememberedValue(), java.lang.Integer.valueOf(currentCompositeKeyHash))) {
                composerM2783constructorimpl.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash));
                composerM2783constructorimpl.apply(java.lang.Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            yhoModifierMaterializerOf.invoke(SkippableUpdater.m2774boximpl(SkippableUpdater.m2775constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            java.lang.String strStringResource = StringResources_androidKt.stringResource(C55688xof.Application.getNavigationMode, composerStartRestartGroup, 0);
            TextStyle textStyleOLrzqt = C52698wVa.OLrzqt(C52761wXj.LoaderManager.QOLQEE, null, composerStartRestartGroup, 0, 2);
            long jColorResource = ColorResources_androidKt.colorResource(C52761wXj.Activity.aappFQ, composerStartRestartGroup, 0);
            TextUnitType.Companion companion3 = TextUnitType.Companion;
            TextKt.m2072Text4IGK_g(strStringResource, SizeKt.wrapContentSize$default(companion, null, false, 3, null), jColorResource, TextUnitKt.m5607TextUnitanM5pPY(12.0f, companion3.m5628getSpUIouoOA()), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, textStyleOLrzqt, composerStartRestartGroup, 48, 0, 65520);
            if (z) {
                composerStartRestartGroup.startReplaceableGroup(359599599);
                composer2 = composerStartRestartGroup;
                C52743wWs.OLrzqt(str, null, HelperLabelType.Underlined, UnderlineStyle.Dotted, C52761wXj.LoaderManager.QOLQEE, ColorResources_androidKt.colorResource(C52761wXj.Activity.fdOvFl, composerStartRestartGroup, 0), 1, null, null, null, function0, composer2, (i3 & 14) | 1576320, (i3 >> 6) & 14, 898);
                composer2.endReplaceableGroup();
            } else {
                composer2 = composerStartRestartGroup;
                composer2.startReplaceableGroup(359999313);
                TextKt.m2072Text4IGK_g(str, (Modifier) null, ColorResources_androidKt.colorResource(C52761wXj.Activity.fdOvFl, composer2, 0), TextUnitKt.m5607TextUnitanM5pPY(12.0f, companion3.m5628getSpUIouoOA()), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, C52698wVa.OLrzqt(C52761wXj.LoaderManager.QOLQEE, null, composer2, 0, 2), composer2, i3 & 14, 0, 65522);
                composer2.endReplaceableGroup();
            }
            composer2.endReplaceableGroup();
            composer2.endNode();
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: o.vWb
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return vVO.AEQbTJ(str, z, function0, i, (Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final kotlin.Pair<? extends java.lang.String, ? extends java.lang.String> AEQbTJ(androidx.compose.runtime.State<uLP> state) {
        return state.getValue().OLrzqt();
    }

    public static final kotlin.Pair<? extends java.lang.String, ? extends java.lang.String> EZpvd(androidx.compose.runtime.State<uLP> state) {
        return state.getValue().OLrzqt();
    }

    public static final java.lang.String KWHzl(androidx.compose.runtime.State<java.lang.String> state) {
        return state.getValue();
    }

    public static final java.lang.String copydefault(androidx.compose.runtime.State<java.lang.String> state) {
        return state.getValue();
    }

    public static final java.lang.String OLrzqt(androidx.compose.runtime.State<java.lang.String> state) {
        return state.getValue();
    }

    public static final RecurringBuyModifyInvestmentViewModel.InputValidationError djBIcL(androidx.compose.runtime.State<? extends RecurringBuyModifyInvestmentViewModel.InputValidationError> state) {
        return state.getValue();
    }
}
