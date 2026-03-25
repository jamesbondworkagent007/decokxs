package uniffi.network;

import kotlin.jvm.internal.Intrinsics;
import o.AZM;
import o.AZR;
import o.C4298Bav;
import o.C60184zxu;
import org.jetbrains.annotations.NotNull;
import uniffi.BaseFfiConverterType;

/* JADX INFO: loaded from: classes17.dex */
public final class FfiConverterTypeNativeMessageSendable extends BaseFfiConverterType<AZM> {
    public static final int $stable = 0;
    public static final FfiConverterTypeNativeMessageSendable INSTANCE = new FfiConverterTypeNativeMessageSendable();

    private FfiConverterTypeNativeMessageSendable() {
        super(C4298Bav.uniffiRustBuffer);
    }

    /* JADX DEBUG: Method merged with bridge method: getRustHandle(Ljava/lang/Object;)Ljava/lang/Long; */
    @Override // uniffi.BaseFfiConverterType
    public Long getRustHandle(@NotNull AZM azm) {
        Intrinsics.checkNotNullParameter(azm, "");
        if (azm instanceof AZR) {
            return Long.valueOf(((AZR) azm).uniffiCloneHandle());
        }
        return null;
    }

    /* JADX DEBUG: Method merged with bridge method: createFromHandle(J)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterType
    public AZM createFromHandle(long j) {
        return new AZR(C60184zxu.INSTANCE, j);
    }
}
