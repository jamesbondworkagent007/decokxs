package o;

import com.okinc.business.defi.biz.constant.XRCTokenType;
import com.okinc.business.defi.biz.core.customchain.meta.CustomChainCoinMeta;
import com.okinc.business.defi.biz.net.bean.CoinMetaBean;
import com.okinc.business.defi.biz.net.bean.FactionInfo;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.bwM, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C10854bwM implements InterfaceC9731bbC {
    public static final int $stable = 8;
    public final java.lang.Integer _protocolId;
    public final boolean aaSupport;
    public final java.lang.String address;
    public final long baseCoinId;
    public final boolean cefiSupport;
    public final java.lang.String chainAddressPrefix;
    public final java.lang.String chainImageUrl;
    public final java.lang.String chainName;
    public java.lang.String chainUrl;
    public final int coinCategory;
    public final long coinId;
    public final int coinType;
    public final int currencyId;
    public final int decimalNum;
    public final int displayPrecision;
    public final java.lang.String explorerUrl;
    public final FactionInfo factionInfo;
    public final long generalChainId;
    public final int hotNetworkRank;
    public final java.lang.String imageUrl;
    public final boolean isAggregationAddress;
    public final boolean isAggregationChain;
    public boolean isCustom;
    public final boolean isDefault;
    public final java.lang.Integer isHighQuality;
    public final boolean isHotNetwork;
    public final boolean isPlatformToken;
    public final boolean isStableCoin;
    public final java.lang.Boolean isSystemToken;
    public final boolean isVisible;
    public final java.lang.String name;
    public final int orderDecimalNum;
    public final int position;
    public final java.lang.Integer protocolType;
    public final long realEvmChainId;
    public java.lang.Integer riskType;
    public java.lang.String rpcUrl;
    public final java.lang.Boolean supportFullHistory;
    public final boolean supportPush;
    public final boolean supportShowDetail;
    public final boolean supportStableCoinInterest;
    public final java.lang.String symbol;
    public int tokenSort;
    public final java.lang.String tokenType;
    public final int vDecimalNum;

    /* JADX INFO: renamed from: o.bwM$Activity */
    public final /* synthetic */ class Activity {
        public static final /* synthetic */ int[] KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[XRCTokenType.values().length];
            try {
                iArr[XRCTokenType.Brc20Token.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[XRCTokenType.Brc20sToken.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[XRCTokenType.Arc20Token.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[XRCTokenType.SRC20Token.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[XRCTokenType.RunesToken.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr[XRCTokenType.RunesMainToken.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                iArr[XRCTokenType.Brc20ForFBTCToken.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                iArr[XRCTokenType.RunesMainForFBTCToken.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            KWHzl = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(int i) {
        this.tokenSort = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AYXKKw(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.rpcUrl = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC9731bbC
    public long AhwBna() {
        return this.coinId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC9731bbC
    public int AkhnZx() {
        return this.displayPrecision;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int AuCTelauCTel() {
        return this.coinCategory;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int AxsJAY() {
        return this.currencyId;
    }

    public final boolean DAIeex() {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean DCUTEI() {
        return this.isDefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int DTwDnp() {
        return this.orderDecimalNum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean DarRvM() {
        return this.isCustom;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC9731bbC
    public java.lang.String DbNXlk() {
        return this.imageUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean DcqEDu() {
        return this.isVisible;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC9731bbC
    public long EZpvd() {
        return this.baseCoinId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(boolean z) {
        this.isCustom = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC9731bbC
    public java.lang.String OLrzqt() {
        return this.address;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int ORxRYg() {
        return this.hotNetworkRank;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean QHmsKR() {
        return this.coinType == 268435456;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Integer QUSxYX() {
        return this.riskType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Integer QbewEr() {
        return this._protocolId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int QfsBiF() {
        return this.position;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean QwvEab() {
        return this.coinType == 67108864;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String RJOkX() {
        return this.rpcUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean RcXXUw() {
        return this.supportStableCoinInterest;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int UeEOUB() {
        return this.tokenSort;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Boolean WS() {
        return this.isSystemToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean aKErDB() {
        return this.supportPush;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean aUsmxb() {
        return this.isPlatformToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC9731bbC
    public java.lang.String copydefault() {
        return this.chainImageUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void copydefault(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.chainUrl = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Integer dHguZz() {
        return this.isHighQuality;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String dNCPSb() {
        return this.tokenType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC9731bbC
    public java.lang.String djBIcL() {
        return this.chainName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean djSkpj() {
        return this.supportShowDetail;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean dvKsVJ() {
        return this.coinType == 524288;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean dxcTrN() {
        return this.isAggregationAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC9731bbC
    public java.lang.String fJNWhG() {
        return this.symbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int fZBcTu() {
        return this.vDecimalNum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC9731bbC
    public long fetchVPNInfo() {
        return this.generalChainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean fjfviF() {
        return this.coinType == 33554432;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean fvQaOB() {
        return this.coinType == 536870912;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int gHZMYf() {
        return this.coinType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean getFieldNames() {
        return this.aaSupport;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC9731bbC
    public boolean getNewProxyInstance() {
        return this.isStableCoin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean giSNqX() {
        return this.isAggregationChain;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean hBpjJd() {
        return this.isHotNetwork;
    }

    public final boolean htlTjW() {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean iZzfmt() {
        return this.coinType == 1073741824;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean igXuih() {
        return this.coinType == 1048576;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC9731bbC
    public long isConnected() {
        return this.realEvmChainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC9731bbC
    public int valueOf() {
        return this.decimalNum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC9731bbC
    public java.lang.String values() {
        return this.name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String zLjUOn() {
        return this.chainAddressPrefix;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean zsXlph() {
        return this.cefiSupport;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String zuBGHE() {
        return this.explorerUrl;
    }

    public C10854bwM(@NotNull CoinMetaBean coinMetaBean) {
        Intrinsics.checkNotNullParameter(coinMetaBean, "");
        this.coinId = coinMetaBean.getCoinId();
        this.baseCoinId = coinMetaBean.getBaseCoinId();
        this.realEvmChainId = coinMetaBean.getRealChainId();
        this.isVisible = coinMetaBean.isVisible();
        this.imageUrl = coinMetaBean.getImageUrl();
        this.chainImageUrl = C33129mqd.OLrzqt((java.lang.CharSequence) coinMetaBean.getChainImageUrl()) ? coinMetaBean.getChainImageUrl() : DbNXlk();
        java.lang.Boolean aaSupport = coinMetaBean.getAaSupport();
        this.aaSupport = aaSupport != null ? aaSupport.booleanValue() : false;
        this.address = coinMetaBean.getAddress();
        this.symbol = coinMetaBean.getSymbol();
        this.name = coinMetaBean.getName();
        this.chainName = coinMetaBean.getChainName();
        this.decimalNum = coinMetaBean.getDecimalNum();
        this.currencyId = coinMetaBean.getCurrencyId();
        this.cefiSupport = coinMetaBean.getCefiSupport();
        this.isPlatformToken = coinMetaBean.getPlatformType() == 0;
        this.isHotNetwork = coinMetaBean.isHotNetwork();
        this.hotNetworkRank = coinMetaBean.getHotNetworkRank();
        this.coinCategory = coinMetaBean.getCoinCategory();
        this.chainUrl = "";
        this.vDecimalNum = coinMetaBean.getVdecimalNum();
        this.orderDecimalNum = coinMetaBean.getOrderDecimalNum();
        this.isDefault = coinMetaBean.isDefault();
        this.isAggregationAddress = coinMetaBean.getAggregationType() == 2;
        this.isAggregationChain = coinMetaBean.getAggregationType() == 1;
        this.tokenType = coinMetaBean.getTokenType();
        this.tokenSort = coinMetaBean.getTokenSort();
        this.supportPush = coinMetaBean.getSupportPush();
        this.supportShowDetail = coinMetaBean.getSupportShowDetail();
        this.supportFullHistory = coinMetaBean.getSupportFullHistory();
        this.explorerUrl = coinMetaBean.getExplorerUrl();
        this.rpcUrl = "";
        java.lang.Integer sort = coinMetaBean.getSort();
        this.position = sort != null ? sort.intValue() : 0;
        this.coinType = coinMetaBean.getCoinType();
        this.protocolType = coinMetaBean.getProtocolType();
        this.displayPrecision = coinMetaBean.getDisplayPrecision();
        this.isStableCoin = coinMetaBean.getStableCoin();
        this.supportStableCoinInterest = coinMetaBean.getSupportStableCoinInterest();
        this.generalChainId = coinMetaBean.getChainId();
        this.chainAddressPrefix = coinMetaBean.getChainAddressPrefix();
        this._protocolId = coinMetaBean.getProtocolId();
        this.factionInfo = coinMetaBean.getFactionInfo();
        this.isSystemToken = coinMetaBean.getSystemToken();
        this.riskType = coinMetaBean.getRiskType();
        this.isHighQuality = coinMetaBean.isHighQuality();
    }

    public final java.lang.String OcIXYQ() {
        return C10953byF.KWHzl.AEQbTJ(AhwBna());
    }

    @Override // o.InterfaceC9731bbC
    public java.lang.String AYXKKw() {
        if (this.isCustom) {
            return this.chainUrl;
        }
        C10854bwM c10854bwMKWHzl = KWHzl();
        java.lang.String strCopydefault = c10854bwMKWHzl != null ? c10854bwMKWHzl.copydefault() : null;
        return strCopydefault == null ? "" : strCopydefault;
    }

    public final java.lang.String AwvSrB() {
        java.lang.String lowerCase = values().toLowerCase(java.util.Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "");
        return C59449zhJ.replace$default(lowerCase, " ", "", false, 4, (java.lang.Object) null);
    }

    public final java.lang.String sSMYrx() {
        java.lang.String lowerCase = djBIcL().toLowerCase(java.util.Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "");
        return C59449zhJ.replace$default(lowerCase, " ", "", false, 4, (java.lang.Object) null);
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl()Lo/bbC; */
    @Override // o.InterfaceC9731bbC
    /* JADX INFO: renamed from: wlaJM, reason: merged with bridge method [inline-methods] */
    public C10854bwM KWHzl() {
        CustomChainCoinMeta customChainCoinMetaEZpvd;
        if (this.isCustom) {
            CustomChainCoinMeta customChainCoinMetaOLrzqt = C10598brV.AEQbTJ.OLrzqt(AhwBna());
            if (customChainCoinMetaOLrzqt == null || (customChainCoinMetaEZpvd = customChainCoinMetaOLrzqt.EZpvd()) == null) {
                return null;
            }
            return customChainCoinMetaEZpvd.AEQbTJ();
        }
        return C10954byG.EZpvd.valueOf().KWHzl(AhwBna());
    }

    @Override // o.InterfaceC9731bbC
    public boolean AuCTel() {
        return EZpvd() == 0;
    }

    public final boolean DCUTEIddSDPG() {
        return !AuCTel();
    }

    @Override // o.InterfaceC9731bbC
    public long AEQbTJ() {
        return AuCTel() ? AhwBna() : EZpvd();
    }

    public final boolean accept() {
        return AEQbTJ() == 1 && AhwBna() == 22;
    }

    public final boolean KDccX() {
        return fetchVPNInfo() == 196 && AhwBna() == 25034771;
    }

    public static /* synthetic */ boolean isXRCToken$default(C10854bwM c10854bwM, XRCTokenType[] xRCTokenTypeArr, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            xRCTokenTypeArr = new XRCTokenType[0];
        }
        return c10854bwM.copydefault(xRCTokenTypeArr);
    }

    public final boolean copydefault(@NotNull XRCTokenType... xRCTokenTypeArr) {
        boolean zIZzfmt;
        Intrinsics.checkNotNullParameter(xRCTokenTypeArr, "");
        if (xRCTokenTypeArr.length != 0) {
            for (XRCTokenType xRCTokenType : xRCTokenTypeArr) {
                switch (Activity.KWHzl[xRCTokenType.ordinal()]) {
                    case 1:
                        zIZzfmt = iZzfmt();
                        break;
                    case 2:
                        zIZzfmt = DAIeex();
                        break;
                    case 3:
                        zIZzfmt = dvKsVJ();
                        break;
                    case 4:
                        zIZzfmt = fjfviF();
                        break;
                    case 5:
                        zIZzfmt = htlTjW();
                        break;
                    case 6:
                        zIZzfmt = igXuih();
                        break;
                    case 7:
                        zIZzfmt = fvQaOB();
                        break;
                    case 8:
                        zIZzfmt = QwvEab();
                        break;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
                if (!zIZzfmt) {
                }
            }
            return false;
        }
        if (!iZzfmt() && !DAIeex() && !dvKsVJ() && !fjfviF() && !htlTjW() && !igXuih() && !fvQaOB() && !QwvEab()) {
            return false;
        }
        return true;
    }

    public final boolean hUfVAv() {
        return iZzfmt() || DAIeex() || fvQaOB();
    }

    public final boolean fERRXa() {
        java.lang.Integer num = this.protocolType;
        return num != null && num.intValue() == 61;
    }

    public final boolean OJuSTm() {
        java.lang.Integer num = this.protocolType;
        return num != null && num.intValue() == 63;
    }

    public final boolean DWgRXt() {
        java.lang.Integer num = this.protocolType;
        return num != null && num.intValue() == 71;
    }

    public final java.lang.String fFgQHt() {
        if (dvKsVJ() || htlTjW() || igXuih() || DAIeex()) {
            return (java.lang.String) CollectionsKt___CollectionsKt.AubY(StringsKt__StringsKt.split$default((java.lang.CharSequence) OLrzqt(), new java.lang.String[]{"-"}, false, 0, 6, (java.lang.Object) null));
        }
        return null;
    }

    public final java.lang.String AubY() {
        if (ODWQjV()) {
            return (java.lang.String) CollectionsKt___CollectionsKt.firstOrNull(StringsKt__StringsKt.split$default((java.lang.CharSequence) OLrzqt(), new java.lang.String[]{"-"}, false, 0, 6, (java.lang.Object) null));
        }
        return null;
    }

    public final java.lang.String hDKMBd() {
        if (ODWQjV()) {
            return (java.lang.String) CollectionsKt___CollectionsKt.AkhnZx(StringsKt__StringsKt.split$default((java.lang.CharSequence) OLrzqt(), new java.lang.String[]{"-"}, false, 0, 6, (java.lang.Object) null), 1);
        }
        return null;
    }

    @Override // o.InterfaceC9731bbC
    public boolean ejfBZ() {
        return AuCTel() && isConnected() != 0;
    }

    public final boolean AxsJAYaxsJAY() {
        return AuCTel() && fetchVPNInfo() == 0;
    }

    public final boolean DLWbHP() {
        return AuCTel() && fetchVPNInfo() == 2;
    }

    public final boolean OqFWZa() {
        return AuCTel() && fetchVPNInfo() == 5;
    }

    public final boolean DGUQLI() {
        return AuCTel() && fetchVPNInfo() == 133;
    }

    public final boolean flVtFt() {
        return AuCTel() && fetchVPNInfo() == 145;
    }

    public final boolean gkJEwt() {
        return AuCTel() && fetchVPNInfo() == 236;
    }

    public final boolean zuWLRA() {
        return AuCTel() && fetchVPNInfo() == 3;
    }

    public final boolean AxsJAYsNCnLh() {
        return AuCTel() && fetchVPNInfo() == 70000047;
    }

    public final boolean QKudOq() {
        return AuCTel() && fetchVPNInfo() == 70000038;
    }

    public final boolean OBJEWx() {
        return AuCTel() && fetchVPNInfo() == 1;
    }

    public final boolean QSLkRj() {
        return AuCTel() && fetchVPNInfo() == 66;
    }

    public final boolean USBtdM() {
        return AuCTel() && fetchVPNInfo() == 2020;
    }

    public final boolean dmfpNf() {
        return AuCTel() && fetchVPNInfo() == 1666600000;
    }

    public final boolean ffGIBT() {
        return AuCTel() && fetchVPNInfo() == 61;
    }

    public final boolean DCUTEIdCUTEI() {
        return AuCTel() && fetchVPNInfo() == 9004;
    }

    public final boolean hCLrkq() {
        return AuCTel() && fetchVPNInfo() == 805;
    }

    public final boolean heceqZ() {
        return AuCTel() && fetchVPNInfo() == 13;
    }

    public final boolean OuxcSI() {
        return AuCTel() && fetchVPNInfo() == 194;
    }

    public final boolean UrRBLY() {
        return AuCTel() && fetchVPNInfo() == 708;
    }

    public final boolean gasjUx() {
        return AuCTel() && fetchVPNInfo() == 118;
    }

    public final boolean dUDNAs() {
        return AuCTel() && fetchVPNInfo() == 706;
    }

    public final boolean QSBOWP() {
        return AuCTel() && fetchVPNInfo() == 710;
    }

    public final boolean ODXsMY() {
        return AuCTel() && fetchVPNInfo() == 459;
    }

    public final boolean OHqIaq() {
        return AuCTel() && fetchVPNInfo() == 70000041;
    }

    public final boolean run() {
        return AuCTel() && fetchVPNInfo() == 195;
    }

    public final boolean fdOvFl() {
        return AuCTel() && fetchVPNInfo() == 501;
    }

    public final boolean QVsKAR() {
        return AuCTel() && fetchVPNInfo() == 397;
    }

    public final boolean gGvvIC() {
        return AuCTel() && fetchVPNInfo() == 637;
    }

    public final boolean ixgjPv() {
        return AuCTel() && fetchVPNInfo() == 784;
    }

    public final boolean Dmq() {
        return AuCTel() && fetchVPNInfo() == 5757;
    }

    public final boolean OFhtUX() {
        return AuCTel() && fetchVPNInfo() == 111111;
    }

    public final boolean QCjLjM() {
        return AuCTel() && fetchVPNInfo() == 1237;
    }

    public final boolean DGOPHZ() {
        return AuCTel() && fetchVPNInfo() == 607;
    }

    public final boolean zblBkD() {
        return AuCTel() && fetchVPNInfo() == 70000059;
    }

    public final boolean UlJrfe() {
        return AuCTel() && fetchVPNInfo() == 70000074;
    }

    public final boolean gwTjWJ() {
        return AuCTel() && fetchVPNInfo() == 70000078;
    }

    public final boolean fHqPtx() {
        return AuCTel() && fetchVPNInfo() == 196;
    }

    public final boolean DCJXGO() {
        FactionInfo factionInfo;
        return (AuCTel() && (factionInfo = this.factionInfo) != null && factionInfo.isCosmos()) || ODXsMY();
    }

    @Override // o.InterfaceC9731bbC
    public boolean fARcdN() {
        FactionInfo factionInfo;
        if (fdOvFl()) {
            return true;
        }
        return AuCTel() && (factionInfo = this.factionInfo) != null && factionInfo.isSVM();
    }

    public final boolean call() {
        return iRxXKY() || DLWbHP() || OqFWZa() || DGUQLI() || flVtFt() || gkJEwt() || zuWLRA() || AxsJAYsNCnLh() || QKudOq();
    }

    public final boolean DXXBbs() {
        return DCJXGO() || QSBOWP() || OHqIaq() || gwTjWJ();
    }

    public final boolean getPostValueLengthLimit() {
        return OuxcSI() || UrRBLY();
    }

    @Override // o.InterfaceC9731bbC
    public boolean fIwbmz() {
        FactionInfo factionInfo;
        if (gGvvIC()) {
            return true;
        }
        return AuCTel() && (factionInfo = this.factionInfo) != null && factionInfo.isAptos();
    }

    public final boolean hrNTAI() {
        return ejfBZ() || AxsJAYaxsJAY() || run() || DCJXGO();
    }

    public final boolean QkdxfA() {
        return ejfBZ() || USBtdM() || dmfpNf();
    }

    public final boolean RlQdEF() {
        return AuCTel() && fetchVPNInfo() == 1815;
    }

    public final boolean ODWQjV() {
        C10854bwM c10854bwMKWHzl = KWHzl();
        return c10854bwMKWHzl != null && c10854bwMKWHzl.RlQdEF() && DCUTEIddSDPG();
    }

    public final boolean RKDWNf() {
        return AuCTel() && fetchVPNInfo() == 70000061;
    }

    public final boolean iRxXKY() {
        FactionInfo factionInfo;
        if (AxsJAYaxsJAY()) {
            return true;
        }
        return AuCTel() && (factionInfo = this.factionInfo) != null && factionInfo.isBitcoin();
    }

    public final long QKVWgx() {
        FactionInfo factionInfo = this.factionInfo;
        if (factionInfo != null && factionInfo.isEVM()) {
            return -2000L;
        }
        FactionInfo factionInfo2 = this.factionInfo;
        if (factionInfo2 != null && factionInfo2.isCosmos()) {
            return -2001L;
        }
        FactionInfo factionInfo3 = this.factionInfo;
        if (factionInfo3 != null && factionInfo3.isSVM()) {
            return -2002L;
        }
        FactionInfo factionInfo4 = this.factionInfo;
        if (factionInfo4 != null && factionInfo4.isAptos()) {
            return -2003L;
        }
        FactionInfo factionInfo5 = this.factionInfo;
        if (factionInfo5 != null && factionInfo5.isBitcoin()) {
            if (AxsJAYaxsJAY()) {
                return fetchVPNInfo();
            }
            return -2004L;
        }
        return fetchVPNInfo();
    }

    public final long QVAiDq() {
        FactionInfo factionInfo = this.factionInfo;
        if (factionInfo != null && factionInfo.isEVM()) {
            return 1L;
        }
        FactionInfo factionInfo2 = this.factionInfo;
        if (factionInfo2 != null && factionInfo2.isCosmos()) {
            return 118L;
        }
        FactionInfo factionInfo3 = this.factionInfo;
        if (factionInfo3 != null && factionInfo3.isSVM()) {
            return 501L;
        }
        FactionInfo factionInfo4 = this.factionInfo;
        if (factionInfo4 != null && factionInfo4.isAptos()) {
            return 637L;
        }
        FactionInfo factionInfo5 = this.factionInfo;
        if (factionInfo5 == null || !factionInfo5.isBitcoin()) {
            return fetchVPNInfo();
        }
        return 0L;
    }

    public final boolean RdAHlO() {
        FactionInfo factionInfo = this.factionInfo;
        if (factionInfo != null && factionInfo.isEVM()) {
            return true;
        }
        FactionInfo factionInfo2 = this.factionInfo;
        if (factionInfo2 != null && factionInfo2.isSVM()) {
            return true;
        }
        FactionInfo factionInfo3 = this.factionInfo;
        if (factionInfo3 != null && factionInfo3.isAptos()) {
            return true;
        }
        FactionInfo factionInfo4 = this.factionInfo;
        return factionInfo4 != null && factionInfo4.isBitcoin();
    }

    public final int QOLQEE() {
        FactionInfo factionInfo = this.factionInfo;
        if (factionInfo != null) {
            return factionInfo.getFactionType();
        }
        return -1;
    }

    public final java.lang.String iwGUEr() {
        FactionInfo factionInfo = this.factionInfo;
        java.lang.String addressHrp = factionInfo != null ? factionInfo.getAddressHrp() : null;
        return addressHrp == null ? "" : addressHrp;
    }

    @Override // o.InterfaceC9731bbC
    public java.lang.String gEmmrt() {
        return QSLkRj() ? djBIcL() : values();
    }

    public final boolean EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (C59449zhJ.gEmmrt(str, values(), true) || C59449zhJ.gEmmrt(str, AwvSrB(), true) || C59449zhJ.gEmmrt(str, djBIcL(), true) || C59449zhJ.gEmmrt(str, sSMYrx(), true)) {
            return true;
        }
        C10854bwM c10854bwMKWHzl = KWHzl();
        if (C59449zhJ.gEmmrt(str, c10854bwMKWHzl != null ? c10854bwMKWHzl.values() : null, true)) {
            return true;
        }
        C10854bwM c10854bwMKWHzl2 = KWHzl();
        return C59449zhJ.gEmmrt(str, c10854bwMKWHzl2 != null ? c10854bwMKWHzl2.AwvSrB() : null, true);
    }

    public final boolean DNMMPQ() {
        return getPostValueLengthLimit() || DXXBbs() || Dmq() || DGOPHZ() || UlJrfe();
    }

    public final boolean spnCvw() {
        return QkdxfA() || xZX.OLrzqt.AEQbTJ().contains(java.lang.Long.valueOf(fetchVPNInfo()));
    }

    public final boolean OxVOHk() {
        return iRxXKY() || flVtFt() || gkJEwt() || DLWbHP() || zuWLRA() || OFhtUX() || dvKsVJ() || AxsJAYsNCnLh() || QKudOq();
    }

    public final boolean uzCIH() {
        C10854bwM c10854bwMKWHzl = KWHzl();
        return (c10854bwMKWHzl == null || !c10854bwMKWHzl.run()) && !isXRCToken$default(this, null, 1, null);
    }

    public final boolean DsrFlB() {
        return iRxXKY() || flVtFt() || DLWbHP() || AxsJAYsNCnLh() || QKudOq();
    }

    public final boolean DBxZfM() {
        C10854bwM c10854bwMKWHzl = KWHzl();
        return c10854bwMKWHzl != null && c10854bwMKWHzl.UlJrfe() && DCUTEIddSDPG();
    }

    @Override // o.InterfaceC9731bbC
    public java.lang.String KWHzl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        C10854bwM c10854bwMKWHzl = KWHzl();
        return (c10854bwMKWHzl == null || !c10854bwMKWHzl.DGOPHZDGOPHZ()) ? str : AEQbTJ(str);
    }

    public final java.lang.String AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        C10854bwM c10854bwMKWHzl = KWHzl();
        java.lang.String str2 = c10854bwMKWHzl != null ? c10854bwMKWHzl.chainAddressPrefix : null;
        java.lang.String str3 = str2 != null ? str2 : "";
        if (str3.length() == 0 || str.length() == 0 || C59449zhJ.AYXKKw(str, str3, true)) {
            return str;
        }
        return str3 + C54910xZw.EZpvd(str);
    }

    public final boolean OLrzqt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (!DGgnkA()) {
            return false;
        }
        C10854bwM c10854bwMKWHzl = KWHzl();
        java.lang.String str2 = c10854bwMKWHzl != null ? c10854bwMKWHzl.chainAddressPrefix : null;
        java.lang.String str3 = str2 != null ? str2 : "";
        if (str3.length() == 0) {
            return false;
        }
        return C59449zhJ.AYXKKw(str, str3, true);
    }

    public final boolean DGOPHZDGOPHZ() {
        return DGgnkA() && C17948fYf.copydefault.EZpvd();
    }

    public final boolean DGgnkA() {
        C10854bwM c10854bwMKWHzl = KWHzl();
        if (c10854bwMKWHzl != null && c10854bwMKWHzl.fHqPtx()) {
            C10854bwM c10854bwMKWHzl2 = KWHzl();
            if (C33129mqd.OLrzqt((java.lang.CharSequence) (c10854bwMKWHzl2 != null ? c10854bwMKWHzl2.chainAddressPrefix : null)) && C17948fYf.copydefault.KWHzl()) {
                return true;
            }
        }
        return false;
    }

    public final boolean finit() {
        C10854bwM c10854bwMKWHzl = KWHzl();
        return (c10854bwMKWHzl == null || c10854bwMKWHzl.fARcdN() || c10854bwMKWHzl.iRxXKY() || c10854bwMKWHzl.run()) ? false : true;
    }
}
