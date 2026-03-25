package com.geetest.gtc4;

import android.content.ContentProviderClient;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;

/* JADX INFO: loaded from: classes21.dex */
public final class c6 implements x4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f433a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public c6(Context context) {
        this.f433a = context;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.geetest.gtc4.x4
    public final boolean a() {
        return Build.VERSION.SDK_INT >= 29;
    }

    @Override // com.geetest.gtc4.x4
    public final void a(i3 i3Var) {
        if (this.f433a != null) {
            if (!a()) {
                new e6("Only supports Android 10.0 and above for Nubia");
                i3Var.b.countDown();
                return;
            }
            try {
                ContentProviderClient contentProviderClientAcquireContentProviderClient = this.f433a.getContentResolver().acquireContentProviderClient(Uri.parse("content://cn.nubia.identity/identity"));
                if (contentProviderClientAcquireContentProviderClient == null) {
                    return;
                }
                Bundle bundleCall = contentProviderClientAcquireContentProviderClient.call("getOAID", null, null);
                contentProviderClientAcquireContentProviderClient.close();
                if (bundleCall != null) {
                    String string = bundleCall.getInt("code", -1) == 0 ? bundleCall.getString("id") : null;
                    if (string != null && !string.isEmpty()) {
                        i3Var.f460a.set(string);
                        i3Var.b.countDown();
                        return;
                    } else {
                        throw new e6("OAID query failed: " + bundleCall.getString("message"));
                    }
                }
                throw new e6("OAID query failed: bundle is null");
            } catch (Exception unused) {
                i3Var.b.countDown();
            }
        }
    }
}
