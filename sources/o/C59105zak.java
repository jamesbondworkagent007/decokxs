package o;

import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.zak, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C59105zak extends AbstractC59100zaf {
    public static final /* synthetic */ yJA<java.lang.Object>[] AEQbTJ = {C56524yIo.copydefault(new PropertyReference1Impl(C59105zak.class, "functions", "getFunctions()Ljava/util/List;", 0)), C56524yIo.copydefault(new PropertyReference1Impl(C59105zak.class, "properties", "getProperties()Ljava/util/List;", 0))};
    public final InterfaceC59182zcH EZpvd;
    public final InterfaceC56658yNn KWHzl;
    public final boolean OLrzqt;
    public final InterfaceC59182zcH copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.Void KWHzl(@NotNull C56935yXu c56935yXu, @NotNull yQV yqv) {
        Intrinsics.checkNotNullParameter(c56935yXu, "");
        Intrinsics.checkNotNullParameter(yqv, "");
        return null;
    }

    @Override // o.AbstractC59100zaf, o.InterfaceC59101zag
    public /* synthetic */ InterfaceC56663yNs EZpvd(C56935yXu c56935yXu, yQV yqv) {
        return (InterfaceC56663yNs) KWHzl(c56935yXu, yqv);
    }

    @Override // o.AbstractC59100zaf, o.InterfaceC59101zag
    public /* synthetic */ java.util.Collection copydefault(yZU yzu, Function1 function1) {
        return EZpvd(yzu, (Function1<? super C56935yXu, java.lang.Boolean>) function1);
    }

    public C59105zak(@NotNull InterfaceC59187zcM interfaceC59187zcM, @NotNull InterfaceC56658yNn interfaceC56658yNn, boolean z) {
        Intrinsics.checkNotNullParameter(interfaceC59187zcM, "");
        Intrinsics.checkNotNullParameter(interfaceC56658yNn, "");
        this.KWHzl = interfaceC56658yNn;
        this.OLrzqt = z;
        interfaceC56658yNn.DbNXlk();
        ClassKind classKind = ClassKind.ENUM_CLASS;
        this.EZpvd = interfaceC59187zcM.KWHzl(new C59104zaj(this));
        this.copydefault = interfaceC59187zcM.KWHzl(new C59103zai(this));
    }

    public final java.util.List<InterfaceC56687yOp> KWHzl() {
        return (java.util.List) C59183zcI.AEQbTJ(this.EZpvd, this, AEQbTJ[0]);
    }

    public static final java.util.List KWHzl(C59105zak c59105zak) {
        return yDY.gEmmrt(yYI.EZpvd(c59105zak.KWHzl), yYI.AEQbTJ(c59105zak.KWHzl));
    }

    public final java.util.List<InterfaceC56676yOe> OLrzqt() {
        return (java.util.List) C59183zcI.AEQbTJ(this.copydefault, this, AEQbTJ[1]);
    }

    public static final java.util.List AEQbTJ(C59105zak c59105zak) {
        if (c59105zak.OLrzqt) {
            return yDY.OLrzqt(yYI.OLrzqt(c59105zak.KWHzl));
        }
        return yDY.AhwBna();
    }

    public java.util.List<CallableMemberDescriptor> EZpvd(@NotNull yZU yzu, @NotNull Function1<? super C56935yXu, java.lang.Boolean> function1) {
        Intrinsics.checkNotNullParameter(yzu, "");
        Intrinsics.checkNotNullParameter(function1, "");
        return CollectionsKt___CollectionsKt.djBIcL((java.util.Collection) KWHzl(), (java.lang.Iterable) OLrzqt());
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Lo/yXu;Lo/yQV;)Ljava/util/Collection; */
    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: o.zgA<o.yOp> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractC59100zaf, o.InterfaceC59098zad, o.InterfaceC59101zag
    /* JADX INFO: renamed from: AhwBna, reason: merged with bridge method [inline-methods] */
    public C59387zgA<InterfaceC56687yOp> AEQbTJ(@NotNull C56935yXu c56935yXu, @NotNull yQV yqv) {
        Intrinsics.checkNotNullParameter(c56935yXu, "");
        Intrinsics.checkNotNullParameter(yqv, "");
        java.util.List<InterfaceC56687yOp> listKWHzl = KWHzl();
        C59387zgA<InterfaceC56687yOp> c59387zgA = new C59387zgA<>();
        for (java.lang.Object obj : listKWHzl) {
            if (Intrinsics.EZpvd(((InterfaceC56687yOp) obj).bR_(), c56935yXu)) {
                c59387zgA.add(obj);
            }
        }
        return c59387zgA;
    }

    @Override // o.AbstractC59100zaf, o.InterfaceC59098zad
    public java.util.Collection<InterfaceC56676yOe> copydefault(@NotNull C56935yXu c56935yXu, @NotNull yQV yqv) {
        Intrinsics.checkNotNullParameter(c56935yXu, "");
        Intrinsics.checkNotNullParameter(yqv, "");
        java.util.List<InterfaceC56676yOe> listOLrzqt = OLrzqt();
        C59387zgA c59387zgA = new C59387zgA();
        for (java.lang.Object obj : listOLrzqt) {
            if (Intrinsics.EZpvd(((InterfaceC56676yOe) obj).bR_(), c56935yXu)) {
                c59387zgA.add(obj);
            }
        }
        return c59387zgA;
    }
}
