package o;

import java.util.LinkedHashMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.IndexedValue;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yXk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C56925yXk implements yWS {
    public static final java.util.List<java.lang.String> AEQbTJ;
    public static final java.util.Map<java.lang.String, java.lang.Integer> EZpvd;
    public static final ActionBar KWHzl = new ActionBar(null);
    public static final java.lang.String copydefault;
    public final java.lang.String[] AYXKKw;
    public final java.util.List<JvmProtoBuf.StringTableTypes.Record> gEmmrt;
    public final java.util.Set<java.lang.Integer> valueOf;

    /* JADX INFO: renamed from: o.yXk$StateListAnimator */
    public final /* synthetic */ class StateListAnimator {
        public static final /* synthetic */ int[] OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[JvmProtoBuf.StringTableTypes.Record.Operation.values().length];
            try {
                iArr[JvmProtoBuf.StringTableTypes.Record.Operation.NONE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[JvmProtoBuf.StringTableTypes.Record.Operation.INTERNAL_TO_CLASS_ID.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[JvmProtoBuf.StringTableTypes.Record.Operation.DESC_TO_CLASS_ID.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            OLrzqt = iArr;
        }
    }

    public C56925yXk(@NotNull java.lang.String[] strArr, @NotNull java.util.Set<java.lang.Integer> set, @NotNull java.util.List<JvmProtoBuf.StringTableTypes.Record> list) {
        Intrinsics.checkNotNullParameter(strArr, "");
        Intrinsics.checkNotNullParameter(set, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.AYXKKw = strArr;
        this.valueOf = set;
        this.gEmmrt = list;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0032  */
    @Override // o.yWS
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.String KWHzl(int i) {
        java.lang.String strSubstring;
        JvmProtoBuf.StringTableTypes.Record record = this.gEmmrt.get(i);
        if (record.hasString()) {
            strSubstring = record.getString();
        } else if (record.hasPredefinedIndex()) {
            java.util.List<java.lang.String> list = AEQbTJ;
            int size = list.size();
            int predefinedIndex = record.getPredefinedIndex();
            if (predefinedIndex >= 0 && predefinedIndex < size) {
                strSubstring = list.get(record.getPredefinedIndex());
            } else {
                strSubstring = this.AYXKKw[i];
            }
        }
        if (record.getSubstringIndexCount() >= 2) {
            java.util.List<java.lang.Integer> substringIndexList = record.getSubstringIndexList();
            Intrinsics.copydefault(substringIndexList);
            java.lang.Integer num = substringIndexList.get(0);
            java.lang.Integer num2 = substringIndexList.get(1);
            if (num.intValue() >= 0 && num.intValue() <= num2.intValue() && num2.intValue() <= strSubstring.length()) {
                Intrinsics.copydefault((java.lang.Object) strSubstring);
                Intrinsics.copydefault(num);
                int iIntValue = num.intValue();
                Intrinsics.copydefault(num2);
                strSubstring = strSubstring.substring(iIntValue, num2.intValue());
                Intrinsics.checkNotNullExpressionValue(strSubstring, "");
            }
        }
        java.lang.String strReplace$default = strSubstring;
        if (record.getReplaceCharCount() >= 2) {
            java.util.List<java.lang.Integer> replaceCharList = record.getReplaceCharList();
            Intrinsics.copydefault(replaceCharList);
            java.lang.Integer num3 = replaceCharList.get(0);
            java.lang.Integer num4 = replaceCharList.get(1);
            Intrinsics.copydefault((java.lang.Object) strReplace$default);
            strReplace$default = C59449zhJ.replace$default(strReplace$default, (char) num3.intValue(), (char) num4.intValue(), false, 4, (java.lang.Object) null);
        }
        java.lang.String strReplace$default2 = strReplace$default;
        JvmProtoBuf.StringTableTypes.Record.Operation operation = record.getOperation();
        if (operation == null) {
            operation = JvmProtoBuf.StringTableTypes.Record.Operation.NONE;
        }
        int i2 = StateListAnimator.OLrzqt[operation.ordinal()];
        if (i2 != 1) {
            if (i2 == 2) {
                Intrinsics.copydefault((java.lang.Object) strReplace$default2);
                strReplace$default2 = C59449zhJ.replace$default(strReplace$default2, '$', '.', false, 4, (java.lang.Object) null);
            } else {
                if (i2 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                if (strReplace$default2.length() >= 2) {
                    Intrinsics.copydefault((java.lang.Object) strReplace$default2);
                    strReplace$default2 = strReplace$default2.substring(1, strReplace$default2.length() - 1);
                    Intrinsics.checkNotNullExpressionValue(strReplace$default2, "");
                }
                java.lang.String str = strReplace$default2;
                Intrinsics.copydefault((java.lang.Object) str);
                strReplace$default2 = C59449zhJ.replace$default(str, '$', '.', false, 4, (java.lang.Object) null);
            }
        }
        Intrinsics.copydefault((java.lang.Object) strReplace$default2);
        return strReplace$default2;
    }

    @Override // o.yWS
    public java.lang.String OLrzqt(int i) {
        return KWHzl(i);
    }

    @Override // o.yWS
    public boolean copydefault(int i) {
        return this.valueOf.contains(java.lang.Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: o.yXk$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.yXk.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    static {
        java.lang.String strJoinToString$default = CollectionsKt___CollectionsKt.joinToString$default(yDY.gEmmrt('k', 'o', 't', 'l', 'i', 'n'), "", null, null, 0, null, null, 62, null);
        copydefault = strJoinToString$default;
        java.util.List<java.lang.String> listGEmmrt = yDY.gEmmrt(strJoinToString$default + "/Any", strJoinToString$default + "/Nothing", strJoinToString$default + "/Unit", strJoinToString$default + "/Throwable", strJoinToString$default + "/Number", strJoinToString$default + "/Byte", strJoinToString$default + "/Double", strJoinToString$default + "/Float", strJoinToString$default + "/Int", strJoinToString$default + "/Long", strJoinToString$default + "/Short", strJoinToString$default + "/Boolean", strJoinToString$default + "/Char", strJoinToString$default + "/CharSequence", strJoinToString$default + "/String", strJoinToString$default + "/Comparable", strJoinToString$default + "/Enum", strJoinToString$default + "/Array", strJoinToString$default + "/ByteArray", strJoinToString$default + "/DoubleArray", strJoinToString$default + "/FloatArray", strJoinToString$default + "/IntArray", strJoinToString$default + "/LongArray", strJoinToString$default + "/ShortArray", strJoinToString$default + "/BooleanArray", strJoinToString$default + "/CharArray", strJoinToString$default + "/Cloneable", strJoinToString$default + "/Annotation", strJoinToString$default + "/collections/Iterable", strJoinToString$default + "/collections/MutableIterable", strJoinToString$default + "/collections/Collection", strJoinToString$default + "/collections/MutableCollection", strJoinToString$default + "/collections/List", strJoinToString$default + "/collections/MutableList", strJoinToString$default + "/collections/Set", strJoinToString$default + "/collections/MutableSet", strJoinToString$default + "/collections/Map", strJoinToString$default + "/collections/MutableMap", strJoinToString$default + "/collections/Map.Entry", strJoinToString$default + "/collections/MutableMap.MutableEntry", strJoinToString$default + "/collections/Iterator", strJoinToString$default + "/collections/MutableIterator", strJoinToString$default + "/collections/ListIterator", strJoinToString$default + "/collections/MutableListIterator");
        AEQbTJ = listGEmmrt;
        java.lang.Iterable<IndexedValue> iterableDCJXGO = CollectionsKt___CollectionsKt.DCJXGO(listGEmmrt);
        LinkedHashMap linkedHashMap = new LinkedHashMap(C56548yJl.copydefault(C56423yEv.copydefault(C56403yEb.AYXKKw(iterableDCJXGO, 10)), 16));
        for (IndexedValue indexedValue : iterableDCJXGO) {
            linkedHashMap.put((java.lang.String) indexedValue.AEQbTJ(), java.lang.Integer.valueOf(indexedValue.OLrzqt()));
        }
        EZpvd = linkedHashMap;
    }
}
