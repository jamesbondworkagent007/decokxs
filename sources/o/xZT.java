package o;

/* JADX INFO: loaded from: classes12.dex */
public final class xZT {
    public static final xZT EZpvd = new xZT();
    public static final java.util.HashSet<java.lang.String> OLrzqt;
    public static final int copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.HashSet<java.lang.String> copydefault() {
        return OLrzqt;
    }

    private xZT() {
    }

    static {
        java.util.HashSet<java.lang.String> hashSet = new java.util.HashSet<>();
        OLrzqt = hashSet;
        hashSet.add("wallet/home/nft");
        hashSet.add("wallet/home/approvals");
        hashSet.add("wallet/home/mpcBackupTip");
        hashSet.add("wallet/home/batchCreateAccount");
        hashSet.add("wallet/home/multiTransfer");
        hashSet.add("wallet/home/eip7702Upgrade");
        hashSet.add("wallet/hardware/ledger");
        hashSet.add("wallet/hardware/onekey");
        copydefault = 8;
    }
}
