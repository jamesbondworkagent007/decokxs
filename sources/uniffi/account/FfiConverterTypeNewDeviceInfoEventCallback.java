package uniffi.account;

import kotlin.jvm.internal.Intrinsics;
import o.C60184zxu;
import o.C60230zyn;
import o.zKW;
import o.zKX;
import org.jetbrains.annotations.NotNull;
import uniffi.BaseFfiConverterType;

/* JADX INFO: loaded from: classes17.dex */
public final class FfiConverterTypeNewDeviceInfoEventCallback extends BaseFfiConverterType<zKW> {
    public static final int $stable = 0;
    public static final FfiConverterTypeNewDeviceInfoEventCallback INSTANCE = new FfiConverterTypeNewDeviceInfoEventCallback();

    private FfiConverterTypeNewDeviceInfoEventCallback() {
        super(C60230zyn.uniffiRustBuffer);
    }

    /* JADX DEBUG: Method merged with bridge method: getRustHandle(Ljava/lang/Object;)Ljava/lang/Long; */
    @Override // uniffi.BaseFfiConverterType
    public Long getRustHandle(@NotNull zKW zkw) {
        Intrinsics.checkNotNullParameter(zkw, "");
        if (zkw instanceof zKX) {
            return Long.valueOf(((zKX) zkw).uniffiCloneHandle());
        }
        return null;
    }

    /* JADX DEBUG: Method merged with bridge method: createFromHandle(J)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterType
    public zKW createFromHandle(long j) {
        return new zKX(C60184zxu.INSTANCE, j);
    }
}
