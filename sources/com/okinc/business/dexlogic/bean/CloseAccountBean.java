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
public final class CloseAccountBean {
    private final String bizLoad;
    private final String chainId;
    private final CloseCallData closeCallData;
    private final CloseInfo closeInfo;
    private final String network;
    private final String orderId;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public CloseAccountBean() {
        this((String) null, (String) null, (String) null, (CloseCallData) null, (CloseInfo) null, (String) null, 63, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ CloseAccountBean copy$default(CloseAccountBean closeAccountBean, String str, String str2, String str3, CloseCallData closeCallData, CloseInfo closeInfo, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = closeAccountBean.orderId;
        }
        if ((i & 2) != 0) {
            str2 = closeAccountBean.network;
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            str3 = closeAccountBean.chainId;
        }
        String str6 = str3;
        if ((i & 8) != 0) {
            closeCallData = closeAccountBean.closeCallData;
        }
        CloseCallData closeCallData2 = closeCallData;
        if ((i & 16) != 0) {
            closeInfo = closeAccountBean.closeInfo;
        }
        CloseInfo closeInfo2 = closeInfo;
        if ((i & 32) != 0) {
            str4 = closeAccountBean.bizLoad;
        }
        return closeAccountBean.copy(str, str5, str6, closeCallData2, closeInfo2, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.orderId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.network;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CloseCallData component4() {
        return this.closeCallData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CloseInfo component5() {
        return this.closeInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.bizLoad;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CloseAccountBean copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull CloseCallData closeCallData, @NotNull CloseInfo closeInfo, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(closeCallData, "");
        Intrinsics.checkNotNullParameter(closeInfo, "");
        Intrinsics.checkNotNullParameter(str4, "");
        return new CloseAccountBean(str, str2, str3, closeCallData, closeInfo, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CloseAccountBean)) {
            return false;
        }
        CloseAccountBean closeAccountBean = (CloseAccountBean) obj;
        return Intrinsics.EZpvd((Object) this.orderId, (Object) closeAccountBean.orderId) && Intrinsics.EZpvd((Object) this.network, (Object) closeAccountBean.network) && Intrinsics.EZpvd((Object) this.chainId, (Object) closeAccountBean.chainId) && Intrinsics.EZpvd(this.closeCallData, closeAccountBean.closeCallData) && Intrinsics.EZpvd(this.closeInfo, closeAccountBean.closeInfo) && Intrinsics.EZpvd((Object) this.bizLoad, (Object) closeAccountBean.bizLoad);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBizLoad() {
        return this.bizLoad;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChainId() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CloseCallData getCloseCallData() {
        return this.closeCallData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CloseInfo getCloseInfo() {
        return this.closeInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNetwork() {
        return this.network;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOrderId() {
        return this.orderId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((this.orderId.hashCode() * 31) + this.network.hashCode()) * 31) + this.chainId.hashCode()) * 31) + this.closeCallData.hashCode()) * 31) + this.closeInfo.hashCode()) * 31) + this.bizLoad.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "CloseAccountBean(orderId=" + this.orderId + ", network=" + this.network + ", chainId=" + this.chainId + ", closeCallData=" + this.closeCallData + ", closeInfo=" + this.closeInfo + ", bizLoad=" + this.bizLoad + ")";
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.dexlogic.bean.CloseAccountBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<CloseAccountBean> serializer() {
            return CloseAccountBean$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ CloseAccountBean(int i, String str, String str2, String str3, CloseCallData closeCallData, CloseInfo closeInfo, String str4, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.orderId = "";
        } else {
            this.orderId = str;
        }
        if ((i & 2) == 0) {
            this.network = "";
        } else {
            this.network = str2;
        }
        if ((i & 4) == 0) {
            this.chainId = "";
        } else {
            this.chainId = str3;
        }
        this.closeCallData = (i & 8) == 0 ? new CloseCallData((CallData) null, (String) null, 3, (DefaultConstructorMarker) null) : closeCallData;
        this.closeInfo = (i & 16) == 0 ? new CloseInfo((DefiPlatformInfo) null, (DexMultiTokenInfoBean) null, (DexMultiTokenInfoBean) null, (String) null, (String) null, (String) null, 63, (DefaultConstructorMarker) null) : closeInfo;
        if ((i & 32) == 0) {
            this.bizLoad = "";
        } else {
            this.bizLoad = str4;
        }
    }

    public static final /* synthetic */ void write$Self$OKDex_dex_impl(CloseAccountBean closeAccountBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) closeAccountBean.orderId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, closeAccountBean.orderId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) closeAccountBean.network, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, closeAccountBean.network);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) closeAccountBean.chainId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, closeAccountBean.chainId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd(closeAccountBean.closeCallData, new CloseCallData((CallData) null, (String) null, 3, (DefaultConstructorMarker) null))) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 3, CloseCallData$$serializer.INSTANCE, closeAccountBean.closeCallData);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd(closeAccountBean.closeInfo, new CloseInfo((DefiPlatformInfo) null, (DexMultiTokenInfoBean) null, (DexMultiTokenInfoBean) null, (String) null, (String) null, (String) null, 63, (DefaultConstructorMarker) null))) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 4, CloseInfo$$serializer.INSTANCE, closeAccountBean.closeInfo);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) && Intrinsics.EZpvd((Object) closeAccountBean.bizLoad, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 5, closeAccountBean.bizLoad);
    }

    public CloseAccountBean(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull CloseCallData closeCallData, @NotNull CloseInfo closeInfo, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(closeCallData, "");
        Intrinsics.checkNotNullParameter(closeInfo, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.orderId = str;
        this.network = str2;
        this.chainId = str3;
        this.closeCallData = closeCallData;
        this.closeInfo = closeInfo;
        this.bizLoad = str4;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0053: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r22v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000a: ARITH (r22v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r17v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0012: ARITH (r22v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r18v0 java.lang.String))
  (wrap:com.okinc.business.dexlogic.bean.CloseCallData:?: TERNARY null = ((wrap:int:0x001a: ARITH (r22v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0022: CONSTRUCTOR 
  (wrap:com.okinc.business.dexlogic.bean.CallData:?: CAST (com.okinc.business.dexlogic.bean.CallData) (null com.okinc.business.dexlogic.bean.CallData))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (3 int)
  (wrap:kotlin.jvm.internal.DefaultConstructorMarker:?: CAST (kotlin.jvm.internal.DefaultConstructorMarker) (null kotlin.jvm.internal.DefaultConstructorMarker))
 A[MD:(com.okinc.business.dexlogic.bean.CallData, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:12) call: com.okinc.business.dexlogic.bean.CloseCallData.<init>(com.okinc.business.dexlogic.bean.CallData, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r19v0 com.okinc.business.dexlogic.bean.CloseCallData))
  (wrap:com.okinc.business.dexlogic.bean.CloseInfo:?: TERNARY null = ((wrap:int:0x0028: ARITH (r22v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0038: CONSTRUCTOR 
  (wrap:com.okinc.business.dexlogic.bean.DefiPlatformInfo:?: CAST (com.okinc.business.dexlogic.bean.DefiPlatformInfo) (null com.okinc.business.dexlogic.bean.DefiPlatformInfo))
  (wrap:com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean:?: CAST (com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean) (null com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean))
  (wrap:com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean:?: CAST (com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean) (null com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (63 int)
  (wrap:kotlin.jvm.internal.DefaultConstructorMarker:?: CAST (kotlin.jvm.internal.DefaultConstructorMarker) (null kotlin.jvm.internal.DefaultConstructorMarker))
 A[MD:(com.okinc.business.dexlogic.bean.DefiPlatformInfo, com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean, com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:13) call: com.okinc.business.dexlogic.bean.CloseInfo.<init>(com.okinc.business.dexlogic.bean.DefiPlatformInfo, com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean, com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r20v0 com.okinc.business.dexlogic.bean.CloseInfo))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003e: ARITH (r22v0 int) & (32 int) A[WRAPPED]) == (0 int)) ? (r21v0 java.lang.String) : (""))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, com.okinc.business.dexlogic.bean.CloseCallData, com.okinc.business.dexlogic.bean.CloseInfo, java.lang.String):void (m)] (LINE:8) call: com.okinc.business.dexlogic.bean.CloseAccountBean.<init>(java.lang.String, java.lang.String, java.lang.String, com.okinc.business.dexlogic.bean.CloseCallData, com.okinc.business.dexlogic.bean.CloseInfo, java.lang.String):void type: THIS */
    public /* synthetic */ CloseAccountBean(String str, String str2, String str3, CloseCallData closeCallData, CloseInfo closeInfo, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? new CloseCallData((CallData) null, (String) null, 3, (DefaultConstructorMarker) null) : closeCallData, (i & 16) != 0 ? new CloseInfo((DefiPlatformInfo) null, (DexMultiTokenInfoBean) null, (DexMultiTokenInfoBean) null, (String) null, (String) null, (String) null, 63, (DefaultConstructorMarker) null) : closeInfo, (i & 32) == 0 ? str4 : "");
    }
}
