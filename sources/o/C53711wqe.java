package o;

import androidx.compose.animation.ColorVectorConverterKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TransitionKt;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.animation.core.TwoWayConverter;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
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
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.geometry.CornerRadiusKt;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.colorspace.ColorSpace;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.Stroke;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.res.ColorResources_androidKt;
import com.amplifyframework.ui.liveness.ml.FaceDetector;
import com.okinc.business.defi.biz.core.error.WalletImportError;
import com.okinc.planet_api.publisher.PlanetPublisherPluginPreviewType;
import com.okinc.tradingbot.impl.common.model.TextColor;
import com.okinc.tradingbot.impl.planet.model.BotUiState;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import o.C53711wqe;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wqe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C53711wqe {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final Unit OLrzqt(Modifier modifier, BotUiState botUiState, PlanetPublisherPluginPreviewType planetPublisherPluginPreviewType, Function0 function0, int i, int i2, Composer composer, int i3) {
        EZpvd(modifier, botUiState, planetPublisherPluginPreviewType, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd() {
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [87=4] */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x02fb  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0356  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0362  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0366  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0393  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x040b  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0417  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x041b  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0448  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x047f  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0483  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x04c9  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x04d6  */
    /* JADX WARN: Removed duplicated region for block: B:164:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0212  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void EZpvd(Modifier modifier, @NotNull final BotUiState botUiState, PlanetPublisherPluginPreviewType planetPublisherPluginPreviewType, Function0<Unit> function0, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        PlanetPublisherPluginPreviewType planetPublisherPluginPreviewType2;
        int i4;
        Function0<Unit> function02;
        Function0<Unit> function03;
        boolean zBooleanValue;
        Function0<Unit> function04;
        int i5;
        int i6;
        boolean z;
        float f;
        PlanetPublisherPluginPreviewType planetPublisherPluginPreviewType3;
        final androidx.compose.runtime.State stateCreateTransitionAnimation;
        ColorSpace colorSpaceM3153getColorSpaceimpl;
        boolean zChanged;
        java.lang.Object objRememberedValue;
        final androidx.compose.runtime.State stateCreateTransitionAnimation2;
        boolean z2;
        boolean zChanged2;
        boolean zChanged3;
        java.lang.Object objRememberedValue2;
        final PlanetPublisherPluginPreviewType planetPublisherPluginPreviewType4;
        int currentCompositeKeyHash;
        Composer composerM2783constructorimpl;
        Function2<ComposeUiNode, java.lang.Integer, Unit> setCompositeKeyHash;
        int currentCompositeKeyHash2;
        Composer composerM2783constructorimpl2;
        Function2<ComposeUiNode, java.lang.Integer, Unit> setCompositeKeyHash2;
        Composer composer2;
        final PlanetPublisherPluginPreviewType planetPublisherPluginPreviewType5;
        final Modifier modifier3;
        final Function0<Unit> function05;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(botUiState, "");
        Composer composerStartRestartGroup = composer.startRestartGroup(239796325);
        int i7 = i2 & 1;
        if (i7 != 0) {
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
            i3 |= composerStartRestartGroup.changed(botUiState) ? 32 : 16;
        }
        int i8 = i2 & 4;
        if (i8 != 0) {
            i3 |= MLKEMEngine.KyberPolyBytes;
        } else {
            if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
                planetPublisherPluginPreviewType2 = planetPublisherPluginPreviewType;
                i3 |= composerStartRestartGroup.changed(planetPublisherPluginPreviewType2) ? 256 : 128;
            }
            i4 = i2 & 8;
            if (i4 != 0) {
                if ((i & 3072) == 0) {
                    function02 = function0;
                    i3 |= composerStartRestartGroup.changedInstance(function02) ? 2048 : 1024;
                }
                if ((i3 & 1171) == 1170 && composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.skipToGroupEnd();
                    modifier3 = modifier2;
                    composer2 = composerStartRestartGroup;
                    planetPublisherPluginPreviewType5 = planetPublisherPluginPreviewType2;
                    function05 = function02;
                } else {
                    if (i7 != 0) {
                        modifier2 = Modifier.Companion;
                    }
                    PlanetPublisherPluginPreviewType planetPublisherPluginPreviewType6 = i8 == 0 ? null : planetPublisherPluginPreviewType2;
                    if (i4 == 0) {
                        composerStartRestartGroup.startReplaceableGroup(1333743017);
                        java.lang.Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue3 == Composer.Companion.getEmpty()) {
                            objRememberedValue3 = new Function0() { // from class: o.wqk
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                @Override // kotlin.jvm.functions.Function0
                                public final java.lang.Object invoke() {
                                    return C53711wqe.EZpvd();
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        function03 = (Function0) objRememberedValue3;
                    } else {
                        function03 = function02;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(239796325, i3, -1, "com.okinc.tradingbot.impl.planet.ui.PlanetOngoingBot (PlanetOngoingBotCompose.kt:55)");
                    }
                    androidx.compose.runtime.State stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(function03, composerStartRestartGroup, (i3 >> 9) & 14);
                    int i9 = i3 >> 3;
                    C53649wpV c53649wpVAEQbTJ = AEQbTJ(botUiState, planetPublisherPluginPreviewType6, composerStartRestartGroup, (i9 & 14) | (i9 & WalletImportError.ERROR_CODE_AA_EXIST));
                    long jColorResource = ColorResources_androidKt.colorResource(C52761wXj.Activity.invokespecialDPHOMC, composerStartRestartGroup, 0);
                    androidx.compose.animation.core.Transition transitionUpdateTransition = TransitionKt.updateTransition(java.lang.Boolean.valueOf(botUiState.isConnected()), "bot selection transition", composerStartRestartGroup, 48, 0);
                    TaskDescription taskDescription = TaskDescription.OLrzqt;
                    composerStartRestartGroup.startReplaceableGroup(184732935);
                    TwoWayConverter<androidx.compose.ui.unit.Dp, AnimationVector1D> vectorConverter = VectorConvertersKt.getVectorConverter(androidx.compose.ui.unit.Dp.Companion);
                    composerStartRestartGroup.startReplaceableGroup(-142660079);
                    boolean zBooleanValue2 = ((java.lang.Boolean) transitionUpdateTransition.getCurrentState()).booleanValue();
                    composerStartRestartGroup.startReplaceableGroup(337103968);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(337103968, 0, -1, "com.okinc.tradingbot.impl.planet.ui.PlanetOngoingBot.<anonymous> (PlanetOngoingBotCompose.kt:86)");
                    }
                    float fM5414constructorimpl = androidx.compose.ui.unit.Dp.m5414constructorimpl(!zBooleanValue2 ? 1 : 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    androidx.compose.ui.unit.Dp dpM5412boximpl = androidx.compose.ui.unit.Dp.m5412boximpl(fM5414constructorimpl);
                    zBooleanValue = ((java.lang.Boolean) transitionUpdateTransition.getTargetState()).booleanValue();
                    composerStartRestartGroup.startReplaceableGroup(337103968);
                    if (ComposerKt.isTraceInProgress()) {
                        function04 = function03;
                        i5 = 0;
                        i6 = -1;
                    } else {
                        function04 = function03;
                        i5 = 0;
                        i6 = -1;
                        ComposerKt.traceEventStart(337103968, 0, -1, "com.okinc.tradingbot.impl.planet.ui.PlanetOngoingBot.<anonymous> (PlanetOngoingBotCompose.kt:86)");
                    }
                    if (zBooleanValue) {
                        z = true;
                        f = i5;
                    } else {
                        z = true;
                        f = 1;
                    }
                    float fM5414constructorimpl2 = androidx.compose.ui.unit.Dp.m5414constructorimpl(f);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    androidx.compose.ui.unit.Dp dpM5412boximpl2 = androidx.compose.ui.unit.Dp.m5412boximpl(fM5414constructorimpl2);
                    FiniteAnimationSpec<androidx.compose.ui.unit.Dp> finiteAnimationSpecInvoke = taskDescription.invoke(transitionUpdateTransition.getSegment(), composerStartRestartGroup, 0);
                    int i10 = i3;
                    planetPublisherPluginPreviewType3 = planetPublisherPluginPreviewType6;
                    int i11 = i6;
                    stateCreateTransitionAnimation = TransitionKt.createTransitionAnimation(transitionUpdateTransition, dpM5412boximpl, dpM5412boximpl2, finiteAnimationSpecInvoke, vectorConverter, "DpAnimation", composerStartRestartGroup, 0);
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    Activity activity = Activity.copydefault;
                    composerStartRestartGroup.startReplaceableGroup(-1939694975);
                    boolean zBooleanValue3 = ((java.lang.Boolean) transitionUpdateTransition.getTargetState()).booleanValue();
                    composerStartRestartGroup.startReplaceableGroup(-1475219428);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1475219428, 0, i11, "com.okinc.tradingbot.impl.planet.ui.PlanetOngoingBot.<anonymous> (PlanetOngoingBotCompose.kt:104)");
                    }
                    long jCopydefault = !zBooleanValue3 ? c53649wpVAEQbTJ.copydefault() : Color.Companion.m3184getTransparent0d7_KjU();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    colorSpaceM3153getColorSpaceimpl = Color.m3153getColorSpaceimpl(jCopydefault);
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged = composerStartRestartGroup.changed(colorSpaceM3153getColorSpaceimpl);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (!zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
                        objRememberedValue = (TwoWayConverter) ColorVectorConverterKt.getVectorConverter(Color.Companion).invoke(colorSpaceM3153getColorSpaceimpl);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    TwoWayConverter twoWayConverter = (TwoWayConverter) objRememberedValue;
                    composerStartRestartGroup.startReplaceableGroup(-142660079);
                    boolean zBooleanValue4 = ((java.lang.Boolean) transitionUpdateTransition.getCurrentState()).booleanValue();
                    composerStartRestartGroup.startReplaceableGroup(-1475219428);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1475219428, 0, i11, "com.okinc.tradingbot.impl.planet.ui.PlanetOngoingBot.<anonymous> (PlanetOngoingBotCompose.kt:104)");
                    }
                    long jCopydefault2 = !zBooleanValue4 ? c53649wpVAEQbTJ.copydefault() : Color.Companion.m3184getTransparent0d7_KjU();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Color colorM3139boximpl = Color.m3139boximpl(jCopydefault2);
                    boolean zBooleanValue5 = ((java.lang.Boolean) transitionUpdateTransition.getTargetState()).booleanValue();
                    composerStartRestartGroup.startReplaceableGroup(-1475219428);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1475219428, 0, i11, "com.okinc.tradingbot.impl.planet.ui.PlanetOngoingBot.<anonymous> (PlanetOngoingBotCompose.kt:104)");
                    }
                    long jCopydefault3 = !zBooleanValue5 ? c53649wpVAEQbTJ.copydefault() : Color.Companion.m3184getTransparent0d7_KjU();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    stateCreateTransitionAnimation2 = TransitionKt.createTransitionAnimation(transitionUpdateTransition, colorM3139boximpl, Color.m3139boximpl(jCopydefault3), activity.invoke(transitionUpdateTransition.getSegment(), composerStartRestartGroup, 0), twoWayConverter, "ColorAnimation", composerStartRestartGroup, 32768);
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    float f2 = 16;
                    Modifier modifierM349backgroundbw27NRU = BackgroundKt.m349backgroundbw27NRU(SizeKt.fillMaxWidth$default(modifier2, 0.0f, 1, null), jColorResource, RoundedCornerShapeKt.m924RoundedCornerShape0680j_4(androidx.compose.ui.unit.Dp.m5414constructorimpl(f2)));
                    composerStartRestartGroup.startReplaceableGroup(1333799261);
                    int i12 = i10 & FaceDetector.NUM_BOXES;
                    z2 = i12 != 256;
                    zChanged2 = composerStartRestartGroup.changed(stateCreateTransitionAnimation2);
                    zChanged3 = composerStartRestartGroup.changed(stateCreateTransitionAnimation);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if ((!(z2 | zChanged2) && !zChanged3) || objRememberedValue2 == Composer.Companion.getEmpty()) {
                        planetPublisherPluginPreviewType4 = planetPublisherPluginPreviewType3;
                        objRememberedValue2 = new Function1() { // from class: o.wql
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj) {
                                return C53711wqe.copydefault(planetPublisherPluginPreviewType4, stateCreateTransitionAnimation2, stateCreateTransitionAnimation, (DrawScope) obj);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    } else {
                        planetPublisherPluginPreviewType4 = planetPublisherPluginPreviewType3;
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Modifier modifierClip = ClipKt.clip(ComposedModifierKt.composed$default(DrawModifierKt.drawBehind(modifierM349backgroundbw27NRU, (Function1) objRememberedValue2), null, new ActionBar(c53649wpVAEQbTJ, stateRememberUpdatedState), 1, null), RoundedCornerShapeKt.m924RoundedCornerShape0680j_4(androidx.compose.ui.unit.Dp.m5414constructorimpl(f2)));
                    composerStartRestartGroup.startReplaceableGroup(733328855);
                    Alignment.Companion companion = Alignment.Companion;
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(companion.getTopStart(), false, composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(-1323940314);
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
                    Function0<ComposeUiNode> constructor = companion2.getConstructor();
                    yHO<SkippableUpdater<ComposeUiNode>, Composer, java.lang.Integer, Unit> yhoModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierClip);
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.useNode();
                    } else {
                        composerStartRestartGroup.createNode(constructor);
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
                    Modifier modifierM671padding3ABfNKs = PaddingKt.m671padding3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null).then(c53649wpVAEQbTJ.OLrzqt()), androidx.compose.ui.unit.Dp.m5414constructorimpl(f2));
                    Arrangement.HorizontalOrVertical horizontalOrVerticalM582spacedBy0680j_4 = Arrangement.INSTANCE.m582spacedBy0680j_4(androidx.compose.ui.unit.Dp.m5414constructorimpl(8));
                    composerStartRestartGroup.startReplaceableGroup(-483455358);
                    MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(horizontalOrVerticalM582spacedBy0680j_4, companion.getStart(), composerStartRestartGroup, 6);
                    composerStartRestartGroup.startReplaceableGroup(-1323940314);
                    currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
                    yHO<SkippableUpdater<ComposeUiNode>, Composer, java.lang.Integer, Unit> yhoModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierM671padding3ABfNKs);
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.useNode();
                    } else {
                        composerStartRestartGroup.createNode(constructor2);
                    }
                    composerM2783constructorimpl2 = Updater.m2783constructorimpl(composerStartRestartGroup);
                    Updater.m2790setimpl(composerM2783constructorimpl2, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                    Updater.m2790setimpl(composerM2783constructorimpl2, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
                    setCompositeKeyHash2 = companion2.getSetCompositeKeyHash();
                    if (!composerM2783constructorimpl2.getInserting() || !Intrinsics.EZpvd(composerM2783constructorimpl2.rememberedValue(), java.lang.Integer.valueOf(currentCompositeKeyHash2))) {
                        composerM2783constructorimpl2.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash2));
                        composerM2783constructorimpl2.apply(java.lang.Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                    }
                    yhoModifierMaterializerOf2.invoke(SkippableUpdater.m2774boximpl(SkippableUpdater.m2775constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(2058660585);
                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                    PlanetPublisherPluginPreviewType planetPublisherPluginPreviewType7 = planetPublisherPluginPreviewType4;
                    C53642wpO.AEQbTJ(botUiState.AEQbTJ(), botUiState.copydefault(), planetPublisherPluginPreviewType4 != null ? PlanetPublisherPluginPreviewType.PUBLISHER : planetPublisherPluginPreviewType4, botUiState.DbNXlk(), botUiState.values(), function04, composerStartRestartGroup, (i10 << 6) & 458752, 0);
                    Modifier modifier4 = modifier2;
                    composer2 = composerStartRestartGroup;
                    C53643wpP.copydefault(botUiState.isConnected(), botUiState, planetPublisherPluginPreviewType7, function04, composerStartRestartGroup, i12 | (i10 & WalletImportError.ERROR_CODE_AA_EXIST) | (i10 & 7168));
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
                    planetPublisherPluginPreviewType5 = planetPublisherPluginPreviewType7;
                    modifier3 = modifier4;
                    function05 = function04;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: o.wqj
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            return C53711wqe.OLrzqt(modifier3, botUiState, planetPublisherPluginPreviewType5, function05, i, i2, (Composer) obj, ((java.lang.Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 3072;
            function02 = function0;
            if ((i3 & 1171) == 1170) {
                if (i7 != 0) {
                }
                if (i8 == 0) {
                }
                if (i4 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                androidx.compose.runtime.State stateRememberUpdatedState2 = SnapshotStateKt.rememberUpdatedState(function03, composerStartRestartGroup, (i3 >> 9) & 14);
                int i92 = i3 >> 3;
                C53649wpV c53649wpVAEQbTJ2 = AEQbTJ(botUiState, planetPublisherPluginPreviewType6, composerStartRestartGroup, (i92 & 14) | (i92 & WalletImportError.ERROR_CODE_AA_EXIST));
                long jColorResource2 = ColorResources_androidKt.colorResource(C52761wXj.Activity.invokespecialDPHOMC, composerStartRestartGroup, 0);
                androidx.compose.animation.core.Transition transitionUpdateTransition2 = TransitionKt.updateTransition(java.lang.Boolean.valueOf(botUiState.isConnected()), "bot selection transition", composerStartRestartGroup, 48, 0);
                TaskDescription taskDescription2 = TaskDescription.OLrzqt;
                composerStartRestartGroup.startReplaceableGroup(184732935);
                TwoWayConverter<androidx.compose.ui.unit.Dp, AnimationVector1D> vectorConverter2 = VectorConvertersKt.getVectorConverter(androidx.compose.ui.unit.Dp.Companion);
                composerStartRestartGroup.startReplaceableGroup(-142660079);
                boolean zBooleanValue22 = ((java.lang.Boolean) transitionUpdateTransition2.getCurrentState()).booleanValue();
                composerStartRestartGroup.startReplaceableGroup(337103968);
                if (ComposerKt.isTraceInProgress()) {
                }
                float fM5414constructorimpl3 = androidx.compose.ui.unit.Dp.m5414constructorimpl(!zBooleanValue22 ? 1 : 0);
                if (ComposerKt.isTraceInProgress()) {
                }
                composerStartRestartGroup.endReplaceableGroup();
                androidx.compose.ui.unit.Dp dpM5412boximpl3 = androidx.compose.ui.unit.Dp.m5412boximpl(fM5414constructorimpl3);
                zBooleanValue = ((java.lang.Boolean) transitionUpdateTransition2.getTargetState()).booleanValue();
                composerStartRestartGroup.startReplaceableGroup(337103968);
                if (ComposerKt.isTraceInProgress()) {
                }
                if (zBooleanValue) {
                }
                float fM5414constructorimpl22 = androidx.compose.ui.unit.Dp.m5414constructorimpl(f);
                if (ComposerKt.isTraceInProgress()) {
                }
                composerStartRestartGroup.endReplaceableGroup();
                androidx.compose.ui.unit.Dp dpM5412boximpl22 = androidx.compose.ui.unit.Dp.m5412boximpl(fM5414constructorimpl22);
                FiniteAnimationSpec<androidx.compose.ui.unit.Dp> finiteAnimationSpecInvoke2 = taskDescription2.invoke(transitionUpdateTransition2.getSegment(), composerStartRestartGroup, 0);
                int i102 = i3;
                planetPublisherPluginPreviewType3 = planetPublisherPluginPreviewType6;
                int i112 = i6;
                stateCreateTransitionAnimation = TransitionKt.createTransitionAnimation(transitionUpdateTransition2, dpM5412boximpl3, dpM5412boximpl22, finiteAnimationSpecInvoke2, vectorConverter2, "DpAnimation", composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                Activity activity2 = Activity.copydefault;
                composerStartRestartGroup.startReplaceableGroup(-1939694975);
                boolean zBooleanValue32 = ((java.lang.Boolean) transitionUpdateTransition2.getTargetState()).booleanValue();
                composerStartRestartGroup.startReplaceableGroup(-1475219428);
                if (ComposerKt.isTraceInProgress()) {
                }
                if (!zBooleanValue32) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                composerStartRestartGroup.endReplaceableGroup();
                colorSpaceM3153getColorSpaceimpl = Color.m3153getColorSpaceimpl(jCopydefault);
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                zChanged = composerStartRestartGroup.changed(colorSpaceM3153getColorSpaceimpl);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!zChanged) {
                    objRememberedValue = (TwoWayConverter) ColorVectorConverterKt.getVectorConverter(Color.Companion).invoke(colorSpaceM3153getColorSpaceimpl);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    composerStartRestartGroup.endReplaceableGroup();
                    TwoWayConverter twoWayConverter2 = (TwoWayConverter) objRememberedValue;
                    composerStartRestartGroup.startReplaceableGroup(-142660079);
                    boolean zBooleanValue42 = ((java.lang.Boolean) transitionUpdateTransition2.getCurrentState()).booleanValue();
                    composerStartRestartGroup.startReplaceableGroup(-1475219428);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    if (!zBooleanValue42) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Color colorM3139boximpl2 = Color.m3139boximpl(jCopydefault2);
                    boolean zBooleanValue52 = ((java.lang.Boolean) transitionUpdateTransition2.getTargetState()).booleanValue();
                    composerStartRestartGroup.startReplaceableGroup(-1475219428);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    if (!zBooleanValue52) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    stateCreateTransitionAnimation2 = TransitionKt.createTransitionAnimation(transitionUpdateTransition2, colorM3139boximpl2, Color.m3139boximpl(jCopydefault3), activity2.invoke(transitionUpdateTransition2.getSegment(), composerStartRestartGroup, 0), twoWayConverter2, "ColorAnimation", composerStartRestartGroup, 32768);
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    float f22 = 16;
                    Modifier modifierM349backgroundbw27NRU2 = BackgroundKt.m349backgroundbw27NRU(SizeKt.fillMaxWidth$default(modifier2, 0.0f, 1, null), jColorResource2, RoundedCornerShapeKt.m924RoundedCornerShape0680j_4(androidx.compose.ui.unit.Dp.m5414constructorimpl(f22)));
                    composerStartRestartGroup.startReplaceableGroup(1333799261);
                    int i122 = i102 & FaceDetector.NUM_BOXES;
                    if (i122 != 256) {
                    }
                    zChanged2 = composerStartRestartGroup.changed(stateCreateTransitionAnimation2);
                    zChanged3 = composerStartRestartGroup.changed(stateCreateTransitionAnimation);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (!(z2 | zChanged2 | zChanged3)) {
                        planetPublisherPluginPreviewType4 = planetPublisherPluginPreviewType3;
                        objRememberedValue2 = new Function1() { // from class: o.wql
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj) {
                                return C53711wqe.copydefault(planetPublisherPluginPreviewType4, stateCreateTransitionAnimation2, stateCreateTransitionAnimation, (DrawScope) obj);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        composerStartRestartGroup.endReplaceableGroup();
                        Modifier modifierClip2 = ClipKt.clip(ComposedModifierKt.composed$default(DrawModifierKt.drawBehind(modifierM349backgroundbw27NRU2, (Function1) objRememberedValue2), null, new ActionBar(c53649wpVAEQbTJ2, stateRememberUpdatedState2), 1, null), RoundedCornerShapeKt.m924RoundedCornerShape0680j_4(androidx.compose.ui.unit.Dp.m5414constructorimpl(f22)));
                        composerStartRestartGroup.startReplaceableGroup(733328855);
                        Alignment.Companion companion3 = Alignment.Companion;
                        MeasurePolicy measurePolicyRememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(companion3.getTopStart(), false, composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(-1323940314);
                        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        ComposeUiNode.Companion companion22 = ComposeUiNode.Companion;
                        Function0<ComposeUiNode> constructor3 = companion22.getConstructor();
                        yHO<SkippableUpdater<ComposeUiNode>, Composer, java.lang.Integer, Unit> yhoModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(modifierClip2);
                        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                        }
                        composerM2783constructorimpl = Updater.m2783constructorimpl(composerStartRestartGroup);
                        Updater.m2790setimpl(composerM2783constructorimpl, measurePolicyRememberBoxMeasurePolicy2, companion22.getSetMeasurePolicy());
                        Updater.m2790setimpl(composerM2783constructorimpl, currentCompositionLocalMap3, companion22.getSetResolvedCompositionLocals());
                        setCompositeKeyHash = companion22.getSetCompositeKeyHash();
                        if (!composerM2783constructorimpl.getInserting()) {
                            composerM2783constructorimpl.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash));
                            composerM2783constructorimpl.apply(java.lang.Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                            yhoModifierMaterializerOf3.invoke(SkippableUpdater.m2774boximpl(SkippableUpdater.m2775constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                            composerStartRestartGroup.startReplaceableGroup(2058660585);
                            BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                            Modifier modifierM671padding3ABfNKs2 = PaddingKt.m671padding3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null).then(c53649wpVAEQbTJ2.OLrzqt()), androidx.compose.ui.unit.Dp.m5414constructorimpl(f22));
                            Arrangement.HorizontalOrVertical horizontalOrVerticalM582spacedBy0680j_42 = Arrangement.INSTANCE.m582spacedBy0680j_4(androidx.compose.ui.unit.Dp.m5414constructorimpl(8));
                            composerStartRestartGroup.startReplaceableGroup(-483455358);
                            MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(horizontalOrVerticalM582spacedBy0680j_42, companion3.getStart(), composerStartRestartGroup, 6);
                            composerStartRestartGroup.startReplaceableGroup(-1323940314);
                            currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap22 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                            Function0<ComposeUiNode> constructor22 = companion22.getConstructor();
                            yHO<SkippableUpdater<ComposeUiNode>, Composer, java.lang.Integer, Unit> yhoModifierMaterializerOf22 = LayoutKt.modifierMaterializerOf(modifierM671padding3ABfNKs2);
                            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                            }
                            composerStartRestartGroup.startReusableNode();
                            if (composerStartRestartGroup.getInserting()) {
                            }
                            composerM2783constructorimpl2 = Updater.m2783constructorimpl(composerStartRestartGroup);
                            Updater.m2790setimpl(composerM2783constructorimpl2, measurePolicyColumnMeasurePolicy2, companion22.getSetMeasurePolicy());
                            Updater.m2790setimpl(composerM2783constructorimpl2, currentCompositionLocalMap22, companion22.getSetResolvedCompositionLocals());
                            setCompositeKeyHash2 = companion22.getSetCompositeKeyHash();
                            if (!composerM2783constructorimpl2.getInserting()) {
                                composerM2783constructorimpl2.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash2));
                                composerM2783constructorimpl2.apply(java.lang.Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                yhoModifierMaterializerOf22.invoke(SkippableUpdater.m2774boximpl(SkippableUpdater.m2775constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                                composerStartRestartGroup.startReplaceableGroup(2058660585);
                                ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                                if (planetPublisherPluginPreviewType4 != null) {
                                }
                                PlanetPublisherPluginPreviewType planetPublisherPluginPreviewType72 = planetPublisherPluginPreviewType4;
                                C53642wpO.AEQbTJ(botUiState.AEQbTJ(), botUiState.copydefault(), planetPublisherPluginPreviewType4 != null ? PlanetPublisherPluginPreviewType.PUBLISHER : planetPublisherPluginPreviewType4, botUiState.DbNXlk(), botUiState.values(), function04, composerStartRestartGroup, (i102 << 6) & 458752, 0);
                                Modifier modifier42 = modifier2;
                                composer2 = composerStartRestartGroup;
                                C53643wpP.copydefault(botUiState.isConnected(), botUiState, planetPublisherPluginPreviewType72, function04, composerStartRestartGroup, i122 | (i102 & WalletImportError.ERROR_CODE_AA_EXIST) | (i102 & 7168));
                                composer2.endReplaceableGroup();
                                composer2.endNode();
                                composer2.endReplaceableGroup();
                                composer2.endReplaceableGroup();
                                composer2.endReplaceableGroup();
                                composer2.endNode();
                                composer2.endReplaceableGroup();
                                composer2.endReplaceableGroup();
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                planetPublisherPluginPreviewType5 = planetPublisherPluginPreviewType72;
                                modifier3 = modifier42;
                                function05 = function04;
                            }
                        }
                    }
                }
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        planetPublisherPluginPreviewType2 = planetPublisherPluginPreviewType;
        i4 = i2 & 8;
        if (i4 != 0) {
        }
        function02 = function0;
        if ((i3 & 1171) == 1170) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX INFO: renamed from: o.wqe$TaskDescription */
    public static final class TaskDescription implements yHO<Transition.Segment<java.lang.Boolean>, Composer, java.lang.Integer, FiniteAnimationSpec<androidx.compose.ui.unit.Dp>> {
        public static final TaskDescription OLrzqt = new TaskDescription();

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // o.yHO
        public /* synthetic */ FiniteAnimationSpec<androidx.compose.ui.unit.Dp> invoke(Transition.Segment<java.lang.Boolean> segment, Composer composer, java.lang.Integer num) {
            return OLrzqt(segment, composer, num.intValue());
        }

        public final FiniteAnimationSpec<androidx.compose.ui.unit.Dp> OLrzqt(Transition.Segment<java.lang.Boolean> segment, Composer composer, int i) {
            TweenSpec tweenSpecTween$default;
            Intrinsics.checkNotNullParameter(segment, "");
            composer.startReplaceableGroup(1188884557);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1188884557, i, -1, "com.okinc.tradingbot.impl.planet.ui.PlanetOngoingBot.<anonymous> (PlanetOngoingBotCompose.kt:73)");
            }
            if (segment.getTargetState().booleanValue()) {
                tweenSpecTween$default = AnimationSpecKt.tween$default(260, 0, EasingKt.getFastOutSlowInEasing(), 2, null);
            } else {
                tweenSpecTween$default = AnimationSpecKt.tween$default(200, 0, EasingKt.getFastOutLinearInEasing(), 2, null);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceableGroup();
            return tweenSpecTween$default;
        }
    }

    /* JADX INFO: renamed from: o.wqe$Activity */
    public static final class Activity implements yHO<Transition.Segment<java.lang.Boolean>, Composer, java.lang.Integer, FiniteAnimationSpec<Color>> {
        public static final Activity copydefault = new Activity();

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // o.yHO
        public /* synthetic */ FiniteAnimationSpec<Color> invoke(Transition.Segment<java.lang.Boolean> segment, Composer composer, java.lang.Integer num) {
            return copydefault(segment, composer, num.intValue());
        }

        public final FiniteAnimationSpec<Color> copydefault(Transition.Segment<java.lang.Boolean> segment, Composer composer, int i) {
            TweenSpec tweenSpecTween$default;
            Intrinsics.checkNotNullParameter(segment, "");
            composer.startReplaceableGroup(776632368);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(776632368, i, -1, "com.okinc.tradingbot.impl.planet.ui.PlanetOngoingBot.<anonymous> (PlanetOngoingBotCompose.kt:91)");
            }
            if (segment.getTargetState().booleanValue()) {
                tweenSpecTween$default = AnimationSpecKt.tween$default(260, 0, EasingKt.getFastOutSlowInEasing(), 2, null);
            } else {
                tweenSpecTween$default = AnimationSpecKt.tween$default(200, 0, EasingKt.getFastOutLinearInEasing(), 2, null);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceableGroup();
            return tweenSpecTween$default;
        }
    }

    public static final Unit copydefault(PlanetPublisherPluginPreviewType planetPublisherPluginPreviewType, androidx.compose.runtime.State state, androidx.compose.runtime.State state2, DrawScope drawScope) {
        Intrinsics.checkNotNullParameter(drawScope, "");
        if (planetPublisherPluginPreviewType == null) {
            float f = 16;
            DrawScope.m3688drawRoundRectuAw5IA$default(drawScope, copydefault(state), 0L, 0L, CornerRadiusKt.CornerRadius(drawScope.mo516toPx0680j_4(androidx.compose.ui.unit.Dp.m5414constructorimpl(f)), drawScope.mo516toPx0680j_4(androidx.compose.ui.unit.Dp.m5414constructorimpl(f))), new Stroke(drawScope.mo516toPx0680j_4(AEQbTJ(state2)), 0.0f, 0, 0, null, 30, null), 0.0f, null, 0, 230, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.wqe$ActionBar */
    public static final class ActionBar implements yHO<Modifier, Composer, java.lang.Integer, Modifier> {
        public final /* synthetic */ C53649wpV KWHzl;
        public final /* synthetic */ androidx.compose.runtime.State<Function0<Unit>> OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: androidx.compose.runtime.State<? extends kotlin.jvm.functions.Function0<kotlin.Unit>> */
        /* JADX WARN: Multi-variable type inference failed */
        public ActionBar(C53649wpV c53649wpV, androidx.compose.runtime.State<? extends Function0<Unit>> state) {
            this.KWHzl = c53649wpV;
            this.OLrzqt = state;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // o.yHO
        public /* synthetic */ Modifier invoke(Modifier modifier, Composer composer, java.lang.Integer num) {
            return EZpvd(modifier, composer, num.intValue());
        }

        public final Modifier EZpvd(Modifier modifier, Composer composer, int i) {
            Modifier modifierEZpvd;
            Intrinsics.checkNotNullParameter(modifier, "");
            composer.startReplaceableGroup(1841034153);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1841034153, i, -1, "com.okinc.tradingbot.impl.planet.ui.PlanetOngoingBot.<anonymous> (PlanetOngoingBotCompose.kt:125)");
            }
            if (this.KWHzl.AEQbTJ()) {
                modifierEZpvd = Modifier.Companion;
            } else {
                Modifier.Companion companion = Modifier.Companion;
                composer.startReplaceableGroup(1913725060);
                boolean zChanged = composer.changed(this.OLrzqt);
                final androidx.compose.runtime.State<Function0<Unit>> state = this.OLrzqt;
                java.lang.Object objRememberedValue = composer.rememberedValue();
                if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: o.wqm
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return C53711wqe.ActionBar.AEQbTJ(state);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue);
                }
                composer.endReplaceableGroup();
                modifierEZpvd = C49551uqg.EZpvd(companion, (Function0) objRememberedValue);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceableGroup();
            return modifierEZpvd;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit AEQbTJ(androidx.compose.runtime.State state) {
            C53711wqe.EZpvd(state).invoke();
            return Unit.INSTANCE;
        }
    }

    /* JADX DEBUG: Class process forced to load method for inline: androidx.compose.foundation.BackgroundKt.background$default(androidx.compose.ui.Modifier, androidx.compose.ui.graphics.Brush, androidx.compose.ui.graphics.Shape, float, int, java.lang.Object):androidx.compose.ui.Modifier */
    public static final C53649wpV AEQbTJ(BotUiState botUiState, PlanetPublisherPluginPreviewType planetPublisherPluginPreviewType, Composer composer, int i) {
        kotlin.Pair[] pairArr;
        Modifier modifierBackground$default;
        composer.startReplaceableGroup(-67151429);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-67151429, i, -1, "com.okinc.tradingbot.impl.planet.ui.rememberBotItemUiState (PlanetOngoingBotCompose.kt:211)");
        }
        android.content.Context context = (android.content.Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext());
        long jColorResource = ColorResources_androidKt.colorResource(C52761wXj.Activity.fdOvFl, composer, 0);
        java.lang.Object objAYXKKw = botUiState.AYXKKw();
        boolean zIsConnected = botUiState.isConnected();
        composer.startReplaceableGroup(888499895);
        boolean zChanged = composer.changed(objAYXKKw);
        boolean zChanged2 = composer.changed(zIsConnected);
        boolean z = (((i & WalletImportError.ERROR_CODE_AA_EXIST) ^ 48) > 32 && composer.changed(planetPublisherPluginPreviewType)) || (i & 48) == 32;
        boolean zChanged3 = composer.changed(context);
        java.lang.Object objRememberedValue = composer.rememberedValue();
        if ((z | zChanged | zChanged2 | zChanged3) || objRememberedValue == Composer.Companion.getEmpty()) {
            TextColor textColorAYXKKw = botUiState.AYXKKw();
            if (Intrinsics.EZpvd(textColorAYXKKw, TextColor.Down.copydefault)) {
                C33512mxp c33512mxp = C33512mxp.AEQbTJ;
                int iIsConnected = c33512mxp.isConnected(context, 0.0f);
                pairArr = new kotlin.Pair[]{C56390yDp.OLrzqt(java.lang.Float.valueOf(0.0f), Color.m3139boximpl(ColorKt.Color(iIsConnected))), C56390yDp.OLrzqt(java.lang.Float.valueOf(0.5f), Color.m3139boximpl(ColorKt.Color(iIsConnected))), C56390yDp.OLrzqt(java.lang.Float.valueOf(0.7f), Color.m3139boximpl(ColorKt.Color(c33512mxp.isConnected(context, 0.1f)))), C56390yDp.OLrzqt(java.lang.Float.valueOf(0.85f), Color.m3139boximpl(ColorKt.Color(c33512mxp.isConnected(context, 0.15f)))), C56390yDp.OLrzqt(java.lang.Float.valueOf(1.0f), Color.m3139boximpl(ColorKt.Color(c33512mxp.isConnected(context, 0.2f))))};
            } else if (Intrinsics.EZpvd(textColorAYXKKw, TextColor.Up.copydefault)) {
                C33512mxp c33512mxp2 = C33512mxp.AEQbTJ;
                int iZLjUOn = c33512mxp2.zLjUOn(context, 0.0f);
                pairArr = new kotlin.Pair[]{C56390yDp.OLrzqt(java.lang.Float.valueOf(0.0f), Color.m3139boximpl(ColorKt.Color(iZLjUOn))), C56390yDp.OLrzqt(java.lang.Float.valueOf(0.5f), Color.m3139boximpl(ColorKt.Color(iZLjUOn))), C56390yDp.OLrzqt(java.lang.Float.valueOf(0.7f), Color.m3139boximpl(ColorKt.Color(c33512mxp2.zLjUOn(context, 0.1f)))), C56390yDp.OLrzqt(java.lang.Float.valueOf(0.85f), Color.m3139boximpl(ColorKt.Color(c33512mxp2.zLjUOn(context, 0.15f)))), C56390yDp.OLrzqt(java.lang.Float.valueOf(1.0f), Color.m3139boximpl(ColorKt.Color(c33512mxp2.zLjUOn(context, 0.2f))))};
            } else {
                if (!Intrinsics.EZpvd(textColorAYXKKw, TextColor.Zero.OLrzqt)) {
                    throw new NoWhenBranchMatchedException();
                }
                Color.Companion companion = Color.Companion;
                pairArr = new kotlin.Pair[]{C56390yDp.OLrzqt(java.lang.Float.valueOf(0.0f), Color.m3139boximpl(companion.m3184getTransparent0d7_KjU())), C56390yDp.OLrzqt(java.lang.Float.valueOf(1.0f), Color.m3139boximpl(companion.m3184getTransparent0d7_KjU()))};
            }
            kotlin.Pair[] pairArr2 = pairArr;
            boolean z2 = planetPublisherPluginPreviewType != null;
            if (botUiState.isConnected()) {
                modifierBackground$default = BackgroundKt.background$default(Modifier.Companion, Brush.Companion.m3107verticalGradient8A3gB4$default(Brush.Companion, (kotlin.Pair[]) java.util.Arrays.copyOf(pairArr2, pairArr2.length), 0.0f, 0.0f, 0, 14, (java.lang.Object) null), RoundedCornerShapeKt.m924RoundedCornerShape0680j_4(androidx.compose.ui.unit.Dp.m5414constructorimpl(16)), 0.0f, 4, null);
            } else {
                modifierBackground$default = Modifier.Companion;
            }
            java.lang.Object c53649wpV = new C53649wpV(pairArr2, z2, modifierBackground$default, jColorResource, null);
            composer.updateRememberedValue(c53649wpV);
            objRememberedValue = c53649wpV;
        }
        C53649wpV c53649wpV2 = (C53649wpV) objRememberedValue;
        composer.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return c53649wpV2;
    }

    public static final Function0<Unit> EZpvd(androidx.compose.runtime.State<? extends Function0<Unit>> state) {
        return state.getValue();
    }

    public static final float AEQbTJ(androidx.compose.runtime.State<androidx.compose.ui.unit.Dp> state) {
        return state.getValue().m5428unboximpl();
    }

    public static final long copydefault(androidx.compose.runtime.State<Color> state) {
        return state.getValue().m3159unboximpl();
    }
}
