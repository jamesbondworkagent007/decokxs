package o;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.rlP, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C43230rlP implements InterfaceC43299rmf {
    public final InterfaceComponentCallbacks2C43266rlz KWHzl;
    public final InterfaceC43299rmf OLrzqt;
    public static final Application Companion = new Application(null);
    public static final java.util.Map<java.lang.Class<? extends InterfaceC43295rmb>, java.util.Set<InterfaceComponentCallbacks2C43266rlz>> AEQbTJ = new LinkedHashMap();

    public C43230rlP(@NotNull InterfaceC43299rmf interfaceC43299rmf, @NotNull InterfaceComponentCallbacks2C43266rlz interfaceComponentCallbacks2C43266rlz) {
        Intrinsics.checkNotNullParameter(interfaceC43299rmf, "");
        Intrinsics.checkNotNullParameter(interfaceComponentCallbacks2C43266rlz, "");
        this.OLrzqt = interfaceC43299rmf;
        this.KWHzl = interfaceComponentCallbacks2C43266rlz;
    }

    /* JADX INFO: renamed from: o.rlP$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.rlP.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final <E extends InterfaceC43295rmb> java.util.Set<InterfaceComponentCallbacks2C43266rlz> KWHzl(@NotNull java.lang.Class<E> cls) {
            Intrinsics.checkNotNullParameter(cls, "");
            return (java.util.Set) C43230rlP.AEQbTJ.get(cls);
        }

        public final <E extends InterfaceC43295rmb> void OLrzqt(java.lang.Class<E> cls, InterfaceComponentCallbacks2C43266rlz interfaceComponentCallbacks2C43266rlz) {
            java.util.Set linkedHashSet = (java.util.Set) C43230rlP.AEQbTJ.get(cls);
            if (linkedHashSet == null) {
                linkedHashSet = new LinkedHashSet();
            }
            linkedHashSet.add(interfaceComponentCallbacks2C43266rlz);
            C43230rlP.AEQbTJ.put(cls, linkedHashSet);
        }
    }

    @Override // o.InterfaceC43299rmf
    public <E extends InterfaceC43295rmb> void KWHzl(@NotNull java.lang.Class<E> cls, @NotNull E e) {
        Intrinsics.checkNotNullParameter(cls, "");
        Intrinsics.checkNotNullParameter(e, "");
        this.OLrzqt.KWHzl(cls, e);
        Companion.OLrzqt(cls, this.KWHzl);
    }

    @Override // o.InterfaceC43299rmf
    public <E extends InterfaceC43295rmb> void EZpvd(@NotNull java.lang.Class<E> cls, @NotNull InterfaceC56387yDm<? extends E> interfaceC56387yDm) {
        Intrinsics.checkNotNullParameter(cls, "");
        Intrinsics.checkNotNullParameter(interfaceC56387yDm, "");
        this.OLrzqt.EZpvd(cls, interfaceC56387yDm);
        Companion.OLrzqt(cls, this.KWHzl);
    }
}
