package o;

import java.util.Queue;

/* JADX INFO: renamed from: o.Pv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C5389Pv<A, B> {
    public final SD<Activity<A>, B> OLrzqt;

    public C5389Pv() {
        this(250L);
    }

    public C5389Pv(long j) {
        this.OLrzqt = new SD<Activity<A>, B>(j) { // from class: o.Pv.4
            /* JADX DEBUG: Method merged with bridge method: KWHzl(Ljava/lang/Object;Ljava/lang/Object;)V */
            @Override // o.SD
            /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
            public void KWHzl(@androidx.annotation.NonNull Activity<A> activity, @androidx.annotation.Nullable B b) {
                activity.OLrzqt();
            }
        };
    }

    public B EZpvd(A a2, int i, int i2) {
        Activity<A> activityOLrzqt = Activity.OLrzqt(a2, i, i2);
        B bAEQbTJ = this.OLrzqt.AEQbTJ(activityOLrzqt);
        activityOLrzqt.OLrzqt();
        return bAEQbTJ;
    }

    public void KWHzl(A a2, int i, int i2, B b) {
        this.OLrzqt.copydefault(Activity.OLrzqt(a2, i, i2), b);
    }

    /* JADX INFO: renamed from: o.Pv$Activity */
    public static final class Activity<A> {
        public static final Queue<Activity<?>> OLrzqt = SI.copydefault(0);
        public int EZpvd;
        public int KWHzl;
        public A copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(A a2, int i, int i2) {
            this.copydefault = a2;
            this.KWHzl = i;
            this.EZpvd = i2;
        }

        public static <A> Activity<A> OLrzqt(A a2, int i, int i2) {
            Activity<A> activity;
            Queue<Activity<?>> queue = OLrzqt;
            synchronized (queue) {
                activity = (Activity) queue.poll();
            }
            if (activity == null) {
                activity = new Activity<>();
            }
            activity.EZpvd(a2, i, i2);
            return activity;
        }

        private Activity() {
        }

        public void OLrzqt() {
            Queue<Activity<?>> queue = OLrzqt;
            synchronized (queue) {
                queue.offer(this);
            }
        }

        public boolean equals(java.lang.Object obj) {
            if (obj instanceof Activity) {
                Activity activity = (Activity) obj;
                if (this.KWHzl == activity.KWHzl && this.EZpvd == activity.EZpvd && this.copydefault.equals(activity.copydefault)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            int i = this.EZpvd;
            return (((i * 31) + this.KWHzl) * 31) + this.copydefault.hashCode();
        }
    }
}
