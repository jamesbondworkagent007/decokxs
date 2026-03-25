package com.okinc.kline.ui;

import com.okinc.kline.api.bean.MarketCoinInfo;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC54531xLw;
import o.C54589xNz;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC54577xNn;
import o.InterfaceC54581xNr;
import o.ViewOnClickListenerC38857phO;
import o.pUU;

/* JADX INFO: loaded from: classes8.dex */
public final class MarketKlinePortraitFragment$klineEnsureInitialize$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ViewOnClickListenerC38857phO this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarketKlinePortraitFragment$klineEnsureInitialize$1(ViewOnClickListenerC38857phO viewOnClickListenerC38857phO, Continuation<? super MarketKlinePortraitFragment$klineEnsureInitialize$1> continuation) {
        super(2, continuation);
        this.this$0 = viewOnClickListenerC38857phO;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        MarketKlinePortraitFragment$klineEnsureInitialize$1 marketKlinePortraitFragment$klineEnsureInitialize$1 = new MarketKlinePortraitFragment$klineEnsureInitialize$1(this.this$0, continuation);
        marketKlinePortraitFragment$klineEnsureInitialize$1.L$0 = obj;
        return marketKlinePortraitFragment$klineEnsureInitialize$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MarketKlinePortraitFragment$klineEnsureInitialize$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x007f A[Catch: all -> 0x0098, TryCatch #0 {all -> 0x0098, blocks: (B:7:0x0013, B:32:0x007b, B:34:0x007f, B:36:0x0093, B:12:0x0023, B:19:0x0054, B:21:0x005a, B:23:0x0060, B:26:0x0067, B:28:0x006b, B:35:0x0085, B:15:0x0036), top: B:45:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ab  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        Throwable thM7380exceptionOrNullimpl;
        ViewOnClickListenerC38857phO viewOnClickListenerC38857phO;
        Object objM7386unboximpl;
        ViewOnClickListenerC38857phO viewOnClickListenerC38857phO2;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        Unit unit = null;
        try {
        } catch (Throwable th) {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            ViewOnClickListenerC38857phO viewOnClickListenerC38857phO3 = this.this$0;
            Result.Application application2 = Result.Companion;
            pUU.copydefault("Kline", "klineEnsureInitialize: 开始初始化：协程启动");
            C54589xNz c54589xNz = C54589xNz.EZpvd;
            this.L$0 = viewOnClickListenerC38857phO3;
            this.label = 1;
            Object objM8790ensureInitialize0E7RQCE$default = InterfaceC54577xNn.ActionBar.m8790ensureInitialize0E7RQCE$default(c54589xNz, false, null, this, 3, null);
            if (objM8790ensureInitialize0E7RQCE$default == objCopydefault) {
                return objCopydefault;
            }
            viewOnClickListenerC38857phO = viewOnClickListenerC38857phO3;
            objM7386unboximpl = objM8790ensureInitialize0E7RQCE$default;
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                viewOnClickListenerC38857phO2 = (ViewOnClickListenerC38857phO) this.L$0;
                C56391yDq.AEQbTJ(obj);
                if (((AbstractC54531xLw) obj) != null) {
                    viewOnClickListenerC38857phO2.AhwBna();
                    unit = Unit.INSTANCE;
                }
                objM7377constructorimpl = Result.m7377constructorimpl(unit);
                ViewOnClickListenerC38857phO viewOnClickListenerC38857phO4 = this.this$0;
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
                if (thM7380exceptionOrNullimpl != null) {
                    pUU.copydefault(viewOnClickListenerC38857phO4.getTAG(), "klineEnsureInitialize: " + thM7380exceptionOrNullimpl.getMessage());
                    viewOnClickListenerC38857phO4.ORxRYg();
                }
                return Unit.INSTANCE;
            }
            viewOnClickListenerC38857phO = (ViewOnClickListenerC38857phO) this.L$0;
            C56391yDq.AEQbTJ(obj);
            objM7386unboximpl = ((Result) obj).m7386unboximpl();
        }
        if (Result.m7384isSuccessimpl(objM7386unboximpl)) {
            MarketCoinInfo marketCoinInfoFARcdN = viewOnClickListenerC38857phO.fARcdN();
            if (marketCoinInfoFARcdN != null) {
                if (Result.m7383isFailureimpl(objM7386unboximpl)) {
                    objM7386unboximpl = null;
                }
                InterfaceC54581xNr interfaceC54581xNr = (InterfaceC54581xNr) objM7386unboximpl;
                if (interfaceC54581xNr != null) {
                    String instrumentType = marketCoinInfoFARcdN.getInstrumentType();
                    this.L$0 = viewOnClickListenerC38857phO;
                    this.label = 2;
                    obj = interfaceC54581xNr.EZpvd(instrumentType, this);
                    if (obj == objCopydefault) {
                        return objCopydefault;
                    }
                    viewOnClickListenerC38857phO2 = viewOnClickListenerC38857phO;
                    if (((AbstractC54531xLw) obj) != null) {
                    }
                }
            }
        } else {
            pUU.copydefault(viewOnClickListenerC38857phO.getTAG(), "klineEnsureInitialize: 失败");
            viewOnClickListenerC38857phO.ORxRYg();
            unit = Unit.INSTANCE;
        }
        objM7377constructorimpl = Result.m7377constructorimpl(unit);
        ViewOnClickListenerC38857phO viewOnClickListenerC38857phO42 = this.this$0;
        thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
        }
        return Unit.INSTANCE;
    }
}
