package o;

import kotlin.jvm.internal.Intrinsics;
import o.yQN;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class yQE extends yQH implements yTW {
    public final java.lang.reflect.Field OLrzqt;

    @Override // o.yTW
    public boolean OLrzqt() {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: copydefault()Ljava/lang/reflect/Member; */
    @Override // o.yQH
    /* JADX INFO: renamed from: djBIcL, reason: merged with bridge method [inline-methods] */
    public java.lang.reflect.Field copydefault() {
        return this.OLrzqt;
    }

    public yQE(@NotNull java.lang.reflect.Field field) {
        Intrinsics.checkNotNullParameter(field, "");
        this.OLrzqt = field;
    }

    @Override // o.yTW
    public boolean gEmmrt() {
        return copydefault().isEnumConstant();
    }

    /* JADX DEBUG: Method merged with bridge method: valueOf()Lo/yUf; */
    @Override // o.yTW
    /* JADX INFO: renamed from: AYXKKw, reason: merged with bridge method [inline-methods] */
    public yQN valueOf() {
        yQN.StateListAnimator stateListAnimator = yQN.AYXKKw;
        java.lang.reflect.Type genericType = copydefault().getGenericType();
        Intrinsics.checkNotNullExpressionValue(genericType, "");
        return stateListAnimator.EZpvd(genericType);
    }
}
