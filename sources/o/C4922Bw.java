package o;

import aws.smithy.kotlin.runtime.http.middleware.PolicyLogger$evaluate$1$1;
import aws.smithy.kotlin.runtime.telemetry.logging.LogLevel;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC5091Ej;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.Bw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4922Bw<O> implements InterfaceC5093El<O> {
    public final CoroutineContext AEQbTJ;
    public final InterfaceC5093El<O> EZpvd;

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: o.El<? super O> */
    /* JADX WARN: Multi-variable type inference failed */
    public C4922Bw(@NotNull InterfaceC5093El<? super O> interfaceC5093El, @NotNull CoroutineContext coroutineContext) {
        Intrinsics.checkNotNullParameter(interfaceC5093El, "");
        Intrinsics.checkNotNullParameter(coroutineContext, "");
        this.EZpvd = interfaceC5093El;
        this.AEQbTJ = coroutineContext;
    }

    @Override // o.InterfaceC5093El
    public AbstractC5091Ej KWHzl(@NotNull java.lang.Object obj) {
        AbstractC5091Ej abstractC5091EjKWHzl = this.EZpvd.KWHzl(obj);
        if (abstractC5091EjKWHzl instanceof AbstractC5091Ej.Application) {
            CoroutineContext coroutineContext = this.AEQbTJ;
            PolicyLogger$evaluate$1$1 policyLogger$evaluate$1$1 = new Function0<java.lang.String>() { // from class: aws.smithy.kotlin.runtime.http.middleware.PolicyLogger$evaluate$1$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "request failed with non-retryable error";
                }
            };
            LogLevel logLevel = LogLevel.Debug;
            java.lang.String strGEmmrt = C56524yIo.AEQbTJ(C5003Bz.class).gEmmrt();
            if (strGEmmrt == null) {
                throw new java.lang.IllegalArgumentException("log<T> cannot be used on an anonymous object".toString());
            }
            C5141Gh.copydefault(coroutineContext, logLevel, strGEmmrt, null, policyLogger$evaluate$1$1);
        }
        return abstractC5091EjKWHzl;
    }
}
