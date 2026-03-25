package uniffi.account;

import kotlin.jvm.internal.Intrinsics;
import o.C2979AdL;
import o.C60184zxu;
import o.C60230zyn;
import o.InterfaceC2970AdC;
import org.jetbrains.annotations.NotNull;
import uniffi.BaseFfiConverterType;

/* JADX INFO: loaded from: classes17.dex */
public final class FfiConverterTypeRegisterPhoneInputEventCallback extends BaseFfiConverterType<InterfaceC2970AdC> {
    public static final int $stable = 0;
    public static final FfiConverterTypeRegisterPhoneInputEventCallback INSTANCE = new FfiConverterTypeRegisterPhoneInputEventCallback();

    private FfiConverterTypeRegisterPhoneInputEventCallback() {
        super(C60230zyn.uniffiRustBuffer);
    }

    /* JADX DEBUG: Method merged with bridge method: getRustHandle(Ljava/lang/Object;)Ljava/lang/Long; */
    @Override // uniffi.BaseFfiConverterType
    public Long getRustHandle(@NotNull InterfaceC2970AdC interfaceC2970AdC) {
        Intrinsics.checkNotNullParameter(interfaceC2970AdC, "");
        if (interfaceC2970AdC instanceof C2979AdL) {
            return Long.valueOf(((C2979AdL) interfaceC2970AdC).uniffiCloneHandle());
        }
        return null;
    }

    /* JADX DEBUG: Method merged with bridge method: createFromHandle(J)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterType
    public InterfaceC2970AdC createFromHandle(long j) {
        return new C2979AdL(C60184zxu.INSTANCE, j);
    }
}
