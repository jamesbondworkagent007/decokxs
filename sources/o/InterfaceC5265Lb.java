package o;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.Lb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC5265Lb {
    InterfaceC5268Le upload(@NotNull java.lang.String str, java.lang.String str2);

    static /* synthetic */ InterfaceC5268Le upload$default(InterfaceC5265Lb interfaceC5265Lb, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: upload");
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        return interfaceC5265Lb.upload(str, str2);
    }
}
