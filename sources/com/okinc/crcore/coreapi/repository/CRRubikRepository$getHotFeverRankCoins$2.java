package com.okinc.crcore.coreapi.repository;

import com.okinc.crcore.coreapi.repository.CRRubikRepository$getHotFeverRankCoins$2;
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
public final class CRRubikRepository$getHotFeverRankCoins$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super AbstractC43419rot<? extends List<? extends CoinBean>, ? extends OKServerException>>, Object> {
    final /* synthetic */ String $category;
    final /* synthetic */ String $fiat;
    final /* synthetic */ Integer $num;
    final /* synthetic */ Integer $rank;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C31747mCk this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CRRubikRepository$getHotFeverRankCoins$2(C31747mCk c31747mCk, Integer num, Integer num2, String str, String str2, Continuation<? super CRRubikRepository$getHotFeverRankCoins$2> continuation) {
        super(2, continuation);
        this.this$0 = c31747mCk;
        this.$num = num;
        this.$rank = num2;
        this.$category = str;
        this.$fiat = str2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        CRRubikRepository$getHotFeverRankCoins$2 cRRubikRepository$getHotFeverRankCoins$2 = new CRRubikRepository$getHotFeverRankCoins$2(this.this$0, this.$num, this.$rank, this.$category, this.$fiat, continuation);
        cRRubikRepository$getHotFeverRankCoins$2.L$0 = obj;
        return cRRubikRepository$getHotFeverRankCoins$2;
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
        return ((CRRubikRepository$getHotFeverRankCoins$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        AbstractC43419rot actionBar;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                C31747mCk c31747mCk = this.this$0;
                Integer num = this.$num;
                Integer num2 = this.$rank;
                String str = this.$category;
                String str2 = this.$fiat;
                InterfaceC31771mDh interfaceC31771mDh = c31747mCk.OLrzqt;
                this.label = 1;
                obj = interfaceC31771mDh.AEQbTJ(num, num2, str, str2, this);
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
        return mAY.OLrzqt(actionBar, new Function1() { // from class: o.mCH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj2) {
                return CRRubikRepository$getHotFeverRankCoins$2.invokeSuspend$lambda$1((java.util.List) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List invokeSuspend$lambda$1(List list) {
        return CoinBean.Companion.KWHzl(list);
    }
}
