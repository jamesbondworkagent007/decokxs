package o;

import kotlin.coroutines.Continuation;
import o.C56080xw;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C55073xd {

    /* JADX INFO: renamed from: o.xd$Activity */
    public static final class Activity implements C56080xw.Application {
        public final CS AEQbTJ;

        public Activity(CS cs) {
            this.AEQbTJ = cs;
        }

        @Override // o.C56080xw.Application
        public boolean EZpvd() {
            return this.AEQbTJ.KWHzl();
        }

        @Override // o.C56080xw.Application
        public java.lang.Object AEQbTJ(@NotNull CQ cq, long j, @NotNull Continuation<? super java.lang.Long> continuation) {
            return this.AEQbTJ.copydefault(cq, j, continuation);
        }
    }

    public static final C56080xw.Application EZpvd(CS cs) {
        return new Activity(cs);
    }
}
