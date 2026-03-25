package o;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.uilab.reminder.OKReminder;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import o.fDP;
import o.fEZ;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class fEZ implements fDP {
    public final Function1<AbstractC12784ctX, Unit> KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Function1<AbstractC12784ctX, Unit> AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super o.ctX, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public fEZ(@NotNull Function1<? super AbstractC12784ctX, Unit> function1) {
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
        android.view.View viewInflate = android.view.LayoutInflater.from(viewGroup.getContext()).inflate(C13754dXa.TaskDescription.unregister, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "");
        return new Application(viewInflate);
    }

    @Override // o.fDP
    public void OLrzqt(@NotNull RecyclerView.ViewHolder viewHolder, @NotNull java.lang.Object obj, int i) {
        Intrinsics.checkNotNullParameter(viewHolder, "");
        Intrinsics.checkNotNullParameter(obj, "");
        ((Application) viewHolder).OLrzqt((C17430fFa) obj, new Function1() { // from class: o.fEY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj2) {
                return fEZ.OLrzqt(this.KWHzl, (C17430fFa) obj2);
            }
        });
        android.view.View view = viewHolder.itemView;
        view.setOnClickListener(new ActionBar(view, 1000L, this, obj));
    }

    public static final Unit OLrzqt(fEZ fez, C17430fFa c17430fFa) {
        Intrinsics.checkNotNullParameter(c17430fFa, "");
        fez.KWHzl.invoke(c17430fFa.EZpvd());
        return Unit.INSTANCE;
    }

    public static final class Application extends RecyclerView.ViewHolder {
        public static final int copydefault = OKReminder.EZpvd;
        public final OKReminder EZpvd;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Application(@NotNull android.view.View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "");
            this.EZpvd = (OKReminder) view.findViewById(C13754dXa.ActionBar.setSubtitle);
        }

        public final void OLrzqt(@NotNull final C17430fFa c17430fFa, @NotNull final Function1<? super C17430fFa, Unit> function1) {
            Intrinsics.checkNotNullParameter(c17430fFa, "");
            Intrinsics.checkNotNullParameter(function1, "");
            this.EZpvd.setStyle(2);
            this.EZpvd.setMessage(c17430fFa.copydefault());
            this.EZpvd.OLrzqt().setBackground(null);
            this.EZpvd.setCloseIconVisibility(true);
            this.EZpvd.setPrimaryAction(c17430fFa.KWHzl(), new Function0() { // from class: o.fFb
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return fEZ.Application.KWHzl(function1, c17430fFa);
                }
            });
        }

        public static final Unit KWHzl(Function1 function1, C17430fFa c17430fFa) {
            function1.invoke(c17430fFa);
            return Unit.INSTANCE;
        }
    }

    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ java.lang.Object AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ fEZ copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, fEZ fez, java.lang.Object obj) {
            this.KWHzl = view;
            this.EZpvd = j;
            this.copydefault = fez;
            this.AEQbTJ = obj;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.EZpvd || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                Function1<AbstractC12784ctX, Unit> function1AEQbTJ = this.copydefault.AEQbTJ();
                Intrinsics.copydefault(this.AEQbTJ, "");
                function1AEQbTJ.invoke(((C17430fFa) this.AEQbTJ).EZpvd());
            }
        }
    }
}
