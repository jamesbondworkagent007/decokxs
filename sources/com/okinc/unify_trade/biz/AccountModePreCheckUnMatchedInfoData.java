package com.okinc.unify_trade.biz;

import android.os.Parcel;
import android.os.Parcelable;
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
import o.C33129mqd;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes24.dex */
@Serializable
public final class AccountModePreCheckUnMatchedInfoData implements Parcelable {
    private final String assetRequirement;
    private final String orderSize;
    private final List<String> posList;
    private final String stgySize;
    private final String totalAsset;
    private final String type;
    private final String typeGroup;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<AccountModePreCheckUnMatchedInfoData> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, new ArrayListSerializer(StringSerializer.INSTANCE), null};

    public static final class Creator implements Parcelable.Creator<AccountModePreCheckUnMatchedInfoData> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AccountModePreCheckUnMatchedInfoData createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new AccountModePreCheckUnMatchedInfoData(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.createStringArrayList(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AccountModePreCheckUnMatchedInfoData[] newArray(int i) {
            return new AccountModePreCheckUnMatchedInfoData[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public AccountModePreCheckUnMatchedInfoData() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (List) null, (String) null, 127, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: com.okinc.unify_trade.biz.AccountModePreCheckUnMatchedInfoData */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AccountModePreCheckUnMatchedInfoData copy$default(AccountModePreCheckUnMatchedInfoData accountModePreCheckUnMatchedInfoData, String str, String str2, String str3, String str4, String str5, List list, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = accountModePreCheckUnMatchedInfoData.typeGroup;
        }
        if ((i & 2) != 0) {
            str2 = accountModePreCheckUnMatchedInfoData.type;
        }
        String str7 = str2;
        if ((i & 4) != 0) {
            str3 = accountModePreCheckUnMatchedInfoData.totalAsset;
        }
        String str8 = str3;
        if ((i & 8) != 0) {
            str4 = accountModePreCheckUnMatchedInfoData.orderSize;
        }
        String str9 = str4;
        if ((i & 16) != 0) {
            str5 = accountModePreCheckUnMatchedInfoData.stgySize;
        }
        String str10 = str5;
        if ((i & 32) != 0) {
            list = accountModePreCheckUnMatchedInfoData.posList;
        }
        List list2 = list;
        if ((i & 64) != 0) {
            str6 = accountModePreCheckUnMatchedInfoData.assetRequirement;
        }
        return accountModePreCheckUnMatchedInfoData.copy(str, str7, str8, str9, str10, list2, str6);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.typeGroup;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.totalAsset;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.orderSize;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.stgySize;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component6() {
        return this.posList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.assetRequirement;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AccountModePreCheckUnMatchedInfoData copy(@NotNull String str, String str2, String str3, String str4, String str5, List<String> list, String str6) {
        Intrinsics.checkNotNullParameter(str, "");
        return new AccountModePreCheckUnMatchedInfoData(str, str2, str3, str4, str5, list, str6);
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
        if (!(obj instanceof AccountModePreCheckUnMatchedInfoData)) {
            return false;
        }
        AccountModePreCheckUnMatchedInfoData accountModePreCheckUnMatchedInfoData = (AccountModePreCheckUnMatchedInfoData) obj;
        return Intrinsics.EZpvd((Object) this.typeGroup, (Object) accountModePreCheckUnMatchedInfoData.typeGroup) && Intrinsics.EZpvd((Object) this.type, (Object) accountModePreCheckUnMatchedInfoData.type) && Intrinsics.EZpvd((Object) this.totalAsset, (Object) accountModePreCheckUnMatchedInfoData.totalAsset) && Intrinsics.EZpvd((Object) this.orderSize, (Object) accountModePreCheckUnMatchedInfoData.orderSize) && Intrinsics.EZpvd((Object) this.stgySize, (Object) accountModePreCheckUnMatchedInfoData.stgySize) && Intrinsics.EZpvd(this.posList, accountModePreCheckUnMatchedInfoData.posList) && Intrinsics.EZpvd((Object) this.assetRequirement, (Object) accountModePreCheckUnMatchedInfoData.assetRequirement);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAssetRequirement() {
        return this.assetRequirement;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: getOrderSize, reason: collision with other method in class */
    public final String m7126getOrderSize() {
        return this.orderSize;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> getPosList() {
        return this.posList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: getStgySize, reason: collision with other method in class */
    public final String m7127getStgySize() {
        return this.stgySize;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTotalAsset() {
        return this.totalAsset;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getType() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTypeGroup() {
        return this.typeGroup;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.typeGroup.hashCode();
        String str = this.type;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.totalAsset;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.orderSize;
        int iHashCode4 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.stgySize;
        int iHashCode5 = str4 == null ? 0 : str4.hashCode();
        List<String> list = this.posList;
        int iHashCode6 = list == null ? 0 : list.hashCode();
        String str5 = this.assetRequirement;
        return (((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + (str5 != null ? str5.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "AccountModePreCheckUnMatchedInfoData(typeGroup=" + this.typeGroup + ", type=" + this.type + ", totalAsset=" + this.totalAsset + ", orderSize=" + this.orderSize + ", stgySize=" + this.stgySize + ", posList=" + this.posList + ", assetRequirement=" + this.assetRequirement + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.typeGroup);
        parcel.writeString(this.type);
        parcel.writeString(this.totalAsset);
        parcel.writeString(this.orderSize);
        parcel.writeString(this.stgySize);
        parcel.writeStringList(this.posList);
        parcel.writeString(this.assetRequirement);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.AccountModePreCheckUnMatchedInfoData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<AccountModePreCheckUnMatchedInfoData> serializer() {
            return AccountModePreCheckUnMatchedInfoData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ AccountModePreCheckUnMatchedInfoData(int i, String str, String str2, String str3, String str4, String str5, List list, String str6, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.typeGroup = "";
        } else {
            this.typeGroup = str;
        }
        if ((i & 2) == 0) {
            this.type = "";
        } else {
            this.type = str2;
        }
        if ((i & 4) == 0) {
            this.totalAsset = "";
        } else {
            this.totalAsset = str3;
        }
        if ((i & 8) == 0) {
            this.orderSize = "";
        } else {
            this.orderSize = str4;
        }
        if ((i & 16) == 0) {
            this.stgySize = "";
        } else {
            this.stgySize = str5;
        }
        if ((i & 32) == 0) {
            this.posList = null;
        } else {
            this.posList = list;
        }
        if ((i & 64) == 0) {
            this.assetRequirement = null;
        } else {
            this.assetRequirement = str6;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(AccountModePreCheckUnMatchedInfoData accountModePreCheckUnMatchedInfoData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) accountModePreCheckUnMatchedInfoData.typeGroup, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, accountModePreCheckUnMatchedInfoData.typeGroup);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) accountModePreCheckUnMatchedInfoData.type, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, accountModePreCheckUnMatchedInfoData.type);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) accountModePreCheckUnMatchedInfoData.totalAsset, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, accountModePreCheckUnMatchedInfoData.totalAsset);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) accountModePreCheckUnMatchedInfoData.orderSize, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, accountModePreCheckUnMatchedInfoData.orderSize);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) accountModePreCheckUnMatchedInfoData.stgySize, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, accountModePreCheckUnMatchedInfoData.stgySize);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || accountModePreCheckUnMatchedInfoData.posList != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, kSerializerArr[5], accountModePreCheckUnMatchedInfoData.posList);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) && accountModePreCheckUnMatchedInfoData.assetRequirement == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, accountModePreCheckUnMatchedInfoData.assetRequirement);
    }

    public AccountModePreCheckUnMatchedInfoData(@NotNull String str, String str2, String str3, String str4, String str5, List<String> list, String str6) {
        Intrinsics.checkNotNullParameter(str, "");
        this.typeGroup = str;
        this.type = str2;
        this.totalAsset = str3;
        this.orderSize = str4;
        this.stgySize = str5;
        this.posList = list;
        this.assetRequirement = str6;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x003a: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r13v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r6v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0009: ARITH (r13v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r7v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0010: ARITH (r13v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r8v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0017: ARITH (r13v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r9v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001e: ARITH (r13v0 int) & (16 int) A[WRAPPED]) == (0 int)) ? (r10v0 java.lang.String) : (""))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0024: ARITH (r13v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r11v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002c: ARITH (r13v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r12v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List<java.lang.String>, java.lang.String):void (m)] (LINE:4729) call: com.okinc.unify_trade.biz.AccountModePreCheckUnMatchedInfoData.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, java.lang.String):void type: THIS */
    public /* synthetic */ AccountModePreCheckUnMatchedInfoData(String str, String str2, String str3, String str4, String str5, List list, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) == 0 ? str5 : "", (i & 32) != 0 ? null : list, (i & 64) != 0 ? null : str6);
    }

    public final int getOrderSize() {
        return C33129mqd.AhwBna(this.orderSize);
    }

    public final int getStgySize() {
        return C33129mqd.AhwBna(this.stgySize);
    }

    public final int getPosListSize() {
        List<String> list = this.posList;
        if (list != null) {
            return list.size();
        }
        return 0;
    }
}
