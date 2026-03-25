package com.immomo.mls.fun.ud;

import com.immomo.mls.fun.ud.view.UDView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import o.C7326ahi;
import o.C7833arL;
import o.C7910asj;
import o.InterfaceC60044zuT;
import o.InterfaceC8009aud;
import o.InterfaceC8012aug;
import org.luaj.vm2.Globals;
import org.luaj.vm2.LuaUserdata;
import org.luaj.vm2.LuaValue;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC60044zuT
public class UDArray extends LuaUserdata<List> {
    public static final InterfaceC8009aud<UDArray, List> AEQbTJ = new InterfaceC8009aud<UDArray, List>() { // from class: com.immomo.mls.fun.ud.UDArray.4
        /* JADX DEBUG: Method merged with bridge method: KWHzl(Lorg/luaj/vm2/Globals;Ljava/lang/Object;)Lorg/luaj/vm2/LuaValue; */
        @Override // o.InterfaceC8009aud
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public UDArray KWHzl(Globals globals, List list) {
            return new UDArray(globals, list);
        }
    };
    public static final InterfaceC8012aug<LuaValue, List> OLrzqt = new InterfaceC8012aug<LuaValue, List>() { // from class: com.immomo.mls.fun.ud.UDArray.5
        /* JADX DEBUG: Method merged with bridge method: copydefault(Lorg/luaj/vm2/LuaValue;)Ljava/lang/Object; */
        @Override // o.InterfaceC8012aug
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public List copydefault(LuaValue luaValue) {
            if (!luaValue.isTable()) {
                return (List) ((UDArray) luaValue).javaUserdata;
            }
            return C7910asj.copydefault(luaValue.toLuaTable());
        }
    };

    public static native void _init();

    public static native void _register(long j, String str);

    @InterfaceC60044zuT
    public boolean isArray() {
        return true;
    }

    public UDArray(Globals globals, List list) {
        super(globals, list);
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [T, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v3, types: [T, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v2, types: [T, java.util.List] */
    public UDArray(Globals globals, Collection collection) {
        super(globals, (Object) null);
        if (collection instanceof List) {
            this.javaUserdata = (List) collection;
        } else if (collection != null) {
            this.javaUserdata = new ArrayList(collection);
        } else {
            this.javaUserdata = new ArrayList(0);
        }
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [T, java.util.ArrayList] */
    @InterfaceC60044zuT
    public UDArray(long j) {
        super(j, (LuaValue[]) null);
        this.javaUserdata = new ArrayList(10);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [T, java.util.ArrayList] */
    @InterfaceC60044zuT
    public UDArray(long j, int i) {
        super(j, (LuaValue[]) null);
        this.javaUserdata = new ArrayList(i);
    }

    public List EZpvd() {
        return (List) this.javaUserdata;
    }

    public Object AEQbTJ(LuaValue luaValue) {
        if (luaValue == null || luaValue.isNil()) {
            return null;
        }
        if (luaValue instanceof UDView) {
            return luaValue;
        }
        if (luaValue.isTable()) {
            return C7910asj.AEQbTJ(luaValue.toLuaTable());
        }
        return luaValue.toUserdata().getJavaUserdata();
    }

    @InterfaceC60044zuT
    public void add(boolean z) {
        ((List) this.javaUserdata).add(Boolean.valueOf(z));
    }

    @InterfaceC60044zuT
    public void add(double d) {
        ((List) this.javaUserdata).add(AEQbTJ(d));
    }

    @InterfaceC60044zuT
    public void add(String str) {
        ((List) this.javaUserdata).add(str);
    }

    @InterfaceC60044zuT
    public void add(LuaValue luaValue) {
        ((List) this.javaUserdata).add(AEQbTJ(luaValue));
    }

    @InterfaceC60044zuT
    public void addAll(UDArray uDArray) {
        ((List) this.javaUserdata).addAll((Collection) uDArray.javaUserdata);
    }

    @InterfaceC60044zuT
    public void remove(int i) {
        ((List) this.javaUserdata).remove(i - 1);
    }

    @InterfaceC60044zuT
    public void removeObject(double d) {
        ((List) this.javaUserdata).remove(AEQbTJ(d));
    }

    @InterfaceC60044zuT
    public void removeObject(boolean z) {
        ((List) this.javaUserdata).remove(Boolean.valueOf(z));
    }

    @InterfaceC60044zuT
    public void removeObject(String str) {
        ((List) this.javaUserdata).remove(str);
    }

    @InterfaceC60044zuT
    public void removeObject(LuaValue luaValue) {
        ((List) this.javaUserdata).remove(AEQbTJ(luaValue));
    }

    @InterfaceC60044zuT
    public void removeObjects(UDArray uDArray) {
        ((List) this.javaUserdata).removeAll((Collection) uDArray.javaUserdata);
    }

    @InterfaceC60044zuT
    public void removeObjectsAtRange(int i, int i2) {
        int i3 = i - 1;
        int i4 = i2 - 1;
        if ((i3 < ((List) this.javaUserdata).size() && i4 < ((List) this.javaUserdata).size()) || !C7326ahi.EZpvd) {
            for (int i5 = i3; i5 <= i4; i5++) {
                ((List) this.javaUserdata).remove(i3);
            }
            return;
        }
        throw new IndexOutOfBoundsException("removeObjectsAtRange from = " + i3 + "  to =" + i4 + " , more than source array length: " + ((List) this.javaUserdata).size());
    }

    @InterfaceC60044zuT
    public void removeAll() {
        ((List) this.javaUserdata).clear();
    }

    @Override // org.luaj.vm2.LuaValue
    @InterfaceC60044zuT
    public LuaValue get(int i) {
        int i2 = i - 1;
        if (i2 < 0 || i2 >= ((List) this.javaUserdata).size()) {
            C7833arL.valueOf("The index out of range!", this.globals);
            return null;
        }
        return C7910asj.KWHzl(getGlobals(), ((List) this.javaUserdata).get(i2));
    }

    @InterfaceC60044zuT
    public int size() {
        return ((List) this.javaUserdata).size();
    }

    @InterfaceC60044zuT
    public boolean contains(double d) {
        return ((List) this.javaUserdata).contains(AEQbTJ(d));
    }

    @InterfaceC60044zuT
    public boolean contains(boolean z) {
        return ((List) this.javaUserdata).contains(Boolean.valueOf(z));
    }

    @InterfaceC60044zuT
    public boolean contains(String str) {
        if (str.contains("isArray")) {
            return true;
        }
        return ((List) this.javaUserdata).contains(str);
    }

    @InterfaceC60044zuT
    public boolean contains(LuaValue luaValue) {
        return ((List) this.javaUserdata).contains(AEQbTJ(luaValue));
    }

    @InterfaceC60044zuT
    public void insert(int i, double d) {
        ((List) this.javaUserdata).add(i - 1, AEQbTJ(d));
    }

    @InterfaceC60044zuT
    public void insert(int i, boolean z) {
        ((List) this.javaUserdata).add(i - 1, Boolean.valueOf(z));
    }

    @InterfaceC60044zuT
    public void insert(int i, String str) {
        ((List) this.javaUserdata).add(i - 1, str);
    }

    @InterfaceC60044zuT
    public void insert(int i, LuaValue luaValue) {
        ((List) this.javaUserdata).add(i - 1, AEQbTJ(luaValue));
    }

    @InterfaceC60044zuT
    public void insertObjects(int i, UDArray uDArray) {
        ((List) this.javaUserdata).addAll(i - 1, (Collection) uDArray.javaUserdata);
    }

    @InterfaceC60044zuT
    public void replace(int i, double d) {
        ((List) this.javaUserdata).set(i - 1, AEQbTJ(d));
    }

    @InterfaceC60044zuT
    public void replace(int i, boolean z) {
        ((List) this.javaUserdata).set(i - 1, Boolean.valueOf(z));
    }

    @InterfaceC60044zuT
    public void replace(int i, String str) {
        ((List) this.javaUserdata).set(i - 1, str);
    }

    @InterfaceC60044zuT
    public void replace(int i, LuaValue luaValue) {
        ((List) this.javaUserdata).set(i - 1, AEQbTJ(luaValue));
    }

    @InterfaceC60044zuT
    public void replaceObjects(int i, UDArray uDArray) {
        int i2 = i - 1;
        List list = (List) uDArray.javaUserdata;
        int size = list.size();
        if (i2 + size <= ((List) this.javaUserdata).size()) {
            for (int i3 = 0; i3 < size; i3++) {
                ((List) this.javaUserdata).set(i3 + i2, list.get(i3));
            }
            return;
        }
        throw new IndexOutOfBoundsException("replace from " + i2 + " and length " + size + ", more than source array length: " + ((List) this.javaUserdata).size());
    }

    public Object AEQbTJ(double d) {
        int i = (int) d;
        if (d == i) {
            return Integer.valueOf(i);
        }
        long j = (long) d;
        if (d == j) {
            return Long.valueOf(j);
        }
        return Double.valueOf(d);
    }

    @InterfaceC60044zuT
    public void exchange(int i, int i2) {
        int i3 = i - 1;
        int i4 = i2 - 1;
        Object obj = ((List) this.javaUserdata).get(i3);
        ((List) this.javaUserdata).set(i3, ((List) this.javaUserdata).get(i4));
        ((List) this.javaUserdata).set(i4, obj);
    }

    @InterfaceC60044zuT
    public UDArray subArray(int i, int i2) {
        int i3 = i - 1;
        if ((i3 > i2 || i2 > ((List) this.javaUserdata).size() || i3 < 0) && C7326ahi.EZpvd) {
            throw new IndexOutOfBoundsException("subArray from = " + i3 + "  to =" + i2 + " ,  illegal arguments ");
        }
        return new UDArray(getGlobals(), ((List) this.javaUserdata).subList(i3, i2));
    }

    @InterfaceC60044zuT
    public UDArray copyArray() {
        return new UDArray(getGlobals(), (List) new ArrayList((Collection) this.javaUserdata));
    }

    @Override // org.luaj.vm2.LuaUserdata, org.luaj.vm2.NLuaValue, org.luaj.vm2.LuaValue
    public String toString() {
        return ((List) this.javaUserdata).toString();
    }
}
