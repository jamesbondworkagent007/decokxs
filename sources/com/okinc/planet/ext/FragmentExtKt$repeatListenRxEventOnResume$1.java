package com.okinc.planet.ext;

import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import com.okinc.rxutils.RxBus;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C46370tRv;
import o.InterfaceC58217yxC;

/* JADX INFO: loaded from: classes19.dex */
public final class FragmentExtKt$repeatListenRxEventOnResume$1 implements DefaultLifecycleObserver {
    public InterfaceC58217yxC EZpvd;
    public final /* synthetic */ String[] KWHzl;
    public final /* synthetic */ Function1<String, Unit> OLrzqt;

    public static final class StateListAnimator implements Function1<String, Unit> {
        public final /* synthetic */ Function1<String, Unit> KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> */
        /* JADX WARN: Multi-variable type inference failed */
        public StateListAnimator(Function1<? super String, Unit> function1) {
            this.KWHzl = function1;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(String str) {
            KWHzl(str);
            return Unit.INSTANCE;
        }

        public final void KWHzl(String str) {
            Function1<String, Unit> function1 = this.KWHzl;
            Intrinsics.copydefault((Object) str);
            function1.invoke(str);
        }
    }

    public static final class TaskDescription implements Function1<Throwable, Unit> {
        public static final TaskDescription EZpvd = new TaskDescription();

        public final void copydefault(Throwable th) {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(Throwable th) {
            copydefault(th);
            return Unit.INSTANCE;
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onResume(LifecycleOwner lifecycleOwner) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        super.onResume(lifecycleOwner);
        String[] strArr = this.KWHzl;
        this.EZpvd = RxBus.AEQbTJ((String[]) Arrays.copyOf(strArr, strArr.length)).AEQbTJ(new C46370tRv.TaskDescription(new StateListAnimator(this.OLrzqt)), new C46370tRv.TaskDescription(TaskDescription.EZpvd));
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onPause(LifecycleOwner lifecycleOwner) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        InterfaceC58217yxC interfaceC58217yxC = this.EZpvd;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
        super.onPause(lifecycleOwner);
    }
}
