package o;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.unify_trade.biz.BizInstrument;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.oXx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C36333oXx extends AbstractC59533zio<C36328oXs, TaskDescription> {
    public final Function0<Unit> OLrzqt;

    public C36333oXx(@NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        this.OLrzqt = function0;
    }

    /* JADX INFO: renamed from: o.oXx$TaskDescription */
    public static final class TaskDescription extends RecyclerView.ViewHolder {
        public final C36107oPn copydefault;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TaskDescription(@NotNull C36107oPn c36107oPn) {
            super(c36107oPn.getRoot());
            Intrinsics.checkNotNullParameter(c36107oPn, "");
            this.copydefault = c36107oPn;
        }
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public TaskDescription onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        C36107oPn c36107oPnCopydefault = C36107oPn.copydefault(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(c36107oPnCopydefault, "");
        return new TaskDescription(c36107oPnCopydefault);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull TaskDescription taskDescription, @NotNull C36328oXs c36328oXs) {
        AbstractC54531xLw abstractC54531xLwOLrzqt;
        BizInstrument bizInstrumentValueOf;
        java.lang.String tradeSymbol;
        Intrinsics.checkNotNullParameter(taskDescription, "");
        Intrinsics.checkNotNullParameter(c36328oXs, "");
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = pWO.KWHzl().OLrzqt();
        java.lang.String str = (interfaceC54581xNrOLrzqt == null || (abstractC54531xLwOLrzqt = interfaceC54581xNrOLrzqt.OLrzqt(c36328oXs.OLrzqt())) == null || (bizInstrumentValueOf = abstractC54531xLwOLrzqt.valueOf(c36328oXs.KWHzl())) == null || (tradeSymbol = bizInstrumentValueOf.getTradeSymbol()) == null) ? "" : tradeSymbol;
        android.view.View view = taskDescription.itemView;
        view.setOnClickListener(new ActionBar(view, 1000L, this, str));
    }

    /* JADX INFO: renamed from: o.oXx$Application */
    public static final class Application implements Function1<EventParamsList, Unit> {
        public final /* synthetic */ java.lang.String KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(java.lang.String str) {
            this.KWHzl = str;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(EventParamsList eventParamsList) {
            copydefault(eventParamsList);
            return Unit.INSTANCE;
        }

        public final void copydefault(EventParamsList eventParamsList) {
            Intrinsics.checkNotNullParameter(eventParamsList, "");
            EventParamsList.put$default(eventParamsList, "token", this.KWHzl, false, 4, null);
        }
    }

    /* JADX INFO: renamed from: o.oXx$ActionBar */
    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ java.lang.String AEQbTJ;
        public final /* synthetic */ C36333oXx KWHzl;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, C36333oXx c36333oXx, java.lang.String str) {
            this.copydefault = view;
            this.OLrzqt = j;
            this.KWHzl = c36333oXx;
            this.AEQbTJ = str;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.OLrzqt || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                this.KWHzl.OLrzqt.invoke();
                C32866mlf.onEvent$default("KLine_TopNewsContent_ViewMore_Click", (TrackChannel[]) null, new Application(this.AEQbTJ), 1, (java.lang.Object) null);
            }
        }
    }
}
