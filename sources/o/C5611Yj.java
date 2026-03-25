package o;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.type.ResolvedRecursiveType;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: renamed from: o.Yj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C5611Yj {
    public java.util.ArrayList<ResolvedRecursiveType> KWHzl;
    public final C5611Yj OLrzqt;
    public final java.lang.Class<?> copydefault;

    public C5611Yj(java.lang.Class<?> cls) {
        this(null, cls);
    }

    public C5611Yj(C5611Yj c5611Yj, java.lang.Class<?> cls) {
        this.OLrzqt = c5611Yj;
        this.copydefault = cls;
    }

    public C5611Yj copydefault(java.lang.Class<?> cls) {
        return new C5611Yj(this, cls);
    }

    public void AEQbTJ(ResolvedRecursiveType resolvedRecursiveType) {
        if (this.KWHzl == null) {
            this.KWHzl = new java.util.ArrayList<>();
        }
        this.KWHzl.add(resolvedRecursiveType);
    }

    public void EZpvd(JavaType javaType) {
        java.util.ArrayList<ResolvedRecursiveType> arrayList = this.KWHzl;
        if (arrayList != null) {
            java.util.Iterator<ResolvedRecursiveType> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().setReference(javaType);
            }
        }
    }

    public C5611Yj OLrzqt(java.lang.Class<?> cls) {
        if (this.copydefault == cls) {
            return this;
        }
        for (C5611Yj c5611Yj = this.OLrzqt; c5611Yj != null; c5611Yj = c5611Yj.OLrzqt) {
            if (c5611Yj.copydefault == cls) {
                return c5611Yj;
            }
        }
        return null;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("[ClassStack (self-refs: ");
        java.util.ArrayList<ResolvedRecursiveType> arrayList = this.KWHzl;
        sb.append(arrayList == null ? "0" : java.lang.String.valueOf(arrayList.size()));
        sb.append(')');
        for (C5611Yj c5611Yj = this; c5611Yj != null; c5611Yj = c5611Yj.OLrzqt) {
            sb.append(' ');
            sb.append(c5611Yj.copydefault.getName());
        }
        sb.append(AbstractJsonLexerKt.END_LIST);
        return sb.toString();
    }
}
