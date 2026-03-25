package o;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
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
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.res.ColorResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.viewinterop.AndroidView_androidKt;
import com.amplifyframework.ui.liveness.ml.FaceDetector;
import com.engagelab.privates.common.constants.MTCommonConstants;
import com.github.mikephil.charting.components.IMarker;
import com.google.android.exoplayer2.audio.WavUtil;
import com.okinc.tradingbot.impl.widget.compose.HelperLabelType;
import com.okinc.unify_trade.biz.StrategyProfitResponse;
import com.okinc.unify_trade.bot.data.TacticsData;
import com.okinc.unify_trade.bot.util.TacticsListButtonItem;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.C48033uCm;
import o.C52761wXj;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import org.jetbrains.annotations.NotNull;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: loaded from: classes11.dex */
public final class uKZ {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final Unit AEQbTJ(Modifier modifier, java.util.List list, Function0 function0, yHO yho, Function2 function2, int i, int i2, Composer composer, int i3) {
        AEQbTJ(modifier, (java.util.List<TacticsListButtonItem>) list, (Function0<TacticsData>) function0, (yHO<? super java.lang.String, ? super TacticsData, ? super Function0<Unit>, Unit>) yho, (Function2<? super java.lang.String, ? super TacticsData, Unit>) function2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final Unit AEQbTJ(java.lang.String str, java.util.List list, C48264uLa c48264uLa, Modifier modifier, int i, int i2, Composer composer, int i3) {
        KWHzl(str, list, c48264uLa, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final Unit EZpvd(uJI uji, Modifier modifier, boolean z, int i, int i2, Composer composer, int i3) {
        copydefault(uji, modifier, z, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final Unit KWHzl(java.lang.String str, Modifier modifier, int i, int i2, Composer composer, int i3) {
        OLrzqt(str, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final Unit copydefault(java.lang.String str, java.util.List list, C48264uLa c48264uLa, Modifier modifier, int i, int i2, Composer composer, int i3) {
        KWHzl(str, list, c48264uLa, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void OLrzqt(@NotNull final java.lang.String str, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        final Modifier modifier2;
        java.lang.String strStringResource;
        Composer composer2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(str, "");
        Composer composerStartRestartGroup = composer.startRestartGroup(-563396721);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 == 0) {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i3 & 19) == 18 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier3 = i4 == 0 ? Modifier.Companion : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-563396721, i3, -1, "com.okinc.tradingbot.impl.botList.ui.shared.InstrumentTag (BotSharedComponentsComposable.kt:53)");
                }
                if (!Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "SWAP")) {
                    composerStartRestartGroup.startReplaceableGroup(1829031958);
                    strStringResource = StringResources_androidKt.stringResource(C48033uCm.Fragment.UccSpe, composerStartRestartGroup, 0);
                    composerStartRestartGroup.endReplaceableGroup();
                } else if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "SPOT")) {
                    composerStartRestartGroup.startReplaceableGroup(1829034709);
                    strStringResource = StringResources_androidKt.stringResource(C48033uCm.Fragment.zKcAg, composerStartRestartGroup, 0);
                    composerStartRestartGroup.endReplaceableGroup();
                } else {
                    composerStartRestartGroup.startReplaceableGroup(865574708);
                    composerStartRestartGroup.endReplaceableGroup();
                    strStringResource = "--";
                }
                float f = 4;
                Modifier modifier4 = modifier3;
                composer2 = composerStartRestartGroup;
                TextKt.m2072Text4IGK_g(strStringResource, PaddingKt.m672paddingVpY3zN4(BackgroundKt.m349backgroundbw27NRU(modifier3, ColorResources_androidKt.colorResource(C52761wXj.Activity.invokespecialDPHOMC, composerStartRestartGroup, 0), RoundedCornerShapeKt.m924RoundedCornerShape0680j_4(androidx.compose.ui.unit.Dp.m5414constructorimpl(f))), androidx.compose.ui.unit.Dp.m5414constructorimpl(f), androidx.compose.ui.unit.Dp.m5414constructorimpl(2)), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, C52698wVa.OLrzqt(C52761wXj.LoaderManager.QUSxYX, java.lang.Integer.valueOf(C52761wXj.Activity.Dmq), composerStartRestartGroup, 0, 0), composer2, 0, 0, 65532);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = modifier4;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                composer2 = composerStartRestartGroup;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: o.uLl
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return uKZ.KWHzl(str, modifier2, i, i2, (Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 48;
        modifier2 = modifier;
        if ((i3 & 19) == 18) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            if (!Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "SWAP")) {
            }
            float f2 = 4;
            Modifier modifier42 = modifier3;
            composer2 = composerStartRestartGroup;
            TextKt.m2072Text4IGK_g(strStringResource, PaddingKt.m672paddingVpY3zN4(BackgroundKt.m349backgroundbw27NRU(modifier3, ColorResources_androidKt.colorResource(C52761wXj.Activity.invokespecialDPHOMC, composerStartRestartGroup, 0), RoundedCornerShapeKt.m924RoundedCornerShape0680j_4(androidx.compose.ui.unit.Dp.m5414constructorimpl(f2))), androidx.compose.ui.unit.Dp.m5414constructorimpl(f2), androidx.compose.ui.unit.Dp.m5414constructorimpl(2)), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, C52698wVa.OLrzqt(C52761wXj.LoaderManager.QUSxYX, java.lang.Integer.valueOf(C52761wXj.Activity.Dmq), composerStartRestartGroup, 0, 0), composer2, 0, 0, 65532);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier2 = modifier42;
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:85:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void copydefault(@NotNull final uJI uji, Modifier modifier, final boolean z, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        Modifier modifier3;
        int currentCompositeKeyHash;
        Composer composerM2783constructorimpl;
        Function2<ComposeUiNode, java.lang.Integer, Unit> setCompositeKeyHash;
        int currentCompositeKeyHash2;
        Composer composerM2783constructorimpl2;
        Function2<ComposeUiNode, java.lang.Integer, Unit> setCompositeKeyHash2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(uji, "");
        Composer composerStartRestartGroup = composer.startRestartGroup(692716301);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(uji) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 == 0) {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i2 & 4) == 0) {
                i3 |= MLKEMEngine.KyberPolyBytes;
            } else if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
                i3 |= composerStartRestartGroup.changed(z) ? 256 : 128;
            }
            if ((i3 & CipherSuite.TLS_RSA_PSK_WITH_3DES_EDE_CBC_SHA) == 146 || !composerStartRestartGroup.getSkipping()) {
                modifier3 = i4 == 0 ? Modifier.Companion : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(692716301, i3, -1, "com.okinc.tradingbot.impl.botList.ui.shared.AiModelColumn (BotSharedComponentsComposable.kt:79)");
                }
                Arrangement arrangement = Arrangement.INSTANCE;
                Arrangement.HorizontalOrVertical horizontalOrVerticalM582spacedBy0680j_4 = arrangement.m582spacedBy0680j_4(androidx.compose.ui.unit.Dp.m5414constructorimpl(2));
                Alignment.Companion companion = Alignment.Companion;
                Alignment.Horizontal end = !z ? companion.getEnd() : companion.getStart();
                composerStartRestartGroup.startReplaceableGroup(-483455358);
                MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(horizontalOrVerticalM582spacedBy0680j_4, end, composerStartRestartGroup, 6);
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
                Function0<ComposeUiNode> constructor = companion2.getConstructor();
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
                C52743wWs.OLrzqt(StringResources_androidKt.stringResource(C48033uCm.Fragment.ffGIBT, composerStartRestartGroup, 0), null, HelperLabelType.Regular, null, C52761wXj.LoaderManager.QOLQEE, ColorResources_androidKt.colorResource(C52761wXj.Activity.QwvEab, composerStartRestartGroup, 0), 0, null, null, null, null, composerStartRestartGroup, MLKEMEngine.KyberPolyBytes, 0, MTCommonConstants.RemoteWhat.TO_BACKGROUND);
                float fM5414constructorimpl = androidx.compose.ui.unit.Dp.m5414constructorimpl(4);
                Alignment.Companion companion3 = Alignment.Companion;
                Arrangement.Horizontal horizontalM583spacedByD5KLDUw = arrangement.m583spacedByD5KLDUw(fM5414constructorimpl, !z ? companion3.getEnd() : companion3.getStart());
                Alignment.Vertical centerVertically = Alignment.Companion.getCenterVertically();
                composerStartRestartGroup.startReplaceableGroup(693286680);
                Modifier.Companion companion4 = Modifier.Companion;
                MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(horizontalM583spacedByD5KLDUw, centerVertically, composerStartRestartGroup, 48);
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
                yHO<SkippableUpdater<ComposeUiNode>, Composer, java.lang.Integer, Unit> yhoModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(companion4);
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
                Updater.m2790setimpl(composerM2783constructorimpl2, measurePolicyRowMeasurePolicy, companion2.getSetMeasurePolicy());
                Updater.m2790setimpl(composerM2783constructorimpl2, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
                setCompositeKeyHash2 = companion2.getSetCompositeKeyHash();
                if (!composerM2783constructorimpl2.getInserting() || !Intrinsics.EZpvd(composerM2783constructorimpl2.rememberedValue(), java.lang.Integer.valueOf(currentCompositeKeyHash2))) {
                    composerM2783constructorimpl2.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash2));
                    composerM2783constructorimpl2.apply(java.lang.Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                }
                yhoModifierMaterializerOf2.invoke(SkippableUpdater.m2774boximpl(SkippableUpdater.m2775constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(2058660585);
                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                C52727wWc.OLrzqt(BackgroundKt.m350backgroundbw27NRU$default(ClipKt.clip(PaddingKt.m671padding3ABfNKs(BorderKt.m361borderxT4_qwU(SizeKt.m718size3ABfNKs(companion4, androidx.compose.ui.unit.Dp.m5414constructorimpl(16)), androidx.compose.ui.unit.Dp.m5414constructorimpl(1), ColorResources_androidKt.colorResource(C52761wXj.Activity.iUnTnt, composerStartRestartGroup, 0), RoundedCornerShapeKt.getCircleShape()), androidx.compose.ui.unit.Dp.m5414constructorimpl((float) 0.5d)), RoundedCornerShapeKt.getCircleShape()), ColorResources_androidKt.colorResource(C52761wXj.Activity.invokespecialODCBUN, composerStartRestartGroup, 0), null, 2, null), uji.AEQbTJ(), 0, composerStartRestartGroup, 0, 4);
                TextKt.m2072Text4IGK_g(uji.OLrzqt(), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, C52698wVa.OLrzqt(C52761wXj.LoaderManager.gHZMYf, null, composerStartRestartGroup, 0, 2), composerStartRestartGroup, 0, 0, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE);
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
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                final Modifier modifier4 = modifier3;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: o.uLq
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return uKZ.EZpvd(uji, modifier4, z, i, i2, (Composer) obj, ((java.lang.Integer) obj2).intValue());
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
        if ((i3 & CipherSuite.TLS_RSA_PSK_WITH_3DES_EDE_CBC_SHA) == 146) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            Arrangement arrangement2 = Arrangement.INSTANCE;
            Arrangement.HorizontalOrVertical horizontalOrVerticalM582spacedBy0680j_42 = arrangement2.m582spacedBy0680j_4(androidx.compose.ui.unit.Dp.m5414constructorimpl(2));
            Alignment.Companion companion5 = Alignment.Companion;
            if (!z) {
            }
            composerStartRestartGroup.startReplaceableGroup(-483455358);
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(horizontalOrVerticalM582spacedBy0680j_42, end, composerStartRestartGroup, 6);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion22 = ComposeUiNode.Companion;
            Function0<ComposeUiNode> constructor3 = companion22.getConstructor();
            yHO<SkippableUpdater<ComposeUiNode>, Composer, java.lang.Integer, Unit> yhoModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(modifier3);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
            }
            composerStartRestartGroup.startReusableNode();
            if (!composerStartRestartGroup.getInserting()) {
            }
            composerM2783constructorimpl = Updater.m2783constructorimpl(composerStartRestartGroup);
            Updater.m2790setimpl(composerM2783constructorimpl, measurePolicyColumnMeasurePolicy2, companion22.getSetMeasurePolicy());
            Updater.m2790setimpl(composerM2783constructorimpl, currentCompositionLocalMap3, companion22.getSetResolvedCompositionLocals());
            setCompositeKeyHash = companion22.getSetCompositeKeyHash();
            if (!composerM2783constructorimpl.getInserting()) {
                composerM2783constructorimpl.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash));
                composerM2783constructorimpl.apply(java.lang.Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                yhoModifierMaterializerOf3.invoke(SkippableUpdater.m2774boximpl(SkippableUpdater.m2775constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(2058660585);
                ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                C52743wWs.OLrzqt(StringResources_androidKt.stringResource(C48033uCm.Fragment.ffGIBT, composerStartRestartGroup, 0), null, HelperLabelType.Regular, null, C52761wXj.LoaderManager.QOLQEE, ColorResources_androidKt.colorResource(C52761wXj.Activity.QwvEab, composerStartRestartGroup, 0), 0, null, null, null, null, composerStartRestartGroup, MLKEMEngine.KyberPolyBytes, 0, MTCommonConstants.RemoteWhat.TO_BACKGROUND);
                float fM5414constructorimpl2 = androidx.compose.ui.unit.Dp.m5414constructorimpl(4);
                Alignment.Companion companion32 = Alignment.Companion;
                Arrangement.Horizontal horizontalM583spacedByD5KLDUw2 = arrangement2.m583spacedByD5KLDUw(fM5414constructorimpl2, !z ? companion32.getEnd() : companion32.getStart());
                Alignment.Vertical centerVertically2 = Alignment.Companion.getCenterVertically();
                composerStartRestartGroup.startReplaceableGroup(693286680);
                Modifier.Companion companion42 = Modifier.Companion;
                MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(horizontalM583spacedByD5KLDUw2, centerVertically2, composerStartRestartGroup, 48);
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap22 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Function0<ComposeUiNode> constructor22 = companion22.getConstructor();
                yHO<SkippableUpdater<ComposeUiNode>, Composer, java.lang.Integer, Unit> yhoModifierMaterializerOf22 = LayoutKt.modifierMaterializerOf(companion42);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                }
                composerStartRestartGroup.startReusableNode();
                if (!composerStartRestartGroup.getInserting()) {
                }
                composerM2783constructorimpl2 = Updater.m2783constructorimpl(composerStartRestartGroup);
                Updater.m2790setimpl(composerM2783constructorimpl2, measurePolicyRowMeasurePolicy2, companion22.getSetMeasurePolicy());
                Updater.m2790setimpl(composerM2783constructorimpl2, currentCompositionLocalMap22, companion22.getSetResolvedCompositionLocals());
                setCompositeKeyHash2 = companion22.getSetCompositeKeyHash();
                if (!composerM2783constructorimpl2.getInserting()) {
                    composerM2783constructorimpl2.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash2));
                    composerM2783constructorimpl2.apply(java.lang.Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                    yhoModifierMaterializerOf22.invoke(SkippableUpdater.m2774boximpl(SkippableUpdater.m2775constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(2058660585);
                    RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                    C52727wWc.OLrzqt(BackgroundKt.m350backgroundbw27NRU$default(ClipKt.clip(PaddingKt.m671padding3ABfNKs(BorderKt.m361borderxT4_qwU(SizeKt.m718size3ABfNKs(companion42, androidx.compose.ui.unit.Dp.m5414constructorimpl(16)), androidx.compose.ui.unit.Dp.m5414constructorimpl(1), ColorResources_androidKt.colorResource(C52761wXj.Activity.iUnTnt, composerStartRestartGroup, 0), RoundedCornerShapeKt.getCircleShape()), androidx.compose.ui.unit.Dp.m5414constructorimpl((float) 0.5d)), RoundedCornerShapeKt.getCircleShape()), ColorResources_androidKt.colorResource(C52761wXj.Activity.invokespecialODCBUN, composerStartRestartGroup, 0), null, 2, null), uji.AEQbTJ(), 0, composerStartRestartGroup, 0, 4);
                    TextKt.m2072Text4IGK_g(uji.OLrzqt(), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, C52698wVa.OLrzqt(C52761wXj.LoaderManager.gHZMYf, null, composerStartRestartGroup, 0, 2), composerStartRestartGroup, 0, 0, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE);
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

    /* JADX WARN: Removed duplicated region for block: B:128:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:131:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00ce  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void KWHzl(@NotNull final java.lang.String str, @NotNull final java.util.List<StrategyProfitResponse> list, @NotNull final C48264uLa c48264uLa, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        final Modifier modifier2;
        int i4;
        Composer composer2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(c48264uLa, "");
        Composer composerStartRestartGroup = composer.startRestartGroup(1480414334);
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
            i3 |= composerStartRestartGroup.changedInstance(list) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= MLKEMEngine.KyberPolyBytes;
        } else if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i3 |= composerStartRestartGroup.changed(c48264uLa) ? 256 : 128;
        }
        int i5 = i2 & 8;
        if (i5 == 0) {
            if ((i & 3072) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
            }
            i4 = i3;
            if ((i4 & 1171) == 1170 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier3 = i5 == 0 ? Modifier.Companion : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1480414334, i4, -1, "com.okinc.tradingbot.impl.botList.ui.shared.BotLineChart (BotSharedComponentsComposable.kt:163)");
                }
                if (!list.isEmpty()) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    ScopeUpdateScope scopeUpdateScopeEndRestartGroup2 = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup2 != null) {
                        final Modifier modifier4 = modifier3;
                        scopeUpdateScopeEndRestartGroup2.updateScope(new Function2() { // from class: o.uLh
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function2
                            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                return uKZ.AEQbTJ(str, list, c48264uLa, modifier4, i, i2, (Composer) obj, ((java.lang.Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                final android.content.Context context = (android.content.Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                java.lang.String strCopydefault = c48264uLa.copydefault();
                composerStartRestartGroup.startReplaceableGroup(-986730226);
                boolean zChanged = composerStartRestartGroup.changed(list);
                boolean zChanged2 = composerStartRestartGroup.changed(strCopydefault);
                java.lang.Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if ((zChanged2 | zChanged) || objRememberedValue == Composer.Companion.getEmpty()) {
                    StrategyProfitResponse strategyProfitResponse = (StrategyProfitResponse) CollectionsKt___CollectionsKt.firstOrNull(list);
                    StrategyProfitResponse strategyProfitResponse2 = (StrategyProfitResponse) CollectionsKt___CollectionsKt.wlaJM(list);
                    java.lang.String profitNum = strategyProfitResponse != null ? strategyProfitResponse.getProfitNum() : null;
                    if (profitNum == null) {
                        profitNum = "";
                    }
                    java.lang.String totalPnl = strategyProfitResponse != null ? strategyProfitResponse.getTotalPnl() : null;
                    if (totalPnl == null) {
                        totalPnl = "";
                    }
                    java.lang.String totalPnlInSourceCcy = strategyProfitResponse != null ? strategyProfitResponse.getTotalPnlInSourceCcy() : null;
                    if (totalPnlInSourceCcy == null) {
                        totalPnlInSourceCcy = "";
                    }
                    java.lang.String str2 = profitNum + totalPnl + totalPnlInSourceCcy;
                    java.lang.String profitNum2 = strategyProfitResponse2 != null ? strategyProfitResponse2.getProfitNum() : null;
                    if (profitNum2 == null) {
                        profitNum2 = "";
                    }
                    java.lang.String totalPnl2 = strategyProfitResponse2 != null ? strategyProfitResponse2.getTotalPnl() : null;
                    if (totalPnl2 == null) {
                        totalPnl2 = "";
                    }
                    java.lang.String totalPnlInSourceCcy2 = strategyProfitResponse2 != null ? strategyProfitResponse2.getTotalPnlInSourceCcy() : null;
                    java.lang.String str3 = profitNum2 + totalPnl2 + (totalPnlInSourceCcy2 != null ? totalPnlInSourceCcy2 : "");
                    objRememberedValue = list.size() + "_" + str2 + "_" + str3 + "_" + c48264uLa.copydefault();
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                final java.lang.String str4 = (java.lang.String) objRememberedValue;
                composerStartRestartGroup.endReplaceableGroup();
                java.lang.Object[] objArr = new java.lang.Object[0];
                composerStartRestartGroup.startReplaceableGroup(-986712048);
                java.lang.Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                Composer.Companion companion = Composer.Companion;
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = new Function0() { // from class: o.uLf
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return uKZ.EZpvd();
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                final MutableState mutableState = (MutableState) RememberSaveableKt.m2796rememberSaveable(objArr, (Saver) null, str, (Function0) objRememberedValue2, composerStartRestartGroup, ((i4 << 6) & FaceDetector.NUM_BOXES) | 3072, 2);
                Modifier modifierM704height3ABfNKs = SizeKt.m704height3ABfNKs(SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null), androidx.compose.ui.unit.Dp.m5414constructorimpl(150));
                composerStartRestartGroup.startReplaceableGroup(-986707263);
                java.lang.Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue3 == companion.getEmpty()) {
                    objRememberedValue3 = new Function1() { // from class: o.uLm
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return uKZ.KWHzl((android.content.Context) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                Function1 function1 = (Function1) objRememberedValue3;
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.startReplaceableGroup(-986678782);
                boolean zChanged3 = composerStartRestartGroup.changed(mutableState);
                java.lang.Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (zChanged3 || objRememberedValue4 == companion.getEmpty()) {
                    objRememberedValue4 = new Function1() { // from class: o.uLn
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return uKZ.AEQbTJ(mutableState, (C51348vlN) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                }
                Function1 function12 = (Function1) objRememberedValue4;
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.startReplaceableGroup(-986699830);
                boolean zChanged4 = composerStartRestartGroup.changed(mutableState);
                boolean zChanged5 = composerStartRestartGroup.changed(str4);
                boolean zChangedInstance = composerStartRestartGroup.changedInstance(context);
                boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(list);
                boolean z = (i4 & FaceDetector.NUM_BOXES) == 256;
                java.lang.Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                if ((zChanged4 | zChanged5 | zChangedInstance | zChangedInstance2 | z) || objRememberedValue5 == companion.getEmpty()) {
                    objRememberedValue5 = new Function1() { // from class: o.uLk
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return uKZ.copydefault(mutableState, str4, context, list, c48264uLa, (C51348vlN) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                }
                composerStartRestartGroup.endReplaceableGroup();
                modifier2 = modifier3;
                composer2 = composerStartRestartGroup;
                AndroidView_androidKt.AndroidView(function1, modifierM704height3ABfNKs, function12, null, (Function1) objRememberedValue5, composer2, 6, 8);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                composer2 = composerStartRestartGroup;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: o.uLj
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return uKZ.copydefault(str, list, c48264uLa, modifier2, i, i2, (Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 3072;
        modifier2 = modifier;
        i4 = i3;
        if ((i4 & 1171) == 1170) {
            if (i5 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            if (!list.isEmpty()) {
            }
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    public static final MutableState EZpvd() {
        return SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, 2, null);
    }

    public static final C51348vlN KWHzl(android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        C51348vlN c51348vlN = new C51348vlN(context, null, 0, 6, null);
        C48267uLd.initializeChart$default(C48267uLd.KWHzl, c51348vlN, 0, 2, null);
        return c51348vlN;
    }

    public static final Unit copydefault(MutableState mutableState, java.lang.String str, android.content.Context context, java.util.List list, C48264uLa c48264uLa, C51348vlN c51348vlN) {
        Intrinsics.checkNotNullParameter(c51348vlN, "");
        if (Intrinsics.EZpvd(mutableState.getValue(), (java.lang.Object) str)) {
            return Unit.INSTANCE;
        }
        IMarker marker = c51348vlN.getMarker();
        C52580wQr c52580wQr = marker instanceof C52580wQr ? (C52580wQr) marker : null;
        if (c52580wQr == null) {
            c52580wQr = new C52580wQr(context);
            c51348vlN.setMarker(c52580wQr);
        }
        C48267uLd.KWHzl.EZpvd(c51348vlN, list, c48264uLa, c52580wQr, true);
        mutableState.setValue(str);
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(MutableState mutableState, C51348vlN c51348vlN) {
        Intrinsics.checkNotNullParameter(c51348vlN, "");
        c51348vlN.clear();
        mutableState.setValue("");
        return Unit.INSTANCE;
    }

    public static final void AEQbTJ(Modifier modifier, @NotNull final java.util.List<TacticsListButtonItem> list, @NotNull final Function0<TacticsData> function0, @NotNull final yHO<? super java.lang.String, ? super TacticsData, ? super Function0<Unit>, Unit> yho, @NotNull final Function2<? super java.lang.String, ? super TacticsData, Unit> function2, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(function0, "");
        Intrinsics.checkNotNullParameter(yho, "");
        Intrinsics.checkNotNullParameter(function2, "");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1491132190);
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
            i3 |= composerStartRestartGroup.changedInstance(list) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= MLKEMEngine.KyberPolyBytes;
        } else if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function0) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(yho) ? 2048 : 1024;
        }
        if ((i2 & 16) != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function2) ? 16384 : 8192;
        }
        if ((i3 & 9363) != 9362 || !composerStartRestartGroup.getSkipping()) {
            Modifier modifier3 = i4 != 0 ? Modifier.Companion : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1491132190, i3, -1, "com.okinc.tradingbot.impl.botList.ui.shared.BotButtons (BotSharedComponentsComposable.kt:231)");
            }
            final androidx.compose.runtime.State stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(function0, composerStartRestartGroup, (i3 >> 6) & 14);
            final androidx.compose.runtime.State stateRememberUpdatedState2 = SnapshotStateKt.rememberUpdatedState(yho, composerStartRestartGroup, (i3 >> 9) & 14);
            final androidx.compose.runtime.State stateRememberUpdatedState3 = SnapshotStateKt.rememberUpdatedState(function2, composerStartRestartGroup, (i3 >> 12) & 14);
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null);
            composerStartRestartGroup.startReplaceableGroup(1475590645);
            java.lang.Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.Companion;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = new Function1() { // from class: o.uLi
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return uKZ.copydefault((android.content.Context) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            Function1 function1 = (Function1) objRememberedValue;
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.startReplaceableGroup(1475592842);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(list);
            boolean zChanged = composerStartRestartGroup.changed(stateRememberUpdatedState);
            boolean zChanged2 = composerStartRestartGroup.changed(stateRememberUpdatedState2);
            boolean zChanged3 = composerStartRestartGroup.changed(stateRememberUpdatedState3);
            java.lang.Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if ((zChangedInstance | zChanged | zChanged2 | zChanged3) || objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = new Function1() { // from class: o.uLg
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return uKZ.AEQbTJ(list, stateRememberUpdatedState, stateRememberUpdatedState2, stateRememberUpdatedState3, (wPY) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceableGroup();
            AndroidView_androidKt.AndroidView(function1, modifierFillMaxWidth$default, (Function1) objRememberedValue2, composerStartRestartGroup, 6, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = modifier3;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final Modifier modifier4 = modifier2;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: o.uLe
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return uKZ.AEQbTJ(modifier4, list, function0, yho, function2, i, i2, (Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final wPY copydefault(android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        return new wPY(context, null, 0, 6, null);
    }

    public static final Unit AEQbTJ(java.util.List list, final androidx.compose.runtime.State state, final androidx.compose.runtime.State state2, final androidx.compose.runtime.State state3, wPY wpy) {
        Intrinsics.checkNotNullParameter(wpy, "");
        wpy.setData(list, EZpvd((androidx.compose.runtime.State<? extends Function0<TacticsData>>) state).invoke(), new yHO() { // from class: o.uLr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.yHO
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return uKZ.AEQbTJ(state2, state, (java.lang.String) obj, (TacticsData) obj2, (Function0) obj3);
            }
        }, new Function2() { // from class: o.uLo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return uKZ.copydefault(state3, state, (java.lang.String) obj, (TacticsData) obj2);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(androidx.compose.runtime.State state, androidx.compose.runtime.State state2, java.lang.String str, TacticsData tacticsData, Function0 function0) {
        Intrinsics.checkNotNullParameter(tacticsData, "");
        yHO<java.lang.String, TacticsData, Function0<Unit>, Unit> yhoKWHzl = KWHzl((androidx.compose.runtime.State<? extends yHO<? super java.lang.String, ? super TacticsData, ? super Function0<Unit>, Unit>>) state);
        if (str == null) {
            str = "";
        }
        yhoKWHzl.invoke(str, EZpvd((androidx.compose.runtime.State<? extends Function0<TacticsData>>) state2).invoke(), function0);
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(androidx.compose.runtime.State state, androidx.compose.runtime.State state2, java.lang.String str, TacticsData tacticsData) {
        Intrinsics.checkNotNullParameter(tacticsData, "");
        Function2<java.lang.String, TacticsData, Unit> function2OLrzqt = OLrzqt(state);
        if (str == null) {
            str = "";
        }
        function2OLrzqt.invoke(str, EZpvd((androidx.compose.runtime.State<? extends Function0<TacticsData>>) state2).invoke());
        return Unit.INSTANCE;
    }

    public static final Function0<TacticsData> EZpvd(androidx.compose.runtime.State<? extends Function0<TacticsData>> state) {
        return state.getValue();
    }

    public static final yHO<java.lang.String, TacticsData, Function0<Unit>, Unit> KWHzl(androidx.compose.runtime.State<? extends yHO<? super java.lang.String, ? super TacticsData, ? super Function0<Unit>, Unit>> state) {
        return (yHO) state.getValue();
    }

    public static final Function2<java.lang.String, TacticsData, Unit> OLrzqt(androidx.compose.runtime.State<? extends Function2<? super java.lang.String, ? super TacticsData, Unit>> state) {
        return (Function2) state.getValue();
    }
}
