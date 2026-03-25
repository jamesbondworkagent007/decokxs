package o;

import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import com.okinc.kline.api.bean.MarketCoinInfo;
import com.okinc.localization.util.format.OKDateEnum;
import com.okinc.localization.util.format.OKTimeEnum;
import com.okinc.unify_trade.biz.subscribe.TradeHisPostionData;
import com.okinc.unify_trade.bot.data.TacticsListLabelData;
import java.math.RoundingMode;
import java.util.Date;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C55688xof;
import o.oKA;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wNl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C52493wNl extends AbstractC59533zio<TradeHisPostionData, C52485wNd> {
    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public C52485wNd onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        AbstractC48443uRp abstractC48443uRpCopydefault = AbstractC48443uRp.copydefault(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(abstractC48443uRpCopydefault, "");
        return new C52485wNd(abstractC48443uRpCopydefault);
    }

    public final void copydefault(TradeHisPostionData tradeHisPostionData, C52485wNd c52485wNd, C55372xih c55372xih) {
        c55372xih.removeAllViews();
        c55372xih.setVisibility(0);
        C52534wOz c52534wOz = C52534wOz.KWHzl;
        android.content.Context context = c52485wNd.copydefault().getRoot().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        C55251xgS c55251xgSCopydefault = c52534wOz.copydefault(context, new TacticsListLabelData(C56033xvF.AhwBna(tradeHisPostionData.getPosSide()), false, C56033xvF.valueOf(tradeHisPostionData.getPosSide()), 0, 0, 26, null));
        c55251xgSCopydefault.setTextSize(12.0f);
        c55251xgSCopydefault.setLayoutParams(new ViewGroup.MarginLayoutParams(-2, C55298xhM.dp2px$default(20.0f, null, 1, null)));
        c55372xih.addView(c55251xgSCopydefault);
        android.content.Context context2 = c52485wNd.copydefault().getRoot().getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        C55251xgS c55251xgSCopydefault2 = c52534wOz.copydefault(context2, new TacticsListLabelData(C56033xvF.getBotLever$default(tradeHisPostionData.getLever(), false, 2, null), false, C56033xvF.valueOf(tradeHisPostionData.getPosSide()), 0, 0, 26, null));
        c55251xgSCopydefault2.setTextSize(12.0f);
        c55251xgSCopydefault2.setLayoutParams(new ViewGroup.MarginLayoutParams(-2, C55298xhM.dp2px$default(20.0f, null, 1, null)));
        c55372xih.addView(c55251xgSCopydefault2);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull C52485wNd c52485wNd, @NotNull TradeHisPostionData tradeHisPostionData) {
        Intrinsics.checkNotNullParameter(c52485wNd, "");
        Intrinsics.checkNotNullParameter(tradeHisPostionData, "");
        AbstractC48443uRp abstractC48443uRpCopydefault = c52485wNd.copydefault();
        android.widget.TextView textView = abstractC48443uRpCopydefault.AEQbTJ;
        Date date = new Date(C33129mqd.valueOf(tradeHisPostionData.getCTime()));
        OKDateEnum oKDateEnum = OKDateEnum.DATE_FORMAT_SIMPLE;
        OKTimeEnum oKTimeEnum = OKTimeEnum.TIME_FORMAT_SIMPLE;
        textView.setText(pTA.format$default(date, oKDateEnum, oKTimeEnum, null, null, false, 28, null));
        abstractC48443uRpCopydefault.copydefault.setText(pTA.format$default(new Date(C33129mqd.valueOf(tradeHisPostionData.getUTime())), oKDateEnum, oKTimeEnum, null, null, false, 28, null));
        abstractC48443uRpCopydefault.KWHzl.setText(C56033xvF.getCoinTitleTacticsItem$default(tradeHisPostionData.getInstType(), tradeHisPostionData.getInstId(), false, null, null, 28, null));
        AppCompatTextView appCompatTextView = abstractC48443uRpCopydefault.KWHzl;
        appCompatTextView.setOnClickListener(new Activity(appCompatTextView, 1000L, tradeHisPostionData, c52485wNd));
        C55372xih c55372xih = abstractC48443uRpCopydefault.AYXKKw;
        Intrinsics.checkNotNullExpressionValue(c55372xih, "");
        copydefault(tradeHisPostionData, c52485wNd, c55372xih);
        java.util.List<Application> listAEQbTJ = AEQbTJ(tradeHisPostionData);
        int childCount = abstractC48443uRpCopydefault.OLrzqt.getChildCount();
        int i = 0;
        for (int i2 = 0; i2 < childCount; i2++) {
            android.view.View childAt = abstractC48443uRpCopydefault.OLrzqt.getChildAt(i2);
            Intrinsics.checkNotNullExpressionValue(childAt, "");
            KWHzl(childAt, (Application) CollectionsKt___CollectionsKt.AkhnZx(listAEQbTJ, i), i);
            i++;
        }
        int childCount2 = abstractC48443uRpCopydefault.EZpvd.getChildCount();
        for (int i3 = 0; i3 < childCount2; i3++) {
            android.view.View childAt2 = abstractC48443uRpCopydefault.EZpvd.getChildAt(i3);
            Intrinsics.checkNotNullExpressionValue(childAt2, "");
            KWHzl(childAt2, (Application) CollectionsKt___CollectionsKt.AkhnZx(listAEQbTJ, i), i);
            i++;
        }
    }

    public final void KWHzl(android.view.View view, Application application, int i) {
        if (application == null) {
            uNT untCopydefault = uNT.copydefault(view);
            android.widget.LinearLayout root = untCopydefault.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "");
            root.setVisibility(4);
            untCopydefault.AEQbTJ.setText("");
            untCopydefault.EZpvd.setText("");
            return;
        }
        uNT untCopydefault2 = uNT.copydefault(view);
        android.widget.LinearLayout root2 = untCopydefault2.getRoot();
        Intrinsics.checkNotNullExpressionValue(root2, "");
        root2.setVisibility(0);
        untCopydefault2.AEQbTJ.setText(application.KWHzl());
        untCopydefault2.EZpvd.setText(application.OLrzqt());
        if (application.copydefault() != null) {
            untCopydefault2.EZpvd.setTextColor(application.copydefault().intValue());
        }
        if (i % 3 == 2) {
            untCopydefault2.getRoot().setGravity(8388613);
            untCopydefault2.AEQbTJ.setGravity(8388613);
            untCopydefault2.EZpvd.setGravity(8388613);
        }
    }

    public final java.util.List<Application> AEQbTJ(TradeHisPostionData tradeHisPostionData) {
        java.util.List listOLrzqt = C56402yEa.OLrzqt();
        java.lang.String strAYXKKw = C33070mpX.AYXKKw(C55688xof.Application.rsEnD);
        C56068xvo c56068xvo = C56068xvo.copydefault;
        java.lang.String instType = tradeHisPostionData.getInstType();
        java.lang.String instId = tradeHisPostionData.getInstId();
        java.lang.String openAvgPx = tradeHisPostionData.getOpenAvgPx();
        RoundingMode roundingMode = RoundingMode.UP;
        listOLrzqt.add(new Application(strAYXKKw, C56068xvo.getProcessedPrice$default(c56068xvo, instType, instId, openAvgPx, roundingMode, false, false, 48, null), null));
        listOLrzqt.add(new Application(C33069mpW.copydefault(C55688xof.Application.onRestoreInstanceState, C56423yEv.EZpvd(C56390yDp.OLrzqt("ccy", tradeHisPostionData.getCcy()))), C56033xvF.getBotPnl$default(tradeHisPostionData.getInstId(), tradeHisPostionData.getInstType(), tradeHisPostionData.getRealizedPnl(), null, false, true, null, false, null, null, null, 2008, null), java.lang.Integer.valueOf(C56033xvF.OLrzqt((java.lang.Object) C56033xvF.getDigitPnl$default(tradeHisPostionData.getInstId(), tradeHisPostionData.getInstType(), tradeHisPostionData.getRealizedPnl(), null, 8, null)))));
        listOLrzqt.add(new Application(C33069mpW.copydefault(C55688xof.Application.UUsvzUhTFPAC, C56423yEv.EZpvd(C56390yDp.OLrzqt("ccy", C56033xvF.getBotAmountUnit$default(tradeHisPostionData.getInstType(), tradeHisPostionData.getInstId(), "", null, 8, null)))), C56033xvF.getBotAmount$default(tradeHisPostionData.getInstType(), tradeHisPostionData.getInstId(), tradeHisPostionData.getOpenMaxAmount(), "", false, null, 48, null), null));
        listOLrzqt.add(new Application(C33070mpX.AYXKKw(C55688xof.Application.zUtmHU), C56068xvo.getProcessedPrice$default(c56068xvo, tradeHisPostionData.getInstType(), tradeHisPostionData.getInstId(), tradeHisPostionData.getCloseAvgPx(), roundingMode, false, false, 48, null), null));
        listOLrzqt.add(new Application(C33070mpX.AYXKKw(C55688xof.Application.setFillInIntent), c56068xvo.copydefault(tradeHisPostionData.getPnlRatio(), true), java.lang.Integer.valueOf(C56033xvF.OLrzqt((java.lang.Object) C56033xvF.getDigitPnl$default(tradeHisPostionData.getInstId(), tradeHisPostionData.getInstType(), tradeHisPostionData.getRealizedPnl(), null, 8, null)))));
        listOLrzqt.add(new Application(C33069mpW.copydefault(C55688xof.Application.QOLQEE, C56423yEv.EZpvd(C56390yDp.OLrzqt("ccy", C56033xvF.getBotAmountUnit$default(tradeHisPostionData.getInstType(), tradeHisPostionData.getInstId(), "", null, 8, null)))), C56033xvF.getBotAmount$default(tradeHisPostionData.getInstType(), tradeHisPostionData.getInstId(), tradeHisPostionData.getCloseTotalAmount(), "", false, null, 48, null), null));
        return C56402yEa.fARcdN(listOLrzqt);
    }

    /* JADX INFO: renamed from: o.wNl$Activity */
    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ TradeHisPostionData AEQbTJ;
        public final /* synthetic */ C52485wNd EZpvd;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ long OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, TradeHisPostionData tradeHisPostionData, C52485wNd c52485wNd) {
            this.KWHzl = view;
            this.OLrzqt = j;
            this.AEQbTJ = tradeHisPostionData;
            this.EZpvd = c52485wNd;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.OLrzqt || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                MarketCoinInfo marketCoinInfo = new MarketCoinInfo(this.AEQbTJ.getInstId(), this.AEQbTJ.getInstType(), (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 28, (DefaultConstructorMarker) null);
                oKA oka = (oKA) C43251rlk.OLrzqt(oKA.class);
                if (oka != null) {
                    android.content.Context context = this.EZpvd.copydefault().getRoot().getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "");
                    oKA.TaskDescription.gotoNewKlinePage$default(oka, context, marketCoinInfo, null, null, "bot_page_trade", null, null, null, null, null, null, 2028, null);
                }
            }
        }
    }

    /* JADX INFO: renamed from: o.wNl$Application */
    public static final class Application {
        public final java.lang.Integer EZpvd;
        public final java.lang.String KWHzl;
        public final java.lang.String copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Application copy$default(Application application, java.lang.String str, java.lang.String str2, java.lang.Integer num, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = application.KWHzl;
            }
            if ((i & 2) != 0) {
                str2 = application.copydefault;
            }
            if ((i & 4) != 0) {
                num = application.EZpvd;
            }
            return application.AEQbTJ(str, str2, num);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Application AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, java.lang.Integer num) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            return new Application(str, str2, num);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String KWHzl() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String OLrzqt() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.Integer copydefault() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Application)) {
                return false;
            }
            Application application = (Application) obj;
            return Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) application.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) application.copydefault) && Intrinsics.EZpvd(this.EZpvd, application.EZpvd);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = this.KWHzl.hashCode();
            int iHashCode2 = this.copydefault.hashCode();
            java.lang.Integer num = this.EZpvd;
            return (((iHashCode * 31) + iHashCode2) * 31) + (num == null ? 0 : num.hashCode());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "ParamItem(title=" + this.KWHzl + ", value=" + this.copydefault + ", color=" + this.EZpvd + ")";
        }

        public Application(@NotNull java.lang.String str, @NotNull java.lang.String str2, java.lang.Integer num) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            this.KWHzl = str;
            this.copydefault = str2;
            this.EZpvd = num;
        }
    }
}
