package com.okinc.business.dex.trade.copytrading.edit.ui.viewmodel;

import com.okinc.business.dexlogic.bean.DefiChainInfo;
import java.util.Iterator;
import java.util.List;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Intrinsics;
import o.C56391yDq;
import o.C56442yFn;
import o.yHO;

/* JADX INFO: loaded from: classes5.dex */
public final class CopyTradingEditStrategyViewModel$chainInfo$1 extends SuspendLambda implements yHO<String, Result<? extends List<? extends DefiChainInfo>>, Continuation<? super DefiChainInfo>, Object> {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public CopyTradingEditStrategyViewModel$chainInfo$1(Continuation<? super CopyTradingEditStrategyViewModel$chainInfo$1> continuation) {
        super(3, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
    @Override // o.yHO
    public /* bridge */ /* synthetic */ Object invoke(String str, Result<? extends List<? extends DefiChainInfo>> result, Continuation<? super DefiChainInfo> continuation) {
        return invoke2(str, (Result<? extends List<DefiChainInfo>>) result, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(String str, Result<? extends List<DefiChainInfo>> result, Continuation<? super DefiChainInfo> continuation) {
        CopyTradingEditStrategyViewModel$chainInfo$1 copyTradingEditStrategyViewModel$chainInfo$1 = new CopyTradingEditStrategyViewModel$chainInfo$1(continuation);
        copyTradingEditStrategyViewModel$chainInfo$1.L$0 = str;
        copyTradingEditStrategyViewModel$chainInfo$1.L$1 = result;
        return copyTradingEditStrategyViewModel$chainInfo$1.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            String str = (String) this.L$0;
            Result result = (Result) this.L$1;
            Object obj2 = null;
            if (result == null) {
                return null;
            }
            Object objM7386unboximpl = result.m7386unboximpl();
            if (Result.m7383isFailureimpl(objM7386unboximpl)) {
                objM7386unboximpl = null;
            }
            List list = (List) objM7386unboximpl;
            if (list == null) {
                return null;
            }
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (Intrinsics.EZpvd((Object) ((DefiChainInfo) next).getChainId(), (Object) str)) {
                    obj2 = next;
                    break;
                }
            }
            return (DefiChainInfo) obj2;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
