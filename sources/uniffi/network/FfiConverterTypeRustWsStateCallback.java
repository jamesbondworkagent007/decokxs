package uniffi.network;

import kotlin.jvm.internal.Intrinsics;
import o.C4298Bav;
import o.C4392Bcj;
import o.C60184zxu;
import o.InterfaceC4388Bcf;
import org.jetbrains.annotations.NotNull;
import uniffi.BaseFfiConverterType;

/* JADX INFO: loaded from: classes17.dex */
public final class FfiConverterTypeRustWsStateCallback extends BaseFfiConverterType<InterfaceC4388Bcf> {
    public static final int $stable = 0;
    public static final FfiConverterTypeRustWsStateCallback INSTANCE = new FfiConverterTypeRustWsStateCallback();

    private FfiConverterTypeRustWsStateCallback() {
        super(C4298Bav.uniffiRustBuffer);
    }

    /* JADX DEBUG: Method merged with bridge method: getRustHandle(Ljava/lang/Object;)Ljava/lang/Long; */
    @Override // uniffi.BaseFfiConverterType
    public Long getRustHandle(@NotNull InterfaceC4388Bcf interfaceC4388Bcf) {
        Intrinsics.checkNotNullParameter(interfaceC4388Bcf, "");
        if (interfaceC4388Bcf instanceof C4392Bcj) {
            return Long.valueOf(((C4392Bcj) interfaceC4388Bcf).uniffiCloneHandle());
        }
        return null;
    }

    /* JADX DEBUG: Method merged with bridge method: createFromHandle(J)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterType
    public InterfaceC4388Bcf createFromHandle(long j) {
        return new C4392Bcj(C60184zxu.INSTANCE, j);
    }
}
