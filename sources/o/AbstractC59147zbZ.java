package o;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import o.yYJ;
import o.yZU;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.zbZ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public abstract class AbstractC59147zbZ extends AbstractC59100zaf {
    public static final /* synthetic */ yJA<java.lang.Object>[] EZpvd = {C56524yIo.copydefault(new PropertyReference1Impl(AbstractC59147zbZ.class, "classNames", "getClassNames$deserialization()Ljava/util/Set;", 0)), C56524yIo.copydefault(new PropertyReference1Impl(AbstractC59147zbZ.class, "classifierNamesLazy", "getClassifierNamesLazy()Ljava/util/Set;", 0))};
    public final C59087zaS AYXKKw;
    public final InterfaceC59180zcF AhwBna;
    public final InterfaceC59182zcH gEmmrt;
    public final StateListAnimator valueOf;

    /* JADX INFO: renamed from: o.zbZ$StateListAnimator */
    public interface StateListAnimator {
        java.util.Collection<InterfaceC56687yOp> AEQbTJ(@NotNull C56935yXu c56935yXu, @NotNull yQV yqv);

        java.util.Collection<InterfaceC56676yOe> EZpvd(@NotNull C56935yXu c56935yXu, @NotNull yQV yqv);

        java.util.Set<C56935yXu> EZpvd();

        java.util.Set<C56935yXu> KWHzl();

        InterfaceC56690yOs KWHzl(@NotNull C56935yXu c56935yXu);

        void OLrzqt(@NotNull java.util.Collection<InterfaceC56665yNu> collection, @NotNull yZU yzu, @NotNull Function1<? super C56935yXu, java.lang.Boolean> function1, @NotNull yQV yqv);

        java.util.Set<C56935yXu> copydefault();
    }

    public abstract java.util.Set<C56935yXu> AhwBna();

    public abstract C56929yXo EZpvd(@NotNull C56935yXu c56935yXu);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void EZpvd(@NotNull C56935yXu c56935yXu, @NotNull java.util.List<InterfaceC56687yOp> list) {
        Intrinsics.checkNotNullParameter(c56935yXu, "");
        Intrinsics.checkNotNullParameter(list, "");
    }

    public abstract java.util.Set<C56935yXu> KWHzl();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void KWHzl(@NotNull C56935yXu c56935yXu, @NotNull java.util.List<InterfaceC56676yOe> list) {
        Intrinsics.checkNotNullParameter(c56935yXu, "");
        Intrinsics.checkNotNullParameter(list, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean OLrzqt(@NotNull InterfaceC56687yOp interfaceC56687yOp) {
        Intrinsics.checkNotNullParameter(interfaceC56687yOp, "");
        return true;
    }

    public abstract void copydefault(@NotNull java.util.Collection<InterfaceC56665yNu> collection, @NotNull Function1<? super C56935yXu, java.lang.Boolean> function1);

    public abstract java.util.Set<C56935yXu> djBIcL();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C59087zaS valueOf() {
        return this.AYXKKw;
    }

    public AbstractC59147zbZ(@NotNull C59087zaS c59087zaS, @NotNull java.util.List<ProtoBuf.Function> list, @NotNull java.util.List<ProtoBuf.Property> list2, @NotNull java.util.List<ProtoBuf.TypeAlias> list3, @NotNull Function0<? extends java.util.Collection<C56935yXu>> function0) {
        Intrinsics.checkNotNullParameter(c59087zaS, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(list3, "");
        Intrinsics.checkNotNullParameter(function0, "");
        this.AYXKKw = c59087zaS;
        this.valueOf = EZpvd(list, list2, list3);
        this.gEmmrt = c59087zaS.valueOf().KWHzl(new C59203zcc(function0));
        this.AhwBna = c59087zaS.valueOf().copydefault(new C59204zcd(this));
    }

    public static final java.util.Set KWHzl(Function0 function0) {
        return CollectionsKt___CollectionsKt.OqFWZa((java.lang.Iterable) function0.invoke());
    }

    public final java.util.Set<C56935yXu> AYXKKw() {
        return (java.util.Set) C59183zcI.AEQbTJ(this.gEmmrt, this, EZpvd[0]);
    }

    public final java.util.Set<C56935yXu> gEmmrt() {
        return (java.util.Set) C59183zcI.EZpvd(this.AhwBna, this, EZpvd[1]);
    }

    public static final java.util.Set OLrzqt(AbstractC59147zbZ abstractC59147zbZ) {
        java.util.Set<C56935yXu> setKWHzl = abstractC59147zbZ.KWHzl();
        if (setKWHzl == null) {
            return null;
        }
        return yEJ.KWHzl(yEJ.KWHzl(abstractC59147zbZ.AYXKKw(), abstractC59147zbZ.valueOf.copydefault()), setKWHzl);
    }

    @Override // o.AbstractC59100zaf, o.InterfaceC59098zad
    public java.util.Set<C56935yXu> AEQbTJ() {
        return this.valueOf.KWHzl();
    }

    @Override // o.AbstractC59100zaf, o.InterfaceC59098zad
    public java.util.Set<C56935yXu> bP_() {
        return this.valueOf.EZpvd();
    }

    @Override // o.AbstractC59100zaf, o.InterfaceC59098zad
    public java.util.Set<C56935yXu> EZpvd() {
        return gEmmrt();
    }

    @Override // o.AbstractC59100zaf, o.InterfaceC59098zad, o.InterfaceC59101zag
    public java.util.Collection<InterfaceC56687yOp> AEQbTJ(@NotNull C56935yXu c56935yXu, @NotNull yQV yqv) {
        Intrinsics.checkNotNullParameter(c56935yXu, "");
        Intrinsics.checkNotNullParameter(yqv, "");
        return this.valueOf.AEQbTJ(c56935yXu, yqv);
    }

    public final InterfaceC56690yOs AEQbTJ(C56935yXu c56935yXu) {
        return this.valueOf.KWHzl(c56935yXu);
    }

    @Override // o.AbstractC59100zaf, o.InterfaceC59098zad
    public java.util.Collection<InterfaceC56676yOe> copydefault(@NotNull C56935yXu c56935yXu, @NotNull yQV yqv) {
        Intrinsics.checkNotNullParameter(c56935yXu, "");
        Intrinsics.checkNotNullParameter(yqv, "");
        return this.valueOf.EZpvd(c56935yXu, yqv);
    }

    public final java.util.Collection<InterfaceC56665yNu> EZpvd(@NotNull yZU yzu, @NotNull Function1<? super C56935yXu, java.lang.Boolean> function1, @NotNull yQV yqv) {
        Intrinsics.checkNotNullParameter(yzu, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(yqv, "");
        java.util.ArrayList arrayList = new java.util.ArrayList(0);
        yZU.Application application = yZU.AYXKKw;
        if (yzu.EZpvd(application.AYXKKw())) {
            copydefault(arrayList, function1);
        }
        this.valueOf.OLrzqt(arrayList, yzu, function1, yqv);
        if (yzu.EZpvd(application.OLrzqt())) {
            for (C56935yXu c56935yXu : AYXKKw()) {
                if (function1.invoke(c56935yXu).booleanValue()) {
                    C59433zgu.EZpvd(arrayList, KWHzl(c56935yXu));
                }
            }
        }
        if (yzu.EZpvd(yZU.AYXKKw.valueOf())) {
            for (C56935yXu c56935yXu2 : this.valueOf.copydefault()) {
                if (function1.invoke(c56935yXu2).booleanValue()) {
                    C59433zgu.EZpvd(arrayList, this.valueOf.KWHzl(c56935yXu2));
                }
            }
        }
        return C59433zgu.OLrzqt(arrayList);
    }

    @Override // o.AbstractC59100zaf, o.InterfaceC59101zag
    public InterfaceC56663yNs EZpvd(@NotNull C56935yXu c56935yXu, @NotNull yQV yqv) {
        Intrinsics.checkNotNullParameter(c56935yXu, "");
        Intrinsics.checkNotNullParameter(yqv, "");
        if (copydefault(c56935yXu)) {
            return KWHzl(c56935yXu);
        }
        if (this.valueOf.copydefault().contains(c56935yXu)) {
            return AEQbTJ(c56935yXu);
        }
        return null;
    }

    public final InterfaceC56658yNn KWHzl(C56935yXu c56935yXu) {
        return this.AYXKKw.EZpvd().KWHzl(EZpvd(c56935yXu));
    }

    public boolean copydefault(@NotNull C56935yXu c56935yXu) {
        Intrinsics.checkNotNullParameter(c56935yXu, "");
        return AYXKKw().contains(c56935yXu);
    }

    public final StateListAnimator EZpvd(java.util.List<ProtoBuf.Function> list, java.util.List<ProtoBuf.Property> list2, java.util.List<ProtoBuf.TypeAlias> list3) {
        if (this.AYXKKw.EZpvd().OLrzqt().EZpvd()) {
            return new Application(this, list, list2, list3);
        }
        return new ActionBar(this, list, list2, list3);
    }

    /* JADX INFO: renamed from: o.zbZ$ActionBar */
    public final class ActionBar implements StateListAnimator {
        public static final /* synthetic */ yJA<java.lang.Object>[] EZpvd = {C56524yIo.copydefault(new PropertyReference1Impl(ActionBar.class, "functionNames", "getFunctionNames()Ljava/util/Set;", 0)), C56524yIo.copydefault(new PropertyReference1Impl(ActionBar.class, "variableNames", "getVariableNames()Ljava/util/Set;", 0))};
        public final InterfaceC59182zcH AEQbTJ;
        public final java.util.Map<C56935yXu, byte[]> AYXKKw;
        public final InterfaceC59179zcE<C56935yXu, InterfaceC56690yOs> AhwBna;
        public final InterfaceC59181zcG<C56935yXu, java.util.Collection<InterfaceC56676yOe>> KWHzl;
        public final java.util.Map<C56935yXu, byte[]> OLrzqt;
        public final InterfaceC59181zcG<C56935yXu, java.util.Collection<InterfaceC56687yOp>> copydefault;
        public final InterfaceC59182zcH djBIcL;
        public final /* synthetic */ AbstractC59147zbZ gEmmrt;
        public final java.util.Map<C56935yXu, byte[]> valueOf;

        public ActionBar(@NotNull AbstractC59147zbZ abstractC59147zbZ, @NotNull java.util.List<ProtoBuf.Function> list, @NotNull java.util.List<ProtoBuf.Property> list2, java.util.List<ProtoBuf.TypeAlias> list3) throws java.io.IOException {
            java.util.Map<C56935yXu, byte[]> mapKWHzl;
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(list2, "");
            Intrinsics.checkNotNullParameter(list3, "");
            this.gEmmrt = abstractC59147zbZ;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (java.lang.Object obj : list) {
                C56935yXu c56935yXuOLrzqt = C59160zbm.OLrzqt(abstractC59147zbZ.valueOf().copydefault(), ((ProtoBuf.Function) ((yXQ) obj)).getName());
                java.lang.Object arrayList = linkedHashMap.get(c56935yXuOLrzqt);
                if (arrayList == null) {
                    arrayList = new java.util.ArrayList();
                    linkedHashMap.put(c56935yXuOLrzqt, arrayList);
                }
                ((java.util.List) arrayList).add(obj);
            }
            this.OLrzqt = OLrzqt(linkedHashMap);
            AbstractC59147zbZ abstractC59147zbZ2 = this.gEmmrt;
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (java.lang.Object obj2 : list2) {
                C56935yXu c56935yXuOLrzqt2 = C59160zbm.OLrzqt(abstractC59147zbZ2.valueOf().copydefault(), ((ProtoBuf.Property) ((yXQ) obj2)).getName());
                java.lang.Object arrayList2 = linkedHashMap2.get(c56935yXuOLrzqt2);
                if (arrayList2 == null) {
                    arrayList2 = new java.util.ArrayList();
                    linkedHashMap2.put(c56935yXuOLrzqt2, arrayList2);
                }
                ((java.util.List) arrayList2).add(obj2);
            }
            this.AYXKKw = OLrzqt(linkedHashMap2);
            if (!this.gEmmrt.valueOf().EZpvd().OLrzqt().valueOf()) {
                mapKWHzl = C56424yEw.KWHzl();
            } else {
                AbstractC59147zbZ abstractC59147zbZ3 = this.gEmmrt;
                LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                for (java.lang.Object obj3 : list3) {
                    C56935yXu c56935yXuOLrzqt3 = C59160zbm.OLrzqt(abstractC59147zbZ3.valueOf().copydefault(), ((ProtoBuf.TypeAlias) ((yXQ) obj3)).getName());
                    java.lang.Object arrayList3 = linkedHashMap3.get(c56935yXuOLrzqt3);
                    if (arrayList3 == null) {
                        arrayList3 = new java.util.ArrayList();
                        linkedHashMap3.put(c56935yXuOLrzqt3, arrayList3);
                    }
                    ((java.util.List) arrayList3).add(obj3);
                }
                mapKWHzl = OLrzqt(linkedHashMap3);
            }
            this.valueOf = mapKWHzl;
            this.copydefault = this.gEmmrt.valueOf().valueOf().AEQbTJ(new C59210zcj(this));
            this.KWHzl = this.gEmmrt.valueOf().valueOf().AEQbTJ(new C59212zcl(this));
            this.AhwBna = this.gEmmrt.valueOf().valueOf().OLrzqt(new C59217zcq(this));
            this.AEQbTJ = this.gEmmrt.valueOf().valueOf().KWHzl(new C59215zco(this, this.gEmmrt));
            this.djBIcL = this.gEmmrt.valueOf().valueOf().KWHzl(new C59219zcs(this, this.gEmmrt));
        }

        public static final java.util.Collection EZpvd(ActionBar actionBar, C56935yXu c56935yXu) {
            Intrinsics.checkNotNullParameter(c56935yXu, "");
            return actionBar.AEQbTJ(c56935yXu);
        }

        public static final java.util.Collection copydefault(ActionBar actionBar, C56935yXu c56935yXu) {
            Intrinsics.checkNotNullParameter(c56935yXu, "");
            return actionBar.OLrzqt(c56935yXu);
        }

        public static final InterfaceC56690yOs valueOf(ActionBar actionBar, C56935yXu c56935yXu) {
            Intrinsics.checkNotNullParameter(c56935yXu, "");
            return actionBar.copydefault(c56935yXu);
        }

        @Override // o.AbstractC59147zbZ.StateListAnimator
        public java.util.Set<C56935yXu> KWHzl() {
            return (java.util.Set) C59183zcI.AEQbTJ(this.AEQbTJ, this, EZpvd[0]);
        }

        public static final java.util.Set KWHzl(ActionBar actionBar, AbstractC59147zbZ abstractC59147zbZ) {
            return yEJ.KWHzl(actionBar.OLrzqt.keySet(), abstractC59147zbZ.AhwBna());
        }

        @Override // o.AbstractC59147zbZ.StateListAnimator
        public java.util.Set<C56935yXu> EZpvd() {
            return (java.util.Set) C59183zcI.AEQbTJ(this.djBIcL, this, EZpvd[1]);
        }

        public static final java.util.Set EZpvd(ActionBar actionBar, AbstractC59147zbZ abstractC59147zbZ) {
            return yEJ.KWHzl(actionBar.AYXKKw.keySet(), abstractC59147zbZ.djBIcL());
        }

        @Override // o.AbstractC59147zbZ.StateListAnimator
        public java.util.Set<C56935yXu> copydefault() {
            return this.valueOf.keySet();
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x002a  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final java.util.Collection<InterfaceC56687yOp> AEQbTJ(C56935yXu c56935yXu) {
            java.util.List<ProtoBuf.Function> listAhwBna;
            java.util.Map<C56935yXu, byte[]> map = this.OLrzqt;
            yXV<ProtoBuf.Function> yxv = ProtoBuf.Function.PARSER;
            Intrinsics.checkNotNullExpressionValue(yxv, "");
            AbstractC59147zbZ abstractC59147zbZ = this.gEmmrt;
            byte[] bArr = map.get(c56935yXu);
            if (bArr != null) {
                listAhwBna = C59467zhb.zuBGHE(C59405zgS.AEQbTJ(new C1022ActionBar(yxv, new java.io.ByteArrayInputStream(bArr), this.gEmmrt)));
                if (listAhwBna == null) {
                    listAhwBna = yDY.AhwBna();
                }
            }
            java.util.ArrayList arrayList = new java.util.ArrayList(listAhwBna.size());
            for (ProtoBuf.Function function : listAhwBna) {
                C59149zbb c59149zbbOLrzqt = abstractC59147zbZ.valueOf().OLrzqt();
                Intrinsics.copydefault(function);
                InterfaceC56687yOp interfaceC56687yOpOLrzqt = c59149zbbOLrzqt.OLrzqt(function);
                if (!abstractC59147zbZ.OLrzqt(interfaceC56687yOpOLrzqt)) {
                    interfaceC56687yOpOLrzqt = null;
                }
                if (interfaceC56687yOpOLrzqt != null) {
                    arrayList.add(interfaceC56687yOpOLrzqt);
                }
            }
            abstractC59147zbZ.EZpvd(c56935yXu, arrayList);
            return C59433zgu.OLrzqt(arrayList);
        }

        /* JADX INFO: renamed from: o.zbZ$ActionBar$ActionBar, reason: collision with other inner class name */
        public static final class C1022ActionBar implements Function0<java.lang.Object> {
            public final /* synthetic */ yXV<java.lang.Object> EZpvd;
            public final /* synthetic */ AbstractC59147zbZ KWHzl;
            public final /* synthetic */ java.io.ByteArrayInputStream OLrzqt;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public C1022ActionBar(yXV<java.lang.Object> yxv, java.io.ByteArrayInputStream byteArrayInputStream, AbstractC59147zbZ abstractC59147zbZ) {
                this.EZpvd = yxv;
                this.OLrzqt = byteArrayInputStream;
                this.KWHzl = abstractC59147zbZ;
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
            public final java.lang.Object invoke() {
                return (yXQ) this.EZpvd.KWHzl(this.OLrzqt, this.KWHzl.valueOf().EZpvd().AhwBna());
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x002a  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final java.util.Collection<InterfaceC56676yOe> OLrzqt(C56935yXu c56935yXu) {
            java.util.List<ProtoBuf.Property> listAhwBna;
            java.util.Map<C56935yXu, byte[]> map = this.AYXKKw;
            yXV<ProtoBuf.Property> yxv = ProtoBuf.Property.PARSER;
            Intrinsics.checkNotNullExpressionValue(yxv, "");
            AbstractC59147zbZ abstractC59147zbZ = this.gEmmrt;
            byte[] bArr = map.get(c56935yXu);
            if (bArr != null) {
                listAhwBna = C59467zhb.zuBGHE(C59405zgS.AEQbTJ(new C1022ActionBar(yxv, new java.io.ByteArrayInputStream(bArr), this.gEmmrt)));
                if (listAhwBna == null) {
                    listAhwBna = yDY.AhwBna();
                }
            }
            java.util.ArrayList arrayList = new java.util.ArrayList(listAhwBna.size());
            for (ProtoBuf.Property property : listAhwBna) {
                C59149zbb c59149zbbOLrzqt = abstractC59147zbZ.valueOf().OLrzqt();
                Intrinsics.copydefault(property);
                InterfaceC56676yOe interfaceC56676yOeOLrzqt = c59149zbbOLrzqt.OLrzqt(property);
                if (interfaceC56676yOeOLrzqt != null) {
                    arrayList.add(interfaceC56676yOeOLrzqt);
                }
            }
            abstractC59147zbZ.KWHzl(c56935yXu, arrayList);
            return C59433zgu.OLrzqt(arrayList);
        }

        public final InterfaceC56690yOs copydefault(C56935yXu c56935yXu) {
            ProtoBuf.TypeAlias delimitedFrom;
            byte[] bArr = this.valueOf.get(c56935yXu);
            if (bArr == null || (delimitedFrom = ProtoBuf.TypeAlias.parseDelimitedFrom(new java.io.ByteArrayInputStream(bArr), this.gEmmrt.valueOf().EZpvd().AhwBna())) == null) {
                return null;
            }
            return this.gEmmrt.valueOf().OLrzqt().OLrzqt(delimitedFrom);
        }

        @Override // o.AbstractC59147zbZ.StateListAnimator
        public java.util.Collection<InterfaceC56687yOp> AEQbTJ(@NotNull C56935yXu c56935yXu, @NotNull yQV yqv) {
            Intrinsics.checkNotNullParameter(c56935yXu, "");
            Intrinsics.checkNotNullParameter(yqv, "");
            return !KWHzl().contains(c56935yXu) ? yDY.AhwBna() : this.copydefault.invoke(c56935yXu);
        }

        @Override // o.AbstractC59147zbZ.StateListAnimator
        public InterfaceC56690yOs KWHzl(@NotNull C56935yXu c56935yXu) {
            Intrinsics.checkNotNullParameter(c56935yXu, "");
            return this.AhwBna.invoke(c56935yXu);
        }

        @Override // o.AbstractC59147zbZ.StateListAnimator
        public java.util.Collection<InterfaceC56676yOe> EZpvd(@NotNull C56935yXu c56935yXu, @NotNull yQV yqv) {
            Intrinsics.checkNotNullParameter(c56935yXu, "");
            Intrinsics.checkNotNullParameter(yqv, "");
            return !EZpvd().contains(c56935yXu) ? yDY.AhwBna() : this.KWHzl.invoke(c56935yXu);
        }

        @Override // o.AbstractC59147zbZ.StateListAnimator
        public void OLrzqt(@NotNull java.util.Collection<InterfaceC56665yNu> collection, @NotNull yZU yzu, @NotNull Function1<? super C56935yXu, java.lang.Boolean> function1, @NotNull yQV yqv) {
            Intrinsics.checkNotNullParameter(collection, "");
            Intrinsics.checkNotNullParameter(yzu, "");
            Intrinsics.checkNotNullParameter(function1, "");
            Intrinsics.checkNotNullParameter(yqv, "");
            if (yzu.EZpvd(yZU.AYXKKw.AhwBna())) {
                java.util.Set<C56935yXu> setEZpvd = EZpvd();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                for (C56935yXu c56935yXu : setEZpvd) {
                    if (function1.invoke(c56935yXu).booleanValue()) {
                        arrayList.addAll(EZpvd(c56935yXu, yqv));
                    }
                }
                yYJ.ActionBar actionBar = yYJ.ActionBar.EZpvd;
                Intrinsics.checkNotNullExpressionValue(actionBar, "");
                C56407yEf.copydefault(arrayList, actionBar);
                collection.addAll(arrayList);
            }
            if (yzu.EZpvd(yZU.AYXKKw.EZpvd())) {
                java.util.Set<C56935yXu> setKWHzl = KWHzl();
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                for (C56935yXu c56935yXu2 : setKWHzl) {
                    if (function1.invoke(c56935yXu2).booleanValue()) {
                        arrayList2.addAll(AEQbTJ(c56935yXu2, yqv));
                    }
                }
                yYJ.ActionBar actionBar2 = yYJ.ActionBar.EZpvd;
                Intrinsics.checkNotNullExpressionValue(actionBar2, "");
                C56407yEf.copydefault(arrayList2, actionBar2);
                collection.addAll(arrayList2);
            }
        }

        public final java.util.Map<C56935yXu, byte[]> OLrzqt(java.util.Map<C56935yXu, ? extends java.util.Collection<? extends yXB>> map) throws java.io.IOException {
            LinkedHashMap linkedHashMap = new LinkedHashMap(C56423yEv.copydefault(map.size()));
            java.util.Iterator<T> it = map.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                java.lang.Object key = entry.getKey();
                java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
                java.lang.Iterable iterable = (java.lang.Iterable) entry.getValue();
                java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(iterable, 10));
                java.util.Iterator it2 = iterable.iterator();
                while (it2.hasNext()) {
                    ((yXB) it2.next()).writeDelimitedTo(byteArrayOutputStream);
                    arrayList.add(Unit.INSTANCE);
                }
                linkedHashMap.put(key, byteArrayOutputStream.toByteArray());
            }
            return linkedHashMap;
        }
    }

    /* JADX INFO: renamed from: o.zbZ$Application */
    public final class Application implements StateListAnimator {
        public static final /* synthetic */ yJA<java.lang.Object>[] AEQbTJ = {C56524yIo.copydefault(new PropertyReference1Impl(Application.class, "declaredFunctions", "getDeclaredFunctions()Ljava/util/List;", 0)), C56524yIo.copydefault(new PropertyReference1Impl(Application.class, "declaredProperties", "getDeclaredProperties()Ljava/util/List;", 0)), C56524yIo.copydefault(new PropertyReference1Impl(Application.class, "allTypeAliases", "getAllTypeAliases()Ljava/util/List;", 0)), C56524yIo.copydefault(new PropertyReference1Impl(Application.class, "allFunctions", "getAllFunctions()Ljava/util/List;", 0)), C56524yIo.copydefault(new PropertyReference1Impl(Application.class, "allProperties", "getAllProperties()Ljava/util/List;", 0)), C56524yIo.copydefault(new PropertyReference1Impl(Application.class, "typeAliasesByName", "getTypeAliasesByName()Ljava/util/Map;", 0)), C56524yIo.copydefault(new PropertyReference1Impl(Application.class, "functionsByName", "getFunctionsByName()Ljava/util/Map;", 0)), C56524yIo.copydefault(new PropertyReference1Impl(Application.class, "propertiesByName", "getPropertiesByName()Ljava/util/Map;", 0)), C56524yIo.copydefault(new PropertyReference1Impl(Application.class, "functionNames", "getFunctionNames()Ljava/util/Set;", 0)), C56524yIo.copydefault(new PropertyReference1Impl(Application.class, "variableNames", "getVariableNames()Ljava/util/Set;", 0))};
        public final InterfaceC59182zcH AYXKKw;
        public final java.util.List<ProtoBuf.Function> AhwBna;
        public final InterfaceC59182zcH AkhnZx;
        public final InterfaceC59182zcH DbNXlk;
        public final InterfaceC59182zcH EZpvd;
        public final InterfaceC59182zcH KWHzl;
        public final InterfaceC59182zcH OLrzqt;
        public final InterfaceC59182zcH copydefault;
        public final InterfaceC59182zcH djBIcL;
        public final /* synthetic */ AbstractC59147zbZ fetchVPNInfo;
        public final InterfaceC59182zcH gEmmrt;
        public final java.util.List<ProtoBuf.Property> isConnected;
        public final InterfaceC59182zcH valueOf;
        public final java.util.List<ProtoBuf.TypeAlias> values;

        public Application(@NotNull AbstractC59147zbZ abstractC59147zbZ, @NotNull java.util.List<ProtoBuf.Function> list, @NotNull java.util.List<ProtoBuf.Property> list2, java.util.List<ProtoBuf.TypeAlias> list3) {
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(list2, "");
            Intrinsics.checkNotNullParameter(list3, "");
            this.fetchVPNInfo = abstractC59147zbZ;
            this.AhwBna = list;
            this.isConnected = list2;
            this.values = abstractC59147zbZ.valueOf().EZpvd().OLrzqt().valueOf() ? list3 : yDY.AhwBna();
            this.OLrzqt = abstractC59147zbZ.valueOf().valueOf().KWHzl(new C59201zca(this));
            this.gEmmrt = abstractC59147zbZ.valueOf().valueOf().KWHzl(new C59202zcb(this));
            this.EZpvd = abstractC59147zbZ.valueOf().valueOf().KWHzl(new C59206zcf(this));
            this.copydefault = abstractC59147zbZ.valueOf().valueOf().KWHzl(new C59208zch(this));
            this.KWHzl = abstractC59147zbZ.valueOf().valueOf().KWHzl(new C59209zci(this));
            this.DbNXlk = abstractC59147zbZ.valueOf().valueOf().KWHzl(new C59205zce(this));
            this.djBIcL = abstractC59147zbZ.valueOf().valueOf().KWHzl(new C59207zcg(this));
            this.AYXKKw = abstractC59147zbZ.valueOf().valueOf().KWHzl(new C59214zcn(this));
            this.valueOf = abstractC59147zbZ.valueOf().valueOf().KWHzl(new C59213zcm(this, abstractC59147zbZ));
            this.AkhnZx = abstractC59147zbZ.valueOf().valueOf().KWHzl(new C59211zck(this, abstractC59147zbZ));
        }

        public static final java.util.List AkhnZx(Application application) {
            return application.AYXKKw();
        }

        public final java.util.List<InterfaceC56687yOp> values() {
            return (java.util.List) C59183zcI.AEQbTJ(this.OLrzqt, this, AEQbTJ[0]);
        }

        public static final java.util.List DbNXlk(Application application) {
            return application.gEmmrt();
        }

        public final java.util.List<InterfaceC56676yOe> DbNXlk() {
            return (java.util.List) C59183zcI.AEQbTJ(this.gEmmrt, this, AEQbTJ[1]);
        }

        public static final java.util.List fetchVPNInfo(Application application) {
            return application.AhwBna();
        }

        public final java.util.List<InterfaceC56690yOs> isConnected() {
            return (java.util.List) C59183zcI.AEQbTJ(this.EZpvd, this, AEQbTJ[2]);
        }

        public static final java.util.List djBIcL(Application application) {
            return CollectionsKt___CollectionsKt.djBIcL((java.util.Collection) application.values(), (java.lang.Iterable) application.OLrzqt());
        }

        public final java.util.List<InterfaceC56687yOp> valueOf() {
            return (java.util.List) C59183zcI.AEQbTJ(this.copydefault, this, AEQbTJ[3]);
        }

        public static final java.util.List valueOf(Application application) {
            return CollectionsKt___CollectionsKt.djBIcL((java.util.Collection) application.DbNXlk(), (java.lang.Iterable) application.AEQbTJ());
        }

        public final java.util.List<InterfaceC56676yOe> djBIcL() {
            return (java.util.List) C59183zcI.AEQbTJ(this.KWHzl, this, AEQbTJ[4]);
        }

        public static final java.util.Map ejfBZ(Application application) {
            java.util.List<InterfaceC56690yOs> listIsConnected = application.isConnected();
            LinkedHashMap linkedHashMap = new LinkedHashMap(C56548yJl.copydefault(C56423yEv.copydefault(C56403yEb.AYXKKw(listIsConnected, 10)), 16));
            for (java.lang.Object obj : listIsConnected) {
                C56935yXu c56935yXuBR_ = ((InterfaceC56690yOs) obj).bR_();
                Intrinsics.checkNotNullExpressionValue(c56935yXuBR_, "");
                linkedHashMap.put(c56935yXuBR_, obj);
            }
            return linkedHashMap;
        }

        public final java.util.Map<C56935yXu, InterfaceC56690yOs> ejfBZ() {
            return (java.util.Map) C59183zcI.AEQbTJ(this.DbNXlk, this, AEQbTJ[5]);
        }

        public static final java.util.Map values(Application application) {
            java.util.List<InterfaceC56687yOp> listValueOf = application.valueOf();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (java.lang.Object obj : listValueOf) {
                C56935yXu c56935yXuBR_ = ((InterfaceC56687yOp) obj).bR_();
                Intrinsics.checkNotNullExpressionValue(c56935yXuBR_, "");
                java.lang.Object arrayList = linkedHashMap.get(c56935yXuBR_);
                if (arrayList == null) {
                    arrayList = new java.util.ArrayList();
                    linkedHashMap.put(c56935yXuBR_, arrayList);
                }
                ((java.util.List) arrayList).add(obj);
            }
            return linkedHashMap;
        }

        public final java.util.Map<C56935yXu, java.util.Collection<InterfaceC56687yOp>> fetchVPNInfo() {
            return (java.util.Map) C59183zcI.AEQbTJ(this.djBIcL, this, AEQbTJ[6]);
        }

        public static final java.util.Map isConnected(Application application) {
            java.util.List<InterfaceC56676yOe> listDjBIcL = application.djBIcL();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (java.lang.Object obj : listDjBIcL) {
                C56935yXu c56935yXuBR_ = ((InterfaceC56676yOe) obj).bR_();
                Intrinsics.checkNotNullExpressionValue(c56935yXuBR_, "");
                java.lang.Object arrayList = linkedHashMap.get(c56935yXuBR_);
                if (arrayList == null) {
                    arrayList = new java.util.ArrayList();
                    linkedHashMap.put(c56935yXuBR_, arrayList);
                }
                ((java.util.List) arrayList).add(obj);
            }
            return linkedHashMap;
        }

        public final java.util.Map<C56935yXu, java.util.Collection<InterfaceC56676yOe>> AkhnZx() {
            return (java.util.Map) C59183zcI.AEQbTJ(this.AYXKKw, this, AEQbTJ[7]);
        }

        @Override // o.AbstractC59147zbZ.StateListAnimator
        public java.util.Set<C56935yXu> KWHzl() {
            return (java.util.Set) C59183zcI.AEQbTJ(this.valueOf, this, AEQbTJ[8]);
        }

        public static final java.util.Set KWHzl(Application application, AbstractC59147zbZ abstractC59147zbZ) {
            java.util.List<ProtoBuf.Function> list = application.AhwBna;
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            AbstractC59147zbZ abstractC59147zbZ2 = application.fetchVPNInfo;
            java.util.Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                linkedHashSet.add(C59160zbm.OLrzqt(abstractC59147zbZ2.valueOf().copydefault(), ((ProtoBuf.Function) ((yXQ) it.next())).getName()));
            }
            return yEJ.KWHzl(linkedHashSet, abstractC59147zbZ.AhwBna());
        }

        @Override // o.AbstractC59147zbZ.StateListAnimator
        public java.util.Set<C56935yXu> EZpvd() {
            return (java.util.Set) C59183zcI.AEQbTJ(this.AkhnZx, this, AEQbTJ[9]);
        }

        public static final java.util.Set EZpvd(Application application, AbstractC59147zbZ abstractC59147zbZ) {
            java.util.List<ProtoBuf.Property> list = application.isConnected;
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            AbstractC59147zbZ abstractC59147zbZ2 = application.fetchVPNInfo;
            java.util.Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                linkedHashSet.add(C59160zbm.OLrzqt(abstractC59147zbZ2.valueOf().copydefault(), ((ProtoBuf.Property) ((yXQ) it.next())).getName()));
            }
            return yEJ.KWHzl(linkedHashSet, abstractC59147zbZ.djBIcL());
        }

        public final java.util.List<InterfaceC56687yOp> OLrzqt() {
            java.util.Set<C56935yXu> setAhwBna = this.fetchVPNInfo.AhwBna();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.Iterator<T> it = setAhwBna.iterator();
            while (it.hasNext()) {
                C56406yEe.KWHzl(arrayList, AEQbTJ((C56935yXu) it.next()));
            }
            return arrayList;
        }

        public final java.util.List<InterfaceC56676yOe> AEQbTJ() {
            java.util.Set<C56935yXu> setDjBIcL = this.fetchVPNInfo.djBIcL();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.Iterator<T> it = setDjBIcL.iterator();
            while (it.hasNext()) {
                C56406yEe.KWHzl(arrayList, copydefault((C56935yXu) it.next()));
            }
            return arrayList;
        }

        public final java.util.List<InterfaceC56687yOp> AEQbTJ(C56935yXu c56935yXu) {
            java.util.List<InterfaceC56687yOp> listValues = values();
            AbstractC59147zbZ abstractC59147zbZ = this.fetchVPNInfo;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : listValues) {
                if (Intrinsics.EZpvd(((InterfaceC56665yNu) obj).bR_(), c56935yXu)) {
                    arrayList.add(obj);
                }
            }
            int size = arrayList.size();
            abstractC59147zbZ.EZpvd(c56935yXu, arrayList);
            return arrayList.subList(size, arrayList.size());
        }

        public final java.util.List<InterfaceC56676yOe> copydefault(C56935yXu c56935yXu) {
            java.util.List<InterfaceC56676yOe> listDbNXlk = DbNXlk();
            AbstractC59147zbZ abstractC59147zbZ = this.fetchVPNInfo;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : listDbNXlk) {
                if (Intrinsics.EZpvd(((InterfaceC56665yNu) obj).bR_(), c56935yXu)) {
                    arrayList.add(obj);
                }
            }
            int size = arrayList.size();
            abstractC59147zbZ.KWHzl(c56935yXu, arrayList);
            return arrayList.subList(size, arrayList.size());
        }

        @Override // o.AbstractC59147zbZ.StateListAnimator
        public java.util.Collection<InterfaceC56687yOp> AEQbTJ(@NotNull C56935yXu c56935yXu, @NotNull yQV yqv) {
            java.util.Collection<InterfaceC56687yOp> collection;
            Intrinsics.checkNotNullParameter(c56935yXu, "");
            Intrinsics.checkNotNullParameter(yqv, "");
            return (KWHzl().contains(c56935yXu) && (collection = fetchVPNInfo().get(c56935yXu)) != null) ? collection : yDY.AhwBna();
        }

        @Override // o.AbstractC59147zbZ.StateListAnimator
        public InterfaceC56690yOs KWHzl(@NotNull C56935yXu c56935yXu) {
            Intrinsics.checkNotNullParameter(c56935yXu, "");
            return ejfBZ().get(c56935yXu);
        }

        @Override // o.AbstractC59147zbZ.StateListAnimator
        public java.util.Collection<InterfaceC56676yOe> EZpvd(@NotNull C56935yXu c56935yXu, @NotNull yQV yqv) {
            java.util.Collection<InterfaceC56676yOe> collection;
            Intrinsics.checkNotNullParameter(c56935yXu, "");
            Intrinsics.checkNotNullParameter(yqv, "");
            return (EZpvd().contains(c56935yXu) && (collection = AkhnZx().get(c56935yXu)) != null) ? collection : yDY.AhwBna();
        }

        /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: java.util.Collection<o.yNu> */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // o.AbstractC59147zbZ.StateListAnimator
        public void OLrzqt(@NotNull java.util.Collection<InterfaceC56665yNu> collection, @NotNull yZU yzu, @NotNull Function1<? super C56935yXu, java.lang.Boolean> function1, @NotNull yQV yqv) {
            Intrinsics.checkNotNullParameter(collection, "");
            Intrinsics.checkNotNullParameter(yzu, "");
            Intrinsics.checkNotNullParameter(function1, "");
            Intrinsics.checkNotNullParameter(yqv, "");
            if (yzu.EZpvd(yZU.AYXKKw.AhwBna())) {
                for (java.lang.Object obj : djBIcL()) {
                    C56935yXu c56935yXuBR_ = ((InterfaceC56676yOe) obj).bR_();
                    Intrinsics.checkNotNullExpressionValue(c56935yXuBR_, "");
                    if (function1.invoke(c56935yXuBR_).booleanValue()) {
                        collection.add(obj);
                    }
                }
            }
            if (yzu.EZpvd(yZU.AYXKKw.EZpvd())) {
                for (java.lang.Object obj2 : valueOf()) {
                    C56935yXu c56935yXuBR_2 = ((InterfaceC56687yOp) obj2).bR_();
                    Intrinsics.checkNotNullExpressionValue(c56935yXuBR_2, "");
                    if (function1.invoke(c56935yXuBR_2).booleanValue()) {
                        collection.add(obj2);
                    }
                }
            }
        }

        @Override // o.AbstractC59147zbZ.StateListAnimator
        public java.util.Set<C56935yXu> copydefault() {
            java.util.List<ProtoBuf.TypeAlias> list = this.values;
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            AbstractC59147zbZ abstractC59147zbZ = this.fetchVPNInfo;
            java.util.Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                linkedHashSet.add(C59160zbm.OLrzqt(abstractC59147zbZ.valueOf().copydefault(), ((ProtoBuf.TypeAlias) ((yXQ) it.next())).getName()));
            }
            return linkedHashSet;
        }

        public final java.util.List<InterfaceC56687yOp> AYXKKw() {
            java.util.List<ProtoBuf.Function> list = this.AhwBna;
            AbstractC59147zbZ abstractC59147zbZ = this.fetchVPNInfo;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                InterfaceC56687yOp interfaceC56687yOpOLrzqt = abstractC59147zbZ.valueOf().OLrzqt().OLrzqt((ProtoBuf.Function) ((yXQ) it.next()));
                if (!abstractC59147zbZ.OLrzqt(interfaceC56687yOpOLrzqt)) {
                    interfaceC56687yOpOLrzqt = null;
                }
                if (interfaceC56687yOpOLrzqt != null) {
                    arrayList.add(interfaceC56687yOpOLrzqt);
                }
            }
            return arrayList;
        }

        public final java.util.List<InterfaceC56676yOe> gEmmrt() {
            java.util.List<ProtoBuf.Property> list = this.isConnected;
            AbstractC59147zbZ abstractC59147zbZ = this.fetchVPNInfo;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                InterfaceC56676yOe interfaceC56676yOeOLrzqt = abstractC59147zbZ.valueOf().OLrzqt().OLrzqt((ProtoBuf.Property) ((yXQ) it.next()));
                if (interfaceC56676yOeOLrzqt != null) {
                    arrayList.add(interfaceC56676yOeOLrzqt);
                }
            }
            return arrayList;
        }

        public final java.util.List<InterfaceC56690yOs> AhwBna() {
            java.util.List<ProtoBuf.TypeAlias> list = this.values;
            AbstractC59147zbZ abstractC59147zbZ = this.fetchVPNInfo;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                InterfaceC56690yOs interfaceC56690yOsOLrzqt = abstractC59147zbZ.valueOf().OLrzqt().OLrzqt((ProtoBuf.TypeAlias) ((yXQ) it.next()));
                if (interfaceC56690yOsOLrzqt != null) {
                    arrayList.add(interfaceC56690yOsOLrzqt);
                }
            }
            return arrayList;
        }
    }
}
