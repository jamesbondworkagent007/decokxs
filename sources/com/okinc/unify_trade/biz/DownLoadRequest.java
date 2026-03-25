package com.okinc.unify_trade.biz;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Serializable
public final class DownLoadRequest {
    private final Boolean emailDelivery;
    private final String endTime;
    private final String exportFormat;
    private final String id;
    private final Boolean isHidden;
    private final String password;
    private final String startTime;
    private final List<String> subAccountUidList;
    private final String timeDiff;
    private final String type;
    private final String userDownloadTimeZone;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, null, null, new ArrayListSerializer(StringSerializer.INSTANCE), null, null, null};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component10() {
        return this.emailDelivery;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.password;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.startTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.endTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.timeDiff;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.userDownloadTimeZone;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.exportFormat;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component8() {
        return this.subAccountUidList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component9() {
        return this.isHidden;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DownLoadRequest copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, String str7, List<String> list, Boolean bool, Boolean bool2, String str8) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        return new DownLoadRequest(str, str2, str3, str4, str5, str6, str7, list, bool, bool2, str8);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DownLoadRequest)) {
            return false;
        }
        DownLoadRequest downLoadRequest = (DownLoadRequest) obj;
        return Intrinsics.EZpvd((Object) this.type, (Object) downLoadRequest.type) && Intrinsics.EZpvd((Object) this.startTime, (Object) downLoadRequest.startTime) && Intrinsics.EZpvd((Object) this.endTime, (Object) downLoadRequest.endTime) && Intrinsics.EZpvd((Object) this.timeDiff, (Object) downLoadRequest.timeDiff) && Intrinsics.EZpvd((Object) this.userDownloadTimeZone, (Object) downLoadRequest.userDownloadTimeZone) && Intrinsics.EZpvd((Object) this.exportFormat, (Object) downLoadRequest.exportFormat) && Intrinsics.EZpvd((Object) this.id, (Object) downLoadRequest.id) && Intrinsics.EZpvd(this.subAccountUidList, downLoadRequest.subAccountUidList) && Intrinsics.EZpvd(this.isHidden, downLoadRequest.isHidden) && Intrinsics.EZpvd(this.emailDelivery, downLoadRequest.emailDelivery) && Intrinsics.EZpvd((Object) this.password, (Object) downLoadRequest.password);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getEmailDelivery() {
        return this.emailDelivery;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEndTime() {
        return this.endTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getExportFormat() {
        return this.exportFormat;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getId() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPassword() {
        return this.password;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getStartTime() {
        return this.startTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> getSubAccountUidList() {
        return this.subAccountUidList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTimeDiff() {
        return this.timeDiff;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getType() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUserDownloadTimeZone() {
        return this.userDownloadTimeZone;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.type.hashCode();
        int iHashCode2 = this.startTime.hashCode();
        int iHashCode3 = this.endTime.hashCode();
        int iHashCode4 = this.timeDiff.hashCode();
        int iHashCode5 = this.userDownloadTimeZone.hashCode();
        int iHashCode6 = this.exportFormat.hashCode();
        String str = this.id;
        int iHashCode7 = str == null ? 0 : str.hashCode();
        List<String> list = this.subAccountUidList;
        int iHashCode8 = list == null ? 0 : list.hashCode();
        Boolean bool = this.isHidden;
        int iHashCode9 = bool == null ? 0 : bool.hashCode();
        Boolean bool2 = this.emailDelivery;
        int iHashCode10 = bool2 == null ? 0 : bool2.hashCode();
        String str2 = this.password;
        return (((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean isHidden() {
        return this.isHidden;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "DownLoadRequest(type=" + this.type + ", startTime=" + this.startTime + ", endTime=" + this.endTime + ", timeDiff=" + this.timeDiff + ", userDownloadTimeZone=" + this.userDownloadTimeZone + ", exportFormat=" + this.exportFormat + ", id=" + this.id + ", subAccountUidList=" + this.subAccountUidList + ", isHidden=" + this.isHidden + ", emailDelivery=" + this.emailDelivery + ", password=" + this.password + ")";
    }

    /* JADX INFO: loaded from: classes24.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.DownLoadRequest.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<DownLoadRequest> serializer() {
            return DownLoadRequest$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ DownLoadRequest(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, List list, Boolean bool, Boolean bool2, String str8, SerializationConstructorMarker serializationConstructorMarker) {
        if (63 != (i & 63)) {
            PluginExceptionsKt.throwMissingFieldException(i, 63, DownLoadRequest$$serializer.INSTANCE.getDescriptor());
        }
        this.type = str;
        this.startTime = str2;
        this.endTime = str3;
        this.timeDiff = str4;
        this.userDownloadTimeZone = str5;
        this.exportFormat = str6;
        if ((i & 64) == 0) {
            this.id = null;
        } else {
            this.id = str7;
        }
        if ((i & 128) == 0) {
            this.subAccountUidList = null;
        } else {
            this.subAccountUidList = list;
        }
        if ((i & 256) == 0) {
            this.isHidden = null;
        } else {
            this.isHidden = bool;
        }
        if ((i & 512) == 0) {
            this.emailDelivery = null;
        } else {
            this.emailDelivery = bool2;
        }
        if ((i & 1024) == 0) {
            this.password = null;
        } else {
            this.password = str8;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(DownLoadRequest downLoadRequest, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        compositeEncoder.encodeStringElement(serialDescriptor, 0, downLoadRequest.type);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, downLoadRequest.startTime);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, downLoadRequest.endTime);
        compositeEncoder.encodeStringElement(serialDescriptor, 3, downLoadRequest.timeDiff);
        compositeEncoder.encodeStringElement(serialDescriptor, 4, downLoadRequest.userDownloadTimeZone);
        compositeEncoder.encodeStringElement(serialDescriptor, 5, downLoadRequest.exportFormat);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || downLoadRequest.id != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, downLoadRequest.id);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || downLoadRequest.subAccountUidList != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, kSerializerArr[7], downLoadRequest.subAccountUidList);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || downLoadRequest.isHidden != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, BooleanSerializer.INSTANCE, downLoadRequest.isHidden);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || downLoadRequest.emailDelivery != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, BooleanSerializer.INSTANCE, downLoadRequest.emailDelivery);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) && downLoadRequest.password == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, StringSerializer.INSTANCE, downLoadRequest.password);
    }

    public DownLoadRequest(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, String str7, List<String> list, Boolean bool, Boolean bool2, String str8) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        this.type = str;
        this.startTime = str2;
        this.endTime = str3;
        this.timeDiff = str4;
        this.userDownloadTimeZone = str5;
        this.exportFormat = str6;
        this.id = str7;
        this.subAccountUidList = list;
        this.isHidden = bool;
        this.emailDelivery = bool2;
        this.password = str8;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0038: CONSTRUCTOR 
  (r16v0 java.lang.String)
  (r17v0 java.lang.String)
  (r18v0 java.lang.String)
  (r19v0 java.lang.String)
  (r20v0 java.lang.String)
  (r21v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r27v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r22v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x000b: ARITH (r27v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r23v0 java.util.List))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0013: ARITH (r27v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r24v0 java.lang.Boolean))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x001b: ARITH (r27v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r25v0 java.lang.Boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0023: ARITH (r27v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r26v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List<java.lang.String>, java.lang.Boolean, java.lang.Boolean, java.lang.String):void (m)] (LINE:399) call: com.okinc.unify_trade.biz.DownLoadRequest.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, java.lang.Boolean, java.lang.Boolean, java.lang.String):void type: THIS */
    public /* synthetic */ DownLoadRequest(String str, String str2, String str3, String str4, String str5, String str6, String str7, List list, Boolean bool, Boolean bool2, String str8, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, str5, str6, (i & 64) != 0 ? null : str7, (i & 128) != 0 ? null : list, (i & 256) != 0 ? null : bool, (i & 512) != 0 ? null : bool2, (i & 1024) != 0 ? null : str8);
    }
}
