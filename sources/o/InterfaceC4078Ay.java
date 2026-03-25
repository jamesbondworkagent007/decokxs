package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.C4131Az;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.Ay, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC4078Ay {
    public static final TaskDescription copydefault = TaskDescription.KWHzl;

    Function1<ActionBar, Unit> OLrzqt();

    /* JADX INFO: renamed from: o.Ay$TaskDescription */
    public static final class TaskDescription {
        public static final /* synthetic */ TaskDescription KWHzl = new TaskDescription();
        public static final InterfaceC4078Ay AEQbTJ = new C4131Az(ActionBar.OLrzqt.copydefault());

        private TaskDescription() {
        }
    }

    /* JADX INFO: renamed from: o.Ay$ActionBar */
    public interface ActionBar {
        public static final Application OLrzqt = Application.AEQbTJ;

        DE AEQbTJ();

        void AEQbTJ(int i);

        void AEQbTJ(long j);

        void AEQbTJ(@NotNull DE de);

        FZ AYXKKw();

        long AhwBna();

        int EZpvd();

        void EZpvd(long j);

        void EZpvd(@NotNull AD ad);

        void EZpvd(@NotNull FZ fz);

        long KWHzl();

        void KWHzl(long j);

        long OLrzqt();

        void OLrzqt(long j);

        void OLrzqt(@NotNull AC ac);

        long copydefault();

        void copydefault(long j);

        long djBIcL();

        AD gEmmrt();

        AC valueOf();

        /* JADX INFO: renamed from: o.Ay$ActionBar$Application */
        public static final class Application {
            public static final /* synthetic */ Application AEQbTJ = new Application();

            private Application() {
            }

            public final ActionBar copydefault() {
                return new C4131Az.ActionBar();
            }
        }
    }
}
