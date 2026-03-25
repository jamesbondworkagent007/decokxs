package o;

import aws.smithy.kotlin.runtime.http.SdkHttpClient$executeWithCallContext$2;
import aws.smithy.kotlin.runtime.http.engine.HttpClientEngineClosedException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.JobKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class zU implements CG<BP<C5036Cg>, C58859zS> {
    public final InterfaceC3972Aw OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InterfaceC3972Aw OLrzqt() {
        return this.OLrzqt;
    }

    public zU(@NotNull InterfaceC3972Aw interfaceC3972Aw) {
        Intrinsics.checkNotNullParameter(interfaceC3972Aw, "");
        this.OLrzqt = interfaceC3972Aw;
    }

    public final java.lang.Object OLrzqt(@NotNull InterfaceC5037Ch interfaceC5037Ch, @NotNull Continuation<? super C58859zS> continuation) {
        return OLrzqt(new DT(), interfaceC5037Ch, continuation);
    }

    public final java.lang.Object AEQbTJ(@NotNull C5036Cg c5036Cg, @NotNull Continuation<? super C58859zS> continuation) {
        return OLrzqt(c5036Cg.copydefault(), continuation);
    }

    /* JADX DEBUG: Method merged with bridge method: OLrzqt(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
    @Override // o.CG
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public java.lang.Object OLrzqt(@NotNull BP<C5036Cg> bp, @NotNull Continuation<? super C58859zS> continuation) {
        return OLrzqt(bp.OLrzqt(), bp.EZpvd().copydefault(), continuation);
    }

    public final java.lang.Object OLrzqt(DT dt, InterfaceC5037Ch interfaceC5037Ch, Continuation<? super C58859zS> continuation) {
        if (!JobKt.getJob(this.OLrzqt.getCoroutineContext()).isActive()) {
            throw new HttpClientEngineClosedException(null, 1, null);
        }
        CoroutineContext coroutineContextCopydefault = C3497An.copydefault(this.OLrzqt, continuation.getContext());
        return BuildersKt__Builders_commonKt.async$default(this.OLrzqt, coroutineContextCopydefault.plus(new AF(coroutineContextCopydefault)), null, new SdkHttpClient$executeWithCallContext$2(this, dt, interfaceC5037Ch, null), 2, null).await(continuation);
    }
}
