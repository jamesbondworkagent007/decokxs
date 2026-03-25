package o;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.fragment.app.FragmentActivity;
import com.okinc.business.defi.api.bean.DappInteractionArgs;
import com.okinc.business.defi.api.bean.NewCallbackBean;
import com.okinc.business.defi.api.model.tx.FeeType;
import com.okinc.business.defi.biz.core.error.CoinMetaError;
import com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction;
import com.okinc.business.defi.biz.model.ChainAddress;
import com.okinc.business.defi.biz.net.bean.TxToastCheckReq;
import com.okinc.business.defi.biz.net.bean.TxToastCheckRes;
import com.okinc.business.defi.common.TxToastCheckHelper;
import com.okinc.business.defi.wallet.mine.search.data.model.WalletSearchRequest;
import com.okinc.localization.util.format.DisplaySign;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.wallet.api.WalletDappInteractionBizService;
import com.okinc.wallet.api.bean.WalletBtcAddressBean;
import io.reactivex.BackpressureStrategy;
import java.math.RoundingMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import o.C11735cZg;
import o.C13754dXa;
import o.InterfaceC9740bbL;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.cZg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C11735cZg implements xWF {
    public static final Activity Companion = new Activity(null);
    public static final int copydefault = 8;
    public final OKWBaseTransaction<?> KWHzl;
    public int OLrzqt;

    /* JADX INFO: renamed from: o.cZg$Application */
    public static final class Application implements InterfaceC9740bbL.TaskDescription {
        @Override // o.InterfaceC9740bbL.TaskDescription
        public void EZpvd() {
        }

        @Override // o.InterfaceC9740bbL.TaskDescription
        public void copydefault() {
        }
    }

    public C11735cZg(@NotNull OKWBaseTransaction<?> oKWBaseTransaction) {
        Intrinsics.checkNotNullParameter(oKWBaseTransaction, "");
        this.KWHzl = oKWBaseTransaction;
    }

    /* JADX INFO: renamed from: o.cZg$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.cZg.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.cZg$Activity */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ AbstractC58185ywX init$default(Activity activity, android.content.Context context, int i, DappInteractionArgs dappInteractionArgs, Function1 function1, int i2, java.lang.Object obj) {
            if ((i2 & 8) != 0) {
                function1 = null;
            }
            return activity.OLrzqt(context, i, dappInteractionArgs, function1);
        }

        public final AbstractC58185ywX<ResponseData<xWF>> OLrzqt(@NotNull final android.content.Context context, int i, @NotNull DappInteractionArgs dappInteractionArgs, Function1<? super NewCallbackBean, ? extends AbstractC58185ywX<ResponseData<java.lang.String>>> function1) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(dappInteractionArgs, "");
            AbstractC58185ywX<kotlin.Pair<OKWBaseTransaction<?>, java.lang.String>> abstractC58185ywXEZpvd = C8396bBt.AEQbTJ.AEQbTJ(dappInteractionArgs, OLrzqt(dappInteractionArgs, i), function1).EZpvd();
            Intrinsics.checkNotNullExpressionValue(abstractC58185ywXEZpvd, "");
            AbstractC58185ywX abstractC58185ywXKWHzl = C11607cUn.KWHzl(abstractC58185ywXEZpvd);
            final Function1 function12 = new Function1() { // from class: o.cZs
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C11735cZg.Activity.KWHzl(context, (kotlin.Pair) obj);
                }
            };
            AbstractC58185ywX<ResponseData<xWF>> abstractC58185ywXAEQbTJ = abstractC58185ywXKWHzl.AEQbTJ(new InterfaceC58229yxO() { // from class: o.cZx
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58229yxO
                public final java.lang.Object apply(java.lang.Object obj) {
                    return C11735cZg.Activity.OLrzqt(function12, obj);
                }
            });
            Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
            return abstractC58185ywXAEQbTJ;
        }

        public static final ResponseData OLrzqt(Function1 function1, java.lang.Object obj) {
            Intrinsics.checkNotNullParameter(obj, "");
            return (ResponseData) function1.invoke(obj);
        }

        public static final ResponseData KWHzl(android.content.Context context, kotlin.Pair pair) {
            Intrinsics.checkNotNullParameter(pair, "");
            OKWBaseTransaction oKWBaseTransaction = (OKWBaseTransaction) pair.getFirst();
            if (oKWBaseTransaction == null) {
                java.lang.String str = (java.lang.String) pair.getSecond();
                return new ResponseData(-1, str == null ? "" : str, null, null, null, null, 60, null);
            }
            if (oKWBaseTransaction instanceof AbstractC8664bGw) {
                try {
                    ((AbstractC8664bGw) oKWBaseTransaction).fHqPtx();
                } catch (java.lang.Exception e) {
                    C6777aVl.Companion.EZpvd(e);
                    return new ResponseData(-1, C10857bwP.KWHzl("WalletDappTransactionBizImpl", e), null, null, null, null, 60, null);
                }
            }
            C11735cZg c11735cZg = new C11735cZg(oKWBaseTransaction);
            java.util.Collection<AbstractC9832bcy> collectionValues = oKWBaseTransaction.UlJrfe().copydefault().values();
            Intrinsics.checkNotNullExpressionValue(collectionValues, "");
            java.lang.Object obj = (AbstractC9832bcy) CollectionsKt___CollectionsKt.RcXXUw(collectionValues);
            if (obj == null) {
                obj = C9863bdc.EZpvd;
            }
            if (obj instanceof C9868bdh) {
                java.lang.String strAEQbTJ = ((C9868bdh) obj).AEQbTJ();
                return new ResponseData(1, strAEQbTJ == null ? "" : strAEQbTJ, null, null, c11735cZg, null, 44, null);
            }
            if (!(obj instanceof C9870bdj)) {
                return obj instanceof C9815bch ? new ResponseData(4, "", null, null, c11735cZg, null, 44, null) : obj instanceof C9819bcl ? new ResponseData(5, "", null, null, c11735cZg, null, 44, null) : obj instanceof C9816bci ? new ResponseData(3, "", null, null, c11735cZg, null, 44, null) : obj instanceof C9750bbV ? new ResponseData(1, "", null, null, c11735cZg, null, 44, null) : new ResponseData(0, null, null, null, c11735cZg, null, 46, null);
            }
            java.lang.String string = context.getString(C13754dXa.FragmentManager.setIconBitmap);
            Intrinsics.checkNotNullExpressionValue(string, "");
            return new ResponseData(2, C33069mpW.OLrzqt(string, C56423yEv.EZpvd(C56390yDp.OLrzqt(WalletSearchRequest.SEARCH_SOURCE_ADDRESS, C14079deg.getAddressStr$default(C14079deg.EZpvd, ((C9870bdj) obj).copydefault(), false, 2, null)))), null, null, c11735cZg, null, 44, null);
        }

        public final OKWBaseTransaction.TransactionType OLrzqt(DappInteractionArgs dappInteractionArgs, int i) {
            C10854bwM c10854bwMEZpvd = C11627cVg.KWHzl.EZpvd(C33129mqd.valueOf(dappInteractionArgs.getChainId()), true);
            if (i == 2) {
                if (dappInteractionArgs.isCancelApprove()) {
                    return OKWBaseTransaction.TransactionType.CancelApprove;
                }
                return OKWBaseTransaction.TransactionType.Approve;
            }
            if (c10854bwMEZpvd != null && c10854bwMEZpvd.fARcdN() && dappInteractionArgs.getMultiSignData()) {
                return OKWBaseTransaction.TransactionType.SolanaMultiSign;
            }
            return OKWBaseTransaction.TransactionType.Contract;
        }
    }

    @Override // o.xWF
    public AbstractC58185ywX<WalletDappInteractionBizService.FeeInfo> copydefault() {
        AbstractC8426bCW abstractC8426bCWQKudOq;
        Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        booleanRef.element = true;
        OKWBaseTransaction<?> oKWBaseTransaction = this.KWHzl;
        AbstractC8564bFB abstractC8564bFB = oKWBaseTransaction instanceof AbstractC8564bFB ? (AbstractC8564bFB) oKWBaseTransaction : null;
        if (abstractC8564bFB == null || (abstractC8426bCWQKudOq = abstractC8564bFB.QKudOq()) == null) {
            AbstractC58185ywX<WalletDappInteractionBizService.FeeInfo> abstractC58185ywXCopydefault = AbstractC58185ywX.copydefault();
            Intrinsics.checkNotNullExpressionValue(abstractC58185ywXCopydefault, "");
            return abstractC58185ywXCopydefault;
        }
        AbstractC58185ywX abstractC58185ywXIsConnected = abstractC8426bCWQKudOq.isConnected();
        final TaskDescription taskDescription = new TaskDescription(abstractC8426bCWQKudOq, booleanRef, this);
        AbstractC58185ywX abstractC58185ywXAEQbTJ = abstractC58185ywXIsConnected.AEQbTJ(new InterfaceC58229yxO() { // from class: o.cZm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C11735cZg.AYXKKw(taskDescription, obj);
            }
        });
        final Function1 function1 = new Function1() { // from class: o.cZk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C11735cZg.OLrzqt(this.AEQbTJ, (InterfaceC60094zvb) obj);
            }
        };
        AbstractC58185ywX<WalletDappInteractionBizService.FeeInfo> abstractC58185ywXEZpvd = abstractC58185ywXAEQbTJ.EZpvd(new InterfaceC58227yxM() { // from class: o.cZl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C11735cZg.valueOf(function1, obj);
            }
        }).EZpvd(new InterfaceC58222yxH() { // from class: o.cZo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58222yxH
            public final void run() {
                C11735cZg.AEQbTJ(this.KWHzl);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXEZpvd, "");
        return abstractC58185ywXEZpvd;
    }

    /* JADX INFO: renamed from: o.cZg$TaskDescription */
    public static final class TaskDescription implements Function1<?, WalletDappInteractionBizService.FeeInfo> {
        public final /* synthetic */ AbstractC8426bCW<?> KWHzl;
        public final /* synthetic */ C11735cZg OLrzqt;
        public final /* synthetic */ Ref.BooleanRef copydefault;

        /* JADX INFO: renamed from: o.cZg$TaskDescription$Activity */
        /* JADX INFO: loaded from: classes23.dex */
        public final /* synthetic */ class Activity {
            public static final /* synthetic */ int[] copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            static {
                int[] iArr = new int[FeeType.values().length];
                try {
                    iArr[FeeType.FEE_TYPE_NO.ordinal()] = 1;
                } catch (java.lang.NoSuchFieldError unused) {
                }
                try {
                    iArr[FeeType.FEE_TYPE_FREE.ordinal()] = 2;
                } catch (java.lang.NoSuchFieldError unused2) {
                }
                try {
                    iArr[FeeType.FEE_TYPE_FIXED.ordinal()] = 3;
                } catch (java.lang.NoSuchFieldError unused3) {
                }
                try {
                    iArr[FeeType.FEE_TYPE_SELECTED.ordinal()] = 4;
                } catch (java.lang.NoSuchFieldError unused4) {
                }
                copydefault = iArr;
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(AbstractC8426bCW<?> abstractC8426bCW, Ref.BooleanRef booleanRef, C11735cZg c11735cZg) {
            this.KWHzl = abstractC8426bCW;
            this.copydefault = booleanRef;
            this.OLrzqt = c11735cZg;
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
        /* JADX DEBUG: TODO: convert one arg to string using `String.valueOf()`, args: (wrap:java.lang.Object:CAST), (wrap:java.lang.Object:CAST) */
        /* JADX WARN: Removed duplicated region for block: B:28:0x00a0  */
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final WalletDappInteractionBizService.FeeInfo invoke(C8486bDd c8486bDd) throws CoinMetaError {
            int i;
            int i2;
            java.lang.String str;
            java.lang.String string;
            java.lang.String strCopydefault;
            java.lang.String str2 = "";
            Intrinsics.checkNotNullParameter(c8486bDd, "");
            WalletDappInteractionBizService.FeeInfo feeInfo = new WalletDappInteractionBizService.FeeInfo();
            AbstractC8426bCW<?> abstractC8426bCW = this.KWHzl;
            Ref.BooleanRef booleanRef = this.copydefault;
            C11735cZg c11735cZg = this.OLrzqt;
            int i3 = Activity.copydefault[abstractC8426bCW.copydefault().ordinal()];
            if (i3 == 1 || i3 == 2) {
                i = 6;
            } else if (i3 == 3) {
                i = 4;
            } else {
                if (i3 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                C8491bDi c8491bDi = (C8491bDi) c8486bDd;
                if (c8486bDd instanceof C9215bRQ) {
                    C9215bRQ c9215bRQ = (C9215bRQ) c8486bDd;
                    feeInfo.setGas(C33491mxU.copydefault(c9215bRQ.valueOf().KWHzl()));
                    if (c9215bRQ.djBIcL().AhwBna()) {
                        feeInfo.setMaxFeePerGas(C33491mxU.copydefault(c9215bRQ.djBIcL().OLrzqt()));
                        java.lang.String strKWHzl = c9215bRQ.djBIcL().KWHzl();
                        feeInfo.setMaxPriorityFeePerGas(strKWHzl != null ? C33491mxU.copydefault(strKWHzl) : null);
                    } else {
                        feeInfo.setGasPrice(C33491mxU.copydefault(c9215bRQ.djBIcL().OLrzqt()));
                    }
                }
                int feeType = c8491bDi.getFeeType();
                if (feeType != 4) {
                    switch (feeType) {
                        case 31:
                            i = 1;
                            break;
                        case 32:
                            i = 2;
                            break;
                        case 33:
                            i = 3;
                            break;
                    }
                } else {
                    i = 5;
                }
            }
            feeInfo.setFeeType(java.lang.Integer.valueOf(i));
            if (booleanRef.element) {
                booleanRef.element = false;
                i2 = 1;
            } else {
                i2 = c8486bDd.getFeeChangeType() == 3 ? 2 : 3;
            }
            feeInfo.setFeeChangeType(i2);
            boolean z = c8486bDd instanceof C9215bRQ;
            java.lang.String strCopydefault2 = z ? ((C9215bRQ) c8486bDd).copydefault() : c8486bDd.getFeeAmount();
            feeInfo.setFeeValue(AbstractC8426bCW.formatToFeeCoinAmount$default(abstractC8426bCW, strCopydefault2, false, false, false, 14, null));
            feeInfo.setFeeNumberValue(C54870xYj.AEQbTJ(strCopydefault2, c8486bDd.getFeeCoinMeta().valueOf()));
            feeInfo.setFeeCurrencyValue(AbstractC8426bCW.formatToFeeCurrencyAmount$default(abstractC8426bCW, strCopydefault2, false, false, false, 6, null));
            feeInfo.setFeeSymbol(c8486bDd.getFeeCoinMeta().fJNWhG());
            feeInfo.setEstimatedFeeAmount(z ? C54870xYj.AEQbTJ(((C9215bRQ) c8486bDd).copydefault(), c8486bDd.getFeeCoinMeta().valueOf()) : null);
            feeInfo.setCheckFee(java.lang.Boolean.valueOf(c11735cZg.KWHzl()));
            if (Intrinsics.EZpvd(feeInfo.getCheckFee(), java.lang.Boolean.FALSE)) {
                C9784bcC c9784bcC = (C9784bcC) ((AbstractC8564bFB) c11735cZg.KWHzl).UlJrfe().KWHzl(C56524yIo.AEQbTJ(C9784bcC.class));
                if (c9784bcC != null && (strCopydefault = c9784bcC.copydefault()) != null) {
                    str2 = strCopydefault;
                }
                feeInfo.setSolPreCheckMsg(str2);
            }
            C17946fYd c17946fYd = C17946fYd.AEQbTJ;
            feeInfo.setFeeSubTypeText(c17946fYd.KWHzl(c11735cZg.KWHzl));
            OKWBaseTransaction oKWBaseTransaction = c11735cZg.KWHzl;
            AbstractC11993ceZ abstractC11993ceZ = oKWBaseTransaction instanceof AbstractC11993ceZ ? (AbstractC11993ceZ) oKWBaseTransaction : null;
            feeInfo.setTransferReminder(abstractC11993ceZ != null ? abstractC11993ceZ.fvQaOB() : null);
            boolean z2 = c8486bDd instanceof C9165bQT;
            C9165bQT c9165bQT = z2 ? (C9165bQT) c8486bDd : null;
            feeInfo.setFreeGas(java.lang.Boolean.valueOf(c9165bQT != null && c9165bQT.AEQbTJ()));
            C10854bwM c10854bwMAYXKKw = abstractC8426bCW.AYXKKw();
            feeInfo.setFeeICoinMeta(new WalletDappInteractionBizService.FeeInfo.FeeICoinMeta(c10854bwMAYXKKw.fJNWhG(), c10854bwMAYXKKw.DbNXlk(), c10854bwMAYXKKw.OLrzqt()));
            if (z2) {
                C9165bQT c9165bQT2 = (C9165bQT) c8486bDd;
                C9745bbQ c9745bbQKWHzl = c9165bQT2.KWHzl();
                if (c9745bbQKWHzl != null) {
                    kotlin.Pair<java.lang.String, java.lang.String> pairKWHzl = c17946fYd.KWHzl(abstractC8426bCW, c9745bbQKWHzl);
                    if (c9745bbQKWHzl.OLrzqt() != 0 && C33129mqd.OLrzqt(c9165bQT2.EZpvd())) {
                        java.lang.CharSequence charSequenceEZpvd = c9165bQT2.EZpvd();
                        Intrinsics.copydefault(charSequenceEZpvd);
                        string = charSequenceEZpvd.toString();
                    } else {
                        int iOLrzqt = c9745bbQKWHzl.OLrzqt();
                        if (iOLrzqt == 0 || iOLrzqt == 1 || iOLrzqt == 2 || iOLrzqt == 3 || iOLrzqt == 4) {
                            java.lang.String first = pairKWHzl.getFirst();
                            java.lang.String second = pairKWHzl.getSecond();
                            java.lang.StringBuilder sb = new java.lang.StringBuilder();
                            sb.append((java.lang.Object) first);
                            sb.append((java.lang.Object) second);
                            string = sb.toString();
                        } else {
                            string = null;
                        }
                    }
                    feeInfo.setFeeTip(string);
                }
                if (!((AbstractC8564bFB) c11735cZg.KWHzl).UlJrfe().AEQbTJ(C56524yIo.AEQbTJ(C9750bbV.class))) {
                    if (((AbstractC8564bFB) c11735cZg.KWHzl).UlJrfe().AEQbTJ(C56524yIo.AEQbTJ(C9751bbW.class))) {
                        feeInfo.setPaymasterStatus(1);
                        feeInfo.setPaymasterTip(C33070mpX.AYXKKw(C13754dXa.FragmentManager.setOnItemSelectedListener));
                    } else {
                        feeInfo.setPaymasterStatus(0);
                        str = null;
                        feeInfo.setPaymasterTip(null);
                    }
                } else {
                    feeInfo.setPaymasterStatus(-1);
                    feeInfo.setPaymasterTip(C33070mpX.AYXKKw(C13754dXa.FragmentManager.AppCompatActivity));
                }
                str = null;
            } else {
                str = null;
                feeInfo.setFeeTip(null);
                feeInfo.setPaymasterStatus(null);
                feeInfo.setPaymasterTip(null);
            }
            feeInfo.setDepositTip(str);
            return feeInfo;
        }
    }

    public static final WalletDappInteractionBizService.FeeInfo AYXKKw(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (WalletDappInteractionBizService.FeeInfo) function1.invoke(obj);
    }

    public static final void valueOf(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit OLrzqt(C11735cZg c11735cZg, InterfaceC60094zvb interfaceC60094zvb) {
        if (c11735cZg.OLrzqt == 0) {
            AbstractC8564bFB.startLoopRefresh$default((AbstractC8564bFB) c11735cZg.KWHzl, 0L, 1, null);
        }
        c11735cZg.OLrzqt++;
        return Unit.INSTANCE;
    }

    public static final void AEQbTJ(C11735cZg c11735cZg) {
        int i = c11735cZg.OLrzqt - 1;
        c11735cZg.OLrzqt = i;
        if (i == 0) {
            ((AbstractC8564bFB) c11735cZg.KWHzl).QkdxfA();
        }
    }

    @Override // o.xWF
    public void EZpvd(@NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(function0, "");
        C8396bBt c8396bBt = C8396bBt.AEQbTJ;
        OKWBaseTransaction<?> oKWBaseTransaction = this.KWHzl;
        AbstractC8564bFB<?, ?> abstractC8564bFB = oKWBaseTransaction instanceof AbstractC8564bFB ? (AbstractC8564bFB) oKWBaseTransaction : null;
        if (abstractC8564bFB == null) {
            return;
        }
        c8396bBt.OLrzqt(fragmentManager, abstractC8564bFB, function0);
    }

    @Override // o.xWF
    public void KWHzl(@NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(function0, "");
        C8396bBt c8396bBt = C8396bBt.AEQbTJ;
        OKWBaseTransaction<?> oKWBaseTransaction = this.KWHzl;
        AbstractC8564bFB<?, ?> abstractC8564bFB = oKWBaseTransaction instanceof AbstractC8564bFB ? (AbstractC8564bFB) oKWBaseTransaction : null;
        if (abstractC8564bFB == null) {
            return;
        }
        c8396bBt.OLrzqt(fragmentManager, abstractC8564bFB, function0);
    }

    @Override // o.xWF
    public boolean KWHzl() {
        C8497bDo c8497bDoUlJrfe = this.KWHzl.UlJrfe();
        return (c8497bDoUlJrfe.AEQbTJ(C56524yIo.AEQbTJ(C9784bcC.class)) || c8497bDoUlJrfe.AEQbTJ(C56524yIo.AEQbTJ(C9879bds.class)) || c8497bDoUlJrfe.AEQbTJ(C56524yIo.AEQbTJ(C9878bdr.class)) || c8497bDoUlJrfe.AEQbTJ(C56524yIo.AEQbTJ(C9880bdt.class))) ? false : true;
    }

    @Override // o.xWF
    public boolean OLrzqt() {
        return !this.KWHzl.UlJrfe().AEQbTJ(C56524yIo.AEQbTJ(C9808bca.class));
    }

    @Override // o.xWF
    public InterfaceC9731bbC EZpvd() {
        return this.KWHzl.dHguZz();
    }

    @Override // o.xWF
    public java.lang.String AEQbTJ(boolean z) {
        OKWBaseTransaction<?> oKWBaseTransaction = this.KWHzl;
        if (!(oKWBaseTransaction instanceof AbstractC8564bFB)) {
            return "";
        }
        C8475bDS c8475bDSDarRvM = ((AbstractC8564bFB) oKWBaseTransaction).DarRvM();
        long jAhwBna = ((AbstractC8564bFB) this.KWHzl).dHguZz().AhwBna();
        java.lang.String strKWHzl = c8475bDSDarRvM.KWHzl(java.lang.Long.valueOf(jAhwBna), ((AbstractC8564bFB) this.KWHzl).htlTjW());
        if (strKWHzl == null) {
            strKWHzl = "0";
        }
        java.lang.String str = strKWHzl;
        if (z) {
            return C54870xYj.EZpvd(str, ((AbstractC8564bFB) this.KWHzl).dHguZz().valueOf(), ((AbstractC8564bFB) this.KWHzl).dHguZz().AkhnZx(), null, (248 & 8) != 0 ? DisplaySign.AUTO : null, (248 & 16) != 0 ? false : false, (248 & 32) != 0 ? null : null, (248 & 64) != 0 ? false : false, (248 & 128) != 0 ? RoundingMode.DOWN : null);
        }
        return str;
    }

    @Override // o.xWF
    public void copydefault(@NotNull WalletBtcAddressBean walletBtcAddressBean) {
        Intrinsics.checkNotNullParameter(walletBtcAddressBean, "");
        OKWBaseTransaction<?> oKWBaseTransaction = this.KWHzl;
        if (oKWBaseTransaction instanceof AbstractC11993ceZ) {
            ((AbstractC11993ceZ) oKWBaseTransaction).AEQbTJ(walletBtcAddressBean);
        }
    }

    @Override // o.xWF
    public WalletBtcAddressBean AEQbTJ() {
        ChainAddress chainAddressRcXXUw;
        OKWBaseTransaction<?> oKWBaseTransaction = this.KWHzl;
        if (!(oKWBaseTransaction instanceof AbstractC11993ceZ) || (chainAddressRcXXUw = ((AbstractC11993ceZ) oKWBaseTransaction).RcXXUw()) == null) {
            return null;
        }
        java.lang.String strOcIXYQ = ((AbstractC11993ceZ) this.KWHzl).OcIXYQ();
        if (strOcIXYQ == null) {
            strOcIXYQ = "";
        }
        return new WalletBtcAddressBean(chainAddressRcXXUw.getAddress(), chainAddressRcXXUw.getAddressType(), strOcIXYQ, C54870xYj.EZpvd(strOcIXYQ, EZpvd().valueOf(), EZpvd().AkhnZx(), null, (248 & 8) != 0 ? DisplaySign.AUTO : null, (248 & 16) != 0 ? false : false, (248 & 32) != 0 ? null : null, (248 & 64) != 0 ? false : false, (248 & 128) != 0 ? RoundingMode.DOWN : null), EZpvd().fJNWhG());
    }

    @Override // o.xWF
    public AbstractC58185ywX<java.lang.Boolean> OLrzqt(@NotNull final android.app.Activity activity, @NotNull final androidx.fragment.app.FragmentManager fragmentManager, java.lang.String str) {
        Intrinsics.checkNotNullParameter(activity, "");
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        OKWBaseTransaction<?> oKWBaseTransaction = this.KWHzl;
        if (!(oKWBaseTransaction instanceof AbstractC8564bFB)) {
            AbstractC58185ywX<java.lang.Boolean> abstractC58185ywXCopydefault = AbstractC58185ywX.copydefault();
            Intrinsics.checkNotNullExpressionValue(abstractC58185ywXCopydefault, "");
            return abstractC58185ywXCopydefault;
        }
        TxToastCheckReq txToastCheckReqI_ = ((AbstractC8564bFB) oKWBaseTransaction).i_();
        txToastCheckReqI_.setCheckTypes(C56402yEa.EZpvd(2));
        if (str != null && str.length() != 0) {
            txToastCheckReqI_.setTo(str);
        }
        AbstractC58185ywX abstractC58185ywXUnwrapResponseData$default = C43423rox.unwrapResponseData$default(((AbstractC8564bFB) this.KWHzl).ixgjPv().copydefault(txToastCheckReqI_), (Function1) null, 1, (java.lang.Object) null);
        final Function1 function1 = new Function1() { // from class: o.cZt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C11735cZg.AEQbTJ(activity, fragmentManager, this, (java.util.List) obj);
            }
        };
        AbstractC58185ywX<java.lang.Boolean> abstractC58185ywXKWHzl = abstractC58185ywXUnwrapResponseData$default.KWHzl(new InterfaceC58229yxO() { // from class: o.cZp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C11735cZg.OLrzqt(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        return abstractC58185ywXKWHzl;
    }

    public static final InterfaceC60096zvd OLrzqt(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    public static final InterfaceC60096zvd AEQbTJ(final android.app.Activity activity, final androidx.fragment.app.FragmentManager fragmentManager, final C11735cZg c11735cZg, final java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        return AbstractC58185ywX.KWHzl(new InterfaceC58187ywZ() { // from class: o.cZq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58187ywZ
            public final void subscribe(InterfaceC58184ywW interfaceC58184ywW) {
                C11735cZg.copydefault(activity, fragmentManager, c11735cZg, list, interfaceC58184ywW);
            }
        }, BackpressureStrategy.BUFFER);
    }

    public static final void copydefault(android.app.Activity activity, androidx.fragment.app.FragmentManager fragmentManager, C11735cZg c11735cZg, java.util.List list, final InterfaceC58184ywW interfaceC58184ywW) {
        Intrinsics.checkNotNullParameter(interfaceC58184ywW, "");
        TxToastCheckHelper.StateListAnimator stateListAnimator = new TxToastCheckHelper.StateListAnimator(((AbstractC8564bFB) c11735cZg.KWHzl).fERRXa().getAddress(), ((AbstractC8564bFB) c11735cZg.KWHzl).zLjUOn(), ((AbstractC8564bFB) c11735cZg.KWHzl).dHguZz(), false);
        Intrinsics.copydefault(list);
        TxToastCheckHelper.startCheck$default(new TxToastCheckHelper(activity, fragmentManager, stateListAnimator, list, new yHO() { // from class: o.cZh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.yHO
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return C11735cZg.AEQbTJ(interfaceC58184ywW, (TxToastCheckRes) obj, (java.lang.Boolean) obj2, (java.lang.Boolean) obj3);
            }
        }), false, 1, null);
    }

    public static final Unit AEQbTJ(InterfaceC58184ywW interfaceC58184ywW, TxToastCheckRes txToastCheckRes, java.lang.Boolean bool, java.lang.Boolean bool2) {
        if ((txToastCheckRes != null ? txToastCheckRes.getCheckType() : null) == null) {
            interfaceC58184ywW.onNext(java.lang.Boolean.valueOf(Intrinsics.EZpvd(bool, java.lang.Boolean.TRUE)));
        }
        return Unit.INSTANCE;
    }

    @Override // o.xWF
    public AbstractC58185ywX<WalletDappInteractionBizService.SubmitResult> copydefault(@NotNull FragmentActivity fragmentActivity, @NotNull androidx.fragment.app.FragmentManager fragmentManager) {
        Intrinsics.checkNotNullParameter(fragmentActivity, "");
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        return OLrzqt(fragmentActivity, false, false);
    }

    @Override // o.xWF
    public AbstractC58185ywX<WalletDappInteractionBizService.SubmitResult> copydefault(@NotNull FragmentActivity fragmentActivity, @NotNull androidx.fragment.app.FragmentManager fragmentManager, boolean z) {
        Intrinsics.checkNotNullParameter(fragmentActivity, "");
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        return OLrzqt(fragmentActivity, false, z);
    }

    public final AbstractC58185ywX<WalletDappInteractionBizService.SubmitResult> OLrzqt(final FragmentActivity fragmentActivity, boolean z, boolean z2) {
        AbstractC58185ywX abstractC58185ywXEZpvd = C8396bBt.submitWithIgnoreCondition$default(C8396bBt.AEQbTJ, fragmentActivity, this.KWHzl, z, z2, true, false, new Application(), 32, null).EZpvd();
        final Function1 function1 = new Function1() { // from class: o.cZr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C11735cZg.AEQbTJ(this.OLrzqt, fragmentActivity, (ResponseData) obj);
            }
        };
        AbstractC58185ywX<WalletDappInteractionBizService.SubmitResult> abstractC58185ywXAEQbTJ = abstractC58185ywXEZpvd.AEQbTJ(new InterfaceC58229yxO() { // from class: o.cZn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C11735cZg.gEmmrt(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        return abstractC58185ywXAEQbTJ;
    }

    public static final WalletDappInteractionBizService.SubmitResult gEmmrt(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (WalletDappInteractionBizService.SubmitResult) function1.invoke(obj);
    }

    public static final WalletDappInteractionBizService.SubmitResult AEQbTJ(C11735cZg c11735cZg, FragmentActivity fragmentActivity, ResponseData responseData) {
        WalletDappInteractionBizService.SubmitResult submitResult;
        C9748bbT c9748bbT;
        java.lang.String msg;
        Intrinsics.checkNotNullParameter(responseData, "");
        int code = responseData.getCode();
        if (code == -5014) {
            return new WalletDappInteractionBizService.SubmitResult(2, null, null, null, null, null, null, false, false, TypedValues.PositionType.TYPE_POSITION_TYPE, null);
        }
        if (code == -5012) {
            return new WalletDappInteractionBizService.SubmitResult(2, null, null, null, null, null, null, false, false, TypedValues.PositionType.TYPE_POSITION_TYPE, null);
        }
        if (code == 20010004) {
            submitResult = new WalletDappInteractionBizService.SubmitResult(20010004, responseData.getErrorMsg(), null, null, null, null, null, c11735cZg.KWHzl instanceof C12195ciP, false, 380, null);
        } else if (code != -5010 && code != -5009) {
            switch (code) {
                case -5007:
                    return new WalletDappInteractionBizService.SubmitResult(8, null, null, null, null, null, null, c11735cZg.KWHzl instanceof C12195ciP, false, 382, null);
                case -5006:
                    return new WalletDappInteractionBizService.SubmitResult(7, fragmentActivity.getString(C13754dXa.FragmentManager.unregisterCallbackListener), null, null, null, null, null, c11735cZg.KWHzl instanceof C12195ciP, false, 380, null);
                case -5005:
                    return new WalletDappInteractionBizService.SubmitResult(6, fragmentActivity.getString(C13754dXa.FragmentManager.DRGLNw), null, null, null, null, null, c11735cZg.KWHzl instanceof C12195ciP, false, 380, null);
                case -5004:
                    return new WalletDappInteractionBizService.SubmitResult(5, fragmentActivity.getString(C13754dXa.FragmentManager.sYcwUD), null, null, null, null, null, c11735cZg.KWHzl instanceof C12195ciP, false, 380, null);
                case -5003:
                    return new WalletDappInteractionBizService.SubmitResult(4, fragmentActivity.getString(C13754dXa.FragmentManager.zpGcln), null, null, null, null, null, c11735cZg.KWHzl instanceof C12195ciP, false, 380, null);
                case -5002:
                    return new WalletDappInteractionBizService.SubmitResult(4, fragmentActivity.getString(C13754dXa.FragmentManager.FhERFw), null, null, null, null, null, c11735cZg.KWHzl instanceof C12195ciP, false, 380, null);
                case -5001:
                    c11735cZg.KWHzl.fFgQHt();
                    C9748bbT c9748bbT2 = (C9748bbT) responseData.getData();
                    java.lang.String strGEmmrt = c9748bbT2 != null ? c9748bbT2.gEmmrt() : null;
                    C9748bbT c9748bbT3 = (C9748bbT) responseData.getData();
                    java.lang.String strKWHzl = c9748bbT3 != null ? c9748bbT3.KWHzl() : null;
                    java.lang.String strKWHzl2 = (!c11735cZg.KWHzl.dUDNAs().getFieldNames() || (c9748bbT = (C9748bbT) responseData.getData()) == null) ? null : c9748bbT.KWHzl();
                    C9748bbT c9748bbT4 = (C9748bbT) responseData.getData();
                    java.lang.String strOLrzqt = c9748bbT4 != null ? c9748bbT4.OLrzqt() : null;
                    C9748bbT c9748bbT5 = (C9748bbT) responseData.getData();
                    java.lang.String strAEQbTJ = c9748bbT5 != null ? c9748bbT5.AEQbTJ() : null;
                    boolean z = c11735cZg.KWHzl instanceof C12195ciP;
                    C9748bbT c9748bbT6 = (C9748bbT) responseData.getData();
                    return new WalletDappInteractionBizService.SubmitResult(0, null, strGEmmrt, strKWHzl, strKWHzl2, strOLrzqt, strAEQbTJ, z, c9748bbT6 != null && Intrinsics.EZpvd(c9748bbT6.AYXKKw(), java.lang.Boolean.TRUE) && (c11735cZg.KWHzl instanceof C8963bMd), 2, null);
                case -5000:
                    if (responseData.getMsg().length() == 0) {
                        msg = fragmentActivity.getString(C13754dXa.FragmentManager.Dfm);
                    } else {
                        msg = responseData.getMsg();
                    }
                    return new WalletDappInteractionBizService.SubmitResult(-1, msg, null, null, null, null, null, c11735cZg.KWHzl instanceof C12195ciP, false, 380, null);
                default:
                    submitResult = new WalletDappInteractionBizService.SubmitResult(-1, responseData.getMsg(), null, null, null, null, null, c11735cZg.KWHzl instanceof C12195ciP, false, 380, null);
                    break;
            }
        } else {
            return new WalletDappInteractionBizService.SubmitResult(9, fragmentActivity.getString(C13754dXa.FragmentManager.setRecycleOnMeasureEnabled), null, null, null, null, null, false, false, TypedValues.PositionType.TYPE_CURVE_FIT, null);
        }
        return submitResult;
    }
}
