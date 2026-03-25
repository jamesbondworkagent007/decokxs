package o;

import android.view.View;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import o.C54997xbd;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xbd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C54997xbd extends android.widget.PopupWindow {
    public java.util.List<java.lang.CharSequence> AEQbTJ;
    public int AYXKKw;
    public android.content.Context EZpvd;
    public C54964xax KWHzl;
    public Function2<? super java.lang.Integer, ? super java.lang.CharSequence, Unit> OLrzqt;
    public android.view.View copydefault;
    public C59534zip gEmmrt;
    public Function2<? super java.lang.Integer, ? super java.lang.CharSequence, java.lang.Boolean> valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C54997xbd(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C54997xbd(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0, 8, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int AEQbTJ() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final android.view.View KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super java.lang.CharSequence, java.lang.Boolean>, kotlin.jvm.functions.Function2<java.lang.Integer, java.lang.CharSequence, java.lang.Boolean> */
    public final Function2<java.lang.Integer, java.lang.CharSequence, java.lang.Boolean> OLrzqt() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(Function2<? super java.lang.Integer, ? super java.lang.CharSequence, Unit> function2) {
        this.OLrzqt = function2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final android.content.Context copydefault() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (r2v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r3v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r4v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x000b: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r5v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int, int):void (m)] (LINE:33) call: o.xbd.<init>(android.content.Context, android.util.AttributeSet, int, int):void type: THIS */
    public /* synthetic */ C54997xbd(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C54997xbd(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Intrinsics.checkNotNullParameter(context, "");
        this.EZpvd = context;
        this.AYXKKw = -1;
        this.AEQbTJ = new java.util.ArrayList();
        C54964xax c54964xaxCopydefault = C54964xax.copydefault(android.view.LayoutInflater.from(this.EZpvd));
        Intrinsics.checkNotNullExpressionValue(c54964xaxCopydefault, "");
        this.KWHzl = c54964xaxCopydefault;
        setOutsideTouchable(true);
        setContentView(this.KWHzl.getRoot());
        C59534zip c59534zip = new C59534zip();
        c59534zip.setItems(this.AEQbTJ);
        c59534zip.register(java.lang.CharSequence.class, new ActionBar(c59534zip));
        this.gEmmrt = c59534zip;
        RecyclerView recyclerView = this.KWHzl.EZpvd;
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        recyclerView.setAdapter(this.gEmmrt);
        C55279xgu c55279xgu = new C55279xgu();
        c55279xgu.DbNXlk(ContextCompat.getColor(this.EZpvd, C52761wXj.Activity.gCNefq));
        c55279xgu.fIwbmz(C55298xhM.OLrzqt(1, this.EZpvd));
        c55279xgu.isConnected(ContextCompat.getColor(this.EZpvd, C52761wXj.Activity.ORmwhf));
        c55279xgu.OLrzqt(C55298xhM.EZpvd(8.0f, this.EZpvd));
        C55280xgv c55280xgv = new C55280xgv();
        RecyclerView recyclerView2 = this.KWHzl.EZpvd;
        Intrinsics.checkNotNullExpressionValue(recyclerView2, "");
        c55280xgv.KWHzl(recyclerView2, c55279xgu);
    }

    public final void OLrzqt(int i) {
        Function2<? super java.lang.Integer, ? super java.lang.CharSequence, Unit> function2;
        this.AYXKKw = i;
        if (i >= 0 && i < this.AEQbTJ.size() && (function2 = this.OLrzqt) != null) {
            function2.invoke(java.lang.Integer.valueOf(i), this.AEQbTJ.get(i));
        }
        C59534zip c59534zip = this.gEmmrt;
        if (c59534zip != null) {
            c59534zip.notifyDataSetChanged();
        }
    }

    public final void AEQbTJ(@NotNull java.util.List<java.lang.CharSequence> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.AEQbTJ = list;
        C59534zip c59534zip = this.gEmmrt;
        if (c59534zip != null) {
            c59534zip.setItems(list);
            c59534zip.notifyDataSetChanged();
        }
    }

    public final void EZpvd(android.view.View view) {
        this.KWHzl.getRoot().removeAllViews();
        if (view == null) {
            return;
        }
        this.copydefault = view;
        this.KWHzl.getRoot().addView(view);
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(android.view.View view, int i, int i2) {
        super.showAsDropDown(view, i + C55298xhM.OLrzqt(C55296xhK.OLrzqt(this.EZpvd) ? 12 : -12, this.EZpvd), 0);
    }

    /* JADX INFO: renamed from: o.xbd$ActionBar */
    public static final class ActionBar extends AbstractC59533zio<java.lang.CharSequence, Activity> {
        public final /* synthetic */ C59534zip copydefault;

        public ActionBar(C59534zip c59534zip) {
            this.copydefault = c59534zip;
        }

        /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
        @Override // o.AbstractC59533zio
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public Activity onCreateViewHolder(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup) {
            Intrinsics.checkNotNullParameter(layoutInflater, "");
            Intrinsics.checkNotNullParameter(viewGroup, "");
            C54997xbd c54997xbd = C54997xbd.this;
            android.view.View viewInflate = layoutInflater.inflate(C52761wXj.Fragment.getFieldNames, viewGroup, false);
            Intrinsics.checkNotNullExpressionValue(viewInflate, "");
            return new Activity(c54997xbd, viewInflate);
        }

        /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
        @Override // o.AbstractC59533zio
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(final Activity activity, java.lang.CharSequence charSequence) {
            Intrinsics.checkNotNullParameter(activity, "");
            Intrinsics.checkNotNullParameter(charSequence, "");
            final C54997xbd c54997xbd = C54997xbd.this;
            final C59534zip c59534zip = this.copydefault;
            boolean z = activity.getBindingAdapterPosition() == c54997xbd.AEQbTJ();
            Function2<java.lang.Integer, java.lang.CharSequence, java.lang.Boolean> function2OLrzqt = c54997xbd.OLrzqt();
            boolean z2 = !(function2OLrzqt != null && function2OLrzqt.invoke(java.lang.Integer.valueOf(activity.getBindingAdapterPosition()), charSequence).booleanValue());
            android.widget.TextView textViewAEQbTJ = activity.AEQbTJ();
            if (textViewAEQbTJ != null) {
                textViewAEQbTJ.setText(charSequence);
                textViewAEQbTJ.setTextColor(ContextCompat.getColor(c54997xbd.copydefault(), z2 ? z ? C52761wXj.Activity.fdOvFl : C52761wXj.Activity.QwvEab : C52761wXj.Activity.UlJrfe));
            }
            android.widget.ImageView imageViewOLrzqt = activity.OLrzqt();
            if (imageViewOLrzqt != null) {
                imageViewOLrzqt.setVisibility(z ? 0 : 4);
            }
            if (z2) {
                android.view.View viewEZpvd = activity.EZpvd();
                if (viewEZpvd != null) {
                    viewEZpvd.setOnClickListener(new View.OnClickListener() { // from class: o.xaZ
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // android.view.View.OnClickListener
                        public final void onClick(android.view.View view) {
                            C54997xbd.ActionBar.OLrzqt(c54997xbd, activity, c59534zip, view);
                        }
                    });
                    return;
                }
                return;
            }
            android.view.View viewEZpvd2 = activity.EZpvd();
            if (viewEZpvd2 != null) {
                viewEZpvd2.setOnClickListener(null);
            }
        }

        public static final void OLrzqt(C54997xbd c54997xbd, Activity activity, C59534zip c59534zip, android.view.View view) {
            c54997xbd.dismiss();
            c54997xbd.OLrzqt(activity.getBindingAdapterPosition());
            c59534zip.notifyDataSetChanged();
        }
    }

    /* JADX INFO: renamed from: o.xbd$Activity */
    public final class Activity extends RecyclerView.ViewHolder {
        public android.widget.TextView AEQbTJ;
        public android.widget.ImageView EZpvd;
        public final /* synthetic */ C54997xbd OLrzqt;
        public android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final android.widget.TextView AEQbTJ() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final android.view.View EZpvd() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final android.widget.ImageView OLrzqt() {
            return this.EZpvd;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Activity(@NotNull C54997xbd c54997xbd, android.view.View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "");
            this.OLrzqt = c54997xbd;
            this.copydefault = view.findViewById(C52761wXj.FragmentManager.DaRZkR);
            this.AEQbTJ = (android.widget.TextView) view.findViewById(C52761wXj.FragmentManager.reset);
            this.EZpvd = (android.widget.ImageView) view.findViewById(C52761wXj.FragmentManager.dmfpNf);
            C55279xgu c55279xgu = new C55279xgu();
            c55279xgu.AkhnZx(0);
            c55279xgu.AhwBna(ContextCompat.getColor(c54997xbd.copydefault(), C52761wXj.Activity.aBDePw));
            c55279xgu.AYXKKw(ContextCompat.getColor(c54997xbd.copydefault(), C52761wXj.Activity.invokespecialODCBUN));
            c55279xgu.valueOf(ContextCompat.getColor(c54997xbd.copydefault(), C52761wXj.Activity.UlJrfe));
            c55279xgu.copydefault(true);
            C55280xgv c55280xgv = new C55280xgv();
            android.view.View view2 = this.copydefault;
            Intrinsics.copydefault(view2);
            c55280xgv.KWHzl(view2, c55279xgu);
        }
    }
}
