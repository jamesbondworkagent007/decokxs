package com.okinc.okimcore.model.im.inhouseim.ws;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementKt;
import kotlinx.serialization.json.JsonElementSerializer;
import kotlinx.serialization.json.JsonPrimitive;
import o.C33129mqd;
import o.C56424yEw;
import o.sFC;

/* JADX INFO: loaded from: classes10.dex */
@Serializable
public final class SiteMeta {
    public final String description;
    public final JsonElement extra;
    public final String image;
    public final String link;
    public final String tagline;
    public final String title;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public SiteMeta() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (JsonElement) null, 63, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ SiteMeta copy$default(SiteMeta siteMeta, String str, String str2, String str3, String str4, String str5, JsonElement jsonElement, int i, Object obj) {
        if ((i & 1) != 0) {
            str = siteMeta.image;
        }
        if ((i & 2) != 0) {
            str2 = siteMeta.tagline;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = siteMeta.title;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = siteMeta.description;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            str5 = siteMeta.link;
        }
        String str9 = str5;
        if ((i & 32) != 0) {
            jsonElement = siteMeta.extra;
        }
        return siteMeta.OLrzqt(str, str6, str7, str8, str9, jsonElement);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AhwBna() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String KWHzl() {
        return this.link;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SiteMeta OLrzqt(String str, String str2, String str3, String str4, String str5, JsonElement jsonElement) {
        return new SiteMeta(str, str2, str3, str4, str5, jsonElement);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String OLrzqt() {
        return this.description;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SiteMeta)) {
            return false;
        }
        SiteMeta siteMeta = (SiteMeta) obj;
        return Intrinsics.EZpvd((Object) this.image, (Object) siteMeta.image) && Intrinsics.EZpvd((Object) this.tagline, (Object) siteMeta.tagline) && Intrinsics.EZpvd((Object) this.title, (Object) siteMeta.title) && Intrinsics.EZpvd((Object) this.description, (Object) siteMeta.description) && Intrinsics.EZpvd((Object) this.link, (Object) siteMeta.link) && Intrinsics.EZpvd(this.extra, siteMeta.extra);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.image;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.tagline;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.title;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.description;
        int iHashCode4 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.link;
        int iHashCode5 = str5 == null ? 0 : str5.hashCode();
        JsonElement jsonElement = this.extra;
        return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (jsonElement != null ? jsonElement.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SiteMeta(image=" + this.image + ", tagline=" + this.tagline + ", title=" + this.title + ", description=" + this.description + ", link=" + this.link + ", extra=" + this.extra + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String valueOf() {
        return this.tagline;
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okimcore.model.im.inhouseim.ws.SiteMeta.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<SiteMeta> serializer() {
            return SiteMeta$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ SiteMeta(int i, String str, String str2, String str3, String str4, String str5, JsonElement jsonElement, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.image = null;
        } else {
            this.image = str;
        }
        if ((i & 2) == 0) {
            this.tagline = null;
        } else {
            this.tagline = str2;
        }
        if ((i & 4) == 0) {
            this.title = null;
        } else {
            this.title = str3;
        }
        if ((i & 8) == 0) {
            this.description = null;
        } else {
            this.description = str4;
        }
        if ((i & 16) == 0) {
            this.link = null;
        } else {
            this.link = str5;
        }
        if ((i & 32) == 0) {
            this.extra = null;
        } else {
            this.extra = jsonElement;
        }
    }

    public static final /* synthetic */ void AEQbTJ(SiteMeta siteMeta, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || siteMeta.image != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, siteMeta.image);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || siteMeta.tagline != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, siteMeta.tagline);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || siteMeta.title != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, siteMeta.title);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || siteMeta.description != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, siteMeta.description);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || siteMeta.link != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, siteMeta.link);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) && siteMeta.extra == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, JsonElementSerializer.INSTANCE, siteMeta.extra);
    }

    public SiteMeta(String str, String str2, String str3, String str4, String str5, JsonElement jsonElement) {
        this.image = str;
        this.tagline = str2;
        this.title = str3;
        this.description = str4;
        this.link = str5;
        this.extra = jsonElement;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0031: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r12v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r6v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0008: ARITH (r12v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r7v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000f: ARITH (r12v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r8v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0016: ARITH (r12v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r9v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001d: ARITH (r12v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r10v0 java.lang.String))
  (wrap:kotlinx.serialization.json.JsonElement:?: TERNARY null = ((wrap:int:0x0024: ARITH (r12v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null kotlinx.serialization.json.JsonElement) : (r11v0 kotlinx.serialization.json.JsonElement))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, kotlinx.serialization.json.JsonElement):void (m)] (LINE:14) call: com.okinc.okimcore.model.im.inhouseim.ws.SiteMeta.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, kotlinx.serialization.json.JsonElement):void type: THIS */
    public /* synthetic */ SiteMeta(String str, String str2, String str3, String str4, String str5, JsonElement jsonElement, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : jsonElement);
    }

    public final Long copydefault() {
        return OLrzqt(FirebaseAnalytics.Param.START_DATE);
    }

    public final Long AEQbTJ() {
        return OLrzqt(FirebaseAnalytics.Param.END_DATE);
    }

    public final String EZpvd() {
        String str = this.image;
        if (str != null) {
            return sFC.OLrzqt(str);
        }
        return null;
    }

    public final Long OLrzqt(String str) {
        JsonPrimitive jsonPrimitive;
        JsonElement jsonElement = this.extra;
        if (jsonElement != null && (jsonPrimitive = JsonElementKt.getJsonPrimitive(jsonElement)) != null && jsonPrimitive.isString()) {
            try {
                return Long.valueOf(C33129mqd.valueOf(C56424yEw.EZpvd((Map<String, ? extends V>) ((Map<Object, ? extends V>) JsonElementKt.getJsonObject(Json.Default.parseToJsonElement(JsonElementKt.getJsonPrimitive(this.extra).getContent()))), str)));
            } catch (Exception unused) {
            }
        }
        return null;
    }
}
