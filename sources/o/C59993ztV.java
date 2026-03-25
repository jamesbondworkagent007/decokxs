package o;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.C56524yIo;
import o.C60053zuc;
import o.C60060zuj;
import o.yHA;
import o.yHB;
import o.yHC;
import o.yHD;
import o.yHF;
import o.yHG;
import o.yHH;
import o.yHI;
import o.yHJ;
import o.yHK;
import o.yHL;
import o.yHM;
import o.yHN;
import o.yHO;
import o.yHP;
import o.yHQ;
import o.yHR;
import o.yHS;
import o.yHT;
import o.yHY;
import org.jetbrains.annotations.NotNull;
import org.koin.core.definition.Kind;

/* JADX INFO: renamed from: o.ztV, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C59993ztV {
    public static /* synthetic */ C59976ztE factoryOf$default(C59991ztT c59991ztT, final Function0 function0, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            function1 = null;
        }
        Intrinsics.checkNotNullParameter(c59991ztT, "");
        Intrinsics.checkNotNullParameter(function0, "");
        Intrinsics.OLrzqt();
        Function2<C60060zuj, C60053zuc, R> function2 = new Function2<C60060zuj, C60053zuc, R>() { // from class: org.koin.core.module.dsl.FactoryOfKt$factoryOf$1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.jvm.functions.Function0<? extends R> */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function2
            public final R invoke(@NotNull C60060zuj c60060zuj, @NotNull C60053zuc c60053zuc) {
                Intrinsics.checkNotNullParameter(c60060zuj, "");
                Intrinsics.checkNotNullParameter(c60053zuc, "");
                return function0.invoke();
            }
        };
        C60055zue c60055zueKWHzl = C60059zui.KWHzl.KWHzl();
        Kind kind = Kind.Factory;
        java.util.List listAhwBna = yDY.AhwBna();
        Intrinsics.KWHzl(4, com.ibm.icu.text.DateFormat.JP_ERA_2019_NARROW);
        C59981ztJ c59981ztJ = new C59981ztJ(new C59978ztG(c60055zueKWHzl, C56524yIo.AEQbTJ(java.lang.Object.class), null, function2, kind, listAhwBna));
        c59991ztT.KWHzl(c59981ztJ);
        return C59994ztW.EZpvd(new C59976ztE(c59991ztT, c59981ztJ), function1);
    }

    public static /* synthetic */ C59976ztE factoryOf$default(C59991ztT c59991ztT, final Function1 function1, Function1 function12, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            function12 = null;
        }
        Intrinsics.checkNotNullParameter(c59991ztT, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.OLrzqt();
        Function2<C60060zuj, C60053zuc, R> function2 = new Function2<C60060zuj, C60053zuc, R>() { // from class: org.koin.core.module.dsl.FactoryOfKt$factoryOf$2
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.jvm.functions.Function1<? super T1, ? extends R> */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
            /* JADX WARN: Type inference incomplete: some casts might be missing */
            @Override // kotlin.jvm.functions.Function2
            public final R invoke(@NotNull C60060zuj c60060zuj, @NotNull C60053zuc c60053zuc) {
                Intrinsics.checkNotNullParameter(c60060zuj, "");
                Intrinsics.checkNotNullParameter(c60053zuc, "");
                Function1<T1, R> function13 = function1;
                Intrinsics.KWHzl(4, "T1");
                return function13.invoke((T1) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(Object.class), null, null));
            }
        };
        C60055zue c60055zueKWHzl = C60059zui.KWHzl.KWHzl();
        Kind kind = Kind.Factory;
        java.util.List listAhwBna = yDY.AhwBna();
        Intrinsics.KWHzl(4, com.ibm.icu.text.DateFormat.JP_ERA_2019_NARROW);
        C59981ztJ c59981ztJ = new C59981ztJ(new C59978ztG(c60055zueKWHzl, C56524yIo.AEQbTJ(java.lang.Object.class), null, function2, kind, listAhwBna));
        c59991ztT.KWHzl(c59981ztJ);
        return C59994ztW.EZpvd(new C59976ztE(c59991ztT, c59981ztJ), function12);
    }

    public static /* synthetic */ C59976ztE factoryOf$default(C59991ztT c59991ztT, final Function2 function2, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            function1 = null;
        }
        Intrinsics.checkNotNullParameter(c59991ztT, "");
        Intrinsics.checkNotNullParameter(function2, "");
        Intrinsics.OLrzqt();
        Function2<C60060zuj, C60053zuc, R> function22 = new Function2<C60060zuj, C60053zuc, R>() { // from class: org.koin.core.module.dsl.FactoryOfKt$factoryOf$3
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.jvm.functions.Function2<? super T1, ? super T2, ? extends R> */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
            /* JADX WARN: Type inference incomplete: some casts might be missing */
            @Override // kotlin.jvm.functions.Function2
            public final R invoke(@NotNull C60060zuj c60060zuj, @NotNull C60053zuc c60053zuc) {
                Intrinsics.checkNotNullParameter(c60060zuj, "");
                Intrinsics.checkNotNullParameter(c60053zuc, "");
                Function2<T1, T2, R> function23 = function2;
                Intrinsics.KWHzl(4, "T1");
                Object objAEQbTJ = c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(Object.class), null, null);
                Intrinsics.KWHzl(4, "T2");
                return function23.invoke((T1) objAEQbTJ, (T2) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(Object.class), null, null));
            }
        };
        C60055zue c60055zueKWHzl = C60059zui.KWHzl.KWHzl();
        Kind kind = Kind.Factory;
        java.util.List listAhwBna = yDY.AhwBna();
        Intrinsics.KWHzl(4, com.ibm.icu.text.DateFormat.JP_ERA_2019_NARROW);
        C59981ztJ c59981ztJ = new C59981ztJ(new C59978ztG(c60055zueKWHzl, C56524yIo.AEQbTJ(java.lang.Object.class), null, function22, kind, listAhwBna));
        c59991ztT.KWHzl(c59981ztJ);
        return C59994ztW.EZpvd(new C59976ztE(c59991ztT, c59981ztJ), function1);
    }

    public static /* synthetic */ C59976ztE factoryOf$default(C59991ztT c59991ztT, final yHO yho, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            function1 = null;
        }
        Intrinsics.checkNotNullParameter(c59991ztT, "");
        Intrinsics.checkNotNullParameter(yho, "");
        Intrinsics.OLrzqt();
        Function2<C60060zuj, C60053zuc, R> function2 = new Function2<C60060zuj, C60053zuc, R>() { // from class: org.koin.core.module.dsl.FactoryOfKt$factoryOf$4
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: o.yHO<? super T1, ? super T2, ? super T3, ? extends R> */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
            /* JADX WARN: Type inference incomplete: some casts might be missing */
            @Override // kotlin.jvm.functions.Function2
            public final R invoke(@NotNull C60060zuj c60060zuj, @NotNull C60053zuc c60053zuc) {
                Intrinsics.checkNotNullParameter(c60060zuj, "");
                Intrinsics.checkNotNullParameter(c60053zuc, "");
                yHO<T1, T2, T3, R> yho2 = yho;
                Intrinsics.KWHzl(4, "T1");
                Object objAEQbTJ = c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(Object.class), null, null);
                Intrinsics.KWHzl(4, "T2");
                Object objAEQbTJ2 = c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(Object.class), null, null);
                Intrinsics.KWHzl(4, "T3");
                return yho2.invoke((T1) objAEQbTJ, (T2) objAEQbTJ2, (T3) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(Object.class), null, null));
            }
        };
        C60055zue c60055zueKWHzl = C60059zui.KWHzl.KWHzl();
        Kind kind = Kind.Factory;
        java.util.List listAhwBna = yDY.AhwBna();
        Intrinsics.KWHzl(4, com.ibm.icu.text.DateFormat.JP_ERA_2019_NARROW);
        C59981ztJ c59981ztJ = new C59981ztJ(new C59978ztG(c60055zueKWHzl, C56524yIo.AEQbTJ(java.lang.Object.class), null, function2, kind, listAhwBna));
        c59991ztT.KWHzl(c59981ztJ);
        return C59994ztW.EZpvd(new C59976ztE(c59991ztT, c59981ztJ), function1);
    }

    public static /* synthetic */ C59976ztE factoryOf$default(C59991ztT c59991ztT, final yHT yht, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            function1 = null;
        }
        Intrinsics.checkNotNullParameter(c59991ztT, "");
        Intrinsics.checkNotNullParameter(yht, "");
        Intrinsics.OLrzqt();
        Function2<C60060zuj, C60053zuc, R> function2 = new Function2<C60060zuj, C60053zuc, R>() { // from class: org.koin.core.module.dsl.FactoryOfKt$factoryOf$5
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: o.yHT<? super T1, ? super T2, ? super T3, ? super T4, ? extends R> */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
            /* JADX WARN: Type inference incomplete: some casts might be missing */
            @Override // kotlin.jvm.functions.Function2
            public final R invoke(@NotNull C60060zuj c60060zuj, @NotNull C60053zuc c60053zuc) {
                Intrinsics.checkNotNullParameter(c60060zuj, "");
                Intrinsics.checkNotNullParameter(c60053zuc, "");
                yHT<T1, T2, T3, T4, R> yht2 = yht;
                Intrinsics.KWHzl(4, "T1");
                Object objAEQbTJ = c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(Object.class), null, null);
                Intrinsics.KWHzl(4, "T2");
                Object objAEQbTJ2 = c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(Object.class), null, null);
                Intrinsics.KWHzl(4, "T3");
                Object objAEQbTJ3 = c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(Object.class), null, null);
                Intrinsics.KWHzl(4, "T4");
                return yht2.invoke((T1) objAEQbTJ, (T2) objAEQbTJ2, (T3) objAEQbTJ3, (T4) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(Object.class), null, null));
            }
        };
        C60055zue c60055zueKWHzl = C60059zui.KWHzl.KWHzl();
        Kind kind = Kind.Factory;
        java.util.List listAhwBna = yDY.AhwBna();
        Intrinsics.KWHzl(4, com.ibm.icu.text.DateFormat.JP_ERA_2019_NARROW);
        C59981ztJ c59981ztJ = new C59981ztJ(new C59978ztG(c60055zueKWHzl, C56524yIo.AEQbTJ(java.lang.Object.class), null, function2, kind, listAhwBna));
        c59991ztT.KWHzl(c59981ztJ);
        return C59994ztW.EZpvd(new C59976ztE(c59991ztT, c59981ztJ), function1);
    }

    public static /* synthetic */ C59976ztE factoryOf$default(C59991ztT c59991ztT, final yHS yhs, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            function1 = null;
        }
        Intrinsics.checkNotNullParameter(c59991ztT, "");
        Intrinsics.checkNotNullParameter(yhs, "");
        Intrinsics.OLrzqt();
        Function2<C60060zuj, C60053zuc, R> function2 = new Function2<C60060zuj, C60053zuc, R>() { // from class: org.koin.core.module.dsl.FactoryOfKt$factoryOf$6
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: o.yHS<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? extends R> */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
            /* JADX WARN: Type inference incomplete: some casts might be missing */
            @Override // kotlin.jvm.functions.Function2
            public final R invoke(@NotNull C60060zuj c60060zuj, @NotNull C60053zuc c60053zuc) {
                Intrinsics.checkNotNullParameter(c60060zuj, "");
                Intrinsics.checkNotNullParameter(c60053zuc, "");
                yHS<T1, T2, T3, T4, T5, R> yhs2 = yhs;
                Intrinsics.KWHzl(4, "T1");
                Object objAEQbTJ = c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(Object.class), null, null);
                Intrinsics.KWHzl(4, "T2");
                Object objAEQbTJ2 = c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(Object.class), null, null);
                Intrinsics.KWHzl(4, "T3");
                Object objAEQbTJ3 = c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(Object.class), null, null);
                Intrinsics.KWHzl(4, "T4");
                Object objAEQbTJ4 = c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(Object.class), null, null);
                Intrinsics.KWHzl(4, "T5");
                return yhs2.invoke((T1) objAEQbTJ, (T2) objAEQbTJ2, (T3) objAEQbTJ3, (T4) objAEQbTJ4, (T5) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(Object.class), null, null));
            }
        };
        C60055zue c60055zueKWHzl = C60059zui.KWHzl.KWHzl();
        Kind kind = Kind.Factory;
        java.util.List listAhwBna = yDY.AhwBna();
        Intrinsics.KWHzl(4, com.ibm.icu.text.DateFormat.JP_ERA_2019_NARROW);
        C59981ztJ c59981ztJ = new C59981ztJ(new C59978ztG(c60055zueKWHzl, C56524yIo.AEQbTJ(java.lang.Object.class), null, function2, kind, listAhwBna));
        c59991ztT.KWHzl(c59981ztJ);
        return C59994ztW.EZpvd(new C59976ztE(c59991ztT, c59981ztJ), function1);
    }

    public static /* synthetic */ C59976ztE factoryOf$default(C59991ztT c59991ztT, final yHQ yhq, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            function1 = null;
        }
        Intrinsics.checkNotNullParameter(c59991ztT, "");
        Intrinsics.checkNotNullParameter(yhq, "");
        Intrinsics.OLrzqt();
        Function2<C60060zuj, C60053zuc, R> function2 = new Function2<C60060zuj, C60053zuc, R>() { // from class: org.koin.core.module.dsl.FactoryOfKt$factoryOf$7
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: o.yHQ<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? extends R> */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
            /* JADX WARN: Type inference incomplete: some casts might be missing */
            @Override // kotlin.jvm.functions.Function2
            public final R invoke(@NotNull C60060zuj c60060zuj, @NotNull C60053zuc c60053zuc) {
                Intrinsics.checkNotNullParameter(c60060zuj, "");
                Intrinsics.checkNotNullParameter(c60053zuc, "");
                yHQ<T1, T2, T3, T4, T5, T6, R> yhq2 = yhq;
                Intrinsics.KWHzl(4, "T1");
                Object objAEQbTJ = c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(Object.class), null, null);
                Intrinsics.KWHzl(4, "T2");
                Object objAEQbTJ2 = c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(Object.class), null, null);
                Intrinsics.KWHzl(4, "T3");
                Object objAEQbTJ3 = c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(Object.class), null, null);
                Intrinsics.KWHzl(4, "T4");
                Object objAEQbTJ4 = c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(Object.class), null, null);
                Intrinsics.KWHzl(4, "T5");
                Object objAEQbTJ5 = c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(Object.class), null, null);
                Intrinsics.KWHzl(4, "T6");
                return yhq2.invoke((T1) objAEQbTJ, (T2) objAEQbTJ2, (T3) objAEQbTJ3, (T4) objAEQbTJ4, (T5) objAEQbTJ5, (T6) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(Object.class), null, null));
            }
        };
        C60055zue c60055zueKWHzl = C60059zui.KWHzl.KWHzl();
        Kind kind = Kind.Factory;
        java.util.List listAhwBna = yDY.AhwBna();
        Intrinsics.KWHzl(4, com.ibm.icu.text.DateFormat.JP_ERA_2019_NARROW);
        C59981ztJ c59981ztJ = new C59981ztJ(new C59978ztG(c60055zueKWHzl, C56524yIo.AEQbTJ(java.lang.Object.class), null, function2, kind, listAhwBna));
        c59991ztT.KWHzl(c59981ztJ);
        return C59994ztW.EZpvd(new C59976ztE(c59991ztT, c59981ztJ), function1);
    }

    public static /* synthetic */ C59976ztE factoryOf$default(C59991ztT c59991ztT, final yHR yhr, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            function1 = null;
        }
        Intrinsics.checkNotNullParameter(c59991ztT, "");
        Intrinsics.checkNotNullParameter(yhr, "");
        Intrinsics.OLrzqt();
        Function2<C60060zuj, C60053zuc, R> function2 = new Function2<C60060zuj, C60053zuc, R>() { // from class: org.koin.core.module.dsl.FactoryOfKt$factoryOf$8
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: o.yHR<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? extends R> */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
            /* JADX WARN: Type inference incomplete: some casts might be missing */
            @Override // kotlin.jvm.functions.Function2
            public final R invoke(@NotNull C60060zuj c60060zuj, @NotNull C60053zuc c60053zuc) {
                Intrinsics.checkNotNullParameter(c60060zuj, "");
                Intrinsics.checkNotNullParameter(c60053zuc, "");
                yHR<T1, T2, T3, T4, T5, T6, T7, R> yhr2 = yhr;
                Intrinsics.KWHzl(4, "T1");
                Object objAEQbTJ = c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(Object.class), null, null);
                Intrinsics.KWHzl(4, "T2");
                Object objAEQbTJ2 = c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(Object.class), null, null);
                Intrinsics.KWHzl(4, "T3");
                Object objAEQbTJ3 = c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(Object.class), null, null);
                Intrinsics.KWHzl(4, "T4");
                Object objAEQbTJ4 = c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(Object.class), null, null);
                Intrinsics.KWHzl(4, "T5");
                Object objAEQbTJ5 = c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(Object.class), null, null);
                Intrinsics.KWHzl(4, "T6");
                Object objAEQbTJ6 = c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(Object.class), null, null);
                Intrinsics.KWHzl(4, "T7");
                return yhr2.invoke((T1) objAEQbTJ, (T2) objAEQbTJ2, (T3) objAEQbTJ3, (T4) objAEQbTJ4, (T5) objAEQbTJ5, (T6) objAEQbTJ6, (T7) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(Object.class), null, null));
            }
        };
        C60055zue c60055zueKWHzl = C60059zui.KWHzl.KWHzl();
        Kind kind = Kind.Factory;
        java.util.List listAhwBna = yDY.AhwBna();
        Intrinsics.KWHzl(4, com.ibm.icu.text.DateFormat.JP_ERA_2019_NARROW);
        C59981ztJ c59981ztJ = new C59981ztJ(new C59978ztG(c60055zueKWHzl, C56524yIo.AEQbTJ(java.lang.Object.class), null, function2, kind, listAhwBna));
        c59991ztT.KWHzl(c59981ztJ);
        return C59994ztW.EZpvd(new C59976ztE(c59991ztT, c59981ztJ), function1);
    }

    public static /* synthetic */ C59976ztE factoryOf$default(C59991ztT c59991ztT, final yHP yhp, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            function1 = null;
        }
        Intrinsics.checkNotNullParameter(c59991ztT, "");
        Intrinsics.checkNotNullParameter(yhp, "");
        Intrinsics.OLrzqt();
        Function2<C60060zuj, C60053zuc, R> function2 = new Function2<C60060zuj, C60053zuc, R>() { // from class: org.koin.core.module.dsl.FactoryOfKt$factoryOf$9
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: o.yHP<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? extends R> */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
            /* JADX WARN: Type inference incomplete: some casts might be missing */
            @Override // kotlin.jvm.functions.Function2
            public final R invoke(@NotNull C60060zuj c60060zuj, @NotNull C60053zuc c60053zuc) {
                Intrinsics.checkNotNullParameter(c60060zuj, "");
                Intrinsics.checkNotNullParameter(c60053zuc, "");
                yHP<T1, T2, T3, T4, T5, T6, T7, T8, R> yhp2 = yhp;
                Intrinsics.KWHzl(4, "T1");
                Object objAEQbTJ = c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(Object.class), null, null);
                Intrinsics.KWHzl(4, "T2");
                Object objAEQbTJ2 = c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(Object.class), null, null);
                Intrinsics.KWHzl(4, "T3");
                Object objAEQbTJ3 = c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(Object.class), null, null);
                Intrinsics.KWHzl(4, "T4");
                Object objAEQbTJ4 = c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(Object.class), null, null);
                Intrinsics.KWHzl(4, "T5");
                Object objAEQbTJ5 = c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(Object.class), null, null);
                Intrinsics.KWHzl(4, "T6");
                Object objAEQbTJ6 = c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(Object.class), null, null);
                Intrinsics.KWHzl(4, "T7");
                Object objAEQbTJ7 = c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(Object.class), null, null);
                Intrinsics.KWHzl(4, "T8");
                return yhp2.invoke((T1) objAEQbTJ, (T2) objAEQbTJ2, (T3) objAEQbTJ3, (T4) objAEQbTJ4, (T5) objAEQbTJ5, (T6) objAEQbTJ6, (T7) objAEQbTJ7, (T8) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(Object.class), null, null));
            }
        };
        C60055zue c60055zueKWHzl = C60059zui.KWHzl.KWHzl();
        Kind kind = Kind.Factory;
        java.util.List listAhwBna = yDY.AhwBna();
        Intrinsics.KWHzl(4, com.ibm.icu.text.DateFormat.JP_ERA_2019_NARROW);
        C59981ztJ c59981ztJ = new C59981ztJ(new C59978ztG(c60055zueKWHzl, C56524yIo.AEQbTJ(java.lang.Object.class), null, function2, kind, listAhwBna));
        c59991ztT.KWHzl(c59981ztJ);
        return C59994ztW.EZpvd(new C59976ztE(c59991ztT, c59981ztJ), function1);
    }

    public static /* synthetic */ C59976ztE factoryOf$default(C59991ztT c59991ztT, final yHY yhy, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            function1 = null;
        }
        Intrinsics.checkNotNullParameter(c59991ztT, "");
        Intrinsics.checkNotNullParameter(yhy, "");
        Intrinsics.OLrzqt();
        Function2<C60060zuj, C60053zuc, R> function2 = new Function2<C60060zuj, C60053zuc, R>() { // from class: org.koin.core.module.dsl.FactoryOfKt$factoryOf$10
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: o.yHY<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? extends R> */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
            /* JADX WARN: Type inference incomplete: some casts might be missing */
            @Override // kotlin.jvm.functions.Function2
            public final R invoke(@NotNull C60060zuj c60060zuj, @NotNull C60053zuc c60053zuc) {
                Intrinsics.checkNotNullParameter(c60060zuj, "");
                Intrinsics.checkNotNullParameter(c60053zuc, "");
                yHY<T1, T2, T3, T4, T5, T6, T7, T8, T9, R> yhy2 = yhy;
                Intrinsics.KWHzl(4, "T1");
                Object objAEQbTJ = c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(Object.class), null, null);
                Intrinsics.KWHzl(4, "T2");
                Object objAEQbTJ2 = c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(Object.class), null, null);
                Intrinsics.KWHzl(4, "T3");
                Object objAEQbTJ3 = c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(Object.class), null, null);
                Intrinsics.KWHzl(4, "T4");
                Object objAEQbTJ4 = c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(Object.class), null, null);
                Intrinsics.KWHzl(4, "T5");
                Object objAEQbTJ5 = c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(Object.class), null, null);
                Intrinsics.KWHzl(4, "T6");
                Object objAEQbTJ6 = c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(Object.class), null, null);
                Intrinsics.KWHzl(4, "T7");
                Object objAEQbTJ7 = c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(Object.class), null, null);
                Intrinsics.KWHzl(4, "T8");
                Object objAEQbTJ8 = c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(Object.class), null, null);
                Intrinsics.KWHzl(4, "T9");
                return yhy2.invoke((T1) objAEQbTJ, (T2) objAEQbTJ2, (T3) objAEQbTJ3, (T4) objAEQbTJ4, (T5) objAEQbTJ5, (T6) objAEQbTJ6, (T7) objAEQbTJ7, (T8) objAEQbTJ8, (T9) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(Object.class), null, null));
            }
        };
        C60055zue c60055zueKWHzl = C60059zui.KWHzl.KWHzl();
        Kind kind = Kind.Factory;
        java.util.List listAhwBna = yDY.AhwBna();
        Intrinsics.KWHzl(4, com.ibm.icu.text.DateFormat.JP_ERA_2019_NARROW);
        C59981ztJ c59981ztJ = new C59981ztJ(new C59978ztG(c60055zueKWHzl, C56524yIo.AEQbTJ(java.lang.Object.class), null, function2, kind, listAhwBna));
        c59991ztT.KWHzl(c59981ztJ);
        return C59994ztW.EZpvd(new C59976ztE(c59991ztT, c59981ztJ), function1);
    }

    public static /* synthetic */ C59976ztE factoryOf$default(C59991ztT c59991ztT, final yHC yhc, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            function1 = null;
        }
        Intrinsics.checkNotNullParameter(c59991ztT, "");
        Intrinsics.checkNotNullParameter(yhc, "");
        Intrinsics.OLrzqt();
        Function2<C60060zuj, C60053zuc, R> function2 = new Function2<C60060zuj, C60053zuc, R>() { // from class: org.koin.core.module.dsl.FactoryOfKt$factoryOf$11
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: o.yHC<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? super T10, ? extends R> */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
            /* JADX WARN: Type inference incomplete: some casts might be missing */
            @Override // kotlin.jvm.functions.Function2
            public final R invoke(@NotNull C60060zuj c60060zuj, @NotNull C60053zuc c60053zuc) {
                Intrinsics.checkNotNullParameter(c60060zuj, "");
                Intrinsics.checkNotNullParameter(c60053zuc, "");
                yHC<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, R> yhc2 = yhc;
                Intrinsics.KWHzl(4, "T1");
                Object objAEQbTJ = c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(Object.class), null, null);
                Intrinsics.KWHzl(4, "T2");
                Object objAEQbTJ2 = c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(Object.class), null, null);
                Intrinsics.KWHzl(4, "T3");
                Object objAEQbTJ3 = c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(Object.class), null, null);
                Intrinsics.KWHzl(4, "T4");
                Object objAEQbTJ4 = c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(Object.class), null, null);
                Intrinsics.KWHzl(4, "T5");
                Object objAEQbTJ5 = c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(Object.class), null, null);
                Intrinsics.KWHzl(4, "T6");
                Object objAEQbTJ6 = c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(Object.class), null, null);
                Intrinsics.KWHzl(4, "T7");
                Object objAEQbTJ7 = c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(Object.class), null, null);
                Intrinsics.KWHzl(4, "T8");
                Object objAEQbTJ8 = c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(Object.class), null, null);
                Intrinsics.KWHzl(4, "T9");
                Object objAEQbTJ9 = c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(Object.class), null, null);
                Intrinsics.KWHzl(4, "T10");
                return yhc2.invoke((T1) objAEQbTJ, (T2) objAEQbTJ2, (T3) objAEQbTJ3, (T4) objAEQbTJ4, (T5) objAEQbTJ5, (T6) objAEQbTJ6, (T7) objAEQbTJ7, (T8) objAEQbTJ8, (T9) objAEQbTJ9, (T10) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(Object.class), null, null));
            }
        };
        C60055zue c60055zueKWHzl = C60059zui.KWHzl.KWHzl();
        Kind kind = Kind.Factory;
        java.util.List listAhwBna = yDY.AhwBna();
        Intrinsics.KWHzl(4, com.ibm.icu.text.DateFormat.JP_ERA_2019_NARROW);
        C59981ztJ c59981ztJ = new C59981ztJ(new C59978ztG(c60055zueKWHzl, C56524yIo.AEQbTJ(java.lang.Object.class), null, function2, kind, listAhwBna));
        c59991ztT.KWHzl(c59981ztJ);
        return C59994ztW.EZpvd(new C59976ztE(c59991ztT, c59981ztJ), function1);
    }

    public static /* synthetic */ C59976ztE factoryOf$default(C59991ztT c59991ztT, final yHA yha, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            function1 = null;
        }
        Intrinsics.checkNotNullParameter(c59991ztT, "");
        Intrinsics.checkNotNullParameter(yha, "");
        Intrinsics.OLrzqt();
        Function2<C60060zuj, C60053zuc, R> function2 = new Function2<C60060zuj, C60053zuc, R>() { // from class: org.koin.core.module.dsl.FactoryOfKt$factoryOf$12
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: o.yHA<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? super T10, ? super T11, ? extends R> */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
            /* JADX WARN: Type inference incomplete: some casts might be missing */
            @Override // kotlin.jvm.functions.Function2
            public final R invoke(@NotNull C60060zuj c60060zuj, @NotNull C60053zuc c60053zuc) {
                Intrinsics.checkNotNullParameter(c60060zuj, "");
                Intrinsics.checkNotNullParameter(c60053zuc, "");
                yHA<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, R> yha2 = yha;
                Intrinsics.KWHzl(4, "T1");
                Object objAEQbTJ = c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(Object.class), null, null);
                Intrinsics.KWHzl(4, "T2");
                Object objAEQbTJ2 = c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(Object.class), null, null);
                Intrinsics.KWHzl(4, "T3");
                Object objAEQbTJ3 = c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(Object.class), null, null);
                Intrinsics.KWHzl(4, "T4");
                Object objAEQbTJ4 = c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(Object.class), null, null);
                Intrinsics.KWHzl(4, "T5");
                Object objAEQbTJ5 = c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(Object.class), null, null);
                Intrinsics.KWHzl(4, "T6");
                Object objAEQbTJ6 = c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(Object.class), null, null);
                Intrinsics.KWHzl(4, "T7");
                Object objAEQbTJ7 = c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(Object.class), null, null);
                Intrinsics.KWHzl(4, "T8");
                Object objAEQbTJ8 = c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(Object.class), null, null);
                Intrinsics.KWHzl(4, "T9");
                Object objAEQbTJ9 = c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(Object.class), null, null);
                Intrinsics.KWHzl(4, "T10");
                Object objAEQbTJ10 = c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(Object.class), null, null);
                Intrinsics.KWHzl(4, "T11");
                return yha2.invoke((T1) objAEQbTJ, (T2) objAEQbTJ2, (T3) objAEQbTJ3, (T4) objAEQbTJ4, (T5) objAEQbTJ5, (T6) objAEQbTJ6, (T7) objAEQbTJ7, (T8) objAEQbTJ8, (T9) objAEQbTJ9, (T10) objAEQbTJ10, (T11) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(Object.class), null, null));
            }
        };
        C60055zue c60055zueKWHzl = C60059zui.KWHzl.KWHzl();
        Kind kind = Kind.Factory;
        java.util.List listAhwBna = yDY.AhwBna();
        Intrinsics.KWHzl(4, com.ibm.icu.text.DateFormat.JP_ERA_2019_NARROW);
        C59981ztJ c59981ztJ = new C59981ztJ(new C59978ztG(c60055zueKWHzl, C56524yIo.AEQbTJ(java.lang.Object.class), null, function2, kind, listAhwBna));
        c59991ztT.KWHzl(c59981ztJ);
        return C59994ztW.EZpvd(new C59976ztE(c59991ztT, c59981ztJ), function1);
    }

    public static /* synthetic */ C59976ztE factoryOf$default(C59991ztT c59991ztT, final yHD yhd, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            function1 = null;
        }
        Intrinsics.checkNotNullParameter(c59991ztT, "");
        Intrinsics.checkNotNullParameter(yhd, "");
        Intrinsics.OLrzqt();
        Function2<C60060zuj, C60053zuc, R> function2 = new Function2<C60060zuj, C60053zuc, R>() { // from class: org.koin.core.module.dsl.FactoryOfKt$factoryOf$13
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: o.yHD<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? super T10, ? super T11, ? super T12, ? extends R> */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
            /* JADX WARN: Type inference incomplete: some casts might be missing */
            @Override // kotlin.jvm.functions.Function2
            public final R invoke(@NotNull C60060zuj c60060zuj, @NotNull C60053zuc c60053zuc) {
                Intrinsics.checkNotNullParameter(c60060zuj, "");
                Intrinsics.checkNotNullParameter(c60053zuc, "");
                yHD<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, R> yhd2 = yhd;
                Intrinsics.KWHzl(4, "T1");
                Object objAEQbTJ = c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(Object.class), null, null);
                Intrinsics.KWHzl(4, "T2");
                Object objAEQbTJ2 = c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(Object.class), null, null);
                Intrinsics.KWHzl(4, "T3");
                Object objAEQbTJ3 = c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(Object.class), null, null);
                Intrinsics.KWHzl(4, "T4");
                Object objAEQbTJ4 = c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(Object.class), null, null);
                Intrinsics.KWHzl(4, "T5");
                Object objAEQbTJ5 = c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(Object.class), null, null);
                Intrinsics.KWHzl(4, "T6");
                Object objAEQbTJ6 = c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(Object.class), null, null);
                Intrinsics.KWHzl(4, "T7");
                Object objAEQbTJ7 = c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(Object.class), null, null);
                Intrinsics.KWHzl(4, "T8");
                Object objAEQbTJ8 = c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(Object.class), null, null);
                Intrinsics.KWHzl(4, "T9");
                Object objAEQbTJ9 = c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(Object.class), null, null);
                Intrinsics.KWHzl(4, "T10");
                Object objAEQbTJ10 = c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(Object.class), null, null);
                Intrinsics.KWHzl(4, "T11");
                Object objAEQbTJ11 = c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(Object.class), null, null);
                Intrinsics.KWHzl(4, "T12");
                return yhd2.invoke((T1) objAEQbTJ, (T2) objAEQbTJ2, (T3) objAEQbTJ3, (T4) objAEQbTJ4, (T5) objAEQbTJ5, (T6) objAEQbTJ6, (T7) objAEQbTJ7, (T8) objAEQbTJ8, (T9) objAEQbTJ9, (T10) objAEQbTJ10, (T11) objAEQbTJ11, (T12) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(Object.class), null, null));
            }
        };
        C60055zue c60055zueKWHzl = C60059zui.KWHzl.KWHzl();
        Kind kind = Kind.Factory;
        java.util.List listAhwBna = yDY.AhwBna();
        Intrinsics.KWHzl(4, com.ibm.icu.text.DateFormat.JP_ERA_2019_NARROW);
        C59981ztJ c59981ztJ = new C59981ztJ(new C59978ztG(c60055zueKWHzl, C56524yIo.AEQbTJ(java.lang.Object.class), null, function2, kind, listAhwBna));
        c59991ztT.KWHzl(c59981ztJ);
        return C59994ztW.EZpvd(new C59976ztE(c59991ztT, c59981ztJ), function1);
    }

    public static /* synthetic */ C59976ztE factoryOf$default(C59991ztT c59991ztT, final yHB yhb, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            function1 = null;
        }
        Intrinsics.checkNotNullParameter(c59991ztT, "");
        Intrinsics.checkNotNullParameter(yhb, "");
        Intrinsics.OLrzqt();
        Function2<C60060zuj, C60053zuc, R> function2 = new Function2<C60060zuj, C60053zuc, R>() { // from class: org.koin.core.module.dsl.FactoryOfKt$factoryOf$14
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: o.yHB<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? super T10, ? super T11, ? super T12, ? super T13, ? extends R> */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
            /* JADX WARN: Type inference incomplete: some casts might be missing */
            @Override // kotlin.jvm.functions.Function2
            public final R invoke(@NotNull C60060zuj c60060zuj, @NotNull C60053zuc c60053zuc) {
                Intrinsics.checkNotNullParameter(c60060zuj, "");
                Intrinsics.checkNotNullParameter(c60053zuc, "");
                yHB<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, R> yhb2 = yhb;
                Intrinsics.KWHzl(4, "T1");
                Object objAEQbTJ = c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(Object.class), null, null);
                Intrinsics.KWHzl(4, "T2");
                Object objAEQbTJ2 = c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(Object.class), null, null);
                Intrinsics.KWHzl(4, "T3");
                Object objAEQbTJ3 = c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(Object.class), null, null);
                Intrinsics.KWHzl(4, "T4");
                Object objAEQbTJ4 = c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(Object.class), null, null);
                Intrinsics.KWHzl(4, "T5");
                Object objAEQbTJ5 = c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(Object.class), null, null);
                Intrinsics.KWHzl(4, "T6");
                Object objAEQbTJ6 = c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(Object.class), null, null);
                Intrinsics.KWHzl(4, "T7");
                Object objAEQbTJ7 = c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(Object.class), null, null);
                Intrinsics.KWHzl(4, "T8");
                Object objAEQbTJ8 = c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(Object.class), null, null);
                Intrinsics.KWHzl(4, "T9");
                Object objAEQbTJ9 = c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(Object.class), null, null);
                Intrinsics.KWHzl(4, "T10");
                Object objAEQbTJ10 = c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(Object.class), null, null);
                Intrinsics.KWHzl(4, "T11");
                Object objAEQbTJ11 = c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(Object.class), null, null);
                Intrinsics.KWHzl(4, "T12");
                Object objAEQbTJ12 = c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(Object.class), null, null);
                Intrinsics.KWHzl(4, "T13");
                return yhb2.invoke((T1) objAEQbTJ, (T2) objAEQbTJ2, (T3) objAEQbTJ3, (T4) objAEQbTJ4, (T5) objAEQbTJ5, (T6) objAEQbTJ6, (T7) objAEQbTJ7, (T8) objAEQbTJ8, (T9) objAEQbTJ9, (T10) objAEQbTJ10, (T11) objAEQbTJ11, (T12) objAEQbTJ12, (T13) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(Object.class), null, null));
            }
        };
        C60055zue c60055zueKWHzl = C60059zui.KWHzl.KWHzl();
        Kind kind = Kind.Factory;
        java.util.List listAhwBna = yDY.AhwBna();
        Intrinsics.KWHzl(4, com.ibm.icu.text.DateFormat.JP_ERA_2019_NARROW);
        C59981ztJ c59981ztJ = new C59981ztJ(new C59978ztG(c60055zueKWHzl, C56524yIo.AEQbTJ(java.lang.Object.class), null, function2, kind, listAhwBna));
        c59991ztT.KWHzl(c59981ztJ);
        return C59994ztW.EZpvd(new C59976ztE(c59991ztT, c59981ztJ), function1);
    }

    public static /* synthetic */ C59976ztE factoryOf$default(C59991ztT c59991ztT, final yHI yhi, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            function1 = null;
        }
        Intrinsics.checkNotNullParameter(c59991ztT, "");
        Intrinsics.checkNotNullParameter(yhi, "");
        Intrinsics.OLrzqt();
        Function2<C60060zuj, C60053zuc, R> function2 = new Function2<C60060zuj, C60053zuc, R>() { // from class: org.koin.core.module.dsl.FactoryOfKt$factoryOf$15
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: o.yHI<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? super T10, ? super T11, ? super T12, ? super T13, ? super T14, ? extends R> */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
            /* JADX WARN: Type inference incomplete: some casts might be missing */
            @Override // kotlin.jvm.functions.Function2
            public final R invoke(@NotNull C60060zuj c60060zuj, @NotNull C60053zuc c60053zuc) {
                Intrinsics.checkNotNullParameter(c60060zuj, "");
                Intrinsics.checkNotNullParameter(c60053zuc, "");
                yHI<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, R> yhi2 = yhi;
                Intrinsics.KWHzl(4, "T1");
                Object objAEQbTJ = c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(Object.class), null, null);
                Intrinsics.KWHzl(4, "T2");
                Object objAEQbTJ2 = c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(Object.class), null, null);
                Intrinsics.KWHzl(4, "T3");
                Object objAEQbTJ3 = c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(Object.class), null, null);
                Intrinsics.KWHzl(4, "T4");
                Object objAEQbTJ4 = c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(Object.class), null, null);
                Intrinsics.KWHzl(4, "T5");
                Object objAEQbTJ5 = c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(Object.class), null, null);
                Intrinsics.KWHzl(4, "T6");
                Object objAEQbTJ6 = c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(Object.class), null, null);
                Intrinsics.KWHzl(4, "T7");
                Object objAEQbTJ7 = c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(Object.class), null, null);
                Intrinsics.KWHzl(4, "T8");
                Object objAEQbTJ8 = c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(Object.class), null, null);
                Intrinsics.KWHzl(4, "T9");
                Object objAEQbTJ9 = c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(Object.class), null, null);
                Intrinsics.KWHzl(4, "T10");
                Object objAEQbTJ10 = c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(Object.class), null, null);
                Intrinsics.KWHzl(4, "T11");
                Object objAEQbTJ11 = c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(Object.class), null, null);
                Intrinsics.KWHzl(4, "T12");
                Object objAEQbTJ12 = c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(Object.class), null, null);
                Intrinsics.KWHzl(4, "T13");
                Object objAEQbTJ13 = c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(Object.class), null, null);
                Intrinsics.KWHzl(4, "T14");
                return yhi2.invoke((T1) objAEQbTJ, (T2) objAEQbTJ2, (T3) objAEQbTJ3, (T4) objAEQbTJ4, (T5) objAEQbTJ5, (T6) objAEQbTJ6, (T7) objAEQbTJ7, (T8) objAEQbTJ8, (T9) objAEQbTJ9, (T10) objAEQbTJ10, (T11) objAEQbTJ11, (T12) objAEQbTJ12, (T13) objAEQbTJ13, (T14) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(Object.class), null, null));
            }
        };
        C60055zue c60055zueKWHzl = C60059zui.KWHzl.KWHzl();
        Kind kind = Kind.Factory;
        java.util.List listAhwBna = yDY.AhwBna();
        Intrinsics.KWHzl(4, com.ibm.icu.text.DateFormat.JP_ERA_2019_NARROW);
        C59981ztJ c59981ztJ = new C59981ztJ(new C59978ztG(c60055zueKWHzl, C56524yIo.AEQbTJ(java.lang.Object.class), null, function2, kind, listAhwBna));
        c59991ztT.KWHzl(c59981ztJ);
        return C59994ztW.EZpvd(new C59976ztE(c59991ztT, c59981ztJ), function1);
    }

    public static /* synthetic */ C59976ztE factoryOf$default(C59991ztT c59991ztT, final yHJ yhj, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            function1 = null;
        }
        Intrinsics.checkNotNullParameter(c59991ztT, "");
        Intrinsics.checkNotNullParameter(yhj, "");
        Intrinsics.OLrzqt();
        Function2<C60060zuj, C60053zuc, R> function2 = new Function2<C60060zuj, C60053zuc, R>() { // from class: org.koin.core.module.dsl.FactoryOfKt$factoryOf$16
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: o.yHJ<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? super T10, ? super T11, ? super T12, ? super T13, ? super T14, ? super T15, ? extends R> */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
            /* JADX WARN: Type inference incomplete: some casts might be missing */
            @Override // kotlin.jvm.functions.Function2
            public final R invoke(@NotNull C60060zuj c60060zuj, @NotNull C60053zuc c60053zuc) {
                Intrinsics.checkNotNullParameter(c60060zuj, "");
                Intrinsics.checkNotNullParameter(c60053zuc, "");
                yHJ<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, R> yhj2 = yhj;
                Intrinsics.KWHzl(4, "T1");
                Object objAEQbTJ = c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(Object.class), null, null);
                Intrinsics.KWHzl(4, "T2");
                Object objAEQbTJ2 = c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(Object.class), null, null);
                Intrinsics.KWHzl(4, "T3");
                Object objAEQbTJ3 = c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(Object.class), null, null);
                Intrinsics.KWHzl(4, "T4");
                Object objAEQbTJ4 = c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(Object.class), null, null);
                Intrinsics.KWHzl(4, "T5");
                Object objAEQbTJ5 = c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(Object.class), null, null);
                Intrinsics.KWHzl(4, "T6");
                Object objAEQbTJ6 = c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(Object.class), null, null);
                Intrinsics.KWHzl(4, "T7");
                Object objAEQbTJ7 = c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(Object.class), null, null);
                Intrinsics.KWHzl(4, "T8");
                Object objAEQbTJ8 = c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(Object.class), null, null);
                Intrinsics.KWHzl(4, "T9");
                Object objAEQbTJ9 = c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(Object.class), null, null);
                Intrinsics.KWHzl(4, "T10");
                Object objAEQbTJ10 = c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(Object.class), null, null);
                Intrinsics.KWHzl(4, "T11");
                Object objAEQbTJ11 = c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(Object.class), null, null);
                Intrinsics.KWHzl(4, "T12");
                Object objAEQbTJ12 = c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(Object.class), null, null);
                Intrinsics.KWHzl(4, "T13");
                Object objAEQbTJ13 = c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(Object.class), null, null);
                Intrinsics.KWHzl(4, "T14");
                Object objAEQbTJ14 = c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(Object.class), null, null);
                Intrinsics.KWHzl(4, "T15");
                return yhj2.invoke((T1) objAEQbTJ, (T2) objAEQbTJ2, (T3) objAEQbTJ3, (T4) objAEQbTJ4, (T5) objAEQbTJ5, (T6) objAEQbTJ6, (T7) objAEQbTJ7, (T8) objAEQbTJ8, (T9) objAEQbTJ9, (T10) objAEQbTJ10, (T11) objAEQbTJ11, (T12) objAEQbTJ12, (T13) objAEQbTJ13, (T14) objAEQbTJ14, (T15) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(Object.class), null, null));
            }
        };
        C60055zue c60055zueKWHzl = C60059zui.KWHzl.KWHzl();
        Kind kind = Kind.Factory;
        java.util.List listAhwBna = yDY.AhwBna();
        Intrinsics.KWHzl(4, com.ibm.icu.text.DateFormat.JP_ERA_2019_NARROW);
        C59981ztJ c59981ztJ = new C59981ztJ(new C59978ztG(c60055zueKWHzl, C56524yIo.AEQbTJ(java.lang.Object.class), null, function2, kind, listAhwBna));
        c59991ztT.KWHzl(c59981ztJ);
        return C59994ztW.EZpvd(new C59976ztE(c59991ztT, c59981ztJ), function1);
    }

    public static /* synthetic */ C59976ztE factoryOf$default(C59991ztT c59991ztT, final yHF yhf, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            function1 = null;
        }
        Intrinsics.checkNotNullParameter(c59991ztT, "");
        Intrinsics.checkNotNullParameter(yhf, "");
        Intrinsics.OLrzqt();
        Function2<C60060zuj, C60053zuc, R> function2 = new Function2<C60060zuj, C60053zuc, R>() { // from class: org.koin.core.module.dsl.FactoryOfKt$factoryOf$17
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: o.yHF<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? super T10, ? super T11, ? super T12, ? super T13, ? super T14, ? super T15, ? super T16, ? extends R> */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
            /* JADX WARN: Type inference incomplete: some casts might be missing */
            @Override // kotlin.jvm.functions.Function2
            public final R invoke(@NotNull C60060zuj c60060zuj, @NotNull C60053zuc c60053zuc) {
                Intrinsics.checkNotNullParameter(c60060zuj, "");
                Intrinsics.checkNotNullParameter(c60053zuc, "");
                yHF<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, R> yhf2 = yhf;
                Intrinsics.KWHzl(4, "T1");
                Object objAEQbTJ = c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(Object.class), null, null);
                Intrinsics.KWHzl(4, "T2");
                Object objAEQbTJ2 = c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(Object.class), null, null);
                Intrinsics.KWHzl(4, "T3");
                Object objAEQbTJ3 = c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(Object.class), null, null);
                Intrinsics.KWHzl(4, "T4");
                Object objAEQbTJ4 = c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(Object.class), null, null);
                Intrinsics.KWHzl(4, "T5");
                Object objAEQbTJ5 = c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(Object.class), null, null);
                Intrinsics.KWHzl(4, "T6");
                Object objAEQbTJ6 = c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(Object.class), null, null);
                Intrinsics.KWHzl(4, "T7");
                Object objAEQbTJ7 = c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(Object.class), null, null);
                Intrinsics.KWHzl(4, "T8");
                Object objAEQbTJ8 = c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(Object.class), null, null);
                Intrinsics.KWHzl(4, "T9");
                Object objAEQbTJ9 = c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(Object.class), null, null);
                Intrinsics.KWHzl(4, "T10");
                Object objAEQbTJ10 = c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(Object.class), null, null);
                Intrinsics.KWHzl(4, "T11");
                Object objAEQbTJ11 = c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(Object.class), null, null);
                Intrinsics.KWHzl(4, "T12");
                Object objAEQbTJ12 = c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(Object.class), null, null);
                Intrinsics.KWHzl(4, "T13");
                Object objAEQbTJ13 = c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(Object.class), null, null);
                Intrinsics.KWHzl(4, "T14");
                Object objAEQbTJ14 = c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(Object.class), null, null);
                Intrinsics.KWHzl(4, "T15");
                Object objAEQbTJ15 = c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(Object.class), null, null);
                Intrinsics.KWHzl(4, "T16");
                return yhf2.invoke((T1) objAEQbTJ, (T2) objAEQbTJ2, (T3) objAEQbTJ3, (T4) objAEQbTJ4, (T5) objAEQbTJ5, (T6) objAEQbTJ6, (T7) objAEQbTJ7, (T8) objAEQbTJ8, (T9) objAEQbTJ9, (T10) objAEQbTJ10, (T11) objAEQbTJ11, (T12) objAEQbTJ12, (T13) objAEQbTJ13, (T14) objAEQbTJ14, (T15) objAEQbTJ15, (T16) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(Object.class), null, null));
            }
        };
        C60055zue c60055zueKWHzl = C60059zui.KWHzl.KWHzl();
        Kind kind = Kind.Factory;
        java.util.List listAhwBna = yDY.AhwBna();
        Intrinsics.KWHzl(4, com.ibm.icu.text.DateFormat.JP_ERA_2019_NARROW);
        C59981ztJ c59981ztJ = new C59981ztJ(new C59978ztG(c60055zueKWHzl, C56524yIo.AEQbTJ(java.lang.Object.class), null, function2, kind, listAhwBna));
        c59991ztT.KWHzl(c59981ztJ);
        return C59994ztW.EZpvd(new C59976ztE(c59991ztT, c59981ztJ), function1);
    }

    public static /* synthetic */ C59976ztE factoryOf$default(C59991ztT c59991ztT, final yHG yhg, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            function1 = null;
        }
        Intrinsics.checkNotNullParameter(c59991ztT, "");
        Intrinsics.checkNotNullParameter(yhg, "");
        Intrinsics.OLrzqt();
        Function2<C60060zuj, C60053zuc, R> function2 = new Function2<C60060zuj, C60053zuc, R>() { // from class: org.koin.core.module.dsl.FactoryOfKt$factoryOf$18
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: o.yHG<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? super T10, ? super T11, ? super T12, ? super T13, ? super T14, ? super T15, ? super T16, ? super T17, ? extends R> */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
            /* JADX WARN: Type inference incomplete: some casts might be missing */
            @Override // kotlin.jvm.functions.Function2
            public final R invoke(@NotNull C60060zuj c60060zuj, @NotNull C60053zuc c60053zuc) {
                Intrinsics.checkNotNullParameter(c60060zuj, "");
                Intrinsics.checkNotNullParameter(c60053zuc, "");
                yHG<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, R> yhg2 = yhg;
                Intrinsics.KWHzl(4, "T1");
                Object objAEQbTJ = c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(Object.class), null, null);
                Intrinsics.KWHzl(4, "T2");
                Object objAEQbTJ2 = c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(Object.class), null, null);
                Intrinsics.KWHzl(4, "T3");
                Object objAEQbTJ3 = c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(Object.class), null, null);
                Intrinsics.KWHzl(4, "T4");
                Object objAEQbTJ4 = c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(Object.class), null, null);
                Intrinsics.KWHzl(4, "T5");
                Object objAEQbTJ5 = c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(Object.class), null, null);
                Intrinsics.KWHzl(4, "T6");
                Object objAEQbTJ6 = c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(Object.class), null, null);
                Intrinsics.KWHzl(4, "T7");
                Object objAEQbTJ7 = c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(Object.class), null, null);
                Intrinsics.KWHzl(4, "T8");
                Object objAEQbTJ8 = c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(Object.class), null, null);
                Intrinsics.KWHzl(4, "T9");
                Object objAEQbTJ9 = c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(Object.class), null, null);
                Intrinsics.KWHzl(4, "T10");
                Object objAEQbTJ10 = c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(Object.class), null, null);
                Intrinsics.KWHzl(4, "T11");
                Object objAEQbTJ11 = c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(Object.class), null, null);
                Intrinsics.KWHzl(4, "T12");
                Object objAEQbTJ12 = c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(Object.class), null, null);
                Intrinsics.KWHzl(4, "T13");
                Object objAEQbTJ13 = c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(Object.class), null, null);
                Intrinsics.KWHzl(4, "T14");
                Object objAEQbTJ14 = c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(Object.class), null, null);
                Intrinsics.KWHzl(4, "T15");
                Object objAEQbTJ15 = c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(Object.class), null, null);
                Intrinsics.KWHzl(4, "T16");
                Object objAEQbTJ16 = c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(Object.class), null, null);
                Intrinsics.KWHzl(4, "T17");
                return yhg2.invoke((T1) objAEQbTJ, (T2) objAEQbTJ2, (T3) objAEQbTJ3, (T4) objAEQbTJ4, (T5) objAEQbTJ5, (T6) objAEQbTJ6, (T7) objAEQbTJ7, (T8) objAEQbTJ8, (T9) objAEQbTJ9, (T10) objAEQbTJ10, (T11) objAEQbTJ11, (T12) objAEQbTJ12, (T13) objAEQbTJ13, (T14) objAEQbTJ14, (T15) objAEQbTJ15, (T16) objAEQbTJ16, (T17) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(Object.class), null, null));
            }
        };
        C60055zue c60055zueKWHzl = C60059zui.KWHzl.KWHzl();
        Kind kind = Kind.Factory;
        java.util.List listAhwBna = yDY.AhwBna();
        Intrinsics.KWHzl(4, com.ibm.icu.text.DateFormat.JP_ERA_2019_NARROW);
        C59981ztJ c59981ztJ = new C59981ztJ(new C59978ztG(c60055zueKWHzl, C56524yIo.AEQbTJ(java.lang.Object.class), null, function2, kind, listAhwBna));
        c59991ztT.KWHzl(c59981ztJ);
        return C59994ztW.EZpvd(new C59976ztE(c59991ztT, c59981ztJ), function1);
    }

    public static /* synthetic */ C59976ztE factoryOf$default(C59991ztT c59991ztT, final yHH yhh, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            function1 = null;
        }
        Intrinsics.checkNotNullParameter(c59991ztT, "");
        Intrinsics.checkNotNullParameter(yhh, "");
        Intrinsics.OLrzqt();
        Function2<C60060zuj, C60053zuc, R> function2 = new Function2<C60060zuj, C60053zuc, R>() { // from class: org.koin.core.module.dsl.FactoryOfKt$factoryOf$19
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: o.yHH<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? super T10, ? super T11, ? super T12, ? super T13, ? super T14, ? super T15, ? super T16, ? super T17, ? super T18, ? extends R> */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
            /* JADX WARN: Type inference incomplete: some casts might be missing */
            @Override // kotlin.jvm.functions.Function2
            public final R invoke(@NotNull C60060zuj c60060zuj, @NotNull C60053zuc c60053zuc) {
                Intrinsics.checkNotNullParameter(c60060zuj, "");
                Intrinsics.checkNotNullParameter(c60053zuc, "");
                yHH<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, R> yhh2 = yhh;
                Intrinsics.KWHzl(4, "T1");
                Object objAEQbTJ = c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(Object.class), null, null);
                Intrinsics.KWHzl(4, "T2");
                Object objAEQbTJ2 = c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(Object.class), null, null);
                Intrinsics.KWHzl(4, "T3");
                Object objAEQbTJ3 = c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(Object.class), null, null);
                Intrinsics.KWHzl(4, "T4");
                Object objAEQbTJ4 = c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(Object.class), null, null);
                Intrinsics.KWHzl(4, "T5");
                Object objAEQbTJ5 = c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(Object.class), null, null);
                Intrinsics.KWHzl(4, "T6");
                Object objAEQbTJ6 = c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(Object.class), null, null);
                Intrinsics.KWHzl(4, "T7");
                Object objAEQbTJ7 = c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(Object.class), null, null);
                Intrinsics.KWHzl(4, "T8");
                Object objAEQbTJ8 = c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(Object.class), null, null);
                Intrinsics.KWHzl(4, "T9");
                Object objAEQbTJ9 = c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(Object.class), null, null);
                Intrinsics.KWHzl(4, "T10");
                Object objAEQbTJ10 = c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(Object.class), null, null);
                Intrinsics.KWHzl(4, "T11");
                Object objAEQbTJ11 = c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(Object.class), null, null);
                Intrinsics.KWHzl(4, "T12");
                Object objAEQbTJ12 = c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(Object.class), null, null);
                Intrinsics.KWHzl(4, "T13");
                Object objAEQbTJ13 = c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(Object.class), null, null);
                Intrinsics.KWHzl(4, "T14");
                Object objAEQbTJ14 = c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(Object.class), null, null);
                Intrinsics.KWHzl(4, "T15");
                Object objAEQbTJ15 = c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(Object.class), null, null);
                Intrinsics.KWHzl(4, "T16");
                Object objAEQbTJ16 = c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(Object.class), null, null);
                Intrinsics.KWHzl(4, "T17");
                Object objAEQbTJ17 = c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(Object.class), null, null);
                Intrinsics.KWHzl(4, "T18");
                return yhh2.invoke((T1) objAEQbTJ, (T2) objAEQbTJ2, (T3) objAEQbTJ3, (T4) objAEQbTJ4, (T5) objAEQbTJ5, (T6) objAEQbTJ6, (T7) objAEQbTJ7, (T8) objAEQbTJ8, (T9) objAEQbTJ9, (T10) objAEQbTJ10, (T11) objAEQbTJ11, (T12) objAEQbTJ12, (T13) objAEQbTJ13, (T14) objAEQbTJ14, (T15) objAEQbTJ15, (T16) objAEQbTJ16, (T17) objAEQbTJ17, (T18) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(Object.class), null, null));
            }
        };
        C60055zue c60055zueKWHzl = C60059zui.KWHzl.KWHzl();
        Kind kind = Kind.Factory;
        java.util.List listAhwBna = yDY.AhwBna();
        Intrinsics.KWHzl(4, com.ibm.icu.text.DateFormat.JP_ERA_2019_NARROW);
        C59981ztJ c59981ztJ = new C59981ztJ(new C59978ztG(c60055zueKWHzl, C56524yIo.AEQbTJ(java.lang.Object.class), null, function2, kind, listAhwBna));
        c59991ztT.KWHzl(c59981ztJ);
        return C59994ztW.EZpvd(new C59976ztE(c59991ztT, c59981ztJ), function1);
    }

    public static /* synthetic */ C59976ztE factoryOf$default(C59991ztT c59991ztT, final yHL yhl, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            function1 = null;
        }
        Intrinsics.checkNotNullParameter(c59991ztT, "");
        Intrinsics.checkNotNullParameter(yhl, "");
        Intrinsics.OLrzqt();
        Function2<C60060zuj, C60053zuc, R> function2 = new Function2<C60060zuj, C60053zuc, R>() { // from class: org.koin.core.module.dsl.FactoryOfKt$factoryOf$20
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: o.yHL<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? super T10, ? super T11, ? super T12, ? super T13, ? super T14, ? super T15, ? super T16, ? super T17, ? super T18, ? super T19, ? extends R> */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
            /* JADX WARN: Type inference incomplete: some casts might be missing */
            @Override // kotlin.jvm.functions.Function2
            public final R invoke(@NotNull C60060zuj c60060zuj, @NotNull C60053zuc c60053zuc) {
                Intrinsics.checkNotNullParameter(c60060zuj, "");
                Intrinsics.checkNotNullParameter(c60053zuc, "");
                yHL<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, R> yhl2 = yhl;
                Intrinsics.KWHzl(4, "T1");
                Object objAEQbTJ = c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(Object.class), null, null);
                Intrinsics.KWHzl(4, "T2");
                Object objAEQbTJ2 = c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(Object.class), null, null);
                Intrinsics.KWHzl(4, "T3");
                Object objAEQbTJ3 = c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(Object.class), null, null);
                Intrinsics.KWHzl(4, "T4");
                Object objAEQbTJ4 = c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(Object.class), null, null);
                Intrinsics.KWHzl(4, "T5");
                Object objAEQbTJ5 = c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(Object.class), null, null);
                Intrinsics.KWHzl(4, "T6");
                Object objAEQbTJ6 = c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(Object.class), null, null);
                Intrinsics.KWHzl(4, "T7");
                Object objAEQbTJ7 = c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(Object.class), null, null);
                Intrinsics.KWHzl(4, "T8");
                Object objAEQbTJ8 = c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(Object.class), null, null);
                Intrinsics.KWHzl(4, "T9");
                Object objAEQbTJ9 = c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(Object.class), null, null);
                Intrinsics.KWHzl(4, "T10");
                Object objAEQbTJ10 = c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(Object.class), null, null);
                Intrinsics.KWHzl(4, "T11");
                Object objAEQbTJ11 = c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(Object.class), null, null);
                Intrinsics.KWHzl(4, "T12");
                Object objAEQbTJ12 = c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(Object.class), null, null);
                Intrinsics.KWHzl(4, "T13");
                Object objAEQbTJ13 = c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(Object.class), null, null);
                Intrinsics.KWHzl(4, "T14");
                Object objAEQbTJ14 = c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(Object.class), null, null);
                Intrinsics.KWHzl(4, "T15");
                Object objAEQbTJ15 = c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(Object.class), null, null);
                Intrinsics.KWHzl(4, "T16");
                Object objAEQbTJ16 = c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(Object.class), null, null);
                Intrinsics.KWHzl(4, "T17");
                Object objAEQbTJ17 = c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(Object.class), null, null);
                Intrinsics.KWHzl(4, "T18");
                Object objAEQbTJ18 = c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(Object.class), null, null);
                Intrinsics.KWHzl(4, "T19");
                return yhl2.invoke((T1) objAEQbTJ, (T2) objAEQbTJ2, (T3) objAEQbTJ3, (T4) objAEQbTJ4, (T5) objAEQbTJ5, (T6) objAEQbTJ6, (T7) objAEQbTJ7, (T8) objAEQbTJ8, (T9) objAEQbTJ9, (T10) objAEQbTJ10, (T11) objAEQbTJ11, (T12) objAEQbTJ12, (T13) objAEQbTJ13, (T14) objAEQbTJ14, (T15) objAEQbTJ15, (T16) objAEQbTJ16, (T17) objAEQbTJ17, (T18) objAEQbTJ18, (T19) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(Object.class), null, null));
            }
        };
        C60055zue c60055zueKWHzl = C60059zui.KWHzl.KWHzl();
        Kind kind = Kind.Factory;
        java.util.List listAhwBna = yDY.AhwBna();
        Intrinsics.KWHzl(4, com.ibm.icu.text.DateFormat.JP_ERA_2019_NARROW);
        C59981ztJ c59981ztJ = new C59981ztJ(new C59978ztG(c60055zueKWHzl, C56524yIo.AEQbTJ(java.lang.Object.class), null, function2, kind, listAhwBna));
        c59991ztT.KWHzl(c59981ztJ);
        return C59994ztW.EZpvd(new C59976ztE(c59991ztT, c59981ztJ), function1);
    }

    public static /* synthetic */ C59976ztE factoryOf$default(C59991ztT c59991ztT, final yHM yhm, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            function1 = null;
        }
        Intrinsics.checkNotNullParameter(c59991ztT, "");
        Intrinsics.checkNotNullParameter(yhm, "");
        Intrinsics.OLrzqt();
        Function2<C60060zuj, C60053zuc, R> function2 = new Function2<C60060zuj, C60053zuc, R>() { // from class: org.koin.core.module.dsl.FactoryOfKt$factoryOf$21
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: o.yHM<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? super T10, ? super T11, ? super T12, ? super T13, ? super T14, ? super T15, ? super T16, ? super T17, ? super T18, ? super T19, ? super T20, ? extends R> */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
            /* JADX WARN: Type inference incomplete: some casts might be missing */
            @Override // kotlin.jvm.functions.Function2
            public final R invoke(@NotNull C60060zuj c60060zuj, @NotNull C60053zuc c60053zuc) {
                Intrinsics.checkNotNullParameter(c60060zuj, "");
                Intrinsics.checkNotNullParameter(c60053zuc, "");
                yHM<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, R> yhm2 = yhm;
                Intrinsics.KWHzl(4, "T1");
                Object objAEQbTJ = c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(Object.class), null, null);
                Intrinsics.KWHzl(4, "T2");
                Object objAEQbTJ2 = c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(Object.class), null, null);
                Intrinsics.KWHzl(4, "T3");
                Object objAEQbTJ3 = c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(Object.class), null, null);
                Intrinsics.KWHzl(4, "T4");
                Object objAEQbTJ4 = c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(Object.class), null, null);
                Intrinsics.KWHzl(4, "T5");
                Object objAEQbTJ5 = c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(Object.class), null, null);
                Intrinsics.KWHzl(4, "T6");
                Object objAEQbTJ6 = c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(Object.class), null, null);
                Intrinsics.KWHzl(4, "T7");
                Object objAEQbTJ7 = c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(Object.class), null, null);
                Intrinsics.KWHzl(4, "T8");
                Object objAEQbTJ8 = c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(Object.class), null, null);
                Intrinsics.KWHzl(4, "T9");
                Object objAEQbTJ9 = c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(Object.class), null, null);
                Intrinsics.KWHzl(4, "T10");
                Object objAEQbTJ10 = c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(Object.class), null, null);
                Intrinsics.KWHzl(4, "T11");
                Object objAEQbTJ11 = c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(Object.class), null, null);
                Intrinsics.KWHzl(4, "T12");
                Object objAEQbTJ12 = c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(Object.class), null, null);
                Intrinsics.KWHzl(4, "T13");
                Object objAEQbTJ13 = c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(Object.class), null, null);
                Intrinsics.KWHzl(4, "T14");
                Object objAEQbTJ14 = c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(Object.class), null, null);
                Intrinsics.KWHzl(4, "T15");
                Object objAEQbTJ15 = c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(Object.class), null, null);
                Intrinsics.KWHzl(4, "T16");
                Object objAEQbTJ16 = c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(Object.class), null, null);
                Intrinsics.KWHzl(4, "T17");
                Object objAEQbTJ17 = c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(Object.class), null, null);
                Intrinsics.KWHzl(4, "T18");
                Object objAEQbTJ18 = c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(Object.class), null, null);
                Intrinsics.KWHzl(4, "T19");
                Object objAEQbTJ19 = c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(Object.class), null, null);
                Intrinsics.KWHzl(4, "T20");
                return yhm2.invoke((T1) objAEQbTJ, (T2) objAEQbTJ2, (T3) objAEQbTJ3, (T4) objAEQbTJ4, (T5) objAEQbTJ5, (T6) objAEQbTJ6, (T7) objAEQbTJ7, (T8) objAEQbTJ8, (T9) objAEQbTJ9, (T10) objAEQbTJ10, (T11) objAEQbTJ11, (T12) objAEQbTJ12, (T13) objAEQbTJ13, (T14) objAEQbTJ14, (T15) objAEQbTJ15, (T16) objAEQbTJ16, (T17) objAEQbTJ17, (T18) objAEQbTJ18, (T19) objAEQbTJ19, (T20) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(Object.class), null, null));
            }
        };
        C60055zue c60055zueKWHzl = C60059zui.KWHzl.KWHzl();
        Kind kind = Kind.Factory;
        java.util.List listAhwBna = yDY.AhwBna();
        Intrinsics.KWHzl(4, com.ibm.icu.text.DateFormat.JP_ERA_2019_NARROW);
        C59981ztJ c59981ztJ = new C59981ztJ(new C59978ztG(c60055zueKWHzl, C56524yIo.AEQbTJ(java.lang.Object.class), null, function2, kind, listAhwBna));
        c59991ztT.KWHzl(c59981ztJ);
        return C59994ztW.EZpvd(new C59976ztE(c59991ztT, c59981ztJ), function1);
    }

    public static /* synthetic */ C59976ztE factoryOf$default(C59991ztT c59991ztT, final yHN yhn, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            function1 = null;
        }
        Intrinsics.checkNotNullParameter(c59991ztT, "");
        Intrinsics.checkNotNullParameter(yhn, "");
        Intrinsics.OLrzqt();
        Function2<C60060zuj, C60053zuc, R> function2 = new Function2<C60060zuj, C60053zuc, R>() { // from class: org.koin.core.module.dsl.FactoryOfKt$factoryOf$22
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: o.yHN<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? super T10, ? super T11, ? super T12, ? super T13, ? super T14, ? super T15, ? super T16, ? super T17, ? super T18, ? super T19, ? super T20, ? super T21, ? extends R> */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
            /* JADX WARN: Type inference incomplete: some casts might be missing */
            @Override // kotlin.jvm.functions.Function2
            public final R invoke(@NotNull C60060zuj c60060zuj, @NotNull C60053zuc c60053zuc) {
                Intrinsics.checkNotNullParameter(c60060zuj, "");
                Intrinsics.checkNotNullParameter(c60053zuc, "");
                yHN<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, R> yhn2 = yhn;
                Intrinsics.KWHzl(4, "T1");
                Object objAEQbTJ = c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(Object.class), null, null);
                Intrinsics.KWHzl(4, "T2");
                Object objAEQbTJ2 = c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(Object.class), null, null);
                Intrinsics.KWHzl(4, "T3");
                Object objAEQbTJ3 = c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(Object.class), null, null);
                Intrinsics.KWHzl(4, "T4");
                Object objAEQbTJ4 = c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(Object.class), null, null);
                Intrinsics.KWHzl(4, "T5");
                Object objAEQbTJ5 = c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(Object.class), null, null);
                Intrinsics.KWHzl(4, "T6");
                Object objAEQbTJ6 = c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(Object.class), null, null);
                Intrinsics.KWHzl(4, "T7");
                Object objAEQbTJ7 = c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(Object.class), null, null);
                Intrinsics.KWHzl(4, "T8");
                Object objAEQbTJ8 = c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(Object.class), null, null);
                Intrinsics.KWHzl(4, "T9");
                Object objAEQbTJ9 = c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(Object.class), null, null);
                Intrinsics.KWHzl(4, "T10");
                Object objAEQbTJ10 = c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(Object.class), null, null);
                Intrinsics.KWHzl(4, "T11");
                Object objAEQbTJ11 = c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(Object.class), null, null);
                Intrinsics.KWHzl(4, "T12");
                Object objAEQbTJ12 = c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(Object.class), null, null);
                Intrinsics.KWHzl(4, "T13");
                Object objAEQbTJ13 = c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(Object.class), null, null);
                Intrinsics.KWHzl(4, "T14");
                Object objAEQbTJ14 = c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(Object.class), null, null);
                Intrinsics.KWHzl(4, "T15");
                Object objAEQbTJ15 = c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(Object.class), null, null);
                Intrinsics.KWHzl(4, "T16");
                Object objAEQbTJ16 = c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(Object.class), null, null);
                Intrinsics.KWHzl(4, "T17");
                Object objAEQbTJ17 = c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(Object.class), null, null);
                Intrinsics.KWHzl(4, "T18");
                Object objAEQbTJ18 = c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(Object.class), null, null);
                Intrinsics.KWHzl(4, "T19");
                Object objAEQbTJ19 = c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(Object.class), null, null);
                Intrinsics.KWHzl(4, "T20");
                Object objAEQbTJ20 = c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(Object.class), null, null);
                Intrinsics.KWHzl(4, "T21");
                return yhn2.invoke((T1) objAEQbTJ, (T2) objAEQbTJ2, (T3) objAEQbTJ3, (T4) objAEQbTJ4, (T5) objAEQbTJ5, (T6) objAEQbTJ6, (T7) objAEQbTJ7, (T8) objAEQbTJ8, (T9) objAEQbTJ9, (T10) objAEQbTJ10, (T11) objAEQbTJ11, (T12) objAEQbTJ12, (T13) objAEQbTJ13, (T14) objAEQbTJ14, (T15) objAEQbTJ15, (T16) objAEQbTJ16, (T17) objAEQbTJ17, (T18) objAEQbTJ18, (T19) objAEQbTJ19, (T20) objAEQbTJ20, (T21) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(Object.class), null, null));
            }
        };
        C60055zue c60055zueKWHzl = C60059zui.KWHzl.KWHzl();
        Kind kind = Kind.Factory;
        java.util.List listAhwBna = yDY.AhwBna();
        Intrinsics.KWHzl(4, com.ibm.icu.text.DateFormat.JP_ERA_2019_NARROW);
        C59981ztJ c59981ztJ = new C59981ztJ(new C59978ztG(c60055zueKWHzl, C56524yIo.AEQbTJ(java.lang.Object.class), null, function2, kind, listAhwBna));
        c59991ztT.KWHzl(c59981ztJ);
        return C59994ztW.EZpvd(new C59976ztE(c59991ztT, c59981ztJ), function1);
    }

    public static /* synthetic */ C59976ztE factoryOf$default(C59991ztT c59991ztT, final yHK yhk, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            function1 = null;
        }
        Intrinsics.checkNotNullParameter(c59991ztT, "");
        Intrinsics.checkNotNullParameter(yhk, "");
        Intrinsics.OLrzqt();
        Function2<C60060zuj, C60053zuc, R> function2 = new Function2<C60060zuj, C60053zuc, R>() { // from class: org.koin.core.module.dsl.FactoryOfKt$factoryOf$23
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: o.yHK<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? super T10, ? super T11, ? super T12, ? super T13, ? super T14, ? super T15, ? super T16, ? super T17, ? super T18, ? super T19, ? super T20, ? super T21, ? super T22, ? extends R> */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
            /* JADX WARN: Type inference incomplete: some casts might be missing */
            @Override // kotlin.jvm.functions.Function2
            public final R invoke(@NotNull C60060zuj c60060zuj, @NotNull C60053zuc c60053zuc) {
                Intrinsics.checkNotNullParameter(c60060zuj, "");
                Intrinsics.checkNotNullParameter(c60053zuc, "");
                yHK<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, R> yhk2 = yhk;
                Intrinsics.KWHzl(4, "T1");
                Object objAEQbTJ = c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(Object.class), null, null);
                Intrinsics.KWHzl(4, "T2");
                Object objAEQbTJ2 = c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(Object.class), null, null);
                Intrinsics.KWHzl(4, "T3");
                Object objAEQbTJ3 = c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(Object.class), null, null);
                Intrinsics.KWHzl(4, "T4");
                Object objAEQbTJ4 = c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(Object.class), null, null);
                Intrinsics.KWHzl(4, "T5");
                Object objAEQbTJ5 = c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(Object.class), null, null);
                Intrinsics.KWHzl(4, "T6");
                Object objAEQbTJ6 = c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(Object.class), null, null);
                Intrinsics.KWHzl(4, "T7");
                Object objAEQbTJ7 = c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(Object.class), null, null);
                Intrinsics.KWHzl(4, "T8");
                Object objAEQbTJ8 = c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(Object.class), null, null);
                Intrinsics.KWHzl(4, "T9");
                Object objAEQbTJ9 = c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(Object.class), null, null);
                Intrinsics.KWHzl(4, "T10");
                Object objAEQbTJ10 = c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(Object.class), null, null);
                Intrinsics.KWHzl(4, "T11");
                Object objAEQbTJ11 = c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(Object.class), null, null);
                Intrinsics.KWHzl(4, "T12");
                Object objAEQbTJ12 = c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(Object.class), null, null);
                Intrinsics.KWHzl(4, "T13");
                Object objAEQbTJ13 = c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(Object.class), null, null);
                Intrinsics.KWHzl(4, "T14");
                Object objAEQbTJ14 = c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(Object.class), null, null);
                Intrinsics.KWHzl(4, "T15");
                Object objAEQbTJ15 = c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(Object.class), null, null);
                Intrinsics.KWHzl(4, "T16");
                Object objAEQbTJ16 = c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(Object.class), null, null);
                Intrinsics.KWHzl(4, "T17");
                Object objAEQbTJ17 = c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(Object.class), null, null);
                Intrinsics.KWHzl(4, "T18");
                Object objAEQbTJ18 = c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(Object.class), null, null);
                Intrinsics.KWHzl(4, "T19");
                Object objAEQbTJ19 = c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(Object.class), null, null);
                Intrinsics.KWHzl(4, "T20");
                Object objAEQbTJ20 = c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(Object.class), null, null);
                Intrinsics.KWHzl(4, "T21");
                Object objAEQbTJ21 = c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(Object.class), null, null);
                Intrinsics.KWHzl(4, "T22");
                return yhk2.invoke((T1) objAEQbTJ, (T2) objAEQbTJ2, (T3) objAEQbTJ3, (T4) objAEQbTJ4, (T5) objAEQbTJ5, (T6) objAEQbTJ6, (T7) objAEQbTJ7, (T8) objAEQbTJ8, (T9) objAEQbTJ9, (T10) objAEQbTJ10, (T11) objAEQbTJ11, (T12) objAEQbTJ12, (T13) objAEQbTJ13, (T14) objAEQbTJ14, (T15) objAEQbTJ15, (T16) objAEQbTJ16, (T17) objAEQbTJ17, (T18) objAEQbTJ18, (T19) objAEQbTJ19, (T20) objAEQbTJ20, (T21) objAEQbTJ21, (T22) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(Object.class), null, null));
            }
        };
        C60055zue c60055zueKWHzl = C60059zui.KWHzl.KWHzl();
        Kind kind = Kind.Factory;
        java.util.List listAhwBna = yDY.AhwBna();
        Intrinsics.KWHzl(4, com.ibm.icu.text.DateFormat.JP_ERA_2019_NARROW);
        C59981ztJ c59981ztJ = new C59981ztJ(new C59978ztG(c60055zueKWHzl, C56524yIo.AEQbTJ(java.lang.Object.class), null, function2, kind, listAhwBna));
        c59991ztT.KWHzl(c59981ztJ);
        return C59994ztW.EZpvd(new C59976ztE(c59991ztT, c59981ztJ), function1);
    }
}
