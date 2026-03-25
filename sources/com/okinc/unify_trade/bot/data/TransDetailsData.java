package com.okinc.unify_trade.bot.data;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C32113mPz;
import o.C33070mpX;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
public class TransDetailsData implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<TransDetailsData> CREATOR = new Creator();
    private final String after;
    private final String algoId;
    private final String before;
    private final String dealOrdType;
    private final String groupId;
    private final String instId;
    private final ArrayList<TacticsInsideItemData> list;
    private final String orderId;
    private final String orderTag;
    private final boolean showManualTag;
    private final String state;
    private final boolean stateClickable;
    private final int stateColor;
    private final String tbMode;
    private final String time;
    private final String title;
    private final String tradeType;
    private final int tradeTypeTagStyle;

    /* JADX INFO: loaded from: classes19.dex */
    public static final class Creator implements Parcelable.Creator<TransDetailsData> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TransDetailsData createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(TacticsInsideItemData.CREATOR.createFromParcel(parcel));
            }
            return new TransDetailsData(string, string2, string3, arrayList, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TransDetailsData[] newArray(int i) {
            return new TransDetailsData[i];
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAfter() {
        return this.after;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAlgoId() {
        return this.algoId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBefore() {
        return this.before;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDealOrdType() {
        return this.dealOrdType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getGroupId() {
        return this.groupId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInstId() {
        return this.instId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<TacticsInsideItemData> getList() {
        return this.list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOrderId() {
        return this.orderId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOrderTag() {
        return this.orderTag;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getShowManualTag() {
        return this.showManualTag;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getState() {
        return this.state;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getStateClickable() {
        return this.stateClickable;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getStateColor() {
        return this.stateColor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTbMode() {
        return this.tbMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTime() {
        return this.time;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTitle() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTradeType() {
        return this.tradeType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getTradeTypeTagStyle() {
        return this.tradeTypeTagStyle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.title);
        parcel.writeString(this.tradeType);
        parcel.writeString(this.time);
        ArrayList<TacticsInsideItemData> arrayList = this.list;
        parcel.writeInt(arrayList.size());
        Iterator<TacticsInsideItemData> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
        parcel.writeString(this.dealOrdType);
        parcel.writeString(this.state);
        parcel.writeString(this.orderId);
        parcel.writeString(this.algoId);
        parcel.writeInt(this.stateColor);
        parcel.writeInt(this.stateClickable ? 1 : 0);
        parcel.writeString(this.instId);
        parcel.writeString(this.before);
        parcel.writeString(this.after);
        parcel.writeString(this.tbMode);
        parcel.writeString(this.groupId);
        parcel.writeString(this.orderTag);
        parcel.writeInt(this.showManualTag ? 1 : 0);
        parcel.writeInt(this.tradeTypeTagStyle);
    }

    public TransDetailsData(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull ArrayList<TacticsInsideItemData> arrayList, String str4, String str5, String str6, String str7, int i, boolean z, String str8, String str9, String str10, String str11, String str12, String str13, boolean z2, int i2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(arrayList, "");
        this.title = str;
        this.tradeType = str2;
        this.time = str3;
        this.list = arrayList;
        this.dealOrdType = str4;
        this.state = str5;
        this.orderId = str6;
        this.algoId = str7;
        this.stateColor = i;
        this.stateClickable = z;
        this.instId = str8;
        this.before = str9;
        this.after = str10;
        this.tbMode = str11;
        this.groupId = str12;
        this.orderTag = str13;
        this.showManualTag = z2;
        this.tradeTypeTagStyle = i2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x008e: CONSTRUCTOR 
  (r23v0 java.lang.String)
  (r24v0 java.lang.String)
  (r25v0 java.lang.String)
  (r26v0 java.util.ArrayList)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r41v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r27v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r41v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r28v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0013: ARITH (r41v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r29v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001b: ARITH (r41v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r30v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0023: ARITH (r41v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x002d: INVOKE (wrap:int:0x0027: SGET  A[WRAPPED] o.mPz.ActionBar.zLjUOn int) STATIC call: o.mpX.copydefault(int):int A[MD:(int):int (m), WRAPPED] (LINE:1158)) : (r31v0 int))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0031: ARITH (r41v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? false : (r32v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003a: ARITH (r41v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r33v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0042: ARITH (r41v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r34v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004a: ARITH (r41v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r35v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0053: ARITH (r41v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r36v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x005c: ARITH (r41v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r37v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0068: ARITH (32768 int) & (r41v0 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r38v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0072: ARITH (65536 int) & (r41v0 int) A[WRAPPED]) != (0 int)) ? false : (r39v0 boolean))
  (wrap:int:?: TERNARY null = ((wrap:int:0x007c: ARITH (r41v0 int) & (131072 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r40v0 int))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.util.ArrayList<com.okinc.unify_trade.bot.data.TacticsInsideItemData>, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, int):void (m)] (LINE:1149) call: com.okinc.unify_trade.bot.data.TransDetailsData.<init>(java.lang.String, java.lang.String, java.lang.String, java.util.ArrayList, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, int):void type: THIS */
    public /* synthetic */ TransDetailsData(String str, String str2, String str3, ArrayList arrayList, String str4, String str5, String str6, String str7, int i, boolean z, String str8, String str9, String str10, String str11, String str12, String str13, boolean z2, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, arrayList, (i3 & 16) != 0 ? null : str4, (i3 & 32) != 0 ? null : str5, (i3 & 64) != 0 ? null : str6, (i3 & 128) != 0 ? null : str7, (i3 & 256) != 0 ? C33070mpX.copydefault(C32113mPz.ActionBar.zLjUOn) : i, (i3 & 512) != 0 ? false : z, (i3 & 1024) != 0 ? null : str8, (i3 & 2048) != 0 ? null : str9, (i3 & 4096) != 0 ? null : str10, (i3 & 8192) != 0 ? null : str11, (i3 & 16384) != 0 ? null : str12, (32768 & i3) != 0 ? null : str13, (65536 & i3) != 0 ? false : z2, (i3 & 131072) != 0 ? 0 : i2);
    }
}
