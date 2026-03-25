package com.bytedance.bdtracker;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.applog.InitConfig;
import com.bytedance.applog.exposure.ViewExposureData;
import com.bytedance.applog.exposure.ViewExposureParam;
import com.bytedance.applog.exposure.scroll.ScrollObserveConfig;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o.yHO;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ScrollObserveConfig f303a;
    public final ViewExposureData<ScrollObserveConfig> b;
    public final d c;

    public static final class a extends Lambda implements yHO<Float, Float, Integer, Unit> {
        public final /* synthetic */ ViewExposureData b;
        public final /* synthetic */ RecyclerView c;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ViewExposureData viewExposureData, RecyclerView recyclerView) {
            super(3);
            this.b = viewExposureData;
            this.c = recyclerView;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // o.yHO
        public Unit invoke(Float f, Float f2, Integer num) {
            y0.this.a(this.c, this.b, f.floatValue(), f2.floatValue(), num.intValue());
            return Unit.INSTANCE;
        }
    }

    public static final class b extends Lambda implements yHO<Float, Float, Integer, Unit> {
        public final /* synthetic */ ViewExposureData b;
        public final /* synthetic */ ViewPager c;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ViewExposureData viewExposureData, ViewPager viewPager) {
            super(3);
            this.b = viewExposureData;
            this.c = viewPager;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // o.yHO
        public Unit invoke(Float f, Float f2, Integer num) {
            y0.this.a(this.c, this.b, f.floatValue(), f2.floatValue(), num.intValue());
            return Unit.INSTANCE;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public y0(@NotNull d dVar) {
        Intrinsics.EZpvd((Object) dVar, "");
        this.c = dVar;
        ScrollObserveConfig scrollObserveConfig = new ScrollObserveConfig(0, null, 3, null);
        this.f303a = scrollObserveConfig;
        this.b = new ViewExposureData<>(null, null, scrollObserveConfig, 3, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void a(@NotNull RecyclerView recyclerView, @NotNull ViewExposureData<ScrollObserveConfig> viewExposureData) {
        Intrinsics.EZpvd((Object) recyclerView, "");
        Intrinsics.EZpvd((Object) viewExposureData, "");
        d dVar = this.c;
        try {
            InitConfig initConfig = dVar.getInitConfig();
            if (initConfig == null || !initConfig.isScrollObserveEnabled()) {
                this.c.D.warn("[ScrollExposure] observeScrollExposure failed isScrollExposureEnabled false.", new Object[0]);
            } else {
                ScrollObserveConfig scrollObserveConfig = (ScrollObserveConfig) viewExposureData.getConfig();
                recyclerView.addOnScrollListener(new x0(scrollObserveConfig != null ? scrollObserveConfig.getMinOffset() : 30, new a(viewExposureData, recyclerView)));
            }
        } catch (Throwable th) {
            dVar.D.error(7, "Run task failed", th, new Object[0]);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void a(@NotNull ViewPager viewPager, @NotNull ViewExposureData<ScrollObserveConfig> viewExposureData) {
        Intrinsics.EZpvd((Object) viewPager, "");
        Intrinsics.EZpvd((Object) viewExposureData, "");
        d dVar = this.c;
        try {
            InitConfig initConfig = dVar.getInitConfig();
            if (initConfig == null || !initConfig.isScrollObserveEnabled()) {
                this.c.D.warn("[ScrollExposure] observeScrollExposure failed isScrollExposureEnabled false.", new Object[0]);
            } else {
                ScrollObserveConfig scrollObserveConfig = (ScrollObserveConfig) viewExposureData.getConfig();
                viewPager.addOnPageChangeListener(new z0(scrollObserveConfig != null ? scrollObserveConfig.getMinOffset() : 30, new b(viewExposureData, viewPager)));
            }
        } catch (Throwable th) {
            dVar.D.error(7, "Run task failed", th, new Object[0]);
        }
    }

    public final void a(View view, ViewExposureData<ScrollObserveConfig> viewExposureData, float f, float f2, int i) {
        Function1<ViewExposureParam, Boolean> scrollCallback;
        String eventName = viewExposureData.getEventName();
        if (eventName == null) {
            eventName = "$bav2b_slide";
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
            jSONObject.put("$offsetX", Float.valueOf(f));
            jSONObject.put("$offsetY", Float.valueOf(f2));
            jSONObject.put("$direction", i);
            JSONObject properties = viewExposureData.getProperties();
            if (properties != null) {
                r.c(properties, jSONObject);
            }
        } catch (Exception e) {
            this.c.D.error(7, "[ScrollExposure] JSON handle failed", e, new Object[0]);
        }
        ScrollObserveConfig scrollObserveConfig = (ScrollObserveConfig) viewExposureData.getConfig();
        if (scrollObserveConfig == null || (scrollCallback = scrollObserveConfig.getScrollCallback()) == null) {
            scrollCallback = this.f303a.getScrollCallback();
        }
        if (scrollCallback.invoke(new ViewExposureParam(jSONObject)).booleanValue()) {
            this.c.onEventV3(eventName, jSONObject, 0);
            return;
        }
        this.c.D.warn("[ScrollExposure] filter sendScrollExposure event " + eventName + ", " + jSONObject, new Object[0]);
    }
}
