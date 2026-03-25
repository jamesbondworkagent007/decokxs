package o;

import com.okinc.tradeapi.bean.ParamBuilder;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class wPN {
    public static /* synthetic */ ParamBuilder buildJumpData$default(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i, java.lang.Object obj) {
        if ((i & 8) != 0) {
            str4 = null;
        }
        return AEQbTJ(str, str2, str3, str4);
    }

    public static final ParamBuilder AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, java.lang.String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new ParamBuilder.ActionBar().KWHzl(false).copydefault(str).KWHzl(str2).EZpvd(str4).copydefault(true).OLrzqt(str3).EZpvd();
    }
}
