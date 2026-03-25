package org.jdom2;

import com.huawei.hms.framework.common.ContainerUtils;
import o.C59868zpE;
import org.jdom2.Content;

/* JADX INFO: loaded from: classes24.dex */
public class EntityRef extends Content {
    private static final long serialVersionUID = 200;
    protected String name;
    protected String publicID;
    protected String systemID;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getName() {
        return this.name;
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

    public EntityRef() {
        super(Content.CType.EntityRef);
    }

    public EntityRef(String str) {
        this(str, null, null);
    }

    public EntityRef(String str, String str2) {
        this(str, null, str2);
    }

    public EntityRef(String str, String str2, String str3) {
        super(Content.CType.EntityRef);
        setName(str);
        setPublicID(str2);
        setSystemID(str3);
    }

    public EntityRef setName(String str) {
        String strFetchVPNInfo = C59868zpE.fetchVPNInfo(str);
        if (strFetchVPNInfo != null) {
            throw new IllegalNameException(str, "EntityRef", strFetchVPNInfo);
        }
        this.name = str;
        return this;
    }

    public EntityRef setPublicID(String str) {
        String strValues = C59868zpE.values(str);
        if (strValues != null) {
            throw new IllegalDataException(str, "EntityRef", strValues);
        }
        this.publicID = str;
        return this;
    }

    public EntityRef setSystemID(String str) {
        String strAkhnZx = C59868zpE.AkhnZx(str);
        if (strAkhnZx != null) {
            throw new IllegalDataException(str, "EntityRef", strAkhnZx);
        }
        this.systemID = str;
        return this;
    }

    public String toString() {
        return "[EntityRef: " + ContainerUtils.FIELD_DELIMITER + this.name + ";]";
    }

    /* JADX DEBUG: Method merged with bridge method: detach()Lorg/jdom2/Content; */
    @Override // org.jdom2.Content
    public EntityRef detach() {
        return (EntityRef) super.detach();
    }

    /* JADX DEBUG: Method merged with bridge method: setParent(Lorg/jdom2/Parent;)Lorg/jdom2/Content; */
    @Override // org.jdom2.Content
    public EntityRef setParent(Parent parent) {
        return (EntityRef) super.setParent(parent);
    }

    /* JADX DEBUG: Method merged with bridge method: getParent()Lorg/jdom2/Parent; */
    @Override // org.jdom2.Content
    public Element getParent() {
        return (Element) super.getParent();
    }

    /* JADX DEBUG: Method merged with bridge method: clone()Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: clone()Lo/zpy; */
    /* JADX DEBUG: Method merged with bridge method: clone()Lorg/jdom2/Content; */
    @Override // org.jdom2.Content, o.C59905zpy
    public EntityRef clone() {
        return (EntityRef) super.clone();
    }
}
