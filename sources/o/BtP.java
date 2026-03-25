package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.ok_future_utils.OkffiException;

/* JADX INFO: loaded from: classes17.dex */
public final class BtP implements InterfaceC60181zxr<OkffiException> {
    public static final int $stable = 0;
    public static final BtP INSTANCE = new BtP();

    private BtP() {
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
