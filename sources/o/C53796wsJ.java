package o;

import android.view.View;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wsJ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C53796wsJ extends androidx.recyclerview.widget.ListAdapter<C53799wsM, ActionBar> {
    public static final Application Companion = new Application(null);
    public static final Activity KWHzl = new Activity();
    public final Function0<Unit> EZpvd;
    public final Function0<Unit> OLrzqt;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C53796wsJ(@NotNull Function0<Unit> function0, @NotNull Function0<Unit> function02) {
        super(KWHzl);
        Intrinsics.checkNotNullParameter(function0, "");
        Intrinsics.checkNotNullParameter(function02, "");
        this.EZpvd = function0;
        this.OLrzqt = function02;
    }

    public final void copydefault(boolean z) {
        submitList(z ? C56402yEa.EZpvd(new C53799wsM(null, 1, null)) : yDY.AhwBna());
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public ActionBar onCreateViewHolder(@NotNull android.view.ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        uNQ unqOLrzqt = uNQ.OLrzqt(android.view.LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(unqOLrzqt, "");
        return new ActionBar(this, unqOLrzqt);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull ActionBar actionBar, int i) {
        Intrinsics.checkNotNullParameter(actionBar, "");
        actionBar.EZpvd();
    }

    /* JADX INFO: renamed from: o.wsJ$ActionBar */
    public final class ActionBar extends RecyclerView.ViewHolder {
        public final uNQ EZpvd;
        public final /* synthetic */ C53796wsJ OLrzqt;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ActionBar(@NotNull C53796wsJ c53796wsJ, uNQ unq) {
            super(unq.getRoot());
            Intrinsics.checkNotNullParameter(unq, "");
            this.OLrzqt = c53796wsJ;
            this.EZpvd = unq;
        }

        public final void EZpvd() {
            uNQ unq = this.EZpvd;
            C53796wsJ c53796wsJ = this.OLrzqt;
            C52794wYp c52794wYp = unq.AEQbTJ;
            c52794wYp.setOnClickListener(new ViewOnClickListenerC0990ActionBar(c52794wYp, 1000L, c53796wsJ));
            C52794wYp c52794wYp2 = unq.EZpvd;
            c52794wYp2.setOnClickListener(new Activity(c52794wYp2, 1000L, c53796wsJ));
        }

        /* JADX INFO: renamed from: o.wsJ$ActionBar$ActionBar, reason: collision with other inner class name */
        public static final class ViewOnClickListenerC0990ActionBar implements View.OnClickListener {
            public final /* synthetic */ android.view.View AEQbTJ;
            public final /* synthetic */ long KWHzl;
            public final /* synthetic */ C53796wsJ copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public ViewOnClickListenerC0990ActionBar(android.view.View view, long j, C53796wsJ c53796wsJ) {
                this.AEQbTJ = view;
                this.KWHzl = j;
                this.copydefault = c53796wsJ;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.KWHzl || (this.AEQbTJ instanceof android.widget.Checkable)) {
                    C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                    this.copydefault.EZpvd.invoke();
                }
            }
        }

        /* JADX INFO: renamed from: o.wsJ$ActionBar$Activity */
        public static final class Activity implements View.OnClickListener {
            public final /* synthetic */ C53796wsJ AEQbTJ;
            public final /* synthetic */ android.view.View KWHzl;
            public final /* synthetic */ long copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public Activity(android.view.View view, long j, C53796wsJ c53796wsJ) {
                this.KWHzl = view;
                this.copydefault = j;
                this.AEQbTJ = c53796wsJ;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.copydefault || (this.KWHzl instanceof android.widget.Checkable)) {
                    C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                    this.AEQbTJ.OLrzqt.invoke();
                }
            }
        }
    }

    /* JADX INFO: renamed from: o.wsJ$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.wsJ.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    /* JADX INFO: renamed from: o.wsJ$Activity */
    public static final class Activity extends DiffUtil.ItemCallback<C53799wsM> {
        /* JADX DEBUG: Method merged with bridge method: areItemsTheSame(Ljava/lang/Object;Ljava/lang/Object;)Z */
        @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public boolean areItemsTheSame(C53799wsM c53799wsM, C53799wsM c53799wsM2) {
            Intrinsics.checkNotNullParameter(c53799wsM, "");
            Intrinsics.checkNotNullParameter(c53799wsM2, "");
            return Intrinsics.EZpvd((java.lang.Object) c53799wsM.OLrzqt(), (java.lang.Object) c53799wsM2.OLrzqt());
        }

        /* JADX DEBUG: Method merged with bridge method: areContentsTheSame(Ljava/lang/Object;Ljava/lang/Object;)Z */
        @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public boolean areContentsTheSame(C53799wsM c53799wsM, C53799wsM c53799wsM2) {
            Intrinsics.checkNotNullParameter(c53799wsM, "");
            Intrinsics.checkNotNullParameter(c53799wsM2, "");
            return Intrinsics.EZpvd(c53799wsM, c53799wsM2);
        }
    }
}
