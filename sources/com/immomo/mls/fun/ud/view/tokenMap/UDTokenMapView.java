package com.immomo.mls.fun.ud.view.tokenMap;

import androidx.annotation.NonNull;
import com.google.gson.Gson;
import com.immomo.mls.fun.ud.UDArray;
import com.immomo.mls.fun.ud.view.UDView;
import java.util.List;
import o.C7452akB;
import o.C7458akH;
import o.C7461akK;
import o.C7865arr;
import o.C7869arv;
import o.C7910asj;
import o.InterfaceC60044zuT;
import org.luaj.vm2.Globals;
import org.luaj.vm2.LuaTable;
import org.luaj.vm2.LuaValue;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC60044zuT
public class UDTokenMapView<T extends C7452akB> extends UDView<T> {
    public static final String[] AEQbTJ = {"setData", "setClickTokenListener"};
    public C7452akB EZpvd;

    @InterfaceC60044zuT
    public UDTokenMapView(long j, LuaValue[] luaValueArr) {
        super(j, luaValueArr);
    }

    @InterfaceC60044zuT
    public UDTokenMapView(Globals globals, @NonNull T t) {
        super(globals, t);
    }

    @InterfaceC60044zuT
    public UDTokenMapView(Globals globals) {
        super(globals);
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ([Lorg/luaj/vm2/LuaValue;)Landroid/view/View; */
    @Override // com.immomo.mls.fun.ud.view.UDView
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public T AEQbTJ(@NonNull LuaValue[] luaValueArr) {
        T t = (T) new C7452akB(AubY());
        this.EZpvd = t;
        return t;
    }

    @InterfaceC60044zuT
    public LuaValue[] setClickTokenListener(final LuaValue[] luaValueArr) {
        if (luaValueArr.length <= 0 || luaValueArr[0] == null) {
            return null;
        }
        this.EZpvd.setOnSelectedListener(new C7452akB.TaskDescription() { // from class: com.immomo.mls.fun.ud.view.tokenMap.UDTokenMapView.3
            @Override // o.C7452akB.TaskDescription
            public void KWHzl(int i, @NonNull C7452akB.ActionBar actionBar) {
                luaValueArr[0].toLuaFunction().AEQbTJ(C7869arv.copydefault(UDTokenMapView.this.globals, new Gson().toJsonTree(actionBar.copydefault().get(0)).getAsJsonObject()));
            }
        });
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] setData(LuaValue[] luaValueArr) {
        List<C7458akH> listEZpvd;
        LuaValue luaValue = luaValueArr[0];
        if (luaValue instanceof LuaTable) {
            listEZpvd = C7910asj.copydefault((LuaTable) luaValue);
        } else {
            listEZpvd = luaValue instanceof UDArray ? ((UDArray) luaValue).EZpvd() : null;
        }
        this.EZpvd.setData(listEZpvd, new C7461akK(C7865arr.copydefault(luaValueArr[1].toFloat()), C7865arr.copydefault(luaValueArr[2].toFloat()), luaValueArr[3].toInt(), C7865arr.copydefault(luaValueArr[4].toFloat())));
        return null;
    }
}
