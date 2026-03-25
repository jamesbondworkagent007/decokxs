package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.bqN, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C10537bqN implements java.util.Comparator<C19437gCi> {
    public static final C10537bqN EZpvd = new C10537bqN();

    private C10537bqN() {
    }

    /* JADX DEBUG: Method merged with bridge method: compare(Ljava/lang/Object;Ljava/lang/Object;)I */
    @Override // java.util.Comparator
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public int compare(@NotNull C19437gCi c19437gCi, @NotNull C19437gCi c19437gCi2) {
        Intrinsics.checkNotNullParameter(c19437gCi, "");
        Intrinsics.checkNotNullParameter(c19437gCi2, "");
        if (c19437gCi2.fetchVPNInfo()) {
            if (c19437gCi.fetchVPNInfo()) {
                if (C33129mqd.OLrzqt(c19437gCi.valueOf(), c19437gCi2.valueOf())) {
                    if (C33129mqd.OLrzqt(c19437gCi.EZpvd(), c19437gCi2.EZpvd())) {
                        return c19437gCi.gEmmrt() - c19437gCi2.gEmmrt();
                    }
                    if (C33129mqd.AEQbTJ(c19437gCi.EZpvd(), c19437gCi2.EZpvd())) {
                    }
                } else if (C33129mqd.AEQbTJ(c19437gCi.valueOf(), c19437gCi2.valueOf())) {
                }
            }
            return 1;
        }
        return -1;
    }
}
