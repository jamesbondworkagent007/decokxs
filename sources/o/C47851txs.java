package o;

import android.view.View;
import com.okinc.localization.util.format.OKDateEnum;
import com.okinc.localization.util.format.OKTimeEnum;
import com.okinc.planet.biz_create_centre.data.HistoryData;
import java.util.Date;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C47501trL;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.txs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C47851txs extends AbstractC43310rmq<HistoryData, tMI> {
    public final Function1<HistoryData, Unit> OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C47851txs() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC43310rmq
    public int getItemLayoutId() {
        return C47501trL.Application.hDKMBd;
    }

    @Override // o.AbstractC43310rmq
    public int getVariableId() {
        return 0;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (wrap:kotlin.jvm.functions.Function1:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null kotlin.jvm.functions.Function1) : (r1v0 kotlin.jvm.functions.Function1))
 A[MD:(kotlin.jvm.functions.Function1<? super com.okinc.planet.biz_create_centre.data.HistoryData, kotlin.Unit>):void (m)] (LINE:25) call: o.txs.<init>(kotlin.jvm.functions.Function1):void type: THIS */
    public /* synthetic */ C47851txs(Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : function1);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.jvm.functions.Function1<? super com.okinc.planet.biz_create_centre.data.HistoryData, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public C47851txs(Function1<? super HistoryData, Unit> function1) {
        this.OLrzqt = function1;
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Lo/rms;Ljava/lang/Object;)V */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0138  */
    @Override // o.AbstractC43310rmq
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onBindViewHolder(@NotNull C43312rms<tMI> c43312rms, @NotNull HistoryData historyData) {
        int i;
        Intrinsics.checkNotNullParameter(c43312rms, "");
        Intrinsics.checkNotNullParameter(historyData, "");
        super.onBindViewHolder((C43312rms) c43312rms, historyData);
        ((tMI) c43312rms.OLrzqt()).AYXKKw.setText(historyData.getCategoryName());
        if (C33129mqd.OLrzqt((java.lang.CharSequence) historyData.getSourceName())) {
            android.widget.TextView textView = ((tMI) c43312rms.OLrzqt()).gEmmrt;
            Intrinsics.checkNotNullExpressionValue(textView, "");
            textView.setVisibility(0);
            android.widget.TextView textView2 = ((tMI) c43312rms.OLrzqt()).gEmmrt;
            int i2 = C47501trL.Fragment.ODXsMY;
            java.lang.String sourceName = historyData.getSourceName();
            Intrinsics.copydefault((java.lang.Object) sourceName);
            textView2.setText(C33069mpW.copydefault(i2, C56423yEv.EZpvd(C56390yDp.OLrzqt("groupName", sourceName))));
        } else {
            android.widget.TextView textView3 = ((tMI) c43312rms.OLrzqt()).gEmmrt;
            Intrinsics.checkNotNullExpressionValue(textView3, "");
            textView3.setVisibility(8);
        }
        ((tMI) c43312rms.OLrzqt()).KWHzl.setText(historyData.getAmount() + " " + historyData.getAmountUnit());
        android.widget.TextView textView4 = ((tMI) c43312rms.OLrzqt()).OLrzqt;
        java.lang.String amountUsd = historyData.getAmountUsd();
        if (amountUsd == null) {
            amountUsd = "0";
        }
        textView4.setText("$" + amountUsd);
        android.widget.TextView textView5 = ((tMI) c43312rms.OLrzqt()).valueOf;
        java.lang.Object settlementTime = historyData.getSettlementTime();
        if (settlementTime == null) {
            settlementTime = java.lang.Long.valueOf(java.lang.System.currentTimeMillis());
        }
        textView5.setText(pTA.format$default(new Date(C33129mqd.valueOf(settlementTime)), OKDateEnum.DATE_FORMAT_STANDARD_MD, OKTimeEnum.TIME_FORMAT_SIMPLE_HM, null, null, false, 28, null));
        android.widget.ImageView imageView = ((tMI) c43312rms.OLrzqt()).EZpvd;
        java.lang.String category = historyData.getCategory();
        if (category != null) {
            switch (category.hashCode()) {
                case -1503691295:
                    i = !category.equals("im_group_trade_commission") ? C52761wXj.TaskDescription.aJZHYI : C52761wXj.TaskDescription.hfFNez;
                    break;
                case -1464581652:
                    if (category.equals("content_pool_reward")) {
                        i = C52761wXj.TaskDescription.SqfPTR;
                        break;
                    }
                    break;
                case -143225038:
                    if (!category.equals("live_stream_trade_commission")) {
                    }
                    break;
                case 117104799:
                    if (category.equals("im_group_subscription_fee")) {
                        i = C52761wXj.TaskDescription.hPlhRW;
                        break;
                    }
                    break;
                case 1723885996:
                    if (!category.equals("content_trade_commission")) {
                    }
                    break;
                case 1985777596:
                    if (category.equals("live_stream_gift")) {
                        i = C52761wXj.TaskDescription.OeawrHOeawrH;
                        break;
                    }
                    break;
            }
        }
        imageView.setImageResource(i);
        Function1<HistoryData, Unit> function1 = this.OLrzqt;
        if (function1 != null) {
            android.view.View view = c43312rms.itemView;
            view.setOnClickListener(new StateListAnimator(view, 1000L, function1, historyData));
        }
    }

    /* JADX INFO: renamed from: o.txs$StateListAnimator */
    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ HistoryData AEQbTJ;
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ Function1 OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, Function1 function1, HistoryData historyData) {
            this.EZpvd = view;
            this.copydefault = j;
            this.OLrzqt = function1;
            this.AEQbTJ = historyData;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.copydefault || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                this.OLrzqt.invoke(this.AEQbTJ);
            }
        }
    }
}
