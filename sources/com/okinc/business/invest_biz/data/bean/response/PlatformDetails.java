package com.okinc.business.invest_biz.data.bean.response;

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
public final class PlatformDetails {
    public final String accountId;
    public final List<PlatformVO> platforms;
    public final boolean showViewByToken;
    public final String totalAssets;
    public final String totalEarnings;
    public final String yesterdayProfit;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final KSerializer<Object>[] $childSerializers = {new ArrayListSerializer(PlatformVO$$serializer.INSTANCE), null, null, null, null, null};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public PlatformDetails() {
        this((List) null, (String) null, (String) null, false, (String) null, (String) null, 63, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: com.okinc.business.invest_biz.data.bean.response.PlatformDetails */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PlatformDetails copy$default(PlatformDetails platformDetails, List list, String str, String str2, boolean z, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            list = platformDetails.platforms;
        }
        if ((i & 2) != 0) {
            str = platformDetails.accountId;
        }
        String str5 = str;
        if ((i & 4) != 0) {
            str2 = platformDetails.totalAssets;
        }
        String str6 = str2;
        if ((i & 8) != 0) {
            z = platformDetails.showViewByToken;
        }
        boolean z2 = z;
        if ((i & 16) != 0) {
            str3 = platformDetails.yesterdayProfit;
        }
        String str7 = str3;
        if ((i & 32) != 0) {
            str4 = platformDetails.totalEarnings;
        }
        return platformDetails.KWHzl(list, str5, str6, z2, str7, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AEQbTJ() {
        return this.accountId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AhwBna() {
        return this.yesterdayProfit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<PlatformVO> EZpvd() {
        return this.platforms;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PlatformDetails KWHzl(@NotNull List<PlatformVO> list, @NotNull String str, @NotNull String str2, boolean z, @NotNull String str3, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        return new PlatformDetails(list, str, str2, z, str3, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean OLrzqt() {
        return this.showViewByToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String copydefault() {
        return this.totalAssets;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String djBIcL() {
        return this.totalEarnings;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PlatformDetails)) {
            return false;
        }
        PlatformDetails platformDetails = (PlatformDetails) obj;
        return Intrinsics.EZpvd(this.platforms, platformDetails.platforms) && Intrinsics.EZpvd((Object) this.accountId, (Object) platformDetails.accountId) && Intrinsics.EZpvd((Object) this.totalAssets, (Object) platformDetails.totalAssets) && this.showViewByToken == platformDetails.showViewByToken && Intrinsics.EZpvd((Object) this.yesterdayProfit, (Object) platformDetails.yesterdayProfit) && Intrinsics.EZpvd((Object) this.totalEarnings, (Object) platformDetails.totalEarnings);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((this.platforms.hashCode() * 31) + this.accountId.hashCode()) * 31) + this.totalAssets.hashCode()) * 31) + Boolean.hashCode(this.showViewByToken)) * 31) + this.yesterdayProfit.hashCode()) * 31) + this.totalEarnings.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "PlatformDetails(platforms=" + this.platforms + ", accountId=" + this.accountId + ", totalAssets=" + this.totalAssets + ", showViewByToken=" + this.showViewByToken + ", yesterdayProfit=" + this.yesterdayProfit + ", totalEarnings=" + this.totalEarnings + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.invest_biz.data.bean.response.PlatformDetails.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<PlatformDetails> serializer() {
            return PlatformDetails$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ PlatformDetails(int i, List list, String str, String str2, boolean z, String str3, String str4, SerializationConstructorMarker serializationConstructorMarker) {
        this.platforms = (i & 1) == 0 ? yDY.AhwBna() : list;
        if ((i & 2) == 0) {
            this.accountId = "";
        } else {
            this.accountId = str;
        }
        if ((i & 4) == 0) {
            this.totalAssets = "0";
        } else {
            this.totalAssets = str2;
        }
        if ((i & 8) == 0) {
            this.showViewByToken = false;
        } else {
            this.showViewByToken = z;
        }
        if ((i & 16) == 0) {
            this.yesterdayProfit = "";
        } else {
            this.yesterdayProfit = str3;
        }
        if ((i & 32) == 0) {
            this.totalEarnings = "";
        } else {
            this.totalEarnings = str4;
        }
    }

    public static final /* synthetic */ void copydefault(PlatformDetails platformDetails, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd(platformDetails.platforms, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 0, kSerializerArr[0], platformDetails.platforms);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) platformDetails.accountId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, platformDetails.accountId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) platformDetails.totalAssets, (Object) "0")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, platformDetails.totalAssets);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || platformDetails.showViewByToken) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 3, platformDetails.showViewByToken);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) platformDetails.yesterdayProfit, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, platformDetails.yesterdayProfit);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) && Intrinsics.EZpvd((Object) platformDetails.totalEarnings, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 5, platformDetails.totalEarnings);
    }

    public PlatformDetails(@NotNull List<PlatformVO> list, @NotNull String str, @NotNull String str2, boolean z, @NotNull String str3, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.platforms = list;
        this.accountId = str;
        this.totalAssets = str2;
        this.showViewByToken = z;
        this.yesterdayProfit = str3;
        this.totalEarnings = str4;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0032: CONSTRUCTOR 
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0000: ARITH (r11v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0004: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:116)) : (r5v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0008: ARITH (r11v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r6v0 java.lang.String))
  (wrap:java.lang.String:0x0017: TERNARY null = ((wrap:int:0x0011: ARITH (r11v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("0") : (r7v0 java.lang.String))
  (wrap:boolean:0x001d: TERNARY null = ((wrap:int:0x0018: ARITH (r11v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? false : (r8v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001e: ARITH (r11v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r9v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0025: ARITH (r11v0 int) & (32 int) A[WRAPPED]) == (0 int)) ? (r10v0 java.lang.String) : (""))
 A[MD:(java.util.List<com.okinc.business.invest_biz.data.bean.response.PlatformVO>, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String):void (m)] (LINE:114) call: com.okinc.business.invest_biz.data.bean.response.PlatformDetails.<init>(java.util.List, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ PlatformDetails(List list, String str, String str2, boolean z, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? yDY.AhwBna() : list, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? "0" : str2, (i & 8) != 0 ? false : z, (i & 16) != 0 ? "" : str3, (i & 32) == 0 ? str4 : "");
    }
}
