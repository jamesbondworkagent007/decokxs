package o;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.widget.data.TradeItemBean;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C48033uCm;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wVk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C52708wVk extends android.widget.FrameLayout {
    public RecyclerView AEQbTJ;
    public Function1<? super java.lang.Integer, Unit> AhwBna;
    public java.util.ArrayList<TradeItemBean> EZpvd;
    public boolean KWHzl;
    public int OLrzqt;
    public final C59534zip copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C52708wVk(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C52708wVk(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setIsScroll(boolean z) {
        this.KWHzl = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOnClickItemListener(@NotNull Function1<? super java.lang.Integer, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.AhwBna = function1;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:21) call: o.wVk.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C52708wVk(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C52708wVk(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        C59534zip c59534zip = new C59534zip();
        this.copydefault = c59534zip;
        this.EZpvd = new java.util.ArrayList<>();
        this.OLrzqt = -1;
        this.AEQbTJ = (RecyclerView) android.view.LayoutInflater.from(context).inflate(C48033uCm.Activity.zAGdSp, this).findViewById(C48033uCm.Application.RatingCompatStyle);
        c59534zip.register(TradeItemBean.class, new Application());
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context);
        C31703mAu c31703mAu = new C31703mAu(C55298xhM.dp2px$default(8.0f, null, 1, null), 0);
        RecyclerView recyclerView = this.AEQbTJ;
        if (recyclerView != null) {
            recyclerView.addItemDecoration(c31703mAu);
        }
        linearLayoutManager.setOrientation(0);
        RecyclerView recyclerView2 = this.AEQbTJ;
        if (recyclerView2 != null) {
            recyclerView2.setLayoutManager(linearLayoutManager);
        }
        RecyclerView recyclerView3 = this.AEQbTJ;
        if (recyclerView3 != null) {
            recyclerView3.setAdapter(c59534zip);
        }
    }

    public final void setItems(java.util.ArrayList<java.lang.String> arrayList, int i) {
        this.EZpvd.clear();
        if (arrayList != null) {
            int i2 = 0;
            for (java.lang.Object obj : arrayList) {
                if (i2 < 0) {
                    yDY.AYXKKw();
                }
                this.EZpvd.add(new TradeItemBean((java.lang.String) obj, i2 == i, false, null, false, 28, null));
                i2++;
            }
        }
        this.OLrzqt = i;
        C33064mpR.OLrzqt(this.copydefault, this.EZpvd);
    }

    /* JADX INFO: renamed from: o.wVk$Application */
    /* JADX INFO: loaded from: classes17.dex */
    public final class Application extends AbstractC43310rmq<TradeItemBean, AbstractC50765vaN> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.AbstractC43310rmq
        public int getItemLayoutId() {
            return C48033uCm.Activity.HJWChPRGtXKCRGtXKC;
        }

        @Override // o.AbstractC43310rmq
        public int getVariableId() {
            return 0;
        }

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public Application() {
        }

        /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
        /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Lo/rms;Ljava/lang/Object;)V */
        @Override // o.AbstractC43310rmq
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(@NotNull C43312rms<AbstractC50765vaN> c43312rms, @NotNull TradeItemBean tradeItemBean) {
            Intrinsics.checkNotNullParameter(c43312rms, "");
            Intrinsics.checkNotNullParameter(tradeItemBean, "");
            super.onBindViewHolder((C43312rms) c43312rms, tradeItemBean);
            C54984xbQ c54984xbQ = ((AbstractC50765vaN) c43312rms.OLrzqt()).EZpvd;
            C52708wVk c52708wVk = C52708wVk.this;
            c54984xbQ.setTitle(tradeItemBean.getTitle());
            c54984xbQ.setSelectedStyle(tradeItemBean.isSelect(), 4);
            c54984xbQ.setOnClickListener(new ViewOnClickListenerC0988Application(c54984xbQ, 1000L, c52708wVk, c43312rms));
        }

        /* JADX INFO: renamed from: o.wVk$Application$Application, reason: collision with other inner class name */
        public static final class ViewOnClickListenerC0988Application implements View.OnClickListener {
            public final /* synthetic */ long AEQbTJ;
            public final /* synthetic */ C43312rms KWHzl;
            public final /* synthetic */ C52708wVk OLrzqt;
            public final /* synthetic */ android.view.View copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public ViewOnClickListenerC0988Application(android.view.View view, long j, C52708wVk c52708wVk, C43312rms c43312rms) {
                this.copydefault = view;
                this.AEQbTJ = j;
                this.OLrzqt = c52708wVk;
                this.KWHzl = c43312rms;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                RecyclerView recyclerView;
                long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.AEQbTJ || (this.copydefault instanceof android.widget.Checkable)) {
                    C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                    int size = this.OLrzqt.EZpvd.size();
                    for (int i = 0; i < size; i++) {
                        ((TradeItemBean) this.OLrzqt.EZpvd.get(i)).setSelect(false);
                    }
                    ((TradeItemBean) this.OLrzqt.EZpvd.get(this.KWHzl.getBindingAdapterPosition())).setSelect(true);
                    Function1 function1 = this.OLrzqt.AhwBna;
                    if (function1 != null) {
                        function1.invoke(java.lang.Integer.valueOf(this.KWHzl.getBindingAdapterPosition()));
                    }
                    if (this.OLrzqt.KWHzl && (recyclerView = this.OLrzqt.AEQbTJ) != null) {
                        recyclerView.smoothScrollToPosition(this.KWHzl.getBindingAdapterPosition());
                    }
                    RecyclerView.Adapter<? extends RecyclerView.ViewHolder> bindingAdapter = this.KWHzl.getBindingAdapter();
                    if (bindingAdapter != null) {
                        bindingAdapter.notifyDataSetChanged();
                    }
                }
            }
        }
    }
}
