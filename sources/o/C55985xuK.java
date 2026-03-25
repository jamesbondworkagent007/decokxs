package o;

import androidx.room.EntityInsertAdapter;
import androidx.room.RoomDatabase;
import androidx.room.util.DBUtil;
import androidx.room.util.SQLiteStatementUtil;
import java.util.Collections;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: o.xuK, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C55985xuK implements InterfaceC55986xuL {
    public final RoomDatabase AEQbTJ;
    public final C55987xuM copydefault = new C55987xuM();
    public final EntityInsertAdapter<C55993xuS> EZpvd = new EntityInsertAdapter<C55993xuS>() { // from class: o.xuK.1
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.room.EntityInsertAdapter
        public java.lang.String createQuery() {
            return "INSERT OR REPLACE INTO `coin_margined_contract_profit_display` (`algoId`,`selectedDisplay`,`lastUpdated`) VALUES (?,?,?)";
        }

        /* JADX DEBUG: Method merged with bridge method: bind(Landroidx/sqlite/SQLiteStatement;Ljava/lang/Object;)V */
        @Override // androidx.room.EntityInsertAdapter
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public void bind(@androidx.annotation.NonNull androidx.sqlite.SQLiteStatement sQLiteStatement, @androidx.annotation.NonNull C55993xuS c55993xuS) {
            if (c55993xuS.OLrzqt() == null) {
                sQLiteStatement.mo5794bindNull(1);
            } else {
                sQLiteStatement.mo5795bindText(1, c55993xuS.OLrzqt());
            }
            sQLiteStatement.mo5793bindLong(2, C55985xuK.this.copydefault.AEQbTJ(c55993xuS.AEQbTJ()));
            sQLiteStatement.mo5793bindLong(3, c55993xuS.KWHzl());
        }
    };

    public C55985xuK(@androidx.annotation.NonNull RoomDatabase roomDatabase) {
        this.AEQbTJ = roomDatabase;
    }

    @Override // o.InterfaceC55986xuL
    public java.lang.Object OLrzqt(final C55993xuS c55993xuS, Continuation<? super Unit> continuation) {
        c55993xuS.getClass();
        return DBUtil.performSuspending(this.AEQbTJ, false, true, new Function1() { // from class: o.xuP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return this.EZpvd.KWHzl(c55993xuS, (androidx.sqlite.SQLiteConnection) obj);
            }
        }, continuation);
    }

    public final /* synthetic */ Unit KWHzl(C55993xuS c55993xuS, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        this.EZpvd.insert(sQLiteConnection, c55993xuS);
        return Unit.INSTANCE;
    }

    @Override // o.InterfaceC55986xuL
    public java.lang.Object EZpvd(final java.lang.String str, Continuation<? super C55993xuS> continuation) {
        return DBUtil.performSuspending(this.AEQbTJ, true, false, new Function1() { // from class: o.xuR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return this.KWHzl.copydefault(str, (androidx.sqlite.SQLiteConnection) obj);
            }
        }, continuation);
    }

    public final /* synthetic */ C55993xuS copydefault(java.lang.String str, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        androidx.sqlite.SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("SELECT * FROM coin_margined_contract_profit_display WHERE algoId = ? LIMIT 1");
        try {
            if (str == null) {
                sQLiteStatementPrepare.mo5794bindNull(1);
            } else {
                sQLiteStatementPrepare.mo5795bindText(1, str);
            }
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "algoId");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "selectedDisplay");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "lastUpdated");
            C55993xuS c55993xuS = null;
            java.lang.String text = null;
            if (sQLiteStatementPrepare.step()) {
                if (!sQLiteStatementPrepare.isNull(columnIndexOrThrow)) {
                    text = sQLiteStatementPrepare.getText(columnIndexOrThrow);
                }
                c55993xuS = new C55993xuS(text, this.copydefault.KWHzl((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow2)), sQLiteStatementPrepare.getLong(columnIndexOrThrow3));
            }
            return c55993xuS;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    public static java.util.List<java.lang.Class<?>> KWHzl() {
        return Collections.emptyList();
    }
}
