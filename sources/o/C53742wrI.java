package o;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.compose.animation.AnimationModifierKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.DividerKt;
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
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.res.ColorResources_androidKt;
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
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.viewinterop.AndroidView_androidKt;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.profileinstaller.ProfileVerifier;
import com.amplifyframework.ui.liveness.ml.FaceDetector;
import com.google.android.exoplayer2.audio.WavUtil;
import com.okinc.business.defi.biz.core.error.WalletImportError;
import com.okinc.tradingbot.impl.signalClone.ui.SignalBotComposableKt$collectAsStateWithLifecycle$1$1;
import com.okinc.unify_trade.biz.BotVo;
import com.okinc.unify_trade.biz.RecurringListItem;
import com.okinc.unify_trade.biz.SmartArbListItem;
import com.okinc.unify_trade.biz.SmartPortfolioListItem;
import com.okinc.unify_trade.biz.StrategyDetailsResponse;
import com.okinc.unify_trade.biz.subscribe.TickersData;
import java.util.NoSuchElementException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import o.C48033uCm;
import o.C52761wXj;
import o.C53742wrI;
import o.C55688xof;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import org.jetbrains.annotations.NotNull;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: renamed from: o.wrI, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C53742wrI {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final Unit AEQbTJ(Modifier modifier, C53739wrF c53739wrF, Function1 function1, Function1 function12, int i, int i2, Composer composer, int i3) {
        AEQbTJ(modifier, c53739wrF, function1, function12, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final Unit AEQbTJ(Modifier modifier, C53743wrJ c53743wrJ, Function1 function1, Function1 function12, int i, int i2, Composer composer, int i3) {
        copydefault(modifier, c53743wrJ, (Function1<? super java.lang.String, Unit>) function1, (Function1<? super java.lang.Float, Unit>) function12, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final Unit AEQbTJ(StrategyDetailsResponse strategyDetailsResponse, int i, Composer composer, int i2) {
        EZpvd(strategyDetailsResponse, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final Unit AEQbTJ(java.lang.String str, java.lang.String str2, int i, Composer composer, int i2) {
        AEQbTJ(str, str2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final Unit EZpvd(long j, int i, Composer composer, int i2) {
        OLrzqt(j, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final Unit EZpvd(java.lang.String str, java.lang.String str2, boolean z, LifecycleOwner lifecycleOwner, int i, int i2, Composer composer, int i3) {
        EZpvd(str, str2, z, lifecycleOwner, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final Unit OLrzqt(Modifier modifier, StrategyDetailsResponse strategyDetailsResponse, int i, int i2, Composer composer, int i3) {
        copydefault(modifier, strategyDetailsResponse, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final Unit OLrzqt(Modifier modifier, java.lang.String str, java.lang.String str2, boolean z, boolean z2, java.lang.String str3, Function2 function2, int i, int i2, Composer composer, int i3) {
        AEQbTJ(modifier, str, str2, z, z2, str3, function2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final Unit OLrzqt(java.lang.String str, java.lang.String str2, int i, Composer composer, int i2) {
        KWHzl(str, str2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final Unit copydefault(Modifier modifier, java.lang.String str, java.util.List list, int i, int i2, int i3, Composer composer, int i4) {
        OLrzqt(modifier, str, (java.util.List<java.lang.String>) list, i, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final Unit copydefault(Modifier modifier, java.util.List list, int i, int i2, int i3, Composer composer, int i4) {
        OLrzqt(modifier, (java.util.List<java.lang.String>) list, i, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [111=4, 113=4] */
    public static final void AEQbTJ(Modifier modifier, @NotNull final C53739wrF c53739wrF, @NotNull final Function1<? super java.lang.String, Unit> function1, @NotNull final Function1<? super java.lang.Float, Unit> function12, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        kotlin.Pair pairOLrzqt;
        Modifier modifier3;
        int i4;
        Composer composer2;
        java.lang.String instId;
        Composer composer3;
        final Modifier modifier4;
        Intrinsics.checkNotNullParameter(c53739wrF, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function12, "");
        Composer composerStartRestartGroup = composer.startRestartGroup(-2057430723);
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
            i3 |= composerStartRestartGroup.changed(c53739wrF) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= MLKEMEngine.KyberPolyBytes;
        } else if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function1) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function12) ? 2048 : 1024;
        }
        int i6 = i3;
        if ((i6 & 1171) == 1170 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            modifier4 = modifier2;
            composer3 = composerStartRestartGroup;
        } else {
            Modifier modifier5 = i5 != 0 ? Modifier.Companion : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2057430723, i6, -1, "com.okinc.tradingbot.impl.signalClone.ui.SignalCloneContent (SignalBotComposable.kt:89)");
            }
            java.lang.String algoId = c53739wrF.OLrzqt().getAlgoId();
            java.lang.String sourceCcy = c53739wrF.OLrzqt().getSourceCcy();
            composerStartRestartGroup.startReplaceableGroup(1076894363);
            boolean zChanged = composerStartRestartGroup.changed(algoId);
            boolean zChanged2 = composerStartRestartGroup.changed(sourceCcy);
            java.lang.Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if ((zChanged | zChanged2) || objRememberedValue == Composer.Companion.getEmpty()) {
                if (Intrinsics.EZpvd((java.lang.Object) c53739wrF.OLrzqt().getOrderType(), (java.lang.Object) "smart_arbitrage")) {
                    java.lang.Boolean bool = java.lang.Boolean.TRUE;
                    java.lang.String totalApy = c53739wrF.OLrzqt().getTotalApy();
                    if (totalApy == null) {
                        totalApy = "";
                    }
                    pairOLrzqt = C56390yDp.OLrzqt(bool, totalApy);
                } else {
                    java.lang.String sourceCcy2 = c53739wrF.OLrzqt().getSourceCcy();
                    pairOLrzqt = (sourceCcy2 == null || sourceCcy2.length() == 0) ? C56390yDp.OLrzqt(java.lang.Boolean.FALSE, c53739wrF.OLrzqt().getPnlRatio()) : C56390yDp.OLrzqt(java.lang.Boolean.FALSE, c53739wrF.OLrzqt().getPnlRatioInSourceCcy());
                }
                objRememberedValue = pairOLrzqt;
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            kotlin.Pair pair = (kotlin.Pair) objRememberedValue;
            composerStartRestartGroup.endReplaceableGroup();
            boolean zBooleanValue = ((java.lang.Boolean) pair.component1()).booleanValue();
            java.lang.String str = (java.lang.String) pair.component2();
            java.lang.String algoId2 = c53739wrF.OLrzqt().getAlgoId();
            composerStartRestartGroup.startReplaceableGroup(1076910181);
            boolean zChanged3 = composerStartRestartGroup.changed(algoId2);
            java.lang.Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged3 || objRememberedValue2 == Composer.Companion.getEmpty()) {
                boolean z = (Intrinsics.EZpvd((java.lang.Object) c53739wrF.OLrzqt().getOrderType(), (java.lang.Object) "smart_portfolio") && c53739wrF.OLrzqt().getPortfolioList().size() > 1) || (Intrinsics.EZpvd((java.lang.Object) c53739wrF.OLrzqt().getOrderType(), (java.lang.Object) "recurring") && c53739wrF.OLrzqt().getRecurringList().size() > 1);
                if (z && Intrinsics.EZpvd((java.lang.Object) c53739wrF.OLrzqt().getOrderType(), (java.lang.Object) "smart_portfolio")) {
                    java.util.Iterator<T> it = c53739wrF.OLrzqt().getPortfolioList().iterator();
                    if (!it.hasNext()) {
                        throw new NoSuchElementException();
                    }
                    java.lang.Object next = it.next();
                    if (it.hasNext()) {
                        i4 = i6;
                        double dAEQbTJ = C33129mqd.AEQbTJ(((SmartPortfolioListItem) next).getRatio());
                        while (true) {
                            java.lang.Object next2 = it.next();
                            modifier3 = modifier5;
                            double dAEQbTJ2 = C33129mqd.AEQbTJ(((SmartPortfolioListItem) next2).getRatio());
                            if (java.lang.Double.compare(dAEQbTJ, dAEQbTJ2) < 0) {
                                dAEQbTJ = dAEQbTJ2;
                                next = next2;
                            }
                            if (!it.hasNext()) {
                                break;
                            } else {
                                modifier5 = modifier3;
                            }
                        }
                    } else {
                        modifier3 = modifier5;
                        i4 = i6;
                    }
                    java.lang.String upperCase = ((SmartPortfolioListItem) next).getCcy().toUpperCase(java.util.Locale.ROOT);
                    Intrinsics.checkNotNullExpressionValue(upperCase, "");
                    instId = upperCase + "-" + c53739wrF.OLrzqt().getInvestCcy();
                    composer2 = composerStartRestartGroup;
                } else {
                    modifier3 = modifier5;
                    i4 = i6;
                    if (z && Intrinsics.EZpvd((java.lang.Object) c53739wrF.OLrzqt().getOrderType(), (java.lang.Object) "recurring")) {
                        java.util.Iterator<T> it2 = c53739wrF.OLrzqt().getRecurringList().iterator();
                        if (!it2.hasNext()) {
                            throw new NoSuchElementException();
                        }
                        java.lang.Object next3 = it2.next();
                        if (it2.hasNext()) {
                            double dAEQbTJ3 = C33129mqd.AEQbTJ(((RecurringListItem) next3).getRatio());
                            while (true) {
                                java.lang.Object next4 = it2.next();
                                composer2 = composerStartRestartGroup;
                                double dAEQbTJ4 = C33129mqd.AEQbTJ(((RecurringListItem) next4).getRatio());
                                if (java.lang.Double.compare(dAEQbTJ3, dAEQbTJ4) < 0) {
                                    next3 = next4;
                                    dAEQbTJ3 = dAEQbTJ4;
                                }
                                if (!it2.hasNext()) {
                                    break;
                                } else {
                                    composerStartRestartGroup = composer2;
                                }
                            }
                        } else {
                            composer2 = composerStartRestartGroup;
                        }
                        java.lang.String upperCase2 = ((RecurringListItem) next3).getCcy().toUpperCase(java.util.Locale.ROOT);
                        Intrinsics.checkNotNullExpressionValue(upperCase2, "");
                        instId = upperCase2 + "-" + c53739wrF.OLrzqt().getInvestCcy();
                    } else {
                        composer2 = composerStartRestartGroup;
                        instId = c53739wrF.OLrzqt().getInstId();
                    }
                }
                objRememberedValue2 = C56390yDp.OLrzqt(java.lang.Boolean.valueOf(z), instId);
                composer3 = composer2;
                composer3.updateRememberedValue(objRememberedValue2);
            } else {
                modifier3 = modifier5;
                i4 = i6;
                composer3 = composerStartRestartGroup;
            }
            kotlin.Pair pair2 = (kotlin.Pair) objRememberedValue2;
            composer3.endReplaceableGroup();
            boolean zBooleanValue2 = ((java.lang.Boolean) pair2.component1()).booleanValue();
            java.lang.String str2 = (java.lang.String) pair2.component2();
            Modifier modifier6 = modifier3;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(modifier6, 0.0f, 1, null);
            composer3.startReplaceableGroup(-483455358);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composer3, 0);
            composer3.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
            CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            Function0<ComposeUiNode> constructor = companion.getConstructor();
            yHO<SkippableUpdater<ComposeUiNode>, Composer, java.lang.Integer, Unit> yhoModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierFillMaxWidth$default);
            if (!(composer3.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer3.startReusableNode();
            if (composer3.getInserting()) {
                composer3.createNode(constructor);
            } else {
                composer3.useNode();
            }
            Composer composerM2783constructorimpl = Updater.m2783constructorimpl(composer3);
            Updater.m2790setimpl(composerM2783constructorimpl, measurePolicyColumnMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m2790setimpl(composerM2783constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, java.lang.Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (composerM2783constructorimpl.getInserting() || !Intrinsics.EZpvd(composerM2783constructorimpl.rememberedValue(), java.lang.Integer.valueOf(currentCompositeKeyHash))) {
                composerM2783constructorimpl.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash));
                composerM2783constructorimpl.apply(java.lang.Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            yhoModifierMaterializerOf.invoke(SkippableUpdater.m2774boximpl(SkippableUpdater.m2775constructorimpl(composer3)), composer3, 0);
            composer3.startReplaceableGroup(2058660585);
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            copydefault((Modifier) null, c53739wrF.OLrzqt(), composer3, 0, 1);
            Modifier.Companion companion2 = Modifier.Companion;
            AEQbTJ(PaddingKt.m675paddingqDBjuR0$default(companion2, 0.0f, androidx.compose.ui.unit.Dp.m5414constructorimpl(12), 0.0f, 0.0f, 13, null), str2, c53739wrF.OLrzqt().getInstType(), zBooleanValue, zBooleanValue2, str, ComposableLambdaKt.composableLambda(composer3, -500691969, true, new Application(c53739wrF)), composer3, 1572870, 0);
            int i7 = i4;
            Composer composer4 = composer3;
            DividerKt.m1696Divider9IZ8Weo(SizeKt.fillMaxWidth$default(PaddingKt.m673paddingVpY3zN4$default(companion2, 0.0f, androidx.compose.ui.unit.Dp.m5414constructorimpl(24), 1, null), 0.0f, 1, null), PrimitiveResources_androidKt.dimensionResource(C52761wXj.StateListAnimator.sSMYrx, composer3, 0), ColorResources_androidKt.colorResource(C52761wXj.Activity.sZqaRl, composer3, 0), composer4, 6, 0);
            TextKt.m2072Text4IGK_g(StringResources_androidKt.stringResource(C48033uCm.Fragment.zHQtTQ, composer3, 0), (Modifier) null, ColorResources_androidKt.colorResource(C52761wXj.Activity.fdOvFl, composer3, 0), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, C52698wVa.OLrzqt(C52761wXj.LoaderManager.gHZMYf, null, composer3, 0, 2), composer3, 0, 0, 65530);
            copydefault((Modifier) null, c53739wrF.KWHzl(), function1, function12, composer4, (i7 & FaceDetector.NUM_BOXES) | (i7 & 7168), 1);
            composer3.endReplaceableGroup();
            composer3.endNode();
            composer3.endReplaceableGroup();
            composer3.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier4 = modifier6;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: o.wrQ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return C53742wrI.AEQbTJ(modifier4, c53739wrF, function1, function12, i, i2, (Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: renamed from: o.wrI$Application */
    public static final class Application implements Function2<Composer, java.lang.Integer, Unit> {
        public final /* synthetic */ C53739wrF AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(C53739wrF c53739wrF) {
            this.AEQbTJ = c53739wrF;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function2
        public /* synthetic */ Unit invoke(Composer composer, java.lang.Integer num) {
            AEQbTJ(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void AEQbTJ(Composer composer, int i) {
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-500691969, i, -1, "com.okinc.tradingbot.impl.signalClone.ui.SignalCloneContent.<anonymous>.<anonymous> (SignalBotComposable.kt:132)");
            }
            C53742wrI.EZpvd(this.AEQbTJ.OLrzqt(), composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    public static final void copydefault(Modifier modifier, final C53743wrJ c53743wrJ, final Function1<? super java.lang.String, Unit> function1, final Function1<? super java.lang.Float, Unit> function12, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        Modifier modifier3;
        Composer composerStartRestartGroup = composer.startRestartGroup(-176629769);
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
            i3 |= composerStartRestartGroup.changed(c53743wrJ) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= MLKEMEngine.KyberPolyBytes;
        } else if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function1) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function12) ? 2048 : 1024;
        }
        if ((i3 & 1171) != 1170 || !composerStartRestartGroup.getSkipping()) {
            modifier3 = i4 != 0 ? Modifier.Companion : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-176629769, i3, -1, "com.okinc.tradingbot.impl.signalClone.ui.Input (SignalBotComposable.kt:163)");
            }
            wVE.AEQbTJ(AnimationModifierKt.animateContentSize$default(SizeKt.fillMaxWidth$default(PaddingKt.m675paddingqDBjuR0$default(modifier3, 0.0f, androidx.compose.ui.unit.Dp.m5414constructorimpl(8), 0.0f, 0.0f, 13, null), 0.0f, 1, null), null, null, 3, null), c53743wrJ.KWHzl(), function1, c53743wrJ.AEQbTJ(), null, null, c53743wrJ.EZpvd(), c53743wrJ.OLrzqt(), c53743wrJ.copydefault(), null, null, null, false, null, null, false, null, false, null, true, true, false, function12, false, 1, null, composerStartRestartGroup, i3 & FaceDetector.NUM_BOXES, com.google.android.exoplayer2.C.ENCODING_PCM_32BIT, ((i3 >> 3) & FaceDetector.NUM_BOXES) | 24582, 44564016);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            modifier3 = modifier2;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final Modifier modifier4 = modifier3;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: o.wrP
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return C53742wrI.AEQbTJ(modifier4, c53743wrJ, function1, function12, i, i2, (Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:78:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void OLrzqt(Modifier modifier, final java.lang.String str, final java.util.List<java.lang.String> list, final int i, Composer composer, final int i2, final int i3) {
        Modifier modifier2;
        int i4;
        Modifier modifier3;
        java.lang.Object objRememberedValue;
        int currentCompositeKeyHash;
        Composer composerM2783constructorimpl;
        Function2<ComposeUiNode, java.lang.Integer, Unit> setCompositeKeyHash;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(723390448);
        int i5 = i3 & 1;
        if (i5 != 0) {
            i4 = i2 | 6;
            modifier2 = modifier;
        } else if ((i2 & 6) == 0) {
            modifier2 = modifier;
            i4 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i2;
        } else {
            modifier2 = modifier;
            i4 = i2;
        }
        if ((i3 & 2) == 0) {
            if ((i2 & 48) == 0) {
                i4 |= composerStartRestartGroup.changed(str) ? 32 : 16;
            }
            if ((i3 & 4) == 0) {
                i4 |= MLKEMEngine.KyberPolyBytes;
            } else if ((i2 & MLKEMEngine.KyberPolyBytes) == 0) {
                i4 |= composerStartRestartGroup.changedInstance(list) ? 256 : 128;
            }
            if ((i3 & 8) == 0) {
                i4 |= 3072;
            } else if ((i2 & 3072) == 0) {
                i4 |= composerStartRestartGroup.changed(i) ? 2048 : 1024;
            }
            if ((i4 & 1171) == 1170 || !composerStartRestartGroup.getSkipping()) {
                modifier3 = i5 == 0 ? Modifier.Companion : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(723390448, i4, -1, "com.okinc.tradingbot.impl.signalClone.ui.AdaptiveHeaderLayout (SignalBotComposable.kt:188)");
                }
                composerStartRestartGroup.startReplaceableGroup(-1755763732);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == Composer.Companion.getEmpty()) {
                    objRememberedValue = StateListAnimator.OLrzqt;
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                MeasurePolicy measurePolicy = (MeasurePolicy) objRememberedValue;
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion = ComposeUiNode.Companion;
                Function0<ComposeUiNode> constructor = companion.getConstructor();
                yHO<SkippableUpdater<ComposeUiNode>, Composer, java.lang.Integer, Unit> yhoModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifier3);
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
                Updater.m2790setimpl(composerM2783constructorimpl, measurePolicy, companion.getSetMeasurePolicy());
                Updater.m2790setimpl(composerM2783constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion.getSetCompositeKeyHash();
                if (!composerM2783constructorimpl.getInserting() || !Intrinsics.EZpvd(composerM2783constructorimpl.rememberedValue(), java.lang.Integer.valueOf(currentCompositeKeyHash))) {
                    composerM2783constructorimpl.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash));
                    composerM2783constructorimpl.apply(java.lang.Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                yhoModifierMaterializerOf.invoke(SkippableUpdater.m2774boximpl(SkippableUpdater.m2775constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(2058660585);
                int i6 = i4 >> 3;
                TextKt.m2072Text4IGK_g(str, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.Companion.m5334getEllipsisgIe3tQ8(), false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, C52698wVa.OLrzqt(C52761wXj.LoaderManager.AwvSrB, java.lang.Integer.valueOf(C52761wXj.Activity.fdOvFl), composerStartRestartGroup, 0, 0), composerStartRestartGroup, i6 & 14, 3120, 55294);
                OLrzqt((Modifier) null, list, i, composerStartRestartGroup, (i6 & WalletImportError.ERROR_CODE_AA_EXIST) | (i6 & FaceDetector.NUM_BOXES), 1);
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
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
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: o.wrN
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return C53742wrI.copydefault(modifier4, str, list, i, i2, i3, (Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i4 |= 48;
        if ((i3 & 4) == 0) {
        }
        if ((i3 & 8) == 0) {
        }
        if ((i4 & 1171) == 1170) {
            if (i5 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            composerStartRestartGroup.startReplaceableGroup(-1755763732);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.Companion.getEmpty()) {
            }
            MeasurePolicy measurePolicy2 = (MeasurePolicy) objRememberedValue;
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
            yHO<SkippableUpdater<ComposeUiNode>, Composer, java.lang.Integer, Unit> yhoModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifier3);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
            }
            composerStartRestartGroup.startReusableNode();
            if (!composerStartRestartGroup.getInserting()) {
            }
            composerM2783constructorimpl = Updater.m2783constructorimpl(composerStartRestartGroup);
            Updater.m2790setimpl(composerM2783constructorimpl, measurePolicy2, companion2.getSetMeasurePolicy());
            Updater.m2790setimpl(composerM2783constructorimpl, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
            setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (!composerM2783constructorimpl.getInserting()) {
                composerM2783constructorimpl.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash));
                composerM2783constructorimpl.apply(java.lang.Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                yhoModifierMaterializerOf2.invoke(SkippableUpdater.m2774boximpl(SkippableUpdater.m2775constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(2058660585);
                int i62 = i4 >> 3;
                TextKt.m2072Text4IGK_g(str, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.Companion.m5334getEllipsisgIe3tQ8(), false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, C52698wVa.OLrzqt(C52761wXj.LoaderManager.AwvSrB, java.lang.Integer.valueOf(C52761wXj.Activity.fdOvFl), composerStartRestartGroup, 0, 0), composerStartRestartGroup, i62 & 14, 3120, 55294);
                OLrzqt((Modifier) null, list, i, composerStartRestartGroup, (i62 & WalletImportError.ERROR_CODE_AA_EXIST) | (i62 & FaceDetector.NUM_BOXES), 1);
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: renamed from: o.wrI$StateListAnimator */
    public static final class StateListAnimator implements MeasurePolicy {
        public static final StateListAnimator OLrzqt = new StateListAnimator();

        @Override // androidx.compose.ui.layout.MeasurePolicy
        /* JADX INFO: renamed from: measure-3p2s80s */
        public final MeasureResult mo202measure3p2s80s(MeasureScope measureScope, java.util.List<? extends Measurable> list, long j) {
            kotlin.Pair pairOLrzqt;
            Intrinsics.checkNotNullParameter(measureScope, "");
            Intrinsics.checkNotNullParameter(list, "");
            long jConstraints = ConstraintsKt.Constraints(0, Constraints.m5370getMaxWidthimpl(j), 0, Constraints.m5369getMaxHeightimpl(j));
            final Placeable placeableMo4385measureBRTryo0 = list.get(0).mo4385measureBRTryo0(jConstraints);
            final Placeable placeableMo4385measureBRTryo02 = list.get(1).mo4385measureBRTryo0(jConstraints);
            int iMo510roundToPx0680j_4 = measureScope.mo510roundToPx0680j_4(androidx.compose.ui.unit.Dp.m5414constructorimpl(12));
            final int iMo510roundToPx0680j_42 = measureScope.mo510roundToPx0680j_4(androidx.compose.ui.unit.Dp.m5414constructorimpl(4));
            final boolean z = (placeableMo4385measureBRTryo0.getWidth() + iMo510roundToPx0680j_4) + placeableMo4385measureBRTryo02.getWidth() <= Constraints.m5370getMaxWidthimpl(j);
            if (z) {
                pairOLrzqt = C56390yDp.OLrzqt(java.lang.Integer.valueOf(Constraints.m5370getMaxWidthimpl(j)), java.lang.Integer.valueOf(java.lang.Math.max(placeableMo4385measureBRTryo0.getHeight(), placeableMo4385measureBRTryo02.getHeight())));
            } else {
                pairOLrzqt = C56390yDp.OLrzqt(java.lang.Integer.valueOf(Constraints.m5370getMaxWidthimpl(j)), java.lang.Integer.valueOf(placeableMo4385measureBRTryo0.getHeight() + iMo510roundToPx0680j_42 + placeableMo4385measureBRTryo02.getHeight()));
            }
            final int iIntValue = ((java.lang.Number) pairOLrzqt.component1()).intValue();
            final int iIntValue2 = ((java.lang.Number) pairOLrzqt.component2()).intValue();
            return MeasureScope.layout$default(measureScope, iIntValue, iIntValue2, null, new Function1() { // from class: o.wrY
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C53742wrI.StateListAnimator.OLrzqt(z, iIntValue2, placeableMo4385measureBRTryo0, placeableMo4385measureBRTryo02, iIntValue, iMo510roundToPx0680j_42, (Placeable.PlacementScope) obj);
                }
            }, 4, null);
        }

        public static final Unit OLrzqt(boolean z, int i, Placeable placeable, Placeable placeable2, int i2, int i3, Placeable.PlacementScope placementScope) {
            Intrinsics.checkNotNullParameter(placementScope, "");
            if (z) {
                int height = (i - placeable.getHeight()) / 2;
                int height2 = (i - placeable2.getHeight()) / 2;
                Placeable.PlacementScope.placeRelative$default(placementScope, placeable, 0, height, 0.0f, 4, null);
                Placeable.PlacementScope.placeRelative$default(placementScope, placeable2, i2 - placeable2.getWidth(), height2, 0.0f, 4, null);
            } else {
                Placeable.PlacementScope.placeRelative$default(placementScope, placeable, 0, 0, 0.0f, 4, null);
                Placeable.PlacementScope.placeRelative$default(placementScope, placeable2, 0, placeable.getHeight() + i3, 0.0f, 4, null);
            }
            return Unit.INSTANCE;
        }
    }

    public static final void EZpvd(final StrategyDetailsResponse strategyDetailsResponse, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1421235831);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(strategyDetailsResponse) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1421235831, i2, -1, "com.okinc.tradingbot.impl.signalClone.ui.BotTypeSpecificInfo (SignalBotComposable.kt:242)");
            }
            java.lang.String orderType = strategyDetailsResponse.getOrderType();
            java.lang.String algoId = strategyDetailsResponse.getAlgoId();
            composerStartRestartGroup.startReplaceableGroup(-1606547610);
            boolean zChanged = composerStartRestartGroup.changed(orderType);
            boolean zChanged2 = composerStartRestartGroup.changed(algoId);
            java.lang.Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if ((zChanged | zChanged2) || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = C53785wrz.OLrzqt.EZpvd(strategyDetailsResponse);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            C53778wrs c53778wrs = (C53778wrs) objRememberedValue;
            composerStartRestartGroup.endReplaceableGroup();
            Arrangement.HorizontalOrVertical horizontalOrVerticalM582spacedBy0680j_4 = Arrangement.INSTANCE.m582spacedBy0680j_4(androidx.compose.ui.unit.Dp.m5414constructorimpl(4));
            composerStartRestartGroup.startReplaceableGroup(693286680);
            Modifier.Companion companion = Modifier.Companion;
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(horizontalOrVerticalM582spacedBy0680j_4, Alignment.Companion.getTop(), composerStartRestartGroup, 6);
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
            KWHzl(c53778wrs.KWHzl(), c53778wrs.copydefault(), composerStartRestartGroup, 0);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: o.wrT
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return C53742wrI.AEQbTJ(strategyDetailsResponse, i, (Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void KWHzl(final java.lang.String str, final java.lang.String str2, Composer composer, final int i) {
        int i2;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1752223667);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(str2) ? 32 : 16;
        }
        int i3 = i2;
        if ((i3 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1752223667, i3, -1, "com.okinc.tradingbot.impl.signalClone.ui.InfoLabelValuePair (SignalBotComposable.kt:256)");
            }
            TextStyle textStyleOLrzqt = C52698wVa.OLrzqt(C52761wXj.LoaderManager.QOLQEE, java.lang.Integer.valueOf(C52761wXj.Activity.QwvEab), composerStartRestartGroup, 0, 0);
            TextAlign.Companion companion = TextAlign.Companion;
            int iM5287getEnde0LSkKk = companion.m5287getEnde0LSkKk();
            TextOverflow.Companion companion2 = TextOverflow.Companion;
            TextKt.m2072Text4IGK_g(str, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m5279boximpl(iM5287getEnde0LSkKk), 0L, companion2.m5334getEllipsisgIe3tQ8(), false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, textStyleOLrzqt, composerStartRestartGroup, i3 & 14, 3120, 54782);
            TextStyle textStyleOLrzqt2 = C52698wVa.OLrzqt(C52761wXj.LoaderManager.DTwDnp, null, composerStartRestartGroup, 0, 2);
            int iM5287getEnde0LSkKk2 = companion.m5287getEnde0LSkKk();
            composer2 = composerStartRestartGroup;
            TextKt.m2072Text4IGK_g(str2, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m5279boximpl(iM5287getEnde0LSkKk2), 0L, companion2.m5334getEllipsisgIe3tQ8(), false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, textStyleOLrzqt2, composer2, (i3 >> 3) & 14, 3120, 54782);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: o.wrH
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return C53742wrI.OLrzqt(str, str2, i, (Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void copydefault(Modifier modifier, final StrategyDetailsResponse strategyDetailsResponse, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        final Modifier modifier3;
        SmartArbListItem smartArbListItem;
        int i4;
        com.okinc.unify_trade.biz.UserInfo userInfo;
        com.okinc.unify_trade.biz.UserInfo userInfo2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-873685212);
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
            i3 |= composerStartRestartGroup.changed(strategyDetailsResponse) ? 32 : 16;
        }
        if ((i3 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            modifier3 = i5 != 0 ? Modifier.Companion : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-873685212, i3, -1, "com.okinc.tradingbot.impl.signalClone.ui.Header (SignalBotComposable.kt:281)");
            }
            java.lang.String algoId = strategyDetailsResponse.getAlgoId();
            composerStartRestartGroup.startReplaceableGroup(-1387868584);
            boolean zChanged = composerStartRestartGroup.changed(algoId);
            java.lang.Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
                C53737wrD c53737wrD = C53737wrD.KWHzl;
                java.lang.String orderType = strategyDetailsResponse.getOrderType();
                java.lang.String instType = strategyDetailsResponse.getInstType();
                java.lang.String instId = strategyDetailsResponse.getInstId();
                java.lang.String displayId = strategyDetailsResponse.getDisplayId();
                java.util.ArrayList<SmartArbListItem> arbList = strategyDetailsResponse.getArbList();
                objRememberedValue = c53737wrD.copydefault(orderType, instType, instId, displayId, (arbList == null || (smartArbListItem = (SmartArbListItem) CollectionsKt___CollectionsKt.firstOrNull(arbList)) == null) ? null : smartArbListItem.getInstFamily(), strategyDetailsResponse.getStgyName());
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            java.lang.String str = (java.lang.String) objRememberedValue;
            composerStartRestartGroup.endReplaceableGroup();
            java.lang.String algoId2 = strategyDetailsResponse.getAlgoId();
            composerStartRestartGroup.startReplaceableGroup(-1387854831);
            boolean zChanged2 = composerStartRestartGroup.changed(algoId2);
            java.lang.Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged2 || objRememberedValue2 == Composer.Companion.getEmpty()) {
                java.lang.String direction = strategyDetailsResponse.getDirection();
                if (Intrinsics.EZpvd((java.lang.Object) direction, (java.lang.Object) "long")) {
                    i4 = 14;
                } else {
                    i4 = Intrinsics.EZpvd((java.lang.Object) direction, (java.lang.Object) "short") ? 13 : 6;
                }
                java.util.List listOLrzqt = C56402yEa.OLrzqt();
                if (Intrinsics.EZpvd((java.lang.Object) strategyDetailsResponse.getInstType(), (java.lang.Object) "SWAP")) {
                    java.lang.String strAhwBna = C56033xvF.AhwBna(strategyDetailsResponse.getDirection());
                    if (strAhwBna.length() <= 0) {
                        strAhwBna = null;
                    }
                    if (strAhwBna != null) {
                        listOLrzqt.add(strAhwBna);
                    }
                    if (!Intrinsics.EZpvd((java.lang.Object) strategyDetailsResponse.getOrderType(), (java.lang.Object) "smart_arbitrage")) {
                        listOLrzqt.add(C56033xvF.getBotLever$default(strategyDetailsResponse.getLever(), false, 2, null));
                    }
                }
                objRememberedValue2 = C56390yDp.OLrzqt(C56402yEa.fARcdN(listOLrzqt), java.lang.Integer.valueOf(i4));
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            kotlin.Pair pair = (kotlin.Pair) objRememberedValue2;
            composerStartRestartGroup.endReplaceableGroup();
            java.util.List list = (java.util.List) pair.component1();
            int iIntValue = ((java.lang.Number) pair.component2()).intValue();
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null);
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.HorizontalOrVertical horizontalOrVerticalM582spacedBy0680j_4 = arrangement.m582spacedBy0680j_4(androidx.compose.ui.unit.Dp.m5414constructorimpl(8));
            composerStartRestartGroup.startReplaceableGroup(693286680);
            Alignment.Companion companion = Alignment.Companion;
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(horizontalOrVerticalM582spacedBy0680j_4, companion.getTop(), composerStartRestartGroup, 6);
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
            BotVo bot = strategyDetailsResponse.getBot();
            java.lang.String portrait = (bot == null || (userInfo2 = bot.getUserInfo()) == null) ? null : userInfo2.getPortrait();
            if (portrait == null) {
                portrait = "";
            }
            BotVo bot2 = strategyDetailsResponse.getBot();
            AEQbTJ(portrait, (bot2 == null || (userInfo = bot2.getUserInfo()) == null) ? null : userInfo.getNickName(), composerStartRestartGroup, 0);
            Modifier.Companion companion3 = Modifier.Companion;
            Modifier modifierWeight$default = RowScope.weight$default(rowScopeInstance, companion3, 1.0f, false, 2, null);
            Arrangement.HorizontalOrVertical horizontalOrVerticalM582spacedBy0680j_42 = arrangement.m582spacedBy0680j_4(androidx.compose.ui.unit.Dp.m5414constructorimpl(4));
            composerStartRestartGroup.startReplaceableGroup(-483455358);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(horizontalOrVerticalM582spacedBy0680j_42, companion.getStart(), composerStartRestartGroup, 6);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
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
            Updater.m2790setimpl(composerM2783constructorimpl2, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m2790setimpl(composerM2783constructorimpl2, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, java.lang.Integer, Unit> setCompositeKeyHash2 = companion2.getSetCompositeKeyHash();
            if (composerM2783constructorimpl2.getInserting() || !Intrinsics.EZpvd(composerM2783constructorimpl2.rememberedValue(), java.lang.Integer.valueOf(currentCompositeKeyHash2))) {
                composerM2783constructorimpl2.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash2));
                composerM2783constructorimpl2.apply(java.lang.Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            yhoModifierMaterializerOf2.invoke(SkippableUpdater.m2774boximpl(SkippableUpdater.m2775constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            OLrzqt(SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null), str, (java.util.List<java.lang.String>) list, iIntValue, composerStartRestartGroup, 6, 0);
            OLrzqt(C33129mqd.valueOf(C33129mqd.subS$default(strategyDetailsResponse.getPTime(), strategyDetailsResponse.getCTime(), null, null, null, 14, null)), composerStartRestartGroup, 0);
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
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: o.wrV
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return C53742wrI.OLrzqt(modifier3, strategyDetailsResponse, i, i2, (Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void OLrzqt(Modifier modifier, final java.util.List<java.lang.String> list, final int i, Composer composer, final int i2, final int i3) {
        int i4;
        Composer composerStartRestartGroup = composer.startRestartGroup(1762557073);
        int i5 = i3 & 1;
        if (i5 != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(list) ? 32 : 16;
        }
        if ((i3 & 4) != 0) {
            i4 |= MLKEMEngine.KyberPolyBytes;
        } else if ((i2 & MLKEMEngine.KyberPolyBytes) == 0) {
            i4 |= composerStartRestartGroup.changed(i) ? 256 : 128;
        }
        int i6 = i4;
        if ((i6 & CipherSuite.TLS_RSA_PSK_WITH_3DES_EDE_CBC_SHA) != 146 || !composerStartRestartGroup.getSkipping()) {
            if (i5 != 0) {
                modifier = Modifier.Companion;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1762557073, i6, -1, "com.okinc.tradingbot.impl.signalClone.ui.Tags (SignalBotComposable.kt:334)");
            }
            Arrangement arrangement = Arrangement.INSTANCE;
            float fM5414constructorimpl = androidx.compose.ui.unit.Dp.m5414constructorimpl(4);
            Alignment.Companion companion = Alignment.Companion;
            Arrangement.Horizontal horizontalM583spacedByD5KLDUw = arrangement.m583spacedByD5KLDUw(fM5414constructorimpl, companion.getEnd());
            composerStartRestartGroup.startReplaceableGroup(693286680);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(horizontalM583spacedByD5KLDUw, companion.getTop(), composerStartRestartGroup, 6);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
            yHO<SkippableUpdater<ComposeUiNode>, Composer, java.lang.Integer, Unit> yhoModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifier);
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
            composerStartRestartGroup.startReplaceableGroup(307401996);
            java.util.Iterator<java.lang.String> it = list.iterator();
            while (it.hasNext()) {
                C49558uqn.EZpvd(null, it.next(), -5, i, composerStartRestartGroup, ((i6 << 3) & 7168) | MLKEMEngine.KyberPolyBytes, 1);
            }
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
        }
        final Modifier modifier2 = modifier;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: o.wrK
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return C53742wrI.copydefault(modifier2, list, i, i2, i3, (Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void OLrzqt(final long j, Composer composer, final int i) {
        int i2;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1411987685);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(j) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1411987685, i2, -1, "com.okinc.tradingbot.impl.signalClone.ui.RunningDuration (SignalBotComposable.kt:350)");
            }
            composer2 = composerStartRestartGroup;
            TextKt.m2072Text4IGK_g(C33069mpW.KWHzl((android.content.Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext()), C55688xof.Application.addPreRequisiteCollector, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("durationDayTime", wUB.copydefault(j)))), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, C52698wVa.OLrzqt(C52761wXj.LoaderManager.QOLQEE, java.lang.Integer.valueOf(C52761wXj.Activity.DCUTEIddSDPG), composerStartRestartGroup, 0, 0), composer2, 0, 0, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: o.wrR
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return C53742wrI.EZpvd(j, i, (Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void AEQbTJ(Modifier modifier, final java.lang.String str, final java.lang.String str2, final boolean z, final boolean z2, final java.lang.String str3, final Function2<? super Composer, ? super java.lang.Integer, Unit> function2, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(1781740364);
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
            i3 |= composerStartRestartGroup.changed(str) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= MLKEMEngine.KyberPolyBytes;
        } else if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i3 |= composerStartRestartGroup.changed(str2) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changed(z) ? 2048 : 1024;
        }
        if ((i2 & 16) != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            i3 |= composerStartRestartGroup.changed(z2) ? 16384 : 8192;
        }
        if ((i2 & 32) != 0) {
            i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        } else if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            i3 |= composerStartRestartGroup.changed(str3) ? 131072 : 65536;
        }
        if ((i2 & 64) != 0) {
            i3 |= 1572864;
        } else if ((i & 1572864) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function2) ? 1048576 : 524288;
        }
        int i5 = i3;
        if ((599187 & i5) != 599186 || !composerStartRestartGroup.getSkipping()) {
            Modifier modifier3 = i4 != 0 ? Modifier.Companion : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1781740364, i5, -1, "com.okinc.tradingbot.impl.signalClone.ui.Content (SignalBotComposable.kt:375)");
            }
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null);
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.HorizontalOrVertical horizontalOrVerticalM582spacedBy0680j_4 = arrangement.m582spacedBy0680j_4(androidx.compose.ui.unit.Dp.m5414constructorimpl(12));
            composerStartRestartGroup.startReplaceableGroup(693286680);
            Alignment.Companion companion = Alignment.Companion;
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(horizontalOrVerticalM582spacedBy0680j_4, companion.getTop(), composerStartRestartGroup, 6);
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
            Modifier.Companion companion3 = Modifier.Companion;
            Modifier modifierWeight$default = RowScope.weight$default(rowScopeInstance, companion3, 1.0f, false, 2, null);
            composerStartRestartGroup.startReplaceableGroup(-483455358);
            Modifier modifier4 = modifier3;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion.getStart(), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
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
            Updater.m2790setimpl(composerM2783constructorimpl2, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m2790setimpl(composerM2783constructorimpl2, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, java.lang.Integer, Unit> setCompositeKeyHash2 = companion2.getSetCompositeKeyHash();
            if (composerM2783constructorimpl2.getInserting() || !Intrinsics.EZpvd(composerM2783constructorimpl2.rememberedValue(), java.lang.Integer.valueOf(currentCompositeKeyHash2))) {
                composerM2783constructorimpl2.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash2));
                composerM2783constructorimpl2.apply(java.lang.Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            yhoModifierMaterializerOf2.invoke(SkippableUpdater.m2774boximpl(SkippableUpdater.m2775constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            TextKt.m2072Text4IGK_g(StringResources_androidKt.stringResource(z ? C48033uCm.Fragment.IYdWPz : C48033uCm.Fragment.icKaHr, composerStartRestartGroup, 0), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, C52698wVa.OLrzqt(C52761wXj.LoaderManager.QOLQEE, java.lang.Integer.valueOf(C52761wXj.Activity.QwvEab), composerStartRestartGroup, 0, 0), composerStartRestartGroup, 0, 0, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE);
            TextKt.m2072Text4IGK_g(C56068xvo.copydefault.copydefault(str3, true), (Modifier) null, ColorKt.Color(C56033xvF.OLrzqt((java.lang.Object) C56033xvF.KWHzl(str3))), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, C52698wVa.OLrzqt(C52761wXj.LoaderManager.DCUTEIddSDPG, null, composerStartRestartGroup, 0, 2), composerStartRestartGroup, 0, 0, 65530);
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            Modifier modifierWeight$default2 = RowScope.weight$default(rowScopeInstance, companion3, 1.0f, false, 2, null);
            float f = 4;
            Arrangement.HorizontalOrVertical horizontalOrVerticalM582spacedBy0680j_42 = arrangement.m582spacedBy0680j_4(androidx.compose.ui.unit.Dp.m5414constructorimpl(f));
            Alignment.Horizontal end = companion.getEnd();
            composerStartRestartGroup.startReplaceableGroup(-483455358);
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(horizontalOrVerticalM582spacedBy0680j_42, end, composerStartRestartGroup, 54);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor3 = companion2.getConstructor();
            yHO<SkippableUpdater<ComposeUiNode>, Composer, java.lang.Integer, Unit> yhoModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(modifierWeight$default2);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor3);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM2783constructorimpl3 = Updater.m2783constructorimpl(composerStartRestartGroup);
            Updater.m2790setimpl(composerM2783constructorimpl3, measurePolicyColumnMeasurePolicy2, companion2.getSetMeasurePolicy());
            Updater.m2790setimpl(composerM2783constructorimpl3, currentCompositionLocalMap3, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, java.lang.Integer, Unit> setCompositeKeyHash3 = companion2.getSetCompositeKeyHash();
            if (composerM2783constructorimpl3.getInserting() || !Intrinsics.EZpvd(composerM2783constructorimpl3.rememberedValue(), java.lang.Integer.valueOf(currentCompositeKeyHash3))) {
                composerM2783constructorimpl3.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash3));
                composerM2783constructorimpl3.apply(java.lang.Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
            }
            yhoModifierMaterializerOf3.invoke(SkippableUpdater.m2774boximpl(SkippableUpdater.m2775constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            function2.invoke(composerStartRestartGroup, java.lang.Integer.valueOf((i5 >> 18) & 14));
            Arrangement.HorizontalOrVertical horizontalOrVerticalM582spacedBy0680j_43 = arrangement.m582spacedBy0680j_4(androidx.compose.ui.unit.Dp.m5414constructorimpl(f));
            composerStartRestartGroup.startReplaceableGroup(693286680);
            MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(horizontalOrVerticalM582spacedBy0680j_43, companion.getTop(), composerStartRestartGroup, 6);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor4 = companion2.getConstructor();
            yHO<SkippableUpdater<ComposeUiNode>, Composer, java.lang.Integer, Unit> yhoModifierMaterializerOf4 = LayoutKt.modifierMaterializerOf(companion3);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor4);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM2783constructorimpl4 = Updater.m2783constructorimpl(composerStartRestartGroup);
            Updater.m2790setimpl(composerM2783constructorimpl4, measurePolicyRowMeasurePolicy2, companion2.getSetMeasurePolicy());
            Updater.m2790setimpl(composerM2783constructorimpl4, currentCompositionLocalMap4, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, java.lang.Integer, Unit> setCompositeKeyHash4 = companion2.getSetCompositeKeyHash();
            if (composerM2783constructorimpl4.getInserting() || !Intrinsics.EZpvd(composerM2783constructorimpl4.rememberedValue(), java.lang.Integer.valueOf(currentCompositeKeyHash4))) {
                composerM2783constructorimpl4.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash4));
                composerM2783constructorimpl4.apply(java.lang.Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
            }
            yhoModifierMaterializerOf4.invoke(SkippableUpdater.m2774boximpl(SkippableUpdater.m2775constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            TextKt.m2072Text4IGK_g(StringResources_androidKt.stringResource(C48033uCm.Fragment.QVMIlx, composerStartRestartGroup, 0), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, C52698wVa.OLrzqt(C52761wXj.LoaderManager.QOLQEE, java.lang.Integer.valueOf(C52761wXj.Activity.QwvEab), composerStartRestartGroup, 0, 0), composerStartRestartGroup, 0, 0, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE);
            int i6 = i5 >> 3;
            EZpvd(str, str2, z2, null, composerStartRestartGroup, (i6 & 14) | (i6 & WalletImportError.ERROR_CODE_AA_EXIST) | ((i5 >> 6) & FaceDetector.NUM_BOXES), 8);
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
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
            modifier2 = modifier4;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final Modifier modifier5 = modifier2;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: o.wrU
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return C53742wrI.OLrzqt(modifier5, str, str2, z, z2, str3, function2, i, i2, (Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void AEQbTJ(final java.lang.String str, final java.lang.String str2, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(2031258727);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(str2) ? 32 : 16;
        }
        if ((i2 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2031258727, i2, -1, "com.okinc.tradingbot.impl.signalClone.ui.Avatar (SignalBotComposable.kt:427)");
            }
            Modifier modifierM718size3ABfNKs = SizeKt.m718size3ABfNKs(Modifier.Companion, androidx.compose.ui.unit.Dp.m5414constructorimpl(36));
            composerStartRestartGroup.startReplaceableGroup(1514830953);
            java.lang.Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.Companion;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = new Function1() { // from class: o.wrM
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C53742wrI.KWHzl((android.content.Context) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            Function1 function1 = (Function1) objRememberedValue;
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.startReplaceableGroup(1514832810);
            boolean z = (i2 & 14) == 4;
            boolean z2 = (i2 & WalletImportError.ERROR_CODE_AA_EXIST) == 32;
            java.lang.Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if ((z | z2) || objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = new Function1() { // from class: o.wrO
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C53742wrI.copydefault(str, str2, (AppCompatImageView) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceableGroup();
            AndroidView_androidKt.AndroidView(function1, modifierM718size3ABfNKs, (Function1) objRememberedValue2, composerStartRestartGroup, 54, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: o.wrS
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return C53742wrI.AEQbTJ(str, str2, i, (Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final AppCompatImageView KWHzl(android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        return new AppCompatImageView(context);
    }

    public static final Unit copydefault(java.lang.String str, java.lang.String str2, AppCompatImageView appCompatImageView) {
        Intrinsics.checkNotNullParameter(appCompatImageView, "");
        C33054mpH.loadAvatar$default(appCompatImageView, str, str2, null, 4, null);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0168  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void EZpvd(final java.lang.String str, final java.lang.String str2, final boolean z, LifecycleOwner lifecycleOwner, Composer composer, final int i, final int i2) {
        int i3;
        LifecycleOwner lifecycleOwner2;
        java.lang.String botPrice$default;
        Composer composer2;
        final LifecycleOwner lifecycleOwner3;
        java.lang.String last;
        Composer composerStartRestartGroup = composer.startRestartGroup(1774958802);
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
            i3 |= composerStartRestartGroup.changed(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            if ((i2 & 8) == 0) {
                lifecycleOwner2 = lifecycleOwner;
                int i4 = composerStartRestartGroup.changedInstance(lifecycleOwner2) ? 2048 : 1024;
                i3 |= i4;
            } else {
                lifecycleOwner2 = lifecycleOwner;
            }
            i3 |= i4;
        } else {
            lifecycleOwner2 = lifecycleOwner;
        }
        if ((i3 & 1171) != 1170 || !composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                if ((i2 & 8) != 0) {
                    lifecycleOwner2 = (LifecycleOwner) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
                    i3 &= -7169;
                }
                LifecycleOwner lifecycleOwner4 = lifecycleOwner2;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1774958802, i3, -1, "com.okinc.tradingbot.impl.signalClone.ui.MarketPrice (SignalBotComposable.kt:444)");
                }
                TickersData tickersDataKWHzl = KWHzl((androidx.compose.runtime.State<TickersData>) OLrzqt(C52677wUg.copydefault.AEQbTJ(str), (java.lang.Object) null, lifecycleOwner4.getLifecycle(), Lifecycle.State.RESUMED, (CoroutineContext) null, composerStartRestartGroup, 3120, 8));
                java.lang.String str3 = (tickersDataKWHzl != null || (last = tickersDataKWHzl.getLast()) == null) ? "" : last;
                if (!z) {
                    java.lang.String upperCase = TaskDescription.AEQbTJ(str).copydefault().toUpperCase(java.util.Locale.ROOT);
                    Intrinsics.checkNotNullExpressionValue(upperCase, "");
                    botPrice$default = upperCase + " " + C56033xvF.getBotPrice$default(str2, str, str3, false, false, null, null, 120, null);
                } else {
                    botPrice$default = C56033xvF.getBotPrice$default(str2, str, str3, false, false, null, null, 120, null);
                }
                composer2 = composerStartRestartGroup;
                TextKt.m2072Text4IGK_g(botPrice$default, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, C52698wVa.OLrzqt(C52761wXj.LoaderManager.DTwDnp, null, composerStartRestartGroup, 0, 2), composer2, 0, 0, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                lifecycleOwner3 = lifecycleOwner4;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                if ((i2 & 8) != 0) {
                    i3 &= -7169;
                }
                LifecycleOwner lifecycleOwner42 = lifecycleOwner2;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                TickersData tickersDataKWHzl2 = KWHzl((androidx.compose.runtime.State<TickersData>) OLrzqt(C52677wUg.copydefault.AEQbTJ(str), (java.lang.Object) null, lifecycleOwner42.getLifecycle(), Lifecycle.State.RESUMED, (CoroutineContext) null, composerStartRestartGroup, 3120, 8));
                if (tickersDataKWHzl2 != null) {
                    if (!z) {
                    }
                    composer2 = composerStartRestartGroup;
                    TextKt.m2072Text4IGK_g(botPrice$default, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, C52698wVa.OLrzqt(C52761wXj.LoaderManager.DTwDnp, null, composerStartRestartGroup, 0, 2), composer2, 0, 0, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    lifecycleOwner3 = lifecycleOwner42;
                }
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            lifecycleOwner3 = lifecycleOwner2;
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: o.wrL
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return C53742wrI.EZpvd(str, str2, z, lifecycleOwner3, i, i2, (Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final <T> androidx.compose.runtime.State<T> OLrzqt(Flow<? extends T> flow, T t, Lifecycle lifecycle, Lifecycle.State state, CoroutineContext coroutineContext, Composer composer, int i, int i2) {
        composer.startReplaceableGroup(1896600298);
        if ((i2 & 4) != 0) {
            state = Lifecycle.State.STARTED;
        }
        Lifecycle.State state2 = state;
        if ((i2 & 8) != 0) {
            coroutineContext = EmptyCoroutineContext.INSTANCE;
        }
        CoroutineContext coroutineContext2 = coroutineContext;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1896600298, i, -1, "com.okinc.tradingbot.impl.signalClone.ui.collectAsStateWithLifecycle (SignalBotComposable.kt:478)");
        }
        java.lang.Object[] objArr = {flow, lifecycle, state2, coroutineContext2};
        composer.startReplaceableGroup(279180188);
        boolean zChangedInstance = composer.changedInstance(lifecycle);
        boolean z = (((i & 7168) ^ 3072) > 2048 && composer.changed(state2)) || (i & 3072) == 2048;
        boolean zChangedInstance2 = composer.changedInstance(coroutineContext2);
        boolean zChangedInstance3 = composer.changedInstance(flow);
        java.lang.Object objRememberedValue = composer.rememberedValue();
        if ((zChangedInstance | z | zChangedInstance2 | zChangedInstance3) || objRememberedValue == Composer.Companion.getEmpty()) {
            SignalBotComposableKt$collectAsStateWithLifecycle$1$1 signalBotComposableKt$collectAsStateWithLifecycle$1$1 = new SignalBotComposableKt$collectAsStateWithLifecycle$1$1(lifecycle, state2, coroutineContext2, flow, null);
            composer.updateRememberedValue(signalBotComposableKt$collectAsStateWithLifecycle$1$1);
            objRememberedValue = signalBotComposableKt$collectAsStateWithLifecycle$1$1;
        }
        composer.endReplaceableGroup();
        int i3 = i >> 3;
        androidx.compose.runtime.State<T> stateProduceState = SnapshotStateKt.produceState((java.lang.Object) t, objArr, (Function2) objRememberedValue, composer, (i3 & 8) | (i3 & 14));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return stateProduceState;
    }

    public static final TickersData KWHzl(androidx.compose.runtime.State<TickersData> state) {
        return state.getValue();
    }
}
