package com.immomo.mls.fun.lt;

import com.immomo.mls.annotation.LuaBridge;
import com.immomo.mls.annotation.LuaClass;
import com.immomo.mls.fun.java.Event;
import o.C7912asl;
import o.InterfaceC7835arN;
import o.InterfaceC7913asm;
import org.luaj.vm2.Globals;
import org.luaj.vm2.LuaValue;

/* JADX INFO: loaded from: classes3.dex */
@LuaClass
public class SIEventCenter {
    public static final String LUA_CLASS_NAME = "EventCenter";
    public Globals globals;

    public SIEventCenter(Globals globals, LuaValue[] luaValueArr) {
        this.globals = globals;
    }

    public void EZpvd() {
        C7912asl.KWHzl().copydefault(this.globals);
    }

    @LuaBridge
    public void addEventListener(String str, InterfaceC7835arN interfaceC7835arN) {
        KWHzl(str, interfaceC7835arN);
    }

    @LuaBridge
    @Deprecated
    public void reomoveEventListener(String str) {
        copydefault(str);
    }

    @LuaBridge
    public void removeEventListener(String str) {
        copydefault(str);
    }

    @LuaBridge
    public void postEvent(Event event) {
        EZpvd(event);
    }

    public final void EZpvd(Event event) {
        C7912asl.KWHzl().AEQbTJ(this.globals, event);
    }

    public final void copydefault(String str) {
        InterfaceC7913asm interfaceC7913asmCopydefault = C7912asl.KWHzl().copydefault(this.globals, str);
        if (interfaceC7913asmCopydefault instanceof TaskDescription) {
            ((TaskDescription) interfaceC7913asmCopydefault).KWHzl.OLrzqt();
        }
    }

    public final void KWHzl(String str, InterfaceC7835arN interfaceC7835arN) {
        InterfaceC7913asm interfaceC7913asmOLrzqt = C7912asl.KWHzl().OLrzqt(this.globals, str, new TaskDescription(interfaceC7835arN));
        if (interfaceC7913asmOLrzqt instanceof TaskDescription) {
            ((TaskDescription) interfaceC7913asmOLrzqt).KWHzl.OLrzqt();
        }
    }

    /* JADX INFO: loaded from: classes14.dex */
    public static final class TaskDescription implements InterfaceC7913asm {
        public final InterfaceC7835arN KWHzl;

        public TaskDescription(InterfaceC7835arN interfaceC7835arN) {
            this.KWHzl = interfaceC7835arN;
        }

        @Override // o.InterfaceC7913asm
        public void onEventReceive(Event event) {
            this.KWHzl.EZpvd(event);
        }
    }
}
