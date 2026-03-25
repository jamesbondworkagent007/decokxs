package o;

/* JADX INFO: renamed from: o.mpx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public class C33096mpx {
    public static java.lang.Boolean AEQbTJ(java.lang.Object obj, java.util.Map<java.lang.String, java.lang.String> map) {
        try {
            java.lang.Class<?> cls = java.lang.Class.forName("androidx.fragment.app.FragmentManagerState");
            if (obj.getClass() == cls) {
                java.lang.reflect.Field declaredField = cls.getDeclaredField("mActive");
                declaredField.setAccessible(true);
                java.lang.Object obj2 = declaredField.get(obj);
                if (obj2 != null && (obj2 instanceof java.util.ArrayList)) {
                    for (int i = 0; i < ((java.util.ArrayList) obj2).size(); i++) {
                        java.lang.Object obj3 = ((java.util.ArrayList) obj2).get(i);
                        java.lang.reflect.Field declaredField2 = obj3.getClass().getDeclaredField("mInstance");
                        declaredField2.setAccessible(true);
                        java.lang.Object obj4 = declaredField2.get(obj3);
                        if (obj4 instanceof androidx.fragment.app.Fragment) {
                            pUU.copydefault("FragmentCollect", obj4.toString());
                            map.put(i + "-Fragment", obj4.toString());
                        }
                        java.lang.reflect.Field declaredField3 = obj3.getClass().getDeclaredField("mClassName");
                        declaredField3.setAccessible(true);
                        java.lang.Object obj5 = declaredField3.get(obj3);
                        java.lang.reflect.Field declaredField4 = obj3.getClass().getDeclaredField("mSavedFragmentState");
                        declaredField4.setAccessible(true);
                        java.lang.Object obj6 = declaredField4.get(obj3);
                        if ((obj6 instanceof android.os.Bundle) && (obj5 instanceof java.lang.String)) {
                            pUU.copydefault("FragmentCollect", "FragmentState name:" + obj5.toString() + " SavedFragmentState size: " + OLrzqt((android.os.Bundle) obj6));
                            java.lang.StringBuilder sb = new java.lang.StringBuilder();
                            sb.append(i);
                            sb.append("-FragmentState-name");
                            map.put(sb.toString(), obj5.toString() + "--SavedFragmentState size:" + OLrzqt((android.os.Bundle) obj6));
                            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                            sb2.append("SavedFragmentState content: ");
                            sb2.append(obj6.toString());
                            pUU.copydefault("FragmentCollect", sb2.toString());
                            map.put(i + "-SavedFragmentState-content", obj6.toString());
                        } else {
                            pUU.copydefault("FragmentCollect", "FragmentState name:" + obj5);
                            map.put(i + "-FragmentState-name", obj5 + "");
                            pUU.copydefault("FragmentCollect", "SavedFragmentState : " + obj6);
                            map.put(i + "-SavedFragmentState", obj6 + "");
                        }
                    }
                }
                java.lang.reflect.Field declaredField5 = cls.getDeclaredField("mBackStack");
                declaredField5.setAccessible(true);
                java.lang.Object obj7 = declaredField5.get(obj);
                if (obj7 != null && obj7.getClass().isArray()) {
                    for (int i2 = 0; i2 < java.lang.reflect.Array.getLength(obj7); i2++) {
                        java.lang.Object obj8 = java.lang.reflect.Array.get(obj7, i2);
                        obj8.getClass().getDeclaredField("mName").setAccessible(true);
                        java.lang.Object obj9 = declaredField5.get(obj8);
                        pUU.copydefault("FragmentCollect", "BackStack name: " + obj9.toString());
                        map.put(i2 + "-BackStack name", obj9.toString());
                    }
                }
                return java.lang.Boolean.TRUE;
            }
        } catch (java.lang.ClassNotFoundException | java.lang.IllegalAccessException | java.lang.NoSuchFieldException e) {
            pUU.AEQbTJ("tag", e);
        }
        return java.lang.Boolean.FALSE;
    }

    public static void EZpvd(android.os.Bundle bundle, java.util.Map<java.lang.String, java.lang.String> map) {
        int iOLrzqt = OLrzqt(bundle);
        pUU.copydefault("FragmentCollect", "Bundle outState size: " + iOLrzqt);
        map.put("Bundle-outState-size", java.lang.Integer.toString(iOLrzqt));
        android.os.Bundle bundle2 = new android.os.Bundle(bundle);
        try {
            for (java.lang.String str : bundle2.keySet()) {
                java.lang.Object obj = bundle.get(str);
                bundle.remove(str);
                int iOLrzqt2 = OLrzqt(bundle);
                int i = iOLrzqt - iOLrzqt2;
                pUU.copydefault("FragmentCollect", str + " size: " + i + "  " + obj);
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append("Bundle-");
                sb.append(str);
                map.put(sb.toString(), "size:" + i + "--" + obj);
                AEQbTJ(obj, map);
                iOLrzqt = iOLrzqt2;
            }
        } finally {
            bundle.putAll(bundle2);
        }
    }

    public static int OLrzqt(android.os.Bundle bundle) {
        android.os.Parcel parcelObtain = android.os.Parcel.obtain();
        try {
            parcelObtain.writeBundle(bundle);
            return parcelObtain.dataSize();
        } finally {
            parcelObtain.recycle();
        }
    }
}
