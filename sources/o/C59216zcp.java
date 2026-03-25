package o;

import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import o.yWX;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.zcp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C59216zcp extends AbstractC59147zbZ {
    public final java.lang.String AEQbTJ;
    public final yNW KWHzl;
    public final C56933yXs copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC59147zbZ
    public void copydefault(@NotNull java.util.Collection<InterfaceC56665yNu> collection, @NotNull Function1<? super C56935yXu, java.lang.Boolean> function1) {
        Intrinsics.checkNotNullParameter(collection, "");
        Intrinsics.checkNotNullParameter(function1, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return this.AEQbTJ;
    }

    @Override // o.AbstractC59100zaf, o.InterfaceC59101zag
    public /* synthetic */ java.util.Collection copydefault(yZU yzu, Function1 function1) {
        return EZpvd(yzu, (Function1<? super C56935yXu, java.lang.Boolean>) function1);
    }

    public C59216zcp(@NotNull yNW ynw, @NotNull ProtoBuf.Package r18, @NotNull yWS yws, @NotNull yWQ ywq, InterfaceC59145zbX interfaceC59145zbX, @NotNull C59083zaO c59083zaO, @NotNull java.lang.String str, @NotNull Function0<? extends java.util.Collection<C56935yXu>> function0) {
        Intrinsics.checkNotNullParameter(ynw, "");
        Intrinsics.checkNotNullParameter(r18, "");
        Intrinsics.checkNotNullParameter(yws, "");
        Intrinsics.checkNotNullParameter(ywq, "");
        Intrinsics.checkNotNullParameter(c59083zaO, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(function0, "");
        ProtoBuf.TypeTable typeTable = r18.getTypeTable();
        Intrinsics.checkNotNullExpressionValue(typeTable, "");
        yWW yww = new yWW(typeTable);
        yWX.StateListAnimator stateListAnimator = yWX.EZpvd;
        ProtoBuf.VersionRequirementTable versionRequirementTable = r18.getVersionRequirementTable();
        Intrinsics.checkNotNullExpressionValue(versionRequirementTable, "");
        C59087zaS c59087zaSOLrzqt = c59083zaO.OLrzqt(ynw, yws, yww, stateListAnimator.EZpvd(versionRequirementTable), ywq, interfaceC59145zbX);
        java.util.List<ProtoBuf.Function> functionList = r18.getFunctionList();
        Intrinsics.checkNotNullExpressionValue(functionList, "");
        java.util.List<ProtoBuf.Property> propertyList = r18.getPropertyList();
        Intrinsics.checkNotNullExpressionValue(propertyList, "");
        java.util.List<ProtoBuf.TypeAlias> typeAliasList = r18.getTypeAliasList();
        Intrinsics.checkNotNullExpressionValue(typeAliasList, "");
        super(c59087zaSOLrzqt, functionList, propertyList, typeAliasList, function0);
        this.KWHzl = ynw;
        this.AEQbTJ = str;
        this.copydefault = ynw.KWHzl();
    }

    public java.util.List<InterfaceC56665yNu> EZpvd(@NotNull yZU yzu, @NotNull Function1<? super C56935yXu, java.lang.Boolean> function1) {
        Intrinsics.checkNotNullParameter(yzu, "");
        Intrinsics.checkNotNullParameter(function1, "");
        java.util.Collection<InterfaceC56665yNu> collectionEZpvd = EZpvd(yzu, function1, NoLookupLocation.WHEN_GET_ALL_DESCRIPTORS);
        java.lang.Iterable<yOY> iterableAYXKKw = valueOf().EZpvd().AYXKKw();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<yOY> it = iterableAYXKKw.iterator();
        while (it.hasNext()) {
            C56406yEe.KWHzl(arrayList, it.next().AEQbTJ(this.copydefault));
        }
        return CollectionsKt___CollectionsKt.djBIcL((java.util.Collection) collectionEZpvd, (java.lang.Iterable) arrayList);
    }

    @Override // o.AbstractC59147zbZ
    public boolean copydefault(@NotNull C56935yXu c56935yXu) {
        Intrinsics.checkNotNullParameter(c56935yXu, "");
        if (!super.copydefault(c56935yXu)) {
            java.lang.Iterable<yOY> iterableAYXKKw = valueOf().EZpvd().AYXKKw();
            if (!(iterableAYXKKw instanceof java.util.Collection) || !((java.util.Collection) iterableAYXKKw).isEmpty()) {
                java.util.Iterator<yOY> it = iterableAYXKKw.iterator();
                while (it.hasNext()) {
                    if (it.next().KWHzl(this.copydefault, c56935yXu)) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // o.AbstractC59147zbZ
    public C56929yXo EZpvd(@NotNull C56935yXu c56935yXu) {
        Intrinsics.checkNotNullParameter(c56935yXu, "");
        return new C56929yXo(this.copydefault, c56935yXu);
    }

    @Override // o.AbstractC59147zbZ, o.AbstractC59100zaf, o.InterfaceC59101zag
    public InterfaceC56663yNs EZpvd(@NotNull C56935yXu c56935yXu, @NotNull yQV yqv) {
        Intrinsics.checkNotNullParameter(c56935yXu, "");
        Intrinsics.checkNotNullParameter(yqv, "");
        OLrzqt(c56935yXu, yqv);
        return super.EZpvd(c56935yXu, yqv);
    }

    @Override // o.AbstractC59100zaf, o.InterfaceC59101zag
    public void OLrzqt(@NotNull C56935yXu c56935yXu, @NotNull yQV yqv) {
        Intrinsics.checkNotNullParameter(c56935yXu, "");
        Intrinsics.checkNotNullParameter(yqv, "");
        yQU.KWHzl(valueOf().EZpvd().isConnected(), yqv, this.KWHzl, c56935yXu);
    }

    @Override // o.AbstractC59147zbZ
    public java.util.Set<C56935yXu> AhwBna() {
        return yEE.copydefault();
    }

    @Override // o.AbstractC59147zbZ
    public java.util.Set<C56935yXu> djBIcL() {
        return yEE.copydefault();
    }

    @Override // o.AbstractC59147zbZ
    public java.util.Set<C56935yXu> KWHzl() {
        return yEE.copydefault();
    }
}
