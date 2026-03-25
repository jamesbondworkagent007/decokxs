package com.okinc.ok_kyc_core.data.amani;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.HashMapSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
@Serializable
public final class AmaniVideoCallParams implements Parcelable {
    private static final KSerializer<Object>[] $childSerializers;
    private HashMap<String, String> ctaValue;
    private String id;
    private final String mainServerURL;
    private final String nameSurname;
    private final String password;
    private final String stunServerURL;
    private String target;
    private final String token;
    private final String turnServerURL;
    private final String userName;
    private final String videoCallWaitingInterval;
    private final String videoCallWaitingPeople;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<AmaniVideoCallParams> CREATOR = new Creator();

    /* JADX INFO: loaded from: classes23.dex */
    public static final class Creator implements Parcelable.Creator<AmaniVideoCallParams> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AmaniVideoCallParams createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            int i = parcel.readInt();
            HashMap map = new HashMap(i);
            int i2 = 0;
            while (true) {
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                if (i2 == i) {
                    return new AmaniVideoCallParams(string, string2, map, string3, string4, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
                }
                map.put(string3, string4);
                i2++;
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AmaniVideoCallParams[] newArray(int i) {
            return new AmaniVideoCallParams[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.password;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.videoCallWaitingInterval;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.videoCallWaitingPeople;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.target;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final HashMap<String, String> component3() {
        return this.ctaValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.nameSurname;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.mainServerURL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.stunServerURL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.turnServerURL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.token;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.userName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AmaniVideoCallParams copy(@NotNull String str, @NotNull String str2, @NotNull HashMap<String, String> map, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(str11, "");
        return new AmaniVideoCallParams(str, str2, map, str3, str4, str5, str6, str7, str8, str9, str10, str11);
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
        if (!(obj instanceof AmaniVideoCallParams)) {
            return false;
        }
        AmaniVideoCallParams amaniVideoCallParams = (AmaniVideoCallParams) obj;
        return Intrinsics.EZpvd((Object) this.id, (Object) amaniVideoCallParams.id) && Intrinsics.EZpvd((Object) this.target, (Object) amaniVideoCallParams.target) && Intrinsics.EZpvd(this.ctaValue, amaniVideoCallParams.ctaValue) && Intrinsics.EZpvd((Object) this.nameSurname, (Object) amaniVideoCallParams.nameSurname) && Intrinsics.EZpvd((Object) this.mainServerURL, (Object) amaniVideoCallParams.mainServerURL) && Intrinsics.EZpvd((Object) this.stunServerURL, (Object) amaniVideoCallParams.stunServerURL) && Intrinsics.EZpvd((Object) this.turnServerURL, (Object) amaniVideoCallParams.turnServerURL) && Intrinsics.EZpvd((Object) this.token, (Object) amaniVideoCallParams.token) && Intrinsics.EZpvd((Object) this.userName, (Object) amaniVideoCallParams.userName) && Intrinsics.EZpvd((Object) this.password, (Object) amaniVideoCallParams.password) && Intrinsics.EZpvd((Object) this.videoCallWaitingInterval, (Object) amaniVideoCallParams.videoCallWaitingInterval) && Intrinsics.EZpvd((Object) this.videoCallWaitingPeople, (Object) amaniVideoCallParams.videoCallWaitingPeople);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final HashMap<String, String> getCtaValue() {
        return this.ctaValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getId() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMainServerURL() {
        return this.mainServerURL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNameSurname() {
        return this.nameSurname;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPassword() {
        return this.password;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getStunServerURL() {
        return this.stunServerURL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTarget() {
        return this.target;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getToken() {
        return this.token;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTurnServerURL() {
        return this.turnServerURL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUserName() {
        return this.userName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getVideoCallWaitingInterval() {
        return this.videoCallWaitingInterval;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getVideoCallWaitingPeople() {
        return this.videoCallWaitingPeople;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((((((((((this.id.hashCode() * 31) + this.target.hashCode()) * 31) + this.ctaValue.hashCode()) * 31) + this.nameSurname.hashCode()) * 31) + this.mainServerURL.hashCode()) * 31) + this.stunServerURL.hashCode()) * 31) + this.turnServerURL.hashCode()) * 31) + this.token.hashCode()) * 31) + this.userName.hashCode()) * 31) + this.password.hashCode()) * 31) + this.videoCallWaitingInterval.hashCode()) * 31) + this.videoCallWaitingPeople.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCtaValue(@NotNull HashMap<String, String> map) {
        Intrinsics.checkNotNullParameter(map, "");
        this.ctaValue = map;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.id = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTarget(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.target = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "AmaniVideoCallParams(id=" + this.id + ", target=" + this.target + ", ctaValue=" + this.ctaValue + ", nameSurname=" + this.nameSurname + ", mainServerURL=" + this.mainServerURL + ", stunServerURL=" + this.stunServerURL + ", turnServerURL=" + this.turnServerURL + ", token=" + this.token + ", userName=" + this.userName + ", password=" + this.password + ", videoCallWaitingInterval=" + this.videoCallWaitingInterval + ", videoCallWaitingPeople=" + this.videoCallWaitingPeople + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.id);
        parcel.writeString(this.target);
        HashMap<String, String> map = this.ctaValue;
        parcel.writeInt(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            parcel.writeString(entry.getKey());
            parcel.writeString(entry.getValue());
        }
        parcel.writeString(this.nameSurname);
        parcel.writeString(this.mainServerURL);
        parcel.writeString(this.stunServerURL);
        parcel.writeString(this.turnServerURL);
        parcel.writeString(this.token);
        parcel.writeString(this.userName);
        parcel.writeString(this.password);
        parcel.writeString(this.videoCallWaitingInterval);
        parcel.writeString(this.videoCallWaitingPeople);
    }

    /* JADX INFO: loaded from: classes23.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.ok_kyc_core.data.amani.AmaniVideoCallParams.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<AmaniVideoCallParams> serializer() {
            return AmaniVideoCallParams$$serializer.INSTANCE;
        }
    }

    static {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        $childSerializers = new KSerializer[]{null, null, new HashMapSerializer(stringSerializer, stringSerializer), null, null, null, null, null, null, null, null, null};
    }

    public /* synthetic */ AmaniVideoCallParams(int i, String str, String str2, HashMap map, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i, 7, AmaniVideoCallParams$$serializer.INSTANCE.getDescriptor());
        }
        this.id = str;
        this.target = str2;
        this.ctaValue = map;
        if ((i & 8) == 0) {
            this.nameSurname = "";
        } else {
            this.nameSurname = str3;
        }
        if ((i & 16) == 0) {
            this.mainServerURL = "";
        } else {
            this.mainServerURL = str4;
        }
        if ((i & 32) == 0) {
            this.stunServerURL = "";
        } else {
            this.stunServerURL = str5;
        }
        if ((i & 64) == 0) {
            this.turnServerURL = "";
        } else {
            this.turnServerURL = str6;
        }
        if ((i & 128) == 0) {
            this.token = "";
        } else {
            this.token = str7;
        }
        if ((i & 256) == 0) {
            this.userName = "";
        } else {
            this.userName = str8;
        }
        if ((i & 512) == 0) {
            this.password = "";
        } else {
            this.password = str9;
        }
        if ((i & 1024) == 0) {
            this.videoCallWaitingInterval = "";
        } else {
            this.videoCallWaitingInterval = str10;
        }
        if ((i & 2048) == 0) {
            this.videoCallWaitingPeople = "";
        } else {
            this.videoCallWaitingPeople = str11;
        }
    }

    public static final /* synthetic */ void write$Self$OKCompliance_ok_compliance_impl(AmaniVideoCallParams amaniVideoCallParams, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        compositeEncoder.encodeStringElement(serialDescriptor, 0, amaniVideoCallParams.id);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, amaniVideoCallParams.target);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 2, kSerializerArr[2], amaniVideoCallParams.ctaValue);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) amaniVideoCallParams.nameSurname, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, amaniVideoCallParams.nameSurname);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) amaniVideoCallParams.mainServerURL, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, amaniVideoCallParams.mainServerURL);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) amaniVideoCallParams.stunServerURL, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, amaniVideoCallParams.stunServerURL);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) amaniVideoCallParams.turnServerURL, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, amaniVideoCallParams.turnServerURL);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) amaniVideoCallParams.token, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 7, amaniVideoCallParams.token);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd((Object) amaniVideoCallParams.userName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 8, amaniVideoCallParams.userName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || !Intrinsics.EZpvd((Object) amaniVideoCallParams.password, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 9, amaniVideoCallParams.password);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || !Intrinsics.EZpvd((Object) amaniVideoCallParams.videoCallWaitingInterval, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 10, amaniVideoCallParams.videoCallWaitingInterval);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) && Intrinsics.EZpvd((Object) amaniVideoCallParams.videoCallWaitingPeople, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 11, amaniVideoCallParams.videoCallWaitingPeople);
    }

    public AmaniVideoCallParams(@NotNull String str, @NotNull String str2, @NotNull HashMap<String, String> map, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(str11, "");
        this.id = str;
        this.target = str2;
        this.ctaValue = map;
        this.nameSurname = str3;
        this.mainServerURL = str4;
        this.stunServerURL = str5;
        this.turnServerURL = str6;
        this.token = str7;
        this.userName = str8;
        this.password = str9;
        this.videoCallWaitingInterval = str10;
        this.videoCallWaitingPeople = str11;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0054: CONSTRUCTOR 
  (r17v0 java.lang.String)
  (r18v0 java.lang.String)
  (r19v0 java.util.HashMap)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r29v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r20v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r29v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r21v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0014: ARITH (r29v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r22v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001c: ARITH (r29v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r23v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0024: ARITH (r29v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r24v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002c: ARITH (r29v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r25v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0034: ARITH (r29v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? ("") : (r26v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003c: ARITH (r29v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? ("") : (r27v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0044: ARITH (r29v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? ("") : (r28v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.util.HashMap<java.lang.String, java.lang.String>, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:11) call: com.okinc.ok_kyc_core.data.amani.AmaniVideoCallParams.<init>(java.lang.String, java.lang.String, java.util.HashMap, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ AmaniVideoCallParams(String str, String str2, HashMap map, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, map, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? "" : str4, (i & 32) != 0 ? "" : str5, (i & 64) != 0 ? "" : str6, (i & 128) != 0 ? "" : str7, (i & 256) != 0 ? "" : str8, (i & 512) != 0 ? "" : str9, (i & 1024) != 0 ? "" : str10, (i & 2048) != 0 ? "" : str11);
    }
}
