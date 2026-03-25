package com.okinc.business.market.features.vibes.repo;

import com.okinc.business.market.data.model.VibesChartData;
import com.okinc.network.okg.response.ResponseData;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import o.C56390yDp;
import o.C56391yDq;
import o.C56424yEw;
import o.C56442yFn;
import o.InterfaceC23231huN;
import o.kAX;

/* JADX INFO: loaded from: classes7.dex */
public final class VibesChartRepositoryImpl$getChartInfo$2 extends SuspendLambda implements Function1<Continuation<? super ResponseData<VibesChartData>>, Object> {
    final /* synthetic */ String $chainId;
    final /* synthetic */ String $timeFrame;
    final /* synthetic */ String $tokenAddress;
    int label;
    final /* synthetic */ kAX this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VibesChartRepositoryImpl$getChartInfo$2(kAX kax, String str, String str2, String str3, Continuation<? super VibesChartRepositoryImpl$getChartInfo$2> continuation) {
        super(1, continuation);
        this.this$0 = kax;
        this.$chainId = str;
        this.$tokenAddress = str2;
        this.$timeFrame = str3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new VibesChartRepositoryImpl$getChartInfo$2(this.this$0, this.$chainId, this.$tokenAddress, this.$timeFrame, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super ResponseData<VibesChartData>> continuation) {
        return ((VibesChartRepositoryImpl$getChartInfo$2) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC23231huN interfaceC23231huN = this.this$0.OLrzqt;
            HashMap<String, String> mapAYXKKw = C56424yEw.AYXKKw(C56390yDp.OLrzqt("chainIndex", this.$chainId), C56390yDp.OLrzqt("tokenContractAddress", this.$tokenAddress), C56390yDp.OLrzqt("timeRangeType", this.$timeFrame));
            this.label = 1;
            obj = interfaceC23231huN.copydefault(mapAYXKKw, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        return obj;
    }
}
