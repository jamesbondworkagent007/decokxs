package o;

import android.view.View;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import o.InterfaceC14776dro;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.drs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C14780drs<T extends InterfaceC14776dro> extends RecyclerView.Adapter<C14782dru> {
    public final Function1<T, Unit> EZpvd;
    public java.util.List<? extends T> KWHzl;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0008: CONSTRUCTOR 
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0004: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:15)) : (r1v0 java.util.List))
  (r2v0 kotlin.jvm.functions.Function1)
 A[MD:(java.util.List<? extends T extends o.dro>, kotlin.jvm.functions.Function1<? super T extends o.dro, kotlin.Unit>):void (m)] (LINE:14) call: o.drs.<init>(java.util.List, kotlin.jvm.functions.Function1):void type: THIS */
    public /* synthetic */ C14780drs(java.util.List list, Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? yDY.AhwBna() : list, function1);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super T extends o.dro, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public C14780drs(@NotNull java.util.List<? extends T> list, @NotNull Function1<? super T, Unit> function1) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(function1, "");
        this.EZpvd = function1;
        this.KWHzl = list;
    }

    public final void AEQbTJ(@NotNull java.util.List<? extends T> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.KWHzl = list;
        notifyDataSetChanged();
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public C14782dru onCreateViewHolder(@NotNull android.view.ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        android.content.Context context = viewGroup.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        C55377xim c55377xim = new C55377xim(context, null, 2, null);
        c55377xim.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
        c55377xim.setPadding(C55298xhM.dp2px$default(24.0f, null, 1, null), C55298xhM.dp2px$default(16.0f, null, 1, null), C55298xhM.dp2px$default(24.0f, null, 1, null), C55298xhM.dp2px$default(16.0f, null, 1, null));
        C55280xgv c55280xgv = new C55280xgv();
        C55279xgu c55279xgu = new C55279xgu();
        c55279xgu.AkhnZx(0);
        c55279xgu.isConnected(ContextCompat.getColor(viewGroup.getContext(), C52761wXj.Activity.copydefault));
        c55279xgu.OLrzqt(0.0f);
        c55279xgu.AhwBna(ContextCompat.getColor(viewGroup.getContext(), C52761wXj.Activity.copydefault));
        c55279xgu.AYXKKw(ContextCompat.getColor(viewGroup.getContext(), C52761wXj.Activity.invokespecialODCBUN));
        c55279xgu.copydefault(true);
        c55280xgv.KWHzl(c55377xim, c55279xgu);
        return new C14782dru(c55377xim);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull C14782dru c14782dru, int i) {
        Intrinsics.checkNotNullParameter(c14782dru, "");
        T t = this.KWHzl.get(i);
        C55377xim c55377ximKWHzl = c14782dru.KWHzl();
        c55377ximKWHzl.setOnClickListener(new StateListAnimator(c55377ximKWHzl, 1000L, this, t));
        android.content.Context context = c55377ximKWHzl.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        c55377ximKWHzl.setTitleText(t.copydefault(context));
        android.content.Context context2 = c55377ximKWHzl.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        c55377ximKWHzl.setDescriptionText(t.AEQbTJ(context2));
        android.content.Context context3 = c55377ximKWHzl.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "");
        c55377ximKWHzl.setStartDrawable(t.KWHzl(context3));
        c55377ximKWHzl.setEndDrawable(ContextCompat.getDrawable(c55377ximKWHzl.getContext(), C52761wXj.TaskDescription.DzkRMH));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.KWHzl.size();
    }

    /* JADX INFO: renamed from: o.drs$StateListAnimator */
    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ InterfaceC14776dro OLrzqt;
        public final /* synthetic */ C14780drs copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, C14780drs c14780drs, InterfaceC14776dro interfaceC14776dro) {
            this.EZpvd = view;
            this.KWHzl = j;
            this.copydefault = c14780drs;
            this.OLrzqt = interfaceC14776dro;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.KWHzl || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                this.copydefault.EZpvd.invoke(this.OLrzqt);
            }
        }
    }
}
