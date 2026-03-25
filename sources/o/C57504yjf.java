package o;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yjf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C57504yjf extends ConstraintLayout {
    public final C57392yhZ AEQbTJ;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C57504yjf(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C57504yjf(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:18) call: o.yjf.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C57504yjf(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57504yjf(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        C57392yhZ c57392yhZEZpvd = C57392yhZ.EZpvd(android.view.LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(c57392yhZEZpvd, "");
        this.AEQbTJ = c57392yhZEZpvd;
        setPadding(C55298xhM.dpInt$default(24, (android.content.Context) null, 1, (java.lang.Object) null), C55298xhM.dpInt$default(12, (android.content.Context) null, 1, (java.lang.Object) null), C55298xhM.dpInt$default(24, (android.content.Context) null, 1, (java.lang.Object) null), C55298xhM.dpInt$default(12, (android.content.Context) null, 1, (java.lang.Object) null));
    }

    /* JADX INFO: renamed from: o.yjf$Activity */
    public static final class Activity {
        public final Function0<Unit> AEQbTJ;
        public final java.lang.CharSequence EZpvd;
        public final java.lang.CharSequence KWHzl;
        public final boolean OLrzqt;
        public final java.lang.String copydefault;
        public final java.lang.String valueOf;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: o.yjf$Activity */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Activity copy$default(Activity activity, java.lang.String str, java.lang.String str2, java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2, boolean z, Function0 function0, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = activity.valueOf;
            }
            if ((i & 2) != 0) {
                str2 = activity.copydefault;
            }
            java.lang.String str3 = str2;
            if ((i & 4) != 0) {
                charSequence = activity.KWHzl;
            }
            java.lang.CharSequence charSequence3 = charSequence;
            if ((i & 8) != 0) {
                charSequence2 = activity.EZpvd;
            }
            java.lang.CharSequence charSequence4 = charSequence2;
            if ((i & 16) != 0) {
                z = activity.OLrzqt;
            }
            boolean z2 = z;
            if ((i & 32) != 0) {
                function0 = activity.AEQbTJ;
            }
            return activity.EZpvd(str, str3, charSequence3, charSequence4, z2, function0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean AEQbTJ() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.CharSequence EZpvd() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Activity EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2, java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2, boolean z, Function0<Unit> function0) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            return new Activity(str, str2, charSequence, charSequence2, z, function0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.CharSequence KWHzl() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String OLrzqt() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Function0<Unit> copydefault() {
            return this.AEQbTJ;
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
            return Intrinsics.EZpvd((java.lang.Object) this.valueOf, (java.lang.Object) activity.valueOf) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) activity.copydefault) && Intrinsics.EZpvd(this.KWHzl, activity.KWHzl) && Intrinsics.EZpvd(this.EZpvd, activity.EZpvd) && this.OLrzqt == activity.OLrzqt && Intrinsics.EZpvd(this.AEQbTJ, activity.AEQbTJ);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = this.valueOf.hashCode();
            int iHashCode2 = this.copydefault.hashCode();
            java.lang.CharSequence charSequence = this.KWHzl;
            int iHashCode3 = charSequence == null ? 0 : charSequence.hashCode();
            java.lang.CharSequence charSequence2 = this.EZpvd;
            int iHashCode4 = charSequence2 == null ? 0 : charSequence2.hashCode();
            int iHashCode5 = java.lang.Boolean.hashCode(this.OLrzqt);
            Function0<Unit> function0 = this.AEQbTJ;
            return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (function0 != null ? function0.hashCode() : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            java.lang.String str = this.valueOf;
            java.lang.String str2 = this.copydefault;
            java.lang.CharSequence charSequence = this.KWHzl;
            java.lang.CharSequence charSequence2 = this.EZpvd;
            return "AddressInfoBean(title=" + str + ", address=" + str2 + ", primaryTag=" + ((java.lang.Object) charSequence) + ", secondaryTag=" + ((java.lang.Object) charSequence2) + ", showArrow=" + this.OLrzqt + ", clickCallback=" + this.AEQbTJ + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String valueOf() {
            return this.valueOf;
        }

        public Activity(@NotNull java.lang.String str, @NotNull java.lang.String str2, java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2, boolean z, Function0<Unit> function0) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            this.valueOf = str;
            this.copydefault = str2;
            this.KWHzl = charSequence;
            this.EZpvd = charSequence2;
            this.OLrzqt = z;
            this.AEQbTJ = function0;
        }
    }

    public final void setData(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
        this.AEQbTJ.AYXKKw.setText(activity.valueOf());
        this.AEQbTJ.djBIcL.setText(activity.OLrzqt());
        C55251xgS c55251xgS = this.AEQbTJ.KWHzl;
        Intrinsics.checkNotNullExpressionValue(c55251xgS, "");
        C55307xhV.AEQbTJ(c55251xgS, activity.EZpvd());
        C55251xgS c55251xgS2 = this.AEQbTJ.AhwBna;
        Intrinsics.checkNotNullExpressionValue(c55251xgS2, "");
        C55307xhV.AEQbTJ(c55251xgS2, activity.KWHzl());
        AppCompatImageView appCompatImageView = this.AEQbTJ.copydefault;
        Intrinsics.checkNotNullExpressionValue(appCompatImageView, "");
        appCompatImageView.setVisibility(activity.AEQbTJ() ? 0 : 8);
        AEQbTJ(activity.copydefault());
    }

    public final void setAddressColor(int i) {
        this.AEQbTJ.djBIcL.setTextColor(i);
    }

    private final void AEQbTJ(Function0<Unit> function0) {
        if (function0 == null) {
            setOnClickListener(null);
            setClickable(false);
        } else {
            setOnClickListener(new TaskDescription(this, 1000L, this, function0));
        }
    }

    /* JADX INFO: renamed from: o.yjf$TaskDescription */
    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ Function0 AEQbTJ;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ C57504yjf OLrzqt;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, C57504yjf c57504yjf, Function0 function0) {
            this.copydefault = view;
            this.KWHzl = j;
            this.OLrzqt = c57504yjf;
            this.AEQbTJ = function0;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.KWHzl || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                this.OLrzqt.performHapticFeedback(1, 3);
                this.AEQbTJ.invoke();
            }
        }
    }
}
