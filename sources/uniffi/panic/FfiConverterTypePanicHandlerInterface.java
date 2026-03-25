package uniffi.panic;

import kotlin.jvm.internal.Intrinsics;
import o.C4505Bgo;
import o.C4513Bgw;
import o.C60184zxu;
import o.InterfaceC4503Bgm;
import org.jetbrains.annotations.NotNull;
import uniffi.BaseFfiConverterType;

/* JADX INFO: loaded from: classes13.dex */
public final class FfiConverterTypePanicHandlerInterface extends BaseFfiConverterType<InterfaceC4503Bgm> {
    public static final int $stable = 0;
    public static final FfiConverterTypePanicHandlerInterface INSTANCE = new FfiConverterTypePanicHandlerInterface();

    private FfiConverterTypePanicHandlerInterface() {
        super(C4513Bgw.uniffiRustBuffer);
    }

    /* JADX DEBUG: Method merged with bridge method: getRustHandle(Ljava/lang/Object;)Ljava/lang/Long; */
    @Override // uniffi.BaseFfiConverterType
    public Long getRustHandle(@NotNull InterfaceC4503Bgm interfaceC4503Bgm) {
        Intrinsics.checkNotNullParameter(interfaceC4503Bgm, "");
        if (interfaceC4503Bgm instanceof C4505Bgo) {
            return Long.valueOf(((C4505Bgo) interfaceC4503Bgm).uniffiCloneHandle());
        }
        return null;
    }

    /* JADX DEBUG: Method merged with bridge method: createFromHandle(J)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterType
    public InterfaceC4503Bgm createFromHandle(long j) {
        return new C4505Bgo(C60184zxu.INSTANCE, j);
    }
}
