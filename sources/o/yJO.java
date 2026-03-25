package o;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.ReflectLambdaKt$reflect$descriptor$1;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class yJO {
    public static final <R> InterfaceC56555yJs<R> EZpvd(@NotNull InterfaceC56388yDn<? extends R> interfaceC56388yDn) {
        Intrinsics.checkNotNullParameter(interfaceC56388yDn, "");
        Metadata metadata = (Metadata) interfaceC56388yDn.getClass().getAnnotation(Metadata.class);
        if (metadata == null) {
            return null;
        }
        java.lang.String[] strArrD1 = metadata.d1();
        if (strArrD1.length == 0) {
            strArrD1 = null;
        }
        if (strArrD1 == null) {
            return null;
        }
        kotlin.Pair<C56926yXl, ProtoBuf.Function> pairOLrzqt = C56928yXn.OLrzqt(strArrD1, metadata.d2());
        C56926yXl c56926yXlComponent1 = pairOLrzqt.component1();
        ProtoBuf.Function functionComponent2 = pairOLrzqt.component2();
        C56921yXg c56921yXg = new C56921yXg(metadata.mv(), (metadata.xi() & 8) != 0);
        java.lang.Class<?> cls = interfaceC56388yDn.getClass();
        ProtoBuf.TypeTable typeTable = functionComponent2.getTypeTable();
        Intrinsics.checkNotNullExpressionValue(typeTable, "");
        return new yKT(C56565yKb.EZpvd, (InterfaceC56687yOp) yLX.EZpvd(cls, functionComponent2, c56926yXlComponent1, new yWW(typeTable), c56921yXg, ReflectLambdaKt$reflect$descriptor$1.INSTANCE));
    }
}
