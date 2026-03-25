package o;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC43217rlC;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.rlQ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C43231rlQ implements InterfaceC43253rlm {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final java.util.Map<java.lang.Class<? extends InterfaceC43216rlB>, InterfaceComponentCallbacks2C43266rlz> EZpvd = new LinkedHashMap();
    public final InterfaceC43253rlm KWHzl;
    public final InterfaceComponentCallbacks2C43266rlz OLrzqt;

    public C43231rlQ(@NotNull InterfaceC43253rlm interfaceC43253rlm, @NotNull InterfaceComponentCallbacks2C43266rlz interfaceComponentCallbacks2C43266rlz) {
        Intrinsics.checkNotNullParameter(interfaceC43253rlm, "");
        Intrinsics.checkNotNullParameter(interfaceComponentCallbacks2C43266rlz, "");
        this.KWHzl = interfaceC43253rlm;
        this.OLrzqt = interfaceComponentCallbacks2C43266rlz;
    }

    /* JADX INFO: renamed from: o.rlQ$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.rlQ.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final <S extends InterfaceC43216rlB> InterfaceComponentCallbacks2C43266rlz OLrzqt(@NotNull java.lang.Class<S> cls) {
            Intrinsics.checkNotNullParameter(cls, "");
            return (InterfaceComponentCallbacks2C43266rlz) C43231rlQ.EZpvd.get(cls);
        }
    }

    @Override // o.InterfaceC43253rlm
    public <S extends InterfaceC43216rlB> void copydefault(@NotNull java.lang.Class<S> cls, @NotNull S s) {
        Intrinsics.checkNotNullParameter(cls, "");
        Intrinsics.checkNotNullParameter(s, "");
        if (AEQbTJ(this.OLrzqt, cls)) {
            this.KWHzl.copydefault(cls, s);
            EZpvd.put(cls, this.OLrzqt);
        }
    }

    @Override // o.InterfaceC43253rlm
    public <S extends InterfaceC43216rlB, R extends S> void KWHzl(@NotNull java.lang.Class<S> cls, @NotNull java.lang.Class<R> cls2) {
        Intrinsics.checkNotNullParameter(cls, "");
        Intrinsics.checkNotNullParameter(cls2, "");
        if (AEQbTJ(this.OLrzqt, cls)) {
            this.KWHzl.KWHzl(cls, cls2);
            EZpvd.put(cls, this.OLrzqt);
        }
    }

    @Override // o.InterfaceC43253rlm
    public <S extends InterfaceC43216rlB> void OLrzqt(@NotNull java.lang.Class<S> cls, @NotNull InterfaceC43217rlC.StateListAnimator<S> stateListAnimator) {
        Intrinsics.checkNotNullParameter(cls, "");
        Intrinsics.checkNotNullParameter(stateListAnimator, "");
        if (AEQbTJ(this.OLrzqt, cls)) {
            this.KWHzl.OLrzqt(cls, stateListAnimator);
            EZpvd.put(cls, this.OLrzqt);
        }
    }

    @Override // o.InterfaceC43253rlm
    public <S extends InterfaceC43216rlB> void EZpvd(@NotNull java.lang.Class<S> cls, @NotNull InterfaceC56387yDm<? extends S> interfaceC56387yDm) {
        Intrinsics.checkNotNullParameter(cls, "");
        Intrinsics.checkNotNullParameter(interfaceC56387yDm, "");
        if (AEQbTJ(this.OLrzqt, cls)) {
            this.KWHzl.EZpvd(cls, interfaceC56387yDm);
            EZpvd.put(cls, this.OLrzqt);
        }
    }

    public final boolean AEQbTJ(InterfaceComponentCallbacks2C43266rlz interfaceComponentCallbacks2C43266rlz, java.lang.Class<? extends InterfaceC43216rlB> cls) {
        boolean zContains;
        java.util.List<java.lang.String> sites = interfaceComponentCallbacks2C43266rlz.getSites();
        if (sites == null || sites.isEmpty()) {
            zContains = !EZpvd.containsKey(cls);
        } else {
            java.util.List<java.lang.String> sites2 = interfaceComponentCallbacks2C43266rlz.getSites();
            Intrinsics.copydefault(sites2);
            zContains = sites2.contains(C43246rlf.OLrzqt.AhwBna());
        }
        if (zContains) {
            pUU.EZpvd("Module", "[" + interfaceComponentCallbacks2C43266rlz.getClass().getSimpleName() + "] register service: " + cls);
        }
        return zContains;
    }
}
