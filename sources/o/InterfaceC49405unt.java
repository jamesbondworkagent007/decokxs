package o;

import com.okinc.trade.arch.domain.ISimpleUseCase$invoke$1;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC49376unQ;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.unt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public interface InterfaceC49405unt<Input, Output> extends InterfaceC49376unQ {
    Output AEQbTJ(Input input);

    /* JADX INFO: renamed from: o.unt$Activity */
    public static final class Activity {
        public static <Input_I1, Output_I1, Input, Output> java.lang.Object EZpvd(@NotNull InterfaceC49405unt<? super Input_I1, Output_I1> interfaceC49405unt, Input input, @NotNull Function2<? super Input, ? super Continuation<? super Output>, ? extends java.lang.Object> function2, @NotNull Continuation<? super Output> continuation) {
            return InterfaceC49376unQ.Application.EZpvd(interfaceC49405unt, input, function2, continuation);
        }

        public static <Input, Output> boolean KWHzl(@NotNull InterfaceC49405unt<? super Input, Output> interfaceC49405unt) {
            return InterfaceC49376unQ.Application.copydefault(interfaceC49405unt);
        }

        public static <Input_I1, Output_I1, Input, Output> Output OLrzqt(@NotNull InterfaceC49405unt<? super Input_I1, Output_I1> interfaceC49405unt, Input input, @NotNull Function1<? super Input, ? extends Output> function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            return (Output) InterfaceC49376unQ.Application.copydefault(interfaceC49405unt, input, function1);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: Input */
        /* JADX WARN: Multi-variable type inference failed */
        public static <Input, Output> Output EZpvd(@NotNull InterfaceC49405unt<? super Input, Output> interfaceC49405unt, Input input) {
            return interfaceC49405unt.EZpvd(input, new ISimpleUseCase$invoke$1(interfaceC49405unt));
        }
    }
}
