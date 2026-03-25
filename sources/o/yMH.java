package o;

import java.util.LinkedHashSet;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.UnsignedArrayType;
import kotlin.reflect.jvm.internal.impl.builtins.UnsignedType;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class yMH {
    public static final java.util.Set<C56935yXu> AEQbTJ;
    public static final yMH EZpvd = new yMH();
    public static final java.util.Set<C56935yXu> KWHzl;
    public static final java.util.HashMap<C56929yXo, C56929yXo> OLrzqt;
    public static final java.util.HashMap<UnsignedArrayType, C56935yXu> copydefault;
    public static final java.util.Set<C56935yXu> djBIcL;
    public static final java.util.HashMap<C56929yXo, C56929yXo> valueOf;

    private yMH() {
    }

    static {
        UnsignedType[] unsignedTypeArrValues = UnsignedType.values();
        java.util.ArrayList arrayList = new java.util.ArrayList(unsignedTypeArrValues.length);
        for (UnsignedType unsignedType : unsignedTypeArrValues) {
            arrayList.add(unsignedType.getTypeName());
        }
        djBIcL = CollectionsKt___CollectionsKt.OqFWZa(arrayList);
        UnsignedArrayType[] unsignedArrayTypeArrValues = UnsignedArrayType.values();
        java.util.ArrayList arrayList2 = new java.util.ArrayList(unsignedArrayTypeArrValues.length);
        for (UnsignedArrayType unsignedArrayType : unsignedArrayTypeArrValues) {
            arrayList2.add(unsignedArrayType.getTypeName());
        }
        KWHzl = CollectionsKt___CollectionsKt.OqFWZa(arrayList2);
        OLrzqt = new java.util.HashMap<>();
        valueOf = new java.util.HashMap<>();
        copydefault = C56424yEw.AYXKKw(C56390yDp.OLrzqt(UnsignedArrayType.UBYTEARRAY, C56935yXu.AEQbTJ("ubyteArrayOf")), C56390yDp.OLrzqt(UnsignedArrayType.USHORTARRAY, C56935yXu.AEQbTJ("ushortArrayOf")), C56390yDp.OLrzqt(UnsignedArrayType.UINTARRAY, C56935yXu.AEQbTJ("uintArrayOf")), C56390yDp.OLrzqt(UnsignedArrayType.ULONGARRAY, C56935yXu.AEQbTJ("ulongArrayOf")));
        UnsignedType[] unsignedTypeArrValues2 = UnsignedType.values();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (UnsignedType unsignedType2 : unsignedTypeArrValues2) {
            linkedHashSet.add(unsignedType2.getArrayClassId().AYXKKw());
        }
        AEQbTJ = linkedHashSet;
        for (UnsignedType unsignedType3 : UnsignedType.values()) {
            OLrzqt.put(unsignedType3.getArrayClassId(), unsignedType3.getClassId());
            valueOf.put(unsignedType3.getClassId(), unsignedType3.getArrayClassId());
        }
    }

    public final boolean AEQbTJ(@NotNull C56935yXu c56935yXu) {
        Intrinsics.checkNotNullParameter(c56935yXu, "");
        return AEQbTJ.contains(c56935yXu);
    }

    public final C56929yXo KWHzl(@NotNull C56929yXo c56929yXo) {
        Intrinsics.checkNotNullParameter(c56929yXo, "");
        return OLrzqt.get(c56929yXo);
    }

    public static final boolean copydefault(@NotNull AbstractC59233zdF abstractC59233zdF) {
        InterfaceC56663yNs interfaceC56663yNsKWHzl;
        Intrinsics.checkNotNullParameter(abstractC59233zdF, "");
        if (C59322zep.DbNXlk(abstractC59233zdF) || (interfaceC56663yNsKWHzl = abstractC59233zdF.djBIcL().OLrzqt()) == null) {
            return false;
        }
        return EZpvd.AEQbTJ(interfaceC56663yNsKWHzl);
    }

    public final boolean AEQbTJ(@NotNull InterfaceC56665yNu interfaceC56665yNu) {
        Intrinsics.checkNotNullParameter(interfaceC56665yNu, "");
        InterfaceC56665yNu interfaceC56665yNuAYXKKw = interfaceC56665yNu.AuCTel();
        return (interfaceC56665yNuAYXKKw instanceof yNW) && Intrinsics.EZpvd(((yNW) interfaceC56665yNuAYXKKw).KWHzl(), yMB.AEQbTJ) && djBIcL.contains(interfaceC56665yNu.bR_());
    }
}
