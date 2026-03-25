package com.bytedance.bdtracker;

import android.app.ActionBar;
import android.app.Activity;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.applog.IPageMeta;
import com.bytedance.applog.annotation.PageMeta;
import com.bytedance.applog.log.LoggerImpl;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class k5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final List<String> f207a;
    public static final List<String> b;
    public static final List<Class<?>> c;
    public static final List<Class<?>> d;
    public static final List<String> e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    static {
        List<String> listSingletonList = Collections.singletonList("android.app.Activity");
        f207a = listSingletonList;
        b = Arrays.asList("android.app.Fragment", "androidx.fragment.app.Fragment", "android.support.v4.app.Fragment");
        c = new ArrayList();
        d = new ArrayList();
        e = Collections.singletonList("PageUtils");
        Iterator<String> it = listSingletonList.iterator();
        while (it.hasNext()) {
            Class<?> clsB = r.b(it.next());
            if (clsB != null) {
                c.add(clsB);
            }
        }
        Iterator<String> it2 = b.iterator();
        while (it2.hasNext()) {
            Class<?> clsB2 = r.b(it2.next());
            if (clsB2 != null) {
                d.add(clsB2);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static View a(Object obj) {
        try {
            Method method = obj.getClass().getMethod("getView", new Class[0]);
            if (method == null) {
                return null;
            }
            Object objInvoke = method.invoke(obj, new Object[0]);
            if (objInvoke instanceof View) {
                return (View) objInvoke;
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static String b(Object obj) {
        PageMeta pageMeta;
        if (obj == null) {
            return "";
        }
        if (obj instanceof IPageMeta) {
            try {
                return ((IPageMeta) obj).path();
            } catch (Throwable th) {
                LoggerImpl.global().error(e, "Cannot get path from IPageMeta", th, new Object[0]);
            }
        }
        return (b.a(b.c) || !obj.getClass().isAnnotationPresent(PageMeta.class) || (pageMeta = (PageMeta) obj.getClass().getAnnotation(PageMeta.class)) == null || TextUtils.isEmpty(pageMeta.path())) ? obj.getClass().getCanonicalName() : pageMeta.path();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00d3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00d4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String c(Object obj) {
        Object objInvoke;
        CharSequence charSequence;
        String string;
        PageMeta pageMeta;
        if (obj == null) {
            return "";
        }
        if (obj instanceof IPageMeta) {
            try {
                return ((IPageMeta) obj).title();
            } catch (Throwable th) {
                LoggerImpl.global().error(e, "Cannot get title from IPageMeta", th, new Object[0]);
            }
        }
        if (!b.a(b.c) && obj.getClass().isAnnotationPresent(PageMeta.class) && (pageMeta = (PageMeta) obj.getClass().getAnnotation(PageMeta.class)) != null && !TextUtils.isEmpty(pageMeta.title())) {
            return pageMeta.title();
        }
        if (obj instanceof Activity) {
            Activity activity = (Activity) obj;
            if (!TextUtils.isEmpty(activity.getTitle())) {
                return activity.getTitle().toString();
            }
            ActionBar actionBar = activity.getActionBar();
            if (actionBar != null) {
                string = !TextUtils.isEmpty(actionBar.getTitle()) ? actionBar.getTitle().toString() : null;
                if (TextUtils.isEmpty(string)) {
                    return string;
                }
                try {
                    PackageManager packageManager = ((Activity) obj).getPackageManager();
                    if (packageManager != null) {
                        CharSequence charSequenceLoadLabel = packageManager.getActivityInfo(((Activity) obj).getComponentName(), 0).loadLabel(packageManager);
                        if (!TextUtils.isEmpty(charSequenceLoadLabel)) {
                            return charSequenceLoadLabel.toString();
                        }
                    }
                } catch (Exception e2) {
                    LoggerImpl.global().error(e, "Cannot get title from activity label", e2, new Object[0]);
                }
            } else {
                try {
                    Class<?> clsA = r.a("android.support.v7.app.AppCompatActivity", "androidx.appcompat.app.AppCompatActivity");
                    if (clsA != null && clsA.isInstance(activity) && (objInvoke = activity.getClass().getMethod("getSupportActionBar", new Class[0]).invoke(activity, new Object[0])) != null && (charSequence = (CharSequence) objInvoke.getClass().getMethod("getTitle", new Class[0]).invoke(objInvoke, new Object[0])) != null) {
                        string = charSequence.toString();
                    }
                } catch (Exception unused) {
                }
                if (TextUtils.isEmpty(string)) {
                }
            }
        }
        return obj.getClass().getName();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static JSONObject d(Object obj) {
        if (!(obj instanceof IPageMeta)) {
            return null;
        }
        try {
            JSONObject jSONObjectPageProperties = ((IPageMeta) obj).pageProperties();
            if (jSONObjectPageProperties != null) {
                jSONObjectPageProperties.remove("page_key");
                jSONObjectPageProperties.remove("refer_page_key");
                jSONObjectPageProperties.remove("page_title");
                jSONObjectPageProperties.remove("refer_page_title");
                jSONObjectPageProperties.remove("page_path");
                jSONObjectPageProperties.remove("referrer_page_path");
                jSONObjectPageProperties.remove("duration");
                jSONObjectPageProperties.remove("is_back");
            }
            return jSONObjectPageProperties;
        } catch (Throwable th) {
            LoggerImpl.global().error(e, "Cannot get track properties from activity", th, new Object[0]);
            return null;
        }
    }
}
