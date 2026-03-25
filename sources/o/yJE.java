package o;

import kotlin.NotImplementedError;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class yJE implements java.lang.reflect.TypeVariable<java.lang.reflect.GenericDeclaration>, yJC {
    public final yJD AEQbTJ;

    public yJE(@NotNull yJD yjd) {
        Intrinsics.checkNotNullParameter(yjd, "");
        this.AEQbTJ = yjd;
    }

    @Override // java.lang.reflect.TypeVariable
    public java.lang.String getName() {
        return this.AEQbTJ.OLrzqt();
    }

    @Override // java.lang.reflect.TypeVariable
    public java.lang.reflect.GenericDeclaration getGenericDeclaration() {
        throw new NotImplementedError("An operation is not implemented: " + ("getGenericDeclaration() is not yet supported for type variables created from KType: " + this.AEQbTJ));
    }

    @Override // java.lang.reflect.TypeVariable
    public java.lang.reflect.Type[] getBounds() {
        java.util.List<InterfaceC56559yJw> listEZpvd = this.AEQbTJ.EZpvd();
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listEZpvd, 10));
        java.util.Iterator<T> it = listEZpvd.iterator();
        while (it.hasNext()) {
            arrayList.add(yJB.AEQbTJ((InterfaceC56559yJw) it.next(), true));
        }
        return (java.lang.reflect.Type[]) arrayList.toArray(new java.lang.reflect.Type[0]);
    }

    @Override // java.lang.reflect.Type
    public java.lang.String getTypeName() {
        return getName();
    }

    public boolean equals(java.lang.Object obj) {
        if (obj instanceof java.lang.reflect.TypeVariable) {
            java.lang.reflect.TypeVariable typeVariable = (java.lang.reflect.TypeVariable) obj;
            if (Intrinsics.EZpvd((java.lang.Object) getName(), (java.lang.Object) typeVariable.getName()) && Intrinsics.EZpvd(getGenericDeclaration(), typeVariable.getGenericDeclaration())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return getName().hashCode() ^ getGenericDeclaration().hashCode();
    }

    public java.lang.String toString() {
        return getTypeName();
    }
}
