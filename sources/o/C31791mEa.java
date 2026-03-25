package o;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.shape.CornerBasedShape;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.OnRemeasuredModifierKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSize;
import com.amplifyframework.ui.liveness.ml.FaceDetector;
import com.okinc.business.defi.biz.core.error.WalletImportError;
import com.okinc.cruilib.compose.composable.cryptolist.OKCRCryptoListKt$OKCRCryptoList$4$2$1$1;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import o.C31791mEa;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* JADX INFO: renamed from: o.mEa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C31791mEa {

    /* JADX INFO: renamed from: o.mEa$StateListAnimator */
    public static final class StateListAnimator implements Function2<Composer, java.lang.Integer, Unit> {
        public final /* synthetic */ yHQ<InterfaceC31808mEr, AbstractC31795mEe, java.lang.Boolean, java.lang.Float, Composer, java.lang.Integer, Unit> AEQbTJ;
        public final /* synthetic */ Function2<java.lang.String, java.lang.Boolean, Unit> AYXKKw;
        public final /* synthetic */ float AhwBna;
        public final /* synthetic */ Function1<AbstractC31795mEe, Unit> AkhnZx;
        public final /* synthetic */ C31797mEg AuCTel;
        public final /* synthetic */ MutableIntState DbNXlk;
        public final /* synthetic */ boolean EZpvd;
        public final /* synthetic */ MutableState<java.util.Set<java.lang.String>> KWHzl;
        public final /* synthetic */ CoroutineScope OLrzqt;
        public final /* synthetic */ yHT<AbstractC31795mEe, Function1<? super C31796mEf, Unit>, Composer, java.lang.Integer, Unit> copydefault;
        public final /* synthetic */ Modifier djBIcL;
        public final /* synthetic */ Function1<java.lang.Boolean, Unit> fetchVPNInfo;
        public final /* synthetic */ Function1<C31796mEf, Unit> gEmmrt;
        public final /* synthetic */ CornerBasedShape isConnected;
        public final /* synthetic */ Function2<java.lang.Integer, java.lang.Integer, Unit> valueOf;
        public final /* synthetic */ Function1<java.lang.Boolean, Unit> values;

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function2
        public /* synthetic */ Unit invoke(Composer composer, java.lang.Integer num) {
            AEQbTJ(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void AEQbTJ(Composer composer, int i) {
            float fMo513toDpu2uoSUM;
            if ((i & 3) != 2 || !composer.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(165448555, i, -1, "com.okinc.cruilib.compose.composable.cryptolist.OKCRCryptoList.<anonymous> (OKCRCryptoList.kt:60)");
                }
                java.util.List<AbstractC31795mEe> listKWHzl = this.AuCTel.KWHzl();
                Function1<java.lang.Boolean, Unit> function1 = this.fetchVPNInfo;
                Function1<java.lang.Boolean, Unit> function12 = this.values;
                Function2<java.lang.Integer, java.lang.Integer, Unit> function2 = this.valueOf;
                Function2<java.lang.String, java.lang.Boolean, Unit> function22 = this.AYXKKw;
                composer.startReplaceableGroup(-314247835);
                if (this.EZpvd) {
                    fMo513toDpu2uoSUM = this.AhwBna;
                } else {
                    fMo513toDpu2uoSUM = ((Density) composer.consume(CompositionLocalsKt.getLocalDensity())).mo513toDpu2uoSUM(C31791mEa.EZpvd(this.DbNXlk));
                }
                composer.endReplaceableGroup();
                boolean z = this.EZpvd;
                composer.startReplaceableGroup(-314238257);
                boolean zChanged = composer.changed(this.AkhnZx);
                boolean zChangedInstance = composer.changedInstance(this.OLrzqt);
                final Function1<AbstractC31795mEe, Unit> function13 = this.AkhnZx;
                final CoroutineScope coroutineScope = this.OLrzqt;
                final MutableState<java.util.Set<java.lang.String>> mutableState = this.KWHzl;
                java.lang.Object objRememberedValue = composer.rememberedValue();
                if ((zChanged | zChangedInstance) || objRememberedValue == Composer.Companion.getEmpty()) {
                    objRememberedValue = new Function1() { // from class: o.mDY
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return C31791mEa.StateListAnimator.OLrzqt(function13, coroutineScope, mutableState, (AbstractC31795mEe) obj);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue);
                }
                Function1 function14 = (Function1) objRememberedValue;
                composer.endReplaceableGroup();
                CornerBasedShape cornerBasedShape = this.isConnected;
                Modifier modifier = this.djBIcL;
                boolean zAEQbTJ = this.AuCTel.AEQbTJ();
                boolean zOLrzqt = this.AuCTel.OLrzqt();
                java.util.Set<java.lang.String> value = this.KWHzl.getValue();
                composer.startReplaceableGroup(-314218855);
                final MutableState<java.util.Set<java.lang.String>> mutableState2 = this.KWHzl;
                java.lang.Object objRememberedValue2 = composer.rememberedValue();
                if (objRememberedValue2 == Composer.Companion.getEmpty()) {
                    objRememberedValue2 = new Function0() { // from class: o.mDX
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return C31791mEa.StateListAnimator.EZpvd(mutableState2);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue2);
                }
                composer.endReplaceableGroup();
                ComposableLambda composableLambda = ComposableLambdaKt.composableLambda(composer, 1056907966, true, new AnonymousClass4(this.DbNXlk, this.copydefault, this.gEmmrt, this.KWHzl));
                final yHQ<InterfaceC31808mEr, AbstractC31795mEe, java.lang.Boolean, java.lang.Float, Composer, java.lang.Integer, Unit> yhq = this.AEQbTJ;
                mDL.copydefault(listKWHzl, function1, function12, function2, function22, fMo513toDpu2uoSUM, z, function14, cornerBasedShape, modifier, zAEQbTJ, zOLrzqt, false, value, (Function0) objRememberedValue2, composableLambda, ComposableLambdaKt.composableLambda(composer, -950368027, true, new yHQ<InterfaceC31808mEr, AbstractC31795mEe, java.lang.Boolean, java.lang.Float, Composer, java.lang.Integer, Unit>() { // from class: o.mEa.StateListAnimator.1
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object] */
                    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                    @Override // o.yHQ
                    public /* synthetic */ Unit invoke(InterfaceC31808mEr interfaceC31808mEr, AbstractC31795mEe abstractC31795mEe, java.lang.Boolean bool, java.lang.Float f, Composer composer2, java.lang.Integer num) {
                        OLrzqt(interfaceC31808mEr, abstractC31795mEe, bool.booleanValue(), f.floatValue(), composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void OLrzqt(InterfaceC31808mEr interfaceC31808mEr, AbstractC31795mEe abstractC31795mEe, boolean z2, float f, Composer composer2, int i2) {
                        int i3;
                        Intrinsics.checkNotNullParameter(interfaceC31808mEr, "");
                        Intrinsics.checkNotNullParameter(abstractC31795mEe, "");
                        if ((i2 & 6) == 0) {
                            i3 = ((i2 & 8) == 0 ? composer2.changed(interfaceC31808mEr) : composer2.changedInstance(interfaceC31808mEr) ? 4 : 2) | i2;
                        } else {
                            i3 = i2;
                        }
                        if ((i2 & 48) == 0) {
                            i3 |= composer2.changed(abstractC31795mEe) ? 32 : 16;
                        }
                        if ((i2 & MLKEMEngine.KyberPolyBytes) == 0) {
                            i3 |= composer2.changed(z2) ? 256 : 128;
                        }
                        if ((i2 & 3072) == 0) {
                            i3 |= composer2.changed(f) ? 2048 : 1024;
                        }
                        if ((i3 & 9363) != 9362 || !composer2.getSkipping()) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-950368027, i3, -1, "com.okinc.cruilib.compose.composable.cryptolist.OKCRCryptoList.<anonymous>.<anonymous> (OKCRCryptoList.kt:112)");
                            }
                            yhq.invoke(interfaceC31808mEr, abstractC31795mEe, java.lang.Boolean.valueOf(z2), java.lang.Float.valueOf(f), composer2, java.lang.Integer.valueOf((i3 & 14) | (i3 & WalletImportError.ERROR_CODE_AA_EXIST) | (i3 & FaceDetector.NUM_BOXES) | (i3 & 7168)));
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                                return;
                            }
                            return;
                        }
                        composer2.skipToGroupEnd();
                    }
                }), composer, 0, 1794048, 4096);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                    return;
                }
                return;
            }
            composer.skipToGroupEnd();
        }

        public static final Unit OLrzqt(Function1 function1, CoroutineScope coroutineScope, MutableState mutableState, AbstractC31795mEe abstractC31795mEe) {
            Intrinsics.checkNotNullParameter(abstractC31795mEe, "");
            function1.invoke(abstractC31795mEe);
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new OKCRCryptoListKt$OKCRCryptoList$4$2$1$1(mutableState, abstractC31795mEe, null), 3, null);
            return Unit.INSTANCE;
        }

        public static final Unit EZpvd(MutableState mutableState) {
            mutableState.setValue(yEE.copydefault());
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: o.mEa$StateListAnimator$4, reason: invalid class name */
        public static final class AnonymousClass4 implements yHO<AbstractC31795mEe, Composer, java.lang.Integer, Unit> {
            public final /* synthetic */ Function1<C31796mEf, Unit> AEQbTJ;
            public final /* synthetic */ yHT<AbstractC31795mEe, Function1<? super C31796mEf, Unit>, Composer, java.lang.Integer, Unit> KWHzl;
            public final /* synthetic */ MutableIntState OLrzqt;
            public final /* synthetic */ MutableState<java.util.Set<java.lang.String>> copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: o.yHT<? super o.mEe, ? super kotlin.jvm.functions.Function1<? super o.mEf, kotlin.Unit>, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> */
            /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super o.mEf, kotlin.Unit> */
            /* JADX WARN: Multi-variable type inference failed */
            public AnonymousClass4(MutableIntState mutableIntState, yHT<? super AbstractC31795mEe, ? super Function1<? super C31796mEf, Unit>, ? super Composer, ? super java.lang.Integer, Unit> yht, Function1<? super C31796mEf, Unit> function1, MutableState<java.util.Set<java.lang.String>> mutableState) {
                this.OLrzqt = mutableIntState;
                this.KWHzl = yht;
                this.AEQbTJ = function1;
                this.copydefault = mutableState;
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // o.yHO
            public /* synthetic */ Unit invoke(AbstractC31795mEe abstractC31795mEe, Composer composer, java.lang.Integer num) {
                AEQbTJ(abstractC31795mEe, composer, num.intValue());
                return Unit.INSTANCE;
            }

            public final void AEQbTJ(final AbstractC31795mEe abstractC31795mEe, Composer composer, int i) {
                int i2;
                Intrinsics.checkNotNullParameter(abstractC31795mEe, "");
                if ((i & 6) == 0) {
                    i2 = i | (composer.changed(abstractC31795mEe) ? 4 : 2);
                } else {
                    i2 = i;
                }
                if ((i2 & 19) != 18 || !composer.getSkipping()) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1056907966, i2, -1, "com.okinc.cruilib.compose.composable.cryptolist.OKCRCryptoList.<anonymous>.<anonymous> (OKCRCryptoList.kt:94)");
                    }
                    Modifier.Companion companion = Modifier.Companion;
                    composer.startReplaceableGroup(-602399016);
                    final MutableIntState mutableIntState = this.OLrzqt;
                    java.lang.Object objRememberedValue = composer.rememberedValue();
                    Composer.Companion companion2 = Composer.Companion;
                    if (objRememberedValue == companion2.getEmpty()) {
                        objRememberedValue = new Function1() { // from class: o.mDZ
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj) {
                                return C31791mEa.StateListAnimator.AnonymousClass4.OLrzqt(mutableIntState, (IntSize) obj);
                            }
                        };
                        composer.updateRememberedValue(objRememberedValue);
                    }
                    composer.endReplaceableGroup();
                    Modifier modifierOnSizeChanged = OnRemeasuredModifierKt.onSizeChanged(companion, (Function1) objRememberedValue);
                    yHT<AbstractC31795mEe, Function1<? super C31796mEf, Unit>, Composer, java.lang.Integer, Unit> yht = this.KWHzl;
                    final Function1<C31796mEf, Unit> function1 = this.AEQbTJ;
                    final MutableState<java.util.Set<java.lang.String>> mutableState = this.copydefault;
                    composer.startReplaceableGroup(733328855);
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.Companion.getTopStart(), false, composer, 0);
                    composer.startReplaceableGroup(-1323940314);
                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                    ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
                    Function0<ComposeUiNode> constructor = companion3.getConstructor();
                    yHO<SkippableUpdater<ComposeUiNode>, Composer, java.lang.Integer, Unit> yhoModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierOnSizeChanged);
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
                    Updater.m2790setimpl(composerM2783constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion3.getSetMeasurePolicy());
                    Updater.m2790setimpl(composerM2783constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, java.lang.Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                    if (composerM2783constructorimpl.getInserting() || !Intrinsics.EZpvd(composerM2783constructorimpl.rememberedValue(), java.lang.Integer.valueOf(currentCompositeKeyHash))) {
                        composerM2783constructorimpl.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash));
                        composerM2783constructorimpl.apply(java.lang.Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    yhoModifierMaterializerOf.invoke(SkippableUpdater.m2774boximpl(SkippableUpdater.m2775constructorimpl(composer)), composer, 0);
                    composer.startReplaceableGroup(2058660585);
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    composer.startReplaceableGroup(258657118);
                    int i3 = i2 & 14;
                    boolean z = i3 == 4;
                    boolean zChanged = composer.changed(function1);
                    java.lang.Object objRememberedValue2 = composer.rememberedValue();
                    if ((zChanged | z) || objRememberedValue2 == companion2.getEmpty()) {
                        objRememberedValue2 = new Function1() { // from class: o.mEb
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj) {
                                return C31791mEa.StateListAnimator.AnonymousClass4.KWHzl(mutableState, function1, abstractC31795mEe, (C31796mEf) obj);
                            }
                        };
                        composer.updateRememberedValue(objRememberedValue2);
                    }
                    composer.endReplaceableGroup();
                    yht.invoke(abstractC31795mEe, (Function1) objRememberedValue2, composer, java.lang.Integer.valueOf(i3));
                    composer.endReplaceableGroup();
                    composer.endNode();
                    composer.endReplaceableGroup();
                    composer.endReplaceableGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        return;
                    }
                    return;
                }
                composer.skipToGroupEnd();
            }

            public static final Unit OLrzqt(MutableIntState mutableIntState, IntSize intSize) {
                C31791mEa.copydefault(mutableIntState, IntSize.m5574getWidthimpl(intSize.m5578unboximpl()));
                return Unit.INSTANCE;
            }

            public static final Unit KWHzl(MutableState mutableState, Function1 function1, AbstractC31795mEe abstractC31795mEe, C31796mEf c31796mEf) {
                Intrinsics.checkNotNullParameter(c31796mEf, "");
                if (c31796mEf.EZpvd()) {
                    java.util.Set setDXXBbs = CollectionsKt___CollectionsKt.DXXBbs((java.lang.Iterable) mutableState.getValue());
                    setDXXBbs.add(abstractC31795mEe.AEQbTJ());
                    mutableState.setValue(CollectionsKt___CollectionsKt.OqFWZa(setDXXBbs));
                }
                function1.invoke(c31796mEf);
                return Unit.INSTANCE;
            }
        }
    }

    public static final int EZpvd(MutableIntState mutableIntState) {
        return mutableIntState.getIntValue();
    }

    public static final void copydefault(MutableIntState mutableIntState, int i) {
        mutableIntState.setIntValue(i);
    }
}
