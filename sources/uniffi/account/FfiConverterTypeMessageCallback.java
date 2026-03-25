package uniffi.account;

import kotlin.jvm.internal.Intrinsics;
import o.C60184zxu;
import o.C60230zyn;
import o.zED;
import o.zEE;
import org.jetbrains.annotations.NotNull;
import uniffi.BaseFfiConverterType;

/* JADX INFO: loaded from: classes17.dex */
public final class FfiConverterTypeMessageCallback extends BaseFfiConverterType<zEE> {
    public static final int $stable = 0;
    public static final FfiConverterTypeMessageCallback INSTANCE = new FfiConverterTypeMessageCallback();

    private FfiConverterTypeMessageCallback() {
        super(C60230zyn.uniffiRustBuffer);
    }

    /* JADX DEBUG: Method merged with bridge method: getRustHandle(Ljava/lang/Object;)Ljava/lang/Long; */
    @Override // uniffi.BaseFfiConverterType
    public Long getRustHandle(@NotNull zEE zee) {
        Intrinsics.checkNotNullParameter(zee, "");
        if (zee instanceof zED) {
            return Long.valueOf(((zED) zee).uniffiCloneHandle());
        }
        return null;
    }

    /* JADX DEBUG: Method merged with bridge method: createFromHandle(J)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterType
    public zEE createFromHandle(long j) {
        return new zED(C60184zxu.INSTANCE, j);
    }
}
