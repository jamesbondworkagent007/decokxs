package o;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.web3Uilib.bean.InputsAndOutputsBean;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C57406yhn;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yiS, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C57438yiS extends android.widget.LinearLayout {
    public android.widget.TextView AEQbTJ;
    public final C57388yhV EZpvd;
    public RecyclerView KWHzl;
    public RecyclerView OLrzqt;
    public android.widget.TextView copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C57438yiS(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C57438yiS(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setInputLabel(@NotNull android.widget.TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "");
        this.copydefault = textView;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setInputList(@NotNull RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "");
        this.OLrzqt = recyclerView;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOutputLabel(@NotNull android.widget.TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "");
        this.AEQbTJ = textView;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOutputList(@NotNull RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "");
        this.KWHzl = recyclerView;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:21) call: o.yiS.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C57438yiS(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57438yiS(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        C57388yhV c57388yhVKWHzl = C57388yhV.KWHzl(android.view.LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(c57388yhVKWHzl, "");
        this.EZpvd = c57388yhVKWHzl;
        android.widget.TextView textView = c57388yhVKWHzl.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        this.copydefault = textView;
        RecyclerView recyclerView = c57388yhVKWHzl.KWHzl;
        Intrinsics.checkNotNullExpressionValue(recyclerView, "");
        this.OLrzqt = recyclerView;
        android.widget.TextView textView2 = c57388yhVKWHzl.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(textView2, "");
        this.AEQbTJ = textView2;
        RecyclerView recyclerView2 = c57388yhVKWHzl.copydefault;
        Intrinsics.checkNotNullExpressionValue(recyclerView2, "");
        this.KWHzl = recyclerView2;
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C57406yhn.Fragment.QUSxYX);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "");
        java.lang.String string = typedArrayObtainStyledAttributes.getString(C57406yhn.Fragment.QfsBiF);
        string = string == null ? "" : string;
        java.lang.String string2 = typedArrayObtainStyledAttributes.getString(C57406yhn.Fragment.RJOkX);
        java.lang.String str = string2 != null ? string2 : "";
        C55307xhV.AEQbTJ(this.copydefault, string);
        C55307xhV.AEQbTJ(this.AEQbTJ, str);
        setOrientation(1);
        this.OLrzqt.setLayoutManager(new LinearLayoutManager(context));
        this.OLrzqt.addItemDecoration(new C31703mAu(C55298xhM.dp2px$default(16.0f, null, 1, null), C55298xhM.dp2px$default(0.0f, null, 1, null)));
        this.OLrzqt.setHasFixedSize(true);
        this.OLrzqt.setNestedScrollingEnabled(false);
        this.OLrzqt.setAdapter(new Application(new java.util.ArrayList()));
        this.KWHzl.setLayoutManager(new LinearLayoutManager(context));
        this.KWHzl.addItemDecoration(new C31703mAu(C55298xhM.dp2px$default(16.0f, null, 1, null), C55298xhM.dp2px$default(0.0f, null, 1, null)));
        this.KWHzl.setHasFixedSize(true);
        this.KWHzl.setNestedScrollingEnabled(false);
        this.KWHzl.setAdapter(new Application(new java.util.ArrayList()));
        typedArrayObtainStyledAttributes.recycle();
        setPadding(0, C55298xhM.dpInt$default(16, (android.content.Context) null, 1, (java.lang.Object) null), 0, C55298xhM.dpInt$default(16, (android.content.Context) null, 1, (java.lang.Object) null));
    }

    public final void setViewDataBean(@NotNull InputsAndOutputsBean inputsAndOutputsBean) {
        Intrinsics.checkNotNullParameter(inputsAndOutputsBean, "");
        setInput(inputsAndOutputsBean.getInputLabel(), inputsAndOutputsBean.getInputList());
        setOutput(inputsAndOutputsBean.getOutputLabel(), inputsAndOutputsBean.getOutputList());
    }

    public final void setInput(@NotNull java.lang.String str, java.util.List<InputsAndOutputsBean.SimpleBean> list) {
        Intrinsics.checkNotNullParameter(str, "");
        C55307xhV.AEQbTJ(this.copydefault, str);
        RecyclerView.Adapter adapter = this.OLrzqt.getAdapter();
        Intrinsics.copydefault(adapter, "");
        Application application = (Application) adapter;
        application.OLrzqt(list);
        application.notifyDataSetChanged();
    }

    public final void setOutput(@NotNull java.lang.String str, java.util.List<InputsAndOutputsBean.SimpleBean> list) {
        Intrinsics.checkNotNullParameter(str, "");
        C55307xhV.AEQbTJ(this.AEQbTJ, str);
        RecyclerView.Adapter adapter = this.KWHzl.getAdapter();
        Intrinsics.copydefault(adapter, "");
        Application application = (Application) adapter;
        application.OLrzqt(list);
        application.notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: o.yiS$Application */
    public static final class Application extends RecyclerView.Adapter<StateListAnimator> {
        public final java.util.List<InputsAndOutputsBean.SimpleBean> KWHzl;

        public Application(@NotNull java.util.List<InputsAndOutputsBean.SimpleBean> list) {
            Intrinsics.checkNotNullParameter(list, "");
            this.KWHzl = list;
        }

        public final void OLrzqt(java.util.List<InputsAndOutputsBean.SimpleBean> list) {
            this.KWHzl.clear();
            if (list != null) {
                this.KWHzl.addAll(list);
            }
        }

        /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public StateListAnimator onCreateViewHolder(@NotNull android.view.ViewGroup viewGroup, int i) {
            Intrinsics.checkNotNullParameter(viewGroup, "");
            android.view.View viewInflate = android.view.LayoutInflater.from(viewGroup.getContext()).inflate(C57406yhn.TaskDescription.gEmmrt, viewGroup, false);
            Intrinsics.checkNotNullExpressionValue(viewInflate, "");
            return new StateListAnimator(viewInflate);
        }

        /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V */
        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(@NotNull StateListAnimator stateListAnimator, int i) {
            Intrinsics.checkNotNullParameter(stateListAnimator, "");
            stateListAnimator.OLrzqt(this.KWHzl.get(i), i == this.KWHzl.size() - 1);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return this.KWHzl.size();
        }
    }

    /* JADX INFO: renamed from: o.yiS$StateListAnimator */
    public static final class StateListAnimator extends RecyclerView.ViewHolder {
        public final android.widget.TextView EZpvd;
        public final android.widget.TextView OLrzqt;
        public final android.widget.TextView copydefault;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StateListAnimator(@NotNull android.view.View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "");
            android.view.View viewFindViewById = view.findViewById(C57406yhn.StateListAnimator.WS);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "");
            this.OLrzqt = (android.widget.TextView) viewFindViewById;
            android.view.View viewFindViewById2 = view.findViewById(C57406yhn.StateListAnimator.RVsVBY);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "");
            this.EZpvd = (android.widget.TextView) viewFindViewById2;
            android.view.View viewFindViewById3 = view.findViewById(C57406yhn.StateListAnimator.hCLrkq);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "");
            this.copydefault = (android.widget.TextView) viewFindViewById3;
        }

        public final void OLrzqt(@NotNull InputsAndOutputsBean.SimpleBean simpleBean, boolean z) {
            int i;
            Intrinsics.checkNotNullParameter(simpleBean, "");
            C55307xhV.AEQbTJ(this.OLrzqt, C57484yjL.AEQbTJ.KWHzl(simpleBean.getLeftInfo()));
            android.widget.TextView textView = this.EZpvd;
            if (simpleBean.getTagContent().length() > 0) {
                this.EZpvd.setText(simpleBean.getTagContent());
                i = 0;
            } else {
                i = 8;
            }
            textView.setVisibility(i);
            C55307xhV.AEQbTJ(this.copydefault, simpleBean.getRightInfo());
        }
    }
}
