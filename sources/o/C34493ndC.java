package o;

import com.okinc.dexkline.market.data.model.TagMetaData;
import com.okinc.dexkline.market.features.tag.domain.TagMeta;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ndC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C34493ndC {
    @yCM
    public C34493ndC() {
    }

    public final TagMeta OLrzqt(@NotNull TagMetaData tagMetaData) {
        Intrinsics.checkNotNullParameter(tagMetaData, "");
        return new TagMeta(tagMetaData.fetchVPNInfo(), tagMetaData.AkhnZx(), tagMetaData.djBIcL(), tagMetaData.AEQbTJ(), tagMetaData.EZpvd(), tagMetaData.copydefault(), tagMetaData.valueOf(), tagMetaData.AYXKKw(), tagMetaData.KWHzl(), tagMetaData.OLrzqt(), tagMetaData.gEmmrt(), tagMetaData.AhwBna(), tagMetaData.DbNXlk(), false, 8192, null);
    }
}
