package o;

import java.util.Collections;

/* JADX INFO: renamed from: o.Ps, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC5386Ps<Model, Data> {
    Application<Data> AEQbTJ(@androidx.annotation.NonNull Model model, int i, int i2, @androidx.annotation.NonNull NM nm);

    boolean OLrzqt(@androidx.annotation.NonNull Model model);

    /* JADX INFO: renamed from: o.Ps$Application */
    public static class Application<Data> {
        public final NU<Data> EZpvd;
        public final java.util.List<NH> KWHzl;
        public final NH OLrzqt;

        public Application(@androidx.annotation.NonNull NH nh, @androidx.annotation.NonNull NU<Data> nu) {
            this(nh, Collections.emptyList(), nu);
        }

        public Application(@androidx.annotation.NonNull NH nh, @androidx.annotation.NonNull java.util.List<NH> list, @androidx.annotation.NonNull NU<Data> nu) {
            this.OLrzqt = (NH) SE.OLrzqt(nh);
            this.KWHzl = (java.util.List) SE.OLrzqt(list);
            this.EZpvd = (NU) SE.OLrzqt(nu);
        }
    }
}
