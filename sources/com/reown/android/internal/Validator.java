package com.reown.android.internal;

import com.google.android.exoplayer2.C;
import com.huawei.hms.framework.common.ContainerUtils;
import com.reown.android.internal.common.model.Expiry;
import com.reown.android.internal.common.model.RelayProtocolOptions;
import com.reown.android.internal.common.model.SymmetricKey;
import com.reown.android.internal.common.model.WalletConnectUri;
import com.reown.foundation.common.model.Topic;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URLDecoder;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C56390yDp;
import o.C56403yEb;
import o.C56423yEv;
import o.C56548yJl;
import o.C59449zhJ;

/* JADX INFO: loaded from: classes12.dex */
public final class Validator {
    public static final Validator INSTANCE = new Validator();
    public static final String WC_URI_QUERY_KEY = "wc?uri=";

    public final /* synthetic */ WalletConnectUri validateWCUri$android_release(String str) {
        Unit unit;
        Unit unit2;
        Intrinsics.checkNotNullParameter(str, "");
        String wcUri = getWcUri(str);
        if (!C59449zhJ.startsWith$default(wcUri, "wc:", false, 2, null)) {
            return null;
        }
        if (!StringsKt__StringsKt.contains$default((CharSequence) wcUri, (CharSequence) "wc://", false, 2, (Object) null)) {
            wcUri = StringsKt__StringsKt.contains$default((CharSequence) wcUri, (CharSequence) "wc:/", false, 2, (Object) null) ? C59449zhJ.replace$default(wcUri, "wc:/", "wc://", false, 4, (Object) null) : C59449zhJ.replace$default(wcUri, "wc:", "wc://", false, 4, (Object) null);
        }
        try {
            URI uri = new URI(wcUri);
            String userInfo = uri.getUserInfo();
            Intrinsics.checkNotNullExpressionValue(userInfo, "");
            if (userInfo.length() == 0) {
                return null;
            }
            String query = uri.getQuery();
            Intrinsics.checkNotNullExpressionValue(query, "");
            List<String> listSplit$default = StringsKt__StringsKt.split$default((CharSequence) query, new String[]{ContainerUtils.FIELD_DELIMITER}, false, 0, 6, (Object) null);
            LinkedHashMap linkedHashMap = new LinkedHashMap(C56548yJl.copydefault(C56423yEv.copydefault(C56403yEb.AYXKKw(listSplit$default, 10)), 16));
            for (String str2 : listSplit$default) {
                Pair pairOLrzqt = C56390yDp.OLrzqt(StringsKt__StringsKt.substringBefore$default(str2, ContainerUtils.KEY_VALUE_DELIMITER, (String) null, 2, (Object) null), StringsKt__StringsKt.substringAfter$default(str2, ContainerUtils.KEY_VALUE_DELIMITER, (String) null, 2, (Object) null));
                linkedHashMap.put(pairOLrzqt.getFirst(), pairOLrzqt.getSecond());
            }
            String str3 = (String) linkedHashMap.get("relay-protocol");
            if (str3 != null) {
                unit = Unit.INSTANCE;
            } else {
                str3 = "";
                unit = null;
            }
            if (unit == null || str3.length() == 0) {
                return null;
            }
            String str4 = (String) linkedHashMap.get("relay-data");
            String str5 = (String) linkedHashMap.get("expiryTimestamp");
            String str6 = (String) linkedHashMap.get("methods");
            String str7 = (String) linkedHashMap.get("symKey");
            if (str7 != null) {
                unit2 = Unit.INSTANCE;
            } else {
                str7 = "";
                unit2 = null;
            }
            if (unit2 == null || str7.length() == 0) {
                return null;
            }
            String userInfo2 = uri.getUserInfo();
            Intrinsics.checkNotNullExpressionValue(userInfo2, "");
            return new WalletConnectUri(new Topic(userInfo2), SymmetricKey.m7239constructorimpl(str7), new RelayProtocolOptions(str3, str4), null, str5 != null ? new Expiry(Long.parseLong(str5)) : null, str6, 8, null);
        } catch (URISyntaxException unused) {
            return null;
        }
    }

    public final String getWcUri(String str) {
        try {
            String strDecode = URLDecoder.decode(StringsKt__StringsKt.contains$default((CharSequence) str, (CharSequence) WC_URI_QUERY_KEY, false, 2, (Object) null) ? (String) StringsKt__StringsKt.split$default((CharSequence) str, new String[]{WC_URI_QUERY_KEY}, false, 0, 6, (Object) null).get(1) : str, C.UTF8_NAME);
            Intrinsics.copydefault((Object) strDecode);
            return strDecode;
        } catch (Throwable unused) {
            return str;
        }
    }
}
