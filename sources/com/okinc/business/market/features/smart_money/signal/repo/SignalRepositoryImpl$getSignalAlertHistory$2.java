package com.okinc.business.market.features.smart_money.signal.repo;

import com.okinc.business.market.data.model.smart_money.SignalAlertHistoryData;
import com.okinc.business.market.features.smart_money.signal.repo.SignalRepositoryImpl$getSignalAlertHistory$2;
import com.okinc.network.okg.response.ResponseData;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import o.C29467kuG;
import o.C33129mqd;
import o.C56390yDp;
import o.C56391yDq;
import o.C56424yEw;
import o.C56442yFn;
import o.InterfaceC27595jyE;

/* JADX INFO: loaded from: classes7.dex */
public final class SignalRepositoryImpl$getSignalAlertHistory$2 extends SuspendLambda implements Function1<Continuation<? super ResponseData<SignalAlertHistoryData>>, Object> {
    final /* synthetic */ String $chainId;
    final /* synthetic */ List<Integer> $signalLabels;
    final /* synthetic */ String $tokenContractAddress;
    int label;
    final /* synthetic */ C29467kuG this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SignalRepositoryImpl$getSignalAlertHistory$2(String str, String str2, List<Integer> list, C29467kuG c29467kuG, Continuation<? super SignalRepositoryImpl$getSignalAlertHistory$2> continuation) {
        super(1, continuation);
        this.$chainId = str;
        this.$tokenContractAddress = str2;
        this.$signalLabels = list;
        this.this$0 = c29467kuG;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new SignalRepositoryImpl$getSignalAlertHistory$2(this.$chainId, this.$tokenContractAddress, this.$signalLabels, this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super ResponseData<SignalAlertHistoryData>> continuation) {
        return ((SignalRepositoryImpl$getSignalAlertHistory$2) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            Map<String, String> mapGEmmrt = C56424yEw.gEmmrt(C56390yDp.OLrzqt("chainId", this.$chainId), C56390yDp.OLrzqt("tokenContractAddress", this.$tokenContractAddress), C56390yDp.OLrzqt("signalLabels", CollectionsKt___CollectionsKt.joinToString$default(this.$signalLabels, ",", null, null, 0, null, new Function1() { // from class: o.kuE
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return SignalRepositoryImpl$getSignalAlertHistory$2.invokeSuspend$lambda$0(((java.lang.Integer) obj2).intValue());
                }
            }, 30, null)));
            InterfaceC27595jyE interfaceC27595jyE = this.this$0.OLrzqt;
            this.label = 1;
            obj = interfaceC27595jyE.EZpvd(mapGEmmrt, this);
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence invokeSuspend$lambda$0(int i) {
        return C33129mqd.gEmmrt(Integer.valueOf(i));
    }
}
