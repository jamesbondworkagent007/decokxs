package uniffi.account;

import kotlin.jvm.internal.Intrinsics;
import o.C2889Abb;
import o.C60184zxu;
import o.C60230zyn;
import o.InterfaceC2888Aba;
import org.jetbrains.annotations.NotNull;
import uniffi.BaseFfiConverterType;

/* JADX INFO: loaded from: classes17.dex */
public final class FfiConverterTypeRegisterCorEventCallback extends BaseFfiConverterType<InterfaceC2888Aba> {
    public static final int $stable = 0;
    public static final FfiConverterTypeRegisterCorEventCallback INSTANCE = new FfiConverterTypeRegisterCorEventCallback();

    private FfiConverterTypeRegisterCorEventCallback() {
        super(C60230zyn.uniffiRustBuffer);
    }

    /* JADX DEBUG: Method merged with bridge method: getRustHandle(Ljava/lang/Object;)Ljava/lang/Long; */
    @Override // uniffi.BaseFfiConverterType
    public Long getRustHandle(@NotNull InterfaceC2888Aba interfaceC2888Aba) {
        Intrinsics.checkNotNullParameter(interfaceC2888Aba, "");
        if (interfaceC2888Aba instanceof C2889Abb) {
            return Long.valueOf(((C2889Abb) interfaceC2888Aba).uniffiCloneHandle());
        }
        return null;
    }

    /* JADX DEBUG: Method merged with bridge method: createFromHandle(J)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterType
    public InterfaceC2888Aba createFromHandle(long j) {
        return new C2889Abb(C60184zxu.INSTANCE, j);
    }
}
