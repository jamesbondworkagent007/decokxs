package o;

import com.okinc.im.config.serviceprovider.SendMessageRequestParam;
import com.okinc.okimcore.model.exception.MissingMediaPathException;
import com.okinc.okimcore.model.im.OKSightMessage;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.oFv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C35845oFv {
    public final android.content.Context EZpvd;

    @yCM
    public C35845oFv(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        this.EZpvd = context;
    }

    public final OKSightMessage OLrzqt(@NotNull SendMessageRequestParam.Video video) throws MissingMediaPathException {
        Intrinsics.checkNotNullParameter(video, "");
        java.lang.String strAEQbTJ = video.AEQbTJ();
        int iCopydefault = video.copydefault();
        if (StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strAEQbTJ)) {
            throw new MissingMediaPathException();
        }
        android.net.Uri uri = android.net.Uri.parse(strAEQbTJ);
        java.lang.String scheme = uri.getScheme();
        if (scheme == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) scheme)) {
            uri = android.net.Uri.parse("file://" + strAEQbTJ);
        }
        OKSightMessage.CREATOR creator = OKSightMessage.CREATOR;
        android.content.Context context = this.EZpvd;
        Intrinsics.copydefault(uri);
        return creator.obtain(context, uri, iCopydefault / 1000);
    }
}
