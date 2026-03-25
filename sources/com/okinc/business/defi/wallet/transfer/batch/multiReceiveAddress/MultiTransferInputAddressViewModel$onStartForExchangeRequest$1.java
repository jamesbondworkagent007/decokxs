package com.okinc.business.defi.wallet.transfer.batch.multiReceiveAddress;

import androidx.lifecycle.ViewModelProvider;
import com.okinc.business.defi.api.model.tx.signdata.MultiTransferSignData;
import com.okinc.business.defi.wallet.transfer.batch.multiReceiveAddress.MultiTransferInputAddressViewModel;
import com.okinc.business.defi.wallet.transfer.batch.multiReceiveAddress.MultiTransferInputAddressViewModel$onStartForExchangeRequest$1;
import com.okinc.business.defi.wallet.transfer.receive.exchange.bean.ExchangeAddressData;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.Channel;
import o.AbstractActivityC33041mov;
import o.C10854bwM;
import o.C10948byA;
import o.C10954byG;
import o.C21113gtd;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.dZP;

/* JADX INFO: loaded from: classes5.dex */
public final class MultiTransferInputAddressViewModel$onStartForExchangeRequest$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ AbstractActivityC33041mov $activity;
    final /* synthetic */ Function1<ExchangeAddressData, Unit> $callback;
    int label;
    final /* synthetic */ MultiTransferInputAddressViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super com.okinc.business.defi.wallet.transfer.receive.exchange.bean.ExchangeAddressData, kotlin.Unit> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public MultiTransferInputAddressViewModel$onStartForExchangeRequest$1(MultiTransferInputAddressViewModel multiTransferInputAddressViewModel, AbstractActivityC33041mov abstractActivityC33041mov, Function1<? super ExchangeAddressData, Unit> function1, Continuation<? super MultiTransferInputAddressViewModel$onStartForExchangeRequest$1> continuation) {
        super(2, continuation);
        this.this$0 = multiTransferInputAddressViewModel;
        this.$activity = abstractActivityC33041mov;
        this.$callback = function1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MultiTransferInputAddressViewModel$onStartForExchangeRequest$1(this.this$0, this.$activity, this.$callback, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MultiTransferInputAddressViewModel$onStartForExchangeRequest$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            if (this.this$0.EZpvd() == null) {
                Channel channel = this.this$0.fetchVPNInfo;
                MultiTransferInputAddressViewModel.Companion.LoadingStatus loadingStatus = MultiTransferInputAddressViewModel.Companion.LoadingStatus.LOADING;
                this.label = 1;
                if (channel.send(loadingStatus, this) == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                Function1<ExchangeAddressData, Unit> function1 = this.$callback;
                if (function1 != null) {
                    function1.invoke(this.this$0.EZpvd());
                }
                return Unit.INSTANCE;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        C10948byA c10948byAValueOf = C10954byG.EZpvd.valueOf();
        MultiTransferSignData multiTransferSignDataFetchVPNInfo = this.this$0.fetchVPNInfo();
        C10854bwM c10854bwMKWHzl = c10948byAValueOf.KWHzl(multiTransferSignDataFetchVPNInfo != null ? C56443yFo.KWHzl(multiTransferSignDataFetchVPNInfo.getCoinId()) : null);
        if (c10854bwMKWHzl == null) {
            return Unit.INSTANCE;
        }
        C21113gtd c21113gtd = (C21113gtd) new ViewModelProvider(this.$activity).get(C21113gtd.class);
        boolean zZsXlph = c10854bwMKWHzl.zsXlph();
        AbstractActivityC33041mov abstractActivityC33041mov = this.$activity;
        Integer numAEQbTJ = C56443yFo.AEQbTJ(c10854bwMKWHzl.AxsJAY());
        boolean z = dZP.OLrzqt.AhwBna().length() == 0;
        final MultiTransferInputAddressViewModel multiTransferInputAddressViewModel = this.this$0;
        final Function1<ExchangeAddressData, Unit> function12 = this.$callback;
        c21113gtd.AEQbTJ((80 & 1) != 0 ? false : zZsXlph, abstractActivityC33041mov, numAEQbTJ, c10854bwMKWHzl, (80 & 16) != 0 ? false : false, (80 & 32) != 0 ? false : z, (80 & 64) != 0, (80 & 128) != 0 ? null : new Function1() { // from class: o.gqy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj2) {
                return MultiTransferInputAddressViewModel$onStartForExchangeRequest$1.invokeSuspend$lambda$0(multiTransferInputAddressViewModel, function12, (ExchangeAddressData) obj2);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$0(MultiTransferInputAddressViewModel multiTransferInputAddressViewModel, Function1 function1, ExchangeAddressData exchangeAddressData) {
        multiTransferInputAddressViewModel.OLrzqt(exchangeAddressData);
        if (function1 != null) {
            function1.invoke(exchangeAddressData);
        }
        return Unit.INSTANCE;
    }
}
