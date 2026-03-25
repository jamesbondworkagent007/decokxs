package o;

import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ueb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public interface InterfaceC48910ueb {
    BottomSheetDialogFragment OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, java.util.HashMap<java.lang.String, java.util.List<java.lang.String>> map, java.lang.String str5);

    /* JADX INFO: renamed from: o.ueb$Application */
    public static final class Application {
        /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: o.ueb */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ BottomSheetDialogFragment getSearchRootFragment$default(InterfaceC48910ueb interfaceC48910ueb, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.util.HashMap map, java.lang.String str5, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getSearchRootFragment");
            }
            if ((i & 16) != 0) {
                map = null;
            }
            return interfaceC48910ueb.OLrzqt(str, str2, str3, str4, map, (i & 32) != 0 ? str2 : str5);
        }
    }
}
