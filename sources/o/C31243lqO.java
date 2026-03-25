package o;

import androidx.room.EntityInsertAdapter;
import androidx.room.RoomDatabase;
import androidx.room.util.DBUtil;
import androidx.room.util.SQLiteStatementUtil;
import com.okinc.business.web3pay.lib.features.contacts.data.entity.Web3PayRecentContactEntity;
import com.okinc.business.web3pay.lib.features.contacts.model.ContactType;
import com.reown.foundation.util.jwt.JwtUtilsKt;
import java.util.Collections;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import o.InterfaceC31244lqP;

/* JADX INFO: renamed from: o.lqO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C31243lqO implements InterfaceC31244lqP {
    public final RoomDatabase EZpvd;
    public final EntityInsertAdapter<Web3PayRecentContactEntity> OLrzqt;

    @Override // o.InterfaceC31244lqP
    public java.lang.Object AEQbTJ(final Web3PayRecentContactEntity web3PayRecentContactEntity, Continuation<? super Unit> continuation) {
        web3PayRecentContactEntity.getClass();
        return DBUtil.performSuspending(this.EZpvd, false, true, new Function1() { // from class: o.lqS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return this.EZpvd.EZpvd(web3PayRecentContactEntity, (androidx.sqlite.SQLiteConnection) obj);
            }
        }, continuation);
    }

    public final /* synthetic */ Unit EZpvd(Web3PayRecentContactEntity web3PayRecentContactEntity, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        this.OLrzqt.insert(sQLiteConnection, web3PayRecentContactEntity);
        return Unit.INSTANCE;
    }

    @Override // o.InterfaceC31244lqP
    public java.lang.Object copydefault(final Web3PayRecentContactEntity web3PayRecentContactEntity, final int i, Continuation<? super Unit> continuation) {
        return DBUtil.performInTransactionSuspending(this.EZpvd, new Function1() { // from class: o.lqV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return this.EZpvd.OLrzqt(web3PayRecentContactEntity, i, (Continuation) obj);
            }
        }, continuation);
    }

    public final /* synthetic */ java.lang.Object OLrzqt(Web3PayRecentContactEntity web3PayRecentContactEntity, int i, Continuation continuation) {
        return InterfaceC31244lqP.StateListAnimator.EZpvd(this, web3PayRecentContactEntity, i, continuation);
    }

    @Override // o.InterfaceC31244lqP
    public java.lang.Object AEQbTJ(final java.lang.String str, final int i, Continuation<? super java.util.List<Web3PayRecentContactEntity>> continuation) {
        return DBUtil.performSuspending(this.EZpvd, true, false, new Function1() { // from class: o.lqU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return this.KWHzl.AEQbTJ(str, i, (androidx.sqlite.SQLiteConnection) obj);
            }
        }, continuation);
    }

    public final /* synthetic */ java.util.List AEQbTJ(java.lang.String str, int i, androidx.sqlite.SQLiteConnection sQLiteConnection) throws java.lang.Throwable {
        androidx.sqlite.SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("SELECT * FROM web3pay_recent_contact WHERE `key` = ? ORDER BY `createdTime` DESC LIMIT ?");
        try {
            if (str == null) {
                sQLiteStatementPrepare.mo5794bindNull(1);
            } else {
                sQLiteStatementPrepare.mo5795bindText(1, str);
            }
            sQLiteStatementPrepare.mo5793bindLong(2, i);
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, JwtUtilsKt.DID_METHOD_KEY);
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "contactId");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "contactName");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "contactAvatar");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "contactDisplay");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "contactInfo");
            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "contactType");
            int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "createdTime");
            java.util.ArrayList arrayList = new java.util.ArrayList();
            while (sQLiteStatementPrepare.step()) {
                try {
                    arrayList.add(new Web3PayRecentContactEntity(sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow), sQLiteStatementPrepare.isNull(columnIndexOrThrow2) ? null : java.lang.Long.valueOf(sQLiteStatementPrepare.getLong(columnIndexOrThrow2)), sQLiteStatementPrepare.isNull(columnIndexOrThrow3) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow3), sQLiteStatementPrepare.isNull(columnIndexOrThrow4) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow4), sQLiteStatementPrepare.isNull(columnIndexOrThrow5) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow5), sQLiteStatementPrepare.isNull(columnIndexOrThrow6) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow6), copydefault(sQLiteStatementPrepare.getText(columnIndexOrThrow7)), sQLiteStatementPrepare.getLong(columnIndexOrThrow8)));
                } catch (java.lang.Throwable th) {
                    th = th;
                    sQLiteStatementPrepare.close();
                    throw th;
                }
            }
            sQLiteStatementPrepare.close();
            return arrayList;
        } catch (java.lang.Throwable th2) {
            th = th2;
        }
    }

    @Override // o.InterfaceC31244lqP
    public java.lang.Object AEQbTJ(Continuation<? super Unit> continuation) {
        return DBUtil.performSuspending(this.EZpvd, false, true, new Function1() { // from class: o.lqW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C31243lqO.EZpvd((androidx.sqlite.SQLiteConnection) obj);
            }
        }, continuation);
    }

    public static /* synthetic */ Unit EZpvd(androidx.sqlite.SQLiteConnection sQLiteConnection) {
        androidx.sqlite.SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("DELETE FROM web3pay_recent_contact");
        try {
            sQLiteStatementPrepare.step();
            return Unit.INSTANCE;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    @Override // o.InterfaceC31244lqP
    public java.lang.Object KWHzl(final java.lang.String str, final java.lang.Long l, Continuation<? super Unit> continuation) {
        return DBUtil.performSuspending(this.EZpvd, false, true, new Function1() { // from class: o.lra
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C31243lqO.AEQbTJ(str, l, (androidx.sqlite.SQLiteConnection) obj);
            }
        }, continuation);
    }

    public static /* synthetic */ Unit AEQbTJ(java.lang.String str, java.lang.Long l, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        androidx.sqlite.SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("DELETE FROM web3pay_recent_contact WHERE `key` = ? AND `contactId` IS NOT NULL AND `contactId` = ?");
        try {
            if (str == null) {
                sQLiteStatementPrepare.mo5794bindNull(1);
            } else {
                sQLiteStatementPrepare.mo5795bindText(1, str);
            }
            if (l == null) {
                sQLiteStatementPrepare.mo5794bindNull(2);
            } else {
                sQLiteStatementPrepare.mo5793bindLong(2, l.longValue());
            }
            sQLiteStatementPrepare.step();
            return Unit.INSTANCE;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    @Override // o.InterfaceC31244lqP
    public java.lang.Object EZpvd(final java.lang.String str, final int i, Continuation<? super Unit> continuation) {
        return DBUtil.performSuspending(this.EZpvd, false, true, new Function1() { // from class: o.lqT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C31243lqO.copydefault(str, i, (androidx.sqlite.SQLiteConnection) obj);
            }
        }, continuation);
    }

    public static /* synthetic */ Unit copydefault(java.lang.String str, int i, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        androidx.sqlite.SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("DELETE FROM web3pay_recent_contact WHERE `key` = ? AND ROWID NOT IN (SELECT ROWID FROM web3pay_recent_contact WHERE `key` = ? ORDER BY createdTime DESC LIMIT ?)");
        try {
            if (str == null) {
                sQLiteStatementPrepare.mo5794bindNull(1);
            } else {
                sQLiteStatementPrepare.mo5795bindText(1, str);
            }
            if (str == null) {
                sQLiteStatementPrepare.mo5794bindNull(2);
            } else {
                sQLiteStatementPrepare.mo5795bindText(2, str);
            }
            sQLiteStatementPrepare.mo5793bindLong(3, i);
            sQLiteStatementPrepare.step();
            return Unit.INSTANCE;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    public static java.util.List<java.lang.Class<?>> AEQbTJ() {
        return Collections.emptyList();
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ContactType copydefault(@androidx.annotation.NonNull java.lang.String str) {
        byte b;
        str.hashCode();
        int iHashCode = str.hashCode();
        if (iHashCode != 84016) {
            if (iHashCode != 40276826) {
                b = (iHashCode == 66081660 && str.equals("EMAIL")) ? (byte) 2 : (byte) -1;
            } else if (str.equals("PHONE_NUMBER")) {
                b = 1;
            }
        } else if (str.equals("UID")) {
            b = 0;
        }
        if (b == 0) {
            return ContactType.UID;
        }
        if (b == 1) {
            return ContactType.PHONE_NUMBER;
        }
        if (b == 2) {
            return ContactType.EMAIL;
        }
        throw new java.lang.IllegalArgumentException("Can't convert value to enum, unknown value: " + str);
    }
}
