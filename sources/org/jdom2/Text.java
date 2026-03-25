package org.jdom2;

import o.C59868zpE;
import org.jdom2.Content;
import org.jdom2.output.Format;

/* JADX INFO: loaded from: classes24.dex */
public class Text extends Content {
    static final String EMPTY_STRING = "";
    private static final long serialVersionUID = 200;
    protected String value;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getText() {
        return this.value;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // org.jdom2.Content
    public String getValue() {
        return this.value;
    }

    public Text(Content.CType cType) {
        super(cType);
    }

    public Text() {
        this(Content.CType.Text);
    }

    public Text(String str) {
        this(Content.CType.Text);
        setText(str);
    }

    public String getTextTrim() {
        return Format.EZpvd(getText());
    }

    public String getTextNormalize() {
        return normalizeString(getText());
    }

    public static String normalizeString(String str) {
        return str == null ? "" : Format.copydefault(str);
    }

    public Text setText(String str) {
        if (str == null) {
            this.value = "";
            return this;
        }
        String strEZpvd = C59868zpE.EZpvd(str);
        if (strEZpvd != null) {
            throw new IllegalDataException(str, "character content", strEZpvd);
        }
        this.value = str;
        return this;
    }

    public void append(String str) {
        if (str == null) {
            return;
        }
        String strEZpvd = C59868zpE.EZpvd(str);
        if (strEZpvd != null) {
            throw new IllegalDataException(str, "character content", strEZpvd);
        }
        if (str.length() > 0) {
            this.value += str;
        }
    }

    public void append(Text text) {
        if (text == null) {
            return;
        }
        this.value += text.getText();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(64);
        sb.append("[Text: ");
        sb.append(getText());
        sb.append("]");
        return sb.toString();
    }

    /* JADX DEBUG: Method merged with bridge method: clone()Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: clone()Lo/zpy; */
    /* JADX DEBUG: Method merged with bridge method: clone()Lorg/jdom2/Content; */
    @Override // org.jdom2.Content, o.C59905zpy
    public Text clone() {
        Text text = (Text) super.clone();
        text.value = this.value;
        return text;
    }

    /* JADX DEBUG: Method merged with bridge method: detach()Lorg/jdom2/Content; */
    @Override // org.jdom2.Content
    public Text detach() {
        return (Text) super.detach();
    }

    /* JADX DEBUG: Method merged with bridge method: setParent(Lorg/jdom2/Parent;)Lorg/jdom2/Content; */
    @Override // org.jdom2.Content
    public Text setParent(Parent parent) {
        return (Text) super.setParent(parent);
    }

    /* JADX DEBUG: Method merged with bridge method: getParent()Lorg/jdom2/Parent; */
    @Override // org.jdom2.Content
    public Element getParent() {
        return (Element) super.getParent();
    }
}
