package uniffi.account;

import kotlin.jvm.internal.Intrinsics;
import o.C58438zCj;
import o.C60184zxu;
import o.C60230zyn;
import o.InterfaceC58435zCg;
import org.jetbrains.annotations.NotNull;
import uniffi.BaseFfiConverterType;

/* JADX INFO: loaded from: classes17.dex */
public final class FfiConverterTypeLinkResultEventCallback extends BaseFfiConverterType<InterfaceC58435zCg> {
    public static final int $stable = 0;
    public static final FfiConverterTypeLinkResultEventCallback INSTANCE = new FfiConverterTypeLinkResultEventCallback();

    private FfiConverterTypeLinkResultEventCallback() {
        super(C60230zyn.uniffiRustBuffer);
    }

    /* JADX DEBUG: Method merged with bridge method: getRustHandle(Ljava/lang/Object;)Ljava/lang/Long; */
    @Override // uniffi.BaseFfiConverterType
    public Long getRustHandle(@NotNull InterfaceC58435zCg interfaceC58435zCg) {
        Intrinsics.checkNotNullParameter(interfaceC58435zCg, "");
        if (interfaceC58435zCg instanceof C58438zCj) {
            return Long.valueOf(((C58438zCj) interfaceC58435zCg).uniffiCloneHandle());
        }
        return null;
    }

    /* JADX DEBUG: Method merged with bridge method: createFromHandle(J)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterType
    public InterfaceC58435zCg createFromHandle(long j) {
        return new C58438zCj(C60184zxu.INSTANCE, j);
    }
}
