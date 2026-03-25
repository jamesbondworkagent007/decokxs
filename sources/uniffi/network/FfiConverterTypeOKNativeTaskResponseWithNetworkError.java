package uniffi.network;

import kotlin.jvm.internal.Intrinsics;
import o.C4266BaP;
import o.C4298Bav;
import o.C60184zxu;
import o.InterfaceC4267BaQ;
import org.jetbrains.annotations.NotNull;
import uniffi.BaseFfiConverterType;

/* JADX INFO: loaded from: classes17.dex */
public final class FfiConverterTypeOKNativeTaskResponseWithNetworkError extends BaseFfiConverterType<InterfaceC4267BaQ> {
    public static final int $stable = 0;
    public static final FfiConverterTypeOKNativeTaskResponseWithNetworkError INSTANCE = new FfiConverterTypeOKNativeTaskResponseWithNetworkError();

    private FfiConverterTypeOKNativeTaskResponseWithNetworkError() {
        super(C4298Bav.uniffiRustBuffer);
    }

    /* JADX DEBUG: Method merged with bridge method: getRustHandle(Ljava/lang/Object;)Ljava/lang/Long; */
    @Override // uniffi.BaseFfiConverterType
    public Long getRustHandle(@NotNull InterfaceC4267BaQ interfaceC4267BaQ) {
        Intrinsics.checkNotNullParameter(interfaceC4267BaQ, "");
        if (interfaceC4267BaQ instanceof C4266BaP) {
            return Long.valueOf(((C4266BaP) interfaceC4267BaQ).uniffiCloneHandle());
        }
        return null;
    }

    /* JADX DEBUG: Method merged with bridge method: createFromHandle(J)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterType
    public InterfaceC4267BaQ createFromHandle(long j) {
        return new C4266BaP(C60184zxu.INSTANCE, j);
    }
}
