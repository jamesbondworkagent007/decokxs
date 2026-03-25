package o;

import com.okinc.business.market.data.model.CompactTagData;
import com.okinc.business.market.data.model.TagExtraData;
import com.okinc.business.market.features.address_tracker.domain.TrackingAddressAlias;
import com.okinc.business.market.features.meme.aped_together.domain.model.ApedTogetherData;
import com.okinc.business.market.features.meme.aped_together.domain.model.KolType;
import com.okinc.business.market.features.tag.domain.TagMeta;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kep, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C28654kep {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:35:0x008d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final C28653keo KWHzl(@NotNull ApedTogetherData apedTogetherData, @NotNull java.util.Map<java.lang.String, java.lang.String> map, @NotNull java.util.Map<java.lang.String, TrackingAddressAlias> map2, TagMeta tagMeta) {
        KolType kolType;
        TagExtraData tagExtraDataAEQbTJ;
        java.lang.String strAhwBna;
        TagExtraData tagExtraDataAEQbTJ2;
        java.lang.String strGEmmrt;
        Intrinsics.checkNotNullParameter(apedTogetherData, "");
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(map2, "");
        CompactTagData compactTagData = (CompactTagData) CollectionsKt___CollectionsKt.firstOrNull(apedTogetherData.getNewTagList());
        java.lang.String str = (compactTagData == null || (tagExtraDataAEQbTJ2 = compactTagData.AEQbTJ()) == null || (strGEmmrt = tagExtraDataAEQbTJ2.gEmmrt()) == null) ? "" : strGEmmrt;
        java.lang.String holderWalletAddress = apedTogetherData.getHolderWalletAddress();
        CompactTagData compactTagData2 = (CompactTagData) CollectionsKt___CollectionsKt.firstOrNull(apedTogetherData.getNewTagList());
        java.lang.String str2 = (compactTagData2 == null || (tagExtraDataAEQbTJ = compactTagData2.AEQbTJ()) == null || (strAhwBna = tagExtraDataAEQbTJ.AhwBna()) == null) ? "" : strAhwBna;
        java.lang.String holdVolume = apedTogetherData.getHoldVolume();
        java.lang.String holdAmountPercentage = apedTogetherData.getHoldAmountPercentage();
        java.lang.String totalProfit = apedTogetherData.getTotalProfit();
        java.lang.String totalProfitPercentage = apedTogetherData.getTotalProfitPercentage();
        java.lang.String tagType = apedTogetherData.getTagType();
        switch (tagType.hashCode()) {
            case 48:
                if (tagType.equals("0")) {
                    kolType = KolType.FOLLOWING;
                } else {
                    kolType = KolType.INFLUENCER;
                }
                break;
            case 49:
                if (tagType.equals("1")) {
                    kolType = KolType.SMART_MONEY;
                    break;
                }
                break;
            case 50:
                if (tagType.equals("2")) {
                    kolType = KolType.INFLUENCER;
                    break;
                }
                break;
        }
        KolType kolType2 = kolType;
        java.lang.String orDefault = map.getOrDefault(apedTogetherData.getHolderWalletAddress(), "");
        TrackingAddressAlias trackingAddressAlias = map2.get(apedTogetherData.getHolderWalletAddress());
        return new C28653keo(str, holderWalletAddress, str2, holdVolume, holdAmountPercentage, totalProfit, totalProfitPercentage, kolType2, tagMeta, orDefault, trackingAddressAlias != null ? trackingAddressAlias.getAddressAliasColorHex() : null);
    }
}
