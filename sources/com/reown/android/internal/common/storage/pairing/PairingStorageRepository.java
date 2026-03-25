package com.reown.android.internal.common.storage.pairing;

import android.database.sqlite.SQLiteException;
import com.reown.android.internal.common.model.AppMetaData;
import com.reown.android.internal.common.model.Expiry;
import com.reown.android.internal.common.model.Pairing;
import com.reown.android.internal.common.model.Redirect;
import com.reown.android.sdk.storage.data.dao.PairingQueries;
import com.reown.foundation.common.model.Topic;
import com.reown.utils.UtilFunctionsKt;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import o.C56529yIt;
import o.Intent;
import o.yHD;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class PairingStorageRepository implements PairingStorageRepositoryInterface {
    public final PairingQueries pairingQueries;

    public PairingStorageRepository(@NotNull PairingQueries pairingQueries) {
        Intrinsics.checkNotNullParameter(pairingQueries, "");
        this.pairingQueries = pairingQueries;
    }

    @Override // com.reown.android.internal.common.storage.pairing.PairingStorageRepositoryInterface
    public void insertPairing(@NotNull Pairing pairing) throws SQLiteException {
        Intrinsics.checkNotNullParameter(pairing, "");
        PairingQueries pairingQueries = this.pairingQueries;
        String value = pairing.getTopic().getValue();
        long seconds = pairing.getExpiry().getSeconds();
        String relayProtocol = pairing.getRelayProtocol();
        String relayData = pairing.getRelayData();
        String uri = pairing.getUri();
        String methods = pairing.getMethods();
        if (methods == null) {
            methods = UtilFunctionsKt.getEmpty(C56529yIt.KWHzl);
        }
        pairingQueries.insertOrAbortPairing(value, seconds, relayProtocol, relayData, uri, methods, true, Boolean.valueOf(pairing.isProposalReceived()));
    }

    @Override // com.reown.android.internal.common.storage.pairing.PairingStorageRepositoryInterface
    public void deletePairing(@NotNull Topic topic) throws SQLiteException {
        Intrinsics.checkNotNullParameter(topic, "");
        this.pairingQueries.deletePairing(topic.getValue());
    }

    @Override // com.reown.android.internal.common.storage.pairing.PairingStorageRepositoryInterface
    public boolean hasTopic(@NotNull Topic topic) {
        Intrinsics.checkNotNullParameter(topic, "");
        return this.pairingQueries.hasTopic(topic.getValue()).executeAsOneOrNull() != null;
    }

    /* JADX INFO: renamed from: com.reown.android.internal.common.storage.pairing.PairingStorageRepository$getListOfPairings$2, reason: invalid class name */
    public final /* synthetic */ class AnonymousClass2 extends FunctionReferenceImpl implements yHD<String, Long, String, String, String, String, Boolean, String, String, String, List<? extends String>, String, Pairing> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AnonymousClass2(Object obj) {
            super(12, obj, PairingStorageRepository.class, "toPairing", "toPairing(Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)Lcom/reown/android/internal/common/model/Pairing;", 0);
        }

        public final Pairing invoke(@NotNull String str, long j, @NotNull String str2, String str3, @NotNull String str4, @NotNull String str5, Boolean bool, String str6, String str7, String str8, List<String> list, String str9) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str4, "");
            Intrinsics.checkNotNullParameter(str5, "");
            return ((PairingStorageRepository) this.receiver).toPairing(str, j, str2, str3, str4, str5, bool, str6, str7, str8, list, str9);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // o.yHD
        public /* synthetic */ Pairing invoke(String str, Long l, String str2, String str3, String str4, String str5, Boolean bool, String str6, String str7, String str8, List<? extends String> list, String str9) {
            return invoke(str, l.longValue(), str2, str3, str4, str5, bool, str6, str7, str8, (List<String>) list, str9);
        }
    }

    @Override // com.reown.android.internal.common.storage.pairing.PairingStorageRepositoryInterface
    public Object getListOfPairings(@NotNull Continuation<? super List<Pairing>> continuation) throws SQLiteException {
        return Intent.EZpvd(this.pairingQueries.getListOfPairing(new AnonymousClass2(this)), continuation);
    }

    /* JADX INFO: renamed from: com.reown.android.internal.common.storage.pairing.PairingStorageRepository$getListOfPairingsWithoutRequestReceived$2, reason: invalid class name and case insensitive filesystem */
    public final /* synthetic */ class C18022 extends FunctionReferenceImpl implements yHD<String, Long, String, String, String, String, Boolean, String, String, String, List<? extends String>, String, Pairing> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public C18022(Object obj) {
            super(12, obj, PairingStorageRepository.class, "toPairing", "toPairing(Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)Lcom/reown/android/internal/common/model/Pairing;", 0);
        }

        public final Pairing invoke(@NotNull String str, long j, @NotNull String str2, String str3, @NotNull String str4, @NotNull String str5, Boolean bool, String str6, String str7, String str8, List<String> list, String str9) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str4, "");
            Intrinsics.checkNotNullParameter(str5, "");
            return ((PairingStorageRepository) this.receiver).toPairing(str, j, str2, str3, str4, str5, bool, str6, str7, str8, list, str9);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // o.yHD
        public /* synthetic */ Pairing invoke(String str, Long l, String str2, String str3, String str4, String str5, Boolean bool, String str6, String str7, String str8, List<? extends String> list, String str9) {
            return invoke(str, l.longValue(), str2, str3, str4, str5, bool, str6, str7, str8, (List<String>) list, str9);
        }
    }

    @Override // com.reown.android.internal.common.storage.pairing.PairingStorageRepositoryInterface
    public Object getListOfPairingsWithoutRequestReceived(@NotNull Continuation<? super List<Pairing>> continuation) throws SQLiteException {
        return Intent.EZpvd(this.pairingQueries.getListOfPairingsWithoutRequestReceived(new C18022(this)), continuation);
    }

    @Override // com.reown.android.internal.common.storage.pairing.PairingStorageRepositoryInterface
    public void setRequestReceived(@NotNull Topic topic) throws SQLiteException {
        Intrinsics.checkNotNullParameter(topic, "");
        this.pairingQueries.setRequestReceived(Boolean.TRUE, topic.getValue());
    }

    @Override // com.reown.android.internal.common.storage.pairing.PairingStorageRepositoryInterface
    public void updateExpiry(@NotNull Topic topic, @NotNull Expiry expiry) throws SQLiteException {
        Intrinsics.checkNotNullParameter(topic, "");
        Intrinsics.checkNotNullParameter(expiry, "");
        this.pairingQueries.updateOrAbortExpiry(expiry.getSeconds(), topic.getValue());
    }

    /* JADX INFO: renamed from: com.reown.android.internal.common.storage.pairing.PairingStorageRepository$getPairingOrNullByTopic$1, reason: invalid class name */
    public final /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements yHD<String, Long, String, String, String, String, Boolean, String, String, String, List<? extends String>, String, Pairing> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AnonymousClass1(Object obj) {
            super(12, obj, PairingStorageRepository.class, "toPairing", "toPairing(Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)Lcom/reown/android/internal/common/model/Pairing;", 0);
        }

        public final Pairing invoke(@NotNull String str, long j, @NotNull String str2, String str3, @NotNull String str4, @NotNull String str5, Boolean bool, String str6, String str7, String str8, List<String> list, String str9) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str4, "");
            Intrinsics.checkNotNullParameter(str5, "");
            return ((PairingStorageRepository) this.receiver).toPairing(str, j, str2, str3, str4, str5, bool, str6, str7, str8, list, str9);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // o.yHD
        public /* synthetic */ Pairing invoke(String str, Long l, String str2, String str3, String str4, String str5, Boolean bool, String str6, String str7, String str8, List<? extends String> list, String str9) {
            return invoke(str, l.longValue(), str2, str3, str4, str5, bool, str6, str7, str8, (List<String>) list, str9);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v3, resolved type: RowType */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.reown.android.internal.common.storage.pairing.PairingStorageRepositoryInterface
    public Pairing getPairingOrNullByTopic(@NotNull Topic topic) throws SQLiteException {
        Intrinsics.checkNotNullParameter(topic, "");
        return (Pairing) this.pairingQueries.getPairingByTopic(topic.getValue(), new AnonymousClass1(this)).executeAsOneOrNull();
    }

    public final Pairing toPairing(String str, long j, String str2, String str3, String str4, String str5, Boolean bool, String str6, String str7, String str8, List<String> list, String str9) {
        return new Pairing(new Topic(str), new Expiry(j), (str6 == null || str7 == null || str8 == null || list == null) ? null : new AppMetaData(str7, str8, list, str6, new Redirect(str9, null, false, 6, null), null, 32, null), str2, str3, str4, bool != null ? bool.booleanValue() : true, str5);
    }
}
