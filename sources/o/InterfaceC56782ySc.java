package o;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Collections;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ySc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public interface InterfaceC56782ySc {
    public static final InterfaceC56782ySc KWHzl = new InterfaceC56782ySc() { // from class: o.ySc.1
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ void KWHzl(int i) {
            java.lang.Object[] objArr = new java.lang.Object[3];
            switch (i) {
                case 1:
                    objArr[0] = "owner";
                    break;
                case 2:
                    objArr[0] = "returnType";
                    break;
                case 3:
                    objArr[0] = "valueParameters";
                    break;
                case 4:
                    objArr[0] = "typeParameters";
                    break;
                case 5:
                    objArr[0] = "descriptor";
                    break;
                case 6:
                    objArr[0] = "signatureErrors";
                    break;
                default:
                    objArr[0] = FirebaseAnalytics.Param.METHOD;
                    break;
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/SignaturePropagator$1";
            if (i == 5 || i == 6) {
                objArr[2] = "reportSignatureErrors";
            } else {
                objArr[2] = "resolvePropagatedSignature";
            }
            throw new java.lang.IllegalArgumentException(java.lang.String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // o.InterfaceC56782ySc
        public ActionBar copydefault(@NotNull InterfaceC56835yUb interfaceC56835yUb, @NotNull InterfaceC56658yNn interfaceC56658yNn, @NotNull AbstractC59233zdF abstractC59233zdF, AbstractC59233zdF abstractC59233zdF2, @NotNull java.util.List<InterfaceC56695yOx> list, @NotNull java.util.List<InterfaceC56691yOt> list2) {
            if (interfaceC56835yUb == null) {
                KWHzl(0);
            }
            if (interfaceC56658yNn == null) {
                KWHzl(1);
            }
            if (abstractC59233zdF == null) {
                KWHzl(2);
            }
            if (list == null) {
                KWHzl(3);
            }
            if (list2 == null) {
                KWHzl(4);
            }
            return new ActionBar(abstractC59233zdF, abstractC59233zdF2, list, list2, Collections.emptyList(), false);
        }

        @Override // o.InterfaceC56782ySc
        public void OLrzqt(@NotNull CallableMemberDescriptor callableMemberDescriptor, @NotNull java.util.List<java.lang.String> list) {
            if (callableMemberDescriptor == null) {
                KWHzl(5);
            }
            if (list == null) {
                KWHzl(6);
            }
            throw new java.lang.UnsupportedOperationException("Should not be called");
        }
    };

    void OLrzqt(@NotNull CallableMemberDescriptor callableMemberDescriptor, @NotNull java.util.List<java.lang.String> list);

    ActionBar copydefault(@NotNull InterfaceC56835yUb interfaceC56835yUb, @NotNull InterfaceC56658yNn interfaceC56658yNn, @NotNull AbstractC59233zdF abstractC59233zdF, AbstractC59233zdF abstractC59233zdF2, @NotNull java.util.List<InterfaceC56695yOx> list, @NotNull java.util.List<InterfaceC56691yOt> list2);

    /* JADX INFO: renamed from: o.ySc$ActionBar */
    public static class ActionBar {
        public final java.util.List<InterfaceC56691yOt> AEQbTJ;
        public final java.util.List<InterfaceC56695yOx> AYXKKw;
        public final AbstractC59233zdF EZpvd;
        public final AbstractC59233zdF KWHzl;
        public final java.util.List<java.lang.String> OLrzqt;
        public final boolean copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ void KWHzl(int i) {
            java.lang.String str = (i == 4 || i == 5 || i == 6 || i == 7) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            java.lang.Object[] objArr = new java.lang.Object[(i == 4 || i == 5 || i == 6 || i == 7) ? 2 : 3];
            switch (i) {
                case 1:
                    objArr[0] = "valueParameters";
                    break;
                case 2:
                    objArr[0] = "typeParameters";
                    break;
                case 3:
                    objArr[0] = "signatureErrors";
                    break;
                case 4:
                case 5:
                case 6:
                case 7:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/components/SignaturePropagator$PropagatedSignature";
                    break;
                default:
                    objArr[0] = "returnType";
                    break;
            }
            if (i == 4) {
                objArr[1] = "getReturnType";
            } else if (i == 5) {
                objArr[1] = "getValueParameters";
            } else if (i == 6) {
                objArr[1] = "getTypeParameters";
            } else if (i != 7) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/SignaturePropagator$PropagatedSignature";
            } else {
                objArr[1] = "getErrors";
            }
            if (i != 4 && i != 5 && i != 6 && i != 7) {
                objArr[2] = "<init>";
            }
            java.lang.String str2 = java.lang.String.format(str, objArr);
            if (i != 4 && i != 5 && i != 6 && i != 7) {
                throw new java.lang.IllegalArgumentException(str2);
            }
            throw new java.lang.IllegalStateException(str2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AbstractC59233zdF OLrzqt() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean valueOf() {
            return this.copydefault;
        }

        public ActionBar(@NotNull AbstractC59233zdF abstractC59233zdF, AbstractC59233zdF abstractC59233zdF2, @NotNull java.util.List<InterfaceC56695yOx> list, @NotNull java.util.List<InterfaceC56691yOt> list2, @NotNull java.util.List<java.lang.String> list3, boolean z) {
            if (abstractC59233zdF == null) {
                KWHzl(0);
            }
            if (list == null) {
                KWHzl(1);
            }
            if (list2 == null) {
                KWHzl(2);
            }
            if (list3 == null) {
                KWHzl(3);
            }
            this.EZpvd = abstractC59233zdF;
            this.KWHzl = abstractC59233zdF2;
            this.AYXKKw = list;
            this.AEQbTJ = list2;
            this.OLrzqt = list3;
            this.copydefault = z;
        }

        public AbstractC59233zdF EZpvd() {
            AbstractC59233zdF abstractC59233zdF = this.EZpvd;
            if (abstractC59233zdF == null) {
                KWHzl(4);
            }
            return abstractC59233zdF;
        }

        public java.util.List<InterfaceC56695yOx> copydefault() {
            java.util.List<InterfaceC56695yOx> list = this.AYXKKw;
            if (list == null) {
                KWHzl(5);
            }
            return list;
        }

        public java.util.List<InterfaceC56691yOt> AEQbTJ() {
            java.util.List<InterfaceC56691yOt> list = this.AEQbTJ;
            if (list == null) {
                KWHzl(6);
            }
            return list;
        }

        public java.util.List<java.lang.String> KWHzl() {
            java.util.List<java.lang.String> list = this.OLrzqt;
            if (list == null) {
                KWHzl(7);
            }
            return list;
        }
    }
}
