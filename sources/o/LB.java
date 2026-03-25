package o;

import java.util.LinkedHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C5213Jb;
import o.LG;
import o.LI;
import okhttp3.OkHttpClient;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class LB {
    public static final OkHttpClient AEQbTJ;
    public static final java.util.Map<java.lang.String, LI> EZpvd;
    public static final LB KWHzl = new LB();
    public static final ScheduledThreadPoolExecutor OLrzqt;
    public static final ThreadFactory copydefault;

    private LB() {
    }

    static {
        ThreadFactory threadFactory = new ThreadFactory() { // from class: o.LD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.util.concurrent.ThreadFactory
            public final java.lang.Thread newThread(java.lang.Runnable runnable) {
                return LB.EZpvd(runnable);
            }
        };
        copydefault = threadFactory;
        OLrzqt = new ScheduledThreadPoolExecutor(4, threadFactory);
        AEQbTJ = new OkHttpClient();
        EZpvd = new LinkedHashMap();
    }

    public static final java.lang.Thread EZpvd(java.lang.Runnable runnable) {
        java.lang.Thread threadNewThread = Executors.defaultThreadFactory().newThread(runnable);
        threadNewThread.setDaemon(true);
        return threadNewThread;
    }

    public static final LI KWHzl(@NotNull android.app.Application application, @NotNull java.lang.String str, @NotNull LG lg) {
        LI li;
        Intrinsics.checkNotNullParameter(application, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(lg, "");
        java.util.Map<java.lang.String, LI> map = EZpvd;
        synchronized (map) {
            java.lang.String str2 = lg.AkhnZx;
            java.lang.String str3 = str2 + '.' + str;
            IX ixKWHzl = IX.Companion.KWHzl(str2);
            li = map.get(str3);
            if (li == null) {
                C5310Mu.copydefault.OLrzqt(new C5294Me(lg.EZpvd));
                LG.TaskDescription taskDescriptionCopydefault = lg.copydefault();
                if (lg.ejfBZ == null) {
                    taskDescriptionCopydefault.EZpvd(new C5284Lu(application, ixKWHzl.EZpvd()));
                }
                if (lg.KWHzl == null) {
                    taskDescriptionCopydefault.KWHzl(new C5282Ls(ixKWHzl.copydefault()));
                }
                final C5287Lx c5287Lx = new C5287Lx(str, taskDescriptionCopydefault.EZpvd(), AEQbTJ, new C5296Mg(application), OLrzqt);
                map.put(str3, c5287Lx);
                if (lg.AEQbTJ) {
                    ixKWHzl.EZpvd().EZpvd(new Function1<C5213Jb, Unit>() { // from class: com.amplitude.experiment.Experiment$initializeWithAmplitudeAnalytics$1$instance$1
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        {
                            super(1);
                        }

                        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(C5213Jb c5213Jb) {
                            invoke2(c5213Jb);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull C5213Jb c5213Jb) {
                            Intrinsics.checkNotNullParameter(c5213Jb, "");
                            LI.StateListAnimator.fetch$default(c5287Lx, null, 1, null);
                        }
                    });
                }
                li = c5287Lx;
            }
        }
        return li;
    }
}
