package o;

import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModelKt;
import com.okinc.business.defi.biz.core.tx.check.ChainCheckType;
import com.okinc.business.defi.biz.core.tx.check.ChainStatus;
import com.okinc.business.defi.biz.core.tx.check.ChainStatusChecker;
import com.okinc.business.defi.biz.net.bean.CoinProtocol;
import com.okinc.business.defi.wallet.custom.CustomTokenViewModel$initTrigger$1;
import com.okinc.business.defi.wallet.custom.CustomTokenViewModel$monitorAddCustomTokenEvent$1;
import com.okinc.business.defi.wallet.custom.CustomTokenViewModel$observer$1;
import com.okinc.business.defi.wallet.custom.CustomTokenViewModel$onChainUpdated$1;
import com.okinc.business.defi.wallet.custom.CustomTokenViewModel$onProtocolUpdated$1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.efX, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C16204efX extends AbstractC33073mpa {
    public final MutableStateFlow<C16263egd> AEQbTJ;
    public final long EZpvd;
    public final C12827cuN KWHzl;
    public final MutableSharedFlow<C13924dbk> OLrzqt;
    public final InterfaceC16201efU copydefault;
    public final InterfaceC18445fiY gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableStateFlow<C16263egd> EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<C16263egd> KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableSharedFlow<C13924dbk> copydefault() {
        return this.OLrzqt;
    }

    public C16204efX(@NotNull C12827cuN c12827cuN, @NotNull InterfaceC18445fiY interfaceC18445fiY, @NotNull InterfaceC16201efU interfaceC16201efU, @NotNull SavedStateHandle savedStateHandle) {
        Intrinsics.checkNotNullParameter(c12827cuN, "");
        Intrinsics.checkNotNullParameter(interfaceC18445fiY, "");
        Intrinsics.checkNotNullParameter(interfaceC16201efU, "");
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
        this.KWHzl = c12827cuN;
        this.gEmmrt = interfaceC18445fiY;
        this.copydefault = interfaceC16201efU;
        this.AEQbTJ = StateFlowKt.MutableStateFlow(new C16263egd(null, false, false, null, null, false, 63, null));
        java.lang.Long l = (java.lang.Long) savedStateHandle.get("chain_id");
        long jLongValue = l != null ? l.longValue() : -1L;
        this.EZpvd = jLongValue;
        this.OLrzqt = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        pUU.OLrzqt(">>>chain CustomTokenViewModel init chainId:" + jLongValue);
        djBIcL();
        OLrzqt();
    }

    public final void djBIcL() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new CustomTokenViewModel$observer$1(this, null), 3, null);
    }

    public final void OLrzqt() {
        pUU.OLrzqt(">>>chain initTrigger chainId:" + this.EZpvd);
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new CustomTokenViewModel$initTrigger$1(this, null), 3, null);
    }

    public final AbstractC58185ywX<ChainStatus> copydefault(long j, @NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return ChainStatusChecker.OLrzqt.OLrzqt(j, str, str2, C56402yEa.EZpvd(ChainCheckType.CHECK_REGISTER));
    }

    public final void copydefault(@NotNull C13924dbk c13924dbk) {
        Intrinsics.checkNotNullParameter(c13924dbk, "");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new CustomTokenViewModel$onChainUpdated$1(this, c13924dbk, null), 3, null);
    }

    public final void KWHzl(int i) {
        pUU.OLrzqt(">>>chain: onProtocolUpdated protocolId:" + i);
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new CustomTokenViewModel$onProtocolUpdated$1(this, i, null), 3, null);
    }

    public final java.lang.Integer AEQbTJ() {
        CoinProtocol coinProtocolEZpvd = this.AEQbTJ.getValue().EZpvd();
        if (coinProtocolEZpvd != null) {
            return java.lang.Integer.valueOf(coinProtocolEZpvd.getProtocolId());
        }
        return null;
    }

    public final void AEQbTJ(@NotNull java.lang.String str, java.lang.String str2, java.lang.Long l, @NotNull java.lang.String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str3, "");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new CustomTokenViewModel$monitorAddCustomTokenEvent$1(this, str, str2, str3, l, null), 3, null);
    }

    public final java.lang.String OLrzqt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        java.lang.String strEZpvd = C14079deg.EZpvd.EZpvd(str, 2);
        return strEZpvd == null ? "" : strEZpvd;
    }
}
