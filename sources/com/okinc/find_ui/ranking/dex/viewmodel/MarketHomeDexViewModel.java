package com.okinc.find_ui.ranking.dex.viewmodel;

import com.okinc.find_ui.ranking.dex.viewmodel.MarketHomeDexViewModel;
import com.okinc.market.quotation.ui.model.SortOrder;
import com.okinc.market.quotation.ui.model.dex.DexChainGroupVo;
import com.okinc.market.quotation.ui.model.dex.DexPeriodEnum;
import com.okinc.market.quotation.ui.model.dex.DexSortByEnum;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.JobKt;
import o.AbstractC49408unw;
import o.AbstractC49411unz;
import o.C34964nmQ;
import o.C41421qqW;
import o.C41460qrI;
import o.C41482qre;
import o.C56442yFn;
import o.InterfaceC49371unL;
import o.pUU;
import o.yCM;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public class MarketHomeDexViewModel extends AbstractC49411unz<StateListAnimator> {
    public static final int KWHzl = (C41460qrI.AEQbTJ | C41421qqW.KWHzl) | C41482qre.KWHzl;
    public final C41421qqW EZpvd;
    public final C41460qrI OLrzqt;
    public final C41482qre copydefault;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @yCM
    public MarketHomeDexViewModel(@NotNull C41482qre c41482qre, @NotNull C41421qqW c41421qqW, @NotNull C41460qrI c41460qrI) {
        super(new StateListAnimator(new InterfaceC49371unL.ActionBar(null, 1, null)));
        Intrinsics.checkNotNullParameter(c41482qre, "");
        Intrinsics.checkNotNullParameter(c41421qqW, "");
        Intrinsics.checkNotNullParameter(c41460qrI, "");
        this.copydefault = c41482qre;
        this.EZpvd = c41421qqW;
        this.OLrzqt = c41460qrI;
    }

    public static final class StateListAnimator extends AbstractC49408unw<StateListAnimator> {
        public InterfaceC49371unL<? extends List<C34964nmQ>> KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.find_ui.ranking.dex.viewmodel.MarketHomeDexViewModel$StateListAnimator */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ StateListAnimator copy$default(StateListAnimator stateListAnimator, InterfaceC49371unL interfaceC49371unL, int i, Object obj) {
            if ((i & 1) != 0) {
                interfaceC49371unL = stateListAnimator.KWHzl;
            }
            return stateListAnimator.EZpvd(interfaceC49371unL);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(@NotNull InterfaceC49371unL<? extends List<C34964nmQ>> interfaceC49371unL) {
            Intrinsics.checkNotNullParameter(interfaceC49371unL, "");
            this.KWHzl = interfaceC49371unL;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final StateListAnimator EZpvd(@NotNull InterfaceC49371unL<? extends List<C34964nmQ>> interfaceC49371unL) {
            Intrinsics.checkNotNullParameter(interfaceC49371unL, "");
            return new StateListAnimator(interfaceC49371unL);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: o.unL<? extends java.util.List<o.nmQ>>, o.unL<java.util.List<o.nmQ>> */
        public final InterfaceC49371unL<List<C34964nmQ>> OLrzqt() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof StateListAnimator) && Intrinsics.EZpvd(this.KWHzl, ((StateListAnimator) obj).KWHzl);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.KWHzl.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "DexUiState(dexVoList=" + this.KWHzl + ")";
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (wrap:o.unL:?: TERNARY null = ((wrap:int:0x0001: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:o.unL:0x0007: CONSTRUCTOR (null java.lang.Object), (1 int), (null kotlin.jvm.internal.DefaultConstructorMarker) A[MD:(java.lang.Object, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:45) call: o.unL.StateListAnimator.<init>(java.lang.Object, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r1v0 o.unL))
 A[MD:(o.unL<? extends java.util.List<o.nmQ>>):void (m)] (LINE:44) call: com.okinc.find_ui.ranking.dex.viewmodel.MarketHomeDexViewModel.StateListAnimator.<init>(o.unL):void type: THIS */
        public /* synthetic */ StateListAnimator(InterfaceC49371unL interfaceC49371unL, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? new InterfaceC49371unL.StateListAnimator(null, 1, null) : interfaceC49371unL);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StateListAnimator(@NotNull InterfaceC49371unL<? extends List<C34964nmQ>> interfaceC49371unL) {
            super(new Function1() { // from class: o.nmV
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return MarketHomeDexViewModel.StateListAnimator.AEQbTJ((MarketHomeDexViewModel.StateListAnimator) obj);
                }
            });
            Intrinsics.checkNotNullParameter(interfaceC49371unL, "");
            this.KWHzl = interfaceC49371unL;
        }

        public static final StateListAnimator AEQbTJ(StateListAnimator stateListAnimator) {
            Intrinsics.checkNotNullParameter(stateListAnimator, "");
            return copy$default(stateListAnimator, null, 1, null);
        }
    }

    public final Object copydefault(@NotNull DexChainGroupVo dexChainGroupVo, @NotNull DexPeriodEnum dexPeriodEnum, @NotNull Pair<? extends DexSortByEnum, ? extends SortOrder> pair, int i, @NotNull Continuation<? super Unit> continuation) {
        return CoroutineScopeKt.coroutineScope(new MarketHomeDexViewModel$subscribeData$2(dexChainGroupVo, dexPeriodEnum, pair, i, this, null), continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object OLrzqt(List<C34964nmQ> list, Continuation<? super Unit> continuation) {
        pUU.KWHzl("MarketHomeDexViewModel", "updateDisplayingListUiState [voList=" + list.size() + "]");
        if (JobKt.isActive(continuation.getContext())) {
            if (list.isEmpty()) {
                Object objKWHzl = KWHzl(new MutablePropertyReference1Impl() { // from class: com.okinc.find_ui.ranking.dex.viewmodel.MarketHomeDexViewModel$updateDisplayingListUiState$2
                    @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56560yJx
                    public Object get(Object obj) {
                        return ((MarketHomeDexViewModel.StateListAnimator) obj).OLrzqt();
                    }

                    @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56554yJr
                    public void set(Object obj, Object obj2) {
                        ((MarketHomeDexViewModel.StateListAnimator) obj).AEQbTJ((InterfaceC49371unL<? extends List<C34964nmQ>>) obj2);
                    }
                }, new InterfaceC49371unL.TaskDescription(yDY.AhwBna()), continuation);
                return objKWHzl == C56442yFn.copydefault() ? objKWHzl : Unit.INSTANCE;
            }
            Object objKWHzl2 = KWHzl(new MutablePropertyReference1Impl() { // from class: com.okinc.find_ui.ranking.dex.viewmodel.MarketHomeDexViewModel$updateDisplayingListUiState$3
                @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56560yJx
                public Object get(Object obj) {
                    return ((MarketHomeDexViewModel.StateListAnimator) obj).OLrzqt();
                }

                @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56554yJr
                public void set(Object obj, Object obj2) {
                    ((MarketHomeDexViewModel.StateListAnimator) obj).AEQbTJ((InterfaceC49371unL<? extends List<C34964nmQ>>) obj2);
                }
            }, new InterfaceC49371unL.Activity(list), continuation);
            return objKWHzl2 == C56442yFn.copydefault() ? objKWHzl2 : Unit.INSTANCE;
        }
        pUU.copydefault("MarketHomeDexViewModel", "updateDisplayingListUiState coroutine context is not active");
        return Unit.INSTANCE;
    }
}
