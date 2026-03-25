package com.okinc.business.market.features.token_detail;

import com.okinc.business.dexui.main.market.detail.fragment.chart.pooltransactions.liquiditypools.itemviewbinding.liqpool.LiquidityPoolPairUIItem;
import com.okinc.business.market.features.token_detail.RealtimeDataViewModel$createPoolInfoFlow$1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.channels.ProduceKt;
import kotlinx.coroutines.channels.ProducerScope;
import o.ABH;
import o.C2162ABd;
import o.C2165ABg;
import o.C2177ABs;
import o.C56391yDq;
import o.C56403yEb;
import o.C56442yFn;
import o.InterfaceC2179ABu;
import o.pUU;

/* JADX INFO: loaded from: classes18.dex */
public final class RealtimeDataViewModel$createPoolInfoFlow$1 extends SuspendLambda implements Function2<ProducerScope<? super List<? extends LiquidityPoolPairUIItem>>, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $chainId;
    final /* synthetic */ String $tokenAddress;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ RealtimeDataViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealtimeDataViewModel$createPoolInfoFlow$1(String str, String str2, RealtimeDataViewModel realtimeDataViewModel, Continuation<? super RealtimeDataViewModel$createPoolInfoFlow$1> continuation) {
        super(2, continuation);
        this.$chainId = str;
        this.$tokenAddress = str2;
        this.this$0 = realtimeDataViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        RealtimeDataViewModel$createPoolInfoFlow$1 realtimeDataViewModel$createPoolInfoFlow$1 = new RealtimeDataViewModel$createPoolInfoFlow$1(this.$chainId, this.$tokenAddress, this.this$0, continuation);
        realtimeDataViewModel$createPoolInfoFlow$1.L$0 = obj;
        return realtimeDataViewModel$createPoolInfoFlow$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(ProducerScope<? super List<? extends LiquidityPoolPairUIItem>> producerScope, Continuation<? super Unit> continuation) {
        return invoke2((ProducerScope<? super List<LiquidityPoolPairUIItem>>) producerScope, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(ProducerScope<? super List<LiquidityPoolPairUIItem>> producerScope, Continuation<? super Unit> continuation) {
        return ((RealtimeDataViewModel$createPoolInfoFlow$1) create(producerScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            ProducerScope producerScope = (ProducerScope) this.L$0;
            pUU.KWHzl("RealtimeDataViewModel", "createPoolInfoFlow: Creating interactor for chainId=" + this.$chainId + ", tokenAddress=" + this.$tokenAddress);
            final C2162ABd c2162ABd = new C2162ABd(this.$chainId, this.$tokenAddress);
            pUU.KWHzl("RealtimeDataViewModel", "createPoolInfoFlow: Interactor created");
            final C2177ABs c2177ABsCopydefault = c2162ABd.copydefault(new ActionBar(producerScope, this.this$0));
            pUU.KWHzl("RealtimeDataViewModel", "createPoolInfoFlow: Observer registered");
            c2162ABd.AEQbTJ();
            pUU.KWHzl("RealtimeDataViewModel", "createPoolInfoFlow: Interactor started");
            Function0 function0 = new Function0() { // from class: o.kzd
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return RealtimeDataViewModel$createPoolInfoFlow$1.invokeSuspend$lambda$0(c2162ABd, c2177ABsCopydefault);
                }
            };
            this.label = 1;
            if (ProduceKt.awaitClose(producerScope, function0, this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        return Unit.INSTANCE;
    }

    public static final class ActionBar implements InterfaceC2179ABu {
        public final /* synthetic */ ProducerScope<List<LiquidityPoolPairUIItem>> AEQbTJ;
        public final /* synthetic */ RealtimeDataViewModel OLrzqt;

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlinx.coroutines.channels.ProducerScope<? super java.util.List<com.okinc.business.dexui.main.market.detail.fragment.chart.pooltransactions.liquiditypools.itemviewbinding.liqpool.LiquidityPoolPairUIItem>> */
        /* JADX WARN: Multi-variable type inference failed */
        public ActionBar(ProducerScope<? super List<LiquidityPoolPairUIItem>> producerScope, RealtimeDataViewModel realtimeDataViewModel) {
            this.AEQbTJ = producerScope;
            this.OLrzqt = realtimeDataViewModel;
        }

        @Override // o.InterfaceC2179ABu
        public void KWHzl(ABH abh) {
            Intrinsics.checkNotNullParameter(abh, "");
            pUU.KWHzl("RealtimeDataViewModel", "createPoolInfoFlow: onStateChanged - isLoading=" + abh.EZpvd() + ", pools=" + abh.AEQbTJ().size() + ", error=" + abh.copydefault());
            if (abh.copydefault() != null) {
                this.AEQbTJ.close(new Exception(abh.copydefault()));
                return;
            }
            if (abh.EZpvd()) {
                return;
            }
            ProducerScope<List<LiquidityPoolPairUIItem>> producerScope = this.AEQbTJ;
            List<C2165ABg> listAEQbTJ = abh.AEQbTJ();
            RealtimeDataViewModel realtimeDataViewModel = this.OLrzqt;
            ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(listAEQbTJ, 10));
            Iterator<T> it = listAEQbTJ.iterator();
            while (it.hasNext()) {
                arrayList.add(realtimeDataViewModel.EZpvd((C2165ABg) it.next()));
            }
            producerScope.mo5769trySendJP2dKIU(arrayList);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$0(C2162ABd c2162ABd, C2177ABs c2177ABs) {
        pUU.KWHzl("RealtimeDataViewModel", "createPoolInfoFlow: awaitClose - stopping interactor");
        c2162ABd.OLrzqt();
        c2177ABs.close();
        return Unit.INSTANCE;
    }
}
