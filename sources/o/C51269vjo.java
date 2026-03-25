package o;

import android.view.View;
import com.okinc.unify_trade.biz.BotParamTickerData;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C32113mPz;
import o.C48033uCm;
import o.C55688xof;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.vjo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C51269vjo extends AbstractC59533zio<BotParamTickerData, C51270vjp> {
    public final Function0<Unit> OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C51269vjo() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (wrap:kotlin.jvm.functions.Function0:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null kotlin.jvm.functions.Function0) : (r1v0 kotlin.jvm.functions.Function0))
 A[MD:(kotlin.jvm.functions.Function0<kotlin.Unit>):void (m)] (LINE:20) call: o.vjo.<init>(kotlin.jvm.functions.Function0):void type: THIS */
    public /* synthetic */ C51269vjo(Function0 function0, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : function0);
    }

    public C51269vjo(Function0<Unit> function0) {
        this.OLrzqt = function0;
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public C51270vjp onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        android.view.View viewInflate = layoutInflater.inflate(C48033uCm.Activity.UfveVb, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "");
        return new C51270vjp(viewInflate);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull C51270vjp c51270vjp, @NotNull BotParamTickerData botParamTickerData) {
        C55318xhg c55318xhgEZpvd;
        C55318xhg c55318xhgEZpvd2;
        C55320xhi c55320xhiKWHzl;
        C55320xhi c55320xhiKWHzl2;
        C55320xhi c55320xhiKWHzl3;
        Intrinsics.checkNotNullParameter(c51270vjp, "");
        Intrinsics.checkNotNullParameter(botParamTickerData, "");
        C55312xha c55312xhaValueOf = c51270vjp.EZpvd().valueOf();
        if (c55312xhaValueOf != null && (c55320xhiKWHzl3 = c55312xhaValueOf.KWHzl()) != null) {
            c55320xhiKWHzl3.setText(botParamTickerData.getTitle());
        }
        C55312xha c55312xhaValueOf2 = c51270vjp.EZpvd().valueOf();
        if (c55312xhaValueOf2 != null && (c55320xhiKWHzl2 = c55312xhaValueOf2.KWHzl()) != null) {
            c55320xhiKWHzl2.setTextColor(C33070mpX.copydefault(C32113mPz.ActionBar.iwGUEr));
        }
        C55312xha c55312xhaValueOf3 = c51270vjp.EZpvd().valueOf();
        if (c55312xhaValueOf3 != null && (c55320xhiKWHzl = c55312xhaValueOf3.KWHzl()) != null) {
            c55320xhiKWHzl.setTypeface(C55051xce.OLrzqt.valueOf());
        }
        if (botParamTickerData.getDoubtMsg().length() > 0) {
            C55312xha c55312xhaValueOf4 = c51270vjp.EZpvd().valueOf();
            if (c55312xhaValueOf4 != null && (c55318xhgEZpvd2 = c55312xhaValueOf4.EZpvd()) != null) {
                c55318xhgEZpvd2.setVisibility(0);
            }
            C55258xgZ c55258xgZEZpvd = c51270vjp.EZpvd();
            c55258xgZEZpvd.setOnClickListener(new Activity(c55258xgZEZpvd, 1000L, c51270vjp, botParamTickerData));
        } else {
            C55312xha c55312xhaValueOf5 = c51270vjp.EZpvd().valueOf();
            if (c55312xhaValueOf5 != null && (c55318xhgEZpvd = c55312xhaValueOf5.EZpvd()) != null) {
                c55318xhgEZpvd.setVisibility(8);
            }
        }
        c51270vjp.KWHzl().OLrzqt(botParamTickerData.getInstId(), botParamTickerData.getInstType());
        c51270vjp.KWHzl().setIsNeedColorChange(botParamTickerData.isNeedColorChange());
        c51270vjp.KWHzl().setKlineIconListener(this.OLrzqt);
        c51270vjp.itemView.setPaddingRelative(0, botParamTickerData.getTopPadding(), 0, botParamTickerData.getBottomPadding());
    }

    /* JADX INFO: renamed from: o.vjo$StateListAnimator */
    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ ViewOnClickListenerC54939xaY KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY) {
            this.KWHzl = viewOnClickListenerC54939xaY;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            this.KWHzl.dismiss();
        }
    }

    /* JADX INFO: renamed from: o.vjo$Activity */
    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ C51270vjp AEQbTJ;
        public final /* synthetic */ BotParamTickerData EZpvd;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, C51270vjp c51270vjp, BotParamTickerData botParamTickerData) {
            this.KWHzl = view;
            this.copydefault = j;
            this.AEQbTJ = c51270vjp;
            this.EZpvd = botParamTickerData;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.copydefault || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                android.content.Context context = this.AEQbTJ.itemView.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(context);
                viewOnClickListenerC54939xaY.EZpvd(this.EZpvd.getDoubtMsg());
                viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) C33070mpX.AYXKKw(C55688xof.Application.QWSkGZ), (View.OnClickListener) new StateListAnimator(viewOnClickListenerC54939xaY));
                viewOnClickListenerC54939xaY.show();
            }
        }
    }
}
