package o;

import com.okinc.okrisk.OKRiskPayloadManager;
import java.util.LinkedList;
import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: renamed from: o.thZ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public class C46988thZ {
    public final java.lang.Object KWHzl = new java.lang.Object();
    public final LinkedList<byte[]> copydefault = new LinkedList<>();

    public C46988thZ(android.content.Context context, boolean z) {
        if (!z) {
            OLrzqt(context);
        } else {
            EZpvd(context);
        }
    }

    public void KWHzl(android.content.Context context, byte[] bArr) {
        synchronized (this.KWHzl) {
            OKRiskPayloadManager oKRiskPayloadManager = OKRiskPayloadManager.copydefault;
            if (!oKRiskPayloadManager.AuCTelauCTel()) {
                if (this.copydefault.size() >= 30) {
                    this.copydefault.removeFirst();
                }
                this.copydefault.addLast(bArr);
                AEQbTJ(context);
            } else {
                copydefault(context);
                oKRiskPayloadManager.DbNXlk();
            }
        }
    }

    public final void AEQbTJ(android.content.Context context) {
        android.content.SharedPreferences sharedPreferences = context.getSharedPreferences("ByteArrayQueuePrefs", 0);
        JSONArray jSONArray = new JSONArray();
        java.util.Iterator<byte[]> it = this.copydefault.iterator();
        while (it.hasNext()) {
            jSONArray.put(android.util.Base64.encodeToString(it.next(), 0));
        }
        sharedPreferences.edit().putString("byte_array_queue", jSONArray.toString()).apply();
    }

    public final void OLrzqt(android.content.Context context) {
        java.lang.String string = context.getSharedPreferences("ByteArrayQueuePrefs", 0).getString("byte_array_queue", null);
        if (string != null) {
            synchronized (this.KWHzl) {
                try {
                    JSONArray jSONArray = new JSONArray(string);
                    this.copydefault.clear();
                    for (int i = 0; i < jSONArray.length(); i++) {
                        this.copydefault.add(android.util.Base64.decode(jSONArray.getString(i), 0));
                    }
                } catch (JSONException e) {
                    e.printStackTrace();
                    this.copydefault.clear();
                }
            }
        }
    }

    public void EZpvd(android.content.Context context) {
        synchronized (this.KWHzl) {
            copydefault(context);
        }
    }

    public final void copydefault(android.content.Context context) {
        this.copydefault.clear();
        AEQbTJ(context);
    }

    public int AEQbTJ() {
        int size;
        synchronized (this.KWHzl) {
            size = this.copydefault.size();
        }
        return size;
    }

    public byte[] KWHzl() {
        byte[] bArr;
        synchronized (this.KWHzl) {
            java.util.Iterator<byte[]> it = this.copydefault.iterator();
            int length = 0;
            while (it.hasNext()) {
                length += it.next().length;
            }
            bArr = new byte[length];
            int length2 = 0;
            for (byte[] bArr2 : this.copydefault) {
                java.lang.System.arraycopy(bArr2, 0, bArr, length2, bArr2.length);
                length2 += bArr2.length;
            }
        }
        return bArr;
    }
}
