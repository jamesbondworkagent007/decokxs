package uniffi.lifecycle;

import kotlin.jvm.internal.Intrinsics;
import o.C2692AVo;
import o.C2700AVw;
import o.C60184zxu;
import o.InterfaceC2699AVv;
import org.jetbrains.annotations.NotNull;
import uniffi.BaseFfiConverterType;

/* JADX INFO: loaded from: classes17.dex */
public final class FfiConverterTypeOKNativeTaskboolWithLifecycleFutureError extends BaseFfiConverterType<InterfaceC2699AVv> {
    public static final int $stable = 0;
    public static final FfiConverterTypeOKNativeTaskboolWithLifecycleFutureError INSTANCE = new FfiConverterTypeOKNativeTaskboolWithLifecycleFutureError();

    private FfiConverterTypeOKNativeTaskboolWithLifecycleFutureError() {
        super(C2692AVo.uniffiRustBuffer);
    }

    /* JADX DEBUG: Method merged with bridge method: getRustHandle(Ljava/lang/Object;)Ljava/lang/Long; */
    @Override // uniffi.BaseFfiConverterType
    public Long getRustHandle(@NotNull InterfaceC2699AVv interfaceC2699AVv) {
        Intrinsics.checkNotNullParameter(interfaceC2699AVv, "");
        if (interfaceC2699AVv instanceof C2700AVw) {
            return Long.valueOf(((C2700AVw) interfaceC2699AVv).uniffiCloneHandle());
        }
        return null;
    }

    /* JADX DEBUG: Method merged with bridge method: createFromHandle(J)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterType
    public InterfaceC2699AVv createFromHandle(long j) {
        return new C2700AVw(C60184zxu.INSTANCE, j);
    }
}
