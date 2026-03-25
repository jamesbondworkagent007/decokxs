package com.okinc.business.trade.features.home.ui.cefi.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.business.dex.trade.core.domain.model.AutoSlippageInfo;
import com.okinc.business.dex.trade.core.domain.model.CommonDexInfo;
import com.okinc.business.dex.trade.core.domain.model.DefiPlatformInfo;
import com.okinc.business.dex.trade.core.domain.model.NetworkFeeInfo;
import com.okinc.business.dex.trade.core.domain.model.PriorityFee;
import com.okinc.business.dex.trade.core.domain.model.V6BaseQuoteResponse;
import com.okinc.business.dex.trade.core.domain.model.limit.TokenPairRateOrderInfo;
import com.okinc.business.dex.trade.core.domain.model.limit.TokenPairRateQuote;
import com.okinc.business.dexlogic.bean.DeFiPlatformForSwap;
import com.okinc.business.dexlogic.bean.DexAutoSlippageInfoParam;
import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import com.okinc.business.dexlogic.bean.MevInfoBean;
import com.okinc.business.dexlogic.bean.MevUnstableShowLevelType;
import com.okinc.business.dexlogic.bean.NonMevPriorityFeeInfo;
import com.okinc.business.dexlogic.bean.ServiceFeeInfo;
import com.okinc.business.dexlogic.bean.TraceData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C22340hdX;
import o.C28342kXw;
import o.C28345kXz;
import o.C56403yEb;
import o.gYQ;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public abstract class AdvancedQuoteAndCallData implements Parcelable {
    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.trade.features.home.ui.cefi.data.AdvancedQuoteAndCallData.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ AdvancedQuoteAndCallData(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AdvancedQuoteAndCallData() {
    }

    public static final class LegacyLimit extends AdvancedQuoteAndCallData {
        public static final Parcelable.Creator<LegacyLimit> CREATOR = new Creator();
        public final TokenPairRateQuote KWHzl;
        public final AdvancedQuoteResponse OLrzqt;

        public static final class Creator implements Parcelable.Creator<LegacyLimit> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final LegacyLimit createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return new LegacyLimit(AdvancedQuoteResponse.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : TokenPairRateQuote.CREATOR.createFromParcel(parcel));
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final LegacyLimit[] newArray(int i) {
                return new LegacyLimit[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ LegacyLimit copy$default(LegacyLimit legacyLimit, AdvancedQuoteResponse advancedQuoteResponse, TokenPairRateQuote tokenPairRateQuote, int i, Object obj) {
            if ((i & 1) != 0) {
                advancedQuoteResponse = legacyLimit.OLrzqt;
            }
            if ((i & 2) != 0) {
                tokenPairRateQuote = legacyLimit.KWHzl;
            }
            return legacyLimit.AEQbTJ(advancedQuoteResponse, tokenPairRateQuote);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final LegacyLimit AEQbTJ(@NotNull AdvancedQuoteResponse advancedQuoteResponse, TokenPairRateQuote tokenPairRateQuote) {
            Intrinsics.checkNotNullParameter(advancedQuoteResponse, "");
            return new LegacyLimit(advancedQuoteResponse, tokenPairRateQuote);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LegacyLimit)) {
                return false;
            }
            LegacyLimit legacyLimit = (LegacyLimit) obj;
            return Intrinsics.EZpvd(this.OLrzqt, legacyLimit.OLrzqt) && Intrinsics.EZpvd(this.KWHzl, legacyLimit.KWHzl);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final AdvancedQuoteResponse gHZMYf() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = this.OLrzqt.hashCode();
            TokenPairRateQuote tokenPairRateQuote = this.KWHzl;
            return (iHashCode * 31) + (tokenPairRateQuote == null ? 0 : tokenPairRateQuote.hashCode());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TokenPairRateQuote sSMYrx() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "LegacyLimit(quote=" + this.OLrzqt + ", limit=" + this.KWHzl + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            this.OLrzqt.writeToParcel(parcel, i);
            TokenPairRateQuote tokenPairRateQuote = this.KWHzl;
            if (tokenPairRateQuote == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                tokenPairRateQuote.writeToParcel(parcel, i);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LegacyLimit(@NotNull AdvancedQuoteResponse advancedQuoteResponse, TokenPairRateQuote tokenPairRateQuote) {
            super(null);
            Intrinsics.checkNotNullParameter(advancedQuoteResponse, "");
            this.OLrzqt = advancedQuoteResponse;
            this.KWHzl = tokenPairRateQuote;
        }
    }

    public static final class V6 extends AdvancedQuoteAndCallData {
        public static final Parcelable.Creator<V6> CREATOR = new Creator();
        public final V6BaseQuoteResponse AEQbTJ;

        public static final class Creator implements Parcelable.Creator<V6> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final V6 createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return new V6((V6BaseQuoteResponse) parcel.readParcelable(V6.class.getClassLoader()));
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final V6[] newArray(int i) {
                return new V6[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ V6 copy$default(V6 v6, V6BaseQuoteResponse v6BaseQuoteResponse, int i, Object obj) {
            if ((i & 1) != 0) {
                v6BaseQuoteResponse = v6.AEQbTJ;
            }
            return v6.copydefault(v6BaseQuoteResponse);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final V6 copydefault(@NotNull V6BaseQuoteResponse v6BaseQuoteResponse) {
            Intrinsics.checkNotNullParameter(v6BaseQuoteResponse, "");
            return new V6(v6BaseQuoteResponse);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof V6) && Intrinsics.EZpvd(this.AEQbTJ, ((V6) obj).AEQbTJ);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.AEQbTJ.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final V6BaseQuoteResponse sSMYrx() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "V6(quote=" + this.AEQbTJ + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeParcelable(this.AEQbTJ, i);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public V6(@NotNull V6BaseQuoteResponse v6BaseQuoteResponse) {
            super(null);
            Intrinsics.checkNotNullParameter(v6BaseQuoteResponse, "");
            this.AEQbTJ = v6BaseQuoteResponse;
        }
    }

    public final AutoSlippageInfo AEQbTJ() {
        DexAutoSlippageInfoParam slippageInfo;
        if (!(this instanceof LegacyLimit)) {
            if (this instanceof V6) {
                return ((V6) this).sSMYrx().autoSlippageInfo();
            }
            throw new NoWhenBranchMatchedException();
        }
        TokenPairRateQuote tokenPairRateQuoteSSMYrx = ((LegacyLimit) this).sSMYrx();
        if (tokenPairRateQuoteSSMYrx == null || (slippageInfo = tokenPairRateQuoteSSMYrx.getSlippageInfo()) == null) {
            return null;
        }
        return slippageInfo.toAutoSlippageInfo();
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x002a, code lost:
    
        if (r1 == null) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002c, code lost:
    
        return "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0030, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0012, code lost:
    
        if (r1 == null) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String AYXKKw() {
        String estimateGasFee;
        if (this instanceof LegacyLimit) {
            TokenPairRateQuote tokenPairRateQuoteSSMYrx = ((LegacyLimit) this).sSMYrx();
            estimateGasFee = tokenPairRateQuoteSSMYrx != null ? tokenPairRateQuoteSSMYrx.getEstimateGasFee() : null;
        } else {
            if (!(this instanceof V6)) {
                throw new NoWhenBranchMatchedException();
            }
            DefiPlatformInfo selectedDeFiPlatform = ((V6) this).sSMYrx().getSelectedDeFiPlatform();
            estimateGasFee = selectedDeFiPlatform != null ? selectedDeFiPlatform.getEstimateGasFee() : null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0030, code lost:
    
        if (r1 == null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0032, code lost:
    
        return "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0036, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0018, code lost:
    
        if (r1 == null) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String iwGUEr() {
        TokenPairRateOrderInfo orderInfo;
        if (this instanceof LegacyLimit) {
            TokenPairRateQuote tokenPairRateQuoteSSMYrx = ((LegacyLimit) this).sSMYrx();
            if (tokenPairRateQuoteSSMYrx != null && (orderInfo = tokenPairRateQuoteSSMYrx.getOrderInfo()) != null) {
                nativeTokenUnitPriceUsd = orderInfo.getNativeTokenUnitPriceUsd();
            }
        } else {
            if (!(this instanceof V6)) {
                throw new NoWhenBranchMatchedException();
            }
            CommonDexInfo commonDexInfo = ((V6) this).sSMYrx().getCommonDexInfo();
            nativeTokenUnitPriceUsd = commonDexInfo != null ? commonDexInfo.getNativeTokenUnitPriceUsd() : null;
        }
    }

    public final boolean isConnected() {
        if (!(this instanceof LegacyLimit)) {
            if (!(this instanceof V6)) {
                throw new NoWhenBranchMatchedException();
            }
            DefiPlatformInfo selectedDeFiPlatform = ((V6) this).sSMYrx().getSelectedDeFiPlatform();
            if (selectedDeFiPlatform != null && selectedDeFiPlatform.isMevUnstableError()) {
                return true;
            }
        }
        return false;
    }

    public final boolean values() {
        if (!(this instanceof LegacyLimit)) {
            if (!(this instanceof V6)) {
                throw new NoWhenBranchMatchedException();
            }
            DefiPlatformInfo selectedDeFiPlatform = ((V6) this).sSMYrx().getSelectedDeFiPlatform();
            if (selectedDeFiPlatform != null && selectedDeFiPlatform.isMevUnstableWarning()) {
                return true;
            }
        }
        return false;
    }

    public final String fARcdN() {
        if (this instanceof LegacyLimit) {
            return MevUnstableShowLevelType.NORMAL.getType();
        }
        if (!(this instanceof V6)) {
            throw new NoWhenBranchMatchedException();
        }
        DefiPlatformInfo selectedDeFiPlatform = ((V6) this).sSMYrx().getSelectedDeFiPlatform();
        String strValueOf = String.valueOf(selectedDeFiPlatform != null ? selectedDeFiPlatform.getMevUnstableShowLevel() : null);
        return strValueOf.length() == 0 ? MevUnstableShowLevelType.NORMAL.getType() : strValueOf;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x002a, code lost:
    
        if (r1 == null) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002c, code lost:
    
        return "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0030, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0012, code lost:
    
        if (r1 == null) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String valueOf() {
        String fromTokenValue;
        if (this instanceof LegacyLimit) {
            TokenPairRateQuote tokenPairRateQuoteSSMYrx = ((LegacyLimit) this).sSMYrx();
            fromTokenValue = tokenPairRateQuoteSSMYrx != null ? tokenPairRateQuoteSSMYrx.getFromTokenPrice() : null;
        } else {
            if (!(this instanceof V6)) {
                throw new NoWhenBranchMatchedException();
            }
            CommonDexInfo commonDexInfo = ((V6) this).sSMYrx().getCommonDexInfo();
            fromTokenValue = commonDexInfo != null ? commonDexInfo.getFromTokenValue() : null;
        }
    }

    public final String gEmmrt() {
        if (this instanceof LegacyLimit) {
            return ((LegacyLimit) this).gHZMYf().getCommonDexInfo().getFromTokenAmount();
        }
        if (!(this instanceof V6)) {
            throw new NoWhenBranchMatchedException();
        }
        CommonDexInfo commonDexInfo = ((V6) this).sSMYrx().getCommonDexInfo();
        String fromTokenAmount = commonDexInfo != null ? commonDexInfo.getFromTokenAmount() : null;
        return fromTokenAmount == null ? "" : fromTokenAmount;
    }

    public final String zLjUOn() {
        if (this instanceof LegacyLimit) {
            DeFiPlatformForSwap selectedDeFiPlatform = ((LegacyLimit) this).gHZMYf().getSelectedDeFiPlatform();
            String receiveAmount = selectedDeFiPlatform != null ? selectedDeFiPlatform.getReceiveAmount() : null;
            return receiveAmount == null ? "" : receiveAmount;
        }
        if (this instanceof V6) {
            return ((V6) this).sSMYrx().receiveAmount();
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x002e, code lost:
    
        if (r1 == null) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0030, code lost:
    
        return "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0034, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
    
        if (r1 == null) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String AxsJAY() {
        String toTokenValue;
        if (this instanceof LegacyLimit) {
            DeFiPlatformForSwap selectedDeFiPlatform = ((LegacyLimit) this).gHZMYf().getSelectedDeFiPlatform();
            toTokenValue = selectedDeFiPlatform != null ? selectedDeFiPlatform.getToTokenPrice() : null;
        } else {
            if (!(this instanceof V6)) {
                throw new NoWhenBranchMatchedException();
            }
            DefiPlatformInfo selectedDeFiPlatform2 = ((V6) this).sSMYrx().getSelectedDeFiPlatform();
            toTokenValue = selectedDeFiPlatform2 != null ? selectedDeFiPlatform2.getToTokenValue() : null;
        }
    }

    public final boolean fetchVPNInfo() {
        if (this instanceof LegacyLimit) {
            return false;
        }
        if (!(this instanceof V6)) {
            throw new NoWhenBranchMatchedException();
        }
        DefiPlatformInfo selectedDeFiPlatform = ((V6) this).sSMYrx().getSelectedDeFiPlatform();
        return Intrinsics.EZpvd((Object) (selectedDeFiPlatform != null ? selectedDeFiPlatform.isEnableMev() : null), (Object) "1");
    }

    public final boolean AuCTel() {
        if (this instanceof LegacyLimit) {
            DeFiPlatformForSwap selectedDeFiPlatform = ((LegacyLimit) this).gHZMYf().getSelectedDeFiPlatform();
            if (selectedDeFiPlatform != null && selectedDeFiPlatform.isPMM()) {
                return true;
            }
        } else {
            if (!(this instanceof V6)) {
                throw new NoWhenBranchMatchedException();
            }
            DefiPlatformInfo selectedDeFiPlatform2 = ((V6) this).sSMYrx().getSelectedDeFiPlatform();
            if (selectedDeFiPlatform2 != null && gYQ.copydefault(selectedDeFiPlatform2)) {
                return true;
            }
        }
        return false;
    }

    public final MevInfoBean fIwbmz() {
        List<PriorityFee> mev;
        if (this instanceof LegacyLimit) {
            return C22340hdX.KWHzl(((LegacyLimit) this).gHZMYf().getCommonDexInfo().getMevList());
        }
        if (!(this instanceof V6)) {
            throw new NoWhenBranchMatchedException();
        }
        NetworkFeeInfo networkFeeInfo = ((V6) this).sSMYrx().getNetworkFeeInfo();
        if (networkFeeInfo == null || (mev = networkFeeInfo.getMev()) == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(mev, 10));
        Iterator<T> it = mev.iterator();
        while (it.hasNext()) {
            arrayList.add(((PriorityFee) it.next()).toMevInfoBean());
        }
        return C22340hdX.KWHzl(arrayList);
    }

    public final NonMevPriorityFeeInfo getNewProxyInstance() {
        PriorityFee normal;
        if (this instanceof LegacyLimit) {
            return ((LegacyLimit) this).gHZMYf().getCommonDexInfo().getNonMevPriorityFeeInfo();
        }
        if (!(this instanceof V6)) {
            throw new NoWhenBranchMatchedException();
        }
        NetworkFeeInfo networkFeeInfo = ((V6) this).sSMYrx().getNetworkFeeInfo();
        if (networkFeeInfo == null || (normal = networkFeeInfo.getNormal()) == null) {
            return null;
        }
        return normal.toNonMevInfo();
    }

    public final String OLrzqt() {
        DeFiPlatformForSwap deFiPlatformForSwapEZpvd = EZpvd();
        if (deFiPlatformForSwapEZpvd != null) {
            return deFiPlatformForSwapEZpvd.getDefiPlatformId();
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x002e, code lost:
    
        if (r1 == null) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0030, code lost:
    
        return "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0034, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
    
        if (r1 == null) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String getFieldNames() {
        String quoteId;
        if (this instanceof LegacyLimit) {
            TraceData traceData = ((LegacyLimit) this).gHZMYf().getTraceData();
            quoteId = traceData != null ? traceData.getQuoteId() : null;
        } else {
            if (!(this instanceof V6)) {
                throw new NoWhenBranchMatchedException();
            }
            DefiPlatformInfo selectedDeFiPlatform = ((V6) this).sSMYrx().getSelectedDeFiPlatform();
            quoteId = selectedDeFiPlatform != null ? selectedDeFiPlatform.getQuoteId() : null;
        }
    }

    public final DexMultiTokenInfoBean AubY() {
        if (this instanceof LegacyLimit) {
            return ((LegacyLimit) this).gHZMYf().getCommonDexInfo().getToToken();
        }
        if (!(this instanceof V6)) {
            throw new NoWhenBranchMatchedException();
        }
        CommonDexInfo commonDexInfo = ((V6) this).sSMYrx().getCommonDexInfo();
        if (commonDexInfo != null) {
            return commonDexInfo.getToToken();
        }
        return null;
    }

    public final String copydefault() {
        if (this instanceof LegacyLimit) {
            DeFiPlatformForSwap selectedDeFiPlatform = ((LegacyLimit) this).gHZMYf().getSelectedDeFiPlatform();
            if (selectedDeFiPlatform != null) {
                return selectedDeFiPlatform.getDiffPercent();
            }
        } else {
            if (!(this instanceof V6)) {
                throw new NoWhenBranchMatchedException();
            }
            DefiPlatformInfo selectedDeFiPlatform2 = ((V6) this).sSMYrx().getSelectedDeFiPlatform();
            if (selectedDeFiPlatform2 != null) {
                return selectedDeFiPlatform2.getDiffPercent();
            }
        }
        return null;
    }

    public final DeFiPlatformForSwap EZpvd() {
        if (this instanceof LegacyLimit) {
            return ((LegacyLimit) this).gHZMYf().getSelectedDeFiPlatform();
        }
        if (!(this instanceof V6)) {
            throw new NoWhenBranchMatchedException();
        }
        DefiPlatformInfo selectedDeFiPlatform = ((V6) this).sSMYrx().getSelectedDeFiPlatform();
        if (selectedDeFiPlatform != null) {
            return C28342kXw.OLrzqt(selectedDeFiPlatform);
        }
        return null;
    }

    public final boolean zsXlph() {
        if (this instanceof LegacyLimit) {
            LegacyLimit legacyLimit = (LegacyLimit) this;
            if (legacyLimit.gHZMYf().getCommonDexInfo().supportDAppTrade() || legacyLimit.gHZMYf().isDAppRedirectDueToInsufficientLiquidityErrorCode()) {
                return true;
            }
        } else if (!(this instanceof V6)) {
            throw new NoWhenBranchMatchedException();
        }
        return false;
    }

    public final boolean AhwBna() {
        if (this instanceof LegacyLimit) {
            return ((LegacyLimit) this).gHZMYf().isBlackAddressErrorCode();
        }
        if (this instanceof V6) {
            return ((V6) this).sSMYrx().isBlackAddressErrorCode();
        }
        throw new NoWhenBranchMatchedException();
    }

    public final boolean AkhnZx() {
        if (this instanceof LegacyLimit) {
            return ((LegacyLimit) this).gHZMYf().isHoneypotErrorCode();
        }
        if (this instanceof V6) {
            return ((V6) this).sSMYrx().isHoneypotErrorCode();
        }
        throw new NoWhenBranchMatchedException();
    }

    public final Pair<Boolean, DexMultiTokenInfoBean> ejfBZ() {
        if (this instanceof LegacyLimit) {
            return ((LegacyLimit) this).gHZMYf().getCommonDexInfo().isSafeMoonToken();
        }
        if (!(this instanceof V6)) {
            throw new NoWhenBranchMatchedException();
        }
        CommonDexInfo commonDexInfo = ((V6) this).sSMYrx().getCommonDexInfo();
        if (commonDexInfo != null) {
            return commonDexInfo.isSafeMoonToken();
        }
        return null;
    }

    public final String uzCIH() {
        if (this instanceof LegacyLimit) {
            return ((LegacyLimit) this).gHZMYf().getCommonDexInfo().getMinSellAmount();
        }
        if (this instanceof V6) {
            return "";
        }
        throw new NoWhenBranchMatchedException();
    }

    public final boolean fJNWhG() {
        if (this instanceof LegacyLimit) {
            return ((LegacyLimit) this).gHZMYf().isOkxDexNotAvailableAnymore();
        }
        if (this instanceof V6) {
            return ((V6) this).sSMYrx().isOkxDexNotAvailableAnymore();
        }
        throw new NoWhenBranchMatchedException();
    }

    public final List<DeFiPlatformForSwap> hDKMBd() {
        ArrayList arrayList;
        if (this instanceof LegacyLimit) {
            return ((LegacyLimit) this).gHZMYf().getDefiPlatformInfoList();
        }
        if (!(this instanceof V6)) {
            throw new NoWhenBranchMatchedException();
        }
        List<DefiPlatformInfo> defiPlatformInfoList = ((V6) this).sSMYrx().getDefiPlatformInfoList();
        if (defiPlatformInfoList != null) {
            ArrayList arrayList2 = new ArrayList();
            Iterator<T> it = defiPlatformInfoList.iterator();
            while (it.hasNext()) {
                DeFiPlatformForSwap deFiPlatformForSwapOLrzqt = C28342kXw.OLrzqt((DefiPlatformInfo) it.next());
                if (deFiPlatformForSwapOLrzqt != null) {
                    arrayList2.add(deFiPlatformForSwapOLrzqt);
                }
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        return arrayList == null ? yDY.AhwBna() : arrayList;
    }

    public final boolean djBIcL() {
        if (this instanceof LegacyLimit) {
            return ((LegacyLimit) this).gHZMYf().getHasError();
        }
        if (this instanceof V6) {
            return false;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final String AuCTelauCTel() {
        if (this instanceof LegacyLimit) {
            return ((LegacyLimit) this).gHZMYf().getCommonDexInfo().getEstReserveNativeAmt();
        }
        if (!(this instanceof V6)) {
            throw new NoWhenBranchMatchedException();
        }
        CommonDexInfo commonDexInfo = ((V6) this).sSMYrx().getCommonDexInfo();
        if (commonDexInfo != null) {
            return commonDexInfo.getEstimateReserveGasTokenFee();
        }
        return null;
    }

    public final ServiceFeeInfo wlaJM() {
        com.okinc.business.dex.trade.core.domain.model.ServiceFeeInfo serviceFeeInfo;
        if (this instanceof LegacyLimit) {
            DeFiPlatformForSwap selectedDeFiPlatform = ((LegacyLimit) this).gHZMYf().getSelectedDeFiPlatform();
            if (selectedDeFiPlatform != null) {
                return selectedDeFiPlatform.getServiceFeeInfo();
            }
        } else {
            if (!(this instanceof V6)) {
                throw new NoWhenBranchMatchedException();
            }
            DefiPlatformInfo selectedDeFiPlatform2 = ((V6) this).sSMYrx().getSelectedDeFiPlatform();
            if (selectedDeFiPlatform2 != null && (serviceFeeInfo = selectedDeFiPlatform2.getServiceFeeInfo()) != null) {
                return C28345kXz.OLrzqt(serviceFeeInfo);
            }
        }
        return null;
    }

    public final String KWHzl() {
        if (this instanceof LegacyLimit) {
            return ((LegacyLimit) this).gHZMYf().getErrorMsg();
        }
        if (this instanceof V6) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final boolean DbNXlk() {
        if (this instanceof LegacyLimit) {
            return true;
        }
        if (!(this instanceof V6)) {
            throw new NoWhenBranchMatchedException();
        }
        DefiPlatformInfo selectedDeFiPlatform = ((V6) this).sSMYrx().getSelectedDeFiPlatform();
        return Intrinsics.EZpvd((Object) (selectedDeFiPlatform != null ? selectedDeFiPlatform.getDefiPlatformId() : null), (Object) "11");
    }
}
