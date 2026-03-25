package o;

import java.lang.reflect.ParameterizedType;
import kotlin.jvm.internal.Intrinsics;
import o.yQN;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class yQC extends yQN implements yTU {
    public final yTQ KWHzl;
    public final java.lang.reflect.Type OLrzqt;

    @Override // o.yTM
    public boolean EZpvd() {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.yQN
    public java.lang.reflect.Type OLrzqt() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.yQN, o.yTM
    public yTO copydefault(@NotNull C56933yXs c56933yXs) {
        Intrinsics.checkNotNullParameter(c56933yXs, "");
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.yTU
    public yTQ copydefault() {
        return this.KWHzl;
    }

    public yQC(@NotNull java.lang.reflect.Type type) {
        yTQ c56750yQy;
        Intrinsics.checkNotNullParameter(type, "");
        this.OLrzqt = type;
        java.lang.reflect.Type typeOLrzqt = OLrzqt();
        if (typeOLrzqt instanceof java.lang.Class) {
            c56750yQy = new C56750yQy((java.lang.Class) typeOLrzqt);
        } else if (typeOLrzqt instanceof java.lang.reflect.TypeVariable) {
            c56750yQy = new yQP((java.lang.reflect.TypeVariable) typeOLrzqt);
        } else {
            if (!(typeOLrzqt instanceof ParameterizedType)) {
                throw new java.lang.IllegalStateException("Not a classifier type (" + typeOLrzqt.getClass() + "): " + typeOLrzqt);
            }
            java.lang.reflect.Type rawType = ((ParameterizedType) typeOLrzqt).getRawType();
            Intrinsics.copydefault(rawType, "");
            c56750yQy = new C56750yQy((java.lang.Class) rawType);
        }
        this.KWHzl = c56750yQy;
    }

    @Override // o.yTU
    public java.lang.String KWHzl() {
        throw new java.lang.UnsupportedOperationException("Type not found: " + OLrzqt());
    }

    @Override // o.yTU
    public java.lang.String AYXKKw() {
        return OLrzqt().toString();
    }

    @Override // o.yTU
    public boolean djBIcL() {
        java.lang.reflect.Type typeOLrzqt = OLrzqt();
        if (!(typeOLrzqt instanceof java.lang.Class)) {
            return false;
        }
        java.lang.reflect.TypeVariable[] typeParameters = ((java.lang.Class) typeOLrzqt).getTypeParameters();
        Intrinsics.checkNotNullExpressionValue(typeParameters, "");
        return (typeParameters.length == 0) ^ true;
    }

    @Override // o.yTU
    public java.util.List<InterfaceC56839yUf> valueOf() {
        java.util.List<java.lang.reflect.Type> listOLrzqt = C56743yQr.OLrzqt(OLrzqt());
        yQN.StateListAnimator stateListAnimator = yQN.AYXKKw;
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listOLrzqt, 10));
        java.util.Iterator<T> it = listOLrzqt.iterator();
        while (it.hasNext()) {
            arrayList.add(stateListAnimator.EZpvd((java.lang.reflect.Type) it.next()));
        }
        return arrayList;
    }

    @Override // o.yTM
    public java.util.Collection<yTO> AEQbTJ() {
        return yDY.AhwBna();
    }
}
