package o;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.jsontype.NamedType;
import java.util.Map;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes21.dex */
public class XI extends XH {
    public final MapperConfig<?> AEQbTJ;
    public final boolean EZpvd;
    public final java.util.Map<java.lang.String, JavaType> copydefault;
    public final ConcurrentHashMap<java.lang.String, java.lang.String> djBIcL;

    public XI(MapperConfig<?> mapperConfig, JavaType javaType, ConcurrentHashMap<java.lang.String, java.lang.String> concurrentHashMap, java.util.HashMap<java.lang.String, JavaType> map) {
        super(javaType, mapperConfig.getTypeFactory());
        this.AEQbTJ = mapperConfig;
        this.djBIcL = concurrentHashMap;
        this.copydefault = map;
        this.EZpvd = mapperConfig.isEnabled(MapperFeature.ACCEPT_CASE_INSENSITIVE_VALUES);
    }

    public static XI copydefault(MapperConfig<?> mapperConfig, JavaType javaType, java.util.Collection<NamedType> collection, boolean z, boolean z2) {
        java.util.HashMap map;
        ConcurrentHashMap concurrentHashMap;
        if (z == z2) {
            throw new java.lang.IllegalArgumentException();
        }
        if (z) {
            concurrentHashMap = new ConcurrentHashMap();
            map = null;
        } else {
            map = new java.util.HashMap();
            concurrentHashMap = new ConcurrentHashMap(4);
        }
        boolean zIsEnabled = mapperConfig.isEnabled(MapperFeature.ACCEPT_CASE_INSENSITIVE_VALUES);
        if (collection != null) {
            for (NamedType namedType : collection) {
                java.lang.Class<?> type = namedType.getType();
                java.lang.String name = namedType.hasName() ? namedType.getName() : EZpvd(type);
                if (z) {
                    concurrentHashMap.put(type.getName(), name);
                }
                if (z2) {
                    if (zIsEnabled) {
                        name = name.toLowerCase();
                    }
                    JavaType javaType2 = (JavaType) map.get(name);
                    if (javaType2 == null || !type.isAssignableFrom(javaType2.getRawClass())) {
                        map.put(name, mapperConfig.constructType(type));
                    }
                }
            }
        }
        return new XI(mapperConfig, javaType, concurrentHashMap, map);
    }

    @Override // o.XB
    public java.lang.String OLrzqt(java.lang.Object obj) {
        return KWHzl(obj.getClass());
    }

    public java.lang.String KWHzl(java.lang.Class<?> cls) {
        if (cls == null) {
            return null;
        }
        java.lang.String name = cls.getName();
        java.lang.String strEZpvd = this.djBIcL.get(name);
        if (strEZpvd == null) {
            java.lang.Class<?> rawClass = this.KWHzl.constructType(cls).getRawClass();
            if (this.AEQbTJ.isAnnotationProcessingEnabled()) {
                strEZpvd = this.AEQbTJ.getAnnotationIntrospector().findTypeName(this.AEQbTJ.introspectClassAnnotations(rawClass).AuCTel());
            }
            if (strEZpvd == null) {
                strEZpvd = EZpvd(rawClass);
            }
            this.djBIcL.put(name, strEZpvd);
        }
        return strEZpvd;
    }

    @Override // o.XB
    public java.lang.String KWHzl(java.lang.Object obj, java.lang.Class<?> cls) {
        if (obj == null) {
            return KWHzl(cls);
        }
        return OLrzqt(obj);
    }

    @Override // o.XH, o.XB
    public JavaType KWHzl(VA va, java.lang.String str) {
        return copydefault(str);
    }

    public JavaType copydefault(java.lang.String str) {
        if (this.EZpvd) {
            str = str.toLowerCase();
        }
        return this.copydefault.get(str);
    }

    @Override // o.XH, o.XB
    public java.lang.String AEQbTJ() {
        TreeSet treeSet = new TreeSet();
        for (Map.Entry<java.lang.String, JavaType> entry : this.copydefault.entrySet()) {
            if (entry.getValue().isConcrete()) {
                treeSet.add(entry.getKey());
            }
        }
        return treeSet.toString();
    }

    public java.lang.String toString() {
        return java.lang.String.format("[%s; id-to-type=%s]", getClass().getName(), this.copydefault);
    }

    public static java.lang.String EZpvd(java.lang.Class<?> cls) {
        java.lang.String name = cls.getName();
        int iLastIndexOf = name.lastIndexOf(46);
        return iLastIndexOf < 0 ? name : name.substring(iLastIndexOf + 1);
    }
}
