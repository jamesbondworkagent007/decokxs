package com.okinc.business.defi.biz.core.transaction.sign;

import android.os.Handler;
import android.os.Looper;
import com.okinc.business.defi.api.bean.CurrencyDisplayStyle;
import com.okinc.business.defi.api.model.tx.SubmitTxExpandBean;
import com.okinc.business.defi.api.model.tx.signdata.AmountMode;
import com.okinc.business.defi.api.model.tx.signdata.IntervalMode;
import com.okinc.business.defi.api.model.tx.signdata.MultiTransferSignData;
import com.okinc.business.defi.api.model.tx.signdata.TransferAddressData;
import com.okinc.business.defi.biz.core.dapp.interaction.bean.DappTxResultBean;
import com.okinc.business.defi.biz.core.transaction.bean.BatchBroadcastModel;
import com.okinc.business.defi.biz.core.transaction.bean.BroadcastBean;
import com.okinc.business.defi.biz.core.transaction.bean.CommonTransferExtJson;
import com.okinc.business.defi.biz.core.transaction.sign.OKWBaseMultiTransfer;
import com.okinc.business.defi.biz.core.ws.channel.WalletTxHistorySubManager;
import com.okinc.business.defi.biz.model.ChainAddress;
import com.okinc.business.defi.biz.net.bean.AddressCheck;
import com.okinc.business.defi.biz.net.bean.AddressCheckResItem;
import com.okinc.business.defi.biz.net.bean.FromAddressCheckReq;
import com.okinc.business.defi.biz.net.bean.FromAddressCheckRes;
import com.okinc.business.defi.biz.net.bean.TxToastCheckRes;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.p2p.api.OtcExtraKeys;
import com.reown.android.pulse.model.EventType;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.random.Random;
import o.AbstractC12782ctV;
import o.AbstractC58185ywX;
import o.AbstractC8426bCW;
import o.AbstractC8704bHj;
import o.C10856bwO;
import o.C11205cFp;
import o.C12827cuN;
import o.C13754dXa;
import o.C13856daV;
import o.C33024moe;
import o.C33069mpW;
import o.C33070mpX;
import o.C33129mqd;
import o.C43423rox;
import o.C54862xYb;
import o.C54870xYj;
import o.C54880xYt;
import o.C56390yDp;
import o.C56392yDr;
import o.C56402yEa;
import o.C56403yEb;
import o.C56424yEw;
import o.C56444yFp;
import o.C56524yIo;
import o.C8342bAs;
import o.C8392bBp;
import o.C8486bDd;
import o.C9748bbT;
import o.C9788bcG;
import o.C9799bcR;
import o.C9801bcT;
import o.C9803bcV;
import o.C9804bcW;
import o.C9805bcX;
import o.C9806bcY;
import o.C9807bcZ;
import o.C9861bda;
import o.InterfaceC56387yDm;
import o.InterfaceC56445yFq;
import o.InterfaceC58217yxC;
import o.InterfaceC58222yxH;
import o.InterfaceC58229yxO;
import o.InterfaceC60096zvd;
import o.InterfaceC9747bbS;
import o.pTB;
import o.xZA;
import o.xZF;
import o.yBI;
import o.yDY;
import o.yEE;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public abstract class OKWBaseMultiTransfer<Fee extends AbstractC8426bCW<?>, SignData extends MultiTransferSignData> extends AbstractC8704bHj<Fee, SignData> {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int OLrzqt = 8;
    public final boolean AEQbTJ;
    public final InterfaceC56387yDm AhwBna;
    public final String KWHzl;
    public int copydefault;
    public InterfaceC58217yxC djBIcL;
    public final InterfaceC56387yDm valueOf;
    public final InterfaceC56387yDm EZpvd = C56392yDr.copydefault(new Function0() { // from class: o.bFj
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return OKWBaseMultiTransfer.aw_();
        }
    });
    public final Set<Integer> gEmmrt = yEE.AhwBna(3, 4, 6);
    public final ArrayList<TransactionInfo> fetchVPNInfo = new ArrayList<>();
    public final InterfaceC56387yDm AYXKKw = C56392yDr.copydefault(new Function0() { // from class: o.bFl
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return OKWBaseMultiTransfer.ax_();
        }
    });

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction
    public void AEQbTJ(@NotNull List<TxToastCheckRes> list) {
        Intrinsics.checkNotNullParameter(list, "");
    }

    @Override // o.AbstractC8564bFB
    public void G_() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction
    public boolean H_() {
        return this.AEQbTJ;
    }

    public abstract long QUSxYX();

    public abstract AbstractC58185ywX<Pair<Boolean, String>> QbewEr();

    public abstract AbstractC58185ywX<Pair<Boolean, String>> QfsBiF();

    public abstract boolean fvQaOB();

    @Override // o.AbstractC8564bFB
    public void gGvvIC() {
    }

    public abstract BroadcastStrategy valueOf();

    public OKWBaseMultiTransfer() {
        String string = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        this.KWHzl = string;
        this.AhwBna = C56392yDr.copydefault(new Function0() { // from class: o.bFn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return OKWBaseMultiTransfer.fIwbmz(this.EZpvd);
            }
        });
        this.valueOf = C56392yDr.copydefault(new Function0() { // from class: o.bFo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return OKWBaseMultiTransfer.ejfBZ(this.OLrzqt);
            }
        });
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.core.transaction.sign.OKWBaseMultiTransfer.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    public final Handler O_() {
        return (Handler) this.EZpvd.getValue();
    }

    public static final Handler aw_() {
        return new Handler(Looper.getMainLooper());
    }

    public static final HashSet ax_() {
        return new HashSet();
    }

    public final HashSet<Application> S_() {
        return (HashSet) this.AYXKKw.getValue();
    }

    public static final class Activity extends xZF.TaskDescription<WalletTxHistorySubManager.SubResponse> {
        public final /* synthetic */ OKWBaseMultiTransfer<Fee, SignData> EZpvd;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Activity(OKWBaseMultiTransfer<Fee, SignData> oKWBaseMultiTransfer, String str, xZA xza) {
            super(str, xza);
            this.EZpvd = oKWBaseMultiTransfer;
        }

        @Override // o.xZF.TaskDescription
        public void EZpvd(List<WalletTxHistorySubManager.SubResponse> list) {
            Object next;
            Intrinsics.checkNotNullParameter(list, "");
            C10856bwO.copydefault("OKWBaseMultiTransfer", 0, "responseList: " + list);
            OKWBaseMultiTransfer<Fee, SignData> oKWBaseMultiTransfer = this.EZpvd;
            for (WalletTxHistorySubManager.SubResponse subResponse : list) {
                Iterator it = oKWBaseMultiTransfer.fetchVPNInfo.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    TransactionInfo transactionInfo = (TransactionInfo) next;
                    if ((Intrinsics.EZpvd((Object) transactionInfo.getTxHash(), (Object) subResponse.getTxhash()) && C33129mqd.OLrzqt((CharSequence) subResponse.getTxhash())) || (Intrinsics.EZpvd((Object) transactionInfo.getTxHash(), (Object) subResponse.getMsgHash()) && C33129mqd.OLrzqt((CharSequence) subResponse.getMsgHash()))) {
                        break;
                    }
                }
                TransactionInfo transactionInfo2 = (TransactionInfo) next;
                if (transactionInfo2 != null && oKWBaseMultiTransfer.gEmmrt.contains(Integer.valueOf(subResponse.getTxStatus())) && !oKWBaseMultiTransfer.gEmmrt.contains(Integer.valueOf(transactionInfo2.getTxStatus()))) {
                    transactionInfo2.setTxId(subResponse.getTxId());
                    transactionInfo2.setTxHash(subResponse.getTxhash());
                    transactionInfo2.setOrderId(subResponse.getOrderId());
                    transactionInfo2.setTxStatus(subResponse.getTxStatus());
                    oKWBaseMultiTransfer.copydefault++;
                    oKWBaseMultiTransfer.OLrzqt(3);
                    if (oKWBaseMultiTransfer.valueOf() == BroadcastStrategy.ON_CHAIN_FINISH) {
                        oKWBaseMultiTransfer.O_().removeCallbacks(oKWBaseMultiTransfer.R_());
                        oKWBaseMultiTransfer.copydefault(oKWBaseMultiTransfer.Q_());
                    } else if (oKWBaseMultiTransfer.valueOf() == BroadcastStrategy.CALL_API_FINISH && oKWBaseMultiTransfer.copydefault == oKWBaseMultiTransfer.AwvSrB()) {
                        oKWBaseMultiTransfer.OcIXYQ();
                        oKWBaseMultiTransfer.fFgQHt();
                    }
                }
            }
        }
    }

    public final Activity zsXlph() {
        return (Activity) this.AhwBna.getValue();
    }

    public static final Activity fIwbmz(OKWBaseMultiTransfer oKWBaseMultiTransfer) {
        return new Activity(oKWBaseMultiTransfer, "subStatus-OKWBaseMultiTransfer-" + oKWBaseMultiTransfer.dmfpNf() + "-" + System.currentTimeMillis(), new xZA(0L, 300L, null, 4, null));
    }

    public final Runnable R_() {
        return (Runnable) this.valueOf.getValue();
    }

    public static final Runnable ejfBZ(final OKWBaseMultiTransfer oKWBaseMultiTransfer) {
        return new Runnable() { // from class: o.bEU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                OKWBaseMultiTransfer.fJNWhG(this.copydefault);
            }
        };
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: SignData */
    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: SignData */
    /* JADX DEBUG: Multi-variable search result rejected for r1v6, resolved type: SignData */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: SignData */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void fJNWhG(OKWBaseMultiTransfer oKWBaseMultiTransfer) {
        MultiTransferSignData multiTransferSignData = (MultiTransferSignData) oKWBaseMultiTransfer.QVsKAR();
        multiTransferSignData.setCurTXIndex(multiTransferSignData.getCurTXIndex() + 1);
        if (C33129mqd.copydefault(Integer.valueOf(((MultiTransferSignData) oKWBaseMultiTransfer.QVsKAR()).getCurTXIndex()), Integer.valueOf(oKWBaseMultiTransfer.AwvSrB()))) {
            oKWBaseMultiTransfer.OcIXYQ();
            if (oKWBaseMultiTransfer.valueOf() == BroadcastStrategy.ON_CHAIN_FINISH) {
                oKWBaseMultiTransfer.fFgQHt();
                return;
            }
            return;
        }
        Iterator<T> it = oKWBaseMultiTransfer.S_().iterator();
        while (it.hasNext()) {
            ((Application) it.next()).AEQbTJ();
        }
        if (oKWBaseMultiTransfer.iZzfmt()) {
            C8342bAs.Activity activity = C8342bAs.Companion;
            if (activity.EZpvd().AEQbTJ()) {
                OKWBaseTransaction.submit$default(oKWBaseMultiTransfer, activity.EZpvd().OLrzqt(), null, 2, null).DbNXlk();
                return;
            } else {
                oKWBaseMultiTransfer.OcIXYQ();
                oKWBaseMultiTransfer.fFgQHt();
                return;
            }
        }
        TransactionInfo transactionInfo = (TransactionInfo) CollectionsKt___CollectionsKt.AkhnZx(oKWBaseMultiTransfer.fetchVPNInfo, ((MultiTransferSignData) oKWBaseMultiTransfer.QVsKAR()).getCurTXIndex());
        if (transactionInfo != null) {
            transactionInfo.setTxStatus(2);
            transactionInfo.setAmount(oKWBaseMultiTransfer.EZpvd(((MultiTransferSignData) oKWBaseMultiTransfer.QVsKAR()).getCurTXIndex()));
        }
        oKWBaseMultiTransfer.copydefault(0L);
    }

    @Override // o.AbstractC8564bFB
    public List<C13856daV> af_() {
        List listQbewEr = CollectionsKt___CollectionsKt.QbewEr(QVsKAR().getWalletId());
        ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(listQbewEr, 10));
        int i = 0;
        for (Object obj : listQbewEr) {
            if (i < 0) {
                yDY.AYXKKw();
            }
            arrayList.add(new C13856daV((String) obj, copydefault((List<String>) QVsKAR().getFromAddress(), i)));
            i++;
        }
        return arrayList;
    }

    public static final Pair djBIcL(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (Pair) function1.invoke(obj);
    }

    /* JADX DEBUG: Type inference failed for r0v1. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> */
    @Override // o.AbstractC8564bFB, com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction
    public AbstractC58185ywX<Pair<Boolean, String>> dxcTrN() {
        AbstractC58185ywX<Pair<Boolean, String>> abstractC58185ywXDxcTrN = super.dxcTrN();
        final Function1 function1 = new Function1() { // from class: o.bFa
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return OKWBaseMultiTransfer.AEQbTJ(this.KWHzl, (kotlin.Pair) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXAEQbTJ = abstractC58185ywXDxcTrN.AEQbTJ(new InterfaceC58229yxO() { // from class: o.bFc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return OKWBaseMultiTransfer.djBIcL(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        return abstractC58185ywXAEQbTJ;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v3, resolved type: SignData */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: SignData */
    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: SignData */
    /* JADX DEBUG: Multi-variable search result rejected for r5v3, resolved type: SignData */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Pair AEQbTJ(OKWBaseMultiTransfer oKWBaseMultiTransfer, Pair pair) {
        OKWBaseMultiTransfer oKWBaseMultiTransfer2 = oKWBaseMultiTransfer;
        Intrinsics.checkNotNullParameter(pair, "");
        C11205cFp c11205cFp = C11205cFp.EZpvd;
        c11205cFp.KWHzl(((MultiTransferSignData) oKWBaseMultiTransfer.QVsKAR()).getFromAddress(), oKWBaseMultiTransfer.P_());
        c11205cFp.AxsJAY().AEQbTJ(oKWBaseMultiTransfer.zsXlph());
        int i = 0;
        for (Object obj : ((MultiTransferSignData) oKWBaseMultiTransfer.QVsKAR()).getWalletId()) {
            if (i < 0) {
                yDY.AYXKKw();
            }
            String str = (String) obj;
            ArrayList<TransactionInfo> arrayList = oKWBaseMultiTransfer2.fetchVPNInfo;
            String strCopydefault = oKWBaseMultiTransfer2.copydefault((List<String>) ((MultiTransferSignData) oKWBaseMultiTransfer.QVsKAR()).getFromAddress(), i);
            TransferAddressData transferAddressData = (TransferAddressData) CollectionsKt___CollectionsKt.AkhnZx(((MultiTransferSignData) oKWBaseMultiTransfer.QVsKAR()).getToAddress(), i);
            if (transferAddressData != null) {
                arrayList.add(new TransactionInfo(str, strCopydefault, transferAddressData, null, null, null, null, 0, 248, null));
            }
            i++;
            oKWBaseMultiTransfer2 = oKWBaseMultiTransfer;
        }
        return pair;
    }

    @Override // o.AbstractC8564bFB
    public AbstractC58185ywX<Pair<Boolean, String>> EZpvd(@NotNull C8486bDd c8486bDd) {
        Intrinsics.checkNotNullParameter(c8486bDd, "");
        AbstractC58185ywX<Pair<Boolean, String>> abstractC58185ywXCopydefault = super.EZpvd(c8486bDd).copydefault(new InterfaceC58222yxH() { // from class: o.bFf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58222yxH
            public final void run() {
                OKWBaseMultiTransfer.DbNXlk(this.copydefault);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXCopydefault, "");
        return abstractC58185ywXCopydefault;
    }

    public static final void DbNXlk(OKWBaseMultiTransfer oKWBaseMultiTransfer) {
        oKWBaseMultiTransfer.OLrzqt(5);
    }

    @Override // o.AbstractC8564bFB
    public AbstractC58185ywX<Pair<Boolean, String>> RJOkX() {
        AbstractC58185ywX<Pair<Boolean, String>> abstractC58185ywXCopydefault = super.RJOkX().copydefault(new InterfaceC58222yxH() { // from class: o.bFi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58222yxH
            public final void run() {
                OKWBaseMultiTransfer.AkhnZx(this.KWHzl);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXCopydefault, "");
        return abstractC58185ywXCopydefault;
    }

    public static final void AkhnZx(OKWBaseMultiTransfer oKWBaseMultiTransfer) {
        oKWBaseMultiTransfer.OLrzqt(7);
    }

    @Override // o.AbstractC8564bFB
    public AbstractC58185ywX<Pair<Boolean, String>> finit() {
        AbstractC58185ywX<Pair<Boolean, String>> abstractC58185ywXCopydefault = super.finit().copydefault(new InterfaceC58222yxH() { // from class: o.bEV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58222yxH
            public final void run() {
                OKWBaseMultiTransfer.AuCTel(this.EZpvd);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXCopydefault, "");
        return abstractC58185ywXCopydefault;
    }

    public static final void AuCTel(OKWBaseMultiTransfer oKWBaseMultiTransfer) {
        oKWBaseMultiTransfer.OLrzqt(6);
    }

    public final boolean iZzfmt() {
        AbstractC12782ctV abstractC12782ctVOLrzqt = C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null).OLrzqt(copydefault((List<String>) QVsKAR().getWalletId(), QVsKAR().getCurTXIndex()));
        if (abstractC12782ctVOLrzqt == null) {
            return false;
        }
        EZpvd(abstractC12782ctVOLrzqt);
        OLrzqt(OLrzqt(abstractC12782ctVOLrzqt, copydefault((List<String>) QVsKAR().getFromAddress(), QVsKAR().getCurTXIndex())));
        return true;
    }

    @Override // com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction
    public String ag_() {
        return copydefault((List<String>) ((MultiTransferSignData) OJuSTm().getSignData()).getFromAddress(), QVsKAR().getCurTXIndex());
    }

    @Override // o.AbstractC8564bFB
    public String zLjUOn() {
        TransferAddressData transferAddressData = (TransferAddressData) CollectionsKt___CollectionsKt.AkhnZx(QVsKAR().getToAddress(), QVsKAR().getCurTXIndex());
        String address = transferAddressData != null ? transferAddressData.getAddress() : null;
        return address == null ? "" : address;
    }

    @Override // com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction
    public AbstractC58185ywX<Pair<Boolean, String>> KWHzl(boolean z) {
        String address;
        long jFetchVPNInfo = fHqPtx().fetchVPNInfo();
        ArrayList<String> fromAddress = QVsKAR().getFromAddress();
        ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(fromAddress, 10));
        Iterator<T> it = fromAddress.iterator();
        int i = 0;
        while (true) {
            String str = "";
            if (it.hasNext()) {
                Object next = it.next();
                if (i < 0) {
                    yDY.AYXKKw();
                }
                String str2 = (String) next;
                TransferAddressData transferAddressData = (TransferAddressData) CollectionsKt___CollectionsKt.AkhnZx(QVsKAR().getToAddress(), i);
                if (transferAddressData != null && (address = transferAddressData.getAddress()) != null) {
                    str = address;
                }
                arrayList.add(new AddressCheck(jFetchVPNInfo, str2, str));
                i++;
            } else {
                AbstractC58185ywX abstractC58185ywXKWHzl = C33024moe.KWHzl((AbstractC58185ywX) OFhtUX().copydefault(new FromAddressCheckReq(false, arrayList)));
                final Function1 function1 = new Function1() { // from class: o.bFh
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return OKWBaseMultiTransfer.KWHzl(this.OLrzqt, (ResponseData) obj);
                    }
                };
                AbstractC58185ywX<Pair<Boolean, String>> abstractC58185ywXAEQbTJ = abstractC58185ywXKWHzl.AEQbTJ(new InterfaceC58229yxO() { // from class: o.bFg
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // o.InterfaceC58229yxO
                    public final java.lang.Object apply(java.lang.Object obj) {
                        return OKWBaseMultiTransfer.gEmmrt(function1, obj);
                    }
                });
                Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
                return abstractC58185ywXAEQbTJ;
            }
        }
    }

    public static final Pair gEmmrt(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (Pair) function1.invoke(obj);
    }

    public static final Pair KWHzl(OKWBaseMultiTransfer oKWBaseMultiTransfer, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        FromAddressCheckRes fromAddressCheckRes = (FromAddressCheckRes) responseData.getData();
        List<AddressCheckResItem> txTagList = fromAddressCheckRes != null ? fromAddressCheckRes.getTxTagList() : null;
        if (txTagList == null || txTagList.isEmpty()) {
            return C56390yDp.OLrzqt(Boolean.FALSE, "");
        }
        oKWBaseMultiTransfer.KWHzl((FromAddressCheckRes) responseData.getData());
        return C56390yDp.OLrzqt(Boolean.TRUE, null);
    }

    private final void KWHzl(FromAddressCheckRes fromAddressCheckRes) {
        List<AddressCheckResItem> txTagList;
        List<String> causeRiskItem;
        boolean z = true;
        if (fromAddressCheckRes != null && (txTagList = fromAddressCheckRes.getTxTagList()) != null) {
            boolean z2 = true;
            for (AddressCheckResItem addressCheckResItem : txTagList) {
                List<String> causeRiskItem2 = addressCheckResItem.getCauseRiskItem();
                if ((causeRiskItem2 != null && causeRiskItem2.contains(TxToastCheckRes.FROM_RISK_REJECT)) || ((causeRiskItem = addressCheckResItem.getCauseRiskItem()) != null && causeRiskItem.contains(TxToastCheckRes.BLACK_TAG))) {
                    z2 = false;
                }
            }
            z = z2;
        }
        UlJrfe().AEQbTJ(new C9788bcG(z, false));
    }

    @Override // com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction
    public ArrayList<Integer> getNewProxyInstance() {
        return new ArrayList<>();
    }

    @Override // o.AbstractC8564bFB
    public final void x_() {
        I_();
        values();
        ay_();
        DLWbHP().OLrzqt(yDY.gEmmrt(new C9801bcT(QVAiDq()), new C9803bcV(aKErDB())));
    }

    public final boolean I_() {
        DLWbHP().OLrzqt(yDY.gEmmrt(new C9799bcR(RcXXUw()), new C9804bcW(fZBcTu())));
        return (DLWbHP().AEQbTJ(C56524yIo.AEQbTJ(C9804bcW.class)) || DLWbHP().AEQbTJ(C56524yIo.AEQbTJ(C9799bcR.class))) ? false : true;
    }

    public final boolean values() {
        DLWbHP().OLrzqt(C56402yEa.EZpvd(new C9805bcX(dNCPSb())));
        return !DLWbHP().AEQbTJ(C56524yIo.AEQbTJ(C9805bcX.class));
    }

    public final boolean ay_() {
        DLWbHP().OLrzqt(C56402yEa.EZpvd(new C9807bcZ(UeEOUB())));
        return !DLWbHP().AEQbTJ(C56524yIo.AEQbTJ(C9807bcZ.class));
    }

    public final List<C9861bda> fZBcTu() {
        String strKWHzl;
        if (!DTwDnp()) {
            ArrayList<String> walletId = QVsKAR().getWalletId();
            ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(walletId, 10));
            int i = 0;
            for (Object obj : walletId) {
                if (i < 0) {
                    yDY.AYXKKw();
                }
                String str = (String) obj;
                if (heceqZ()) {
                    strKWHzl = C54862xYb.convertToString$default(C54862xYb.AEQbTJ(KWHzl(i), fJNWhG().AEQbTJ()), false, null, null, 7, null);
                } else {
                    strKWHzl = KWHzl(i);
                }
                arrayList.add(new C9861bda(str, C33129mqd.copydefault(strKWHzl, QVsKAR().getMinAmount()), C33070mpX.AYXKKw(C13754dXa.FragmentManager.setRecycleOnMeasureEnabled)));
                i++;
            }
            return arrayList;
        }
        return yDY.AhwBna();
    }

    public final boolean dNCPSb() {
        if (DTwDnp()) {
            return true;
        }
        return C33129mqd.AEQbTJ(QVsKAR().getMaxAmount(), QVsKAR().getMinAmount());
    }

    public final boolean UeEOUB() {
        if (QVsKAR().getIntervalMode() == IntervalMode.RANGE) {
            return C33129mqd.AEQbTJ(QVsKAR().getMaxInterval(), QVsKAR().getMinInterval());
        }
        return true;
    }

    public List<C9861bda> QVAiDq() {
        ArrayList<String> walletId = QVsKAR().getWalletId();
        ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(walletId, 10));
        int i = 0;
        for (Object obj : walletId) {
            if (i < 0) {
                yDY.AYXKKw();
            }
            arrayList.add(new C9861bda((String) obj, a_(KWHzl(i), EZpvd(i)), C33070mpX.AYXKKw(C13754dXa.FragmentManager.setRecycleOnMeasureEnabled)));
            i++;
        }
        return arrayList;
    }

    public List<C9861bda> RcXXUw() {
        String strAEQbTJ;
        ArrayList<String> walletId = QVsKAR().getWalletId();
        ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(walletId, 10));
        int i = 0;
        for (Object obj : walletId) {
            if (i < 0) {
                yDY.AYXKKw();
            }
            String str = (String) obj;
            TransferAddressData transferAddressData = (TransferAddressData) CollectionsKt___CollectionsKt.AkhnZx(QVsKAR().getToAddress(), i);
            String exchangeDepositLimit = transferAddressData != null ? transferAddressData.getExchangeDepositLimit() : null;
            if (DTwDnp()) {
                strAEQbTJ = C54870xYj.AEQbTJ(EZpvd(i), fHqPtx().valueOf());
            } else {
                strAEQbTJ = C54870xYj.AEQbTJ(QVsKAR().getMinAmount(), fHqPtx().valueOf());
            }
            arrayList.add(new C9861bda(str, b_(exchangeDepositLimit, strAEQbTJ), C33069mpW.copydefault(C13754dXa.FragmentManager.ReportDrawnKtReportDrawnAfter1, C56424yEw.gEmmrt(C56390yDp.OLrzqt(OtcExtraKeys.AMOUNT, pTB.formatLocalized$default(N_(), null, 1, null)), C56390yDp.OLrzqt("token", fHqPtx().fJNWhG())))));
            i++;
        }
        return arrayList;
    }

    @Override // o.AbstractC8564bFB
    public void AhwBna() {
        DLWbHP().OLrzqt(yDY.gEmmrt(new C9806bcY(djSkpj(), fJNWhG().AYXKKw()), new C9803bcV(aKErDB())));
    }

    public List<C9861bda> djSkpj() {
        ArrayList<String> walletId = QVsKAR().getWalletId();
        ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(walletId, 10));
        int i = 0;
        for (Object obj : walletId) {
            if (i < 0) {
                yDY.AYXKKw();
            }
            arrayList.add(new C9861bda((String) obj, c_(copydefault(i), fJNWhG().AEQbTJ()), C33070mpX.AYXKKw(C13754dXa.FragmentManager.dispatchOnContextAvailable)));
            i++;
        }
        return arrayList;
    }

    public List<C9861bda> aKErDB() {
        ArrayList<String> walletId = QVsKAR().getWalletId();
        ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(walletId, 10));
        int i = 0;
        for (Object obj : walletId) {
            if (i < 0) {
                yDY.AYXKKw();
            }
            arrayList.add(new C9861bda((String) obj, heceqZ() ? EZpvd(KWHzl(i), fJNWhG().AEQbTJ(), EZpvd(i)) : true, C33070mpX.AYXKKw(C13754dXa.FragmentManager.setRecycleOnMeasureEnabled)));
            i++;
        }
        return arrayList;
    }

    public String KWHzl(int i) {
        return C54862xYb.convertToString$default(C54862xYb.divB$default(ejfBZ(copydefault((List<String>) QVsKAR().getFromAddress(), i)), Integer.valueOf(U_() ? AwvSrB() : 1), 0, null, 6, null), false, null, null, 7, null);
    }

    public final String copydefault(int i) {
        return C54862xYb.convertToString$default(C54862xYb.divB$default(gEmmrt(copydefault((List<String>) QVsKAR().getFromAddress(), i)), Integer.valueOf(U_() ? AwvSrB() : 1), 0, null, 6, null), false, null, null, 7, null);
    }

    @Override // o.AbstractC8564bFB
    public ArrayList<Integer> AuCTelauCTel() {
        if (QVsKAR().getCurTXIndex() == 0) {
            return yDY.copydefault(4);
        }
        return new ArrayList<>();
    }

    public final int AwvSrB() {
        return QVsKAR().getWalletId().size();
    }

    public final AbstractC58185ywX<Pair<Boolean, String>> AhwBna(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        boolean zIsTransferMaxAmount = QVsKAR().isTransferMaxAmount();
        QVsKAR().setTransferMaxAmount(false);
        String str2 = (String) CollectionsKt___CollectionsKt.firstOrNull(QVsKAR().getTransferAmount());
        if (str2 == null || str2.length() == 0) {
            str2 = "0";
        }
        if (str.length() == 0) {
            str = "0";
        }
        if (zIsTransferMaxAmount || !C33129mqd.OLrzqt(str, str2)) {
            QVsKAR().getTransferAmount().clear();
            for (String str3 : QVsKAR().getWalletId()) {
                QVsKAR().getTransferAmount().add(str);
            }
            x_();
            return QbewEr();
        }
        AbstractC58185ywX<Pair<Boolean, String>> abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(C56390yDp.OLrzqt(Boolean.FALSE, ""));
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        return abstractC58185ywXKWHzl;
    }

    public final AbstractC58185ywX<Pair<Boolean, String>> giSNqX() {
        if (ORxRYg()) {
            AbstractC58185ywX<Pair<Boolean, String>> abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(C56390yDp.OLrzqt(Boolean.FALSE, ""));
            Intrinsics.copydefault(abstractC58185ywXKWHzl);
            return abstractC58185ywXKWHzl;
        }
        QVsKAR().getTransferAmount().clear();
        QVsKAR().setTransferMaxAmount(true);
        x_();
        return QbewEr();
    }

    public final boolean ORxRYg() {
        return DTwDnp() && QVsKAR().isTransferMaxAmount();
    }

    public final boolean DTwDnp() {
        return QVsKAR().getAmountMode() == AmountMode.SPECIFIED;
    }

    @Override // o.AbstractC8704bHj
    public String AEQbTJ(boolean z, boolean z2) {
        return EZpvd(QVsKAR().getCurTXIndex());
    }

    public final String EZpvd(int i) {
        String strKWHzl;
        if (ORxRYg()) {
            strKWHzl = KWHzl(i);
            if (heceqZ()) {
                BigDecimal bigDecimalAEQbTJ = C54862xYb.AEQbTJ(strKWHzl, fJNWhG().AEQbTJ());
                return C33129mqd.gEmmrt(bigDecimalAEQbTJ, "0") ? "0" : C54862xYb.convertToString$default(bigDecimalAEQbTJ, false, null, null, 7, null);
            }
            if (strKWHzl == null || strKWHzl.length() == 0) {
                return "0";
            }
        } else {
            strKWHzl = (String) CollectionsKt___CollectionsKt.AkhnZx(QVsKAR().getTransferAmount(), i);
            if (strKWHzl == null || strKWHzl.length() == 0) {
                return "0";
            }
        }
        return strKWHzl;
    }

    public final String AubY() {
        BigDecimal bigDecimal = new BigDecimal(0);
        int size = QVsKAR().getWalletId().size();
        ArrayList arrayList = new ArrayList(size);
        BigDecimal bigDecimalKWHzl = bigDecimal;
        for (int i = 0; i < size; i++) {
            bigDecimalKWHzl = C54862xYb.KWHzl(bigDecimalKWHzl, EZpvd(i));
            arrayList.add(Unit.INSTANCE);
        }
        return C54862xYb.convertToString$default(bigDecimalKWHzl, false, null, null, 7, null);
    }

    public final String wlaJM() {
        BigDecimal bigDecimal = new BigDecimal(0);
        Iterator it = CollectionsKt___CollectionsKt.OqFWZa(QVsKAR().getFromAddress()).iterator();
        BigDecimal bigDecimalKWHzl = bigDecimal;
        while (it.hasNext()) {
            bigDecimalKWHzl = C54862xYb.KWHzl(bigDecimalKWHzl, AuCTel((String) it.next()));
        }
        return C54862xYb.convertToString$default(bigDecimalKWHzl, false, null, null, 7, null);
    }

    public final void AEQbTJ(int i) {
        copydefault((ArrayList<?>) QVsKAR().getWalletId(), i);
        copydefault((ArrayList<?>) QVsKAR().getFromAddress(), i);
        copydefault((ArrayList<?>) QVsKAR().getToAddress(), i);
        copydefault((ArrayList<?>) QVsKAR().getTransferAmount(), i);
        copydefault((ArrayList<?>) QVsKAR().getInterval(), i);
        copydefault((ArrayList<?>) this.fetchVPNInfo, i);
        if (i == 0) {
            iZzfmt();
        }
        x_();
        OLrzqt(4);
        fJNWhG().KWHzl(2);
    }

    public final boolean U_() {
        return QVsKAR().getTransferType() == 1;
    }

    public final boolean QOLQEE() {
        return QVsKAR().getTransferType() == 2;
    }

    public final boolean T_() {
        return QVsKAR().getTransferType() == 3;
    }

    public final void copydefault(@NotNull Application application) {
        Intrinsics.checkNotNullParameter(application, "");
        S_().add(application);
    }

    public final void KWHzl(@NotNull Application application) {
        Intrinsics.checkNotNullParameter(application, "");
        S_().remove(application);
    }

    public final MultiTransferSignData AxsJAY() {
        ArrayList<String> walletId;
        ArrayList<String> fromAddress;
        ArrayList<TransferAddressData> toAddress;
        long coinId = QVsKAR().getCoinId();
        int transferType = QVsKAR().getTransferType();
        int i = 0;
        if (U_()) {
            String[] strArr = new String[1];
            String str = (String) CollectionsKt___CollectionsKt.firstOrNull(QVsKAR().getWalletId());
            if (str == null) {
                str = "";
            }
            strArr[0] = str;
            walletId = yDY.copydefault(strArr);
        } else {
            walletId = QVsKAR().getWalletId();
        }
        if (U_()) {
            String[] strArr2 = new String[1];
            String str2 = (String) CollectionsKt___CollectionsKt.firstOrNull(QVsKAR().getFromAddress());
            strArr2[0] = str2 != null ? str2 : "";
            fromAddress = yDY.copydefault(strArr2);
        } else {
            fromAddress = QVsKAR().getFromAddress();
        }
        ArrayList<String> arrayList = fromAddress;
        if (QOLQEE()) {
            TransferAddressData transferAddressData = (TransferAddressData) CollectionsKt___CollectionsKt.firstOrNull(QVsKAR().getToAddress());
            if (transferAddressData == null || (toAddress = yDY.copydefault(transferAddressData)) == null) {
                toAddress = new ArrayList<>();
            }
        } else {
            toAddress = QVsKAR().getToAddress();
        }
        MultiTransferSignData multiTransferSignData = new MultiTransferSignData(coinId, transferType, walletId, arrayList, toAddress);
        for (Object obj : QVsKAR().getWalletId()) {
            if (i < 0) {
                yDY.AYXKKw();
            }
            multiTransferSignData.getTransferAmount().add(EZpvd(i));
            i++;
        }
        return multiTransferSignData;
    }

    public final String c_(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return C54880xYt.formatValuation$default(pTB.OLrzqt((Object) str), 0, 0, null, CurrencyDisplayStyle.CURRENCY_SYMBOL_PREFIX, zuWLRA().KWHzl(), null, false, 39, null);
    }

    public final String N_() {
        Object next;
        Iterator<T> it = QVsKAR().getToAddress().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (C33129mqd.AEQbTJ(((TransferAddressData) next).getExchangeDepositLimit(), 0)) {
                break;
            }
        }
        TransferAddressData transferAddressData = (TransferAddressData) next;
        String exchangeDepositLimit = transferAddressData != null ? transferAddressData.getExchangeDepositLimit() : null;
        return exchangeDepositLimit == null ? "" : exchangeDepositLimit;
    }

    public final void EZpvd(@NotNull IntervalMode intervalMode) {
        Intrinsics.checkNotNullParameter(intervalMode, "");
        if (QVsKAR().getIntervalMode() == intervalMode) {
            return;
        }
        QVsKAR().setIntervalMode(intervalMode);
        if (intervalMode == IntervalMode.NONE) {
            QVsKAR().setMinInterval("0");
            QVsKAR().setMaxInterval(MultiTransferSignData.DEFAULT_INTERVAL);
            QVsKAR().getInterval().clear();
        }
        ay_();
        OLrzqt(1);
    }

    public final AbstractC58185ywX<Pair<Boolean, String>> e_(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        SignData signdataQVsKAR = QVsKAR();
        if (str.length() == 0) {
            str = "0";
        }
        signdataQVsKAR.setMinInterval(str);
        if (ay_()) {
            M_();
            AbstractC58185ywX<Pair<Boolean, String>> abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(C56390yDp.OLrzqt(Boolean.TRUE, ""));
            Intrinsics.copydefault(abstractC58185ywXKWHzl);
            return abstractC58185ywXKWHzl;
        }
        AbstractC58185ywX<Pair<Boolean, String>> abstractC58185ywXKWHzl2 = AbstractC58185ywX.KWHzl(C56390yDp.OLrzqt(Boolean.FALSE, ""));
        Intrinsics.copydefault(abstractC58185ywXKWHzl2);
        return abstractC58185ywXKWHzl2;
    }

    public final AbstractC58185ywX<Pair<Boolean, String>> KWHzl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        SignData signdataQVsKAR = QVsKAR();
        if (str.length() == 0) {
            str = MultiTransferSignData.DEFAULT_INTERVAL;
        }
        signdataQVsKAR.setMaxInterval(str);
        if (ay_()) {
            M_();
            AbstractC58185ywX<Pair<Boolean, String>> abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(C56390yDp.OLrzqt(Boolean.TRUE, ""));
            Intrinsics.copydefault(abstractC58185ywXKWHzl);
            return abstractC58185ywXKWHzl;
        }
        AbstractC58185ywX<Pair<Boolean, String>> abstractC58185ywXKWHzl2 = AbstractC58185ywX.KWHzl(C56390yDp.OLrzqt(Boolean.FALSE, ""));
        Intrinsics.copydefault(abstractC58185ywXKWHzl2);
        return abstractC58185ywXKWHzl2;
    }

    public final void M_() {
        if (C33129mqd.valueOf(QVsKAR().getMaxInterval(), QVsKAR().getMinInterval())) {
            return;
        }
        QVsKAR().getInterval().clear();
        int iAwvSrB = AwvSrB();
        for (int i = 1; i < iAwvSrB; i++) {
            QVsKAR().getInterval().add(C33129mqd.AYXKKw(OLrzqt(QVsKAR().getMinInterval(), QVsKAR().getMaxInterval())));
        }
    }

    public final void EZpvd(@NotNull AmountMode amountMode) {
        Intrinsics.checkNotNullParameter(amountMode, "");
        QVsKAR().setAmountMode(amountMode);
        QVsKAR().getTransferAmount().clear();
        if (amountMode == AmountMode.SPECIFIED) {
            QVsKAR().setMinAmount("0");
            QVsKAR().setMaxAmount(MultiTransferSignData.DEFAULT_INTERVAL);
        } else {
            QVsKAR().setTransferMaxAmount(false);
        }
        x_();
        AhwBna();
        OLrzqt(2);
    }

    public final AbstractC58185ywX<Pair<Boolean, String>> d_(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        QVsKAR().setMinAmount(str);
        if (values() && I_()) {
            fARcdN();
            x_();
            return QbewEr();
        }
        AbstractC58185ywX<Pair<Boolean, String>> abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(C56390yDp.OLrzqt(Boolean.FALSE, ""));
        Intrinsics.copydefault(abstractC58185ywXKWHzl);
        return abstractC58185ywXKWHzl;
    }

    public final AbstractC58185ywX<Pair<Boolean, String>> OLrzqt(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        QVsKAR().setMaxAmount(str);
        if (values() && I_()) {
            fARcdN();
            x_();
            return QbewEr();
        }
        AbstractC58185ywX<Pair<Boolean, String>> abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(C56390yDp.OLrzqt(Boolean.FALSE, ""));
        Intrinsics.copydefault(abstractC58185ywXKWHzl);
        return abstractC58185ywXKWHzl;
    }

    public final void fARcdN() {
        String strKWHzl;
        QVsKAR().getTransferAmount().clear();
        int i = 0;
        for (Object obj : QVsKAR().getWalletId()) {
            if (i < 0) {
                yDY.AYXKKw();
            }
            if (heceqZ()) {
                strKWHzl = C54862xYb.convertToString$default(C54862xYb.AEQbTJ(KWHzl(i), fJNWhG().AEQbTJ()), false, null, null, 7, null);
            } else {
                strKWHzl = KWHzl(i);
            }
            int iValueOf = fHqPtx().valueOf();
            ArrayList<String> transferAmount = QVsKAR().getTransferAmount();
            String strAEQbTJ = C54870xYj.AEQbTJ(QVsKAR().getMinAmount(), iValueOf);
            if (!C33129mqd.valueOf(strKWHzl, QVsKAR().getMaxAmount())) {
                strKWHzl = QVsKAR().getMaxAmount();
            }
            transferAmount.add(C54862xYb.convertToBigIntegerString$default(C54870xYj.KWHzl(KWHzl(strAEQbTJ, C54870xYj.AEQbTJ(strKWHzl, iValueOf)), iValueOf), false, (RoundingMode) null, 3, (Object) null));
            i++;
        }
    }

    public final String OLrzqt(String str, String str2) {
        long jValueOf = C33129mqd.valueOf(str);
        long jValueOf2 = C33129mqd.valueOf(str2);
        return C33129mqd.copydefault(Long.valueOf(jValueOf), Long.valueOf(jValueOf2)) ? C33129mqd.gEmmrt(Long.valueOf(jValueOf2)) : C33129mqd.gEmmrt(Long.valueOf(Random.Default.nextLong(jValueOf, jValueOf2)));
    }

    public final String KWHzl(String str, String str2) {
        double dAEQbTJ = C33129mqd.AEQbTJ(str);
        double dAEQbTJ2 = C33129mqd.AEQbTJ(str2);
        return C33129mqd.copydefault(Double.valueOf(dAEQbTJ), Double.valueOf(dAEQbTJ2)) ? C33129mqd.gEmmrt(Double.valueOf(dAEQbTJ2)) : C33129mqd.gEmmrt(Double.valueOf(Random.Default.nextDouble(dAEQbTJ, dAEQbTJ2)));
    }

    public final void flVtFt() {
        DarRvM().EZpvd(af_());
    }

    public final void gasjUx() {
        DarRvM().getFieldNames();
    }

    public final void dvKsVJ() {
        ArrayList arrayList = new ArrayList();
        for (TransactionInfo transactionInfo : gHZMYf()) {
            if (C33129mqd.OLrzqt((CharSequence) transactionInfo.getTxHash()) && !this.gEmmrt.contains(Integer.valueOf(transactionInfo.getTxStatus()))) {
                arrayList.add(transactionInfo.getTxHash());
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        C10856bwO.copydefault("OKWBaseMultiTransfer", 0, "unconfirmedTxHashList: " + arrayList);
        InterfaceC58217yxC interfaceC58217yxC = this.djBIcL;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
        this.djBIcL = yBI.subscribeBy$default(C43423rox.unwrapResponseData$default(ixgjPv().copydefault(arrayList), (Function1) null, 1, (Object) null), (Function1) null, (Function0) null, new Function1() { // from class: o.bFb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return OKWBaseMultiTransfer.OLrzqt(this.AEQbTJ, (java.util.Map) obj);
            }
        }, 3, (Object) null);
    }

    @Override // com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction
    public AbstractC58185ywX<ResponseData<C9748bbT>> AEQbTJ(@NotNull final String str, final SubmitTxExpandBean submitTxExpandBean) {
        Intrinsics.checkNotNullParameter(str, "");
        final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        AbstractC58185ywX<Pair<Boolean, String>> abstractC58185ywXQfsBiF = QfsBiF();
        final Function1 function1 = new Function1() { // from class: o.bEW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return OKWBaseMultiTransfer.copydefault(this.OLrzqt, str, submitTxExpandBean, (kotlin.Pair) obj);
            }
        };
        AbstractC58185ywX<R> abstractC58185ywXKWHzl = abstractC58185ywXQfsBiF.KWHzl(new InterfaceC58229yxO() { // from class: o.bEZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return OKWBaseMultiTransfer.valueOf(function1, obj);
            }
        });
        final Function1 function12 = new Function1() { // from class: o.bEX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return OKWBaseMultiTransfer.OLrzqt(booleanRef, this, (ResponseData) obj);
            }
        };
        AbstractC58185ywX<ResponseData<C9748bbT>> abstractC58185ywXCopydefault = abstractC58185ywXKWHzl.AEQbTJ((InterfaceC58229yxO<? super R, ? extends R>) new InterfaceC58229yxO() { // from class: o.bFd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return OKWBaseMultiTransfer.AYXKKw(function12, obj);
            }
        }).copydefault(new InterfaceC58222yxH() { // from class: o.bFe
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58222yxH
            public final void run() {
                OKWBaseMultiTransfer.copydefault(this.AEQbTJ, booleanRef);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXCopydefault, "");
        return abstractC58185ywXCopydefault;
    }

    public static final InterfaceC60096zvd valueOf(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    public static final InterfaceC60096zvd copydefault(OKWBaseMultiTransfer oKWBaseMultiTransfer, String str, SubmitTxExpandBean submitTxExpandBean, Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        if (((Boolean) pair.getFirst()).booleanValue()) {
            return super.AEQbTJ(str, submitTxExpandBean);
        }
        String str2 = (String) pair.getSecond();
        AbstractC58185ywX abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(new ResponseData(-5000, str2 == null ? "" : str2, null, null, null, null, 60, null));
        Intrinsics.copydefault(abstractC58185ywXKWHzl);
        return abstractC58185ywXKWHzl;
    }

    public static final ResponseData AYXKKw(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (ResponseData) function1.invoke(obj);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: SignData */
    /* JADX DEBUG: Multi-variable search result rejected for r4v4, resolved type: SignData */
    /* JADX DEBUG: Multi-variable search result rejected for r4v7, resolved type: SignData */
    /* JADX WARN: Multi-variable type inference failed */
    public static final ResponseData OLrzqt(Ref.BooleanRef booleanRef, OKWBaseMultiTransfer oKWBaseMultiTransfer, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() == -5001) {
            booleanRef.element = true;
            if (((MultiTransferSignData) oKWBaseMultiTransfer.QVsKAR()).getCurTXIndex() == 0) {
                C10856bwO.copydefault("OKWBaseMultiTransfer", 0, "start multi(" + ((MultiTransferSignData) oKWBaseMultiTransfer.QVsKAR()).getTransferType() + ") transfer, multiOrderId: " + oKWBaseMultiTransfer.KWHzl);
                C8392bBp.copydefault.copydefault(oKWBaseMultiTransfer);
                if (oKWBaseMultiTransfer.valueOf() == BroadcastStrategy.CALL_API_FINISH) {
                    oKWBaseMultiTransfer.copydefault(oKWBaseMultiTransfer.Q_());
                } else {
                    oKWBaseMultiTransfer.copydefault(C33129mqd.valueOf(C54862xYb.KWHzl(Long.valueOf(oKWBaseMultiTransfer.QUSxYX()), Long.valueOf(oKWBaseMultiTransfer.Q_()))));
                }
            }
        } else {
            booleanRef.element = false;
            TransactionInfo transactionInfo = (TransactionInfo) CollectionsKt___CollectionsKt.AkhnZx(oKWBaseMultiTransfer.fetchVPNInfo, ((MultiTransferSignData) oKWBaseMultiTransfer.QVsKAR()).getCurTXIndex());
            if (transactionInfo != null) {
                transactionInfo.setTxStatus(3);
                oKWBaseMultiTransfer.OLrzqt(3);
            }
        }
        return responseData;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: SignData */
    /* JADX DEBUG: Multi-variable search result rejected for r5v2, resolved type: SignData */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void copydefault(OKWBaseMultiTransfer oKWBaseMultiTransfer, Ref.BooleanRef booleanRef) {
        if (((MultiTransferSignData) oKWBaseMultiTransfer.QVsKAR()).getCurTXIndex() != 0) {
            if (oKWBaseMultiTransfer.valueOf() == BroadcastStrategy.CALL_API_FINISH) {
                long jQ_ = oKWBaseMultiTransfer.Q_();
                if (((MultiTransferSignData) oKWBaseMultiTransfer.QVsKAR()).getCurTXIndex() == oKWBaseMultiTransfer.AwvSrB() - 1) {
                    jQ_ += oKWBaseMultiTransfer.QUSxYX();
                }
                oKWBaseMultiTransfer.copydefault(jQ_);
                return;
            }
            long jQ_2 = oKWBaseMultiTransfer.Q_();
            if (booleanRef.element) {
                jQ_2 += oKWBaseMultiTransfer.QUSxYX();
            }
            oKWBaseMultiTransfer.copydefault(jQ_2);
        }
    }

    public static final ResponseData AhwBna(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (ResponseData) function1.invoke(obj);
    }

    /* JADX DEBUG: Type inference failed for r3v2. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<com.okinc.network.okg.response.ResponseData<com.okinc.business.defi.biz.core.dapp.interaction.bean.DappTxResultBean>> */
    @Override // o.AbstractC8564bFB, com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction
    public AbstractC58185ywX<ResponseData<DappTxResultBean>> copydefault(@NotNull BatchBroadcastModel batchBroadcastModel, SubmitTxExpandBean submitTxExpandBean) {
        Intrinsics.checkNotNullParameter(batchBroadcastModel, "");
        AbstractC58185ywX<ResponseData<DappTxResultBean>> abstractC58185ywXCopydefault = super.copydefault(batchBroadcastModel, submitTxExpandBean);
        final Function1 function1 = new Function1() { // from class: o.bFk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return OKWBaseMultiTransfer.copydefault(this.OLrzqt, (ResponseData) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXAEQbTJ = abstractC58185ywXCopydefault.AEQbTJ(new InterfaceC58229yxO() { // from class: o.bEY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return OKWBaseMultiTransfer.AhwBna(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        return abstractC58185ywXAEQbTJ;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: SignData */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: SignData */
    /* JADX WARN: Multi-variable type inference failed */
    public static final ResponseData copydefault(OKWBaseMultiTransfer oKWBaseMultiTransfer, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        TransactionInfo transactionInfo = (TransactionInfo) CollectionsKt___CollectionsKt.AkhnZx(oKWBaseMultiTransfer.fetchVPNInfo, ((MultiTransferSignData) oKWBaseMultiTransfer.QVsKAR()).getCurTXIndex());
        if (transactionInfo != null) {
            DappTxResultBean dappTxResultBean = (DappTxResultBean) responseData.getData();
            String txHash = dappTxResultBean != null ? dappTxResultBean.getTxHash() : null;
            if (txHash == null) {
                txHash = "";
            }
            transactionInfo.setTxHash(txHash);
            DappTxResultBean dappTxResultBean2 = (DappTxResultBean) responseData.getData();
            String txId = dappTxResultBean2 != null ? dappTxResultBean2.getTxId() : null;
            transactionInfo.setTxId(txId != null ? txId : "");
            transactionInfo.setTxStatus(2);
            transactionInfo.setAmount(oKWBaseMultiTransfer.EZpvd(((MultiTransferSignData) oKWBaseMultiTransfer.QVsKAR()).getCurTXIndex()));
        }
        return responseData;
    }

    public final void copydefault(long j) {
        C10856bwO.copydefault("OKWBaseMultiTransfer", 0, "scheduleNextTransaction after " + j + " ms");
        O_().postDelayed(R_(), j);
    }

    public final long Q_() {
        String str = (String) CollectionsKt___CollectionsKt.AkhnZx(QVsKAR().getInterval(), QVsKAR().getCurTXIndex());
        if (str == null || str.length() == 0) {
            str = "0";
        }
        return ((long) C33129mqd.AhwBna(str)) * 1000;
    }

    public static /* synthetic */ BroadcastBean generateBroadcastModel$default(OKWBaseMultiTransfer oKWBaseMultiTransfer, String str, String str2, CommonTransferExtJson commonTransferExtJson, Object obj, int i, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: generateBroadcastModel");
        }
        if ((i & 4) != 0) {
            commonTransferExtJson = oKWBaseMultiTransfer.L_();
        }
        if ((i & 8) != 0) {
            obj = null;
        }
        return oKWBaseMultiTransfer.EZpvd(str, str2, commonTransferExtJson, obj);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r12v0, resolved type: com.okinc.business.defi.biz.core.transaction.sign.OKWBaseMultiTransfer<Fee extends o.bCW<?>, SignData extends com.okinc.business.defi.api.model.tx.signdata.MultiTransferSignData> */
    /* JADX WARN: Multi-variable type inference failed */
    public final BroadcastBean EZpvd(@NotNull String str, String str2, @NotNull CommonTransferExtJson commonTransferExtJson, Object obj) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(commonTransferExtJson, "");
        long jDGOPHZ = DGOPHZ();
        String transferAmount$default = AbstractC8704bHj.getTransferAmount$default(this, false, false, 3, null);
        String strAEQbTJ = fJNWhG().AEQbTJ();
        InterfaceC9747bbS interfaceC9747bbS = this instanceof InterfaceC9747bbS ? (InterfaceC9747bbS) this : null;
        return EZpvd(str, str2, jDGOPHZ, transferAmount$default, strAEQbTJ, commonTransferExtJson, obj, null, interfaceC9747bbS != null ? interfaceC9747bbS.copydefault() : null);
    }

    public final CommonTransferExtJson L_() {
        return new CommonTransferExtJson(fHqPtx().valueOf(), 0, KWHzl(), 1);
    }

    private final String KWHzl() {
        TransferAddressData transferAddressData = (TransferAddressData) CollectionsKt___CollectionsKt.AkhnZx(QVsKAR().getToAddress(), QVsKAR().getCurTXIndex());
        String okexAccount = transferAddressData != null ? transferAddressData.getOkexAccount() : null;
        if (okexAccount == null || okexAccount.length() == 0) {
            return null;
        }
        return okexAccount;
    }

    public final void OLrzqt(int i) {
        Iterator<T> it = S_().iterator();
        while (it.hasNext()) {
            ((Application) it.next()).KWHzl(i);
        }
    }

    public final void OcIXYQ() {
        C10856bwO.copydefault("OKWBaseMultiTransfer", 0, "notifyFinish");
        Iterator<T> it = S_().iterator();
        while (it.hasNext()) {
            ((Application) it.next()).KWHzl();
        }
    }

    public final List<String> P_() {
        ArrayList<ChainAddress> arrayListIsConnected = ((AbstractC12782ctV) CollectionsKt___CollectionsKt.AuCTelauCTel(C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null).copydefault())).isConnected();
        ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(arrayListIsConnected, 10));
        Iterator<T> it = arrayListIsConnected.iterator();
        while (it.hasNext()) {
            arrayList.add(((ChainAddress) it.next()).getAddress());
        }
        return arrayList;
    }

    @Override // o.AbstractC8564bFB, com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction
    public void fFgQHt() {
        super.fFgQHt();
        this.copydefault = 0;
        O_().removeCallbacksAndMessages(null);
        C11205cFp c11205cFp = C11205cFp.EZpvd;
        c11205cFp.AxsJAY().OLrzqt(zsXlph().AhwBna());
        S_().clear();
        c11205cFp.AEQbTJ(QVsKAR().getFromAddress(), P_());
        C10856bwO.copydefault("OKWBaseMultiTransfer", 0, "release");
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class BroadcastStrategy {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ BroadcastStrategy[] $VALUES;
        public static final BroadcastStrategy CALL_API_FINISH = new BroadcastStrategy("CALL_API_FINISH", 0);
        public static final BroadcastStrategy ON_CHAIN_FINISH = new BroadcastStrategy("ON_CHAIN_FINISH", 1);

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ BroadcastStrategy[] $values() {
            return new BroadcastStrategy[]{CALL_API_FINISH, ON_CHAIN_FINISH};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<BroadcastStrategy> getEntries() {
            return $ENTRIES;
        }

        private BroadcastStrategy(String str, int i) {
        }

        static {
            BroadcastStrategy[] broadcastStrategyArr$values = $values();
            $VALUES = broadcastStrategyArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(broadcastStrategyArr$values);
        }

        public static BroadcastStrategy valueOf(String str) {
            return (BroadcastStrategy) Enum.valueOf(BroadcastStrategy.class, str);
        }

        public static BroadcastStrategy[] values() {
            return (BroadcastStrategy[]) $VALUES.clone();
        }
    }

    public static final class TransactionInfo {
        public static final int $stable = 8;
        private String amount;
        private final String fromAddress;
        private String orderId;
        private final TransferAddressData toAddress;
        private String txHash;
        private String txId;
        private int txStatus;
        private final String walletId;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component1() {
            return this.walletId;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component2() {
            return this.fromAddress;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TransferAddressData component3() {
            return this.toAddress;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component4() {
            return this.txHash;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component5() {
            return this.txId;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component6() {
            return this.orderId;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component7() {
            return this.amount;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int component8() {
            return this.txStatus;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TransactionInfo copy(@NotNull String str, @NotNull String str2, @NotNull TransferAddressData transferAddressData, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, int i) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(transferAddressData, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            Intrinsics.checkNotNullParameter(str5, "");
            Intrinsics.checkNotNullParameter(str6, "");
            return new TransactionInfo(str, str2, transferAddressData, str3, str4, str5, str6, i);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TransactionInfo)) {
                return false;
            }
            TransactionInfo transactionInfo = (TransactionInfo) obj;
            return Intrinsics.EZpvd((Object) this.walletId, (Object) transactionInfo.walletId) && Intrinsics.EZpvd((Object) this.fromAddress, (Object) transactionInfo.fromAddress) && Intrinsics.EZpvd(this.toAddress, transactionInfo.toAddress) && Intrinsics.EZpvd((Object) this.txHash, (Object) transactionInfo.txHash) && Intrinsics.EZpvd((Object) this.txId, (Object) transactionInfo.txId) && Intrinsics.EZpvd((Object) this.orderId, (Object) transactionInfo.orderId) && Intrinsics.EZpvd((Object) this.amount, (Object) transactionInfo.amount) && this.txStatus == transactionInfo.txStatus;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getAmount() {
            return this.amount;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getFromAddress() {
            return this.fromAddress;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getOrderId() {
            return this.orderId;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TransferAddressData getToAddress() {
            return this.toAddress;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getTxHash() {
            return this.txHash;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getTxId() {
            return this.txId;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int getTxStatus() {
            return this.txStatus;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getWalletId() {
            return this.walletId;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((((((((((((this.walletId.hashCode() * 31) + this.fromAddress.hashCode()) * 31) + this.toAddress.hashCode()) * 31) + this.txHash.hashCode()) * 31) + this.txId.hashCode()) * 31) + this.orderId.hashCode()) * 31) + this.amount.hashCode()) * 31) + Integer.hashCode(this.txStatus);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setAmount(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.amount = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setOrderId(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.orderId = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setTxHash(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.txHash = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setTxId(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.txId = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setTxStatus(int i) {
            this.txStatus = i;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "TransactionInfo(walletId=" + this.walletId + ", fromAddress=" + this.fromAddress + ", toAddress=" + this.toAddress + ", txHash=" + this.txHash + ", txId=" + this.txId + ", orderId=" + this.orderId + ", amount=" + this.amount + ", txStatus=" + this.txStatus + ")";
        }

        public TransactionInfo(@NotNull String str, @NotNull String str2, @NotNull TransferAddressData transferAddressData, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, int i) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(transferAddressData, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            Intrinsics.checkNotNullParameter(str5, "");
            Intrinsics.checkNotNullParameter(str6, "");
            this.walletId = str;
            this.fromAddress = str2;
            this.toAddress = transferAddressData;
            this.txHash = str3;
            this.txId = str4;
            this.orderId = str5;
            this.amount = str6;
            this.txStatus = i;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0031: CONSTRUCTOR 
  (r13v0 java.lang.String)
  (r14v0 java.lang.String)
  (r15v0 com.okinc.business.defi.api.model.tx.signdata.TransferAddressData)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r21v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r21v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r17v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0014: ARITH (r21v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r18v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001c: ARITH (r21v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r19v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0024: ARITH (r21v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r20v0 int))
 A[MD:(java.lang.String, java.lang.String, com.okinc.business.defi.api.model.tx.signdata.TransferAddressData, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int):void (m)] (LINE:993) call: com.okinc.business.defi.biz.core.transaction.sign.OKWBaseMultiTransfer.TransactionInfo.<init>(java.lang.String, java.lang.String, com.okinc.business.defi.api.model.tx.signdata.TransferAddressData, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int):void type: THIS */
        public /* synthetic */ TransactionInfo(String str, String str2, TransferAddressData transferAddressData, String str3, String str4, String str5, String str6, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, transferAddressData, (i2 & 8) != 0 ? "" : str3, (i2 & 16) != 0 ? "" : str4, (i2 & 32) != 0 ? "" : str5, (i2 & 64) != 0 ? "" : str6, (i2 & 128) != 0 ? 0 : i);
        }
    }

    public interface Application {
        public static final C0246Application Companion = C0246Application.OLrzqt;

        void AEQbTJ();

        void KWHzl();

        void KWHzl(int i);

        /* JADX INFO: renamed from: com.okinc.business.defi.biz.core.transaction.sign.OKWBaseMultiTransfer$Application$Application, reason: collision with other inner class name */
        public static final class C0246Application {
            public static final /* synthetic */ C0246Application OLrzqt = new C0246Application();

            private C0246Application() {
            }
        }
    }

    public final boolean copydefault(ArrayList<?> arrayList, int i) {
        if (i < 0 || i >= arrayList.size()) {
            return false;
        }
        arrayList.remove(i);
        return true;
    }

    public final String copydefault(List<String> list, int i) {
        return (i < 0 || i > yDY.AuCTel(list)) ? "" : list.get(i);
    }

    public final ArrayList<TransactionInfo> gHZMYf() {
        ArrayList<TransactionInfo> arrayList = this.fetchVPNInfo;
        int i = 0;
        for (Object obj : arrayList) {
            if (i < 0) {
                yDY.AYXKKw();
            }
            TransactionInfo transactionInfo = (TransactionInfo) obj;
            if (!yEE.AhwBna(3, 4, 6, 2).contains(Integer.valueOf(transactionInfo.getTxStatus()))) {
                transactionInfo.setAmount(EZpvd(i));
            }
            i++;
        }
        return arrayList;
    }

    public static final Unit OLrzqt(OKWBaseMultiTransfer oKWBaseMultiTransfer, Map map) {
        Integer num;
        Intrinsics.checkNotNullParameter(map, "");
        boolean z = false;
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            Object obj = null;
            if (Intrinsics.EZpvd((Object) str2, (Object) "SUCCESS")) {
                num = 4;
            } else {
                num = Intrinsics.EZpvd((Object) str2, (Object) EventType.ERROR) ? 3 : null;
            }
            if (num != null) {
                oKWBaseMultiTransfer.copydefault++;
                Iterator<T> it = oKWBaseMultiTransfer.gHZMYf().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    if (Intrinsics.EZpvd((Object) ((TransactionInfo) next).getTxHash(), (Object) str)) {
                        obj = next;
                        break;
                    }
                }
                TransactionInfo transactionInfo = (TransactionInfo) obj;
                if (transactionInfo != null) {
                    transactionInfo.setTxStatus(num.intValue());
                }
                z = true;
            }
        }
        C10856bwO.copydefault("OKWBaseMultiTransfer", 0, "statusMap: " + map);
        if (z) {
            C10856bwO.copydefault("OKWBaseMultiTransfer", 0, "statusChanged");
            oKWBaseMultiTransfer.OLrzqt(3);
        }
        if (oKWBaseMultiTransfer.copydefault == oKWBaseMultiTransfer.AwvSrB()) {
            C10856bwO.copydefault("OKWBaseMultiTransfer", 0, "finish and release");
            oKWBaseMultiTransfer.OcIXYQ();
            oKWBaseMultiTransfer.fFgQHt();
        }
        return Unit.INSTANCE;
    }
}
