package com.okinc.business.market.features.meme.filter.domain;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.api.client.googleapis.media.MediaHttpDownloader;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Serializable
public final class MemeFilter implements Parcelable {
    private final String bondingMax;
    private final String bondingMin;
    private final String bundleMax;
    private final String bundleMin;
    private final String buyMax;
    private final String buyMin;
    private final String devHoldingMax;
    private final String devHoldingMin;
    private final String freshHoldMax;
    private final String freshHoldMin;
    private final String holdersMax;
    private final String holdersMin;
    private final String insiderMax;
    private final String insiderMin;
    private final String keyword;
    private final String keywordExclude;
    private final int lastTab;
    private final String marketCapMax;
    private final String marketCapMin;
    private final String migratedTokensMax;
    private final String migratedTokensMin;
    private final String phishHoldMax;
    private final String phishHoldMin;
    private final List<String> selectedSocialData;
    private final String sellMax;
    private final String sellMin;
    private final String sniperMax;
    private final String sniperMin;
    private final String tokenAgeMax;
    private final String tokenAgeMin;
    private final TokenAgeType tokenAgeUnit;
    private final String top10HoldingMax;
    private final String top10HoldingMin;
    private final String transactionsMax;
    private final String transactionsMin;
    private final String volumeMax;
    private final String volumeMin;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<MemeFilter> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, EnumsKt.createSimpleEnumSerializer("com.okinc.business.market.features.meme.filter.domain.TokenAgeType", TokenAgeType.values()), null, null, null, null, null, null, null, null, new ArrayListSerializer(StringSerializer.INSTANCE), null};

    public static final class Creator implements Parcelable.Creator<MemeFilter> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MemeFilter createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new MemeFilter(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), TokenAgeType.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.createStringArrayList(), parcel.readInt());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MemeFilter[] newArray(int i) {
            return new MemeFilter[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public MemeFilter() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (TokenAgeType) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, 0, -1, 31, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.top10HoldingMin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.bundleMax;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.freshHoldMin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.freshHoldMax;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component13() {
        return this.phishHoldMin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component14() {
        return this.phishHoldMax;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component15() {
        return this.bondingMin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component16() {
        return this.bondingMax;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component17() {
        return this.migratedTokensMin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component18() {
        return this.migratedTokensMax;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component19() {
        return this.marketCapMin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.top10HoldingMax;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component20() {
        return this.marketCapMax;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component21() {
        return this.volumeMin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component22() {
        return this.volumeMax;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component23() {
        return this.holdersMin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component24() {
        return this.holdersMax;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component25() {
        return this.tokenAgeMin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component26() {
        return this.tokenAgeMax;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TokenAgeType component27() {
        return this.tokenAgeUnit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component28() {
        return this.transactionsMin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component29() {
        return this.transactionsMax;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.devHoldingMin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component30() {
        return this.buyMin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component31() {
        return this.buyMax;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component32() {
        return this.sellMin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component33() {
        return this.sellMax;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component34() {
        return this.keyword;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component35() {
        return this.keywordExclude;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component36() {
        return this.selectedSocialData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component37() {
        return this.lastTab;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.devHoldingMax;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.insiderMin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.insiderMax;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.sniperMin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.sniperMax;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.bundleMin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MemeFilter copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13, @NotNull String str14, @NotNull String str15, @NotNull String str16, @NotNull String str17, @NotNull String str18, @NotNull String str19, @NotNull String str20, @NotNull String str21, @NotNull String str22, @NotNull String str23, @NotNull String str24, @NotNull String str25, @NotNull String str26, @NotNull TokenAgeType tokenAgeType, @NotNull String str27, @NotNull String str28, @NotNull String str29, @NotNull String str30, @NotNull String str31, @NotNull String str32, @NotNull String str33, @NotNull String str34, @NotNull List<String> list, int i) {
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
        Intrinsics.checkNotNullParameter(str16, "");
        Intrinsics.checkNotNullParameter(str17, "");
        Intrinsics.checkNotNullParameter(str18, "");
        Intrinsics.checkNotNullParameter(str19, "");
        Intrinsics.checkNotNullParameter(str20, "");
        Intrinsics.checkNotNullParameter(str21, "");
        Intrinsics.checkNotNullParameter(str22, "");
        Intrinsics.checkNotNullParameter(str23, "");
        Intrinsics.checkNotNullParameter(str24, "");
        Intrinsics.checkNotNullParameter(str25, "");
        Intrinsics.checkNotNullParameter(str26, "");
        Intrinsics.checkNotNullParameter(tokenAgeType, "");
        Intrinsics.checkNotNullParameter(str27, "");
        Intrinsics.checkNotNullParameter(str28, "");
        Intrinsics.checkNotNullParameter(str29, "");
        Intrinsics.checkNotNullParameter(str30, "");
        Intrinsics.checkNotNullParameter(str31, "");
        Intrinsics.checkNotNullParameter(str32, "");
        Intrinsics.checkNotNullParameter(str33, "");
        Intrinsics.checkNotNullParameter(str34, "");
        Intrinsics.checkNotNullParameter(list, "");
        return new MemeFilter(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, str17, str18, str19, str20, str21, str22, str23, str24, str25, str26, tokenAgeType, str27, str28, str29, str30, str31, str32, str33, str34, list, i);
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
        if (!(obj instanceof MemeFilter)) {
            return false;
        }
        MemeFilter memeFilter = (MemeFilter) obj;
        return Intrinsics.EZpvd((Object) this.top10HoldingMin, (Object) memeFilter.top10HoldingMin) && Intrinsics.EZpvd((Object) this.top10HoldingMax, (Object) memeFilter.top10HoldingMax) && Intrinsics.EZpvd((Object) this.devHoldingMin, (Object) memeFilter.devHoldingMin) && Intrinsics.EZpvd((Object) this.devHoldingMax, (Object) memeFilter.devHoldingMax) && Intrinsics.EZpvd((Object) this.insiderMin, (Object) memeFilter.insiderMin) && Intrinsics.EZpvd((Object) this.insiderMax, (Object) memeFilter.insiderMax) && Intrinsics.EZpvd((Object) this.sniperMin, (Object) memeFilter.sniperMin) && Intrinsics.EZpvd((Object) this.sniperMax, (Object) memeFilter.sniperMax) && Intrinsics.EZpvd((Object) this.bundleMin, (Object) memeFilter.bundleMin) && Intrinsics.EZpvd((Object) this.bundleMax, (Object) memeFilter.bundleMax) && Intrinsics.EZpvd((Object) this.freshHoldMin, (Object) memeFilter.freshHoldMin) && Intrinsics.EZpvd((Object) this.freshHoldMax, (Object) memeFilter.freshHoldMax) && Intrinsics.EZpvd((Object) this.phishHoldMin, (Object) memeFilter.phishHoldMin) && Intrinsics.EZpvd((Object) this.phishHoldMax, (Object) memeFilter.phishHoldMax) && Intrinsics.EZpvd((Object) this.bondingMin, (Object) memeFilter.bondingMin) && Intrinsics.EZpvd((Object) this.bondingMax, (Object) memeFilter.bondingMax) && Intrinsics.EZpvd((Object) this.migratedTokensMin, (Object) memeFilter.migratedTokensMin) && Intrinsics.EZpvd((Object) this.migratedTokensMax, (Object) memeFilter.migratedTokensMax) && Intrinsics.EZpvd((Object) this.marketCapMin, (Object) memeFilter.marketCapMin) && Intrinsics.EZpvd((Object) this.marketCapMax, (Object) memeFilter.marketCapMax) && Intrinsics.EZpvd((Object) this.volumeMin, (Object) memeFilter.volumeMin) && Intrinsics.EZpvd((Object) this.volumeMax, (Object) memeFilter.volumeMax) && Intrinsics.EZpvd((Object) this.holdersMin, (Object) memeFilter.holdersMin) && Intrinsics.EZpvd((Object) this.holdersMax, (Object) memeFilter.holdersMax) && Intrinsics.EZpvd((Object) this.tokenAgeMin, (Object) memeFilter.tokenAgeMin) && Intrinsics.EZpvd((Object) this.tokenAgeMax, (Object) memeFilter.tokenAgeMax) && this.tokenAgeUnit == memeFilter.tokenAgeUnit && Intrinsics.EZpvd((Object) this.transactionsMin, (Object) memeFilter.transactionsMin) && Intrinsics.EZpvd((Object) this.transactionsMax, (Object) memeFilter.transactionsMax) && Intrinsics.EZpvd((Object) this.buyMin, (Object) memeFilter.buyMin) && Intrinsics.EZpvd((Object) this.buyMax, (Object) memeFilter.buyMax) && Intrinsics.EZpvd((Object) this.sellMin, (Object) memeFilter.sellMin) && Intrinsics.EZpvd((Object) this.sellMax, (Object) memeFilter.sellMax) && Intrinsics.EZpvd((Object) this.keyword, (Object) memeFilter.keyword) && Intrinsics.EZpvd((Object) this.keywordExclude, (Object) memeFilter.keywordExclude) && Intrinsics.EZpvd(this.selectedSocialData, memeFilter.selectedSocialData) && this.lastTab == memeFilter.lastTab;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBondingMax() {
        return this.bondingMax;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBondingMin() {
        return this.bondingMin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBundleMax() {
        return this.bundleMax;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBundleMin() {
        return this.bundleMin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBuyMax() {
        return this.buyMax;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBuyMin() {
        return this.buyMin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDevHoldingMax() {
        return this.devHoldingMax;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDevHoldingMin() {
        return this.devHoldingMin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFreshHoldMax() {
        return this.freshHoldMax;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFreshHoldMin() {
        return this.freshHoldMin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getHoldersMax() {
        return this.holdersMax;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getHoldersMin() {
        return this.holdersMin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInsiderMax() {
        return this.insiderMax;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInsiderMin() {
        return this.insiderMin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getKeyword() {
        return this.keyword;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getKeywordExclude() {
        return this.keywordExclude;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getLastTab() {
        return this.lastTab;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMarketCapMax() {
        return this.marketCapMax;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMarketCapMin() {
        return this.marketCapMin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMigratedTokensMax() {
        return this.migratedTokensMax;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMigratedTokensMin() {
        return this.migratedTokensMin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPhishHoldMax() {
        return this.phishHoldMax;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPhishHoldMin() {
        return this.phishHoldMin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> getSelectedSocialData() {
        return this.selectedSocialData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSellMax() {
        return this.sellMax;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSellMin() {
        return this.sellMin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSniperMax() {
        return this.sniperMax;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSniperMin() {
        return this.sniperMin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenAgeMax() {
        return this.tokenAgeMax;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenAgeMin() {
        return this.tokenAgeMin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TokenAgeType getTokenAgeUnit() {
        return this.tokenAgeUnit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTop10HoldingMax() {
        return this.top10HoldingMax;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTop10HoldingMin() {
        return this.top10HoldingMin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTransactionsMax() {
        return this.transactionsMax;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTransactionsMin() {
        return this.transactionsMin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getVolumeMax() {
        return this.volumeMax;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getVolumeMin() {
        return this.volumeMin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((this.top10HoldingMin.hashCode() * 31) + this.top10HoldingMax.hashCode()) * 31) + this.devHoldingMin.hashCode()) * 31) + this.devHoldingMax.hashCode()) * 31) + this.insiderMin.hashCode()) * 31) + this.insiderMax.hashCode()) * 31) + this.sniperMin.hashCode()) * 31) + this.sniperMax.hashCode()) * 31) + this.bundleMin.hashCode()) * 31) + this.bundleMax.hashCode()) * 31) + this.freshHoldMin.hashCode()) * 31) + this.freshHoldMax.hashCode()) * 31) + this.phishHoldMin.hashCode()) * 31) + this.phishHoldMax.hashCode()) * 31) + this.bondingMin.hashCode()) * 31) + this.bondingMax.hashCode()) * 31) + this.migratedTokensMin.hashCode()) * 31) + this.migratedTokensMax.hashCode()) * 31) + this.marketCapMin.hashCode()) * 31) + this.marketCapMax.hashCode()) * 31) + this.volumeMin.hashCode()) * 31) + this.volumeMax.hashCode()) * 31) + this.holdersMin.hashCode()) * 31) + this.holdersMax.hashCode()) * 31) + this.tokenAgeMin.hashCode()) * 31) + this.tokenAgeMax.hashCode()) * 31) + this.tokenAgeUnit.hashCode()) * 31) + this.transactionsMin.hashCode()) * 31) + this.transactionsMax.hashCode()) * 31) + this.buyMin.hashCode()) * 31) + this.buyMax.hashCode()) * 31) + this.sellMin.hashCode()) * 31) + this.sellMax.hashCode()) * 31) + this.keyword.hashCode()) * 31) + this.keywordExclude.hashCode()) * 31) + this.selectedSocialData.hashCode()) * 31) + Integer.hashCode(this.lastTab);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "MemeFilter(top10HoldingMin=" + this.top10HoldingMin + ", top10HoldingMax=" + this.top10HoldingMax + ", devHoldingMin=" + this.devHoldingMin + ", devHoldingMax=" + this.devHoldingMax + ", insiderMin=" + this.insiderMin + ", insiderMax=" + this.insiderMax + ", sniperMin=" + this.sniperMin + ", sniperMax=" + this.sniperMax + ", bundleMin=" + this.bundleMin + ", bundleMax=" + this.bundleMax + ", freshHoldMin=" + this.freshHoldMin + ", freshHoldMax=" + this.freshHoldMax + ", phishHoldMin=" + this.phishHoldMin + ", phishHoldMax=" + this.phishHoldMax + ", bondingMin=" + this.bondingMin + ", bondingMax=" + this.bondingMax + ", migratedTokensMin=" + this.migratedTokensMin + ", migratedTokensMax=" + this.migratedTokensMax + ", marketCapMin=" + this.marketCapMin + ", marketCapMax=" + this.marketCapMax + ", volumeMin=" + this.volumeMin + ", volumeMax=" + this.volumeMax + ", holdersMin=" + this.holdersMin + ", holdersMax=" + this.holdersMax + ", tokenAgeMin=" + this.tokenAgeMin + ", tokenAgeMax=" + this.tokenAgeMax + ", tokenAgeUnit=" + this.tokenAgeUnit + ", transactionsMin=" + this.transactionsMin + ", transactionsMax=" + this.transactionsMax + ", buyMin=" + this.buyMin + ", buyMax=" + this.buyMax + ", sellMin=" + this.sellMin + ", sellMax=" + this.sellMax + ", keyword=" + this.keyword + ", keywordExclude=" + this.keywordExclude + ", selectedSocialData=" + this.selectedSocialData + ", lastTab=" + this.lastTab + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.top10HoldingMin);
        parcel.writeString(this.top10HoldingMax);
        parcel.writeString(this.devHoldingMin);
        parcel.writeString(this.devHoldingMax);
        parcel.writeString(this.insiderMin);
        parcel.writeString(this.insiderMax);
        parcel.writeString(this.sniperMin);
        parcel.writeString(this.sniperMax);
        parcel.writeString(this.bundleMin);
        parcel.writeString(this.bundleMax);
        parcel.writeString(this.freshHoldMin);
        parcel.writeString(this.freshHoldMax);
        parcel.writeString(this.phishHoldMin);
        parcel.writeString(this.phishHoldMax);
        parcel.writeString(this.bondingMin);
        parcel.writeString(this.bondingMax);
        parcel.writeString(this.migratedTokensMin);
        parcel.writeString(this.migratedTokensMax);
        parcel.writeString(this.marketCapMin);
        parcel.writeString(this.marketCapMax);
        parcel.writeString(this.volumeMin);
        parcel.writeString(this.volumeMax);
        parcel.writeString(this.holdersMin);
        parcel.writeString(this.holdersMax);
        parcel.writeString(this.tokenAgeMin);
        parcel.writeString(this.tokenAgeMax);
        parcel.writeString(this.tokenAgeUnit.name());
        parcel.writeString(this.transactionsMin);
        parcel.writeString(this.transactionsMax);
        parcel.writeString(this.buyMin);
        parcel.writeString(this.buyMax);
        parcel.writeString(this.sellMin);
        parcel.writeString(this.sellMax);
        parcel.writeString(this.keyword);
        parcel.writeString(this.keywordExclude);
        parcel.writeStringList(this.selectedSocialData);
        parcel.writeInt(this.lastTab);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.market.features.meme.filter.domain.MemeFilter.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<MemeFilter> serializer() {
            return MemeFilter$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ MemeFilter(int i, int i2, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, TokenAgeType tokenAgeType, String str27, String str28, String str29, String str30, String str31, String str32, String str33, String str34, List list, int i3, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.top10HoldingMin = "";
        } else {
            this.top10HoldingMin = str;
        }
        if ((i & 2) == 0) {
            this.top10HoldingMax = "";
        } else {
            this.top10HoldingMax = str2;
        }
        if ((i & 4) == 0) {
            this.devHoldingMin = "";
        } else {
            this.devHoldingMin = str3;
        }
        if ((i & 8) == 0) {
            this.devHoldingMax = "";
        } else {
            this.devHoldingMax = str4;
        }
        if ((i & 16) == 0) {
            this.insiderMin = "";
        } else {
            this.insiderMin = str5;
        }
        if ((i & 32) == 0) {
            this.insiderMax = "";
        } else {
            this.insiderMax = str6;
        }
        if ((i & 64) == 0) {
            this.sniperMin = "";
        } else {
            this.sniperMin = str7;
        }
        if ((i & 128) == 0) {
            this.sniperMax = "";
        } else {
            this.sniperMax = str8;
        }
        if ((i & 256) == 0) {
            this.bundleMin = "";
        } else {
            this.bundleMin = str9;
        }
        if ((i & 512) == 0) {
            this.bundleMax = "";
        } else {
            this.bundleMax = str10;
        }
        if ((i & 1024) == 0) {
            this.freshHoldMin = "";
        } else {
            this.freshHoldMin = str11;
        }
        if ((i & 2048) == 0) {
            this.freshHoldMax = "";
        } else {
            this.freshHoldMax = str12;
        }
        if ((i & 4096) == 0) {
            this.phishHoldMin = "";
        } else {
            this.phishHoldMin = str13;
        }
        if ((i & 8192) == 0) {
            this.phishHoldMax = "";
        } else {
            this.phishHoldMax = str14;
        }
        if ((i & 16384) == 0) {
            this.bondingMin = "";
        } else {
            this.bondingMin = str15;
        }
        if ((32768 & i) == 0) {
            this.bondingMax = "";
        } else {
            this.bondingMax = str16;
        }
        if ((65536 & i) == 0) {
            this.migratedTokensMin = "";
        } else {
            this.migratedTokensMin = str17;
        }
        if ((131072 & i) == 0) {
            this.migratedTokensMax = "";
        } else {
            this.migratedTokensMax = str18;
        }
        if ((262144 & i) == 0) {
            this.marketCapMin = "";
        } else {
            this.marketCapMin = str19;
        }
        if ((524288 & i) == 0) {
            this.marketCapMax = "";
        } else {
            this.marketCapMax = str20;
        }
        if ((1048576 & i) == 0) {
            this.volumeMin = "";
        } else {
            this.volumeMin = str21;
        }
        if ((2097152 & i) == 0) {
            this.volumeMax = "";
        } else {
            this.volumeMax = str22;
        }
        if ((4194304 & i) == 0) {
            this.holdersMin = "";
        } else {
            this.holdersMin = str23;
        }
        if ((8388608 & i) == 0) {
            this.holdersMax = "";
        } else {
            this.holdersMax = str24;
        }
        if ((16777216 & i) == 0) {
            this.tokenAgeMin = "";
        } else {
            this.tokenAgeMin = str25;
        }
        if ((33554432 & i) == 0) {
            this.tokenAgeMax = "";
        } else {
            this.tokenAgeMax = str26;
        }
        this.tokenAgeUnit = (67108864 & i) == 0 ? TokenAgeType.m : tokenAgeType;
        if ((134217728 & i) == 0) {
            this.transactionsMin = "";
        } else {
            this.transactionsMin = str27;
        }
        if ((268435456 & i) == 0) {
            this.transactionsMax = "";
        } else {
            this.transactionsMax = str28;
        }
        if ((536870912 & i) == 0) {
            this.buyMin = "";
        } else {
            this.buyMin = str29;
        }
        if ((1073741824 & i) == 0) {
            this.buyMax = "";
        } else {
            this.buyMax = str30;
        }
        if ((i & Integer.MIN_VALUE) == 0) {
            this.sellMin = "";
        } else {
            this.sellMin = str31;
        }
        if ((i2 & 1) == 0) {
            this.sellMax = "";
        } else {
            this.sellMax = str32;
        }
        if ((i2 & 2) == 0) {
            this.keyword = "";
        } else {
            this.keyword = str33;
        }
        if ((i2 & 4) == 0) {
            this.keywordExclude = "";
        } else {
            this.keywordExclude = str34;
        }
        this.selectedSocialData = (i2 & 8) == 0 ? yDY.AhwBna() : list;
        this.lastTab = (i2 & 16) == 0 ? 0 : i3;
    }

    public static final /* synthetic */ void write$Self$OKDex_dex_impl(MemeFilter memeFilter, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) memeFilter.top10HoldingMin, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, memeFilter.top10HoldingMin);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) memeFilter.top10HoldingMax, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, memeFilter.top10HoldingMax);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) memeFilter.devHoldingMin, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, memeFilter.devHoldingMin);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) memeFilter.devHoldingMax, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, memeFilter.devHoldingMax);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) memeFilter.insiderMin, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, memeFilter.insiderMin);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) memeFilter.insiderMax, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, memeFilter.insiderMax);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) memeFilter.sniperMin, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, memeFilter.sniperMin);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) memeFilter.sniperMax, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 7, memeFilter.sniperMax);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd((Object) memeFilter.bundleMin, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 8, memeFilter.bundleMin);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || !Intrinsics.EZpvd((Object) memeFilter.bundleMax, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 9, memeFilter.bundleMax);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || !Intrinsics.EZpvd((Object) memeFilter.freshHoldMin, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 10, memeFilter.freshHoldMin);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || !Intrinsics.EZpvd((Object) memeFilter.freshHoldMax, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 11, memeFilter.freshHoldMax);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || !Intrinsics.EZpvd((Object) memeFilter.phishHoldMin, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 12, memeFilter.phishHoldMin);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || !Intrinsics.EZpvd((Object) memeFilter.phishHoldMax, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 13, memeFilter.phishHoldMax);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || !Intrinsics.EZpvd((Object) memeFilter.bondingMin, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 14, memeFilter.bondingMin);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) || !Intrinsics.EZpvd((Object) memeFilter.bondingMax, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 15, memeFilter.bondingMax);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) || !Intrinsics.EZpvd((Object) memeFilter.migratedTokensMin, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 16, memeFilter.migratedTokensMin);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 17) || !Intrinsics.EZpvd((Object) memeFilter.migratedTokensMax, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 17, memeFilter.migratedTokensMax);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 18) || !Intrinsics.EZpvd((Object) memeFilter.marketCapMin, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 18, memeFilter.marketCapMin);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 19) || !Intrinsics.EZpvd((Object) memeFilter.marketCapMax, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 19, memeFilter.marketCapMax);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 20) || !Intrinsics.EZpvd((Object) memeFilter.volumeMin, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 20, memeFilter.volumeMin);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 21) || !Intrinsics.EZpvd((Object) memeFilter.volumeMax, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 21, memeFilter.volumeMax);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 22) || !Intrinsics.EZpvd((Object) memeFilter.holdersMin, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 22, memeFilter.holdersMin);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 23) || !Intrinsics.EZpvd((Object) memeFilter.holdersMax, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 23, memeFilter.holdersMax);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 24) || !Intrinsics.EZpvd((Object) memeFilter.tokenAgeMin, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 24, memeFilter.tokenAgeMin);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 25) || !Intrinsics.EZpvd((Object) memeFilter.tokenAgeMax, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 25, memeFilter.tokenAgeMax);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 26) || memeFilter.tokenAgeUnit != TokenAgeType.m) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 26, kSerializerArr[26], memeFilter.tokenAgeUnit);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 27) || !Intrinsics.EZpvd((Object) memeFilter.transactionsMin, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 27, memeFilter.transactionsMin);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 28) || !Intrinsics.EZpvd((Object) memeFilter.transactionsMax, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 28, memeFilter.transactionsMax);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 29) || !Intrinsics.EZpvd((Object) memeFilter.buyMin, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 29, memeFilter.buyMin);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 30) || !Intrinsics.EZpvd((Object) memeFilter.buyMax, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 30, memeFilter.buyMax);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 31) || !Intrinsics.EZpvd((Object) memeFilter.sellMin, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 31, memeFilter.sellMin);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 32) || !Intrinsics.EZpvd((Object) memeFilter.sellMax, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 32, memeFilter.sellMax);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 33) || !Intrinsics.EZpvd((Object) memeFilter.keyword, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 33, memeFilter.keyword);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 34) || !Intrinsics.EZpvd((Object) memeFilter.keywordExclude, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 34, memeFilter.keywordExclude);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 35) || !Intrinsics.EZpvd(memeFilter.selectedSocialData, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 35, kSerializerArr[35], memeFilter.selectedSocialData);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 36) && memeFilter.lastTab == 0) {
            return;
        }
        compositeEncoder.encodeIntElement(serialDescriptor, 36, memeFilter.lastTab);
    }

    public MemeFilter(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13, @NotNull String str14, @NotNull String str15, @NotNull String str16, @NotNull String str17, @NotNull String str18, @NotNull String str19, @NotNull String str20, @NotNull String str21, @NotNull String str22, @NotNull String str23, @NotNull String str24, @NotNull String str25, @NotNull String str26, @NotNull TokenAgeType tokenAgeType, @NotNull String str27, @NotNull String str28, @NotNull String str29, @NotNull String str30, @NotNull String str31, @NotNull String str32, @NotNull String str33, @NotNull String str34, @NotNull List<String> list, int i) {
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
        Intrinsics.checkNotNullParameter(str16, "");
        Intrinsics.checkNotNullParameter(str17, "");
        Intrinsics.checkNotNullParameter(str18, "");
        Intrinsics.checkNotNullParameter(str19, "");
        Intrinsics.checkNotNullParameter(str20, "");
        Intrinsics.checkNotNullParameter(str21, "");
        Intrinsics.checkNotNullParameter(str22, "");
        Intrinsics.checkNotNullParameter(str23, "");
        Intrinsics.checkNotNullParameter(str24, "");
        Intrinsics.checkNotNullParameter(str25, "");
        Intrinsics.checkNotNullParameter(str26, "");
        Intrinsics.checkNotNullParameter(tokenAgeType, "");
        Intrinsics.checkNotNullParameter(str27, "");
        Intrinsics.checkNotNullParameter(str28, "");
        Intrinsics.checkNotNullParameter(str29, "");
        Intrinsics.checkNotNullParameter(str30, "");
        Intrinsics.checkNotNullParameter(str31, "");
        Intrinsics.checkNotNullParameter(str32, "");
        Intrinsics.checkNotNullParameter(str33, "");
        Intrinsics.checkNotNullParameter(str34, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.top10HoldingMin = str;
        this.top10HoldingMax = str2;
        this.devHoldingMin = str3;
        this.devHoldingMax = str4;
        this.insiderMin = str5;
        this.insiderMax = str6;
        this.sniperMin = str7;
        this.sniperMax = str8;
        this.bundleMin = str9;
        this.bundleMax = str10;
        this.freshHoldMin = str11;
        this.freshHoldMax = str12;
        this.phishHoldMin = str13;
        this.phishHoldMax = str14;
        this.bondingMin = str15;
        this.bondingMax = str16;
        this.migratedTokensMin = str17;
        this.migratedTokensMax = str18;
        this.marketCapMin = str19;
        this.marketCapMax = str20;
        this.volumeMin = str21;
        this.volumeMax = str22;
        this.holdersMin = str23;
        this.holdersMax = str24;
        this.tokenAgeMin = str25;
        this.tokenAgeMax = str26;
        this.tokenAgeUnit = tokenAgeType;
        this.transactionsMin = str27;
        this.transactionsMax = str28;
        this.buyMin = str29;
        this.buyMax = str30;
        this.sellMin = str31;
        this.sellMax = str32;
        this.keyword = str33;
        this.keywordExclude = str34;
        this.selectedSocialData = list;
        this.lastTab = i;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x01b6: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r75v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r38v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r75v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r39v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0014: ARITH (r75v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r40v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001c: ARITH (r75v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r41v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0024: ARITH (r75v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r42v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002c: ARITH (r75v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r43v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0034: ARITH (r75v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r44v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003c: ARITH (r75v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r45v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0044: ARITH (r75v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r46v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004c: ARITH (r75v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? ("") : (r47v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0054: ARITH (r75v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? ("") : (r48v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x005c: ARITH (r75v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? ("") : (r49v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0064: ARITH (r75v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? ("") : (r50v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x006c: ARITH (r75v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? ("") : (r51v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0076: ARITH (r75v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? ("") : (r52v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0082: ARITH (r75v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? ("") : (r53v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x008d: ARITH (r75v0 int) & (65536 int) A[WRAPPED]) != (0 int)) ? ("") : (r54v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0098: ARITH (r75v0 int) & (131072 int) A[WRAPPED]) != (0 int)) ? ("") : (r55v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00a3: ARITH (r75v0 int) & (262144 int) A[WRAPPED]) != (0 int)) ? ("") : (r56v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00ae: ARITH (r75v0 int) & (524288 int) A[WRAPPED]) != (0 int)) ? ("") : (r57v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00b9: ARITH (r75v0 int) & (1048576 int) A[WRAPPED]) != (0 int)) ? ("") : (r58v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00c4: ARITH (r75v0 int) & (2097152 int) A[WRAPPED]) != (0 int)) ? ("") : (r59v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00cf: ARITH (r75v0 int) & (4194304 int) A[WRAPPED]) != (0 int)) ? ("") : (r60v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00da: ARITH (r75v0 int) & (8388608 int) A[WRAPPED]) != (0 int)) ? ("") : (r61v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00e5: ARITH (r75v0 int) & (16777216 int) A[WRAPPED]) != (0 int)) ? ("") : (r62v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00f0: ARITH (r75v0 int) & (wrap:??:SGET  A[WRAPPED] com.google.api.client.googleapis.media.MediaHttpDownloader.MAXIMUM_CHUNK_SIZE int) A[WRAPPED]) != (0 int)) ? ("") : (r63v0 java.lang.String))
  (wrap:com.okinc.business.market.features.meme.filter.domain.TokenAgeType:?: TERNARY null = ((wrap:int:0x00fb: ARITH (r75v0 int) & (67108864 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x00ff: SGET  A[WRAPPED] (LINE:68) com.okinc.business.market.features.meme.filter.domain.TokenAgeType.m com.okinc.business.market.features.meme.filter.domain.TokenAgeType) : (r64v0 com.okinc.business.market.features.meme.filter.domain.TokenAgeType))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0106: ARITH (r75v0 int) & (134217728 int) A[WRAPPED]) != (0 int)) ? ("") : (r65v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0111: ARITH (r75v0 int) & (268435456 int) A[WRAPPED]) != (0 int)) ? ("") : (r66v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x011c: ARITH (r75v0 int) & (536870912 int) A[WRAPPED]) != (0 int)) ? ("") : (r67v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0127: ARITH (r75v0 int) & (1073741824 int) A[WRAPPED]) != (0 int)) ? ("") : (r68v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0132: ARITH (r75v0 int) & (Integer.MIN_VALUE int) A[WRAPPED]) != (0 int)) ? ("") : (r69v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x013b: ARITH (r76v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r70v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0144: ARITH (r76v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r71v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x014d: ARITH (r76v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r72v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0156: ARITH (r76v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x015a: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:77)) : (r73v0 java.util.List))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0161: ARITH (r76v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r74v0 int))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.business.market.features.meme.filter.domain.TokenAgeType, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List<java.lang.String>, int):void (m)] (LINE:38) call: com.okinc.business.market.features.meme.filter.domain.MemeFilter.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.business.market.features.meme.filter.domain.TokenAgeType, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, int):void type: THIS */
    public /* synthetic */ MemeFilter(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, TokenAgeType tokenAgeType, String str27, String str28, String str29, String str30, String str31, String str32, String str33, String str34, List list, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? "" : str3, (i2 & 8) != 0 ? "" : str4, (i2 & 16) != 0 ? "" : str5, (i2 & 32) != 0 ? "" : str6, (i2 & 64) != 0 ? "" : str7, (i2 & 128) != 0 ? "" : str8, (i2 & 256) != 0 ? "" : str9, (i2 & 512) != 0 ? "" : str10, (i2 & 1024) != 0 ? "" : str11, (i2 & 2048) != 0 ? "" : str12, (i2 & 4096) != 0 ? "" : str13, (i2 & 8192) != 0 ? "" : str14, (i2 & 16384) != 0 ? "" : str15, (i2 & 32768) != 0 ? "" : str16, (i2 & 65536) != 0 ? "" : str17, (i2 & 131072) != 0 ? "" : str18, (i2 & 262144) != 0 ? "" : str19, (i2 & 524288) != 0 ? "" : str20, (i2 & 1048576) != 0 ? "" : str21, (i2 & 2097152) != 0 ? "" : str22, (i2 & 4194304) != 0 ? "" : str23, (i2 & 8388608) != 0 ? "" : str24, (i2 & 16777216) != 0 ? "" : str25, (i2 & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? "" : str26, (i2 & 67108864) != 0 ? TokenAgeType.m : tokenAgeType, (i2 & 134217728) != 0 ? "" : str27, (i2 & 268435456) != 0 ? "" : str28, (i2 & 536870912) != 0 ? "" : str29, (i2 & 1073741824) != 0 ? "" : str30, (i2 & Integer.MIN_VALUE) != 0 ? "" : str31, (i3 & 1) != 0 ? "" : str32, (i3 & 2) != 0 ? "" : str33, (i3 & 4) != 0 ? "" : str34, (i3 & 8) != 0 ? yDY.AhwBna() : list, (i3 & 16) != 0 ? 0 : i);
    }
}
