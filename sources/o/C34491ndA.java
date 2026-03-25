package o;

import com.okinc.dexkline.market.data.model.TagExtraData;
import com.okinc.dexkline.market.features.tag.domain.TagEventProperty;
import com.okinc.dexkline.market.features.tag.domain.TagExtra;
import com.okinc.dexkline.market.features.tag.domain.TagLocalProperty;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ndA, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C34491ndA {
    @yCM
    public C34491ndA() {
    }

    public static /* synthetic */ TagExtra invoke$default(C34491ndA c34491ndA, TagExtraData tagExtraData, TagLocalProperty tagLocalProperty, TagEventProperty tagEventProperty, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            tagLocalProperty = new TagLocalProperty(null, null, null, null, null, null, null, 127, null);
        }
        if ((i & 4) != 0) {
            tagEventProperty = null;
        }
        return c34491ndA.copydefault(tagExtraData, tagLocalProperty, tagEventProperty);
    }

    public final TagExtra copydefault(@NotNull TagExtraData tagExtraData, @NotNull TagLocalProperty tagLocalProperty, TagEventProperty tagEventProperty) {
        Intrinsics.checkNotNullParameter(tagExtraData, "");
        Intrinsics.checkNotNullParameter(tagLocalProperty, "");
        return new TagExtra(tagExtraData.djBIcL(), tagExtraData.OLrzqt(), tagExtraData.copydefault(), tagLocalProperty, tagEventProperty);
    }
}
