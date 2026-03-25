package com.okinc.business.defi.wallet.passkey.cedefi.escape.ui.viewmodel;

import com.okinc.business.defi.api.bean.passkeywallet.cedefi.AccountPreCheckResult;
import com.okinc.business.defi.api.bean.passkeywallet.cedefi.AccountSceneType;
import com.okinc.business.defi.api.bean.passkeywallet.cedefi.AccountType;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;
import o.fJQ;

/* JADX INFO: loaded from: classes18.dex */
public final class EscapePassKeyAddressCheckViewModel$checkAddress$1$preCheckDeferred$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends AccountPreCheckResult>>, Object> {
    int label;
    final /* synthetic */ EscapePassKeyAddressCheckViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EscapePassKeyAddressCheckViewModel$checkAddress$1$preCheckDeferred$1(EscapePassKeyAddressCheckViewModel escapePassKeyAddressCheckViewModel, Continuation<? super EscapePassKeyAddressCheckViewModel$checkAddress$1$preCheckDeferred$1> continuation) {
        super(2, continuation);
        this.this$0 = escapePassKeyAddressCheckViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new EscapePassKeyAddressCheckViewModel$checkAddress$1$preCheckDeferred$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends AccountPreCheckResult>> continuation) {
        return ((EscapePassKeyAddressCheckViewModel$checkAddress$1$preCheckDeferred$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objKWHzl;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            fJQ fjq = this.this$0.EZpvd;
            int value = AccountType.CeDeFi.getValue();
            int value2 = AccountSceneType.SCENE_ESCAPE.getValue();
            this.label = 1;
            objKWHzl = fjq.KWHzl(value, value2, this);
            if (objKWHzl == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            objKWHzl = ((Result) obj).m7386unboximpl();
        }
        return Result.m7376boximpl(objKWHzl);
    }
}
