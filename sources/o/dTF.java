package o;

import com.okinc.business.defi.share.bean.ShareLinkBean;
import com.okinc.business.defi.share.bean.Web3ShareBaseInfo;
import com.okinc.business.defi.share.bean.Web3ShareLinkInfo;
import com.okinc.business.defi.share.bean.Web3ShareModel;
import com.okinc.share.bean.ShareConfig;
import com.okinc.share.bean.link.LinkShareParams;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class dTF extends AbstractC13657dTl {
    @Override // o.AbstractC13657dTl
    public void copydefault(@NotNull AbstractActivityC33041mov abstractActivityC33041mov, @NotNull Web3ShareModel web3ShareModel, ShareLinkBean shareLinkBean) {
        java.lang.Object next;
        java.lang.String directShareLink;
        Intrinsics.checkNotNullParameter(abstractActivityC33041mov, "");
        Intrinsics.checkNotNullParameter(web3ShareModel, "");
        java.util.Iterator<T> it = web3ShareModel.getShareInfoList().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (((Web3ShareBaseInfo) next) instanceof Web3ShareLinkInfo) {
                    break;
                }
            }
        }
        Web3ShareLinkInfo web3ShareLinkInfo = next instanceof Web3ShareLinkInfo ? (Web3ShareLinkInfo) next : null;
        if (web3ShareLinkInfo == null || (directShareLink = web3ShareLinkInfo.getDirectShareLink()) == null) {
            return;
        }
        ShareConfig.ActionBar actionBar = ShareConfig.Companion;
        LinkShareParams linkShareParamsCreate$default = LinkShareParams.Activity.create$default(LinkShareParams.Companion, directShareLink, null, 2, null);
        linkShareParamsCreate$default.setShareFrom(web3ShareModel.getShareFrom());
        linkShareParamsCreate$default.setBody(directShareLink);
        ShareConfig shareConfigCreate$default = ShareConfig.ActionBar.create$default(actionBar, linkShareParamsCreate$default, null, 2, null);
        KWHzl(shareConfigCreate$default, web3ShareLinkInfo);
        ((InterfaceC48893ueK) C43251rlk.copydefault(InterfaceC48893ueK.class)).copydefault(abstractActivityC33041mov, shareConfigCreate$default);
    }
}
