package o;

import com.okinc.business.dex.trade.core.domain.model.V6QuoteRequest;
import com.okinc.business.dex.trade.core.domain.model.V6QuoteResponseData;
import com.okinc.business.dexlogic.MemeChainType;
import com.okinc.business.dexlogic.bean.CommonMemeQuoteParams;
import com.okinc.business.dexlogic.bean.DefiChainInfo;
import com.okinc.business.dexlogic.bean.MemeModeQuoteBean;
import com.okinc.business.dexlogic.bean.PriorityFeeType;
import com.okinc.business.dexlogic.bean.TradeMode;
import com.okinc.business.dexlogic.bean.TransactionType;
import com.okinc.business.trade.features.home.meme.usecase.preset.PresetMemeQuoteUseCase$executeV6Quote$1;
import com.okinc.business.trade.features.home.meme.usecase.preset.PresetMemeQuoteUseCase$quote$1;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.kWR;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kWb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C28294kWb {
    public final kVV EZpvd;
    public final kWR copydefault;

    @yCM
    public C28294kWb(@NotNull kWR kwr, @NotNull kVV kvv) {
        Intrinsics.checkNotNullParameter(kwr, "");
        Intrinsics.checkNotNullParameter(kvv, "");
        this.copydefault = kwr;
        this.EZpvd = kvv;
    }

    /* JADX INFO: renamed from: o.kWb$StateListAnimator */
    /* JADX INFO: loaded from: classes15.dex */
    public static final class StateListAnimator {
        public final int AEQbTJ;
        public final java.lang.String AYXKKw;
        public final java.lang.String AhwBna;
        public final java.lang.String EZpvd;
        public final java.lang.String KWHzl;
        public final int OLrzqt;
        public final java.lang.String copydefault;
        public final boolean djBIcL;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int AEQbTJ() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean AYXKKw() {
            return this.djBIcL;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String EZpvd() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int KWHzl() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String OLrzqt() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final StateListAnimator OLrzqt(int i, @NotNull java.lang.String str, int i2, @NotNull java.lang.String str2, boolean z, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            return new StateListAnimator(i, str, i2, str2, z, str3, str4, str5);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String copydefault() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String djBIcL() {
            return this.AhwBna;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof StateListAnimator)) {
                return false;
            }
            StateListAnimator stateListAnimator = (StateListAnimator) obj;
            return this.AEQbTJ == stateListAnimator.AEQbTJ && Intrinsics.EZpvd((java.lang.Object) this.AhwBna, (java.lang.Object) stateListAnimator.AhwBna) && this.OLrzqt == stateListAnimator.OLrzqt && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) stateListAnimator.EZpvd) && this.djBIcL == stateListAnimator.djBIcL && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) stateListAnimator.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) stateListAnimator.copydefault) && Intrinsics.EZpvd((java.lang.Object) this.AYXKKw, (java.lang.Object) stateListAnimator.AYXKKw);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String gEmmrt() {
            return this.AYXKKw;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = java.lang.Integer.hashCode(this.AEQbTJ);
            int iHashCode2 = this.AhwBna.hashCode();
            int iHashCode3 = java.lang.Integer.hashCode(this.OLrzqt);
            int iHashCode4 = this.EZpvd.hashCode();
            int iHashCode5 = java.lang.Boolean.hashCode(this.djBIcL);
            java.lang.String str = this.KWHzl;
            int iHashCode6 = str == null ? 0 : str.hashCode();
            java.lang.String str2 = this.copydefault;
            int iHashCode7 = str2 == null ? 0 : str2.hashCode();
            java.lang.String str3 = this.AYXKKw;
            return (((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + (str3 != null ? str3.hashCode() : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "V6ExtraParams(direction=" + this.AEQbTJ + ", routerModeType=" + this.AhwBna + ", priorityFeeType=" + this.OLrzqt + ", priorityFeeValue=" + this.EZpvd + ", supportCustomGas=" + this.djBIcL + ", defiPlatformIds=" + this.KWHzl + ", refCode=" + this.copydefault + ", referralCommissionVersion=" + this.AYXKKw + ")";
        }

        public StateListAnimator(int i, @NotNull java.lang.String str, int i2, @NotNull java.lang.String str2, boolean z, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            this.AEQbTJ = i;
            this.AhwBna = str;
            this.OLrzqt = i2;
            this.EZpvd = str2;
            this.djBIcL = z;
            this.KWHzl = str3;
            this.copydefault = str4;
            this.AYXKKw = str5;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0023: CONSTRUCTOR 
  (r13v0 int)
  (r14v0 java.lang.String)
  (r15v0 int)
  (r16v0 java.lang.String)
  (r17v0 boolean)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r21v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r18v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r21v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r19v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0013: ARITH (r21v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r20v0 java.lang.String))
 A[MD:(int, java.lang.String, int, java.lang.String, boolean, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:19) call: o.kWb.StateListAnimator.<init>(int, java.lang.String, int, java.lang.String, boolean, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
        public /* synthetic */ StateListAnimator(int i, java.lang.String str, int i2, java.lang.String str2, boolean z, java.lang.String str3, java.lang.String str4, java.lang.String str5, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this(i, str, i2, str2, z, (i3 & 32) != 0 ? null : str3, (i3 & 64) != 0 ? null : str4, (i3 & 128) != 0 ? null : str5);
        }
    }

    /* JADX INFO: renamed from: quote-0E7RQCE$default, reason: not valid java name */
    public static /* synthetic */ java.lang.Object m8657quote0E7RQCE$default(C28294kWb c28294kWb, CommonMemeQuoteParams commonMemeQuoteParams, StateListAnimator stateListAnimator, Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            stateListAnimator = null;
        }
        return c28294kWb.KWHzl(commonMemeQuoteParams, stateListAnimator, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object KWHzl(@NotNull CommonMemeQuoteParams commonMemeQuoteParams, StateListAnimator stateListAnimator, @NotNull Continuation<? super Result<MemeModeQuoteBean>> continuation) throws java.lang.Throwable {
        PresetMemeQuoteUseCase$quote$1 presetMemeQuoteUseCase$quote$1;
        if (continuation instanceof PresetMemeQuoteUseCase$quote$1) {
            presetMemeQuoteUseCase$quote$1 = (PresetMemeQuoteUseCase$quote$1) continuation;
            int i = presetMemeQuoteUseCase$quote$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                presetMemeQuoteUseCase$quote$1.label = i - Integer.MIN_VALUE;
            } else {
                presetMemeQuoteUseCase$quote$1 = new PresetMemeQuoteUseCase$quote$1(this, continuation);
            }
        }
        java.lang.Object obj = presetMemeQuoteUseCase$quote$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = presetMemeQuoteUseCase$quote$1.label;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            return ((Result) obj).m7386unboximpl();
        }
        C56391yDq.AEQbTJ(obj);
        presetMemeQuoteUseCase$quote$1.label = 1;
        java.lang.Object objAEQbTJ = AEQbTJ(commonMemeQuoteParams, stateListAnimator, presetMemeQuoteUseCase$quote$1);
        return objAEQbTJ == objCopydefault ? objCopydefault : objAEQbTJ;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object AEQbTJ(CommonMemeQuoteParams commonMemeQuoteParams, StateListAnimator stateListAnimator, Continuation<? super Result<MemeModeQuoteBean>> continuation) throws java.lang.Throwable {
        PresetMemeQuoteUseCase$executeV6Quote$1 presetMemeQuoteUseCase$executeV6Quote$1;
        java.lang.Object objCopydefault;
        C28294kWb c28294kWb;
        CommonMemeQuoteParams commonMemeQuoteParams2;
        java.lang.Object next;
        java.lang.String value;
        if (continuation instanceof PresetMemeQuoteUseCase$executeV6Quote$1) {
            presetMemeQuoteUseCase$executeV6Quote$1 = (PresetMemeQuoteUseCase$executeV6Quote$1) continuation;
            int i = presetMemeQuoteUseCase$executeV6Quote$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                presetMemeQuoteUseCase$executeV6Quote$1.label = i - Integer.MIN_VALUE;
            } else {
                presetMemeQuoteUseCase$executeV6Quote$1 = new PresetMemeQuoteUseCase$executeV6Quote$1(this, continuation);
            }
        }
        java.lang.Object obj = presetMemeQuoteUseCase$executeV6Quote$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = presetMemeQuoteUseCase$executeV6Quote$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            StateListAnimator stateListAnimatorOLrzqt = stateListAnimator == null ? OLrzqt(commonMemeQuoteParams.getChainId()) : stateListAnimator;
            java.lang.String chainId = commonMemeQuoteParams.getChainId();
            java.lang.String fromTokenAddress = commonMemeQuoteParams.getFromTokenAddress();
            java.lang.String toTokenAddress = commonMemeQuoteParams.getToTokenAddress();
            java.lang.String amount = commonMemeQuoteParams.getAmount();
            java.lang.String userWalletAddress = commonMemeQuoteParams.getUserWalletAddress();
            int iKWHzl = stateListAnimatorOLrzqt.KWHzl();
            java.lang.String strDjBIcL = stateListAnimatorOLrzqt.djBIcL();
            java.lang.String slippage = commonMemeQuoteParams.getSlippage();
            if (slippage == null) {
                slippage = "";
            }
            V6QuoteRequest v6QuoteRequestCopydefault = this.copydefault.copydefault(new kWR.TaskDescription(chainId, fromTokenAddress, toTokenAddress, amount, userWalletAddress, iKWHzl, strDjBIcL, slippage, commonMemeQuoteParams.getMaxSlippage(), C56443yFo.AEQbTJ(commonMemeQuoteParams.getSlippageType()), stateListAnimatorOLrzqt.AEQbTJ(), stateListAnimatorOLrzqt.OLrzqt(), stateListAnimatorOLrzqt.copydefault(), stateListAnimatorOLrzqt.gEmmrt(), stateListAnimatorOLrzqt.EZpvd(), stateListAnimator != null ? stateListAnimator.AYXKKw() : false, false), java.lang.String.valueOf(TradeMode.MemeMode.getType()));
            kWR kwr = this.copydefault;
            presetMemeQuoteUseCase$executeV6Quote$1.L$0 = this;
            presetMemeQuoteUseCase$executeV6Quote$1.L$1 = commonMemeQuoteParams;
            presetMemeQuoteUseCase$executeV6Quote$1.label = 1;
            objCopydefault = kwr.copydefault(v6QuoteRequestCopydefault, presetMemeQuoteUseCase$executeV6Quote$1);
            if (objCopydefault == objCopydefault2) {
                return objCopydefault2;
            }
            c28294kWb = this;
            commonMemeQuoteParams2 = commonMemeQuoteParams;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            commonMemeQuoteParams2 = (CommonMemeQuoteParams) presetMemeQuoteUseCase$executeV6Quote$1.L$1;
            c28294kWb = (C28294kWb) presetMemeQuoteUseCase$executeV6Quote$1.L$0;
            C56391yDq.AEQbTJ(obj);
            objCopydefault = ((Result) obj).m7386unboximpl();
        }
        if (Result.m7384isSuccessimpl(objCopydefault)) {
            Result.Application application = Result.Companion;
            V6QuoteResponseData v6QuoteResponseData = (V6QuoteResponseData) objCopydefault;
            java.util.Iterator<T> it = c28294kWb.EZpvd.EZpvd().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (Intrinsics.EZpvd((java.lang.Object) ((DefiChainInfo) next).getChainId(), (java.lang.Object) commonMemeQuoteParams2.getChainId())) {
                    break;
                }
            }
            DefiChainInfo defiChainInfo = (DefiChainInfo) next;
            if (defiChainInfo == null || (value = defiChainInfo.getNetworkFeeType()) == null) {
                value = MemeChainType.MemeChainTypeOther.getValue();
            }
            objCopydefault = C28343kXx.AEQbTJ(v6QuoteResponseData, defiChainInfo != null ? defiChainInfo.getSupportEip1559() : false, value);
        }
        return Result.m7377constructorimpl(objCopydefault);
    }

    public final StateListAnimator OLrzqt(java.lang.String str) {
        return new StateListAnimator(TransactionType.Buy.getType(), "", PriorityFeeType.PriorityMarket.getValue(), "", false, null, null, null, 224, null);
    }
}
