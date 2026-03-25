package o;

import com.okinc.trade.arch.domain.ICoroutineUseCase$invoke$2;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC49403unr;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.uns, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public interface InterfaceC49404uns<Input, Output> extends InterfaceC49403unr<Input, Output> {
    @Override // o.InterfaceC49403unr
    java.lang.Object KWHzl(Input input, @NotNull Continuation<? super Output> continuation);

    /* JADX INFO: renamed from: o.uns$Activity */
    public static final class Activity {
        public static <Input_I1, Output_I1, Input, Output> java.lang.Object KWHzl(@NotNull InterfaceC49404uns<? super Input_I1, Output_I1> interfaceC49404uns, Input input, @NotNull Function2<? super Input, ? super Continuation<? super Output>, ? extends java.lang.Object> function2, @NotNull Continuation<? super Output> continuation) {
            return InterfaceC49403unr.Application.KWHzl(interfaceC49404uns, input, function2, continuation);
        }

        public static <Input_I1, Output_I1, Input, Output> Output OLrzqt(@NotNull InterfaceC49404uns<? super Input_I1, Output_I1> interfaceC49404uns, Input input, @NotNull Function1<? super Input, ? extends Output> function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            return (Output) InterfaceC49403unr.Application.EZpvd(interfaceC49404uns, input, function1);
        }

        public static <Input, Output> boolean copydefault(@NotNull InterfaceC49404uns<? super Input, Output> interfaceC49404uns) {
            return InterfaceC49403unr.Application.copydefault(interfaceC49404uns);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: Input */
        /* JADX WARN: Multi-variable type inference failed */
        public static <Input, Output> java.lang.Object EZpvd(@NotNull InterfaceC49404uns<? super Input, Output> interfaceC49404uns, Input input, @NotNull Continuation<? super Output> continuation) {
            return interfaceC49404uns.KWHzl(input, new ICoroutineUseCase$invoke$2(interfaceC49404uns), continuation);
        }
    }
}
