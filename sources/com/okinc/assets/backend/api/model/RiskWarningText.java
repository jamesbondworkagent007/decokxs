package com.okinc.assets.backend.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
public final class RiskWarningText implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<RiskWarningText> CREATOR = new Creator();
    private final String body;
    private final RiskWarningButtons foot;
    private final String head;
    private final String headPic;

    public static final class Creator implements Parcelable.Creator<RiskWarningText> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RiskWarningText createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new RiskWarningText(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : RiskWarningButtons.CREATOR.createFromParcel(parcel));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RiskWarningText[] newArray(int i) {
            return new RiskWarningText[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public RiskWarningText() {
        this(null, null, null, null, 15, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ RiskWarningText copy$default(RiskWarningText riskWarningText, String str, String str2, String str3, RiskWarningButtons riskWarningButtons, int i, Object obj) {
        if ((i & 1) != 0) {
            str = riskWarningText.headPic;
        }
        if ((i & 2) != 0) {
            str2 = riskWarningText.head;
        }
        if ((i & 4) != 0) {
            str3 = riskWarningText.body;
        }
        if ((i & 8) != 0) {
            riskWarningButtons = riskWarningText.foot;
        }
        return riskWarningText.copy(str, str2, str3, riskWarningButtons);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.headPic;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.head;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.body;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RiskWarningButtons component4() {
        return this.foot;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RiskWarningText copy(String str, String str2, String str3, RiskWarningButtons riskWarningButtons) {
        return new RiskWarningText(str, str2, str3, riskWarningButtons);
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
        if (!(obj instanceof RiskWarningText)) {
            return false;
        }
        RiskWarningText riskWarningText = (RiskWarningText) obj;
        return Intrinsics.EZpvd((Object) this.headPic, (Object) riskWarningText.headPic) && Intrinsics.EZpvd((Object) this.head, (Object) riskWarningText.head) && Intrinsics.EZpvd((Object) this.body, (Object) riskWarningText.body) && Intrinsics.EZpvd(this.foot, riskWarningText.foot);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBody() {
        return this.body;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RiskWarningButtons getFoot() {
        return this.foot;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getHead() {
        return this.head;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getHeadPic() {
        return this.headPic;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.headPic;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.head;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.body;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        RiskWarningButtons riskWarningButtons = this.foot;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (riskWarningButtons != null ? riskWarningButtons.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "RiskWarningText(headPic=" + this.headPic + ", head=" + this.head + ", body=" + this.body + ", foot=" + this.foot + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.headPic);
        parcel.writeString(this.head);
        parcel.writeString(this.body);
        RiskWarningButtons riskWarningButtons = this.foot;
        if (riskWarningButtons == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            riskWarningButtons.writeToParcel(parcel, i);
        }
    }

    public RiskWarningText(String str, String str2, String str3, RiskWarningButtons riskWarningButtons) {
        this.headPic = str;
        this.head = str2;
        this.body = str3;
        this.foot = riskWarningButtons;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0015: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r3v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r4v0 java.lang.String))
  (wrap:com.okinc.assets.backend.api.model.RiskWarningButtons:?: TERNARY null = ((wrap:int:0x0010: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.assets.backend.api.model.RiskWarningButtons) : (r5v0 com.okinc.assets.backend.api.model.RiskWarningButtons))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, com.okinc.assets.backend.api.model.RiskWarningButtons):void (m)] (LINE:41) call: com.okinc.assets.backend.api.model.RiskWarningText.<init>(java.lang.String, java.lang.String, java.lang.String, com.okinc.assets.backend.api.model.RiskWarningButtons):void type: THIS */
    public /* synthetic */ RiskWarningText(String str, String str2, String str3, RiskWarningButtons riskWarningButtons, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : riskWarningButtons);
    }
}
