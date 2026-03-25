package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.ok_future_utils.OkffiException;

/* JADX INFO: renamed from: o.AGc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C2291AGc implements InterfaceC60181zxr<OkffiException> {
    public static final int $stable = 0;
    public static final C2291AGc INSTANCE = new C2291AGc();

    private C2291AGc() {
    }

    /* JADX DEBUG: Method merged with bridge method: copydefault(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // o.InterfaceC60181zxr
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public OkffiException copydefault(@NotNull RustBuffer.ByValue byValue) {
        Intrinsics.checkNotNullParameter(byValue, "");
        OkffiException.Application application = OkffiException.ErrorHandler;
        RustBuffer.ByValue byValue2 = new RustBuffer.ByValue(null, 1, null);
        byValue2.capacity = byValue.capacity;
        byValue2.len = byValue.len;
        byValue2.data = byValue.data;
        return application.copydefault(byValue2);
    }
}
