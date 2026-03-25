package o;

import kotlin.jvm.internal.Intrinsics;
import o.AbstractC56740yQo;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yQw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C56748yQw extends AbstractC56740yQo implements yTL {
    public final java.lang.Object[] EZpvd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C56748yQw(C56935yXu c56935yXu, @NotNull java.lang.Object[] objArr) {
        super(c56935yXu, null);
        Intrinsics.checkNotNullParameter(objArr, "");
        this.EZpvd = objArr;
    }

    @Override // o.yTL
    public java.util.List<AbstractC56740yQo> KWHzl() {
        java.lang.Object[] objArr = this.EZpvd;
        java.util.ArrayList arrayList = new java.util.ArrayList(objArr.length);
        for (java.lang.Object obj : objArr) {
            AbstractC56740yQo.TaskDescription taskDescription = AbstractC56740yQo.OLrzqt;
            Intrinsics.copydefault(obj);
            arrayList.add(taskDescription.copydefault(obj, null));
        }
        return arrayList;
    }
}
