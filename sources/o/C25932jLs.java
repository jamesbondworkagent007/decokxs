package o;

import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.okinc.trade.arch.util.Quartet;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.qZH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jLs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C25932jLs extends RecyclerView.Adapter<Application> {
    public final boolean AEQbTJ;
    public final boolean EZpvd;
    public java.util.List<C25937jLx> KWHzl;
    public final Function1<ViewBinding, Quartet<android.widget.ImageView, android.widget.TextView, android.widget.TextView, qXV>> OLrzqt;
    public final Function1<android.view.ViewGroup, ViewBinding> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C25932jLs() {
        this(null, null, false, false, 15, null);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x001d: CONSTRUCTOR 
  (wrap:kotlin.jvm.functions.Function1:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:kotlin.jvm.functions.Function1:0x0006: CONSTRUCTOR  A[MD:():void (m), WRAPPED] (LINE:21) call: o.jLq.<init>():void type: CONSTRUCTOR) : (r2v0 kotlin.jvm.functions.Function1))
  (wrap:kotlin.jvm.functions.Function1:?: TERNARY null = ((wrap:int:0x0009: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:kotlin.jvm.functions.Function1:0x000f: CONSTRUCTOR  A[MD:():void (m), WRAPPED] (LINE:24) call: o.jLw.<init>():void type: CONSTRUCTOR) : (r3v0 kotlin.jvm.functions.Function1))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0012: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? false : (r4v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0018: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? false : (r5v0 boolean))
 A[MD:(kotlin.jvm.functions.Function1<? super android.view.ViewGroup, ? extends androidx.viewbinding.ViewBinding>, kotlin.jvm.functions.Function1<? super androidx.viewbinding.ViewBinding, ? extends com.okinc.trade.arch.util.Quartet<? extends android.widget.ImageView, ? extends android.widget.TextView, ? extends android.widget.TextView, o.qXV>>, boolean, boolean):void (m)] (LINE:20) call: o.jLs.<init>(kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, boolean, boolean):void type: THIS */
    public /* synthetic */ C25932jLs(Function1 function1, Function1 function12, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new Function1() { // from class: o.jLq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C25932jLs.copydefault((android.view.ViewGroup) obj);
            }
        } : function1, (i & 2) != 0 ? new Function1() { // from class: o.jLw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C25932jLs.AEQbTJ((ViewBinding) obj);
            }
        } : function12, (i & 4) != 0 ? false : z, (i & 8) != 0 ? false : z2);
    }

    public static final C42815rdY copydefault(android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        return C42815rdY.AEQbTJ(android.view.LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
    }

    public static final Quartet AEQbTJ(ViewBinding viewBinding) {
        Intrinsics.checkNotNullParameter(viewBinding, "");
        C42815rdY c42815rdY = (C42815rdY) viewBinding;
        return new Quartet(c42815rdY.OLrzqt, c42815rdY.copydefault, c42815rdY.KWHzl, c42815rdY.AEQbTJ);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super android.view.ViewGroup, ? extends androidx.viewbinding.ViewBinding> */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super androidx.viewbinding.ViewBinding, ? extends com.okinc.trade.arch.util.Quartet<? extends android.widget.ImageView, ? extends android.widget.TextView, ? extends android.widget.TextView, o.qXV>> */
    /* JADX WARN: Multi-variable type inference failed */
    public C25932jLs(@NotNull Function1<? super android.view.ViewGroup, ? extends ViewBinding> function1, @NotNull Function1<? super ViewBinding, ? extends Quartet<? extends android.widget.ImageView, ? extends android.widget.TextView, ? extends android.widget.TextView, qXV>> function12, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function12, "");
        this.copydefault = function1;
        this.OLrzqt = function12;
        this.AEQbTJ = z;
        this.EZpvd = z2;
        this.KWHzl = yDY.AhwBna();
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public Application onCreateViewHolder(@NotNull android.view.ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        return new Application(this.copydefault.invoke(viewGroup), this.OLrzqt, this.AEQbTJ, this.EZpvd);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull Application application, int i) {
        Intrinsics.checkNotNullParameter(application, "");
        application.KWHzl(this.KWHzl.get(i));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.KWHzl.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int i) {
        return C33129mqd.valueOf(this.KWHzl.get(i).valueOf());
    }

    public final void copydefault(@NotNull java.util.List<C25937jLx> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.KWHzl = list;
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: o.jLs$Application */
    public static final class Application extends RecyclerView.ViewHolder {
        public final ViewBinding EZpvd;
        public final boolean KWHzl;
        public final Function1<ViewBinding, Quartet<android.widget.ImageView, android.widget.TextView, android.widget.TextView, qXV>> OLrzqt;
        public final boolean copydefault;

        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super androidx.viewbinding.ViewBinding, ? extends com.okinc.trade.arch.util.Quartet<? extends android.widget.ImageView, ? extends android.widget.TextView, ? extends android.widget.TextView, o.qXV>> */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public Application(@NotNull ViewBinding viewBinding, @NotNull Function1<? super ViewBinding, ? extends Quartet<? extends android.widget.ImageView, ? extends android.widget.TextView, ? extends android.widget.TextView, qXV>> function1, boolean z, boolean z2) {
            super(viewBinding.getRoot());
            Intrinsics.checkNotNullParameter(viewBinding, "");
            Intrinsics.checkNotNullParameter(function1, "");
            this.EZpvd = viewBinding;
            this.OLrzqt = function1;
            this.copydefault = z;
            this.KWHzl = z2;
        }

        public final void KWHzl(@NotNull C25937jLx c25937jLx) {
            Intrinsics.checkNotNullParameter(c25937jLx, "");
            Quartet<android.widget.ImageView, android.widget.TextView, android.widget.TextView, qXV> quartetInvoke = this.OLrzqt.invoke(this.EZpvd);
            android.widget.ImageView imageViewComponent1 = quartetInvoke.component1();
            android.widget.TextView textViewComponent2 = quartetInvoke.component2();
            android.widget.TextView textViewComponent3 = quartetInvoke.component3();
            qXV qxvComponent4 = quartetInvoke.component4();
            C57659ymb.EZpvd(imageViewComponent1, c25937jLx.EZpvd(), qZH.Activity.AhwBna);
            textViewComponent2.setText(c25937jLx.copydefault());
            if (this.KWHzl) {
                textViewComponent3.setText(c25937jLx.AEQbTJ());
                int modernColor$default = C41431qqg.getModernColor$default(textViewComponent3, c25937jLx.OLrzqt(), false, 2, null);
                textViewComponent3.setTextColor(modernColor$default);
                qxvComponent4.setProgressColor(modernColor$default);
            } else {
                C41426qqb.setText$default(textViewComponent3, c25937jLx.OLrzqt(), c25937jLx.AEQbTJ(), 0, 0, 0, this.copydefault, 28, (java.lang.Object) null);
                qxvComponent4.setProgressColor(c25937jLx.OLrzqt(), this.copydefault);
            }
            qxvComponent4.setProgress(c25937jLx.KWHzl(), 0);
        }
    }
}
