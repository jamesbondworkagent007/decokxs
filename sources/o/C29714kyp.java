package o;

import com.okinc.business.market.data.model.TagMetaData;
import com.okinc.business.market.features.tag.domain.TagGroup;
import com.okinc.business.market.features.tag.domain.TagMeta;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kyp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C29714kyp {
    @yCM
    public C29714kyp() {
    }

    public final TagMeta OLrzqt(@NotNull TagMetaData tagMetaData) {
        Intrinsics.checkNotNullParameter(tagMetaData, "");
        return new TagMeta(tagMetaData.AkhnZx(), tagMetaData.values(), tagMetaData.djBIcL(), tagMetaData.KWHzl(), tagMetaData.AEQbTJ(), tagMetaData.OLrzqt(), tagMetaData.copydefault(), tagMetaData.gEmmrt(), tagMetaData.EZpvd(), tagMetaData.valueOf(), tagMetaData.isConnected(), false, TagGroup.Companion.OLrzqt(tagMetaData.AhwBna()), tagMetaData.AYXKKw() == 1, 2048, null);
    }
}
