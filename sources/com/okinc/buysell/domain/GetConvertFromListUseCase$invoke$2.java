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
import o.C43251rlk;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.InterfaceC31670lzr;
import o.lyO;
import o.mCZ;

/* JADX INFO: loaded from: classes7.dex */
public final class GetConvertFromListUseCase$invoke$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super AbstractC43419rot<? extends List<? extends ConvertCurrencyBean>, ? extends OKServerException>>, Object> {
    final /* synthetic */ boolean $applyCachePolicy;
    final /* synthetic */ String $valuationUnit;
    int label;
    final /* synthetic */ lyO this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetConvertFromListUseCase$invoke$2(boolean z, lyO lyo, String str, Continuation<? super GetConvertFromListUseCase$invoke$2> continuation) {
        super(2, continuation);
        this.$applyCachePolicy = z;
        this.this$0 = lyo;
        this.$valuationUnit = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new GetConvertFromListUseCase$invoke$2(this.$applyCachePolicy, this.this$0, this.$valuationUnit, continuation);
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
        return ((GetConvertFromListUseCase$invoke$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
        boolean z = (((InterfaceC31670lzr) C43251rlk.copydefault(InterfaceC31670lzr.class)).AYXKKw() ^ true) && !((InterfaceC31670lzr) C43251rlk.copydefault(InterfaceC31670lzr.class)).AhwBna();
        if (this.$applyCachePolicy) {
            mCZ mcz = this.this$0.copydefault;
            Integer numAEQbTJ = C56443yFo.AEQbTJ(5);
            String str = this.$valuationUnit;
            Integer numAEQbTJ2 = C56443yFo.AEQbTJ(1);
            Boolean boolKWHzl = C56443yFo.KWHzl(z);
            this.label = 1;
            obj = mcz.EZpvd("FIRST_CACHE", numAEQbTJ, str, numAEQbTJ2, boolKWHzl, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
            return (AbstractC43419rot) obj;
        }
        mCZ mcz2 = this.this$0.copydefault;
        Integer numAEQbTJ3 = C56443yFo.AEQbTJ(0);
        String str2 = this.$valuationUnit;
        Integer numAEQbTJ4 = C56443yFo.AEQbTJ(1);
        Boolean boolKWHzl2 = C56443yFo.KWHzl(z);
        this.label = 2;
        obj = mcz2.EZpvd("NO_CACHE", numAEQbTJ3, str2, numAEQbTJ4, boolKWHzl2, this);
        if (obj == objCopydefault) {
            return objCopydefault;
        }
        return (AbstractC43419rot) obj;
    }
}
