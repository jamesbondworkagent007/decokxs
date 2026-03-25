package uniffi.lifecycle;

import kotlin.jvm.internal.Intrinsics;
import o.C2614ASn;
import o.C2692AVo;
import o.C60184zxu;
import o.InterfaceC2618ASr;
import org.jetbrains.annotations.NotNull;
import uniffi.BaseFfiConverterType;

/* JADX INFO: loaded from: classes13.dex */
public final class FfiConverterTypeCoreDeeplinkInfoFetcher extends BaseFfiConverterType<InterfaceC2618ASr> {
    public static final int $stable = 0;
    public static final FfiConverterTypeCoreDeeplinkInfoFetcher INSTANCE = new FfiConverterTypeCoreDeeplinkInfoFetcher();

    private FfiConverterTypeCoreDeeplinkInfoFetcher() {
        super(C2692AVo.uniffiRustBuffer);
    }

    /* JADX DEBUG: Method merged with bridge method: getRustHandle(Ljava/lang/Object;)Ljava/lang/Long; */
    @Override // uniffi.BaseFfiConverterType
    public Long getRustHandle(@NotNull InterfaceC2618ASr interfaceC2618ASr) {
        Intrinsics.checkNotNullParameter(interfaceC2618ASr, "");
        if (interfaceC2618ASr instanceof C2614ASn) {
            return Long.valueOf(((C2614ASn) interfaceC2618ASr).uniffiCloneHandle());
        }
        return null;
    }

    /* JADX DEBUG: Method merged with bridge method: createFromHandle(J)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterType
    public InterfaceC2618ASr createFromHandle(long j) {
        return new C2614ASn(C60184zxu.INSTANCE, j);
    }
}
