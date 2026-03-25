package o;

import com.okinc.pop.manager.ParallelCheckResult;
import com.okinc.pop.manager.ResumeCheckType;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tXh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public interface InterfaceC46518tXh extends java.lang.Comparable<InterfaceC46518tXh> {
    void AEQbTJ(InterfaceC58217yxC interfaceC58217yxC);

    void AEQbTJ(boolean z);

    boolean AEQbTJ();

    boolean AYXKKw();

    void AhwBna();

    ParallelCheckResult EZpvd();

    void EZpvd(@NotNull ParallelCheckResult parallelCheckResult);

    InterfaceC58217yxC KWHzl();

    void KWHzl(@NotNull InterfaceC46523tXm interfaceC46523tXm);

    InterfaceC46522tXl OLrzqt();

    AbstractC58185ywX<java.lang.Boolean> copydefault();

    void copydefault(InterfaceC46523tXm interfaceC46523tXm);

    ResumeCheckType djBIcL();

    void valueOf();

    /* JADX INFO: renamed from: o.tXh$Application */
    /* JADX INFO: loaded from: classes17.dex */
    public static final class Application {
        public static void EZpvd(@NotNull InterfaceC46518tXh interfaceC46518tXh, @NotNull InterfaceC46523tXm interfaceC46523tXm) {
            Intrinsics.checkNotNullParameter(interfaceC46518tXh, "");
            Intrinsics.checkNotNullParameter(interfaceC46523tXm, "");
            interfaceC46518tXh.copydefault(interfaceC46523tXm);
        }

        public static void KWHzl(@NotNull InterfaceC46518tXh interfaceC46518tXh) {
            Intrinsics.checkNotNullParameter(interfaceC46518tXh, "");
            interfaceC46518tXh.copydefault(null);
        }

        public static int copydefault(@NotNull InterfaceC46518tXh interfaceC46518tXh, @NotNull InterfaceC46518tXh interfaceC46518tXh2) {
            Intrinsics.checkNotNullParameter(interfaceC46518tXh, "");
            Intrinsics.checkNotNullParameter(interfaceC46518tXh2, "");
            if (interfaceC46518tXh.OLrzqt().copydefault() > interfaceC46518tXh2.OLrzqt().copydefault()) {
                return 1;
            }
            return interfaceC46518tXh.OLrzqt().copydefault() < interfaceC46518tXh2.OLrzqt().copydefault() ? -1 : 0;
        }
    }
}
