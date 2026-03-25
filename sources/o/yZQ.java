package o;

import com.fasterxml.jackson.core.JsonPointer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public class yZQ {
    public C56933yXs KWHzl;
    public final java.lang.String OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: Removed duplicated region for block: B:7:0x000c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ void KWHzl(int i) {
        java.lang.String str;
        int i2;
        if (i != 3 && i != 5) {
            switch (i) {
                case 8:
                case 9:
                case 10:
                    break;
                default:
                    str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                    break;
            }
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i != 3 && i != 5) {
            switch (i) {
                case 8:
                case 9:
                case 10:
                    i2 = 2;
                    break;
                default:
                    i2 = 3;
                    break;
            }
        } else {
            i2 = 2;
        }
        java.lang.Object[] objArr = new java.lang.Object[i2];
        switch (i) {
            case 1:
            case 2:
                objArr[0] = "classId";
                break;
            case 3:
            case 5:
            case 8:
            case 9:
            case 10:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/jvm/JvmClassName";
                break;
            case 4:
            case 6:
                objArr[0] = "fqName";
                break;
            case 7:
            default:
                objArr[0] = "internalName";
                break;
        }
        if (i == 3) {
            objArr[1] = "internalNameByClassId";
        } else if (i != 5) {
            switch (i) {
                case 8:
                    objArr[1] = "getFqNameForClassNameWithoutDollars";
                    break;
                case 9:
                    objArr[1] = "getPackageFqName";
                    break;
                case 10:
                    objArr[1] = "getInternalName";
                    break;
                default:
                    objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/jvm/JvmClassName";
                    break;
            }
        } else {
            objArr[1] = "byFqNameWithoutInnerClasses";
        }
        switch (i) {
            case 1:
                objArr[2] = "byClassId";
                break;
            case 2:
                objArr[2] = "internalNameByClassId";
                break;
            case 3:
            case 5:
            case 8:
            case 9:
            case 10:
                break;
            case 4:
            case 6:
                objArr[2] = "byFqNameWithoutInnerClasses";
                break;
            case 7:
                objArr[2] = "<init>";
                break;
            default:
                objArr[2] = "byInternalName";
                break;
        }
        java.lang.String str2 = java.lang.String.format(str, objArr);
        if (i != 3 && i != 5) {
            switch (i) {
                case 8:
                case 9:
                case 10:
                    break;
                default:
                    throw new java.lang.IllegalArgumentException(str2);
            }
        }
        throw new java.lang.IllegalStateException(str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return this.OLrzqt;
    }

    public static yZQ copydefault(@NotNull java.lang.String str) {
        if (str == null) {
            KWHzl(0);
        }
        return new yZQ(str);
    }

    public static yZQ copydefault(@NotNull C56929yXo c56929yXo) {
        if (c56929yXo == null) {
            KWHzl(1);
        }
        return new yZQ(OLrzqt(c56929yXo));
    }

    public static java.lang.String OLrzqt(@NotNull C56929yXo c56929yXo) {
        if (c56929yXo == null) {
            KWHzl(2);
        }
        C56933yXs c56933yXsOLrzqt = c56929yXo.OLrzqt();
        java.lang.String strReplace = c56929yXo.copydefault().KWHzl().replace('.', '$');
        if (!c56933yXsOLrzqt.AEQbTJ()) {
            strReplace = c56933yXsOLrzqt.KWHzl().replace('.', JsonPointer.SEPARATOR) + "/" + strReplace;
        }
        if (strReplace == null) {
            KWHzl(3);
        }
        return strReplace;
    }

    public static yZQ AEQbTJ(@NotNull C56933yXs c56933yXs) {
        if (c56933yXs == null) {
            KWHzl(4);
        }
        yZQ yzq = new yZQ(c56933yXs.KWHzl().replace('.', JsonPointer.SEPARATOR));
        yzq.KWHzl = c56933yXs;
        return yzq;
    }

    public yZQ(@NotNull java.lang.String str) {
        if (str == null) {
            KWHzl(7);
        }
        this.OLrzqt = str;
    }

    public C56933yXs OLrzqt() {
        return new C56933yXs(this.OLrzqt.replace(JsonPointer.SEPARATOR, '.'));
    }

    public C56933yXs copydefault() {
        int iLastIndexOf = this.OLrzqt.lastIndexOf("/");
        if (iLastIndexOf == -1) {
            C56933yXs c56933yXs = C56933yXs.EZpvd;
            if (c56933yXs == null) {
                KWHzl(9);
            }
            return c56933yXs;
        }
        return new C56933yXs(this.OLrzqt.substring(0, iLastIndexOf).replace(JsonPointer.SEPARATOR, '.'));
    }

    public java.lang.String KWHzl() {
        java.lang.String str = this.OLrzqt;
        if (str == null) {
            KWHzl(10);
        }
        return str;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.OLrzqt.equals(((yZQ) obj).OLrzqt);
    }

    public int hashCode() {
        return this.OLrzqt.hashCode();
    }
}
