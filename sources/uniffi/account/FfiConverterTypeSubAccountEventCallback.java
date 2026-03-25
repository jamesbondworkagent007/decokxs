package uniffi.account;

import kotlin.jvm.internal.Intrinsics;
import o.C3123Afx;
import o.C60184zxu;
import o.C60230zyn;
import o.InterfaceC3119Aft;
import org.jetbrains.annotations.NotNull;
import uniffi.BaseFfiConverterType;

/* JADX INFO: loaded from: classes17.dex */
public final class FfiConverterTypeSubAccountEventCallback extends BaseFfiConverterType<InterfaceC3119Aft> {
    public static final int $stable = 0;
    public static final FfiConverterTypeSubAccountEventCallback INSTANCE = new FfiConverterTypeSubAccountEventCallback();

    private FfiConverterTypeSubAccountEventCallback() {
        super(C60230zyn.uniffiRustBuffer);
    }

    /* JADX DEBUG: Method merged with bridge method: getRustHandle(Ljava/lang/Object;)Ljava/lang/Long; */
    @Override // uniffi.BaseFfiConverterType
    public Long getRustHandle(@NotNull InterfaceC3119Aft interfaceC3119Aft) {
        Intrinsics.checkNotNullParameter(interfaceC3119Aft, "");
        if (interfaceC3119Aft instanceof C3123Afx) {
            return Long.valueOf(((C3123Afx) interfaceC3119Aft).uniffiCloneHandle());
        }
        return null;
    }

    /* JADX DEBUG: Method merged with bridge method: createFromHandle(J)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterType
    public InterfaceC3119Aft createFromHandle(long j) {
        return new C3123Afx(C60184zxu.INSTANCE, j);
    }
}
