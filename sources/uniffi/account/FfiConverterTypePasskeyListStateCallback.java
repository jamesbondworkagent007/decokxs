package uniffi.account;

import kotlin.jvm.internal.Intrinsics;
import o.C58982zWs;
import o.C60184zxu;
import o.C60230zyn;
import o.InterfaceC58984zWu;
import org.jetbrains.annotations.NotNull;
import uniffi.BaseFfiConverterType;

/* JADX INFO: loaded from: classes17.dex */
public final class FfiConverterTypePasskeyListStateCallback extends BaseFfiConverterType<InterfaceC58984zWu> {
    public static final int $stable = 0;
    public static final FfiConverterTypePasskeyListStateCallback INSTANCE = new FfiConverterTypePasskeyListStateCallback();

    private FfiConverterTypePasskeyListStateCallback() {
        super(C60230zyn.uniffiRustBuffer);
    }

    /* JADX DEBUG: Method merged with bridge method: getRustHandle(Ljava/lang/Object;)Ljava/lang/Long; */
    @Override // uniffi.BaseFfiConverterType
    public Long getRustHandle(@NotNull InterfaceC58984zWu interfaceC58984zWu) {
        Intrinsics.checkNotNullParameter(interfaceC58984zWu, "");
        if (interfaceC58984zWu instanceof C58982zWs) {
            return Long.valueOf(((C58982zWs) interfaceC58984zWu).uniffiCloneHandle());
        }
        return null;
    }

    /* JADX DEBUG: Method merged with bridge method: createFromHandle(J)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterType
    public InterfaceC58984zWu createFromHandle(long j) {
        return new C58982zWs(C60184zxu.INSTANCE, j);
    }
}
