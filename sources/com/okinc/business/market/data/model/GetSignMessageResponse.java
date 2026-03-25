package com.okinc.business.market.data.model;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Serializable
public final class GetSignMessageResponse {
    public final String nonce;
    public final String signData;
    public final StarkNetSignData starkNetSignData;
    public final TonSignData tonSignData;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public GetSignMessageResponse() {
        this((String) null, (TonSignData) null, (StarkNetSignData) null, (String) null, 15, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ GetSignMessageResponse copy$default(GetSignMessageResponse getSignMessageResponse, String str, TonSignData tonSignData, StarkNetSignData starkNetSignData, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = getSignMessageResponse.signData;
        }
        if ((i & 2) != 0) {
            tonSignData = getSignMessageResponse.tonSignData;
        }
        if ((i & 4) != 0) {
            starkNetSignData = getSignMessageResponse.starkNetSignData;
        }
        if ((i & 8) != 0) {
            str2 = getSignMessageResponse.nonce;
        }
        return getSignMessageResponse.EZpvd(str, tonSignData, starkNetSignData, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TonSignData AEQbTJ() {
        return this.tonSignData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GetSignMessageResponse EZpvd(@NotNull String str, @NotNull TonSignData tonSignData, @NotNull StarkNetSignData starkNetSignData, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(tonSignData, "");
        Intrinsics.checkNotNullParameter(starkNetSignData, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new GetSignMessageResponse(str, tonSignData, starkNetSignData, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StarkNetSignData EZpvd() {
        return this.starkNetSignData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String KWHzl() {
        return this.signData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetSignMessageResponse)) {
            return false;
        }
        GetSignMessageResponse getSignMessageResponse = (GetSignMessageResponse) obj;
        return Intrinsics.EZpvd((Object) this.signData, (Object) getSignMessageResponse.signData) && Intrinsics.EZpvd(this.tonSignData, getSignMessageResponse.tonSignData) && Intrinsics.EZpvd(this.starkNetSignData, getSignMessageResponse.starkNetSignData) && Intrinsics.EZpvd((Object) this.nonce, (Object) getSignMessageResponse.nonce);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((this.signData.hashCode() * 31) + this.tonSignData.hashCode()) * 31) + this.starkNetSignData.hashCode()) * 31) + this.nonce.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "GetSignMessageResponse(signData=" + this.signData + ", tonSignData=" + this.tonSignData + ", starkNetSignData=" + this.starkNetSignData + ", nonce=" + this.nonce + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.market.data.model.GetSignMessageResponse.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<GetSignMessageResponse> serializer() {
            return GetSignMessageResponse$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ GetSignMessageResponse(int i, String str, TonSignData tonSignData, StarkNetSignData starkNetSignData, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.signData = "";
        } else {
            this.signData = str;
        }
        if ((i & 2) == 0) {
            this.tonSignData = new TonSignData((String) null, (String) null, 3, (DefaultConstructorMarker) null);
        } else {
            this.tonSignData = tonSignData;
        }
        if ((i & 4) == 0) {
            this.starkNetSignData = new StarkNetSignData((StarkNetSignTypeListData) null, (String) null, (SignDomainData) null, 7, (DefaultConstructorMarker) null);
        } else {
            this.starkNetSignData = starkNetSignData;
        }
        if ((i & 8) == 0) {
            this.nonce = "";
        } else {
            this.nonce = str2;
        }
    }

    public static final /* synthetic */ void KWHzl(GetSignMessageResponse getSignMessageResponse, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) getSignMessageResponse.signData, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, getSignMessageResponse.signData);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd(getSignMessageResponse.tonSignData, new TonSignData((String) null, (String) null, 3, (DefaultConstructorMarker) null))) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 1, TonSignData$$serializer.INSTANCE, getSignMessageResponse.tonSignData);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd(getSignMessageResponse.starkNetSignData, new StarkNetSignData((StarkNetSignTypeListData) null, (String) null, (SignDomainData) null, 7, (DefaultConstructorMarker) null))) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 2, StarkNetSignData$$serializer.INSTANCE, getSignMessageResponse.starkNetSignData);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) && Intrinsics.EZpvd((Object) getSignMessageResponse.nonce, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 3, getSignMessageResponse.nonce);
    }

    public GetSignMessageResponse(@NotNull String str, @NotNull TonSignData tonSignData, @NotNull StarkNetSignData starkNetSignData, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(tonSignData, "");
        Intrinsics.checkNotNullParameter(starkNetSignData, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.signData = str;
        this.tonSignData = tonSignData;
        this.starkNetSignData = starkNetSignData;
        this.nonce = str2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0026: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r12v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r8v0 java.lang.String))
  (wrap:com.okinc.business.market.data.model.TonSignData:?: TERNARY null = ((wrap:int:0x0007: ARITH (r12v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:com.okinc.business.market.data.model.TonSignData:0x000f: CONSTRUCTOR 
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (3 int)
  (wrap:kotlin.jvm.internal.DefaultConstructorMarker:?: CAST (kotlin.jvm.internal.DefaultConstructorMarker) (null kotlin.jvm.internal.DefaultConstructorMarker))
 A[MD:(java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:11) call: com.okinc.business.market.data.model.TonSignData.<init>(java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r9v0 com.okinc.business.market.data.model.TonSignData))
  (wrap:com.okinc.business.market.data.model.StarkNetSignData:?: TERNARY null = ((wrap:int:0x0012: ARITH (r12v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:com.okinc.business.market.data.model.StarkNetSignData:0x001e: CONSTRUCTOR 
  (wrap:com.okinc.business.market.data.model.StarkNetSignTypeListData:?: CAST (com.okinc.business.market.data.model.StarkNetSignTypeListData) (null com.okinc.business.market.data.model.StarkNetSignTypeListData))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:com.okinc.business.market.data.model.SignDomainData:?: CAST (com.okinc.business.market.data.model.SignDomainData) (null com.okinc.business.market.data.model.SignDomainData))
  (7 int)
  (wrap:kotlin.jvm.internal.DefaultConstructorMarker:?: CAST (kotlin.jvm.internal.DefaultConstructorMarker) (null kotlin.jvm.internal.DefaultConstructorMarker))
 A[MD:(com.okinc.business.market.data.model.StarkNetSignTypeListData, java.lang.String, com.okinc.business.market.data.model.SignDomainData, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:13) call: com.okinc.business.market.data.model.StarkNetSignData.<init>(com.okinc.business.market.data.model.StarkNetSignTypeListData, java.lang.String, com.okinc.business.market.data.model.SignDomainData, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r10v0 com.okinc.business.market.data.model.StarkNetSignData))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0021: ARITH (r12v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r11v0 java.lang.String))
 A[MD:(java.lang.String, com.okinc.business.market.data.model.TonSignData, com.okinc.business.market.data.model.StarkNetSignData, java.lang.String):void (m)] (LINE:7) call: com.okinc.business.market.data.model.GetSignMessageResponse.<init>(java.lang.String, com.okinc.business.market.data.model.TonSignData, com.okinc.business.market.data.model.StarkNetSignData, java.lang.String):void type: THIS */
    public /* synthetic */ GetSignMessageResponse(String str, TonSignData tonSignData, StarkNetSignData starkNetSignData, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? new TonSignData((String) null, (String) null, 3, (DefaultConstructorMarker) null) : tonSignData, (i & 4) != 0 ? new StarkNetSignData((StarkNetSignTypeListData) null, (String) null, (SignDomainData) null, 7, (DefaultConstructorMarker) null) : starkNetSignData, (i & 8) != 0 ? "" : str2);
    }
}
