package uniffi.lifecycle;

import kotlin.jvm.internal.Intrinsics;
import o.C2597ARw;
import o.C2692AVo;
import o.C60184zxu;
import o.InterfaceC2599ARy;
import org.jetbrains.annotations.NotNull;
import uniffi.BaseFfiConverterType;

/* JADX INFO: loaded from: classes17.dex */
public final class FfiConverterTypeCoreAppLinkHandler extends BaseFfiConverterType<InterfaceC2599ARy> {
    public static final int $stable = 0;
    public static final FfiConverterTypeCoreAppLinkHandler INSTANCE = new FfiConverterTypeCoreAppLinkHandler();

    private FfiConverterTypeCoreAppLinkHandler() {
        super(C2692AVo.uniffiRustBuffer);
    }

    /* JADX DEBUG: Method merged with bridge method: getRustHandle(Ljava/lang/Object;)Ljava/lang/Long; */
    @Override // uniffi.BaseFfiConverterType
    public Long getRustHandle(@NotNull InterfaceC2599ARy interfaceC2599ARy) {
        Intrinsics.checkNotNullParameter(interfaceC2599ARy, "");
        if (interfaceC2599ARy instanceof C2597ARw) {
            return Long.valueOf(((C2597ARw) interfaceC2599ARy).uniffiCloneHandle());
        }
        return null;
    }

    /* JADX DEBUG: Method merged with bridge method: createFromHandle(J)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterType
    public InterfaceC2599ARy createFromHandle(long j) {
        return new C2597ARw(C60184zxu.INSTANCE, j);
    }
}
