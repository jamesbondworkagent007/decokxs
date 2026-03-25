package com.bytedance.bdtracker;

import android.os.Handler;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes2.dex */
public abstract class g4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public g4 f179a;
    public Handler b;

    public class a implements d<String> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public a() {
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.bdtracker.g4.d
        public String a() {
            return g4.this.b("openudid");
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.bytedance.bdtracker.g4.d
        public boolean b(String str) {
            return r.e(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // com.bytedance.bdtracker.g4.d
        public boolean a(String str, String str2) {
            return r.a(str, str2);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, com.bytedance.bdtracker.g4] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.bdtracker.g4.d
        public String a(String str, String str2, g4 g4Var) {
            String str3 = str;
            return g4Var == null ? str3 : g4Var.d(str3, str2);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.bytedance.bdtracker.g4.d
        public void a(String str) {
            g4.this.a("openudid", str);
        }
    }

    public class b implements d<String> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public b() {
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.bdtracker.g4.d
        public String a() {
            return g4.this.b("clientudid");
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.bytedance.bdtracker.g4.d
        public boolean b(String str) {
            return r.e(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // com.bytedance.bdtracker.g4.d
        public boolean a(String str, String str2) {
            return r.a(str, str2);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, com.bytedance.bdtracker.g4] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.bdtracker.g4.d
        public String a(String str, String str2, g4 g4Var) {
            String str3 = str;
            return g4Var == null ? str3 : g4Var.b(str3, str2);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.bytedance.bdtracker.g4.d
        public void a(String str) {
            g4.this.a("clientudid", str);
        }
    }

    public class c implements d<String> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public c() {
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.bdtracker.g4.d
        public String a() {
            return g4.this.b("device_id");
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.bytedance.bdtracker.g4.d
        public boolean b(String str) {
            return !TextUtils.isEmpty(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // com.bytedance.bdtracker.g4.d
        public boolean a(String str, String str2) {
            return r.a(str, str2);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, com.bytedance.bdtracker.g4] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.bdtracker.g4.d
        public String a(String str, String str2, g4 g4Var) {
            String str3 = str;
            return g4Var == null ? str3 : g4Var.c(str3, str2);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.bytedance.bdtracker.g4.d
        public void a(String str) {
            g4.this.a("device_id", str);
        }
    }

    public interface d<L> {
        L a();

        L a(L l, L l2, g4 g4Var);

        void a(L l);

        boolean a(L l, L l2);

        boolean b(L l);
    }

    public abstract void a(String str, String str2);

    public abstract String b(String str);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String b(String str, String str2) {
        return (String) a(str, str2, new b());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String c(String str, String str2) {
        return (String) a(str, str2, new c());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String d(String str, String str2) {
        return (String) a(str, str2, new a());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public void a(String str) {
        g4 g4Var = this.f179a;
        if (g4Var != null) {
            g4Var.a(str);
        }
    }

    public final <T> T a(T t, T t2, d<T> dVar) {
        boolean z;
        if (dVar == null) {
            throw new IllegalArgumentException("agent == null");
        }
        g4 g4Var = this.f179a;
        T tA = dVar.a();
        boolean zB = dVar.b(t);
        boolean zB2 = dVar.b(tA);
        if (!zB && zB2) {
            t = tA;
        }
        if (g4Var != null) {
            T tA2 = dVar.a(t, t2, g4Var);
            if (!dVar.a(tA2, tA)) {
                dVar.a(tA2);
            }
            return tA2;
        }
        if (zB || zB2) {
            t2 = t;
            z = false;
        } else {
            z = true;
        }
        if ((z && dVar.b(t2)) || (zB && !dVar.a(t2, tA))) {
            dVar.a(t2);
        }
        return t2;
    }

    public void a(Handler handler) {
        g4 g4Var = this.f179a;
        if (g4Var != null) {
            g4Var.a(handler);
        }
        this.b = handler;
    }
}
