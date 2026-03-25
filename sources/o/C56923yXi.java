package o;

import androidx.exifinterface.media.ExifInterface;
import com.fasterxml.jackson.core.JsonPointer;
import java.util.LinkedHashMap;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yXi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C56923yXi {
    public static final java.util.Map<java.lang.String, java.lang.String> copydefault;
    public static final C56923yXi KWHzl = new C56923yXi();
    public static final java.lang.String EZpvd = CollectionsKt___CollectionsKt.joinToString$default(yDY.gEmmrt('k', 'o', 't', 'l', 'i', 'n'), "", null, null, 0, null, null, 62, null);

    private C56923yXi() {
    }

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        java.util.List listGEmmrt = yDY.gEmmrt("Boolean", "Z", "Char", "C", "Byte", "B", "Short", ExifInterface.LATITUDE_SOUTH, "Int", "I", "Float", "F", "Long", "J", "Double", "D");
        int iEZpvd = C56453yFy.EZpvd(0, listGEmmrt.size() - 1, 2);
        if (iEZpvd >= 0) {
            int i = 0;
            while (true) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                java.lang.String str = EZpvd;
                sb.append(str);
                sb.append(JsonPointer.SEPARATOR);
                sb.append((java.lang.String) listGEmmrt.get(i));
                int i2 = i + 1;
                linkedHashMap.put(sb.toString(), listGEmmrt.get(i2));
                linkedHashMap.put(str + JsonPointer.SEPARATOR + ((java.lang.String) listGEmmrt.get(i)) + "Array", AbstractJsonLexerKt.BEGIN_LIST + ((java.lang.String) listGEmmrt.get(i2)));
                if (i == iEZpvd) {
                    break;
                } else {
                    i += 2;
                }
            }
        }
        linkedHashMap.put(EZpvd + "/Unit", ExifInterface.GPS_MEASUREMENT_INTERRUPTED);
        copydefault(linkedHashMap, "Any", "java/lang/Object");
        copydefault(linkedHashMap, "Nothing", "java/lang/Void");
        copydefault(linkedHashMap, "Annotation", "java/lang/annotation/Annotation");
        for (java.lang.String str2 : yDY.gEmmrt("String", "CharSequence", "Throwable", "Cloneable", "Number", "Comparable", "Enum")) {
            copydefault(linkedHashMap, str2, "java/lang/" + str2);
        }
        for (java.lang.String str3 : yDY.gEmmrt("Iterator", "Collection", "List", "Set", "Map", "ListIterator")) {
            copydefault(linkedHashMap, "collections/" + str3, "java/util/" + str3);
            copydefault(linkedHashMap, "collections/Mutable" + str3, "java/util/" + str3);
        }
        copydefault(linkedHashMap, "collections/Iterable", "java/lang/Iterable");
        copydefault(linkedHashMap, "collections/MutableIterable", "java/lang/Iterable");
        copydefault(linkedHashMap, "collections/Map.Entry", "java/util/Map$Entry");
        copydefault(linkedHashMap, "collections/MutableMap.MutableEntry", "java/util/Map$Entry");
        for (int i3 = 0; i3 < 23; i3++) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
            java.lang.String str4 = EZpvd;
            sb2.append(str4);
            sb2.append("/jvm/functions/Function");
            sb2.append(i3);
            copydefault(linkedHashMap, "Function" + i3, sb2.toString());
            copydefault(linkedHashMap, "reflect/KFunction" + i3, str4 + "/reflect/KFunction");
        }
        for (java.lang.String str5 : yDY.gEmmrt("Char", "Byte", "Short", "Int", "Float", "Long", "Double", "String", "Enum")) {
            copydefault(linkedHashMap, str5 + ".Companion", EZpvd + "/jvm/internal/" + str5 + "CompanionObject");
        }
        copydefault = linkedHashMap;
    }

    public static final void copydefault(java.util.Map<java.lang.String, java.lang.String> map, java.lang.String str, java.lang.String str2) {
        map.put(EZpvd + JsonPointer.SEPARATOR + str, 'L' + str2 + ';');
    }

    public static final java.lang.String OLrzqt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        java.lang.String str2 = copydefault.get(str);
        if (str2 != null) {
            return str2;
        }
        return 'L' + C59449zhJ.replace$default(str, '.', '$', false, 4, (java.lang.Object) null) + ';';
    }
}
