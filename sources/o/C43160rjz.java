package o;

import android.graphics.RectF;
import androidx.fragment.app.FragmentActivity;
import com.immomo.mls.view.gallery.image.GalleryImageSource;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.rjz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C43160rjz {
    public static final C43160rjz KWHzl = new C43160rjz();

    private C43160rjz() {
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v12, resolved type: o.asK$ActionBar */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void EZpvd(@NotNull FragmentActivity fragmentActivity, @NotNull java.lang.String str, @NotNull java.util.ArrayList<GalleryImageSource> arrayList, int i, @NotNull java.lang.Object[] objArr, @NotNull java.util.HashMap<java.lang.String, java.lang.Object> map) {
        Intrinsics.checkNotNullParameter(fragmentActivity, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(arrayList, "");
        Intrinsics.checkNotNullParameter(objArr, "");
        Intrinsics.checkNotNullParameter(map, "");
        if (arrayList.isEmpty() || objArr.length == 0) {
            return;
        }
        java.lang.Object objGEmmrt = yDV.gEmmrt(objArr, i);
        if (objGEmmrt == null) {
            objGEmmrt = yDV.zsXlph(objArr);
        }
        android.view.View view = objGEmmrt instanceof android.view.View ? (android.view.View) objGEmmrt : null;
        if (view == null) {
            return;
        }
        java.lang.Object obj = map.get("cornerRadius");
        java.lang.Integer num = obj instanceof java.lang.Integer ? (java.lang.Integer) obj : null;
        int iIntValue = num != null ? num.intValue() : 12;
        kotlin.Pair pairEZpvd = C43110rjB.EZpvd(view);
        RectF rectF = (RectF) pairEZpvd.component1();
        java.lang.String str2 = (java.lang.String) pairEZpvd.component2();
        float[] fArr = {rectF.left, rectF.top, rectF.right, rectF.bottom};
        java.util.ArrayList arrayList2 = new java.util.ArrayList(objArr.length);
        for (java.lang.Object obj2 : objArr) {
            android.view.View view2 = obj2 instanceof android.view.View ? (android.view.View) obj2 : null;
            if (view2 != null) {
                arrayList2.add(C43110rjB.EZpvd(view2).getFirst());
            } else {
                arrayList2.add(new RectF());
            }
        }
        ActivityC7885asK.Companion.OLrzqt(fragmentActivity, str, arrayList, i, iIntValue, str2, 150L, fArr, arrayList2, false);
    }

    public final void KWHzl(@NotNull FragmentActivity fragmentActivity, @NotNull java.lang.String str, @NotNull java.util.ArrayList<GalleryImageSource> arrayList, int i, @NotNull RectF[] rectFArr, @NotNull java.util.HashMap<java.lang.String, java.lang.Object> map) {
        Intrinsics.checkNotNullParameter(fragmentActivity, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(arrayList, "");
        Intrinsics.checkNotNullParameter(rectFArr, "");
        Intrinsics.checkNotNullParameter(map, "");
        if (arrayList.isEmpty()) {
            return;
        }
        java.lang.Object obj = map.get("cornerRadius");
        java.lang.Integer num = obj instanceof java.lang.Integer ? (java.lang.Integer) obj : null;
        int iIntValue = num != null ? num.intValue() : 12;
        RectF rectF = (RectF) yDV.gEmmrt(rectFArr, i);
        float[] fArr = rectF != null ? new float[]{rectF.left, rectF.top, rectF.right, rectF.bottom} : null;
        java.util.ArrayList<RectF> arrayList2 = new java.util.ArrayList<>(rectFArr.length);
        for (RectF rectF2 : rectFArr) {
            if (rectF2 != null) {
                arrayList2.add(new RectF(rectF2));
            } else {
                arrayList2.add(new RectF());
            }
        }
        ActivityC7885asK.Companion.OLrzqt(fragmentActivity, str, arrayList, i, iIntValue, "", 150L, fArr, arrayList2, true);
    }
}
