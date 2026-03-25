package com.okinc.business.invest_biz.data.bean;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Serializable
public final class TokenInvestDetailResponse {
    public final List<TokenInvestDetail> investDetails;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final KSerializer<Object>[] $childSerializers = {new ArrayListSerializer(TokenInvestDetail$$serializer.INSTANCE)};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TokenInvestDetailResponse() {
        this((List) null, 1, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.invest_biz.data.bean.TokenInvestDetailResponse */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TokenInvestDetailResponse copy$default(TokenInvestDetailResponse tokenInvestDetailResponse, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = tokenInvestDetailResponse.investDetails;
        }
        return tokenInvestDetailResponse.AEQbTJ(list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TokenInvestDetailResponse AEQbTJ(@NotNull List<TokenInvestDetail> list) {
        Intrinsics.checkNotNullParameter(list, "");
        return new TokenInvestDetailResponse(list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<TokenInvestDetail> OLrzqt() {
        return this.investDetails;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof TokenInvestDetailResponse) && Intrinsics.EZpvd(this.investDetails, ((TokenInvestDetailResponse) obj).investDetails);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return this.investDetails.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TokenInvestDetailResponse(investDetails=" + this.investDetails + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.invest_biz.data.bean.TokenInvestDetailResponse.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<TokenInvestDetailResponse> serializer() {
            return TokenInvestDetailResponse$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ TokenInvestDetailResponse(int i, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.investDetails = yDY.AhwBna();
        } else {
            this.investDetails = list;
        }
    }

    public static final /* synthetic */ void copydefault(TokenInvestDetailResponse tokenInvestDetailResponse, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) && Intrinsics.EZpvd(tokenInvestDetailResponse.investDetails, yDY.AhwBna())) {
            return;
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 0, kSerializerArr[0], tokenInvestDetailResponse.investDetails);
    }

    public TokenInvestDetailResponse(@NotNull List<TokenInvestDetail> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.investDetails = list;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0008: CONSTRUCTOR 
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0004: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:578)) : (r1v0 java.util.List))
 A[MD:(java.util.List<com.okinc.business.invest_biz.data.bean.TokenInvestDetail>):void (m)] (LINE:576) call: com.okinc.business.invest_biz.data.bean.TokenInvestDetailResponse.<init>(java.util.List):void type: THIS */
    public /* synthetic */ TokenInvestDetailResponse(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? yDY.AhwBna() : list);
    }
}
