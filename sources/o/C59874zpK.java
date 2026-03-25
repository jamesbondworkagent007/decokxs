package o;

import org.jdom2.Comment;
import org.jdom2.DocType;
import org.jdom2.ProcessingInstruction;
import org.jdom2.output.Format;

/* JADX INFO: renamed from: o.zpK, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C59874zpK implements java.lang.Cloneable {
    public static final Activity OLrzqt = new Activity();
    public InterfaceC59877zpN AEQbTJ;
    public Format EZpvd;

    /* JADX INFO: renamed from: o.zpK$Activity */
    public static final class Activity extends AbstractC59873zpJ {
        private Activity() {
        }
    }

    public C59874zpK(Format format, InterfaceC59877zpN interfaceC59877zpN) {
        this.EZpvd = null;
        this.AEQbTJ = null;
        this.EZpvd = format == null ? Format.AEQbTJ() : format.clone();
        this.AEQbTJ = interfaceC59877zpN == null ? OLrzqt : interfaceC59877zpN;
    }

    public C59874zpK() {
        this(null, null);
    }

    public final java.lang.String EZpvd(DocType docType) {
        java.io.StringWriter stringWriter = new java.io.StringWriter();
        try {
            copydefault(docType, stringWriter);
        } catch (java.io.IOException unused) {
        }
        return stringWriter.toString();
    }

    public final java.lang.String KWHzl(Comment comment) {
        java.io.StringWriter stringWriter = new java.io.StringWriter();
        try {
            OLrzqt(comment, stringWriter);
        } catch (java.io.IOException unused) {
        }
        return stringWriter.toString();
    }

    public final java.lang.String EZpvd(ProcessingInstruction processingInstruction) {
        java.io.StringWriter stringWriter = new java.io.StringWriter();
        try {
            OLrzqt(processingInstruction, stringWriter);
        } catch (java.io.IOException unused) {
        }
        return stringWriter.toString();
    }

    public final void copydefault(DocType docType, java.io.Writer writer) throws java.io.IOException {
        this.AEQbTJ.EZpvd(writer, this.EZpvd, docType);
        writer.flush();
    }

    public final void OLrzqt(Comment comment, java.io.Writer writer) throws java.io.IOException {
        this.AEQbTJ.EZpvd(writer, this.EZpvd, comment);
        writer.flush();
    }

    public final void OLrzqt(ProcessingInstruction processingInstruction, java.io.Writer writer) throws java.io.IOException {
        this.AEQbTJ.AEQbTJ(writer, this.EZpvd, processingInstruction);
        writer.flush();
    }

    /* JADX DEBUG: Method merged with bridge method: clone()Ljava/lang/Object; */
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public C59874zpK clone() {
        try {
            return (C59874zpK) super.clone();
        } catch (java.lang.CloneNotSupportedException e) {
            throw new java.lang.RuntimeException(e.toString());
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("XMLOutputter[omitDeclaration = ");
        sb.append(this.EZpvd.DbNXlk);
        sb.append(", ");
        sb.append("encoding = ");
        sb.append(this.EZpvd.AYXKKw);
        sb.append(", ");
        sb.append("omitEncoding = ");
        sb.append(this.EZpvd.fetchVPNInfo);
        sb.append(", ");
        sb.append("indent = '");
        sb.append(this.EZpvd.valueOf);
        sb.append("'");
        sb.append(", ");
        sb.append("expandEmptyElements = ");
        sb.append(this.EZpvd.AhwBna);
        sb.append(", ");
        sb.append("lineSeparator = '");
        for (char c : this.EZpvd.AkhnZx.toCharArray()) {
            if (c == '\t') {
                sb.append("\\t");
            } else if (c == '\n') {
                sb.append("\\n");
            } else if (c == '\r') {
                sb.append("\\r");
            } else {
                sb.append("[" + ((int) c) + "]");
            }
        }
        sb.append("', ");
        sb.append("textMode = ");
        sb.append(this.EZpvd.values + "]");
        return sb.toString();
    }
}
