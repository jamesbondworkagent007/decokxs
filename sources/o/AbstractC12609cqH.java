package o;

import com.google.firebase.messaging.Constants;
import com.okinc.business.defi.biz.core.tx.TransactionType;
import com.okinc.business.defi.biz.core.tx.transaction.TransactionFeeInfo;
import com.okinc.business.defi.biz.core.tx.wallet.OkTransactionWallet;
import com.okinc.business.defi.biz.core.ws.channel.WalletCoinAssetSubManager;
import com.okinc.business.defi.biz.model.ChainAddress;
import com.okinc.business.defi.biz.net.bean.TxToastCheckBizAndPayloadInfo;
import com.okinc.business.defi.wallet.transfer.manager.FreeGasManager;
import com.okinc.localization.util.format.DisplaySign;
import java.math.BigDecimal;
import java.math.RoundingMode;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC12609cqH;
import o.C12827cuN;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.cqH, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC12609cqH {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int OLrzqt = 8;
    public boolean DbNXlk;
    public InterfaceC58217yxC EZpvd;
    public WalletCoinAssetSubManager.TaskDescription copydefault;
    public FreeGasManager.UserFreeGasInfo djBIcL;
    public java.lang.String ejfBZ;
    public TransactionType fIwbmz;
    public java.lang.String fJNWhG;
    public OkTransactionWallet fetchVPNInfo;
    public TxToastCheckBizAndPayloadInfo getNewProxyInstance;
    public java.lang.String hDKMBd;
    public C12623cqV valueOf;
    public boolean values;
    public final java.lang.String KWHzl = "OKWTransaction";
    public C13934dbu fARcdN = new C13934dbu();
    public TransactionFeeInfo AuCTel = new TransactionFeeInfo(null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, null);
    public java.lang.String AYXKKw = "";
    public java.lang.String isConnected = "";
    public final java.util.ArrayList<StateListAnimator> AkhnZx = new java.util.ArrayList<>();
    public java.util.ArrayList<Application> gEmmrt = new java.util.ArrayList<>();
    public final java.lang.String getFieldNames = "SendCoinSubAssetKey";
    public java.util.ArrayList<Activity> AEQbTJ = new java.util.ArrayList<>();
    public FreeGasManager AhwBna = new FreeGasManager();
    public int iwGUEr = 1;

    /* JADX INFO: renamed from: o.cqH$Activity */
    public static abstract class Activity {
        public abstract void OLrzqt();
    }

    /* JADX INFO: renamed from: o.cqH$Application */
    public static abstract class Application {
        public abstract void copydefault(boolean z);
    }

    public abstract void AEQbTJ(long j);

    public abstract TransactionFeeInfo AYXKKw();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TransactionFeeInfo AkhnZx() {
        return this.AuCTel;
    }

    public abstract AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> AubY();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void EZpvd(@NotNull java.lang.String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        this.ejfBZ = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(@NotNull C12623cqV c12623cqV) {
        Intrinsics.checkNotNullParameter(c12623cqV, "");
        this.valueOf = c12623cqV;
    }

    public boolean KWHzl() {
        return true;
    }

    public boolean OLrzqt() {
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C12623cqV ejfBZ() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String fARcdN() {
        java.lang.String str = this.ejfBZ;
        return str == null ? "" : str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String fJNWhG() {
        return this.hDKMBd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String fetchVPNInfo() {
        return "freeGas";
    }

    public void gHZMYf() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C13934dbu isConnected() {
        return this.fARcdN;
    }

    public void sSMYrx() {
    }

    public abstract java.lang.Integer valueOf();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean wlaJM() {
        return this.values;
    }

    /* JADX INFO: renamed from: o.cqH$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.cqH.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    public void copydefault(@NotNull TransactionType transactionType, @NotNull OkTransactionWallet okTransactionWallet, java.lang.String str, java.lang.String str2, int i, TxToastCheckBizAndPayloadInfo txToastCheckBizAndPayloadInfo) {
        Intrinsics.checkNotNullParameter(transactionType, "");
        Intrinsics.checkNotNullParameter(okTransactionWallet, "");
        this.fIwbmz = transactionType;
        this.fetchVPNInfo = okTransactionWallet;
        this.ejfBZ = str;
        this.iwGUEr = i;
        this.getNewProxyInstance = txToastCheckBizAndPayloadInfo;
        if (KWHzl()) {
            uzCIH();
        }
    }

    public final AbstractC12782ctV getNewProxyInstance() {
        OkTransactionWallet okTransactionWallet = this.fetchVPNInfo;
        if (okTransactionWallet == null) {
            Intrinsics.gEmmrt("");
            okTransactionWallet = null;
        }
        return okTransactionWallet.getWallet();
    }

    public final C10854bwM gEmmrt() {
        OkTransactionWallet okTransactionWallet = this.fetchVPNInfo;
        if (okTransactionWallet == null) {
            Intrinsics.gEmmrt("");
            okTransactionWallet = null;
        }
        return okTransactionWallet.getCoinMeta();
    }

    public C10854bwM EZpvd() {
        OkTransactionWallet okTransactionWallet = this.fetchVPNInfo;
        if (okTransactionWallet == null) {
            Intrinsics.gEmmrt("");
            okTransactionWallet = null;
        }
        return okTransactionWallet.getCoinMeta().KWHzl();
    }

    public C10854bwM AhwBna() {
        OkTransactionWallet okTransactionWallet = this.fetchVPNInfo;
        if (okTransactionWallet == null) {
            Intrinsics.gEmmrt("");
            okTransactionWallet = null;
        }
        return okTransactionWallet.getCoinMeta().KWHzl();
    }

    public final java.lang.String fIwbmz() {
        return getNewProxyInstance().USBtdM();
    }

    public final java.lang.String getFieldNames() {
        return getNewProxyInstance().DbNXlk();
    }

    public final long AEQbTJ() {
        return gEmmrt().AhwBna();
    }

    public final java.lang.Long copydefault() {
        C10854bwM c10854bwMEZpvd = EZpvd();
        if (c10854bwMEZpvd != null) {
            return java.lang.Long.valueOf(c10854bwMEZpvd.AhwBna());
        }
        return null;
    }

    public final java.lang.String DbNXlk() {
        OkTransactionWallet okTransactionWallet = this.fetchVPNInfo;
        if (okTransactionWallet == null) {
            Intrinsics.gEmmrt("");
            okTransactionWallet = null;
        }
        return okTransactionWallet.getAddress();
    }

    public final ChainAddress values() {
        OkTransactionWallet okTransactionWallet = this.fetchVPNInfo;
        if (okTransactionWallet == null) {
            Intrinsics.gEmmrt("");
            okTransactionWallet = null;
        }
        return okTransactionWallet.getChainAddress();
    }

    public final AbstractC58185ywX<Triple<java.lang.Boolean, C12623cqV, java.lang.String>> EZpvd(C10854bwM c10854bwM) {
        if (!OLrzqt()) {
            AbstractC58185ywX<Triple<java.lang.Boolean, C12623cqV, java.lang.String>> abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(new Triple(java.lang.Boolean.TRUE, null, ""));
            Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
            return abstractC58185ywXKWHzl;
        }
        if (c10854bwM == null) {
            AbstractC58185ywX<Triple<java.lang.Boolean, C12623cqV, java.lang.String>> abstractC58185ywXKWHzl2 = AbstractC58185ywX.KWHzl(new Triple(java.lang.Boolean.FALSE, null, "coinMeta == null"));
            Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl2, "");
            return abstractC58185ywXKWHzl2;
        }
        final C12623cqV c12623cqV = new C12623cqV();
        AbstractC58185ywX abstractC58185ywXLoadWithCoinMeta$default = C12623cqV.loadWithCoinMeta$default(c12623cqV, c10854bwM, c10854bwM.KWHzl(), null, 4, null);
        final Function1 function1 = new Function1() { // from class: o.cqJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AbstractC12609cqH.KWHzl(c12623cqV, (kotlin.Pair) obj);
            }
        };
        AbstractC58185ywX<Triple<java.lang.Boolean, C12623cqV, java.lang.String>> abstractC58185ywXAEQbTJ = abstractC58185ywXLoadWithCoinMeta$default.AEQbTJ(new InterfaceC58229yxO() { // from class: o.cqK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return AbstractC12609cqH.EZpvd(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        return abstractC58185ywXAEQbTJ;
    }

    public static final Triple EZpvd(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (Triple) function1.invoke(obj);
    }

    public static final Triple KWHzl(C12623cqV c12623cqV, kotlin.Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        return new Triple(pair.getFirst(), c12623cqV, pair.getSecond());
    }

    public static /* synthetic */ java.lang.String getCanTransferCoinAmount$default(AbstractC12609cqH abstractC12609cqH, boolean z, boolean z2, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getCanTransferCoinAmount");
        }
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            z2 = false;
        }
        return abstractC12609cqH.AEQbTJ(z, z2);
    }

    public final java.lang.String AEQbTJ(boolean z, boolean z2) {
        OkTransactionWallet okTransactionWallet = null;
        if (z) {
            OkTransactionWallet okTransactionWallet2 = this.fetchVPNInfo;
            if (okTransactionWallet2 == null) {
                Intrinsics.gEmmrt("");
                okTransactionWallet2 = null;
            }
            return C54870xYj.EZpvd(okTransactionWallet2.getCanTransferCoinAmount(), gEmmrt().valueOf(), gEmmrt().AkhnZx(), z2 ? gEmmrt().fJNWhG() : null, (248 & 8) != 0 ? DisplaySign.AUTO : null, (248 & 16) != 0 ? false : false, (248 & 32) != 0 ? null : null, (248 & 64) != 0 ? false : false, (248 & 128) != 0 ? RoundingMode.DOWN : null);
        }
        OkTransactionWallet okTransactionWallet3 = this.fetchVPNInfo;
        if (okTransactionWallet3 == null) {
            Intrinsics.gEmmrt("");
        } else {
            okTransactionWallet = okTransactionWallet3;
        }
        return okTransactionWallet.getCanTransferCoinAmount();
    }

    public boolean iwGUEr() {
        return gEmmrt().AuCTel();
    }

    public static /* synthetic */ void setTransferAmount$default(AbstractC12609cqH abstractC12609cqH, java.lang.String str, boolean z, boolean z2, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setTransferAmount");
        }
        if ((i & 2) != 0) {
            z = true;
        }
        if ((i & 4) != 0) {
            z2 = true;
        }
        abstractC12609cqH.copydefault(str, z, z2);
    }

    public final void copydefault(@NotNull java.lang.String str, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(str, "");
        boolean z3 = this.values;
        this.values = false;
        if (z2) {
            str = C54870xYj.KWHzl(str, gEmmrt().valueOf());
        }
        if (z3 || !C33129mqd.OLrzqt(str, this.fJNWhG)) {
            this.fJNWhG = str;
            if (z) {
                zLjUOn();
            }
        }
    }

    public static /* synthetic */ java.lang.String getTransferAmount$default(AbstractC12609cqH abstractC12609cqH, boolean z, boolean z2, boolean z3, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getTransferAmount");
        }
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            z2 = false;
        }
        if ((i & 4) != 0) {
            z3 = false;
        }
        return abstractC12609cqH.EZpvd(z, z2, z3);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.String EZpvd(boolean z, boolean z2, boolean z3) {
        java.lang.String str;
        int iAkhnZx;
        java.lang.String canTransferCoinAmount$default = "0";
        if (!this.values) {
            java.lang.String str2 = this.fJNWhG;
            if (str2 != null) {
                str = str2;
            }
            if (z) {
                return str;
            }
            if (z3) {
                iAkhnZx = gEmmrt().DTwDnp();
            } else {
                iAkhnZx = gEmmrt().AkhnZx();
            }
            return C54870xYj.EZpvd(str, gEmmrt().valueOf(), iAkhnZx, z2 ? gEmmrt().fJNWhG() : null, (248 & 8) != 0 ? DisplaySign.AUTO : null, (248 & 16) != 0 ? false : false, (248 & 32) != 0 ? null : null, (248 & 64) != 0 ? false : false, (248 & 128) != 0 ? RoundingMode.DOWN : null);
        }
        if (iwGUEr()) {
            BigDecimal bigDecimalAEQbTJ = C54862xYb.AEQbTJ(getCanTransferCoinAmount$default(this, false, false, 3, null), djBIcL());
            if (!C33129mqd.gEmmrt(bigDecimalAEQbTJ, "0")) {
                canTransferCoinAmount$default = C54862xYb.convertToString$default(bigDecimalAEQbTJ, false, null, null, 7, null);
            }
        } else {
            canTransferCoinAmount$default = getCanTransferCoinAmount$default(this, false, false, 3, null);
        }
        str = canTransferCoinAmount$default;
        if (z) {
        }
    }

    public final java.lang.String AuCTel() {
        if (this.values) {
            return getCanTransferCoinAmount$default(this, false, false, 3, null);
        }
        java.lang.String str = this.fJNWhG;
        return str == null ? "0" : str;
    }

    /* JADX INFO: renamed from: o.cqH$TaskDescription */
    public static final class TaskDescription extends WalletCoinAssetSubManager.TaskDescription {
        public TaskDescription(java.lang.String str, java.util.List<java.lang.Long> list) {
            super(str, null, list, false, 10, null);
        }

        @Override // o.xZF.TaskDescription
        public void EZpvd(final java.util.List<WalletCoinAssetSubManager.SubResponse> list) {
            Intrinsics.checkNotNullParameter(list, "");
            InterfaceC58217yxC interfaceC58217yxC = AbstractC12609cqH.this.EZpvd;
            if (interfaceC58217yxC != null) {
                interfaceC58217yxC.dispose();
            }
            AbstractC12609cqH abstractC12609cqH = AbstractC12609cqH.this;
            AbstractC58260yxt<AbstractC12782ctV> abstractC58260yxtOLrzqt = C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null).OLrzqt(AbstractC12609cqH.this.getFieldNames(), true);
            final AbstractC12609cqH abstractC12609cqH2 = AbstractC12609cqH.this;
            final Function1 function1 = new Function1() { // from class: o.cqQ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return AbstractC12609cqH.TaskDescription.AEQbTJ(abstractC12609cqH2, list, (AbstractC12782ctV) obj);
                }
            };
            AbstractC58260yxt<R> abstractC58260yxtCopydefault = abstractC58260yxtOLrzqt.copydefault(new InterfaceC58229yxO() { // from class: o.cqM
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58229yxO
                public final java.lang.Object apply(java.lang.Object obj) {
                    return AbstractC12609cqH.TaskDescription.copydefault(function1, obj);
                }
            });
            final AbstractC12609cqH abstractC12609cqH3 = AbstractC12609cqH.this;
            final Function1 function12 = new Function1() { // from class: o.cqT
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return AbstractC12609cqH.TaskDescription.KWHzl(abstractC12609cqH3, (Unit) obj);
                }
            };
            AbstractC58185ywX abstractC58185ywXKWHzl = abstractC58260yxtCopydefault.KWHzl((InterfaceC58229yxO<? super R, ? extends InterfaceC60096zvd<? extends R>>) new InterfaceC58229yxO() { // from class: o.cqU
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58229yxO
                public final java.lang.Object apply(java.lang.Object obj) {
                    return AbstractC12609cqH.TaskDescription.EZpvd(function12, obj);
                }
            });
            final AbstractC12609cqH abstractC12609cqH4 = AbstractC12609cqH.this;
            final Function1 function13 = new Function1() { // from class: o.cqS
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return AbstractC12609cqH.TaskDescription.OLrzqt(abstractC12609cqH4, (java.lang.Boolean) obj);
                }
            };
            abstractC12609cqH.EZpvd = abstractC58185ywXKWHzl.AEQbTJ(new InterfaceC58229yxO() { // from class: o.cqR
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58229yxO
                public final java.lang.Object apply(java.lang.Object obj) {
                    return AbstractC12609cqH.TaskDescription.valueOf(function13, obj);
                }
            }).DbNXlk();
        }

        public static final Unit copydefault(Function1 function1, java.lang.Object obj) {
            Intrinsics.checkNotNullParameter(obj, "");
            return (Unit) function1.invoke(obj);
        }

        public static final Unit AEQbTJ(AbstractC12609cqH abstractC12609cqH, java.util.List list, AbstractC12782ctV abstractC12782ctV) {
            Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
            abstractC12609cqH.AEQbTJ(abstractC12782ctV, (java.util.List<WalletCoinAssetSubManager.SubResponse>) list);
            return Unit.INSTANCE;
        }

        public static final InterfaceC60096zvd EZpvd(Function1 function1, java.lang.Object obj) {
            Intrinsics.checkNotNullParameter(obj, "");
            return (InterfaceC60096zvd) function1.invoke(obj);
        }

        public static final InterfaceC60096zvd KWHzl(AbstractC12609cqH abstractC12609cqH, Unit unit) {
            Intrinsics.checkNotNullParameter(unit, "");
            abstractC12609cqH.gHZMYf();
            return abstractC12609cqH.ORxRYg();
        }

        public static final Unit valueOf(Function1 function1, java.lang.Object obj) {
            Intrinsics.checkNotNullParameter(obj, "");
            return (Unit) function1.invoke(obj);
        }

        public static final Unit OLrzqt(AbstractC12609cqH abstractC12609cqH, java.lang.Boolean bool) {
            Intrinsics.checkNotNullParameter(bool, "");
            java.util.Iterator it = abstractC12609cqH.AEQbTJ.iterator();
            while (it.hasNext()) {
                ((Activity) it.next()).OLrzqt();
            }
            return Unit.INSTANCE;
        }
    }

    public final void uzCIH() {
        this.copydefault = new TaskDescription(this.getFieldNames, zuBGHE());
        AwvSrB();
    }

    public java.util.List<java.lang.Long> zuBGHE() {
        if (gEmmrt().AuCTel()) {
            return C56402yEa.EZpvd(java.lang.Long.valueOf(AEQbTJ()));
        }
        java.lang.Long[] lArr = new java.lang.Long[2];
        lArr[0] = java.lang.Long.valueOf(AEQbTJ());
        java.lang.Long lCopydefault = copydefault();
        lArr[1] = java.lang.Long.valueOf(lCopydefault != null ? lCopydefault.longValue() : 0L);
        return yDY.gEmmrt(lArr);
    }

    public void AEQbTJ(@NotNull AbstractC12782ctV abstractC12782ctV, @NotNull java.util.List<WalletCoinAssetSubManager.SubResponse> list) {
        Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
        Intrinsics.checkNotNullParameter(list, "");
        OkTransactionWallet okTransactionWallet = this.fetchVPNInfo;
        java.lang.Object obj = null;
        if (okTransactionWallet == null) {
            Intrinsics.gEmmrt("");
            okTransactionWallet = null;
        }
        okTransactionWallet.updateCoin(abstractC12782ctV.KWHzl(AEQbTJ(), java.lang.Integer.valueOf(values().getAddressType())));
        OkTransactionWallet okTransactionWallet2 = this.fetchVPNInfo;
        if (okTransactionWallet2 == null) {
            Intrinsics.gEmmrt("");
            okTransactionWallet2 = null;
        }
        java.lang.Long lCopydefault = copydefault();
        okTransactionWallet2.updateChain(abstractC12782ctV.KWHzl(lCopydefault != null ? lCopydefault.longValue() : 0L, java.lang.Integer.valueOf(values().getAddressType())));
        if (gEmmrt().hUfVAv()) {
            java.util.Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                java.lang.Object next = it.next();
                WalletCoinAssetSubManager.SubResponse subResponse = (WalletCoinAssetSubManager.SubResponse) next;
                java.lang.Long coinId = subResponse.getCoinId();
                long jAEQbTJ = AEQbTJ();
                if (coinId != null && coinId.longValue() == jAEQbTJ && Intrinsics.EZpvd((java.lang.Object) subResponse.getAddress(), (java.lang.Object) DbNXlk())) {
                    obj = next;
                    break;
                }
            }
            WalletCoinAssetSubManager.SubResponse subResponse2 = (WalletCoinAssetSubManager.SubResponse) obj;
            if (subResponse2 != null) {
                EZpvd(subResponse2.getAvailableBalance());
            }
        }
    }

    public final void AwvSrB() {
        if (this.copydefault == null) {
            return;
        }
        WalletCoinAssetSubManager walletCoinAssetSubManagerZLjUOn = C11205cFp.EZpvd.zLjUOn();
        WalletCoinAssetSubManager.TaskDescription taskDescription = this.copydefault;
        Intrinsics.copydefault(taskDescription);
        walletCoinAssetSubManagerZLjUOn.AEQbTJ(taskDescription);
    }

    public final void QKVWgx() {
        if (this.copydefault == null) {
            return;
        }
        WalletCoinAssetSubManager walletCoinAssetSubManagerZLjUOn = C11205cFp.EZpvd.zLjUOn();
        WalletCoinAssetSubManager.TaskDescription taskDescription = this.copydefault;
        Intrinsics.copydefault(taskDescription);
        walletCoinAssetSubManagerZLjUOn.OLrzqt(taskDescription);
    }

    public static final kotlin.Pair KWHzl(yHO yho, java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        Intrinsics.checkNotNullParameter(obj, "");
        Intrinsics.checkNotNullParameter(obj2, "");
        Intrinsics.checkNotNullParameter(obj3, "");
        return (kotlin.Pair) yho.invoke(obj, obj2, obj3);
    }

    public final AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> AuCTelauCTel() {
        AbstractC58185ywX<Unit> abstractC58185ywXAxsJAY = AxsJAY();
        AbstractC58185ywX<Triple<java.lang.Boolean, C12623cqV, java.lang.String>> abstractC58185ywXEZpvd = EZpvd(gEmmrt());
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXAubY = AubY();
        final yHO yho = new yHO() { // from class: o.cqO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.yHO
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return AbstractC12609cqH.EZpvd(this.OLrzqt, (Unit) obj, (Triple) obj2, (kotlin.Pair) obj3);
            }
        };
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXEZpvd2 = AbstractC58185ywX.EZpvd(abstractC58185ywXAxsJAY, abstractC58185ywXEZpvd, abstractC58185ywXAubY, new InterfaceC58228yxN() { // from class: o.cqP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58228yxN
            public final java.lang.Object AEQbTJ(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return AbstractC12609cqH.KWHzl(yho, obj, obj2, obj3);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXEZpvd2, "");
        return abstractC58185ywXEZpvd2;
    }

    public static final kotlin.Pair EZpvd(AbstractC12609cqH abstractC12609cqH, Unit unit, Triple triple, kotlin.Pair pair) {
        Intrinsics.checkNotNullParameter(unit, "");
        Intrinsics.checkNotNullParameter(triple, "");
        Intrinsics.checkNotNullParameter(pair, "");
        if (!((java.lang.Boolean) triple.getFirst()).booleanValue() || !((java.lang.Boolean) pair.getFirst()).booleanValue()) {
            return !((java.lang.Boolean) triple.getFirst()).booleanValue() ? C56390yDp.OLrzqt(java.lang.Boolean.FALSE, triple.getThird()) : !((java.lang.Boolean) pair.getFirst()).booleanValue() ? pair : C56390yDp.OLrzqt(java.lang.Boolean.FALSE, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
        }
        C12623cqV c12623cqV = (C12623cqV) triple.getSecond();
        if (c12623cqV == null) {
            return pair;
        }
        abstractC12609cqH.EZpvd(c12623cqV);
        return pair;
    }

    public void zLjUOn() {
        KWHzl(false);
    }

    public AbstractC58185ywX<java.lang.Boolean> ORxRYg() {
        AbstractC58185ywX<java.lang.Boolean> abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(java.lang.Boolean.FALSE);
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        return abstractC58185ywXKWHzl;
    }

    public final void EZpvd(java.lang.String str) {
        OkTransactionWallet okTransactionWallet = this.fetchVPNInfo;
        if (okTransactionWallet == null) {
            Intrinsics.gEmmrt("");
            okTransactionWallet = null;
        }
        okTransactionWallet.updateCanTransferCoinAmount(str);
    }

    public final void OLrzqt(java.lang.String str) {
        OkTransactionWallet okTransactionWallet = this.fetchVPNInfo;
        if (okTransactionWallet == null) {
            Intrinsics.gEmmrt("");
            okTransactionWallet = null;
        }
        okTransactionWallet.updateCanTransferChainAmount(str);
    }

    public final AbstractC58185ywX<Unit> AxsJAY() {
        if (gEmmrt().DarRvM()) {
            AbstractC58185ywX<Unit> abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(Unit.INSTANCE);
            Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
            return abstractC58185ywXKWHzl;
        }
        if (this.iwGUEr != 1 || !getNewProxyInstance().getFieldNames()) {
            AbstractC58185ywX<Unit> abstractC58185ywXKWHzl2 = AbstractC58185ywX.KWHzl(Unit.INSTANCE);
            Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl2, "");
            return abstractC58185ywXKWHzl2;
        }
        FreeGasManager freeGasManager = this.AhwBna;
        java.lang.String strFetchVPNInfo = fetchVPNInfo();
        C10854bwM c10854bwMEZpvd = EZpvd();
        AbstractC58185ywX userFreeGasStatus$default = FreeGasManager.getUserFreeGasStatus$default(freeGasManager, strFetchVPNInfo, c10854bwMEZpvd != null ? c10854bwMEZpvd.fetchVPNInfo() : 0L, DbNXlk(), null, 8, null);
        C10854bwM c10854bwMEZpvd2 = EZpvd();
        AbstractC58185ywX abstractC58185ywXOLrzqt = userFreeGasStatus$default.OLrzqt((InterfaceC60096zvd) AbstractC58185ywX.KWHzl(new FreeGasManager.UserFreeGasInfo(c10854bwMEZpvd2 != null ? c10854bwMEZpvd2.fetchVPNInfo() : 0L, null, 0, 0, -1, null, 46, null)));
        final Function1 function1 = new Function1() { // from class: o.cqI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AbstractC12609cqH.KWHzl(this.copydefault, (FreeGasManager.UserFreeGasInfo) obj);
            }
        };
        AbstractC58185ywX<Unit> abstractC58185ywXAEQbTJ = abstractC58185ywXOLrzqt.AEQbTJ(new InterfaceC58229yxO() { // from class: o.cqN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return AbstractC12609cqH.OLrzqt(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        return abstractC58185ywXAEQbTJ;
    }

    public static final Unit OLrzqt(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (Unit) function1.invoke(obj);
    }

    public static final Unit KWHzl(AbstractC12609cqH abstractC12609cqH, FreeGasManager.UserFreeGasInfo userFreeGasInfo) {
        Intrinsics.checkNotNullParameter(userFreeGasInfo, "");
        abstractC12609cqH.djBIcL = userFreeGasInfo;
        return Unit.INSTANCE;
    }

    public boolean AEQbTJ(@NotNull java.lang.String str, java.lang.Integer num) {
        Intrinsics.checkNotNullParameter(str, "");
        if (num == null) {
            num = valueOf();
        }
        return (num == null || num.intValue() != 33) && (num == null || num.intValue() != 34) && hDKMBd() && copydefault(str);
    }

    public final boolean hDKMBd() {
        FreeGasManager.UserFreeGasInfo userFreeGasInfo = this.djBIcL;
        return userFreeGasInfo != null && userFreeGasInfo.isFreeGas();
    }

    public final boolean copydefault(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        C12623cqV c12623cqV = this.valueOf;
        java.lang.String strEZpvd = c12623cqV != null ? c12623cqV.EZpvd(str) : null;
        FreeGasManager.UserFreeGasInfo userFreeGasInfo = this.djBIcL;
        return C33129mqd.valueOf(strEZpvd, userFreeGasInfo != null ? userFreeGasInfo.getLimitGasValuation() : null);
    }

    public java.lang.String djBIcL() {
        java.lang.String feeValue;
        java.lang.String feeValue2;
        if (this instanceof C12657crC) {
            feeValue = ((C12657crC) this).KWHzl((java.lang.String) null).getFeeValue();
        } else {
            feeValue = AYXKKw().getFeeValue();
        }
        if (feeValue == null) {
            feeValue = "";
        }
        return (AEQbTJ(feeValue, valueOf()) || (feeValue2 = AYXKKw().getFeeValue()) == null) ? "0" : feeValue2;
    }

    public static /* synthetic */ void startLoopRefreshFee$default(AbstractC12609cqH abstractC12609cqH, long j, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: startLoopRefreshFee");
        }
        if ((i & 1) != 0) {
            j = 7;
        }
        abstractC12609cqH.AEQbTJ(j);
    }

    public void zsXlph() {
        this.AkhnZx.clear();
        this.gEmmrt.clear();
        this.AEQbTJ.clear();
        InterfaceC58217yxC interfaceC58217yxC = this.EZpvd;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
    }

    /* JADX INFO: renamed from: o.cqH$StateListAnimator */
    public static abstract class StateListAnimator {
        public static final C0827StateListAnimator Companion = new C0827StateListAnimator(null);

        public abstract void AEQbTJ(int i);

        /* JADX INFO: renamed from: o.cqH$StateListAnimator$StateListAnimator, reason: collision with other inner class name */
        public static final class C0827StateListAnimator {
            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.cqH.StateListAnimator.StateListAnimator.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ C0827StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private C0827StateListAnimator() {
            }
        }
    }

    public final void KWHzl(boolean z) {
        this.DbNXlk = z;
        java.util.Iterator<T> it = this.gEmmrt.iterator();
        while (it.hasNext()) {
            ((Application) it.next()).copydefault(this.DbNXlk);
        }
    }

    public final void AEQbTJ(int i) {
        java.util.Iterator<T> it = this.AkhnZx.iterator();
        while (it.hasNext()) {
            ((StateListAnimator) it.next()).AEQbTJ(i);
        }
    }
}
