package o;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C35964oKf;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public final class oZE extends AbstractC59533zio<java.lang.String, RecyclerView.ViewHolder> {
    public final Function0<Unit> OLrzqt;

    public oZE(@NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        this.OLrzqt = function0;
    }

    public static final class TaskDescription extends RecyclerView.ViewHolder {
        public TaskDescription(android.view.View view) {
            super(view);
        }
    }

    @Override // o.AbstractC59533zio
    public RecyclerView.ViewHolder onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        return new TaskDescription(layoutInflater.inflate(C35964oKf.Application.RbVjfb, viewGroup, false));
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull RecyclerView.ViewHolder viewHolder, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(viewHolder, "");
        Intrinsics.checkNotNullParameter(str, "");
        AbstractC58247yxg<java.lang.Object> abstractC58247yxgThrottleFirst = C8003auW.copydefault(viewHolder.itemView).throttleFirst(1L, java.util.concurrent.TimeUnit.SECONDS);
        InterfaceC58227yxM<? super java.lang.Object> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.oZC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                oZE.copydefault(this.EZpvd, obj);
            }
        };
        final Function1 function1 = new Function1() { // from class: o.oZB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return oZE.OLrzqt((java.lang.Throwable) obj);
            }
        };
        abstractC58247yxgThrottleFirst.subscribe(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.oZG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                oZE.EZpvd(function1, obj);
            }
        });
    }

    public static final void copydefault(oZE oze, java.lang.Object obj) {
        oze.OLrzqt.invoke();
    }

    public static final void EZpvd(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit OLrzqt(java.lang.Throwable th) {
        return Unit.INSTANCE;
    }
}
