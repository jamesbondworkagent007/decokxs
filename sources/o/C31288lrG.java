package o;

import androidx.room.EntityInsertAdapter;
import androidx.room.RoomDatabase;
import androidx.room.util.DBUtil;
import androidx.room.util.SQLiteConnectionUtil;
import androidx.room.util.SQLiteStatementUtil;
import com.okinc.business.web3pay.lib.core.model.PagingData;
import com.okinc.business.web3pay.lib.features.transactionhistory.datasource.local.model.PayOrderCacheEntity;
import com.okinc.business.web3pay.lib.features.transactionhistory.datasource.local.model.PayOrderEntity;
import com.okinc.business.web3pay.lib.features.transactionhistory.datasource.local.model.PendingClaimOrderCacheEntity;
import com.okinc.business.web3pay.lib.features.transactionhistory.datasource.local.model.PendingClaimOrderEntity;
import com.okinc.business.web3pay.lib.features.transactionhistory.datasource.local.model.TransactionOrderCacheEntity;
import com.okinc.business.web3pay.lib.features.transactionhistory.datasource.local.model.TransactionOrderEntity;
import com.okinc.business.web3pay.lib.features.transactionhistory.datasource.local.model.TransactionOrderForTokenCacheEntity;
import com.okinc.business.web3pay.lib.features.transactionhistory.datasource.local.model.TransactionOrderForTokenEntity;
import com.okinc.business.web3pay.lib.features.transactionhistory.datasource.remote.http.model.PayOrderApiModel;
import com.okinc.business.web3pay.lib.features.transactionhistory.datasource.remote.http.model.PendingClaimOrderApiModel;
import com.okinc.business.web3pay.lib.features.transactionhistory.datasource.remote.http.model.PendingClaimOrderResponse;
import com.reown.foundation.util.jwt.JwtUtilsKt;
import java.util.Collections;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import o.InterfaceC31289lrH;

/* JADX INFO: renamed from: o.lrG, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C31288lrG implements InterfaceC31289lrH {
    public final EntityInsertAdapter<PayOrderCacheEntity> AEQbTJ;
    public final EntityInsertAdapter<TransactionOrderForTokenEntity> AYXKKw;
    public final EntityInsertAdapter<PayOrderEntity> EZpvd;
    public final RoomDatabase KWHzl;
    public final EntityInsertAdapter<PendingClaimOrderEntity> OLrzqt;
    public final EntityInsertAdapter<PendingClaimOrderCacheEntity> copydefault;
    public final EntityInsertAdapter<TransactionOrderForTokenCacheEntity> djBIcL;
    public final EntityInsertAdapter<TransactionOrderEntity> gEmmrt;
    public final EntityInsertAdapter<TransactionOrderCacheEntity> valueOf;

    @Override // o.InterfaceC31289lrH
    public java.lang.Object OLrzqt(final PayOrderCacheEntity payOrderCacheEntity, Continuation<? super java.lang.Long> continuation) {
        payOrderCacheEntity.getClass();
        return DBUtil.performSuspending(this.KWHzl, false, true, new Function1() { // from class: o.lso
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return this.copydefault.AEQbTJ(payOrderCacheEntity, (androidx.sqlite.SQLiteConnection) obj);
            }
        }, continuation);
    }

    public final /* synthetic */ java.lang.Long AEQbTJ(PayOrderCacheEntity payOrderCacheEntity, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        return java.lang.Long.valueOf(this.AEQbTJ.insertAndReturnId(sQLiteConnection, payOrderCacheEntity));
    }

    @Override // o.InterfaceC31289lrH
    public java.lang.Object AEQbTJ(final java.util.List<PayOrderEntity> list, Continuation<? super java.util.List<java.lang.Long>> continuation) {
        list.getClass();
        return DBUtil.performSuspending(this.KWHzl, false, true, new Function1() { // from class: o.lsa
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return this.AEQbTJ.OLrzqt(list, (androidx.sqlite.SQLiteConnection) obj);
            }
        }, continuation);
    }

    public final /* synthetic */ java.util.List OLrzqt(java.util.List list, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        return this.EZpvd.insertAndReturnIdsList(sQLiteConnection, list);
    }

    @Override // o.InterfaceC31289lrH
    public java.lang.Object copydefault(final PendingClaimOrderCacheEntity pendingClaimOrderCacheEntity, Continuation<? super java.lang.Long> continuation) {
        pendingClaimOrderCacheEntity.getClass();
        return DBUtil.performSuspending(this.KWHzl, false, true, new Function1() { // from class: o.lsb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return this.AEQbTJ.KWHzl(pendingClaimOrderCacheEntity, (androidx.sqlite.SQLiteConnection) obj);
            }
        }, continuation);
    }

    public final /* synthetic */ java.lang.Long KWHzl(PendingClaimOrderCacheEntity pendingClaimOrderCacheEntity, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        return java.lang.Long.valueOf(this.copydefault.insertAndReturnId(sQLiteConnection, pendingClaimOrderCacheEntity));
    }

    @Override // o.InterfaceC31289lrH
    public java.lang.Object OLrzqt(final java.util.List<PendingClaimOrderEntity> list, Continuation<? super java.util.List<java.lang.Long>> continuation) {
        list.getClass();
        return DBUtil.performSuspending(this.KWHzl, false, true, new Function1() { // from class: o.lrP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return this.KWHzl.copydefault(list, (androidx.sqlite.SQLiteConnection) obj);
            }
        }, continuation);
    }

    public final /* synthetic */ java.util.List copydefault(java.util.List list, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        return this.OLrzqt.insertAndReturnIdsList(sQLiteConnection, list);
    }

    @Override // o.InterfaceC31289lrH
    public java.lang.Object AEQbTJ(final TransactionOrderForTokenCacheEntity transactionOrderForTokenCacheEntity, Continuation<? super java.lang.Long> continuation) {
        transactionOrderForTokenCacheEntity.getClass();
        return DBUtil.performSuspending(this.KWHzl, false, true, new Function1() { // from class: o.lse
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return this.copydefault.KWHzl(transactionOrderForTokenCacheEntity, (androidx.sqlite.SQLiteConnection) obj);
            }
        }, continuation);
    }

    public final /* synthetic */ java.lang.Long KWHzl(TransactionOrderForTokenCacheEntity transactionOrderForTokenCacheEntity, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        return java.lang.Long.valueOf(this.djBIcL.insertAndReturnId(sQLiteConnection, transactionOrderForTokenCacheEntity));
    }

    @Override // o.InterfaceC31289lrH
    public java.lang.Object copydefault(final java.util.List<TransactionOrderForTokenEntity> list, Continuation<? super java.util.List<java.lang.Long>> continuation) {
        list.getClass();
        return DBUtil.performSuspending(this.KWHzl, false, true, new Function1() { // from class: o.lsi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return this.copydefault.AEQbTJ(list, (androidx.sqlite.SQLiteConnection) obj);
            }
        }, continuation);
    }

    public final /* synthetic */ java.util.List AEQbTJ(java.util.List list, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        return this.AYXKKw.insertAndReturnIdsList(sQLiteConnection, list);
    }

    @Override // o.InterfaceC31289lrH
    public java.lang.Object EZpvd(final java.util.List<TransactionOrderEntity> list, Continuation<? super java.util.List<java.lang.Long>> continuation) {
        list.getClass();
        return DBUtil.performSuspending(this.KWHzl, false, true, new Function1() { // from class: o.lrT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return this.OLrzqt.EZpvd(list, (androidx.sqlite.SQLiteConnection) obj);
            }
        }, continuation);
    }

    public final /* synthetic */ java.util.List EZpvd(java.util.List list, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        return this.gEmmrt.insertAndReturnIdsList(sQLiteConnection, list);
    }

    @Override // o.InterfaceC31289lrH
    public java.lang.Object EZpvd(final TransactionOrderCacheEntity transactionOrderCacheEntity, Continuation<? super java.lang.Long> continuation) {
        transactionOrderCacheEntity.getClass();
        return DBUtil.performSuspending(this.KWHzl, false, true, new Function1() { // from class: o.lrN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return this.AEQbTJ.OLrzqt(transactionOrderCacheEntity, (androidx.sqlite.SQLiteConnection) obj);
            }
        }, continuation);
    }

    public final /* synthetic */ java.lang.Long OLrzqt(TransactionOrderCacheEntity transactionOrderCacheEntity, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        return java.lang.Long.valueOf(this.valueOf.insertAndReturnId(sQLiteConnection, transactionOrderCacheEntity));
    }

    @Override // o.InterfaceC31289lrH
    public java.lang.Object copydefault(Continuation<? super Unit> continuation) {
        return DBUtil.performInTransactionSuspending(this.KWHzl, new Function1() { // from class: o.lst
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return this.KWHzl.valueOf((Continuation) obj);
            }
        }, continuation);
    }

    public final /* synthetic */ java.lang.Object valueOf(Continuation continuation) {
        return InterfaceC31289lrH.Application.AEQbTJ(this, continuation);
    }

    @Override // o.InterfaceC31289lrH
    public java.lang.Object OLrzqt(final java.lang.String str, Continuation<? super PagingData<PayOrderApiModel>> continuation) {
        return DBUtil.performInTransactionSuspending(this.KWHzl, new Function1() { // from class: o.lrY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return this.OLrzqt.DbNXlk(str, (Continuation) obj);
            }
        }, continuation);
    }

    public final /* synthetic */ java.lang.Object DbNXlk(java.lang.String str, Continuation continuation) {
        return InterfaceC31289lrH.Application.OLrzqt(this, str, continuation);
    }

    @Override // o.InterfaceC31289lrH
    public java.lang.Object djBIcL(final java.lang.String str, Continuation<? super PendingClaimOrderResponse> continuation) {
        return DBUtil.performInTransactionSuspending(this.KWHzl, new Function1() { // from class: o.lsm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return this.AEQbTJ.values(str, (Continuation) obj);
            }
        }, continuation);
    }

    public final /* synthetic */ java.lang.Object values(java.lang.String str, Continuation continuation) {
        return InterfaceC31289lrH.Application.copydefault(this, str, continuation);
    }

    @Override // o.InterfaceC31289lrH
    public java.lang.Object OLrzqt(final java.lang.String str, final java.lang.String str2, final java.lang.String str3, Continuation<? super PagingData<C31381lsu>> continuation) {
        return DBUtil.performInTransactionSuspending(this.KWHzl, new Function1() { // from class: o.lss
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return this.copydefault.AEQbTJ(str, str2, str3, (Continuation) obj);
            }
        }, continuation);
    }

    public final /* synthetic */ java.lang.Object AEQbTJ(java.lang.String str, java.lang.String str2, java.lang.String str3, Continuation continuation) {
        return InterfaceC31289lrH.Application.AEQbTJ(this, str, str2, str3, (Continuation<? super PagingData<C31381lsu>>) continuation);
    }

    @Override // o.InterfaceC31289lrH
    public java.lang.Object AkhnZx(final java.lang.String str, Continuation<? super PagingData<C31381lsu>> continuation) {
        return DBUtil.performInTransactionSuspending(this.KWHzl, new Function1() { // from class: o.lrQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return this.EZpvd.fetchVPNInfo(str, (Continuation) obj);
            }
        }, continuation);
    }

    public final /* synthetic */ java.lang.Object fetchVPNInfo(java.lang.String str, Continuation continuation) {
        return InterfaceC31289lrH.Application.EZpvd(this, str, continuation);
    }

    @Override // o.InterfaceC31289lrH
    public java.lang.Object AEQbTJ(final java.lang.String str, final java.util.List<TransactionOrderEntity> list, final java.lang.String str2, Continuation<? super Unit> continuation) {
        return DBUtil.performInTransactionSuspending(this.KWHzl, new Function1() { // from class: o.lsq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return this.AEQbTJ.copydefault(str, list, str2, (Continuation) obj);
            }
        }, continuation);
    }

    public final /* synthetic */ java.lang.Object copydefault(java.lang.String str, java.util.List list, java.lang.String str2, Continuation continuation) {
        return InterfaceC31289lrH.Application.AEQbTJ(this, str, (java.util.List<TransactionOrderEntity>) list, str2, (Continuation<? super Unit>) continuation);
    }

    @Override // o.InterfaceC31289lrH
    public java.lang.Object KWHzl(final java.lang.String str, final java.util.List<PayOrderEntity> list, final java.lang.String str2, Continuation<? super Unit> continuation) {
        return DBUtil.performInTransactionSuspending(this.KWHzl, new Function1() { // from class: o.lsk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return this.OLrzqt.EZpvd(str, list, str2, (Continuation) obj);
            }
        }, continuation);
    }

    public final /* synthetic */ java.lang.Object EZpvd(java.lang.String str, java.util.List list, java.lang.String str2, Continuation continuation) {
        return InterfaceC31289lrH.Application.copydefault(this, str, list, str2, continuation);
    }

    @Override // o.InterfaceC31289lrH
    public java.lang.Object KWHzl(final java.lang.String str, final java.util.List<PendingClaimOrderEntity> list, final java.lang.String str2, final java.lang.String str3, Continuation<? super Unit> continuation) {
        return DBUtil.performInTransactionSuspending(this.KWHzl, new Function1() { // from class: o.lrI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return this.OLrzqt.OLrzqt(str, list, str2, str3, (Continuation) obj);
            }
        }, continuation);
    }

    public final /* synthetic */ java.lang.Object OLrzqt(java.lang.String str, java.util.List list, java.lang.String str2, java.lang.String str3, Continuation continuation) {
        return InterfaceC31289lrH.Application.KWHzl(this, str, list, str2, str3, continuation);
    }

    @Override // o.InterfaceC31289lrH
    public java.lang.Object EZpvd(final java.lang.String str, final java.lang.String str2, final java.lang.String str3, final java.util.List<TransactionOrderForTokenEntity> list, final java.lang.String str4, Continuation<? super Unit> continuation) {
        return DBUtil.performInTransactionSuspending(this.KWHzl, new Function1() { // from class: o.lrM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return this.copydefault.AEQbTJ(str, str2, str3, list, str4, (Continuation) obj);
            }
        }, continuation);
    }

    public final /* synthetic */ java.lang.Object AEQbTJ(java.lang.String str, java.lang.String str2, java.lang.String str3, java.util.List list, java.lang.String str4, Continuation continuation) {
        return InterfaceC31289lrH.Application.OLrzqt(this, str, str2, str3, list, str4, continuation);
    }

    @Override // o.InterfaceC31289lrH
    public java.lang.Object AEQbTJ(final java.lang.String str, Continuation<? super PayOrderCacheEntity> continuation) {
        return DBUtil.performSuspending(this.KWHzl, true, false, new Function1() { // from class: o.lsj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C31288lrG.isConnected(str, (androidx.sqlite.SQLiteConnection) obj);
            }
        }, continuation);
    }

    public static /* synthetic */ PayOrderCacheEntity isConnected(java.lang.String str, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        androidx.sqlite.SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("SELECT * FROM pay_order_cache WHERE `key` = ?");
        try {
            if (str == null) {
                sQLiteStatementPrepare.mo5794bindNull(1);
            } else {
                sQLiteStatementPrepare.mo5795bindText(1, str);
            }
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, JwtUtilsKt.DID_METHOD_KEY);
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "nextCursor");
            PayOrderCacheEntity payOrderCacheEntity = null;
            java.lang.String text = null;
            if (sQLiteStatementPrepare.step()) {
                java.lang.String text2 = sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow);
                if (!sQLiteStatementPrepare.isNull(columnIndexOrThrow2)) {
                    text = sQLiteStatementPrepare.getText(columnIndexOrThrow2);
                }
                payOrderCacheEntity = new PayOrderCacheEntity(text2, text);
            }
            return payOrderCacheEntity;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    @Override // o.InterfaceC31289lrH
    public java.lang.Object AYXKKw(final java.lang.String str, Continuation<? super java.util.List<PayOrderEntity>> continuation) {
        return DBUtil.performSuspending(this.KWHzl, true, false, new Function1() { // from class: o.lsg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C31288lrG.values(str, (androidx.sqlite.SQLiteConnection) obj);
            }
        }, continuation);
    }

    public static /* synthetic */ java.util.List values(java.lang.String str, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        int i;
        java.util.ArrayList arrayList;
        java.lang.String text;
        int i2;
        int i3;
        java.lang.String text2;
        int i4;
        java.lang.String text3;
        int i5;
        java.lang.String text4;
        int i6;
        int i7;
        int i8;
        int i9;
        java.lang.Integer numValueOf;
        androidx.sqlite.SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("SELECT * FROM pay_order WHERE `key` = ? ORDER BY `index` ASC");
        try {
            if (str == null) {
                sQLiteStatementPrepare.mo5794bindNull(1);
            } else {
                sQLiteStatementPrepare.mo5795bindText(1, str);
            }
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, JwtUtilsKt.DID_METHOD_KEY);
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "index");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "orderId");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "orderType");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "chainIndex");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "tokenSymbol");
            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "tokenAddress");
            int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "tokenAmount");
            int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "currencyAmount");
            int columnIndexOrThrow10 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "tokenDecimal");
            int columnIndexOrThrow11 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "from");
            int columnIndexOrThrow12 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "to");
            int columnIndexOrThrow13 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "areaCode");
            int columnIndexOrThrow14 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "status");
            int columnIndexOrThrow15 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "createTime");
            int columnIndexOrThrow16 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "receiverType");
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            while (sQLiteStatementPrepare.step()) {
                if (sQLiteStatementPrepare.isNull(columnIndexOrThrow)) {
                    i = columnIndexOrThrow;
                    i2 = columnIndexOrThrow14;
                    arrayList = arrayList2;
                    text = null;
                } else {
                    i = columnIndexOrThrow;
                    arrayList = arrayList2;
                    text = sQLiteStatementPrepare.getText(columnIndexOrThrow);
                    i2 = columnIndexOrThrow14;
                }
                int i10 = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow2);
                if (sQLiteStatementPrepare.isNull(columnIndexOrThrow3)) {
                    i4 = columnIndexOrThrow2;
                    i3 = columnIndexOrThrow3;
                    text2 = null;
                } else {
                    i3 = columnIndexOrThrow3;
                    text2 = sQLiteStatementPrepare.getText(columnIndexOrThrow3);
                    i4 = columnIndexOrThrow2;
                }
                int i11 = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow4);
                java.lang.String text5 = sQLiteStatementPrepare.isNull(columnIndexOrThrow5) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow5);
                java.lang.String text6 = sQLiteStatementPrepare.isNull(columnIndexOrThrow6) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow6);
                java.lang.String text7 = sQLiteStatementPrepare.isNull(columnIndexOrThrow7) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow7);
                java.lang.String text8 = sQLiteStatementPrepare.isNull(columnIndexOrThrow8) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow8);
                if (sQLiteStatementPrepare.isNull(columnIndexOrThrow9)) {
                    i5 = columnIndexOrThrow4;
                    text3 = null;
                } else {
                    text3 = sQLiteStatementPrepare.getText(columnIndexOrThrow9);
                    i5 = columnIndexOrThrow4;
                }
                int i12 = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow10);
                java.lang.String text9 = sQLiteStatementPrepare.isNull(columnIndexOrThrow11) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow11);
                java.lang.String text10 = sQLiteStatementPrepare.isNull(columnIndexOrThrow12) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow12);
                if (sQLiteStatementPrepare.isNull(columnIndexOrThrow13)) {
                    i6 = columnIndexOrThrow6;
                    i7 = i2;
                    text4 = null;
                } else {
                    text4 = sQLiteStatementPrepare.getText(columnIndexOrThrow13);
                    i6 = columnIndexOrThrow6;
                    i7 = i2;
                }
                int i13 = columnIndexOrThrow5;
                int i14 = (int) sQLiteStatementPrepare.getLong(i7);
                int i15 = columnIndexOrThrow15;
                long j = sQLiteStatementPrepare.getLong(i15);
                int i16 = i7;
                int i17 = columnIndexOrThrow16;
                if (sQLiteStatementPrepare.isNull(i17)) {
                    i9 = columnIndexOrThrow7;
                    numValueOf = null;
                    i8 = i15;
                } else {
                    i8 = i15;
                    i9 = columnIndexOrThrow7;
                    numValueOf = java.lang.Integer.valueOf((int) sQLiteStatementPrepare.getLong(i17));
                }
                PayOrderEntity payOrderEntity = new PayOrderEntity(text, new PayOrderApiModel(text2, i11, text5, text6, text7, text8, text3, i12, text9, text10, text4, i14, j, numValueOf), i10);
                java.util.ArrayList arrayList3 = arrayList;
                arrayList3.add(payOrderEntity);
                columnIndexOrThrow14 = i16;
                columnIndexOrThrow7 = i9;
                columnIndexOrThrow16 = i17;
                columnIndexOrThrow2 = i4;
                columnIndexOrThrow5 = i13;
                columnIndexOrThrow15 = i8;
                columnIndexOrThrow3 = i3;
                columnIndexOrThrow4 = i5;
                columnIndexOrThrow6 = i6;
                arrayList2 = arrayList3;
                columnIndexOrThrow = i;
            }
            return arrayList2;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    @Override // o.InterfaceC31289lrH
    public java.lang.Object AhwBna(final java.lang.String str, Continuation<? super PendingClaimOrderCacheEntity> continuation) {
        return DBUtil.performSuspending(this.KWHzl, true, false, new Function1() { // from class: o.lrZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C31288lrG.AkhnZx(str, (androidx.sqlite.SQLiteConnection) obj);
            }
        }, continuation);
    }

    public static /* synthetic */ PendingClaimOrderCacheEntity AkhnZx(java.lang.String str, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        androidx.sqlite.SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("SELECT * FROM pending_claim_order_cache WHERE `key` = ?");
        try {
            if (str == null) {
                sQLiteStatementPrepare.mo5794bindNull(1);
            } else {
                sQLiteStatementPrepare.mo5795bindText(1, str);
            }
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, JwtUtilsKt.DID_METHOD_KEY);
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "nextCursor");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "total");
            PendingClaimOrderCacheEntity pendingClaimOrderCacheEntity = null;
            java.lang.String text = null;
            if (sQLiteStatementPrepare.step()) {
                java.lang.String text2 = sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow);
                java.lang.String text3 = sQLiteStatementPrepare.isNull(columnIndexOrThrow2) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow2);
                if (!sQLiteStatementPrepare.isNull(columnIndexOrThrow3)) {
                    text = sQLiteStatementPrepare.getText(columnIndexOrThrow3);
                }
                pendingClaimOrderCacheEntity = new PendingClaimOrderCacheEntity(text2, text3, text);
            }
            return pendingClaimOrderCacheEntity;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    @Override // o.InterfaceC31289lrH
    public java.lang.Object gEmmrt(final java.lang.String str, Continuation<? super java.util.List<PendingClaimOrderEntity>> continuation) {
        return DBUtil.performSuspending(this.KWHzl, true, false, new Function1() { // from class: o.lsh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C31288lrG.AuCTel(str, (androidx.sqlite.SQLiteConnection) obj);
            }
        }, continuation);
    }

    public static /* synthetic */ java.util.List AuCTel(java.lang.String str, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        int i;
        java.util.ArrayList arrayList;
        java.lang.String text;
        int i2;
        int i3;
        java.lang.String text2;
        int i4;
        java.lang.String text3;
        int i5;
        androidx.sqlite.SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("SELECT * FROM pending_claim_order WHERE `key` = ? ORDER BY `index` ASC");
        try {
            if (str == null) {
                sQLiteStatementPrepare.mo5794bindNull(1);
            } else {
                sQLiteStatementPrepare.mo5795bindText(1, str);
            }
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, JwtUtilsKt.DID_METHOD_KEY);
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "index");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "orderId");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "from");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "avatar");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "comment");
            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "tokenLogo");
            int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "chainIndex");
            int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "tokenAmount");
            int columnIndexOrThrow10 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "tokenDecimal");
            int columnIndexOrThrow11 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "tokenSymbol");
            int columnIndexOrThrow12 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "tokenAddress");
            int columnIndexOrThrow13 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "usdAmount");
            int columnIndexOrThrow14 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "createTime");
            int columnIndexOrThrow15 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "uid");
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            while (sQLiteStatementPrepare.step()) {
                if (sQLiteStatementPrepare.isNull(columnIndexOrThrow)) {
                    i = columnIndexOrThrow;
                    i2 = columnIndexOrThrow14;
                    arrayList = arrayList2;
                    text = null;
                } else {
                    i = columnIndexOrThrow;
                    arrayList = arrayList2;
                    text = sQLiteStatementPrepare.getText(columnIndexOrThrow);
                    i2 = columnIndexOrThrow14;
                }
                int i6 = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow2);
                java.lang.String text4 = sQLiteStatementPrepare.isNull(columnIndexOrThrow3) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow3);
                java.lang.String text5 = sQLiteStatementPrepare.isNull(columnIndexOrThrow4) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow4);
                java.lang.String text6 = sQLiteStatementPrepare.isNull(columnIndexOrThrow5) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow5);
                java.lang.String text7 = sQLiteStatementPrepare.isNull(columnIndexOrThrow6) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow6);
                java.lang.String text8 = sQLiteStatementPrepare.isNull(columnIndexOrThrow7) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow7);
                java.lang.String text9 = sQLiteStatementPrepare.isNull(columnIndexOrThrow8) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow8);
                if (sQLiteStatementPrepare.isNull(columnIndexOrThrow9)) {
                    i4 = columnIndexOrThrow2;
                    i3 = columnIndexOrThrow3;
                    text2 = null;
                } else {
                    i3 = columnIndexOrThrow3;
                    text2 = sQLiteStatementPrepare.getText(columnIndexOrThrow9);
                    i4 = columnIndexOrThrow2;
                }
                int i7 = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow10);
                java.lang.String text10 = sQLiteStatementPrepare.isNull(columnIndexOrThrow11) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow11);
                java.lang.String text11 = sQLiteStatementPrepare.isNull(columnIndexOrThrow12) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow12);
                if (sQLiteStatementPrepare.isNull(columnIndexOrThrow13)) {
                    i5 = i2;
                    text3 = null;
                } else {
                    text3 = sQLiteStatementPrepare.getText(columnIndexOrThrow13);
                    i5 = i2;
                }
                long j = sQLiteStatementPrepare.getLong(i5);
                int i8 = i5;
                int i9 = columnIndexOrThrow15;
                columnIndexOrThrow15 = i9;
                PendingClaimOrderEntity pendingClaimOrderEntity = new PendingClaimOrderEntity(text, new PendingClaimOrderApiModel(text4, text5, text6, text7, text8, text9, text2, i7, text10, text11, text3, j, sQLiteStatementPrepare.isNull(i9) ? null : sQLiteStatementPrepare.getText(i9)), i6);
                java.util.ArrayList arrayList3 = arrayList;
                arrayList3.add(pendingClaimOrderEntity);
                columnIndexOrThrow2 = i4;
                columnIndexOrThrow14 = i8;
                columnIndexOrThrow3 = i3;
                arrayList2 = arrayList3;
                columnIndexOrThrow = i;
            }
            return arrayList2;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    @Override // o.InterfaceC31289lrH
    public java.lang.Object copydefault(final java.lang.String str, final java.lang.String str2, final java.lang.String str3, Continuation<? super TransactionOrderForTokenCacheEntity> continuation) {
        return DBUtil.performSuspending(this.KWHzl, true, false, new Function1() { // from class: o.lrK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C31288lrG.KWHzl(str, str2, str3, (androidx.sqlite.SQLiteConnection) obj);
            }
        }, continuation);
    }

    public static /* synthetic */ TransactionOrderForTokenCacheEntity KWHzl(java.lang.String str, java.lang.String str2, java.lang.String str3, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        androidx.sqlite.SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("SELECT * FROM transaction_order_for_token_cache WHERE `key` = ? AND chainIndex = ? AND tokenCoinTypeNo = ?");
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
            if (str3 == null) {
                sQLiteStatementPrepare.mo5794bindNull(3);
            } else {
                sQLiteStatementPrepare.mo5795bindText(3, str3);
            }
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, JwtUtilsKt.DID_METHOD_KEY);
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "chainIndex");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "tokenCoinTypeNo");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "nextCursor");
            TransactionOrderForTokenCacheEntity transactionOrderForTokenCacheEntity = null;
            java.lang.String text = null;
            if (sQLiteStatementPrepare.step()) {
                java.lang.String text2 = sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow);
                java.lang.String text3 = sQLiteStatementPrepare.isNull(columnIndexOrThrow2) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow2);
                java.lang.String text4 = sQLiteStatementPrepare.isNull(columnIndexOrThrow3) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow3);
                if (!sQLiteStatementPrepare.isNull(columnIndexOrThrow4)) {
                    text = sQLiteStatementPrepare.getText(columnIndexOrThrow4);
                }
                transactionOrderForTokenCacheEntity = new TransactionOrderForTokenCacheEntity(text2, text3, text4, text);
            }
            return transactionOrderForTokenCacheEntity;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    @Override // o.InterfaceC31289lrH
    public java.lang.Object EZpvd(final java.lang.String str, final java.lang.String str2, final java.lang.String str3, Continuation<? super java.util.List<TransactionOrderForTokenEntity>> continuation) {
        return DBUtil.performSuspending(this.KWHzl, true, false, new Function1() { // from class: o.lrX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C31288lrG.gEmmrt(str, str2, str3, (androidx.sqlite.SQLiteConnection) obj);
            }
        }, continuation);
    }

    public static /* synthetic */ java.util.List gEmmrt(java.lang.String str, java.lang.String str2, java.lang.String str3, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        int i;
        java.lang.String text;
        int i2;
        java.lang.String text2;
        int i3;
        java.lang.String text3;
        int i4;
        int i5;
        java.lang.String text4;
        int i6;
        int i7;
        java.lang.String text5;
        java.lang.String text6;
        int i8;
        java.lang.String text7;
        int i9;
        int i10;
        java.lang.Integer numValueOf;
        int i11;
        int i12;
        java.lang.Integer numValueOf2;
        int i13;
        java.lang.String text8;
        int i14;
        androidx.sqlite.SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("SELECT * FROM transaction_order_for_token WHERE `key` = ? AND requestChainIndex = ? AND requestTokenCoinTypeNo = ? ORDER BY `index` ASC");
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
            if (str3 == null) {
                sQLiteStatementPrepare.mo5794bindNull(3);
            } else {
                sQLiteStatementPrepare.mo5795bindText(3, str3);
            }
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, JwtUtilsKt.DID_METHOD_KEY);
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "requestChainIndex");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "requestTokenCoinTypeNo");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "index");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "orderId");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "orderType");
            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "merchantId");
            int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "productCode");
            int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "tokenSymbol");
            int columnIndexOrThrow10 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "tokenDecimal");
            int columnIndexOrThrow11 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "chainIndex");
            int columnIndexOrThrow12 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "tokenAddress");
            int columnIndexOrThrow13 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "tokenAmount");
            int columnIndexOrThrow14 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "currencyAmount");
            int columnIndexOrThrow15 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "from");
            int columnIndexOrThrow16 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "to");
            int columnIndexOrThrow17 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "areaCode");
            int columnIndexOrThrow18 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "status");
            int columnIndexOrThrow19 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "createTime");
            int columnIndexOrThrow20 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "receiverType");
            int columnIndexOrThrow21 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "subStatus");
            int columnIndexOrThrow22 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "tokenCoinTypeNo");
            int columnIndexOrThrow23 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "convertInfo");
            java.util.ArrayList arrayList = new java.util.ArrayList();
            while (sQLiteStatementPrepare.step()) {
                java.lang.String text9 = sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow);
                java.lang.String text10 = sQLiteStatementPrepare.isNull(columnIndexOrThrow2) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow2);
                if (sQLiteStatementPrepare.isNull(columnIndexOrThrow3)) {
                    i2 = columnIndexOrThrow;
                    i = columnIndexOrThrow2;
                    text = null;
                } else {
                    i = columnIndexOrThrow2;
                    text = sQLiteStatementPrepare.getText(columnIndexOrThrow3);
                    i2 = columnIndexOrThrow;
                }
                int i15 = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow4);
                if (sQLiteStatementPrepare.isNull(columnIndexOrThrow5)) {
                    i3 = columnIndexOrThrow3;
                    text2 = null;
                } else {
                    text2 = sQLiteStatementPrepare.getText(columnIndexOrThrow5);
                    i3 = columnIndexOrThrow3;
                }
                int i16 = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow6);
                java.lang.String text11 = sQLiteStatementPrepare.isNull(columnIndexOrThrow7) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow7);
                java.lang.String text12 = sQLiteStatementPrepare.isNull(columnIndexOrThrow8) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow8);
                if (sQLiteStatementPrepare.isNull(columnIndexOrThrow9)) {
                    i4 = columnIndexOrThrow4;
                    i5 = columnIndexOrThrow5;
                    text3 = null;
                } else {
                    text3 = sQLiteStatementPrepare.getText(columnIndexOrThrow9);
                    i4 = columnIndexOrThrow4;
                    i5 = columnIndexOrThrow5;
                }
                int i17 = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow10);
                java.lang.String text13 = sQLiteStatementPrepare.isNull(columnIndexOrThrow11) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow11);
                java.lang.String text14 = sQLiteStatementPrepare.isNull(columnIndexOrThrow12) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow12);
                java.lang.String text15 = sQLiteStatementPrepare.isNull(columnIndexOrThrow13) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow13);
                if (sQLiteStatementPrepare.isNull(columnIndexOrThrow14)) {
                    i6 = columnIndexOrThrow15;
                    text4 = null;
                } else {
                    text4 = sQLiteStatementPrepare.getText(columnIndexOrThrow14);
                    i6 = columnIndexOrThrow15;
                }
                if (sQLiteStatementPrepare.isNull(i6)) {
                    i7 = i4;
                    text5 = null;
                } else {
                    i7 = i4;
                    text5 = sQLiteStatementPrepare.getText(i6);
                }
                int i18 = columnIndexOrThrow16;
                if (sQLiteStatementPrepare.isNull(i18)) {
                    columnIndexOrThrow16 = i18;
                    text6 = null;
                } else {
                    columnIndexOrThrow16 = i18;
                    text6 = sQLiteStatementPrepare.getText(i18);
                }
                int i19 = columnIndexOrThrow17;
                if (sQLiteStatementPrepare.isNull(i19)) {
                    columnIndexOrThrow17 = i19;
                    i8 = i6;
                    text7 = null;
                } else {
                    columnIndexOrThrow17 = i19;
                    i8 = i6;
                    text7 = sQLiteStatementPrepare.getText(i19);
                }
                int i20 = columnIndexOrThrow18;
                int i21 = columnIndexOrThrow6;
                int i22 = (int) sQLiteStatementPrepare.getLong(i20);
                int i23 = columnIndexOrThrow19;
                long j = sQLiteStatementPrepare.getLong(i23);
                int i24 = columnIndexOrThrow20;
                if (sQLiteStatementPrepare.isNull(i24)) {
                    i9 = i23;
                    i10 = columnIndexOrThrow7;
                    i11 = columnIndexOrThrow21;
                    numValueOf = null;
                } else {
                    i9 = i23;
                    i10 = columnIndexOrThrow7;
                    numValueOf = java.lang.Integer.valueOf((int) sQLiteStatementPrepare.getLong(i24));
                    i11 = columnIndexOrThrow21;
                }
                if (sQLiteStatementPrepare.isNull(i11)) {
                    i12 = columnIndexOrThrow8;
                    i13 = columnIndexOrThrow22;
                    numValueOf2 = null;
                } else {
                    i12 = columnIndexOrThrow8;
                    numValueOf2 = java.lang.Integer.valueOf((int) sQLiteStatementPrepare.getLong(i11));
                    i13 = columnIndexOrThrow22;
                }
                if (sQLiteStatementPrepare.isNull(i13)) {
                    i14 = columnIndexOrThrow23;
                    text8 = null;
                } else {
                    text8 = sQLiteStatementPrepare.getText(i13);
                    i14 = columnIndexOrThrow23;
                }
                int i25 = i11;
                arrayList.add(new TransactionOrderForTokenEntity(text9, text10, text, new C31381lsu(text2, i16, text11, text12, text3, i17, text13, text14, text15, text4, text5, text6, text7, i22, j, numValueOf, numValueOf2, text8, C31376lsp.copydefault.OLrzqt(sQLiteStatementPrepare.isNull(i14) ? null : sQLiteStatementPrepare.getText(i14))), i15));
                columnIndexOrThrow4 = i7;
                columnIndexOrThrow6 = i21;
                columnIndexOrThrow18 = i20;
                columnIndexOrThrow = i2;
                columnIndexOrThrow2 = i;
                columnIndexOrThrow3 = i3;
                columnIndexOrThrow5 = i5;
                columnIndexOrThrow15 = i8;
                columnIndexOrThrow19 = i9;
                columnIndexOrThrow22 = i13;
                columnIndexOrThrow7 = i10;
                columnIndexOrThrow20 = i24;
                columnIndexOrThrow23 = i14;
                columnIndexOrThrow8 = i12;
                columnIndexOrThrow21 = i25;
            }
            return arrayList;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    @Override // o.InterfaceC31289lrH
    public java.lang.Object valueOf(final java.lang.String str, Continuation<? super TransactionOrderCacheEntity> continuation) {
        return DBUtil.performSuspending(this.KWHzl, true, false, new Function1() { // from class: o.lrU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C31288lrG.ejfBZ(str, (androidx.sqlite.SQLiteConnection) obj);
            }
        }, continuation);
    }

    public static /* synthetic */ TransactionOrderCacheEntity ejfBZ(java.lang.String str, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        androidx.sqlite.SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("SELECT * FROM transaction_order_cache WHERE `key` = ?");
        try {
            if (str == null) {
                sQLiteStatementPrepare.mo5794bindNull(1);
            } else {
                sQLiteStatementPrepare.mo5795bindText(1, str);
            }
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, JwtUtilsKt.DID_METHOD_KEY);
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "nextCursor");
            TransactionOrderCacheEntity transactionOrderCacheEntity = null;
            java.lang.String text = null;
            if (sQLiteStatementPrepare.step()) {
                java.lang.String text2 = sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow);
                if (!sQLiteStatementPrepare.isNull(columnIndexOrThrow2)) {
                    text = sQLiteStatementPrepare.getText(columnIndexOrThrow2);
                }
                transactionOrderCacheEntity = new TransactionOrderCacheEntity(text2, text);
            }
            return transactionOrderCacheEntity;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    @Override // o.InterfaceC31289lrH
    public java.lang.Object isConnected(final java.lang.String str, Continuation<? super java.util.List<TransactionOrderEntity>> continuation) {
        return DBUtil.performSuspending(this.KWHzl, true, false, new Function1() { // from class: o.lsf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C31288lrG.fIwbmz(str, (androidx.sqlite.SQLiteConnection) obj);
            }
        }, continuation);
    }

    public static /* synthetic */ java.util.List fIwbmz(java.lang.String str, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        int i;
        java.util.ArrayList arrayList;
        java.lang.String text;
        int i2;
        int i3;
        java.lang.String text2;
        int i4;
        java.lang.String text3;
        int i5;
        java.lang.String text4;
        int i6;
        java.lang.String text5;
        int i7;
        int i8;
        java.lang.String text6;
        int i9;
        int i10;
        java.lang.Integer numValueOf;
        int i11;
        int i12;
        java.lang.Integer numValueOf2;
        int i13;
        java.lang.String text7;
        int i14;
        androidx.sqlite.SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("SELECT * FROM transaction_order WHERE `key` = ? ORDER BY `index` ASC");
        try {
            if (str == null) {
                sQLiteStatementPrepare.mo5794bindNull(1);
            } else {
                sQLiteStatementPrepare.mo5795bindText(1, str);
            }
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, JwtUtilsKt.DID_METHOD_KEY);
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "index");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "orderId");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "orderType");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "merchantId");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "productCode");
            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "tokenSymbol");
            int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "tokenDecimal");
            int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "chainIndex");
            int columnIndexOrThrow10 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "tokenAddress");
            int columnIndexOrThrow11 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "tokenAmount");
            int columnIndexOrThrow12 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "currencyAmount");
            int columnIndexOrThrow13 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "from");
            int columnIndexOrThrow14 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "to");
            int columnIndexOrThrow15 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "areaCode");
            int columnIndexOrThrow16 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "status");
            int columnIndexOrThrow17 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "createTime");
            int columnIndexOrThrow18 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "receiverType");
            int columnIndexOrThrow19 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "subStatus");
            int columnIndexOrThrow20 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "tokenCoinTypeNo");
            int columnIndexOrThrow21 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "convertInfo");
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            while (sQLiteStatementPrepare.step()) {
                if (sQLiteStatementPrepare.isNull(columnIndexOrThrow)) {
                    i = columnIndexOrThrow;
                    i2 = columnIndexOrThrow14;
                    arrayList = arrayList2;
                    text = null;
                } else {
                    i = columnIndexOrThrow;
                    arrayList = arrayList2;
                    text = sQLiteStatementPrepare.getText(columnIndexOrThrow);
                    i2 = columnIndexOrThrow14;
                }
                int i15 = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow2);
                if (sQLiteStatementPrepare.isNull(columnIndexOrThrow3)) {
                    i4 = columnIndexOrThrow2;
                    i3 = columnIndexOrThrow3;
                    text2 = null;
                } else {
                    i3 = columnIndexOrThrow3;
                    text2 = sQLiteStatementPrepare.getText(columnIndexOrThrow3);
                    i4 = columnIndexOrThrow2;
                }
                int i16 = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow4);
                java.lang.String text8 = sQLiteStatementPrepare.isNull(columnIndexOrThrow5) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow5);
                java.lang.String text9 = sQLiteStatementPrepare.isNull(columnIndexOrThrow6) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow6);
                if (sQLiteStatementPrepare.isNull(columnIndexOrThrow7)) {
                    i5 = columnIndexOrThrow4;
                    text3 = null;
                } else {
                    text3 = sQLiteStatementPrepare.getText(columnIndexOrThrow7);
                    i5 = columnIndexOrThrow4;
                }
                int i17 = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow8);
                java.lang.String text10 = sQLiteStatementPrepare.isNull(columnIndexOrThrow9) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow9);
                java.lang.String text11 = sQLiteStatementPrepare.isNull(columnIndexOrThrow10) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow10);
                java.lang.String text12 = sQLiteStatementPrepare.isNull(columnIndexOrThrow11) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow11);
                java.lang.String text13 = sQLiteStatementPrepare.isNull(columnIndexOrThrow12) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow12);
                if (sQLiteStatementPrepare.isNull(columnIndexOrThrow13)) {
                    i6 = i2;
                    text4 = null;
                } else {
                    text4 = sQLiteStatementPrepare.getText(columnIndexOrThrow13);
                    i6 = i2;
                }
                if (sQLiteStatementPrepare.isNull(i6)) {
                    i7 = i6;
                    text5 = null;
                } else {
                    text5 = sQLiteStatementPrepare.getText(i6);
                    i7 = i6;
                }
                int i18 = columnIndexOrThrow15;
                if (sQLiteStatementPrepare.isNull(i18)) {
                    columnIndexOrThrow15 = i18;
                    i8 = columnIndexOrThrow6;
                    text6 = null;
                } else {
                    columnIndexOrThrow15 = i18;
                    i8 = columnIndexOrThrow6;
                    text6 = sQLiteStatementPrepare.getText(i18);
                }
                int i19 = columnIndexOrThrow16;
                int i20 = columnIndexOrThrow5;
                int i21 = (int) sQLiteStatementPrepare.getLong(i19);
                int i22 = columnIndexOrThrow17;
                long j = sQLiteStatementPrepare.getLong(i22);
                int i23 = columnIndexOrThrow18;
                if (sQLiteStatementPrepare.isNull(i23)) {
                    i9 = i22;
                    i10 = columnIndexOrThrow7;
                    i11 = columnIndexOrThrow19;
                    numValueOf = null;
                } else {
                    i9 = i22;
                    i10 = columnIndexOrThrow7;
                    numValueOf = java.lang.Integer.valueOf((int) sQLiteStatementPrepare.getLong(i23));
                    i11 = columnIndexOrThrow19;
                }
                if (sQLiteStatementPrepare.isNull(i11)) {
                    i12 = columnIndexOrThrow8;
                    i13 = columnIndexOrThrow20;
                    numValueOf2 = null;
                } else {
                    i12 = columnIndexOrThrow8;
                    numValueOf2 = java.lang.Integer.valueOf((int) sQLiteStatementPrepare.getLong(i11));
                    i13 = columnIndexOrThrow20;
                }
                if (sQLiteStatementPrepare.isNull(i13)) {
                    i14 = columnIndexOrThrow21;
                    text7 = null;
                } else {
                    text7 = sQLiteStatementPrepare.getText(i13);
                    i14 = columnIndexOrThrow21;
                }
                int i24 = i11;
                TransactionOrderEntity transactionOrderEntity = new TransactionOrderEntity(text, new C31381lsu(text2, i16, text8, text9, text3, i17, text10, text11, text12, text13, text4, text5, text6, i21, j, numValueOf, numValueOf2, text7, C31376lsp.copydefault.OLrzqt(sQLiteStatementPrepare.isNull(i14) ? null : sQLiteStatementPrepare.getText(i14))), i15);
                java.util.ArrayList arrayList3 = arrayList;
                arrayList3.add(transactionOrderEntity);
                columnIndexOrThrow5 = i20;
                columnIndexOrThrow2 = i4;
                columnIndexOrThrow16 = i19;
                columnIndexOrThrow14 = i7;
                columnIndexOrThrow3 = i3;
                columnIndexOrThrow4 = i5;
                columnIndexOrThrow6 = i8;
                columnIndexOrThrow17 = i9;
                arrayList2 = arrayList3;
                columnIndexOrThrow = i;
                columnIndexOrThrow20 = i13;
                columnIndexOrThrow7 = i10;
                columnIndexOrThrow18 = i23;
                columnIndexOrThrow21 = i14;
                columnIndexOrThrow8 = i12;
                columnIndexOrThrow19 = i24;
            }
            return arrayList2;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    @Override // o.InterfaceC31289lrH
    public java.lang.Object KWHzl(Continuation<? super java.lang.Integer> continuation) {
        return DBUtil.performSuspending(this.KWHzl, false, true, new Function1() { // from class: o.lrV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C31288lrG.valueOf((androidx.sqlite.SQLiteConnection) obj);
            }
        }, continuation);
    }

    public static /* synthetic */ java.lang.Integer valueOf(androidx.sqlite.SQLiteConnection sQLiteConnection) {
        androidx.sqlite.SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("DELETE FROM pay_order_cache");
        try {
            sQLiteStatementPrepare.step();
            int totalChangedRows = SQLiteConnectionUtil.getTotalChangedRows(sQLiteConnection);
            sQLiteStatementPrepare.close();
            return java.lang.Integer.valueOf(totalChangedRows);
        } catch (java.lang.Throwable th) {
            sQLiteStatementPrepare.close();
            throw th;
        }
    }

    @Override // o.InterfaceC31289lrH
    public java.lang.Object AEQbTJ(Continuation<? super java.lang.Integer> continuation) {
        return DBUtil.performSuspending(this.KWHzl, false, true, new Function1() { // from class: o.lsn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C31288lrG.gEmmrt((androidx.sqlite.SQLiteConnection) obj);
            }
        }, continuation);
    }

    public static /* synthetic */ java.lang.Integer gEmmrt(androidx.sqlite.SQLiteConnection sQLiteConnection) {
        androidx.sqlite.SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("DELETE FROM pay_order");
        try {
            sQLiteStatementPrepare.step();
            int totalChangedRows = SQLiteConnectionUtil.getTotalChangedRows(sQLiteConnection);
            sQLiteStatementPrepare.close();
            return java.lang.Integer.valueOf(totalChangedRows);
        } catch (java.lang.Throwable th) {
            sQLiteStatementPrepare.close();
            throw th;
        }
    }

    @Override // o.InterfaceC31289lrH
    public java.lang.Object EZpvd(final java.lang.String str, Continuation<? super java.lang.Integer> continuation) {
        return DBUtil.performSuspending(this.KWHzl, false, true, new Function1() { // from class: o.lrW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C31288lrG.valueOf(str, (androidx.sqlite.SQLiteConnection) obj);
            }
        }, continuation);
    }

    public static /* synthetic */ java.lang.Integer valueOf(java.lang.String str, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        androidx.sqlite.SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("DELETE FROM pay_order WHERE `key` = ?");
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

    @Override // o.InterfaceC31289lrH
    public java.lang.Object gEmmrt(Continuation<? super java.lang.Integer> continuation) {
        return DBUtil.performSuspending(this.KWHzl, false, true, new Function1() { // from class: o.lsl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C31288lrG.fetchVPNInfo((androidx.sqlite.SQLiteConnection) obj);
            }
        }, continuation);
    }

    public static /* synthetic */ java.lang.Integer fetchVPNInfo(androidx.sqlite.SQLiteConnection sQLiteConnection) {
        androidx.sqlite.SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("DELETE FROM transaction_order_cache");
        try {
            sQLiteStatementPrepare.step();
            int totalChangedRows = SQLiteConnectionUtil.getTotalChangedRows(sQLiteConnection);
            sQLiteStatementPrepare.close();
            return java.lang.Integer.valueOf(totalChangedRows);
        } catch (java.lang.Throwable th) {
            sQLiteStatementPrepare.close();
            throw th;
        }
    }

    @Override // o.InterfaceC31289lrH
    public java.lang.Object djBIcL(Continuation<? super java.lang.Integer> continuation) {
        return DBUtil.performSuspending(this.KWHzl, false, true, new Function1() { // from class: o.lrS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C31288lrG.values((androidx.sqlite.SQLiteConnection) obj);
            }
        }, continuation);
    }

    public static /* synthetic */ java.lang.Integer values(androidx.sqlite.SQLiteConnection sQLiteConnection) {
        androidx.sqlite.SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("DELETE FROM transaction_order");
        try {
            sQLiteStatementPrepare.step();
            int totalChangedRows = SQLiteConnectionUtil.getTotalChangedRows(sQLiteConnection);
            sQLiteStatementPrepare.close();
            return java.lang.Integer.valueOf(totalChangedRows);
        } catch (java.lang.Throwable th) {
            sQLiteStatementPrepare.close();
            throw th;
        }
    }

    @Override // o.InterfaceC31289lrH
    public java.lang.Object copydefault(final java.lang.String str, Continuation<? super java.lang.Integer> continuation) {
        return DBUtil.performSuspending(this.KWHzl, false, true, new Function1() { // from class: o.lsc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C31288lrG.DbNXlk(str, (androidx.sqlite.SQLiteConnection) obj);
            }
        }, continuation);
    }

    public static /* synthetic */ java.lang.Integer DbNXlk(java.lang.String str, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        androidx.sqlite.SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("DELETE FROM transaction_order WHERE `key` = ?");
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

    @Override // o.InterfaceC31289lrH
    public java.lang.Object EZpvd(Continuation<? super java.lang.Integer> continuation) {
        return DBUtil.performSuspending(this.KWHzl, false, true, new Function1() { // from class: o.lrR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C31288lrG.DbNXlk((androidx.sqlite.SQLiteConnection) obj);
            }
        }, continuation);
    }

    public static /* synthetic */ java.lang.Integer DbNXlk(androidx.sqlite.SQLiteConnection sQLiteConnection) {
        androidx.sqlite.SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("DELETE FROM pending_claim_order_cache");
        try {
            sQLiteStatementPrepare.step();
            int totalChangedRows = SQLiteConnectionUtil.getTotalChangedRows(sQLiteConnection);
            sQLiteStatementPrepare.close();
            return java.lang.Integer.valueOf(totalChangedRows);
        } catch (java.lang.Throwable th) {
            sQLiteStatementPrepare.close();
            throw th;
        }
    }

    @Override // o.InterfaceC31289lrH
    public java.lang.Object OLrzqt(Continuation<? super java.lang.Integer> continuation) {
        return DBUtil.performSuspending(this.KWHzl, false, true, new Function1() { // from class: o.lsr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C31288lrG.AkhnZx((androidx.sqlite.SQLiteConnection) obj);
            }
        }, continuation);
    }

    public static /* synthetic */ java.lang.Integer AkhnZx(androidx.sqlite.SQLiteConnection sQLiteConnection) {
        androidx.sqlite.SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("DELETE FROM pending_claim_order");
        try {
            sQLiteStatementPrepare.step();
            int totalChangedRows = SQLiteConnectionUtil.getTotalChangedRows(sQLiteConnection);
            sQLiteStatementPrepare.close();
            return java.lang.Integer.valueOf(totalChangedRows);
        } catch (java.lang.Throwable th) {
            sQLiteStatementPrepare.close();
            throw th;
        }
    }

    @Override // o.InterfaceC31289lrH
    public java.lang.Object KWHzl(final java.lang.String str, Continuation<? super java.lang.Integer> continuation) {
        return DBUtil.performSuspending(this.KWHzl, false, true, new Function1() { // from class: o.lrO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C31288lrG.fetchVPNInfo(str, (androidx.sqlite.SQLiteConnection) obj);
            }
        }, continuation);
    }

    public static /* synthetic */ java.lang.Integer fetchVPNInfo(java.lang.String str, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        androidx.sqlite.SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("DELETE FROM pending_claim_order WHERE `key` = ?");
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

    @Override // o.InterfaceC31289lrH
    public java.lang.Object AhwBna(Continuation<? super java.lang.Integer> continuation) {
        return DBUtil.performSuspending(this.KWHzl, false, true, new Function1() { // from class: o.lsd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C31288lrG.isConnected((androidx.sqlite.SQLiteConnection) obj);
            }
        }, continuation);
    }

    public static /* synthetic */ java.lang.Integer isConnected(androidx.sqlite.SQLiteConnection sQLiteConnection) {
        androidx.sqlite.SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("DELETE FROM transaction_order_for_token_cache");
        try {
            sQLiteStatementPrepare.step();
            int totalChangedRows = SQLiteConnectionUtil.getTotalChangedRows(sQLiteConnection);
            sQLiteStatementPrepare.close();
            return java.lang.Integer.valueOf(totalChangedRows);
        } catch (java.lang.Throwable th) {
            sQLiteStatementPrepare.close();
            throw th;
        }
    }

    @Override // o.InterfaceC31289lrH
    public java.lang.Object AYXKKw(Continuation<? super java.lang.Integer> continuation) {
        return DBUtil.performSuspending(this.KWHzl, false, true, new Function1() { // from class: o.lrL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C31288lrG.AuCTel((androidx.sqlite.SQLiteConnection) obj);
            }
        }, continuation);
    }

    public static /* synthetic */ java.lang.Integer AuCTel(androidx.sqlite.SQLiteConnection sQLiteConnection) {
        androidx.sqlite.SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("DELETE FROM transaction_order_for_token");
        try {
            sQLiteStatementPrepare.step();
            int totalChangedRows = SQLiteConnectionUtil.getTotalChangedRows(sQLiteConnection);
            sQLiteStatementPrepare.close();
            return java.lang.Integer.valueOf(totalChangedRows);
        } catch (java.lang.Throwable th) {
            sQLiteStatementPrepare.close();
            throw th;
        }
    }

    @Override // o.InterfaceC31289lrH
    public java.lang.Object KWHzl(final java.lang.String str, final java.lang.String str2, final java.lang.String str3, Continuation<? super java.lang.Integer> continuation) {
        return DBUtil.performSuspending(this.KWHzl, false, true, new Function1() { // from class: o.lrJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C31288lrG.OLrzqt(str, str2, str3, (androidx.sqlite.SQLiteConnection) obj);
            }
        }, continuation);
    }

    public static /* synthetic */ java.lang.Integer OLrzqt(java.lang.String str, java.lang.String str2, java.lang.String str3, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        androidx.sqlite.SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("DELETE FROM transaction_order_for_token WHERE `key` = ? AND requestChainIndex = ? AND requestTokenCoinTypeNo = ?");
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
            if (str3 == null) {
                sQLiteStatementPrepare.mo5794bindNull(3);
            } else {
                sQLiteStatementPrepare.mo5795bindText(3, str3);
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
