package com.okinc.okimcore.feature.message.repository.local.inhouseim;

import com.okinc.okimcore.common.database.BaseDao;
import com.okinc.okimcore.model.room.inhouseim.InHouseIMMessageHandling;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.C56391yDq;
import o.C56403yEb;
import o.C56442yFn;
import o.C56443yFo;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public interface InHouseIMMessageHandlingDao extends BaseDao {

    /* JADX INFO: renamed from: com.okinc.okimcore.feature.message.repository.local.inhouseim.InHouseIMMessageHandlingDao$insertOrReplaceByChannel$1, reason: invalid class name */
    /* JADX INFO: loaded from: classes16.dex */
    public static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return Activity.KWHzl(null, null, null, this);
        }
    }

    Object coreInsertOrReplace(@NotNull List<InHouseIMMessageHandling> list, @NotNull Continuation<? super Unit> continuation);

    Object deleteByBatch(@NotNull String str, @NotNull Set<Long> set, @NotNull Continuation<? super Unit> continuation);

    @Override // com.okinc.okimcore.common.database.BaseDao
    String getDaoName();

    Object getHighestPriorityMessageHandling(@NotNull String str, long j, @NotNull Continuation<? super InHouseIMMessageHandling> continuation);

    Object insertOrReplaceByChannel(@NotNull String str, @NotNull List<InHouseIMMessageHandling> list, @NotNull Continuation<? super Unit> continuation);

    /* JADX INFO: loaded from: classes16.dex */
    public static final class Activity {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static String EZpvd(@NotNull InHouseIMMessageHandlingDao inHouseIMMessageHandlingDao) {
            return "InHouseIMMessageHandlingDao";
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static Object KWHzl(@NotNull InHouseIMMessageHandlingDao inHouseIMMessageHandlingDao, @NotNull String str, @NotNull List<InHouseIMMessageHandling> list, @NotNull Continuation<? super Unit> continuation) throws Throwable {
            AnonymousClass1 anonymousClass1;
            if (continuation instanceof AnonymousClass1) {
                anonymousClass1 = (AnonymousClass1) continuation;
                int i = anonymousClass1.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    anonymousClass1.label = i - Integer.MIN_VALUE;
                } else {
                    anonymousClass1 = new AnonymousClass1(continuation);
                }
            }
            Object obj = anonymousClass1.result;
            Object objCopydefault = C56442yFn.copydefault();
            int i2 = anonymousClass1.label;
            if (i2 == 0) {
                C56391yDq.AEQbTJ(obj);
                ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(C56443yFo.KWHzl(((InHouseIMMessageHandling) it.next()).getSequence()));
                }
                Set<Long> setOqFWZa = CollectionsKt___CollectionsKt.OqFWZa(arrayList);
                anonymousClass1.L$0 = inHouseIMMessageHandlingDao;
                anonymousClass1.L$1 = list;
                anonymousClass1.label = 1;
                if (inHouseIMMessageHandlingDao.deleteByBatch(str, setOqFWZa, anonymousClass1) == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                    return Unit.INSTANCE;
                }
                list = (List) anonymousClass1.L$1;
                inHouseIMMessageHandlingDao = (InHouseIMMessageHandlingDao) anonymousClass1.L$0;
                C56391yDq.AEQbTJ(obj);
            }
            anonymousClass1.L$0 = null;
            anonymousClass1.L$1 = null;
            anonymousClass1.label = 2;
            if (inHouseIMMessageHandlingDao.coreInsertOrReplace(list, anonymousClass1) == objCopydefault) {
                return objCopydefault;
            }
            return Unit.INSTANCE;
        }
    }
}
