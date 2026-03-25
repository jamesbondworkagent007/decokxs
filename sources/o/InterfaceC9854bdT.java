package o;

import com.okinc.business.defi.api.bean.DappInteractionArgs;
import com.okinc.business.defi.api.bean.DappSignArgs;
import com.okinc.business.defi.api.bean.DuplicateOrder;
import com.okinc.business.defi.api.bean.DuplicateOrderReq;
import com.okinc.business.defi.api.bean.NewCallbackBean;
import com.okinc.business.defi.api.bean.NewSignCallbackBean;
import com.okinc.business.defi.api.bean.SimpleSubmitTxReq;
import com.okinc.business.defi.api.bean.SwitchNetworkInput;
import com.okinc.business.defi.api.bean.SwitchNetworkResult;
import com.okinc.business.defi.api.bean.UTXOConfirmBalanceReq;
import com.okinc.business.defi.api.bean.UTXOConfirmBalanceResp;
import com.okinc.business.defi.api.bean.UTXONFTListReq;
import com.okinc.business.defi.api.bean.UTXONFTListResp;
import com.okinc.network.okg.response.ResponseData;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.bdT, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public interface InterfaceC9854bdT extends InterfaceC43217rlC {
    AbstractC58185ywX<ResponseData<java.lang.String>> AEQbTJ(@NotNull java.lang.String str, @NotNull SimpleSubmitTxReq simpleSubmitTxReq);

    void AEQbTJ(@NotNull android.content.Context context, @NotNull DappInteractionArgs dappInteractionArgs, @NotNull Function1<? super android.os.Bundle, Unit> function1, Function1<? super NewCallbackBean, ? extends AbstractC58185ywX<ResponseData<java.lang.String>>> function12);

    void AEQbTJ(@NotNull android.content.Context context, @NotNull DappInteractionArgs dappInteractionArgs, @NotNull Function1<? super android.os.Bundle, Unit> function1, Function1<? super NewCallbackBean, ? extends AbstractC58185ywX<ResponseData<java.lang.String>>> function12, Function1<? super NewCallbackBean, ? extends AbstractC58185ywX<ResponseData<java.lang.String>>> function13);

    java.lang.Object EZpvd(@NotNull java.lang.String str, @NotNull Continuation<? super java.lang.String> continuation);

    AbstractC58185ywX<DuplicateOrder> EZpvd(@NotNull DuplicateOrderReq duplicateOrderReq);

    void EZpvd(@NotNull android.content.Context context, @NotNull DappInteractionArgs dappInteractionArgs, @NotNull Function1<? super android.os.Bundle, Unit> function1, Function1<? super NewCallbackBean, ? extends AbstractC58185ywX<ResponseData<java.lang.String>>> function12, Function1<? super NewCallbackBean, ? extends AbstractC58185ywX<ResponseData<java.lang.String>>> function13);

    void EZpvd(@NotNull android.content.Context context, @NotNull DappSignArgs dappSignArgs, Function1<? super android.os.Bundle, Unit> function1, Function1<? super NewSignCallbackBean, ? extends AbstractC58185ywX<ResponseData<java.lang.String>>> function12);

    void EZpvd(@NotNull android.content.Context context, @NotNull java.lang.String str, boolean z, boolean z2, java.lang.String str2, Function2<? super java.lang.String, ? super java.lang.String, Unit> function2);

    java.lang.Object KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull Continuation<? super java.lang.String> continuation);

    java.lang.Object KWHzl(@NotNull java.lang.String str, @NotNull java.util.List<java.lang.String> list, @NotNull Continuation<? super java.lang.String> continuation);

    void KWHzl(@NotNull android.app.Activity activity, @NotNull SwitchNetworkInput switchNetworkInput, @NotNull Function1<? super SwitchNetworkResult, Unit> function1, @NotNull Function0<Unit> function0);

    void KWHzl(@NotNull android.content.Context context, @NotNull DappInteractionArgs dappInteractionArgs, @NotNull Function1<? super android.os.Bundle, Unit> function1, Function1<? super NewCallbackBean, ? extends AbstractC58185ywX<ResponseData<java.lang.String>>> function12, Function1<? super NewCallbackBean, ? extends AbstractC58185ywX<ResponseData<java.lang.String>>> function13);

    AbstractC58185ywX<ResponseData<UTXOConfirmBalanceResp>> OLrzqt(@NotNull UTXOConfirmBalanceReq uTXOConfirmBalanceReq);

    AbstractC58185ywX<ResponseData<UTXONFTListResp>> OLrzqt(@NotNull UTXONFTListReq uTXONFTListReq);

    void OLrzqt(@NotNull android.content.Context context, @NotNull java.util.List<DappInteractionArgs> list);

    /* JADX INFO: renamed from: o.bdT$Application */
    public static final class Application {
        /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: o.bdT */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void startContractTx$default(InterfaceC9854bdT interfaceC9854bdT, android.content.Context context, DappInteractionArgs dappInteractionArgs, Function1 function1, Function1 function12, Function1 function13, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: startContractTx");
            }
            if ((i & 16) != 0) {
                function13 = null;
            }
            interfaceC9854bdT.AEQbTJ(context, dappInteractionArgs, function1, function12, function13);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: o.bdT */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void startSignDapp$default(InterfaceC9854bdT interfaceC9854bdT, android.content.Context context, DappSignArgs dappSignArgs, Function1 function1, Function1 function12, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: startSignDapp");
            }
            if ((i & 4) != 0) {
                function1 = null;
            }
            if ((i & 8) != 0) {
                function12 = null;
            }
            interfaceC9854bdT.EZpvd(context, dappSignArgs, function1, function12);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: o.bdT */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void startContractInteraction$default(InterfaceC9854bdT interfaceC9854bdT, android.content.Context context, DappInteractionArgs dappInteractionArgs, Function1 function1, Function1 function12, Function1 function13, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: startContractInteraction");
            }
            if ((i & 16) != 0) {
                function13 = null;
            }
            interfaceC9854bdT.KWHzl(context, dappInteractionArgs, function1, function12, function13);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: o.bdT */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void startTransferDapp$default(InterfaceC9854bdT interfaceC9854bdT, android.content.Context context, DappInteractionArgs dappInteractionArgs, Function1 function1, Function1 function12, Function1 function13, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: startTransferDapp");
            }
            if ((i & 16) != 0) {
                function13 = null;
            }
            interfaceC9854bdT.EZpvd(context, dappInteractionArgs, function1, function12, function13);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r9v0, resolved type: o.bdT */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void jumpUrl$default(InterfaceC9854bdT interfaceC9854bdT, android.content.Context context, java.lang.String str, boolean z, boolean z2, java.lang.String str2, Function2 function2, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: jumpUrl");
            }
            interfaceC9854bdT.EZpvd(context, str, (i & 4) != 0 ? false : z, (i & 8) != 0 ? false : z2, (i & 16) != 0 ? null : str2, (i & 32) != 0 ? null : function2);
        }
    }
}
