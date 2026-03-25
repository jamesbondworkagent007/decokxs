package uniffi.account;

import kotlin.jvm.internal.Intrinsics;
import o.C58586zHw;
import o.C60184zxu;
import o.C60230zyn;
import o.zHA;
import org.jetbrains.annotations.NotNull;
import uniffi.BaseFfiConverterType;

/* JADX INFO: loaded from: classes17.dex */
public final class FfiConverterTypeMfaSwitchMethodEventCallback extends BaseFfiConverterType<zHA> {
    public static final int $stable = 0;
    public static final FfiConverterTypeMfaSwitchMethodEventCallback INSTANCE = new FfiConverterTypeMfaSwitchMethodEventCallback();

    private FfiConverterTypeMfaSwitchMethodEventCallback() {
        super(C60230zyn.uniffiRustBuffer);
    }

    /* JADX DEBUG: Method merged with bridge method: getRustHandle(Ljava/lang/Object;)Ljava/lang/Long; */
    @Override // uniffi.BaseFfiConverterType
    public Long getRustHandle(@NotNull zHA zha) {
        Intrinsics.checkNotNullParameter(zha, "");
        if (zha instanceof C58586zHw) {
            return Long.valueOf(((C58586zHw) zha).uniffiCloneHandle());
        }
        return null;
    }

    /* JADX DEBUG: Method merged with bridge method: createFromHandle(J)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterType
    public zHA createFromHandle(long j) {
        return new C58586zHw(C60184zxu.INSTANCE, j);
    }
}
