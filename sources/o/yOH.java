package o;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public class yOH implements yOB {
    public final yOL KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static /* synthetic */ void AEQbTJ(int i) {
        java.lang.String str = i != 1 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        java.lang.Object[] objArr = new java.lang.Object[i != 1 ? 3 : 2];
        if (i != 1) {
            objArr[0] = "annotations";
        } else {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotatedImpl";
        }
        if (i != 1) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotatedImpl";
        } else {
            objArr[1] = "getAnnotations";
        }
        if (i != 1) {
            objArr[2] = "<init>";
        }
        java.lang.String str2 = java.lang.String.format(str, objArr);
        if (i == 1) {
            throw new java.lang.IllegalStateException(str2);
        }
    }

    public yOH(@NotNull yOL yol) {
        if (yol == null) {
            AEQbTJ(0);
        }
        this.KWHzl = yol;
    }

    @Override // o.yOB
    public yOL copydefault() {
        yOL yol = this.KWHzl;
        if (yol == null) {
            AEQbTJ(1);
        }
        return yol;
    }
}
