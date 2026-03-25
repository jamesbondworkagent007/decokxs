package o;

import kotlin.jvm.internal.Intrinsics;
import o.C32853mlS;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mlQ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C32851mlQ extends AbstractC32847mlM {
    public final android.app.Application AYXKKw;
    public final java.lang.String fetchVPNInfo;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32847mlM
    public android.app.Application KWHzl() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32847mlM
    public java.lang.String OLrzqt() {
        return this.fetchVPNInfo;
    }

    public C32851mlQ(@NotNull java.lang.String str, @NotNull android.app.Application application) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(application, "");
        this.fetchVPNInfo = str;
        this.AYXKKw = application;
        C32853mlS.EZpvd.OLrzqt(new C32853mlS.StateListAnimator() { // from class: o.mlQ.2
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.C32853mlS.StateListAnimator, o.C32853mlS.Activity
            public void copydefault(java.util.Map<java.lang.String, java.lang.String> map) {
                Intrinsics.checkNotNullParameter(map, "");
            }
        });
    }
}
