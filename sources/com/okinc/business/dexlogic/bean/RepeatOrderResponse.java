package com.okinc.business.dexlogic.bean;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import o.InterfaceC22335hdS;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Serializable
public final class RepeatOrderResponse implements InterfaceC22335hdS {
    private final String enoughFlag;
    private boolean errorRequest;
    private final String orderId;
    private final String repeatFlag;
    private final String repeatOrderLinkUrl;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public RepeatOrderResponse() {
        this((String) null, (String) null, (String) null, (String) null, false, 31, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ RepeatOrderResponse copy$default(RepeatOrderResponse repeatOrderResponse, String str, String str2, String str3, String str4, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = repeatOrderResponse.repeatFlag;
        }
        if ((i & 2) != 0) {
            str2 = repeatOrderResponse.repeatOrderLinkUrl;
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            str3 = repeatOrderResponse.enoughFlag;
        }
        String str6 = str3;
        if ((i & 8) != 0) {
            str4 = repeatOrderResponse.orderId;
        }
        String str7 = str4;
        if ((i & 16) != 0) {
            z = repeatOrderResponse.errorRequest;
        }
        return repeatOrderResponse.copy(str, str5, str6, str7, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.repeatFlag;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.repeatOrderLinkUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.enoughFlag;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.orderId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component5() {
        return this.errorRequest;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RepeatOrderResponse copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        return new RepeatOrderResponse(str, str2, str3, str4, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RepeatOrderResponse)) {
            return false;
        }
        RepeatOrderResponse repeatOrderResponse = (RepeatOrderResponse) obj;
        return Intrinsics.EZpvd((Object) this.repeatFlag, (Object) repeatOrderResponse.repeatFlag) && Intrinsics.EZpvd((Object) this.repeatOrderLinkUrl, (Object) repeatOrderResponse.repeatOrderLinkUrl) && Intrinsics.EZpvd((Object) this.enoughFlag, (Object) repeatOrderResponse.enoughFlag) && Intrinsics.EZpvd((Object) this.orderId, (Object) repeatOrderResponse.orderId) && this.errorRequest == repeatOrderResponse.errorRequest;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEnoughFlag() {
        return this.enoughFlag;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getErrorRequest() {
        return this.errorRequest;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOrderId() {
        return this.orderId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRepeatFlag() {
        return this.repeatFlag;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRepeatOrderLinkUrl() {
        return this.repeatOrderLinkUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((this.repeatFlag.hashCode() * 31) + this.repeatOrderLinkUrl.hashCode()) * 31) + this.enoughFlag.hashCode()) * 31) + this.orderId.hashCode()) * 31) + Boolean.hashCode(this.errorRequest);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setErrorRequest(boolean z) {
        this.errorRequest = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "RepeatOrderResponse(repeatFlag=" + this.repeatFlag + ", repeatOrderLinkUrl=" + this.repeatOrderLinkUrl + ", enoughFlag=" + this.enoughFlag + ", orderId=" + this.orderId + ", errorRequest=" + this.errorRequest + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.dexlogic.bean.RepeatOrderResponse.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<RepeatOrderResponse> serializer() {
            return RepeatOrderResponse$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ RepeatOrderResponse(int i, String str, String str2, String str3, String str4, boolean z, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.repeatFlag = "";
        } else {
            this.repeatFlag = str;
        }
        if ((i & 2) == 0) {
            this.repeatOrderLinkUrl = "";
        } else {
            this.repeatOrderLinkUrl = str2;
        }
        if ((i & 4) == 0) {
            this.enoughFlag = "";
        } else {
            this.enoughFlag = str3;
        }
        if ((i & 8) == 0) {
            this.orderId = "";
        } else {
            this.orderId = str4;
        }
        if ((i & 16) == 0) {
            this.errorRequest = false;
        } else {
            this.errorRequest = z;
        }
    }

    public static final /* synthetic */ void write$Self$OKDex_dex_impl(RepeatOrderResponse repeatOrderResponse, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) repeatOrderResponse.repeatFlag, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, repeatOrderResponse.repeatFlag);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) repeatOrderResponse.repeatOrderLinkUrl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, repeatOrderResponse.repeatOrderLinkUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) repeatOrderResponse.enoughFlag, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, repeatOrderResponse.enoughFlag);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) repeatOrderResponse.orderId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, repeatOrderResponse.orderId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || repeatOrderResponse.errorRequest) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 4, repeatOrderResponse.errorRequest);
        }
    }

    public RepeatOrderResponse(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.repeatFlag = str;
        this.repeatOrderLinkUrl = str2;
        this.enoughFlag = str3;
        this.orderId = str4;
        this.errorRequest = z;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0028: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r9v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r4v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0009: ARITH (r9v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r5v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0010: ARITH (r9v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r6v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0017: ARITH (r9v0 int) & (8 int) A[WRAPPED]) == (0 int)) ? (r7v0 java.lang.String) : (""))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x001d: ARITH (r9v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? false : (r8v0 boolean))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean):void (m)] (LINE:2095) call: com.okinc.business.dexlogic.bean.RepeatOrderResponse.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean):void type: THIS */
    public /* synthetic */ RepeatOrderResponse(String str, String str2, String str3, String str4, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) == 0 ? str4 : "", (i & 16) != 0 ? false : z);
    }

    public final boolean isRepeatOrder() {
        return Intrinsics.EZpvd((Object) this.repeatFlag, (Object) "1");
    }

    public final boolean isRepeatOrderHasNextStep() {
        return Intrinsics.EZpvd((Object) this.repeatFlag, (Object) "4");
    }

    public final boolean isEnoughFlag() {
        return Intrinsics.EZpvd((Object) this.enoughFlag, (Object) "1");
    }
}
