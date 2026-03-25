package com.okinc.unify_trade.biz;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes24.dex */
@Serializable
public final class MarginInfoUserLevelItem implements Parcelable {
    private Integer level;
    private String levelName;
    private Boolean userLv;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<MarginInfoUserLevelItem> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<MarginInfoUserLevelItem> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MarginInfoUserLevelItem createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            Boolean boolValueOf = null;
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String string = parcel.readString();
            if (parcel.readInt() != 0) {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new MarginInfoUserLevelItem(numValueOf, string, boolValueOf);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MarginInfoUserLevelItem[] newArray(int i) {
            return new MarginInfoUserLevelItem[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public MarginInfoUserLevelItem() {
        this((Integer) null, (String) null, (Boolean) null, 7, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ MarginInfoUserLevelItem copy$default(MarginInfoUserLevelItem marginInfoUserLevelItem, Integer num, String str, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            num = marginInfoUserLevelItem.level;
        }
        if ((i & 2) != 0) {
            str = marginInfoUserLevelItem.levelName;
        }
        if ((i & 4) != 0) {
            bool = marginInfoUserLevelItem.userLv;
        }
        return marginInfoUserLevelItem.copy(num, str, bool);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component1() {
        return this.level;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.levelName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component3() {
        return this.userLv;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MarginInfoUserLevelItem copy(Integer num, String str, Boolean bool) {
        return new MarginInfoUserLevelItem(num, str, bool);
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
        if (!(obj instanceof MarginInfoUserLevelItem)) {
            return false;
        }
        MarginInfoUserLevelItem marginInfoUserLevelItem = (MarginInfoUserLevelItem) obj;
        return Intrinsics.EZpvd(this.level, marginInfoUserLevelItem.level) && Intrinsics.EZpvd((Object) this.levelName, (Object) marginInfoUserLevelItem.levelName) && Intrinsics.EZpvd(this.userLv, marginInfoUserLevelItem.userLv);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getLevel() {
        return this.level;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLevelName() {
        return this.levelName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getUserLv() {
        return this.userLv;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        Integer num = this.level;
        int iHashCode = num == null ? 0 : num.hashCode();
        String str = this.levelName;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        Boolean bool = this.userLv;
        return (((iHashCode * 31) + iHashCode2) * 31) + (bool != null ? bool.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLevel(Integer num) {
        this.level = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLevelName(String str) {
        this.levelName = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setUserLv(Boolean bool) {
        this.userLv = bool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "MarginInfoUserLevelItem(level=" + this.level + ", levelName=" + this.levelName + ", userLv=" + this.userLv + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        Integer num = this.level;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        parcel.writeString(this.levelName);
        Boolean bool = this.userLv;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.MarginInfoUserLevelItem.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<MarginInfoUserLevelItem> serializer() {
            return MarginInfoUserLevelItem$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ MarginInfoUserLevelItem(int i, Integer num, String str, Boolean bool, SerializationConstructorMarker serializationConstructorMarker) {
        this.level = (i & 1) == 0 ? 0 : num;
        if ((i & 2) == 0) {
            this.levelName = "";
        } else {
            this.levelName = str;
        }
        if ((i & 4) == 0) {
            this.userLv = Boolean.FALSE;
        } else {
            this.userLv = bool;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(MarginInfoUserLevelItem marginInfoUserLevelItem, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        Integer num;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || (num = marginInfoUserLevelItem.level) == null || num.intValue() != 0) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, IntSerializer.INSTANCE, marginInfoUserLevelItem.level);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) marginInfoUserLevelItem.levelName, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, marginInfoUserLevelItem.levelName);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && Intrinsics.EZpvd(marginInfoUserLevelItem.userLv, Boolean.FALSE)) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, BooleanSerializer.INSTANCE, marginInfoUserLevelItem.userLv);
    }

    public MarginInfoUserLevelItem(Integer num, String str, Boolean bool) {
        this.level = num;
        this.levelName = str;
        this.userLv = bool;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0015: CONSTRUCTOR 
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r1v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0009: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x000f: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:java.lang.Boolean:0x0013: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r3v0 java.lang.Boolean))
 A[MD:(java.lang.Integer, java.lang.String, java.lang.Boolean):void (m)] (LINE:3629) call: com.okinc.unify_trade.biz.MarginInfoUserLevelItem.<init>(java.lang.Integer, java.lang.String, java.lang.Boolean):void type: THIS */
    public /* synthetic */ MarginInfoUserLevelItem(Integer num, String str, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0 : num, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? Boolean.FALSE : bool);
    }
}
