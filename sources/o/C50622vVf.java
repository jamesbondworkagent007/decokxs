package o;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
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
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
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
import androidx.fragment.app.FragmentActivity;
import com.amplifyframework.ui.liveness.ml.FaceDetector;
import com.google.android.exoplayer2.audio.WavUtil;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import com.okinc.business.defi.biz.core.error.WalletImportError;
import com.okinc.tradingbot.impl.order.strategy.recurring.view.data.FirstTimeBuyOption;
import com.okinc.tradingbot.impl.order.strategy.recurring.view.data.RecurringBuyFrequency;
import com.okinc.unify_trade.bot.util.recurring.RecurringWeekConfig;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.C48033uCm;
import o.C52761wXj;
import o.C55688xof;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* JADX INFO: renamed from: o.vVf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C50622vVf {

    /* JADX INFO: renamed from: o.vVf$TaskDescription */
    public final /* synthetic */ class TaskDescription {
        public static final /* synthetic */ int[] AEQbTJ;
        public static final /* synthetic */ int[] OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[RecurringBuyFrequency.values().length];
            try {
                iArr[RecurringBuyFrequency.WEEKLY.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[RecurringBuyFrequency.MONTHLY.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            OLrzqt = iArr;
            int[] iArr2 = new int[FirstTimeBuyOption.values().length];
            try {
                iArr2[FirstTimeBuyOption.BUY_NOW.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr2[FirstTimeBuyOption.BUY_CUSTOM.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            AEQbTJ = iArr2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final Unit EZpvd(FirstTimeBuyOption firstTimeBuyOption, int i, int i2, RecurringBuyFrequency recurringBuyFrequency, boolean z, yHO yho, int i3, Composer composer, int i4) {
        copydefault(firstTimeBuyOption, i, i2, recurringBuyFrequency, z, yho, composer, RecomposeScopeImplKt.updateChangedFlags(i3 | 1));
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final Unit OLrzqt(RecurringBuyFrequency recurringBuyFrequency, FirstTimeBuyOption firstTimeBuyOption, int i, int i2, boolean z, Function1 function1, yHO yho, int i3, Composer composer, int i4) {
        AEQbTJ(recurringBuyFrequency, firstTimeBuyOption, i, i2, z, function1, yho, composer, RecomposeScopeImplKt.updateChangedFlags(i3 | 1));
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final Unit OLrzqt(java.lang.String str, Function0 function0, int i, Composer composer, int i2) {
        KWHzl(str, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final Unit copydefault(RecurringBuyFrequency recurringBuyFrequency, Function1 function1, int i, Composer composer, int i2) {
        copydefault(recurringBuyFrequency, (Function1<? super RecurringBuyFrequency, Unit>) function1, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void AEQbTJ(final RecurringBuyFrequency recurringBuyFrequency, final FirstTimeBuyOption firstTimeBuyOption, final int i, final int i2, final boolean z, final Function1<? super RecurringBuyFrequency, Unit> function1, final yHO<? super FirstTimeBuyOption, ? super vUQ, ? super C50657vWn, Unit> yho, Composer composer, final int i3) {
        int i4;
        Composer composerStartRestartGroup = composer.startRestartGroup(393985282);
        if ((i3 & 6) == 0) {
            i4 = (composerStartRestartGroup.changed(recurringBuyFrequency) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= composerStartRestartGroup.changed(firstTimeBuyOption) ? 32 : 16;
        }
        if ((i3 & MLKEMEngine.KyberPolyBytes) == 0) {
            i4 |= composerStartRestartGroup.changed(i) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i4 |= composerStartRestartGroup.changed(i2) ? 2048 : 1024;
        }
        if ((i3 & 24576) == 0) {
            i4 |= composerStartRestartGroup.changed(z) ? 16384 : 8192;
        }
        if ((196608 & i3) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(function1) ? 131072 : 65536;
        }
        if ((1572864 & i3) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(yho) ? 1048576 : 524288;
        }
        if ((599187 & i4) != 599186 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(393985282, i4, -1, "com.okinc.tradingbot.impl.order.strategy.recurring.view.RecurringBuyFrequencySelectionContent (RecurringBuyFrequencySelectionBottomSheet.kt:309)");
            }
            float f = 24;
            Modifier modifierM675paddingqDBjuR0$default = PaddingKt.m675paddingqDBjuR0$default(PaddingKt.m673paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), androidx.compose.ui.unit.Dp.m5414constructorimpl(f), 0.0f, 2, null), 0.0f, androidx.compose.ui.unit.Dp.m5414constructorimpl(8), 0.0f, androidx.compose.ui.unit.Dp.m5414constructorimpl(f), 5, null);
            Arrangement.HorizontalOrVertical horizontalOrVerticalM582spacedBy0680j_4 = Arrangement.INSTANCE.m582spacedBy0680j_4(androidx.compose.ui.unit.Dp.m5414constructorimpl(f));
            composerStartRestartGroup.startReplaceableGroup(-483455358);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(horizontalOrVerticalM582spacedBy0680j_4, Alignment.Companion.getStart(), composerStartRestartGroup, 6);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            Function0<ComposeUiNode> constructor = companion.getConstructor();
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
            Updater.m2790setimpl(composerM2783constructorimpl, measurePolicyColumnMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m2790setimpl(composerM2783constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, java.lang.Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (composerM2783constructorimpl.getInserting() || !Intrinsics.EZpvd(composerM2783constructorimpl.rememberedValue(), java.lang.Integer.valueOf(currentCompositeKeyHash))) {
                composerM2783constructorimpl.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash));
                composerM2783constructorimpl.apply(java.lang.Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            yhoModifierMaterializerOf.invoke(SkippableUpdater.m2774boximpl(SkippableUpdater.m2775constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            copydefault(recurringBuyFrequency, function1, composerStartRestartGroup, (i4 & 14) | ((i4 >> 12) & WalletImportError.ERROR_CODE_AA_EXIST));
            int i5 = i4 >> 3;
            copydefault(firstTimeBuyOption, vUQ.OLrzqt(i), C50657vWn.OLrzqt(i2), recurringBuyFrequency, z, yho, composerStartRestartGroup, ((i4 << 9) & 7168) | (i5 & 14) | (57344 & i4) | (i5 & 458752));
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
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: o.vVl
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return C50622vVf.OLrzqt(recurringBuyFrequency, firstTimeBuyOption, i, i2, z, function1, yho, i3, (Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x006f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void copydefault(final RecurringBuyFrequency recurringBuyFrequency, final Function1<? super RecurringBuyFrequency, Unit> function1, Composer composer, final int i) {
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1314062078);
        int i2 = (i & 6) == 0 ? (composerStartRestartGroup.changed(recurringBuyFrequency) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        int i3 = i2;
        if ((i3 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1314062078, i3, -1, "com.okinc.tradingbot.impl.order.strategy.recurring.view.FrequencySection (RecurringBuyFrequencySelectionBottomSheet.kt:337)");
            }
            java.util.List<RecurringBuyFrequency> listEZpvd = RecurringBuyFrequency.Companion.EZpvd();
            composerStartRestartGroup.startReplaceableGroup(623121371);
            boolean zChanged = composerStartRestartGroup.changed(listEZpvd);
            java.lang.Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (!zChanged) {
                java.lang.Object obj = objRememberedValue;
                if (objRememberedValue == Composer.Companion.getEmpty()) {
                    java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listEZpvd, 10));
                    for (RecurringBuyFrequency recurringBuyFrequency2 : listEZpvd) {
                        arrayList.add(new wWR(recurringBuyFrequency2.name(), recurringBuyFrequency2.getDisplayString(), recurringBuyFrequency2));
                    }
                    composerStartRestartGroup.updateRememberedValue(arrayList);
                    obj = arrayList;
                }
                java.util.List list = (java.util.List) obj;
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.startReplaceableGroup(623130884);
                boolean z = (i3 & 14) == 4;
                boolean zChanged2 = composerStartRestartGroup.changed(listEZpvd);
                java.lang.Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if ((z | zChanged2) || objRememberedValue2 == Composer.Companion.getEmpty()) {
                    objRememberedValue2 = java.lang.Integer.valueOf(listEZpvd.indexOf(recurringBuyFrequency));
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                int iIntValue = ((java.lang.Number) objRememberedValue2).intValue();
                composerStartRestartGroup.endReplaceableGroup();
                Arrangement.HorizontalOrVertical horizontalOrVerticalM582spacedBy0680j_4 = Arrangement.INSTANCE.m582spacedBy0680j_4(androidx.compose.ui.unit.Dp.m5414constructorimpl(8));
                composerStartRestartGroup.startReplaceableGroup(-483455358);
                Modifier.Companion companion = Modifier.Companion;
                MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(horizontalOrVerticalM582spacedBy0680j_4, Alignment.Companion.getStart(), composerStartRestartGroup, 6);
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
                Function0<ComposeUiNode> constructor = companion2.getConstructor();
                yHO<SkippableUpdater<ComposeUiNode>, Composer, java.lang.Integer, Unit> yhoModifierMaterializerOf = LayoutKt.modifierMaterializerOf(companion);
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
                TextKt.m2072Text4IGK_g(StringResources_androidKt.stringResource(C55688xof.Application.PlaybackStateCompatRepeatMode, composerStartRestartGroup, 0), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, C52698wVa.OLrzqt(C52761wXj.LoaderManager.gHZMYf, null, composerStartRestartGroup, 0, 2), composerStartRestartGroup, 0, 0, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE);
                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                Composer composer3 = composerStartRestartGroup;
                composer3.startReplaceableGroup(791218833);
                boolean z2 = (i3 & WalletImportError.ERROR_CODE_AA_EXIST) == 32;
                java.lang.Object objRememberedValue3 = composer3.rememberedValue();
                if (z2 || objRememberedValue3 == Composer.Companion.getEmpty()) {
                    objRememberedValue3 = new Function2() { // from class: o.vVk
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                            return C50622vVf.AEQbTJ(function1, ((java.lang.Integer) obj2).intValue(), (wWR) obj3);
                        }
                    };
                    composer3.updateRememberedValue(objRememberedValue3);
                }
                composer3.endReplaceableGroup();
                C52749wWy.copydefault(modifierFillMaxWidth$default, list, iIntValue, 4, 3, 44, (Function2) objRememberedValue3, composer3, 224262, 0);
                composer3.endReplaceableGroup();
                composer3.endNode();
                composer3.endReplaceableGroup();
                composer3.endReplaceableGroup();
                composer2 = composer3;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                    composer2 = composer3;
                }
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: o.vVo
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                    return C50622vVf.copydefault(recurringBuyFrequency, function1, i, (Composer) obj2, ((java.lang.Integer) obj3).intValue());
                }
            });
        }
    }

    public static final Unit AEQbTJ(Function1 function1, int i, wWR wwr) {
        Intrinsics.checkNotNullParameter(wwr, "");
        RecurringBuyFrequency recurringBuyFrequency = (RecurringBuyFrequency) wwr.copydefault();
        if (recurringBuyFrequency != null) {
            function1.invoke(recurringBuyFrequency);
        }
        return Unit.INSTANCE;
    }

    public static final void copydefault(final FirstTimeBuyOption firstTimeBuyOption, final int i, final int i2, final RecurringBuyFrequency recurringBuyFrequency, final boolean z, final yHO<? super FirstTimeBuyOption, ? super vUQ, ? super C50657vWn, Unit> yho, Composer composer, final int i3) {
        int i4;
        int i5;
        Composer composer2;
        Composer composer3;
        java.lang.String strStringResource;
        Composer composerStartRestartGroup = composer.startRestartGroup(682740690);
        if ((i3 & 6) == 0) {
            i4 = (composerStartRestartGroup.changed(firstTimeBuyOption) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= composerStartRestartGroup.changed(i) ? 32 : 16;
        }
        if ((i3 & MLKEMEngine.KyberPolyBytes) == 0) {
            i4 |= composerStartRestartGroup.changed(i2) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i4 |= composerStartRestartGroup.changed(recurringBuyFrequency) ? 2048 : 1024;
        }
        if ((i3 & 24576) == 0) {
            i4 |= composerStartRestartGroup.changed(z) ? 16384 : 8192;
        }
        if ((196608 & i3) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(yho) ? 131072 : 65536;
        }
        if ((i4 & 74899) != 74898 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(682740690, i4, -1, "com.okinc.tradingbot.impl.order.strategy.recurring.view.FirstBuyTimeSection (RecurringBuyFrequencySelectionBottomSheet.kt:400)");
            }
            final android.content.Context context = (android.content.Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            Arrangement.HorizontalOrVertical horizontalOrVerticalM582spacedBy0680j_4 = Arrangement.INSTANCE.m582spacedBy0680j_4(androidx.compose.ui.unit.Dp.m5414constructorimpl(8));
            composerStartRestartGroup.startReplaceableGroup(-483455358);
            Modifier.Companion companion = Modifier.Companion;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(horizontalOrVerticalM582spacedBy0680j_4, Alignment.Companion.getStart(), composerStartRestartGroup, 6);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
            yHO<SkippableUpdater<ComposeUiNode>, Composer, java.lang.Integer, Unit> yhoModifierMaterializerOf = LayoutKt.modifierMaterializerOf(companion);
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
            TextKt.m2072Text4IGK_g(StringResources_androidKt.stringResource(C48033uCm.Fragment.aGOrKO, composerStartRestartGroup, 0), (Modifier) null, ColorResources_androidKt.colorResource(C52761wXj.Activity.fdOvFl, composerStartRestartGroup, 0), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, C52698wVa.OLrzqt(C52761wXj.LoaderManager.gHZMYf, null, composerStartRestartGroup, 0, 2), composerStartRestartGroup, 0, 0, 65530);
            java.lang.String strEZpvd = EZpvd(firstTimeBuyOption, recurringBuyFrequency, i, i2);
            composerStartRestartGroup.startReplaceableGroup(1707311605);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(context);
            boolean z2 = (i4 & 14) == 4;
            boolean z3 = (i4 & FaceDetector.NUM_BOXES) == 256;
            boolean z4 = (i4 & 7168) == 2048;
            boolean z5 = (i4 & WalletImportError.ERROR_CODE_AA_EXIST) == 32;
            boolean z6 = (i4 & 458752) == 131072;
            java.lang.Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if ((z6 || (z3 | zChangedInstance | z2 | z4 | z5)) || objRememberedValue == Composer.Companion.getEmpty()) {
                i5 = 0;
                composer2 = composerStartRestartGroup;
                Function0 function0 = new Function0() { // from class: o.vVq
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return C50622vVf.AEQbTJ(context, firstTimeBuyOption, i2, recurringBuyFrequency, i, yho);
                    }
                };
                composer2.updateRememberedValue(function0);
                objRememberedValue = function0;
            } else {
                composer2 = composerStartRestartGroup;
                i5 = 0;
            }
            composer2.endReplaceableGroup();
            KWHzl(strEZpvd, (Function0) objRememberedValue, composer2, i5);
            composer2.startReplaceableGroup(1707361380);
            if (z) {
                if (firstTimeBuyOption == FirstTimeBuyOption.BUY_NOW) {
                    composer2.startReplaceableGroup(1388677473);
                    strStringResource = StringResources_androidKt.stringResource(C48033uCm.Fragment.hOMIpD, composer2, i5);
                    composer2.endReplaceableGroup();
                } else {
                    composer2.startReplaceableGroup(1388806185);
                    strStringResource = StringResources_androidKt.stringResource(C48033uCm.Fragment.hlXVux, composer2, i5);
                    composer2.endReplaceableGroup();
                }
                TextStyle textStyleOLrzqt = C52698wVa.OLrzqt(C52761wXj.LoaderManager.AYXKKw, null, composer2, i5, 2);
                composer3 = composer2;
                TextKt.m2072Text4IGK_g(strStringResource, PaddingKt.m675paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), 0.0f, androidx.compose.ui.unit.Dp.m5414constructorimpl(24), 0.0f, 0.0f, 13, null), ColorResources_androidKt.colorResource(C52761wXj.Activity.QwvEab, composer2, i5), TextUnitKt.m5607TextUnitanM5pPY(14.0f, TextUnitType.Companion.m5628getSpUIouoOA()), (FontStyle) null, FontWeight.Companion.getW400(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, textStyleOLrzqt, composer3, 196656, 0, 65488);
            } else {
                composer3 = composer2;
            }
            composer3.endReplaceableGroup();
            composer3.endReplaceableGroup();
            composer3.endNode();
            composer3.endReplaceableGroup();
            composer3.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer3 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: o.vVr
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return C50622vVf.EZpvd(firstTimeBuyOption, i, i2, recurringBuyFrequency, z, yho, i3, (Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final Unit AEQbTJ(android.content.Context context, FirstTimeBuyOption firstTimeBuyOption, int i, RecurringBuyFrequency recurringBuyFrequency, int i2, final yHO yho) {
        FragmentActivity fragmentActivity = context instanceof FragmentActivity ? (FragmentActivity) context : null;
        if (fragmentActivity == null) {
            return Unit.INSTANCE;
        }
        FirstTimeBuyOption firstTimeBuyOption2 = FirstTimeBuyOption.BUY_NOW;
        if (firstTimeBuyOption == firstTimeBuyOption2) {
            i = C56046xvS.AEQbTJ.AEQbTJ();
        }
        int i3 = i;
        if (firstTimeBuyOption == firstTimeBuyOption2) {
            int i4 = TaskDescription.OLrzqt[recurringBuyFrequency.ordinal()];
            if (i4 == 1) {
                i2 = C56046xvS.AEQbTJ.KWHzl();
            } else if (i4 == 2) {
                i2 = C56046xvS.AEQbTJ.EZpvd();
            }
        }
        C50636vVt.Companion.OLrzqt(firstTimeBuyOption, i3, i2, recurringBuyFrequency, new yHO() { // from class: o.vVm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.yHO
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return C50622vVf.AEQbTJ(yho, (FirstTimeBuyOption) obj, ((java.lang.Integer) obj2).intValue(), ((java.lang.Integer) obj3).intValue());
            }
        }).show(fragmentActivity.getSupportFragmentManager(), "RecurringBuyFrequencyStartTimeBottomSheet");
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(yHO yho, FirstTimeBuyOption firstTimeBuyOption, int i, int i2) {
        Intrinsics.checkNotNullParameter(firstTimeBuyOption, "");
        yho.invoke(firstTimeBuyOption, vUQ.EZpvd(vUQ.OLrzqt(i)), C50657vWn.EZpvd(C50657vWn.OLrzqt(i2)));
        return Unit.INSTANCE;
    }

    public static final void KWHzl(final java.lang.String str, final Function0<Unit> function0, Composer composer, final int i) {
        int i2;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1302454536);
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
                ComposerKt.traceEventStart(-1302454536, i3, -1, "com.okinc.tradingbot.impl.order.strategy.recurring.view.FirstBuyTimeSelector (RecurringBuyFrequencySelectionBottomSheet.kt:483)");
            }
            Modifier.Companion companion = Modifier.Companion;
            Modifier modifierM349backgroundbw27NRU = BackgroundKt.m349backgroundbw27NRU(SizeKt.m704height3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), androidx.compose.ui.unit.Dp.m5414constructorimpl(48)), ColorResources_androidKt.colorResource(C52761wXj.Activity.GQzpsZ, composerStartRestartGroup, 0), RoundedCornerShapeKt.m924RoundedCornerShape0680j_4(androidx.compose.ui.unit.Dp.m5414constructorimpl(8)));
            composerStartRestartGroup.startReplaceableGroup(1098481387);
            boolean z = (i3 & WalletImportError.ERROR_CODE_AA_EXIST) == 32;
            java.lang.Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new Function0() { // from class: o.vVg
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return C50622vVf.copydefault(function0);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            Modifier modifierM672paddingVpY3zN4 = PaddingKt.m672paddingVpY3zN4(ClickableKt.m383clickableXHw0xAI$default(modifierM349backgroundbw27NRU, false, null, null, (Function0) objRememberedValue, 7, null), androidx.compose.ui.unit.Dp.m5414constructorimpl(12), androidx.compose.ui.unit.Dp.m5414constructorimpl(4));
            Alignment.Vertical centerVertically = Alignment.Companion.getCenterVertically();
            Arrangement.HorizontalOrVertical spaceBetween = Arrangement.INSTANCE.getSpaceBetween();
            composerStartRestartGroup.startReplaceableGroup(693286680);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(spaceBetween, centerVertically, composerStartRestartGroup, 54);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
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
            Updater.m2790setimpl(composerM2783constructorimpl, measurePolicyRowMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m2790setimpl(composerM2783constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, java.lang.Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (composerM2783constructorimpl.getInserting() || !Intrinsics.EZpvd(composerM2783constructorimpl.rememberedValue(), java.lang.Integer.valueOf(currentCompositeKeyHash))) {
                composerM2783constructorimpl.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash));
                composerM2783constructorimpl.apply(java.lang.Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            yhoModifierMaterializerOf.invoke(SkippableUpdater.m2774boximpl(SkippableUpdater.m2775constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            TextKt.m2072Text4IGK_g(str, RowScope.weight$default(RowScopeInstance.INSTANCE, companion, 1.0f, false, 2, null), ColorResources_androidKt.colorResource(C52761wXj.Activity.fdOvFl, composerStartRestartGroup, 0), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, C52698wVa.OLrzqt(C52761wXj.LoaderManager.zuBGHE, null, composerStartRestartGroup, 0, 2), composerStartRestartGroup, i3 & 14, 0, 65528);
            composer2 = composerStartRestartGroup;
            IconKt.m1755Iconww6aTOc(PainterResources_androidKt.painterResource(C52761wXj.TaskDescription.OJuSTm, composer2, 0), (java.lang.String) null, SizeKt.m718size3ABfNKs(companion, androidx.compose.ui.unit.Dp.m5414constructorimpl(20)), ColorResources_androidKt.colorResource(C52761wXj.Activity.fdOvFl, composer2, 0), composer2, 432, 0);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: o.vVn
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return C50622vVf.OLrzqt(str, function0, i, (Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final Unit copydefault(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }

    public static final java.lang.String copydefault(java.lang.String str, java.lang.String str2) {
        return C33069mpW.copydefault(C55688xof.Application.DXTac, C56424yEw.gEmmrt(C56390yDp.OLrzqt("frequency", str), C56390yDp.OLrzqt(CrashHianalyticsData.TIME, str2)));
    }

    public static final java.lang.String EZpvd(FirstTimeBuyOption firstTimeBuyOption, RecurringBuyFrequency recurringBuyFrequency, int i, int i2) {
        java.lang.String str;
        int i3 = TaskDescription.AEQbTJ[firstTimeBuyOption.ordinal()];
        if (i3 == 1) {
            return firstTimeBuyOption.getTitleString();
        }
        if (i3 != 2) {
            throw new NoWhenBranchMatchedException();
        }
        C56529yIt c56529yIt = C56529yIt.KWHzl;
        java.lang.String str2 = java.lang.String.format("%02d:00", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(i2)}, 1));
        Intrinsics.checkNotNullExpressionValue(str2, "");
        int i4 = TaskDescription.OLrzqt[recurringBuyFrequency.ordinal()];
        if (i4 == 1) {
            return copydefault(RecurringWeekConfig.Companion.OLrzqt(i + 1), str2);
        }
        if (i4 != 2) {
            return str2;
        }
        if (xMP.AEQbTJ.AEQbTJ()) {
            str = (i + 1) + C33070mpX.AYXKKw(C55688xof.Application.getIcon);
        } else {
            str = C33070mpX.AYXKKw(C55688xof.Application.getIcon) + " " + (i + 1);
        }
        return copydefault(str, str2);
    }
}
