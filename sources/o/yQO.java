package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class yQO extends yQG implements InterfaceC56844yUk {
    public final java.lang.String AEQbTJ;
    public final java.lang.annotation.Annotation[] EZpvd;
    public final yQN OLrzqt;
    public final boolean copydefault;

    @Override // o.yTM
    public boolean EZpvd() {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: AYXKKw()Lo/yUf; */
    @Override // o.InterfaceC56844yUk
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public yQN AYXKKw() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC56844yUk
    public boolean valueOf() {
        return this.copydefault;
    }

    public yQO(@NotNull yQN yqn, @NotNull java.lang.annotation.Annotation[] annotationArr, java.lang.String str, boolean z) {
        Intrinsics.checkNotNullParameter(yqn, "");
        Intrinsics.checkNotNullParameter(annotationArr, "");
        this.OLrzqt = yqn;
        this.EZpvd = annotationArr;
        this.AEQbTJ = str;
        this.copydefault = z;
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ()Ljava/util/Collection; */
    @Override // o.yTM
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public java.util.List<C56741yQp> AEQbTJ() {
        return C56744yQs.EZpvd(this.EZpvd);
    }

    /* JADX DEBUG: Method merged with bridge method: copydefault(Lo/yXs;)Lo/yTO; */
    @Override // o.yTM
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public C56741yQp copydefault(@NotNull C56933yXs c56933yXs) {
        Intrinsics.checkNotNullParameter(c56933yXs, "");
        return C56744yQs.KWHzl(this.EZpvd, c56933yXs);
    }

    @Override // o.InterfaceC56844yUk
    public C56935yXu copydefault() {
        java.lang.String str = this.AEQbTJ;
        if (str != null) {
            return C56935yXu.KWHzl(str);
        }
        return null;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(yQO.class.getName());
        sb.append(": ");
        sb.append(valueOf() ? "vararg " : "");
        sb.append(copydefault());
        sb.append(": ");
        sb.append(AYXKKw());
        return sb.toString();
    }
}
