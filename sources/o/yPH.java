package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public interface yPH {
    public static final TaskDescription AEQbTJ = TaskDescription.OLrzqt;

    yNY copydefault(@NotNull yPA ypa, @NotNull C56933yXs c56933yXs, @NotNull InterfaceC59187zcM interfaceC59187zcM);

    public static final class Activity implements yPH {
        public static final Activity copydefault = new Activity();

        private Activity() {
        }

        @Override // o.yPH
        public yNY copydefault(@NotNull yPA ypa, @NotNull C56933yXs c56933yXs, @NotNull InterfaceC59187zcM interfaceC59187zcM) {
            Intrinsics.checkNotNullParameter(ypa, "");
            Intrinsics.checkNotNullParameter(c56933yXs, "");
            Intrinsics.checkNotNullParameter(interfaceC59187zcM, "");
            return new C56716yPr(ypa, c56933yXs, interfaceC59187zcM);
        }
    }

    public static final class TaskDescription {
        public static final /* synthetic */ TaskDescription OLrzqt = new TaskDescription();
        public static final yNN<yPH> AEQbTJ = new yNN<>("PackageViewDescriptorFactory");

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final yNN<yPH> AEQbTJ() {
            return AEQbTJ;
        }

        private TaskDescription() {
        }
    }
}
