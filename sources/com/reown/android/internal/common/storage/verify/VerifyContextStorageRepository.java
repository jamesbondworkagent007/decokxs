package com.reown.android.internal.common.storage.verify;

import android.database.sqlite.SQLiteException;
import com.reown.android.internal.common.model.Validation;
import com.reown.android.sdk.storage.data.dao.VerifyContextQueries;
import com.reown.android.verify.model.VerifyContext;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import o.C56443yFo;
import o.yHS;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class VerifyContextStorageRepository {
    public final VerifyContextQueries verifyContextQueries;

    public VerifyContextStorageRepository(@NotNull VerifyContextQueries verifyContextQueries) {
        Intrinsics.checkNotNullParameter(verifyContextQueries, "");
        this.verifyContextQueries = verifyContextQueries;
    }

    public final Object insertOrAbort(@NotNull VerifyContext verifyContext, @NotNull Continuation<? super Unit> continuation) throws SQLiteException {
        this.verifyContextQueries.insertOrAbortVerifyContext(C56443yFo.KWHzl(verifyContext.getId()), verifyContext.getOrigin(), verifyContext.getValidation(), verifyContext.getVerifyUrl(), verifyContext.isScam());
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: com.reown.android.internal.common.storage.verify.VerifyContextStorageRepository$get$2, reason: invalid class name */
    public final /* synthetic */ class AnonymousClass2 extends FunctionReferenceImpl implements yHS<Long, String, Validation, String, Boolean, VerifyContext> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AnonymousClass2(Object obj) {
            super(5, obj, VerifyContextStorageRepository.class, "toVerifyContext", "toVerifyContext(JLjava/lang/String;Lcom/reown/android/internal/common/model/Validation;Ljava/lang/String;Ljava/lang/Boolean;)Lcom/reown/android/verify/model/VerifyContext;", 0);
        }

        public final VerifyContext invoke(long j, @NotNull String str, @NotNull Validation validation, @NotNull String str2, Boolean bool) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(validation, "");
            Intrinsics.checkNotNullParameter(str2, "");
            return ((VerifyContextStorageRepository) this.receiver).toVerifyContext(j, str, validation, str2, bool);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // o.yHS
        public /* synthetic */ VerifyContext invoke(Long l, String str, Validation validation, String str2, Boolean bool) {
            return invoke(l.longValue(), str, validation, str2, bool);
        }
    }

    public final Object get(long j, @NotNull Continuation<? super VerifyContext> continuation) throws SQLiteException {
        return this.verifyContextQueries.getVerifyContextById(j, new AnonymousClass2(this)).executeAsOneOrNull();
    }

    /* JADX INFO: renamed from: com.reown.android.internal.common.storage.verify.VerifyContextStorageRepository$getAll$2, reason: invalid class name and case insensitive filesystem */
    public final /* synthetic */ class C18072 extends FunctionReferenceImpl implements yHS<Long, String, Validation, String, Boolean, VerifyContext> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public C18072(Object obj) {
            super(5, obj, VerifyContextStorageRepository.class, "toVerifyContext", "toVerifyContext(JLjava/lang/String;Lcom/reown/android/internal/common/model/Validation;Ljava/lang/String;Ljava/lang/Boolean;)Lcom/reown/android/verify/model/VerifyContext;", 0);
        }

        public final VerifyContext invoke(long j, @NotNull String str, @NotNull Validation validation, @NotNull String str2, Boolean bool) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(validation, "");
            Intrinsics.checkNotNullParameter(str2, "");
            return ((VerifyContextStorageRepository) this.receiver).toVerifyContext(j, str, validation, str2, bool);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // o.yHS
        public /* synthetic */ VerifyContext invoke(Long l, String str, Validation validation, String str2, Boolean bool) {
            return invoke(l.longValue(), str, validation, str2, bool);
        }
    }

    public final Object getAll(@NotNull Continuation<? super List<VerifyContext>> continuation) throws SQLiteException {
        return this.verifyContextQueries.geListOfVerifyContexts(new C18072(this)).executeAsList();
    }

    public final Object delete(long j, @NotNull Continuation<? super Unit> continuation) throws SQLiteException {
        this.verifyContextQueries.deleteVerifyContext(j);
        return Unit.INSTANCE;
    }

    public final VerifyContext toVerifyContext(long j, String str, Validation validation, String str2, Boolean bool) {
        return new VerifyContext(j, str, validation, str2, bool);
    }
}
