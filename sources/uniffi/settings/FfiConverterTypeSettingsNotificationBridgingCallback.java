package uniffi.settings;

import kotlin.jvm.internal.Intrinsics;
import o.BoL;
import o.BoM;
import o.BoN;
import o.C60184zxu;
import org.jetbrains.annotations.NotNull;
import uniffi.BaseFfiConverterType;

/* JADX INFO: loaded from: classes17.dex */
public final class FfiConverterTypeSettingsNotificationBridgingCallback extends BaseFfiConverterType<BoL> {
    public static final int $stable = 0;
    public static final FfiConverterTypeSettingsNotificationBridgingCallback INSTANCE = new FfiConverterTypeSettingsNotificationBridgingCallback();

    private FfiConverterTypeSettingsNotificationBridgingCallback() {
        super(BoN.uniffiRustBuffer);
    }

    /* JADX DEBUG: Method merged with bridge method: getRustHandle(Ljava/lang/Object;)Ljava/lang/Long; */
    @Override // uniffi.BaseFfiConverterType
    public Long getRustHandle(@NotNull BoL boL) {
        Intrinsics.checkNotNullParameter(boL, "");
        if (boL instanceof BoM) {
            return Long.valueOf(((BoM) boL).uniffiCloneHandle());
        }
        return null;
    }

    /* JADX DEBUG: Method merged with bridge method: createFromHandle(J)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterType
    public BoL createFromHandle(long j) {
        return new BoM(C60184zxu.INSTANCE, j);
    }
}
