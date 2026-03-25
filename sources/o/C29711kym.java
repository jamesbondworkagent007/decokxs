package o;

import com.okinc.business.market.data.model.TagExtraData;
import com.okinc.business.market.features.tag.domain.TagBelongType;
import com.okinc.business.market.features.tag.domain.TagEventProperty;
import com.okinc.business.market.features.tag.domain.TagExtra;
import com.okinc.business.market.features.tag.domain.TagLocalProperty;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kym, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C29711kym {
    @yCM
    public C29711kym() {
    }

    public static /* synthetic */ TagExtra invoke$default(C29711kym c29711kym, TagExtraData tagExtraData, TagLocalProperty tagLocalProperty, TagEventProperty tagEventProperty, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            tagLocalProperty = new TagLocalProperty(null, null, null, null, null, null, null, 127, null);
        }
        if ((i & 4) != 0) {
            tagEventProperty = null;
        }
        return c29711kym.EZpvd(tagExtraData, tagLocalProperty, tagEventProperty);
    }

    public final TagExtra EZpvd(@NotNull TagExtraData tagExtraData, @NotNull TagLocalProperty tagLocalProperty, TagEventProperty tagEventProperty) {
        Intrinsics.checkNotNullParameter(tagExtraData, "");
        Intrinsics.checkNotNullParameter(tagLocalProperty, "");
        return new TagExtra(tagExtraData.AhwBna(), tagExtraData.gEmmrt(), tagExtraData.djBIcL(), tagLocalProperty, tagEventProperty, tagExtraData.KWHzl(), tagExtraData.valueOf(), OLrzqt(tagExtraData.EZpvd()));
    }

    public final TagBelongType OLrzqt(java.lang.String str) {
        return Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "rwa") ? TagBelongType.RWA : TagBelongType.NONE;
    }
}
