package o;

import com.okinc.trade.arch.ui.IUiRetrievable$getUiState$1;
import com.okinc.trade.arch.ui.IUiRetrievable$getUiState$11;
import com.okinc.trade.arch.ui.IUiRetrievable$getUiState$14;
import com.okinc.trade.arch.ui.IUiRetrievable$getUiState$17;
import com.okinc.trade.arch.ui.IUiRetrievable$getUiState$2;
import com.okinc.trade.arch.ui.IUiRetrievable$getUiState$5;
import com.okinc.trade.arch.ui.IUiRetrievable$getUiState$8;
import com.okinc.trade.arch.ui.IUiRetrievable$tryGetSuccessUiState$1;
import com.okinc.trade.arch.ui.IUiRetrievable$withUiState$1;
import com.okinc.trade.arch.ui.IUiRetrievable$withUiState$10;
import com.okinc.trade.arch.ui.IUiRetrievable$withUiState$13;
import com.okinc.trade.arch.ui.IUiRetrievable$withUiState$16;
import com.okinc.trade.arch.ui.IUiRetrievable$withUiState$19;
import com.okinc.trade.arch.ui.IUiRetrievable$withUiState$4;
import com.okinc.trade.arch.ui.IUiRetrievable$withUiState$7;
import com.okinc.trade.arch.util.Quartet;
import com.okinc.trade.arch.util.Quintet;
import com.okinc.trade.arch.util.Sextet;
import java.util.Objects;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import o.InterfaceC49371unL;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.unH, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public interface InterfaceC49367unH {

    /* JADX INFO: renamed from: o.unH$TaskDescription */
    public static final class TaskDescription {
        /* JADX WARN: Removed duplicated region for block: B:30:0x0082 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static <T extends InterfaceC49369unJ<T>> java.lang.Object copydefault(@NotNull InterfaceC49367unH interfaceC49367unH, @NotNull AbstractC49411unz<T> abstractC49411unz, @NotNull Function2<? super T, ? super Continuation<? super Unit>, ? extends java.lang.Object> function2, @NotNull Continuation<? super Unit> continuation) {
            IUiRetrievable$withUiState$1 iUiRetrievable$withUiState$1;
            InterfaceC49369unJ interfaceC49369unJ;
            Function2<? super T, ? super Continuation<? super Unit>, ? extends java.lang.Object> function22;
            if (continuation instanceof IUiRetrievable$withUiState$1) {
                iUiRetrievable$withUiState$1 = (IUiRetrievable$withUiState$1) continuation;
                int i = iUiRetrievable$withUiState$1.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    iUiRetrievable$withUiState$1.label = i - Integer.MIN_VALUE;
                } else {
                    iUiRetrievable$withUiState$1 = new IUiRetrievable$withUiState$1(continuation);
                }
            }
            java.lang.Object objFirstOrNull = iUiRetrievable$withUiState$1.result;
            java.lang.Object objCopydefault = C56442yFn.copydefault();
            int i2 = iUiRetrievable$withUiState$1.label;
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objFirstOrNull);
                Flow flowKWHzl = C49360unA.KWHzl(abstractC49411unz);
                iUiRetrievable$withUiState$1.L$0 = abstractC49411unz;
                iUiRetrievable$withUiState$1.L$1 = function2;
                iUiRetrievable$withUiState$1.label = 1;
                objFirstOrNull = FlowKt.firstOrNull(flowKWHzl, iUiRetrievable$withUiState$1);
                if (objFirstOrNull == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    if (i2 != 2) {
                        if (i2 != 3) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C56391yDq.AEQbTJ(objFirstOrNull);
                        return Unit.INSTANCE;
                    }
                    function22 = (Function2) iUiRetrievable$withUiState$1.L$0;
                    C56391yDq.AEQbTJ(objFirstOrNull);
                    interfaceC49369unJ = (InterfaceC49369unJ) objFirstOrNull;
                    function2 = function22;
                    iUiRetrievable$withUiState$1.L$0 = null;
                    iUiRetrievable$withUiState$1.L$1 = null;
                    iUiRetrievable$withUiState$1.label = 3;
                    if (function2.invoke(interfaceC49369unJ, iUiRetrievable$withUiState$1) == objCopydefault) {
                        return objCopydefault;
                    }
                    return Unit.INSTANCE;
                }
                function2 = (Function2) iUiRetrievable$withUiState$1.L$1;
                abstractC49411unz = (AbstractC49411unz) iUiRetrievable$withUiState$1.L$0;
                C56391yDq.AEQbTJ(objFirstOrNull);
            }
            interfaceC49369unJ = (InterfaceC49369unJ) objFirstOrNull;
            if (interfaceC49369unJ == null) {
                iUiRetrievable$withUiState$1.L$0 = function2;
                iUiRetrievable$withUiState$1.L$1 = null;
                iUiRetrievable$withUiState$1.label = 2;
                objFirstOrNull = abstractC49411unz.djBIcL(iUiRetrievable$withUiState$1);
                if (objFirstOrNull == objCopydefault) {
                    return objCopydefault;
                }
                function22 = function2;
                interfaceC49369unJ = (InterfaceC49369unJ) objFirstOrNull;
                function2 = function22;
            }
            iUiRetrievable$withUiState$1.L$0 = null;
            iUiRetrievable$withUiState$1.L$1 = null;
            iUiRetrievable$withUiState$1.label = 3;
            if (function2.invoke(interfaceC49369unJ, iUiRetrievable$withUiState$1) == objCopydefault) {
            }
            return Unit.INSTANCE;
        }

        public static <T extends InterfaceC49369unJ<T>, A> java.lang.Object EZpvd(@NotNull InterfaceC49367unH interfaceC49367unH, @NotNull AbstractC49411unz<T> abstractC49411unz, @NotNull InterfaceC56560yJx<T, ? extends A> interfaceC56560yJx, @NotNull Function2<? super A, ? super Continuation<? super Unit>, ? extends java.lang.Object> function2, @NotNull Continuation<? super Unit> continuation) {
            if (C49372unM.AEQbTJ.copydefault()) {
                Objects.toString(interfaceC56560yJx);
            }
            java.lang.Object objCopydefault = abstractC49411unz.copydefault(abstractC49411unz, new IUiRetrievable$withUiState$4(function2, interfaceC56560yJx, null), continuation);
            return objCopydefault == C56442yFn.copydefault() ? objCopydefault : Unit.INSTANCE;
        }

        public static <T extends InterfaceC49369unJ<T>, A, B> java.lang.Object OLrzqt(@NotNull InterfaceC49367unH interfaceC49367unH, @NotNull AbstractC49411unz<T> abstractC49411unz, @NotNull InterfaceC56560yJx<T, ? extends A> interfaceC56560yJx, @NotNull InterfaceC56560yJx<T, ? extends B> interfaceC56560yJx2, @NotNull yHO<? super A, ? super B, ? super Continuation<? super Unit>, ? extends java.lang.Object> yho, @NotNull Continuation<? super Unit> continuation) {
            if (C49372unM.AEQbTJ.copydefault()) {
                Objects.toString(interfaceC56560yJx);
                Objects.toString(interfaceC56560yJx2);
            }
            java.lang.Object objCopydefault = abstractC49411unz.copydefault(abstractC49411unz, new IUiRetrievable$withUiState$7(yho, interfaceC56560yJx, interfaceC56560yJx2, null), continuation);
            return objCopydefault == C56442yFn.copydefault() ? objCopydefault : Unit.INSTANCE;
        }

        public static <T extends InterfaceC49369unJ<T>, A, B, C> java.lang.Object EZpvd(@NotNull InterfaceC49367unH interfaceC49367unH, @NotNull AbstractC49411unz<T> abstractC49411unz, @NotNull InterfaceC56560yJx<T, ? extends A> interfaceC56560yJx, @NotNull InterfaceC56560yJx<T, ? extends B> interfaceC56560yJx2, @NotNull InterfaceC56560yJx<T, ? extends C> interfaceC56560yJx3, @NotNull yHT<? super A, ? super B, ? super C, ? super Continuation<? super Unit>, ? extends java.lang.Object> yht, @NotNull Continuation<? super Unit> continuation) {
            if (C49372unM.AEQbTJ.copydefault()) {
                Objects.toString(interfaceC56560yJx);
                Objects.toString(interfaceC56560yJx2);
                Objects.toString(interfaceC56560yJx3);
            }
            java.lang.Object objCopydefault = abstractC49411unz.copydefault(abstractC49411unz, new IUiRetrievable$withUiState$10(yht, interfaceC56560yJx, interfaceC56560yJx2, interfaceC56560yJx3, null), continuation);
            return objCopydefault == C56442yFn.copydefault() ? objCopydefault : Unit.INSTANCE;
        }

        public static <T extends InterfaceC49369unJ<T>, A, B, C, D> java.lang.Object AEQbTJ(@NotNull InterfaceC49367unH interfaceC49367unH, @NotNull AbstractC49411unz<T> abstractC49411unz, @NotNull InterfaceC56560yJx<T, ? extends A> interfaceC56560yJx, @NotNull InterfaceC56560yJx<T, ? extends B> interfaceC56560yJx2, @NotNull InterfaceC56560yJx<T, ? extends C> interfaceC56560yJx3, @NotNull InterfaceC56560yJx<T, ? extends D> interfaceC56560yJx4, @NotNull yHS<? super A, ? super B, ? super C, ? super D, ? super Continuation<? super Unit>, ? extends java.lang.Object> yhs, @NotNull Continuation<? super Unit> continuation) {
            if (C49372unM.AEQbTJ.copydefault()) {
                Objects.toString(interfaceC56560yJx);
                Objects.toString(interfaceC56560yJx2);
                Objects.toString(interfaceC56560yJx3);
                Objects.toString(interfaceC56560yJx4);
            }
            java.lang.Object objCopydefault = abstractC49411unz.copydefault(abstractC49411unz, new IUiRetrievable$withUiState$13(yhs, interfaceC56560yJx, interfaceC56560yJx2, interfaceC56560yJx3, interfaceC56560yJx4, null), continuation);
            return objCopydefault == C56442yFn.copydefault() ? objCopydefault : Unit.INSTANCE;
        }

        public static <T extends InterfaceC49369unJ<T>, A, B, C, D, E> java.lang.Object KWHzl(@NotNull InterfaceC49367unH interfaceC49367unH, @NotNull AbstractC49411unz<T> abstractC49411unz, @NotNull InterfaceC56560yJx<T, ? extends A> interfaceC56560yJx, @NotNull InterfaceC56560yJx<T, ? extends B> interfaceC56560yJx2, @NotNull InterfaceC56560yJx<T, ? extends C> interfaceC56560yJx3, @NotNull InterfaceC56560yJx<T, ? extends D> interfaceC56560yJx4, @NotNull InterfaceC56560yJx<T, ? extends E> interfaceC56560yJx5, @NotNull yHQ<? super A, ? super B, ? super C, ? super D, ? super E, ? super Continuation<? super Unit>, ? extends java.lang.Object> yhq, @NotNull Continuation<? super Unit> continuation) {
            if (C49372unM.AEQbTJ.copydefault()) {
                Objects.toString(interfaceC56560yJx);
                Objects.toString(interfaceC56560yJx2);
                Objects.toString(interfaceC56560yJx3);
                Objects.toString(interfaceC56560yJx4);
                Objects.toString(interfaceC56560yJx5);
            }
            java.lang.Object objCopydefault = abstractC49411unz.copydefault(abstractC49411unz, new IUiRetrievable$withUiState$16(yhq, interfaceC56560yJx, interfaceC56560yJx2, interfaceC56560yJx3, interfaceC56560yJx4, interfaceC56560yJx5, null), continuation);
            return objCopydefault == C56442yFn.copydefault() ? objCopydefault : Unit.INSTANCE;
        }

        public static <T extends InterfaceC49369unJ<T>, A, B, C, D, E, F> java.lang.Object AEQbTJ(@NotNull InterfaceC49367unH interfaceC49367unH, @NotNull AbstractC49411unz<T> abstractC49411unz, @NotNull InterfaceC56560yJx<T, ? extends A> interfaceC56560yJx, @NotNull InterfaceC56560yJx<T, ? extends B> interfaceC56560yJx2, @NotNull InterfaceC56560yJx<T, ? extends C> interfaceC56560yJx3, @NotNull InterfaceC56560yJx<T, ? extends D> interfaceC56560yJx4, @NotNull InterfaceC56560yJx<T, ? extends E> interfaceC56560yJx5, @NotNull InterfaceC56560yJx<T, ? extends F> interfaceC56560yJx6, @NotNull yHR<? super A, ? super B, ? super C, ? super D, ? super E, ? super F, ? super Continuation<? super Unit>, ? extends java.lang.Object> yhr, @NotNull Continuation<? super Unit> continuation) {
            if (C49372unM.AEQbTJ.copydefault()) {
                Objects.toString(interfaceC56560yJx);
                Objects.toString(interfaceC56560yJx2);
                Objects.toString(interfaceC56560yJx3);
                Objects.toString(interfaceC56560yJx4);
                Objects.toString(interfaceC56560yJx5);
                Objects.toString(interfaceC56560yJx6);
            }
            java.lang.Object objCopydefault = abstractC49411unz.copydefault(abstractC49411unz, new IUiRetrievable$withUiState$19(yhr, interfaceC56560yJx, interfaceC56560yJx2, interfaceC56560yJx3, interfaceC56560yJx4, interfaceC56560yJx5, interfaceC56560yJx6, null), continuation);
            return objCopydefault == C56442yFn.copydefault() ? objCopydefault : Unit.INSTANCE;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static <T extends InterfaceC49369unJ<T>> java.lang.Object AEQbTJ(@NotNull InterfaceC49367unH interfaceC49367unH, @NotNull AbstractC49411unz<T> abstractC49411unz, @NotNull Continuation<? super T> continuation) throws java.lang.Throwable {
            IUiRetrievable$getUiState$1 iUiRetrievable$getUiState$1;
            if (continuation instanceof IUiRetrievable$getUiState$1) {
                iUiRetrievable$getUiState$1 = (IUiRetrievable$getUiState$1) continuation;
                int i = iUiRetrievable$getUiState$1.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    iUiRetrievable$getUiState$1.label = i - Integer.MIN_VALUE;
                } else {
                    iUiRetrievable$getUiState$1 = new IUiRetrievable$getUiState$1(continuation);
                }
            }
            java.lang.Object objFirstOrNull = iUiRetrievable$getUiState$1.result;
            java.lang.Object objCopydefault = C56442yFn.copydefault();
            int i2 = iUiRetrievable$getUiState$1.label;
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objFirstOrNull);
                Flow flowKWHzl = C49360unA.KWHzl(abstractC49411unz);
                iUiRetrievable$getUiState$1.L$0 = abstractC49411unz;
                iUiRetrievable$getUiState$1.label = 1;
                objFirstOrNull = FlowKt.firstOrNull(flowKWHzl, iUiRetrievable$getUiState$1);
                if (objFirstOrNull == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(objFirstOrNull);
                    return objFirstOrNull;
                }
                abstractC49411unz = (AbstractC49411unz) iUiRetrievable$getUiState$1.L$0;
                C56391yDq.AEQbTJ(objFirstOrNull);
            }
            objFirstOrNull = (InterfaceC49369unJ) objFirstOrNull;
            if (objFirstOrNull == null) {
                iUiRetrievable$getUiState$1.L$0 = null;
                iUiRetrievable$getUiState$1.label = 2;
                objFirstOrNull = abstractC49411unz.djBIcL(iUiRetrievable$getUiState$1);
                if (objFirstOrNull == objCopydefault) {
                    return objCopydefault;
                }
            }
            return objFirstOrNull;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static <T extends InterfaceC49369unJ<T>, A> java.lang.Object copydefault(@NotNull InterfaceC49367unH interfaceC49367unH, @NotNull AbstractC49411unz<T> abstractC49411unz, @NotNull InterfaceC56560yJx<T, ? extends A> interfaceC56560yJx, @NotNull Continuation<? super A> continuation) throws java.lang.Throwable {
            IUiRetrievable$getUiState$2 iUiRetrievable$getUiState$2;
            InterfaceC56560yJx interfaceC56560yJx2;
            if (continuation instanceof IUiRetrievable$getUiState$2) {
                iUiRetrievable$getUiState$2 = (IUiRetrievable$getUiState$2) continuation;
                int i = iUiRetrievable$getUiState$2.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    iUiRetrievable$getUiState$2.label = i - Integer.MIN_VALUE;
                } else {
                    iUiRetrievable$getUiState$2 = new IUiRetrievable$getUiState$2(continuation);
                }
            }
            java.lang.Object objOLrzqt = iUiRetrievable$getUiState$2.result;
            java.lang.Object objCopydefault = C56442yFn.copydefault();
            int i2 = iUiRetrievable$getUiState$2.label;
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objOLrzqt);
                if (C49372unM.AEQbTJ.copydefault()) {
                    Objects.toString(interfaceC56560yJx);
                }
                iUiRetrievable$getUiState$2.L$0 = interfaceC56560yJx;
                iUiRetrievable$getUiState$2.label = 1;
                objOLrzqt = abstractC49411unz.OLrzqt(abstractC49411unz, iUiRetrievable$getUiState$2);
                interfaceC56560yJx2 = interfaceC56560yJx;
                if (objOLrzqt == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                InterfaceC56560yJx interfaceC56560yJx3 = (InterfaceC56560yJx<T, ? extends A>) ((InterfaceC56560yJx) iUiRetrievable$getUiState$2.L$0);
                C56391yDq.AEQbTJ(objOLrzqt);
                interfaceC56560yJx2 = interfaceC56560yJx3;
            }
            return interfaceC56560yJx2.get((InterfaceC49369unJ) objOLrzqt);
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static <T extends InterfaceC49369unJ<T>, A, B> java.lang.Object AEQbTJ(@NotNull InterfaceC49367unH interfaceC49367unH, @NotNull AbstractC49411unz<T> abstractC49411unz, @NotNull InterfaceC56560yJx<T, ? extends A> interfaceC56560yJx, @NotNull InterfaceC56560yJx<T, ? extends B> interfaceC56560yJx2, @NotNull Continuation<? super kotlin.Pair<? extends A, ? extends B>> continuation) throws java.lang.Throwable {
            IUiRetrievable$getUiState$5 iUiRetrievable$getUiState$5;
            InterfaceC56560yJx interfaceC56560yJx3;
            InterfaceC56560yJx interfaceC56560yJx4;
            if (continuation instanceof IUiRetrievable$getUiState$5) {
                iUiRetrievable$getUiState$5 = (IUiRetrievable$getUiState$5) continuation;
                int i = iUiRetrievable$getUiState$5.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    iUiRetrievable$getUiState$5.label = i - Integer.MIN_VALUE;
                } else {
                    iUiRetrievable$getUiState$5 = new IUiRetrievable$getUiState$5(continuation);
                }
            }
            java.lang.Object objOLrzqt = iUiRetrievable$getUiState$5.result;
            java.lang.Object objCopydefault = C56442yFn.copydefault();
            int i2 = iUiRetrievable$getUiState$5.label;
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objOLrzqt);
                if (C49372unM.AEQbTJ.copydefault()) {
                    Objects.toString(interfaceC56560yJx);
                    Objects.toString(interfaceC56560yJx2);
                }
                iUiRetrievable$getUiState$5.L$0 = interfaceC56560yJx;
                iUiRetrievable$getUiState$5.L$1 = interfaceC56560yJx2;
                iUiRetrievable$getUiState$5.label = 1;
                objOLrzqt = abstractC49411unz.OLrzqt(abstractC49411unz, iUiRetrievable$getUiState$5);
                interfaceC56560yJx4 = interfaceC56560yJx;
                interfaceC56560yJx3 = interfaceC56560yJx2;
                if (objOLrzqt == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                InterfaceC56560yJx interfaceC56560yJx5 = (InterfaceC56560yJx<T, ? extends B>) ((InterfaceC56560yJx) iUiRetrievable$getUiState$5.L$1);
                InterfaceC56560yJx interfaceC56560yJx6 = (InterfaceC56560yJx<T, ? extends A>) ((InterfaceC56560yJx) iUiRetrievable$getUiState$5.L$0);
                C56391yDq.AEQbTJ(objOLrzqt);
                interfaceC56560yJx4 = interfaceC56560yJx6;
                interfaceC56560yJx3 = interfaceC56560yJx5;
            }
            InterfaceC49369unJ interfaceC49369unJ = (InterfaceC49369unJ) objOLrzqt;
            return C49380unU.OLrzqt(interfaceC56560yJx4.get(interfaceC49369unJ), interfaceC56560yJx3.get(interfaceC49369unJ));
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static <T extends InterfaceC49369unJ<T>, A, B, C> java.lang.Object AEQbTJ(@NotNull InterfaceC49367unH interfaceC49367unH, @NotNull AbstractC49411unz<T> abstractC49411unz, @NotNull InterfaceC56560yJx<T, ? extends A> interfaceC56560yJx, @NotNull InterfaceC56560yJx<T, ? extends B> interfaceC56560yJx2, @NotNull InterfaceC56560yJx<T, ? extends C> interfaceC56560yJx3, @NotNull Continuation<? super Triple<? extends A, ? extends B, ? extends C>> continuation) throws java.lang.Throwable {
            IUiRetrievable$getUiState$8 iUiRetrievable$getUiState$8;
            InterfaceC56560yJx interfaceC56560yJx4;
            InterfaceC56560yJx interfaceC56560yJx5;
            InterfaceC56560yJx interfaceC56560yJx6;
            if (continuation instanceof IUiRetrievable$getUiState$8) {
                iUiRetrievable$getUiState$8 = (IUiRetrievable$getUiState$8) continuation;
                int i = iUiRetrievable$getUiState$8.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    iUiRetrievable$getUiState$8.label = i - Integer.MIN_VALUE;
                } else {
                    iUiRetrievable$getUiState$8 = new IUiRetrievable$getUiState$8(continuation);
                }
            }
            java.lang.Object objOLrzqt = iUiRetrievable$getUiState$8.result;
            java.lang.Object objCopydefault = C56442yFn.copydefault();
            int i2 = iUiRetrievable$getUiState$8.label;
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objOLrzqt);
                if (C49372unM.AEQbTJ.copydefault()) {
                    Objects.toString(interfaceC56560yJx);
                    Objects.toString(interfaceC56560yJx2);
                    Objects.toString(interfaceC56560yJx3);
                }
                iUiRetrievable$getUiState$8.L$0 = interfaceC56560yJx;
                iUiRetrievable$getUiState$8.L$1 = interfaceC56560yJx2;
                iUiRetrievable$getUiState$8.L$2 = interfaceC56560yJx3;
                iUiRetrievable$getUiState$8.label = 1;
                objOLrzqt = abstractC49411unz.OLrzqt(abstractC49411unz, iUiRetrievable$getUiState$8);
                interfaceC56560yJx6 = interfaceC56560yJx;
                interfaceC56560yJx5 = interfaceC56560yJx2;
                interfaceC56560yJx4 = interfaceC56560yJx3;
                if (objOLrzqt == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                InterfaceC56560yJx interfaceC56560yJx7 = (InterfaceC56560yJx<T, ? extends C>) ((InterfaceC56560yJx) iUiRetrievable$getUiState$8.L$2);
                InterfaceC56560yJx interfaceC56560yJx8 = (InterfaceC56560yJx<T, ? extends B>) ((InterfaceC56560yJx) iUiRetrievable$getUiState$8.L$1);
                InterfaceC56560yJx interfaceC56560yJx9 = (InterfaceC56560yJx<T, ? extends A>) ((InterfaceC56560yJx) iUiRetrievable$getUiState$8.L$0);
                C56391yDq.AEQbTJ(objOLrzqt);
                interfaceC56560yJx6 = interfaceC56560yJx9;
                interfaceC56560yJx5 = interfaceC56560yJx8;
                interfaceC56560yJx4 = interfaceC56560yJx7;
            }
            InterfaceC49369unJ interfaceC49369unJ = (InterfaceC49369unJ) objOLrzqt;
            return C49380unU.copydefault(C49380unU.OLrzqt(interfaceC56560yJx6.get(interfaceC49369unJ), interfaceC56560yJx5.get(interfaceC49369unJ)), interfaceC56560yJx4.get(interfaceC49369unJ));
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static <T extends InterfaceC49369unJ<T>, A, B, C, D> java.lang.Object copydefault(@NotNull InterfaceC49367unH interfaceC49367unH, @NotNull AbstractC49411unz<T> abstractC49411unz, @NotNull InterfaceC56560yJx<T, ? extends A> interfaceC56560yJx, @NotNull InterfaceC56560yJx<T, ? extends B> interfaceC56560yJx2, @NotNull InterfaceC56560yJx<T, ? extends C> interfaceC56560yJx3, @NotNull InterfaceC56560yJx<T, ? extends D> interfaceC56560yJx4, @NotNull Continuation<? super Quartet<? extends A, ? extends B, ? extends C, ? extends D>> continuation) throws java.lang.Throwable {
            IUiRetrievable$getUiState$11 iUiRetrievable$getUiState$11;
            InterfaceC56560yJx interfaceC56560yJx5;
            InterfaceC56560yJx interfaceC56560yJx6;
            InterfaceC56560yJx interfaceC56560yJx7;
            InterfaceC56560yJx interfaceC56560yJx8;
            if (continuation instanceof IUiRetrievable$getUiState$11) {
                iUiRetrievable$getUiState$11 = (IUiRetrievable$getUiState$11) continuation;
                int i = iUiRetrievable$getUiState$11.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    iUiRetrievable$getUiState$11.label = i - Integer.MIN_VALUE;
                } else {
                    iUiRetrievable$getUiState$11 = new IUiRetrievable$getUiState$11(continuation);
                }
            }
            java.lang.Object objOLrzqt = iUiRetrievable$getUiState$11.result;
            java.lang.Object objCopydefault = C56442yFn.copydefault();
            int i2 = iUiRetrievable$getUiState$11.label;
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objOLrzqt);
                if (C49372unM.AEQbTJ.copydefault()) {
                    Objects.toString(interfaceC56560yJx);
                    Objects.toString(interfaceC56560yJx2);
                    Objects.toString(interfaceC56560yJx3);
                    Objects.toString(interfaceC56560yJx4);
                }
                iUiRetrievable$getUiState$11.L$0 = interfaceC56560yJx;
                iUiRetrievable$getUiState$11.L$1 = interfaceC56560yJx2;
                iUiRetrievable$getUiState$11.L$2 = interfaceC56560yJx3;
                iUiRetrievable$getUiState$11.L$3 = interfaceC56560yJx4;
                iUiRetrievable$getUiState$11.label = 1;
                objOLrzqt = abstractC49411unz.OLrzqt(abstractC49411unz, iUiRetrievable$getUiState$11);
                interfaceC56560yJx8 = interfaceC56560yJx;
                interfaceC56560yJx7 = interfaceC56560yJx2;
                interfaceC56560yJx6 = interfaceC56560yJx3;
                interfaceC56560yJx5 = interfaceC56560yJx4;
                if (objOLrzqt == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                InterfaceC56560yJx interfaceC56560yJx9 = (InterfaceC56560yJx<T, ? extends D>) ((InterfaceC56560yJx) iUiRetrievable$getUiState$11.L$3);
                InterfaceC56560yJx interfaceC56560yJx10 = (InterfaceC56560yJx<T, ? extends C>) ((InterfaceC56560yJx) iUiRetrievable$getUiState$11.L$2);
                InterfaceC56560yJx interfaceC56560yJx11 = (InterfaceC56560yJx<T, ? extends B>) ((InterfaceC56560yJx) iUiRetrievable$getUiState$11.L$1);
                InterfaceC56560yJx interfaceC56560yJx12 = (InterfaceC56560yJx<T, ? extends A>) ((InterfaceC56560yJx) iUiRetrievable$getUiState$11.L$0);
                C56391yDq.AEQbTJ(objOLrzqt);
                interfaceC56560yJx8 = interfaceC56560yJx12;
                interfaceC56560yJx7 = interfaceC56560yJx11;
                interfaceC56560yJx6 = interfaceC56560yJx10;
                interfaceC56560yJx5 = interfaceC56560yJx9;
            }
            InterfaceC49369unJ interfaceC49369unJ = (InterfaceC49369unJ) objOLrzqt;
            return C49380unU.AEQbTJ(C49380unU.copydefault(C49380unU.OLrzqt(interfaceC56560yJx8.get(interfaceC49369unJ), interfaceC56560yJx7.get(interfaceC49369unJ)), interfaceC56560yJx6.get(interfaceC49369unJ)), interfaceC56560yJx5.get(interfaceC49369unJ));
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static <T extends InterfaceC49369unJ<T>, A, B, C, D, E> java.lang.Object KWHzl(@NotNull InterfaceC49367unH interfaceC49367unH, @NotNull AbstractC49411unz<T> abstractC49411unz, @NotNull InterfaceC56560yJx<T, ? extends A> interfaceC56560yJx, @NotNull InterfaceC56560yJx<T, ? extends B> interfaceC56560yJx2, @NotNull InterfaceC56560yJx<T, ? extends C> interfaceC56560yJx3, @NotNull InterfaceC56560yJx<T, ? extends D> interfaceC56560yJx4, @NotNull InterfaceC56560yJx<T, ? extends E> interfaceC56560yJx5, @NotNull Continuation<? super Quintet<? extends A, ? extends B, ? extends C, ? extends D, ? extends E>> continuation) throws java.lang.Throwable {
            IUiRetrievable$getUiState$14 iUiRetrievable$getUiState$14;
            InterfaceC56560yJx interfaceC56560yJx6;
            InterfaceC56560yJx interfaceC56560yJx7;
            InterfaceC56560yJx interfaceC56560yJx8;
            InterfaceC56560yJx interfaceC56560yJx9;
            InterfaceC56560yJx interfaceC56560yJx10;
            if (continuation instanceof IUiRetrievable$getUiState$14) {
                iUiRetrievable$getUiState$14 = (IUiRetrievable$getUiState$14) continuation;
                int i = iUiRetrievable$getUiState$14.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    iUiRetrievable$getUiState$14.label = i - Integer.MIN_VALUE;
                } else {
                    iUiRetrievable$getUiState$14 = new IUiRetrievable$getUiState$14(continuation);
                }
            }
            java.lang.Object objOLrzqt = iUiRetrievable$getUiState$14.result;
            java.lang.Object objCopydefault = C56442yFn.copydefault();
            int i2 = iUiRetrievable$getUiState$14.label;
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objOLrzqt);
                if (C49372unM.AEQbTJ.copydefault()) {
                    Objects.toString(interfaceC56560yJx);
                    Objects.toString(interfaceC56560yJx2);
                    Objects.toString(interfaceC56560yJx3);
                    Objects.toString(interfaceC56560yJx4);
                    Objects.toString(interfaceC56560yJx5);
                }
                iUiRetrievable$getUiState$14.L$0 = interfaceC56560yJx;
                iUiRetrievable$getUiState$14.L$1 = interfaceC56560yJx2;
                iUiRetrievable$getUiState$14.L$2 = interfaceC56560yJx3;
                iUiRetrievable$getUiState$14.L$3 = interfaceC56560yJx4;
                iUiRetrievable$getUiState$14.L$4 = interfaceC56560yJx5;
                iUiRetrievable$getUiState$14.label = 1;
                objOLrzqt = abstractC49411unz.OLrzqt(abstractC49411unz, iUiRetrievable$getUiState$14);
                interfaceC56560yJx10 = interfaceC56560yJx;
                interfaceC56560yJx9 = interfaceC56560yJx2;
                interfaceC56560yJx8 = interfaceC56560yJx3;
                interfaceC56560yJx7 = interfaceC56560yJx4;
                interfaceC56560yJx6 = interfaceC56560yJx5;
                if (objOLrzqt == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                InterfaceC56560yJx interfaceC56560yJx11 = (InterfaceC56560yJx<T, ? extends E>) ((InterfaceC56560yJx) iUiRetrievable$getUiState$14.L$4);
                InterfaceC56560yJx interfaceC56560yJx12 = (InterfaceC56560yJx<T, ? extends D>) ((InterfaceC56560yJx) iUiRetrievable$getUiState$14.L$3);
                InterfaceC56560yJx interfaceC56560yJx13 = (InterfaceC56560yJx<T, ? extends C>) ((InterfaceC56560yJx) iUiRetrievable$getUiState$14.L$2);
                InterfaceC56560yJx interfaceC56560yJx14 = (InterfaceC56560yJx<T, ? extends B>) ((InterfaceC56560yJx) iUiRetrievable$getUiState$14.L$1);
                InterfaceC56560yJx interfaceC56560yJx15 = (InterfaceC56560yJx<T, ? extends A>) ((InterfaceC56560yJx) iUiRetrievable$getUiState$14.L$0);
                C56391yDq.AEQbTJ(objOLrzqt);
                interfaceC56560yJx10 = interfaceC56560yJx15;
                interfaceC56560yJx9 = interfaceC56560yJx14;
                interfaceC56560yJx8 = interfaceC56560yJx13;
                interfaceC56560yJx7 = interfaceC56560yJx12;
                interfaceC56560yJx6 = interfaceC56560yJx11;
            }
            InterfaceC49369unJ interfaceC49369unJ = (InterfaceC49369unJ) objOLrzqt;
            return C49380unU.AEQbTJ(C49380unU.AEQbTJ(C49380unU.copydefault(C49380unU.OLrzqt(interfaceC56560yJx10.get(interfaceC49369unJ), interfaceC56560yJx9.get(interfaceC49369unJ)), interfaceC56560yJx8.get(interfaceC49369unJ)), interfaceC56560yJx7.get(interfaceC49369unJ)), interfaceC56560yJx6.get(interfaceC49369unJ));
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static <T extends InterfaceC49369unJ<T>, A, B, C, D, E, F> java.lang.Object OLrzqt(@NotNull InterfaceC49367unH interfaceC49367unH, @NotNull AbstractC49411unz<T> abstractC49411unz, @NotNull InterfaceC56560yJx<T, ? extends A> interfaceC56560yJx, @NotNull InterfaceC56560yJx<T, ? extends B> interfaceC56560yJx2, @NotNull InterfaceC56560yJx<T, ? extends C> interfaceC56560yJx3, @NotNull InterfaceC56560yJx<T, ? extends D> interfaceC56560yJx4, @NotNull InterfaceC56560yJx<T, ? extends E> interfaceC56560yJx5, @NotNull InterfaceC56560yJx<T, ? extends F> interfaceC56560yJx6, @NotNull Continuation<? super Sextet<? extends A, ? extends B, ? extends C, ? extends D, ? extends E, ? extends F>> continuation) throws java.lang.Throwable {
            IUiRetrievable$getUiState$17 iUiRetrievable$getUiState$17;
            InterfaceC56560yJx interfaceC56560yJx7;
            InterfaceC56560yJx interfaceC56560yJx8;
            InterfaceC56560yJx interfaceC56560yJx9;
            InterfaceC56560yJx interfaceC56560yJx10;
            InterfaceC56560yJx interfaceC56560yJx11;
            InterfaceC56560yJx interfaceC56560yJx12;
            if (continuation instanceof IUiRetrievable$getUiState$17) {
                iUiRetrievable$getUiState$17 = (IUiRetrievable$getUiState$17) continuation;
                int i = iUiRetrievable$getUiState$17.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    iUiRetrievable$getUiState$17.label = i - Integer.MIN_VALUE;
                } else {
                    iUiRetrievable$getUiState$17 = new IUiRetrievable$getUiState$17(continuation);
                }
            }
            java.lang.Object objOLrzqt = iUiRetrievable$getUiState$17.result;
            java.lang.Object objCopydefault = C56442yFn.copydefault();
            int i2 = iUiRetrievable$getUiState$17.label;
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objOLrzqt);
                if (C49372unM.AEQbTJ.copydefault()) {
                    Objects.toString(interfaceC56560yJx);
                    Objects.toString(interfaceC56560yJx2);
                    Objects.toString(interfaceC56560yJx3);
                    Objects.toString(interfaceC56560yJx4);
                    Objects.toString(interfaceC56560yJx5);
                    Objects.toString(interfaceC56560yJx6);
                }
                iUiRetrievable$getUiState$17.L$0 = interfaceC56560yJx;
                iUiRetrievable$getUiState$17.L$1 = interfaceC56560yJx2;
                iUiRetrievable$getUiState$17.L$2 = interfaceC56560yJx3;
                iUiRetrievable$getUiState$17.L$3 = interfaceC56560yJx4;
                iUiRetrievable$getUiState$17.L$4 = interfaceC56560yJx5;
                iUiRetrievable$getUiState$17.L$5 = interfaceC56560yJx6;
                iUiRetrievable$getUiState$17.label = 1;
                objOLrzqt = abstractC49411unz.OLrzqt(abstractC49411unz, iUiRetrievable$getUiState$17);
                interfaceC56560yJx12 = interfaceC56560yJx;
                interfaceC56560yJx11 = interfaceC56560yJx2;
                interfaceC56560yJx10 = interfaceC56560yJx3;
                interfaceC56560yJx9 = interfaceC56560yJx4;
                interfaceC56560yJx8 = interfaceC56560yJx5;
                interfaceC56560yJx7 = interfaceC56560yJx6;
                if (objOLrzqt == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                InterfaceC56560yJx interfaceC56560yJx13 = (InterfaceC56560yJx<T, ? extends F>) ((InterfaceC56560yJx) iUiRetrievable$getUiState$17.L$5);
                InterfaceC56560yJx interfaceC56560yJx14 = (InterfaceC56560yJx<T, ? extends E>) ((InterfaceC56560yJx) iUiRetrievable$getUiState$17.L$4);
                InterfaceC56560yJx interfaceC56560yJx15 = (InterfaceC56560yJx<T, ? extends D>) ((InterfaceC56560yJx) iUiRetrievable$getUiState$17.L$3);
                InterfaceC56560yJx interfaceC56560yJx16 = (InterfaceC56560yJx<T, ? extends C>) ((InterfaceC56560yJx) iUiRetrievable$getUiState$17.L$2);
                InterfaceC56560yJx interfaceC56560yJx17 = (InterfaceC56560yJx<T, ? extends B>) ((InterfaceC56560yJx) iUiRetrievable$getUiState$17.L$1);
                InterfaceC56560yJx interfaceC56560yJx18 = (InterfaceC56560yJx<T, ? extends A>) ((InterfaceC56560yJx) iUiRetrievable$getUiState$17.L$0);
                C56391yDq.AEQbTJ(objOLrzqt);
                interfaceC56560yJx12 = interfaceC56560yJx18;
                interfaceC56560yJx11 = interfaceC56560yJx17;
                interfaceC56560yJx10 = interfaceC56560yJx16;
                interfaceC56560yJx9 = interfaceC56560yJx15;
                interfaceC56560yJx8 = interfaceC56560yJx14;
                interfaceC56560yJx7 = interfaceC56560yJx13;
            }
            InterfaceC49369unJ interfaceC49369unJ = (InterfaceC49369unJ) objOLrzqt;
            return C49380unU.KWHzl(C49380unU.AEQbTJ(C49380unU.AEQbTJ(C49380unU.copydefault(C49380unU.OLrzqt(interfaceC56560yJx12.get(interfaceC49369unJ), interfaceC56560yJx11.get(interfaceC49369unJ)), interfaceC56560yJx10.get(interfaceC49369unJ)), interfaceC56560yJx9.get(interfaceC49369unJ)), interfaceC56560yJx8.get(interfaceC49369unJ)), interfaceC56560yJx7.get(interfaceC49369unJ));
        }

        /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: o.yJx<T extends o.unJ<T>, ? extends o.unL<? extends V>> */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static <T extends InterfaceC49369unJ<T>, V> java.lang.Object AEQbTJ(@NotNull InterfaceC49367unH interfaceC49367unH, @NotNull AbstractC49411unz<T> abstractC49411unz, @NotNull InterfaceC56560yJx<T, ? extends InterfaceC49371unL<? extends V>> interfaceC56560yJx, @NotNull Continuation<? super V> continuation) throws java.lang.Throwable {
            IUiRetrievable$tryGetSuccessUiState$1 iUiRetrievable$tryGetSuccessUiState$1;
            if (continuation instanceof IUiRetrievable$tryGetSuccessUiState$1) {
                iUiRetrievable$tryGetSuccessUiState$1 = (IUiRetrievable$tryGetSuccessUiState$1) continuation;
                int i = iUiRetrievable$tryGetSuccessUiState$1.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    iUiRetrievable$tryGetSuccessUiState$1.label = i - Integer.MIN_VALUE;
                } else {
                    iUiRetrievable$tryGetSuccessUiState$1 = new IUiRetrievable$tryGetSuccessUiState$1(continuation);
                }
            }
            java.lang.Object objOLrzqt = iUiRetrievable$tryGetSuccessUiState$1.result;
            java.lang.Object objCopydefault = C56442yFn.copydefault();
            int i2 = iUiRetrievable$tryGetSuccessUiState$1.label;
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objOLrzqt);
                iUiRetrievable$tryGetSuccessUiState$1.label = 1;
                objOLrzqt = abstractC49411unz.OLrzqt(abstractC49411unz, interfaceC56560yJx, iUiRetrievable$tryGetSuccessUiState$1);
                if (objOLrzqt == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objOLrzqt);
            }
            InterfaceC49371unL.Activity activity = objOLrzqt instanceof InterfaceC49371unL.Activity ? (InterfaceC49371unL.Activity) objOLrzqt : null;
            if (activity != null) {
                return activity.copydefault();
            }
            return null;
        }
    }
}
