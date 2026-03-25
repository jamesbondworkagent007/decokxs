package o;

import com.okinc.trade.arch.domain.BaseMainSafeUseCase$invoke$2;
import com.okinc.trade.arch.domain.IUseCaseDistinct;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import o.InterfaceC49403unr;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.uno, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public abstract class AbstractC49400uno<Input, Output> implements InterfaceC49403unr<Input, Output>, IUseCaseDistinct<Output> {
    public final /* synthetic */ C49406unu<Output> fetchVPNInfo = new C49406unu<>();

    public abstract CoroutineDispatcher AEQbTJ();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.trade.arch.domain.IUseCaseDistinct
    public java.lang.String AYXKKw() {
        return this.fetchVPNInfo.AYXKKw();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.Object EZpvd(Input input, @NotNull Continuation<? super Output> continuation) {
        return KWHzl(this, input, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.trade.arch.domain.IUseCaseDistinct
    public java.lang.Object EZpvd(@NotNull Function1<? super Continuation<? super Output>, ? extends java.lang.Object> function1, @NotNull IUseCaseDistinct.DistinctStrategy distinctStrategy, @NotNull java.lang.String str, @NotNull Continuation<? super Output> continuation) {
        return this.fetchVPNInfo.EZpvd(function1, distinctStrategy, str, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.trade.arch.domain.IUseCaseDistinct
    public java.lang.Object copydefault(@NotNull IUseCaseDistinct.DistinctStrategy distinctStrategy, @NotNull java.lang.String str, @NotNull Function1<? super Continuation<? super Output>, ? extends java.lang.Object> function1, @NotNull Continuation<? super Output> continuation) {
        return this.fetchVPNInfo.copydefault(distinctStrategy, str, function1, continuation);
    }

    @Override // o.InterfaceC49376unQ
    public <Input, Output> Output EZpvd(Input input, @NotNull Function1<? super Input, ? extends Output> function1) {
        return (Output) InterfaceC49403unr.Application.EZpvd(this, input, function1);
    }

    @Override // o.InterfaceC49376unQ
    public boolean EZpvd() {
        return InterfaceC49403unr.Application.copydefault(this);
    }

    @Override // o.InterfaceC49376unQ
    public <Input, Output> java.lang.Object KWHzl(Input input, @NotNull Function2<? super Input, ? super Continuation<? super Output>, ? extends java.lang.Object> function2, @NotNull Continuation<? super Output> continuation) {
        return InterfaceC49403unr.Application.KWHzl(this, input, function2, continuation);
    }

    public static /* synthetic */ <Input, Output> java.lang.Object KWHzl(AbstractC49400uno<? super Input, Output> abstractC49400uno, Input input, Continuation<? super Output> continuation) {
        return BuildersKt.withContext(abstractC49400uno.AEQbTJ(), new BaseMainSafeUseCase$invoke$2(abstractC49400uno, input, null), continuation);
    }
}
