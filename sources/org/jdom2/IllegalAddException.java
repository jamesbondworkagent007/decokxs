package org.jdom2;

import com.amplifyframework.core.model.ModelIdentifier;
import com.huawei.hms.framework.common.ContainerUtils;

/* JADX INFO: loaded from: classes24.dex */
public class IllegalAddException extends IllegalArgumentException {
    private static final long serialVersionUID = 200;

    public IllegalAddException(Element element, Attribute attribute, String str) {
        super("The attribute \"" + attribute.getQualifiedName() + "\" could not be added to the element \"" + element.getQualifiedName() + "\": " + str);
    }

    public IllegalAddException(Element element, Element element2, String str) {
        super("The element \"" + element2.getQualifiedName() + "\" could not be added as a child of \"" + element.getQualifiedName() + "\": " + str);
    }

    public IllegalAddException(Element element, String str) {
        super("The element \"" + element.getQualifiedName() + "\" could not be added as the root of the document: " + str);
    }

    public IllegalAddException(Element element, ProcessingInstruction processingInstruction, String str) {
        super("The PI \"" + processingInstruction.getTarget() + "\" could not be added as content to \"" + element.getQualifiedName() + "\": " + str);
    }

    public IllegalAddException(ProcessingInstruction processingInstruction, String str) {
        super("The PI \"" + processingInstruction.getTarget() + "\" could not be added to the top level of the document: " + str);
    }

    public IllegalAddException(Element element, Comment comment, String str) {
        super("The comment \"" + comment.getText() + "\" could not be added as content to \"" + element.getQualifiedName() + "\": " + str);
    }

    public IllegalAddException(Element element, CDATA cdata, String str) {
        super("The CDATA \"" + cdata.getText() + "\" could not be added as content to \"" + element.getQualifiedName() + "\": " + str);
    }

    public IllegalAddException(Element element, Text text, String str) {
        super("The Text \"" + text.getText() + "\" could not be added as content to \"" + element.getQualifiedName() + "\": " + str);
    }

    public IllegalAddException(Comment comment, String str) {
        super("The comment \"" + comment.getText() + "\" could not be added to the top level of the document: " + str);
    }

    public IllegalAddException(Element element, EntityRef entityRef, String str) {
        super("The entity reference\"" + entityRef.getName() + "\" could not be added as content to \"" + element.getQualifiedName() + "\": " + str);
    }

    public IllegalAddException(Element element, Namespace namespace, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("The namespace xmlns");
        boolean zEquals = namespace.getPrefix().equals("");
        String str2 = ContainerUtils.KEY_VALUE_DELIMITER;
        if (!zEquals) {
            str2 = ":" + namespace.getPrefix() + ContainerUtils.KEY_VALUE_DELIMITER;
        }
        sb.append(str2);
        sb.append(ModelIdentifier.Helper.PRIMARY_KEY_ENCAPSULATE_CHAR);
        sb.append(namespace.getURI());
        sb.append("\" could not be added as a namespace to \"");
        sb.append(element.getQualifiedName());
        sb.append("\": ");
        sb.append(str);
        super(sb.toString());
    }

    public IllegalAddException(DocType docType, String str) {
        super("The DOCTYPE " + docType.toString() + " could not be added to the document: " + str);
    }

    public IllegalAddException(String str) {
        super(str);
    }
}
