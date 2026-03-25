package org.luaj.vm2;

import java.util.Arrays;
import java.util.Iterator;
import o.C7318aha;
import o.InterfaceC60041zuQ;
import o.InterfaceC60044zuT;

/* JADX INFO: loaded from: classes13.dex */
@InterfaceC60044zuT
public class LuaTable extends NLuaValue implements Iterable<Application> {
    public static final Entrys gHZMYf = new Entrys(LuaValue.empty(), LuaValue.empty());
    public boolean AwvSrB;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // org.luaj.vm2.NLuaValue
    public /* bridge */ /* synthetic */ Globals getGlobals() {
        return super.getGlobals();
    }

    @Override // org.luaj.vm2.LuaValue
    public final LuaTable toLuaTable() {
        return this;
    }

    @Override // org.luaj.vm2.LuaValue
    public final int type() {
        return 5;
    }

    @Override // org.luaj.vm2.NLuaValue, org.luaj.vm2.LuaValue
    public /* bridge */ /* synthetic */ void destroy() {
        super.destroy();
    }

    @Override // org.luaj.vm2.NLuaValue
    @InterfaceC60044zuT
    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // org.luaj.vm2.NLuaValue
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // org.luaj.vm2.NLuaValue, org.luaj.vm2.LuaValue
    @InterfaceC60044zuT
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }

    public LuaTable(long j) {
        super(j);
        this.AwvSrB = false;
        this.globals = (Globals) this;
    }

    public LuaTable(Globals globals, long j) {
        super(globals, j);
        this.AwvSrB = false;
    }

    @InterfaceC60044zuT
    private LuaTable(long j, long j2) {
        super(j, j2);
        this.AwvSrB = false;
    }

    public static LuaTable AEQbTJ(Globals globals) {
        globals.AkhnZx();
        return new LuaTable(globals, LuaCApi._createTable(globals.AYXKKw));
    }

    @Override // org.luaj.vm2.LuaValue
    public void set(int i, LuaValue luaValue) {
        if (copydefault()) {
            int iType = luaValue.type();
            if (iType == 0) {
                LuaCApi._setTableNil(this.globals.AYXKKw, this.nativeGlobalKey, i);
                return;
            }
            if (iType == 1) {
                LuaCApi._setTableBoolean(this.globals.AYXKKw, this.nativeGlobalKey, i, luaValue.toBoolean());
                return;
            }
            if (iType == 3) {
                LuaCApi._setTableNumber(this.globals.AYXKKw, this.nativeGlobalKey, i, luaValue.toDouble());
                return;
            }
            if (iType == 4) {
                LuaCApi._setTableString(this.globals.AYXKKw, this.nativeGlobalKey, i, luaValue.toJavaString());
            } else if (luaValue.notInGlobalTable()) {
                LuaCApi._setTableChild(this.globals.AYXKKw, this.nativeGlobalKey, i, luaValue);
            } else {
                LuaCApi._setTableChild(this.globals.AYXKKw, this.nativeGlobalKey, i, luaValue.nativeGlobalKey(), iType);
            }
        }
    }

    @Override // org.luaj.vm2.LuaValue
    public void set(int i, double d) {
        if (copydefault()) {
            LuaCApi._setTableNumber(this.globals.AYXKKw, this.nativeGlobalKey, i, d);
        }
    }

    @Override // org.luaj.vm2.LuaValue
    public void set(int i, boolean z) {
        if (copydefault()) {
            LuaCApi._setTableBoolean(this.globals.AYXKKw, this.nativeGlobalKey, i, z);
        }
    }

    @Override // org.luaj.vm2.LuaValue
    public void set(int i, String str) {
        if (copydefault()) {
            LuaCApi._setTableString(this.globals.AYXKKw, this.nativeGlobalKey, i, str);
        }
    }

    public void AEQbTJ(String str, LuaValue luaValue, boolean z) {
        if (!z || AubY()) {
            int iType = luaValue.type();
            if (iType == 0) {
                LuaCApi._setTableNil(this.globals.AYXKKw, this.nativeGlobalKey, str);
                return;
            }
            if (iType == 1) {
                LuaCApi._setTableBoolean(this.globals.AYXKKw, this.nativeGlobalKey, str, luaValue.toBoolean());
                return;
            }
            if (iType == 3) {
                LuaCApi._setTableNumber(this.globals.AYXKKw, this.nativeGlobalKey, str, luaValue.toDouble());
                return;
            }
            if (iType == 4) {
                LuaCApi._setTableString(this.globals.AYXKKw, this.nativeGlobalKey, str, luaValue.toJavaString());
                return;
            }
            if (luaValue.notInGlobalTable()) {
                LuaCApi._setTableChild(this.globals.AYXKKw, this.nativeGlobalKey, str, luaValue);
            } else {
                LuaCApi._setTableChild(this.globals.AYXKKw, this.nativeGlobalKey, str, luaValue.nativeGlobalKey(), iType);
            }
            if (this == this.globals) {
                luaValue.destroy();
            }
        }
    }

    @Override // org.luaj.vm2.LuaValue
    public void set(String str, LuaValue luaValue) {
        AEQbTJ(str, luaValue, true);
    }

    @Override // org.luaj.vm2.LuaValue
    public void set(String str, double d) {
        if (AubY()) {
            LuaCApi._setTableNumber(this.globals.AYXKKw, this.nativeGlobalKey, str, d);
        }
    }

    @Override // org.luaj.vm2.LuaValue
    public void set(String str, boolean z) {
        if (AubY()) {
            LuaCApi._setTableBoolean(this.globals.AYXKKw, this.nativeGlobalKey, str, z);
        }
    }

    @Override // org.luaj.vm2.LuaValue
    public void set(String str, String str2) {
        if (AubY()) {
            LuaCApi._setTableString(this.globals.AYXKKw, this.nativeGlobalKey, str, str2);
        }
    }

    @Override // org.luaj.vm2.LuaValue
    public LuaValue get(int i) {
        if (!copydefault()) {
            return LuaValue.Nil();
        }
        return (LuaValue) LuaCApi._getTableValue(this.globals.AYXKKw, this.nativeGlobalKey, i);
    }

    @Override // org.luaj.vm2.LuaValue
    public LuaValue get(String str) {
        if (!AubY()) {
            return LuaValue.Nil();
        }
        return (LuaValue) LuaCApi._getTableValue(this.globals.AYXKKw, this.nativeGlobalKey, str);
    }

    @Override // org.luaj.vm2.LuaValue
    public final LuaTable setMetatalbe(LuaTable luaTable) {
        if (!copydefault()) {
            return null;
        }
        if (luaTable == null) {
            long j_setMetatable = LuaCApi._setMetatable(this.globals.AYXKKw, this.nativeGlobalKey, 0L);
            if (j_setMetatable != 0) {
                return new LuaTable(this.globals, j_setMetatable);
            }
            return null;
        }
        luaTable.copydefault();
        long j_setMetatable2 = LuaCApi._setMetatable(this.globals.AYXKKw, this.nativeGlobalKey, luaTable.nativeGlobalKey);
        if (j_setMetatable2 != 0) {
            return new LuaTable(this.globals, j_setMetatable2);
        }
        return null;
    }

    @Override // org.luaj.vm2.LuaValue
    public LuaTable getMetatable() {
        if (!copydefault()) {
            return null;
        }
        long j_getMetatable = LuaCApi._getMetatable(this.globals.AYXKKw, this.nativeGlobalKey);
        if (j_getMetatable != 0) {
            return new LuaTable(this.globals, j_getMetatable);
        }
        return null;
    }

    public final boolean AuCTelauCTel() {
        if (copydefault()) {
            return LuaCApi._isEmpty(this.globals.AYXKKw, this.nativeGlobalKey);
        }
        return true;
    }

    public final int zLjUOn() {
        if (copydefault()) {
            return LuaCApi._getTableSize(this.globals.AYXKKw, this.nativeGlobalKey);
        }
        return -1;
    }

    @Deprecated
    public final Entrys zuBGHE() {
        return !AubY() ? gHZMYf : (Entrys) LuaCApi._getTableEntry(this.globals.AYXKKw, this.nativeGlobalKey);
    }

    public final boolean gHZMYf() {
        if (!AubY()) {
            return false;
        }
        boolean z_startTraverseTable = LuaCApi._startTraverseTable(this.globals.AYXKKw, this.nativeGlobalKey);
        this.AwvSrB = z_startTraverseTable;
        return z_startTraverseTable;
    }

    public final LuaValue[] sSMYrx() {
        if (!this.AwvSrB) {
            return null;
        }
        Globals globals = this.globals;
        return LuaCApi._nextEntry(globals.AYXKKw, this == globals);
    }

    public final void zsXlph() {
        if (this.AwvSrB) {
            LuaCApi._endTraverseTable(this.globals.AYXKKw);
            this.AwvSrB = false;
        }
    }

    /* JADX DEBUG: Method merged with bridge method: iterator()Ljava/util/Iterator; */
    @Override // java.lang.Iterable
    /* JADX INFO: renamed from: AwvSrB, reason: merged with bridge method [inline-methods] */
    public final InterfaceC60041zuQ<Application> iterator() {
        if (gHZMYf()) {
            return new InterfaceC60041zuQ<Application>() { // from class: org.luaj.vm2.LuaTable.3
                public Application copydefault;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Method merged with bridge method: next()Ljava/lang/Object; */
                @Override // java.util.Iterator
                /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
                public Application next() {
                    return this.copydefault;
                }

                @Override // o.InterfaceC60041zuQ
                public void AEQbTJ() {
                    LuaTable.this.zsXlph();
                }

                @Override // java.util.Iterator
                public boolean hasNext() {
                    LuaValue[] luaValueArrSSMYrx = LuaTable.this.sSMYrx();
                    if (luaValueArrSSMYrx == null) {
                        LuaTable.this.zsXlph();
                        return false;
                    }
                    this.copydefault = new Application(luaValueArrSSMYrx[0], luaValueArrSSMYrx[1]);
                    return true;
                }
            };
        }
        return null;
    }

    @InterfaceC60044zuT
    public static final class Entrys implements Iterable<Application> {
        public final int AEQbTJ;

        @InterfaceC60044zuT
        private final LuaValue[] keys;

        @InterfaceC60044zuT
        private final LuaValue[] values;

        @InterfaceC60044zuT
        private Entrys(LuaValue[] luaValueArr, LuaValue[] luaValueArr2) {
            this.keys = luaValueArr;
            this.values = luaValueArr2;
            this.AEQbTJ = luaValueArr.length;
        }

        public String toString() {
            return "keys:" + Arrays.toString(this.keys) + "\nvalues:" + Arrays.toString(this.values);
        }

        @Override // java.lang.Iterable
        public Iterator<Application> iterator() {
            return new Activity(this.keys, this.values);
        }

        public static final class Activity implements Iterator<Application> {
            public final int EZpvd;
            public int KWHzl;
            public final LuaValue[] OLrzqt;
            public final LuaValue[] copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.KWHzl < this.EZpvd;
            }

            public Activity(LuaValue[] luaValueArr, LuaValue[] luaValueArr2) {
                this.copydefault = luaValueArr;
                this.OLrzqt = luaValueArr2;
                this.EZpvd = luaValueArr.length;
                this.KWHzl = 0;
            }

            /* JADX DEBUG: Method merged with bridge method: next()Ljava/lang/Object; */
            @Override // java.util.Iterator
            /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
            public Application next() {
                LuaValue[] luaValueArr = this.copydefault;
                int i = this.KWHzl;
                LuaValue luaValue = luaValueArr[i];
                LuaValue[] luaValueArr2 = this.OLrzqt;
                this.KWHzl = i + 1;
                return new Application(luaValue, luaValueArr2[i]);
            }
        }
    }

    public static final class Application {
        public final LuaValue AEQbTJ;
        public final LuaValue KWHzl;

        public Application(LuaValue luaValue, LuaValue luaValue2) {
            this.AEQbTJ = luaValue;
            this.KWHzl = luaValue2;
        }

        public String toString() {
            return this.AEQbTJ + " : " + this.KWHzl;
        }
    }

    public boolean AubY() {
        this.globals.AkhnZx();
        if (!isDestroyed() && this.nativeGlobalKey != 0) {
            return true;
        }
        if (!C7318aha.copydefault) {
            return false;
        }
        AxsJAY();
        return false;
    }

    private boolean copydefault() {
        this.globals.AkhnZx();
        if (!isDestroyed() && !notInGlobalTable()) {
            return true;
        }
        if (!C7318aha.copydefault) {
            return false;
        }
        AxsJAY();
        return false;
    }

    public final void AxsJAY() {
        StringBuilder sb = new StringBuilder();
        sb.append("table (");
        sb.append(this.nativeGlobalKey);
        sb.append(") is ");
        sb.append(this.destroyed ? "" : "not ");
        sb.append("destroyed. global is ");
        sb.append(this.globals.isDestroyed() ? "destroyed" : "not destroyed");
        throw new IllegalStateException(sb.toString());
    }

    @Override // org.luaj.vm2.LuaValue
    public String toJavaString() {
        if (isDestroyed()) {
            return "table(" + this.nativeGlobalKey + ") is destroyed!";
        }
        return zuBGHE().toString();
    }

    @Override // org.luaj.vm2.LuaValue
    public boolean isDestroyed() {
        return this.globals.isDestroyed() || !checkStateByNative();
    }
}
