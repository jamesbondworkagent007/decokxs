package com.okinc.tradingbot.impl.dto;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: loaded from: classes11.dex */
@Serializable
public final class ContentItem {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    public final String message;
    public final String subTitle;
    public final String type;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ContentItem() {
        this((String) null, (String) null, (String) null, 7, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ ContentItem copy$default(ContentItem contentItem, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = contentItem.subTitle;
        }
        if ((i & 2) != 0) {
            str2 = contentItem.message;
        }
        if ((i & 4) != 0) {
            str3 = contentItem.type;
        }
        return contentItem.EZpvd(str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AEQbTJ() {
        return this.message;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ContentItem EZpvd(String str, String str2, String str3) {
        return new ContentItem(str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ContentItem)) {
            return false;
        }
        ContentItem contentItem = (ContentItem) obj;
        return Intrinsics.EZpvd((Object) this.subTitle, (Object) contentItem.subTitle) && Intrinsics.EZpvd((Object) this.message, (Object) contentItem.message) && Intrinsics.EZpvd((Object) this.type, (Object) contentItem.type);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.subTitle;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.message;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.type;
        return (((iHashCode * 31) + iHashCode2) * 31) + (str3 != null ? str3.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ContentItem(subTitle=" + this.subTitle + ", message=" + this.message + ", type=" + this.type + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.tradingbot.impl.dto.ContentItem.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ContentItem> serializer() {
            return ContentItem$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ContentItem(int i, String str, String str2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.subTitle = null;
        } else {
            this.subTitle = str;
        }
        if ((i & 2) == 0) {
            this.message = null;
        } else {
            this.message = str2;
        }
        if ((i & 4) == 0) {
            this.type = null;
        } else {
            this.type = str3;
        }
    }

    public static final /* synthetic */ void KWHzl(ContentItem contentItem, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || contentItem.subTitle != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, contentItem.subTitle);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || contentItem.message != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, contentItem.message);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && contentItem.type == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, contentItem.type);
    }

    public ContentItem(String str, String str2, String str3) {
        this.subTitle = str;
        this.message = str2;
        this.type = str3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r3v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r4v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:32) call: com.okinc.tradingbot.impl.dto.ContentItem.<init>(java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ ContentItem(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
    }
}
