package uniffi.account;

import kotlin.jvm.internal.Intrinsics;
import o.C58505zEw;
import o.C60184zxu;
import o.C60230zyn;
import o.InterfaceC58501zEs;
import org.jetbrains.annotations.NotNull;
import uniffi.BaseFfiConverterType;

/* JADX INFO: loaded from: classes17.dex */
public final class FfiConverterTypeLoginStateCallback extends BaseFfiConverterType<InterfaceC58501zEs> {
    public static final int $stable = 0;
    public static final FfiConverterTypeLoginStateCallback INSTANCE = new FfiConverterTypeLoginStateCallback();

    private FfiConverterTypeLoginStateCallback() {
        super(C60230zyn.uniffiRustBuffer);
    }

    /* JADX DEBUG: Method merged with bridge method: getRustHandle(Ljava/lang/Object;)Ljava/lang/Long; */
    @Override // uniffi.BaseFfiConverterType
    public Long getRustHandle(@NotNull InterfaceC58501zEs interfaceC58501zEs) {
        Intrinsics.checkNotNullParameter(interfaceC58501zEs, "");
        if (interfaceC58501zEs instanceof C58505zEw) {
            return Long.valueOf(((C58505zEw) interfaceC58501zEs).uniffiCloneHandle());
        }
        return null;
    }

    /* JADX DEBUG: Method merged with bridge method: createFromHandle(J)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterType
    public InterfaceC58501zEs createFromHandle(long j) {
        return new C58505zEw(C60184zxu.INSTANCE, j);
    }
}
