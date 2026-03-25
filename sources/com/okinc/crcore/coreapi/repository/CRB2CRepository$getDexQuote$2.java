package com.okinc.crcore.coreapi.repository;

import com.okinc.crcore.coreapi.net.responsebean.DexQuoteResponseBean;
import com.okinc.crcore.coreapi.repository.CRB2CRepository$getDexQuote$2;
import com.okinc.crcore.shared.net.responsebean.DexQuoteBean;
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
public final class CRB2CRepository$getDexQuote$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super AbstractC43419rot<? extends DexQuoteBean, ? extends OKServerException>>, Object> {
    final /* synthetic */ int $chainIndex;
    final /* synthetic */ String $fromAmount;
    final /* synthetic */ String $fromCurrency;
    final /* synthetic */ boolean $isOrderConfirm;
    final /* synthetic */ String $platformCode;
    final /* synthetic */ String $referenceDexQuoteId;
    final /* synthetic */ String $slippageTolerance;
    final /* synthetic */ String $subOrderId;
    final /* synthetic */ String $toCurrency;
    final /* synthetic */ String $tokenAddress;
    final /* synthetic */ Integer $tokenDecimal;
    final /* synthetic */ String $tradeType;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C31731mBv this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CRB2CRepository$getDexQuote$2(C31731mBv c31731mBv, String str, String str2, String str3, String str4, String str5, String str6, Integer num, int i, String str7, boolean z, String str8, String str9, Continuation<? super CRB2CRepository$getDexQuote$2> continuation) {
        super(2, continuation);
        this.this$0 = c31731mBv;
        this.$platformCode = str;
        this.$tradeType = str2;
        this.$toCurrency = str3;
        this.$fromAmount = str4;
        this.$fromCurrency = str5;
        this.$tokenAddress = str6;
        this.$tokenDecimal = num;
        this.$chainIndex = i;
        this.$slippageTolerance = str7;
        this.$isOrderConfirm = z;
        this.$referenceDexQuoteId = str8;
        this.$subOrderId = str9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        CRB2CRepository$getDexQuote$2 cRB2CRepository$getDexQuote$2 = new CRB2CRepository$getDexQuote$2(this.this$0, this.$platformCode, this.$tradeType, this.$toCurrency, this.$fromAmount, this.$fromCurrency, this.$tokenAddress, this.$tokenDecimal, this.$chainIndex, this.$slippageTolerance, this.$isOrderConfirm, this.$referenceDexQuoteId, this.$subOrderId, continuation);
        cRB2CRepository$getDexQuote$2.L$0 = obj;
        return cRB2CRepository$getDexQuote$2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super AbstractC43419rot<? extends DexQuoteBean, ? extends OKServerException>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super AbstractC43419rot<DexQuoteBean, OKServerException>>) continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super AbstractC43419rot<DexQuoteBean, OKServerException>> continuation) {
        return ((CRB2CRepository$getDexQuote$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        String str;
        String str2;
        String str3;
        InterfaceC31770mDg interfaceC31770mDg;
        String strKWHzl;
        Object objAEQbTJ;
        AbstractC43419rot.ActionBar actionBar;
        AbstractC43419rot stateListAnimator;
        ResponseData responseData;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C31731mBv c31731mBv = this.this$0;
            String str4 = this.$platformCode;
            String str5 = this.$tradeType;
            String str6 = this.$toCurrency;
            String str7 = this.$fromAmount;
            String str8 = this.$fromCurrency;
            String str9 = this.$tokenAddress;
            Integer num = this.$tokenDecimal;
            int i2 = this.$chainIndex;
            String str10 = this.$slippageTolerance;
            boolean z = this.$isOrderConfirm;
            String str11 = this.$referenceDexQuoteId;
            str = AbstractC43419rot.TAG;
            String str12 = this.$subOrderId;
            try {
                interfaceC31770mDg = c31731mBv.copydefault;
                strKWHzl = C31788mDy.copydefault.KWHzl(str7);
                this.label = 1;
                str2 = "Error: ";
            } catch (Throwable th) {
                th = th;
                str2 = "Error: ";
            }
            try {
                objAEQbTJ = interfaceC31770mDg.AEQbTJ(str4, str5, str6, strKWHzl, str8, str9, num, i2, str10, z, str11, str12, this);
                if (objAEQbTJ == objCopydefault) {
                    return objCopydefault;
                }
                responseData = (ResponseData) objAEQbTJ;
                if (responseData.getCode() != 0) {
                }
                str3 = str;
                pUU.copydefault(str3, str2 + responseData);
                actionBar = new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
            } catch (Throwable th2) {
                th = th2;
                str3 = str;
                pUU.copydefault(str3, str2 + th);
                actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
                stateListAnimator = actionBar;
                return mAY.OLrzqt(stateListAnimator, new Function1() { // from class: o.mBF
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return CRB2CRepository$getDexQuote$2.invokeSuspend$lambda$1((DexQuoteResponseBean) obj2);
                    }
                });
            }
            stateListAnimator = actionBar;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            try {
                C56391yDq.AEQbTJ(obj);
                objAEQbTJ = obj;
                str = AbstractC43419rot.TAG;
                str2 = "Error: ";
                responseData = (ResponseData) objAEQbTJ;
            } catch (Throwable th3) {
                th = th3;
                str3 = AbstractC43419rot.TAG;
                str2 = "Error: ";
                pUU.copydefault(str3, str2 + th);
                actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
                stateListAnimator = actionBar;
                return mAY.OLrzqt(stateListAnimator, new Function1() { // from class: o.mBF
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return CRB2CRepository$getDexQuote$2.invokeSuspend$lambda$1((DexQuoteResponseBean) obj2);
                    }
                });
            }
            if (responseData.getCode() != 0 && responseData.getData() != null) {
                Object data = responseData.getData();
                Intrinsics.copydefault(data);
                stateListAnimator = new AbstractC43419rot.StateListAnimator(data);
            } else {
                str3 = str;
                try {
                    pUU.copydefault(str3, str2 + responseData);
                    actionBar = new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
                } catch (Throwable th4) {
                    th = th4;
                    pUU.copydefault(str3, str2 + th);
                    actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
                }
                stateListAnimator = actionBar;
            }
        }
        return mAY.OLrzqt(stateListAnimator, new Function1() { // from class: o.mBF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj2) {
                return CRB2CRepository$getDexQuote$2.invokeSuspend$lambda$1((DexQuoteResponseBean) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DexQuoteBean invokeSuspend$lambda$1(DexQuoteResponseBean dexQuoteResponseBean) {
        return DexQuoteBean.Companion.EZpvd(dexQuoteResponseBean);
    }
}
