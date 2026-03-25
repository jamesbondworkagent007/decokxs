package com.okinc.unify_trade.biz;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
public final class UploadSettingConfigReq implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<UploadSettingConfigReq> CREATOR = new Creator();
    private final String type;
    private final UploadSettingConfigBean value;

    /* JADX INFO: loaded from: classes24.dex */
    public static final class Creator implements Parcelable.Creator<UploadSettingConfigReq> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final UploadSettingConfigReq createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new UploadSettingConfigReq(parcel.readString(), UploadSettingConfigBean.CREATOR.createFromParcel(parcel));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final UploadSettingConfigReq[] newArray(int i) {
            return new UploadSettingConfigReq[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ UploadSettingConfigReq copy$default(UploadSettingConfigReq uploadSettingConfigReq, String str, UploadSettingConfigBean uploadSettingConfigBean, int i, Object obj) {
        if ((i & 1) != 0) {
            str = uploadSettingConfigReq.type;
        }
        if ((i & 2) != 0) {
            uploadSettingConfigBean = uploadSettingConfigReq.value;
        }
        return uploadSettingConfigReq.copy(str, uploadSettingConfigBean);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final UploadSettingConfigBean component2() {
        return this.value;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final UploadSettingConfigReq copy(@NotNull String str, @NotNull UploadSettingConfigBean uploadSettingConfigBean) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(uploadSettingConfigBean, "");
        return new UploadSettingConfigReq(str, uploadSettingConfigBean);
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
        if (!(obj instanceof UploadSettingConfigReq)) {
            return false;
        }
        UploadSettingConfigReq uploadSettingConfigReq = (UploadSettingConfigReq) obj;
        return Intrinsics.EZpvd((Object) this.type, (Object) uploadSettingConfigReq.type) && Intrinsics.EZpvd(this.value, uploadSettingConfigReq.value);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getType() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final UploadSettingConfigBean getValue() {
        return this.value;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.type.hashCode() * 31) + this.value.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "UploadSettingConfigReq(type=" + this.type + ", value=" + this.value + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.type);
        this.value.writeToParcel(parcel, i);
    }

    public UploadSettingConfigReq(@NotNull String str, @NotNull UploadSettingConfigBean uploadSettingConfigBean) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(uploadSettingConfigBean, "");
        this.type = str;
        this.value = uploadSettingConfigBean;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0006: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("2") : (r1v0 java.lang.String))
  (r2v0 com.okinc.unify_trade.biz.UploadSettingConfigBean)
 A[MD:(java.lang.String, com.okinc.unify_trade.biz.UploadSettingConfigBean):void (m)] (LINE:5369) call: com.okinc.unify_trade.biz.UploadSettingConfigReq.<init>(java.lang.String, com.okinc.unify_trade.biz.UploadSettingConfigBean):void type: THIS */
    public /* synthetic */ UploadSettingConfigReq(String str, UploadSettingConfigBean uploadSettingConfigBean, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "2" : str, uploadSettingConfigBean);
    }
}
