package o;

import com.okinc.dexkline.market.common.constants.StringBooleanType;
import com.okinc.dexkline.market.data.model.CompactTagData;
import com.okinc.dexkline.market.features.tag.domain.CompactTag;
import com.okinc.dexkline.market.features.tag.domain.TagEventProperty;
import com.okinc.dexkline.market.features.tag.domain.TagLocalProperty;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ndw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C34539ndw {
    public final C34491ndA EZpvd;

    @yCM
    public C34539ndw(@NotNull C34491ndA c34491ndA) {
        Intrinsics.checkNotNullParameter(c34491ndA, "");
        this.EZpvd = c34491ndA;
    }

    public static /* synthetic */ CompactTag invoke$default(C34539ndw c34539ndw, CompactTagData compactTagData, TagLocalProperty tagLocalProperty, TagEventProperty tagEventProperty, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            tagLocalProperty = new TagLocalProperty(null, null, null, null, null, null, null, 127, null);
        }
        if ((i & 4) != 0) {
            tagEventProperty = null;
        }
        return c34539ndw.AEQbTJ(compactTagData, tagLocalProperty, tagEventProperty);
    }

    public final CompactTag AEQbTJ(@NotNull CompactTagData compactTagData, @NotNull TagLocalProperty tagLocalProperty, TagEventProperty tagEventProperty) {
        Intrinsics.checkNotNullParameter(compactTagData, "");
        Intrinsics.checkNotNullParameter(tagLocalProperty, "");
        return new CompactTag(compactTagData.EZpvd(), compactTagData.AEQbTJ() == StringBooleanType.TRUE, this.EZpvd.copydefault(compactTagData.copydefault(), tagLocalProperty, tagEventProperty));
    }
}
