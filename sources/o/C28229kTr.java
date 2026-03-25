package o;

import com.okinc.business.dex.trade.core.domain.model.DefiPlatformInfo;
import com.okinc.business.dex.trade.core.domain.model.V6BaseQuoteResponse;
import com.okinc.business.dexlogic.bean.DeFiPlatformForSwap;
import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import com.okinc.business.trade.features.home.ui.cefi.data.AdvancedQuoteAndCallData;
import com.okinc.business.trade.features.home.ui.cefi.data.AdvancedQuoteUiData;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kTr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C28229kTr {
    public yHO<? super java.lang.String, ? super DexMultiTokenInfoBean, ? super java.lang.String, Unit> AEQbTJ;
    public final StateFlow<java.lang.String> EZpvd;
    public java.lang.String KWHzl = "";
    public java.lang.String OLrzqt = "";
    public final MutableStateFlow<java.lang.String> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<java.lang.String> AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(yHO<? super java.lang.String, ? super DexMultiTokenInfoBean, ? super java.lang.String, Unit> yho) {
        this.AEQbTJ = yho;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt() {
        this.OLrzqt = "";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.OLrzqt = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault() {
        this.KWHzl = "";
        this.OLrzqt = "";
    }

    @yCM
    public C28229kTr() {
        MutableStateFlow<java.lang.String> MutableStateFlow = StateFlowKt.MutableStateFlow("");
        this.copydefault = MutableStateFlow;
        this.EZpvd = FlowKt.asStateFlow(MutableStateFlow);
    }

    public final void OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, DexMultiTokenInfoBean dexMultiTokenInfoBean) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.KWHzl = str;
        this.OLrzqt = str2;
        yHO<? super java.lang.String, ? super DexMultiTokenInfoBean, ? super java.lang.String, Unit> yho = this.AEQbTJ;
        if (yho != null) {
            yho.invoke(str3, dexMultiTokenInfoBean, str);
        }
    }

    public final java.lang.String EZpvd(AdvancedQuoteUiData advancedQuoteUiData) {
        AdvancedQuoteAndCallData advancedQuoteAndCallDataKWHzl;
        java.lang.String str = this.KWHzl;
        if (str.length() != 0) {
            return str;
        }
        java.lang.String strOLrzqt = (advancedQuoteUiData == null || (advancedQuoteAndCallDataKWHzl = advancedQuoteUiData.KWHzl()) == null) ? null : advancedQuoteAndCallDataKWHzl.OLrzqt();
        return strOLrzqt == null ? "" : strOLrzqt;
    }

    public final java.lang.String OLrzqt(AdvancedQuoteUiData advancedQuoteUiData) {
        AdvancedQuoteAndCallData advancedQuoteAndCallDataKWHzl;
        java.util.List<DeFiPlatformForSwap> listHDKMBd;
        DeFiPlatformForSwap deFiPlatformForSwap;
        java.lang.String str = this.OLrzqt;
        if (str.length() != 0) {
            return str;
        }
        java.lang.String name = (advancedQuoteUiData == null || (advancedQuoteAndCallDataKWHzl = advancedQuoteUiData.KWHzl()) == null || (listHDKMBd = advancedQuoteAndCallDataKWHzl.hDKMBd()) == null || (deFiPlatformForSwap = (DeFiPlatformForSwap) CollectionsKt___CollectionsKt.firstOrNull(listHDKMBd)) == null) ? null : deFiPlatformForSwap.getName();
        return name == null ? "" : name;
    }

    public final void KWHzl() {
        this.copydefault.setValue("");
    }

    public final java.lang.String OLrzqt(@NotNull V6BaseQuoteResponse v6BaseQuoteResponse, @NotNull java.lang.String str, DexMultiTokenInfoBean dexMultiTokenInfoBean) {
        java.lang.Object next;
        Intrinsics.checkNotNullParameter(v6BaseQuoteResponse, "");
        Intrinsics.checkNotNullParameter(str, "");
        java.util.List<DefiPlatformInfo> defiPlatformInfoList = v6BaseQuoteResponse.getDefiPlatformInfoList();
        if (defiPlatformInfoList == null || defiPlatformInfoList.isEmpty()) {
            return "";
        }
        if (this.KWHzl.length() > 0) {
            java.util.Iterator<T> it = defiPlatformInfoList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (Intrinsics.EZpvd((java.lang.Object) ((DefiPlatformInfo) next).getDefiPlatformId(), (java.lang.Object) this.KWHzl)) {
                    break;
                }
            }
            if (next == null) {
                this.copydefault.setValue(this.OLrzqt);
            }
        }
        if (this.KWHzl.length() == 0 || v6BaseQuoteResponse.deFiPlatformNotAvailableAnymore(this.KWHzl)) {
            DefiPlatformInfo defiPlatformInfo = (DefiPlatformInfo) CollectionsKt___CollectionsKt.AuCTelauCTel(defiPlatformInfoList);
            java.lang.String defiPlatformId = defiPlatformInfo.getDefiPlatformId();
            if (defiPlatformId == null) {
                defiPlatformId = "";
            }
            this.KWHzl = defiPlatformId;
            java.lang.String name = defiPlatformInfo.getName();
            this.OLrzqt = name != null ? name : "";
        }
        yHO<? super java.lang.String, ? super DexMultiTokenInfoBean, ? super java.lang.String, Unit> yho = this.AEQbTJ;
        if (yho != null) {
            yho.invoke(str, dexMultiTokenInfoBean, this.KWHzl);
        }
        return this.KWHzl;
    }
}
