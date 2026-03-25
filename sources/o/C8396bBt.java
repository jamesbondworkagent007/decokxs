package o;

import androidx.fragment.app.FragmentActivity;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import com.okinc.business.defi.api.bean.AAMessageSignType;
import com.okinc.business.defi.api.bean.BTCDappSignData;
import com.okinc.business.defi.api.bean.DappInteractionArgs;
import com.okinc.business.defi.api.bean.DappSignArgs;
import com.okinc.business.defi.api.bean.FromToken;
import com.okinc.business.defi.api.bean.NewCallbackBean;
import com.okinc.business.defi.api.bean.NewUTXODappOptions;
import com.okinc.business.defi.api.bean.NewUTXODappTransferData;
import com.okinc.business.defi.api.bean.SignData;
import com.okinc.business.defi.api.bean.SolanaMethod;
import com.okinc.business.defi.api.bean.UTXODappTransferData;
import com.okinc.business.defi.api.model.tx.SubmitTxExpandBean;
import com.okinc.business.defi.api.model.tx.signdata.AACancelApprovalSignData;
import com.okinc.business.defi.api.model.tx.signdata.AAContractSignData;
import com.okinc.business.defi.api.model.tx.signdata.AASubSignData;
import com.okinc.business.defi.api.model.tx.signdata.AptosContractSignData;
import com.okinc.business.defi.api.model.tx.signdata.AptosMessageSignData;
import com.okinc.business.defi.api.model.tx.signdata.BRC20MintSignData;
import com.okinc.business.defi.api.model.tx.signdata.BTCMessageSignData;
import com.okinc.business.defi.api.model.tx.signdata.BaseSignData;
import com.okinc.business.defi.api.model.tx.signdata.CeDefiTransferSignData;
import com.okinc.business.defi.api.model.tx.signdata.ContractSignData;
import com.okinc.business.defi.api.model.tx.signdata.CosmosContractSignData;
import com.okinc.business.defi.api.model.tx.signdata.CosmosContractSignDirectData;
import com.okinc.business.defi.api.model.tx.signdata.CosmosContractSignMessageData;
import com.okinc.business.defi.api.model.tx.signdata.CosmosMessageSignData;
import com.okinc.business.defi.api.model.tx.signdata.EVM5792ContractSignData;
import com.okinc.business.defi.api.model.tx.signdata.EVMBatchContractSignData;
import com.okinc.business.defi.api.model.tx.signdata.EVMCancelApprovalSignData;
import com.okinc.business.defi.api.model.tx.signdata.EVMContractSignData;
import com.okinc.business.defi.api.model.tx.signdata.EVMMessageSignData;
import com.okinc.business.defi.api.model.tx.signdata.FixedUTXOSignData;
import com.okinc.business.defi.api.model.tx.signdata.KaspaMessageSignData;
import com.okinc.business.defi.api.model.tx.signdata.MessageSignData;
import com.okinc.business.defi.api.model.tx.signdata.MultiTransferSignData;
import com.okinc.business.defi.api.model.tx.signdata.NostrMessageSignData;
import com.okinc.business.defi.api.model.tx.signdata.PiRegisterSignData;
import com.okinc.business.defi.api.model.tx.signdata.PlatformItem;
import com.okinc.business.defi.api.model.tx.signdata.RunesMainMintSignData;
import com.okinc.business.defi.api.model.tx.signdata.RunesTransferSignData;
import com.okinc.business.defi.api.model.tx.signdata.SignDataArgs;
import com.okinc.business.defi.api.model.tx.signdata.SolanaContractSignData;
import com.okinc.business.defi.api.model.tx.signdata.SolanaMemeContractSignData;
import com.okinc.business.defi.api.model.tx.signdata.SolanaMessageSignData;
import com.okinc.business.defi.api.model.tx.signdata.SolanaMultiContractSignData;
import com.okinc.business.defi.api.model.tx.signdata.SolanaMultiMemeContractSignData;
import com.okinc.business.defi.api.model.tx.signdata.StacksContractSignData;
import com.okinc.business.defi.api.model.tx.signdata.StarkNetContractSignData;
import com.okinc.business.defi.api.model.tx.signdata.StarkNetMessageSignData;
import com.okinc.business.defi.api.model.tx.signdata.StarkNetRegisterSignData;
import com.okinc.business.defi.api.model.tx.signdata.SuiContractSignData;
import com.okinc.business.defi.api.model.tx.signdata.SuiMessageSignData;
import com.okinc.business.defi.api.model.tx.signdata.TonContractSignData;
import com.okinc.business.defi.api.model.tx.signdata.TonMessageSignData;
import com.okinc.business.defi.api.model.tx.signdata.TransferSignData;
import com.okinc.business.defi.api.model.tx.signdata.TronApprovalSignData;
import com.okinc.business.defi.api.model.tx.signdata.TronContractSignData;
import com.okinc.business.defi.api.model.tx.signdata.TronMessageSignData;
import com.okinc.business.defi.api.model.tx.signdata.UTXOMintBaseSignData;
import com.okinc.business.defi.api.model.tx.signdata.UTXOTransferBaseSignData;
import com.okinc.business.defi.api.model.tx.signdata.UTXOTransferSignData;
import com.okinc.business.defi.api.model.tx.signdata.ZKSyncRegisterSignData;
import com.okinc.business.defi.biz.constant.WalletType;
import com.okinc.business.defi.biz.core.transaction.TransactionManager$signTransactions$1;
import com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction;
import com.okinc.business.defi.biz.core.transaction.sign.evm.OKWX402SignTransfer;
import com.okinc.business.defi.biz.core.transaction.sign.tron.OKWTronSignContract;
import com.okinc.business.defi.biz.core.transaction.sign.utxo.bean.BTCSpeedUpSignData;
import com.okinc.business.defi.biz.core.tx.wallet.TxReplaceSendInfo;
import com.okinc.business.defi.biz.net.bean.AAStatus;
import com.okinc.business.defi.biz.net.bean.TxToastCheckRes;
import com.okinc.business.defi.common.TxToastCheckHelper;
import com.okinc.components.track.ABTestManager;
import com.okinc.components.track.amplitude.AmplitudeName;
import com.okinc.network.okg.response.ResponseData;
import io.reactivex.BackpressureStrategy;
import java.math.BigDecimal;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import o.AbstractDialogInterfaceOnKeyListenerC57208yeA;
import o.ActivityC10049bhC;
import o.ActivityC20262gda;
import o.C10614brl;
import o.C12827cuN;
import o.C18450fid;
import o.C8955bMV;
import o.C9694baS;
import o.InterfaceC18445fiY;
import o.InterfaceC9739bbK;
import o.InterfaceC9740bbL;
import o.InterfaceC9759bbe;
import o.ViewOnClickListenerC21214gvY;
import o.eGH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.bBt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C8396bBt implements InterfaceC9740bbL {
    public static final C8396bBt AEQbTJ = new C8396bBt();

    /* JADX INFO: renamed from: o.bBt$Activity */
    public final /* synthetic */ class Activity {
        public static final /* synthetic */ int[] OLrzqt;
        public static final /* synthetic */ int[] copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[AAMessageSignType.values().length];
            try {
                iArr[AAMessageSignType.NORMAL.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[AAMessageSignType.DIRECT.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            copydefault = iArr;
            int[] iArr2 = new int[OKWBaseTransaction.TransactionType.values().length];
            try {
                iArr2[OKWBaseTransaction.TransactionType.Approve.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr2[OKWBaseTransaction.TransactionType.CancelApprove.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            OLrzqt = iArr2;
        }
    }

    /* JADX INFO: renamed from: o.bBt$TaskDescription */
    public static final class TaskDescription extends C32927mmn {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.C32927mmn, o.InterfaceC32926mmm
        public java.lang.String EZpvd() {
            return "mobile_web3_wallet_transaction_ui_3";
        }
    }

    private C8396bBt() {
    }

    @Override // o.InterfaceC9740bbL
    public AbstractC58260yxt<kotlin.Pair<InterfaceC9734bbF, java.lang.String>> EZpvd(@NotNull SignDataArgs<?> signDataArgs) {
        Intrinsics.checkNotNullParameter(signDataArgs, "");
        AbstractC58260yxt abstractC58260yxtBuildOKWTransaction$default = buildOKWTransaction$default(this, signDataArgs, null, false, 6, null);
        final Function1 function1 = new Function1() { // from class: o.bCA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C8396bBt.copydefault((kotlin.Pair) obj);
            }
        };
        AbstractC58260yxt<kotlin.Pair<InterfaceC9734bbF, java.lang.String>> abstractC58260yxtCopydefault = abstractC58260yxtBuildOKWTransaction$default.copydefault(new InterfaceC58229yxO() { // from class: o.bCI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C8396bBt.zLjUOn(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtCopydefault, "");
        return abstractC58260yxtCopydefault;
    }

    public static final kotlin.Pair zLjUOn(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (kotlin.Pair) function1.invoke(obj);
    }

    public static final kotlin.Pair copydefault(kotlin.Pair pair) {
        C8410bCG c8410bCG;
        Intrinsics.checkNotNullParameter(pair, "");
        if (pair.getFirst() != null) {
            java.lang.Object first = pair.getFirst();
            Intrinsics.copydefault(first);
            c8410bCG = new C8410bCG((OKWBaseTransaction) first);
        } else {
            c8410bCG = null;
        }
        return C56390yDp.OLrzqt(c8410bCG, pair.getSecond());
    }

    @Override // o.InterfaceC9740bbL
    public AbstractC58260yxt<ResponseData<C9748bbT>> copydefault(@NotNull SignDataArgs<?> signDataArgs, final boolean z, @NotNull final FragmentActivity fragmentActivity, @NotNull final InterfaceC9740bbL.TaskDescription taskDescription) {
        Intrinsics.checkNotNullParameter(signDataArgs, "");
        Intrinsics.checkNotNullParameter(fragmentActivity, "");
        Intrinsics.checkNotNullParameter(taskDescription, "");
        BaseSignData signData = signDataArgs.getSignData();
        if ((signData instanceof MessageSignData) && signDataArgs.getGeneralChainId() == 501) {
            MessageSignData messageSignData = (MessageSignData) signData;
            messageSignData.setData(xYW.AEQbTJ.copydefault(messageSignData.getData()));
        }
        AbstractC58260yxt abstractC58260yxtBuildOKWTransaction$default = buildOKWTransaction$default(this, signDataArgs, null, false, 6, null);
        final Function1 function1 = new Function1() { // from class: o.bBX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C8396bBt.EZpvd(fragmentActivity, z, taskDescription, (kotlin.Pair) obj);
            }
        };
        AbstractC58260yxt<ResponseData<C9748bbT>> abstractC58260yxtOLrzqt = abstractC58260yxtBuildOKWTransaction$default.OLrzqt(new InterfaceC58229yxO() { // from class: o.bBZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C8396bBt.QbewEr(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtOLrzqt, "");
        return abstractC58260yxtOLrzqt;
    }

    public static final InterfaceC58261yxu QbewEr(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC58261yxu) function1.invoke(obj);
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.djN.showBackupTipDialog$default(o.djN, o.mov, androidx.fragment.app.FragmentManager, o.ctV, kotlin.jvm.functions.Function0, int, java.lang.Object):void */
    public static final InterfaceC58261yxu EZpvd(FragmentActivity fragmentActivity, boolean z, InterfaceC9740bbL.TaskDescription taskDescription, kotlin.Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        OKWBaseTransaction<?> oKWBaseTransaction = (OKWBaseTransaction) pair.getFirst();
        if (oKWBaseTransaction == null) {
            return AbstractC58260yxt.copydefault(new ResponseData(-5007, null, null, null, null, null, 62, null));
        }
        AbstractC12782ctV abstractC12782ctVDUDNAs = oKWBaseTransaction.dUDNAs();
        if (!abstractC12782ctVDUDNAs.AubY()) {
            return AbstractC58260yxt.copydefault(new ResponseData(-5014, null, null, null, null, null, 62, null));
        }
        if (!abstractC12782ctVDUDNAs.zLjUOn()) {
            AbstractActivityC33041mov abstractActivityC33041mov = fragmentActivity instanceof AbstractActivityC33041mov ? (AbstractActivityC33041mov) fragmentActivity : null;
            if (abstractActivityC33041mov == null) {
                return AbstractC58260yxt.copydefault(new ResponseData(-5007, null, null, null, null, null, 62, null));
            }
            if (!abstractActivityC33041mov.isFinishing()) {
                C14325djN.showBackupTipDialog$default(new C14325djN(), abstractActivityC33041mov, abstractActivityC33041mov.getSupportFragmentManager(), abstractC12782ctVDUDNAs, null, 8, null);
            }
            return AbstractC58260yxt.copydefault(new ResponseData(-5014, null, null, null, null, null, 62, null));
        }
        return AEQbTJ.EZpvd(fragmentActivity, oKWBaseTransaction, false, false, false, z && Intrinsics.EZpvd(((InterfaceC9855bdU) C43251rlk.copydefault(InterfaceC9855bdU.class)).copydefault(), InterfaceC9759bbe.StateListAnimator.OLrzqt), taskDescription);
    }

    public static /* synthetic */ AbstractC58260yxt buildOKWTransaction$default(C8396bBt c8396bBt, SignDataArgs signDataArgs, java.lang.String str, boolean z, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str = "";
        }
        if ((i & 4) != 0) {
            z = true;
        }
        return c8396bBt.EZpvd((SignDataArgs<?>) signDataArgs, str, z);
    }

    public static final InterfaceC58261yxu uzCIH(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC58261yxu) function1.invoke(obj);
    }

    public final AbstractC58260yxt<kotlin.Pair<OKWBaseTransaction<?>, java.lang.String>> EZpvd(@NotNull final SignDataArgs<?> signDataArgs, @NotNull final java.lang.String str, final boolean z) {
        Intrinsics.checkNotNullParameter(signDataArgs, "");
        Intrinsics.checkNotNullParameter(str, "");
        AbstractC58260yxt abstractC58260yxtValueOf = InterfaceC9739bbK.StateListAnimator.ensureInitialized$default(C10337bmZ.KWHzl, false, 1, null).valueOf();
        final Function1 function1 = new Function1() { // from class: o.bBE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C8396bBt.EZpvd(signDataArgs, (java.lang.Boolean) obj);
            }
        };
        AbstractC58260yxt abstractC58260yxtOLrzqt = abstractC58260yxtValueOf.OLrzqt(new InterfaceC58229yxO() { // from class: o.bBC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C8396bBt.uzCIH(function1, obj);
            }
        });
        final Function1 function12 = new Function1() { // from class: o.bBH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C8396bBt.EZpvd(str, signDataArgs, z, (AbstractC12782ctV) obj);
            }
        };
        AbstractC58260yxt<kotlin.Pair<OKWBaseTransaction<?>, java.lang.String>> abstractC58260yxtOLrzqt2 = abstractC58260yxtOLrzqt.OLrzqt(new InterfaceC58229yxO() { // from class: o.bBI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C8396bBt.getFieldNames(function12, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtOLrzqt2, "");
        return abstractC58260yxtOLrzqt2;
    }

    public static final InterfaceC58261yxu EZpvd(SignDataArgs signDataArgs, java.lang.Boolean bool) {
        Intrinsics.checkNotNullParameter(bool, "");
        return C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null).OLrzqt(signDataArgs.getWalletId(), true);
    }

    public static final InterfaceC58261yxu getFieldNames(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC58261yxu) function1.invoke(obj);
    }

    public static final InterfaceC58261yxu EZpvd(java.lang.String str, SignDataArgs signDataArgs, boolean z, AbstractC12782ctV abstractC12782ctV) {
        Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
        if (str.length() == 0) {
            str = z ? C10614brl.TaskDescription.getInstance$default(C10614brl.Companion, null, 1, null).EZpvd(signDataArgs.getWalletId(), java.lang.String.valueOf(signDataArgs.getGeneralChainId())) : "";
        }
        C10854bwM c10854bwMCopydefault = C11627cVg.KWHzl.copydefault(C33129mqd.valueOf(java.lang.Long.valueOf(signDataArgs.getGeneralChainId())), true, str);
        if (c10854bwMCopydefault == null) {
            return AbstractC58260yxt.copydefault(C56390yDp.OLrzqt(null, C10857bwP.AEQbTJ("TransactionManager", signDataArgs.getGeneralChainId() + " chainId not found")));
        }
        C8396bBt c8396bBt = AEQbTJ;
        BaseSignData baseSignDataEZpvd = c8396bBt.EZpvd(c10854bwMCopydefault, signDataArgs.getSignData(), signDataArgs.getWalletAddress());
        if (baseSignDataEZpvd == null) {
            return AbstractC58260yxt.copydefault(C56390yDp.OLrzqt(null, C10857bwP.AEQbTJ("TransactionManager", "convertSignDataIfNeeded " + signDataArgs.getSignData().getClass().getSimpleName())));
        }
        Intrinsics.copydefault(signDataArgs, "");
        signDataArgs.setSignData(baseSignDataEZpvd);
        return c8396bBt.EZpvd(abstractC12782ctV, c10854bwMCopydefault, (SignDataArgs<?>) signDataArgs);
    }

    /* JADX DEBUG: Type inference failed for r3v2. Raw type applied. Possible types: o.yxt<R>, java.lang.Object, o.yxt<kotlin.Pair<o.bbF, java.lang.String>> */
    @Override // o.InterfaceC9740bbL
    public AbstractC58260yxt<kotlin.Pair<InterfaceC9734bbF, java.lang.String>> OLrzqt(@NotNull DappInteractionArgs dappInteractionArgs, Function1<? super NewCallbackBean, ? extends AbstractC58185ywX<ResponseData<java.lang.String>>> function1) {
        Intrinsics.checkNotNullParameter(dappInteractionArgs, "");
        AbstractC58260yxt<kotlin.Pair<OKWBaseTransaction<?>, java.lang.String>> abstractC58260yxtAEQbTJ = AEQbTJ(dappInteractionArgs, OKWBaseTransaction.TransactionType.Contract, function1);
        final Function1 function12 = new Function1() { // from class: o.bBF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C8396bBt.KWHzl((kotlin.Pair) obj);
            }
        };
        AbstractC58260yxt abstractC58260yxtCopydefault = abstractC58260yxtAEQbTJ.copydefault(new InterfaceC58229yxO() { // from class: o.bBG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C8396bBt.iwGUEr(function12, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtCopydefault, "");
        return abstractC58260yxtCopydefault;
    }

    public static final kotlin.Pair iwGUEr(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (kotlin.Pair) function1.invoke(obj);
    }

    public static final kotlin.Pair KWHzl(kotlin.Pair pair) {
        C8410bCG c8410bCG;
        Intrinsics.checkNotNullParameter(pair, "");
        if (pair.getFirst() != null) {
            java.lang.Object first = pair.getFirst();
            Intrinsics.copydefault(first);
            c8410bCG = new C8410bCG((OKWBaseTransaction) first);
        } else {
            c8410bCG = null;
        }
        return C56390yDp.OLrzqt(c8410bCG, pair.getSecond());
    }

    public static final InterfaceC58261yxu AubY(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC58261yxu) function1.invoke(obj);
    }

    public final AbstractC58260yxt<kotlin.Pair<OKWBaseTransaction<?>, java.lang.String>> AEQbTJ(@NotNull final DappInteractionArgs dappInteractionArgs, @NotNull final OKWBaseTransaction.TransactionType transactionType, final Function1<? super NewCallbackBean, ? extends AbstractC58185ywX<ResponseData<java.lang.String>>> function1) {
        Intrinsics.checkNotNullParameter(dappInteractionArgs, "");
        Intrinsics.checkNotNullParameter(transactionType, "");
        AbstractC58260yxt abstractC58260yxtValueOf = InterfaceC9739bbK.StateListAnimator.ensureInitialized$default(C10337bmZ.KWHzl, false, 1, null).valueOf();
        final Function1 function12 = new Function1() { // from class: o.bCo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C8396bBt.OLrzqt(dappInteractionArgs, (java.lang.Boolean) obj);
            }
        };
        AbstractC58260yxt abstractC58260yxtOLrzqt = abstractC58260yxtValueOf.OLrzqt(new InterfaceC58229yxO() { // from class: o.bCl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C8396bBt.AubY(function12, obj);
            }
        });
        final Function1 function13 = new Function1() { // from class: o.bCm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C8396bBt.AEQbTJ(dappInteractionArgs, function1, transactionType, (AbstractC12782ctV) obj);
            }
        };
        AbstractC58260yxt<kotlin.Pair<OKWBaseTransaction<?>, java.lang.String>> abstractC58260yxtOLrzqt2 = abstractC58260yxtOLrzqt.OLrzqt(new InterfaceC58229yxO() { // from class: o.bCs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C8396bBt.AuCTelauCTel(function13, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtOLrzqt2, "");
        return abstractC58260yxtOLrzqt2;
    }

    public static final InterfaceC58261yxu OLrzqt(DappInteractionArgs dappInteractionArgs, java.lang.Boolean bool) {
        Intrinsics.checkNotNullParameter(bool, "");
        return C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null).OLrzqt(dappInteractionArgs.getWalletId(), true);
    }

    public static final InterfaceC58261yxu AuCTelauCTel(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC58261yxu) function1.invoke(obj);
    }

    public static final InterfaceC58261yxu AEQbTJ(DappInteractionArgs dappInteractionArgs, Function1 function1, OKWBaseTransaction.TransactionType transactionType, AbstractC12782ctV abstractC12782ctV) {
        Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
        C10854bwM c10854bwMCopydefault = C11627cVg.KWHzl.EZpvd(C33129mqd.valueOf(dappInteractionArgs.getChainId()), true);
        if (c10854bwMCopydefault == null) {
            return AbstractC58260yxt.copydefault(C56390yDp.OLrzqt(null, C10857bwP.AEQbTJ("TransactionManager", dappInteractionArgs.getChainId() + " chainId not found")));
        }
        C8396bBt c8396bBt = AEQbTJ;
        SignDataArgs<BaseSignData> signDataArgsEZpvd = c8396bBt.EZpvd(abstractC12782ctV, c10854bwMCopydefault, dappInteractionArgs, (Function1<? super NewCallbackBean, ? extends AbstractC58185ywX<ResponseData<java.lang.String>>>) function1, (Function1<? super NewCallbackBean, ? extends AbstractC58185ywX<ResponseData<java.lang.String>>>) null, transactionType);
        if (signDataArgsEZpvd == null) {
            return AbstractC58260yxt.copydefault(C56390yDp.OLrzqt(null, C10857bwP.AEQbTJ("TransactionManager", "convertContractSignDataArgs " + dappInteractionArgs.getChainId() + " " + dappInteractionArgs.getSignDataJson())));
        }
        return c8396bBt.EZpvd(abstractC12782ctV, c10854bwMCopydefault, signDataArgsEZpvd);
    }

    public final AbstractC58260yxt<kotlin.Pair<OKWBaseTransaction<?>, java.lang.String>> copydefault(@NotNull DappSignArgs dappSignArgs) {
        Intrinsics.checkNotNullParameter(dappSignArgs, "");
        SignDataArgs<MessageSignData> signDataArgsOLrzqt = OLrzqt(dappSignArgs);
        if (signDataArgsOLrzqt != null) {
            return buildOKWTransaction$default(this, signDataArgsOLrzqt, null, false, 6, null);
        }
        AbstractC58260yxt<kotlin.Pair<OKWBaseTransaction<?>, java.lang.String>> abstractC58260yxtCopydefault = AbstractC58260yxt.copydefault(C56390yDp.OLrzqt(null, C10857bwP.AEQbTJ("TransactionManager", "convertMessageSignData " + dappSignArgs.getChainId() + " " + dappSignArgs.getData())));
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtCopydefault, "");
        return abstractC58260yxtCopydefault;
    }

    public final BaseSignData EZpvd(@NotNull C10854bwM c10854bwM, @NotNull BaseSignData baseSignData, java.lang.String str) {
        C10854bwM c10854bwMOLrzqt;
        Intrinsics.checkNotNullParameter(c10854bwM, "");
        Intrinsics.checkNotNullParameter(baseSignData, "");
        if (!(baseSignData instanceof C9840bdF)) {
            return baseSignData;
        }
        C9840bdF c9840bdF = (C9840bdF) baseSignData;
        if (c9840bdF.EZpvd()) {
            c10854bwMOLrzqt = c10854bwM;
        } else {
            c10854bwMOLrzqt = C11627cVg.KWHzl.KWHzl(c9840bdF.AEQbTJ(), c10854bwM.fetchVPNInfo(), true);
            if (c10854bwMOLrzqt == null) {
                return null;
            }
        }
        if (c10854bwM.iRxXKY()) {
            UTXOTransferSignData uTXOTransferSignData = new UTXOTransferSignData(c10854bwM.AhwBna(), str == null ? "" : str, c9840bdF.KWHzl(), c9840bdF.copydefault(), false, false, null);
            uTXOTransferSignData.setMemo(c9840bdF.OLrzqt());
            return uTXOTransferSignData;
        }
        return new TransferSignData(c10854bwMOLrzqt.AhwBna(), "", c9840bdF.KWHzl(), c9840bdF.copydefault(), null, c9840bdF.OLrzqt(), 16, null);
    }

    /* JADX DEBUG: Type inference failed for r12v57. Raw type applied. Possible types: o.yxt<R>, java.lang.Object, o.yxt<kotlin.Pair<com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction<?>, java.lang.String>> */
    public final AbstractC58260yxt<kotlin.Pair<OKWBaseTransaction<?>, java.lang.String>> EZpvd(AbstractC12782ctV abstractC12782ctV, C10854bwM c10854bwM, SignDataArgs<?> signDataArgs) {
        final OKWBaseTransaction c9372bUO;
        BaseSignData signData = signDataArgs.getSignData();
        int i = 1;
        C8955bMV c8955bMV = null;
        byte b = 0;
        byte b2 = 0;
        byte b3 = 0;
        if (c10854bwM.call()) {
            if (signData instanceof RunesTransferSignData) {
                c9372bUO = new C12329ckr();
            } else if (signData instanceof UTXOTransferSignData) {
                C10854bwM c10854bwMEZpvd = C11627cVg.KWHzl.copydefault(java.lang.Long.valueOf(((UTXOTransferSignData) signData).getCoinId()), true);
                if (c10854bwMEZpvd == null) {
                    return AEQbTJ("utxo transfer", signData);
                }
                if (c10854bwMEZpvd.dvKsVJ()) {
                    c9372bUO = new C12319ckh();
                } else if (c10854bwMEZpvd.fjfviF()) {
                    c9372bUO = new C12286ckA();
                } else if (c10854bwMEZpvd.igXuih() || c10854bwMEZpvd.QwvEab()) {
                    c9372bUO = new C12322ckk();
                } else {
                    c9372bUO = c10854bwMEZpvd.accept() ? new C12317ckf() : new C12289ckD();
                }
            } else if (signData instanceof UTXOMintBaseSignData) {
                UTXOMintBaseSignData uTXOMintBaseSignData = (UTXOMintBaseSignData) signData;
                if (uTXOMintBaseSignData instanceof BRC20MintSignData) {
                    int mintType = ((BRC20MintSignData) signData).getMintType();
                    if (mintType == 9) {
                        java.lang.Integer bizType = signDataArgs.getBizType();
                        c9372bUO = (bizType != null && bizType.intValue() == 13) ? new C12190ciK() : new C12266cjh();
                    } else if (mintType == 10) {
                        c9372bUO = new C12275cjq();
                    } else {
                        c9372bUO = new C12195ciP();
                    }
                } else {
                    if (!(uTXOMintBaseSignData instanceof RunesMainMintSignData)) {
                        return AEQbTJ("btc mint", signData);
                    }
                    c9372bUO = new C12282cjx();
                }
            } else if (signData instanceof FixedUTXOSignData) {
                java.lang.Integer bizType2 = signDataArgs.getBizType();
                if (bizType2 != null && bizType2.intValue() == 4) {
                    java.lang.Integer firstNftProtocolId = ((FixedUTXOSignData) signData).getFirstNftProtocolId();
                    if (firstNftProtocolId != null && firstNftProtocolId.intValue() == 2) {
                        c9372bUO = new C12109cgj();
                    } else if (firstNftProtocolId != null && firstNftProtocolId.intValue() == 8) {
                        c9372bUO = new C12119cgt();
                    } else {
                        c9372bUO = (firstNftProtocolId != null && firstNftProtocolId.intValue() == 13) ? new C12077cgD() : new C12117cgr();
                    }
                } else if (bizType2 != null && bizType2.intValue() == 5) {
                    java.lang.Integer firstNftProtocolId2 = ((FixedUTXOSignData) signData).getFirstNftProtocolId();
                    if (firstNftProtocolId2 != null && firstNftProtocolId2.intValue() == 2) {
                        c9372bUO = new C12319ckh();
                    } else {
                        c9372bUO = (firstNftProtocolId2 != null && firstNftProtocolId2.intValue() == 8) ? new C12162chj() : new C12167cho();
                    }
                } else if (bizType2 != null && bizType2.intValue() == 11) {
                    c9372bUO = new C12207cib();
                } else if (bizType2 != null && bizType2.intValue() == 6) {
                    c9372bUO = new C12169chq();
                } else {
                    c9372bUO = (bizType2 != null && bizType2.intValue() == 10) ? new C12149chW() : new C12167cho();
                }
            } else if (signData instanceof BTCMessageSignData) {
                c9372bUO = new C12152chZ();
            } else {
                if (!(signData instanceof BTCSpeedUpSignData)) {
                    return AEQbTJ("utxo", signData);
                }
                c9372bUO = new C12244cjL();
            }
        } else if (c10854bwM.DarRvM()) {
            if (signData instanceof TransferSignData) {
                c9372bUO = new C9303bSz();
            } else if (signData instanceof MessageSignData) {
                c9372bUO = new C9254bSC();
            } else {
                if (!(signData instanceof ContractSignData)) {
                    return AEQbTJ("custom", signData);
                }
                c9372bUO = new C9216bRR();
            }
        } else if (c10854bwM.RlQdEF()) {
            if (signData instanceof TransferSignData) {
                C10854bwM c10854bwMEZpvd2 = C11627cVg.KWHzl.copydefault(java.lang.Long.valueOf(((TransferSignData) signData).getCoinId()), true);
                if (c10854bwMEZpvd2 == null) {
                    return AEQbTJ("cardano transfer", signData);
                }
                c9372bUO = c10854bwMEZpvd2.DCUTEIddSDPG() ? new C8772bIy() : new C8729bIH();
            } else {
                return AEQbTJ("cardano", signData);
            }
        } else if (c10854bwM.QkdxfA()) {
            if (abstractC12782ctV.getFieldNames()) {
                if (signData instanceof TransferSignData) {
                    c9372bUO = new C9191bQt();
                } else if (signData instanceof MessageSignData) {
                    int i2 = Activity.copydefault[signDataArgs.getAaMessageSignType().ordinal()];
                    if (i2 == 1) {
                        c9372bUO = new C9184bQm();
                    } else {
                        if (i2 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        c9372bUO = new C9144bPz();
                    }
                } else {
                    if (!(signData instanceof ContractSignData)) {
                        return AEQbTJ("AA", signData);
                    }
                    c9372bUO = new C9100bPH();
                }
            } else if (signData instanceof CeDefiTransferSignData) {
                c9372bUO = new C8742bIU();
            } else if (signData instanceof MultiTransferSignData) {
                c9372bUO = new C8885bLE();
            } else if (signData instanceof TransferSignData) {
                TransferSignData transferSignData = (TransferSignData) signData;
                C10854bwM c10854bwMKWHzl = C10954byG.EZpvd.valueOf().KWHzl(java.lang.Long.valueOf(transferSignData.getCoinId()));
                if (c10854bwMKWHzl == null) {
                    AbstractC58260yxt<kotlin.Pair<OKWBaseTransaction<?>, java.lang.String>> abstractC58260yxtCopydefault = AbstractC58260yxt.copydefault(C56390yDp.OLrzqt(null, C10857bwP.AEQbTJ("TransactionManager", transferSignData.getCoinId() + " coinId not found")));
                    Intrinsics.checkNotNullExpressionValue(abstractC58260yxtCopydefault, "");
                    return abstractC58260yxtCopydefault;
                }
                if (c10854bwMKWHzl.QHmsKR()) {
                    c9372bUO = new C9082bOq();
                } else {
                    c9372bUO = (c10854bwMKWHzl.DWgRXt() && (abstractC12782ctV.AubY() || abstractC12782ctV.AwvSrB())) ? new OKWX402SignTransfer() : new C8998bNL();
                }
            } else if (signData instanceof MessageSignData) {
                c9372bUO = new C9035bNw();
            } else if (signData instanceof ContractSignData) {
                ContractSignData contractSignData = (ContractSignData) signData;
                if (contractSignData instanceof EVMBatchContractSignData) {
                    c9372bUO = new C8963bMd();
                } else if (contractSignData instanceof EVM5792ContractSignData) {
                    if (C8955bMV.Companion.copydefault((EVM5792ContractSignData) signData)) {
                        if (C9024bNl.Companion.OLrzqt((EVMContractSignData) signData)) {
                            c9372bUO = new C9021bNi();
                        } else {
                            c9372bUO = new C8951bMR();
                        }
                    } else {
                        return AEQbTJ("EVM", signData);
                    }
                } else if (!(contractSignData instanceof EVMContractSignData)) {
                    c9372bUO = new C8972bMm(b2 == true ? 1 : 0, i, b == true ? 1 : 0);
                } else if (C9024bNl.Companion.OLrzqt((EVMContractSignData) signData)) {
                    c9372bUO = new C9024bNl();
                } else {
                    c9372bUO = new C8972bMm(c8955bMV, i, b3 == true ? 1 : 0);
                }
            } else {
                return AEQbTJ("EVM", signData);
            }
        } else if (c10854bwM.ffGIBT()) {
            if (!(signData instanceof TransferSignData)) {
                return AEQbTJ("ETC", signData);
            }
            c9372bUO = new C8915bLi();
        } else if (c10854bwM.fARcdN()) {
            if (signData instanceof CeDefiTransferSignData) {
                c9372bUO = new C8747bIZ();
            } else if (signData instanceof TransferSignData) {
                c9372bUO = new C9615bYt();
            } else if (signData instanceof MessageSignData) {
                c9372bUO = new C9476bWM();
            } else if (signData instanceof ContractSignData) {
                ContractSignData contractSignData2 = (ContractSignData) signData;
                if (contractSignData2 instanceof SolanaMultiMemeContractSignData) {
                    c9372bUO = new C9465bWB();
                } else if (contractSignData2 instanceof SolanaMultiContractSignData) {
                    c9372bUO = new C9475bWL();
                } else {
                    c9372bUO = contractSignData2 instanceof SolanaMemeContractSignData ? new C9412bVB() : new C9413bVC();
                }
            } else {
                return AEQbTJ("SOL", signData);
            }
        } else if (c10854bwM.fIwbmz()) {
            if (signData instanceof TransferSignData) {
                c9372bUO = new C8670bHB();
            } else if (signData instanceof MessageSignData) {
                c9372bUO = new C8673bHE();
            } else {
                if (!(signData instanceof ContractSignData)) {
                    return AEQbTJ("aptos", signData);
                }
                c9372bUO = new C8701bHg();
            }
        } else if (c10854bwM.DCUTEIdCUTEI()) {
            if (signData instanceof TransferSignData) {
                c9372bUO = new C11767caL();
            } else if (signData instanceof MessageSignData) {
                c9372bUO = new C11761caF();
            } else if (signData instanceof ContractSignData) {
                c9372bUO = ((ContractSignData) signData) instanceof StarkNetRegisterSignData ? new C11763caH() : new C11796cao();
            } else {
                return AEQbTJ("starknet", signData);
            }
        } else if (c10854bwM.run()) {
            if (signData instanceof TransferSignData) {
                c9372bUO = new C12010ceq();
            } else if (signData instanceof MessageSignData) {
                c9372bUO = new C11999cef();
            } else if (signData instanceof ContractSignData) {
                c9372bUO = ((ContractSignData) signData) instanceof TronApprovalSignData ? new C11925cdK() : new OKWTronSignContract();
            } else {
                return AEQbTJ("trx", signData);
            }
        } else if (c10854bwM.DXXBbs()) {
            if (signData instanceof TransferSignData) {
                c9372bUO = new C8865bKl();
            } else if (signData instanceof MessageSignData) {
                c9372bUO = new C8857bKd();
            } else if (signData instanceof CosmosContractSignDirectData) {
                c9372bUO = new C8784bJJ();
            } else {
                if (!(signData instanceof CosmosContractSignMessageData)) {
                    return AEQbTJ("cosmos", signData);
                }
                c9372bUO = new C8745bIX();
            }
        } else if (c10854bwM.ixgjPv()) {
            if (signData instanceof TransferSignData) {
                c9372bUO = new C11812cbD();
            } else if (signData instanceof MessageSignData) {
                c9372bUO = new C11813cbE();
            } else {
                if (!(signData instanceof ContractSignData)) {
                    return AEQbTJ("sui", signData);
                }
                c9372bUO = new C11846cbl();
            }
        } else if (c10854bwM.Dmq()) {
            if (signData instanceof TransferSignData) {
                c9372bUO = new C9628bZF();
            } else {
                if (!(signData instanceof ContractSignData)) {
                    return AEQbTJ("stacks", signData);
                }
                c9372bUO = new C9662bZn();
            }
        } else if (c10854bwM.QCjLjM()) {
            if (!(signData instanceof MessageSignData)) {
                return AEQbTJ("nostr", signData);
            }
            c9372bUO = new C9370bUM();
        } else if (c10854bwM.QVsKAR()) {
            if (!(signData instanceof TransferSignData)) {
                return AEQbTJ("near", signData);
            }
            c9372bUO = new C9404bUu();
        } else if (c10854bwM.getPostValueLengthLimit()) {
            if (!(signData instanceof TransferSignData)) {
                return AEQbTJ("eos", signData);
            }
            c9372bUO = new C8851bKX();
        } else if (c10854bwM.OFhtUX()) {
            if (signData instanceof TransferSignData) {
                c9372bUO = new C9318bTN();
            } else {
                if (!(signData instanceof MessageSignData)) {
                    return AEQbTJ("kaspa", signData);
                }
                c9372bUO = new C9319bTO();
            }
        } else if (c10854bwM.hCLrkq()) {
            if (signData instanceof TransferSignData) {
                c9372bUO = new C12426cmi();
            } else {
                if (!(signData instanceof ZKSyncRegisterSignData)) {
                    return AEQbTJ("zksync", signData);
                }
                c9372bUO = new C12355clQ();
            }
        } else if (c10854bwM.DGOPHZ()) {
            if (signData instanceof MultiTransferSignData) {
                c9372bUO = new C11892cce();
            } else if (signData instanceof TransferSignData) {
                c9372bUO = new C11945cde();
            } else if (signData instanceof MessageSignData) {
                c9372bUO = new C11886ccY();
            } else {
                if (!(signData instanceof ContractSignData)) {
                    return AEQbTJ("ton", signData);
                }
                c9372bUO = new C11865ccD();
            }
        } else if (c10854bwM.UlJrfe()) {
            if (signData instanceof TransferSignData) {
                c9372bUO = new C9443bVg();
            } else {
                if (!(signData instanceof PiRegisterSignData)) {
                    return AEQbTJ("pi", signData);
                }
                c9372bUO = new C9372bUO();
            }
        } else {
            AbstractC58260yxt<kotlin.Pair<OKWBaseTransaction<?>, java.lang.String>> abstractC58260yxtCopydefault2 = AbstractC58260yxt.copydefault(C56390yDp.OLrzqt(null, C10857bwP.AEQbTJ("TransactionManager", c10854bwM.AhwBna() + " chainId not found")));
            Intrinsics.checkNotNullExpressionValue(abstractC58260yxtCopydefault2, "");
            return abstractC58260yxtCopydefault2;
        }
        Intrinsics.copydefault(signDataArgs, "");
        if (!c9372bUO.KWHzl(abstractC12782ctV, c10854bwM, signDataArgs)) {
            AbstractC58260yxt<kotlin.Pair<OKWBaseTransaction<?>, java.lang.String>> abstractC58260yxtCopydefault3 = AbstractC58260yxt.copydefault(C56390yDp.OLrzqt(null, C10857bwP.AEQbTJ("TransactionManager", "init failed")));
            Intrinsics.checkNotNullExpressionValue(abstractC58260yxtCopydefault3, "");
            return abstractC58260yxtCopydefault3;
        }
        AbstractC58260yxt<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58260yxtValueOf = c9372bUO.s_().valueOf();
        final Function1 function1 = new Function1() { // from class: o.bCn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C8396bBt.AEQbTJ(c9372bUO, (kotlin.Pair) obj);
            }
        };
        AbstractC58260yxt abstractC58260yxtCopydefault4 = abstractC58260yxtValueOf.copydefault(new InterfaceC58229yxO() { // from class: o.bCz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C8396bBt.AwvSrB(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtCopydefault4, "");
        return abstractC58260yxtCopydefault4;
    }

    public static final kotlin.Pair AwvSrB(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (kotlin.Pair) function1.invoke(obj);
    }

    public static final kotlin.Pair AEQbTJ(OKWBaseTransaction oKWBaseTransaction, kotlin.Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        if (((java.lang.Boolean) pair.getFirst()).booleanValue()) {
            return C56390yDp.OLrzqt(oKWBaseTransaction, null);
        }
        return C56390yDp.OLrzqt(null, pair.getSecond());
    }

    public final AbstractC58260yxt<kotlin.Pair<OKWBaseTransaction<?>, java.lang.String>> AEQbTJ(java.lang.String str, BaseSignData baseSignData) {
        AbstractC58260yxt<kotlin.Pair<OKWBaseTransaction<?>, java.lang.String>> abstractC58260yxtCopydefault = AbstractC58260yxt.copydefault(C56390yDp.OLrzqt(null, C10857bwP.AEQbTJ("TransactionManager", str + " not support " + baseSignData.getClass().getSimpleName())));
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtCopydefault, "");
        return abstractC58260yxtCopydefault;
    }

    @Override // o.InterfaceC9740bbL
    public java.lang.String EZpvd(@NotNull InterfaceC9734bbF interfaceC9734bbF) {
        Intrinsics.checkNotNullParameter(interfaceC9734bbF, "");
        return C17946fYd.AEQbTJ.KWHzl(((C8410bCG) interfaceC9734bbF).fIwbmz());
    }

    @Override // o.InterfaceC9740bbL
    public C9746bbR AEQbTJ(android.content.Context context, @NotNull InterfaceC9752bbX interfaceC9752bbX) {
        Intrinsics.checkNotNullParameter(interfaceC9752bbX, "");
        C17946fYd c17946fYd = C17946fYd.AEQbTJ;
        return c17946fYd.KWHzl(context, c17946fYd.EZpvd(interfaceC9752bbX), interfaceC9752bbX.KWHzl(), interfaceC9752bbX.AhwBna());
    }

    @Override // o.InterfaceC9740bbL
    public java.lang.CharSequence copydefault(@NotNull android.content.Context context, @NotNull AbstractC9832bcy abstractC9832bcy, @NotNull InterfaceC9734bbF interfaceC9734bbF) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(abstractC9832bcy, "");
        Intrinsics.checkNotNullParameter(interfaceC9734bbF, "");
        return C17946fYd.AEQbTJ.EZpvd(context, abstractC9832bcy, interfaceC9734bbF);
    }

    @Override // o.InterfaceC9740bbL
    public void OLrzqt(@NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull InterfaceC9734bbF interfaceC9734bbF, Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(interfaceC9734bbF, "");
        OKWBaseTransaction<?> oKWBaseTransactionFIwbmz = ((C8410bCG) interfaceC9734bbF).fIwbmz();
        AbstractC8564bFB<?, ?> abstractC8564bFB = oKWBaseTransactionFIwbmz instanceof AbstractC8564bFB ? (AbstractC8564bFB) oKWBaseTransactionFIwbmz : null;
        if (abstractC8564bFB == null) {
            return;
        }
        OLrzqt(fragmentManager, abstractC8564bFB, function0);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.bBt */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void openTransactionFeePage$default(C8396bBt c8396bBt, androidx.fragment.app.FragmentManager fragmentManager, AbstractC8564bFB abstractC8564bFB, Function0 function0, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            function0 = null;
        }
        c8396bBt.OLrzqt(fragmentManager, (AbstractC8564bFB<?, ?>) abstractC8564bFB, (Function0<Unit>) function0);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: o.bFB<?, ?> */
    /* JADX WARN: Multi-variable type inference failed */
    public final void OLrzqt(@NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull AbstractC8564bFB<?, ?> abstractC8564bFB, final Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(abstractC8564bFB, "");
        if (abstractC8564bFB instanceof InterfaceC9041bOB) {
            C21281gwm c21281gwmEZpvd = C21281gwm.Companion.EZpvd((InterfaceC9041bOB) abstractC8564bFB);
            c21281gwmEZpvd.KWHzl(new AbstractDialogInterfaceOnKeyListenerC57208yeA.Activity() { // from class: o.bBy
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.AbstractDialogInterfaceOnKeyListenerC57208yeA.Activity
                public final void copydefault(android.os.Bundle bundle) {
                    C8396bBt.EZpvd(function0, bundle);
                }
            });
            c21281gwmEZpvd.show(fragmentManager, "javaClass");
        } else {
            if (abstractC8564bFB instanceof C9615bYt) {
                C21293gwy.Companion.OLrzqt().EZpvd(fragmentManager, "SolanaTransferNetworkFeeFragment", new AbstractDialogInterfaceOnKeyListenerC57208yeA.Activity() { // from class: o.bBz
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // o.AbstractDialogInterfaceOnKeyListenerC57208yeA.Activity
                    public final void copydefault(android.os.Bundle bundle) {
                        C8396bBt.KWHzl(function0, bundle);
                    }
                });
                return;
            }
            AbstractC8426bCW abstractC8426bCWQKudOq = abstractC8564bFB.QKudOq();
            AbstractC8485bDc<?> abstractC8485bDc = abstractC8426bCWQKudOq instanceof AbstractC8485bDc ? (AbstractC8485bDc) abstractC8426bCWQKudOq : null;
            if (abstractC8485bDc == null) {
                return;
            }
            AbstractViewOnClickListenerC21247gwE.Companion.EZpvd(abstractC8485bDc).copydefault(fragmentManager, "NetworkFeeFragment", new AbstractDialogInterfaceOnKeyListenerC57208yeA.Activity() { // from class: o.bBD
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.AbstractDialogInterfaceOnKeyListenerC57208yeA.Activity
                public final void copydefault(android.os.Bundle bundle) {
                    C8396bBt.djBIcL(function0, bundle);
                }
            });
        }
    }

    public static final void EZpvd(Function0 function0, android.os.Bundle bundle) {
        if (function0 != null) {
            function0.invoke();
        }
    }

    public static final void KWHzl(Function0 function0, android.os.Bundle bundle) {
        if (function0 != null) {
            function0.invoke();
        }
    }

    public static final void djBIcL(Function0 function0, android.os.Bundle bundle) {
        if (function0 != null) {
            function0.invoke();
        }
    }

    @Override // o.InterfaceC9740bbL
    public void EZpvd(@NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull InterfaceC9730bbB interfaceC9730bbB, final Function1<? super android.os.Bundle, Unit> function1) {
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(interfaceC9730bbB, "");
        boolean z = interfaceC9730bbB instanceof C8410bCG;
        java.lang.Object objFIwbmz = interfaceC9730bbB;
        if (z) {
            objFIwbmz = ((C8410bCG) interfaceC9730bbB).fIwbmz();
        }
        if (objFIwbmz instanceof C9100bPH) {
            if (C33129mqd.AEQbTJ(java.lang.Integer.valueOf(((C9100bPH) objFIwbmz).djBIcL()), 1)) {
                C18448fib c18448fibEZpvd = C18448fib.Companion.EZpvd((InterfaceC9736bbH) objFIwbmz);
                c18448fibEZpvd.KWHzl(new AbstractDialogInterfaceOnKeyListenerC57208yeA.Activity() { // from class: o.bCk
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // o.AbstractDialogInterfaceOnKeyListenerC57208yeA.Activity
                    public final void copydefault(android.os.Bundle bundle) {
                        C8396bBt.EZpvd(function1, bundle);
                    }
                });
                c18448fibEZpvd.show(fragmentManager, "javaClass");
                return;
            } else {
                C18450fid c18450fidAEQbTJ = C18450fid.Companion.AEQbTJ((InterfaceC9736bbH) objFIwbmz, true);
                c18450fidAEQbTJ.KWHzl(new AbstractDialogInterfaceOnKeyListenerC57208yeA.Activity() { // from class: o.bCj
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // o.AbstractDialogInterfaceOnKeyListenerC57208yeA.Activity
                    public final void copydefault(android.os.Bundle bundle) {
                        C8396bBt.OLrzqt(function1, bundle);
                    }
                });
                c18450fidAEQbTJ.show(fragmentManager, "javaClass");
                return;
            }
        }
        C18450fid.Activity activity = C18450fid.Companion;
        Intrinsics.copydefault(objFIwbmz, "");
        C18450fid c18450fidEZpvd = activity.EZpvd((InterfaceC9730bbB) objFIwbmz, false);
        c18450fidEZpvd.KWHzl(new AbstractDialogInterfaceOnKeyListenerC57208yeA.Activity() { // from class: o.bCh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.AbstractDialogInterfaceOnKeyListenerC57208yeA.Activity
            public final void copydefault(android.os.Bundle bundle) {
                C8396bBt.gEmmrt(function1, bundle);
            }
        });
        c18450fidEZpvd.show(fragmentManager, "javaClass");
    }

    public static final void EZpvd(Function1 function1, android.os.Bundle bundle) {
        if (function1 != null) {
            function1.invoke(bundle);
        }
    }

    public static final void OLrzqt(Function1 function1, android.os.Bundle bundle) {
        if (function1 != null) {
            function1.invoke(bundle);
        }
    }

    public static final void gEmmrt(Function1 function1, android.os.Bundle bundle) {
        if (function1 != null) {
            function1.invoke(bundle);
        }
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.gda.TaskDescription.getIntent$default(o.gda$TaskDescription, android.content.Context, com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction, int, com.okinc.business.defi.wallet.transaction.moduleModel.bean.TitleModuleModel, boolean, int, java.lang.Object):android.content.Intent */
    @Override // o.InterfaceC9740bbL
    public void AEQbTJ(@NotNull FragmentActivity fragmentActivity, @NotNull InterfaceC9730bbB interfaceC9730bbB, int i, final Function1<? super java.lang.Boolean, Unit> function1) {
        Intrinsics.checkNotNullParameter(fragmentActivity, "");
        Intrinsics.checkNotNullParameter(interfaceC9730bbB, "");
        boolean z = interfaceC9730bbB instanceof C8410bCG;
        java.lang.Object objFIwbmz = interfaceC9730bbB;
        if (z) {
            objFIwbmz = ((C8410bCG) interfaceC9730bbB).fIwbmz();
        }
        C9694baS.Application application = C9694baS.Companion;
        ActivityC20262gda.TaskDescription taskDescription = ActivityC20262gda.Companion;
        Intrinsics.copydefault(objFIwbmz, "");
        application.AEQbTJ(fragmentActivity, ActivityC20262gda.TaskDescription.getIntent$default(taskDescription, fragmentActivity, (OKWBaseTransaction) objFIwbmz, i, null, false, 8, null), new Function2() { // from class: o.bCp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C8396bBt.EZpvd(function1, ((java.lang.Integer) obj).intValue(), (android.content.Intent) obj2);
            }
        });
    }

    public static final Unit EZpvd(Function1 function1, int i, android.content.Intent intent) {
        if (function1 != null) {
            function1.invoke(java.lang.Boolean.valueOf(i == -1));
        }
        return Unit.INSTANCE;
    }

    @Override // o.InterfaceC9740bbL
    public AbstractC58260yxt<ResponseData<C9748bbT>> copydefault(@NotNull FragmentActivity fragmentActivity, @NotNull InterfaceC9734bbF interfaceC9734bbF, @NotNull InterfaceC9740bbL.TaskDescription taskDescription) {
        Intrinsics.checkNotNullParameter(fragmentActivity, "");
        Intrinsics.checkNotNullParameter(interfaceC9734bbF, "");
        Intrinsics.checkNotNullParameter(taskDescription, "");
        return KWHzl(fragmentActivity, ((C8410bCG) interfaceC9734bbF).fIwbmz(), taskDescription);
    }

    @Override // o.InterfaceC9740bbL
    public AbstractC58260yxt<ResponseData<C9748bbT>> copydefault(@NotNull FragmentActivity fragmentActivity, @NotNull InterfaceC9734bbF interfaceC9734bbF, @NotNull InterfaceC9740bbL.TaskDescription taskDescription, boolean z) {
        Intrinsics.checkNotNullParameter(fragmentActivity, "");
        Intrinsics.checkNotNullParameter(interfaceC9734bbF, "");
        Intrinsics.checkNotNullParameter(taskDescription, "");
        return EZpvd(fragmentActivity, ((C8410bCG) interfaceC9734bbF).fIwbmz(), false, false, false, z && Intrinsics.EZpvd(((InterfaceC9855bdU) C43251rlk.copydefault(InterfaceC9855bdU.class)).copydefault(), InterfaceC9759bbe.StateListAnimator.OLrzqt), taskDescription);
    }

    public final AbstractC58260yxt<ResponseData<C9748bbT>> KWHzl(@NotNull FragmentActivity fragmentActivity, @NotNull OKWBaseTransaction<?> oKWBaseTransaction, @NotNull InterfaceC9740bbL.TaskDescription taskDescription) {
        Intrinsics.checkNotNullParameter(fragmentActivity, "");
        Intrinsics.checkNotNullParameter(oKWBaseTransaction, "");
        Intrinsics.checkNotNullParameter(taskDescription, "");
        return submitWithIgnoreCondition$default(this, fragmentActivity, oKWBaseTransaction, false, false, false, false, taskDescription, 32, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.InterfaceC9740bbL
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public <T extends AbstractC9836bdB> java.lang.Object EZpvd(@NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull InterfaceC9738bbJ interfaceC9738bbJ, @NotNull java.util.List<? extends T> list, boolean z, @NotNull Continuation<? super Result<C9843bdI<T>>> continuation) throws java.lang.Throwable {
        TransactionManager$signTransactions$1 transactionManager$signTransactions$1;
        if (continuation instanceof TransactionManager$signTransactions$1) {
            transactionManager$signTransactions$1 = (TransactionManager$signTransactions$1) continuation;
            int i = transactionManager$signTransactions$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                transactionManager$signTransactions$1.label = i - Integer.MIN_VALUE;
            } else {
                transactionManager$signTransactions$1 = new TransactionManager$signTransactions$1(this, continuation);
            }
        }
        TransactionManager$signTransactions$1 transactionManager$signTransactions$12 = transactionManager$signTransactions$1;
        java.lang.Object obj = transactionManager$signTransactions$12.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = transactionManager$signTransactions$12.label;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            return ((Result) obj).m7386unboximpl();
        }
        C56391yDq.AEQbTJ(obj);
        boolean z2 = z && Intrinsics.EZpvd(((InterfaceC9855bdU) C43251rlk.copydefault(InterfaceC9855bdU.class)).copydefault(), InterfaceC9759bbe.StateListAnimator.OLrzqt);
        C8398bBv c8398bBv = new C8398bBv();
        transactionManager$signTransactions$12.label = 1;
        java.lang.Object objEZpvd = c8398bBv.EZpvd(fragmentManager, interfaceC9738bbJ, list, z2, transactionManager$signTransactions$12);
        return objEZpvd == objCopydefault ? objCopydefault : objEZpvd;
    }

    public static /* synthetic */ AbstractC58260yxt submitWithIgnoreCondition$default(C8396bBt c8396bBt, FragmentActivity fragmentActivity, OKWBaseTransaction oKWBaseTransaction, boolean z, boolean z2, boolean z3, boolean z4, InterfaceC9740bbL.TaskDescription taskDescription, int i, java.lang.Object obj) {
        return c8396bBt.EZpvd(fragmentActivity, (OKWBaseTransaction<?>) oKWBaseTransaction, z, z2, z3, (i & 32) != 0 ? false : z4, taskDescription);
    }

    public final AbstractC58260yxt<ResponseData<C9748bbT>> EZpvd(@NotNull final FragmentActivity fragmentActivity, @NotNull final OKWBaseTransaction<?> oKWBaseTransaction, final boolean z, final boolean z2, final boolean z3, final boolean z4, @NotNull final InterfaceC9740bbL.TaskDescription taskDescription) {
        AbstractC58260yxt abstractC58260yxtCopydefault;
        Intrinsics.checkNotNullParameter(fragmentActivity, "");
        Intrinsics.checkNotNullParameter(oKWBaseTransaction, "");
        Intrinsics.checkNotNullParameter(taskDescription, "");
        taskDescription.copydefault();
        final AbstractC8564bFB abstractC8564bFB = oKWBaseTransaction instanceof AbstractC8564bFB ? (AbstractC8564bFB) oKWBaseTransaction : null;
        if (abstractC8564bFB != null) {
            abstractC8564bFB.accept();
        }
        final AbstractC12782ctV abstractC12782ctVDUDNAs = oKWBaseTransaction.dUDNAs();
        if (abstractC12782ctVDUDNAs.ORxRYg() || abstractC12782ctVDUDNAs.wlaJM()) {
            AbstractC58260yxt<java.lang.Boolean> abstractC58260yxtValueOf = C15691eRs.AEQbTJ.copydefault(abstractC12782ctVDUDNAs, fragmentActivity, fragmentActivity).valueOf();
            final Function1 function1 = new Function1() { // from class: o.bBK
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C8396bBt.EZpvd((java.lang.Boolean) obj);
                }
            };
            abstractC58260yxtCopydefault = abstractC58260yxtValueOf.copydefault(new InterfaceC58229yxO() { // from class: o.bBJ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58229yxO
                public final java.lang.Object apply(java.lang.Object obj) {
                    return C8396bBt.zuBGHE(function1, obj);
                }
            });
        } else {
            abstractC58260yxtCopydefault = AbstractC58260yxt.copydefault(java.lang.Boolean.TRUE);
        }
        final Function1 function12 = new Function1() { // from class: o.bBP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C8396bBt.EZpvd(abstractC12782ctVDUDNAs, oKWBaseTransaction, fragmentActivity, (java.lang.Boolean) obj);
            }
        };
        AbstractC58260yxt abstractC58260yxtOLrzqt = abstractC58260yxtCopydefault.OLrzqt(new InterfaceC58229yxO() { // from class: o.bBM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C8396bBt.QKVWgx(function12, obj);
            }
        });
        final Function1 function13 = new Function1() { // from class: o.bBQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C8396bBt.AEQbTJ(fragmentActivity, oKWBaseTransaction, z, z2, z3, z4, taskDescription, (java.lang.Boolean) obj);
            }
        };
        AbstractC58260yxt abstractC58260yxtOLrzqt2 = abstractC58260yxtOLrzqt.OLrzqt(new InterfaceC58229yxO() { // from class: o.bBO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C8396bBt.OcIXYQ(function13, obj);
            }
        });
        final Function1 function14 = new Function1() { // from class: o.bBN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C8396bBt.KWHzl(abstractC8564bFB, (ResponseData) obj);
            }
        };
        AbstractC58260yxt abstractC58260yxtKWHzl = abstractC58260yxtOLrzqt2.KWHzl(new InterfaceC58227yxM() { // from class: o.bBT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C8396bBt.ORxRYg(function14, obj);
            }
        });
        final Function1 function15 = new Function1() { // from class: o.bBU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C8396bBt.AEQbTJ(abstractC8564bFB, (java.lang.Throwable) obj);
            }
        };
        AbstractC58260yxt<ResponseData<C9748bbT>> abstractC58260yxtOLrzqt3 = abstractC58260yxtKWHzl.OLrzqt(new InterfaceC58227yxM() { // from class: o.bBV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C8396bBt.QOLQEE(function15, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtOLrzqt3, "");
        return abstractC58260yxtOLrzqt3;
    }

    public static final java.lang.Boolean EZpvd(java.lang.Boolean bool) {
        Intrinsics.checkNotNullParameter(bool, "");
        return java.lang.Boolean.valueOf(!bool.booleanValue());
    }

    public static final java.lang.Boolean zuBGHE(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (java.lang.Boolean) function1.invoke(obj);
    }

    public static final InterfaceC58261yxu QKVWgx(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC58261yxu) function1.invoke(obj);
    }

    public static final InterfaceC58261yxu EZpvd(AbstractC12782ctV abstractC12782ctV, final OKWBaseTransaction oKWBaseTransaction, final FragmentActivity fragmentActivity, java.lang.Boolean bool) {
        Intrinsics.checkNotNullParameter(bool, "");
        if (bool.booleanValue()) {
            if (abstractC12782ctV.getFieldNames()) {
                long jFetchVPNInfo = oKWBaseTransaction.dHguZz().fetchVPNInfo();
                AbstractC58260yxt<AAStatus> abstractC58260yxtValueOf = fNC.OLrzqt.KWHzl(abstractC12782ctV.DbNXlk(), abstractC12782ctV.EZpvd(jFetchVPNInfo), java.lang.Long.valueOf(jFetchVPNInfo)).valueOf();
                final Function1 function1 = new Function1() { // from class: o.bCc
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C8396bBt.EZpvd(fragmentActivity, (AAStatus) obj);
                    }
                };
                AbstractC58260yxt<R> abstractC58260yxtCopydefault = abstractC58260yxtValueOf.copydefault(new InterfaceC58229yxO() { // from class: o.bCe
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // o.InterfaceC58229yxO
                    public final java.lang.Object apply(java.lang.Object obj) {
                        return C8396bBt.sSMYrx(function1, obj);
                    }
                });
                final Function1 function12 = new Function1() { // from class: o.bCb
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C8396bBt.copydefault(fragmentActivity, oKWBaseTransaction, (java.lang.Boolean) obj);
                    }
                };
                return abstractC58260yxtCopydefault.OLrzqt((InterfaceC58229yxO<? super R, ? extends InterfaceC58261yxu<? extends R>>) new InterfaceC58229yxO() { // from class: o.bCf
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // o.InterfaceC58229yxO
                    public final java.lang.Object apply(java.lang.Object obj) {
                        return C8396bBt.DTwDnp(function12, obj);
                    }
                });
            }
            return AbstractC58260yxt.copydefault(java.lang.Boolean.TRUE);
        }
        return AbstractC58260yxt.copydefault(java.lang.Boolean.FALSE);
    }

    public static final java.lang.Boolean sSMYrx(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (java.lang.Boolean) function1.invoke(obj);
    }

    public static final java.lang.Boolean EZpvd(FragmentActivity fragmentActivity, AAStatus aAStatus) {
        boolean z;
        Intrinsics.checkNotNullParameter(aAStatus, "");
        if (aAStatus == AAStatus.Normal) {
            z = true;
        } else {
            fPH.showOwnerCheckFailedDialog$default(fPH.OLrzqt, fragmentActivity, aAStatus, 1, null, 8, null);
            z = false;
        }
        return java.lang.Boolean.valueOf(z);
    }

    public static final InterfaceC58261yxu DTwDnp(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC58261yxu) function1.invoke(obj);
    }

    public static final InterfaceC58261yxu copydefault(FragmentActivity fragmentActivity, OKWBaseTransaction oKWBaseTransaction, java.lang.Boolean bool) {
        Intrinsics.checkNotNullParameter(bool, "");
        if (bool.booleanValue()) {
            fPF fpf = fPF.OLrzqt;
            androidx.fragment.app.FragmentManager supportFragmentManager = fragmentActivity.getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
            return fpf.OLrzqt(supportFragmentManager, oKWBaseTransaction);
        }
        AbstractC58260yxt abstractC58260yxtCopydefault = AbstractC58260yxt.copydefault(bool);
        Intrinsics.copydefault(abstractC58260yxtCopydefault);
        return abstractC58260yxtCopydefault;
    }

    public static final InterfaceC58261yxu OcIXYQ(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC58261yxu) function1.invoke(obj);
    }

    public static final InterfaceC58261yxu AEQbTJ(FragmentActivity fragmentActivity, OKWBaseTransaction oKWBaseTransaction, boolean z, boolean z2, boolean z3, boolean z4, InterfaceC9740bbL.TaskDescription taskDescription, java.lang.Boolean bool) {
        Intrinsics.checkNotNullParameter(bool, "");
        if (bool.booleanValue()) {
            return AEQbTJ.copydefault(fragmentActivity, (OKWBaseTransaction<?>) oKWBaseTransaction, z, z2, z3, z4, taskDescription);
        }
        taskDescription.EZpvd();
        AbstractC58260yxt abstractC58260yxtCopydefault = AbstractC58260yxt.copydefault(new ResponseData(-5007, null, null, null, null, null, 62, null));
        Intrinsics.copydefault(abstractC58260yxtCopydefault);
        return abstractC58260yxtCopydefault;
    }

    public static final void ORxRYg(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit KWHzl(AbstractC8564bFB abstractC8564bFB, ResponseData responseData) {
        if (responseData.getCode() != -5001 && abstractC8564bFB != null) {
            abstractC8564bFB.OBJEWx();
        }
        return Unit.INSTANCE;
    }

    public static final void QOLQEE(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AEQbTJ(AbstractC8564bFB abstractC8564bFB, java.lang.Throwable th) {
        if (abstractC8564bFB != null) {
            abstractC8564bFB.OBJEWx();
        }
        return Unit.INSTANCE;
    }

    public final AbstractC58260yxt<ResponseData<C9748bbT>> copydefault(final FragmentActivity fragmentActivity, final OKWBaseTransaction<?> oKWBaseTransaction, boolean z, final boolean z2, final boolean z3, final boolean z4, final InterfaceC9740bbL.TaskDescription taskDescription) {
        AbstractC58260yxt<java.util.List<TxToastCheckRes>> abstractC58260yxtCopydefault;
        if (z) {
            return OLrzqt(fragmentActivity, oKWBaseTransaction, z2, z3, z4, taskDescription);
        }
        if (oKWBaseTransaction instanceof AbstractC8564bFB) {
            abstractC58260yxtCopydefault = ((AbstractC8564bFB) oKWBaseTransaction).QSBOWP().valueOf();
        } else {
            abstractC58260yxtCopydefault = AbstractC58260yxt.copydefault(yDY.AhwBna());
        }
        final Function1 function1 = new Function1() { // from class: o.bCx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C8396bBt.OLrzqt(taskDescription, fragmentActivity, oKWBaseTransaction, z2, z3, z4, (java.util.List) obj);
            }
        };
        AbstractC58260yxt<ResponseData<C9748bbT>> abstractC58260yxtOLrzqt = abstractC58260yxtCopydefault.OLrzqt((InterfaceC58229yxO<? super java.util.List<TxToastCheckRes>, ? extends InterfaceC58261yxu<? extends R>>) new InterfaceC58229yxO() { // from class: o.bCy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C8396bBt.QUSxYX(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtOLrzqt, "");
        return abstractC58260yxtOLrzqt;
    }

    public static final InterfaceC58261yxu QUSxYX(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC58261yxu) function1.invoke(obj);
    }

    public static final InterfaceC58261yxu OLrzqt(final InterfaceC9740bbL.TaskDescription taskDescription, final FragmentActivity fragmentActivity, final OKWBaseTransaction oKWBaseTransaction, final boolean z, final boolean z2, final boolean z3, final java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        return AbstractC58260yxt.OLrzqt(new InterfaceC58259yxs() { // from class: o.bCi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58259yxs
            public final void subscribe(InterfaceC58257yxq interfaceC58257yxq) {
                C8396bBt.EZpvd(list, taskDescription, fragmentActivity, oKWBaseTransaction, z, z2, z3, interfaceC58257yxq);
            }
        });
    }

    /* JADX DEBUG: Class process forced to load method for inline: com.okinc.business.defi.common.TxToastCheckHelper.startCheck$default(com.okinc.business.defi.common.TxToastCheckHelper, boolean, int, java.lang.Object):void */
    public static final void EZpvd(java.util.List list, final InterfaceC9740bbL.TaskDescription taskDescription, final FragmentActivity fragmentActivity, final OKWBaseTransaction oKWBaseTransaction, final boolean z, final boolean z2, final boolean z3, final InterfaceC58257yxq interfaceC58257yxq) {
        java.lang.Object next;
        Intrinsics.checkNotNullParameter(interfaceC58257yxq, "");
        final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        Intrinsics.copydefault(list);
        java.util.Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (!Intrinsics.EZpvd(((TxToastCheckRes) next).getResult(), java.lang.Boolean.TRUE)) {
                    break;
                }
            }
        }
        if (next != null) {
            taskDescription.EZpvd();
            booleanRef.element = true;
        }
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        final Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
        androidx.fragment.app.FragmentManager supportFragmentManager = fragmentActivity.getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
        java.lang.String address = oKWBaseTransaction.fERRXa().getAddress();
        AbstractC8564bFB abstractC8564bFB = oKWBaseTransaction instanceof AbstractC8564bFB ? (AbstractC8564bFB) oKWBaseTransaction : null;
        java.lang.String strZLjUOn = abstractC8564bFB != null ? abstractC8564bFB.zLjUOn() : null;
        TxToastCheckHelper.startCheck$default(new TxToastCheckHelper(fragmentActivity, supportFragmentManager, new TxToastCheckHelper.StateListAnimator(address, strZLjUOn != null ? strZLjUOn : "", oKWBaseTransaction.dHguZz(), oKWBaseTransaction.aUsmxb().isTransfer()), list, new yHO() { // from class: o.bCu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.yHO
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return C8396bBt.OLrzqt(objectRef2, oKWBaseTransaction, objectRef, fragmentActivity, interfaceC58257yxq, booleanRef, taskDescription, z, z2, z3, (TxToastCheckRes) obj, (java.lang.Boolean) obj2, (java.lang.Boolean) obj3);
            }
        }), false, 1, null);
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.bhC.ActionBar.startActivity$default(o.bhC$ActionBar, android.content.Context, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, long, java.lang.String, boolean, java.lang.String, int, java.lang.Object):void */
    /* JADX DEBUG: Multi-variable search result rejected for r0v22, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r23v0, resolved type: com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction */
    /* JADX DEBUG: Multi-variable search result rejected for r2v8, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v9, types: [T, com.okinc.business.defi.biz.core.tx.wallet.TxReplaceSendInfo] */
    public static final Unit OLrzqt(Ref.ObjectRef objectRef, OKWBaseTransaction oKWBaseTransaction, Ref.ObjectRef objectRef2, FragmentActivity fragmentActivity, InterfaceC58257yxq interfaceC58257yxq, Ref.BooleanRef booleanRef, InterfaceC9740bbL.TaskDescription taskDescription, boolean z, boolean z2, boolean z3, TxToastCheckRes txToastCheckRes, java.lang.Boolean bool, java.lang.Boolean bool2) {
        InterfaceC8931bLy interfaceC8931bLy;
        java.lang.Integer checkType = txToastCheckRes != null ? txToastCheckRes.getCheckType() : null;
        if (checkType == null) {
            if (Intrinsics.EZpvd(bool, java.lang.Boolean.TRUE)) {
                T t = objectRef.element;
                if (t == 0) {
                    InterfaceC8931bLy interfaceC8931bLy2 = oKWBaseTransaction instanceof InterfaceC8931bLy ? (InterfaceC8931bLy) oKWBaseTransaction : null;
                    if (interfaceC8931bLy2 != null) {
                        interfaceC8931bLy2.copydefault((java.lang.String) objectRef2.element, null, null);
                    }
                    copydefault(booleanRef, taskDescription, fragmentActivity, oKWBaseTransaction, z, z2, z3, interfaceC58257yxq);
                } else {
                    ViewOnClickListenerC21214gvY.TaskDescription taskDescription2 = ViewOnClickListenerC21214gvY.Companion;
                    Intrinsics.copydefault(t);
                    ViewOnClickListenerC21214gvY viewOnClickListenerC21214gvYKWHzl = taskDescription2.KWHzl((TxReplaceSendInfo) t);
                    androidx.fragment.app.FragmentManager supportFragmentManager = fragmentActivity.getSupportFragmentManager();
                    Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
                    viewOnClickListenerC21214gvYKWHzl.EZpvd(supportFragmentManager, "TxReplaceDialogFragment", new ActionBar(interfaceC58257yxq, oKWBaseTransaction, objectRef, objectRef2, booleanRef, taskDescription, fragmentActivity, z, z2, z3));
                }
            } else {
                interfaceC58257yxq.onSuccess(new ResponseData(-5007, null, null, null, null, null, 62, null));
            }
        } else if (checkType.intValue() == 4) {
            if (Intrinsics.EZpvd(bool, java.lang.Boolean.FALSE)) {
                ActivityC10049bhC.ActionBar actionBar = ActivityC10049bhC.Companion;
                java.lang.String txId = txToastCheckRes.getTxId();
                java.lang.String str = txId == null ? "" : txId;
                java.lang.String txhash = txToastCheckRes.getTxhash();
                java.lang.String str2 = txhash == null ? "" : txhash;
                java.lang.String address = oKWBaseTransaction.fERRXa().getAddress();
                java.lang.String strDbNXlk = oKWBaseTransaction.dUDNAs().DbNXlk();
                long jAhwBna = oKWBaseTransaction.dHguZz().AhwBna();
                java.lang.String orderId = txToastCheckRes.getOrderId();
                java.lang.String str3 = orderId == null ? "" : orderId;
                java.lang.String orderType = txToastCheckRes.getOrderType();
                actionBar.KWHzl(fragmentActivity, (1544 & 2) != 0 ? "" : str, (1544 & 4) != 0 ? "" : str2, (1544 & 8) != 0 ? "" : null, address, strDbNXlk, str3, (1544 & 128) != 0 ? 0L : jAhwBna, orderType == null ? "" : orderType, (1544 & 512) != 0 ? false : false, (1544 & 1024) != 0 ? "" : null);
            }
        } else if (checkType.intValue() == 5) {
            java.lang.Boolean bool3 = java.lang.Boolean.TRUE;
            if (Intrinsics.EZpvd(bool, bool3)) {
                if (Intrinsics.EZpvd(bool2, bool3)) {
                    objectRef2.element = txToastCheckRes.getTxhash();
                    interfaceC8931bLy = oKWBaseTransaction instanceof InterfaceC8931bLy ? (InterfaceC8931bLy) oKWBaseTransaction : null;
                    if (interfaceC8931bLy != null) {
                        interfaceC8931bLy.valueOf(txToastCheckRes.getNonce());
                    }
                    objectRef.element = copydefault((OKWBaseTransaction<?>) oKWBaseTransaction, txToastCheckRes.getPriorityFee(), txToastCheckRes.getGasPrice());
                } else {
                    interfaceC8931bLy = oKWBaseTransaction instanceof InterfaceC8931bLy ? (InterfaceC8931bLy) oKWBaseTransaction : null;
                    if (interfaceC8931bLy != null) {
                        interfaceC8931bLy.valueOf(txToastCheckRes.getNewNonce());
                    }
                }
            }
        }
        return Unit.INSTANCE;
    }

    public static final void copydefault(Ref.BooleanRef booleanRef, InterfaceC9740bbL.TaskDescription taskDescription, FragmentActivity fragmentActivity, OKWBaseTransaction<?> oKWBaseTransaction, boolean z, boolean z2, boolean z3, final InterfaceC58257yxq<ResponseData<C9748bbT>> interfaceC58257yxq) {
        if (booleanRef.element) {
            taskDescription.copydefault();
        }
        AbstractC58260yxt<ResponseData<C9748bbT>> abstractC58260yxtOLrzqt = AEQbTJ.OLrzqt(fragmentActivity, oKWBaseTransaction, z, z2, z3, taskDescription);
        final Function1 function1 = new Function1() { // from class: o.bCw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C8396bBt.EZpvd(interfaceC58257yxq, (ResponseData) obj);
            }
        };
        InterfaceC58227yxM<? super ResponseData<C9748bbT>> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.bCC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C8396bBt.RJOkX(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.bCB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C8396bBt.AEQbTJ(interfaceC58257yxq, (java.lang.Throwable) obj);
            }
        };
        interfaceC58257yxq.setDisposable(abstractC58260yxtOLrzqt.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.bCD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C8396bBt.QVAiDq(function12, obj);
            }
        }));
    }

    public static final void RJOkX(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit EZpvd(InterfaceC58257yxq interfaceC58257yxq, ResponseData responseData) {
        interfaceC58257yxq.onSuccess(responseData);
        return Unit.INSTANCE;
    }

    public static final void QVAiDq(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AEQbTJ(InterfaceC58257yxq interfaceC58257yxq, java.lang.Throwable th) {
        interfaceC58257yxq.onError(th);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.bBt$ActionBar */
    public static final class ActionBar implements ViewOnClickListenerC21214gvY.ActionBar {
        public final /* synthetic */ InterfaceC58257yxq<ResponseData<C9748bbT>> AEQbTJ;
        public final /* synthetic */ Ref.ObjectRef<TxReplaceSendInfo> AYXKKw;
        public final /* synthetic */ OKWBaseTransaction<?> AhwBna;
        public final /* synthetic */ InterfaceC9740bbL.TaskDescription EZpvd;
        public final /* synthetic */ FragmentActivity KWHzl;
        public final /* synthetic */ boolean OLrzqt;
        public final /* synthetic */ boolean copydefault;
        public final /* synthetic */ boolean djBIcL;
        public final /* synthetic */ Ref.BooleanRef gEmmrt;
        public final /* synthetic */ Ref.ObjectRef<java.lang.String> valueOf;

        public ActionBar(InterfaceC58257yxq<ResponseData<C9748bbT>> interfaceC58257yxq, OKWBaseTransaction<?> oKWBaseTransaction, Ref.ObjectRef<TxReplaceSendInfo> objectRef, Ref.ObjectRef<java.lang.String> objectRef2, Ref.BooleanRef booleanRef, InterfaceC9740bbL.TaskDescription taskDescription, FragmentActivity fragmentActivity, boolean z, boolean z2, boolean z3) {
            this.AEQbTJ = interfaceC58257yxq;
            this.AhwBna = oKWBaseTransaction;
            this.AYXKKw = objectRef;
            this.valueOf = objectRef2;
            this.gEmmrt = booleanRef;
            this.EZpvd = taskDescription;
            this.KWHzl = fragmentActivity;
            this.OLrzqt = z;
            this.copydefault = z2;
            this.djBIcL = z3;
        }

        @Override // o.ViewOnClickListenerC21214gvY.ActionBar
        public void KWHzl(android.os.Bundle bundle) {
            java.lang.String maxPriorityFee;
            if (bundle == null) {
                this.AEQbTJ.onSuccess(new ResponseData<>(-5014, null, null, null, null, null, 62, null));
                return;
            }
            java.lang.Object obj = this.AhwBna;
            InterfaceC8931bLy interfaceC8931bLy = obj instanceof InterfaceC8931bLy ? (InterfaceC8931bLy) obj : null;
            if (interfaceC8931bLy == null) {
                return;
            }
            if (interfaceC8931bLy.hDKMBd()) {
                TxReplaceSendInfo txReplaceSendInfo = this.AYXKKw.element;
                Intrinsics.copydefault(txReplaceSendInfo);
                maxPriorityFee = txReplaceSendInfo.getMaxPriorityFee();
            } else {
                maxPriorityFee = null;
            }
            java.lang.String str = this.valueOf.element;
            TxReplaceSendInfo txReplaceSendInfo2 = this.AYXKKw.element;
            interfaceC8931bLy.copydefault(str, txReplaceSendInfo2 != null ? txReplaceSendInfo2.getMaxBaseFee() : null, maxPriorityFee);
            C8396bBt.copydefault(this.gEmmrt, this.EZpvd, this.KWHzl, this.AhwBna, this.OLrzqt, this.copydefault, this.djBIcL, this.AEQbTJ);
        }
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.bCW.formatToFeeCoinAmount$default(o.bCW, java.lang.String, boolean, boolean, boolean, int, java.lang.Object):java.lang.String */
    /* JADX DEBUG: Class process forced to load method for inline: o.xYi.weiToGwei$default(java.lang.String, java.lang.Integer, boolean, java.lang.String, boolean, int, java.lang.Object):java.lang.String */
    /* JADX DEBUG: Multi-variable search result rejected for r24v0, resolved type: com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction<?> */
    /* JADX WARN: Multi-variable type inference failed */
    public static final TxReplaceSendInfo copydefault(OKWBaseTransaction<?> oKWBaseTransaction, java.lang.String str, java.lang.String str2) {
        java.lang.String str3;
        java.lang.String strWeiToGwei$default = null;
        AbstractC8564bFB abstractC8564bFB = oKWBaseTransaction instanceof AbstractC8564bFB ? (AbstractC8564bFB) oKWBaseTransaction : null;
        AbstractC8426bCW abstractC8426bCWQKudOq = abstractC8564bFB != null ? abstractC8564bFB.QKudOq() : null;
        C9311bTG c9311bTG = abstractC8426bCWQKudOq instanceof C9311bTG ? (C9311bTG) abstractC8426bCWQKudOq : null;
        if (c9311bTG == null) {
            return null;
        }
        C9215bRQ c9215bRQEZpvd = c9311bTG.KWHzl();
        C9215bRQ c9215bRQ = c9215bRQEZpvd instanceof C9215bRQ ? c9215bRQEZpvd : null;
        if (c9215bRQ == null) {
            return null;
        }
        InterfaceC8931bLy interfaceC8931bLy = oKWBaseTransaction instanceof InterfaceC8931bLy ? (InterfaceC8931bLy) oKWBaseTransaction : null;
        if (interfaceC8931bLy == null) {
            return null;
        }
        java.lang.String strOLrzqt = c9215bRQ.djBIcL().OLrzqt();
        java.lang.String strKWHzl = c9215bRQ.djBIcL().KWHzl();
        BigDecimal bigDecimal = (BigDecimal) CollectionsKt___CollectionsKt.UeEOUB(yDY.copydefault(C33129mqd.EZpvd(strOLrzqt), C54862xYb.OLrzqt(str2, java.lang.Double.valueOf(1.1d)), C33129mqd.EZpvd(interfaceC8931bLy.isConnected().getNormal())));
        java.lang.String strConvertToString$default = bigDecimal != null ? C54862xYb.convertToString$default(bigDecimal, false, null, null, 7, null) : null;
        BigDecimal bigDecimal2 = (BigDecimal) CollectionsKt___CollectionsKt.UeEOUB(yDY.copydefault(C33129mqd.EZpvd(strKWHzl), C54862xYb.OLrzqt(str, java.lang.Double.valueOf(1.1d)), C33129mqd.EZpvd(interfaceC8931bLy.isConnected().getProposePriorityFee())));
        java.lang.String strConvertToString$default2 = bigDecimal2 != null ? C54862xYb.convertToString$default(bigDecimal2, false, null, null, 7, null) : null;
        if (C33129mqd.copydefault(strConvertToString$default2, strKWHzl)) {
            strConvertToString$default = C54862xYb.convertToString$default(C54862xYb.KWHzl(strConvertToString$default, C54862xYb.AEQbTJ(strConvertToString$default2, strKWHzl)), false, null, null, 7, null);
        }
        java.lang.String str4 = strConvertToString$default;
        if (!C33129mqd.AhwBna(str4, strOLrzqt) && (!interfaceC8931bLy.hDKMBd() || !C33129mqd.AhwBna(strConvertToString$default2, strKWHzl))) {
            return null;
        }
        java.lang.String strKWHzl2 = c9215bRQ.valueOf().KWHzl();
        AbstractC8564bFB abstractC8564bFB2 = (AbstractC8564bFB) oKWBaseTransaction;
        java.lang.String strWeiToGwei$default2 = C54869xYi.weiToGwei$default(strOLrzqt, java.lang.Integer.valueOf(abstractC8564bFB2.dHguZz().valueOf()), true, null, false, 12, null);
        C9311bTG c9311bTG2 = c9311bTG;
        java.lang.String str5 = strConvertToString$default2;
        java.lang.String toFeeCoinAmount$default = AbstractC8426bCW.formatToFeeCoinAmount$default(c9311bTG2, c9215bRQ.getFeeAmount(), false, false, false, 14, null);
        java.lang.String str6 = " " + AbstractC8426bCW.formatToFeeCurrencyAmount$default(c9311bTG2, c9215bRQ.getFeeAmount(), false, false, false, 14, null);
        if (str4 != null) {
            str3 = strKWHzl2;
            strWeiToGwei$default = C54869xYi.weiToGwei$default(str4, java.lang.Integer.valueOf(abstractC8564bFB2.dHguZz().valueOf()), true, null, false, 12, null);
        } else {
            str3 = strKWHzl2;
        }
        java.lang.String str7 = strWeiToGwei$default;
        java.lang.String strOLrzqt2 = c9311bTG.OLrzqt(str4 == null ? "" : str4, str3);
        C9311bTG c9311bTG3 = c9311bTG;
        return new TxReplaceSendInfo(toFeeCoinAmount$default, str6, strWeiToGwei$default2, AbstractC8426bCW.formatToFeeCoinAmount$default(c9311bTG3, strOLrzqt2, false, false, false, 14, null), " " + AbstractC8426bCW.formatToFeeCurrencyAmount$default(c9311bTG3, strOLrzqt2, false, false, false, 14, null), str7, str3, str4, str5);
    }

    public final AbstractC58260yxt<ResponseData<C9748bbT>> EZpvd(final FragmentActivity fragmentActivity, final OKWBaseTransaction<?> oKWBaseTransaction, final boolean z, final boolean z2, final boolean z3, final InterfaceC9740bbL.TaskDescription taskDescription) {
        copydefault(oKWBaseTransaction);
        AbstractC58260yxt<ResponseData<C9748bbT>> abstractC58260yxtOLrzqt = AbstractC58260yxt.OLrzqt(new InterfaceC58259yxs() { // from class: o.bCE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58259yxs
            public final void subscribe(InterfaceC58257yxq interfaceC58257yxq) throws java.lang.Throwable {
                C8396bBt.AEQbTJ(oKWBaseTransaction, taskDescription, z3, fragmentActivity, z, z2, interfaceC58257yxq);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtOLrzqt, "");
        return abstractC58260yxtOLrzqt;
    }

    public static final void EZpvd(InterfaceC9740bbL.TaskDescription taskDescription, FragmentActivity fragmentActivity, OKWBaseTransaction<?> oKWBaseTransaction, java.lang.String str, boolean z, boolean z2, InterfaceC58257yxq<ResponseData<C9748bbT>> interfaceC58257yxq) throws java.lang.Throwable {
        if (z2) {
            taskDescription.copydefault();
        }
        AEQbTJ.AEQbTJ(fragmentActivity, oKWBaseTransaction, str, interfaceC58257yxq, taskDescription, new SubmitTxExpandBean(null, null, null, null, fragmentActivity, java.lang.Boolean.valueOf(z), 15, null));
    }

    public static final void AEQbTJ(final OKWBaseTransaction oKWBaseTransaction, final InterfaceC9740bbL.TaskDescription taskDescription, boolean z, final FragmentActivity fragmentActivity, boolean z2, boolean z3, final InterfaceC58257yxq interfaceC58257yxq) throws java.lang.Throwable {
        Intrinsics.checkNotNullParameter(interfaceC58257yxq, "");
        AbstractC12782ctV abstractC12782ctVDUDNAs = oKWBaseTransaction.dUDNAs();
        if (abstractC12782ctVDUDNAs.gHZMYf() || abstractC12782ctVDUDNAs.AEQbTJ(WalletType.HardwareWallet)) {
            EZpvd(taskDescription, fragmentActivity, (OKWBaseTransaction<?>) oKWBaseTransaction, "", false, false, (InterfaceC58257yxq<ResponseData<C9748bbT>>) interfaceC58257yxq);
            return;
        }
        taskDescription.EZpvd();
        if (z) {
            androidx.fragment.app.FragmentManager supportFragmentManager = fragmentActivity.getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
            new C14438dlU(supportFragmentManager, "submitWithPassword", abstractC12782ctVDUDNAs.RlQdEF(), new Function2() { // from class: o.bCJ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return C8396bBt.copydefault(interfaceC58257yxq, taskDescription, fragmentActivity, oKWBaseTransaction, (java.lang.String) obj, ((java.lang.Boolean) obj2).booleanValue());
                }
            }, new Function0() { // from class: o.bCF
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C8396bBt.copydefault(interfaceC58257yxq);
                }
            }).EZpvd();
        } else if (z2) {
            androidx.fragment.app.FragmentManager supportFragmentManager2 = fragmentActivity.getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager2, "");
            new C14506dmj(supportFragmentManager2, "submitWithPassword", z3, new Function1() { // from class: o.bCH
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C8396bBt.EZpvd(interfaceC58257yxq, taskDescription, fragmentActivity, oKWBaseTransaction, (java.lang.String) obj);
                }
            }, new Function0() { // from class: o.bBA
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C8396bBt.EZpvd(interfaceC58257yxq);
                }
            }).EZpvd();
        } else {
            androidx.fragment.app.FragmentManager supportFragmentManager3 = fragmentActivity.getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager3, "");
            new C14461dlr(supportFragmentManager3, "submitWithPassword", new Function1() { // from class: o.bBx
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C8396bBt.KWHzl(interfaceC58257yxq, taskDescription, fragmentActivity, oKWBaseTransaction, (java.lang.String) obj);
                }
            }, new Function0() { // from class: o.bBB
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C8396bBt.AhwBna(interfaceC58257yxq);
                }
            }, null, false, 48, null).EZpvd();
        }
    }

    public static final Unit copydefault(InterfaceC58257yxq interfaceC58257yxq, InterfaceC9740bbL.TaskDescription taskDescription, FragmentActivity fragmentActivity, OKWBaseTransaction oKWBaseTransaction, java.lang.String str, boolean z) throws java.lang.Throwable {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.copydefault(interfaceC58257yxq);
        EZpvd(taskDescription, fragmentActivity, (OKWBaseTransaction<?>) oKWBaseTransaction, str, z, true, (InterfaceC58257yxq<ResponseData<C9748bbT>>) interfaceC58257yxq);
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(InterfaceC58257yxq interfaceC58257yxq) {
        interfaceC58257yxq.onSuccess(new ResponseData(-5014, null, null, null, null, null, 62, null));
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(InterfaceC58257yxq interfaceC58257yxq, InterfaceC9740bbL.TaskDescription taskDescription, FragmentActivity fragmentActivity, OKWBaseTransaction oKWBaseTransaction, java.lang.String str) throws java.lang.Throwable {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.copydefault(interfaceC58257yxq);
        EZpvd(taskDescription, fragmentActivity, (OKWBaseTransaction<?>) oKWBaseTransaction, str, false, true, (InterfaceC58257yxq<ResponseData<C9748bbT>>) interfaceC58257yxq);
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(InterfaceC58257yxq interfaceC58257yxq) {
        interfaceC58257yxq.onSuccess(new ResponseData(-5014, null, null, null, null, null, 62, null));
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(InterfaceC58257yxq interfaceC58257yxq, InterfaceC9740bbL.TaskDescription taskDescription, FragmentActivity fragmentActivity, OKWBaseTransaction oKWBaseTransaction, java.lang.String str) throws java.lang.Throwable {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.copydefault(interfaceC58257yxq);
        EZpvd(taskDescription, fragmentActivity, (OKWBaseTransaction<?>) oKWBaseTransaction, str, false, true, (InterfaceC58257yxq<ResponseData<C9748bbT>>) interfaceC58257yxq);
        return Unit.INSTANCE;
    }

    public static final Unit AhwBna(InterfaceC58257yxq interfaceC58257yxq) {
        interfaceC58257yxq.onSuccess(new ResponseData(-5014, null, null, null, null, null, 62, null));
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.fiY.StateListAnimator.getInstance$default(o.fiY$StateListAnimator, android.content.Context, int, java.lang.Object):o.fiY */
    public final void copydefault(OKWBaseTransaction<?> oKWBaseTransaction) {
        AbstractC12782ctV abstractC12782ctVDUDNAs = oKWBaseTransaction.dUDNAs();
        if (abstractC12782ctVDUDNAs.gHZMYf() || abstractC12782ctVDUDNAs.AEQbTJ(WalletType.HardwareWallet)) {
            InterfaceC18445fiY.StateListAnimator.getInstance$default(InterfaceC18445fiY.Companion, null, 1, null).KWHzl("TransactionManager", oKWBaseTransaction.aUsmxb(), oKWBaseTransaction.dHguZz().djBIcL(), oKWBaseTransaction.dHguZz().AEQbTJ(), oKWBaseTransaction.dUDNAs());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final AbstractC58260yxt<ResponseData<C9748bbT>> OLrzqt(final FragmentActivity fragmentActivity, final OKWBaseTransaction<?> oKWBaseTransaction, final boolean z, final boolean z2, final boolean z3, final InterfaceC9740bbL.TaskDescription taskDescription) {
        AbstractC58260yxt abstractC58260yxtCopydefault;
        if (oKWBaseTransaction instanceof AbstractC11993ceZ) {
            AbstractC11993ceZ abstractC11993ceZ = (AbstractC11993ceZ) oKWBaseTransaction;
            if (abstractC11993ceZ.dHguZz().iRxXKY()) {
                AbstractC58185ywX<java.lang.Boolean> abstractC58185ywXAEQbTJ = abstractC11993ceZ.AEQbTJ();
                final Function1 function1 = new Function1() { // from class: o.bBS
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C8396bBt.KWHzl(taskDescription, fragmentActivity, oKWBaseTransaction, (java.lang.Boolean) obj);
                    }
                };
                abstractC58260yxtCopydefault = abstractC58185ywXAEQbTJ.KWHzl(new InterfaceC58229yxO() { // from class: o.bBW
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // o.InterfaceC58229yxO
                    public final java.lang.Object apply(java.lang.Object obj) {
                        return C8396bBt.zsXlph(function1, obj);
                    }
                }).valueOf();
            } else {
                abstractC58260yxtCopydefault = AbstractC58260yxt.copydefault(java.lang.Boolean.TRUE);
            }
        }
        final Function1 function12 = new Function1() { // from class: o.bCa
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C8396bBt.AEQbTJ(fragmentActivity, oKWBaseTransaction, z, z2, z3, taskDescription, (java.lang.Boolean) obj);
            }
        };
        AbstractC58260yxt<ResponseData<C9748bbT>> abstractC58260yxtOLrzqt = abstractC58260yxtCopydefault.OLrzqt(new InterfaceC58229yxO() { // from class: o.bBY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C8396bBt.wlaJM(function12, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtOLrzqt, "");
        return abstractC58260yxtOLrzqt;
    }

    public static final InterfaceC60096zvd zsXlph(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    public static final InterfaceC60096zvd KWHzl(final InterfaceC9740bbL.TaskDescription taskDescription, final FragmentActivity fragmentActivity, final OKWBaseTransaction oKWBaseTransaction, final java.lang.Boolean bool) {
        Intrinsics.checkNotNullParameter(bool, "");
        return AbstractC58185ywX.KWHzl(new InterfaceC58187ywZ() { // from class: o.bCg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58187ywZ
            public final void subscribe(InterfaceC58184ywW interfaceC58184ywW) {
                C8396bBt.copydefault(bool, taskDescription, fragmentActivity, oKWBaseTransaction, interfaceC58184ywW);
            }
        }, BackpressureStrategy.BUFFER);
    }

    public static final void copydefault(java.lang.Boolean bool, final InterfaceC9740bbL.TaskDescription taskDescription, FragmentActivity fragmentActivity, OKWBaseTransaction oKWBaseTransaction, final InterfaceC58184ywW interfaceC58184ywW) {
        Intrinsics.checkNotNullParameter(interfaceC58184ywW, "");
        if (bool.booleanValue()) {
            taskDescription.EZpvd();
            C12789ctc c12789ctc = C12789ctc.KWHzl;
            androidx.fragment.app.FragmentManager supportFragmentManager = fragmentActivity.getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
            c12789ctc.KWHzl(supportFragmentManager, new Function1() { // from class: o.bBu
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C8396bBt.OLrzqt(taskDescription, interfaceC58184ywW, ((java.lang.Boolean) obj).booleanValue());
                }
            });
            return;
        }
        if (((AbstractC11993ceZ) oKWBaseTransaction).KWHzl()) {
            taskDescription.EZpvd();
            C12789ctc c12789ctc2 = C12789ctc.KWHzl;
            androidx.fragment.app.FragmentManager supportFragmentManager2 = fragmentActivity.getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager2, "");
            c12789ctc2.copydefault(supportFragmentManager2, new Function1() { // from class: o.bBw
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C8396bBt.EZpvd(taskDescription, interfaceC58184ywW, ((java.lang.Boolean) obj).booleanValue());
                }
            });
            return;
        }
        interfaceC58184ywW.onNext(java.lang.Boolean.TRUE);
        interfaceC58184ywW.onComplete();
    }

    public static final Unit OLrzqt(InterfaceC9740bbL.TaskDescription taskDescription, InterfaceC58184ywW interfaceC58184ywW, boolean z) {
        if (z) {
            taskDescription.copydefault();
        }
        interfaceC58184ywW.onNext(java.lang.Boolean.valueOf(z));
        interfaceC58184ywW.onComplete();
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(InterfaceC9740bbL.TaskDescription taskDescription, InterfaceC58184ywW interfaceC58184ywW, boolean z) {
        if (z) {
            taskDescription.copydefault();
        }
        interfaceC58184ywW.onNext(java.lang.Boolean.valueOf(z));
        interfaceC58184ywW.onComplete();
        return Unit.INSTANCE;
    }

    public static final InterfaceC58261yxu wlaJM(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC58261yxu) function1.invoke(obj);
    }

    public static final InterfaceC58261yxu AEQbTJ(FragmentActivity fragmentActivity, OKWBaseTransaction oKWBaseTransaction, boolean z, boolean z2, boolean z3, InterfaceC9740bbL.TaskDescription taskDescription, java.lang.Boolean bool) {
        Intrinsics.checkNotNullParameter(bool, "");
        if (bool.booleanValue()) {
            return AEQbTJ.EZpvd(fragmentActivity, (OKWBaseTransaction<?>) oKWBaseTransaction, z, z2, z3, taskDescription);
        }
        AbstractC58260yxt abstractC58260yxtCopydefault = AbstractC58260yxt.copydefault(new ResponseData(-5007, null, null, null, null, null, 62, null));
        Intrinsics.copydefault(abstractC58260yxtCopydefault);
        return abstractC58260yxtCopydefault;
    }

    public static /* synthetic */ void submit$default(C8396bBt c8396bBt, FragmentActivity fragmentActivity, OKWBaseTransaction oKWBaseTransaction, java.lang.String str, InterfaceC58257yxq interfaceC58257yxq, InterfaceC9740bbL.TaskDescription taskDescription, SubmitTxExpandBean submitTxExpandBean, int i, java.lang.Object obj) throws java.lang.Throwable {
        if ((i & 32) != 0) {
            submitTxExpandBean = null;
        }
        c8396bBt.AEQbTJ(fragmentActivity, (OKWBaseTransaction<?>) oKWBaseTransaction, str, (InterfaceC58257yxq<ResponseData<C9748bbT>>) interfaceC58257yxq, taskDescription, submitTxExpandBean);
    }

    public final void AEQbTJ(final FragmentActivity fragmentActivity, final OKWBaseTransaction<?> oKWBaseTransaction, final java.lang.String str, final InterfaceC58257yxq<ResponseData<C9748bbT>> interfaceC58257yxq, final InterfaceC9740bbL.TaskDescription taskDescription, SubmitTxExpandBean submitTxExpandBean) throws java.lang.Throwable {
        java.lang.Object objM7377constructorimpl;
        try {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(eFB.KWHzl.EZpvd(oKWBaseTransaction.AEQbTJ(str, submitTxExpandBean), fragmentActivity, oKWBaseTransaction.dHguZz(), oKWBaseTransaction.dUDNAs(), true));
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (Result.m7384isSuccessimpl(objM7377constructorimpl)) {
            C56391yDq.AEQbTJ(objM7377constructorimpl);
            final Function1 function1 = new Function1() { // from class: o.bCq
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C8396bBt.copydefault(taskDescription, fragmentActivity, oKWBaseTransaction, interfaceC58257yxq, str, (ResponseData) obj);
                }
            };
            InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.bCt
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    C8396bBt.AxsJAY(function1, obj);
                }
            };
            final Function1 function12 = new Function1() { // from class: o.bCr
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C8396bBt.KWHzl(interfaceC58257yxq, (java.lang.Throwable) obj);
                }
            };
            interfaceC58257yxq.setDisposable(((AbstractC58185ywX) objM7377constructorimpl).AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.bCv
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    C8396bBt.gHZMYf(function12, obj);
                }
            }));
            return;
        }
        java.lang.Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        Intrinsics.copydefault(thM7380exceptionOrNullimpl);
        interfaceC58257yxq.onError(thM7380exceptionOrNullimpl);
    }

    public static final void AxsJAY(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    /* JADX DEBUG: Class process forced to load method for inline: com.okinc.network.okg.response.ResponseData.copy$default(com.okinc.network.okg.response.ResponseData, int, java.lang.String, java.lang.String, java.lang.String, java.lang.Object, java.lang.String, int, java.lang.Object):com.okinc.network.okg.response.ResponseData */
    /* JADX DEBUG: Multi-variable search result rejected for r18v0, resolved type: com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit copydefault(final InterfaceC9740bbL.TaskDescription taskDescription, final FragmentActivity fragmentActivity, final OKWBaseTransaction oKWBaseTransaction, final InterfaceC58257yxq interfaceC58257yxq, final java.lang.String str, ResponseData responseData) {
        java.lang.String strZuBGHE;
        java.lang.String str2;
        taskDescription.EZpvd();
        int code = responseData.getCode();
        if (code == -5015) {
            if (C33129mqd.OLrzqt((java.lang.CharSequence) responseData.getMsg())) {
                C55326xho.toast$default(responseData.getMsg(), (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
            }
            interfaceC58257yxq.onSuccess(ResponseData.copy$default(responseData, -5014, null, null, null, null, null, 62, null));
        } else if (code == -5013) {
            eGH.Application application = eGH.Companion;
            java.lang.String strDbNXlk = oKWBaseTransaction.dUDNAs().DbNXlk();
            java.lang.String address = oKWBaseTransaction.fERRXa().getAddress();
            long jAhwBna = oKWBaseTransaction.dHguZz().AhwBna();
            long jAhwBna2 = oKWBaseTransaction instanceof AbstractC8704bHj ? ((AbstractC8704bHj) oKWBaseTransaction).fHqPtx().AhwBna() : 0L;
            if (oKWBaseTransaction.aUsmxb().isMessage()) {
                if (oKWBaseTransaction instanceof C9035bNw) {
                    strZuBGHE = ((C9035bNw) oKWBaseTransaction).DbNXlk();
                    str2 = strZuBGHE;
                }
                str2 = "";
            } else {
                if (oKWBaseTransaction instanceof InterfaceC8931bLy) {
                    strZuBGHE = ((InterfaceC8931bLy) oKWBaseTransaction).gEmmrt();
                } else if (oKWBaseTransaction instanceof C12010ceq) {
                    strZuBGHE = ((C12010ceq) oKWBaseTransaction).KWHzl().getSignDataHex();
                } else {
                    if (oKWBaseTransaction instanceof AbstractC11993ceZ) {
                        strZuBGHE = ((AbstractC11993ceZ) oKWBaseTransaction).zuBGHE();
                    }
                    str2 = "";
                }
                str2 = strZuBGHE;
            }
            C9694baS.Companion.AEQbTJ(fragmentActivity, application.AEQbTJ(fragmentActivity, strDbNXlk, address, jAhwBna, jAhwBna2, str2, (!oKWBaseTransaction.aUsmxb().isMessage() && (oKWBaseTransaction instanceof InterfaceC8931bLy)) ? ((InterfaceC8931bLy) oKWBaseTransaction).QKVWgx() : null, (!oKWBaseTransaction.aUsmxb().isMessage() && (oKWBaseTransaction instanceof InterfaceC8931bLy)) ? java.lang.Integer.valueOf(((InterfaceC8931bLy) oKWBaseTransaction).iwGUEr()) : null, (oKWBaseTransaction.aUsmxb().isMessage() && (oKWBaseTransaction instanceof C9035bNw)) ? ((C9035bNw) oKWBaseTransaction).isConnected() : null), new Function2() { // from class: o.bBL
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return C8396bBt.EZpvd(taskDescription, fragmentActivity, oKWBaseTransaction, str, interfaceC58257yxq, ((java.lang.Integer) obj).intValue(), (android.content.Intent) obj2);
                }
            });
        } else if (code == -5011) {
            C12789ctc c12789ctc = C12789ctc.KWHzl;
            androidx.fragment.app.FragmentManager supportFragmentManager = fragmentActivity.getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
            c12789ctc.copydefault(supportFragmentManager, new Function1() { // from class: o.bCd
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C8396bBt.copydefault(taskDescription, fragmentActivity, oKWBaseTransaction, str, interfaceC58257yxq, ((java.lang.Boolean) obj).booleanValue());
                }
            });
        } else if (code != -5009) {
            if (code == -5008) {
                C12789ctc c12789ctc2 = C12789ctc.KWHzl;
                Intrinsics.copydefault(oKWBaseTransaction, "");
                c12789ctc2.EZpvd(fragmentActivity, (AbstractC11993ceZ<?>) oKWBaseTransaction, new Function1() { // from class: o.bBR
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C8396bBt.KWHzl(taskDescription, fragmentActivity, oKWBaseTransaction, str, interfaceC58257yxq, ((java.lang.Boolean) obj).booleanValue());
                    }
                });
            } else {
                interfaceC58257yxq.onSuccess(responseData);
            }
        } else if (oKWBaseTransaction instanceof C12244cjL) {
            interfaceC58257yxq.onSuccess(responseData);
        } else if (oKWBaseTransaction instanceof AbstractC8564bFB) {
            ((AbstractC8564bFB) oKWBaseTransaction).QKudOq().KWHzl(2);
        }
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(InterfaceC9740bbL.TaskDescription taskDescription, FragmentActivity fragmentActivity, OKWBaseTransaction oKWBaseTransaction, java.lang.String str, InterfaceC58257yxq interfaceC58257yxq, int i, android.content.Intent intent) throws java.lang.Throwable {
        if (i == -1) {
            taskDescription.copydefault();
            C8396bBt c8396bBt = AEQbTJ;
            java.lang.String stringExtra = intent != null ? intent.getStringExtra("result") : null;
            if (stringExtra == null) {
                stringExtra = "";
            }
            java.lang.Boolean bool = java.lang.Boolean.TRUE;
            c8396bBt.AEQbTJ(fragmentActivity, (OKWBaseTransaction<?>) oKWBaseTransaction, str, (InterfaceC58257yxq<ResponseData<C9748bbT>>) interfaceC58257yxq, taskDescription, new SubmitTxExpandBean(bool, bool, bool, stringExtra, fragmentActivity, null, 32, null));
        } else {
            interfaceC58257yxq.onSuccess(new ResponseData(-5014, null, null, null, null, null, 62, null));
        }
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(InterfaceC9740bbL.TaskDescription taskDescription, FragmentActivity fragmentActivity, OKWBaseTransaction oKWBaseTransaction, java.lang.String str, InterfaceC58257yxq interfaceC58257yxq, boolean z) throws java.lang.Throwable {
        if (z) {
            taskDescription.copydefault();
            AEQbTJ.AEQbTJ(fragmentActivity, (OKWBaseTransaction<?>) oKWBaseTransaction, str, (InterfaceC58257yxq<ResponseData<C9748bbT>>) interfaceC58257yxq, taskDescription, new SubmitTxExpandBean(java.lang.Boolean.TRUE, null, null, null, fragmentActivity, null, 46, null));
        }
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(InterfaceC9740bbL.TaskDescription taskDescription, FragmentActivity fragmentActivity, OKWBaseTransaction oKWBaseTransaction, java.lang.String str, InterfaceC58257yxq interfaceC58257yxq, boolean z) throws java.lang.Throwable {
        if (z) {
            taskDescription.copydefault();
            C8396bBt c8396bBt = AEQbTJ;
            java.lang.Boolean bool = java.lang.Boolean.TRUE;
            c8396bBt.AEQbTJ(fragmentActivity, (OKWBaseTransaction<?>) oKWBaseTransaction, str, (InterfaceC58257yxq<ResponseData<C9748bbT>>) interfaceC58257yxq, taskDescription, new SubmitTxExpandBean(bool, bool, null, null, fragmentActivity, null, 44, null));
        }
        return Unit.INSTANCE;
    }

    public static final void gHZMYf(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit KWHzl(InterfaceC58257yxq interfaceC58257yxq, java.lang.Throwable th) {
        interfaceC58257yxq.onError(th);
        return Unit.INSTANCE;
    }

    public final SignDataArgs<BaseSignData> KWHzl(@NotNull AbstractC12782ctV abstractC12782ctV, @NotNull DappInteractionArgs dappInteractionArgs, Function1<? super NewCallbackBean, ? extends AbstractC58185ywX<ResponseData<java.lang.String>>> function1, Function1<? super NewCallbackBean, ? extends AbstractC58185ywX<ResponseData<java.lang.String>>> function12, @NotNull OKWBaseTransaction.TransactionType transactionType) {
        Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
        Intrinsics.checkNotNullParameter(dappInteractionArgs, "");
        Intrinsics.checkNotNullParameter(transactionType, "");
        C10854bwM c10854bwMCopydefault = C11627cVg.KWHzl.EZpvd(C33129mqd.valueOf(dappInteractionArgs.getChainId()), true);
        if (c10854bwMCopydefault == null) {
            return null;
        }
        return EZpvd(abstractC12782ctV, c10854bwMCopydefault, dappInteractionArgs, function1, function12, transactionType);
    }

    public final SignDataArgs<BaseSignData> EZpvd(AbstractC12782ctV abstractC12782ctV, C10854bwM c10854bwM, DappInteractionArgs dappInteractionArgs, Function1<? super NewCallbackBean, ? extends AbstractC58185ywX<ResponseData<java.lang.String>>> function1, Function1<? super NewCallbackBean, ? extends AbstractC58185ywX<ResponseData<java.lang.String>>> function12, OKWBaseTransaction.TransactionType transactionType) {
        PlatformItem platformItem;
        BaseSignData baseSignDataKWHzl = KWHzl(abstractC12782ctV, c10854bwM, dappInteractionArgs.getSignDataJson(), dappInteractionArgs, (BaseSignData) null, transactionType);
        if (baseSignDataKWHzl == null) {
            return null;
        }
        java.lang.String strDbNXlk = abstractC12782ctV.DbNXlk();
        java.lang.String walletAddress = dappInteractionArgs.getWalletAddress();
        long jFetchVPNInfo = c10854bwM.fetchVPNInfo();
        if (dappInteractionArgs.getDapp() == null) {
            platformItem = null;
        } else {
            com.okinc.business.defi.api.bean.PlatformItem dapp = dappInteractionArgs.getDapp();
            Intrinsics.copydefault(dapp);
            platformItem = new PlatformItem(dapp.getPlatform(), dapp.getLogo(), dapp.getUrl(), dapp.getDrawableRes(), dapp.getContract());
        }
        return new SignDataArgs<>(strDbNXlk, walletAddress, jFetchVPNInfo, baseSignDataKWHzl, platformItem, dappInteractionArgs.getWcId(), dappInteractionArgs.getWcTopic(), null, null, dappInteractionArgs.getSolanaSignType(), dappInteractionArgs.getSource(), dappInteractionArgs.getBizType(), dappInteractionArgs.getWalletTxDataExtra(), dappInteractionArgs.getTxToastCheckBizLine(), dappInteractionArgs.getTxToastCheckPayload(), dappInteractionArgs.getUseNewCallback() ? function1 : null, function12, false, false, null, false, false, false, false, 16646528, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:211:0x03f6  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final BaseSignData KWHzl(@NotNull AbstractC12782ctV abstractC12782ctV, @NotNull C10854bwM c10854bwM, @NotNull java.lang.String str, DappInteractionArgs dappInteractionArgs, BaseSignData baseSignData, @NotNull OKWBaseTransaction.TransactionType transactionType) {
        java.lang.String str2;
        TronContractSignData.RawData raw_data;
        java.util.List<TronContractSignData.Contract> contract;
        TronContractSignData.Contract contract2;
        TronContractSignData.Parameter parameter;
        TronContractSignData.Value value;
        SolanaMethod solanaMethod;
        SolanaMethod solanaMethod2;
        BaseSignData baseSignDataAEQbTJ;
        EVMContractSignData eVMContractSignData;
        java.lang.Integer bizType;
        java.lang.Long coinId;
        str2 = "";
        Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
        Intrinsics.checkNotNullParameter(c10854bwM, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(transactionType, "");
        if (c10854bwM.call()) {
            baseSignDataAEQbTJ = AEQbTJ(dappInteractionArgs != null ? dappInteractionArgs.getBizType() : null, str, c10854bwM.fetchVPNInfo());
        } else if (c10854bwM.QkdxfA()) {
            if (abstractC12782ctV.getFieldNames()) {
                java.lang.Object objFromJson = new Gson().fromJson(str, (java.lang.Class<java.lang.Object>) AAContractSignData.class);
                AAContractSignData aAContractSignData = (AAContractSignData) objFromJson;
                java.util.List<AASubSignData> dataList = aAContractSignData != null ? aAContractSignData.getDataList() : null;
                if (dataList == null || dataList.isEmpty()) {
                    try {
                        Result.Application application = Result.Companion;
                        SignData signData = (SignData) new Gson().fromJson(str, SignData.class);
                        int i = Activity.OLrzqt[transactionType.ordinal()];
                        if (i == 1) {
                            AAContractSignData aAContractSignData2 = (AAContractSignData) objFromJson;
                            java.lang.String value2 = signData.getValue();
                            aAContractSignData2.setDataList(C56402yEa.EZpvd(new AASubSignData(signData.getTo(), value2 == null ? "" : value2, signData.getData(), true, null, null, 48, null)));
                        } else if (i == 2) {
                            java.lang.String value3 = signData.getValue();
                            java.util.List listEZpvd = C56402yEa.EZpvd(new AASubSignData(signData.getTo(), value3 == null ? "" : value3, signData.getData(), false, null, null, 56, null));
                            java.lang.String approveAmt = dappInteractionArgs != null ? dappInteractionArgs.getApproveAmt() : null;
                            if (approveAmt != null) {
                                str2 = approveAmt;
                            }
                            objFromJson = new AACancelApprovalSignData(listEZpvd, str2);
                        } else {
                            AAContractSignData aAContractSignData3 = (AAContractSignData) objFromJson;
                            java.lang.String value4 = signData.getValue();
                            aAContractSignData3.setDataList(C56402yEa.EZpvd(new AASubSignData(signData.getTo(), value4 == null ? "" : value4, signData.getData(), false, null, null, 56, null)));
                        }
                        Result.m7377constructorimpl(Unit.INSTANCE);
                    } catch (java.lang.Throwable th) {
                        Result.Application application2 = Result.Companion;
                        Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                    }
                }
                baseSignDataAEQbTJ = (ContractSignData) objFromJson;
            } else if (transactionType == OKWBaseTransaction.TransactionType.CancelApprove) {
                java.lang.Object objFromJson2 = new Gson().fromJson(str, (java.lang.Class<java.lang.Object>) EVMCancelApprovalSignData.class);
                EVMCancelApprovalSignData eVMCancelApprovalSignData = (EVMCancelApprovalSignData) objFromJson2;
                eVMCancelApprovalSignData.setCoinId((dappInteractionArgs == null || (coinId = dappInteractionArgs.getCoinId()) == null) ? null : coinId.toString());
                java.lang.String approveAmt2 = dappInteractionArgs != null ? dappInteractionArgs.getApproveAmt() : null;
                eVMCancelApprovalSignData.setApprovalNum(approveAmt2 != null ? approveAmt2 : "");
                baseSignDataAEQbTJ = (EVMContractSignData) objFromJson2;
            } else {
                if ((dappInteractionArgs != null && (bizType = dappInteractionArgs.getBizType()) != null && bizType.intValue() == 8) || (baseSignData instanceof EVMBatchContractSignData)) {
                    eVMContractSignData = (EVMContractSignData) new Gson().fromJson(str, EVMBatchContractSignData.class);
                } else if (((JsonObject) new Gson().fromJson(str, JsonObject.class)).has("calls")) {
                    EVM5792ContractSignData eVM5792ContractSignData = (EVM5792ContractSignData) new Gson().fromJson(str, EVM5792ContractSignData.class);
                    C8955bMV.Activity activity = C8955bMV.Companion;
                    Intrinsics.copydefault(eVM5792ContractSignData);
                    boolean zCopydefault = activity.copydefault(eVM5792ContractSignData);
                    eVMContractSignData = eVM5792ContractSignData;
                    if (!zCopydefault) {
                        eVMContractSignData = null;
                    }
                } else {
                    eVMContractSignData = (EVMContractSignData) new Gson().fromJson(str, EVMContractSignData.class);
                }
                if (eVMContractSignData != null) {
                    if (dappInteractionArgs == null) {
                        EVMContractSignData eVMContractSignData2 = baseSignData instanceof EVMContractSignData ? (EVMContractSignData) baseSignData : null;
                        eVMContractSignData.setGasPriceRate(eVMContractSignData2 != null ? eVMContractSignData2.getGasPriceRate() : null);
                        eVMContractSignData.setGasLimitRate(eVMContractSignData2 != null ? eVMContractSignData2.getGasLimitRate() : null);
                    } else {
                        eVMContractSignData.setGasPriceRate(dappInteractionArgs.getGasPriceRatio());
                        eVMContractSignData.setGasLimitRate(dappInteractionArgs.getGasLimitRatio());
                    }
                    baseSignDataAEQbTJ = eVMContractSignData;
                } else {
                    baseSignDataAEQbTJ = null;
                }
            }
        } else if (c10854bwM.DXXBbs()) {
            JsonObject jsonObject = (JsonObject) new Gson().fromJson(str, JsonObject.class);
            if (jsonObject.has("msgs")) {
                baseSignDataAEQbTJ = (CosmosContractSignData) new Gson().fromJson(str, CosmosContractSignMessageData.class);
            } else if (jsonObject.has("sign_doc")) {
                baseSignDataAEQbTJ = (CosmosContractSignData) new Gson().fromJson(str, CosmosContractSignDirectData.class);
            }
        } else if (c10854bwM.fARcdN()) {
            if (transactionType == OKWBaseTransaction.TransactionType.SolanaMultiSign || (dappInteractionArgs != null && dappInteractionArgs.getMultiSignData())) {
                if (dappInteractionArgs != null && dappInteractionArgs.isMemeOptimization()) {
                    baseSignDataAEQbTJ = (SolanaMultiContractSignData) new Gson().fromJson(str, SolanaMultiMemeContractSignData.class);
                } else {
                    SolanaMultiContractSignData solanaMultiContractSignData = (SolanaMultiContractSignData) new Gson().fromJson(str, SolanaMultiContractSignData.class);
                    solanaMultiContractSignData.setSolanaMethod((dappInteractionArgs == null || (solanaMethod = dappInteractionArgs.getSolanaMethod()) == null) ? null : solanaMethod.getMethod());
                    baseSignDataAEQbTJ = solanaMultiContractSignData;
                }
            } else if (dappInteractionArgs != null && dappInteractionArgs.isMemeOptimization()) {
                baseSignDataAEQbTJ = (SolanaContractSignData) new Gson().fromJson(str, SolanaMemeContractSignData.class);
            } else {
                SolanaContractSignData solanaContractSignData = (SolanaContractSignData) new Gson().fromJson(str, SolanaContractSignData.class);
                solanaContractSignData.setSolanaMethod((dappInteractionArgs == null || (solanaMethod2 = dappInteractionArgs.getSolanaMethod()) == null) ? null : solanaMethod2.getMethod());
                baseSignDataAEQbTJ = solanaContractSignData;
            }
        } else if (c10854bwM.fIwbmz()) {
            baseSignDataAEQbTJ = (BaseSignData) new Gson().fromJson(str, AptosContractSignData.class);
        } else if (c10854bwM.ixgjPv()) {
            baseSignDataAEQbTJ = (BaseSignData) new Gson().fromJson(str, SuiContractSignData.class);
        } else if (c10854bwM.Dmq()) {
            baseSignDataAEQbTJ = (BaseSignData) new Gson().fromJson(str, StacksContractSignData.class);
        } else if (c10854bwM.DCUTEIdCUTEI()) {
            if (transactionType == OKWBaseTransaction.TransactionType.Register) {
                baseSignDataAEQbTJ = (StarkNetContractSignData) new Gson().fromJson(str, StarkNetRegisterSignData.class);
            } else {
                baseSignDataAEQbTJ = (StarkNetContractSignData) new Gson().fromJson(str, StarkNetContractSignData.class);
            }
        } else if (c10854bwM.run()) {
            if (transactionType == OKWBaseTransaction.TransactionType.Approve || transactionType == OKWBaseTransaction.TransactionType.CancelApprove) {
                java.lang.Object objFromJson3 = new Gson().fromJson(str, (java.lang.Class<java.lang.Object>) TronApprovalSignData.class);
                TronApprovalSignData tronApprovalSignData = (TronApprovalSignData) objFromJson3;
                tronApprovalSignData.setCoinId(C33129mqd.gEmmrt(dappInteractionArgs != null ? dappInteractionArgs.getCoinId() : null));
                tronApprovalSignData.setApprovalAddress(dappInteractionArgs != null ? dappInteractionArgs.getApprovalAddress() : null);
                java.lang.String approveAmt3 = dappInteractionArgs != null ? dappInteractionArgs.getApproveAmt() : null;
                tronApprovalSignData.setApproveAmt(approveAmt3 != null ? approveAmt3 : "");
                tronApprovalSignData.setCancelApprove(java.lang.Boolean.valueOf(transactionType == OKWBaseTransaction.TransactionType.CancelApprove));
                baseSignDataAEQbTJ = (TronContractSignData) objFromJson3;
            } else {
                TronContractSignData tronContractSignData = (TronContractSignData) new Gson().fromJson(str, TronContractSignData.class);
                java.lang.String data = (tronContractSignData == null || (raw_data = tronContractSignData.getRaw_data()) == null || (contract = raw_data.getContract()) == null || (contract2 = (TronContractSignData.Contract) CollectionsKt___CollectionsKt.firstOrNull(contract)) == null || (parameter = contract2.getParameter()) == null || (value = parameter.getValue()) == null) ? null : value.getData();
                baseSignDataAEQbTJ = tronContractSignData;
                if (AbstractC8919bLm.Companion.AEQbTJ(data != null ? data : "")) {
                    baseSignDataAEQbTJ = (TronContractSignData) new Gson().fromJson(str, TronApprovalSignData.class);
                }
            }
        } else if (c10854bwM.hCLrkq()) {
            if (transactionType == OKWBaseTransaction.TransactionType.Register) {
                ZKSyncRegisterSignData zKSyncRegisterSignData = (ZKSyncRegisterSignData) new Gson().fromJson(str, ZKSyncRegisterSignData.class);
                zKSyncRegisterSignData.setCoinId(C33129mqd.gEmmrt(dappInteractionArgs != null ? dappInteractionArgs.getCoinId() : null));
                baseSignDataAEQbTJ = zKSyncRegisterSignData;
            }
        } else if (c10854bwM.DGOPHZ()) {
            baseSignDataAEQbTJ = (BaseSignData) new GsonBuilder().disableHtmlEscaping().create().fromJson(str, TonContractSignData.class);
        }
        if (baseSignDataAEQbTJ == null) {
            return null;
        }
        java.util.List<FromToken> listAEQbTJ = DappInteractionArgs.Companion.AEQbTJ(str);
        if (baseSignDataAEQbTJ instanceof ContractSignData) {
            if (!listAEQbTJ.isEmpty()) {
                ContractSignData contractSignData = (ContractSignData) baseSignDataAEQbTJ;
                java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listAEQbTJ, 10));
                for (FromToken fromToken : listAEQbTJ) {
                    arrayList.add(new ContractSignData.FromToken(fromToken.isNativeToken(), fromToken.getTokenContractAddress(), fromToken.getAmount(), fromToken.getMinAmount(), fromToken.getImageUrl(), fromToken.getFormatAmount(), fromToken.getSymbol()));
                }
                contractSignData.setFromToken(arrayList);
            }
            ((ContractSignData) baseSignDataAEQbTJ).setOpenMEV(dappInteractionArgs != null ? dappInteractionArgs.isOpenMEV() : null);
        }
        return baseSignDataAEQbTJ;
    }

    public final BaseSignData AEQbTJ(java.lang.Integer num, @NotNull java.lang.String str, long j) {
        UTXOTransferBaseSignData uTXOTransferSignData;
        Intrinsics.checkNotNullParameter(str, "");
        C10854bwM c10854bwMCopydefault = C11627cVg.KWHzl.EZpvd(j, true);
        if (c10854bwMCopydefault == null || !c10854bwMCopydefault.call()) {
            return null;
        }
        if (num != null && num.intValue() == 5) {
            uTXOTransferSignData = (FixedUTXOSignData) C33490mxT.EZpvd(str, FixedUTXOSignData.class);
            if (uTXOTransferSignData == null) {
                return null;
            }
            uTXOTransferSignData.setSupportAnotherAddressPayFee(true);
        } else {
            if ((num != null && num.intValue() == 4) || ((num != null && num.intValue() == 6) || (num != null && num.intValue() == 10))) {
                return (BaseSignData) C33490mxT.EZpvd(str, FixedUTXOSignData.class);
            }
            if (num != null && num.intValue() == 9) {
                return (BaseSignData) C33490mxT.EZpvd(str, RunesMainMintSignData.class);
            }
            if (num != null && num.intValue() == 13) {
                return (BaseSignData) C33490mxT.EZpvd(str, BRC20MintSignData.class);
            }
            if (num != null && num.intValue() == 3) {
                return (BaseSignData) C33490mxT.EZpvd(str, BRC20MintSignData.class);
            }
            if (num != null && num.intValue() == 7) {
                UTXODappTransferData uTXODappTransferData = (UTXODappTransferData) C33490mxT.EZpvd(str, UTXODappTransferData.class);
                if (uTXODappTransferData == null) {
                    return null;
                }
                long jAhwBna = c10854bwMCopydefault.AhwBna();
                java.lang.String from = uTXODappTransferData.getFrom();
                java.lang.String str2 = from == null ? "" : from;
                java.lang.String to = uTXODappTransferData.getTo();
                java.lang.String str3 = to == null ? "" : to;
                java.lang.String value = uTXODappTransferData.getValue();
                java.lang.String strKWHzl = value != null ? C54870xYj.KWHzl(value, c10854bwMCopydefault.valueOf()) : null;
                uTXOTransferSignData = new UTXOTransferSignData(jAhwBna, str2, str3, strKWHzl == null ? "" : strKWHzl, false, false, uTXODappTransferData.getSatBytes());
            } else {
                if (num == null || num.intValue() != 15) {
                    if (num != null && num.intValue() == 14) {
                        return (BaseSignData) C33490mxT.EZpvd(str, RunesTransferSignData.class);
                    }
                    return null;
                }
                NewUTXODappTransferData newUTXODappTransferData = (NewUTXODappTransferData) C33490mxT.EZpvd(str, NewUTXODappTransferData.class);
                if (newUTXODappTransferData == null) {
                    return null;
                }
                long jAhwBna2 = c10854bwMCopydefault.AhwBna();
                java.lang.String fromAddress = newUTXODappTransferData.getFromAddress();
                java.lang.String str4 = fromAddress == null ? "" : fromAddress;
                java.lang.String toAddress = newUTXODappTransferData.getToAddress();
                java.lang.String str5 = toAddress == null ? "" : toAddress;
                java.lang.String satoshis = newUTXODappTransferData.getSatoshis();
                java.lang.String str6 = satoshis == null ? "" : satoshis;
                NewUTXODappOptions options = newUTXODappTransferData.getOptions();
                uTXOTransferSignData = new UTXOTransferSignData(jAhwBna2, str4, str5, str6, false, false, options != null ? options.getFeeRate() : null);
            }
        }
        return uTXOTransferSignData;
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:58:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final SignDataArgs<MessageSignData> OLrzqt(@NotNull DappSignArgs dappSignArgs) {
        BaseSignData bTCMessageSignData;
        BaseSignData baseSignData;
        BaseSignData tonMessageSignData;
        BaseSignData tronMessageSignData;
        BaseSignData nostrMessageSignData;
        PlatformItem platformItem;
        Intrinsics.checkNotNullParameter(dappSignArgs, "");
        C10854bwM c10854bwMCopydefault = C11627cVg.KWHzl.EZpvd(C33129mqd.valueOf(dappSignArgs.getChainId()), true);
        if (c10854bwMCopydefault == null) {
            return null;
        }
        if (c10854bwMCopydefault.QkdxfA()) {
            bTCMessageSignData = new EVMMessageSignData(dappSignArgs.getData(), dappSignArgs.isPersonSign(), dappSignArgs.getMethod(), dappSignArgs.getSignType(), dappSignArgs.getRaw(), dappSignArgs.getSignTypedDataVersion(), dappSignArgs.getWcAuthRequestIssuer());
        } else {
            if (c10854bwMCopydefault.fARcdN()) {
                tronMessageSignData = new SolanaMessageSignData(dappSignArgs.getData(), dappSignArgs.getSolSignDappMessages(), dappSignArgs.getRaw());
            } else {
                if (c10854bwMCopydefault.fIwbmz()) {
                    nostrMessageSignData = new AptosMessageSignData(dappSignArgs.getData(), dappSignArgs.getMethod());
                } else {
                    if (c10854bwMCopydefault.DXXBbs()) {
                        tonMessageSignData = new CosmosMessageSignData(dappSignArgs.getData());
                    } else if (c10854bwMCopydefault.ixgjPv()) {
                        tonMessageSignData = new SuiMessageSignData(dappSignArgs.getData());
                    } else if (c10854bwMCopydefault.QCjLjM()) {
                        nostrMessageSignData = new NostrMessageSignData(dappSignArgs.getData(), dappSignArgs.getNostrSignType());
                    } else if (c10854bwMCopydefault.DCUTEIdCUTEI()) {
                        tonMessageSignData = new StarkNetMessageSignData(dappSignArgs.getData());
                    } else if (c10854bwMCopydefault.run()) {
                        tronMessageSignData = new TronMessageSignData(dappSignArgs.getData(), dappSignArgs.getAddPrefix(), dappSignArgs.getVersion());
                    } else if (c10854bwMCopydefault.OFhtUX()) {
                        tonMessageSignData = new KaspaMessageSignData(dappSignArgs.getData());
                    } else if (c10854bwMCopydefault.iRxXKY() || c10854bwMCopydefault.QKudOq() || c10854bwMCopydefault.AxsJAYsNCnLh()) {
                        BTCDappSignData bTCDappSignData = (BTCDappSignData) C33490mxT.EZpvd(dappSignArgs.getData(), BTCDappSignData.class);
                        bTCMessageSignData = bTCDappSignData != null ? new BTCMessageSignData(dappSignArgs.getData(), bTCDappSignData.getSignStr(), bTCDappSignData.getPsbtHex(), bTCDappSignData.getPsbtHexs(), bTCDappSignData.getFrom(), bTCDappSignData.getType(), dappSignArgs.getMethod(), dappSignArgs.getNeedBroadcast()) : null;
                    } else {
                        if (!c10854bwMCopydefault.DGOPHZ()) {
                            baseSignData = null;
                            if (baseSignData != null) {
                                return null;
                            }
                            java.lang.String walletId = dappSignArgs.getWalletId();
                            long jFetchVPNInfo = c10854bwMCopydefault.fetchVPNInfo();
                            if (dappSignArgs.getDapp() == null) {
                                platformItem = null;
                            } else {
                                com.okinc.business.defi.api.bean.PlatformItem dapp = dappSignArgs.getDapp();
                                Intrinsics.copydefault(dapp);
                                platformItem = new PlatformItem(dapp.getPlatform(), dapp.getLogo(), dapp.getUrl(), dapp.getDrawableRes(), dapp.getContract());
                            }
                            return new SignDataArgs<>(walletId, null, jFetchVPNInfo, baseSignData, platformItem, dappSignArgs.getWcId(), dappSignArgs.getWcTopic(), dappSignArgs.getMpcSignType(), null, null, dappSignArgs.getSource(), null, null, null, null, null, null, false, false, null, false, false, false, false, 16775938, null);
                        }
                        tonMessageSignData = new TonMessageSignData(dappSignArgs.getData());
                    }
                    bTCMessageSignData = tonMessageSignData;
                }
                bTCMessageSignData = nostrMessageSignData;
            }
            bTCMessageSignData = tronMessageSignData;
        }
        baseSignData = bTCMessageSignData;
        if (baseSignData != null) {
        }
    }

    public final boolean copydefault() {
        return ABTestManager.AEQbTJ.KWHzl(new TaskDescription(), AmplitudeName.WEB3);
    }
}
