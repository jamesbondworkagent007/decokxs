package org.jdom2.xpath;

import java.io.InvalidObjectException;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import java.util.List;
import o.C59866zpC;
import org.jdom2.JDOMException;
import org.jdom2.Namespace;

/* JADX INFO: loaded from: classes24.dex */
@Deprecated
public abstract class XPath implements Serializable {
    private static final String DEFAULT_XPATH_CLASS = "org.jdom2.xpath.jaxen.JDOMXPath";
    public static final String JDOM_OBJECT_MODEL_URI = "http://jdom.org/jaxp/xpath/jdom";
    private static final String XPATH_CLASS_PROPERTY = "org.jdom2.xpath.class";
    private static Constructor<? extends XPath> constructor = null;
    private static final long serialVersionUID = 200;

    public abstract void addNamespace(Namespace namespace);

    public abstract String getXPath();

    public abstract Number numberValueOf(Object obj) throws JDOMException;

    public abstract List<?> selectNodes(Object obj) throws JDOMException;

    public abstract Object selectSingleNode(Object obj) throws JDOMException;

    public abstract void setVariable(String str, Object obj);

    public abstract String valueOf(Object obj) throws JDOMException;

    public static XPath newInstance(String str) throws JDOMException {
        String strEZpvd = DEFAULT_XPATH_CLASS;
        try {
            if (constructor == null) {
                try {
                    strEZpvd = C59866zpC.EZpvd(XPATH_CLASS_PROPERTY, DEFAULT_XPATH_CLASS);
                } catch (SecurityException unused) {
                }
                Class<?> cls = Class.forName(strEZpvd);
                if (!XPath.class.isAssignableFrom(cls)) {
                    throw new JDOMException("Unable to create a JDOMXPath from class '" + strEZpvd + "'.");
                }
                setXPathClass(cls);
            }
            return constructor.newInstance(str);
        } catch (InvocationTargetException e) {
            Throwable targetException = e.getTargetException();
            if (targetException instanceof JDOMException) {
                throw ((JDOMException) targetException);
            }
            throw new JDOMException(targetException.toString(), targetException);
        } catch (JDOMException e2) {
            throw e2;
        } catch (Exception e3) {
            throw new JDOMException(e3.toString(), e3);
        }
    }

    public static void setXPathClass(Class<? extends XPath> cls) throws JDOMException {
        if (cls == null) {
            throw new IllegalArgumentException("aClass");
        }
        try {
            if (XPath.class.isAssignableFrom(cls) && !Modifier.isAbstract(cls.getModifiers())) {
                constructor = cls.getConstructor(String.class);
                return;
            }
            throw new JDOMException(cls.getName() + " is not a concrete JDOM XPath implementation");
        } catch (JDOMException e) {
            throw e;
        } catch (Exception e2) {
            throw new JDOMException(e2.toString(), e2);
        }
    }

    public void addNamespace(String str, String str2) {
        addNamespace(Namespace.getNamespace(str, str2));
    }

    public static List<?> selectNodes(Object obj, String str) throws JDOMException {
        return newInstance(str).selectNodes(obj);
    }

    public static Object selectSingleNode(Object obj, String str) throws JDOMException {
        return newInstance(str).selectSingleNode(obj);
    }

    public final Object writeReplace() throws ObjectStreamException {
        return new XPathString(getXPath());
    }

    public static final class XPathString implements Serializable {
        private static final long serialVersionUID = 200;
        private String xPath;

        public XPathString(String str) {
            this.xPath = str;
        }

        private Object readResolve() throws ObjectStreamException {
            try {
                return XPath.newInstance(this.xPath);
            } catch (JDOMException e) {
                throw new InvalidObjectException("Can't create XPath object for expression \"" + this.xPath + "\": " + e.toString());
            }
        }
    }
}
