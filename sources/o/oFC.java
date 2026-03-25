package o;

import com.okinc.im.config.serviceprovider.SendMessageRequestParam;
import com.okinc.okimcore.model.exception.EmptyInputTextException;
import com.okinc.okimcore.model.im.OKTextMessage;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class oFC {
    @yCM
    public oFC() {
    }

    public final OKTextMessage KWHzl(@NotNull SendMessageRequestParam.Text text) throws EmptyInputTextException {
        Intrinsics.checkNotNullParameter(text, "");
        java.lang.String strCopydefault = text.copydefault();
        if (StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strCopydefault)) {
            throw new EmptyInputTextException();
        }
        OKTextMessage.CREATOR creator = OKTextMessage.CREATOR;
        java.lang.Boolean boolEZpvd = text.EZpvd();
        return creator.obtainSendMessage(strCopydefault, boolEZpvd != null ? boolEZpvd.booleanValue() : false);
    }
}
