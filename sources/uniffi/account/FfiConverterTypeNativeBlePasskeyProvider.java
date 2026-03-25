package uniffi.account;

import kotlin.jvm.internal.Intrinsics;
import o.C60184zxu;
import o.C60230zyn;
import o.zHW;
import o.zHY;
import org.jetbrains.annotations.NotNull;
import uniffi.BaseFfiConverterType;

/* JADX INFO: loaded from: classes13.dex */
public final class FfiConverterTypeNativeBlePasskeyProvider extends BaseFfiConverterType<zHY> {
    public static final int $stable = 0;
    public static final FfiConverterTypeNativeBlePasskeyProvider INSTANCE = new FfiConverterTypeNativeBlePasskeyProvider();

    private FfiConverterTypeNativeBlePasskeyProvider() {
        super(C60230zyn.uniffiRustBuffer);
    }

    /* JADX DEBUG: Method merged with bridge method: getRustHandle(Ljava/lang/Object;)Ljava/lang/Long; */
    @Override // uniffi.BaseFfiConverterType
    public Long getRustHandle(@NotNull zHY zhy) {
        Intrinsics.checkNotNullParameter(zhy, "");
        if (zhy instanceof zHW) {
            return Long.valueOf(((zHW) zhy).uniffiCloneHandle());
        }
        return null;
    }

    /* JADX DEBUG: Method merged with bridge method: createFromHandle(J)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterType
    public zHY createFromHandle(long j) {
        return new zHW(C60184zxu.INSTANCE, j);
    }
}
