package o;

import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.eKz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C15509eKz extends android.widget.LinearLayout {
    public int AYXKKw;
    public final java.util.List<java.lang.Integer> EZpvd;
    public android.widget.ImageView KWHzl;
    public android.widget.ProgressBar OLrzqt;
    public final android.widget.TextView valueOf;
    public static final ActionBar Companion = new ActionBar(null);
    public static final int copydefault = 8;
    public static final InterfaceC56387yDm<java.util.HashMap<java.lang.Integer, Activity>> AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.eKx
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C15509eKz.EZpvd();
        }
    });

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15509eKz(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.EZpvd = yDY.gEmmrt(2, 1, 3, 6);
        android.view.LayoutInflater.from(context).inflate(C13754dXa.TaskDescription.Ohcwxs, (android.view.ViewGroup) this, true);
        setOrientation(0);
        setGravity(16);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        int iEZpvd = C33518mxv.EZpvd(context, 4.0f);
        int iEZpvd2 = C33518mxv.EZpvd(context, 2.0f);
        setPaddingRelative(iEZpvd, iEZpvd2, iEZpvd, iEZpvd2);
        setLayoutParams(layoutParams);
        this.KWHzl = (android.widget.ImageView) findViewById(C13754dXa.ActionBar.MediaSessionCompatMediaSessionImplApi19);
        this.valueOf = (android.widget.TextView) findViewById(C13754dXa.ActionBar.MediaSessionCompatMediaSessionImplApi28);
        this.OLrzqt = (android.widget.ProgressBar) findViewById(C13754dXa.ActionBar.buildRccMetadata);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C15509eKz(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX INFO: renamed from: o.eKz$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.eKz.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final java.util.HashMap<java.lang.Integer, Activity> OLrzqt() {
            return (java.util.HashMap) C15509eKz.AEQbTJ.getValue();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C15509eKz(@NotNull android.content.Context context) {
        this(context, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    public static final java.util.HashMap EZpvd() {
        java.util.HashMap map = new java.util.HashMap();
        map.put(0, new Activity(null, null, C13754dXa.FragmentManager.setToolbarNavigationClickListener, C13754dXa.Activity.fIwbmz, C52761wXj.Activity.fdOvFl, false, 3, null));
        java.lang.Integer num = null;
        java.lang.Integer num2 = null;
        int i = 3;
        DefaultConstructorMarker defaultConstructorMarker = null;
        map.put(1, new Activity(num, num2, C13754dXa.FragmentManager.setActionBarUpIndicator, C13754dXa.Activity.AkhnZx, C52761wXj.Activity.gdmIOq, true, i, defaultConstructorMarker));
        java.lang.Integer num3 = null;
        java.lang.Integer num4 = null;
        boolean z = true;
        int i2 = 3;
        DefaultConstructorMarker defaultConstructorMarker2 = null;
        map.put(2, new Activity(num3, num4, C13754dXa.FragmentManager.onDrawerStateChanged, C13754dXa.Activity.AkhnZx, C52761wXj.Activity.gdmIOq, z, i2, defaultConstructorMarker2));
        map.put(3, new Activity(num3, num4, C13754dXa.FragmentManager.onDrawerSlide, C13754dXa.Activity.AkhnZx, C52761wXj.Activity.gdmIOq, z, i2, defaultConstructorMarker2));
        map.put(6, new Activity(num3, num4, C13754dXa.FragmentManager.syncState, C13754dXa.Activity.AkhnZx, C52761wXj.Activity.gdmIOq, z, i2, defaultConstructorMarker2));
        int i3 = C52761wXj.TaskDescription.RKcVTr;
        int i4 = C52761wXj.Activity.DQzvGN;
        map.put(4, new Activity(java.lang.Integer.valueOf(i3), java.lang.Integer.valueOf(i4), C13754dXa.FragmentManager.RlQdEF, C13754dXa.Activity.values, C52761wXj.Activity.DQzvGN, false));
        map.put(7, new Activity(num, num2, C13754dXa.FragmentManager.setActionBarDescription, C13754dXa.Activity.fetchVPNInfo, C52761wXj.Activity.UlJrfe, false, i, defaultConstructorMarker));
        java.lang.Integer num5 = null;
        java.lang.Integer num6 = null;
        int i5 = 3;
        DefaultConstructorMarker defaultConstructorMarker3 = null;
        map.put(8, new Activity(num5, num6, C13754dXa.FragmentManager.zlzhuY, C13754dXa.Activity.fIwbmz, C52761wXj.Activity.fdOvFl, false, i5, defaultConstructorMarker3));
        map.put(9, new Activity(num5, num6, C13754dXa.FragmentManager.hPlhRW, C13754dXa.Activity.AkhnZx, C52761wXj.Activity.gdmIOq, true, i5, defaultConstructorMarker3));
        return map;
    }

    public final void setStatus(int i) {
        this.AYXKKw = i;
        Activity activity = (Activity) Companion.OLrzqt().get(java.lang.Integer.valueOf(i));
        if (activity != null) {
            setVisibility(0);
            EZpvd(activity);
        } else {
            setVisibility(8);
        }
    }

    public final void EZpvd(Activity activity) {
        if (activity.EZpvd() != null) {
            this.KWHzl.setImageResource(activity.EZpvd().intValue());
            this.KWHzl.setVisibility(0);
            if (activity.AEQbTJ() != null) {
                this.KWHzl.setImageTintList(C33070mpX.AEQbTJ(activity.AEQbTJ().intValue()));
            }
        } else {
            this.KWHzl.setVisibility(8);
        }
        this.OLrzqt.setVisibility(activity.djBIcL() ? 0 : 8);
        if (activity.KWHzl() != 0) {
            this.valueOf.setVisibility(0);
            this.valueOf.setText(getResources().getString(activity.KWHzl()));
            this.valueOf.setTextColor(C33070mpX.copydefault(activity.OLrzqt()));
            setBackground(C33070mpX.KWHzl(activity.copydefault()));
        } else {
            this.valueOf.setVisibility(8);
            setBackground(null);
        }
        ViewGroup.LayoutParams layoutParams = this.valueOf.getLayoutParams();
        if (layoutParams instanceof LinearLayout.LayoutParams) {
            if (this.KWHzl.getVisibility() == 0 || this.OLrzqt.getVisibility() == 0) {
                ((LinearLayout.LayoutParams) layoutParams).setMarginStart((int) C33052mpF.dp$default(2.0f, (android.content.Context) null, 1, (java.lang.Object) null));
            } else {
                ((LinearLayout.LayoutParams) layoutParams).setMarginStart(0);
            }
            this.valueOf.setLayoutParams(layoutParams);
        }
        if (getLayoutParams() instanceof ConstraintLayout.LayoutParams) {
            ViewGroup.LayoutParams layoutParams2 = getLayoutParams();
            Intrinsics.copydefault(layoutParams2, "");
            ConstraintLayout.LayoutParams layoutParams3 = (ConstraintLayout.LayoutParams) layoutParams2;
            if (activity.KWHzl() != 0) {
                layoutParams3.setMarginStart((int) C33052mpF.dp$default(6.0f, (android.content.Context) null, 1, (java.lang.Object) null));
            } else {
                layoutParams3.setMarginStart(0);
            }
            setLayoutParams(layoutParams3);
        }
    }

    /* JADX INFO: renamed from: o.eKz$Activity */
    public static final class Activity {
        public final int AEQbTJ;
        public final int AhwBna;
        public final int EZpvd;
        public final java.lang.Integer KWHzl;
        public final boolean OLrzqt;
        public final java.lang.Integer copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Activity copy$default(Activity activity, java.lang.Integer num, java.lang.Integer num2, int i, int i2, int i3, boolean z, int i4, java.lang.Object obj) {
            if ((i4 & 1) != 0) {
                num = activity.copydefault;
            }
            if ((i4 & 2) != 0) {
                num2 = activity.KWHzl;
            }
            java.lang.Integer num3 = num2;
            if ((i4 & 4) != 0) {
                i = activity.AhwBna;
            }
            int i5 = i;
            if ((i4 & 8) != 0) {
                i2 = activity.AEQbTJ;
            }
            int i6 = i2;
            if ((i4 & 16) != 0) {
                i3 = activity.EZpvd;
            }
            int i7 = i3;
            if ((i4 & 32) != 0) {
                z = activity.OLrzqt;
            }
            return activity.AEQbTJ(num, num3, i5, i6, i7, z);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.Integer AEQbTJ() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Activity AEQbTJ(java.lang.Integer num, java.lang.Integer num2, int i, int i2, int i3, boolean z) {
            return new Activity(num, num2, i, i2, i3, z);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.Integer EZpvd() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int KWHzl() {
            return this.AhwBna;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int OLrzqt() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int copydefault() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean djBIcL() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Activity)) {
                return false;
            }
            Activity activity = (Activity) obj;
            return Intrinsics.EZpvd(this.copydefault, activity.copydefault) && Intrinsics.EZpvd(this.KWHzl, activity.KWHzl) && this.AhwBna == activity.AhwBna && this.AEQbTJ == activity.AEQbTJ && this.EZpvd == activity.EZpvd && this.OLrzqt == activity.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            java.lang.Integer num = this.copydefault;
            int iHashCode = num == null ? 0 : num.hashCode();
            java.lang.Integer num2 = this.KWHzl;
            return (((((((((iHashCode * 31) + (num2 != null ? num2.hashCode() : 0)) * 31) + java.lang.Integer.hashCode(this.AhwBna)) * 31) + java.lang.Integer.hashCode(this.AEQbTJ)) * 31) + java.lang.Integer.hashCode(this.EZpvd)) * 31) + java.lang.Boolean.hashCode(this.OLrzqt);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "StateConfig(iconRes=" + this.copydefault + ", iconColor=" + this.KWHzl + ", textRes=" + this.AhwBna + ", backRes=" + this.AEQbTJ + ", textColor=" + this.EZpvd + ", isShowAnimation=" + this.OLrzqt + ")";
        }

        public Activity(java.lang.Integer num, java.lang.Integer num2, int i, int i2, int i3, boolean z) {
            this.copydefault = num;
            this.KWHzl = num2;
            this.AhwBna = i;
            this.AEQbTJ = i2;
            this.EZpvd = i3;
            this.OLrzqt = z;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0014: CONSTRUCTOR 
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0000: ARITH (r16v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r10v0 java.lang.Integer))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0008: ARITH (r16v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r11v0 java.lang.Integer))
  (r12v0 int)
  (r13v0 int)
  (r14v0 int)
  (r15v0 boolean)
 A[MD:(java.lang.Integer, java.lang.Integer, int, int, int, boolean):void (m)] (LINE:266) call: o.eKz.Activity.<init>(java.lang.Integer, java.lang.Integer, int, int, int, boolean):void type: THIS */
        public /* synthetic */ Activity(java.lang.Integer num, java.lang.Integer num2, int i, int i2, int i3, boolean z, int i4, DefaultConstructorMarker defaultConstructorMarker) {
            this((i4 & 1) != 0 ? null : num, (i4 & 2) != 0 ? null : num2, i, i2, i3, z);
        }
    }
}
