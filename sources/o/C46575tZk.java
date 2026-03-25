package o;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.localization.bean.LanguageItem;
import com.okinc.uilab.item.OKRegularCell;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C46526tXp;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tZk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C46575tZk extends androidx.recyclerview.widget.ListAdapter<BoF, TaskDescription> {
    public final LanguageItem.NameType EZpvd;
    public final Function1<AXZ, Unit> KWHzl;

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super o.AXZ, kotlin.Unit> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C46575tZk(@NotNull LanguageItem.NameType nameType, @NotNull Function1<? super AXZ, Unit> function1) {
        super(new C46578tZn());
        Intrinsics.checkNotNullParameter(nameType, "");
        Intrinsics.checkNotNullParameter(function1, "");
        this.EZpvd = nameType;
        this.KWHzl = function1;
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public TaskDescription onCreateViewHolder(@NotNull android.view.ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        android.view.View viewInflate = android.view.LayoutInflater.from(viewGroup.getContext()).inflate(C46526tXp.ActionBar.gEmmrt, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "");
        return new TaskDescription(viewInflate);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull TaskDescription taskDescription, int i) {
        java.lang.String strKWHzl;
        Intrinsics.checkNotNullParameter(taskDescription, "");
        AXZ axzOLrzqt = getItem(i).OLrzqt();
        taskDescription.OLrzqt().setVisibility(getItem(i).KWHzl() ? 0 : 8);
        OKRegularCell oKRegularCellCopydefault = taskDescription.copydefault();
        if (EZpvd() && C33129mqd.OLrzqt((java.lang.CharSequence) axzOLrzqt.OLrzqt())) {
            strKWHzl = axzOLrzqt.OLrzqt();
        } else {
            strKWHzl = axzOLrzqt.KWHzl();
        }
        oKRegularCellCopydefault.setTitle(strKWHzl);
        android.view.View viewEZpvd = taskDescription.EZpvd();
        viewEZpvd.setOnClickListener(new StateListAnimator(viewEZpvd, 1000L, this, axzOLrzqt));
        taskDescription.copydefault().setContentDescription(axzOLrzqt.copydefault());
    }

    /* JADX INFO: renamed from: o.tZk$TaskDescription */
    public static final class TaskDescription extends RecyclerView.ViewHolder {
        public final android.widget.ImageView KWHzl;
        public final android.view.View OLrzqt;
        public final OKRegularCell copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final android.view.View EZpvd() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final android.widget.ImageView OLrzqt() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final OKRegularCell copydefault() {
            return this.copydefault;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TaskDescription(@NotNull android.view.View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "");
            this.OLrzqt = view;
            android.view.View viewFindViewById = view.findViewById(C46526tXp.Application.fIwbmz);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "");
            this.copydefault = (OKRegularCell) viewFindViewById;
            android.view.View viewFindViewById2 = view.findViewById(C46526tXp.Application.KWHzl);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "");
            this.KWHzl = (android.widget.ImageView) viewFindViewById2;
        }
    }

    public final boolean EZpvd() {
        return this.EZpvd == LanguageItem.NameType.CEFI;
    }

    @Override // androidx.recyclerview.widget.ListAdapter
    public void submitList(java.util.List<BoF> list) {
        java.util.ArrayList arrayList;
        if (list != null) {
            arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : list) {
                BoF boF = (BoF) obj;
                if (!EZpvd() || !boF.OLrzqt().AEQbTJ()) {
                    arrayList.add(obj);
                }
            }
        } else {
            arrayList = null;
        }
        super.submitList(arrayList);
    }

    /* JADX INFO: renamed from: o.tZk$StateListAnimator */
    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ AXZ KWHzl;
        public final /* synthetic */ C46575tZk copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, C46575tZk c46575tZk, AXZ axz) {
            this.AEQbTJ = view;
            this.EZpvd = j;
            this.copydefault = c46575tZk;
            this.KWHzl = axz;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.EZpvd || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                this.copydefault.KWHzl.invoke(this.KWHzl);
            }
        }
    }
}
