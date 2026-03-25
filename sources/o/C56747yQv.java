package o;

import java.lang.reflect.GenericArrayType;
import kotlin.jvm.internal.Intrinsics;
import o.yQN;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yQv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C56747yQv extends yQN implements yTS {
    public final boolean AEQbTJ;
    public final java.lang.reflect.Type EZpvd;
    public final java.util.Collection<yTO> OLrzqt;
    public final yQN copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.yTM
    public java.util.Collection<yTO> AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.yTM
    public boolean EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: copydefault()Lo/yUf; */
    @Override // o.yTS
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public yQN copydefault() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.yQN
    public java.lang.reflect.Type OLrzqt() {
        return this.EZpvd;
    }

    public C56747yQv(@NotNull java.lang.reflect.Type type) {
        yQN yqnEZpvd;
        Intrinsics.checkNotNullParameter(type, "");
        this.EZpvd = type;
        java.lang.reflect.Type typeOLrzqt = OLrzqt();
        if (!(typeOLrzqt instanceof GenericArrayType)) {
            if (typeOLrzqt instanceof java.lang.Class) {
                java.lang.Class cls = (java.lang.Class) typeOLrzqt;
                if (cls.isArray()) {
                    yQN.StateListAnimator stateListAnimator = yQN.AYXKKw;
                    java.lang.Class<?> componentType = cls.getComponentType();
                    Intrinsics.checkNotNullExpressionValue(componentType, "");
                    yqnEZpvd = stateListAnimator.EZpvd(componentType);
                }
            }
            throw new java.lang.IllegalArgumentException("Not an array type (" + OLrzqt().getClass() + "): " + OLrzqt());
        }
        yQN.StateListAnimator stateListAnimator2 = yQN.AYXKKw;
        java.lang.reflect.Type genericComponentType = ((GenericArrayType) typeOLrzqt).getGenericComponentType();
        Intrinsics.checkNotNullExpressionValue(genericComponentType, "");
        yqnEZpvd = stateListAnimator2.EZpvd(genericComponentType);
        this.copydefault = yqnEZpvd;
        this.OLrzqt = yDY.AhwBna();
    }
}
