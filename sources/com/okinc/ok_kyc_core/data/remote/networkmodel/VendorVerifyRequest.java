package com.okinc.ok_kyc_core.data.remote.networkmodel;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.ok_kyc_core.common.Constant;
import com.okinc.ok_kyc_core.service.EopImageInfo;
import com.okinc.ok_kyc_core.service.EopImageInfo$$serializer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.HashMapSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Serializable
public final class VendorVerifyRequest implements Parcelable {
    private static final KSerializer<Object>[] $childSerializers;
    private final long bizId;
    private final Map<String, String> ctaValue;
    private final String featureUri;
    private final ArrayList<EopImageInfo> imageFiles;
    private final HashMap<String, String> params;
    private final String playbook;
    private final String resultId;
    private final String resultTarget;
    private final String sessionId;
    private final Integer vendorType;
    private final Integer verifyType;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<VendorVerifyRequest> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<VendorVerifyRequest> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final VendorVerifyRequest createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            long j = parcel.readLong();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(EopImageInfo.CREATOR.createFromParcel(parcel));
            }
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer numValueOf2 = parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null;
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            int i3 = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(i3);
            for (int i4 = 0; i4 != i3; i4++) {
                linkedHashMap.put(parcel.readString(), parcel.readString());
            }
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            int i5 = parcel.readInt();
            HashMap map = new HashMap(i5);
            for (int i6 = 0; i6 != i5; i6++) {
                map.put(parcel.readString(), parcel.readString());
            }
            return new VendorVerifyRequest(j, arrayList, numValueOf, numValueOf2, string, string2, string3, linkedHashMap, string4, string5, map);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final VendorVerifyRequest[] newArray(int i) {
            return new VendorVerifyRequest[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component1() {
        return this.bizId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.featureUri;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final HashMap<String, String> component11() {
        return this.params;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<EopImageInfo> component2() {
        return this.imageFiles;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component3() {
        return this.vendorType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component4() {
        return this.verifyType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.sessionId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.resultId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.resultTarget;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Map<String, String> component8() {
        return this.ctaValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.playbook;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final VendorVerifyRequest copy(long j, @NotNull ArrayList<EopImageInfo> arrayList, Integer num, Integer num2, String str, @NotNull String str2, @NotNull String str3, @NotNull Map<String, String> map, @NotNull String str4, @NotNull String str5, @NotNull HashMap<String, String> map2) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(map2, "");
        return new VendorVerifyRequest(j, arrayList, num, num2, str, str2, str3, map, str4, str5, map2);
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
        if (!(obj instanceof VendorVerifyRequest)) {
            return false;
        }
        VendorVerifyRequest vendorVerifyRequest = (VendorVerifyRequest) obj;
        return this.bizId == vendorVerifyRequest.bizId && Intrinsics.EZpvd(this.imageFiles, vendorVerifyRequest.imageFiles) && Intrinsics.EZpvd(this.vendorType, vendorVerifyRequest.vendorType) && Intrinsics.EZpvd(this.verifyType, vendorVerifyRequest.verifyType) && Intrinsics.EZpvd((Object) this.sessionId, (Object) vendorVerifyRequest.sessionId) && Intrinsics.EZpvd((Object) this.resultId, (Object) vendorVerifyRequest.resultId) && Intrinsics.EZpvd((Object) this.resultTarget, (Object) vendorVerifyRequest.resultTarget) && Intrinsics.EZpvd(this.ctaValue, vendorVerifyRequest.ctaValue) && Intrinsics.EZpvd((Object) this.playbook, (Object) vendorVerifyRequest.playbook) && Intrinsics.EZpvd((Object) this.featureUri, (Object) vendorVerifyRequest.featureUri) && Intrinsics.EZpvd(this.params, vendorVerifyRequest.params);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getBizId() {
        return this.bizId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Map<String, String> getCtaValue() {
        return this.ctaValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFeatureUri() {
        return this.featureUri;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<EopImageInfo> getImageFiles() {
        return this.imageFiles;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final HashMap<String, String> getParams() {
        return this.params;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPlaybook() {
        return this.playbook;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getResultId() {
        return this.resultId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getResultTarget() {
        return this.resultTarget;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSessionId() {
        return this.sessionId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getVendorType() {
        return this.vendorType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getVerifyType() {
        return this.verifyType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = Long.hashCode(this.bizId);
        int iHashCode2 = this.imageFiles.hashCode();
        Integer num = this.vendorType;
        int iHashCode3 = num == null ? 0 : num.hashCode();
        Integer num2 = this.verifyType;
        int iHashCode4 = num2 == null ? 0 : num2.hashCode();
        String str = this.sessionId;
        return (((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (str != null ? str.hashCode() : 0)) * 31) + this.resultId.hashCode()) * 31) + this.resultTarget.hashCode()) * 31) + this.ctaValue.hashCode()) * 31) + this.playbook.hashCode()) * 31) + this.featureUri.hashCode()) * 31) + this.params.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "VendorVerifyRequest(bizId=" + this.bizId + ", imageFiles=" + this.imageFiles + ", vendorType=" + this.vendorType + ", verifyType=" + this.verifyType + ", sessionId=" + this.sessionId + ", resultId=" + this.resultId + ", resultTarget=" + this.resultTarget + ", ctaValue=" + this.ctaValue + ", playbook=" + this.playbook + ", featureUri=" + this.featureUri + ", params=" + this.params + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeLong(this.bizId);
        ArrayList<EopImageInfo> arrayList = this.imageFiles;
        parcel.writeInt(arrayList.size());
        Iterator<EopImageInfo> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
        Integer num = this.vendorType;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        Integer num2 = this.verifyType;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        parcel.writeString(this.sessionId);
        parcel.writeString(this.resultId);
        parcel.writeString(this.resultTarget);
        Map<String, String> map = this.ctaValue;
        parcel.writeInt(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            parcel.writeString(entry.getKey());
            parcel.writeString(entry.getValue());
        }
        parcel.writeString(this.playbook);
        parcel.writeString(this.featureUri);
        HashMap<String, String> map2 = this.params;
        parcel.writeInt(map2.size());
        for (Map.Entry<String, String> entry2 : map2.entrySet()) {
            parcel.writeString(entry2.getKey());
            parcel.writeString(entry2.getValue());
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.ok_kyc_core.data.remote.networkmodel.VendorVerifyRequest.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<VendorVerifyRequest> serializer() {
            return VendorVerifyRequest$$serializer.INSTANCE;
        }
    }

    static {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        $childSerializers = new KSerializer[]{null, new ArrayListSerializer(EopImageInfo$$serializer.INSTANCE), null, null, null, null, null, new LinkedHashMapSerializer(stringSerializer, stringSerializer), null, null, new HashMapSerializer(stringSerializer, stringSerializer)};
    }

    public /* synthetic */ VendorVerifyRequest(int i, long j, ArrayList arrayList, Integer num, Integer num2, String str, String str2, String str3, Map map, String str4, String str5, HashMap map2, SerializationConstructorMarker serializationConstructorMarker) {
        if (2016 != (i & 2016)) {
            PluginExceptionsKt.throwMissingFieldException(i, 2016, VendorVerifyRequest$$serializer.INSTANCE.getDescriptor());
        }
        this.bizId = (i & 1) == 0 ? -1L : j;
        if ((i & 2) == 0) {
            this.imageFiles = new ArrayList<>();
        } else {
            this.imageFiles = arrayList;
        }
        if ((i & 4) == 0) {
            this.vendorType = Integer.valueOf(Constant.VendorType.EOP.getVendorType());
        } else {
            this.vendorType = num;
        }
        if ((i & 8) == 0) {
            this.verifyType = 1;
        } else {
            this.verifyType = num2;
        }
        if ((i & 16) == 0) {
            this.sessionId = "";
        } else {
            this.sessionId = str;
        }
        this.resultId = str2;
        this.resultTarget = str3;
        this.ctaValue = map;
        this.playbook = str4;
        this.featureUri = str5;
        this.params = map2;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void write$Self$OKCompliance_ok_compliance_impl(VendorVerifyRequest vendorVerifyRequest, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        Integer num;
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || vendorVerifyRequest.bizId != -1) {
            compositeEncoder.encodeLongElement(serialDescriptor, 0, vendorVerifyRequest.bizId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd(vendorVerifyRequest.imageFiles, new ArrayList())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], vendorVerifyRequest.imageFiles);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2)) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, IntSerializer.INSTANCE, vendorVerifyRequest.vendorType);
        } else {
            Integer num2 = vendorVerifyRequest.vendorType;
            int vendorType = Constant.VendorType.EOP.getVendorType();
            if (num2 == null || num2.intValue() != vendorType) {
            }
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || (num = vendorVerifyRequest.verifyType) == null || num.intValue() != 1) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, IntSerializer.INSTANCE, vendorVerifyRequest.verifyType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) vendorVerifyRequest.sessionId, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, vendorVerifyRequest.sessionId);
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 5, vendorVerifyRequest.resultId);
        compositeEncoder.encodeStringElement(serialDescriptor, 6, vendorVerifyRequest.resultTarget);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 7, kSerializerArr[7], vendorVerifyRequest.ctaValue);
        compositeEncoder.encodeStringElement(serialDescriptor, 8, vendorVerifyRequest.playbook);
        compositeEncoder.encodeStringElement(serialDescriptor, 9, vendorVerifyRequest.featureUri);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 10, kSerializerArr[10], vendorVerifyRequest.params);
    }

    public VendorVerifyRequest(long j, @NotNull ArrayList<EopImageInfo> arrayList, Integer num, Integer num2, String str, @NotNull String str2, @NotNull String str3, @NotNull Map<String, String> map, @NotNull String str4, @NotNull String str5, @NotNull HashMap<String, String> map2) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(map2, "");
        this.bizId = j;
        this.imageFiles = arrayList;
        this.vendorType = num;
        this.verifyType = num2;
        this.sessionId = str;
        this.resultId = str2;
        this.resultTarget = str3;
        this.ctaValue = map;
        this.playbook = str4;
        this.featureUri = str5;
        this.params = map2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x004d: CONSTRUCTOR 
  (wrap:long:?: TERNARY null = ((wrap:int:0x0000: ARITH (r28v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (-1 long) : (r16v0 long))
  (wrap:java.util.ArrayList:?: TERNARY null = ((wrap:int:0x000a: ARITH (r28v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0013: CONSTRUCTOR  A[MD:():void (c), WRAPPED] (LINE:16) call: java.util.ArrayList.<init>():void type: CONSTRUCTOR) : (r18v0 java.util.ArrayList))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0017: ARITH (r28v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0025: INVOKE 
  (wrap:int:0x001d: INVOKE 
  (wrap:com.okinc.ok_kyc_core.common.Constant$VendorType:0x001b: SGET  A[WRAPPED] (LINE:17) com.okinc.ok_kyc_core.common.Constant.VendorType.EOP com.okinc.ok_kyc_core.common.Constant$VendorType)
 VIRTUAL call: com.okinc.ok_kyc_core.common.Constant.VendorType.getVendorType():int A[MD:():int (m), WRAPPED] (LINE:17))
 STATIC call: java.lang.Integer.valueOf(int):java.lang.Integer A[MD:(int):java.lang.Integer (c), WRAPPED] (LINE:17)) : (r19v0 java.lang.Integer))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0029: ARITH (r28v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (1 int) : (r20v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0036: ARITH (r28v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r21v0 java.lang.String))
  (r22v0 java.lang.String)
  (r23v0 java.lang.String)
  (r24v0 java.util.Map)
  (r25v0 java.lang.String)
  (r26v0 java.lang.String)
  (r27v0 java.util.HashMap)
 A[MD:(long, java.util.ArrayList<com.okinc.ok_kyc_core.service.EopImageInfo>, java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.util.Map<java.lang.String, java.lang.String>, java.lang.String, java.lang.String, java.util.HashMap<java.lang.String, java.lang.String>):void (m)] (LINE:14) call: com.okinc.ok_kyc_core.data.remote.networkmodel.VendorVerifyRequest.<init>(long, java.util.ArrayList, java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.util.Map, java.lang.String, java.lang.String, java.util.HashMap):void type: THIS */
    public /* synthetic */ VendorVerifyRequest(long j, ArrayList arrayList, Integer num, Integer num2, String str, String str2, String str3, Map map, String str4, String str5, HashMap map2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? -1L : j, (i & 2) != 0 ? new ArrayList() : arrayList, (i & 4) != 0 ? Integer.valueOf(Constant.VendorType.EOP.getVendorType()) : num, (i & 8) != 0 ? 1 : num2, (i & 16) != 0 ? "" : str, str2, str3, map, str4, str5, map2);
    }
}
