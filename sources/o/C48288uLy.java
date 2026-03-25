package o;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
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
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.ColorResources_androidKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import com.amplifyframework.ui.liveness.ml.FaceDetector;
import com.just.agentweb.WebIndicator;
import com.okinc.business.defi.biz.core.error.WalletImportError;
import com.okinc.tradingbot.impl.botList.ui.shared.MetricStyle;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.uLy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C48288uLy {

    /* JADX INFO: renamed from: o.uLy$StateListAnimator */
    public final /* synthetic */ class StateListAnimator {
        public static final /* synthetic */ int[] copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[MetricStyle.values().length];
            try {
                iArr[MetricStyle.LARGE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[MetricStyle.NORMAL.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            copydefault = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final Unit AEQbTJ(Modifier modifier, float f, float f2, java.util.List list, int i, int i2, Composer composer, int i3) {
        KWHzl(modifier, f, f2, (java.util.List<? extends java.util.List<? extends InterfaceC48286uLw>>) list, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final Unit KWHzl(java.util.List list, float f, long j, long j2, int i, Composer composer, int i2) {
        KWHzl(list, f, j, j2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final Unit KWHzl(C48283uLt c48283uLt, Modifier modifier, long j, long j2, int i, int i2, Composer composer, int i3) {
        EZpvd(c48283uLt, modifier, j, j2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final Unit copydefault(Modifier modifier, float f, float f2, java.util.List list, int i, int i2, Composer composer, int i3) {
        KWHzl(modifier, f, f2, (java.util.List<? extends java.util.List<? extends InterfaceC48286uLw>>) list, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01fa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void KWHzl(Modifier modifier, float f, float f2, @NotNull final java.util.List<? extends java.util.List<? extends InterfaceC48286uLw>> list, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        float f3;
        int i4;
        float f4;
        int i5;
        Modifier modifier3;
        final float f5;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(list, "");
        Composer composerStartRestartGroup = composer.startRestartGroup(-188825352);
        int i6 = i2 & 1;
        if (i6 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        int i7 = i2 & 2;
        if (i7 != 0) {
            i3 |= 48;
        } else {
            if ((i & 48) == 0) {
                f3 = f;
                i3 |= composerStartRestartGroup.changed(f3) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 != 0) {
                if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
                    f4 = f2;
                    i3 |= composerStartRestartGroup.changed(f4) ? 256 : 128;
                }
                if ((i2 & 8) != 0) {
                    i3 |= 3072;
                } else if ((i & 3072) == 0) {
                    i3 |= composerStartRestartGroup.changedInstance(list) ? 2048 : 1024;
                }
                i5 = i3;
                if ((i5 & 1171) != 1170 || !composerStartRestartGroup.getSkipping()) {
                    modifier3 = i6 == 0 ? Modifier.Companion : modifier2;
                    float fM5414constructorimpl = i7 == 0 ? androidx.compose.ui.unit.Dp.m5414constructorimpl(16) : f3;
                    float fM5414constructorimpl2 = i4 == 0 ? androidx.compose.ui.unit.Dp.m5414constructorimpl(8) : f4;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-188825352, i5, -1, "com.okinc.tradingbot.impl.botList.ui.shared.MetricsGrid (MetricsSectionComposable.kt:391)");
                    }
                    if (!list.isEmpty()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        ScopeUpdateScope scopeUpdateScopeEndRestartGroup2 = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup2 != null) {
                            final Modifier modifier4 = modifier3;
                            final float f6 = fM5414constructorimpl;
                            final float f7 = fM5414constructorimpl2;
                            scopeUpdateScopeEndRestartGroup2.updateScope(new Function2() { // from class: o.uLz
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                @Override // kotlin.jvm.functions.Function2
                                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                    return C48288uLy.copydefault(modifier4, f6, f7, list, i, i2, (Composer) obj, ((java.lang.Integer) obj2).intValue());
                                }
                            });
                            return;
                        }
                        return;
                    }
                    long jColorResource = ColorResources_androidKt.colorResource(C52761wXj.Activity.fdOvFl, composerStartRestartGroup, 0);
                    long jColorResource2 = ColorResources_androidKt.colorResource(C52761wXj.Activity.QwvEab, composerStartRestartGroup, 0);
                    Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null);
                    Arrangement.HorizontalOrVertical horizontalOrVerticalM582spacedBy0680j_4 = Arrangement.INSTANCE.m582spacedBy0680j_4(fM5414constructorimpl);
                    composerStartRestartGroup.startReplaceableGroup(-483455358);
                    MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(horizontalOrVerticalM582spacedBy0680j_4, Alignment.Companion.getStart(), composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(-1323940314);
                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    ComposeUiNode.Companion companion = ComposeUiNode.Companion;
                    Function0<ComposeUiNode> constructor = companion.getConstructor();
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
                    composerStartRestartGroup.startReplaceableGroup(329388939);
                    int i8 = 0;
                    for (java.lang.Object obj : list) {
                        if (i8 < 0) {
                            yDY.AYXKKw();
                        }
                        composerStartRestartGroup.startMovableGroup(-1582442094, "row_" + i8);
                        KWHzl((java.util.List) obj, fM5414constructorimpl2, jColorResource, jColorResource2, composerStartRestartGroup, (i5 >> 3) & WalletImportError.ERROR_CODE_AA_EXIST);
                        composerStartRestartGroup.endMovableGroup();
                        i8++;
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    f3 = fM5414constructorimpl;
                    f5 = fM5414constructorimpl2;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    modifier3 = modifier2;
                    f5 = f4;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    final Modifier modifier5 = modifier3;
                    final float f8 = f3;
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: o.uLC
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                            return C48288uLy.AEQbTJ(modifier5, f8, f5, list, i, i2, (Composer) obj2, ((java.lang.Integer) obj3).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= MLKEMEngine.KyberPolyBytes;
            f4 = f2;
            if ((i2 & 8) != 0) {
            }
            i5 = i3;
            if ((i5 & 1171) != 1170) {
                if (i6 == 0) {
                }
                if (i7 == 0) {
                }
                if (i4 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                if (!list.isEmpty()) {
                }
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        f3 = f;
        i4 = i2 & 4;
        if (i4 != 0) {
        }
        f4 = f2;
        if ((i2 & 8) != 0) {
        }
        i5 = i3;
        if ((i5 & 1171) != 1170) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    public static final void KWHzl(final java.util.List<? extends InterfaceC48286uLw> list, final float f, final long j, final long j2, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-351668082);
        int i3 = (i & 6) == 0 ? (composerStartRestartGroup.changedInstance(list) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(f) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i3 |= composerStartRestartGroup.changed(j) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changed(j2) ? 2048 : 1024;
        }
        if ((i3 & 1171) != 1170 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-351668082, i3, -1, "com.okinc.tradingbot.impl.botList.ui.shared.MetricRow (MetricsSectionComposable.kt:421)");
            }
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null);
            Arrangement.HorizontalOrVertical horizontalOrVerticalM582spacedBy0680j_4 = Arrangement.INSTANCE.m582spacedBy0680j_4(f);
            composerStartRestartGroup.startReplaceableGroup(693286680);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(horizontalOrVerticalM582spacedBy0680j_4, Alignment.Companion.getTop(), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            Function0<ComposeUiNode> constructor = companion.getConstructor();
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
            Updater.m2790setimpl(composerM2783constructorimpl, measurePolicyRowMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m2790setimpl(composerM2783constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, java.lang.Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (composerM2783constructorimpl.getInserting() || !Intrinsics.EZpvd(composerM2783constructorimpl.rememberedValue(), java.lang.Integer.valueOf(currentCompositeKeyHash))) {
                composerM2783constructorimpl.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash));
                composerM2783constructorimpl.apply(java.lang.Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            int i4 = 0;
            yhoModifierMaterializerOf.invoke(SkippableUpdater.m2774boximpl(SkippableUpdater.m2775constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            composerStartRestartGroup.startReplaceableGroup(-730740723);
            for (InterfaceC48286uLw interfaceC48286uLw : list) {
                composerStartRestartGroup.startMovableGroup(-54279516, interfaceC48286uLw.EZpvd());
                Modifier modifierWeight$default = RowScope.weight$default(rowScopeInstance, Modifier.Companion, 1.0f, false, 2, null);
                if (interfaceC48286uLw instanceof C48283uLt) {
                    composerStartRestartGroup.startReplaceableGroup(-54275537);
                    i2 = i4;
                    EZpvd((C48283uLt) interfaceC48286uLw, modifierWeight$default, j, j2, composerStartRestartGroup, (i3 & FaceDetector.NUM_BOXES) | (i3 & 7168), 0);
                    composerStartRestartGroup.endReplaceableGroup();
                } else {
                    i2 = i4;
                    if (interfaceC48286uLw instanceof C48279uLp) {
                        composerStartRestartGroup.startReplaceableGroup(-54267188);
                        ((C48279uLp) interfaceC48286uLw).KWHzl().invoke(rowScopeInstance, modifierWeight$default, composerStartRestartGroup, 6);
                        composerStartRestartGroup.endReplaceableGroup();
                    } else {
                        if (!(interfaceC48286uLw instanceof C48285uLv)) {
                            composerStartRestartGroup.startReplaceableGroup(-54276833);
                            composerStartRestartGroup.endReplaceableGroup();
                            throw new NoWhenBranchMatchedException();
                        }
                        composerStartRestartGroup.startReplaceableGroup(-54265040);
                        SpacerKt.Spacer(modifierWeight$default, composerStartRestartGroup, i2);
                        composerStartRestartGroup.endReplaceableGroup();
                    }
                }
                composerStartRestartGroup.endMovableGroup();
                i4 = i2;
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
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: o.uLA
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return C48288uLy.KWHzl(list, f, j, j2, i, (Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:102:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x02bd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void EZpvd(final C48283uLt c48283uLt, Modifier modifier, final long j, final long j2, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        Alignment.Horizontal horizontalAEQbTJ;
        Alignment.Companion companion;
        int iM5286getCentere0LSkKk;
        int i4;
        int i5;
        int currentCompositeKeyHash;
        Composer composerM2783constructorimpl;
        Function2<ComposeUiNode, java.lang.Integer, Unit> setCompositeKeyHash;
        java.lang.String strAhwBna;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1608821365);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(c48283uLt) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i6 = i2 & 2;
        if (i6 == 0) {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i2 & 4) == 0) {
                i3 |= MLKEMEngine.KyberPolyBytes;
            } else if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
                i3 |= composerStartRestartGroup.changed(j) ? 256 : 128;
            }
            if ((i2 & 8) == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                i3 |= composerStartRestartGroup.changed(j2) ? 2048 : 1024;
            }
            if ((i3 & 1171) == 1170 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i6 == 0 ? Modifier.Companion : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1608821365, i3, -1, "com.okinc.tradingbot.impl.botList.ui.shared.MetricCell (MetricsSectionComposable.kt:451)");
                }
                horizontalAEQbTJ = c48283uLt.AEQbTJ();
                companion = Alignment.Companion;
                if (Intrinsics.EZpvd(horizontalAEQbTJ, companion.getEnd())) {
                    iM5286getCentere0LSkKk = Intrinsics.EZpvd(horizontalAEQbTJ, companion.getCenterHorizontally()) ? TextAlign.Companion.m5286getCentere0LSkKk() : TextAlign.Companion.m5291getStarte0LSkKk();
                } else {
                    iM5286getCentere0LSkKk = TextAlign.Companion.m5287getEnde0LSkKk();
                }
                i4 = StateListAnimator.copydefault[c48283uLt.valueOf().ordinal()];
                if (i4 != 1) {
                    i5 = C52761wXj.LoaderManager.zLjUOn;
                } else {
                    if (i4 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i5 = C52761wXj.LoaderManager.gHZMYf;
                }
                Arrangement.HorizontalOrVertical horizontalOrVerticalM582spacedBy0680j_4 = Arrangement.INSTANCE.m582spacedBy0680j_4(androidx.compose.ui.unit.Dp.m5414constructorimpl(2));
                Alignment.Horizontal horizontalAEQbTJ2 = c48283uLt.AEQbTJ();
                composerStartRestartGroup.startReplaceableGroup(-483455358);
                MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(horizontalOrVerticalM582spacedBy0680j_4, horizontalAEQbTJ2, composerStartRestartGroup, 6);
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
                Function0<ComposeUiNode> constructor = companion2.getConstructor();
                yHO<SkippableUpdater<ComposeUiNode>, Composer, java.lang.Integer, Unit> yhoModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifier4);
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
                C52743wWs.OLrzqt(c48283uLt.KWHzl(), null, c48283uLt.copydefault(), c48283uLt.AYXKKw(), C52761wXj.LoaderManager.QOLQEE, j2, 0, null, null, TextAlign.m5279boximpl(iM5286getCentere0LSkKk), c48283uLt.OLrzqt(), composerStartRestartGroup, (i3 << 6) & 458752, 0, WebIndicator.MAX_DECELERATE_SPEED_DURATION);
                java.lang.String strGEmmrt = c48283uLt.gEmmrt();
                TextStyle textStyleOLrzqt = C52698wVa.OLrzqt(i5, null, composerStartRestartGroup, 0, 2);
                Color colorIsConnected = c48283uLt.isConnected();
                TextKt.m2072Text4IGK_g(strGEmmrt, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m5279boximpl(iM5286getCentere0LSkKk), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, textStyleOLrzqt.m4941copyv2rsoow((16777214 & 1) != 0 ? textStyleOLrzqt.spanStyle.m4882getColor0d7_KjU() : colorIsConnected == null ? colorIsConnected.m3159unboximpl() : j, (16777214 & 2) != 0 ? textStyleOLrzqt.spanStyle.m4883getFontSizeXSAIIZE() : 0L, (16777214 & 4) != 0 ? textStyleOLrzqt.spanStyle.getFontWeight() : null, (16777214 & 8) != 0 ? textStyleOLrzqt.spanStyle.m4884getFontStyle4Lr2A7w() : null, (16777214 & 16) != 0 ? textStyleOLrzqt.spanStyle.m4885getFontSynthesisZQGJjVo() : null, (16777214 & 32) != 0 ? textStyleOLrzqt.spanStyle.getFontFamily() : null, (16777214 & 64) != 0 ? textStyleOLrzqt.spanStyle.getFontFeatureSettings() : null, (16777214 & 128) != 0 ? textStyleOLrzqt.spanStyle.m4886getLetterSpacingXSAIIZE() : 0L, (16777214 & 256) != 0 ? textStyleOLrzqt.spanStyle.m4881getBaselineShift5SSeXJ0() : null, (16777214 & 512) != 0 ? textStyleOLrzqt.spanStyle.getTextGeometricTransform() : null, (16777214 & 1024) != 0 ? textStyleOLrzqt.spanStyle.getLocaleList() : null, (16777214 & 2048) != 0 ? textStyleOLrzqt.spanStyle.m4880getBackground0d7_KjU() : 0L, (16777214 & 4096) != 0 ? textStyleOLrzqt.spanStyle.getTextDecoration() : null, (16777214 & 8192) != 0 ? textStyleOLrzqt.spanStyle.getShadow() : null, (16777214 & 16384) != 0 ? textStyleOLrzqt.spanStyle.getDrawStyle() : null, (16777214 & 32768) != 0 ? textStyleOLrzqt.paragraphStyle.m4838getTextAlignbuA522U() : null, (16777214 & 65536) != 0 ? textStyleOLrzqt.paragraphStyle.m4840getTextDirectionmmuk1to() : null, (16777214 & 131072) != 0 ? textStyleOLrzqt.paragraphStyle.m4837getLineHeightXSAIIZE() : 0L, (16777214 & 262144) != 0 ? textStyleOLrzqt.paragraphStyle.getTextIndent() : null, (16777214 & 524288) != 0 ? textStyleOLrzqt.platformStyle : null, (16777214 & 1048576) != 0 ? textStyleOLrzqt.paragraphStyle.getLineHeightStyle() : null, (16777214 & 2097152) != 0 ? textStyleOLrzqt.paragraphStyle.m4835getLineBreakLgCVezo() : null, (16777214 & 4194304) != 0 ? textStyleOLrzqt.paragraphStyle.m4833getHyphensEaSxIns() : null, (16777214 & 8388608) != 0 ? textStyleOLrzqt.paragraphStyle.getTextMotion() : null), composerStartRestartGroup, 0, 0, 65022);
                strAhwBna = c48283uLt.AhwBna();
                composerStartRestartGroup.startReplaceableGroup(1406037837);
                if (strAhwBna != null) {
                    TextStyle textStyleOLrzqt2 = C52698wVa.OLrzqt(C52761wXj.LoaderManager.gHZMYf, null, composerStartRestartGroup, 0, 2);
                    Color colorDjBIcL = c48283uLt.djBIcL();
                    TextKt.m2072Text4IGK_g(strAhwBna, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m5279boximpl(iM5286getCentere0LSkKk), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, textStyleOLrzqt2.m4941copyv2rsoow((16777214 & 1) != 0 ? textStyleOLrzqt2.spanStyle.m4882getColor0d7_KjU() : colorDjBIcL != null ? colorDjBIcL.m3159unboximpl() : j, (16777214 & 2) != 0 ? textStyleOLrzqt2.spanStyle.m4883getFontSizeXSAIIZE() : 0L, (16777214 & 4) != 0 ? textStyleOLrzqt2.spanStyle.getFontWeight() : null, (16777214 & 8) != 0 ? textStyleOLrzqt2.spanStyle.m4884getFontStyle4Lr2A7w() : null, (16777214 & 16) != 0 ? textStyleOLrzqt2.spanStyle.m4885getFontSynthesisZQGJjVo() : null, (16777214 & 32) != 0 ? textStyleOLrzqt2.spanStyle.getFontFamily() : null, (16777214 & 64) != 0 ? textStyleOLrzqt2.spanStyle.getFontFeatureSettings() : null, (16777214 & 128) != 0 ? textStyleOLrzqt2.spanStyle.m4886getLetterSpacingXSAIIZE() : 0L, (16777214 & 256) != 0 ? textStyleOLrzqt2.spanStyle.m4881getBaselineShift5SSeXJ0() : null, (16777214 & 512) != 0 ? textStyleOLrzqt2.spanStyle.getTextGeometricTransform() : null, (16777214 & 1024) != 0 ? textStyleOLrzqt2.spanStyle.getLocaleList() : null, (16777214 & 2048) != 0 ? textStyleOLrzqt2.spanStyle.m4880getBackground0d7_KjU() : 0L, (16777214 & 4096) != 0 ? textStyleOLrzqt2.spanStyle.getTextDecoration() : null, (16777214 & 8192) != 0 ? textStyleOLrzqt2.spanStyle.getShadow() : null, (16777214 & 16384) != 0 ? textStyleOLrzqt2.spanStyle.getDrawStyle() : null, (16777214 & 32768) != 0 ? textStyleOLrzqt2.paragraphStyle.m4838getTextAlignbuA522U() : null, (16777214 & 65536) != 0 ? textStyleOLrzqt2.paragraphStyle.m4840getTextDirectionmmuk1to() : null, (16777214 & 131072) != 0 ? textStyleOLrzqt2.paragraphStyle.m4837getLineHeightXSAIIZE() : 0L, (16777214 & 262144) != 0 ? textStyleOLrzqt2.paragraphStyle.getTextIndent() : null, (16777214 & 524288) != 0 ? textStyleOLrzqt2.platformStyle : null, (16777214 & 1048576) != 0 ? textStyleOLrzqt2.paragraphStyle.getLineHeightStyle() : null, (16777214 & 2097152) != 0 ? textStyleOLrzqt2.paragraphStyle.m4835getLineBreakLgCVezo() : null, (16777214 & 4194304) != 0 ? textStyleOLrzqt2.paragraphStyle.m4833getHyphensEaSxIns() : null, (16777214 & 8388608) != 0 ? textStyleOLrzqt2.paragraphStyle.getTextMotion() : null), composerStartRestartGroup, 0, 0, 65022);
                }
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
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
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: o.uLB
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return C48288uLy.KWHzl(c48283uLt, modifier3, j, j2, i, i2, (Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 48;
        modifier2 = modifier;
        if ((i2 & 4) == 0) {
        }
        if ((i2 & 8) == 0) {
        }
        if ((i3 & 1171) == 1170) {
            if (i6 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            horizontalAEQbTJ = c48283uLt.AEQbTJ();
            companion = Alignment.Companion;
            if (Intrinsics.EZpvd(horizontalAEQbTJ, companion.getEnd())) {
            }
            i4 = StateListAnimator.copydefault[c48283uLt.valueOf().ordinal()];
            if (i4 != 1) {
            }
            Arrangement.HorizontalOrVertical horizontalOrVerticalM582spacedBy0680j_42 = Arrangement.INSTANCE.m582spacedBy0680j_4(androidx.compose.ui.unit.Dp.m5414constructorimpl(2));
            Alignment.Horizontal horizontalAEQbTJ22 = c48283uLt.AEQbTJ();
            composerStartRestartGroup.startReplaceableGroup(-483455358);
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(horizontalOrVerticalM582spacedBy0680j_42, horizontalAEQbTJ22, composerStartRestartGroup, 6);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion22 = ComposeUiNode.Companion;
            Function0<ComposeUiNode> constructor2 = companion22.getConstructor();
            yHO<SkippableUpdater<ComposeUiNode>, Composer, java.lang.Integer, Unit> yhoModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifier4);
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
                C52743wWs.OLrzqt(c48283uLt.KWHzl(), null, c48283uLt.copydefault(), c48283uLt.AYXKKw(), C52761wXj.LoaderManager.QOLQEE, j2, 0, null, null, TextAlign.m5279boximpl(iM5286getCentere0LSkKk), c48283uLt.OLrzqt(), composerStartRestartGroup, (i3 << 6) & 458752, 0, WebIndicator.MAX_DECELERATE_SPEED_DURATION);
                java.lang.String strGEmmrt2 = c48283uLt.gEmmrt();
                TextStyle textStyleOLrzqt3 = C52698wVa.OLrzqt(i5, null, composerStartRestartGroup, 0, 2);
                Color colorIsConnected2 = c48283uLt.isConnected();
                TextKt.m2072Text4IGK_g(strGEmmrt2, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m5279boximpl(iM5286getCentere0LSkKk), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, textStyleOLrzqt3.m4941copyv2rsoow((16777214 & 1) != 0 ? textStyleOLrzqt3.spanStyle.m4882getColor0d7_KjU() : colorIsConnected2 == null ? colorIsConnected2.m3159unboximpl() : j, (16777214 & 2) != 0 ? textStyleOLrzqt3.spanStyle.m4883getFontSizeXSAIIZE() : 0L, (16777214 & 4) != 0 ? textStyleOLrzqt3.spanStyle.getFontWeight() : null, (16777214 & 8) != 0 ? textStyleOLrzqt3.spanStyle.m4884getFontStyle4Lr2A7w() : null, (16777214 & 16) != 0 ? textStyleOLrzqt3.spanStyle.m4885getFontSynthesisZQGJjVo() : null, (16777214 & 32) != 0 ? textStyleOLrzqt3.spanStyle.getFontFamily() : null, (16777214 & 64) != 0 ? textStyleOLrzqt3.spanStyle.getFontFeatureSettings() : null, (16777214 & 128) != 0 ? textStyleOLrzqt3.spanStyle.m4886getLetterSpacingXSAIIZE() : 0L, (16777214 & 256) != 0 ? textStyleOLrzqt3.spanStyle.m4881getBaselineShift5SSeXJ0() : null, (16777214 & 512) != 0 ? textStyleOLrzqt3.spanStyle.getTextGeometricTransform() : null, (16777214 & 1024) != 0 ? textStyleOLrzqt3.spanStyle.getLocaleList() : null, (16777214 & 2048) != 0 ? textStyleOLrzqt3.spanStyle.m4880getBackground0d7_KjU() : 0L, (16777214 & 4096) != 0 ? textStyleOLrzqt3.spanStyle.getTextDecoration() : null, (16777214 & 8192) != 0 ? textStyleOLrzqt3.spanStyle.getShadow() : null, (16777214 & 16384) != 0 ? textStyleOLrzqt3.spanStyle.getDrawStyle() : null, (16777214 & 32768) != 0 ? textStyleOLrzqt3.paragraphStyle.m4838getTextAlignbuA522U() : null, (16777214 & 65536) != 0 ? textStyleOLrzqt3.paragraphStyle.m4840getTextDirectionmmuk1to() : null, (16777214 & 131072) != 0 ? textStyleOLrzqt3.paragraphStyle.m4837getLineHeightXSAIIZE() : 0L, (16777214 & 262144) != 0 ? textStyleOLrzqt3.paragraphStyle.getTextIndent() : null, (16777214 & 524288) != 0 ? textStyleOLrzqt3.platformStyle : null, (16777214 & 1048576) != 0 ? textStyleOLrzqt3.paragraphStyle.getLineHeightStyle() : null, (16777214 & 2097152) != 0 ? textStyleOLrzqt3.paragraphStyle.m4835getLineBreakLgCVezo() : null, (16777214 & 4194304) != 0 ? textStyleOLrzqt3.paragraphStyle.m4833getHyphensEaSxIns() : null, (16777214 & 8388608) != 0 ? textStyleOLrzqt3.paragraphStyle.getTextMotion() : null), composerStartRestartGroup, 0, 0, 65022);
                strAhwBna = c48283uLt.AhwBna();
                composerStartRestartGroup.startReplaceableGroup(1406037837);
                if (strAhwBna != null) {
                }
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier3 = modifier4;
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }
}
