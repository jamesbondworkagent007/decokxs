package com.okinc.business.invest_biz.utils;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.okinc.business.invest_biz.utils.LifecycleExtKt$viewLifecycle$1;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C27589jxz;
import o.yIP;
import o.yJA;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: loaded from: classes6.dex */
public final class LifecycleExtKt$viewLifecycle$1<T> implements yIP<Fragment, T>, DefaultLifecycleObserver {
    public T KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: KWHzl(Ljava/lang/Object;Lo/yJA;Ljava/lang/Object;)V */
    @Override // o.yIP
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public void KWHzl(Fragment fragment, yJA<?> yja, T t) {
        Intrinsics.checkNotNullParameter(fragment, "");
        Intrinsics.checkNotNullParameter(yja, "");
        this.KWHzl = t;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onDestroy(LifecycleOwner lifecycleOwner) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        this.KWHzl = null;
    }

    public LifecycleExtKt$viewLifecycle$1(Fragment fragment) {
        fragment.getViewLifecycleOwnerLiveData().observe(fragment, new C27589jxz.Activity(new Function1() { // from class: o.jxx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return LifecycleExtKt$viewLifecycle$1.AEQbTJ(this.EZpvd, (LifecycleOwner) obj);
            }
        }));
    }

    @Override // o.yIP, o.yIO
    public /* synthetic */ Object getValue(Object obj, yJA yja) {
        return AEQbTJ((Fragment) obj, (yJA<?>) yja);
    }

    public static final Unit AEQbTJ(LifecycleExtKt$viewLifecycle$1 lifecycleExtKt$viewLifecycle$1, LifecycleOwner lifecycleOwner) {
        Lifecycle lifecycle;
        if (lifecycleOwner != null && (lifecycle = lifecycleOwner.getLifecycle()) != null) {
            lifecycle.addObserver(lifecycleExtKt$viewLifecycle$1);
        }
        return Unit.INSTANCE;
    }

    public T AEQbTJ(Fragment fragment, yJA<?> yja) {
        Intrinsics.checkNotNullParameter(fragment, "");
        Intrinsics.checkNotNullParameter(yja, "");
        T t = this.KWHzl;
        if (t != null) {
            return t;
        }
        throw new IllegalStateException("Called before onCreateView or after onDestroyView.".toString());
    }
}
