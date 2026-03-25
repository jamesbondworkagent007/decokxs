package o;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.material3.DividerKt;
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
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.ColorResources_androidKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.PrimitiveResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import com.amplifyframework.ui.liveness.ml.FaceDetector;
import com.google.android.exoplayer2.audio.WavUtil;
import com.okinc.business.defi.biz.core.error.WalletImportError;
import com.okinc.tradingbot.impl.aiBot.domain.model.Indicator;
import com.okinc.tradingbot.impl.aiBot.domain.model.ParamSpecUiModel;
import com.okinc.tradingbot.impl.aiBot.domain.model.ParamType;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C48033uCm;
import o.C48054uDg;
import o.C48068uDu;
import o.C52761wXj;
import o.uCF;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import org.jetbrains.annotations.NotNull;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: renamed from: o.uDg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C48054uDg {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final Unit EZpvd(Indicator indicator, boolean z, int i, Composer composer, int i2) {
        KWHzl(indicator, z, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final Unit KWHzl(Modifier modifier, C48068uDu c48068uDu, java.lang.String str, boolean z, Function0 function0, int i, int i2, Composer composer, int i3) {
        AEQbTJ(modifier, c48068uDu, str, z, (Function0<Unit>) function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final Unit copydefault(Modifier modifier, C48068uDu c48068uDu, int i, int i2, Composer composer, int i3) {
        copydefault(modifier, c48068uDu, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final Unit copydefault(Indicator indicator, SnapshotStateList snapshotStateList, boolean z, boolean z2, Function1 function1, int i, Composer composer, int i2) {
        OLrzqt(indicator, snapshotStateList, z, z2, function1, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void OLrzqt(@NotNull final Indicator indicator, @NotNull final SnapshotStateList<C48068uDu> snapshotStateList, final boolean z, final boolean z2, @NotNull final Function1<? super C48068uDu, Unit> function1, Composer composer, final int i) {
        int i2;
        Composer composer2;
        Intrinsics.checkNotNullParameter(indicator, "");
        Intrinsics.checkNotNullParameter(snapshotStateList, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1890825556);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(indicator) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(snapshotStateList) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= composerStartRestartGroup.changed(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changed(z2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function1) ? 16384 : 8192;
        }
        if ((i2 & 9363) != 9362 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1890825556, i2, -1, "com.okinc.tradingbot.impl.aiBot.ui.indicators.IndicatorSettingsScreen (IndicatorSettingsComposable.kt:51)");
            }
            float f = 16;
            Modifier modifierM672paddingVpY3zN4 = PaddingKt.m672paddingVpY3zN4(SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null), PrimitiveResources_androidKt.dimensionResource(C52761wXj.StateListAnimator.AEQbTJ, composerStartRestartGroup, 0), androidx.compose.ui.unit.Dp.m5414constructorimpl(f));
            Arrangement.HorizontalOrVertical horizontalOrVerticalM582spacedBy0680j_4 = Arrangement.INSTANCE.m582spacedBy0680j_4(androidx.compose.ui.unit.Dp.m5414constructorimpl(f));
            composerStartRestartGroup.startReplaceableGroup(2144919126);
            boolean z3 = (i2 & FaceDetector.NUM_BOXES) == 256;
            boolean z4 = (i2 & 7168) == 2048;
            boolean z5 = (i2 & 14) == 4;
            boolean z6 = (i2 & WalletImportError.ERROR_CODE_AA_EXIST) == 32;
            boolean z7 = (i2 & 57344) == 16384;
            java.lang.Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if ((z3 | z4 | z5 | z6 | z7) || objRememberedValue == Composer.Companion.getEmpty()) {
                Function1 function12 = new Function1() { // from class: o.uDl
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C48054uDg.OLrzqt(z, z2, snapshotStateList, indicator, function1, (LazyListScope) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(function12);
                objRememberedValue = function12;
            }
            Function1 function13 = (Function1) objRememberedValue;
            composerStartRestartGroup.endReplaceableGroup();
            composer2 = composerStartRestartGroup;
            LazyDslKt.LazyColumn(modifierM672paddingVpY3zN4, null, null, false, horizontalOrVerticalM582spacedBy0680j_4, null, null, false, function13, composer2, 24576, 238);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: o.uDk
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return C48054uDg.copydefault(indicator, snapshotStateList, z, z2, function1, i, (Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: renamed from: o.uDg$StateListAnimator */
    public static final class StateListAnimator implements yHO<LazyItemScope, Composer, java.lang.Integer, Unit> {
        public final /* synthetic */ Indicator AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(Indicator indicator) {
            this.AEQbTJ = indicator;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // o.yHO
        public /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, java.lang.Integer num) {
            copydefault(lazyItemScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void copydefault(LazyItemScope lazyItemScope, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(lazyItemScope, "");
            if ((i & 17) != 16 || !composer.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(247043037, i, -1, "com.okinc.tradingbot.impl.aiBot.ui.indicators.IndicatorSettingsScreen.<anonymous>.<anonymous>.<anonymous> (IndicatorSettingsComposable.kt:64)");
                }
                TextKt.m2072Text4IGK_g(this.AEQbTJ.djBIcL(), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, C52698wVa.OLrzqt(C52761wXj.LoaderManager.AwvSrB, java.lang.Integer.valueOf(C52761wXj.Activity.fdOvFl), composer, 0, 0), composer, 0, 0, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                    return;
                }
                return;
            }
            composer.skipToGroupEnd();
        }
    }

    public static final Unit OLrzqt(final boolean z, boolean z2, final SnapshotStateList snapshotStateList, Indicator indicator, final Function1 function1, LazyListScope lazyListScope) {
        Intrinsics.checkNotNullParameter(lazyListScope, "");
        if (!z && z2) {
            LazyListScope.item$default(lazyListScope, null, null, ComposableLambdaKt.composableLambdaInstance(247043037, true, new StateListAnimator(indicator)), 3, null);
        }
        if (z2) {
            final Function2 function2 = new Function2() { // from class: o.uDs
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return C48054uDg.copydefault(((java.lang.Integer) obj).intValue(), (C48068uDu) obj2);
                }
            };
            lazyListScope.items(snapshotStateList.size(), new Function1<java.lang.Integer, java.lang.Object>() { // from class: com.okinc.tradingbot.impl.aiBot.ui.indicators.IndicatorSettingsComposableKt$IndicatorSettingsScreen$lambda$4$lambda$3$$inlined$itemsIndexed$default$1
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

                public final Object invoke(int i) {
                    return function2.invoke(Integer.valueOf(i), snapshotStateList.get(i));
                }
            }, new Function1<java.lang.Integer, java.lang.Object>() { // from class: com.okinc.tradingbot.impl.aiBot.ui.indicators.IndicatorSettingsComposableKt$IndicatorSettingsScreen$lambda$4$lambda$3$$inlined$itemsIndexed$default$2
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

                public final Object invoke(int i) {
                    snapshotStateList.get(i);
                    return null;
                }
            }, ComposableLambdaKt.composableLambdaInstance(-1091073711, true, new yHT<LazyItemScope, java.lang.Integer, Composer, java.lang.Integer, Unit>() { // from class: com.okinc.tradingbot.impl.aiBot.ui.indicators.IndicatorSettingsComposableKt$IndicatorSettingsScreen$lambda$4$lambda$3$$inlined$itemsIndexed$default$3
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

                public final void invoke(@NotNull LazyItemScope lazyItemScope, int i, Composer composer, int i2) {
                    int i3;
                    Intrinsics.checkNotNullParameter(lazyItemScope, "");
                    if ((i2 & 14) == 0) {
                        i3 = (composer.changed(lazyItemScope) ? 4 : 2) | i2;
                    } else {
                        i3 = i2;
                    }
                    if ((i2 & WalletImportError.ERROR_CODE_AA_EXIST) == 0) {
                        i3 |= composer.changed(i) ? 32 : 16;
                    }
                    if ((i3 & 731) == 146 && composer.getSkipping()) {
                        composer.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1091073711, i3, -1, "androidx.compose.foundation.lazy.itemsIndexed.<anonymous> (LazyDsl.kt:179)");
                    }
                    C48068uDu c48068uDu = (C48068uDu) snapshotStateList.get(i);
                    composer.startReplaceableGroup(-1910710064);
                    if (z) {
                        composer.startReplaceableGroup(-1910698688);
                        Modifier modifierAnimateItemPlacement$default = LazyItemScope.animateItemPlacement$default(lazyItemScope, Modifier.Companion, null, 1, null);
                        String str = c48068uDu.copydefault() + " " + (i + 1);
                        boolean z3 = i > 0;
                        composer.startReplaceableGroup(-477268271);
                        boolean zChanged = composer.changed(function1);
                        boolean zChanged2 = composer.changed(c48068uDu);
                        Object objRememberedValue = composer.rememberedValue();
                        if ((zChanged | zChanged2) || objRememberedValue == Composer.Companion.getEmpty()) {
                            objRememberedValue = new C48054uDg.Activity(function1, c48068uDu);
                            composer.updateRememberedValue(objRememberedValue);
                        }
                        composer.endReplaceableGroup();
                        C48054uDg.AEQbTJ(modifierAnimateItemPlacement$default, c48068uDu, str, z3, (Function0<Unit>) objRememberedValue, composer, 0, 0);
                        composer.endReplaceableGroup();
                    } else {
                        composer.startReplaceableGroup(-1910343924);
                        C48054uDg.copydefault(LazyItemScope.animateItemPlacement$default(lazyItemScope, Modifier.Companion, null, 1, null), c48068uDu, composer, 0, 0);
                        composer.endReplaceableGroup();
                    }
                    composer.endReplaceableGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }));
        }
        LazyListScope.item$default(lazyListScope, null, null, ComposableLambdaKt.composableLambdaInstance(-1785704040, true, new Application(indicator, z2)), 3, null);
        return Unit.INSTANCE;
    }

    public static final java.lang.Object copydefault(int i, C48068uDu c48068uDu) {
        Intrinsics.checkNotNullParameter(c48068uDu, "");
        return c48068uDu.EZpvd();
    }

    /* JADX INFO: renamed from: o.uDg$Activity */
    public static final class Activity implements Function0<Unit> {
        public final /* synthetic */ Function1<C48068uDu, Unit> AEQbTJ;
        public final /* synthetic */ C48068uDu copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.jvm.functions.Function1<? super o.uDu, kotlin.Unit> */
        /* JADX WARN: Multi-variable type inference failed */
        public Activity(Function1<? super C48068uDu, Unit> function1, C48068uDu c48068uDu) {
            this.AEQbTJ = function1;
            this.copydefault = c48068uDu;
        }

        public final void copydefault() {
            this.AEQbTJ.invoke(this.copydefault);
        }

        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function0
        public /* synthetic */ Unit invoke() {
            copydefault();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: o.uDg$Application */
    public static final class Application implements yHO<LazyItemScope, Composer, java.lang.Integer, Unit> {
        public final /* synthetic */ boolean KWHzl;
        public final /* synthetic */ Indicator OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(Indicator indicator, boolean z) {
            this.OLrzqt = indicator;
            this.KWHzl = z;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // o.yHO
        public /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, java.lang.Integer num) {
            EZpvd(lazyItemScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void EZpvd(LazyItemScope lazyItemScope, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(lazyItemScope, "");
            if ((i & 17) != 16 || !composer.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1785704040, i, -1, "com.okinc.tradingbot.impl.aiBot.ui.indicators.IndicatorSettingsScreen.<anonymous>.<anonymous>.<anonymous> (IndicatorSettingsComposable.kt:93)");
                }
                C48054uDg.KWHzl(this.OLrzqt, this.KWHzl, composer, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                    return;
                }
                return;
            }
            composer.skipToGroupEnd();
        }
    }

    public static final void KWHzl(final Indicator indicator, final boolean z, Composer composer, final int i) {
        int i2;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1581454899);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(indicator) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i2 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1581454899, i2, -1, "com.okinc.tradingbot.impl.aiBot.ui.indicators.DescriptionSection (IndicatorSettingsComposable.kt:105)");
            }
            Modifier.Companion companion = Modifier.Companion;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            composerStartRestartGroup.startReplaceableGroup(-483455358);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composerStartRestartGroup, 0);
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
            composerStartRestartGroup.startReplaceableGroup(398115569);
            if (z) {
                DividerKt.m1696Divider9IZ8Weo(PaddingKt.m675paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), 0.0f, androidx.compose.ui.unit.Dp.m5414constructorimpl(12), 0.0f, androidx.compose.ui.unit.Dp.m5414constructorimpl(21), 5, null), androidx.compose.ui.unit.Dp.m5414constructorimpl((float) 0.5d), ColorResources_androidKt.colorResource(C52761wXj.Activity.zuBGHE, composerStartRestartGroup, 0), composerStartRestartGroup, 54, 0);
            }
            composerStartRestartGroup.endReplaceableGroup();
            TextKt.m2072Text4IGK_g(StringResources_androidKt.stringResource(C48033uCm.Fragment.gvFztT, composerStartRestartGroup, 0), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, C52698wVa.OLrzqt(C52761wXj.LoaderManager.AwvSrB, java.lang.Integer.valueOf(C52761wXj.Activity.fdOvFl), composerStartRestartGroup, 0, 0), composerStartRestartGroup, 0, 0, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE);
            composer2 = composerStartRestartGroup;
            TextKt.m2072Text4IGK_g(indicator.OLrzqt(), PaddingKt.m675paddingqDBjuR0$default(companion, 0.0f, androidx.compose.ui.unit.Dp.m5414constructorimpl(12), 0.0f, 0.0f, 13, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, C52698wVa.OLrzqt(C52761wXj.LoaderManager.AYXKKw, java.lang.Integer.valueOf(C52761wXj.Activity.Dmq), composerStartRestartGroup, 0, 0), composer2, 48, 0, 65532);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: o.uDm
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return C48054uDg.EZpvd(indicator, z, i, (Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void AEQbTJ(Modifier modifier, final C48068uDu c48068uDu, final java.lang.String str, final boolean z, final Function0<Unit> function0, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        int i4;
        Composer composerStartRestartGroup = composer.startRestartGroup(-895360663);
        int i5 = i2 & 1;
        if (i5 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(c48068uDu) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= MLKEMEngine.KyberPolyBytes;
        } else if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i3 |= composerStartRestartGroup.changed(str) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changed(z) ? 2048 : 1024;
        }
        if ((i2 & 16) != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function0) ? 16384 : 8192;
        }
        int i6 = i3;
        if ((i6 & 9363) != 9362 || !composerStartRestartGroup.getSkipping()) {
            Modifier modifier3 = i5 != 0 ? Modifier.Companion : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-895360663, i6, -1, "com.okinc.tradingbot.impl.aiBot.ui.indicators.MultiValueSettingRow (IndicatorSettingsComposable.kt:141)");
            }
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null);
            composerStartRestartGroup.startReplaceableGroup(-483455358);
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Vertical top = arrangement.getTop();
            Alignment.Companion companion = Alignment.Companion;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion.getStart(), composerStartRestartGroup, 0);
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
            Modifier.Companion companion3 = Modifier.Companion;
            Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null);
            Arrangement.HorizontalOrVertical spaceBetween = arrangement.getSpaceBetween();
            Alignment.Vertical centerVertically = companion.getCenterVertically();
            composerStartRestartGroup.startReplaceableGroup(693286680);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(spaceBetween, centerVertically, composerStartRestartGroup, 54);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
            yHO<SkippableUpdater<ComposeUiNode>, Composer, java.lang.Integer, Unit> yhoModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierFillMaxWidth$default2);
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
            Updater.m2790setimpl(composerM2783constructorimpl2, measurePolicyRowMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m2790setimpl(composerM2783constructorimpl2, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, java.lang.Integer, Unit> setCompositeKeyHash2 = companion2.getSetCompositeKeyHash();
            if (composerM2783constructorimpl2.getInserting() || !Intrinsics.EZpvd(composerM2783constructorimpl2.rememberedValue(), java.lang.Integer.valueOf(currentCompositeKeyHash2))) {
                composerM2783constructorimpl2.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash2));
                composerM2783constructorimpl2.apply(java.lang.Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            yhoModifierMaterializerOf2.invoke(SkippableUpdater.m2774boximpl(SkippableUpdater.m2775constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            TextKt.m2072Text4IGK_g(str, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, C52698wVa.OLrzqt(C52761wXj.LoaderManager.AwvSrB, java.lang.Integer.valueOf(C52761wXj.Activity.fdOvFl), composerStartRestartGroup, 0, 0), composerStartRestartGroup, (i6 >> 6) & 14, 3072, 57342);
            composerStartRestartGroup.startReplaceableGroup(1924421353);
            if (z) {
                Modifier modifierM718size3ABfNKs = SizeKt.m718size3ABfNKs(companion3, androidx.compose.ui.unit.Dp.m5414constructorimpl(16));
                composerStartRestartGroup.startReplaceableGroup(1924426560);
                boolean z2 = (i6 & 57344) == 16384;
                java.lang.Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (z2 || objRememberedValue == Composer.Companion.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: o.uDq
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return C48054uDg.OLrzqt(function0);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                i4 = 0;
                IconKt.m1755Iconww6aTOc(PainterResources_androidKt.painterResource(C52761wXj.TaskDescription.hNurIN, composerStartRestartGroup, 0), (java.lang.String) null, C49551uqg.EZpvd(modifierM718size3ABfNKs, (Function0) objRememberedValue), ColorResources_androidKt.colorResource(C52761wXj.Activity.fdOvFl, composerStartRestartGroup, 0), composerStartRestartGroup, 48, 0);
            } else {
                i4 = 0;
            }
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            Modifier modifierFillMaxWidth$default3 = SizeKt.fillMaxWidth$default(PaddingKt.m675paddingqDBjuR0$default(companion3, 0.0f, androidx.compose.ui.unit.Dp.m5414constructorimpl(8), 0.0f, 0.0f, 13, null), 0.0f, 1, null);
            ParamSpecUiModel paramSpecUiModelOLrzqt = c48068uDu.OLrzqt();
            java.lang.String strKWHzl = C53418wlC.KWHzl(paramSpecUiModelOLrzqt != null ? paramSpecUiModelOLrzqt.OLrzqt() : null);
            java.lang.String value = c48068uDu.djBIcL().getValue();
            java.lang.String value2 = c48068uDu.AEQbTJ().getValue();
            ParamSpecUiModel paramSpecUiModelOLrzqt2 = c48068uDu.OLrzqt();
            ParamType paramTypeGEmmrt = paramSpecUiModelOLrzqt2 != null ? paramSpecUiModelOLrzqt2.gEmmrt() : null;
            ParamType paramType = ParamType.DECIMAL;
            int i7 = paramTypeGEmmrt == paramType ? 8194 : 2;
            ParamSpecUiModel paramSpecUiModelOLrzqt3 = c48068uDu.OLrzqt();
            int i8 = (paramSpecUiModelOLrzqt3 != null ? paramSpecUiModelOLrzqt3.gEmmrt() : null) == paramType ? 2 : i4;
            composerStartRestartGroup.startReplaceableGroup(-2048914842);
            int i9 = i6 & WalletImportError.ERROR_CODE_AA_EXIST;
            int i10 = i9 == 32 ? 1 : i4;
            java.lang.Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (i10 != 0 || objRememberedValue2 == Composer.Companion.getEmpty()) {
                objRememberedValue2 = new Function1() { // from class: o.uDr
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C48054uDg.EZpvd(c48068uDu, (java.lang.String) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceableGroup();
            Modifier modifier4 = modifier3;
            int i11 = i4;
            C52728wWd.copydefault(modifierFillMaxWidth$default3, value, (Function1) objRememberedValue2, strKWHzl, null, value2, i8, null, i7, java.lang.Integer.valueOf(i4), 44, composerStartRestartGroup, 805306374, 6, CipherSuite.TLS_DHE_PSK_WITH_AES_128_CBC_SHA);
            composerStartRestartGroup.startReplaceableGroup(-2048900115);
            if (c48068uDu.valueOf() && (!c48068uDu.KWHzl().isEmpty())) {
                Modifier modifierFillMaxWidth$default4 = SizeKt.fillMaxWidth$default(PaddingKt.m675paddingqDBjuR0$default(companion3, 0.0f, androidx.compose.ui.unit.Dp.m5414constructorimpl(4), 0.0f, 0.0f, 13, null), 0.0f, 1, null);
                SnapshotStateList<wVQ> snapshotStateListKWHzl = c48068uDu.KWHzl();
                composerStartRestartGroup.startReplaceableGroup(-2048892021);
                int i12 = i9 != 32 ? i11 : 1;
                java.lang.Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (i12 != 0 || objRememberedValue3 == Composer.Companion.getEmpty()) {
                    objRememberedValue3 = new Function1() { // from class: o.uDp
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return C48054uDg.AEQbTJ(c48068uDu, ((java.lang.Integer) obj).intValue());
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                composerStartRestartGroup.endReplaceableGroup();
                wVS.EZpvd(modifierFillMaxWidth$default4, snapshotStateListKWHzl, true, (Function1) objRememberedValue3, composerStartRestartGroup, 390, 0);
            }
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = modifier4;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final Modifier modifier5 = modifier2;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: o.uDt
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return C48054uDg.KWHzl(modifier5, c48068uDu, str, z, function0, i, i2, (Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final Unit OLrzqt(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(C48068uDu c48068uDu, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        c48068uDu.djBIcL().setValue(str);
        AYXKKw(c48068uDu, str);
        copydefault(c48068uDu, str);
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(C48068uDu c48068uDu, int i) {
        c48068uDu.djBIcL().setValue(c48068uDu.KWHzl().get(i).KWHzl());
        c48068uDu.AEQbTJ().setValue(null);
        int size = c48068uDu.KWHzl().size();
        int i2 = 0;
        while (i2 < size) {
            c48068uDu.KWHzl().set(i2, wVQ.copy$default(c48068uDu.KWHzl().get(i2), null, i2 == i, false, 5, null));
            i2++;
        }
        return Unit.INSTANCE;
    }

    public static final void copydefault(Modifier modifier, final C48068uDu c48068uDu, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        final Modifier modifier3;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1981355329);
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
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(c48068uDu) ? 32 : 16;
        }
        if ((i3 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            Modifier modifier4 = i4 != 0 ? Modifier.Companion : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1981355329, i3, -1, "com.okinc.tradingbot.impl.aiBot.ui.indicators.FixedParamSettingRow (IndicatorSettingsComposable.kt:215)");
            }
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null);
            java.lang.String strCopydefault = c48068uDu.copydefault();
            java.lang.String value = c48068uDu.djBIcL().getValue();
            java.lang.String value2 = c48068uDu.AEQbTJ().getValue();
            ParamSpecUiModel paramSpecUiModelOLrzqt = c48068uDu.OLrzqt();
            ParamType paramTypeGEmmrt = paramSpecUiModelOLrzqt != null ? paramSpecUiModelOLrzqt.gEmmrt() : null;
            ParamType paramType = ParamType.DECIMAL;
            int i5 = paramTypeGEmmrt == paramType ? 8194 : 2;
            ParamSpecUiModel paramSpecUiModelOLrzqt2 = c48068uDu.OLrzqt();
            int i6 = (paramSpecUiModelOLrzqt2 != null ? paramSpecUiModelOLrzqt2.gEmmrt() : null) == paramType ? 2 : 0;
            composerStartRestartGroup.startReplaceableGroup(1391009835);
            boolean z = (i3 & WalletImportError.ERROR_CODE_AA_EXIST) == 32;
            java.lang.Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new Function1() { // from class: o.uDo
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C48054uDg.OLrzqt(c48068uDu, (java.lang.String) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            modifier3 = modifier4;
            composer2 = composerStartRestartGroup;
            C52728wWd.copydefault(modifierFillMaxWidth$default, value, (Function1) objRememberedValue, strCopydefault, null, value2, i6, null, i5, 0, 44, composerStartRestartGroup, com.google.android.exoplayer2.C.ENCODING_PCM_32BIT, 6, CipherSuite.TLS_DHE_PSK_WITH_AES_128_CBC_SHA);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            modifier3 = modifier2;
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: o.uDn
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return C48054uDg.copydefault(modifier3, c48068uDu, i, i2, (Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final Unit OLrzqt(C48068uDu c48068uDu, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        c48068uDu.djBIcL().setValue(str);
        AYXKKw(c48068uDu, str);
        return Unit.INSTANCE;
    }

    public static final void AYXKKw(C48068uDu c48068uDu, java.lang.String str) {
        if (StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str)) {
            c48068uDu.AEQbTJ().setValue(null);
            return;
        }
        ParamSpecUiModel paramSpecUiModelOLrzqt = c48068uDu.OLrzqt();
        if (paramSpecUiModelOLrzqt != null) {
            uCF ucfEZpvd = paramSpecUiModelOLrzqt.EZpvd(C33129mqd.AEQbTJ(str));
            MutableState<java.lang.String> mutableStateAEQbTJ = c48068uDu.AEQbTJ();
            uCF.TaskDescription taskDescription = ucfEZpvd instanceof uCF.TaskDescription ? (uCF.TaskDescription) ucfEZpvd : null;
            mutableStateAEQbTJ.setValue(taskDescription != null ? taskDescription.KWHzl() : null);
        }
    }

    public static final void copydefault(C48068uDu c48068uDu, java.lang.String str) {
        if (c48068uDu.KWHzl().isEmpty()) {
            return;
        }
        java.lang.String string = StringsKt__StringsKt.hDKMBd((java.lang.CharSequence) str).toString();
        int size = c48068uDu.KWHzl().size();
        for (int i = 0; i < size; i++) {
            wVQ wvq = c48068uDu.KWHzl().get(i);
            boolean z = string.length() > 0 && Intrinsics.EZpvd((java.lang.Object) wvq.KWHzl(), (java.lang.Object) string);
            if (wvq.copydefault() != z) {
                c48068uDu.KWHzl().set(i, wVQ.copy$default(wvq, null, z, false, 5, null));
            }
        }
    }
}
