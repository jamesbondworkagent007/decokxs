package o;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.text.InlineTextContent;
import androidx.compose.foundation.text.InlineTextContentKt;
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
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.Placeholder;
import androidx.compose.ui.text.PlaceholderVerticalAlign;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Density;
import com.okinc.business.defi.biz.core.error.WalletImportError;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class uHB {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final Unit AEQbTJ(Modifier modifier, yHO yho, int i, int i2, Composer composer, int i3) {
        AEQbTJ(modifier, yho, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final Unit AEQbTJ(java.lang.String str, java.lang.String str2, Modifier modifier, boolean z, Function0 function0, int i, int i2, Composer composer, int i3) {
        KWHzl(str, str2, modifier, z, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final void AEQbTJ(final Modifier modifier, @NotNull final yHO<? super ColumnScope, ? super Composer, ? super java.lang.Integer, Unit> yho, Composer composer, final int i, final int i2) {
        int i3;
        Intrinsics.checkNotNullParameter(yho, "");
        Composer composerStartRestartGroup = composer.startRestartGroup(1937615161);
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
            i3 |= composerStartRestartGroup.changedInstance(yho) ? 32 : 16;
        }
        if ((i3 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (i4 != 0) {
                modifier = Modifier.Companion;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1937615161, i3, -1, "com.okinc.tradingbot.impl.botDetail.ui.BotDetailSection (BotDetailCommonComposable.kt:34)");
            }
            Modifier modifierM672paddingVpY3zN4 = PaddingKt.m672paddingVpY3zN4(uHG.KWHzl(SizeKt.fillMaxWidth$default(modifier, 0.0f, 1, null), composerStartRestartGroup, 0), androidx.compose.ui.unit.Dp.m5414constructorimpl(12), androidx.compose.ui.unit.Dp.m5414constructorimpl(16));
            Arrangement.HorizontalOrVertical horizontalOrVerticalM582spacedBy0680j_4 = Arrangement.INSTANCE.m582spacedBy0680j_4(androidx.compose.ui.unit.Dp.m5414constructorimpl(24));
            int i5 = ((i3 << 6) & 7168) | 48;
            composerStartRestartGroup.startReplaceableGroup(-483455358);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(horizontalOrVerticalM582spacedBy0680j_4, Alignment.Companion.getStart(), composerStartRestartGroup, 6);
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
            Updater.m2790setimpl(composerM2783constructorimpl, measurePolicyColumnMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m2790setimpl(composerM2783constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, java.lang.Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (composerM2783constructorimpl.getInserting() || !Intrinsics.EZpvd(composerM2783constructorimpl.rememberedValue(), java.lang.Integer.valueOf(currentCompositeKeyHash))) {
                composerM2783constructorimpl.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash));
                composerM2783constructorimpl.apply(java.lang.Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            yhoModifierMaterializerOf.invoke(SkippableUpdater.m2774boximpl(SkippableUpdater.m2775constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            yho.invoke(ColumnScopeInstance.INSTANCE, composerStartRestartGroup, java.lang.Integer.valueOf(((i5 >> 6) & WalletImportError.ERROR_CODE_AA_EXIST) | 6));
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
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: o.uHF
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return uHB.AEQbTJ(modifier, yho, i, i2, (Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x034c  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x035b  */
    /* JADX WARN: Removed duplicated region for block: B:134:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x020a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void KWHzl(@NotNull final java.lang.String str, @NotNull final java.lang.String str2, Modifier modifier, boolean z, Function0<Unit> function0, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        boolean z2;
        int i5;
        Function0<Unit> function02;
        boolean z3;
        int currentCompositeKeyHash;
        Composer composerM2783constructorimpl;
        Function2<ComposeUiNode, java.lang.Integer, Unit> setCompositeKeyHash;
        Function0<Unit> function03;
        Composer composer2;
        boolean z4;
        boolean z5;
        java.lang.Object objRememberedValue;
        int i6;
        int i7;
        int i8;
        boolean zChanged;
        java.lang.Object objRememberedValue2;
        java.util.Map mapKWHzl;
        Modifier modifierEZpvd;
        final boolean z6;
        final Function0<Unit> function04;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1304415265);
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
        int i9 = i2 & 4;
        if (i9 != 0) {
            i3 |= MLKEMEngine.KyberPolyBytes;
        } else {
            if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else {
                if ((i & 3072) == 0) {
                    z2 = z;
                    i3 |= composerStartRestartGroup.changed(z2) ? 2048 : 1024;
                }
                i5 = i2 & 16;
                if (i5 == 0) {
                    if ((i & 24576) == 0) {
                        function02 = function0;
                        i3 |= composerStartRestartGroup.changedInstance(function02) ? 16384 : 8192;
                    }
                    if ((i3 & 9363) == 9362 || !composerStartRestartGroup.getSkipping()) {
                        Modifier modifier4 = i9 == 0 ? Modifier.Companion : modifier2;
                        z3 = i4 == 0 ? false : z2;
                        if (i5 != 0) {
                            function02 = null;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1304415265, i3, -1, "com.okinc.tradingbot.impl.botDetail.ui.BotDetailItemRow (BotDetailCommonComposable.kt:52)");
                        }
                        final androidx.compose.runtime.State stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(function02, composerStartRestartGroup, (i3 >> 12) & 14);
                        Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null);
                        float f = 16;
                        Arrangement.HorizontalOrVertical horizontalOrVerticalM582spacedBy0680j_4 = Arrangement.INSTANCE.m582spacedBy0680j_4(androidx.compose.ui.unit.Dp.m5414constructorimpl(f));
                        composerStartRestartGroup.startReplaceableGroup(693286680);
                        MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(horizontalOrVerticalM582spacedBy0680j_4, Alignment.Companion.getTop(), composerStartRestartGroup, 6);
                        composerStartRestartGroup.startReplaceableGroup(-1323940314);
                        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        ComposeUiNode.Companion companion = ComposeUiNode.Companion;
                        Function0<ComposeUiNode> constructor = companion.getConstructor();
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
                        Updater.m2790setimpl(composerM2783constructorimpl, measurePolicyRowMeasurePolicy, companion.getSetMeasurePolicy());
                        Updater.m2790setimpl(composerM2783constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                        setCompositeKeyHash = companion.getSetCompositeKeyHash();
                        if (!composerM2783constructorimpl.getInserting() || !Intrinsics.EZpvd(composerM2783constructorimpl.rememberedValue(), java.lang.Integer.valueOf(currentCompositeKeyHash))) {
                            composerM2783constructorimpl.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash));
                            composerM2783constructorimpl.apply(java.lang.Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        yhoModifierMaterializerOf.invoke(SkippableUpdater.m2774boximpl(SkippableUpdater.m2775constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(2058660585);
                        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                        Modifier.Companion companion2 = Modifier.Companion;
                        int i10 = i3;
                        function03 = function02;
                        Modifier modifier5 = modifier4;
                        TextKt.m2072Text4IGK_g(str, rowScopeInstance.alignByBaseline(RowScope.weight$default(rowScopeInstance, companion2, 1.0f, false, 2, null)), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, C52698wVa.OLrzqt(C52761wXj.LoaderManager.gHZMYf, java.lang.Integer.valueOf(C52761wXj.Activity.fdOvFl), composerStartRestartGroup, 0, 0), composerStartRestartGroup, i10 & 14, 0, 65532);
                        composer2 = composerStartRestartGroup;
                        Density density = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                        composer2.startReplaceableGroup(1356091474);
                        z4 = (i10 & WalletImportError.ERROR_CODE_AA_EXIST) != 32;
                        int i11 = i10 & 7168;
                        z5 = i11 != 2048;
                        objRememberedValue = composer2.rememberedValue();
                        if ((!z5 && !z4) || objRememberedValue == Composer.Companion.getEmpty()) {
                            i6 = 0;
                            i7 = 1;
                            AnnotatedString.Builder builder = new AnnotatedString.Builder(0, 1, null);
                            builder.append(str2);
                            if (z3) {
                                builder.append(" ");
                                InlineTextContentKt.appendInlineContent$default(builder, "chevron", null, 2, null);
                            }
                            objRememberedValue = builder.toAnnotatedString();
                            composer2.updateRememberedValue(objRememberedValue);
                        } else {
                            i6 = 0;
                            i7 = 1;
                        }
                        AnnotatedString annotatedString = (AnnotatedString) objRememberedValue;
                        composer2.endReplaceableGroup();
                        composer2.startReplaceableGroup(1356101191);
                        i8 = i11 != 2048 ? i7 : i6;
                        zChanged = composer2.changed(density);
                        objRememberedValue2 = composer2.rememberedValue();
                        if (((zChanged ? 1 : 0) | i8) == 0 || objRememberedValue2 == Composer.Companion.getEmpty()) {
                            if (!z3) {
                                mapKWHzl = C56423yEv.EZpvd(C56390yDp.OLrzqt("chevron", new InlineTextContent(new Placeholder(density.mo518toSp0xMU5do(androidx.compose.ui.unit.Dp.m5414constructorimpl(f)), density.mo518toSp0xMU5do(androidx.compose.ui.unit.Dp.m5414constructorimpl(f)), PlaceholderVerticalAlign.Companion.m4858getTextCenterJ6kI3mc(), null), C48184uIb.EZpvd.KWHzl())));
                            } else {
                                mapKWHzl = C56424yEw.KWHzl();
                            }
                            objRememberedValue2 = mapKWHzl;
                            composer2.updateRememberedValue(objRememberedValue2);
                        }
                        java.util.Map map = (java.util.Map) objRememberedValue2;
                        composer2.endReplaceableGroup();
                        Modifier modifierAlignByBaseline = rowScopeInstance.alignByBaseline(RowScope.weight$default(rowScopeInstance, companion2, 1.0f, false, 2, null));
                        composer2.startReplaceableGroup(1356132732);
                        if (function03 == null) {
                            composer2.startReplaceableGroup(1356135221);
                            boolean zChanged2 = composer2.changed(stateRememberUpdatedState);
                            java.lang.Object objRememberedValue3 = composer2.rememberedValue();
                            if (zChanged2 || objRememberedValue3 == Composer.Companion.getEmpty()) {
                                objRememberedValue3 = new Function0() { // from class: o.uHD
                                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                    @Override // kotlin.jvm.functions.Function0
                                    public final java.lang.Object invoke() {
                                        return uHB.AEQbTJ(stateRememberUpdatedState);
                                    }
                                };
                                composer2.updateRememberedValue(objRememberedValue3);
                            }
                            composer2.endReplaceableGroup();
                            modifierEZpvd = C49551uqg.EZpvd(companion2, (Function0) objRememberedValue3);
                        } else {
                            modifierEZpvd = companion2;
                        }
                        composer2.endReplaceableGroup();
                        TextKt.m2073TextIbK3jfQ(annotatedString, modifierAlignByBaseline.then(modifierEZpvd), 0L, 0L, null, null, null, 0L, null, TextAlign.m5279boximpl(TextAlign.Companion.m5287getEnde0LSkKk()), 0L, 0, false, 0, 0, map, null, C52698wVa.OLrzqt(C52761wXj.LoaderManager.gHZMYf, java.lang.Integer.valueOf(C52761wXj.Activity.fdOvFl), composer2, i6, i6), composer2, 0, 0, 97788);
                        composer2.endReplaceableGroup();
                        composer2.endNode();
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        z6 = z3;
                        function04 = function03;
                        modifier3 = modifier5;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        modifier3 = modifier2;
                        z6 = z2;
                        function04 = function02;
                        composer2 = composerStartRestartGroup;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: o.uHC
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function2
                            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                return uHB.AEQbTJ(str, str2, modifier3, z6, function04, i, i2, (Composer) obj, ((java.lang.Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                i3 |= 24576;
                function02 = function0;
                if ((i3 & 9363) == 9362) {
                    if (i9 == 0) {
                    }
                    if (i4 == 0) {
                    }
                    if (i5 != 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    final androidx.compose.runtime.State stateRememberUpdatedState2 = SnapshotStateKt.rememberUpdatedState(function02, composerStartRestartGroup, (i3 >> 12) & 14);
                    Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null);
                    float f2 = 16;
                    Arrangement.HorizontalOrVertical horizontalOrVerticalM582spacedBy0680j_42 = Arrangement.INSTANCE.m582spacedBy0680j_4(androidx.compose.ui.unit.Dp.m5414constructorimpl(f2));
                    composerStartRestartGroup.startReplaceableGroup(693286680);
                    MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(horizontalOrVerticalM582spacedBy0680j_42, Alignment.Companion.getTop(), composerStartRestartGroup, 6);
                    composerStartRestartGroup.startReplaceableGroup(-1323940314);
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
                    Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                    yHO<SkippableUpdater<ComposeUiNode>, Composer, java.lang.Integer, Unit> yhoModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierFillMaxWidth$default2);
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (!composerStartRestartGroup.getInserting()) {
                    }
                    composerM2783constructorimpl = Updater.m2783constructorimpl(composerStartRestartGroup);
                    Updater.m2790setimpl(composerM2783constructorimpl, measurePolicyRowMeasurePolicy2, companion3.getSetMeasurePolicy());
                    Updater.m2790setimpl(composerM2783constructorimpl, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                    setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                    if (!composerM2783constructorimpl.getInserting()) {
                        composerM2783constructorimpl.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash));
                        composerM2783constructorimpl.apply(java.lang.Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        yhoModifierMaterializerOf2.invoke(SkippableUpdater.m2774boximpl(SkippableUpdater.m2775constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(2058660585);
                        RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                        Modifier.Companion companion22 = Modifier.Companion;
                        int i102 = i3;
                        function03 = function02;
                        Modifier modifier52 = modifier4;
                        TextKt.m2072Text4IGK_g(str, rowScopeInstance2.alignByBaseline(RowScope.weight$default(rowScopeInstance2, companion22, 1.0f, false, 2, null)), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, C52698wVa.OLrzqt(C52761wXj.LoaderManager.gHZMYf, java.lang.Integer.valueOf(C52761wXj.Activity.fdOvFl), composerStartRestartGroup, 0, 0), composerStartRestartGroup, i102 & 14, 0, 65532);
                        composer2 = composerStartRestartGroup;
                        Density density2 = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                        composer2.startReplaceableGroup(1356091474);
                        if ((i102 & WalletImportError.ERROR_CODE_AA_EXIST) != 32) {
                        }
                        int i112 = i102 & 7168;
                        if (i112 != 2048) {
                        }
                        objRememberedValue = composer2.rememberedValue();
                        if (!(z5 | z4)) {
                            i6 = 0;
                            i7 = 1;
                            AnnotatedString.Builder builder2 = new AnnotatedString.Builder(0, 1, null);
                            builder2.append(str2);
                            if (z3) {
                            }
                            objRememberedValue = builder2.toAnnotatedString();
                            composer2.updateRememberedValue(objRememberedValue);
                            AnnotatedString annotatedString2 = (AnnotatedString) objRememberedValue;
                            composer2.endReplaceableGroup();
                            composer2.startReplaceableGroup(1356101191);
                            if (i112 != 2048) {
                            }
                            zChanged = composer2.changed(density2);
                            objRememberedValue2 = composer2.rememberedValue();
                            if (((zChanged ? 1 : 0) | i8) == 0) {
                                if (!z3) {
                                }
                                objRememberedValue2 = mapKWHzl;
                                composer2.updateRememberedValue(objRememberedValue2);
                                java.util.Map map2 = (java.util.Map) objRememberedValue2;
                                composer2.endReplaceableGroup();
                                Modifier modifierAlignByBaseline2 = rowScopeInstance2.alignByBaseline(RowScope.weight$default(rowScopeInstance2, companion22, 1.0f, false, 2, null));
                                composer2.startReplaceableGroup(1356132732);
                                if (function03 == null) {
                                }
                                composer2.endReplaceableGroup();
                                TextKt.m2073TextIbK3jfQ(annotatedString2, modifierAlignByBaseline2.then(modifierEZpvd), 0L, 0L, null, null, null, 0L, null, TextAlign.m5279boximpl(TextAlign.Companion.m5287getEnde0LSkKk()), 0L, 0, false, 0, 0, map2, null, C52698wVa.OLrzqt(C52761wXj.LoaderManager.gHZMYf, java.lang.Integer.valueOf(C52761wXj.Activity.fdOvFl), composer2, i6, i6), composer2, 0, 0, 97788);
                                composer2.endReplaceableGroup();
                                composer2.endNode();
                                composer2.endReplaceableGroup();
                                composer2.endReplaceableGroup();
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                z6 = z3;
                                function04 = function03;
                                modifier3 = modifier52;
                            }
                        }
                    }
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            z2 = z;
            i5 = i2 & 16;
            if (i5 == 0) {
            }
            function02 = function0;
            if ((i3 & 9363) == 9362) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        z2 = z;
        i5 = i2 & 16;
        if (i5 == 0) {
        }
        function02 = function0;
        if ((i3 & 9363) == 9362) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    public static final Unit AEQbTJ(androidx.compose.runtime.State state) {
        Function0 function0 = (Function0) state.getValue();
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }
}
