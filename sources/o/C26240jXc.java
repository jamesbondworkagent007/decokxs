package o;

import com.okinc.business.market.common.constants.StringBooleanType;
import com.okinc.business.market.features.group.domain.CommonGroupData;
import com.okinc.business.market.features.group.domain.CommonGroupUiModel;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jXc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C26240jXc {
    @yCM
    public C26240jXc() {
    }

    public final CommonGroupData EZpvd(@NotNull CommonGroupData commonGroupData) {
        Intrinsics.checkNotNullParameter(commonGroupData, "");
        return new CommonGroupData(commonGroupData.OLrzqt(), commonGroupData.AEQbTJ(), commonGroupData.KWHzl(), commonGroupData.valueOf(), commonGroupData.copydefault());
    }

    public final CommonGroupUiModel OLrzqt(@NotNull CommonGroupData commonGroupData) {
        Intrinsics.checkNotNullParameter(commonGroupData, "");
        return new CommonGroupUiModel(commonGroupData.OLrzqt(), commonGroupData.AEQbTJ(), commonGroupData.valueOf(), commonGroupData.KWHzl(), 0, commonGroupData.copydefault() == StringBooleanType.TRUE, false, 80, null);
    }
}
