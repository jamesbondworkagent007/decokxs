package com.okinc.business.market.features.analysis.futures.sub.funding.ui.viewmodel;

import androidx.lifecycle.ViewModelKt;
import com.okinc.business.market.features.analysis.futures.sub.funding.ui.model.CoinPairVo;
import com.okinc.business.market.features.analysis.futures.sub.funding.ui.viewmodel.SelectCoinPairViewModel;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import o.AbstractC49408unw;
import o.AbstractC49411unz;
import o.C25880jJu;
import o.C56442yFn;
import o.InterfaceC49371unL;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class SelectCoinPairViewModel extends AbstractC49411unz<ActionBar> {
    public List<CoinPairVo> AEQbTJ;
    public final C25880jJu OLrzqt;
    public final CoroutineDispatcher copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CoroutineDispatcher copydefault() {
        return this.copydefault;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @yCM
    public SelectCoinPairViewModel(@NotNull C25880jJu c25880jJu, @NotNull CoroutineDispatcher coroutineDispatcher) {
        super(new ActionBar(null, 1, 0 == true ? 1 : 0));
        Intrinsics.checkNotNullParameter(c25880jJu, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.OLrzqt = c25880jJu;
        this.copydefault = coroutineDispatcher;
    }

    public static final class ActionBar extends AbstractC49408unw<ActionBar> {
        public InterfaceC49371unL<? extends List<CoinPairVo>> EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.market.features.analysis.futures.sub.funding.ui.viewmodel.SelectCoinPairViewModel$ActionBar */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ActionBar copy$default(ActionBar actionBar, InterfaceC49371unL interfaceC49371unL, int i, Object obj) {
            if ((i & 1) != 0) {
                interfaceC49371unL = actionBar.EZpvd;
            }
            return actionBar.KWHzl(interfaceC49371unL);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(@NotNull InterfaceC49371unL<? extends List<CoinPairVo>> interfaceC49371unL) {
            Intrinsics.checkNotNullParameter(interfaceC49371unL, "");
            this.EZpvd = interfaceC49371unL;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ActionBar KWHzl(@NotNull InterfaceC49371unL<? extends List<CoinPairVo>> interfaceC49371unL) {
            Intrinsics.checkNotNullParameter(interfaceC49371unL, "");
            return new ActionBar(interfaceC49371unL);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: o.unL<? extends java.util.List<com.okinc.business.market.features.analysis.futures.sub.funding.ui.model.CoinPairVo>>, o.unL<java.util.List<com.okinc.business.market.features.analysis.futures.sub.funding.ui.model.CoinPairVo>> */
        public final InterfaceC49371unL<List<CoinPairVo>> OLrzqt() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ActionBar) && Intrinsics.EZpvd(this.EZpvd, ((ActionBar) obj).EZpvd);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.EZpvd.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "SelectCoinPairUiState(coinPairVo=" + this.EZpvd + ")";
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (wrap:o.unL:?: TERNARY null = ((wrap:int:0x0001: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:o.unL:0x0007: CONSTRUCTOR (null java.lang.Object), (1 int), (null kotlin.jvm.internal.DefaultConstructorMarker) A[MD:(java.lang.Object, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:29) call: o.unL.StateListAnimator.<init>(java.lang.Object, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r1v0 o.unL))
 A[MD:(o.unL<? extends java.util.List<com.okinc.business.market.features.analysis.futures.sub.funding.ui.model.CoinPairVo>>):void (m)] (LINE:28) call: com.okinc.business.market.features.analysis.futures.sub.funding.ui.viewmodel.SelectCoinPairViewModel.ActionBar.<init>(o.unL):void type: THIS */
        public /* synthetic */ ActionBar(InterfaceC49371unL interfaceC49371unL, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? new InterfaceC49371unL.StateListAnimator(null, 1, null) : interfaceC49371unL);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ActionBar(@NotNull InterfaceC49371unL<? extends List<CoinPairVo>> interfaceC49371unL) {
            super(new Function1() { // from class: o.jKF
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return SelectCoinPairViewModel.ActionBar.OLrzqt((SelectCoinPairViewModel.ActionBar) obj);
                }
            });
            Intrinsics.checkNotNullParameter(interfaceC49371unL, "");
            this.EZpvd = interfaceC49371unL;
        }

        public static final ActionBar OLrzqt(ActionBar actionBar) {
            Intrinsics.checkNotNullParameter(actionBar, "");
            return copy$default(actionBar, null, 1, null);
        }
    }

    public final void OLrzqt(@NotNull CoinPairVo coinPairVo, String str) {
        Intrinsics.checkNotNullParameter(coinPairVo, "");
        EZpvd(BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new SelectCoinPairViewModel$loadSwapCoinsData$1(this, coinPairVo, str, null), 3, null), "loadSwapCoinsData");
    }

    public final Object OLrzqt(InterfaceC49371unL<? extends List<CoinPairVo>> interfaceC49371unL, Continuation<? super Unit> continuation) {
        Object objKWHzl = KWHzl(new MutablePropertyReference1Impl() { // from class: com.okinc.business.market.features.analysis.futures.sub.funding.ui.viewmodel.SelectCoinPairViewModel$updateInstrumentsUiState$2
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56560yJx
            public Object get(Object obj) {
                return ((SelectCoinPairViewModel.ActionBar) obj).OLrzqt();
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56554yJr
            public void set(Object obj, Object obj2) {
                ((SelectCoinPairViewModel.ActionBar) obj).EZpvd((InterfaceC49371unL<? extends List<CoinPairVo>>) obj2);
            }
        }, interfaceC49371unL, continuation);
        return objKWHzl == C56442yFn.copydefault() ? objKWHzl : Unit.INSTANCE;
    }

    public final void EZpvd(CharSequence charSequence) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new SelectCoinPairViewModel$filter$1(this, charSequence, null), 3, null);
    }
}
