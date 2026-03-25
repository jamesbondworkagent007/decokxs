package o;

import android.content.DialogInterface;
import androidx.fragment.app.FragmentActivity;
import com.okinc.business.defi.biz.wallethardware.ledger.LedgerSignHelper;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.wallet.hardware.api.ledger.LedgerSupportedApp;
import com.okinc.wallet.hardware.api.ledger.model.BluetoothDeviceModel;
import com.okinc.wallet.hardware.api.ledger.model.LedgerError;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.eDA;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class eFB {
    public static C15299eDe AEQbTJ;
    public static final eFB KWHzl = new eFB();
    public static final int OLrzqt = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final void AEQbTJ(android.content.DialogInterface dialogInterface) {
        AEQbTJ = null;
    }

    private eFB() {
    }

    public final <T> AbstractC58185ywX<ResponseData<T>> EZpvd(@NotNull AbstractC58185ywX<ResponseData<T>> abstractC58185ywX, @NotNull final FragmentActivity fragmentActivity, @NotNull final C10854bwM c10854bwM, @NotNull final AbstractC12782ctV abstractC12782ctV, final boolean z) {
        Intrinsics.checkNotNullParameter(abstractC58185ywX, "");
        Intrinsics.checkNotNullParameter(fragmentActivity, "");
        Intrinsics.checkNotNullParameter(c10854bwM, "");
        Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
        if (!abstractC12782ctV.gHZMYf() && !abstractC12782ctV.iwGUEr() && !abstractC12782ctV.sSMYrx()) {
            return abstractC58185ywX;
        }
        final Function1 function1 = new Function1() { // from class: o.eFF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Boolean.valueOf(eFB.copydefault(fragmentActivity, c10854bwM, z, abstractC12782ctV, (ResponseData) obj));
            }
        };
        AbstractC58185ywX<ResponseData<T>> abstractC58185ywXKWHzl = abstractC58185ywX.KWHzl(new InterfaceC58239yxY() { // from class: o.eFC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58239yxY
            public final boolean test(java.lang.Object obj) {
                return eFB.EZpvd(function1, obj);
            }
        });
        final Function1 function12 = new Function1() { // from class: o.eFD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return eFB.OLrzqt((ResponseData) obj);
            }
        };
        AbstractC58185ywX<ResponseData<T>> abstractC58185ywX2 = (AbstractC58185ywX<ResponseData<T>>) abstractC58185ywXKWHzl.AEQbTJ(new InterfaceC58229yxO() { // from class: o.eFK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return eFB.KWHzl(function12, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywX2, "");
        return abstractC58185ywX2;
    }

    public static final boolean EZpvd(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return ((java.lang.Boolean) function1.invoke(obj)).booleanValue();
    }

    public static final boolean copydefault(FragmentActivity fragmentActivity, C10854bwM c10854bwM, boolean z, AbstractC12782ctV abstractC12782ctV, ResponseData responseData) {
        C13854daT c13854daTFetchVPNInfo;
        Intrinsics.checkNotNullParameter(responseData, "");
        switch (responseData.getCode()) {
            case 73819761:
                eDA.Companion.copydefault(fragmentActivity, 14, (8 & 4) != 0 ? null : null, (8 & 8) != 0 ? null : c10854bwM.djBIcL(), AEQbTJ != null ? true : z);
                return true;
            case 73819762:
                eDA.Companion.copydefault(fragmentActivity, 13, (8 & 4) != 0 ? null : null, (8 & 8) != 0 ? null : c10854bwM.djBIcL(), AEQbTJ != null ? true : z);
                return true;
            case 73819763:
                LedgerSupportedApp ledgerSupportedAppCopydefault = LedgerSignHelper.AEQbTJ.copydefault(c10854bwM);
                if (ledgerSupportedAppCopydefault == null) {
                    return true;
                }
                eDA.TaskDescription taskDescription = eDA.Companion;
                taskDescription.copydefault(fragmentActivity, taskDescription.copydefault(responseData.getError_code().length() == 0 ? LedgerError.UNKNOWN_ERROR : LedgerError.Companion.EZpvd(responseData.getError_code())), (8 & 4) != 0 ? null : ledgerSupportedAppCopydefault, (8 & 8) != 0 ? null : null, AEQbTJ != null ? true : z);
                return true;
            case 73819764:
                AbstractC12784ctX abstractC12784ctXGwTjWJ = abstractC12782ctV.gwTjWJ();
                if (abstractC12784ctXGwTjWJ == null || (c13854daTFetchVPNInfo = abstractC12784ctXGwTjWJ.fetchVPNInfo()) == null) {
                    return true;
                }
                BluetoothDeviceModel bluetoothDeviceModel = new BluetoothDeviceModel(c13854daTFetchVPNInfo.AEQbTJ(), c13854daTFetchVPNInfo.AYXKKw(), "");
                if (C57032yak.AEQbTJ.EZpvd(fragmentActivity, bluetoothDeviceModel)) {
                    ActivityC15318eDx.Companion.KWHzl(fragmentActivity, bluetoothDeviceModel, AEQbTJ != null ? true : z);
                    return true;
                }
                eDC.Companion.KWHzl(fragmentActivity, bluetoothDeviceModel, true, AEQbTJ != null ? true : z);
                return true;
            case 73819765:
                LedgerSupportedApp ledgerSupportedAppCopydefault2 = LedgerSignHelper.AEQbTJ.copydefault(c10854bwM);
                if (ledgerSupportedAppCopydefault2 == null) {
                    return true;
                }
                eDA.Companion.copydefault(fragmentActivity, 5, (8 & 4) != 0 ? null : ledgerSupportedAppCopydefault2, (8 & 8) != 0 ? null : null, AEQbTJ != null ? true : z);
                return true;
            case 73819766:
                eDA.Companion.copydefault(fragmentActivity, 7, (8 & 4) != 0 ? null : null, (8 & 8) != 0 ? null : null, AEQbTJ != null ? true : z);
                return true;
            case 73819767:
                LedgerSupportedApp ledgerSupportedAppCopydefault3 = LedgerSignHelper.AEQbTJ.copydefault(c10854bwM);
                if (ledgerSupportedAppCopydefault3 == null) {
                    return true;
                }
                eDA.Companion.copydefault(fragmentActivity, 11, (8 & 4) != 0 ? null : ledgerSupportedAppCopydefault3, (8 & 8) != 0 ? null : null, AEQbTJ != null ? true : z);
                return true;
            case 73819768:
                C15299eDe c15299eDe = new C15299eDe();
                fragmentActivity.getSupportFragmentManager().beginTransaction().add(c15299eDe, (java.lang.String) null).commitAllowingStateLoss();
                c15299eDe.AEQbTJ(new DialogInterface.OnDismissListener() { // from class: o.eFE
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // android.content.DialogInterface.OnDismissListener
                    public final void onDismiss(android.content.DialogInterface dialogInterface) {
                        eFB.AEQbTJ(dialogInterface);
                    }
                });
                AEQbTJ = c15299eDe;
                return false;
            case 73819769:
                C15299eDe c15299eDe2 = AEQbTJ;
                if (c15299eDe2 != null) {
                    c15299eDe2.dismissAllowingStateLoss();
                }
                AEQbTJ = null;
                return false;
            default:
                return true;
        }
    }

    public static final ResponseData KWHzl(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (ResponseData) function1.invoke(obj);
    }

    public static final ResponseData OLrzqt(ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        switch (responseData.getCode()) {
            case 73819761:
            case 73819762:
                return ResponseData.copy$default(responseData, -5006, null, null, null, null, null, 62, null);
            case 73819763:
            case 73819764:
            case 73819765:
            case 73819766:
            case 73819767:
                return ResponseData.copy$default(responseData, -5007, null, null, null, null, null, 62, null);
            case 73819768:
            case 73819769:
            default:
                return responseData;
            case 73819770:
                return ResponseData.copy$default(responseData, -5000, null, null, null, null, null, 62, null);
        }
    }
}
