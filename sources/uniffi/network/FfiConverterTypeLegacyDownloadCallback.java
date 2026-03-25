package uniffi.network;

import kotlin.jvm.internal.Intrinsics;
import o.C2788AZg;
import o.C4298Bav;
import o.C60184zxu;
import o.InterfaceC2789AZh;
import org.jetbrains.annotations.NotNull;
import uniffi.BaseFfiConverterType;

/* JADX INFO: loaded from: classes17.dex */
public final class FfiConverterTypeLegacyDownloadCallback extends BaseFfiConverterType<InterfaceC2789AZh> {
    public static final int $stable = 0;
    public static final FfiConverterTypeLegacyDownloadCallback INSTANCE = new FfiConverterTypeLegacyDownloadCallback();

    private FfiConverterTypeLegacyDownloadCallback() {
        super(C4298Bav.uniffiRustBuffer);
    }

    /* JADX DEBUG: Method merged with bridge method: getRustHandle(Ljava/lang/Object;)Ljava/lang/Long; */
    @Override // uniffi.BaseFfiConverterType
    public Long getRustHandle(@NotNull InterfaceC2789AZh interfaceC2789AZh) {
        Intrinsics.checkNotNullParameter(interfaceC2789AZh, "");
        if (interfaceC2789AZh instanceof C2788AZg) {
            return Long.valueOf(((C2788AZg) interfaceC2789AZh).uniffiCloneHandle());
        }
        return null;
    }

    /* JADX DEBUG: Method merged with bridge method: createFromHandle(J)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterType
    public InterfaceC2789AZh createFromHandle(long j) {
        return new C2788AZg(C60184zxu.INSTANCE, j);
    }
}
