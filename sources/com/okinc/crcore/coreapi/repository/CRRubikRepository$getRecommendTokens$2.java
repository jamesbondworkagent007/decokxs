package com.okinc.crcore.coreapi.repository;

import com.okinc.crcore.coreapi.repository.CRRubikRepository$getRecommendTokens$2;
import com.okinc.crcore.shared.net.responsebean.CoinBean;
import com.okinc.network.okg.response.OKServerException;
import com.okinc.network.okg.response.ResponseData;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC43419rot;
import o.C31747mCk;
import o.C43401rob;
import o.C43422row;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC31771mDh;
import o.mAY;
import o.pUU;

/* JADX INFO: loaded from: classes8.dex */
public final class CRRubikRepository$getRecommendTokens$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super AbstractC43419rot<? extends List<? extends CoinBean>, ? extends OKServerException>>, Object> {
    final /* synthetic */ String $fiat;
    final /* synthetic */ Integer $num;
    final /* synthetic */ String $zone;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C31747mCk this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CRRubikRepository$getRecommendTokens$2(C31747mCk c31747mCk, String str, Integer num, String str2, Continuation<? super CRRubikRepository$getRecommendTokens$2> continuation) {
        super(2, continuation);
        this.this$0 = c31747mCk;
        this.$zone = str;
        this.$num = num;
        this.$fiat = str2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        CRRubikRepository$getRecommendTokens$2 cRRubikRepository$getRecommendTokens$2 = new CRRubikRepository$getRecommendTokens$2(this.this$0, this.$zone, this.$num, this.$fiat, continuation);
        cRRubikRepository$getRecommendTokens$2.L$0 = obj;
        return cRRubikRepository$getRecommendTokens$2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super AbstractC43419rot<? extends List<? extends CoinBean>, ? extends OKServerException>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super AbstractC43419rot<? extends List<CoinBean>, OKServerException>>) continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super AbstractC43419rot<? extends List<CoinBean>, OKServerException>> continuation) {
        return ((CRRubikRepository$getRecommendTokens$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        AbstractC43419rot.ActionBar actionBar;
        AbstractC43419rot stateListAnimator;
        Object recommendTokens$default;
        ResponseData responseData;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                C31747mCk c31747mCk = this.this$0;
                String str = this.$zone;
                Integer num = this.$num;
                String str2 = this.$fiat;
                InterfaceC31771mDh interfaceC31771mDh = c31747mCk.OLrzqt;
                String string = num != null ? num.toString() : null;
                this.label = 1;
                recommendTokens$default = InterfaceC31771mDh.Application.getRecommendTokens$default(interfaceC31771mDh, str, string, str2, null, 0, 0, this, 56, null);
                if (recommendTokens$default == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                recommendTokens$default = obj;
            }
            responseData = (ResponseData) recommendTokens$default;
        } catch (Throwable th) {
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
            actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
        }
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            Object data = responseData.getData();
            Intrinsics.copydefault(data);
            stateListAnimator = new AbstractC43419rot.StateListAnimator(data);
            return mAY.OLrzqt(stateListAnimator, new Function1() { // from class: o.mCK
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return CRRubikRepository$getRecommendTokens$2.invokeSuspend$lambda$1((java.util.List) obj2);
                }
            });
        }
        pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
        actionBar = new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
        stateListAnimator = actionBar;
        return mAY.OLrzqt(stateListAnimator, new Function1() { // from class: o.mCK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj2) {
                return CRRubikRepository$getRecommendTokens$2.invokeSuspend$lambda$1((java.util.List) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List invokeSuspend$lambda$1(List list) {
        return CoinBean.Companion.KWHzl(list);
    }
}
