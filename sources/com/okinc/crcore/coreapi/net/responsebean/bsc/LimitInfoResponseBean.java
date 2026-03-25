package com.okinc.crcore.coreapi.net.responsebean.bsc;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.api.client.googleapis.media.MediaHttpDownloader;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Serializable
public final class LimitInfoResponseBean implements Parcelable {
    public static final int $stable = 0;
    private final String dailyFreqLimit;
    private final String dailyLimit;
    private final String dailyLimitRemaining;
    private final EddLimitLevelResponseBean eddLimitLevel;
    private final String frequencyCheckWindow;
    private final String lifetimeLimit;
    private final String lifetimeLimitRemaining;
    private final boolean limitedByTradeFrequency;
    private final String monthlyFreqLimit;
    private final String monthlyLimit;
    private final String monthlyLimitRemaining;
    private final String singleTransactionMax;
    private final String singleTransactionMin;
    private final String tradeFrequencyLimit;
    private final boolean unlimitedDailyFreqLimit;
    private final boolean unlimitedDailyLimit;
    private final boolean unlimitedDailyLimitRemaining;
    private final boolean unlimitedLifetimeLimit;
    private final boolean unlimitedLifetimeLimitRemaining;
    private final boolean unlimitedMonthlyFreqLimit;
    private final boolean unlimitedMonthlyLimit;
    private final boolean unlimitedMonthlyLimitRemaining;
    private final boolean unlimitedSingleTransactionMax;
    private final boolean unlimitedSingleTransactionMin;
    private final boolean unlimitedWeeklyFreqLimit;
    private final boolean unlimitedWeeklyLimit;
    private final boolean unlimitedWeeklyLimitRemaining;
    private final String weeklyFreqLimit;
    private final String weeklyLimit;
    private final String weeklyLimitRemaining;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<LimitInfoResponseBean> CREATOR = new Creator();

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Creator implements Parcelable.Creator<LimitInfoResponseBean> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LimitInfoResponseBean createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new LimitInfoResponseBean(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : EddLimitLevelResponseBean.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LimitInfoResponseBean[] newArray(int i) {
            return new LimitInfoResponseBean[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public LimitInfoResponseBean() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false, (String) null, (String) null, (EddLimitLevelResponseBean) null, (String) null, (String) null, (String) null, false, false, false, false, false, false, false, false, false, false, false, false, false, LockFreeTaskQueueCore.MAX_CAPACITY_MASK, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.dailyLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.lifetimeLimitRemaining;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component11() {
        return this.limitedByTradeFrequency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.frequencyCheckWindow;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component13() {
        return this.tradeFrequencyLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final EddLimitLevelResponseBean component14() {
        return this.eddLimitLevel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component15() {
        return this.dailyFreqLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component16() {
        return this.weeklyFreqLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component17() {
        return this.monthlyFreqLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component18() {
        return this.unlimitedDailyFreqLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component19() {
        return this.unlimitedDailyLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.weeklyLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component20() {
        return this.unlimitedDailyLimitRemaining;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component21() {
        return this.unlimitedLifetimeLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component22() {
        return this.unlimitedLifetimeLimitRemaining;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component23() {
        return this.unlimitedMonthlyFreqLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component24() {
        return this.unlimitedMonthlyLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component25() {
        return this.unlimitedMonthlyLimitRemaining;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component26() {
        return this.unlimitedSingleTransactionMax;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component27() {
        return this.unlimitedSingleTransactionMin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component28() {
        return this.unlimitedWeeklyFreqLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component29() {
        return this.unlimitedWeeklyLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.monthlyLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component30() {
        return this.unlimitedWeeklyLimitRemaining;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.lifetimeLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.singleTransactionMax;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.singleTransactionMin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.dailyLimitRemaining;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.weeklyLimitRemaining;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.monthlyLimitRemaining;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LimitInfoResponseBean copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, boolean z, @NotNull String str11, @NotNull String str12, EddLimitLevelResponseBean eddLimitLevelResponseBean, @NotNull String str13, @NotNull String str14, @NotNull String str15, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
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
        Intrinsics.checkNotNullParameter(str14, "");
        Intrinsics.checkNotNullParameter(str15, "");
        return new LimitInfoResponseBean(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, z, str11, str12, eddLimitLevelResponseBean, str13, str14, str15, z2, z3, z4, z5, z6, z7, z8, z9, z10, z11, z12, z13, z14);
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
        if (!(obj instanceof LimitInfoResponseBean)) {
            return false;
        }
        LimitInfoResponseBean limitInfoResponseBean = (LimitInfoResponseBean) obj;
        return Intrinsics.EZpvd((Object) this.dailyLimit, (Object) limitInfoResponseBean.dailyLimit) && Intrinsics.EZpvd((Object) this.weeklyLimit, (Object) limitInfoResponseBean.weeklyLimit) && Intrinsics.EZpvd((Object) this.monthlyLimit, (Object) limitInfoResponseBean.monthlyLimit) && Intrinsics.EZpvd((Object) this.lifetimeLimit, (Object) limitInfoResponseBean.lifetimeLimit) && Intrinsics.EZpvd((Object) this.singleTransactionMax, (Object) limitInfoResponseBean.singleTransactionMax) && Intrinsics.EZpvd((Object) this.singleTransactionMin, (Object) limitInfoResponseBean.singleTransactionMin) && Intrinsics.EZpvd((Object) this.dailyLimitRemaining, (Object) limitInfoResponseBean.dailyLimitRemaining) && Intrinsics.EZpvd((Object) this.weeklyLimitRemaining, (Object) limitInfoResponseBean.weeklyLimitRemaining) && Intrinsics.EZpvd((Object) this.monthlyLimitRemaining, (Object) limitInfoResponseBean.monthlyLimitRemaining) && Intrinsics.EZpvd((Object) this.lifetimeLimitRemaining, (Object) limitInfoResponseBean.lifetimeLimitRemaining) && this.limitedByTradeFrequency == limitInfoResponseBean.limitedByTradeFrequency && Intrinsics.EZpvd((Object) this.frequencyCheckWindow, (Object) limitInfoResponseBean.frequencyCheckWindow) && Intrinsics.EZpvd((Object) this.tradeFrequencyLimit, (Object) limitInfoResponseBean.tradeFrequencyLimit) && Intrinsics.EZpvd(this.eddLimitLevel, limitInfoResponseBean.eddLimitLevel) && Intrinsics.EZpvd((Object) this.dailyFreqLimit, (Object) limitInfoResponseBean.dailyFreqLimit) && Intrinsics.EZpvd((Object) this.weeklyFreqLimit, (Object) limitInfoResponseBean.weeklyFreqLimit) && Intrinsics.EZpvd((Object) this.monthlyFreqLimit, (Object) limitInfoResponseBean.monthlyFreqLimit) && this.unlimitedDailyFreqLimit == limitInfoResponseBean.unlimitedDailyFreqLimit && this.unlimitedDailyLimit == limitInfoResponseBean.unlimitedDailyLimit && this.unlimitedDailyLimitRemaining == limitInfoResponseBean.unlimitedDailyLimitRemaining && this.unlimitedLifetimeLimit == limitInfoResponseBean.unlimitedLifetimeLimit && this.unlimitedLifetimeLimitRemaining == limitInfoResponseBean.unlimitedLifetimeLimitRemaining && this.unlimitedMonthlyFreqLimit == limitInfoResponseBean.unlimitedMonthlyFreqLimit && this.unlimitedMonthlyLimit == limitInfoResponseBean.unlimitedMonthlyLimit && this.unlimitedMonthlyLimitRemaining == limitInfoResponseBean.unlimitedMonthlyLimitRemaining && this.unlimitedSingleTransactionMax == limitInfoResponseBean.unlimitedSingleTransactionMax && this.unlimitedSingleTransactionMin == limitInfoResponseBean.unlimitedSingleTransactionMin && this.unlimitedWeeklyFreqLimit == limitInfoResponseBean.unlimitedWeeklyFreqLimit && this.unlimitedWeeklyLimit == limitInfoResponseBean.unlimitedWeeklyLimit && this.unlimitedWeeklyLimitRemaining == limitInfoResponseBean.unlimitedWeeklyLimitRemaining;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDailyFreqLimit() {
        return this.dailyFreqLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDailyLimit() {
        return this.dailyLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDailyLimitRemaining() {
        return this.dailyLimitRemaining;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final EddLimitLevelResponseBean getEddLimitLevel() {
        return this.eddLimitLevel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFrequencyCheckWindow() {
        return this.frequencyCheckWindow;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLifetimeLimit() {
        return this.lifetimeLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLifetimeLimitRemaining() {
        return this.lifetimeLimitRemaining;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getLimitedByTradeFrequency() {
        return this.limitedByTradeFrequency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMonthlyFreqLimit() {
        return this.monthlyFreqLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMonthlyLimit() {
        return this.monthlyLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMonthlyLimitRemaining() {
        return this.monthlyLimitRemaining;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSingleTransactionMax() {
        return this.singleTransactionMax;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSingleTransactionMin() {
        return this.singleTransactionMin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTradeFrequencyLimit() {
        return this.tradeFrequencyLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getUnlimitedDailyFreqLimit() {
        return this.unlimitedDailyFreqLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getUnlimitedDailyLimit() {
        return this.unlimitedDailyLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getUnlimitedDailyLimitRemaining() {
        return this.unlimitedDailyLimitRemaining;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getUnlimitedLifetimeLimit() {
        return this.unlimitedLifetimeLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getUnlimitedLifetimeLimitRemaining() {
        return this.unlimitedLifetimeLimitRemaining;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getUnlimitedMonthlyFreqLimit() {
        return this.unlimitedMonthlyFreqLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getUnlimitedMonthlyLimit() {
        return this.unlimitedMonthlyLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getUnlimitedMonthlyLimitRemaining() {
        return this.unlimitedMonthlyLimitRemaining;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getUnlimitedSingleTransactionMax() {
        return this.unlimitedSingleTransactionMax;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getUnlimitedSingleTransactionMin() {
        return this.unlimitedSingleTransactionMin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getUnlimitedWeeklyFreqLimit() {
        return this.unlimitedWeeklyFreqLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getUnlimitedWeeklyLimit() {
        return this.unlimitedWeeklyLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getUnlimitedWeeklyLimitRemaining() {
        return this.unlimitedWeeklyLimitRemaining;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getWeeklyFreqLimit() {
        return this.weeklyFreqLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getWeeklyLimit() {
        return this.weeklyLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getWeeklyLimitRemaining() {
        return this.weeklyLimitRemaining;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.dailyLimit.hashCode();
        int iHashCode2 = this.weeklyLimit.hashCode();
        int iHashCode3 = this.monthlyLimit.hashCode();
        int iHashCode4 = this.lifetimeLimit.hashCode();
        int iHashCode5 = this.singleTransactionMax.hashCode();
        int iHashCode6 = this.singleTransactionMin.hashCode();
        int iHashCode7 = this.dailyLimitRemaining.hashCode();
        int iHashCode8 = this.weeklyLimitRemaining.hashCode();
        int iHashCode9 = this.monthlyLimitRemaining.hashCode();
        int iHashCode10 = this.lifetimeLimitRemaining.hashCode();
        int iHashCode11 = Boolean.hashCode(this.limitedByTradeFrequency);
        int iHashCode12 = this.frequencyCheckWindow.hashCode();
        int iHashCode13 = this.tradeFrequencyLimit.hashCode();
        EddLimitLevelResponseBean eddLimitLevelResponseBean = this.eddLimitLevel;
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + (eddLimitLevelResponseBean == null ? 0 : eddLimitLevelResponseBean.hashCode())) * 31) + this.dailyFreqLimit.hashCode()) * 31) + this.weeklyFreqLimit.hashCode()) * 31) + this.monthlyFreqLimit.hashCode()) * 31) + Boolean.hashCode(this.unlimitedDailyFreqLimit)) * 31) + Boolean.hashCode(this.unlimitedDailyLimit)) * 31) + Boolean.hashCode(this.unlimitedDailyLimitRemaining)) * 31) + Boolean.hashCode(this.unlimitedLifetimeLimit)) * 31) + Boolean.hashCode(this.unlimitedLifetimeLimitRemaining)) * 31) + Boolean.hashCode(this.unlimitedMonthlyFreqLimit)) * 31) + Boolean.hashCode(this.unlimitedMonthlyLimit)) * 31) + Boolean.hashCode(this.unlimitedMonthlyLimitRemaining)) * 31) + Boolean.hashCode(this.unlimitedSingleTransactionMax)) * 31) + Boolean.hashCode(this.unlimitedSingleTransactionMin)) * 31) + Boolean.hashCode(this.unlimitedWeeklyFreqLimit)) * 31) + Boolean.hashCode(this.unlimitedWeeklyLimit)) * 31) + Boolean.hashCode(this.unlimitedWeeklyLimitRemaining);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "LimitInfoResponseBean(dailyLimit=" + this.dailyLimit + ", weeklyLimit=" + this.weeklyLimit + ", monthlyLimit=" + this.monthlyLimit + ", lifetimeLimit=" + this.lifetimeLimit + ", singleTransactionMax=" + this.singleTransactionMax + ", singleTransactionMin=" + this.singleTransactionMin + ", dailyLimitRemaining=" + this.dailyLimitRemaining + ", weeklyLimitRemaining=" + this.weeklyLimitRemaining + ", monthlyLimitRemaining=" + this.monthlyLimitRemaining + ", lifetimeLimitRemaining=" + this.lifetimeLimitRemaining + ", limitedByTradeFrequency=" + this.limitedByTradeFrequency + ", frequencyCheckWindow=" + this.frequencyCheckWindow + ", tradeFrequencyLimit=" + this.tradeFrequencyLimit + ", eddLimitLevel=" + this.eddLimitLevel + ", dailyFreqLimit=" + this.dailyFreqLimit + ", weeklyFreqLimit=" + this.weeklyFreqLimit + ", monthlyFreqLimit=" + this.monthlyFreqLimit + ", unlimitedDailyFreqLimit=" + this.unlimitedDailyFreqLimit + ", unlimitedDailyLimit=" + this.unlimitedDailyLimit + ", unlimitedDailyLimitRemaining=" + this.unlimitedDailyLimitRemaining + ", unlimitedLifetimeLimit=" + this.unlimitedLifetimeLimit + ", unlimitedLifetimeLimitRemaining=" + this.unlimitedLifetimeLimitRemaining + ", unlimitedMonthlyFreqLimit=" + this.unlimitedMonthlyFreqLimit + ", unlimitedMonthlyLimit=" + this.unlimitedMonthlyLimit + ", unlimitedMonthlyLimitRemaining=" + this.unlimitedMonthlyLimitRemaining + ", unlimitedSingleTransactionMax=" + this.unlimitedSingleTransactionMax + ", unlimitedSingleTransactionMin=" + this.unlimitedSingleTransactionMin + ", unlimitedWeeklyFreqLimit=" + this.unlimitedWeeklyFreqLimit + ", unlimitedWeeklyLimit=" + this.unlimitedWeeklyLimit + ", unlimitedWeeklyLimitRemaining=" + this.unlimitedWeeklyLimitRemaining + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.dailyLimit);
        parcel.writeString(this.weeklyLimit);
        parcel.writeString(this.monthlyLimit);
        parcel.writeString(this.lifetimeLimit);
        parcel.writeString(this.singleTransactionMax);
        parcel.writeString(this.singleTransactionMin);
        parcel.writeString(this.dailyLimitRemaining);
        parcel.writeString(this.weeklyLimitRemaining);
        parcel.writeString(this.monthlyLimitRemaining);
        parcel.writeString(this.lifetimeLimitRemaining);
        parcel.writeInt(this.limitedByTradeFrequency ? 1 : 0);
        parcel.writeString(this.frequencyCheckWindow);
        parcel.writeString(this.tradeFrequencyLimit);
        EddLimitLevelResponseBean eddLimitLevelResponseBean = this.eddLimitLevel;
        if (eddLimitLevelResponseBean == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            eddLimitLevelResponseBean.writeToParcel(parcel, i);
        }
        parcel.writeString(this.dailyFreqLimit);
        parcel.writeString(this.weeklyFreqLimit);
        parcel.writeString(this.monthlyFreqLimit);
        parcel.writeInt(this.unlimitedDailyFreqLimit ? 1 : 0);
        parcel.writeInt(this.unlimitedDailyLimit ? 1 : 0);
        parcel.writeInt(this.unlimitedDailyLimitRemaining ? 1 : 0);
        parcel.writeInt(this.unlimitedLifetimeLimit ? 1 : 0);
        parcel.writeInt(this.unlimitedLifetimeLimitRemaining ? 1 : 0);
        parcel.writeInt(this.unlimitedMonthlyFreqLimit ? 1 : 0);
        parcel.writeInt(this.unlimitedMonthlyLimit ? 1 : 0);
        parcel.writeInt(this.unlimitedMonthlyLimitRemaining ? 1 : 0);
        parcel.writeInt(this.unlimitedSingleTransactionMax ? 1 : 0);
        parcel.writeInt(this.unlimitedSingleTransactionMin ? 1 : 0);
        parcel.writeInt(this.unlimitedWeeklyFreqLimit ? 1 : 0);
        parcel.writeInt(this.unlimitedWeeklyLimit ? 1 : 0);
        parcel.writeInt(this.unlimitedWeeklyLimitRemaining ? 1 : 0);
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.crcore.coreapi.net.responsebean.bsc.LimitInfoResponseBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<LimitInfoResponseBean> serializer() {
            return LimitInfoResponseBean$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ LimitInfoResponseBean(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, boolean z, String str11, String str12, EddLimitLevelResponseBean eddLimitLevelResponseBean, String str13, String str14, String str15, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.dailyLimit = "";
        } else {
            this.dailyLimit = str;
        }
        if ((i & 2) == 0) {
            this.weeklyLimit = "";
        } else {
            this.weeklyLimit = str2;
        }
        if ((i & 4) == 0) {
            this.monthlyLimit = "";
        } else {
            this.monthlyLimit = str3;
        }
        if ((i & 8) == 0) {
            this.lifetimeLimit = "";
        } else {
            this.lifetimeLimit = str4;
        }
        if ((i & 16) == 0) {
            this.singleTransactionMax = "";
        } else {
            this.singleTransactionMax = str5;
        }
        if ((i & 32) == 0) {
            this.singleTransactionMin = "";
        } else {
            this.singleTransactionMin = str6;
        }
        if ((i & 64) == 0) {
            this.dailyLimitRemaining = "";
        } else {
            this.dailyLimitRemaining = str7;
        }
        if ((i & 128) == 0) {
            this.weeklyLimitRemaining = "";
        } else {
            this.weeklyLimitRemaining = str8;
        }
        if ((i & 256) == 0) {
            this.monthlyLimitRemaining = "";
        } else {
            this.monthlyLimitRemaining = str9;
        }
        if ((i & 512) == 0) {
            this.lifetimeLimitRemaining = "";
        } else {
            this.lifetimeLimitRemaining = str10;
        }
        this.limitedByTradeFrequency = (i & 1024) == 0 ? false : z;
        if ((i & 2048) == 0) {
            this.frequencyCheckWindow = "";
        } else {
            this.frequencyCheckWindow = str11;
        }
        if ((i & 4096) == 0) {
            this.tradeFrequencyLimit = "";
        } else {
            this.tradeFrequencyLimit = str12;
        }
        this.eddLimitLevel = (i & 8192) == 0 ? null : eddLimitLevelResponseBean;
        if ((i & 16384) == 0) {
            this.dailyFreqLimit = "";
        } else {
            this.dailyFreqLimit = str13;
        }
        if ((32768 & i) == 0) {
            this.weeklyFreqLimit = "";
        } else {
            this.weeklyFreqLimit = str14;
        }
        if ((65536 & i) == 0) {
            this.monthlyFreqLimit = "";
        } else {
            this.monthlyFreqLimit = str15;
        }
        if ((131072 & i) == 0) {
            this.unlimitedDailyFreqLimit = true;
        } else {
            this.unlimitedDailyFreqLimit = z2;
        }
        if ((262144 & i) == 0) {
            this.unlimitedDailyLimit = true;
        } else {
            this.unlimitedDailyLimit = z3;
        }
        if ((524288 & i) == 0) {
            this.unlimitedDailyLimitRemaining = true;
        } else {
            this.unlimitedDailyLimitRemaining = z4;
        }
        if ((1048576 & i) == 0) {
            this.unlimitedLifetimeLimit = true;
        } else {
            this.unlimitedLifetimeLimit = z5;
        }
        if ((2097152 & i) == 0) {
            this.unlimitedLifetimeLimitRemaining = true;
        } else {
            this.unlimitedLifetimeLimitRemaining = z6;
        }
        if ((4194304 & i) == 0) {
            this.unlimitedMonthlyFreqLimit = true;
        } else {
            this.unlimitedMonthlyFreqLimit = z7;
        }
        if ((8388608 & i) == 0) {
            this.unlimitedMonthlyLimit = true;
        } else {
            this.unlimitedMonthlyLimit = z8;
        }
        if ((16777216 & i) == 0) {
            this.unlimitedMonthlyLimitRemaining = true;
        } else {
            this.unlimitedMonthlyLimitRemaining = z9;
        }
        if ((33554432 & i) == 0) {
            this.unlimitedSingleTransactionMax = true;
        } else {
            this.unlimitedSingleTransactionMax = z10;
        }
        if ((67108864 & i) == 0) {
            this.unlimitedSingleTransactionMin = true;
        } else {
            this.unlimitedSingleTransactionMin = z11;
        }
        if ((134217728 & i) == 0) {
            this.unlimitedWeeklyFreqLimit = true;
        } else {
            this.unlimitedWeeklyFreqLimit = z12;
        }
        if ((268435456 & i) == 0) {
            this.unlimitedWeeklyLimit = true;
        } else {
            this.unlimitedWeeklyLimit = z13;
        }
        if ((i & 536870912) == 0) {
            this.unlimitedWeeklyLimitRemaining = true;
        } else {
            this.unlimitedWeeklyLimitRemaining = z14;
        }
    }

    public static final /* synthetic */ void write$Self$OKCRCore_cr_core(LimitInfoResponseBean limitInfoResponseBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) limitInfoResponseBean.dailyLimit, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, limitInfoResponseBean.dailyLimit);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) limitInfoResponseBean.weeklyLimit, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, limitInfoResponseBean.weeklyLimit);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) limitInfoResponseBean.monthlyLimit, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, limitInfoResponseBean.monthlyLimit);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) limitInfoResponseBean.lifetimeLimit, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, limitInfoResponseBean.lifetimeLimit);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) limitInfoResponseBean.singleTransactionMax, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, limitInfoResponseBean.singleTransactionMax);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) limitInfoResponseBean.singleTransactionMin, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, limitInfoResponseBean.singleTransactionMin);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) limitInfoResponseBean.dailyLimitRemaining, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, limitInfoResponseBean.dailyLimitRemaining);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) limitInfoResponseBean.weeklyLimitRemaining, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 7, limitInfoResponseBean.weeklyLimitRemaining);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd((Object) limitInfoResponseBean.monthlyLimitRemaining, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 8, limitInfoResponseBean.monthlyLimitRemaining);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || !Intrinsics.EZpvd((Object) limitInfoResponseBean.lifetimeLimitRemaining, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 9, limitInfoResponseBean.lifetimeLimitRemaining);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || limitInfoResponseBean.limitedByTradeFrequency) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 10, limitInfoResponseBean.limitedByTradeFrequency);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || !Intrinsics.EZpvd((Object) limitInfoResponseBean.frequencyCheckWindow, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 11, limitInfoResponseBean.frequencyCheckWindow);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || !Intrinsics.EZpvd((Object) limitInfoResponseBean.tradeFrequencyLimit, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 12, limitInfoResponseBean.tradeFrequencyLimit);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || limitInfoResponseBean.eddLimitLevel != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 13, EddLimitLevelResponseBean$$serializer.INSTANCE, limitInfoResponseBean.eddLimitLevel);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || !Intrinsics.EZpvd((Object) limitInfoResponseBean.dailyFreqLimit, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 14, limitInfoResponseBean.dailyFreqLimit);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) || !Intrinsics.EZpvd((Object) limitInfoResponseBean.weeklyFreqLimit, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 15, limitInfoResponseBean.weeklyFreqLimit);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) || !Intrinsics.EZpvd((Object) limitInfoResponseBean.monthlyFreqLimit, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 16, limitInfoResponseBean.monthlyFreqLimit);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 17) || !limitInfoResponseBean.unlimitedDailyFreqLimit) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 17, limitInfoResponseBean.unlimitedDailyFreqLimit);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 18) || !limitInfoResponseBean.unlimitedDailyLimit) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 18, limitInfoResponseBean.unlimitedDailyLimit);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 19) || !limitInfoResponseBean.unlimitedDailyLimitRemaining) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 19, limitInfoResponseBean.unlimitedDailyLimitRemaining);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 20) || !limitInfoResponseBean.unlimitedLifetimeLimit) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 20, limitInfoResponseBean.unlimitedLifetimeLimit);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 21) || !limitInfoResponseBean.unlimitedLifetimeLimitRemaining) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 21, limitInfoResponseBean.unlimitedLifetimeLimitRemaining);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 22) || !limitInfoResponseBean.unlimitedMonthlyFreqLimit) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 22, limitInfoResponseBean.unlimitedMonthlyFreqLimit);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 23) || !limitInfoResponseBean.unlimitedMonthlyLimit) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 23, limitInfoResponseBean.unlimitedMonthlyLimit);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 24) || !limitInfoResponseBean.unlimitedMonthlyLimitRemaining) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 24, limitInfoResponseBean.unlimitedMonthlyLimitRemaining);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 25) || !limitInfoResponseBean.unlimitedSingleTransactionMax) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 25, limitInfoResponseBean.unlimitedSingleTransactionMax);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 26) || !limitInfoResponseBean.unlimitedSingleTransactionMin) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 26, limitInfoResponseBean.unlimitedSingleTransactionMin);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 27) || !limitInfoResponseBean.unlimitedWeeklyFreqLimit) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 27, limitInfoResponseBean.unlimitedWeeklyFreqLimit);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 28) || !limitInfoResponseBean.unlimitedWeeklyLimit) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 28, limitInfoResponseBean.unlimitedWeeklyLimit);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 29) && limitInfoResponseBean.unlimitedWeeklyLimitRemaining) {
            return;
        }
        compositeEncoder.encodeBooleanElement(serialDescriptor, 29, limitInfoResponseBean.unlimitedWeeklyLimitRemaining);
    }

    public LimitInfoResponseBean(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, boolean z, @NotNull String str11, @NotNull String str12, EddLimitLevelResponseBean eddLimitLevelResponseBean, @NotNull String str13, @NotNull String str14, @NotNull String str15, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
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
        Intrinsics.checkNotNullParameter(str14, "");
        Intrinsics.checkNotNullParameter(str15, "");
        this.dailyLimit = str;
        this.weeklyLimit = str2;
        this.monthlyLimit = str3;
        this.lifetimeLimit = str4;
        this.singleTransactionMax = str5;
        this.singleTransactionMin = str6;
        this.dailyLimitRemaining = str7;
        this.weeklyLimitRemaining = str8;
        this.monthlyLimitRemaining = str9;
        this.lifetimeLimitRemaining = str10;
        this.limitedByTradeFrequency = z;
        this.frequencyCheckWindow = str11;
        this.tradeFrequencyLimit = str12;
        this.eddLimitLevel = eddLimitLevelResponseBean;
        this.dailyFreqLimit = str13;
        this.weeklyFreqLimit = str14;
        this.monthlyFreqLimit = str15;
        this.unlimitedDailyFreqLimit = z2;
        this.unlimitedDailyLimit = z3;
        this.unlimitedDailyLimitRemaining = z4;
        this.unlimitedLifetimeLimit = z5;
        this.unlimitedLifetimeLimitRemaining = z6;
        this.unlimitedMonthlyFreqLimit = z7;
        this.unlimitedMonthlyLimit = z8;
        this.unlimitedMonthlyLimitRemaining = z9;
        this.unlimitedSingleTransactionMax = z10;
        this.unlimitedSingleTransactionMin = z11;
        this.unlimitedWeeklyFreqLimit = z12;
        this.unlimitedWeeklyLimit = z13;
        this.unlimitedWeeklyLimitRemaining = z14;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0163: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r63v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r33v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r63v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r34v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0014: ARITH (r63v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r35v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001c: ARITH (r63v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r36v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0024: ARITH (r63v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r37v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002c: ARITH (r63v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r38v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0034: ARITH (r63v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r39v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003c: ARITH (r63v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r40v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0044: ARITH (r63v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r41v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004c: ARITH (r63v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? ("") : (r42v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0054: ARITH (r63v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? false : (r43v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x005c: ARITH (r63v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? ("") : (r44v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0064: ARITH (r63v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? ("") : (r45v0 java.lang.String))
  (wrap:com.okinc.crcore.coreapi.net.responsebean.bsc.EddLimitLevelResponseBean:?: TERNARY null = ((wrap:int:0x006c: ARITH (r63v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.crcore.coreapi.net.responsebean.bsc.EddLimitLevelResponseBean) : (r46v0 com.okinc.crcore.coreapi.net.responsebean.bsc.EddLimitLevelResponseBean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0076: ARITH (r63v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? ("") : (r47v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0082: ARITH (r63v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? ("") : (r48v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x008d: ARITH (r63v0 int) & (65536 int) A[WRAPPED]) != (0 int)) ? ("") : (r49v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0098: ARITH (r63v0 int) & (131072 int) A[WRAPPED]) != (0 int)) ? true : (r50v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x00a5: ARITH (r63v0 int) & (262144 int) A[WRAPPED]) != (0 int)) ? true : (r51v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x00b0: ARITH (r63v0 int) & (524288 int) A[WRAPPED]) != (0 int)) ? true : (r52v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x00bb: ARITH (r63v0 int) & (1048576 int) A[WRAPPED]) != (0 int)) ? true : (r53v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x00c6: ARITH (r63v0 int) & (2097152 int) A[WRAPPED]) != (0 int)) ? true : (r54v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x00d1: ARITH (r63v0 int) & (4194304 int) A[WRAPPED]) != (0 int)) ? true : (r55v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x00dc: ARITH (r63v0 int) & (8388608 int) A[WRAPPED]) != (0 int)) ? true : (r56v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x00e7: ARITH (r63v0 int) & (16777216 int) A[WRAPPED]) != (0 int)) ? true : (r57v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x00f2: ARITH (r63v0 int) & (wrap:??:SGET  A[WRAPPED] com.google.api.client.googleapis.media.MediaHttpDownloader.MAXIMUM_CHUNK_SIZE int) A[WRAPPED]) != (0 int)) ? true : (r58v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x00fd: ARITH (r63v0 int) & (67108864 int) A[WRAPPED]) != (0 int)) ? true : (r59v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0108: ARITH (r63v0 int) & (134217728 int) A[WRAPPED]) != (0 int)) ? true : (r60v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0113: ARITH (r63v0 int) & (268435456 int) A[WRAPPED]) != (0 int)) ? true : (r61v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x011e: ARITH (r63v0 int) & (536870912 int) A[WRAPPED]) == (0 int)) ? (r62v0 boolean) : true)
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, com.okinc.crcore.coreapi.net.responsebean.bsc.EddLimitLevelResponseBean, java.lang.String, java.lang.String, java.lang.String, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean):void (m)] (LINE:11) call: com.okinc.crcore.coreapi.net.responsebean.bsc.LimitInfoResponseBean.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, com.okinc.crcore.coreapi.net.responsebean.bsc.EddLimitLevelResponseBean, java.lang.String, java.lang.String, java.lang.String, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean):void type: THIS */
    public /* synthetic */ LimitInfoResponseBean(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, boolean z, String str11, String str12, EddLimitLevelResponseBean eddLimitLevelResponseBean, String str13, String str14, String str15, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7, (i & 128) != 0 ? "" : str8, (i & 256) != 0 ? "" : str9, (i & 512) != 0 ? "" : str10, (i & 1024) != 0 ? false : z, (i & 2048) != 0 ? "" : str11, (i & 4096) != 0 ? "" : str12, (i & 8192) != 0 ? null : eddLimitLevelResponseBean, (i & 16384) != 0 ? "" : str13, (i & 32768) != 0 ? "" : str14, (i & 65536) != 0 ? "" : str15, (i & 131072) != 0 ? true : z2, (i & 262144) != 0 ? true : z3, (i & 524288) != 0 ? true : z4, (i & 1048576) != 0 ? true : z5, (i & 2097152) != 0 ? true : z6, (i & 4194304) != 0 ? true : z7, (i & 8388608) != 0 ? true : z8, (i & 16777216) != 0 ? true : z9, (i & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? true : z10, (i & 67108864) != 0 ? true : z11, (i & 134217728) != 0 ? true : z12, (i & 268435456) != 0 ? true : z13, (i & 536870912) == 0 ? z14 : true);
    }
}
