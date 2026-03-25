package o;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C28001kLf;
import o.C52761wXj;
import o.qZH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kLf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C28001kLf extends android.widget.LinearLayout {
    public final C43316rmw AEQbTJ;
    public java.lang.String AYXKKw;
    public RecyclerView AhwBna;
    public Function1<? super java.lang.Integer, Unit> EZpvd;
    public int KWHzl;
    public int OLrzqt;
    public Function1<? super java.lang.String, Unit> copydefault;
    public android.widget.LinearLayout djBIcL;
    public android.widget.TextView gEmmrt;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28001kLf(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        this.AEQbTJ = new C43316rmw();
        this.AYXKKw = "";
        OLrzqt();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28001kLf(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.AEQbTJ = new C43316rmw();
        this.AYXKKw = "";
        OLrzqt();
    }

    public final void OLrzqt() {
        android.view.LayoutInflater.from(getContext()).inflate(qZH.ActionBar.getNewProxyInstance, this);
        setVisibility(8);
        this.AEQbTJ.register(java.lang.String.class, new Application());
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        linearLayoutManager.setOrientation(0);
        this.AhwBna = (RecyclerView) findViewById(qZH.StateListAnimator.onProviderDisabled);
        this.gEmmrt = (android.widget.TextView) findViewById(qZH.StateListAnimator.DjWNei);
        this.djBIcL = (android.widget.LinearLayout) findViewById(qZH.StateListAnimator.hQufeQ);
        RecyclerView recyclerView = this.AhwBna;
        if (recyclerView != null) {
            recyclerView.setLayoutManager(linearLayoutManager);
        }
        RecyclerView recyclerView2 = this.AhwBna;
        if (recyclerView2 != null) {
            recyclerView2.setAdapter(this.AEQbTJ);
        }
        RecyclerView recyclerView3 = this.AhwBna;
        if (recyclerView3 != null) {
            recyclerView3.setNestedScrollingEnabled(false);
        }
        android.widget.LinearLayout linearLayout = this.djBIcL;
        if (linearLayout != null) {
            C8003auW.copydefault(linearLayout).throttleFirst(1L, java.util.concurrent.TimeUnit.MILLISECONDS).subscribe(new InterfaceC58227yxM() { // from class: o.kLh
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    C28001kLf.OLrzqt(this.AEQbTJ, obj);
                }
            });
        }
    }

    public static final void OLrzqt(C28001kLf c28001kLf, java.lang.Object obj) {
        Function1<? super java.lang.String, Unit> function1 = c28001kLf.copydefault;
        if (function1 != null) {
            function1.invoke(c28001kLf.AYXKKw);
        }
    }

    public final void setRightFilterText(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        android.widget.TextView textView = this.gEmmrt;
        if (textView != null) {
            textView.setText(str);
        }
        this.AYXKKw = str2;
    }

    /* JADX INFO: renamed from: o.kLf$Application */
    /* JADX INFO: loaded from: classes23.dex */
    public final class Application extends AbstractC59533zio<java.lang.String, ActionBar> {
        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public Application() {
        }

        /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
        @Override // o.AbstractC59533zio
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public ActionBar onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
            Intrinsics.checkNotNullParameter(layoutInflater, "");
            Intrinsics.checkNotNullParameter(viewGroup, "");
            android.view.View viewInflate = layoutInflater.inflate(qZH.ActionBar.giSNqX, viewGroup, false);
            Intrinsics.copydefault(viewInflate);
            return new ActionBar(viewInflate);
        }

        /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
        @Override // o.AbstractC59533zio
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(@NotNull final ActionBar actionBar, @NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(actionBar, "");
            Intrinsics.checkNotNullParameter(str, "");
            actionBar.KWHzl().setText(str);
            android.widget.TextView textViewKWHzl = actionBar.KWHzl();
            final C28001kLf c28001kLf = C28001kLf.this;
            textViewKWHzl.setOnClickListener(new View.OnClickListener() { // from class: o.kLi
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C28001kLf.Application.EZpvd(c28001kLf, actionBar, view);
                }
            });
            if (actionBar.getAbsoluteAdapterPosition() == C28001kLf.this.KWHzl) {
                android.widget.TextView textViewKWHzl2 = actionBar.KWHzl();
                if (textViewKWHzl2 != null) {
                    textViewKWHzl2.setTextColor(actionBar.itemView.getContext().getResources().getColor(C52761wXj.Activity.DeEinT));
                    return;
                }
                return;
            }
            android.widget.TextView textViewKWHzl3 = actionBar.KWHzl();
            if (textViewKWHzl3 != null) {
                textViewKWHzl3.setTextColor(actionBar.itemView.getContext().getResources().getColor(C52761wXj.Activity.aappFQ));
            }
        }

        public static final void EZpvd(C28001kLf c28001kLf, ActionBar actionBar, android.view.View view) {
            RecyclerView.Adapter adapter;
            c28001kLf.KWHzl = actionBar.getAbsoluteAdapterPosition();
            RecyclerView recyclerView = c28001kLf.AhwBna;
            if (recyclerView != null && (adapter = recyclerView.getAdapter()) != null) {
                adapter.notifyDataSetChanged();
            }
            Function1 function1 = c28001kLf.EZpvd;
            if (function1 != null) {
                function1.invoke(java.lang.Integer.valueOf(c28001kLf.KWHzl));
            }
        }
    }

    /* JADX INFO: renamed from: o.kLf$ActionBar */
    /* JADX INFO: loaded from: classes23.dex */
    public static final class ActionBar extends RecyclerView.ViewHolder {
        public final android.widget.TextView OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final android.widget.TextView KWHzl() {
            return this.OLrzqt;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ActionBar(@NotNull android.view.View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "");
            android.view.View viewFindViewById = view.findViewById(qZH.StateListAnimator.MediaBrowserCompatMediaBrowserImplBaseMediaServiceConnection);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "");
            this.OLrzqt = (android.widget.TextView) viewFindViewById;
        }
    }

    public final void setFilterData(@NotNull java.util.List<java.lang.String> list, int i, @NotNull Function1<? super java.lang.Integer, Unit> function1) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(function1, "");
        if (!list.isEmpty()) {
            this.KWHzl = i;
            this.OLrzqt = list.size();
            this.EZpvd = function1;
            this.AEQbTJ.setItems(list);
            this.AEQbTJ.notifyDataSetChanged();
            setVisibility(0);
            return;
        }
        setVisibility(8);
    }

    public static /* synthetic */ void setVisible$default(C28001kLf c28001kLf, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        c28001kLf.setVisible(z);
    }

    public final void setVisible(boolean z) {
        android.view.View viewInflate = android.view.LayoutInflater.from(getContext()).inflate(qZH.ActionBar.getNewProxyInstance, this);
        if (z) {
            viewInflate.setVisibility(0);
        } else {
            viewInflate.setVisibility(8);
        }
    }
}
