package o;

import androidx.fragment.app.FragmentActivity;
import com.okinc.business.defi.api.bean.BTCNFTInfo;
import com.okinc.business.defi.assets.utxo.utxomanagement.UtxoConfirmationContext;
import com.okinc.business.defi.biz.model.ChainAddress;
import com.okinc.business.defi.biz.net.bean.UTXOInfoResp;
import com.okinc.business.defi.biz.net.bean.UTXONftInfo;
import com.okinc.business.defi.biz.net.bean.UtxoInfo;
import com.okinc.business.invest_api.bean.InvestUtxoConfirmationItem;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.p2p.api.OtcExtraKeys;
import com.okinc.wallet.core.other.CalUTXOInfo;
import com.okinc.wallet.core.sign.SignParams;
import com.okinc.wallet.core.sign.utxo.DummyInfo;
import com.okinc.wallet.core.sign.utxo.NftInfo;
import com.okinc.wallet.core.sign.utxo.RSV;
import com.okinc.wallet.core.sign.utxo.UTXOTransaction;
import com.okinc.wallet.core.sign.utxo.UTXOTxIn;
import com.okinc.web3.security.bridge.MnemonicKt;
import java.math.BigDecimal;
import java.math.RoundingMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC10347bmj;
import o.C13754dXa;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ctk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C12797ctk {
    public final java.lang.String KWHzl = xYS.copydefault.KWHzl(MnemonicKt.MnemonicLanguageEnglish);
    public final int AEQbTJ = 225;
    public final int EZpvd = 4;
    public final java.lang.String OLrzqt = "1";
    public final java.lang.String copydefault = "usdt";

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int AEQbTJ() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int OLrzqt() {
        return this.EZpvd;
    }

    public final StateListAnimator copydefault(@NotNull AbstractC12782ctV abstractC12782ctV, @NotNull C10854bwM c10854bwM, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, java.util.List<UTXOInfoResp> list) {
        java.lang.String address;
        java.lang.String str5;
        java.util.ArrayList arrayList;
        C13854daT c13854daTFetchVPNInfo;
        C12797ctk c12797ctk = this;
        AbstractC12782ctV abstractC12782ctV2 = abstractC12782ctV;
        C10854bwM c10854bwM2 = c10854bwM;
        java.lang.String str6 = "";
        Intrinsics.checkNotNullParameter(abstractC12782ctV2, "");
        Intrinsics.checkNotNullParameter(c10854bwM2, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        RoundingMode roundingMode = null;
        if (list == null || list.isEmpty()) {
            return null;
        }
        BigDecimal bigDecimal = new BigDecimal("0");
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.Iterator<T> it = list.iterator();
        while (true) {
            int i = 3;
            boolean z = false;
            if (it.hasNext()) {
                UTXOInfoResp uTXOInfoResp = (UTXOInfoResp) it.next();
                if (uTXOInfoResp == null || (address = uTXOInfoResp.getAddress()) == null) {
                    address = str6;
                }
                ChainAddress chainAddressOLrzqt = c12797ctk.OLrzqt(abstractC12782ctV2, c10854bwM2, address);
                java.util.List<UtxoInfo> utxoList = uTXOInfoResp.getUtxoList();
                if (utxoList != null) {
                    for (UtxoInfo utxoInfo : utxoList) {
                        BigDecimal bigDecimalKWHzl = C54862xYb.KWHzl(bigDecimal, utxoInfo.getCoinAmount());
                        java.lang.String txHash = utxoInfo.getTxHash();
                        java.lang.String str7 = txHash == null ? str6 : txHash;
                        java.lang.String strConvertToBigIntegerString$default = C54862xYb.convertToBigIntegerString$default(utxoInfo.getVout(), z, roundingMode, i, roundingMode);
                        java.lang.String strConvertToBigIntegerString$default2 = C54862xYb.convertToBigIntegerString$default(utxoInfo.getCoinAmount(), z, roundingMode, i, roundingMode);
                        java.lang.String rawTransaction = utxoInfo.getRawTransaction();
                        java.lang.String address2 = uTXOInfoResp.getAddress();
                        java.lang.String address3 = uTXOInfoResp.getAddress();
                        if (address3 == null) {
                            address3 = str6;
                        }
                        int iEZpvd = c12797ctk.EZpvd(abstractC12782ctV2, c10854bwM2, address3);
                        int iFinit = abstractC12782ctV.finit();
                        java.util.List<UTXONftInfo> nftLocaltionVOs = utxoInfo.getNftLocaltionVOs();
                        if (nftLocaltionVOs != null) {
                            java.util.ArrayList arrayList3 = new java.util.ArrayList(C56403yEb.AYXKKw(nftLocaltionVOs, 10));
                            for (UTXONftInfo uTXONftInfo : nftLocaltionVOs) {
                                arrayList3.add(new NftInfo(uTXONftInfo.getNftId(), uTXONftInfo.getValue(), uTXONftInfo.getTokenType()));
                                str6 = str6;
                            }
                            str5 = str6;
                            arrayList = arrayList3;
                        } else {
                            str5 = str6;
                            arrayList = null;
                        }
                        java.lang.Integer utxoType = utxoInfo.getUtxoType();
                        boolean z2 = (utxoType != null && utxoType.intValue() == 4) || Intrinsics.EZpvd(utxoInfo.getHasNft(), java.lang.Boolean.TRUE);
                        java.lang.Boolean dummy = utxoInfo.getDummy();
                        AbstractC12784ctX abstractC12784ctXGwTjWJ = abstractC12782ctV.gwTjWJ();
                        java.util.ArrayList arrayList4 = arrayList2;
                        arrayList4.add(new UTXOTxIn(str7, strConvertToBigIntegerString$default, strConvertToBigIntegerString$default2, str3, rawTransaction, address2, java.lang.Integer.valueOf(iEZpvd), java.lang.Integer.valueOf(iFinit), arrayList, java.lang.Boolean.valueOf(z2), dummy, (abstractC12784ctXGwTjWJ == null || (c13854daTFetchVPNInfo = abstractC12784ctXGwTjWJ.fetchVPNInfo()) == null) ? null : c13854daTFetchVPNInfo.copydefault(), chainAddressOLrzqt != null ? chainAddressOLrzqt.getPublicKey() : null, chainAddressOLrzqt != null ? chainAddressOLrzqt.getDerivePath() : null));
                        abstractC12782ctV2 = abstractC12782ctV;
                        c10854bwM2 = c10854bwM;
                        arrayList2 = arrayList4;
                        roundingMode = null;
                        bigDecimal = bigDecimalKWHzl;
                        str6 = str5;
                        z = false;
                        i = 3;
                        c12797ctk = this;
                    }
                }
                abstractC12782ctV2 = abstractC12782ctV;
                c10854bwM2 = c10854bwM;
                arrayList2 = arrayList2;
                roundingMode = roundingMode;
                str6 = str6;
                c12797ctk = this;
            } else {
                RoundingMode roundingMode2 = roundingMode;
                return new StateListAnimator(C54862xYb.convertToBigIntegerString$default(bigDecimal, false, roundingMode2, 3, (java.lang.Object) roundingMode2), OLrzqt(C54862xYb.convertToBigIntegerString$default(bigDecimal, false, roundingMode2, 3, (java.lang.Object) roundingMode2), str, str2, str4), arrayList2);
            }
        }
    }

    public final java.lang.String OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        BigDecimal bigDecimalAEQbTJ = C54862xYb.AEQbTJ(C54862xYb.AEQbTJ(str, str2), str3);
        return (C33129mqd.gEmmrt(bigDecimalAEQbTJ, str4) && C33129mqd.AEQbTJ(bigDecimalAEQbTJ, "0")) ? C54862xYb.convertToString$default(C54862xYb.KWHzl(str3, bigDecimalAEQbTJ), false, null, null, 7, null) : str3;
    }

    public static /* synthetic */ AbstractC58185ywX getSignLength$default(C12797ctk c12797ctk, StateListAnimator stateListAnimator, AbstractC12782ctV abstractC12782ctV, C10854bwM c10854bwM, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, DummyInfo dummyInfo, java.lang.String str8, java.lang.Integer num, int i, java.lang.Object obj) {
        if (obj == null) {
            return c12797ctk.AEQbTJ(stateListAnimator, abstractC12782ctV, c10854bwM, str, str2, str3, str4, str5, str6, (i & 512) != 0 ? null : str7, (i & 1024) != 0 ? null : dummyInfo, (i & 2048) != 0 ? null : str8, (i & 4096) != 0 ? null : num);
        }
        throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getSignLength");
    }

    public static final java.lang.Integer AEQbTJ(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (java.lang.Integer) function1.invoke(obj);
    }

    public AbstractC58185ywX<java.lang.Integer> AEQbTJ(final StateListAnimator stateListAnimator, @NotNull final AbstractC12782ctV abstractC12782ctV, @NotNull final C10854bwM c10854bwM, @NotNull final java.lang.String str, @NotNull final java.lang.String str2, @NotNull final java.lang.String str3, @NotNull final java.lang.String str4, @NotNull final java.lang.String str5, @NotNull final java.lang.String str6, final java.lang.String str7, final DummyInfo dummyInfo, final java.lang.String str8, final java.lang.Integer num) {
        Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
        Intrinsics.checkNotNullParameter(c10854bwM, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        AbstractC58185ywX abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl("");
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        AbstractC58185ywX abstractC58185ywXOLrzqt = C11607cUn.OLrzqt(abstractC58185ywXKWHzl);
        final Function1 function1 = new Function1() { // from class: o.cth
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C12797ctk.copydefault(stateListAnimator, str6, str5, c10854bwM, this, abstractC12782ctV, str4, str, str2, str3, str7, dummyInfo, str8, num, (java.lang.String) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXAEQbTJ = abstractC58185ywXOLrzqt.AEQbTJ(new InterfaceC58229yxO() { // from class: o.ctp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C12797ctk.AEQbTJ(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        return C11607cUn.AEQbTJ(abstractC58185ywXAEQbTJ);
    }

    public static final java.lang.Integer copydefault(StateListAnimator stateListAnimator, java.lang.String str, java.lang.String str2, C10854bwM c10854bwM, C12797ctk c12797ctk, AbstractC12782ctV abstractC12782ctV, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, DummyInfo dummyInfo, java.lang.String str8, java.lang.Integer num, java.lang.String str9) {
        Intrinsics.checkNotNullParameter(str9, "");
        int length = 0;
        if (stateListAnimator != null) {
            java.lang.String str10 = (str == null || str.length() == 0) ? str2 : str;
            C10854bwM c10854bwMKWHzl = c10854bwM.KWHzl();
            long jQKVWgx = c10854bwMKWHzl != null ? c10854bwMKWHzl.QKVWgx() : -1L;
            C10854bwM c10854bwMKWHzl2 = c10854bwM.KWHzl();
            CalUTXOInfo calUTXOInfoKWHzl = C54904xZq.copydefault.KWHzl(new SignParams(jQKVWgx, c10854bwMKWHzl2 != null ? c10854bwMKWHzl2.fetchVPNInfo() : -1L, c12797ctk.KWHzl(c10854bwM), null, null, java.lang.Integer.valueOf(abstractC12782ctV.finit()), c12797ctk.EZpvd(abstractC12782ctV, c10854bwM, str2), null, false, false, null, 1944, null), new UTXOTransaction(stateListAnimator.OLrzqt(), C54862xYb.convertToBigIntegerString$default(str3, false, (RoundingMode) null, 3, (java.lang.Object) null), str2, str10, str4, c12797ctk.OLrzqt(stateListAnimator.OLrzqt(), str5, str6, str3), stateListAnimator.KWHzl(), (java.lang.String) null, str7, (java.lang.String) null, (java.lang.String) null, dummyInfo, (java.lang.String) null, (java.lang.Integer) null, (java.lang.String) null, (java.lang.Boolean) null, (java.util.List) null, str8, num, 128640, (DefaultConstructorMarker) null));
            length = calUTXOInfoKWHzl.getLength() > 0 ? calUTXOInfoKWHzl.getLength() : c12797ctk.AEQbTJ;
        }
        return java.lang.Integer.valueOf(length);
    }

    public final java.lang.String copydefault(@NotNull UTXOTransaction uTXOTransaction) {
        Intrinsics.checkNotNullParameter(uTXOTransaction, "");
        return C54904xZq.copydefault.copydefault(uTXOTransaction);
    }

    public final java.lang.String KWHzl(C10854bwM c10854bwM) {
        if (c10854bwM == null || !c10854bwM.accept()) {
            return null;
        }
        return this.copydefault;
    }

    public final ChainAddress OLrzqt(@NotNull AbstractC12782ctV abstractC12782ctV, @NotNull C10854bwM c10854bwM, @NotNull java.lang.String str) {
        java.lang.Object next;
        Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
        Intrinsics.checkNotNullParameter(c10854bwM, "");
        Intrinsics.checkNotNullParameter(str, "");
        java.util.Iterator<T> it = abstractC12782ctV.EZpvd().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            ChainAddress chainAddress = (ChainAddress) next;
            if (chainAddress.getCoinId() == c10854bwM.AEQbTJ() && Intrinsics.EZpvd((java.lang.Object) chainAddress.getAddress(), (java.lang.Object) str)) {
                break;
            }
        }
        return (ChainAddress) next;
    }

    public final int EZpvd(@NotNull AbstractC12782ctV abstractC12782ctV, @NotNull C10854bwM c10854bwM, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
        Intrinsics.checkNotNullParameter(c10854bwM, "");
        Intrinsics.checkNotNullParameter(str, "");
        ChainAddress chainAddressOLrzqt = OLrzqt(abstractC12782ctV, c10854bwM, str);
        java.lang.Integer numValueOf = chainAddressOLrzqt != null ? java.lang.Integer.valueOf(chainAddressOLrzqt.getAddressType()) : null;
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        C8322bAY c8322bAY = C8322bAY.KWHzl;
        C10854bwM c10854bwMKWHzl = c10854bwM.KWHzl();
        return c8322bAY.KWHzl(c10854bwMKWHzl != null ? c10854bwMKWHzl.fetchVPNInfo() : -1L, str);
    }

    public final java.util.List<java.lang.String> copydefault(java.util.List<UTXOInfoResp> list) {
        UTXONftInfo uTXONftInfo;
        java.lang.String nftId;
        if (list == null || list.isEmpty()) {
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (list != null) {
            java.util.Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                java.util.List<UtxoInfo> utxoList = ((UTXOInfoResp) it.next()).getUtxoList();
                if (utxoList != null) {
                    java.util.Iterator<T> it2 = utxoList.iterator();
                    while (it2.hasNext()) {
                        java.util.List<UTXONftInfo> nftLocaltionVOs = ((UtxoInfo) it2.next()).getNftLocaltionVOs();
                        if (nftLocaltionVOs != null && (uTXONftInfo = (UTXONftInfo) CollectionsKt___CollectionsKt.firstOrNull(nftLocaltionVOs)) != null && (nftId = uTXONftInfo.getNftId()) != null) {
                            arrayList.add(nftId);
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    public final java.util.List<java.lang.String> EZpvd(java.util.List<UTXOInfoResp> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (list != null) {
            java.util.Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                java.util.List<UtxoInfo> utxoList = ((UTXOInfoResp) it.next()).getUtxoList();
                if (utxoList != null) {
                    java.util.Iterator<T> it2 = utxoList.iterator();
                    while (it2.hasNext()) {
                        java.lang.String inscriptionId = ((UtxoInfo) it2.next()).getInscriptionId();
                        if (inscriptionId != null) {
                            arrayList.add(inscriptionId);
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    public final java.lang.String KWHzl(@NotNull RSV rsv) {
        Intrinsics.checkNotNullParameter(rsv, "");
        return rsv.getR() + rsv.getS() + rsv.getV();
    }

    /* JADX INFO: renamed from: o.ctk$StateListAnimator */
    public static final class StateListAnimator {
        public java.lang.String EZpvd;
        public java.util.ArrayList<UTXOTxIn> KWHzl;
        public java.lang.String copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator() {
            this(null, null, null, 7, null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.ArrayList<UTXOTxIn> KWHzl() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String OLrzqt() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String copydefault() {
            return this.EZpvd;
        }

        public StateListAnimator(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.util.ArrayList<UTXOTxIn> arrayList) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(arrayList, "");
            this.copydefault = str;
            this.EZpvd = str2;
            this.KWHzl = arrayList;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0015: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0007: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.String))
  (wrap:java.util.ArrayList:?: TERNARY null = ((wrap:int:0x000c: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.ArrayList:0x0012: CONSTRUCTOR  A[MD:():void (c), WRAPPED] (LINE:297) call: java.util.ArrayList.<init>():void type: CONSTRUCTOR) : (r4v0 java.util.ArrayList))
 A[MD:(java.lang.String, java.lang.String, java.util.ArrayList<com.okinc.wallet.core.sign.utxo.UTXOTxIn>):void (m)] (LINE:294) call: o.ctk.StateListAnimator.<init>(java.lang.String, java.lang.String, java.util.ArrayList):void type: THIS */
        public /* synthetic */ StateListAnimator(java.lang.String str, java.lang.String str2, java.util.ArrayList arrayList, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? new java.util.ArrayList() : arrayList);
        }
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.bmm.handleUtxoConfirmation$default(o.bmm, android.content.Context, java.lang.String, long, java.lang.Integer, java.util.List, boolean, androidx.fragment.app.FragmentActivity, com.okinc.business.defi.assets.utxo.utxomanagement.UtxoConfirmationContext, int, java.lang.Object):o.ywX */
    public final AbstractC58185ywX<AbstractC10347bmj> KWHzl(java.lang.String str, long j, int i, java.util.List<InvestUtxoConfirmationItem> list, boolean z, FragmentActivity fragmentActivity) {
        C10350bmm c10350bmm = C10350bmm.AEQbTJ;
        android.content.Context applicationContext = C43246rlf.OLrzqt.valueOf().getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "");
        return c10350bmm.KWHzl(applicationContext, str, j, java.lang.Integer.valueOf(i), list, z, fragmentActivity, (128 & 128) != 0 ? UtxoConfirmationContext.Undefined : null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r13v0, resolved type: o.ctk */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AbstractC58185ywX checkUtxoConflict$default(C12797ctk c12797ctk, ResponseData responseData, java.lang.String str, java.util.List list, long j, int i, java.lang.String str2, java.util.List list2, boolean z, FragmentActivity fragmentActivity, int i2, java.lang.Object obj) {
        if (obj == null) {
            return c12797ctk.copydefault(responseData, str, list, j, i, str2, (i2 & 64) != 0 ? yDY.AhwBna() : list2, (i2 & 128) != 0 ? false : z, (i2 & 256) != 0 ? null : fragmentActivity);
        }
        throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: checkUtxoConflict");
    }

    public final <T> AbstractC58185ywX<ResponseData<? extends T>> copydefault(@NotNull final ResponseData<T> responseData, @NotNull java.lang.String str, java.util.List<UTXOInfoResp> list, long j, int i, @NotNull java.lang.String str2, @NotNull java.util.List<BTCNFTInfo> list2, boolean z, FragmentActivity fragmentActivity) {
        Intrinsics.checkNotNullParameter(responseData, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(list2, "");
        java.util.List<UTXOInfoResp> listAhwBna = list == null ? yDY.AhwBna() : list;
        java.util.ArrayList<UtxoInfo> arrayList = new java.util.ArrayList();
        java.util.Iterator<T> it = listAhwBna.iterator();
        while (it.hasNext()) {
            java.util.List<UtxoInfo> utxoList = ((UTXOInfoResp) it.next()).getUtxoList();
            if (utxoList == null) {
                utxoList = yDY.AhwBna();
            }
            C56406yEe.KWHzl(arrayList, utxoList);
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(arrayList, 10));
        for (UtxoInfo utxoInfo : arrayList) {
            java.lang.String txHash = utxoInfo.getTxHash();
            java.lang.String str3 = txHash == null ? "" : txHash;
            int iAhwBna = C33129mqd.AhwBna(utxoInfo.getVout());
            int iAhwBna2 = C33129mqd.AhwBna(utxoInfo.getStatus());
            java.lang.Integer utxoStatusType = utxoInfo.getUtxoStatusType();
            boolean z2 = utxoStatusType != null && utxoStatusType.intValue() == 1;
            long jValueOf = C33129mqd.valueOf(utxoInfo.getCoinAmount());
            java.lang.String strKWHzl = KWHzl(utxoInfo);
            java.lang.String strEZpvd = EZpvd(utxoInfo, list2);
            arrayList2.add(new InvestUtxoConfirmationItem(str3, iAhwBna, java.lang.Integer.valueOf(iAhwBna2), z2, java.lang.Long.valueOf(jValueOf), strKWHzl, strEZpvd == null ? str2 : strEZpvd));
        }
        AbstractC58185ywX<AbstractC10347bmj> abstractC58185ywXKWHzl = KWHzl(str, j, i, arrayList2, z, fragmentActivity);
        final Function1 function1 = new Function1() { // from class: o.ctq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C12797ctk.OLrzqt(responseData, (AbstractC10347bmj) obj);
            }
        };
        AbstractC58185ywX<ResponseData<? extends T>> abstractC58185ywX = (AbstractC58185ywX<ResponseData<? extends T>>) abstractC58185ywXKWHzl.KWHzl(new InterfaceC58229yxO() { // from class: o.ctm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C12797ctk.OLrzqt(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywX, "");
        return abstractC58185ywX;
    }

    public static final InterfaceC60096zvd OLrzqt(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    public static final InterfaceC60096zvd OLrzqt(ResponseData responseData, AbstractC10347bmj abstractC10347bmj) {
        Intrinsics.checkNotNullParameter(abstractC10347bmj, "");
        if ((abstractC10347bmj instanceof AbstractC10347bmj.TaskDescription) || (abstractC10347bmj instanceof AbstractC10347bmj.Application)) {
            return AbstractC58185ywX.KWHzl(responseData);
        }
        if (abstractC10347bmj instanceof AbstractC10347bmj.ActionBar) {
            return AbstractC58185ywX.KWHzl(new ResponseData(-5015, null, null, null, null, null, 62, null));
        }
        if (!(abstractC10347bmj instanceof AbstractC10347bmj.Activity)) {
            throw new NoWhenBranchMatchedException();
        }
        return AbstractC58185ywX.KWHzl(new ResponseData(-5015, ((AbstractC10347bmj.Activity) abstractC10347bmj).OLrzqt(), null, null, null, null, 60, null));
    }

    public final java.lang.String KWHzl(UtxoInfo utxoInfo) {
        UTXONftInfo uTXONftInfo;
        java.lang.String nftId = utxoInfo.getNftId();
        if (nftId != null) {
            return nftId;
        }
        java.util.List<UTXONftInfo> nftLocaltionVOs = utxoInfo.getNftLocaltionVOs();
        if (nftLocaltionVOs == null || (uTXONftInfo = (UTXONftInfo) CollectionsKt___CollectionsKt.firstOrNull(nftLocaltionVOs)) == null) {
            return null;
        }
        return uTXONftInfo.getNftId();
    }

    public final java.lang.String AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull C10854bwM c10854bwM) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(c10854bwM, "");
        if (C33129mqd.valueOf(str, C54862xYb.OLrzqt(str2, "2"))) {
            return C33069mpW.copydefault(C13754dXa.FragmentManager.OxVOHk, C56424yEw.gEmmrt(C56390yDp.OLrzqt(OtcExtraKeys.AMOUNT, C54862xYb.OLrzqt(str)), C56390yDp.OLrzqt("token", c10854bwM.fJNWhG())));
        }
        return C33129mqd.AEQbTJ(str, C54862xYb.OLrzqt(str2, "2")) ? C33069mpW.copydefault(C13754dXa.FragmentManager.OJuSTm, C56424yEw.gEmmrt(C56390yDp.OLrzqt("num1", C54862xYb.OLrzqt(str2)), C56390yDp.OLrzqt("token", c10854bwM.fJNWhG()), C56390yDp.OLrzqt("num2", C54862xYb.OLrzqt(C54862xYb.convertToString$default(C54862xYb.AEQbTJ(str, str2), false, null, null, 7, null))), C56390yDp.OLrzqt("token", c10854bwM.fJNWhG()))) : "";
    }

    /* JADX INFO: renamed from: o.ctk$Application */
    public static final class Application {
        public java.lang.String AEQbTJ;
        public boolean AhwBna;
        public FragmentActivity EZpvd;
        public java.lang.String KWHzl;
        public long OLrzqt;
        public java.util.List<BTCNFTInfo> copydefault;
        public ResponseData<java.util.List<UTXOInfoResp>> djBIcL;
        public java.util.List<UTXOInfoResp> gEmmrt;
        public int valueOf;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AEQbTJ() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ResponseData<java.util.List<UTXOInfoResp>> AhwBna() {
            return this.djBIcL;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final long EZpvd() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<BTCNFTInfo> KWHzl() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Application KWHzl(@NotNull ResponseData<java.util.List<UTXOInfoResp>> responseData, @NotNull java.lang.String str, java.util.List<UTXOInfoResp> list, long j, int i, @NotNull java.lang.String str2, @NotNull java.util.List<BTCNFTInfo> list2, boolean z, FragmentActivity fragmentActivity) {
            Intrinsics.checkNotNullParameter(responseData, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(list2, "");
            return new Application(responseData, str, list, j, i, str2, list2, z, fragmentActivity);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String OLrzqt() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final FragmentActivity copydefault() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean djBIcL() {
            return this.AhwBna;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Application)) {
                return false;
            }
            Application application = (Application) obj;
            return Intrinsics.EZpvd(this.djBIcL, application.djBIcL) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) application.KWHzl) && Intrinsics.EZpvd(this.gEmmrt, application.gEmmrt) && this.OLrzqt == application.OLrzqt && this.valueOf == application.valueOf && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) application.AEQbTJ) && Intrinsics.EZpvd(this.copydefault, application.copydefault) && this.AhwBna == application.AhwBna && Intrinsics.EZpvd(this.EZpvd, application.EZpvd);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<UTXOInfoResp> gEmmrt() {
            return this.gEmmrt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = this.djBIcL.hashCode();
            int iHashCode2 = this.KWHzl.hashCode();
            java.util.List<UTXOInfoResp> list = this.gEmmrt;
            int iHashCode3 = list == null ? 0 : list.hashCode();
            int iHashCode4 = java.lang.Long.hashCode(this.OLrzqt);
            int iHashCode5 = java.lang.Integer.hashCode(this.valueOf);
            int iHashCode6 = this.AEQbTJ.hashCode();
            int iHashCode7 = this.copydefault.hashCode();
            int iHashCode8 = java.lang.Boolean.hashCode(this.AhwBna);
            FragmentActivity fragmentActivity = this.EZpvd;
            return (((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + (fragmentActivity != null ? fragmentActivity.hashCode() : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "UTXOConflictParam(txInsBean=" + this.djBIcL + ", address=" + this.KWHzl + ", utxoList=" + this.gEmmrt + ", coinId=" + this.OLrzqt + ", txType=" + this.valueOf + ", imageUrl=" + this.AEQbTJ + ", btcNftDataList=" + this.copydefault + ", isNftListing=" + this.AhwBna + ", dialogFragmentActivity=" + this.EZpvd + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int valueOf() {
            return this.valueOf;
        }

        public Application(@NotNull ResponseData<java.util.List<UTXOInfoResp>> responseData, @NotNull java.lang.String str, java.util.List<UTXOInfoResp> list, long j, int i, @NotNull java.lang.String str2, @NotNull java.util.List<BTCNFTInfo> list2, boolean z, FragmentActivity fragmentActivity) {
            Intrinsics.checkNotNullParameter(responseData, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(list2, "");
            this.djBIcL = responseData;
            this.KWHzl = str;
            this.gEmmrt = list;
            this.OLrzqt = j;
            this.valueOf = i;
            this.AEQbTJ = str2;
            this.copydefault = list2;
            this.AhwBna = z;
            this.EZpvd = fragmentActivity;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x002b: CONSTRUCTOR 
  (r14v0 com.okinc.network.okg.response.ResponseData)
  (r15v0 java.lang.String)
  (r16v0 java.util.List)
  (r17v0 long)
  (r19v0 int)
  (r20v0 java.lang.String)
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0002: ARITH (r24v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x000a: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:414)) : (r21v0 java.util.List))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x000e: ARITH (r24v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? false : (r22v0 boolean))
  (wrap:androidx.fragment.app.FragmentActivity:?: TERNARY null = ((wrap:int:0x0017: ARITH (r24v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null androidx.fragment.app.FragmentActivity) : (r23v0 androidx.fragment.app.FragmentActivity))
 A[MD:(com.okinc.network.okg.response.ResponseData<java.util.List<com.okinc.business.defi.biz.net.bean.UTXOInfoResp>>, java.lang.String, java.util.List<com.okinc.business.defi.biz.net.bean.UTXOInfoResp>, long, int, java.lang.String, java.util.List<com.okinc.business.defi.api.bean.BTCNFTInfo>, boolean, androidx.fragment.app.FragmentActivity):void (m)] (LINE:407) call: o.ctk.Application.<init>(com.okinc.network.okg.response.ResponseData, java.lang.String, java.util.List, long, int, java.lang.String, java.util.List, boolean, androidx.fragment.app.FragmentActivity):void type: THIS */
        public /* synthetic */ Application(ResponseData responseData, java.lang.String str, java.util.List list, long j, int i, java.lang.String str2, java.util.List list2, boolean z, FragmentActivity fragmentActivity, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(responseData, str, list, j, i, str2, (i2 & 64) != 0 ? yDY.AhwBna() : list2, (i2 & 128) != 0 ? false : z, (i2 & 256) != 0 ? null : fragmentActivity);
        }
    }

    public final java.lang.String KWHzl(@NotNull java.util.List<UTXOTxIn> list) {
        Intrinsics.checkNotNullParameter(list, "");
        java.util.Iterator<T> it = list.iterator();
        java.lang.String strAddS$default = "0";
        while (it.hasNext()) {
            strAddS$default = C33129mqd.addS$default(strAddS$default, ((UTXOTxIn) it.next()).getCoin_amount(), null, null, null, 14, null);
        }
        return strAddS$default;
    }

    public final java.lang.String OLrzqt(java.util.List<UTXOInfoResp> list) {
        java.lang.String str = "0";
        if (list != null) {
            java.util.Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                java.util.List<UtxoInfo> utxoList = ((UTXOInfoResp) it.next()).getUtxoList();
                if (utxoList != null) {
                    java.util.Iterator<T> it2 = utxoList.iterator();
                    java.lang.String strAddS$default = str;
                    while (it2.hasNext()) {
                        strAddS$default = C33129mqd.addS$default(strAddS$default, ((UtxoInfo) it2.next()).getCoinAmount(), null, null, null, 14, null);
                    }
                    str = strAddS$default;
                }
            }
        }
        return str;
    }

    public final boolean AhwBna(java.util.List<UTXOInfoResp> list) {
        if (list == null) {
            return false;
        }
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            java.util.List<UtxoInfo> utxoList = ((UTXOInfoResp) it.next()).getUtxoList();
            if (utxoList != null) {
                java.util.Iterator<T> it2 = utxoList.iterator();
                while (it2.hasNext()) {
                    java.lang.Integer status = ((UtxoInfo) it2.next()).getStatus();
                    if (status != null && status.intValue() == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final boolean KWHzl(java.util.List<UTXOInfoResp> list, @NotNull java.lang.String str) {
        java.lang.Object next;
        java.util.List<UtxoInfo> utxoList;
        Intrinsics.checkNotNullParameter(str, "");
        if (list == null) {
            return false;
        }
        java.util.Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (Intrinsics.EZpvd((java.lang.Object) ((UTXOInfoResp) next).getAddress(), (java.lang.Object) str)) {
                break;
            }
        }
        UTXOInfoResp uTXOInfoResp = (UTXOInfoResp) next;
        if (uTXOInfoResp == null || (utxoList = uTXOInfoResp.getUtxoList()) == null) {
            return false;
        }
        java.util.Iterator<T> it2 = utxoList.iterator();
        while (it2.hasNext()) {
            if (!Intrinsics.EZpvd(((UtxoInfo) it2.next()).getHasCheckNftExist(), java.lang.Boolean.TRUE)) {
                return true;
            }
        }
        return false;
    }

    public final boolean valueOf(java.util.List<UTXOInfoResp> list) {
        if (list == null) {
            return false;
        }
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            java.util.List<UtxoInfo> utxoList = ((UTXOInfoResp) it.next()).getUtxoList();
            if (utxoList != null) {
                java.util.Iterator<T> it2 = utxoList.iterator();
                while (it2.hasNext()) {
                    if (Intrinsics.EZpvd(((UtxoInfo) it2.next()).getHasNft(), java.lang.Boolean.TRUE)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final boolean AEQbTJ(java.util.List<UtxoInfo> list) {
        if (list == null) {
            return false;
        }
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (Intrinsics.EZpvd(((UtxoInfo) it.next()).getHasNft(), java.lang.Boolean.TRUE)) {
                return true;
            }
        }
        return false;
    }

    public final java.lang.String EZpvd(UtxoInfo utxoInfo, java.util.List<BTCNFTInfo> list) {
        java.lang.Object next;
        java.util.Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (Intrinsics.EZpvd((java.lang.Object) ((BTCNFTInfo) next).getNftId(), (java.lang.Object) KWHzl(utxoInfo))) {
                break;
            }
        }
        BTCNFTInfo bTCNFTInfo = (BTCNFTInfo) next;
        if (bTCNFTInfo != null) {
            return bTCNFTInfo.getNftLogoUrl();
        }
        return null;
    }
}
