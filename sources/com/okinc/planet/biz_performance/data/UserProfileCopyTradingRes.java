package com.okinc.planet.biz_performance.data;

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
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Serializable
public final class UserProfileCopyTradingRes implements Parcelable {
    public final String aum;
    public final String botFollowerNum;
    public final String businessType;
    public final String followerLimit;
    public final String followerNum;
    public final String initialDay;
    public final String thirtyHistoryPnl;
    public final List<ChartProfileCopyTrading> thirtyHistoryRates;
    public final String thirtyYieldRate;
    public final String timeSpanDay;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<UserProfileCopyTradingRes> CREATOR = new Creator();
    public static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, null, null, null, null, new ArrayListSerializer(ChartProfileCopyTrading$$serializer.INSTANCE)};

    public static final class Creator implements Parcelable.Creator<UserProfileCopyTradingRes> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final UserProfileCopyTradingRes createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            String string8 = parcel.readString();
            String string9 = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(ChartProfileCopyTrading.CREATOR.createFromParcel(parcel));
            }
            return new UserProfileCopyTradingRes(string, string2, string3, string4, string5, string6, string7, string8, string9, arrayList);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final UserProfileCopyTradingRes[] newArray(int i) {
            return new UserProfileCopyTradingRes[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public UserProfileCopyTradingRes() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, 1023, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AEQbTJ() {
        return this.followerLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AYXKKw() {
        return this.followerNum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AhwBna() {
        return this.thirtyHistoryPnl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String KWHzl() {
        return this.botFollowerNum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String OLrzqt() {
        return this.businessType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final UserProfileCopyTradingRes copydefault(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull List<ChartProfileCopyTrading> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(list, "");
        return new UserProfileCopyTradingRes(str, str2, str3, str4, str5, str6, str7, str8, str9, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String copydefault() {
        return this.aum;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String djBIcL() {
        return this.thirtyYieldRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserProfileCopyTradingRes)) {
            return false;
        }
        UserProfileCopyTradingRes userProfileCopyTradingRes = (UserProfileCopyTradingRes) obj;
        return Intrinsics.EZpvd((Object) this.businessType, (Object) userProfileCopyTradingRes.businessType) && Intrinsics.EZpvd((Object) this.followerNum, (Object) userProfileCopyTradingRes.followerNum) && Intrinsics.EZpvd((Object) this.followerLimit, (Object) userProfileCopyTradingRes.followerLimit) && Intrinsics.EZpvd((Object) this.botFollowerNum, (Object) userProfileCopyTradingRes.botFollowerNum) && Intrinsics.EZpvd((Object) this.aum, (Object) userProfileCopyTradingRes.aum) && Intrinsics.EZpvd((Object) this.timeSpanDay, (Object) userProfileCopyTradingRes.timeSpanDay) && Intrinsics.EZpvd((Object) this.initialDay, (Object) userProfileCopyTradingRes.initialDay) && Intrinsics.EZpvd((Object) this.thirtyYieldRate, (Object) userProfileCopyTradingRes.thirtyYieldRate) && Intrinsics.EZpvd((Object) this.thirtyHistoryPnl, (Object) userProfileCopyTradingRes.thirtyHistoryPnl) && Intrinsics.EZpvd(this.thirtyHistoryRates, userProfileCopyTradingRes.thirtyHistoryRates);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<ChartProfileCopyTrading> gEmmrt() {
        return this.thirtyHistoryRates;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((((((this.businessType.hashCode() * 31) + this.followerNum.hashCode()) * 31) + this.followerLimit.hashCode()) * 31) + this.botFollowerNum.hashCode()) * 31) + this.aum.hashCode()) * 31) + this.timeSpanDay.hashCode()) * 31) + this.initialDay.hashCode()) * 31) + this.thirtyYieldRate.hashCode()) * 31) + this.thirtyHistoryPnl.hashCode()) * 31) + this.thirtyHistoryRates.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String isConnected() {
        return this.timeSpanDay;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "UserProfileCopyTradingRes(businessType=" + this.businessType + ", followerNum=" + this.followerNum + ", followerLimit=" + this.followerLimit + ", botFollowerNum=" + this.botFollowerNum + ", aum=" + this.aum + ", timeSpanDay=" + this.timeSpanDay + ", initialDay=" + this.initialDay + ", thirtyYieldRate=" + this.thirtyYieldRate + ", thirtyHistoryPnl=" + this.thirtyHistoryPnl + ", thirtyHistoryRates=" + this.thirtyHistoryRates + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String valueOf() {
        return this.initialDay;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.businessType);
        parcel.writeString(this.followerNum);
        parcel.writeString(this.followerLimit);
        parcel.writeString(this.botFollowerNum);
        parcel.writeString(this.aum);
        parcel.writeString(this.timeSpanDay);
        parcel.writeString(this.initialDay);
        parcel.writeString(this.thirtyYieldRate);
        parcel.writeString(this.thirtyHistoryPnl);
        List<ChartProfileCopyTrading> list = this.thirtyHistoryRates;
        parcel.writeInt(list.size());
        Iterator<ChartProfileCopyTrading> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.planet.biz_performance.data.UserProfileCopyTradingRes.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<UserProfileCopyTradingRes> serializer() {
            return UserProfileCopyTradingRes$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ UserProfileCopyTradingRes(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, List list, SerializationConstructorMarker serializationConstructorMarker) {
        this.businessType = (i & 1) == 0 ? "SPOT" : str;
        if ((i & 2) == 0) {
            this.followerNum = "";
        } else {
            this.followerNum = str2;
        }
        if ((i & 4) == 0) {
            this.followerLimit = "";
        } else {
            this.followerLimit = str3;
        }
        if ((i & 8) == 0) {
            this.botFollowerNum = "";
        } else {
            this.botFollowerNum = str4;
        }
        if ((i & 16) == 0) {
            this.aum = "";
        } else {
            this.aum = str5;
        }
        if ((i & 32) == 0) {
            this.timeSpanDay = "";
        } else {
            this.timeSpanDay = str6;
        }
        if ((i & 64) == 0) {
            this.initialDay = "";
        } else {
            this.initialDay = str7;
        }
        if ((i & 128) == 0) {
            this.thirtyYieldRate = "";
        } else {
            this.thirtyYieldRate = str8;
        }
        if ((i & 256) == 0) {
            this.thirtyHistoryPnl = "";
        } else {
            this.thirtyHistoryPnl = str9;
        }
        if ((i & 512) == 0) {
            this.thirtyHistoryRates = yDY.AhwBna();
        } else {
            this.thirtyHistoryRates = list;
        }
    }

    public static final /* synthetic */ void KWHzl(UserProfileCopyTradingRes userProfileCopyTradingRes, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) userProfileCopyTradingRes.businessType, (Object) "SPOT")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, userProfileCopyTradingRes.businessType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) userProfileCopyTradingRes.followerNum, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, userProfileCopyTradingRes.followerNum);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) userProfileCopyTradingRes.followerLimit, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, userProfileCopyTradingRes.followerLimit);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) userProfileCopyTradingRes.botFollowerNum, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, userProfileCopyTradingRes.botFollowerNum);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) userProfileCopyTradingRes.aum, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, userProfileCopyTradingRes.aum);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) userProfileCopyTradingRes.timeSpanDay, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, userProfileCopyTradingRes.timeSpanDay);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) userProfileCopyTradingRes.initialDay, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, userProfileCopyTradingRes.initialDay);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) userProfileCopyTradingRes.thirtyYieldRate, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 7, userProfileCopyTradingRes.thirtyYieldRate);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd((Object) userProfileCopyTradingRes.thirtyHistoryPnl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 8, userProfileCopyTradingRes.thirtyHistoryPnl);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) && Intrinsics.EZpvd(userProfileCopyTradingRes.thirtyHistoryRates, yDY.AhwBna())) {
            return;
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 9, kSerializerArr[9], userProfileCopyTradingRes.thirtyHistoryRates);
    }

    public UserProfileCopyTradingRes(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull List<ChartProfileCopyTrading> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.businessType = str;
        this.followerNum = str2;
        this.followerLimit = str3;
        this.botFollowerNum = str4;
        this.aum = str5;
        this.timeSpanDay = str6;
        this.initialDay = str7;
        this.thirtyYieldRate = str8;
        this.thirtyHistoryPnl = str9;
        this.thirtyHistoryRates = list;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0065: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r22v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("SPOT") : (r12v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000a: ARITH (r22v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r13v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0013: ARITH (r22v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r14v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001a: ARITH (r22v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r15v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0021: ARITH (r22v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0029: ARITH (r22v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r17v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0031: ARITH (r22v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r18v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0039: ARITH (r22v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r19v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0041: ARITH (r22v0 int) & (256 int) A[WRAPPED]) == (0 int)) ? (r20v0 java.lang.String) : (""))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0048: ARITH (r22v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x004c: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:25)) : (r21v0 java.util.List))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List<com.okinc.planet.biz_performance.data.ChartProfileCopyTrading>):void (m)] (LINE:15) call: com.okinc.planet.biz_performance.data.UserProfileCopyTradingRes.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List):void type: THIS */
    public /* synthetic */ UserProfileCopyTradingRes(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "SPOT" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7, (i & 128) != 0 ? "" : str8, (i & 256) == 0 ? str9 : "", (i & 512) != 0 ? yDY.AhwBna() : list);
    }
}
