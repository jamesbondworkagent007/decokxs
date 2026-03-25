package o;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yXu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C56935yXu implements java.lang.Comparable<C56935yXu> {
    public final java.lang.String KWHzl;
    public final boolean copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ void copydefault(int i) {
        java.lang.String str = (i == 1 || i == 2 || i == 3 || i == 4) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        java.lang.Object[] objArr = new java.lang.Object[(i == 1 || i == 2 || i == 3 || i == 4) ? 2 : 3];
        if (i == 1 || i == 2 || i == 3 || i == 4) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/name/Name";
        } else {
            objArr[0] = "name";
        }
        if (i == 1) {
            objArr[1] = "asString";
        } else if (i == 2) {
            objArr[1] = "getIdentifier";
        } else if (i == 3 || i == 4) {
            objArr[1] = "asStringStripSpecialMarkers";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/name/Name";
        }
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 4:
                break;
            case 5:
                objArr[2] = "identifier";
                break;
            case 6:
                objArr[2] = "isValidIdentifier";
                break;
            case 7:
                objArr[2] = "identifierIfValid";
                break;
            case 8:
                objArr[2] = "special";
                break;
            case 9:
                objArr[2] = "guessByFirstCharacter";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        java.lang.String str2 = java.lang.String.format(str, objArr);
        if (i != 1 && i != 2 && i != 3 && i != 4) {
            throw new java.lang.IllegalArgumentException(str2);
        }
        throw new java.lang.IllegalStateException(str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean OLrzqt() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return this.KWHzl;
    }

    public C56935yXu(@NotNull java.lang.String str, boolean z) {
        if (str == null) {
            copydefault(0);
        }
        this.KWHzl = str;
        this.copydefault = z;
    }

    public java.lang.String AEQbTJ() {
        java.lang.String str = this.KWHzl;
        if (str == null) {
            copydefault(1);
        }
        return str;
    }

    public java.lang.String copydefault() {
        if (this.copydefault) {
            throw new java.lang.IllegalStateException("not identifier: " + this);
        }
        java.lang.String strAEQbTJ = AEQbTJ();
        if (strAEQbTJ == null) {
            copydefault(2);
        }
        return strAEQbTJ;
    }

    /* JADX DEBUG: Method merged with bridge method: compareTo(Ljava/lang/Object;)I */
    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public int compareTo(C56935yXu c56935yXu) {
        return this.KWHzl.compareTo(c56935yXu.KWHzl);
    }

    public static C56935yXu AEQbTJ(@NotNull java.lang.String str) {
        if (str == null) {
            copydefault(5);
        }
        return new C56935yXu(str, false);
    }

    public static boolean EZpvd(@NotNull java.lang.String str) {
        if (str == null) {
            copydefault(6);
        }
        if (str.isEmpty() || str.startsWith("<")) {
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt == '.' || cCharAt == '/' || cCharAt == '\\') {
                return false;
            }
        }
        return true;
    }

    public static C56935yXu copydefault(@NotNull java.lang.String str) {
        if (str == null) {
            copydefault(8);
        }
        if (!str.startsWith("<")) {
            throw new java.lang.IllegalArgumentException("special name must start with '<': " + str);
        }
        return new C56935yXu(str, true);
    }

    public static C56935yXu KWHzl(@NotNull java.lang.String str) {
        if (str == null) {
            copydefault(9);
        }
        if (str.startsWith("<")) {
            return copydefault(str);
        }
        return AEQbTJ(str);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C56935yXu)) {
            return false;
        }
        C56935yXu c56935yXu = (C56935yXu) obj;
        return this.copydefault == c56935yXu.copydefault && this.KWHzl.equals(c56935yXu.KWHzl);
    }

    public int hashCode() {
        return (this.KWHzl.hashCode() * 31) + (this.copydefault ? 1 : 0);
    }
}
