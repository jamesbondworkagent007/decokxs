package uniffi.account;

import kotlin.jvm.internal.Intrinsics;
import o.C60184zxu;
import o.C60230zyn;
import o.InterfaceC58561zGy;
import o.zGC;
import org.jetbrains.annotations.NotNull;
import uniffi.BaseFfiConverterType;

/* JADX INFO: loaded from: classes17.dex */
public final class FfiConverterTypeMfaPasskeyStateCallback extends BaseFfiConverterType<InterfaceC58561zGy> {
    public static final int $stable = 0;
    public static final FfiConverterTypeMfaPasskeyStateCallback INSTANCE = new FfiConverterTypeMfaPasskeyStateCallback();

    private FfiConverterTypeMfaPasskeyStateCallback() {
        super(C60230zyn.uniffiRustBuffer);
    }

    /* JADX DEBUG: Method merged with bridge method: getRustHandle(Ljava/lang/Object;)Ljava/lang/Long; */
    @Override // uniffi.BaseFfiConverterType
    public Long getRustHandle(@NotNull InterfaceC58561zGy interfaceC58561zGy) {
        Intrinsics.checkNotNullParameter(interfaceC58561zGy, "");
        if (interfaceC58561zGy instanceof zGC) {
            return Long.valueOf(((zGC) interfaceC58561zGy).uniffiCloneHandle());
        }
        return null;
    }

    /* JADX DEBUG: Method merged with bridge method: createFromHandle(J)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterType
    public InterfaceC58561zGy createFromHandle(long j) {
        return new zGC(C60184zxu.INSTANCE, j);
    }
}
