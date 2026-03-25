package uniffi.dex;

import kotlin.jvm.internal.Intrinsics;
import o.AAL;
import o.C2183ABy;
import o.C60184zxu;
import o.InterfaceC2179ABu;
import org.jetbrains.annotations.NotNull;
import uniffi.BaseFfiConverterType;

/* JADX INFO: loaded from: classes17.dex */
public final class FfiConverterTypeDexPoolInfoObserver extends BaseFfiConverterType<InterfaceC2179ABu> {
    public static final int $stable = 0;
    public static final FfiConverterTypeDexPoolInfoObserver INSTANCE = new FfiConverterTypeDexPoolInfoObserver();

    private FfiConverterTypeDexPoolInfoObserver() {
        super(AAL.uniffiRustBuffer);
    }

    /* JADX DEBUG: Method merged with bridge method: getRustHandle(Ljava/lang/Object;)Ljava/lang/Long; */
    @Override // uniffi.BaseFfiConverterType
    public Long getRustHandle(@NotNull InterfaceC2179ABu interfaceC2179ABu) {
        Intrinsics.checkNotNullParameter(interfaceC2179ABu, "");
        if (interfaceC2179ABu instanceof C2183ABy) {
            return Long.valueOf(((C2183ABy) interfaceC2179ABu).uniffiCloneHandle());
        }
        return null;
    }

    /* JADX DEBUG: Method merged with bridge method: createFromHandle(J)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterType
    public InterfaceC2179ABu createFromHandle(long j) {
        return new C2183ABy(C60184zxu.INSTANCE, j);
    }
}
