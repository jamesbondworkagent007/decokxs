package com.okinc.business.dex.trade.copytrading.edit.ui.viewmodel;

import com.okinc.business.dex.trade.copytrading.edit.data.model.CopyTradingDefaultConfig;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.text.StringsKt__StringsKt;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC19871gSk;
import o.yHO;

/* JADX INFO: loaded from: classes5.dex */
public final class CopyTradingEditStrategyViewModel$defaultConfig$1 extends SuspendLambda implements yHO<String, Integer, Continuation<? super Result<? extends CopyTradingDefaultConfig>>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ CopyTradingEditStrategyViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CopyTradingEditStrategyViewModel$defaultConfig$1(CopyTradingEditStrategyViewModel copyTradingEditStrategyViewModel, Continuation<? super CopyTradingEditStrategyViewModel$defaultConfig$1> continuation) {
        super(3, continuation);
        this.this$0 = copyTradingEditStrategyViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
    @Override // o.yHO
    public /* synthetic */ Object invoke(String str, Integer num, Continuation<? super Result<? extends CopyTradingDefaultConfig>> continuation) {
        return invoke(str, num.intValue(), (Continuation<? super Result<CopyTradingDefaultConfig>>) continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Object invoke(String str, int i, Continuation<? super Result<CopyTradingDefaultConfig>> continuation) {
        CopyTradingEditStrategyViewModel$defaultConfig$1 copyTradingEditStrategyViewModel$defaultConfig$1 = new CopyTradingEditStrategyViewModel$defaultConfig$1(this.this$0, continuation);
        copyTradingEditStrategyViewModel$defaultConfig$1.L$0 = str;
        return copyTradingEditStrategyViewModel$defaultConfig$1.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objKWHzl;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            String str = (String) this.L$0;
            if (StringsKt__StringsKt.fARcdN((CharSequence) str)) {
                return null;
            }
            InterfaceC19871gSk interfaceC19871gSk = this.this$0.AubY;
            String strOLrzqt = this.this$0.zLjUOn.OLrzqt(str);
            this.label = 1;
            objKWHzl = interfaceC19871gSk.KWHzl(str, strOLrzqt, this);
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
        return Result.m7376boximpl(objKWHzl);
    }
}
