package uniffi.lifecycle;

import kotlin.jvm.internal.Intrinsics;
import o.C2606ASf;
import o.C2692AVo;
import o.C60184zxu;
import o.InterfaceC2607ASg;
import org.jetbrains.annotations.NotNull;
import uniffi.BaseFfiConverterType;

/* JADX INFO: loaded from: classes17.dex */
public final class FfiConverterTypeCoreDeeplinkHandler extends BaseFfiConverterType<InterfaceC2607ASg> {
    public static final int $stable = 0;
    public static final FfiConverterTypeCoreDeeplinkHandler INSTANCE = new FfiConverterTypeCoreDeeplinkHandler();

    private FfiConverterTypeCoreDeeplinkHandler() {
        super(C2692AVo.uniffiRustBuffer);
    }

    /* JADX DEBUG: Method merged with bridge method: getRustHandle(Ljava/lang/Object;)Ljava/lang/Long; */
    @Override // uniffi.BaseFfiConverterType
    public Long getRustHandle(@NotNull InterfaceC2607ASg interfaceC2607ASg) {
        Intrinsics.checkNotNullParameter(interfaceC2607ASg, "");
        if (interfaceC2607ASg instanceof C2606ASf) {
            return Long.valueOf(((C2606ASf) interfaceC2607ASg).uniffiCloneHandle());
        }
        return null;
    }

    /* JADX DEBUG: Method merged with bridge method: createFromHandle(J)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterType
    public InterfaceC2607ASg createFromHandle(long j) {
        return new C2606ASf(C60184zxu.INSTANCE, j);
    }
}
