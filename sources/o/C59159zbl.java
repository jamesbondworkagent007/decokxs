package o;

import java.util.LinkedHashMap;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.zbl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C59159zbl implements InterfaceC59082zaN {
    public final java.util.Map<C56929yXo, ProtoBuf.Class> AEQbTJ;
    public final Function1<C56929yXo, InterfaceC56686yOo> KWHzl;
    public final yWQ OLrzqt;
    public final yWS copydefault;

    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: kotlin.jvm.functions.Function1<? super o.yXo, ? extends o.yOo> */
    /* JADX WARN: Multi-variable type inference failed */
    public C59159zbl(@NotNull ProtoBuf.PackageFragment packageFragment, @NotNull yWS yws, @NotNull yWQ ywq, @NotNull Function1<? super C56929yXo, ? extends InterfaceC56686yOo> function1) {
        Intrinsics.checkNotNullParameter(packageFragment, "");
        Intrinsics.checkNotNullParameter(yws, "");
        Intrinsics.checkNotNullParameter(ywq, "");
        Intrinsics.checkNotNullParameter(function1, "");
        this.copydefault = yws;
        this.OLrzqt = ywq;
        this.KWHzl = function1;
        java.util.List<ProtoBuf.Class> class_List = packageFragment.getClass_List();
        Intrinsics.checkNotNullExpressionValue(class_List, "");
        LinkedHashMap linkedHashMap = new LinkedHashMap(C56548yJl.copydefault(C56423yEv.copydefault(C56403yEb.AYXKKw(class_List, 10)), 16));
        for (java.lang.Object obj : class_List) {
            linkedHashMap.put(C59160zbm.EZpvd(this.copydefault, ((ProtoBuf.Class) obj).getFqName()), obj);
        }
        this.AEQbTJ = linkedHashMap;
    }

    public final java.util.Collection<C56929yXo> copydefault() {
        return this.AEQbTJ.keySet();
    }

    @Override // o.InterfaceC59082zaN
    public C59078zaJ AEQbTJ(@NotNull C56929yXo c56929yXo) {
        Intrinsics.checkNotNullParameter(c56929yXo, "");
        ProtoBuf.Class r0 = this.AEQbTJ.get(c56929yXo);
        if (r0 == null) {
            return null;
        }
        return new C59078zaJ(this.copydefault, r0, this.OLrzqt, this.KWHzl.invoke(c56929yXo));
    }
}
