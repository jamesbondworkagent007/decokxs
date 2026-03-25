package o;

import com.okinc.business.defi.api.model.tx.FeeType;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.bbX, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public interface InterfaceC9752bbX {
    java.lang.String AEQbTJ();

    FeeType AYXKKw();

    java.lang.CharSequence AhwBna();

    java.lang.String EZpvd(@NotNull java.lang.String str, boolean z);

    InterfaceC9731bbC EZpvd();

    java.lang.String KWHzl(@NotNull java.lang.String str, boolean z);

    C9745bbQ KWHzl();

    java.lang.String OLrzqt();

    boolean gEmmrt();

    boolean h_();

    /* JADX INFO: renamed from: o.bbX$Activity */
    /* JADX INFO: loaded from: classes14.dex */
    public static final class Activity {
        public static /* synthetic */ java.lang.String formatFeeCoinAmount$default(InterfaceC9752bbX interfaceC9752bbX, java.lang.String str, boolean z, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: formatFeeCoinAmount");
            }
            if ((i & 2) != 0) {
                z = true;
            }
            return interfaceC9752bbX.EZpvd(str, z);
        }

        public static /* synthetic */ java.lang.String formatFeeCurrency$default(InterfaceC9752bbX interfaceC9752bbX, java.lang.String str, boolean z, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: formatFeeCurrency");
            }
            if ((i & 2) != 0) {
                z = true;
            }
            return interfaceC9752bbX.KWHzl(str, z);
        }
    }
}
