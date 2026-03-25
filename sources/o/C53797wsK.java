package o;

import android.view.View;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wsK, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C53797wsK extends androidx.recyclerview.widget.ListAdapter<C53795wsI, Activity> {
    public static final Application Companion = new Application(null);
    public static final TaskDescription copydefault = new TaskDescription();
    public final Function0<Unit> AEQbTJ;
    public final Function0<Unit> EZpvd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C53797wsK(@NotNull Function0<Unit> function0, @NotNull Function0<Unit> function02) {
        super(copydefault);
        Intrinsics.checkNotNullParameter(function0, "");
        Intrinsics.checkNotNullParameter(function02, "");
        this.EZpvd = function0;
        this.AEQbTJ = function02;
    }

    public final void KWHzl(boolean z) {
        submitList(z ? C56402yEa.EZpvd(new C53795wsI(null, 1, null)) : yDY.AhwBna());
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public Activity onCreateViewHolder(@NotNull android.view.ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        uNK unkOLrzqt = uNK.OLrzqt(android.view.LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(unkOLrzqt, "");
        return new Activity(this, unkOLrzqt);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull Activity activity, int i) {
        Intrinsics.checkNotNullParameter(activity, "");
        activity.OLrzqt();
    }

    /* JADX INFO: renamed from: o.wsK$Activity */
    public final class Activity extends RecyclerView.ViewHolder {
        public final uNK KWHzl;
        public final /* synthetic */ C53797wsK OLrzqt;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Activity(@NotNull C53797wsK c53797wsK, uNK unk) {
            super(unk.getRoot());
            Intrinsics.checkNotNullParameter(unk, "");
            this.OLrzqt = c53797wsK;
            this.KWHzl = unk;
        }

        public final void OLrzqt() {
            uNK unk = this.KWHzl;
            C53797wsK c53797wsK = this.OLrzqt;
            C52794wYp c52794wYp = unk.AEQbTJ;
            c52794wYp.setOnClickListener(new ActionBar(c52794wYp, 1000L, c53797wsK));
            C52794wYp c52794wYp2 = unk.OLrzqt;
            c52794wYp2.setOnClickListener(new StateListAnimator(c52794wYp2, 1000L, c53797wsK));
        }

        /* JADX INFO: renamed from: o.wsK$Activity$ActionBar */
        public static final class ActionBar implements View.OnClickListener {
            public final /* synthetic */ long AEQbTJ;
            public final /* synthetic */ android.view.View EZpvd;
            public final /* synthetic */ C53797wsK copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public ActionBar(android.view.View view, long j, C53797wsK c53797wsK) {
                this.EZpvd = view;
                this.AEQbTJ = j;
                this.copydefault = c53797wsK;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.AEQbTJ || (this.EZpvd instanceof android.widget.Checkable)) {
                    C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                    this.copydefault.EZpvd.invoke();
                }
            }
        }

        /* JADX INFO: renamed from: o.wsK$Activity$StateListAnimator */
        public static final class StateListAnimator implements View.OnClickListener {
            public final /* synthetic */ android.view.View AEQbTJ;
            public final /* synthetic */ long KWHzl;
            public final /* synthetic */ C53797wsK copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public StateListAnimator(android.view.View view, long j, C53797wsK c53797wsK) {
                this.AEQbTJ = view;
                this.KWHzl = j;
                this.copydefault = c53797wsK;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.KWHzl || (this.AEQbTJ instanceof android.widget.Checkable)) {
                    C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                    this.copydefault.AEQbTJ.invoke();
                }
            }
        }
    }

    /* JADX INFO: renamed from: o.wsK$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.wsK.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    /* JADX INFO: renamed from: o.wsK$TaskDescription */
    public static final class TaskDescription extends DiffUtil.ItemCallback<C53795wsI> {
        /* JADX DEBUG: Method merged with bridge method: areItemsTheSame(Ljava/lang/Object;Ljava/lang/Object;)Z */
        @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public boolean areItemsTheSame(C53795wsI c53795wsI, C53795wsI c53795wsI2) {
            Intrinsics.checkNotNullParameter(c53795wsI, "");
            Intrinsics.checkNotNullParameter(c53795wsI2, "");
            return Intrinsics.EZpvd((java.lang.Object) c53795wsI.copydefault(), (java.lang.Object) c53795wsI2.copydefault());
        }

        /* JADX DEBUG: Method merged with bridge method: areContentsTheSame(Ljava/lang/Object;Ljava/lang/Object;)Z */
        @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public boolean areContentsTheSame(C53795wsI c53795wsI, C53795wsI c53795wsI2) {
            Intrinsics.checkNotNullParameter(c53795wsI, "");
            Intrinsics.checkNotNullParameter(c53795wsI2, "");
            return Intrinsics.EZpvd(c53795wsI, c53795wsI2);
        }
    }
}
