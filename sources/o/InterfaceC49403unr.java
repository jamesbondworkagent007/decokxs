package o;

import com.okinc.trade.arch.domain.IUseCase$invoke$2;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC49376unQ;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.unr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public interface InterfaceC49403unr<Input, Output> extends InterfaceC49376unQ {
    java.lang.Object KWHzl(Input input, @NotNull Continuation<? super Output> continuation);

    /* JADX INFO: renamed from: o.unr$Application */
    public static final class Application {
        public static <Input_I1, Output_I1, Input, Output> Output EZpvd(@NotNull InterfaceC49403unr<? super Input_I1, Output_I1> interfaceC49403unr, Input input, @NotNull Function1<? super Input, ? extends Output> function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            return (Output) InterfaceC49376unQ.Application.copydefault(interfaceC49403unr, input, function1);
        }

        public static <Input_I1, Output_I1, Input, Output> java.lang.Object KWHzl(@NotNull InterfaceC49403unr<? super Input_I1, Output_I1> interfaceC49403unr, Input input, @NotNull Function2<? super Input, ? super Continuation<? super Output>, ? extends java.lang.Object> function2, @NotNull Continuation<? super Output> continuation) {
            return InterfaceC49376unQ.Application.EZpvd(interfaceC49403unr, input, function2, continuation);
        }

        public static <Input, Output> boolean copydefault(@NotNull InterfaceC49403unr<? super Input, Output> interfaceC49403unr) {
            return InterfaceC49376unQ.Application.copydefault(interfaceC49403unr);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: Input */
        /* JADX WARN: Multi-variable type inference failed */
        public static <Input, Output> java.lang.Object KWHzl(@NotNull InterfaceC49403unr<? super Input, Output> interfaceC49403unr, Input input, @NotNull Continuation<? super Output> continuation) {
            return interfaceC49403unr.KWHzl(input, new IUseCase$invoke$2(interfaceC49403unr), continuation);
        }
    }
}
