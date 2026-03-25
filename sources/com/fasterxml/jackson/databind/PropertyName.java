package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.core.io.SerializedString;
import com.fasterxml.jackson.core.util.InternCache;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import java.io.Serializable;
import o.C5619Yr;
import o.InterfaceC5501Ue;

/* JADX INFO: loaded from: classes21.dex */
public class PropertyName implements Serializable {
    private static final String _NO_NAME = "";
    private static final String _USE_DEFAULT = "";
    private static final long serialVersionUID = 1;
    protected InterfaceC5501Ue _encodedSimple;
    protected final String _namespace;
    protected final String _simpleName;
    public static final PropertyName USE_DEFAULT = new PropertyName("", null);
    public static final PropertyName NO_NAME = new PropertyName(new String(""), null);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getNamespace() {
        return this._namespace;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getSimpleName() {
        return this._simpleName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean hasNamespace() {
        return this._namespace != null;
    }

    public PropertyName(String str) {
        this(str, null);
    }

    public PropertyName(String str, String str2) {
        this._simpleName = C5619Yr.KWHzl(str);
        this._namespace = str2;
    }

    public Object readResolve() {
        String str;
        return (this._namespace == null && ((str = this._simpleName) == null || "".equals(str))) ? USE_DEFAULT : this;
    }

    public static PropertyName construct(String str) {
        return (str == null || str.isEmpty()) ? USE_DEFAULT : new PropertyName(InternCache.instance.intern(str), null);
    }

    public static PropertyName construct(String str, String str2) {
        if (str == null) {
            str = "";
        }
        return (str2 == null && str.isEmpty()) ? USE_DEFAULT : new PropertyName(InternCache.instance.intern(str), str2);
    }

    public PropertyName internSimpleName() {
        String strIntern;
        return (this._simpleName.isEmpty() || (strIntern = InternCache.instance.intern(this._simpleName)) == this._simpleName) ? this : new PropertyName(strIntern, this._namespace);
    }

    public PropertyName withSimpleName(String str) {
        if (str == null) {
            str = "";
        }
        return str.equals(this._simpleName) ? this : new PropertyName(str, this._namespace);
    }

    public PropertyName withNamespace(String str) {
        String str2 = this._namespace;
        if (str == null) {
            if (str2 == null) {
                return this;
            }
        } else if (str.equals(str2)) {
            return this;
        }
        return new PropertyName(this._simpleName, str);
    }

    public InterfaceC5501Ue simpleAsEncoded(MapperConfig<?> mapperConfig) {
        InterfaceC5501Ue interfaceC5501UeCompileString;
        InterfaceC5501Ue interfaceC5501Ue = this._encodedSimple;
        if (interfaceC5501Ue != null) {
            return interfaceC5501Ue;
        }
        if (mapperConfig == null) {
            interfaceC5501UeCompileString = new SerializedString(this._simpleName);
        } else {
            interfaceC5501UeCompileString = mapperConfig.compileString(this._simpleName);
        }
        InterfaceC5501Ue interfaceC5501Ue2 = interfaceC5501UeCompileString;
        this._encodedSimple = interfaceC5501Ue2;
        return interfaceC5501Ue2;
    }

    public boolean hasSimpleName() {
        return !this._simpleName.isEmpty();
    }

    public boolean hasSimpleName(String str) {
        return this._simpleName.equals(str);
    }

    public boolean isEmpty() {
        return this._namespace == null && this._simpleName.isEmpty();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        PropertyName propertyName = (PropertyName) obj;
        String str = this._simpleName;
        if (str == null) {
            if (propertyName._simpleName != null) {
                return false;
            }
        } else if (!str.equals(propertyName._simpleName)) {
            return false;
        }
        String str2 = this._namespace;
        if (str2 == null) {
            return propertyName._namespace == null;
        }
        return str2.equals(propertyName._namespace);
    }

    public int hashCode() {
        String str = this._namespace;
        if (str == null) {
            return this._simpleName.hashCode();
        }
        return str.hashCode() ^ this._simpleName.hashCode();
    }

    public String toString() {
        if (this._namespace == null) {
            return this._simpleName;
        }
        return "{" + this._namespace + "}" + this._simpleName;
    }
}
