package o;

import org.luaj.vm2.LuaFunction;

/* JADX INFO: renamed from: o.asa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C7901asa extends C8022auq implements InterfaceC7835arN {
    public static final InterfaceC8012aug<LuaFunction, InterfaceC7835arN> KWHzl = new InterfaceC8012aug<LuaFunction, InterfaceC7835arN>() { // from class: o.asa.1
        /* JADX DEBUG: Method merged with bridge method: copydefault(Lorg/luaj/vm2/LuaValue;)Ljava/lang/Object; */
        @Override // o.InterfaceC8012aug
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public InterfaceC7835arN copydefault(LuaFunction luaFunction) {
            return new C7901asa(luaFunction);
        }
    };

    public C7901asa(LuaFunction luaFunction) {
        super(luaFunction);
    }

    @Override // o.InterfaceC7835arN
    public boolean EZpvd(java.lang.Object... objArr) {
        if (AEQbTJ()) {
            return false;
        }
        try {
            super.KWHzl(objArr);
            return true;
        } catch (java.lang.Throwable unused) {
            return false;
        }
    }
}
