package com.geetest.captcha;

import com.huawei.hms.framework.common.ContainerUtils;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f374a;
    public final Map<String, String> b;

    public static final class a {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public static t a(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            try {
            } catch (Exception e) {
                e.printStackTrace();
            }
            if (StringsKt__StringsKt.fARcdN((CharSequence) str)) {
                return null;
            }
            Object[] array = StringsKt__StringsKt.split$default((CharSequence) StringsKt__StringsKt.hDKMBd((CharSequence) str).toString(), new String[]{"?"}, false, 0, 6, (Object) null).toArray(new String[0]);
            if (array == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            }
            String[] strArr = (String[]) array;
            HashMap map = new HashMap();
            if (strArr.length == 1) {
                return new t(strArr[0], map);
            }
            if (strArr.length == 2) {
                Object[] array2 = StringsKt__StringsKt.split$default((CharSequence) strArr[1], new String[]{ContainerUtils.FIELD_DELIMITER}, false, 0, 6, (Object) null).toArray(new String[0]);
                if (array2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                }
                for (String str2 : (String[]) array2) {
                    Object[] array3 = StringsKt__StringsKt.split$default((CharSequence) str2, new String[]{ContainerUtils.KEY_VALUE_DELIMITER}, false, 0, 6, (Object) null).toArray(new String[0]);
                    if (array3 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                    }
                    String[] strArr2 = (String[]) array3;
                    if (strArr2.length == 2) {
                        map.put(strArr2[0], strArr2[1]);
                    }
                }
                return new t(strArr[0], map);
            }
            return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public t(String str, Map<String, String> map) {
        this.f374a = str;
        this.b = map;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        Map<String, String> map = this.b;
        if (map == null || map.isEmpty()) {
            return this.f374a;
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f374a);
        stringBuffer.append('?');
        for (Map.Entry<String, String> entry : this.b.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            stringBuffer.append(key);
            stringBuffer.append('=');
            stringBuffer.append(value);
            stringBuffer.append('&');
        }
        String string = stringBuffer.deleteCharAt(stringBuffer.length() - 1).toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }
}
