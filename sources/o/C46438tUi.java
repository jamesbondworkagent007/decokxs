package o;

import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import kotlin.Result;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringNumberConversionsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tUi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C46438tUi {
    public static final Activity Companion = new Activity(null);
    public static final java.util.List<kotlin.Pair<java.lang.String, java.lang.String>> copydefault = yDY.gEmmrt(C56390yDp.OLrzqt("#FF84C0FE", "#FF6CB2FB"), C56390yDp.OLrzqt("#FFFFC75A", "#FFFFB03B"), C56390yDp.OLrzqt("#FF43D0DF", "#FF17D0E3"), C56390yDp.OLrzqt("#FFD0827F", "#FFB9625E"), C56390yDp.OLrzqt("#FFFFAB66", "#FFFF9842"), C56390yDp.OLrzqt("#FFAEBBD9", "#FF98ACD9"), C56390yDp.OLrzqt("#FF7FAF88", "#FF6DAB79"), C56390yDp.OLrzqt("#FFAC86E9", "#FF9A6EE1"), C56390yDp.OLrzqt("#FFFF5D81", "#FFFF4771"), C56390yDp.OLrzqt("#FFFF67AC", "#FFFF4D96"));
    public final java.lang.String KWHzl;
    public final java.lang.String OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C46438tUi copy$default(C46438tUi c46438tUi, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = c46438tUi.KWHzl;
        }
        if ((i & 2) != 0) {
            str2 = c46438tUi.OLrzqt;
        }
        return c46438tUi.AEQbTJ(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C46438tUi AEQbTJ(java.lang.String str, java.lang.String str2) {
        return new C46438tUi(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C46438tUi)) {
            return false;
        }
        C46438tUi c46438tUi = (C46438tUi) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) c46438tUi.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) c46438tUi.OLrzqt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        java.lang.String str = this.KWHzl;
        int iHashCode = str == null ? 0 : str.hashCode();
        java.lang.String str2 = this.OLrzqt;
        return (iHashCode * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "PlanetAvatarComposeInfo(id=" + this.KWHzl + ", text=" + this.OLrzqt + ")";
    }

    public C46438tUi(java.lang.String str, java.lang.String str2) {
        this.KWHzl = str;
        this.OLrzqt = str2;
    }

    /* JADX INFO: renamed from: o.tUi$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.tUi.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final kotlin.Pair<java.lang.String, java.lang.String> copydefault(C46438tUi c46438tUi) {
            java.lang.Character chGHZMYf;
            java.lang.String string;
            java.lang.Integer intOrNull;
            java.lang.String strEZpvd = c46438tUi.EZpvd();
            if (strEZpvd == null || (chGHZMYf = C59454zhO.gHZMYf(strEZpvd)) == null || (string = chGHZMYf.toString()) == null || (intOrNull = StringsKt__StringNumberConversionsKt.toIntOrNull(string)) == null) {
                return null;
            }
            return (kotlin.Pair) CollectionsKt___CollectionsKt.AkhnZx(C46438tUi.copydefault, intOrNull.intValue());
        }
    }

    public final android.graphics.drawable.Drawable KWHzl(@NotNull android.content.Context context, int i, float f) {
        Intrinsics.checkNotNullParameter(context, "");
        kotlin.Pair<java.lang.String, java.lang.String> pairCopydefault = Companion.copydefault(this);
        if (pairCopydefault == null) {
            return null;
        }
        return EZpvd(context, i, f, pairCopydefault);
    }

    public final android.graphics.drawable.Drawable EZpvd(android.content.Context context, int i, float f, kotlin.Pair<java.lang.String, java.lang.String> pair) {
        java.lang.Object objM7377constructorimpl;
        LayerDrawable layerDrawable;
        try {
            Result.Application application = Result.Companion;
            int iOLrzqt = C33070mpX.OLrzqt(i, context);
            java.lang.String strOLrzqt = OLrzqt();
            if (strOLrzqt != null) {
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setSize(C55298xhM.copydefault(88.0f, context), C55298xhM.copydefault(88.0f, context));
                gradientDrawable.setColors(new int[]{Color.parseColor(pair.getFirst()), Color.parseColor(pair.getSecond())});
                gradientDrawable.setGradientType(0);
                gradientDrawable.setShape(1);
                gradientDrawable.setOrientation(GradientDrawable.Orientation.BOTTOM_TOP);
                android.content.res.Resources resources = context.getResources();
                layerDrawable = new LayerDrawable(new android.graphics.drawable.Drawable[]{gradientDrawable, new C46446tUq(strOLrzqt, iOLrzqt, android.util.TypedValue.applyDimension(1, f, resources != null ? resources.getDisplayMetrics() : null))});
            } else {
                layerDrawable = null;
            }
            objM7377constructorimpl = Result.m7377constructorimpl(layerDrawable);
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        return (android.graphics.drawable.Drawable) (Result.m7383isFailureimpl(objM7377constructorimpl) ? null : objM7377constructorimpl);
    }

    public final java.lang.String OLrzqt() {
        java.util.stream.IntStream intStreamCodePoints;
        java.util.List<java.lang.Integer> listAEQbTJ;
        if (!C33129mqd.OLrzqt((java.lang.CharSequence) this.OLrzqt)) {
            return null;
        }
        java.lang.String str = this.OLrzqt;
        if (str != null && (intStreamCodePoints = str.codePoints()) != null && (listAEQbTJ = C59471zhf.AEQbTJ(intStreamCodePoints)) != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listAEQbTJ, 10));
            java.util.Iterator<T> it = listAEQbTJ.iterator();
            while (it.hasNext()) {
                char[] chars = java.lang.Character.toChars(((java.lang.Number) it.next()).intValue());
                Intrinsics.checkNotNullExpressionValue(chars, "");
                arrayList.add(new java.lang.String(chars));
            }
            java.lang.String str2 = (java.lang.String) CollectionsKt___CollectionsKt.AuCTelauCTel(arrayList);
            if (str2 != null) {
                java.lang.String upperCase = str2.toUpperCase(java.util.Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(upperCase, "");
                if (upperCase != null) {
                    return upperCase;
                }
            }
        }
        java.lang.String str3 = this.OLrzqt;
        java.lang.String upperCase2 = java.lang.String.valueOf(str3 != null ? java.lang.Character.valueOf(C59454zhO.zLjUOn((java.lang.CharSequence) str3)) : null).toUpperCase(java.util.Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase2, "");
        return upperCase2;
    }
}
