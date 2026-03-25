package o;

import java.util.Collections;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tgi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C46944tgi {
    public final java.util.List<InterfaceC46936tga> EZpvd = Collections.synchronizedList(new java.util.ArrayList());

    public final void copydefault(@NotNull InterfaceC46936tga interfaceC46936tga) {
        Intrinsics.checkNotNullParameter(interfaceC46936tga, "");
        this.EZpvd.add(interfaceC46936tga);
        OLrzqt();
    }

    public final java.util.List<InterfaceC46936tga> copydefault() {
        java.util.List<InterfaceC46936tga> list = this.EZpvd;
        Intrinsics.checkNotNullExpressionValue(list, "");
        return list;
    }

    public final void OLrzqt() {
        java.util.List<InterfaceC46936tga> list = this.EZpvd;
        Intrinsics.checkNotNullExpressionValue(list, "");
        if (list.size() > 1) {
            C56407yEf.copydefault(list, new StateListAnimator());
        }
    }

    /* JADX INFO: renamed from: o.tgi$StateListAnimator */
    public static final class StateListAnimator<T> implements java.util.Comparator {
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return yET.KWHzl(java.lang.Integer.valueOf(((InterfaceC46936tga) t2).KWHzl()), java.lang.Integer.valueOf(((InterfaceC46936tga) t).KWHzl()));
        }
    }
}
