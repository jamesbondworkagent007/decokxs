package o;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.FlowExtKt;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.okinc.business.defi.wallet.hardware.bluetooth.HardwareWalletBluetoothDelegate;
import com.okinc.business.defi.wallet.hardware.onekey.OneKeyConnectEvent;
import com.okinc.business.defi.wallet.hardware.onekey.checkdevicestatus.CheckDeviceStatusDialog$onCreateView$2;
import com.okinc.business.defi.wallet.hardware.onekey.checkdevicestatus.CheckDeviceStatusDialog$onCreateView$4;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public abstract class eHM extends wXX {
    public final float copydefault = 0.54f;

    public abstract InterfaceC15430eIa OLrzqt();

    public abstract void copydefault();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.wXX
    public float getHeightScale() {
        return this.copydefault;
    }

    @Override // o.wXX, androidx.fragment.app.Fragment
    public android.view.View onCreateView(@NotNull android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        C16534elj c16534eljKWHzl = C16534elj.KWHzl(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(c16534eljKWHzl, "");
        android.widget.ImageView imageView = c16534eljKWHzl.copydefault;
        imageView.setOnClickListener(new Application(imageView, 1000L, this));
        HardwareWalletBluetoothDelegate hardwareWalletBluetoothDelegate = new HardwareWalletBluetoothDelegate();
        getLifecycle().addObserver(hardwareWalletBluetoothDelegate);
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
        hardwareWalletBluetoothDelegate.EZpvd(fragmentActivityRequireActivity, new CheckDeviceStatusDialog$onCreateView$2(OLrzqt()), new Function0() { // from class: o.eHP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return eHM.AEQbTJ(this.KWHzl);
            }
        });
        Flow flowOnEach = FlowKt.onEach(FlowExtKt.flowWithLifecycle$default(OLrzqt().KWHzl(), getViewLifecycleOwner().getLifecycle(), null, 2, null), new CheckDeviceStatusDialog$onCreateView$4(c16534eljKWHzl));
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        FlowKt.launchIn(flowOnEach, LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner));
        copydefault();
        ConstraintLayout root = c16534eljKWHzl.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        return root;
    }

    public static final Unit AEQbTJ(eHM ehm) {
        OneKeyConnectEvent.ShowNotification showNotification = OneKeyConnectEvent.ShowNotification.BluetoothError;
        android.content.Context contextRequireContext = ehm.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        C15406eHd.KWHzl(contextRequireContext, showNotification.getTitle());
        ehm.dismiss();
        return Unit.INSTANCE;
    }

    public static final /* synthetic */ java.lang.Object copydefault(C16534elj c16534elj, eHS ehs, Continuation continuation) {
        eHR.OLrzqt(c16534elj, ehs);
        return Unit.INSTANCE;
    }

    @Override // o.wXX, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public void onCancel(@NotNull android.content.DialogInterface dialogInterface) {
        Intrinsics.checkNotNullParameter(dialogInterface, "");
        super.onCancel(dialogInterface);
        OLrzqt().copydefault();
    }

    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ eHM KWHzl;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, eHM ehm) {
            this.copydefault = view;
            this.OLrzqt = j;
            this.KWHzl = ehm;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.OLrzqt || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                android.app.Dialog dialog = this.KWHzl.getDialog();
                if (dialog != null) {
                    dialog.cancel();
                }
            }
        }
    }
}
