package o;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.okinc.web.WebActivity;
import com.okinc.web.web.IWebActivityAPI;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ygE, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C57318ygE {
    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [30=4] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final void AEQbTJ(@NotNull final android.app.Activity activity, @NotNull final com.okinc.jsbridge.Message message, @NotNull final AbstractC57334ygU abstractC57334ygU) {
        java.lang.String asString;
        Intrinsics.checkNotNullParameter(activity, "");
        Intrinsics.checkNotNullParameter(message, "");
        Intrinsics.checkNotNullParameter(abstractC57334ygU, "");
        Gson gson = new Gson();
        java.lang.String str = message.method;
        if (str != null) {
            switch (str.hashCode()) {
                case -1808499524:
                    if (str.equals("shareImage")) {
                        JsonElement jsonElement = ((JsonObject) gson.fromJson(message.data, JsonObject.class)).get("imageUrl");
                        asString = jsonElement != null ? jsonElement.getAsString() : null;
                        if (asString == null) {
                            abstractC57334ygU.copydefault(message, "imageUrl is null");
                        } else {
                            C33610mzh.OLrzqt.copydefault(activity, asString, new Function1() { // from class: o.ygG
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                @Override // kotlin.jvm.functions.Function1
                                public final java.lang.Object invoke(java.lang.Object obj) {
                                    return C57318ygE.AEQbTJ(activity, message, abstractC57334ygU, (java.lang.String) obj);
                                }
                            });
                        }
                        break;
                    }
                    break;
                case 109400031:
                    if (str.equals("share")) {
                        JsonObject jsonObject = (JsonObject) gson.fromJson(message.data, JsonObject.class);
                        JsonElement jsonElement2 = jsonObject.get("linkUrl");
                        java.lang.String asString2 = jsonElement2 != null ? jsonElement2.getAsString() : null;
                        if (!C33129mqd.OLrzqt((java.lang.CharSequence) asString2)) {
                            JsonElement jsonElement3 = jsonObject.get("imageUrl");
                            asString = jsonElement3 != null ? jsonElement3.getAsString() : null;
                            if (asString == null) {
                                abstractC57334ygU.copydefault(message, "imageUrl is null");
                            } else {
                                C33610mzh.OLrzqt.copydefault(activity, asString, new Function1() { // from class: o.ygI
                                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                    @Override // kotlin.jvm.functions.Function1
                                    public final java.lang.Object invoke(java.lang.Object obj) {
                                        return C57318ygE.OLrzqt(activity, message, abstractC57334ygU, (java.lang.String) obj);
                                    }
                                });
                            }
                        } else {
                            android.content.Intent intent = new android.content.Intent("android.intent.action.SEND");
                            intent.putExtra("android.intent.extra.TEXT", asString2);
                            intent.setType("text/plain");
                            activity.startActivity(android.content.Intent.createChooser(intent, null));
                            abstractC57334ygU.OLrzqt(message, "");
                        }
                        break;
                    }
                    break;
                case 1739687432:
                    if (str.equals("nativeShare") && (activity instanceof WebActivity) && !activity.isDestroyed()) {
                        ((WebActivity) activity).showLoading();
                        new android.os.Handler().postDelayed(new java.lang.Runnable() { // from class: o.ygH
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // java.lang.Runnable
                            public final void run() {
                                C57318ygE.copydefault(activity, message, abstractC57334ygU);
                            }
                        }, 800L);
                    }
                    break;
                case 1898416427:
                    if (str.equals("shareImageBase64")) {
                        JsonElement jsonElement4 = ((JsonObject) gson.fromJson(message.data, JsonObject.class)).get("base64Image");
                        asString = jsonElement4 != null ? jsonElement4.getAsString() : null;
                        if (asString == null) {
                            abstractC57334ygU.copydefault(message, "base64Image is null");
                        } else {
                            AEQbTJ(activity, C33610mzh.OLrzqt.KWHzl(activity, asString), message, abstractC57334ygU);
                        }
                        break;
                    }
                    break;
            }
        }
    }

    public static final Unit OLrzqt(android.app.Activity activity, com.okinc.jsbridge.Message message, AbstractC57334ygU abstractC57334ygU, java.lang.String str) {
        AEQbTJ(activity, str, message, abstractC57334ygU);
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(android.app.Activity activity, com.okinc.jsbridge.Message message, AbstractC57334ygU abstractC57334ygU, java.lang.String str) {
        AEQbTJ(activity, str, message, abstractC57334ygU);
        return Unit.INSTANCE;
    }

    public static final void copydefault(android.app.Activity activity, com.okinc.jsbridge.Message message, AbstractC57334ygU abstractC57334ygU) {
        WebActivity webActivity = (WebActivity) activity;
        IWebActivityAPI iWebActivityAPIFARcdN = webActivity.fARcdN();
        android.graphics.Bitmap bitmapBuildWebViewDrawCache = iWebActivityAPIFARcdN != null ? iWebActivityAPIFARcdN.buildWebViewDrawCache() : null;
        if (bitmapBuildWebViewDrawCache != null) {
            AEQbTJ(activity, C33610mzh.OLrzqt.OLrzqt(activity, bitmapBuildWebViewDrawCache), message, abstractC57334ygU);
        } else {
            abstractC57334ygU.copydefault(message, "fail to get bitmap");
        }
        webActivity.dismissLoading();
    }

    public static final void AEQbTJ(@NotNull android.content.Context context, java.lang.String str, @NotNull com.okinc.jsbridge.Message message, @NotNull AbstractC57334ygU abstractC57334ygU) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(message, "");
        Intrinsics.checkNotNullParameter(abstractC57334ygU, "");
        if (C33129mqd.OLrzqt((java.lang.CharSequence) str)) {
            android.content.Intent intent = new android.content.Intent();
            intent.setAction("android.intent.action.SEND");
            intent.putExtra("android.intent.extra.STREAM", android.net.Uri.fromFile(new java.io.File(str)));
            intent.setType("image/jpeg");
            context.startActivity(android.content.Intent.createChooser(intent, null));
            abstractC57334ygU.OLrzqt(message, "");
            return;
        }
        abstractC57334ygU.copydefault(message, "file not found");
    }
}
