package o;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yXq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C56931yXq {

    /* JADX INFO: renamed from: o.yXq$Application */
    public final /* synthetic */ class Application {
        public static final /* synthetic */ int[] OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[kotlin.reflect.jvm.internal.impl.name.State.values().length];
            try {
                iArr[kotlin.reflect.jvm.internal.impl.name.State.BEGINNING.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[kotlin.reflect.jvm.internal.impl.name.State.AFTER_DOT.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[kotlin.reflect.jvm.internal.impl.name.State.MIDDLE.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            OLrzqt = iArr;
        }
    }

    public static final boolean OLrzqt(@NotNull C56933yXs c56933yXs, @NotNull C56933yXs c56933yXs2) {
        Intrinsics.checkNotNullParameter(c56933yXs, "");
        Intrinsics.checkNotNullParameter(c56933yXs2, "");
        if (Intrinsics.EZpvd(c56933yXs, c56933yXs2) || c56933yXs2.AEQbTJ()) {
            return true;
        }
        return KWHzl(c56933yXs.KWHzl(), c56933yXs2.KWHzl());
    }

    public static final boolean EZpvd(@NotNull C56933yXs c56933yXs, @NotNull C56933yXs c56933yXs2) {
        Intrinsics.checkNotNullParameter(c56933yXs, "");
        Intrinsics.checkNotNullParameter(c56933yXs2, "");
        return Intrinsics.EZpvd(EZpvd(c56933yXs), c56933yXs2);
    }

    public static final boolean KWHzl(java.lang.String str, java.lang.String str2) {
        return C59449zhJ.startsWith$default(str, str2, false, 2, null) && str.charAt(str2.length()) == '.';
    }

    public static final C56933yXs AEQbTJ(@NotNull C56933yXs c56933yXs, @NotNull C56933yXs c56933yXs2) {
        Intrinsics.checkNotNullParameter(c56933yXs, "");
        Intrinsics.checkNotNullParameter(c56933yXs2, "");
        if (!OLrzqt(c56933yXs, c56933yXs2) || c56933yXs2.AEQbTJ()) {
            return c56933yXs;
        }
        if (Intrinsics.EZpvd(c56933yXs, c56933yXs2)) {
            return C56933yXs.EZpvd;
        }
        java.lang.String strSubstring = c56933yXs.KWHzl().substring(c56933yXs2.KWHzl().length() + 1);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "");
        return new C56933yXs(strSubstring);
    }

    public static final C56933yXs EZpvd(@NotNull C56933yXs c56933yXs) {
        Intrinsics.checkNotNullParameter(c56933yXs, "");
        if (c56933yXs.AEQbTJ()) {
            return null;
        }
        return c56933yXs.EZpvd();
    }

    public static final boolean AEQbTJ(java.lang.String str) {
        if (str == null) {
            return false;
        }
        kotlin.reflect.jvm.internal.impl.name.State state = kotlin.reflect.jvm.internal.impl.name.State.BEGINNING;
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            int i2 = Application.OLrzqt[state.ordinal()];
            if (i2 == 1 || i2 == 2) {
                if (!java.lang.Character.isJavaIdentifierStart(cCharAt)) {
                    return false;
                }
                state = kotlin.reflect.jvm.internal.impl.name.State.MIDDLE;
            } else {
                if (i2 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                if (cCharAt == '.') {
                    state = kotlin.reflect.jvm.internal.impl.name.State.AFTER_DOT;
                } else if (!java.lang.Character.isJavaIdentifierPart(cCharAt)) {
                    return false;
                }
            }
        }
        return state != kotlin.reflect.jvm.internal.impl.name.State.AFTER_DOT;
    }

    public static final <V> V copydefault(@NotNull C56933yXs c56933yXs, @NotNull java.util.Map<C56933yXs, ? extends V> map) {
        java.lang.Object next;
        Intrinsics.checkNotNullParameter(c56933yXs, "");
        Intrinsics.checkNotNullParameter(map, "");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<C56933yXs, ? extends V> entry : map.entrySet()) {
            C56933yXs key = entry.getKey();
            if (Intrinsics.EZpvd(c56933yXs, key) || EZpvd(c56933yXs, key)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        if (!(!linkedHashMap.isEmpty())) {
            linkedHashMap = null;
        }
        if (linkedHashMap == null) {
            return null;
        }
        java.util.Iterator it = linkedHashMap.entrySet().iterator();
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                int length = AEQbTJ((C56933yXs) ((Map.Entry) next).getKey(), c56933yXs).KWHzl().length();
                do {
                    java.lang.Object next2 = it.next();
                    int length2 = AEQbTJ((C56933yXs) ((Map.Entry) next2).getKey(), c56933yXs).KWHzl().length();
                    if (length > length2) {
                        next = next2;
                        length = length2;
                    }
                } while (it.hasNext());
            }
        } else {
            next = null;
        }
        Map.Entry entry2 = (Map.Entry) next;
        if (entry2 != null) {
            return (V) entry2.getValue();
        }
        return null;
    }
}
