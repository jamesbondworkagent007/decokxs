package com.okinc.business.defi.biz.core.transaction.sign;

import com.okinc.business.defi.api.model.tx.SignAuthType;
import com.okinc.business.defi.api.model.tx.SubmitTxExpandBean;
import com.okinc.business.defi.api.model.tx.signdata.BaseSignData;
import com.okinc.business.defi.api.model.tx.signdata.PlatformItem;
import com.okinc.business.defi.api.model.tx.signdata.SignDataArgs;
import com.okinc.business.defi.biz.constant.WalletType;
import com.okinc.business.defi.biz.core.dapp.interaction.bean.DappTxResultBean;
import com.okinc.business.defi.biz.core.transaction.bean.BatchBroadcastModel;
import com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction;
import com.okinc.business.defi.biz.model.ChainAddress;
import com.okinc.business.defi.biz.net.bean.DappInfo;
import com.okinc.business.defi.biz.net.bean.PreExecTransactionReq;
import com.okinc.business.defi.biz.net.bean.TxToastCheckReq;
import com.okinc.business.defi.biz.net.bean.TxToastCheckRes;
import com.okinc.business.defi.wallet.common.WalletConnectUtils;
import com.okinc.business.defi.wallet.transaction.moduleModel.bean.BaseModel;
import com.okinc.business.defi.wallet.transaction.moduleModel.bean.ImageItem;
import com.okinc.business.defi.wallet.transaction.moduleModel.bean.PreExecTransactionRes;
import com.okinc.business.defi.wallet.transaction.moduleModel.bean.TipMessageInfo;
import com.okinc.business.defi.wallet.transaction.moduleModel.bean.TxInfoItem;
import com.okinc.network.okg.response.ResponseData;
import io.reactivex.BackpressureStrategy;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import o.AbstractC12782ctV;
import o.AbstractC58185ywX;
import o.AbstractC58260yxt;
import o.C10854bwM;
import o.C13934dbu;
import o.C33129mqd;
import o.C43423rox;
import o.C56390yDp;
import o.C56391yDq;
import o.C56392yDr;
import o.C56444yFp;
import o.C58266yxz;
import o.C8396bBt;
import o.C8497bDo;
import o.C8519bEJ;
import o.C8550bEo;
import o.C8551bEp;
import o.C9748bbT;
import o.C9796bcO;
import o.C9868bdh;
import o.C9872bdl;
import o.InterfaceC56387yDm;
import o.InterfaceC56445yFq;
import o.InterfaceC58181ywT;
import o.InterfaceC58184ywW;
import o.InterfaceC58187ywZ;
import o.InterfaceC58222yxH;
import o.InterfaceC58223yxI;
import o.InterfaceC58227yxM;
import o.InterfaceC58229yxO;
import o.InterfaceC58257yxq;
import o.InterfaceC58259yxs;
import o.InterfaceC60094zvb;
import o.InterfaceC60096zvd;
import o.fZQ;
import o.yBP;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public abstract class OKWBaseTransaction<SignData extends BaseSignData> {
    public SignDataArgs<SignData> AuCTelauCTel;
    public ChainAddress AwvSrB;
    public AbstractC12782ctV AxsJAY;
    public PreExecTransactionRes DTwDnp;
    public InterfaceC60094zvb QKVWgx;
    public boolean getFieldNames;
    public boolean uzCIH;
    public C10854bwM wlaJM;
    public boolean zLjUOn;
    public final boolean AubY = C8396bBt.AEQbTJ.copydefault();
    public final C13934dbu QOLQEE = new C13934dbu();
    public final InterfaceC56387yDm zuBGHE = C56392yDr.copydefault(new Function0() { // from class: o.bGP
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return OKWBaseTransaction.hBpjJd();
        }
    });
    public final InterfaceC56387yDm sSMYrx = C56392yDr.copydefault(new Function0() { // from class: o.bGZ
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return OKWBaseTransaction.copydefault(this.OLrzqt);
        }
    });
    public final InterfaceC56387yDm gHZMYf = C56392yDr.copydefault(new Function0() { // from class: o.bGY
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return OKWBaseTransaction.AEQbTJ(this.EZpvd);
        }
    });
    public final CopyOnWriteArrayList<StateListAnimator> zsXlph = new CopyOnWriteArrayList<>();

    public final /* synthetic */ class Activity {
        public static final /* synthetic */ int[] EZpvd;
        public static final /* synthetic */ int[] KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[TransactionType.values().length];
            try {
                iArr[TransactionType.Approve.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TransactionType.CancelApprove.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TransactionType.Contract.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            EZpvd = iArr;
            int[] iArr2 = new int[WalletType.values().length];
            try {
                iArr2[WalletType.HDWallet.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[WalletType.TonWallet.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[WalletType.KeyWallet.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[WalletType.HardwareWallet.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[WalletType.MPCWallet.ordinal()] = 5;
            } catch (NoSuchFieldError unused8) {
            }
            KWHzl = iArr2;
        }
    }

    public interface StateListAnimator {
        void EZpvd(@NotNull List<? extends BaseModel<?>> list);
    }

    public abstract void AEQbTJ(@NotNull List<TxToastCheckRes> list);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void AYXKKw(boolean z) {
        this.getFieldNames = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void AhwBna(boolean z) {
        this.uzCIH = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(@NotNull AbstractC12782ctV abstractC12782ctV) {
        Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
        this.AxsJAY = abstractC12782ctV;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean H_() {
        return this.AubY;
    }

    public abstract AbstractC58185ywX<Pair<Boolean, String>> KWHzl(@NotNull BaseSignData baseSignData);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean ODXsMY() {
        return this.uzCIH;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C13934dbu OFhtUX() {
        return this.QOLQEE;
    }

    public abstract AbstractC58185ywX<ResponseData<BatchBroadcastModel>> OLrzqt(@NotNull String str, SubmitTxExpandBean submitTxExpandBean);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(@NotNull ChainAddress chainAddress) {
        Intrinsics.checkNotNullParameter(chainAddress, "");
        this.AwvSrB = chainAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PreExecTransactionRes QSLkRj() {
        return this.DTwDnp;
    }

    public abstract String ag_();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String copydefault(@NotNull Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return "";
    }

    public abstract AbstractC58185ywX<ResponseData<DappTxResultBean>> copydefault(@NotNull BatchBroadcastModel batchBroadcastModel, SubmitTxExpandBean submitTxExpandBean);

    public void fFgQHt() {
    }

    public abstract ArrayList<Integer> getNewProxyInstance();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean gwTjWJ() {
        return this.getFieldNames;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C13934dbu ixgjPv() {
        return this.QOLQEE;
    }

    public abstract TransactionType k_();

    public abstract AbstractC58185ywX<Pair<Boolean, String>> s_();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean zblBkD() {
        return this.zLjUOn;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class TransactionType {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ TransactionType[] $VALUES;
        public static final TransactionType Approve;
        public static final TransactionType CancelApprove;
        public static final TransactionType Contract;
        public static final TransactionType DappTransfer;
        public static final TransactionType Message;
        public static final TransactionType Register;
        public static final TransactionType SolanaMultiSign;
        public static final TransactionType Transfer = new TransactionType("Transfer", 0, Integer.MIN_VALUE);
        private final int value;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ TransactionType[] $values() {
            return new TransactionType[]{Transfer, Contract, Approve, Message, Register, DappTransfer, SolanaMultiSign, CancelApprove};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<TransactionType> getEntries() {
            return $ENTRIES;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int getValue() {
            return this.value;
        }

        private TransactionType(String str, int i, int i2) {
            this.value = i2;
        }

        static {
            TransactionType transactionType = new TransactionType("Contract", 1, 1073741824);
            Contract = transactionType;
            TransactionType transactionType2 = new TransactionType("Approve", 2, 536870912);
            Approve = transactionType2;
            Message = new TransactionType("Message", 3, 268435456);
            Register = new TransactionType("Register", 4, 134217728);
            DappTransfer = new TransactionType("DappTransfer", 5, transactionType.value | 1);
            SolanaMultiSign = new TransactionType("SolanaMultiSign", 6, transactionType.value | 2);
            CancelApprove = new TransactionType("CancelApprove", 7, transactionType2.value | 1);
            TransactionType[] transactionTypeArr$values = $values();
            $VALUES = transactionTypeArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(transactionTypeArr$values);
        }

        public final boolean isTransfer() {
            int i = this.value;
            int i2 = Transfer.value;
            return (i & i2) == i2;
        }

        public final boolean isContract() {
            int i = this.value;
            int i2 = Contract.value;
            return (i & i2) == i2;
        }

        public final boolean isApprove() {
            int i = this.value;
            int i2 = Approve.value;
            return (i & i2) == i2;
        }

        public final boolean isMessage() {
            int i = this.value;
            int i2 = Message.value;
            return (i & i2) == i2;
        }

        public final boolean isRegister() {
            int i = this.value;
            int i2 = Register.value;
            return (i & i2) == i2;
        }

        public static TransactionType valueOf(String str) {
            return (TransactionType) Enum.valueOf(TransactionType.class, str);
        }

        public static TransactionType[] values() {
            return (TransactionType[]) $VALUES.clone();
        }
    }

    public final C8497bDo DLWbHP() {
        return (C8497bDo) this.zuBGHE.getValue();
    }

    public static final C8497bDo hBpjJd() {
        return new C8497bDo();
    }

    public final C8551bEp OHqIaq() {
        return (C8551bEp) this.sSMYrx.getValue();
    }

    public static final C8551bEp copydefault(OKWBaseTransaction oKWBaseTransaction) {
        return new C8551bEp(oKWBaseTransaction);
    }

    public final C8550bEo hrNTAI() {
        return (C8550bEo) this.gHZMYf.getValue();
    }

    public static final C8550bEo AEQbTJ(OKWBaseTransaction oKWBaseTransaction) {
        return new C8550bEo(oKWBaseTransaction);
    }

    public boolean KWHzl(@NotNull AbstractC12782ctV abstractC12782ctV, @NotNull C10854bwM c10854bwM, @NotNull SignDataArgs<SignData> signDataArgs) {
        Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
        Intrinsics.checkNotNullParameter(c10854bwM, "");
        Intrinsics.checkNotNullParameter(signDataArgs, "");
        this.AxsJAY = abstractC12782ctV;
        this.wlaJM = c10854bwM;
        this.AuCTelauCTel = signDataArgs;
        this.AwvSrB = OLrzqt(dUDNAs(), ag_());
        if (signDataArgs.getUseDefaultUI()) {
            return true;
        }
        AhwBna(false);
        AYXKKw(false);
        return true;
    }

    public static /* synthetic */ AbstractC58185ywX preCheck$default(OKWBaseTransaction oKWBaseTransaction, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: preCheck");
        }
        if ((i & 1) != 0) {
            z = true;
        }
        return oKWBaseTransaction.KWHzl(z);
    }

    public AbstractC58185ywX<Pair<Boolean, String>> KWHzl(boolean z) {
        InterfaceC60096zvd interfaceC60096zvdAEQbTJ;
        AbstractC58185ywX abstractC58185ywXKWHzl;
        final ArrayList<Integer> newProxyInstance = getNewProxyInstance();
        if (ODXsMY()) {
            ArrayList<Integer> arrayListCall = call();
            Iterator<Integer> it = newProxyInstance.iterator();
            Intrinsics.checkNotNullExpressionValue(it, "");
            while (it.hasNext()) {
                if (arrayListCall.contains(it.next())) {
                    it.remove();
                }
            }
        }
        if (newProxyInstance.isEmpty()) {
            interfaceC60096zvdAEQbTJ = AbstractC58185ywX.KWHzl(C56390yDp.OLrzqt(Boolean.TRUE, null));
        } else {
            TxToastCheckReq txToastCheckReqI_ = i_();
            txToastCheckReqI_.setCheckTypes(CollectionsKt___CollectionsKt.QbewEr(newProxyInstance));
            AbstractC58185ywX<List<TxToastCheckRes>> abstractC58185ywXOLrzqt = OLrzqt(txToastCheckReqI_);
            final Function1 function1 = new Function1() { // from class: o.bGC
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return OKWBaseTransaction.EZpvd(this.EZpvd, newProxyInstance, (java.util.List) obj);
                }
            };
            interfaceC60096zvdAEQbTJ = abstractC58185ywXOLrzqt.AEQbTJ(new InterfaceC58229yxO() { // from class: o.bGI
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58229yxO
                public final java.lang.Object apply(java.lang.Object obj) {
                    return OKWBaseTransaction.UeEOUB(function1, obj);
                }
            });
        }
        Intrinsics.copydefault(interfaceC60096zvdAEQbTJ);
        if (ODXsMY()) {
            abstractC58185ywXKWHzl = preExecTransaction$default(this, null, 1, null);
        } else {
            abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(C56390yDp.OLrzqt(Boolean.TRUE, null));
            Intrinsics.copydefault(abstractC58185ywXKWHzl);
        }
        final Function2 function2 = new Function2() { // from class: o.bGK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return OKWBaseTransaction.djBIcL((kotlin.Pair) obj, (kotlin.Pair) obj2);
            }
        };
        AbstractC58185ywX<Pair<Boolean, String>> abstractC58185ywXEZpvd = AbstractC58185ywX.EZpvd(interfaceC60096zvdAEQbTJ, abstractC58185ywXKWHzl, new InterfaceC58223yxI() { // from class: o.bGL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58223yxI
            public final java.lang.Object apply(java.lang.Object obj, java.lang.Object obj2) {
                return OKWBaseTransaction.valueOf(function2, obj, obj2);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXEZpvd, "");
        return abstractC58185ywXEZpvd;
    }

    public static final Pair UeEOUB(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (Pair) function1.invoke(obj);
    }

    public static final Pair EZpvd(OKWBaseTransaction oKWBaseTransaction, ArrayList arrayList, List list) {
        Intrinsics.checkNotNullParameter(list, "");
        if (list.isEmpty()) {
            return C56390yDp.OLrzqt(Boolean.FALSE, "");
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = list.iterator();
        while (true) {
            Object obj = null;
            if (!it.hasNext()) {
                oKWBaseTransaction.AEQbTJ(arrayList2);
                return C56390yDp.OLrzqt(Boolean.TRUE, null);
            }
            Object next = it.next();
            TxToastCheckRes txToastCheckRes = (TxToastCheckRes) next;
            Iterator it2 = arrayList.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next2 = it2.next();
                int iIntValue = ((Number) next2).intValue();
                Integer checkType = txToastCheckRes.getCheckType();
                if (checkType != null && checkType.intValue() == iIntValue) {
                    obj = next2;
                    break;
                }
            }
            if (obj != null) {
                arrayList2.add(next);
            }
        }
    }

    public static final Pair valueOf(Function2 function2, Object obj, Object obj2) {
        Intrinsics.checkNotNullParameter(obj, "");
        Intrinsics.checkNotNullParameter(obj2, "");
        return (Pair) function2.invoke(obj, obj2);
    }

    public static final Pair djBIcL(Pair pair, Pair pair2) {
        Intrinsics.checkNotNullParameter(pair, "");
        Intrinsics.checkNotNullParameter(pair2, "");
        return !((Boolean) pair.getFirst()).booleanValue() ? pair : !((Boolean) pair2.getFirst()).booleanValue() ? pair2 : C56390yDp.OLrzqt(Boolean.TRUE, null);
    }

    public AbstractC58185ywX<Pair<Boolean, String>> dxcTrN() {
        AbstractC58185ywX<Pair<Boolean, String>> abstractC58185ywXAEQbTJ = AbstractC58185ywX.AEQbTJ(new Callable() { // from class: o.bGG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return OKWBaseTransaction.AYXKKw(this.OLrzqt);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        return abstractC58185ywXAEQbTJ;
    }

    public static final Pair AYXKKw(OKWBaseTransaction oKWBaseTransaction) {
        oKWBaseTransaction.run();
        return C56390yDp.OLrzqt(Boolean.TRUE, null);
    }

    public final void run() {
        TxInfoItem txInfo;
        if (DCUTEIddSDPG()) {
            if (!ODXsMY()) {
                this.DTwDnp = hrNTAI().EZpvd();
                return;
            }
            if (gwTjWJ() && this.zLjUOn) {
                return;
            }
            PreExecTransactionRes preExecTransactionRes = this.DTwDnp;
            if (preExecTransactionRes == null) {
                this.DTwDnp = hrNTAI().EZpvd();
                return;
            }
            if ((preExecTransactionRes != null ? preExecTransactionRes.getTxInfo() : null) == null) {
                PreExecTransactionRes preExecTransactionRes2 = this.DTwDnp;
                if (preExecTransactionRes2 != null) {
                    preExecTransactionRes2.setTxInfo(hrNTAI().AEQbTJ());
                    return;
                }
                return;
            }
            PreExecTransactionRes preExecTransactionRes3 = this.DTwDnp;
            if (preExecTransactionRes3 == null || (txInfo = preExecTransactionRes3.getTxInfo()) == null) {
                return;
            }
            txInfo.setModuleList(hrNTAI().OLrzqt());
        }
    }

    public final void b_(List<? extends BaseModel<?>> list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        Iterator<T> it = this.zsXlph.iterator();
        while (it.hasNext()) {
            ((StateListAnimator) it.next()).EZpvd(list);
        }
    }

    public static final class ActionBar implements StateListAnimator {
        public final /* synthetic */ Ref.ObjectRef<InterfaceC58181ywT<List<BaseModel<?>>>> OLrzqt;

        public ActionBar(Ref.ObjectRef<InterfaceC58181ywT<List<BaseModel<?>>>> objectRef) {
            this.OLrzqt = objectRef;
        }

        @Override // com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction.StateListAnimator
        public void EZpvd(List<? extends BaseModel<?>> list) {
            Intrinsics.checkNotNullParameter(list, "");
            InterfaceC58181ywT<List<BaseModel<?>>> interfaceC58181ywT = this.OLrzqt.element;
            if (interfaceC58181ywT != null) {
                interfaceC58181ywT.onNext(list);
            }
        }
    }

    public final AbstractC58185ywX<List<BaseModel<?>>> WS() {
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        final ActionBar actionBar = new ActionBar(objectRef);
        AbstractC58185ywX<List<BaseModel<?>>> abstractC58185ywXEZpvd = AbstractC58185ywX.KWHzl(new InterfaceC58187ywZ() { // from class: o.bGE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58187ywZ
            public final void subscribe(InterfaceC58184ywW interfaceC58184ywW) {
                OKWBaseTransaction.copydefault(objectRef, this, actionBar, interfaceC58184ywW);
            }
        }, BackpressureStrategy.LATEST).EZpvd(new InterfaceC58222yxH() { // from class: o.bGD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58222yxH
            public final void run() {
                OKWBaseTransaction.KWHzl(this.copydefault, actionBar);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXEZpvd, "");
        return abstractC58185ywXEZpvd;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: o.ywW */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void copydefault(Ref.ObjectRef objectRef, OKWBaseTransaction oKWBaseTransaction, ActionBar actionBar, InterfaceC58184ywW interfaceC58184ywW) {
        Intrinsics.checkNotNullParameter(interfaceC58184ywW, "");
        objectRef.element = interfaceC58184ywW;
        oKWBaseTransaction.zsXlph.add(actionBar);
    }

    public static final void KWHzl(OKWBaseTransaction oKWBaseTransaction, ActionBar actionBar) {
        oKWBaseTransaction.zsXlph.remove(actionBar);
    }

    public ArrayList<Integer> call() {
        return yDY.copydefault(2, 3, 6, 8, 9, 10);
    }

    public final boolean DCUTEIdCUTEI() {
        return ODXsMY();
    }

    public final boolean DCUTEIddSDPG() {
        return H_() && OJuSTm().getUseDefaultUI();
    }

    public static /* synthetic */ AbstractC58185ywX preExecTransaction$default(OKWBaseTransaction oKWBaseTransaction, PreExecTransactionReq preExecTransactionReq, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: preExecTransaction");
        }
        if ((i & 1) != 0) {
            preExecTransactionReq = oKWBaseTransaction.RdAHlO();
        }
        return oKWBaseTransaction.AEQbTJ(preExecTransactionReq);
    }

    public static final Pair RcXXUw(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (Pair) function1.invoke(obj);
    }

    /* JADX DEBUG: Type inference failed for r4v2. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> */
    public AbstractC58185ywX<Pair<Boolean, String>> AEQbTJ(@NotNull PreExecTransactionReq preExecTransactionReq) {
        Intrinsics.checkNotNullParameter(preExecTransactionReq, "");
        AbstractC58185ywX<ResponseData<PreExecTransactionRes>> abstractC58185ywXCopydefault = this.QOLQEE.copydefault(preExecTransactionReq);
        final Function1 function1 = new Function1() { // from class: o.bHf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return OKWBaseTransaction.KWHzl(this.EZpvd, (ResponseData) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXAEQbTJ = abstractC58185ywXCopydefault.AEQbTJ(new InterfaceC58229yxO() { // from class: o.bHc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return OKWBaseTransaction.RcXXUw(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        return abstractC58185ywXAEQbTJ;
    }

    public PreExecTransactionReq RdAHlO() {
        String urlOnlyHost;
        String platform;
        String strHtlTjW = htlTjW();
        PlatformItem dapp = OJuSTm().getDapp();
        if (dapp == null || (urlOnlyHost = dapp.getUrlOnlyHost()) == null || urlOnlyHost.length() == 0) {
            urlOnlyHost = null;
        }
        if (dapp == null || (platform = dapp.getPlatform()) == null || platform.length() == 0) {
            platform = null;
        }
        return new PreExecTransactionReq(null, null, strHtlTjW, null, new DappInfo(urlOnlyHost, platform, dapp != null ? dapp.getLogo() : null), dHguZz().fetchVPNInfo(), OJuSTm().getTxToastCheckBizLine(), OJuSTm().getTxToastCheckPayload(), false, null, null, null, null, null, 16139, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void KWHzl(@NotNull PreExecTransactionRes preExecTransactionRes) {
        boolean z;
        ImageItem image;
        List<BaseModel<?>> moduleList;
        Intrinsics.checkNotNullParameter(preExecTransactionRes, "");
        TxInfoItem txInfo = preExecTransactionRes.getTxInfo();
        if (gwTjWJ()) {
            if (C33129mqd.KWHzl((Collection) ((txInfo == null || (moduleList = txInfo.getModuleList()) == null) ? null : CollectionsKt___CollectionsKt.QfsBiF(moduleList)))) {
                z = true;
            }
        } else {
            z = false;
        }
        this.zLjUOn = z;
        C9868bdh c9868bdh = new C9868bdh(true, null, null, null, 12, null);
        C9872bdl c9872bdl = new C9872bdl(true, null, null, 6, null);
        TipMessageInfo tipMessageInfo = txInfo != null ? txInfo.getTipMessageInfo() : null;
        if (fZQ.OLrzqt(tipMessageInfo)) {
            String tipMessage = tipMessageInfo != null ? tipMessageInfo.getTipMessage() : null;
            if (tipMessage == null || tipMessage.length() == 0) {
                Boolean preExeStatus = txInfo.getPreExeStatus();
                Boolean bool = Boolean.FALSE;
                boolean z2 = (Intrinsics.EZpvd(preExeStatus, bool) && Intrinsics.EZpvd(txInfo.getNeedFillUp(), bool)) ? false : true;
                if (tipMessageInfo != null && (image = tipMessageInfo.getImage()) != null) {
                    c9796bcO = new C9796bcO(image.getLight(), image.getDark());
                }
                c9868bdh = new C9868bdh(z2, tipMessage, c9796bcO, Boolean.valueOf(Intrinsics.EZpvd(txInfo.getPreExeStatus(), Boolean.FALSE)));
            }
        } else {
            if (txInfo != null) {
                Boolean preExeStatus2 = txInfo.getPreExeStatus();
                Boolean bool2 = Boolean.FALSE;
                if (!Intrinsics.EZpvd(preExeStatus2, bool2) || !Intrinsics.EZpvd(txInfo.getNeedFillUp(), bool2)) {
                }
            }
            if (fZQ.copydefault(tipMessageInfo)) {
                String tipMessage2 = tipMessageInfo.getTipMessage();
                boolean z3 = tipMessage2 == null || tipMessage2.length() == 0;
                ImageItem image2 = tipMessageInfo.getImage();
                c9872bdl = new C9872bdl(z3, tipMessage2, image2 != null ? new C9796bcO(image2.getLight(), image2.getDark()) : null);
            }
        }
        DLWbHP().OLrzqt(yDY.gEmmrt(c9868bdh, c9872bdl));
        this.DTwDnp = preExecTransactionRes;
        run();
    }

    public final List<BaseModel<?>> USBtdM() {
        TxInfoItem txInfo;
        PreExecTransactionRes preExecTransactionRes = this.DTwDnp;
        if (preExecTransactionRes == null || (txInfo = preExecTransactionRes.getTxInfo()) == null) {
            return null;
        }
        return txInfo.getModuleList();
    }

    public AbstractC58185ywX<List<TxToastCheckRes>> OLrzqt(@NotNull TxToastCheckReq txToastCheckReq) {
        Intrinsics.checkNotNullParameter(txToastCheckReq, "");
        return C43423rox.unwrapResponseData$default(this.QOLQEE.copydefault(txToastCheckReq), (Function1) null, 1, (Object) null);
    }

    public static /* synthetic */ int getToastCheckTxType$default(OKWBaseTransaction oKWBaseTransaction, TransactionType transactionType, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getToastCheckTxType");
        }
        if ((i & 1) != 0) {
            transactionType = oKWBaseTransaction.aUsmxb();
        }
        return oKWBaseTransaction.copydefault(transactionType);
    }

    public final int copydefault(@NotNull TransactionType transactionType) {
        Intrinsics.checkNotNullParameter(transactionType, "");
        int i = Activity.EZpvd[transactionType.ordinal()];
        if (i == 1 || i == 2) {
            return 2;
        }
        return i != 3 ? 1 : 3;
    }

    public TxToastCheckReq i_() {
        String url;
        TxToastCheckReq txToastCheckReq = new TxToastCheckReq(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0 == true ? 1 : 0, 0L, null, null, null, null, null, 4194303, null);
        txToastCheckReq.setTxType(Integer.valueOf(getToastCheckTxType$default(this, null, 1, null)));
        txToastCheckReq.setFrom(htlTjW());
        txToastCheckReq.setBizLine(OJuSTm().getTxToastCheckBizLine());
        txToastCheckReq.setPayload(OJuSTm().getTxToastCheckPayload());
        txToastCheckReq.setChainId(dHguZz().fetchVPNInfo());
        PlatformItem dapp = OJuSTm().getDapp();
        if (dapp == null || (url = dapp.getUrl()) == null) {
            url = "";
        }
        txToastCheckReq.setDomain(url);
        return txToastCheckReq;
    }

    public ChainAddress OLrzqt(@NotNull AbstractC12782ctV abstractC12782ctV, @NotNull String str) {
        ChainAddress chainAddressCopydefault;
        Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
        Intrinsics.checkNotNullParameter(str, "");
        if (str.length() == 0) {
            chainAddressCopydefault = AbstractC12782ctV.addressFromChainId$default(abstractC12782ctV, dHguZz().AhwBna(), null, 2, null);
        } else {
            chainAddressCopydefault = abstractC12782ctV.copydefault(str, Long.valueOf(dmfpNf()));
        }
        Intrinsics.copydefault(chainAddressCopydefault);
        return chainAddressCopydefault;
    }

    public final AbstractC12782ctV dUDNAs() {
        AbstractC12782ctV abstractC12782ctV = this.AxsJAY;
        if (abstractC12782ctV != null) {
            return abstractC12782ctV;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    public final String Dmq() {
        return dUDNAs().DbNXlk();
    }

    public final int fjfviF() {
        return dUDNAs().finit();
    }

    public final String OxVOHk() {
        return dUDNAs().USBtdM();
    }

    public final String QCjLjM() {
        return dUDNAs().aUsmxb();
    }

    public final ChainAddress fERRXa() {
        ChainAddress chainAddress = this.AwvSrB;
        if (chainAddress != null) {
            return chainAddress;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    public final String htlTjW() {
        return fERRXa().getAddress();
    }

    public final String spnCvw() {
        return dHguZz().KWHzl(htlTjW());
    }

    public final int fdOvFl() {
        return fERRXa().getAddressType();
    }

    public final String igXuih() {
        return fERRXa().getPublicKey();
    }

    public final C10854bwM dHguZz() {
        C10854bwM c10854bwM = this.wlaJM;
        if (c10854bwM != null) {
            return c10854bwM;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    public final long dmfpNf() {
        return dHguZz().AhwBna();
    }

    public final SignDataArgs<SignData> OJuSTm() {
        SignDataArgs<SignData> signDataArgs = this.AuCTelauCTel;
        if (signDataArgs != null) {
            return signDataArgs;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    public SignData QVsKAR() {
        return (SignData) OJuSTm().getSignData();
    }

    public final TransactionType aUsmxb() {
        return k_();
    }

    public final int QwvEab() {
        Integer txSource = OJuSTm().getTxSource();
        if (txSource != null) {
            return txSource.intValue();
        }
        return 0;
    }

    public final C8497bDo UlJrfe() {
        return DLWbHP();
    }

    public static /* synthetic */ AbstractC58185ywX submit$default(OKWBaseTransaction oKWBaseTransaction, String str, SubmitTxExpandBean submitTxExpandBean, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: submit");
        }
        if ((i & 2) != 0) {
            submitTxExpandBean = null;
        }
        return oKWBaseTransaction.AEQbTJ(str, submitTxExpandBean);
    }

    public AbstractC58185ywX<ResponseData<C9748bbT>> AEQbTJ(@NotNull String str, final SubmitTxExpandBean submitTxExpandBean) {
        Intrinsics.checkNotNullParameter(str, "");
        InterfaceC60094zvb interfaceC60094zvb = this.QKVWgx;
        if (interfaceC60094zvb != null) {
            interfaceC60094zvb.cancel();
        }
        AbstractC58185ywX<ResponseData<BatchBroadcastModel>> abstractC58185ywXKWHzl = KWHzl(str, submitTxExpandBean);
        final Function1 function1 = new Function1() { // from class: o.bGO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return OKWBaseTransaction.OLrzqt(this.copydefault, submitTxExpandBean, (ResponseData) obj);
            }
        };
        AbstractC58185ywX<R> abstractC58185ywXKWHzl2 = abstractC58185ywXKWHzl.KWHzl(new InterfaceC58229yxO() { // from class: o.bGN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return OKWBaseTransaction.dNCPSb(function1, obj);
            }
        });
        final Function1 function12 = new Function1() { // from class: o.bGS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return OKWBaseTransaction.copydefault(this.AEQbTJ, (ResponseData) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXKWHzl3 = abstractC58185ywXKWHzl2.KWHzl((InterfaceC58229yxO<? super R, ? extends InterfaceC60096zvd<? extends R>>) new InterfaceC58229yxO() { // from class: o.bGU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return OKWBaseTransaction.aKErDB(function12, obj);
            }
        });
        final Function1 function13 = new Function1() { // from class: o.bGV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return OKWBaseTransaction.AEQbTJ(submitTxExpandBean, (ResponseData) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXAEQbTJ = abstractC58185ywXKWHzl3.AEQbTJ(new InterfaceC58229yxO() { // from class: o.bGR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return OKWBaseTransaction.djSkpj(function13, obj);
            }
        });
        final Function1 function14 = new Function1() { // from class: o.bGT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return OKWBaseTransaction.AEQbTJ(this.copydefault, submitTxExpandBean, (java.lang.Throwable) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXOLrzqt = abstractC58185ywXAEQbTJ.OLrzqt(new InterfaceC58227yxM() { // from class: o.bGX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                OKWBaseTransaction.fZBcTu(function14, obj);
            }
        });
        final Function1 function15 = new Function1() { // from class: o.bGW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return OKWBaseTransaction.AEQbTJ(this.AEQbTJ, (InterfaceC60094zvb) obj);
            }
        };
        AbstractC58185ywX<ResponseData<C9748bbT>> abstractC58185ywXEZpvd = abstractC58185ywXOLrzqt.EZpvd(new InterfaceC58227yxM() { // from class: o.bHa
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                OKWBaseTransaction.dxcTrN(function15, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXEZpvd, "");
        return abstractC58185ywXEZpvd;
    }

    public static final InterfaceC60096zvd dNCPSb(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    public static final InterfaceC60096zvd OLrzqt(OKWBaseTransaction oKWBaseTransaction, SubmitTxExpandBean submitTxExpandBean, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() == -5001 && responseData.getData() != null) {
            Object data = responseData.getData();
            Intrinsics.copydefault(data);
            return oKWBaseTransaction.copydefault((BatchBroadcastModel) data, submitTxExpandBean);
        }
        if (responseData.getCode() == -5004 || responseData.getCode() == -5005 || responseData.getCode() == -5006) {
            C8519bEJ.copydefault.copydefault(oKWBaseTransaction.QwvEab(), oKWBaseTransaction.dUDNAs().QwvEab(), oKWBaseTransaction.aUsmxb(), oKWBaseTransaction.dHguZz(), oKWBaseTransaction.fERRXa().getAddress(), String.valueOf(responseData.getCode()), oKWBaseTransaction.OJuSTm(), submitTxExpandBean);
        } else if (C33129mqd.OLrzqt((CharSequence) responseData.getMsg())) {
            C8519bEJ.copydefault.copydefault(oKWBaseTransaction.QwvEab(), oKWBaseTransaction.dUDNAs().QwvEab(), oKWBaseTransaction.aUsmxb(), oKWBaseTransaction.dHguZz(), oKWBaseTransaction.fERRXa().getAddress(), responseData.getCode() + " " + responseData.getMsg(), oKWBaseTransaction.OJuSTm(), submitTxExpandBean);
        }
        AbstractC58185ywX abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(new ResponseData(responseData.getCode(), responseData.getMsg(), null, null, null, responseData.getError_code(), 28, null));
        Intrinsics.copydefault(abstractC58185ywXKWHzl);
        return abstractC58185ywXKWHzl;
    }

    public static final InterfaceC60096zvd aKErDB(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    public static final InterfaceC60096zvd copydefault(OKWBaseTransaction oKWBaseTransaction, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        if (oKWBaseTransaction.QwvEab() == 5 && (responseData.getCode() == 0 || responseData.getCode() == -5001)) {
            return oKWBaseTransaction.AYXKKw((ResponseData<DappTxResultBean>) responseData).EZpvd();
        }
        return AbstractC58185ywX.KWHzl(responseData);
    }

    public static final ResponseData djSkpj(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (ResponseData) function1.invoke(obj);
    }

    public static final ResponseData AEQbTJ(SubmitTxExpandBean submitTxExpandBean, ResponseData responseData) {
        C9748bbT c9748bbT;
        Intrinsics.checkNotNullParameter(responseData, "");
        DappTxResultBean dappTxResultBean = (DappTxResultBean) responseData.getData();
        int code = responseData.getCode() == 0 ? -5001 : responseData.getCode();
        String msg = responseData.getMsg();
        String detailMsg = responseData.getDetailMsg();
        if (dappTxResultBean == null) {
            c9748bbT = null;
        } else {
            c9748bbT = new C9748bbT(dappTxResultBean.getSignTx(), dappTxResultBean.getTxId(), dappTxResultBean.getTxHash(), dappTxResultBean.getResultData(), dappTxResultBean.isBatch(), dappTxResultBean.isBtcMint(), dappTxResultBean.getSendCallsId(), SignAuthType.Companion.KWHzl(submitTxExpandBean != null ? submitTxExpandBean.getSilentSign() : null));
        }
        return new ResponseData(code, msg, detailMsg, null, c9748bbT, responseData.getError_code(), 8, null);
    }

    public static final void fZBcTu(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AEQbTJ(OKWBaseTransaction oKWBaseTransaction, SubmitTxExpandBean submitTxExpandBean, Throwable th) {
        C8519bEJ c8519bEJ = C8519bEJ.copydefault;
        int iQwvEab = oKWBaseTransaction.QwvEab();
        WalletType walletTypeQwvEab = oKWBaseTransaction.dUDNAs().QwvEab();
        TransactionType transactionTypeAUsmxb = oKWBaseTransaction.aUsmxb();
        C10854bwM c10854bwMDHguZz = oKWBaseTransaction.dHguZz();
        String address = oKWBaseTransaction.fERRXa().getAddress();
        String message = th.getMessage();
        if (message == null) {
            message = "";
        }
        c8519bEJ.copydefault(iQwvEab, walletTypeQwvEab, transactionTypeAUsmxb, c10854bwMDHguZz, address, message, oKWBaseTransaction.OJuSTm(), submitTxExpandBean);
        return Unit.INSTANCE;
    }

    public static final void dxcTrN(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AEQbTJ(OKWBaseTransaction oKWBaseTransaction, InterfaceC60094zvb interfaceC60094zvb) {
        oKWBaseTransaction.QKVWgx = interfaceC60094zvb;
        return Unit.INSTANCE;
    }

    public static /* synthetic */ AbstractC58185ywX onSign$default(OKWBaseTransaction oKWBaseTransaction, String str, SubmitTxExpandBean submitTxExpandBean, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onSign");
        }
        if ((i & 2) != 0) {
            submitTxExpandBean = null;
        }
        return oKWBaseTransaction.KWHzl(str, submitTxExpandBean);
    }

    /* JADX DEBUG: Type inference failed for r14v1. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<com.okinc.network.okg.response.ResponseData<com.okinc.business.defi.biz.core.transaction.bean.BatchBroadcastModel>> */
    /* JADX DEBUG: Type inference failed for r14v3. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<com.okinc.network.okg.response.ResponseData<com.okinc.business.defi.biz.core.transaction.bean.BatchBroadcastModel>> */
    public final AbstractC58185ywX<ResponseData<BatchBroadcastModel>> KWHzl(final String str, final SubmitTxExpandBean submitTxExpandBean) {
        AbstractC12782ctV abstractC12782ctVDUDNAs = dUDNAs();
        int i = Activity.KWHzl[(abstractC12782ctVDUDNAs.getFieldNames() ? abstractC12782ctVDUDNAs.DarRvM() : abstractC12782ctVDUDNAs.QwvEab()).ordinal()];
        if (i == 1 || i == 2) {
            AbstractC58260yxt<String> abstractC58260yxtValues = dUDNAs().values(str);
            final Function1 function1 = new Function1() { // from class: o.bGJ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return OKWBaseTransaction.KWHzl(this.EZpvd, str, submitTxExpandBean, (java.lang.String) obj);
                }
            };
            AbstractC58185ywX abstractC58185ywXKWHzl = abstractC58260yxtValues.KWHzl(new InterfaceC58229yxO() { // from class: o.bGH
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58229yxO
                public final java.lang.Object apply(java.lang.Object obj) {
                    return OKWBaseTransaction.QfsBiF(function1, obj);
                }
            });
            Intrinsics.copydefault(abstractC58185ywXKWHzl);
            return abstractC58185ywXKWHzl;
        }
        if (i == 3) {
            AbstractC58260yxt<String> abstractC58260yxtEjfBZ = dUDNAs().ejfBZ(str);
            final Function1 function12 = new Function1() { // from class: o.bGQ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return OKWBaseTransaction.AEQbTJ(this.AEQbTJ, submitTxExpandBean, (java.lang.String) obj);
                }
            };
            AbstractC58185ywX abstractC58185ywXKWHzl2 = abstractC58260yxtEjfBZ.KWHzl(new InterfaceC58229yxO() { // from class: o.bGM
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58229yxO
                public final java.lang.Object apply(java.lang.Object obj) {
                    return OKWBaseTransaction.RJOkX(function12, obj);
                }
            });
            Intrinsics.copydefault(abstractC58185ywXKWHzl2);
            return abstractC58185ywXKWHzl2;
        }
        if (i != 4) {
            if (i == 5) {
                return EZpvd(str, submitTxExpandBean);
            }
            AbstractC58185ywX<ResponseData<BatchBroadcastModel>> abstractC58185ywXKWHzl3 = AbstractC58185ywX.KWHzl(new ResponseData(-5006, null, null, null, null, null, 62, null));
            Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl3, "");
            return abstractC58185ywXKWHzl3;
        }
        if (abstractC12782ctVDUDNAs.getFieldNames() || abstractC12782ctVDUDNAs.sSMYrx()) {
            return copydefault(submitTxExpandBean);
        }
        if (abstractC12782ctVDUDNAs.AxsJAY()) {
            return EZpvd(submitTxExpandBean);
        }
        if (abstractC12782ctVDUDNAs.zuBGHE()) {
            return OLrzqt(submitTxExpandBean);
        }
        AbstractC58185ywX<ResponseData<BatchBroadcastModel>> abstractC58185ywXKWHzl4 = AbstractC58185ywX.KWHzl(new ResponseData(-5006, null, null, null, null, null, 62, null));
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl4, "");
        return abstractC58185ywXKWHzl4;
    }

    public static final InterfaceC60096zvd QfsBiF(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    public static final InterfaceC60096zvd KWHzl(OKWBaseTransaction oKWBaseTransaction, String str, SubmitTxExpandBean submitTxExpandBean, String str2) {
        Intrinsics.checkNotNullParameter(str2, "");
        if (str2.length() == 0) {
            AbstractC58185ywX abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(new ResponseData(-5004, null, null, null, null, null, 62, null));
            Intrinsics.copydefault(abstractC58185ywXKWHzl);
            return abstractC58185ywXKWHzl;
        }
        return oKWBaseTransaction.copydefault(str, str2, submitTxExpandBean);
    }

    public static final InterfaceC60096zvd RJOkX(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    public static final InterfaceC60096zvd AEQbTJ(OKWBaseTransaction oKWBaseTransaction, SubmitTxExpandBean submitTxExpandBean, String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (str.length() == 0) {
            AbstractC58185ywX abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(new ResponseData(-5004, null, null, null, null, null, 62, null));
            Intrinsics.copydefault(abstractC58185ywXKWHzl);
            return abstractC58185ywXKWHzl;
        }
        return oKWBaseTransaction.OLrzqt(str, submitTxExpandBean);
    }

    /* JADX DEBUG: Type inference failed for r5v2. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<com.okinc.network.okg.response.ResponseData<com.okinc.business.defi.biz.core.transaction.bean.BatchBroadcastModel>> */
    public AbstractC58185ywX<ResponseData<BatchBroadcastModel>> copydefault(@NotNull String str, @NotNull String str2, final SubmitTxExpandBean submitTxExpandBean) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        AbstractC58260yxt<String> abstractC58260yxtOLrzqt = dUDNAs().OLrzqt(str, dmfpNf(), fdOvFl());
        final Function1 function1 = new Function1() { // from class: o.bHd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return OKWBaseTransaction.EZpvd(this.AEQbTJ, submitTxExpandBean, (java.lang.String) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXKWHzl = abstractC58260yxtOLrzqt.KWHzl(new InterfaceC58229yxO() { // from class: o.bHe
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return OKWBaseTransaction.QbewEr(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        return abstractC58185ywXKWHzl;
    }

    public static final InterfaceC60096zvd QbewEr(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    public static final InterfaceC60096zvd EZpvd(OKWBaseTransaction oKWBaseTransaction, SubmitTxExpandBean submitTxExpandBean, String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return oKWBaseTransaction.OLrzqt(str, submitTxExpandBean);
    }

    public AbstractC58185ywX<ResponseData<BatchBroadcastModel>> copydefault(SubmitTxExpandBean submitTxExpandBean) {
        AbstractC58185ywX<ResponseData<BatchBroadcastModel>> abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(new ResponseData(73819761, null, null, null, null, null, 62, null));
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        return abstractC58185ywXKWHzl;
    }

    public AbstractC58185ywX<ResponseData<BatchBroadcastModel>> EZpvd(SubmitTxExpandBean submitTxExpandBean) {
        AbstractC58185ywX<ResponseData<BatchBroadcastModel>> abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(new ResponseData(-5006, null, null, null, null, null, 62, null));
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        return abstractC58185ywXKWHzl;
    }

    public AbstractC58185ywX<ResponseData<BatchBroadcastModel>> OLrzqt(SubmitTxExpandBean submitTxExpandBean) {
        AbstractC58185ywX<ResponseData<BatchBroadcastModel>> abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(new ResponseData(-5006, null, null, null, null, null, 62, null));
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        return abstractC58185ywXKWHzl;
    }

    public AbstractC58185ywX<ResponseData<BatchBroadcastModel>> EZpvd(@NotNull String str, SubmitTxExpandBean submitTxExpandBean) {
        Intrinsics.checkNotNullParameter(str, "");
        AbstractC58185ywX<ResponseData<BatchBroadcastModel>> abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(new ResponseData(-5006, null, null, null, null, null, 62, null));
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        return abstractC58185ywXKWHzl;
    }

    public String KWHzl(@NotNull ResponseData<DappTxResultBean> responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        if (aUsmxb() == TransactionType.Message) {
            DappTxResultBean data = responseData.getData();
            if (data != null) {
                return data.getResultData();
            }
        } else {
            DappTxResultBean data2 = responseData.getData();
            if (data2 != null) {
                return data2.getTxHash();
            }
        }
        return null;
    }

    public AbstractC58260yxt<ResponseData<DappTxResultBean>> AYXKKw(@NotNull final ResponseData<DappTxResultBean> responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        final String wcTopic = OJuSTm().getWcTopic();
        if (wcTopic == null || wcTopic.length() == 0) {
            AbstractC58260yxt<ResponseData<DappTxResultBean>> abstractC58260yxtCopydefault = AbstractC58260yxt.copydefault(responseData);
            Intrinsics.checkNotNullExpressionValue(abstractC58260yxtCopydefault, "");
            return abstractC58260yxtCopydefault;
        }
        Long wcId = OJuSTm().getWcId();
        final long jLongValue = wcId != null ? wcId.longValue() : 0L;
        String strKWHzl = KWHzl(responseData);
        final String str = strKWHzl == null ? "" : strKWHzl;
        AbstractC58260yxt<ResponseData<DappTxResultBean>> abstractC58260yxtOLrzqt = AbstractC58260yxt.OLrzqt(new InterfaceC58259yxs() { // from class: o.bHb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58259yxs
            public final void subscribe(InterfaceC58257yxq interfaceC58257yxq) {
                OKWBaseTransaction.OLrzqt(wcTopic, jLongValue, str, responseData, interfaceC58257yxq);
            }
        }).KWHzl(yBP.AEQbTJ()).OLrzqt(C58266yxz.OLrzqt());
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtOLrzqt, "");
        return abstractC58260yxtOLrzqt;
    }

    public static final void OLrzqt(String str, long j, String str2, ResponseData responseData, InterfaceC58257yxq interfaceC58257yxq) {
        Object objM7377constructorimpl;
        Intrinsics.checkNotNullParameter(interfaceC58257yxq, "");
        try {
            Result.Application application = Result.Companion;
            WalletConnectUtils.ActionBar.getInstance$default(WalletConnectUtils.Companion, null, 1, null).AEQbTJ(str, j, str2);
            objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (Result.m7384isSuccessimpl(objM7377constructorimpl)) {
            interfaceC58257yxq.onSuccess(responseData);
            return;
        }
        Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        Intrinsics.copydefault(thM7380exceptionOrNullimpl);
        interfaceC58257yxq.onError(thM7380exceptionOrNullimpl);
    }

    public static final Pair KWHzl(OKWBaseTransaction oKWBaseTransaction, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            Object data = responseData.getData();
            Intrinsics.copydefault(data);
            oKWBaseTransaction.KWHzl((PreExecTransactionRes) data);
            return C56390yDp.OLrzqt(Boolean.TRUE, null);
        }
        return C56390yDp.OLrzqt(Boolean.FALSE, responseData.getMsg());
    }
}
