package o;

import com.okinc.im.config.serviceprovider.SendMessageRequestParam;
import com.okinc.okimcore.model.exception.MissingMediaPathException;
import com.okinc.okimcore.model.im.OKGIFMessage;
import com.okinc.okimcore.model.im.OKImageMessage;
import com.okinc.okimcore.model.im.OKMediaMessageContent;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.oFo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C35838oFo {
    @yCM
    public C35838oFo() {
    }

    public final OKMediaMessageContent EZpvd(@NotNull SendMessageRequestParam.ImageOrGif imageOrGif) throws MissingMediaPathException {
        Intrinsics.checkNotNullParameter(imageOrGif, "");
        java.lang.String strKWHzl = imageOrGif.KWHzl();
        java.lang.String strEZpvd = imageOrGif.EZpvd();
        boolean zCopydefault = imageOrGif.copydefault();
        if (StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strKWHzl)) {
            throw new MissingMediaPathException();
        }
        if (!C59449zhJ.startsWith$default(strKWHzl, "content://", false, 2, null) && !C59449zhJ.startsWith$default(strKWHzl, "file://", false, 2, null)) {
            strKWHzl = "file://" + strKWHzl;
        }
        android.net.Uri uri = android.net.Uri.parse(strKWHzl);
        return C59449zhJ.gEmmrt(strEZpvd, "image/gif", true) ? OKGIFMessage.CREATOR.obtain$default(OKGIFMessage.CREATOR, uri, null, 2, null) : OKImageMessage.CREATOR.obtain(uri, uri, zCopydefault);
    }
}
