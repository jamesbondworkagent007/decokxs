package o;

import java.util.LinkedHashSet;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import o.InterfaceC59098zad;
import o.InterfaceC59101zag;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.zam, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C59107zam implements InterfaceC59098zad {
    public final InterfaceC56387yDm AEQbTJ;
    public java.util.Map<InterfaceC56665yNu, InterfaceC56665yNu> EZpvd;
    public final InterfaceC56387yDm KWHzl;
    public final TypeSubstitutor OLrzqt;
    public final InterfaceC59098zad copydefault;

    public C59107zam(@NotNull InterfaceC59098zad interfaceC59098zad, @NotNull TypeSubstitutor typeSubstitutor) {
        Intrinsics.checkNotNullParameter(interfaceC59098zad, "");
        Intrinsics.checkNotNullParameter(typeSubstitutor, "");
        this.copydefault = interfaceC59098zad;
        this.KWHzl = C56392yDr.copydefault(new C59106zal(typeSubstitutor));
        AbstractC59325zes abstractC59325zesKWHzl = typeSubstitutor.KWHzl();
        Intrinsics.checkNotNullExpressionValue(abstractC59325zesKWHzl, "");
        this.OLrzqt = yYX.wrapWithCapturingSubstitution$default(abstractC59325zesKWHzl, false, 1, null).valueOf();
        this.AEQbTJ = C56392yDr.copydefault(new C59110zap(this));
    }

    @Override // o.InterfaceC59101zag
    public void OLrzqt(@NotNull C56935yXu c56935yXu, @NotNull yQV yqv) {
        InterfaceC59098zad.TaskDescription.KWHzl(this, c56935yXu, yqv);
    }

    public static final TypeSubstitutor copydefault(TypeSubstitutor typeSubstitutor) {
        return typeSubstitutor.KWHzl().valueOf();
    }

    public static final java.util.Collection EZpvd(C59107zam c59107zam) {
        return c59107zam.KWHzl(InterfaceC59101zag.Application.getContributedDescriptors$default(c59107zam.copydefault, null, null, 3, null));
    }

    public final java.util.Collection<InterfaceC56665yNu> KWHzl() {
        return (java.util.Collection) this.AEQbTJ.getValue();
    }

    public final <D extends InterfaceC56665yNu> D OLrzqt(D d) {
        if (this.OLrzqt.EZpvd()) {
            return d;
        }
        if (this.EZpvd == null) {
            this.EZpvd = new java.util.HashMap();
        }
        java.util.Map<InterfaceC56665yNu, InterfaceC56665yNu> map = this.EZpvd;
        Intrinsics.copydefault(map);
        InterfaceC56665yNu interfaceC56665yNuAEQbTJ = map.get(d);
        if (interfaceC56665yNuAEQbTJ == null) {
            if (!(d instanceof InterfaceC56688yOq)) {
                throw new java.lang.IllegalStateException(("Unknown descriptor in scope: " + d).toString());
            }
            interfaceC56665yNuAEQbTJ = ((InterfaceC56688yOq) d).AEQbTJ(this.OLrzqt);
            if (interfaceC56665yNuAEQbTJ == null) {
                throw new java.lang.AssertionError("We expect that no conflict should happen while substitution is guaranteed to generate invariant projection, but " + d + " substitution fails");
            }
            map.put(d, interfaceC56665yNuAEQbTJ);
        }
        D d2 = (D) interfaceC56665yNuAEQbTJ;
        Intrinsics.copydefault(d2, "");
        return d2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: o.zam */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.util.Collection<? extends D extends o.yNu> */
    /* JADX WARN: Multi-variable type inference failed */
    public final <D extends InterfaceC56665yNu> java.util.Collection<D> KWHzl(java.util.Collection<? extends D> collection) {
        if (this.OLrzqt.EZpvd() || collection.isEmpty()) {
            return collection;
        }
        LinkedHashSet linkedHashSetKWHzl = C59433zgu.KWHzl(collection.size());
        java.util.Iterator it = collection.iterator();
        while (it.hasNext()) {
            linkedHashSetKWHzl.add(OLrzqt((InterfaceC56665yNu) it.next()));
        }
        return linkedHashSetKWHzl;
    }

    @Override // o.InterfaceC59098zad
    public java.util.Collection<? extends InterfaceC56676yOe> copydefault(@NotNull C56935yXu c56935yXu, @NotNull yQV yqv) {
        Intrinsics.checkNotNullParameter(c56935yXu, "");
        Intrinsics.checkNotNullParameter(yqv, "");
        return KWHzl(this.copydefault.copydefault(c56935yXu, yqv));
    }

    @Override // o.InterfaceC59101zag
    public InterfaceC56663yNs EZpvd(@NotNull C56935yXu c56935yXu, @NotNull yQV yqv) {
        Intrinsics.checkNotNullParameter(c56935yXu, "");
        Intrinsics.checkNotNullParameter(yqv, "");
        InterfaceC56663yNs interfaceC56663yNsEZpvd = this.copydefault.EZpvd(c56935yXu, yqv);
        if (interfaceC56663yNsEZpvd != null) {
            return (InterfaceC56663yNs) OLrzqt(interfaceC56663yNsEZpvd);
        }
        return null;
    }

    @Override // o.InterfaceC59098zad, o.InterfaceC59101zag
    public java.util.Collection<? extends InterfaceC56687yOp> AEQbTJ(@NotNull C56935yXu c56935yXu, @NotNull yQV yqv) {
        Intrinsics.checkNotNullParameter(c56935yXu, "");
        Intrinsics.checkNotNullParameter(yqv, "");
        return KWHzl(this.copydefault.AEQbTJ(c56935yXu, yqv));
    }

    @Override // o.InterfaceC59101zag
    public java.util.Collection<InterfaceC56665yNu> copydefault(@NotNull yZU yzu, @NotNull Function1<? super C56935yXu, java.lang.Boolean> function1) {
        Intrinsics.checkNotNullParameter(yzu, "");
        Intrinsics.checkNotNullParameter(function1, "");
        return KWHzl();
    }

    @Override // o.InterfaceC59098zad
    public java.util.Set<C56935yXu> AEQbTJ() {
        return this.copydefault.AEQbTJ();
    }

    @Override // o.InterfaceC59098zad
    public java.util.Set<C56935yXu> bP_() {
        return this.copydefault.bP_();
    }

    @Override // o.InterfaceC59098zad
    public java.util.Set<C56935yXu> EZpvd() {
        return this.copydefault.EZpvd();
    }
}
