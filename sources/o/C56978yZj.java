package o;

import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yZj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C56978yZj {
    public static final C56978yZj OLrzqt = new C56978yZj();

    private C56978yZj() {
    }

    public final C56971yZc copydefault(@NotNull java.util.List<? extends AbstractC56975yZg<?>> list, @NotNull AbstractC59233zdF abstractC59233zdF) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(abstractC59233zdF, "");
        return new C56989yZu(list, abstractC59233zdF);
    }

    public static /* synthetic */ AbstractC56975yZg createConstantValue$default(C56978yZj c56978yZj, java.lang.Object obj, yNP ynp, int i, java.lang.Object obj2) {
        if ((i & 2) != 0) {
            ynp = null;
        }
        return c56978yZj.copydefault(obj, ynp);
    }

    public final AbstractC56975yZg<?> copydefault(java.lang.Object obj, yNP ynp) {
        if (obj instanceof java.lang.Byte) {
            return new C56972yZd(((java.lang.Number) obj).byteValue());
        }
        if (obj instanceof java.lang.Short) {
            return new C56991yZw(((java.lang.Number) obj).shortValue());
        }
        if (obj instanceof java.lang.Integer) {
            return new C56983yZo(((java.lang.Number) obj).intValue());
        }
        if (obj instanceof java.lang.Long) {
            return new C56987yZs(((java.lang.Number) obj).longValue());
        }
        if (obj instanceof java.lang.Character) {
            return new C56969yZa(((java.lang.Character) obj).charValue());
        }
        if (obj instanceof java.lang.Float) {
            return new C56980yZl(((java.lang.Number) obj).floatValue());
        }
        if (obj instanceof java.lang.Double) {
            return new C56974yZf(((java.lang.Number) obj).doubleValue());
        }
        if (obj instanceof java.lang.Boolean) {
            return new C56973yZe(((java.lang.Boolean) obj).booleanValue());
        }
        if (obj instanceof java.lang.String) {
            return new C56993yZy((java.lang.String) obj);
        }
        if (obj instanceof byte[]) {
            return OLrzqt(yDV.AkhnZx((byte[]) obj), ynp, PrimitiveType.BYTE);
        }
        if (obj instanceof short[]) {
            return OLrzqt(yDV.AYXKKw((short[]) obj), ynp, PrimitiveType.SHORT);
        }
        if (obj instanceof int[]) {
            return OLrzqt(yDV.wlaJM((int[]) obj), ynp, PrimitiveType.INT);
        }
        if (obj instanceof long[]) {
            return OLrzqt(yDV.OLrzqt((long[]) obj), ynp, PrimitiveType.LONG);
        }
        if (obj instanceof char[]) {
            return OLrzqt(yDV.AEQbTJ((char[]) obj), ynp, PrimitiveType.CHAR);
        }
        if (obj instanceof float[]) {
            return OLrzqt(yDV.AkhnZx((float[]) obj), ynp, PrimitiveType.FLOAT);
        }
        if (obj instanceof double[]) {
            return OLrzqt(yDV.copydefault((double[]) obj), ynp, PrimitiveType.DOUBLE);
        }
        if (obj instanceof boolean[]) {
            return OLrzqt(yDV.AEQbTJ((boolean[]) obj), ynp, PrimitiveType.BOOLEAN);
        }
        if (obj == null) {
            return new C56992yZx();
        }
        return null;
    }

    public final C56971yZc OLrzqt(java.util.List<?> list, yNP ynp, PrimitiveType primitiveType) {
        java.util.List listAxsJAYsNCnLh = CollectionsKt___CollectionsKt.AxsJAYsNCnLh(list);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = listAxsJAYsNCnLh.iterator();
        while (it.hasNext()) {
            AbstractC56975yZg abstractC56975yZgCreateConstantValue$default = createConstantValue$default(this, it.next(), null, 2, null);
            if (abstractC56975yZgCreateConstantValue$default != null) {
                arrayList.add(abstractC56975yZgCreateConstantValue$default);
            }
        }
        if (ynp != null) {
            AbstractC59242zdO abstractC59242zdOAEQbTJ = ynp.AEQbTJ().AEQbTJ(primitiveType);
            Intrinsics.checkNotNullExpressionValue(abstractC59242zdOAEQbTJ, "");
            return new C56989yZu(arrayList, abstractC59242zdOAEQbTJ);
        }
        return new C56971yZc(arrayList, new C56976yZh(primitiveType));
    }

    public static final AbstractC59233zdF EZpvd(PrimitiveType primitiveType, yNP ynp) {
        Intrinsics.checkNotNullParameter(ynp, "");
        AbstractC59242zdO abstractC59242zdOAEQbTJ = ynp.AEQbTJ().AEQbTJ(primitiveType);
        Intrinsics.checkNotNullExpressionValue(abstractC59242zdOAEQbTJ, "");
        return abstractC59242zdOAEQbTJ;
    }
}
