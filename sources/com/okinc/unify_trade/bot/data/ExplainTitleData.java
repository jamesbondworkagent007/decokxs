package com.okinc.unify_trade.bot.data;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes24.dex */
public class ExplainTitleData implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<ExplainTitleData> CREATOR = new Creator();
    private final float padTop;
    private final String title;

    public static final class Creator implements Parcelable.Creator<ExplainTitleData> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ExplainTitleData createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new ExplainTitleData(parcel.readString(), parcel.readFloat());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ExplainTitleData[] newArray(int i) {
            return new ExplainTitleData[i];
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final float getPadTop() {
        return this.padTop;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTitle() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.title);
        parcel.writeFloat(this.padTop);
    }

    public ExplainTitleData(@NotNull String str, float f) {
        Intrinsics.checkNotNullParameter(str, "");
        this.title = str;
        this.padTop = f;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 java.lang.String)
  (wrap:float:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (0.0f float) : (r2v0 float))
 A[MD:(java.lang.String, float):void (m)] (LINE:683) call: com.okinc.unify_trade.bot.data.ExplainTitleData.<init>(java.lang.String, float):void type: THIS */
    public /* synthetic */ ExplainTitleData(String str, float f, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? 0.0f : f);
    }
}
