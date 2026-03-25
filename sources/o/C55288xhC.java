package o;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.uilab.toast.layoutManager.StackLayoutManager;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xhC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C55288xhC extends android.widget.FrameLayout {
    public C54927xaM AEQbTJ;
    public C55336xhy KWHzl;
    public final InterfaceC56387yDm OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C55288xhC(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C55288xhC(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    public static final int KWHzl(int i, int i2) {
        return (i - i2) - 1;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:40) call: o.xhC.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C55288xhC(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C55288xhC(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.OLrzqt = C56392yDr.copydefault(new Function0() { // from class: o.xhH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C55288xhC.copydefault();
            }
        });
        OLrzqt(context);
    }

    public static final C59534zip copydefault() {
        return new C59534zip();
    }

    private final C59534zip djBIcL() {
        return (C59534zip) this.OLrzqt.getValue();
    }

    public final void OLrzqt(android.content.Context context) {
        C54927xaM c54927xaMOLrzqt = C54927xaM.OLrzqt(android.view.LayoutInflater.from(context), this, true);
        this.AEQbTJ = c54927xaMOLrzqt;
        if (c54927xaMOLrzqt == null) {
            Intrinsics.gEmmrt("");
            c54927xaMOLrzqt = null;
        }
        c54927xaMOLrzqt.EZpvd.setVisibility(8);
        c54927xaMOLrzqt.EZpvd.setOnClickListener(new View.OnClickListener() { // from class: o.xhB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C55288xhC.AEQbTJ(this.EZpvd, view);
            }
        });
        c54927xaMOLrzqt.copydefault.setClickNotificationListener(new ActionBar());
        c54927xaMOLrzqt.KWHzl.setText(context.getString(C33089mpq.EZpvd.gEmmrt()));
    }

    public static final void AEQbTJ(C55288xhC c55288xhC, android.view.View view) {
        mAN manOLrzqt;
        C55336xhy c55336xhy = c55288xhC.KWHzl;
        if (c55336xhy == null || (manOLrzqt = c55336xhy.OLrzqt()) == null) {
            return;
        }
        manOLrzqt.AEQbTJ();
    }

    /* JADX INFO: renamed from: o.xhC$ActionBar */
    public static final class ActionBar implements mAL {
        public ActionBar() {
        }

        @Override // o.mAL
        public void EZpvd() {
            C55336xhy c55336xhy = C55288xhC.this.KWHzl;
            if (c55336xhy != null) {
                C55288xhC c55288xhC = C55288xhC.this;
                if (c55336xhy.gEmmrt() || c55336xhy.AYXKKw().size() <= 1) {
                    return;
                }
                C54927xaM c54927xaM = c55288xhC.AEQbTJ;
                if (c54927xaM == null) {
                    Intrinsics.gEmmrt("");
                    c54927xaM = null;
                }
                c54927xaM.copydefault.setCanDrag(false);
                C55336xhy c55336xhy2 = c55288xhC.KWHzl;
                if (c55336xhy2 != null) {
                    c55336xhy2.EZpvd();
                }
                C54927xaM c54927xaM2 = c55288xhC.AEQbTJ;
                if (c54927xaM2 == null) {
                    Intrinsics.gEmmrt("");
                    c54927xaM2 = null;
                }
                c54927xaM2.copydefault.setClickNotificationListener(null);
            }
        }
    }

    public final void OLrzqt() {
        C54927xaM c54927xaM = this.AEQbTJ;
        if (c54927xaM == null) {
            Intrinsics.gEmmrt("");
            c54927xaM = null;
        }
        RecyclerView recyclerView = c54927xaM.AEQbTJ;
        recyclerView.setLayoutManager(copydefault(true));
        recyclerView.setItemAnimator(new C55335xhx());
        recyclerView.setChildDrawingOrderCallback(new RecyclerView.ChildDrawingOrderCallback() { // from class: o.xhI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.recyclerview.widget.RecyclerView.ChildDrawingOrderCallback
            public final int onGetChildDrawingOrder(int i, int i2) {
                return C55288xhC.KWHzl(i, i2);
            }
        });
        djBIcL().register(android.view.View.class, new Application(C52761wXj.Fragment.KWHzl, C52758wXg.EZpvd));
    }

    /* JADX INFO: renamed from: o.xhC$Application */
    public static final class Application extends C43318rmy<android.view.View, wZI> {
        public Application(int i, int i2) {
            super(i, i2);
        }

        /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
        @Override // o.AbstractC43310rmq, o.AbstractC59533zio
        public C43312rms<wZI> onCreateViewHolder(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup) {
            Intrinsics.checkNotNullParameter(layoutInflater, "");
            Intrinsics.checkNotNullParameter(viewGroup, "");
            C43312rms<wZI> c43312rmsOnCreateViewHolder = super.onCreateViewHolder(layoutInflater, viewGroup);
            C55288xhC c55288xhC = C55288xhC.this;
            int i = C52761wXj.ActionBar.DLWbHP;
            android.content.Context context = c55288xhC.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            int iEZpvd = yII.EZpvd(C55366xib.AEQbTJ(i, context)) - C33070mpX.OLrzqt(C52761wXj.StateListAnimator.aKErDB);
            android.widget.FrameLayout frameLayout = ((wZI) c43312rmsOnCreateViewHolder.OLrzqt()).OLrzqt;
            Intrinsics.checkNotNullExpressionValue(frameLayout, "");
            frameLayout.setPadding(iEZpvd, frameLayout.getPaddingTop(), iEZpvd, frameLayout.getPaddingBottom());
            Intrinsics.checkNotNullExpressionValue(c43312rmsOnCreateViewHolder, "");
            return c43312rmsOnCreateViewHolder;
        }

        /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
        /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Lo/rms;Ljava/lang/Object;)V */
        @Override // o.AbstractC43310rmq
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(C43312rms<wZI> c43312rms, android.view.View view) {
            Intrinsics.checkNotNullParameter(c43312rms, "");
            Intrinsics.checkNotNullParameter(view, "");
            super.onBindViewHolder((C43312rms) c43312rms, view);
            ((wZI) c43312rms.OLrzqt()).OLrzqt.removeAllViews();
            android.view.ViewParent parent = view.getParent();
            if (parent instanceof android.view.ViewGroup) {
                ((android.view.ViewGroup) parent).removeAllViews();
            }
            ((wZI) c43312rms.OLrzqt()).OLrzqt.addView(view);
            C55336xhy c55336xhy = C55288xhC.this.KWHzl;
            if (c55336xhy == null || !c55336xhy.gEmmrt()) {
                return;
            }
            android.view.View view2 = c43312rms.itemView;
            view2.setAlpha(1.0f);
            view2.setScaleX(1.0f);
            view2.setScaleY(1.0f);
            C55288xhC c55288xhC = C55288xhC.this;
            android.view.View view3 = c43312rms.itemView;
            Intrinsics.checkNotNullExpressionValue(view3, "");
            c55288xhC.EZpvd(view3);
        }
    }

    public final android.view.ViewGroup KWHzl() {
        C54927xaM c54927xaM = this.AEQbTJ;
        if (c54927xaM == null) {
            Intrinsics.gEmmrt("");
            c54927xaM = null;
        }
        C55291xhF c55291xhF = c54927xaM.copydefault;
        Intrinsics.checkNotNullExpressionValue(c55291xhF, "");
        return c55291xhF;
    }

    public final void AEQbTJ(@NotNull C55336xhy c55336xhy) {
        Intrinsics.checkNotNullParameter(c55336xhy, "");
        this.KWHzl = c55336xhy;
        c55336xhy.OLrzqt(this);
        OLrzqt();
        djBIcL().setItems(c55336xhy.AYXKKw());
        C54927xaM c54927xaM = this.AEQbTJ;
        if (c54927xaM == null) {
            Intrinsics.gEmmrt("");
            c54927xaM = null;
        }
        c54927xaM.AEQbTJ.setAdapter(djBIcL());
        c54927xaM.copydefault.setCloseNotificationListener(c55336xhy.OLrzqt());
    }

    public final int AEQbTJ() {
        C54927xaM c54927xaM = this.AEQbTJ;
        if (c54927xaM == null) {
            Intrinsics.gEmmrt("");
            c54927xaM = null;
        }
        RecyclerView.LayoutManager layoutManager = c54927xaM.AEQbTJ.getLayoutManager();
        if (layoutManager instanceof LinearLayoutManager) {
            return ((LinearLayoutManager) layoutManager).findFirstVisibleItemPosition();
        }
        return 0;
    }

    public final void AYXKKw() {
        C54927xaM c54927xaM = this.AEQbTJ;
        if (c54927xaM == null) {
            Intrinsics.gEmmrt("");
            c54927xaM = null;
        }
        c54927xaM.AEQbTJ.scrollToPosition(0);
    }

    public final void EZpvd(int i) {
        C55336xhy c55336xhy = this.KWHzl;
        C54927xaM c54927xaM = null;
        if (c55336xhy == null || !c55336xhy.gEmmrt()) {
            C54927xaM c54927xaM2 = this.AEQbTJ;
            if (c54927xaM2 == null) {
                Intrinsics.gEmmrt("");
                c54927xaM2 = null;
            }
            if (!(c54927xaM2.AEQbTJ.getItemAnimator() instanceof C55335xhx)) {
                C54927xaM c54927xaM3 = this.AEQbTJ;
                if (c54927xaM3 == null) {
                    Intrinsics.gEmmrt("");
                    c54927xaM3 = null;
                }
                RecyclerView recyclerView = c54927xaM3.AEQbTJ;
                recyclerView.setItemAnimator(new C55335xhx());
                recyclerView.setLayoutManager(copydefault(true));
            }
        } else {
            C54927xaM c54927xaM4 = this.AEQbTJ;
            if (c54927xaM4 == null) {
                Intrinsics.gEmmrt("");
                c54927xaM4 = null;
            }
            if (!(c54927xaM4.AEQbTJ.getItemAnimator() instanceof C55334xhw)) {
                C54927xaM c54927xaM5 = this.AEQbTJ;
                if (c54927xaM5 == null) {
                    Intrinsics.gEmmrt("");
                    c54927xaM5 = null;
                }
                RecyclerView recyclerView2 = c54927xaM5.AEQbTJ;
                recyclerView2.setItemAnimator(new C55334xhw());
                recyclerView2.setLayoutManager(generateLayoutManager$default(this, false, 1, null));
            }
        }
        C54927xaM c54927xaM6 = this.AEQbTJ;
        if (c54927xaM6 == null) {
            Intrinsics.gEmmrt("");
        } else {
            c54927xaM = c54927xaM6;
        }
        c54927xaM.AEQbTJ.scrollToPosition(0);
        djBIcL().notifyItemInserted(i);
        C55336xhy c55336xhy2 = this.KWHzl;
        if (c55336xhy2 != null) {
            android.view.View view = c55336xhy2.AYXKKw().get(0);
            Intrinsics.checkNotNullExpressionValue(view, "");
            final android.view.View view2 = view;
            view2.post(new java.lang.Runnable() { // from class: o.xhD
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    C55288xhC.copydefault(this.copydefault, view2);
                }
            });
        }
    }

    public static final void copydefault(C55288xhC c55288xhC, android.view.View view) {
        C54927xaM c54927xaM = c55288xhC.AEQbTJ;
        if (c54927xaM == null) {
            Intrinsics.gEmmrt("");
            c54927xaM = null;
        }
        c54927xaM.copydefault.setJudgeY(view.getHeight());
    }

    public final void AEQbTJ(int i) {
        if (i == -1) {
            djBIcL().notifyDataSetChanged();
            return;
        }
        if (i == 0) {
            C54927xaM c54927xaM = this.AEQbTJ;
            C54927xaM c54927xaM2 = null;
            if (c54927xaM == null) {
                Intrinsics.gEmmrt("");
                c54927xaM = null;
            }
            int height = c54927xaM.copydefault.getHeight();
            C54927xaM c54927xaM3 = this.AEQbTJ;
            if (c54927xaM3 == null) {
                Intrinsics.gEmmrt("");
            } else {
                c54927xaM2 = c54927xaM3;
            }
            Intrinsics.copydefault(c54927xaM2.copydefault.animate().translationY(-height));
            return;
        }
        djBIcL().notifyItemRemoved(i);
    }

    public final void KWHzl(int i) {
        djBIcL().notifyItemChanged(i);
    }

    public final void AEQbTJ(int i, int i2) {
        C54927xaM c54927xaM = this.AEQbTJ;
        C54927xaM c54927xaM2 = null;
        if (c54927xaM == null) {
            Intrinsics.gEmmrt("");
            c54927xaM = null;
        }
        c54927xaM.EZpvd.setVisibility(0);
        C54927xaM c54927xaM3 = this.AEQbTJ;
        if (c54927xaM3 == null) {
            Intrinsics.gEmmrt("");
            c54927xaM3 = null;
        }
        c54927xaM3.AYXKKw.setVisibility(0);
        C54927xaM c54927xaM4 = this.AEQbTJ;
        if (c54927xaM4 == null) {
            Intrinsics.gEmmrt("");
            c54927xaM4 = null;
        }
        if (!(c54927xaM4.AEQbTJ.getItemAnimator() instanceof C55337xhz)) {
            C54927xaM c54927xaM5 = this.AEQbTJ;
            if (c54927xaM5 == null) {
                Intrinsics.gEmmrt("");
                c54927xaM5 = null;
            }
            RecyclerView recyclerView = c54927xaM5.AEQbTJ;
            recyclerView.setItemAnimator(new C55337xhz());
            recyclerView.setLayoutManager(generateLayoutManager$default(this, false, 1, null));
        }
        C54927xaM c54927xaM6 = this.AEQbTJ;
        if (c54927xaM6 == null) {
            Intrinsics.gEmmrt("");
            c54927xaM6 = null;
        }
        c54927xaM6.copydefault.getViewTreeObserver().addOnGlobalLayoutListener(new StateListAnimator());
        djBIcL().notifyItemRangeInserted(i, i2);
        C55336xhy c55336xhy = this.KWHzl;
        if (c55336xhy != null) {
            Intrinsics.copydefault(c55336xhy);
            java.util.ArrayList<android.view.View> arrayListAYXKKw = c55336xhy.AYXKKw();
            C59534zip c59534zipDjBIcL = djBIcL();
            C54927xaM c54927xaM7 = this.AEQbTJ;
            if (c54927xaM7 == null) {
                Intrinsics.gEmmrt("");
            } else {
                c54927xaM2 = c54927xaM7;
            }
            EZpvd(arrayListAYXKKw, c59534zipDjBIcL, c54927xaM2.AEQbTJ);
        }
    }

    /* JADX INFO: renamed from: o.xhC$StateListAnimator */
    public static final class StateListAnimator implements ViewTreeObserver.OnGlobalLayoutListener {
        public StateListAnimator() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            C54927xaM c54927xaM = C55288xhC.this.AEQbTJ;
            if (c54927xaM == null) {
                Intrinsics.gEmmrt("");
                c54927xaM = null;
            }
            c54927xaM.copydefault.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }
    }

    public static /* synthetic */ void setContentLayoutParams$default(C55288xhC c55288xhC, int i, int i2, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        c55288xhC.setContentLayoutParams(i, i2);
    }

    public final void setContentLayoutParams(int i, int i2) {
        if (i == 0 && i2 == 0) {
            return;
        }
        ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(-1, -1);
        layoutParams.bottomToBottom = 0;
        layoutParams.endToEnd = 0;
        layoutParams.startToStart = 0;
        layoutParams.constrainedHeight = true;
        if (i > 0) {
            ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = i;
        }
        if (i2 > 0) {
            ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = i2;
        }
        C54927xaM c54927xaM = this.AEQbTJ;
        if (c54927xaM == null) {
            Intrinsics.gEmmrt("");
            c54927xaM = null;
        }
        c54927xaM.AEQbTJ.setLayoutParams(layoutParams);
    }

    public final void EZpvd(java.util.ArrayList<android.view.View> arrayList, C59534zip c59534zip, RecyclerView recyclerView) {
        C55336xhy c55336xhy = this.KWHzl;
        new ItemTouchHelper(new C55286xhA(arrayList, c59534zip, c55336xhy != null ? c55336xhy.OLrzqt() : null, null, 8, null)).attachToRecyclerView(recyclerView);
    }

    public static /* synthetic */ RecyclerView.LayoutManager generateLayoutManager$default(C55288xhC c55288xhC, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return c55288xhC.copydefault(z);
    }

    public final RecyclerView.LayoutManager copydefault(boolean z) {
        if (z) {
            return new StackLayoutManager();
        }
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        linearLayoutManager.setStackFromEnd(true);
        return linearLayoutManager;
    }

    public final void EZpvd(android.view.View view) {
        if (view instanceof android.view.ViewGroup) {
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) view;
            if (viewGroup.getChildCount() > 0) {
                viewGroup.getChildAt(0).setVisibility(0);
            }
        }
    }
}
