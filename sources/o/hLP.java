package o;

import androidx.lifecycle.MutableLiveData;
import com.okinc.business.defi.api.model.tx.signdata.MultiTransferSignData;
import com.okinc.business.dexlogic.bean.ConsumeData;
import com.okinc.business.dexlogic.main.limmitorder.CheckStep;
import com.okinc.business.dexlogic.main.limmitorder.SwapState;
import com.okinc.business.dexlogic.main.limmitorder.TradeStep;
import com.okinc.business.dexlogic.main.limmitorder.bean.ChangeType;
import com.okinc.business.dexlogic.main.limmitorder.bean.LimitCalResult;
import com.okinc.business.dexlogic.main.swap.trade.bean.EditTextData;
import com.okinc.business.dexlogic.main.swap.trade.bean.TradeInputData;
import com.okinc.business.dexlogic.main.swap.trade.bean.TradeInputGroup;
import com.okinc.business.dexlogic.main.swap.trade.input.helper.quote.forward.FromCoinChange;
import com.okinc.business.dexlogic.track.enums.DexSwapFullClick;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class hLP extends hLK implements hLH {
    public final FromCoinChange AEQbTJ;
    public final Function2<C55001xbh, java.lang.String, Unit> EZpvd;
    public final Function2<C55001xbh, java.lang.String, Unit> KWHzl;
    public final C22495hgT OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public Function2<C55001xbh, java.lang.String, Unit> AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public Function2<C55001xbh, java.lang.String, Unit> KWHzl() {
        return this.EZpvd;
    }

    public hLP(@NotNull C22495hgT c22495hgT) {
        Intrinsics.checkNotNullParameter(c22495hgT, "");
        this.OLrzqt = c22495hgT;
        this.AEQbTJ = new FromCoinChange();
        this.EZpvd = new Function2() { // from class: o.hLO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return hLP.OLrzqt(this.EZpvd, (C55001xbh) obj, (java.lang.String) obj2);
            }
        };
        this.KWHzl = new Function2() { // from class: o.hLN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return hLP.copydefault(this.OLrzqt, (C55001xbh) obj, (java.lang.String) obj2);
            }
        };
    }

    public static final Unit OLrzqt(hLP hlp, C55001xbh c55001xbh, java.lang.String str) {
        TradeInputGroup data;
        ConsumeData<TradeInputData> fromData;
        TradeInputData data2;
        EditTextData editData;
        TradeInputGroup data3;
        ConsumeData<TradeInputData> fromData2;
        TradeInputData data4;
        EditTextData editData2;
        java.lang.String maxData;
        TradeInputGroup data5;
        ConsumeData<TradeInputData> fromData3;
        TradeInputData data6;
        EditTextData editData3;
        java.lang.String str2 = "";
        Intrinsics.checkNotNullParameter(c55001xbh, "");
        Intrinsics.checkNotNullParameter(str, "");
        C22495hgT c22495hgT = hlp.OLrzqt;
        c22495hgT.valueOf(str);
        java.lang.String maxData2 = null;
        C22495hgT.getMarketPrice$default(c22495hgT, null, 1, null);
        if (hlp.OLrzqt.AubY() == ChangeType.FromChange) {
            ConsumeData<TradeInputGroup> value = c22495hgT.getPostValueLengthLimit().getValue();
            if (value != null && (data5 = value.getData()) != null && (fromData3 = data5.getFromData()) != null && (data6 = fromData3.getData()) != null && (editData3 = data6.getEditData()) != null) {
                maxData2 = editData3.getMaxData();
            }
            if (!Intrinsics.EZpvd((java.lang.Object) maxData2, (java.lang.Object) MultiTransferSignData.DEFAULT_INTERVAL)) {
                ConsumeData<TradeInputGroup> value2 = c22495hgT.getPostValueLengthLimit().getValue();
                if (value2 != null && (data3 = value2.getData()) != null && (fromData2 = data3.getFromData()) != null && (data4 = fromData2.getData()) != null && (editData2 = data4.getEditData()) != null && (maxData = editData2.getMaxData()) != null) {
                    str2 = maxData;
                }
                hlp.KWHzl(str, str2, c22495hgT.getPostValueLengthLimit());
                ConsumeData<TradeInputGroup> value3 = c22495hgT.getPostValueLengthLimit().getValue();
                if (value3 != null && (data = value3.getData()) != null && (fromData = data.getFromData()) != null && (data2 = fromData.getData()) != null && (editData = data2.getEditData()) != null) {
                    editData.setMaxData(MultiTransferSignData.DEFAULT_INTERVAL);
                }
            } else {
                hlp.KWHzl(str, MultiTransferSignData.DEFAULT_INTERVAL, c22495hgT.getPostValueLengthLimit());
            }
            C22877hne.trackDexSwapFullClick$default(C22877hne.OLrzqt, hlp.OLrzqt.AxsJAYaxsJAY(), DexSwapFullClick.MODIFY_FROM_AMOUNT.getValue(), false, null, 12, null);
        }
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(hLP hlp, C55001xbh c55001xbh, java.lang.String str) {
        Intrinsics.checkNotNullParameter(c55001xbh, "");
        Intrinsics.checkNotNullParameter(str, "");
        hlp.OLrzqt.AEQbTJ(ChangeType.FromChange);
        if (str.length() == 0) {
            hlp.OLrzqt.AkhnZx();
        }
        return Unit.INSTANCE;
    }

    @Override // o.hLK
    public void KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull MutableLiveData<ConsumeData<TradeInputGroup>> mutableLiveData) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(mutableLiveData, "");
        if (this.OLrzqt.getPostValueLengthLimit().getValue() != null) {
            this.AEQbTJ.fromCoinChangeFinish(str, str2, mutableLiveData);
            this.OLrzqt.zuWLRA().refreshStatePool(new TradeStep(CheckStep.INPUT, false, SwapState.SWAP_INPUT, true, true));
        }
    }

    @Override // o.hLH
    public java.lang.Boolean copydefault() {
        return java.lang.Boolean.valueOf(C23313hvq.OLrzqt(OLrzqt(), 0));
    }

    public java.lang.String OLrzqt() {
        TradeInputGroup data;
        ConsumeData<TradeInputData> fromData;
        TradeInputData data2;
        EditTextData editData;
        java.lang.String data3;
        java.lang.String strOLrzqt;
        ConsumeData<TradeInputGroup> value = this.OLrzqt.getPostValueLengthLimit().getValue();
        return (value == null || (data = value.getData()) == null || (fromData = data.getFromData()) == null || (data2 = fromData.getData()) == null || (editData = data2.getEditData()) == null || (data3 = editData.getData()) == null || (strOLrzqt = C23311hvo.OLrzqt(data3)) == null) ? "" : strOLrzqt;
    }

    @Override // o.hLH
    public TradeInputGroup EZpvd(@NotNull LimitCalResult limitCalResult) {
        TradeInputGroup data;
        Intrinsics.checkNotNullParameter(limitCalResult, "");
        ConsumeData<TradeInputGroup> value = this.OLrzqt.getPostValueLengthLimit().getValue();
        if (value == null || (data = value.getData()) == null) {
            return null;
        }
        return data.setLimitInputSellAmount(limitCalResult);
    }

    public boolean EZpvd() {
        return C23313hvq.OLrzqt(OLrzqt(), 0);
    }
}
