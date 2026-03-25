package com.okinc.planet.biz_content.leaderboard.bean;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
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
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
@Serializable
public final class Rank implements Parcelable {
    private final String asset;
    private final String authorId;
    private final String nickName;
    private final String pnl;
    private final String pnlRatio;
    private final String portrait;
    private final List<Rate> rates;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<Rank> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, null, new ArrayListSerializer(Rate$$serializer.INSTANCE)};

    public static final class Creator implements Parcelable.Creator<Rank> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Rank createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList2.add(Rate.CREATOR.createFromParcel(parcel));
                }
                arrayList = arrayList2;
            }
            return new Rank(string, string2, string3, string4, string5, string6, arrayList);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Rank[] newArray(int i) {
            return new Rank[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public Rank() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, 127, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: com.okinc.planet.biz_content.leaderboard.bean.Rank */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Rank copy$default(Rank rank, String str, String str2, String str3, String str4, String str5, String str6, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = rank.asset;
        }
        if ((i & 2) != 0) {
            str2 = rank.authorId;
        }
        String str7 = str2;
        if ((i & 4) != 0) {
            str3 = rank.nickName;
        }
        String str8 = str3;
        if ((i & 8) != 0) {
            str4 = rank.pnl;
        }
        String str9 = str4;
        if ((i & 16) != 0) {
            str5 = rank.pnlRatio;
        }
        String str10 = str5;
        if ((i & 32) != 0) {
            str6 = rank.portrait;
        }
        String str11 = str6;
        if ((i & 64) != 0) {
            list = rank.rates;
        }
        return rank.copy(str, str7, str8, str9, str10, str11, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.asset;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.authorId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.nickName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.pnl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.pnlRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.portrait;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Rate> component7() {
        return this.rates;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Rank copy(String str, String str2, String str3, String str4, String str5, String str6, List<Rate> list) {
        return new Rank(str, str2, str3, str4, str5, str6, list);
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
        if (!(obj instanceof Rank)) {
            return false;
        }
        Rank rank = (Rank) obj;
        return Intrinsics.EZpvd((Object) this.asset, (Object) rank.asset) && Intrinsics.EZpvd((Object) this.authorId, (Object) rank.authorId) && Intrinsics.EZpvd((Object) this.nickName, (Object) rank.nickName) && Intrinsics.EZpvd((Object) this.pnl, (Object) rank.pnl) && Intrinsics.EZpvd((Object) this.pnlRatio, (Object) rank.pnlRatio) && Intrinsics.EZpvd((Object) this.portrait, (Object) rank.portrait) && Intrinsics.EZpvd(this.rates, rank.rates);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAsset() {
        return this.asset;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAuthorId() {
        return this.authorId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNickName() {
        return this.nickName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPnl() {
        return this.pnl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPnlRatio() {
        return this.pnlRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPortrait() {
        return this.portrait;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Rate> getRates() {
        return this.rates;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.asset;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.authorId;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.nickName;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.pnl;
        int iHashCode4 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.pnlRatio;
        int iHashCode5 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.portrait;
        int iHashCode6 = str6 == null ? 0 : str6.hashCode();
        List<Rate> list = this.rates;
        return (((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + (list != null ? list.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "Rank(asset=" + this.asset + ", authorId=" + this.authorId + ", nickName=" + this.nickName + ", pnl=" + this.pnl + ", pnlRatio=" + this.pnlRatio + ", portrait=" + this.portrait + ", rates=" + this.rates + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.asset);
        parcel.writeString(this.authorId);
        parcel.writeString(this.nickName);
        parcel.writeString(this.pnl);
        parcel.writeString(this.pnlRatio);
        parcel.writeString(this.portrait);
        List<Rate> list = this.rates;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(list.size());
        Iterator<Rate> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.planet.biz_content.leaderboard.bean.Rank.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<Rank> serializer() {
            return Rank$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ Rank(int i, String str, String str2, String str3, String str4, String str5, String str6, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.asset = null;
        } else {
            this.asset = str;
        }
        if ((i & 2) == 0) {
            this.authorId = null;
        } else {
            this.authorId = str2;
        }
        if ((i & 4) == 0) {
            this.nickName = null;
        } else {
            this.nickName = str3;
        }
        if ((i & 8) == 0) {
            this.pnl = null;
        } else {
            this.pnl = str4;
        }
        if ((i & 16) == 0) {
            this.pnlRatio = null;
        } else {
            this.pnlRatio = str5;
        }
        if ((i & 32) == 0) {
            this.portrait = null;
        } else {
            this.portrait = str6;
        }
        if ((i & 64) == 0) {
            this.rates = null;
        } else {
            this.rates = list;
        }
    }

    public static final /* synthetic */ void write$Self$OKPlanet_ok_feature_planet_impl(Rank rank, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || rank.asset != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, rank.asset);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || rank.authorId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, rank.authorId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || rank.nickName != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, rank.nickName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || rank.pnl != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, rank.pnl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || rank.pnlRatio != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, rank.pnlRatio);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || rank.portrait != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, rank.portrait);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) && rank.rates == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, kSerializerArr[6], rank.rates);
    }

    public Rank(String str, String str2, String str3, String str4, String str5, String str6, List<Rate> list) {
        this.asset = str;
        this.authorId = str2;
        this.nickName = str3;
        this.pnl = str4;
        this.pnlRatio = str5;
        this.portrait = str6;
        this.rates = list;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0039: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r14v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r7v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0008: ARITH (r14v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r8v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000f: ARITH (r14v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r9v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0016: ARITH (r14v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r10v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001d: ARITH (r14v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r11v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0024: ARITH (r14v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r12v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x002b: ARITH (r14v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r13v0 java.util.List))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List<com.okinc.planet.biz_content.leaderboard.bean.Rate>):void (m)] (LINE:21) call: com.okinc.planet.biz_content.leaderboard.bean.Rank.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List):void type: THIS */
    public /* synthetic */ Rank(String str, String str2, String str3, String str4, String str5, String str6, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : list);
    }
}
