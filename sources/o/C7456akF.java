package o;

import java.nio.charset.StandardCharsets;

/* JADX INFO: renamed from: o.akF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C7456akF {
    public static java.lang.String OLrzqt(java.lang.String str, boolean z, boolean z2) {
        if (!z) {
            return java.lang.String.format("<html style=\"width:100%%;height:100%%;\"><body style=\"width:100%%;height:100%%;margin:0;\">\n                         <div style=\"width: 100%%;height:100%%;margin:0;\">\n                         <img style=\"width: 100%%; height: 100%%;margin:0;\" src=\"data:image/svg+xml;base64, %s\" />\n                         </div>\n                         </body></html>", android.util.Base64.encodeToString(str.getBytes(StandardCharsets.UTF_8), 0));
        }
        if (z2) {
            return java.lang.String.format("<html style=\"width:100%%;height:100%%;\"><body style=\"width:100%%;height:100%%;margin:0;\">\n                         <div style=\"width: 100%%;height:100%%;margin:0;\">\n                         <img style=\"width: 100%%; height: 100%%;margin:0;\" src=\"data:image/svg+xml;base64, %s\" />\n                         </div>\n                         </body></html>", str);
        }
        return java.lang.String.format("<html style=\"width:100%%;height:100%%;\"><body style=\"width:100%%;height:100%%;margin:0;\">\n                         <div style=\"width:100%%;height:100%%;margin:0;\">\n                         <img style=\"width:100%%;height:100%%;margin:0;image-rendering:pixelated;\" src=\"data:image/png;base64,%s\" />\n                         </div>\n                         </body></html>", str);
    }

    public static java.lang.String AEQbTJ(byte[] bArr) {
        return java.lang.String.format("<html style=\"width:100%%;height:100%%;\"><body style=\"width:100%%;height:100%%;margin:0;\">\n                         <div style=\"width:100%%;height:100%%;margin:0;\">\n                         <img style=\"width:100%%;height:100%%;margin:0;image-rendering:pixelated;\" src=\"data:image/png;base64,%s\" />\n                         </div>\n                         </body></html>", android.util.Base64.encodeToString(bArr, 0));
    }
}
