package o;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ctg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public interface InterfaceC12793ctg {
    kotlin.Pair<java.lang.String, java.lang.String> KWHzl(@NotNull java.lang.String str, java.lang.Long l);

    java.lang.String copydefault(@NotNull java.lang.String str, long j, boolean z);

    /* JADX INFO: renamed from: o.ctg$ActionBar */
    public static final class ActionBar {
        public static /* synthetic */ java.lang.String convertChainAmountToCoinAmount$default(InterfaceC12793ctg interfaceC12793ctg, java.lang.String str, long j, boolean z, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: convertChainAmountToCoinAmount");
            }
            if ((i & 4) != 0) {
                z = false;
            }
            return interfaceC12793ctg.copydefault(str, j, z);
        }

        public static /* synthetic */ kotlin.Pair displayFeeRangeValue$default(InterfaceC12793ctg interfaceC12793ctg, java.lang.String str, java.lang.Long l, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: displayFeeRangeValue");
            }
            if ((i & 2) != 0) {
                l = null;
            }
            return interfaceC12793ctg.KWHzl(str, l);
        }
    }
}
