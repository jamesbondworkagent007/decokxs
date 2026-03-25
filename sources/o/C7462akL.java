package o;

import com.immomo.mls.fun.ud.view.UDViewGroup;
import org.luaj.vm2.LuaTable;
import org.luaj.vm2.LuaValue;

/* JADX INFO: renamed from: o.akL, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C7462akL extends C7546alq {
    public LuaTable EZpvd;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public LuaTable copydefault() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setCell(LuaTable luaTable) {
        this.EZpvd = luaTable;
    }

    public C7462akL(android.content.Context context, UDViewGroup uDViewGroup, LuaValue[] luaValueArr) {
        super(context, uDViewGroup);
    }

    public boolean KWHzl() {
        return getChildCount() > 0;
    }
}
