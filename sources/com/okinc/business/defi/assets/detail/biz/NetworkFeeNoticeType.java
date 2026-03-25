package com.okinc.business.defi.assets.detail.biz;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class NetworkFeeNoticeType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ NetworkFeeNoticeType[] $VALUES;
    public static final NetworkFeeNoticeType NOTICE_TYPE_NONE = new NetworkFeeNoticeType("NOTICE_TYPE_NONE", 0);
    public static final NetworkFeeNoticeType NOTICE_TYPE_TRANSACTION_FEE = new NetworkFeeNoticeType("NOTICE_TYPE_TRANSACTION_FEE", 1);
    public static final NetworkFeeNoticeType NOTICE_TYPE_NETWORK_FEE = new NetworkFeeNoticeType("NOTICE_TYPE_NETWORK_FEE", 2);
    public static final NetworkFeeNoticeType NOTICE_TYPE_NEGATIVE_FEE = new NetworkFeeNoticeType("NOTICE_TYPE_NEGATIVE_FEE", 3);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ NetworkFeeNoticeType[] $values() {
        return new NetworkFeeNoticeType[]{NOTICE_TYPE_NONE, NOTICE_TYPE_TRANSACTION_FEE, NOTICE_TYPE_NETWORK_FEE, NOTICE_TYPE_NEGATIVE_FEE};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<NetworkFeeNoticeType> getEntries() {
        return $ENTRIES;
    }

    private NetworkFeeNoticeType(String str, int i) {
    }

    static {
        NetworkFeeNoticeType[] networkFeeNoticeTypeArr$values = $values();
        $VALUES = networkFeeNoticeTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(networkFeeNoticeTypeArr$values);
    }

    public static NetworkFeeNoticeType valueOf(String str) {
        return (NetworkFeeNoticeType) Enum.valueOf(NetworkFeeNoticeType.class, str);
    }

    public static NetworkFeeNoticeType[] values() {
        return (NetworkFeeNoticeType[]) $VALUES.clone();
    }
}
