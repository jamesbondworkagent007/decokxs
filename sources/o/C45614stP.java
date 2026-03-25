package o;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.KeyEventDispatcher;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o.C45614stP;
import o.C47315tni;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.stP, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C45614stP extends AbstractC52786wYh {
    public final InterfaceC56387yDm EZpvd = C56392yDr.copydefault(new Function0() { // from class: o.stM
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C45614stP.AYXKKw(this.KWHzl);
        }
    });
    public final InterfaceC56387yDm KWHzl = C56392yDr.copydefault(new Function0() { // from class: o.stO
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C45614stP.gEmmrt(this.AEQbTJ);
        }
    });
    public final InterfaceC56387yDm OLrzqt = C56392yDr.copydefault(new Function0() { // from class: o.stQ
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C45614stP.fetchVPNInfo(this.EZpvd);
        }
    });
    public final InterfaceC56387yDm copydefault = C56392yDr.copydefault(new Function0() { // from class: o.stN
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C45614stP.DbNXlk(this.copydefault);
        }
    });

    /* JADX INFO: renamed from: o.stP$TaskDescription */
    /* JADX INFO: loaded from: classes16.dex */
    public interface TaskDescription {
        void copydefault(int i, @NotNull java.lang.String str, java.lang.String str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC52792wYn
    public void EZpvd(@NotNull C55198xfS c55198xfS) {
        Intrinsics.checkNotNullParameter(c55198xfS, "");
    }

    public final java.lang.String EZpvd() {
        return (java.lang.String) this.EZpvd.getValue();
    }

    public static final java.lang.String AYXKKw(C45614stP c45614stP) {
        android.os.Bundle arguments = c45614stP.getArguments();
        if (arguments != null) {
            return arguments.getString("title");
        }
        return null;
    }

    private final java.util.List<java.lang.String> AEQbTJ() {
        return (java.util.List) this.KWHzl.getValue();
    }

    public static final java.util.List gEmmrt(C45614stP c45614stP) {
        java.util.ArrayList<java.lang.String> stringArrayList;
        android.os.Bundle arguments = c45614stP.getArguments();
        return (arguments == null || (stringArrayList = arguments.getStringArrayList("list")) == null) ? yDY.AhwBna() : stringArrayList;
    }

    public final java.lang.String OLrzqt() {
        return (java.lang.String) this.OLrzqt.getValue();
    }

    public static final java.lang.String fetchVPNInfo(C45614stP c45614stP) {
        android.os.Bundle arguments = c45614stP.getArguments();
        if (arguments != null) {
            return arguments.getString("current");
        }
        return null;
    }

    public final java.lang.String KWHzl() {
        return (java.lang.String) this.copydefault.getValue();
    }

    public static final java.lang.String DbNXlk(C45614stP c45614stP) {
        android.os.Bundle arguments = c45614stP.getArguments();
        if (arguments != null) {
            return arguments.getString("tag");
        }
        return null;
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull C52781wYc c52781wYc) {
        Intrinsics.checkNotNullParameter(c52781wYc, "");
        super.onCreateHeader(c52781wYc);
        c52781wYc.setType(9);
        java.lang.String strEZpvd = EZpvd();
        if (strEZpvd != null) {
            c52781wYc.setTitle(strEZpvd);
        }
    }

    @Override // o.AbstractC52786wYh, o.AbstractC52792wYn, o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        android.view.View viewInflate = getCustomLayoutInflater().inflate(C47315tni.ActionBar.wlaJM, (android.view.ViewGroup) constraintLayout, false);
        Intrinsics.copydefault(viewInflate);
        KWHzl(viewInflate);
        constraintLayout.addView(viewInflate);
    }

    private final void KWHzl(android.view.View view) {
        view.post(new java.lang.Runnable() { // from class: o.stV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C45614stP.djBIcL(this.copydefault);
            }
        });
        RecyclerView recyclerView = (RecyclerView) view.findViewById(C47315tni.TaskDescription.QfJbVf);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity(), 1, false));
        C59534zip c59534zip = new C59534zip();
        c59534zip.register(java.lang.String.class, new ActionBar());
        c59534zip.setItems(AEQbTJ());
        recyclerView.setAdapter(c59534zip);
    }

    public static final void djBIcL(C45614stP c45614stP) {
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) c45614stP, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    /* JADX INFO: renamed from: o.stP$ActionBar */
    public static final class ActionBar extends AbstractC59533zio<java.lang.String, RecyclerView.ViewHolder> {
        public ActionBar() {
        }

        /* JADX INFO: renamed from: o.stP$ActionBar$TaskDescription */
        public static final class TaskDescription extends RecyclerView.ViewHolder {
            public TaskDescription(android.view.View view) {
                super(view);
            }
        }

        @Override // o.AbstractC59533zio
        public RecyclerView.ViewHolder onCreateViewHolder(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup) {
            Intrinsics.checkNotNullParameter(layoutInflater, "");
            Intrinsics.checkNotNullParameter(viewGroup, "");
            return new TaskDescription(layoutInflater.inflate(C47315tni.ActionBar.gGvvIC, viewGroup, false));
        }

        /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
        @Override // o.AbstractC59533zio
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(final RecyclerView.ViewHolder viewHolder, final java.lang.String str) {
            Intrinsics.checkNotNullParameter(viewHolder, "");
            Intrinsics.checkNotNullParameter(str, "");
            android.view.View viewFindViewById = viewHolder.itemView.findViewById(C47315tni.TaskDescription.fZBcTu);
            C45614stP c45614stP = C45614stP.this;
            android.widget.TextView textView = (android.widget.TextView) viewFindViewById;
            textView.setText(str);
            textView.setCompoundDrawablesWithIntrinsicBounds(0, 0, Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) c45614stP.OLrzqt()) ? C52761wXj.TaskDescription.gGNlxh : 0, 0);
            android.view.View view = viewHolder.itemView;
            final C45614stP c45614stP2 = C45614stP.this;
            view.setOnClickListener(new View.OnClickListener() { // from class: o.stU
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view2) {
                    C45614stP.ActionBar.EZpvd(c45614stP2, viewHolder, str, view2);
                }
            });
        }

        public static final void EZpvd(C45614stP c45614stP, RecyclerView.ViewHolder viewHolder, java.lang.String str, android.view.View view) {
            c45614stP.dismissAllowingStateLoss();
            KeyEventDispatcher.Component activity = c45614stP.getActivity();
            TaskDescription taskDescription = activity instanceof TaskDescription ? (TaskDescription) activity : null;
            if (taskDescription != null) {
                taskDescription.copydefault(viewHolder.getAbsoluteAdapterPosition(), str, c45614stP.KWHzl());
            }
        }
    }

    @Override // o.wXX
    public void onSetBehavior(@NotNull BottomSheetBehavior<android.widget.FrameLayout> bottomSheetBehavior) {
        Intrinsics.checkNotNullParameter(bottomSheetBehavior, "");
        super.onSetBehavior(bottomSheetBehavior);
        bottomSheetBehavior.setDraggable(false);
    }
}
