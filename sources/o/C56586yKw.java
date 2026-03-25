package o;

import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.jvm.internal.KClassImpl$getLocalProperty$2$1$1;
import kotlin.reflect.jvm.internal.KDeclarationContainerImpl;
import kotlin.reflect.jvm.internal.KotlinReflectionInternalError;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import kotlin.text.StringsKt__StringsKt;
import o.InterfaceC59101zag;
import o.yLN;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yKw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C56586yKw<T> extends KDeclarationContainerImpl implements InterfaceC56551yJo<T>, yKQ, yLM {
    public final java.lang.Class<T> OLrzqt;
    public final InterfaceC56387yDm<C56586yKw<T>.StateListAnimator> copydefault;

    /* JADX INFO: renamed from: o.yKw$Application */
    public final /* synthetic */ class Application {
        public static final /* synthetic */ int[] EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[KotlinClassHeader.Kind.values().length];
            try {
                iArr[KotlinClassHeader.Kind.FILE_FACADE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[KotlinClassHeader.Kind.MULTIFILE_CLASS.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[KotlinClassHeader.Kind.MULTIFILE_CLASS_PART.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[KotlinClassHeader.Kind.SYNTHETIC_CLASS.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[KotlinClassHeader.Kind.UNKNOWN.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr[KotlinClassHeader.Kind.CLASS.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            EZpvd = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InterfaceC56387yDm<C56586yKw<T>.StateListAnimator> AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC56513yId
    public java.lang.Class<T> OLrzqt() {
        return this.OLrzqt;
    }

    /* JADX INFO: renamed from: o.yKw$StateListAnimator */
    public final class StateListAnimator extends KDeclarationContainerImpl.TaskDescription {
        public static final /* synthetic */ yJA<java.lang.Object>[] AEQbTJ = {C56524yIo.copydefault(new PropertyReference1Impl(StateListAnimator.class, "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;", 0)), C56524yIo.copydefault(new PropertyReference1Impl(StateListAnimator.class, "annotations", "getAnnotations()Ljava/util/List;", 0)), C56524yIo.copydefault(new PropertyReference1Impl(StateListAnimator.class, "simpleName", "getSimpleName()Ljava/lang/String;", 0)), C56524yIo.copydefault(new PropertyReference1Impl(StateListAnimator.class, "qualifiedName", "getQualifiedName()Ljava/lang/String;", 0)), C56524yIo.copydefault(new PropertyReference1Impl(StateListAnimator.class, "constructors", "getConstructors()Ljava/util/Collection;", 0)), C56524yIo.copydefault(new PropertyReference1Impl(StateListAnimator.class, "nestedClasses", "getNestedClasses()Ljava/util/Collection;", 0)), C56524yIo.copydefault(new PropertyReference1Impl(StateListAnimator.class, "typeParameters", "getTypeParameters()Ljava/util/List;", 0)), C56524yIo.copydefault(new PropertyReference1Impl(StateListAnimator.class, "supertypes", "getSupertypes()Ljava/util/List;", 0)), C56524yIo.copydefault(new PropertyReference1Impl(StateListAnimator.class, "sealedSubclasses", "getSealedSubclasses()Ljava/util/List;", 0)), C56524yIo.copydefault(new PropertyReference1Impl(StateListAnimator.class, "declaredNonStaticMembers", "getDeclaredNonStaticMembers()Ljava/util/Collection;", 0)), C56524yIo.copydefault(new PropertyReference1Impl(StateListAnimator.class, "declaredStaticMembers", "getDeclaredStaticMembers()Ljava/util/Collection;", 0)), C56524yIo.copydefault(new PropertyReference1Impl(StateListAnimator.class, "inheritedNonStaticMembers", "getInheritedNonStaticMembers()Ljava/util/Collection;", 0)), C56524yIo.copydefault(new PropertyReference1Impl(StateListAnimator.class, "inheritedStaticMembers", "getInheritedStaticMembers()Ljava/util/Collection;", 0)), C56524yIo.copydefault(new PropertyReference1Impl(StateListAnimator.class, "allNonStaticMembers", "getAllNonStaticMembers()Ljava/util/Collection;", 0)), C56524yIo.copydefault(new PropertyReference1Impl(StateListAnimator.class, "allStaticMembers", "getAllStaticMembers()Ljava/util/Collection;", 0)), C56524yIo.copydefault(new PropertyReference1Impl(StateListAnimator.class, "declaredMembers", "getDeclaredMembers()Ljava/util/Collection;", 0)), C56524yIo.copydefault(new PropertyReference1Impl(StateListAnimator.class, "allMembers", "getAllMembers()Ljava/util/Collection;", 0))};
        public final yLN.ActionBar AYXKKw;
        public final yLN.ActionBar AhwBna;
        public final yLN.ActionBar AkhnZx;
        public final yLN.ActionBar AuCTel;
        public final yLN.ActionBar DbNXlk;
        public final yLN.ActionBar EZpvd;
        public final yLN.ActionBar KWHzl;
        public final yLN.ActionBar OLrzqt;
        public final yLN.ActionBar copydefault;
        public final yLN.ActionBar djBIcL;
        public final yLN.ActionBar ejfBZ;
        public final yLN.ActionBar fIwbmz;
        public final yLN.ActionBar fJNWhG;
        public final yLN.ActionBar fetchVPNInfo;
        public final yLN.ActionBar gEmmrt;
        public final yLN.ActionBar isConnected;
        public final yLN.ActionBar valueOf;
        public final InterfaceC56387yDm values;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static final java.lang.reflect.Type EZpvd() {
            return java.lang.Object.class;
        }

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public StateListAnimator() {
            super();
            this.djBIcL = yLN.copydefault(new C56587yKx(C56586yKw.this));
            this.EZpvd = yLN.copydefault(new C56588yKy(this));
            this.fJNWhG = yLN.copydefault(new yKH(C56586yKw.this, this));
            this.isConnected = yLN.copydefault(new yKK(C56586yKw.this));
            this.gEmmrt = yLN.copydefault(new yKL(C56586yKw.this));
            this.DbNXlk = yLN.copydefault(new yKN(this));
            this.values = C56392yDr.EZpvd(LazyThreadSafetyMode.PUBLICATION, new yKJ(this, C56586yKw.this));
            this.AuCTel = yLN.copydefault(new yKM(this, C56586yKw.this));
            this.fIwbmz = yLN.copydefault(new yKO(this, C56586yKw.this));
            this.ejfBZ = yLN.copydefault(new yKS(this));
            this.AYXKKw = yLN.copydefault(new C56585yKv(C56586yKw.this));
            this.valueOf = yLN.copydefault(new yKB(C56586yKw.this));
            this.AkhnZx = yLN.copydefault(new C56589yKz(C56586yKw.this));
            this.fetchVPNInfo = yLN.copydefault(new yKA(C56586yKw.this));
            this.OLrzqt = yLN.copydefault(new yKD(this));
            this.KWHzl = yLN.copydefault(new yKC(this));
            this.AhwBna = yLN.copydefault(new yKF(this));
            this.copydefault = yLN.copydefault(new yKG(this));
        }

        public final InterfaceC56658yNn gEmmrt() {
            T tKWHzl = this.djBIcL.KWHzl(this, AEQbTJ[0]);
            Intrinsics.checkNotNullExpressionValue(tKWHzl, "");
            return (InterfaceC56658yNn) tKWHzl;
        }

        public static final InterfaceC56658yNn fetchVPNInfo(C56586yKw c56586yKw) {
            InterfaceC56658yNn interfaceC56658yNnCopydefault;
            C56929yXo c56929yXoKWHzl = c56586yKw.KWHzl();
            C56731yQf c56731yQfFARcdN = c56586yKw.AEQbTJ().getValue().fARcdN();
            yNP ynpEZpvd = c56731yQfFARcdN.EZpvd();
            if (c56929yXoKWHzl.AhwBna() && c56586yKw.OLrzqt().isAnnotationPresent(Metadata.class)) {
                interfaceC56658yNnCopydefault = c56731yQfFARcdN.OLrzqt().KWHzl(c56929yXoKWHzl);
            } else {
                interfaceC56658yNnCopydefault = yNE.copydefault(ynpEZpvd, c56929yXoKWHzl);
            }
            return interfaceC56658yNnCopydefault == null ? c56586yKw.KWHzl(c56929yXoKWHzl, c56731yQfFARcdN) : interfaceC56658yNnCopydefault;
        }

        public static final java.util.List isConnected(StateListAnimator stateListAnimator) {
            return yLX.KWHzl(stateListAnimator.gEmmrt());
        }

        public final java.util.List<java.lang.annotation.Annotation> AYXKKw() {
            T tKWHzl = this.EZpvd.KWHzl(this, AEQbTJ[1]);
            Intrinsics.checkNotNullExpressionValue(tKWHzl, "");
            return (java.util.List) tKWHzl;
        }

        public final java.lang.String AkhnZx() {
            return (java.lang.String) this.fJNWhG.KWHzl(this, AEQbTJ[2]);
        }

        public static final java.lang.String KWHzl(C56586yKw c56586yKw, StateListAnimator stateListAnimator) {
            if (c56586yKw.OLrzqt().isAnonymousClass()) {
                return null;
            }
            C56929yXo c56929yXoKWHzl = c56586yKw.KWHzl();
            if (c56929yXoKWHzl.AhwBna()) {
                return stateListAnimator.KWHzl((java.lang.Class<?>) c56586yKw.OLrzqt());
            }
            java.lang.String strAEQbTJ = c56929yXoKWHzl.AYXKKw().AEQbTJ();
            Intrinsics.checkNotNullExpressionValue(strAEQbTJ, "");
            return strAEQbTJ;
        }

        public final java.lang.String isConnected() {
            return (java.lang.String) this.isConnected.KWHzl(this, AEQbTJ[3]);
        }

        public static final java.lang.String DbNXlk(C56586yKw c56586yKw) {
            if (c56586yKw.OLrzqt().isAnonymousClass()) {
                return null;
            }
            C56929yXo c56929yXoKWHzl = c56586yKw.KWHzl();
            if (c56929yXoKWHzl.AhwBna()) {
                return null;
            }
            return c56929yXoKWHzl.AEQbTJ().KWHzl();
        }

        public final java.lang.String KWHzl(java.lang.Class<?> cls) {
            java.lang.String simpleName = cls.getSimpleName();
            java.lang.reflect.Method enclosingMethod = cls.getEnclosingMethod();
            if (enclosingMethod != null) {
                Intrinsics.copydefault((java.lang.Object) simpleName);
                return StringsKt__StringsKt.substringAfter$default(simpleName, enclosingMethod.getName() + '$', (java.lang.String) null, 2, (java.lang.Object) null);
            }
            java.lang.reflect.Constructor<?> enclosingConstructor = cls.getEnclosingConstructor();
            if (enclosingConstructor != null) {
                Intrinsics.copydefault((java.lang.Object) simpleName);
                return StringsKt__StringsKt.substringAfter$default(simpleName, enclosingConstructor.getName() + '$', (java.lang.String) null, 2, (java.lang.Object) null);
            }
            Intrinsics.copydefault((java.lang.Object) simpleName);
            return StringsKt__StringsKt.substringAfter$default(simpleName, '$', (java.lang.String) null, 2, (java.lang.Object) null);
        }

        public final java.util.Collection<InterfaceC56555yJs<T>> valueOf() {
            T tKWHzl = this.gEmmrt.KWHzl(this, AEQbTJ[4]);
            Intrinsics.checkNotNullExpressionValue(tKWHzl, "");
            return (java.util.Collection) tKWHzl;
        }

        public static final java.util.List gEmmrt(C56586yKw c56586yKw) {
            java.util.Collection<InterfaceC56660yNp> collectionEZpvd = c56586yKw.EZpvd();
            java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(collectionEZpvd, 10));
            java.util.Iterator<T> it = collectionEZpvd.iterator();
            while (it.hasNext()) {
                arrayList.add(new yKT(c56586yKw, (InterfaceC56660yNp) it.next()));
            }
            return arrayList;
        }

        public static final java.util.List values(StateListAnimator stateListAnimator) {
            java.util.Collection contributedDescriptors$default = InterfaceC59101zag.Application.getContributedDescriptors$default(stateListAnimator.gEmmrt().OcIXYQ(), null, null, 3, null);
            java.util.ArrayList<InterfaceC56665yNu> arrayList = new java.util.ArrayList();
            for (T t : contributedDescriptors$default) {
                if (!yYH.fJNWhG((InterfaceC56665yNu) t)) {
                    arrayList.add(t);
                }
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            for (InterfaceC56665yNu interfaceC56665yNu : arrayList) {
                InterfaceC56658yNn interfaceC56658yNn = interfaceC56665yNu instanceof InterfaceC56658yNn ? (InterfaceC56658yNn) interfaceC56665yNu : null;
                java.lang.Class<?> clsOLrzqt = interfaceC56658yNn != null ? yLX.OLrzqt(interfaceC56658yNn) : null;
                C56586yKw c56586yKw = clsOLrzqt != null ? new C56586yKw(clsOLrzqt) : null;
                if (c56586yKw != null) {
                    arrayList2.add(c56586yKw);
                }
            }
            return arrayList2;
        }

        public final T values() {
            return (T) this.values.getValue();
        }

        public static final java.lang.Object AEQbTJ(StateListAnimator stateListAnimator, C56586yKw c56586yKw) throws java.lang.IllegalAccessException, java.lang.NoSuchFieldException {
            java.lang.reflect.Field declaredField;
            InterfaceC56658yNn interfaceC56658yNnGEmmrt = stateListAnimator.gEmmrt();
            if (interfaceC56658yNnGEmmrt.DbNXlk() != ClassKind.OBJECT) {
                return null;
            }
            if (interfaceC56658yNnGEmmrt.AuCTelauCTel() && !C56635yMr.KWHzl(C56637yMt.EZpvd, interfaceC56658yNnGEmmrt)) {
                declaredField = c56586yKw.OLrzqt().getEnclosingClass().getDeclaredField(interfaceC56658yNnGEmmrt.bR_().AEQbTJ());
            } else {
                declaredField = c56586yKw.OLrzqt().getDeclaredField("INSTANCE");
            }
            java.lang.Object obj = declaredField.get(null);
            Intrinsics.copydefault(obj, "");
            return obj;
        }

        public static final java.util.List gEmmrt(StateListAnimator stateListAnimator, C56586yKw c56586yKw) {
            java.util.List<InterfaceC56691yOt> listAkhnZx = stateListAnimator.gEmmrt().AkhnZx();
            Intrinsics.checkNotNullExpressionValue(listAkhnZx, "");
            java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listAkhnZx, 10));
            for (InterfaceC56691yOt interfaceC56691yOt : listAkhnZx) {
                Intrinsics.copydefault(interfaceC56691yOt);
                arrayList.add(new yLQ(c56586yKw, interfaceC56691yOt));
            }
            return arrayList;
        }

        public final java.util.List<InterfaceC56559yJw> ejfBZ() {
            T tKWHzl = this.fIwbmz.KWHzl(this, AEQbTJ[7]);
            Intrinsics.checkNotNullExpressionValue(tKWHzl, "");
            return (java.util.List) tKWHzl;
        }

        public static final java.util.List OLrzqt(StateListAnimator stateListAnimator, C56586yKw c56586yKw) {
            java.util.Collection<AbstractC59233zdF> collectionBV_ = stateListAnimator.gEmmrt().fJNWhG().bV_();
            Intrinsics.checkNotNullExpressionValue(collectionBV_, "");
            java.util.ArrayList arrayList = new java.util.ArrayList(collectionBV_.size());
            for (AbstractC59233zdF abstractC59233zdF : collectionBV_) {
                Intrinsics.copydefault(abstractC59233zdF);
                arrayList.add(new yLJ(abstractC59233zdF, new yKE(abstractC59233zdF, stateListAnimator, c56586yKw)));
            }
            if (!AbstractC56640yMw.copydefault(stateListAnimator.gEmmrt())) {
                if (arrayList.isEmpty()) {
                    AbstractC59242zdO abstractC59242zdOAhwBna = yZE.AEQbTJ(stateListAnimator.gEmmrt()).AhwBna();
                    Intrinsics.checkNotNullExpressionValue(abstractC59242zdOAhwBna, "");
                    arrayList.add(new yLJ(abstractC59242zdOAhwBna, yKI.KWHzl));
                } else {
                    java.util.Iterator<T> it = arrayList.iterator();
                    while (it.hasNext()) {
                        ClassKind classKindDbNXlk = yYH.OLrzqt(((yLJ) it.next()).AEQbTJ()).DbNXlk();
                        Intrinsics.checkNotNullExpressionValue(classKindDbNXlk, "");
                        if (classKindDbNXlk != ClassKind.INTERFACE && classKindDbNXlk != ClassKind.ANNOTATION_CLASS) {
                            break;
                        }
                    }
                    AbstractC59242zdO abstractC59242zdOAhwBna2 = yZE.AEQbTJ(stateListAnimator.gEmmrt()).AhwBna();
                    Intrinsics.checkNotNullExpressionValue(abstractC59242zdOAhwBna2, "");
                    arrayList.add(new yLJ(abstractC59242zdOAhwBna2, yKI.KWHzl));
                }
            }
            return C59433zgu.OLrzqt(arrayList);
        }

        public static final java.lang.reflect.Type OLrzqt(AbstractC59233zdF abstractC59233zdF, StateListAnimator stateListAnimator, C56586yKw c56586yKw) {
            InterfaceC56663yNs interfaceC56663yNsKWHzl = abstractC59233zdF.djBIcL().OLrzqt();
            if (!(interfaceC56663yNsKWHzl instanceof InterfaceC56658yNn)) {
                throw new KotlinReflectionInternalError("Supertype not a class: " + interfaceC56663yNsKWHzl);
            }
            java.lang.Class<?> clsOLrzqt = yLX.OLrzqt((InterfaceC56658yNn) interfaceC56663yNsKWHzl);
            if (clsOLrzqt == null) {
                throw new KotlinReflectionInternalError("Unsupported superclass of " + stateListAnimator + ": " + interfaceC56663yNsKWHzl);
            }
            if (Intrinsics.EZpvd(c56586yKw.OLrzqt().getSuperclass(), clsOLrzqt)) {
                java.lang.reflect.Type genericSuperclass = c56586yKw.OLrzqt().getGenericSuperclass();
                Intrinsics.copydefault(genericSuperclass);
                return genericSuperclass;
            }
            java.lang.Class<?>[] interfaces = c56586yKw.OLrzqt().getInterfaces();
            Intrinsics.checkNotNullExpressionValue(interfaces, "");
            int iGEmmrt = yDV.gEmmrt(interfaces, clsOLrzqt);
            if (iGEmmrt >= 0) {
                java.lang.reflect.Type type = c56586yKw.OLrzqt().getGenericInterfaces()[iGEmmrt];
                Intrinsics.copydefault(type);
                return type;
            }
            throw new KotlinReflectionInternalError("No superclass of " + stateListAnimator + " in Java reflection for " + interfaceC56663yNsKWHzl);
        }

        public static final java.util.List AkhnZx(StateListAnimator stateListAnimator) {
            java.util.Collection<InterfaceC56658yNn> collectionFetchVPNInfo = stateListAnimator.gEmmrt().fetchVPNInfo();
            Intrinsics.checkNotNullExpressionValue(collectionFetchVPNInfo, "");
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (InterfaceC56658yNn interfaceC56658yNn : collectionFetchVPNInfo) {
                Intrinsics.copydefault(interfaceC56658yNn, "");
                java.lang.Class<?> clsOLrzqt = yLX.OLrzqt(interfaceC56658yNn);
                C56586yKw c56586yKw = clsOLrzqt != null ? new C56586yKw(clsOLrzqt) : null;
                if (c56586yKw != null) {
                    arrayList.add(c56586yKw);
                }
            }
            return arrayList;
        }

        public static final java.util.Collection AYXKKw(C56586yKw c56586yKw) {
            return c56586yKw.KWHzl(c56586yKw.fIwbmz(), KDeclarationContainerImpl.MemberBelonginess.DECLARED);
        }

        public final java.util.Collection<AbstractC56573yKj<?>> AhwBna() {
            T tKWHzl = this.AYXKKw.KWHzl(this, AEQbTJ[9]);
            Intrinsics.checkNotNullExpressionValue(tKWHzl, "");
            return (java.util.Collection) tKWHzl;
        }

        public static final java.util.Collection djBIcL(C56586yKw c56586yKw) {
            return c56586yKw.KWHzl(c56586yKw.AuCTel(), KDeclarationContainerImpl.MemberBelonginess.DECLARED);
        }

        public final java.util.Collection<AbstractC56573yKj<?>> djBIcL() {
            T tKWHzl = this.valueOf.KWHzl(this, AEQbTJ[10]);
            Intrinsics.checkNotNullExpressionValue(tKWHzl, "");
            return (java.util.Collection) tKWHzl;
        }

        public static final java.util.Collection isConnected(C56586yKw c56586yKw) {
            return c56586yKw.KWHzl(c56586yKw.fIwbmz(), KDeclarationContainerImpl.MemberBelonginess.INHERITED);
        }

        public final java.util.Collection<AbstractC56573yKj<?>> DbNXlk() {
            T tKWHzl = this.AkhnZx.KWHzl(this, AEQbTJ[11]);
            Intrinsics.checkNotNullExpressionValue(tKWHzl, "");
            return (java.util.Collection) tKWHzl;
        }

        public static final java.util.Collection AkhnZx(C56586yKw c56586yKw) {
            return c56586yKw.KWHzl(c56586yKw.AuCTel(), KDeclarationContainerImpl.MemberBelonginess.INHERITED);
        }

        public final java.util.Collection<AbstractC56573yKj<?>> fetchVPNInfo() {
            T tKWHzl = this.fetchVPNInfo.KWHzl(this, AEQbTJ[12]);
            Intrinsics.checkNotNullExpressionValue(tKWHzl, "");
            return (java.util.Collection) tKWHzl;
        }

        public static final java.util.List gEmmrt(StateListAnimator stateListAnimator) {
            return CollectionsKt___CollectionsKt.djBIcL((java.util.Collection) stateListAnimator.AhwBna(), (java.lang.Iterable) stateListAnimator.DbNXlk());
        }

        public final java.util.Collection<AbstractC56573yKj<?>> copydefault() {
            T tKWHzl = this.OLrzqt.KWHzl(this, AEQbTJ[13]);
            Intrinsics.checkNotNullExpressionValue(tKWHzl, "");
            return (java.util.Collection) tKWHzl;
        }

        public static final java.util.List djBIcL(StateListAnimator stateListAnimator) {
            return CollectionsKt___CollectionsKt.djBIcL((java.util.Collection) stateListAnimator.djBIcL(), (java.lang.Iterable) stateListAnimator.fetchVPNInfo());
        }

        public final java.util.Collection<AbstractC56573yKj<?>> OLrzqt() {
            T tKWHzl = this.KWHzl.KWHzl(this, AEQbTJ[14]);
            Intrinsics.checkNotNullExpressionValue(tKWHzl, "");
            return (java.util.Collection) tKWHzl;
        }

        public static final java.util.List DbNXlk(StateListAnimator stateListAnimator) {
            return CollectionsKt___CollectionsKt.djBIcL((java.util.Collection) stateListAnimator.AhwBna(), (java.lang.Iterable) stateListAnimator.djBIcL());
        }

        public static final java.util.List valueOf(StateListAnimator stateListAnimator) {
            return CollectionsKt___CollectionsKt.djBIcL((java.util.Collection) stateListAnimator.copydefault(), (java.lang.Iterable) stateListAnimator.OLrzqt());
        }

        public final java.util.Collection<AbstractC56573yKj<?>> AEQbTJ() {
            T tKWHzl = this.copydefault.KWHzl(this, AEQbTJ[16]);
            Intrinsics.checkNotNullExpressionValue(tKWHzl, "");
            return (java.util.Collection) tKWHzl;
        }
    }

    public C56586yKw(@NotNull java.lang.Class<T> cls) {
        Intrinsics.checkNotNullParameter(cls, "");
        this.OLrzqt = cls;
        this.copydefault = C56392yDr.EZpvd(LazyThreadSafetyMode.PUBLICATION, new C56584yKu(this));
    }

    public static final StateListAnimator OLrzqt(C56586yKw c56586yKw) {
        return new StateListAnimator();
    }

    /* JADX DEBUG: Method merged with bridge method: fJNWhG()Lo/yNs; */
    @Override // o.yKQ
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public InterfaceC56658yNn fJNWhG() {
        return this.copydefault.getValue().gEmmrt();
    }

    @Override // o.InterfaceC56544yJh
    public java.util.List<java.lang.annotation.Annotation> getAnnotations() {
        return this.copydefault.getValue().AYXKKw();
    }

    public final C56929yXo KWHzl() {
        return yLT.KWHzl.KWHzl((java.lang.Class<?>) OLrzqt());
    }

    public final InterfaceC59098zad fIwbmz() {
        return fJNWhG().bQ_().OLrzqt();
    }

    public final InterfaceC59098zad AuCTel() {
        InterfaceC59098zad interfaceC59098zadEjfBZ = fJNWhG().ejfBZ();
        Intrinsics.checkNotNullExpressionValue(interfaceC59098zadEjfBZ, "");
        return interfaceC59098zadEjfBZ;
    }

    @Override // o.InterfaceC56551yJo
    public java.util.Collection<InterfaceC56549yJm<?>> AYXKKw() {
        return this.copydefault.getValue().AEQbTJ();
    }

    @Override // kotlin.reflect.jvm.internal.KDeclarationContainerImpl
    public java.util.Collection<InterfaceC56660yNp> EZpvd() {
        InterfaceC56658yNn interfaceC56658yNnFJNWhG = fJNWhG();
        if (interfaceC56658yNnFJNWhG.DbNXlk() == ClassKind.INTERFACE || interfaceC56658yNnFJNWhG.DbNXlk() == ClassKind.OBJECT) {
            return yDY.AhwBna();
        }
        java.util.Collection<InterfaceC56656yNl> collectionDjBIcL = interfaceC56658yNnFJNWhG.djBIcL();
        Intrinsics.checkNotNullExpressionValue(collectionDjBIcL, "");
        return collectionDjBIcL;
    }

    @Override // kotlin.reflect.jvm.internal.KDeclarationContainerImpl
    public java.util.Collection<InterfaceC56676yOe> AEQbTJ(@NotNull C56935yXu c56935yXu) {
        Intrinsics.checkNotNullParameter(c56935yXu, "");
        InterfaceC59098zad interfaceC59098zadFIwbmz = fIwbmz();
        NoLookupLocation noLookupLocation = NoLookupLocation.FROM_REFLECTION;
        return CollectionsKt___CollectionsKt.djBIcL((java.util.Collection) interfaceC59098zadFIwbmz.copydefault(c56935yXu, noLookupLocation), (java.lang.Iterable) AuCTel().copydefault(c56935yXu, noLookupLocation));
    }

    @Override // kotlin.reflect.jvm.internal.KDeclarationContainerImpl
    public java.util.Collection<yNG> KWHzl(@NotNull C56935yXu c56935yXu) {
        Intrinsics.checkNotNullParameter(c56935yXu, "");
        InterfaceC59098zad interfaceC59098zadFIwbmz = fIwbmz();
        NoLookupLocation noLookupLocation = NoLookupLocation.FROM_REFLECTION;
        return CollectionsKt___CollectionsKt.djBIcL((java.util.Collection) interfaceC59098zadFIwbmz.AEQbTJ(c56935yXu, noLookupLocation), (java.lang.Iterable) AuCTel().AEQbTJ(c56935yXu, noLookupLocation));
    }

    @Override // kotlin.reflect.jvm.internal.KDeclarationContainerImpl
    public InterfaceC56676yOe copydefault(int i) {
        java.lang.Class<?> declaringClass;
        if (Intrinsics.EZpvd((java.lang.Object) OLrzqt().getSimpleName(), (java.lang.Object) "DefaultImpls") && (declaringClass = OLrzqt().getDeclaringClass()) != null && declaringClass.isInterface()) {
            InterfaceC56551yJo interfaceC56551yJoKWHzl = yHE.KWHzl(declaringClass);
            Intrinsics.copydefault(interfaceC56551yJoKWHzl, "");
            return ((C56586yKw) interfaceC56551yJoKWHzl).copydefault(i);
        }
        InterfaceC56658yNn interfaceC56658yNnFJNWhG = fJNWhG();
        C59127zbF c59127zbF = interfaceC56658yNnFJNWhG instanceof C59127zbF ? (C59127zbF) interfaceC56658yNnFJNWhG : null;
        if (c59127zbF == null) {
            return null;
        }
        ProtoBuf.Class classQKVWgx = c59127zbF.QKVWgx();
        GeneratedMessageLite.Activity<ProtoBuf.Class, java.util.List<ProtoBuf.Property>> activity = JvmProtoBuf.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(activity, "");
        ProtoBuf.Property property = (ProtoBuf.Property) yWY.OLrzqt(classQKVWgx, activity, i);
        if (property != null) {
            return (InterfaceC56676yOe) yLX.EZpvd(OLrzqt(), property, c59127zbF.QOLQEE().copydefault(), c59127zbF.QOLQEE().gEmmrt(), c59127zbF.QfsBiF(), KClassImpl$getLocalProperty$2$1$1.INSTANCE);
        }
        return null;
    }

    @Override // o.InterfaceC56551yJo
    public java.lang.String valueOf() {
        return this.copydefault.getValue().AkhnZx();
    }

    @Override // o.InterfaceC56551yJo
    public java.lang.String gEmmrt() {
        return this.copydefault.getValue().isConnected();
    }

    @Override // o.InterfaceC56551yJo
    public java.util.Collection<InterfaceC56555yJs<T>> AhwBna() {
        return this.copydefault.getValue().valueOf();
    }

    @Override // o.InterfaceC56551yJo
    public T djBIcL() {
        return this.copydefault.getValue().values();
    }

    @Override // o.InterfaceC56551yJo
    public boolean copydefault(java.lang.Object obj) {
        java.lang.Integer numEZpvd = C56743yQr.EZpvd((java.lang.Class<?>) OLrzqt());
        if (numEZpvd != null) {
            return C56532yIw.EZpvd(obj, numEZpvd.intValue());
        }
        java.lang.Class clsValueOf = C56743yQr.valueOf(OLrzqt());
        if (clsValueOf == null) {
            clsValueOf = OLrzqt();
        }
        return clsValueOf.isInstance(obj);
    }

    @Override // o.InterfaceC56551yJo
    public java.util.List<InterfaceC56559yJw> isConnected() {
        return this.copydefault.getValue().ejfBZ();
    }

    @Override // o.InterfaceC56551yJo
    public boolean fetchVPNInfo() {
        return fJNWhG().isConnected() == Modality.ABSTRACT;
    }

    @Override // o.InterfaceC56551yJo
    public boolean values() {
        return fJNWhG().isConnected() == Modality.SEALED;
    }

    @Override // o.InterfaceC56551yJo
    public boolean AkhnZx() {
        return fJNWhG().gHZMYf();
    }

    @Override // o.InterfaceC56551yJo
    public boolean DbNXlk() {
        return fJNWhG().AwvSrB();
    }

    public boolean equals(java.lang.Object obj) {
        return (obj instanceof C56586yKw) && Intrinsics.EZpvd(yHE.copydefault(this), yHE.copydefault((InterfaceC56551yJo) obj));
    }

    @Override // o.InterfaceC56551yJo
    public int hashCode() {
        return yHE.copydefault(this).hashCode();
    }

    public java.lang.String toString() {
        java.lang.String str;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("class ");
        C56929yXo c56929yXoKWHzl = KWHzl();
        C56933yXs c56933yXsOLrzqt = c56929yXoKWHzl.OLrzqt();
        if (c56933yXsOLrzqt.AEQbTJ()) {
            str = "";
        } else {
            str = c56933yXsOLrzqt.KWHzl() + '.';
        }
        sb.append(str + C59449zhJ.replace$default(c56929yXoKWHzl.copydefault().KWHzl(), '.', '$', false, 4, (java.lang.Object) null));
        return sb.toString();
    }

    public final InterfaceC56658yNn KWHzl(C56929yXo c56929yXo, C56731yQf c56731yQf) {
        KotlinClassHeader kotlinClassHeaderEZpvd;
        if (OLrzqt().isSynthetic()) {
            return EZpvd(c56929yXo, c56731yQf);
        }
        C56726yQa c56726yQaOLrzqt = C56726yQa.KWHzl.OLrzqt(OLrzqt());
        KotlinClassHeader.Kind kindKWHzl = (c56726yQaOLrzqt == null || (kotlinClassHeaderEZpvd = c56726yQaOLrzqt.EZpvd()) == null) ? null : kotlinClassHeaderEZpvd.KWHzl();
        switch (kindKWHzl == null ? -1 : Application.EZpvd[kindKWHzl.ordinal()]) {
            case -1:
            case 6:
                throw new KotlinReflectionInternalError("Unresolved class: " + OLrzqt() + " (kind = " + kindKWHzl + ')');
            case 0:
            default:
                throw new NoWhenBranchMatchedException();
            case 1:
            case 2:
            case 3:
            case 4:
                return EZpvd(c56929yXo, c56731yQf);
            case 5:
                throw new KotlinReflectionInternalError("Unknown class: " + OLrzqt() + " (kind = " + kindKWHzl + ')');
        }
    }

    public final InterfaceC56658yNn EZpvd(C56929yXo c56929yXo, C56731yQf c56731yQf) {
        C56706yPh c56706yPh = new C56706yPh(new C56710yPl(c56731yQf.EZpvd(), c56929yXo.OLrzqt()), c56929yXo.AYXKKw(), Modality.FINAL, ClassKind.CLASS, C56402yEa.EZpvd(c56731yQf.EZpvd().AEQbTJ().AEQbTJ().bQ_()), InterfaceC56686yOo.copydefault, false, c56731yQf.OLrzqt().ejfBZ());
        c56706yPh.OLrzqt(new Activity(c56706yPh, c56731yQf.OLrzqt().ejfBZ()), yEE.copydefault(), null);
        return c56706yPh;
    }

    /* JADX INFO: renamed from: o.yKw$Activity */
    public static final class Activity extends AbstractC59095zaa {
        public Activity(C56706yPh c56706yPh, InterfaceC59187zcM interfaceC59187zcM) {
            super(interfaceC59187zcM, c56706yPh);
        }

        @Override // o.AbstractC59095zaa
        public java.util.List<yNG> copydefault() {
            return yDY.AhwBna();
        }
    }
}
