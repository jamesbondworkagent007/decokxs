package com.okinc.unify_trade.biz;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes24.dex */
@Serializable
public final class DownLoadInfo {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String downloadTime;
    private final String endTime;
    private final String exportFormat;
    private final String id;
    private final String idCode;
    private final String reportType;
    private final String startTime;
    private final String status;
    private final TimeZoneDetails timezone;
    private final String url;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.downloadTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TimeZoneDetails component10() {
        return this.timezone;
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
        return this.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.reportType;
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
    public final String component8() {
        return this.idCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.url;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DownLoadInfo copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull TimeZoneDetails timeZoneDetails) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(timeZoneDetails, "");
        return new DownLoadInfo(str, str2, str3, str4, str5, str6, str7, str8, str9, timeZoneDetails);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DownLoadInfo)) {
            return false;
        }
        DownLoadInfo downLoadInfo = (DownLoadInfo) obj;
        return Intrinsics.EZpvd((Object) this.downloadTime, (Object) downLoadInfo.downloadTime) && Intrinsics.EZpvd((Object) this.startTime, (Object) downLoadInfo.startTime) && Intrinsics.EZpvd((Object) this.endTime, (Object) downLoadInfo.endTime) && Intrinsics.EZpvd((Object) this.status, (Object) downLoadInfo.status) && Intrinsics.EZpvd((Object) this.reportType, (Object) downLoadInfo.reportType) && Intrinsics.EZpvd((Object) this.exportFormat, (Object) downLoadInfo.exportFormat) && Intrinsics.EZpvd((Object) this.id, (Object) downLoadInfo.id) && Intrinsics.EZpvd((Object) this.idCode, (Object) downLoadInfo.idCode) && Intrinsics.EZpvd((Object) this.url, (Object) downLoadInfo.url) && Intrinsics.EZpvd(this.timezone, downLoadInfo.timezone);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDownloadTime() {
        return this.downloadTime;
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
    public final String getIdCode() {
        return this.idCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getReportType() {
        return this.reportType;
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
    public final TimeZoneDetails getTimezone() {
        return this.timezone;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUrl() {
        return this.url;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((((((this.downloadTime.hashCode() * 31) + this.startTime.hashCode()) * 31) + this.endTime.hashCode()) * 31) + this.status.hashCode()) * 31) + this.reportType.hashCode()) * 31) + this.exportFormat.hashCode()) * 31) + this.id.hashCode()) * 31) + this.idCode.hashCode()) * 31) + this.url.hashCode()) * 31) + this.timezone.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "DownLoadInfo(downloadTime=" + this.downloadTime + ", startTime=" + this.startTime + ", endTime=" + this.endTime + ", status=" + this.status + ", reportType=" + this.reportType + ", exportFormat=" + this.exportFormat + ", id=" + this.id + ", idCode=" + this.idCode + ", url=" + this.url + ", timezone=" + this.timezone + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.DownLoadInfo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<DownLoadInfo> serializer() {
            return DownLoadInfo$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ DownLoadInfo(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, TimeZoneDetails timeZoneDetails, SerializationConstructorMarker serializationConstructorMarker) {
        if (1023 != (i & 1023)) {
            PluginExceptionsKt.throwMissingFieldException(i, 1023, DownLoadInfo$$serializer.INSTANCE.getDescriptor());
        }
        this.downloadTime = str;
        this.startTime = str2;
        this.endTime = str3;
        this.status = str4;
        this.reportType = str5;
        this.exportFormat = str6;
        this.id = str7;
        this.idCode = str8;
        this.url = str9;
        this.timezone = timeZoneDetails;
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(DownLoadInfo downLoadInfo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, downLoadInfo.downloadTime);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, downLoadInfo.startTime);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, downLoadInfo.endTime);
        compositeEncoder.encodeStringElement(serialDescriptor, 3, downLoadInfo.status);
        compositeEncoder.encodeStringElement(serialDescriptor, 4, downLoadInfo.reportType);
        compositeEncoder.encodeStringElement(serialDescriptor, 5, downLoadInfo.exportFormat);
        compositeEncoder.encodeStringElement(serialDescriptor, 6, downLoadInfo.id);
        compositeEncoder.encodeStringElement(serialDescriptor, 7, downLoadInfo.idCode);
        compositeEncoder.encodeStringElement(serialDescriptor, 8, downLoadInfo.url);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 9, TimeZoneDetails$$serializer.INSTANCE, downLoadInfo.timezone);
    }

    public DownLoadInfo(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull TimeZoneDetails timeZoneDetails) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(timeZoneDetails, "");
        this.downloadTime = str;
        this.startTime = str2;
        this.endTime = str3;
        this.status = str4;
        this.reportType = str5;
        this.exportFormat = str6;
        this.id = str7;
        this.idCode = str8;
        this.url = str9;
        this.timezone = timeZoneDetails;
    }
}
