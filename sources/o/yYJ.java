package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.renderer.AnnotationArgumentsRenderingPolicy;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererModifier;

/* JADX INFO: loaded from: classes13.dex */
public class yYJ implements java.util.Comparator<InterfaceC56665yNu> {
    public static final yYJ EZpvd = new yYJ();
    public static final yXX AEQbTJ = yXX.AEQbTJ.AEQbTJ(new Function1<InterfaceC56959yYr, Unit>() { // from class: o.yYJ.3
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public Unit invoke(InterfaceC56959yYr interfaceC56959yYr) {
            interfaceC56959yYr.AYXKKw(false);
            interfaceC56959yYr.copydefault(true);
            interfaceC56959yYr.OLrzqt(AnnotationArgumentsRenderingPolicy.UNLESS_EMPTY);
            interfaceC56959yYr.OLrzqt(DescriptorRendererModifier.ALL);
            return Unit.INSTANCE;
        }
    });

    private yYJ() {
    }

    public static class ActionBar implements java.util.Comparator<InterfaceC56665yNu> {
        public static final ActionBar EZpvd = new ActionBar();

        private ActionBar() {
        }

        public static int OLrzqt(InterfaceC56665yNu interfaceC56665yNu) {
            if (yYH.fJNWhG(interfaceC56665yNu)) {
                return 8;
            }
            if (interfaceC56665yNu instanceof InterfaceC56660yNp) {
                return 7;
            }
            if (interfaceC56665yNu instanceof InterfaceC56676yOe) {
                return ((InterfaceC56676yOe) interfaceC56665yNu).djBIcL() == null ? 6 : 5;
            }
            if (interfaceC56665yNu instanceof yNG) {
                return ((yNG) interfaceC56665yNu).djBIcL() == null ? 4 : 3;
            }
            if (interfaceC56665yNu instanceof InterfaceC56658yNn) {
                return 2;
            }
            return interfaceC56665yNu instanceof InterfaceC56690yOs ? 1 : 0;
        }

        /* JADX DEBUG: Method merged with bridge method: compare(Ljava/lang/Object;Ljava/lang/Object;)I */
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public int compare(InterfaceC56665yNu interfaceC56665yNu, InterfaceC56665yNu interfaceC56665yNu2) {
            java.lang.Integer numAEQbTJ = AEQbTJ(interfaceC56665yNu, interfaceC56665yNu2);
            if (numAEQbTJ != null) {
                return numAEQbTJ.intValue();
            }
            return 0;
        }

        public static java.lang.Integer AEQbTJ(InterfaceC56665yNu interfaceC56665yNu, InterfaceC56665yNu interfaceC56665yNu2) {
            int iOLrzqt = OLrzqt(interfaceC56665yNu2) - OLrzqt(interfaceC56665yNu);
            if (iOLrzqt != 0) {
                return java.lang.Integer.valueOf(iOLrzqt);
            }
            if (yYH.fJNWhG(interfaceC56665yNu) && yYH.fJNWhG(interfaceC56665yNu2)) {
                return 0;
            }
            int iCompareTo = interfaceC56665yNu.bR_().compareTo(interfaceC56665yNu2.bR_());
            if (iCompareTo != 0) {
                return java.lang.Integer.valueOf(iCompareTo);
            }
            return null;
        }
    }

    /* JADX DEBUG: Method merged with bridge method: compare(Ljava/lang/Object;Ljava/lang/Object;)I */
    @Override // java.util.Comparator
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public int compare(InterfaceC56665yNu interfaceC56665yNu, InterfaceC56665yNu interfaceC56665yNu2) {
        java.lang.Integer numAEQbTJ = ActionBar.AEQbTJ(interfaceC56665yNu, interfaceC56665yNu2);
        if (numAEQbTJ != null) {
            return numAEQbTJ.intValue();
        }
        if ((interfaceC56665yNu instanceof InterfaceC56690yOs) && (interfaceC56665yNu2 instanceof InterfaceC56690yOs)) {
            yXX yxx = AEQbTJ;
            int iCompareTo = yxx.KWHzl(((InterfaceC56690yOs) interfaceC56665yNu).djBIcL()).compareTo(yxx.KWHzl(((InterfaceC56690yOs) interfaceC56665yNu2).djBIcL()));
            if (iCompareTo != 0) {
                return iCompareTo;
            }
        } else if ((interfaceC56665yNu instanceof InterfaceC56657yNm) && (interfaceC56665yNu2 instanceof InterfaceC56657yNm)) {
            InterfaceC56657yNm interfaceC56657yNm = (InterfaceC56657yNm) interfaceC56665yNu;
            InterfaceC56657yNm interfaceC56657yNm2 = (InterfaceC56657yNm) interfaceC56665yNu2;
            InterfaceC56679yOh interfaceC56679yOhDjBIcL = interfaceC56657yNm.djBIcL();
            InterfaceC56679yOh interfaceC56679yOhDjBIcL2 = interfaceC56657yNm2.djBIcL();
            if (interfaceC56679yOhDjBIcL != null) {
                yXX yxx2 = AEQbTJ;
                int iCompareTo2 = yxx2.KWHzl(interfaceC56679yOhDjBIcL.uzCIH()).compareTo(yxx2.KWHzl(interfaceC56679yOhDjBIcL2.uzCIH()));
                if (iCompareTo2 != 0) {
                    return iCompareTo2;
                }
            }
            java.util.List<InterfaceC56695yOx> listFetchVPNInfo = interfaceC56657yNm.fetchVPNInfo();
            java.util.List<InterfaceC56695yOx> listFetchVPNInfo2 = interfaceC56657yNm2.fetchVPNInfo();
            for (int i = 0; i < java.lang.Math.min(listFetchVPNInfo.size(), listFetchVPNInfo2.size()); i++) {
                yXX yxx3 = AEQbTJ;
                int iCompareTo3 = yxx3.KWHzl(listFetchVPNInfo.get(i).uzCIH()).compareTo(yxx3.KWHzl(listFetchVPNInfo2.get(i).uzCIH()));
                if (iCompareTo3 != 0) {
                    return iCompareTo3;
                }
            }
            int size = listFetchVPNInfo.size() - listFetchVPNInfo2.size();
            if (size != 0) {
                return size;
            }
            java.util.List<InterfaceC56691yOt> listAkhnZx = interfaceC56657yNm.AkhnZx();
            java.util.List<InterfaceC56691yOt> listAkhnZx2 = interfaceC56657yNm2.AkhnZx();
            for (int i2 = 0; i2 < java.lang.Math.min(listAkhnZx.size(), listAkhnZx2.size()); i2++) {
                java.util.List<AbstractC59233zdF> listDjBIcL = listAkhnZx.get(i2).djBIcL();
                java.util.List<AbstractC59233zdF> listDjBIcL2 = listAkhnZx2.get(i2).djBIcL();
                int size2 = listDjBIcL.size() - listDjBIcL2.size();
                if (size2 != 0) {
                    return size2;
                }
                for (int i3 = 0; i3 < listDjBIcL.size(); i3++) {
                    yXX yxx4 = AEQbTJ;
                    int iCompareTo4 = yxx4.KWHzl(listDjBIcL.get(i3)).compareTo(yxx4.KWHzl(listDjBIcL2.get(i3)));
                    if (iCompareTo4 != 0) {
                        return iCompareTo4;
                    }
                }
            }
            int size3 = listAkhnZx.size() - listAkhnZx2.size();
            if (size3 != 0) {
                return size3;
            }
            if ((interfaceC56657yNm instanceof CallableMemberDescriptor) && (interfaceC56657yNm2 instanceof CallableMemberDescriptor)) {
                int iOrdinal = ((CallableMemberDescriptor) interfaceC56657yNm).bW_().ordinal() - ((CallableMemberDescriptor) interfaceC56657yNm2).bW_().ordinal();
                if (iOrdinal != 0) {
                    return iOrdinal;
                }
            }
        } else if ((interfaceC56665yNu instanceof InterfaceC56658yNn) && (interfaceC56665yNu2 instanceof InterfaceC56658yNn)) {
            InterfaceC56658yNn interfaceC56658yNn = (InterfaceC56658yNn) interfaceC56665yNu;
            InterfaceC56658yNn interfaceC56658yNn2 = (InterfaceC56658yNn) interfaceC56665yNu2;
            if (interfaceC56658yNn.DbNXlk().ordinal() != interfaceC56658yNn2.DbNXlk().ordinal()) {
                return interfaceC56658yNn.DbNXlk().ordinal() - interfaceC56658yNn2.DbNXlk().ordinal();
            }
            if (interfaceC56658yNn.AuCTelauCTel() != interfaceC56658yNn2.AuCTelauCTel()) {
                return interfaceC56658yNn.AuCTelauCTel() ? 1 : -1;
            }
        } else {
            throw new java.lang.AssertionError(java.lang.String.format("Unsupported pair of descriptors:\n'%s' Class: %s\n%s' Class: %s", interfaceC56665yNu, interfaceC56665yNu.getClass(), interfaceC56665yNu2, interfaceC56665yNu2.getClass()));
        }
        yXX yxx5 = AEQbTJ;
        int iCompareTo5 = yxx5.copydefault(interfaceC56665yNu).compareTo(yxx5.copydefault(interfaceC56665yNu2));
        return iCompareTo5 != 0 ? iCompareTo5 : yYH.OLrzqt(interfaceC56665yNu).bR_().compareTo(yYH.OLrzqt(interfaceC56665yNu2).bR_());
    }
}
