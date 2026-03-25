package o;

import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager2.widget.ViewPager2;

/* JADX INFO: renamed from: o.pKi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public class C38049pKi {
    private C38049pKi() {
    }

    public static java.lang.String copydefault(android.view.Window window) {
        java.lang.String strTrim = window.getAttributes().getTitle().toString().trim();
        return java.lang.String.format("%s:%s", strTrim.substring(strTrim.indexOf("/") + 1), java.lang.Integer.valueOf(window.getAttributes().type));
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x017a A[Catch: all -> 0x01a2, TRY_ENTER, TryCatch #0 {all -> 0x01a2, blocks: (B:3:0x0005, B:5:0x000a, B:7:0x0017, B:8:0x0040, B:9:0x0042, B:10:0x004a, B:12:0x0052, B:15:0x005f, B:17:0x0063, B:51:0x016a, B:54:0x017a, B:56:0x0184, B:58:0x018f, B:20:0x0098, B:22:0x00ae, B:24:0x00b2, B:27:0x00d5, B:31:0x00ed, B:33:0x00f1, B:36:0x0111, B:38:0x0126, B:40:0x012a, B:43:0x014a, B:45:0x015f, B:47:0x0163, B:49:0x0167, B:61:0x019a, B:62:0x019c), top: B:65:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0182  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C38048pKh copydefault(android.view.View view, C38045pKe c38045pKe) {
        java.lang.StringBuilder sb;
        java.lang.String str;
        boolean z;
        android.view.View view2;
        boolean z2;
        java.lang.String str2;
        java.lang.String strCopydefault;
        C38048pKh c38048pKh = new C38048pKh();
        try {
            if (view instanceof android.webkit.WebView) {
                java.lang.String url = ((android.webkit.WebView) view).getUrl();
                if (!android.text.TextUtils.isEmpty(url)) {
                    android.net.Uri uri = android.net.Uri.parse(url);
                    c38048pKh.KWHzl = uri.getScheme() + "://" + uri.getHost() + uri.getPath();
                }
                c38048pKh.AEQbTJ = true;
            }
            sb = new java.lang.StringBuilder();
            str = null;
            z = false;
            view2 = view;
        } catch (java.lang.Throwable unused) {
        }
        while (true) {
            android.view.ViewParent parent = view2.getParent();
            if (!(parent instanceof android.view.ViewGroup)) {
                break;
            }
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) parent;
            int iIndexOfChild = viewGroup.indexOfChild(view2);
            boolean z3 = c38045pKe.EZpvd;
            if (z3 && (parent instanceof android.widget.AbsListView)) {
                c38048pKh.AEQbTJ = true;
                android.widget.AbsListView absListView = (android.widget.AbsListView) parent;
                int[] iArr = new int[2];
                absListView.getLocationOnScreen(iArr);
                str2 = "l:" + absListView.pointToPosition(((int) c38045pKe.KWHzl) - iArr[0], ((int) c38045pKe.copydefault) - iArr[1]) + "," + iIndexOfChild;
                if (str != null) {
                    str2 = str + "," + str2;
                }
            } else if (z3 && (parent instanceof RecyclerView)) {
                c38048pKh.AEQbTJ = true;
                str2 = "r:" + ((RecyclerView) parent).getChildAdapterPosition(view2) + "," + iIndexOfChild;
                if (str != null) {
                    str2 = str + "," + str2;
                }
            } else if (z3 && (parent instanceof ViewPager2)) {
                c38048pKh.AEQbTJ = true;
                str2 = "v:" + ((ViewPager2) parent).getCurrentItem() + "," + iIndexOfChild;
                if (str != null) {
                    str2 = str + "," + str2;
                }
            } else if (z3 && (parent instanceof ViewPager)) {
                c38048pKh.AEQbTJ = true;
                str2 = "v:" + ((ViewPager) parent).getCurrentItem() + "," + iIndexOfChild;
                if (str != null) {
                    str2 = str + "," + str2;
                }
            } else {
                if ((parent instanceof android.widget.ScrollView) || (parent instanceof android.widget.HorizontalScrollView)) {
                    c38048pKh.AEQbTJ = true;
                }
                z2 = false;
                strCopydefault = copydefault(view2.getContext(), view2.getId());
                if (strCopydefault == null) {
                    sb.append(strCopydefault);
                    sb.append("/");
                    z = true;
                } else if (z2) {
                    sb.append("*");
                    sb.append("/");
                } else if (!z) {
                    sb.append(iIndexOfChild);
                    sb.append("/");
                }
                view2 = viewGroup;
            }
            str = str2;
            z2 = true;
            strCopydefault = copydefault(view2.getContext(), view2.getId());
            if (strCopydefault == null) {
            }
            view2 = viewGroup;
            return c38048pKh;
        }
        if (str != null) {
            c38048pKh.EZpvd = str;
        }
        c38048pKh.OLrzqt = sb.toString();
        return c38048pKh;
    }

    public static java.lang.String OLrzqt(android.view.View view) {
        return copydefault(view.getContext(), view.getId());
    }

    public static java.lang.String EZpvd(android.view.View view) {
        java.util.ArrayList<C38046pKf> arrayList = new java.util.ArrayList(5);
        KWHzl(view, arrayList, 5);
        if (arrayList.size() == 0) {
            return "unknow";
        }
        java.util.Iterator it = arrayList.iterator();
        boolean z = false;
        while (it.hasNext()) {
            int i = ((C38046pKf) it.next()).copydefault;
            if (i == 1) {
                C38046pKf c38046pKf = null;
                C38046pKf c38046pKf2 = null;
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    C38046pKf c38046pKf3 = (C38046pKf) arrayList.get(i2);
                    if (c38046pKf3.copydefault == 1) {
                        if (c38046pKf == null) {
                            c38046pKf = c38046pKf3;
                            c38046pKf2 = c38046pKf;
                        } else {
                            if (c38046pKf3.EZpvd > c38046pKf.EZpvd) {
                                c38046pKf = c38046pKf3;
                            }
                            int[] iArr = c38046pKf3.KWHzl;
                            int i3 = iArr[0];
                            int i4 = iArr[1];
                            int[] iArr2 = c38046pKf2.KWHzl;
                            int i5 = iArr2[0];
                            int i6 = iArr2[1];
                            if ((i3 * i3) + (i4 * i4) < (i5 * i5) + (i6 * i6)) {
                                c38046pKf2 = c38046pKf3;
                            }
                        }
                    }
                }
                if (c38046pKf == c38046pKf2) {
                    return c38046pKf.AEQbTJ;
                }
                return c38046pKf2.AEQbTJ + "_&_" + c38046pKf.AEQbTJ;
            }
            if (i == 2 || i == 3) {
                z = true;
            }
        }
        if (z) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            for (C38046pKf c38046pKf4 : arrayList) {
                int i7 = c38046pKf4.copydefault;
                if (i7 == 2 || i7 == 3) {
                    sb.append("_&_");
                    sb.append(c38046pKf4.AEQbTJ);
                    break;
                }
            }
            return sb.toString();
        }
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        java.util.Iterator it2 = arrayList.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            C38046pKf c38046pKf5 = (C38046pKf) it2.next();
            if (c38046pKf5.copydefault == 5) {
                sb2.append("_&_");
                sb2.append(c38046pKf5.AEQbTJ);
                break;
            }
        }
        return sb2.toString();
    }

    public static int KWHzl(android.view.View view, java.util.List<C38046pKf> list, int i) {
        java.lang.String string;
        java.lang.Object objEZpvd;
        if (view.getVisibility() != 0) {
            return i;
        }
        if (view instanceof android.view.ViewGroup) {
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) view;
            for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                i = KWHzl(viewGroup.getChildAt(i2), list, i);
                if (i == 0) {
                    return i;
                }
            }
            return i;
        }
        if (view instanceof android.widget.TextView) {
            android.widget.TextView textView = (android.widget.TextView) view;
            if (textView.getText() == null) {
                return i;
            }
            java.lang.String strTrim = textView.getText().toString().trim();
            if (android.text.TextUtils.isEmpty(strTrim)) {
                return i;
            }
            C38046pKf c38046pKf = new C38046pKf();
            c38046pKf.copydefault = 1;
            c38046pKf.AEQbTJ = strTrim;
            c38046pKf.EZpvd = textView.getTextSize();
            int[] iArr = new int[2];
            textView.getLocationOnScreen(iArr);
            c38046pKf.KWHzl = iArr;
            list.add(c38046pKf);
        } else if (view instanceof android.widget.ImageView) {
            android.widget.ImageView imageView = (android.widget.ImageView) view;
            java.lang.Object objEZpvd2 = EZpvd(imageView, "mResource");
            if (objEZpvd2 != null && (objEZpvd2 instanceof java.lang.Integer)) {
                try {
                    string = imageView.getContext().getResources().getResourceName(((java.lang.Integer) objEZpvd2).intValue());
                } catch (java.lang.Exception unused) {
                    string = "ImageView";
                }
                if (android.text.TextUtils.isEmpty(string)) {
                    string = objEZpvd.toString();
                }
                C38046pKf c38046pKf2 = new C38046pKf();
                c38046pKf2.AEQbTJ = string;
                c38046pKf2.copydefault = 2;
                list.add(c38046pKf2);
            } else {
                string = "ImageView";
                if (android.text.TextUtils.isEmpty(string) && (objEZpvd = EZpvd(imageView, "mUri")) != null && (objEZpvd instanceof android.net.Uri)) {
                    string = objEZpvd.toString();
                }
                C38046pKf c38046pKf22 = new C38046pKf();
                c38046pKf22.AEQbTJ = string;
                c38046pKf22.copydefault = 2;
                list.add(c38046pKf22);
            }
        } else {
            C38046pKf c38046pKf3 = new C38046pKf();
            c38046pKf3.copydefault = 5;
            c38046pKf3.AEQbTJ = view.getClass().getName();
            list.add(c38046pKf3);
        }
        return i - 1;
    }

    public static java.lang.String copydefault(android.content.Context context, int i) {
        if (i == -1 || i == 0) {
            return null;
        }
        try {
            java.lang.String resourceName = context.getResources().getResourceName(i);
            java.lang.String strSubstring = resourceName.substring(resourceName.lastIndexOf("/") + 1);
            if (java.lang.Integer.toHexString(i).startsWith("7f")) {
                return strSubstring;
            }
            return strSubstring + "[01]";
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    public static java.lang.Object EZpvd(android.widget.ImageView imageView, java.lang.String str) {
        java.lang.reflect.Field declaredField = null;
        for (java.lang.Class<?> superclass = imageView.getClass(); superclass != null; superclass = superclass.getSuperclass()) {
            try {
                declaredField = superclass.getDeclaredField(str);
                declaredField.setAccessible(true);
            } catch (java.lang.NoSuchFieldException unused) {
            }
            if (declaredField != null) {
                break;
            }
        }
        if (declaredField != null) {
            try {
                return declaredField.get(imageView);
            } catch (java.lang.IllegalAccessException unused2) {
            }
        }
        return null;
    }
}
