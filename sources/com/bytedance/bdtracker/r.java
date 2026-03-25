package com.bytedance.bdtracker;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CheckedTextView;
import android.widget.CompoundButton;
import android.widget.ExpandableListView;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RatingBar;
import android.widget.SeekBar;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.ToggleButton;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.internal.view.SupportMenu;
import androidx.core.view.InputDeviceCompat;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import androidx.viewpager.widget.ViewPager;
import com.amplifyframework.core.model.ModelIdentifier;
import com.bytedance.applog.R;
import com.bytedance.applog.log.IAppLogLogger;
import com.bytedance.applog.log.LoggerImpl;
import com.bytedance.bdtracker.t;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import o.yDY;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static String f249a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static Activity a(@NonNull Context context) {
        if (!(context instanceof ContextWrapper)) {
            return null;
        }
        do {
            ContextWrapper contextWrapper = (ContextWrapper) context;
            if (contextWrapper instanceof Activity) {
                return (Activity) contextWrapper;
            }
            context = contextWrapper.getBaseContext();
        } while (context instanceof ContextWrapper);
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static Class<?> a(String... strArr) {
        if (strArr == null || strArr.length == 0) {
            return null;
        }
        for (String str : strArr) {
            Class<?> clsB = b(str);
            if (clsB != null) {
                return clsB;
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static String a(Object obj) {
        return obj != null ? obj.toString() : "";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Incorrect args count in method signature: (Lcom/bytedance/bdtracker/t2;)Ljava/util/List<Ljava/lang/String;>; */
    public static List a() {
        return yDY.gEmmrt("metrics_category", "metrics_name");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final <T> JSONArray a(@NotNull List<T> list) {
        Intrinsics.EZpvd((Object) list, "");
        JSONArray jSONArray = new JSONArray();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            jSONArray.put(it.next());
        }
        return jSONArray;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static JSONObject a(@Nullable JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            Iterator<String> itKeys = jSONObject.keys();
            LinkedList linkedList = new LinkedList();
            while (itKeys.hasNext()) {
                linkedList.add(itKeys.next());
            }
            return new JSONObject(jSONObject, (String[]) linkedList.toArray(new String[0]));
        } catch (Throwable th) {
            LoggerImpl.global().error("copy safe json error", th, new Object[0]);
            return jSONObject;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static JSONObject a(JSONObject jSONObject, @Nullable JSONObject jSONObject2) {
        if (jSONObject2 != null) {
            try {
                Iterator<String> itKeys = jSONObject2.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    jSONObject.put(next, jSONObject2.opt(next));
                }
            } catch (Throwable th) {
                LoggerImpl.global().error("copy json error", th, new Object[0]);
            }
        }
        return jSONObject;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static void a(Cursor cursor) {
        if (cursor != null) {
            try {
                cursor.close();
            } catch (Throwable th) {
                LoggerImpl.global().error("closeSafely error", th, new Object[0]);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static void a(SQLiteDatabase sQLiteDatabase) {
        if (sQLiteDatabase != null) {
            try {
                sQLiteDatabase.endTransaction();
            } catch (Throwable th) {
                LoggerImpl.global().error("endDbTransactionSafely error", th, new Object[0]);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Throwable th) {
                LoggerImpl.global().error("closeSafely error", th, new Object[0]);
            }
        }
    }

    public static boolean a(Object obj, Object obj2) {
        return (obj != null || obj2 == null) && (obj == null || obj2 != null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static boolean a(Object obj, Object obj2, String str) throws JSONException {
        if (!a(obj, obj2)) {
            return false;
        }
        if (obj instanceof JSONObject) {
            return a((JSONObject) obj, (JSONObject) obj2, str);
        }
        if (!(obj instanceof JSONArray)) {
            if (obj.getClass() != obj2.getClass()) {
                return false;
            }
            String string = obj.toString();
            String string2 = obj2.toString();
            return a((Object) string, (Object) string2) && string.equals(string2);
        }
        JSONArray jSONArray = (JSONArray) obj;
        JSONArray jSONArray2 = (JSONArray) obj2;
        if (!a(jSONArray, jSONArray2)) {
            return false;
        }
        HashMap map = new HashMap();
        for (int i = 0; i < jSONArray.length(); i++) {
            Object obj3 = jSONArray.get(i);
            map.put(obj3, (!map.containsKey(obj3) || map.get(obj3) == null) ? 1 : Integer.valueOf(((Integer) map.get(obj3)).intValue() + 1));
        }
        HashMap map2 = new HashMap();
        for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
            Object obj4 = jSONArray2.get(i2);
            map2.put(obj4, (!map2.containsKey(obj4) || map2.get(obj4) == null) ? 1 : Integer.valueOf(((Integer) map2.get(obj4)).intValue() + 1));
        }
        if (map.size() != map2.size()) {
            return false;
        }
        for (Map.Entry entry : map.entrySet()) {
            if (!((Integer) entry.getValue()).equals((Integer) map2.get(entry.getKey()))) {
                return false;
            }
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static boolean a(Object obj, String str) {
        return a(obj == null, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static boolean a(Object obj, String... strArr) {
        if (strArr != null && strArr.length != 0) {
            for (String str : strArr) {
                Class<?> clsB = b(str);
                if (clsB != null && clsB.isInstance(obj)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static boolean a(String str) {
        boolean z = false;
        if (TextUtils.isEmpty(str) || "unknown".equalsIgnoreCase(str) || "Null".equalsIgnoreCase(str) || "un_support".equalsIgnoreCase(str)) {
            return false;
        }
        int i = 0;
        while (true) {
            if (i >= str.length()) {
                z = true;
                break;
            }
            if (str.charAt(i) != '0') {
                break;
            }
            i++;
        }
        return !z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static boolean a(String str, String str2) {
        return (TextUtils.isEmpty(str) && TextUtils.isEmpty(str2)) || (str != null && str.equals(str2));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static boolean a(JSONObject jSONObject, JSONObject jSONObject2, String str) throws JSONException {
        if (!a((Object) jSONObject, (Object) jSONObject2)) {
            return false;
        }
        if (jSONObject != null && jSONObject.length() != jSONObject2.length()) {
            return false;
        }
        Iterator<String> itKeys = jSONObject.keys();
        boolean zA = true;
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            zA = a(jSONObject.get(next), jSONObject2.get(next), next);
            if (!zA) {
                break;
            }
        }
        return zA;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static boolean a(JSONObject jSONObject, @Nullable Class<?>[] clsArr, @Nullable Class<?>[] clsArr2) throws JSONException {
        if (jSONObject == null) {
            return false;
        }
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            Object obj = jSONObject.get(itKeys.next());
            if (obj == null) {
                return false;
            }
            if (obj instanceof JSONArray) {
                JSONArray jSONArray = (JSONArray) obj;
                for (int i = 0; i < jSONArray.length(); i++) {
                    Object obj2 = jSONArray.get(i);
                    if (clsArr2 != null && !a(clsArr2, obj2.getClass())) {
                        return false;
                    }
                }
            } else if (clsArr != null && !a(clsArr, obj.getClass())) {
                return false;
            }
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static <T> boolean a(T[] tArr, T t) {
        for (T t2 : tArr) {
            if (t2 == t) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static Class<?> b(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String b() {
        String str;
        BufferedReader bufferedReader;
        StringBuilder sb;
        String str2 = f249a;
        if (!TextUtils.isEmpty(str2)) {
            return str2;
        }
        BufferedReader bufferedReader2 = null;
        String string = null;
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream("/proc/" + Process.myPid() + "/cmdline"), "iso-8859-1"));
            try {
                sb = new StringBuilder();
            } catch (Throwable unused) {
            }
        } catch (Throwable unused2) {
            str = null;
        }
        while (true) {
            int i = bufferedReader.read();
            if (i <= 0) {
                break;
            }
            sb.append((char) i);
            str = string;
            bufferedReader2 = bufferedReader;
            a((Closeable) bufferedReader2);
            f249a = str;
            IAppLogLogger iAppLogLoggerGlobal = LoggerImpl.global();
            StringBuilder sbA = a.a("getProcessName: ");
            sbA.append(f249a);
            iAppLogLoggerGlobal.debug(sbA.toString(), new Object[0]);
            return f249a;
        }
        string = sb.toString();
        str = string;
        bufferedReader2 = bufferedReader;
        a((Closeable) bufferedReader2);
        f249a = str;
        IAppLogLogger iAppLogLoggerGlobal2 = LoggerImpl.global();
        StringBuilder sbA2 = a.a("getProcessName: ");
        sbA2.append(f249a);
        iAppLogLoggerGlobal2.debug(sbA2.toString(), new Object[0]);
        return f249a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static String b(View view) {
        if (view == null) {
            return null;
        }
        return c(view) + "$$" + view.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static JSONObject b(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        JSONObject jSONObject2 = new JSONObject();
        a(jSONObject2, jSONObject);
        try {
            String strA = w5.a(jSONObject2.optJSONObject("oaid"));
            if (TextUtils.isEmpty(strA)) {
                return jSONObject2;
            }
            jSONObject2.put("oaid", strA);
            return jSONObject2;
        } catch (Throwable th) {
            LoggerImpl.global().error("transferHeaderOaid error", th, new Object[0]);
            return jSONObject2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static String c() {
        String str;
        synchronized (r.class) {
            str = UUID.randomUUID().toString().replace("-", "").toLowerCase() + System.currentTimeMillis();
        }
        return str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String c(View view) {
        if (view == null) {
            return "";
        }
        if (view instanceof CheckBox) {
            return "CheckBox";
        }
        if (view instanceof RadioButton) {
            return "RadioButton";
        }
        if (view instanceof ToggleButton) {
            return "ToggleButton";
        }
        if (view instanceof CompoundButton) {
            return a((Object) view, "android.widget.Switch") ? "Switch" : a((Object) view, "android.support.v7.widget.SwitchCompat", "androidx.appcompat.widget.SwitchCompat") ? "SwitchCompat" : "";
        }
        if (view instanceof Button) {
            return "Button";
        }
        if (view instanceof CheckedTextView) {
            return "CheckedTextView";
        }
        if (view instanceof TextView) {
            return "TextView";
        }
        if (view instanceof ImageView) {
            return "ImageView";
        }
        if (view instanceof RatingBar) {
            return "RatingBar";
        }
        if (view instanceof SeekBar) {
            return "SeekBar";
        }
        if (view instanceof Spinner) {
            return "Spinner";
        }
        try {
            Class<?> clsA = a("android.support.design.widget.TabLayout$TabView", "com.google.android.material.tabs.TabLayout$TabView");
            if (clsA != null) {
                if (clsA.isAssignableFrom(view.getClass())) {
                    return "TabLayout";
                }
            }
        } catch (Throwable th) {
            LoggerImpl.global().error(Collections.singletonList("WidgetUtils"), "Check isTabView failed", th, new Object[0]);
        }
        if (a((Object) view, "android.support.design.widget.NavigationView", "com.google.android.material.navigation.NavigationView")) {
            return "NavigationView";
        }
        if (view instanceof ViewGroup) {
            if (a((Object) view, "android.support.v7.widget.CardView", "androidx.cardview.widget.CardView")) {
                return "CardView";
            }
            if (a((Object) view, "android.support.design.widget.NavigationView", "com.google.android.material.navigation.NavigationView")) {
                return "NavigationView";
            }
        }
        try {
            return view.getClass().getCanonicalName();
        } catch (Throwable th2) {
            LoggerImpl.global().error(Collections.singletonList("WidgetUtils"), "getCanonicalName failed", th2, new Object[0]);
            return "";
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static JSONObject c(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject == null) {
            return jSONObject2;
        }
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            try {
                String next = itKeys.next();
                jSONObject2.put(next, jSONObject.opt(next));
            } catch (JSONException e) {
                LoggerImpl.global().error(Collections.singletonList("JsonUtils"), "Merge json interrupted.", e, new Object[0]);
            }
        }
        return jSONObject2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static boolean c(String str) {
        return !d(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Incorrect args count in method signature: (Lcom/bytedance/bdtracker/t2;)Ljava/util/List<Ljava/lang/Number;>; */
    public static List d() {
        return yDY.AhwBna();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static boolean d(View view) {
        if (view == null) {
            return false;
        }
        if (t5.a(view)) {
            return true;
        }
        if (view.getWidth() <= 0 || view.getHeight() <= 0 || view.getAlpha() <= 0.0f || !view.getLocalVisibleRect(new Rect())) {
            return false;
        }
        return !(view.getVisibility() == 0 || view.getAnimation() == null || !view.getAnimation().getFillAfter()) || view.getVisibility() == 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static boolean d(String str) {
        return str != null && str.length() > 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static boolean e(View view) {
        boolean zD = d(view);
        if (!zD) {
            return zD;
        }
        for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
            if (!(parent instanceof View)) {
                return zD;
            }
            if (!d((View) parent)) {
                break;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static boolean e(String str) {
        int length = str != null ? str.length() : 0;
        if (length < 13 || length > 128) {
            return false;
        }
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if ((cCharAt < '0' || cCharAt > '9') && ((cCharAt < 'a' || cCharAt > 'f') && ((cCharAt < 'A' || cCharAt > 'F') && cCharAt != '-'))) {
                return false;
            }
        }
        return true;
    }

    public static boolean b(JSONObject jSONObject, JSONObject jSONObject2) {
        return (jSONObject == null || jSONObject2 == null) ? jSONObject == jSONObject2 || (jSONObject != null && jSONObject.equals(jSONObject2)) : jSONObject.toString().equals(jSONObject2.toString());
    }

    public static final void a(@NotNull View view) {
        Intrinsics.EZpvd((Object) view, "");
        if (view instanceof ImageView) {
            ImageView imageView = (ImageView) view;
            if (imageView.getDrawable() instanceof p0) {
                Drawable drawable = imageView.getDrawable();
                if (drawable == null) {
                    throw new TypeCastException("null cannot be cast to non-null type com.bytedance.applog.exposure.DebugDrawable");
                }
                imageView.setImageDrawable(((p0) drawable).f244a);
            }
        }
        if (view.getBackground() instanceof p0) {
            Drawable background = view.getBackground();
            if (background == null) {
                throw new TypeCastException("null cannot be cast to non-null type com.bytedance.applog.exposure.DebugDrawable");
            }
            view.setBackground(((p0) background).f244a);
        }
    }

    public static final void b(@NotNull View view, boolean z) {
        Intrinsics.EZpvd((Object) view, "");
        int i = z ? SupportMenu.CATEGORY_MASK : InputDeviceCompat.SOURCE_ANY;
        if (view instanceof ImageView) {
            ImageView imageView = (ImageView) view;
            if (imageView.getDrawable() instanceof p0) {
                Drawable drawable = imageView.getDrawable();
                if (drawable != null) {
                    ((p0) drawable).b.setColor(i);
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type com.bytedance.applog.exposure.DebugDrawable");
                }
            }
        }
        if (view.getBackground() instanceof p0) {
            Drawable background = view.getBackground();
            if (background != null) {
                ((p0) background).b.setColor(i);
            } else {
                throw new TypeCastException("null cannot be cast to non-null type com.bytedance.applog.exposure.DebugDrawable");
            }
        }
        view.invalidate();
    }

    public static boolean a(boolean z, String str) {
        if (!z) {
            return false;
        }
        LoggerImpl.global().ast("[Assert failed] {}", null, str);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x034a  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x045f  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x04ff  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x050c  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0572  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00e9 A[PHI: r6
  0x00e9: PHI (r6v6 java.lang.String) = (r6v5 java.lang.String), (r6v5 java.lang.String), (r6v35 java.lang.String) binds: [B:42:0x00a3, B:44:0x00ab, B:46:0x00cb] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static h4 a(View view, boolean z) {
        String str;
        boolean z2;
        String str2;
        String str3;
        ArrayList arrayList;
        String name;
        String strC;
        LinkedList linkedList;
        String str4;
        Object obj;
        View viewA;
        int iIntValue;
        ArrayList arrayList2;
        String string;
        String string2;
        String strA;
        char c;
        String str5;
        StringBuilder sb;
        View view2 = view;
        Activity activityA = a(view.getContext());
        if (activityA == null && s5.a(view.getContext(), s5.a(view))) {
            return null;
        }
        if (z && s5.b(view)) {
            return null;
        }
        ArrayList arrayList3 = new ArrayList(8);
        arrayList3.add(view2);
        for (ViewParent parent = view.getParent(); parent instanceof ViewGroup; parent = parent.getParent()) {
            arrayList3.add((ViewGroup) parent);
        }
        int size = arrayList3.size();
        View view3 = (View) arrayList3.get(size - 1);
        t5.a();
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof WindowManager.LayoutParams) {
            int i = ((WindowManager.LayoutParams) layoutParams).type;
            if (i == 1) {
                str = "/MainWindow";
            } else if (i < 99 && view3.getClass() == t5.c) {
                str = "/DialogWindow";
            } else if (i >= 1999 || view3.getClass() != t5.d) {
                if (i >= 2999) {
                }
            }
        } else {
            Class<?> cls = view3.getClass();
            if (cls != t5.c) {
                str = cls == t5.d ? "/PopupWindow" : "/CustomWindow";
            }
            str = "/MainWindow";
        }
        char c2 = 11018;
        int i2 = 0;
        if (t5.a(view3) || (view3.getParent() instanceof View)) {
            z2 = false;
        } else {
            str = str + "/" + s5.a(view3.getClass());
            String strA2 = s5.a(view3, false);
            if (strA2 != null) {
                z2 = view3.getTag(84159242) != null;
                str = str + ModelIdentifier.Helper.PRIMARY_KEY_DELIMITER + strA2;
            }
        }
        if (view3 instanceof ViewGroup) {
            String strA3 = null;
            ArrayList arrayList4 = null;
            String str6 = str;
            boolean z3 = z2;
            String str7 = str6;
            ViewGroup viewGroup = (ViewGroup) view3;
            int i3 = size - 2;
            while (i3 >= 0) {
                View view4 = (View) arrayList3.get(i3);
                Object tag = view4.getTag(R.id.applog_tag_view_name);
                if (tag != null) {
                    str7 = str7 + "/" + tag;
                    arrayList2 = arrayList3;
                    str6 = "/" + tag;
                    c = c2;
                } else {
                    String strA4 = s5.a(view4.getClass());
                    int iIndexOfChild = viewGroup.indexOfChild(view4);
                    if ((!a5.i || !(viewGroup instanceof ViewPager)) && !a5.c(viewGroup)) {
                        if (viewGroup instanceof AdapterView) {
                            iIndexOfChild = ((AdapterView) viewGroup).getFirstVisiblePosition() + iIndexOfChild;
                        } else {
                            if (a5.a((Object) viewGroup) || a5.b((Object) viewGroup) || (a5.f136a && a5.b.isAssignableFrom(viewGroup.getClass()))) {
                                if (a5.a((Object) viewGroup)) {
                                    iIntValue = ((RecyclerView) viewGroup).getChildAdapterPosition(view4);
                                } else if (a5.b((Object) viewGroup)) {
                                    try {
                                        try {
                                            iIntValue = ((Integer) view4.getClass().getMethod("getChildAdapterPosition", new Class[i2]).invoke(view4, new Object[i2])).intValue();
                                        } catch (Throwable unused) {
                                            arrayList2 = arrayList3;
                                            iIntValue = -1;
                                        }
                                    } catch (Throwable unused2) {
                                        iIntValue = ((Integer) view4.getClass().getMethod("getChildPosition", new Class[i2]).invoke(view4, new Object[i2])).intValue();
                                    }
                                } else if (a5.f136a) {
                                    try {
                                        if (viewGroup.getClass() == a5.b) {
                                            iIntValue = ((Integer) a5.c.invoke(viewGroup, view4)).intValue();
                                        }
                                        arrayList2 = arrayList3;
                                    } catch (Throwable th) {
                                        arrayList2 = arrayList3;
                                        LoggerImpl.global().error("invokeCRVGetChildAdapterPositionMethod failed", th, new Object[i2]);
                                    }
                                    iIntValue = -1;
                                    if (iIntValue < 0) {
                                    }
                                    if (viewGroup instanceof ExpandableListView) {
                                        ExpandableListView expandableListView = (ExpandableListView) viewGroup;
                                        long expandableListPosition = expandableListView.getExpandableListPosition(iIntValue);
                                        if (ExpandableListView.getPackedPositionType(expandableListPosition) == 2) {
                                            if (iIntValue < expandableListView.getHeaderViewsCount()) {
                                                StringBuilder sb2 = new StringBuilder();
                                                sb2.append(str6);
                                                str5 = "/ELH[";
                                                sb2.append("/ELH[");
                                                sb2.append(iIntValue);
                                                sb2.append("]/");
                                                sb2.append((Object) strA4);
                                                sb2.append("[0]");
                                                string = sb2.toString();
                                                sb = new StringBuilder();
                                            } else {
                                                iIntValue -= expandableListView.getCount() - expandableListView.getFooterViewsCount();
                                                StringBuilder sb3 = new StringBuilder();
                                                sb3.append(str6);
                                                str5 = "/ELF[";
                                                sb3.append("/ELF[");
                                                sb3.append(iIntValue);
                                                sb3.append("]/");
                                                sb3.append((Object) strA4);
                                                sb3.append("[0]");
                                                string = sb3.toString();
                                                sb = new StringBuilder();
                                            }
                                            sb.append(str7);
                                            sb.append(str5);
                                            sb.append(iIntValue);
                                            sb.append("]/");
                                            sb.append((Object) strA4);
                                            sb.append("[0]");
                                            string2 = sb.toString();
                                        } else {
                                            int packedPositionGroup = ExpandableListView.getPackedPositionGroup(expandableListPosition);
                                            int packedPositionChild = ExpandableListView.getPackedPositionChild(expandableListPosition);
                                            if (packedPositionChild != -1) {
                                                ArrayList arrayList5 = arrayList4 == null ? new ArrayList(4) : arrayList4;
                                                arrayList5.add(String.valueOf(packedPositionGroup));
                                                arrayList5.add(String.valueOf(packedPositionChild));
                                                string = str6 + "/ELVG[" + packedPositionGroup + "]/ELVC[" + packedPositionChild + "]/" + ((Object) strA4) + "[0]";
                                                string2 = str7 + "/ELVG[-]/ELVC[-]/" + ((Object) strA4) + "[0]";
                                                arrayList4 = arrayList5;
                                            } else {
                                                ArrayList arrayList6 = arrayList4 == null ? new ArrayList(4) : arrayList4;
                                                arrayList6.add(String.valueOf(packedPositionGroup));
                                                arrayList4 = arrayList6;
                                                string = str6 + "/ELVG[" + packedPositionGroup + "]/" + ((Object) strA4) + "[0]";
                                                string2 = str7 + "/ELVG[-]/" + ((Object) strA4) + "[0]";
                                            }
                                        }
                                    } else if ((viewGroup instanceof AdapterView) || a5.a((Object) viewGroup) || ((a5.i && (viewGroup instanceof ViewPager)) || a5.b((Object) viewGroup) || a5.c(viewGroup))) {
                                        Object tag2 = viewGroup.getTag(84159247);
                                        if (tag2 instanceof List) {
                                            List list = (List) tag2;
                                            if (list.size() > 0) {
                                                iIntValue %= list.size();
                                                strA3 = s5.a((String) list.get(iIntValue));
                                            }
                                        }
                                        ArrayList arrayList7 = arrayList4 == null ? new ArrayList(4) : arrayList4;
                                        arrayList7.add(String.valueOf(iIntValue));
                                        string = str6 + "/" + ((Object) strA4) + "[" + iIntValue + "]";
                                        arrayList4 = arrayList7;
                                        string2 = str7 + "/" + ((Object) strA4) + "[-]";
                                    } else if ((a5.j && (viewGroup instanceof SwipeRefreshLayout)) || (a5.g && a((Object) viewGroup, "android.support.v4.widget.SwipeRefreshLayout"))) {
                                        string = str6 + "/" + ((Object) strA4) + "[0]";
                                        string2 = str7 + "/" + ((Object) strA4) + "[0]";
                                    } else {
                                        String str8 = str6 + "/" + ((Object) strA4) + "[" + iIntValue + "]";
                                        string2 = str7 + "/" + ((Object) strA4) + "[" + iIntValue + "]";
                                        string = str8;
                                    }
                                    strA = s5.a(view4, z3);
                                    c = 11018;
                                    if (strA != null) {
                                        if (view4.getTag(84159242) != null) {
                                            z3 = true;
                                        }
                                        string = string + ModelIdentifier.Helper.PRIMARY_KEY_DELIMITER + strA;
                                        string2 = string2 + ModelIdentifier.Helper.PRIMARY_KEY_DELIMITER + strA;
                                    }
                                    str7 = string2;
                                    str6 = string;
                                } else {
                                    arrayList2 = arrayList3;
                                    iIntValue = -1;
                                    if (iIntValue < 0) {
                                    }
                                    if (viewGroup instanceof ExpandableListView) {
                                    }
                                    strA = s5.a(view4, z3);
                                    c = 11018;
                                    if (strA != null) {
                                    }
                                    str7 = string2;
                                    str6 = string;
                                }
                                arrayList2 = arrayList3;
                                if (iIntValue < 0) {
                                }
                                if (viewGroup instanceof ExpandableListView) {
                                }
                                strA = s5.a(view4, z3);
                                c = 11018;
                                if (strA != null) {
                                }
                                str7 = string2;
                                str6 = string;
                            }
                            iIntValue = iIndexOfChild;
                            if (viewGroup instanceof ExpandableListView) {
                            }
                            strA = s5.a(view4, z3);
                            c = 11018;
                            if (strA != null) {
                            }
                            str7 = string2;
                            str6 = string;
                        }
                    } else {
                        try {
                            iIndexOfChild = ((Integer) view.getClass().getMethod("getCurrentItem", new Class[i2]).invoke(view2, new Object[i2])).intValue();
                        } catch (Throwable unused3) {
                            iIndexOfChild = viewGroup.indexOfChild(view4);
                        }
                    }
                    arrayList2 = arrayList3;
                    iIntValue = iIndexOfChild;
                    if (viewGroup instanceof ExpandableListView) {
                    }
                    strA = s5.a(view4, z3);
                    c = 11018;
                    if (strA != null) {
                    }
                    str7 = string2;
                    str6 = string;
                }
                if (!(view4 instanceof ViewGroup)) {
                    break;
                }
                i3--;
                c2 = c;
                arrayList3 = arrayList2;
                i2 = 0;
                view2 = view;
                viewGroup = (ViewGroup) view4;
            }
            str2 = str7;
            str3 = strA3;
            arrayList = arrayList4;
        } else {
            str2 = str;
            str3 = null;
            arrayList = null;
        }
        int iA = s5.a(view);
        if (s5.a(view.getContext(), iA)) {
            Map<Integer, t.b> map = t.i;
            if (map.isEmpty()) {
                obj = null;
                if (obj == null) {
                    name = obj.getClass().getName();
                    strC = k5.c(obj);
                } else {
                    if (activityA != null) {
                        name = activityA.getClass().getName();
                    } else {
                        p4 p4VarA = t.a();
                        name = p4VarA != null ? p4VarA.u : "";
                    }
                    strC = k5.c(activityA);
                }
            } else {
                for (t.b bVar : map.values()) {
                    if (bVar != null && bVar.b.get() != null && (viewA = k5.a((obj = bVar.b.get()))) != null && viewA.findViewById(view.getId()) != null) {
                        break;
                    }
                }
                obj = null;
                if (obj == null) {
                }
            }
        } else {
            Map<Integer, List<p4>> map2 = t.h;
            name = (!map2.containsKey(Integer.valueOf(iA)) || (linkedList = (LinkedList) map2.get(Integer.valueOf(iA))) == null || linkedList.isEmpty()) ? "" : ((p4) linkedList.getLast()).u;
            strC = k5.c(activityA);
        }
        String str9 = name;
        String str10 = strC;
        int width = view.getWidth();
        int height = view.getHeight();
        Object tag3 = view.getTag(R.id.applog_tag_view_id);
        if (tag3 != null) {
            String resourceEntryName = (String) tag3;
            if (TextUtils.isEmpty(resourceEntryName)) {
                if (view.getId() != -1) {
                    try {
                        resourceEntryName = view.getResources().getResourceEntryName(view.getId());
                        str4 = resourceEntryName;
                    } catch (Resources.NotFoundException unused4) {
                        str4 = "";
                    } catch (Throwable th2) {
                        LoggerImpl.global().error(Collections.singletonList("WidgetUtils"), "Get view id failed", th2, new Object[0]);
                        str4 = "";
                    }
                }
                str4 = "";
            } else {
                str4 = resourceEntryName;
            }
        }
        return new h4(str9, str10, str2, str4, c(view), width, height, width / 2, height / 2, s5.a(view, str3), arrayList);
    }

    public static void a(f3 f3Var, @NotNull JSONObject jSONObject) {
        Intrinsics.EZpvd((Object) jSONObject, "");
        Intrinsics.EZpvd((Object) jSONObject, "");
    }
}
