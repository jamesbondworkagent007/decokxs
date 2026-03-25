package com.okinc.buysell.ui.bsc.convert;

import com.okinc.crcore.shared.net.responsebean.ConvertCurrencyBean;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC43419rot;
import o.C31389ltB;
import o.C31435ltv;
import o.C32989mnw;
import o.C33129mqd;
import o.C56391yDq;
import o.C56442yFn;
import o.lyP;
import o.mHA;

/* JADX INFO: loaded from: classes7.dex */
public final class ConvertViewModel$updateConvertToAmount$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $amount;
    final /* synthetic */ ConvertCurrencyBean $fromCcy;
    final /* synthetic */ boolean $shouldRefreshExchangeQuote;
    final /* synthetic */ ConvertCurrencyBean $toCcy;
    int label;
    final /* synthetic */ ConvertViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConvertViewModel$updateConvertToAmount$1(boolean z, ConvertViewModel convertViewModel, ConvertCurrencyBean convertCurrencyBean, ConvertCurrencyBean convertCurrencyBean2, String str, Continuation<? super ConvertViewModel$updateConvertToAmount$1> continuation) {
        super(2, continuation);
        this.$shouldRefreshExchangeQuote = z;
        this.this$0 = convertViewModel;
        this.$fromCcy = convertCurrencyBean;
        this.$toCcy = convertCurrencyBean2;
        this.$amount = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ConvertViewModel$updateConvertToAmount$1(this.$shouldRefreshExchangeQuote, this.this$0, this.$fromCcy, this.$toCcy, this.$amount, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ConvertViewModel$updateConvertToAmount$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C31389ltB c31389ltBOLrzqt;
        C31389ltB c31389ltBOLrzqt2;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        String strCopydefault = null;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            if (this.$shouldRefreshExchangeQuote) {
                lyP lypZLjUOn = this.this$0.zLjUOn();
                ConvertCurrencyBean convertCurrencyBean = this.$fromCcy;
                ConvertCurrencyBean convertCurrencyBean2 = this.$toCcy;
                String str = this.$amount;
                this.label = 1;
                obj = lypZLjUOn.KWHzl(convertCurrencyBean, convertCurrencyBean2, str, this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                String str2 = this.$amount;
                C32989mnw<C31389ltB> value = this.this$0.zsXlph().getValue();
                if (value != null && (c31389ltBOLrzqt = value.OLrzqt()) != null) {
                    strCopydefault = c31389ltBOLrzqt.copydefault();
                }
                mHA.OLrzqt.OLrzqt(this.this$0.AwvSrB, C33129mqd.mulS$default(str2, strCopydefault, null, null, null, 14, null));
                return Unit.INSTANCE;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        AbstractC43419rot abstractC43419rot = (AbstractC43419rot) obj;
        String str3 = this.$amount;
        ConvertViewModel convertViewModel = this.this$0;
        if (abstractC43419rot instanceof AbstractC43419rot.StateListAnimator) {
            mHA.OLrzqt.OLrzqt(convertViewModel.AwvSrB, C33129mqd.mulS$default(str3, ((C31435ltv) ((AbstractC43419rot.StateListAnimator) abstractC43419rot).KWHzl()).copydefault(), null, null, null, 14, null));
        }
        String str4 = this.$amount;
        ConvertViewModel convertViewModel2 = this.this$0;
        if (abstractC43419rot instanceof AbstractC43419rot.ActionBar) {
            C32989mnw<C31389ltB> value2 = convertViewModel2.zsXlph().getValue();
            if (value2 != null && (c31389ltBOLrzqt2 = value2.OLrzqt()) != null) {
                strCopydefault = c31389ltBOLrzqt2.copydefault();
            }
            mHA.OLrzqt.OLrzqt(convertViewModel2.AwvSrB, C33129mqd.mulS$default(str4, strCopydefault, null, null, null, 14, null));
        }
        return Unit.INSTANCE;
    }
}
