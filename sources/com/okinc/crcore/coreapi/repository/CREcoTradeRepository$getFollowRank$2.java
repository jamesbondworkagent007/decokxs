package com.okinc.crcore.coreapi.repository;

import com.okinc.crcore.coreapi.repository.CREcoTradeRepository$getFollowRank$2;
import com.okinc.crcore.shared.net.responsebean.FollowRankListBean;
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
import o.C31741mCe;
import o.C43401rob;
import o.C43422row;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC31772mDi;
import o.mAY;
import o.pUU;

/* JADX INFO: loaded from: classes23.dex */
public final class CREcoTradeRepository$getFollowRank$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super AbstractC43419rot<? extends List<? extends FollowRankListBean>, ? extends OKServerException>>, Object> {
    final /* synthetic */ int $instNumLimit;
    final /* synthetic */ int $latestNum;
    final /* synthetic */ int $size;
    final /* synthetic */ int $start;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C31741mCe this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CREcoTradeRepository$getFollowRank$2(C31741mCe c31741mCe, int i, int i2, int i3, int i4, Continuation<? super CREcoTradeRepository$getFollowRank$2> continuation) {
        super(2, continuation);
        this.this$0 = c31741mCe;
        this.$latestNum = i;
        this.$size = i2;
        this.$start = i3;
        this.$instNumLimit = i4;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        CREcoTradeRepository$getFollowRank$2 cREcoTradeRepository$getFollowRank$2 = new CREcoTradeRepository$getFollowRank$2(this.this$0, this.$latestNum, this.$size, this.$start, this.$instNumLimit, continuation);
        cREcoTradeRepository$getFollowRank$2.L$0 = obj;
        return cREcoTradeRepository$getFollowRank$2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super AbstractC43419rot<? extends List<? extends FollowRankListBean>, ? extends OKServerException>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super AbstractC43419rot<? extends List<FollowRankListBean>, OKServerException>>) continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super AbstractC43419rot<? extends List<FollowRankListBean>, OKServerException>> continuation) {
        return ((CREcoTradeRepository$getFollowRank$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        AbstractC43419rot actionBar;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                C31741mCe c31741mCe = this.this$0;
                int i2 = this.$latestNum;
                int i3 = this.$size;
                int i4 = this.$start;
                int i5 = this.$instNumLimit;
                InterfaceC31772mDi interfaceC31772mDi = c31741mCe.AEQbTJ;
                this.label = 1;
                obj = interfaceC31772mDi.AEQbTJ(i2, i3, i4, i5, this);
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
        return mAY.OLrzqt(actionBar, new Function1() { // from class: o.mCc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj2) {
                return CREcoTradeRepository$getFollowRank$2.invokeSuspend$lambda$1((java.util.List) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List invokeSuspend$lambda$1(List list) {
        return FollowRankListBean.Companion.OLrzqt(list);
    }
}
