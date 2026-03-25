package uniffi.network;

import kotlin.jvm.internal.Intrinsics;
import o.C4298Bav;
import o.C4399Bcq;
import o.C60184zxu;
import o.InterfaceC4400Bcr;
import org.jetbrains.annotations.NotNull;
import uniffi.BaseFfiConverterType;

/* JADX INFO: loaded from: classes17.dex */
public final class FfiConverterTypeUploadProgressCallback extends BaseFfiConverterType<InterfaceC4400Bcr> {
    public static final int $stable = 0;
    public static final FfiConverterTypeUploadProgressCallback INSTANCE = new FfiConverterTypeUploadProgressCallback();

    private FfiConverterTypeUploadProgressCallback() {
        super(C4298Bav.uniffiRustBuffer);
    }

    /* JADX DEBUG: Method merged with bridge method: getRustHandle(Ljava/lang/Object;)Ljava/lang/Long; */
    @Override // uniffi.BaseFfiConverterType
    public Long getRustHandle(@NotNull InterfaceC4400Bcr interfaceC4400Bcr) {
        Intrinsics.checkNotNullParameter(interfaceC4400Bcr, "");
        if (interfaceC4400Bcr instanceof C4399Bcq) {
            return Long.valueOf(((C4399Bcq) interfaceC4400Bcr).uniffiCloneHandle());
        }
        return null;
    }

    /* JADX DEBUG: Method merged with bridge method: createFromHandle(J)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterType
    public InterfaceC4400Bcr createFromHandle(long j) {
        return new C4399Bcq(C60184zxu.INSTANCE, j);
    }
}
