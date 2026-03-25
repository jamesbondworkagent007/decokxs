package uniffi.experiment;

import kotlin.jvm.internal.Intrinsics;
import o.C2348AIh;
import o.C2362AIv;
import o.C60184zxu;
import o.InterfaceC2361AIu;
import org.jetbrains.annotations.NotNull;
import uniffi.BaseFfiConverterType;

/* JADX INFO: loaded from: classes17.dex */
public final class FfiConverterTypeFeedbackInterface extends BaseFfiConverterType<InterfaceC2361AIu> {
    public static final int $stable = 0;
    public static final FfiConverterTypeFeedbackInterface INSTANCE = new FfiConverterTypeFeedbackInterface();

    private FfiConverterTypeFeedbackInterface() {
        super(C2348AIh.uniffiRustBuffer);
    }

    /* JADX DEBUG: Method merged with bridge method: getRustHandle(Ljava/lang/Object;)Ljava/lang/Long; */
    @Override // uniffi.BaseFfiConverterType
    public Long getRustHandle(@NotNull InterfaceC2361AIu interfaceC2361AIu) {
        Intrinsics.checkNotNullParameter(interfaceC2361AIu, "");
        if (interfaceC2361AIu instanceof C2362AIv) {
            return Long.valueOf(((C2362AIv) interfaceC2361AIu).uniffiCloneHandle());
        }
        return null;
    }

    /* JADX DEBUG: Method merged with bridge method: createFromHandle(J)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterType
    public InterfaceC2361AIu createFromHandle(long j) {
        return new C2362AIv(C60184zxu.INSTANCE, j);
    }
}
