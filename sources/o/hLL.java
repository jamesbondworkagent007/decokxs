package o;

import androidx.lifecycle.MutableLiveData;
import com.okinc.business.defi.api.model.tx.signdata.MultiTransferSignData;
import com.okinc.business.dexlogic.bean.ConsumeData;
import com.okinc.business.dexlogic.main.limmitorder.CheckStep;
import com.okinc.business.dexlogic.main.limmitorder.LimitToCoinChange;
import com.okinc.business.dexlogic.main.limmitorder.SwapState;
import com.okinc.business.dexlogic.main.limmitorder.TradeStep;
import com.okinc.business.dexlogic.main.limmitorder.bean.ChangeType;
import com.okinc.business.dexlogic.main.limmitorder.bean.LimitCalResult;
import com.okinc.business.dexlogic.main.swap.trade.bean.EditTextData;
import com.okinc.business.dexlogic.main.swap.trade.bean.TradeInputData;
import com.okinc.business.dexlogic.main.swap.trade.bean.TradeInputGroup;
import com.okinc.business.dexlogic.track.enums.DexSwapFullClick;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class hLL extends hLK implements hLH {
    public LimitToCoinChange EZpvd;
    public final Function2<C55001xbh, java.lang.String, Unit> KWHzl;
    public final Function2<C55001xbh, java.lang.String, Unit> OLrzqt;
    public final C22495hgT copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public Function2<C55001xbh, java.lang.String, Unit> EZpvd() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public Function2<C55001xbh, java.lang.String, Unit> OLrzqt() {
        return this.KWHzl;
    }

    public hLL(@NotNull C22495hgT c22495hgT) {
        Intrinsics.checkNotNullParameter(c22495hgT, "");
        this.copydefault = c22495hgT;
        this.EZpvd = new LimitToCoinChange();
        this.OLrzqt = new Function2() { // from class: o.hLQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return hLL.copydefault(this.copydefault, (C55001xbh) obj, (java.lang.String) obj2);
            }
        };
        this.KWHzl = new Function2() { // from class: o.hLM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return hLL.EZpvd(this.AEQbTJ, (C55001xbh) obj, (java.lang.String) obj2);
            }
        };
    }

    public static final Unit copydefault(hLL hll, C55001xbh c55001xbh, java.lang.String str) {
        Intrinsics.checkNotNullParameter(c55001xbh, "");
        Intrinsics.checkNotNullParameter(str, "");
        C22495hgT c22495hgT = hll.copydefault;
        if (c22495hgT.AubY() == ChangeType.ToChange) {
            hll.KWHzl(str, MultiTransferSignData.DEFAULT_INTERVAL, c22495hgT.getPostValueLengthLimit());
            C22877hne.trackDexSwapFullClick$default(C22877hne.OLrzqt, c22495hgT.AxsJAYaxsJAY(), DexSwapFullClick.MODIFY_TO_AMOUNT.getValue(), false, null, 12, null);
        }
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(hLL hll, C55001xbh c55001xbh, java.lang.String str) {
        Intrinsics.checkNotNullParameter(c55001xbh, "");
        Intrinsics.checkNotNullParameter(str, "");
        if (hll.copydefault.QKVWgx()) {
            hll.copydefault.AEQbTJ(ChangeType.ToChange);
        }
        return Unit.INSTANCE;
    }

    @Override // o.hLK
    public void KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull MutableLiveData<ConsumeData<TradeInputGroup>> mutableLiveData) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(mutableLiveData, "");
        if (mutableLiveData.getValue() != null) {
            this.EZpvd.toCoinChangeFinish(str, mutableLiveData);
            this.copydefault.zuWLRA().refreshStatePool(new TradeStep(CheckStep.INPUT, false, SwapState.SWAP_INPUT, true, true));
        }
    }

    @Override // o.hLH
    public java.lang.Boolean copydefault() {
        return java.lang.Boolean.valueOf(C23313hvq.OLrzqt(KWHzl(), 0));
    }

    public java.lang.String KWHzl() {
        TradeInputGroup data;
        ConsumeData<TradeInputData> toData;
        TradeInputData data2;
        EditTextData editData;
        java.lang.String data3;
        java.lang.String strOLrzqt;
        ConsumeData<TradeInputGroup> value = this.copydefault.getPostValueLengthLimit().getValue();
        return (value == null || (data = value.getData()) == null || (toData = data.getToData()) == null || (data2 = toData.getData()) == null || (editData = data2.getEditData()) == null || (data3 = editData.getData()) == null || (strOLrzqt = C23311hvo.OLrzqt(data3)) == null) ? "" : strOLrzqt;
    }

    @Override // o.hLH
    public TradeInputGroup EZpvd(@NotNull LimitCalResult limitCalResult) {
        TradeInputGroup data;
        Intrinsics.checkNotNullParameter(limitCalResult, "");
        ConsumeData<TradeInputGroup> value = this.copydefault.getPostValueLengthLimit().getValue();
        if (value == null || (data = value.getData()) == null) {
            return null;
        }
        return data.setLimitInputToAmount(limitCalResult);
    }
}
