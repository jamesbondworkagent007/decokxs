package o;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.uilab.item.OKRegularCell;
import com.reown.android.pulse.model.ConnectionMethod;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C31976mKx;
import o.C52761wXj;
import o.mKB;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public final class mKB extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int EZpvd = 8;
    public final StateListAnimator OLrzqt;
    public final java.util.List<Application> copydefault;

    public interface StateListAnimator {
        void EZpvd(@NotNull java.lang.String str, boolean z, boolean z2);
    }

    public mKB(@NotNull java.util.List<Application> list, @NotNull StateListAnimator stateListAnimator) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(stateListAnimator, "");
        this.copydefault = list;
        this.OLrzqt = stateListAnimator;
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.mKB.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        return (C33129mqd.OLrzqt((java.lang.CharSequence) this.copydefault.get(i).EZpvd()) || C33129mqd.OLrzqt((java.lang.CharSequence) this.copydefault.get(i).KWHzl())) ? 2 : 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(@NotNull android.view.ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        android.view.LayoutInflater layoutInflaterFrom = android.view.LayoutInflater.from(viewGroup.getContext());
        if (i == 1) {
            android.view.View viewInflate = layoutInflaterFrom.inflate(C31976mKx.Application.gHZMYf, viewGroup, false);
            Intrinsics.copydefault(viewInflate);
            return new TaskDescription(this, viewInflate);
        }
        android.view.View viewInflate2 = layoutInflaterFrom.inflate(C31976mKx.Application.wlaJM, viewGroup, false);
        Intrinsics.copydefault(viewInflate2);
        return new Activity(this, viewInflate2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull RecyclerView.ViewHolder viewHolder, int i) {
        Intrinsics.checkNotNullParameter(viewHolder, "");
        Application application = this.copydefault.get(i);
        if (getItemViewType(i) == 1) {
            ((TaskDescription) viewHolder).EZpvd(application.OLrzqt());
        } else {
            ((Activity) viewHolder).copydefault(application, this.OLrzqt);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.copydefault.size();
    }

    public final class TaskDescription extends RecyclerView.ViewHolder {
        public final /* synthetic */ mKB AEQbTJ;
        public final C55024xcD KWHzl;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TaskDescription(@NotNull mKB mkb, android.view.View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "");
            this.AEQbTJ = mkb;
            android.view.View viewFindViewById = view.findViewById(C31976mKx.Activity.OxVOHk);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "");
            this.KWHzl = (C55024xcD) viewFindViewById;
        }

        public final void EZpvd(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.KWHzl.setTitleText(str);
            this.KWHzl.setType(0);
            this.KWHzl.setShowDescription(false);
            this.KWHzl.setClickable(false);
            C55024xcD c55024xcD = this.KWHzl;
            android.content.Context context = this.itemView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            int iOLrzqt = C55298xhM.OLrzqt(8, context);
            android.content.Context context2 = this.itemView.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            c55024xcD.setPadding(0, iOLrzqt, 0, C55298xhM.OLrzqt(4, context2));
        }
    }

    public final class Activity extends RecyclerView.ViewHolder {
        public final /* synthetic */ mKB AEQbTJ;
        public final android.view.View EZpvd;
        public C55251xgS KWHzl;
        public final OKRegularCell OLrzqt;
        public final android.view.View copydefault;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Activity(@NotNull mKB mkb, android.view.View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "");
            this.AEQbTJ = mkb;
            android.view.View viewFindViewById = view.findViewById(C31976mKx.Activity.OHqIaq);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "");
            this.OLrzqt = (OKRegularCell) viewFindViewById;
            android.view.View viewFindViewById2 = view.findViewById(C31976mKx.Activity.fJNWhG);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "");
            this.copydefault = viewFindViewById2;
            android.view.View viewFindViewById3 = view.findViewById(C31976mKx.Activity.EZpvd);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "");
            this.EZpvd = viewFindViewById3;
        }

        public final void copydefault(@NotNull final Application application, @NotNull final StateListAnimator stateListAnimator) {
            Intrinsics.checkNotNullParameter(application, "");
            Intrinsics.checkNotNullParameter(stateListAnimator, "");
            boolean zEZpvd = Intrinsics.EZpvd((java.lang.Object) application.KWHzl(), (java.lang.Object) "payload");
            this.OLrzqt.EZpvd().setVisibility(0);
            this.OLrzqt.setTitle(application.KWHzl());
            java.lang.String strEZpvd = application.EZpvd();
            if (strEZpvd == null) {
                strEZpvd = ConnectionMethod.UNDEFINED;
            }
            this.OLrzqt.setDescription(strEZpvd);
            if (application.AYXKKw()) {
                this.OLrzqt.setContentDescription("PDSkylabOverrideFor_" + application.OLrzqt());
            } else if (application.AEQbTJ()) {
                this.OLrzqt.setContentDescription("PDSkylabOverridePayloadFor_" + application.OLrzqt());
            }
            android.widget.TextView textViewAEQbTJ = this.OLrzqt.AEQbTJ();
            textViewAEQbTJ.setTextSize(2, 24.0f);
            textViewAEQbTJ.setMaxLines(1);
            textViewAEQbTJ.setEllipsize(TextUtils.TruncateAt.END);
            textViewAEQbTJ.setSingleLine(true);
            textViewAEQbTJ.setTextAppearance(C52761wXj.LoaderManager.DGOPHZ);
            textViewAEQbTJ.setTextColor(textViewAEQbTJ.getContext().getColor(application.copydefault() ? C52761wXj.Activity.fdOvFl : C52761wXj.Activity.UlJrfe));
            this.copydefault.setVisibility((application.AYXKKw() || application.AEQbTJ()) ? 0 : 8);
            this.EZpvd.setVisibility(zEZpvd ? 0 : 8);
            this.OLrzqt.valueOf();
            ViewGroup.LayoutParams layoutParams = this.OLrzqt.EZpvd().getLayoutParams();
            Intrinsics.copydefault(layoutParams, "");
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
            layoutParams2.width = -2;
            layoutParams2.weight = 0.0f;
            if (application.copydefault()) {
                android.content.Context context = this.itemView.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                C55251xgS c55251xgS = new C55251xgS(context, null, 0, 6, null);
                c55251xgS.setText("Override");
                c55251xgS.setOKDSSize(-5);
                c55251xgS.setOKDSStyle(7);
                c55251xgS.setShowIcon(true);
                this.KWHzl = c55251xgS;
                OKRegularCell oKRegularCell = this.OLrzqt;
                Intrinsics.copydefault(c55251xgS);
                android.content.Context context2 = this.itemView.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "");
                OKRegularCell.addViewBehindTitle$default(oKRegularCell, c55251xgS, C55298xhM.OLrzqt(8, context2), 0, 4, null);
                this.OLrzqt.EZpvd().post(new java.lang.Runnable() { // from class: o.mKD
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // java.lang.Runnable
                    public final void run() {
                        mKB.Activity.OLrzqt(this.copydefault);
                    }
                });
            }
            if (application.AYXKKw() || application.AEQbTJ()) {
                this.OLrzqt.setOnClickListener(new View.OnClickListener() { // from class: o.mKA
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // android.view.View.OnClickListener
                    public final void onClick(android.view.View view) {
                        mKB.Activity.copydefault(stateListAnimator, application, view);
                    }
                });
                this.OLrzqt.setClickable(true);
            } else {
                this.OLrzqt.setOnClickListener(null);
                this.OLrzqt.setClickable(false);
            }
        }

        public static final void OLrzqt(Activity activity) {
            android.widget.TextView textViewEZpvd = activity.OLrzqt.EZpvd();
            ViewGroup.LayoutParams layoutParams = textViewEZpvd.getLayoutParams();
            Intrinsics.copydefault(layoutParams, "");
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
            layoutParams2.width = -2;
            layoutParams2.weight = 0.0f;
            textViewEZpvd.setLayoutParams(layoutParams2);
        }

        public static final void copydefault(StateListAnimator stateListAnimator, Application application, android.view.View view) {
            stateListAnimator.EZpvd(application.OLrzqt(), application.AYXKKw(), application.AEQbTJ());
        }
    }

    public static final class Application {
        public java.lang.String AEQbTJ;
        public final boolean EZpvd;
        public final boolean KWHzl;
        public final java.lang.String OLrzqt;
        public boolean copydefault;
        public java.lang.String djBIcL;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application() {
            this(null, null, null, false, false, false, 63, null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Application copy$default(Application application, java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z, boolean z2, boolean z3, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = application.OLrzqt;
            }
            if ((i & 2) != 0) {
                str2 = application.djBIcL;
            }
            java.lang.String str4 = str2;
            if ((i & 4) != 0) {
                str3 = application.AEQbTJ;
            }
            java.lang.String str5 = str3;
            if ((i & 8) != 0) {
                z = application.EZpvd;
            }
            boolean z4 = z;
            if ((i & 16) != 0) {
                z2 = application.KWHzl;
            }
            boolean z5 = z2;
            if ((i & 32) != 0) {
                z3 = application.copydefault;
            }
            return application.KWHzl(str, str4, str5, z4, z5, z3);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean AEQbTJ() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean AYXKKw() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String EZpvd() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(java.lang.String str) {
            this.AEQbTJ = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String KWHzl() {
            return this.djBIcL;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Application KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, java.lang.String str3, boolean z, boolean z2, boolean z3) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            return new Application(str, str2, str3, z, z2, z3);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String OLrzqt() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(boolean z) {
            this.copydefault = z;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean copydefault() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Application)) {
                return false;
            }
            Application application = (Application) obj;
            return Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) application.OLrzqt) && Intrinsics.EZpvd((java.lang.Object) this.djBIcL, (java.lang.Object) application.djBIcL) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) application.AEQbTJ) && this.EZpvd == application.EZpvd && this.KWHzl == application.KWHzl && this.copydefault == application.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = this.OLrzqt.hashCode();
            int iHashCode2 = this.djBIcL.hashCode();
            java.lang.String str = this.AEQbTJ;
            return (((((((((iHashCode * 31) + iHashCode2) * 31) + (str == null ? 0 : str.hashCode())) * 31) + java.lang.Boolean.hashCode(this.EZpvd)) * 31) + java.lang.Boolean.hashCode(this.KWHzl)) * 31) + java.lang.Boolean.hashCode(this.copydefault);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Item(flag=" + this.OLrzqt + ", title=" + this.djBIcL + ", content=" + this.AEQbTJ + ", isOverrideValue=" + this.EZpvd + ", isOverridePayload=" + this.KWHzl + ", hasOverride=" + this.copydefault + ")";
        }

        public Application(@NotNull java.lang.String str, @NotNull java.lang.String str2, java.lang.String str3, boolean z, boolean z2, boolean z3) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            this.OLrzqt = str;
            this.djBIcL = str2;
            this.AEQbTJ = str3;
            this.EZpvd = z;
            this.KWHzl = z2;
            this.copydefault = z3;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0031: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r11v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r5v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0009: ARITH (r11v0 int) & (2 int) A[WRAPPED]) == (0 int)) ? (r6v0 java.lang.String) : (""))
  (wrap:java.lang.String:0x0014: TERNARY null = ((wrap:int:0x000f: ARITH (r11v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r7v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0015: ARITH (r11v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? false : (r8v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x001d: ARITH (r11v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? false : (r9v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0024: ARITH (r11v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? false : (r10v0 boolean))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, boolean, boolean, boolean):void (m)] (LINE:176) call: o.mKB.Application.<init>(java.lang.String, java.lang.String, java.lang.String, boolean, boolean, boolean):void type: THIS */
        public /* synthetic */ Application(java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z, boolean z2, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) == 0 ? str2 : "", (i & 4) != 0 ? null : str3, (i & 8) != 0 ? false : z, (i & 16) != 0 ? false : z2, (i & 32) != 0 ? false : z3);
        }
    }
}
