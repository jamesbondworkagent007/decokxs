package o;

import com.okinc.business.defi.api.bean.DappInteractionArgs;
import com.okinc.business.defi.api.bean.ReserveInfoBean;
import com.okinc.business.defi.api.model.tx.FeeType;
import com.okinc.business.defi.api.model.tx.signdata.BaseSignData;
import com.okinc.business.defi.biz.core.error.CoinMetaError;
import com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.wallet.api.WalletDexService;
import java.util.LinkedHashSet;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC9730bbB;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.bCG, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C8410bCG implements InterfaceC9734bbF, InterfaceC9736bbH, InterfaceC9743bbO {
    public int EZpvd;
    public final OKWBaseTransaction<?> OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OKWBaseTransaction<?> fIwbmz() {
        return this.OLrzqt;
    }

    public C8410bCG(@NotNull OKWBaseTransaction<?> oKWBaseTransaction) {
        Intrinsics.checkNotNullParameter(oKWBaseTransaction, "");
        this.OLrzqt = oKWBaseTransaction;
    }

    public final AbstractC9832bcy AEQbTJ(AbstractC9832bcy abstractC9832bcy) {
        if (abstractC9832bcy instanceof C9872bdl) {
            return C9863bdc.EZpvd;
        }
        return abstractC9832bcy == null ? C9863bdc.EZpvd : abstractC9832bcy;
    }

    @Override // o.InterfaceC9734bbF
    public AbstractC9832bcy valueOf() {
        java.util.Collection<AbstractC9832bcy> collectionValues = this.OLrzqt.UlJrfe().copydefault().values();
        Intrinsics.checkNotNullExpressionValue(collectionValues, "");
        return AEQbTJ((AbstractC9832bcy) CollectionsKt___CollectionsKt.RcXXUw(collectionValues));
    }

    @Override // o.InterfaceC9734bbF
    public InterfaceC9752bbX gEmmrt() {
        C8486bDd c8486bDdKWHzl;
        OKWBaseTransaction<?> oKWBaseTransaction = this.OLrzqt;
        AbstractC8564bFB<?, ?> abstractC8564bFB = oKWBaseTransaction instanceof AbstractC8564bFB ? (AbstractC8564bFB) oKWBaseTransaction : null;
        AbstractC8426bCW<?> abstractC8426bCWQKudOq = abstractC8564bFB != null ? abstractC8564bFB.QKudOq() : null;
        if (abstractC8426bCWQKudOq == null || (c8486bDdKWHzl = abstractC8426bCWQKudOq.KWHzl()) == null) {
            return null;
        }
        return copydefault(abstractC8564bFB, abstractC8426bCWQKudOq, c8486bDdKWHzl);
    }

    public final InterfaceC9752bbX copydefault(AbstractC8564bFB<?, ?> abstractC8564bFB, AbstractC8426bCW<?> abstractC8426bCW, C8486bDd c8486bDd) throws CoinMetaError {
        java.lang.String feeAmount;
        C9745bbQ c9745bbQKWHzl;
        if (c8486bDd instanceof C8491bDi) {
            int feeType = ((C8491bDi) c8486bDd).getFeeType();
            FeeType feeTypeCopydefault = abstractC8426bCW.copydefault();
            C10854bwM c10854bwMAYXKKw = abstractC8426bCW.AYXKKw();
            C9215bRQ c9215bRQ = c8486bDd instanceof C9215bRQ ? (C9215bRQ) c8486bDd : null;
            if (c9215bRQ == null || (feeAmount = c9215bRQ.copydefault()) == null) {
                feeAmount = c8486bDd.getFeeAmount();
            }
            java.lang.String str = feeAmount;
            boolean z = c8486bDd instanceof C9165bQT;
            C9165bQT c9165bQT = z ? (C9165bQT) c8486bDd : null;
            boolean z2 = c9165bQT != null && c9165bQT.AEQbTJ();
            C9165bQT c9165bQT2 = z ? (C9165bQT) c8486bDd : null;
            C9745bbQ c9745bbQ = (c9165bQT2 == null || (c9745bbQKWHzl = c9165bQT2.KWHzl()) == null) ? new C9745bbQ(null, 0, -1, 3, null) : c9745bbQKWHzl;
            boolean z3 = c8486bDd.getFeeChangeType() == 3;
            C9165bQT c9165bQT3 = z ? (C9165bQT) c8486bDd : null;
            return new C8395bBs(feeType, abstractC8564bFB, feeTypeCopydefault, c10854bwMAYXKKw, str, false, "", z2, c9745bbQ, z3, c9165bQT3 != null ? c9165bQT3.EZpvd() : null);
        }
        return new C8394bBr(abstractC8564bFB, abstractC8426bCW.copydefault(), abstractC8426bCW.AYXKKw(), c8486bDd.getFeeAmount(), false, c8486bDd.getFeeAmount(), false, new C9745bbQ(null, 0, -1, 3, null), c8486bDd.getFeeChangeType() == 3, null);
    }

    public static final InterfaceC60096zvd AEQbTJ(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    /* JADX DEBUG: Type inference failed for r0v3. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<o.bcy> */
    @Override // o.InterfaceC9734bbF
    public AbstractC58185ywX<AbstractC9832bcy> isConnected() {
        AbstractC58185ywX<java.util.Collection<AbstractC9832bcy>> abstractC58185ywXAEQbTJ = this.OLrzqt.UlJrfe().AEQbTJ();
        final Function1 function1 = new Function1() { // from class: o.bCK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C8410bCG.OLrzqt(this.OLrzqt, (java.util.Collection) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXKWHzl = abstractC58185ywXAEQbTJ.KWHzl(new InterfaceC58229yxO() { // from class: o.bCL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C8410bCG.AEQbTJ(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        return abstractC58185ywXKWHzl;
    }

    public static final InterfaceC60096zvd OLrzqt(C8410bCG c8410bCG, java.util.Collection collection) {
        Intrinsics.checkNotNullParameter(collection, "");
        if (collection.isEmpty()) {
            AbstractC58185ywX abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(C9863bdc.EZpvd);
            Intrinsics.copydefault(abstractC58185ywXKWHzl);
            return abstractC58185ywXKWHzl;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        java.util.Iterator it = collection.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(c8410bCG.AEQbTJ((AbstractC9832bcy) it.next()));
        }
        AbstractC58185ywX abstractC58185ywXCopydefault = AbstractC58185ywX.copydefault(linkedHashSet);
        Intrinsics.copydefault(abstractC58185ywXCopydefault);
        return abstractC58185ywXCopydefault;
    }

    @Override // o.InterfaceC9734bbF
    public AbstractC58185ywX<? extends InterfaceC9752bbX> AkhnZx() {
        OKWBaseTransaction<?> oKWBaseTransaction = this.OLrzqt;
        final AbstractC8564bFB abstractC8564bFB = oKWBaseTransaction instanceof AbstractC8564bFB ? (AbstractC8564bFB) oKWBaseTransaction : null;
        if (abstractC8564bFB == null) {
            AbstractC58185ywX<? extends InterfaceC9752bbX> abstractC58185ywXCopydefault = AbstractC58185ywX.copydefault();
            Intrinsics.checkNotNullExpressionValue(abstractC58185ywXCopydefault, "");
            return abstractC58185ywXCopydefault;
        }
        AbstractC8426bCW abstractC8426bCWQKudOq = abstractC8564bFB.QKudOq();
        AbstractC58185ywX abstractC58185ywXIsConnected = abstractC8426bCWQKudOq.isConnected();
        final TaskDescription taskDescription = new TaskDescription(abstractC8564bFB);
        AbstractC58185ywX abstractC58185ywXKWHzl = abstractC58185ywXIsConnected.KWHzl(new InterfaceC58239yxY() { // from class: o.bCN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58239yxY
            public final boolean test(java.lang.Object obj) {
                return C8410bCG.gEmmrt(taskDescription, obj);
            }
        });
        final StateListAnimator stateListAnimator = new StateListAnimator(abstractC8564bFB, abstractC8426bCWQKudOq);
        AbstractC58185ywX abstractC58185ywXAEQbTJ = abstractC58185ywXKWHzl.AEQbTJ(new InterfaceC58229yxO() { // from class: o.bCM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C8410bCG.djBIcL(stateListAnimator, obj);
            }
        });
        final Function1 function1 = new Function1() { // from class: o.bCO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C8410bCG.EZpvd(this.copydefault, abstractC8564bFB, (InterfaceC60094zvb) obj);
            }
        };
        AbstractC58185ywX<? extends InterfaceC9752bbX> abstractC58185ywXEZpvd = abstractC58185ywXAEQbTJ.EZpvd(new InterfaceC58227yxM() { // from class: o.bCR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C8410bCG.valueOf(function1, obj);
            }
        }).EZpvd(new InterfaceC58222yxH() { // from class: o.bCQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58222yxH
            public final void run() {
                C8410bCG.copydefault(this.OLrzqt, abstractC8564bFB);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXEZpvd, "");
        return abstractC58185ywXEZpvd;
    }

    /* JADX INFO: renamed from: o.bCG$TaskDescription */
    public static final class TaskDescription implements Function1<?, java.lang.Boolean> {
        public final /* synthetic */ AbstractC8564bFB<?, ?> KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(AbstractC8564bFB<?, ?> abstractC8564bFB) {
            this.KWHzl = abstractC8564bFB;
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public final java.lang.Boolean invoke(C8486bDd c8486bDd) {
            Intrinsics.checkNotNullParameter(c8486bDd, "");
            return java.lang.Boolean.valueOf(!this.KWHzl.UlJrfe().copydefault(C56524yIo.AEQbTJ(C9868bdh.class)));
        }
    }

    public static final boolean gEmmrt(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return ((java.lang.Boolean) function1.invoke(obj)).booleanValue();
    }

    /* JADX INFO: renamed from: o.bCG$StateListAnimator */
    public static final class StateListAnimator implements Function1<?, InterfaceC9752bbX> {
        public final /* synthetic */ AbstractC8564bFB<?, ?> OLrzqt;
        public final /* synthetic */ AbstractC8426bCW<?> copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(AbstractC8564bFB<?, ?> abstractC8564bFB, AbstractC8426bCW<?> abstractC8426bCW) {
            this.OLrzqt = abstractC8564bFB;
            this.copydefault = abstractC8426bCW;
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public final InterfaceC9752bbX invoke(C8486bDd c8486bDd) {
            Intrinsics.checkNotNullParameter(c8486bDd, "");
            return C8410bCG.this.copydefault(this.OLrzqt, this.copydefault, c8486bDd);
        }
    }

    public static final InterfaceC9752bbX djBIcL(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC9752bbX) function1.invoke(obj);
    }

    public static final void valueOf(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit EZpvd(C8410bCG c8410bCG, AbstractC8564bFB abstractC8564bFB, InterfaceC60094zvb interfaceC60094zvb) {
        if (c8410bCG.EZpvd == 0) {
            AbstractC8564bFB.startLoopRefresh$default(abstractC8564bFB, 0L, 1, null);
        }
        c8410bCG.EZpvd++;
        return Unit.INSTANCE;
    }

    public static final void copydefault(C8410bCG c8410bCG, AbstractC8564bFB abstractC8564bFB) {
        int i = c8410bCG.EZpvd - 1;
        c8410bCG.EZpvd = i;
        if (i == 0) {
            abstractC8564bFB.QkdxfA();
        }
    }

    @Override // o.InterfaceC9734bbF
    public InterfaceC9731bbC AYXKKw() {
        return this.OLrzqt.dHguZz();
    }

    @Override // o.InterfaceC9734bbF
    public AbstractC58260yxt<kotlin.Pair<java.lang.Boolean, java.lang.String>> AEQbTJ(@NotNull BaseSignData baseSignData) {
        Intrinsics.checkNotNullParameter(baseSignData, "");
        BaseSignData baseSignDataEZpvd = C8396bBt.AEQbTJ.EZpvd(this.OLrzqt.dHguZz(), baseSignData, this.OLrzqt.htlTjW());
        if (baseSignDataEZpvd == null) {
            AbstractC58260yxt<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58260yxtCopydefault = AbstractC58260yxt.copydefault(C56390yDp.OLrzqt(java.lang.Boolean.FALSE, C10857bwP.AEQbTJ("TransactionWrapper", "convertSignDataIfNeeded")));
            Intrinsics.checkNotNullExpressionValue(abstractC58260yxtCopydefault, "");
            return abstractC58260yxtCopydefault;
        }
        AbstractC58260yxt<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58260yxtValueOf = this.OLrzqt.KWHzl(baseSignDataEZpvd).valueOf();
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtValueOf, "");
        return abstractC58260yxtValueOf;
    }

    @Override // o.InterfaceC9734bbF
    public AbstractC58260yxt<kotlin.Pair<java.lang.Boolean, java.lang.String>> copydefault(@NotNull java.lang.String str) {
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXKWHzl;
        AbstractC58260yxt<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58260yxtValueOf;
        Intrinsics.checkNotNullParameter(str, "");
        BaseSignData baseSignDataKWHzl = C8396bBt.AEQbTJ.KWHzl(this.OLrzqt.dUDNAs(), this.OLrzqt.dHguZz(), str, (DappInteractionArgs) null, this.OLrzqt.QVsKAR(), this.OLrzqt.aUsmxb());
        if (baseSignDataKWHzl == null) {
            AbstractC58260yxt<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58260yxtCopydefault = AbstractC58260yxt.copydefault(C56390yDp.OLrzqt(java.lang.Boolean.FALSE, C10857bwP.AEQbTJ("OKWalletTransaction", "chainId not support")));
            Intrinsics.checkNotNullExpressionValue(abstractC58260yxtCopydefault, "");
            return abstractC58260yxtCopydefault;
        }
        OKWBaseTransaction<?> oKWBaseTransaction = this.OLrzqt;
        AbstractC8601bFm abstractC8601bFm = oKWBaseTransaction instanceof AbstractC8601bFm ? (AbstractC8601bFm) oKWBaseTransaction : null;
        if (abstractC8601bFm != null && (abstractC58185ywXKWHzl = abstractC8601bFm.KWHzl(baseSignDataKWHzl)) != null && (abstractC58260yxtValueOf = abstractC58185ywXKWHzl.valueOf()) != null) {
            return abstractC58260yxtValueOf;
        }
        AbstractC58260yxt<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58260yxtCopydefault2 = AbstractC58260yxt.copydefault(C56390yDp.OLrzqt(java.lang.Boolean.FALSE, ""));
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtCopydefault2, "");
        return abstractC58260yxtCopydefault2;
    }

    @Override // o.InterfaceC9734bbF
    public ReserveInfoBean values() {
        C8518bEI c8518bEIAj_;
        OKWBaseTransaction<?> oKWBaseTransaction = this.OLrzqt;
        AbstractC8601bFm abstractC8601bFm = oKWBaseTransaction instanceof AbstractC8601bFm ? (AbstractC8601bFm) oKWBaseTransaction : null;
        if (abstractC8601bFm == null || (c8518bEIAj_ = abstractC8601bFm.aj_()) == null) {
            return null;
        }
        return c8518bEIAj_.AYXKKw();
    }

    @Override // o.InterfaceC9734bbF
    public AbstractC58185ywX<ResponseData<C9748bbT>> AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return OKWBaseTransaction.submit$default(this.OLrzqt, str, null, 2, null);
    }

    @Override // o.InterfaceC9734bbF
    public InterfaceC9738bbJ DbNXlk() {
        return this.OLrzqt.dUDNAs();
    }

    @Override // o.InterfaceC9734bbF
    public java.lang.String fetchVPNInfo() {
        java.lang.String strAEQbTJ;
        OKWBaseTransaction<?> oKWBaseTransaction = this.OLrzqt;
        if (oKWBaseTransaction instanceof AbstractC8601bFm) {
            strAEQbTJ = ((AbstractC8601bFm) oKWBaseTransaction).AEQbTJ(true);
        } else {
            strAEQbTJ = oKWBaseTransaction instanceof AbstractC8610bFv ? ((AbstractC8610bFv) oKWBaseTransaction).AEQbTJ(true) : null;
        }
        return strAEQbTJ == null ? "" : strAEQbTJ;
    }

    @Override // o.InterfaceC9734bbF
    public void copydefault() {
        this.OLrzqt.fFgQHt();
    }

    @Override // o.InterfaceC9730bbB
    public boolean w_() {
        java.lang.Object obj = this.OLrzqt;
        InterfaceC9730bbB interfaceC9730bbB = obj instanceof InterfaceC9730bbB ? (InterfaceC9730bbB) obj : null;
        if (interfaceC9730bbB != null) {
            return interfaceC9730bbB.w_();
        }
        return false;
    }

    @Override // o.InterfaceC9730bbB
    public boolean AEQbTJ() {
        java.lang.Object obj = this.OLrzqt;
        InterfaceC9730bbB interfaceC9730bbB = obj instanceof InterfaceC9730bbB ? (InterfaceC9730bbB) obj : null;
        if (interfaceC9730bbB != null) {
            return interfaceC9730bbB.AEQbTJ();
        }
        return false;
    }

    @Override // o.InterfaceC9730bbB
    public boolean KWHzl() {
        java.lang.Object obj = this.OLrzqt;
        InterfaceC9730bbB interfaceC9730bbB = obj instanceof InterfaceC9730bbB ? (InterfaceC9730bbB) obj : null;
        if (interfaceC9730bbB != null) {
            return interfaceC9730bbB.KWHzl();
        }
        return false;
    }

    @Override // o.InterfaceC9730bbB
    public java.lang.String a_(boolean z) {
        java.lang.Object obj = this.OLrzqt;
        InterfaceC9730bbB interfaceC9730bbB = obj instanceof InterfaceC9730bbB ? (InterfaceC9730bbB) obj : null;
        java.lang.String strA_ = interfaceC9730bbB != null ? interfaceC9730bbB.a_(z) : null;
        return strA_ == null ? "" : strA_;
    }

    @Override // o.InterfaceC9730bbB
    public void EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        java.lang.Object obj = this.OLrzqt;
        InterfaceC9730bbB interfaceC9730bbB = obj instanceof InterfaceC9730bbB ? (InterfaceC9730bbB) obj : null;
        if (interfaceC9730bbB != null) {
            interfaceC9730bbB.EZpvd(str);
        }
    }

    @Override // o.InterfaceC9730bbB
    public InterfaceC9730bbB.StateListAnimator EZpvd() {
        java.lang.Object obj = this.OLrzqt;
        InterfaceC9730bbB interfaceC9730bbB = obj instanceof InterfaceC9730bbB ? (InterfaceC9730bbB) obj : null;
        if (interfaceC9730bbB != null) {
            return interfaceC9730bbB.EZpvd();
        }
        return null;
    }

    @Override // o.InterfaceC9730bbB
    public java.lang.String OLrzqt() {
        java.lang.Object obj = this.OLrzqt;
        InterfaceC9730bbB interfaceC9730bbB = obj instanceof InterfaceC9730bbB ? (InterfaceC9730bbB) obj : null;
        java.lang.String strOLrzqt = interfaceC9730bbB != null ? interfaceC9730bbB.OLrzqt() : null;
        return strOLrzqt == null ? "" : strOLrzqt;
    }

    @Override // o.InterfaceC9736bbH
    public int djBIcL() {
        java.lang.Object obj = this.OLrzqt;
        InterfaceC9736bbH interfaceC9736bbH = obj instanceof InterfaceC9736bbH ? (InterfaceC9736bbH) obj : null;
        if (interfaceC9736bbH != null) {
            return interfaceC9736bbH.djBIcL();
        }
        return 0;
    }

    @Override // o.InterfaceC9736bbH
    public java.lang.String copydefault(int i, boolean z) {
        java.lang.Object obj = this.OLrzqt;
        InterfaceC9736bbH interfaceC9736bbH = obj instanceof InterfaceC9736bbH ? (InterfaceC9736bbH) obj : null;
        java.lang.String strCopydefault = interfaceC9736bbH != null ? interfaceC9736bbH.copydefault(i, z) : null;
        return strCopydefault == null ? "" : strCopydefault;
    }

    @Override // o.InterfaceC9736bbH
    public void copydefault(int i, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        java.lang.Object obj = this.OLrzqt;
        InterfaceC9736bbH interfaceC9736bbH = obj instanceof InterfaceC9736bbH ? (InterfaceC9736bbH) obj : null;
        if (interfaceC9736bbH != null) {
            interfaceC9736bbH.copydefault(i, str);
        }
    }

    @Override // o.InterfaceC9736bbH
    public InterfaceC9730bbB.StateListAnimator copydefault(int i) {
        java.lang.Object obj = this.OLrzqt;
        InterfaceC9736bbH interfaceC9736bbH = obj instanceof InterfaceC9736bbH ? (InterfaceC9736bbH) obj : null;
        if (interfaceC9736bbH != null) {
            return interfaceC9736bbH.copydefault(i);
        }
        return null;
    }

    @Override // o.InterfaceC9736bbH
    public java.lang.String KWHzl(int i) {
        java.lang.Object obj = this.OLrzqt;
        InterfaceC9736bbH interfaceC9736bbH = obj instanceof InterfaceC9736bbH ? (InterfaceC9736bbH) obj : null;
        java.lang.String strKWHzl = interfaceC9736bbH != null ? interfaceC9736bbH.KWHzl(i) : null;
        return strKWHzl == null ? "" : strKWHzl;
    }

    @Override // o.InterfaceC9743bbO
    public void a_(@NotNull java.util.List<WalletDexService.SupportedMevNodeBean> list) {
        Intrinsics.checkNotNullParameter(list, "");
        java.lang.Object obj = this.OLrzqt;
        InterfaceC9743bbO interfaceC9743bbO = obj instanceof InterfaceC9743bbO ? (InterfaceC9743bbO) obj : null;
        if (interfaceC9743bbO != null) {
            interfaceC9743bbO.a_(list);
        }
    }

    @Override // o.InterfaceC9743bbO
    public void fARcdN() {
        java.lang.Object obj = this.OLrzqt;
        InterfaceC9743bbO interfaceC9743bbO = obj instanceof InterfaceC9743bbO ? (InterfaceC9743bbO) obj : null;
        if (interfaceC9743bbO != null) {
            interfaceC9743bbO.fARcdN();
        }
    }

    @Override // o.InterfaceC9743bbO
    public boolean ejfBZ() {
        java.lang.Object obj = this.OLrzqt;
        InterfaceC9743bbO interfaceC9743bbO = obj instanceof InterfaceC9743bbO ? (InterfaceC9743bbO) obj : null;
        return interfaceC9743bbO != null && interfaceC9743bbO.ejfBZ();
    }
}
