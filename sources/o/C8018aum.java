package o;

import org.luaj.vm2.LuaFunction;

/* JADX INFO: renamed from: o.aum, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C8018aum extends C8021aup implements InterfaceC8027auv {
    public static final InterfaceC8012aug<LuaFunction, InterfaceC8027auv> copydefault = new InterfaceC8012aug<LuaFunction, InterfaceC8027auv>() { // from class: o.aum.4
        /* JADX DEBUG: Method merged with bridge method: copydefault(Lorg/luaj/vm2/LuaValue;)Ljava/lang/Object; */
        @Override // o.InterfaceC8012aug
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public InterfaceC8027auv copydefault(LuaFunction luaFunction) {
            return new C8018aum(luaFunction);
        }
    };

    public C8018aum(LuaFunction luaFunction) {
        super(luaFunction);
    }
}
