package o;

import androidx.room.EntityInsertAdapter;
import androidx.room.RoomDatabase;
import androidx.room.coroutines.FlowUtil;
import androidx.room.util.DBUtil;
import androidx.room.util.SQLiteConnectionUtil;
import androidx.room.util.SQLiteStatementUtil;
import com.okinc.business.defi.biz.database.addressbook.entity.AddressBookEntity;
import com.okinc.business.defi.wallet.mine.search.data.model.WalletSearchRequest;
import java.util.Collections;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: classes23.dex */
public final class cGQ implements cGT {
    public final RoomDatabase KWHzl;
    public final EntityInsertAdapter<AddressBookEntity> copydefault = new EntityInsertAdapter<AddressBookEntity>() { // from class: o.cGQ.3
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.room.EntityInsertAdapter
        public java.lang.String createQuery() {
            return "INSERT OR REPLACE INTO `address_book` (`name`,`address`,`chainNames`,`chainUrls`,`createTime`,`updateTime`,`smartContract`) VALUES (?,?,?,?,?,?,?)";
        }

        /* JADX DEBUG: Method merged with bridge method: bind(Landroidx/sqlite/SQLiteStatement;Ljava/lang/Object;)V */
        @Override // androidx.room.EntityInsertAdapter
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public void bind(@androidx.annotation.NonNull androidx.sqlite.SQLiteStatement sQLiteStatement, @androidx.annotation.NonNull AddressBookEntity addressBookEntity) {
            if (addressBookEntity.getName() == null) {
                sQLiteStatement.mo5794bindNull(1);
            } else {
                sQLiteStatement.mo5795bindText(1, addressBookEntity.getName());
            }
            if (addressBookEntity.getAddress() == null) {
                sQLiteStatement.mo5794bindNull(2);
            } else {
                sQLiteStatement.mo5795bindText(2, addressBookEntity.getAddress());
            }
            C11249cHf c11249cHf = C11249cHf.EZpvd;
            java.lang.String strKWHzl = c11249cHf.KWHzl(addressBookEntity.getChainNames());
            if (strKWHzl == null) {
                sQLiteStatement.mo5794bindNull(3);
            } else {
                sQLiteStatement.mo5795bindText(3, strKWHzl);
            }
            java.lang.String strKWHzl2 = c11249cHf.KWHzl(addressBookEntity.getChainUrls());
            if (strKWHzl2 == null) {
                sQLiteStatement.mo5794bindNull(4);
            } else {
                sQLiteStatement.mo5795bindText(4, strKWHzl2);
            }
            sQLiteStatement.mo5793bindLong(5, addressBookEntity.getCreateTime());
            sQLiteStatement.mo5793bindLong(6, addressBookEntity.getUpdateTime());
            sQLiteStatement.mo5793bindLong(7, addressBookEntity.getSmartContract());
        }
    };

    public cGQ(@androidx.annotation.NonNull RoomDatabase roomDatabase) {
        this.KWHzl = roomDatabase;
    }

    @Override // o.cGT
    public java.lang.Object OLrzqt(final AddressBookEntity addressBookEntity, Continuation<? super java.lang.Long> continuation) {
        addressBookEntity.getClass();
        return DBUtil.performSuspending(this.KWHzl, false, true, new Function1() { // from class: o.cGP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return this.OLrzqt.AEQbTJ(addressBookEntity, (androidx.sqlite.SQLiteConnection) obj);
            }
        }, continuation);
    }

    public final /* synthetic */ java.lang.Long AEQbTJ(AddressBookEntity addressBookEntity, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        return java.lang.Long.valueOf(this.copydefault.insertAndReturnId(sQLiteConnection, addressBookEntity));
    }

    @Override // o.cGT
    public java.lang.Object AEQbTJ(final java.lang.String str, Continuation<? super AddressBookEntity> continuation) {
        return DBUtil.performSuspending(this.KWHzl, true, false, new Function1() { // from class: o.cGR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return cGQ.OLrzqt(str, (androidx.sqlite.SQLiteConnection) obj);
            }
        }, continuation);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static /* synthetic */ AddressBookEntity OLrzqt(java.lang.String str, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        androidx.sqlite.SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("SELECT * FROM address_book WHERE address = ? ORDER BY updateTime DESC");
        try {
            if (str == null) {
                sQLiteStatementPrepare.mo5794bindNull(1);
            } else {
                sQLiteStatementPrepare.mo5795bindText(1, str);
            }
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "name");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, WalletSearchRequest.SEARCH_SOURCE_ADDRESS);
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "chainNames");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "chainUrls");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "createTime");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "updateTime");
            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "smartContract");
            AddressBookEntity addressBookEntity = null;
            java.lang.String text = null;
            if (sQLiteStatementPrepare.step()) {
                AddressBookEntity addressBookEntity2 = new AddressBookEntity();
                addressBookEntity2.setName(sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow));
                addressBookEntity2.setAddress(sQLiteStatementPrepare.isNull(columnIndexOrThrow2) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow2));
                java.lang.String text2 = sQLiteStatementPrepare.isNull(columnIndexOrThrow3) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow3);
                C11249cHf c11249cHf = C11249cHf.EZpvd;
                addressBookEntity2.setChainNames(c11249cHf.copydefault(text2));
                if (!sQLiteStatementPrepare.isNull(columnIndexOrThrow4)) {
                    text = sQLiteStatementPrepare.getText(columnIndexOrThrow4);
                }
                addressBookEntity2.setChainUrls(c11249cHf.copydefault(text));
                addressBookEntity2.setCreateTime(sQLiteStatementPrepare.getLong(columnIndexOrThrow5));
                addressBookEntity2.setUpdateTime(sQLiteStatementPrepare.getLong(columnIndexOrThrow6));
                addressBookEntity2.setSmartContract((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow7));
                addressBookEntity = addressBookEntity2;
            }
            return addressBookEntity;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    @Override // o.cGT
    public Flow<java.util.List<AddressBookEntity>> copydefault() {
        return FlowUtil.createFlow(this.KWHzl, false, new java.lang.String[]{"address_book"}, new Function1() { // from class: o.cGU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return cGQ.AEQbTJ((androidx.sqlite.SQLiteConnection) obj);
            }
        });
    }

    public static /* synthetic */ java.util.List AEQbTJ(androidx.sqlite.SQLiteConnection sQLiteConnection) {
        androidx.sqlite.SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("SELECT * FROM address_book ORDER BY updateTime DESC");
        try {
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "name");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, WalletSearchRequest.SEARCH_SOURCE_ADDRESS);
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "chainNames");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "chainUrls");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "createTime");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "updateTime");
            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "smartContract");
            java.util.ArrayList arrayList = new java.util.ArrayList();
            while (sQLiteStatementPrepare.step()) {
                AddressBookEntity addressBookEntity = new AddressBookEntity();
                java.lang.String text = null;
                addressBookEntity.setName(sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow));
                addressBookEntity.setAddress(sQLiteStatementPrepare.isNull(columnIndexOrThrow2) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow2));
                java.lang.String text2 = sQLiteStatementPrepare.isNull(columnIndexOrThrow3) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow3);
                C11249cHf c11249cHf = C11249cHf.EZpvd;
                addressBookEntity.setChainNames(c11249cHf.copydefault(text2));
                if (!sQLiteStatementPrepare.isNull(columnIndexOrThrow4)) {
                    text = sQLiteStatementPrepare.getText(columnIndexOrThrow4);
                }
                addressBookEntity.setChainUrls(c11249cHf.copydefault(text));
                addressBookEntity.setCreateTime(sQLiteStatementPrepare.getLong(columnIndexOrThrow5));
                addressBookEntity.setUpdateTime(sQLiteStatementPrepare.getLong(columnIndexOrThrow6));
                addressBookEntity.setSmartContract((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow7));
                arrayList.add(addressBookEntity);
            }
            return arrayList;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    @Override // o.cGT
    public java.util.List<AddressBookEntity> EZpvd(final java.lang.String str) {
        return (java.util.List) DBUtil.performBlocking(this.KWHzl, true, false, new Function1() { // from class: o.cGX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return cGQ.djBIcL(str, (androidx.sqlite.SQLiteConnection) obj);
            }
        });
    }

    public static /* synthetic */ java.util.List djBIcL(java.lang.String str, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        androidx.sqlite.SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("SELECT * FROM address_book WHERE chainNames like ? ORDER BY updateTime DESC");
        try {
            if (str == null) {
                sQLiteStatementPrepare.mo5794bindNull(1);
            } else {
                sQLiteStatementPrepare.mo5795bindText(1, str);
            }
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "name");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, WalletSearchRequest.SEARCH_SOURCE_ADDRESS);
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "chainNames");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "chainUrls");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "createTime");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "updateTime");
            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "smartContract");
            java.util.ArrayList arrayList = new java.util.ArrayList();
            while (sQLiteStatementPrepare.step()) {
                AddressBookEntity addressBookEntity = new AddressBookEntity();
                java.lang.String text = null;
                addressBookEntity.setName(sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow));
                addressBookEntity.setAddress(sQLiteStatementPrepare.isNull(columnIndexOrThrow2) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow2));
                java.lang.String text2 = sQLiteStatementPrepare.isNull(columnIndexOrThrow3) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow3);
                C11249cHf c11249cHf = C11249cHf.EZpvd;
                addressBookEntity.setChainNames(c11249cHf.copydefault(text2));
                if (!sQLiteStatementPrepare.isNull(columnIndexOrThrow4)) {
                    text = sQLiteStatementPrepare.getText(columnIndexOrThrow4);
                }
                addressBookEntity.setChainUrls(c11249cHf.copydefault(text));
                addressBookEntity.setCreateTime(sQLiteStatementPrepare.getLong(columnIndexOrThrow5));
                addressBookEntity.setUpdateTime(sQLiteStatementPrepare.getLong(columnIndexOrThrow6));
                addressBookEntity.setSmartContract((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow7));
                arrayList.add(addressBookEntity);
            }
            return arrayList;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    @Override // o.cGT
    public java.util.List<AddressBookEntity> OLrzqt(final java.lang.String str, final java.lang.String str2) {
        return (java.util.List) DBUtil.performBlocking(this.KWHzl, true, false, new Function1() { // from class: o.cGS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return cGQ.AEQbTJ(str, str2, (androidx.sqlite.SQLiteConnection) obj);
            }
        });
    }

    public static /* synthetic */ java.util.List AEQbTJ(java.lang.String str, java.lang.String str2, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        androidx.sqlite.SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("SELECT * FROM address_book WHERE chainNames like ? AND address != ? ORDER BY updateTime DESC");
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
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "name");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, WalletSearchRequest.SEARCH_SOURCE_ADDRESS);
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "chainNames");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "chainUrls");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "createTime");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "updateTime");
            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "smartContract");
            java.util.ArrayList arrayList = new java.util.ArrayList();
            while (sQLiteStatementPrepare.step()) {
                AddressBookEntity addressBookEntity = new AddressBookEntity();
                java.lang.String text = null;
                addressBookEntity.setName(sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow));
                addressBookEntity.setAddress(sQLiteStatementPrepare.isNull(columnIndexOrThrow2) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow2));
                java.lang.String text2 = sQLiteStatementPrepare.isNull(columnIndexOrThrow3) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow3);
                C11249cHf c11249cHf = C11249cHf.EZpvd;
                addressBookEntity.setChainNames(c11249cHf.copydefault(text2));
                if (!sQLiteStatementPrepare.isNull(columnIndexOrThrow4)) {
                    text = sQLiteStatementPrepare.getText(columnIndexOrThrow4);
                }
                addressBookEntity.setChainUrls(c11249cHf.copydefault(text));
                addressBookEntity.setCreateTime(sQLiteStatementPrepare.getLong(columnIndexOrThrow5));
                addressBookEntity.setUpdateTime(sQLiteStatementPrepare.getLong(columnIndexOrThrow6));
                addressBookEntity.setSmartContract((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow7));
                arrayList.add(addressBookEntity);
            }
            return arrayList;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    @Override // o.cGT
    public java.lang.Object copydefault(final java.lang.String str, Continuation<? super java.lang.Integer> continuation) {
        return DBUtil.performSuspending(this.KWHzl, false, true, new Function1() { // from class: o.cGV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return cGQ.AEQbTJ(str, (androidx.sqlite.SQLiteConnection) obj);
            }
        }, continuation);
    }

    public static /* synthetic */ java.lang.Integer AEQbTJ(java.lang.String str, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        androidx.sqlite.SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("DELETE FROM address_book WHERE address = ?");
        try {
            if (str == null) {
                sQLiteStatementPrepare.mo5794bindNull(1);
            } else {
                sQLiteStatementPrepare.mo5795bindText(1, str);
            }
            sQLiteStatementPrepare.step();
            int totalChangedRows = SQLiteConnectionUtil.getTotalChangedRows(sQLiteConnection);
            sQLiteStatementPrepare.close();
            return java.lang.Integer.valueOf(totalChangedRows);
        } catch (java.lang.Throwable th) {
            sQLiteStatementPrepare.close();
            throw th;
        }
    }

    public static java.util.List<java.lang.Class<?>> KWHzl() {
        return Collections.emptyList();
    }
}
