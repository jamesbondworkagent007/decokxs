package o;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.unify_trade.bot.data.SignalCoinPairItemData;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C48033uCm;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class vZR extends AbstractC59533zio<SignalCoinPairItemData, Application> {
    public final Function0<Unit> KWHzl;
    public final Function1<SignalCoinPairItemData, Unit> OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public vZR() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (wrap:kotlin.jvm.functions.Function1:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null kotlin.jvm.functions.Function1) : (r2v0 kotlin.jvm.functions.Function1))
  (wrap:kotlin.jvm.functions.Function0:?: TERNARY null = ((wrap:int:0x0006: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null kotlin.jvm.functions.Function0) : (r3v0 kotlin.jvm.functions.Function0))
 A[MD:(kotlin.jvm.functions.Function1<? super com.okinc.unify_trade.bot.data.SignalCoinPairItemData, kotlin.Unit>, kotlin.jvm.functions.Function0<kotlin.Unit>):void (m)] (LINE:23) call: o.vZR.<init>(kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function0):void type: THIS */
    public /* synthetic */ vZR(Function1 function1, Function0 function0, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : function1, (i & 2) != 0 ? null : function0);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.jvm.functions.Function1<? super com.okinc.unify_trade.bot.data.SignalCoinPairItemData, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public vZR(Function1<? super SignalCoinPairItemData, Unit> function1, Function0<Unit> function0) {
        this.OLrzqt = function1;
        this.KWHzl = function0;
    }

    public static final class Application extends RecyclerView.ViewHolder {
        public C52883way EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C52883way KWHzl() {
            return this.EZpvd;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Application(@NotNull android.view.View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "");
            android.view.View viewFindViewById = view.findViewById(C48033uCm.Application.FSMca);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "");
            this.EZpvd = (C52883way) viewFindViewById;
        }
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public Application onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        android.view.View viewInflate = layoutInflater.inflate(C48033uCm.Activity.DpxfQh, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "");
        return new Application(viewInflate);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull Application application, @NotNull final SignalCoinPairItemData signalCoinPairItemData) {
        Intrinsics.checkNotNullParameter(application, "");
        Intrinsics.checkNotNullParameter(signalCoinPairItemData, "");
        application.KWHzl().setTitle(signalCoinPairItemData.getTitle());
        application.KWHzl().setTitleIcon(signalCoinPairItemData.getTitleUrl());
        application.KWHzl().setTitleIcon(signalCoinPairItemData.getTitleIcon());
        application.KWHzl().setRightIconVisible(signalCoinPairItemData.isRightIconVisible());
        if (C33129mqd.OLrzqt((java.lang.Object) signalCoinPairItemData.getRightIcon(), (java.lang.Object) 0)) {
            application.KWHzl().setRightIcon(java.lang.Integer.valueOf(C52761wXj.TaskDescription.alsFma));
        } else {
            application.KWHzl().setRightIcon(signalCoinPairItemData.getRightIcon());
        }
        android.view.View view = application.itemView;
        view.setOnClickListener(new StateListAnimator(view, 1000L, signalCoinPairItemData, this));
        application.KWHzl().setRightIconClick(new Function0() { // from class: o.vZX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return vZR.AEQbTJ(signalCoinPairItemData, this);
            }
        });
        if (C33129mqd.OLrzqt((java.lang.Object) java.lang.Integer.valueOf(signalCoinPairItemData.getVPadding()), (java.lang.Object) 0)) {
            return;
        }
        application.KWHzl().setPaddingV(signalCoinPairItemData.getVPadding());
    }

    public static final Unit AEQbTJ(SignalCoinPairItemData signalCoinPairItemData, vZR vzr) {
        Function1<SignalCoinPairItemData, Unit> function1;
        if (signalCoinPairItemData.isRightClick() && (function1 = vzr.OLrzqt) != null) {
            function1.invoke(signalCoinPairItemData);
        }
        return Unit.INSTANCE;
    }

    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ vZR EZpvd;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ SignalCoinPairItemData OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, SignalCoinPairItemData signalCoinPairItemData, vZR vzr) {
            this.KWHzl = view;
            this.AEQbTJ = j;
            this.OLrzqt = signalCoinPairItemData;
            this.EZpvd = vzr;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            Function0 function0;
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.AEQbTJ || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                if (!this.OLrzqt.isItemClick() || (function0 = this.EZpvd.KWHzl) == null) {
                    return;
                }
                function0.invoke();
            }
        }
    }
}
