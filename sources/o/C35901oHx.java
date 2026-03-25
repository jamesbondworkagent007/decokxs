package o;

import android.text.Layout;
import android.text.StaticLayout;
import android.view.View;
import android.view.ViewGroup;
import androidx.cardview.widget.CardView;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.im.imui.utils.IMImageHelper;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C35399nuc;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.oHx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C35901oHx extends RecyclerView.Adapter<Activity> {
    public java.lang.Integer AEQbTJ;
    public final boolean EZpvd;
    public java.util.List<nGS> KWHzl;
    public final Function1<nGS, Unit> OLrzqt;
    public int copydefault;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 kotlin.jvm.functions.Function1)
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? false : (r2v0 boolean))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r3v0 java.lang.Integer))
 A[MD:(kotlin.jvm.functions.Function1<? super o.nGS, kotlin.Unit>, boolean, java.lang.Integer):void (m)] (LINE:28) call: o.oHx.<init>(kotlin.jvm.functions.Function1, boolean, java.lang.Integer):void type: THIS */
    public /* synthetic */ C35901oHx(Function1 function1, boolean z, java.lang.Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(function1, (i & 2) != 0 ? false : z, (i & 4) != 0 ? null : num);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super o.nGS, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public C35901oHx(@NotNull Function1<? super nGS, Unit> function1, boolean z, java.lang.Integer num) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.OLrzqt = function1;
        this.EZpvd = z;
        this.AEQbTJ = num;
        this.KWHzl = yDY.AhwBna();
        this.copydefault = 1;
    }

    public final void copydefault(@NotNull java.util.List<nGS> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.KWHzl = list;
        if (!this.EZpvd) {
            java.lang.Integer num = this.AEQbTJ;
            if (num == null) {
                copydefault();
            } else {
                Intrinsics.copydefault(num);
                this.copydefault = num.intValue();
            }
        }
        notifyDataSetChanged();
    }

    public final void copydefault() {
        int i = 1;
        if (this.KWHzl.isEmpty()) {
            this.copydefault = 1;
            return;
        }
        android.text.TextPaint textPaint = new android.text.TextPaint();
        textPaint.setTextSize(OLrzqt(12.0f));
        int iDp2px$default = C55298xhM.dp2px$default(275.0f, null, 1, null);
        if (this.EZpvd) {
            java.util.Iterator<nGS> it = this.KWHzl.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                int iCopydefault = copydefault(it.next().AEQbTJ(), textPaint, iDp2px$default);
                if (iCopydefault > i) {
                    i = iCopydefault;
                }
                if (i >= 2) {
                    i = 2;
                    break;
                }
            }
        }
        this.copydefault = i;
    }

    public final int OLrzqt(float f) {
        return (int) android.util.TypedValue.applyDimension(2, f, android.content.res.Resources.getSystem().getDisplayMetrics());
    }

    public final int copydefault(java.lang.String str, android.text.TextPaint textPaint, int i) {
        return StaticLayout.Builder.obtain(str, 0, str.length(), textPaint, i).setAlignment(Layout.Alignment.ALIGN_NORMAL).setLineSpacing(0.0f, 1.0f).setIncludePad(false).build().getLineCount();
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public Activity onCreateViewHolder(@NotNull android.view.ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        android.view.View viewInflate = android.view.LayoutInflater.from(viewGroup.getContext()).inflate(C35399nuc.Dialog.RkASWs, viewGroup, false);
        Intrinsics.copydefault(viewInflate);
        return new Activity(this, viewInflate);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull Activity activity, int i) {
        Intrinsics.checkNotNullParameter(activity, "");
        activity.EZpvd(this.KWHzl.get(i));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.KWHzl.size();
    }

    /* JADX INFO: renamed from: o.oHx$Activity */
    public final class Activity extends RecyclerView.ViewHolder {
        public final android.widget.ImageView AEQbTJ;
        public final android.widget.ImageView EZpvd;
        public final C35893oHp KWHzl;
        public final /* synthetic */ C35901oHx OLrzqt;
        public final CardView copydefault;
        public final android.widget.TextView djBIcL;
        public final android.widget.TextView gEmmrt;
        public final android.widget.TextView valueOf;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Activity(@NotNull C35901oHx c35901oHx, android.view.View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "");
            this.OLrzqt = c35901oHx;
            android.view.View viewFindViewById = view.findViewById(C35399nuc.StateListAnimator.OtRJxF);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "");
            this.valueOf = (android.widget.TextView) viewFindViewById;
            android.view.View viewFindViewById2 = view.findViewById(C35399nuc.StateListAnimator.clearCurrentKeyboardTarget);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "");
            this.gEmmrt = (android.widget.TextView) viewFindViewById2;
            android.view.View viewFindViewById3 = view.findViewById(C35399nuc.StateListAnimator.DDjgSw);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "");
            this.djBIcL = (android.widget.TextView) viewFindViewById3;
            android.view.View viewFindViewById4 = view.findViewById(C35399nuc.StateListAnimator.invokespecialsiEkQe);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "");
            this.KWHzl = (C35893oHp) viewFindViewById4;
            android.view.View viewFindViewById5 = view.findViewById(C35399nuc.StateListAnimator.pauseLocationServices);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "");
            this.EZpvd = (android.widget.ImageView) viewFindViewById5;
            android.view.View viewFindViewById6 = view.findViewById(C35399nuc.StateListAnimator.RdAHlO);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "");
            this.copydefault = (CardView) viewFindViewById6;
            android.view.View viewFindViewById7 = view.findViewById(C35399nuc.StateListAnimator.gBtXYZ);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById7, "");
            this.AEQbTJ = (android.widget.ImageView) viewFindViewById7;
        }

        public final void EZpvd(@NotNull nGS ngs) {
            Intrinsics.checkNotNullParameter(ngs, "");
            EZpvd();
            if (oGU.KWHzl.copydefault()) {
                this.copydefault.setCardBackgroundColor(ContextCompat.getColor(this.itemView.getContext(), C52761wXj.Activity.invokespecialDPHOMC));
            } else {
                this.copydefault.setCardBackgroundColor(ContextCompat.getColor(this.itemView.getContext(), C52761wXj.Activity.invokespecialaKhcqp));
            }
            this.valueOf.setText(ngs.gEmmrt());
            this.gEmmrt.setText(C33129mqd.AYXKKw(java.lang.Integer.valueOf(ngs.EZpvd())));
            if (ngs.OLrzqt() != null) {
                C35891oHn.loadGroupAvatar$default(this.KWHzl, ngs.OLrzqt(), null, 2, null);
            } else {
                this.KWHzl.setImageDrawable(IMImageHelper.OLrzqt.AhwBna());
            }
            this.djBIcL.setText(ngs.AEQbTJ());
            if (!this.OLrzqt.EZpvd) {
                this.djBIcL.setLines(this.OLrzqt.copydefault);
                this.djBIcL.setMaxLines(this.OLrzqt.copydefault);
            }
            ViewGroup.LayoutParams layoutParams = this.copydefault.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
            if (marginLayoutParams == null) {
                marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
            }
            if (this.OLrzqt.KWHzl.size() != 1) {
                if (this.OLrzqt.EZpvd) {
                    marginLayoutParams.width = -1;
                    android.content.Context context = this.itemView.getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "");
                    int iCopydefault = C55298xhM.copydefault(24.0f, context);
                    marginLayoutParams.setMarginStart(iCopydefault);
                    marginLayoutParams.setMarginEnd(iCopydefault);
                    marginLayoutParams.topMargin = 0;
                    android.content.Context context2 = this.itemView.getContext();
                    Intrinsics.checkNotNullExpressionValue(context2, "");
                    marginLayoutParams.bottomMargin = C55298xhM.copydefault(12.0f, context2);
                } else {
                    marginLayoutParams.height = -2;
                }
            } else {
                marginLayoutParams.width = -1;
                android.content.Context context3 = this.itemView.getContext();
                Intrinsics.checkNotNullExpressionValue(context3, "");
                int iCopydefault2 = C55298xhM.copydefault(12.0f, context3);
                marginLayoutParams.setMarginStart(iCopydefault2);
                marginLayoutParams.setMarginEnd(iCopydefault2);
                marginLayoutParams.topMargin = 0;
                marginLayoutParams.bottomMargin = 0;
            }
            this.copydefault.setLayoutParams(marginLayoutParams);
            this.EZpvd.setVisibility(ngs.valueOf() ? 0 : 8);
            this.AEQbTJ.setVisibility(ngs.AhwBna() ? 0 : 8);
            android.view.View view = this.itemView;
            view.setOnClickListener(new Application(view, 1000L, this.OLrzqt, ngs));
        }

        /* JADX INFO: renamed from: o.oHx$Activity$Application */
        public static final class Application implements View.OnClickListener {
            public final /* synthetic */ long AEQbTJ;
            public final /* synthetic */ nGS EZpvd;
            public final /* synthetic */ C35901oHx OLrzqt;
            public final /* synthetic */ android.view.View copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public Application(android.view.View view, long j, C35901oHx c35901oHx, nGS ngs) {
                this.copydefault = view;
                this.AEQbTJ = j;
                this.OLrzqt = c35901oHx;
                this.EZpvd = ngs;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.AEQbTJ || (this.copydefault instanceof android.widget.Checkable)) {
                    C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                    this.OLrzqt.OLrzqt.invoke(this.EZpvd);
                }
            }
        }

        private final void EZpvd() {
            this.valueOf.setText((java.lang.CharSequence) null);
            this.gEmmrt.setText((java.lang.CharSequence) null);
            this.djBIcL.setText((java.lang.CharSequence) null);
            this.KWHzl.setTaggedDrawable(null);
            this.KWHzl.setImageDrawable(null);
            this.EZpvd.setVisibility(8);
            this.itemView.setOnClickListener(null);
        }
    }
}
