package o;

import com.okinc.unify_trade.biz.DexInstrument;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kEb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public interface InterfaceC27808kEb {
    void AEQbTJ(@NotNull java.lang.String str);

    void AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2);

    void AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4);

    void EZpvd(@NotNull DexInstrument dexInstrument, @NotNull java.lang.String str);

    void EZpvd(@NotNull java.lang.String str, java.lang.String str2);

    void EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5);

    void OLrzqt();

    void OLrzqt(@NotNull DexInstrument dexInstrument, @NotNull java.lang.String str, @NotNull java.lang.String str2);

    void OLrzqt(@NotNull java.lang.String str, java.lang.String str2);

    void aZ_();

    void ba_();

    void copydefault(@NotNull java.lang.String str, java.lang.String str2);

    void copydefault(@NotNull java.lang.String str, java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, java.lang.String str6, java.lang.Boolean bool);

    /* JADX INFO: renamed from: o.kEb$StateListAnimator */
    public static final class StateListAnimator {
        public static /* synthetic */ void trackRankingModuleView$default(InterfaceC27808kEb interfaceC27808kEb, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: trackRankingModuleView");
            }
            if ((i & 2) != 0) {
                str2 = null;
            }
            interfaceC27808kEb.copydefault(str, str2);
        }

        public static /* synthetic */ void trackRankingTabClick$default(InterfaceC27808kEb interfaceC27808kEb, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: trackRankingTabClick");
            }
            if ((i & 2) != 0) {
                str2 = null;
            }
            interfaceC27808kEb.EZpvd(str, str2);
        }

        public static /* synthetic */ void trackRankingTradingPairClick$default(InterfaceC27808kEb interfaceC27808kEb, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.Boolean bool, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: trackRankingTradingPairClick");
            }
            interfaceC27808kEb.copydefault(str, (i & 2) != 0 ? null : str2, str3, str4, str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? java.lang.Boolean.FALSE : bool);
        }

        public static /* synthetic */ void trackRankingViewAllClick$default(InterfaceC27808kEb interfaceC27808kEb, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: trackRankingViewAllClick");
            }
            if ((i & 2) != 0) {
                str2 = null;
            }
            interfaceC27808kEb.OLrzqt(str, str2);
        }
    }
}
