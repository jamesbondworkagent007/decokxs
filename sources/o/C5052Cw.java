package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.Cw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5052Cw {

    /* JADX INFO: renamed from: o.Cw$Activity */
    public static final class Activity implements InterfaceC5053Cx {
        public final /* synthetic */ InterfaceC5045Cp KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(InterfaceC5045Cp interfaceC5045Cp) {
            this.KWHzl = interfaceC5045Cp;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC5053Cx
        public final InterfaceC5045Cp EZpvd(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return this.KWHzl;
        }
    }

    public static final InterfaceC5053Cx copydefault(@NotNull InterfaceC5045Cp interfaceC5045Cp) {
        Intrinsics.checkNotNullParameter(interfaceC5045Cp, "");
        return new Activity(interfaceC5045Cp);
    }
}
