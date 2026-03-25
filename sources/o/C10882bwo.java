package o;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.okinc.business.defi.biz.constant.EOSOpenType;
import com.okinc.business.defi.biz.core.tx.transaction.impl.OkUTXOTransaction;
import com.okinc.business.defi.biz.model.ChainAddress;
import com.okinc.business.defi.biz.net.bean.EosMarketBean;
import com.okinc.business.defi.biz.net.bean.EosOpenAccountReq;
import com.okinc.business.defi.biz.net.bean.EosPayInfo;
import com.okinc.business.defi.biz.net.bean.EosRes;
import com.okinc.business.defi.biz.net.bean.SignInfo;
import com.okinc.business.defi.biz.net.bean.SignInfoReq;
import com.okinc.business.defi.biz.net.bean.UTXOAddressInfoReq;
import com.okinc.business.defi.biz.net.bean.UTXOInfoReq;
import com.okinc.business.defi.biz.net.bean.UTXOInfoResp;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.wallet.core.sign.SignParams;
import com.okinc.wallet.core.sign.eos.EosNewAccountTransaction;
import com.okinc.wallet.core.sign.evm.AccountTransaction;
import com.okinc.wallet.core.sign.utxo.DummyInfo;
import com.okinc.wallet.core.sign.utxo.UTXOTransaction;
import java.math.RoundingMode;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonObject;
import o.C12797ctk;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.bwo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C10882bwo {
    public C10849bwH AYXKKw;
    public EOSOpenType EZpvd;
    public final java.util.ArrayList<C10849bwH> KWHzl;
    public C10883bwp OLrzqt;
    public AbstractC12782ctV copydefault;
    public final C13934dbu djBIcL;
    public final C12797ctk valueOf;
    public static final Application Companion = new Application(null);
    public static final int AEQbTJ = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C10882bwo() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C10883bwp AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.ArrayList<C10849bwH> EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(C10849bwH c10849bwH) {
        this.AYXKKw = c10849bwH;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(@NotNull AbstractC12782ctV abstractC12782ctV) {
        Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
        this.copydefault = abstractC12782ctV;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(@NotNull EOSOpenType eOSOpenType) {
        Intrinsics.checkNotNullParameter(eOSOpenType, "");
        this.EZpvd = eOSOpenType;
    }

    public C10882bwo(@NotNull C13934dbu c13934dbu, @NotNull C12797ctk c12797ctk) {
        Intrinsics.checkNotNullParameter(c13934dbu, "");
        Intrinsics.checkNotNullParameter(c12797ctk, "");
        this.djBIcL = c13934dbu;
        this.valueOf = c12797ctk;
        this.KWHzl = new java.util.ArrayList<>();
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0012: CONSTRUCTOR 
  (wrap:o.dbu:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:o.dbu:0x0006: CONSTRUCTOR  A[MD:():void (m), WRAPPED] (LINE:40) call: o.dbu.<init>():void type: CONSTRUCTOR) : (r1v0 o.dbu))
  (wrap:o.ctk:?: TERNARY null = ((wrap:int:0x0009: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:o.ctk:0x000f: CONSTRUCTOR  A[MD:():void (m), WRAPPED] (LINE:41) call: o.ctk.<init>():void type: CONSTRUCTOR) : (r2v0 o.ctk))
 A[MD:(o.dbu, o.ctk):void (m)] (LINE:39) call: o.bwo.<init>(o.dbu, o.ctk):void type: THIS */
    public /* synthetic */ C10882bwo(C13934dbu c13934dbu, C12797ctk c12797ctk, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new C13934dbu() : c13934dbu, (i & 2) != 0 ? new C12797ctk() : c12797ctk);
    }

    /* JADX INFO: renamed from: o.bwo$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.bwo.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    public final long OLrzqt() {
        C10854bwM c10854bwMAEQbTJ;
        C10849bwH c10849bwH = this.AYXKKw;
        if (c10849bwH == null || (c10854bwMAEQbTJ = c10849bwH.AEQbTJ()) == null) {
            return 0L;
        }
        return c10854bwMAEQbTJ.AhwBna();
    }

    public static final Unit fJNWhG(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (Unit) function1.invoke(obj);
    }

    public final AbstractC58185ywX<Unit> AhwBna() {
        AbstractC58185ywX abstractC58185ywXUnwrapResponseData$default = C43423rox.unwrapResponseData$default(this.djBIcL.gEmmrt(), (Function1) null, 1, (java.lang.Object) null);
        final Function1 function1 = new Function1() { // from class: o.bwE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C10882bwo.copydefault(this.copydefault, (EosRes) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXAEQbTJ = abstractC58185ywXUnwrapResponseData$default.AEQbTJ(new InterfaceC58229yxO() { // from class: o.bwF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C10882bwo.fJNWhG(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        return C33527myD.KWHzl(abstractC58185ywXAEQbTJ);
    }

    public static final Unit copydefault(C10882bwo c10882bwo, EosRes eosRes) {
        C10854bwM c10854bwMAEQbTJ;
        Intrinsics.checkNotNullParameter(eosRes, "");
        EosMarketBean eosMarket = eosRes.getEosMarket();
        if (eosMarket != null) {
            c10882bwo.OLrzqt = new C10883bwp(eosMarket);
        }
        java.util.List<EosPayInfo> coins = eosRes.getCoins();
        if (c10882bwo.EZpvd == EOSOpenType.SelfOpen) {
            c10882bwo.KWHzl.clear();
            for (EosPayInfo eosPayInfo : coins) {
                C10854bwM c10854bwMKWHzl = C10954byG.EZpvd.valueOf().KWHzl(java.lang.Long.valueOf(eosPayInfo.getCoinId()));
                if (c10854bwMKWHzl != null) {
                    c10882bwo.KWHzl.add(new C10849bwH(c10854bwMKWHzl, eosPayInfo));
                }
            }
            if (c10882bwo.AYXKKw != null) {
                java.util.Iterator<T> it = c10882bwo.KWHzl.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    java.lang.Object next = it.next();
                    C10849bwH c10849bwH = (C10849bwH) next;
                    C10849bwH c10849bwH2 = c10882bwo.AYXKKw;
                    if (c10849bwH2 != null && (c10854bwMAEQbTJ = c10849bwH2.AEQbTJ()) != null && c10849bwH.AEQbTJ().AhwBna() == c10854bwMAEQbTJ.AhwBna()) {
                        obj = next;
                        break;
                    }
                }
                c10882bwo.AYXKKw = (C10849bwH) obj;
            } else {
                java.util.Iterator<T> it2 = c10882bwo.KWHzl.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    java.lang.Object next2 = it2.next();
                    if (((C10849bwH) next2).AYXKKw()) {
                        obj = next2;
                        break;
                    }
                }
                C10849bwH c10849bwH3 = (C10849bwH) obj;
                if (c10849bwH3 == null) {
                    c10849bwH3 = (C10849bwH) CollectionsKt___CollectionsKt.firstOrNull(c10882bwo.KWHzl);
                }
                c10882bwo.AYXKKw = c10849bwH3;
            }
        } else {
            C10854bwM c10854bwMAhwBna = C10954byG.EZpvd.valueOf().AhwBna();
            if (c10854bwMAhwBna != null) {
                long jAhwBna = c10854bwMAhwBna.AhwBna();
                C10883bwp c10883bwp = c10882bwo.OLrzqt;
                java.lang.String strGEmmrt = C33129mqd.gEmmrt(c10883bwp != null ? c10883bwp.AhwBna() : null);
                C10883bwp c10883bwp2 = c10882bwo.OLrzqt;
                java.lang.String strGEmmrt2 = C33129mqd.gEmmrt(c10883bwp2 != null ? c10883bwp2.AhwBna() : null);
                C10883bwp c10883bwp3 = c10882bwo.OLrzqt;
                C10849bwH c10849bwH4 = new C10849bwH(c10854bwMAhwBna, new EosPayInfo(jAhwBna, strGEmmrt, strGEmmrt2, C33129mqd.gEmmrt(c10883bwp3 != null ? c10883bwp3.gEmmrt() : null), "0", "", true));
                c10882bwo.AYXKKw = c10849bwH4;
                c10882bwo.KWHzl.clear();
                c10882bwo.KWHzl.add(c10849bwH4);
            }
        }
        return Unit.INSTANCE;
    }

    public final java.lang.String copydefault() {
        ChainAddress chainAddressAddressFromChainId$default;
        java.lang.String address;
        C10854bwM c10854bwMKWHzl = C10954byG.EZpvd.valueOf().KWHzl(java.lang.Long.valueOf(OLrzqt()));
        if (c10854bwMKWHzl == null) {
            return null;
        }
        AbstractC12782ctV abstractC12782ctV = this.copydefault;
        return (abstractC12782ctV == null || (chainAddressAddressFromChainId$default = AbstractC12782ctV.addressFromChainId$default(abstractC12782ctV, c10854bwMKWHzl.AEQbTJ(), null, 2, null)) == null || (address = chainAddressAddressFromChainId$default.getAddress()) == null) ? "" : address;
    }

    public final java.lang.String KWHzl() {
        C10849bwH c10849bwH = this.AYXKKw;
        double dAEQbTJ = C33129mqd.AEQbTJ(c10849bwH != null ? java.lang.Double.valueOf(c10849bwH.OLrzqt()) : null);
        C10849bwH c10849bwH2 = this.AYXKKw;
        return C33129mqd.AYXKKw(java.lang.Double.valueOf(java.lang.Math.floor(dAEQbTJ - C33129mqd.AEQbTJ(c10849bwH2 != null ? java.lang.Double.valueOf(c10849bwH2.gEmmrt()) : null))));
    }

    public final java.lang.String djBIcL() {
        C10849bwH c10849bwH = this.AYXKKw;
        return C33129mqd.AYXKKw(java.lang.Double.valueOf(java.lang.Math.floor(C33129mqd.AEQbTJ(c10849bwH != null ? java.lang.Double.valueOf(c10849bwH.gEmmrt()) : null))));
    }

    public final AbstractC58185ywX<ResponseData<java.lang.String>> OLrzqt(@NotNull final java.lang.String str, @NotNull final java.lang.String str2, @NotNull final java.lang.String str3, @NotNull final java.lang.String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        C10849bwH c10849bwH = this.AYXKKw;
        final java.lang.Double dValueOf = c10849bwH != null ? java.lang.Double.valueOf(c10849bwH.OLrzqt()) : null;
        AbstractC58185ywX<Unit> abstractC58185ywXAhwBna = AhwBna();
        final Function1 function1 = new Function1() { // from class: o.bwn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C10882bwo.KWHzl(this.OLrzqt, dValueOf, str, str2, str3, str4, (Unit) obj);
            }
        };
        AbstractC58185ywX<R> abstractC58185ywXKWHzl = abstractC58185ywXAhwBna.KWHzl(new InterfaceC58229yxO() { // from class: o.bwv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C10882bwo.fARcdN(function1, obj);
            }
        });
        final Function1 function12 = new Function1() { // from class: o.bwD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C10882bwo.copydefault(this.AEQbTJ, str2, str3, str4, (EosOpenAccountReq.EosOpenTransaction) obj);
            }
        };
        AbstractC58185ywX<ResponseData<java.lang.String>> abstractC58185ywXKWHzl2 = abstractC58185ywXKWHzl.KWHzl((InterfaceC58229yxO<? super R, ? extends InterfaceC60096zvd<? extends R>>) new InterfaceC58229yxO() { // from class: o.bwG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C10882bwo.ejfBZ(function12, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl2, "");
        return abstractC58185ywXKWHzl2;
    }

    public static final InterfaceC60096zvd fARcdN(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    public static final InterfaceC60096zvd KWHzl(C10882bwo c10882bwo, java.lang.Double d, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, Unit unit) throws java.lang.Throwable {
        C10849bwH c10849bwH;
        Intrinsics.checkNotNullParameter(unit, "");
        C10849bwH c10849bwH2 = c10882bwo.AYXKKw;
        if (C33129mqd.AEQbTJ(d) < C33129mqd.AEQbTJ(c10849bwH2 != null ? java.lang.Double.valueOf(c10849bwH2.copydefault()) : null)) {
            throw new java.lang.Throwable("Resource price and rate has changed, please pay again.");
        }
        if (c10882bwo.OLrzqt == null || (c10849bwH = c10882bwo.AYXKKw) == null) {
            throw new java.lang.Throwable("market or selectMethod is null.");
        }
        if (c10882bwo.EZpvd == EOSOpenType.SelfOpen) {
            Intrinsics.copydefault(c10849bwH);
            if (c10849bwH.AEQbTJ().AxsJAYaxsJAY()) {
                return c10882bwo.AEQbTJ(str);
            }
            return c10882bwo.EZpvd(str);
        }
        return c10882bwo.EZpvd(str, str2, str3, str4);
    }

    public static final InterfaceC60096zvd ejfBZ(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    public static final InterfaceC60096zvd copydefault(C10882bwo c10882bwo, java.lang.String str, java.lang.String str2, java.lang.String str3, EosOpenAccountReq.EosOpenTransaction eosOpenTransaction) {
        java.lang.String strUSBtdM;
        java.lang.String strDbNXlk;
        java.lang.String strUSBtdM2;
        java.lang.String strDbNXlk2;
        java.lang.String str4 = "";
        Intrinsics.checkNotNullParameter(eosOpenTransaction, "");
        if (c10882bwo.EZpvd == EOSOpenType.SelfOpen) {
            C10883bwp c10883bwp = c10882bwo.OLrzqt;
            Intrinsics.copydefault(c10883bwp);
            java.math.BigInteger bigInteger = new java.math.BigInteger(c10883bwp.AEQbTJ());
            C10883bwp c10883bwp2 = c10882bwo.OLrzqt;
            Intrinsics.copydefault(c10883bwp2);
            java.math.BigInteger bigInteger2 = new java.math.BigInteger(c10883bwp2.copydefault());
            C10883bwp c10883bwp3 = c10882bwo.OLrzqt;
            Intrinsics.copydefault(c10883bwp3);
            java.math.BigInteger bigInteger3 = new java.math.BigInteger(c10883bwp3.EZpvd());
            C10883bwp c10883bwp4 = c10882bwo.OLrzqt;
            Intrinsics.copydefault(c10883bwp4);
            java.math.BigInteger bigInteger4 = new java.math.BigInteger(c10883bwp4.AYXKKw());
            C10883bwp c10883bwp5 = c10882bwo.OLrzqt;
            Intrinsics.copydefault(c10883bwp5);
            java.math.BigInteger bigInteger5 = new java.math.BigInteger(c10883bwp5.fetchVPNInfo());
            C10849bwH c10849bwH = c10882bwo.AYXKKw;
            Intrinsics.copydefault(c10849bwH);
            EosOpenAccountReq eosOpenAccountReq = new EosOpenAccountReq(new EosOpenAccountReq.EosOpenOrder(str, str2, str3, bigInteger, bigInteger2, bigInteger3, bigInteger4, bigInteger5, c10849bwH.AEQbTJ().fJNWhG(), new java.math.BigInteger(c10882bwo.KWHzl()), c10882bwo.copydefault(), null), eosOpenTransaction);
            C13934dbu c13934dbu = c10882bwo.djBIcL;
            AbstractC12782ctV abstractC12782ctV = c10882bwo.copydefault;
            if (abstractC12782ctV == null || (strUSBtdM2 = abstractC12782ctV.USBtdM()) == null) {
                strUSBtdM2 = "";
            }
            AbstractC12782ctV abstractC12782ctV2 = c10882bwo.copydefault;
            if (abstractC12782ctV2 != null && (strDbNXlk2 = abstractC12782ctV2.DbNXlk()) != null) {
                str4 = strDbNXlk2;
            }
            return c13934dbu.copydefault(strUSBtdM2, str4, eosOpenAccountReq);
        }
        C10883bwp c10883bwp6 = c10882bwo.OLrzqt;
        Intrinsics.copydefault(c10883bwp6);
        java.math.BigInteger bigInteger6 = new java.math.BigInteger(c10883bwp6.AEQbTJ());
        C10883bwp c10883bwp7 = c10882bwo.OLrzqt;
        Intrinsics.copydefault(c10883bwp7);
        java.math.BigInteger bigInteger7 = new java.math.BigInteger(c10883bwp7.copydefault());
        C10883bwp c10883bwp8 = c10882bwo.OLrzqt;
        Intrinsics.copydefault(c10883bwp8);
        java.math.BigInteger bigInteger8 = new java.math.BigInteger(c10883bwp8.EZpvd());
        C10883bwp c10883bwp9 = c10882bwo.OLrzqt;
        Intrinsics.copydefault(c10883bwp9);
        java.math.BigInteger bigInteger9 = new java.math.BigInteger(c10883bwp9.AYXKKw());
        C10883bwp c10883bwp10 = c10882bwo.OLrzqt;
        Intrinsics.copydefault(c10883bwp10);
        java.math.BigInteger bigInteger10 = new java.math.BigInteger(c10883bwp10.AhwBna());
        C10849bwH c10849bwH2 = c10882bwo.AYXKKw;
        Intrinsics.copydefault(c10849bwH2);
        EosOpenAccountReq eosOpenAccountReq2 = new EosOpenAccountReq(new EosOpenAccountReq.EosOpenOrder(str, str2, str3, bigInteger6, bigInteger7, bigInteger8, bigInteger9, bigInteger10, c10849bwH2.AEQbTJ().fJNWhG(), new java.math.BigInteger(c10882bwo.KWHzl()), null, c10882bwo.copydefault()), eosOpenTransaction);
        C13934dbu c13934dbu2 = c10882bwo.djBIcL;
        AbstractC12782ctV abstractC12782ctV3 = c10882bwo.copydefault;
        if (abstractC12782ctV3 == null || (strUSBtdM = abstractC12782ctV3.USBtdM()) == null) {
            strUSBtdM = "";
        }
        AbstractC12782ctV abstractC12782ctV4 = c10882bwo.copydefault;
        if (abstractC12782ctV4 != null && (strDbNXlk = abstractC12782ctV4.DbNXlk()) != null) {
            str4 = strDbNXlk;
        }
        return c13934dbu2.OLrzqt(strUSBtdM, str4, eosOpenAccountReq2);
    }

    public final AbstractC58185ywX<EosOpenAccountReq.EosOpenTransaction> EZpvd(final java.lang.String str) {
        java.lang.String strUSBtdM;
        java.lang.String strDbNXlk;
        C13934dbu c13934dbu = this.djBIcL;
        AbstractC12782ctV abstractC12782ctV = this.copydefault;
        if (abstractC12782ctV == null || (strUSBtdM = abstractC12782ctV.USBtdM()) == null) {
            strUSBtdM = "";
        }
        AbstractC12782ctV abstractC12782ctV2 = this.copydefault;
        if (abstractC12782ctV2 == null || (strDbNXlk = abstractC12782ctV2.DbNXlk()) == null) {
            strDbNXlk = "";
        }
        java.lang.String strGEmmrt = C33129mqd.gEmmrt(java.lang.Long.valueOf(OLrzqt()));
        java.lang.String strCopydefault = copydefault();
        AbstractC58185ywX<ResponseData<SignInfo>> abstractC58185ywXCopydefault = c13934dbu.copydefault(strUSBtdM, strDbNXlk, new SignInfoReq(strGEmmrt, strCopydefault == null ? "" : strCopydefault, (java.lang.String) null, 0, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.Integer) null, (java.lang.Long) null, (java.lang.Long) null, (java.lang.String) null, (java.lang.Integer) null, (java.lang.Boolean) null, 8188, (DefaultConstructorMarker) null));
        final Function1 function1 = new Function1() { // from class: o.bws
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C10882bwo.KWHzl(this.AEQbTJ, str, (ResponseData) obj);
            }
        };
        AbstractC58185ywX<R> abstractC58185ywXCopydefault2 = abstractC58185ywXCopydefault.copydefault(new InterfaceC58229yxO() { // from class: o.bwu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C10882bwo.DbNXlk(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXCopydefault2, "");
        return C33527myD.KWHzl(abstractC58185ywXCopydefault2);
    }

    public static final InterfaceC58261yxu DbNXlk(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC58261yxu) function1.invoke(obj);
    }

    public static final InterfaceC58261yxu KWHzl(final C10882bwo c10882bwo, java.lang.String str, ResponseData responseData) throws java.lang.Exception {
        JsonElement jsonElement;
        JsonElement jsonElement2;
        JsonObject info;
        java.lang.String string;
        java.lang.String str2 = "";
        Intrinsics.checkNotNullParameter(responseData, "");
        SignInfo signInfo = (SignInfo) responseData.getData();
        if (signInfo != null && (info = signInfo.getInfo()) != null && (string = info.toString()) != null) {
            str2 = string;
        }
        com.google.gson.JsonObject jsonObjectOLrzqt = C33490mxT.OLrzqt(str2);
        java.lang.Integer numValueOf = (jsonObjectOLrzqt == null || (jsonElement2 = jsonObjectOLrzqt.get("nonce")) == null) ? null : java.lang.Integer.valueOf(jsonElement2.getAsInt());
        final int asInt = (jsonObjectOLrzqt == null || (jsonElement = jsonObjectOLrzqt.get("gasLimit")) == null) ? 0 : jsonElement.getAsInt();
        final double dFloor = java.lang.Math.floor(C33129mqd.AEQbTJ(c10882bwo.KWHzl()));
        final double dAEQbTJ = C33129mqd.AEQbTJ(java.lang.Double.valueOf(java.lang.Math.floor(C33129mqd.AEQbTJ(C54862xYb.divB$default(java.lang.Double.valueOf(C33129mqd.AEQbTJ(c10882bwo.KWHzl())), java.lang.Integer.valueOf(asInt), 0, null, 6, null)))));
        final java.util.Map mapGEmmrt = C56424yEw.gEmmrt(C56390yDp.OLrzqt("nonce", C33129mqd.AYXKKw(numValueOf)), C56390yDp.OLrzqt("gasPrice", C33129mqd.AYXKKw(java.lang.Double.valueOf(dAEQbTJ))), C56390yDp.OLrzqt("gas", C33129mqd.AYXKKw(java.lang.Integer.valueOf(asInt))), C56390yDp.OLrzqt("decimal", 18));
        final C10854bwM c10854bwMKWHzl = C10954byG.EZpvd.valueOf().KWHzl(c10882bwo.OLrzqt());
        AbstractC12782ctV abstractC12782ctV = c10882bwo.copydefault;
        Intrinsics.copydefault(abstractC12782ctV);
        long jCopydefault = C11600cUg.copydefault(c10854bwMKWHzl != null ? java.lang.Long.valueOf(c10854bwMKWHzl.AEQbTJ()) : null);
        AbstractC12782ctV abstractC12782ctV2 = c10882bwo.copydefault;
        Intrinsics.copydefault(abstractC12782ctV2);
        ChainAddress chainAddressAddressFromChainId$default = AbstractC12782ctV.addressFromChainId$default(abstractC12782ctV2, c10854bwMKWHzl != null ? c10854bwMKWHzl.AEQbTJ() : 0L, null, 2, null);
        if (chainAddressAddressFromChainId$default != null) {
            AbstractC58260yxt<java.lang.String> abstractC58260yxtOLrzqt = abstractC12782ctV.OLrzqt(str, jCopydefault, chainAddressAddressFromChainId$default.getAddressType());
            final java.lang.Integer num = numValueOf;
            final Function1 function1 = new Function1() { // from class: o.bwB
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C10882bwo.EZpvd(c10854bwMKWHzl, num, dFloor, dAEQbTJ, asInt, c10882bwo, mapGEmmrt, (java.lang.String) obj);
                }
            };
            return abstractC58260yxtOLrzqt.copydefault(new InterfaceC58229yxO() { // from class: o.bwx
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58229yxO
                public final java.lang.Object apply(java.lang.Object obj) {
                    return C10882bwo.fetchVPNInfo(function1, obj);
                }
            });
        }
        throw new java.lang.Exception("no address");
    }

    public static final EosOpenAccountReq.EosOpenTransaction fetchVPNInfo(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (EosOpenAccountReq.EosOpenTransaction) function1.invoke(obj);
    }

    public static final EosOpenAccountReq.EosOpenTransaction EZpvd(C10854bwM c10854bwM, java.lang.Integer num, double d, double d2, int i, C10882bwo c10882bwo, java.util.Map map, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        java.lang.String strOLrzqt = xYZ.KWHzl.OLrzqt(new SignParams(c10854bwM != null ? c10854bwM.QKVWgx() : -1L, c10854bwM != null ? c10854bwM.fetchVPNInfo() : -1L, null, str, null, null, 0, null, false, false, null, 2036, null), new AccountTransaction("0x2564f2c85143fcd8b97f013fd00c69cab100c4cb", C33129mqd.AYXKKw(num), C33129mqd.AYXKKw(java.lang.Double.valueOf(d2)), C33129mqd.AYXKKw(java.lang.Integer.valueOf(i)), C33129mqd.AYXKKw(java.lang.Double.valueOf(d)), (java.lang.String) null, 0, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 1024, (DefaultConstructorMarker) null));
        long jOLrzqt = c10882bwo.OLrzqt();
        java.math.BigInteger bigIntegerKWHzl = C33129mqd.KWHzl(java.lang.Double.valueOf(d));
        java.lang.String strCopydefault = c10882bwo.copydefault();
        return new EosOpenAccountReq.EosOpenTransaction(strOLrzqt, jOLrzqt, bigIntegerKWHzl, strCopydefault != null ? strCopydefault : "", "0x2564f2c85143fcd8b97f013fd00c69cab100c4cb", C33129mqd.KWHzl(c10882bwo.djBIcL()), new Gson().toJson(map), null);
    }

    public final AbstractC58185ywX<EosOpenAccountReq.EosOpenTransaction> AEQbTJ(final java.lang.String str) throws java.lang.Exception {
        java.lang.String strUSBtdM;
        java.lang.String strDbNXlk;
        java.lang.String strUSBtdM2;
        java.lang.String strDbNXlk2;
        final java.lang.String strKWHzl = KWHzl();
        final java.lang.String strDjBIcL = djBIcL();
        final C10854bwM c10854bwMKWHzl = C10954byG.EZpvd.valueOf().KWHzl(OLrzqt());
        if (c10854bwMKWHzl == null) {
            throw new java.lang.Exception("no chain meta");
        }
        C13934dbu c13934dbu = this.djBIcL;
        AbstractC12782ctV abstractC12782ctV = this.copydefault;
        if (abstractC12782ctV == null || (strUSBtdM = abstractC12782ctV.USBtdM()) == null) {
            strUSBtdM = "";
        }
        AbstractC12782ctV abstractC12782ctV2 = this.copydefault;
        if (abstractC12782ctV2 == null || (strDbNXlk = abstractC12782ctV2.DbNXlk()) == null) {
            strDbNXlk = "";
        }
        java.lang.String strGEmmrt = C33129mqd.gEmmrt(java.lang.Long.valueOf(OLrzqt()));
        java.lang.String strCopydefault = copydefault();
        AbstractC58185ywX<ResponseData<SignInfo>> abstractC58185ywXCopydefault = c13934dbu.copydefault(strUSBtdM, strDbNXlk, new SignInfoReq(strGEmmrt, strCopydefault == null ? "" : strCopydefault, (java.lang.String) null, 0, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.Integer) null, (java.lang.Long) null, (java.lang.Long) null, (java.lang.String) null, (java.lang.Integer) null, (java.lang.Boolean) null, 8188, (DefaultConstructorMarker) null));
        C13934dbu c13934dbu2 = this.djBIcL;
        AbstractC12782ctV abstractC12782ctV3 = this.copydefault;
        if (abstractC12782ctV3 == null || (strUSBtdM2 = abstractC12782ctV3.USBtdM()) == null) {
            strUSBtdM2 = "";
        }
        AbstractC12782ctV abstractC12782ctV4 = this.copydefault;
        if (abstractC12782ctV4 == null || (strDbNXlk2 = abstractC12782ctV4.DbNXlk()) == null) {
            strDbNXlk2 = "";
        }
        long jOLrzqt = OLrzqt();
        java.lang.String strCopydefault2 = copydefault();
        AbstractC58185ywX<ResponseData<java.util.List<UTXOInfoResp>>> abstractC58185ywXKWHzl = c13934dbu2.KWHzl(strUSBtdM2, strDbNXlk2, new UTXOInfoReq(java.lang.Long.valueOf(jOLrzqt), C56402yEa.EZpvd(new UTXOAddressInfoReq(strCopydefault2 == null ? "" : strCopydefault2, C54862xYb.convertToBigIntegerString$default(strKWHzl, true, (RoundingMode) null, 2, (java.lang.Object) null), C54862xYb.convertToBigIntegerString$default(strDjBIcL, true, (RoundingMode) null, 2, (java.lang.Object) null), (java.lang.Integer) 1, "", (java.lang.Integer) null, (java.lang.Integer) null, (java.lang.String) null, (java.lang.String) null, (java.util.List) null, (java.lang.Integer) null, (java.lang.Integer) null, (java.lang.Integer) null, (java.lang.String) null, (java.lang.Integer) null, (java.util.List) null, 65504, (DefaultConstructorMarker) null)), 0, 4, null));
        final Function2 function2 = new Function2() { // from class: o.bwA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C10882bwo.KWHzl(this.OLrzqt, c10854bwMKWHzl, strKWHzl, strDjBIcL, (ResponseData) obj, (ResponseData) obj2);
            }
        };
        AbstractC58185ywX abstractC58185ywXEZpvd = AbstractC58185ywX.EZpvd(abstractC58185ywXCopydefault, abstractC58185ywXKWHzl, new InterfaceC58223yxI() { // from class: o.bwz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58223yxI
            public final java.lang.Object apply(java.lang.Object obj, java.lang.Object obj2) {
                return C10882bwo.KWHzl(function2, obj, obj2);
            }
        });
        final Function1 function1 = new Function1() { // from class: o.bwy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C10882bwo.OLrzqt(this.KWHzl, str, c10854bwMKWHzl, strKWHzl, (kotlin.Pair) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXCopydefault2 = abstractC58185ywXEZpvd.copydefault(new InterfaceC58229yxO() { // from class: o.bwC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C10882bwo.values(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXCopydefault2, "");
        return C33527myD.KWHzl(abstractC58185ywXCopydefault2);
    }

    public static final kotlin.Pair KWHzl(Function2 function2, java.lang.Object obj, java.lang.Object obj2) {
        Intrinsics.checkNotNullParameter(obj, "");
        Intrinsics.checkNotNullParameter(obj2, "");
        return (kotlin.Pair) function2.invoke(obj, obj2);
    }

    public static final InterfaceC58261yxu OLrzqt(final C10882bwo c10882bwo, java.lang.String str, final C10854bwM c10854bwM, final java.lang.String str2, kotlin.Pair pair) throws java.lang.Exception {
        Intrinsics.checkNotNullParameter(pair, "");
        final java.lang.String str3 = (java.lang.String) pair.component1();
        final C12797ctk.StateListAnimator stateListAnimator = (C12797ctk.StateListAnimator) pair.component2();
        AbstractC12782ctV abstractC12782ctV = c10882bwo.copydefault;
        Intrinsics.copydefault(abstractC12782ctV);
        long jAEQbTJ = c10854bwM.AEQbTJ();
        AbstractC12782ctV abstractC12782ctV2 = c10882bwo.copydefault;
        Intrinsics.copydefault(abstractC12782ctV2);
        ChainAddress chainAddressAddressFromChainId$default = AbstractC12782ctV.addressFromChainId$default(abstractC12782ctV2, c10854bwM.AEQbTJ(), null, 2, null);
        if (chainAddressAddressFromChainId$default != null) {
            AbstractC58260yxt<java.lang.String> abstractC58260yxtOLrzqt = abstractC12782ctV.OLrzqt(str, jAEQbTJ, chainAddressAddressFromChainId$default.getAddressType());
            final Function1 function1 = new Function1() { // from class: o.bwt
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C10882bwo.copydefault(c10854bwM, c10882bwo, stateListAnimator, str3, str2, (java.lang.String) obj);
                }
            };
            return abstractC58260yxtOLrzqt.copydefault(new InterfaceC58229yxO() { // from class: o.bww
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58229yxO
                public final java.lang.Object apply(java.lang.Object obj) {
                    return C10882bwo.gEmmrt(function1, obj);
                }
            });
        }
        throw new java.lang.Exception("no address");
    }

    public static final InterfaceC58261yxu values(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC58261yxu) function1.invoke(obj);
    }

    public static final EosOpenAccountReq.EosOpenTransaction gEmmrt(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (EosOpenAccountReq.EosOpenTransaction) function1.invoke(obj);
    }

    public static final EosOpenAccountReq.EosOpenTransaction copydefault(C10854bwM c10854bwM, C10882bwo c10882bwo, C12797ctk.StateListAnimator stateListAnimator, java.lang.String str, java.lang.String str2, java.lang.String str3) throws java.lang.Exception {
        java.lang.String str4;
        java.lang.String str5;
        Intrinsics.checkNotNullParameter(str3, "");
        long jQKVWgx = c10854bwM.QKVWgx();
        long jFetchVPNInfo = c10854bwM.fetchVPNInfo();
        AbstractC12782ctV abstractC12782ctV = c10882bwo.copydefault;
        Intrinsics.copydefault(abstractC12782ctV);
        ChainAddress chainAddressAddressFromChainId$default = AbstractC12782ctV.addressFromChainId$default(abstractC12782ctV, c10854bwM.AEQbTJ(), null, 2, null);
        if (chainAddressAddressFromChainId$default != null) {
            SignParams signParams = new SignParams(jQKVWgx, jFetchVPNInfo, null, str3, null, null, chainAddressAddressFromChainId$default.getAddressType(), null, false, false, null, 1972, null);
            java.lang.String strConvertToBigIntegerString$default = C54862xYb.convertToBigIntegerString$default(stateListAnimator != null ? stateListAnimator.OLrzqt() : null, false, (RoundingMode) null, 3, (java.lang.Object) null);
            java.lang.String strCopydefault = c10882bwo.copydefault();
            if (strCopydefault == null) {
                str5 = str2;
                str4 = "";
            } else {
                str4 = strCopydefault;
                str5 = str2;
            }
            java.lang.String strConvertToBigIntegerString$default2 = C54862xYb.convertToBigIntegerString$default(str5, false, (RoundingMode) null, 3, (java.lang.Object) null);
            java.lang.String strConvertToBigIntegerString$default3 = C54862xYb.convertToBigIntegerString$default(stateListAnimator != null ? stateListAnimator.copydefault() : null, false, (RoundingMode) null, 3, (java.lang.Object) null);
            java.util.List listKWHzl = stateListAnimator != null ? stateListAnimator.KWHzl() : null;
            if (listKWHzl == null) {
                listKWHzl = yDY.AhwBna();
            }
            java.lang.String strCopydefault2 = C54904xZq.copydefault.copydefault(signParams, new UTXOTransaction(strConvertToBigIntegerString$default, str, str4, "3MsXfLsWZ2XWvieDmkB4vY4TCmBxWZERf7", strConvertToBigIntegerString$default2, strConvertToBigIntegerString$default3, listKWHzl, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (DummyInfo) null, (java.lang.String) null, (java.lang.Integer) null, (java.lang.String) null, (java.lang.Boolean) null, (java.util.List) null, (java.lang.String) null, (java.lang.Integer) null, 524160, (DefaultConstructorMarker) null));
            long jOLrzqt = c10882bwo.OLrzqt();
            java.math.BigInteger bigIntegerKWHzl = C33129mqd.KWHzl(str2);
            java.lang.String strCopydefault3 = c10882bwo.copydefault();
            return new EosOpenAccountReq.EosOpenTransaction(strCopydefault2, jOLrzqt, bigIntegerKWHzl, strCopydefault3 == null ? "" : strCopydefault3, "3MsXfLsWZ2XWvieDmkB4vY4TCmBxWZERf7", C33129mqd.KWHzl(stateListAnimator != null ? stateListAnimator.copydefault() : null), null, null);
        }
        throw new java.lang.Exception("no address");
    }

    public final AbstractC58185ywX<EosOpenAccountReq.EosOpenTransaction> EZpvd(final java.lang.String str, final java.lang.String str2, final java.lang.String str3, final java.lang.String str4) {
        java.lang.String strUSBtdM;
        java.lang.String strDbNXlk;
        C13934dbu c13934dbu = this.djBIcL;
        AbstractC12782ctV abstractC12782ctV = this.copydefault;
        if (abstractC12782ctV == null || (strUSBtdM = abstractC12782ctV.USBtdM()) == null) {
            strUSBtdM = "";
        }
        AbstractC12782ctV abstractC12782ctV2 = this.copydefault;
        if (abstractC12782ctV2 == null || (strDbNXlk = abstractC12782ctV2.DbNXlk()) == null) {
            strDbNXlk = "";
        }
        java.lang.String strGEmmrt = C33129mqd.gEmmrt(java.lang.Long.valueOf(OLrzqt()));
        java.lang.String strCopydefault = copydefault();
        AbstractC58185ywX<ResponseData<SignInfo>> abstractC58185ywXCopydefault = c13934dbu.copydefault(strUSBtdM, strDbNXlk, new SignInfoReq(strGEmmrt, strCopydefault == null ? "" : strCopydefault, (java.lang.String) null, 0, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.Integer) null, (java.lang.Long) null, (java.lang.Long) null, (java.lang.String) null, (java.lang.Integer) null, (java.lang.Boolean) null, 8188, (DefaultConstructorMarker) null));
        final Function1 function1 = new Function1() { // from class: o.bwJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C10882bwo.copydefault(this.OLrzqt, str, str2, str3, str4, (ResponseData) obj);
            }
        };
        AbstractC58185ywX<R> abstractC58185ywXCopydefault2 = abstractC58185ywXCopydefault.copydefault(new InterfaceC58229yxO() { // from class: o.bwK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C10882bwo.isConnected(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXCopydefault2, "");
        return C33527myD.KWHzl(abstractC58185ywXCopydefault2);
    }

    public static final InterfaceC58261yxu isConnected(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC58261yxu) function1.invoke(obj);
    }

    public static final InterfaceC58261yxu copydefault(final C10882bwo c10882bwo, java.lang.String str, final java.lang.String str2, final java.lang.String str3, final java.lang.String str4, ResponseData responseData) throws java.lang.Exception {
        JsonObject info;
        java.lang.String string;
        java.lang.String str5 = "";
        Intrinsics.checkNotNullParameter(responseData, "");
        SignInfo signInfo = (SignInfo) responseData.getData();
        if (signInfo != null && (info = signInfo.getInfo()) != null && (string = info.toString()) != null) {
            str5 = string;
        }
        final com.google.gson.JsonObject jsonObjectOLrzqt = C33490mxT.OLrzqt(str5);
        final C10854bwM c10854bwMKWHzl = C10954byG.EZpvd.valueOf().KWHzl(c10882bwo.OLrzqt());
        AbstractC12782ctV abstractC12782ctV = c10882bwo.copydefault;
        Intrinsics.copydefault(abstractC12782ctV);
        long jCopydefault = C11600cUg.copydefault(c10854bwMKWHzl != null ? java.lang.Long.valueOf(c10854bwMKWHzl.AEQbTJ()) : null);
        AbstractC12782ctV abstractC12782ctV2 = c10882bwo.copydefault;
        Intrinsics.copydefault(abstractC12782ctV2);
        ChainAddress chainAddressAddressFromChainId$default = AbstractC12782ctV.addressFromChainId$default(abstractC12782ctV2, c10854bwMKWHzl != null ? c10854bwMKWHzl.AEQbTJ() : 0L, null, 2, null);
        if (chainAddressAddressFromChainId$default != null) {
            AbstractC58260yxt<java.lang.String> abstractC58260yxtOLrzqt = abstractC12782ctV.OLrzqt(str, jCopydefault, chainAddressAddressFromChainId$default.getAddressType());
            final Function1 function1 = new Function1() { // from class: o.bwL
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C10882bwo.AEQbTJ(c10854bwMKWHzl, c10882bwo, str2, jsonObjectOLrzqt, str3, str4, (java.lang.String) obj);
                }
            };
            return abstractC58260yxtOLrzqt.copydefault(new InterfaceC58229yxO() { // from class: o.bwI
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58229yxO
                public final java.lang.Object apply(java.lang.Object obj) {
                    return C10882bwo.AkhnZx(function1, obj);
                }
            });
        }
        throw new java.lang.Exception("no address");
    }

    public static final EosOpenAccountReq.EosOpenTransaction AkhnZx(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (EosOpenAccountReq.EosOpenTransaction) function1.invoke(obj);
    }

    public static final EosOpenAccountReq.EosOpenTransaction AEQbTJ(C10854bwM c10854bwM, C10882bwo c10882bwo, java.lang.String str, com.google.gson.JsonObject jsonObject, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        java.lang.String asString;
        JsonElement jsonElement;
        JsonElement jsonElement2;
        java.lang.String asString2;
        JsonElement jsonElement3;
        java.lang.String asString3;
        JsonElement jsonElement4;
        java.lang.String asString4;
        JsonElement jsonElement5;
        JsonElement jsonElement6;
        JsonElement jsonElement7;
        Intrinsics.checkNotNullParameter(str4, "");
        SignParams signParams = new SignParams(c10854bwM != null ? c10854bwM.QKVWgx() : -1L, c10854bwM != null ? c10854bwM.fetchVPNInfo() : -1L, null, str4, null, null, 0, null, false, false, null, 2036, null);
        java.lang.String strCopydefault = c10882bwo.copydefault();
        java.lang.String str5 = strCopydefault == null ? "" : strCopydefault;
        java.lang.String strValueOf = java.lang.String.valueOf((jsonObject == null || (jsonElement7 = jsonObject.get("expiration")) == null) ? null : java.lang.Long.valueOf(jsonElement7.getAsLong()));
        java.lang.String strConvertToBigIntegerString$default = C54862xYb.convertToBigIntegerString$default((jsonObject == null || (jsonElement6 = jsonObject.get("ref_block_number")) == null) ? null : jsonElement6.getAsString(), false, (RoundingMode) null, 3, (java.lang.Object) null);
        java.lang.String strConvertToBigIntegerString$default2 = C54862xYb.convertToBigIntegerString$default((jsonObject == null || (jsonElement5 = jsonObject.get("ref_block_prefix")) == null) ? null : jsonElement5.getAsString(), false, (RoundingMode) null, 3, (java.lang.Object) null);
        java.lang.String str6 = (jsonObject == null || (jsonElement4 = jsonObject.get("precision")) == null || (asString4 = jsonElement4.getAsString()) == null) ? "" : asString4;
        java.lang.String str7 = (jsonObject == null || (jsonElement3 = jsonObject.get("symbol")) == null || (asString3 = jsonElement3.getAsString()) == null) ? "" : asString3;
        java.lang.String str8 = (jsonObject == null || (jsonElement2 = jsonObject.get("contract")) == null || (asString2 = jsonElement2.getAsString()) == null) ? "" : asString2;
        if (jsonObject == null || (jsonElement = jsonObject.get("chainid")) == null || (asString = jsonElement.getAsString()) == null) {
            asString = "";
        }
        C10883bwp c10883bwp = c10882bwo.OLrzqt;
        Intrinsics.copydefault(c10883bwp);
        java.lang.String strConvertToBigDecimalString$default = C54862xYb.convertToBigDecimalString$default(c10883bwp.AEQbTJ(), false, 1, null);
        C10883bwp c10883bwp2 = c10882bwo.OLrzqt;
        Intrinsics.copydefault(c10883bwp2);
        java.lang.String strConvertToBigIntegerString$default3 = C54862xYb.convertToBigIntegerString$default(c10883bwp2.copydefault(), false, (RoundingMode) null, 3, (java.lang.Object) null);
        C10883bwp c10883bwp3 = c10882bwo.OLrzqt;
        Intrinsics.copydefault(c10883bwp3);
        java.lang.String strCopydefault2 = C54889xZb.AEQbTJ.copydefault(signParams, new EosNewAccountTransaction(str5, str, "0", "", strValueOf, strConvertToBigIntegerString$default, strConvertToBigIntegerString$default2, str6, str7, str8, asString, str2, str3, strConvertToBigDecimalString$default, strConvertToBigIntegerString$default3, C54862xYb.convertToBigIntegerString$default(c10883bwp3.AYXKKw(), false, (RoundingMode) null, 3, (java.lang.Object) null)));
        long jOLrzqt = c10882bwo.OLrzqt();
        EosOpenAccountReq.EosOpenAction[] eosOpenActionArr = new EosOpenAccountReq.EosOpenAction[3];
        java.lang.String strCopydefault3 = c10882bwo.copydefault();
        eosOpenActionArr[0] = new EosOpenAccountReq.EosOpenAction("newaccount", strCopydefault3 == null ? "" : strCopydefault3, str, null, null, null, null, null, null);
        java.lang.String strCopydefault4 = c10882bwo.copydefault();
        eosOpenActionArr[1] = new EosOpenAccountReq.EosOpenAction("buyrambytes", strCopydefault4 == null ? "" : strCopydefault4, str, null, null, null, new java.math.BigInteger("4096"), null, null);
        java.lang.String strCopydefault5 = c10882bwo.copydefault();
        eosOpenActionArr[2] = new EosOpenAccountReq.EosOpenAction("delegatebw", strCopydefault5 == null ? "" : strCopydefault5, str, null, new java.math.BigInteger("10000"), new java.math.BigInteger("2000"), null, null, null);
        return new EosOpenAccountReq.EosOpenTransaction(strCopydefault2, jOLrzqt, null, null, null, null, null, yDY.gEmmrt(eosOpenActionArr));
    }

    public static final kotlin.Pair KWHzl(C10882bwo c10882bwo, C10854bwM c10854bwM, java.lang.String str, java.lang.String str2, ResponseData responseData, ResponseData responseData2) throws java.lang.Exception {
        java.util.ArrayList arrayList;
        Intrinsics.checkNotNullParameter(responseData, "");
        Intrinsics.checkNotNullParameter(responseData2, "");
        if (responseData.getCode() != 0 || responseData.getData() == null || responseData2.getCode() != 0 || responseData2.getData() == null) {
            throw new java.lang.Exception("network error");
        }
        Json jsonAEQbTJ = C33489mxS.KWHzl.AEQbTJ();
        KSerializer<OkUTXOTransaction.UTXOSignInfo> kSerializerSerializer = OkUTXOTransaction.UTXOSignInfo.Companion.serializer();
        java.lang.Object data = responseData.getData();
        Intrinsics.copydefault(data);
        JsonObject info = ((SignInfo) data).getInfo();
        Intrinsics.copydefault(info);
        java.lang.String minOutput = ((OkUTXOTransaction.UTXOSignInfo) jsonAEQbTJ.decodeFromJsonElement(kSerializerSerializer, info)).getMinOutput();
        if (minOutput == null) {
            minOutput = "1500";
        }
        C12797ctk c12797ctk = c10882bwo.valueOf;
        AbstractC12782ctV abstractC12782ctV = c10882bwo.copydefault;
        Intrinsics.copydefault(abstractC12782ctV);
        java.lang.String strKWHzl = c10882bwo.valueOf.KWHzl();
        java.util.List list = (java.util.List) responseData2.getData();
        if (list != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            for (java.lang.Object obj : list) {
                if (Intrinsics.EZpvd((java.lang.Object) ((UTXOInfoResp) obj).getAddress(), (java.lang.Object) c10882bwo.copydefault())) {
                    arrayList2.add(obj);
                }
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        return C56390yDp.OLrzqt(minOutput, c12797ctk.copydefault(abstractC12782ctV, c10854bwM, str, str2, strKWHzl, minOutput, arrayList));
    }
}
