package o;

import com.okinc.tradingbot.impl.planet.domain.InitializeTradeManagerUseCase$execute$1;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import o.InterfaceC54577xNn;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wpt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C53673wpt extends vNH<java.util.List<? extends java.lang.String>, Unit> {
    public final CoroutineDispatcher EZpvd;

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, kotlin.coroutines.Continuation] */
    @Override // o.vNH
    public /* synthetic */ java.lang.Object OLrzqt(java.util.List<? extends java.lang.String> list, Continuation<? super Unit> continuation) {
        return KWHzl((java.util.List<java.lang.String>) list, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @yCM
    public C53673wpt(@NotNull CoroutineDispatcher coroutineDispatcher) {
        super(coroutineDispatcher);
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.EZpvd = coroutineDispatcher;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x007a -> B:27:0x007d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object KWHzl(@NotNull java.util.List<java.lang.String> list, @NotNull Continuation<? super Unit> continuation) throws java.lang.Throwable {
        InitializeTradeManagerUseCase$execute$1 initializeTradeManagerUseCase$execute$1;
        java.util.Iterator<java.lang.String> it;
        if (continuation instanceof InitializeTradeManagerUseCase$execute$1) {
            initializeTradeManagerUseCase$execute$1 = (InitializeTradeManagerUseCase$execute$1) continuation;
            int i = initializeTradeManagerUseCase$execute$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                initializeTradeManagerUseCase$execute$1.label = i - Integer.MIN_VALUE;
            } else {
                initializeTradeManagerUseCase$execute$1 = new InitializeTradeManagerUseCase$execute$1(this, continuation);
            }
        }
        java.lang.Object objEZpvd = initializeTradeManagerUseCase$execute$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = initializeTradeManagerUseCase$execute$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objEZpvd);
            C54589xNz c54589xNz = C54589xNz.EZpvd;
            initializeTradeManagerUseCase$execute$1.L$0 = list;
            initializeTradeManagerUseCase$execute$1.label = 1;
            if (InterfaceC54577xNn.ActionBar.m8790ensureInitialize0E7RQCE$default(c54589xNz, false, null, initializeTradeManagerUseCase$execute$1, 3, null) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                it = (java.util.Iterator) initializeTradeManagerUseCase$execute$1.L$0;
                C56391yDq.AEQbTJ(objEZpvd);
                while (it.hasNext()) {
                    java.lang.String next = it.next();
                    InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
                    if (interfaceC54581xNrOLrzqt != null) {
                        initializeTradeManagerUseCase$execute$1.L$0 = it;
                        initializeTradeManagerUseCase$execute$1.label = 2;
                        objEZpvd = interfaceC54581xNrOLrzqt.EZpvd(next, initializeTradeManagerUseCase$execute$1);
                        if (objEZpvd == objCopydefault) {
                            return objCopydefault;
                        }
                        while (it.hasNext()) {
                        }
                    }
                }
                return Unit.INSTANCE;
            }
            list = (java.util.List) initializeTradeManagerUseCase$execute$1.L$0;
            C56391yDq.AEQbTJ(objEZpvd);
            ((Result) objEZpvd).m7386unboximpl();
        }
        it = list.iterator();
        while (it.hasNext()) {
        }
        return Unit.INSTANCE;
    }
}
