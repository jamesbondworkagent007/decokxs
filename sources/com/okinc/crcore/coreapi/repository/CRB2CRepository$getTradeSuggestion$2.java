package com.okinc.crcore.coreapi.repository;

import com.okinc.crcore.coreapi.net.responsebean.bsc.TradeSuggestionResponseBean;
import com.okinc.crcore.shared.net.responsebean.bsc.TradeSuggestionBean;
import com.okinc.network.okg.response.OKServerException;
import com.okinc.network.okg.response.ResponseData;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
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
import o.C56443yFo;
import o.InterfaceC31770mDg;
import o.pUU;

/* JADX INFO: loaded from: classes8.dex */
public final class CRB2CRepository$getTradeSuggestion$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super AbstractC43419rot<? extends TradeSuggestionBean, ? extends OKServerException>>, Object> {
    final /* synthetic */ String $baseAmount;
    final /* synthetic */ String $baseCurrency;
    final /* synthetic */ String $chainIndex;
    final /* synthetic */ String $fundFlowType;
    final /* synthetic */ boolean $includeFundingBalance;
    final /* synthetic */ boolean $multipleCurrency;
    final /* synthetic */ String $quoteAmount;
    final /* synthetic */ String $quoteCurrency;
    final /* synthetic */ int $standard;
    final /* synthetic */ String $tokenAddress;
    final /* synthetic */ String $tradeType;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C31731mBv this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CRB2CRepository$getTradeSuggestion$2(C31731mBv c31731mBv, String str, String str2, String str3, String str4, String str5, String str6, int i, boolean z, String str7, String str8, boolean z2, Continuation<? super CRB2CRepository$getTradeSuggestion$2> continuation) {
        super(2, continuation);
        this.this$0 = c31731mBv;
        this.$fundFlowType = str;
        this.$tradeType = str2;
        this.$baseCurrency = str3;
        this.$quoteCurrency = str4;
        this.$baseAmount = str5;
        this.$quoteAmount = str6;
        this.$standard = i;
        this.$multipleCurrency = z;
        this.$chainIndex = str7;
        this.$tokenAddress = str8;
        this.$includeFundingBalance = z2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        CRB2CRepository$getTradeSuggestion$2 cRB2CRepository$getTradeSuggestion$2 = new CRB2CRepository$getTradeSuggestion$2(this.this$0, this.$fundFlowType, this.$tradeType, this.$baseCurrency, this.$quoteCurrency, this.$baseAmount, this.$quoteAmount, this.$standard, this.$multipleCurrency, this.$chainIndex, this.$tokenAddress, this.$includeFundingBalance, continuation);
        cRB2CRepository$getTradeSuggestion$2.L$0 = obj;
        return cRB2CRepository$getTradeSuggestion$2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super AbstractC43419rot<? extends TradeSuggestionBean, ? extends OKServerException>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super AbstractC43419rot<TradeSuggestionBean, OKServerException>>) continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super AbstractC43419rot<TradeSuggestionBean, OKServerException>> continuation) {
        return ((CRB2CRepository$getTradeSuggestion$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:30:0x00fa */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:41:0x000d */
    /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: java.lang.String */
    /* JADX DEBUG: Multi-variable search result rejected for r2v2, resolved type: java.lang.String */
    /* JADX DEBUG: Multi-variable search result rejected for r2v6, resolved type: java.lang.String */
    /* JADX DEBUG: Multi-variable search result rejected for r2v8, resolved type: java.lang.String */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        String str;
        String str2;
        String str3;
        Object obj2;
        Object objAEQbTJ;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        Object obj3 = "Error: ";
        String str4 = AbstractC43419rot.TAG;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                C31731mBv c31731mBv = this.this$0;
                String str5 = this.$fundFlowType;
                String str6 = this.$tradeType;
                String str7 = this.$baseCurrency;
                String str8 = this.$quoteCurrency;
                String str9 = this.$baseAmount;
                String str10 = this.$quoteAmount;
                int i2 = this.$standard;
                boolean z = this.$multipleCurrency;
                String str11 = this.$chainIndex;
                String str12 = this.$tokenAddress;
                boolean z2 = this.$includeFundingBalance;
                InterfaceC31770mDg interfaceC31770mDg = c31731mBv.copydefault;
                Integer numAEQbTJ = C56443yFo.AEQbTJ(5);
                C31788mDy c31788mDy = C31788mDy.copydefault;
                String strKWHzl = c31788mDy.KWHzl(str9);
                String strKWHzl2 = c31788mDy.KWHzl(str10);
                Integer numAEQbTJ2 = C56443yFo.AEQbTJ(i2);
                Boolean boolKWHzl = C56443yFo.KWHzl(z2);
                this.label = 1;
                str3 = AbstractC43419rot.TAG;
                str4 = str12;
                obj2 = "Error: ";
                Boolean bool = boolKWHzl;
                try {
                    objAEQbTJ = interfaceC31770mDg.AEQbTJ(str5, "FIRST_CACHE", numAEQbTJ, str6, str7, str8, strKWHzl, strKWHzl2, numAEQbTJ2, z, str11, str4, bool, this);
                    obj3 = bool;
                    if (objAEQbTJ == objCopydefault) {
                        return objCopydefault;
                    }
                } catch (Throwable th) {
                    th = th;
                    str = str3;
                    str2 = obj2;
                    pUU.copydefault(str, str2 + th);
                    return new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                objAEQbTJ = obj;
                str3 = AbstractC43419rot.TAG;
                obj2 = "Error: ";
                obj3 = obj3;
            }
            ResponseData responseData = (ResponseData) objAEQbTJ;
            int code = responseData.getCode();
            String msg = responseData.getMsg();
            String detailMsg = responseData.getDetailMsg();
            String msg2 = responseData.getMsg();
            TradeSuggestionResponseBean tradeSuggestionResponseBean = (TradeSuggestionResponseBean) responseData.getData();
            ResponseData responseData2 = new ResponseData(code, msg, detailMsg, msg2, tradeSuggestionResponseBean != null ? TradeSuggestionBean.Companion.OLrzqt(tradeSuggestionResponseBean) : null, responseData.getMsg());
            if (responseData2.getCode() == 0 && responseData2.getData() != null) {
                Object data = responseData2.getData();
                Intrinsics.copydefault(data);
                return new AbstractC43419rot.StateListAnimator(data);
            }
            StringBuilder sb = new StringBuilder();
            str2 = obj2;
            try {
                sb.append(str2);
                sb.append(responseData2);
                str = str3;
            } catch (Throwable th2) {
                th = th2;
                str = str3;
            }
            try {
                pUU.copydefault(str, sb.toString());
                return new AbstractC43419rot.ActionBar(new OKServerException(responseData2.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData2), C43401rob.EZpvd(responseData2), null, 8, null));
            } catch (Throwable th3) {
                th = th3;
                pUU.copydefault(str, str2 + th);
                return new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
            }
        } catch (Throwable th4) {
            th = th4;
            str = str4;
            str2 = obj3;
        }
    }
}
