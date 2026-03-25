package o;

import com.google.android.gms.stats.CodePackage;
import com.okinc.business.defi.api.bean.OKWalletHiddenSmallAssetTokenModel;
import com.okinc.business.dexlogic.bean.ChainTokensData;
import com.okinc.business.trade.features.home.tokenlist.domain.usecase.tokenlist.bridge.RustBridgeTokenListUseCaseImpl$invoke$2;
import com.okinc.business.trade.features.home.tokenlist.domain.usecase.tokenlist.bridge.RustBridgeTokenListUseCaseImpl$invoke$result$1;
import com.okinc.business.trade.features.home.tokenlist.domain.usecase.tokenlist.bridge.RustBridgeTokenListUseCaseImpl$invoke$result$2;
import com.okinc.business.trade.features.home.tokenlist.domain.usecase.tokenlist.bridge.RustBridgeTokenListUseCaseImpl$invoke$result$3;
import com.okinc.business.trade.features.home.tokenlist.domain.usecase.tokenlist.bridge.RustBridgeTokenListUseCaseImpl$invoke$result$4;
import com.okinc.network.okg.response.OKServerException;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC43419rot;
import org.jetbrains.annotations.NotNull;
import uniffi.network.CacheStrategy;

/* JADX INFO: renamed from: o.kZx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C28397kZx implements InterfaceC28389kZp {
    public final kYC EZpvd;
    public final kKG KWHzl;
    public final C4134AzC copydefault;
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int AEQbTJ = 8;

    public C28397kZx(@NotNull kYC kyc, @NotNull kKG kkg, @NotNull C4134AzC c4134AzC) {
        Intrinsics.checkNotNullParameter(kyc, "");
        Intrinsics.checkNotNullParameter(kkg, "");
        Intrinsics.checkNotNullParameter(c4134AzC, "");
        this.EZpvd = kyc;
        this.KWHzl = kkg;
        this.copydefault = c4134AzC;
    }

    /* JADX INFO: renamed from: o.kZx$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.kZx.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    @Override // o.InterfaceC28389kZp
    public java.lang.Object AEQbTJ(@NotNull C28378kZe c28378kZe, @NotNull Continuation<? super AbstractC43419rot<? extends java.util.List<ChainTokensData>, OKServerException>> continuation) {
        return KWHzl(c28378kZe, CacheStrategy.FIRST_NETWORK, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object KWHzl(@NotNull C28378kZe c28378kZe, @NotNull CacheStrategy cacheStrategy, @NotNull Continuation<? super AbstractC43419rot<? extends java.util.List<ChainTokensData>, OKServerException>> continuation) throws java.lang.Throwable {
        RustBridgeTokenListUseCaseImpl$invoke$2 rustBridgeTokenListUseCaseImpl$invoke$2;
        boolean z;
        C28378kZe c28378kZe2;
        AFR afrAEQbTJ;
        java.lang.Object objAEQbTJ;
        if (continuation instanceof RustBridgeTokenListUseCaseImpl$invoke$2) {
            rustBridgeTokenListUseCaseImpl$invoke$2 = (RustBridgeTokenListUseCaseImpl$invoke$2) continuation;
            int i = rustBridgeTokenListUseCaseImpl$invoke$2.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                rustBridgeTokenListUseCaseImpl$invoke$2.label = i - Integer.MIN_VALUE;
            } else {
                rustBridgeTokenListUseCaseImpl$invoke$2 = new RustBridgeTokenListUseCaseImpl$invoke$2(this, continuation);
            }
        }
        java.lang.Object obj = rustBridgeTokenListUseCaseImpl$invoke$2.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = rustBridgeTokenListUseCaseImpl$invoke$2.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(obj);
                boolean zEZpvd = Intrinsics.EZpvd((java.lang.Object) c28378kZe.EZpvd(), (java.lang.Object) "chain_id_collection");
                if (c28378kZe.KWHzl().length() > 0) {
                    c28378kZe2 = c28378kZe;
                    z = true;
                } else {
                    z = false;
                    c28378kZe2 = c28378kZe;
                }
                C4149AzR c4149AzREZpvd = EZpvd(c28378kZe2, zEZpvd);
                pUU.KWHzl("RustBridgeTokenListUseCaseImpl", "invoke isCollection=" + zEZpvd + ", isSearch=" + z + ", chainId=" + c28378kZe.EZpvd());
                if (z) {
                    afrAEQbTJ = this.copydefault.EZpvd(c4149AzREZpvd, cacheStrategy);
                } else if (zEZpvd) {
                    afrAEQbTJ = this.copydefault.copydefault(c4149AzREZpvd, cacheStrategy);
                } else {
                    afrAEQbTJ = this.copydefault.AEQbTJ(c4149AzREZpvd, cacheStrategy);
                }
                C33077mpe c33077mpe = new C33077mpe(new RustBridgeTokenListUseCaseImpl$invoke$result$1(afrAEQbTJ), new RustBridgeTokenListUseCaseImpl$invoke$result$2(afrAEQbTJ), new RustBridgeTokenListUseCaseImpl$invoke$result$3(afrAEQbTJ), new RustBridgeTokenListUseCaseImpl$invoke$result$4(afrAEQbTJ), null, 16, null);
                rustBridgeTokenListUseCaseImpl$invoke$2.label = 1;
                objAEQbTJ = c33077mpe.AEQbTJ(rustBridgeTokenListUseCaseImpl$invoke$2);
                if (objAEQbTJ == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                objAEQbTJ = ((Result) obj).m7386unboximpl();
            }
            java.lang.Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objAEQbTJ);
            if (thM7380exceptionOrNullimpl == null) {
                java.util.List<C4150AzS> list = (java.util.List) objAEQbTJ;
                pUU.KWHzl("RustBridgeTokenListUseCaseImpl", "invoke success, size=" + list.size());
                return new AbstractC43419rot.StateListAnimator(C28393kZt.AEQbTJ.copydefault(list));
            }
            pUU.AEQbTJ("RustBridgeTokenListUseCaseImpl", "invoke failed", thM7380exceptionOrNullimpl);
            C6777aVl.Companion.EZpvd(thM7380exceptionOrNullimpl);
            java.lang.String message = thM7380exceptionOrNullimpl.getMessage();
            return new AbstractC43419rot.ActionBar(new OKServerException(0, message == null ? "Unknown error" : message, null, null, 13, null));
        } catch (java.lang.Exception e) {
            pUU.AEQbTJ("RustBridgeTokenListUseCaseImpl", "invoke exception", e);
            C6777aVl.Companion.EZpvd(e);
            java.lang.String message2 = e.getMessage();
            return new AbstractC43419rot.ActionBar(new OKServerException(0, message2 == null ? "Unknown error" : message2, null, null, 13, null));
        }
    }

    public final C4149AzR EZpvd(C28378kZe c28378kZe, boolean z) {
        java.lang.String str;
        if (c28378kZe.KWHzl().length() > 0) {
            str = z ? "COLLECTION" : CodePackage.COMMON;
        } else {
            str = null;
        }
        OKWalletHiddenSmallAssetTokenModel oKWalletHiddenSmallAssetTokenModelAEQbTJ = this.EZpvd.AEQbTJ();
        java.lang.String hiddenValue = oKWalletHiddenSmallAssetTokenModelAEQbTJ.getEnableHidden() ? oKWalletHiddenSmallAssetTokenModelAEQbTJ.getHiddenValue() : null;
        java.lang.String strCopydefault = c28378kZe.copydefault();
        if (strCopydefault.length() <= 0 || Intrinsics.EZpvd((java.lang.Object) strCopydefault, (java.lang.Object) "chain_id_all_network") || Intrinsics.EZpvd((java.lang.Object) strCopydefault, (java.lang.Object) "chain_id_collection")) {
            strCopydefault = null;
        }
        java.lang.String strGEmmrt = c28378kZe.gEmmrt();
        java.lang.String str2 = (strGEmmrt.length() <= 0 || Intrinsics.EZpvd((java.lang.Object) strGEmmrt, (java.lang.Object) "chain_id_all_network") || Intrinsics.EZpvd((java.lang.Object) strGEmmrt, (java.lang.Object) "chain_id_collection")) ? null : strGEmmrt;
        java.lang.String strOLrzqt = c28378kZe.valueOf() ? "" : c28378kZe.OLrzqt();
        java.lang.String strAYXKKw = c28378kZe.AYXKKw();
        java.lang.String strCopydefault2 = this.KWHzl.copydefault();
        java.lang.String strKWHzl = this.EZpvd.KWHzl();
        java.lang.String strOLrzqt2 = this.EZpvd.OLrzqt();
        java.lang.String str3 = c28378kZe.valueOf() ? "FROM" : "TO";
        java.lang.String strKWHzl2 = c28378kZe.KWHzl();
        return new C4149AzR(strCopydefault, str2, strOLrzqt, strAYXKKw, strCopydefault2, strKWHzl, strOLrzqt2, str3, strKWHzl2.length() > 0 ? strKWHzl2 : null, c28378kZe.AEQbTJ(), str, hiddenValue);
    }
}
