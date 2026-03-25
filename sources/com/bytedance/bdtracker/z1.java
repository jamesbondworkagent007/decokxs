package com.bytedance.bdtracker;

import android.accounts.Account;
import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public class z1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile d5 f311a;
    public Account b;
    public e4 c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public d5 a(d dVar, Context context, v1 v1Var) {
        if (this.f311a == null) {
            synchronized (z1.class) {
                if (this.f311a == null) {
                    if (context == null) {
                        throw new IllegalArgumentException("context == null");
                    }
                    if (this.c == null) {
                        this.c = new e4(dVar, context);
                    }
                    if (this.f311a == null) {
                        this.f311a = new d5(dVar, context, v1Var, this.c);
                        if (this.b != null) {
                            this.f311a.a(this.b);
                        }
                    }
                }
            }
        }
        return this.f311a;
    }
}
