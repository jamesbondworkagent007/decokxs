package o;

import com.okinc.market.search.features.main.result.ui.SubPage;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qEa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public interface InterfaceC39957qEa {
    void copydefault(@NotNull SubPage subPage, boolean z);

    /* JADX INFO: renamed from: o.qEa$ActionBar */
    public static final class ActionBar {
        public static /* synthetic */ void navToPage$default(InterfaceC39957qEa interfaceC39957qEa, SubPage subPage, boolean z, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: navToPage");
            }
            if ((i & 2) != 0) {
                z = true;
            }
            interfaceC39957qEa.copydefault(subPage, z);
        }
    }
}
