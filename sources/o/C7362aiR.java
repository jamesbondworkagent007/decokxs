package o;

import android.view.ViewGroup;
import com.immomo.mls.fun.ud.view.UDViewGroup;
import com.immomo.mls.fun.ud.view.recycler.UDBaseRecyclerAdapter;
import java.lang.ref.WeakReference;
import org.luaj.vm2.Globals;
import org.luaj.vm2.LuaTable;

/* JADX INFO: renamed from: o.aiR, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C7362aiR<T extends android.view.ViewGroup> extends UDViewGroup<T> {
    public boolean AEQbTJ;
    public LuaTable EZpvd;
    public WeakReference<UDBaseRecyclerAdapter> KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public LuaTable OLrzqt() {
        return this.EZpvd;
    }

    public C7362aiR(Globals globals, UDBaseRecyclerAdapter uDBaseRecyclerAdapter) {
        super(globals);
        this.AEQbTJ = false;
        this.KWHzl = new WeakReference<>(uDBaseRecyclerAdapter);
        LuaTable luaTableAEQbTJ = LuaTable.AEQbTJ(globals);
        this.EZpvd = luaTableAEQbTJ;
        luaTableAEQbTJ.set("contentView", this);
    }

    @Override // com.immomo.mls.fun.ud.view.UDView
    public int fetchVPNInfo() {
        int iFetchVPNInfo = super.fetchVPNInfo();
        if (iFetchVPNInfo > 0) {
            return iFetchVPNInfo;
        }
        if (this.KWHzl.get() != null) {
            return this.KWHzl.get().AhwBna();
        }
        return 0;
    }

    @Override // com.immomo.mls.fun.ud.view.UDView
    public int djBIcL() {
        int iDjBIcL = super.djBIcL();
        if (iDjBIcL > 0) {
            return iDjBIcL;
        }
        if (this.KWHzl.get() != null) {
            return this.KWHzl.get().EZpvd();
        }
        return 0;
    }

    @Override // org.luaj.vm2.LuaUserdata
    public java.lang.String initLuaClassName(Globals globals) {
        return globals.EZpvd(UDViewGroup.class);
    }

    public void EZpvd() {
        if (this.AEQbTJ) {
            return;
        }
        this.AEQbTJ = true;
        C7830arI.Companion.KWHzl(getJavaUserdata(), java.lang.Boolean.TRUE);
        LuaTable luaTable = this.EZpvd;
        if (luaTable != null && !luaTable.isDestroyed()) {
            this.EZpvd.destroy();
        }
        freeJavaUserData();
        releaseLuaRef();
        onJavaRecycle();
        destroy();
    }
}
