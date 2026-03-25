package o;

import com.okinc.business.dex.api.bean.TokenBase;
import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import com.okinc.business.trade.features.home.meme.usecase.MemeQuickModeStrategyUseCase$tryGetPreloadedResult$1;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Deferred;
import o.kVR;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class kVY {
    public final C22311hcv AEQbTJ;
    public final kUU OLrzqt;
    public final kVR copydefault;

    @yCM
    public kVY(@NotNull kUU kuu, @NotNull C22311hcv c22311hcv, @NotNull kVR kvr) {
        Intrinsics.checkNotNullParameter(kuu, "");
        Intrinsics.checkNotNullParameter(c22311hcv, "");
        Intrinsics.checkNotNullParameter(kvr, "");
        this.OLrzqt = kuu;
        this.AEQbTJ = c22311hcv;
        this.copydefault = kvr;
    }

    public static final class ActionBar {
        public final DexMultiTokenInfoBean AEQbTJ;
        public final java.lang.String EZpvd;
        public final DexMultiTokenInfoBean OLrzqt;
        public final kXM copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ ActionBar copy$default(ActionBar actionBar, DexMultiTokenInfoBean dexMultiTokenInfoBean, DexMultiTokenInfoBean dexMultiTokenInfoBean2, kXM kxm, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                dexMultiTokenInfoBean = actionBar.AEQbTJ;
            }
            if ((i & 2) != 0) {
                dexMultiTokenInfoBean2 = actionBar.OLrzqt;
            }
            if ((i & 4) != 0) {
                kxm = actionBar.copydefault;
            }
            if ((i & 8) != 0) {
                str = actionBar.EZpvd;
            }
            return actionBar.OLrzqt(dexMultiTokenInfoBean, dexMultiTokenInfoBean2, kxm, str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AEQbTJ() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final kXM EZpvd() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final DexMultiTokenInfoBean KWHzl() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final DexMultiTokenInfoBean OLrzqt() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ActionBar OLrzqt(@NotNull DexMultiTokenInfoBean dexMultiTokenInfoBean, @NotNull DexMultiTokenInfoBean dexMultiTokenInfoBean2, @NotNull kXM kxm, @NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(dexMultiTokenInfoBean, "");
            Intrinsics.checkNotNullParameter(dexMultiTokenInfoBean2, "");
            Intrinsics.checkNotNullParameter(kxm, "");
            Intrinsics.checkNotNullParameter(str, "");
            return new ActionBar(dexMultiTokenInfoBean, dexMultiTokenInfoBean2, kxm, str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ActionBar)) {
                return false;
            }
            ActionBar actionBar = (ActionBar) obj;
            return Intrinsics.EZpvd(this.AEQbTJ, actionBar.AEQbTJ) && Intrinsics.EZpvd(this.OLrzqt, actionBar.OLrzqt) && Intrinsics.EZpvd(this.copydefault, actionBar.copydefault) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) actionBar.EZpvd);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((((this.AEQbTJ.hashCode() * 31) + this.OLrzqt.hashCode()) * 31) + this.copydefault.hashCode()) * 31) + this.EZpvd.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "QuickModeResultData(transactionTokenInfo=" + this.AEQbTJ + ", currencyTokenInfo=" + this.OLrzqt + ", configResults=" + this.copydefault + ", currencyTokenAddress=" + this.EZpvd + ")";
        }

        public ActionBar(@NotNull DexMultiTokenInfoBean dexMultiTokenInfoBean, @NotNull DexMultiTokenInfoBean dexMultiTokenInfoBean2, @NotNull kXM kxm, @NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(dexMultiTokenInfoBean, "");
            Intrinsics.checkNotNullParameter(dexMultiTokenInfoBean2, "");
            Intrinsics.checkNotNullParameter(kxm, "");
            Intrinsics.checkNotNullParameter(str, "");
            this.AEQbTJ = dexMultiTokenInfoBean;
            this.OLrzqt = dexMultiTokenInfoBean2;
            this.copydefault = kxm;
            this.EZpvd = str;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object AEQbTJ(@NotNull TokenBase tokenBase, @NotNull Continuation<? super Result<ActionBar>> continuation) throws java.lang.Throwable {
        MemeQuickModeStrategyUseCase$tryGetPreloadedResult$1 memeQuickModeStrategyUseCase$tryGetPreloadedResult$1;
        java.lang.Object objM7377constructorimpl;
        kVR.StateListAnimator stateListAnimatorOLrzqt;
        java.lang.String strAEQbTJ;
        kVR.StateListAnimator stateListAnimator;
        java.lang.String str;
        DexMultiTokenInfoBean dexMultiTokenInfoBean;
        DexMultiTokenInfoBean dexMultiTokenInfoBean2;
        if (continuation instanceof MemeQuickModeStrategyUseCase$tryGetPreloadedResult$1) {
            memeQuickModeStrategyUseCase$tryGetPreloadedResult$1 = (MemeQuickModeStrategyUseCase$tryGetPreloadedResult$1) continuation;
            int i = memeQuickModeStrategyUseCase$tryGetPreloadedResult$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                memeQuickModeStrategyUseCase$tryGetPreloadedResult$1.label = i - Integer.MIN_VALUE;
            } else {
                memeQuickModeStrategyUseCase$tryGetPreloadedResult$1 = new MemeQuickModeStrategyUseCase$tryGetPreloadedResult$1(this, continuation);
            }
        }
        java.lang.Object obj = memeQuickModeStrategyUseCase$tryGetPreloadedResult$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = memeQuickModeStrategyUseCase$tryGetPreloadedResult$1.label;
        try {
            try {
            } catch (java.lang.Throwable th) {
                Result.Application application = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
            if (i2 == 0) {
                C56391yDq.AEQbTJ(obj);
                if (!C31172lox.KWHzl(this.OLrzqt.AEQbTJ(), C31172lox.Companion.OLrzqt()) || !tokenBase.isMarketDetailEntry() || (stateListAnimatorOLrzqt = this.copydefault.OLrzqt(tokenBase.getChainId(), tokenBase.getTokenContractAddress())) == null) {
                    return null;
                }
                strAEQbTJ = this.AEQbTJ.AEQbTJ(tokenBase.getChainId());
                Deferred<Result<kotlin.Pair<DexMultiTokenInfoBean, DexMultiTokenInfoBean>>> deferredEZpvd = stateListAnimatorOLrzqt.EZpvd();
                memeQuickModeStrategyUseCase$tryGetPreloadedResult$1.L$0 = tokenBase;
                memeQuickModeStrategyUseCase$tryGetPreloadedResult$1.L$1 = stateListAnimatorOLrzqt;
                memeQuickModeStrategyUseCase$tryGetPreloadedResult$1.L$2 = strAEQbTJ;
                memeQuickModeStrategyUseCase$tryGetPreloadedResult$1.label = 1;
                java.lang.Object objAwait = deferredEZpvd.await(memeQuickModeStrategyUseCase$tryGetPreloadedResult$1);
                if (objAwait == objCopydefault) {
                    return objCopydefault;
                }
                stateListAnimator = stateListAnimatorOLrzqt;
                obj = objAwait;
            } else {
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    dexMultiTokenInfoBean2 = (DexMultiTokenInfoBean) memeQuickModeStrategyUseCase$tryGetPreloadedResult$1.L$2;
                    dexMultiTokenInfoBean = (DexMultiTokenInfoBean) memeQuickModeStrategyUseCase$tryGetPreloadedResult$1.L$1;
                    str = (java.lang.String) memeQuickModeStrategyUseCase$tryGetPreloadedResult$1.L$0;
                    C56391yDq.AEQbTJ(obj);
                    objM7377constructorimpl = Result.m7377constructorimpl(new ActionBar(dexMultiTokenInfoBean, dexMultiTokenInfoBean2, (kXM) obj, str));
                    return Result.m7376boximpl(objM7377constructorimpl);
                }
                java.lang.String str2 = (java.lang.String) memeQuickModeStrategyUseCase$tryGetPreloadedResult$1.L$2;
                kVR.StateListAnimator stateListAnimator2 = (kVR.StateListAnimator) memeQuickModeStrategyUseCase$tryGetPreloadedResult$1.L$1;
                TokenBase tokenBase2 = (TokenBase) memeQuickModeStrategyUseCase$tryGetPreloadedResult$1.L$0;
                C56391yDq.AEQbTJ(obj);
                strAEQbTJ = str2;
                tokenBase = tokenBase2;
                stateListAnimator = stateListAnimator2;
            }
            java.lang.Object objM7386unboximpl = ((Result) obj).m7386unboximpl();
            if (Result.m7384isSuccessimpl(objM7386unboximpl)) {
                Result.Application application2 = Result.Companion;
                kotlin.Pair pair = (kotlin.Pair) objM7386unboximpl;
                DexMultiTokenInfoBean dexMultiTokenInfoBean3 = (DexMultiTokenInfoBean) pair.component1();
                DexMultiTokenInfoBean dexMultiTokenInfoBean4 = (DexMultiTokenInfoBean) pair.component2();
                if (!Intrinsics.EZpvd((java.lang.Object) dexMultiTokenInfoBean3.getChainId(), (java.lang.Object) tokenBase.getChainId())) {
                    throw new java.lang.IllegalStateException("Preloaded chainId mismatch");
                }
                Deferred<kXM> deferredAEQbTJ = stateListAnimator.AEQbTJ();
                memeQuickModeStrategyUseCase$tryGetPreloadedResult$1.L$0 = strAEQbTJ;
                memeQuickModeStrategyUseCase$tryGetPreloadedResult$1.L$1 = dexMultiTokenInfoBean3;
                memeQuickModeStrategyUseCase$tryGetPreloadedResult$1.L$2 = dexMultiTokenInfoBean4;
                memeQuickModeStrategyUseCase$tryGetPreloadedResult$1.label = 2;
                java.lang.Object objAwait2 = deferredAEQbTJ.await(memeQuickModeStrategyUseCase$tryGetPreloadedResult$1);
                if (objAwait2 == objCopydefault) {
                    return objCopydefault;
                }
                str = strAEQbTJ;
                dexMultiTokenInfoBean = dexMultiTokenInfoBean3;
                obj = objAwait2;
                dexMultiTokenInfoBean2 = dexMultiTokenInfoBean4;
                objM7377constructorimpl = Result.m7377constructorimpl(new ActionBar(dexMultiTokenInfoBean, dexMultiTokenInfoBean2, (kXM) obj, str));
                return Result.m7376boximpl(objM7377constructorimpl);
            }
            objM7377constructorimpl = Result.m7377constructorimpl(objM7386unboximpl);
            return Result.m7376boximpl(objM7377constructorimpl);
        } catch (java.lang.Exception e) {
            Result.Application application3 = Result.Companion;
            return Result.m7376boximpl(Result.m7377constructorimpl(C56391yDq.EZpvd(e)));
        }
    }

    public final void AEQbTJ(boolean z, int i) {
        this.copydefault.OLrzqt(z, i);
    }
}
