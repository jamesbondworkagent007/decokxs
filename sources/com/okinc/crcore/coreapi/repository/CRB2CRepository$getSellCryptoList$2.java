package com.okinc.crcore.coreapi.repository;

import com.okinc.crcore.coreapi.net.responsebean.bsc.CurrencyTokenResponseBean;
import com.okinc.crcore.coreapi.repository.CRB2CRepository$getSellCryptoList$2;
import com.okinc.crcore.shared.net.responsebean.bsc.CurrencyTokenBean;
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
public final class CRB2CRepository$getSellCryptoList$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super AbstractC43419rot<? extends List<? extends CurrencyTokenBean>, ? extends OKServerException>>, Object> {
    final /* synthetic */ Boolean $includeFundingBalance;
    final /* synthetic */ String $quoteCurrency;
    final /* synthetic */ String $type;
    final /* synthetic */ boolean $with5SecCache;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C31731mBv this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CRB2CRepository$getSellCryptoList$2(boolean z, C31731mBv c31731mBv, String str, String str2, Boolean bool, Continuation<? super CRB2CRepository$getSellCryptoList$2> continuation) {
        super(2, continuation);
        this.$with5SecCache = z;
        this.this$0 = c31731mBv;
        this.$quoteCurrency = str;
        this.$type = str2;
        this.$includeFundingBalance = bool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        CRB2CRepository$getSellCryptoList$2 cRB2CRepository$getSellCryptoList$2 = new CRB2CRepository$getSellCryptoList$2(this.$with5SecCache, this.this$0, this.$quoteCurrency, this.$type, this.$includeFundingBalance, continuation);
        cRB2CRepository$getSellCryptoList$2.L$0 = obj;
        return cRB2CRepository$getSellCryptoList$2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super AbstractC43419rot<? extends List<? extends CurrencyTokenBean>, ? extends OKServerException>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super AbstractC43419rot<? extends List<CurrencyTokenBean>, OKServerException>>) continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super AbstractC43419rot<? extends List<CurrencyTokenBean>, OKServerException>> continuation) {
        return ((CRB2CRepository$getSellCryptoList$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        AbstractC43419rot.ActionBar actionBar;
        AbstractC43419rot stateListAnimator;
        Object sellCryptoList$default;
        Object sellCryptoList$default2;
        ResponseData responseData;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                boolean z = this.$with5SecCache;
                C31731mBv c31731mBv = this.this$0;
                String str = this.$quoteCurrency;
                String str2 = this.$type;
                Boolean bool = this.$includeFundingBalance;
                if (z) {
                    InterfaceC31770mDg interfaceC31770mDg = c31731mBv.copydefault;
                    Integer numAEQbTJ = C56443yFo.AEQbTJ(5);
                    this.label = 1;
                    sellCryptoList$default2 = InterfaceC31770mDg.ActionBar.getSellCryptoList$default(interfaceC31770mDg, null, "FIRST_CACHE", numAEQbTJ, 0, str, null, str2, bool, this, 41, null);
                    if (sellCryptoList$default2 == objCopydefault) {
                        return objCopydefault;
                    }
                    responseData = (ResponseData) sellCryptoList$default2;
                } else {
                    InterfaceC31770mDg interfaceC31770mDg2 = c31731mBv.copydefault;
                    this.label = 2;
                    sellCryptoList$default = InterfaceC31770mDg.ActionBar.getSellCryptoList$default(interfaceC31770mDg2, null, null, null, 0, str, null, str2, bool, this, 41, null);
                    if (sellCryptoList$default == objCopydefault) {
                        return objCopydefault;
                    }
                    responseData = (ResponseData) sellCryptoList$default;
                }
            } else if (i == 1) {
                C56391yDq.AEQbTJ(obj);
                sellCryptoList$default2 = obj;
                responseData = (ResponseData) sellCryptoList$default2;
            } else {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                sellCryptoList$default = obj;
                responseData = (ResponseData) sellCryptoList$default;
            }
        } catch (Throwable th) {
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
            actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
        }
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            Object data = responseData.getData();
            Intrinsics.copydefault(data);
            stateListAnimator = new AbstractC43419rot.StateListAnimator(data);
            return mAY.OLrzqt(stateListAnimator, new Function1() { // from class: o.mBM
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return CRB2CRepository$getSellCryptoList$2.invokeSuspend$lambda$2((java.util.List) obj2);
                }
            });
        }
        pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
        actionBar = new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
        stateListAnimator = actionBar;
        return mAY.OLrzqt(stateListAnimator, new Function1() { // from class: o.mBM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj2) {
                return CRB2CRepository$getSellCryptoList$2.invokeSuspend$lambda$2((java.util.List) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List invokeSuspend$lambda$2(List list) {
        ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(CurrencyTokenBean.Companion.OLrzqt((CurrencyTokenResponseBean) it.next()));
        }
        return arrayList;
    }
}
