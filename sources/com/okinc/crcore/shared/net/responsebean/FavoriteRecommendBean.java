package com.okinc.crcore.shared.net.responsebean;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.crcore.coreapi.net.responsebean.FavoriteRecommendResponseBean;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C56403yEb;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
public final class FavoriteRecommendBean implements Parcelable {
    public static final int $stable = 0;
    private final String alias;
    private final String displayId;
    private final String expTime;
    private final String fullName;
    private final String icon;
    private final String instId;
    private final String instType;
    private final String open24h;
    private final String price;
    private final String quoteIcon;
    private final String quoteName;
    private final String sodUtc0;
    private final String sodUtc8;
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final Parcelable.Creator<FavoriteRecommendBean> CREATOR = new Creator();

    /* JADX INFO: loaded from: classes23.dex */
    public static final class Creator implements Parcelable.Creator<FavoriteRecommendBean> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FavoriteRecommendBean createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new FavoriteRecommendBean(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FavoriteRecommendBean[] newArray(int i) {
            return new FavoriteRecommendBean[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public FavoriteRecommendBean() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, 8191, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.alias;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.sodUtc0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.sodUtc8;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.quoteIcon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component13() {
        return this.quoteName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.expTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.instId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.displayId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.instType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.fullName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.icon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.price;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.open24h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final FavoriteRecommendBean copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(str11, "");
        Intrinsics.checkNotNullParameter(str12, "");
        Intrinsics.checkNotNullParameter(str13, "");
        return new FavoriteRecommendBean(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13);
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
        if (!(obj instanceof FavoriteRecommendBean)) {
            return false;
        }
        FavoriteRecommendBean favoriteRecommendBean = (FavoriteRecommendBean) obj;
        return Intrinsics.EZpvd((Object) this.alias, (Object) favoriteRecommendBean.alias) && Intrinsics.EZpvd((Object) this.expTime, (Object) favoriteRecommendBean.expTime) && Intrinsics.EZpvd((Object) this.instId, (Object) favoriteRecommendBean.instId) && Intrinsics.EZpvd((Object) this.displayId, (Object) favoriteRecommendBean.displayId) && Intrinsics.EZpvd((Object) this.instType, (Object) favoriteRecommendBean.instType) && Intrinsics.EZpvd((Object) this.fullName, (Object) favoriteRecommendBean.fullName) && Intrinsics.EZpvd((Object) this.icon, (Object) favoriteRecommendBean.icon) && Intrinsics.EZpvd((Object) this.price, (Object) favoriteRecommendBean.price) && Intrinsics.EZpvd((Object) this.open24h, (Object) favoriteRecommendBean.open24h) && Intrinsics.EZpvd((Object) this.sodUtc0, (Object) favoriteRecommendBean.sodUtc0) && Intrinsics.EZpvd((Object) this.sodUtc8, (Object) favoriteRecommendBean.sodUtc8) && Intrinsics.EZpvd((Object) this.quoteIcon, (Object) favoriteRecommendBean.quoteIcon) && Intrinsics.EZpvd((Object) this.quoteName, (Object) favoriteRecommendBean.quoteName);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAlias() {
        return this.alias;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDisplayId() {
        return this.displayId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getExpTime() {
        return this.expTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFullName() {
        return this.fullName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getIcon() {
        return this.icon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInstId() {
        return this.instId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInstType() {
        return this.instType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOpen24h() {
        return this.open24h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPrice() {
        return this.price;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getQuoteIcon() {
        return this.quoteIcon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getQuoteName() {
        return this.quoteName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSodUtc0() {
        return this.sodUtc0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSodUtc8() {
        return this.sodUtc8;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((((((((((((this.alias.hashCode() * 31) + this.expTime.hashCode()) * 31) + this.instId.hashCode()) * 31) + this.displayId.hashCode()) * 31) + this.instType.hashCode()) * 31) + this.fullName.hashCode()) * 31) + this.icon.hashCode()) * 31) + this.price.hashCode()) * 31) + this.open24h.hashCode()) * 31) + this.sodUtc0.hashCode()) * 31) + this.sodUtc8.hashCode()) * 31) + this.quoteIcon.hashCode()) * 31) + this.quoteName.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "FavoriteRecommendBean(alias=" + this.alias + ", expTime=" + this.expTime + ", instId=" + this.instId + ", displayId=" + this.displayId + ", instType=" + this.instType + ", fullName=" + this.fullName + ", icon=" + this.icon + ", price=" + this.price + ", open24h=" + this.open24h + ", sodUtc0=" + this.sodUtc0 + ", sodUtc8=" + this.sodUtc8 + ", quoteIcon=" + this.quoteIcon + ", quoteName=" + this.quoteName + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.alias);
        parcel.writeString(this.expTime);
        parcel.writeString(this.instId);
        parcel.writeString(this.displayId);
        parcel.writeString(this.instType);
        parcel.writeString(this.fullName);
        parcel.writeString(this.icon);
        parcel.writeString(this.price);
        parcel.writeString(this.open24h);
        parcel.writeString(this.sodUtc0);
        parcel.writeString(this.sodUtc8);
        parcel.writeString(this.quoteIcon);
        parcel.writeString(this.quoteName);
    }

    public FavoriteRecommendBean(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(str11, "");
        Intrinsics.checkNotNullParameter(str12, "");
        Intrinsics.checkNotNullParameter(str13, "");
        this.alias = str;
        this.expTime = str2;
        this.instId = str3;
        this.displayId = str4;
        this.instType = str5;
        this.fullName = str6;
        this.icon = str7;
        this.price = str8;
        this.open24h = str9;
        this.sodUtc0 = str10;
        this.sodUtc8 = str11;
        this.quoteIcon = str12;
        this.quoteName = str13;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0085: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r28v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r15v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r28v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0013: ARITH (r28v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r17v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001b: ARITH (r28v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r18v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0023: ARITH (r28v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r19v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002b: ARITH (r28v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r20v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0033: ARITH (r28v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r21v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003b: ARITH (r28v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r22v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0043: ARITH (r28v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r23v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004b: ARITH (r28v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? ("") : (r24v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0053: ARITH (r28v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? ("") : (r25v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x005b: ARITH (r28v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? ("") : (r26v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0063: ARITH (r28v0 int) & (4096 int) A[WRAPPED]) == (0 int)) ? (r27v0 java.lang.String) : (""))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:12) call: com.okinc.crcore.shared.net.responsebean.FavoriteRecommendBean.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ FavoriteRecommendBean(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7, (i & 128) != 0 ? "" : str8, (i & 256) != 0 ? "" : str9, (i & 512) != 0 ? "" : str10, (i & 1024) != 0 ? "" : str11, (i & 2048) != 0 ? "" : str12, (i & 4096) == 0 ? str13 : "");
    }

    /* JADX INFO: loaded from: classes23.dex */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.crcore.shared.net.responsebean.FavoriteRecommendBean.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final List<FavoriteRecommendBean> EZpvd(@NotNull List<FavoriteRecommendResponseBean> list) {
            Intrinsics.checkNotNullParameter(list, "");
            ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(list, 10));
            for (FavoriteRecommendResponseBean favoriteRecommendResponseBean : list) {
                arrayList.add(new FavoriteRecommendBean(favoriteRecommendResponseBean.getAlias(), favoriteRecommendResponseBean.getExpTime(), favoriteRecommendResponseBean.getInstId(), favoriteRecommendResponseBean.getDisplayId(), favoriteRecommendResponseBean.getInstType(), favoriteRecommendResponseBean.getFullName(), favoriteRecommendResponseBean.getIcon(), favoriteRecommendResponseBean.getPrice(), favoriteRecommendResponseBean.getOpen24h(), favoriteRecommendResponseBean.getSodUtc0(), favoriteRecommendResponseBean.getSodUtc8(), favoriteRecommendResponseBean.getQuoteIcon(), favoriteRecommendResponseBean.getQuoteName()));
            }
            return arrayList;
        }
    }
}
