package com.okinc.business.dexlogic.main.swap.operation_handler;

import com.okinc.business.dexlogic.bean.ApproveUnsignedData;
import com.okinc.network.okg.response.OKServerException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.channels.ProducerScope;
import o.C22692hkE;
import o.C56391yDq;
import o.C56442yFn;
import o.kUF;

/* JADX INFO: loaded from: classes6.dex */
public final class OperationHandlerImpl$getApproveUnsignedData$1 extends SuspendLambda implements Function2<ProducerScope<? super ApproveUnsignedData>, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $cancelApproveTag;
    final /* synthetic */ String $chainId;
    final /* synthetic */ String $deFiPlatformId;
    final /* synthetic */ String $tokenContractAddress;
    final /* synthetic */ String $userWalletAddress;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C22692hkE this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OperationHandlerImpl$getApproveUnsignedData$1(C22692hkE c22692hkE, String str, String str2, String str3, String str4, String str5, Continuation<? super OperationHandlerImpl$getApproveUnsignedData$1> continuation) {
        super(2, continuation);
        this.this$0 = c22692hkE;
        this.$userWalletAddress = str;
        this.$tokenContractAddress = str2;
        this.$chainId = str3;
        this.$cancelApproveTag = str4;
        this.$deFiPlatformId = str5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        OperationHandlerImpl$getApproveUnsignedData$1 operationHandlerImpl$getApproveUnsignedData$1 = new OperationHandlerImpl$getApproveUnsignedData$1(this.this$0, this.$userWalletAddress, this.$tokenContractAddress, this.$chainId, this.$cancelApproveTag, this.$deFiPlatformId, continuation);
        operationHandlerImpl$getApproveUnsignedData$1.L$0 = obj;
        return operationHandlerImpl$getApproveUnsignedData$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ProducerScope<? super ApproveUnsignedData> producerScope, Continuation<? super Unit> continuation) {
        return ((OperationHandlerImpl$getApproveUnsignedData$1) create(producerScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        ProducerScope producerScope;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            producerScope = (ProducerScope) this.L$0;
            kUF kuf = new kUF(this.this$0.KWHzl);
            String str = this.$userWalletAddress;
            String str2 = this.$tokenContractAddress;
            String str3 = this.$chainId;
            String str4 = this.$cancelApproveTag;
            String str5 = this.$deFiPlatformId;
            this.L$0 = producerScope;
            this.label = 1;
            obj = kuf.OLrzqt(str, str2, str3, str4, str5, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                return Unit.INSTANCE;
            }
            producerScope = (ProducerScope) this.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        ApproveUnsignedData approveUnsignedData = (ApproveUnsignedData) obj;
        if (approveUnsignedData == null) {
            throw new OKServerException(0, null, null, null, 15, null);
        }
        this.L$0 = null;
        this.label = 2;
        if (producerScope.send(approveUnsignedData, this) == objCopydefault) {
            return objCopydefault;
        }
        return Unit.INSTANCE;
    }
}
