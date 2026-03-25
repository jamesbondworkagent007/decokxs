package o;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListItemInfo;
import androidx.compose.foundation.lazy.LazyListLayoutInfo;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.ZIndexModifierKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSize;
import androidx.profileinstaller.ProfileVerifier;
import com.amplifyframework.ui.liveness.ml.FaceDetector;
import com.okinc.business.defi.biz.core.error.WalletImportError;
import com.okinc.cruilib.compose.library.reorderable.ReorderableLazyListKt$ReorderableItem$2$1;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class mEF {

    public final /* synthetic */ class TaskDescription {
        public static final /* synthetic */ int[] EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[Orientation.values().length];
            try {
                iArr[Orientation.Vertical.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[Orientation.Horizontal.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            EZpvd = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final Unit KWHzl(LazyItemScope lazyItemScope, mEL mel, java.lang.Object obj, Modifier modifier, boolean z, yHT yht, int i, int i2, Composer composer, int i3) {
        copydefault(lazyItemScope, mel, obj, modifier, z, yht, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final mEL EZpvd(@NotNull LazyListState lazyListState, float f, float f2, boolean z, @NotNull Function2<? super LazyListItemInfo, ? super LazyListItemInfo, Unit> function2, Composer composer, int i, int i2) {
        Intrinsics.checkNotNullParameter(lazyListState, "");
        Intrinsics.checkNotNullParameter(function2, "");
        composer.startReplaceableGroup(-964384920);
        float fAEQbTJ = (i2 & 2) != 0 ? mEB.OLrzqt.AEQbTJ() : f;
        float f3 = (i2 & 4) != 0 ? 0.05f : f2;
        boolean z2 = (i2 & 8) != 0 ? false : z;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-964384920, i, -1, "com.okinc.cruilib.compose.library.reorderable.rememberReorderableLazyColumnState (ReorderableLazyList.kt:86)");
        }
        int i3 = i << 3;
        mEL melOLrzqt = OLrzqt(lazyListState, fAEQbTJ, f3, Orientation.Vertical, z2, function2, composer, (i & FaceDetector.NUM_BOXES) | (i & 14) | 3072 | (i & WalletImportError.ERROR_CODE_AA_EXIST) | (57344 & i3) | (i3 & 458752));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return melOLrzqt;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final mEL OLrzqt(@NotNull LazyListState lazyListState, float f, float f2, @NotNull Orientation orientation, boolean z, @NotNull Function2<? super LazyListItemInfo, ? super LazyListItemInfo, Unit> function2, Composer composer, int i) {
        boolean z2;
        boolean z3;
        Intrinsics.checkNotNullParameter(lazyListState, "");
        Intrinsics.checkNotNullParameter(orientation, "");
        Intrinsics.checkNotNullParameter(function2, "");
        composer.startReplaceableGroup(-962914276);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-962914276, i, -1, "com.okinc.cruilib.compose.library.reorderable.rememberReorderableLazyListState (ReorderableLazyList.kt:130)");
        }
        float fMo516toPx0680j_4 = ((Density) composer.consume(CompositionLocalsKt.getLocalDensity())).mo516toPx0680j_4(f);
        composer.startReplaceableGroup(773894976);
        composer.startReplaceableGroup(-492369756);
        java.lang.Object objRememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.Companion;
        if (objRememberedValue == companion.getEmpty()) {
            java.lang.Object compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composer));
            composer.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
            objRememberedValue = compositionScopedCoroutineScopeCanceller;
        }
        composer.endReplaceableGroup();
        CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope();
        composer.endReplaceableGroup();
        androidx.compose.runtime.State stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(function2, composer, (i >> 15) & 14);
        composer.startReplaceableGroup(1868788209);
        boolean zChanged = composer.changed(coroutineScope);
        boolean z4 = (((i & 14) ^ 6) > 4 && composer.changed(lazyListState)) || (i & 6) == 4;
        boolean z5 = (((i & WalletImportError.ERROR_CODE_AA_EXIST) ^ 48) > 32 && composer.changed(f)) || (i & 48) == 32;
        if (((i & FaceDetector.NUM_BOXES) ^ MLKEMEngine.KyberPolyBytes) <= 256 || !composer.changed(f2)) {
            z2 = (i & MLKEMEngine.KyberPolyBytes) == 256;
        }
        if (((57344 & i) ^ 24576) <= 16384 || !composer.changed(z)) {
            z3 = (i & 24576) == 16384;
        }
        java.lang.Object objRememberedValue2 = composer.rememberedValue();
        if ((z5 | zChanged | z4 | z2 | z3) || objRememberedValue2 == companion.getEmpty()) {
            java.lang.Object mel = new mEL(lazyListState, coroutineScope, stateRememberUpdatedState, orientation, z, fMo516toPx0680j_4, f2);
            composer.updateRememberedValue(mel);
            objRememberedValue2 = mel;
        }
        mEL mel2 = (mEL) objRememberedValue2;
        composer.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return mel2;
    }

    public static final kotlin.Pair<java.lang.Integer, java.lang.Integer> OLrzqt(LazyListLayoutInfo lazyListLayoutInfo, Orientation orientation, boolean z) {
        int iM5573getHeightimpl;
        int beforeContentPadding = !z ? lazyListLayoutInfo.getBeforeContentPadding() - lazyListLayoutInfo.getAfterContentPadding() : 0;
        int i = TaskDescription.EZpvd[orientation.ordinal()];
        if (i == 1) {
            iM5573getHeightimpl = IntSize.m5573getHeightimpl(lazyListLayoutInfo.mo774getViewportSizeYbymL2g());
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            iM5573getHeightimpl = IntSize.m5574getWidthimpl(lazyListLayoutInfo.mo774getViewportSizeYbymL2g());
        }
        return C56390yDp.OLrzqt(0, java.lang.Integer.valueOf(iM5573getHeightimpl - beforeContentPadding));
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0335  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0337  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x034e  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x036d  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0378  */
    /* JADX WARN: Removed duplicated region for block: B:156:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x011f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void copydefault(@NotNull final LazyItemScope lazyItemScope, @NotNull final mEL mel, @NotNull final java.lang.Object obj, Modifier modifier, boolean z, @NotNull final yHT<? super InterfaceC31808mEr, ? super java.lang.Boolean, ? super Composer, ? super java.lang.Integer, Unit> yht, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        boolean z2;
        Modifier modifier3;
        androidx.compose.runtime.State<java.lang.Boolean> stateAEQbTJ;
        java.lang.Object objRememberedValue;
        Composer.Companion companion;
        Modifier modifierAnimateItemPlacement$default;
        Modifier modifierOnGloballyPositioned;
        Modifier modifierGraphicsLayer;
        int currentCompositeKeyHash;
        Composer composerM2783constructorimpl;
        Function2<ComposeUiNode, java.lang.Integer, Unit> setCompositeKeyHash;
        boolean z3;
        boolean zChangedInstance;
        boolean zChangedInstance2;
        java.lang.Object objRememberedValue2;
        Modifier modifierGraphicsLayer2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(lazyItemScope, "");
        Intrinsics.checkNotNullParameter(mel, "");
        Intrinsics.checkNotNullParameter(obj, "");
        Intrinsics.checkNotNullParameter(yht, "");
        Composer composerStartRestartGroup = composer.startRestartGroup(1182147049);
        if ((i2 & Integer.MIN_VALUE) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(lazyItemScope) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 1) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(mel) ? 32 : 16;
        }
        if ((i2 & 2) != 0) {
            i3 |= MLKEMEngine.KyberPolyBytes;
        } else if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(obj) ? 256 : 128;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 |= 3072;
        } else {
            if ((i & 3072) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
            }
            i4 = i2 & 8;
            if (i4 != 0) {
                if ((i & 24576) == 0) {
                    z2 = z;
                    i3 |= composerStartRestartGroup.changed(z2) ? 16384 : 8192;
                }
                if ((i2 & 16) != 0) {
                    i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                    i3 |= composerStartRestartGroup.changedInstance(yht) ? 131072 : 65536;
                }
                if ((74899 & i3) != 74898 || !composerStartRestartGroup.getSkipping()) {
                    modifier3 = i5 == 0 ? Modifier.Companion : modifier2;
                    if (i4 != 0) {
                        z2 = true;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1182147049, i3, -1, "com.okinc.cruilib.compose.library.reorderable.ReorderableItem (ReorderableLazyList.kt:704)");
                    }
                    final Orientation orientationDjBIcL = mel.djBIcL();
                    stateAEQbTJ = mel.AEQbTJ(obj);
                    final Ref.FloatRef floatRef = new Ref.FloatRef();
                    composerStartRestartGroup.startReplaceableGroup(204102154);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion = Composer.Companion;
                    if (objRememberedValue == companion.getEmpty()) {
                        objRememberedValue = java.lang.Float.valueOf(0.0f);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    float fFloatValue = ((java.lang.Number) objRememberedValue).floatValue();
                    composerStartRestartGroup.endReplaceableGroup();
                    floatRef.element = fFloatValue;
                    if (!KWHzl(stateAEQbTJ)) {
                        composerStartRestartGroup.startReplaceableGroup(2032270687);
                        Modifier.Companion companion2 = Modifier.Companion;
                        Modifier modifierZIndex = ZIndexModifierKt.zIndex(companion2, 1.0f);
                        int i6 = TaskDescription.EZpvd[orientationDjBIcL.ordinal()];
                        if (i6 == 1) {
                            composerStartRestartGroup.startReplaceableGroup(204108947);
                            composerStartRestartGroup.startReplaceableGroup(204109381);
                            boolean zChangedInstance3 = composerStartRestartGroup.changedInstance(mel);
                            java.lang.Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                            if (zChangedInstance3 || objRememberedValue3 == companion.getEmpty()) {
                                objRememberedValue3 = new Function1() { // from class: o.mEE
                                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                    @Override // kotlin.jvm.functions.Function1
                                    public final java.lang.Object invoke(java.lang.Object obj2) {
                                        return mEF.valueOf(mel, (GraphicsLayerScope) obj2);
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            modifierGraphicsLayer2 = GraphicsLayerModifierKt.graphicsLayer(companion2, (Function1) objRememberedValue3);
                            composerStartRestartGroup.endReplaceableGroup();
                        } else {
                            if (i6 != 2) {
                                composerStartRestartGroup.startReplaceableGroup(204106848);
                                composerStartRestartGroup.endReplaceableGroup();
                                throw new NoWhenBranchMatchedException();
                            }
                            composerStartRestartGroup.startReplaceableGroup(204114611);
                            composerStartRestartGroup.startReplaceableGroup(204115045);
                            boolean zChangedInstance4 = composerStartRestartGroup.changedInstance(mel);
                            java.lang.Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                            if (zChangedInstance4 || objRememberedValue4 == companion.getEmpty()) {
                                objRememberedValue4 = new Function1() { // from class: o.mEJ
                                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                    @Override // kotlin.jvm.functions.Function1
                                    public final java.lang.Object invoke(java.lang.Object obj2) {
                                        return mEF.AhwBna(mel, (GraphicsLayerScope) obj2);
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            modifierGraphicsLayer2 = GraphicsLayerModifierKt.graphicsLayer(companion2, (Function1) objRememberedValue4);
                            composerStartRestartGroup.endReplaceableGroup();
                        }
                        modifierOnGloballyPositioned = modifierZIndex.then(modifierGraphicsLayer2);
                        composerStartRestartGroup.endReplaceableGroup();
                    } else {
                        composerStartRestartGroup.startReplaceableGroup(2032774344);
                        if (Intrinsics.EZpvd(obj, mel.AYXKKw())) {
                            Modifier.Companion companion3 = Modifier.Companion;
                            Modifier modifierZIndex2 = ZIndexModifierKt.zIndex(companion3, 1.0f);
                            int i7 = TaskDescription.EZpvd[orientationDjBIcL.ordinal()];
                            if (i7 == 1) {
                                composerStartRestartGroup.startReplaceableGroup(204127689);
                                composerStartRestartGroup.startReplaceableGroup(204128123);
                                boolean zChangedInstance5 = composerStartRestartGroup.changedInstance(mel);
                                java.lang.Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                                if (zChangedInstance5 || objRememberedValue5 == companion.getEmpty()) {
                                    objRememberedValue5 = new Function1() { // from class: o.mEK
                                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                        @Override // kotlin.jvm.functions.Function1
                                        public final java.lang.Object invoke(java.lang.Object obj2) {
                                            return mEF.AYXKKw(mel, (GraphicsLayerScope) obj2);
                                        }
                                    };
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                modifierGraphicsLayer = GraphicsLayerModifierKt.graphicsLayer(companion3, (Function1) objRememberedValue5);
                                composerStartRestartGroup.endReplaceableGroup();
                            } else {
                                if (i7 != 2) {
                                    composerStartRestartGroup.startReplaceableGroup(204125496);
                                    composerStartRestartGroup.endReplaceableGroup();
                                    throw new NoWhenBranchMatchedException();
                                }
                                composerStartRestartGroup.startReplaceableGroup(204134185);
                                composerStartRestartGroup.startReplaceableGroup(204134619);
                                boolean zChangedInstance6 = composerStartRestartGroup.changedInstance(mel);
                                java.lang.Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                                if (zChangedInstance6 || objRememberedValue6 == companion.getEmpty()) {
                                    objRememberedValue6 = new Function1() { // from class: o.mEI
                                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                        @Override // kotlin.jvm.functions.Function1
                                        public final java.lang.Object invoke(java.lang.Object obj2) {
                                            return mEF.copydefault(mel, (GraphicsLayerScope) obj2);
                                        }
                                    };
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                modifierGraphicsLayer = GraphicsLayerModifierKt.graphicsLayer(companion3, (Function1) objRememberedValue6);
                                composerStartRestartGroup.endReplaceableGroup();
                            }
                            modifierAnimateItemPlacement$default = modifierZIndex2.then(modifierGraphicsLayer);
                        } else {
                            modifierAnimateItemPlacement$default = LazyItemScope.animateItemPlacement$default(lazyItemScope, Modifier.Companion, null, 1, null);
                        }
                        modifierOnGloballyPositioned = OnGloballyPositionedModifierKt.onGloballyPositioned(modifierAnimateItemPlacement$default, new Function1() { // from class: o.mEG
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj2) {
                                return mEF.AEQbTJ(floatRef, orientationDjBIcL, (LayoutCoordinates) obj2);
                            }
                        });
                        composerStartRestartGroup.endReplaceableGroup();
                    }
                    Modifier modifierThen = modifier3.then(modifierOnGloballyPositioned);
                    composerStartRestartGroup.startReplaceableGroup(-483455358);
                    MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(-1323940314);
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    ComposeUiNode.Companion companion4 = ComposeUiNode.Companion;
                    Function0<ComposeUiNode> constructor = companion4.getConstructor();
                    yHO<SkippableUpdater<ComposeUiNode>, Composer, java.lang.Integer, Unit> yhoModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierThen);
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
                    Updater.m2790setimpl(composerM2783constructorimpl, measurePolicyColumnMeasurePolicy, companion4.getSetMeasurePolicy());
                    Updater.m2790setimpl(composerM2783constructorimpl, currentCompositionLocalMap, companion4.getSetResolvedCompositionLocals());
                    setCompositeKeyHash = companion4.getSetCompositeKeyHash();
                    if (!composerM2783constructorimpl.getInserting() || !Intrinsics.EZpvd(composerM2783constructorimpl.rememberedValue(), java.lang.Integer.valueOf(currentCompositeKeyHash))) {
                        composerM2783constructorimpl.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash));
                        composerM2783constructorimpl.apply(java.lang.Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    yhoModifierMaterializerOf.invoke(SkippableUpdater.m2774boximpl(SkippableUpdater.m2775constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(2058660585);
                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                    yht.invoke(new mEA(mel, obj, orientationDjBIcL, new Function0() { // from class: o.mEH
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return java.lang.Float.valueOf(mEF.AEQbTJ(floatRef));
                        }
                    }), java.lang.Boolean.valueOf(KWHzl(stateAEQbTJ)), composerStartRestartGroup, java.lang.Integer.valueOf((i3 >> 9) & FaceDetector.NUM_BOXES));
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.startReplaceableGroup(204158131);
                    z3 = (57344 & i3) != 16384;
                    zChangedInstance = composerStartRestartGroup.changedInstance(mel);
                    zChangedInstance2 = composerStartRestartGroup.changedInstance(obj);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (!(zChangedInstance | z3 | zChangedInstance2) || objRememberedValue2 == companion.getEmpty()) {
                        objRememberedValue2 = new ReorderableLazyListKt$ReorderableItem$2$1(z2, mel, obj, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    EffectsKt.LaunchedEffect(java.lang.Boolean.valueOf(z2), (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends java.lang.Object>) objRememberedValue2, composerStartRestartGroup, (i3 >> 12) & 14);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    modifier3 = modifier2;
                }
                final boolean z4 = z2;
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    final Modifier modifier4 = modifier3;
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: o.mEP
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                            return mEF.KWHzl(lazyItemScope, mel, obj, modifier4, z4, yht, i, i2, (Composer) obj2, ((java.lang.Integer) obj3).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 24576;
            z2 = z;
            if ((i2 & 16) != 0) {
            }
            if ((74899 & i3) != 74898) {
                if (i5 == 0) {
                }
                if (i4 != 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                final Orientation orientationDjBIcL2 = mel.djBIcL();
                stateAEQbTJ = mel.AEQbTJ(obj);
                final Ref.FloatRef floatRef2 = new Ref.FloatRef();
                composerStartRestartGroup.startReplaceableGroup(204102154);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.Companion;
                if (objRememberedValue == companion.getEmpty()) {
                }
                float fFloatValue2 = ((java.lang.Number) objRememberedValue).floatValue();
                composerStartRestartGroup.endReplaceableGroup();
                floatRef2.element = fFloatValue2;
                if (!KWHzl(stateAEQbTJ)) {
                }
                Modifier modifierThen2 = modifier3.then(modifierOnGloballyPositioned);
                composerStartRestartGroup.startReplaceableGroup(-483455358);
                MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion42 = ComposeUiNode.Companion;
                Function0<ComposeUiNode> constructor2 = companion42.getConstructor();
                yHO<SkippableUpdater<ComposeUiNode>, Composer, java.lang.Integer, Unit> yhoModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierThen2);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                }
                composerStartRestartGroup.startReusableNode();
                if (!composerStartRestartGroup.getInserting()) {
                }
                composerM2783constructorimpl = Updater.m2783constructorimpl(composerStartRestartGroup);
                Updater.m2790setimpl(composerM2783constructorimpl, measurePolicyColumnMeasurePolicy2, companion42.getSetMeasurePolicy());
                Updater.m2790setimpl(composerM2783constructorimpl, currentCompositionLocalMap2, companion42.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion42.getSetCompositeKeyHash();
                if (!composerM2783constructorimpl.getInserting()) {
                    composerM2783constructorimpl.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash));
                    composerM2783constructorimpl.apply(java.lang.Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    yhoModifierMaterializerOf2.invoke(SkippableUpdater.m2774boximpl(SkippableUpdater.m2775constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(2058660585);
                    ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                    yht.invoke(new mEA(mel, obj, orientationDjBIcL2, new Function0() { // from class: o.mEH
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return java.lang.Float.valueOf(mEF.AEQbTJ(floatRef2));
                        }
                    }), java.lang.Boolean.valueOf(KWHzl(stateAEQbTJ)), composerStartRestartGroup, java.lang.Integer.valueOf((i3 >> 9) & FaceDetector.NUM_BOXES));
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.startReplaceableGroup(204158131);
                    if ((57344 & i3) != 16384) {
                    }
                    zChangedInstance = composerStartRestartGroup.changedInstance(mel);
                    zChangedInstance2 = composerStartRestartGroup.changedInstance(obj);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (!(zChangedInstance | z3 | zChangedInstance2)) {
                        objRememberedValue2 = new ReorderableLazyListKt$ReorderableItem$2$1(z2, mel, obj, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        composerStartRestartGroup.endReplaceableGroup();
                        EffectsKt.LaunchedEffect(java.lang.Boolean.valueOf(z2), (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends java.lang.Object>) objRememberedValue2, composerStartRestartGroup, (i3 >> 12) & 14);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                    }
                }
            }
            final boolean z42 = z2;
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 8;
        if (i4 != 0) {
        }
        z2 = z;
        if ((i2 & 16) != 0) {
        }
        if ((74899 & i3) != 74898) {
        }
        final boolean z422 = z2;
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    public static final Unit valueOf(mEL mel, GraphicsLayerScope graphicsLayerScope) {
        Intrinsics.checkNotNullParameter(graphicsLayerScope, "");
        graphicsLayerScope.setTranslationY(mel.gEmmrt());
        return Unit.INSTANCE;
    }

    public static final Unit AhwBna(mEL mel, GraphicsLayerScope graphicsLayerScope) {
        Intrinsics.checkNotNullParameter(graphicsLayerScope, "");
        graphicsLayerScope.setTranslationX(mel.gEmmrt());
        return Unit.INSTANCE;
    }

    public static final Unit AYXKKw(mEL mel, GraphicsLayerScope graphicsLayerScope) {
        Intrinsics.checkNotNullParameter(graphicsLayerScope, "");
        graphicsLayerScope.setTranslationY(mel.valueOf().getValue().floatValue());
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(mEL mel, GraphicsLayerScope graphicsLayerScope) {
        Intrinsics.checkNotNullParameter(graphicsLayerScope, "");
        graphicsLayerScope.setTranslationX(mel.valueOf().getValue().floatValue());
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(Ref.FloatRef floatRef, Orientation orientation, LayoutCoordinates layoutCoordinates) {
        float fM2911getYimpl;
        Intrinsics.checkNotNullParameter(layoutCoordinates, "");
        int i = TaskDescription.EZpvd[orientation.ordinal()];
        if (i == 1) {
            fM2911getYimpl = Offset.m2911getYimpl(LayoutCoordinatesKt.positionInRoot(layoutCoordinates));
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            fM2911getYimpl = Offset.m2910getXimpl(LayoutCoordinatesKt.positionInRoot(layoutCoordinates));
        }
        floatRef.element = fM2911getYimpl;
        return Unit.INSTANCE;
    }

    public static final float AEQbTJ(Ref.FloatRef floatRef) {
        return floatRef.element;
    }

    public static final boolean KWHzl(androidx.compose.runtime.State<java.lang.Boolean> state) {
        return state.getValue().booleanValue();
    }
}
