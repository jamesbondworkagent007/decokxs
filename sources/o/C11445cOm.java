package o;

import androidx.room.EntityInsertAdapter;
import androidx.room.RoomDatabase;
import androidx.room.util.DBUtil;
import com.okinc.business.defi.biz.database.wallet.entity.WalletTotalAssetEntity;
import java.util.Collections;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import o.InterfaceC11443cOk;

/* JADX INFO: renamed from: o.cOm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C11445cOm implements InterfaceC11443cOk {
    public final RoomDatabase AEQbTJ;
    public final EntityInsertAdapter<WalletTotalAssetEntity> EZpvd = new EntityInsertAdapter<WalletTotalAssetEntity>() { // from class: o.cOm.5
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.room.EntityInsertAdapter
        public java.lang.String createQuery() {
            return "INSERT OR REPLACE INTO `total_asset` (`walletId`,`tokenAsset`,`tokenAssetFilterSmall`,`nftAsset`,`defiAsset`,`updateTime`) VALUES (?,?,?,?,?,?)";
        }

        /* JADX DEBUG: Method merged with bridge method: bind(Landroidx/sqlite/SQLiteStatement;Ljava/lang/Object;)V */
        @Override // androidx.room.EntityInsertAdapter
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public void bind(@androidx.annotation.NonNull androidx.sqlite.SQLiteStatement sQLiteStatement, @androidx.annotation.NonNull WalletTotalAssetEntity walletTotalAssetEntity) {
            if (walletTotalAssetEntity.getWalletId() == null) {
                sQLiteStatement.mo5794bindNull(1);
            } else {
                sQLiteStatement.mo5795bindText(1, walletTotalAssetEntity.getWalletId());
            }
            if (walletTotalAssetEntity.getTokenAsset() == null) {
                sQLiteStatement.mo5794bindNull(2);
            } else {
                sQLiteStatement.mo5795bindText(2, walletTotalAssetEntity.getTokenAsset());
            }
            if (walletTotalAssetEntity.getTokenAssetFilterSmall() == null) {
                sQLiteStatement.mo5794bindNull(3);
            } else {
                sQLiteStatement.mo5795bindText(3, walletTotalAssetEntity.getTokenAssetFilterSmall());
            }
            if (walletTotalAssetEntity.getNftAsset() == null) {
                sQLiteStatement.mo5794bindNull(4);
            } else {
                sQLiteStatement.mo5795bindText(4, walletTotalAssetEntity.getNftAsset());
            }
            if (walletTotalAssetEntity.getDefiAsset() == null) {
                sQLiteStatement.mo5794bindNull(5);
            } else {
                sQLiteStatement.mo5795bindText(5, walletTotalAssetEntity.getDefiAsset());
            }
            if (walletTotalAssetEntity.getUpdateTime() == null) {
                sQLiteStatement.mo5794bindNull(6);
            } else {
                sQLiteStatement.mo5795bindText(6, walletTotalAssetEntity.getUpdateTime());
            }
        }
    };

    public C11445cOm(@androidx.annotation.NonNull RoomDatabase roomDatabase) {
        this.AEQbTJ = roomDatabase;
    }

    @Override // o.InterfaceC11443cOk
    public java.lang.Object OLrzqt(final java.util.List<WalletTotalAssetEntity> list, Continuation<? super java.util.List<java.lang.Long>> continuation) {
        list.getClass();
        return DBUtil.performSuspending(this.AEQbTJ, false, true, new Function1() { // from class: o.cOo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return this.AEQbTJ.copydefault(list, (androidx.sqlite.SQLiteConnection) obj);
            }
        }, continuation);
    }

    public final /* synthetic */ java.util.List copydefault(java.util.List list, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        return this.EZpvd.insertAndReturnIdsList(sQLiteConnection, list);
    }

    @Override // o.InterfaceC11443cOk
    public java.lang.Object AEQbTJ(final java.util.List<WalletTotalAssetEntity> list, Continuation<? super java.util.List<java.lang.Long>> continuation) {
        return DBUtil.performInTransactionSuspending(this.AEQbTJ, new Function1() { // from class: o.cOl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return this.EZpvd.copydefault(list, (Continuation) obj);
            }
        }, continuation);
    }

    public final /* synthetic */ java.lang.Object copydefault(java.util.List list, Continuation continuation) {
        return InterfaceC11443cOk.Activity.OLrzqt(this, list, continuation);
    }

    @Override // o.InterfaceC11443cOk
    public java.lang.Object KWHzl(Continuation<? super java.util.List<java.lang.String>> continuation) {
        return DBUtil.performSuspending(this.AEQbTJ, true, false, new Function1() { // from class: o.cOu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C11445cOm.OLrzqt((androidx.sqlite.SQLiteConnection) obj);
            }
        }, continuation);
    }

    public static /* synthetic */ java.util.List OLrzqt(androidx.sqlite.SQLiteConnection sQLiteConnection) {
        androidx.sqlite.SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("SELECT id FROM wallet");
        try {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            while (sQLiteStatementPrepare.step()) {
                arrayList.add(sQLiteStatementPrepare.isNull(0) ? null : sQLiteStatementPrepare.getText(0));
            }
            return arrayList;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    public static java.util.List<java.lang.Class<?>> copydefault() {
        return Collections.emptyList();
    }
}
