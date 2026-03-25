package o;

import com.okinc.unify_trade.biz.MaxAvailableResp;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public interface xDM {
    void AEQbTJ(@NotNull java.lang.String str, boolean z);

    void AEQbTJ(java.lang.String str, boolean z, Function1<? super MaxAvailableResp, Unit> function1);

    void EZpvd(java.lang.Boolean bool);

    void EZpvd(java.lang.String str);

    void KWHzl();

    void KWHzl(java.lang.Boolean bool);

    void KWHzl(@NotNull java.lang.String str);

    void OLrzqt(java.lang.String str);

    void OLrzqt(java.lang.String str, boolean z, Function1<? super MaxAvailableResp, Unit> function1);

    void copydefault(java.lang.String str, java.lang.String str2, java.lang.String str3);

    void copydefault(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, Function1<? super MaxAvailableResp, Unit> function1);

    void copydefault(java.lang.String str, java.lang.String str2, java.lang.String str3, Function1<? super MaxAvailableResp, Unit> function1);

    public static final class ActionBar {
        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.xDM */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void refreshOrderPrice$default(xDM xdm, java.lang.String str, boolean z, Function1 function1, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: refreshOrderPrice");
            }
            if ((i & 2) != 0) {
                z = true;
            }
            if ((i & 4) != 0) {
                function1 = null;
            }
            xdm.OLrzqt(str, z, function1);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.xDM */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void refreshDepthPx$default(xDM xdm, java.lang.String str, boolean z, Function1 function1, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: refreshDepthPx");
            }
            if ((i & 2) != 0) {
                z = true;
            }
            if ((i & 4) != 0) {
                function1 = null;
            }
            xdm.AEQbTJ(str, z, function1);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: o.xDM */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void refreshOrderSize$default(xDM xdm, java.lang.String str, java.lang.String str2, java.lang.String str3, Function1 function1, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: refreshOrderSize");
            }
            if ((i & 4) != 0) {
                str3 = null;
            }
            if ((i & 8) != 0) {
                function1 = null;
            }
            xdm.copydefault(str, str2, str3, function1);
        }

        public static /* synthetic */ void refreshTgtCcy$default(xDM xdm, java.lang.String str, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: refreshTgtCcy");
            }
            if ((i & 1) != 0) {
                str = null;
            }
            xdm.OLrzqt(str);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: o.xDM */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void refreshOrderSizeType$default(xDM xdm, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, Function1 function1, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: refreshOrderSizeType");
            }
            xdm.copydefault(str, str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : function1);
        }
    }
}
