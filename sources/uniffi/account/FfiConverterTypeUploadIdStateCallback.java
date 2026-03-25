package uniffi.account;

import kotlin.jvm.internal.Intrinsics;
import o.C3203AhX;
import o.C60184zxu;
import o.C60230zyn;
import o.InterfaceC3199AhT;
import org.jetbrains.annotations.NotNull;
import uniffi.BaseFfiConverterType;

/* JADX INFO: loaded from: classes17.dex */
public final class FfiConverterTypeUploadIdStateCallback extends BaseFfiConverterType<InterfaceC3199AhT> {
    public static final int $stable = 0;
    public static final FfiConverterTypeUploadIdStateCallback INSTANCE = new FfiConverterTypeUploadIdStateCallback();

    private FfiConverterTypeUploadIdStateCallback() {
        super(C60230zyn.uniffiRustBuffer);
    }

    /* JADX DEBUG: Method merged with bridge method: getRustHandle(Ljava/lang/Object;)Ljava/lang/Long; */
    @Override // uniffi.BaseFfiConverterType
    public Long getRustHandle(@NotNull InterfaceC3199AhT interfaceC3199AhT) {
        Intrinsics.checkNotNullParameter(interfaceC3199AhT, "");
        if (interfaceC3199AhT instanceof C3203AhX) {
            return Long.valueOf(((C3203AhX) interfaceC3199AhT).uniffiCloneHandle());
        }
        return null;
    }

    /* JADX DEBUG: Method merged with bridge method: createFromHandle(J)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterType
    public InterfaceC3199AhT createFromHandle(long j) {
        return new C3203AhX(C60184zxu.INSTANCE, j);
    }
}
