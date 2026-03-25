package com.immomo.mls.fun.java;

import android.text.TextUtils;
import com.immomo.mls.annotation.BridgeType;
import com.immomo.mls.annotation.LuaBridge;
import com.immomo.mls.annotation.LuaClass;
import com.reown.foundation.util.jwt.JwtUtilsKt;
import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.luaj.vm2.Globals;
import org.luaj.vm2.LuaValue;

/* JADX INFO: loaded from: classes3.dex */
@LuaClass
public class Event {
    public Map AEQbTJ;
    public String EZpvd;
    public String KWHzl;
    public int OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @LuaBridge(alias = "info", type = BridgeType.GETTER)
    public Map getInfo() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @LuaBridge(alias = JwtUtilsKt.DID_METHOD_KEY, type = BridgeType.GETTER)
    public String getKey() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @LuaBridge(alias = "producerId", type = BridgeType.GETTER)
    public String getProducerId() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @LuaBridge(alias = "type", type = BridgeType.GETTER)
    public int getType() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @LuaBridge(alias = "info", type = BridgeType.SETTER)
    public void setInfo(Map map) {
        this.AEQbTJ = map;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @LuaBridge(alias = JwtUtilsKt.DID_METHOD_KEY, type = BridgeType.SETTER)
    public void setKey(String str) {
        this.KWHzl = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @LuaBridge(alias = "producerId", type = BridgeType.SETTER)
    public void setProducerId(String str) {
        this.EZpvd = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @LuaBridge(alias = "type", type = BridgeType.SETTER)
    public void setType(int i) {
        this.OLrzqt = i;
    }

    public Event() {
    }

    public Event(Globals globals, LuaValue[] luaValueArr) {
    }

    public boolean KWHzl() {
        return !TextUtils.isEmpty(this.KWHzl);
    }

    public String toString() {
        return "Event{type=" + this.OLrzqt + ", producerId=" + this.EZpvd + ", info=" + this.AEQbTJ + ", key='" + this.KWHzl + '\'' + AbstractJsonLexerKt.END_OBJ;
    }
}
