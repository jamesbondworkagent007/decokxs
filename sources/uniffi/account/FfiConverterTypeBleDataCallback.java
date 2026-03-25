package uniffi.account;

import kotlin.jvm.internal.Intrinsics;
import o.C60184zxu;
import o.C60230zyn;
import o.C60272zzc;
import o.InterfaceC60216zyZ;
import org.jetbrains.annotations.NotNull;
import uniffi.BaseFfiConverterType;

/* JADX INFO: loaded from: classes17.dex */
public final class FfiConverterTypeBleDataCallback extends BaseFfiConverterType<InterfaceC60216zyZ> {
    public static final int $stable = 0;
    public static final FfiConverterTypeBleDataCallback INSTANCE = new FfiConverterTypeBleDataCallback();

    private FfiConverterTypeBleDataCallback() {
        super(C60230zyn.uniffiRustBuffer);
    }

    /* JADX DEBUG: Method merged with bridge method: getRustHandle(Ljava/lang/Object;)Ljava/lang/Long; */
    @Override // uniffi.BaseFfiConverterType
    public Long getRustHandle(@NotNull InterfaceC60216zyZ interfaceC60216zyZ) {
        Intrinsics.checkNotNullParameter(interfaceC60216zyZ, "");
        if (interfaceC60216zyZ instanceof C60272zzc) {
            return Long.valueOf(((C60272zzc) interfaceC60216zyZ).uniffiCloneHandle());
        }
        return null;
    }

    /* JADX DEBUG: Method merged with bridge method: createFromHandle(J)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterType
    public InterfaceC60216zyZ createFromHandle(long j) {
        return new C60272zzc(C60184zxu.INSTANCE, j);
    }
}
