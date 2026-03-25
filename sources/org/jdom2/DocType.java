package org.jdom2;

import o.C59868zpE;
import o.C59874zpK;
import org.jdom2.Content;

/* JADX INFO: loaded from: classes24.dex */
public class DocType extends Content {
    private static final long serialVersionUID = 200;
    protected String elementName;
    protected String internalSubset;
    protected String publicID;
    protected String systemID;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getElementName() {
        return this.elementName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getInternalSubset() {
        return this.internalSubset;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getPublicID() {
        return this.publicID;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getSystemID() {
        return this.systemID;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // org.jdom2.Content
    public String getValue() {
        return "";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setInternalSubset(String str) {
        this.internalSubset = str;
    }

    public DocType() {
        super(Content.CType.DocType);
    }

    public DocType(String str, String str2, String str3) {
        super(Content.CType.DocType);
        setElementName(str);
        setPublicID(str2);
        setSystemID(str3);
    }

    public DocType(String str, String str2) {
        this(str, null, str2);
    }

    public DocType(String str) {
        this(str, null, null);
    }

    public DocType setElementName(String str) {
        String strFetchVPNInfo = C59868zpE.fetchVPNInfo(str);
        if (strFetchVPNInfo != null) {
            throw new IllegalNameException(str, "DocType", strFetchVPNInfo);
        }
        this.elementName = str;
        return this;
    }

    public DocType setPublicID(String str) {
        String strValues = C59868zpE.values(str);
        if (strValues != null) {
            throw new IllegalDataException(str, "DocType", strValues);
        }
        this.publicID = str;
        return this;
    }

    public DocType setSystemID(String str) {
        String strAkhnZx = C59868zpE.AkhnZx(str);
        if (strAkhnZx != null) {
            throw new IllegalDataException(str, "DocType", strAkhnZx);
        }
        this.systemID = str;
        return this;
    }

    public String toString() {
        return "[DocType: " + new C59874zpK().EZpvd(this) + "]";
    }

    /* JADX DEBUG: Method merged with bridge method: clone()Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: clone()Lo/zpy; */
    /* JADX DEBUG: Method merged with bridge method: clone()Lorg/jdom2/Content; */
    @Override // org.jdom2.Content, o.C59905zpy
    public DocType clone() {
        return (DocType) super.clone();
    }

    /* JADX DEBUG: Method merged with bridge method: detach()Lorg/jdom2/Content; */
    @Override // org.jdom2.Content
    public DocType detach() {
        return (DocType) super.detach();
    }

    /* JADX DEBUG: Method merged with bridge method: setParent(Lorg/jdom2/Parent;)Lorg/jdom2/Content; */
    @Override // org.jdom2.Content
    public DocType setParent(Parent parent) {
        return (DocType) super.setParent(parent);
    }

    /* JADX DEBUG: Method merged with bridge method: getParent()Lorg/jdom2/Parent; */
    @Override // org.jdom2.Content
    public Document getParent() {
        return (Document) super.getParent();
    }
}
