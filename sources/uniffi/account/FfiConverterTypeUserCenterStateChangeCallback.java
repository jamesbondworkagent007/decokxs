package uniffi.account;

import kotlin.jvm.internal.Intrinsics;
import o.C3243AiK;
import o.C60184zxu;
import o.C60230zyn;
import o.InterfaceC3240AiH;
import org.jetbrains.annotations.NotNull;
import uniffi.BaseFfiConverterType;

/* JADX INFO: loaded from: classes17.dex */
public final class FfiConverterTypeUserCenterStateChangeCallback extends BaseFfiConverterType<InterfaceC3240AiH> {
    public static final int $stable = 0;
    public static final FfiConverterTypeUserCenterStateChangeCallback INSTANCE = new FfiConverterTypeUserCenterStateChangeCallback();

    private FfiConverterTypeUserCenterStateChangeCallback() {
        super(C60230zyn.uniffiRustBuffer);
    }

    /* JADX DEBUG: Method merged with bridge method: getRustHandle(Ljava/lang/Object;)Ljava/lang/Long; */
    @Override // uniffi.BaseFfiConverterType
    public Long getRustHandle(@NotNull InterfaceC3240AiH interfaceC3240AiH) {
        Intrinsics.checkNotNullParameter(interfaceC3240AiH, "");
        if (interfaceC3240AiH instanceof C3243AiK) {
            return Long.valueOf(((C3243AiK) interfaceC3240AiH).uniffiCloneHandle());
        }
        return null;
    }

    /* JADX DEBUG: Method merged with bridge method: createFromHandle(J)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterType
    public InterfaceC3240AiH createFromHandle(long j) {
        return new C3243AiK(C60184zxu.INSTANCE, j);
    }
}
