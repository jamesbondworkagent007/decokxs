package com.immomo.mls.fun.ud.view.tokenMap;

import com.immomo.mls.fun.ud.UDColor;
import o.C7458akH;
import o.InterfaceC60044zuT;
import o.InterfaceC8012aug;
import org.luaj.vm2.LuaUserdata;
import org.luaj.vm2.LuaValue;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC60044zuT
public class UDTokenData extends LuaUserdata<C7458akH> {
    public static final String[] AEQbTJ = new String[0];
    public static final InterfaceC8012aug<UDTokenData, C7458akH> KWHzl = new InterfaceC8012aug<UDTokenData, C7458akH>() { // from class: com.immomo.mls.fun.ud.view.tokenMap.UDTokenData.3
        /* JADX DEBUG: Method merged with bridge method: copydefault(Lorg/luaj/vm2/LuaValue;)Ljava/lang/Object; */
        @Override // o.InterfaceC8012aug
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public C7458akH copydefault(UDTokenData uDTokenData) {
            return uDTokenData.copydefault;
        }
    };
    public C7458akH copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getJavaUserdata()Ljava/lang/Object; */
    @Override // org.luaj.vm2.LuaUserdata
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public C7458akH getJavaUserdata() {
        return this.copydefault;
    }

    @InterfaceC60044zuT
    public UDTokenData(long j, LuaValue[] luaValueArr) {
        super(j, luaValueArr);
        if (luaValueArr.length >= 8) {
            this.copydefault = new C7458akH(luaValueArr[0].toJavaString(), luaValueArr[1].toDouble(), luaValueArr[2].toJavaString(), luaValueArr[3].toJavaString(), ((UDColor) luaValueArr[4]).copydefault(), ((UDColor) luaValueArr[5]).copydefault(), luaValueArr[6].toJavaString(), luaValueArr[7].toJavaString());
        }
    }
}
