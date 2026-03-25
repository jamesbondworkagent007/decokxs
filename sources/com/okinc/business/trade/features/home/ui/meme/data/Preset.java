package com.okinc.business.trade.features.home.ui.meme.data;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public final class Preset implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<Preset> CREATOR = new Creator();
    private final BuySellPresetParam buyPreset;
    private final int id;
    private String name;
    private String presetType;
    private final BuySellPresetParam sellPreset;

    public static final class Creator implements Parcelable.Creator<Preset> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Preset createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            int i = parcel.readInt();
            String string = parcel.readString();
            String string2 = parcel.readString();
            Parcelable.Creator<BuySellPresetParam> creator = BuySellPresetParam.CREATOR;
            return new Preset(i, string, string2, creator.createFromParcel(parcel), creator.createFromParcel(parcel));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Preset[] newArray(int i) {
            return new Preset[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public Preset() {
        this(0, null, null, null, null, 31, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ Preset copy$default(Preset preset, int i, String str, String str2, BuySellPresetParam buySellPresetParam, BuySellPresetParam buySellPresetParam2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = preset.id;
        }
        if ((i2 & 2) != 0) {
            str = preset.name;
        }
        String str3 = str;
        if ((i2 & 4) != 0) {
            str2 = preset.presetType;
        }
        String str4 = str2;
        if ((i2 & 8) != 0) {
            buySellPresetParam = preset.buyPreset;
        }
        BuySellPresetParam buySellPresetParam3 = buySellPresetParam;
        if ((i2 & 16) != 0) {
            buySellPresetParam2 = preset.sellPreset;
        }
        return preset.copy(i, str3, str4, buySellPresetParam3, buySellPresetParam2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component1() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.presetType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BuySellPresetParam component4() {
        return this.buyPreset;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BuySellPresetParam component5() {
        return this.sellPreset;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Preset copy(int i, @NotNull String str, @NotNull String str2, @NotNull BuySellPresetParam buySellPresetParam, @NotNull BuySellPresetParam buySellPresetParam2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(buySellPresetParam, "");
        Intrinsics.checkNotNullParameter(buySellPresetParam2, "");
        return new Preset(i, str, str2, buySellPresetParam, buySellPresetParam2);
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
        if (!(obj instanceof Preset)) {
            return false;
        }
        Preset preset = (Preset) obj;
        return this.id == preset.id && Intrinsics.EZpvd((Object) this.name, (Object) preset.name) && Intrinsics.EZpvd((Object) this.presetType, (Object) preset.presetType) && Intrinsics.EZpvd(this.buyPreset, preset.buyPreset) && Intrinsics.EZpvd(this.sellPreset, preset.sellPreset);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BuySellPresetParam getBuyPreset() {
        return this.buyPreset;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getId() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getName() {
        return this.name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPresetType() {
        return this.presetType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BuySellPresetParam getSellPreset() {
        return this.sellPreset;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((Integer.hashCode(this.id) * 31) + this.name.hashCode()) * 31) + this.presetType.hashCode()) * 31) + this.buyPreset.hashCode()) * 31) + this.sellPreset.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.name = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPresetType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.presetType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "Preset(id=" + this.id + ", name=" + this.name + ", presetType=" + this.presetType + ", buyPreset=" + this.buyPreset + ", sellPreset=" + this.sellPreset + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeInt(this.id);
        parcel.writeString(this.name);
        parcel.writeString(this.presetType);
        this.buyPreset.writeToParcel(parcel, i);
        this.sellPreset.writeToParcel(parcel, i);
    }

    public Preset(int i, @NotNull String str, @NotNull String str2, @NotNull BuySellPresetParam buySellPresetParam, @NotNull BuySellPresetParam buySellPresetParam2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(buySellPresetParam, "");
        Intrinsics.checkNotNullParameter(buySellPresetParam2, "");
        this.id = i;
        this.name = str;
        this.presetType = str2;
        this.buyPreset = buySellPresetParam;
        this.sellPreset = buySellPresetParam2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0053: CONSTRUCTOR 
  (wrap:int:?: TERNARY null = ((wrap:int:0x0000: ARITH (r21v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r16v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0008: ARITH (r21v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r17v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0012: ARITH (r21v0 int) & (4 int) A[WRAPPED]) == (0 int)) ? (r18v0 java.lang.String) : (""))
  (wrap:com.okinc.business.trade.features.home.ui.meme.data.BuySellPresetParam:?: TERNARY null = ((wrap:int:0x0019: ARITH (r21v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x002a: CONSTRUCTOR 
  (0 int)
  (null java.lang.String)
  (0 int)
  (null java.lang.Integer)
  (null java.lang.String)
  (0 int)
  (null java.lang.String)
  (127 int)
  (null kotlin.jvm.internal.DefaultConstructorMarker)
 A[MD:(int, java.lang.String, int, java.lang.Integer, java.lang.String, int, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:62) call: com.okinc.business.trade.features.home.ui.meme.data.BuySellPresetParam.<init>(int, java.lang.String, int, java.lang.Integer, java.lang.String, int, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r19v0 com.okinc.business.trade.features.home.ui.meme.data.BuySellPresetParam))
  (wrap:com.okinc.business.trade.features.home.ui.meme.data.BuySellPresetParam:?: TERNARY null = ((wrap:int:0x0030: ARITH (r21v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0041: CONSTRUCTOR 
  (0 int)
  (null java.lang.String)
  (0 int)
  (null java.lang.Integer)
  (null java.lang.String)
  (0 int)
  (null java.lang.String)
  (127 int)
  (null kotlin.jvm.internal.DefaultConstructorMarker)
 A[MD:(int, java.lang.String, int, java.lang.Integer, java.lang.String, int, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:63) call: com.okinc.business.trade.features.home.ui.meme.data.BuySellPresetParam.<init>(int, java.lang.String, int, java.lang.Integer, java.lang.String, int, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r20v0 com.okinc.business.trade.features.home.ui.meme.data.BuySellPresetParam))
 A[MD:(int, java.lang.String, java.lang.String, com.okinc.business.trade.features.home.ui.meme.data.BuySellPresetParam, com.okinc.business.trade.features.home.ui.meme.data.BuySellPresetParam):void (m)] (LINE:58) call: com.okinc.business.trade.features.home.ui.meme.data.Preset.<init>(int, java.lang.String, java.lang.String, com.okinc.business.trade.features.home.ui.meme.data.BuySellPresetParam, com.okinc.business.trade.features.home.ui.meme.data.BuySellPresetParam):void type: THIS */
    public /* synthetic */ Preset(int i, String str, String str2, BuySellPresetParam buySellPresetParam, BuySellPresetParam buySellPresetParam2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? "" : str, (i2 & 4) == 0 ? str2 : "", (i2 & 8) != 0 ? new BuySellPresetParam(0, null, 0, null, null, 0, null, 127, null) : buySellPresetParam, (i2 & 16) != 0 ? new BuySellPresetParam(0, null, 0, null, null, 0, null, 127, null) : buySellPresetParam2);
    }
}
