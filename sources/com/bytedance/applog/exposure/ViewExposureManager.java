package com.bytedance.applog.exposure;

import android.app.Activity;
import android.app.Application;
import android.graphics.Rect;
import android.view.View;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.applog.InitConfig;
import com.bytedance.applog.exposure.scroll.ScrollObserveConfig;
import com.bytedance.bdtracker.d;
import com.bytedance.bdtracker.e1;
import com.bytedance.bdtracker.h4;
import com.bytedance.bdtracker.p0;
import com.bytedance.bdtracker.r;
import com.bytedance.bdtracker.r0;
import com.bytedance.bdtracker.s0;
import com.bytedance.bdtracker.s5;
import com.bytedance.bdtracker.t0;
import com.bytedance.bdtracker.u0;
import com.bytedance.bdtracker.v0;
import com.bytedance.bdtracker.w0;
import com.bytedance.bdtracker.y0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import java.util.WeakHashMap;
import kotlin.TypeCastException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import o.C56392yDr;
import o.C56524yIo;
import o.InterfaceC56387yDm;
import o.yJA;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class ViewExposureManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeakHashMap<Activity, WeakHashMap<View, r0>> f115a;
    public boolean b;
    public w0 c;
    public ViewExposureConfig d;
    public final InterfaceC56387yDm e;
    public final InterfaceC56387yDm f;
    public final d g;
    public static final /* synthetic */ yJA[] h = {C56524yIo.copydefault(new PropertyReference1Impl(C56524yIo.AEQbTJ(ViewExposureManager.class), "task", "getTask()Lcom/bytedance/applog/exposure/task/ViewExposureTask;")), C56524yIo.copydefault(new PropertyReference1Impl(C56524yIo.AEQbTJ(ViewExposureManager.class), "scrollExposureHelper", "getScrollExposureHelper()Lcom/bytedance/applog/exposure/scroll/ScrollExposureHelper;"))};
    public static final a Companion = new a(null);
    public static final ViewExposureConfig i = new ViewExposureConfig(Float.valueOf(1.0f), null, 0, null, 14, null);

    public static final class a {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public static final class b extends Lambda implements Function0<y0> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public b() {
            super(0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function0
        public y0 invoke() {
            return new y0(ViewExposureManager.this.g);
        }
    }

    public static final class c extends Lambda implements Function0<e1> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public c() {
            super(0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function0
        public e1 invoke() {
            return new e1(ViewExposureManager.this);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ViewExposureManager(@NotNull d dVar) {
        Intrinsics.EZpvd((Object) dVar, "");
        this.g = dVar;
        this.f115a = new WeakHashMap<>();
        Application application = dVar.n;
        if (application == null) {
            throw new TypeCastException("null cannot be cast to non-null type android.app.Application");
        }
        this.c = new w0(application);
        this.d = i;
        this.e = C56392yDr.copydefault(new c());
        this.f = C56392yDr.copydefault(new b());
        InitConfig initConfig = dVar.getInitConfig();
        if (initConfig == null || !initConfig.isExposureEnabled()) {
            dVar.D.warn("[ViewExposure] init failed isExposureEnabled false.", new Object[0]);
        } else {
            if (this.b) {
                return;
            }
            this.c.a(new t0(this));
            this.c.a(new u0(this));
            this.b = true;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final /* synthetic */ e1 access$getTask$p(ViewExposureManager viewExposureManager) {
        InterfaceC56387yDm interfaceC56387yDm = viewExposureManager.e;
        yJA yja = h[0];
        return (e1) interfaceC56387yDm.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.bytedance.applog.exposure.ViewExposureManager */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void observeViewScroll$default(ViewExposureManager viewExposureManager, RecyclerView recyclerView, ViewExposureData viewExposureData, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            viewExposureData = viewExposureManager.a().b;
        }
        viewExposureManager.observeViewScroll(recyclerView, (ViewExposureData<ScrollObserveConfig>) viewExposureData);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final y0 a() {
        InterfaceC56387yDm interfaceC56387yDm = this.f;
        yJA yja = h[1];
        return (y0) interfaceC56387yDm.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void a(View view, r0 r0Var) {
        Function1<ViewExposureParam, Boolean> exposureCallback;
        d dVar = this.g;
        try {
            ViewExposureData<ViewExposureConfig> viewExposureData = r0Var.f250a;
            String eventName = viewExposureData.getEventName();
            if (eventName == null) {
                eventName = "$bav2b_exposure";
            }
            h4 h4VarA = r.a(view, true);
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("page_key", h4VarA.v);
                jSONObject.put("page_title", h4VarA.w);
                jSONObject.put("element_path", h4VarA.x);
                jSONObject.put("element_width", h4VarA.C);
                jSONObject.put("element_height", h4VarA.D);
                jSONObject.put("element_id", h4VarA.y);
                jSONObject.put("element_type", h4VarA.z);
                ArrayList<String> arrayList = h4VarA.B;
                if (arrayList != null && !arrayList.isEmpty()) {
                    jSONObject.put("positions", new JSONArray((Collection) h4VarA.B));
                }
                ArrayList<String> arrayList2 = h4VarA.A;
                if (arrayList2 != null && !arrayList2.isEmpty()) {
                    jSONObject.put("texts", new JSONArray((Collection) h4VarA.A));
                }
                jSONObject.put("$exposure_type", r0Var.c.f271a);
                JSONObject properties = viewExposureData.getProperties();
                if (properties != null) {
                    r.c(properties, jSONObject);
                }
            } catch (Exception e) {
                this.g.D.error(7, "[ViewExposure] JSON handle failed", e, new Object[0]);
                this.g.b().a(e, "sendViewExposureEvent");
            }
            ViewExposureConfig viewExposureConfig = (ViewExposureConfig) viewExposureData.getConfig();
            if (viewExposureConfig == null || (exposureCallback = viewExposureConfig.getExposureCallback()) == null) {
                exposureCallback = this.d.getExposureCallback();
            }
            if (exposureCallback.invoke(new ViewExposureParam(jSONObject)).booleanValue()) {
                this.g.onEventV3(eventName, jSONObject, 0);
                return;
            }
            this.g.D.warn("[ViewExposure] filter sendViewExposureEvent event " + eventName + ", " + jSONObject, new Object[0]);
        } catch (Throwable th) {
            dVar.D.error(7, "Run task failed", th, new Object[0]);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void b(View view, r0 r0Var) {
        v0 v0Var;
        int i2 = s0.f254a[r0Var.c.ordinal()];
        if (i2 == 1) {
            v0Var = v0.EXPOSURE_ONCE;
        } else {
            if (i2 != 2) {
                if (i2 == 3 || i2 == 4) {
                    a(view, r0Var);
                    r0Var.a(v0.EXPOSURE_MORE_THAN_ONCE);
                } else {
                    a(view, r0Var);
                }
                r0Var.b = true;
                r0Var.d = 0L;
            }
            v0Var = v0.EXPOSURE_MORE_THAN_ONCE;
        }
        r0Var.a(v0Var);
        a(view, r0Var);
        r0Var.b = true;
        r0Var.d = 0L;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0084  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void checkViewExposureFromActivity$agent_liteGlobalRelease(@NotNull Activity activity) {
        boolean z;
        long jCurrentTimeMillis;
        Intrinsics.EZpvd((Object) activity, "");
        d dVar = this.g;
        try {
            WeakHashMap<View, r0> weakHashMap = this.f115a.get(activity);
            if (weakHashMap != null) {
                Intrinsics.AEQbTJ(weakHashMap, "");
                for (Map.Entry<View, r0> entry : weakHashMap.entrySet()) {
                    View key = entry.getKey();
                    r0 value = entry.getValue();
                    ViewExposureData<ViewExposureConfig> viewExposureData = value.f250a;
                    Intrinsics.AEQbTJ(key, "");
                    ViewExposureConfig viewExposureConfig = (ViewExposureConfig) viewExposureData.getConfig();
                    Float areaRatio = viewExposureConfig != null ? viewExposureConfig.getAreaRatio() : null;
                    Intrinsics.EZpvd((Object) key, "");
                    if (r.e(key)) {
                        Rect rect = new Rect();
                        if (key.getLocalVisibleRect(rect)) {
                            z = ((float) (rect.height() * rect.width())) >= ((float) (key.getMeasuredWidth() * key.getMeasuredHeight())) * (areaRatio != null ? areaRatio.floatValue() : 0.0f);
                        }
                    }
                    if (z) {
                        jCurrentTimeMillis = value.d;
                        if (jCurrentTimeMillis == 0) {
                            jCurrentTimeMillis = System.currentTimeMillis();
                        }
                    } else {
                        jCurrentTimeMillis = 0;
                    }
                    value.d = jCurrentTimeMillis;
                    boolean z2 = value.b;
                    if (z2 != z) {
                        if (z2) {
                            value.b = false;
                        } else {
                            Intrinsics.EZpvd((Object) viewExposureData, "");
                            long jCurrentTimeMillis2 = System.currentTimeMillis();
                            long j = value.d;
                            ViewExposureConfig viewExposureConfig2 = (ViewExposureConfig) viewExposureData.getConfig();
                            if (jCurrentTimeMillis2 - j >= (viewExposureConfig2 != null ? viewExposureConfig2.getStayTriggerTime() : 0L)) {
                                Intrinsics.AEQbTJ(value, "");
                                b(key, value);
                            }
                        }
                        ViewExposureConfig viewExposureConfig3 = (ViewExposureConfig) viewExposureData.getConfig();
                        if (Intrinsics.EZpvd(viewExposureConfig3 != null ? viewExposureConfig3.getVisualDiagnosis() : null, Boolean.TRUE)) {
                            r.b(key, value.b);
                        }
                        this.g.D.debug(7, "[ViewExposure] visible change to " + value.b + ", exposureTriggerType=" + value.c + ", config=" + ((ViewExposureConfig) viewExposureData.getConfig()) + " view=" + key, new Object[0]);
                    }
                }
            }
        } catch (Throwable th) {
            dVar.D.error(7, "Run task failed", th, new Object[0]);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void disposeViewExposure(@NotNull View view) {
        Activity activityA;
        r0 r0VarRemove;
        Intrinsics.EZpvd((Object) view, "");
        d dVar = this.g;
        if (view == null) {
            activityA = null;
        } else {
            try {
                activityA = r.a(view.getContext());
            } catch (Throwable th) {
                dVar.D.error(7, "Run task failed", th, new Object[0]);
                return;
            }
        }
        if (activityA != null) {
            Intrinsics.AEQbTJ(activityA, "");
            WeakHashMap<View, r0> weakHashMap = this.f115a.get(activityA);
            if (weakHashMap == null || (r0VarRemove = weakHashMap.remove(view)) == null) {
                return;
            }
            Intrinsics.AEQbTJ(r0VarRemove, "");
            ViewExposureConfig viewExposureConfig = (ViewExposureConfig) r0VarRemove.f250a.getConfig();
            if (Intrinsics.EZpvd(viewExposureConfig != null ? viewExposureConfig.getVisualDiagnosis() : null, Boolean.TRUE)) {
                r.a(view);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Activity getCurrActivity() {
        return this.c.f281a.get();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void observeViewExposure(@NotNull View view) {
        Intrinsics.EZpvd((Object) view, "");
        observeViewExposure(view, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void observeViewExposure(@NotNull View view, ViewExposureData<ViewExposureConfig> viewExposureData) {
        Float areaRatio;
        Boolean visualDiagnosis;
        Function1<ViewExposureParam, Boolean> exposureCallback;
        Intrinsics.EZpvd((Object) view, "");
        d dVar = this.g;
        try {
            InitConfig initConfig = dVar.getInitConfig();
            if (initConfig != null && initConfig.isExposureEnabled()) {
                Activity activityA = view == null ? null : r.a(view.getContext());
                if (activityA == null) {
                    this.g.D.warn(7, "[ViewExposure] observe failed: The view context is not Activity.", new Object[0]);
                    return;
                }
                if (s5.b(view)) {
                    this.g.D.warn(7, "[ViewExposure] observe failed: The view is ignored.", new Object[0]);
                    return;
                }
                WeakHashMap<View, r0> weakHashMap = this.f115a.get(activityA);
                if (weakHashMap == null) {
                    weakHashMap = new WeakHashMap<>();
                    this.f115a.put(activityA, weakHashMap);
                }
                ViewExposureConfig viewExposureConfig = this.d;
                ViewExposureConfig viewExposureConfig2 = viewExposureData != null ? (ViewExposureConfig) viewExposureData.getConfig() : null;
                Intrinsics.EZpvd((Object) viewExposureConfig, "");
                if (viewExposureConfig2 == null || (areaRatio = viewExposureConfig2.getAreaRatio()) == null) {
                    areaRatio = viewExposureConfig.getAreaRatio();
                }
                Float f = areaRatio;
                if (viewExposureConfig2 == null || (visualDiagnosis = viewExposureConfig2.getVisualDiagnosis()) == null) {
                    visualDiagnosis = viewExposureConfig.getVisualDiagnosis();
                }
                ViewExposureConfig viewExposureConfig3 = new ViewExposureConfig(f, visualDiagnosis, viewExposureConfig2 != null ? viewExposureConfig2.getStayTriggerTime() : viewExposureConfig.getStayTriggerTime(), (viewExposureConfig2 == null || (exposureCallback = viewExposureConfig2.getExposureCallback()) == null) ? viewExposureConfig.getExposureCallback() : exposureCallback);
                weakHashMap.put(view, new r0(new ViewExposureData(viewExposureData != null ? viewExposureData.getEventName() : null, viewExposureData != null ? viewExposureData.getProperties() : null, viewExposureConfig3), false, null, 0L, 14));
                if (Intrinsics.EZpvd(viewExposureConfig3.getVisualDiagnosis(), Boolean.TRUE)) {
                    Intrinsics.EZpvd((Object) view, "");
                    if (view instanceof ImageView) {
                        ImageView imageView = (ImageView) view;
                        imageView.setImageDrawable(new p0(imageView.getDrawable()));
                    }
                    view.setBackground(new p0(view.getBackground()));
                }
                checkViewExposureFromActivity$agent_liteGlobalRelease(activityA);
                this.c.a(view);
                this.g.D.debug(7, "[ViewExposure] observe successful, data=" + viewExposureData + ", view=" + view, new Object[0]);
                return;
            }
            this.g.D.warn(7, "[ViewExposure] observe failed: InitConfig.exposureEnabled is not true.", new Object[0]);
        } catch (Throwable th) {
            dVar.D.error(7, "Run task failed", th, new Object[0]);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void observeViewScroll(@NotNull RecyclerView recyclerView, @NotNull ViewExposureData<ScrollObserveConfig> viewExposureData) {
        Intrinsics.EZpvd((Object) recyclerView, "");
        Intrinsics.EZpvd((Object) viewExposureData, "");
        a().a(recyclerView, viewExposureData);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void observeViewScroll(@NotNull ViewPager viewPager, @NotNull ViewExposureData<ScrollObserveConfig> viewExposureData) {
        Intrinsics.EZpvd((Object) viewPager, "");
        Intrinsics.EZpvd((Object) viewExposureData, "");
        a().a(viewPager, viewExposureData);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void updateExposureCheckStrategy(ExposureCheckType exposureCheckType) {
        InterfaceC56387yDm interfaceC56387yDm = this.e;
        yJA yja = h[0];
        ((e1) interfaceC56387yDm.getValue()).a(exposureCheckType);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void updateViewExposureConfig(@NotNull ViewExposureConfig viewExposureConfig) {
        Intrinsics.EZpvd((Object) viewExposureConfig, "");
        this.d = viewExposureConfig;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.bytedance.applog.exposure.ViewExposureManager */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void observeViewScroll$default(ViewExposureManager viewExposureManager, ViewPager viewPager, ViewExposureData viewExposureData, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            viewExposureData = viewExposureManager.a().b;
        }
        viewExposureManager.observeViewScroll(viewPager, (ViewExposureData<ScrollObserveConfig>) viewExposureData);
    }
}
