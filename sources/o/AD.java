package o;

import kotlin.jvm.internal.Intrinsics;
import o.AD;
import o.AbstractC4025Ax;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public interface AD {
    public static final Application EZpvd = Application.copydefault;

    AbstractC4025Ax OLrzqt(@NotNull DL dl);

    public static final class Application {
        public static final /* synthetic */ Application copydefault = new Application();
        public static final AD AEQbTJ = new AD() { // from class: o.AE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.AD
            public final AbstractC4025Ax OLrzqt(DL dl) {
                return AD.Application.EZpvd(dl);
            }
        };

        private Application() {
        }

        public static final AbstractC4025Ax EZpvd(DL dl) {
            Intrinsics.checkNotNullParameter(dl, "");
            return AbstractC4025Ax.Activity.AEQbTJ;
        }
    }
}
