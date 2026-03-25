package o;

import com.okinc.share.bean.ShareConfig;
import com.okinc.share.bean.ShareType;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import uniffi.growth.SharePlatform;

/* JADX INFO: renamed from: o.ueF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C48888ueF implements InterfaceC2502AOf {
    @Override // o.InterfaceC2502AOf
    public boolean KWHzl(@NotNull java.lang.String str, @NotNull SharePlatform sharePlatform) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(sharePlatform, "");
        return C49122uib.OLrzqt.OLrzqt(C48889ueG.KWHzl.KWHzl(sharePlatform));
    }

    @Override // o.InterfaceC2502AOf
    public java.util.List<SharePlatform> EZpvd(@NotNull APJ apj, @NotNull java.util.List<? extends SharePlatform> list) {
        Intrinsics.checkNotNullParameter(apj, "");
        Intrinsics.checkNotNullParameter(list, "");
        ShareConfig shareConfigAEQbTJ = C48889ueG.KWHzl.AEQbTJ(apj);
        ShareType shareType = shareConfigAEQbTJ.getShareParams().getShareType();
        java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
        for (SharePlatform sharePlatform : list) {
            com.okinc.share.platforms.SharePlatform sharePlatformKWHzl = C48889ueG.KWHzl.KWHzl(sharePlatform);
            C49098uiD c49098uiD = C49098uiD.OLrzqt;
            InterfaceC49121uia interfaceC49121uiaAEQbTJ = c49098uiD.AEQbTJ(sharePlatformKWHzl);
            if (interfaceC49121uiaAEQbTJ != null) {
                if (interfaceC49121uiaAEQbTJ.AEQbTJ().contains(shareType) && c49098uiD.copydefault(sharePlatformKWHzl) && interfaceC49121uiaAEQbTJ.EZpvd(shareConfigAEQbTJ)) {
                    arrayList.add(sharePlatform);
                }
            } else {
                pUU.valueOf("SharePlatformManager", "filterAvailableSharePlatforms-->platform:" + sharePlatformKWHzl + " not register");
            }
        }
        return arrayList;
    }
}
