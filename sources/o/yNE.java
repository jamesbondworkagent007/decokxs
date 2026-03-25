package o;

import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import o.C56929yXo;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class yNE {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final int EZpvd(C56929yXo c56929yXo) {
        Intrinsics.checkNotNullParameter(c56929yXo, "");
        return 0;
    }

    public static final InterfaceC56658yNn copydefault(@NotNull yNP ynp, @NotNull C56929yXo c56929yXo) {
        Intrinsics.checkNotNullParameter(ynp, "");
        Intrinsics.checkNotNullParameter(c56929yXo, "");
        InterfaceC56663yNs interfaceC56663yNsEZpvd = EZpvd(ynp, c56929yXo);
        if (interfaceC56663yNsEZpvd instanceof InterfaceC56658yNn) {
            return (InterfaceC56658yNn) interfaceC56663yNsEZpvd;
        }
        return null;
    }

    public static final InterfaceC56658yNn OLrzqt(@NotNull yNP ynp, @NotNull C56929yXo c56929yXo, @NotNull yNO yno) {
        Intrinsics.checkNotNullParameter(ynp, "");
        Intrinsics.checkNotNullParameter(c56929yXo, "");
        Intrinsics.checkNotNullParameter(yno, "");
        InterfaceC56658yNn interfaceC56658yNnCopydefault = copydefault(ynp, c56929yXo);
        return interfaceC56658yNnCopydefault != null ? interfaceC56658yNnCopydefault : yno.OLrzqt(c56929yXo, C59467zhb.zuBGHE(C59467zhb.fetchVPNInfo(C59405zgS.EZpvd(c56929yXo, (Function1<? super C56929yXo, ? extends C56929yXo>) ((Function1<? super java.lang.Object, ? extends java.lang.Object>) new PropertyReference1Impl() { // from class: kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt$findNonGenericClassAcrossDependencies$typeParametersCount$1
            @Override // kotlin.jvm.internal.PropertyReference1Impl, o.InterfaceC56560yJx
            public Object get(Object obj) {
                return ((C56929yXo) obj).KWHzl();
            }
        })), yNF.OLrzqt)));
    }

    public static final InterfaceC56690yOs KWHzl(@NotNull yNP ynp, @NotNull C56929yXo c56929yXo) {
        Intrinsics.checkNotNullParameter(ynp, "");
        Intrinsics.checkNotNullParameter(c56929yXo, "");
        InterfaceC56663yNs interfaceC56663yNsEZpvd = EZpvd(ynp, c56929yXo);
        if (interfaceC56663yNsEZpvd instanceof InterfaceC56690yOs) {
            return (InterfaceC56690yOs) interfaceC56663yNsEZpvd;
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [33=6, 26=6] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x011d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final InterfaceC56663yNs EZpvd(@NotNull yNP ynp, @NotNull C56929yXo c56929yXo) {
        InterfaceC56663yNs interfaceC56663yNsEZpvd;
        Intrinsics.checkNotNullParameter(ynp, "");
        Intrinsics.checkNotNullParameter(c56929yXo, "");
        yNP ynpEZpvd = yYQ.EZpvd(ynp);
        if (ynpEZpvd == null) {
            yNY ynyCopydefault = ynp.copydefault(c56929yXo.OLrzqt());
            java.util.List<C56935yXu> listCopydefault = c56929yXo.copydefault().copydefault();
            interfaceC56663yNsEZpvd = ynyCopydefault.EZpvd().EZpvd((C56935yXu) CollectionsKt___CollectionsKt.AuCTelauCTel(listCopydefault), NoLookupLocation.FROM_DESERIALIZATION);
            if (interfaceC56663yNsEZpvd == null) {
                return null;
            }
            for (C56935yXu c56935yXu : listCopydefault.subList(1, listCopydefault.size())) {
                if (!(interfaceC56663yNsEZpvd instanceof InterfaceC56658yNn)) {
                    return null;
                }
                InterfaceC56663yNs interfaceC56663yNsEZpvd2 = ((InterfaceC56658yNn) interfaceC56663yNsEZpvd).OcIXYQ().EZpvd(c56935yXu, NoLookupLocation.FROM_DESERIALIZATION);
                interfaceC56663yNsEZpvd = interfaceC56663yNsEZpvd2 instanceof InterfaceC56658yNn ? (InterfaceC56658yNn) interfaceC56663yNsEZpvd2 : null;
                if (interfaceC56663yNsEZpvd == null) {
                    return null;
                }
            }
        } else {
            yNY ynyCopydefault2 = ynpEZpvd.copydefault(c56929yXo.OLrzqt());
            java.util.List<C56935yXu> listCopydefault2 = c56929yXo.copydefault().copydefault();
            InterfaceC56663yNs interfaceC56663yNsEZpvd3 = ynyCopydefault2.EZpvd().EZpvd((C56935yXu) CollectionsKt___CollectionsKt.AuCTelauCTel(listCopydefault2), NoLookupLocation.FROM_DESERIALIZATION);
            if (interfaceC56663yNsEZpvd3 == null) {
                interfaceC56663yNsEZpvd3 = null;
                if (interfaceC56663yNsEZpvd3 == null) {
                    return interfaceC56663yNsEZpvd3;
                }
                yNY ynyCopydefault3 = ynp.copydefault(c56929yXo.OLrzqt());
                java.util.List<C56935yXu> listCopydefault3 = c56929yXo.copydefault().copydefault();
                interfaceC56663yNsEZpvd = ynyCopydefault3.EZpvd().EZpvd((C56935yXu) CollectionsKt___CollectionsKt.AuCTelauCTel(listCopydefault3), NoLookupLocation.FROM_DESERIALIZATION);
                if (interfaceC56663yNsEZpvd == null) {
                    return null;
                }
                for (C56935yXu c56935yXu2 : listCopydefault3.subList(1, listCopydefault3.size())) {
                    if (!(interfaceC56663yNsEZpvd instanceof InterfaceC56658yNn)) {
                        return null;
                    }
                    InterfaceC56663yNs interfaceC56663yNsEZpvd4 = ((InterfaceC56658yNn) interfaceC56663yNsEZpvd).OcIXYQ().EZpvd(c56935yXu2, NoLookupLocation.FROM_DESERIALIZATION);
                    interfaceC56663yNsEZpvd = interfaceC56663yNsEZpvd4 instanceof InterfaceC56658yNn ? (InterfaceC56658yNn) interfaceC56663yNsEZpvd4 : null;
                    if (interfaceC56663yNsEZpvd == null) {
                        return null;
                    }
                }
            } else {
                for (C56935yXu c56935yXu3 : listCopydefault2.subList(1, listCopydefault2.size())) {
                    if (interfaceC56663yNsEZpvd3 instanceof InterfaceC56658yNn) {
                        InterfaceC56663yNs interfaceC56663yNsEZpvd5 = ((InterfaceC56658yNn) interfaceC56663yNsEZpvd3).OcIXYQ().EZpvd(c56935yXu3, NoLookupLocation.FROM_DESERIALIZATION);
                        interfaceC56663yNsEZpvd3 = interfaceC56663yNsEZpvd5 instanceof InterfaceC56658yNn ? (InterfaceC56658yNn) interfaceC56663yNsEZpvd5 : null;
                        if (interfaceC56663yNsEZpvd3 != null) {
                        }
                    }
                    interfaceC56663yNsEZpvd3 = null;
                }
                if (interfaceC56663yNsEZpvd3 == null) {
                }
            }
        }
        return interfaceC56663yNsEZpvd;
    }
}
