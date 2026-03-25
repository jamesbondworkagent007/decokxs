package uniffi.settings;

import kotlin.jvm.internal.Intrinsics;
import o.BoN;
import o.C4713Bog;
import o.C60184zxu;
import o.InterfaceC4714Boh;
import org.jetbrains.annotations.NotNull;
import uniffi.BaseFfiConverterType;

/* JADX INFO: loaded from: classes17.dex */
public final class FfiConverterTypeLanguageSelectEventCallback extends BaseFfiConverterType<InterfaceC4714Boh> {
    public static final int $stable = 0;
    public static final FfiConverterTypeLanguageSelectEventCallback INSTANCE = new FfiConverterTypeLanguageSelectEventCallback();

    private FfiConverterTypeLanguageSelectEventCallback() {
        super(BoN.uniffiRustBuffer);
    }

    /* JADX DEBUG: Method merged with bridge method: getRustHandle(Ljava/lang/Object;)Ljava/lang/Long; */
    @Override // uniffi.BaseFfiConverterType
    public Long getRustHandle(@NotNull InterfaceC4714Boh interfaceC4714Boh) {
        Intrinsics.checkNotNullParameter(interfaceC4714Boh, "");
        if (interfaceC4714Boh instanceof C4713Bog) {
            return Long.valueOf(((C4713Bog) interfaceC4714Boh).uniffiCloneHandle());
        }
        return null;
    }

    /* JADX DEBUG: Method merged with bridge method: createFromHandle(J)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterType
    public InterfaceC4714Boh createFromHandle(long j) {
        return new C4713Bog(C60184zxu.INSTANCE, j);
    }
}
