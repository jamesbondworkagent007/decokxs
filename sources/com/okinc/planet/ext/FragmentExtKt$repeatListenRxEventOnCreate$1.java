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

/* JADX INFO: loaded from: classes24.dex */
public final class FragmentExtKt$repeatListenRxEventOnCreate$1 implements DefaultLifecycleObserver {
    public final /* synthetic */ String[] EZpvd;
    public InterfaceC58217yxC OLrzqt;
    public final /* synthetic */ Function1<String, Unit> copydefault;

    public static final class StateListAnimator implements Function1<String, Unit> {
        public final /* synthetic */ Function1<String, Unit> copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> */
        /* JADX WARN: Multi-variable type inference failed */
        public StateListAnimator(Function1<? super String, Unit> function1) {
            this.copydefault = function1;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(String str) {
            copydefault(str);
            return Unit.INSTANCE;
        }

        public final void copydefault(String str) {
            Function1<String, Unit> function1 = this.copydefault;
            Intrinsics.copydefault((Object) str);
            function1.invoke(str);
        }
    }

    public static final class TaskDescription implements Function1<Throwable, Unit> {
        public static final TaskDescription OLrzqt = new TaskDescription();

        public final void EZpvd(Throwable th) {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(Throwable th) {
            EZpvd(th);
            return Unit.INSTANCE;
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onCreate(LifecycleOwner lifecycleOwner) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        super.onCreate(lifecycleOwner);
        String[] strArr = this.EZpvd;
        this.OLrzqt = RxBus.AEQbTJ((String[]) Arrays.copyOf(strArr, strArr.length)).AEQbTJ(new C46370tRv.TaskDescription(new StateListAnimator(this.copydefault)), new C46370tRv.TaskDescription(TaskDescription.OLrzqt));
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onDestroy(LifecycleOwner lifecycleOwner) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        InterfaceC58217yxC interfaceC58217yxC = this.OLrzqt;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
        super.onDestroy(lifecycleOwner);
    }
}
