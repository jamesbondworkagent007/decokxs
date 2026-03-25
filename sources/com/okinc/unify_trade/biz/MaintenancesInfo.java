package com.okinc.unify_trade.biz;

import com.okinc.business.defi.api.model.tx.signdata.MultiTransferSignData;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Serializable
public final class MaintenancesInfo {
    private final String appBannerContent;
    private final String bannerContent;
    private final String displayType;
    private final String endTime;
    private final String href;
    private final String id;
    private final String impactContent;
    private final ArrayList<String> impactList;
    private final String maintenanceId;
    private final String productType;
    private final String startEndTimeDesc;
    private final String startTime;
    private final String status;
    private final String system;
    private final String systemTime;
    private final String title;
    private final String type;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, null, null, null, null, null, new ArrayListSerializer(StringSerializer.INSTANCE), null, null, null, null, null, null};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public MaintenancesInfo() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (ArrayList) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 131071, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.startTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.impactContent;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<String> component11() {
        return this.impactList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.displayType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component13() {
        return this.maintenanceId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component14() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component15() {
        return this.startEndTimeDesc;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component16() {
        return this.bannerContent;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component17() {
        return this.appBannerContent;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.endTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.systemTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.href;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.productType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.system;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MaintenancesInfo copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull ArrayList<String> arrayList, @NotNull String str11, @NotNull String str12, @NotNull String str13, @NotNull String str14, @NotNull String str15, @NotNull String str16) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(arrayList, "");
        Intrinsics.checkNotNullParameter(str11, "");
        Intrinsics.checkNotNullParameter(str12, "");
        Intrinsics.checkNotNullParameter(str13, "");
        Intrinsics.checkNotNullParameter(str14, "");
        Intrinsics.checkNotNullParameter(str15, "");
        Intrinsics.checkNotNullParameter(str16, "");
        return new MaintenancesInfo(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, arrayList, str11, str12, str13, str14, str15, str16);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MaintenancesInfo)) {
            return false;
        }
        MaintenancesInfo maintenancesInfo = (MaintenancesInfo) obj;
        return Intrinsics.EZpvd((Object) this.startTime, (Object) maintenancesInfo.startTime) && Intrinsics.EZpvd((Object) this.endTime, (Object) maintenancesInfo.endTime) && Intrinsics.EZpvd((Object) this.systemTime, (Object) maintenancesInfo.systemTime) && Intrinsics.EZpvd((Object) this.title, (Object) maintenancesInfo.title) && Intrinsics.EZpvd((Object) this.status, (Object) maintenancesInfo.status) && Intrinsics.EZpvd((Object) this.href, (Object) maintenancesInfo.href) && Intrinsics.EZpvd((Object) this.type, (Object) maintenancesInfo.type) && Intrinsics.EZpvd((Object) this.productType, (Object) maintenancesInfo.productType) && Intrinsics.EZpvd((Object) this.system, (Object) maintenancesInfo.system) && Intrinsics.EZpvd((Object) this.impactContent, (Object) maintenancesInfo.impactContent) && Intrinsics.EZpvd(this.impactList, maintenancesInfo.impactList) && Intrinsics.EZpvd((Object) this.displayType, (Object) maintenancesInfo.displayType) && Intrinsics.EZpvd((Object) this.maintenanceId, (Object) maintenancesInfo.maintenanceId) && Intrinsics.EZpvd((Object) this.id, (Object) maintenancesInfo.id) && Intrinsics.EZpvd((Object) this.startEndTimeDesc, (Object) maintenancesInfo.startEndTimeDesc) && Intrinsics.EZpvd((Object) this.bannerContent, (Object) maintenancesInfo.bannerContent) && Intrinsics.EZpvd((Object) this.appBannerContent, (Object) maintenancesInfo.appBannerContent);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAppBannerContent() {
        return this.appBannerContent;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBannerContent() {
        return this.bannerContent;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDisplayType() {
        return this.displayType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEndTime() {
        return this.endTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getHref() {
        return this.href;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getId() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getImpactContent() {
        return this.impactContent;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<String> getImpactList() {
        return this.impactList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMaintenanceId() {
        return this.maintenanceId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getProductType() {
        return this.productType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getStartEndTimeDesc() {
        return this.startEndTimeDesc;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getStartTime() {
        return this.startTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getStatus() {
        return this.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSystem() {
        return this.system;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSystemTime() {
        return this.systemTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTitle() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getType() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((((((((((((((((((((this.startTime.hashCode() * 31) + this.endTime.hashCode()) * 31) + this.systemTime.hashCode()) * 31) + this.title.hashCode()) * 31) + this.status.hashCode()) * 31) + this.href.hashCode()) * 31) + this.type.hashCode()) * 31) + this.productType.hashCode()) * 31) + this.system.hashCode()) * 31) + this.impactContent.hashCode()) * 31) + this.impactList.hashCode()) * 31) + this.displayType.hashCode()) * 31) + this.maintenanceId.hashCode()) * 31) + this.id.hashCode()) * 31) + this.startEndTimeDesc.hashCode()) * 31) + this.bannerContent.hashCode()) * 31) + this.appBannerContent.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "MaintenancesInfo(startTime=" + this.startTime + ", endTime=" + this.endTime + ", systemTime=" + this.systemTime + ", title=" + this.title + ", status=" + this.status + ", href=" + this.href + ", type=" + this.type + ", productType=" + this.productType + ", system=" + this.system + ", impactContent=" + this.impactContent + ", impactList=" + this.impactList + ", displayType=" + this.displayType + ", maintenanceId=" + this.maintenanceId + ", id=" + this.id + ", startEndTimeDesc=" + this.startEndTimeDesc + ", bannerContent=" + this.bannerContent + ", appBannerContent=" + this.appBannerContent + ")";
    }

    /* JADX INFO: loaded from: classes24.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.MaintenancesInfo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<MaintenancesInfo> serializer() {
            return MaintenancesInfo$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ MaintenancesInfo(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, ArrayList arrayList, String str11, String str12, String str13, String str14, String str15, String str16, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.startTime = MultiTransferSignData.DEFAULT_INTERVAL;
        } else {
            this.startTime = str;
        }
        if ((i & 2) == 0) {
            this.endTime = MultiTransferSignData.DEFAULT_INTERVAL;
        } else {
            this.endTime = str2;
        }
        if ((i & 4) == 0) {
            this.systemTime = MultiTransferSignData.DEFAULT_INTERVAL;
        } else {
            this.systemTime = str3;
        }
        if ((i & 8) == 0) {
            this.title = "";
        } else {
            this.title = str4;
        }
        if ((i & 16) == 0) {
            this.status = MultiTransferSignData.DEFAULT_INTERVAL;
        } else {
            this.status = str5;
        }
        if ((i & 32) == 0) {
            this.href = "";
        } else {
            this.href = str6;
        }
        if ((i & 64) == 0) {
            this.type = "";
        } else {
            this.type = str7;
        }
        if ((i & 128) == 0) {
            this.productType = "";
        } else {
            this.productType = str8;
        }
        if ((i & 256) == 0) {
            this.system = "";
        } else {
            this.system = str9;
        }
        if ((i & 512) == 0) {
            this.impactContent = "";
        } else {
            this.impactContent = str10;
        }
        this.impactList = (i & 1024) == 0 ? new ArrayList() : arrayList;
        if ((i & 2048) == 0) {
            this.displayType = MultiTransferSignData.DEFAULT_INTERVAL;
        } else {
            this.displayType = str11;
        }
        if ((i & 4096) == 0) {
            this.maintenanceId = "";
        } else {
            this.maintenanceId = str12;
        }
        if ((i & 8192) == 0) {
            this.id = "";
        } else {
            this.id = str13;
        }
        if ((i & 16384) == 0) {
            this.startEndTimeDesc = "";
        } else {
            this.startEndTimeDesc = str14;
        }
        if ((32768 & i) == 0) {
            this.bannerContent = "";
        } else {
            this.bannerContent = str15;
        }
        if ((i & 65536) == 0) {
            this.appBannerContent = "";
        } else {
            this.appBannerContent = str16;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(MaintenancesInfo maintenancesInfo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) maintenancesInfo.startTime, (Object) MultiTransferSignData.DEFAULT_INTERVAL)) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, maintenancesInfo.startTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) maintenancesInfo.endTime, (Object) MultiTransferSignData.DEFAULT_INTERVAL)) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, maintenancesInfo.endTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) maintenancesInfo.systemTime, (Object) MultiTransferSignData.DEFAULT_INTERVAL)) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, maintenancesInfo.systemTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) maintenancesInfo.title, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, maintenancesInfo.title);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) maintenancesInfo.status, (Object) MultiTransferSignData.DEFAULT_INTERVAL)) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, maintenancesInfo.status);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) maintenancesInfo.href, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, maintenancesInfo.href);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) maintenancesInfo.type, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, maintenancesInfo.type);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) maintenancesInfo.productType, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 7, maintenancesInfo.productType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd((Object) maintenancesInfo.system, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 8, maintenancesInfo.system);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || !Intrinsics.EZpvd((Object) maintenancesInfo.impactContent, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 9, maintenancesInfo.impactContent);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || !Intrinsics.EZpvd(maintenancesInfo.impactList, new ArrayList())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 10, kSerializerArr[10], maintenancesInfo.impactList);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || !Intrinsics.EZpvd((Object) maintenancesInfo.displayType, (Object) MultiTransferSignData.DEFAULT_INTERVAL)) {
            compositeEncoder.encodeStringElement(serialDescriptor, 11, maintenancesInfo.displayType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || !Intrinsics.EZpvd((Object) maintenancesInfo.maintenanceId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 12, maintenancesInfo.maintenanceId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || !Intrinsics.EZpvd((Object) maintenancesInfo.id, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 13, maintenancesInfo.id);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || !Intrinsics.EZpvd((Object) maintenancesInfo.startEndTimeDesc, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 14, maintenancesInfo.startEndTimeDesc);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) || !Intrinsics.EZpvd((Object) maintenancesInfo.bannerContent, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 15, maintenancesInfo.bannerContent);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) && Intrinsics.EZpvd((Object) maintenancesInfo.appBannerContent, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 16, maintenancesInfo.appBannerContent);
    }

    public MaintenancesInfo(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull ArrayList<String> arrayList, @NotNull String str11, @NotNull String str12, @NotNull String str13, @NotNull String str14, @NotNull String str15, @NotNull String str16) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(arrayList, "");
        Intrinsics.checkNotNullParameter(str11, "");
        Intrinsics.checkNotNullParameter(str12, "");
        Intrinsics.checkNotNullParameter(str13, "");
        Intrinsics.checkNotNullParameter(str14, "");
        Intrinsics.checkNotNullParameter(str15, "");
        Intrinsics.checkNotNullParameter(str16, "");
        this.startTime = str;
        this.endTime = str2;
        this.systemTime = str3;
        this.title = str4;
        this.status = str5;
        this.href = str6;
        this.type = str7;
        this.productType = str8;
        this.system = str9;
        this.impactContent = str10;
        this.impactList = arrayList;
        this.displayType = str11;
        this.maintenanceId = str12;
        this.id = str13;
        this.startEndTimeDesc = str14;
        this.bannerContent = str15;
        this.appBannerContent = str16;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x00bf: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r36v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0008: SGET  A[WRAPPED] com.okinc.business.defi.api.model.tx.signdata.MultiTransferSignData.DEFAULT_INTERVAL java.lang.String) : (r19v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r36v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0010: SGET  A[WRAPPED] com.okinc.business.defi.api.model.tx.signdata.MultiTransferSignData.DEFAULT_INTERVAL java.lang.String) : (r20v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0014: ARITH (r36v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0018: SGET  A[WRAPPED] com.okinc.business.defi.api.model.tx.signdata.MultiTransferSignData.DEFAULT_INTERVAL java.lang.String) : (r21v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001c: ARITH (r36v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r22v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0026: ARITH (r36v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x002a: SGET  A[WRAPPED] com.okinc.business.defi.api.model.tx.signdata.MultiTransferSignData.DEFAULT_INTERVAL java.lang.String) : (r23v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002e: ARITH (r36v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r24v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0036: ARITH (r36v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r25v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003e: ARITH (r36v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r26v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0046: ARITH (r36v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r27v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004e: ARITH (r36v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? ("") : (r28v0 java.lang.String))
  (wrap:java.util.ArrayList:?: TERNARY null = ((wrap:int:0x0056: ARITH (r36v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x005c: CONSTRUCTOR  A[MD:():void (c), WRAPPED] (LINE:1020) call: java.util.ArrayList.<init>():void type: CONSTRUCTOR) : (r29v0 java.util.ArrayList))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0062: ARITH (r36v0 int) & (2048 int) A[WRAPPED]) == (0 int)) ? (r30v0 java.lang.String) : (wrap:java.lang.String:0x0004: SGET  A[WRAPPED] com.okinc.business.defi.api.model.tx.signdata.MultiTransferSignData.DEFAULT_INTERVAL java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0069: ARITH (r36v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? ("") : (r31v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0071: ARITH (r36v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? ("") : (r32v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x007b: ARITH (r36v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? ("") : (r33v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0087: ARITH (r36v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? ("") : (r34v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0092: ARITH (r36v0 int) & (65536 int) A[WRAPPED]) != (0 int)) ? ("") : (r35v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.ArrayList<java.lang.String>, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:1009) call: com.okinc.unify_trade.biz.MaintenancesInfo.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.ArrayList, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ MaintenancesInfo(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, ArrayList arrayList, String str11, String str12, String str13, String str14, String str15, String str16, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? MultiTransferSignData.DEFAULT_INTERVAL : str, (i & 2) != 0 ? MultiTransferSignData.DEFAULT_INTERVAL : str2, (i & 4) != 0 ? MultiTransferSignData.DEFAULT_INTERVAL : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? MultiTransferSignData.DEFAULT_INTERVAL : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7, (i & 128) != 0 ? "" : str8, (i & 256) != 0 ? "" : str9, (i & 512) != 0 ? "" : str10, (i & 1024) != 0 ? new ArrayList() : arrayList, (i & 2048) == 0 ? str11 : MultiTransferSignData.DEFAULT_INTERVAL, (i & 4096) != 0 ? "" : str12, (i & 8192) != 0 ? "" : str13, (i & 16384) != 0 ? "" : str14, (i & 32768) != 0 ? "" : str15, (i & 65536) != 0 ? "" : str16);
    }
}
