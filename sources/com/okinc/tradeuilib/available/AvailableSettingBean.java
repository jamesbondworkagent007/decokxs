package com.okinc.tradeuilib.available;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes24.dex */
public final class AvailableSettingBean implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<AvailableSettingBean> CREATOR = new Creator();
    private String assetAvailable;
    private String earnAvailable;
    private final ArrayList<AvailableOption> extraOptionList;
    private final String instId;
    private final String instType;
    private final boolean isQuote;
    private String tradeAvailable;
    private final String tradeQuoteCcy;

    public static final class Creator implements Parcelable.Creator<AvailableSettingBean> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AvailableSettingBean createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            boolean z = parcel.readInt() != 0;
            String string6 = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(AvailableOption.valueOf(parcel.readString()));
            }
            return new AvailableSettingBean(string, string2, string3, string4, string5, z, string6, arrayList);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AvailableSettingBean[] newArray(int i) {
            return new AvailableSettingBean[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.instType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.instId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.tradeAvailable;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.assetAvailable;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.earnAvailable;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component6() {
        return this.isQuote;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.tradeQuoteCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<AvailableOption> component8() {
        return this.extraOptionList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AvailableSettingBean copy(@NotNull String str, @NotNull String str2, @NotNull String str3, String str4, String str5, boolean z, String str6, @NotNull ArrayList<AvailableOption> arrayList) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(arrayList, "");
        return new AvailableSettingBean(str, str2, str3, str4, str5, z, str6, arrayList);
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
        if (!(obj instanceof AvailableSettingBean)) {
            return false;
        }
        AvailableSettingBean availableSettingBean = (AvailableSettingBean) obj;
        return Intrinsics.EZpvd((Object) this.instType, (Object) availableSettingBean.instType) && Intrinsics.EZpvd((Object) this.instId, (Object) availableSettingBean.instId) && Intrinsics.EZpvd((Object) this.tradeAvailable, (Object) availableSettingBean.tradeAvailable) && Intrinsics.EZpvd((Object) this.assetAvailable, (Object) availableSettingBean.assetAvailable) && Intrinsics.EZpvd((Object) this.earnAvailable, (Object) availableSettingBean.earnAvailable) && this.isQuote == availableSettingBean.isQuote && Intrinsics.EZpvd((Object) this.tradeQuoteCcy, (Object) availableSettingBean.tradeQuoteCcy) && Intrinsics.EZpvd(this.extraOptionList, availableSettingBean.extraOptionList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAssetAvailable() {
        return this.assetAvailable;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEarnAvailable() {
        return this.earnAvailable;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<AvailableOption> getExtraOptionList() {
        return this.extraOptionList;
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
    public final String getTradeAvailable() {
        return this.tradeAvailable;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTradeQuoteCcy() {
        return this.tradeQuoteCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.instType.hashCode();
        int iHashCode2 = this.instId.hashCode();
        int iHashCode3 = this.tradeAvailable.hashCode();
        String str = this.assetAvailable;
        int iHashCode4 = str == null ? 0 : str.hashCode();
        String str2 = this.earnAvailable;
        int iHashCode5 = str2 == null ? 0 : str2.hashCode();
        int iHashCode6 = Boolean.hashCode(this.isQuote);
        String str3 = this.tradeQuoteCcy;
        return (((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + (str3 != null ? str3.hashCode() : 0)) * 31) + this.extraOptionList.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isQuote() {
        return this.isQuote;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAssetAvailable(String str) {
        this.assetAvailable = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setEarnAvailable(String str) {
        this.earnAvailable = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTradeAvailable(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.tradeAvailable = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "AvailableSettingBean(instType=" + this.instType + ", instId=" + this.instId + ", tradeAvailable=" + this.tradeAvailable + ", assetAvailable=" + this.assetAvailable + ", earnAvailable=" + this.earnAvailable + ", isQuote=" + this.isQuote + ", tradeQuoteCcy=" + this.tradeQuoteCcy + ", extraOptionList=" + this.extraOptionList + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.instType);
        parcel.writeString(this.instId);
        parcel.writeString(this.tradeAvailable);
        parcel.writeString(this.assetAvailable);
        parcel.writeString(this.earnAvailable);
        parcel.writeInt(this.isQuote ? 1 : 0);
        parcel.writeString(this.tradeQuoteCcy);
        ArrayList<AvailableOption> arrayList = this.extraOptionList;
        parcel.writeInt(arrayList.size());
        Iterator<AvailableOption> it = arrayList.iterator();
        while (it.hasNext()) {
            parcel.writeString(it.next().name());
        }
    }

    public AvailableSettingBean(@NotNull String str, @NotNull String str2, @NotNull String str3, String str4, String str5, boolean z, String str6, @NotNull ArrayList<AvailableOption> arrayList) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(arrayList, "");
        this.instType = str;
        this.instId = str2;
        this.tradeAvailable = str3;
        this.assetAvailable = str4;
        this.earnAvailable = str5;
        this.isQuote = z;
        this.tradeQuoteCcy = str6;
        this.extraOptionList = arrayList;
    }
}
