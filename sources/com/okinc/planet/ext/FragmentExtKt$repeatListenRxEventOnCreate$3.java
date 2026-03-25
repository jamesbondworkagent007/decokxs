package com.okinc.planet.ext;

import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import com.okinc.rxutils.RxBus;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC58185ywX;
import o.C46370tRv;
import o.InterfaceC58217yxC;

/* JADX INFO: loaded from: classes10.dex */
public final class FragmentExtKt$repeatListenRxEventOnCreate$3 implements DefaultLifecycleObserver {
    public final /* synthetic */ Function1<T, Unit> KWHzl;
    public InterfaceC58217yxC OLrzqt;

    public static final class ActionBar implements Function1<Throwable, Unit> {
        public static final ActionBar OLrzqt = new ActionBar();

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

    /* JADX INFO: Add missing generic type declarations: [T] */
    public static final class TaskDescription<T> implements Function1<T, Unit> {
        public final /* synthetic */ Function1<T, Unit> EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.jvm.functions.Function1<? super T, kotlin.Unit> */
        /* JADX WARN: Multi-variable type inference failed */
        public TaskDescription(Function1<? super T, Unit> function1) {
            this.EZpvd = function1;
        }

        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(Object obj) {
            AEQbTJ((RxBus.Application) obj);
            return Unit.INSTANCE;
        }

        /* JADX WARN: Incorrect types in method signature: (TT;)V */
        public final void AEQbTJ(RxBus.Application application) {
            this.EZpvd.invoke(application);
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onCreate(LifecycleOwner lifecycleOwner) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        super.onCreate(lifecycleOwner);
        Intrinsics.KWHzl(4, ExifInterface.GPS_DIRECTION_TRUE);
        AbstractC58185ywX abstractC58185ywXAEQbTJ = RxBus.AEQbTJ(RxBus.Application.class, new String[0]);
        Intrinsics.OLrzqt();
        this.OLrzqt = abstractC58185ywXAEQbTJ.AEQbTJ(new C46370tRv.TaskDescription(new TaskDescription(this.KWHzl)), new C46370tRv.TaskDescription(ActionBar.OLrzqt));
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
