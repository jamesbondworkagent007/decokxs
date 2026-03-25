package o;

import com.okinc.im.utils.IMExtKt$combine$$inlined$combine$1$3;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.internal.CombineKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public final class oGW {
    public static final java.lang.Boolean KWHzl(@NotNull android.os.Bundle bundle, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(bundle, "");
        Intrinsics.checkNotNullParameter(str, "");
        if (bundle.containsKey(str)) {
            return java.lang.Boolean.valueOf(bundle.getBoolean(str));
        }
        return null;
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: loaded from: classes23.dex */
    public static final class Activity<R> implements Flow<R> {
        public final /* synthetic */ Flow[] AEQbTJ;
        public final /* synthetic */ yHR KWHzl;

        @Override // kotlinx.coroutines.flow.Flow
        public java.lang.Object collect(FlowCollector flowCollector, Continuation continuation) {
            final Flow[] flowArr = this.AEQbTJ;
            java.lang.Object objCombineInternal = CombineKt.combineInternal(flowCollector, flowArr, new Function0<java.lang.Object[]>() { // from class: o.oGW.Activity.2
                /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
                public final java.lang.Object[] invoke() {
                    return new java.lang.Object[flowArr.length];
                }
            }, new IMExtKt$combine$$inlined$combine$1$3(null, this.KWHzl), continuation);
            return objCombineInternal == C56442yFn.copydefault() ? objCombineInternal : Unit.INSTANCE;
        }
    }
}
