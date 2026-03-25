package o;

import com.github.mikephil.charting.data.PieEntry;
import com.okinc.unify_trade.biz.BannerOrderDetails;
import com.okinc.unify_trade.biz.InstrumentPercentBean;
import com.okinc.unify_trade.bot.data.SingleCoinAllocationData;
import java.math.BigDecimal;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C48033uCm;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
public final class wLT {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int OLrzqt = 8;
    public BannerOrderDetails KWHzl = new BannerOrderDetails(null, null, null, null, null, 31, null);
    public final java.util.ArrayList<java.lang.Integer> copydefault = yDY.copydefault(java.lang.Integer.valueOf(C33070mpX.copydefault(C48033uCm.StateListAnimator.EZpvd)), java.lang.Integer.valueOf(C33070mpX.copydefault(C48033uCm.StateListAnimator.KWHzl)), java.lang.Integer.valueOf(C33070mpX.copydefault(C48033uCm.StateListAnimator.copydefault)), java.lang.Integer.valueOf(C33070mpX.copydefault(C48033uCm.StateListAnimator.AYXKKw)), java.lang.Integer.valueOf(C33070mpX.copydefault(C48033uCm.StateListAnimator.valueOf)), java.lang.Integer.valueOf(C33070mpX.copydefault(C48033uCm.StateListAnimator.copydefault)), java.lang.Integer.valueOf(C33070mpX.copydefault(C48033uCm.StateListAnimator.gEmmrt)), java.lang.Integer.valueOf(C33070mpX.copydefault(C48033uCm.StateListAnimator.KWHzl)), java.lang.Integer.valueOf(C33070mpX.copydefault(C48033uCm.StateListAnimator.AYXKKw)), java.lang.Integer.valueOf(C33070mpX.copydefault(C48033uCm.StateListAnimator.djBIcL)));

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(@NotNull BannerOrderDetails bannerOrderDetails) {
        Intrinsics.checkNotNullParameter(bannerOrderDetails, "");
        this.KWHzl = bannerOrderDetails;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.ArrayList<java.lang.Integer> OLrzqt() {
        return this.copydefault;
    }

    /* JADX INFO: loaded from: classes19.dex */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.wLT.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    public final java.util.ArrayList<PieEntry> EZpvd() {
        java.util.ArrayList<PieEntry> arrayList = new java.util.ArrayList<>();
        java.util.ArrayList<InstrumentPercentBean> instrumentPercent = this.KWHzl.getInstrumentPercent();
        if (instrumentPercent != null) {
            java.util.Iterator<T> it = instrumentPercent.iterator();
            while (it.hasNext()) {
                arrayList.add(new PieEntry(C33129mqd.djBIcL(((InstrumentPercentBean) it.next()).getPercent()), ""));
            }
        }
        return arrayList;
    }

    public final java.util.ArrayList<SingleCoinAllocationData> AEQbTJ() {
        java.util.ArrayList<SingleCoinAllocationData> arrayList = new java.util.ArrayList<>();
        java.util.ArrayList<InstrumentPercentBean> instrumentPercent = this.KWHzl.getInstrumentPercent();
        if (instrumentPercent != null) {
            int i = 0;
            for (java.lang.Object obj : instrumentPercent) {
                if (i < 0) {
                    yDY.AYXKKw();
                }
                InstrumentPercentBean instrumentPercentBean = (InstrumentPercentBean) obj;
                java.lang.String instrumentName = instrumentPercentBean.getInstrumentName();
                java.lang.String strEZpvd = EZpvd(instrumentPercentBean.getPercent());
                java.lang.Integer num = (java.lang.Integer) CollectionsKt___CollectionsKt.AkhnZx(this.copydefault, i);
                arrayList.add(new SingleCoinAllocationData(instrumentName, strEZpvd, num != null ? num.intValue() : i % this.copydefault.size()));
                i++;
            }
        }
        return arrayList;
    }

    public final java.util.ArrayList<SingleCoinAllocationData> copydefault() {
        java.util.ArrayList<InstrumentPercentBean> arrayListKWHzl;
        java.util.ArrayList<SingleCoinAllocationData> arrayList = new java.util.ArrayList<>();
        java.util.ArrayList<InstrumentPercentBean> instrumentPercent = this.KWHzl.getInstrumentPercent();
        if (instrumentPercent != null && (arrayListKWHzl = KWHzl(instrumentPercent)) != null) {
            int i = 0;
            for (java.lang.Object obj : arrayListKWHzl) {
                if (i < 0) {
                    yDY.AYXKKw();
                }
                InstrumentPercentBean instrumentPercentBean = (InstrumentPercentBean) obj;
                java.lang.String instrumentName = instrumentPercentBean.getInstrumentName();
                java.lang.String strEZpvd = EZpvd(instrumentPercentBean.getPercent());
                java.lang.Integer num = (java.lang.Integer) CollectionsKt___CollectionsKt.AkhnZx(this.copydefault, i);
                arrayList.add(new SingleCoinAllocationData(instrumentName, strEZpvd, num != null ? num.intValue() : i % this.copydefault.size()));
                i++;
            }
        }
        return arrayList;
    }

    public final java.lang.String EZpvd(java.lang.String str) {
        if (str == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str)) {
            return "--";
        }
        xMR xmr = xMR.copydefault;
        if (str == null) {
            str = "";
        }
        return xMR.formatPercent$default(xmr, str, 2, 2, null, 8, null);
    }

    public final java.util.ArrayList<InstrumentPercentBean> KWHzl(java.util.ArrayList<InstrumentPercentBean> arrayList) {
        if (arrayList.size() <= 10) {
            return arrayList;
        }
        java.util.List<InstrumentPercentBean> listSubList = arrayList.subList(9, arrayList.size());
        Intrinsics.checkNotNullExpressionValue(listSubList, "");
        BigDecimal bigDecimal = new BigDecimal(0);
        java.util.Iterator<T> it = listSubList.iterator();
        while (it.hasNext()) {
            bigDecimal = bigDecimal.add(C33129mqd.EZpvd(((InstrumentPercentBean) it.next()).getPercent()));
            Intrinsics.checkNotNullExpressionValue(bigDecimal, "");
        }
        java.util.List listOLrzqt = C56402yEa.OLrzqt();
        for (int i = 0; i < 9; i++) {
            InstrumentPercentBean instrumentPercentBean = arrayList.get(i);
            Intrinsics.checkNotNullExpressionValue(instrumentPercentBean, "");
            listOLrzqt.add(instrumentPercentBean);
        }
        listOLrzqt.add(new InstrumentPercentBean(C33070mpX.AYXKKw(C48033uCm.Fragment.OxVOHk), bigDecimal.toPlainString()));
        return new java.util.ArrayList<>(C56402yEa.fARcdN(listOLrzqt));
    }
}
