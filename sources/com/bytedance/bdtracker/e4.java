package com.bytedance.bdtracker;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.content.Context;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes2.dex */
public class e4 extends g4 {
    public final AccountManager c;
    public Account d;
    public final ConcurrentHashMap<String, String> e = new ConcurrentHashMap<>();
    public final d f;

    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Account f165a;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public a(Account account) {
            this.f165a = account;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // java.lang.Runnable
        public void run() {
            try {
                if (e4.this.e.size() > 0) {
                    e4 e4Var = e4.this;
                    if (e4Var.c == null) {
                        return;
                    }
                    for (Map.Entry<String, String> entry : e4Var.e.entrySet()) {
                        if (entry != null) {
                            e4.this.c.setUserData(this.f165a, entry.getKey(), entry.getValue());
                        }
                    }
                    e4.this.e.clear();
                }
            } catch (Throwable th) {
                e4.this.f.D.error(Collections.singletonList("AccountCacheHelper"), "Set account failed", th, new Object[0]);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public e4(d dVar, Context context) {
        this.f = dVar;
        this.c = AccountManager.get(context);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void a(Account account) {
        if (account != null) {
            this.d = account;
            if (this.e.size() <= 0) {
                return;
            }
            this.b.post(new a(account));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.bytedance.bdtracker.g4
    public void a(String str, String str2) {
        Account account = this.d;
        if (account == null) {
            this.e.put(str, str2);
            return;
        }
        if (str == null || str2 == null) {
            return;
        }
        try {
            this.c.setUserData(account, str, str2);
        } catch (Throwable th) {
            this.f.D.error(Collections.singletonList("AccountCacheHelper"), "Set user data failed", th, new Object[0]);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.bytedance.bdtracker.g4
    public String b(String str) {
        Account account = this.d;
        if (account == null) {
            return this.e.get(str);
        }
        try {
            return this.c.getUserData(account, str);
        } catch (Throwable th) {
            this.f.D.error(Collections.singletonList("AccountCacheHelper"), "Get user data failed", th, new Object[0]);
            return null;
        }
    }

    @Override // com.bytedance.bdtracker.g4
    public void a(String str) {
        AccountManager accountManager;
        this.e.remove(str);
        try {
            Account account = this.d;
            if (account != null && (accountManager = this.c) != null) {
                accountManager.setUserData(account, str, null);
            }
        } catch (Throwable unused) {
        }
        g4 g4Var = this.f179a;
        if (g4Var != null) {
            g4Var.a(str);
        }
    }
}
