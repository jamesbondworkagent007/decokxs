package o;

import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.gestures.FlingBehavior;
import androidx.compose.foundation.gestures.snapping.LazyListSnapLayoutInfoProviderKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.AlphaKt;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.input.nestedscroll.NestedScrollModifierKt;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.res.ColorResources_androidKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.compose.ui.unit.TextUnitType;
import androidx.profileinstaller.ProfileVerifier;
import com.amplifyframework.ui.liveness.ml.FaceDetector;
import com.okinc.business.defi.biz.core.error.WalletImportError;
import com.okinc.tradingbot.impl.order.strategy.recurring.view.RecurringBuyFrequencyStartTimeBottomSheetKt$WheelPicker$1$1;
import com.okinc.tradingbot.impl.order.strategy.recurring.view.RecurringBuyFrequencyStartTimeBottomSheetKt$WheelPicker$2$1;
import com.okinc.tradingbot.impl.order.strategy.recurring.view.data.FirstTimeBuyOption;
import com.okinc.tradingbot.impl.order.strategy.recurring.view.data.RecurringBuyFrequency;
import com.okinc.unify_trade.bot.util.recurring.RecurringWeekConfig;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.C50637vVu;
import o.C52698wVa;
import o.C52761wXj;
import o.C55688xof;
import o.C56548yJl;
import o.yHO;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import org.jetbrains.annotations.NotNull;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: renamed from: o.vVu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C50637vVu {
    public static final float AEQbTJ = androidx.compose.ui.unit.Dp.m5414constructorimpl(52);

    /* JADX INFO: renamed from: o.vVu$StateListAnimator */
    public final /* synthetic */ class StateListAnimator {
        public static final /* synthetic */ int[] AEQbTJ;

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
            AEQbTJ = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final Unit EZpvd(FirstTimeBuyOption firstTimeBuyOption, boolean z, Function0 function0, int i, Composer composer, int i2) {
        copydefault(firstTimeBuyOption, z, (Function0<Unit>) function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final Unit EZpvd(java.util.List list, int i, Function1 function1, Modifier modifier, int i2, float f, int i3, int i4, Composer composer, int i5) {
        OLrzqt((java.util.List<java.lang.String>) list, i, (Function1<? super java.lang.Integer, Unit>) function1, modifier, i2, f, composer, RecomposeScopeImplKt.updateChangedFlags(i3 | 1), i4);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final Unit KWHzl(int i, Function1 function1, Modifier modifier, int i2, int i3, Composer composer, int i4) {
        copydefault(i, function1, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final Unit KWHzl(NestedScrollConnection nestedScrollConnection, RecurringBuyFrequency recurringBuyFrequency, int i, int i2, Function1 function1, Function1 function12, int i3, Composer composer, int i4) {
        KWHzl(nestedScrollConnection, recurringBuyFrequency, i, i2, function1, function12, composer, RecomposeScopeImplKt.updateChangedFlags(i3 | 1));
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final Unit copydefault(NestedScrollConnection nestedScrollConnection, FirstTimeBuyOption firstTimeBuyOption, int i, int i2, RecurringBuyFrequency recurringBuyFrequency, Function1 function1, Function1 function12, Function1 function13, int i3, Composer composer, int i4) {
        OLrzqt(nestedScrollConnection, firstTimeBuyOption, i, i2, recurringBuyFrequency, function1, function12, function13, composer, RecomposeScopeImplKt.updateChangedFlags(i3 | 1));
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final Unit copydefault(RecurringBuyFrequency recurringBuyFrequency, int i, Function1 function1, Modifier modifier, int i2, int i3, Composer composer, int i4) {
        copydefault(recurringBuyFrequency, i, function1, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    public static final void OLrzqt(final NestedScrollConnection nestedScrollConnection, final FirstTimeBuyOption firstTimeBuyOption, final int i, final int i2, final RecurringBuyFrequency recurringBuyFrequency, final Function1<? super FirstTimeBuyOption, Unit> function1, final Function1<? super java.lang.Integer, Unit> function12, final Function1<? super java.lang.Integer, Unit> function13, Composer composer, final int i3) {
        int i4;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1640941010);
        if ((i3 & 6) == 0) {
            i4 = (composerStartRestartGroup.changedInstance(nestedScrollConnection) ? 4 : 2) | i3;
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
            i4 |= composerStartRestartGroup.changed(recurringBuyFrequency) ? 16384 : 8192;
        }
        if ((196608 & i3) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(function1) ? 131072 : 65536;
        }
        if ((1572864 & i3) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(function12) ? 1048576 : 524288;
        }
        if ((12582912 & i3) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(function13) ? 8388608 : 4194304;
        }
        if ((4793491 & i4) != 4793490 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1640941010, i4, -1, "com.okinc.tradingbot.impl.order.strategy.recurring.view.StartTimeSelectionContent (RecurringBuyFrequencyStartTimeBottomSheet.kt:234)");
            }
            Modifier.Companion companion = Modifier.Companion;
            float f = 24;
            Modifier modifierM675paddingqDBjuR0$default = PaddingKt.m675paddingqDBjuR0$default(PaddingKt.m673paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), androidx.compose.ui.unit.Dp.m5414constructorimpl(f), 0.0f, 2, null), 0.0f, androidx.compose.ui.unit.Dp.m5414constructorimpl(8), 0.0f, androidx.compose.ui.unit.Dp.m5414constructorimpl(f), 5, null);
            composerStartRestartGroup.startReplaceableGroup(-483455358);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composerStartRestartGroup, 0);
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
            FirstTimeBuyOption firstTimeBuyOption2 = FirstTimeBuyOption.BUY_NOW;
            boolean z = firstTimeBuyOption == firstTimeBuyOption2;
            composerStartRestartGroup.startReplaceableGroup(-279204753);
            int i5 = i4 & 458752;
            boolean z2 = i5 == 131072;
            java.lang.Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z2 || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new Function0() { // from class: o.vVA
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return C50637vVu.AEQbTJ(function1);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            copydefault(firstTimeBuyOption2, z, (Function0<Unit>) objRememberedValue, composerStartRestartGroup, 6);
            SpacerKt.Spacer(SizeKt.m704height3ABfNKs(companion, androidx.compose.ui.unit.Dp.m5414constructorimpl(16)), composerStartRestartGroup, 6);
            FirstTimeBuyOption firstTimeBuyOption3 = FirstTimeBuyOption.BUY_CUSTOM;
            boolean z3 = firstTimeBuyOption == firstTimeBuyOption3;
            composerStartRestartGroup.startReplaceableGroup(-279194446);
            boolean z4 = i5 == 131072;
            java.lang.Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (z4 || objRememberedValue2 == Composer.Companion.getEmpty()) {
                objRememberedValue2 = new Function0() { // from class: o.vVE
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return C50637vVu.copydefault(function1);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceableGroup();
            copydefault(firstTimeBuyOption3, z3, (Function0<Unit>) objRememberedValue2, composerStartRestartGroup, 6);
            AnimatedVisibilityKt.AnimatedVisibility(columnScopeInstance, firstTimeBuyOption == firstTimeBuyOption3, (Modifier) null, EnterExitTransitionKt.expandVertically$default(null, null, false, null, 15, null), EnterExitTransitionKt.shrinkVertically$default(null, null, false, null, 15, null), (java.lang.String) null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1277527392, true, new ActionBar(nestedScrollConnection, recurringBuyFrequency, i, i2, function12, function13)), composerStartRestartGroup, 1600518, 18);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: o.vVI
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return C50637vVu.copydefault(nestedScrollConnection, firstTimeBuyOption, i, i2, recurringBuyFrequency, function1, function12, function13, i3, (Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final Unit AEQbTJ(Function1 function1) {
        function1.invoke(FirstTimeBuyOption.BUY_NOW);
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(Function1 function1) {
        function1.invoke(FirstTimeBuyOption.BUY_CUSTOM);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.vVu$ActionBar */
    public static final class ActionBar implements yHO<AnimatedVisibilityScope, Composer, java.lang.Integer, Unit> {
        public final /* synthetic */ int AEQbTJ;
        public final /* synthetic */ RecurringBuyFrequency EZpvd;
        public final /* synthetic */ Function1<java.lang.Integer, Unit> KWHzl;
        public final /* synthetic */ Function1<java.lang.Integer, Unit> OLrzqt;
        public final /* synthetic */ NestedScrollConnection copydefault;
        public final /* synthetic */ int valueOf;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> */
        /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> */
        /* JADX WARN: Multi-variable type inference failed */
        public ActionBar(NestedScrollConnection nestedScrollConnection, RecurringBuyFrequency recurringBuyFrequency, int i, int i2, Function1<? super java.lang.Integer, Unit> function1, Function1<? super java.lang.Integer, Unit> function12) {
            this.copydefault = nestedScrollConnection;
            this.EZpvd = recurringBuyFrequency;
            this.AEQbTJ = i;
            this.valueOf = i2;
            this.OLrzqt = function1;
            this.KWHzl = function12;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // o.yHO
        public /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer, java.lang.Integer num) {
            KWHzl(animatedVisibilityScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void KWHzl(AnimatedVisibilityScope animatedVisibilityScope, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(animatedVisibilityScope, "");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1277527392, i, -1, "com.okinc.tradingbot.impl.order.strategy.recurring.view.StartTimeSelectionContent.<anonymous>.<anonymous> (RecurringBuyFrequencyStartTimeBottomSheet.kt:263)");
            }
            NestedScrollConnection nestedScrollConnection = this.copydefault;
            RecurringBuyFrequency recurringBuyFrequency = this.EZpvd;
            int i2 = this.AEQbTJ;
            int i3 = this.valueOf;
            Function1<java.lang.Integer, Unit> function1 = this.OLrzqt;
            Function1<java.lang.Integer, Unit> function12 = this.KWHzl;
            composer.startReplaceableGroup(-483455358);
            Modifier.Companion companion = Modifier.Companion;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composer, 0);
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
            SpacerKt.Spacer(SizeKt.m704height3ABfNKs(companion, androidx.compose.ui.unit.Dp.m5414constructorimpl(16)), composer, 6);
            C50637vVu.KWHzl(nestedScrollConnection, recurringBuyFrequency, i2, i3, function1, function12, composer, 0);
            composer.endReplaceableGroup();
            composer.endNode();
            composer.endReplaceableGroup();
            composer.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    public static final void copydefault(final FirstTimeBuyOption firstTimeBuyOption, final boolean z, final Function0<Unit> function0, Composer composer, final int i) {
        int i2;
        Composer composer2;
        Composer composer3;
        Composer composerStartRestartGroup = composer.startRestartGroup(-481649829);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(firstTimeBuyOption) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function0) ? 256 : 128;
        }
        if ((i2 & CipherSuite.TLS_RSA_PSK_WITH_3DES_EDE_CBC_SHA) != 146 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-481649829, i2, -1, "com.okinc.tradingbot.impl.order.strategy.recurring.view.FirstBuyTimeOptionItem (RecurringBuyFrequencyStartTimeBottomSheet.kt:283)");
            }
            Modifier.Companion companion = Modifier.Companion;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            composerStartRestartGroup.startReplaceableGroup(1037890676);
            boolean z2 = (i2 & FaceDetector.NUM_BOXES) == 256;
            java.lang.Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z2 || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new Function0() { // from class: o.vVH
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return C50637vVu.EZpvd(function0);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            Modifier modifierM673paddingVpY3zN4$default = PaddingKt.m673paddingVpY3zN4$default(ClickableKt.m383clickableXHw0xAI$default(modifierFillMaxWidth$default, false, null, null, (Function0) objRememberedValue, 7, null), 0.0f, androidx.compose.ui.unit.Dp.m5414constructorimpl(8), 1, null);
            Alignment.Companion companion2 = Alignment.Companion;
            Alignment.Vertical centerVertically = companion2.getCenterVertically();
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.HorizontalOrVertical spaceBetween = arrangement.getSpaceBetween();
            composerStartRestartGroup.startReplaceableGroup(693286680);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(spaceBetween, centerVertically, composerStartRestartGroup, 54);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
            yHO<SkippableUpdater<ComposeUiNode>, Composer, java.lang.Integer, Unit> yhoModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM673paddingVpY3zN4$default);
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
            Modifier modifierWeight$default = RowScope.weight$default(RowScopeInstance.INSTANCE, companion, 1.0f, false, 2, null);
            composerStartRestartGroup.startReplaceableGroup(-483455358);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion2.getStart(), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
            yHO<SkippableUpdater<ComposeUiNode>, Composer, java.lang.Integer, Unit> yhoModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierWeight$default);
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
            Updater.m2790setimpl(composerM2783constructorimpl2, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m2790setimpl(composerM2783constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, java.lang.Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
            if (composerM2783constructorimpl2.getInserting() || !Intrinsics.EZpvd(composerM2783constructorimpl2.rememberedValue(), java.lang.Integer.valueOf(currentCompositeKeyHash2))) {
                composerM2783constructorimpl2.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash2));
                composerM2783constructorimpl2.apply(java.lang.Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            yhoModifierMaterializerOf2.invoke(SkippableUpdater.m2774boximpl(SkippableUpdater.m2775constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            TextKt.m2072Text4IGK_g(firstTimeBuyOption.getTitleString(), (Modifier) null, ColorResources_androidKt.colorResource(C52761wXj.Activity.fdOvFl, composerStartRestartGroup, 0), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, C52698wVa.OLrzqt(C52761wXj.LoaderManager.AxsJAY, null, composerStartRestartGroup, 0, 2), composerStartRestartGroup, 0, 0, 65530);
            java.lang.String descriptionString = firstTimeBuyOption.getDescriptionString();
            composerStartRestartGroup.startReplaceableGroup(1882503207);
            if (descriptionString.length() > 0) {
                SpacerKt.Spacer(SizeKt.m704height3ABfNKs(companion, androidx.compose.ui.unit.Dp.m5414constructorimpl(4)), composerStartRestartGroup, 6);
                composer2 = composerStartRestartGroup;
                TextKt.m2072Text4IGK_g(descriptionString, (Modifier) null, ColorResources_androidKt.colorResource(C52761wXj.Activity.DCUTEIddSDPG, composerStartRestartGroup, 0), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, C52698wVa.OLrzqt(C52761wXj.LoaderManager.zuBGHE, null, composerStartRestartGroup, 0, 2), composer2, 0, 0, 65530);
            } else {
                composer2 = composerStartRestartGroup;
            }
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            composer2.endNode();
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            composer3 = composer2;
            composer3.startReplaceableGroup(-457946676);
            if (z) {
                IconKt.m1755Iconww6aTOc(PainterResources_androidKt.painterResource(C52761wXj.TaskDescription.gqESXP, composer3, 0), (java.lang.String) null, SizeKt.m718size3ABfNKs(companion, androidx.compose.ui.unit.Dp.m5414constructorimpl(24)), ColorResources_androidKt.colorResource(C52761wXj.Activity.fdOvFl, composer3, 0), composer3, 432, 0);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: o.vVx
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return C50637vVu.EZpvd(firstTimeBuyOption, z, function0, i, (Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final Unit EZpvd(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }

    public static final void KWHzl(final NestedScrollConnection nestedScrollConnection, final RecurringBuyFrequency recurringBuyFrequency, final int i, final int i2, final Function1<? super java.lang.Integer, Unit> function1, final Function1<? super java.lang.Integer, Unit> function12, Composer composer, final int i3) {
        int i4;
        Composer composerStartRestartGroup = composer.startRestartGroup(1146507611);
        if ((i3 & 6) == 0) {
            i4 = (composerStartRestartGroup.changedInstance(nestedScrollConnection) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= composerStartRestartGroup.changed(recurringBuyFrequency) ? 32 : 16;
        }
        if ((i3 & MLKEMEngine.KyberPolyBytes) == 0) {
            i4 |= composerStartRestartGroup.changed(i) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i4 |= composerStartRestartGroup.changed(i2) ? 2048 : 1024;
        }
        if ((i3 & 24576) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(function1) ? 16384 : 8192;
        }
        if ((196608 & i3) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(function12) ? 131072 : 65536;
        }
        int i5 = i4;
        if ((74899 & i5) != 74898 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1146507611, i5, -1, "com.okinc.tradingbot.impl.order.strategy.recurring.view.TimePickerSection (RecurringBuyFrequencyStartTimeBottomSheet.kt:346)");
            }
            boolean z = recurringBuyFrequency == RecurringBuyFrequency.WEEKLY || recurringBuyFrequency == RecurringBuyFrequency.MONTHLY;
            float f = AEQbTJ;
            float fM5414constructorimpl = androidx.compose.ui.unit.Dp.m5414constructorimpl(7 * f);
            Modifier.Companion companion = Modifier.Companion;
            Modifier modifierM704height3ABfNKs = SizeKt.m704height3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), fM5414constructorimpl);
            composerStartRestartGroup.startReplaceableGroup(733328855);
            Alignment.Companion companion2 = Alignment.Companion;
            MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(companion2.getTopStart(), false, composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
            yHO<SkippableUpdater<ComposeUiNode>, Composer, java.lang.Integer, Unit> yhoModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM704height3ABfNKs);
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
            Updater.m2790setimpl(composerM2783constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m2790setimpl(composerM2783constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, java.lang.Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (composerM2783constructorimpl.getInserting() || !Intrinsics.EZpvd(composerM2783constructorimpl.rememberedValue(), java.lang.Integer.valueOf(currentCompositeKeyHash))) {
                composerM2783constructorimpl.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash));
                composerM2783constructorimpl.apply(java.lang.Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            yhoModifierMaterializerOf.invoke(SkippableUpdater.m2774boximpl(SkippableUpdater.m2775constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            float f2 = 8;
            BoxKt.Box(BackgroundKt.m349backgroundbw27NRU(SizeKt.m704height3ABfNKs(SizeKt.fillMaxWidth$default(BoxScopeInstance.INSTANCE.align(companion, companion2.getCenter()), 0.0f, 1, null), f), ColorResources_androidKt.colorResource(C52761wXj.Activity.invokespecialDPHOMC, composerStartRestartGroup, 0), RoundedCornerShapeKt.m924RoundedCornerShape0680j_4(androidx.compose.ui.unit.Dp.m5414constructorimpl(f2))), composerStartRestartGroup, 0);
            if (z) {
                composerStartRestartGroup.startReplaceableGroup(-1460996381);
                Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
                Arrangement.HorizontalOrVertical horizontalOrVerticalM582spacedBy0680j_4 = Arrangement.INSTANCE.m582spacedBy0680j_4(androidx.compose.ui.unit.Dp.m5414constructorimpl(f2));
                composerStartRestartGroup.startReplaceableGroup(693286680);
                MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(horizontalOrVerticalM582spacedBy0680j_4, companion2.getTop(), composerStartRestartGroup, 6);
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                yHO<SkippableUpdater<ComposeUiNode>, Composer, java.lang.Integer, Unit> yhoModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierFillMaxSize$default);
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
                Updater.m2790setimpl(composerM2783constructorimpl2, measurePolicyRowMeasurePolicy, companion3.getSetMeasurePolicy());
                Updater.m2790setimpl(composerM2783constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, java.lang.Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
                if (composerM2783constructorimpl2.getInserting() || !Intrinsics.EZpvd(composerM2783constructorimpl2.rememberedValue(), java.lang.Integer.valueOf(currentCompositeKeyHash2))) {
                    composerM2783constructorimpl2.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash2));
                    composerM2783constructorimpl2.apply(java.lang.Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                }
                yhoModifierMaterializerOf2.invoke(SkippableUpdater.m2774boximpl(SkippableUpdater.m2775constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(2058660585);
                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                int i6 = i5 >> 3;
                copydefault(recurringBuyFrequency, i, function1, NestedScrollModifierKt.nestedScroll$default(SizeKt.fillMaxHeight$default(RowScope.weight$default(rowScopeInstance, companion, 1.0f, false, 2, null), 0.0f, 1, null), nestedScrollConnection, null, 2, null), composerStartRestartGroup, (i6 & 14) | (i6 & WalletImportError.ERROR_CODE_AA_EXIST) | ((i5 >> 6) & FaceDetector.NUM_BOXES), 0);
                copydefault(i2, function12, NestedScrollModifierKt.nestedScroll$default(SizeKt.fillMaxHeight$default(RowScope.weight$default(rowScopeInstance, companion, 1.0f, false, 2, null), 0.0f, 1, null), nestedScrollConnection, null, 2, null), composerStartRestartGroup, ((i5 >> 9) & 14) | ((i5 >> 12) & WalletImportError.ERROR_CODE_AA_EXIST), 0);
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
            } else {
                composerStartRestartGroup.startReplaceableGroup(-1459978000);
                copydefault(i2, function12, NestedScrollModifierKt.nestedScroll$default(SizeKt.fillMaxSize$default(companion, 0.0f, 1, null), nestedScrollConnection, null, 2, null), composerStartRestartGroup, ((i5 >> 9) & 14) | ((i5 >> 12) & WalletImportError.ERROR_CODE_AA_EXIST), 0);
                composerStartRestartGroup.endReplaceableGroup();
            }
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
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: o.vVy
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return C50637vVu.KWHzl(nestedScrollConnection, recurringBuyFrequency, i, i2, function1, function12, i3, (Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void copydefault(final int i, final Function1<? super java.lang.Integer, Unit> function1, Modifier modifier, Composer composer, final int i2, final int i3) {
        int i4;
        Composer composerStartRestartGroup = composer.startRestartGroup(-287801249);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (composerStartRestartGroup.changed(i) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        int i5 = i3 & 4;
        if (i5 != 0) {
            i4 |= MLKEMEngine.KyberPolyBytes;
        } else if ((i2 & MLKEMEngine.KyberPolyBytes) == 0) {
            i4 |= composerStartRestartGroup.changed(modifier) ? 256 : 128;
        }
        if ((i4 & CipherSuite.TLS_RSA_PSK_WITH_3DES_EDE_CBC_SHA) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (i5 != 0) {
                modifier = Modifier.Companion;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-287801249, i4, -1, "com.okinc.tradingbot.impl.order.strategy.recurring.view.HourPickerList (RecurringBuyFrequencyStartTimeBottomSheet.kt:417)");
            }
            composerStartRestartGroup.startReplaceableGroup(-810431835);
            java.lang.Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.Companion.getEmpty()) {
                kotlin.ranges.IntRange intRange = new kotlin.ranges.IntRange(0, 23);
                java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(intRange, 10));
                java.util.Iterator<java.lang.Integer> it = intRange.iterator();
                while (it.hasNext()) {
                    int iNextInt = ((AbstractC56415yEn) it).nextInt();
                    C56529yIt c56529yIt = C56529yIt.KWHzl;
                    java.lang.String str = java.lang.String.format("%02d:00", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(iNextInt)}, 1));
                    Intrinsics.checkNotNullExpressionValue(str, "");
                    arrayList.add(str);
                }
                composerStartRestartGroup.updateRememberedValue(arrayList);
                objRememberedValue = arrayList;
            }
            composerStartRestartGroup.endReplaceableGroup();
            int i6 = i4 << 3;
            OLrzqt((java.util.List<java.lang.String>) objRememberedValue, i, function1, modifier, 0, 0.0f, composerStartRestartGroup, (i6 & WalletImportError.ERROR_CODE_AA_EXIST) | (i6 & FaceDetector.NUM_BOXES) | (i6 & 7168), 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        final Modifier modifier2 = modifier;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: o.vVD
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return C50637vVu.KWHzl(i, function1, modifier2, i2, i3, (Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:94:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void copydefault(final RecurringBuyFrequency recurringBuyFrequency, final int i, final Function1<? super java.lang.Integer, Unit> function1, Modifier modifier, Composer composer, final int i2, final int i3) {
        int i4;
        Modifier modifier2;
        boolean z;
        java.lang.Object objRememberedValue;
        int i5;
        java.util.ArrayList arrayList;
        java.lang.String str;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(329358306);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (composerStartRestartGroup.changed(recurringBuyFrequency) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= composerStartRestartGroup.changed(i) ? 32 : 16;
        }
        if ((i3 & 4) != 0) {
            i4 |= MLKEMEngine.KyberPolyBytes;
        } else if ((i2 & MLKEMEngine.KyberPolyBytes) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(function1) ? 256 : 128;
        }
        int i6 = i3 & 8;
        if (i6 == 0) {
            if ((i2 & 3072) == 0) {
                modifier2 = modifier;
                i4 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
            }
            if ((i4 & 1171) == 1170 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i6 == 0 ? Modifier.Companion : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(329358306, i4, -1, "com.okinc.tradingbot.impl.order.strategy.recurring.view.DayPickerList (RecurringBuyFrequencyStartTimeBottomSheet.kt:440)");
                }
                composerStartRestartGroup.startReplaceableGroup(-932798219);
                z = (i4 & 14) != 4;
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!z || objRememberedValue == Composer.Companion.getEmpty()) {
                    i5 = StateListAnimator.AEQbTJ[recurringBuyFrequency.ordinal()];
                    if (i5 != 1) {
                        InterfaceC56445yFq<RecurringWeekConfig> entries = RecurringWeekConfig.getEntries();
                        arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(entries, 10));
                        java.util.Iterator<RecurringWeekConfig> it = entries.iterator();
                        while (it.hasNext()) {
                            arrayList.add(C33070mpX.AYXKKw(it.next().getTitle()));
                        }
                    } else if (i5 == 2) {
                        kotlin.ranges.IntRange intRange = new kotlin.ranges.IntRange(1, 28);
                        arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(intRange, 10));
                        java.util.Iterator<java.lang.Integer> it2 = intRange.iterator();
                        while (it2.hasNext()) {
                            int iNextInt = ((AbstractC56415yEn) it2).nextInt();
                            if (xMP.AEQbTJ.AEQbTJ()) {
                                str = iNextInt + C33070mpX.AYXKKw(C55688xof.Application.getIcon);
                            } else {
                                str = C33070mpX.AYXKKw(C55688xof.Application.getIcon) + " " + iNextInt;
                            }
                            arrayList.add(str);
                        }
                    } else {
                        objRememberedValue = yDY.AhwBna();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    objRememberedValue = arrayList;
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                OLrzqt((java.util.List<java.lang.String>) objRememberedValue, i, function1, modifier4, 0, 0.0f, composerStartRestartGroup, (i4 & WalletImportError.ERROR_CODE_AA_EXIST) | (i4 & FaceDetector.NUM_BOXES) | (i4 & 7168), 48);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier4;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: o.vVv
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return C50637vVu.copydefault(recurringBuyFrequency, i, function1, modifier3, i2, i3, (Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i4 |= 3072;
        modifier2 = modifier;
        if ((i4 & 1171) == 1170) {
            if (i6 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            composerStartRestartGroup.startReplaceableGroup(-932798219);
            if ((i4 & 14) != 4) {
            }
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (!z) {
                i5 = StateListAnimator.AEQbTJ[recurringBuyFrequency.ordinal()];
                if (i5 != 1) {
                }
                objRememberedValue = arrayList;
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                composerStartRestartGroup.endReplaceableGroup();
                OLrzqt((java.util.List<java.lang.String>) objRememberedValue, i, function1, modifier4, 0, 0.0f, composerStartRestartGroup, (i4 & WalletImportError.ERROR_CODE_AA_EXIST) | (i4 & FaceDetector.NUM_BOXES) | (i4 & 7168), 48);
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier3 = modifier4;
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:136:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x016e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void OLrzqt(final java.util.List<java.lang.String> list, final int i, final Function1<? super java.lang.Integer, Unit> function1, Modifier modifier, int i2, float f, Composer composer, final int i3, final int i4) {
        int i5;
        Modifier modifier2;
        int i6;
        int i7;
        int i8;
        final float f2;
        final int i9;
        final LazyListState lazyListStateRememberLazyListState;
        boolean zChanged;
        boolean z;
        java.lang.Object objRememberedValue;
        java.lang.Object objRememberedValue2;
        Composer.Companion companion;
        androidx.compose.runtime.State state;
        boolean zChangedInstance;
        boolean z2;
        boolean z3;
        java.lang.Object objRememberedValue3;
        int i10;
        final androidx.compose.runtime.State state2;
        LazyListState lazyListState;
        int currentCompositeKeyHash;
        Composer composerM2783constructorimpl;
        Function2<ComposeUiNode, java.lang.Integer, Unit> setCompositeKeyHash;
        boolean zChangedInstance2;
        boolean zChanged2;
        boolean z4;
        java.lang.Object objRememberedValue4;
        Composer composer2;
        final Modifier modifier3;
        final int i11;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1949806749);
        if ((i4 & 1) != 0) {
            i5 = i3 | 6;
        } else if ((i3 & 6) == 0) {
            i5 = (composerStartRestartGroup.changedInstance(list) ? 4 : 2) | i3;
        } else {
            i5 = i3;
        }
        if ((i4 & 2) != 0) {
            i5 |= 48;
        } else if ((i3 & 48) == 0) {
            i5 |= composerStartRestartGroup.changed(i) ? 32 : 16;
        }
        if ((i4 & 4) != 0) {
            i5 |= MLKEMEngine.KyberPolyBytes;
        } else if ((i3 & MLKEMEngine.KyberPolyBytes) == 0) {
            i5 |= composerStartRestartGroup.changedInstance(function1) ? 256 : 128;
        }
        int i12 = i4 & 8;
        if (i12 != 0) {
            i5 |= 3072;
        } else {
            if ((i3 & 3072) == 0) {
                modifier2 = modifier;
                i5 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
            }
            i6 = i4 & 16;
            if (i6 != 0) {
                if ((i3 & 24576) == 0) {
                    i7 = i2;
                    i5 |= composerStartRestartGroup.changed(i7) ? 16384 : 8192;
                }
                i8 = i4 & 32;
                if (i8 != 0) {
                    i5 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    f2 = f;
                } else {
                    f2 = f;
                    if ((i3 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                        i5 |= composerStartRestartGroup.changed(f2) ? 131072 : 65536;
                    }
                }
                if ((i5 & 74899) != 74898 || !composerStartRestartGroup.getSkipping()) {
                    if (i12 != 0) {
                        modifier2 = Modifier.Companion;
                    }
                    if (i6 != 0) {
                        i7 = 7;
                    }
                    if (i8 != 0) {
                        f2 = AEQbTJ;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1949806749, i5, -1, "com.okinc.tradingbot.impl.order.strategy.recurring.view.WheelPicker (RecurringBuyFrequencyStartTimeBottomSheet.kt:489)");
                    }
                    i9 = i7 / 2;
                    final int iMo510roundToPx0680j_4 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo510roundToPx0680j_4(f2);
                    lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(i, 0, composerStartRestartGroup, (i5 >> 3) & 14, 2);
                    Unit unit = Unit.INSTANCE;
                    composerStartRestartGroup.startReplaceableGroup(-1648587582);
                    zChanged = composerStartRestartGroup.changed(lazyListStateRememberLazyListState);
                    int i13 = i5 & WalletImportError.ERROR_CODE_AA_EXIST;
                    z = i13 != 32;
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (!(zChanged | z) || objRememberedValue == Composer.Companion.getEmpty()) {
                        objRememberedValue = new RecurringBuyFrequencyStartTimeBottomSheetKt$WheelPicker$1$1(lazyListStateRememberLazyListState, i, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends java.lang.Object>) objRememberedValue, composerStartRestartGroup, 6);
                    composerStartRestartGroup.startReplaceableGroup(-1648584879);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    companion = Composer.Companion;
                    if (objRememberedValue2 == companion.getEmpty()) {
                        objRememberedValue2 = SnapshotStateKt.derivedStateOf(new Function0() { // from class: o.vVB
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                return java.lang.Integer.valueOf(C50637vVu.EZpvd(lazyListStateRememberLazyListState, iMo510roundToPx0680j_4));
                            }
                        });
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    state = (androidx.compose.runtime.State) objRememberedValue2;
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.startReplaceableGroup(-1648575504);
                    zChangedInstance = composerStartRestartGroup.changedInstance(list);
                    z2 = i13 != 32;
                    z3 = (i5 & FaceDetector.NUM_BOXES) != 256;
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if ((!(zChangedInstance | z2) && !z3) || objRememberedValue3 == companion.getEmpty()) {
                        i10 = i5;
                        state2 = state;
                        lazyListState = lazyListStateRememberLazyListState;
                        objRememberedValue3 = new RecurringBuyFrequencyStartTimeBottomSheetKt$WheelPicker$2$1(state, list, i, function1, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    } else {
                        i10 = i5;
                        state2 = state;
                        lazyListState = lazyListStateRememberLazyListState;
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    EffectsKt.LaunchedEffect(lazyListState, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends java.lang.Object>) objRememberedValue3, composerStartRestartGroup, 0);
                    Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(SizeKt.m704height3ABfNKs(modifier2, androidx.compose.ui.unit.Dp.m5414constructorimpl(i7 * f2)), 0.0f, 1, null);
                    composerStartRestartGroup.startReplaceableGroup(733328855);
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.Companion.getTopStart(), false, composerStartRestartGroup, 0);
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
                    Updater.m2790setimpl(composerM2783constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion2.getSetMeasurePolicy());
                    Updater.m2790setimpl(composerM2783constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                    setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                    if (!composerM2783constructorimpl.getInserting() || !Intrinsics.EZpvd(composerM2783constructorimpl.rememberedValue(), java.lang.Integer.valueOf(currentCompositeKeyHash))) {
                        composerM2783constructorimpl.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash));
                        composerM2783constructorimpl.apply(java.lang.Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    yhoModifierMaterializerOf.invoke(SkippableUpdater.m2774boximpl(SkippableUpdater.m2775constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(2058660585);
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    FlingBehavior flingBehaviorRememberSnapFlingBehavior = LazyListSnapLayoutInfoProviderKt.rememberSnapFlingBehavior(lazyListState, composerStartRestartGroup, 0);
                    Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null);
                    PaddingValues paddingValuesM666PaddingValuesYgX7TsA$default = PaddingKt.m666PaddingValuesYgX7TsA$default(0.0f, androidx.compose.ui.unit.Dp.m5414constructorimpl(i9 * f2), 1, null);
                    composerStartRestartGroup.startReplaceableGroup(973026977);
                    zChangedInstance2 = composerStartRestartGroup.changedInstance(list);
                    zChanged2 = composerStartRestartGroup.changed(i9);
                    z4 = (i10 & 458752) != 131072;
                    objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                    if (!(z4 | zChangedInstance2 | zChanged2) || objRememberedValue4 == companion.getEmpty()) {
                        objRememberedValue4 = new Function1() { // from class: o.vVz
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj) {
                                return C50637vVu.copydefault(list, i9, f2, state2, (LazyListScope) obj);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                    }
                    Function1 function12 = (Function1) objRememberedValue4;
                    composerStartRestartGroup.endReplaceableGroup();
                    Modifier modifier4 = modifier2;
                    int i14 = i7;
                    float f3 = f2;
                    composer2 = composerStartRestartGroup;
                    LazyDslKt.LazyColumn(modifierFillMaxSize$default, lazyListState, paddingValuesM666PaddingValuesYgX7TsA$default, false, null, null, flingBehaviorRememberSnapFlingBehavior, false, function12, composer2, 6, CipherSuite.TLS_RSA_PSK_WITH_NULL_SHA256);
                    composer2.endReplaceableGroup();
                    composer2.endNode();
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    f2 = f3;
                    modifier3 = modifier4;
                    i11 = i14;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    modifier3 = modifier2;
                    i11 = i7;
                    composer2 = composerStartRestartGroup;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    final float f4 = f2;
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: o.vVC
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            return C50637vVu.EZpvd(list, i, function1, modifier3, i11, f4, i3, i4, (Composer) obj, ((java.lang.Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i5 |= 24576;
            i7 = i2;
            i8 = i4 & 32;
            if (i8 != 0) {
            }
            if ((i5 & 74899) != 74898) {
                if (i12 != 0) {
                }
                if (i6 != 0) {
                }
                if (i8 != 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                i9 = i7 / 2;
                final int iMo510roundToPx0680j_42 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo510roundToPx0680j_4(f2);
                lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(i, 0, composerStartRestartGroup, (i5 >> 3) & 14, 2);
                Unit unit2 = Unit.INSTANCE;
                composerStartRestartGroup.startReplaceableGroup(-1648587582);
                zChanged = composerStartRestartGroup.changed(lazyListStateRememberLazyListState);
                int i132 = i5 & WalletImportError.ERROR_CODE_AA_EXIST;
                if (i132 != 32) {
                }
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!(zChanged | z)) {
                    objRememberedValue = new RecurringBuyFrequencyStartTimeBottomSheetKt$WheelPicker$1$1(lazyListStateRememberLazyListState, i, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    composerStartRestartGroup.endReplaceableGroup();
                    EffectsKt.LaunchedEffect(unit2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends java.lang.Object>) objRememberedValue, composerStartRestartGroup, 6);
                    composerStartRestartGroup.startReplaceableGroup(-1648584879);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    companion = Composer.Companion;
                    if (objRememberedValue2 == companion.getEmpty()) {
                    }
                    state = (androidx.compose.runtime.State) objRememberedValue2;
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.startReplaceableGroup(-1648575504);
                    zChangedInstance = composerStartRestartGroup.changedInstance(list);
                    if (i132 != 32) {
                    }
                    if ((i5 & FaceDetector.NUM_BOXES) != 256) {
                    }
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (!(zChangedInstance | z2 | z3)) {
                        i10 = i5;
                        state2 = state;
                        lazyListState = lazyListStateRememberLazyListState;
                        objRememberedValue3 = new RecurringBuyFrequencyStartTimeBottomSheetKt$WheelPicker$2$1(state, list, i, function1, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        composerStartRestartGroup.endReplaceableGroup();
                        EffectsKt.LaunchedEffect(lazyListState, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends java.lang.Object>) objRememberedValue3, composerStartRestartGroup, 0);
                        Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(SizeKt.m704height3ABfNKs(modifier2, androidx.compose.ui.unit.Dp.m5414constructorimpl(i7 * f2)), 0.0f, 1, null);
                        composerStartRestartGroup.startReplaceableGroup(733328855);
                        MeasurePolicy measurePolicyRememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(Alignment.Companion.getTopStart(), false, composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(-1323940314);
                        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        ComposeUiNode.Companion companion22 = ComposeUiNode.Companion;
                        Function0<ComposeUiNode> constructor2 = companion22.getConstructor();
                        yHO<SkippableUpdater<ComposeUiNode>, Composer, java.lang.Integer, Unit> yhoModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierFillMaxWidth$default2);
                        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (!composerStartRestartGroup.getInserting()) {
                        }
                        composerM2783constructorimpl = Updater.m2783constructorimpl(composerStartRestartGroup);
                        Updater.m2790setimpl(composerM2783constructorimpl, measurePolicyRememberBoxMeasurePolicy2, companion22.getSetMeasurePolicy());
                        Updater.m2790setimpl(composerM2783constructorimpl, currentCompositionLocalMap2, companion22.getSetResolvedCompositionLocals());
                        setCompositeKeyHash = companion22.getSetCompositeKeyHash();
                        if (!composerM2783constructorimpl.getInserting()) {
                            composerM2783constructorimpl.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash));
                            composerM2783constructorimpl.apply(java.lang.Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                            yhoModifierMaterializerOf2.invoke(SkippableUpdater.m2774boximpl(SkippableUpdater.m2775constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                            composerStartRestartGroup.startReplaceableGroup(2058660585);
                            BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                            FlingBehavior flingBehaviorRememberSnapFlingBehavior2 = LazyListSnapLayoutInfoProviderKt.rememberSnapFlingBehavior(lazyListState, composerStartRestartGroup, 0);
                            Modifier modifierFillMaxSize$default2 = SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null);
                            PaddingValues paddingValuesM666PaddingValuesYgX7TsA$default2 = PaddingKt.m666PaddingValuesYgX7TsA$default(0.0f, androidx.compose.ui.unit.Dp.m5414constructorimpl(i9 * f2), 1, null);
                            composerStartRestartGroup.startReplaceableGroup(973026977);
                            zChangedInstance2 = composerStartRestartGroup.changedInstance(list);
                            zChanged2 = composerStartRestartGroup.changed(i9);
                            if ((i10 & 458752) != 131072) {
                            }
                            objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                            if (!(z4 | zChangedInstance2 | zChanged2)) {
                                objRememberedValue4 = new Function1() { // from class: o.vVz
                                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                    @Override // kotlin.jvm.functions.Function1
                                    public final java.lang.Object invoke(java.lang.Object obj) {
                                        return C50637vVu.copydefault(list, i9, f2, state2, (LazyListScope) obj);
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                                Function1 function122 = (Function1) objRememberedValue4;
                                composerStartRestartGroup.endReplaceableGroup();
                                Modifier modifier42 = modifier2;
                                int i142 = i7;
                                float f32 = f2;
                                composer2 = composerStartRestartGroup;
                                LazyDslKt.LazyColumn(modifierFillMaxSize$default2, lazyListState, paddingValuesM666PaddingValuesYgX7TsA$default2, false, null, null, flingBehaviorRememberSnapFlingBehavior2, false, function122, composer2, 6, CipherSuite.TLS_RSA_PSK_WITH_NULL_SHA256);
                                composer2.endReplaceableGroup();
                                composer2.endNode();
                                composer2.endReplaceableGroup();
                                composer2.endReplaceableGroup();
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                f2 = f32;
                                modifier3 = modifier42;
                                i11 = i142;
                            }
                        }
                    }
                }
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i6 = i4 & 16;
        if (i6 != 0) {
        }
        i7 = i2;
        i8 = i4 & 32;
        if (i8 != 0) {
        }
        if ((i5 & 74899) != 74898) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    public static final int EZpvd(LazyListState lazyListState, int i) {
        int firstVisibleItemIndex = lazyListState.getFirstVisibleItemIndex();
        return lazyListState.getFirstVisibleItemScrollOffset() > i / 2 ? firstVisibleItemIndex + 1 : firstVisibleItemIndex;
    }

    public static final int copydefault(androidx.compose.runtime.State<java.lang.Integer> state) {
        return state.getValue().intValue();
    }

    public static final Unit copydefault(final java.util.List list, final int i, final float f, final androidx.compose.runtime.State state, LazyListScope lazyListScope) {
        Intrinsics.checkNotNullParameter(lazyListScope, "");
        lazyListScope.items(list.size(), null, new Function1<java.lang.Integer, java.lang.Object>() { // from class: com.okinc.tradingbot.impl.order.strategy.recurring.view.RecurringBuyFrequencyStartTimeBottomSheetKt$WheelPicker_HYR8e34$lambda$31$lambda$30$lambda$29$$inlined$itemsIndexed$default$2
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // kotlin.jvm.functions.Function1
            public /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int i2) {
                list.get(i2);
                return null;
            }
        }, ComposableLambdaKt.composableLambdaInstance(-1091073711, true, new yHT<LazyItemScope, java.lang.Integer, Composer, java.lang.Integer, Unit>() { // from class: com.okinc.tradingbot.impl.order.strategy.recurring.view.RecurringBuyFrequencyStartTimeBottomSheetKt$WheelPicker_HYR8e34$lambda$31$lambda$30$lambda$29$$inlined$itemsIndexed$default$3
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(4);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object] */
            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // o.yHT
            public /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
                invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull LazyItemScope lazyItemScope, int i2, Composer composer, int i3) {
                int i4;
                long jColorResource;
                Intrinsics.checkNotNullParameter(lazyItemScope, "");
                if ((i3 & 14) == 0) {
                    i4 = i3 | (composer.changed(lazyItemScope) ? 4 : 2);
                } else {
                    i4 = i3;
                }
                if ((i3 & WalletImportError.ERROR_CODE_AA_EXIST) == 0) {
                    i4 |= composer.changed(i2) ? 32 : 16;
                }
                if ((i4 & 731) == 146 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1091073711, i4, -1, "androidx.compose.foundation.lazy.itemsIndexed.<anonymous> (LazyDsl.kt:179)");
                }
                String str = (String) list.get(i2);
                composer.startReplaceableGroup(-1851470826);
                int iAbs = Math.abs(i2 - C50637vVu.copydefault((State<Integer>) state));
                boolean z = iAbs == 0;
                Modifier modifierAlpha = AlphaKt.alpha(SizeKt.m704height3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), f), iAbs > 1 ? C56548yJl.copydefault(1.0f - (iAbs / i), 0.3f) : 1.0f);
                Alignment center = Alignment.Companion.getCenter();
                composer.startReplaceableGroup(733328855);
                MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, composer, 6);
                composer.startReplaceableGroup(-1323940314);
                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion = ComposeUiNode.Companion;
                Function0<ComposeUiNode> constructor = companion.getConstructor();
                yHO<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> yhoModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierAlpha);
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
                Updater.m2790setimpl(composerM2783constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion.getSetMeasurePolicy());
                Updater.m2790setimpl(composerM2783constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
                if (composerM2783constructorimpl.getInserting() || !Intrinsics.EZpvd(composerM2783constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM2783constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM2783constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                yhoModifierMaterializerOf.invoke(SkippableUpdater.m2774boximpl(SkippableUpdater.m2775constructorimpl(composer)), composer, 0);
                composer.startReplaceableGroup(2058660585);
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                TextStyle textStyleOLrzqt = C52698wVa.OLrzqt(C52761wXj.LoaderManager.gHZMYf, null, composer, 0, 2);
                if (z) {
                    composer.startReplaceableGroup(-2112241201);
                    jColorResource = ColorResources_androidKt.colorResource(C52761wXj.Activity.fdOvFl, composer, 0);
                    composer.endReplaceableGroup();
                } else {
                    composer.startReplaceableGroup(-2112238992);
                    jColorResource = ColorResources_androidKt.colorResource(C52761wXj.Activity.UlJrfe, composer, 0);
                    composer.endReplaceableGroup();
                }
                TextKt.m2072Text4IGK_g(str, (Modifier) null, jColorResource, TextUnitKt.m5607TextUnitanM5pPY(16.0f, TextUnitType.Companion.m5628getSpUIouoOA()), (FontStyle) null, FontWeight.Companion.getW500(), (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m5279boximpl(TextAlign.Companion.m5286getCentere0LSkKk()), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, textStyleOLrzqt, composer, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 0, 64978);
                composer.endReplaceableGroup();
                composer.endNode();
                composer.endReplaceableGroup();
                composer.endReplaceableGroup();
                composer.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        return Unit.INSTANCE;
    }
}
