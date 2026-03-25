package o;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: o.miP, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C32691miP {
    public static final C32691miP copydefault = new C32691miP();

    private C32691miP() {
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: o.miP */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ View.AccessibilityDelegate createDetectionOnlyDelegate$default(C32691miP c32691miP, Function1 function1, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = null;
        }
        if ((i & 2) != 0) {
            str = null;
        }
        return c32691miP.KWHzl(function1, str);
    }

    /* JADX INFO: renamed from: o.miP$TaskDescription */
    public static final class TaskDescription extends View.AccessibilityDelegate {
        public final /* synthetic */ Function1<C32680miE, Unit> OLrzqt;
        public final /* synthetic */ java.lang.String copydefault;

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super o.miE, kotlin.Unit> */
        /* JADX WARN: Multi-variable type inference failed */
        public TaskDescription(java.lang.String str, Function1<? super C32680miE, Unit> function1) {
            this.copydefault = str;
            this.OLrzqt = function1;
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean performAccessibilityAction(android.view.View view, int i, android.os.Bundle bundle) {
            Intrinsics.checkNotNullParameter(view, "");
            if (i == 16) {
                C32700miY.KWHzl.copydefault("ACCESSIBILITY_CLICK", view, false, this.copydefault, this.OLrzqt);
                return super.performAccessibilityAction(view, i, bundle);
            }
            if (i == 32) {
                C32700miY.KWHzl.copydefault("ACCESSIBILITY_LONG_CLICK", view, false, this.copydefault, this.OLrzqt);
                return super.performAccessibilityAction(view, i, bundle);
            }
            return super.performAccessibilityAction(view, i, bundle);
        }
    }

    public final View.AccessibilityDelegate KWHzl(Function1<? super C32680miE, Unit> function1, java.lang.String str) {
        return new TaskDescription(str, function1);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: o.miP */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ View.AccessibilityDelegate createBlockingDelegate$default(C32691miP c32691miP, Function1 function1, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = null;
        }
        if ((i & 2) != 0) {
            str = null;
        }
        return c32691miP.AEQbTJ(function1, str);
    }

    /* JADX INFO: renamed from: o.miP$ActionBar */
    public static final class ActionBar extends View.AccessibilityDelegate {
        public final /* synthetic */ Function1<C32680miE, Unit> KWHzl;
        public final /* synthetic */ java.lang.String copydefault;

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super o.miE, kotlin.Unit> */
        /* JADX WARN: Multi-variable type inference failed */
        public ActionBar(java.lang.String str, Function1<? super C32680miE, Unit> function1) {
            this.copydefault = str;
            this.KWHzl = function1;
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean performAccessibilityAction(android.view.View view, int i, android.os.Bundle bundle) {
            Intrinsics.checkNotNullParameter(view, "");
            if (i == 16) {
                C32700miY.KWHzl.copydefault("ACCESSIBILITY_CLICK", view, true, this.copydefault, this.KWHzl);
                return true;
            }
            if (i == 32) {
                C32700miY.KWHzl.copydefault("ACCESSIBILITY_LONG_CLICK", view, true, this.copydefault, this.KWHzl);
                return true;
            }
            return super.performAccessibilityAction(view, i, bundle);
        }
    }

    public final View.AccessibilityDelegate AEQbTJ(Function1<? super C32680miE, Unit> function1, java.lang.String str) {
        return new ActionBar(str, function1);
    }
}
