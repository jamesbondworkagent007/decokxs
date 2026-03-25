package o;

import androidx.lifecycle.ViewModelKt;
import com.okinc.trade.arch.util.BaseViewModelExtKt$executeUseCaseInner$1;
import com.okinc.trade.arch.util.BaseViewModelExtKt$executeUseCaseInner$2;
import com.okinc.trade.arch.util.BaseViewModelExtKt$executeUseCaseInner$3;
import com.okinc.trade.arch.util.BaseViewModelExtKt$executeUseCaseInner$4;
import com.okinc.trade.arch.util.BaseViewModelExtKt$executeUseCaseInner$5;
import com.okinc.trade.arch.util.BaseViewModelExtKt$executeUseCaseInner$6;
import com.okinc.trade.arch.util.BaseViewModelExtKt$executeUseCaseInner$7;
import com.okinc.trade.arch.util.BaseViewModelExtKt$executeUseCaseInner$8;
import com.okinc.trade.arch.util.BaseViewModelExtKt$executeUseCaseInner$executeUseCaseInner$1;
import com.okinc.trade.arch.util.BaseViewModelExtKt$executeUseCaseWithSideEffect$1;
import com.okinc.trade.arch.util.BaseViewModelExtKt$executeUseCaseWithSideEffect$2;
import com.okinc.trade.arch.util.BaseViewModelExtKt$executeUseCaseWithSideEffect$3;
import com.okinc.trade.arch.util.BaseViewModelExtKt$executeUseCaseWithSideEffect$4;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.unN, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C49373unN {
    public static /* synthetic */ void executeUseCaseInner$default(AbstractC49411unz abstractC49411unz, InterfaceC56554yJr interfaceC56554yJr, java.lang.String str, Function1 function1, Function1 function12, Function2 function2, Function2 function22, Function2 function23, Function1 function13, int i, java.lang.Object obj) {
        InterfaceC56554yJr interfaceC56554yJr2 = (i & 1) != 0 ? null : interfaceC56554yJr;
        OLrzqt(abstractC49411unz, interfaceC56554yJr2, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : function1, (i & 8) != 0 ? new BaseViewModelExtKt$executeUseCaseInner$1(interfaceC56554yJr2, abstractC49411unz, null) : function12, (i & 16) != 0 ? new BaseViewModelExtKt$executeUseCaseInner$2(interfaceC56554yJr2, abstractC49411unz, null) : function2, (i & 32) != 0 ? new BaseViewModelExtKt$executeUseCaseInner$3(interfaceC56554yJr2, abstractC49411unz, null) : function22, (i & 64) != 0 ? new BaseViewModelExtKt$executeUseCaseInner$4(interfaceC56554yJr2, abstractC49411unz, null) : function23, function13);
    }

    public static final <T extends InterfaceC49369unJ<T>, T> void copydefault(AbstractC49411unz<T> abstractC49411unz, java.lang.String str, Function1<? super Continuation<? super Unit>, ? extends java.lang.Object> function1, Function1<? super Continuation<? super T>, ? extends java.lang.Object> function12, Function2<? super T, ? super Continuation<? super Unit>, ? extends java.lang.Object> function2, Function2<? super java.lang.Throwable, ? super Continuation<? super Unit>, ? extends java.lang.Object> function22) {
        Job jobLaunch$default = BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(abstractC49411unz), null, null, new BaseViewModelExtKt$executeUseCaseInner$executeUseCaseInner$1(function1, function12, function2, function22, null), 3, null);
        if (str == null) {
            return;
        }
        abstractC49411unz.AEQbTJ(jobLaunch$default, str);
    }

    public static final <T extends InterfaceC49369unJ<T>, V> void OLrzqt(AbstractC49411unz<T> abstractC49411unz, InterfaceC56554yJr<T, InterfaceC49371unL<V>> interfaceC56554yJr, java.lang.String str, Function1<? super V, java.lang.Boolean> function1, Function1<? super Continuation<? super Unit>, ? extends java.lang.Object> function12, Function2<? super V, ? super Continuation<? super Unit>, ? extends java.lang.Object> function2, Function2<? super java.lang.Throwable, ? super Continuation<? super Unit>, ? extends java.lang.Object> function22, Function2<? super V, ? super Continuation<? super Unit>, ? extends java.lang.Object> function23, Function1<? super Continuation<? super V>, ? extends java.lang.Object> function13) {
        copydefault(abstractC49411unz, str, new BaseViewModelExtKt$executeUseCaseInner$5(function12, null), new BaseViewModelExtKt$executeUseCaseInner$6(function13, null), new BaseViewModelExtKt$executeUseCaseInner$7(function1, function23, function2, null), new BaseViewModelExtKt$executeUseCaseInner$8(function22, null));
    }

    public static final <T extends InterfaceC49369unJ<T>, V> void OLrzqt(@NotNull AbstractC49411unz<T> abstractC49411unz, java.lang.String str, Function1<? super V, java.lang.Boolean> function1, Function1<? super Continuation<? super Unit>, ? extends java.lang.Object> function12, Function2<? super V, ? super Continuation<? super Unit>, ? extends java.lang.Object> function2, Function2<? super java.lang.Throwable, ? super Continuation<? super Unit>, ? extends java.lang.Object> function22, Function2<? super V, ? super Continuation<? super Unit>, ? extends java.lang.Object> function23, @NotNull Function1<? super Continuation<? super V>, ? extends java.lang.Object> function13) {
        Intrinsics.checkNotNullParameter(abstractC49411unz, "");
        Intrinsics.checkNotNullParameter(function13, "");
        executeUseCaseInner$default(abstractC49411unz, null, str, function1, function12, function2, function22, function23, function13, 1, null);
    }

    public static final <T extends InterfaceC49369unJ<T>, V> void AEQbTJ(@NotNull AbstractC49411unz<T> abstractC49411unz, @NotNull InterfaceC56554yJr<T, InterfaceC49371unL<V>> interfaceC56554yJr, java.lang.String str, Function1<? super V, java.lang.Boolean> function1, Function1<? super Continuation<? super Unit>, ? extends java.lang.Object> function12, Function2<? super V, ? super Continuation<? super Unit>, ? extends java.lang.Object> function2, Function2<? super java.lang.Throwable, ? super Continuation<? super Unit>, ? extends java.lang.Object> function22, Function2<? super V, ? super Continuation<? super Unit>, ? extends java.lang.Object> function23, @NotNull Function1<? super Continuation<? super V>, ? extends java.lang.Object> function13) {
        Intrinsics.checkNotNullParameter(abstractC49411unz, "");
        Intrinsics.checkNotNullParameter(interfaceC56554yJr, "");
        Intrinsics.checkNotNullParameter(function13, "");
        executeUseCaseInner$default(abstractC49411unz, null, str, function1, new BaseViewModelExtKt$executeUseCaseWithSideEffect$1(abstractC49411unz, interfaceC56554yJr, function12, null), new BaseViewModelExtKt$executeUseCaseWithSideEffect$2(abstractC49411unz, interfaceC56554yJr, function2, null), new BaseViewModelExtKt$executeUseCaseWithSideEffect$3(abstractC49411unz, interfaceC56554yJr, function22, null), new BaseViewModelExtKt$executeUseCaseWithSideEffect$4(abstractC49411unz, interfaceC56554yJr, function23, null), function13, 1, null);
    }

    public static /* synthetic */ void executeUseCase$default(AbstractC49411unz abstractC49411unz, InterfaceC56554yJr interfaceC56554yJr, java.lang.String str, Function1 function1, Function1 function12, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            function1 = null;
        }
        AEQbTJ(abstractC49411unz, interfaceC56554yJr, str, function1, function12);
    }

    public static final <T extends InterfaceC49369unJ<T>, V> void AEQbTJ(@NotNull AbstractC49411unz<T> abstractC49411unz, @NotNull InterfaceC56554yJr<T, InterfaceC49371unL<V>> interfaceC56554yJr, java.lang.String str, Function1<? super V, java.lang.Boolean> function1, @NotNull Function1<? super Continuation<? super V>, ? extends java.lang.Object> function12) {
        Intrinsics.checkNotNullParameter(abstractC49411unz, "");
        Intrinsics.checkNotNullParameter(interfaceC56554yJr, "");
        Intrinsics.checkNotNullParameter(function12, "");
        executeUseCaseInner$default(abstractC49411unz, interfaceC56554yJr, str, function1, null, null, null, null, function12, 120, null);
    }
}
