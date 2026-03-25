package o;

import java.lang.reflect.InvocationTargetException;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: renamed from: o.pVj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C38346pVj {
    public static final C38346pVj EZpvd = new C38346pVj();

    private C38346pVj() {
    }

    public static final java.lang.String EZpvd(android.os.Bundle bundle) {
        if (bundle == null) {
            return AbstractJsonLexerKt.NULL;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder(128);
        sb.append("Bundle[{");
        EZpvd.AEQbTJ(bundle, sb);
        sb.append("}]");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public static final java.lang.String OLrzqt(android.content.Intent intent) {
        if (intent == null) {
            return AbstractJsonLexerKt.NULL;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder(128);
        sb.append("Intent { ");
        EZpvd.AEQbTJ(intent, sb);
        sb.append(" }");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public final void AEQbTJ(android.os.Bundle bundle, java.lang.StringBuilder sb) {
        java.util.Set<java.lang.String> setKeySet = bundle.keySet();
        if (setKeySet == null) {
            return;
        }
        boolean z = true;
        for (java.lang.String str : setKeySet) {
            if (!z) {
                sb.append(", ");
            }
            sb.append(str);
            sb.append('=');
            java.lang.Object obj = bundle.get(str);
            if (obj instanceof int[]) {
                sb.append(java.util.Arrays.toString((int[]) obj));
            } else if (obj instanceof byte[]) {
                sb.append(java.util.Arrays.toString((byte[]) obj));
            } else if (obj instanceof boolean[]) {
                sb.append(java.util.Arrays.toString((boolean[]) obj));
            } else if (obj instanceof short[]) {
                sb.append(java.util.Arrays.toString((short[]) obj));
            } else if (obj instanceof long[]) {
                sb.append(java.util.Arrays.toString((long[]) obj));
            } else if (obj instanceof float[]) {
                sb.append(java.util.Arrays.toString((float[]) obj));
            } else if (obj instanceof double[]) {
                sb.append(java.util.Arrays.toString((double[]) obj));
            } else if (obj instanceof java.lang.Object[]) {
                sb.append(java.util.Arrays.toString((java.lang.Object[]) obj));
            } else if (obj instanceof android.os.Bundle) {
                sb.append(EZpvd((android.os.Bundle) obj));
            } else {
                sb.append(obj);
            }
            z = false;
        }
    }

    public final void AEQbTJ(android.content.Intent intent, java.lang.StringBuilder sb) {
        boolean z;
        java.lang.String action = intent.getAction();
        boolean z2 = false;
        boolean z3 = true;
        if (action != null) {
            sb.append("act=");
            sb.append(action);
            z = false;
        } else {
            z = true;
        }
        java.util.Set<java.lang.String> categories = intent.getCategories();
        if (categories != null) {
            if (!z) {
                sb.append(' ');
            }
            sb.append("cat=[");
            for (java.lang.String str : categories) {
                if (!z3) {
                    sb.append(AbstractJsonLexerKt.COMMA);
                }
                sb.append(str);
                z3 = false;
            }
            sb.append("]");
            z = false;
        }
        android.net.Uri data = intent.getData();
        if (data != null) {
            if (!z) {
                sb.append(' ');
            }
            sb.append("dat=");
            sb.append(EZpvd(data));
            z = false;
        }
        java.lang.String type = intent.getType();
        if (type != null) {
            if (!z) {
                sb.append(' ');
            }
            sb.append("typ=");
            sb.append(type);
            z = false;
        }
        int flags = intent.getFlags();
        if (flags != 0) {
            if (!z) {
                sb.append(' ');
            }
            sb.append("flg=0x");
            sb.append(java.lang.Integer.toHexString(flags));
            z = false;
        }
        java.lang.String str2 = intent.getPackage();
        if (str2 != null) {
            if (!z) {
                sb.append(' ');
            }
            sb.append("pkg=");
            sb.append(str2);
            z = false;
        }
        android.content.ComponentName component = intent.getComponent();
        if (component != null) {
            if (!z) {
                sb.append(' ');
            }
            sb.append("cmp=");
            sb.append(component.flattenToShortString());
            z = false;
        }
        android.graphics.Rect sourceBounds = intent.getSourceBounds();
        if (sourceBounds != null) {
            if (!z) {
                sb.append(' ');
            }
            sb.append("bnds=");
            sb.append(sourceBounds.toShortString());
            z = false;
        }
        if (intent.getClipData() != null) {
            if (!z) {
                sb.append(' ');
            }
            sb.append("(has clip)");
        } else {
            z2 = z;
        }
        android.os.Bundle extras = intent.getExtras();
        if (extras != null) {
            if (!z2) {
                sb.append(' ');
            }
            sb.append("extras={");
            AEQbTJ(extras, sb);
            sb.append(AbstractJsonLexerKt.END_OBJ);
        }
        android.content.Intent selector = intent.getSelector();
        if (selector != null) {
            sb.append(" sel=");
            AEQbTJ(selector, sb);
            sb.append("}");
        }
    }

    public final java.lang.String EZpvd(android.net.Uri uri) {
        try {
            java.lang.reflect.Method declaredMethod = android.net.Uri.class.getDeclaredMethod("toSafeString", new java.lang.Class[0]);
            declaredMethod.setAccessible(true);
            java.lang.Object objInvoke = declaredMethod.invoke(uri, new java.lang.Object[0]);
            Intrinsics.copydefault(objInvoke, "");
            return (java.lang.String) objInvoke;
        } catch (java.lang.IllegalAccessException e) {
            e.printStackTrace();
            return uri.toString();
        } catch (java.lang.NoSuchMethodException e2) {
            e2.printStackTrace();
            return uri.toString();
        } catch (InvocationTargetException e3) {
            e3.printStackTrace();
            return uri.toString();
        }
    }
}
