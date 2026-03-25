package uniffi.account;

import kotlin.jvm.internal.Intrinsics;
import o.C58418zBq;
import o.C60184zxu;
import o.C60230zyn;
import o.InterfaceC58416zBo;
import org.jetbrains.annotations.NotNull;
import uniffi.BaseFfiConverterType;

/* JADX INFO: loaded from: classes17.dex */
public final class FfiConverterTypeLinkConfirmEventCallback extends BaseFfiConverterType<InterfaceC58416zBo> {
    public static final int $stable = 0;
    public static final FfiConverterTypeLinkConfirmEventCallback INSTANCE = new FfiConverterTypeLinkConfirmEventCallback();

    private FfiConverterTypeLinkConfirmEventCallback() {
        super(C60230zyn.uniffiRustBuffer);
    }

    /* JADX DEBUG: Method merged with bridge method: getRustHandle(Ljava/lang/Object;)Ljava/lang/Long; */
    @Override // uniffi.BaseFfiConverterType
    public Long getRustHandle(@NotNull InterfaceC58416zBo interfaceC58416zBo) {
        Intrinsics.checkNotNullParameter(interfaceC58416zBo, "");
        if (interfaceC58416zBo instanceof C58418zBq) {
            return Long.valueOf(((C58418zBq) interfaceC58416zBo).uniffiCloneHandle());
        }
        return null;
    }

    /* JADX DEBUG: Method merged with bridge method: createFromHandle(J)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterType
    public InterfaceC58416zBo createFromHandle(long j) {
        return new C58418zBq(C60184zxu.INSTANCE, j);
    }
}
