package com.okinc.buysell.ui.bsc.convert;

import androidx.lifecycle.MutableLiveData;
import com.okinc.crcore.shared.net.responsebean.ConvertCurrencyBean;
import com.okinc.network.okg.response.OKServerException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC43419rot;
import o.C31389ltB;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.lyP;
import o.mHA;

/* JADX INFO: loaded from: classes7.dex */
public final class ConvertViewModel$onToTokenSwitched$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ ConvertCurrencyBean $fromCcy;
    final /* synthetic */ ConvertCurrencyBean $toCcy;
    int label;
    final /* synthetic */ ConvertViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConvertViewModel$onToTokenSwitched$1(ConvertViewModel convertViewModel, ConvertCurrencyBean convertCurrencyBean, ConvertCurrencyBean convertCurrencyBean2, Continuation<? super ConvertViewModel$onToTokenSwitched$1> continuation) {
        super(2, continuation);
        this.this$0 = convertViewModel;
        this.$fromCcy = convertCurrencyBean;
        this.$toCcy = convertCurrencyBean2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ConvertViewModel$onToTokenSwitched$1(this.this$0, this.$fromCcy, this.$toCcy, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ConvertViewModel$onToTokenSwitched$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                this.this$0.EZpvd(this.$fromCcy, this.$toCcy);
                mHA mha = mHA.OLrzqt;
                MutableLiveData mutableLiveData = this.this$0.fJNWhG;
                ConvertViewModel convertViewModel = this.this$0;
                mha.OLrzqt(mutableLiveData, C56443yFo.KWHzl(convertViewModel.OLrzqt(convertViewModel.fetchVPNInfo(), this.$toCcy)));
                mha.OLrzqt(this.this$0.fIwbmz, C56443yFo.KWHzl(Intrinsics.EZpvd(this.this$0.fetchVPNInfo().getFiatFlag(), C56443yFo.KWHzl(true))));
                mha.OLrzqt(this.this$0.getFieldNames, new Pair(this.this$0.fetchVPNInfo(), this.$toCcy));
                this.this$0.gHZMYf.setValue(this.$toCcy.getIcon());
                this.this$0.OcIXYQ.setValue(this.$toCcy.getCcy());
                this.this$0.DTwDnp.setValue(this.this$0.EZpvd(this.$toCcy.getEarnOption()));
                lyP lypZLjUOn = this.this$0.zLjUOn();
                ConvertCurrencyBean convertCurrencyBeanFetchVPNInfo = this.this$0.fetchVPNInfo();
                ConvertCurrencyBean convertCurrencyBean = this.$toCcy;
                this.label = 1;
                obj = lypZLjUOn.copydefault(convertCurrencyBeanFetchVPNInfo, convertCurrencyBean, this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            mHA.OLrzqt.OLrzqt(this.this$0.DbNXlk, (C31389ltB) ((AbstractC43419rot) obj).AEQbTJ());
        } catch (OKServerException e) {
            mHA.OLrzqt.OLrzqt(this.this$0.QOLQEE, e.getMessage());
        }
        return Unit.INSTANCE;
    }
}
