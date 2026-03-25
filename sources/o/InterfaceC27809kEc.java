package o;

import com.okinc.unify_trade.biz.DexInstrument;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kEc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public interface InterfaceC27809kEc {
    void AEQbTJ(@NotNull DexInstrument dexInstrument, @NotNull java.lang.String str, @NotNull java.lang.String str2);

    void EZpvd(@NotNull java.lang.String str, java.lang.String str2);

    void KWHzl(@NotNull DexInstrument dexInstrument, @NotNull java.lang.String str);

    void KWHzl(@NotNull java.lang.String str, java.lang.String str2, int i, java.lang.String str3);

    void OLrzqt(@NotNull java.lang.String str, java.lang.String str2, int i, java.lang.String str3);

    void copydefault(@NotNull java.lang.String str, java.lang.String str2);

    void copydefault(@NotNull java.lang.String str, java.lang.String str2, int i, java.lang.String str3);

    /* JADX INFO: renamed from: o.kEc$TaskDescription */
    public static final class TaskDescription {
        public static /* synthetic */ void trackTradingPairClick$default(InterfaceC27809kEc interfaceC27809kEc, java.lang.String str, java.lang.String str2, int i, java.lang.String str3, int i2, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: trackTradingPairClick");
            }
            if ((i2 & 2) != 0) {
                str2 = null;
            }
            if ((i2 & 8) != 0) {
                str3 = null;
            }
            interfaceC27809kEc.copydefault(str, str2, i, str3);
        }

        public static /* synthetic */ void trackCardAllViewClick$default(InterfaceC27809kEc interfaceC27809kEc, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: trackCardAllViewClick");
            }
            if ((i & 2) != 0) {
                str2 = null;
            }
            interfaceC27809kEc.copydefault(str, str2);
        }

        public static /* synthetic */ void trackLongPressView$default(InterfaceC27809kEc interfaceC27809kEc, java.lang.String str, java.lang.String str2, int i, java.lang.String str3, int i2, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: trackLongPressView");
            }
            if ((i2 & 2) != 0) {
                str2 = null;
            }
            if ((i2 & 8) != 0) {
                str3 = null;
            }
            interfaceC27809kEc.KWHzl(str, str2, i, str3);
        }

        public static /* synthetic */ void trackLongPressClick$default(InterfaceC27809kEc interfaceC27809kEc, java.lang.String str, java.lang.String str2, int i, java.lang.String str3, int i2, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: trackLongPressClick");
            }
            if ((i2 & 2) != 0) {
                str2 = null;
            }
            if ((i2 & 8) != 0) {
                str3 = null;
            }
            interfaceC27809kEc.OLrzqt(str, str2, i, str3);
        }
    }
}
