package o;

import com.okinc.search.bean.SearchResultContentPo;
import java.util.LinkedHashMap;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class tGF {
    public static final tGF OLrzqt = new tGF();
    public static final java.util.Map<java.lang.String, SearchResultContentPo> AEQbTJ = new LinkedHashMap();
    public static final int copydefault = 8;

    private tGF() {
    }

    public final java.lang.String KWHzl(@NotNull SearchResultContentPo searchResultContentPo) {
        Intrinsics.checkNotNullParameter(searchResultContentPo, "");
        java.lang.String strCopydefault = copydefault();
        AEQbTJ.put(strCopydefault, searchResultContentPo);
        return strCopydefault;
    }

    public final SearchResultContentPo OLrzqt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return AEQbTJ.get(str);
    }

    public final void KWHzl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        AEQbTJ.remove(str);
    }

    public final java.lang.String copydefault() {
        java.lang.String string = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }
}
