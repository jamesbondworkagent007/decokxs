package com.bytedance.bdtracker;

import android.app.Activity;
import com.bytedance.applog.exposure.ViewExposureManager;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes2.dex */
public final class u0 extends Lambda implements Function2<Activity, Boolean, Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ViewExposureManager f266a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(ViewExposureManager viewExposureManager) {
        super(2);
        this.f266a = viewExposureManager;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // kotlin.jvm.functions.Function2
    public Unit invoke(Activity activity, Boolean bool) {
        WeakHashMap weakHashMap;
        Activity activity2 = activity;
        boolean zBooleanValue = bool.booleanValue();
        if (activity2 != null && (weakHashMap = (WeakHashMap) this.f266a.f115a.get(activity2)) != null) {
            Intrinsics.AEQbTJ(weakHashMap, "");
            Iterator it = weakHashMap.entrySet().iterator();
            while (it.hasNext()) {
                r0 r0Var = (r0) ((Map.Entry) it.next()).getValue();
                if (r0Var != null) {
                    v0 v0Var = r0Var.c;
                    v0 v0Var2 = v0.NOT_EXPOSURE;
                    if (v0Var != v0Var2) {
                        v0Var2 = zBooleanValue ? v0.RESUME_FORM_BACK : v0.RESUME_FORM_PAGE;
                    }
                    r0Var.c = v0Var2;
                    r0Var.b = false;
                    r0Var.d = 0L;
                }
            }
        }
        return Unit.INSTANCE;
    }
}
