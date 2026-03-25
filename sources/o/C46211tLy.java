package o;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.planet.biz_userprofile.data.PlanetProfileGroupInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C47501trL;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tLy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C46211tLy extends AbstractC43310rmq<C46194tLh, tOG> {
    public final Function1<java.util.List<PlanetProfileGroupInfo>, Unit> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C46211tLy() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Function1<java.util.List<PlanetProfileGroupInfo>, Unit> AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC43310rmq
    public int getItemLayoutId() {
        return C47501trL.Application.DBxZfM;
    }

    @Override // o.AbstractC43310rmq
    public int getVariableId() {
        return 0;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (wrap:kotlin.jvm.functions.Function1:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null kotlin.jvm.functions.Function1) : (r1v0 kotlin.jvm.functions.Function1))
 A[MD:(kotlin.jvm.functions.Function1<? super java.util.List<com.okinc.planet.biz_userprofile.data.PlanetProfileGroupInfo>, kotlin.Unit>):void (m)] (LINE:17) call: o.tLy.<init>(kotlin.jvm.functions.Function1):void type: THIS */
    public /* synthetic */ C46211tLy(Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : function1);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [o.rms, java.lang.Object] */
    @Override // o.AbstractC43310rmq
    public /* synthetic */ void onBindViewHolder(C43312rms c43312rms, C46194tLh c46194tLh) {
        onBindViewHolder((C43312rms<tOG>) c43312rms, c46194tLh);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.jvm.functions.Function1<? super java.util.List<com.okinc.planet.biz_userprofile.data.PlanetProfileGroupInfo>, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public C46211tLy(Function1<? super java.util.List<PlanetProfileGroupInfo>, Unit> function1) {
        this.copydefault = function1;
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC43310rmq, o.AbstractC59533zio
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull C43312rms<tOG> c43312rms, @NotNull C46194tLh c46194tLh) {
        Intrinsics.checkNotNullParameter(c43312rms, "");
        Intrinsics.checkNotNullParameter(c46194tLh, "");
        super.onBindViewHolder((C43312rms) c43312rms, c46194tLh);
        RecyclerView.Adapter<? extends RecyclerView.ViewHolder> bindingAdapter = c43312rms.getBindingAdapter();
        int itemCount = bindingAdapter != null ? bindingAdapter.getItemCount() : 0;
        ViewGroup.LayoutParams layoutParams = c43312rms.itemView.getLayoutParams();
        if (itemCount == 1) {
            layoutParams.width = -1;
        } else {
            layoutParams.width = C55298xhM.dp2px$default(230.0f, null, 1, null);
        }
        copydefault(c43312rms, c46194tLh.AEQbTJ());
    }

    public final void copydefault(@NotNull C43312rms<tOG> c43312rms, @NotNull java.util.List<PlanetProfileGroupInfo> list) {
        Intrinsics.checkNotNullParameter(c43312rms, "");
        Intrinsics.checkNotNullParameter(list, "");
        OLrzqt(c43312rms);
        EZpvd(c43312rms, list);
        android.view.View root = ((tOG) c43312rms.OLrzqt()).getRoot();
        root.setOnClickListener(new Application(root, 300L, root, this, list));
    }

    public final void EZpvd(C43312rms<tOG> c43312rms, java.util.List<PlanetProfileGroupInfo> list) {
        if (!list.isEmpty()) {
            ((tOG) c43312rms.OLrzqt()).AEQbTJ.setVisibility(0);
            android.widget.ImageView imageView = ((tOG) c43312rms.OLrzqt()).AEQbTJ;
            Intrinsics.checkNotNullExpressionValue(imageView, "");
            AEQbTJ(imageView, list.get(0).copydefault());
        }
        if (list.size() > 1) {
            ((tOG) c43312rms.OLrzqt()).OLrzqt.setVisibility(0);
            android.widget.ImageView imageView2 = ((tOG) c43312rms.OLrzqt()).OLrzqt;
            Intrinsics.checkNotNullExpressionValue(imageView2, "");
            AEQbTJ(imageView2, list.get(1).copydefault());
        }
        if (list.size() >= 3) {
            ((tOG) c43312rms.OLrzqt()).copydefault.setVisibility(0);
            android.widget.ImageView imageView3 = ((tOG) c43312rms.OLrzqt()).copydefault;
            Intrinsics.checkNotNullExpressionValue(imageView3, "");
            AEQbTJ(imageView3, list.get(2).copydefault());
        }
        android.widget.TextView textView = ((tOG) c43312rms.OLrzqt()).AYXKKw;
        android.content.res.Resources resources = ((tOG) c43312rms.OLrzqt()).getRoot().getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "");
        textView.setText(pTD.copydefault(resources, C47501trL.LoaderManager.EZpvd, list.size(), C56423yEv.EZpvd(C56390yDp.OLrzqt("num", java.lang.Integer.valueOf(list.size())))));
    }

    public final void OLrzqt(C43312rms<tOG> c43312rms) {
        ((tOG) c43312rms.OLrzqt()).AEQbTJ.setVisibility(8);
        ((tOG) c43312rms.OLrzqt()).OLrzqt.setVisibility(8);
        ((tOG) c43312rms.OLrzqt()).copydefault.setVisibility(8);
    }

    public final void AEQbTJ(android.widget.ImageView imageView, java.lang.String str) {
        C46443tUn.copydefault.AEQbTJ(imageView, str);
    }

    /* JADX INFO: renamed from: o.tLy$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ C46211tLy OLrzqt;
        public final /* synthetic */ java.util.List copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, android.view.View view2, C46211tLy c46211tLy, java.util.List list) {
            this.KWHzl = view;
            this.AEQbTJ = j;
            this.EZpvd = view2;
            this.OLrzqt = c46211tLy;
            this.copydefault = list;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.AEQbTJ || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                Function1<java.util.List<PlanetProfileGroupInfo>, Unit> function1AEQbTJ = this.OLrzqt.AEQbTJ();
                if (function1AEQbTJ != null) {
                    function1AEQbTJ.invoke(this.copydefault);
                }
            }
        }
    }
}
