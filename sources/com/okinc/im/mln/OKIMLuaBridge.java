package com.okinc.im.mln;

import android.app.Activity;
import com.immomo.mls.annotation.LuaBridge;
import com.immomo.mls.annotation.LuaClass;
import com.okinc.im.bean.ChatOrigin;
import com.okinc.okimcore.model.im.OKConversationType;
import java.util.Iterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C43251rlk;
import o.C54819xWm;
import o.InterfaceC35180nqU;
import o.pUU;
import o.yDV;
import org.jetbrains.annotations.NotNull;
import org.luaj.vm2.Globals;
import org.luaj.vm2.LuaValue;

/* JADX INFO: loaded from: classes8.dex */
@LuaClass
public final class OKIMLuaBridge {
    public static final TaskDescription Companion = new TaskDescription(null);

    public OKIMLuaBridge(@NotNull Globals globals, @NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(globals, "");
        Intrinsics.checkNotNullParameter(luaValueArr, "");
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.im.mln.OKIMLuaBridge.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    @LuaBridge
    public final void startVIPGroupChat(@NotNull String str) {
        InterfaceC35180nqU interfaceC35180nqU;
        Intrinsics.checkNotNullParameter(str, "");
        pUU.KWHzl("OKIMLuaBridge", "startVIPGroupChat called with conversationId: " + str);
        Activity activityAEQbTJ = C54819xWm.KWHzl().AEQbTJ();
        if (activityAEQbTJ == null || (interfaceC35180nqU = (InterfaceC35180nqU) C43251rlk.OLrzqt(InterfaceC35180nqU.class)) == null) {
            return;
        }
        interfaceC35180nqU.KWHzl(activityAEQbTJ, str, OKConversationType.GROUP, "vipcrm");
    }

    @LuaBridge
    public final void startChat(@NotNull LuaValue[] luaValueArr) {
        InterfaceC35180nqU interfaceC35180nqU;
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        LuaValue luaValue = (LuaValue) yDV.gEmmrt(luaValueArr, 0);
        ChatOrigin chatOrigin = null;
        String javaString = luaValue != null ? luaValue.toJavaString() : null;
        LuaValue luaValue2 = (LuaValue) yDV.gEmmrt(luaValueArr, 1);
        String javaString2 = luaValue2 != null ? luaValue2.toJavaString() : null;
        if (javaString == null || javaString.length() == 0 || javaString2 == null || javaString2.length() == 0) {
            pUU.valueOf("OKIMLuaBridge", "startChat: contactId and contactName are required");
            return;
        }
        LuaValue luaValue3 = (LuaValue) yDV.gEmmrt(luaValueArr, 2);
        String javaString3 = luaValue3 != null ? luaValue3.toJavaString() : null;
        Iterator<ChatOrigin> it = ChatOrigin.getEntries().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            ChatOrigin next = it.next();
            if (Intrinsics.EZpvd((Object) next.getValue(), (Object) javaString3)) {
                chatOrigin = next;
                break;
            }
        }
        ChatOrigin chatOrigin2 = chatOrigin;
        pUU.KWHzl("OKIMLuaBridge", "startChat: contactId=" + javaString + ", origin=" + chatOrigin2);
        Activity activityAEQbTJ = C54819xWm.KWHzl().AEQbTJ();
        if (activityAEQbTJ == null || (interfaceC35180nqU = (InterfaceC35180nqU) C43251rlk.OLrzqt(InterfaceC35180nqU.class)) == null) {
            return;
        }
        interfaceC35180nqU.copydefault(activityAEQbTJ, javaString, javaString2, chatOrigin2);
    }
}
