package uniffi.network;

import kotlin.jvm.internal.Intrinsics;
import o.C4298Bav;
import o.C4355Bbz;
import o.C60184zxu;
import o.InterfaceC4354Bby;
import org.jetbrains.annotations.NotNull;
import uniffi.BaseFfiConverterType;

/* JADX INFO: loaded from: classes13.dex */
public final class FfiConverterTypeOKXWsFactory extends BaseFfiConverterType<InterfaceC4354Bby> {
    public static final int $stable = 0;
    public static final FfiConverterTypeOKXWsFactory INSTANCE = new FfiConverterTypeOKXWsFactory();

    private FfiConverterTypeOKXWsFactory() {
        super(C4298Bav.uniffiRustBuffer);
    }

    /* JADX DEBUG: Method merged with bridge method: getRustHandle(Ljava/lang/Object;)Ljava/lang/Long; */
    @Override // uniffi.BaseFfiConverterType
    public Long getRustHandle(@NotNull InterfaceC4354Bby interfaceC4354Bby) {
        Intrinsics.checkNotNullParameter(interfaceC4354Bby, "");
        if (interfaceC4354Bby instanceof C4355Bbz) {
            return Long.valueOf(((C4355Bbz) interfaceC4354Bby).uniffiCloneHandle());
        }
        return null;
    }

    /* JADX DEBUG: Method merged with bridge method: createFromHandle(J)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterType
    public InterfaceC4354Bby createFromHandle(long j) {
        return new C4355Bbz(C60184zxu.INSTANCE, j);
    }
}
