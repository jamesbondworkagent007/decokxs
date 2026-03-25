package com.okinc.buysell.domain;

import com.okinc.crcore.coreapi.enums.ChannelCategoryCode;
import com.okinc.crcore.shared.net.responsebean.bsc.DeletePaymentMethodBean;
import com.okinc.network.okg.response.OKServerException;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC43419rot;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC31764mDa;
import o.InterfaceC56445yFq;
import o.lyI;

/* JADX INFO: loaded from: classes7.dex */
public final class DeletePaymentMethodUseCase$deletePaymentMethod$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super AbstractC43419rot<? extends DeletePaymentMethodBean, ? extends OKServerException>>, Object> {
    final /* synthetic */ String $cardNumber;
    final /* synthetic */ Integer $categoryCode;
    final /* synthetic */ String $depositPlatformCode;
    final /* synthetic */ String $paymentAccountId;
    final /* synthetic */ String $paymentMethod;
    final /* synthetic */ String $userBankId;
    int label;
    final /* synthetic */ lyI this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeletePaymentMethodUseCase$deletePaymentMethod$2(lyI lyi, String str, String str2, String str3, String str4, String str5, Integer num, Continuation<? super DeletePaymentMethodUseCase$deletePaymentMethod$2> continuation) {
        super(2, continuation);
        this.this$0 = lyi;
        this.$depositPlatformCode = str;
        this.$paymentMethod = str2;
        this.$paymentAccountId = str3;
        this.$userBankId = str4;
        this.$cardNumber = str5;
        this.$categoryCode = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DeletePaymentMethodUseCase$deletePaymentMethod$2(this.this$0, this.$depositPlatformCode, this.$paymentMethod, this.$paymentAccountId, this.$userBankId, this.$cardNumber, this.$categoryCode, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super AbstractC43419rot<? extends DeletePaymentMethodBean, ? extends OKServerException>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super AbstractC43419rot<DeletePaymentMethodBean, OKServerException>>) continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super AbstractC43419rot<DeletePaymentMethodBean, OKServerException>> continuation) {
        return ((DeletePaymentMethodUseCase$deletePaymentMethod$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        ChannelCategoryCode next;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC56445yFq<ChannelCategoryCode> entries = ChannelCategoryCode.getEntries();
            Integer num = this.$categoryCode;
            Iterator<ChannelCategoryCode> it = entries.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                int code = next.getCode();
                if (num != null && code == num.intValue()) {
                    break;
                }
            }
            InterfaceC31764mDa interfaceC31764mDa = this.this$0.copydefault;
            String str = this.$depositPlatformCode;
            String str2 = this.$paymentMethod;
            String str3 = this.$paymentAccountId;
            String str4 = this.$userBankId;
            String str5 = this.$cardNumber;
            this.label = 1;
            obj = interfaceC31764mDa.copydefault(next, str, str2, str3, str4, str5, this);
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
