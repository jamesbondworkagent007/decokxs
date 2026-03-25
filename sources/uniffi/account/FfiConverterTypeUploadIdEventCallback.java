package uniffi.account;

import kotlin.jvm.internal.Intrinsics;
import o.C3181AhB;
import o.C60184zxu;
import o.C60230zyn;
import o.InterfaceC3182AhC;
import org.jetbrains.annotations.NotNull;
import uniffi.BaseFfiConverterType;

/* JADX INFO: loaded from: classes17.dex */
public final class FfiConverterTypeUploadIdEventCallback extends BaseFfiConverterType<InterfaceC3182AhC> {
    public static final int $stable = 0;
    public static final FfiConverterTypeUploadIdEventCallback INSTANCE = new FfiConverterTypeUploadIdEventCallback();

    private FfiConverterTypeUploadIdEventCallback() {
        super(C60230zyn.uniffiRustBuffer);
    }

    /* JADX DEBUG: Method merged with bridge method: getRustHandle(Ljava/lang/Object;)Ljava/lang/Long; */
    @Override // uniffi.BaseFfiConverterType
    public Long getRustHandle(@NotNull InterfaceC3182AhC interfaceC3182AhC) {
        Intrinsics.checkNotNullParameter(interfaceC3182AhC, "");
        if (interfaceC3182AhC instanceof C3181AhB) {
            return Long.valueOf(((C3181AhB) interfaceC3182AhC).uniffiCloneHandle());
        }
        return null;
    }

    /* JADX DEBUG: Method merged with bridge method: createFromHandle(J)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterType
    public InterfaceC3182AhC createFromHandle(long j) {
        return new C3181AhB(C60184zxu.INSTANCE, j);
    }
}
