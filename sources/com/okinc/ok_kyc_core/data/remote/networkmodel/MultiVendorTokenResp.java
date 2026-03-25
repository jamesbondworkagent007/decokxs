package com.okinc.ok_kyc_core.data.remote.networkmodel;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.HashMapSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
@Serializable
public final class MultiVendorTokenResp implements Parcelable {
    private static final KSerializer<Object>[] $childSerializers;
    private String datacenter;
    private Boolean enableListener;
    private String mode;
    private HashMap<String, String> params;
    private String redirectUrl;
    private String serverUrl;
    private String sessionId;
    private String token;
    private String url;
    private Boolean useWebview;
    private Integer vendorType;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<MultiVendorTokenResp> CREATOR = new Creator();

    /* JADX INFO: loaded from: classes19.dex */
    public static final class Creator implements Parcelable.Creator<MultiVendorTokenResp> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MultiVendorTokenResp createFromParcel(Parcel parcel) {
            HashMap map;
            Intrinsics.checkNotNullParameter(parcel, "");
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            if (parcel.readInt() == 0) {
                map = null;
            } else {
                int i = parcel.readInt();
                map = new HashMap(i);
                for (int i2 = 0; i2 != i; i2++) {
                    map.put(parcel.readString(), parcel.readString());
                }
            }
            return new MultiVendorTokenResp(numValueOf, string, string2, string3, string4, string5, string6, map, parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0), parcel.readInt() != 0 ? Boolean.valueOf(parcel.readInt() != 0) : null, parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MultiVendorTokenResp[] newArray(int i) {
            return new MultiVendorTokenResp[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public MultiVendorTokenResp() {
        this((Integer) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (HashMap) null, (Boolean) null, (Boolean) null, (String) null, 2047, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component1() {
        return this.vendorType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component10() {
        return this.enableListener;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.datacenter;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.token;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.serverUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.sessionId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.mode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.url;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.redirectUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final HashMap<String, String> component8() {
        return this.params;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component9() {
        return this.useWebview;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MultiVendorTokenResp copy(Integer num, String str, String str2, String str3, String str4, String str5, String str6, HashMap<String, String> map, Boolean bool, Boolean bool2, String str7) {
        return new MultiVendorTokenResp(num, str, str2, str3, str4, str5, str6, map, bool, bool2, str7);
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
        if (!(obj instanceof MultiVendorTokenResp)) {
            return false;
        }
        MultiVendorTokenResp multiVendorTokenResp = (MultiVendorTokenResp) obj;
        return Intrinsics.EZpvd(this.vendorType, multiVendorTokenResp.vendorType) && Intrinsics.EZpvd((Object) this.token, (Object) multiVendorTokenResp.token) && Intrinsics.EZpvd((Object) this.serverUrl, (Object) multiVendorTokenResp.serverUrl) && Intrinsics.EZpvd((Object) this.sessionId, (Object) multiVendorTokenResp.sessionId) && Intrinsics.EZpvd((Object) this.mode, (Object) multiVendorTokenResp.mode) && Intrinsics.EZpvd((Object) this.url, (Object) multiVendorTokenResp.url) && Intrinsics.EZpvd((Object) this.redirectUrl, (Object) multiVendorTokenResp.redirectUrl) && Intrinsics.EZpvd(this.params, multiVendorTokenResp.params) && Intrinsics.EZpvd(this.useWebview, multiVendorTokenResp.useWebview) && Intrinsics.EZpvd(this.enableListener, multiVendorTokenResp.enableListener) && Intrinsics.EZpvd((Object) this.datacenter, (Object) multiVendorTokenResp.datacenter);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDatacenter() {
        return this.datacenter;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getEnableListener() {
        return this.enableListener;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMode() {
        return this.mode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final HashMap<String, String> getParams() {
        return this.params;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRedirectUrl() {
        return this.redirectUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getServerUrl() {
        return this.serverUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSessionId() {
        return this.sessionId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getToken() {
        return this.token;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUrl() {
        return this.url;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getUseWebview() {
        return this.useWebview;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getVendorType() {
        return this.vendorType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        Integer num = this.vendorType;
        int iHashCode = num == null ? 0 : num.hashCode();
        String str = this.token;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.serverUrl;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.sessionId;
        int iHashCode4 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.mode;
        int iHashCode5 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.url;
        int iHashCode6 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.redirectUrl;
        int iHashCode7 = str6 == null ? 0 : str6.hashCode();
        HashMap<String, String> map = this.params;
        int iHashCode8 = map == null ? 0 : map.hashCode();
        Boolean bool = this.useWebview;
        int iHashCode9 = bool == null ? 0 : bool.hashCode();
        Boolean bool2 = this.enableListener;
        int iHashCode10 = bool2 == null ? 0 : bool2.hashCode();
        String str7 = this.datacenter;
        return (((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + (str7 != null ? str7.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDatacenter(String str) {
        this.datacenter = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setEnableListener(Boolean bool) {
        this.enableListener = bool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMode(String str) {
        this.mode = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setParams(HashMap<String, String> map) {
        this.params = map;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRedirectUrl(String str) {
        this.redirectUrl = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setServerUrl(String str) {
        this.serverUrl = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSessionId(String str) {
        this.sessionId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setToken(String str) {
        this.token = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setUrl(String str) {
        this.url = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setUseWebview(Boolean bool) {
        this.useWebview = bool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setVendorType(Integer num) {
        this.vendorType = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "MultiVendorTokenResp(vendorType=" + this.vendorType + ", token=" + this.token + ", serverUrl=" + this.serverUrl + ", sessionId=" + this.sessionId + ", mode=" + this.mode + ", url=" + this.url + ", redirectUrl=" + this.redirectUrl + ", params=" + this.params + ", useWebview=" + this.useWebview + ", enableListener=" + this.enableListener + ", datacenter=" + this.datacenter + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        Integer num = this.vendorType;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        parcel.writeString(this.token);
        parcel.writeString(this.serverUrl);
        parcel.writeString(this.sessionId);
        parcel.writeString(this.mode);
        parcel.writeString(this.url);
        parcel.writeString(this.redirectUrl);
        HashMap<String, String> map = this.params;
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
        Boolean bool = this.useWebview;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        Boolean bool2 = this.enableListener;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool2.booleanValue() ? 1 : 0);
        }
        parcel.writeString(this.datacenter);
    }

    /* JADX INFO: loaded from: classes19.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.ok_kyc_core.data.remote.networkmodel.MultiVendorTokenResp.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<MultiVendorTokenResp> serializer() {
            return MultiVendorTokenResp$$serializer.INSTANCE;
        }
    }

    static {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        $childSerializers = new KSerializer[]{null, null, null, null, null, null, null, new HashMapSerializer(stringSerializer, BuiltinSerializersKt.getNullable(stringSerializer)), null, null, null};
    }

    public /* synthetic */ MultiVendorTokenResp(int i, Integer num, String str, String str2, String str3, String str4, String str5, String str6, HashMap map, Boolean bool, Boolean bool2, String str7, SerializationConstructorMarker serializationConstructorMarker) {
        this.vendorType = (i & 1) == 0 ? 99 : num;
        if ((i & 2) == 0) {
            this.token = "";
        } else {
            this.token = str;
        }
        if ((i & 4) == 0) {
            this.serverUrl = "";
        } else {
            this.serverUrl = str2;
        }
        if ((i & 8) == 0) {
            this.sessionId = "";
        } else {
            this.sessionId = str3;
        }
        if ((i & 16) == 0) {
            this.mode = "sdk";
        } else {
            this.mode = str4;
        }
        if ((i & 32) == 0) {
            this.url = "";
        } else {
            this.url = str5;
        }
        if ((i & 64) == 0) {
            this.redirectUrl = "";
        } else {
            this.redirectUrl = str6;
        }
        if ((i & 128) == 0) {
            this.params = new HashMap<>();
        } else {
            this.params = map;
        }
        if ((i & 256) == 0) {
            this.useWebview = Boolean.FALSE;
        } else {
            this.useWebview = bool;
        }
        if ((i & 512) == 0) {
            this.enableListener = Boolean.FALSE;
        } else {
            this.enableListener = bool2;
        }
        if ((i & 1024) == 0) {
            this.datacenter = "US";
        } else {
            this.datacenter = str7;
        }
    }

    public static final /* synthetic */ void write$Self$OKCompliance_ok_compliance_impl(MultiVendorTokenResp multiVendorTokenResp, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        Integer num;
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || (num = multiVendorTokenResp.vendorType) == null || num.intValue() != 99) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, IntSerializer.INSTANCE, multiVendorTokenResp.vendorType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) multiVendorTokenResp.token, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, multiVendorTokenResp.token);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) multiVendorTokenResp.serverUrl, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, multiVendorTokenResp.serverUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) multiVendorTokenResp.sessionId, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, multiVendorTokenResp.sessionId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) multiVendorTokenResp.mode, (Object) "sdk")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, multiVendorTokenResp.mode);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) multiVendorTokenResp.url, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, multiVendorTokenResp.url);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) multiVendorTokenResp.redirectUrl, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, multiVendorTokenResp.redirectUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd(multiVendorTokenResp.params, new HashMap())) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, kSerializerArr[7], multiVendorTokenResp.params);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd(multiVendorTokenResp.useWebview, Boolean.FALSE)) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, BooleanSerializer.INSTANCE, multiVendorTokenResp.useWebview);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || !Intrinsics.EZpvd(multiVendorTokenResp.enableListener, Boolean.FALSE)) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, BooleanSerializer.INSTANCE, multiVendorTokenResp.enableListener);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) && Intrinsics.EZpvd((Object) multiVendorTokenResp.datacenter, (Object) "US")) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, StringSerializer.INSTANCE, multiVendorTokenResp.datacenter);
    }

    public MultiVendorTokenResp(Integer num, String str, String str2, String str3, String str4, String str5, String str6, HashMap<String, String> map, Boolean bool, Boolean bool2, String str7) {
        this.vendorType = num;
        this.token = str;
        this.serverUrl = str2;
        this.sessionId = str3;
        this.mode = str4;
        this.url = str5;
        this.redirectUrl = str6;
        this.params = map;
        this.useWebview = bool;
        this.enableListener = bool2;
        this.datacenter = str7;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0078: CONSTRUCTOR 
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0002: ARITH (r23v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (99 int) : (r12v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000e: ARITH (r23v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r13v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0017: ARITH (r23v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r14v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001e: ARITH (r23v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r15v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0025: ARITH (r23v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("sdk") : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002e: ARITH (r23v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r17v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0036: ARITH (r23v0 int) & (64 int) A[WRAPPED]) == (0 int)) ? (r18v0 java.lang.String) : (""))
  (wrap:java.util.HashMap:?: TERNARY null = ((wrap:int:0x003d: ARITH (r23v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0043: CONSTRUCTOR  A[MD:():void (c), WRAPPED] (LINE:22) call: java.util.HashMap.<init>():void type: CONSTRUCTOR) : (r19v0 java.util.HashMap))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0049: ARITH (r23v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x004d: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r20v0 java.lang.Boolean))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0052: ARITH (r23v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0056: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r21v0 java.lang.Boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x005b: ARITH (r23v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? ("US") : (r22v0 java.lang.String))
 A[MD:(java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.HashMap<java.lang.String, java.lang.String>, java.lang.Boolean, java.lang.Boolean, java.lang.String):void (m)] (LINE:12) call: com.okinc.ok_kyc_core.data.remote.networkmodel.MultiVendorTokenResp.<init>(java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.HashMap, java.lang.Boolean, java.lang.Boolean, java.lang.String):void type: THIS */
    public /* synthetic */ MultiVendorTokenResp(Integer num, String str, String str2, String str3, String str4, String str5, String str6, HashMap map, Boolean bool, Boolean bool2, String str7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 99 : num, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? "sdk" : str4, (i & 32) != 0 ? "" : str5, (i & 64) == 0 ? str6 : "", (i & 128) != 0 ? new HashMap() : map, (i & 256) != 0 ? Boolean.FALSE : bool, (i & 512) != 0 ? Boolean.FALSE : bool2, (i & 1024) != 0 ? "US" : str7);
    }
}
