package o;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class uFL extends AbstractC59533zio<uCB, TaskDescription> {
    public final Function1<uCB, Unit> EZpvd;

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super o.uCB, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public uFL(@NotNull Function1<? super uCB, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.EZpvd = function1;
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull TaskDescription taskDescription, @NotNull final uCB ucb) {
        Intrinsics.checkNotNullParameter(taskDescription, "");
        Intrinsics.checkNotNullParameter(ucb, "");
        C52834waB root = taskDescription.KWHzl().getRoot();
        root.setTitle(ucb.KWHzl());
        root.setTitleIcon(ucb.EZpvd());
        root.setRightIconCheck(ucb.AEQbTJ());
        root.setRightIconClick(true, new Function1() { // from class: o.uFR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return uFL.EZpvd(this.copydefault, ucb, ((java.lang.Boolean) obj).booleanValue());
            }
        });
    }

    public static final Unit EZpvd(uFL ufl, uCB ucb, boolean z) {
        ufl.EZpvd.invoke(ucb);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public TaskDescription onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        uSR usrCopydefault = uSR.copydefault(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(usrCopydefault, "");
        return new TaskDescription(usrCopydefault);
    }

    public static final class TaskDescription extends RecyclerView.ViewHolder {
        public final uSR copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final uSR KWHzl() {
            return this.copydefault;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TaskDescription(@NotNull uSR usr) {
            super(usr.getRoot());
            Intrinsics.checkNotNullParameter(usr, "");
            this.copydefault = usr;
        }
    }
}
