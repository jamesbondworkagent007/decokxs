package com.okinc.ok_kyc_core.data.remote.networkmodel;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Serializable
public final class AssetDetailData implements Parcelable {
    private final String assetValue;
    private final ArrayList<String> contentList;
    private final CTAButton editCta;
    private final String id;
    private final String status;
    private final String title;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<AssetDetailData> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, new ArrayListSerializer(StringSerializer.INSTANCE)};

    public static final class Creator implements Parcelable.Creator<AssetDetailData> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AssetDetailData createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new AssetDetailData(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : CTAButton.CREATOR.createFromParcel(parcel), parcel.createStringArrayList());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AssetDetailData[] newArray(int i) {
            return new AssetDetailData[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public AssetDetailData() {
        this((String) null, (String) null, (String) null, (String) null, (CTAButton) null, (ArrayList) null, 63, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: com.okinc.ok_kyc_core.data.remote.networkmodel.AssetDetailData */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AssetDetailData copy$default(AssetDetailData assetDetailData, String str, String str2, String str3, String str4, CTAButton cTAButton, ArrayList arrayList, int i, Object obj) {
        if ((i & 1) != 0) {
            str = assetDetailData.id;
        }
        if ((i & 2) != 0) {
            str2 = assetDetailData.status;
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            str3 = assetDetailData.title;
        }
        String str6 = str3;
        if ((i & 8) != 0) {
            str4 = assetDetailData.assetValue;
        }
        String str7 = str4;
        if ((i & 16) != 0) {
            cTAButton = assetDetailData.editCta;
        }
        CTAButton cTAButton2 = cTAButton;
        if ((i & 32) != 0) {
            arrayList = assetDetailData.contentList;
        }
        return assetDetailData.copy(str, str5, str6, str7, cTAButton2, arrayList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.assetValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CTAButton component5() {
        return this.editCta;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<String> component6() {
        return this.contentList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AssetDetailData copy(String str, String str2, String str3, String str4, CTAButton cTAButton, ArrayList<String> arrayList) {
        return new AssetDetailData(str, str2, str3, str4, cTAButton, arrayList);
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
        if (!(obj instanceof AssetDetailData)) {
            return false;
        }
        AssetDetailData assetDetailData = (AssetDetailData) obj;
        return Intrinsics.EZpvd((Object) this.id, (Object) assetDetailData.id) && Intrinsics.EZpvd((Object) this.status, (Object) assetDetailData.status) && Intrinsics.EZpvd((Object) this.title, (Object) assetDetailData.title) && Intrinsics.EZpvd((Object) this.assetValue, (Object) assetDetailData.assetValue) && Intrinsics.EZpvd(this.editCta, assetDetailData.editCta) && Intrinsics.EZpvd(this.contentList, assetDetailData.contentList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAssetValue() {
        return this.assetValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<String> getContentList() {
        return this.contentList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CTAButton getEditCta() {
        return this.editCta;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getId() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getStatus() {
        return this.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTitle() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.id;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.status;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.title;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.assetValue;
        int iHashCode4 = str4 == null ? 0 : str4.hashCode();
        CTAButton cTAButton = this.editCta;
        int iHashCode5 = cTAButton == null ? 0 : cTAButton.hashCode();
        ArrayList<String> arrayList = this.contentList;
        return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (arrayList != null ? arrayList.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "AssetDetailData(id=" + this.id + ", status=" + this.status + ", title=" + this.title + ", assetValue=" + this.assetValue + ", editCta=" + this.editCta + ", contentList=" + this.contentList + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.id);
        parcel.writeString(this.status);
        parcel.writeString(this.title);
        parcel.writeString(this.assetValue);
        CTAButton cTAButton = this.editCta;
        if (cTAButton == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            cTAButton.writeToParcel(parcel, i);
        }
        parcel.writeStringList(this.contentList);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.ok_kyc_core.data.remote.networkmodel.AssetDetailData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<AssetDetailData> serializer() {
            return AssetDetailData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ AssetDetailData(int i, String str, String str2, String str3, String str4, CTAButton cTAButton, ArrayList arrayList, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.id = "";
        } else {
            this.id = str;
        }
        if ((i & 2) == 0) {
            this.status = "";
        } else {
            this.status = str2;
        }
        if ((i & 4) == 0) {
            this.title = "";
        } else {
            this.title = str3;
        }
        if ((i & 8) == 0) {
            this.assetValue = "";
        } else {
            this.assetValue = str4;
        }
        if ((i & 16) == 0) {
            this.editCta = null;
        } else {
            this.editCta = cTAButton;
        }
        if ((i & 32) == 0) {
            this.contentList = null;
        } else {
            this.contentList = arrayList;
        }
    }

    public static final /* synthetic */ void write$Self$OKCompliance_ok_compliance_impl(AssetDetailData assetDetailData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) assetDetailData.id, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, assetDetailData.id);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) assetDetailData.status, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, assetDetailData.status);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) assetDetailData.title, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, assetDetailData.title);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) assetDetailData.assetValue, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, assetDetailData.assetValue);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || assetDetailData.editCta != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, CTAButton$$serializer.INSTANCE, assetDetailData.editCta);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) && assetDetailData.contentList == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, kSerializerArr[5], assetDetailData.contentList);
    }

    public AssetDetailData(String str, String str2, String str3, String str4, CTAButton cTAButton, ArrayList<String> arrayList) {
        this.id = str;
        this.status = str2;
        this.title = str3;
        this.assetValue = str4;
        this.editCta = cTAButton;
        this.contentList = arrayList;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0032: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r11v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r5v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0009: ARITH (r11v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r6v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0010: ARITH (r11v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r7v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0017: ARITH (r11v0 int) & (8 int) A[WRAPPED]) == (0 int)) ? (r8v0 java.lang.String) : (""))
  (wrap:com.okinc.ok_kyc_core.data.remote.networkmodel.CTAButton:?: TERNARY null = ((wrap:int:0x001d: ARITH (r11v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.ok_kyc_core.data.remote.networkmodel.CTAButton) : (r9v0 com.okinc.ok_kyc_core.data.remote.networkmodel.CTAButton))
  (wrap:java.util.ArrayList:?: TERNARY null = ((wrap:int:0x0025: ARITH (r11v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.util.ArrayList) : (r10v0 java.util.ArrayList))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.ok_kyc_core.data.remote.networkmodel.CTAButton, java.util.ArrayList<java.lang.String>):void (m)] (LINE:2655) call: com.okinc.ok_kyc_core.data.remote.networkmodel.AssetDetailData.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.ok_kyc_core.data.remote.networkmodel.CTAButton, java.util.ArrayList):void type: THIS */
    public /* synthetic */ AssetDetailData(String str, String str2, String str3, String str4, CTAButton cTAButton, ArrayList arrayList, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) == 0 ? str4 : "", (i & 16) != 0 ? null : cTAButton, (i & 32) != 0 ? null : arrayList);
    }
}
