package o;

import com.okinc.network.okg.cor.SubdomainStrategy;
import com.okinc.web.WebActivity;
import com.okinc.web.bean.WebShareInfo;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.djI, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C14320djI {
    public static final C14320djI OLrzqt = new C14320djI();

    private C14320djI() {
    }

    public static /* synthetic */ void openHistoryWebPageWithShare$default(C14320djI c14320djI, android.content.Context context, java.lang.String str, java.lang.String str2, android.os.Bundle bundle, int i, java.lang.Object obj) {
        if ((i & 8) != 0) {
            bundle = new android.os.Bundle();
        }
        c14320djI.KWHzl(context, str, str2, bundle);
    }

    public final void KWHzl(@NotNull android.content.Context context, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(bundle, "");
        WebShareInfo webShareInfo = new WebShareInfo(str, null, C33069mpW.copydefault(C13754dXa.FragmentManager.checkCloseActionMenu, C56423yEv.EZpvd(C56390yDp.OLrzqt("Txhash", str2))), null, null, 4, null, 90, null);
        bundle.putString("url", str);
        bundle.putString("subdomainstrategy", SubdomainStrategy.Global.INSTANCE.toString());
        bundle.putBoolean("share", C33129mqd.OLrzqt((java.lang.CharSequence) str));
        bundle.putParcelable("share_info", webShareInfo);
        WebActivity.TaskDescription.openPage$default(WebActivity.Companion, context, bundle, null, 4, null);
    }
}
