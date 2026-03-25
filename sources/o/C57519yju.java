package o;

import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yju, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C57519yju extends ConstraintLayout {
    public final java.util.List<WeakReference<android.view.View>> AEQbTJ;
    public boolean EZpvd;
    public ActionBar KWHzl;
    public final C57448yic copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C57519yju(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C57519yju(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:17) call: o.yju.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C57519yju(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57519yju(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        C57448yic c57448yicOLrzqt = C57448yic.OLrzqt(android.view.LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(c57448yicOLrzqt, "");
        this.copydefault = c57448yicOLrzqt;
        this.AEQbTJ = new java.util.ArrayList();
        setPadding(C55298xhM.dpInt$default(24, (android.content.Context) null, 1, (java.lang.Object) null), 0, C55298xhM.dpInt$default(24, (android.content.Context) null, 1, (java.lang.Object) null), C55298xhM.dpInt$default(0, (android.content.Context) null, 1, (java.lang.Object) null));
        setOnClickListener(new View.OnClickListener() { // from class: o.yjw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C57519yju.OLrzqt(this.copydefault, view);
            }
        });
    }

    public static final void OLrzqt(C57519yju c57519yju, android.view.View view) {
        c57519yju.OLrzqt();
    }

    /* JADX INFO: renamed from: o.yju$ActionBar */
    public static final class ActionBar {
        public java.lang.String AEQbTJ;
        public boolean EZpvd;
        public Function0<Unit> KWHzl;
        public java.lang.String OLrzqt;
        public boolean copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar() {
            this(null, null, false, null, false, 31, null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: o.yju$ActionBar */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ActionBar copy$default(ActionBar actionBar, java.lang.String str, java.lang.String str2, boolean z, Function0 function0, boolean z2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = actionBar.AEQbTJ;
            }
            if ((i & 2) != 0) {
                str2 = actionBar.OLrzqt;
            }
            java.lang.String str3 = str2;
            if ((i & 4) != 0) {
                z = actionBar.copydefault;
            }
            boolean z3 = z;
            if ((i & 8) != 0) {
                function0 = actionBar.KWHzl;
            }
            Function0 function02 = function0;
            if ((i & 16) != 0) {
                z2 = actionBar.EZpvd;
            }
            return actionBar.EZpvd(str, str3, z3, function02, z2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AEQbTJ() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ActionBar EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2, boolean z, Function0<Unit> function0, boolean z2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            return new ActionBar(str, str2, z, function0, z2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean EZpvd() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean KWHzl() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String OLrzqt() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Function0<Unit> copydefault() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ActionBar)) {
                return false;
            }
            ActionBar actionBar = (ActionBar) obj;
            return Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) actionBar.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) actionBar.OLrzqt) && this.copydefault == actionBar.copydefault && Intrinsics.EZpvd(this.KWHzl, actionBar.KWHzl) && this.EZpvd == actionBar.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = this.AEQbTJ.hashCode();
            int iHashCode2 = this.OLrzqt.hashCode();
            int iHashCode3 = java.lang.Boolean.hashCode(this.copydefault);
            Function0<Unit> function0 = this.KWHzl;
            return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (function0 == null ? 0 : function0.hashCode())) * 31) + java.lang.Boolean.hashCode(this.EZpvd);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "FoldInfoDataBean(foldTitle=" + this.AEQbTJ + ", expandTitle=" + this.OLrzqt + ", isExpand=" + this.copydefault + ", clickCallback=" + this.KWHzl + ", showDividerLine=" + this.EZpvd + ")";
        }

        public ActionBar(@NotNull java.lang.String str, @NotNull java.lang.String str2, boolean z, Function0<Unit> function0, boolean z2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            this.AEQbTJ = str;
            this.OLrzqt = str2;
            this.copydefault = z;
            this.KWHzl = function0;
            this.EZpvd = z2;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0026: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r9v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r4v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0009: ARITH (r9v0 int) & (2 int) A[WRAPPED]) == (0 int)) ? (r5v0 java.lang.String) : (""))
  (wrap:boolean:0x0014: TERNARY null = ((wrap:int:0x000f: ARITH (r9v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? false : (r6v0 boolean))
  (wrap:kotlin.jvm.functions.Function0:0x001a: TERNARY null = ((wrap:int:0x0015: ARITH (r9v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null kotlin.jvm.functions.Function0) : (r7v0 kotlin.jvm.functions.Function0))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x001b: ARITH (r9v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? true : (r8v0 boolean))
 A[MD:(java.lang.String, java.lang.String, boolean, kotlin.jvm.functions.Function0<kotlin.Unit>, boolean):void (m)] (LINE:36) call: o.yju.ActionBar.<init>(java.lang.String, java.lang.String, boolean, kotlin.jvm.functions.Function0, boolean):void type: THIS */
        public /* synthetic */ ActionBar(java.lang.String str, java.lang.String str2, boolean z, Function0 function0, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) == 0 ? str2 : "", (i & 4) != 0 ? false : z, (i & 8) != 0 ? null : function0, (i & 16) != 0 ? true : z2);
        }
    }

    public final void setData(@NotNull ActionBar actionBar) {
        Intrinsics.checkNotNullParameter(actionBar, "");
        this.KWHzl = actionBar;
        boolean zEZpvd = actionBar.EZpvd();
        this.EZpvd = zEZpvd;
        this.copydefault.KWHzl.setRotation(zEZpvd ? 180.0f : 0.0f);
        setShowTitleLines(actionBar.KWHzl());
        AEQbTJ();
        EZpvd(this.EZpvd);
    }

    public final void setShowTitleLines(boolean z) {
        android.view.View view = this.copydefault.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(view, "");
        view.setVisibility(z ? 0 : 8);
        android.view.View view2 = this.copydefault.EZpvd;
        Intrinsics.checkNotNullExpressionValue(view2, "");
        view2.setVisibility(z ? 0 : 8);
    }

    public final void setAssociatedViews(@NotNull java.util.List<? extends android.view.View> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.AEQbTJ.clear();
        java.util.List<WeakReference<android.view.View>> list2 = this.AEQbTJ;
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new WeakReference((android.view.View) it.next()));
        }
        list2.addAll(arrayList);
        EZpvd(this.EZpvd);
    }

    public final void OLrzqt() {
        Function0<Unit> function0Copydefault;
        boolean z = !this.EZpvd;
        this.EZpvd = z;
        this.copydefault.KWHzl.setRotation(z ? 180.0f : 0.0f);
        AEQbTJ();
        EZpvd(this.EZpvd);
        ActionBar actionBar = this.KWHzl;
        if (actionBar == null || (function0Copydefault = actionBar.copydefault()) == null) {
            return;
        }
        function0Copydefault.invoke();
    }

    public static final boolean KWHzl(WeakReference weakReference) {
        Intrinsics.checkNotNullParameter(weakReference, "");
        return weakReference.get() == null;
    }

    public final void EZpvd(boolean z) {
        C56406yEe.AEQbTJ(this.AEQbTJ, new Function1() { // from class: o.yjv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Boolean.valueOf(C57519yju.KWHzl((WeakReference) obj));
            }
        });
        java.util.Iterator<T> it = this.AEQbTJ.iterator();
        while (it.hasNext()) {
            android.view.View view = (android.view.View) ((WeakReference) it.next()).get();
            if (view != null) {
                view.setVisibility(z ? 0 : 8);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x001e  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0021 A[PHI: r2
  0x0021: PHI (r2v3 java.lang.String) = (r2v1 java.lang.String), (r2v4 java.lang.String) binds: [B:12:0x001c, B:7:0x0011] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void AEQbTJ() {
        java.lang.String strOLrzqt;
        java.lang.String str;
        AppCompatTextView appCompatTextView = this.copydefault.OLrzqt;
        if (this.EZpvd) {
            ActionBar actionBar = this.KWHzl;
            strOLrzqt = actionBar != null ? actionBar.AEQbTJ() : null;
            str = strOLrzqt == null ? "" : strOLrzqt;
        } else {
            ActionBar actionBar2 = this.KWHzl;
            strOLrzqt = actionBar2 != null ? actionBar2.OLrzqt() : null;
            if (strOLrzqt == null) {
            }
        }
        appCompatTextView.setText(str);
    }

    public final void AEQbTJ(boolean z) {
        if ((getVisibility() == 0) == z) {
            return;
        }
        setVisibility(z ? 0 : 8);
        EZpvd(z ? this.EZpvd : false);
    }
}
