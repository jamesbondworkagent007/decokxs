package o;

import com.okinc.business.defi.share.bean.ShareLinkBean;
import com.okinc.business.defi.share.bean.Web3ShareBaseInfo;
import com.okinc.business.defi.share.bean.Web3ShareModel;
import com.okinc.business.defi.share.bean.Web3SharePreviewInfo;
import com.okinc.share.bean.ShareConfig;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.dTl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC13657dTl {
    public abstract void copydefault(@NotNull AbstractActivityC33041mov abstractActivityC33041mov, @NotNull Web3ShareModel web3ShareModel, ShareLinkBean shareLinkBean);

    public static /* synthetic */ void handleShare$default(AbstractC13657dTl abstractC13657dTl, AbstractActivityC33041mov abstractActivityC33041mov, Web3ShareModel web3ShareModel, ShareLinkBean shareLinkBean, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: handleShare");
        }
        if ((i & 4) != 0) {
            shareLinkBean = null;
        }
        abstractC13657dTl.copydefault(abstractActivityC33041mov, web3ShareModel, shareLinkBean);
    }

    public final void KWHzl(@NotNull ShareConfig shareConfig, @NotNull Web3ShareBaseInfo web3ShareBaseInfo) {
        Intrinsics.checkNotNullParameter(shareConfig, "");
        Intrinsics.checkNotNullParameter(web3ShareBaseInfo, "");
        Web3SharePreviewInfo previewInfo = web3ShareBaseInfo.getPreviewInfo();
        if (previewInfo != null) {
            java.lang.String previewTitle = previewInfo.getPreviewTitle();
            if (previewTitle != null) {
                shareConfig.getPreviewConfig().setPreviewTitle(previewTitle);
            }
            java.lang.String previewContent = previewInfo.getPreviewContent();
            if (previewContent != null) {
                shareConfig.getPreviewConfig().setPreviewContent(previewContent);
            }
        }
    }
}
