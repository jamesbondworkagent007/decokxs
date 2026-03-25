package o;

import androidx.fragment.app.FragmentActivity;
import com.okinc.business.dex.trade.core.domain.model.CommonDexInfo;
import com.okinc.business.dex.trade.core.domain.model.V6BaseQuoteResponse;
import com.okinc.business.dex.trade.core.domain.model.V6CalldataRequest;
import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import com.okinc.business.trade.features.home.advanced.usecase.AdvancedSubmitOrderUseCase$getSelectionMev$1;
import com.okinc.business.trade.features.home.advanced.usecase.AdvancedSubmitOrderUseCase$submitPMMOrder$1;
import com.okinc.business.trade.features.home.advanced.usecase.AdvancedSubmitOrderUseCase$submitV6Order$1;
import com.okinc.wallet.api.WalletDexService;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.reactive.AwaitKt;
import o.InterfaceC9740bbL;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class kRK {
    public final C28181kRx AEQbTJ;
    public final C19700gMb EZpvd;
    public final C28164kRg KWHzl;
    public final C28175kRr OLrzqt;
    public final C28172kRo copydefault;

    @yCM
    public kRK(@NotNull C28164kRg c28164kRg, @NotNull C28175kRr c28175kRr, @NotNull C19700gMb c19700gMb, @NotNull C28172kRo c28172kRo, @NotNull C28181kRx c28181kRx) {
        Intrinsics.checkNotNullParameter(c28164kRg, "");
        Intrinsics.checkNotNullParameter(c28175kRr, "");
        Intrinsics.checkNotNullParameter(c19700gMb, "");
        Intrinsics.checkNotNullParameter(c28172kRo, "");
        Intrinsics.checkNotNullParameter(c28181kRx, "");
        this.KWHzl = c28164kRg;
        this.OLrzqt = c28175kRr;
        this.EZpvd = c19700gMb;
        this.copydefault = c28172kRo;
        this.AEQbTJ = c28181kRx;
    }

    /* JADX INFO: renamed from: submitPMMOrder-hUnOzRk$default, reason: not valid java name */
    public static /* synthetic */ java.lang.Object m8649submitPMMOrderhUnOzRk$default(kRK krk, V6BaseQuoteResponse v6BaseQuoteResponse, int i, FragmentActivity fragmentActivity, boolean z, InterfaceC9740bbL.TaskDescription taskDescription, Continuation continuation, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return krk.OLrzqt(v6BaseQuoteResponse, i, fragmentActivity, z, taskDescription, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object OLrzqt(@NotNull V6BaseQuoteResponse v6BaseQuoteResponse, int i, @NotNull FragmentActivity fragmentActivity, boolean z, @NotNull InterfaceC9740bbL.TaskDescription taskDescription, @NotNull Continuation<? super Result<java.lang.String>> continuation) {
        AdvancedSubmitOrderUseCase$submitPMMOrder$1 advancedSubmitOrderUseCase$submitPMMOrder$1;
        DexMultiTokenInfoBean fromToken;
        if (continuation instanceof AdvancedSubmitOrderUseCase$submitPMMOrder$1) {
            advancedSubmitOrderUseCase$submitPMMOrder$1 = (AdvancedSubmitOrderUseCase$submitPMMOrder$1) continuation;
            int i2 = advancedSubmitOrderUseCase$submitPMMOrder$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                advancedSubmitOrderUseCase$submitPMMOrder$1.label = i2 - Integer.MIN_VALUE;
            } else {
                advancedSubmitOrderUseCase$submitPMMOrder$1 = new AdvancedSubmitOrderUseCase$submitPMMOrder$1(this, continuation);
            }
        }
        AdvancedSubmitOrderUseCase$submitPMMOrder$1 advancedSubmitOrderUseCase$submitPMMOrder$12 = advancedSubmitOrderUseCase$submitPMMOrder$1;
        java.lang.Object obj = advancedSubmitOrderUseCase$submitPMMOrder$12.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i3 = advancedSubmitOrderUseCase$submitPMMOrder$12.label;
        if (i3 != 0) {
            if (i3 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            return ((Result) obj).m7386unboximpl();
        }
        C56391yDq.AEQbTJ(obj);
        CommonDexInfo commonDexInfo = v6BaseQuoteResponse.getCommonDexInfo();
        AbstractC28177kRt abstractC28177kRt = Intrinsics.EZpvd((java.lang.Object) ((commonDexInfo == null || (fromToken = commonDexInfo.getFromToken()) == null) ? null : fromToken.getChainId()), (java.lang.Object) "501") ? this.AEQbTJ : this.copydefault;
        advancedSubmitOrderUseCase$submitPMMOrder$12.label = 1;
        java.lang.Object objAEQbTJ = abstractC28177kRt.AEQbTJ(v6BaseQuoteResponse, i, fragmentActivity, z, taskDescription, advancedSubmitOrderUseCase$submitPMMOrder$12);
        return objAEQbTJ == objCopydefault ? objCopydefault : objAEQbTJ;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object EZpvd(@NotNull V6BaseQuoteResponse v6BaseQuoteResponse, @NotNull V6CalldataRequest v6CalldataRequest, boolean z, @NotNull FragmentActivity fragmentActivity, boolean z2, @NotNull InterfaceC9740bbL.TaskDescription taskDescription, @NotNull Continuation<? super Result<java.lang.String>> continuation) {
        AdvancedSubmitOrderUseCase$submitV6Order$1 advancedSubmitOrderUseCase$submitV6Order$1;
        DexMultiTokenInfoBean fromToken;
        if (continuation instanceof AdvancedSubmitOrderUseCase$submitV6Order$1) {
            advancedSubmitOrderUseCase$submitV6Order$1 = (AdvancedSubmitOrderUseCase$submitV6Order$1) continuation;
            int i = advancedSubmitOrderUseCase$submitV6Order$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                advancedSubmitOrderUseCase$submitV6Order$1.label = i - Integer.MIN_VALUE;
            } else {
                advancedSubmitOrderUseCase$submitV6Order$1 = new AdvancedSubmitOrderUseCase$submitV6Order$1(this, continuation);
            }
        }
        AdvancedSubmitOrderUseCase$submitV6Order$1 advancedSubmitOrderUseCase$submitV6Order$12 = advancedSubmitOrderUseCase$submitV6Order$1;
        java.lang.Object obj = advancedSubmitOrderUseCase$submitV6Order$12.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = advancedSubmitOrderUseCase$submitV6Order$12.label;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            return ((Result) obj).m7386unboximpl();
        }
        C56391yDq.AEQbTJ(obj);
        C19700gMb c19700gMb = this.EZpvd;
        CommonDexInfo commonDexInfo = v6BaseQuoteResponse.getCommonDexInfo();
        kRB krb = c19700gMb.OLrzqt(C33129mqd.valueOf((commonDexInfo == null || (fromToken = commonDexInfo.getFromToken()) == null) ? null : fromToken.getChainId())) ? this.KWHzl : this.OLrzqt;
        advancedSubmitOrderUseCase$submitV6Order$12.label = 1;
        java.lang.Object objKWHzl = krb.KWHzl(v6BaseQuoteResponse, v6CalldataRequest, z, fragmentActivity, z2, taskDescription, advancedSubmitOrderUseCase$submitV6Order$12);
        return objKWHzl == objCopydefault ? objCopydefault : objKWHzl;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object KWHzl(@NotNull V6BaseQuoteResponse v6BaseQuoteResponse, boolean z, @NotNull Continuation<? super Result<? extends java.util.List<WalletDexService.SupportedMevNodeBean>>> continuation) {
        AdvancedSubmitOrderUseCase$getSelectionMev$1 advancedSubmitOrderUseCase$getSelectionMev$1;
        java.util.List list;
        DexMultiTokenInfoBean fromToken;
        if (continuation instanceof AdvancedSubmitOrderUseCase$getSelectionMev$1) {
            advancedSubmitOrderUseCase$getSelectionMev$1 = (AdvancedSubmitOrderUseCase$getSelectionMev$1) continuation;
            int i = advancedSubmitOrderUseCase$getSelectionMev$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                advancedSubmitOrderUseCase$getSelectionMev$1.label = i - Integer.MIN_VALUE;
            } else {
                advancedSubmitOrderUseCase$getSelectionMev$1 = new AdvancedSubmitOrderUseCase$getSelectionMev$1(this, continuation);
            }
        }
        java.lang.Object objAwaitFirst = advancedSubmitOrderUseCase$getSelectionMev$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = advancedSubmitOrderUseCase$getSelectionMev$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objAwaitFirst);
                Result.Application application = Result.Companion;
                CommonDexInfo commonDexInfo = v6BaseQuoteResponse.getCommonDexInfo();
                list = null;
                java.lang.String chainId = (commonDexInfo == null || (fromToken = commonDexInfo.getFromToken()) == null) ? null : fromToken.getChainId();
                AbstractC58185ywX<java.util.List<WalletDexService.SupportedMevNodeBean>> abstractC58185ywXEZpvd = (this.EZpvd.OLrzqt(C33129mqd.valueOf(chainId)) ? this.KWHzl : this.OLrzqt).EZpvd(chainId, z);
                if (abstractC58185ywXEZpvd != null) {
                    advancedSubmitOrderUseCase$getSelectionMev$1.label = 1;
                    objAwaitFirst = AwaitKt.awaitFirst(abstractC58185ywXEZpvd, advancedSubmitOrderUseCase$getSelectionMev$1);
                    if (objAwaitFirst == objCopydefault) {
                        return objCopydefault;
                    }
                }
                return Result.m7377constructorimpl(list);
            }
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objAwaitFirst);
            list = (java.util.List) objAwaitFirst;
            return Result.m7377constructorimpl(list);
        } catch (CancellationException e) {
            throw e;
        } catch (java.lang.Throwable th) {
            pUU.AEQbTJ("DEX", "dexRunCatching", th);
            Result.Application application2 = Result.Companion;
            return Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
    }
}
