package o;

import android.view.View;
import androidx.core.view.OneShotPreDrawListener;
import androidx.core.view.ViewGroupKt;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class qII extends FloatingActionButton {
    public RecyclerView AEQbTJ;
    public final Activity EZpvd;
    public Function0<Unit> KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public qII(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public qII(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOnClickScrollUp$OKMarket_market_impl(Function0<Unit> function0) {
        this.KWHzl = function0;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:13) call: o.qII.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ qII(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qII(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.EZpvd = new Activity();
        if (!isInEditMode()) {
            hide();
            qIT.OLrzqt(this);
        }
        Intrinsics.checkNotNullExpressionValue(OneShotPreDrawListener.add(this, new StateListAnimator(this, this)), "");
    }

    public static final class Activity extends RecyclerView.OnScrollListener {
        public Activity() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            android.view.View view;
            Intrinsics.checkNotNullParameter(recyclerView, "");
            RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
            LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
            int iFindFirstVisibleItemPosition = linearLayoutManager != null ? linearLayoutManager.findFirstVisibleItemPosition() : -1;
            if (iFindFirstVisibleItemPosition > -1) {
                RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition = recyclerView.findViewHolderForAdapterPosition(iFindFirstVisibleItemPosition);
                if ((viewHolderFindViewHolderForAdapterPosition != null && (view = viewHolderFindViewHolderForAdapterPosition.itemView) != null && view.getTop() > 1000) || iFindFirstVisibleItemPosition > 8) {
                    qII.this.show();
                } else {
                    qII.this.hide();
                }
            }
        }
    }

    public final void EZpvd(@NotNull final RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "");
        RecyclerView recyclerView2 = this.AEQbTJ;
        if (recyclerView2 != null) {
            copydefault(recyclerView2);
        }
        recyclerView.addOnScrollListener(this.EZpvd);
        setOnClickListener(new View.OnClickListener() { // from class: o.qIJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                qII.OLrzqt(recyclerView, this, view);
            }
        });
        this.AEQbTJ = recyclerView;
    }

    public static final void OLrzqt(RecyclerView recyclerView, qII qii, android.view.View view) {
        recyclerView.smoothScrollToPosition(0);
        Function0<Unit> function0 = qii.KWHzl;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public final void copydefault(@NotNull RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "");
        recyclerView.removeOnScrollListener(this.EZpvd);
        this.AEQbTJ = null;
    }

    public static final class StateListAnimator implements java.lang.Runnable {
        public final /* synthetic */ android.view.View OLrzqt;
        public final /* synthetic */ qII copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, qII qii) {
            this.OLrzqt = view;
            this.copydefault = qii;
        }

        @Override // java.lang.Runnable
        public final void run() {
            Sequence<android.view.View> children;
            RecyclerView recyclerView;
            android.view.ViewParent parent = this.copydefault.getParent();
            android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
            if (viewGroup == null || (children = ViewGroupKt.getChildren(viewGroup)) == null) {
                return;
            }
            Sequence sequenceDbNXlk = C59467zhb.DbNXlk(children, ActionBar.EZpvd);
            Intrinsics.copydefault(sequenceDbNXlk, "");
            if (sequenceDbNXlk == null || (recyclerView = (RecyclerView) C59467zhb.zLjUOn(sequenceDbNXlk)) == null) {
                return;
            }
            this.copydefault.EZpvd(recyclerView);
        }
    }

    public static final class ActionBar implements Function1<java.lang.Object, java.lang.Boolean> {
        public static final ActionBar EZpvd = new ActionBar();

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public final java.lang.Boolean invoke(java.lang.Object obj) {
            return java.lang.Boolean.valueOf(obj instanceof RecyclerView);
        }
    }
}
