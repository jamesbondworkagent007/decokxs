package com.bytedance.bdtracker;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes14.dex */
public class j2 extends q1 {
    public final Context e;
    public final d f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public j2(d dVar, Context context) {
        super(true, false);
        this.f = dVar;
        this.e = context;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.bytedance.bdtracker.q1
    public String a() {
        return "SigHash";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.bytedance.bdtracker.q1
    public boolean a(JSONObject jSONObject) throws JSONException {
        PackageInfo packageInfoA;
        Signature[] signatureArr;
        Signature signature;
        String strA = null;
        try {
            Context context = this.e;
            packageInfoA = j5.a(context, context.getPackageName(), 64);
        } catch (Throwable th) {
            this.f.D.error("Get package info failed", th, new Object[0]);
            packageInfoA = null;
        }
        if (packageInfoA != null && (signatureArr = packageInfoA.signatures) != null && signatureArr.length > 0 && (signature = signatureArr[0]) != null) {
            strA = e5.a(signature.toByteArray());
        }
        if (strA == null) {
            return true;
        }
        jSONObject.put("sig_hash", strA);
        return true;
    }
}
