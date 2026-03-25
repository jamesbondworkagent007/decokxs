package com.okinc.business.defi.wallet.hardware.onekey;

import androidx.lifecycle.ViewModel;
import com.okinc.business.defi.wallet.hardware.onekey.OneKeyConnectEvent;
import com.okinc.wallet.hardware.api.onekey.OneKeyDevice;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.C56402yEa;
import o.InterfaceC15415eHm;
import o.InterfaceC57025yad;
import o.InterfaceC57039yar;
import o.eFO;
import o.yCM;
import o.yDY;
import o.yED;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class HardwareWalletOneKeyScanningViewModel extends ViewModel implements InterfaceC57025yad {
    public final Channel<OneKeyConnectEvent.ShowNotification> AEQbTJ;
    public final Application AhwBna;
    public final InterfaceC57039yar EZpvd;
    public final MutableStateFlow<InterfaceC15415eHm> KWHzl;
    public final Set<Integer> OLrzqt;
    public final Flow<OneKeyConnectEvent.ShowNotification> copydefault;
    public final StateFlow<InterfaceC15415eHm> gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Flow<OneKeyConnectEvent.ShowNotification> AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<InterfaceC15415eHm> KWHzl() {
        return this.gEmmrt;
    }

    @yCM
    public HardwareWalletOneKeyScanningViewModel(@NotNull InterfaceC57039yar interfaceC57039yar) {
        Intrinsics.checkNotNullParameter(interfaceC57039yar, "");
        this.EZpvd = interfaceC57039yar;
        this.OLrzqt = yED.AEQbTJ(12);
        MutableStateFlow<InterfaceC15415eHm> MutableStateFlow = StateFlowKt.MutableStateFlow(new InterfaceC15415eHm.Activity(yDY.AhwBna()));
        this.KWHzl = MutableStateFlow;
        this.gEmmrt = MutableStateFlow;
        Channel<OneKeyConnectEvent.ShowNotification> channelChannel$default = ChannelKt.Channel$default(Integer.MAX_VALUE, null, null, 6, null);
        this.AEQbTJ = channelChannel$default;
        this.copydefault = FlowKt.receiveAsFlow(channelChannel$default);
        this.AhwBna = new Application();
        interfaceC57039yar.copydefault(this);
        copydefault();
    }

    public static final class Application implements InterfaceC57039yar.TaskDescription {
        public Application() {
        }

        @Override // o.InterfaceC57039yar.TaskDescription
        public void OLrzqt(OneKeyDevice oneKeyDevice) {
            Intrinsics.checkNotNullParameter(oneKeyDevice, "");
            HardwareWalletOneKeyScanningViewModel.this.OLrzqt(oneKeyDevice);
        }

        @Override // o.InterfaceC57039yar.TaskDescription
        public void KWHzl() {
            HardwareWalletOneKeyScanningViewModel.this.EZpvd.copydefault();
            HardwareWalletOneKeyScanningViewModel.this.EZpvd.OLrzqt(this);
            HardwareWalletOneKeyScanningViewModel.this.AEQbTJ.mo5769trySendJP2dKIU(OneKeyConnectEvent.ShowNotification.BluetoothError);
        }
    }

    @Override // androidx.lifecycle.ViewModel
    public void onCleared() {
        this.EZpvd.copydefault();
        this.EZpvd.OLrzqt(this.AhwBna);
        this.EZpvd.AEQbTJ(this);
        super.onCleared();
    }

    @Override // o.InterfaceC57025yad
    public void AEQbTJ(int i) {
        if (!this.OLrzqt.contains(Integer.valueOf(i))) {
            this.KWHzl.setValue(InterfaceC15415eHm.TaskDescription.AEQbTJ);
        } else {
            this.KWHzl.setValue(new InterfaceC15415eHm.Activity(yDY.AhwBna()));
            copydefault();
        }
    }

    public final void EZpvd() {
        this.EZpvd.copydefault();
        this.EZpvd.OLrzqt(this.AhwBna);
    }

    public final void copydefault() {
        this.EZpvd.KWHzl(this.AhwBna);
        this.EZpvd.KWHzl();
        Iterator<T> it = this.EZpvd.OLrzqt().iterator();
        while (it.hasNext()) {
            OLrzqt((OneKeyDevice) it.next());
        }
    }

    public final void OLrzqt(OneKeyDevice oneKeyDevice) {
        InterfaceC15415eHm value;
        boolean z;
        InterfaceC15415eHm.Activity activityEZpvd;
        MutableStateFlow<InterfaceC15415eHm> mutableStateFlow = this.KWHzl;
        do {
            value = mutableStateFlow.getValue();
            InterfaceC15415eHm interfaceC15415eHm = value;
            List<OneKeyDevice> listOLrzqt = this.EZpvd.OLrzqt();
            if ((listOLrzqt instanceof Collection) && listOLrzqt.isEmpty()) {
                z = false;
            } else {
                Iterator<T> it = listOLrzqt.iterator();
                while (it.hasNext()) {
                    if (Intrinsics.EZpvd((Object) ((OneKeyDevice) it.next()).getConnectId(), (Object) oneKeyDevice.getConnectId())) {
                        z = true;
                        break;
                    }
                }
                z = false;
            }
            if (Intrinsics.EZpvd(interfaceC15415eHm, InterfaceC15415eHm.TaskDescription.AEQbTJ)) {
                activityEZpvd = new InterfaceC15415eHm.Activity(C56402yEa.EZpvd(new eFO(oneKeyDevice, z)));
            } else {
                if (!(interfaceC15415eHm instanceof InterfaceC15415eHm.Activity)) {
                    throw new NoWhenBranchMatchedException();
                }
                InterfaceC15415eHm.Activity activity = (InterfaceC15415eHm.Activity) interfaceC15415eHm;
                List listCopydefault = CollectionsKt___CollectionsKt.copydefault((Collection<? extends eFO>) activity.EZpvd(), new eFO(oneKeyDevice, z));
                HashSet hashSet = new HashSet();
                ArrayList arrayList = new ArrayList();
                for (Object obj : listCopydefault) {
                    if (hashSet.add(((eFO) obj).AEQbTJ().getConnectId())) {
                        arrayList.add(obj);
                    }
                }
                activityEZpvd = activity.EZpvd(arrayList);
            }
        } while (!mutableStateFlow.compareAndSet(value, activityEZpvd));
    }
}
