package com.okinc.localization.report;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Serializable
public final class LocalizationReportData {
    private final List<ReportUsedSource> data;
    private final String flavor;
    private final String platform;
    private final String version;
    private final String versionCode;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, new ArrayListSerializer(ReportUsedSource$$serializer.INSTANCE), null};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: com.okinc.localization.report.LocalizationReportData */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LocalizationReportData copy$default(LocalizationReportData localizationReportData, String str, String str2, String str3, List list, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = localizationReportData.version;
        }
        if ((i & 2) != 0) {
            str2 = localizationReportData.versionCode;
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            str3 = localizationReportData.flavor;
        }
        String str6 = str3;
        if ((i & 8) != 0) {
            list = localizationReportData.data;
        }
        List list2 = list;
        if ((i & 16) != 0) {
            str4 = localizationReportData.platform;
        }
        return localizationReportData.copy(str, str5, str6, list2, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.version;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.versionCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.flavor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<ReportUsedSource> component4() {
        return this.data;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.platform;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LocalizationReportData copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull List<ReportUsedSource> list, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str4, "");
        return new LocalizationReportData(str, str2, str3, list, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocalizationReportData)) {
            return false;
        }
        LocalizationReportData localizationReportData = (LocalizationReportData) obj;
        return Intrinsics.EZpvd((Object) this.version, (Object) localizationReportData.version) && Intrinsics.EZpvd((Object) this.versionCode, (Object) localizationReportData.versionCode) && Intrinsics.EZpvd((Object) this.flavor, (Object) localizationReportData.flavor) && Intrinsics.EZpvd(this.data, localizationReportData.data) && Intrinsics.EZpvd((Object) this.platform, (Object) localizationReportData.platform);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<ReportUsedSource> getData() {
        return this.data;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFlavor() {
        return this.flavor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPlatform() {
        return this.platform;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getVersion() {
        return this.version;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getVersionCode() {
        return this.versionCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((this.version.hashCode() * 31) + this.versionCode.hashCode()) * 31) + this.flavor.hashCode()) * 31) + this.data.hashCode()) * 31) + this.platform.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "LocalizationReportData(version=" + this.version + ", versionCode=" + this.versionCode + ", flavor=" + this.flavor + ", data=" + this.data + ", platform=" + this.platform + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.localization.report.LocalizationReportData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<LocalizationReportData> serializer() {
            return LocalizationReportData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ LocalizationReportData(int i, String str, String str2, String str3, List list, String str4, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i & 15)) {
            PluginExceptionsKt.throwMissingFieldException(i, 15, LocalizationReportData$$serializer.INSTANCE.getDescriptor());
        }
        this.version = str;
        this.versionCode = str2;
        this.flavor = str3;
        this.data = list;
        if ((i & 16) == 0) {
            this.platform = "2";
        } else {
            this.platform = str4;
        }
    }

    public static final /* synthetic */ void write$Self$OKLocalization_localization(LocalizationReportData localizationReportData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        compositeEncoder.encodeStringElement(serialDescriptor, 0, localizationReportData.version);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, localizationReportData.versionCode);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, localizationReportData.flavor);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 3, kSerializerArr[3], localizationReportData.data);
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) && Intrinsics.EZpvd((Object) localizationReportData.platform, (Object) "2")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 4, localizationReportData.platform);
    }

    public LocalizationReportData(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull List<ReportUsedSource> list, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.version = str;
        this.versionCode = str2;
        this.flavor = str3;
        this.data = list;
        this.platform = str4;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000c: CONSTRUCTOR 
  (r7v0 java.lang.String)
  (r8v0 java.lang.String)
  (r9v0 java.lang.String)
  (r10v0 java.util.List)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r12v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("2") : (r11v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.util.List<com.okinc.localization.report.ReportUsedSource>, java.lang.String):void (m)] (LINE:14) call: com.okinc.localization.report.LocalizationReportData.<init>(java.lang.String, java.lang.String, java.lang.String, java.util.List, java.lang.String):void type: THIS */
    public /* synthetic */ LocalizationReportData(String str, String str2, String str3, List list, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, list, (i & 16) != 0 ? "2" : str4);
    }
}
