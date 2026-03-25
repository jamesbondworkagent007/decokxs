package o;

import androidx.activity.result.ActivityResultCallback;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import com.okinc.business.defi.api.bean.AASignData;
import com.okinc.business.defi.api.bean.AASubSignData;
import com.okinc.business.defi.api.bean.Contract;
import com.okinc.business.defi.api.bean.DappInteractionArgs;
import com.okinc.business.defi.api.bean.DappSignArgs;
import com.okinc.business.defi.api.bean.DuplicateOrder;
import com.okinc.business.defi.api.bean.DuplicateOrderReq;
import com.okinc.business.defi.api.bean.NewCallbackBean;
import com.okinc.business.defi.api.bean.NewSignCallbackBean;
import com.okinc.business.defi.api.bean.Parameter;
import com.okinc.business.defi.api.bean.RawData;
import com.okinc.business.defi.api.bean.SignData;
import com.okinc.business.defi.api.bean.SimpleSubmitTxReq;
import com.okinc.business.defi.api.bean.SwitchNetworkInput;
import com.okinc.business.defi.api.bean.SwitchNetworkResult;
import com.okinc.business.defi.api.bean.TrxDappSignData;
import com.okinc.business.defi.api.bean.UTXOConfirmBalanceReq;
import com.okinc.business.defi.api.bean.UTXOConfirmBalanceResp;
import com.okinc.business.defi.api.bean.UTXONFTListReq;
import com.okinc.business.defi.api.bean.UTXONFTListResp;
import com.okinc.business.defi.api.bean.Value;
import com.okinc.business.defi.api.model.tx.signdata.BaseSignData;
import com.okinc.business.defi.api.model.tx.signdata.EVM5792ContractSignData;
import com.okinc.business.defi.api.model.tx.signdata.EVMMessageSignData;
import com.okinc.business.defi.api.model.tx.signdata.MessageSignData;
import com.okinc.business.defi.api.model.tx.signdata.SignDataArgs;
import com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction;
import com.okinc.business.defi.biz.core.tx.check.ChainCheckType;
import com.okinc.business.defi.biz.core.tx.check.ChainStatus;
import com.okinc.business.defi.biz.core.tx.check.ChainStatusChecker;
import com.okinc.business.defi.biz.model.ChainAddress;
import com.okinc.business.defi.biz.net.bean.EIP7702ChainStatusResp;
import com.okinc.business.defi.biz.net.bean.EVM5792Capability;
import com.okinc.business.defi.impl.WalletDappServiceImpl$get5792CallsStatus$1;
import com.okinc.business.defi.impl.WalletDappServiceImpl$get5792Capabilities$1;
import com.okinc.business.defi.impl.WalletDappServiceImpl$getGeneralChainIdFromCaipChainId$1;
import com.okinc.business.defi.impl.WalletDappServiceImpl$getGeneralChainIdFromCaipChainId$2;
import com.okinc.business.defi.impl.WalletDappServiceImpl$updateCosmosReferencesAndChainIds$2;
import com.okinc.business.defi.wallet.common.WalletConnectUtils;
import com.okinc.business.defi.wallet.eip7702.data.model.EIP7702ChainStatus;
import com.okinc.business.defi.wallet.switchComponent.activity.DappSwitchNetworkActivity;
import com.okinc.network.okg.response.OKServerException;
import com.okinc.network.okg.response.ResponseData;
import com.reown.android.internal.common.signing.eip1271.EIP1271Verifier;
import java.util.LinkedHashMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.TimeoutKt;
import kotlinx.coroutines.reactive.AwaitKt;
import o.AbstractC43419rot;
import o.AbstractDialogInterfaceOnKeyListenerC57208yeA;
import o.C12827cuN;
import o.C13502dNs;
import o.C13754dXa;
import o.C15935eaT;
import o.InterfaceC13987dcu;
import o.InterfaceC9737bbI;
import o.InterfaceC9854bdT;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.dNs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C13502dNs extends AbstractC43215rlA implements InterfaceC9854bdT {
    public static final TaskDescription Companion = new TaskDescription(null);

    /* JADX INFO: renamed from: o.dNs$ActionBar */
    public final /* synthetic */ class ActionBar {
        public static final /* synthetic */ int[] EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[ChainStatus.values().length];
            try {
                iArr[ChainStatus.REGISTERED.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[ChainStatus.REGISTERING.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[ChainStatus.UNREGISTERED.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            EZpvd = iArr;
        }
    }

    /* JADX INFO: renamed from: o.dNs$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.dNs.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final void KWHzl(@NotNull final android.content.Context context, @NotNull final DappInteractionArgs dappInteractionArgs, @NotNull final Function1<? super android.os.Bundle, Unit> function1, final Function1<? super NewCallbackBean, ? extends AbstractC58185ywX<ResponseData<java.lang.String>>> function12, final Function1<? super NewCallbackBean, ? extends AbstractC58185ywX<ResponseData<java.lang.String>>> function13, @NotNull final OKWBaseTransaction.TransactionType transactionType) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(dappInteractionArgs, "");
            Intrinsics.checkNotNullParameter(function1, "");
            Intrinsics.checkNotNullParameter(transactionType, "");
            AbstractActivityC33041mov abstractActivityC33041mov = context instanceof AbstractActivityC33041mov ? (AbstractActivityC33041mov) context : null;
            if (abstractActivityC33041mov != null && !abstractActivityC33041mov.isFinishing()) {
                abstractActivityC33041mov.showLoading();
            }
            AbstractC58260yxt<AbstractC12782ctV> abstractC58260yxtOLrzqt = C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null).OLrzqt(dappInteractionArgs.getWalletId(), true);
            final Function1 function14 = new Function1() { // from class: o.dNJ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C13502dNs.TaskDescription.EZpvd(context, dappInteractionArgs, function12, function13, transactionType, function1, (AbstractC12782ctV) obj);
                }
            };
            InterfaceC58227yxM<? super AbstractC12782ctV> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.dNK
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    C13502dNs.TaskDescription.AYXKKw(function14, obj);
                }
            };
            final Function1 function15 = new Function1() { // from class: o.dNM
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C13502dNs.TaskDescription.KWHzl(context, (java.lang.Throwable) obj);
                }
            };
            abstractC58260yxtOLrzqt.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.dNO
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    C13502dNs.TaskDescription.djBIcL(function15, obj);
                }
            });
        }

        public static final void AYXKKw(Function1 function1, java.lang.Object obj) {
            function1.invoke(obj);
        }

        public static final Unit EZpvd(android.content.Context context, DappInteractionArgs dappInteractionArgs, Function1 function1, Function1 function12, OKWBaseTransaction.TransactionType transactionType, final Function1 function13, AbstractC12782ctV abstractC12782ctV) {
            final FragmentActivity fragmentActivity;
            AbstractActivityC33041mov abstractActivityC33041mov = context instanceof AbstractActivityC33041mov ? (AbstractActivityC33041mov) context : null;
            if (abstractActivityC33041mov != null) {
                abstractActivityC33041mov.dismissLoading();
            }
            if (context instanceof FragmentActivity) {
                fragmentActivity = (FragmentActivity) context;
            } else {
                android.app.Activity activityAEQbTJ = C54819xWm.KWHzl().AEQbTJ();
                fragmentActivity = activityAEQbTJ instanceof FragmentActivity ? (FragmentActivity) activityAEQbTJ : null;
                if (fragmentActivity == null) {
                    return Unit.INSTANCE;
                }
            }
            C8396bBt c8396bBt = C8396bBt.AEQbTJ;
            Intrinsics.copydefault(abstractC12782ctV);
            final SignDataArgs<BaseSignData> signDataArgsKWHzl = c8396bBt.KWHzl(abstractC12782ctV, dappInteractionArgs, (Function1<? super NewCallbackBean, ? extends AbstractC58185ywX<ResponseData<java.lang.String>>>) function1, (Function1<? super NewCallbackBean, ? extends AbstractC58185ywX<ResponseData<java.lang.String>>>) function12, transactionType);
            if (signDataArgsKWHzl == null) {
                function13.invoke(null);
                return Unit.INSTANCE;
            }
            final Function0 function0 = new Function0() { // from class: o.dNE
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C13502dNs.TaskDescription.OLrzqt(fragmentActivity, signDataArgsKWHzl, function13);
                }
            };
            BaseSignData signData = signDataArgsKWHzl.getSignData();
            if (signData instanceof EVM5792ContractSignData) {
                C8955bMV.Companion.copydefault(fragmentActivity, abstractC12782ctV, signDataArgsKWHzl.getGeneralChainId(), (EVM5792ContractSignData) signData, new Function0() { // from class: o.dNG
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return C13502dNs.TaskDescription.EZpvd(function0);
                    }
                }, new Function0() { // from class: o.dNL
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return C13502dNs.TaskDescription.KWHzl(signDataArgsKWHzl, function13);
                    }
                });
            } else {
                function0.invoke();
            }
            return Unit.INSTANCE;
        }

        public static final Unit OLrzqt(FragmentActivity fragmentActivity, final SignDataArgs signDataArgs, final Function1 function1) {
            C9694baS.Companion.EZpvd(fragmentActivity, fXY.Companion.OLrzqt(fragmentActivity, signDataArgs), new Function2() { // from class: o.dNF
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return C13502dNs.TaskDescription.EZpvd(function1, signDataArgs, ((java.lang.Integer) obj).intValue(), (android.content.Intent) obj2);
                }
            });
            return Unit.INSTANCE;
        }

        public static final Unit EZpvd(Function1 function1, SignDataArgs signDataArgs, int i, android.content.Intent intent) {
            if (i == -1) {
                function1.invoke(intent != null ? intent.getExtras() : null);
            } else {
                C13502dNs.Companion.OLrzqt(signDataArgs);
                function1.invoke(null);
            }
            return Unit.INSTANCE;
        }

        public static final Unit EZpvd(Function0 function0) {
            function0.invoke();
            return Unit.INSTANCE;
        }

        public static final Unit KWHzl(SignDataArgs signDataArgs, Function1 function1) {
            C13502dNs.Companion.OLrzqt(signDataArgs);
            function1.invoke(null);
            return Unit.INSTANCE;
        }

        public static final void djBIcL(Function1 function1, java.lang.Object obj) {
            function1.invoke(obj);
        }

        public static final Unit KWHzl(android.content.Context context, java.lang.Throwable th) {
            AbstractActivityC33041mov abstractActivityC33041mov = context instanceof AbstractActivityC33041mov ? (AbstractActivityC33041mov) context : null;
            if (abstractActivityC33041mov != null) {
                abstractActivityC33041mov.dismissLoading();
            }
            pUU.copydefault("WalletDappServiceImpl", "startTransactionActivity error message :" + th.getMessage());
            return Unit.INSTANCE;
        }

        public final void copydefault(@NotNull android.content.Context context, @NotNull DappSignArgs dappSignArgs, final Function1<? super android.os.Bundle, Unit> function1) {
            FragmentActivity fragmentActivity;
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(dappSignArgs, "");
            if (context instanceof FragmentActivity) {
                fragmentActivity = (FragmentActivity) context;
            } else {
                android.app.Activity activityAEQbTJ = C54819xWm.KWHzl().AEQbTJ();
                fragmentActivity = activityAEQbTJ instanceof FragmentActivity ? (FragmentActivity) activityAEQbTJ : null;
                if (fragmentActivity == null) {
                    return;
                }
            }
            final SignDataArgs<MessageSignData> signDataArgsOLrzqt = C8396bBt.AEQbTJ.OLrzqt(dappSignArgs);
            if (signDataArgsOLrzqt == null) {
                return;
            }
            C9694baS.Companion.EZpvd(fragmentActivity, fXY.Companion.OLrzqt(fragmentActivity, signDataArgsOLrzqt), new Function2() { // from class: o.dNQ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return C13502dNs.TaskDescription.copydefault(function1, signDataArgsOLrzqt, ((java.lang.Integer) obj).intValue(), (android.content.Intent) obj2);
                }
            });
        }

        public static final Unit copydefault(Function1 function1, SignDataArgs signDataArgs, int i, android.content.Intent intent) {
            if (i != -1) {
                C13502dNs.Companion.OLrzqt(signDataArgs);
                if (function1 != null) {
                    function1.invoke(null);
                }
            } else if (function1 != null) {
                function1.invoke(intent != null ? intent.getExtras() : null);
            }
            return Unit.INSTANCE;
        }

        public final void OLrzqt(@NotNull SignDataArgs<?> signDataArgs) {
            Intrinsics.checkNotNullParameter(signDataArgs, "");
            java.lang.Integer txSource = signDataArgs.getTxSource();
            if (txSource != null && txSource.intValue() == 5) {
                java.lang.Long wcId = signDataArgs.getWcId();
                long jLongValue = wcId != null ? wcId.longValue() : 0L;
                BaseSignData signData = signDataArgs.getSignData();
                if ((signData instanceof EVMMessageSignData) && ((EVMMessageSignData) signData).getWcAuthRequestIssuer() != null) {
                    WalletConnectUtils.ActionBar.getInstance$default(WalletConnectUtils.Companion, null, 1, null).EZpvd(jLongValue);
                    return;
                }
                java.lang.String wcTopic = signDataArgs.getWcTopic();
                if (wcTopic == null || wcTopic.length() == 0) {
                    return;
                }
                WalletConnectUtils.rejectRequest$default(WalletConnectUtils.ActionBar.getInstance$default(WalletConnectUtils.Companion, null, 1, null), wcTopic, jLongValue, null, 0, 12, null);
            }
        }

        public final void copydefault(@NotNull final android.content.Context context, @NotNull final java.util.List<DappInteractionArgs> list, @NotNull final OKWBaseTransaction.TransactionType transactionType) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(transactionType, "");
            if (list.isEmpty()) {
                return;
            }
            AbstractActivityC33041mov abstractActivityC33041mov = context instanceof AbstractActivityC33041mov ? (AbstractActivityC33041mov) context : null;
            if (abstractActivityC33041mov != null) {
                abstractActivityC33041mov.showLoading();
            }
            AbstractC58260yxt<AbstractC12782ctV> abstractC58260yxtOLrzqt = C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null).OLrzqt(((DappInteractionArgs) CollectionsKt___CollectionsKt.AuCTelauCTel(list)).getWalletId(), true);
            final Function1 function1 = new Function1() { // from class: o.dNP
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C13502dNs.TaskDescription.OLrzqt(context, list, transactionType, (AbstractC12782ctV) obj);
                }
            };
            InterfaceC58227yxM<? super AbstractC12782ctV> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.dNR
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    C13502dNs.TaskDescription.copydefault(function1, obj);
                }
            };
            final Function1 function12 = new Function1() { // from class: o.dNI
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C13502dNs.TaskDescription.EZpvd(context, (java.lang.Throwable) obj);
                }
            };
            abstractC58260yxtOLrzqt.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.dNH
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    C13502dNs.TaskDescription.AhwBna(function12, obj);
                }
            });
        }

        public static final void copydefault(Function1 function1, java.lang.Object obj) {
            function1.invoke(obj);
        }

        public static final Unit OLrzqt(android.content.Context context, java.util.List list, OKWBaseTransaction.TransactionType transactionType, AbstractC12782ctV abstractC12782ctV) {
            FragmentActivity fragmentActivity;
            AbstractActivityC33041mov abstractActivityC33041mov = context instanceof AbstractActivityC33041mov ? (AbstractActivityC33041mov) context : null;
            if (abstractActivityC33041mov != null) {
                abstractActivityC33041mov.dismissLoading();
            }
            if (context instanceof FragmentActivity) {
                fragmentActivity = (FragmentActivity) context;
            } else {
                android.app.Activity activityAEQbTJ = C54819xWm.KWHzl().AEQbTJ();
                FragmentActivity fragmentActivity2 = activityAEQbTJ instanceof FragmentActivity ? (FragmentActivity) activityAEQbTJ : null;
                if (fragmentActivity2 == null) {
                    return Unit.INSTANCE;
                }
                fragmentActivity = fragmentActivity2;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                DappInteractionArgs dappInteractionArgs = (DappInteractionArgs) it.next();
                C8396bBt c8396bBt = C8396bBt.AEQbTJ;
                Intrinsics.copydefault(abstractC12782ctV);
                SignDataArgs<BaseSignData> signDataArgsKWHzl = c8396bBt.KWHzl(abstractC12782ctV, dappInteractionArgs, (Function1<? super NewCallbackBean, ? extends AbstractC58185ywX<ResponseData<java.lang.String>>>) null, (Function1<? super NewCallbackBean, ? extends AbstractC58185ywX<ResponseData<java.lang.String>>>) null, transactionType);
                if (signDataArgsKWHzl == null) {
                    return Unit.INSTANCE;
                }
                arrayList.add(signDataArgsKWHzl);
            }
            C9694baS.Companion.EZpvd(fragmentActivity, fXS.Companion.OLrzqt(fragmentActivity, arrayList), new Function2() { // from class: o.dNN
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return C13502dNs.TaskDescription.OLrzqt(((java.lang.Integer) obj).intValue(), (android.content.Intent) obj2);
                }
            });
            return Unit.INSTANCE;
        }

        public static final Unit OLrzqt(int i, android.content.Intent intent) {
            return Unit.INSTANCE;
        }

        public static final void AhwBna(Function1 function1, java.lang.Object obj) {
            function1.invoke(obj);
        }

        public static final Unit EZpvd(android.content.Context context, java.lang.Throwable th) {
            AbstractActivityC33041mov abstractActivityC33041mov = context instanceof AbstractActivityC33041mov ? (AbstractActivityC33041mov) context : null;
            if (abstractActivityC33041mov != null) {
                abstractActivityC33041mov.dismissLoading();
            }
            pUU.copydefault("WalletDappServiceImpl", "startTransactionActivity error message :" + th.getMessage());
            return Unit.INSTANCE;
        }
    }

    public static final void copydefault(C13502dNs c13502dNs, android.content.Context context, DappInteractionArgs dappInteractionArgs, Function1<? super android.os.Bundle, Unit> function1, Function1<? super NewCallbackBean, ? extends AbstractC58185ywX<ResponseData<java.lang.String>>> function12, Function1<? super NewCallbackBean, ? extends AbstractC58185ywX<ResponseData<java.lang.String>>> function13, java.lang.String str) {
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "") || Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) EIP1271Verifier.hexPrefix)) {
            InterfaceC9854bdT.Application.startTransferDapp$default(c13502dNs, context, dappInteractionArgs, function1, function12, null, 16, null);
            return;
        }
        if (C59449zhJ.startsWith$default(str, EIP1271Verifier.hexPrefix, false, 2, null)) {
            str = str.substring(2);
            Intrinsics.checkNotNullExpressionValue(str, "");
        }
        if (C59449zhJ.startsWith$default(str, "095ea7b3", false, 2, null)) {
            c13502dNs.AEQbTJ(context, dappInteractionArgs, function1, function12);
        } else {
            c13502dNs.KWHzl(context, dappInteractionArgs, function1, function12, function13);
        }
    }

    @Override // o.InterfaceC9854bdT
    public void AEQbTJ(@NotNull android.content.Context context, @NotNull DappInteractionArgs dappInteractionArgs, @NotNull Function1<? super android.os.Bundle, Unit> function1, Function1<? super NewCallbackBean, ? extends AbstractC58185ywX<ResponseData<java.lang.String>>> function12, Function1<? super NewCallbackBean, ? extends AbstractC58185ywX<ResponseData<java.lang.String>>> function13) {
        java.lang.String data;
        AASignData aASignData;
        java.util.List<AASubSignData> dataList;
        RawData raw_data;
        java.util.List<Contract> contract;
        Contract contract2;
        Parameter parameter;
        Value value;
        java.lang.String data2;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(dappInteractionArgs, "");
        Intrinsics.checkNotNullParameter(function1, "");
        C10854bwM c10854bwMCopydefault = C10954byG.EZpvd.valueOf().copydefault(C33129mqd.valueOf(dappInteractionArgs.getChainId()));
        if (c10854bwMCopydefault == null) {
            return;
        }
        if (c10854bwMCopydefault.QkdxfA()) {
            try {
                Result.Application application = Result.Companion;
                aASignData = (AASignData) C33490mxT.EZpvd(dappInteractionArgs.getSignDataJson(), AASignData.class);
            } catch (java.lang.Throwable th) {
                Result.Application application2 = Result.Companion;
                Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
            if (aASignData == null || (dataList = aASignData.getDataList()) == null || !(!dataList.isEmpty())) {
                Result.m7377constructorimpl(Unit.INSTANCE);
                SignData signData = (SignData) C33490mxT.EZpvd(dappInteractionArgs.getSignDataJson(), SignData.class);
                copydefault(this, context, dappInteractionArgs, function1, function12, function13, (signData == null || (data = signData.getData()) == null) ? "" : data);
                return;
            } else if (aASignData.getDataList().size() == 1 && aASignData.getDataList().get(0).isErc20Approval()) {
                AEQbTJ(context, dappInteractionArgs, function1, function12);
                return;
            } else {
                KWHzl(context, dappInteractionArgs, function1, function12, function13);
                return;
            }
        }
        if (c10854bwMCopydefault.run()) {
            TrxDappSignData trxDappSignData = (TrxDappSignData) C33490mxT.EZpvd(dappInteractionArgs.getSignDataJson(), TrxDappSignData.class);
            copydefault(this, context, dappInteractionArgs, function1, function12, function13, (trxDappSignData == null || (raw_data = trxDappSignData.getRaw_data()) == null || (contract = raw_data.getContract()) == null || (contract2 = (Contract) CollectionsKt___CollectionsKt.firstOrNull(contract)) == null || (parameter = contract2.getParameter()) == null || (value = parameter.getValue()) == null || (data2 = value.getData()) == null) ? "" : data2);
        } else {
            KWHzl(context, dappInteractionArgs, function1, function12, function13);
        }
    }

    public final void EZpvd(final android.content.Context context, final java.lang.String str, C10854bwM c10854bwM, final Function1<? super android.os.Bundle, Unit> function1, final Function0<Unit> function0) {
        final long jAhwBna = c10854bwM.AhwBna();
        final C10854bwM c10854bwMKWHzl = C10954byG.EZpvd.valueOf().KWHzl(java.lang.Long.valueOf(jAhwBna));
        final java.lang.String strOLrzqt = c10854bwMKWHzl != null ? c10854bwMKWHzl.OLrzqt() : null;
        if (strOLrzqt == null) {
            pUU.copydefault("WalletDappServiceImpl", "check register status: contractAddress is null");
            function1.invoke(null);
            return;
        }
        final java.util.List listEZpvd = C56402yEa.EZpvd(ChainCheckType.CHECK_REGISTER);
        android.app.Activity activityOLrzqt = C33569myt.OLrzqt(context);
        FragmentActivity fragmentActivity = activityOLrzqt instanceof FragmentActivity ? (FragmentActivity) activityOLrzqt : null;
        if (fragmentActivity == null) {
            pUU.copydefault("WalletDappServiceImpl", "check register status: cannot find FragmentActivity");
            function1.invoke(null);
            return;
        }
        final InterfaceC33075mpc interfaceC33075mpc = fragmentActivity instanceof InterfaceC33075mpc ? (InterfaceC33075mpc) fragmentActivity : null;
        if (interfaceC33075mpc != null) {
            interfaceC33075mpc.showLoadingAtOnce();
        }
        AbstractC58260yxt<AbstractC12782ctV> abstractC58260yxtEZpvd = EZpvd(str);
        final Function1 function12 = new Function1() { // from class: o.dNx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C13502dNs.copydefault(c10854bwMKWHzl, jAhwBna, strOLrzqt, listEZpvd, (AbstractC12782ctV) obj);
            }
        };
        AbstractC58185ywX<R> abstractC58185ywXKWHzl = abstractC58260yxtEZpvd.KWHzl(new InterfaceC58229yxO() { // from class: o.dNB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C13502dNs.OLrzqt(function12, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        final FragmentActivity fragmentActivity2 = fragmentActivity;
        yBI.subscribeBy$default(C58156yvv.OLrzqt(abstractC58185ywXKWHzl, fragmentActivity, Lifecycle.Event.ON_DESTROY), new Function1() { // from class: o.dNC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C13502dNs.KWHzl(interfaceC33075mpc, function1, (java.lang.Throwable) obj);
            }
        }, (Function0) null, new Function1() { // from class: o.dNz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C13502dNs.EZpvd(interfaceC33075mpc, function0, context, function1, fragmentActivity2, str, jAhwBna, (ChainStatus) obj);
            }
        }, 2, (java.lang.Object) null);
    }

    public static final InterfaceC60096zvd OLrzqt(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    public static final InterfaceC60096zvd copydefault(C10854bwM c10854bwM, long j, java.lang.String str, java.util.List list, AbstractC12782ctV abstractC12782ctV) {
        Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
        ChainAddress chainAddressAddressFromChainId$default = AbstractC12782ctV.addressFromChainId$default(abstractC12782ctV, c10854bwM.AEQbTJ(), null, 2, null);
        java.lang.String address = chainAddressAddressFromChainId$default != null ? chainAddressAddressFromChainId$default.getAddress() : null;
        return ChainStatusChecker.OLrzqt.OLrzqt(j, address == null ? "" : address, str, list);
    }

    public static final Unit EZpvd(InterfaceC33075mpc interfaceC33075mpc, Function0 function0, android.content.Context context, final Function1 function1, FragmentActivity fragmentActivity, java.lang.String str, long j, ChainStatus chainStatus) {
        pUU.KWHzl("WalletDappServiceImpl", "check register status: " + chainStatus);
        if (interfaceC33075mpc != null) {
            interfaceC33075mpc.dismissLoading();
        }
        int i = chainStatus == null ? -1 : ActionBar.EZpvd[chainStatus.ordinal()];
        if (i == 1) {
            function0.invoke();
        } else if (i == 2) {
            C55328xhq.show$default(C55328xhq.OLrzqt, context.getString(C13754dXa.FragmentManager.spnCvw), (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 62, (java.lang.Object) null);
            function1.invoke(null);
        } else if (i == 3) {
            C14083dek c14083dek = C14083dek.OLrzqt;
            androidx.fragment.app.FragmentManager supportFragmentManager = fragmentActivity.getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
            c14083dek.EZpvd(context, supportFragmentManager, str, j, new Function1() { // from class: o.dND
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C13502dNs.KWHzl(function1, (android.os.Bundle) obj);
                }
            });
        }
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(Function1 function1, android.os.Bundle bundle) {
        function1.invoke(bundle);
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(InterfaceC33075mpc interfaceC33075mpc, Function1 function1, java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        pUU.AEQbTJ("WalletDappServiceImpl", "check register status error", th);
        if (interfaceC33075mpc != null) {
            interfaceC33075mpc.dismissLoading();
        }
        C10857bwP.copydefault("WalletDappServiceImpl", th);
        function1.invoke(null);
        return Unit.INSTANCE;
    }

    public static final void copydefault(DappSignArgs dappSignArgs, Function1<? super NewSignCallbackBean, ? extends AbstractC58185ywX<ResponseData<java.lang.String>>> function1, C13502dNs c13502dNs, android.content.Context context, Function1<? super android.os.Bundle, Unit> function12) {
        java.lang.Integer source = dappSignArgs.getSource();
        if (source != null && source.intValue() == 7 && C33129mqd.valueOf(dappSignArgs.getChainId()) == 0) {
            C18390fhW c18390fhWOLrzqt = C18390fhW.Companion.OLrzqt(dappSignArgs, function1);
            androidx.fragment.app.FragmentManager fragmentManagerCopydefault = c13502dNs.copydefault(context);
            if (fragmentManagerCopydefault == null) {
                return;
            }
            c18390fhWOLrzqt.EZpvd(fragmentManagerCopydefault, "SignDappContainerFragment", new Application(function12));
            return;
        }
        Companion.copydefault(context, dappSignArgs, function12);
    }

    /* JADX INFO: renamed from: o.dNs$Application */
    public static final class Application implements AbstractDialogInterfaceOnKeyListenerC57208yeA.Activity {
        public final /* synthetic */ Function1<android.os.Bundle, Unit> EZpvd;

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.jvm.functions.Function1<? super android.os.Bundle, kotlin.Unit> */
        /* JADX WARN: Multi-variable type inference failed */
        public Application(Function1<? super android.os.Bundle, Unit> function1) {
            this.EZpvd = function1;
        }

        @Override // o.AbstractDialogInterfaceOnKeyListenerC57208yeA.Activity
        public void copydefault(android.os.Bundle bundle) {
            Function1<android.os.Bundle, Unit> function1 = this.EZpvd;
            if (function1 != null) {
                function1.invoke(bundle);
            }
        }
    }

    @Override // o.InterfaceC9854bdT
    public void EZpvd(@NotNull final android.content.Context context, @NotNull final DappSignArgs dappSignArgs, final Function1<? super android.os.Bundle, Unit> function1, final Function1<? super NewSignCallbackBean, ? extends AbstractC58185ywX<ResponseData<java.lang.String>>> function12) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(dappSignArgs, "");
        C10854bwM c10854bwMCopydefault = C10954byG.EZpvd.valueOf().copydefault(C33129mqd.valueOf(dappSignArgs.getChainId()));
        if (c10854bwMCopydefault != null && c10854bwMCopydefault.DCUTEIdCUTEI()) {
            EZpvd(context, dappSignArgs.getWalletId(), c10854bwMCopydefault, new Function1() { // from class: o.dNy
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C13502dNs.copydefault(function1, (android.os.Bundle) obj);
                }
            }, new Function0() { // from class: o.dNu
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C13502dNs.KWHzl(dappSignArgs, function12, this, context, function1);
                }
            });
        } else {
            copydefault(dappSignArgs, function12, this, context, function1);
        }
    }

    public static final Unit copydefault(Function1 function1, android.os.Bundle bundle) {
        if (function1 != null) {
            function1.invoke(bundle);
        }
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(DappSignArgs dappSignArgs, Function1 function1, C13502dNs c13502dNs, android.content.Context context, Function1 function12) {
        copydefault(dappSignArgs, (Function1<? super NewSignCallbackBean, ? extends AbstractC58185ywX<ResponseData<java.lang.String>>>) function1, c13502dNs, context, (Function1<? super android.os.Bundle, Unit>) function12);
        return Unit.INSTANCE;
    }

    @Override // o.InterfaceC9854bdT
    public void AEQbTJ(@NotNull android.content.Context context, @NotNull DappInteractionArgs dappInteractionArgs, @NotNull Function1<? super android.os.Bundle, Unit> function1, Function1<? super NewCallbackBean, ? extends AbstractC58185ywX<ResponseData<java.lang.String>>> function12) {
        OKWBaseTransaction.TransactionType transactionType;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(dappInteractionArgs, "");
        Intrinsics.checkNotNullParameter(function1, "");
        if (C33129mqd.valueOf(dappInteractionArgs.getChainId()) == 637) {
            transactionType = OKWBaseTransaction.TransactionType.Register;
        } else if (dappInteractionArgs.isCancelApprove()) {
            transactionType = OKWBaseTransaction.TransactionType.CancelApprove;
        } else {
            transactionType = OKWBaseTransaction.TransactionType.Approve;
        }
        Companion.KWHzl(context, dappInteractionArgs, function1, function12, null, transactionType);
    }

    @Override // o.InterfaceC9854bdT
    public void OLrzqt(@NotNull android.content.Context context, @NotNull java.util.List<DappInteractionArgs> list) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(list, "");
        Companion.copydefault(context, list, OKWBaseTransaction.TransactionType.CancelApprove);
    }

    @Override // o.InterfaceC9854bdT
    public void KWHzl(@NotNull final android.content.Context context, @NotNull final DappInteractionArgs dappInteractionArgs, @NotNull final Function1<? super android.os.Bundle, Unit> function1, final Function1<? super NewCallbackBean, ? extends AbstractC58185ywX<ResponseData<java.lang.String>>> function12, final Function1<? super NewCallbackBean, ? extends AbstractC58185ywX<ResponseData<java.lang.String>>> function13) {
        java.lang.Integer source;
        java.lang.Integer source2;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(dappInteractionArgs, "");
        Intrinsics.checkNotNullParameter(function1, "");
        C10854bwM c10854bwMCopydefault = C10954byG.EZpvd.valueOf().copydefault(C33129mqd.valueOf(dappInteractionArgs.getChainId()));
        if (c10854bwMCopydefault != null && c10854bwMCopydefault.DCUTEIdCUTEI() && (((source = dappInteractionArgs.getSource()) != null && source.intValue() == 7) || ((source2 = dappInteractionArgs.getSource()) != null && source2.intValue() == 5))) {
            EZpvd(context, dappInteractionArgs.getWalletId(), c10854bwMCopydefault, function1, new Function0() { // from class: o.dNw
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C13502dNs.AEQbTJ(this.AEQbTJ, context, dappInteractionArgs, function1, function12, function13);
                }
            });
        } else {
            copydefault(context, dappInteractionArgs, function1, function12, function13);
        }
    }

    public static final Unit AEQbTJ(C13502dNs c13502dNs, android.content.Context context, DappInteractionArgs dappInteractionArgs, Function1 function1, Function1 function12, Function1 function13) {
        c13502dNs.copydefault(context, dappInteractionArgs, (Function1<? super android.os.Bundle, Unit>) function1, (Function1<? super NewCallbackBean, ? extends AbstractC58185ywX<ResponseData<java.lang.String>>>) function12, (Function1<? super NewCallbackBean, ? extends AbstractC58185ywX<ResponseData<java.lang.String>>>) function13);
        return Unit.INSTANCE;
    }

    public final void copydefault(android.content.Context context, DappInteractionArgs dappInteractionArgs, Function1<? super android.os.Bundle, Unit> function1, Function1<? super NewCallbackBean, ? extends AbstractC58185ywX<ResponseData<java.lang.String>>> function12, Function1<? super NewCallbackBean, ? extends AbstractC58185ywX<ResponseData<java.lang.String>>> function13) {
        OKWBaseTransaction.TransactionType transactionType;
        C10854bwM c10854bwMCopydefault = C10954byG.EZpvd.valueOf().copydefault(C33129mqd.valueOf(dappInteractionArgs.getChainId()));
        if (c10854bwMCopydefault != null && c10854bwMCopydefault.fARcdN() && dappInteractionArgs.getMultiSignData()) {
            transactionType = OKWBaseTransaction.TransactionType.SolanaMultiSign;
        } else {
            transactionType = OKWBaseTransaction.TransactionType.Contract;
        }
        Companion.KWHzl(context, dappInteractionArgs, function1, function12, function13, transactionType);
    }

    @Override // o.InterfaceC9854bdT
    public void EZpvd(@NotNull android.content.Context context, @NotNull DappInteractionArgs dappInteractionArgs, @NotNull Function1<? super android.os.Bundle, Unit> function1, Function1<? super NewCallbackBean, ? extends AbstractC58185ywX<ResponseData<java.lang.String>>> function12, Function1<? super NewCallbackBean, ? extends AbstractC58185ywX<ResponseData<java.lang.String>>> function13) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(dappInteractionArgs, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Companion.KWHzl(context, dappInteractionArgs, function1, function12, null, OKWBaseTransaction.TransactionType.DappTransfer);
    }

    public final androidx.fragment.app.FragmentManager copydefault(android.content.Context context) {
        android.app.Activity activityOLrzqt = C33569myt.OLrzqt(context);
        FragmentActivity fragmentActivity = activityOLrzqt instanceof FragmentActivity ? (FragmentActivity) activityOLrzqt : null;
        if (fragmentActivity != null) {
            return fragmentActivity.getSupportFragmentManager();
        }
        return null;
    }

    @Override // o.InterfaceC9854bdT
    public void EZpvd(@NotNull android.content.Context context, @NotNull java.lang.String str, boolean z, boolean z2, java.lang.String str2, Function2<? super java.lang.String, ? super java.lang.String, Unit> function2) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        if (StringsKt__StringsKt.contains$default((java.lang.CharSequence) str, (java.lang.CharSequence) "wc:", false, 2, (java.lang.Object) null) && C59449zhJ.startsWith$default(str, "wc:", false, 2, null)) {
            C14748drM.KWHzl.EZpvd(str, function2);
        }
    }

    @Override // o.InterfaceC9854bdT
    public AbstractC58185ywX<DuplicateOrder> EZpvd(@NotNull DuplicateOrderReq duplicateOrderReq) {
        Intrinsics.checkNotNullParameter(duplicateOrderReq, "");
        return C43423rox.unwrapResponseData$default(new C13934dbu().KWHzl(duplicateOrderReq.getBizSource(), duplicateOrderReq.getBizHash()), (Function1) null, 1, (java.lang.Object) null);
    }

    /* JADX DEBUG: Type inference failed for r5v2. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<com.okinc.network.okg.response.ResponseData<java.lang.String>> */
    @Override // o.InterfaceC9854bdT
    public AbstractC58185ywX<ResponseData<java.lang.String>> AEQbTJ(@NotNull java.lang.String str, @NotNull final SimpleSubmitTxReq simpleSubmitTxReq) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(simpleSubmitTxReq, "");
        AbstractC58260yxt<AbstractC12782ctV> abstractC58260yxtOLrzqt = C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null).OLrzqt(str, false);
        final Function1 function1 = new Function1() { // from class: o.dNA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C13502dNs.OLrzqt(simpleSubmitTxReq, (AbstractC12782ctV) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXKWHzl = abstractC58260yxtOLrzqt.KWHzl(new InterfaceC58229yxO() { // from class: o.dNv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C13502dNs.EZpvd(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        return abstractC58185ywXKWHzl;
    }

    public static final InterfaceC60096zvd EZpvd(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    public static final InterfaceC60096zvd OLrzqt(SimpleSubmitTxReq simpleSubmitTxReq, AbstractC12782ctV abstractC12782ctV) {
        Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
        return new C13934dbu().AEQbTJ(abstractC12782ctV.DbNXlk(), abstractC12782ctV.USBtdM(), abstractC12782ctV.aUsmxb(), simpleSubmitTxReq);
    }

    @Override // o.InterfaceC9854bdT
    public AbstractC58185ywX<ResponseData<UTXOConfirmBalanceResp>> OLrzqt(@NotNull UTXOConfirmBalanceReq uTXOConfirmBalanceReq) {
        Intrinsics.checkNotNullParameter(uTXOConfirmBalanceReq, "");
        return new C13934dbu().AEQbTJ(uTXOConfirmBalanceReq);
    }

    @Override // o.InterfaceC9854bdT
    public AbstractC58185ywX<ResponseData<UTXONFTListResp>> OLrzqt(@NotNull UTXONFTListReq uTXONFTListReq) {
        Intrinsics.checkNotNullParameter(uTXONFTListReq, "");
        return new C13934dbu().OLrzqt(uTXONFTListReq);
    }

    public final AbstractC58260yxt<AbstractC12782ctV> EZpvd(java.lang.String str) {
        java.lang.Object next;
        java.util.Iterator<T> it = C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null).OLrzqt().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (Intrinsics.EZpvd((java.lang.Object) ((AbstractC12782ctV) next).DbNXlk(), (java.lang.Object) str)) {
                break;
            }
        }
        AbstractC12782ctV abstractC12782ctV = (AbstractC12782ctV) next;
        if (abstractC12782ctV != null) {
            AbstractC58260yxt<AbstractC12782ctV> abstractC58260yxtCopydefault = AbstractC58260yxt.copydefault(abstractC12782ctV);
            Intrinsics.copydefault(abstractC58260yxtCopydefault);
            return abstractC58260yxtCopydefault;
        }
        return C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null).OLrzqt(str, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00c1 A[Catch: Exception -> 0x00eb, TryCatch #0 {Exception -> 0x00eb, blocks: (B:38:0x00b4, B:39:0x00b9, B:41:0x00c1, B:43:0x00cf, B:37:0x00af, B:20:0x0047, B:27:0x0062, B:29:0x006a, B:31:0x0077, B:33:0x0087, B:44:0x00e5, B:23:0x004e, B:13:0x002f, B:34:0x009b), top: B:49:0x0025, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.InterfaceC9854bdT
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object EZpvd(@NotNull java.lang.String str, @NotNull Continuation<? super java.lang.String> continuation) throws java.lang.Throwable {
        WalletDappServiceImpl$getGeneralChainIdFromCaipChainId$1 walletDappServiceImpl$getGeneralChainIdFromCaipChainId$1;
        C13502dNs c13502dNs;
        if (continuation instanceof WalletDappServiceImpl$getGeneralChainIdFromCaipChainId$1) {
            walletDappServiceImpl$getGeneralChainIdFromCaipChainId$1 = (WalletDappServiceImpl$getGeneralChainIdFromCaipChainId$1) continuation;
            int i = walletDappServiceImpl$getGeneralChainIdFromCaipChainId$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                walletDappServiceImpl$getGeneralChainIdFromCaipChainId$1.label = i - Integer.MIN_VALUE;
            } else {
                walletDappServiceImpl$getGeneralChainIdFromCaipChainId$1 = new WalletDappServiceImpl$getGeneralChainIdFromCaipChainId$1(this, continuation);
            }
        }
        java.lang.Object objAwaitFirst = walletDappServiceImpl$getGeneralChainIdFromCaipChainId$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = walletDappServiceImpl$getGeneralChainIdFromCaipChainId$1.label;
        try {
            try {
            } catch (java.lang.Exception e) {
                pUU.AEQbTJ("WalletDappServiceImpl", "Failed to update Cosmos references", e);
            }
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objAwaitFirst);
                AbstractC58185ywX<java.lang.Boolean> abstractC58185ywXAEQbTJ = C10337bmZ.KWHzl.AEQbTJ(true);
                walletDappServiceImpl$getGeneralChainIdFromCaipChainId$1.L$0 = this;
                walletDappServiceImpl$getGeneralChainIdFromCaipChainId$1.L$1 = str;
                walletDappServiceImpl$getGeneralChainIdFromCaipChainId$1.label = 1;
                objAwaitFirst = AwaitKt.awaitFirst(abstractC58185ywXAEQbTJ, walletDappServiceImpl$getGeneralChainIdFromCaipChainId$1);
                if (objAwaitFirst == objCopydefault) {
                    return objCopydefault;
                }
                c13502dNs = this;
            } else {
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str = (java.lang.String) walletDappServiceImpl$getGeneralChainIdFromCaipChainId$1.L$0;
                    C56391yDq.AEQbTJ(objAwaitFirst);
                    pUU.EZpvd("WalletDappServiceImpl", "Finished updating Cosmos references");
                    InterfaceC13987dcu interfaceC13987dcuAEQbTJ = InterfaceC13987dcu.Companion.AEQbTJ(str);
                    java.lang.String string = interfaceC13987dcuAEQbTJ == null ? C56443yFo.KWHzl(interfaceC13987dcuAEQbTJ.OLrzqt()).toString() : null;
                    pUU.EZpvd("WalletDappServiceImpl", "Conversion result: " + string);
                    return string;
                }
                str = (java.lang.String) walletDappServiceImpl$getGeneralChainIdFromCaipChainId$1.L$1;
                c13502dNs = (C13502dNs) walletDappServiceImpl$getGeneralChainIdFromCaipChainId$1.L$0;
                C56391yDq.AEQbTJ(objAwaitFirst);
            }
            if (((java.lang.Boolean) objAwaitFirst).booleanValue()) {
                if (C59449zhJ.startsWith$default(str, InterfaceC13987dcu.Fragment.Companion.copydefault(), false, 2, null) && C15935eaT.ActionBar.getInstance$default(C15935eaT.Companion, null, 1, null).EZpvd().isEmpty()) {
                    pUU.EZpvd("WalletDappServiceImpl", "Start updating Cosmos references for " + str);
                    WalletDappServiceImpl$getGeneralChainIdFromCaipChainId$2 walletDappServiceImpl$getGeneralChainIdFromCaipChainId$2 = new WalletDappServiceImpl$getGeneralChainIdFromCaipChainId$2(c13502dNs, null);
                    walletDappServiceImpl$getGeneralChainIdFromCaipChainId$1.L$0 = str;
                    walletDappServiceImpl$getGeneralChainIdFromCaipChainId$1.L$1 = null;
                    walletDappServiceImpl$getGeneralChainIdFromCaipChainId$1.label = 2;
                    if (TimeoutKt.withTimeout(5000L, walletDappServiceImpl$getGeneralChainIdFromCaipChainId$2, walletDappServiceImpl$getGeneralChainIdFromCaipChainId$1) == objCopydefault) {
                        return objCopydefault;
                    }
                    pUU.EZpvd("WalletDappServiceImpl", "Finished updating Cosmos references");
                }
                InterfaceC13987dcu interfaceC13987dcuAEQbTJ2 = InterfaceC13987dcu.Companion.AEQbTJ(str);
                if (interfaceC13987dcuAEQbTJ2 == null) {
                }
                pUU.EZpvd("WalletDappServiceImpl", "Conversion result: " + string);
                return string;
            }
            pUU.copydefault("WalletDappServiceImpl", "WalletCore not initialized");
            return null;
        } catch (java.lang.Exception e2) {
            pUU.AEQbTJ("WalletDappServiceImpl", "Error in getGeneralChainIdFromCaipChainId", e2);
            return null;
        }
    }

    public final java.lang.Object AEQbTJ(Continuation<? super Unit> continuation) {
        java.lang.Object objWithContext = BuildersKt.withContext(Dispatchers.getIO(), new WalletDappServiceImpl$updateCosmosReferencesAndChainIds$2(null), continuation);
        return objWithContext == C56442yFn.copydefault() ? objWithContext : Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.InterfaceC9854bdT
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull Continuation<? super java.lang.String> continuation) throws java.lang.Throwable {
        WalletDappServiceImpl$get5792CallsStatus$1 walletDappServiceImpl$get5792CallsStatus$1;
        if (continuation instanceof WalletDappServiceImpl$get5792CallsStatus$1) {
            walletDappServiceImpl$get5792CallsStatus$1 = (WalletDappServiceImpl$get5792CallsStatus$1) continuation;
            int i = walletDappServiceImpl$get5792CallsStatus$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                walletDappServiceImpl$get5792CallsStatus$1.label = i - Integer.MIN_VALUE;
            } else {
                walletDappServiceImpl$get5792CallsStatus$1 = new WalletDappServiceImpl$get5792CallsStatus$1(this, continuation);
            }
        }
        java.lang.Object objEZpvd = walletDappServiceImpl$get5792CallsStatus$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = walletDappServiceImpl$get5792CallsStatus$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objEZpvd);
            C13934dbu c13934dbu = new C13934dbu();
            walletDappServiceImpl$get5792CallsStatus$1.label = 1;
            objEZpvd = c13934dbu.EZpvd(str, str2, walletDappServiceImpl$get5792CallsStatus$1);
            if (objEZpvd == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objEZpvd);
        }
        return ((AbstractC43419rot) objEZpvd).copydefault();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    @Override // o.InterfaceC9854bdT
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object KWHzl(@NotNull java.lang.String str, @NotNull java.util.List<java.lang.String> list, @NotNull Continuation<? super java.lang.String> continuation) throws java.lang.Throwable {
        WalletDappServiceImpl$get5792Capabilities$1 walletDappServiceImpl$get5792Capabilities$1;
        java.util.Map map;
        AbstractC43419rot actionBar;
        if (continuation instanceof WalletDappServiceImpl$get5792Capabilities$1) {
            walletDappServiceImpl$get5792Capabilities$1 = (WalletDappServiceImpl$get5792Capabilities$1) continuation;
            int i = walletDappServiceImpl$get5792Capabilities$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                walletDappServiceImpl$get5792Capabilities$1.label = i - Integer.MIN_VALUE;
            } else {
                walletDappServiceImpl$get5792Capabilities$1 = new WalletDappServiceImpl$get5792Capabilities$1(this, continuation);
            }
        }
        java.lang.Object objGEmmrt = walletDappServiceImpl$get5792Capabilities$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = walletDappServiceImpl$get5792Capabilities$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objGEmmrt);
            if (list.isEmpty()) {
                return "{}";
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(C56548yJl.copydefault(C56423yEv.copydefault(C56403yEb.AYXKKw(list, 10)), 16));
            for (java.lang.Object obj : list) {
                C10854bwM c10854bwM = (C10854bwM) InterfaceC9737bbI.Application.getChainMetaWithRealEvmChainId$default(C11627cVg.KWHzl, C33129mqd.valueOf(C33491mxU.OLrzqt((java.lang.String) obj)), false, 2, null);
                linkedHashMap.put(c10854bwM != null ? C56443yFo.KWHzl(c10854bwM.fetchVPNInfo()) : null, obj);
            }
            C13934dbu c13934dbu = new C13934dbu();
            walletDappServiceImpl$get5792Capabilities$1.L$0 = linkedHashMap;
            walletDappServiceImpl$get5792Capabilities$1.label = 1;
            objGEmmrt = c13934dbu.gEmmrt(str, walletDappServiceImpl$get5792Capabilities$1);
            if (objGEmmrt == objCopydefault) {
                return objCopydefault;
            }
            map = linkedHashMap;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            map = (java.util.Map) walletDappServiceImpl$get5792Capabilities$1.L$0;
            C56391yDq.AEQbTJ(objGEmmrt);
        }
        AbstractC43419rot abstractC43419rot = (AbstractC43419rot) objGEmmrt;
        boolean z = abstractC43419rot instanceof AbstractC43419rot.ActionBar;
        if (z) {
            C10857bwP.copydefault("OKWEVMSignEIP5792Helper", (OKServerException) ((AbstractC43419rot.ActionBar) abstractC43419rot).KWHzl());
        }
        if (abstractC43419rot instanceof AbstractC43419rot.StateListAnimator) {
            EIP7702ChainStatusResp eIP7702ChainStatusResp = (EIP7702ChainStatusResp) ((AbstractC43419rot.StateListAnimator) abstractC43419rot).KWHzl();
            java.util.List listQfsBiF = CollectionsKt___CollectionsKt.QfsBiF(map.keySet());
            java.util.List<EIP7702ChainStatusResp.ChainStatusItem> chainList = eIP7702ChainStatusResp.getChainList();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.Object obj2 : chainList) {
                if (listQfsBiF.contains(C56443yFo.KWHzl(((EIP7702ChainStatusResp.ChainStatusItem) obj2).getChainIndex()))) {
                    arrayList.add(obj2);
                }
            }
            actionBar = new AbstractC43419rot.StateListAnimator(arrayList);
        } else {
            if (!z) {
                throw new NoWhenBranchMatchedException();
            }
            actionBar = new AbstractC43419rot.ActionBar(((AbstractC43419rot.ActionBar) abstractC43419rot).KWHzl());
        }
        java.util.List<EIP7702ChainStatusResp.ChainStatusItem> list2 = (java.util.List) actionBar.copydefault();
        if (list2 == null) {
            return null;
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(C56548yJl.copydefault(C56423yEv.copydefault(C56403yEb.AYXKKw(list2, 10)), 16));
        for (EIP7702ChainStatusResp.ChainStatusItem chainStatusItem : list2) {
            kotlin.Pair pairOLrzqt = C56390yDp.OLrzqt(map.get(C56443yFo.KWHzl(chainStatusItem.getChainIndex())), new EVM5792Capability(new EVM5792Capability.EVM5792Atomic(EIP7702ChainStatus.Companion.copydefault(C56443yFo.AEQbTJ(chainStatusItem.getStatus())) == EIP7702ChainStatus.UpgradedOKX ? EVM5792Capability.EVM5792Atomic.STATUS_READY : EVM5792Capability.EVM5792Atomic.STATUS_SUPPORTED)));
            linkedHashMap2.put(pairOLrzqt.getFirst(), pairOLrzqt.getSecond());
        }
        return C33488mxR.EZpvd(linkedHashMap2);
    }

    @Override // o.InterfaceC9854bdT
    public void KWHzl(@NotNull android.app.Activity activity, @NotNull SwitchNetworkInput switchNetworkInput, @NotNull final Function1<? super SwitchNetworkResult, Unit> function1, @NotNull final Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(activity, "");
        Intrinsics.checkNotNullParameter(switchNetworkInput, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function0, "");
        FragmentActivity fragmentActivity = activity instanceof FragmentActivity ? (FragmentActivity) activity : null;
        if (fragmentActivity == null) {
            return;
        }
        fragmentActivity.getActivityResultRegistry().register("DappSwitchNetworkResult", DappSwitchNetworkActivity.ActionBar.copydefault, new ActivityResultCallback() { // from class: o.dNq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(java.lang.Object obj) {
                C13502dNs.KWHzl(function1, function0, (DappSwitchNetworkActivity.SwitchNetworkActivityResult) obj);
            }
        }).launch(new DappSwitchNetworkActivity.SwitchNetworkActivityInput(switchNetworkInput.getSelectedGeneralChainId(), switchNetworkInput.getPopularGeneralChainIds(), switchNetworkInput.getSupportedGeneralChainIds()));
    }

    public static final void KWHzl(Function1 function1, Function0 function0, DappSwitchNetworkActivity.SwitchNetworkActivityResult switchNetworkActivityResult) {
        if (switchNetworkActivityResult != null) {
            function1.invoke(new SwitchNetworkResult(switchNetworkActivityResult.getGeneralChainId()));
        } else {
            function0.invoke();
        }
    }
}
