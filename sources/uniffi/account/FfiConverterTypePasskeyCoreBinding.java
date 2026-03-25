package uniffi.account;

import kotlin.jvm.internal.Intrinsics;
import o.C58956zVs;
import o.C60184zxu;
import o.C60230zyn;
import o.InterfaceC58955zVr;
import org.jetbrains.annotations.NotNull;
import uniffi.BaseFfiConverterType;

/* JADX INFO: loaded from: classes17.dex */
public final class FfiConverterTypePasskeyCoreBinding extends BaseFfiConverterType<InterfaceC58955zVr> {
    public static final int $stable = 0;
    public static final FfiConverterTypePasskeyCoreBinding INSTANCE = new FfiConverterTypePasskeyCoreBinding();

    private FfiConverterTypePasskeyCoreBinding() {
        super(C60230zyn.uniffiRustBuffer);
    }

    /* JADX DEBUG: Method merged with bridge method: getRustHandle(Ljava/lang/Object;)Ljava/lang/Long; */
    @Override // uniffi.BaseFfiConverterType
    public Long getRustHandle(@NotNull InterfaceC58955zVr interfaceC58955zVr) {
        Intrinsics.checkNotNullParameter(interfaceC58955zVr, "");
        if (interfaceC58955zVr instanceof C58956zVs) {
            return Long.valueOf(((C58956zVs) interfaceC58955zVr).uniffiCloneHandle());
        }
        return null;
    }

    /* JADX DEBUG: Method merged with bridge method: createFromHandle(J)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterType
    public InterfaceC58955zVr createFromHandle(long j) {
        return new C58956zVs(C60184zxu.INSTANCE, j);
    }
}
