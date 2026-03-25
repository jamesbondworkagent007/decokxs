package o;

import com.okinc.unify_trade.biz.BotCategoryConfig;
import com.okinc.unify_trade.biz.BotUserConfigInfo;
import com.okinc.unify_trade.biz.MpCategory;
import com.okinc.unify_trade.constants.BotUserRole;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xsL, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C55880xsL implements InterfaceC55881xsM {
    public java.util.List<MpCategory> AEQbTJ;
    public java.util.List<MpCategory> EZpvd;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC55881xsM
    public java.util.List<MpCategory> AEQbTJ() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC55881xsM
    public java.util.List<MpCategory> KWHzl() {
        return this.EZpvd;
    }

    @Override // o.InterfaceC55881xsM
    public BotUserConfigInfo copydefault() {
        xOR xorCopydefault;
        InterfaceC54581xNr interfaceC54581xNrCopydefault = C54589xNz.EZpvd.copydefault();
        if (interfaceC54581xNrCopydefault == null || (xorCopydefault = interfaceC54581xNrCopydefault.copydefault()) == null) {
            return null;
        }
        return xorCopydefault.KWHzl();
    }

    @Override // o.InterfaceC55881xsM
    public void AEQbTJ(BotUserConfigInfo botUserConfigInfo) {
        xOR xorCopydefault;
        InterfaceC54581xNr interfaceC54581xNrCopydefault = C54589xNz.EZpvd.copydefault();
        if (interfaceC54581xNrCopydefault == null || (xorCopydefault = interfaceC54581xNrCopydefault.copydefault()) == null) {
            return;
        }
        xorCopydefault.copydefault(botUserConfigInfo);
    }

    @Override // o.InterfaceC55881xsM
    public boolean EZpvd() {
        BotUserConfigInfo botUserConfigInfoCopydefault = copydefault();
        return Intrinsics.EZpvd((java.lang.Object) (botUserConfigInfoCopydefault != null ? botUserConfigInfoCopydefault.getUserRole() : null), (java.lang.Object) BotUserRole.LEAD_TRADER.getRole());
    }

    @Override // o.InterfaceC55881xsM
    public boolean OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        BotUserConfigInfo botUserConfigInfoCopydefault;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return EZpvd() && (botUserConfigInfoCopydefault = copydefault()) != null && Intrinsics.EZpvd(botUserConfigInfoCopydefault.isStgyPublic(), java.lang.Boolean.TRUE) && (Intrinsics.EZpvd((java.lang.Object) str2, (java.lang.Object) "grid") || Intrinsics.EZpvd((java.lang.Object) str2, (java.lang.Object) "contract_grid") || Intrinsics.EZpvd((java.lang.Object) str2, (java.lang.Object) "contract_dca")) && Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "USDT");
    }

    @Override // o.InterfaceC55881xsM
    public boolean OLrzqt() {
        BotUserConfigInfo botUserConfigInfoCopydefault = copydefault();
        return Intrinsics.EZpvd((java.lang.Object) (botUserConfigInfoCopydefault != null ? botUserConfigInfoCopydefault.getSignalUserRole() : null), (java.lang.Object) BotUserRole.SIGNAL_PROVIDER.getRole());
    }

    @Override // o.InterfaceC55881xsM
    public void copydefault(java.util.List<BotCategoryConfig> list) {
        BotCategoryConfig botCategoryConfig;
        xOR xorCopydefault;
        if (list == null || (botCategoryConfig = (BotCategoryConfig) CollectionsKt___CollectionsKt.firstOrNull(list)) == null) {
            return;
        }
        this.EZpvd = botCategoryConfig.getHomepageCategory();
        InterfaceC54581xNr interfaceC54581xNrCopydefault = C54589xNz.EZpvd.copydefault();
        if (interfaceC54581xNrCopydefault == null || (xorCopydefault = interfaceC54581xNrCopydefault.copydefault()) == null) {
            return;
        }
        xorCopydefault.KWHzl(botCategoryConfig.getStrategy());
        xorCopydefault.OLrzqt(botCategoryConfig.getStrategy());
        xorCopydefault.AEQbTJ(botCategoryConfig.getSupportedFeatures());
    }

    @Override // o.InterfaceC55881xsM
    public void KWHzl(java.util.List<BotCategoryConfig> list) {
        BotCategoryConfig botCategoryConfig;
        if (list == null || (botCategoryConfig = (BotCategoryConfig) CollectionsKt___CollectionsKt.firstOrNull(list)) == null) {
            return;
        }
        this.AEQbTJ = botCategoryConfig.getHomepageCategory();
    }
}
