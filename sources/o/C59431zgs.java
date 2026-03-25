package o;

import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.zgs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C59431zgs {

    /* JADX INFO: renamed from: o.zgs$ActionBar */
    public interface ActionBar<N> {
        java.lang.Iterable<? extends N> AEQbTJ(N n);
    }

    /* JADX INFO: renamed from: o.zgs$Activity */
    public interface Activity<N, R> {
        void AEQbTJ(N n);

        boolean EZpvd(N n);

        R OLrzqt();
    }

    /* JADX INFO: renamed from: o.zgs$StateListAnimator */
    public static abstract class StateListAnimator<N, R> implements Activity<N, R> {
        @Override // o.C59431zgs.Activity
        public void AEQbTJ(N n) {
        }

        @Override // o.C59431zgs.Activity
        public boolean EZpvd(N n) {
            return true;
        }
    }

    /* JADX INFO: renamed from: o.zgs$TaskDescription */
    public interface TaskDescription<N> {
        boolean OLrzqt(N n);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ void AEQbTJ(int i) {
        java.lang.Object[] objArr = new java.lang.Object[3];
        switch (i) {
            case 1:
            case 5:
            case 8:
            case 11:
            case 15:
            case 18:
            case 21:
            case 23:
                objArr[0] = "neighbors";
                break;
            case 2:
            case 12:
            case 16:
            case 19:
            case 24:
                objArr[0] = "visited";
                break;
            case 3:
            case 6:
            case 13:
            case 25:
                objArr[0] = "handler";
                break;
            case 4:
            case 7:
            case 17:
            case 20:
            default:
                objArr[0] = "nodes";
                break;
            case 9:
                objArr[0] = "predicate";
                break;
            case 10:
            case 14:
                objArr[0] = "node";
                break;
            case 22:
                objArr[0] = "current";
                break;
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/utils/DFS";
        switch (i) {
            case 7:
            case 8:
            case 9:
                objArr[2] = "ifAny";
                break;
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
                objArr[2] = "dfsFromNode";
                break;
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
                objArr[2] = "topologicalOrder";
                break;
            case 22:
            case 23:
            case 24:
            case 25:
                objArr[2] = "doDfs";
                break;
            default:
                objArr[2] = "dfs";
                break;
        }
        throw new java.lang.IllegalArgumentException(java.lang.String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    public static <N, R> R KWHzl(@NotNull java.util.Collection<N> collection, @NotNull ActionBar<N> actionBar, @NotNull TaskDescription<N> taskDescription, @NotNull Activity<N, R> activity) {
        if (collection == null) {
            AEQbTJ(0);
        }
        if (actionBar == null) {
            AEQbTJ(1);
        }
        if (taskDescription == null) {
            AEQbTJ(2);
        }
        if (activity == null) {
            AEQbTJ(3);
        }
        java.util.Iterator<N> it = collection.iterator();
        while (it.hasNext()) {
            copydefault(it.next(), actionBar, taskDescription, activity);
        }
        return activity.OLrzqt();
    }

    public static <N, R> R AEQbTJ(@NotNull java.util.Collection<N> collection, @NotNull ActionBar<N> actionBar, @NotNull Activity<N, R> activity) {
        if (collection == null) {
            AEQbTJ(4);
        }
        if (actionBar == null) {
            AEQbTJ(5);
        }
        if (activity == null) {
            AEQbTJ(6);
        }
        return (R) KWHzl(collection, actionBar, new Application(), activity);
    }

    public static <N> java.lang.Boolean copydefault(@NotNull java.util.Collection<N> collection, @NotNull ActionBar<N> actionBar, @NotNull final Function1<N, java.lang.Boolean> function1) {
        if (collection == null) {
            AEQbTJ(7);
        }
        if (actionBar == null) {
            AEQbTJ(8);
        }
        if (function1 == null) {
            AEQbTJ(9);
        }
        final boolean[] zArr = new boolean[1];
        return (java.lang.Boolean) AEQbTJ(collection, actionBar, new StateListAnimator<N, java.lang.Boolean>() { // from class: o.zgs.4
            @Override // o.C59431zgs.StateListAnimator, o.C59431zgs.Activity
            public boolean EZpvd(N n) {
                if (((java.lang.Boolean) function1.invoke(n)).booleanValue()) {
                    zArr[0] = true;
                }
                return !zArr[0];
            }

            /* JADX DEBUG: Method merged with bridge method: OLrzqt()Ljava/lang/Object; */
            @Override // o.C59431zgs.Activity
            /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
            public java.lang.Boolean OLrzqt() {
                return java.lang.Boolean.valueOf(zArr[0]);
            }
        });
    }

    public static <N> void copydefault(@NotNull N n, @NotNull ActionBar<N> actionBar, @NotNull TaskDescription<N> taskDescription, @NotNull Activity<N, ?> activity) {
        if (n == null) {
            AEQbTJ(22);
        }
        if (actionBar == null) {
            AEQbTJ(23);
        }
        if (taskDescription == null) {
            AEQbTJ(24);
        }
        if (activity == null) {
            AEQbTJ(25);
        }
        if (taskDescription.OLrzqt(n) && activity.EZpvd(n)) {
            java.util.Iterator<? extends N> it = actionBar.AEQbTJ(n).iterator();
            while (it.hasNext()) {
                copydefault(it.next(), actionBar, taskDescription, activity);
            }
            activity.AEQbTJ(n);
        }
    }

    /* JADX INFO: renamed from: o.zgs$Application */
    public static class Application<N> implements TaskDescription<N> {
        public final java.util.Set<N> EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ void KWHzl(int i) {
            throw new java.lang.IllegalArgumentException(java.lang.String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "visited", "kotlin/reflect/jvm/internal/impl/utils/DFS$VisitedWithSet", "<init>"));
        }

        public Application() {
            this(new java.util.HashSet());
        }

        public Application(@NotNull java.util.Set<N> set) {
            if (set == null) {
                KWHzl(0);
            }
            this.EZpvd = set;
        }

        @Override // o.C59431zgs.TaskDescription
        public boolean OLrzqt(N n) {
            return this.EZpvd.add(n);
        }
    }
}
