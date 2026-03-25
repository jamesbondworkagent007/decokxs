package o;

import com.okinc.wallet.hardware.api.ledger.model.BluetoothDeviceModel;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yak, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C57032yak implements InterfaceC56999yaD {
    public static final C57032yak AEQbTJ = new C57032yak();
    public static final InterfaceC56387yDm KWHzl = C56392yDr.copydefault(new Function0() { // from class: o.yai
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C57032yak.EZpvd();
        }
    });
    public static final int OLrzqt = 8;

    /* JADX INFO: renamed from: o.yak$Activity */
    public interface Activity {
        void KWHzl(@NotNull BluetoothDeviceModel bluetoothDeviceModel);
    }

    /* JADX INFO: renamed from: o.yak$StateListAnimator */
    public interface StateListAnimator {
        void AEQbTJ();

        void KWHzl();
    }

    /* JADX INFO: renamed from: o.yak$TaskDescription */
    public interface TaskDescription {
        void EZpvd(@NotNull BluetoothDeviceModel bluetoothDeviceModel);

        void OLrzqt(@NotNull BluetoothDeviceModel bluetoothDeviceModel);

        void copydefault(@NotNull InterfaceC57036yao interfaceC57036yao);
    }

    private C57032yak() {
    }

    public final InterfaceC56999yaD gEmmrt() {
        return (InterfaceC56999yaD) KWHzl.getValue();
    }

    public static final InterfaceC56999yaD EZpvd() {
        return ((InterfaceC57001yaF) C43251rlk.copydefault(InterfaceC57001yaF.class)).AEQbTJ();
    }

    public final boolean djBIcL() {
        boolean zCopydefault = ((InterfaceC57001yaF) C43251rlk.copydefault(InterfaceC57001yaF.class)).copydefault();
        if (!zCopydefault) {
            pUU.copydefault("LedgerManager", "Bluetooth not supported, skipping operations");
        }
        return zCopydefault;
    }

    @Override // o.InterfaceC56999yaD
    public boolean copydefault() {
        if (djBIcL()) {
            return gEmmrt().copydefault();
        }
        return false;
    }

    @Override // o.InterfaceC56999yaD
    public AbstractC58260yxt<java.lang.Boolean> KWHzl() {
        if (djBIcL()) {
            return gEmmrt().KWHzl();
        }
        AbstractC58260yxt<java.lang.Boolean> abstractC58260yxtCopydefault = AbstractC58260yxt.copydefault(java.lang.Boolean.FALSE);
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtCopydefault, "");
        return abstractC58260yxtCopydefault;
    }

    @Override // o.InterfaceC56999yaD
    public void AhwBna() {
        if (djBIcL()) {
            gEmmrt().AhwBna();
        }
    }

    @Override // o.InterfaceC56999yaD
    public void AYXKKw() {
        if (djBIcL()) {
            gEmmrt().AYXKKw();
        }
    }

    @Override // o.InterfaceC56999yaD
    public boolean EZpvd(@NotNull android.content.Context context, @NotNull BluetoothDeviceModel bluetoothDeviceModel) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(bluetoothDeviceModel, "");
        if (djBIcL()) {
            return gEmmrt().EZpvd(context, bluetoothDeviceModel);
        }
        return false;
    }

    @Override // o.InterfaceC56999yaD
    public void OLrzqt(@NotNull BluetoothDeviceModel bluetoothDeviceModel) {
        Intrinsics.checkNotNullParameter(bluetoothDeviceModel, "");
        if (djBIcL()) {
            gEmmrt().OLrzqt(bluetoothDeviceModel);
        }
    }

    @Override // o.InterfaceC56999yaD
    public void copydefault(@NotNull BluetoothDeviceModel bluetoothDeviceModel) {
        Intrinsics.checkNotNullParameter(bluetoothDeviceModel, "");
        if (djBIcL()) {
            gEmmrt().copydefault(bluetoothDeviceModel);
        }
    }

    @Override // o.InterfaceC56999yaD
    public void EZpvd(@NotNull BluetoothDeviceModel bluetoothDeviceModel) {
        Intrinsics.checkNotNullParameter(bluetoothDeviceModel, "");
        if (djBIcL()) {
            gEmmrt().EZpvd(bluetoothDeviceModel);
        }
    }

    @Override // o.InterfaceC56999yaD
    public void copydefault(@NotNull InterfaceC57025yad interfaceC57025yad) {
        Intrinsics.checkNotNullParameter(interfaceC57025yad, "");
        if (djBIcL()) {
            gEmmrt().copydefault(interfaceC57025yad);
        }
    }

    @Override // o.InterfaceC56999yaD
    public void AEQbTJ(@NotNull InterfaceC57025yad interfaceC57025yad) {
        Intrinsics.checkNotNullParameter(interfaceC57025yad, "");
        if (djBIcL()) {
            gEmmrt().AEQbTJ(interfaceC57025yad);
        }
    }

    @Override // o.InterfaceC56999yaD
    public void copydefault(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
        if (djBIcL()) {
            gEmmrt().copydefault(activity);
        }
    }

    @Override // o.InterfaceC56999yaD
    public void OLrzqt(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
        if (djBIcL()) {
            gEmmrt().OLrzqt(activity);
        }
    }

    @Override // o.InterfaceC56999yaD
    public void AEQbTJ(@NotNull StateListAnimator stateListAnimator) {
        Intrinsics.checkNotNullParameter(stateListAnimator, "");
        if (djBIcL()) {
            gEmmrt().AEQbTJ(stateListAnimator);
        }
    }

    @Override // o.InterfaceC56999yaD
    public void EZpvd(@NotNull StateListAnimator stateListAnimator) {
        Intrinsics.checkNotNullParameter(stateListAnimator, "");
        if (djBIcL()) {
            gEmmrt().EZpvd(stateListAnimator);
        }
    }

    @Override // o.InterfaceC56999yaD
    public void EZpvd(@NotNull TaskDescription taskDescription) {
        Intrinsics.checkNotNullParameter(taskDescription, "");
        if (djBIcL()) {
            gEmmrt().EZpvd(taskDescription);
        }
    }

    @Override // o.InterfaceC56999yaD
    public void KWHzl(@NotNull TaskDescription taskDescription) {
        Intrinsics.checkNotNullParameter(taskDescription, "");
        if (djBIcL()) {
            gEmmrt().KWHzl(taskDescription);
        }
    }

    @Override // o.InterfaceC56999yaD
    public InterfaceC57036yao AEQbTJ() {
        if (djBIcL()) {
            return gEmmrt().AEQbTJ();
        }
        return null;
    }

    @Override // o.InterfaceC56999yaD
    public boolean AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (djBIcL()) {
            return gEmmrt().AEQbTJ(str);
        }
        return false;
    }
}
