package com.engagelab.privates.common;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.View;
import com.engagelab.privates.analysis.api.Event;
import com.engagelab.privates.analysis.api.ExposureEvent;
import com.engagelab.privates.analysis.constants.MTAnalysisConstants;
import com.engagelab.privates.common.constants.MTCommonConstants;
import com.engagelab.privates.common.log.MTCommonLog;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes21.dex */
public class e {
    public static volatile e k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConcurrentHashMap<String, View> f327a = new ConcurrentHashMap<>();
    public final ConcurrentHashMap<String, Map<String, Object>> b = new ConcurrentHashMap<>();
    public ConcurrentHashMap<String, Boolean> c = new ConcurrentHashMap<>();
    public final ConcurrentHashMap<String, Integer> d = new ConcurrentHashMap<>();
    public ConcurrentHashMap<String, Long> e = new ConcurrentHashMap<>();
    public Activity f;
    public String g;
    public f h;
    public int i;
    public int j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public static e a() {
        if (k == null) {
            synchronized (e.class) {
                k = new e();
            }
        }
        return k;
    }

    public void b(Context context, Bundle bundle) {
        this.f = null;
        this.g = null;
        this.f327a.clear();
        this.b.clear();
        this.c.clear();
        this.e.clear();
        this.d.clear();
        this.i = 0;
        this.j = 0;
    }

    public void c(Context context, Bundle bundle) {
        if (this.f == null) {
            return;
        }
        if (TextUtils.equals(this.g, bundle.getString(MTCommonConstants.Lifecycle.KEY_ACTIVITY))) {
            View decorView = this.f.getWindow().getDecorView();
            if (this.h == null) {
                return;
            }
            decorView.getViewTreeObserver().removeOnDrawListener(this.h);
            this.h = null;
        }
    }

    public void d(Context context, Bundle bundle) {
        if (this.f == null) {
            return;
        }
        if (TextUtils.equals(this.g, bundle.getString(MTCommonConstants.Lifecycle.KEY_ACTIVITY))) {
            View decorView = this.f.getWindow().getDecorView();
            if (this.h != null) {
                return;
            }
            this.h = new f(this.f.getApplicationContext());
            decorView.getViewTreeObserver().addOnDrawListener(this.h);
        }
    }

    public void a(Context context, ExposureEvent exposureEvent) {
        Activity activity = exposureEvent.activity;
        if (activity == null) {
            return;
        }
        this.f = activity;
        this.g = activity.getClass().getCanonicalName();
        exposureEvent.activity = null;
        String str = exposureEvent.tag;
        if (TextUtils.isEmpty(str)) {
            this.f = null;
            return;
        }
        if (exposureEvent.view == null) {
            this.f = null;
            return;
        }
        Map<String, Object> extraAttrMap = exposureEvent.getExtraAttrMap();
        if (extraAttrMap != null && !extraAttrMap.isEmpty()) {
            this.b.put(str, extraAttrMap);
        }
        this.f327a.put(exposureEvent.tag, exposureEvent.view);
        if (this.h != null) {
            return;
        }
        this.h = new f(this.f.getApplicationContext());
        this.f.getWindow().getDecorView().getViewTreeObserver().addOnDrawListener(this.h);
    }

    public final void b(Context context, String str) {
        int iIntValue;
        if (this.c.containsKey(str) && this.c.get(str).booleanValue()) {
            return;
        }
        this.c.put(str, Boolean.TRUE);
        int iIntValue2 = (this.d.containsKey(str) ? this.d.get(str).intValue() : 0) + 1;
        MTCommonLog.d("MTExposureBusiness", "in screen tag:" + str + ",currentCount:" + iIntValue2);
        this.d.put(str, Integer.valueOf(iIntValue2));
        long jLongValue = this.e.containsKey(str) ? this.e.get(str).longValue() : 0L;
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - jLongValue > 15000) {
            if (!TextUtils.isEmpty(str) && (iIntValue = this.d.get(str).intValue()) > 0) {
                a(context, str, iIntValue);
            }
            this.d.put(str, 0);
            this.e.put(str, Long.valueOf(jCurrentTimeMillis));
        }
    }

    public void a(Context context, Bundle bundle) {
        if (bundle == null) {
            return;
        }
        this.f = null;
        this.g = null;
        this.f327a.clear();
        this.b.clear();
        this.c.clear();
        this.e.clear();
        this.d.clear();
        this.i = 0;
        this.j = 0;
    }

    public void a(Context context) {
        try {
            if (this.f == null || this.f327a.isEmpty()) {
                return;
            }
            if (this.i == 0 && this.j == 0) {
                DisplayMetrics displayMetrics = new DisplayMetrics();
                this.f.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
                this.i = displayMetrics.widthPixels;
                this.j = displayMetrics.heightPixels;
            }
            for (Map.Entry<String, View> entry : this.f327a.entrySet()) {
                String key = entry.getKey();
                View value = entry.getValue();
                if (!TextUtils.isEmpty(key) && value != null) {
                    if (a(value)) {
                        a(context, key);
                    } else {
                        b(context, key);
                    }
                }
            }
        } catch (Throwable th) {
            MTCommonLog.w("MTExposureBusiness", "onDrawDone failed " + th.getMessage());
        }
    }

    public final boolean a(View view) {
        if (view.getVisibility() == 4 || view.getAlpha() < 0.1d || !view.getGlobalVisibleRect(new Rect(0, 0, this.i, this.j))) {
            return true;
        }
        int measuredHeight = view.getMeasuredHeight();
        int measuredWidth = view.getMeasuredWidth();
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int i = iArr[0];
        int i2 = iArr[1];
        return i < 0 || i2 < 0 || (this.i - i) - measuredWidth < 0 || (this.j - i2) - measuredHeight < 0;
    }

    public final void a(Context context, String str) {
        if (this.c.containsKey(str) && this.c.get(str).booleanValue()) {
            MTCommonLog.d("MTExposureBusiness", "out screen tag:" + str + ",currentCount:" + this.d.get(str));
            this.c.put(str, Boolean.FALSE);
        }
    }

    public final void a(Context context, String str, int i) {
        Map<String, Object> map;
        if (TextUtils.isEmpty(str)) {
            MTCommonLog.w("MTExposureBusiness", "view tag can't be null");
            return;
        }
        if (i <= 0) {
            return;
        }
        MTCommonLog.d("MTExposureBusiness", "onEvent exposure tag:" + str + ",count:" + i + ",thread:" + Thread.currentThread().getName());
        Event event = new Event(MTAnalysisConstants.TYPE_EXPOSURE);
        event.putExtraAttr("tag", str);
        event.putExtraAttr("count", Integer.valueOf(i));
        ConcurrentHashMap<String, Map<String, Object>> concurrentHashMap = this.b;
        if (concurrentHashMap != null && (map = concurrentHashMap.get(str)) != null) {
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                event.putExtraAttr(entry.getKey(), entry.getValue());
            }
        }
        d.c().a(context, event);
    }
}
