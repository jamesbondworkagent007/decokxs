package com.okinc.planet.domain.repository;

import com.okinc.network.okg.response.OKServerException;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.planet.biz_content.leaderboard.bean.TopTrader;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC43419rot;
import o.C43401rob;
import o.C43422row;
import o.C56391yDq;
import o.C56442yFn;
import o.pUU;
import o.tQP;
import o.tQQ;

/* JADX INFO: loaded from: classes10.dex */
public final class PlanetRepository$getTopTraders$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super AbstractC43419rot<? extends TopTrader, ? extends OKServerException>>, Object> {
    final /* synthetic */ String $dataVersion;
    final /* synthetic */ String $page;
    final /* synthetic */ String $size;
    final /* synthetic */ String $sortBy;
    final /* synthetic */ String $timeSpan;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ tQQ this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlanetRepository$getTopTraders$2(tQQ tqq, String str, String str2, String str3, String str4, String str5, Continuation<? super PlanetRepository$getTopTraders$2> continuation) {
        super(2, continuation);
        this.this$0 = tqq;
        this.$size = str;
        this.$page = str2;
        this.$sortBy = str3;
        this.$timeSpan = str4;
        this.$dataVersion = str5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        PlanetRepository$getTopTraders$2 planetRepository$getTopTraders$2 = new PlanetRepository$getTopTraders$2(this.this$0, this.$size, this.$page, this.$sortBy, this.$timeSpan, this.$dataVersion, continuation);
        planetRepository$getTopTraders$2.L$0 = obj;
        return planetRepository$getTopTraders$2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super AbstractC43419rot<? extends TopTrader, ? extends OKServerException>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super AbstractC43419rot<TopTrader, OKServerException>>) continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super AbstractC43419rot<TopTrader, OKServerException>> continuation) {
        return ((PlanetRepository$getTopTraders$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                tQQ tqq = this.this$0;
                String str = this.$size;
                String str2 = this.$page;
                String str3 = this.$sortBy;
                String str4 = this.$timeSpan;
                String str5 = this.$dataVersion;
                tQP tqp = tqq.copydefault;
                this.label = 1;
                obj = tqp.copydefault(str, str2, str3, str4, str5, this);
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
                return new AbstractC43419rot.StateListAnimator(data);
            }
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
            return new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
        } catch (Throwable th) {
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
            return new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
        }
    }
}
