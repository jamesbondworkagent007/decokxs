package com.okinc.buysell.ui.bsc.convert;

import com.okinc.crcore.shared.net.responsebean.ConvertCurrencyBean;
import com.okinc.network.okg.response.OKServerException;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC43419rot;
import o.C31394ltG;
import o.C31663lzk;
import o.C56391yDq;
import o.C56442yFn;
import o.mHA;

/* JADX INFO: loaded from: classes7.dex */
public final class ConvertViewModel$onRefreshBalance$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ ConvertViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConvertViewModel$onRefreshBalance$1(ConvertViewModel convertViewModel, Continuation<? super ConvertViewModel$onRefreshBalance$1> continuation) {
        super(2, continuation);
        this.this$0 = convertViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ConvertViewModel$onRefreshBalance$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ConvertViewModel$onRefreshBalance$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                C31663lzk c31663lzkDvKsVJ = this.this$0.dvKsVJ();
                ConvertCurrencyBean convertCurrencyBeanFetchVPNInfo = this.this$0.fetchVPNInfo();
                String ccy = this.this$0.ejfBZ().getCcy();
                String isoCode = this.this$0.fIwbmz().getIsoCode();
                this.label = 1;
                obj = c31663lzkDvKsVJ.copydefault(convertCurrencyBeanFetchVPNInfo, ccy, isoCode, this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            C31394ltG c31394ltG = (C31394ltG) ((AbstractC43419rot) obj).AEQbTJ();
            this.this$0.AEQbTJ(c31394ltG.KWHzl());
            List<ConvertCurrencyBean> listIsConnected = this.this$0.isConnected();
            ConvertViewModel convertViewModel = this.this$0;
            if (!(listIsConnected instanceof Collection) || !listIsConnected.isEmpty()) {
                Iterator<T> it = listIsConnected.iterator();
                while (it.hasNext()) {
                    if (Intrinsics.EZpvd((Object) ((ConvertCurrencyBean) it.next()).getCcy(), (Object) convertViewModel.fetchVPNInfo().getCcy())) {
                        this.this$0.EZpvd(c31394ltG.OLrzqt(), this.this$0.ejfBZ());
                        break;
                    }
                }
            }
            this.this$0.fetchVPNInfo().setAvailable("0");
            this.this$0.OLrzqt("0");
            mHA.OLrzqt.OLrzqt(this.this$0.uzCIH, new Pair(this.this$0.fetchVPNInfo(), this.this$0.ejfBZ()));
        } catch (OKServerException e) {
            mHA.OLrzqt.OLrzqt(this.this$0.QOLQEE, e.getMessage());
        }
        return Unit.INSTANCE;
    }
}
