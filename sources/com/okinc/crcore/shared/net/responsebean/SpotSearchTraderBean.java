package com.okinc.crcore.shared.net.responsebean;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.crcore.coreapi.net.responsebean.SpotSearchTraderResponseBean;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class SpotSearchTraderBean implements Parcelable {
    private String aum;
    private String defaultHeadPictureId;
    private String headPicture;
    private String incomeRate;
    private String jumpParam;
    private String nickNameCn;
    private String nickNameEn;
    private String type;
    public static final ActionBar Companion = new ActionBar(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<SpotSearchTraderBean> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<SpotSearchTraderBean> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SpotSearchTraderBean createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new SpotSearchTraderBean(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SpotSearchTraderBean[] newArray(int i) {
            return new SpotSearchTraderBean[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public SpotSearchTraderBean() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.incomeRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.jumpParam;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.nickNameCn;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.nickNameEn;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.headPicture;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.defaultHeadPictureId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.aum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SpotSearchTraderBean copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        return new SpotSearchTraderBean(str, str2, str3, str4, str5, str6, str7, str8);
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
        if (!(obj instanceof SpotSearchTraderBean)) {
            return false;
        }
        SpotSearchTraderBean spotSearchTraderBean = (SpotSearchTraderBean) obj;
        return Intrinsics.EZpvd((Object) this.incomeRate, (Object) spotSearchTraderBean.incomeRate) && Intrinsics.EZpvd((Object) this.jumpParam, (Object) spotSearchTraderBean.jumpParam) && Intrinsics.EZpvd((Object) this.nickNameCn, (Object) spotSearchTraderBean.nickNameCn) && Intrinsics.EZpvd((Object) this.nickNameEn, (Object) spotSearchTraderBean.nickNameEn) && Intrinsics.EZpvd((Object) this.headPicture, (Object) spotSearchTraderBean.headPicture) && Intrinsics.EZpvd((Object) this.defaultHeadPictureId, (Object) spotSearchTraderBean.defaultHeadPictureId) && Intrinsics.EZpvd((Object) this.type, (Object) spotSearchTraderBean.type) && Intrinsics.EZpvd((Object) this.aum, (Object) spotSearchTraderBean.aum);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAum() {
        return this.aum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDefaultHeadPictureId() {
        return this.defaultHeadPictureId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getHeadPicture() {
        return this.headPicture;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getIncomeRate() {
        return this.incomeRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getJumpParam() {
        return this.jumpParam;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNickNameCn() {
        return this.nickNameCn;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNickNameEn() {
        return this.nickNameEn;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getType() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((this.incomeRate.hashCode() * 31) + this.jumpParam.hashCode()) * 31) + this.nickNameCn.hashCode()) * 31) + this.nickNameEn.hashCode()) * 31) + this.headPicture.hashCode()) * 31) + this.defaultHeadPictureId.hashCode()) * 31) + this.type.hashCode()) * 31) + this.aum.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAum(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.aum = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDefaultHeadPictureId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.defaultHeadPictureId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setHeadPicture(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.headPicture = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setIncomeRate(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.incomeRate = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setJumpParam(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.jumpParam = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setNickNameCn(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.nickNameCn = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setNickNameEn(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.nickNameEn = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.type = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SpotSearchTraderBean(incomeRate=" + this.incomeRate + ", jumpParam=" + this.jumpParam + ", nickNameCn=" + this.nickNameCn + ", nickNameEn=" + this.nickNameEn + ", headPicture=" + this.headPicture + ", defaultHeadPictureId=" + this.defaultHeadPictureId + ", type=" + this.type + ", aum=" + this.aum + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.incomeRate);
        parcel.writeString(this.jumpParam);
        parcel.writeString(this.nickNameCn);
        parcel.writeString(this.nickNameEn);
        parcel.writeString(this.headPicture);
        parcel.writeString(this.defaultHeadPictureId);
        parcel.writeString(this.type);
        parcel.writeString(this.aum);
    }

    public SpotSearchTraderBean(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        this.incomeRate = str;
        this.jumpParam = str2;
        this.nickNameCn = str3;
        this.nickNameEn = str4;
        this.headPicture = str5;
        this.defaultHeadPictureId = str6;
        this.type = str7;
        this.aum = str8;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0049: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r18v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r10v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r18v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r11v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0012: ARITH (r18v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r12v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0019: ARITH (r18v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r13v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0020: ARITH (r18v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r14v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0027: ARITH (r18v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r15v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002e: ARITH (r18v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0036: ARITH (r18v0 int) & (128 int) A[WRAPPED]) == (0 int)) ? (r17v0 java.lang.String) : (""))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:12) call: com.okinc.crcore.shared.net.responsebean.SpotSearchTraderBean.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ SpotSearchTraderBean(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7, (i & 128) == 0 ? str8 : "");
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.crcore.shared.net.responsebean.SpotSearchTraderBean.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final SpotSearchTraderBean KWHzl(@NotNull SpotSearchTraderResponseBean spotSearchTraderResponseBean) {
            Intrinsics.checkNotNullParameter(spotSearchTraderResponseBean, "");
            return new SpotSearchTraderBean(spotSearchTraderResponseBean.getIncomeRate(), spotSearchTraderResponseBean.getJumpParam(), spotSearchTraderResponseBean.getNickNameCn(), spotSearchTraderResponseBean.getNickNameEn(), spotSearchTraderResponseBean.getHeadPicture(), spotSearchTraderResponseBean.getDefaultHeadPictureId(), spotSearchTraderResponseBean.getType(), spotSearchTraderResponseBean.getAum());
        }
    }
}
