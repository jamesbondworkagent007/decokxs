package o;

import com.okinc.business.dexlogic.main.market.bean.BubbleMapData;
import com.okinc.business.market.features.holders.domain.model.BubbleMap;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jYv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C26286jYv {
    public static final BubbleMap KWHzl(@NotNull BubbleMapData bubbleMapData) {
        Intrinsics.checkNotNullParameter(bubbleMapData, "");
        return new BubbleMap(bubbleMapData.getOkxWebSiteUrl(), bubbleMapData.getThirdPartyWebSiteUrl(), bubbleMapData.getOkxDarkDefaultLogo(), bubbleMapData.getOkxLightDefaultLogo(), bubbleMapData.getThirdPartyWebSiteColorLogo());
    }
}
