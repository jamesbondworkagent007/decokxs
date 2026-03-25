package o;

import io.reactivex.internal.functions.Functions;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class yBI {
    public static final Function1<java.lang.Object, Unit> EZpvd = new Function1<java.lang.Object, Unit>() { // from class: io.reactivex.rxkotlin.SubscribersKt$onNextStub$1
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
            invoke2(obj);
            return Unit.INSTANCE;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Possible override for method kotlin.jvm.functions.Function1.invoke(Ljava/lang/Object;)Ljava/lang/Object; */
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull Object obj) {
            Intrinsics.EZpvd(obj, "");
        }
    };
    public static final Function1<java.lang.Throwable, Unit> copydefault = new Function1<java.lang.Throwable, Unit>() { // from class: io.reactivex.rxkotlin.SubscribersKt$onErrorStub$1
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull Throwable th) {
            Intrinsics.EZpvd((Object) th, "");
        }
    };
    public static final Function0<Unit> AEQbTJ = new Function0<Unit>() { // from class: io.reactivex.rxkotlin.SubscribersKt$onCompleteStub$1
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX DEBUG: Possible override for method kotlin.jvm.functions.Function0.invoke()Ljava/lang/Object; */
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
        }
    };

    public static final <T> InterfaceC58227yxM<T> OLrzqt(@NotNull Function1<? super T, Unit> function1) {
        if (function1 == EZpvd) {
            InterfaceC58227yxM<T> interfaceC58227yxMKWHzl = Functions.KWHzl();
            Intrinsics.AEQbTJ(interfaceC58227yxMKWHzl, "");
            return interfaceC58227yxMKWHzl;
        }
        if (function1 != null) {
            function1 = (Function1<? super T, Unit>) new yBN(function1);
        }
        return (InterfaceC58227yxM) function1;
    }

    public static final InterfaceC58227yxM<java.lang.Throwable> EZpvd(@NotNull Function1<? super java.lang.Throwable, Unit> function1) {
        java.lang.Object ybn = function1;
        if (function1 == copydefault) {
            InterfaceC58227yxM<java.lang.Throwable> interfaceC58227yxM = Functions.isConnected;
            Intrinsics.AEQbTJ(interfaceC58227yxM, "");
            return interfaceC58227yxM;
        }
        if (function1 != null) {
            ybn = new yBN(function1);
        }
        return (InterfaceC58227yxM) ybn;
    }

    public static final InterfaceC58222yxH copydefault(@NotNull Function0<Unit> function0) {
        java.lang.Object ybj = function0;
        if (function0 == AEQbTJ) {
            InterfaceC58222yxH interfaceC58222yxH = Functions.AEQbTJ;
            Intrinsics.AEQbTJ(interfaceC58222yxH, "");
            return interfaceC58222yxH;
        }
        if (function0 != null) {
            ybj = new yBJ(function0);
        }
        return (InterfaceC58222yxH) ybj;
    }

    public static /* synthetic */ InterfaceC58217yxC subscribeBy$default(AbstractC58247yxg abstractC58247yxg, Function1 function1, Function0 function0, Function1 function12, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = copydefault;
        }
        if ((i & 2) != 0) {
            function0 = AEQbTJ;
        }
        if ((i & 4) != 0) {
            function12 = EZpvd;
        }
        return copydefault(abstractC58247yxg, function1, function0, function12);
    }

    public static final <T> InterfaceC58217yxC copydefault(@NotNull AbstractC58247yxg<T> abstractC58247yxg, @NotNull Function1<? super java.lang.Throwable, Unit> function1, @NotNull Function0<Unit> function0, @NotNull Function1<? super T, Unit> function12) {
        Intrinsics.EZpvd((java.lang.Object) abstractC58247yxg, "");
        Intrinsics.EZpvd((java.lang.Object) function1, "");
        Intrinsics.EZpvd((java.lang.Object) function0, "");
        Intrinsics.EZpvd((java.lang.Object) function12, "");
        InterfaceC58217yxC interfaceC58217yxCSubscribe = abstractC58247yxg.subscribe(OLrzqt(function12), EZpvd(function1), copydefault(function0));
        Intrinsics.AEQbTJ(interfaceC58217yxCSubscribe, "");
        return interfaceC58217yxCSubscribe;
    }

    public static /* synthetic */ InterfaceC58217yxC subscribeBy$default(AbstractC58185ywX abstractC58185ywX, Function1 function1, Function0 function0, Function1 function12, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = copydefault;
        }
        if ((i & 2) != 0) {
            function0 = AEQbTJ;
        }
        if ((i & 4) != 0) {
            function12 = EZpvd;
        }
        return KWHzl(abstractC58185ywX, function1, function0, function12);
    }

    public static final <T> InterfaceC58217yxC KWHzl(@NotNull AbstractC58185ywX<T> abstractC58185ywX, @NotNull Function1<? super java.lang.Throwable, Unit> function1, @NotNull Function0<Unit> function0, @NotNull Function1<? super T, Unit> function12) {
        Intrinsics.EZpvd((java.lang.Object) abstractC58185ywX, "");
        Intrinsics.EZpvd((java.lang.Object) function1, "");
        Intrinsics.EZpvd((java.lang.Object) function0, "");
        Intrinsics.EZpvd((java.lang.Object) function12, "");
        InterfaceC58217yxC interfaceC58217yxCAEQbTJ = abstractC58185ywX.AEQbTJ(OLrzqt(function12), EZpvd(function1), copydefault(function0));
        Intrinsics.AEQbTJ(interfaceC58217yxCAEQbTJ, "");
        return interfaceC58217yxCAEQbTJ;
    }

    public static /* synthetic */ InterfaceC58217yxC subscribeBy$default(AbstractC58260yxt abstractC58260yxt, Function1 function1, Function1 function12, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = copydefault;
        }
        if ((i & 2) != 0) {
            function12 = EZpvd;
        }
        return KWHzl(abstractC58260yxt, (Function1<? super java.lang.Throwable, Unit>) function1, function12);
    }

    public static final <T> InterfaceC58217yxC KWHzl(@NotNull AbstractC58260yxt<T> abstractC58260yxt, @NotNull Function1<? super java.lang.Throwable, Unit> function1, @NotNull Function1<? super T, Unit> function12) {
        Intrinsics.EZpvd((java.lang.Object) abstractC58260yxt, "");
        Intrinsics.EZpvd((java.lang.Object) function1, "");
        Intrinsics.EZpvd((java.lang.Object) function12, "");
        InterfaceC58217yxC interfaceC58217yxCAEQbTJ = abstractC58260yxt.AEQbTJ(OLrzqt(function12), EZpvd(function1));
        Intrinsics.AEQbTJ(interfaceC58217yxCAEQbTJ, "");
        return interfaceC58217yxCAEQbTJ;
    }

    public static /* synthetic */ InterfaceC58217yxC subscribeBy$default(AbstractC58245yxe abstractC58245yxe, Function1 function1, Function0 function0, Function1 function12, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = copydefault;
        }
        if ((i & 2) != 0) {
            function0 = AEQbTJ;
        }
        if ((i & 4) != 0) {
            function12 = EZpvd;
        }
        return OLrzqt(abstractC58245yxe, (Function1<? super java.lang.Throwable, Unit>) function1, (Function0<Unit>) function0, function12);
    }

    public static final <T> InterfaceC58217yxC OLrzqt(@NotNull AbstractC58245yxe<T> abstractC58245yxe, @NotNull Function1<? super java.lang.Throwable, Unit> function1, @NotNull Function0<Unit> function0, @NotNull Function1<? super T, Unit> function12) {
        Intrinsics.EZpvd((java.lang.Object) abstractC58245yxe, "");
        Intrinsics.EZpvd((java.lang.Object) function1, "");
        Intrinsics.EZpvd((java.lang.Object) function0, "");
        Intrinsics.EZpvd((java.lang.Object) function12, "");
        InterfaceC58217yxC interfaceC58217yxCKWHzl = abstractC58245yxe.KWHzl(OLrzqt(function12), EZpvd(function1), copydefault(function0));
        Intrinsics.AEQbTJ(interfaceC58217yxCKWHzl, "");
        return interfaceC58217yxCKWHzl;
    }

    public static /* synthetic */ InterfaceC58217yxC subscribeBy$default(AbstractC58177ywP abstractC58177ywP, Function1 function1, Function0 function0, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = copydefault;
        }
        if ((i & 2) != 0) {
            function0 = AEQbTJ;
        }
        return KWHzl(abstractC58177ywP, (Function1<? super java.lang.Throwable, Unit>) function1, (Function0<Unit>) function0);
    }

    public static final InterfaceC58217yxC KWHzl(@NotNull AbstractC58177ywP abstractC58177ywP, @NotNull Function1<? super java.lang.Throwable, Unit> function1, @NotNull Function0<Unit> function0) {
        Intrinsics.EZpvd((java.lang.Object) abstractC58177ywP, "");
        Intrinsics.EZpvd((java.lang.Object) function1, "");
        Intrinsics.EZpvd((java.lang.Object) function0, "");
        Function1<java.lang.Throwable, Unit> function12 = copydefault;
        if (function1 == function12 && function0 == AEQbTJ) {
            InterfaceC58217yxC interfaceC58217yxCEZpvd = abstractC58177ywP.EZpvd();
            Intrinsics.AEQbTJ(interfaceC58217yxCEZpvd, "");
            return interfaceC58217yxCEZpvd;
        }
        if (function1 == function12) {
            InterfaceC58217yxC interfaceC58217yxCAEQbTJ = abstractC58177ywP.AEQbTJ((InterfaceC58222yxH) new yBJ(function0));
            Intrinsics.AEQbTJ(interfaceC58217yxCAEQbTJ, "");
            return interfaceC58217yxCAEQbTJ;
        }
        InterfaceC58217yxC interfaceC58217yxCCopydefault = abstractC58177ywP.copydefault(copydefault(function0), new yBN(function1));
        Intrinsics.AEQbTJ(interfaceC58217yxCCopydefault, "");
        return interfaceC58217yxCCopydefault;
    }

    public static /* synthetic */ void blockingSubscribeBy$default(AbstractC58247yxg abstractC58247yxg, Function1 function1, Function0 function0, Function1 function12, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = copydefault;
        }
        if ((i & 2) != 0) {
            function0 = AEQbTJ;
        }
        if ((i & 4) != 0) {
            function12 = EZpvd;
        }
        OLrzqt(abstractC58247yxg, (Function1<? super java.lang.Throwable, Unit>) function1, (Function0<Unit>) function0, function12);
    }

    public static final <T> void OLrzqt(@NotNull AbstractC58247yxg<T> abstractC58247yxg, @NotNull Function1<? super java.lang.Throwable, Unit> function1, @NotNull Function0<Unit> function0, @NotNull Function1<? super T, Unit> function12) {
        Intrinsics.EZpvd((java.lang.Object) abstractC58247yxg, "");
        Intrinsics.EZpvd((java.lang.Object) function1, "");
        Intrinsics.EZpvd((java.lang.Object) function0, "");
        Intrinsics.EZpvd((java.lang.Object) function12, "");
        abstractC58247yxg.blockingSubscribe(OLrzqt(function12), EZpvd(function1), copydefault(function0));
    }

    public static /* synthetic */ void blockingSubscribeBy$default(AbstractC58185ywX abstractC58185ywX, Function1 function1, Function0 function0, Function1 function12, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = copydefault;
        }
        if ((i & 2) != 0) {
            function0 = AEQbTJ;
        }
        if ((i & 4) != 0) {
            function12 = EZpvd;
        }
        EZpvd(abstractC58185ywX, function1, function0, function12);
    }

    public static final <T> void EZpvd(@NotNull AbstractC58185ywX<T> abstractC58185ywX, @NotNull Function1<? super java.lang.Throwable, Unit> function1, @NotNull Function0<Unit> function0, @NotNull Function1<? super T, Unit> function12) {
        Intrinsics.EZpvd((java.lang.Object) abstractC58185ywX, "");
        Intrinsics.EZpvd((java.lang.Object) function1, "");
        Intrinsics.EZpvd((java.lang.Object) function0, "");
        Intrinsics.EZpvd((java.lang.Object) function12, "");
        abstractC58185ywX.OLrzqt(OLrzqt(function12), EZpvd(function1), copydefault(function0));
    }
}
