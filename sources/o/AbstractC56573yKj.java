package o;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.WildcardType;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KParameter;
import kotlin.reflect.KVisibility;
import kotlin.reflect.full.IllegalCallableAccessException;
import kotlin.reflect.jvm.internal.KDeclarationContainerImpl;
import kotlin.reflect.jvm.internal.KotlinReflectionInternalError;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import o.yLN;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yKj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public abstract class AbstractC56573yKj<R> implements InterfaceC56549yJm<R>, yLM {
    public final yLN.ActionBar<java.lang.Object[]> AEQbTJ;
    public final yLN.ActionBar<java.util.List<yLQ>> EZpvd;
    public final yLN.ActionBar<java.util.ArrayList<KParameter>> KWHzl;
    public final yLN.ActionBar<yLJ> OLrzqt;
    public final yLN.ActionBar<java.util.List<java.lang.annotation.Annotation>> copydefault;
    public final InterfaceC56387yDm<java.lang.Boolean> djBIcL;

    public static final InterfaceC56678yOg EZpvd(InterfaceC56679yOh interfaceC56679yOh) {
        return interfaceC56679yOh;
    }

    public static final InterfaceC56678yOg OLrzqt(InterfaceC56679yOh interfaceC56679yOh) {
        return interfaceC56679yOh;
    }

    public abstract InterfaceC56627yMj<?> AhwBna();

    public abstract InterfaceC56627yMj<?> EZpvd();

    public abstract KDeclarationContainerImpl KWHzl();

    public abstract boolean gEmmrt();

    /* JADX INFO: renamed from: valueOf */
    public abstract CallableMemberDescriptor values();

    public AbstractC56573yKj() {
        yLN.ActionBar<java.util.List<java.lang.annotation.Annotation>> actionBarCopydefault = yLN.copydefault(new C56576yKm(this));
        Intrinsics.checkNotNullExpressionValue(actionBarCopydefault, "");
        this.copydefault = actionBarCopydefault;
        yLN.ActionBar<java.util.ArrayList<KParameter>> actionBarCopydefault2 = yLN.copydefault(new C56575yKl(this));
        Intrinsics.checkNotNullExpressionValue(actionBarCopydefault2, "");
        this.KWHzl = actionBarCopydefault2;
        yLN.ActionBar<yLJ> actionBarCopydefault3 = yLN.copydefault(new C56577yKn(this));
        Intrinsics.checkNotNullExpressionValue(actionBarCopydefault3, "");
        this.OLrzqt = actionBarCopydefault3;
        yLN.ActionBar<java.util.List<yLQ>> actionBarCopydefault4 = yLN.copydefault(new C56578yKo(this));
        Intrinsics.checkNotNullExpressionValue(actionBarCopydefault4, "");
        this.EZpvd = actionBarCopydefault4;
        yLN.ActionBar<java.lang.Object[]> actionBarCopydefault5 = yLN.copydefault(new C56574yKk(this));
        Intrinsics.checkNotNullExpressionValue(actionBarCopydefault5, "");
        this.AEQbTJ = actionBarCopydefault5;
        this.djBIcL = C56392yDr.EZpvd(LazyThreadSafetyMode.PUBLICATION, new C56581yKr(this));
    }

    public static final java.util.List EZpvd(AbstractC56573yKj abstractC56573yKj) {
        return yLX.KWHzl(abstractC56573yKj.values());
    }

    @Override // o.InterfaceC56544yJh
    public java.util.List<java.lang.annotation.Annotation> getAnnotations() {
        java.util.List<java.lang.annotation.Annotation> listInvoke = this.copydefault.invoke();
        Intrinsics.checkNotNullExpressionValue(listInvoke, "");
        return listInvoke;
    }

    public static final java.util.ArrayList copydefault(AbstractC56573yKj abstractC56573yKj) {
        int i;
        CallableMemberDescriptor callableMemberDescriptorValueOf = abstractC56573yKj.values();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int i2 = 0;
        if (abstractC56573yKj.gEmmrt()) {
            i = 0;
        } else {
            InterfaceC56679yOh interfaceC56679yOhEZpvd = yLX.EZpvd((InterfaceC56657yNm) callableMemberDescriptorValueOf);
            if (interfaceC56679yOhEZpvd != null) {
                arrayList.add(new C56607yLq(abstractC56573yKj, 0, KParameter.Kind.INSTANCE, new C56583yKt(interfaceC56679yOhEZpvd)));
                i = 1;
            } else {
                i = 0;
            }
            InterfaceC56679yOh interfaceC56679yOhDjBIcL = callableMemberDescriptorValueOf.djBIcL();
            if (interfaceC56679yOhDjBIcL != null) {
                arrayList.add(new C56607yLq(abstractC56573yKj, i, KParameter.Kind.EXTENSION_RECEIVER, new C56582yKs(interfaceC56679yOhDjBIcL)));
                i++;
            }
        }
        int size = callableMemberDescriptorValueOf.fetchVPNInfo().size();
        while (i2 < size) {
            arrayList.add(new C56607yLq(abstractC56573yKj, i, KParameter.Kind.VALUE, new C56580yKq(callableMemberDescriptorValueOf, i2)));
            i2++;
            i++;
        }
        if (abstractC56573yKj.AYXKKw() && (callableMemberDescriptorValueOf instanceof InterfaceC56781ySb) && arrayList.size() > 1) {
            C56407yEf.copydefault(arrayList, new Application());
        }
        arrayList.trimToSize();
        return arrayList;
    }

    public static final InterfaceC56678yOg AEQbTJ(CallableMemberDescriptor callableMemberDescriptor, int i) {
        InterfaceC56695yOx interfaceC56695yOx = callableMemberDescriptor.fetchVPNInfo().get(i);
        Intrinsics.checkNotNullExpressionValue(interfaceC56695yOx, "");
        return interfaceC56695yOx;
    }

    @Override // o.InterfaceC56549yJm
    public java.util.List<KParameter> getParameters() {
        java.util.ArrayList<KParameter> arrayListInvoke = this.KWHzl.invoke();
        Intrinsics.checkNotNullExpressionValue(arrayListInvoke, "");
        return arrayListInvoke;
    }

    public static final yLJ AEQbTJ(AbstractC56573yKj abstractC56573yKj) {
        AbstractC59233zdF abstractC59233zdFGEmmrt = abstractC56573yKj.values().gEmmrt();
        Intrinsics.copydefault(abstractC59233zdFGEmmrt);
        return new yLJ(abstractC59233zdFGEmmrt, new C56579yKp(abstractC56573yKj));
    }

    public static final java.lang.reflect.Type KWHzl(AbstractC56573yKj abstractC56573yKj) {
        java.lang.reflect.Type typeOLrzqt = abstractC56573yKj.OLrzqt();
        return typeOLrzqt == null ? abstractC56573yKj.EZpvd().copydefault() : typeOLrzqt;
    }

    @Override // o.InterfaceC56549yJm
    public InterfaceC56559yJw getReturnType() {
        yLJ yljInvoke = this.OLrzqt.invoke();
        Intrinsics.checkNotNullExpressionValue(yljInvoke, "");
        return yljInvoke;
    }

    public static final java.util.List AYXKKw(AbstractC56573yKj abstractC56573yKj) {
        java.util.List<InterfaceC56691yOt> listAkhnZx = abstractC56573yKj.values().AkhnZx();
        Intrinsics.checkNotNullExpressionValue(listAkhnZx, "");
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listAkhnZx, 10));
        for (InterfaceC56691yOt interfaceC56691yOt : listAkhnZx) {
            Intrinsics.copydefault(interfaceC56691yOt);
            arrayList.add(new yLQ(abstractC56573yKj, interfaceC56691yOt));
        }
        return arrayList;
    }

    @Override // o.InterfaceC56549yJm
    public java.util.List<yJD> getTypeParameters() {
        java.util.List<yLQ> listInvoke = this.EZpvd.invoke();
        Intrinsics.checkNotNullExpressionValue(listInvoke, "");
        return listInvoke;
    }

    @Override // o.InterfaceC56549yJm
    public KVisibility getVisibility() {
        yNC newProxyInstance = values().getNewProxyInstance();
        Intrinsics.checkNotNullExpressionValue(newProxyInstance, "");
        return yLX.OLrzqt(newProxyInstance);
    }

    @Override // o.InterfaceC56549yJm
    public boolean isFinal() {
        return values().isConnected() == Modality.FINAL;
    }

    @Override // o.InterfaceC56549yJm
    public boolean isOpen() {
        return values().isConnected() == Modality.OPEN;
    }

    /* JADX INFO: renamed from: o.yKj$Application */
    public static final class Application<T> implements java.util.Comparator {
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return yET.KWHzl(((KParameter) t).KWHzl(), ((KParameter) t2).KWHzl());
        }
    }

    @Override // o.InterfaceC56549yJm
    public boolean isAbstract() {
        return values().isConnected() == Modality.ABSTRACT;
    }

    public final boolean AYXKKw() {
        return Intrinsics.EZpvd((java.lang.Object) getName(), (java.lang.Object) "<init>") && KWHzl().OLrzqt().isAnnotation();
    }

    @Override // o.InterfaceC56549yJm
    public R call(@NotNull java.lang.Object... objArr) throws IllegalCallableAccessException {
        Intrinsics.checkNotNullParameter(objArr, "");
        try {
            return (R) EZpvd().AEQbTJ(objArr);
        } catch (java.lang.IllegalAccessException e) {
            throw new IllegalCallableAccessException(e);
        }
    }

    @Override // o.InterfaceC56549yJm
    public R callBy(@NotNull java.util.Map<KParameter, ? extends java.lang.Object> map) {
        Intrinsics.checkNotNullParameter(map, "");
        return AYXKKw() ? AEQbTJ(map) : EZpvd(map, null);
    }

    public static final java.lang.Object[] OLrzqt(AbstractC56573yKj abstractC56573yKj) {
        int iOLrzqt;
        java.util.List<KParameter> parameters = abstractC56573yKj.getParameters();
        int size = parameters.size() + (abstractC56573yKj.isSuspend() ? 1 : 0);
        if (abstractC56573yKj.djBIcL.getValue().booleanValue()) {
            iOLrzqt = 0;
            for (KParameter kParameter : parameters) {
                iOLrzqt += kParameter.OLrzqt() == KParameter.Kind.VALUE ? abstractC56573yKj.OLrzqt(kParameter) : 0;
            }
        } else if (parameters.isEmpty()) {
            iOLrzqt = 0;
        } else {
            java.util.Iterator<T> it = parameters.iterator();
            iOLrzqt = 0;
            while (it.hasNext()) {
                if (((KParameter) it.next()).OLrzqt() == KParameter.Kind.VALUE && (iOLrzqt = iOLrzqt + 1) < 0) {
                    yDY.djBIcL();
                }
            }
        }
        int i = (iOLrzqt + 31) / 32;
        java.lang.Object[] objArr = new java.lang.Object[size + i + 1];
        for (KParameter kParameter2 : parameters) {
            if (kParameter2.EZpvd() && !yLX.KWHzl(kParameter2.copydefault())) {
                objArr[kParameter2.AEQbTJ()] = yLX.AEQbTJ(yJN.EZpvd(kParameter2.copydefault()));
            } else if (kParameter2.valueOf()) {
                objArr[kParameter2.AEQbTJ()] = abstractC56573yKj.OLrzqt(kParameter2.copydefault());
            }
        }
        for (int i2 = 0; i2 < i; i2++) {
            objArr[size + i2] = 0;
        }
        return objArr;
    }

    public final java.lang.Object[] AEQbTJ() {
        return (java.lang.Object[]) this.AEQbTJ.invoke().clone();
    }

    public final R EZpvd(@NotNull java.util.Map<KParameter, ? extends java.lang.Object> map, Continuation<?> continuation) throws IllegalCallableAccessException {
        Intrinsics.checkNotNullParameter(map, "");
        java.util.List<KParameter> parameters = getParameters();
        boolean z = false;
        if (!parameters.isEmpty()) {
            int size = parameters.size() + (isSuspend() ? 1 : 0);
            java.lang.Object[] objArrAEQbTJ = AEQbTJ();
            if (isSuspend()) {
                objArrAEQbTJ[parameters.size()] = continuation;
            }
            boolean zBooleanValue = this.djBIcL.getValue().booleanValue();
            int i = 0;
            for (KParameter kParameter : parameters) {
                int iOLrzqt = zBooleanValue ? OLrzqt(kParameter) : 1;
                if (map.containsKey(kParameter)) {
                    objArrAEQbTJ[kParameter.AEQbTJ()] = map.get(kParameter);
                } else if (kParameter.EZpvd()) {
                    if (zBooleanValue) {
                        for (int i2 = i; i2 < i + iOLrzqt; i2++) {
                            int i3 = (i2 / 32) + size;
                            java.lang.Object obj = objArrAEQbTJ[i3];
                            Intrinsics.copydefault(obj, "");
                            objArrAEQbTJ[i3] = java.lang.Integer.valueOf(((java.lang.Integer) obj).intValue() | (1 << (i2 % 32)));
                        }
                    } else {
                        int i4 = (i / 32) + size;
                        java.lang.Object obj2 = objArrAEQbTJ[i4];
                        Intrinsics.copydefault(obj2, "");
                        objArrAEQbTJ[i4] = java.lang.Integer.valueOf(((java.lang.Integer) obj2).intValue() | (1 << (i % 32)));
                    }
                    z = true;
                } else if (!kParameter.valueOf()) {
                    throw new java.lang.IllegalArgumentException("No argument provided for a required parameter: " + kParameter);
                }
                if (kParameter.OLrzqt() == KParameter.Kind.VALUE) {
                    i += iOLrzqt;
                }
            }
            if (!z) {
                try {
                    InterfaceC56627yMj<?> interfaceC56627yMjEZpvd = EZpvd();
                    java.lang.Object[] objArrCopyOf = java.util.Arrays.copyOf(objArrAEQbTJ, size);
                    Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "");
                    return (R) interfaceC56627yMjEZpvd.AEQbTJ(objArrCopyOf);
                } catch (java.lang.IllegalAccessException e) {
                    throw new IllegalCallableAccessException(e);
                }
            }
            InterfaceC56627yMj<?> interfaceC56627yMjAhwBna = AhwBna();
            if (interfaceC56627yMjAhwBna == null) {
                throw new KotlinReflectionInternalError("This callable does not support a default call: " + values());
            }
            try {
                return (R) interfaceC56627yMjAhwBna.AEQbTJ(objArrAEQbTJ);
            } catch (java.lang.IllegalAccessException e2) {
                throw new IllegalCallableAccessException(e2);
            }
        }
        try {
            return (R) EZpvd().AEQbTJ(isSuspend() ? new Continuation[]{continuation} : new Continuation[0]);
        } catch (java.lang.IllegalAccessException e3) {
            throw new IllegalCallableAccessException(e3);
        }
    }

    public static final boolean AkhnZx(AbstractC56573yKj abstractC56573yKj) {
        java.util.List<KParameter> parameters = abstractC56573yKj.getParameters();
        if (!(parameters instanceof java.util.Collection) || !parameters.isEmpty()) {
            java.util.Iterator<T> it = parameters.iterator();
            while (it.hasNext()) {
                if (yLX.EZpvd(((KParameter) it.next()).copydefault())) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int OLrzqt(KParameter kParameter) {
        if (!this.djBIcL.getValue().booleanValue()) {
            throw new java.lang.IllegalArgumentException("Check if parametersNeedMFVCFlattening is true before".toString());
        }
        if (!yLX.EZpvd(kParameter.copydefault())) {
            return 1;
        }
        InterfaceC56559yJw interfaceC56559yJwCopydefault = kParameter.copydefault();
        Intrinsics.copydefault(interfaceC56559yJwCopydefault, "");
        java.util.List<java.lang.reflect.Method> listCopydefault = C56630yMm.copydefault(C59326zet.copydefault(((yLJ) interfaceC56559yJwCopydefault).AEQbTJ()));
        Intrinsics.copydefault(listCopydefault);
        return listCopydefault.size();
    }

    public final R AEQbTJ(java.util.Map<KParameter, ? extends java.lang.Object> map) throws IllegalCallableAccessException {
        java.lang.Object objOLrzqt;
        java.util.List<KParameter> parameters = getParameters();
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(parameters, 10));
        for (KParameter kParameter : parameters) {
            if (map.containsKey(kParameter)) {
                objOLrzqt = map.get(kParameter);
                if (objOLrzqt == null) {
                    throw new java.lang.IllegalArgumentException("Annotation argument value cannot be null (" + kParameter + ')');
                }
            } else if (kParameter.EZpvd()) {
                objOLrzqt = null;
            } else {
                if (!kParameter.valueOf()) {
                    throw new java.lang.IllegalArgumentException("No argument provided for a required parameter: " + kParameter);
                }
                objOLrzqt = OLrzqt(kParameter.copydefault());
            }
            arrayList.add(objOLrzqt);
        }
        InterfaceC56627yMj<?> interfaceC56627yMjAhwBna = AhwBna();
        if (interfaceC56627yMjAhwBna == null) {
            throw new KotlinReflectionInternalError("This callable does not support a default call: " + values());
        }
        try {
            return (R) interfaceC56627yMjAhwBna.AEQbTJ(arrayList.toArray(new java.lang.Object[0]));
        } catch (java.lang.IllegalAccessException e) {
            throw new IllegalCallableAccessException(e);
        }
    }

    public final java.lang.Object OLrzqt(InterfaceC56559yJw interfaceC56559yJw) {
        java.lang.Class clsOLrzqt = yHE.OLrzqt(yJL.KWHzl(interfaceC56559yJw));
        if (clsOLrzqt.isArray()) {
            java.lang.Object objNewInstance = java.lang.reflect.Array.newInstance(clsOLrzqt.getComponentType(), 0);
            Intrinsics.checkNotNullExpressionValue(objNewInstance, "");
            return objNewInstance;
        }
        throw new KotlinReflectionInternalError("Cannot instantiate the default empty array of type " + clsOLrzqt.getSimpleName() + ", because it is not an array type");
    }

    public final java.lang.reflect.Type OLrzqt() {
        java.lang.reflect.Type[] lowerBounds;
        if (!isSuspend()) {
            return null;
        }
        java.lang.Object objWlaJM = CollectionsKt___CollectionsKt.wlaJM(EZpvd().AEQbTJ());
        ParameterizedType parameterizedType = objWlaJM instanceof ParameterizedType ? (ParameterizedType) objWlaJM : null;
        if (!Intrinsics.EZpvd(parameterizedType != null ? parameterizedType.getRawType() : null, Continuation.class)) {
            return null;
        }
        java.lang.reflect.Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        Intrinsics.checkNotNullExpressionValue(actualTypeArguments, "");
        java.lang.Object objSSMYrx = yDV.sSMYrx(actualTypeArguments);
        WildcardType wildcardType = objSSMYrx instanceof WildcardType ? (WildcardType) objSSMYrx : null;
        if (wildcardType == null || (lowerBounds = wildcardType.getLowerBounds()) == null) {
            return null;
        }
        return (java.lang.reflect.Type) yDV.AuCTelauCTel(lowerBounds);
    }
}
