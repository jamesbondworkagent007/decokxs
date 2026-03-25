package com.okinc.business.market.data.model;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Serializable
public final class MemeInfoData {
    public final String createTime;
    public final String creatorAddress;
    public final List<MemePlatformBean> hotSpotTagList;
    public final String progress;
    public final String tokenSymbol;
    public final String transactions;
    public final String volume;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, new ArrayListSerializer(MemePlatformBean$$serializer.INSTANCE), null};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public MemeInfoData() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (List) null, (String) null, 127, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: com.okinc.business.market.data.model.MemeInfoData */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MemeInfoData copy$default(MemeInfoData memeInfoData, String str, String str2, String str3, String str4, String str5, List list, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = memeInfoData.createTime;
        }
        if ((i & 2) != 0) {
            str2 = memeInfoData.creatorAddress;
        }
        String str7 = str2;
        if ((i & 4) != 0) {
            str3 = memeInfoData.progress;
        }
        String str8 = str3;
        if ((i & 8) != 0) {
            str4 = memeInfoData.tokenSymbol;
        }
        String str9 = str4;
        if ((i & 16) != 0) {
            str5 = memeInfoData.transactions;
        }
        String str10 = str5;
        if ((i & 32) != 0) {
            list = memeInfoData.hotSpotTagList;
        }
        List list2 = list;
        if ((i & 64) != 0) {
            str6 = memeInfoData.volume;
        }
        return memeInfoData.OLrzqt(str, str7, str8, str9, str10, list2, str6);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AEQbTJ() {
        return this.createTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AYXKKw() {
        return this.transactions;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String EZpvd() {
        return this.progress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<MemePlatformBean> KWHzl() {
        return this.hotSpotTagList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MemeInfoData OLrzqt(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, List<MemePlatformBean> list, @NotNull String str6) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        return new MemeInfoData(str, str2, str3, str4, str5, list, str6);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String OLrzqt() {
        return this.creatorAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MemeInfoData)) {
            return false;
        }
        MemeInfoData memeInfoData = (MemeInfoData) obj;
        return Intrinsics.EZpvd((Object) this.createTime, (Object) memeInfoData.createTime) && Intrinsics.EZpvd((Object) this.creatorAddress, (Object) memeInfoData.creatorAddress) && Intrinsics.EZpvd((Object) this.progress, (Object) memeInfoData.progress) && Intrinsics.EZpvd((Object) this.tokenSymbol, (Object) memeInfoData.tokenSymbol) && Intrinsics.EZpvd((Object) this.transactions, (Object) memeInfoData.transactions) && Intrinsics.EZpvd(this.hotSpotTagList, memeInfoData.hotSpotTagList) && Intrinsics.EZpvd((Object) this.volume, (Object) memeInfoData.volume);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.createTime.hashCode();
        int iHashCode2 = this.creatorAddress.hashCode();
        int iHashCode3 = this.progress.hashCode();
        int iHashCode4 = this.tokenSymbol.hashCode();
        int iHashCode5 = this.transactions.hashCode();
        List<MemePlatformBean> list = this.hotSpotTagList;
        return (((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (list == null ? 0 : list.hashCode())) * 31) + this.volume.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "MemeInfoData(createTime=" + this.createTime + ", creatorAddress=" + this.creatorAddress + ", progress=" + this.progress + ", tokenSymbol=" + this.tokenSymbol + ", transactions=" + this.transactions + ", hotSpotTagList=" + this.hotSpotTagList + ", volume=" + this.volume + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.market.data.model.MemeInfoData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<MemeInfoData> serializer() {
            return MemeInfoData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ MemeInfoData(int i, String str, String str2, String str3, String str4, String str5, List list, String str6, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.createTime = "";
        } else {
            this.createTime = str;
        }
        if ((i & 2) == 0) {
            this.creatorAddress = "";
        } else {
            this.creatorAddress = str2;
        }
        if ((i & 4) == 0) {
            this.progress = "";
        } else {
            this.progress = str3;
        }
        if ((i & 8) == 0) {
            this.tokenSymbol = "";
        } else {
            this.tokenSymbol = str4;
        }
        if ((i & 16) == 0) {
            this.transactions = "";
        } else {
            this.transactions = str5;
        }
        if ((i & 32) == 0) {
            this.hotSpotTagList = null;
        } else {
            this.hotSpotTagList = list;
        }
        if ((i & 64) == 0) {
            this.volume = "";
        } else {
            this.volume = str6;
        }
    }

    public static final /* synthetic */ void copydefault(MemeInfoData memeInfoData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) memeInfoData.createTime, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, memeInfoData.createTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) memeInfoData.creatorAddress, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, memeInfoData.creatorAddress);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) memeInfoData.progress, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, memeInfoData.progress);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) memeInfoData.tokenSymbol, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, memeInfoData.tokenSymbol);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) memeInfoData.transactions, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, memeInfoData.transactions);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || memeInfoData.hotSpotTagList != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, kSerializerArr[5], memeInfoData.hotSpotTagList);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) && Intrinsics.EZpvd((Object) memeInfoData.volume, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 6, memeInfoData.volume);
    }

    public MemeInfoData(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, List<MemePlatformBean> list, @NotNull String str6) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        this.createTime = str;
        this.creatorAddress = str2;
        this.progress = str3;
        this.tokenSymbol = str4;
        this.transactions = str5;
        this.hotSpotTagList = list;
        this.volume = str6;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0039: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r14v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r7v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0009: ARITH (r14v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r8v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0010: ARITH (r14v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r9v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0017: ARITH (r14v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r10v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001e: ARITH (r14v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r11v0 java.lang.String))
  (wrap:java.util.List:0x002a: TERNARY null = ((wrap:int:0x0025: ARITH (r14v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r12v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002b: ARITH (r14v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r13v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List<com.okinc.business.market.data.model.MemePlatformBean>, java.lang.String):void (m)] (LINE:113) call: com.okinc.business.market.data.model.MemeInfoData.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, java.lang.String):void type: THIS */
    public /* synthetic */ MemeInfoData(String str, String str2, String str3, String str4, String str5, List list, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? null : list, (i & 64) != 0 ? "" : str6);
    }
}
