package uniffi.upgrade;

import kotlin.jvm.internal.Intrinsics;
import o.BuB;
import o.C4847Btf;
import o.C60184zxu;
import o.InterfaceC4845Btd;
import org.jetbrains.annotations.NotNull;
import uniffi.BaseFfiConverterType;

/* JADX INFO: loaded from: classes17.dex */
public final class FfiConverterTypeOKNativeTaskOKUserWithGetUserError extends BaseFfiConverterType<InterfaceC4845Btd> {
    public static final int $stable = 0;
    public static final FfiConverterTypeOKNativeTaskOKUserWithGetUserError INSTANCE = new FfiConverterTypeOKNativeTaskOKUserWithGetUserError();

    private FfiConverterTypeOKNativeTaskOKUserWithGetUserError() {
        super(BuB.uniffiRustBuffer);
    }

    /* JADX DEBUG: Method merged with bridge method: getRustHandle(Ljava/lang/Object;)Ljava/lang/Long; */
    @Override // uniffi.BaseFfiConverterType
    public Long getRustHandle(@NotNull InterfaceC4845Btd interfaceC4845Btd) {
        Intrinsics.checkNotNullParameter(interfaceC4845Btd, "");
        if (interfaceC4845Btd instanceof C4847Btf) {
            return Long.valueOf(((C4847Btf) interfaceC4845Btd).uniffiCloneHandle());
        }
        return null;
    }

    /* JADX DEBUG: Method merged with bridge method: createFromHandle(J)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterType
    public InterfaceC4845Btd createFromHandle(long j) {
        return new C4847Btf(C60184zxu.INSTANCE, j);
    }
}
