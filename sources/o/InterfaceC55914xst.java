package o;

import com.okinc.unify_trade.biz.SpotGridTpSlConfig;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xst, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public interface InterfaceC55914xst {
    java.lang.String AEQbTJ(java.lang.String str, @NotNull java.lang.String str2, java.lang.String str3, java.lang.String str4, @NotNull SpotGridTpSlConfig spotGridTpSlConfig, @NotNull java.lang.String str5, @NotNull java.lang.String str6, @NotNull java.lang.String str7);

    C55851xrj AEQbTJ(int i, @NotNull java.lang.String str, java.lang.String str2, java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, SpotGridTpSlConfig spotGridTpSlConfig, java.lang.String str6);

    java.lang.String KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3);

    java.lang.String OLrzqt();

    java.lang.String OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2, java.lang.String str3);

    java.lang.String OLrzqt(@NotNull C55887xsS c55887xsS, java.lang.String str, java.lang.String str2, @NotNull java.lang.String str3);

    /* JADX INFO: renamed from: o.xst$StateListAnimator */
    public static final class StateListAnimator {
        public static /* synthetic */ C55851xrj getInputConfigData$default(InterfaceC55914xst interfaceC55914xst, int i, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, SpotGridTpSlConfig spotGridTpSlConfig, java.lang.String str6, int i2, java.lang.Object obj) {
            if (obj == null) {
                return interfaceC55914xst.AEQbTJ(i, str, str2, str3, str4, str5, (i2 & 64) != 0 ? null : spotGridTpSlConfig, (i2 & 128) != 0 ? null : str6);
            }
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getInputConfigData");
        }
    }
}
