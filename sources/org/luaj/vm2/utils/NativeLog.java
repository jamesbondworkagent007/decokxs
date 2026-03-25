package org.luaj.vm2.utils;

import androidx.collection.LongSparseArray;
import o.C60032zuH;
import o.InterfaceC60044zuT;
import o.InterfaceC60046zuV;
import o.pUU;

/* JADX INFO: loaded from: classes13.dex */
@InterfaceC60044zuT
public final class NativeLog {
    public static InterfaceC60046zuV AEQbTJ;
    public static LongSparseArray<StringBuilder> EZpvd = new LongSparseArray<>();
    public static LongSparseArray<InterfaceC60046zuV> KWHzl = new LongSparseArray<>();

    public static StringBuilder copydefault(long j) {
        StringBuilder sb = EZpvd.get(j);
        if (sb != null) {
            return sb;
        }
        StringBuilder sb2 = new StringBuilder();
        EZpvd.put(j, sb2);
        return sb2;
    }

    public static void AEQbTJ(long j) {
        EZpvd.remove(j);
        KWHzl.remove(j);
    }

    public static void EZpvd(long j, InterfaceC60046zuV interfaceC60046zuV) {
        KWHzl.put(j, interfaceC60046zuV);
    }

    @InterfaceC60044zuT
    private static void log(long j, int i, String str) {
        if (i == -1) {
            EZpvd(j);
        } else if (i == 1) {
            copydefault(j).append(str);
        } else {
            if (i != 2) {
                return;
            }
            KWHzl(j, str);
        }
    }

    public static void EZpvd(long j) {
        String string = copydefault(j).toString();
        copydefault(j).setLength(0);
        if (C60032zuH.OLrzqt >= 2) {
            InterfaceC60046zuV interfaceC60046zuV = KWHzl.get(j);
            if (interfaceC60046zuV != null) {
                interfaceC60046zuV.AEQbTJ(j, "LuaLog", string);
            } else {
                pUU.EZpvd("LuaLog", string);
            }
            InterfaceC60046zuV interfaceC60046zuV2 = AEQbTJ;
            if (interfaceC60046zuV2 != null) {
                interfaceC60046zuV2.AEQbTJ(j, "LuaLog", string);
            }
        }
    }

    public static void KWHzl(long j, String str) {
        if (C60032zuH.OLrzqt >= 1) {
            InterfaceC60046zuV interfaceC60046zuV = KWHzl.get(j);
            if (interfaceC60046zuV != null) {
                interfaceC60046zuV.KWHzl(j, "LuaLog", str);
            } else {
                pUU.copydefault("LuaLog", str);
            }
            InterfaceC60046zuV interfaceC60046zuV2 = AEQbTJ;
            if (interfaceC60046zuV2 != null) {
                interfaceC60046zuV2.KWHzl(j, "LuaLog", str);
            }
        }
    }
}
