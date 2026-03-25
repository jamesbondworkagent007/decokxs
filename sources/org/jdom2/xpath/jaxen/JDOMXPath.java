package org.jdom2.xpath.jaxen;

import com.amplifyframework.core.model.ModelIdentifier;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o.C59878zpO;
import o.C59879zpP;
import org.jaxen.BaseXPath;
import org.jaxen.JaxenException;
import org.jaxen.SimpleVariableContext;
import org.jdom2.JDOMException;
import org.jdom2.Namespace;
import org.jdom2.xpath.XPath;

/* JADX INFO: loaded from: classes24.dex */
@Deprecated
public class JDOMXPath extends XPath {
    private static final long serialVersionUID = 200;
    private final C59878zpO navigator = new C59878zpO();
    private transient org.jaxen.XPath xPath;

    private static final Object unWrapNS(Object obj) {
        return obj instanceof C59879zpP ? ((C59879zpP) obj).AEQbTJ() : obj;
    }

    private static final List<Object> unWrap(List<?> list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<?> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(unWrapNS(it.next()));
        }
        return arrayList;
    }

    public JDOMXPath(String str) throws JDOMException {
        setXPath(str);
    }

    @Override // org.jdom2.xpath.XPath
    public List<?> selectNodes(Object obj) throws JDOMException {
        try {
            try {
                this.navigator.KWHzl(obj);
                return unWrap(this.xPath.selectNodes(obj));
            } catch (JaxenException e) {
                throw new JDOMException("XPath error while evaluating \"" + this.xPath.toString() + "\": " + e.getMessage(), e);
            }
        } finally {
            this.navigator.EZpvd();
        }
    }

    @Override // org.jdom2.xpath.XPath
    public Object selectSingleNode(Object obj) throws JDOMException {
        try {
            try {
                this.navigator.KWHzl(obj);
                return unWrapNS(this.xPath.selectSingleNode(obj));
            } catch (JaxenException e) {
                throw new JDOMException("XPath error while evaluating \"" + this.xPath.toString() + "\": " + e.getMessage(), e);
            }
        } finally {
            this.navigator.EZpvd();
        }
    }

    @Override // org.jdom2.xpath.XPath
    public String valueOf(Object obj) throws JDOMException {
        try {
            try {
                this.navigator.KWHzl(obj);
                return this.xPath.stringValueOf(obj);
            } catch (JaxenException e) {
                throw new JDOMException("XPath error while evaluating \"" + this.xPath.toString() + "\": " + e.getMessage(), e);
            }
        } finally {
            this.navigator.EZpvd();
        }
    }

    @Override // org.jdom2.xpath.XPath
    public Number numberValueOf(Object obj) throws JDOMException {
        try {
            try {
                this.navigator.KWHzl(obj);
                return this.xPath.numberValueOf(obj);
            } catch (JaxenException e) {
                throw new JDOMException("XPath error while evaluating \"" + this.xPath.toString() + "\": " + e.getMessage(), e);
            }
        } finally {
            this.navigator.EZpvd();
        }
    }

    @Override // org.jdom2.xpath.XPath
    public void setVariable(String str, Object obj) throws IllegalArgumentException {
        SimpleVariableContext variableContext = this.xPath.getVariableContext();
        if (variableContext instanceof SimpleVariableContext) {
            variableContext.setVariableValue((String) null, str, obj);
        }
    }

    @Override // org.jdom2.xpath.XPath
    public void addNamespace(Namespace namespace) {
        this.navigator.OLrzqt(namespace);
    }

    @Override // org.jdom2.xpath.XPath
    public String getXPath() {
        return this.xPath.toString();
    }

    private void setXPath(String str) throws JDOMException {
        try {
            BaseXPath baseXPath = new BaseXPath(str, this.navigator);
            this.xPath = baseXPath;
            baseXPath.setNamespaceContext(this.navigator);
        } catch (Exception e) {
            throw new JDOMException("Invalid XPath expression: \"" + str + ModelIdentifier.Helper.PRIMARY_KEY_ENCAPSULATE_CHAR, e);
        }
    }

    public String toString() {
        return String.format("[XPath: %s]", this.xPath.toString());
    }
}
