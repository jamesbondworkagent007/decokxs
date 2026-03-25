package o;

import com.okinc.okex.center.bean.ContextualScenarios;
import com.okinc.okex.center.bean.FullRecentActivityPageDataV2;
import com.okinc.okex.center.bean.HasMoreTransactions;
import com.okinc.okex.center.bean.MoreTransactionListV2Response;
import com.okinc.okex.center.bean.SelfServiceTools;
import com.okinc.okex.center.bean.TransactionBeanV2;
import com.okinc.okex.center.bean.TransactionListV2Response;
import com.okinc.okex.center.bean.TxnContextualModel;
import com.okinc.okex.center.bean.enums.TransactionType;
import com.okinc.okex.center.ui.displaymodels.TransactionDisplayModelV2;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.sei, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C44851sei {

    /* JADX INFO: renamed from: o.sei$Activity */
    public final /* synthetic */ class Activity {
        public static final /* synthetic */ int[] copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[TransactionType.values().length];
            try {
                iArr[TransactionType.Deposit.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[TransactionType.Withdrawal.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[TransactionType.P2P.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            copydefault = iArr;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x0163  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final FullRecentActivityPageDataV2 KWHzl(@NotNull TransactionListV2Response transactionListV2Response) {
        java.util.Map mapKWHzl;
        java.util.Map mapKWHzl2;
        java.lang.Boolean boolValueOf;
        SelfServiceTools selfServiceTools;
        TxnContextualModel p2p;
        java.util.List<TransactionBeanV2> p2p2;
        Intrinsics.checkNotNullParameter(transactionListV2Response, "");
        TransactionType[] transactionTypeArrValues = TransactionType.values();
        LinkedHashMap linkedHashMap = new LinkedHashMap(C56548yJl.copydefault(C56423yEv.copydefault(transactionTypeArrValues.length), 16));
        int length = transactionTypeArrValues.length;
        int i = 0;
        while (true) {
            mapKWHzl = null;
            arrayList = null;
            arrayList = null;
            arrayList = null;
            java.util.ArrayList arrayList = null;
            if (i >= length) {
                break;
            }
            TransactionType transactionType = transactionTypeArrValues[i];
            int i2 = Activity.copydefault[transactionType.ordinal()];
            if (i2 == 1) {
                java.util.List<TransactionBeanV2> deposit = transactionListV2Response.getDeposit();
                if (deposit != null) {
                    arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(deposit, 10));
                    java.util.Iterator<T> it = deposit.iterator();
                    while (it.hasNext()) {
                        arrayList.add(C45070sip.EZpvd((TransactionBeanV2) it.next()));
                    }
                }
            } else if (i2 == 2) {
                java.util.List<TransactionBeanV2> withdraw = transactionListV2Response.getWithdraw();
                if (withdraw != null) {
                    arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(withdraw, 10));
                    java.util.Iterator<T> it2 = withdraw.iterator();
                    while (it2.hasNext()) {
                        arrayList.add(C45070sip.EZpvd((TransactionBeanV2) it2.next()));
                    }
                }
            } else if (i2 == 3 && (p2p2 = transactionListV2Response.getP2p()) != null) {
                arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(p2p2, 10));
                java.util.Iterator<T> it3 = p2p2.iterator();
                while (it3.hasNext()) {
                    arrayList.add(C45070sip.EZpvd((TransactionBeanV2) it3.next()));
                }
            }
            linkedHashMap.put(transactionType, arrayList);
            i++;
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            if (((java.util.List) entry.getValue()) != null) {
                linkedHashMap2.put(entry.getKey(), entry.getValue());
            }
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(C56423yEv.copydefault(linkedHashMap2.size()));
        for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
            java.lang.Object key = entry2.getKey();
            java.lang.Object value = entry2.getValue();
            Intrinsics.copydefault(value, "");
            linkedHashMap3.put(key, (java.util.List) value);
        }
        ContextualScenarios contextualScenarios = transactionListV2Response.getContextualScenarios();
        if (contextualScenarios != null) {
            TransactionType[] transactionTypeArrValues2 = TransactionType.values();
            LinkedHashMap linkedHashMap4 = new LinkedHashMap(C56548yJl.copydefault(C56423yEv.copydefault(transactionTypeArrValues2.length), 16));
            for (TransactionType transactionType2 : transactionTypeArrValues2) {
                int i3 = Activity.copydefault[transactionType2.ordinal()];
                if (i3 == 1) {
                    TxnContextualModel deposit2 = contextualScenarios.getDeposit();
                    if (deposit2 != null) {
                        selfServiceTools = deposit2.getSelfServiceTools();
                    }
                } else if (i3 != 2) {
                    selfServiceTools = (i3 == 3 && (p2p = contextualScenarios.getP2p()) != null) ? p2p.getSelfServiceTools() : null;
                } else {
                    TxnContextualModel withdraw2 = contextualScenarios.getWithdraw();
                    if (withdraw2 != null) {
                        selfServiceTools = withdraw2.getSelfServiceTools();
                    }
                }
                linkedHashMap4.put(transactionType2, selfServiceTools);
            }
            LinkedHashMap linkedHashMap5 = new LinkedHashMap();
            for (Map.Entry entry3 : linkedHashMap4.entrySet()) {
                if (((SelfServiceTools) entry3.getValue()) != null) {
                    linkedHashMap5.put(entry3.getKey(), entry3.getValue());
                }
            }
            mapKWHzl2 = new LinkedHashMap(C56423yEv.copydefault(linkedHashMap5.size()));
            for (Map.Entry entry4 : linkedHashMap5.entrySet()) {
                java.lang.Object key2 = entry4.getKey();
                java.lang.Object value2 = entry4.getValue();
                Intrinsics.copydefault(value2, "");
                mapKWHzl2.put(key2, (SelfServiceTools) value2);
            }
        } else {
            mapKWHzl2 = null;
        }
        if (mapKWHzl2 == null) {
            mapKWHzl2 = C56424yEw.KWHzl();
        }
        HasMoreTransactions hasMore = transactionListV2Response.getHasMore();
        if (hasMore != null) {
            TransactionType[] transactionTypeArrValues3 = TransactionType.values();
            LinkedHashMap linkedHashMap6 = new LinkedHashMap(C56548yJl.copydefault(C56423yEv.copydefault(transactionTypeArrValues3.length), 16));
            for (TransactionType transactionType3 : transactionTypeArrValues3) {
                int i4 = Activity.copydefault[transactionType3.ordinal()];
                if (i4 == 1) {
                    boolValueOf = java.lang.Boolean.valueOf(hasMore.getDeposit());
                } else if (i4 == 2) {
                    boolValueOf = java.lang.Boolean.valueOf(hasMore.getWithdraw());
                } else {
                    boolValueOf = i4 != 3 ? null : java.lang.Boolean.valueOf(hasMore.getP2p());
                }
                linkedHashMap6.put(transactionType3, boolValueOf);
            }
            LinkedHashMap linkedHashMap7 = new LinkedHashMap();
            for (Map.Entry entry5 : linkedHashMap6.entrySet()) {
                if (((java.lang.Boolean) entry5.getValue()) != null) {
                    linkedHashMap7.put(entry5.getKey(), entry5.getValue());
                }
            }
            mapKWHzl = new LinkedHashMap(C56423yEv.copydefault(linkedHashMap7.size()));
            for (Map.Entry entry6 : linkedHashMap7.entrySet()) {
                java.lang.Object key3 = entry6.getKey();
                java.lang.Object value3 = entry6.getValue();
                Intrinsics.copydefault(value3, "");
                mapKWHzl.put(key3, java.lang.Boolean.valueOf(((java.lang.Boolean) value3).booleanValue()));
            }
        }
        if (mapKWHzl == null) {
            mapKWHzl = C56424yEw.KWHzl();
        }
        java.lang.Integer pastNumberOfDays = transactionListV2Response.getPastNumberOfDays();
        return new FullRecentActivityPageDataV2(pastNumberOfDays != null ? pastNumberOfDays.intValue() : 0, linkedHashMap3, mapKWHzl2, mapKWHzl);
    }

    public static final kotlin.Pair<java.lang.Boolean, java.util.List<TransactionDisplayModelV2>> copydefault(@NotNull MoreTransactionListV2Response moreTransactionListV2Response) {
        java.util.Collection collectionAhwBna;
        Intrinsics.checkNotNullParameter(moreTransactionListV2Response, "");
        java.util.List<TransactionBeanV2> list = moreTransactionListV2Response.getList();
        if (list == null) {
            collectionAhwBna = yDY.AhwBna();
        } else {
            collectionAhwBna = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
            java.util.Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                collectionAhwBna.add(C45070sip.EZpvd((TransactionBeanV2) it.next()));
            }
        }
        return new kotlin.Pair<>(java.lang.Boolean.valueOf(moreTransactionListV2Response.getHasMore()), collectionAhwBna);
    }
}
