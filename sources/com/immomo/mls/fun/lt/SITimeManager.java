package com.immomo.mls.fun.lt;

import com.immomo.mls.annotation.LuaBridge;
import com.immomo.mls.annotation.LuaClass;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o.C7840arS;
import o.InterfaceC8029auy;
import org.luaj.vm2.Globals;
import org.luaj.vm2.LuaFunction;
import org.luaj.vm2.LuaValue;

/* JADX INFO: loaded from: classes3.dex */
@LuaClass
public class SITimeManager {
    public static final String KEY = "TimeManager";
    public final Object tag = new Object();
    public List<Activity> tasks;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Object EZpvd() {
        return this.tag;
    }

    public SITimeManager(Globals globals, LuaValue[] luaValueArr) {
    }

    public void copydefault() {
        clearInterval();
    }

    @LuaBridge
    public void setTimeOut(final InterfaceC8029auy interfaceC8029auy, float f) {
        C7840arS.KWHzl(EZpvd(), new Runnable() { // from class: com.immomo.mls.fun.lt.SITimeManager.4
            @Override // java.lang.Runnable
            public void run() {
                interfaceC8029auy.KWHzl(new Object[0]);
            }
        }, (long) (f * 1000.0f));
    }

    @LuaBridge
    public void setInterval(LuaFunction luaFunction, float f) {
        long j = (long) (f * 1000.0f);
        Activity activity = new Activity(luaFunction, j);
        if (this.tasks == null) {
            this.tasks = new ArrayList();
        }
        this.tasks.add(activity);
        C7840arS.KWHzl(EZpvd(), activity, j);
    }

    @LuaBridge
    public void clearInterval() {
        List<Activity> list = this.tasks;
        if (list != null) {
            Iterator<Activity> it = list.iterator();
            while (it.hasNext()) {
                it.next().OLrzqt();
            }
            this.tasks.clear();
        }
        C7840arS.EZpvd(EZpvd());
    }

    /* JADX INFO: loaded from: classes14.dex */
    public final class Activity implements Runnable {
        public LuaFunction OLrzqt;
        public long copydefault;

        public Activity(LuaFunction luaFunction, long j) {
            this.OLrzqt = luaFunction;
            this.copydefault = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.OLrzqt.invoke(null);
            C7840arS.KWHzl(SITimeManager.this.EZpvd(), this, this.copydefault);
        }

        public void OLrzqt() {
            LuaFunction luaFunction = this.OLrzqt;
            if (luaFunction != null) {
                luaFunction.destroy();
            }
        }
    }
}
