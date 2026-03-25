package o;

import androidx.room.EntityInsertAdapter;
import androidx.room.RoomDatabase;
import androidx.room.util.DBUtil;
import com.okinc.business.defi.biz.database.wallet.entity.WalletJwtInfoEntity;
import java.util.Collections;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: o.cOb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C11434cOb implements InterfaceC11435cOc {
    public final EntityInsertAdapter<WalletJwtInfoEntity> AEQbTJ = new EntityInsertAdapter<WalletJwtInfoEntity>() { // from class: o.cOb.4
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.room.EntityInsertAdapter
        public java.lang.String createQuery() {
            return "INSERT OR REPLACE INTO `wallet_jwt_info` (`account_id`,`enc_jwt`) VALUES (?,?)";
        }

        /* JADX DEBUG: Method merged with bridge method: bind(Landroidx/sqlite/SQLiteStatement;Ljava/lang/Object;)V */
        @Override // androidx.room.EntityInsertAdapter
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public void bind(@androidx.annotation.NonNull androidx.sqlite.SQLiteStatement sQLiteStatement, @androidx.annotation.NonNull WalletJwtInfoEntity walletJwtInfoEntity) {
            if (walletJwtInfoEntity.getAccountId() == null) {
                sQLiteStatement.mo5794bindNull(1);
            } else {
                sQLiteStatement.mo5795bindText(1, walletJwtInfoEntity.getAccountId());
            }
            if (walletJwtInfoEntity.getEncryptedJwt() == null) {
                sQLiteStatement.mo5794bindNull(2);
            } else {
                sQLiteStatement.mo5795bindText(2, walletJwtInfoEntity.getEncryptedJwt());
            }
        }
    };
    public final RoomDatabase EZpvd;

    public C11434cOb(@androidx.annotation.NonNull RoomDatabase roomDatabase) {
        this.EZpvd = roomDatabase;
    }

    @Override // o.InterfaceC11435cOc
    public java.lang.Object EZpvd(final WalletJwtInfoEntity walletJwtInfoEntity, Continuation<? super Unit> continuation) {
        walletJwtInfoEntity.getClass();
        return DBUtil.performSuspending(this.EZpvd, false, true, new Function1() { // from class: o.cOd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return this.AEQbTJ.KWHzl(walletJwtInfoEntity, (androidx.sqlite.SQLiteConnection) obj);
            }
        }, continuation);
    }

    public final /* synthetic */ Unit KWHzl(WalletJwtInfoEntity walletJwtInfoEntity, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        this.AEQbTJ.insert(sQLiteConnection, walletJwtInfoEntity);
        return Unit.INSTANCE;
    }

    @Override // o.InterfaceC11435cOc
    public java.lang.Object copydefault(final java.lang.String str, Continuation<? super java.lang.String> continuation) {
        return DBUtil.performSuspending(this.EZpvd, true, false, new Function1() { // from class: o.cOe
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C11434cOb.EZpvd(str, (androidx.sqlite.SQLiteConnection) obj);
            }
        }, continuation);
    }

    public static /* synthetic */ java.lang.String EZpvd(java.lang.String str, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        androidx.sqlite.SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("SELECT enc_jwt FROM wallet_jwt_info WHERE account_id = ?");
        try {
            if (str == null) {
                sQLiteStatementPrepare.mo5794bindNull(1);
            } else {
                sQLiteStatementPrepare.mo5795bindText(1, str);
            }
            return (!sQLiteStatementPrepare.step() || sQLiteStatementPrepare.isNull(0)) ? null : sQLiteStatementPrepare.getText(0);
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    public static java.util.List<java.lang.Class<?>> KWHzl() {
        return Collections.emptyList();
    }
}
