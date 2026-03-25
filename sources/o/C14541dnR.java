package o;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentActivity;
import com.okinc.components.track.bean.EventParam;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.p2p.api.OtcExtraKeys;
import com.okinc.wallet.hardware.api.ledger.model.BluetoothDeviceModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.ActivityC15363eFo;
import o.C13754dXa;
import o.C57032yak;
import o.eGQ;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.dnR, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C14541dnR extends AbstractC52796wYr implements C57032yak.TaskDescription {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int OLrzqt = 8;
    public int KWHzl = 1;
    public boolean copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.C57032yak.TaskDescription
    public void OLrzqt(@NotNull BluetoothDeviceModel bluetoothDeviceModel) {
        Intrinsics.checkNotNullParameter(bluetoothDeviceModel, "");
        this.copydefault = false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.C57032yak.TaskDescription
    public void copydefault(@NotNull InterfaceC57036yao interfaceC57036yao) {
        Intrinsics.checkNotNullParameter(interfaceC57036yao, "");
        this.copydefault = true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.wXX
    public int getSoftInputStyle() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.wXX
    public void setSoftInputStyle(int i) {
        this.KWHzl = i;
    }

    /* JADX INFO: renamed from: o.dnR$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.dnR.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final C14541dnR copydefault(int i) {
            C14541dnR c14541dnR = new C14541dnR();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putInt(OtcExtraKeys.MODE, i);
            c14541dnR.setArguments(bundle);
            return c14541dnR;
        }
    }

    private final int AEQbTJ() {
        android.os.Bundle arguments = getArguments();
        if (arguments != null) {
            return arguments.getInt(OtcExtraKeys.MODE, 1);
        }
        return 1;
    }

    private final boolean KWHzl() {
        return ((InterfaceC57001yaF) C43251rlk.copydefault(InterfaceC57001yaF.class)).copydefault();
    }

    @Override // o.AbstractC52796wYr, o.wXX
    public void onCreateHeader(@NotNull C52781wYc c52781wYc) {
        Intrinsics.checkNotNullParameter(c52781wYc, "");
        super.onCreateHeader(c52781wYc);
        c52781wYc.setType(2);
        c52781wYc.setOnClickListener(new View.OnClickListener() { // from class: o.dnV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C14541dnR.copydefault(this.AEQbTJ, view);
            }
        });
    }

    public static final void copydefault(C14541dnR c14541dnR, android.view.View view) {
        c14541dnR.dismissAllowingStateLoss();
    }

    @Override // o.AbstractC52796wYr, o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        android.widget.TextView textViewFARcdN = fARcdN();
        if (textViewFARcdN != null) {
            C55307xhV.AEQbTJ(textViewFARcdN, C33070mpX.AYXKKw(C13754dXa.FragmentManager.stopBehavioSecDataCollection));
        }
        EZpvd();
    }

    public final void EZpvd() {
        try {
            final FragmentActivity fragmentActivityRequireActivity = requireActivity();
            Intrinsics.copydefault(fragmentActivityRequireActivity);
            java.util.ArrayList arrayList = new java.util.ArrayList(3);
            C55377xim c55377xim = new C55377xim(fragmentActivityRequireActivity, null, 2, null);
            c55377xim.setTitleText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.svY));
            c55377xim.setStartDrawable(ContextCompat.getDrawable(fragmentActivityRequireActivity, C13754dXa.Activity.zsXlph));
            c55377xim.setClickCallback(new Function0() { // from class: o.dnU
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C14541dnR.copydefault(fragmentActivityRequireActivity, this);
                }
            });
            final C55377xim c55377xim2 = new C55377xim(fragmentActivityRequireActivity, null, 2, null);
            c55377xim2.setTitleText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.sendBehavioSecData));
            c55377xim2.setStartDrawable(ContextCompat.getDrawable(fragmentActivityRequireActivity, C13754dXa.Activity.AubY));
            c55377xim2.setClickCallback(new Function0() { // from class: o.dnY
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C14541dnR.AEQbTJ(c55377xim2, this);
                }
            });
            C55377xim c55377xim3 = new C55377xim(fragmentActivityRequireActivity, null, 2, null);
            c55377xim3.setTitleText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.sbu));
            c55377xim3.setStartDrawable(ContextCompat.getDrawable(fragmentActivityRequireActivity, C13754dXa.Activity.fFgQHt));
            c55377xim3.setClickCallback(new Function0() { // from class: o.dnW
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C14541dnR.OLrzqt(this.AEQbTJ, fragmentActivityRequireActivity);
                }
            });
            arrayList.add(c55377xim);
            if (KWHzl()) {
                arrayList.add(c55377xim2);
                arrayList.add(c55377xim3);
            }
            EZpvd(arrayList);
        } catch (java.lang.Exception unused) {
        }
    }

    public static final Unit copydefault(FragmentActivity fragmentActivity, C14541dnR c14541dnR) {
        dTU.onWeb3Event$default("Web3WalletAddWallet_Sheet_ConnectHardwareWallet_Click", null, new Function1() { // from class: o.dnX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C14541dnR.AEQbTJ((EventParamsList) obj);
            }
        }, 1, null);
        eCS.Companion.EZpvd(fragmentActivity, c14541dnR.AEQbTJ());
        c14541dnR.dismissAllowingStateLoss();
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.add(new EventParam("brand_name", "keystone", true));
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(C55377xim c55377xim, C14541dnR c14541dnR) {
        eGQ.Activity activity = eGQ.Companion;
        android.content.Context context = c55377xim.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        activity.copydefault(context, c14541dnR.AEQbTJ());
        c14541dnR.dismissAllowingStateLoss();
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(C14541dnR c14541dnR, FragmentActivity fragmentActivity) {
        dTU.onWeb3Event$default("Web3WalletAddWallet_Sheet_ConnectHardwareWallet_Click", null, new Function1() { // from class: o.dnZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C14541dnR.copydefault((EventParamsList) obj);
            }
        }, 1, null);
        if (C13992dcz.AEQbTJ.OLrzqt()) {
            C57032yak.AEQbTJ.EZpvd(c14541dnR);
            ActivityC15302eDh.Companion.copydefault(fragmentActivity);
        } else {
            eEY.Companion.copydefault(fragmentActivity, c14541dnR.AEQbTJ(), "from_import");
            c14541dnR.dismissAllowingStateLoss();
        }
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.add(new EventParam("brand_name", "ledger", true));
        return Unit.INSTANCE;
    }

    @Override // o.wXX, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        view.post(new java.lang.Runnable() { // from class: o.dnQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C14541dnR.EZpvd(this.KWHzl);
            }
        });
    }

    public static final void EZpvd(C14541dnR c14541dnR) {
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) c14541dnR, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        if (this.copydefault) {
            this.copydefault = false;
            C57032yak.AEQbTJ.KWHzl(this);
            ActivityC15363eFo.ActionBar actionBar = ActivityC15363eFo.Companion;
            FragmentActivity fragmentActivityRequireActivity = requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
            actionBar.KWHzl(fragmentActivityRequireActivity, AEQbTJ(), "from_import");
            dismissAllowingStateLoss();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        C57032yak.AEQbTJ.KWHzl(this);
    }

    @Override // o.C57032yak.TaskDescription
    public void EZpvd(@NotNull BluetoothDeviceModel bluetoothDeviceModel) {
        Intrinsics.checkNotNullParameter(bluetoothDeviceModel, "");
        C13992dcz.AEQbTJ.EZpvd(bluetoothDeviceModel);
        this.copydefault = false;
    }
}
