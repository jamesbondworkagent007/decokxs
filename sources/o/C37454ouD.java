package o;

import androidx.lifecycle.ViewModel;
import com.okinc.im.bean.SearchResultData;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ouD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C37454ouD extends ViewModel {
    public final java.util.List<SearchResultData> EZpvd = new java.util.ArrayList();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<SearchResultData> EZpvd() {
        return this.EZpvd;
    }

    public final void KWHzl(@NotNull java.util.List<? extends SearchResultData> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.EZpvd.addAll(list);
    }

    public final void copydefault() {
        this.EZpvd.clear();
    }
}
