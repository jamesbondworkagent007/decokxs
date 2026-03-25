package o;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Future;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.aVq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6782aVq implements InterfaceC6741aVB {
    public final InterfaceC6785aVt copydefault;

    public C6782aVq(@NotNull InterfaceC6785aVt interfaceC6785aVt) {
        Intrinsics.checkNotNullParameter(interfaceC6785aVt, "");
        this.copydefault = interfaceC6785aVt;
    }

    @Override // o.InterfaceC6741aVB
    public <T> Future<T> copydefault(@NotNull AbstractCallableC6746aVG<T> abstractCallableC6746aVG) {
        Intrinsics.checkNotNullParameter(abstractCallableC6746aVG, "");
        if (!abstractCallableC6746aVG.gEmmrt()) {
            pUU.KWHzl("Monitor.TPM", "Task " + abstractCallableC6746aVG.OLrzqt() + " cancelled due to lifecycle state");
            abstractCallableC6746aVG.KWHzl();
            CompletableFuture completableFutureCompletedFuture = CompletableFuture.completedFuture(null);
            Intrinsics.checkNotNullExpressionValue(completableFutureCompletedFuture, "");
            return completableFutureCompletedFuture;
        }
        try {
            Future<T> futureSubmit = this.copydefault.KWHzl(abstractCallableC6746aVG.EZpvd(), abstractCallableC6746aVG.copydefault()).submit(new CallableC6787aVv(abstractCallableC6746aVG, abstractCallableC6746aVG));
            Intrinsics.copydefault(futureSubmit);
            abstractCallableC6746aVG.OLrzqt(futureSubmit);
            return futureSubmit;
        } catch (java.lang.Exception e) {
            pUU.AEQbTJ("Monitor.TPM", "Task execution rejected: " + abstractCallableC6746aVG.OLrzqt(), e);
            CompletableFuture completableFuture = new CompletableFuture();
            completableFuture.completeExceptionally(e);
            return completableFuture;
        }
    }
}
