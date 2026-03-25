package o;

import com.okinc.business.defi.api.model.tx.FeeType;
import com.okinc.business.defi.biz.core.error.CoinMetaError;
import com.okinc.business.defi.biz.core.ticker.WalletTickerManager;
import com.okinc.business.defi.biz.core.transaction.sign.evm.bean.EvmSignInfoGasPrice;
import com.okinc.business.defi.biz.net.bean.Paymaster;
import com.okinc.business.defi.wallet.transfer.manager.FreeGasManager;
import com.okinc.localization.util.format.DisplaySign;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import o.C52761wXj;
import o.C8475bDS;
import o.C9215bRQ;
import org.jetbrains.annotations.NotNull;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: renamed from: o.bRa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C9225bRa extends AbstractC8485bDc<C9165bQT> {
    public java.util.Map<java.lang.Long, java.lang.String> AYXKKw;
    public final InterfaceC56387yDm AkhnZx;
    public C9170bQY DbNXlk;
    public Activity djBIcL;
    public final FeeType fetchVPNInfo;
    public final InterfaceC9041bOB gEmmrt;
    public java.util.List<Activity> isConnected;
    public C9745bbQ valueOf;
    public final AbstractC8564bFB<?, ?> values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC8485bDc, o.AbstractC8426bCW
    public FeeType copydefault() {
        return this.fetchVPNInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<Activity> zsXlph() {
        return this.isConnected;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9225bRa(@NotNull AbstractC8564bFB<?, ?> abstractC8564bFB, @NotNull InterfaceC9041bOB interfaceC9041bOB) {
        super(abstractC8564bFB);
        Intrinsics.checkNotNullParameter(abstractC8564bFB, "");
        Intrinsics.checkNotNullParameter(interfaceC9041bOB, "");
        this.values = abstractC8564bFB;
        this.gEmmrt = interfaceC9041bOB;
        this.fetchVPNInfo = FeeType.FEE_TYPE_SELECTED;
        this.AkhnZx = C56392yDr.copydefault(new Function0() { // from class: o.bQZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C9225bRa.fARcdN();
            }
        });
        this.AYXKKw = new java.util.HashMap();
        this.isConnected = yDY.AhwBna();
        this.valueOf = new C9745bbQ(null, 0, -1, 3, null);
        abstractC8564bFB.DarRvM().KWHzl(new C8475bDS.TaskDescription() { // from class: o.bRa.3
            @Override // o.C8475bDS.TaskDescription
            public void OLrzqt() {
            }

            @Override // o.C8475bDS.TaskDescription
            public void EZpvd() {
                C9225bRa.this.AwvSrB();
            }
        });
    }

    public final C12792ctf zLjUOn() {
        return (C12792ctf) this.AkhnZx.getValue();
    }

    public static final C12792ctf fARcdN() {
        return new C12792ctf();
    }

    public final Activity uzCIH() {
        Activity activity = this.djBIcL;
        if (activity != null) {
            return activity;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    @Override // o.AbstractC8485bDc
    public void AEQbTJ(int i) {
        KWHzl(4);
    }

    public final void AwvSrB() {
        java.util.Map<java.lang.Long, java.lang.String> mapAkhnZx = this.values.DarRvM().AkhnZx();
        AbstractC8564bFB<?, ?> abstractC8564bFB = this.values;
        if (abstractC8564bFB instanceof AbstractC8704bHj) {
            AEQbTJ(mapAkhnZx);
            return;
        }
        if (abstractC8564bFB instanceof AbstractC8601bFm) {
            java.util.Map<java.lang.Long, java.lang.String> mapCopydefault = ((AbstractC8601bFm) abstractC8564bFB).aj_().copydefault();
            if (mapCopydefault.isEmpty()) {
                AEQbTJ(mapAkhnZx);
                return;
            }
            java.util.HashMap map = new java.util.HashMap(mapAkhnZx);
            java.util.Iterator<T> it = mapCopydefault.keySet().iterator();
            while (it.hasNext()) {
                long jLongValue = ((java.lang.Number) it.next()).longValue();
                BigDecimal bigDecimalAEQbTJ = C54862xYb.AEQbTJ(map.get(java.lang.Long.valueOf(jLongValue)), mapCopydefault.get(java.lang.Long.valueOf(jLongValue)));
                java.lang.String strConvertToString$default = "0";
                if (!C33129mqd.gEmmrt(bigDecimalAEQbTJ, "0")) {
                    strConvertToString$default = C54862xYb.convertToString$default(bigDecimalAEQbTJ, false, null, null, 7, null);
                }
                map.put(java.lang.Long.valueOf(jLongValue), strConvertToString$default);
            }
            AEQbTJ(map);
        }
    }

    public final void AEQbTJ(java.util.Map<java.lang.Long, java.lang.String> map) {
        java.util.Iterator<T> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            java.util.Map<java.lang.Long, java.lang.String> map2 = this.AYXKKw;
            java.lang.Object key = entry.getKey();
            java.lang.String str = (java.lang.String) entry.getValue();
            if (str == null) {
                str = "";
            }
            map2.put((java.lang.Long) key, str);
        }
    }

    /* JADX DEBUG: Method merged with bridge method: EZpvd(I)Lo/bDi; */
    @Override // o.AbstractC8485bDc
    /* JADX INFO: renamed from: djBIcL, reason: merged with bridge method [inline-methods] */
    public C9165bQT EZpvd(int i) throws CoinMetaError {
        C9215bRQ.ActionBar actionBar;
        java.lang.String maxCost;
        C9170bQY c9170bQYFIwbmz;
        java.lang.String strFetchVPNInfo;
        java.lang.String strEjfBZ;
        boolean fieldNames;
        java.lang.String strFARcdN;
        boolean zAuCTel;
        java.lang.CharSequence charSequence;
        EvmSignInfoGasPrice gasPrice = this.gEmmrt.hDKMBd().getGasPrice();
        boolean zEZpvd = Intrinsics.EZpvd(gasPrice.getSupportEip1559(), java.lang.Boolean.TRUE);
        if (i == 31) {
            if (zEZpvd) {
                java.lang.String strConvertToString$default = C54862xYb.convertToString$default(C54862xYb.KWHzl(gasPrice.getBaseFee(), gasPrice.getSafePriorityFee()), false, null, null, 7, null);
                java.lang.String strGEmmrt = gEmmrt(i);
                java.lang.String suggestBaseFee = gasPrice.getSuggestBaseFee();
                java.lang.String str = suggestBaseFee == null ? "" : suggestBaseFee;
                java.lang.String baseFee = gasPrice.getBaseFee();
                java.lang.String str2 = baseFee == null ? "" : baseFee;
                java.lang.String baseFee2 = gasPrice.getBaseFee();
                java.lang.String str3 = baseFee2 == null ? "" : baseFee2;
                java.lang.String safePriorityFee = gasPrice.getSafePriorityFee();
                actionBar = new C9215bRQ.ActionBar(zEZpvd, str2, str3, safePriorityFee == null ? "" : safePriorityFee, strConvertToString$default, strGEmmrt, str, "");
            } else {
                java.lang.String strGEmmrt2 = gEmmrt(i);
                java.lang.String strGEmmrt3 = gEmmrt(i);
                java.lang.String minGasPrice = gasPrice.getMinGasPrice();
                actionBar = new C9215bRQ.ActionBar(zEZpvd, "", "", "", strGEmmrt2, strGEmmrt3, "", minGasPrice == null ? "" : minGasPrice);
            }
            maxCost = gasPrice.getMaxCost();
            if (maxCost == null) {
                maxCost = "";
            }
            c9170bQYFIwbmz = uzCIH().fIwbmz();
            strFetchVPNInfo = uzCIH().fetchVPNInfo();
            strEjfBZ = uzCIH().ejfBZ();
            fieldNames = uzCIH().getFieldNames();
            strFARcdN = uzCIH().fARcdN();
            zAuCTel = uzCIH().AuCTel();
        } else if (i == 33) {
            if (zEZpvd) {
                java.lang.String strConvertToString$default2 = C54862xYb.convertToString$default(C54862xYb.KWHzl(gasPrice.getBaseFee(), gasPrice.getFastPriorityFee()), false, null, null, 7, null);
                java.lang.String strGEmmrt4 = gEmmrt(i);
                java.lang.String suggestBaseFee2 = gasPrice.getSuggestBaseFee();
                java.lang.String str4 = suggestBaseFee2 == null ? "" : suggestBaseFee2;
                java.lang.String baseFee3 = gasPrice.getBaseFee();
                java.lang.String str5 = baseFee3 == null ? "" : baseFee3;
                java.lang.String baseFee4 = gasPrice.getBaseFee();
                java.lang.String str6 = baseFee4 == null ? "" : baseFee4;
                java.lang.String fastPriorityFee = gasPrice.getFastPriorityFee();
                actionBar = new C9215bRQ.ActionBar(zEZpvd, str5, str6, fastPriorityFee == null ? "" : fastPriorityFee, strConvertToString$default2, strGEmmrt4, str4, "");
            } else {
                java.lang.String strGEmmrt5 = gEmmrt(i);
                java.lang.String strGEmmrt6 = gEmmrt(i);
                java.lang.String minGasPrice2 = gasPrice.getMinGasPrice();
                actionBar = new C9215bRQ.ActionBar(zEZpvd, "", "", "", strGEmmrt5, strGEmmrt6, "", minGasPrice2 == null ? "" : minGasPrice2);
            }
            maxCost = gasPrice.getMinCost();
            if (maxCost == null) {
                maxCost = "";
            }
            c9170bQYFIwbmz = uzCIH().AYXKKw();
            strFetchVPNInfo = uzCIH().OLrzqt();
            strEjfBZ = uzCIH().gEmmrt();
            fieldNames = uzCIH().hDKMBd();
            strFARcdN = uzCIH().AhwBna();
            zAuCTel = uzCIH().djBIcL();
        } else {
            if (zEZpvd) {
                java.lang.String strConvertToString$default3 = C54862xYb.convertToString$default(C54862xYb.KWHzl(gasPrice.getBaseFee(), gasPrice.getProposePriorityFee()), false, null, null, 7, null);
                java.lang.String strGEmmrt7 = gEmmrt(i);
                java.lang.String suggestBaseFee3 = gasPrice.getSuggestBaseFee();
                java.lang.String str7 = suggestBaseFee3 == null ? "" : suggestBaseFee3;
                java.lang.String baseFee5 = gasPrice.getBaseFee();
                java.lang.String str8 = baseFee5 == null ? "" : baseFee5;
                java.lang.String baseFee6 = gasPrice.getBaseFee();
                java.lang.String str9 = baseFee6 == null ? "" : baseFee6;
                java.lang.String proposePriorityFee = gasPrice.getProposePriorityFee();
                actionBar = new C9215bRQ.ActionBar(zEZpvd, str8, str9, proposePriorityFee == null ? "" : proposePriorityFee, strConvertToString$default3, strGEmmrt7, str7, "");
            } else {
                java.lang.String strGEmmrt8 = gEmmrt(i);
                java.lang.String strGEmmrt9 = gEmmrt(i);
                java.lang.String minGasPrice3 = gasPrice.getMinGasPrice();
                actionBar = new C9215bRQ.ActionBar(zEZpvd, "", "", "", strGEmmrt8, strGEmmrt9, "", minGasPrice3 == null ? "" : minGasPrice3);
            }
            maxCost = gasPrice.getNormalCost();
            if (maxCost == null) {
                maxCost = "";
            }
            c9170bQYFIwbmz = uzCIH().AkhnZx();
            strFetchVPNInfo = uzCIH().valueOf();
            strEjfBZ = uzCIH().isConnected();
            fieldNames = uzCIH().getNewProxyInstance();
            strFARcdN = uzCIH().DbNXlk();
            zAuCTel = uzCIH().values();
        }
        java.lang.String str10 = strFARcdN;
        boolean z = zAuCTel;
        java.lang.String str11 = maxCost;
        boolean z2 = fieldNames;
        C9215bRQ.ActionBar actionBar2 = actionBar;
        java.lang.String strAEQbTJ = c9170bQYFIwbmz.AEQbTJ();
        if (strAEQbTJ == null) {
            strAEQbTJ = "";
        }
        java.lang.String strCopydefault = c9170bQYFIwbmz.copydefault();
        if (strCopydefault == null) {
            strCopydefault = "";
        }
        C9215bRQ.Activity activity = new C9215bRQ.Activity(strAEQbTJ, strCopydefault, "", "");
        C10854bwM c10854bwMAYXKKw = AYXKKw();
        boolean z3 = i == DbNXlk();
        java.lang.String strEZpvd = zLjUOn().EZpvd(str11, false);
        C9745bbQ c9745bbQ = z3 ? this.valueOf : null;
        java.lang.String strEZpvd2 = uzCIH().EZpvd();
        java.lang.String strAEQbTJ2 = uzCIH().AEQbTJ();
        boolean zFJNWhG = uzCIH().fJNWhG();
        java.lang.String strKWHzl = uzCIH().KWHzl();
        if (this.gEmmrt.gHZMYf()) {
            java.lang.String strAYXKKw = C33070mpX.AYXKKw(C13754dXa.FragmentManager.OEsIKP);
            charSequence = C33061mpO.setupSpanStyles$default(strAYXKKw, new java.lang.String[]{strAYXKKw}, 0, null, false, new Function1() { // from class: o.bQX
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C9225bRa.KWHzl((java.util.List) obj);
                }
            }, 14, null);
        } else {
            charSequence = null;
        }
        return new C9165bQT(i, c10854bwMAYXKKw, strEjfBZ, strFetchVPNInfo, actionBar2, activity, str11, strEZpvd, z2, str10, z, c9745bbQ, strEZpvd2, strAEQbTJ2, zFJNWhG, strKWHzl, charSequence);
    }

    public static final Unit KWHzl(java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        list.add(new android.text.style.ForegroundColorSpan(C33070mpX.copydefault(C52761wXj.Activity.DCUTEIddSDPG)));
        return Unit.INSTANCE;
    }

    @Override // o.AbstractC8426bCW
    public java.util.List<C9165bQT> OLrzqt() {
        return yDY.gEmmrt(EZpvd(31), EZpvd(32), EZpvd(33));
    }

    public final java.lang.String copydefault(java.lang.String str, InterfaceC9731bbC interfaceC9731bbC) {
        C10854bwM c10854bwMDHguZz = this.values.dHguZz();
        if ((interfaceC9731bbC != null && c10854bwMDHguZz.AhwBna() == interfaceC9731bbC.AhwBna()) || interfaceC9731bbC == null) {
            return str;
        }
        BigDecimal bigDecimalKWHzl = C54868xYh.KWHzl(str, c10854bwMDHguZz.valueOf());
        WalletTickerManager.CoinPrice coinPriceCopydefault = this.values.DarRvM().copydefault(java.lang.Long.valueOf(c10854bwMDHguZz.AhwBna()));
        BigDecimal bigDecimalOLrzqt = C54862xYb.OLrzqt(bigDecimalKWHzl, coinPriceCopydefault != null ? coinPriceCopydefault.getRealPrice() : null);
        WalletTickerManager.CoinPrice coinPriceCopydefault2 = this.values.DarRvM().copydefault(java.lang.Long.valueOf(interfaceC9731bbC.AhwBna()));
        return C54862xYb.convertToString$default(C54868xYh.EZpvd(C54862xYb.convertToString$default(C54862xYb.divB$default(bigDecimalOLrzqt, coinPriceCopydefault2 != null ? coinPriceCopydefault2.getRealPrice() : null, 0, null, 6, null), false, null, null, 7, null), interfaceC9731bbC.valueOf()), false, 0, RoundingMode.UP, 1, null);
    }

    public final boolean AuCTelauCTel() {
        return this.gEmmrt.fARcdN().getErrorCode() == 0;
    }

    @Override // o.AbstractC8426bCW
    public void KWHzl(int i) {
        sSMYrx();
        super.KWHzl(i);
    }

    public final boolean AubY() {
        int iDbNXlk = DbNXlk();
        if (iDbNXlk == 31) {
            return uzCIH().AuCTel();
        }
        if (iDbNXlk == 33) {
            return uzCIH().djBIcL();
        }
        return uzCIH().values();
    }

    public final boolean EZpvd(java.lang.String str) {
        BigDecimal bigDecimalCopydefault = copydefault(str);
        if (C33129mqd.AEQbTJ(bigDecimalCopydefault, "0")) {
            return C33129mqd.valueOf(bigDecimalCopydefault, this.gEmmrt.fARcdN().getLimitGasValuation());
        }
        return false;
    }

    public final BigDecimal copydefault(java.lang.String str) {
        return C54862xYb.OLrzqt(C54870xYj.AEQbTJ(str, AYXKKw().valueOf()), valueOf());
    }

    /* JADX WARN: Removed duplicated region for block: B:79:0x02f4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void sSMYrx() {
        java.lang.String min;
        java.lang.String normal;
        java.lang.String max;
        java.lang.String str;
        java.lang.Object obj;
        java.lang.String strCopydefault;
        AbstractC8564bFB<?, ?> abstractC8564bFB = this.values;
        int i = 0;
        if (abstractC8564bFB instanceof AbstractC8664bGw) {
            long jAhwBna = ((AbstractC8664bGw) abstractC8564bFB).fHqPtx().AhwBna();
            java.util.Map<java.lang.Long, java.lang.String> map = this.AYXKKw;
            BigDecimal bigDecimalAEQbTJ = C54862xYb.AEQbTJ(((AbstractC8664bGw) this.values).DarRvM().KWHzl(java.lang.Long.valueOf(jAhwBna), ((AbstractC8664bGw) this.values).htlTjW()), AbstractC8704bHj.getTransferAmount$default((AbstractC8704bHj) this.values, false, false, 3, null));
            map.put(java.lang.Long.valueOf(jAhwBna), C33129mqd.gEmmrt(bigDecimalAEQbTJ, "0") ? "0" : C54862xYb.convertToString$default(bigDecimalAEQbTJ, false, null, null, 7, null));
        }
        EvmSignInfoGasPrice gasPrice = this.gEmmrt.hDKMBd().getGasPrice();
        if (AxsJAY()) {
            min = C54862xYb.convertToString$default(C54862xYb.KWHzl(gasPrice.getBaseFee(), gasPrice.getSafePriorityFee()), false, null, null, 7, null);
            normal = C54862xYb.convertToString$default(C54862xYb.KWHzl(gasPrice.getBaseFee(), gasPrice.getProposePriorityFee()), false, null, null, 7, null);
            max = C54862xYb.convertToString$default(C54862xYb.KWHzl(gasPrice.getBaseFee(), gasPrice.getFastPriorityFee()), false, null, null, 7, null);
        } else {
            min = gasPrice.getMin();
            normal = gasPrice.getNormal();
            max = gasPrice.getMax();
        }
        java.util.List<C9168bQW> listDbNXlk = this.gEmmrt.DbNXlk();
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listDbNXlk, 10));
        java.util.Iterator<T> it = listDbNXlk.iterator();
        while (true) {
            str = "";
            if (!it.hasNext()) {
                break;
            }
            C9168bQW c9168bQW = (C9168bQW) it.next();
            Activity activity = new Activity();
            activity.AEQbTJ(c9168bQW.AEQbTJ());
            activity.EZpvd(KWHzl(c9168bQW, 31));
            activity.OLrzqt(KWHzl(c9168bQW, 32));
            activity.AEQbTJ(KWHzl(c9168bQW, 33));
            kotlin.Pair<java.lang.String, java.lang.String> pairOLrzqt = OLrzqt(activity.fIwbmz(), 31);
            java.lang.String strComponent1 = pairOLrzqt.component1();
            java.lang.String strComponent2 = pairOLrzqt.component2();
            activity.fetchVPNInfo(strComponent1);
            activity.isConnected(strComponent2);
            kotlin.Pair<java.lang.String, java.lang.String> pairOLrzqt2 = OLrzqt(activity.AkhnZx(), 32);
            java.lang.String strComponent12 = pairOLrzqt2.component1();
            java.lang.String strComponent22 = pairOLrzqt2.component2();
            activity.valueOf(strComponent12);
            activity.DbNXlk(strComponent22);
            kotlin.Pair<java.lang.String, java.lang.String> pairOLrzqt3 = OLrzqt(activity.AYXKKw(), 33);
            java.lang.String strComponent13 = pairOLrzqt3.component1();
            java.lang.String strComponent23 = pairOLrzqt3.component2();
            activity.AhwBna(strComponent13);
            activity.AYXKKw(strComponent23);
            activity.AkhnZx(c9168bQW.KWHzl() ? C54862xYb.convertToString$default(C54862xYb.OLrzqt(min, activity.fIwbmz().EZpvd()), false, null, null, 7, null) : "");
            activity.djBIcL(c9168bQW.KWHzl() ? C54862xYb.convertToString$default(C54862xYb.OLrzqt(normal, activity.AkhnZx().EZpvd()), false, null, null, 7, null) : "");
            activity.gEmmrt(c9168bQW.KWHzl() ? C54862xYb.convertToString$default(C54862xYb.OLrzqt(max, activity.AYXKKw().EZpvd()), false, null, null, 7, null) : "");
            java.lang.String strKWHzl = this.values.DarRvM().KWHzl(java.lang.Long.valueOf(activity.copydefault().AhwBna()), this.values.htlTjW());
            if (strKWHzl == null) {
                strKWHzl = "";
            }
            activity.EZpvd(strKWHzl);
            java.lang.String str2 = this.AYXKKw.get(java.lang.Long.valueOf(activity.copydefault().AhwBna()));
            if (str2 == null) {
                str2 = "";
            }
            activity.KWHzl(str2);
            activity.KWHzl(c9168bQW.EZpvd());
            if (c9168bQW.EZpvd() && (strCopydefault = c9168bQW.copydefault()) != null) {
                str = strCopydefault;
            }
            activity.copydefault(str);
            arrayList.add(activity);
        }
        this.isConnected = arrayList;
        zuBGHE();
        AbstractC8564bFB<?, ?> abstractC8564bFB2 = this.values;
        if (abstractC8564bFB2 instanceof AbstractC8664bGw) {
            long jAhwBna2 = ((AbstractC8664bGw) abstractC8564bFB2).fHqPtx().AhwBna();
            java.util.Map<java.lang.Long, java.lang.String> map2 = this.AYXKKw;
            BigDecimal bigDecimalAEQbTJ2 = C54862xYb.AEQbTJ(((AbstractC8664bGw) this.values).DarRvM().KWHzl(java.lang.Long.valueOf(jAhwBna2), ((AbstractC8664bGw) this.values).htlTjW()), AbstractC8704bHj.getTransferAmount$default((AbstractC8704bHj) this.values, false, false, 3, null));
            map2.put(java.lang.Long.valueOf(jAhwBna2), C33129mqd.gEmmrt(bigDecimalAEQbTJ2, "0") ? "0" : C54862xYb.convertToString$default(bigDecimalAEQbTJ2, false, null, null, 7, null));
            java.util.Iterator<T> it2 = this.isConnected.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj = null;
                    break;
                }
                java.lang.Object next = it2.next();
                if (((Activity) next).copydefault().AhwBna() == jAhwBna2) {
                    obj = next;
                    break;
                }
            }
            Activity activity2 = (Activity) obj;
            if (activity2 != null) {
                java.lang.String str3 = this.AYXKKw.get(java.lang.Long.valueOf(jAhwBna2));
                activity2.KWHzl(str3 != null ? str3 : "");
            }
        }
        FreeGasManager.UserFreeGasInfo userFreeGasInfoFARcdN = this.gEmmrt.fARcdN();
        this.valueOf.KWHzl(userFreeGasInfoFARcdN.getLimitGasValuation());
        this.valueOf.OLrzqt(userFreeGasInfoFARcdN.getAvailableTimes());
        C9745bbQ c9745bbQ = this.valueOf;
        int errorCode = userFreeGasInfoFARcdN.getErrorCode();
        if (errorCode != 0) {
            switch (errorCode) {
                case 170004:
                    i = 2;
                    break;
                case 170005:
                    i = 3;
                    break;
                case 170006:
                    i = 4;
                    break;
                default:
                    i = -1;
                    break;
            }
        } else {
            if (AubY()) {
                if (!EZpvd(KWHzl().getFeeAmount())) {
                }
            } else if (!fIwbmz() || EZpvd(KWHzl().getFeeAmount())) {
            }
            i = 1;
        }
        c9745bbQ.KWHzl(i);
    }

    public final boolean fIwbmz() {
        for (C9168bQW c9168bQW : this.gEmmrt.DbNXlk()) {
            if (c9168bQW.AEQbTJ().AhwBna() == AYXKKw().AhwBna()) {
                java.util.Iterator<T> it = c9168bQW.OLrzqt().iterator();
                while (it.hasNext()) {
                    Paymaster paymasterValueOf = ((C9170bQY) it.next()).valueOf();
                    if (paymasterValueOf != null && paymasterValueOf.isFreeGasPaymaster()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final boolean AxsJAY() {
        return Intrinsics.EZpvd(this.gEmmrt.hDKMBd().getGasPrice().getSupportEip1559(), java.lang.Boolean.TRUE);
    }

    public static /* synthetic */ java.lang.String getGasPrice$default(C9225bRa c9225bRa, int i, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = c9225bRa.DbNXlk();
        }
        return c9225bRa.gEmmrt(i);
    }

    public final java.lang.String gEmmrt(int i) {
        java.lang.String min;
        if (i == 31) {
            min = this.gEmmrt.hDKMBd().getGasPrice().getMin();
        } else if (i == 33) {
            min = this.gEmmrt.hDKMBd().getGasPrice().getMax();
        } else {
            min = this.gEmmrt.hDKMBd().getGasPrice().getNormal();
        }
        return min == null ? "" : min;
    }

    public final java.lang.String iwGUEr() {
        if (AxsJAY()) {
            int iDbNXlk = DbNXlk();
            if (iDbNXlk == 31) {
                return this.gEmmrt.hDKMBd().getGasPrice().getSafePriorityFee();
            }
            if (iDbNXlk == 33) {
                return this.gEmmrt.hDKMBd().getGasPrice().getFastPriorityFee();
            }
            return this.gEmmrt.hDKMBd().getGasPrice().getProposePriorityFee();
        }
        return getGasPrice$default(this, 0, 1, null);
    }

    public final C9170bQY hDKMBd() {
        C9170bQY c9170bQY;
        C9170bQY c9170bQY2 = this.DbNXlk;
        C9170bQY c9170bQY3 = null;
        if (c9170bQY2 == null) {
            Intrinsics.gEmmrt("");
            c9170bQY2 = null;
        }
        if (C33129mqd.OLrzqt((java.lang.CharSequence) c9170bQY2.OLrzqt())) {
            C9170bQY c9170bQY4 = this.DbNXlk;
            if (c9170bQY4 == null) {
                Intrinsics.gEmmrt("");
                c9170bQY4 = null;
            }
            if (C33129mqd.OLrzqt((java.lang.CharSequence) c9170bQY4.KWHzl())) {
                C9170bQY c9170bQY5 = this.DbNXlk;
                if (c9170bQY5 == null) {
                    Intrinsics.gEmmrt("");
                    c9170bQY = null;
                } else {
                    c9170bQY = c9170bQY5;
                }
                C9170bQY c9170bQY6 = this.DbNXlk;
                if (c9170bQY6 == null) {
                    Intrinsics.gEmmrt("");
                    c9170bQY6 = null;
                }
                java.lang.String strAhwBna = c9170bQY6.AhwBna();
                C9170bQY c9170bQY7 = this.DbNXlk;
                if (c9170bQY7 == null) {
                    Intrinsics.gEmmrt("");
                    c9170bQY7 = null;
                }
                java.lang.String strOLrzqt = c9170bQY7.OLrzqt();
                C9170bQY c9170bQY8 = this.DbNXlk;
                if (c9170bQY8 == null) {
                    Intrinsics.gEmmrt("");
                } else {
                    c9170bQY3 = c9170bQY8;
                }
                return c9170bQY.copydefault((4087 & 1) != 0 ? c9170bQY.AYXKKw : null, (4087 & 2) != 0 ? c9170bQY.gEmmrt : null, (4087 & 4) != 0 ? c9170bQY.EZpvd : null, (4087 & 8) != 0 ? c9170bQY.DbNXlk : C54862xYb.convertToString$default(C54862xYb.KWHzl(strAhwBna, C54862xYb.divB$default(C54862xYb.OLrzqt(strOLrzqt, c9170bQY3.KWHzl()), AhwBna(DbNXlk()), 0, null, 6, null)), false, 0, RoundingMode.UP, 1, null), (4087 & 16) != 0 ? c9170bQY.fetchVPNInfo : null, (4087 & 32) != 0 ? c9170bQY.djBIcL : null, (4087 & 64) != 0 ? c9170bQY.valueOf : null, (4087 & 128) != 0 ? c9170bQY.AhwBna : null, (4087 & 256) != 0 ? c9170bQY.KWHzl : null, (4087 & 512) != 0 ? c9170bQY.copydefault : null, (4087 & 1024) != 0 ? c9170bQY.OLrzqt : null, (4087 & 2048) != 0 ? c9170bQY.AEQbTJ : null);
            }
        }
        C9170bQY c9170bQY9 = this.DbNXlk;
        if (c9170bQY9 != null) {
            return c9170bQY9;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    public final java.lang.String getNewProxyInstance() {
        C9170bQY c9170bQY = this.DbNXlk;
        if (c9170bQY == null) {
            Intrinsics.gEmmrt("");
            c9170bQY = null;
        }
        return c9170bQY.AEQbTJ();
    }

    public final boolean wlaJM() {
        C9170bQY c9170bQY = this.DbNXlk;
        if (c9170bQY == null) {
            Intrinsics.gEmmrt("");
            c9170bQY = null;
        }
        return c9170bQY.copydefault() != null;
    }

    public final Paymaster AuCTel() {
        C9170bQY c9170bQY = this.DbNXlk;
        if (c9170bQY == null) {
            Intrinsics.gEmmrt("");
            c9170bQY = null;
        }
        return c9170bQY.valueOf();
    }

    public final java.lang.String getFieldNames() {
        C9170bQY c9170bQY = this.DbNXlk;
        if (c9170bQY == null) {
            Intrinsics.gEmmrt("");
            c9170bQY = null;
        }
        return c9170bQY.djBIcL();
    }

    public final java.lang.String AhwBna(int i) {
        java.lang.String safePriorityFee;
        if (AxsJAY()) {
            java.lang.String baseFee = this.gEmmrt.hDKMBd().getGasPrice().getBaseFee();
            switch (i) {
                case 31:
                    safePriorityFee = this.gEmmrt.hDKMBd().getGasPrice().getSafePriorityFee();
                    break;
                case 32:
                    safePriorityFee = this.gEmmrt.hDKMBd().getGasPrice().getProposePriorityFee();
                    break;
                case 33:
                    safePriorityFee = this.gEmmrt.hDKMBd().getGasPrice().getFastPriorityFee();
                    break;
                default:
                    safePriorityFee = "";
                    break;
            }
            return C54862xYb.convertToString$default(C54862xYb.KWHzl(baseFee, safePriorityFee), false, null, null, 7, null);
        }
        return this.gEmmrt.hDKMBd().getGasPrice().getOriginal();
    }

    public final void AEQbTJ(@NotNull InterfaceC9731bbC interfaceC9731bbC) {
        Intrinsics.checkNotNullParameter(interfaceC9731bbC, "");
        OLrzqt(interfaceC9731bbC.AhwBna());
        zuBGHE();
        KWHzl(4);
    }

    public final void zuBGHE() {
        Activity activityFJNWhG = fJNWhG();
        OLrzqt(activityFJNWhG.copydefault().AhwBna());
        this.djBIcL = activityFJNWhG;
        switch (DbNXlk()) {
            case 31:
                this.DbNXlk = activityFJNWhG.fIwbmz();
                break;
            case 32:
                this.DbNXlk = activityFJNWhG.AkhnZx();
                break;
            case 33:
                this.DbNXlk = activityFJNWhG.AYXKKw();
                break;
        }
    }

    public final C9170bQY KWHzl(C9168bQW c9168bQW, int i) {
        java.lang.Integer numValueOf = null;
        int iIntValue = 0;
        java.lang.Integer numValueOf2 = null;
        int i2 = 0;
        for (java.lang.Object obj : c9168bQW.OLrzqt()) {
            if (i2 < 0) {
                yDY.AYXKKw();
            }
            C9170bQY c9170bQY = (C9170bQY) obj;
            if (c9170bQY.copydefault() != null) {
                Paymaster paymasterValueOf = c9170bQY.valueOf();
                if (paymasterValueOf != null && paymasterValueOf.isFreeGasPaymaster()) {
                    if (OLrzqt(OLrzqt(c9170bQY, i).getSecond()) && AuCTelauCTel()) {
                        return c9170bQY;
                    }
                } else {
                    java.lang.String second = OLrzqt(c9170bQY, i).getSecond();
                    C10854bwM c10854bwMAEQbTJ = c9168bQW.AEQbTJ();
                    if (C33129mqd.copydefault(this.AYXKKw.get(java.lang.Long.valueOf(c10854bwMAEQbTJ.AhwBna())), copydefault(second, c10854bwMAEQbTJ))) {
                        return c9170bQY;
                    }
                    if (c10854bwMAEQbTJ.AuCTel()) {
                        if (numValueOf == null) {
                            numValueOf = java.lang.Integer.valueOf(i2);
                        }
                    } else if (numValueOf2 == null) {
                        numValueOf2 = java.lang.Integer.valueOf(i2);
                    }
                }
            }
            i2++;
        }
        java.util.List<C9170bQY> listOLrzqt = c9168bQW.OLrzqt();
        if (numValueOf != null) {
            iIntValue = numValueOf.intValue();
        } else if (numValueOf2 != null) {
            iIntValue = numValueOf2.intValue();
        }
        return listOLrzqt.get(iIntValue);
    }

    public final boolean OLrzqt(java.lang.String str) {
        C10854bwM c10854bwMDHguZz = this.values.dHguZz();
        WalletTickerManager.CoinPrice coinPriceCopydefault = this.values.DarRvM().copydefault(java.lang.Long.valueOf(c10854bwMDHguZz.AhwBna()));
        java.lang.String realPrice = coinPriceCopydefault != null ? coinPriceCopydefault.getRealPrice() : null;
        if (C33129mqd.AEQbTJ(realPrice, "0")) {
            return C33129mqd.valueOf(C54862xYb.OLrzqt(C54870xYj.AEQbTJ(str, c10854bwMDHguZz.valueOf()), realPrice), this.gEmmrt.fARcdN().getLimitGasValuation());
        }
        return false;
    }

    public final kotlin.Pair<java.lang.String, java.lang.String> OLrzqt(C9170bQY c9170bQY, int i) {
        java.lang.String min;
        java.lang.String strAhwBna;
        EvmSignInfoGasPrice gasPrice = this.gEmmrt.hDKMBd().getGasPrice();
        if (i == 31) {
            min = gasPrice.getMin();
        } else if (i == 33) {
            min = gasPrice.getMax();
        } else {
            min = gasPrice.getNormal();
        }
        java.lang.String strAhwBna2 = AhwBna(i);
        java.lang.String str = AxsJAY() ? strAhwBna2 : min;
        if (C33129mqd.OLrzqt((java.lang.CharSequence) c9170bQY.OLrzqt()) && C33129mqd.OLrzqt((java.lang.CharSequence) c9170bQY.KWHzl())) {
            strAhwBna = C54862xYb.convertToString$default(C54862xYb.KWHzl(c9170bQY.AhwBna(), C54862xYb.divB$default(C54862xYb.OLrzqt(c9170bQY.OLrzqt(), c9170bQY.KWHzl()), strAhwBna2, 0, null, 6, null)), false, 0, RoundingMode.UP, 1, null);
        } else {
            strAhwBna = c9170bQY.AhwBna();
        }
        BigDecimal bigDecimalKWHzl = C54862xYb.KWHzl(strAhwBna, c9170bQY.DbNXlk());
        return C56390yDp.OLrzqt(C54862xYb.convertToBigIntegerString$default(C54862xYb.OLrzqt(str, C54862xYb.KWHzl(bigDecimalKWHzl, c9170bQY.copydefault())), false, (RoundingMode) null, 3, (java.lang.Object) null), C54862xYb.convertToBigIntegerString$default(C54862xYb.OLrzqt(min, C54862xYb.KWHzl(bigDecimalKWHzl, c9170bQY.AEQbTJ())), false, (RoundingMode) null, 3, (java.lang.Object) null));
    }

    /* JADX INFO: renamed from: o.bRa$Activity */
    public final class Activity {
        public C9170bQY AhwBna;
        public transient InterfaceC9731bbC KWHzl;
        public C9170bQY djBIcL;
        public boolean fARcdN;
        public C9170bQY fetchVPNInfo;
        public java.lang.String DbNXlk = "";
        public java.lang.String AkhnZx = "";
        public java.lang.String AuCTel = "";
        public java.lang.String values = "";
        public java.lang.String AYXKKw = "";
        public java.lang.String isConnected = "";
        public java.lang.String valueOf = "";
        public java.lang.String EZpvd = "";
        public java.lang.String gEmmrt = "";
        public java.lang.String copydefault = "";
        public java.lang.String AEQbTJ = "";
        public java.lang.String OLrzqt = "";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AEQbTJ() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(@NotNull C9170bQY c9170bQY) {
            Intrinsics.checkNotNullParameter(c9170bQY, "");
            this.AhwBna = c9170bQY;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(@NotNull InterfaceC9731bbC interfaceC9731bbC) {
            Intrinsics.checkNotNullParameter(interfaceC9731bbC, "");
            this.KWHzl = interfaceC9731bbC;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AYXKKw(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.gEmmrt = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AhwBna(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.EZpvd = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AkhnZx(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.DbNXlk = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void DbNXlk(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.isConnected = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String EZpvd() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.copydefault = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(@NotNull C9170bQY c9170bQY) {
            Intrinsics.checkNotNullParameter(c9170bQY, "");
            this.fetchVPNInfo = c9170bQY;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String KWHzl() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.AEQbTJ = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(boolean z) {
            this.fARcdN = z;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(@NotNull C9170bQY c9170bQY) {
            Intrinsics.checkNotNullParameter(c9170bQY, "");
            this.djBIcL = c9170bQY;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.OLrzqt = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void djBIcL(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.values = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean fJNWhG() {
            return this.fARcdN;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void fetchVPNInfo(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.AkhnZx = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void gEmmrt(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.valueOf = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void isConnected(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.AuCTel = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void valueOf(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.AYXKKw = str;
        }

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public Activity() {
        }

        public final InterfaceC9731bbC copydefault() {
            InterfaceC9731bbC interfaceC9731bbC = this.KWHzl;
            if (interfaceC9731bbC != null) {
                return interfaceC9731bbC;
            }
            Intrinsics.gEmmrt("");
            return null;
        }

        public final boolean uzCIH() {
            return getFieldNames() || getNewProxyInstance() || hDKMBd();
        }

        public final boolean getFieldNames() {
            return fIwbmz().copydefault() != null;
        }

        public final C9170bQY fIwbmz() {
            C9170bQY c9170bQY = this.fetchVPNInfo;
            if (c9170bQY != null) {
                return c9170bQY;
            }
            Intrinsics.gEmmrt("");
            return null;
        }

        public final java.lang.String fARcdN() {
            return C9225bRa.this.copydefault(this.DbNXlk, copydefault());
        }

        public final java.lang.String fetchVPNInfo() {
            return C9225bRa.this.copydefault(this.AkhnZx, copydefault());
        }

        public final java.lang.String ejfBZ() {
            return C9225bRa.this.copydefault(this.AuCTel, copydefault());
        }

        public final boolean AuCTel() {
            Paymaster paymasterValueOf;
            return C9225bRa.this.AuCTelauCTel() && getFieldNames() && (paymasterValueOf = fIwbmz().valueOf()) != null && paymasterValueOf.isFreeGasPaymaster() && OLrzqt(ejfBZ());
        }

        public final boolean getNewProxyInstance() {
            return AkhnZx().copydefault() != null;
        }

        public final C9170bQY AkhnZx() {
            C9170bQY c9170bQY = this.djBIcL;
            if (c9170bQY != null) {
                return c9170bQY;
            }
            Intrinsics.gEmmrt("");
            return null;
        }

        public final java.lang.String DbNXlk() {
            return C9225bRa.this.copydefault(this.values, copydefault());
        }

        public final java.lang.String valueOf() {
            return C9225bRa.this.copydefault(this.AYXKKw, copydefault());
        }

        public final java.lang.String isConnected() {
            return C9225bRa.this.copydefault(this.isConnected, copydefault());
        }

        public final boolean values() {
            Paymaster paymasterValueOf;
            return C9225bRa.this.AuCTelauCTel() && getNewProxyInstance() && (paymasterValueOf = AkhnZx().valueOf()) != null && paymasterValueOf.isFreeGasPaymaster() && OLrzqt(isConnected());
        }

        public final boolean hDKMBd() {
            return AYXKKw().copydefault() != null;
        }

        public final C9170bQY AYXKKw() {
            C9170bQY c9170bQY = this.AhwBna;
            if (c9170bQY != null) {
                return c9170bQY;
            }
            Intrinsics.gEmmrt("");
            return null;
        }

        public final java.lang.String AhwBna() {
            return C9225bRa.this.copydefault(this.valueOf, copydefault());
        }

        public final java.lang.String OLrzqt() {
            return C9225bRa.this.copydefault(this.EZpvd, copydefault());
        }

        public final java.lang.String gEmmrt() {
            return C9225bRa.this.copydefault(this.gEmmrt, copydefault());
        }

        public final boolean djBIcL() {
            Paymaster paymasterValueOf;
            return C9225bRa.this.AuCTelauCTel() && hDKMBd() && (paymasterValueOf = AYXKKw().valueOf()) != null && paymasterValueOf.isFreeGasPaymaster() && OLrzqt(gEmmrt());
        }

        public final boolean OLrzqt(java.lang.String str) {
            WalletTickerManager.CoinPrice coinPriceCopydefault = C9225bRa.this.values.DarRvM().copydefault(java.lang.Long.valueOf(copydefault().AhwBna()));
            java.lang.String realPrice = coinPriceCopydefault != null ? coinPriceCopydefault.getRealPrice() : null;
            if (C33129mqd.AEQbTJ(realPrice, "0")) {
                return C33129mqd.valueOf(C54862xYb.OLrzqt(C54870xYj.AEQbTJ(str, copydefault().valueOf()), realPrice), C9225bRa.this.gEmmrt.fARcdN().getLimitGasValuation());
            }
            return false;
        }

        public final java.lang.String KWHzl(@NotNull java.lang.String str, boolean z) {
            Intrinsics.checkNotNullParameter(str, "");
            return C54870xYj.KWHzl(str, copydefault().valueOf(), copydefault().AkhnZx(), z ? copydefault().fJNWhG() : null, (CipherSuite.TLS_DH_RSA_WITH_SEED_CBC_SHA & 8) != 0 ? DisplaySign.AUTO : null, (CipherSuite.TLS_DH_RSA_WITH_SEED_CBC_SHA & 16) != 0 ? false : false, (CipherSuite.TLS_DH_RSA_WITH_SEED_CBC_SHA & 32) != 0 ? null : null, (CipherSuite.TLS_DH_RSA_WITH_SEED_CBC_SHA & 64) != 0 ? false : false, (CipherSuite.TLS_DH_RSA_WITH_SEED_CBC_SHA & 128) != 0 ? RoundingMode.DOWN : null);
        }

        public final java.lang.String OLrzqt(@NotNull java.lang.String str, boolean z) {
            Intrinsics.checkNotNullParameter(str, "");
            java.lang.String strAEQbTJ = C54870xYj.AEQbTJ(str, copydefault().valueOf());
            WalletTickerManager.CoinPrice coinPriceCopydefault = C9225bRa.this.values.DarRvM().copydefault(java.lang.Long.valueOf(copydefault().AhwBna()));
            java.lang.String valuationFromFee$default = C54880xYt.formatValuationFromFee$default(C54862xYb.convertToString$default(C54862xYb.OLrzqt(strAEQbTJ, coinPriceCopydefault != null ? coinPriceCopydefault.getRealPrice() : null), false, null, null, 7, null), C9225bRa.this.values.zuWLRA().KWHzl(), true, false, 4, null);
            if (!z || C59449zhJ.startsWith$default(valuationFromFee$default, "<", false, 2, null)) {
                return valuationFromFee$default;
            }
            return "≈ " + valuationFromFee$default;
        }

        public final java.lang.String AEQbTJ(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return C54870xYj.EZpvd(str, copydefault().valueOf(), copydefault().AkhnZx(), null, (248 & 8) != 0 ? DisplaySign.AUTO : null, (248 & 16) != 0 ? false : false, (248 & 32) != 0 ? null : null, (248 & 64) != 0 ? false : false, (248 & 128) != 0 ? RoundingMode.DOWN : RoundingMode.DOWN);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x015f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Activity fJNWhG() {
        if (this.djBIcL != null) {
            for (Activity activity : this.isConnected) {
                if (activity.copydefault().AhwBna() == djBIcL()) {
                    return activity;
                }
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        }
        java.lang.Integer numValueOf = null;
        int iIntValue = 0;
        java.lang.Integer numValueOf2 = null;
        int i = 0;
        for (java.lang.Object obj : this.isConnected) {
            if (i < 0) {
                yDY.AYXKKw();
            }
            Activity activity2 = (Activity) obj;
            if (activity2.uzCIH()) {
                java.lang.Object objEjfBZ = "0";
                switch (DbNXlk()) {
                    case 31:
                        if (activity2.AuCTel()) {
                            return activity2;
                        }
                        Paymaster paymasterValueOf = activity2.fIwbmz().valueOf();
                        if (paymasterValueOf == null || !paymasterValueOf.isFreeGasPaymaster()) {
                            if (activity2.fJNWhG()) {
                                BigDecimal bigDecimalAEQbTJ = C54862xYb.AEQbTJ(activity2.ejfBZ(), activity2.KWHzl());
                                if (!C33129mqd.gEmmrt(bigDecimalAEQbTJ, "0")) {
                                    objEjfBZ = bigDecimalAEQbTJ;
                                }
                            } else {
                                objEjfBZ = activity2.ejfBZ();
                            }
                            if (C33129mqd.copydefault(this.AYXKKw.get(java.lang.Long.valueOf(activity2.copydefault().AhwBna())), objEjfBZ)) {
                                return activity2;
                            }
                            if (activity2.copydefault().AuCTel()) {
                                if (numValueOf2 == null) {
                                    numValueOf2 = java.lang.Integer.valueOf(i);
                                }
                            } else if (numValueOf == null) {
                                numValueOf = java.lang.Integer.valueOf(i);
                            }
                        }
                        break;
                        break;
                    case 32:
                        if (activity2.values()) {
                            return activity2;
                        }
                        Paymaster paymasterValueOf2 = activity2.AkhnZx().valueOf();
                        if (paymasterValueOf2 != null && paymasterValueOf2.isFreeGasPaymaster()) {
                            break;
                        } else {
                            if (activity2.fJNWhG()) {
                                BigDecimal bigDecimalAEQbTJ2 = C54862xYb.AEQbTJ(activity2.isConnected(), activity2.KWHzl());
                                if (!C33129mqd.gEmmrt(bigDecimalAEQbTJ2, "0")) {
                                    objEjfBZ = bigDecimalAEQbTJ2;
                                }
                            } else {
                                objEjfBZ = activity2.isConnected();
                            }
                            if (C33129mqd.copydefault(this.AYXKKw.get(java.lang.Long.valueOf(activity2.copydefault().AhwBna())), objEjfBZ)) {
                                return activity2;
                            }
                            if (activity2.copydefault().AuCTel()) {
                            }
                        }
                        break;
                    case 33:
                        if (activity2.djBIcL()) {
                            return activity2;
                        }
                        Paymaster paymasterValueOf3 = activity2.AYXKKw().valueOf();
                        if (paymasterValueOf3 != null && paymasterValueOf3.isFreeGasPaymaster()) {
                            break;
                        } else {
                            if (activity2.fJNWhG()) {
                                BigDecimal bigDecimalAEQbTJ3 = C54862xYb.AEQbTJ(activity2.gEmmrt(), activity2.KWHzl());
                                if (!C33129mqd.gEmmrt(bigDecimalAEQbTJ3, "0")) {
                                    objEjfBZ = bigDecimalAEQbTJ3;
                                }
                            } else {
                                objEjfBZ = activity2.gEmmrt();
                            }
                            if (C33129mqd.copydefault(this.AYXKKw.get(java.lang.Long.valueOf(activity2.copydefault().AhwBna())), objEjfBZ)) {
                                return activity2;
                            }
                            if (activity2.copydefault().AuCTel()) {
                            }
                        }
                        break;
                    default:
                        if (activity2.copydefault().AuCTel()) {
                        }
                        break;
                }
            }
            i++;
        }
        java.util.List<Activity> list = this.isConnected;
        if (numValueOf != null) {
            iIntValue = numValueOf.intValue();
        } else if (numValueOf2 != null) {
            iIntValue = numValueOf2.intValue();
        }
        return list.get(iIntValue);
    }
}
