package o;

import android.view.View;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.FlowLayoutKt;
import androidx.compose.foundation.layout.FlowRowScopeInstance;
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
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.ColorResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.PlatformSpanStyle;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.font.AndroidTypeface_androidKt;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.profileinstaller.ProfileVerifier;
import com.okinc.business.defi.biz.core.error.WalletImportError;
import com.okinc.planet_api.publisher.PlanetPublisherPluginPreviewType;
import com.okinc.tradingbot.impl.planet.domain.BotDisplayName;
import com.okinc.tradingbot.impl.planet.model.BotTag;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C48033uCm;
import o.C52761wXj;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wpO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C53642wpO {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final Unit EZpvd(BotDisplayName botDisplayName, java.util.List list, PlanetPublisherPluginPreviewType planetPublisherPluginPreviewType, java.util.List list2, boolean z, Function0 function0, int i, int i2, Composer composer, int i3) {
        AEQbTJ(botDisplayName, list, planetPublisherPluginPreviewType, list2, z, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x034c  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0358  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x035c  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0389  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0466  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0472  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0476  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x04a3  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x04d6 A[LOOP:0: B:156:0x04d0->B:158:0x04d6, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:161:0x050e  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0561  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x059d  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x05a9  */
    /* JADX WARN: Removed duplicated region for block: B:188:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x012f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AEQbTJ(@NotNull final BotDisplayName botDisplayName, java.util.List<java.lang.String> list, PlanetPublisherPluginPreviewType planetPublisherPluginPreviewType, @NotNull final java.util.List<BotTag> list2, final boolean z, @NotNull final Function0<Unit> function0, Composer composer, final int i, final int i2) {
        int i3;
        java.util.List<java.lang.String> list3;
        int i4;
        PlanetPublisherPluginPreviewType planetPublisherPluginPreviewType2;
        java.lang.Object objRememberedValue;
        Composer.Companion companion;
        boolean z2;
        java.lang.Object objRememberedValue2;
        AnnotatedString annotatedString;
        int currentCompositeKeyHash;
        Composer composerM2783constructorimpl;
        Function2<ComposeUiNode, java.lang.Integer, Unit> setCompositeKeyHash;
        int currentCompositeKeyHash2;
        Composer composerM2783constructorimpl2;
        Function2<ComposeUiNode, java.lang.Integer, Unit> setCompositeKeyHash2;
        int currentCompositeKeyHash3;
        Composer composerM2783constructorimpl3;
        Function2<ComposeUiNode, java.lang.Integer, Unit> setCompositeKeyHash3;
        int currentCompositeKeyHash4;
        Composer composerM2783constructorimpl4;
        Function2<ComposeUiNode, java.lang.Integer, Unit> setCompositeKeyHash4;
        PlanetPublisherPluginPreviewType planetPublisherPluginPreviewType3;
        final PlanetPublisherPluginPreviewType planetPublisherPluginPreviewType4;
        final java.util.List<java.lang.String> list4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(botDisplayName, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(function0, "");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1998518644);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(botDisplayName) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 48;
        } else {
            if ((i & 48) == 0) {
                list3 = list;
                i3 |= composerStartRestartGroup.changedInstance(list3) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 != 0) {
                if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
                    planetPublisherPluginPreviewType2 = planetPublisherPluginPreviewType;
                    i3 |= composerStartRestartGroup.changed(planetPublisherPluginPreviewType2) ? 256 : 128;
                }
                if ((i2 & 8) != 0) {
                    i3 |= 3072;
                } else if ((i & 3072) == 0) {
                    i3 |= composerStartRestartGroup.changedInstance(list2) ? 2048 : 1024;
                }
                if ((i2 & 16) != 0) {
                    i3 |= 24576;
                } else if ((i & 24576) == 0) {
                    i3 |= composerStartRestartGroup.changed(z) ? 16384 : 8192;
                }
                if ((i2 & 32) != 0) {
                    i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                    i3 |= composerStartRestartGroup.changedInstance(function0) ? 131072 : 65536;
                }
                if ((74899 & i3) != 74898 || !composerStartRestartGroup.getSkipping()) {
                    java.util.List<java.lang.String> listAhwBna = i5 == 0 ? yDY.AhwBna() : list3;
                    PlanetPublisherPluginPreviewType planetPublisherPluginPreviewType5 = i4 == 0 ? PlanetPublisherPluginPreviewType.PUBLISHER : planetPublisherPluginPreviewType2;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1998518644, i3, -1, "com.okinc.tradingbot.impl.planet.ui.BotHeader (BotHeaderCompose.kt:49)");
                    }
                    long jColorResource = ColorResources_androidKt.colorResource(C52761wXj.Activity.QwvEab, composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(1923104118);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion = Composer.Companion;
                    if (objRememberedValue == companion.getEmpty()) {
                        objRememberedValue = C55051xce.OLrzqt.valueOf();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    android.graphics.Typeface typeface = (android.graphics.Typeface) objRememberedValue;
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.startReplaceableGroup(1923110729);
                    z2 = (i3 & 14) != 4;
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (!z2 || objRememberedValue2 == companion.getEmpty()) {
                        if (botDisplayName instanceof BotDisplayName.PartialHighlight) {
                            if (!(botDisplayName instanceof BotDisplayName.Plain)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            AnnotatedString.Builder builder = new AnnotatedString.Builder(0, 1, null);
                            builder.append(((BotDisplayName.Plain) botDisplayName).OLrzqt());
                            annotatedString = builder.toAnnotatedString();
                        } else {
                            AnnotatedString.Builder builder2 = new AnnotatedString.Builder(0, 1, null);
                            builder2.append(((BotDisplayName.PartialHighlight) botDisplayName).EZpvd());
                            builder2.pushStringAnnotation("quote", "quote");
                            int iPushStyle = builder2.pushStyle(new SpanStyle(jColorResource, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, typeface != null ? AndroidTypeface_androidKt.FontFamily(typeface) : null, (java.lang.String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (androidx.compose.ui.text.intl.LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65502, (DefaultConstructorMarker) null));
                            try {
                                builder2.append(((BotDisplayName.PartialHighlight) botDisplayName).AEQbTJ());
                                Unit unit = Unit.INSTANCE;
                                builder2.pop(iPushStyle);
                                builder2.pop();
                                annotatedString = builder2.toAnnotatedString();
                            } catch (java.lang.Throwable th) {
                                builder2.pop(iPushStyle);
                                throw th;
                            }
                        }
                        objRememberedValue2 = annotatedString;
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    AnnotatedString annotatedString2 = (AnnotatedString) objRememberedValue2;
                    composerStartRestartGroup.endReplaceableGroup();
                    Modifier.Companion companion2 = Modifier.Companion;
                    Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null);
                    Arrangement arrangement = Arrangement.INSTANCE;
                    float f = 6;
                    Arrangement.HorizontalOrVertical horizontalOrVerticalM582spacedBy0680j_4 = arrangement.m582spacedBy0680j_4(androidx.compose.ui.unit.Dp.m5414constructorimpl(f));
                    Alignment.Companion companion3 = Alignment.Companion;
                    Alignment.Vertical centerVertically = companion3.getCenterVertically();
                    PlanetPublisherPluginPreviewType planetPublisherPluginPreviewType6 = planetPublisherPluginPreviewType5;
                    composerStartRestartGroup.startReplaceableGroup(693286680);
                    MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(horizontalOrVerticalM582spacedBy0680j_4, centerVertically, composerStartRestartGroup, 54);
                    composerStartRestartGroup.startReplaceableGroup(-1323940314);
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    ComposeUiNode.Companion companion4 = ComposeUiNode.Companion;
                    Function0<ComposeUiNode> constructor = companion4.getConstructor();
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
                    Updater.m2790setimpl(composerM2783constructorimpl, measurePolicyRowMeasurePolicy, companion4.getSetMeasurePolicy());
                    Updater.m2790setimpl(composerM2783constructorimpl, currentCompositionLocalMap, companion4.getSetResolvedCompositionLocals());
                    setCompositeKeyHash = companion4.getSetCompositeKeyHash();
                    if (!composerM2783constructorimpl.getInserting() || !Intrinsics.EZpvd(composerM2783constructorimpl.rememberedValue(), java.lang.Integer.valueOf(currentCompositeKeyHash))) {
                        composerM2783constructorimpl.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash));
                        composerM2783constructorimpl.apply(java.lang.Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    yhoModifierMaterializerOf.invoke(SkippableUpdater.m2774boximpl(SkippableUpdater.m2775constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(2058660585);
                    Modifier modifierWeight$default = RowScope.weight$default(RowScopeInstance.INSTANCE, companion2, 1.0f, false, 2, null);
                    float f2 = 4;
                    Arrangement.Vertical verticalM584spacedByD5KLDUw = arrangement.m584spacedByD5KLDUw(androidx.compose.ui.unit.Dp.m5414constructorimpl(f2), companion3.getCenterVertically());
                    Arrangement.HorizontalOrVertical horizontalOrVerticalM582spacedBy0680j_42 = arrangement.m582spacedBy0680j_4(androidx.compose.ui.unit.Dp.m5414constructorimpl(f));
                    composerStartRestartGroup.startReplaceableGroup(1098475987);
                    MeasurePolicy measurePolicyRowMeasurementHelper = FlowLayoutKt.rowMeasurementHelper(horizontalOrVerticalM582spacedBy0680j_42, verticalM584spacedByD5KLDUw, Integer.MAX_VALUE, composerStartRestartGroup, 54);
                    composerStartRestartGroup.startReplaceableGroup(-1323940314);
                    currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Function0<ComposeUiNode> constructor2 = companion4.getConstructor();
                    yHO<SkippableUpdater<ComposeUiNode>, Composer, java.lang.Integer, Unit> yhoModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierWeight$default);
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
                    Updater.m2790setimpl(composerM2783constructorimpl2, measurePolicyRowMeasurementHelper, companion4.getSetMeasurePolicy());
                    Updater.m2790setimpl(composerM2783constructorimpl2, currentCompositionLocalMap2, companion4.getSetResolvedCompositionLocals());
                    setCompositeKeyHash2 = companion4.getSetCompositeKeyHash();
                    if (!composerM2783constructorimpl2.getInserting() || !Intrinsics.EZpvd(composerM2783constructorimpl2.rememberedValue(), java.lang.Integer.valueOf(currentCompositeKeyHash2))) {
                        composerM2783constructorimpl2.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash2));
                        composerM2783constructorimpl2.apply(java.lang.Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                    }
                    yhoModifierMaterializerOf2.invoke(SkippableUpdater.m2774boximpl(SkippableUpdater.m2775constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(2058660585);
                    FlowRowScopeInstance flowRowScopeInstance = FlowRowScopeInstance.INSTANCE;
                    Arrangement.HorizontalOrVertical horizontalOrVerticalM582spacedBy0680j_43 = arrangement.m582spacedBy0680j_4(androidx.compose.ui.unit.Dp.m5414constructorimpl(f));
                    Alignment.Vertical centerVertically2 = companion3.getCenterVertically();
                    composerStartRestartGroup.startReplaceableGroup(693286680);
                    MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(horizontalOrVerticalM582spacedBy0680j_43, centerVertically2, composerStartRestartGroup, 54);
                    composerStartRestartGroup.startReplaceableGroup(-1323940314);
                    currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Function0<ComposeUiNode> constructor3 = companion4.getConstructor();
                    yHO<SkippableUpdater<ComposeUiNode>, Composer, java.lang.Integer, Unit> yhoModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(companion2);
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (!composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor3);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerM2783constructorimpl3 = Updater.m2783constructorimpl(composerStartRestartGroup);
                    Updater.m2790setimpl(composerM2783constructorimpl3, measurePolicyRowMeasurePolicy2, companion4.getSetMeasurePolicy());
                    Updater.m2790setimpl(composerM2783constructorimpl3, currentCompositionLocalMap3, companion4.getSetResolvedCompositionLocals());
                    setCompositeKeyHash3 = companion4.getSetCompositeKeyHash();
                    if (!composerM2783constructorimpl3.getInserting() || !Intrinsics.EZpvd(composerM2783constructorimpl3.rememberedValue(), java.lang.Integer.valueOf(currentCompositeKeyHash3))) {
                        composerM2783constructorimpl3.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash3));
                        composerM2783constructorimpl3.apply(java.lang.Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                    }
                    yhoModifierMaterializerOf3.invoke(SkippableUpdater.m2774boximpl(SkippableUpdater.m2775constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(2058660585);
                    C52716wVs.AEQbTJ(null, listAhwBna, 0.0f, 0, 0, null, false, composerStartRestartGroup, (i3 & WalletImportError.ERROR_CODE_AA_EXIST) | 1572864, 61);
                    TextKt.m2073TextIbK3jfQ(annotatedString2, null, 0L, 0L, null, null, null, 0L, null, null, 0L, TextOverflow.Companion.m5334getEllipsisgIe3tQ8(), false, 1, 0, null, null, C52698wVa.OLrzqt(C52761wXj.LoaderManager.gHZMYf, java.lang.Integer.valueOf(C52761wXj.Activity.fdOvFl), composerStartRestartGroup, 0, 0), composerStartRestartGroup, 0, 3120, 120830);
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    Modifier modifierWeight$default2 = RowScope.weight$default(flowRowScopeInstance, companion2, 1.0f, false, 2, null);
                    Arrangement.HorizontalOrVertical horizontalOrVerticalM582spacedBy0680j_44 = arrangement.m582spacedBy0680j_4(androidx.compose.ui.unit.Dp.m5414constructorimpl(f2));
                    composerStartRestartGroup.startReplaceableGroup(693286680);
                    MeasurePolicy measurePolicyRowMeasurePolicy3 = RowKt.rowMeasurePolicy(horizontalOrVerticalM582spacedBy0680j_44, companion3.getTop(), composerStartRestartGroup, 6);
                    composerStartRestartGroup.startReplaceableGroup(-1323940314);
                    currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Function0<ComposeUiNode> constructor4 = companion4.getConstructor();
                    yHO<SkippableUpdater<ComposeUiNode>, Composer, java.lang.Integer, Unit> yhoModifierMaterializerOf4 = LayoutKt.modifierMaterializerOf(modifierWeight$default2);
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (!composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor4);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerM2783constructorimpl4 = Updater.m2783constructorimpl(composerStartRestartGroup);
                    Updater.m2790setimpl(composerM2783constructorimpl4, measurePolicyRowMeasurePolicy3, companion4.getSetMeasurePolicy());
                    Updater.m2790setimpl(composerM2783constructorimpl4, currentCompositionLocalMap4, companion4.getSetResolvedCompositionLocals());
                    setCompositeKeyHash4 = companion4.getSetCompositeKeyHash();
                    if (!composerM2783constructorimpl4.getInserting() || !Intrinsics.EZpvd(composerM2783constructorimpl4.rememberedValue(), java.lang.Integer.valueOf(currentCompositeKeyHash4))) {
                        composerM2783constructorimpl4.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash4));
                        composerM2783constructorimpl4.apply(java.lang.Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                    }
                    yhoModifierMaterializerOf4.invoke(SkippableUpdater.m2774boximpl(SkippableUpdater.m2775constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(2058660585);
                    composerStartRestartGroup.startReplaceableGroup(1873791541);
                    for (BotTag botTag : list2) {
                        wWD.EZpvd(null, -5, botTag.KWHzl(), 0, 0, botTag.EZpvd(), composerStartRestartGroup, 48, 25);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    if (!z) {
                        composerStartRestartGroup.startReplaceableGroup(2108177821);
                        Modifier.Companion companion5 = Modifier.Companion;
                        java.lang.String strStringResource = StringResources_androidKt.stringResource(C48033uCm.Fragment.QezThh, composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(1037847321);
                        boolean z3 = (458752 & i3) == 131072;
                        java.lang.Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (z3 || objRememberedValue3 == Composer.Companion.getEmpty()) {
                            objRememberedValue3 = new View.OnClickListener() { // from class: o.wpW
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                @Override // android.view.View.OnClickListener
                                public final void onClick(android.view.View view) {
                                    C53642wpO.OLrzqt(function0, view);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        C49553uqi.OLrzqt(companion5, false, false, false, 24, 257, 0, strStringResource, (View.OnClickListener) objRememberedValue3, composerStartRestartGroup, 221190, 78);
                        composerStartRestartGroup.endReplaceableGroup();
                        planetPublisherPluginPreviewType3 = planetPublisherPluginPreviewType6;
                    } else {
                        planetPublisherPluginPreviewType3 = planetPublisherPluginPreviewType6;
                        if (planetPublisherPluginPreviewType3 == PlanetPublisherPluginPreviewType.PUBLISHER) {
                            composerStartRestartGroup.startReplaceableGroup(2108674379);
                            SpacerKt.Spacer(SizeKt.m718size3ABfNKs(Modifier.Companion, androidx.compose.ui.unit.Dp.m5414constructorimpl(20)), composerStartRestartGroup, 6);
                            composerStartRestartGroup.endReplaceableGroup();
                        } else {
                            composerStartRestartGroup.startReplaceableGroup(2108752530);
                            composerStartRestartGroup.endReplaceableGroup();
                        }
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    planetPublisherPluginPreviewType4 = planetPublisherPluginPreviewType3;
                    list4 = listAhwBna;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    list4 = list3;
                    planetPublisherPluginPreviewType4 = planetPublisherPluginPreviewType2;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: o.wpT
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            return C53642wpO.EZpvd(botDisplayName, list4, planetPublisherPluginPreviewType4, list2, z, function0, i, i2, (Composer) obj, ((java.lang.Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= MLKEMEngine.KyberPolyBytes;
            planetPublisherPluginPreviewType2 = planetPublisherPluginPreviewType;
            if ((i2 & 8) != 0) {
            }
            if ((i2 & 16) != 0) {
            }
            if ((i2 & 32) != 0) {
            }
            if ((74899 & i3) != 74898) {
                if (i5 == 0) {
                }
                if (i4 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                long jColorResource2 = ColorResources_androidKt.colorResource(C52761wXj.Activity.QwvEab, composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(1923104118);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.Companion;
                if (objRememberedValue == companion.getEmpty()) {
                }
                android.graphics.Typeface typeface2 = (android.graphics.Typeface) objRememberedValue;
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.startReplaceableGroup(1923110729);
                if ((i3 & 14) != 4) {
                }
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (!z2) {
                    if (botDisplayName instanceof BotDisplayName.PartialHighlight) {
                    }
                    objRememberedValue2 = annotatedString;
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    AnnotatedString annotatedString22 = (AnnotatedString) objRememberedValue2;
                    composerStartRestartGroup.endReplaceableGroup();
                    Modifier.Companion companion22 = Modifier.Companion;
                    Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion22, 0.0f, 1, null);
                    Arrangement arrangement2 = Arrangement.INSTANCE;
                    float f3 = 6;
                    Arrangement.HorizontalOrVertical horizontalOrVerticalM582spacedBy0680j_45 = arrangement2.m582spacedBy0680j_4(androidx.compose.ui.unit.Dp.m5414constructorimpl(f3));
                    Alignment.Companion companion32 = Alignment.Companion;
                    Alignment.Vertical centerVertically3 = companion32.getCenterVertically();
                    PlanetPublisherPluginPreviewType planetPublisherPluginPreviewType62 = planetPublisherPluginPreviewType5;
                    composerStartRestartGroup.startReplaceableGroup(693286680);
                    MeasurePolicy measurePolicyRowMeasurePolicy4 = RowKt.rowMeasurePolicy(horizontalOrVerticalM582spacedBy0680j_45, centerVertically3, composerStartRestartGroup, 54);
                    composerStartRestartGroup.startReplaceableGroup(-1323940314);
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap5 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    ComposeUiNode.Companion companion42 = ComposeUiNode.Companion;
                    Function0<ComposeUiNode> constructor5 = companion42.getConstructor();
                    yHO<SkippableUpdater<ComposeUiNode>, Composer, java.lang.Integer, Unit> yhoModifierMaterializerOf5 = LayoutKt.modifierMaterializerOf(modifierFillMaxWidth$default2);
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (!composerStartRestartGroup.getInserting()) {
                    }
                    composerM2783constructorimpl = Updater.m2783constructorimpl(composerStartRestartGroup);
                    Updater.m2790setimpl(composerM2783constructorimpl, measurePolicyRowMeasurePolicy4, companion42.getSetMeasurePolicy());
                    Updater.m2790setimpl(composerM2783constructorimpl, currentCompositionLocalMap5, companion42.getSetResolvedCompositionLocals());
                    setCompositeKeyHash = companion42.getSetCompositeKeyHash();
                    if (!composerM2783constructorimpl.getInserting()) {
                        composerM2783constructorimpl.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash));
                        composerM2783constructorimpl.apply(java.lang.Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        yhoModifierMaterializerOf5.invoke(SkippableUpdater.m2774boximpl(SkippableUpdater.m2775constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(2058660585);
                        Modifier modifierWeight$default3 = RowScope.weight$default(RowScopeInstance.INSTANCE, companion22, 1.0f, false, 2, null);
                        float f22 = 4;
                        Arrangement.Vertical verticalM584spacedByD5KLDUw2 = arrangement2.m584spacedByD5KLDUw(androidx.compose.ui.unit.Dp.m5414constructorimpl(f22), companion32.getCenterVertically());
                        Arrangement.HorizontalOrVertical horizontalOrVerticalM582spacedBy0680j_422 = arrangement2.m582spacedBy0680j_4(androidx.compose.ui.unit.Dp.m5414constructorimpl(f3));
                        composerStartRestartGroup.startReplaceableGroup(1098475987);
                        MeasurePolicy measurePolicyRowMeasurementHelper2 = FlowLayoutKt.rowMeasurementHelper(horizontalOrVerticalM582spacedBy0680j_422, verticalM584spacedByD5KLDUw2, Integer.MAX_VALUE, composerStartRestartGroup, 54);
                        composerStartRestartGroup.startReplaceableGroup(-1323940314);
                        currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap22 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Function0<ComposeUiNode> constructor22 = companion42.getConstructor();
                        yHO<SkippableUpdater<ComposeUiNode>, Composer, java.lang.Integer, Unit> yhoModifierMaterializerOf22 = LayoutKt.modifierMaterializerOf(modifierWeight$default3);
                        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (!composerStartRestartGroup.getInserting()) {
                        }
                        composerM2783constructorimpl2 = Updater.m2783constructorimpl(composerStartRestartGroup);
                        Updater.m2790setimpl(composerM2783constructorimpl2, measurePolicyRowMeasurementHelper2, companion42.getSetMeasurePolicy());
                        Updater.m2790setimpl(composerM2783constructorimpl2, currentCompositionLocalMap22, companion42.getSetResolvedCompositionLocals());
                        setCompositeKeyHash2 = companion42.getSetCompositeKeyHash();
                        if (!composerM2783constructorimpl2.getInserting()) {
                            composerM2783constructorimpl2.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash2));
                            composerM2783constructorimpl2.apply(java.lang.Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                            yhoModifierMaterializerOf22.invoke(SkippableUpdater.m2774boximpl(SkippableUpdater.m2775constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                            composerStartRestartGroup.startReplaceableGroup(2058660585);
                            FlowRowScopeInstance flowRowScopeInstance2 = FlowRowScopeInstance.INSTANCE;
                            Arrangement.HorizontalOrVertical horizontalOrVerticalM582spacedBy0680j_432 = arrangement2.m582spacedBy0680j_4(androidx.compose.ui.unit.Dp.m5414constructorimpl(f3));
                            Alignment.Vertical centerVertically22 = companion32.getCenterVertically();
                            composerStartRestartGroup.startReplaceableGroup(693286680);
                            MeasurePolicy measurePolicyRowMeasurePolicy22 = RowKt.rowMeasurePolicy(horizontalOrVerticalM582spacedBy0680j_432, centerVertically22, composerStartRestartGroup, 54);
                            composerStartRestartGroup.startReplaceableGroup(-1323940314);
                            currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap32 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                            Function0<ComposeUiNode> constructor32 = companion42.getConstructor();
                            yHO<SkippableUpdater<ComposeUiNode>, Composer, java.lang.Integer, Unit> yhoModifierMaterializerOf32 = LayoutKt.modifierMaterializerOf(companion22);
                            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                            }
                            composerStartRestartGroup.startReusableNode();
                            if (!composerStartRestartGroup.getInserting()) {
                            }
                            composerM2783constructorimpl3 = Updater.m2783constructorimpl(composerStartRestartGroup);
                            Updater.m2790setimpl(composerM2783constructorimpl3, measurePolicyRowMeasurePolicy22, companion42.getSetMeasurePolicy());
                            Updater.m2790setimpl(composerM2783constructorimpl3, currentCompositionLocalMap32, companion42.getSetResolvedCompositionLocals());
                            setCompositeKeyHash3 = companion42.getSetCompositeKeyHash();
                            if (!composerM2783constructorimpl3.getInserting()) {
                                composerM2783constructorimpl3.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash3));
                                composerM2783constructorimpl3.apply(java.lang.Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                                yhoModifierMaterializerOf32.invoke(SkippableUpdater.m2774boximpl(SkippableUpdater.m2775constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                                composerStartRestartGroup.startReplaceableGroup(2058660585);
                                C52716wVs.AEQbTJ(null, listAhwBna, 0.0f, 0, 0, null, false, composerStartRestartGroup, (i3 & WalletImportError.ERROR_CODE_AA_EXIST) | 1572864, 61);
                                TextKt.m2073TextIbK3jfQ(annotatedString22, null, 0L, 0L, null, null, null, 0L, null, null, 0L, TextOverflow.Companion.m5334getEllipsisgIe3tQ8(), false, 1, 0, null, null, C52698wVa.OLrzqt(C52761wXj.LoaderManager.gHZMYf, java.lang.Integer.valueOf(C52761wXj.Activity.fdOvFl), composerStartRestartGroup, 0, 0), composerStartRestartGroup, 0, 3120, 120830);
                                composerStartRestartGroup.endReplaceableGroup();
                                composerStartRestartGroup.endNode();
                                composerStartRestartGroup.endReplaceableGroup();
                                composerStartRestartGroup.endReplaceableGroup();
                                Modifier modifierWeight$default22 = RowScope.weight$default(flowRowScopeInstance2, companion22, 1.0f, false, 2, null);
                                Arrangement.HorizontalOrVertical horizontalOrVerticalM582spacedBy0680j_442 = arrangement2.m582spacedBy0680j_4(androidx.compose.ui.unit.Dp.m5414constructorimpl(f22));
                                composerStartRestartGroup.startReplaceableGroup(693286680);
                                MeasurePolicy measurePolicyRowMeasurePolicy32 = RowKt.rowMeasurePolicy(horizontalOrVerticalM582spacedBy0680j_442, companion32.getTop(), composerStartRestartGroup, 6);
                                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                                currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                                CompositionLocalMap currentCompositionLocalMap42 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                                Function0<ComposeUiNode> constructor42 = companion42.getConstructor();
                                yHO<SkippableUpdater<ComposeUiNode>, Composer, java.lang.Integer, Unit> yhoModifierMaterializerOf42 = LayoutKt.modifierMaterializerOf(modifierWeight$default22);
                                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                                }
                                composerStartRestartGroup.startReusableNode();
                                if (!composerStartRestartGroup.getInserting()) {
                                }
                                composerM2783constructorimpl4 = Updater.m2783constructorimpl(composerStartRestartGroup);
                                Updater.m2790setimpl(composerM2783constructorimpl4, measurePolicyRowMeasurePolicy32, companion42.getSetMeasurePolicy());
                                Updater.m2790setimpl(composerM2783constructorimpl4, currentCompositionLocalMap42, companion42.getSetResolvedCompositionLocals());
                                setCompositeKeyHash4 = companion42.getSetCompositeKeyHash();
                                if (!composerM2783constructorimpl4.getInserting()) {
                                    composerM2783constructorimpl4.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash4));
                                    composerM2783constructorimpl4.apply(java.lang.Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                                    yhoModifierMaterializerOf42.invoke(SkippableUpdater.m2774boximpl(SkippableUpdater.m2775constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                                    composerStartRestartGroup.startReplaceableGroup(2058660585);
                                    composerStartRestartGroup.startReplaceableGroup(1873791541);
                                    while (r0.hasNext()) {
                                    }
                                    composerStartRestartGroup.endReplaceableGroup();
                                    composerStartRestartGroup.endReplaceableGroup();
                                    composerStartRestartGroup.endNode();
                                    composerStartRestartGroup.endReplaceableGroup();
                                    composerStartRestartGroup.endReplaceableGroup();
                                    composerStartRestartGroup.endReplaceableGroup();
                                    composerStartRestartGroup.endNode();
                                    composerStartRestartGroup.endReplaceableGroup();
                                    composerStartRestartGroup.endReplaceableGroup();
                                    if (!z) {
                                    }
                                    composerStartRestartGroup.endReplaceableGroup();
                                    composerStartRestartGroup.endNode();
                                    composerStartRestartGroup.endReplaceableGroup();
                                    composerStartRestartGroup.endReplaceableGroup();
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                    planetPublisherPluginPreviewType4 = planetPublisherPluginPreviewType3;
                                    list4 = listAhwBna;
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
        list3 = list;
        i4 = i2 & 4;
        if (i4 != 0) {
        }
        planetPublisherPluginPreviewType2 = planetPublisherPluginPreviewType;
        if ((i2 & 8) != 0) {
        }
        if ((i2 & 16) != 0) {
        }
        if ((i2 & 32) != 0) {
        }
        if ((74899 & i3) != 74898) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    public static final void OLrzqt(Function0 function0, android.view.View view) {
        function0.invoke();
    }
}
