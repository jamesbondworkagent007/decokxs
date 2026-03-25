package com.okinc.unify_trade.biz;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
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

/* JADX INFO: loaded from: classes19.dex */
@Serializable
public final class MpStgyDetail implements Parcelable {
    private String avatar;
    private String cTime;
    private ArrayList<String> ccy;
    private String followerAssets;
    private String followerAssetsCcy;
    private String followerCount;
    private boolean isUserFavourite;
    private String maxDrawdown;
    private String pTime;
    private String pnlRatio;
    private ArrayList<StrategyProfitResponse> profitHistory;
    private ArrayList<ProfitTimeRangeItem> profitTimeRange;
    private String traderUniqueName;
    private String username;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<MpStgyDetail> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, null, new ArrayListSerializer(StringSerializer.INSTANCE), null, new ArrayListSerializer(StrategyProfitResponse$$serializer.INSTANCE), new ArrayListSerializer(ProfitTimeRangeItem$$serializer.INSTANCE), null, null, null, null};

    public static final class Creator implements Parcelable.Creator<MpStgyDetail> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MpStgyDetail createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
            boolean z = parcel.readInt() != 0;
            ArrayList arrayList2 = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(StrategyProfitResponse.CREATOR.createFromParcel(parcel));
                }
            }
            if (parcel.readInt() != 0) {
                int i3 = parcel.readInt();
                arrayList2 = new ArrayList(i3);
                for (int i4 = 0; i4 != i3; i4++) {
                    arrayList2.add(ProfitTimeRangeItem.CREATOR.createFromParcel(parcel));
                }
            }
            return new MpStgyDetail(string, string2, string3, string4, string5, string6, arrayListCreateStringArrayList, z, arrayList, arrayList2, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MpStgyDetail[] newArray(int i) {
            return new MpStgyDetail[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public MpStgyDetail() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (ArrayList) null, false, (ArrayList) null, (ArrayList) null, (String) null, (String) null, (String) null, (String) null, 16383, (DefaultConstructorMarker) null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAvatar() {
        return this.avatar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCTime() {
        return this.cTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<String> getCcy() {
        return this.ccy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFollowerAssets() {
        return this.followerAssets;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFollowerAssetsCcy() {
        return this.followerAssetsCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFollowerCount() {
        return this.followerCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMaxDrawdown() {
        return this.maxDrawdown;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPTime() {
        return this.pTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPnlRatio() {
        return this.pnlRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<StrategyProfitResponse> getProfitHistory() {
        return this.profitHistory;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<ProfitTimeRangeItem> getProfitTimeRange() {
        return this.profitTimeRange;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTraderUniqueName() {
        return this.traderUniqueName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUsername() {
        return this.username;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isUserFavourite() {
        return this.isUserFavourite;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAvatar(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.avatar = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCTime(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.cTime = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCcy(@NotNull ArrayList<String> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        this.ccy = arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFollowerAssets(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.followerAssets = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFollowerAssetsCcy(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.followerAssetsCcy = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFollowerCount(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.followerCount = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMaxDrawdown(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.maxDrawdown = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPTime(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.pTime = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPnlRatio(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.pnlRatio = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setProfitHistory(ArrayList<StrategyProfitResponse> arrayList) {
        this.profitHistory = arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setProfitTimeRange(ArrayList<ProfitTimeRangeItem> arrayList) {
        this.profitTimeRange = arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTraderUniqueName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.traderUniqueName = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setUserFavourite(boolean z) {
        this.isUserFavourite = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setUsername(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.username = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.pnlRatio);
        parcel.writeString(this.maxDrawdown);
        parcel.writeString(this.username);
        parcel.writeString(this.followerCount);
        parcel.writeString(this.followerAssets);
        parcel.writeString(this.followerAssetsCcy);
        parcel.writeStringList(this.ccy);
        parcel.writeInt(this.isUserFavourite ? 1 : 0);
        ArrayList<StrategyProfitResponse> arrayList = this.profitHistory;
        if (arrayList == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(arrayList.size());
            Iterator<StrategyProfitResponse> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(parcel, i);
            }
        }
        ArrayList<ProfitTimeRangeItem> arrayList2 = this.profitTimeRange;
        if (arrayList2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(arrayList2.size());
            Iterator<ProfitTimeRangeItem> it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                it2.next().writeToParcel(parcel, i);
            }
        }
        parcel.writeString(this.traderUniqueName);
        parcel.writeString(this.cTime);
        parcel.writeString(this.pTime);
        parcel.writeString(this.avatar);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.MpStgyDetail.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<MpStgyDetail> serializer() {
            return MpStgyDetail$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ MpStgyDetail(int i, String str, String str2, String str3, String str4, String str5, String str6, ArrayList arrayList, boolean z, ArrayList arrayList2, ArrayList arrayList3, String str7, String str8, String str9, String str10, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.pnlRatio = "";
        } else {
            this.pnlRatio = str;
        }
        if ((i & 2) == 0) {
            this.maxDrawdown = "";
        } else {
            this.maxDrawdown = str2;
        }
        if ((i & 4) == 0) {
            this.username = "";
        } else {
            this.username = str3;
        }
        if ((i & 8) == 0) {
            this.followerCount = "";
        } else {
            this.followerCount = str4;
        }
        if ((i & 16) == 0) {
            this.followerAssets = "";
        } else {
            this.followerAssets = str5;
        }
        if ((i & 32) == 0) {
            this.followerAssetsCcy = "";
        } else {
            this.followerAssetsCcy = str6;
        }
        this.ccy = (i & 64) == 0 ? new ArrayList() : arrayList;
        this.isUserFavourite = (i & 128) == 0 ? false : z;
        if ((i & 256) == 0) {
            this.profitHistory = null;
        } else {
            this.profitHistory = arrayList2;
        }
        if ((i & 512) == 0) {
            this.profitTimeRange = null;
        } else {
            this.profitTimeRange = arrayList3;
        }
        if ((i & 1024) == 0) {
            this.traderUniqueName = "";
        } else {
            this.traderUniqueName = str7;
        }
        if ((i & 2048) == 0) {
            this.cTime = "";
        } else {
            this.cTime = str8;
        }
        if ((i & 4096) == 0) {
            this.pTime = "";
        } else {
            this.pTime = str9;
        }
        if ((i & 8192) == 0) {
            this.avatar = "";
        } else {
            this.avatar = str10;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(MpStgyDetail mpStgyDetail, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) mpStgyDetail.pnlRatio, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, mpStgyDetail.pnlRatio);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) mpStgyDetail.maxDrawdown, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, mpStgyDetail.maxDrawdown);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) mpStgyDetail.username, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, mpStgyDetail.username);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) mpStgyDetail.followerCount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, mpStgyDetail.followerCount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) mpStgyDetail.followerAssets, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, mpStgyDetail.followerAssets);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) mpStgyDetail.followerAssetsCcy, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, mpStgyDetail.followerAssetsCcy);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd(mpStgyDetail.ccy, new ArrayList())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 6, kSerializerArr[6], mpStgyDetail.ccy);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || mpStgyDetail.isUserFavourite) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 7, mpStgyDetail.isUserFavourite);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || mpStgyDetail.profitHistory != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, kSerializerArr[8], mpStgyDetail.profitHistory);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || mpStgyDetail.profitTimeRange != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, kSerializerArr[9], mpStgyDetail.profitTimeRange);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || !Intrinsics.EZpvd((Object) mpStgyDetail.traderUniqueName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 10, mpStgyDetail.traderUniqueName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || !Intrinsics.EZpvd((Object) mpStgyDetail.cTime, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 11, mpStgyDetail.cTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || !Intrinsics.EZpvd((Object) mpStgyDetail.pTime, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 12, mpStgyDetail.pTime);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) && Intrinsics.EZpvd((Object) mpStgyDetail.avatar, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 13, mpStgyDetail.avatar);
    }

    public MpStgyDetail(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull ArrayList<String> arrayList, boolean z, ArrayList<StrategyProfitResponse> arrayList2, ArrayList<ProfitTimeRangeItem> arrayList3, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(arrayList, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        this.pnlRatio = str;
        this.maxDrawdown = str2;
        this.username = str3;
        this.followerCount = str4;
        this.followerAssets = str5;
        this.followerAssetsCcy = str6;
        this.ccy = arrayList;
        this.isUserFavourite = z;
        this.profitHistory = arrayList2;
        this.profitTimeRange = arrayList3;
        this.traderUniqueName = str7;
        this.cTime = str8;
        this.pTime = str9;
        this.avatar = str10;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0095: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r30v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r30v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r17v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0014: ARITH (r30v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r18v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001c: ARITH (r30v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r19v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0024: ARITH (r30v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r20v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002c: ARITH (r30v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r21v0 java.lang.String))
  (wrap:java.util.ArrayList:?: TERNARY null = ((wrap:int:0x0034: ARITH (r30v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x003a: CONSTRUCTOR  A[MD:():void (c), WRAPPED] (LINE:3171) call: java.util.ArrayList.<init>():void type: CONSTRUCTOR) : (r22v0 java.util.ArrayList))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0040: ARITH (r30v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? false : (r23v0 boolean))
  (wrap:java.util.ArrayList:?: TERNARY null = ((wrap:int:0x0048: ARITH (r30v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null java.util.ArrayList) : (r24v0 java.util.ArrayList))
  (wrap:java.util.ArrayList:?: TERNARY null = ((wrap:int:0x0051: ARITH (r30v0 int) & (512 int) A[WRAPPED]) == (0 int)) ? (r25v0 java.util.ArrayList) : (null java.util.ArrayList))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0058: ARITH (r30v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? ("") : (r26v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0060: ARITH (r30v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? ("") : (r27v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0068: ARITH (r30v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? ("") : (r28v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0070: ARITH (r30v0 int) & (8192 int) A[WRAPPED]) == (0 int)) ? (r29v0 java.lang.String) : (""))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.ArrayList<java.lang.String>, boolean, java.util.ArrayList<com.okinc.unify_trade.biz.StrategyProfitResponse>, java.util.ArrayList<com.okinc.unify_trade.biz.ProfitTimeRangeItem>, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:3164) call: com.okinc.unify_trade.biz.MpStgyDetail.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.ArrayList, boolean, java.util.ArrayList, java.util.ArrayList, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ MpStgyDetail(String str, String str2, String str3, String str4, String str5, String str6, ArrayList arrayList, boolean z, ArrayList arrayList2, ArrayList arrayList3, String str7, String str8, String str9, String str10, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? new ArrayList() : arrayList, (i & 128) != 0 ? false : z, (i & 256) != 0 ? null : arrayList2, (i & 512) == 0 ? arrayList3 : null, (i & 1024) != 0 ? "" : str7, (i & 2048) != 0 ? "" : str8, (i & 4096) != 0 ? "" : str9, (i & 8192) == 0 ? str10 : "");
    }
}
