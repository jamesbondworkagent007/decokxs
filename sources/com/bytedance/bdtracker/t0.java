package com.bytedance.bdtracker;

import android.app.Activity;
import com.bytedance.applog.exposure.ViewExposureManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes2.dex */
public final class t0 extends Lambda implements Function1<Activity, Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ViewExposureManager f262a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(ViewExposureManager viewExposureManager) {
        super(1);
        this.f262a = viewExposureManager;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // kotlin.jvm.functions.Function1
    public Unit invoke(Activity activity) {
        Intrinsics.EZpvd((Object) activity, "");
        ViewExposureManager.access$getTask$p(this.f262a).b.a();
        return Unit.INSTANCE;
    }
}
