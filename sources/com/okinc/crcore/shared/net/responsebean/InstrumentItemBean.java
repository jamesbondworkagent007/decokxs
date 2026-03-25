package com.okinc.crcore.shared.net.responsebean;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.crcore.coreapi.net.responsebean.InstrumentItemResponseBean;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C56403yEb;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class InstrumentItemBean implements Parcelable {
    public static final int $stable = 0;
    private final int active;
    private final int bizType;
    private final long createTime;
    private final String instrumentName;
    private final String promptThreshold;
    private final int promptType;
    private final int repeatType;
    private final String ruleId;
    public static final ActionBar Companion = new ActionBar(null);
    public static final Parcelable.Creator<InstrumentItemBean> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<InstrumentItemBean> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InstrumentItemBean createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new InstrumentItemBean(parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readLong(), parcel.readInt());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InstrumentItemBean[] newArray(int i) {
            return new InstrumentItemBean[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public InstrumentItemBean() {
        this(null, 0, null, 0, 0, null, 0L, 0, 255, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.ruleId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component2() {
        return this.bizType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.instrumentName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component4() {
        return this.promptType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component5() {
        return this.repeatType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.promptThreshold;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component7() {
        return this.createTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component8() {
        return this.active;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InstrumentItemBean copy(@NotNull String str, int i, @NotNull String str2, int i2, int i3, @NotNull String str3, long j, int i4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new InstrumentItemBean(str, i, str2, i2, i3, str3, j, i4);
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
        if (!(obj instanceof InstrumentItemBean)) {
            return false;
        }
        InstrumentItemBean instrumentItemBean = (InstrumentItemBean) obj;
        return Intrinsics.EZpvd((Object) this.ruleId, (Object) instrumentItemBean.ruleId) && this.bizType == instrumentItemBean.bizType && Intrinsics.EZpvd((Object) this.instrumentName, (Object) instrumentItemBean.instrumentName) && this.promptType == instrumentItemBean.promptType && this.repeatType == instrumentItemBean.repeatType && Intrinsics.EZpvd((Object) this.promptThreshold, (Object) instrumentItemBean.promptThreshold) && this.createTime == instrumentItemBean.createTime && this.active == instrumentItemBean.active;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getActive() {
        return this.active;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getBizType() {
        return this.bizType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getCreateTime() {
        return this.createTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInstrumentName() {
        return this.instrumentName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPromptThreshold() {
        return this.promptThreshold;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getPromptType() {
        return this.promptType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getRepeatType() {
        return this.repeatType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRuleId() {
        return this.ruleId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((this.ruleId.hashCode() * 31) + Integer.hashCode(this.bizType)) * 31) + this.instrumentName.hashCode()) * 31) + Integer.hashCode(this.promptType)) * 31) + Integer.hashCode(this.repeatType)) * 31) + this.promptThreshold.hashCode()) * 31) + Long.hashCode(this.createTime)) * 31) + Integer.hashCode(this.active);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "InstrumentItemBean(ruleId=" + this.ruleId + ", bizType=" + this.bizType + ", instrumentName=" + this.instrumentName + ", promptType=" + this.promptType + ", repeatType=" + this.repeatType + ", promptThreshold=" + this.promptThreshold + ", createTime=" + this.createTime + ", active=" + this.active + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.ruleId);
        parcel.writeInt(this.bizType);
        parcel.writeString(this.instrumentName);
        parcel.writeInt(this.promptType);
        parcel.writeInt(this.repeatType);
        parcel.writeString(this.promptThreshold);
        parcel.writeLong(this.createTime);
        parcel.writeInt(this.active);
    }

    public InstrumentItemBean(@NotNull String str, int i, @NotNull String str2, int i2, int i3, @NotNull String str3, long j, int i4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.ruleId = str;
        this.bizType = i;
        this.instrumentName = str2;
        this.promptType = i2;
        this.repeatType = i3;
        this.promptThreshold = str3;
        this.createTime = j;
        this.active = i4;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x004a: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r19v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r10v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x000b: ARITH (r19v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r11v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0013: ARITH (r19v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r12v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x001a: ARITH (r19v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r13v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0021: ARITH (r19v0 int) & (16 int) A[WRAPPED]) == (0 int)) ? (r14v0 int) : (0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0027: ARITH (r19v0 int) & (32 int) A[WRAPPED]) == (0 int)) ? (r15v0 java.lang.String) : (""))
  (wrap:long:?: TERNARY null = ((wrap:int:0x002d: ARITH (r19v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r16v0 long))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0036: ARITH (r19v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (1 int) : (r18v0 int))
 A[MD:(java.lang.String, int, java.lang.String, int, int, java.lang.String, long, int):void (m)] (LINE:12) call: com.okinc.crcore.shared.net.responsebean.InstrumentItemBean.<init>(java.lang.String, int, java.lang.String, int, int, java.lang.String, long, int):void type: THIS */
    public /* synthetic */ InstrumentItemBean(String str, int i, String str2, int i2, int i3, String str3, long j, int i4, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this((i5 & 1) != 0 ? "" : str, (i5 & 2) != 0 ? 0 : i, (i5 & 4) != 0 ? "" : str2, (i5 & 8) != 0 ? 0 : i2, (i5 & 16) == 0 ? i3 : 0, (i5 & 32) == 0 ? str3 : "", (i5 & 64) != 0 ? 0L : j, (i5 & 128) != 0 ? 1 : i4);
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.crcore.shared.net.responsebean.InstrumentItemBean.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final List<InstrumentItemBean> AEQbTJ(@NotNull List<InstrumentItemResponseBean> list) {
            Intrinsics.checkNotNullParameter(list, "");
            ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(list, 10));
            for (InstrumentItemResponseBean instrumentItemResponseBean : list) {
                arrayList.add(new InstrumentItemBean(instrumentItemResponseBean.getRuleId(), instrumentItemResponseBean.getBizType(), instrumentItemResponseBean.getInstrumentName(), instrumentItemResponseBean.getPromptType(), instrumentItemResponseBean.getRepeatType(), instrumentItemResponseBean.getPromptThreshold(), instrumentItemResponseBean.getCreateTime(), instrumentItemResponseBean.getActive()));
            }
            return arrayList;
        }
    }
}
