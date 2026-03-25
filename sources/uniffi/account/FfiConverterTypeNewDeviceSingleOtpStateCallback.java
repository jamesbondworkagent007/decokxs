package uniffi.account;

import kotlin.jvm.internal.Intrinsics;
import o.C58743zNr;
import o.C60184zxu;
import o.C60230zyn;
import o.InterfaceC58745zNt;
import org.jetbrains.annotations.NotNull;
import uniffi.BaseFfiConverterType;

/* JADX INFO: loaded from: classes17.dex */
public final class FfiConverterTypeNewDeviceSingleOtpStateCallback extends BaseFfiConverterType<InterfaceC58745zNt> {
    public static final int $stable = 0;
    public static final FfiConverterTypeNewDeviceSingleOtpStateCallback INSTANCE = new FfiConverterTypeNewDeviceSingleOtpStateCallback();

    private FfiConverterTypeNewDeviceSingleOtpStateCallback() {
        super(C60230zyn.uniffiRustBuffer);
    }

    /* JADX DEBUG: Method merged with bridge method: getRustHandle(Ljava/lang/Object;)Ljava/lang/Long; */
    @Override // uniffi.BaseFfiConverterType
    public Long getRustHandle(@NotNull InterfaceC58745zNt interfaceC58745zNt) {
        Intrinsics.checkNotNullParameter(interfaceC58745zNt, "");
        if (interfaceC58745zNt instanceof C58743zNr) {
            return Long.valueOf(((C58743zNr) interfaceC58745zNt).uniffiCloneHandle());
        }
        return null;
    }

    /* JADX DEBUG: Method merged with bridge method: createFromHandle(J)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterType
    public InterfaceC58745zNt createFromHandle(long j) {
        return new C58743zNr(C60184zxu.INSTANCE, j);
    }
}
