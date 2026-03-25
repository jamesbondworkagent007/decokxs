package com.okinc.okex.center.bean;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Serializable
public final class MiniSupportResponse {
    private final String dataTrackingKey;
    private final String description;
    private final String iconBright;
    private final String iconDark;
    private final String id;
    private final String slug;
    private final List<String> tags;
    private final String title;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, null, new ArrayListSerializer(StringSerializer.INSTANCE), null};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public MiniSupportResponse() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, (String) null, 255, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.dataTrackingKey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.description;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.iconBright;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.iconDark;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.slug;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component7() {
        return this.tags;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MiniSupportResponse copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull List<String> list, @NotNull String str7) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str7, "");
        return new MiniSupportResponse(str, str2, str3, str4, str5, str6, list, str7);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MiniSupportResponse)) {
            return false;
        }
        MiniSupportResponse miniSupportResponse = (MiniSupportResponse) obj;
        return Intrinsics.EZpvd((Object) this.dataTrackingKey, (Object) miniSupportResponse.dataTrackingKey) && Intrinsics.EZpvd((Object) this.description, (Object) miniSupportResponse.description) && Intrinsics.EZpvd((Object) this.iconBright, (Object) miniSupportResponse.iconBright) && Intrinsics.EZpvd((Object) this.iconDark, (Object) miniSupportResponse.iconDark) && Intrinsics.EZpvd((Object) this.id, (Object) miniSupportResponse.id) && Intrinsics.EZpvd((Object) this.slug, (Object) miniSupportResponse.slug) && Intrinsics.EZpvd(this.tags, miniSupportResponse.tags) && Intrinsics.EZpvd((Object) this.title, (Object) miniSupportResponse.title);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDataTrackingKey() {
        return this.dataTrackingKey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDescription() {
        return this.description;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getIconBright() {
        return this.iconBright;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getIconDark() {
        return this.iconDark;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getId() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSlug() {
        return this.slug;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> getTags() {
        return this.tags;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTitle() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((this.dataTrackingKey.hashCode() * 31) + this.description.hashCode()) * 31) + this.iconBright.hashCode()) * 31) + this.iconDark.hashCode()) * 31) + this.id.hashCode()) * 31) + this.slug.hashCode()) * 31) + this.tags.hashCode()) * 31) + this.title.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "MiniSupportResponse(dataTrackingKey=" + this.dataTrackingKey + ", description=" + this.description + ", iconBright=" + this.iconBright + ", iconDark=" + this.iconDark + ", id=" + this.id + ", slug=" + this.slug + ", tags=" + this.tags + ", title=" + this.title + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okex.center.bean.MiniSupportResponse.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<MiniSupportResponse> serializer() {
            return MiniSupportResponse$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ MiniSupportResponse(int i, String str, String str2, String str3, String str4, String str5, String str6, List list, String str7, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.dataTrackingKey = "";
        } else {
            this.dataTrackingKey = str;
        }
        if ((i & 2) == 0) {
            this.description = "";
        } else {
            this.description = str2;
        }
        if ((i & 4) == 0) {
            this.iconBright = "";
        } else {
            this.iconBright = str3;
        }
        if ((i & 8) == 0) {
            this.iconDark = "";
        } else {
            this.iconDark = str4;
        }
        if ((i & 16) == 0) {
            this.id = "";
        } else {
            this.id = str5;
        }
        if ((i & 32) == 0) {
            this.slug = "";
        } else {
            this.slug = str6;
        }
        if ((i & 64) == 0) {
            this.tags = yDY.AhwBna();
        } else {
            this.tags = list;
        }
        if ((i & 128) == 0) {
            this.title = "";
        } else {
            this.title = str7;
        }
    }

    public static final /* synthetic */ void write$Self$OKSupport_support_impl(MiniSupportResponse miniSupportResponse, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) miniSupportResponse.dataTrackingKey, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, miniSupportResponse.dataTrackingKey);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) miniSupportResponse.description, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, miniSupportResponse.description);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) miniSupportResponse.iconBright, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, miniSupportResponse.iconBright);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) miniSupportResponse.iconDark, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, miniSupportResponse.iconDark);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) miniSupportResponse.id, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, miniSupportResponse.id);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) miniSupportResponse.slug, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, miniSupportResponse.slug);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd(miniSupportResponse.tags, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 6, kSerializerArr[6], miniSupportResponse.tags);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) && Intrinsics.EZpvd((Object) miniSupportResponse.title, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 7, miniSupportResponse.title);
    }

    public MiniSupportResponse(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull List<String> list, @NotNull String str7) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str7, "");
        this.dataTrackingKey = str;
        this.description = str2;
        this.iconBright = str3;
        this.iconDark = str4;
        this.id = str5;
        this.slug = str6;
        this.tags = list;
        this.title = str7;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x004c: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r18v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r10v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r18v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r11v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0012: ARITH (r18v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r12v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0019: ARITH (r18v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r13v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0020: ARITH (r18v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r14v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0027: ARITH (r18v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r15v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x002e: ARITH (r18v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0032: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:34)) : (r16v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0039: ARITH (r18v0 int) & (128 int) A[WRAPPED]) == (0 int)) ? (r17v0 java.lang.String) : (""))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List<java.lang.String>, java.lang.String):void (m)] (LINE:27) call: com.okinc.okex.center.bean.MiniSupportResponse.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, java.lang.String):void type: THIS */
    public /* synthetic */ MiniSupportResponse(String str, String str2, String str3, String str4, String str5, String str6, List list, String str7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? yDY.AhwBna() : list, (i & 128) == 0 ? str7 : "");
    }
}
