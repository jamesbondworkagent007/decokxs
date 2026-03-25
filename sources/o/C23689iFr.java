package o;

import com.okinc.business.invest_biz.data.bean.AggregateHeaderData;
import com.okinc.business.invest_biz.data.usecase.AggregateHeaderUseCaseImpl$invoke$1;
import com.okinc.business.invest_biz.data.usecase.AggregateHeaderUseCaseImpl$invoke$2;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.iFr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C23689iFr implements InterfaceC23690iFs {
    public final InterfaceC23589iBz AEQbTJ;
    public final CoroutineDispatcher EZpvd;
    public final C23580iBq KWHzl;

    public C23689iFr(@NotNull InterfaceC23589iBz interfaceC23589iBz, @NotNull CoroutineDispatcher coroutineDispatcher, @NotNull C23580iBq c23580iBq) {
        Intrinsics.checkNotNullParameter(interfaceC23589iBz, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(c23580iBq, "");
        this.AEQbTJ = interfaceC23589iBz;
        this.EZpvd = coroutineDispatcher;
        this.KWHzl = c23580iBq;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @yCM
    public C23689iFr(@NotNull InterfaceC23589iBz interfaceC23589iBz, @NotNull CoroutineDispatcher coroutineDispatcher) {
        this(interfaceC23589iBz, coroutineDispatcher, C23580iBq.AEQbTJ);
        Intrinsics.checkNotNullParameter(interfaceC23589iBz, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.InterfaceC23690iFs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object EZpvd(@NotNull C23722iGx c23722iGx, @NotNull Continuation<? super Result<AggregateHeaderData>> continuation) {
        AggregateHeaderUseCaseImpl$invoke$1 aggregateHeaderUseCaseImpl$invoke$1;
        if (continuation instanceof AggregateHeaderUseCaseImpl$invoke$1) {
            aggregateHeaderUseCaseImpl$invoke$1 = (AggregateHeaderUseCaseImpl$invoke$1) continuation;
            int i = aggregateHeaderUseCaseImpl$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                aggregateHeaderUseCaseImpl$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                aggregateHeaderUseCaseImpl$invoke$1 = new AggregateHeaderUseCaseImpl$invoke$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = aggregateHeaderUseCaseImpl$invoke$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = aggregateHeaderUseCaseImpl$invoke$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.EZpvd;
            AggregateHeaderUseCaseImpl$invoke$2 aggregateHeaderUseCaseImpl$invoke$2 = new AggregateHeaderUseCaseImpl$invoke$2(this, c23722iGx, null);
            aggregateHeaderUseCaseImpl$invoke$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, aggregateHeaderUseCaseImpl$invoke$2, aggregateHeaderUseCaseImpl$invoke$1);
            if (objWithContext == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objWithContext);
        }
        return ((Result) objWithContext).m7386unboximpl();
    }
}
