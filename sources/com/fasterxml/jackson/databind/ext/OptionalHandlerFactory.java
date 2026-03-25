package com.fasterxml.jackson.databind.ext;

import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.ser.std.DateSerializer;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import o.AbstractC5548Vy;
import o.AbstractC5549Vz;
import o.AbstractC5573Wx;
import o.C5619Yr;
import o.InterfaceC5559Wj;
import o.InterfaceC5605Yd;
import o.VD;

/* JADX INFO: loaded from: classes21.dex */
public class OptionalHandlerFactory implements Serializable {
    private static final Class<?> CLASS_DOM_DOCUMENT;
    private static final Class<?> CLASS_DOM_NODE;
    private static final String CLS_NAME_JAVA_SQL_BLOB = "java.sql.Blob";
    private static final String CLS_NAME_JAVA_SQL_DATE = "java.sql.Date";
    private static final String CLS_NAME_JAVA_SQL_SERIALBLOB = "javax.sql.rowset.serial.SerialBlob";
    private static final String CLS_NAME_JAVA_SQL_TIME = "java.sql.Time";
    private static final String CLS_NAME_JAVA_SQL_TIMESTAMP = "java.sql.Timestamp";
    private static final String DESERIALIZERS_FOR_JAVAX_XML = "com.fasterxml.jackson.databind.ext.CoreXMLDeserializers";
    private static final String DESERIALIZER_FOR_DOM_DOCUMENT = "com.fasterxml.jackson.databind.ext.DOMDeserializer$DocumentDeserializer";
    private static final String DESERIALIZER_FOR_DOM_NODE = "com.fasterxml.jackson.databind.ext.DOMDeserializer$NodeDeserializer";
    private static final String PACKAGE_PREFIX_JAVAX_XML = "javax.xml.";
    private static final String SERIALIZERS_FOR_JAVAX_XML = "com.fasterxml.jackson.databind.ext.CoreXMLSerializers";
    private static final String SERIALIZER_FOR_DOM_NODE = "com.fasterxml.jackson.databind.ext.DOMSerializer";
    private static final AbstractC5573Wx _jdk7Helper;
    public static final OptionalHandlerFactory instance;
    private static final long serialVersionUID = 1;
    private final Map<String, String> _sqlDeserializers;
    private final Map<String, Object> _sqlSerializers;

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:13:0x0007
        	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:132)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:58)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:50)
        */
    static {
        /*
            r0 = 0
            java.lang.Class<org.w3c.dom.Node> r1 = org.w3c.dom.Node.class
            java.lang.Class<org.w3c.dom.Document> r2 = org.w3c.dom.Document.class
            goto L8
        L6:
            r1 = r0
        L7:
            r2 = r0
        L8:
            com.fasterxml.jackson.databind.ext.OptionalHandlerFactory.CLASS_DOM_NODE = r1
            com.fasterxml.jackson.databind.ext.OptionalHandlerFactory.CLASS_DOM_DOCUMENT = r2
            o.Wx r0 = o.AbstractC5573Wx.OLrzqt()     // Catch: java.lang.Throwable -> L10
        L10:
            com.fasterxml.jackson.databind.ext.OptionalHandlerFactory._jdk7Helper = r0
            com.fasterxml.jackson.databind.ext.OptionalHandlerFactory r0 = new com.fasterxml.jackson.databind.ext.OptionalHandlerFactory
            r0.<init>()
            com.fasterxml.jackson.databind.ext.OptionalHandlerFactory.instance = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.ext.OptionalHandlerFactory.<clinit>():void");
    }

    public OptionalHandlerFactory() {
        HashMap map = new HashMap();
        this._sqlDeserializers = map;
        map.put(CLS_NAME_JAVA_SQL_DATE, "com.fasterxml.jackson.databind.deser.std.DateDeserializers$SqlDateDeserializer");
        map.put(CLS_NAME_JAVA_SQL_TIMESTAMP, "com.fasterxml.jackson.databind.deser.std.DateDeserializers$TimestampDeserializer");
        HashMap map2 = new HashMap();
        this._sqlSerializers = map2;
        map2.put(CLS_NAME_JAVA_SQL_TIMESTAMP, DateSerializer.instance);
        map2.put(CLS_NAME_JAVA_SQL_DATE, "com.fasterxml.jackson.databind.ser.std.SqlDateSerializer");
        map2.put(CLS_NAME_JAVA_SQL_TIME, "com.fasterxml.jackson.databind.ser.std.SqlTimeSerializer");
        map2.put(CLS_NAME_JAVA_SQL_BLOB, "com.fasterxml.jackson.databind.ext.SqlBlobSerializer");
        map2.put(CLS_NAME_JAVA_SQL_SERIALBLOB, "com.fasterxml.jackson.databind.ext.SqlBlobSerializer");
    }

    public VD<?> findSerializer(SerializationConfig serializationConfig, JavaType javaType, AbstractC5549Vz abstractC5549Vz) {
        Object objInstantiate;
        VD<?> vdAEQbTJ;
        Class<?> rawClass = javaType.getRawClass();
        if (_IsXOfY(rawClass, CLASS_DOM_NODE)) {
            return (VD) instantiate(SERIALIZER_FOR_DOM_NODE, javaType);
        }
        AbstractC5573Wx abstractC5573Wx = _jdk7Helper;
        if (abstractC5573Wx != null && (vdAEQbTJ = abstractC5573Wx.AEQbTJ(rawClass)) != null) {
            return vdAEQbTJ;
        }
        String name = rawClass.getName();
        Object obj = this._sqlSerializers.get(name);
        if (obj != null) {
            if (obj instanceof VD) {
                return (VD) obj;
            }
            return (VD) instantiate((String) obj, javaType);
        }
        if ((name.startsWith(PACKAGE_PREFIX_JAVAX_XML) || hasSuperClassStartingWith(rawClass, PACKAGE_PREFIX_JAVAX_XML)) && (objInstantiate = instantiate(SERIALIZERS_FOR_JAVAX_XML, javaType)) != null) {
            return ((InterfaceC5605Yd) objInstantiate).findSerializer(serializationConfig, javaType, abstractC5549Vz);
        }
        return null;
    }

    public AbstractC5548Vy<?> findDeserializer(JavaType javaType, DeserializationConfig deserializationConfig, AbstractC5549Vz abstractC5549Vz) throws JsonMappingException {
        Object objInstantiate;
        AbstractC5548Vy<?> abstractC5548VyKWHzl;
        Class<?> rawClass = javaType.getRawClass();
        AbstractC5573Wx abstractC5573Wx = _jdk7Helper;
        if (abstractC5573Wx != null && (abstractC5548VyKWHzl = abstractC5573Wx.KWHzl(rawClass)) != null) {
            return abstractC5548VyKWHzl;
        }
        if (_IsXOfY(rawClass, CLASS_DOM_NODE)) {
            return (AbstractC5548Vy) instantiate(DESERIALIZER_FOR_DOM_NODE, javaType);
        }
        if (_IsXOfY(rawClass, CLASS_DOM_DOCUMENT)) {
            return (AbstractC5548Vy) instantiate(DESERIALIZER_FOR_DOM_DOCUMENT, javaType);
        }
        String name = rawClass.getName();
        String str = this._sqlDeserializers.get(name);
        if (str != null) {
            return (AbstractC5548Vy) instantiate(str, javaType);
        }
        if ((name.startsWith(PACKAGE_PREFIX_JAVAX_XML) || hasSuperClassStartingWith(rawClass, PACKAGE_PREFIX_JAVAX_XML)) && (objInstantiate = instantiate(DESERIALIZERS_FOR_JAVAX_XML, javaType)) != null) {
            return ((InterfaceC5559Wj) objInstantiate).findBeanDeserializer(javaType, deserializationConfig, abstractC5549Vz);
        }
        return null;
    }

    public boolean hasDeserializerFor(Class<?> cls) {
        if (_IsXOfY(cls, CLASS_DOM_NODE) || _IsXOfY(cls, CLASS_DOM_DOCUMENT)) {
            return true;
        }
        String name = cls.getName();
        if (name.startsWith(PACKAGE_PREFIX_JAVAX_XML) || hasSuperClassStartingWith(cls, PACKAGE_PREFIX_JAVAX_XML)) {
            return true;
        }
        return this._sqlDeserializers.containsKey(name);
    }

    private boolean _IsXOfY(Class<?> cls, Class<?> cls2) {
        return cls2 != null && cls2.isAssignableFrom(cls);
    }

    private Object instantiate(String str, JavaType javaType) {
        try {
            return instantiate(Class.forName(str), javaType);
        } catch (Throwable th) {
            throw new IllegalStateException("Failed to find class `" + str + "` for handling values of type " + C5619Yr.copydefault(javaType) + ", problem: (" + th.getClass().getName() + ") " + th.getMessage());
        }
    }

    private Object instantiate(Class<?> cls, JavaType javaType) {
        try {
            return C5619Yr.EZpvd((Class) cls, false);
        } catch (Throwable th) {
            throw new IllegalStateException("Failed to create instance of `" + cls.getName() + "` for handling values of type " + C5619Yr.copydefault(javaType) + ", problem: (" + th.getClass().getName() + ") " + th.getMessage());
        }
    }

    private boolean hasSuperClassStartingWith(Class<?> cls, String str) {
        do {
            cls = cls.getSuperclass();
            if (cls == null || cls == Object.class) {
                return false;
            }
        } while (!cls.getName().startsWith(str));
        return true;
    }
}
