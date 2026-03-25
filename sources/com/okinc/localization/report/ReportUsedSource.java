package com.okinc.localization.report;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Serializable
public final class ReportUsedSource {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String content;
    private final String isStartupKey;
    private final String language;
    private final String type;
    private final String value;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ ReportUsedSource copy$default(ReportUsedSource reportUsedSource, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = reportUsedSource.type;
        }
        if ((i & 2) != 0) {
            str2 = reportUsedSource.value;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = reportUsedSource.content;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = reportUsedSource.language;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            str5 = reportUsedSource.isStartupKey;
        }
        return reportUsedSource.copy(str, str6, str7, str8, str5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.value;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.content;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.language;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.isStartupKey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ReportUsedSource copy(@NotNull String str, @NotNull String str2, String str3, String str4, @NotNull String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str5, "");
        return new ReportUsedSource(str, str2, str3, str4, str5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReportUsedSource)) {
            return false;
        }
        ReportUsedSource reportUsedSource = (ReportUsedSource) obj;
        return Intrinsics.EZpvd((Object) this.type, (Object) reportUsedSource.type) && Intrinsics.EZpvd((Object) this.value, (Object) reportUsedSource.value) && Intrinsics.EZpvd((Object) this.content, (Object) reportUsedSource.content) && Intrinsics.EZpvd((Object) this.language, (Object) reportUsedSource.language) && Intrinsics.EZpvd((Object) this.isStartupKey, (Object) reportUsedSource.isStartupKey);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getContent() {
        return this.content;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLanguage() {
        return this.language;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getType() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getValue() {
        return this.value;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.type.hashCode();
        int iHashCode2 = this.value.hashCode();
        String str = this.content;
        int iHashCode3 = str == null ? 0 : str.hashCode();
        String str2 = this.language;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (str2 != null ? str2.hashCode() : 0)) * 31) + this.isStartupKey.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String isStartupKey() {
        return this.isStartupKey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ReportUsedSource(type=" + this.type + ", value=" + this.value + ", content=" + this.content + ", language=" + this.language + ", isStartupKey=" + this.isStartupKey + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.localization.report.ReportUsedSource.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ReportUsedSource> serializer() {
            return ReportUsedSource$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ReportUsedSource(int i, String str, String str2, String str3, String str4, String str5, SerializationConstructorMarker serializationConstructorMarker) {
        if (19 != (i & 19)) {
            PluginExceptionsKt.throwMissingFieldException(i, 19, ReportUsedSource$$serializer.INSTANCE.getDescriptor());
        }
        this.type = str;
        this.value = str2;
        if ((i & 4) == 0) {
            this.content = null;
        } else {
            this.content = str3;
        }
        if ((i & 8) == 0) {
            this.language = null;
        } else {
            this.language = str4;
        }
        this.isStartupKey = str5;
    }

    public static final /* synthetic */ void write$Self$OKLocalization_localization(ReportUsedSource reportUsedSource, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, reportUsedSource.type);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, reportUsedSource.value);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || reportUsedSource.content != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, reportUsedSource.content);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || reportUsedSource.language != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, reportUsedSource.language);
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 4, reportUsedSource.isStartupKey);
    }

    public ReportUsedSource(@NotNull String str, @NotNull String str2, String str3, String str4, @NotNull String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str5, "");
        this.type = str;
        this.value = str2;
        this.content = str3;
        this.language = str4;
        this.isStartupKey = str5;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0013: CONSTRUCTOR 
  (r8v0 java.lang.String)
  (r9v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r13v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r10v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0008: ARITH (r13v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r11v0 java.lang.String))
  (r12v0 java.lang.String)
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:24) call: com.okinc.localization.report.ReportUsedSource.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ ReportUsedSource(String str, String str2, String str3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, str5);
    }
}
