package o;

import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: o.pKk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public class C38051pKk {
    public static java.lang.reflect.Field KWHzl;
    public static java.lang.reflect.Field OLrzqt;

    private C38051pKk() {
    }

    public static android.view.View KWHzl(android.view.ViewGroup viewGroup, int[] iArr) {
        android.view.View view = null;
        if (OLrzqt() && viewGroup != null) {
            android.view.View viewKWHzl = KWHzl(viewGroup);
            while (true) {
                android.view.View viewKWHzl2 = viewKWHzl instanceof android.view.ViewGroup ? KWHzl((android.view.ViewGroup) viewKWHzl) : null;
                if (viewKWHzl2 == null) {
                    break;
                }
                viewKWHzl = viewKWHzl2;
            }
            view = viewKWHzl;
        }
        return iArr != null ? copydefault(view, iArr) : view;
    }

    public static boolean OLrzqt() {
        if (KWHzl == null) {
            try {
                java.lang.reflect.Field declaredField = java.lang.Class.forName("android.view.ViewGroup").getDeclaredField("mFirstTouchTarget");
                KWHzl = declaredField;
                declaredField.setAccessible(true);
            } catch (java.lang.Exception unused) {
            }
            try {
                java.lang.reflect.Field field = KWHzl;
                if (field != null) {
                    java.lang.reflect.Field declaredField2 = field.getType().getDeclaredField("child");
                    OLrzqt = declaredField2;
                    declaredField2.setAccessible(true);
                }
            } catch (java.lang.Exception unused2) {
            }
        }
        return (KWHzl == null || OLrzqt == null) ? false : true;
    }

    public static android.view.View KWHzl(android.view.ViewGroup viewGroup) {
        try {
            java.lang.Object obj = KWHzl.get(viewGroup);
            if (obj == null) {
                return null;
            }
            java.lang.Object obj2 = OLrzqt.get(obj);
            if (obj2 instanceof android.view.View) {
                return (android.view.View) obj2;
            }
            return null;
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    public static android.view.View copydefault(android.view.View view, int[] iArr) {
        if ((view instanceof android.widget.AbsListView) || (view instanceof RecyclerView)) {
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                android.view.View childAt = viewGroup.getChildAt(i);
                android.graphics.Rect rect = new android.graphics.Rect();
                childAt.getGlobalVisibleRect(rect);
                if (rect.contains(iArr[0], iArr[1])) {
                    return childAt;
                }
            }
        } else if ((view instanceof android.widget.ScrollView) || (view instanceof android.widget.HorizontalScrollView)) {
            return null;
        }
        return view;
    }
}
