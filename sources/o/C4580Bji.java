package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.ok_future_utils.OkffiException;

/* JADX INFO: renamed from: o.Bji, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C4580Bji implements InterfaceC60181zxr<OkffiException> {
    public static final int $stable = 0;
    public static final C4580Bji INSTANCE = new C4580Bji();

    private C4580Bji() {
    }

    /* JADX DEBUG: Method merged with bridge method: copydefault(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // o.InterfaceC60181zxr
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
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
