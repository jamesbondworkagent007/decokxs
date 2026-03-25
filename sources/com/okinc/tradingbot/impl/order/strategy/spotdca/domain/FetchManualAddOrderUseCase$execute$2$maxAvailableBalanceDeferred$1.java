package com.okinc.tradingbot.impl.order.strategy.spotdca.domain;

import com.okinc.network.okg.response.OKServerException;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.unify_trade.biz.MaxAvailableResp;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC43419rot;
import o.C43401rob;
import o.C43422row;
import o.C53201wgy;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC50055vAf;
import o.pUU;

/* JADX INFO: loaded from: classes11.dex */
public final class FetchManualAddOrderUseCase$execute$2$maxAvailableBalanceDeferred$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super MaxAvailableResp>, Object> {
    final /* synthetic */ C53201wgy.Activity $input;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C53201wgy this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FetchManualAddOrderUseCase$execute$2$maxAvailableBalanceDeferred$1(C53201wgy c53201wgy, C53201wgy.Activity activity, Continuation<? super FetchManualAddOrderUseCase$execute$2$maxAvailableBalanceDeferred$1> continuation) {
        super(2, continuation);
        this.this$0 = c53201wgy;
        this.$input = activity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        FetchManualAddOrderUseCase$execute$2$maxAvailableBalanceDeferred$1 fetchManualAddOrderUseCase$execute$2$maxAvailableBalanceDeferred$1 = new FetchManualAddOrderUseCase$execute$2$maxAvailableBalanceDeferred$1(this.this$0, this.$input, continuation);
        fetchManualAddOrderUseCase$execute$2$maxAvailableBalanceDeferred$1.L$0 = obj;
        return fetchManualAddOrderUseCase$execute$2$maxAvailableBalanceDeferred$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super MaxAvailableResp> continuation) {
        return ((FetchManualAddOrderUseCase$execute$2$maxAvailableBalanceDeferred$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00f6 A[ORIG_RETURN, RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        String str;
        String str2;
        AbstractC43419rot.ActionBar actionBar;
        AbstractC43419rot stateListAnimator;
        List list;
        String str3;
        String str4;
        Object maxAvailable$default;
        ResponseData responseData;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        String str5 = "Error: ";
        String str6 = AbstractC43419rot.TAG;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                C53201wgy c53201wgy = this.this$0;
                C53201wgy.Activity activity = this.$input;
                InterfaceC50055vAf interfaceC50055vAf = c53201wgy.KWHzl;
                String strCopydefault = activity.copydefault();
                String strAEQbTJ = activity.AEQbTJ();
                this.label = 1;
                str3 = AbstractC43419rot.TAG;
                str6 = "buy";
                str4 = "Error: ";
                str5 = null;
                try {
                    maxAvailable$default = InterfaceC50055vAf.ActionBar.getMaxAvailable$default(interfaceC50055vAf, null, null, strCopydefault, null, null, "cash", null, str6, null, "1", null, null, null, null, null, null, null, null, null, strAEQbTJ, this, 523611, null);
                    if (maxAvailable$default == objCopydefault) {
                        return objCopydefault;
                    }
                } catch (Throwable th) {
                    th = th;
                    str = str3;
                    str2 = str4;
                    pUU.copydefault(str, str2 + th);
                    actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
                    stateListAnimator = actionBar;
                    list = (List) stateListAnimator.copydefault();
                    if (list != null) {
                    }
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                maxAvailable$default = obj;
                str3 = AbstractC43419rot.TAG;
                str4 = "Error: ";
            }
            responseData = (ResponseData) maxAvailable$default;
        } catch (Throwable th2) {
            th = th2;
            str = str6;
            str2 = str5;
        }
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            Object data = responseData.getData();
            Intrinsics.copydefault(data);
            stateListAnimator = new AbstractC43419rot.StateListAnimator(data);
            list = (List) stateListAnimator.copydefault();
            if (list != null) {
            }
        } else {
            StringBuilder sb = new StringBuilder();
            str2 = str4;
            try {
                sb.append(str2);
                sb.append(responseData);
                str = str3;
            } catch (Throwable th3) {
                th = th3;
                str = str3;
            }
            try {
                pUU.copydefault(str, sb.toString());
                actionBar = new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
            } catch (Throwable th4) {
                th = th4;
                pUU.copydefault(str, str2 + th);
                actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
            }
            stateListAnimator = actionBar;
            list = (List) stateListAnimator.copydefault();
            if (list != null) {
                return (MaxAvailableResp) CollectionsKt___CollectionsKt.firstOrNull(list);
            }
            return null;
        }
    }
}
