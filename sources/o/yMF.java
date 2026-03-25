package o;

import androidx.exifinterface.media.ExifInterface;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.IndexedValue;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import o.AbstractC56718yPt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class yMF extends yPK {
    public static final StateListAnimator EZpvd = new StateListAnimator(null);

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR 
  (r1v0 o.yNu)
  (r2v0 o.yMF)
  (r3v0 kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor$Kind)
  (r4v0 boolean)
 A[MD:(o.yNu, o.yMF, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor$Kind, boolean):void (m)] call: o.yMF.<init>(o.yNu, o.yMF, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor$Kind, boolean):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ yMF(InterfaceC56665yNu interfaceC56665yNu, yMF ymf, CallableMemberDescriptor.Kind kind, boolean z, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC56665yNu, ymf, kind, z);
    }

    @Override // o.AbstractC56718yPt, o.yNG
    public boolean EZpvd() {
        return false;
    }

    @Override // o.AbstractC56718yPt, o.yNG
    public boolean KWHzl() {
        return false;
    }

    @Override // o.AbstractC56718yPt, o.yNJ
    public boolean zsXlph() {
        return false;
    }

    public yMF(InterfaceC56665yNu interfaceC56665yNu, yMF ymf, CallableMemberDescriptor.Kind kind, boolean z) {
        super(interfaceC56665yNu, ymf, yOL.KWHzl.OLrzqt(), C59423zgk.hDKMBd, kind, InterfaceC56686yOo.copydefault);
        AYXKKw(true);
        values(z);
        EZpvd(false);
    }

    @Override // o.AbstractC56718yPt
    public yNG EZpvd(@NotNull AbstractC56718yPt.StateListAnimator stateListAnimator) {
        Intrinsics.checkNotNullParameter(stateListAnimator, "");
        yMF ymf = (yMF) super.EZpvd(stateListAnimator);
        if (ymf == null) {
            return null;
        }
        java.util.List<InterfaceC56695yOx> listFetchVPNInfo = ymf.fetchVPNInfo();
        Intrinsics.checkNotNullExpressionValue(listFetchVPNInfo, "");
        if ((listFetchVPNInfo instanceof java.util.Collection) && listFetchVPNInfo.isEmpty()) {
            return ymf;
        }
        java.util.Iterator<T> it = listFetchVPNInfo.iterator();
        while (it.hasNext()) {
            AbstractC59233zdF abstractC59233zdFUzCIH = ((InterfaceC56695yOx) it.next()).uzCIH();
            Intrinsics.checkNotNullExpressionValue(abstractC59233zdFUzCIH, "");
            if (C56643yMz.OLrzqt(abstractC59233zdFUzCIH) != null) {
                java.util.List<InterfaceC56695yOx> listFetchVPNInfo2 = ymf.fetchVPNInfo();
                Intrinsics.checkNotNullExpressionValue(listFetchVPNInfo2, "");
                java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listFetchVPNInfo2, 10));
                java.util.Iterator<T> it2 = listFetchVPNInfo2.iterator();
                while (it2.hasNext()) {
                    AbstractC59233zdF abstractC59233zdFUzCIH2 = ((InterfaceC56695yOx) it2.next()).uzCIH();
                    Intrinsics.checkNotNullExpressionValue(abstractC59233zdFUzCIH2, "");
                    arrayList.add(C56643yMz.OLrzqt(abstractC59233zdFUzCIH2));
                }
                return ymf.AEQbTJ(arrayList);
            }
        }
        return ymf;
    }

    @Override // o.yPK, o.AbstractC56718yPt
    public AbstractC56718yPt KWHzl(@NotNull InterfaceC56665yNu interfaceC56665yNu, yNG yng, @NotNull CallableMemberDescriptor.Kind kind, C56935yXu c56935yXu, @NotNull yOL yol, @NotNull InterfaceC56686yOo interfaceC56686yOo) {
        Intrinsics.checkNotNullParameter(interfaceC56665yNu, "");
        Intrinsics.checkNotNullParameter(kind, "");
        Intrinsics.checkNotNullParameter(yol, "");
        Intrinsics.checkNotNullParameter(interfaceC56686yOo, "");
        return new yMF(interfaceC56665yNu, (yMF) yng, kind, AxsJAY());
    }

    public final yNG AEQbTJ(java.util.List<C56935yXu> list) {
        boolean z;
        C56935yXu c56935yXu;
        int size = fetchVPNInfo().size() - list.size();
        if (size == 0) {
            java.util.List<InterfaceC56695yOx> listFetchVPNInfo = fetchVPNInfo();
            Intrinsics.checkNotNullExpressionValue(listFetchVPNInfo, "");
            java.util.List<kotlin.Pair> listValues = CollectionsKt___CollectionsKt.values(list, listFetchVPNInfo);
            if (!(listValues instanceof java.util.Collection) || !listValues.isEmpty()) {
                for (kotlin.Pair pair : listValues) {
                    if (!Intrinsics.EZpvd((C56935yXu) pair.component1(), ((InterfaceC56695yOx) pair.component2()).bR_())) {
                    }
                }
            }
            return this;
        }
        java.util.List<InterfaceC56695yOx> listFetchVPNInfo2 = fetchVPNInfo();
        Intrinsics.checkNotNullExpressionValue(listFetchVPNInfo2, "");
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listFetchVPNInfo2, 10));
        for (InterfaceC56695yOx interfaceC56695yOx : listFetchVPNInfo2) {
            C56935yXu c56935yXuBR_ = interfaceC56695yOx.bR_();
            Intrinsics.checkNotNullExpressionValue(c56935yXuBR_, "");
            int iIsConnected = interfaceC56695yOx.isConnected();
            int i = iIsConnected - size;
            if (i >= 0 && (c56935yXu = list.get(i)) != null) {
                c56935yXuBR_ = c56935yXu;
            }
            arrayList.add(interfaceC56695yOx.AEQbTJ(this, c56935yXuBR_, iIsConnected));
        }
        AbstractC56718yPt.StateListAnimator stateListAnimatorCopydefault = copydefault(TypeSubstitutor.EZpvd);
        if (list.isEmpty()) {
            z = false;
        } else {
            java.util.Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (((C56935yXu) it.next()) == null) {
                    z = true;
                    break;
                }
            }
            z = false;
        }
        AbstractC56718yPt.StateListAnimator stateListAnimatorKWHzl = stateListAnimatorCopydefault.EZpvd(z).EZpvd(arrayList).KWHzl(fJNWhG());
        Intrinsics.checkNotNullExpressionValue(stateListAnimatorKWHzl, "");
        yNG yngEZpvd = super.EZpvd(stateListAnimatorKWHzl);
        Intrinsics.copydefault(yngEZpvd);
        return yngEZpvd;
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.yMF.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final yMF AEQbTJ(@NotNull yMI ymi, boolean z) {
            Intrinsics.checkNotNullParameter(ymi, "");
            java.util.List<InterfaceC56691yOt> listAkhnZx = ymi.AkhnZx();
            yMF ymf = new yMF(ymi, null, CallableMemberDescriptor.Kind.DECLARATION, z, null);
            InterfaceC56679yOh interfaceC56679yOhDTwDnp = ymi.DTwDnp();
            java.util.List<InterfaceC56679yOh> listAhwBna = yDY.AhwBna();
            java.util.List<? extends InterfaceC56691yOt> listAhwBna2 = yDY.AhwBna();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : listAkhnZx) {
                if (((InterfaceC56691yOt) obj).values() != Variance.IN_VARIANCE) {
                    break;
                }
                arrayList.add(obj);
            }
            java.lang.Iterable<IndexedValue> iterableDCJXGO = CollectionsKt___CollectionsKt.DCJXGO(arrayList);
            java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(iterableDCJXGO, 10));
            for (IndexedValue indexedValue : iterableDCJXGO) {
                arrayList2.add(yMF.EZpvd.AEQbTJ(ymf, indexedValue.OLrzqt(), (InterfaceC56691yOt) indexedValue.AEQbTJ()));
            }
            ymf.AEQbTJ(null, interfaceC56679yOhDTwDnp, listAhwBna, listAhwBna2, arrayList2, ((InterfaceC56691yOt) CollectionsKt___CollectionsKt.AubY(listAkhnZx)).bQ_(), Modality.ABSTRACT, C56669yNy.fetchVPNInfo);
            ymf.copydefault(true);
            return ymf;
        }

        public final InterfaceC56695yOx AEQbTJ(yMF ymf, int i, InterfaceC56691yOt interfaceC56691yOt) {
            java.lang.String lowerCase;
            java.lang.String strAEQbTJ = interfaceC56691yOt.bR_().AEQbTJ();
            Intrinsics.checkNotNullExpressionValue(strAEQbTJ, "");
            if (Intrinsics.EZpvd((java.lang.Object) strAEQbTJ, (java.lang.Object) ExifInterface.GPS_DIRECTION_TRUE)) {
                lowerCase = "instance";
            } else if (Intrinsics.EZpvd((java.lang.Object) strAEQbTJ, (java.lang.Object) "E")) {
                lowerCase = "receiver";
            } else {
                lowerCase = strAEQbTJ.toLowerCase(java.util.Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "");
            }
            yOL yolOLrzqt = yOL.KWHzl.OLrzqt();
            C56935yXu c56935yXuAEQbTJ = C56935yXu.AEQbTJ(lowerCase);
            Intrinsics.checkNotNullExpressionValue(c56935yXuAEQbTJ, "");
            AbstractC59242zdO abstractC59242zdOBQ_ = interfaceC56691yOt.bQ_();
            Intrinsics.checkNotNullExpressionValue(abstractC59242zdOBQ_, "");
            InterfaceC56686yOo interfaceC56686yOo = InterfaceC56686yOo.copydefault;
            Intrinsics.checkNotNullExpressionValue(interfaceC56686yOo, "");
            return new yPP(ymf, null, i, yolOLrzqt, c56935yXuAEQbTJ, abstractC59242zdOBQ_, false, false, false, null, interfaceC56686yOo);
        }
    }
}
