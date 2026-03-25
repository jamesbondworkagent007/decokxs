package com.bytedance.bdtracker;

import android.text.TextUtils;
import com.bytedance.applog.AppLog;
import com.bytedance.applog.IAppLogInstance;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static e f138a = new a();
    public static e b = new C0186b();
    public static e c = new c();

    public static final class a implements e {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.bytedance.bdtracker.b.e
        public boolean a(com.bytedance.bdtracker.d dVar) {
            return dVar.isH5CollectEnable();
        }
    }

    /* JADX INFO: renamed from: com.bytedance.bdtracker.b$b, reason: collision with other inner class name */
    public static final class C0186b implements e {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.bytedance.bdtracker.b.e
        public boolean a(com.bytedance.bdtracker.d dVar) {
            return dVar.getInitConfig() != null && dVar.getInitConfig().isHandleLifeCycle();
        }
    }

    public static final class c implements e {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // com.bytedance.bdtracker.b.e
        public boolean a(com.bytedance.bdtracker.d dVar) {
            return !(dVar.getInitConfig() != null && dVar.getInitConfig().isPageMetaAnnotationEnable());
        }
    }

    public interface d {
        void a(com.bytedance.bdtracker.d dVar);
    }

    public interface e {
        boolean a(com.bytedance.bdtracker.d dVar);
    }

    /* JADX INFO: loaded from: classes14.dex */
    public interface f {
        f4 a();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static com.bytedance.bdtracker.d a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        for (com.bytedance.bdtracker.d dVar : com.bytedance.bdtracker.d.L) {
            if (str.equals(dVar.m)) {
                return dVar;
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static boolean b(String str) {
        if (!TextUtils.isEmpty(str)) {
            Iterator<com.bytedance.bdtracker.d> it = com.bytedance.bdtracker.d.L.iterator();
            while (it.hasNext()) {
                if (str.equals(it.next().m)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static String a(IAppLogInstance iAppLogInstance, String str) {
        if (AppLog.getInstance() == iAppLogInstance) {
            return str;
        }
        return str + "_" + iAppLogInstance.getAppId();
    }

    public static void a(d dVar) {
        Iterator<com.bytedance.bdtracker.d> it = com.bytedance.bdtracker.d.L.iterator();
        while (it.hasNext()) {
            dVar.a(it.next());
        }
    }

    public static boolean a(e eVar) {
        Iterator<com.bytedance.bdtracker.d> it = com.bytedance.bdtracker.d.L.iterator();
        while (it.hasNext()) {
            if (eVar.a(it.next())) {
                return true;
            }
        }
        return false;
    }

    public static void a(String[] strArr) {
        Iterator<com.bytedance.bdtracker.d> it = com.bytedance.bdtracker.d.L.iterator();
        while (it.hasNext()) {
            it.next().receive((String[]) strArr.clone());
        }
    }

    public static void a(f fVar, e eVar) {
        f4 f4VarA = null;
        for (com.bytedance.bdtracker.d dVar : com.bytedance.bdtracker.d.L) {
            if (eVar.a(dVar)) {
                if (f4VarA == null) {
                    f4VarA = fVar.a();
                }
                dVar.receive(f4VarA.m6119clone());
            }
        }
    }

    public static void a(f4 f4Var, e eVar) {
        for (com.bytedance.bdtracker.d dVar : com.bytedance.bdtracker.d.L) {
            if (eVar.a(dVar)) {
                dVar.receive(f4Var.m6119clone());
            }
        }
    }
}
