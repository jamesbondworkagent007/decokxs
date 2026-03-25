package o;

import com.okinc.business.dexlogic.bean.CommonDexInfo;
import com.okinc.business.dexlogic.bean.DefiChainInfo;
import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import com.okinc.business.dexlogic.bean.DexQuoteBridgeVO;
import com.okinc.business.dexlogic.bean.PathSelectionRouterItem;
import com.okinc.business.dexlogic.bean.QuotePriceRes;
import com.okinc.business.dexlogic.main.swap.trade.viewmodel.util.CacheStatus;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.hmU, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C22814hmU extends AbstractC22801hmH {
    public final C23137hsZ EZpvd;
    public final AbstractC23101hrq KWHzl;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0009: CONSTRUCTOR 
  (r1v0 o.hrq)
  (wrap:o.hsZ:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:o.hsZ:0x0006: CONSTRUCTOR  A[MD:():void (m), WRAPPED] (LINE:19) call: o.hsZ.<init>():void type: CONSTRUCTOR) : (r2v0 o.hsZ))
 A[MD:(o.hrq, o.hsZ):void (m)] (LINE:17) call: o.hmU.<init>(o.hrq, o.hsZ):void type: THIS */
    public /* synthetic */ C22814hmU(AbstractC23101hrq abstractC23101hrq, C23137hsZ c23137hsZ, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(abstractC23101hrq, (i & 2) != 0 ? new C23137hsZ() : c23137hsZ);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22814hmU(@NotNull AbstractC23101hrq abstractC23101hrq, @NotNull C23137hsZ c23137hsZ) {
        super(abstractC23101hrq);
        Intrinsics.checkNotNullParameter(abstractC23101hrq, "");
        Intrinsics.checkNotNullParameter(c23137hsZ, "");
        this.KWHzl = abstractC23101hrq;
        this.EZpvd = c23137hsZ;
    }

    public final java.lang.String KWHzl() {
        java.lang.String bridgeId;
        java.lang.String uniqueId;
        java.lang.String uniqueId2;
        DexQuoteBridgeVO bridge;
        QuotePriceRes quotePrice = this.KWHzl.RlQdEF().getQuotePrice();
        if (quotePrice == null) {
            return "failure";
        }
        if (quotePrice.isCrossSwap()) {
            PathSelectionRouterItem selectRouterItem$default = QuotePriceRes.getSelectRouterItem$default(quotePrice, null, 1, null);
            if (selectRouterItem$default == null || (bridge = selectRouterItem$default.getBridge()) == null || (bridgeId = bridge.getBridgeId()) == null) {
                bridgeId = "3";
            }
        } else {
            bridgeId = "single_chain";
        }
        DexMultiTokenInfoBean dexMultiTokenInfoBeanCopydefault = this.KWHzl.QUSxYX().copydefault();
        java.lang.String str = "";
        if (dexMultiTokenInfoBeanCopydefault == null || (uniqueId = dexMultiTokenInfoBeanCopydefault.getUniqueId()) == null) {
            uniqueId = "";
        }
        DexMultiTokenInfoBean dexMultiTokenInfoBeanValueOf = this.KWHzl.QUSxYX().valueOf();
        if (dexMultiTokenInfoBeanValueOf != null && (uniqueId2 = dexMultiTokenInfoBeanValueOf.getUniqueId()) != null) {
            str = uniqueId2;
        }
        return uniqueId + str + bridgeId;
    }

    public final boolean gEmmrt() {
        CommonDexInfo commonDexInfo;
        QuotePriceRes quotePrice = this.KWHzl.RlQdEF().getQuotePrice();
        if (quotePrice == null || (commonDexInfo = quotePrice.getCommonDexInfo()) == null) {
            return false;
        }
        return this.EZpvd.copydefault(KWHzl(), djBIcL(), commonDexInfo.autoOpenMev());
    }

    public final boolean djBIcL() {
        boolean z = C22380heK.OLrzqt.copydefault(this.KWHzl.ffGIBT()).fARcdN().valueOf() != null ? !r0.getFieldNames() : true;
        QuotePriceRes quotePrice = this.KWHzl.RlQdEF().getQuotePrice();
        if (quotePrice == null) {
            return false;
        }
        if (quotePrice.isCrossSwap()) {
            PathSelectionRouterItem selectRouterItem$default = QuotePriceRes.getSelectRouterItem$default(quotePrice, null, 1, null);
            boolean z2 = selectRouterItem$default != null && selectRouterItem$default.containsFromSwap() && OLrzqt();
            PathSelectionRouterItem selectRouterItem$default2 = QuotePriceRes.getSelectRouterItem$default(quotePrice, null, 1, null);
            boolean z3 = selectRouterItem$default2 != null && selectRouterItem$default2.containsToSwap() && EZpvd();
            if ((z2 || z3) && z) {
                return true;
            }
        } else if (copydefault() && z) {
            return true;
        }
        return false;
    }

    public final void AYXKKw() {
        this.EZpvd.EZpvd();
    }

    public final void AEQbTJ(@NotNull java.lang.String str, @NotNull CacheStatus cacheStatus) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(cacheStatus, "");
        this.EZpvd.AEQbTJ(str, cacheStatus);
    }

    public final boolean OLrzqt() {
        DexMultiTokenInfoBean dexMultiTokenInfoBeanCopydefault = this.KWHzl.QUSxYX().copydefault();
        java.lang.String chainId = dexMultiTokenInfoBeanCopydefault != null ? dexMultiTokenInfoBeanCopydefault.getChainId() : null;
        if (chainId == null) {
            chainId = "";
        }
        DefiChainInfo defiChainInfoKWHzl = this.KWHzl.getFieldNames().KWHzl(chainId);
        return defiChainInfoKWHzl != null && defiChainInfoKWHzl.supportMev();
    }

    public final boolean EZpvd() {
        DexMultiTokenInfoBean dexMultiTokenInfoBeanValueOf = this.KWHzl.QUSxYX().valueOf();
        java.lang.String chainId = dexMultiTokenInfoBeanValueOf != null ? dexMultiTokenInfoBeanValueOf.getChainId() : null;
        if (chainId == null) {
            chainId = "";
        }
        DefiChainInfo defiChainInfoKWHzl = this.KWHzl.getFieldNames().KWHzl(chainId);
        return defiChainInfoKWHzl != null && defiChainInfoKWHzl.supportMev();
    }

    public final java.lang.String AEQbTJ() {
        java.lang.String chainLogoUrl;
        if (!OLrzqt() || !EZpvd()) {
            if (OLrzqt()) {
                DexMultiTokenInfoBean dexMultiTokenInfoBeanCopydefault = this.KWHzl.QUSxYX().copydefault();
                chainLogoUrl = dexMultiTokenInfoBeanCopydefault != null ? dexMultiTokenInfoBeanCopydefault.getChainLogoUrl() : null;
                if (chainLogoUrl != null) {
                    return chainLogoUrl;
                }
            } else if (EZpvd()) {
                DexMultiTokenInfoBean dexMultiTokenInfoBeanValueOf = this.KWHzl.QUSxYX().valueOf();
                chainLogoUrl = dexMultiTokenInfoBeanValueOf != null ? dexMultiTokenInfoBeanValueOf.getChainLogoUrl() : null;
                if (chainLogoUrl != null) {
                    return chainLogoUrl;
                }
            }
        }
        return "";
    }

    public final boolean copydefault() {
        return OLrzqt() || EZpvd();
    }
}
