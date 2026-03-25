package o;

import android.view.View;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.unify_trade.bot.data.CoinStackItemData;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C48033uCm;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class wNI extends AbstractC59533zio<CoinStackItemData, Application> {
    public final Function1<CoinStackItemData, Unit> EZpvd;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public wNI() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (wrap:kotlin.jvm.functions.Function1:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null kotlin.jvm.functions.Function1) : (r1v0 kotlin.jvm.functions.Function1))
 A[MD:(kotlin.jvm.functions.Function1<? super com.okinc.unify_trade.bot.data.CoinStackItemData, kotlin.Unit>):void (m)] (LINE:17) call: o.wNI.<init>(kotlin.jvm.functions.Function1):void type: THIS */
    public /* synthetic */ wNI(Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : function1);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.jvm.functions.Function1<? super com.okinc.unify_trade.bot.data.CoinStackItemData, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public wNI(Function1<? super CoinStackItemData, Unit> function1) {
        this.EZpvd = function1;
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public Application onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        ViewDataBinding viewDataBindingInflate = DataBindingUtil.inflate(layoutInflater, C48033uCm.Activity.atDTRm, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(viewDataBindingInflate, "");
        return new Application(this, (AbstractC48489uTh) viewDataBindingInflate);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull Application application, @NotNull CoinStackItemData coinStackItemData) {
        Intrinsics.checkNotNullParameter(application, "");
        Intrinsics.checkNotNullParameter(coinStackItemData, "");
        AbstractC48489uTh abstractC48489uThOLrzqt = application.OLrzqt();
        abstractC48489uThOLrzqt.KWHzl.setText(coinStackItemData.getTitle());
        boolean zKWHzl = C33129mqd.KWHzl((java.util.Collection) coinStackItemData.getCoins());
        C51601vqB c51601vqB = abstractC48489uThOLrzqt.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(c51601vqB, "");
        c51601vqB.setVisibility(zKWHzl ? 0 : 8);
        if (zKWHzl) {
            C51601vqB c51601vqB2 = abstractC48489uThOLrzqt.AEQbTJ;
            java.util.List<java.lang.String> coins = coinStackItemData.getCoins();
            if (coins == null) {
                coins = yDY.AhwBna();
            }
            C51601vqB.refreshCircleCoins$default(c51601vqB2, coins, 0, 0, 6, null);
        }
        android.widget.ImageView imageView = abstractC48489uThOLrzqt.copydefault;
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        imageView.setVisibility(coinStackItemData.isShowIvRight() ? 0 : 8);
        if (coinStackItemData.isShowIvRight()) {
            android.widget.LinearLayout linearLayout = abstractC48489uThOLrzqt.OLrzqt;
            linearLayout.setOnClickListener(new TaskDescription(linearLayout, 1000L, this, coinStackItemData));
        }
    }

    public final class Application extends RecyclerView.ViewHolder {
        public final /* synthetic */ wNI KWHzl;
        public final AbstractC48489uTh OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final AbstractC48489uTh OLrzqt() {
            return this.OLrzqt;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Application(@NotNull wNI wni, AbstractC48489uTh abstractC48489uTh) {
            super(abstractC48489uTh.getRoot());
            Intrinsics.checkNotNullParameter(abstractC48489uTh, "");
            this.KWHzl = wni;
            this.OLrzqt = abstractC48489uTh;
        }
    }

    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ wNI KWHzl;
        public final /* synthetic */ CoinStackItemData OLrzqt;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, wNI wni, CoinStackItemData coinStackItemData) {
            this.copydefault = view;
            this.EZpvd = j;
            this.KWHzl = wni;
            this.OLrzqt = coinStackItemData;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.EZpvd || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                Function1 function1 = this.KWHzl.EZpvd;
                if (function1 != null) {
                    function1.invoke(this.OLrzqt);
                }
            }
        }
    }
}
