package o;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.aWj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public interface InterfaceC6828aWj {
    public static final TaskDescription Companion = TaskDescription.KWHzl;

    void AEQbTJ(@NotNull java.lang.String str, int i);

    /* JADX INFO: renamed from: o.aWj$TaskDescription */
    public static final class TaskDescription implements InterfaceC6828aWj {
        public static final /* synthetic */ TaskDescription KWHzl = new TaskDescription();
        public static volatile InterfaceC6828aWj OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC6828aWj
        public void AEQbTJ(@NotNull java.lang.String str, int i) {
            Intrinsics.checkNotNullParameter(str, "");
        }

        private TaskDescription() {
        }

        public final InterfaceC6828aWj OLrzqt() {
            if (OLrzqt == null) {
                synchronized (this) {
                    OLrzqt = KWHzl;
                    Unit unit = Unit.INSTANCE;
                }
            }
            InterfaceC6828aWj interfaceC6828aWj = OLrzqt;
            Intrinsics.copydefault(interfaceC6828aWj);
            return interfaceC6828aWj;
        }
    }
}
