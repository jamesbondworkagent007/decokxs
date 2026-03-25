package o;

import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.Dt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC5075Dt<Request, Response> {
    <H extends CG<? super Request, ? extends Response>> java.lang.Object EZpvd(Request request, @NotNull H h, @NotNull Continuation<? super Response> continuation);
}
