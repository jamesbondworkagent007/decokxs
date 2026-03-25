package com.geetest.gtc4;

import android.app.KeyguardManager;
import android.content.Context;
import java.util.Objects;

/* JADX INFO: loaded from: classes21.dex */
public final class x1 implements x4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f531a;
    public final KeyguardManager b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public x1(Context context) {
        this.f531a = context;
        this.b = (KeyguardManager) context.getSystemService("keyguard");
    }

    @Override // com.geetest.gtc4.x4
    public final boolean a() {
        KeyguardManager keyguardManager;
        if (this.f531a == null || (keyguardManager = this.b) == null) {
            return false;
        }
        try {
            Object objInvoke = keyguardManager.getClass().getDeclaredMethod("isSupported", null).invoke(this.b, null);
            Objects.requireNonNull(objInvoke);
            return ((Boolean) objInvoke).booleanValue();
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // com.geetest.gtc4.x4
    public final void a(i3 i3Var) {
        if (this.f531a != null) {
            KeyguardManager keyguardManager = this.b;
            if (keyguardManager == null) {
                new e6("KeyguardManager not found");
                i3Var.b.countDown();
                return;
            }
            try {
                Object objInvoke = keyguardManager.getClass().getDeclaredMethod("obtainOaid", null).invoke(this.b, null);
                if (objInvoke != null) {
                    i3Var.f460a.set(objInvoke.toString());
                    i3Var.b.countDown();
                    return;
                }
                throw new e6("OAID obtain failed");
            } catch (Exception unused) {
            }
        }
    }
}
