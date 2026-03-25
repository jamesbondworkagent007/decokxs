package com.okinc.business.dexlogic.bean;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* JADX INFO: loaded from: classes5.dex */
@Serializable
public final class TokenCheckInfo {
    private final Integer errorCode;
    private final DexMultiTokenInfoBean fromTokenInfo;
    private final DexMultiTokenInfoBean toTokenInfo;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TokenCheckInfo() {
        this((Integer) null, (DexMultiTokenInfoBean) null, (DexMultiTokenInfoBean) null, 7, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ TokenCheckInfo copy$default(TokenCheckInfo tokenCheckInfo, Integer num, DexMultiTokenInfoBean dexMultiTokenInfoBean, DexMultiTokenInfoBean dexMultiTokenInfoBean2, int i, Object obj) {
        if ((i & 1) != 0) {
            num = tokenCheckInfo.errorCode;
        }
        if ((i & 2) != 0) {
            dexMultiTokenInfoBean = tokenCheckInfo.fromTokenInfo;
        }
        if ((i & 4) != 0) {
            dexMultiTokenInfoBean2 = tokenCheckInfo.toTokenInfo;
        }
        return tokenCheckInfo.copy(num, dexMultiTokenInfoBean, dexMultiTokenInfoBean2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component1() {
        return this.errorCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DexMultiTokenInfoBean component2() {
        return this.fromTokenInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DexMultiTokenInfoBean component3() {
        return this.toTokenInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TokenCheckInfo copy(Integer num, DexMultiTokenInfoBean dexMultiTokenInfoBean, DexMultiTokenInfoBean dexMultiTokenInfoBean2) {
        return new TokenCheckInfo(num, dexMultiTokenInfoBean, dexMultiTokenInfoBean2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TokenCheckInfo)) {
            return false;
        }
        TokenCheckInfo tokenCheckInfo = (TokenCheckInfo) obj;
        return Intrinsics.EZpvd(this.errorCode, tokenCheckInfo.errorCode) && Intrinsics.EZpvd(this.fromTokenInfo, tokenCheckInfo.fromTokenInfo) && Intrinsics.EZpvd(this.toTokenInfo, tokenCheckInfo.toTokenInfo);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getErrorCode() {
        return this.errorCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DexMultiTokenInfoBean getFromTokenInfo() {
        return this.fromTokenInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DexMultiTokenInfoBean getToTokenInfo() {
        return this.toTokenInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        Integer num = this.errorCode;
        int iHashCode = num == null ? 0 : num.hashCode();
        DexMultiTokenInfoBean dexMultiTokenInfoBean = this.fromTokenInfo;
        int iHashCode2 = dexMultiTokenInfoBean == null ? 0 : dexMultiTokenInfoBean.hashCode();
        DexMultiTokenInfoBean dexMultiTokenInfoBean2 = this.toTokenInfo;
        return (((iHashCode * 31) + iHashCode2) * 31) + (dexMultiTokenInfoBean2 != null ? dexMultiTokenInfoBean2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TokenCheckInfo(errorCode=" + this.errorCode + ", fromTokenInfo=" + this.fromTokenInfo + ", toTokenInfo=" + this.toTokenInfo + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.dexlogic.bean.TokenCheckInfo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<TokenCheckInfo> serializer() {
            return TokenCheckInfo$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ TokenCheckInfo(int i, Integer num, DexMultiTokenInfoBean dexMultiTokenInfoBean, DexMultiTokenInfoBean dexMultiTokenInfoBean2, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.errorCode = null;
        } else {
            this.errorCode = num;
        }
        if ((i & 2) == 0) {
            this.fromTokenInfo = null;
        } else {
            this.fromTokenInfo = dexMultiTokenInfoBean;
        }
        if ((i & 4) == 0) {
            this.toTokenInfo = null;
        } else {
            this.toTokenInfo = dexMultiTokenInfoBean2;
        }
    }

    public static final /* synthetic */ void write$Self$OKDex_dex_impl(TokenCheckInfo tokenCheckInfo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || tokenCheckInfo.errorCode != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, IntSerializer.INSTANCE, tokenCheckInfo.errorCode);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || tokenCheckInfo.fromTokenInfo != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, DexMultiTokenInfoBean$$serializer.INSTANCE, tokenCheckInfo.fromTokenInfo);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && tokenCheckInfo.toTokenInfo == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, DexMultiTokenInfoBean$$serializer.INSTANCE, tokenCheckInfo.toTokenInfo);
    }

    public TokenCheckInfo(Integer num, DexMultiTokenInfoBean dexMultiTokenInfoBean, DexMultiTokenInfoBean dexMultiTokenInfoBean2) {
        this.errorCode = num;
        this.fromTokenInfo = dexMultiTokenInfoBean;
        this.toTokenInfo = dexMultiTokenInfoBean2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r2v0 java.lang.Integer))
  (wrap:com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean) : (r3v0 com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean))
  (wrap:com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean:?: TERNARY null = ((wrap:int:0x000b: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean) : (r4v0 com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean))
 A[MD:(java.lang.Integer, com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean, com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean):void (m)] (LINE:14) call: com.okinc.business.dexlogic.bean.TokenCheckInfo.<init>(java.lang.Integer, com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean, com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean):void type: THIS */
    public /* synthetic */ TokenCheckInfo(Integer num, DexMultiTokenInfoBean dexMultiTokenInfoBean, DexMultiTokenInfoBean dexMultiTokenInfoBean2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : dexMultiTokenInfoBean, (i & 4) != 0 ? null : dexMultiTokenInfoBean2);
    }

    public final boolean isError() {
        Integer num = this.errorCode;
        return num == null || num.intValue() != 0;
    }

    public final boolean isChainTokenInvalid() {
        Integer num = this.errorCode;
        return num != null && num.intValue() == 40000;
    }

    public final boolean isSameToken() {
        Integer num = this.errorCode;
        return num != null && num.intValue() == 40004;
    }

    public final boolean isAAWalletNotChain() {
        Integer num = this.errorCode;
        return num != null && num.intValue() == 70002;
    }
}
