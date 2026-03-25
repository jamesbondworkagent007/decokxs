package o;

import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.okinc.business.defi.biz.walletconnect.ShowWCAuthRequestArgs;
import com.okinc.business.defi.wallet.common.WalletConnectUtils;
import com.okinc.business.defi.wallet.home.walletconnect.WalletConnectConnectionMgmtViewModel$disconnect$1;
import com.okinc.business.defi.wallet.home.walletconnect.WalletConnectConnectionMgmtViewModel$disconnect$2;
import com.okinc.business.defi.wallet.home.walletconnect.WalletConnectConnectionMgmtViewModel$initDataList$1;
import com.okinc.business.defi.wallet.home.walletconnect.WalletConnectConnectionMgmtViewModel$listenOkxConnectStateChanges$1;
import com.okinc.business.defi.wallet.home.walletconnect.WalletConnectConnectionMgmtViewModel$listenTonConnectStateChanges$1;
import com.okinc.business.defi.wallet.home.walletconnect.WalletConnectedData;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fge, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C18345fge extends ViewModel {
    public final C16058eck AEQbTJ;
    public final Activity AhwBna;
    public final C15935eaT EZpvd;
    public final WalletConnectUtils KWHzl;
    public final StateFlow<java.util.List<WalletConnectedData>> OLrzqt;
    public final MutableStateFlow<java.util.List<WalletConnectedData>> copydefault;
    public final java.lang.String valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<java.util.List<WalletConnectedData>> copydefault() {
        return this.OLrzqt;
    }

    public C18345fge(@NotNull WalletConnectUtils walletConnectUtils, @NotNull C16058eck c16058eck, @NotNull C15935eaT c15935eaT, @NotNull SavedStateHandle savedStateHandle) {
        Intrinsics.checkNotNullParameter(walletConnectUtils, "");
        Intrinsics.checkNotNullParameter(c16058eck, "");
        Intrinsics.checkNotNullParameter(c15935eaT, "");
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
        this.KWHzl = walletConnectUtils;
        this.AEQbTJ = c16058eck;
        this.EZpvd = c15935eaT;
        java.lang.String str = (java.lang.String) savedStateHandle.get("walletId");
        this.valueOf = str != null ? str : "";
        MutableStateFlow<java.util.List<WalletConnectedData>> MutableStateFlow = StateFlowKt.MutableStateFlow(null);
        this.copydefault = MutableStateFlow;
        this.OLrzqt = FlowKt.asStateFlow(MutableStateFlow);
        Activity activity = new Activity();
        this.AhwBna = activity;
        EZpvd();
        walletConnectUtils.AEQbTJ(activity);
        KWHzl();
        OLrzqt();
    }

    /* JADX INFO: renamed from: o.fge$Activity */
    public static final class Activity implements WalletConnectUtils.StateListAnimator {
        public Activity() {
        }

        @Override // com.okinc.business.defi.wallet.common.WalletConnectUtils.StateListAnimator
        public void AEQbTJ(ShowWCAuthRequestArgs showWCAuthRequestArgs) {
            WalletConnectUtils.StateListAnimator.Activity.EZpvd(this, showWCAuthRequestArgs);
        }

        @Override // com.okinc.business.defi.wallet.common.WalletConnectUtils.StateListAnimator
        public void AEQbTJ(java.lang.String str, java.lang.String str2) {
            WalletConnectUtils.StateListAnimator.Activity.KWHzl(this, str, str2);
        }

        @Override // com.okinc.business.defi.wallet.common.WalletConnectUtils.StateListAnimator
        public void KWHzl(java.lang.String str) {
            WalletConnectUtils.StateListAnimator.Activity.KWHzl(this, str);
        }

        @Override // com.okinc.business.defi.wallet.common.WalletConnectUtils.StateListAnimator
        public void KWHzl(java.lang.String str, java.lang.String str2) {
            WalletConnectUtils.StateListAnimator.Activity.EZpvd(this, str, str2);
        }

        @Override // com.okinc.business.defi.wallet.common.WalletConnectUtils.StateListAnimator
        public void OLrzqt(java.lang.String str) {
            WalletConnectUtils.StateListAnimator.Activity.EZpvd(this, str);
        }

        @Override // com.okinc.business.defi.wallet.common.WalletConnectUtils.StateListAnimator
        public void OLrzqt(java.lang.String str, java.lang.String str2) {
            WalletConnectUtils.StateListAnimator.Activity.AEQbTJ(this, str, str2);
        }

        @Override // com.okinc.business.defi.wallet.common.WalletConnectUtils.StateListAnimator
        public void copydefault(java.lang.String str, java.lang.String str2) {
            WalletConnectUtils.StateListAnimator.Activity.copydefault(this, str, str2);
        }

        @Override // com.okinc.business.defi.wallet.common.WalletConnectUtils.StateListAnimator
        public void KWHzl(java.lang.String str, boolean z) {
            java.util.ArrayList arrayList;
            java.lang.Object value;
            Intrinsics.checkNotNullParameter(str, "");
            java.util.List<WalletConnectedData> value2 = C18345fge.this.copydefault().getValue();
            if (value2 != null) {
                arrayList = new java.util.ArrayList();
                for (java.lang.Object obj : value2) {
                    if (!Intrinsics.EZpvd((java.lang.Object) ((WalletConnectedData) obj).getTopicOrClientId(), (java.lang.Object) str)) {
                        arrayList.add(obj);
                    }
                }
            } else {
                arrayList = null;
            }
            MutableStateFlow mutableStateFlow = C18345fge.this.copydefault;
            do {
                value = mutableStateFlow.getValue();
            } while (!mutableStateFlow.compareAndSet(value, arrayList));
        }
    }

    public final Job EZpvd() {
        return BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new WalletConnectConnectionMgmtViewModel$initDataList$1(this, null), 3, null);
    }

    public final Job KWHzl() {
        return BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new WalletConnectConnectionMgmtViewModel$listenTonConnectStateChanges$1(this, null), 3, null);
    }

    public final Job OLrzqt() {
        return BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new WalletConnectConnectionMgmtViewModel$listenOkxConnectStateChanges$1(this, null), 3, null);
    }

    public final void copydefault(@NotNull WalletConnectedData walletConnectedData) {
        Intrinsics.checkNotNullParameter(walletConnectedData, "");
        int connectType = walletConnectedData.getConnectType();
        if (connectType == 2) {
            BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new WalletConnectConnectionMgmtViewModel$disconnect$2(this, walletConnectedData, null), 3, null);
        } else if (connectType == 3) {
            BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new WalletConnectConnectionMgmtViewModel$disconnect$1(this, walletConnectedData, null), 3, null);
        } else {
            this.KWHzl.copydefault(walletConnectedData.getTopicOrClientId());
            Unit unit = Unit.INSTANCE;
        }
    }

    public final void AEQbTJ() {
        java.util.List<WalletConnectedData> value = this.OLrzqt.getValue();
        if (value != null) {
            java.util.Iterator<T> it = value.iterator();
            while (it.hasNext()) {
                copydefault((WalletConnectedData) it.next());
            }
        }
    }

    @Override // androidx.lifecycle.ViewModel
    public void onCleared() {
        super.onCleared();
        this.KWHzl.copydefault(this.AhwBna);
    }
}
