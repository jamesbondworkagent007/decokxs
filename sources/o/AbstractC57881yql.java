package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yql, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public abstract class AbstractC57881yql implements InterfaceC57889yqt {
    public final C57877yqh AEQbTJ;
    public final InterfaceC57738yoA KWHzl;
    public final InterfaceC57887yqr OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InterfaceC57887yqr AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InterfaceC57738yoA OLrzqt() {
        return this.KWHzl;
    }

    public AbstractC57881yql(@NotNull InterfaceC57738yoA interfaceC57738yoA, @NotNull C57877yqh c57877yqh, @NotNull InterfaceC57887yqr interfaceC57887yqr) {
        Intrinsics.checkNotNullParameter(interfaceC57738yoA, "");
        Intrinsics.checkNotNullParameter(c57877yqh, "");
        Intrinsics.checkNotNullParameter(interfaceC57887yqr, "");
        this.KWHzl = interfaceC57738yoA;
        this.AEQbTJ = c57877yqh;
        this.OLrzqt = interfaceC57887yqr;
    }

    @Override // o.InterfaceC57889yqt
    public java.util.List<C57885yqp> copydefault() {
        return this.AEQbTJ.OLrzqt();
    }

    @Override // o.InterfaceC57889yqt
    public void KWHzl(@NotNull C57885yqp c57885yqp) {
        Intrinsics.checkNotNullParameter(c57885yqp, "");
        this.AEQbTJ.AEQbTJ(c57885yqp);
    }

    @Override // o.InterfaceC57889yqt
    public void AEQbTJ(@NotNull C57885yqp c57885yqp) {
        Intrinsics.checkNotNullParameter(c57885yqp, "");
        this.AEQbTJ.KWHzl(c57885yqp);
    }

    @Override // o.InterfaceC57889yqt
    public void copydefault(@NotNull C57885yqp c57885yqp) {
        Intrinsics.checkNotNullParameter(c57885yqp, "");
        this.AEQbTJ.copydefault(c57885yqp);
    }

    @Override // o.InterfaceC57889yqt
    public java.util.List<C57870yqa> AEQbTJ(@NotNull java.lang.String str, @NotNull java.util.List<C57870yqa> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        java.util.List<C57870yqa> listOLrzqt = this.AEQbTJ.OLrzqt(str, list);
        this.KWHzl.OLrzqt(Intrinsics.KWHzl("OneSignal getNotCachedUniqueOutcome influences: ", listOLrzqt));
        return listOLrzqt;
    }

    @Override // o.InterfaceC57889yqt
    public java.util.Set<java.lang.String> EZpvd() {
        java.util.Set<java.lang.String> setCopydefault = this.AEQbTJ.copydefault();
        this.KWHzl.OLrzqt(Intrinsics.KWHzl("OneSignal getUnattributedUniqueOutcomeEventsSentByChannel: ", setCopydefault));
        return setCopydefault;
    }

    @Override // o.InterfaceC57889yqt
    public void KWHzl(@NotNull java.util.Set<java.lang.String> set) {
        Intrinsics.checkNotNullParameter(set, "");
        this.KWHzl.OLrzqt(Intrinsics.KWHzl("OneSignal save unattributedUniqueOutcomeEvents: ", set));
        this.AEQbTJ.EZpvd(set);
    }

    @Override // o.InterfaceC57889yqt
    public void OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.AEQbTJ.KWHzl(str, str2);
    }
}
