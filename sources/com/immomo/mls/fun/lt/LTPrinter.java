package com.immomo.mls.fun.lt;

import com.immomo.mls.annotation.LuaBridge;
import com.immomo.mls.annotation.LuaClass;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.C7323ahf;
import o.InterfaceC60041zuQ;
import org.luaj.vm2.LuaTable;
import org.luaj.vm2.LuaValue;

/* JADX INFO: loaded from: classes3.dex */
@LuaClass(isStatic = true)
public class LTPrinter {
    @LuaBridge
    public static void printTable(LuaValue luaValue) {
        if (luaValue.isNil()) {
            C7323ahf.AEQbTJ().EZpvd("Printer", AbstractJsonLexerKt.NULL, new Object[0]);
        } else if (luaValue.isTable()) {
            StringBuilder sb = new StringBuilder();
            EZpvd((LuaTable) luaValue, sb, 0);
            C7323ahf.AEQbTJ().EZpvd("Printer", sb.toString(), new Object[0]);
        }
    }

    @LuaBridge
    public static void printObject(LuaValue luaValue) {
        if (luaValue == null || luaValue.isNil()) {
            return;
        }
        if (luaValue.isTable()) {
            printTable(luaValue);
        } else {
            C7323ahf.AEQbTJ().EZpvd("Printer", luaValue.toString(), new Object[0]);
        }
    }

    public static void EZpvd(LuaTable luaTable, StringBuilder sb, int i) {
        InterfaceC60041zuQ<LuaTable.Application> it = luaTable.iterator();
        if (it != null) {
            while (it.hasNext()) {
                LuaTable.Application next = it.next();
                KWHzl(sb, i);
                sb.append(next.AEQbTJ.toJavaString());
                sb.append(":");
                if (next.KWHzl.isTable()) {
                    sb.append("{\n");
                    EZpvd((LuaTable) next.KWHzl, sb, i + 1);
                } else if (next.KWHzl.isFunction()) {
                    sb.append("function");
                    next.KWHzl.destroy();
                } else {
                    sb.append(next.KWHzl.toJavaString());
                }
                sb.append(",\n");
            }
            it.AEQbTJ();
        }
        luaTable.destroy();
    }

    public static void KWHzl(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            sb.append("    ");
        }
    }
}
