package com.immomo.mls.fun.ud.net;

import android.text.TextUtils;
import com.immomo.mls.annotation.LuaBridge;
import com.immomo.mls.annotation.LuaClass;
import com.immomo.mls.fun.ud.UDMap;
import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import o.C7323ahf;
import o.C7428aje;
import o.C7430ajg;
import o.C7840arS;
import o.C7864arq;
import o.InterfaceC7835arN;
import org.luaj.vm2.Globals;
import org.luaj.vm2.LuaValue;

/* JADX INFO: loaded from: classes17.dex */
@LuaClass(gcByLua = false)
@Deprecated
public class UDHttp {
    public String KWHzl;
    public Globals OLrzqt;

    public Runnable copydefault(String str, Map map, List list, List list2, InterfaceC7835arN interfaceC7835arN) {
        return null;
    }

    public UDHttp(Globals globals, LuaValue[] luaValueArr) {
        this.OLrzqt = globals;
    }

    public void OLrzqt() {
        C7323ahf.isConnected().copydefault(Integer.valueOf(hashCode()));
        this.OLrzqt = null;
    }

    @LuaBridge
    public void setBaseUrl(String str) {
        if (!str.endsWith("/")) {
            str = str + "/";
        }
        this.KWHzl = str;
    }

    @LuaBridge
    public void post(String str, Map map, InterfaceC7835arN interfaceC7835arN) {
        C7323ahf.isConnected().AEQbTJ(Integer.valueOf(hashCode()), KWHzl(copydefault(str), map, interfaceC7835arN));
    }

    @LuaBridge
    public void get(String str, Map map, InterfaceC7835arN interfaceC7835arN) {
        C7323ahf.isConnected().AEQbTJ(Integer.valueOf(hashCode()), copydefault(copydefault(str), map, interfaceC7835arN));
    }

    @LuaBridge
    public void download(String str, Map map, InterfaceC7835arN interfaceC7835arN, InterfaceC7835arN interfaceC7835arN2) {
        C7323ahf.isConnected().AEQbTJ(Integer.valueOf(hashCode()), KWHzl(copydefault(str), map, interfaceC7835arN, interfaceC7835arN2));
    }

    @LuaBridge
    public void upload(String str, Map map, List list, List list2, InterfaceC7835arN interfaceC7835arN) {
        Runnable runnableCopydefault = copydefault(copydefault(str), map, list, list2, interfaceC7835arN);
        if (runnableCopydefault != null) {
            C7323ahf.isConnected().AEQbTJ(Integer.valueOf(hashCode()), runnableCopydefault);
        }
    }

    public final String copydefault(String str) {
        if (TextUtils.isEmpty(this.KWHzl) || str.startsWith("http")) {
            return str;
        }
        if (str.startsWith("/")) {
            str = str.substring(1);
        }
        return this.KWHzl + str;
    }

    public Runnable KWHzl(String str, Map map, InterfaceC7835arN interfaceC7835arN) {
        return new TaskDescription(this.OLrzqt, str, map, interfaceC7835arN);
    }

    public Runnable copydefault(String str, Map map, InterfaceC7835arN interfaceC7835arN) {
        return new Application(this.OLrzqt, str, map, interfaceC7835arN);
    }

    public Runnable KWHzl(String str, Map map, InterfaceC7835arN interfaceC7835arN, InterfaceC7835arN interfaceC7835arN2) {
        return new ActionBar(this.OLrzqt, str, map, interfaceC7835arN, interfaceC7835arN2);
    }

    public static class Application extends StateListAnimator {
        public Application(Globals globals, String str, Map map, InterfaceC7835arN interfaceC7835arN) {
            super(globals, str, map, interfaceC7835arN);
        }

        @Override // com.immomo.mls.fun.ud.net.UDHttp.StateListAnimator
        public void AEQbTJ(C7430ajg c7430ajg, int i) throws Exception {
            C7428aje.OLrzqt(this.EZpvd, this.copydefault, c7430ajg);
        }
    }

    public static class TaskDescription extends StateListAnimator {
        public TaskDescription(Globals globals, String str, Map map, InterfaceC7835arN interfaceC7835arN) {
            super(globals, str, map, interfaceC7835arN);
        }

        @Override // com.immomo.mls.fun.ud.net.UDHttp.StateListAnimator
        public void AEQbTJ(C7430ajg c7430ajg, int i) throws Exception {
            C7428aje.EZpvd(this.EZpvd, this.copydefault, c7430ajg);
        }
    }

    public static class ActionBar extends StateListAnimator implements C7428aje.StateListAnimator {
        public String KWHzl;
        public InterfaceC7835arN gEmmrt;

        @Override // com.immomo.mls.fun.ud.net.UDHttp.StateListAnimator
        public int copydefault() {
            return 0;
        }

        public ActionBar(Globals globals, String str, Map map, InterfaceC7835arN interfaceC7835arN, InterfaceC7835arN interfaceC7835arN2) {
            super(globals, str, map, interfaceC7835arN2);
            this.gEmmrt = interfaceC7835arN;
        }

        @Override // com.immomo.mls.fun.ud.net.UDHttp.StateListAnimator
        public void AEQbTJ(C7430ajg c7430ajg, int i) throws Exception {
            C7428aje.AEQbTJ(this.EZpvd, this.KWHzl, this.copydefault, this, c7430ajg);
        }

        @Override // com.immomo.mls.fun.ud.net.UDHttp.StateListAnimator
        public void OLrzqt() {
            Object objRemove = this.copydefault.remove(ResponseKey.Path);
            String string = objRemove != null ? objRemove.toString() : null;
            this.KWHzl = string;
            if (TextUtils.isEmpty(string)) {
                this.KWHzl = new File(C7864arq.OLrzqt(), C7864arq.copydefault(this.EZpvd)).getAbsolutePath();
            }
        }

        @Override // o.C7428aje.StateListAnimator
        public void OLrzqt(final float f, final long j) {
            if (this.gEmmrt == null) {
                return;
            }
            C7840arS.copydefault(new Runnable() { // from class: com.immomo.mls.fun.ud.net.UDHttp.ActionBar.2
                @Override // java.lang.Runnable
                public void run() {
                    InterfaceC7835arN interfaceC7835arN = ActionBar.this.gEmmrt;
                    if (interfaceC7835arN != null) {
                        interfaceC7835arN.EZpvd(Float.valueOf(f), Long.valueOf(j));
                    }
                }
            });
        }
    }

    public static abstract class StateListAnimator implements Runnable {
        public final InterfaceC7835arN AEQbTJ;
        public final String EZpvd;
        public final Globals OLrzqt;
        public final Map copydefault;

        public abstract void AEQbTJ(C7430ajg c7430ajg, int i) throws Exception;

        public boolean KWHzl(C7430ajg c7430ajg) {
            return false;
        }

        public void OLrzqt() {
        }

        public void copydefault(C7430ajg c7430ajg) {
        }

        public StateListAnimator(Globals globals, String str, Map map, InterfaceC7835arN interfaceC7835arN) {
            this.OLrzqt = globals;
            this.EZpvd = str;
            this.copydefault = map == null ? new HashMap() : map;
            this.AEQbTJ = interfaceC7835arN;
        }

        @Override // java.lang.Runnable
        public void run() {
            OLrzqt();
            C7430ajg c7430ajgKWHzl = KWHzl();
            try {
                try {
                    int iCopydefault = copydefault();
                    if (iCopydefault == 1) {
                        C7430ajg c7430ajgKWHzl2 = KWHzl();
                        if (KWHzl(c7430ajgKWHzl2)) {
                            c7430ajgKWHzl2.AEQbTJ(true);
                            EZpvd(this.OLrzqt, c7430ajgKWHzl2);
                        }
                        AEQbTJ(c7430ajgKWHzl, EZpvd());
                        copydefault(c7430ajgKWHzl);
                    } else if (iCopydefault != 2) {
                        if (iCopydefault != 3) {
                            if (iCopydefault == 4) {
                                AEQbTJ(c7430ajgKWHzl, EZpvd());
                                copydefault(c7430ajgKWHzl);
                            } else {
                                AEQbTJ(c7430ajgKWHzl, EZpvd());
                            }
                        } else if (!KWHzl(c7430ajgKWHzl)) {
                            throw new Exception("no cache");
                        }
                    } else if (KWHzl(c7430ajgKWHzl)) {
                        c7430ajgKWHzl.AEQbTJ(true);
                    } else {
                        AEQbTJ(c7430ajgKWHzl, EZpvd());
                        copydefault(c7430ajgKWHzl);
                    }
                } catch (Exception e) {
                    AEQbTJ(e, c7430ajgKWHzl);
                }
            } finally {
                EZpvd(this.OLrzqt, c7430ajgKWHzl);
            }
        }

        public void AEQbTJ(Exception exc, C7430ajg c7430ajg) {
            c7430ajg.KWHzl(-1);
            c7430ajg.KWHzl(exc.getMessage());
            c7430ajg.OLrzqt(true);
        }

        public C7430ajg KWHzl() {
            return new C7430ajg();
        }

        public void EZpvd(final Globals globals, final C7430ajg c7430ajg) {
            if (this.AEQbTJ == null || globals == null || globals.isDestroyed()) {
                return;
            }
            C7840arS.copydefault(new Runnable() { // from class: com.immomo.mls.fun.ud.net.UDHttp.StateListAnimator.1
                @Override // java.lang.Runnable
                public void run() {
                    if (globals.isDestroyed()) {
                        return;
                    }
                    if (c7430ajg.OLrzqt()) {
                        StateListAnimator.this.AEQbTJ.EZpvd(LuaValue.True(), new UDMap(globals, c7430ajg.EZpvd()));
                    } else {
                        StateListAnimator.this.AEQbTJ.EZpvd(LuaValue.False(), LuaValue.Nil(), new UDMap(globals, c7430ajg.EZpvd()));
                    }
                }
            });
        }

        public int copydefault() {
            Object objRemove = this.copydefault.remove("cachePolicy");
            if (objRemove == null) {
                return 0;
            }
            if (objRemove instanceof Integer) {
                return ((Integer) objRemove).intValue();
            }
            return Integer.parseInt(objRemove.toString());
        }

        public int EZpvd() {
            Object objRemove = this.copydefault.remove("encType");
            if (objRemove == null) {
                return 0;
            }
            if (objRemove instanceof Integer) {
                return ((Integer) objRemove).intValue();
            }
            return Integer.parseInt(objRemove.toString());
        }
    }
}
