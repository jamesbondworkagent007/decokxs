package com.okinc.business.dexlogic.main.swap.operation_handler.bean;

import com.okinc.business.defi.api.bean.PlatformItem;
import com.okinc.business.defi.api.bean.PlatformItem$$serializer;
import com.okinc.business.dexlogic.bean.UnsignedSwapData;
import com.okinc.business.dexlogic.bean.UnsignedSwapData$$serializer;
import java.util.List;
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
public final class ApproveSwapData {
    private final String chainId;
    private final String chainName;
    private final String dexContractAddress;
    private String dexUniqueKey;
    private boolean isEvmTransfer;
    private final String jsonData;
    private final String orderId;
    private final PlatformItem platForm;
    private final UnsignedSwapData unSingedCallData;
    private final String walletId;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ApproveSwapData() {
        this((String) null, (String) null, (String) null, (String) null, (PlatformItem) null, (String) null, (String) null, false, (UnsignedSwapData) null, (String) null, 1023, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.dexUniqueKey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.chainName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.jsonData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.walletId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PlatformItem component5() {
        return this.platForm;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.orderId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.dexContractAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component8() {
        return this.isEvmTransfer;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final UnsignedSwapData component9() {
        return this.unSingedCallData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ApproveSwapData copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull PlatformItem platformItem, @NotNull String str5, @NotNull String str6, boolean z, UnsignedSwapData unsignedSwapData, @NotNull String str7) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(platformItem, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        return new ApproveSwapData(str, str2, str3, str4, platformItem, str5, str6, z, unsignedSwapData, str7);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ApproveSwapData)) {
            return false;
        }
        ApproveSwapData approveSwapData = (ApproveSwapData) obj;
        return Intrinsics.EZpvd((Object) this.chainId, (Object) approveSwapData.chainId) && Intrinsics.EZpvd((Object) this.chainName, (Object) approveSwapData.chainName) && Intrinsics.EZpvd((Object) this.jsonData, (Object) approveSwapData.jsonData) && Intrinsics.EZpvd((Object) this.walletId, (Object) approveSwapData.walletId) && Intrinsics.EZpvd(this.platForm, approveSwapData.platForm) && Intrinsics.EZpvd((Object) this.orderId, (Object) approveSwapData.orderId) && Intrinsics.EZpvd((Object) this.dexContractAddress, (Object) approveSwapData.dexContractAddress) && this.isEvmTransfer == approveSwapData.isEvmTransfer && Intrinsics.EZpvd(this.unSingedCallData, approveSwapData.unSingedCallData) && Intrinsics.EZpvd((Object) this.dexUniqueKey, (Object) approveSwapData.dexUniqueKey);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChainId() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChainName() {
        return this.chainName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDexContractAddress() {
        return this.dexContractAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDexUniqueKey() {
        return this.dexUniqueKey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getJsonData() {
        return this.jsonData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOrderId() {
        return this.orderId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PlatformItem getPlatForm() {
        return this.platForm;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final UnsignedSwapData getUnSingedCallData() {
        return this.unSingedCallData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getWalletId() {
        return this.walletId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.chainId.hashCode();
        int iHashCode2 = this.chainName.hashCode();
        int iHashCode3 = this.jsonData.hashCode();
        int iHashCode4 = this.walletId.hashCode();
        int iHashCode5 = this.platForm.hashCode();
        int iHashCode6 = this.orderId.hashCode();
        int iHashCode7 = this.dexContractAddress.hashCode();
        int iHashCode8 = Boolean.hashCode(this.isEvmTransfer);
        UnsignedSwapData unsignedSwapData = this.unSingedCallData;
        return (((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + (unsignedSwapData == null ? 0 : unsignedSwapData.hashCode())) * 31) + this.dexUniqueKey.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isEvmTransfer() {
        return this.isEvmTransfer;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDexUniqueKey(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.dexUniqueKey = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setEvmTransfer(boolean z) {
        this.isEvmTransfer = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ApproveSwapData(chainId=" + this.chainId + ", chainName=" + this.chainName + ", jsonData=" + this.jsonData + ", walletId=" + this.walletId + ", platForm=" + this.platForm + ", orderId=" + this.orderId + ", dexContractAddress=" + this.dexContractAddress + ", isEvmTransfer=" + this.isEvmTransfer + ", unSingedCallData=" + this.unSingedCallData + ", dexUniqueKey=" + this.dexUniqueKey + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.dexlogic.main.swap.operation_handler.bean.ApproveSwapData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ApproveSwapData> serializer() {
            return ApproveSwapData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ApproveSwapData(int i, String str, String str2, String str3, String str4, PlatformItem platformItem, String str5, String str6, boolean z, UnsignedSwapData unsignedSwapData, String str7, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.chainId = "";
        } else {
            this.chainId = str;
        }
        if ((i & 2) == 0) {
            this.chainName = "";
        } else {
            this.chainName = str2;
        }
        if ((i & 4) == 0) {
            this.jsonData = "";
        } else {
            this.jsonData = str3;
        }
        if ((i & 8) == 0) {
            this.walletId = "";
        } else {
            this.walletId = str4;
        }
        this.platForm = (i & 16) == 0 ? new PlatformItem(0L, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, (List) null, (String) null, (String) null, 0L, 0, (String) null, (String) null, 16383, (DefaultConstructorMarker) null) : platformItem;
        if ((i & 32) == 0) {
            this.orderId = "";
        } else {
            this.orderId = str5;
        }
        if ((i & 64) == 0) {
            this.dexContractAddress = "";
        } else {
            this.dexContractAddress = str6;
        }
        this.isEvmTransfer = (i & 128) == 0 ? false : z;
        this.unSingedCallData = (i & 256) == 0 ? null : unsignedSwapData;
        if ((i & 512) == 0) {
            this.dexUniqueKey = "";
        } else {
            this.dexUniqueKey = str7;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x008d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void write$Self$OKDex_dex_impl(ApproveSwapData approveSwapData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) approveSwapData.chainId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, approveSwapData.chainId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) approveSwapData.chainName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, approveSwapData.chainName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) approveSwapData.jsonData, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, approveSwapData.jsonData);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) approveSwapData.walletId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, approveSwapData.walletId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4)) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 4, PlatformItem$$serializer.INSTANCE, approveSwapData.platForm);
        } else {
            if (!Intrinsics.EZpvd(approveSwapData.platForm, new PlatformItem(0L, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, (List) null, (String) (0 == true ? 1 : 0), (String) null, 0L, 0, (String) null, (String) null, 16383, (DefaultConstructorMarker) null))) {
            }
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) approveSwapData.orderId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, approveSwapData.orderId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) approveSwapData.dexContractAddress, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, approveSwapData.dexContractAddress);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || approveSwapData.isEvmTransfer) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 7, approveSwapData.isEvmTransfer);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || approveSwapData.unSingedCallData != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, UnsignedSwapData$$serializer.INSTANCE, approveSwapData.unSingedCallData);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) && Intrinsics.EZpvd((Object) approveSwapData.dexUniqueKey, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 9, approveSwapData.dexUniqueKey);
    }

    public ApproveSwapData(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull PlatformItem platformItem, @NotNull String str5, @NotNull String str6, boolean z, UnsignedSwapData unsignedSwapData, @NotNull String str7) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(platformItem, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        this.chainId = str;
        this.chainName = str2;
        this.jsonData = str3;
        this.walletId = str4;
        this.platForm = platformItem;
        this.orderId = str5;
        this.dexContractAddress = str6;
        this.isEvmTransfer = z;
        this.unSingedCallData = unsignedSwapData;
        this.dexUniqueKey = str7;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0088: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r37v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r27v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r37v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r28v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0014: ARITH (r37v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r29v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001c: ARITH (r37v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r30v0 java.lang.String))
  (wrap:com.okinc.business.defi.api.bean.PlatformItem:?: TERNARY null = ((wrap:int:0x0024: ARITH (r37v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0045: CONSTRUCTOR 
  (0 long)
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.util.List:?: CAST (java.util.List) (null java.util.List))
  (wrap:java.util.List:?: CAST (java.util.List) (null java.util.List))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (0 long)
  (0 int)
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (16383 int)
  (wrap:kotlin.jvm.internal.DefaultConstructorMarker:?: CAST (kotlin.jvm.internal.DefaultConstructorMarker) (null kotlin.jvm.internal.DefaultConstructorMarker))
 A[MD:(long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, java.util.List, java.lang.String, java.lang.String, long, int, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:422) call: com.okinc.business.defi.api.bean.PlatformItem.<init>(long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, java.util.List, java.lang.String, java.lang.String, long, int, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r31v0 com.okinc.business.defi.api.bean.PlatformItem))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004b: ARITH (r37v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r32v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0053: ARITH (r37v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r33v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x005b: ARITH (r37v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? false : (r34v0 boolean))
  (wrap:com.okinc.business.dexlogic.bean.UnsignedSwapData:?: TERNARY null = ((wrap:int:0x0063: ARITH (r37v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.dexlogic.bean.UnsignedSwapData) : (r35v0 com.okinc.business.dexlogic.bean.UnsignedSwapData))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x006b: ARITH (r37v0 int) & (512 int) A[WRAPPED]) == (0 int)) ? (r36v0 java.lang.String) : (""))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.business.defi.api.bean.PlatformItem, java.lang.String, java.lang.String, boolean, com.okinc.business.dexlogic.bean.UnsignedSwapData, java.lang.String):void (m)] (LINE:417) call: com.okinc.business.dexlogic.main.swap.operation_handler.bean.ApproveSwapData.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.business.defi.api.bean.PlatformItem, java.lang.String, java.lang.String, boolean, com.okinc.business.dexlogic.bean.UnsignedSwapData, java.lang.String):void type: THIS */
    public /* synthetic */ ApproveSwapData(String str, String str2, String str3, String str4, PlatformItem platformItem, String str5, String str6, boolean z, UnsignedSwapData unsignedSwapData, String str7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? new PlatformItem(0L, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, (List) null, (String) null, (String) null, 0L, 0, (String) null, (String) null, 16383, (DefaultConstructorMarker) null) : platformItem, (i & 32) != 0 ? "" : str5, (i & 64) != 0 ? "" : str6, (i & 128) != 0 ? false : z, (i & 256) != 0 ? null : unsignedSwapData, (i & 512) == 0 ? str7 : "");
    }
}
