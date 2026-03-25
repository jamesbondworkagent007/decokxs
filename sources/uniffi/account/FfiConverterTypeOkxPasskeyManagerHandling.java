package uniffi.account;

import kotlin.jvm.internal.Intrinsics;
import o.C58881zSv;
import o.C60184zxu;
import o.C60230zyn;
import o.InterfaceC58880zSu;
import org.jetbrains.annotations.NotNull;
import uniffi.BaseFfiConverterType;

/* JADX INFO: loaded from: classes13.dex */
public final class FfiConverterTypeOkxPasskeyManagerHandling extends BaseFfiConverterType<InterfaceC58880zSu> {
    public static final int $stable = 0;
    public static final FfiConverterTypeOkxPasskeyManagerHandling INSTANCE = new FfiConverterTypeOkxPasskeyManagerHandling();

    private FfiConverterTypeOkxPasskeyManagerHandling() {
        super(C60230zyn.uniffiRustBuffer);
    }

    /* JADX DEBUG: Method merged with bridge method: getRustHandle(Ljava/lang/Object;)Ljava/lang/Long; */
    @Override // uniffi.BaseFfiConverterType
    public Long getRustHandle(@NotNull InterfaceC58880zSu interfaceC58880zSu) {
        Intrinsics.checkNotNullParameter(interfaceC58880zSu, "");
        if (interfaceC58880zSu instanceof C58881zSv) {
            return Long.valueOf(((C58881zSv) interfaceC58880zSu).uniffiCloneHandle());
        }
        return null;
    }

    /* JADX DEBUG: Method merged with bridge method: createFromHandle(J)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterType
    public InterfaceC58880zSu createFromHandle(long j) {
        return new C58881zSv(C60184zxu.INSTANCE, j);
    }
}
