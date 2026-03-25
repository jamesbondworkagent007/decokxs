package com.okinc.business.defi.wallet.home.more;

import com.okinc.business.defi.biz.net.bean.MoreFunctionModuleInfo;
import com.okinc.core.util.SPUtils;
import com.okinc.network.okg.response.OKServerException;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import o.AbstractC43419rot;
import o.C18056fbG;
import o.C18060fbK;
import o.C33489mxS;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes5.dex */
public final class MoreFunctionViewModel$fetchMoreFunctionList$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ C18060fbK this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MoreFunctionViewModel$fetchMoreFunctionList$1(C18060fbK c18060fbK, Continuation<? super MoreFunctionViewModel$fetchMoreFunctionList$1> continuation) {
        super(2, continuation);
        this.this$0 = c18060fbK;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MoreFunctionViewModel$fetchMoreFunctionList$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MoreFunctionViewModel$fetchMoreFunctionList$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C18056fbG c18056fbG = this.this$0.KWHzl;
            this.label = 1;
            obj = c18056fbG.copydefault(this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        AbstractC43419rot abstractC43419rot = (AbstractC43419rot) obj;
        C18060fbK c18060fbK = this.this$0;
        if (abstractC43419rot instanceof AbstractC43419rot.StateListAnimator) {
            List list = (List) ((AbstractC43419rot.StateListAnimator) abstractC43419rot).KWHzl();
            c18060fbK.EZpvd.postValue(list);
            SPUtils.put("WalletMoreModuleInfo", C33489mxS.KWHzl.KWHzl(BuiltinSerializersKt.ListSerializer(MoreFunctionModuleInfo.Companion.serializer()), list));
        }
        if (abstractC43419rot instanceof AbstractC43419rot.ActionBar) {
            ((OKServerException) ((AbstractC43419rot.ActionBar) abstractC43419rot).KWHzl()).printStackTrace();
        }
        return Unit.INSTANCE;
    }
}
