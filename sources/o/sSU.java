package o;

import com.okinc.okimcore.utils.DaosKt$executeSqlWithMaxSqlParamAmountGuard$1;
import com.okinc.okimcore.utils.DaosKt$executeSqlWithMaxSqlParamAmountGuardFlow$$inlined$combine$1$3;
import com.okinc.okimcore.utils.DaosKt$executeSqlWithMaxSqlParamAmountGuardUnit$1;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.internal.CombineKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class sSU {
    /* JADX WARN: Removed duplicated region for block: B:17:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0080 -> B:21:0x0083). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T, U> java.lang.Object OLrzqt(@NotNull java.util.Set<? extends T> set, @NotNull Function2<? super java.util.Set<? extends T>, ? super Continuation<? super java.util.List<? extends U>>, ? extends java.lang.Object> function2, @NotNull Continuation<? super java.util.List<? extends U>> continuation) {
        DaosKt$executeSqlWithMaxSqlParamAmountGuard$1 daosKt$executeSqlWithMaxSqlParamAmountGuard$1;
        java.util.Iterator<T> it;
        java.util.Collection collection;
        Function2<? super java.util.Set<? extends T>, ? super Continuation<? super java.util.List<? extends U>>, ? extends java.lang.Object> function22;
        if (continuation instanceof DaosKt$executeSqlWithMaxSqlParamAmountGuard$1) {
            daosKt$executeSqlWithMaxSqlParamAmountGuard$1 = (DaosKt$executeSqlWithMaxSqlParamAmountGuard$1) continuation;
            int i = daosKt$executeSqlWithMaxSqlParamAmountGuard$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                daosKt$executeSqlWithMaxSqlParamAmountGuard$1.label = i - Integer.MIN_VALUE;
            } else {
                daosKt$executeSqlWithMaxSqlParamAmountGuard$1 = new DaosKt$executeSqlWithMaxSqlParamAmountGuard$1(continuation);
            }
        }
        java.lang.Object obj = daosKt$executeSqlWithMaxSqlParamAmountGuard$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = daosKt$executeSqlWithMaxSqlParamAmountGuard$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            java.util.List listValueOf = CollectionsKt___CollectionsKt.valueOf(set, 999);
            java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listValueOf, 10));
            it = listValueOf.iterator();
            collection = arrayList;
            function22 = function2;
            if (it.hasNext()) {
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            collection = (java.util.Collection) daosKt$executeSqlWithMaxSqlParamAmountGuard$1.L$3;
            it = (java.util.Iterator) daosKt$executeSqlWithMaxSqlParamAmountGuard$1.L$2;
            java.util.Collection collection2 = (java.util.Collection) daosKt$executeSqlWithMaxSqlParamAmountGuard$1.L$1;
            Function2<? super java.util.Set<? extends T>, ? super Continuation<? super java.util.List<? extends U>>, ? extends java.lang.Object> function23 = (Function2) daosKt$executeSqlWithMaxSqlParamAmountGuard$1.L$0;
            C56391yDq.AEQbTJ(obj);
            collection.add((java.util.List) obj);
            collection = collection2;
            function22 = function23;
            if (it.hasNext()) {
                java.util.Set setOqFWZa = CollectionsKt___CollectionsKt.OqFWZa((java.util.List) it.next());
                daosKt$executeSqlWithMaxSqlParamAmountGuard$1.L$0 = function22;
                daosKt$executeSqlWithMaxSqlParamAmountGuard$1.L$1 = collection;
                daosKt$executeSqlWithMaxSqlParamAmountGuard$1.L$2 = it;
                daosKt$executeSqlWithMaxSqlParamAmountGuard$1.L$3 = collection;
                daosKt$executeSqlWithMaxSqlParamAmountGuard$1.label = 1;
                java.lang.Object objInvoke = function22.invoke(setOqFWZa, daosKt$executeSqlWithMaxSqlParamAmountGuard$1);
                if (objInvoke == objCopydefault) {
                    return objCopydefault;
                }
                function23 = function22;
                obj = objInvoke;
                collection2 = collection;
                collection.add((java.util.List) obj);
                collection = collection2;
                function22 = function23;
                if (it.hasNext()) {
                    return C56403yEb.QOLQEE((java.util.List) collection);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0081 -> B:21:0x0082). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T> java.lang.Object EZpvd(@NotNull java.util.Set<? extends T> set, @NotNull Function2<? super java.util.Set<? extends T>, ? super Continuation<? super Unit>, ? extends java.lang.Object> function2, @NotNull Continuation<? super Unit> continuation) {
        DaosKt$executeSqlWithMaxSqlParamAmountGuardUnit$1 daosKt$executeSqlWithMaxSqlParamAmountGuardUnit$1;
        java.util.Iterator<T> it;
        java.util.Collection collection;
        Function2<? super java.util.Set<? extends T>, ? super Continuation<? super Unit>, ? extends java.lang.Object> function22;
        if (continuation instanceof DaosKt$executeSqlWithMaxSqlParamAmountGuardUnit$1) {
            daosKt$executeSqlWithMaxSqlParamAmountGuardUnit$1 = (DaosKt$executeSqlWithMaxSqlParamAmountGuardUnit$1) continuation;
            int i = daosKt$executeSqlWithMaxSqlParamAmountGuardUnit$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                daosKt$executeSqlWithMaxSqlParamAmountGuardUnit$1.label = i - Integer.MIN_VALUE;
            } else {
                daosKt$executeSqlWithMaxSqlParamAmountGuardUnit$1 = new DaosKt$executeSqlWithMaxSqlParamAmountGuardUnit$1(continuation);
            }
        }
        java.lang.Object obj = daosKt$executeSqlWithMaxSqlParamAmountGuardUnit$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = daosKt$executeSqlWithMaxSqlParamAmountGuardUnit$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            java.util.List listValueOf = CollectionsKt___CollectionsKt.valueOf(set, 999);
            java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listValueOf, 10));
            it = listValueOf.iterator();
            collection = arrayList;
            function22 = function2;
            if (it.hasNext()) {
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            collection = (java.util.Collection) daosKt$executeSqlWithMaxSqlParamAmountGuardUnit$1.L$3;
            it = (java.util.Iterator) daosKt$executeSqlWithMaxSqlParamAmountGuardUnit$1.L$2;
            java.util.Collection collection2 = (java.util.Collection) daosKt$executeSqlWithMaxSqlParamAmountGuardUnit$1.L$1;
            Function2<? super java.util.Set<? extends T>, ? super Continuation<? super Unit>, ? extends java.lang.Object> function23 = (Function2) daosKt$executeSqlWithMaxSqlParamAmountGuardUnit$1.L$0;
            C56391yDq.AEQbTJ(obj);
            function22 = function23;
            collection.add(Unit.INSTANCE);
            collection = collection2;
            if (it.hasNext()) {
                java.util.Set setOqFWZa = CollectionsKt___CollectionsKt.OqFWZa((java.util.List) it.next());
                daosKt$executeSqlWithMaxSqlParamAmountGuardUnit$1.L$0 = function22;
                daosKt$executeSqlWithMaxSqlParamAmountGuardUnit$1.L$1 = collection;
                daosKt$executeSqlWithMaxSqlParamAmountGuardUnit$1.L$2 = it;
                daosKt$executeSqlWithMaxSqlParamAmountGuardUnit$1.L$3 = collection;
                daosKt$executeSqlWithMaxSqlParamAmountGuardUnit$1.label = 1;
                if (function22.invoke(setOqFWZa, daosKt$executeSqlWithMaxSqlParamAmountGuardUnit$1) == objCopydefault) {
                    return objCopydefault;
                }
                collection2 = collection;
                collection.add(Unit.INSTANCE);
                collection = collection2;
                if (it.hasNext()) {
                    return Unit.INSTANCE;
                }
            }
        }
    }

    public static final <T, U> Flow<java.util.List<U>> OLrzqt(@NotNull java.util.Set<? extends T> set, @NotNull Function1<? super java.util.Set<? extends T>, ? extends Flow<? extends java.util.List<? extends U>>> function1) {
        Intrinsics.checkNotNullParameter(set, "");
        Intrinsics.checkNotNullParameter(function1, "");
        java.util.List listValueOf = CollectionsKt___CollectionsKt.valueOf(set, 999);
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listValueOf, 10));
        java.util.Iterator<T> it = listValueOf.iterator();
        while (it.hasNext()) {
            arrayList.add(function1.invoke(CollectionsKt___CollectionsKt.OqFWZa((java.util.List) it.next())));
        }
        if (arrayList.isEmpty()) {
            return FlowKt.flowOf(yDY.AhwBna());
        }
        return new ActionBar((Flow[]) CollectionsKt___CollectionsKt.AxsJAYsNCnLh(arrayList).toArray(new Flow[0]));
    }

    /* JADX INFO: Add missing generic type declarations: [U] */
    public static final class ActionBar<U> implements Flow<java.util.List<? extends U>> {
        public final /* synthetic */ Flow[] OLrzqt;

        public ActionBar(Flow[] flowArr) {
            this.OLrzqt = flowArr;
        }

        @Override // kotlinx.coroutines.flow.Flow
        public java.lang.Object collect(@NotNull FlowCollector flowCollector, @NotNull Continuation continuation) {
            final Flow[] flowArr = this.OLrzqt;
            java.lang.Object objCombineInternal = CombineKt.combineInternal(flowCollector, flowArr, new Function0<java.util.List<? extends U>[]>() { // from class: com.okinc.okimcore.utils.DaosKt$executeSqlWithMaxSqlParamAmountGuardFlow$$inlined$combine$1$2
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
                @Override // kotlin.jvm.functions.Function0
                public final List<? extends U>[] invoke() {
                    return new List[flowArr.length];
                }
            }, new DaosKt$executeSqlWithMaxSqlParamAmountGuardFlow$$inlined$combine$1$3(null), continuation);
            return objCombineInternal == C56442yFn.copydefault() ? objCombineInternal : Unit.INSTANCE;
        }
    }
}
