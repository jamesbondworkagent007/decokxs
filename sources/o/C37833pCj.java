package o;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.uilab.item.OKRegularCell;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import o.ActivityC37844pCu;
import o.C35964oKf;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.pCj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C37833pCj extends AbstractC59533zio<ActivityC37844pCu.StateListAnimator, StateListAnimator> {
    public final Function1<ActivityC37844pCu.StateListAnimator, Unit> AEQbTJ;

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super o.pCu$StateListAnimator, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public C37833pCj(@NotNull Function1<? super ActivityC37844pCu.StateListAnimator, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.AEQbTJ = function1;
    }

    /* JADX INFO: renamed from: o.pCj$StateListAnimator */
    /* JADX INFO: loaded from: classes19.dex */
    public final class StateListAnimator extends RecyclerView.ViewHolder {
        public final /* synthetic */ C37833pCj AEQbTJ;
        public final OKRegularCell OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final OKRegularCell EZpvd() {
            return this.OLrzqt;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StateListAnimator(@NotNull C37833pCj c37833pCj, android.view.View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "");
            this.AEQbTJ = c37833pCj;
            android.view.View viewFindViewById = view.findViewById(C35964oKf.StateListAnimator.UNDaji);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "");
            this.OLrzqt = (OKRegularCell) viewFindViewById;
        }
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public StateListAnimator onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        android.view.View viewInflate = layoutInflater.inflate(C35964oKf.Application.QSBOWP, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "");
        return new StateListAnimator(this, viewInflate);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull StateListAnimator stateListAnimator, @NotNull final ActivityC37844pCu.StateListAnimator stateListAnimator2) {
        Intrinsics.checkNotNullParameter(stateListAnimator, "");
        Intrinsics.checkNotNullParameter(stateListAnimator2, "");
        stateListAnimator.EZpvd().setTitle(stateListAnimator2.KWHzl());
        stateListAnimator.itemView.setOnClickListener(new View.OnClickListener() { // from class: o.pCh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C37833pCj.EZpvd(this.AEQbTJ, stateListAnimator2, view);
            }
        });
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v10, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r3v11, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r3v12, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r3v13, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r3v3, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void EZpvd(C37833pCj c37833pCj, ActivityC37844pCu.StateListAnimator stateListAnimator, android.view.View view) {
        java.lang.String strOLrzqt;
        c37833pCj.AEQbTJ.invoke(stateListAnimator);
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        java.lang.String strOLrzqt2 = stateListAnimator.OLrzqt();
        int iHashCode = strOLrzqt2.hashCode();
        if (iHashCode != -1757553894) {
            if (iHashCode != 81860) {
                strOLrzqt = (iHashCode == 2044557 && strOLrzqt2.equals("BOLL")) ? "BOLL_SUB" : stateListAnimator.OLrzqt();
            } else if (strOLrzqt2.equals("SAR")) {
                strOLrzqt = "SAR_SUB";
            }
        } else if (strOLrzqt2.equals("VOLUME")) {
            strOLrzqt = "VOLUME_SUB";
        }
        objectRef.element = strOLrzqt;
        TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
        C32866mlf.AEQbTJ("IndicatorSettings_Full_Button_Click", (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.pCf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C37833pCj.OLrzqt(objectRef, (EventParamsList) obj);
            }
        });
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit OLrzqt(Ref.ObjectRef objectRef, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("indicator_type", (java.lang.String) objectRef.element, true);
        return Unit.INSTANCE;
    }
}
