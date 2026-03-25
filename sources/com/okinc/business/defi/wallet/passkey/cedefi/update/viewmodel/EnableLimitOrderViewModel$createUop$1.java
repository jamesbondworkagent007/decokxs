package com.okinc.business.defi.wallet.passkey.cedefi.update.viewmodel;

import com.okinc.business.defi.wallet.passkey.common.bean.UpdatePasskeyWalletInfoReq;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.serialization.KSerializer;
import o.C17652fNg;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.fMW;

/* JADX INFO: loaded from: classes23.dex */
public final class EnableLimitOrderViewModel$createUop$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $chainIndex;
    int label;
    final /* synthetic */ fMW this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EnableLimitOrderViewModel$createUop$1(fMW fmw, String str, Continuation<? super EnableLimitOrderViewModel$createUop$1> continuation) {
        super(2, continuation);
        this.this$0 = fmw;
        this.$chainIndex = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new EnableLimitOrderViewModel$createUop$1(this.this$0, this.$chainIndex, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((EnableLimitOrderViewModel$createUop$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objEZpvd;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C17652fNg c17652fNg = this.this$0.KWHzl;
            KSerializer<UpdatePasskeyWalletInfoReq> kSerializerSerializer = UpdatePasskeyWalletInfoReq.Companion.serializer();
            UpdatePasskeyWalletInfoReq updatePasskeyWalletInfoReq = new UpdatePasskeyWalletInfoReq(0, this.$chainIndex, C56443yFo.KWHzl(true), 1, (DefaultConstructorMarker) null);
            this.label = 1;
            objEZpvd = c17652fNg.EZpvd("20304", kSerializerSerializer, updatePasskeyWalletInfoReq, this);
            if (objEZpvd == objCopydefault) {
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
            C56391yDq.AEQbTJ(obj);
            objEZpvd = ((Result) obj).m7386unboximpl();
        }
        MutableStateFlow mutableStateFlow = this.this$0.AEQbTJ;
        Result resultM7376boximpl = Result.m7376boximpl(objEZpvd);
        this.label = 2;
        if (mutableStateFlow.emit(resultM7376boximpl, this) == objCopydefault) {
            return objCopydefault;
        }
        return Unit.INSTANCE;
    }
}
