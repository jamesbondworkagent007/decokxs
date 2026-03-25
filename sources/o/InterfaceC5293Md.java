package o;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.Md, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC5293Md {
    java.lang.Object AEQbTJ(@NotNull java.lang.String str);

    /* JADX INFO: renamed from: o.Md$StateListAnimator */
    public static final class StateListAnimator {
        public static java.lang.Object AEQbTJ(@NotNull InterfaceC5293Md interfaceC5293Md, java.util.List<java.lang.String> list) {
            if (list == null || list.isEmpty()) {
                return null;
            }
            int size = list.size();
            for (int i = 0; i < size - 1; i++) {
                java.lang.String str = list.get(i);
                if (str == null) {
                    return null;
                }
                java.lang.Object objAEQbTJ = interfaceC5293Md.AEQbTJ(str);
                if (objAEQbTJ instanceof InterfaceC5293Md) {
                    interfaceC5293Md = (InterfaceC5293Md) objAEQbTJ;
                } else {
                    if (!(objAEQbTJ instanceof java.util.Map)) {
                        return null;
                    }
                    interfaceC5293Md = new LZ((java.util.Map) objAEQbTJ);
                }
            }
            java.lang.String str2 = list.get(list.size() - 1);
            if (str2 == null) {
                return null;
            }
            return interfaceC5293Md.AEQbTJ(str2);
        }
    }
}
