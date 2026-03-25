package uniffi.retail_kline;

import kotlin.jvm.internal.Intrinsics;
import o.C4539Bhv;
import o.C4578Bjg;
import o.C60184zxu;
import o.InterfaceC4535Bhr;
import org.jetbrains.annotations.NotNull;
import uniffi.BaseFfiConverterType;

/* JADX INFO: loaded from: classes13.dex */
public final class FfiConverterTypeMarketEventsPushListener extends BaseFfiConverterType<InterfaceC4535Bhr> {
    public static final int $stable = 0;
    public static final FfiConverterTypeMarketEventsPushListener INSTANCE = new FfiConverterTypeMarketEventsPushListener();

    private FfiConverterTypeMarketEventsPushListener() {
        super(C4578Bjg.uniffiRustBuffer);
    }

    /* JADX DEBUG: Method merged with bridge method: getRustHandle(Ljava/lang/Object;)Ljava/lang/Long; */
    @Override // uniffi.BaseFfiConverterType
    public Long getRustHandle(@NotNull InterfaceC4535Bhr interfaceC4535Bhr) {
        Intrinsics.checkNotNullParameter(interfaceC4535Bhr, "");
        if (interfaceC4535Bhr instanceof C4539Bhv) {
            return Long.valueOf(((C4539Bhv) interfaceC4535Bhr).uniffiCloneHandle());
        }
        return null;
    }

    /* JADX DEBUG: Method merged with bridge method: createFromHandle(J)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterType
    public InterfaceC4535Bhr createFromHandle(long j) {
        return new C4539Bhv(C60184zxu.INSTANCE, j);
    }
}
