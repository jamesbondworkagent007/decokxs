package com.okinc.crcore.coreapi.net.responsebean.dex;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Serializable
public final class TagDetail {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String tagExt;
    private final String tagType;
    private final String tagValue;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TagDetail() {
        this((String) null, (String) null, (String) null, 7, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ TagDetail copy$default(TagDetail tagDetail, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = tagDetail.tagExt;
        }
        if ((i & 2) != 0) {
            str2 = tagDetail.tagType;
        }
        if ((i & 4) != 0) {
            str3 = tagDetail.tagValue;
        }
        return tagDetail.copy(str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.tagExt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.tagType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.tagValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TagDetail copy(String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new TagDetail(str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TagDetail)) {
            return false;
        }
        TagDetail tagDetail = (TagDetail) obj;
        return Intrinsics.EZpvd((Object) this.tagExt, (Object) tagDetail.tagExt) && Intrinsics.EZpvd((Object) this.tagType, (Object) tagDetail.tagType) && Intrinsics.EZpvd((Object) this.tagValue, (Object) tagDetail.tagValue);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTagExt() {
        return this.tagExt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTagType() {
        return this.tagType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTagValue() {
        return this.tagValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.tagExt;
        return ((((str == null ? 0 : str.hashCode()) * 31) + this.tagType.hashCode()) * 31) + this.tagValue.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TagDetail(tagExt=" + this.tagExt + ", tagType=" + this.tagType + ", tagValue=" + this.tagValue + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.crcore.coreapi.net.responsebean.dex.TagDetail.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<TagDetail> serializer() {
            return TagDetail$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ TagDetail(int i, String str, String str2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        this.tagExt = (i & 1) == 0 ? null : str;
        if ((i & 2) == 0) {
            this.tagType = "";
        } else {
            this.tagType = str2;
        }
        if ((i & 4) == 0) {
            this.tagValue = "";
        } else {
            this.tagValue = str3;
        }
    }

    public static final /* synthetic */ void write$Self$OKCRCore_cr_core(TagDetail tagDetail, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || tagDetail.tagExt != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, tagDetail.tagExt);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) tagDetail.tagType, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, tagDetail.tagType);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && Intrinsics.EZpvd((Object) tagDetail.tagValue, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 2, tagDetail.tagValue);
    }

    public TagDetail(String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.tagExt = str;
        this.tagType = str2;
        this.tagValue = str3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0011: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0005: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r4v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:121) call: com.okinc.crcore.coreapi.net.responsebean.dex.TagDetail.<init>(java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ TagDetail(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3);
    }
}
