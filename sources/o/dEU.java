package o;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/* JADX INFO: loaded from: classes4.dex */
public class dEU {
    public final C13241dEa AEQbTJ;
    public int EZpvd = 1;
    public final OkHttpClient KWHzl = OLrzqt();
    public final android.content.Context OLrzqt;

    public dEU(android.content.Context context, C13241dEa c13241dEa) {
        this.OLrzqt = context;
        this.AEQbTJ = c13241dEa;
    }

    public java.lang.String OLrzqt(android.content.Context context, java.lang.String str) {
        return java.lang.String.format(str, dDN.copydefault.AEQbTJ(context), KWHzl(context));
    }

    public java.lang.String AEQbTJ(java.lang.String str) {
        return AEQbTJ(str, OLrzqt(this.OLrzqt, "<script type=\"text/javascript\">%1$s</script><script type=\"text/javascript\">%2$s</script>"));
    }

    public final java.lang.String AEQbTJ(java.lang.String str, java.lang.String str2) {
        int iKWHzl;
        if (android.text.TextUtils.isEmpty(str) || (iKWHzl = KWHzl(str)) <= 0) {
            return str;
        }
        return str.substring(0, iKWHzl) + str2 + str.substring(iKWHzl);
    }

    public final int KWHzl(java.lang.String str) {
        java.lang.String lowerCase = str.toLowerCase();
        int iIndexOf = lowerCase.indexOf("<!--[if");
        int iIndexOf2 = lowerCase.indexOf("<script");
        if (iIndexOf >= 0) {
            iIndexOf2 = java.lang.Math.min(iIndexOf2, iIndexOf);
        }
        return iIndexOf2 < 0 ? lowerCase.indexOf("</head") : iIndexOf2;
    }

    public final java.lang.String KWHzl(android.content.Context context) {
        return dDN.copydefault.KWHzl(this.AEQbTJ.ejfBZ(), this.AEQbTJ.zsXlph(), this.AEQbTJ.AEQbTJ());
    }

    public final java.lang.String copydefault(java.lang.String str) {
        Matcher matcher = Pattern.compile("^.*(?=;)").matcher(str);
        return matcher.find() ? matcher.group() : "text/html";
    }

    public final java.lang.String OLrzqt(java.lang.String str) {
        Matcher matcher = Pattern.compile("charset=([a-zA-Z0-9-]+)").matcher(str);
        return (!matcher.find() || matcher.groupCount() < 2) ? "utf-8" : matcher.group(1);
    }

    public final java.lang.String KWHzl(Response response) {
        java.lang.String str;
        Headers headers = response.headers();
        if (android.text.TextUtils.isEmpty(headers.get("Content-Type"))) {
            str = android.text.TextUtils.isEmpty(headers.get("content-Type")) ? "text/data; charset=utf-8" : headers.get("content-Type");
        } else {
            str = headers.get("Content-Type");
        }
        return str != null ? str.trim() : str;
    }

    public dEV copydefault(java.lang.String str, java.util.Map<java.lang.String, java.lang.String> map) {
        try {
            return AEQbTJ(this.KWHzl.newCall(OLrzqt(str, map)).execute());
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    public final Request OLrzqt(java.lang.String str, java.util.Map<java.lang.String, java.lang.String> map) {
        HttpUrl httpUrl = HttpUrl.parse(str);
        if (httpUrl == null) {
            return null;
        }
        Request.Builder builderUrl = new Request.Builder().get().url(httpUrl);
        for (java.lang.String str2 : map.keySet()) {
            builderUrl.addHeader(str2, map.get(str2));
        }
        return builderUrl.build();
    }

    public final dEV AEQbTJ(Response response) {
        java.lang.String strString;
        int iCode = response.code();
        try {
            strString = (!response.isSuccessful() || response.body().contentLength() >= 20971520) ? null : response.body().string();
        } catch (java.lang.Throwable unused) {
        }
        if (strString == null) {
            return null;
        }
        java.lang.String strMessage = response.message();
        if (android.text.TextUtils.isEmpty(strMessage) && iCode == 200) {
            strMessage = "OK";
        }
        java.lang.String str = strMessage;
        Request request = response.request();
        Response responsePriorResponse = response.priorResponse();
        boolean z = responsePriorResponse != null && responsePriorResponse.isRedirect();
        java.lang.String strKWHzl = KWHzl(response);
        java.lang.String strCopydefault = copydefault(strKWHzl);
        java.lang.String strOLrzqt = OLrzqt(strKWHzl);
        java.lang.String string = request.url().toString();
        if (strKWHzl != null && strKWHzl.contains("text/html")) {
            java.lang.String strAEQbTJ = AEQbTJ(strString);
            Headers headers = response.headers();
            java.util.HashMap map = new java.util.HashMap();
            try {
                for (java.lang.String str2 : headers.names()) {
                    map.put(str2, headers.get(str2));
                }
            } catch (java.lang.Exception unused2) {
            }
            return new dEV(strAEQbTJ, iCode, string, strCopydefault, strOLrzqt, str, z, map);
        }
        return null;
    }

    public final OkHttpClient OLrzqt() {
        return new OkHttpClient.Builder().cookieJar(new dIR()).build();
    }
}
