package o;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C48033uCm;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class vSU extends AbstractC59533zio<vSX, StateListAnimator> {
    public final Function1<vSX, Unit> OLrzqt;
    public final android.content.Context copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Function1<vSX, Unit> AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super o.vSX, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public vSU(@NotNull android.content.Context context, @NotNull Function1<? super vSX, Unit> function1) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(function1, "");
        this.copydefault = context;
        this.OLrzqt = function1;
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public StateListAnimator onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        android.view.View viewInflate = layoutInflater.inflate(C48033uCm.Activity.RvdRAu, viewGroup, false);
        Intrinsics.copydefault(viewInflate);
        return new StateListAnimator(viewInflate);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull StateListAnimator stateListAnimator, @NotNull vSX vsx) {
        Intrinsics.checkNotNullParameter(stateListAnimator, "");
        Intrinsics.checkNotNullParameter(vsx, "");
        stateListAnimator.copydefault().setText(xMR.formatPercent$default(xMR.copydefault, vsx.AEQbTJ(), 0, null, 4, null));
        stateListAnimator.copydefault().setSelected(vsx.KWHzl());
        android.view.View view = stateListAnimator.itemView;
        view.setOnClickListener(new Application(view, 1000L, this, vsx));
    }

    public final void KWHzl(final vSX vsx) {
        xOU xouWlaJM;
        final java.lang.String strOLrzqt;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        if (interfaceC54581xNrOLrzqt == null || (xouWlaJM = interfaceC54581xNrOLrzqt.wlaJM()) == null || (strOLrzqt = xouWlaJM.OLrzqt()) == null) {
            return;
        }
        C32866mlf.onEvent$default("LeadBotPlaceOrder_ProfitSharing_Button_Click", (TrackChannel[]) null, new Function1() { // from class: o.vSV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return vSU.copydefault(vsx, strOLrzqt, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit copydefault(vSX vsx, java.lang.String str, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "profit_sharing_ratio", vsx.AEQbTJ(), false, 4, null);
        EventParamsList.put$default(eventParamsList, "lead_bot_type", str, false, 4, null);
        return Unit.INSTANCE;
    }

    public static final class StateListAnimator extends RecyclerView.ViewHolder {
        public android.widget.TextView AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final android.widget.TextView copydefault() {
            return this.AEQbTJ;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StateListAnimator(@NotNull android.view.View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "");
            android.view.View viewFindViewById = view.findViewById(C48033uCm.Application.setMenu);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "");
            this.AEQbTJ = (android.widget.TextView) viewFindViewById;
        }
    }

    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ vSX AEQbTJ;
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ vSU OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, vSU vsu, vSX vsx) {
            this.EZpvd = view;
            this.KWHzl = j;
            this.OLrzqt = vsu;
            this.AEQbTJ = vsx;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.KWHzl || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                this.OLrzqt.AEQbTJ().invoke(this.AEQbTJ);
                this.OLrzqt.KWHzl(this.AEQbTJ);
            }
        }
    }
}
