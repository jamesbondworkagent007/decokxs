package com.okinc.kline.news.data.vo;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.kline.news.data.po.KlineFlashContentPo;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class KlineFlashVo implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<KlineFlashVo> CREATOR = new Creator();
    private final String chainId;
    private final String group;
    private final KlineFlashContentPo po;
    private final String queryName;
    private final String time;
    private final String tokenAddress;

    public static final class Creator implements Parcelable.Creator<KlineFlashVo> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final KlineFlashVo createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new KlineFlashVo(KlineFlashContentPo.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final KlineFlashVo[] newArray(int i) {
            return new KlineFlashVo[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ KlineFlashVo copy$default(KlineFlashVo klineFlashVo, KlineFlashContentPo klineFlashContentPo, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            klineFlashContentPo = klineFlashVo.po;
        }
        if ((i & 2) != 0) {
            str = klineFlashVo.time;
        }
        String str6 = str;
        if ((i & 4) != 0) {
            str2 = klineFlashVo.queryName;
        }
        String str7 = str2;
        if ((i & 8) != 0) {
            str3 = klineFlashVo.group;
        }
        String str8 = str3;
        if ((i & 16) != 0) {
            str4 = klineFlashVo.chainId;
        }
        String str9 = str4;
        if ((i & 32) != 0) {
            str5 = klineFlashVo.tokenAddress;
        }
        return klineFlashVo.copy(klineFlashContentPo, str6, str7, str8, str9, str5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final KlineFlashContentPo component1() {
        return this.po;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.time;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.queryName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.group;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.tokenAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final KlineFlashVo copy(@NotNull KlineFlashContentPo klineFlashContentPo, @NotNull String str, @NotNull String str2, @NotNull String str3, String str4, String str5) {
        Intrinsics.checkNotNullParameter(klineFlashContentPo, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new KlineFlashVo(klineFlashContentPo, str, str2, str3, str4, str5);
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
        if (!(obj instanceof KlineFlashVo)) {
            return false;
        }
        KlineFlashVo klineFlashVo = (KlineFlashVo) obj;
        return Intrinsics.EZpvd(this.po, klineFlashVo.po) && Intrinsics.EZpvd((Object) this.time, (Object) klineFlashVo.time) && Intrinsics.EZpvd((Object) this.queryName, (Object) klineFlashVo.queryName) && Intrinsics.EZpvd((Object) this.group, (Object) klineFlashVo.group) && Intrinsics.EZpvd((Object) this.chainId, (Object) klineFlashVo.chainId) && Intrinsics.EZpvd((Object) this.tokenAddress, (Object) klineFlashVo.tokenAddress);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChainId() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getGroup() {
        return this.group;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final KlineFlashContentPo getPo() {
        return this.po;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getQueryName() {
        return this.queryName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTime() {
        return this.time;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenAddress() {
        return this.tokenAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.po.hashCode();
        int iHashCode2 = this.time.hashCode();
        int iHashCode3 = this.queryName.hashCode();
        int iHashCode4 = this.group.hashCode();
        String str = this.chainId;
        int iHashCode5 = str == null ? 0 : str.hashCode();
        String str2 = this.tokenAddress;
        return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "KlineFlashVo(po=" + this.po + ", time=" + this.time + ", queryName=" + this.queryName + ", group=" + this.group + ", chainId=" + this.chainId + ", tokenAddress=" + this.tokenAddress + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        this.po.writeToParcel(parcel, i);
        parcel.writeString(this.time);
        parcel.writeString(this.queryName);
        parcel.writeString(this.group);
        parcel.writeString(this.chainId);
        parcel.writeString(this.tokenAddress);
    }

    public KlineFlashVo(@NotNull KlineFlashContentPo klineFlashContentPo, @NotNull String str, @NotNull String str2, @NotNull String str3, String str4, String str5) {
        Intrinsics.checkNotNullParameter(klineFlashContentPo, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.po = klineFlashContentPo;
        this.time = str;
        this.queryName = str2;
        this.group = str3;
        this.chainId = str4;
        this.tokenAddress = str5;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0014: CONSTRUCTOR 
  (r10v0 com.okinc.kline.news.data.po.KlineFlashContentPo)
  (r11v0 java.lang.String)
  (r12v0 java.lang.String)
  (r13v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r16v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r14v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0008: ARITH (r16v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r15v0 java.lang.String))
 A[MD:(com.okinc.kline.news.data.po.KlineFlashContentPo, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:15) call: com.okinc.kline.news.data.vo.KlineFlashVo.<init>(com.okinc.kline.news.data.po.KlineFlashContentPo, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ KlineFlashVo(KlineFlashContentPo klineFlashContentPo, String str, String str2, String str3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(klineFlashContentPo, str, str2, str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : str5);
    }
}
