package o;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.okinc.localization.util.format.OKDateEnum;
import com.okinc.planet.biz_create_centre.data.HistoryData;
import com.okinc.planet.biz_create_centre.viewmode.EarningsViewModel$loadMoreEarningsList$1;
import com.okinc.planet.biz_create_centre.viewmode.EarningsViewModel$refreshEarningsList$1;
import com.okinc.uilab.stateful.StatefulView;
import com.okinc.unify_trade.biz.TradeCoinInfo;
import java.math.RoundingMode;
import java.util.Date;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.C38307pTy;

/* JADX INFO: renamed from: o.txw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C47855txw extends AbstractC33073mpa {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int copydefault = 8;
    public boolean AEQbTJ;
    public java.lang.String KWHzl;
    public final C47778twY OLrzqt = tPF.copydefault.DWgRXt();
    public final InterfaceC56387yDm gEmmrt = C56392yDr.copydefault(new Function0() { // from class: o.txA
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C47855txw.copydefault();
        }
    });
    public final MutableLiveData<C47857txy> EZpvd = new MutableLiveData<>();
    public final MutableLiveData<java.lang.String> AhwBna = new MutableLiveData<>();
    public final MutableLiveData<java.lang.String> AYXKKw = new MutableLiveData<>();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<java.lang.String> AEQbTJ() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<java.lang.String> AYXKKw() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<C47857txy> KWHzl() {
        return this.EZpvd;
    }

    /* JADX INFO: renamed from: o.txw$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.txw.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    public final InterfaceC54581xNr OLrzqt() {
        return (InterfaceC54581xNr) this.gEmmrt.getValue();
    }

    public static final InterfaceC54581xNr copydefault() {
        return C46392tSq.EZpvd.EZpvd();
    }

    public final void OLrzqt(boolean z) {
        if (this.AEQbTJ) {
            return;
        }
        this.AEQbTJ = true;
        this.KWHzl = null;
        if (z) {
            this.EZpvd.setValue(new C47857txy(StatefulView.Status.Loading, yDY.AhwBna(), null, true, 0, 16, null));
        }
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new EarningsViewModel$refreshEarningsList$1(this, null), 3, null);
    }

    public final boolean AhwBna() {
        C47857txy value = this.EZpvd.getValue();
        if (value == null || value.AEQbTJ() != StatefulView.Status.Content) {
            return false;
        }
        java.lang.String str = this.KWHzl;
        if (str == null || str.length() == 0) {
            pUU.EZpvd("EarningsViewModel", "No more data to load - nextCursor is empty");
            return false;
        }
        if (this.AEQbTJ) {
            return true;
        }
        this.AEQbTJ = true;
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new EarningsViewModel$loadMoreEarningsList$1(str, this, value, null), 3, null);
        return true;
    }

    public final java.util.ArrayList<java.lang.Object> OLrzqt(java.util.List<HistoryData> list, java.lang.String str) {
        java.util.ArrayList<java.lang.Object> arrayList = new java.util.ArrayList<>((list.size() * 2) + 2);
        arrayList.add(new C47777twX(C33129mqd.OLrzqt((java.lang.CharSequence) str) ? pTB.formatICUNumber$default(java.lang.Double.valueOf(C33129mqd.AEQbTJ(str)), RoundingMode.DOWN, C38307pTy.Companion.EZpvd(2), null, null, 12, null) + " USD" : "-.-- USD"));
        java.lang.String str2 = null;
        arrayList.add(new C47771twR(null, 1, null));
        if (list.isEmpty()) {
            return arrayList;
        }
        for (HistoryData historyData : list) {
            java.lang.String settlementTime = historyData.getSettlementTime();
            if (settlementTime != null && settlementTime.length() != 0) {
                long jValueOf = C33129mqd.valueOf(historyData.getSettlementTime());
                if (jValueOf > 0) {
                    java.lang.String strEZpvd = EZpvd(jValueOf);
                    if (!Intrinsics.EZpvd((java.lang.Object) str2, (java.lang.Object) strEZpvd)) {
                        arrayList.add(strEZpvd);
                        str2 = strEZpvd;
                    }
                    arrayList.add(copydefault(historyData));
                }
            }
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final HistoryData copydefault(HistoryData historyData) {
        java.lang.String sizeDig;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = OLrzqt();
        if (interfaceC54581xNrOLrzqt == null) {
            sizeDig = null;
        } else {
            java.lang.String amountUnit = historyData.getAmountUnit();
            if (amountUnit == null) {
                amountUnit = "";
            }
            TradeCoinInfo tradeCoinInfoAhwBna = interfaceC54581xNrOLrzqt.AhwBna(amountUnit);
            if (tradeCoinInfoAhwBna != null) {
                sizeDig = tradeCoinInfoAhwBna.getSizeDig();
            }
        }
        int iAhwBna = C33129mqd.AhwBna(sizeDig);
        double dAEQbTJ = C33129mqd.AEQbTJ(historyData.getAmount());
        RoundingMode roundingMode = RoundingMode.DOWN;
        C38307pTy.Application application = C38307pTy.Companion;
        historyData.setAmount(pTB.formatICUNumber$default(java.lang.Double.valueOf(dAEQbTJ), roundingMode, application.EZpvd(iAhwBna), null, null, 12, null));
        double dAEQbTJ2 = C33129mqd.AEQbTJ(historyData.getAmountUsd());
        historyData.setAmountUsd(pTB.formatICUNumber$default(java.lang.Double.valueOf(dAEQbTJ2), roundingMode, application.EZpvd(2), null, null, 12, null));
        return historyData;
    }

    public final java.util.List<java.lang.Object> AEQbTJ(java.util.List<java.lang.Object> list, java.util.List<HistoryData> list2) {
        java.lang.String str;
        if (list2.isEmpty()) {
            return list;
        }
        java.util.Iterator it = CollectionsKt___CollectionsKt.gkJEwt(list).iterator();
        while (true) {
            if (!it.hasNext()) {
                str = null;
                break;
            }
            java.lang.Object next = it.next();
            if (next instanceof java.lang.String) {
                str = (java.lang.String) next;
                break;
            }
        }
        for (HistoryData historyData : list2) {
            java.lang.String settlementTime = historyData.getSettlementTime();
            if (settlementTime != null && settlementTime.length() != 0) {
                long jValueOf = C33129mqd.valueOf(historyData.getSettlementTime());
                if (jValueOf > 0) {
                    java.lang.String strEZpvd = EZpvd(jValueOf);
                    if (!Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) strEZpvd)) {
                        list.add(strEZpvd);
                        str = strEZpvd;
                    }
                    list.add(copydefault(historyData));
                }
            }
        }
        return list;
    }

    public final java.lang.String EZpvd(long j) {
        return pTA.formatDate$default(new Date(j), OKDateEnum.DATE_FORMAT_STANDARD_YM, null, null, 6, null);
    }
}
