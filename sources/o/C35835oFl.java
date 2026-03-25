package o;

import com.okinc.im.config.serviceprovider.SendMessageRequestParam;
import com.okinc.okimcore.model.exception.MissingMediaPathException;
import com.okinc.okimcore.model.im.OKFileMessage;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.oFl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C35835oFl {
    @yCM
    public C35835oFl() {
    }

    public final OKFileMessage AEQbTJ(@NotNull SendMessageRequestParam.File file) throws MissingMediaPathException {
        Intrinsics.checkNotNullParameter(file, "");
        java.lang.String strKWHzl = file.KWHzl();
        if (StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strKWHzl)) {
            throw new MissingMediaPathException();
        }
        android.net.Uri uri = android.net.Uri.parse(strKWHzl);
        java.lang.String scheme = uri.getScheme();
        if (scheme == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) scheme)) {
            uri = android.net.Uri.parse("file://" + strKWHzl);
        }
        android.net.Uri uri2 = uri;
        java.lang.String strAEQbTJ = StringsKt__StringsKt.AEQbTJ(file.OLrzqt(), '.', "");
        if (strAEQbTJ.length() <= 0) {
            strAEQbTJ = null;
        }
        return new OKFileMessage(file.OLrzqt(), strAEQbTJ, java.lang.Long.valueOf(file.EZpvd()), null, uri2, 8, null);
    }
}
