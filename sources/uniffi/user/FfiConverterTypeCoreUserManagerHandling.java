package uniffi.user;

import kotlin.jvm.internal.Intrinsics;
import o.BzK;
import o.C4971Bxv;
import o.C60184zxu;
import o.InterfaceC4968Bxs;
import org.jetbrains.annotations.NotNull;
import uniffi.BaseFfiConverterType;

/* JADX INFO: loaded from: classes14.dex */
public final class FfiConverterTypeCoreUserManagerHandling extends BaseFfiConverterType<InterfaceC4968Bxs> {
    public static final int $stable = 0;
    public static final FfiConverterTypeCoreUserManagerHandling INSTANCE = new FfiConverterTypeCoreUserManagerHandling();

    private FfiConverterTypeCoreUserManagerHandling() {
        super(BzK.uniffiRustBuffer);
    }

    /* JADX DEBUG: Method merged with bridge method: getRustHandle(Ljava/lang/Object;)Ljava/lang/Long; */
    @Override // uniffi.BaseFfiConverterType
    public Long getRustHandle(@NotNull InterfaceC4968Bxs interfaceC4968Bxs) {
        Intrinsics.checkNotNullParameter(interfaceC4968Bxs, "");
        if (interfaceC4968Bxs instanceof C4971Bxv) {
            return Long.valueOf(((C4971Bxv) interfaceC4968Bxs).uniffiCloneHandle());
        }
        return null;
    }

    /* JADX DEBUG: Method merged with bridge method: createFromHandle(J)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterType
    public InterfaceC4968Bxs createFromHandle(long j) {
        return new C4971Bxv(C60184zxu.INSTANCE, j);
    }
}
