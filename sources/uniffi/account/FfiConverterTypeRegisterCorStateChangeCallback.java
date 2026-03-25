package uniffi.account;

import kotlin.jvm.internal.Intrinsics;
import o.C2913Abz;
import o.C60184zxu;
import o.C60230zyn;
import o.InterfaceC2906Abs;
import org.jetbrains.annotations.NotNull;
import uniffi.BaseFfiConverterType;

/* JADX INFO: loaded from: classes17.dex */
public final class FfiConverterTypeRegisterCorStateChangeCallback extends BaseFfiConverterType<InterfaceC2906Abs> {
    public static final int $stable = 0;
    public static final FfiConverterTypeRegisterCorStateChangeCallback INSTANCE = new FfiConverterTypeRegisterCorStateChangeCallback();

    private FfiConverterTypeRegisterCorStateChangeCallback() {
        super(C60230zyn.uniffiRustBuffer);
    }

    /* JADX DEBUG: Method merged with bridge method: getRustHandle(Ljava/lang/Object;)Ljava/lang/Long; */
    @Override // uniffi.BaseFfiConverterType
    public Long getRustHandle(@NotNull InterfaceC2906Abs interfaceC2906Abs) {
        Intrinsics.checkNotNullParameter(interfaceC2906Abs, "");
        if (interfaceC2906Abs instanceof C2913Abz) {
            return Long.valueOf(((C2913Abz) interfaceC2906Abs).uniffiCloneHandle());
        }
        return null;
    }

    /* JADX DEBUG: Method merged with bridge method: createFromHandle(J)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterType
    public InterfaceC2906Abs createFromHandle(long j) {
        return new C2913Abz(C60184zxu.INSTANCE, j);
    }
}
