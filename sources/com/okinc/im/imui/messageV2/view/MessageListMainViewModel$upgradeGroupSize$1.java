package com.okinc.im.imui.messageV2.view;

import androidx.lifecycle.MutableLiveData;
import com.okinc.im.imui.messageV2.model.StringResource;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C32989mnw;
import o.C35783oDn;
import o.C36588odm;
import o.C38307pTy;
import o.C55688xof;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.pTB;

/* JADX INFO: loaded from: classes8.dex */
public final class MessageListMainViewModel$upgradeGroupSize$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ int $capacity;
    Object L$0;
    int label;
    final /* synthetic */ MessageListMainViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MessageListMainViewModel$upgradeGroupSize$1(MessageListMainViewModel messageListMainViewModel, int i, Continuation<? super MessageListMainViewModel$upgradeGroupSize$1> continuation) {
        super(2, continuation);
        this.this$0 = messageListMainViewModel;
        this.$capacity = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MessageListMainViewModel$upgradeGroupSize$1(this.this$0, this.$capacity, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MessageListMainViewModel$upgradeGroupSize$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00a9  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objEZpvd;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C35783oDn c35783oDn = this.this$0.OxVOHk;
            String str = (String) this.this$0.AxsJAY.getValue();
            if (str == null) {
                str = "";
            }
            this.label = 1;
            objEZpvd = c35783oDn.EZpvd(str, this);
            if (objEZpvd == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                    return Unit.INSTANCE;
                }
                objEZpvd = this.L$0;
                C56391yDq.AEQbTJ(obj);
                MessageListMainViewModel messageListMainViewModel = this.this$0;
                if (Result.m7380exceptionOrNullimpl(objEZpvd) != null) {
                    MutableLiveData mutableLiveData = messageListMainViewModel.AEQbTJ;
                    C32989mnw c32989mnw = new C32989mnw(new StringResource.Res(C55688xof.Application.ejfBZ));
                    this.L$0 = objEZpvd;
                    this.label = 3;
                    if (C36588odm.KWHzl(mutableLiveData, c32989mnw, this) == objCopydefault) {
                        return objCopydefault;
                    }
                }
                return Unit.INSTANCE;
            }
            C56391yDq.AEQbTJ(obj);
            objEZpvd = ((Result) obj).m7386unboximpl();
        }
        MessageListMainViewModel messageListMainViewModel2 = this.this$0;
        int i2 = this.$capacity;
        if (Result.m7384isSuccessimpl(objEZpvd)) {
            ((Boolean) objEZpvd).booleanValue();
            messageListMainViewModel2.AuCTelauCTel.setValue(new C32989mnw(pTB.formatICUNumber$default(C56443yFo.AEQbTJ(i2), null, C38307pTy.Companion.EZpvd(0), null, null, 13, null)));
            String str2 = (String) messageListMainViewModel2.AxsJAY.getValue();
            String str3 = str2 != null ? str2 : "";
            this.L$0 = objEZpvd;
            this.label = 2;
            if (messageListMainViewModel2.OLrzqt(str3, (Continuation<? super Unit>) this) == objCopydefault) {
                return objCopydefault;
            }
        }
        MessageListMainViewModel messageListMainViewModel3 = this.this$0;
        if (Result.m7380exceptionOrNullimpl(objEZpvd) != null) {
        }
        return Unit.INSTANCE;
    }
}
