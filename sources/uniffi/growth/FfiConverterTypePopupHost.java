package uniffi.growth;

import kotlin.jvm.internal.Intrinsics;
import o.ANQ;
import o.C2521AOy;
import o.C60184zxu;
import o.InterfaceC2518AOv;
import org.jetbrains.annotations.NotNull;
import uniffi.BaseFfiConverterType;

/* JADX INFO: loaded from: classes17.dex */
public final class FfiConverterTypePopupHost extends BaseFfiConverterType<InterfaceC2518AOv> {
    public static final int $stable = 0;
    public static final FfiConverterTypePopupHost INSTANCE = new FfiConverterTypePopupHost();

    private FfiConverterTypePopupHost() {
        super(ANQ.uniffiRustBuffer);
    }

    /* JADX DEBUG: Method merged with bridge method: getRustHandle(Ljava/lang/Object;)Ljava/lang/Long; */
    @Override // uniffi.BaseFfiConverterType
    public Long getRustHandle(@NotNull InterfaceC2518AOv interfaceC2518AOv) {
        Intrinsics.checkNotNullParameter(interfaceC2518AOv, "");
        if (interfaceC2518AOv instanceof C2521AOy) {
            return Long.valueOf(((C2521AOy) interfaceC2518AOv).uniffiCloneHandle());
        }
        return null;
    }

    /* JADX DEBUG: Method merged with bridge method: createFromHandle(J)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterType
    public InterfaceC2518AOv createFromHandle(long j) {
        return new C2521AOy(C60184zxu.INSTANCE, j);
    }
}
