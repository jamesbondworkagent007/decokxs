package com.okinc.business.market.features.alert.list.ui;

import com.okinc.business.market.data.model.alert.AlertListRequest;
import java.util.List;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.C25802jGx;
import o.C25813jHh;
import o.C25829jHx;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC25830jHy;
import o.xVW;

/* JADX INFO: loaded from: classes18.dex */
public final class Web3AlertListViewModel$fetchAlertList$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $currentChainId;
    final /* synthetic */ String $currentTokenAddress;
    int label;
    final /* synthetic */ C25829jHx this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Web3AlertListViewModel$fetchAlertList$2(C25829jHx c25829jHx, String str, String str2, Continuation<? super Web3AlertListViewModel$fetchAlertList$2> continuation) {
        super(2, continuation);
        this.this$0 = c25829jHx;
        this.$currentTokenAddress = str;
        this.$currentChainId = str2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new Web3AlertListViewModel$fetchAlertList$2(this.this$0, this.$currentTokenAddress, this.$currentChainId, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((Web3AlertListViewModel$fetchAlertList$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objKWHzl;
        Object value;
        Object value2;
        Object value3;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C25802jGx c25802jGx = this.this$0.EZpvd;
            String strCopydefault = xVW.copydefault();
            Intrinsics.checkNotNullExpressionValue(strCopydefault, "");
            AlertListRequest alertListRequest = new AlertListRequest(strCopydefault, (String) null, (String) null, 6, (DefaultConstructorMarker) null);
            this.label = 1;
            objKWHzl = c25802jGx.KWHzl(alertListRequest, this);
            if (objKWHzl == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            objKWHzl = ((Result) obj).m7386unboximpl();
        }
        C25829jHx c25829jHx = this.this$0;
        String str = this.$currentTokenAddress;
        String str2 = this.$currentChainId;
        if (Result.m7384isSuccessimpl(objKWHzl)) {
            List list = (List) objKWHzl;
            if (list.isEmpty()) {
                MutableStateFlow mutableStateFlow = c25829jHx.KWHzl;
                do {
                    value3 = mutableStateFlow.getValue();
                } while (!mutableStateFlow.compareAndSet(value3, new InterfaceC25830jHy.Application(false, true, 1, null)));
            } else {
                MutableStateFlow mutableStateFlow2 = c25829jHx.KWHzl;
                do {
                    value2 = mutableStateFlow2.getValue();
                } while (!mutableStateFlow2.compareAndSet(value2, new InterfaceC25830jHy.ActionBar.AssistContent(C25813jHh.KWHzl(list, str, str2, true), false)));
            }
        }
        C25829jHx c25829jHx2 = this.this$0;
        if (Result.m7380exceptionOrNullimpl(objKWHzl) != null) {
            MutableStateFlow mutableStateFlow3 = c25829jHx2.KWHzl;
            do {
                value = mutableStateFlow3.getValue();
            } while (!mutableStateFlow3.compareAndSet(value, InterfaceC25830jHy.TaskDescription.KWHzl));
        }
        return Unit.INSTANCE;
    }
}
