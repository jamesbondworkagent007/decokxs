package com.okinc.buysell.domain;

import com.okinc.crcore.shared.net.responsebean.ConvertCurrencyBean;
import com.okinc.network.okg.response.OKServerException;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC43419rot;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.lyV;
import o.mCZ;

/* JADX INFO: loaded from: classes7.dex */
public final class GetConvertToListUseCase$invoke$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super AbstractC43419rot<? extends List<? extends ConvertCurrencyBean>, ? extends OKServerException>>, Object> {
    final /* synthetic */ boolean $applyCachePolicy;
    final /* synthetic */ String $fromCcy;
    final /* synthetic */ String $localCurrency;
    int label;
    final /* synthetic */ lyV this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetConvertToListUseCase$invoke$2(String str, boolean z, lyV lyv, String str2, Continuation<? super GetConvertToListUseCase$invoke$2> continuation) {
        super(2, continuation);
        this.$fromCcy = str;
        this.$applyCachePolicy = z;
        this.this$0 = lyv;
        this.$localCurrency = str2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new GetConvertToListUseCase$invoke$2(this.$fromCcy, this.$applyCachePolicy, this.this$0, this.$localCurrency, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super AbstractC43419rot<? extends List<? extends ConvertCurrencyBean>, ? extends OKServerException>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super AbstractC43419rot<? extends List<ConvertCurrencyBean>, OKServerException>>) continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super AbstractC43419rot<? extends List<ConvertCurrencyBean>, OKServerException>> continuation) {
        return ((GetConvertToListUseCase$invoke$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                C56391yDq.AEQbTJ(obj);
                return (AbstractC43419rot) obj;
            }
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            return (AbstractC43419rot) obj;
        }
        C56391yDq.AEQbTJ(obj);
        String str = this.$fromCcy;
        if (str == null || str.length() <= 0) {
            str = null;
        }
        String str2 = str;
        if (this.$applyCachePolicy) {
            mCZ mcz = this.this$0.KWHzl;
            Integer numAEQbTJ = C56443yFo.AEQbTJ(5);
            String str3 = this.$localCurrency;
            this.label = 1;
            obj = mcz.AEQbTJ("FIRST_CACHE", numAEQbTJ, str2, str3, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
            return (AbstractC43419rot) obj;
        }
        mCZ mcz2 = this.this$0.KWHzl;
        Integer numAEQbTJ2 = C56443yFo.AEQbTJ(0);
        String str4 = this.$localCurrency;
        this.label = 2;
        obj = mcz2.AEQbTJ("NO_CACHE", numAEQbTJ2, str2, str4, this);
        if (obj == objCopydefault) {
            return objCopydefault;
        }
        return (AbstractC43419rot) obj;
    }
}
