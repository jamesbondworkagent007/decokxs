package uniffi.account;

import kotlin.jvm.internal.Intrinsics;
import o.C3018Ady;
import o.C60184zxu;
import o.C60230zyn;
import o.InterfaceC3019Adz;
import org.jetbrains.annotations.NotNull;
import uniffi.BaseFfiConverterType;

/* JADX INFO: loaded from: classes17.dex */
public final class FfiConverterTypeRegisterPasswordStateChangeCallback extends BaseFfiConverterType<InterfaceC3019Adz> {
    public static final int $stable = 0;
    public static final FfiConverterTypeRegisterPasswordStateChangeCallback INSTANCE = new FfiConverterTypeRegisterPasswordStateChangeCallback();

    private FfiConverterTypeRegisterPasswordStateChangeCallback() {
        super(C60230zyn.uniffiRustBuffer);
    }

    /* JADX DEBUG: Method merged with bridge method: getRustHandle(Ljava/lang/Object;)Ljava/lang/Long; */
    @Override // uniffi.BaseFfiConverterType
    public Long getRustHandle(@NotNull InterfaceC3019Adz interfaceC3019Adz) {
        Intrinsics.checkNotNullParameter(interfaceC3019Adz, "");
        if (interfaceC3019Adz instanceof C3018Ady) {
            return Long.valueOf(((C3018Ady) interfaceC3019Adz).uniffiCloneHandle());
        }
        return null;
    }

    /* JADX DEBUG: Method merged with bridge method: createFromHandle(J)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterType
    public InterfaceC3019Adz createFromHandle(long j) {
        return new C3018Ady(C60184zxu.INSTANCE, j);
    }
}
