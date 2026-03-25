package org.jdom2;

import o.C59868zpE;
import org.jdom2.Content;

/* JADX INFO: loaded from: classes24.dex */
public class CDATA extends Text {
    private static final long serialVersionUID = 200;

    public CDATA() {
        super(Content.CType.CDATA);
    }

    public CDATA(String str) {
        super(Content.CType.CDATA);
        setText(str);
    }

    /* JADX DEBUG: Method merged with bridge method: setText(Ljava/lang/String;)Lorg/jdom2/Text; */
    @Override // org.jdom2.Text
    public CDATA setText(String str) {
        if (str == null || "".equals(str)) {
            this.value = "";
            return this;
        }
        String strKWHzl = C59868zpE.KWHzl(str);
        if (strKWHzl != null) {
            throw new IllegalDataException(str, "CDATA section", strKWHzl);
        }
        this.value = str;
        return this;
    }

    @Override // org.jdom2.Text
    public void append(String str) {
        String str2;
        if (str == null || "".equals(str)) {
            return;
        }
        if (this.value == "") {
            str2 = str;
        } else {
            str2 = this.value + str;
        }
        String strKWHzl = C59868zpE.KWHzl(str2);
        if (strKWHzl != null) {
            throw new IllegalDataException(str, "CDATA section", strKWHzl);
        }
        this.value = str2;
    }

    @Override // org.jdom2.Text
    public void append(Text text) {
        if (text == null) {
            return;
        }
        append(text.getText());
    }

    @Override // org.jdom2.Text
    public String toString() {
        StringBuilder sb = new StringBuilder(64);
        sb.append("[CDATA: ");
        sb.append(getText());
        sb.append("]");
        return sb.toString();
    }

    /* JADX DEBUG: Method merged with bridge method: clone()Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: clone()Lo/zpy; */
    /* JADX DEBUG: Method merged with bridge method: clone()Lorg/jdom2/Content; */
    /* JADX DEBUG: Method merged with bridge method: clone()Lorg/jdom2/Text; */
    @Override // org.jdom2.Text, org.jdom2.Content, o.C59905zpy
    public CDATA clone() {
        return (CDATA) super.clone();
    }

    /* JADX DEBUG: Method merged with bridge method: detach()Lorg/jdom2/Content; */
    /* JADX DEBUG: Method merged with bridge method: detach()Lorg/jdom2/Text; */
    @Override // org.jdom2.Text, org.jdom2.Content
    public CDATA detach() {
        return (CDATA) super.detach();
    }

    /* JADX DEBUG: Method merged with bridge method: setParent(Lorg/jdom2/Parent;)Lorg/jdom2/Content; */
    /* JADX DEBUG: Method merged with bridge method: setParent(Lorg/jdom2/Parent;)Lorg/jdom2/Text; */
    @Override // org.jdom2.Text, org.jdom2.Content
    public CDATA setParent(Parent parent) {
        return (CDATA) super.setParent(parent);
    }
}
