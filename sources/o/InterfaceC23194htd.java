package o;

import androidx.activity.result.ActivityResultLauncher;
import androidx.fragment.app.FragmentActivity;
import com.okinc.business.defi.api.bean.DappInteractionArgs;
import com.okinc.business.defi.api.bean.DexTransferData;
import com.okinc.business.defi.api.bean.NewCallbackBean;
import com.okinc.business.defi.api.model.tx.signdata.SignDataArgs;
import com.okinc.business.dexlogic.bean.ApproveUnsignedData;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.wallet.api.MpcWalletService;
import com.okinc.wallet.api.WalletDexService;
import com.okinc.wallet.api.bean.WalletAddressBookGroupBean;
import com.okinc.wallet.api.bean.WalletScanInformationBean;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.flow.FlowCollector;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.htd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public interface InterfaceC23194htd {
    InterfaceC9738bbJ AEQbTJ();

    AbstractC58185ywX<WalletDexService.AAFreeGasInfo> AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2);

    void AEQbTJ(@NotNull android.content.Context context, long j, @NotNull java.lang.String str, @NotNull androidx.fragment.app.FragmentManager fragmentManager, Function1<? super android.os.Bundle, Unit> function1);

    void AEQbTJ(@NotNull androidx.fragment.app.FragmentManager fragmentManager, long j, @NotNull InterfaceC9738bbJ interfaceC9738bbJ, @NotNull xWC xwc);

    void AEQbTJ(@NotNull AbstractActivityC33041mov abstractActivityC33041mov, @NotNull java.lang.String str, @NotNull java.lang.String str2, java.util.ArrayList<java.lang.String> arrayList, java.util.ArrayList<java.lang.String> arrayList2, java.lang.Integer num);

    InterfaceC9740bbL AYXKKw();

    java.lang.String AhwBna();

    C57567ykp DbNXlk();

    C54845xXl EZpvd(boolean z);

    AbstractC58185ywX<java.util.ArrayList<WalletDexService.SupportedMevNodeBean>> EZpvd();

    AbstractC58185ywX<java.lang.String> EZpvd(@NotNull FragmentActivity fragmentActivity, @NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull java.lang.String str, @NotNull ApproveUnsignedData approveUnsignedData, boolean z, Function1<? super NewCallbackBean, ? extends AbstractC58185ywX<ResponseData<java.lang.String>>> function1);

    AbstractC58185ywX<C9860bdZ> EZpvd(@NotNull java.lang.String str);

    AbstractC58185ywX<WalletDexService.FeeInfo> EZpvd(@NotNull java.lang.String str, java.lang.String str2, @NotNull java.lang.String str3, @NotNull DexTransferData dexTransferData);

    void EZpvd(@NotNull android.content.Context context, @NotNull ActivityResultLauncher<android.content.Intent> activityResultLauncher);

    boolean EZpvd(long j);

    boolean EZpvd(@NotNull java.lang.String str, @NotNull InterfaceC9738bbJ interfaceC9738bbJ);

    java.lang.Object KWHzl(@NotNull FlowCollector<? super xWY> flowCollector, @NotNull Continuation<? super Unit> continuation);

    java.lang.String KWHzl(@NotNull java.lang.String str);

    java.lang.String KWHzl(@NotNull java.lang.String str, int i);

    java.lang.String KWHzl(java.lang.String str, @NotNull java.lang.String str2);

    AbstractC58185ywX<java.lang.String> KWHzl();

    AbstractC58260yxt<kotlin.Pair<InterfaceC9734bbF, java.lang.String>> KWHzl(@NotNull DappInteractionArgs dappInteractionArgs, Function1<? super NewCallbackBean, ? extends AbstractC58185ywX<ResponseData<java.lang.String>>> function1);

    AbstractC58260yxt<kotlin.Pair<InterfaceC9734bbF, java.lang.String>> KWHzl(@NotNull SignDataArgs<?> signDataArgs);

    void KWHzl(@NotNull InterfaceC9738bbJ interfaceC9738bbJ, @NotNull FragmentActivity fragmentActivity, @NotNull Function1<? super MpcWalletService.MpcWalletAbleStatus, Unit> function1);

    void KWHzl(@NotNull AbstractActivityC33041mov abstractActivityC33041mov, @NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull InterfaceC9738bbJ interfaceC9738bbJ, Function0<Unit> function0);

    void KWHzl(boolean z, @NotNull C54845xXl c54845xXl);

    boolean KWHzl(@NotNull InterfaceC9738bbJ interfaceC9738bbJ);

    java.lang.String OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2);

    AbstractC58260yxt<InterfaceC9738bbJ> OLrzqt();

    void OLrzqt(@NotNull java.lang.String str);

    boolean OLrzqt(@NotNull java.lang.String str, long j);

    boolean OLrzqt(@NotNull InterfaceC9738bbJ interfaceC9738bbJ, @NotNull java.lang.String str, boolean z);

    WalletScanInformationBean copydefault(@NotNull java.lang.String str);

    java.lang.String copydefault();

    AbstractC58260yxt<java.util.ArrayList<WalletAddressBookGroupBean>> copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2);

    void copydefault(@NotNull AbstractActivityC33041mov abstractActivityC33041mov, @NotNull java.lang.String str, @NotNull java.lang.String str2);

    void copydefault(@NotNull C54848xXo c54848xXo);

    boolean copydefault(long j);

    boolean copydefault(@NotNull java.lang.String str, long j);

    boolean copydefault(@NotNull InterfaceC9738bbJ interfaceC9738bbJ);

    AbstractC58185ywX<java.lang.Boolean> djBIcL();

    C57567ykp fetchVPNInfo();

    java.util.Map<java.lang.String, java.lang.String> gEmmrt();

    InterfaceC9738bbJ valueOf();

    /* JADX INFO: renamed from: o.htd$Application */
    public static final class Application {
        /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: o.htd */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void showRechargeDialog$default(InterfaceC23194htd interfaceC23194htd, AbstractActivityC33041mov abstractActivityC33041mov, java.lang.String str, java.lang.String str2, java.util.ArrayList arrayList, java.util.ArrayList arrayList2, java.lang.Integer num, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showRechargeDialog");
            }
            if ((i & 8) != 0) {
                arrayList = yDY.copydefault("dex", "gas_station");
            }
            interfaceC23194htd.AEQbTJ(abstractActivityC33041mov, str, str2, arrayList, (i & 16) != 0 ? null : arrayList2, (i & 32) != 0 ? null : num);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: o.htd */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ AbstractC58185ywX openNeedBroadCastGasStationPasswordDialog$default(InterfaceC23194htd interfaceC23194htd, FragmentActivity fragmentActivity, androidx.fragment.app.FragmentManager fragmentManager, java.lang.String str, ApproveUnsignedData approveUnsignedData, boolean z, Function1 function1, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: openNeedBroadCastGasStationPasswordDialog");
            }
            if ((i & 32) != 0) {
                function1 = null;
            }
            return interfaceC23194htd.EZpvd(fragmentActivity, fragmentManager, str, approveUnsignedData, z, function1);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: o.htd */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void showChainRegisterDialog$default(InterfaceC23194htd interfaceC23194htd, android.content.Context context, long j, java.lang.String str, androidx.fragment.app.FragmentManager fragmentManager, Function1 function1, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showChainRegisterDialog");
            }
            if ((i & 16) != 0) {
                function1 = null;
            }
            interfaceC23194htd.AEQbTJ(context, j, str, fragmentManager, function1);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.htd */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void routeBackupWallet$default(InterfaceC23194htd interfaceC23194htd, AbstractActivityC33041mov abstractActivityC33041mov, androidx.fragment.app.FragmentManager fragmentManager, InterfaceC9738bbJ interfaceC9738bbJ, Function0 function0, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: routeBackupWallet");
            }
            if ((i & 8) != 0) {
                function0 = null;
            }
            interfaceC23194htd.KWHzl(abstractActivityC33041mov, fragmentManager, interfaceC9738bbJ, function0);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.htd */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ AbstractC58260yxt buildContractTransaction$default(InterfaceC23194htd interfaceC23194htd, DappInteractionArgs dappInteractionArgs, Function1 function1, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: buildContractTransaction");
            }
            if ((i & 2) != 0) {
                function1 = null;
            }
            return interfaceC23194htd.KWHzl(dappInteractionArgs, (Function1<? super NewCallbackBean, ? extends AbstractC58185ywX<ResponseData<java.lang.String>>>) function1);
        }
    }
}
