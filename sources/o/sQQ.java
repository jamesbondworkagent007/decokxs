package o;

import com.okinc.okimcore.model.room.inhouseim.ContactWithPhoneData;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class sQQ {
    public static final java.lang.String AEQbTJ(@NotNull ContactWithPhoneData contactWithPhoneData) {
        Intrinsics.checkNotNullParameter(contactWithPhoneData, "");
        if (contactWithPhoneData.getRemarkName() != null) {
            return contactWithPhoneData.getRemarkName();
        }
        java.util.Locale locale = java.util.Locale.getDefault();
        Intrinsics.checkNotNullExpressionValue(locale, "");
        if (C38303pTu.KWHzl(locale)) {
            java.lang.String nickname = contactWithPhoneData.getNickname();
            return nickname == null ? "" : nickname;
        }
        java.lang.String enNickname = contactWithPhoneData.getEnNickname();
        java.lang.String nickname2 = contactWithPhoneData.getNickname();
        java.lang.String str = nickname2 != null ? nickname2 : "";
        return (enNickname == null || enNickname.length() == 0 || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) enNickname)) ? str : enNickname;
    }
}
