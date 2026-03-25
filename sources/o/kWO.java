package o;

import androidx.fragment.app.FragmentActivity;
import com.okinc.business.dex.trade.core.domain.model.CommonDexInfo;
import com.okinc.business.dex.trade.core.domain.model.V6BaseQuoteResponse;
import com.okinc.business.dex.trade.core.domain.model.V6QuoteResponseData;
import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import com.okinc.business.trade.features.home.meme.domain.model.V6CalldataParams;
import com.okinc.business.trade.features.home.meme.usecase.transaction.MemeV6TransactionUseCase$submitV6Order$1;
import com.okinc.business.trade.features.home.meme.usecase.transaction.MemeV6TransactionUseCase$submitV6Order$2;
import com.okinc.business.trade.features.home.meme.usecase.transaction.MemeV6TransactionUseCase$submitV6PMMOrder$1;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC9740bbL;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class kWO {
    public final C28333kXn AEQbTJ;
    public final kWS EZpvd;
    public final C28325kXf KWHzl;
    public final kWZ OLrzqt;
    public final C28332kXm copydefault;
    public final kKG djBIcL;

    @yCM
    public kWO(@NotNull kWS kws, @NotNull C28325kXf c28325kXf, @NotNull kWZ kwz, @NotNull C28333kXn c28333kXn, @NotNull C28332kXm c28332kXm, @NotNull kKG kkg) {
        Intrinsics.checkNotNullParameter(kws, "");
        Intrinsics.checkNotNullParameter(c28325kXf, "");
        Intrinsics.checkNotNullParameter(kwz, "");
        Intrinsics.checkNotNullParameter(c28333kXn, "");
        Intrinsics.checkNotNullParameter(c28332kXm, "");
        Intrinsics.checkNotNullParameter(kkg, "");
        this.EZpvd = kws;
        this.KWHzl = c28325kXf;
        this.OLrzqt = kwz;
        this.AEQbTJ = c28333kXn;
        this.copydefault = c28332kXm;
        this.djBIcL = kkg;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object AEQbTJ(V6BaseQuoteResponse v6BaseQuoteResponse, V6CalldataParams v6CalldataParams, java.lang.String str, boolean z, int i, FragmentActivity fragmentActivity, boolean z2, InterfaceC9740bbL.TaskDescription taskDescription, Continuation<? super Result<java.lang.String>> continuation) throws java.lang.Throwable {
        MemeV6TransactionUseCase$submitV6Order$1 memeV6TransactionUseCase$submitV6Order$1;
        AbstractC28328kXi abstractC28328kXi;
        DexMultiTokenInfoBean fromToken;
        if (continuation instanceof MemeV6TransactionUseCase$submitV6Order$1) {
            memeV6TransactionUseCase$submitV6Order$1 = (MemeV6TransactionUseCase$submitV6Order$1) continuation;
            int i2 = memeV6TransactionUseCase$submitV6Order$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                memeV6TransactionUseCase$submitV6Order$1.label = i2 - Integer.MIN_VALUE;
            } else {
                memeV6TransactionUseCase$submitV6Order$1 = new MemeV6TransactionUseCase$submitV6Order$1(this, continuation);
            }
        }
        MemeV6TransactionUseCase$submitV6Order$1 memeV6TransactionUseCase$submitV6Order$12 = memeV6TransactionUseCase$submitV6Order$1;
        java.lang.Object obj = memeV6TransactionUseCase$submitV6Order$12.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i3 = memeV6TransactionUseCase$submitV6Order$12.label;
        if (i3 != 0) {
            if (i3 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            return ((Result) obj).m7386unboximpl();
        }
        C56391yDq.AEQbTJ(obj);
        CommonDexInfo commonDexInfo = v6BaseQuoteResponse.getCommonDexInfo();
        java.lang.String chainId = (commonDexInfo == null || (fromToken = commonDexInfo.getFromToken()) == null) ? null : fromToken.getChainId();
        if (chainId == null) {
            chainId = "";
        }
        if (this.djBIcL.KWHzl(chainId)) {
            abstractC28328kXi = this.EZpvd;
        } else {
            abstractC28328kXi = Intrinsics.EZpvd((java.lang.Object) chainId, (java.lang.Object) "501") ? this.KWHzl : this.OLrzqt;
        }
        AbstractC28328kXi abstractC28328kXi2 = abstractC28328kXi;
        memeV6TransactionUseCase$submitV6Order$12.label = 1;
        java.lang.Object objKWHzl = abstractC28328kXi2.KWHzl(v6BaseQuoteResponse, str, z, i, fragmentActivity, v6CalldataParams, z2, taskDescription, memeV6TransactionUseCase$submitV6Order$12);
        return objKWHzl == objCopydefault ? objCopydefault : objKWHzl;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object copydefault(V6BaseQuoteResponse v6BaseQuoteResponse, java.lang.String str, boolean z, int i, FragmentActivity fragmentActivity, boolean z2, InterfaceC9740bbL.TaskDescription taskDescription, Continuation<? super Result<java.lang.String>> continuation) throws java.lang.Throwable {
        MemeV6TransactionUseCase$submitV6PMMOrder$1 memeV6TransactionUseCase$submitV6PMMOrder$1;
        DexMultiTokenInfoBean fromToken;
        if (continuation instanceof MemeV6TransactionUseCase$submitV6PMMOrder$1) {
            memeV6TransactionUseCase$submitV6PMMOrder$1 = (MemeV6TransactionUseCase$submitV6PMMOrder$1) continuation;
            int i2 = memeV6TransactionUseCase$submitV6PMMOrder$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                memeV6TransactionUseCase$submitV6PMMOrder$1.label = i2 - Integer.MIN_VALUE;
            } else {
                memeV6TransactionUseCase$submitV6PMMOrder$1 = new MemeV6TransactionUseCase$submitV6PMMOrder$1(this, continuation);
            }
        }
        MemeV6TransactionUseCase$submitV6PMMOrder$1 memeV6TransactionUseCase$submitV6PMMOrder$12 = memeV6TransactionUseCase$submitV6PMMOrder$1;
        java.lang.Object obj = memeV6TransactionUseCase$submitV6PMMOrder$12.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i3 = memeV6TransactionUseCase$submitV6PMMOrder$12.label;
        if (i3 != 0) {
            if (i3 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            return ((Result) obj).m7386unboximpl();
        }
        C56391yDq.AEQbTJ(obj);
        CommonDexInfo commonDexInfo = v6BaseQuoteResponse.getCommonDexInfo();
        AbstractC28329kXj abstractC28329kXj = Intrinsics.EZpvd((java.lang.Object) ((commonDexInfo == null || (fromToken = commonDexInfo.getFromToken()) == null) ? null : fromToken.getChainId()), (java.lang.Object) "501") ? this.copydefault : this.AEQbTJ;
        memeV6TransactionUseCase$submitV6PMMOrder$12.label = 1;
        java.lang.Object objAEQbTJ = abstractC28329kXj.AEQbTJ(v6BaseQuoteResponse, str, i, fragmentActivity, z2, taskDescription, memeV6TransactionUseCase$submitV6PMMOrder$12);
        return objAEQbTJ == objCopydefault ? objCopydefault : objAEQbTJ;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object OLrzqt(boolean z, @NotNull V6QuoteResponseData v6QuoteResponseData, @NotNull V6CalldataParams v6CalldataParams, java.lang.String str, boolean z2, int i, @NotNull FragmentActivity fragmentActivity, boolean z3, @NotNull InterfaceC9740bbL.TaskDescription taskDescription, @NotNull Continuation<? super Result<java.lang.String>> continuation) throws java.lang.Throwable {
        MemeV6TransactionUseCase$submitV6Order$2 memeV6TransactionUseCase$submitV6Order$2;
        if (continuation instanceof MemeV6TransactionUseCase$submitV6Order$2) {
            memeV6TransactionUseCase$submitV6Order$2 = (MemeV6TransactionUseCase$submitV6Order$2) continuation;
            int i2 = memeV6TransactionUseCase$submitV6Order$2.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                memeV6TransactionUseCase$submitV6Order$2.label = i2 - Integer.MIN_VALUE;
            } else {
                memeV6TransactionUseCase$submitV6Order$2 = new MemeV6TransactionUseCase$submitV6Order$2(this, continuation);
            }
        }
        MemeV6TransactionUseCase$submitV6Order$2 memeV6TransactionUseCase$submitV6Order$22 = memeV6TransactionUseCase$submitV6Order$2;
        java.lang.Object obj = memeV6TransactionUseCase$submitV6Order$22.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i3 = memeV6TransactionUseCase$submitV6Order$22.label;
        if (i3 != 0) {
            if (i3 == 1) {
                C56391yDq.AEQbTJ(obj);
                return ((Result) obj).m7386unboximpl();
            }
            if (i3 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            return ((Result) obj).m7386unboximpl();
        }
        C56391yDq.AEQbTJ(obj);
        if (z) {
            memeV6TransactionUseCase$submitV6Order$22.label = 1;
            java.lang.Object objCopydefault2 = copydefault(v6QuoteResponseData, str, z2, i, fragmentActivity, z3, taskDescription, memeV6TransactionUseCase$submitV6Order$22);
            return objCopydefault2 == objCopydefault ? objCopydefault : objCopydefault2;
        }
        memeV6TransactionUseCase$submitV6Order$22.label = 2;
        java.lang.Object objAEQbTJ = AEQbTJ(v6QuoteResponseData, v6CalldataParams, str, z2, i, fragmentActivity, z3, taskDescription, memeV6TransactionUseCase$submitV6Order$22);
        return objAEQbTJ == objCopydefault ? objCopydefault : objAEQbTJ;
    }
}
