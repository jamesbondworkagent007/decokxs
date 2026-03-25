package uniffi.network;

import kotlin.jvm.internal.Intrinsics;
import o.C4298Bav;
import o.C4342Bbm;
import o.C60184zxu;
import o.InterfaceC4346Bbq;
import org.jetbrains.annotations.NotNull;
import uniffi.BaseFfiConverterType;

/* JADX INFO: loaded from: classes13.dex */
public final class FfiConverterTypeOKXRequestFactory extends BaseFfiConverterType<InterfaceC4346Bbq> {
    public static final int $stable = 0;
    public static final FfiConverterTypeOKXRequestFactory INSTANCE = new FfiConverterTypeOKXRequestFactory();

    private FfiConverterTypeOKXRequestFactory() {
        super(C4298Bav.uniffiRustBuffer);
    }

    /* JADX DEBUG: Method merged with bridge method: getRustHandle(Ljava/lang/Object;)Ljava/lang/Long; */
    @Override // uniffi.BaseFfiConverterType
    public Long getRustHandle(@NotNull InterfaceC4346Bbq interfaceC4346Bbq) {
        Intrinsics.checkNotNullParameter(interfaceC4346Bbq, "");
        if (interfaceC4346Bbq instanceof C4342Bbm) {
            return Long.valueOf(((C4342Bbm) interfaceC4346Bbq).uniffiCloneHandle());
        }
        return null;
    }

    /* JADX DEBUG: Method merged with bridge method: createFromHandle(J)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterType
    public InterfaceC4346Bbq createFromHandle(long j) {
        return new C4342Bbm(C60184zxu.INSTANCE, j);
    }
}
