package o;

import com.amplitude.core.Storage;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.Kf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC5243Kf {
    Storage KWHzl(@NotNull JZ jz, java.lang.String str);

    static /* synthetic */ Storage getStorage$default(InterfaceC5243Kf interfaceC5243Kf, JZ jz, java.lang.String str, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getStorage");
        }
        if ((i & 2) != 0) {
            str = null;
        }
        return interfaceC5243Kf.KWHzl(jz, str);
    }
}
