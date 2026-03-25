package o;

import com.okinc.business.defi.biz.net.bean.WalletPnlAnalysisResponse;
import com.okinc.business.defi.biz.net.bean.WalletPnlShareInfoResponse;
import com.okinc.business.defi.biz.net.bean.WalletPnlTokenListResponse;
import com.okinc.business.defi.biz.net.bean.WalletSupportPnlChainListResponse;
import com.okinc.business.defi.wallet.home.addressDetail.data.resposity.WalletPnlDataRemoteDataSource$getSupportPnlChainList$2;
import com.okinc.business.defi.wallet.home.addressDetail.data.resposity.WalletPnlDataRemoteDataSource$getWalletAccountPnlAnalysis$1;
import com.okinc.business.defi.wallet.home.addressDetail.data.resposity.WalletPnlDataRemoteDataSource$getWalletAccountPnlTokenList$1;
import com.okinc.network.okg.response.OKServerException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import o.AbstractC43419rot;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class eWC {
    public final C13934dbu AEQbTJ;

    @yCM
    public eWC(@NotNull C13934dbu c13934dbu) {
        Intrinsics.checkNotNullParameter(c13934dbu, "");
        this.AEQbTJ = c13934dbu;
    }

    public final java.lang.Object OLrzqt(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull Continuation<? super AbstractC43419rot<WalletSupportPnlChainListResponse, OKServerException>> continuation) {
        return BuildersKt.withContext(coroutineDispatcher, new WalletPnlDataRemoteDataSource$getSupportPnlChainList$2(this, null), continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object copydefault(@NotNull java.lang.String str, java.lang.String str2, java.lang.Long l, java.lang.String str3, @NotNull Continuation<? super AbstractC43419rot<WalletPnlAnalysisResponse, OKServerException>> continuation) throws java.lang.Throwable {
        WalletPnlDataRemoteDataSource$getWalletAccountPnlAnalysis$1 walletPnlDataRemoteDataSource$getWalletAccountPnlAnalysis$1;
        if (continuation instanceof WalletPnlDataRemoteDataSource$getWalletAccountPnlAnalysis$1) {
            walletPnlDataRemoteDataSource$getWalletAccountPnlAnalysis$1 = (WalletPnlDataRemoteDataSource$getWalletAccountPnlAnalysis$1) continuation;
            int i = walletPnlDataRemoteDataSource$getWalletAccountPnlAnalysis$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                walletPnlDataRemoteDataSource$getWalletAccountPnlAnalysis$1.label = i - Integer.MIN_VALUE;
            } else {
                walletPnlDataRemoteDataSource$getWalletAccountPnlAnalysis$1 = new WalletPnlDataRemoteDataSource$getWalletAccountPnlAnalysis$1(this, continuation);
            }
        }
        WalletPnlDataRemoteDataSource$getWalletAccountPnlAnalysis$1 walletPnlDataRemoteDataSource$getWalletAccountPnlAnalysis$12 = walletPnlDataRemoteDataSource$getWalletAccountPnlAnalysis$1;
        java.lang.Object objKWHzl = walletPnlDataRemoteDataSource$getWalletAccountPnlAnalysis$12.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = walletPnlDataRemoteDataSource$getWalletAccountPnlAnalysis$12.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objKWHzl);
            C13934dbu c13934dbu = this.AEQbTJ;
            walletPnlDataRemoteDataSource$getWalletAccountPnlAnalysis$12.label = 1;
            objKWHzl = c13934dbu.KWHzl(str, str2, l, str3, walletPnlDataRemoteDataSource$getWalletAccountPnlAnalysis$12);
            if (objKWHzl == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objKWHzl);
        }
        AbstractC43419rot abstractC43419rot = (AbstractC43419rot) objKWHzl;
        if (abstractC43419rot instanceof AbstractC43419rot.StateListAnimator) {
            return new AbstractC43419rot.StateListAnimator((WalletPnlAnalysisResponse) ((AbstractC43419rot.StateListAnimator) abstractC43419rot).KWHzl());
        }
        if (abstractC43419rot instanceof AbstractC43419rot.ActionBar) {
            return new AbstractC43419rot.ActionBar(((AbstractC43419rot.ActionBar) abstractC43419rot).KWHzl());
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object OLrzqt(@NotNull java.lang.String str, java.lang.Long l, int i, boolean z, int i2, int i3, @NotNull Continuation<? super AbstractC43419rot<WalletPnlTokenListResponse, OKServerException>> continuation) throws java.lang.Throwable {
        WalletPnlDataRemoteDataSource$getWalletAccountPnlTokenList$1 walletPnlDataRemoteDataSource$getWalletAccountPnlTokenList$1;
        if (continuation instanceof WalletPnlDataRemoteDataSource$getWalletAccountPnlTokenList$1) {
            walletPnlDataRemoteDataSource$getWalletAccountPnlTokenList$1 = (WalletPnlDataRemoteDataSource$getWalletAccountPnlTokenList$1) continuation;
            int i4 = walletPnlDataRemoteDataSource$getWalletAccountPnlTokenList$1.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                walletPnlDataRemoteDataSource$getWalletAccountPnlTokenList$1.label = i4 - Integer.MIN_VALUE;
            } else {
                walletPnlDataRemoteDataSource$getWalletAccountPnlTokenList$1 = new WalletPnlDataRemoteDataSource$getWalletAccountPnlTokenList$1(this, continuation);
            }
        }
        WalletPnlDataRemoteDataSource$getWalletAccountPnlTokenList$1 walletPnlDataRemoteDataSource$getWalletAccountPnlTokenList$12 = walletPnlDataRemoteDataSource$getWalletAccountPnlTokenList$1;
        java.lang.Object objKWHzl = walletPnlDataRemoteDataSource$getWalletAccountPnlTokenList$12.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i5 = walletPnlDataRemoteDataSource$getWalletAccountPnlTokenList$12.label;
        if (i5 == 0) {
            C56391yDq.AEQbTJ(objKWHzl);
            C13934dbu c13934dbu = this.AEQbTJ;
            walletPnlDataRemoteDataSource$getWalletAccountPnlTokenList$12.label = 1;
            objKWHzl = c13934dbu.KWHzl(str, l, i, z, i2, i3, walletPnlDataRemoteDataSource$getWalletAccountPnlTokenList$12);
            if (objKWHzl == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i5 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objKWHzl);
        }
        AbstractC43419rot abstractC43419rot = (AbstractC43419rot) objKWHzl;
        if (abstractC43419rot instanceof AbstractC43419rot.StateListAnimator) {
            return new AbstractC43419rot.StateListAnimator((WalletPnlTokenListResponse) ((AbstractC43419rot.StateListAnimator) abstractC43419rot).KWHzl());
        }
        if (abstractC43419rot instanceof AbstractC43419rot.ActionBar) {
            return new AbstractC43419rot.ActionBar(((AbstractC43419rot.ActionBar) abstractC43419rot).KWHzl());
        }
        throw new NoWhenBranchMatchedException();
    }

    public final java.lang.Object AEQbTJ(@NotNull java.lang.String str, java.lang.Long l, int i, boolean z, int i2, int i3, boolean z2, @NotNull Continuation<? super AbstractC43419rot<WalletPnlTokenListResponse, OKServerException>> continuation) {
        return this.AEQbTJ.KWHzl(str, l, i, z, i2, i3, z2, continuation);
    }

    public final java.lang.Object EZpvd(@NotNull java.lang.String str, java.lang.String str2, java.lang.Long l, @NotNull Continuation<? super AbstractC43419rot<WalletPnlAnalysisResponse, OKServerException>> continuation) {
        return this.AEQbTJ.KWHzl(str, str2, l, (java.lang.String) null, continuation);
    }

    public final java.lang.Object AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull Continuation<? super AbstractC43419rot<WalletPnlShareInfoResponse, OKServerException>> continuation) {
        return this.AEQbTJ.EZpvd(str, str2, str3, str4, continuation);
    }
}
