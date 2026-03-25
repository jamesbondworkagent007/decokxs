package com.okinc.business.invest_biz.data.repository.product_details;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import o.C23673iFb;
import o.C23682iFk;
import o.C56391yDq;
import o.C56442yFn;
import o.iEO;
import o.iEP;

/* JADX INFO: loaded from: classes6.dex */
public final class ProductDetailsRepositoryImpl$getProductDetails$2 extends SuspendLambda implements Function1<Continuation<? super C23673iFb>, Object> {
    final /* synthetic */ C23682iFk $params;
    final /* synthetic */ boolean $updateCache;
    int label;
    final /* synthetic */ iEP this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProductDetailsRepositoryImpl$getProductDetails$2(iEP iep, C23682iFk c23682iFk, boolean z, Continuation<? super ProductDetailsRepositoryImpl$getProductDetails$2> continuation) {
        super(1, continuation);
        this.this$0 = iep;
        this.$params = c23682iFk;
        this.$updateCache = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new ProductDetailsRepositoryImpl$getProductDetails$2(this.this$0, this.$params, this.$updateCache, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super C23673iFb> continuation) {
        return ((ProductDetailsRepositoryImpl$getProductDetails$2) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0067 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0068 A[PHI: r8
  0x0068: PHI (r8v11 java.lang.Object) = (r8v10 java.lang.Object), (r8v0 java.lang.Object) binds: [B:24:0x0065, B:7:0x0011] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            iEO ieo = this.this$0.EZpvd;
            long jKWHzl = this.$params.KWHzl();
            this.label = 1;
            obj = ieo.AEQbTJ(jKWHzl, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        C56391yDq.AEQbTJ(obj);
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                iEP iep = this.this$0;
                C23682iFk c23682iFk = this.$params;
                this.label = 3;
                obj = iep.AEQbTJ(c23682iFk, this);
                return obj != objCopydefault ? objCopydefault : obj;
            }
            C56391yDq.AEQbTJ(obj);
        }
        C23673iFb c23673iFb = (C23673iFb) obj;
        if (c23673iFb != null && !this.$updateCache) {
            return c23673iFb;
        }
        iEO ieo2 = this.this$0.EZpvd;
        long jKWHzl2 = this.$params.KWHzl();
        this.label = 2;
        if (ieo2.copydefault(jKWHzl2, this) == objCopydefault) {
            return objCopydefault;
        }
        iEP iep2 = this.this$0;
        C23682iFk c23682iFk2 = this.$params;
        this.label = 3;
        obj = iep2.AEQbTJ(c23682iFk2, this);
        if (obj != objCopydefault) {
        }
    }
}
