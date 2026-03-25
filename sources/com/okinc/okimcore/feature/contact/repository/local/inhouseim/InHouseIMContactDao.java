package com.okinc.okimcore.feature.contact.repository.local.inhouseim;

import com.okinc.okimcore.common.database.BaseDao;
import com.okinc.okimcore.model.im.inhouseim.ContactRelationType;
import com.okinc.okimcore.model.room.inhouseim.ContactWithPhoneData;
import com.okinc.okimcore.model.room.inhouseim.InHouseIMContactInfoEntity;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public interface InHouseIMContactDao extends BaseDao {

    /* JADX INFO: loaded from: classes16.dex */
    public static final class Application {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static String AEQbTJ(@NotNull InHouseIMContactDao inHouseIMContactDao) {
            return "InHouseIMContactDao";
        }
    }

    Flow<List<ContactWithPhoneData>> flowAllContacts();

    Flow<List<String>> flowAllContactsHash();

    Flow<ContactWithPhoneData> flowContactById(@NotNull String str);

    Object getAllContactIdsExcludingTypes(@NotNull List<? extends ContactRelationType> list, @NotNull Continuation<? super List<String>> continuation);

    Object getAllContacts(@NotNull Continuation<? super List<ContactWithPhoneData>> continuation);

    Object getContactById(@NotNull String str, @NotNull Continuation<? super ContactWithPhoneData> continuation);

    Object getContactEntityById(@NotNull String str, @NotNull Continuation<? super InHouseIMContactInfoEntity> continuation);

    @Override // com.okinc.okimcore.common.database.BaseDao
    String getDaoName();

    Object getRelationListFromLocalByUids(@NotNull Set<String> set, @NotNull Continuation<? super List<ContactWithPhoneData>> continuation);

    Object insertOrReplaceContact(@NotNull InHouseIMContactInfoEntity inHouseIMContactInfoEntity, @NotNull Continuation<? super Unit> continuation);

    Object insertOrReplaceContacts(@NotNull List<InHouseIMContactInfoEntity> list, @NotNull Continuation<? super Unit> continuation);

    Object updateBlackListStatus(@NotNull String str, int i, @NotNull Continuation<? super Integer> continuation);

    Object updateRelationTypes(@NotNull List<String> list, @NotNull ContactRelationType contactRelationType, @NotNull Continuation<? super Integer> continuation);

    Object updateRemarkName(@NotNull String str, @NotNull String str2, @NotNull Continuation<? super Integer> continuation);

    Object updateRemarkNames(@NotNull List<String> list, @NotNull String str, @NotNull Continuation<? super Integer> continuation);
}
