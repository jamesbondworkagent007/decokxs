package uniffi.settings;

import kotlin.jvm.internal.Intrinsics;
import o.BoN;
import o.C4659Bmg;
import o.C60184zxu;
import o.InterfaceC4660Bmh;
import org.jetbrains.annotations.NotNull;
import uniffi.BaseFfiConverterType;

/* JADX INFO: loaded from: classes13.dex */
public final class FfiConverterTypeColorPreferenceStateChangeCallback extends BaseFfiConverterType<InterfaceC4660Bmh> {
    public static final int $stable = 0;
    public static final FfiConverterTypeColorPreferenceStateChangeCallback INSTANCE = new FfiConverterTypeColorPreferenceStateChangeCallback();

    private FfiConverterTypeColorPreferenceStateChangeCallback() {
        super(BoN.uniffiRustBuffer);
    }

    /* JADX DEBUG: Method merged with bridge method: getRustHandle(Ljava/lang/Object;)Ljava/lang/Long; */
    @Override // uniffi.BaseFfiConverterType
    public Long getRustHandle(@NotNull InterfaceC4660Bmh interfaceC4660Bmh) {
        Intrinsics.checkNotNullParameter(interfaceC4660Bmh, "");
        if (interfaceC4660Bmh instanceof C4659Bmg) {
            return Long.valueOf(((C4659Bmg) interfaceC4660Bmh).uniffiCloneHandle());
        }
        return null;
    }

    /* JADX DEBUG: Method merged with bridge method: createFromHandle(J)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterType
    public InterfaceC4660Bmh createFromHandle(long j) {
        return new C4659Bmg(C60184zxu.INSTANCE, j);
    }
}
