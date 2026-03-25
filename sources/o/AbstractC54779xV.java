package o;

import aws.smithy.kotlin.runtime.ClientException;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xV, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC54779xV {
    public static final TaskDescription OLrzqt = new TaskDescription(null);
    public final int AEQbTJ;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 int) A[MD:(int):void (m)] call: o.xV.<init>(int):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ AbstractC54779xV(int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(i);
    }

    public AbstractC54779xV(int i) {
        this.AEQbTJ = i;
    }

    /* JADX INFO: renamed from: o.xV$Application */
    public static final class Application extends AbstractC54779xV {
        public static final Application EZpvd = new Application();

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.AbstractC54779xV
        public java.lang.String toString() {
            return "Default";
        }

        private Application() {
            super(0, null);
        }
    }

    /* JADX INFO: renamed from: o.xV$Activity */
    public static final class Activity extends AbstractC54779xV {
        public static final Activity KWHzl = new Activity();

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.AbstractC54779xV
        public java.lang.String toString() {
            return "LogRequest";
        }

        private Activity() {
            super(1, null);
        }
    }

    /* JADX INFO: renamed from: o.xV$ActionBar */
    public static final class ActionBar extends AbstractC54779xV {
        public static final ActionBar copydefault = new ActionBar();

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.AbstractC54779xV
        public java.lang.String toString() {
            return "LogRequestWithBody";
        }

        private ActionBar() {
            super(2, null);
        }
    }

    /* JADX INFO: renamed from: o.xV$Fragment */
    public static final class Fragment extends AbstractC54779xV {
        public static final Fragment copydefault = new Fragment();

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.AbstractC54779xV
        public java.lang.String toString() {
            return "LogResponse";
        }

        private Fragment() {
            super(4, null);
        }
    }

    /* JADX INFO: renamed from: o.xV$FragmentManager */
    public static final class FragmentManager extends AbstractC54779xV {
        public static final FragmentManager EZpvd = new FragmentManager();

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.AbstractC54779xV
        public java.lang.String toString() {
            return "LogResponseWithBody";
        }

        private FragmentManager() {
            super(8, null);
        }
    }

    /* JADX INFO: renamed from: o.xV$StateListAnimator */
    public static final class StateListAnimator extends AbstractC54779xV {
        public StateListAnimator(int i) {
            super(i, null);
        }
    }

    public final AbstractC54779xV copydefault(@NotNull AbstractC54779xV abstractC54779xV) {
        Intrinsics.checkNotNullParameter(abstractC54779xV, "");
        return new StateListAnimator(abstractC54779xV.AEQbTJ | this.AEQbTJ);
    }

    public boolean equals(java.lang.Object obj) {
        return (obj instanceof AbstractC54779xV) && this.AEQbTJ == ((AbstractC54779xV) obj).AEQbTJ;
    }

    public final boolean KWHzl(@NotNull AbstractC54779xV abstractC54779xV) {
        Intrinsics.checkNotNullParameter(abstractC54779xV, "");
        return (abstractC54779xV.AEQbTJ & this.AEQbTJ) != 0;
    }

    /* JADX INFO: renamed from: o.xV$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.xV.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final java.util.List<AbstractC54779xV> KWHzl() {
            return yDY.gEmmrt(Activity.KWHzl, ActionBar.copydefault, Fragment.copydefault, FragmentManager.EZpvd);
        }

        public final AbstractC54779xV KWHzl(@NotNull java.lang.String str) {
            java.lang.Object next;
            Intrinsics.checkNotNullParameter(str, "");
            java.util.List<java.lang.String> listSplit$default = StringsKt__StringsKt.split$default((java.lang.CharSequence) StringsKt__StringsKt.hDKMBd((java.lang.CharSequence) str).toString(), new java.lang.String[]{HiAnalyticsConstant.REPORT_VAL_SEPARATOR}, false, 0, 6, (java.lang.Object) null);
            java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listSplit$default, 10));
            for (java.lang.String str2 : listSplit$default) {
                java.util.Iterator<T> it = AbstractC54779xV.OLrzqt.KWHzl().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    if (C59449zhJ.gEmmrt(str2, ((AbstractC54779xV) next).toString(), true)) {
                        break;
                    }
                }
                AbstractC54779xV abstractC54779xV = (AbstractC54779xV) next;
                if (abstractC54779xV == null) {
                    throw new ClientException("Log mode " + str2 + " is not supported, should be one or more of: " + CollectionsKt___CollectionsKt.joinToString$default(AbstractC54779xV.OLrzqt.KWHzl(), ", ", null, null, 0, null, null, 62, null));
                }
                arrayList.add(abstractC54779xV);
            }
            java.util.Iterator it2 = arrayList.iterator();
            if (!it2.hasNext()) {
                throw new java.lang.UnsupportedOperationException("Empty collection can't be reduced.");
            }
            java.lang.Object next2 = it2.next();
            while (it2.hasNext()) {
                next2 = ((AbstractC54779xV) next2).copydefault((AbstractC54779xV) it2.next());
            }
            return (AbstractC54779xV) next2;
        }
    }

    public java.lang.String toString() {
        java.util.List<AbstractC54779xV> listKWHzl = OLrzqt.KWHzl();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : listKWHzl) {
            if (KWHzl((AbstractC54779xV) obj)) {
                arrayList.add(obj);
            }
        }
        return CollectionsKt___CollectionsKt.joinToString$default(arrayList, HiAnalyticsConstant.REPORT_VAL_SEPARATOR, null, null, 0, null, null, 62, null);
    }
}
