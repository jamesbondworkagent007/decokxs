package o;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil;
import o.InterfaceC59101zag;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.zaa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public abstract class AbstractC59095zaa extends AbstractC59100zaf {
    public static final /* synthetic */ yJA<java.lang.Object>[] OLrzqt = {C56524yIo.copydefault(new PropertyReference1Impl(AbstractC59095zaa.class, "allDescriptors", "getAllDescriptors()Ljava/util/List;", 0))};
    public final InterfaceC56658yNn EZpvd;
    public final InterfaceC59182zcH KWHzl;

    public abstract java.util.List<yNG> copydefault();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InterfaceC56658yNn djBIcL() {
        return this.EZpvd;
    }

    public AbstractC59095zaa(@NotNull InterfaceC59187zcM interfaceC59187zcM, @NotNull InterfaceC56658yNn interfaceC56658yNn) {
        Intrinsics.checkNotNullParameter(interfaceC59187zcM, "");
        Intrinsics.checkNotNullParameter(interfaceC56658yNn, "");
        this.EZpvd = interfaceC56658yNn;
        this.KWHzl = interfaceC59187zcM.KWHzl(new yZY(this));
    }

    public final java.util.List<InterfaceC56665yNu> OLrzqt() {
        return (java.util.List) C59183zcI.AEQbTJ(this.KWHzl, this, OLrzqt[0]);
    }

    public static final java.util.List OLrzqt(AbstractC59095zaa abstractC59095zaa) {
        java.util.List<yNG> listCopydefault = abstractC59095zaa.copydefault();
        return CollectionsKt___CollectionsKt.djBIcL((java.util.Collection) listCopydefault, (java.lang.Iterable) abstractC59095zaa.KWHzl(listCopydefault));
    }

    @Override // o.AbstractC59100zaf, o.InterfaceC59101zag
    public java.util.Collection<InterfaceC56665yNu> copydefault(@NotNull yZU yzu, @NotNull Function1<? super C56935yXu, java.lang.Boolean> function1) {
        Intrinsics.checkNotNullParameter(yzu, "");
        Intrinsics.checkNotNullParameter(function1, "");
        return !yzu.EZpvd(yZU.OLrzqt.isConnected()) ? yDY.AhwBna() : OLrzqt();
    }

    @Override // o.AbstractC59100zaf, o.InterfaceC59098zad, o.InterfaceC59101zag
    public java.util.Collection<InterfaceC56687yOp> AEQbTJ(@NotNull C56935yXu c56935yXu, @NotNull yQV yqv) {
        Intrinsics.checkNotNullParameter(c56935yXu, "");
        Intrinsics.checkNotNullParameter(yqv, "");
        java.util.List<InterfaceC56665yNu> listOLrzqt = OLrzqt();
        if (listOLrzqt.isEmpty()) {
            return yDY.AhwBna();
        }
        C59387zgA c59387zgA = new C59387zgA();
        for (java.lang.Object obj : listOLrzqt) {
            if ((obj instanceof InterfaceC56687yOp) && Intrinsics.EZpvd(((InterfaceC56687yOp) obj).bR_(), c56935yXu)) {
                c59387zgA.add(obj);
            }
        }
        return c59387zgA;
    }

    @Override // o.AbstractC59100zaf, o.InterfaceC59098zad
    public java.util.Collection<InterfaceC56676yOe> copydefault(@NotNull C56935yXu c56935yXu, @NotNull yQV yqv) {
        Intrinsics.checkNotNullParameter(c56935yXu, "");
        Intrinsics.checkNotNullParameter(yqv, "");
        java.util.List<InterfaceC56665yNu> listOLrzqt = OLrzqt();
        if (listOLrzqt.isEmpty()) {
            return yDY.AhwBna();
        }
        C59387zgA c59387zgA = new C59387zgA();
        for (java.lang.Object obj : listOLrzqt) {
            if ((obj instanceof InterfaceC56676yOe) && Intrinsics.EZpvd(((InterfaceC56676yOe) obj).bR_(), c56935yXu)) {
                c59387zgA.add(obj);
            }
        }
        return c59387zgA;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r9v2, resolved type: ? extends kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor */
    /* JADX WARN: Multi-variable type inference failed */
    public final java.util.List<InterfaceC56665yNu> KWHzl(java.util.List<? extends yNG> list) {
        java.util.Collection<? extends CallableMemberDescriptor> collectionAhwBna;
        java.util.ArrayList arrayList = new java.util.ArrayList(3);
        java.util.Collection<AbstractC59233zdF> collectionBV_ = this.EZpvd.fJNWhG().bV_();
        Intrinsics.checkNotNullExpressionValue(collectionBV_, "");
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.Iterator<T> it = collectionBV_.iterator();
        while (it.hasNext()) {
            C56406yEe.KWHzl(arrayList2, InterfaceC59101zag.Application.getContributedDescriptors$default(((AbstractC59233zdF) it.next()).OLrzqt(), null, null, 3, null));
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        for (java.lang.Object obj : arrayList2) {
            if (obj instanceof CallableMemberDescriptor) {
                arrayList3.add(obj);
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (java.lang.Object obj2 : arrayList3) {
            C56935yXu c56935yXuBR_ = ((CallableMemberDescriptor) obj2).bR_();
            java.lang.Object arrayList4 = linkedHashMap.get(c56935yXuBR_);
            if (arrayList4 == null) {
                arrayList4 = new java.util.ArrayList();
                linkedHashMap.put(c56935yXuBR_, arrayList4);
            }
            ((java.util.List) arrayList4).add(obj2);
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            java.lang.Object key = entry.getKey();
            Intrinsics.checkNotNullExpressionValue(key, "");
            C56935yXu c56935yXu = (C56935yXu) key;
            java.util.List list2 = (java.util.List) entry.getValue();
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (java.lang.Object obj3 : list2) {
                java.lang.Boolean boolValueOf = java.lang.Boolean.valueOf(((CallableMemberDescriptor) obj3) instanceof yNG);
                java.lang.Object arrayList5 = linkedHashMap2.get(boolValueOf);
                if (arrayList5 == null) {
                    arrayList5 = new java.util.ArrayList();
                    linkedHashMap2.put(boolValueOf, arrayList5);
                }
                ((java.util.List) arrayList5).add(obj3);
            }
            for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
                boolean zBooleanValue = ((java.lang.Boolean) entry2.getKey()).booleanValue();
                java.util.List list3 = (java.util.List) entry2.getValue();
                OverridingUtil overridingUtil = OverridingUtil.OLrzqt;
                if (!zBooleanValue) {
                    collectionAhwBna = yDY.AhwBna();
                } else {
                    collectionAhwBna = new java.util.ArrayList<>();
                    for (java.lang.Object obj4 : list) {
                        if (Intrinsics.EZpvd(((yNG) obj4).bR_(), c56935yXu)) {
                            collectionAhwBna.add(obj4);
                        }
                    }
                }
                overridingUtil.OLrzqt(c56935yXu, list3, collectionAhwBna, this.EZpvd, new Activity(arrayList, this));
            }
        }
        return C59433zgu.OLrzqt(arrayList);
    }

    /* JADX INFO: renamed from: o.zaa$Activity */
    public static final class Activity extends yYG {
        public final /* synthetic */ AbstractC59095zaa EZpvd;
        public final /* synthetic */ java.util.ArrayList<InterfaceC56665yNu> KWHzl;

        public Activity(java.util.ArrayList<InterfaceC56665yNu> arrayList, AbstractC59095zaa abstractC59095zaa) {
            this.KWHzl = arrayList;
            this.EZpvd = abstractC59095zaa;
        }

        @Override // o.yYO
        public void KWHzl(CallableMemberDescriptor callableMemberDescriptor) {
            Intrinsics.checkNotNullParameter(callableMemberDescriptor, "");
            OverridingUtil.AEQbTJ(callableMemberDescriptor, (Function1<CallableMemberDescriptor, Unit>) null);
            this.KWHzl.add(callableMemberDescriptor);
        }

        @Override // o.yYG
        public void OLrzqt(CallableMemberDescriptor callableMemberDescriptor, CallableMemberDescriptor callableMemberDescriptor2) {
            Intrinsics.checkNotNullParameter(callableMemberDescriptor, "");
            Intrinsics.checkNotNullParameter(callableMemberDescriptor2, "");
            throw new java.lang.IllegalStateException(("Conflict in scope of " + this.EZpvd.djBIcL() + ": " + callableMemberDescriptor + " vs " + callableMemberDescriptor2).toString());
        }
    }
}
