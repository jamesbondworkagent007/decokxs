package o;

import com.okinc.business.defi.common.utils.CDNSourceManager;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class eHR {
    public static final void OLrzqt(@NotNull C16534elj c16534elj, @NotNull eHS ehs) {
        Intrinsics.checkNotNullParameter(c16534elj, "");
        Intrinsics.checkNotNullParameter(ehs, "");
        c16534elj.KWHzl.setText(ehs.AEQbTJ());
        android.widget.ImageView imageView = c16534elj.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        imageView.setVisibility(ehs.EZpvd() ? 4 : 0);
        android.widget.ImageView imageView2 = c16534elj.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(imageView2, "");
        C14677dpv.OLrzqt(imageView2, CDNSourceManager.ImageSource.OneKeySigning);
        C55113xdn c55113xdn = c16534elj.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(c55113xdn, "");
        c55113xdn.setVisibility(ehs.EZpvd() ? 0 : 8);
    }
}
