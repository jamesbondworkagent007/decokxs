package o;

import com.amplitude.common.Logger;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o.C5238Ka;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class KK implements InterfaceC5245Kh {
    public final InterfaceC56387yDm OLrzqt = C56392yDr.copydefault(new Function0<C5238Ka>() { // from class: com.amplitude.core.utilities.ConsoleLoggerProvider$logger$2
        /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function0
        public final C5238Ka invoke() {
            return new C5238Ka();
        }
    });

    private final Logger AEQbTJ() {
        return (Logger) this.OLrzqt.getValue();
    }

    @Override // o.InterfaceC5245Kh
    public Logger getLogger(@NotNull JZ jz) {
        Intrinsics.checkNotNullParameter(jz, "");
        return AEQbTJ();
    }
}
