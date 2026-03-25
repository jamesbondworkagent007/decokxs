package com.amplitude.android.utilities;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.Intrinsics;
import o.C5214Jc;
import o.C5247Kj;
import o.JZ;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class DefaultEventUtils$startFragmentViewedEventTracking$1 extends AdaptedFunctionReference implements Function2<String, Map<String, ? extends Object>, Unit> {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public DefaultEventUtils$startFragmentViewedEventTracking$1(Object obj) {
        super(2, obj, C5214Jc.class, "track", "track(Ljava/lang/String;Ljava/util/Map;Lcom/amplitude/core/events/EventOptions;)Lcom/amplitude/core/Amplitude;", 8);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(String str, Map<String, ? extends Object> map) {
        invoke2(str, map);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull String str, Map<String, ? extends Object> map) {
        Intrinsics.checkNotNullParameter(str, "");
        JZ.track$default((C5214Jc) this.receiver, str, map, (C5247Kj) null, 4, (Object) null);
    }
}
