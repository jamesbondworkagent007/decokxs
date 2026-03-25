package com.okinc.okimcore.feature.message.repository.local.inhouseim.phoneentities;

import com.okinc.okimcore.common.database.BaseDao;
import com.okinc.okimcore.model.room.inhouseim.PhoneRelationEntity;
import com.okinc.okimcore.model.room.inhouseim.PhoneRelationUpdateEntity;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.Flow;
import o.C56391yDq;
import o.C56442yFn;
import o.sSU;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public interface PhoneRelationEntityDao extends BaseDao {
    Object deleteAll(@NotNull Continuation<? super Unit> continuation);

    Object deleteAllNotInHashes(@NotNull Set<String> set, @NotNull Continuation<? super Unit> continuation);

    Object deleteAllNotInHashesInternal(@NotNull Set<String> set, @NotNull Continuation<? super Unit> continuation);

    @Override // com.okinc.okimcore.common.database.BaseDao
    String getDaoName();

    Object getPhoneRelations(@NotNull Continuation<? super List<PhoneRelationEntity>> continuation);

    Object getPhoneRelationsByHashes(@NotNull Set<String> set, @NotNull Continuation<? super List<PhoneRelationEntity>> continuation);

    Flow<List<PhoneRelationEntity>> getPhoneRelationsByHashesAsFlow(@NotNull Set<String> set);

    Object getPhoneRelationsCount(@NotNull Continuation<? super Integer> continuation);

    Object getPhoneRelationsNoOkxRelationByHashes(@NotNull Set<String> set, @NotNull Continuation<? super List<PhoneRelationEntity>> continuation);

    Flow<List<PhoneRelationEntity>> getPhoneRelationsNoOkxRelationByHashesAsFlow(@NotNull Set<String> set);

    Object getPhoneRelationsNotSyncYet(long j, @NotNull Continuation<? super List<PhoneRelationEntity>> continuation);

    Object getRandomPhoneRelationsNoOkxRelation(int i, @NotNull Continuation<? super List<PhoneRelationEntity>> continuation);

    Flow<List<PhoneRelationEntity>> getRandomPhoneRelationsNoOkxRelationAsFlow(int i);

    Object insertAllOrIgnore(@NotNull List<PhoneRelationEntity> list, @NotNull Continuation<? super Unit> continuation);

    Object insertAllOrReplace(@NotNull List<PhoneRelationEntity> list, @NotNull Continuation<? super Unit> continuation);

    Object updateAll(@NotNull List<PhoneRelationUpdateEntity> list, @NotNull Continuation<? super Unit> continuation);

    public static final class Activity {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static String OLrzqt(@NotNull PhoneRelationEntityDao phoneRelationEntityDao) {
            return "PhoneRelationEntityDao";
        }

        public static Object copydefault(@NotNull PhoneRelationEntityDao phoneRelationEntityDao, @NotNull Set<String> set, @NotNull Continuation<? super Unit> continuation) {
            Object objEZpvd = sSU.EZpvd(set, phoneRelationEntityDao.new AnonymousClass2(null), continuation);
            return objEZpvd == C56442yFn.copydefault() ? objEZpvd : Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.okinc.okimcore.feature.message.repository.local.inhouseim.phoneentities.PhoneRelationEntityDao$deleteAllNotInHashes$2, reason: invalid class name */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<Set<? extends String>, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass2 anonymousClass2 = PhoneRelationEntityDao.this.new AnonymousClass2(continuation);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Set<? extends String> set, Continuation<? super Unit> continuation) {
            return invoke2((Set<String>) set, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(Set<String> set, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(set, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                Set<String> set = (Set) this.L$0;
                PhoneRelationEntityDao phoneRelationEntityDao = PhoneRelationEntityDao.this;
                this.label = 1;
                if (phoneRelationEntityDao.deleteAllNotInHashesInternal(set, this) == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            return Unit.INSTANCE;
        }
    }
}
