package o;

import com.amplifyframework.core.model.ModelIdentifier;
import org.jsoup.nodes.Document;

/* JADX INFO: renamed from: o.zsa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public class C59945zsa extends AbstractC59916zrY {
    @Override // o.AbstractC59916zrY
    public void KWHzl(java.lang.StringBuilder sb, int i, Document.Activity activity) {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC59916zrY
    public java.lang.String copydefault() {
        return "#doctype";
    }

    public C59945zsa(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        super(str4);
        C59912zrU.copydefault(str);
        EZpvd("name", str);
        EZpvd("publicId", str2);
        EZpvd("systemId", str3);
    }

    @Override // o.AbstractC59916zrY
    public void OLrzqt(java.lang.StringBuilder sb, int i, Document.Activity activity) {
        sb.append("<!DOCTYPE ");
        sb.append(EZpvd("name"));
        if (!C59910zrS.AEQbTJ(EZpvd("publicId"))) {
            sb.append(" PUBLIC \"");
            sb.append(EZpvd("publicId"));
            sb.append(ModelIdentifier.Helper.PRIMARY_KEY_ENCAPSULATE_CHAR);
        }
        if (!C59910zrS.AEQbTJ(EZpvd("systemId"))) {
            sb.append(" \"");
            sb.append(EZpvd("systemId"));
            sb.append(ModelIdentifier.Helper.PRIMARY_KEY_ENCAPSULATE_CHAR);
        }
        sb.append('>');
    }
}
