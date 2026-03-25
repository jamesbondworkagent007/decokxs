package uniffi.network;

import kotlin.jvm.internal.Intrinsics;
import o.C4298Bav;
import o.C4311BbH;
import o.C60184zxu;
import o.InterfaceC4310BbG;
import org.jetbrains.annotations.NotNull;
import uniffi.BaseFfiConverterType;

/* JADX INFO: loaded from: classes13.dex */
public final class FfiConverterTypePlatformDohManager extends BaseFfiConverterType<InterfaceC4310BbG> {
    public static final int $stable = 0;
    public static final FfiConverterTypePlatformDohManager INSTANCE = new FfiConverterTypePlatformDohManager();

    private FfiConverterTypePlatformDohManager() {
        super(C4298Bav.uniffiRustBuffer);
    }

    /* JADX DEBUG: Method merged with bridge method: getRustHandle(Ljava/lang/Object;)Ljava/lang/Long; */
    @Override // uniffi.BaseFfiConverterType
    public Long getRustHandle(@NotNull InterfaceC4310BbG interfaceC4310BbG) {
        Intrinsics.checkNotNullParameter(interfaceC4310BbG, "");
        if (interfaceC4310BbG instanceof C4311BbH) {
            return Long.valueOf(((C4311BbH) interfaceC4310BbG).uniffiCloneHandle());
        }
        return null;
    }

    /* JADX DEBUG: Method merged with bridge method: createFromHandle(J)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterType
    public InterfaceC4310BbG createFromHandle(long j) {
        return new C4311BbH(C60184zxu.INSTANCE, j);
    }
}
