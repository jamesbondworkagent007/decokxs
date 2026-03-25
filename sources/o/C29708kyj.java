package o;

import com.okinc.business.market.common.constants.StringBooleanType;
import com.okinc.business.market.data.model.CompactTagData;
import com.okinc.business.market.features.tag.domain.CompactTag;
import com.okinc.business.market.features.tag.domain.TagEventProperty;
import com.okinc.business.market.features.tag.domain.TagLocalProperty;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kyj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C29708kyj {
    public final C29711kym OLrzqt;

    @yCM
    public C29708kyj(@NotNull C29711kym c29711kym) {
        Intrinsics.checkNotNullParameter(c29711kym, "");
        this.OLrzqt = c29711kym;
    }

    public static /* synthetic */ CompactTag invoke$default(C29708kyj c29708kyj, CompactTagData compactTagData, TagLocalProperty tagLocalProperty, TagEventProperty tagEventProperty, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            tagLocalProperty = new TagLocalProperty(null, null, null, null, null, null, null, 127, null);
        }
        if ((i & 4) != 0) {
            tagEventProperty = null;
        }
        return c29708kyj.EZpvd(compactTagData, tagLocalProperty, tagEventProperty);
    }

    public final CompactTag EZpvd(@NotNull CompactTagData compactTagData, @NotNull TagLocalProperty tagLocalProperty, TagEventProperty tagEventProperty) {
        Intrinsics.checkNotNullParameter(compactTagData, "");
        Intrinsics.checkNotNullParameter(tagLocalProperty, "");
        return new CompactTag(compactTagData.copydefault(), compactTagData.KWHzl() == StringBooleanType.TRUE, this.OLrzqt.EZpvd(compactTagData.AEQbTJ(), tagLocalProperty, tagEventProperty));
    }
}
