package uniffi.user;

import kotlin.jvm.internal.Intrinsics;
import o.BzK;
import o.C5013Bzj;
import o.C60184zxu;
import o.InterfaceC5017Bzn;
import org.jetbrains.annotations.NotNull;
import uniffi.BaseFfiConverterType;

/* JADX INFO: loaded from: classes14.dex */
public final class FfiConverterTypeUserDataSource extends BaseFfiConverterType<InterfaceC5017Bzn> {
    public static final int $stable = 0;
    public static final FfiConverterTypeUserDataSource INSTANCE = new FfiConverterTypeUserDataSource();

    private FfiConverterTypeUserDataSource() {
        super(BzK.uniffiRustBuffer);
    }

    /* JADX DEBUG: Method merged with bridge method: getRustHandle(Ljava/lang/Object;)Ljava/lang/Long; */
    @Override // uniffi.BaseFfiConverterType
    public Long getRustHandle(@NotNull InterfaceC5017Bzn interfaceC5017Bzn) {
        Intrinsics.checkNotNullParameter(interfaceC5017Bzn, "");
        if (interfaceC5017Bzn instanceof C5013Bzj) {
            return Long.valueOf(((C5013Bzj) interfaceC5017Bzn).uniffiCloneHandle());
        }
        return null;
    }

    /* JADX DEBUG: Method merged with bridge method: createFromHandle(J)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterType
    public InterfaceC5017Bzn createFromHandle(long j) {
        return new C5013Bzj(C60184zxu.INSTANCE, j);
    }
}
