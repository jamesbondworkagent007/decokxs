package uniffi.app_state;

import kotlin.jvm.internal.Intrinsics;
import o.C3561AoK;
import o.C3567AoQ;
import o.C60184zxu;
import o.InterfaceC3563AoM;
import org.jetbrains.annotations.NotNull;
import uniffi.BaseFfiConverterType;

/* JADX INFO: loaded from: classes13.dex */
public final class FfiConverterTypeAppSupportInterface extends BaseFfiConverterType<InterfaceC3563AoM> {
    public static final int $stable = 0;
    public static final FfiConverterTypeAppSupportInterface INSTANCE = new FfiConverterTypeAppSupportInterface();

    private FfiConverterTypeAppSupportInterface() {
        super(C3567AoQ.uniffiRustBuffer);
    }

    /* JADX DEBUG: Method merged with bridge method: getRustHandle(Ljava/lang/Object;)Ljava/lang/Long; */
    @Override // uniffi.BaseFfiConverterType
    public Long getRustHandle(@NotNull InterfaceC3563AoM interfaceC3563AoM) {
        Intrinsics.checkNotNullParameter(interfaceC3563AoM, "");
        if (interfaceC3563AoM instanceof C3561AoK) {
            return Long.valueOf(((C3561AoK) interfaceC3563AoM).uniffiCloneHandle());
        }
        return null;
    }

    /* JADX DEBUG: Method merged with bridge method: createFromHandle(J)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterType
    public InterfaceC3563AoM createFromHandle(long j) {
        return new C3561AoK(C60184zxu.INSTANCE, j);
    }
}
