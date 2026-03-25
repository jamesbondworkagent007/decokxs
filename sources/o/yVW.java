package o;

import androidx.exifinterface.media.ExifInterface;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.yVX;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class yVW implements yVY<yVX> {
    public static final yVW copydefault = new yVW();

    public final /* synthetic */ class ActionBar {
        public static final /* synthetic */ int[] EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[PrimitiveType.values().length];
            try {
                iArr[PrimitiveType.BOOLEAN.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[PrimitiveType.CHAR.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[PrimitiveType.BYTE.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[PrimitiveType.SHORT.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[PrimitiveType.INT.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr[PrimitiveType.FLOAT.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                iArr[PrimitiveType.LONG.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                iArr[PrimitiveType.DOUBLE.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            EZpvd = iArr;
        }
    }

    private yVW() {
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // o.yVY
    public yVX KWHzl(@NotNull yVX yvx) {
        Intrinsics.checkNotNullParameter(yvx, "");
        if (!(yvx instanceof yVX.Activity)) {
            return yvx;
        }
        yVX.Activity activity = (yVX.Activity) yvx;
        if (activity.valueOf() == null) {
            return yvx;
        }
        java.lang.String strKWHzl = yZQ.AEQbTJ(activity.valueOf().getWrapperFqName()).KWHzl();
        Intrinsics.checkNotNullExpressionValue(strKWHzl, "");
        return copydefault(strKWHzl);
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Ljava/lang/String;)Ljava/lang/Object; */
    @Override // o.yVY
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public yVX KWHzl(@NotNull java.lang.String str) {
        JvmPrimitiveType jvmPrimitiveType;
        Intrinsics.checkNotNullParameter(str, "");
        str.length();
        char cCharAt = str.charAt(0);
        JvmPrimitiveType[] jvmPrimitiveTypeArrValues = JvmPrimitiveType.values();
        int length = jvmPrimitiveTypeArrValues.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                jvmPrimitiveType = null;
                break;
            }
            jvmPrimitiveType = jvmPrimitiveTypeArrValues[i];
            if (jvmPrimitiveType.getDesc().charAt(0) == cCharAt) {
                break;
            }
            i++;
        }
        if (jvmPrimitiveType != null) {
            return new yVX.Activity(jvmPrimitiveType);
        }
        if (cCharAt == 'V') {
            return new yVX.Activity(null);
        }
        if (cCharAt == '[') {
            java.lang.String strSubstring = str.substring(1);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "");
            return new yVX.Application(KWHzl(strSubstring));
        }
        if (cCharAt == 'L') {
            StringsKt__StringsKt.endsWith$default((java.lang.CharSequence) str, ';', false, 2, (java.lang.Object) null);
        }
        java.lang.String strSubstring2 = str.substring(1, str.length() - 1);
        Intrinsics.checkNotNullExpressionValue(strSubstring2, "");
        return new yVX.ActionBar(strSubstring2);
    }

    /* JADX DEBUG: Method merged with bridge method: OLrzqt(Lkotlin/reflect/jvm/internal/impl/builtins/PrimitiveType;)Ljava/lang/Object; */
    @Override // o.yVY
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public yVX OLrzqt(@NotNull PrimitiveType primitiveType) {
        Intrinsics.checkNotNullParameter(primitiveType, "");
        switch (ActionBar.EZpvd[primitiveType.ordinal()]) {
            case 1:
                return yVX.copydefault.KWHzl();
            case 2:
                return yVX.copydefault.EZpvd();
            case 3:
                return yVX.copydefault.OLrzqt();
            case 4:
                return yVX.copydefault.valueOf();
            case 5:
                return yVX.copydefault.AhwBna();
            case 6:
                return yVX.copydefault.copydefault();
            case 7:
                return yVX.copydefault.djBIcL();
            case 8:
                return yVX.copydefault.AEQbTJ();
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX DEBUG: Method merged with bridge method: copydefault(Ljava/lang/String;)Ljava/lang/Object; */
    @Override // o.yVY
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public yVX.ActionBar copydefault(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return new yVX.ActionBar(str);
    }

    /* JADX DEBUG: Method merged with bridge method: OLrzqt(Ljava/lang/Object;)Ljava/lang/String; */
    @Override // o.yVY
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public java.lang.String OLrzqt(@NotNull yVX yvx) {
        java.lang.String desc;
        Intrinsics.checkNotNullParameter(yvx, "");
        if (yvx instanceof yVX.Application) {
            return AbstractJsonLexerKt.BEGIN_LIST + OLrzqt(((yVX.Application) yvx).valueOf());
        }
        if (yvx instanceof yVX.Activity) {
            JvmPrimitiveType jvmPrimitiveTypeValueOf = ((yVX.Activity) yvx).valueOf();
            return (jvmPrimitiveTypeValueOf == null || (desc = jvmPrimitiveTypeValueOf.getDesc()) == null) ? ExifInterface.GPS_MEASUREMENT_INTERRUPTED : desc;
        }
        if (!(yvx instanceof yVX.ActionBar)) {
            throw new NoWhenBranchMatchedException();
        }
        return 'L' + ((yVX.ActionBar) yvx).AYXKKw() + ';';
    }

    /* JADX DEBUG: Method merged with bridge method: EZpvd()Ljava/lang/Object; */
    @Override // o.yVY
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public yVX EZpvd() {
        return copydefault("java/lang/Class");
    }
}
