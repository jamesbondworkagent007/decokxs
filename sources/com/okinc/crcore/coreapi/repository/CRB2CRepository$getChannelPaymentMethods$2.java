package com.okinc.crcore.coreapi.repository;

import com.okinc.crcore.coreapi.enums.BalanceAccountType;
import com.okinc.crcore.coreapi.net.responsebean.bsc.ChannelResponseBean;
import com.okinc.crcore.coreapi.repository.CRB2CRepository$getChannelPaymentMethods$2;
import com.okinc.crcore.shared.net.responsebean.bsc.ChannelBean;
import com.okinc.network.okg.response.OKServerException;
import com.okinc.network.okg.response.ResponseData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
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
import o.C56403yEb;
import o.C56442yFn;
import o.C56443yFo;
import o.InterfaceC31770mDg;
import o.mAY;
import o.pUU;

/* JADX INFO: loaded from: classes8.dex */
public final class CRB2CRepository$getChannelPaymentMethods$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super AbstractC43419rot<? extends List<? extends ChannelBean>, ? extends OKServerException>>, Object> {
    final /* synthetic */ String $baseAmount;
    final /* synthetic */ String $baseCurrency;
    final /* synthetic */ String $cacheStrategy;
    final /* synthetic */ Integer $categoryCode;
    final /* synthetic */ String $chainIndex;
    final /* synthetic */ String $fundFlowType;
    final /* synthetic */ Boolean $includeFundingBalance;
    final /* synthetic */ Boolean $multipleCurrency;
    final /* synthetic */ String $quoteAmount;
    final /* synthetic */ String $quoteCurrency;
    final /* synthetic */ String $requestCurrency;
    final /* synthetic */ Integer $standard;
    final /* synthetic */ String $tokenAddress;
    final /* synthetic */ String $tradeType;
    final /* synthetic */ Integer $ttl;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C31731mBv this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CRB2CRepository$getChannelPaymentMethods$2(C31731mBv c31731mBv, String str, String str2, Integer num, String str3, String str4, String str5, String str6, String str7, Integer num2, Integer num3, String str8, Boolean bool, String str9, String str10, Boolean bool2, Continuation<? super CRB2CRepository$getChannelPaymentMethods$2> continuation) {
        super(2, continuation);
        this.this$0 = c31731mBv;
        this.$fundFlowType = str;
        this.$cacheStrategy = str2;
        this.$ttl = num;
        this.$baseAmount = str3;
        this.$baseCurrency = str4;
        this.$quoteAmount = str5;
        this.$quoteCurrency = str6;
        this.$tradeType = str7;
        this.$standard = num2;
        this.$categoryCode = num3;
        this.$requestCurrency = str8;
        this.$multipleCurrency = bool;
        this.$chainIndex = str9;
        this.$tokenAddress = str10;
        this.$includeFundingBalance = bool2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        CRB2CRepository$getChannelPaymentMethods$2 cRB2CRepository$getChannelPaymentMethods$2 = new CRB2CRepository$getChannelPaymentMethods$2(this.this$0, this.$fundFlowType, this.$cacheStrategy, this.$ttl, this.$baseAmount, this.$baseCurrency, this.$quoteAmount, this.$quoteCurrency, this.$tradeType, this.$standard, this.$categoryCode, this.$requestCurrency, this.$multipleCurrency, this.$chainIndex, this.$tokenAddress, this.$includeFundingBalance, continuation);
        cRB2CRepository$getChannelPaymentMethods$2.L$0 = obj;
        return cRB2CRepository$getChannelPaymentMethods$2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super AbstractC43419rot<? extends List<? extends ChannelBean>, ? extends OKServerException>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super AbstractC43419rot<? extends List<ChannelBean>, OKServerException>>) continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super AbstractC43419rot<? extends List<ChannelBean>, OKServerException>> continuation) {
        return ((CRB2CRepository$getChannelPaymentMethods$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00b6 A[Catch: all -> 0x00ef, TRY_LEAVE, TryCatch #4 {all -> 0x00ef, blocks: (B:25:0x009b, B:27:0x00a3, B:29:0x00a9, B:30:0x00b6, B:22:0x0092), top: B:55:0x0092 }] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        String str;
        String str2;
        String str3;
        String str4;
        Object objEZpvd;
        AbstractC43419rot actionBar;
        ResponseData responseData;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C31731mBv c31731mBv = this.this$0;
            String value = this.$fundFlowType;
            String str5 = this.$cacheStrategy;
            Integer num = this.$ttl;
            String str6 = this.$baseAmount;
            String str7 = this.$baseCurrency;
            String str8 = this.$quoteAmount;
            String str9 = this.$quoteCurrency;
            String str10 = this.$tradeType;
            Integer num2 = this.$standard;
            Integer num3 = this.$categoryCode;
            String str11 = this.$requestCurrency;
            Boolean bool = this.$multipleCurrency;
            String str12 = this.$chainIndex;
            String str13 = this.$tokenAddress;
            Boolean bool2 = this.$includeFundingBalance;
            try {
                InterfaceC31770mDg interfaceC31770mDg = c31731mBv.copydefault;
                if (value == null) {
                    value = BalanceAccountType.TRADING.getValue();
                }
                if (str5 == null) {
                    str5 = "FIRST_CACHE";
                }
                Integer numAEQbTJ = C56443yFo.AEQbTJ(num != null ? num.intValue() : 300);
                this.label = 1;
                String str14 = value;
                String str15 = str5;
                str3 = AbstractC43419rot.TAG;
                str4 = "Error: ";
                try {
                    objEZpvd = interfaceC31770mDg.EZpvd(str14, str15, numAEQbTJ, str6, str7, str8, str9, str10, num2, num3, str11, bool, str12, str13, bool2, this);
                    if (objEZpvd == objCopydefault) {
                        return objCopydefault;
                    }
                    responseData = (ResponseData) objEZpvd;
                    if (responseData.getCode() != 0) {
                        StringBuilder sb = new StringBuilder();
                        str2 = str4;
                        sb.append(str2);
                        sb.append(responseData);
                        str = str3;
                        pUU.copydefault(str, sb.toString());
                        actionBar = new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
                    }
                } catch (Throwable th) {
                    th = th;
                    str = str3;
                    str2 = str4;
                    pUU.copydefault(str, str2 + th);
                    actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
                    return mAY.OLrzqt(actionBar, new Function1() { // from class: o.mBD
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj2) {
                            return CRB2CRepository$getChannelPaymentMethods$2.invokeSuspend$lambda$2((java.util.List) obj2);
                        }
                    });
                }
            } catch (Throwable th2) {
                th = th2;
                str = AbstractC43419rot.TAG;
                str2 = "Error: ";
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            try {
                C56391yDq.AEQbTJ(obj);
                objEZpvd = obj;
                str3 = AbstractC43419rot.TAG;
                str4 = "Error: ";
                responseData = (ResponseData) objEZpvd;
                if (responseData.getCode() != 0 && responseData.getData() != null) {
                    Object data = responseData.getData();
                    Intrinsics.copydefault(data);
                    actionBar = new AbstractC43419rot.StateListAnimator(data);
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    str2 = str4;
                    try {
                        sb2.append(str2);
                        sb2.append(responseData);
                        str = str3;
                    } catch (Throwable th3) {
                        th = th3;
                        str = str3;
                    }
                    try {
                        pUU.copydefault(str, sb2.toString());
                        actionBar = new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
                    } catch (Throwable th4) {
                        th = th4;
                        pUU.copydefault(str, str2 + th);
                        actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
                    }
                }
            } catch (Throwable th5) {
                th = th5;
                str = AbstractC43419rot.TAG;
                str2 = "Error: ";
                pUU.copydefault(str, str2 + th);
                actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
                return mAY.OLrzqt(actionBar, new Function1() { // from class: o.mBD
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return CRB2CRepository$getChannelPaymentMethods$2.invokeSuspend$lambda$2((java.util.List) obj2);
                    }
                });
            }
        }
        return mAY.OLrzqt(actionBar, new Function1() { // from class: o.mBD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj2) {
                return CRB2CRepository$getChannelPaymentMethods$2.invokeSuspend$lambda$2((java.util.List) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List invokeSuspend$lambda$2(List list) {
        ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(ChannelBean.Companion.copydefault((ChannelResponseBean) it.next()));
        }
        return arrayList;
    }
}
