package o;

import android.view.View;
import com.okinc.tradingbot.impl.order.strategy.signalbot.ui.itembinder.SignalBotConfirmData;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C48033uCm;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class vZN extends AbstractC59533zio<SignalBotConfirmData, vZQ> {
    public final Function0<Unit> EZpvd;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public vZN() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (wrap:kotlin.jvm.functions.Function0:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null kotlin.jvm.functions.Function0) : (r1v0 kotlin.jvm.functions.Function0))
 A[MD:(kotlin.jvm.functions.Function0<kotlin.Unit>):void (m)] (LINE:27) call: o.vZN.<init>(kotlin.jvm.functions.Function0):void type: THIS */
    public /* synthetic */ vZN(Function0 function0, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : function0);
    }

    public vZN(Function0<Unit> function0) {
        this.EZpvd = function0;
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public vZQ onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        android.view.View viewInflate = layoutInflater.inflate(C48033uCm.Activity.setLocationManually, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "");
        return new vZQ(viewInflate);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull vZQ vzq, @NotNull SignalBotConfirmData signalBotConfirmData) {
        Intrinsics.checkNotNullParameter(vzq, "");
        Intrinsics.checkNotNullParameter(signalBotConfirmData, "");
        vzq.copydefault().setText(signalBotConfirmData.KWHzl());
        C51601vqB.refreshCircleCoins$default(vzq.EZpvd(), signalBotConfirmData.AEQbTJ(), 2, 0, 4, null);
        boolean zAEQbTJ = C33129mqd.AEQbTJ(java.lang.Integer.valueOf(signalBotConfirmData.AEQbTJ().size()), 2);
        vzq.KWHzl().setVisibility(zAEQbTJ ? 0 : 8);
        C51601vqB c51601vqBEZpvd = vzq.EZpvd();
        c51601vqBEZpvd.setOnClickListener(new TaskDescription(c51601vqBEZpvd, 1000L, zAEQbTJ, this));
        android.widget.ImageView imageViewKWHzl = vzq.KWHzl();
        imageViewKWHzl.setOnClickListener(new StateListAnimator(imageViewKWHzl, 1000L, zAEQbTJ, this));
    }

    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ vZN KWHzl;
        public final /* synthetic */ boolean OLrzqt;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, boolean z, vZN vzn) {
            this.copydefault = view;
            this.EZpvd = j;
            this.OLrzqt = z;
            this.KWHzl = vzn;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            Function0 function0;
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.EZpvd || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                if (!this.OLrzqt || (function0 = this.KWHzl.EZpvd) == null) {
                    return;
                }
                function0.invoke();
            }
        }
    }

    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ boolean EZpvd;
        public final /* synthetic */ vZN KWHzl;
        public final /* synthetic */ android.view.View OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, boolean z, vZN vzn) {
            this.OLrzqt = view;
            this.AEQbTJ = j;
            this.EZpvd = z;
            this.KWHzl = vzn;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            Function0 function0;
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.AEQbTJ || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                if (!this.EZpvd || (function0 = this.KWHzl.EZpvd) == null) {
                    return;
                }
                function0.invoke();
            }
        }
    }
}
