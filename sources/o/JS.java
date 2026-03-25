package o;

import com.amplitude.common.Logger;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o.C5239Kb;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class JS implements InterfaceC5245Kh {
    public final InterfaceC56387yDm copydefault = C56392yDr.copydefault(new Function0<C5239Kb>() { // from class: com.amplitude.android.utilities.AndroidLoggerProvider$logger$2
        /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function0
        public final C5239Kb invoke() {
            return new C5239Kb();
        }
    });

    public final Logger EZpvd() {
        return (Logger) this.copydefault.getValue();
    }

    @Override // o.InterfaceC5245Kh
    public Logger getLogger(@NotNull JZ jz) {
        Intrinsics.checkNotNullParameter(jz, "");
        return EZpvd();
    }
}
