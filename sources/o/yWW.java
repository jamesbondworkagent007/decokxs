package o;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class yWW {
    public final java.util.List<ProtoBuf.Type> AEQbTJ;

    public yWW(@NotNull ProtoBuf.TypeTable typeTable) {
        Intrinsics.checkNotNullParameter(typeTable, "");
        java.util.List<ProtoBuf.Type> typeList = typeTable.getTypeList();
        if (typeTable.hasFirstNullable()) {
            int firstNullable = typeTable.getFirstNullable();
            java.util.List<ProtoBuf.Type> typeList2 = typeTable.getTypeList();
            Intrinsics.checkNotNullExpressionValue(typeList2, "");
            java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(typeList2, 10));
            int i = 0;
            for (java.lang.Object obj : typeList2) {
                if (i < 0) {
                    yDY.AYXKKw();
                }
                ProtoBuf.Type typeOLrzqt = (ProtoBuf.Type) obj;
                if (i >= firstNullable) {
                    typeOLrzqt = typeOLrzqt.toBuilder().AEQbTJ(true).OLrzqt();
                }
                arrayList.add(typeOLrzqt);
                i++;
            }
            typeList = arrayList;
        }
        Intrinsics.checkNotNullExpressionValue(typeList, "");
        this.AEQbTJ = typeList;
    }

    public final ProtoBuf.Type KWHzl(int i) {
        return this.AEQbTJ.get(i);
    }
}
