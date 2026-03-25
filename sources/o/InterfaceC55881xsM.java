package o;

import com.okinc.unify_trade.biz.BotCategoryConfig;
import com.okinc.unify_trade.biz.BotUserConfigInfo;
import com.okinc.unify_trade.biz.MpCategory;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xsM, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public interface InterfaceC55881xsM {
    java.util.List<MpCategory> AEQbTJ();

    void AEQbTJ(BotUserConfigInfo botUserConfigInfo);

    boolean EZpvd();

    java.util.List<MpCategory> KWHzl();

    void KWHzl(java.util.List<BotCategoryConfig> list);

    boolean OLrzqt();

    boolean OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2);

    BotUserConfigInfo copydefault();

    void copydefault(java.util.List<BotCategoryConfig> list);
}
