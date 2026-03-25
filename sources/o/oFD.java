package o;

import com.okinc.okimcore.model.im.OKReferenceMessage;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringNumberConversionsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class oFD {
    @yCM
    public oFD() {
    }

    public final boolean EZpvd(@NotNull OKReferenceMessage oKReferenceMessage, java.lang.Long l) {
        Intrinsics.checkNotNullParameter(oKReferenceMessage, "");
        if (l != null) {
            java.lang.String referMsgUid = oKReferenceMessage.getReferMsgUid();
            java.lang.Long fieldNames = referMsgUid != null ? StringsKt__StringNumberConversionsKt.getFieldNames(referMsgUid) : null;
            if (fieldNames != null && fieldNames.longValue() < l.longValue()) {
                return false;
            }
        }
        return true;
    }
}
