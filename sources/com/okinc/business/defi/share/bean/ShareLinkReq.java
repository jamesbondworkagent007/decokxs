package com.okinc.business.defi.share.bean;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import o.C56424yEw;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Serializable
public final class ShareLinkReq implements Parcelable, java.io.Serializable {
    private static final KSerializer<Object>[] $childSerializers;
    private String deepLink;
    private final String modelId;
    private final Map<String, String> pathParams;
    private String webUrl;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<ShareLinkReq> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<ShareLinkReq> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ShareLinkReq createFromParcel(Parcel parcel) {
            LinkedHashMap linkedHashMap;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int i = parcel.readInt();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(i);
                for (int i2 = 0; i2 != i; i2++) {
                    linkedHashMap2.put(parcel.readString(), parcel.readString());
                }
                linkedHashMap = linkedHashMap2;
            }
            return new ShareLinkReq(string, linkedHashMap, parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ShareLinkReq[] newArray(int i) {
            return new ShareLinkReq[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ShareLinkReq() {
        this((String) null, (Map) null, (String) null, (String) null, 15, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.defi.share.bean.ShareLinkReq */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ShareLinkReq copy$default(ShareLinkReq shareLinkReq, String str, Map map, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = shareLinkReq.modelId;
        }
        if ((i & 2) != 0) {
            map = shareLinkReq.pathParams;
        }
        if ((i & 4) != 0) {
            str2 = shareLinkReq.webUrl;
        }
        if ((i & 8) != 0) {
            str3 = shareLinkReq.deepLink;
        }
        return shareLinkReq.copy(str, map, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.modelId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Map<String, String> component2() {
        return this.pathParams;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.webUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.deepLink;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ShareLinkReq copy(String str, Map<String, String> map, String str2, String str3) {
        return new ShareLinkReq(str, map, str2, str3);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShareLinkReq)) {
            return false;
        }
        ShareLinkReq shareLinkReq = (ShareLinkReq) obj;
        return Intrinsics.EZpvd((Object) this.modelId, (Object) shareLinkReq.modelId) && Intrinsics.EZpvd(this.pathParams, shareLinkReq.pathParams) && Intrinsics.EZpvd((Object) this.webUrl, (Object) shareLinkReq.webUrl) && Intrinsics.EZpvd((Object) this.deepLink, (Object) shareLinkReq.deepLink);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDeepLink() {
        return this.deepLink;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getModelId() {
        return this.modelId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Map<String, String> getPathParams() {
        return this.pathParams;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getWebUrl() {
        return this.webUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.modelId;
        int iHashCode = str == null ? 0 : str.hashCode();
        Map<String, String> map = this.pathParams;
        int iHashCode2 = map == null ? 0 : map.hashCode();
        String str2 = this.webUrl;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.deepLink;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (str3 != null ? str3.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDeepLink(String str) {
        this.deepLink = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setWebUrl(String str) {
        this.webUrl = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ShareLinkReq(modelId=" + this.modelId + ", pathParams=" + this.pathParams + ", webUrl=" + this.webUrl + ", deepLink=" + this.deepLink + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.modelId);
        Map<String, String> map = this.pathParams;
        if (map == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(map.size());
            for (Map.Entry<String, String> entry : map.entrySet()) {
                parcel.writeString(entry.getKey());
                parcel.writeString(entry.getValue());
            }
        }
        parcel.writeString(this.webUrl);
        parcel.writeString(this.deepLink);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.share.bean.ShareLinkReq.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ShareLinkReq> serializer() {
            return ShareLinkReq$$serializer.INSTANCE;
        }
    }

    static {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        $childSerializers = new KSerializer[]{null, new LinkedHashMapSerializer(stringSerializer, stringSerializer), null, null};
    }

    public /* synthetic */ ShareLinkReq(int i, String str, Map map, String str2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.modelId = null;
        } else {
            this.modelId = str;
        }
        if ((i & 2) == 0) {
            this.pathParams = C56424yEw.KWHzl();
        } else {
            this.pathParams = map;
        }
        if ((i & 4) == 0) {
            this.webUrl = null;
        } else {
            this.webUrl = str2;
        }
        if ((i & 8) == 0) {
            this.deepLink = null;
        } else {
            this.deepLink = str3;
        }
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(ShareLinkReq shareLinkReq, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || shareLinkReq.modelId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, shareLinkReq.modelId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd(shareLinkReq.pathParams, C56424yEw.KWHzl())) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, kSerializerArr[1], shareLinkReq.pathParams);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || shareLinkReq.webUrl != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, shareLinkReq.webUrl);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) && shareLinkReq.deepLink == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, shareLinkReq.deepLink);
    }

    public ShareLinkReq(String str, Map<String, String> map, String str2, String str3) {
        this.modelId = str;
        this.pathParams = map;
        this.webUrl = str2;
        this.deepLink = str3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0018: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
  (wrap:java.util.Map:?: TERNARY null = ((wrap:int:0x0006: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.Map:0x000a: INVOKE  STATIC call: o.yEw.KWHzl():java.util.Map A[MD:<K, V>:():java.util.Map<K, V> (m), WRAPPED] (LINE:13)) : (r3v0 java.util.Map))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000e: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r4v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0013: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r5v0 java.lang.String))
 A[MD:(java.lang.String, java.util.Map<java.lang.String, java.lang.String>, java.lang.String, java.lang.String):void (m)] (LINE:11) call: com.okinc.business.defi.share.bean.ShareLinkReq.<init>(java.lang.String, java.util.Map, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ ShareLinkReq(String str, Map map, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? C56424yEw.KWHzl() : map, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3);
    }
}
