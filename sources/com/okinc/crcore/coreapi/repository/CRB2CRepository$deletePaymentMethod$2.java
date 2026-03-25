package com.okinc.crcore.coreapi.repository;

import com.okinc.crcore.coreapi.enums.ChannelCategoryCode;
import com.okinc.crcore.coreapi.net.requestbean.DeletePaymentMethodRequestBean;
import com.okinc.crcore.coreapi.net.responsebean.bsc.DeletePaymentMethodResponseBean;
import com.okinc.crcore.coreapi.repository.CRB2CRepository$deletePaymentMethod$2;
import com.okinc.crcore.shared.net.responsebean.bsc.DeletePaymentMethodBean;
import com.okinc.network.okg.response.OKServerException;
import com.okinc.network.okg.response.ResponseData;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC43419rot;
import o.C31731mBv;
import o.C43401rob;
import o.C43422row;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC31770mDg;
import o.mAY;
import o.pUU;

/* JADX INFO: loaded from: classes8.dex */
public final class CRB2CRepository$deletePaymentMethod$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super AbstractC43419rot<? extends DeletePaymentMethodBean, ? extends OKServerException>>, Object> {
    final /* synthetic */ String $cardNumber;
    final /* synthetic */ ChannelCategoryCode $categoryCode;
    final /* synthetic */ String $depositPlatformCode;
    final /* synthetic */ String $paymentAccountId;
    final /* synthetic */ String $paymentMethod;
    final /* synthetic */ String $userBankId;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C31731mBv this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CRB2CRepository$deletePaymentMethod$2(C31731mBv c31731mBv, ChannelCategoryCode channelCategoryCode, String str, String str2, String str3, String str4, String str5, Continuation<? super CRB2CRepository$deletePaymentMethod$2> continuation) {
        super(2, continuation);
        this.this$0 = c31731mBv;
        this.$categoryCode = channelCategoryCode;
        this.$depositPlatformCode = str;
        this.$paymentMethod = str2;
        this.$paymentAccountId = str3;
        this.$userBankId = str4;
        this.$cardNumber = str5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        CRB2CRepository$deletePaymentMethod$2 cRB2CRepository$deletePaymentMethod$2 = new CRB2CRepository$deletePaymentMethod$2(this.this$0, this.$categoryCode, this.$depositPlatformCode, this.$paymentMethod, this.$paymentAccountId, this.$userBankId, this.$cardNumber, continuation);
        cRB2CRepository$deletePaymentMethod$2.L$0 = obj;
        return cRB2CRepository$deletePaymentMethod$2;
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
        return ((CRB2CRepository$deletePaymentMethod$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        AbstractC43419rot actionBar;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                C31731mBv c31731mBv = this.this$0;
                ChannelCategoryCode channelCategoryCode = this.$categoryCode;
                String str = this.$depositPlatformCode;
                String str2 = this.$paymentMethod;
                String str3 = this.$paymentAccountId;
                String str4 = this.$userBankId;
                String str5 = this.$cardNumber;
                InterfaceC31770mDg interfaceC31770mDg = c31731mBv.copydefault;
                DeletePaymentMethodRequestBean deletePaymentMethodRequestBean = new DeletePaymentMethodRequestBean(channelCategoryCode, str, str2, str3, str4, str5);
                this.label = 1;
                obj = interfaceC31770mDg.AEQbTJ(deletePaymentMethodRequestBean, this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            ResponseData responseData = (ResponseData) obj;
            if (responseData.getCode() == 0 && responseData.getData() != null) {
                Object data = responseData.getData();
                Intrinsics.copydefault(data);
                actionBar = new AbstractC43419rot.StateListAnimator(data);
            } else {
                pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
                actionBar = new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
            }
        } catch (Throwable th) {
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
            actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
        }
        return mAY.OLrzqt(actionBar, new Function1() { // from class: o.mBs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj2) {
                return CRB2CRepository$deletePaymentMethod$2.invokeSuspend$lambda$1((DeletePaymentMethodResponseBean) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeletePaymentMethodBean invokeSuspend$lambda$1(DeletePaymentMethodResponseBean deletePaymentMethodResponseBean) {
        return DeletePaymentMethodBean.Companion.EZpvd(deletePaymentMethodResponseBean);
    }
}
