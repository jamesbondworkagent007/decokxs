package com.okinc.business.dexlogic.bean;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Serializable
public final class CloseInfo {
    private final DefiPlatformInfo defiPlatformInfo;
    private final String estimateTokenFee;
    private final DexMultiTokenInfoBean fromToken;
    private final String minimumReceived;
    private final String price;
    private final DexMultiTokenInfoBean toToken;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public CloseInfo() {
        this((DefiPlatformInfo) null, (DexMultiTokenInfoBean) null, (DexMultiTokenInfoBean) null, (String) null, (String) null, (String) null, 63, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ CloseInfo copy$default(CloseInfo closeInfo, DefiPlatformInfo defiPlatformInfo, DexMultiTokenInfoBean dexMultiTokenInfoBean, DexMultiTokenInfoBean dexMultiTokenInfoBean2, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            defiPlatformInfo = closeInfo.defiPlatformInfo;
        }
        if ((i & 2) != 0) {
            dexMultiTokenInfoBean = closeInfo.fromToken;
        }
        DexMultiTokenInfoBean dexMultiTokenInfoBean3 = dexMultiTokenInfoBean;
        if ((i & 4) != 0) {
            dexMultiTokenInfoBean2 = closeInfo.toToken;
        }
        DexMultiTokenInfoBean dexMultiTokenInfoBean4 = dexMultiTokenInfoBean2;
        if ((i & 8) != 0) {
            str = closeInfo.price;
        }
        String str4 = str;
        if ((i & 16) != 0) {
            str2 = closeInfo.minimumReceived;
        }
        String str5 = str2;
        if ((i & 32) != 0) {
            str3 = closeInfo.estimateTokenFee;
        }
        return closeInfo.copy(defiPlatformInfo, dexMultiTokenInfoBean3, dexMultiTokenInfoBean4, str4, str5, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DefiPlatformInfo component1() {
        return this.defiPlatformInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DexMultiTokenInfoBean component2() {
        return this.fromToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DexMultiTokenInfoBean component3() {
        return this.toToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.price;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.minimumReceived;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.estimateTokenFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CloseInfo copy(@NotNull DefiPlatformInfo defiPlatformInfo, DexMultiTokenInfoBean dexMultiTokenInfoBean, DexMultiTokenInfoBean dexMultiTokenInfoBean2, @NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(defiPlatformInfo, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new CloseInfo(defiPlatformInfo, dexMultiTokenInfoBean, dexMultiTokenInfoBean2, str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CloseInfo)) {
            return false;
        }
        CloseInfo closeInfo = (CloseInfo) obj;
        return Intrinsics.EZpvd(this.defiPlatformInfo, closeInfo.defiPlatformInfo) && Intrinsics.EZpvd(this.fromToken, closeInfo.fromToken) && Intrinsics.EZpvd(this.toToken, closeInfo.toToken) && Intrinsics.EZpvd((Object) this.price, (Object) closeInfo.price) && Intrinsics.EZpvd((Object) this.minimumReceived, (Object) closeInfo.minimumReceived) && Intrinsics.EZpvd((Object) this.estimateTokenFee, (Object) closeInfo.estimateTokenFee);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DefiPlatformInfo getDefiPlatformInfo() {
        return this.defiPlatformInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEstimateTokenFee() {
        return this.estimateTokenFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DexMultiTokenInfoBean getFromToken() {
        return this.fromToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMinimumReceived() {
        return this.minimumReceived;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPrice() {
        return this.price;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DexMultiTokenInfoBean getToToken() {
        return this.toToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.defiPlatformInfo.hashCode();
        DexMultiTokenInfoBean dexMultiTokenInfoBean = this.fromToken;
        int iHashCode2 = dexMultiTokenInfoBean == null ? 0 : dexMultiTokenInfoBean.hashCode();
        DexMultiTokenInfoBean dexMultiTokenInfoBean2 = this.toToken;
        return (((((((((iHashCode * 31) + iHashCode2) * 31) + (dexMultiTokenInfoBean2 != null ? dexMultiTokenInfoBean2.hashCode() : 0)) * 31) + this.price.hashCode()) * 31) + this.minimumReceived.hashCode()) * 31) + this.estimateTokenFee.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "CloseInfo(defiPlatformInfo=" + this.defiPlatformInfo + ", fromToken=" + this.fromToken + ", toToken=" + this.toToken + ", price=" + this.price + ", minimumReceived=" + this.minimumReceived + ", estimateTokenFee=" + this.estimateTokenFee + ")";
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.dexlogic.bean.CloseInfo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<CloseInfo> serializer() {
            return CloseInfo$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ CloseInfo(int i, DefiPlatformInfo defiPlatformInfo, DexMultiTokenInfoBean dexMultiTokenInfoBean, DexMultiTokenInfoBean dexMultiTokenInfoBean2, String str, String str2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        this.defiPlatformInfo = (i & 1) == 0 ? new DefiPlatformInfo((String) null, (String) null, (String) null, (String) null, 15, (DefaultConstructorMarker) null) : defiPlatformInfo;
        if ((i & 2) == 0) {
            this.fromToken = null;
        } else {
            this.fromToken = dexMultiTokenInfoBean;
        }
        if ((i & 4) == 0) {
            this.toToken = null;
        } else {
            this.toToken = dexMultiTokenInfoBean2;
        }
        if ((i & 8) == 0) {
            this.price = "";
        } else {
            this.price = str;
        }
        if ((i & 16) == 0) {
            this.minimumReceived = "";
        } else {
            this.minimumReceived = str2;
        }
        if ((i & 32) == 0) {
            this.estimateTokenFee = "";
        } else {
            this.estimateTokenFee = str3;
        }
    }

    public static final /* synthetic */ void write$Self$OKDex_dex_impl(CloseInfo closeInfo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd(closeInfo.defiPlatformInfo, new DefiPlatformInfo((String) null, (String) null, (String) null, (String) null, 15, (DefaultConstructorMarker) null))) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 0, DefiPlatformInfo$$serializer.INSTANCE, closeInfo.defiPlatformInfo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || closeInfo.fromToken != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, DexMultiTokenInfoBean$$serializer.INSTANCE, closeInfo.fromToken);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || closeInfo.toToken != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, DexMultiTokenInfoBean$$serializer.INSTANCE, closeInfo.toToken);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) closeInfo.price, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, closeInfo.price);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) closeInfo.minimumReceived, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, closeInfo.minimumReceived);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) && Intrinsics.EZpvd((Object) closeInfo.estimateTokenFee, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 5, closeInfo.estimateTokenFee);
    }

    public CloseInfo(@NotNull DefiPlatformInfo defiPlatformInfo, DexMultiTokenInfoBean dexMultiTokenInfoBean, DexMultiTokenInfoBean dexMultiTokenInfoBean2, @NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(defiPlatformInfo, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.defiPlatformInfo = defiPlatformInfo;
        this.fromToken = dexMultiTokenInfoBean;
        this.toToken = dexMultiTokenInfoBean2;
        this.price = str;
        this.minimumReceived = str2;
        this.estimateTokenFee = str3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x003d: CONSTRUCTOR 
  (wrap:com.okinc.business.dexlogic.bean.DefiPlatformInfo:?: TERNARY null = ((wrap:int:0x0000: ARITH (r14v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:com.okinc.business.dexlogic.bean.DefiPlatformInfo:0x000e: CONSTRUCTOR 
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (15 int)
  (wrap:kotlin.jvm.internal.DefaultConstructorMarker:?: CAST (kotlin.jvm.internal.DefaultConstructorMarker) (null kotlin.jvm.internal.DefaultConstructorMarker))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:27) call: com.okinc.business.dexlogic.bean.DefiPlatformInfo.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r8v0 com.okinc.business.dexlogic.bean.DefiPlatformInfo))
  (wrap:com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean:?: TERNARY null = ((wrap:int:0x0011: ARITH (r14v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean) : (r9v0 com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean))
  (wrap:com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean:?: TERNARY null = ((wrap:int:0x0019: ARITH (r14v0 int) & (4 int) A[WRAPPED]) == (0 int)) ? (r10v0 com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean) : (null com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001f: ARITH (r14v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r11v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0028: ARITH (r14v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r12v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002f: ARITH (r14v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r13v0 java.lang.String))
 A[MD:(com.okinc.business.dexlogic.bean.DefiPlatformInfo, com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean, com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:26) call: com.okinc.business.dexlogic.bean.CloseInfo.<init>(com.okinc.business.dexlogic.bean.DefiPlatformInfo, com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean, com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ CloseInfo(DefiPlatformInfo defiPlatformInfo, DexMultiTokenInfoBean dexMultiTokenInfoBean, DexMultiTokenInfoBean dexMultiTokenInfoBean2, String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new DefiPlatformInfo((String) null, (String) null, (String) null, (String) null, 15, (DefaultConstructorMarker) null) : defiPlatformInfo, (i & 2) != 0 ? null : dexMultiTokenInfoBean, (i & 4) == 0 ? dexMultiTokenInfoBean2 : null, (i & 8) != 0 ? "" : str, (i & 16) != 0 ? "" : str2, (i & 32) != 0 ? "" : str3);
    }
}
