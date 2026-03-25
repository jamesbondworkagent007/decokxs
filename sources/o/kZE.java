package o;

import com.okinc.business.defi.api.bean.OKWalletHiddenSmallAssetTokenModel;
import com.okinc.business.dexlogic.bean.ChainTokensData;
import com.okinc.business.trade.features.home.tokenlist.domain.usecase.tokenlist.single.RustSingleTokenListUseCaseImpl$invoke$2;
import com.okinc.business.trade.features.home.tokenlist.domain.usecase.tokenlist.single.RustSingleTokenListUseCaseImpl$invoke$result$1;
import com.okinc.business.trade.features.home.tokenlist.domain.usecase.tokenlist.single.RustSingleTokenListUseCaseImpl$invoke$result$2;
import com.okinc.business.trade.features.home.tokenlist.domain.usecase.tokenlist.single.RustSingleTokenListUseCaseImpl$invoke$result$3;
import com.okinc.business.trade.features.home.tokenlist.domain.usecase.tokenlist.single.RustSingleTokenListUseCaseImpl$invoke$result$4;
import com.okinc.network.okg.response.OKServerException;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC43419rot;
import org.jetbrains.annotations.NotNull;
import uniffi.network.CacheStrategy;

/* JADX INFO: loaded from: classes7.dex */
public final class kZE implements InterfaceC28389kZp {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int copydefault = 8;
    public final C2303AGo AEQbTJ;
    public final kKG KWHzl;
    public final kYC OLrzqt;

    public kZE(@NotNull kYC kyc, @NotNull kKG kkg, @NotNull C2303AGo c2303AGo) {
        Intrinsics.checkNotNullParameter(kyc, "");
        Intrinsics.checkNotNullParameter(kkg, "");
        Intrinsics.checkNotNullParameter(c2303AGo, "");
        this.OLrzqt = kyc;
        this.KWHzl = kkg;
        this.AEQbTJ = c2303AGo;
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.kZE.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    @Override // o.InterfaceC28389kZp
    public java.lang.Object AEQbTJ(@NotNull C28378kZe c28378kZe, @NotNull Continuation<? super AbstractC43419rot<? extends java.util.List<ChainTokensData>, OKServerException>> continuation) {
        return OLrzqt(c28378kZe, CacheStrategy.FIRST_NETWORK, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object OLrzqt(@NotNull C28378kZe c28378kZe, @NotNull CacheStrategy cacheStrategy, @NotNull Continuation<? super AbstractC43419rot<? extends java.util.List<ChainTokensData>, OKServerException>> continuation) throws java.lang.Throwable {
        RustSingleTokenListUseCaseImpl$invoke$2 rustSingleTokenListUseCaseImpl$invoke$2;
        AFR afrCopydefault;
        java.lang.Object objAEQbTJ;
        if (continuation instanceof RustSingleTokenListUseCaseImpl$invoke$2) {
            rustSingleTokenListUseCaseImpl$invoke$2 = (RustSingleTokenListUseCaseImpl$invoke$2) continuation;
            int i = rustSingleTokenListUseCaseImpl$invoke$2.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                rustSingleTokenListUseCaseImpl$invoke$2.label = i - Integer.MIN_VALUE;
            } else {
                rustSingleTokenListUseCaseImpl$invoke$2 = new RustSingleTokenListUseCaseImpl$invoke$2(this, continuation);
            }
        }
        java.lang.Object obj = rustSingleTokenListUseCaseImpl$invoke$2.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = rustSingleTokenListUseCaseImpl$invoke$2.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(obj);
                boolean z = c28378kZe.KWHzl().length() > 0;
                boolean zEZpvd = Intrinsics.EZpvd((java.lang.Object) c28378kZe.EZpvd(), (java.lang.Object) "chain_id_collection");
                boolean zEZpvd2 = Intrinsics.EZpvd((java.lang.Object) c28378kZe.EZpvd(), (java.lang.Object) "chain_id_all_network");
                AGF agfCopydefault = copydefault(c28378kZe, zEZpvd, zEZpvd2);
                pUU.KWHzl("RustSingleTokenListUseCaseImpl", "invoke isSearch=" + z + ", isCollection=" + zEZpvd + ", isAllNetwork=" + zEZpvd2 + ", chainId=" + c28378kZe.EZpvd());
                if (z) {
                    afrCopydefault = this.AEQbTJ.AEQbTJ(agfCopydefault, cacheStrategy);
                } else if (zEZpvd) {
                    afrCopydefault = this.AEQbTJ.EZpvd(agfCopydefault, cacheStrategy);
                } else if (zEZpvd2) {
                    afrCopydefault = this.AEQbTJ.KWHzl(agfCopydefault, cacheStrategy);
                } else {
                    afrCopydefault = this.AEQbTJ.copydefault(agfCopydefault, cacheStrategy);
                }
                C33077mpe c33077mpe = new C33077mpe(new RustSingleTokenListUseCaseImpl$invoke$result$1(afrCopydefault), new RustSingleTokenListUseCaseImpl$invoke$result$2(afrCopydefault), new RustSingleTokenListUseCaseImpl$invoke$result$3(afrCopydefault), new RustSingleTokenListUseCaseImpl$invoke$result$4(afrCopydefault), null, 16, null);
                rustSingleTokenListUseCaseImpl$invoke$2.label = 1;
                objAEQbTJ = c33077mpe.AEQbTJ(rustSingleTokenListUseCaseImpl$invoke$2);
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
                pUU.KWHzl("RustSingleTokenListUseCaseImpl", "invoke success, size=" + list.size());
                return new AbstractC43419rot.StateListAnimator(C28393kZt.AEQbTJ.copydefault(list));
            }
            pUU.AEQbTJ("RustSingleTokenListUseCaseImpl", "invoke failed", thM7380exceptionOrNullimpl);
            C6777aVl.Companion.EZpvd(thM7380exceptionOrNullimpl);
            java.lang.String message = thM7380exceptionOrNullimpl.getMessage();
            return new AbstractC43419rot.ActionBar(new OKServerException(0, message == null ? "Unknown error" : message, null, null, 13, null));
        } catch (java.lang.Exception e) {
            pUU.AEQbTJ("RustSingleTokenListUseCaseImpl", "invoke exception", e);
            C6777aVl.Companion.EZpvd(e);
            java.lang.String message2 = e.getMessage();
            return new AbstractC43419rot.ActionBar(new OKServerException(0, message2 == null ? "Unknown error" : message2, null, null, 13, null));
        }
    }

    public final AGF copydefault(C28378kZe c28378kZe, boolean z, boolean z2) {
        java.lang.Integer numValueOf;
        java.lang.String strEZpvd = (Intrinsics.EZpvd((java.lang.Object) c28378kZe.EZpvd(), (java.lang.Object) "chain_id_all_network") || Intrinsics.EZpvd((java.lang.Object) c28378kZe.EZpvd(), (java.lang.Object) "chain_id_collection")) ? null : c28378kZe.EZpvd();
        if (c28378kZe.KWHzl().length() > 0) {
            numValueOf = java.lang.Integer.valueOf(z ? 2 : z2 ? 1 : 0);
        } else {
            numValueOf = null;
        }
        OKWalletHiddenSmallAssetTokenModel oKWalletHiddenSmallAssetTokenModelAEQbTJ = this.OLrzqt.AEQbTJ();
        java.lang.String hiddenValue = oKWalletHiddenSmallAssetTokenModelAEQbTJ.getEnableHidden() ? oKWalletHiddenSmallAssetTokenModelAEQbTJ.getHiddenValue() : null;
        java.lang.String strOLrzqt = this.OLrzqt.OLrzqt();
        java.lang.String strKWHzl = this.OLrzqt.KWHzl();
        java.lang.String strKWHzl2 = this.OLrzqt.KWHzl();
        java.lang.String strCopydefault = this.KWHzl.copydefault();
        int tokenListType = c28378kZe.AhwBna().toTokenListType();
        java.lang.String strKWHzl3 = c28378kZe.KWHzl();
        return new AGF(strEZpvd, strOLrzqt, strKWHzl, strKWHzl2, strCopydefault, java.lang.Integer.valueOf(tokenListType), strKWHzl3.length() > 0 ? strKWHzl3 : null, numValueOf, c28378kZe.AEQbTJ(), hiddenValue);
    }
}
