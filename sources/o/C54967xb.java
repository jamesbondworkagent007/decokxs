package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C54967xb {
    public static /* synthetic */ InterfaceC52697wV copy$default(InterfaceC52697wV interfaceC52697wV, java.lang.String str, java.lang.String str2, java.lang.String str3, C5173Hn c5173Hn, java.lang.String str4, InterfaceC57843yq interfaceC57843yq, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = interfaceC52697wV.EZpvd();
        }
        if ((i & 2) != 0) {
            str2 = interfaceC52697wV.copydefault();
        }
        java.lang.String str5 = str2;
        if ((i & 4) != 0) {
            str3 = interfaceC52697wV.djBIcL();
        }
        java.lang.String str6 = str3;
        if ((i & 8) != 0) {
            c5173Hn = interfaceC52697wV.AEQbTJ();
        }
        C5173Hn c5173Hn2 = c5173Hn;
        if ((i & 16) != 0) {
            str4 = interfaceC52697wV.KWHzl();
        }
        java.lang.String str7 = str4;
        if ((i & 32) != 0) {
            interfaceC57843yq = interfaceC52697wV.OLrzqt();
        }
        return EZpvd(interfaceC52697wV, str, str5, str6, c5173Hn2, str7, interfaceC57843yq);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002b  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final InterfaceC52697wV EZpvd(@NotNull InterfaceC52697wV interfaceC52697wV, @NotNull java.lang.String str, @NotNull java.lang.String str2, java.lang.String str3, C5173Hn c5173Hn, java.lang.String str4, InterfaceC57843yq interfaceC57843yq) {
        InterfaceC56293yA interfaceC56293yAOLrzqt;
        Intrinsics.checkNotNullParameter(interfaceC52697wV, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        InterfaceC57843yq interfaceC57843yq2 = interfaceC57843yq;
        interfaceC57843yq2 = interfaceC57843yq;
        if (interfaceC52697wV.KWHzl() != null && str4 == null) {
            if (interfaceC57843yq == null || (interfaceC56293yAOLrzqt = C58108yv.OLrzqt(interfaceC57843yq)) == null) {
                interfaceC57843yq2 = null;
            } else {
                interfaceC56293yAOLrzqt.EZpvd(C5046Cq.AEQbTJ.EZpvd());
                boolean zEZpvd = C58108yv.EZpvd(interfaceC56293yAOLrzqt);
                interfaceC57843yq2 = interfaceC56293yAOLrzqt;
                if (!zEZpvd) {
                }
            }
        }
        return InterfaceC52697wV.copydefault.copydefault(str, str2, str3, c5173Hn, str4, interfaceC57843yq2);
    }
}
