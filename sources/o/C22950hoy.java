package o;

import androidx.lifecycle.MutableLiveData;
import com.okinc.business.defi.api.model.tx.signdata.MultiTransferSignData;
import com.okinc.business.dexlogic.bean.ConsumeData;
import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import com.okinc.business.dexlogic.bean.QuotePriceRes;
import com.okinc.business.dexlogic.main.swap.trade.bean.EditTextData;
import com.okinc.business.dexlogic.main.swap.trade.bean.TradeInputData;
import com.okinc.business.dexlogic.main.swap.trade.bean.TradeInputGroup;
import com.okinc.business.dexlogic.main.swap.trade.input.helper.quote.forward.FromCoinChange;
import com.okinc.business.dexlogic.main.swap.trade.status.helper.CheckStep;
import com.okinc.business.dexlogic.main.swap.trade.status.helper.SwapState;
import com.okinc.business.dexlogic.main.swap.trade.status.helper.TradeStep;
import com.okinc.business.dexlogic.track.enums.DexSwapFullClick;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.hoy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C22950hoy extends AbstractC22946hou implements InterfaceC22902hoC {
    public final Function2<C55001xbh, java.lang.String, Unit> AEQbTJ;
    public final Function2<C55001xbh, java.lang.String, Unit> EZpvd;
    public final AbstractC23101hrq KWHzl;
    public final FromCoinChange OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public Function2<C55001xbh, java.lang.String, Unit> AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public Function2<C55001xbh, java.lang.String, Unit> AYXKKw() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC22946hou
    public AbstractC23101hrq aH_() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0009: CONSTRUCTOR 
  (r1v0 o.hrq)
  (r2v0 o.hoD)
  (wrap:com.okinc.business.dexlogic.main.swap.trade.input.helper.quote.forward.FromCoinChange:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:com.okinc.business.dexlogic.main.swap.trade.input.helper.quote.forward.FromCoinChange:0x0006: CONSTRUCTOR  A[MD:():void (m), WRAPPED] (LINE:34) call: com.okinc.business.dexlogic.main.swap.trade.input.helper.quote.forward.FromCoinChange.<init>():void type: CONSTRUCTOR) : (r3v0 com.okinc.business.dexlogic.main.swap.trade.input.helper.quote.forward.FromCoinChange))
 A[MD:(o.hrq, o.hoD, com.okinc.business.dexlogic.main.swap.trade.input.helper.quote.forward.FromCoinChange):void (m)] (LINE:31) call: o.hoy.<init>(o.hrq, o.hoD, com.okinc.business.dexlogic.main.swap.trade.input.helper.quote.forward.FromCoinChange):void type: THIS */
    public /* synthetic */ C22950hoy(AbstractC23101hrq abstractC23101hrq, InterfaceC22903hoD interfaceC22903hoD, FromCoinChange fromCoinChange, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(abstractC23101hrq, interfaceC22903hoD, (i & 4) != 0 ? new FromCoinChange() : fromCoinChange);
    }

    public C22950hoy(@NotNull AbstractC23101hrq abstractC23101hrq, final InterfaceC22903hoD interfaceC22903hoD, @NotNull FromCoinChange fromCoinChange) {
        Intrinsics.checkNotNullParameter(abstractC23101hrq, "");
        Intrinsics.checkNotNullParameter(fromCoinChange, "");
        this.KWHzl = abstractC23101hrq;
        this.OLrzqt = fromCoinChange;
        this.EZpvd = new Function2() { // from class: o.hoA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C22950hoy.OLrzqt(this.KWHzl, interfaceC22903hoD, (C55001xbh) obj, (java.lang.String) obj2);
            }
        };
        this.AEQbTJ = new Function2() { // from class: o.hoz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C22950hoy.copydefault(this.AEQbTJ, interfaceC22903hoD, (C55001xbh) obj, (java.lang.String) obj2);
            }
        };
    }

    public static final Unit OLrzqt(C22950hoy c22950hoy, InterfaceC22903hoD interfaceC22903hoD, C55001xbh c55001xbh, java.lang.String str) {
        Intrinsics.checkNotNullParameter(c55001xbh, "");
        Intrinsics.checkNotNullParameter(str, "");
        AbstractC23101hrq abstractC23101hrq = c22950hoy.KWHzl;
        abstractC23101hrq.DGOPHZ();
        if (!abstractC23101hrq.QUSxYX().fetchVPNInfo()) {
            ConsumeData<TradeInputGroup> value = abstractC23101hrq.dmfpNf().getValue();
            Intrinsics.copydefault(value);
            if (!Intrinsics.EZpvd((java.lang.Object) value.getData().getFromData().getData().getEditData().getMaxData(), (java.lang.Object) MultiTransferSignData.DEFAULT_INTERVAL)) {
                if (abstractC23101hrq.QUSxYX().isConnected()) {
                    if (interfaceC22903hoD != null) {
                        interfaceC22903hoD.AEQbTJ(0);
                    }
                } else if (interfaceC22903hoD != null) {
                    interfaceC22903hoD.AEQbTJ(8);
                }
                ConsumeData<TradeInputGroup> value2 = abstractC23101hrq.dmfpNf().getValue();
                Intrinsics.copydefault(value2);
                c22950hoy.copydefault(str, value2.getData().getFromData().getData().getEditData().getMaxData(), abstractC23101hrq.dmfpNf());
                ConsumeData<TradeInputGroup> value3 = abstractC23101hrq.dmfpNf().getValue();
                Intrinsics.copydefault(value3);
                value3.getData().getFromData().getData().getEditData().setMaxData(MultiTransferSignData.DEFAULT_INTERVAL);
            } else {
                if (interfaceC22903hoD != null) {
                    interfaceC22903hoD.AEQbTJ(8);
                }
                c22950hoy.copydefault(str, MultiTransferSignData.DEFAULT_INTERVAL, abstractC23101hrq.dmfpNf());
            }
            C22877hne.trackDexSwapFullClick$default(C22877hne.OLrzqt, c22950hoy.KWHzl.ffGIBT(), DexSwapFullClick.MODIFY_FROM_AMOUNT.getValue(), false, null, 12, null);
        }
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(C22950hoy c22950hoy, InterfaceC22903hoD interfaceC22903hoD, C55001xbh c55001xbh, java.lang.String str) {
        Intrinsics.checkNotNullParameter(c55001xbh, "");
        Intrinsics.checkNotNullParameter(str, "");
        AbstractC23101hrq abstractC23101hrq = c22950hoy.KWHzl;
        abstractC23101hrq.fetchVPNInfo(false);
        if (interfaceC22903hoD != null) {
            interfaceC22903hoD.KWHzl();
        }
        if (abstractC23101hrq.UeEOUB()) {
            c22950hoy.KWHzl.isConnected(false);
        }
        if (!c22950hoy.KWHzl.QUSxYX().fetchVPNInfo()) {
            c22950hoy.OLrzqt();
        }
        return Unit.INSTANCE;
    }

    public void copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull MutableLiveData<ConsumeData<TradeInputGroup>> mutableLiveData) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(mutableLiveData, "");
        if (this.KWHzl.dmfpNf().getValue() != null) {
            this.OLrzqt.fromCoinChangeFinish(str, str2, mutableLiveData);
            this.KWHzl.dHguZz().refreshStatePool(new TradeStep(CheckStep.INPUT, false, SwapState.SWAP_INPUT, true, true));
        }
    }

    @Override // o.InterfaceC22902hoC
    public TradeInputGroup copydefault(@NotNull QuotePriceRes quotePriceRes, @NotNull java.lang.String str) {
        TradeInputGroup data;
        Intrinsics.checkNotNullParameter(quotePriceRes, "");
        Intrinsics.checkNotNullParameter(str, "");
        ConsumeData<TradeInputGroup> value = this.KWHzl.dmfpNf().getValue();
        if (value == null || (data = value.getData()) == null) {
            return null;
        }
        return data.setForwardFromToAmount(quotePriceRes, str);
    }

    @Override // o.InterfaceC22902hoC
    public TradeInputGroup djBIcL() {
        TradeInputGroup data;
        ConsumeData<TradeInputGroup> value = this.KWHzl.dmfpNf().getValue();
        if (value == null || (data = value.getData()) == null) {
            return null;
        }
        return data.noQuoteForwardFetched();
    }

    @Override // o.InterfaceC22902hoC
    public java.lang.String EZpvd() {
        TradeInputGroup data;
        ConsumeData<TradeInputData> fromData;
        TradeInputData data2;
        EditTextData editData;
        java.lang.String data3;
        java.lang.String strOLrzqt;
        ConsumeData<TradeInputGroup> value = this.KWHzl.dmfpNf().getValue();
        return (value == null || (data = value.getData()) == null || (fromData = data.getFromData()) == null || (data2 = fromData.getData()) == null || (editData = data2.getEditData()) == null || (data3 = editData.getData()) == null || (strOLrzqt = C23311hvo.OLrzqt(data3)) == null) ? "" : strOLrzqt;
    }

    @Override // o.InterfaceC22902hoC
    public TradeInputGroup copydefault(@NotNull java.lang.String str, boolean z) {
        TradeInputGroup data;
        Intrinsics.checkNotNullParameter(str, "");
        ConsumeData<TradeInputGroup> value = this.KWHzl.dmfpNf().getValue();
        if (value == null || (data = value.getData()) == null) {
            return null;
        }
        return data.forwardChangeFromTo(str, z);
    }

    @Override // o.InterfaceC22902hoC
    public boolean valueOf() {
        return C23313hvq.OLrzqt(EZpvd(), 0);
    }

    @Override // o.InterfaceC22902hoC
    public java.lang.String KWHzl() {
        java.lang.String fromTokenAmount;
        QuotePriceRes confirmQuotePriceRes = this.KWHzl.RlQdEF().getConfirmQuotePriceRes();
        return (confirmQuotePriceRes == null || (fromTokenAmount = confirmQuotePriceRes.getFromTokenAmount(this.KWHzl.QUSxYX().fetchVPNInfo())) == null) ? "" : fromTokenAmount;
    }

    @Override // o.InterfaceC22902hoC
    public boolean copydefault() {
        QuotePriceRes quotePriceResAxsJAYsNCnLh = this.KWHzl.AxsJAYsNCnLh();
        if (quotePriceResAxsJAYsNCnLh != null) {
            return C23313hvq.EZpvd(java.lang.Double.valueOf(C23313hvq.divCheckD$default(java.lang.Double.valueOf(C23313hvq.subCheckD$default(quotePriceResAxsJAYsNCnLh.receiveAmount(), quotePriceResAxsJAYsNCnLh.minimumReceived(), null, null, null, 14, null)), quotePriceResAxsJAYsNCnLh.receiveAmount(), null, null, null, 14, null)), java.lang.Double.valueOf(0.1d));
        }
        return false;
    }

    @Override // o.InterfaceC22902hoC
    public TradeInputGroup OLrzqt(DexMultiTokenInfoBean dexMultiTokenInfoBean, DexMultiTokenInfoBean dexMultiTokenInfoBean2) {
        TradeInputGroup data;
        if (dexMultiTokenInfoBean2 != null) {
            if (this.KWHzl.dmfpNf().getValue() != null) {
                ConsumeData<TradeInputGroup> value = this.KWHzl.dmfpNf().getValue();
                if (value != null && (data = value.getData()) != null) {
                    return data.replaceFromToToken(dexMultiTokenInfoBean, dexMultiTokenInfoBean2);
                }
            } else if (dexMultiTokenInfoBean != null) {
                return new TradeInputGroup(C22332hdP.EZpvd(this.KWHzl.aKErDB().initFromData(dexMultiTokenInfoBean, "")), C22332hdP.EZpvd(this.KWHzl.aKErDB().initToData(dexMultiTokenInfoBean2)), null, 4, null);
            }
        } else {
            ConsumeData<TradeInputGroup> value2 = this.KWHzl.dmfpNf().getValue();
            if (value2 != null) {
                return value2.getData();
            }
        }
        return null;
    }
}
