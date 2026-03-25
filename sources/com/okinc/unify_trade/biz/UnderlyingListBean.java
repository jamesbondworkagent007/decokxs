package com.okinc.unify_trade.biz;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class UnderlyingListBean implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<UnderlyingListBean> CREATOR = new Creator();
    private final String instId;
    private final String nmpUnderlyingId;
    private final String nmpUnderlyingName;

    public static final class Creator implements Parcelable.Creator<UnderlyingListBean> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final UnderlyingListBean createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new UnderlyingListBean(parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final UnderlyingListBean[] newArray(int i) {
            return new UnderlyingListBean[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public UnderlyingListBean() {
        this(null, null, null, 7, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ UnderlyingListBean copy$default(UnderlyingListBean underlyingListBean, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = underlyingListBean.nmpUnderlyingId;
        }
        if ((i & 2) != 0) {
            str2 = underlyingListBean.nmpUnderlyingName;
        }
        if ((i & 4) != 0) {
            str3 = underlyingListBean.instId;
        }
        return underlyingListBean.copy(str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.nmpUnderlyingId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.nmpUnderlyingName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.instId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final UnderlyingListBean copy(String str, String str2, String str3) {
        return new UnderlyingListBean(str, str2, str3);
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
        if (!(obj instanceof UnderlyingListBean)) {
            return false;
        }
        UnderlyingListBean underlyingListBean = (UnderlyingListBean) obj;
        return Intrinsics.EZpvd((Object) this.nmpUnderlyingId, (Object) underlyingListBean.nmpUnderlyingId) && Intrinsics.EZpvd((Object) this.nmpUnderlyingName, (Object) underlyingListBean.nmpUnderlyingName) && Intrinsics.EZpvd((Object) this.instId, (Object) underlyingListBean.instId);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInstId() {
        return this.instId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNmpUnderlyingId() {
        return this.nmpUnderlyingId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNmpUnderlyingName() {
        return this.nmpUnderlyingName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.nmpUnderlyingId;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.nmpUnderlyingName;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.instId;
        return (((iHashCode * 31) + iHashCode2) * 31) + (str3 != null ? str3.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "UnderlyingListBean(nmpUnderlyingId=" + this.nmpUnderlyingId + ", nmpUnderlyingName=" + this.nmpUnderlyingName + ", instId=" + this.instId + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.nmpUnderlyingId);
        parcel.writeString(this.nmpUnderlyingName);
        parcel.writeString(this.instId);
    }

    public UnderlyingListBean(String str, String str2, String str3) {
        this.nmpUnderlyingId = str;
        this.nmpUnderlyingName = str2;
        this.instId = str3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r3v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r4v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:1104) call: com.okinc.unify_trade.biz.UnderlyingListBean.<init>(java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ UnderlyingListBean(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
    }
}
