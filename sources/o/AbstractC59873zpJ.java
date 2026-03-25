package o;

import com.amplifyframework.core.model.ModelIdentifier;
import org.jdom2.Comment;
import org.jdom2.DocType;
import org.jdom2.ProcessingInstruction;
import org.jdom2.output.Format;

/* JADX INFO: renamed from: o.zpJ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public abstract class AbstractC59873zpJ extends AbstractC59871zpH implements InterfaceC59877zpN {
    @Override // o.InterfaceC59877zpN
    public void EZpvd(java.io.Writer writer, Format format, DocType docType) throws java.io.IOException {
        copydefault(writer, new C59872zpI(format), docType);
        writer.flush();
    }

    @Override // o.InterfaceC59877zpN
    public void EZpvd(java.io.Writer writer, Format format, Comment comment) throws java.io.IOException {
        EZpvd(writer, new C59872zpI(format), comment);
        writer.flush();
    }

    @Override // o.InterfaceC59877zpN
    public void AEQbTJ(java.io.Writer writer, Format format, ProcessingInstruction processingInstruction) throws java.io.IOException {
        C59872zpI c59872zpI = new C59872zpI(format);
        c59872zpI.copydefault(true);
        KWHzl(writer, c59872zpI, processingInstruction);
        writer.flush();
    }

    public void copydefault(java.io.Writer writer, java.lang.String str) throws java.io.IOException {
        if (str == null) {
            return;
        }
        writer.write(str);
    }

    public void copydefault(java.io.Writer writer, C59872zpI c59872zpI, DocType docType) throws java.io.IOException {
        boolean z;
        java.lang.String publicID = docType.getPublicID();
        java.lang.String systemID = docType.getSystemID();
        java.lang.String internalSubset = docType.getInternalSubset();
        copydefault(writer, "<!DOCTYPE ");
        copydefault(writer, docType.getElementName());
        if (publicID != null) {
            copydefault(writer, " PUBLIC \"");
            copydefault(writer, publicID);
            copydefault(writer, ModelIdentifier.Helper.PRIMARY_KEY_ENCAPSULATE_CHAR);
            z = true;
        } else {
            z = false;
        }
        if (systemID != null) {
            if (!z) {
                copydefault(writer, " SYSTEM");
            }
            copydefault(writer, " \"");
            copydefault(writer, systemID);
            copydefault(writer, ModelIdentifier.Helper.PRIMARY_KEY_ENCAPSULATE_CHAR);
        }
        if (internalSubset != null && !internalSubset.equals("")) {
            copydefault(writer, " [");
            copydefault(writer, c59872zpI.KWHzl());
            copydefault(writer, docType.getInternalSubset());
            copydefault(writer, "]");
        }
        copydefault(writer, ">");
    }

    public void KWHzl(java.io.Writer writer, C59872zpI c59872zpI, ProcessingInstruction processingInstruction) throws java.io.IOException {
        java.lang.String target = processingInstruction.getTarget();
        if (!c59872zpI.copydefault()) {
            if (target.equals("javax.xml.transform.disable-output-escaping")) {
                c59872zpI.KWHzl(false);
                return;
            } else if (target.equals("javax.xml.transform.enable-output-escaping")) {
                c59872zpI.KWHzl(true);
                return;
            }
        }
        java.lang.String data = processingInstruction.getData();
        if (!"".equals(data)) {
            copydefault(writer, "<?");
            copydefault(writer, target);
            copydefault(writer, " ");
            copydefault(writer, data);
            copydefault(writer, "?>");
            return;
        }
        copydefault(writer, "<?");
        copydefault(writer, target);
        copydefault(writer, "?>");
    }

    public void EZpvd(java.io.Writer writer, C59872zpI c59872zpI, Comment comment) throws java.io.IOException {
        copydefault(writer, "<!--");
        copydefault(writer, comment.getText());
        copydefault(writer, "-->");
    }
}
