package uniffi.user;

import kotlin.jvm.internal.Intrinsics;
import o.BzA;
import o.BzC;
import o.BzK;
import o.C60184zxu;
import org.jetbrains.annotations.NotNull;
import uniffi.BaseFfiConverterType;

/* JADX INFO: loaded from: classes17.dex */
public final class FfiConverterTypeUserInfoEventCallback extends BaseFfiConverterType<BzC> {
    public static final int $stable = 0;
    public static final FfiConverterTypeUserInfoEventCallback INSTANCE = new FfiConverterTypeUserInfoEventCallback();

    private FfiConverterTypeUserInfoEventCallback() {
        super(BzK.uniffiRustBuffer);
    }

    /* JADX DEBUG: Method merged with bridge method: getRustHandle(Ljava/lang/Object;)Ljava/lang/Long; */
    @Override // uniffi.BaseFfiConverterType
    public Long getRustHandle(@NotNull BzC bzC) {
        Intrinsics.checkNotNullParameter(bzC, "");
        if (bzC instanceof BzA) {
            return Long.valueOf(((BzA) bzC).uniffiCloneHandle());
        }
        return null;
    }

    /* JADX DEBUG: Method merged with bridge method: createFromHandle(J)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterType
    public BzC createFromHandle(long j) {
        return new BzA(C60184zxu.INSTANCE, j);
    }
}
