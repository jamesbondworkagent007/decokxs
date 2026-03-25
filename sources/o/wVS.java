package o;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.FlowLayoutKt;
import androidx.compose.foundation.layout.FlowRowScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
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
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.ColorResources_androidKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.viewinterop.AndroidView_androidKt;
import com.amplifyframework.ui.liveness.ml.FaceDetector;
import com.okinc.business.defi.biz.core.error.WalletImportError;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import o.wYX;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import org.jetbrains.annotations.NotNull;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: loaded from: classes19.dex */
public final class wVS {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final Unit AEQbTJ(Modifier modifier, wVQ wvq, Function0 function0, int i, int i2, Composer composer, int i3) {
        OLrzqt(modifier, wvq, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final Unit OLrzqt(Modifier modifier, SnapshotStateList snapshotStateList, int i, int i2, Function1 function1, int i3, int i4, Composer composer, int i5) {
        EZpvd(modifier, snapshotStateList, i, i2, function1, composer, RecomposeScopeImplKt.updateChangedFlags(i3 | 1), i4);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final Unit copydefault(Modifier modifier, SnapshotStateList snapshotStateList, boolean z, Function1 function1, int i, int i2, Composer composer, int i3) {
        EZpvd(modifier, snapshotStateList, z, function1, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:102:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x013d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void EZpvd(Modifier modifier, @NotNull final SnapshotStateList<wVQ> snapshotStateList, int i, final int i2, @NotNull final Function1<? super java.lang.Integer, Unit> function1, Composer composer, final int i3, final int i4) {
        Modifier modifier2;
        int i5;
        int i6;
        Modifier modifier3;
        final int i7;
        boolean z;
        java.lang.Object objRememberedValue;
        boolean z2;
        boolean z3;
        boolean z4;
        java.lang.Object objRememberedValue2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(snapshotStateList, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Composer composerStartRestartGroup = composer.startRestartGroup(1993153727);
        int i8 = i4 & 1;
        if (i8 != 0) {
            i5 = i3 | 6;
            modifier2 = modifier;
        } else if ((i3 & 6) == 0) {
            modifier2 = modifier;
            i5 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i3;
        } else {
            modifier2 = modifier;
            i5 = i3;
        }
        if ((i4 & 2) != 0) {
            i5 |= 48;
        } else if ((i3 & 48) == 0) {
            i5 |= composerStartRestartGroup.changed(snapshotStateList) ? 32 : 16;
        }
        int i9 = i4 & 4;
        if (i9 == 0) {
            if ((i3 & MLKEMEngine.KyberPolyBytes) == 0) {
                i6 = i;
                i5 |= composerStartRestartGroup.changed(i6) ? 256 : 128;
            }
            if ((i4 & 8) == 0) {
                i5 |= 3072;
            } else if ((i3 & 3072) == 0) {
                i5 |= composerStartRestartGroup.changed(i2) ? 2048 : 1024;
            }
            if ((i4 & 16) == 0) {
                i5 |= 24576;
            } else if ((i3 & 24576) == 0) {
                i5 |= composerStartRestartGroup.changedInstance(function1) ? 16384 : 8192;
            }
            if ((i5 & 9363) == 9362 || !composerStartRestartGroup.getSkipping()) {
                modifier3 = i8 == 0 ? Modifier.Companion : modifier2;
                i7 = i9 == 0 ? 36 : i6;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1993153727, i5, -1, "com.okinc.tradingbot.impl.widget.compose.OKSelectionChipGroup (ChipSelectionGroupComposable.kt:39)");
                }
                composerStartRestartGroup.startReplaceableGroup(-1127936961);
                z = (i5 & 7168) != 2048;
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!z || objRememberedValue == Composer.Companion.getEmpty()) {
                    objRememberedValue = new Function1() { // from class: o.wVP
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return wVS.copydefault(i2, (android.content.Context) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                Function1 function12 = (Function1) objRememberedValue;
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.startReplaceableGroup(-1127931918);
                z2 = (i5 & WalletImportError.ERROR_CODE_AA_EXIST) != 32;
                z3 = (i5 & FaceDetector.NUM_BOXES) != 256;
                z4 = (57344 & i5) == 16384;
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (!(z4 | z2 | z3) || objRememberedValue2 == Composer.Companion.getEmpty()) {
                    objRememberedValue2 = new Function1() { // from class: o.wVW
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return wVS.EZpvd(snapshotStateList, i7, function1, (wYX) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                AndroidView_androidKt.AndroidView(function12, modifier3, (Function1) objRememberedValue2, composerStartRestartGroup, (i5 << 3) & WalletImportError.ERROR_CODE_AA_EXIST, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                i6 = i7;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                final Modifier modifier4 = modifier3;
                final int i10 = i6;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: o.wVY
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return wVS.OLrzqt(modifier4, snapshotStateList, i10, i2, function1, i3, i4, (Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i5 |= MLKEMEngine.KyberPolyBytes;
        i6 = i;
        if ((i4 & 8) == 0) {
        }
        if ((i4 & 16) == 0) {
        }
        if ((i5 & 9363) == 9362) {
            if (i8 == 0) {
            }
            if (i9 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            composerStartRestartGroup.startReplaceableGroup(-1127936961);
            if ((i5 & 7168) != 2048) {
            }
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (!z) {
                objRememberedValue = new Function1() { // from class: o.wVP
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return wVS.copydefault(i2, (android.content.Context) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                Function1 function122 = (Function1) objRememberedValue;
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.startReplaceableGroup(-1127931918);
                if ((i5 & WalletImportError.ERROR_CODE_AA_EXIST) != 32) {
                }
                if ((i5 & FaceDetector.NUM_BOXES) != 256) {
                }
                if ((57344 & i5) == 16384) {
                }
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (!(z4 | z2 | z3)) {
                    objRememberedValue2 = new Function1() { // from class: o.wVW
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return wVS.EZpvd(snapshotStateList, i7, function1, (wYX) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    composerStartRestartGroup.endReplaceableGroup();
                    AndroidView_androidKt.AndroidView(function122, modifier3, (Function1) objRememberedValue2, composerStartRestartGroup, (i5 << 3) & WalletImportError.ERROR_CODE_AA_EXIST, 0);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    i6 = i7;
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    public static final wYX copydefault(int i, android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        wYX wyx = new wYX(context, null, 0, 6, null);
        wyx.setColumnCount(i);
        return wyx;
    }

    public static final class TaskDescription implements wYX.ActionBar {
        public final /* synthetic */ wYX KWHzl;
        public final /* synthetic */ Function1<java.lang.Integer, Unit> copydefault;

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> */
        /* JADX WARN: Multi-variable type inference failed */
        public TaskDescription(wYX wyx, Function1<? super java.lang.Integer, Unit> function1) {
            this.KWHzl = wyx;
            this.copydefault = function1;
        }

        @Override // o.wYX.ActionBar
        public void OLrzqt(wYS wys) {
            Intrinsics.checkNotNullParameter(wys, "");
            java.util.Iterator<wYO> it = this.KWHzl.OLrzqt().iterator();
            int i = 0;
            while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                } else if (Intrinsics.EZpvd(it.next().EZpvd(), wys.getText())) {
                    break;
                } else {
                    i++;
                }
            }
            if (i != -1) {
                this.copydefault.invoke(java.lang.Integer.valueOf(i));
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:106:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01e3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void EZpvd(Modifier modifier, @NotNull final SnapshotStateList<wVQ> snapshotStateList, boolean z, Function1<? super java.lang.Integer, Unit> function1, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        boolean z2;
        int i4;
        final Function1<? super java.lang.Integer, Unit> function12;
        int i5;
        Modifier modifier3;
        int currentCompositeKeyHash;
        Composer composerM2783constructorimpl;
        Function2<ComposeUiNode, java.lang.Integer, Unit> setCompositeKeyHash;
        final Function1<? super java.lang.Integer, Unit> function13;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(snapshotStateList, "");
        Composer composerStartRestartGroup = composer.startRestartGroup(942579941);
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
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(snapshotStateList) ? 32 : 16;
        }
        int i7 = i2 & 4;
        if (i7 != 0) {
            i3 |= MLKEMEngine.KyberPolyBytes;
        } else {
            if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
                z2 = z;
                i3 |= composerStartRestartGroup.changed(z2) ? 256 : 128;
            }
            i4 = i2 & 8;
            if (i4 != 0) {
                if ((i & 3072) == 0) {
                    function12 = function1;
                    i3 |= composerStartRestartGroup.changedInstance(function12) ? 2048 : 1024;
                }
                i5 = i3;
                if ((i5 & 1171) != 1170 || !composerStartRestartGroup.getSkipping()) {
                    modifier3 = i6 == 0 ? Modifier.Companion : modifier2;
                    boolean z3 = i7 == 0 ? false : z2;
                    if (i4 != 0) {
                        function12 = null;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(942579941, i5, -1, "com.okinc.tradingbot.impl.widget.compose.ChipSelectionGroup (ChipSelectionGroupComposable.kt:78)");
                    }
                    boolean z4 = true;
                    Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null);
                    Arrangement arrangement = Arrangement.INSTANCE;
                    float f = 4;
                    Arrangement.HorizontalOrVertical horizontalOrVerticalM582spacedBy0680j_4 = arrangement.m582spacedBy0680j_4(androidx.compose.ui.unit.Dp.m5414constructorimpl(f));
                    Arrangement.HorizontalOrVertical horizontalOrVerticalM582spacedBy0680j_42 = arrangement.m582spacedBy0680j_4(androidx.compose.ui.unit.Dp.m5414constructorimpl(f));
                    composerStartRestartGroup.startReplaceableGroup(1098475987);
                    MeasurePolicy measurePolicyRowMeasurementHelper = FlowLayoutKt.rowMeasurementHelper(horizontalOrVerticalM582spacedBy0680j_42, horizontalOrVerticalM582spacedBy0680j_4, Integer.MAX_VALUE, composerStartRestartGroup, 54);
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
                    Updater.m2790setimpl(composerM2783constructorimpl, measurePolicyRowMeasurementHelper, companion.getSetMeasurePolicy());
                    Updater.m2790setimpl(composerM2783constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                    setCompositeKeyHash = companion.getSetCompositeKeyHash();
                    if (!composerM2783constructorimpl.getInserting() || !Intrinsics.EZpvd(composerM2783constructorimpl.rememberedValue(), java.lang.Integer.valueOf(currentCompositeKeyHash))) {
                        composerM2783constructorimpl.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash));
                        composerM2783constructorimpl.apply(java.lang.Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    yhoModifierMaterializerOf.invoke(SkippableUpdater.m2774boximpl(SkippableUpdater.m2775constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(2058660585);
                    FlowRowScopeInstance flowRowScopeInstance = FlowRowScopeInstance.INSTANCE;
                    composerStartRestartGroup.startReplaceableGroup(1880496611);
                    final int i8 = 0;
                    for (wVQ wvq : snapshotStateList) {
                        if (i8 < 0) {
                            yDY.AYXKKw();
                        }
                        wVQ wvq2 = wvq;
                        Modifier modifierWeight = Modifier.Companion;
                        if (z3) {
                            modifierWeight = flowRowScopeInstance.weight(modifierWeight, 1.0f, z4);
                        }
                        composerStartRestartGroup.startReplaceableGroup(1522680962);
                        boolean z5 = (i5 & 7168) == 2048 ? z4 : false;
                        boolean zChanged = composerStartRestartGroup.changed(i8);
                        java.lang.Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if ((z5 | zChanged) || objRememberedValue == Composer.Companion.getEmpty()) {
                            objRememberedValue = new Function0() { // from class: o.wVU
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                @Override // kotlin.jvm.functions.Function0
                                public final java.lang.Object invoke() {
                                    return wVS.AEQbTJ(function12, i8);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        OLrzqt(modifierWeight, wvq2, (Function0) objRememberedValue, composerStartRestartGroup, 0, 0);
                        i8++;
                        function12 = function12;
                        z4 = z4;
                    }
                    Function1<? super java.lang.Integer, Unit> function14 = function12;
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z2 = z3;
                    function13 = function14;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    modifier3 = modifier2;
                    function13 = function12;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    final Modifier modifier4 = modifier3;
                    final boolean z6 = z2;
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: o.wVV
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            return wVS.copydefault(modifier4, snapshotStateList, z6, function13, i, i2, (Composer) obj, ((java.lang.Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 3072;
            function12 = function1;
            i5 = i3;
            if ((i5 & 1171) != 1170) {
                if (i6 == 0) {
                }
                if (i7 == 0) {
                }
                if (i4 != 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                boolean z42 = true;
                Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null);
                Arrangement arrangement2 = Arrangement.INSTANCE;
                float f2 = 4;
                Arrangement.HorizontalOrVertical horizontalOrVerticalM582spacedBy0680j_43 = arrangement2.m582spacedBy0680j_4(androidx.compose.ui.unit.Dp.m5414constructorimpl(f2));
                Arrangement.HorizontalOrVertical horizontalOrVerticalM582spacedBy0680j_422 = arrangement2.m582spacedBy0680j_4(androidx.compose.ui.unit.Dp.m5414constructorimpl(f2));
                composerStartRestartGroup.startReplaceableGroup(1098475987);
                MeasurePolicy measurePolicyRowMeasurementHelper2 = FlowLayoutKt.rowMeasurementHelper(horizontalOrVerticalM582spacedBy0680j_422, horizontalOrVerticalM582spacedBy0680j_43, Integer.MAX_VALUE, composerStartRestartGroup, 54);
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
                Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
                yHO<SkippableUpdater<ComposeUiNode>, Composer, java.lang.Integer, Unit> yhoModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierFillMaxWidth$default2);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                }
                composerStartRestartGroup.startReusableNode();
                if (!composerStartRestartGroup.getInserting()) {
                }
                composerM2783constructorimpl = Updater.m2783constructorimpl(composerStartRestartGroup);
                Updater.m2790setimpl(composerM2783constructorimpl, measurePolicyRowMeasurementHelper2, companion2.getSetMeasurePolicy());
                Updater.m2790setimpl(composerM2783constructorimpl, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                if (!composerM2783constructorimpl.getInserting()) {
                    composerM2783constructorimpl.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash));
                    composerM2783constructorimpl.apply(java.lang.Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    yhoModifierMaterializerOf2.invoke(SkippableUpdater.m2774boximpl(SkippableUpdater.m2775constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(2058660585);
                    FlowRowScopeInstance flowRowScopeInstance2 = FlowRowScopeInstance.INSTANCE;
                    composerStartRestartGroup.startReplaceableGroup(1880496611);
                    final int i82 = 0;
                    while (r4.hasNext()) {
                    }
                    Function1<? super java.lang.Integer, Unit> function142 = function12;
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    z2 = z3;
                    function13 = function142;
                }
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        z2 = z;
        i4 = i2 & 8;
        if (i4 != 0) {
        }
        function12 = function1;
        i5 = i3;
        if ((i5 & 1171) != 1170) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    public static final Unit AEQbTJ(Function1 function1, int i) {
        if (function1 != null) {
            function1.invoke(java.lang.Integer.valueOf(i));
        }
        return Unit.INSTANCE;
    }

    public static final void OLrzqt(Modifier modifier, final wVQ wvq, final Function0<Unit> function0, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        Modifier modifier3;
        long jColorResource;
        Composer composerStartRestartGroup = composer.startRestartGroup(1137627949);
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
            i3 |= composerStartRestartGroup.changed(wvq) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= MLKEMEngine.KyberPolyBytes;
        } else if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function0) ? 256 : 128;
        }
        if ((i3 & CipherSuite.TLS_RSA_PSK_WITH_3DES_EDE_CBC_SHA) != 146 || !composerStartRestartGroup.getSkipping()) {
            modifier3 = i4 != 0 ? Modifier.Companion : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1137627949, i3, -1, "com.okinc.tradingbot.impl.widget.compose.ChipItem (ChipSelectionGroupComposable.kt:99)");
            }
            if (wvq.copydefault()) {
                composerStartRestartGroup.startReplaceableGroup(-1132170363);
                jColorResource = ColorResources_androidKt.colorResource(C52761wXj.Activity.invokespecialODCBUN, composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceableGroup();
            } else {
                composerStartRestartGroup.startReplaceableGroup(-1132109851);
                jColorResource = ColorResources_androidKt.colorResource(C52761wXj.Activity.invokespecialDPHOMC, composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceableGroup();
            }
            long j = jColorResource;
            int i5 = !wvq.OLrzqt() ? C52761wXj.Activity.UlJrfe : C52761wXj.Activity.DCUTEIddSDPG;
            float f = 8;
            Modifier modifierM672paddingVpY3zN4 = PaddingKt.m672paddingVpY3zN4(ClickableKt.m383clickableXHw0xAI$default(BackgroundKt.m350backgroundbw27NRU$default(ClipKt.clip(SizeKt.m706heightInVpY3zN4$default(modifier3, androidx.compose.ui.unit.Dp.m5414constructorimpl(28), 0.0f, 2, null), RoundedCornerShapeKt.m924RoundedCornerShape0680j_4(androidx.compose.ui.unit.Dp.m5414constructorimpl(f))), j, null, 2, null), wvq.OLrzqt(), null, null, function0, 6, null), androidx.compose.ui.unit.Dp.m5414constructorimpl(f), androidx.compose.ui.unit.Dp.m5414constructorimpl(6));
            Alignment center = Alignment.Companion.getCenter();
            composerStartRestartGroup.startReplaceableGroup(733328855);
            MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, composerStartRestartGroup, 6);
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
            Updater.m2790setimpl(composerM2783constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m2790setimpl(composerM2783constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, java.lang.Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (composerM2783constructorimpl.getInserting() || !Intrinsics.EZpvd(composerM2783constructorimpl.rememberedValue(), java.lang.Integer.valueOf(currentCompositeKeyHash))) {
                composerM2783constructorimpl.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash));
                composerM2783constructorimpl.apply(java.lang.Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            yhoModifierMaterializerOf.invoke(SkippableUpdater.m2774boximpl(SkippableUpdater.m2775constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            TextKt.m2072Text4IGK_g(wvq.KWHzl(), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.Companion.m5334getEllipsisgIe3tQ8(), false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, C52698wVa.OLrzqt(C52761wXj.LoaderManager.QOLQEE, java.lang.Integer.valueOf(i5), composerStartRestartGroup, 0, 0), composerStartRestartGroup, 0, 3120, 55294);
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
            final Modifier modifier4 = modifier3;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: o.wVX
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return wVS.AEQbTJ(modifier4, wvq, function0, i, i2, (Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final Unit EZpvd(SnapshotStateList snapshotStateList, int i, Function1 function1, wYX wyx) {
        Intrinsics.checkNotNullParameter(wyx, "");
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(snapshotStateList, 10));
        java.util.Iterator<T> it = snapshotStateList.iterator();
        while (it.hasNext()) {
            wVQ wvq = (wVQ) it.next();
            arrayList.add(new wYO(wvq.KWHzl(), i, wvq.copydefault(), wvq.OLrzqt()));
        }
        wyx.setSelectionChipBeans(arrayList);
        wyx.setOnChipClickListener(new TaskDescription(wyx, function1));
        return Unit.INSTANCE;
    }
}
