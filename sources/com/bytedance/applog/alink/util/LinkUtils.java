package com.bytedance.applog.alink.util;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.net.Uri;
import android.util.Base64;
import java.nio.charset.Charset;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import o.C59449zhJ;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes14.dex */
public final class LinkUtils {
    public static final LinkUtils INSTANCE = new LinkUtils();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final JSONObject getParamFromClipboard(Context context) {
        Object systemService;
        if (context != null) {
            try {
                systemService = context.getSystemService("clipboard");
            } catch (Throwable unused) {
            }
        } else {
            systemService = null;
        }
        if (systemService == null) {
            throw new TypeCastException("null cannot be cast to non-null type android.content.ClipboardManager");
        }
        ClipboardManager clipboardManager = (ClipboardManager) systemService;
        ClipData primaryClip = clipboardManager.getPrimaryClip();
        if (primaryClip != null) {
            ClipData.Item itemAt = primaryClip.getItemAt(0);
            Intrinsics.AEQbTJ(itemAt, "");
            String string = itemAt.getText().toString();
            if (C59449zhJ.startsWith$default(string, "datatracer:", false, 2, null)) {
                clipboardManager.setPrimaryClip(ClipData.newPlainText("", ""));
                if (string == null) {
                    throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
                }
                String strSubstring = string.substring(11);
                Intrinsics.AEQbTJ(strSubstring, "");
                Charset charset = Charsets.UTF_8;
                if (strSubstring == null) {
                    throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
                }
                byte[] bytes = strSubstring.getBytes(charset);
                Intrinsics.AEQbTJ(bytes, "");
                byte[] bArrDecode = Base64.decode(bytes, 2);
                StringBuilder sb = new StringBuilder();
                sb.append("?");
                Intrinsics.AEQbTJ(bArrDecode, "");
                sb.append(new String(bArrDecode, charset));
                return getParamFromLink(Uri.parse(sb.toString()));
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final JSONObject getParamFromLink(Uri uri) {
        try {
            JSONObject jSONObject = new JSONObject();
            if (uri == null) {
                return jSONObject;
            }
            String scheme = uri.getScheme();
            if (Intrinsics.EZpvd((Object) scheme, (Object) "http") || Intrinsics.EZpvd((Object) scheme, (Object) "https")) {
                jSONObject.put("tr_token", uri.getLastPathSegment());
            }
            for (String str : uri.getQueryParameterNames()) {
                jSONObject.put(str, uri.getQueryParameter(str));
            }
            return jSONObject;
        } catch (Throwable unused) {
            return null;
        }
    }
}
