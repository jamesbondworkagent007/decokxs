package uniffi.analytics;

import kotlin.jvm.internal.Intrinsics;
import o.C3588Aol;
import o.C3599Aow;
import o.C60184zxu;
import o.InterfaceC3591Aoo;
import org.jetbrains.annotations.NotNull;
import uniffi.BaseFfiConverterType;

/* JADX INFO: loaded from: classes13.dex */
public final class FfiConverterTypeAnalyticsInterface extends BaseFfiConverterType<InterfaceC3591Aoo> {
    public static final int $stable = 0;
    public static final FfiConverterTypeAnalyticsInterface INSTANCE = new FfiConverterTypeAnalyticsInterface();

    private FfiConverterTypeAnalyticsInterface() {
        super(C3599Aow.uniffiRustBuffer);
    }

    /* JADX DEBUG: Method merged with bridge method: getRustHandle(Ljava/lang/Object;)Ljava/lang/Long; */
    @Override // uniffi.BaseFfiConverterType
    public Long getRustHandle(@NotNull InterfaceC3591Aoo interfaceC3591Aoo) {
        Intrinsics.checkNotNullParameter(interfaceC3591Aoo, "");
        if (interfaceC3591Aoo instanceof C3588Aol) {
            return Long.valueOf(((C3588Aol) interfaceC3591Aoo).uniffiCloneHandle());
        }
        return null;
    }

    /* JADX DEBUG: Method merged with bridge method: createFromHandle(J)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterType
    public InterfaceC3591Aoo createFromHandle(long j) {
        return new C3588Aol(C60184zxu.INSTANCE, j);
    }
}
