package uniffi.lifecycle;

import kotlin.jvm.internal.Intrinsics;
import o.C2683AVf;
import o.C2692AVo;
import o.C60184zxu;
import o.InterfaceC2678AVa;
import org.jetbrains.annotations.NotNull;
import uniffi.BaseFfiConverterType;

/* JADX INFO: loaded from: classes13.dex */
public final class FfiConverterTypeCoreLinkExecutionHelper extends BaseFfiConverterType<InterfaceC2678AVa> {
    public static final int $stable = 0;
    public static final FfiConverterTypeCoreLinkExecutionHelper INSTANCE = new FfiConverterTypeCoreLinkExecutionHelper();

    private FfiConverterTypeCoreLinkExecutionHelper() {
        super(C2692AVo.uniffiRustBuffer);
    }

    /* JADX DEBUG: Method merged with bridge method: getRustHandle(Ljava/lang/Object;)Ljava/lang/Long; */
    @Override // uniffi.BaseFfiConverterType
    public Long getRustHandle(@NotNull InterfaceC2678AVa interfaceC2678AVa) {
        Intrinsics.checkNotNullParameter(interfaceC2678AVa, "");
        if (interfaceC2678AVa instanceof C2683AVf) {
            return Long.valueOf(((C2683AVf) interfaceC2678AVa).uniffiCloneHandle());
        }
        return null;
    }

    /* JADX DEBUG: Method merged with bridge method: createFromHandle(J)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterType
    public InterfaceC2678AVa createFromHandle(long j) {
        return new C2683AVf(C60184zxu.INSTANCE, j);
    }
}
