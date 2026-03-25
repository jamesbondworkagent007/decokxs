package com.reown.sign.engine.use_case.calls;

import com.reown.sign.engine.model.EngineDO;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public interface ApproveSessionUseCaseInterface {
    Object approve(@NotNull String str, @NotNull Map<String, EngineDO.Namespace.Session> map, @NotNull Function0<Unit> function0, @NotNull Function1<? super Throwable, Unit> function1, @NotNull Continuation<? super Unit> continuation);

    /* JADX INFO: loaded from: classes17.dex */
    public static final class DefaultImpls {
        /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: com.reown.sign.engine.use_case.calls.ApproveSessionUseCaseInterface */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Object approve$default(ApproveSessionUseCaseInterface approveSessionUseCaseInterface, String str, Map map, Function0 function0, Function1 function1, Continuation continuation, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: approve");
            }
            if ((i & 4) != 0) {
                function0 = new Function0<Unit>() { // from class: com.reown.sign.engine.use_case.calls.ApproveSessionUseCaseInterface.approve.1
                    /* JADX DEBUG: Possible override for method kotlin.jvm.functions.Function0.invoke()Ljava/lang/Object; */
                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                    }

                    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }
                };
            }
            Function0 function02 = function0;
            if ((i & 8) != 0) {
                function1 = new Function1<Throwable, Unit>() { // from class: com.reown.sign.engine.use_case.calls.ApproveSessionUseCaseInterface.approve.2
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull Throwable th) {
                        Intrinsics.checkNotNullParameter(th, "");
                    }

                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                        invoke2(th);
                        return Unit.INSTANCE;
                    }
                };
            }
            return approveSessionUseCaseInterface.approve(str, map, function02, function1, continuation);
        }
    }
}
