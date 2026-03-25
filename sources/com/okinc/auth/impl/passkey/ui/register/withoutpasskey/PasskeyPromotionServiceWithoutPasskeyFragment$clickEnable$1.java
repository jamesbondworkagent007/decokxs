package com.okinc.auth.impl.passkey.ui.register.withoutpasskey;

import com.okinc.auth.impl.passkey.ui.register.base.PasskeyPromotionServiceBaseViewModel;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;
import o.C6268aMD;
import o.C6319aNB;

/* JADX INFO: loaded from: classes14.dex */
public final class PasskeyPromotionServiceWithoutPasskeyFragment$clickEnable$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int I$0;
    int label;
    final /* synthetic */ C6319aNB this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PasskeyPromotionServiceWithoutPasskeyFragment$clickEnable$1(C6319aNB c6319aNB, Continuation<? super PasskeyPromotionServiceWithoutPasskeyFragment$clickEnable$1> continuation) {
        super(2, continuation);
        this.this$0 = c6319aNB;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PasskeyPromotionServiceWithoutPasskeyFragment$clickEnable$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((PasskeyPromotionServiceWithoutPasskeyFragment$clickEnable$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i;
        String strKWHzl;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = this.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            PasskeyPromotionServiceBaseViewModel.Request value = this.this$0.AhwBna().djBIcL().getValue();
            int i3 = (value == null || (strKWHzl = value.KWHzl()) == null || strKWHzl.length() <= 0) ? 0 : 1;
            PasskeyPromotionServiceBaseViewModel passkeyPromotionServiceBaseViewModelAhwBna = this.this$0.AhwBna();
            this.I$0 = i3;
            this.label = 1;
            Object objEZpvd = passkeyPromotionServiceBaseViewModelAhwBna.EZpvd(this);
            if (objEZpvd == objCopydefault) {
                return objCopydefault;
            }
            i = i3;
            obj = objEZpvd;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i = this.I$0;
            C56391yDq.AEQbTJ(obj);
        }
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        if (i != 0 && zBooleanValue) {
            this.this$0.DbNXlk();
            Unit unit = Unit.INSTANCE;
        } else {
            this.this$0.AhwBna().OLrzqt((C6268aMD) this.this$0);
        }
        return Unit.INSTANCE;
    }
}
