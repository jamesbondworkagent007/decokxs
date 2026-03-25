package o;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import o.C17424fEv;
import o.fDP;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fEv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C17424fEv implements fDP {
    public final Function1<Activity, Unit> KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Function1<Activity, Unit> EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super o.fEv$Activity, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public C17424fEv(@NotNull Function1<? super Activity, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.KWHzl = function1;
    }

    @Override // o.fDP
    public void AEQbTJ(@NotNull RecyclerView.ViewHolder viewHolder) {
        fDP.Activity.copydefault(this, viewHolder);
    }

    @Override // o.fDP
    public RecyclerView.ViewHolder AEQbTJ(@NotNull android.view.ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        android.view.View viewInflate = android.view.LayoutInflater.from(viewGroup.getContext()).inflate(C13754dXa.TaskDescription.gBtXYZ, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "");
        return new ActionBar(viewInflate);
    }

    @Override // o.fDP
    public void OLrzqt(@NotNull RecyclerView.ViewHolder viewHolder, @NotNull java.lang.Object obj, int i) {
        Intrinsics.checkNotNullParameter(viewHolder, "");
        Intrinsics.checkNotNullParameter(obj, "");
        ((ActionBar) viewHolder).copydefault((Activity) obj);
        android.view.View view = viewHolder.itemView;
        view.setOnClickListener(new Application(view, 1000L, this, obj));
    }

    /* JADX INFO: renamed from: o.fEv$Activity */
    public static final class Activity {
        public final AbstractC12784ctX KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final AbstractC12784ctX EZpvd() {
            return this.KWHzl;
        }

        public Activity(@NotNull AbstractC12784ctX abstractC12784ctX) {
            Intrinsics.checkNotNullParameter(abstractC12784ctX, "");
            this.KWHzl = abstractC12784ctX;
        }
    }

    /* JADX INFO: renamed from: o.fEv$ActionBar */
    public static final class ActionBar extends RecyclerView.ViewHolder {
        public final InterfaceC56387yDm EZpvd;
        public final android.widget.TextView KWHzl;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ActionBar(@NotNull android.view.View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "");
            this.EZpvd = C56392yDr.copydefault(new Function0() { // from class: o.fEu
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C17424fEv.ActionBar.OLrzqt();
                }
            });
            this.KWHzl = (android.widget.TextView) view.findViewById(C13754dXa.ActionBar.AwvSrB);
        }

        private final C17412fEj KWHzl() {
            return (C17412fEj) this.EZpvd.getValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final C17412fEj OLrzqt() {
            return new C17412fEj();
        }

        public final void copydefault(@NotNull Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "");
            this.KWHzl.setText(KWHzl().AEQbTJ(activity.EZpvd()));
        }
    }

    /* JADX INFO: renamed from: o.fEv$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ java.lang.Object AEQbTJ;
        public final /* synthetic */ C17424fEv EZpvd;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ android.view.View OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, C17424fEv c17424fEv, java.lang.Object obj) {
            this.OLrzqt = view;
            this.KWHzl = j;
            this.EZpvd = c17424fEv;
            this.AEQbTJ = obj;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r7v5, resolved type: kotlin.jvm.functions.Function1<o.fEv$Activity, kotlin.Unit> */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.KWHzl || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                this.EZpvd.EZpvd().invoke(this.AEQbTJ);
            }
        }
    }
}
