package o;

import com.okinc.im.config.page.IMPageType;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class oFG {
    public static final Application Companion = new Application(null);

    @yCM
    public oFG() {
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.oFG.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    public final IMPageType OLrzqt(@NotNull C35248nrj c35248nrj) {
        Intrinsics.checkNotNullParameter(c35248nrj, "");
        for (Map.Entry<IMPageType, InterfaceC35280nsO> entry : C36596odu.copydefault.KWHzl().entrySet()) {
            InterfaceC35280nsO value = entry.getValue();
            boolean zAEQbTJ = value.AEQbTJ(c35248nrj);
            pUU.EZpvd("GetPageTypeFromInterceptorsUseCase", "interceptor: " + value.getClass().getSimpleName() + ", pageType: " + entry.getKey() + ",  shouldIntercept: " + zAEQbTJ);
            if (zAEQbTJ) {
                return entry.getKey();
            }
            boolean zEZpvd = value.EZpvd(c35248nrj.OLrzqt());
            pUU.EZpvd("GetPageTypeFromInterceptorsUseCase", "interceptor: " + value.getClass().getSimpleName() + ", legacyCheck: " + zEZpvd);
            if (zEZpvd) {
                return entry.getKey();
            }
        }
        return null;
    }
}
