package o;

import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer;
import com.fasterxml.jackson.databind.type.TypeFactory;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: renamed from: o.Ws, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public abstract class AbstractC5568Ws {
    /* JADX WARN: Removed duplicated region for block: B:34:0x0094  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static AbstractC5548Vy<?> AEQbTJ(DeserializationContext deserializationContext, JavaType javaType) throws JsonMappingException {
        Application applicationAEQbTJ;
        java.lang.String name = javaType.getRawClass().getName();
        if (!name.startsWith("java.util.")) {
            return null;
        }
        java.lang.String strAhwBna = AhwBna(name);
        if (strAhwBna != null) {
            java.lang.String strKWHzl = KWHzl(strAhwBna);
            if (strKWHzl != null) {
                if (strKWHzl.endsWith("Set")) {
                    applicationAEQbTJ = AEQbTJ(4, javaType, java.util.Set.class);
                } else {
                    applicationAEQbTJ = strKWHzl.endsWith("List") ? AEQbTJ(5, javaType, java.util.List.class) : null;
                }
            } else {
                java.lang.String strCopydefault = copydefault(strAhwBna);
                if (strCopydefault != null) {
                    if (strCopydefault.endsWith("Set")) {
                        applicationAEQbTJ = AEQbTJ(1, javaType, java.util.Set.class);
                    } else if (strCopydefault.endsWith("List")) {
                        applicationAEQbTJ = AEQbTJ(2, javaType, java.util.List.class);
                    }
                } else {
                    java.lang.String strEZpvd = EZpvd(strAhwBna);
                    if (strEZpvd != null) {
                        if (strEZpvd.endsWith("Set")) {
                            applicationAEQbTJ = AEQbTJ(7, javaType, java.util.Set.class);
                        } else if (strEZpvd.endsWith("List")) {
                            applicationAEQbTJ = AEQbTJ(9, javaType, java.util.List.class);
                        } else if (strEZpvd.endsWith("Collection")) {
                            applicationAEQbTJ = AEQbTJ(8, javaType, java.util.Collection.class);
                        }
                    }
                }
            }
            if (applicationAEQbTJ == null) {
                return null;
            }
            return new StdDelegatingDeserializer(applicationAEQbTJ);
        }
        java.lang.String strOLrzqt = OLrzqt(name);
        if (strOLrzqt != null) {
            if (strOLrzqt.contains("List")) {
                return new StdDelegatingDeserializer(AEQbTJ(11, javaType, java.util.List.class));
            }
            return null;
        }
        java.lang.String strAEQbTJ = AEQbTJ(name);
        if (strAEQbTJ != null) {
            if (strAEQbTJ.contains("List")) {
                return new StdDelegatingDeserializer(AEQbTJ(11, javaType, java.util.List.class));
            }
            if (strAEQbTJ.contains("Set")) {
                return new StdDelegatingDeserializer(AEQbTJ(4, javaType, java.util.Set.class));
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0061  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static AbstractC5548Vy<?> copydefault(DeserializationContext deserializationContext, JavaType javaType) throws JsonMappingException {
        Application applicationAEQbTJ;
        java.lang.String name = javaType.getRawClass().getName();
        java.lang.String strAhwBna = AhwBna(name);
        if (strAhwBna != null) {
            java.lang.String strKWHzl = KWHzl(strAhwBna);
            if (strKWHzl != null) {
                applicationAEQbTJ = strKWHzl.contains("Map") ? AEQbTJ(6, javaType, java.util.Map.class) : null;
            } else {
                java.lang.String strCopydefault = copydefault(strAhwBna);
                if (strCopydefault != null) {
                    if (strCopydefault.contains("Map")) {
                        applicationAEQbTJ = AEQbTJ(3, javaType, java.util.Map.class);
                    }
                } else {
                    java.lang.String strEZpvd = EZpvd(strAhwBna);
                    if (strEZpvd != null && strEZpvd.contains("Map")) {
                        applicationAEQbTJ = AEQbTJ(10, javaType, java.util.Map.class);
                    }
                }
            }
        } else {
            java.lang.String strAEQbTJ = AEQbTJ(name);
            if (strAEQbTJ != null && strAEQbTJ.contains("Map")) {
                applicationAEQbTJ = AEQbTJ(6, javaType, java.util.Map.class);
            }
        }
        if (applicationAEQbTJ == null) {
            return null;
        }
        return new StdDelegatingDeserializer(applicationAEQbTJ);
    }

    public static Application AEQbTJ(int i, JavaType javaType, java.lang.Class<?> cls) {
        return new Application(i, javaType.findSuperType(cls));
    }

    public static java.lang.String OLrzqt(java.lang.String str) {
        if (str.startsWith("java.util.Arrays$")) {
            return str.substring(17);
        }
        return null;
    }

    public static java.lang.String AhwBna(java.lang.String str) {
        if (str.startsWith("java.util.Collections$")) {
            return str.substring(22);
        }
        return null;
    }

    public static java.lang.String AEQbTJ(java.lang.String str) {
        if (str.startsWith("java.util.ImmutableCollections$")) {
            return str.substring(31);
        }
        return null;
    }

    public static java.lang.String copydefault(java.lang.String str) {
        if (str.startsWith("Singleton")) {
            return str.substring(9);
        }
        return null;
    }

    public static java.lang.String EZpvd(java.lang.String str) {
        if (str.startsWith("Synchronized")) {
            return str.substring(12);
        }
        return null;
    }

    public static java.lang.String KWHzl(java.lang.String str) {
        if (str.startsWith("Unmodifiable")) {
            return str.substring(12);
        }
        return null;
    }

    /* JADX INFO: renamed from: o.Ws$Application */
    public static class Application implements InterfaceC5621Yt<java.lang.Object, java.lang.Object> {
        public final JavaType AEQbTJ;
        public final int KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC5621Yt
        public JavaType AEQbTJ(TypeFactory typeFactory) {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC5621Yt
        public JavaType EZpvd(TypeFactory typeFactory) {
            return this.AEQbTJ;
        }

        public Application(int i, JavaType javaType) {
            this.AEQbTJ = javaType;
            this.KWHzl = i;
        }

        @Override // o.InterfaceC5621Yt
        public java.lang.Object OLrzqt(java.lang.Object obj) {
            if (obj == null) {
                return null;
            }
            switch (this.KWHzl) {
                case 1:
                    java.util.Set set = (java.util.Set) obj;
                    KWHzl(set.size());
                    return Collections.singleton(set.iterator().next());
                case 2:
                    java.util.List list = (java.util.List) obj;
                    KWHzl(list.size());
                    return Collections.singletonList(list.get(0));
                case 3:
                    java.util.Map map = (java.util.Map) obj;
                    KWHzl(map.size());
                    Map.Entry entry = (Map.Entry) map.entrySet().iterator().next();
                    return Collections.singletonMap(entry.getKey(), entry.getValue());
                case 4:
                    return Collections.unmodifiableSet((java.util.Set) obj);
                case 5:
                    return Collections.unmodifiableList((java.util.List) obj);
                case 6:
                    return Collections.unmodifiableMap((java.util.Map) obj);
                case 7:
                    return Collections.synchronizedSet((java.util.Set) obj);
                case 8:
                    return Collections.synchronizedCollection((java.util.Collection) obj);
                case 9:
                    return Collections.synchronizedList((java.util.List) obj);
                case 10:
                    return Collections.synchronizedMap((java.util.Map) obj);
                default:
                    return obj;
            }
        }

        public final void KWHzl(int i) {
            if (i == 1) {
                return;
            }
            throw new java.lang.IllegalArgumentException("Can not deserialize Singleton container from " + i + " entries");
        }
    }
}
