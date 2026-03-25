package o;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.Fy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public interface InterfaceC5132Fy {
    void AEQbTJ(@NotNull java.lang.String str, java.lang.String str2);

    InterfaceC5132Fy KWHzl(@NotNull java.lang.String str);

    InterfaceC5132Fy KWHzl(@NotNull java.lang.String str, java.lang.String str2);

    byte[] KWHzl();

    InterfaceC5132Fy copydefault(@NotNull java.lang.String str, java.lang.String str2);

    InterfaceC5132Fy copydefault(@NotNull java.lang.String str, java.lang.String str2, java.lang.String str3);

    /* JADX INFO: renamed from: o.Fy$Application */
    public static final class Application {
        public static /* synthetic */ InterfaceC5132Fy startTag$default(InterfaceC5132Fy interfaceC5132Fy, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: startTag");
            }
            if ((i & 2) != 0) {
                str2 = null;
            }
            return interfaceC5132Fy.KWHzl(str, str2);
        }

        public static /* synthetic */ InterfaceC5132Fy attribute$default(InterfaceC5132Fy interfaceC5132Fy, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: attribute");
            }
            if ((i & 4) != 0) {
                str3 = null;
            }
            return interfaceC5132Fy.copydefault(str, str2, str3);
        }

        public static /* synthetic */ InterfaceC5132Fy endTag$default(InterfaceC5132Fy interfaceC5132Fy, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: endTag");
            }
            if ((i & 2) != 0) {
                str2 = null;
            }
            return interfaceC5132Fy.copydefault(str, str2);
        }

        public static /* synthetic */ void namespacePrefix$default(InterfaceC5132Fy interfaceC5132Fy, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: namespacePrefix");
            }
            if ((i & 2) != 0) {
                str2 = null;
            }
            interfaceC5132Fy.AEQbTJ(str, str2);
        }
    }
}
