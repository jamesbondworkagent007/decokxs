package com.okinc.kline.data;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class DrawingDataBean implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<DrawingDataBean> CREATOR = new Creator();
    private String instId;
    private ArrayList<DrawingLinesData> lines;
    private String timeVersion;

    public static final class Creator implements Parcelable.Creator<DrawingDataBean> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DrawingDataBean createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(parcel.readInt() == 0 ? null : DrawingLinesData.CREATOR.createFromParcel(parcel));
            }
            return new DrawingDataBean(string, string2, arrayList);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DrawingDataBean[] newArray(int i) {
            return new DrawingDataBean[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public DrawingDataBean() {
        this(null, null, null, 7, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.kline.data.DrawingDataBean */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DrawingDataBean copy$default(DrawingDataBean drawingDataBean, String str, String str2, ArrayList arrayList, int i, Object obj) {
        if ((i & 1) != 0) {
            str = drawingDataBean.timeVersion;
        }
        if ((i & 2) != 0) {
            str2 = drawingDataBean.instId;
        }
        if ((i & 4) != 0) {
            arrayList = drawingDataBean.lines;
        }
        return drawingDataBean.copy(str, str2, arrayList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.timeVersion;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.instId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<DrawingLinesData> component3() {
        return this.lines;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DrawingDataBean copy(@NotNull String str, @NotNull String str2, @NotNull ArrayList<DrawingLinesData> arrayList) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(arrayList, "");
        return new DrawingDataBean(str, str2, arrayList);
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
        if (!(obj instanceof DrawingDataBean)) {
            return false;
        }
        DrawingDataBean drawingDataBean = (DrawingDataBean) obj;
        return Intrinsics.EZpvd((Object) this.timeVersion, (Object) drawingDataBean.timeVersion) && Intrinsics.EZpvd((Object) this.instId, (Object) drawingDataBean.instId) && Intrinsics.EZpvd(this.lines, drawingDataBean.lines);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInstId() {
        return this.instId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<DrawingLinesData> getLines() {
        return this.lines;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTimeVersion() {
        return this.timeVersion;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.timeVersion.hashCode() * 31) + this.instId.hashCode()) * 31) + this.lines.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setInstId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.instId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLines(@NotNull ArrayList<DrawingLinesData> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        this.lines = arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTimeVersion(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.timeVersion = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "DrawingDataBean(timeVersion=" + this.timeVersion + ", instId=" + this.instId + ", lines=" + this.lines + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.timeVersion);
        parcel.writeString(this.instId);
        ArrayList<DrawingLinesData> arrayList = this.lines;
        parcel.writeInt(arrayList.size());
        for (DrawingLinesData drawingLinesData : arrayList) {
            if (drawingLinesData == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                drawingLinesData.writeToParcel(parcel, i);
            }
        }
    }

    public DrawingDataBean(@NotNull String str, @NotNull String str2, @NotNull ArrayList<DrawingLinesData> arrayList) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(arrayList, "");
        this.timeVersion = str;
        this.instId = str2;
        this.lines = arrayList;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0015: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0007: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.String))
  (wrap:java.util.ArrayList:?: TERNARY null = ((wrap:int:0x000c: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.ArrayList:0x0012: CONSTRUCTOR  A[MD:():void (c), WRAPPED] (LINE:22) call: java.util.ArrayList.<init>():void type: CONSTRUCTOR) : (r4v0 java.util.ArrayList))
 A[MD:(java.lang.String, java.lang.String, java.util.ArrayList<com.okinc.kline.data.DrawingLinesData>):void (m)] (LINE:19) call: com.okinc.kline.data.DrawingDataBean.<init>(java.lang.String, java.lang.String, java.util.ArrayList):void type: THIS */
    public /* synthetic */ DrawingDataBean(String str, String str2, ArrayList arrayList, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? new ArrayList() : arrayList);
    }
}
