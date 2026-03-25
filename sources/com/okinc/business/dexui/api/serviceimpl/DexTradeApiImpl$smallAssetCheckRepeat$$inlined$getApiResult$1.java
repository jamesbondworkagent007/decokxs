package com.okinc.business.dexui.api.serviceimpl;

import com.okinc.business.dex.api.bean.sa_small_assets.CheckRepeatParam;
import com.okinc.business.dex.api.bean.sa_small_assets.CheckRepeatResult;
import com.okinc.network.okg.response.ResponseData;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.C23285hvO;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC23234huQ;

/* JADX INFO: loaded from: classes6.dex */
public final class DexTradeApiImpl$smallAssetCheckRepeat$$inlined$getApiResult$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ResponseData<CheckRepeatResult>>, Object> {
    final /* synthetic */ CheckRepeatParam $checkRepeatParam$inlined;
    int label;
    final /* synthetic */ C23285hvO this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DexTradeApiImpl$smallAssetCheckRepeat$$inlined$getApiResult$1(Continuation continuation, C23285hvO c23285hvO, CheckRepeatParam checkRepeatParam) {
        super(2, continuation);
        this.this$0 = c23285hvO;
        this.$checkRepeatParam$inlined = checkRepeatParam;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DexTradeApiImpl$smallAssetCheckRepeat$$inlined$getApiResult$1(continuation, this.this$0, this.$checkRepeatParam$inlined);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ResponseData<CheckRepeatResult>> continuation) {
        return ((DexTradeApiImpl$smallAssetCheckRepeat$$inlined$getApiResult$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC23234huQ interfaceC23234huQ = this.this$0.AEQbTJ;
            if (interfaceC23234huQ == null) {
                Intrinsics.gEmmrt("");
                interfaceC23234huQ = null;
            }
            CheckRepeatParam checkRepeatParam = this.$checkRepeatParam$inlined;
            this.label = 1;
            obj = interfaceC23234huQ.EZpvd(checkRepeatParam, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        return obj;
    }
}
