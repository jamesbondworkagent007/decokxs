package o;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.okinc.business.appupdate.api.AppUpdateService;
import com.okinc.business.defi.wallet.mine.viewmodel.PageType;
import com.okinc.business.defi.wallet.mine.viewmodel.WalletMineViewModel$loadSettingsData$1;
import com.okinc.core.util.SPUtils;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fyn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C19307fyn extends ViewModel {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int KWHzl = 8;
    public final MutableStateFlow<C19310fyq> AEQbTJ;
    public AbstractC12782ctV AYXKKw;
    public final InterfaceC8107awW EZpvd;
    public int OLrzqt;
    public final AppUpdateService copydefault;
    public final C12827cuN djBIcL;
    public PageType gEmmrt;
    public final StateFlow<C19310fyq> valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AbstractC12782ctV EZpvd() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<C19310fyq> OLrzqt() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PageType copydefault() {
        return this.gEmmrt;
    }

    public C19307fyn(@NotNull C12827cuN c12827cuN, InterfaceC8107awW interfaceC8107awW, @NotNull AppUpdateService appUpdateService) {
        Intrinsics.checkNotNullParameter(c12827cuN, "");
        Intrinsics.checkNotNullParameter(appUpdateService, "");
        this.djBIcL = c12827cuN;
        this.EZpvd = interfaceC8107awW;
        this.copydefault = appUpdateService;
        MutableStateFlow<C19310fyq> MutableStateFlow = StateFlowKt.MutableStateFlow(null);
        this.AEQbTJ = MutableStateFlow;
        this.valueOf = FlowKt.asStateFlow(MutableStateFlow);
        KWHzl();
    }

    public final void KWHzl() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new WalletMineViewModel$loadSettingsData$1(this, null), 3, null);
    }

    public final void djBIcL() {
        this.OLrzqt++;
        java.lang.Integer num = SPUtils.getInt("bind_wallet_show_time", 0, "WalletSettingCenterV2");
        if (this.OLrzqt != 1 || num.intValue() > 5) {
            return;
        }
        SPUtils.put("bind_wallet_show_time", java.lang.Integer.valueOf(num.intValue() + 1), "WalletSettingCenterV2");
    }

    public final boolean AEQbTJ() {
        return SPUtils.getInt("bind_wallet_show_time", 0, "WalletSettingCenterV2").intValue() < 5;
    }

    /* JADX INFO: renamed from: o.fyn$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.fyn.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }
}
