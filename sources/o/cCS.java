package o;

import com.okinc.business.defi.biz.constant.WalletSyncStatus;
import com.okinc.business.defi.biz.constant.WalletType;
import com.okinc.business.defi.biz.constant.XRCTokenType;
import com.okinc.business.defi.biz.core.common.WalletSelectedChainBean;
import com.okinc.business.defi.biz.core.customchain.meta.CustomChainCoinMeta;
import com.okinc.business.defi.biz.core.customchain.meta.CustomChainMeta;
import com.okinc.business.defi.biz.core.error.OKWException;
import com.okinc.business.defi.biz.core.mpc.MpcShare2Status;
import com.okinc.business.defi.biz.core.nostrfix.IdentifierType;
import com.okinc.business.defi.biz.core.nostrfix.IdentifierTypeNostrFixStatus;
import com.okinc.business.defi.biz.database.wallet.entity.CustomChainWalletCoinEntity;
import com.okinc.business.defi.biz.database.wallet.entity.EOSInfoEntity;
import com.okinc.business.defi.biz.database.wallet.entity.WalletClosedCoinEntity;
import com.okinc.business.defi.biz.database.wallet.entity.WalletCoinAssetEntity;
import com.okinc.business.defi.biz.database.wallet.entity.WalletNftEntity;
import com.okinc.business.defi.biz.database.wallet.entity.WalletOpenedCoinEntity;
import com.okinc.business.defi.biz.model.ChainAddress;
import com.okinc.business.defi.biz.model.wallet.MpcWalletDecodeInfo;
import com.okinc.business.defi.biz.model.wallet.MpcWalletEncodeInfo;
import com.okinc.business.defi.biz.net.bean.AAStatus;
import com.okinc.business.defi.biz.net.bean.SingleTeeStatus;
import com.okinc.business.defi.biz.net.bean.SingleTeeStatusAndWarringInfo;
import com.okinc.business.defi.biz.net.bean.TeeStatus;
import com.okinc.business.defi.biz.net.bean.TokenAsset;
import com.okinc.wallet.api.bean.AddressType;
import com.okinc.wallet.core.mpc.HDWalletCoin;
import com.okinc.wallet.core.mpc.MpcPrivateKey;
import com.okinc.wallet.core.sign.MPCeCDSAToHEX;
import com.okinc.wallet.core.sign.SignParams;
import com.okinc.wallet.core.sign.ton.TonAddress;
import com.okinc.wallet.core.sign.ton.TonWalletInformation;
import java.math.BigDecimal;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import o.C10407bnq;
import o.C10525bqB;
import o.C10614brl;
import o.C10822bvh;
import o.C11010bzJ;
import o.C12827cuN;
import o.C13754dXa;
import o.C52761wXj;
import o.InterfaceC9738bbJ;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public class cCS extends AbstractC12782ctV {
    public AAStatus AEQbTJ;
    public volatile java.util.ArrayList<ChainAddress> AYXKKw;
    public java.util.ArrayList<ChainAddress> AhwBna;
    public boolean AkhnZx;
    public java.lang.String AuCTel;
    public IdentifierType AuCTelauCTel;
    public boolean AubY;
    public boolean AwvSrB;
    public java.util.List<C10854bwM> DTwDnp;
    public java.util.List<C10854bwM> DbNXlk;
    public int KWHzl;
    public java.util.List<C10525bqB> OLrzqt;
    public java.util.ArrayList<C10528bqE> ORxRYg;
    public java.lang.String OcIXYQ;
    public int QKVWgx;
    public java.util.HashMap<java.lang.String, C10528bqE> QOLQEE;
    public IdentifierTypeNostrFixStatus QUSxYX;
    public AbstractC12784ctX QVAiDq;
    public java.lang.String QbewEr;
    public java.util.HashMap<java.lang.Long, C10594brR> QfsBiF;
    public java.util.ArrayList<java.lang.Object> RJOkX;
    public java.util.Map<java.lang.Long, ? extends java.util.List<C10525bqB>> RcXXUw;
    public int UeEOUB;
    public java.util.ArrayList<C10594brR> aKErDB;
    public java.util.List<C10525bqB> dNCPSb;
    public java.lang.String dvKsVJ;
    public java.lang.String dxcTrN;
    public java.util.ArrayList<ChainAddress> ejfBZ;
    public long fARcdN;
    public java.lang.Long fFgQHt;
    public java.util.ArrayList<C10594brR> fIwbmz;
    public java.util.HashMap<java.lang.Long, C10594brR> fJNWhG;
    public java.lang.String fZBcTu;
    public java.util.Map<java.lang.Long, ? extends java.util.List<C10525bqB>> fetchVPNInfo;
    public java.lang.String finit;
    public boolean gEmmrt;
    public boolean gHZMYf;
    public C13852daR getFieldNames;
    public java.util.ArrayList<C10527bqD> getNewProxyInstance;
    public WalletType hDKMBd;
    public java.util.List<C10525bqB> isConnected;
    public MpcWalletEncodeInfo sSMYrx;
    public java.util.HashMap<java.lang.String, C10527bqD> uzCIH;
    public java.util.ArrayList<ChainAddress> valueOf;
    public java.util.List<C10525bqB> values;
    public boolean zLjUOn;
    public java.lang.String zsXlph;
    public boolean zuBGHE;
    public java.lang.String wlaJM = "";
    public java.lang.String EZpvd = "";
    public final InterfaceC56387yDm djSkpj = C56392yDr.copydefault(new Function0() { // from class: o.cCV
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return cCS.copydefault(this.AEQbTJ);
        }
    });
    public WalletType fvQaOB = WalletType.HDWallet;
    public java.lang.String AxsJAY = "";
    public java.lang.String iwGUEr = "";
    public long djBIcL = -1;
    public java.lang.String flVtFt = "";
    public java.lang.String gGvvIC = "";

    public final /* synthetic */ class StateListAnimator {
        public static final /* synthetic */ int[] KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[WalletType.values().length];
            try {
                iArr[WalletType.KeyWallet.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[WalletType.TrackingWallet.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[WalletType.HDWallet.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[WalletType.MPCWallet.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[WalletType.HardwareWallet.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            KWHzl = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final InterfaceC58261yxu EZpvd(AbstractC58260yxt abstractC58260yxt, java.lang.Integer num) {
        Intrinsics.checkNotNullParameter(num, "");
        return abstractC58260yxt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC12782ctV
    public void AEQbTJ(int i) {
        this.QKVWgx = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC12782ctV
    public void AEQbTJ(MpcWalletEncodeInfo mpcWalletEncodeInfo) {
        this.sSMYrx = mpcWalletEncodeInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(@NotNull java.util.List<C10854bwM> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.DTwDnp = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC12782ctV
    public void AEQbTJ(boolean z) {
        this.gHZMYf = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void AhwBna(boolean z) {
        this.zuBGHE = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC12782ctV
    public void AuCTel(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.finit = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void AuCTelauCTel(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.AxsJAY = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void AubY(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.iwGUEr = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AwvSrB(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.EZpvd = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void AxsJAY(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.gGvvIC = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC12782ctV
    public boolean AxsJAYaxsJAY() {
        return this.AkhnZx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC12782ctV
    public java.util.ArrayList<ChainAddress> AxsJAYsNCnLh() {
        return this.ejfBZ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC12782ctV
    public long DAIeex() {
        return this.fARcdN;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC12782ctV
    public java.lang.String DCUTEI() {
        return this.AxsJAY;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String DWgRXt() {
        return this.finit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC12782ctV
    public boolean DXXBbs() {
        return this.AubY;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC12782ctV
    public WalletType DarRvM() {
        return this.hDKMBd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC12782ctV, o.InterfaceC9738bbJ
    public java.lang.String DbNXlk() {
        return this.wlaJM;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void DbNXlk(java.lang.Long l) {
        this.fFgQHt = l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String DcqEDu() {
        return this.dxcTrN;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void EZpvd(int i) {
        this.UeEOUB = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void EZpvd(@NotNull java.util.ArrayList<ChainAddress> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        this.valueOf = arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(@NotNull java.util.List<C10854bwM> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.DbNXlk = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void EZpvd(C13852daR c13852daR) {
        this.getFieldNames = c13852daR;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC12782ctV
    public void EZpvd(boolean z) {
        this.gEmmrt = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String KDccX() {
        return this.fZBcTu;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void KWHzl(@NotNull WalletType walletType) {
        Intrinsics.checkNotNullParameter(walletType, "");
        this.hDKMBd = walletType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void KWHzl(@NotNull java.util.ArrayList<ChainAddress> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        this.AhwBna = arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC12782ctV
    public C13852daR ODWQjV() {
        return this.getFieldNames;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC12782ctV
    public java.util.List<C10594brR> ODXsMY() {
        return this.aKErDB;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC12782ctV
    public java.util.List<C10525bqB> OHqIaq() {
        return this.dNCPSb;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC12782ctV
    public void OLrzqt(int i) {
        this.KWHzl = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void OLrzqt(@NotNull IdentifierType identifierType) {
        Intrinsics.checkNotNullParameter(identifierType, "");
        this.AuCTelauCTel = identifierType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void OLrzqt(@NotNull AAStatus aAStatus) {
        Intrinsics.checkNotNullParameter(aAStatus, "");
        this.AEQbTJ = aAStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void OLrzqt(@NotNull java.util.ArrayList<ChainAddress> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        this.AYXKKw = arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC12782ctV
    public void OLrzqt(boolean z) {
        this.AkhnZx = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC12782ctV
    public java.lang.String OqFWZa() {
        return this.zsXlph;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC12782ctV
    public boolean OuxcSI() {
        return this.AwvSrB;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC12782ctV
    public int QCjLjM() {
        return this.UeEOUB;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC12782ctV
    public MpcWalletEncodeInfo QSBOWP() {
        return this.sSMYrx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC12782ctV
    public java.lang.Long QSLkRj() {
        return this.fFgQHt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC12782ctV
    public java.util.List<C10594brR> QkdxfA() {
        return this.fIwbmz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC12782ctV
    public WalletType QwvEab() {
        return this.fvQaOB;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC12782ctV
    public java.util.List<C10854bwM> RKDWNf() {
        return this.DTwDnp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC12782ctV
    public java.util.List<C10527bqD> RdAHlO() {
        return this.getNewProxyInstance;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC12782ctV
    public java.lang.String RlQdEF() {
        return this.iwGUEr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC12782ctV
    public java.lang.String USBtdM() {
        return this.gGvvIC;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.util.ArrayList<ChainAddress> WS() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC12782ctV
    public java.lang.String aUsmxb() {
        return this.flVtFt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC12782ctV
    public java.lang.String accept() {
        return this.AuCTel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<C10525bqB> call() {
        return this.isConnected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC12782ctV
    public void copydefault(@NotNull WalletType walletType) {
        Intrinsics.checkNotNullParameter(walletType, "");
        this.fvQaOB = walletType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC12782ctV
    public void copydefault(@NotNull IdentifierTypeNostrFixStatus identifierTypeNostrFixStatus) {
        Intrinsics.checkNotNullParameter(identifierTypeNostrFixStatus, "");
        this.QUSxYX = identifierTypeNostrFixStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC12782ctV
    public void copydefault(AbstractC12784ctX abstractC12784ctX) {
        this.QVAiDq = abstractC12784ctX;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC12782ctV
    public void copydefault(boolean z) {
        this.zLjUOn = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC12782ctV
    public java.lang.String dHguZz() {
        return this.QbewEr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC12782ctV
    public int dmfpNf() {
        return this.QKVWgx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC12782ctV, o.InterfaceC9738bbJ
    public java.util.List<C10528bqE> fARcdN() {
        return this.ORxRYg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC12782ctV
    public void fARcdN(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.OcIXYQ = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC12782ctV
    public AAStatus fFgQHt() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String fHqPtx() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC12782ctV
    public void fJNWhG(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.fZBcTu = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC12782ctV
    public boolean ffGIBT() {
        return this.zLjUOn;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC12782ctV
    public int finit() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC12782ctV
    public long flVtFt() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC12782ctV
    public void gEmmrt(boolean z) {
        this.AwvSrB = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void gHZMYf(java.lang.String str) {
        this.QbewEr = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC12782ctV
    public boolean gasjUx() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC12782ctV
    public void getNewProxyInstance(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.dxcTrN = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC12782ctV
    public IdentifierType getPostValueLengthLimit() {
        return this.AuCTelauCTel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC12782ctV
    public java.util.ArrayList<ChainAddress> giSNqX() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC12782ctV
    public AbstractC12784ctX gwTjWJ() {
        return this.QVAiDq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC12782ctV
    public IdentifierTypeNostrFixStatus hBpjJd() {
        return this.QUSxYX;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC12782ctV
    public void hDKMBd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.dvKsVJ = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC12782ctV
    public java.util.List<C10525bqB> iRxXKY() {
        return this.values;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC12782ctV
    public java.util.List<C10854bwM> iZzfmt() {
        return this.DbNXlk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC12782ctV
    public boolean ixgjPv() {
        return this.zuBGHE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.util.ArrayList<ChainAddress> run() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void sSMYrx(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.flVtFt = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void uzCIH(long j) {
        this.djBIcL = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void valueOf(boolean z) {
        this.AubY = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void wlaJM(long j) {
        this.fARcdN = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void wlaJM(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.AuCTel = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void zLjUOn(java.lang.String str) {
        this.zsXlph = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void zsXlph(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.wlaJM = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC12782ctV
    public boolean zuWLRA() {
        return this.gHZMYf;
    }

    public static final class Activity<T> implements java.util.Comparator {
        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return yET.KWHzl(java.lang.Integer.valueOf(((C10854bwM) t).QfsBiF()), java.lang.Integer.valueOf(((C10854bwM) t2).QfsBiF()));
        }
    }

    public static final class Application<T> implements java.util.Comparator {
        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return yET.KWHzl(java.lang.Integer.valueOf(((C10854bwM) t).QfsBiF()), java.lang.Integer.valueOf(((C10854bwM) t2).QfsBiF()));
        }
    }

    public cCS() {
        AbstractC12784ctX abstractC12784ctXGwTjWJ = gwTjWJ();
        this.sSMYrx = abstractC12784ctXGwTjWJ != null ? abstractC12784ctXGwTjWJ.isConnected() : null;
        this.OcIXYQ = "";
        this.hDKMBd = WalletType.AAWallet;
        this.gHZMYf = true;
        this.UeEOUB = WalletSyncStatus.NotSync.getValue();
        this.AEQbTJ = AAStatus.Normal;
        this.QUSxYX = IdentifierTypeNostrFixStatus.IDENTIFIER_TYPE_NOSTR_FIXSTATUSDEFAULT;
        this.AuCTelauCTel = IdentifierType.IDENTIFIER_TYPE_DEFAULT;
        this.QbewEr = "";
        this.fFgQHt = 0L;
        this.AuCTel = "";
        this.RJOkX = new java.util.ArrayList<>();
        this.dvKsVJ = "";
        this.dxcTrN = "";
        this.fZBcTu = "";
        this.finit = "";
        this.OLrzqt = yDY.AhwBna();
        this.isConnected = yDY.AhwBna();
        this.values = yDY.AhwBna();
        this.fetchVPNInfo = C56424yEw.KWHzl();
        this.dNCPSb = yDY.AhwBna();
        this.RcXXUw = C56424yEw.KWHzl();
        this.DTwDnp = yDY.AhwBna();
        this.DbNXlk = yDY.AhwBna();
        this.fIwbmz = new java.util.ArrayList<>();
        this.fJNWhG = new java.util.HashMap<>();
        this.aKErDB = new java.util.ArrayList<>();
        this.QfsBiF = new java.util.HashMap<>();
        this.getNewProxyInstance = new java.util.ArrayList<>();
        this.uzCIH = new java.util.HashMap<>();
        this.ORxRYg = new java.util.ArrayList<>();
        this.QOLQEE = new java.util.HashMap<>();
        this.AYXKKw = new java.util.ArrayList<>();
        this.valueOf = new java.util.ArrayList<>();
        this.AhwBna = new java.util.ArrayList<>();
        this.ejfBZ = new java.util.ArrayList<>();
    }

    @Override // o.AbstractC12782ctV, o.InterfaceC9738bbJ
    public java.lang.String ejfBZ() {
        return (java.lang.String) this.djSkpj.getValue();
    }

    public static final java.lang.String copydefault(cCS ccs) {
        if (!ccs.AubY()) {
            return "";
        }
        if (C33129mqd.OLrzqt((java.lang.CharSequence) ccs.EZpvd)) {
            return ccs.EZpvd;
        }
        return C17927fXl.KWHzl.AEQbTJ(ccs.WS());
    }

    @Override // o.AbstractC12782ctV, o.InterfaceC9738bbJ
    public java.lang.String AkhnZx() {
        java.lang.String strCopydefault;
        if (QwvEab() == WalletType.DemoWallet) {
            return C33070mpX.AYXKKw(C13754dXa.FragmentManager.getOnBackInvokedDispatcher);
        }
        if (OuxcSI()) {
            return this.OcIXYQ;
        }
        int i = StateListAnimator.KWHzl[QwvEab().ordinal()];
        if (i != 1) {
            if (i != 2) {
                return this.OcIXYQ;
            }
            C14079deg c14079deg = C14079deg.EZpvd;
            ChainAddress chainAddressAddressFromChainId$default = AbstractC12782ctV.addressFromChainId$default(this, flVtFt(), null, 2, null);
            return C14079deg.getAddressStr$default(c14079deg, chainAddressAddressFromChainId$default != null ? chainAddressAddressFromChainId$default.getAddress() : null, false, 2, null);
        }
        C10854bwM c10854bwMKWHzl = C10954byG.EZpvd.valueOf().KWHzl(flVtFt());
        if (c10854bwMKWHzl != null && c10854bwMKWHzl.dxcTrN()) {
            return this.OcIXYQ;
        }
        if (c10854bwMKWHzl != null && c10854bwMKWHzl.QCjLjM() && getPostValueLengthLimit() == IdentifierType.IDENTIFIER_TYPE_NOSTR_KEY_WALLET_TYPE && hBpjJd() == IdentifierTypeNostrFixStatus.IDENTIFIER_TYPE_NOSTR_KEYWALLETTYPEHDEXPORT) {
            return this.OcIXYQ;
        }
        if (c10854bwMKWHzl != null && c10854bwMKWHzl.OuxcSI()) {
            C14079deg c14079deg2 = C14079deg.EZpvd;
            C13852daR c13852daRODWQjV = ODWQjV();
            if (c13852daRODWQjV == null || (strCopydefault = c13852daRODWQjV.copydefault()) == null) {
                strCopydefault = "";
            }
            return C14079deg.getAddressStr$default(c14079deg2, strCopydefault, false, 2, null);
        }
        C14079deg c14079deg3 = C14079deg.EZpvd;
        ChainAddress chainAddressAddressFromChainId$default2 = AbstractC12782ctV.addressFromChainId$default(this, flVtFt(), null, 2, null);
        return C14079deg.getAddressStr$default(c14079deg3, chainAddressAddressFromChainId$default2 != null ? chainAddressAddressFromChainId$default2.getAddress() : null, false, 2, null);
    }

    @Override // o.InterfaceC9738bbJ
    public boolean djBIcL() {
        SingleTeeStatusAndWarringInfo singleTeeStatusAndWarringInfoOJuSTm;
        SingleTeeStatus singleTeeStatus;
        TeeStatus teeStatus;
        return (!AubY() || !zLjUOn() || (singleTeeStatusAndWarringInfoOJuSTm = OJuSTm()) == null || (singleTeeStatus = singleTeeStatusAndWarringInfoOJuSTm.getSingleTeeStatus()) == null || (teeStatus = singleTeeStatus.getTeeStatus()) == null || teeStatus.isCreated()) ? false : true;
    }

    @Override // o.InterfaceC9738bbJ
    public boolean QbewEr() {
        SingleTeeStatusAndWarringInfo singleTeeStatusAndWarringInfoOJuSTm;
        SingleTeeStatus singleTeeStatus;
        TeeStatus teeStatus;
        return (!AubY() || (singleTeeStatusAndWarringInfoOJuSTm = OJuSTm()) == null || (singleTeeStatus = singleTeeStatusAndWarringInfoOJuSTm.getSingleTeeStatus()) == null || (teeStatus = singleTeeStatus.getTeeStatus()) == null || !teeStatus.isCreated()) ? false : true;
    }

    @Override // o.InterfaceC9738bbJ
    public boolean RJOkX() {
        SingleTeeStatusAndWarringInfo singleTeeStatusAndWarringInfoOJuSTm;
        SingleTeeStatus singleTeeStatus;
        TeeStatus teeStatus;
        return (!AubY() || (singleTeeStatusAndWarringInfoOJuSTm = OJuSTm()) == null || (singleTeeStatus = singleTeeStatusAndWarringInfoOJuSTm.getSingleTeeStatus()) == null || (teeStatus = singleTeeStatus.getTeeStatus()) == null || !teeStatus.isCreated()) ? false : true;
    }

    @Override // o.InterfaceC9738bbJ
    public boolean DTwDnp() {
        SingleTeeStatusAndWarringInfo singleTeeStatusAndWarringInfoOJuSTm;
        SingleTeeStatus singleTeeStatus;
        TeeStatus teeStatus;
        return (!AubY() || (singleTeeStatusAndWarringInfoOJuSTm = OJuSTm()) == null || (singleTeeStatus = singleTeeStatusAndWarringInfoOJuSTm.getSingleTeeStatus()) == null || (teeStatus = singleTeeStatus.getTeeStatus()) == null || !teeStatus.isActive()) ? false : true;
    }

    @Override // o.InterfaceC9738bbJ
    public boolean QUSxYX() {
        SingleTeeStatus singleTeeStatus;
        TeeStatus teeStatus;
        if (AubY()) {
            SingleTeeStatusAndWarringInfo singleTeeStatusAndWarringInfoOJuSTm = OJuSTm();
            if (((singleTeeStatusAndWarringInfoOJuSTm == null || (singleTeeStatus = singleTeeStatusAndWarringInfoOJuSTm.getSingleTeeStatus()) == null || (teeStatus = singleTeeStatus.getTeeStatus()) == null) ? 0L : teeStatus.getExpiredTimestamp()) > java.lang.System.currentTimeMillis()) {
                return false;
            }
        }
        return true;
    }

    @Override // o.InterfaceC9738bbJ
    public long fIwbmz() {
        SingleTeeStatus singleTeeStatus;
        TeeStatus teeStatus;
        SingleTeeStatusAndWarringInfo singleTeeStatusAndWarringInfoOJuSTm = OJuSTm();
        if (singleTeeStatusAndWarringInfoOJuSTm == null || (singleTeeStatus = singleTeeStatusAndWarringInfoOJuSTm.getSingleTeeStatus()) == null || (teeStatus = singleTeeStatus.getTeeStatus()) == null) {
            return 0L;
        }
        return teeStatus.getExpiredTimestamp();
    }

    @Override // o.InterfaceC9738bbJ
    public boolean AuCTel() {
        SingleTeeStatus singleTeeStatus;
        TeeStatus teeStatus;
        SingleTeeStatusAndWarringInfo singleTeeStatusAndWarringInfoOJuSTm = OJuSTm();
        if (singleTeeStatusAndWarringInfoOJuSTm == null || (singleTeeStatus = singleTeeStatusAndWarringInfoOJuSTm.getSingleTeeStatus()) == null || (teeStatus = singleTeeStatus.getTeeStatus()) == null) {
            return false;
        }
        return teeStatus.getUserDisable();
    }

    @Override // o.InterfaceC9738bbJ
    public boolean OLrzqt() {
        SingleTeeStatusAndWarringInfo singleTeeStatusAndWarringInfoOJuSTm = OJuSTm();
        return singleTeeStatusAndWarringInfoOJuSTm != null && singleTeeStatusAndWarringInfoOJuSTm.getCanUseSa2();
    }

    @Override // o.InterfaceC9738bbJ
    public boolean KWHzl() {
        SingleTeeStatus singleTeeStatus;
        TeeStatus teeStatus;
        java.lang.Boolean autoRenew;
        SingleTeeStatusAndWarringInfo singleTeeStatusAndWarringInfoOJuSTm = OJuSTm();
        if (singleTeeStatusAndWarringInfoOJuSTm == null || (singleTeeStatus = singleTeeStatusAndWarringInfoOJuSTm.getSingleTeeStatus()) == null || (teeStatus = singleTeeStatus.getTeeStatus()) == null || (autoRenew = teeStatus.getAutoRenew()) == null) {
            return false;
        }
        return autoRenew.booleanValue();
    }

    @Override // o.InterfaceC9738bbJ
    public int uzCIH() {
        SingleTeeStatus singleTeeStatus;
        TeeStatus teeStatus;
        java.lang.Integer upgradeStatus;
        SingleTeeStatusAndWarringInfo singleTeeStatusAndWarringInfoOJuSTm = OJuSTm();
        if (singleTeeStatusAndWarringInfoOJuSTm == null || (singleTeeStatus = singleTeeStatusAndWarringInfoOJuSTm.getSingleTeeStatus()) == null || (teeStatus = singleTeeStatus.getTeeStatus()) == null || (upgradeStatus = teeStatus.getUpgradeStatus()) == null) {
            return 0;
        }
        return upgradeStatus.intValue();
    }

    @Override // o.AbstractC12782ctV
    public boolean QKudOq() {
        java.util.ArrayList<ChainAddress> arrayListWS = WS();
        if (!(arrayListWS instanceof java.util.Collection) || !arrayListWS.isEmpty()) {
            java.util.Iterator<T> it = arrayListWS.iterator();
            while (it.hasNext()) {
                C10854bwM c10854bwMKWHzl = C10954byG.EZpvd.valueOf().KWHzl(((ChainAddress) it.next()).getCoinId());
                if (c10854bwMKWHzl != null && c10854bwMKWHzl.fetchVPNInfo() == 607) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // o.AbstractC12782ctV
    public boolean htlTjW() {
        return getFieldNames() && fFgQHt() != AAStatus.Normal;
    }

    public final void OLrzqt(@NotNull java.util.List<C10525bqB> list) {
        Intrinsics.checkNotNullParameter(list, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (C10525bqB c10525bqB : list) {
            if (djBIcL(java.lang.Long.valueOf(c10525bqB.OLrzqt()))) {
                arrayList.add(c10525bqB);
            }
        }
        this.OLrzqt = arrayList;
    }

    public final void KWHzl(@NotNull java.util.List<C10525bqB> list) {
        Intrinsics.checkNotNullParameter(list, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (C10525bqB c10525bqB : list) {
            if (djBIcL(java.lang.Long.valueOf(c10525bqB.OLrzqt()))) {
                arrayList.add(c10525bqB);
            }
        }
        this.isConnected = arrayList;
    }

    public final void copydefault(@NotNull java.util.List<C10525bqB> list) {
        Intrinsics.checkNotNullParameter(list, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (C10525bqB c10525bqB : list) {
            if (djBIcL(java.lang.Long.valueOf(c10525bqB.OLrzqt()))) {
                arrayList.add(c10525bqB);
            }
        }
        this.values = arrayList;
    }

    public final void AEQbTJ(@NotNull java.util.Map<java.lang.Long, ? extends java.util.List<C10525bqB>> map) {
        Intrinsics.checkNotNullParameter(map, "");
        java.util.HashMap map2 = new java.util.HashMap();
        for (Map.Entry<java.lang.Long, ? extends java.util.List<C10525bqB>> entry : map.entrySet()) {
            if (djBIcL(entry.getKey())) {
                map2.put(entry.getKey(), entry.getValue());
            }
        }
        this.fetchVPNInfo = map2;
    }

    public final void AYXKKw(@NotNull java.util.List<C10525bqB> list) {
        Intrinsics.checkNotNullParameter(list, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (C10525bqB c10525bqB : list) {
            if (djBIcL(java.lang.Long.valueOf(c10525bqB.OLrzqt()))) {
                arrayList.add(c10525bqB);
            }
        }
        this.dNCPSb = arrayList;
    }

    public final void EZpvd(@NotNull java.util.Map<java.lang.Long, ? extends java.util.List<C10525bqB>> map) {
        Intrinsics.checkNotNullParameter(map, "");
        java.util.HashMap map2 = new java.util.HashMap();
        for (Map.Entry<java.lang.Long, ? extends java.util.List<C10525bqB>> entry : map.entrySet()) {
            if (djBIcL(entry.getKey())) {
                map2.put(entry.getKey(), entry.getValue());
            }
        }
        this.RcXXUw = map2;
    }

    @Override // o.AbstractC12782ctV
    public boolean zblBkD() {
        return (AwvSrB() || QfsBiF() || AEQbTJ(WalletType.KeyWallet)) && !C10954byG.EZpvd.valueOf().AhwBna(flVtFt());
    }

    @Override // o.AbstractC12782ctV
    public boolean igXuih() {
        C10854bwM c10854bwMAhwBna = C10954byG.EZpvd.valueOf().AhwBna();
        return gEmmrt(c10854bwMAhwBna != null ? java.lang.Long.valueOf(c10854bwMAhwBna.AhwBna()) : null);
    }

    @Override // o.AbstractC12782ctV, o.InterfaceC9738bbJ
    public boolean AubY() {
        return QwvEab() == WalletType.HDWallet;
    }

    @Override // o.AbstractC12782ctV, o.InterfaceC9738bbJ
    public boolean AwvSrB() {
        return QwvEab() == WalletType.KeyWallet;
    }

    @Override // o.AbstractC12782ctV, o.InterfaceC9738bbJ
    public boolean UeEOUB() {
        return QwvEab() == WalletType.ConnectWallet;
    }

    @Override // o.AbstractC12782ctV, o.InterfaceC9738bbJ
    public boolean QfsBiF() {
        return QwvEab() == WalletType.TrackingWallet;
    }

    @Override // o.AbstractC12782ctV, o.InterfaceC9738bbJ
    public boolean zsXlph() {
        return QwvEab() == WalletType.DemoWallet;
    }

    @Override // o.AbstractC12782ctV, o.InterfaceC9738bbJ
    public boolean QVAiDq() {
        return QwvEab() == WalletType.TonWallet;
    }

    @Override // o.AbstractC12782ctV, o.InterfaceC9738bbJ
    public boolean gHZMYf() {
        return QwvEab() == WalletType.HardwareWallet;
    }

    @Override // o.AbstractC12782ctV, o.InterfaceC9738bbJ
    public boolean sSMYrx() {
        return heceqZ() || UrRBLY();
    }

    public boolean heceqZ() {
        AbstractC12784ctX abstractC12784ctXGwTjWJ;
        return gHZMYf() && (abstractC12784ctXGwTjWJ = gwTjWJ()) != null && abstractC12784ctXGwTjWJ.iwGUEr();
    }

    public boolean UrRBLY() {
        AbstractC12784ctX abstractC12784ctXGwTjWJ;
        return gHZMYf() && (abstractC12784ctXGwTjWJ = gwTjWJ()) != null && abstractC12784ctXGwTjWJ.hDKMBd();
    }

    @Override // o.AbstractC12782ctV, o.InterfaceC9738bbJ
    public boolean AxsJAY() {
        AbstractC12784ctX abstractC12784ctXGwTjWJ;
        return gHZMYf() && (abstractC12784ctXGwTjWJ = gwTjWJ()) != null && abstractC12784ctXGwTjWJ.getFieldNames();
    }

    @Override // o.AbstractC12782ctV, o.InterfaceC9738bbJ
    public boolean zuBGHE() {
        AbstractC12784ctX abstractC12784ctXGwTjWJ;
        return gHZMYf() && (abstractC12784ctXGwTjWJ = gwTjWJ()) != null && abstractC12784ctXGwTjWJ.zsXlph();
    }

    @Override // o.AbstractC12782ctV, o.InterfaceC9738bbJ
    public boolean ORxRYg() {
        return QwvEab() == WalletType.MPCWallet;
    }

    @Override // o.AbstractC12782ctV, o.InterfaceC9738bbJ
    public boolean getFieldNames() {
        return QwvEab() == WalletType.AAWallet;
    }

    @Override // o.AbstractC12782ctV, o.InterfaceC9738bbJ
    public boolean wlaJM() {
        return AEQbTJ(WalletType.MPCWallet);
    }

    @Override // o.AbstractC12782ctV, o.InterfaceC9738bbJ
    public boolean iwGUEr() {
        return AEQbTJ(WalletType.HardwareWallet);
    }

    @Override // o.AbstractC12782ctV
    public boolean AEQbTJ(@NotNull WalletType walletType) {
        Intrinsics.checkNotNullParameter(walletType, "");
        return getFieldNames() && DarRvM() == walletType;
    }

    @Override // o.AbstractC12782ctV
    public boolean fdOvFl() {
        return getFieldNames() || (QfsBiF() && DarRvM() == WalletType.TrackingWallet);
    }

    @Override // o.AbstractC12782ctV, o.InterfaceC9738bbJ
    public boolean AuCTelauCTel() {
        if (AubY()) {
            return true;
        }
        java.util.ArrayList<ChainAddress> arrayListWS = WS();
        if (!(arrayListWS instanceof java.util.Collection) || !arrayListWS.isEmpty()) {
            java.util.Iterator<T> it = arrayListWS.iterator();
            while (it.hasNext()) {
                C10854bwM c10854bwMKWHzl = C10954byG.EZpvd.valueOf().KWHzl(((ChainAddress) it.next()).getCoinId());
                if (c10854bwMKWHzl != null && c10854bwMKWHzl.ejfBZ()) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // o.AbstractC12782ctV, o.InterfaceC9738bbJ
    public boolean QOLQEE() {
        if (AubY()) {
            return true;
        }
        java.util.ArrayList<ChainAddress> arrayListWS = WS();
        if (!(arrayListWS instanceof java.util.Collection) || !arrayListWS.isEmpty()) {
            java.util.Iterator<T> it = arrayListWS.iterator();
            while (it.hasNext()) {
                C10854bwM c10854bwMKWHzl = C10954byG.EZpvd.valueOf().KWHzl(((ChainAddress) it.next()).getCoinId());
                if (c10854bwMKWHzl != null && c10854bwMKWHzl.fARcdN()) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // o.AbstractC12782ctV
    public boolean fjfviF() {
        if (AubY()) {
            return true;
        }
        java.util.ArrayList<ChainAddress> arrayListWS = WS();
        if (!(arrayListWS instanceof java.util.Collection) || !arrayListWS.isEmpty()) {
            java.util.Iterator<T> it = arrayListWS.iterator();
            while (it.hasNext()) {
                C10854bwM c10854bwMKWHzl = C10954byG.EZpvd.valueOf().KWHzl(((ChainAddress) it.next()).getCoinId());
                if (c10854bwMKWHzl != null && c10854bwMKWHzl.fIwbmz()) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // o.AbstractC12782ctV
    public boolean dUDNAs() {
        java.lang.Object next;
        if (!AubY()) {
            if (!AxsJAY() && !zuBGHE()) {
                java.util.ArrayList<ChainAddress> arrayListWS = WS();
                if (!(arrayListWS instanceof java.util.Collection) || !arrayListWS.isEmpty()) {
                    for (ChainAddress chainAddress : arrayListWS) {
                        java.util.Iterator<T> it = C10954byG.EZpvd.valueOf().OLrzqt().iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it.next();
                            if (chainAddress.getCoinId() == ((C10854bwM) next).AhwBna()) {
                                break;
                            }
                        }
                        if (next != null) {
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // o.AbstractC12782ctV
    public boolean DGOPHZ() {
        return AubY() || AwvSrB() || ORxRYg() || sSMYrx() || AxsJAY() || zuBGHE();
    }

    @Override // o.AbstractC12782ctV
    public boolean DCUTEIdCUTEI() {
        MpcWalletEncodeInfo mpcWalletEncodeInfoQSBOWP;
        return (ORxRYg() || AEQbTJ(WalletType.MPCWallet)) && (mpcWalletEncodeInfoQSBOWP = QSBOWP()) != null && mpcWalletEncodeInfoQSBOWP.isEscape() == 1;
    }

    @Override // o.AbstractC12782ctV
    public boolean Dmq() {
        MpcWalletEncodeInfo mpcWalletEncodeInfoQSBOWP;
        return (ORxRYg() || AEQbTJ(WalletType.MPCWallet)) && (mpcWalletEncodeInfoQSBOWP = QSBOWP()) != null && mpcWalletEncodeInfoQSBOWP.getStatus() == MpcShare2Status.SHARE2_VALID.getValue();
    }

    @Override // o.AbstractC12782ctV
    public boolean fERRXa() {
        MpcWalletEncodeInfo mpcWalletEncodeInfoQSBOWP;
        java.util.List<java.lang.String> copiedEscapeList;
        return ORxRYg() && (mpcWalletEncodeInfoQSBOWP = QSBOWP()) != null && (copiedEscapeList = mpcWalletEncodeInfoQSBOWP.getCopiedEscapeList()) != null && copiedEscapeList.contains(C33129mqd.gEmmrt(java.lang.Integer.valueOf(finit())));
    }

    @Override // o.AbstractC12782ctV
    public boolean KWHzl(boolean z) {
        return (!z || AuCTelauCTel()) && (AubY() || AwvSrB() || (ORxRYg() && Dmq()));
    }

    @Override // o.AbstractC12782ctV, o.InterfaceC9738bbJ
    public java.lang.String fetchVPNInfo() {
        java.lang.String strDbNXlk;
        if (AuCTelauCTel() && !UeEOUB()) {
            return "android.resource://" + C9678baC.Companion.AEQbTJ().getApplicationContext().getPackageName() + "/" + C52761wXj.TaskDescription.ZAwExL;
        }
        C10854bwM c10854bwMKWHzl = C10954byG.EZpvd.valueOf().KWHzl(java.lang.Long.valueOf(flVtFt()));
        return (c10854bwMKWHzl == null || (strDbNXlk = c10854bwMKWHzl.DbNXlk()) == null) ? "" : strDbNXlk;
    }

    public final boolean gEmmrt(java.lang.Long l) {
        java.lang.Object next;
        if (!AubY()) {
            java.util.Iterator<T> it = WS().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                long coinId = ((ChainAddress) next).getCoinId();
                if (l != null && coinId == l.longValue()) {
                    break;
                }
            }
            if (next != null) {
                return true;
            }
        }
        return false;
    }

    @Override // o.AbstractC12782ctV
    public boolean DbNXlk(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        java.util.ArrayList<ChainAddress> arrayListWS = WS();
        if (!(arrayListWS instanceof java.util.Collection) || !arrayListWS.isEmpty()) {
            java.util.Iterator<T> it = arrayListWS.iterator();
            while (it.hasNext()) {
                if (C59449zhJ.gEmmrt(((ChainAddress) it.next()).getAddress(), str, true)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // o.AbstractC12782ctV
    public boolean AhwBna(java.lang.Long l) {
        java.lang.Object next;
        java.util.Iterator<T> it = WS().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            long coinId = ((ChainAddress) next).getCoinId();
            if (l != null && coinId == l.longValue()) {
                break;
            }
        }
        return next != null;
    }

    @Override // o.AbstractC12782ctV, o.InterfaceC9738bbJ
    public boolean KWHzl(java.lang.Long l) {
        java.lang.Object obj;
        java.util.Iterator<T> it = WS().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            java.lang.Object next = it.next();
            C10854bwM c10854bwMKWHzl = C10954byG.EZpvd.valueOf().KWHzl(((ChainAddress) next).getCoinId());
            if (Intrinsics.EZpvd(c10854bwMKWHzl != null ? java.lang.Long.valueOf(c10854bwMKWHzl.fetchVPNInfo()) : null, l)) {
                obj = next;
                break;
            }
        }
        return obj != null;
    }

    @Override // o.AbstractC12782ctV, o.InterfaceC9738bbJ
    public boolean EZpvd(java.lang.Long l) {
        return KWHzl(l) || isConnected(l);
    }

    public boolean isConnected(java.lang.Long l) {
        java.lang.Object objValueOf;
        CustomChainCoinMeta customChainCoinMetaEZpvd;
        java.util.Iterator<T> it = AxsJAYsNCnLh().iterator();
        while (true) {
            objValueOf = null;
            if (!it.hasNext()) {
                break;
            }
            java.lang.Object next = it.next();
            CustomChainCoinMeta customChainCoinMetaOLrzqt = C10598brV.AEQbTJ.OLrzqt(((ChainAddress) next).getCoinId());
            if (customChainCoinMetaOLrzqt != null && (customChainCoinMetaEZpvd = customChainCoinMetaOLrzqt.EZpvd()) != null) {
                objValueOf = java.lang.Long.valueOf(customChainCoinMetaEZpvd.copydefault());
            }
            if (Intrinsics.EZpvd(objValueOf, l)) {
                objValueOf = next;
                break;
            }
        }
        return objValueOf != null;
    }

    @Override // o.AbstractC12782ctV, o.InterfaceC9738bbJ
    public boolean AkhnZx(long j) {
        if (AubY()) {
            return true;
        }
        return EZpvd(java.lang.Long.valueOf(j));
    }

    @Override // o.AbstractC12782ctV, o.InterfaceC9738bbJ
    public boolean fetchVPNInfo(long j) {
        return AubY() && !EZpvd(java.lang.Long.valueOf(j));
    }

    @Override // o.AbstractC12782ctV
    public java.util.List<C10854bwM> QVsKAR() {
        if (AubY()) {
            return C10954byG.EZpvd.valueOf().values();
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (C10854bwM c10854bwM : OFhtUX()) {
            arrayList.add(c10854bwM);
            for (C10854bwM c10854bwM2 : C10954byG.EZpvd.valueOf().djBIcL(c10854bwM.AEQbTJ())) {
                if (djBIcL(java.lang.Long.valueOf(c10854bwM2.AhwBna()))) {
                    arrayList.add(c10854bwM2);
                }
            }
        }
        if (arrayList.size() > 1) {
            C56407yEf.copydefault(arrayList, new Activity());
        }
        return arrayList;
    }

    @Override // o.InterfaceC9738bbJ
    public java.util.List<InterfaceC9731bbC> RcXXUw() {
        return OFhtUX();
    }

    @Override // o.AbstractC12782ctV
    public java.util.List<C10854bwM> OFhtUX() {
        java.lang.Object next;
        if (AubY()) {
            return C10954byG.EZpvd.valueOf().djBIcL();
        }
        if (ORxRYg()) {
            java.util.List<C10854bwM> listDjBIcL = C10954byG.EZpvd.valueOf().djBIcL();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : listDjBIcL) {
                if (((C10854bwM) obj).hrNTAI()) {
                    arrayList.add(obj);
                }
            }
            return arrayList;
        }
        if (!getFieldNames()) {
            if (gHZMYf()) {
                java.util.ArrayList<ChainAddress> arrayListWS = WS();
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.util.Iterator<T> it = arrayListWS.iterator();
                while (it.hasNext()) {
                    C10854bwM c10854bwMKWHzl = C10954byG.EZpvd.valueOf().KWHzl(((ChainAddress) it.next()).getCoinId());
                    if (c10854bwMKWHzl != null) {
                        arrayList2.add(c10854bwMKWHzl);
                    }
                }
                return arrayList2;
            }
            C10954byG c10954byG = C10954byG.EZpvd;
            C10854bwM c10854bwMKWHzl2 = c10954byG.valueOf().KWHzl(flVtFt());
            if (c10854bwMKWHzl2 != null && c10854bwMKWHzl2.ejfBZ()) {
                if (QfsBiF() && DarRvM() == WalletType.TrackingWallet) {
                    java.util.List<C10854bwM> listOLrzqt = c10954byG.valueOf().OLrzqt();
                    java.util.ArrayList arrayList3 = new java.util.ArrayList();
                    for (java.lang.Object obj2 : listOLrzqt) {
                        if (((C10854bwM) obj2).ejfBZ()) {
                            arrayList3.add(obj2);
                        }
                    }
                    return arrayList3;
                }
                return c10954byG.valueOf().DbNXlk();
            }
            C10854bwM c10854bwMKWHzl3 = c10954byG.valueOf().KWHzl(flVtFt());
            if (c10854bwMKWHzl3 != null && c10854bwMKWHzl3.fARcdN()) {
                return c10954byG.valueOf().OLrzqt(4);
            }
            C10854bwM c10854bwMKWHzl4 = c10954byG.valueOf().KWHzl(flVtFt());
            if (c10854bwMKWHzl4 != null && c10854bwMKWHzl4.fIwbmz()) {
                return c10954byG.valueOf().OLrzqt(5);
            }
            C10854bwM c10854bwMKWHzl5 = c10954byG.valueOf().KWHzl(flVtFt());
            if (c10854bwMKWHzl5 != null && c10854bwMKWHzl5.iRxXKY()) {
                return c10954byG.valueOf().OLrzqt(6);
            }
            C10854bwM c10854bwMKWHzl6 = c10954byG.valueOf().KWHzl(flVtFt());
            return c10854bwMKWHzl6 != null ? yDY.copydefault(c10854bwMKWHzl6) : new java.util.ArrayList();
        }
        int i = StateListAnimator.KWHzl[DarRvM().ordinal()];
        if (i == 3) {
            return C10954byG.EZpvd.valueOf().OLrzqt();
        }
        if (i == 4) {
            java.util.List<C10854bwM> listOLrzqt2 = C10954byG.EZpvd.valueOf().OLrzqt();
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            for (java.lang.Object obj3 : listOLrzqt2) {
                if (((C10854bwM) obj3).hrNTAI()) {
                    arrayList4.add(obj3);
                }
            }
            return arrayList4;
        }
        java.lang.Object obj4 = null;
        if (i == 5) {
            java.util.ArrayList<ChainAddress> arrayListWS2 = WS();
            java.util.ArrayList arrayList5 = new java.util.ArrayList();
            for (ChainAddress chainAddress : arrayListWS2) {
                java.util.Iterator<T> it2 = C10954byG.EZpvd.valueOf().OLrzqt().iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it2.next();
                    if (chainAddress.getCoinId() == ((C10854bwM) next).AhwBna()) {
                        break;
                    }
                }
                C10854bwM c10854bwM = (C10854bwM) next;
                if (c10854bwM != null) {
                    arrayList5.add(c10854bwM);
                }
            }
            return arrayList5;
        }
        C10954byG c10954byG2 = C10954byG.EZpvd;
        C10854bwM c10854bwMKWHzl7 = c10954byG2.valueOf().KWHzl(flVtFt());
        if (c10854bwMKWHzl7 != null && c10854bwMKWHzl7.ejfBZ()) {
            java.util.List<C10854bwM> listOLrzqt3 = c10954byG2.valueOf().OLrzqt();
            java.util.ArrayList arrayList6 = new java.util.ArrayList();
            for (java.lang.Object obj5 : listOLrzqt3) {
                if (((C10854bwM) obj5).ejfBZ()) {
                    arrayList6.add(obj5);
                }
            }
            return arrayList6;
        }
        java.util.Iterator<T> it3 = c10954byG2.valueOf().OLrzqt().iterator();
        while (true) {
            if (!it3.hasNext()) {
                break;
            }
            java.lang.Object next2 = it3.next();
            if (flVtFt() == ((C10854bwM) next2).AhwBna()) {
                obj4 = next2;
                break;
            }
        }
        C10854bwM c10854bwM2 = (C10854bwM) obj4;
        return c10854bwM2 != null ? yDY.copydefault(c10854bwM2) : new java.util.ArrayList();
    }

    @Override // o.AbstractC12782ctV
    public java.util.List<C10854bwM> hUfVAv() {
        return C59467zhb.zuBGHE(C59467zhb.KWHzl(C59467zhb.fJNWhG(C59467zhb.DbNXlk(CollectionsKt___CollectionsKt.QVAiDq(WS()), new Function1() { // from class: o.cDs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Boolean.valueOf(cCS.KWHzl((ChainAddress) obj));
            }
        }), new Function1() { // from class: o.cDv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return cCS.AEQbTJ((ChainAddress) obj);
            }
        }), (java.util.Comparator) new Application()));
    }

    public static final boolean KWHzl(ChainAddress chainAddress) {
        Intrinsics.checkNotNullParameter(chainAddress, "");
        return C33129mqd.OLrzqt((java.lang.CharSequence) chainAddress.getAddress());
    }

    public static final C10854bwM AEQbTJ(ChainAddress chainAddress) {
        Intrinsics.checkNotNullParameter(chainAddress, "");
        return C10954byG.EZpvd.valueOf().KWHzl(chainAddress.getCoinId());
    }

    @Override // o.AbstractC12782ctV
    public ChainAddress copydefault(@NotNull java.lang.String str, java.lang.Long l) {
        java.lang.Object obj;
        java.lang.Object next;
        Intrinsics.checkNotNullParameter(str, "");
        java.util.Iterator<T> it = WS().iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            ChainAddress chainAddress = (ChainAddress) next;
            if (Intrinsics.EZpvd((java.lang.Object) chainAddress.getAddress(), (java.lang.Object) str)) {
                if (l == null) {
                    break;
                }
                if (l.longValue() == chainAddress.getCoinId()) {
                    break;
                }
            }
        }
        ChainAddress chainAddress2 = (ChainAddress) next;
        if (chainAddress2 != null) {
            return chainAddress2;
        }
        for (java.lang.Object obj2 : run()) {
            ChainAddress chainAddress3 = (ChainAddress) obj2;
            if (Intrinsics.EZpvd((java.lang.Object) chainAddress3.getAddress(), (java.lang.Object) str)) {
                if (l != null) {
                    if (l.longValue() == chainAddress3.getCoinId()) {
                    }
                }
                obj = obj2;
                break;
            }
        }
        return (ChainAddress) obj;
    }

    /* JADX DEBUG: Method merged with bridge method: EZpvd(JLjava/lang/Integer;)Lo/bbz; */
    @Override // o.InterfaceC9738bbJ
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public ChainAddress EZpvd(long j, java.lang.Integer num) {
        C10854bwM c10854bwMCopydefault = C10954byG.EZpvd.valueOf().copydefault(j);
        ChainAddress chainAddressOLrzqt = OLrzqt(c10854bwMCopydefault != null ? c10854bwMCopydefault.AEQbTJ() : -1L, num);
        return chainAddressOLrzqt == null ? copydefault(java.lang.Long.valueOf(j)) : chainAddressOLrzqt;
    }

    /* JADX DEBUG: Method merged with bridge method: copydefault(J)Lo/bbz; */
    @Override // o.InterfaceC9738bbJ
    /* JADX INFO: renamed from: getFieldNames, reason: merged with bridge method [inline-methods] */
    public ChainAddress copydefault(long j) {
        C10854bwM c10854bwMAEQbTJ = C10954byG.EZpvd.valueOf().AEQbTJ(j);
        if (c10854bwMAEQbTJ != null) {
            return OLrzqt(c10854bwMAEQbTJ.AEQbTJ(), (java.lang.Integer) null);
        }
        return null;
    }

    @Override // o.AbstractC12782ctV
    public ChainAddress OLrzqt(long j, java.lang.Integer num) {
        java.lang.Object obj;
        java.lang.Object next;
        java.util.Iterator<T> it = WS().iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((ChainAddress) next).getCoinId() == j) {
                break;
            }
        }
        ChainAddress chainAddress = (ChainAddress) next;
        if (num != null) {
            if (!Intrinsics.EZpvd(num, chainAddress != null ? java.lang.Integer.valueOf(chainAddress.getAddressType()) : null)) {
                java.util.Iterator<T> it2 = run().iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    java.lang.Object next2 = it2.next();
                    ChainAddress chainAddress2 = (ChainAddress) next2;
                    if (chainAddress2.getCoinId() == j && chainAddress2.getAddressType() == num.intValue()) {
                        obj = next2;
                        break;
                    }
                }
                return (ChainAddress) obj;
            }
        }
        return chainAddress;
    }

    public static final ChainAddress KWHzl(cCS ccs) {
        C10854bwM c10854bwMIsConnected = C10954byG.EZpvd.valueOf().isConnected();
        return ccs.OLrzqt(c10854bwMIsConnected != null ? c10854bwMIsConnected.AEQbTJ() : 0L, java.lang.Integer.valueOf(AddressType.Legacy.getValue()));
    }

    public static final ChainAddress EZpvd(cCS ccs) {
        return AbstractC12782ctV.addressFromChainId$default(ccs, ccs.flVtFt(), null, 2, null);
    }

    public static final ChainAddress AEQbTJ(cCS ccs) {
        C10854bwM c10854bwMCopydefault = C10954byG.EZpvd.valueOf().copydefault();
        long jAEQbTJ = c10854bwMCopydefault != null ? c10854bwMCopydefault.AEQbTJ() : 0L;
        ChainAddress chainAddressOLrzqt = ccs.OLrzqt(jAEQbTJ, java.lang.Integer.valueOf(AddressType.Bech32Type.getValue()));
        return chainAddressOLrzqt == null ? ccs.OLrzqt(jAEQbTJ, java.lang.Integer.valueOf(AddressType.Legacy.getValue())) : chainAddressOLrzqt;
    }

    @Override // o.AbstractC12782ctV, o.InterfaceC9738bbJ
    public java.lang.String AEQbTJ() {
        java.lang.String address;
        if (AubY() || ORxRYg() || getFieldNames() || AxsJAY() || zuBGHE()) {
            ChainAddress chainAddressKWHzl = KWHzl(this);
            if (chainAddressKWHzl != null) {
                return chainAddressKWHzl.getAddress();
            }
            return null;
        }
        if (AwvSrB()) {
            C10854bwM c10854bwMKWHzl = C10954byG.EZpvd.valueOf().KWHzl(java.lang.Long.valueOf(flVtFt()));
            if (c10854bwMKWHzl != null && c10854bwMKWHzl.iRxXKY()) {
                ChainAddress chainAddressAEQbTJ = AEQbTJ(this);
                if (chainAddressAEQbTJ != null) {
                    return chainAddressAEQbTJ.getAddress();
                }
                return null;
            }
            ChainAddress chainAddressEZpvd = EZpvd(this);
            if (chainAddressEZpvd != null) {
                return chainAddressEZpvd.getAddress();
            }
            return null;
        }
        if (sSMYrx() || QfsBiF() || zsXlph()) {
            ChainAddress chainAddressAddressFromAddress$default = AbstractC12782ctV.addressFromAddress$default(this, RlQdEF(), null, 2, null);
            if (chainAddressAddressFromAddress$default != null && (address = chainAddressAddressFromAddress$default.getAddress()) != null) {
                return address;
            }
            ChainAddress chainAddressEZpvd2 = EZpvd(this);
            if (chainAddressEZpvd2 != null) {
                return chainAddressEZpvd2.getAddress();
            }
            return null;
        }
        ChainAddress chainAddress = (ChainAddress) CollectionsKt___CollectionsKt.firstOrNull(WS());
        if (chainAddress != null) {
            return chainAddress.getAddress();
        }
        return null;
    }

    @Override // o.AbstractC12782ctV
    public java.util.List<ChainAddress> DbNXlk(long j) {
        C10854bwM c10854bwMCopydefault = C10954byG.EZpvd.valueOf().copydefault(j);
        if (c10854bwMCopydefault != null) {
            return hDKMBd(c10854bwMCopydefault.AEQbTJ());
        }
        return null;
    }

    public java.util.List<ChainAddress> hDKMBd(long j) {
        java.util.HashMap map = new java.util.HashMap();
        for (ChainAddress chainAddress : WS()) {
            if (chainAddress.getCoinId() == j) {
                map.put(chainAddress.getAddress(), chainAddress);
            }
        }
        C10854bwM c10854bwMKWHzl = C10954byG.EZpvd.valueOf().KWHzl(j);
        if (c10854bwMKWHzl != null && c10854bwMKWHzl.dxcTrN()) {
            for (ChainAddress chainAddress2 : run()) {
                if (chainAddress2.getCoinId() == j) {
                    map.put(chainAddress2.getAddress(), chainAddress2);
                }
            }
        }
        java.util.Collection collectionValues = map.values();
        Intrinsics.checkNotNullExpressionValue(collectionValues, "");
        return CollectionsKt___CollectionsKt.AxsJAYsNCnLh(collectionValues);
    }

    @Override // o.AbstractC12782ctV, o.InterfaceC9738bbJ
    public java.util.List<ChainAddress> valueOf() {
        return WS();
    }

    @Override // o.AbstractC12782ctV
    public void OLrzqt(@NotNull Function1<? super java.util.ArrayList<ChainAddress>, ? extends java.util.ArrayList<ChainAddress>> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        OLrzqt(function1.invoke(new java.util.ArrayList(WS())));
    }

    @Override // o.AbstractC12782ctV
    public java.util.ArrayList<ChainAddress> gGvvIC() {
        return run();
    }

    /* JADX DEBUG: Method merged with bridge method: isConnected()Ljava/util/List; */
    @Override // o.InterfaceC9738bbJ
    /* JADX INFO: renamed from: OBJEWx, reason: merged with bridge method [inline-methods] */
    public java.util.ArrayList<ChainAddress> isConnected() {
        java.lang.Object next;
        java.util.ArrayList<ChainAddress> arrayList = new java.util.ArrayList<>();
        arrayList.addAll(WS());
        for (ChainAddress chainAddress : run()) {
            C10854bwM c10854bwMKWHzl = C10954byG.EZpvd.valueOf().KWHzl(java.lang.Long.valueOf(chainAddress.getCoinId()));
            if (c10854bwMKWHzl != null && c10854bwMKWHzl.dxcTrN()) {
                java.util.Iterator<T> it = arrayList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    ChainAddress chainAddress2 = (ChainAddress) next;
                    if (Intrinsics.EZpvd((java.lang.Object) chainAddress2.getAddress(), (java.lang.Object) chainAddress.getAddress()) && chainAddress2.getCoinId() == chainAddress.getCoinId()) {
                        break;
                    }
                }
                if (next == null) {
                    arrayList.add(chainAddress);
                }
            }
        }
        return arrayList;
    }

    /* JADX DEBUG: Method merged with bridge method: EZpvd()Ljava/util/List; */
    @Override // o.InterfaceC9738bbJ
    /* JADX INFO: renamed from: fvQaOB, reason: merged with bridge method [inline-methods] */
    public java.util.ArrayList<ChainAddress> EZpvd() {
        java.lang.Object next;
        java.util.ArrayList<ChainAddress> arrayList = new java.util.ArrayList<>();
        arrayList.addAll(WS());
        for (ChainAddress chainAddress : run()) {
            java.util.Iterator<T> it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                ChainAddress chainAddress2 = (ChainAddress) next;
                if (Intrinsics.EZpvd((java.lang.Object) chainAddress2.getAddress(), (java.lang.Object) chainAddress.getAddress()) && chainAddress2.getCoinId() == chainAddress.getCoinId()) {
                    break;
                }
            }
            if (next == null) {
                arrayList.add(chainAddress);
            }
        }
        return arrayList;
    }

    @Override // o.AbstractC12782ctV
    public void OLrzqt(java.lang.Long l, @NotNull java.lang.String str, int i) {
        java.lang.Object next;
        Intrinsics.checkNotNullParameter(str, "");
        java.util.Iterator<T> it = WS().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            long coinId = ((ChainAddress) next).getCoinId();
            if (l != null && coinId == l.longValue()) {
                break;
            }
        }
        ChainAddress chainAddress = (ChainAddress) next;
        if (chainAddress != null) {
            chainAddress.setAddress(str);
            chainAddress.setAddressType(i);
            chainAddress.setDefault(true);
        }
    }

    @Override // o.AbstractC12782ctV
    public ChainAddress copydefault(java.lang.Long l) {
        java.lang.Object obj = null;
        if (l == null) {
            return null;
        }
        java.util.Iterator<T> it = AxsJAYsNCnLh().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            java.lang.Object next = it.next();
            CustomChainCoinMeta customChainCoinMetaOLrzqt = C10598brV.AEQbTJ.OLrzqt(((ChainAddress) next).getCoinId());
            if (Intrinsics.EZpvd(customChainCoinMetaOLrzqt != null ? java.lang.Long.valueOf(customChainCoinMetaOLrzqt.copydefault()) : null, l)) {
                obj = next;
                break;
            }
        }
        return (ChainAddress) obj;
    }

    @Override // o.AbstractC12782ctV
    public ChainAddress OLrzqt(java.lang.Long l) {
        CustomChainCoinMeta customChainCoinMetaEZpvd;
        java.lang.Object obj = null;
        if (l == null) {
            return null;
        }
        java.util.Iterator<T> it = AxsJAYsNCnLh().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            java.lang.Object next = it.next();
            ChainAddress chainAddress = (ChainAddress) next;
            CustomChainCoinMeta customChainCoinMetaOLrzqt = C10598brV.AEQbTJ.OLrzqt(l.longValue());
            if (customChainCoinMetaOLrzqt != null && (customChainCoinMetaEZpvd = customChainCoinMetaOLrzqt.EZpvd()) != null && customChainCoinMetaEZpvd.valueOf() == chainAddress.getCoinId()) {
                obj = next;
                break;
            }
        }
        return (ChainAddress) obj;
    }

    @Override // o.AbstractC12782ctV
    public ChainAddress copydefault(@NotNull java.lang.String str) {
        java.lang.Object next;
        Intrinsics.checkNotNullParameter(str, "");
        java.util.Iterator<T> it = AxsJAYsNCnLh().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (Intrinsics.EZpvd((java.lang.Object) ((ChainAddress) next).getAddress(), (java.lang.Object) str)) {
                break;
            }
        }
        return (ChainAddress) next;
    }

    public static final java.lang.Integer getNewProxyInstance(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (java.lang.Integer) function1.invoke(obj);
    }

    /* JADX DEBUG: Type inference failed for r5v1. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<java.lang.Integer> */
    @Override // o.AbstractC12782ctV
    public AbstractC58185ywX<java.lang.Integer> fIwbmz(@NotNull final java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        AbstractC58185ywX<java.lang.Integer> abstractC58185ywXEZpvd = C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null).EZpvd(DbNXlk(), str);
        final Function1 function1 = new Function1() { // from class: o.cCY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return cCS.OLrzqt(this.EZpvd, str, (java.lang.Integer) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXAEQbTJ = abstractC58185ywXEZpvd.AEQbTJ(new InterfaceC58229yxO() { // from class: o.cDa
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return cCS.getNewProxyInstance(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        return abstractC58185ywXAEQbTJ;
    }

    public static final java.lang.Integer OLrzqt(cCS ccs, java.lang.String str, java.lang.Integer num) {
        Intrinsics.checkNotNullParameter(num, "");
        ccs.fARcdN(str);
        return num;
    }

    @Override // o.AbstractC12782ctV
    public AbstractC58260yxt<java.lang.String> values(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (AubY() || AEQbTJ(WalletType.HDWallet) || QVAiDq()) {
            return uzCIH(str);
        }
        AbstractC58260yxt<java.lang.String> abstractC58260yxtCopydefault = AbstractC58260yxt.copydefault("");
        Intrinsics.copydefault(abstractC58260yxtCopydefault);
        return abstractC58260yxtCopydefault;
    }

    @Override // o.AbstractC12782ctV
    public AbstractC58260yxt<java.lang.String> ejfBZ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (AwvSrB() || AEQbTJ(WalletType.KeyWallet)) {
            return uzCIH(str);
        }
        AbstractC58260yxt<java.lang.String> abstractC58260yxtCopydefault = AbstractC58260yxt.copydefault("");
        Intrinsics.copydefault(abstractC58260yxtCopydefault);
        return abstractC58260yxtCopydefault;
    }

    /* JADX DEBUG: Type inference failed for r4v1. Raw type applied. Possible types: o.yxt<R>, java.lang.Object, o.yxt<java.lang.String> */
    @Override // o.AbstractC12782ctV
    public AbstractC58260yxt<java.lang.String> EZpvd(@NotNull final java.lang.String str, final long j) {
        Intrinsics.checkNotNullParameter(str, "");
        if (QSBOWP() == null) {
            AbstractC58260yxt<java.lang.String> abstractC58260yxtCopydefault = AbstractC58260yxt.copydefault("");
            Intrinsics.checkNotNullExpressionValue(abstractC58260yxtCopydefault, "");
            return abstractC58260yxtCopydefault;
        }
        if (ORxRYg() || wlaJM()) {
            AbstractC58260yxt<java.lang.String> abstractC58260yxtAhwBna = C11010bzJ.ActionBar.getInstance$default(C11010bzJ.Companion, null, 1, null).AhwBna(str);
            final Function1 function1 = new Function1() { // from class: o.cDu
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return cCS.copydefault(str, this, j, (java.lang.String) obj);
                }
            };
            AbstractC58260yxt abstractC58260yxtOLrzqt = abstractC58260yxtAhwBna.OLrzqt(new InterfaceC58229yxO() { // from class: o.cDr
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58229yxO
                public final java.lang.Object apply(java.lang.Object obj) {
                    return cCS.ejfBZ(function1, obj);
                }
            });
            Intrinsics.copydefault(abstractC58260yxtOLrzqt);
            return abstractC58260yxtOLrzqt;
        }
        AbstractC58260yxt<java.lang.String> abstractC58260yxtCopydefault2 = AbstractC58260yxt.copydefault("");
        Intrinsics.copydefault(abstractC58260yxtCopydefault2);
        return abstractC58260yxtCopydefault2;
    }

    public static final InterfaceC58261yxu ejfBZ(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC58261yxu) function1.invoke(obj);
    }

    public static final InterfaceC58261yxu copydefault(java.lang.String str, cCS ccs, long j, java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str2, "");
        MpcWalletEncodeInfo mpcWalletEncodeInfoQSBOWP = ccs.QSBOWP();
        Intrinsics.copydefault(mpcWalletEncodeInfoQSBOWP);
        return AbstractC58260yxt.copydefault(xYU.copydefault.copydefault(new MPCeCDSAToHEX(C10964byQ.OLrzqt(str, str2, mpcWalletEncodeInfoQSBOWP).getEcdsaShare2(), xYQ.KWHzl.KWHzl(j, ccs.finit()))));
    }

    /* JADX DEBUG: Type inference failed for r3v2. Raw type applied. Possible types: o.yxt<R>, java.lang.Object, o.yxt<java.lang.String> */
    @Override // o.AbstractC12782ctV
    public AbstractC58260yxt<java.lang.String> OLrzqt(@NotNull java.lang.String str, final long j, final int i) {
        Intrinsics.checkNotNullParameter(str, "");
        AbstractC58260yxt<java.lang.String> abstractC58260yxtUzCIH = uzCIH(str);
        if (AubY() || AEQbTJ(WalletType.HDWallet) || QVAiDq()) {
            final Function1 function1 = new Function1() { // from class: o.cDq
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return cCS.OLrzqt(j, this, i, (java.lang.String) obj);
                }
            };
            AbstractC58260yxt abstractC58260yxtCopydefault = abstractC58260yxtUzCIH.copydefault(new InterfaceC58229yxO() { // from class: o.cDo
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58229yxO
                public final java.lang.Object apply(java.lang.Object obj) {
                    return cCS.getFieldNames(function1, obj);
                }
            });
            Intrinsics.copydefault(abstractC58260yxtCopydefault);
            return abstractC58260yxtCopydefault;
        }
        if (AwvSrB() || AEQbTJ(WalletType.KeyWallet)) {
            return abstractC58260yxtUzCIH;
        }
        AbstractC58260yxt<java.lang.String> abstractC58260yxtAEQbTJ = AbstractC58260yxt.AEQbTJ(new OKWException("Method not support.", null));
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtAEQbTJ, "");
        return abstractC58260yxtAEQbTJ;
    }

    public static final java.lang.String getFieldNames(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (java.lang.String) function1.invoke(obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0067  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.String OLrzqt(long j, cCS ccs, int i, java.lang.String str) {
        C10854bwM c10854bwMKWHzl;
        java.lang.String str2;
        java.lang.Object next;
        Intrinsics.checkNotNullParameter(str, "");
        C10598brV c10598brV = C10598brV.AEQbTJ;
        if (c10598brV.valueOf(j)) {
            CustomChainCoinMeta customChainCoinMetaOLrzqt = c10598brV.OLrzqt(j);
            c10854bwMKWHzl = customChainCoinMetaOLrzqt != null ? customChainCoinMetaOLrzqt.AEQbTJ() : null;
        } else {
            c10854bwMKWHzl = C10954byG.EZpvd.valueOf().KWHzl(j);
        }
        C10854bwM c10854bwMKWHzl2 = C10954byG.EZpvd.valueOf().KWHzl(j);
        if (c10854bwMKWHzl2 == null || !c10854bwMKWHzl2.QCjLjM()) {
            str2 = "";
        } else {
            java.util.Iterator<T> it = ccs.WS().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (((ChainAddress) next).getCoinId() == j) {
                    break;
                }
            }
            ChainAddress chainAddress = (ChainAddress) next;
            java.lang.String address = chainAddress != null ? chainAddress.getAddress() : null;
            if (address != null) {
                str2 = address;
            }
        }
        return xYS.copydefault.KWHzl(str, ccs.DCUTEI(), c10854bwMKWHzl != null ? c10854bwMKWHzl.QKVWgx() : -1L, true, ccs.finit(), i, str2, ccs.QVAiDq());
    }

    /* JADX DEBUG: Type inference failed for r4v2. Raw type applied. Possible types: o.yxt<R>, java.lang.Object, o.yxt<java.util.List<o.daU>> */
    @Override // o.AbstractC12782ctV
    public AbstractC58260yxt<java.util.List<C13855daU>> valueOf(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        AbstractC58260yxt<java.lang.String> abstractC58260yxtUzCIH = uzCIH(str);
        final Function1 function1 = new Function1() { // from class: o.cDf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return cCS.OLrzqt(this.OLrzqt, (java.lang.String) obj);
            }
        };
        AbstractC58260yxt abstractC58260yxtCopydefault = abstractC58260yxtUzCIH.copydefault(new InterfaceC58229yxO() { // from class: o.cDk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return cCS.fARcdN(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtCopydefault, "");
        return abstractC58260yxtCopydefault;
    }

    public static final java.util.List fARcdN(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (java.util.List) function1.invoke(obj);
    }

    public static final java.util.List OLrzqt(cCS ccs, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (ccs.AubY() || ccs.AEQbTJ(WalletType.HDWallet)) {
            java.util.ArrayList<ChainAddress> arrayListWS = ccs.WS();
            java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(arrayListWS, 10));
            for (ChainAddress chainAddress : arrayListWS) {
                C10954byG c10954byG = C10954byG.EZpvd;
                C10854bwM c10854bwMKWHzl = c10954byG.valueOf().KWHzl(chainAddress.getCoinId());
                java.lang.String address = (c10854bwMKWHzl == null || !c10854bwMKWHzl.QCjLjM()) ? "" : chainAddress.getAddress();
                xYS xys = xYS.copydefault;
                java.lang.String strDCUTEI = ccs.DCUTEI();
                C10854bwM c10854bwMKWHzl2 = c10954byG.valueOf().KWHzl(chainAddress.getCoinId());
                arrayList.add(new C13855daU(chainAddress.getCoinId(), xys.KWHzl(str, strDCUTEI, c10854bwMKWHzl2 != null ? c10854bwMKWHzl2.QKVWgx() : -1L, true, ccs.finit(), chainAddress.getAddressType(), address, ccs.QVAiDq()), chainAddress.getAddress()));
            }
            return arrayList;
        }
        if (ccs.AwvSrB() || ccs.AEQbTJ(WalletType.KeyWallet)) {
            java.util.ArrayList<ChainAddress> arrayListWS2 = ccs.WS();
            java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(arrayListWS2, 10));
            for (ChainAddress chainAddress2 : arrayListWS2) {
                arrayList2.add(new C13855daU(chainAddress2.getCoinId(), str, chainAddress2.getAddress()));
            }
            return arrayList2;
        }
        return yDY.AhwBna();
    }

    /* JADX DEBUG: Type inference failed for r4v2. Raw type applied. Possible types: o.yxt<R>, java.lang.Object, o.yxt<java.util.List<o.daU>> */
    @Override // o.AbstractC12782ctV
    public AbstractC58260yxt<java.util.List<C13855daU>> AhwBna(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        AbstractC58260yxt<java.lang.String> abstractC58260yxtUzCIH = uzCIH(str);
        final Function1 function1 = new Function1() { // from class: o.cDh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return cCS.copydefault(this.EZpvd, (java.lang.String) obj);
            }
        };
        AbstractC58260yxt abstractC58260yxtCopydefault = abstractC58260yxtUzCIH.copydefault(new InterfaceC58229yxO() { // from class: o.cDj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return cCS.fetchVPNInfo(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtCopydefault, "");
        return abstractC58260yxtCopydefault;
    }

    public static final java.util.List fetchVPNInfo(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (java.util.List) function1.invoke(obj);
    }

    public static final java.util.List copydefault(cCS ccs, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (ccs.AubY()) {
            java.lang.String strKWHzl = xYS.copydefault.KWHzl(str, ccs.DCUTEI(), -2000L, true, ccs.finit(), AddressType.Legacy.getValue(), "", ccs.QVAiDq());
            java.util.ArrayList<ChainAddress> arrayListAxsJAYsNCnLh = ccs.AxsJAYsNCnLh();
            java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(arrayListAxsJAYsNCnLh, 10));
            for (ChainAddress chainAddress : arrayListAxsJAYsNCnLh) {
                arrayList.add(new C13855daU(chainAddress.getCoinId(), strKWHzl, chainAddress.getAddress()));
            }
            return arrayList;
        }
        if (ccs.AwvSrB()) {
            java.util.ArrayList<ChainAddress> arrayListAxsJAYsNCnLh2 = ccs.AxsJAYsNCnLh();
            java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(arrayListAxsJAYsNCnLh2, 10));
            for (ChainAddress chainAddress2 : arrayListAxsJAYsNCnLh2) {
                arrayList2.add(new C13855daU(chainAddress2.getCoinId(), str, chainAddress2.getAddress()));
            }
            return arrayList2;
        }
        return yDY.AhwBna();
    }

    /* JADX DEBUG: Type inference failed for r11v1. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<java.lang.Integer> */
    @Override // o.AbstractC12782ctV
    public AbstractC58185ywX<java.lang.Integer> OLrzqt(final long j, @NotNull final java.lang.String str, final int i) {
        Intrinsics.checkNotNullParameter(str, "");
        AbstractC58185ywX<java.lang.Integer> abstractC58185ywXOLrzqt = C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null).OLrzqt(DbNXlk(), j, str, i);
        final Function1 function1 = new Function1() { // from class: o.cDp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return cCS.OLrzqt(this.EZpvd, j, str, i, (java.lang.Integer) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXAEQbTJ = abstractC58185ywXOLrzqt.AEQbTJ(new InterfaceC58229yxO() { // from class: o.cDm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return cCS.hDKMBd(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        return abstractC58185ywXAEQbTJ;
    }

    public static final java.lang.Integer hDKMBd(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (java.lang.Integer) function1.invoke(obj);
    }

    public static final java.lang.Integer OLrzqt(cCS ccs, long j, java.lang.String str, int i, java.lang.Integer num) {
        Intrinsics.checkNotNullParameter(num, "");
        ccs.OLrzqt(java.lang.Long.valueOf(j), str, i);
        return num;
    }

    @Override // o.AbstractC12782ctV
    public AbstractC58260yxt<java.lang.Integer> DCUTEIddSDPG() {
        return C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null).AhwBna().AEQbTJ(this);
    }

    /* JADX DEBUG: Type inference failed for r0v5. Raw type applied. Possible types: o.yxt<R>, java.lang.Object, o.yxt<java.lang.Integer> */
    @Override // o.AbstractC12782ctV
    public AbstractC58260yxt<java.lang.Integer> EZpvd(final java.lang.String str, final java.lang.Integer num, final java.lang.String str2, final java.lang.String str3, final java.lang.Integer num2, final java.lang.String str4, final java.util.List<java.lang.String> list) {
        if (!ORxRYg() && !AEQbTJ(WalletType.MPCWallet)) {
            AbstractC58260yxt<java.lang.Integer> abstractC58260yxtCopydefault = AbstractC58260yxt.copydefault(0);
            Intrinsics.copydefault(abstractC58260yxtCopydefault);
            return abstractC58260yxtCopydefault;
        }
        cQM cqmAhwBna = C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null).AhwBna();
        AbstractC12784ctX abstractC12784ctXGwTjWJ = gwTjWJ();
        java.lang.String strEZpvd = abstractC12784ctXGwTjWJ != null ? abstractC12784ctXGwTjWJ.EZpvd() : null;
        AbstractC58260yxt<java.lang.Integer> abstractC58260yxtKWHzl = cqmAhwBna.KWHzl(strEZpvd == null ? "" : strEZpvd, num, str2, str3, num2, str4, str, list);
        final Function1 function1 = new Function1() { // from class: o.cCZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return cCS.KWHzl(this.copydefault, num, str2, str3, num2, str4, str, list, (java.lang.Integer) obj);
            }
        };
        AbstractC58260yxt abstractC58260yxtCopydefault2 = abstractC58260yxtKWHzl.copydefault(new InterfaceC58229yxO() { // from class: o.cCX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return cCS.wlaJM(function1, obj);
            }
        });
        Intrinsics.copydefault(abstractC58260yxtCopydefault2);
        return abstractC58260yxtCopydefault2;
    }

    public static final java.lang.Integer wlaJM(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (java.lang.Integer) function1.invoke(obj);
    }

    public static final java.lang.Integer KWHzl(cCS ccs, java.lang.Integer num, java.lang.String str, java.lang.String str2, java.lang.Integer num2, java.lang.String str3, java.lang.String str4, java.util.List list, java.lang.Integer num3) {
        Intrinsics.checkNotNullParameter(num3, "");
        MpcWalletEncodeInfo mpcWalletEncodeInfoQSBOWP = ccs.QSBOWP();
        if (mpcWalletEncodeInfoQSBOWP != null) {
            if (num != null) {
                mpcWalletEncodeInfoQSBOWP.setStatus(num.intValue());
            }
            if (C33129mqd.OLrzqt((java.lang.CharSequence) str)) {
                Intrinsics.copydefault((java.lang.Object) str);
                mpcWalletEncodeInfoQSBOWP.setAccountName(str);
            }
            if (C33129mqd.OLrzqt((java.lang.CharSequence) str2)) {
                Intrinsics.copydefault((java.lang.Object) str2);
                mpcWalletEncodeInfoQSBOWP.setDisplayAccountName(str2);
            }
            if (num2 != null) {
                mpcWalletEncodeInfoQSBOWP.setEscape(num2.intValue());
            }
            if (C33129mqd.OLrzqt((java.lang.CharSequence) str3)) {
                Intrinsics.copydefault((java.lang.Object) str3);
                mpcWalletEncodeInfoQSBOWP.setEncryptShareKey(str3);
            }
            if (C33129mqd.OLrzqt((java.lang.CharSequence) str4)) {
                Intrinsics.copydefault((java.lang.Object) str4);
                mpcWalletEncodeInfoQSBOWP.setMpcId(str4);
            }
            if (list != null && !list.isEmpty()) {
                mpcWalletEncodeInfoQSBOWP.setCopiedEscapeList(list);
            }
        }
        return num3;
    }

    /* JADX DEBUG: Type inference failed for r4v4. Raw type applied. Possible types: o.yxt<R>, java.lang.Object, o.yxt<java.lang.Integer> */
    @Override // o.AbstractC12782ctV
    public AbstractC58260yxt<java.lang.Integer> copydefault(@NotNull final AAStatus aAStatus) {
        Intrinsics.checkNotNullParameter(aAStatus, "");
        if (getFieldNames()) {
            AbstractC58260yxt<java.lang.Integer> abstractC58260yxtAEQbTJ = C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null).AEQbTJ(DbNXlk(), aAStatus);
            final Function1 function1 = new Function1() { // from class: o.cDb
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return cCS.KWHzl(this.EZpvd, aAStatus, (java.lang.Integer) obj);
                }
            };
            AbstractC58260yxt abstractC58260yxtCopydefault = abstractC58260yxtAEQbTJ.copydefault(new InterfaceC58229yxO() { // from class: o.cDe
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58229yxO
                public final java.lang.Object apply(java.lang.Object obj) {
                    return cCS.uzCIH(function1, obj);
                }
            });
            Intrinsics.copydefault(abstractC58260yxtCopydefault);
            return abstractC58260yxtCopydefault;
        }
        AbstractC58260yxt<java.lang.Integer> abstractC58260yxtCopydefault2 = AbstractC58260yxt.copydefault(0);
        Intrinsics.copydefault(abstractC58260yxtCopydefault2);
        return abstractC58260yxtCopydefault2;
    }

    public static final java.lang.Integer uzCIH(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (java.lang.Integer) function1.invoke(obj);
    }

    public static final java.lang.Integer KWHzl(cCS ccs, AAStatus aAStatus, java.lang.Integer num) {
        Intrinsics.checkNotNullParameter(num, "");
        ccs.OLrzqt(aAStatus);
        return num;
    }

    @Override // o.AbstractC12782ctV
    public AbstractC58260yxt<java.lang.Long> OLrzqt(@NotNull C13852daR c13852daR) {
        Intrinsics.checkNotNullParameter(c13852daR, "");
        return C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null).AhwBna().copydefault(DbNXlk(), new EOSInfoEntity(DbNXlk(), c13852daR.KWHzl(), c13852daR.valueOf().ordinal(), c13852daR.copydefault(), c13852daR.OLrzqt(), c13852daR.AEQbTJ(), C11600cUg.OLrzqt(c13852daR.EZpvd())));
    }

    public static final InterfaceC58261yxu fIwbmz(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC58261yxu) function1.invoke(obj);
    }

    @Override // o.AbstractC12782ctV
    public AbstractC58260yxt<java.lang.Integer> djBIcL(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        AbstractC58260yxt allRootWallets$default = C12827cuN.getAllRootWallets$default(C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null), false, false, 3, null);
        final Function1 function1 = new Function1() { // from class: o.cDc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return cCS.KWHzl(this.AEQbTJ, (java.util.List) obj);
            }
        };
        AbstractC58260yxt<java.lang.Integer> abstractC58260yxtOLrzqt = allRootWallets$default.OLrzqt(new InterfaceC58229yxO() { // from class: o.cDg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return cCS.fIwbmz(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtOLrzqt, "");
        return abstractC58260yxtOLrzqt;
    }

    public static final InterfaceC58261yxu KWHzl(cCS ccs, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        if (list.size() == 1 && ((AbstractC12784ctX) CollectionsKt___CollectionsKt.AuCTelauCTel(list)).KWHzl().size() == 1) {
            AbstractC58260yxt abstractC58260yxtAEQbTJ = C10337bmZ.KWHzl.OLrzqt().AEQbTJ(1);
            Intrinsics.copydefault(abstractC58260yxtAEQbTJ);
            return abstractC58260yxtAEQbTJ;
        }
        return C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null).valueOf(ccs.DbNXlk());
    }

    @Override // o.AbstractC12782ctV, o.InterfaceC9738bbJ
    public boolean djSkpj() {
        return (QfsBiF() || zsXlph() || DCUTEIdCUTEI()) ? false : true;
    }

    @Override // o.AbstractC12782ctV, o.InterfaceC9738bbJ
    public boolean gEmmrt(long j) {
        C10854bwM c10854bwMCopydefault = C10954byG.EZpvd.valueOf().copydefault(j);
        boolean z = ((c10854bwMCopydefault != null && c10854bwMCopydefault.ejfBZ()) || (c10854bwMCopydefault != null && c10854bwMCopydefault.AxsJAYaxsJAY())) && KWHzl(java.lang.Long.valueOf(j));
        return (AxsJAY() || gHZMYf() || iwGUEr()) ? z : KWHzl(java.lang.Long.valueOf(j));
    }

    @Override // o.InterfaceC9738bbJ
    public boolean AhwBna(long j) {
        return gEmmrt(j) || iwGUEr(j);
    }

    public boolean iwGUEr(long j) {
        if (gHZMYf()) {
            C10854bwM c10854bwMAEQbTJ = C10598brV.AEQbTJ.AEQbTJ(j);
            return c10854bwMAEQbTJ != null && c10854bwMAEQbTJ.ejfBZ() && isConnected(java.lang.Long.valueOf(j));
        }
        return isConnected(java.lang.Long.valueOf(j));
    }

    @Override // o.InterfaceC9738bbJ
    public boolean QKVWgx() {
        if (gHZMYf() || getFieldNames()) {
            return false;
        }
        return KWHzl((java.lang.Long) 0L);
    }

    @Override // o.InterfaceC9738bbJ
    public boolean OcIXYQ() {
        if (ORxRYg()) {
            return false;
        }
        return QKVWgx();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:16:0x001e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0050  */
    @Override // o.InterfaceC9738bbJ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean KWHzl(int i, int i2, boolean z) {
        if (i == 1) {
            if (AwvSrB() || AubY() || ORxRYg()) {
                return true;
            }
            if (gHZMYf() && !z && i2 == 5 && KWHzl((java.lang.Long) 0L)) {
                return true;
            }
        } else if (i == 2) {
            if ((AwvSrB() || AubY()) && ((!z || i2 != 4) && KWHzl((java.lang.Long) 0L))) {
                return true;
            }
        } else if (i != 6 && i != 7) {
            if (i != 8) {
                if (i != 17) {
                    switch (i) {
                        case 14:
                        case 15:
                            if ((AwvSrB() || AubY()) && KWHzl((java.lang.Long) 70000061L)) {
                                return true;
                            }
                            break;
                    }
                }
            }
        }
        return false;
    }

    @Override // o.AbstractC12782ctV, o.InterfaceC9738bbJ
    public java.lang.String AYXKKw() {
        AbstractC12784ctX abstractC12784ctXGwTjWJ = gwTjWJ();
        java.lang.String strAuCTel = abstractC12784ctXGwTjWJ != null ? abstractC12784ctXGwTjWJ.AuCTel() : null;
        if (strAuCTel == null) {
            strAuCTel = "";
        }
        return strAuCTel + " - " + AkhnZx();
    }

    @Override // o.AbstractC12782ctV, o.InterfaceC9738bbJ
    public java.lang.String fJNWhG() {
        AbstractC12784ctX abstractC12784ctXGwTjWJ = gwTjWJ();
        java.lang.String strAuCTel = abstractC12784ctXGwTjWJ != null ? abstractC12784ctXGwTjWJ.AuCTel() : null;
        return strAuCTel == null ? "" : strAuCTel;
    }

    public static final java.util.List AuCTel(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (java.util.List) function1.invoke(obj);
    }

    /* JADX DEBUG: Type inference failed for r0v3. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<java.util.List<o.dbk>> */
    @Override // o.AbstractC12782ctV
    public AbstractC58185ywX<java.util.List<C13924dbk>> gkJEwt() {
        AbstractC58185ywX<java.util.ArrayList<C13924dbk>> abstractC58185ywXCopydefault = C10822bvh.StateListAnimator.getInstance$default(C10822bvh.Companion, null, 1, null).copydefault();
        final Function1 function1 = new Function1() { // from class: o.cDt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return cCS.OLrzqt(this.OLrzqt, (java.util.ArrayList) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXAEQbTJ = abstractC58185ywXCopydefault.AEQbTJ(new InterfaceC58229yxO() { // from class: o.cDw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return cCS.AuCTel(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        return abstractC58185ywXAEQbTJ;
    }

    @Override // o.AbstractC12782ctV, o.InterfaceC9738bbJ
    public java.lang.String OLrzqt(long j) {
        java.lang.Object next;
        java.util.Iterator<T> it = WS().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            C10854bwM c10854bwMKWHzl = C10954byG.EZpvd.valueOf().KWHzl(((ChainAddress) next).getCoinId());
            if (c10854bwMKWHzl != null && c10854bwMKWHzl.fetchVPNInfo() == j) {
                break;
            }
        }
        ChainAddress chainAddress = (ChainAddress) next;
        java.lang.String publicKey = chainAddress != null ? chainAddress.getPublicKey() : null;
        return publicKey == null ? "" : publicKey;
    }

    @Override // o.AbstractC12782ctV, o.InterfaceC9738bbJ
    public java.lang.String EZpvd(@NotNull java.lang.String str) {
        java.lang.Object next;
        Intrinsics.checkNotNullParameter(str, "");
        java.util.Iterator<T> it = run().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            ChainAddress chainAddress = (ChainAddress) next;
            if (chainAddress.getCoinId() == 1 || chainAddress.getCoinId() == 21300 || chainAddress.getCoinId() == 22900) {
                if (Intrinsics.EZpvd((java.lang.Object) chainAddress.getAddress(), (java.lang.Object) str)) {
                    break;
                }
            }
        }
        ChainAddress chainAddress2 = (ChainAddress) next;
        java.lang.String publicKey = chainAddress2 != null ? chainAddress2.getPublicKey() : null;
        java.lang.String str2 = publicKey != null ? publicKey : "";
        return ORxRYg() ? str2 : xYW.AEQbTJ.djBIcL(str2);
    }

    public static final java.lang.String fJNWhG(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (java.lang.String) function1.invoke(obj);
    }

    /* JADX DEBUG: Type inference failed for r4v1. Raw type applied. Possible types: o.yxt<R>, java.lang.Object, o.yxt<java.lang.String> */
    public final AbstractC58260yxt<java.lang.String> uzCIH(final java.lang.String str) {
        AbstractC58260yxt<java.lang.String> abstractC58260yxtAhwBna = C11010bzJ.ActionBar.getInstance$default(C11010bzJ.Companion, null, 1, null).AhwBna(str);
        final Function1 function1 = new Function1() { // from class: o.cDd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return cCS.KWHzl(this.KWHzl, str, (java.lang.String) obj);
            }
        };
        AbstractC58260yxt abstractC58260yxtCopydefault = abstractC58260yxtAhwBna.copydefault(new InterfaceC58229yxO() { // from class: o.cDn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return cCS.fJNWhG(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtCopydefault, "");
        return abstractC58260yxtCopydefault;
    }

    public static final java.lang.String KWHzl(cCS ccs, java.lang.String str, java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str2, "");
        return C33129mqd.OLrzqt((java.lang.CharSequence) ccs.RlQdEF()) ? xXW.OLrzqt.AEQbTJ(str, str2, ccs.RlQdEF(), true) : "";
    }

    @Override // o.AbstractC12782ctV, o.InterfaceC9738bbJ
    public java.lang.String KWHzl(@NotNull java.lang.String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        return C54862xYb.convertToString$default(C54862xYb.KWHzl(C54862xYb.KWHzl(AbstractC12782ctV.getCoinAssetValuation$default(this, str, false, 2, null), DCJXGO()), KWHzl(z, true)), false, null, null, 7, null);
    }

    @Override // o.AbstractC12782ctV
    public java.lang.String UlJrfe() {
        return C54862xYb.convertToString$default(C54862xYb.KWHzl(C54862xYb.KWHzl(DcqEDu(), DWgRXt()), ((xWV) C43251rlk.copydefault(xWV.class)).copydefault() ? KDccX() : "0"), false, null, null, 7, null);
    }

    @Override // o.AbstractC12782ctV
    public java.lang.String copydefault(@NotNull java.lang.String str, long j, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        return C54862xYb.convertToString$default(C54862xYb.KWHzl(C54862xYb.KWHzl(KWHzl(str, j), AuCTel(j)), EZpvd(z, true, j)), false, null, null, 7, null);
    }

    @Override // o.AbstractC12782ctV
    public java.lang.String fIwbmz(long j) {
        BigDecimal bigDecimal = new BigDecimal("0");
        java.util.ArrayList<C10594brR> arrayList = this.fIwbmz;
        java.util.ArrayList<C10594brR> arrayList2 = new java.util.ArrayList();
        for (java.lang.Object obj : arrayList) {
            C10594brR c10594brR = (C10594brR) obj;
            if (c10594brR.AEQbTJ() == j && c10594brR.KWHzl().gHZMYf() == 1) {
                arrayList2.add(obj);
            }
        }
        BigDecimal bigDecimalKWHzl = bigDecimal;
        for (C10594brR c10594brR2 : arrayList2) {
            bigDecimalKWHzl = C54862xYb.KWHzl(bigDecimalKWHzl, C54870xYj.AEQbTJ(c10594brR2.values(), c10594brR2.KWHzl().valueOf()));
        }
        return C54862xYb.convertToString$default(bigDecimalKWHzl, false, null, null, 7, null);
    }

    @Override // o.AbstractC12782ctV, o.InterfaceC9738bbJ
    public java.lang.String KWHzl(@NotNull java.lang.String str, long j, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        C10854bwM c10854bwMCopydefault = C10954byG.EZpvd.valueOf().copydefault(j);
        return copydefault(str, c10854bwMCopydefault != null ? c10854bwMCopydefault.AEQbTJ() : 0L, z);
    }

    public final java.util.List<C10525bqB> iwGUEr(java.lang.String str) {
        int iHashCode = str.hashCode();
        if (iHashCode == -1010579351) {
            str.equals("opened");
        } else if (iHashCode != 96673) {
            if (iHashCode == 3202370 && str.equals("hide")) {
                java.util.List<C10525bqB> list = this.OLrzqt;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                for (java.lang.Object obj : list) {
                    C10525bqB c10525bqB = (C10525bqB) obj;
                    java.util.List<C10525bqB> list2 = this.fetchVPNInfo.get(java.lang.Long.valueOf(c10525bqB.OLrzqt()));
                    if (list2 == null || list2.isEmpty()) {
                        java.util.List<C10525bqB> list3 = this.RcXXUw.get(java.lang.Long.valueOf(c10525bqB.OLrzqt()));
                        if (list3 == null || list3.isEmpty()) {
                            arrayList.add(obj);
                        }
                    }
                }
                return arrayList;
            }
        } else if (str.equals("all")) {
            return this.OLrzqt;
        }
        return this.isConnected;
    }

    @Override // o.AbstractC12782ctV
    public java.lang.String AEQbTJ(@NotNull java.lang.String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        BigDecimal bigDecimal = new BigDecimal("0");
        BigDecimal bigDecimalKWHzl = bigDecimal;
        for (C10525bqB c10525bqB : iwGUEr(str)) {
            if (z) {
                if (c10525bqB.KWHzl().aUsmxb()) {
                    bigDecimalKWHzl = C54862xYb.KWHzl(bigDecimalKWHzl, c10525bqB.uzCIH());
                }
            } else {
                bigDecimalKWHzl = C54862xYb.KWHzl(bigDecimalKWHzl, c10525bqB.uzCIH());
            }
        }
        return C54862xYb.convertToString$default(bigDecimalKWHzl, false, null, null, 7, null);
    }

    @Override // o.AbstractC12782ctV
    public java.lang.String KWHzl(@NotNull java.lang.String str, long j) {
        Intrinsics.checkNotNullParameter(str, "");
        BigDecimal bigDecimal = new BigDecimal("0");
        java.util.List<C10525bqB> listIwGUEr = iwGUEr(str);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : listIwGUEr) {
            if (((C10525bqB) obj).AEQbTJ() == j) {
                arrayList.add(obj);
            }
        }
        java.util.Iterator it = arrayList.iterator();
        BigDecimal bigDecimalKWHzl = bigDecimal;
        while (it.hasNext()) {
            bigDecimalKWHzl = C54862xYb.KWHzl(bigDecimalKWHzl, ((C10525bqB) it.next()).uzCIH());
        }
        return C54862xYb.convertToString$default(bigDecimalKWHzl, false, null, null, 7, null);
    }

    @Override // o.AbstractC12782ctV
    public java.lang.String DCJXGO() {
        BigDecimal bigDecimal = new BigDecimal("0");
        java.util.Iterator<T> it = this.getNewProxyInstance.iterator();
        BigDecimal bigDecimalKWHzl = bigDecimal;
        while (it.hasNext()) {
            bigDecimalKWHzl = C54862xYb.KWHzl(bigDecimalKWHzl, ((C10527bqD) it.next()).OLrzqt());
        }
        return C54862xYb.convertToString$default(bigDecimalKWHzl, false, null, null, 7, null);
    }

    @Override // o.AbstractC12782ctV
    public java.lang.String AuCTel(long j) {
        BigDecimal bigDecimal = new BigDecimal("0");
        java.util.ArrayList<C10527bqD> arrayList = this.getNewProxyInstance;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (java.lang.Object obj : arrayList) {
            C10854bwM c10854bwMIsConnected = ((C10527bqD) obj).isConnected();
            if (c10854bwMIsConnected != null && c10854bwMIsConnected.AEQbTJ() == j) {
                arrayList2.add(obj);
            }
        }
        java.util.Iterator it = arrayList2.iterator();
        BigDecimal bigDecimalKWHzl = bigDecimal;
        while (it.hasNext()) {
            bigDecimalKWHzl = C54862xYb.KWHzl(bigDecimalKWHzl, ((C10527bqD) it.next()).OLrzqt());
        }
        return C54862xYb.convertToString$default(bigDecimalKWHzl, false, null, null, 7, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r7v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [T, java.math.BigDecimal] */
    @Override // o.AbstractC12782ctV
    public java.lang.String KWHzl(boolean z, boolean z2) {
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = new BigDecimal("0");
        if (z && (!z2 || ((xWV) C43251rlk.copydefault(xWV.class)).copydefault())) {
            copydefault(this, (Ref.ObjectRef<BigDecimal>) objectRef);
        }
        return C54862xYb.convertToString$default((BigDecimal) objectRef.element, false, null, null, 7, null);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [T, java.math.BigDecimal] */
    public static final void copydefault(cCS ccs, Ref.ObjectRef<BigDecimal> objectRef) {
        java.util.Iterator<T> it = ccs.ORxRYg.iterator();
        while (it.hasNext()) {
            objectRef.element = C54862xYb.KWHzl(objectRef.element, ((C10528bqE) it.next()).OLrzqt(false));
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r7v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [T, java.math.BigDecimal] */
    @Override // o.AbstractC12782ctV
    public java.lang.String EZpvd(boolean z, boolean z2, long j) {
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = new BigDecimal("0");
        if (z && (!z2 || ((xWV) C43251rlk.copydefault(xWV.class)).copydefault())) {
            KWHzl(this, j, (Ref.ObjectRef<BigDecimal>) objectRef);
        }
        return C54862xYb.convertToString$default((BigDecimal) objectRef.element, false, null, null, 7, null);
    }

    /* JADX WARN: Type inference failed for: r7v5, types: [T, java.math.BigDecimal] */
    public static final void KWHzl(cCS ccs, long j, Ref.ObjectRef<BigDecimal> objectRef) {
        java.util.ArrayList<C10528bqE> arrayList = ccs.ORxRYg;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (java.lang.Object obj : arrayList) {
            C10854bwM c10854bwMCopydefault = C10954byG.EZpvd.valueOf().copydefault(((C10528bqE) obj).gEmmrt());
            if (c10854bwMCopydefault != null && c10854bwMCopydefault.AEQbTJ() == j) {
                arrayList2.add(obj);
            }
        }
        java.util.Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            objectRef.element = C54862xYb.KWHzl(objectRef.element, ((C10528bqE) it.next()).OLrzqt(false));
        }
    }

    @Override // o.AbstractC12782ctV
    public boolean fetchVPNInfo(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        C10953byF c10953byF = C10953byF.KWHzl;
        java.lang.String strAEQbTJ = c10953byF.AEQbTJ(str);
        int iHashCode = strAEQbTJ.hashCode();
        if (iHashCode != 108988) {
            if (iHashCode == 3059345) {
                if (strAEQbTJ.equals("coin")) {
                    long jEZpvd = c10953byF.EZpvd(str);
                    C10854bwM c10854bwMKWHzl = C10954byG.EZpvd.valueOf().KWHzl(java.lang.Long.valueOf(jEZpvd));
                    if (c10854bwMKWHzl != null && c10854bwMKWHzl.giSNqX()) {
                        if (!getFieldNames(str).isEmpty()) {
                            return true;
                        }
                    } else if (this.fetchVPNInfo.get(java.lang.Long.valueOf(jEZpvd)) != null || this.RcXXUw.get(java.lang.Long.valueOf(jEZpvd)) != null) {
                        return true;
                    }
                }
            } else if (iHashCode == 3079428 && strAEQbTJ.equals("defi") && this.uzCIH.get(str) != null) {
                return true;
            }
        } else if (strAEQbTJ.equals("nft") && this.QOLQEE.get(str) != null) {
            return true;
        }
        return false;
    }

    @Override // o.AbstractC12782ctV
    public boolean isConnected(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return KWHzl(str);
    }

    @Override // o.AbstractC12782ctV
    public boolean djBIcL(java.lang.Long l) {
        if (l == null) {
            return false;
        }
        return isConnected(C10953byF.KWHzl.AEQbTJ(l.longValue()));
    }

    @Override // o.AbstractC12782ctV
    public boolean KWHzl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (AubY()) {
            return true;
        }
        C10953byF c10953byF = C10953byF.KWHzl;
        if (Intrinsics.EZpvd((java.lang.Object) c10953byF.AEQbTJ(str), (java.lang.Object) "coin")) {
            long jEZpvd = c10953byF.EZpvd(str);
            C10954byG c10954byG = C10954byG.EZpvd;
            C10854bwM c10854bwMKWHzl = c10954byG.valueOf().KWHzl(java.lang.Long.valueOf(jEZpvd));
            C10854bwM c10854bwMKWHzl2 = c10954byG.valueOf().KWHzl(jEZpvd);
            if (gHZMYf() || getFieldNames() || (QfsBiF() && DarRvM() == WalletType.TrackingWallet)) {
                if (c10854bwMKWHzl == null || !C10854bwM.isXRCToken$default(c10854bwMKWHzl, null, 1, null)) {
                    return AhwBna(c10854bwMKWHzl2 != null ? java.lang.Long.valueOf(c10854bwMKWHzl2.AEQbTJ()) : null);
                }
                return false;
            }
            if (ORxRYg()) {
                if (c10854bwMKWHzl == null || !c10854bwMKWHzl.copydefault(XRCTokenType.Brc20sToken, XRCTokenType.Arc20Token, XRCTokenType.SRC20Token, XRCTokenType.RunesToken, XRCTokenType.RunesMainToken, XRCTokenType.Brc20ForFBTCToken, XRCTokenType.RunesMainForFBTCToken)) {
                    return AhwBna(c10854bwMKWHzl2 != null ? java.lang.Long.valueOf(c10854bwMKWHzl2.AEQbTJ()) : null);
                }
                return false;
            }
            C10854bwM c10854bwMKWHzl3 = c10954byG.valueOf().KWHzl(flVtFt());
            if (c10854bwMKWHzl2 != null && c10854bwMKWHzl2.RdAHlO() && c10854bwMKWHzl3 != null && c10854bwMKWHzl3.RdAHlO() && c10854bwMKWHzl2.QOLQEE() == c10854bwMKWHzl3.QOLQEE()) {
                return true;
            }
            return c10854bwMKWHzl != null && c10854bwMKWHzl.AEQbTJ() == flVtFt();
        }
        java.lang.String strKWHzl = c10953byF.KWHzl(str);
        C10954byG c10954byG2 = C10954byG.EZpvd;
        C10854bwM c10854bwMEZpvd = c10954byG2.valueOf().EZpvd(strKWHzl);
        C10854bwM c10854bwMKWHzl4 = c10954byG2.valueOf().KWHzl(flVtFt());
        if (c10854bwMEZpvd != null && c10854bwMEZpvd.RdAHlO() && c10854bwMKWHzl4 != null && c10854bwMKWHzl4.RdAHlO() && c10854bwMEZpvd.QOLQEE() == c10854bwMKWHzl4.QOLQEE()) {
            return true;
        }
        return c10854bwMEZpvd != null && c10854bwMEZpvd.AhwBna() == flVtFt();
    }

    @Override // o.AbstractC12782ctV
    public AbstractC58260yxt<java.lang.Long> OLrzqt(@NotNull java.lang.String str, boolean z) {
        java.lang.String address;
        Intrinsics.checkNotNullParameter(str, "");
        C10953byF c10953byF = C10953byF.KWHzl;
        if (Intrinsics.EZpvd((java.lang.Object) c10953byF.AEQbTJ(str), (java.lang.Object) "coin")) {
            C10854bwM c10854bwMKWHzl = C10954byG.EZpvd.valueOf().KWHzl(java.lang.Long.valueOf(c10953byF.EZpvd(str)));
            if (c10854bwMKWHzl == null) {
                AbstractC58260yxt<java.lang.Long> abstractC58260yxtAEQbTJ = AbstractC58260yxt.AEQbTJ(new java.lang.Throwable("no chain"));
                Intrinsics.checkNotNullExpressionValue(abstractC58260yxtAEQbTJ, "");
                return abstractC58260yxtAEQbTJ;
            }
            ChainAddress chainAddressAddressFromChainId$default = AbstractC12782ctV.addressFromChainId$default(this, c10854bwMKWHzl.AEQbTJ(), null, 2, null);
            java.lang.String address2 = chainAddressAddressFromChainId$default != null ? chainAddressAddressFromChainId$default.getAddress() : null;
            java.lang.String str2 = address2 != null ? address2 : "";
            C10407bnq.ActionBar actionBar = C10407bnq.Companion;
            TokenAsset tokenAssetOLrzqt = C10407bnq.ActionBar.getInstance$default(actionBar, null, 1, null).copydefault().OLrzqt(DbNXlk(), c10854bwMKWHzl.AhwBna(), str2);
            final AbstractC58260yxt<java.lang.Long> abstractC58260yxtAEQbTJ2 = AEQbTJ(c10854bwMKWHzl.AhwBna(), (tokenAssetOLrzqt == null || (address = tokenAssetOLrzqt.getAddress()) == null) ? str2 : address, C33129mqd.AYXKKw(tokenAssetOLrzqt != null ? tokenAssetOLrzqt.getCoinAmount() : null), C33129mqd.OLrzqt((java.lang.Object) (tokenAssetOLrzqt != null ? tokenAssetOLrzqt.getCurrencyAmount() : null)), "", z);
            if (c10854bwMKWHzl.aUsmxb() || c10854bwMKWHzl.DarRvM()) {
                return abstractC58260yxtAEQbTJ2;
            }
            AbstractC58260yxt abstractC58260yxtAEQbTJ3 = AbstractC58260yxt.AEQbTJ(C10407bnq.ActionBar.getInstance$default(actionBar, null, 1, null).copydefault(DbNXlk(), c10854bwMKWHzl.AhwBna()));
            final Function1 function1 = new Function1() { // from class: o.cCW
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return cCS.EZpvd(abstractC58260yxtAEQbTJ2, (java.lang.Integer) obj);
                }
            };
            AbstractC58260yxt<java.lang.Long> abstractC58260yxtOLrzqt = abstractC58260yxtAEQbTJ3.OLrzqt(new InterfaceC58229yxO() { // from class: o.cCU
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58229yxO
                public final java.lang.Object apply(java.lang.Object obj) {
                    return cCS.iwGUEr(function1, obj);
                }
            });
            Intrinsics.copydefault(abstractC58260yxtOLrzqt);
            return abstractC58260yxtOLrzqt;
        }
        AbstractC58260yxt<java.lang.Long> abstractC58260yxtCopydefault = AbstractC58260yxt.copydefault(0L);
        Intrinsics.copydefault(abstractC58260yxtCopydefault);
        return abstractC58260yxtCopydefault;
    }

    public static final InterfaceC58261yxu iwGUEr(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC58261yxu) function1.invoke(obj);
    }

    @Override // o.AbstractC12782ctV
    public AbstractC58260yxt<java.lang.Long> AEQbTJ(long j, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        return C10407bnq.ActionBar.getInstance$default(C10407bnq.Companion, null, 1, null).KWHzl().AEQbTJ(new WalletOpenedCoinEntity(DbNXlk(), j));
    }

    @Override // o.AbstractC12782ctV
    public AbstractC58260yxt<java.lang.Long> KWHzl(@NotNull WalletNftEntity walletNftEntity) {
        Intrinsics.checkNotNullParameter(walletNftEntity, "");
        return C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null).AhwBna().KWHzl(walletNftEntity);
    }

    @Override // o.AbstractC12782ctV
    public boolean AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        C10953byF c10953byF = C10953byF.KWHzl;
        return (Intrinsics.EZpvd((java.lang.Object) c10953byF.AEQbTJ(str), (java.lang.Object) "coin") && !AubY() && c10953byF.EZpvd(str) == flVtFt()) ? false : true;
    }

    @Override // o.AbstractC12782ctV
    public AbstractC58260yxt<java.lang.Long> EZpvd(@NotNull java.lang.String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        C10953byF c10953byF = C10953byF.KWHzl;
        if (Intrinsics.EZpvd((java.lang.Object) c10953byF.AEQbTJ(str), (java.lang.Object) "coin")) {
            return copydefault(c10953byF.EZpvd(str), z);
        }
        AbstractC58260yxt<java.lang.Long> abstractC58260yxtCopydefault = AbstractC58260yxt.copydefault(0L);
        Intrinsics.copydefault(abstractC58260yxtCopydefault);
        return abstractC58260yxtCopydefault;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AbstractC58260yxt<java.lang.Long> copydefault(long j, boolean z) {
        java.util.Iterator<C10525bqB> it = QHmsKR().iterator();
        int i = 0;
        int i2 = 0;
        while (true) {
            if (!it.hasNext()) {
                i2 = -1;
                break;
            }
            if (it.next().OLrzqt() == j) {
                break;
            }
            i2++;
        }
        if (i2 == -1) {
            java.util.Iterator<C10525bqB> it2 = this.OLrzqt.iterator();
            while (it2.hasNext()) {
                if (it2.next().OLrzqt() == j) {
                    i2 = i;
                    if (i2 != -1) {
                        return C10407bnq.ActionBar.getInstance$default(C10407bnq.Companion, null, 1, null).KWHzl().copydefault(new WalletClosedCoinEntity(DbNXlk(), j));
                    }
                } else {
                    i++;
                }
            }
        } else if (i2 != -1) {
        }
        AbstractC58260yxt<java.lang.Long> abstractC58260yxtCopydefault = AbstractC58260yxt.copydefault(0L);
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtCopydefault, "");
        return abstractC58260yxtCopydefault;
    }

    @Override // o.AbstractC12782ctV
    public java.util.List<C10525bqB> QHmsKR() {
        return CollectionsKt___CollectionsKt.djBIcL((java.util.Collection) this.isConnected, (java.lang.Iterable) this.dNCPSb);
    }

    @Override // o.AbstractC12782ctV
    public java.util.List<C10594brR> OxVOHk() {
        if (AuCTelauCTel() && (AubY() || AwvSrB() || ORxRYg())) {
            WalletSelectedChainBean walletSelectedChainBeanKWHzl = C10614brl.TaskDescription.getInstance$default(C10614brl.Companion, null, 1, null).KWHzl(DbNXlk());
            java.util.HashSet<java.lang.Long> hashSet = new java.util.HashSet<>();
            C10598brV c10598brV = C10598brV.AEQbTJ;
            java.util.ArrayList<C10594brR> arrayList = new java.util.ArrayList<>(c10598brV.AhwBna().size());
            for (CustomChainCoinMeta customChainCoinMeta : c10598brV.AhwBna()) {
                if (!hashSet.contains(java.lang.Long.valueOf(customChainCoinMeta.valueOf()))) {
                    if (walletSelectedChainBeanKWHzl.isAllNetwork()) {
                        KWHzl(hashSet, customChainCoinMeta, arrayList);
                    } else if (Intrinsics.EZpvd((java.lang.Object) walletSelectedChainBeanKWHzl.getChainId(), (java.lang.Object) java.lang.String.valueOf(customChainCoinMeta.copydefault()))) {
                        java.lang.String rpcUrl = walletSelectedChainBeanKWHzl.getRpcUrl();
                        CustomChainMeta customChainMetaOLrzqt = customChainCoinMeta.OLrzqt();
                        if (Intrinsics.EZpvd((java.lang.Object) rpcUrl, (java.lang.Object) (customChainMetaOLrzqt != null ? customChainMetaOLrzqt.isConnected() : null))) {
                            KWHzl(hashSet, customChainCoinMeta, arrayList);
                        }
                    } else {
                        KWHzl(hashSet, customChainCoinMeta, arrayList);
                    }
                } else {
                    pUU.copydefault("walletImpl", "chainId = " + customChainCoinMeta.copydefault() + " coinId = " + customChainCoinMeta.valueOf() + "  chainName = " + customChainCoinMeta.values() + " ");
                }
            }
            return arrayList;
        }
        return yDY.AhwBna();
    }

    public final void KWHzl(java.util.HashSet<java.lang.Long> hashSet, CustomChainCoinMeta customChainCoinMeta, java.util.ArrayList<C10594brR> arrayList) {
        hashSet.add(java.lang.Long.valueOf(customChainCoinMeta.valueOf()));
        C10594brR c10594brR = this.QfsBiF.get(java.lang.Long.valueOf(customChainCoinMeta.valueOf()));
        java.lang.String strValues = c10594brR != null ? c10594brR.values() : null;
        if (strValues == null || strValues.length() == 0) {
            strValues = "0";
        }
        C10594brR c10594brR2 = this.QfsBiF.get(java.lang.Long.valueOf(customChainCoinMeta.valueOf()));
        java.lang.String strAhwBna = c10594brR2 != null ? c10594brR2.AhwBna() : null;
        if (strAhwBna == null || strAhwBna.length() == 0) {
            strAhwBna = "0.00";
        }
        C10594brR c10594brR3 = new C10594brR(customChainCoinMeta, this);
        c10594brR3.EZpvd(strValues, strAhwBna);
        arrayList.add(c10594brR3);
    }

    @Override // o.AbstractC12782ctV
    public boolean AkhnZx(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return this.fJNWhG.get(java.lang.Long.valueOf(C10953byF.KWHzl.EZpvd(str))) != null;
    }

    @Override // o.AbstractC12782ctV
    public C10594brR fJNWhG(long j) {
        return this.QfsBiF.get(java.lang.Long.valueOf(j));
    }

    @Override // o.AbstractC12782ctV
    public AbstractC58260yxt<java.lang.Long> getNewProxyInstance(long j) {
        return C10639bsJ.EZpvd.AhwBna().KWHzl(new CustomChainWalletCoinEntity(DbNXlk(), j, java.lang.System.currentTimeMillis()));
    }

    /* JADX DEBUG: Type inference failed for r3v2. Raw type applied. Possible types: o.yxt<R>, java.lang.Object, o.yxt<java.lang.Long> */
    @Override // o.AbstractC12782ctV
    public AbstractC58260yxt<java.lang.Long> values(long j) {
        AbstractC58260yxt<java.lang.Integer> abstractC58260yxtCopydefault = C10639bsJ.EZpvd.AhwBna().copydefault(DbNXlk(), j);
        final Function1 function1 = new Function1() { // from class: o.cDl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return cCS.OLrzqt((java.lang.Integer) obj);
            }
        };
        AbstractC58260yxt abstractC58260yxtCopydefault2 = abstractC58260yxtCopydefault.copydefault(new InterfaceC58229yxO() { // from class: o.cDi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return cCS.DbNXlk(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtCopydefault2, "");
        return abstractC58260yxtCopydefault2;
    }

    public static final java.lang.Long DbNXlk(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (java.lang.Long) function1.invoke(obj);
    }

    public static final java.lang.Long OLrzqt(java.lang.Integer num) {
        Intrinsics.checkNotNullParameter(num, "");
        return java.lang.Long.valueOf(num.intValue());
    }

    public C10525bqB copydefault(long j, java.lang.Integer num) {
        java.lang.String address;
        C10854bwM c10854bwMKWHzl = C10954byG.EZpvd.valueOf().KWHzl(java.lang.Long.valueOf(j));
        if (c10854bwMKWHzl == null) {
            return null;
        }
        ChainAddress chainAddressOLrzqt = OLrzqt(c10854bwMKWHzl.AEQbTJ(), num);
        if (chainAddressOLrzqt == null || (address = chainAddressOLrzqt.getAddress()) == null) {
            address = "";
        }
        C10525bqB c10525bqBOLrzqt = OLrzqt(j, address);
        if (c10525bqBOLrzqt != null) {
            return c10525bqBOLrzqt;
        }
        java.util.List<C10525bqB> listFARcdN = fARcdN(j);
        if (listFARcdN != null) {
            return (C10525bqB) CollectionsKt___CollectionsKt.firstOrNull(listFARcdN);
        }
        return null;
    }

    @Override // o.AbstractC12782ctV
    public C10525bqB OLrzqt(long j, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        java.util.List<C10525bqB> listFARcdN = fARcdN(j);
        java.lang.Object obj = null;
        if (listFARcdN == null) {
            return null;
        }
        java.util.Iterator<T> it = listFARcdN.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            java.lang.Object next = it.next();
            if (Intrinsics.EZpvd((java.lang.Object) ((C10525bqB) next).zuBGHE(), (java.lang.Object) str)) {
                obj = next;
                break;
            }
        }
        return (C10525bqB) obj;
    }

    @Override // o.AbstractC12782ctV
    public java.util.List<C10525bqB> fARcdN(long j) {
        java.util.List<C10525bqB> list = this.fetchVPNInfo.get(java.lang.Long.valueOf(j));
        return list == null ? this.RcXXUw.get(java.lang.Long.valueOf(j)) : list;
    }

    @Override // o.AbstractC12782ctV
    public C10525bqB KWHzl(long j, java.lang.Integer num) {
        java.lang.String address;
        C10854bwM c10854bwMKWHzl = C10954byG.EZpvd.valueOf().KWHzl(java.lang.Long.valueOf(j));
        if (c10854bwMKWHzl == null) {
            return null;
        }
        ChainAddress chainAddressOLrzqt = OLrzqt(c10854bwMKWHzl.AEQbTJ(), num);
        if (chainAddressOLrzqt == null || (address = chainAddressOLrzqt.getAddress()) == null) {
            address = "";
        }
        C10525bqB c10525bqBEZpvd = EZpvd(j, address);
        if (c10525bqBEZpvd != null) {
            return c10525bqBEZpvd;
        }
        java.util.List<C10525bqB> listAYXKKw = AYXKKw(j);
        C10525bqB c10525bqB = listAYXKKw != null ? (C10525bqB) CollectionsKt___CollectionsKt.firstOrNull(listAYXKKw) : null;
        return c10525bqB == null ? C10525bqB.Companion.AEQbTJ(c10854bwMKWHzl, this, address) : c10525bqB;
    }

    @Override // o.AbstractC12782ctV
    public C10525bqB EZpvd(long j, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        java.util.List<C10525bqB> listAYXKKw = AYXKKw(j);
        java.lang.Object obj = null;
        if (listAYXKKw == null) {
            return null;
        }
        java.util.Iterator<T> it = listAYXKKw.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            java.lang.Object next = it.next();
            if (Intrinsics.EZpvd((java.lang.Object) ((C10525bqB) next).zuBGHE(), (java.lang.Object) str)) {
                obj = next;
                break;
            }
        }
        return (C10525bqB) obj;
    }

    @Override // o.AbstractC12782ctV, o.InterfaceC9738bbJ
    public java.util.List<C10525bqB> AYXKKw(long j) {
        C10854bwM c10854bwMKWHzl;
        if (!djBIcL(java.lang.Long.valueOf(j)) || (c10854bwMKWHzl = C10954byG.EZpvd.valueOf().KWHzl(java.lang.Long.valueOf(j))) == null) {
            return null;
        }
        java.util.HashMap map = new java.util.HashMap();
        java.util.List<C10525bqB> listFARcdN = fARcdN(j);
        if (listFARcdN != null) {
            for (C10525bqB c10525bqB : listFARcdN) {
                map.put(c10525bqB.zuBGHE(), c10525bqB);
            }
        }
        java.util.List<TokenAsset> listOLrzqt = C10407bnq.ActionBar.getInstance$default(C10407bnq.Companion, null, 1, null).copydefault().OLrzqt(DbNXlk(), j);
        if (listOLrzqt != null) {
            for (TokenAsset tokenAsset : listOLrzqt) {
                map.put(tokenAsset.getAddress(), C10525bqB.Companion.AEQbTJ(tokenAsset, c10854bwMKWHzl, this));
            }
        }
        java.util.Collection collectionValues = map.values();
        Intrinsics.checkNotNullExpressionValue(collectionValues, "");
        return CollectionsKt___CollectionsKt.AxsJAYsNCnLh(collectionValues);
    }

    @Override // o.InterfaceC9738bbJ
    public InterfaceC9742bbN valueOf(long j) {
        C10407bnq instance$default = C10407bnq.ActionBar.getInstance$default(C10407bnq.Companion, null, 1, null);
        java.util.List<C10525bqB> listAYXKKw = AYXKKw(j);
        if (listAYXKKw == null) {
            return null;
        }
        return (InterfaceC9742bbN) CollectionsKt___CollectionsKt.firstOrNull(instance$default.EZpvd(listAYXKKw, C56402yEa.EZpvd(2)));
    }

    @Override // o.AbstractC12782ctV, o.InterfaceC9738bbJ
    public java.util.List<InterfaceC9742bbN> KWHzl(long j) {
        C10854bwM c10854bwMKWHzl;
        java.util.ArrayList arrayList = null;
        if (!djBIcL(java.lang.Long.valueOf(j)) || (c10854bwMKWHzl = C10954byG.EZpvd.valueOf().KWHzl(java.lang.Long.valueOf(j))) == null) {
            return null;
        }
        java.util.List<ChainAddress> listHDKMBd = hDKMBd(c10854bwMKWHzl.AEQbTJ());
        if (listHDKMBd != null) {
            arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listHDKMBd, 10));
            for (ChainAddress chainAddress : listHDKMBd) {
                C10525bqB c10525bqBEZpvd = EZpvd(j, chainAddress.getAddress());
                if (c10525bqBEZpvd == null) {
                    c10525bqBEZpvd = C10525bqB.Companion.AEQbTJ(c10854bwMKWHzl, this, chainAddress.getAddress());
                }
                arrayList.add(c10525bqBEZpvd);
            }
        }
        return arrayList;
    }

    @Override // o.AbstractC12782ctV, o.InterfaceC9738bbJ
    public InterfaceC9742bbN copydefault(long j, java.lang.Integer num, boolean z) {
        InterfaceC9742bbN interfaceC9742bbN;
        java.lang.Object next;
        C10854bwM c10854bwMKWHzl = C10954byG.EZpvd.valueOf().KWHzl(java.lang.Long.valueOf(j));
        if (c10854bwMKWHzl == null) {
            return null;
        }
        ChainAddress chainAddressOLrzqt = OLrzqt(c10854bwMKWHzl.AEQbTJ(), num);
        java.util.List<InterfaceC9742bbN> listKWHzl = KWHzl(j);
        if (listKWHzl != null) {
            java.util.Iterator<T> it = listKWHzl.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                InterfaceC9780bbz interfaceC9780bbzEZpvd = ((InterfaceC9742bbN) next).EZpvd();
                if (Intrinsics.EZpvd(interfaceC9780bbzEZpvd != null ? java.lang.Integer.valueOf(interfaceC9780bbzEZpvd.getAddressType()) : null, chainAddressOLrzqt != null ? java.lang.Integer.valueOf(chainAddressOLrzqt.getAddressType()) : null)) {
                    break;
                }
            }
            interfaceC9742bbN = (InterfaceC9742bbN) next;
        } else {
            interfaceC9742bbN = null;
        }
        if (interfaceC9742bbN != null) {
            return interfaceC9742bbN;
        }
        if (z) {
            return fJNWhG(j);
        }
        return null;
    }

    public final boolean valueOf(java.lang.Long l) {
        java.lang.Object next;
        java.util.Iterator<T> it = QHmsKR().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            long jOLrzqt = ((C10525bqB) next).OLrzqt();
            if (l != null && jOLrzqt == l.longValue()) {
                break;
            }
        }
        return next != null;
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Ljava/lang/Long;)Lo/bbN; */
    @Override // o.InterfaceC9738bbJ
    /* JADX INFO: renamed from: AYXKKw, reason: merged with bridge method [inline-methods] */
    public C10525bqB AEQbTJ(java.lang.Long l) {
        C10854bwM c10854bwMKWHzl;
        java.lang.String address;
        if (l == null || !isConnected(C10953byF.KWHzl.AEQbTJ(l.longValue())) || (c10854bwMKWHzl = C10954byG.EZpvd.valueOf().KWHzl(l)) == null) {
            return null;
        }
        if (valueOf(l)) {
            return copydefault(l.longValue(), (java.lang.Integer) null);
        }
        C10403bnm c10403bnmCopydefault = C10407bnq.ActionBar.getInstance$default(C10407bnq.Companion, null, 1, null).copydefault();
        java.lang.String strDbNXlk = DbNXlk();
        long jLongValue = l.longValue();
        ChainAddress chainAddressOLrzqt = OLrzqt(c10854bwMKWHzl.AEQbTJ(), (java.lang.Integer) null);
        if (chainAddressOLrzqt == null || (address = chainAddressOLrzqt.getAddress()) == null) {
            address = "";
        }
        TokenAsset tokenAssetOLrzqt = c10403bnmCopydefault.OLrzqt(strDbNXlk, jLongValue, address);
        if (tokenAssetOLrzqt == null) {
            return C10525bqB.StateListAnimator.fromCoinMeta$default(C10525bqB.Companion, c10854bwMKWHzl, this, null, 4, null);
        }
        return C10525bqB.Companion.AEQbTJ(tokenAssetOLrzqt, c10854bwMKWHzl, this);
    }

    @Override // o.AbstractC12782ctV
    public AbstractC10406bnp gEmmrt(@NotNull java.lang.String str) {
        java.lang.String address;
        java.lang.String str2 = "";
        Intrinsics.checkNotNullParameter(str, "");
        C10953byF c10953byF = C10953byF.KWHzl;
        java.lang.String strAEQbTJ = c10953byF.AEQbTJ(str);
        int iHashCode = strAEQbTJ.hashCode();
        if (iHashCode == 108988) {
            if (strAEQbTJ.equals("nft")) {
                return this.QOLQEE.get(str);
            }
            return null;
        }
        if (iHashCode != 3059345) {
            if (iHashCode == 3079428 && strAEQbTJ.equals("defi")) {
                return this.uzCIH.get(str);
            }
            return null;
        }
        if (!strAEQbTJ.equals("coin")) {
            return null;
        }
        long jEZpvd = c10953byF.EZpvd(str);
        C10525bqB c10525bqBCopydefault = copydefault(jEZpvd, (java.lang.Integer) null);
        C10854bwM c10854bwMKWHzl = C10954byG.EZpvd.valueOf().KWHzl(java.lang.Long.valueOf(jEZpvd));
        if (c10525bqBCopydefault == null && c10854bwMKWHzl != null) {
            C10403bnm c10403bnmCopydefault = C10407bnq.ActionBar.getInstance$default(C10407bnq.Companion, null, 1, null).copydefault();
            java.lang.String strDbNXlk = DbNXlk();
            ChainAddress chainAddressOLrzqt = OLrzqt(c10854bwMKWHzl.AEQbTJ(), (java.lang.Integer) null);
            if (chainAddressOLrzqt != null && (address = chainAddressOLrzqt.getAddress()) != null) {
                str2 = address;
            }
            TokenAsset tokenAssetOLrzqt = c10403bnmCopydefault.OLrzqt(strDbNXlk, jEZpvd, str2);
            c10525bqBCopydefault = tokenAssetOLrzqt == null ? C10525bqB.StateListAnimator.fromCoinMeta$default(C10525bqB.Companion, c10854bwMKWHzl, this, null, 4, null) : C10525bqB.Companion.AEQbTJ(tokenAssetOLrzqt, c10854bwMKWHzl, this);
        }
        return c10525bqBCopydefault;
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(J)Lo/bbN; */
    @Override // o.InterfaceC9738bbJ
    /* JADX INFO: renamed from: isConnected, reason: merged with bridge method [inline-methods] */
    public C10525bqB AEQbTJ(long j) {
        java.lang.Object next;
        java.util.Iterator<T> it = QHmsKR().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((C10525bqB) next).KWHzl().fetchVPNInfo() == j) {
                break;
            }
        }
        return (C10525bqB) next;
    }

    @Override // o.AbstractC12782ctV
    public java.util.List<C10525bqB> AEQbTJ(@NotNull java.util.List<java.lang.Integer> list, @NotNull java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.Long, java.util.HashMap<java.lang.String, WalletCoinAssetEntity>>> map) {
        java.util.HashMap<java.lang.String, WalletCoinAssetEntity> map2;
        java.util.Collection<WalletCoinAssetEntity> collectionValues;
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(map, "");
        java.util.List<C10854bwM> listQVsKAR = QVsKAR();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (C10854bwM c10854bwM : listQVsKAR) {
            java.util.List<TokenAsset> listOLrzqt = C10407bnq.ActionBar.getInstance$default(C10407bnq.Companion, null, 1, null).copydefault().OLrzqt(DbNXlk(), c10854bwM.AhwBna());
            if (listOLrzqt == null) {
                java.util.HashMap<java.lang.Long, java.util.HashMap<java.lang.String, WalletCoinAssetEntity>> map3 = map.get(DbNXlk());
                java.util.List<WalletCoinAssetEntity> listAxsJAYsNCnLh = (map3 == null || (map2 = map3.get(java.lang.Long.valueOf(c10854bwM.AhwBna()))) == null || (collectionValues = map2.values()) == null) ? null : CollectionsKt___CollectionsKt.AxsJAYsNCnLh(collectionValues);
                if (listAxsJAYsNCnLh != null && !listAxsJAYsNCnLh.isEmpty()) {
                    for (WalletCoinAssetEntity walletCoinAssetEntity : listAxsJAYsNCnLh) {
                        C10525bqB.StateListAnimator stateListAnimator = C10525bqB.Companion;
                        Intrinsics.copydefault(walletCoinAssetEntity);
                        arrayList.add(stateListAnimator.copydefault(walletCoinAssetEntity, c10854bwM, this));
                    }
                }
                C10525bqB c10525bqBCopydefault = copydefault(c10854bwM.AhwBna(), (java.lang.Integer) null);
                if (c10525bqBCopydefault == null) {
                    c10525bqBCopydefault = C10525bqB.StateListAnimator.fromCoinMeta$default(C10525bqB.Companion, c10854bwM, this, null, 4, null);
                }
                arrayList.add(c10525bqBCopydefault);
            } else {
                java.util.Iterator<T> it = listOLrzqt.iterator();
                while (it.hasNext()) {
                    arrayList.add(C10525bqB.Companion.AEQbTJ((TokenAsset) it.next(), c10854bwM, this));
                }
            }
        }
        return CollectionsKt___CollectionsKt.EZpvd(C10407bnq.ActionBar.getInstance$default(C10407bnq.Companion, null, 1, null).EZpvd(arrayList, list), C10535bqL.AEQbTJ);
    }

    @Override // o.InterfaceC9738bbJ
    public java.util.List<C10525bqB> gEmmrt() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.List<TokenAsset> listAEQbTJ = C10407bnq.ActionBar.getInstance$default(C10407bnq.Companion, null, 1, null).copydefault().AEQbTJ(DbNXlk());
        if (listAEQbTJ != null) {
            java.util.Iterator<T> it = listAEQbTJ.iterator();
            while (it.hasNext()) {
                C10854bwM c10854bwMKWHzl = C10954byG.EZpvd.valueOf().KWHzl(java.lang.Long.valueOf(((TokenAsset) it.next()).getCoinId()));
                if (c10854bwMKWHzl != null) {
                    arrayList.add(C10525bqB.StateListAnimator.fromCoinMeta$default(C10525bqB.Companion, c10854bwMKWHzl, this, null, 4, null));
                }
            }
        }
        return arrayList;
    }

    @Override // o.InterfaceC9738bbJ
    public java.util.List<InterfaceC9742bbN> values() {
        return CollectionsKt___CollectionsKt.EZpvd(C10407bnq.ActionBar.getInstance$default(C10407bnq.Companion, null, 1, null).EZpvd(QHmsKR(), C56402yEa.EZpvd(1)), C10534bqK.copydefault);
    }

    public java.util.List<C10525bqB> getFieldNames(@NotNull java.lang.String str) {
        java.util.List<C10525bqB> listEZpvd;
        Intrinsics.checkNotNullParameter(str, "");
        C10953byF c10953byF = C10953byF.KWHzl;
        if (!Intrinsics.EZpvd((java.lang.Object) c10953byF.AEQbTJ(str), (java.lang.Object) "coin")) {
            return yDY.AhwBna();
        }
        C10854bwM c10854bwMKWHzl = C10954byG.EZpvd.valueOf().KWHzl(java.lang.Long.valueOf(c10953byF.EZpvd(str)));
        if (c10854bwMKWHzl == null || !c10854bwMKWHzl.giSNqX()) {
            return yDY.AhwBna();
        }
        java.util.List<C10525bqB> listQHmsKR = QHmsKR();
        if (!(listQHmsKR instanceof java.util.Collection) || !listQHmsKR.isEmpty()) {
            for (C10525bqB c10525bqB : listQHmsKR) {
                if (c10525bqB.KWHzl().giSNqX() && Intrinsics.EZpvd((java.lang.Object) c10525bqB.valueOf(), (java.lang.Object) c10854bwMKWHzl.fJNWhG())) {
                    java.util.List<C10525bqB> list = hrNTAI().get(c10854bwMKWHzl.fJNWhG());
                    return (list == null || (listEZpvd = CollectionsKt___CollectionsKt.EZpvd(list, C10529bqF.AEQbTJ)) == null) ? yDY.AhwBna() : listEZpvd;
                }
            }
        }
        return yDY.AhwBna();
    }

    @Override // o.AbstractC12782ctV
    public java.util.Map<java.lang.String, java.util.List<C10525bqB>> hrNTAI() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<java.lang.String, java.util.List<C10854bwM>> entry : C10954byG.EZpvd.valueOf().KWHzl().entrySet()) {
            for (C10854bwM c10854bwM : entry.getValue()) {
                if (isConnected(c10854bwM.OcIXYQ())) {
                    if (linkedHashMap.get(entry.getKey()) == null) {
                        linkedHashMap.put(entry.getKey(), new java.util.ArrayList());
                    }
                    java.util.ArrayList arrayList = (java.util.ArrayList) linkedHashMap.get(entry.getKey());
                    if (arrayList != null) {
                        C10525bqB c10525bqBAEQbTJ = AEQbTJ(java.lang.Long.valueOf(c10854bwM.AhwBna()));
                        if (c10525bqBAEQbTJ == null) {
                            c10525bqBAEQbTJ = C10525bqB.StateListAnimator.fromCoinMeta$default(C10525bqB.Companion, c10854bwM, this, null, 4, null);
                        }
                        arrayList.add(c10525bqBAEQbTJ);
                    }
                }
            }
            java.util.ArrayList arrayList2 = (java.util.ArrayList) linkedHashMap.get(entry.getKey());
            if (arrayList2 != null) {
                C56407yEf.copydefault(arrayList2, C10529bqF.AEQbTJ);
            }
        }
        return linkedHashMap;
    }

    @Override // o.AbstractC12782ctV
    public java.util.Map<java.lang.String, java.util.List<java.lang.Long>> DLWbHP() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<java.lang.String, java.util.List<C10854bwM>> entry : C10954byG.EZpvd.valueOf().KWHzl().entrySet()) {
            for (C10854bwM c10854bwM : entry.getValue()) {
                if (isConnected(c10854bwM.OcIXYQ())) {
                    if (linkedHashMap.get(entry.getKey()) == null) {
                        linkedHashMap.put(entry.getKey(), new java.util.ArrayList());
                    }
                    java.util.ArrayList arrayList = (java.util.ArrayList) linkedHashMap.get(entry.getKey());
                    if (arrayList != null) {
                        arrayList.add(java.lang.Long.valueOf(c10854bwM.AhwBna()));
                    }
                }
            }
        }
        return linkedHashMap;
    }

    @Override // o.AbstractC12782ctV
    public C10594brR ejfBZ(long j) {
        return this.fJNWhG.get(java.lang.Long.valueOf(j));
    }

    @Override // o.AbstractC12782ctV, o.InterfaceC9738bbJ
    public java.util.List<C9756bbb> dvKsVJ() {
        ChainAddress chainAddress = (ChainAddress) InterfaceC9738bbJ.StateListAnimator.addressFromRealChainId$default(this, 607L, null, 2, null);
        if (chainAddress == null) {
            return yDY.AhwBna();
        }
        java.util.List<TonAddress> listKWHzl = C54901xZn.OLrzqt.KWHzl(new SignParams(607L, 607L, null, null, null, null, 0, null, true, QVAiDq(), null, 1276, null), chainAddress.getAddress());
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listKWHzl, 10));
        for (TonAddress tonAddress : listKWHzl) {
            arrayList.add(new C9756bbb(tonAddress.getType(), tonAddress.getAddr()));
        }
        return arrayList;
    }

    @Override // o.AbstractC12782ctV, o.InterfaceC9738bbJ
    public C9757bbc dxcTrN() {
        TonWalletInformation tonWalletInformationOLrzqt;
        ChainAddress chainAddress = (ChainAddress) InterfaceC9738bbJ.StateListAnimator.addressFromRealChainId$default(this, 607L, null, 2, null);
        if (chainAddress == null || (tonWalletInformationOLrzqt = C54901xZn.OLrzqt.OLrzqt(new SignParams(607L, 607L, null, null, null, null, 0, null, true, QVAiDq(), null, 1276, null), chainAddress.getPublicKey())) == null) {
            return null;
        }
        return new C9757bbc(tonWalletInformationOLrzqt.getInitCode(), tonWalletInformationOLrzqt.getInitData(), tonWalletInformationOLrzqt.getWalletStateInit(), tonWalletInformationOLrzqt.getWalletAddress());
    }

    @Override // o.AbstractC12782ctV
    public boolean fZBcTu() {
        return (AubY() || AwvSrB() || QVAiDq()) && !zblBkD();
    }

    public final void AEQbTJ(@NotNull java.util.ArrayList<C10594brR> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        for (C10594brR c10594brR : arrayList) {
            this.fJNWhG.put(java.lang.Long.valueOf(c10594brR.OLrzqt()), c10594brR);
        }
        this.fIwbmz = arrayList;
    }

    public final void AhwBna(@NotNull java.util.ArrayList<C10594brR> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        for (C10594brR c10594brR : arrayList) {
            this.QfsBiF.put(java.lang.Long.valueOf(c10594brR.OLrzqt()), c10594brR);
        }
        this.aKErDB = arrayList;
    }

    public final void copydefault(@NotNull java.util.ArrayList<C10527bqD> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        for (C10527bqD c10527bqD : arrayList) {
            this.uzCIH.put(c10527bqD.AhwBna(), c10527bqD);
        }
        this.getNewProxyInstance = arrayList;
    }

    public final void gEmmrt(@NotNull java.util.ArrayList<C10528bqE> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        for (C10528bqE c10528bqE : arrayList) {
            this.QOLQEE.put(c10528bqE.djBIcL(), c10528bqE);
        }
        this.ORxRYg = arrayList;
    }

    @Override // o.AbstractC12782ctV
    public java.util.List<MpcPrivateKey> AEQbTJ(@NotNull MpcWalletDecodeInfo mpcWalletDecodeInfo, @NotNull java.util.List<C10854bwM> list) throws java.lang.Exception {
        int value;
        Intrinsics.checkNotNullParameter(mpcWalletDecodeInfo, "");
        Intrinsics.checkNotNullParameter(list, "");
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        for (C10854bwM c10854bwM : list) {
            long jQKVWgx = c10854bwM.QKVWgx();
            long jFetchVPNInfo = c10854bwM.fetchVPNInfo();
            boolean zAhwBna = C13912dbY.copydefault.AhwBna();
            if (c10854bwM.AxsJAYaxsJAY()) {
                ChainAddress chainAddress = (ChainAddress) InterfaceC9738bbJ.StateListAnimator.addressFromRealChainId$default(this, c10854bwM.fetchVPNInfo(), null, 2, null);
                if (chainAddress == null) {
                    throw new java.lang.Exception("no address");
                }
                value = chainAddress.getAddressType();
            } else {
                value = AddressType.Legacy.getValue();
            }
            arrayList.add(new HDWalletCoin(jQKVWgx, jFetchVPNInfo, zAhwBna, value, finit(), c10854bwM.iwGUEr()));
        }
        return xYQ.KWHzl.KWHzl(mpcWalletDecodeInfo.getEcdsaShare2(), mpcWalletDecodeInfo.getEcdsaShare3(), mpcWalletDecodeInfo.getEd25519Share2(), mpcWalletDecodeInfo.getEd25519Share3(), arrayList);
    }

    @Override // o.AbstractC12782ctV
    public AbstractC58260yxt<java.lang.Long> AYXKKw(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        java.util.Iterator<C10528bqE> it = this.ORxRYg.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            if (!Intrinsics.EZpvd((java.lang.Object) it.next().djBIcL(), (java.lang.Object) str)) {
                i++;
            } else if (i != -1) {
                return C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null).AhwBna().EZpvd(DbNXlk(), str);
            }
        }
        AbstractC58260yxt<java.lang.Long> abstractC58260yxtCopydefault = AbstractC58260yxt.copydefault(0L);
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtCopydefault, "");
        return abstractC58260yxtCopydefault;
    }

    public static final java.util.List OLrzqt(cCS ccs, java.util.ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (java.lang.Object obj : arrayList) {
            if (ccs.AhwBna(java.lang.Long.valueOf(((C13924dbk) obj).OLrzqt().AhwBna()))) {
                arrayList2.add(obj);
            }
        }
        return arrayList2;
    }
}
