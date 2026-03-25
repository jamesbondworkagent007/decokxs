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
import o.C31394ltG;
import o.C31663lzk;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.lyH;
import o.lyP;
import o.mHA;

/* JADX INFO: loaded from: classes7.dex */
public final class ConvertViewModel$onRefreshData$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ ConvertCurrencyBean $fromCcy;
    final /* synthetic */ ConvertCurrencyBean $toCcy;
    Object L$0;
    int label;
    final /* synthetic */ ConvertViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConvertViewModel$onRefreshData$1(ConvertViewModel convertViewModel, ConvertCurrencyBean convertCurrencyBean, ConvertCurrencyBean convertCurrencyBean2, Continuation<? super ConvertViewModel$onRefreshData$1> continuation) {
        super(2, continuation);
        this.this$0 = convertViewModel;
        this.$fromCcy = convertCurrencyBean;
        this.$toCcy = convertCurrencyBean2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ConvertViewModel$onRefreshData$1(this.this$0, this.$fromCcy, this.$toCcy, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ConvertViewModel$onRefreshData$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [553=4] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x011e A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        C31394ltG c31394ltG;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
        } catch (OKServerException e) {
            mHA.OLrzqt.OLrzqt(this.this$0.QOLQEE, e.getMessage());
        }
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C31663lzk c31663lzkDvKsVJ = this.this$0.dvKsVJ();
            ConvertCurrencyBean convertCurrencyBean = this.$fromCcy;
            String ccy = this.$toCcy.getCcy();
            String isoCode = this.this$0.fIwbmz().getIsoCode();
            this.label = 1;
            obj = c31663lzkDvKsVJ.copydefault(convertCurrencyBean, ccy, isoCode, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                    mHA.OLrzqt.OLrzqt(this.this$0.DbNXlk, (C31389ltB) ((AbstractC43419rot) obj).AEQbTJ());
                    return Unit.INSTANCE;
                }
                c31394ltG = (C31394ltG) this.L$0;
                C56391yDq.AEQbTJ(obj);
                C31394ltG c31394ltG2 = (C31394ltG) ((AbstractC43419rot) obj).AEQbTJ();
                this.this$0.EZpvd(c31394ltG.OLrzqt(), c31394ltG2.OLrzqt());
                this.this$0.AEQbTJ(c31394ltG.KWHzl());
                this.this$0.copydefault(c31394ltG2.KWHzl());
                mHA mha = mHA.OLrzqt;
                MutableLiveData mutableLiveData = this.this$0.fJNWhG;
                ConvertViewModel convertViewModel = this.this$0;
                mha.OLrzqt(mutableLiveData, C56443yFo.KWHzl(convertViewModel.OLrzqt(convertViewModel.fetchVPNInfo(), this.this$0.ejfBZ())));
                mha.OLrzqt(this.this$0.fIwbmz, C56443yFo.KWHzl(Intrinsics.EZpvd(this.this$0.fetchVPNInfo().getFiatFlag(), C56443yFo.KWHzl(true))));
                mha.OLrzqt(this.this$0.uzCIH, new Pair(this.this$0.fetchVPNInfo(), this.this$0.ejfBZ()));
                lyP lypZLjUOn = this.this$0.zLjUOn();
                ConvertCurrencyBean convertCurrencyBeanFetchVPNInfo = this.this$0.fetchVPNInfo();
                ConvertCurrencyBean convertCurrencyBeanEjfBZ = this.this$0.ejfBZ();
                this.L$0 = null;
                this.label = 3;
                obj = lypZLjUOn.copydefault(convertCurrencyBeanFetchVPNInfo, convertCurrencyBeanEjfBZ, this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
                mHA.OLrzqt.OLrzqt(this.this$0.DbNXlk, (C31389ltB) ((AbstractC43419rot) obj).AEQbTJ());
                return Unit.INSTANCE;
            }
            C56391yDq.AEQbTJ(obj);
        }
        c31394ltG = (C31394ltG) ((AbstractC43419rot) obj).AEQbTJ();
        lyH newProxyInstance = this.this$0.getNewProxyInstance();
        String ccy2 = this.$fromCcy.getCcy();
        String ccy3 = this.$toCcy.getCcy();
        String isoCode2 = this.this$0.fIwbmz().getIsoCode();
        this.L$0 = c31394ltG;
        this.label = 2;
        obj = lyH.invoke$default(newProxyInstance, false, ccy2, ccy3, isoCode2, this, 1, null);
        if (obj == objCopydefault) {
            return objCopydefault;
        }
        C31394ltG c31394ltG22 = (C31394ltG) ((AbstractC43419rot) obj).AEQbTJ();
        this.this$0.EZpvd(c31394ltG.OLrzqt(), c31394ltG22.OLrzqt());
        this.this$0.AEQbTJ(c31394ltG.KWHzl());
        this.this$0.copydefault(c31394ltG22.KWHzl());
        mHA mha2 = mHA.OLrzqt;
        MutableLiveData mutableLiveData2 = this.this$0.fJNWhG;
        ConvertViewModel convertViewModel2 = this.this$0;
        mha2.OLrzqt(mutableLiveData2, C56443yFo.KWHzl(convertViewModel2.OLrzqt(convertViewModel2.fetchVPNInfo(), this.this$0.ejfBZ())));
        mha2.OLrzqt(this.this$0.fIwbmz, C56443yFo.KWHzl(Intrinsics.EZpvd(this.this$0.fetchVPNInfo().getFiatFlag(), C56443yFo.KWHzl(true))));
        mha2.OLrzqt(this.this$0.uzCIH, new Pair(this.this$0.fetchVPNInfo(), this.this$0.ejfBZ()));
        lyP lypZLjUOn2 = this.this$0.zLjUOn();
        ConvertCurrencyBean convertCurrencyBeanFetchVPNInfo2 = this.this$0.fetchVPNInfo();
        ConvertCurrencyBean convertCurrencyBeanEjfBZ2 = this.this$0.ejfBZ();
        this.L$0 = null;
        this.label = 3;
        obj = lypZLjUOn2.copydefault(convertCurrencyBeanFetchVPNInfo2, convertCurrencyBeanEjfBZ2, this);
        if (obj == objCopydefault) {
        }
        mHA.OLrzqt.OLrzqt(this.this$0.DbNXlk, (C31389ltB) ((AbstractC43419rot) obj).AEQbTJ());
        return Unit.INSTANCE;
    }
}
