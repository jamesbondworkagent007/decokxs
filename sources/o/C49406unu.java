package o;

import com.okinc.trade.arch.domain.DefaultUseCaseDistinct$distinct$3;
import com.okinc.trade.arch.domain.IUseCaseDistinct;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Deferred;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.unu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public class C49406unu<R> implements IUseCaseDistinct<R> {
    public final InterfaceC56387yDm copydefault = C56392yDr.copydefault(new Function0() { // from class: o.unv
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C49406unu.OLrzqt();
        }
    });

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.trade.arch.domain.IUseCaseDistinct
    public java.lang.Object EZpvd(@NotNull Function1<? super Continuation<? super R>, ? extends java.lang.Object> function1, @NotNull IUseCaseDistinct.DistinctStrategy distinctStrategy, @NotNull java.lang.String str, @NotNull Continuation<? super R> continuation) {
        return EZpvd(this, function1, distinctStrategy, str, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.trade.arch.domain.IUseCaseDistinct
    public java.lang.Object copydefault(@NotNull IUseCaseDistinct.DistinctStrategy distinctStrategy, @NotNull java.lang.String str, @NotNull Function1<? super Continuation<? super R>, ? extends java.lang.Object> function1, @NotNull Continuation<? super R> continuation) {
        return KWHzl(this, distinctStrategy, str, function1, continuation);
    }

    public ConcurrentHashMap<java.lang.String, Deferred<R>> KWHzl() {
        return (ConcurrentHashMap) this.copydefault.getValue();
    }

    public static final ConcurrentHashMap OLrzqt() {
        return new ConcurrentHashMap();
    }

    @Override // com.okinc.trade.arch.domain.IUseCaseDistinct
    public java.lang.String AYXKKw() {
        java.lang.String string = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public static /* synthetic */ <R> java.lang.Object KWHzl(C49406unu<R> c49406unu, IUseCaseDistinct.DistinctStrategy distinctStrategy, java.lang.String str, Function1<? super Continuation<? super R>, ? extends java.lang.Object> function1, Continuation<? super R> continuation) {
        return c49406unu.EZpvd(function1, distinctStrategy, str, continuation);
    }

    public static /* synthetic */ <R> java.lang.Object EZpvd(C49406unu<R> c49406unu, Function1<? super Continuation<? super R>, ? extends java.lang.Object> function1, IUseCaseDistinct.DistinctStrategy distinctStrategy, java.lang.String str, Continuation<? super R> continuation) {
        return CoroutineScopeKt.coroutineScope(new DefaultUseCaseDistinct$distinct$3(distinctStrategy, c49406unu, str, function1, null), continuation);
    }
}
