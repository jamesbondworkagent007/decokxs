package com.okinc.okimcore.stickers.local;

import com.okinc.okimcore.common.database.BaseDao;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public interface StickerPacksDao extends BaseDao {

    /* JADX INFO: loaded from: classes16.dex */
    public static final class Activity {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static String copydefault(@NotNull StickerPacksDao stickerPacksDao) {
            return "StickerPacksDao";
        }
    }

    Object delete(@NotNull Set<String> set, @NotNull Continuation<? super Unit> continuation);

    Flow<List<StickerPackEntity>> getAll();

    Object getAllIds(@NotNull Continuation<? super List<String>> continuation);

    @Override // com.okinc.okimcore.common.database.BaseDao
    String getDaoName();

    Object insert(@NotNull List<StickerPackEntity> list, @NotNull Continuation<? super Unit> continuation);
}
