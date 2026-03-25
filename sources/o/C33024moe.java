package o;

import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import com.okinc.core.arch.data.StatefulData;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.moe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C33024moe {
    public static final Function1<java.lang.Object, Unit> KWHzl = new Function1() { // from class: o.mok
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function1
        public final java.lang.Object invoke(java.lang.Object obj) {
            return C33024moe.KWHzl(obj);
        }
    };
    public static final Function1<java.lang.Throwable, Unit> copydefault = new Function1() { // from class: o.mom
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function1
        public final java.lang.Object invoke(java.lang.Object obj) {
            return C33024moe.AEQbTJ((java.lang.Throwable) obj);
        }
    };
    public static final Function0<Unit> OLrzqt = new Function0() { // from class: o.mon
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C33024moe.KWHzl();
        }
    };

    public static final Unit KWHzl(java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl() {
        return Unit.INSTANCE;
    }

    public static final <T> AbstractC58185ywX<T> KWHzl(@NotNull AbstractC58185ywX<T> abstractC58185ywX) {
        Intrinsics.checkNotNullParameter(abstractC58185ywX, "");
        AbstractC58185ywX<T> abstractC58185ywXKWHzl = abstractC58185ywX.copydefault(yBP.AEQbTJ()).KWHzl(C58266yxz.OLrzqt());
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        return abstractC58185ywXKWHzl;
    }

    public static final <T> AbstractC58185ywX<T> OLrzqt(@NotNull AbstractC58185ywX<T> abstractC58185ywX) {
        Intrinsics.checkNotNullParameter(abstractC58185ywX, "");
        AbstractC58185ywX<T> abstractC58185ywXKWHzl = abstractC58185ywX.copydefault(yBP.KWHzl()).KWHzl(C58266yxz.OLrzqt());
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        return abstractC58185ywXKWHzl;
    }

    public static final <T> AbstractC58185ywX<T> EZpvd(@NotNull AbstractC58185ywX<T> abstractC58185ywX) {
        Intrinsics.checkNotNullParameter(abstractC58185ywX, "");
        AbstractC58185ywX<T> abstractC58185ywXKWHzl = abstractC58185ywX.copydefault(yBP.EZpvd()).KWHzl(C58266yxz.OLrzqt());
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        return abstractC58185ywXKWHzl;
    }

    public static final <T> AbstractC58185ywX<T> copydefault(@NotNull AbstractC58185ywX<T> abstractC58185ywX) {
        Intrinsics.checkNotNullParameter(abstractC58185ywX, "");
        AbstractC58185ywX<T> abstractC58185ywXKWHzl = abstractC58185ywX.copydefault(yBP.OLrzqt()).KWHzl(C58266yxz.OLrzqt());
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        return abstractC58185ywXKWHzl;
    }

    public static /* synthetic */ InterfaceC58217yxC subscribeOnIO$default(AbstractC58185ywX abstractC58185ywX, Function1 function1, Function0 function0, Function1 function12, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = copydefault;
        }
        if ((i & 2) != 0) {
            function0 = OLrzqt;
        }
        if ((i & 4) != 0) {
            function12 = KWHzl;
        }
        return copydefault(abstractC58185ywX, (Function1<? super java.lang.Throwable, Unit>) function1, (Function0<Unit>) function0, function12);
    }

    public static final <T> InterfaceC58217yxC copydefault(@NotNull AbstractC58185ywX<T> abstractC58185ywX, @NotNull Function1<? super java.lang.Throwable, Unit> function1, @NotNull Function0<Unit> function0, @NotNull Function1<? super T, Unit> function12) {
        Intrinsics.checkNotNullParameter(abstractC58185ywX, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function0, "");
        Intrinsics.checkNotNullParameter(function12, "");
        return yBI.KWHzl(KWHzl((AbstractC58185ywX) abstractC58185ywX), function1, function0, function12);
    }

    public static /* synthetic */ InterfaceC58217yxC subscribeOnComputation$default(AbstractC58185ywX abstractC58185ywX, Function1 function1, Function0 function0, Function1 function12, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = copydefault;
        }
        if ((i & 2) != 0) {
            function0 = OLrzqt;
        }
        if ((i & 4) != 0) {
            function12 = KWHzl;
        }
        return KWHzl(abstractC58185ywX, (Function1<? super java.lang.Throwable, Unit>) function1, (Function0<Unit>) function0, function12);
    }

    public static final <T> InterfaceC58217yxC KWHzl(@NotNull AbstractC58185ywX<T> abstractC58185ywX, @NotNull Function1<? super java.lang.Throwable, Unit> function1, @NotNull Function0<Unit> function0, @NotNull Function1<? super T, Unit> function12) {
        Intrinsics.checkNotNullParameter(abstractC58185ywX, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function0, "");
        Intrinsics.checkNotNullParameter(function12, "");
        return yBI.KWHzl(OLrzqt(abstractC58185ywX), function1, function0, function12);
    }

    public static /* synthetic */ InterfaceC58217yxC subscribeOnSingle$default(AbstractC58185ywX abstractC58185ywX, Function1 function1, Function0 function0, Function1 function12, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = copydefault;
        }
        if ((i & 2) != 0) {
            function0 = OLrzqt;
        }
        if ((i & 4) != 0) {
            function12 = KWHzl;
        }
        return OLrzqt(abstractC58185ywX, (Function1<? super java.lang.Throwable, Unit>) function1, (Function0<Unit>) function0, function12);
    }

    public static final <T> InterfaceC58217yxC OLrzqt(@NotNull AbstractC58185ywX<T> abstractC58185ywX, @NotNull Function1<? super java.lang.Throwable, Unit> function1, @NotNull Function0<Unit> function0, @NotNull Function1<? super T, Unit> function12) {
        Intrinsics.checkNotNullParameter(abstractC58185ywX, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function0, "");
        Intrinsics.checkNotNullParameter(function12, "");
        return yBI.KWHzl(EZpvd(abstractC58185ywX), function1, function0, function12);
    }

    public static /* synthetic */ InterfaceC58217yxC subscribeOnNewThread$default(AbstractC58185ywX abstractC58185ywX, Function1 function1, Function0 function0, Function1 function12, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = copydefault;
        }
        if ((i & 2) != 0) {
            function0 = OLrzqt;
        }
        if ((i & 4) != 0) {
            function12 = KWHzl;
        }
        return EZpvd(abstractC58185ywX, function1, function0, function12);
    }

    public static final <T> InterfaceC58217yxC EZpvd(@NotNull AbstractC58185ywX<T> abstractC58185ywX, @NotNull Function1<? super java.lang.Throwable, Unit> function1, @NotNull Function0<Unit> function0, @NotNull Function1<? super T, Unit> function12) {
        Intrinsics.checkNotNullParameter(abstractC58185ywX, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function0, "");
        Intrinsics.checkNotNullParameter(function12, "");
        return yBI.KWHzl(copydefault((AbstractC58185ywX) abstractC58185ywX), function1, function0, function12);
    }

    public static final <T> AbstractC58247yxg<T> OLrzqt(@NotNull AbstractC58247yxg<T> abstractC58247yxg) {
        Intrinsics.checkNotNullParameter(abstractC58247yxg, "");
        AbstractC58247yxg<T> abstractC58247yxgObserveOn = abstractC58247yxg.subscribeOn(yBP.AEQbTJ()).observeOn(C58266yxz.OLrzqt());
        Intrinsics.checkNotNullExpressionValue(abstractC58247yxgObserveOn, "");
        return abstractC58247yxgObserveOn;
    }

    public static final <T> AbstractC58247yxg<T> KWHzl(@NotNull AbstractC58247yxg<T> abstractC58247yxg) {
        Intrinsics.checkNotNullParameter(abstractC58247yxg, "");
        AbstractC58247yxg<T> abstractC58247yxgObserveOn = abstractC58247yxg.subscribeOn(yBP.KWHzl()).observeOn(C58266yxz.OLrzqt());
        Intrinsics.checkNotNullExpressionValue(abstractC58247yxgObserveOn, "");
        return abstractC58247yxgObserveOn;
    }

    public static final <T> AbstractC58247yxg<T> AEQbTJ(@NotNull AbstractC58247yxg<T> abstractC58247yxg) {
        Intrinsics.checkNotNullParameter(abstractC58247yxg, "");
        AbstractC58247yxg<T> abstractC58247yxgObserveOn = abstractC58247yxg.subscribeOn(yBP.EZpvd()).observeOn(C58266yxz.OLrzqt());
        Intrinsics.checkNotNullExpressionValue(abstractC58247yxgObserveOn, "");
        return abstractC58247yxgObserveOn;
    }

    public static final <T> AbstractC58247yxg<T> copydefault(@NotNull AbstractC58247yxg<T> abstractC58247yxg) {
        Intrinsics.checkNotNullParameter(abstractC58247yxg, "");
        AbstractC58247yxg<T> abstractC58247yxgObserveOn = abstractC58247yxg.subscribeOn(yBP.OLrzqt()).observeOn(C58266yxz.OLrzqt());
        Intrinsics.checkNotNullExpressionValue(abstractC58247yxgObserveOn, "");
        return abstractC58247yxgObserveOn;
    }

    public static /* synthetic */ InterfaceC58217yxC subscribeOnIO$default(AbstractC58247yxg abstractC58247yxg, Function1 function1, Function0 function0, Function1 function12, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = copydefault;
        }
        if ((i & 2) != 0) {
            function0 = OLrzqt;
        }
        if ((i & 4) != 0) {
            function12 = KWHzl;
        }
        return KWHzl(abstractC58247yxg, (Function1<? super java.lang.Throwable, Unit>) function1, (Function0<Unit>) function0, function12);
    }

    public static final <T> InterfaceC58217yxC KWHzl(@NotNull AbstractC58247yxg<T> abstractC58247yxg, @NotNull Function1<? super java.lang.Throwable, Unit> function1, @NotNull Function0<Unit> function0, @NotNull Function1<? super T, Unit> function12) {
        Intrinsics.checkNotNullParameter(abstractC58247yxg, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function0, "");
        Intrinsics.checkNotNullParameter(function12, "");
        return yBI.copydefault(OLrzqt(abstractC58247yxg), function1, function0, function12);
    }

    public static /* synthetic */ InterfaceC58217yxC subscribeOnComputation$default(AbstractC58247yxg abstractC58247yxg, Function1 function1, Function0 function0, Function1 function12, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = copydefault;
        }
        if ((i & 2) != 0) {
            function0 = OLrzqt;
        }
        if ((i & 4) != 0) {
            function12 = KWHzl;
        }
        return copydefault(abstractC58247yxg, (Function1<? super java.lang.Throwable, Unit>) function1, (Function0<Unit>) function0, function12);
    }

    public static final <T> InterfaceC58217yxC copydefault(@NotNull AbstractC58247yxg<T> abstractC58247yxg, @NotNull Function1<? super java.lang.Throwable, Unit> function1, @NotNull Function0<Unit> function0, @NotNull Function1<? super T, Unit> function12) {
        Intrinsics.checkNotNullParameter(abstractC58247yxg, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function0, "");
        Intrinsics.checkNotNullParameter(function12, "");
        return yBI.copydefault(KWHzl((AbstractC58247yxg) abstractC58247yxg), function1, function0, function12);
    }

    public static /* synthetic */ InterfaceC58217yxC subscribeOnSingle$default(AbstractC58247yxg abstractC58247yxg, Function1 function1, Function0 function0, Function1 function12, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = copydefault;
        }
        if ((i & 2) != 0) {
            function0 = OLrzqt;
        }
        if ((i & 4) != 0) {
            function12 = KWHzl;
        }
        return OLrzqt(abstractC58247yxg, (Function1<? super java.lang.Throwable, Unit>) function1, (Function0<Unit>) function0, function12);
    }

    public static final <T> InterfaceC58217yxC OLrzqt(@NotNull AbstractC58247yxg<T> abstractC58247yxg, @NotNull Function1<? super java.lang.Throwable, Unit> function1, @NotNull Function0<Unit> function0, @NotNull Function1<? super T, Unit> function12) {
        Intrinsics.checkNotNullParameter(abstractC58247yxg, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function0, "");
        Intrinsics.checkNotNullParameter(function12, "");
        return yBI.copydefault(AEQbTJ(abstractC58247yxg), function1, function0, function12);
    }

    public static /* synthetic */ InterfaceC58217yxC subscribeOnNewThread$default(AbstractC58247yxg abstractC58247yxg, Function1 function1, Function0 function0, Function1 function12, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = copydefault;
        }
        if ((i & 2) != 0) {
            function0 = OLrzqt;
        }
        if ((i & 4) != 0) {
            function12 = KWHzl;
        }
        return AEQbTJ(abstractC58247yxg, (Function1<? super java.lang.Throwable, Unit>) function1, (Function0<Unit>) function0, function12);
    }

    public static final <T> InterfaceC58217yxC AEQbTJ(@NotNull AbstractC58247yxg<T> abstractC58247yxg, @NotNull Function1<? super java.lang.Throwable, Unit> function1, @NotNull Function0<Unit> function0, @NotNull Function1<? super T, Unit> function12) {
        Intrinsics.checkNotNullParameter(abstractC58247yxg, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function0, "");
        Intrinsics.checkNotNullParameter(function12, "");
        return yBI.copydefault(copydefault((AbstractC58247yxg) abstractC58247yxg), function1, function0, function12);
    }

    public static final <T> void OLrzqt(@NotNull MutableLiveData<StatefulData<T>> mutableLiveData, T t) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "");
        mutableLiveData.setValue(StatefulData.Companion.EZpvd(t));
    }

    public static /* synthetic */ void setErrorValue$default(MutableLiveData mutableLiveData, java.lang.Throwable th, java.lang.Object obj, int i, java.lang.Object obj2) {
        if ((i & 2) != 0) {
            obj = null;
        }
        EZpvd(mutableLiveData, th, obj);
    }

    public static final <T> void EZpvd(@NotNull MutableLiveData<StatefulData<T>> mutableLiveData, @NotNull java.lang.Throwable th, T t) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "");
        Intrinsics.checkNotNullParameter(th, "");
        mutableLiveData.setValue(StatefulData.Companion.AEQbTJ(th, t));
    }

    public static final <T> void AEQbTJ(@NotNull MutableLiveData<StatefulData<T>> mutableLiveData, T t) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "");
        mutableLiveData.setValue(StatefulData.Companion.copydefault(t));
    }

    /* JADX INFO: renamed from: o.moe$Application */
    public static final class Application extends C33031mol<java.lang.Object> {
        public final /* synthetic */ MutableLiveData<StatefulData<java.lang.Object>> AEQbTJ;

        public Application(MutableLiveData<StatefulData<java.lang.Object>> mutableLiveData) {
            this.AEQbTJ = mutableLiveData;
        }

        @Override // o.C33031mol, o.InterfaceC58227yxM
        public void accept(java.lang.Object obj) {
            Intrinsics.checkNotNullParameter(obj, "");
            C33024moe.OLrzqt(this.AEQbTJ, obj);
        }
    }

    public static /* synthetic */ InterfaceC58217yxC subscribeStatefulResult$default(AbstractC58185ywX abstractC58185ywX, MutableLiveData mutableLiveData, InterfaceC58227yxM interfaceC58227yxM, InterfaceC58227yxM interfaceC58227yxM2, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            interfaceC58227yxM = new Application(mutableLiveData);
        }
        if ((i & 4) != 0) {
            interfaceC58227yxM2 = new TaskDescription(mutableLiveData);
        }
        return KWHzl(abstractC58185ywX, mutableLiveData, interfaceC58227yxM, (InterfaceC58227yxM<java.lang.Throwable>) interfaceC58227yxM2);
    }

    /* JADX INFO: renamed from: o.moe$TaskDescription */
    public static final class TaskDescription extends C33027moh {
        public final /* synthetic */ MutableLiveData<StatefulData<java.lang.Object>> EZpvd;

        public TaskDescription(MutableLiveData<StatefulData<java.lang.Object>> mutableLiveData) {
            this.EZpvd = mutableLiveData;
        }

        /* JADX DEBUG: Method merged with bridge method: accept(Ljava/lang/Object;)V */
        @Override // o.C33027moh, o.InterfaceC58227yxM
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public void accept(java.lang.Throwable th) {
            Intrinsics.checkNotNullParameter(th, "");
            C33024moe.setErrorValue$default(this.EZpvd, th, null, 2, null);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: o.yxM<T> */
    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> InterfaceC58217yxC KWHzl(@NotNull AbstractC58185ywX<T> abstractC58185ywX, @NotNull MutableLiveData<StatefulData<T>> mutableLiveData, @NotNull InterfaceC58227yxM<T> interfaceC58227yxM, @NotNull InterfaceC58227yxM<java.lang.Throwable> interfaceC58227yxM2) {
        Intrinsics.checkNotNullParameter(abstractC58185ywX, "");
        Intrinsics.checkNotNullParameter(mutableLiveData, "");
        Intrinsics.checkNotNullParameter(interfaceC58227yxM, "");
        Intrinsics.checkNotNullParameter(interfaceC58227yxM2, "");
        InterfaceC58217yxC interfaceC58217yxCAEQbTJ = abstractC58185ywX.AEQbTJ(interfaceC58227yxM, interfaceC58227yxM2);
        Intrinsics.checkNotNullExpressionValue(interfaceC58217yxCAEQbTJ, "");
        return interfaceC58217yxCAEQbTJ;
    }

    public static final boolean AEQbTJ(StatefulData statefulData) {
        return (statefulData == null || statefulData.AEQbTJ() == StatefulData.Status.LOADING) ? false : true;
    }

    public static /* synthetic */ void observeOnce$default(AbstractC32960mnT abstractC32960mnT, LifecycleOwner lifecycleOwner, Function1 function1, Observer observer, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            function1 = new Function1() { // from class: o.moj
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return java.lang.Boolean.valueOf(C33024moe.AEQbTJ((StatefulData) obj2));
                }
            };
        }
        AEQbTJ(abstractC32960mnT, lifecycleOwner, function1, observer);
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: o.moe$StateListAnimator */
    public static final class StateListAnimator<T> implements Observer<StatefulData<T>> {
        public final /* synthetic */ Function1<StatefulData<T>, java.lang.Boolean> AEQbTJ;
        public final /* synthetic */ AbstractC32960mnT<T> OLrzqt;
        public final /* synthetic */ Observer<StatefulData<T>> copydefault;

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super com.okinc.core.arch.data.StatefulData<T>, java.lang.Boolean> */
        /* JADX WARN: Multi-variable type inference failed */
        public StateListAnimator(Observer<StatefulData<T>> observer, Function1<? super StatefulData<T>, java.lang.Boolean> function1, AbstractC32960mnT<T> abstractC32960mnT) {
            this.copydefault = observer;
            this.AEQbTJ = function1;
            this.OLrzqt = abstractC32960mnT;
        }

        /* JADX DEBUG: Method merged with bridge method: onChanged(Ljava/lang/Object;)V */
        @Override // androidx.lifecycle.Observer
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public void onChanged(StatefulData<T> statefulData) {
            this.copydefault.onChanged(statefulData);
            if (this.AEQbTJ.invoke(statefulData).booleanValue()) {
                this.OLrzqt.removeObserver(this);
            }
        }
    }

    public static final <T> void AEQbTJ(@NotNull AbstractC32960mnT<T> abstractC32960mnT, @NotNull LifecycleOwner lifecycleOwner, @NotNull Function1<? super StatefulData<T>, java.lang.Boolean> function1, @NotNull Observer<StatefulData<T>> observer) {
        Intrinsics.checkNotNullParameter(abstractC32960mnT, "");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(observer, "");
        abstractC32960mnT.observe(lifecycleOwner, new StateListAnimator(observer, function1, abstractC32960mnT));
    }
}
