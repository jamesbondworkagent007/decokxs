package o;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import org.jsoup.nodes.Document;

/* JADX INFO: renamed from: o.ygf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public class C57345ygf {
    public static java.lang.String AEQbTJ;
    public C57350ygk EZpvd;

    public C57345ygf(C57350ygk c57350ygk) {
        this.EZpvd = c57350ygk;
    }

    public static java.lang.String AEQbTJ(android.content.Context context, byte[] bArr) throws java.io.IOException {
        if (AEQbTJ == null) {
            AEQbTJ = new java.lang.String(C57354ygo.KWHzl(context.getAssets().open("interceptheader.html")));
        }
        Document documentEZpvd = C59909zrQ.EZpvd(new java.lang.String(bArr));
        documentEZpvd.djBIcL().OLrzqt(false);
        C59952zsh c59952zshCopydefault = documentEZpvd.copydefault(TtmlNode.TAG_HEAD);
        if (c59952zshCopydefault.size() > 0) {
            c59952zshCopydefault.get(0).AEQbTJ(AEQbTJ);
        }
        return documentEZpvd.toString();
    }

    @android.webkit.JavascriptInterface
    public void customAjax(java.lang.String str, java.lang.String str2) {
        this.EZpvd.copydefault(str, str2);
    }

    @android.webkit.JavascriptInterface
    public void customAjaxFileName(java.lang.String str, java.lang.String str2) {
        this.EZpvd.EZpvd(str, str2);
    }

    @android.webkit.JavascriptInterface
    public boolean shouldIntercept(java.lang.String str) {
        return C43341rnU.EZpvd(str) || C57354ygo.AEQbTJ(str);
    }
}
