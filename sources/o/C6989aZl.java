package o;

import android.view.View;
import android.widget.LinearLayout;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C32113mPz;
import o.C52761wXj;
import o.C6989aZl;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.aZl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6989aZl extends android.widget.LinearLayout {
    public final InterfaceC56387yDm AEQbTJ;
    public int AYXKKw;
    public int AhwBna;
    public RecyclerView AkhnZx;
    public final InterfaceC56387yDm DbNXlk;
    public int EZpvd;
    public final C43316rmw KWHzl;
    public Function1<? super java.lang.Integer, Unit> OLrzqt;
    public int copydefault;
    public boolean djBIcL;
    public final InterfaceC56387yDm fetchVPNInfo;
    public boolean gEmmrt;
    public boolean valueOf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6989aZl(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        this.KWHzl = new C43316rmw();
        this.DbNXlk = C56392yDr.copydefault(new Function0() { // from class: o.aZk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return java.lang.Integer.valueOf(C6989aZl.DbNXlk(this.AEQbTJ));
            }
        });
        this.AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.aZm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return java.lang.Integer.valueOf(C6989aZl.fetchVPNInfo(this.copydefault));
            }
        });
        this.AhwBna = C32113mPz.TaskDescription.fetchVPNInfo;
        this.AYXKKw = C52761wXj.Activity.gdwsGQ;
        this.fetchVPNInfo = C56392yDr.copydefault(new Function0() { // from class: o.aZn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C6989aZl.isConnected(this.OLrzqt);
            }
        });
        copydefault();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6989aZl(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.KWHzl = new C43316rmw();
        this.DbNXlk = C56392yDr.copydefault(new Function0() { // from class: o.aZk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return java.lang.Integer.valueOf(C6989aZl.DbNXlk(this.AEQbTJ));
            }
        });
        this.AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.aZm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return java.lang.Integer.valueOf(C6989aZl.fetchVPNInfo(this.copydefault));
            }
        });
        this.AhwBna = C32113mPz.TaskDescription.fetchVPNInfo;
        this.AYXKKw = C52761wXj.Activity.gdwsGQ;
        this.fetchVPNInfo = C56392yDr.copydefault(new Function0() { // from class: o.aZn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C6989aZl.isConnected(this.OLrzqt);
            }
        });
        copydefault();
    }

    public static final int DbNXlk(C6989aZl c6989aZl) {
        return c6989aZl.djBIcL ? C32113mPz.Fragment.fJNWhG : C32113mPz.Fragment.AuCTel;
    }

    private final int EZpvd() {
        return ((java.lang.Number) this.DbNXlk.getValue()).intValue();
    }

    private final int KWHzl() {
        return ((java.lang.Number) this.AEQbTJ.getValue()).intValue();
    }

    public static final int fetchVPNInfo(C6989aZl c6989aZl) {
        boolean z = c6989aZl.djBIcL;
        android.content.Context context = c6989aZl.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        return C33052mpF.EZpvd(z ? 8.0f : 12.0f, context);
    }

    public static /* synthetic */ void setDyDrawable$default(C6989aZl c6989aZl, int i, boolean z, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        c6989aZl.setDyDrawable(i, z);
    }

    public final void setDyDrawable(int i, boolean z) {
        this.AhwBna = i;
        this.valueOf = z;
        this.KWHzl.notifyDataSetChanged();
    }

    public static /* synthetic */ void setDyTextColor$default(C6989aZl c6989aZl, int i, boolean z, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        c6989aZl.setDyTextColor(i, z);
    }

    public final void setDyTextColor(int i, boolean z) {
        this.AYXKKw = i;
        this.gEmmrt = z;
        this.KWHzl.notifyDataSetChanged();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final LinearLayout.LayoutParams AEQbTJ() {
        return (LinearLayout.LayoutParams) this.fetchVPNInfo.getValue();
    }

    public static final LinearLayout.LayoutParams isConnected(C6989aZl c6989aZl) {
        if (c6989aZl.djBIcL) {
            C33566myq c33566myq = C33566myq.EZpvd;
            android.content.Context context = c6989aZl.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            int iEZpvd = c33566myq.EZpvd(context);
            android.content.Context context2 = c6989aZl.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            int iEZpvd2 = C33052mpF.EZpvd(32.0f, context2);
            android.content.Context context3 = c6989aZl.getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "");
            int iEZpvd3 = C33052mpF.EZpvd(8.0f, context3);
            int i = c6989aZl.EZpvd;
            return new LinearLayout.LayoutParams(((iEZpvd - iEZpvd2) - (iEZpvd3 * (i - 1))) / i, -2);
        }
        return new LinearLayout.LayoutParams(-2, -2);
    }

    public final void copydefault() {
        android.view.LayoutInflater.from(getContext()).inflate(EZpvd(), this);
        setVisibility(8);
        this.KWHzl.register(java.lang.String.class, new Activity());
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        linearLayoutManager.setOrientation(0);
        RecyclerView recyclerView = (RecyclerView) findViewById(C32113mPz.FragmentManager.QbewEr);
        this.AkhnZx = recyclerView;
        if (recyclerView != null) {
            recyclerView.setLayoutManager(linearLayoutManager);
        }
        RecyclerView recyclerView2 = this.AkhnZx;
        if (recyclerView2 != null) {
            recyclerView2.addItemDecoration(new C6987aZj(KWHzl(), 0));
        }
        RecyclerView recyclerView3 = this.AkhnZx;
        if (recyclerView3 != null) {
            recyclerView3.setAdapter(this.KWHzl);
        }
    }

    /* JADX INFO: renamed from: o.aZl$Activity */
    /* JADX INFO: loaded from: classes14.dex */
    public final class Activity extends AbstractC59533zio<java.lang.String, ActionBar> {
        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public Activity() {
        }

        /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
        @Override // o.AbstractC59533zio
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public ActionBar onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
            Intrinsics.checkNotNullParameter(layoutInflater, "");
            Intrinsics.checkNotNullParameter(viewGroup, "");
            android.view.View viewInflate = layoutInflater.inflate(C32113mPz.Fragment.AkhnZx, viewGroup, false);
            viewInflate.setLayoutParams(C6989aZl.this.AEQbTJ());
            Intrinsics.copydefault(viewInflate);
            return new ActionBar(viewInflate);
        }

        /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
        @Override // o.AbstractC59533zio
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(@NotNull final ActionBar actionBar, @NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(actionBar, "");
            Intrinsics.checkNotNullParameter(str, "");
            if (C6989aZl.this.valueOf) {
                actionBar.KWHzl().setBackground(C6989aZl.this.getResources().getDrawable(C6989aZl.this.AhwBna));
                actionBar.KWHzl().setTextSize(12.0f);
            } else {
                actionBar.KWHzl().setBackground(null);
                actionBar.KWHzl().setTextSize(14.0f);
            }
            actionBar.KWHzl().setText(str);
            if (C6989aZl.this.gEmmrt) {
                actionBar.KWHzl().setTextColor(ContextCompat.getColorStateList(C6989aZl.this.getContext(), C6989aZl.this.AYXKKw));
            }
            android.widget.TextView textViewKWHzl = actionBar.KWHzl();
            final C6989aZl c6989aZl = C6989aZl.this;
            textViewKWHzl.setOnClickListener(new View.OnClickListener() { // from class: o.aZo
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C6989aZl.Activity.AEQbTJ(c6989aZl, actionBar, view);
                }
            });
            int absoluteAdapterPosition = actionBar.getAbsoluteAdapterPosition();
            if (absoluteAdapterPosition != -1) {
                actionBar.KWHzl().setSelected(absoluteAdapterPosition == C6989aZl.this.copydefault);
            }
        }

        public static final void AEQbTJ(C6989aZl c6989aZl, ActionBar actionBar, android.view.View view) {
            RecyclerView.Adapter adapter;
            c6989aZl.copydefault = actionBar.getAbsoluteAdapterPosition();
            RecyclerView recyclerView = c6989aZl.AkhnZx;
            if (recyclerView != null && (adapter = recyclerView.getAdapter()) != null) {
                adapter.notifyDataSetChanged();
            }
            Function1 function1 = c6989aZl.OLrzqt;
            if (function1 != null) {
                function1.invoke(java.lang.Integer.valueOf(c6989aZl.copydefault));
            }
        }
    }

    /* JADX INFO: renamed from: o.aZl$ActionBar */
    /* JADX INFO: loaded from: classes14.dex */
    public static final class ActionBar extends RecyclerView.ViewHolder {
        public final android.widget.TextView AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final android.widget.TextView KWHzl() {
            return this.AEQbTJ;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ActionBar(@NotNull android.view.View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "");
            android.view.View viewFindViewById = view.findViewById(C32113mPz.FragmentManager.RdAHlO);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "");
            this.AEQbTJ = (android.widget.TextView) viewFindViewById;
        }
    }

    public final void setFilterData(@NotNull java.util.List<java.lang.String> list, int i, @NotNull Function1<? super java.lang.Integer, Unit> function1) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(function1, "");
        if (!list.isEmpty()) {
            this.copydefault = i;
            this.EZpvd = list.size();
            this.OLrzqt = function1;
            this.KWHzl.setItems(list);
            this.KWHzl.notifyDataSetChanged();
            setVisibility(0);
            return;
        }
        setVisibility(8);
    }

    public static /* synthetic */ void setVisible$default(C6989aZl c6989aZl, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        c6989aZl.setVisible(z);
    }

    public final void setVisible(boolean z) {
        android.view.View viewInflate = android.view.LayoutInflater.from(getContext()).inflate(EZpvd(), this);
        if (z) {
            viewInflate.setVisibility(0);
        } else {
            viewInflate.setVisibility(8);
        }
    }
}
