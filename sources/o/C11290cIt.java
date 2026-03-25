package o;

import androidx.room.EntityDeleteOrUpdateAdapter;
import androidx.room.EntityInsertAdapter;
import androidx.room.RoomDatabase;
import androidx.room.util.DBUtil;
import androidx.room.util.SQLiteStatementUtil;
import androidx.room.util.StringUtil;
import com.okinc.business.defi.biz.database.wallet.entity.ChainAddressEntity;
import com.okinc.business.defi.biz.database.wallet.entity.ChainAddressSegWitEntity;
import com.okinc.business.defi.biz.database.wallet.entity.EOSInfoEntity;
import com.okinc.business.defi.biz.database.wallet.entity.WalletEntity;
import com.okinc.business.defi.wallet.mine.search.data.model.WalletSearchRequest;
import java.util.Collections;
import java.util.LinkedHashMap;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import o.InterfaceC11289cIs;

/* JADX INFO: renamed from: o.cIt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C11290cIt implements InterfaceC11289cIs {
    public final RoomDatabase EZpvd;
    public final EntityInsertAdapter<EOSInfoEntity> OLrzqt = new EntityInsertAdapter<EOSInfoEntity>() { // from class: o.cIt.2
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.room.EntityInsertAdapter
        public java.lang.String createQuery() {
            return "INSERT OR REPLACE INTO `EOSInfo` (`walletId`,`accountName`,`state`,`pubKey`,`activeKey`,`ownerKey`,`shouldBeDeleted`) VALUES (?,?,?,?,?,?,?)";
        }

        /* JADX DEBUG: Method merged with bridge method: bind(Landroidx/sqlite/SQLiteStatement;Ljava/lang/Object;)V */
        @Override // androidx.room.EntityInsertAdapter
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public void bind(@androidx.annotation.NonNull androidx.sqlite.SQLiteStatement sQLiteStatement, @androidx.annotation.NonNull EOSInfoEntity eOSInfoEntity) {
            if (eOSInfoEntity.getWalletId() == null) {
                sQLiteStatement.mo5794bindNull(1);
            } else {
                sQLiteStatement.mo5795bindText(1, eOSInfoEntity.getWalletId());
            }
            if (eOSInfoEntity.getAccountName() == null) {
                sQLiteStatement.mo5794bindNull(2);
            } else {
                sQLiteStatement.mo5795bindText(2, eOSInfoEntity.getAccountName());
            }
            sQLiteStatement.mo5793bindLong(3, eOSInfoEntity.getState());
            if (eOSInfoEntity.getPubKey() == null) {
                sQLiteStatement.mo5794bindNull(4);
            } else {
                sQLiteStatement.mo5795bindText(4, eOSInfoEntity.getPubKey());
            }
            if (eOSInfoEntity.getActiveKey() == null) {
                sQLiteStatement.mo5794bindNull(5);
            } else {
                sQLiteStatement.mo5795bindText(5, eOSInfoEntity.getActiveKey());
            }
            if (eOSInfoEntity.getOwnerKey() == null) {
                sQLiteStatement.mo5794bindNull(6);
            } else {
                sQLiteStatement.mo5795bindText(6, eOSInfoEntity.getOwnerKey());
            }
            sQLiteStatement.mo5793bindLong(7, eOSInfoEntity.getShouldBeDeleted());
        }
    };
    public final EntityInsertAdapter<ChainAddressEntity> AEQbTJ = new EntityInsertAdapter<ChainAddressEntity>() { // from class: o.cIt.3
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.room.EntityInsertAdapter
        public java.lang.String createQuery() {
            return "INSERT OR REPLACE INTO `chain_address` (`walletId`,`chainId`,`address`,`addressType`,`publicKey`,`derivePath`,`proxyAddress`,`eoaAddress`) VALUES (?,?,?,?,?,?,?,?)";
        }

        /* JADX DEBUG: Method merged with bridge method: bind(Landroidx/sqlite/SQLiteStatement;Ljava/lang/Object;)V */
        @Override // androidx.room.EntityInsertAdapter
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public void bind(@androidx.annotation.NonNull androidx.sqlite.SQLiteStatement sQLiteStatement, @androidx.annotation.NonNull ChainAddressEntity chainAddressEntity) {
            if (chainAddressEntity.getWalletId() == null) {
                sQLiteStatement.mo5794bindNull(1);
            } else {
                sQLiteStatement.mo5795bindText(1, chainAddressEntity.getWalletId());
            }
            sQLiteStatement.mo5793bindLong(2, chainAddressEntity.getChainId());
            if (chainAddressEntity.getAddress() == null) {
                sQLiteStatement.mo5794bindNull(3);
            } else {
                sQLiteStatement.mo5795bindText(3, chainAddressEntity.getAddress());
            }
            sQLiteStatement.mo5793bindLong(4, chainAddressEntity.getAddressType());
            if (chainAddressEntity.getPublicKey() == null) {
                sQLiteStatement.mo5794bindNull(5);
            } else {
                sQLiteStatement.mo5795bindText(5, chainAddressEntity.getPublicKey());
            }
            if (chainAddressEntity.getDerivePath() == null) {
                sQLiteStatement.mo5794bindNull(6);
            } else {
                sQLiteStatement.mo5795bindText(6, chainAddressEntity.getDerivePath());
            }
            if (chainAddressEntity.getProxyAddress() == null) {
                sQLiteStatement.mo5794bindNull(7);
            } else {
                sQLiteStatement.mo5795bindText(7, chainAddressEntity.getProxyAddress());
            }
            if (chainAddressEntity.getEoaAddress() == null) {
                sQLiteStatement.mo5794bindNull(8);
            } else {
                sQLiteStatement.mo5795bindText(8, chainAddressEntity.getEoaAddress());
            }
        }
    };
    public final EntityDeleteOrUpdateAdapter<ChainAddressSegWitEntity> KWHzl = new EntityDeleteOrUpdateAdapter<ChainAddressSegWitEntity>() { // from class: o.cIt.5
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.room.EntityDeleteOrUpdateAdapter
        public java.lang.String createQuery() {
            return "DELETE FROM `chain_address_segwit` WHERE `walletId` = ? AND `chainId` = ? AND `addressType` = ?";
        }

        /* JADX DEBUG: Method merged with bridge method: bind(Landroidx/sqlite/SQLiteStatement;Ljava/lang/Object;)V */
        @Override // androidx.room.EntityDeleteOrUpdateAdapter
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public void bind(@androidx.annotation.NonNull androidx.sqlite.SQLiteStatement sQLiteStatement, @androidx.annotation.NonNull ChainAddressSegWitEntity chainAddressSegWitEntity) {
            if (chainAddressSegWitEntity.getWalletId() == null) {
                sQLiteStatement.mo5794bindNull(1);
            } else {
                sQLiteStatement.mo5795bindText(1, chainAddressSegWitEntity.getWalletId());
            }
            sQLiteStatement.mo5793bindLong(2, chainAddressSegWitEntity.getChainId());
            sQLiteStatement.mo5793bindLong(3, chainAddressSegWitEntity.getAddressType());
        }
    };

    public C11290cIt(@androidx.annotation.NonNull RoomDatabase roomDatabase) {
        this.EZpvd = roomDatabase;
    }

    @Override // o.InterfaceC11289cIs
    public java.lang.Object AEQbTJ(final java.util.List<EOSInfoEntity> list, Continuation<? super java.util.List<java.lang.Long>> continuation) {
        list.getClass();
        return DBUtil.performSuspending(this.EZpvd, false, true, new Function1() { // from class: o.cIH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return this.copydefault.copydefault(list, (androidx.sqlite.SQLiteConnection) obj);
            }
        }, continuation);
    }

    public final /* synthetic */ java.util.List copydefault(java.util.List list, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        return this.OLrzqt.insertAndReturnIdsList(sQLiteConnection, list);
    }

    @Override // o.InterfaceC11289cIs
    public long EZpvd(final ChainAddressEntity chainAddressEntity) {
        chainAddressEntity.getClass();
        return ((java.lang.Long) DBUtil.performBlocking(this.EZpvd, false, true, new Function1() { // from class: o.cIv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return this.AEQbTJ.EZpvd(chainAddressEntity, (androidx.sqlite.SQLiteConnection) obj);
            }
        })).longValue();
    }

    public final /* synthetic */ java.lang.Long EZpvd(ChainAddressEntity chainAddressEntity, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        return java.lang.Long.valueOf(this.AEQbTJ.insertAndReturnId(sQLiteConnection, chainAddressEntity));
    }

    @Override // o.InterfaceC11289cIs
    public java.util.List<java.lang.Long> AEQbTJ(final java.util.List<ChainAddressEntity> list) {
        list.getClass();
        return (java.util.List) DBUtil.performBlocking(this.EZpvd, false, true, new Function1() { // from class: o.cIB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return this.copydefault.AEQbTJ(list, (androidx.sqlite.SQLiteConnection) obj);
            }
        });
    }

    public final /* synthetic */ java.util.List AEQbTJ(java.util.List list, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        return this.AEQbTJ.insertAndReturnIdsList(sQLiteConnection, list);
    }

    @Override // o.InterfaceC11289cIs
    public java.lang.Object copydefault(final java.util.List<ChainAddressEntity> list, Continuation<? super java.util.List<java.lang.Long>> continuation) {
        list.getClass();
        return DBUtil.performSuspending(this.EZpvd, false, true, new Function1() { // from class: o.cIx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return this.AEQbTJ.OLrzqt(list, (androidx.sqlite.SQLiteConnection) obj);
            }
        }, continuation);
    }

    public final /* synthetic */ java.util.List OLrzqt(java.util.List list, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        return this.AEQbTJ.insertAndReturnIdsList(sQLiteConnection, list);
    }

    @Override // o.InterfaceC11289cIs
    public java.lang.Object KWHzl(final java.util.List<ChainAddressSegWitEntity> list, Continuation<? super java.lang.Integer> continuation) {
        list.getClass();
        return DBUtil.performSuspending(this.EZpvd, false, true, new Function1() { // from class: o.cIz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return this.KWHzl.KWHzl(list, (androidx.sqlite.SQLiteConnection) obj);
            }
        }, continuation);
    }

    public final /* synthetic */ java.lang.Integer KWHzl(java.util.List list, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        return java.lang.Integer.valueOf(this.KWHzl.handleMultiple(sQLiteConnection, list));
    }

    @Override // o.InterfaceC11289cIs
    public java.lang.Object EZpvd(final java.util.List<EOSInfoEntity> list, final java.util.List<ChainAddressEntity> list2, Continuation<? super java.util.List<java.lang.Long>> continuation) {
        return DBUtil.performInTransactionSuspending(this.EZpvd, new Function1() { // from class: o.cIE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return this.AEQbTJ.AEQbTJ(list, list2, (Continuation) obj);
            }
        }, continuation);
    }

    public final /* synthetic */ java.lang.Object AEQbTJ(java.util.List list, java.util.List list2, Continuation continuation) {
        return InterfaceC11289cIs.StateListAnimator.AEQbTJ(this, list, list2, continuation);
    }

    @Override // o.InterfaceC11289cIs
    public java.util.List<ChainAddressEntity> OLrzqt(final java.lang.String str) {
        return (java.util.List) DBUtil.performBlocking(this.EZpvd, true, false, new Function1() { // from class: o.cID
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C11290cIt.copydefault(str, (androidx.sqlite.SQLiteConnection) obj);
            }
        });
    }

    public static /* synthetic */ java.util.List copydefault(java.lang.String str, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        androidx.sqlite.SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("SELECT * FROM chain_address WHERE walletId = ?");
        try {
            if (str == null) {
                sQLiteStatementPrepare.mo5794bindNull(1);
            } else {
                sQLiteStatementPrepare.mo5795bindText(1, str);
            }
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "walletId");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "chainId");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, WalletSearchRequest.SEARCH_SOURCE_ADDRESS);
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "addressType");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "publicKey");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "derivePath");
            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "proxyAddress");
            int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "eoaAddress");
            java.util.ArrayList arrayList = new java.util.ArrayList();
            while (sQLiteStatementPrepare.step()) {
                arrayList.add(new ChainAddressEntity(sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow), sQLiteStatementPrepare.getLong(columnIndexOrThrow2), sQLiteStatementPrepare.isNull(columnIndexOrThrow3) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow3), (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow4), sQLiteStatementPrepare.isNull(columnIndexOrThrow5) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow5), sQLiteStatementPrepare.isNull(columnIndexOrThrow6) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow6), sQLiteStatementPrepare.isNull(columnIndexOrThrow7) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow7), sQLiteStatementPrepare.isNull(columnIndexOrThrow8) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow8)));
            }
            return arrayList;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    @Override // o.InterfaceC11289cIs
    public java.lang.Object KWHzl(final java.lang.String str, Continuation<? super java.lang.Boolean> continuation) {
        return DBUtil.performSuspending(this.EZpvd, true, false, new Function1() { // from class: o.cIK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C11290cIt.OLrzqt(str, (androidx.sqlite.SQLiteConnection) obj);
            }
        }, continuation);
    }

    public static /* synthetic */ java.lang.Boolean OLrzqt(java.lang.String str, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        androidx.sqlite.SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("SELECT EXISTS(SELECT DISTINCT address FROM chain_address WHERE address=?)");
        boolean z = true;
        try {
            if (str == null) {
                sQLiteStatementPrepare.mo5794bindNull(1);
            } else {
                sQLiteStatementPrepare.mo5795bindText(1, str);
            }
            java.lang.Boolean boolValueOf = null;
            if (sQLiteStatementPrepare.step()) {
                java.lang.Integer numValueOf = sQLiteStatementPrepare.isNull(0) ? null : java.lang.Integer.valueOf((int) sQLiteStatementPrepare.getLong(0));
                if (numValueOf != null) {
                    if (numValueOf.intValue() == 0) {
                        z = false;
                    }
                    boolValueOf = java.lang.Boolean.valueOf(z);
                }
            }
            return boolValueOf;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    @Override // o.InterfaceC11289cIs
    public java.lang.Object AEQbTJ(final java.lang.String str, final long j, Continuation<? super java.util.List<ChainAddressEntity>> continuation) {
        return DBUtil.performSuspending(this.EZpvd, true, false, new Function1() { // from class: o.cIy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C11290cIt.AEQbTJ(str, j, (androidx.sqlite.SQLiteConnection) obj);
            }
        }, continuation);
    }

    public static /* synthetic */ java.util.List AEQbTJ(java.lang.String str, long j, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        androidx.sqlite.SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("SELECT * FROM chain_address WHERE walletId = ? AND chainId = ?");
        try {
            if (str == null) {
                sQLiteStatementPrepare.mo5794bindNull(1);
            } else {
                sQLiteStatementPrepare.mo5795bindText(1, str);
            }
            sQLiteStatementPrepare.mo5793bindLong(2, j);
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "walletId");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "chainId");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, WalletSearchRequest.SEARCH_SOURCE_ADDRESS);
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "addressType");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "publicKey");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "derivePath");
            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "proxyAddress");
            int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "eoaAddress");
            java.util.ArrayList arrayList = new java.util.ArrayList();
            while (sQLiteStatementPrepare.step()) {
                arrayList.add(new ChainAddressEntity(sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow), sQLiteStatementPrepare.getLong(columnIndexOrThrow2), sQLiteStatementPrepare.isNull(columnIndexOrThrow3) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow3), (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow4), sQLiteStatementPrepare.isNull(columnIndexOrThrow5) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow5), sQLiteStatementPrepare.isNull(columnIndexOrThrow6) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow6), sQLiteStatementPrepare.isNull(columnIndexOrThrow7) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow7), sQLiteStatementPrepare.isNull(columnIndexOrThrow8) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow8)));
            }
            return arrayList;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    @Override // o.InterfaceC11289cIs
    public java.lang.Object KWHzl(final java.util.List<java.lang.String> list, final java.util.List<java.lang.Long> list2, Continuation<? super java.util.Map<java.lang.String, ? extends java.util.List<ChainAddressEntity>>> continuation) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("SELECT * FROM chain_address WHERE walletId in (");
        final int size = list.size();
        StringUtil.appendPlaceholders(sb, size);
        sb.append(") AND chainId in (");
        StringUtil.appendPlaceholders(sb, list2.size());
        sb.append(")");
        final java.lang.String string = sb.toString();
        return DBUtil.performSuspending(this.EZpvd, true, false, new Function1() { // from class: o.cIw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C11290cIt.AEQbTJ(string, list, size, list2, (androidx.sqlite.SQLiteConnection) obj);
            }
        }, continuation);
    }

    public static /* synthetic */ java.util.Map AEQbTJ(java.lang.String str, java.util.List list, int i, java.util.List list2, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        java.util.List list3;
        androidx.sqlite.SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare(str);
        try {
            java.util.Iterator it = list.iterator();
            int i2 = 1;
            while (it.hasNext()) {
                java.lang.String str2 = (java.lang.String) it.next();
                if (str2 == null) {
                    sQLiteStatementPrepare.mo5794bindNull(i2);
                } else {
                    sQLiteStatementPrepare.mo5795bindText(i2, str2);
                }
                i2++;
            }
            int i3 = i + 1;
            java.util.Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                java.lang.Long l = (java.lang.Long) it2.next();
                if (l == null) {
                    sQLiteStatementPrepare.mo5794bindNull(i3);
                } else {
                    sQLiteStatementPrepare.mo5793bindLong(i3, l.longValue());
                }
                i3++;
            }
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "walletId");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "walletId");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "chainId");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, WalletSearchRequest.SEARCH_SOURCE_ADDRESS);
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "addressType");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "publicKey");
            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "derivePath");
            int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "proxyAddress");
            int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "eoaAddress");
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            while (sQLiteStatementPrepare.step()) {
                java.lang.String text = sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow);
                if (linkedHashMap.containsKey(text)) {
                    list3 = (java.util.List) linkedHashMap.get(text);
                } else {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    linkedHashMap.put(text, arrayList);
                    list3 = arrayList;
                }
                if (!sQLiteStatementPrepare.isNull(columnIndexOrThrow2) || !sQLiteStatementPrepare.isNull(columnIndexOrThrow3) || !sQLiteStatementPrepare.isNull(columnIndexOrThrow4) || !sQLiteStatementPrepare.isNull(columnIndexOrThrow5) || !sQLiteStatementPrepare.isNull(columnIndexOrThrow6) || !sQLiteStatementPrepare.isNull(columnIndexOrThrow7) || !sQLiteStatementPrepare.isNull(columnIndexOrThrow8) || !sQLiteStatementPrepare.isNull(columnIndexOrThrow9)) {
                    list3.add(new ChainAddressEntity(sQLiteStatementPrepare.isNull(columnIndexOrThrow2) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow2), sQLiteStatementPrepare.getLong(columnIndexOrThrow3), sQLiteStatementPrepare.isNull(columnIndexOrThrow4) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow4), (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow5), sQLiteStatementPrepare.isNull(columnIndexOrThrow6) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow6), sQLiteStatementPrepare.isNull(columnIndexOrThrow7) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow7), sQLiteStatementPrepare.isNull(columnIndexOrThrow8) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow8), sQLiteStatementPrepare.isNull(columnIndexOrThrow9) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow9)));
                }
            }
            return linkedHashMap;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    @Override // o.InterfaceC11289cIs
    public java.util.List<WalletEntity> copydefault(final long j, final java.lang.String str) {
        return (java.util.List) DBUtil.performBlocking(this.EZpvd, true, false, new Function1() { // from class: o.cIA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C11290cIt.OLrzqt(j, str, (androidx.sqlite.SQLiteConnection) obj);
            }
        });
    }

    public static /* synthetic */ java.util.List OLrzqt(long j, java.lang.String str, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        java.util.ArrayList arrayList;
        java.lang.String text;
        int i;
        int i2;
        java.lang.String text2;
        int i3;
        java.lang.String text3;
        int i4;
        int i5;
        int i6;
        int i7;
        java.lang.String text4;
        java.lang.String text5;
        int i8;
        int i9;
        int i10;
        java.lang.String text6;
        int i11;
        androidx.sqlite.SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("SELECT * FROM wallet WHERE id IN (SELECT walletId FROM chain_address WHERE chainId = ? AND address = ?)");
        try {
            sQLiteStatementPrepare.mo5793bindLong(1, j);
            if (str == null) {
                sQLiteStatementPrepare.mo5794bindNull(2);
            } else {
                sQLiteStatementPrepare.mo5795bindText(2, str);
            }
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "id");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "type");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "data");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "chainId");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "language");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "name");
            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "modifiedName");
            int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "backup");
            int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "cloudBackup");
            int columnIndexOrThrow10 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "iHuaweiBackup");
            int columnIndexOrThrow11 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "main");
            int columnIndexOrThrow12 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "xpub");
            int columnIndexOrThrow13 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "xpriv");
            int columnIndexOrThrow14 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "isSegWit");
            int columnIndexOrThrow15 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "fromCreate");
            int columnIndexOrThrow16 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "createAt");
            int columnIndexOrThrow17 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "orderValue");
            int columnIndexOrThrow18 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "rootWalletId");
            int columnIndexOrThrow19 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "addressIndex");
            int columnIndexOrThrow20 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "syncStatus");
            int columnIndexOrThrow21 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "completedSyncOperation");
            int columnIndexOrThrow22 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "syncOperation");
            int columnIndexOrThrow23 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "eoaWalletType");
            int columnIndexOrThrow24 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "aaWalletStatus");
            int columnIndexOrThrow25 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "createVersion");
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            while (sQLiteStatementPrepare.step()) {
                if (sQLiteStatementPrepare.isNull(columnIndexOrThrow)) {
                    i = columnIndexOrThrow14;
                    arrayList = arrayList2;
                    text = null;
                } else {
                    arrayList = arrayList2;
                    text = sQLiteStatementPrepare.getText(columnIndexOrThrow);
                    i = columnIndexOrThrow14;
                }
                int i12 = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow2);
                java.lang.String text7 = sQLiteStatementPrepare.isNull(columnIndexOrThrow3) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow3);
                long j2 = sQLiteStatementPrepare.getLong(columnIndexOrThrow4);
                java.lang.String text8 = sQLiteStatementPrepare.isNull(columnIndexOrThrow5) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow5);
                if (sQLiteStatementPrepare.isNull(columnIndexOrThrow6)) {
                    i3 = columnIndexOrThrow2;
                    i2 = columnIndexOrThrow3;
                    text2 = null;
                } else {
                    i2 = columnIndexOrThrow3;
                    text2 = sQLiteStatementPrepare.getText(columnIndexOrThrow6);
                    i3 = columnIndexOrThrow2;
                }
                int i13 = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow7);
                int i14 = columnIndexOrThrow4;
                int i15 = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow8);
                int i16 = columnIndexOrThrow5;
                int i17 = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow9);
                int i18 = columnIndexOrThrow6;
                int i19 = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow10);
                int i20 = columnIndexOrThrow7;
                int i21 = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow11);
                java.lang.String text9 = sQLiteStatementPrepare.isNull(columnIndexOrThrow12) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow12);
                if (sQLiteStatementPrepare.isNull(columnIndexOrThrow13)) {
                    i4 = columnIndexOrThrow9;
                    i5 = i;
                    text3 = null;
                } else {
                    text3 = sQLiteStatementPrepare.getText(columnIndexOrThrow13);
                    i4 = columnIndexOrThrow9;
                    i5 = i;
                }
                int i22 = columnIndexOrThrow8;
                int i23 = (int) sQLiteStatementPrepare.getLong(i5);
                int i24 = columnIndexOrThrow15;
                int i25 = columnIndexOrThrow10;
                int i26 = columnIndexOrThrow11;
                int i27 = (int) sQLiteStatementPrepare.getLong(i24);
                int i28 = columnIndexOrThrow16;
                long j3 = sQLiteStatementPrepare.getLong(i28);
                int i29 = columnIndexOrThrow;
                int i30 = columnIndexOrThrow17;
                int i31 = columnIndexOrThrow12;
                int i32 = (int) sQLiteStatementPrepare.getLong(i30);
                int i33 = columnIndexOrThrow18;
                if (sQLiteStatementPrepare.isNull(i33)) {
                    i6 = i33;
                    i7 = columnIndexOrThrow13;
                    text4 = null;
                } else {
                    i6 = i33;
                    i7 = columnIndexOrThrow13;
                    text4 = sQLiteStatementPrepare.getText(i33);
                }
                int i34 = columnIndexOrThrow19;
                int i35 = (int) sQLiteStatementPrepare.getLong(i34);
                int i36 = columnIndexOrThrow20;
                int i37 = (int) sQLiteStatementPrepare.getLong(i36);
                int i38 = columnIndexOrThrow21;
                if (sQLiteStatementPrepare.isNull(i38)) {
                    i8 = i34;
                    i9 = columnIndexOrThrow22;
                    text5 = null;
                } else {
                    text5 = sQLiteStatementPrepare.getText(i38);
                    i8 = i34;
                    i9 = columnIndexOrThrow22;
                }
                if (sQLiteStatementPrepare.isNull(i9)) {
                    columnIndexOrThrow22 = i9;
                    i10 = i38;
                    i11 = columnIndexOrThrow23;
                    text6 = null;
                } else {
                    i10 = i38;
                    text6 = sQLiteStatementPrepare.getText(i9);
                    columnIndexOrThrow22 = i9;
                    i11 = columnIndexOrThrow23;
                }
                int i39 = columnIndexOrThrow24;
                int i40 = columnIndexOrThrow25;
                int i41 = i11;
                WalletEntity walletEntity = new WalletEntity(text, i12, text7, j2, text8, text2, i13, i15, i17, i19, i21, text9, text3, i23, i27, j3, i32, text4, i35, i37, text5, text6, (int) sQLiteStatementPrepare.getLong(i11), (int) sQLiteStatementPrepare.getLong(i39), sQLiteStatementPrepare.isNull(i40) ? null : sQLiteStatementPrepare.getText(i40));
                java.util.ArrayList arrayList3 = arrayList;
                arrayList3.add(walletEntity);
                columnIndexOrThrow10 = i25;
                columnIndexOrThrow = i29;
                columnIndexOrThrow14 = i5;
                columnIndexOrThrow15 = i24;
                columnIndexOrThrow24 = i39;
                columnIndexOrThrow20 = i36;
                columnIndexOrThrow23 = i41;
                columnIndexOrThrow8 = i22;
                columnIndexOrThrow3 = i2;
                columnIndexOrThrow4 = i14;
                columnIndexOrThrow5 = i16;
                columnIndexOrThrow6 = i18;
                columnIndexOrThrow7 = i20;
                columnIndexOrThrow9 = i4;
                columnIndexOrThrow11 = i26;
                columnIndexOrThrow16 = i28;
                columnIndexOrThrow13 = i7;
                columnIndexOrThrow25 = i40;
                columnIndexOrThrow18 = i6;
                columnIndexOrThrow12 = i31;
                columnIndexOrThrow17 = i30;
                columnIndexOrThrow19 = i8;
                columnIndexOrThrow21 = i10;
                int i42 = i3;
                arrayList2 = arrayList3;
                columnIndexOrThrow2 = i42;
            }
            return arrayList2;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    @Override // o.InterfaceC11289cIs
    public java.lang.Object EZpvd(final java.util.List<java.lang.Long> list, Continuation<? super java.util.List<cII>> continuation) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("SELECT chainId, address FROM chain_address WHERE chainId in (");
        StringUtil.appendPlaceholders(sb, list.size());
        sb.append(")");
        final java.lang.String string = sb.toString();
        return DBUtil.performSuspending(this.EZpvd, true, false, new Function1() { // from class: o.cIF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C11290cIt.copydefault(string, list, (androidx.sqlite.SQLiteConnection) obj);
            }
        }, continuation);
    }

    public static /* synthetic */ java.util.List copydefault(java.lang.String str, java.util.List list, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        androidx.sqlite.SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare(str);
        try {
            java.util.Iterator it = list.iterator();
            int i = 1;
            while (it.hasNext()) {
                java.lang.Long l = (java.lang.Long) it.next();
                if (l == null) {
                    sQLiteStatementPrepare.mo5794bindNull(i);
                } else {
                    sQLiteStatementPrepare.mo5793bindLong(i, l.longValue());
                }
                i++;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            while (sQLiteStatementPrepare.step()) {
                arrayList.add(new cII(sQLiteStatementPrepare.getLong(0), sQLiteStatementPrepare.isNull(1) ? null : sQLiteStatementPrepare.getText(1)));
            }
            return arrayList;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    @Override // o.InterfaceC11289cIs
    public java.util.List<ChainAddressSegWitEntity> AEQbTJ(final java.lang.String str, final long j, final int i) {
        return (java.util.List) DBUtil.performBlocking(this.EZpvd, true, false, new Function1() { // from class: o.cIG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C11290cIt.copydefault(str, j, i, (androidx.sqlite.SQLiteConnection) obj);
            }
        });
    }

    public static /* synthetic */ java.util.List copydefault(java.lang.String str, long j, int i, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        androidx.sqlite.SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("SELECT * FROM chain_address_segwit WHERE walletId =? AND chainId =? AND addressType =?");
        try {
            if (str == null) {
                sQLiteStatementPrepare.mo5794bindNull(1);
            } else {
                sQLiteStatementPrepare.mo5795bindText(1, str);
            }
            sQLiteStatementPrepare.mo5793bindLong(2, j);
            sQLiteStatementPrepare.mo5793bindLong(3, i);
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "walletId");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "chainId");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "addressType");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, WalletSearchRequest.SEARCH_SOURCE_ADDRESS);
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "publicKey");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "derivePath");
            java.util.ArrayList arrayList = new java.util.ArrayList();
            while (sQLiteStatementPrepare.step()) {
                arrayList.add(new ChainAddressSegWitEntity(sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow), sQLiteStatementPrepare.getLong(columnIndexOrThrow2), (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow3), sQLiteStatementPrepare.isNull(columnIndexOrThrow4) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow4), sQLiteStatementPrepare.isNull(columnIndexOrThrow5) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow5), sQLiteStatementPrepare.isNull(columnIndexOrThrow6) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow6)));
            }
            return arrayList;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    @Override // o.InterfaceC11289cIs
    public java.lang.Object EZpvd(final java.util.List<java.lang.String> list, final java.util.List<java.lang.Long> list2, final java.util.List<java.lang.Integer> list3, Continuation<? super java.util.Map<java.lang.String, ? extends java.util.List<ChainAddressSegWitEntity>>> continuation) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("SELECT * FROM chain_address_segwit WHERE walletId in (");
        final int size = list.size();
        StringUtil.appendPlaceholders(sb, size);
        sb.append(") AND chainId IN (");
        final int size2 = list2.size();
        StringUtil.appendPlaceholders(sb, size2);
        sb.append(") AND addressType IN (");
        StringUtil.appendPlaceholders(sb, list3.size());
        sb.append(")");
        final java.lang.String string = sb.toString();
        return DBUtil.performSuspending(this.EZpvd, true, false, new Function1() { // from class: o.cIJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C11290cIt.KWHzl(string, list, size, list2, size2, list3, (androidx.sqlite.SQLiteConnection) obj);
            }
        }, continuation);
    }

    public static /* synthetic */ java.util.Map KWHzl(java.lang.String str, java.util.List list, int i, java.util.List list2, int i2, java.util.List list3, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        java.util.List list4;
        androidx.sqlite.SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare(str);
        try {
            java.util.Iterator it = list.iterator();
            int i3 = 1;
            while (it.hasNext()) {
                java.lang.String str2 = (java.lang.String) it.next();
                if (str2 == null) {
                    sQLiteStatementPrepare.mo5794bindNull(i3);
                } else {
                    sQLiteStatementPrepare.mo5795bindText(i3, str2);
                }
                i3++;
            }
            int i4 = i + 1;
            java.util.Iterator it2 = list2.iterator();
            int i5 = i4;
            while (it2.hasNext()) {
                java.lang.Long l = (java.lang.Long) it2.next();
                if (l == null) {
                    sQLiteStatementPrepare.mo5794bindNull(i5);
                } else {
                    sQLiteStatementPrepare.mo5793bindLong(i5, l.longValue());
                }
                i5++;
            }
            int i6 = i4 + i2;
            java.util.Iterator it3 = list3.iterator();
            while (it3.hasNext()) {
                if (((java.lang.Integer) it3.next()) == null) {
                    sQLiteStatementPrepare.mo5794bindNull(i6);
                } else {
                    sQLiteStatementPrepare.mo5793bindLong(i6, r4.intValue());
                }
                i6++;
            }
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "walletId");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "walletId");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "chainId");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "addressType");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, WalletSearchRequest.SEARCH_SOURCE_ADDRESS);
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "publicKey");
            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "derivePath");
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            while (sQLiteStatementPrepare.step()) {
                java.lang.String text = sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow);
                if (linkedHashMap.containsKey(text)) {
                    list4 = (java.util.List) linkedHashMap.get(text);
                } else {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    linkedHashMap.put(text, arrayList);
                    list4 = arrayList;
                }
                if (!sQLiteStatementPrepare.isNull(columnIndexOrThrow2) || !sQLiteStatementPrepare.isNull(columnIndexOrThrow3) || !sQLiteStatementPrepare.isNull(columnIndexOrThrow4) || !sQLiteStatementPrepare.isNull(columnIndexOrThrow5) || !sQLiteStatementPrepare.isNull(columnIndexOrThrow6) || !sQLiteStatementPrepare.isNull(columnIndexOrThrow7)) {
                    list4.add(new ChainAddressSegWitEntity(sQLiteStatementPrepare.isNull(columnIndexOrThrow2) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow2), sQLiteStatementPrepare.getLong(columnIndexOrThrow3), (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow4), sQLiteStatementPrepare.isNull(columnIndexOrThrow5) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow5), sQLiteStatementPrepare.isNull(columnIndexOrThrow6) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow6), sQLiteStatementPrepare.isNull(columnIndexOrThrow7) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow7)));
                }
            }
            return linkedHashMap;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    @Override // o.InterfaceC11289cIs
    public java.lang.Object OLrzqt(final java.util.List<java.lang.String> list, Continuation<? super java.util.Map<java.lang.String, ? extends java.util.List<EOSInfoEntity>>> continuation) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("SELECT * FROM EOSInfo WHERE walletId IN (");
        StringUtil.appendPlaceholders(sb, list.size());
        sb.append(")");
        final java.lang.String string = sb.toString();
        return DBUtil.performSuspending(this.EZpvd, true, false, new Function1() { // from class: o.cIC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C11290cIt.EZpvd(string, list, (androidx.sqlite.SQLiteConnection) obj);
            }
        }, continuation);
    }

    public static /* synthetic */ java.util.Map EZpvd(java.lang.String str, java.util.List list, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        java.util.List list2;
        androidx.sqlite.SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare(str);
        try {
            java.util.Iterator it = list.iterator();
            int i = 1;
            while (it.hasNext()) {
                java.lang.String str2 = (java.lang.String) it.next();
                if (str2 == null) {
                    sQLiteStatementPrepare.mo5794bindNull(i);
                } else {
                    sQLiteStatementPrepare.mo5795bindText(i, str2);
                }
                i++;
            }
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "walletId");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "walletId");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "accountName");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "state");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "pubKey");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "activeKey");
            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "ownerKey");
            int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "shouldBeDeleted");
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            while (sQLiteStatementPrepare.step()) {
                java.lang.String text = sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow);
                if (linkedHashMap.containsKey(text)) {
                    list2 = (java.util.List) linkedHashMap.get(text);
                } else {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    linkedHashMap.put(text, arrayList);
                    list2 = arrayList;
                }
                if (!sQLiteStatementPrepare.isNull(columnIndexOrThrow2) || !sQLiteStatementPrepare.isNull(columnIndexOrThrow3) || !sQLiteStatementPrepare.isNull(columnIndexOrThrow4) || !sQLiteStatementPrepare.isNull(columnIndexOrThrow5) || !sQLiteStatementPrepare.isNull(columnIndexOrThrow6) || !sQLiteStatementPrepare.isNull(columnIndexOrThrow7) || !sQLiteStatementPrepare.isNull(columnIndexOrThrow8)) {
                    int i2 = columnIndexOrThrow;
                    int i3 = columnIndexOrThrow3;
                    list2.add(new EOSInfoEntity(sQLiteStatementPrepare.isNull(columnIndexOrThrow2) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow2), sQLiteStatementPrepare.isNull(columnIndexOrThrow3) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow3), (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow4), sQLiteStatementPrepare.isNull(columnIndexOrThrow5) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow5), sQLiteStatementPrepare.isNull(columnIndexOrThrow6) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow6), sQLiteStatementPrepare.isNull(columnIndexOrThrow7) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow7), (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow8)));
                    columnIndexOrThrow = i2;
                    columnIndexOrThrow3 = i3;
                }
            }
            return linkedHashMap;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    public static java.util.List<java.lang.Class<?>> AEQbTJ() {
        return Collections.emptyList();
    }
}
