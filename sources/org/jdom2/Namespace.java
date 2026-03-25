package org.jdom2;

import java.io.InvalidObjectException;
import java.io.Serializable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import o.C59868zpE;

/* JADX INFO: loaded from: classes24.dex */
public final class Namespace implements Serializable {
    public static final Namespace NO_NAMESPACE;
    public static final Namespace XML_NAMESPACE;
    private static final ConcurrentMap<String, ConcurrentMap<String, Namespace>> namespacemap;
    private static final long serialVersionUID = 200;
    private final transient String prefix;
    private final transient String uri;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getPrefix() {
        return this.prefix;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getURI() {
        return this.uri;
    }

    static {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(512, 0.75f, 64);
        namespacemap = concurrentHashMap;
        Namespace namespace = new Namespace("", "");
        NO_NAMESPACE = namespace;
        Namespace namespace2 = new Namespace("xml", "http://www.w3.org/XML/1998/namespace");
        XML_NAMESPACE = namespace2;
        ConcurrentHashMap concurrentHashMap2 = new ConcurrentHashMap();
        concurrentHashMap2.put(namespace.getPrefix(), namespace);
        concurrentHashMap.put(namespace.getURI(), concurrentHashMap2);
        ConcurrentHashMap concurrentHashMap3 = new ConcurrentHashMap();
        concurrentHashMap3.put(namespace2.getPrefix(), namespace2);
        concurrentHashMap.put(namespace2.getURI(), concurrentHashMap3);
    }

    public static Namespace getNamespace(String str, String str2) {
        if (str2 == null) {
            if (str == null || "".equals(str)) {
                return NO_NAMESPACE;
            }
            throw new IllegalNameException("", "namespace", "Namespace URIs must be non-null and non-empty Strings");
        }
        ConcurrentMap<String, ConcurrentMap<String, Namespace>> concurrentMap = namespacemap;
        ConcurrentMap<String, Namespace> concurrentHashMap = concurrentMap.get(str2);
        if (concurrentHashMap == null) {
            String strAYXKKw = C59868zpE.AYXKKw(str2);
            if (strAYXKKw != null) {
                throw new IllegalNameException(str2, "Namespace URI", strAYXKKw);
            }
            concurrentHashMap = new ConcurrentHashMap<>();
            ConcurrentMap<String, Namespace> concurrentMapPutIfAbsent = concurrentMap.putIfAbsent(str2, concurrentHashMap);
            if (concurrentMapPutIfAbsent != null) {
                concurrentHashMap = concurrentMapPutIfAbsent;
            }
        }
        Namespace namespace = concurrentHashMap.get(str == null ? "" : str);
        if (namespace != null) {
            return namespace;
        }
        if ("".equals(str2)) {
            throw new IllegalNameException("", "namespace", "Namespace URIs must be non-null and non-empty Strings");
        }
        if ("http://www.w3.org/XML/1998/namespace".equals(str2)) {
            throw new IllegalNameException(str2, "Namespace URI", "The http://www.w3.org/XML/1998/namespace must be bound to only the 'xml' prefix.");
        }
        if (str == null) {
            str = "";
        }
        String strAhwBna = C59868zpE.AhwBna(str);
        if (strAhwBna != null) {
            throw new IllegalNameException(str, "Namespace prefix", strAhwBna);
        }
        Namespace namespace2 = new Namespace(str, str2);
        Namespace namespacePutIfAbsent = concurrentHashMap.putIfAbsent(str, namespace2);
        return namespacePutIfAbsent != null ? namespacePutIfAbsent : namespace2;
    }

    public static Namespace getNamespace(String str) {
        return getNamespace("", str);
    }

    private Namespace(String str, String str2) {
        this.prefix = str;
        this.uri = str2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Namespace) {
            return this.uri.equals(((Namespace) obj).uri);
        }
        return false;
    }

    public String toString() {
        return "[Namespace: prefix \"" + this.prefix + "\" is mapped to URI \"" + this.uri + "\"]";
    }

    public int hashCode() {
        return this.uri.hashCode();
    }

    public static final class NamespaceSerializationProxy implements Serializable {
        private static final long serialVersionUID = 200;
        private final String pprefix;
        private final String puri;

        public NamespaceSerializationProxy(String str, String str2) {
            this.pprefix = str;
            this.puri = str2;
        }

        private Object readResolve() {
            return Namespace.getNamespace(this.pprefix, this.puri);
        }
    }

    private Object writeReplace() {
        return new NamespaceSerializationProxy(this.prefix, this.uri);
    }

    private Object readResolve() throws InvalidObjectException {
        throw new InvalidObjectException("Namespace is serialized through a proxy");
    }
}
