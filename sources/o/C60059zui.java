package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.koin.core.error.ScopeAlreadyCreatedException;

/* JADX INFO: renamed from: o.zui, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C60059zui {
    public static final TaskDescription KWHzl = new TaskDescription(null);
    public static final C60055zue copydefault = C60058zuh.EZpvd("_root_");
    public final java.util.Map<java.lang.String, C60060zuj> AEQbTJ;
    public final C60060zuj AhwBna;
    public final C60022zty EZpvd;
    public final java.util.HashSet<InterfaceC59997ztZ> OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C60060zuj OLrzqt() {
        return this.AhwBna;
    }

    public C60059zui(@NotNull C60022zty c60022zty) {
        Intrinsics.checkNotNullParameter(c60022zty, "");
        this.EZpvd = c60022zty;
        java.util.HashSet<InterfaceC59997ztZ> hashSet = new java.util.HashSet<>();
        this.OLrzqt = hashSet;
        java.util.Map<java.lang.String, C60060zuj> mapCopydefault = C60071zuu.OLrzqt.copydefault();
        this.AEQbTJ = mapCopydefault;
        C60060zuj c60060zuj = new C60060zuj(copydefault, "_root_", true, c60022zty);
        this.AhwBna = c60060zuj;
        hashSet.add(c60060zuj.copydefault());
        mapCopydefault.put(c60060zuj.AEQbTJ(), c60060zuj);
    }

    public final C60060zuj copydefault(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return this.AEQbTJ.get(str);
    }

    public static /* synthetic */ C60060zuj createScope$default(C60059zui c60059zui, java.lang.String str, InterfaceC59997ztZ interfaceC59997ztZ, java.lang.Object obj, int i, java.lang.Object obj2) {
        if ((i & 4) != 0) {
            obj = null;
        }
        return c60059zui.EZpvd(str, interfaceC59997ztZ, obj);
    }

    public final C60060zuj EZpvd(@NotNull java.lang.String str, @NotNull InterfaceC59997ztZ interfaceC59997ztZ, java.lang.Object obj) throws ScopeAlreadyCreatedException {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(interfaceC59997ztZ, "");
        this.EZpvd.KWHzl().EZpvd("| (+) Scope - id:'" + str + "' q:'" + interfaceC59997ztZ + '\'');
        if (!this.OLrzqt.contains(interfaceC59997ztZ)) {
            this.EZpvd.KWHzl().EZpvd("| Scope '" + interfaceC59997ztZ + "' not defined. Creating it ...");
            this.OLrzqt.add(interfaceC59997ztZ);
        }
        if (this.AEQbTJ.containsKey(str)) {
            throw new ScopeAlreadyCreatedException("Scope with id '" + str + "' is already created");
        }
        C60060zuj c60060zuj = new C60060zuj(interfaceC59997ztZ, str, false, this.EZpvd, 4, null);
        if (obj != null) {
            this.EZpvd.KWHzl().EZpvd("|- Scope source set id:'" + str + "' -> " + obj);
            c60060zuj.KWHzl(obj);
        }
        c60060zuj.AEQbTJ(this.AhwBna);
        this.AEQbTJ.put(str, c60060zuj);
        return c60060zuj;
    }

    public final void AEQbTJ(@NotNull C60060zuj c60060zuj) {
        Intrinsics.checkNotNullParameter(c60060zuj, "");
        this.EZpvd.OLrzqt().KWHzl(c60060zuj);
        this.AEQbTJ.remove(c60060zuj.AEQbTJ());
    }

    public final void copydefault(@NotNull java.util.Set<C59991ztT> set) {
        Intrinsics.checkNotNullParameter(set, "");
        java.util.Iterator<T> it = set.iterator();
        while (it.hasNext()) {
            copydefault((C59991ztT) it.next());
        }
    }

    public final void copydefault(C59991ztT c59991ztT) {
        this.OLrzqt.addAll(c59991ztT.EZpvd());
    }

    /* JADX INFO: renamed from: o.zui$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.zui.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final C60055zue KWHzl() {
            return C60059zui.copydefault;
        }
    }
}
