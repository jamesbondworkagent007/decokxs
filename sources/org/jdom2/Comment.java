package org.jdom2;

import o.C59868zpE;
import o.C59874zpK;
import org.jdom2.Content;

/* JADX INFO: loaded from: classes24.dex */
public class Comment extends Content {
    private static final long serialVersionUID = 200;
    protected String text;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getText() {
        return this.text;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // org.jdom2.Content
    public String getValue() {
        return this.text;
    }

    public Comment() {
        super(Content.CType.Comment);
    }

    public Comment(String str) {
        super(Content.CType.Comment);
        setText(str);
    }

    public Comment setText(String str) {
        String strOLrzqt = C59868zpE.OLrzqt(str);
        if (strOLrzqt != null) {
            throw new IllegalDataException(str, "comment", strOLrzqt);
        }
        this.text = str;
        return this;
    }

    /* JADX DEBUG: Method merged with bridge method: clone()Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: clone()Lo/zpy; */
    /* JADX DEBUG: Method merged with bridge method: clone()Lorg/jdom2/Content; */
    @Override // org.jdom2.Content, o.C59905zpy
    public Comment clone() {
        return (Comment) super.clone();
    }

    /* JADX DEBUG: Method merged with bridge method: detach()Lorg/jdom2/Content; */
    @Override // org.jdom2.Content
    public Comment detach() {
        return (Comment) super.detach();
    }

    /* JADX DEBUG: Method merged with bridge method: setParent(Lorg/jdom2/Parent;)Lorg/jdom2/Content; */
    @Override // org.jdom2.Content
    public Comment setParent(Parent parent) {
        return (Comment) super.setParent(parent);
    }

    public String toString() {
        return "[Comment: " + new C59874zpK().KWHzl(this) + "]";
    }
}
