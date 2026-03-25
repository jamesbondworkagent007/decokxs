package o;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.ComposeView;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.unify_trade.bot.data.TacticsData;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.uKT;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class uKT extends RecyclerView.ViewHolder {
    public final MutableState AEQbTJ;
    public final MutableState AhwBna;
    public final ComposeView EZpvd;
    public final boolean KWHzl;
    public final MutableState OLrzqt;
    public final WeakReference<C52499wNr> copydefault;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uKT(@NotNull ComposeView composeView, @NotNull WeakReference<C52499wNr> weakReference, boolean z) {
        super(composeView);
        Intrinsics.checkNotNullParameter(composeView, "");
        Intrinsics.checkNotNullParameter(weakReference, "");
        this.EZpvd = composeView;
        this.copydefault = weakReference;
        this.KWHzl = z;
        this.OLrzqt = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.AhwBna = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.AEQbTJ = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        composeView.setContent(ComposableLambdaKt.composableLambdaInstance(727289980, true, new AnonymousClass1()));
    }

    /* JADX INFO: renamed from: o.uKT$1, reason: invalid class name */
    public static final class AnonymousClass1 implements Function2<Composer, java.lang.Integer, Unit> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AnonymousClass1() {
        }

        public static final TacticsData AEQbTJ(TacticsData tacticsData) {
            return tacticsData;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function2
        public /* synthetic */ Unit invoke(Composer composer, java.lang.Integer num) {
            EZpvd(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void EZpvd(Composer composer, int i) {
            if ((i & 3) != 2 || !composer.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(727289980, i, -1, "com.okinc.tradingbot.impl.botList.ui.cell.LLMBotOngoingViewHolder.<anonymous> (LLMBotListItemViewCompose.kt:90)");
                }
                uJO ujoOLrzqt = uKT.this.OLrzqt();
                final TacticsData tacticsDataAEQbTJ = uKT.this.AEQbTJ();
                if (ujoOLrzqt != null && tacticsDataAEQbTJ != null) {
                    Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null);
                    final uKT ukt = uKT.this;
                    composer.startReplaceableGroup(733328855);
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.Companion.getTopStart(), false, composer, 0);
                    composer.startReplaceableGroup(-1323940314);
                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                    ComposeUiNode.Companion companion = ComposeUiNode.Companion;
                    Function0<ComposeUiNode> constructor = companion.getConstructor();
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
                    Updater.m2790setimpl(composerM2783constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion.getSetMeasurePolicy());
                    Updater.m2790setimpl(composerM2783constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, java.lang.Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
                    if (composerM2783constructorimpl.getInserting() || !Intrinsics.EZpvd(composerM2783constructorimpl.rememberedValue(), java.lang.Integer.valueOf(currentCompositeKeyHash))) {
                        composerM2783constructorimpl.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash));
                        composerM2783constructorimpl.apply(java.lang.Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    yhoModifierMaterializerOf.invoke(SkippableUpdater.m2774boximpl(SkippableUpdater.m2775constructorimpl(composer)), composer, 0);
                    composer.startReplaceableGroup(2058660585);
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    if (!ujoOLrzqt.DTwDnp()) {
                        composer.startReplaceableGroup(-1656180318);
                        C48254uKr.KWHzl(null, composer, 0, 1);
                        composer.endReplaceableGroup();
                    } else {
                        composer.startReplaceableGroup(-1656066858);
                        boolean z = ukt.KWHzl;
                        java.lang.Integer numEZpvd = ukt.EZpvd();
                        composer.startReplaceableGroup(-469060194);
                        boolean zChanged = composer.changed(tacticsDataAEQbTJ);
                        java.lang.Object objRememberedValue = composer.rememberedValue();
                        if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
                            objRememberedValue = new Function0() { // from class: o.uKY
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                @Override // kotlin.jvm.functions.Function0
                                public final java.lang.Object invoke() {
                                    return uKT.AnonymousClass1.AEQbTJ(tacticsDataAEQbTJ);
                                }
                            };
                            composer.updateRememberedValue(objRememberedValue);
                        }
                        Function0 function0 = (Function0) objRememberedValue;
                        composer.endReplaceableGroup();
                        composer.startReplaceableGroup(-469054198);
                        boolean zChangedInstance = composer.changedInstance(ukt);
                        boolean zChanged2 = composer.changed(tacticsDataAEQbTJ);
                        java.lang.Object objRememberedValue2 = composer.rememberedValue();
                        if ((zChangedInstance | zChanged2) || objRememberedValue2 == Composer.Companion.getEmpty()) {
                            objRememberedValue2 = new Function0() { // from class: o.uKW
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                @Override // kotlin.jvm.functions.Function0
                                public final java.lang.Object invoke() {
                                    return uKT.AnonymousClass1.OLrzqt(ukt, tacticsDataAEQbTJ);
                                }
                            };
                            composer.updateRememberedValue(objRememberedValue2);
                        }
                        Function0 function02 = (Function0) objRememberedValue2;
                        composer.endReplaceableGroup();
                        composer.startReplaceableGroup(-469032432);
                        boolean zChangedInstance2 = composer.changedInstance(ukt);
                        boolean zChanged3 = composer.changed(tacticsDataAEQbTJ);
                        java.lang.Object objRememberedValue3 = composer.rememberedValue();
                        if ((zChangedInstance2 | zChanged3) || objRememberedValue3 == Composer.Companion.getEmpty()) {
                            objRememberedValue3 = new Function0() { // from class: o.uKX
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                @Override // kotlin.jvm.functions.Function0
                                public final java.lang.Object invoke() {
                                    return uKT.AnonymousClass1.copydefault(ukt, tacticsDataAEQbTJ);
                                }
                            };
                            composer.updateRememberedValue(objRememberedValue3);
                        }
                        Function0 function03 = (Function0) objRememberedValue3;
                        composer.endReplaceableGroup();
                        composer.startReplaceableGroup(-469051013);
                        java.lang.Object objRememberedValue4 = composer.rememberedValue();
                        Composer.Companion companion2 = Composer.Companion;
                        if (objRememberedValue4 == companion2.getEmpty()) {
                            objRememberedValue4 = new Function0() { // from class: o.uKU
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                @Override // kotlin.jvm.functions.Function0
                                public final java.lang.Object invoke() {
                                    return uKT.AnonymousClass1.AEQbTJ();
                                }
                            };
                            composer.updateRememberedValue(objRememberedValue4);
                        }
                        Function0 function04 = (Function0) objRememberedValue4;
                        composer.endReplaceableGroup();
                        composer.startReplaceableGroup(-469048131);
                        boolean zChangedInstance3 = composer.changedInstance(ukt);
                        java.lang.Object objRememberedValue5 = composer.rememberedValue();
                        if (zChangedInstance3 || objRememberedValue5 == companion2.getEmpty()) {
                            objRememberedValue5 = new yHO() { // from class: o.uKV
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                @Override // o.yHO
                                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                                    return uKT.AnonymousClass1.OLrzqt(ukt, (java.lang.String) obj, (TacticsData) obj2, (Function0) obj3);
                                }
                            };
                            composer.updateRememberedValue(objRememberedValue5);
                        }
                        yHO yho = (yHO) objRememberedValue5;
                        composer.endReplaceableGroup();
                        composer.startReplaceableGroup(-469038334);
                        boolean zChangedInstance4 = composer.changedInstance(ukt);
                        java.lang.Object objRememberedValue6 = composer.rememberedValue();
                        if (zChangedInstance4 || objRememberedValue6 == companion2.getEmpty()) {
                            objRememberedValue6 = new Function2() { // from class: o.uLb
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                @Override // kotlin.jvm.functions.Function2
                                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                    return uKT.AnonymousClass1.copydefault(ukt, (java.lang.String) obj, (TacticsData) obj2);
                                }
                            };
                            composer.updateRememberedValue(objRememberedValue6);
                        }
                        composer.endReplaceableGroup();
                        C48261uKy.EZpvd(ujoOLrzqt, function0, z, numEZpvd, false, null, function02, function03, function04, yho, (Function2) objRememberedValue6, composer, 100663296, 0, 48);
                        composer.endReplaceableGroup();
                    }
                    composer.endReplaceableGroup();
                    composer.endNode();
                    composer.endReplaceableGroup();
                    composer.endReplaceableGroup();
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                    return;
                }
                return;
            }
            composer.skipToGroupEnd();
        }

        public static final Unit OLrzqt(uKT ukt, TacticsData tacticsData) {
            Function1<TacticsData, Unit> function1Copydefault;
            C52499wNr c52499wNr = (C52499wNr) ukt.copydefault.get();
            if (c52499wNr != null && (function1Copydefault = c52499wNr.copydefault()) != null) {
                function1Copydefault.invoke(tacticsData);
            }
            return Unit.INSTANCE;
        }

        public static final Unit AEQbTJ() {
            return Unit.INSTANCE;
        }

        public static final Unit OLrzqt(uKT ukt, java.lang.String str, TacticsData tacticsData, Function0 function0) {
            Function2<kotlin.Pair<java.lang.String, TacticsData>, Function0<Unit>, Unit> function2OLrzqt;
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(tacticsData, "");
            C52499wNr c52499wNr = (C52499wNr) ukt.copydefault.get();
            if (c52499wNr != null && (function2OLrzqt = c52499wNr.OLrzqt()) != null) {
                function2OLrzqt.invoke(new kotlin.Pair<>(str, tacticsData), function0);
            }
            return Unit.INSTANCE;
        }

        public static final Unit copydefault(uKT ukt, java.lang.String str, TacticsData tacticsData) {
            Function1<kotlin.Pair<java.lang.String, TacticsData>, Unit> function1EZpvd;
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(tacticsData, "");
            C52499wNr c52499wNr = (C52499wNr) ukt.copydefault.get();
            if (c52499wNr != null && (function1EZpvd = c52499wNr.EZpvd()) != null) {
                function1EZpvd.invoke(new kotlin.Pair<>(str, tacticsData));
            }
            return Unit.INSTANCE;
        }

        public static final Unit copydefault(uKT ukt, TacticsData tacticsData) {
            Function2<java.lang.String, java.lang.Boolean, Unit> function2AYXKKw;
            C52499wNr c52499wNr = (C52499wNr) ukt.copydefault.get();
            if (c52499wNr != null && (function2AYXKKw = c52499wNr.AYXKKw()) != null) {
                function2AYXKKw.invoke(tacticsData.getAlgoId(), java.lang.Boolean.FALSE);
            }
            return Unit.INSTANCE;
        }
    }

    public final void copydefault(@NotNull TacticsData tacticsData) {
        Intrinsics.checkNotNullParameter(tacticsData, "");
        KWHzl(tacticsData);
        AEQbTJ(C48235uJz.EZpvd.EZpvd(tacticsData, false));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: T */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final TacticsData AEQbTJ() {
        return (TacticsData) this.OLrzqt.getValue();
    }

    private final void KWHzl(TacticsData tacticsData) {
        this.OLrzqt.setValue(tacticsData);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: T */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final uJO OLrzqt() {
        return (uJO) this.AhwBna.getValue();
    }

    private final void AEQbTJ(uJO ujo) {
        this.AhwBna.setValue(ujo);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public final java.lang.Integer EZpvd() {
        return (java.lang.Integer) this.AEQbTJ.getValue();
    }

    public final void EZpvd(java.lang.Integer num) {
        this.AEQbTJ.setValue(num);
    }
}
