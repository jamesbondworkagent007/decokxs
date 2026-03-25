package o;

import androidx.room.EntityInsertAdapter;
import androidx.room.RoomDatabase;
import androidx.room.util.DBUtil;
import com.okinc.market.watch.data.GroupMarketUserFavorite;
import java.util.Collections;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes23.dex */
public final class qVB implements InterfaceC40441qVz {
    public final RoomDatabase EZpvd;
    public final EntityInsertAdapter<GroupMarketUserFavorite> KWHzl = new EntityInsertAdapter<GroupMarketUserFavorite>() { // from class: o.qVB.2
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.room.EntityInsertAdapter
        public java.lang.String createQuery() {
            return "INSERT OR REPLACE INTO `GroupMarketUserFavorite` (`id`,`groupName`,`userId`,`instId`,`instType`,`alias`,`chainId`,`tokenContractAddress`,`tokenSymbol`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?)";
        }

        /* JADX DEBUG: Method merged with bridge method: bind(Landroidx/sqlite/SQLiteStatement;Ljava/lang/Object;)V */
        @Override // androidx.room.EntityInsertAdapter
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public void bind(@androidx.annotation.NonNull androidx.sqlite.SQLiteStatement sQLiteStatement, @androidx.annotation.NonNull GroupMarketUserFavorite groupMarketUserFavorite) {
            sQLiteStatement.mo5793bindLong(1, groupMarketUserFavorite.getId());
            if (groupMarketUserFavorite.getGroupName() == null) {
                sQLiteStatement.mo5794bindNull(2);
            } else {
                sQLiteStatement.mo5795bindText(2, groupMarketUserFavorite.getGroupName());
            }
            if (groupMarketUserFavorite.getUserId() == null) {
                sQLiteStatement.mo5794bindNull(3);
            } else {
                sQLiteStatement.mo5795bindText(3, groupMarketUserFavorite.getUserId());
            }
            if (groupMarketUserFavorite.getInstId() == null) {
                sQLiteStatement.mo5794bindNull(4);
            } else {
                sQLiteStatement.mo5795bindText(4, groupMarketUserFavorite.getInstId());
            }
            if (groupMarketUserFavorite.getInstType() == null) {
                sQLiteStatement.mo5794bindNull(5);
            } else {
                sQLiteStatement.mo5795bindText(5, groupMarketUserFavorite.getInstType());
            }
            if (groupMarketUserFavorite.getAlias() == null) {
                sQLiteStatement.mo5794bindNull(6);
            } else {
                sQLiteStatement.mo5795bindText(6, groupMarketUserFavorite.getAlias());
            }
            if (groupMarketUserFavorite.getChainId() == null) {
                sQLiteStatement.mo5794bindNull(7);
            } else {
                sQLiteStatement.mo5795bindText(7, groupMarketUserFavorite.getChainId());
            }
            if (groupMarketUserFavorite.getTokenContractAddress() == null) {
                sQLiteStatement.mo5794bindNull(8);
            } else {
                sQLiteStatement.mo5795bindText(8, groupMarketUserFavorite.getTokenContractAddress());
            }
            if (groupMarketUserFavorite.getTokenSymbol() == null) {
                sQLiteStatement.mo5794bindNull(9);
            } else {
                sQLiteStatement.mo5795bindText(9, groupMarketUserFavorite.getTokenSymbol());
            }
        }
    };

    public qVB(@androidx.annotation.NonNull RoomDatabase roomDatabase) {
        this.EZpvd = roomDatabase;
    }

    @Override // o.InterfaceC40441qVz
    public void OLrzqt(final java.lang.String str, final java.lang.String str2) {
        DBUtil.performBlocking(this.EZpvd, false, true, new Function1() { // from class: o.qVE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return qVB.EZpvd(str, str2, (androidx.sqlite.SQLiteConnection) obj);
            }
        });
    }

    public static /* synthetic */ java.lang.Object EZpvd(java.lang.String str, java.lang.String str2, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        androidx.sqlite.SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("DELETE FROM GroupMarketUserFavorite WHERE userId = ? AND groupName = ?");
        try {
            if (str == null) {
                sQLiteStatementPrepare.mo5794bindNull(1);
            } else {
                sQLiteStatementPrepare.mo5795bindText(1, str);
            }
            if (str2 == null) {
                sQLiteStatementPrepare.mo5794bindNull(2);
            } else {
                sQLiteStatementPrepare.mo5795bindText(2, str2);
            }
            sQLiteStatementPrepare.step();
            sQLiteStatementPrepare.close();
            return null;
        } catch (java.lang.Throwable th) {
            sQLiteStatementPrepare.close();
            throw th;
        }
    }

    public static java.util.List<java.lang.Class<?>> AEQbTJ() {
        return Collections.emptyList();
    }
}
