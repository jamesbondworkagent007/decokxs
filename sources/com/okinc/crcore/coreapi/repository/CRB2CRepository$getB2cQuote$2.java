package com.okinc.crcore.coreapi.repository;

import com.okinc.crcore.coreapi.enums.BalanceAccountType;
import com.okinc.crcore.coreapi.net.responsebean.bsc.B2CQuoteResponseBean;
import com.okinc.crcore.coreapi.repository.CRB2CRepository$getB2cQuote$2;
import com.okinc.crcore.shared.net.responsebean.bsc.B2CQuoteBean;
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
import o.C31788mDy;
import o.C43401rob;
import o.C43422row;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC31770mDg;
import o.mAY;
import o.pUU;

/* JADX INFO: loaded from: classes8.dex */
public final class CRB2CRepository$getB2cQuote$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super AbstractC43419rot<? extends B2CQuoteBean, ? extends OKServerException>>, Object> {
    final /* synthetic */ String $amount;
    final /* synthetic */ String $baseAmount;
    final /* synthetic */ String $baseCurrency;
    final /* synthetic */ String $depositName;
    final /* synthetic */ String $fundFlowType;
    final /* synthetic */ String $paymentMethod;
    final /* synthetic */ String $quoteAmount;
    final /* synthetic */ String $quoteCurrency;
    final /* synthetic */ int $quoteSide;
    final /* synthetic */ int $standard;
    final /* synthetic */ String $tradeType;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C31731mBv this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CRB2CRepository$getB2cQuote$2(C31731mBv c31731mBv, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, int i2, String str8, String str9, Continuation<? super CRB2CRepository$getB2cQuote$2> continuation) {
        super(2, continuation);
        this.this$0 = c31731mBv;
        this.$fundFlowType = str;
        this.$baseCurrency = str2;
        this.$baseAmount = str3;
        this.$quoteCurrency = str4;
        this.$quoteAmount = str5;
        this.$tradeType = str6;
        this.$paymentMethod = str7;
        this.$standard = i;
        this.$quoteSide = i2;
        this.$amount = str8;
        this.$depositName = str9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        CRB2CRepository$getB2cQuote$2 cRB2CRepository$getB2cQuote$2 = new CRB2CRepository$getB2cQuote$2(this.this$0, this.$fundFlowType, this.$baseCurrency, this.$baseAmount, this.$quoteCurrency, this.$quoteAmount, this.$tradeType, this.$paymentMethod, this.$standard, this.$quoteSide, this.$amount, this.$depositName, continuation);
        cRB2CRepository$getB2cQuote$2.L$0 = obj;
        return cRB2CRepository$getB2cQuote$2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super AbstractC43419rot<? extends B2CQuoteBean, ? extends OKServerException>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super AbstractC43419rot<B2CQuoteBean, OKServerException>>) continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super AbstractC43419rot<B2CQuoteBean, OKServerException>> continuation) {
        return ((CRB2CRepository$getB2cQuote$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        String str;
        AbstractC43419rot.ActionBar actionBar;
        AbstractC43419rot stateListAnimator;
        Object objOLrzqt;
        ResponseData responseData;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                C31731mBv c31731mBv = this.this$0;
                String value = this.$fundFlowType;
                String str2 = this.$baseCurrency;
                String str3 = this.$baseAmount;
                String str4 = this.$quoteCurrency;
                String str5 = this.$quoteAmount;
                String str6 = this.$tradeType;
                String str7 = this.$paymentMethod;
                int i2 = this.$standard;
                int i3 = this.$quoteSide;
                String str8 = this.$amount;
                String str9 = this.$depositName;
                InterfaceC31770mDg interfaceC31770mDg = c31731mBv.copydefault;
                if (value == null) {
                    value = BalanceAccountType.TRADING.getValue();
                }
                C31788mDy c31788mDy = C31788mDy.copydefault;
                String strKWHzl = c31788mDy.KWHzl(str3);
                String strKWHzl2 = c31788mDy.KWHzl(str5);
                String strKWHzl3 = c31788mDy.KWHzl(str8);
                this.label = 1;
                str = "Error: ";
                try {
                    objOLrzqt = interfaceC31770mDg.OLrzqt(value, str2, strKWHzl, str4, strKWHzl2, str6, str7, i2, i3, strKWHzl3, str9, this);
                    if (objOLrzqt == objCopydefault) {
                        return objCopydefault;
                    }
                } catch (Throwable th) {
                    th = th;
                    pUU.copydefault(AbstractC43419rot.TAG, str + th);
                    actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                objOLrzqt = obj;
                str = "Error: ";
            }
            responseData = (ResponseData) objOLrzqt;
        } catch (Throwable th2) {
            th = th2;
            str = "Error: ";
        }
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            Object data = responseData.getData();
            Intrinsics.copydefault(data);
            stateListAnimator = new AbstractC43419rot.StateListAnimator(data);
            return mAY.OLrzqt(stateListAnimator, new Function1() { // from class: o.mBB
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return CRB2CRepository$getB2cQuote$2.invokeSuspend$lambda$1((B2CQuoteResponseBean) obj2);
                }
            });
        }
        pUU.copydefault(AbstractC43419rot.TAG, str + responseData);
        actionBar = new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
        stateListAnimator = actionBar;
        return mAY.OLrzqt(stateListAnimator, new Function1() { // from class: o.mBB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj2) {
                return CRB2CRepository$getB2cQuote$2.invokeSuspend$lambda$1((B2CQuoteResponseBean) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final B2CQuoteBean invokeSuspend$lambda$1(B2CQuoteResponseBean b2CQuoteResponseBean) {
        return B2CQuoteBean.Companion.EZpvd(b2CQuoteResponseBean);
    }
}
