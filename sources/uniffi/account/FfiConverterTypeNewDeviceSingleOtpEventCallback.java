package uniffi.account;

import kotlin.jvm.internal.Intrinsics;
import o.C60184zxu;
import o.C60230zyn;
import o.zMQ;
import o.zMU;
import org.jetbrains.annotations.NotNull;
import uniffi.BaseFfiConverterType;

/* JADX INFO: loaded from: classes17.dex */
public final class FfiConverterTypeNewDeviceSingleOtpEventCallback extends BaseFfiConverterType<zMQ> {
    public static final int $stable = 0;
    public static final FfiConverterTypeNewDeviceSingleOtpEventCallback INSTANCE = new FfiConverterTypeNewDeviceSingleOtpEventCallback();

    private FfiConverterTypeNewDeviceSingleOtpEventCallback() {
        super(C60230zyn.uniffiRustBuffer);
    }

    /* JADX DEBUG: Method merged with bridge method: getRustHandle(Ljava/lang/Object;)Ljava/lang/Long; */
    @Override // uniffi.BaseFfiConverterType
    public Long getRustHandle(@NotNull zMQ zmq) {
        Intrinsics.checkNotNullParameter(zmq, "");
        if (zmq instanceof zMU) {
            return Long.valueOf(((zMU) zmq).uniffiCloneHandle());
        }
        return null;
    }

    /* JADX DEBUG: Method merged with bridge method: createFromHandle(J)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterType
    public zMQ createFromHandle(long j) {
        return new zMU(C60184zxu.INSTANCE, j);
    }
}
