package o;

import com.google.gson.JsonObject;
import com.okinc.business.defi.api.bean.DappInteractionArgs;
import com.okinc.business.defi.api.bean.NewCallbackBean;
import com.okinc.business.defi.api.bean.ReserveBean;
import com.okinc.business.defi.api.bean.ReserveInfoBean;
import com.okinc.business.defi.api.model.tx.signdata.BaseSignData;
import com.okinc.business.defi.api.model.tx.signdata.ContractSignData;
import com.okinc.network.okg.response.ResponseData;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.bEI, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C8518bEI {
    public final java.util.Set<C10854bwM> AEQbTJ;
    public java.lang.String EZpvd;
    public final java.util.Map<java.lang.Long, java.lang.String> KWHzl;
    public final java.util.Map<java.lang.Long, java.lang.String> OLrzqt;
    public boolean copydefault;
    public final AbstractC8601bFm<?, ?> djBIcL;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        java.lang.String str = this.EZpvd;
        return str == null ? "1.05" : str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.Set<C10854bwM> OLrzqt() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(java.lang.String str) {
        this.EZpvd = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.Map<java.lang.Long, java.lang.String> copydefault() {
        return this.OLrzqt;
    }

    public C8518bEI(@NotNull AbstractC8601bFm<?, ?> abstractC8601bFm) {
        Intrinsics.checkNotNullParameter(abstractC8601bFm, "");
        this.djBIcL = abstractC8601bFm;
        this.AEQbTJ = new LinkedHashSet();
        this.OLrzqt = new LinkedHashMap();
        this.KWHzl = new LinkedHashMap();
    }

    public final void KWHzl(@NotNull java.util.List<ContractSignData.FromToken> list) {
        C10854bwM c10854bwMEZpvd;
        Intrinsics.checkNotNullParameter(list, "");
        this.AEQbTJ.clear();
        this.OLrzqt.clear();
        this.KWHzl.clear();
        if (list.isEmpty()) {
            this.copydefault = false;
            return;
        }
        this.copydefault = true;
        long jAhwBna = this.djBIcL.dHguZz().AhwBna();
        for (ContractSignData.FromToken fromToken : list) {
            if (fromToken.isNativeToken()) {
                java.lang.String str = this.KWHzl.get(java.lang.Long.valueOf(jAhwBna));
                this.KWHzl.put(java.lang.Long.valueOf(jAhwBna), C54862xYb.convertToBigIntegerString$default(C54862xYb.KWHzl(str != null ? str : "0", fromToken.getMinAmount()), true, (RoundingMode) null, 2, (java.lang.Object) null));
            } else if (C33129mqd.OLrzqt((java.lang.CharSequence) fromToken.getTokenContractAddress()) && (c10854bwMEZpvd = C10954byG.EZpvd.valueOf().EZpvd(fromToken.getTokenContractAddress(), this.djBIcL.dHguZz().fetchVPNInfo())) != null) {
                if (fromToken.getAmount().length() == 0) {
                    fromToken.setAmount("0");
                }
                java.lang.String str2 = this.OLrzqt.get(java.lang.Long.valueOf(c10854bwMEZpvd.AhwBna()));
                if (str2 == null) {
                    str2 = "0";
                }
                this.OLrzqt.put(java.lang.Long.valueOf(c10854bwMEZpvd.AhwBna()), C54862xYb.convertToBigIntegerString$default(C54862xYb.KWHzl(str2, fromToken.getAmount()), true, (RoundingMode) null, 2, (java.lang.Object) null));
                if (fromToken.getMinAmount().length() == 0) {
                    fromToken.setMinAmount("0");
                }
                java.lang.String str3 = this.KWHzl.get(java.lang.Long.valueOf(c10854bwMEZpvd.AhwBna()));
                this.KWHzl.put(java.lang.Long.valueOf(c10854bwMEZpvd.AhwBna()), C54862xYb.convertToBigIntegerString$default(C54862xYb.KWHzl(str3 != null ? str3 : "0", fromToken.getMinAmount()), true, (RoundingMode) null, 2, (java.lang.Object) null));
                this.AEQbTJ.add(c10854bwMEZpvd);
            }
        }
    }

    public final void KWHzl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.OLrzqt.put(java.lang.Long.valueOf(this.djBIcL.dHguZz().AhwBna()), str);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [o.bCW] */
    public final C9786bcE AEQbTJ() {
        java.lang.String str;
        AbstractC8601bFm<?, ?> abstractC8601bFm = this.djBIcL;
        if (abstractC8601bFm instanceof C9100bPH) {
            return KWHzl();
        }
        C9786bcE c9786bcE = null;
        if (this.copydefault) {
            C8486bDd c8486bDdKWHzl = abstractC8601bFm.QKudOq().KWHzl();
            long jAhwBna = this.djBIcL.dHguZz().AhwBna();
            BigDecimal bigDecimalAEQbTJ = C54862xYb.AEQbTJ(this.djBIcL.DarRvM().KWHzl(java.lang.Long.valueOf(this.djBIcL.dHguZz().AhwBna()), this.djBIcL.htlTjW()), C54862xYb.OLrzqt(c8486bDdKWHzl.getFeeAmount(), EZpvd()));
            if (!C33129mqd.gEmmrt(bigDecimalAEQbTJ, this.KWHzl.get(java.lang.Long.valueOf(jAhwBna))) && (str = this.OLrzqt.get(java.lang.Long.valueOf(jAhwBna))) != null) {
                BigDecimal bigDecimalAEQbTJ2 = C54862xYb.AEQbTJ(str, bigDecimalAEQbTJ);
                if (C33129mqd.AEQbTJ(bigDecimalAEQbTJ2, 0)) {
                    c9786bcE = new C9786bcE(false, C54862xYb.convertToBigIntegerString$default(bigDecimalAEQbTJ, false, (RoundingMode) null, 3, (java.lang.Object) null), C54862xYb.convertToBigIntegerString$default(bigDecimalAEQbTJ2, false, (RoundingMode) null, 3, (java.lang.Object) null));
                }
            }
        }
        return c9786bcE == null ? new C9786bcE(true, "", "") : c9786bcE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: Fee */
    /* JADX DEBUG: Multi-variable search result rejected for r1v5, resolved type: Fee */
    /* JADX WARN: Multi-variable type inference failed */
    public final C9786bcE KWHzl() {
        java.lang.Object objOLrzqt;
        java.lang.String str;
        AbstractC8601bFm<?, ?> abstractC8601bFm = this.djBIcL;
        C9786bcE c9786bcE = null;
        if ((abstractC8601bFm instanceof C9100bPH) && this.copydefault) {
            C9165bQT c9165bQTKWHzl = ((C9225bRa) ((C9100bPH) abstractC8601bFm).QKudOq()).KWHzl();
            long jDjBIcL = ((C9225bRa) ((C9100bPH) this.djBIcL).QKudOq()).djBIcL();
            if (jDjBIcL == ((C9100bPH) this.djBIcL).dHguZz().AhwBna()) {
                objOLrzqt = C54862xYb.AEQbTJ(C54862xYb.OLrzqt(c9165bQTKWHzl.getFeeAmount(), EZpvd()), ((C9100bPH) this.djBIcL).AYXKKw().getDepositAmount());
                if (C33129mqd.gEmmrt(objOLrzqt, "0")) {
                    objOLrzqt = "0";
                }
            } else {
                objOLrzqt = C54862xYb.OLrzqt(c9165bQTKWHzl.getFeeAmount(), EZpvd());
            }
            BigDecimal bigDecimalAEQbTJ = C54862xYb.AEQbTJ(((C9100bPH) this.djBIcL).DarRvM().KWHzl(java.lang.Long.valueOf(jDjBIcL), ((C9100bPH) this.djBIcL).htlTjW()), objOLrzqt);
            if (!C33129mqd.gEmmrt(bigDecimalAEQbTJ, this.KWHzl.get(java.lang.Long.valueOf(jDjBIcL))) && (str = this.OLrzqt.get(java.lang.Long.valueOf(jDjBIcL))) != null) {
                BigDecimal bigDecimalAEQbTJ2 = C54862xYb.AEQbTJ(str, bigDecimalAEQbTJ);
                if (C33129mqd.AEQbTJ(bigDecimalAEQbTJ2, 0)) {
                    c9786bcE = new C9786bcE(false, C54862xYb.convertToBigIntegerString$default(bigDecimalAEQbTJ, false, (RoundingMode) null, 3, (java.lang.Object) null), C54862xYb.convertToBigIntegerString$default(bigDecimalAEQbTJ2, false, (RoundingMode) null, 3, (java.lang.Object) null));
                }
            }
        }
        return c9786bcE == null ? new C9786bcE(true, "", "") : c9786bcE;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [o.bCW] */
    public final ReserveInfoBean AYXKKw() {
        C10854bwM c10854bwMCopydefault;
        C9786bcE c9786bcE = (C9786bcE) this.djBIcL.UlJrfe().KWHzl(C56524yIo.AEQbTJ(C9786bcE.class));
        if (c9786bcE == null || (c10854bwMCopydefault = this.djBIcL.DarRvM().copydefault(this.djBIcL.QKudOq().djBIcL())) == null) {
            return null;
        }
        return new ReserveInfoBean(c10854bwMCopydefault.AuCTel(), c10854bwMCopydefault.OLrzqt(), c9786bcE.OLrzqt(), c9786bcE.AEQbTJ(), c10854bwMCopydefault.valueOf());
    }

    public final AbstractC58260yxt<kotlin.Pair<java.lang.Boolean, java.lang.String>> EZpvd(@NotNull ReserveBean reserveBean) {
        Intrinsics.checkNotNullParameter(reserveBean, "");
        Function1<NewCallbackBean, AbstractC58185ywX<ResponseData<java.lang.String>>> inquiryCallback = this.djBIcL.OJuSTm().getInquiryCallback();
        if (inquiryCallback == null) {
            AbstractC58260yxt<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58260yxtCopydefault = AbstractC58260yxt.copydefault(C56390yDp.OLrzqt(java.lang.Boolean.FALSE, C10857bwP.AEQbTJ("TXReserveHelper", "not support")));
            Intrinsics.checkNotNullExpressionValue(abstractC58260yxtCopydefault, "");
            return abstractC58260yxtCopydefault;
        }
        AbstractC58260yxt abstractC58260yxtValueOf = C13933dbt.okServerExceptionFilter$default(C33024moe.KWHzl((AbstractC58185ywX) inquiryCallback.invoke(new NewCallbackBean(C56424yEw.KWHzl(), new JsonObject(), false, null, false, reserveBean, null, null, null, null, null, 2008, null))), null, 1, null).valueOf();
        final Function1 function1 = new Function1() { // from class: o.bEH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C8518bEI.KWHzl(this.OLrzqt, (ResponseData) obj);
            }
        };
        AbstractC58260yxt<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58260yxtOLrzqt = abstractC58260yxtValueOf.OLrzqt(new InterfaceC58229yxO() { // from class: o.bEG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C8518bEI.AEQbTJ(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtOLrzqt, "");
        return abstractC58260yxtOLrzqt;
    }

    public static final InterfaceC58261yxu AEQbTJ(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC58261yxu) function1.invoke(obj);
    }

    public static final InterfaceC58261yxu KWHzl(C8518bEI c8518bEI, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() != 0) {
            return AbstractC58260yxt.copydefault(C56390yDp.OLrzqt(java.lang.Boolean.FALSE, responseData.getMsg()));
        }
        java.lang.String str = (java.lang.String) responseData.getData();
        BaseSignData baseSignDataKWHzl = C8396bBt.AEQbTJ.KWHzl(c8518bEI.djBIcL.dUDNAs(), c8518bEI.djBIcL.dHguZz(), str == null ? "" : str, (DappInteractionArgs) null, c8518bEI.djBIcL.QVsKAR(), c8518bEI.djBIcL.aUsmxb());
        if (baseSignDataKWHzl == null) {
            return AbstractC58260yxt.copydefault(C56390yDp.OLrzqt(java.lang.Boolean.FALSE, C10857bwP.AEQbTJ("OKWalletTransaction", "chainId not support")));
        }
        return c8518bEI.djBIcL.KWHzl(baseSignDataKWHzl).valueOf();
    }
}
