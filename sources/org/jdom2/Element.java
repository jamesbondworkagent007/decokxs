package org.jdom2;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.TreeMap;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.C59864zpA;
import o.C59868zpE;
import o.C59870zpG;
import o.C59904zpx;
import o.C59906zpz;
import o.InterfaceC59880zpQ;
import org.jdom2.Content;
import org.jdom2.filter.ElementFilter;
import org.jdom2.filter.Filter;

/* JADX INFO: loaded from: classes24.dex */
public class Element extends Content implements Parent {
    private static final int INITIAL_ARRAY_SIZE = 5;
    private static final long serialVersionUID = 200;
    transient List<Namespace> additionalNamespaces;
    transient C59864zpA attributes;
    transient C59906zpz content;
    protected String name;
    protected Namespace namespace;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // org.jdom2.Parent
    public List<Content> getContent() {
        return this.content;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getName() {
        return this.name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public Namespace getNamespace() {
        return this.namespace;
    }

    @Override // org.jdom2.Parent
    public /* bridge */ /* synthetic */ Parent addContent(int i, Collection collection) {
        return addContent(i, (Collection<? extends Content>) collection);
    }

    @Override // org.jdom2.Parent
    public /* bridge */ /* synthetic */ Parent addContent(Collection collection) {
        return addContent((Collection<? extends Content>) collection);
    }

    public Element() {
        super(Content.CType.Element);
        this.additionalNamespaces = null;
        this.attributes = null;
        this.content = new C59906zpz(this);
    }

    public Element(String str, Namespace namespace) {
        super(Content.CType.Element);
        this.additionalNamespaces = null;
        this.attributes = null;
        this.content = new C59906zpz(this);
        setName(str);
        setNamespace(namespace);
    }

    public Element(String str) {
        this(str, (Namespace) null);
    }

    public Element(String str, String str2) {
        this(str, Namespace.getNamespace("", str2));
    }

    public Element(String str, String str2, String str3) {
        this(str, Namespace.getNamespace(str2, str3));
    }

    public Element setName(String str) {
        String strCopydefault = C59868zpE.copydefault(str);
        if (strCopydefault != null) {
            throw new IllegalNameException(str, "element", strCopydefault);
        }
        this.name = str;
        return this;
    }

    public Element setNamespace(Namespace namespace) {
        String strOLrzqt;
        if (namespace == null) {
            namespace = Namespace.NO_NAMESPACE;
        }
        if (this.additionalNamespaces != null && (strOLrzqt = C59868zpE.OLrzqt(namespace, getAdditionalNamespaces())) != null) {
            throw new IllegalAddException(this, namespace, strOLrzqt);
        }
        if (hasAttributes()) {
            Iterator<Attribute> it = getAttributes().iterator();
            while (it.hasNext()) {
                String strAEQbTJ = C59868zpE.AEQbTJ(namespace, it.next());
                if (strAEQbTJ != null) {
                    throw new IllegalAddException(this, namespace, strAEQbTJ);
                }
            }
        }
        this.namespace = namespace;
        return this;
    }

    public String getNamespacePrefix() {
        return this.namespace.getPrefix();
    }

    public String getNamespaceURI() {
        return this.namespace.getURI();
    }

    public Namespace getNamespace(String str) {
        if (str == null) {
            return null;
        }
        if ("xml".equals(str)) {
            return Namespace.XML_NAMESPACE;
        }
        if (str.equals(getNamespacePrefix())) {
            return getNamespace();
        }
        if (this.additionalNamespaces != null) {
            for (int i = 0; i < this.additionalNamespaces.size(); i++) {
                Namespace namespace = this.additionalNamespaces.get(i);
                if (str.equals(namespace.getPrefix())) {
                    return namespace;
                }
            }
        }
        C59864zpA c59864zpA = this.attributes;
        if (c59864zpA != null) {
            for (Attribute attribute : c59864zpA) {
                if (str.equals(attribute.getNamespacePrefix())) {
                    return attribute.getNamespace();
                }
            }
        }
        Parent parent = this.parent;
        if (parent instanceof Element) {
            return ((Element) parent).getNamespace(str);
        }
        return null;
    }

    public String getQualifiedName() {
        if ("".equals(this.namespace.getPrefix())) {
            return getName();
        }
        return this.namespace.getPrefix() + AbstractJsonLexerKt.COLON + this.name;
    }

    public boolean addNamespaceDeclaration(Namespace namespace) {
        if (this.additionalNamespaces == null) {
            this.additionalNamespaces = new ArrayList(5);
        }
        Iterator<Namespace> it = this.additionalNamespaces.iterator();
        while (it.hasNext()) {
            if (it.next() == namespace) {
                return false;
            }
        }
        String strEZpvd = C59868zpE.EZpvd(namespace, this);
        if (strEZpvd != null) {
            throw new IllegalAddException(this, namespace, strEZpvd);
        }
        return this.additionalNamespaces.add(namespace);
    }

    public void removeNamespaceDeclaration(Namespace namespace) {
        List<Namespace> list = this.additionalNamespaces;
        if (list == null) {
            return;
        }
        list.remove(namespace);
    }

    public List<Namespace> getAdditionalNamespaces() {
        List<Namespace> list = this.additionalNamespaces;
        if (list == null) {
            return Collections.emptyList();
        }
        return Collections.unmodifiableList(list);
    }

    @Override // org.jdom2.Content
    public String getValue() {
        StringBuilder sb = new StringBuilder();
        for (Content content : getContent()) {
            if ((content instanceof Element) || (content instanceof Text)) {
                sb.append(content.getValue());
            }
        }
        return sb.toString();
    }

    public boolean isRootElement() {
        return this.parent instanceof Document;
    }

    @Override // org.jdom2.Parent
    public int getContentSize() {
        return this.content.size();
    }

    @Override // org.jdom2.Parent
    public int indexOf(Content content) {
        return this.content.indexOf(content);
    }

    public String getText() {
        if (this.content.size() == 0) {
            return "";
        }
        if (this.content.size() == 1) {
            Content contentAEQbTJ = this.content.get(0);
            return contentAEQbTJ instanceof Text ? ((Text) contentAEQbTJ).getText() : "";
        }
        StringBuilder sb = new StringBuilder();
        boolean z = false;
        for (int i = 0; i < this.content.size(); i++) {
            Content contentAEQbTJ2 = this.content.get(i);
            if (contentAEQbTJ2 instanceof Text) {
                sb.append(((Text) contentAEQbTJ2).getText());
                z = true;
            }
        }
        return !z ? "" : sb.toString();
    }

    public String getTextTrim() {
        return getText().trim();
    }

    public String getTextNormalize() {
        return Text.normalizeString(getText());
    }

    public String getChildText(String str) {
        Element child = getChild(str);
        if (child == null) {
            return null;
        }
        return child.getText();
    }

    public String getChildTextTrim(String str) {
        Element child = getChild(str);
        if (child == null) {
            return null;
        }
        return child.getTextTrim();
    }

    public String getChildTextNormalize(String str) {
        Element child = getChild(str);
        if (child == null) {
            return null;
        }
        return child.getTextNormalize();
    }

    public String getChildText(String str, Namespace namespace) {
        Element child = getChild(str, namespace);
        if (child == null) {
            return null;
        }
        return child.getText();
    }

    public String getChildTextTrim(String str, Namespace namespace) {
        Element child = getChild(str, namespace);
        if (child == null) {
            return null;
        }
        return child.getTextTrim();
    }

    public String getChildTextNormalize(String str, Namespace namespace) {
        Element child = getChild(str, namespace);
        if (child == null) {
            return null;
        }
        return child.getTextNormalize();
    }

    public Element setText(String str) {
        this.content.clear();
        if (str != null) {
            addContent((Content) new Text(str));
        }
        return this;
    }

    public boolean coalesceText(boolean z) {
        Iterator<Content> descendants = z ? getDescendants() : this.content.iterator();
        boolean z2 = false;
        while (true) {
            Text text = null;
            while (descendants.hasNext()) {
                Content next = descendants.next();
                if (next.getCType() == Content.CType.Text) {
                    Text text2 = (Text) next;
                    if ("".equals(text2.getValue())) {
                        descendants.remove();
                    } else if (text == null || text.getParent() != text2.getParent()) {
                        text = text2;
                    } else {
                        text.append(text2.getValue());
                        descendants.remove();
                    }
                    z2 = true;
                }
            }
            return z2;
        }
    }

    @Override // org.jdom2.Parent
    public <E extends Content> List<E> getContent(Filter<E> filter) {
        return this.content.KWHzl(filter);
    }

    @Override // org.jdom2.Parent
    public List<Content> removeContent() {
        ArrayList arrayList = new ArrayList(this.content);
        this.content.clear();
        return arrayList;
    }

    @Override // org.jdom2.Parent
    public <F extends Content> List<F> removeContent(Filter<F> filter) {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.content.KWHzl(filter).iterator();
        while (it.hasNext()) {
            arrayList.add((Content) it.next());
            it.remove();
        }
        return arrayList;
    }

    public Element setContent(Collection<? extends Content> collection) {
        this.content.EZpvd(collection);
        return this;
    }

    public Element setContent(int i, Content content) {
        this.content.set(i, content);
        return this;
    }

    public Parent setContent(int i, Collection<? extends Content> collection) {
        this.content.remove(i);
        this.content.addAll(i, collection);
        return this;
    }

    public Element addContent(String str) {
        return addContent((Content) new Text(str));
    }

    /* JADX DEBUG: Method merged with bridge method: addContent(Lorg/jdom2/Content;)Lorg/jdom2/Parent; */
    @Override // org.jdom2.Parent
    public Element addContent(Content content) {
        this.content.add(content);
        return this;
    }

    @Override // org.jdom2.Parent
    public Element addContent(Collection<? extends Content> collection) {
        this.content.addAll(collection);
        return this;
    }

    /* JADX DEBUG: Method merged with bridge method: addContent(ILorg/jdom2/Content;)Lorg/jdom2/Parent; */
    @Override // org.jdom2.Parent
    public Element addContent(int i, Content content) {
        this.content.add(i, content);
        return this;
    }

    @Override // org.jdom2.Parent
    public Element addContent(int i, Collection<? extends Content> collection) {
        this.content.addAll(i, collection);
        return this;
    }

    @Override // org.jdom2.Parent
    public List<Content> cloneContent() {
        int contentSize = getContentSize();
        ArrayList arrayList = new ArrayList(contentSize);
        for (int i = 0; i < contentSize; i++) {
            arrayList.add(getContent(i).clone());
        }
        return arrayList;
    }

    @Override // org.jdom2.Parent
    public Content getContent(int i) {
        return this.content.get(i);
    }

    @Override // org.jdom2.Parent
    public boolean removeContent(Content content) {
        return this.content.remove(content);
    }

    @Override // org.jdom2.Parent
    public Content removeContent(int i) {
        return this.content.remove(i);
    }

    public Element setContent(Content content) {
        this.content.clear();
        this.content.add(content);
        return this;
    }

    public boolean isAncestor(Element element) {
        for (Parent parent = element.getParent(); parent instanceof Element; parent = parent.getParent()) {
            if (parent == this) {
                return true;
            }
        }
        return false;
    }

    public boolean hasAttributes() {
        C59864zpA c59864zpA = this.attributes;
        return (c59864zpA == null || c59864zpA.isEmpty()) ? false : true;
    }

    public boolean hasAdditionalNamespaces() {
        List<Namespace> list = this.additionalNamespaces;
        return (list == null || list.isEmpty()) ? false : true;
    }

    public C59864zpA getAttributeList() {
        if (this.attributes == null) {
            this.attributes = new C59864zpA(this);
        }
        return this.attributes;
    }

    public List<Attribute> getAttributes() {
        return getAttributeList();
    }

    public Attribute getAttribute(String str) {
        return getAttribute(str, Namespace.NO_NAMESPACE);
    }

    public Attribute getAttribute(String str, Namespace namespace) {
        if (this.attributes == null) {
            return null;
        }
        return getAttributeList().AEQbTJ(str, namespace);
    }

    public String getAttributeValue(String str) {
        if (this.attributes == null) {
            return null;
        }
        return getAttributeValue(str, Namespace.NO_NAMESPACE);
    }

    public String getAttributeValue(String str, String str2) {
        return this.attributes == null ? str2 : getAttributeValue(str, Namespace.NO_NAMESPACE, str2);
    }

    public String getAttributeValue(String str, Namespace namespace) {
        if (this.attributes == null) {
            return null;
        }
        return getAttributeValue(str, namespace, null);
    }

    public String getAttributeValue(String str, Namespace namespace, String str2) {
        Attribute attributeAEQbTJ;
        return (this.attributes == null || (attributeAEQbTJ = getAttributeList().AEQbTJ(str, namespace)) == null) ? str2 : attributeAEQbTJ.getValue();
    }

    public Element setAttributes(Collection<? extends Attribute> collection) {
        getAttributeList().AEQbTJ(collection);
        return this;
    }

    public Element setAttribute(String str, String str2) {
        Attribute attribute = getAttribute(str);
        if (attribute == null) {
            setAttribute(new Attribute(str, str2));
        } else {
            attribute.setValue(str2);
        }
        return this;
    }

    public Element setAttribute(String str, String str2, Namespace namespace) {
        Attribute attribute = getAttribute(str, namespace);
        if (attribute == null) {
            setAttribute(new Attribute(str, str2, namespace));
        } else {
            attribute.setValue(str2);
        }
        return this;
    }

    public Element setAttribute(Attribute attribute) {
        getAttributeList().add(attribute);
        return this;
    }

    public boolean removeAttribute(String str) {
        return removeAttribute(str, Namespace.NO_NAMESPACE);
    }

    public boolean removeAttribute(String str, Namespace namespace) {
        if (this.attributes == null) {
            return false;
        }
        return getAttributeList().copydefault(str, namespace);
    }

    public boolean removeAttribute(Attribute attribute) {
        if (this.attributes == null) {
            return false;
        }
        return getAttributeList().remove(attribute);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(64);
        sb.append("[Element: <");
        sb.append(getQualifiedName());
        String namespaceURI = getNamespaceURI();
        if (!"".equals(namespaceURI)) {
            sb.append(" [Namespace: ");
            sb.append(namespaceURI);
            sb.append("]");
        }
        sb.append("/>]");
        return sb.toString();
    }

    /* JADX DEBUG: Method merged with bridge method: clone()Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: clone()Lo/zpy; */
    /* JADX DEBUG: Method merged with bridge method: clone()Lorg/jdom2/Content; */
    @Override // org.jdom2.Content, o.C59905zpy
    public Element clone() {
        Element element = (Element) super.clone();
        element.content = new C59906zpz(element);
        element.attributes = this.attributes == null ? null : new C59864zpA(element);
        if (this.attributes != null) {
            for (int i = 0; i < this.attributes.size(); i++) {
                element.attributes.add(this.attributes.get(i).clone());
            }
        }
        if (this.additionalNamespaces != null) {
            element.additionalNamespaces = new ArrayList(this.additionalNamespaces);
        }
        for (int i2 = 0; i2 < this.content.size(); i2++) {
            element.content.add(this.content.get(i2).clone());
        }
        return element;
    }

    @Override // org.jdom2.Parent
    public InterfaceC59880zpQ<Content> getDescendants() {
        return new C59904zpx(this);
    }

    @Override // org.jdom2.Parent
    public <F extends Content> InterfaceC59880zpQ<F> getDescendants(Filter<F> filter) {
        return new C59870zpG(new C59904zpx(this), filter);
    }

    public List<Element> getChildren() {
        return this.content.KWHzl(new ElementFilter());
    }

    public List<Element> getChildren(String str) {
        return getChildren(str, Namespace.NO_NAMESPACE);
    }

    public List<Element> getChildren(String str, Namespace namespace) {
        return this.content.KWHzl(new ElementFilter(str, namespace));
    }

    public Element getChild(String str, Namespace namespace) {
        Iterator it = this.content.KWHzl(new ElementFilter(str, namespace)).iterator();
        if (it.hasNext()) {
            return (Element) it.next();
        }
        return null;
    }

    public Element getChild(String str) {
        return getChild(str, Namespace.NO_NAMESPACE);
    }

    public boolean removeChild(String str) {
        return removeChild(str, Namespace.NO_NAMESPACE);
    }

    public boolean removeChild(String str, Namespace namespace) {
        Iterator it = this.content.KWHzl(new ElementFilter(str, namespace)).iterator();
        if (!it.hasNext()) {
            return false;
        }
        it.next();
        it.remove();
        return true;
    }

    public boolean removeChildren(String str) {
        return removeChildren(str, Namespace.NO_NAMESPACE);
    }

    public boolean removeChildren(String str, Namespace namespace) {
        Iterator it = this.content.KWHzl(new ElementFilter(str, namespace)).iterator();
        boolean z = false;
        while (it.hasNext()) {
            it.next();
            it.remove();
            z = true;
        }
        return z;
    }

    @Override // org.jdom2.Content, o.InterfaceC59869zpF
    public List<Namespace> getNamespacesInScope() {
        TreeMap treeMap = new TreeMap();
        Namespace namespace = Namespace.XML_NAMESPACE;
        treeMap.put(namespace.getPrefix(), namespace);
        treeMap.put(getNamespacePrefix(), getNamespace());
        if (this.additionalNamespaces != null) {
            for (Namespace namespace2 : getAdditionalNamespaces()) {
                if (!treeMap.containsKey(namespace2.getPrefix())) {
                    treeMap.put(namespace2.getPrefix(), namespace2);
                }
            }
        }
        if (this.attributes != null) {
            Iterator<Attribute> it = getAttributes().iterator();
            while (it.hasNext()) {
                Namespace namespace3 = it.next().getNamespace();
                if (!treeMap.containsKey(namespace3.getPrefix())) {
                    treeMap.put(namespace3.getPrefix(), namespace3);
                }
            }
        }
        Element parentElement = getParentElement();
        if (parentElement != null) {
            for (Namespace namespace4 : parentElement.getNamespacesInScope()) {
                if (!treeMap.containsKey(namespace4.getPrefix())) {
                    treeMap.put(namespace4.getPrefix(), namespace4);
                }
            }
        }
        if (parentElement == null && !treeMap.containsKey("")) {
            Namespace namespace5 = Namespace.NO_NAMESPACE;
            treeMap.put(namespace5.getPrefix(), namespace5);
        }
        ArrayList arrayList = new ArrayList(treeMap.size());
        arrayList.add(getNamespace());
        treeMap.remove(getNamespacePrefix());
        arrayList.addAll(treeMap.values());
        return Collections.unmodifiableList(arrayList);
    }

    @Override // org.jdom2.Content
    public List<Namespace> getNamespacesInherited() {
        if (getParentElement() == null) {
            ArrayList arrayList = new ArrayList(getNamespacesInScope());
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Namespace namespace = (Namespace) it.next();
                if (namespace != Namespace.NO_NAMESPACE && namespace != Namespace.XML_NAMESPACE) {
                    it.remove();
                }
            }
            return Collections.unmodifiableList(arrayList);
        }
        HashMap map = new HashMap();
        for (Namespace namespace2 : getParentElement().getNamespacesInScope()) {
            map.put(namespace2.getPrefix(), namespace2);
        }
        ArrayList arrayList2 = new ArrayList();
        for (Namespace namespace3 : getNamespacesInScope()) {
            if (namespace3 == map.get(namespace3.getPrefix())) {
                arrayList2.add(namespace3);
            }
        }
        return Collections.unmodifiableList(arrayList2);
    }

    @Override // org.jdom2.Content
    public List<Namespace> getNamespacesIntroduced() {
        if (getParentElement() == null) {
            ArrayList arrayList = new ArrayList(getNamespacesInScope());
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Namespace namespace = (Namespace) it.next();
                if (namespace == Namespace.XML_NAMESPACE || namespace == Namespace.NO_NAMESPACE) {
                    it.remove();
                }
            }
            return Collections.unmodifiableList(arrayList);
        }
        HashMap map = new HashMap();
        for (Namespace namespace2 : getParentElement().getNamespacesInScope()) {
            map.put(namespace2.getPrefix(), namespace2);
        }
        ArrayList arrayList2 = new ArrayList();
        for (Namespace namespace3 : getNamespacesInScope()) {
            if (!map.containsKey(namespace3.getPrefix()) || namespace3 != map.get(namespace3.getPrefix())) {
                arrayList2.add(namespace3);
            }
        }
        return Collections.unmodifiableList(arrayList2);
    }

    /* JADX DEBUG: Method merged with bridge method: detach()Lorg/jdom2/Content; */
    @Override // org.jdom2.Content
    public Element detach() {
        return (Element) super.detach();
    }

    @Override // org.jdom2.Parent
    public void canContainContent(Content content, int i, boolean z) throws IllegalAddException {
        if (content instanceof DocType) {
            throw new IllegalAddException("A DocType is not allowed except at the document level");
        }
    }

    public void sortContent(Comparator<? super Content> comparator) {
        this.content.sort(comparator);
    }

    public void sortChildren(Comparator<? super Element> comparator) {
        ((C59906zpz.Application) getChildren()).sort(comparator);
    }

    public void sortAttributes(Comparator<? super Attribute> comparator) {
        C59864zpA c59864zpA = this.attributes;
        if (c59864zpA != null) {
            c59864zpA.sort(comparator);
        }
    }

    public <E extends Content> void sortContent(Filter<E> filter, Comparator<? super E> comparator) {
        ((C59906zpz.Application) getContent(filter)).sort(comparator);
    }

    private final URI resolve(String str, URI uri) throws URISyntaxException {
        if (str == null) {
            return uri;
        }
        URI uri2 = new URI(str);
        return uri == null ? uri2 : uri2.resolve(uri);
    }

    public URI getXMLBaseURI() throws URISyntaxException {
        URI uriResolve = null;
        for (Parent parent = this; parent != null; parent = parent.getParent()) {
            if (parent instanceof Element) {
                uriResolve = resolve(((Element) parent).getAttributeValue(TtmlNode.RUBY_BASE, Namespace.XML_NAMESPACE), uriResolve);
            } else {
                uriResolve = resolve(((Document) parent).getBaseURI(), uriResolve);
            }
            if (uriResolve != null && uriResolve.isAbsolute()) {
                return uriResolve;
            }
        }
        return uriResolve;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        if (hasAdditionalNamespaces()) {
            int size = this.additionalNamespaces.size();
            objectOutputStream.writeInt(size);
            for (int i = 0; i < size; i++) {
                objectOutputStream.writeObject(this.additionalNamespaces.get(i));
            }
        } else {
            objectOutputStream.writeInt(0);
        }
        if (hasAttributes()) {
            int size2 = this.attributes.size();
            objectOutputStream.writeInt(size2);
            for (int i2 = 0; i2 < size2; i2++) {
                objectOutputStream.writeObject(this.attributes.get(i2));
            }
        } else {
            objectOutputStream.writeInt(0);
        }
        int size3 = this.content.size();
        objectOutputStream.writeInt(size3);
        for (int i3 = 0; i3 < size3; i3++) {
            objectOutputStream.writeObject(this.content.get(i3));
        }
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        this.content = new C59906zpz(this);
        int i = objectInputStream.readInt();
        while (true) {
            i--;
            if (i < 0) {
                break;
            } else {
                addNamespaceDeclaration((Namespace) objectInputStream.readObject());
            }
        }
        int i2 = objectInputStream.readInt();
        while (true) {
            i2--;
            if (i2 < 0) {
                break;
            } else {
                setAttribute((Attribute) objectInputStream.readObject());
            }
        }
        int i3 = objectInputStream.readInt();
        while (true) {
            i3--;
            if (i3 < 0) {
                return;
            } else {
                addContent((Content) objectInputStream.readObject());
            }
        }
    }
}
