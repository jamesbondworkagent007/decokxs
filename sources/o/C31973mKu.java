package o;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C31976mKx;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mKu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C31973mKu extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int KWHzl = 8;
    public final java.util.List<Activity> AEQbTJ;
    public final Application EZpvd;

    /* JADX INFO: renamed from: o.mKu$Application */
    public interface Application {
        void OLrzqt(@NotNull java.lang.String str);
    }

    public C31973mKu(@NotNull java.util.List<Activity> list, @NotNull Application application) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(application, "");
        this.AEQbTJ = list;
        this.EZpvd = application;
    }

    /* JADX INFO: renamed from: o.mKu$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.mKu.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        return (C33129mqd.OLrzqt((java.lang.CharSequence) this.AEQbTJ.get(i).EZpvd()) || C33129mqd.OLrzqt((java.lang.CharSequence) this.AEQbTJ.get(i).copydefault())) ? 2 : 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(@NotNull android.view.ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        android.view.LayoutInflater layoutInflaterFrom = android.view.LayoutInflater.from(viewGroup.getContext());
        if (i == 1) {
            android.view.View viewInflate = layoutInflaterFrom.inflate(C31976mKx.Application.AuCTelauCTel, viewGroup, false);
            Intrinsics.copydefault(viewInflate);
            return new StateListAnimator(this, viewInflate);
        }
        android.view.View viewInflate2 = layoutInflaterFrom.inflate(C31976mKx.Application.getNewProxyInstance, viewGroup, false);
        Intrinsics.copydefault(viewInflate2);
        return new TaskDescription(this, viewInflate2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull RecyclerView.ViewHolder viewHolder, final int i) {
        Intrinsics.checkNotNullParameter(viewHolder, "");
        if (getItemViewType(i) == 1) {
            ((StateListAnimator) viewHolder).EZpvd(this.AEQbTJ.get(i).OLrzqt());
            viewHolder.itemView.setClickable(false);
            return;
        }
        if (this.AEQbTJ.get(i).copydefault().length() > 0) {
            ((TaskDescription) viewHolder).copydefault(this.AEQbTJ.get(i).copydefault() + ":" + this.AEQbTJ.get(i).EZpvd());
            viewHolder.itemView.setClickable(true);
            viewHolder.itemView.setOnClickListener(new View.OnClickListener() { // from class: o.mKw
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C31973mKu.KWHzl(this.KWHzl, i, view);
                }
            });
            if (this.AEQbTJ.get(i).KWHzl()) {
                viewHolder.itemView.setContentDescription("PDSkylabOverrideFor_" + this.AEQbTJ.get(i).OLrzqt());
            } else if (this.AEQbTJ.get(i).AEQbTJ()) {
                viewHolder.itemView.setContentDescription("PDSkylabOverridePayloadFor_" + this.AEQbTJ.get(i).OLrzqt());
            }
        } else {
            viewHolder.itemView.setClickable(false);
            ((TaskDescription) viewHolder).copydefault(java.lang.String.valueOf(this.AEQbTJ.get(i).EZpvd()));
        }
        if ((this.AEQbTJ.get(i).KWHzl() || this.AEQbTJ.get(i).AEQbTJ()) && this.AEQbTJ.get(i).EZpvd() != null) {
            ((TaskDescription) viewHolder).EZpvd(C33070mpX.copydefault(C52761wXj.Activity.DcMfJKDcMfJK));
        } else {
            ((TaskDescription) viewHolder).EZpvd(C33070mpX.copydefault(C52761wXj.Activity.registerUser));
        }
    }

    public static final void KWHzl(C31973mKu c31973mKu, int i, android.view.View view) {
        c31973mKu.EZpvd.OLrzqt(c31973mKu.AEQbTJ.get(i).OLrzqt());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.AEQbTJ.size();
    }

    /* JADX INFO: renamed from: o.mKu$StateListAnimator */
    public final class StateListAnimator extends RecyclerView.ViewHolder {
        public final /* synthetic */ C31973mKu AEQbTJ;
        public final android.widget.TextView KWHzl;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StateListAnimator(@NotNull C31973mKu c31973mKu, android.view.View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "");
            this.AEQbTJ = c31973mKu;
            android.view.View viewFindViewById = view.findViewById(C31976mKx.Activity.gwTjWJ);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "");
            this.KWHzl = (android.widget.TextView) viewFindViewById;
        }

        public final void EZpvd(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.KWHzl.setText(str);
        }
    }

    /* JADX INFO: renamed from: o.mKu$TaskDescription */
    public final class TaskDescription extends RecyclerView.ViewHolder {
        public final android.widget.TextView KWHzl;
        public final /* synthetic */ C31973mKu copydefault;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TaskDescription(@NotNull C31973mKu c31973mKu, android.view.View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "");
            this.copydefault = c31973mKu;
            android.view.View viewFindViewById = view.findViewById(C31976mKx.Activity.fIwbmz);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "");
            this.KWHzl = (android.widget.TextView) viewFindViewById;
        }

        public final void copydefault(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.KWHzl.setText(str);
        }

        public final void EZpvd(int i) {
            this.KWHzl.setBackgroundColor(i);
        }
    }

    /* JADX INFO: renamed from: o.mKu$Activity */
    public static final class Activity {
        public java.lang.String AEQbTJ;
        public final boolean EZpvd;
        public java.lang.String KWHzl;
        public final java.lang.String OLrzqt;
        public final boolean copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity() {
            this(null, null, null, false, false, 31, null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Activity copy$default(Activity activity, java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z, boolean z2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = activity.OLrzqt;
            }
            if ((i & 2) != 0) {
                str2 = activity.KWHzl;
            }
            java.lang.String str4 = str2;
            if ((i & 4) != 0) {
                str3 = activity.AEQbTJ;
            }
            java.lang.String str5 = str3;
            if ((i & 8) != 0) {
                z = activity.EZpvd;
            }
            boolean z3 = z;
            if ((i & 16) != 0) {
                z2 = activity.copydefault;
            }
            return activity.EZpvd(str, str4, str5, z3, z2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean AEQbTJ() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String EZpvd() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Activity EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2, java.lang.String str3, boolean z, boolean z2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            return new Activity(str, str2, str3, z, z2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean KWHzl() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String OLrzqt() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(java.lang.String str) {
            this.AEQbTJ = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String copydefault() {
            return this.KWHzl;
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
            return Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) activity.OLrzqt) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) activity.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) activity.AEQbTJ) && this.EZpvd == activity.EZpvd && this.copydefault == activity.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = this.OLrzqt.hashCode();
            int iHashCode2 = this.KWHzl.hashCode();
            java.lang.String str = this.AEQbTJ;
            return (((((((iHashCode * 31) + iHashCode2) * 31) + (str == null ? 0 : str.hashCode())) * 31) + java.lang.Boolean.hashCode(this.EZpvd)) * 31) + java.lang.Boolean.hashCode(this.copydefault);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Item(flag=" + this.OLrzqt + ", title=" + this.KWHzl + ", content=" + this.AEQbTJ + ", isOverrideValue=" + this.EZpvd + ", isOverridePayload=" + this.copydefault + ")";
        }

        public Activity(@NotNull java.lang.String str, @NotNull java.lang.String str2, java.lang.String str3, boolean z, boolean z2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            this.OLrzqt = str;
            this.KWHzl = str2;
            this.AEQbTJ = str3;
            this.EZpvd = z;
            this.copydefault = z2;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0029: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r9v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r4v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0009: ARITH (r9v0 int) & (2 int) A[WRAPPED]) == (0 int)) ? (r5v0 java.lang.String) : (""))
  (wrap:java.lang.String:0x0014: TERNARY null = ((wrap:int:0x000f: ARITH (r9v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r6v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0015: ARITH (r9v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? false : (r7v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x001d: ARITH (r9v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? false : (r8v0 boolean))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, boolean, boolean):void (m)] (LINE:94) call: o.mKu.Activity.<init>(java.lang.String, java.lang.String, java.lang.String, boolean, boolean):void type: THIS */
        public /* synthetic */ Activity(java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) == 0 ? str2 : "", (i & 4) != 0 ? null : str3, (i & 8) != 0 ? false : z, (i & 16) != 0 ? false : z2);
        }
    }
}
