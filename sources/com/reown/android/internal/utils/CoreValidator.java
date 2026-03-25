package com.reown.android.internal.utils;

import com.reown.android.internal.common.model.Expiry;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringsKt;
import o.C56540yJd;

/* JADX INFO: loaded from: classes12.dex */
public final class CoreValidator {
    public static final String ACCOUNT_ADDRESS_REGEX = "^[-.%a-zA-Z0-9]{1,128}$";
    public static final CoreValidator INSTANCE = new CoreValidator();
    public static final String NAMESPACE_REGEX = "^[-a-z0-9]{3,8}$";
    public static final String REFERENCE_REGEX = "^[-_a-zA-Z0-9]{1,32}$";

    public final /* synthetic */ boolean isAccountIdCAIP10Compliant(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        List listSplit$default = StringsKt__StringsKt.split$default((CharSequence) str, new String[]{":"}, false, 0, 6, (Object) null);
        if (listSplit$default.isEmpty() || listSplit$default.size() != 3) {
            return false;
        }
        return isNamespaceRegexCompliant((String) listSplit$default.get(0)) && new Regex(REFERENCE_REGEX).matches((String) listSplit$default.get(1)) && new Regex(ACCOUNT_ADDRESS_REGEX).matches((String) listSplit$default.get(2));
    }

    public final /* synthetic */ boolean isChainIdCAIP2Compliant(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        List listSplit$default = StringsKt__StringsKt.split$default((CharSequence) str, new String[]{":"}, false, 0, 6, (Object) null);
        if (listSplit$default.isEmpty() || listSplit$default.size() != 2) {
            return false;
        }
        return isNamespaceRegexCompliant((String) listSplit$default.get(0)) && new Regex(REFERENCE_REGEX).matches((String) listSplit$default.get(1));
    }

    public final /* synthetic */ boolean isNamespaceRegexCompliant(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return new Regex(NAMESPACE_REGEX).matches(str);
    }

    public final /* synthetic */ boolean isExpiryWithinBounds(Expiry expiry) {
        if (expiry == null) {
            return true;
        }
        return new C56540yJd(Time.getFiveMinutesInSeconds(), Time.getWeekInSeconds()).KWHzl(expiry.getSeconds() - Time.getCurrentTimeInSeconds());
    }

    public final /* synthetic */ boolean isExpired(Expiry expiry) {
        Intrinsics.checkNotNullParameter(expiry, "");
        return expiry.getSeconds() < Time.getCurrentTimeInSeconds();
    }
}
