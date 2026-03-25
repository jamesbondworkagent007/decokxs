package com.okinc.resource.request;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Serializable
public final class MiniAppUpdateResp {
    private String appid;
    private String fitVersion;
    private String md5;
    private String nameKey;
    private String url;
    private String version;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public MiniAppUpdateResp() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 63, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ MiniAppUpdateResp copy$default(MiniAppUpdateResp miniAppUpdateResp, String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = miniAppUpdateResp.md5;
        }
        if ((i & 2) != 0) {
            str2 = miniAppUpdateResp.version;
        }
        String str7 = str2;
        if ((i & 4) != 0) {
            str3 = miniAppUpdateResp.url;
        }
        String str8 = str3;
        if ((i & 8) != 0) {
            str4 = miniAppUpdateResp.nameKey;
        }
        String str9 = str4;
        if ((i & 16) != 0) {
            str5 = miniAppUpdateResp.appid;
        }
        String str10 = str5;
        if ((i & 32) != 0) {
            str6 = miniAppUpdateResp.fitVersion;
        }
        return miniAppUpdateResp.copy(str, str7, str8, str9, str10, str6);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.md5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.version;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.url;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.nameKey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.appid;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.fitVersion;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MiniAppUpdateResp copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        return new MiniAppUpdateResp(str, str2, str3, str4, str5, str6);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MiniAppUpdateResp)) {
            return false;
        }
        MiniAppUpdateResp miniAppUpdateResp = (MiniAppUpdateResp) obj;
        return Intrinsics.EZpvd((Object) this.md5, (Object) miniAppUpdateResp.md5) && Intrinsics.EZpvd((Object) this.version, (Object) miniAppUpdateResp.version) && Intrinsics.EZpvd((Object) this.url, (Object) miniAppUpdateResp.url) && Intrinsics.EZpvd((Object) this.nameKey, (Object) miniAppUpdateResp.nameKey) && Intrinsics.EZpvd((Object) this.appid, (Object) miniAppUpdateResp.appid) && Intrinsics.EZpvd((Object) this.fitVersion, (Object) miniAppUpdateResp.fitVersion);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAppid() {
        return this.appid;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFitVersion() {
        return this.fitVersion;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMd5() {
        return this.md5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNameKey() {
        return this.nameKey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUrl() {
        return this.url;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getVersion() {
        return this.version;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((this.md5.hashCode() * 31) + this.version.hashCode()) * 31) + this.url.hashCode()) * 31) + this.nameKey.hashCode()) * 31) + this.appid.hashCode()) * 31) + this.fitVersion.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAppid(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.appid = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFitVersion(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.fitVersion = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMd5(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.md5 = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setNameKey(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.nameKey = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setUrl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.url = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setVersion(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.version = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "MiniAppUpdateResp(md5=" + this.md5 + ", version=" + this.version + ", url=" + this.url + ", nameKey=" + this.nameKey + ", appid=" + this.appid + ", fitVersion=" + this.fitVersion + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.resource.request.MiniAppUpdateResp.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<MiniAppUpdateResp> serializer() {
            return MiniAppUpdateResp$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ MiniAppUpdateResp(int i, String str, String str2, String str3, String str4, String str5, String str6, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.md5 = "";
        } else {
            this.md5 = str;
        }
        if ((i & 2) == 0) {
            this.version = "0";
        } else {
            this.version = str2;
        }
        if ((i & 4) == 0) {
            this.url = "";
        } else {
            this.url = str3;
        }
        if ((i & 8) == 0) {
            this.nameKey = "";
        } else {
            this.nameKey = str4;
        }
        if ((i & 16) == 0) {
            this.appid = "";
        } else {
            this.appid = str5;
        }
        if ((i & 32) == 0) {
            this.fitVersion = "";
        } else {
            this.fitVersion = str6;
        }
    }

    public static final /* synthetic */ void write$Self$OKRuntime_ok_runtime(MiniAppUpdateResp miniAppUpdateResp, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) miniAppUpdateResp.md5, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, miniAppUpdateResp.md5);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) miniAppUpdateResp.version, (Object) "0")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, miniAppUpdateResp.version);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) miniAppUpdateResp.url, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, miniAppUpdateResp.url);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) miniAppUpdateResp.nameKey, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, miniAppUpdateResp.nameKey);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) miniAppUpdateResp.appid, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, miniAppUpdateResp.appid);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) && Intrinsics.EZpvd((Object) miniAppUpdateResp.fitVersion, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 5, miniAppUpdateResp.fitVersion);
    }

    public MiniAppUpdateResp(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        this.md5 = str;
        this.version = str2;
        this.url = str3;
        this.nameKey = str4;
        this.appid = str5;
        this.fitVersion = str6;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0032: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r12v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r6v0 java.lang.String))
  (wrap:java.lang.String:0x000f: TERNARY null = ((wrap:int:0x0009: ARITH (r12v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("0") : (r7v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0010: ARITH (r12v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r8v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0017: ARITH (r12v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r9v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001e: ARITH (r12v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r10v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0025: ARITH (r12v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r11v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:8) call: com.okinc.resource.request.MiniAppUpdateResp.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ MiniAppUpdateResp(String str, String str2, String str3, String str4, String str5, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "0" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6);
    }
}
