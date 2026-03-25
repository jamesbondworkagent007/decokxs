package o;

import kotlin.text.StringsKt__StringsKt;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonElement;

/* JADX INFO: loaded from: classes16.dex */
public final class sIG {
    public final java.lang.String OLrzqt(JsonElement jsonElement) {
        if (jsonElement != null) {
            return jsonElement.toString();
        }
        return null;
    }

    public final JsonElement copydefault(java.lang.String str) {
        if (str == null) {
            return null;
        }
        if (!(!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str))) {
            str = null;
        }
        if (str == null) {
            return null;
        }
        try {
            return Json.Default.parseToJsonElement(str);
        } catch (java.lang.Exception unused) {
            return null;
        }
    }
}
