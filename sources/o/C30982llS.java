package o;

import com.okinc.business.dexlogic.bean.MemeModeQuoteBean;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.llS, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C30982llS {
    public static final C30986llW EZpvd(@NotNull MemeModeQuoteBean memeModeQuoteBean) {
        Intrinsics.checkNotNullParameter(memeModeQuoteBean, "");
        return new C30986llW(memeModeQuoteBean.getMemeModeCommonDexInfo(), memeModeQuoteBean.getSelectedDeFiPlatform());
    }
}
