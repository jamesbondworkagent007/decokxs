package o;

/* JADX INFO: loaded from: classes23.dex */
public final class rTN {
    public static final rTN KWHzl = new rTN();

    private rTN() {
    }

    public final boolean OLrzqt() {
        android.nfc.NfcAdapter defaultAdapter = android.nfc.NfcAdapter.getDefaultAdapter(C32979mnm.EZpvd.OLrzqt());
        if (defaultAdapter != null) {
            return defaultAdapter.isEnabled();
        }
        return false;
    }
}
