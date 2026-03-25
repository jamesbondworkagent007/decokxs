package o;

import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.CubicBezierEasing;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.unit.IntSize;
import com.amplifyframework.ui.liveness.ml.FaceDetector;
import com.google.api.client.googleapis.media.MediaHttpDownloader;
import com.okinc.business.defi.biz.core.error.WalletImportError;
import com.okinc.planet_api.publisher.PlanetPublisherPluginPreviewType;
import com.okinc.tradingbot.impl.common.model.TextColor;
import com.okinc.tradingbot.impl.planet.model.BotDisplayType;
import com.okinc.tradingbot.impl.planet.model.BotUiState;
import com.okinc.unify_trade.biz.StrategyProfitResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wpP, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C53643wpP {
    public static final TweenSpec<java.lang.Float> AEQbTJ;
    public static final TweenSpec<IntSize> EZpvd;
    public static final TweenSpec<IntSize> KWHzl;
    public static final CubicBezierEasing OLrzqt;
    public static final TweenSpec<java.lang.Float> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final Unit AEQbTJ(TextColor textColor, java.util.List list, java.lang.String str, java.lang.String str2, java.lang.String str3, BotDisplayType botDisplayType, long j, boolean z, Function0 function0, int i, Composer composer, int i2) {
        copydefault(textColor, list, str, str2, str3, botDisplayType, j, z, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final Unit OLrzqt(boolean z, BotUiState botUiState, PlanetPublisherPluginPreviewType planetPublisherPluginPreviewType, Function0 function0, int i, Composer composer, int i2) {
        copydefault(z, botUiState, planetPublisherPluginPreviewType, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    static {
        CubicBezierEasing cubicBezierEasing = new CubicBezierEasing(0.42f, 0.0f, 0.58f, 1.0f);
        OLrzqt = cubicBezierEasing;
        copydefault = AnimationSpecKt.tween$default(500, 0, cubicBezierEasing, 2, null);
        KWHzl = AnimationSpecKt.tween$default(260, 0, EasingKt.getFastOutSlowInEasing(), 2, null);
        AEQbTJ = AnimationSpecKt.tween$default(200, 0, EasingKt.getFastOutLinearInEasing(), 2, null);
        EZpvd = AnimationSpecKt.tween$default(200, 0, EasingKt.getFastOutLinearInEasing(), 2, null);
    }

    public static final void copydefault(final TextColor textColor, final java.util.List<StrategyProfitResponse> list, final java.lang.String str, final java.lang.String str2, final java.lang.String str3, final BotDisplayType botDisplayType, final long j, final boolean z, final Function0<Unit> function0, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1678895205);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(textColor) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(list) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= composerStartRestartGroup.changed(str) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changed(str2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changed(str3) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= composerStartRestartGroup.changed(botDisplayType) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= composerStartRestartGroup.changed(j) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= composerStartRestartGroup.changed(z) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function0) ? 67108864 : MediaHttpDownloader.MAXIMUM_CHUNK_SIZE;
        }
        int i3 = i2;
        if ((38347923 & i3) != 38347922 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1678895205, i3, -1, "com.okinc.tradingbot.impl.planet.ui.ExpandedBotContent (BotContentCompose.kt:81)");
            }
            Modifier.Companion companion = Modifier.Companion;
            float f = 24;
            Modifier modifierM675paddingqDBjuR0$default = PaddingKt.m675paddingqDBjuR0$default(SizeKt.wrapContentHeight$default(SizeKt.m706heightInVpY3zN4$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), androidx.compose.ui.unit.Dp.m5414constructorimpl(60), 0.0f, 2, null), null, false, 3, null), 0.0f, androidx.compose.ui.unit.Dp.m5414constructorimpl(f), 0.0f, androidx.compose.ui.unit.Dp.m5414constructorimpl(8), 5, null);
            composerStartRestartGroup.startReplaceableGroup(-483455358);
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Vertical top = arrangement.getTop();
            Alignment.Companion companion2 = Alignment.Companion;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion2.getStart(), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
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
            Updater.m2790setimpl(composerM2783constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m2790setimpl(composerM2783constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, java.lang.Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (composerM2783constructorimpl.getInserting() || !Intrinsics.EZpvd(composerM2783constructorimpl.rememberedValue(), java.lang.Integer.valueOf(currentCompositeKeyHash))) {
                composerM2783constructorimpl.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash));
                composerM2783constructorimpl.apply(java.lang.Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            yhoModifierMaterializerOf.invoke(SkippableUpdater.m2774boximpl(SkippableUpdater.m2775constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            Arrangement.HorizontalOrVertical horizontalOrVerticalM582spacedBy0680j_4 = arrangement.m582spacedBy0680j_4(androidx.compose.ui.unit.Dp.m5414constructorimpl(f));
            composerStartRestartGroup.startReplaceableGroup(-483455358);
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(horizontalOrVerticalM582spacedBy0680j_4, companion2.getStart(), composerStartRestartGroup, 6);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
            yHO<SkippableUpdater<ComposeUiNode>, Composer, java.lang.Integer, Unit> yhoModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierFillMaxWidth$default);
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
            Updater.m2790setimpl(composerM2783constructorimpl2, measurePolicyColumnMeasurePolicy2, companion3.getSetMeasurePolicy());
            Updater.m2790setimpl(composerM2783constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, java.lang.Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
            if (composerM2783constructorimpl2.getInserting() || !Intrinsics.EZpvd(composerM2783constructorimpl2.rememberedValue(), java.lang.Integer.valueOf(currentCompositeKeyHash2))) {
                composerM2783constructorimpl2.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash2));
                composerM2783constructorimpl2.apply(java.lang.Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            yhoModifierMaterializerOf2.invoke(SkippableUpdater.m2774boximpl(SkippableUpdater.m2775constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            composerStartRestartGroup.startReplaceableGroup(1688887013);
            boolean z2 = (234881024 & i3) == 67108864;
            java.lang.Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z2 || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new Function0() { // from class: o.wpR
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return C53643wpP.OLrzqt(function0);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            C53636wpI.KWHzl(C49551uqg.EZpvd(modifierFillMaxWidth$default2, (Function0) objRememberedValue), textColor, z, list, composerStartRestartGroup, ((i3 << 3) & WalletImportError.ERROR_CODE_AA_EXIST) | ((i3 >> 15) & FaceDetector.NUM_BOXES) | ((i3 << 6) & 7168), 0);
            C53707wqa.AEQbTJ(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), botDisplayType, str, str2, str3, j, composerStartRestartGroup, ((i3 >> 12) & WalletImportError.ERROR_CODE_AA_EXIST) | 6 | (i3 & FaceDetector.NUM_BOXES) | (i3 & 7168) | (57344 & i3) | ((i3 >> 3) & 458752), 0);
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
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: o.wpS
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return C53643wpP.AEQbTJ(textColor, list, str, str2, str3, botDisplayType, j, z, function0, i, (Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final Unit OLrzqt(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }

    public static final void copydefault(final boolean z, @NotNull final BotUiState botUiState, final PlanetPublisherPluginPreviewType planetPublisherPluginPreviewType, @NotNull final Function0<Unit> function0, Composer composer, final int i) {
        int i2;
        Composer composer2;
        Intrinsics.checkNotNullParameter(botUiState, "");
        Intrinsics.checkNotNullParameter(function0, "");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1532793504);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(botUiState) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= composerStartRestartGroup.changed(planetPublisherPluginPreviewType) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function0) ? 2048 : 1024;
        }
        if ((i2 & 1171) != 1170 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1532793504, i2, -1, "com.okinc.tradingbot.impl.planet.ui.BotContent (BotContentCompose.kt:129)");
            }
            android.content.Context context = (android.content.Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            composerStartRestartGroup.startReplaceableGroup(-709055011);
            boolean z2 = (i2 & FaceDetector.NUM_BOXES) == 256;
            java.lang.Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z2 || objRememberedValue == Composer.Companion.getEmpty()) {
                C53684wqD c53684wqD = new C53684wqD(planetPublisherPluginPreviewType != null, planetPublisherPluginPreviewType == PlanetPublisherPluginPreviewType.PUBLISHER);
                composerStartRestartGroup.updateRememberedValue(c53684wqD);
                objRememberedValue = c53684wqD;
            }
            C53684wqD c53684wqD2 = (C53684wqD) objRememberedValue;
            composerStartRestartGroup.endReplaceableGroup();
            TextColor textColorAYXKKw = botUiState.AYXKKw();
            composerStartRestartGroup.startReplaceableGroup(-709043604);
            boolean zChanged = composerStartRestartGroup.changed(textColorAYXKKw);
            boolean zChanged2 = composerStartRestartGroup.changed(context);
            java.lang.Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if ((zChanged | zChanged2) || objRememberedValue2 == Composer.Companion.getEmpty()) {
                objRememberedValue2 = Color.m3139boximpl(ColorKt.Color(botUiState.AYXKKw().copydefault(context)));
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            long jM3159unboximpl = ((Color) objRememberedValue2).m3159unboximpl();
            composerStartRestartGroup.endReplaceableGroup();
            java.util.List<StrategyProfitResponse> listDjBIcL = botUiState.AhwBna().djBIcL();
            java.lang.String strGEmmrt = botUiState.gEmmrt();
            java.lang.String strFARcdN = botUiState.AhwBna().fARcdN();
            java.lang.String strFetchVPNInfo = botUiState.fetchVPNInfo();
            BotDisplayType botDisplayTypeOLrzqt = botUiState.OLrzqt();
            TextColor textColorAYXKKw2 = botUiState.AYXKKw();
            Modifier.Companion companion = Modifier.Companion;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            composerStartRestartGroup.startReplaceableGroup(733328855);
            Alignment.Companion companion2 = Alignment.Companion;
            MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(companion2.getTopStart(), false, composerStartRestartGroup, 0);
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
            Updater.m2790setimpl(composerM2783constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m2790setimpl(composerM2783constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, java.lang.Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (composerM2783constructorimpl.getInserting() || !Intrinsics.EZpvd(composerM2783constructorimpl.rememberedValue(), java.lang.Integer.valueOf(currentCompositeKeyHash))) {
                composerM2783constructorimpl.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash));
                composerM2783constructorimpl.apply(java.lang.Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            yhoModifierMaterializerOf.invoke(SkippableUpdater.m2774boximpl(SkippableUpdater.m2775constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            if (c53684wqD2.copydefault()) {
                composerStartRestartGroup.startReplaceableGroup(1685367050);
                if (z) {
                    composerStartRestartGroup.startReplaceableGroup(1685432119);
                    Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                    composerStartRestartGroup.startReplaceableGroup(-483455358);
                    MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), companion2.getStart(), composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(-1323940314);
                    int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
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
                    copydefault(textColorAYXKKw2, listDjBIcL, strGEmmrt, strFARcdN, strFetchVPNInfo, botDisplayTypeOLrzqt, jM3159unboximpl, true, function0, composerStartRestartGroup, ((i2 << 15) & 234881024) | 12582912);
                    C53651wpX.OLrzqt(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), botUiState.EZpvd(), botUiState.djBIcL(), botUiState.AkhnZx(), c53684wqD2.OLrzqt(), composerStartRestartGroup, 6, 0);
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                } else {
                    composerStartRestartGroup.startReplaceableGroup(1686326779);
                    C53651wpX.copydefault(null, strGEmmrt, jM3159unboximpl, botUiState.AkhnZx(), composerStartRestartGroup, 0, 1);
                    composerStartRestartGroup.endReplaceableGroup();
                }
                composerStartRestartGroup.endReplaceableGroup();
                composer2 = composerStartRestartGroup;
            } else {
                composerStartRestartGroup.startReplaceableGroup(1686589752);
                AnimatedVisibilityKt.AnimatedVisibility(!z, SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), EnterExitTransitionKt.fadeIn$default(AnimationSpecKt.tween$default(200, 0, OLrzqt, 2, null), 0.0f, 2, null), EnterExitTransitionKt.fadeOut$default(AnimationSpecKt.tween$default(50, 0, EasingKt.getFastOutLinearInEasing(), 2, null), 0.0f, 2, null), (java.lang.String) null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -629570974, true, new Application(botUiState, strGEmmrt, jM3159unboximpl)), composerStartRestartGroup, 197040, 16);
                composer2 = composerStartRestartGroup;
                AnimatedVisibilityKt.AnimatedVisibility(z, SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), EnterExitTransitionKt.fadeIn$default(copydefault, 0.0f, 2, null).plus(EnterExitTransitionKt.expandVertically$default(KWHzl, companion2.getTop(), false, null, 12, null)), EnterExitTransitionKt.fadeOut$default(AEQbTJ, 0.0f, 2, null).plus(EnterExitTransitionKt.shrinkVertically$default(EZpvd, companion2.getTop(), false, null, 12, null)), (java.lang.String) null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1096424217, true, new ActionBar(textColorAYXKKw2, listDjBIcL, strGEmmrt, strFARcdN, strFetchVPNInfo, botDisplayTypeOLrzqt, jM3159unboximpl, function0, botUiState, c53684wqD2)), composer2, (i2 & 14) | 200112, 16);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: o.wpQ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return C53643wpP.OLrzqt(z, botUiState, planetPublisherPluginPreviewType, function0, i, (Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: renamed from: o.wpP$Application */
    public static final class Application implements yHO<AnimatedVisibilityScope, Composer, java.lang.Integer, Unit> {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ BotUiState OLrzqt;
        public final /* synthetic */ java.lang.String copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(BotUiState botUiState, java.lang.String str, long j) {
            this.OLrzqt = botUiState;
            this.copydefault = str;
            this.AEQbTJ = j;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // o.yHO
        public /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer, java.lang.Integer num) {
            AEQbTJ(animatedVisibilityScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void AEQbTJ(AnimatedVisibilityScope animatedVisibilityScope, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(animatedVisibilityScope, "");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-629570974, i, -1, "com.okinc.tradingbot.impl.planet.ui.BotContent.<anonymous>.<anonymous> (BotContentCompose.kt:205)");
            }
            C53651wpX.copydefault(null, this.copydefault, this.AEQbTJ, this.OLrzqt.AkhnZx(), composer, 0, 1);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: renamed from: o.wpP$ActionBar */
    public static final class ActionBar implements yHO<AnimatedVisibilityScope, Composer, java.lang.Integer, Unit> {
        public final /* synthetic */ TextColor AEQbTJ;
        public final /* synthetic */ java.lang.String AYXKKw;
        public final /* synthetic */ java.lang.String AhwBna;
        public final /* synthetic */ Function0<Unit> EZpvd;
        public final /* synthetic */ BotDisplayType KWHzl;
        public final /* synthetic */ BotUiState OLrzqt;
        public final /* synthetic */ java.util.List<StrategyProfitResponse> copydefault;
        public final /* synthetic */ java.lang.String djBIcL;
        public final /* synthetic */ long gEmmrt;
        public final /* synthetic */ C53684wqD valueOf;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(TextColor textColor, java.util.List<StrategyProfitResponse> list, java.lang.String str, java.lang.String str2, java.lang.String str3, BotDisplayType botDisplayType, long j, Function0<Unit> function0, BotUiState botUiState, C53684wqD c53684wqD) {
            this.AEQbTJ = textColor;
            this.copydefault = list;
            this.djBIcL = str;
            this.AhwBna = str2;
            this.AYXKKw = str3;
            this.KWHzl = botDisplayType;
            this.gEmmrt = j;
            this.EZpvd = function0;
            this.OLrzqt = botUiState;
            this.valueOf = c53684wqD;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // o.yHO
        public /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer, java.lang.Integer num) {
            AEQbTJ(animatedVisibilityScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void AEQbTJ(AnimatedVisibilityScope animatedVisibilityScope, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(animatedVisibilityScope, "");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1096424217, i, -1, "com.okinc.tradingbot.impl.planet.ui.BotContent.<anonymous>.<anonymous> (BotContentCompose.kt:225)");
            }
            Modifier.Companion companion = Modifier.Companion;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            TextColor textColor = this.AEQbTJ;
            java.util.List<StrategyProfitResponse> list = this.copydefault;
            java.lang.String str = this.djBIcL;
            java.lang.String str2 = this.AhwBna;
            java.lang.String str3 = this.AYXKKw;
            BotDisplayType botDisplayType = this.KWHzl;
            long j = this.gEmmrt;
            Function0<Unit> function0 = this.EZpvd;
            BotUiState botUiState = this.OLrzqt;
            C53684wqD c53684wqD = this.valueOf;
            composer.startReplaceableGroup(-483455358);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composer, 0);
            composer.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
            yHO<SkippableUpdater<ComposeUiNode>, Composer, java.lang.Integer, Unit> yhoModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierFillMaxWidth$default);
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
            C53643wpP.copydefault(textColor, list, str, str2, str3, botDisplayType, j, false, function0, composer, 12582912);
            C53651wpX.OLrzqt(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), botUiState.EZpvd(), botUiState.djBIcL(), botUiState.AkhnZx(), c53684wqD.OLrzqt(), composer, 6, 0);
            composer.endReplaceableGroup();
            composer.endNode();
            composer.endReplaceableGroup();
            composer.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }
}
