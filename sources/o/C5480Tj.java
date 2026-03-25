package o;

import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.Tj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5480Tj {
    public static final Activity Companion = new Activity(null);
    public java.util.Set<java.lang.String> AEQbTJ;
    public boolean EZpvd;
    public java.util.HashMap<java.lang.String, C5491Tu> KWHzl;
    public final C5479Ti OLrzqt;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 java.util.concurrent.ExecutorService) A[MD:(java.util.concurrent.ExecutorService):void (m)] (LINE:19) call: o.Tj.<init>(java.util.concurrent.ExecutorService):void type: THIS */
    public /* synthetic */ C5480Tj(ExecutorService executorService, DefaultConstructorMarker defaultConstructorMarker) {
        this(executorService);
    }

    public C5480Tj(ExecutorService executorService) {
        this.AEQbTJ = new java.util.HashSet();
        this.KWHzl = new java.util.HashMap<>();
        this.OLrzqt = new C5479Ti(executorService);
    }

    /* JADX INFO: renamed from: o.Tj$Activity */
    public static final class Activity {
        private Activity() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:31) call: o.Tj.Activity.<init>():void type: THIS */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ C5480Tj getInstance$default(Activity activity, ExecutorService executorService, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                executorService = null;
            }
            return activity.EZpvd(executorService);
        }

        public final C5480Tj EZpvd(ExecutorService executorService) {
            return new C5480Tj(executorService, null);
        }
    }

    public final C5480Tj EZpvd(@NotNull java.lang.String... strArr) {
        Intrinsics.EZpvd((java.lang.Object) strArr, "");
        if (!(strArr.length == 0)) {
            for (java.lang.String str : strArr) {
                if (str.length() > 0) {
                    this.AEQbTJ.add(str);
                }
            }
        }
        return this;
    }

    public final void EZpvd(AbstractRunnableC5485To abstractRunnableC5485To) {
        C5490Tt.copydefault();
        if (abstractRunnableC5485To == null) {
            throw new java.lang.RuntimeException("can no run a task that was null !");
        }
        KWHzl();
        if (abstractRunnableC5485To instanceof C5489Ts) {
            abstractRunnableC5485To = ((C5489Ts) abstractRunnableC5485To).fJNWhG();
        }
        this.OLrzqt.copydefault(abstractRunnableC5485To);
        boolean zCopydefault = copydefault();
        abstractRunnableC5485To.fetchVPNInfo();
        this.OLrzqt.djBIcL();
        if (zCopydefault) {
            EZpvd();
        }
    }

    public final void KWHzl() {
        this.OLrzqt.AEQbTJ();
        this.OLrzqt.AEQbTJ(this.EZpvd);
        this.OLrzqt.EZpvd(this.AEQbTJ);
        this.AEQbTJ.clear();
    }

    public final boolean copydefault() {
        if (!this.EZpvd) {
            return false;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        boolean zOLrzqt = this.OLrzqt.OLrzqt();
        if (zOLrzqt) {
            sb.append("has some anchors！");
            sb.append("( ");
            java.util.Iterator<java.lang.String> it = this.OLrzqt.KWHzl().iterator();
            while (it.hasNext()) {
                sb.append('\"' + it.next() + "\" ");
            }
            sb.append(")");
        } else {
            sb.append("has no any anchor！");
        }
        if (this.EZpvd) {
            java.lang.String string = sb.toString();
            Intrinsics.AEQbTJ(string, "");
            C5484Tn.EZpvd("ANCHOR_DETAIL", string);
        }
        return zOLrzqt;
    }

    public final void EZpvd() {
        if (this.EZpvd) {
            C5484Tn.EZpvd("ANCHOR_DETAIL", "All anchors were released！");
        }
    }
}
