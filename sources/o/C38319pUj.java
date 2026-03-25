package o;

import android.content.res.Resources;
import com.okinc.localization.LocalizeResources;
import com.okinc.localization2.bean.AppLocaleInfo;
import com.okinc.localization2.bean.LanguageUnit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.pUj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@yCR
public final class C38319pUj {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int OLrzqt = 8;
    public final C38311pUb AEQbTJ;
    public final pTZ AYXKKw;
    public final pUA AhwBna;
    public final android.content.Context EZpvd;
    public LanguageUnit KWHzl;
    public final pTX copydefault;
    public boolean valueOf;

    public static final java.lang.CharSequence AhwBna(java.lang.String str) {
        return str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final java.lang.CharSequence[] AkhnZx(java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return new java.lang.CharSequence[]{str};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final java.lang.CharSequence[] DbNXlk(java.lang.String str) {
        if (str == null) {
            return null;
        }
        return new java.lang.CharSequence[]{str};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final java.lang.CharSequence djBIcL(java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final java.lang.CharSequence fARcdN(java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final java.lang.String[] fetchVPNInfo(java.lang.String str) {
        if (str == null) {
            return null;
        }
        return new java.lang.String[]{str};
    }

    public static final java.lang.CharSequence isConnected(java.lang.String str) {
        return str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final java.lang.String[] values(java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return new java.lang.String[]{str};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean KWHzl() {
        return this.valueOf;
    }

    @yCM
    public C38319pUj(@NotNull android.content.Context context, @NotNull pUA pua, @NotNull pTZ ptz, @NotNull pTX ptx, @NotNull C38311pUb c38311pUb) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(pua, "");
        Intrinsics.checkNotNullParameter(ptz, "");
        Intrinsics.checkNotNullParameter(ptx, "");
        Intrinsics.checkNotNullParameter(c38311pUb, "");
        this.EZpvd = context;
        this.AhwBna = pua;
        this.AYXKKw = ptz;
        this.copydefault = ptx;
        this.AEQbTJ = c38311pUb;
    }

    public final void AEQbTJ(boolean z, @NotNull LanguageUnit languageUnit) {
        Intrinsics.checkNotNullParameter(languageUnit, "");
        pUU.KWHzl("LocalizeResourceRepo", "setEmbeddedMode, enable:" + z);
        this.valueOf = z;
        if (!z) {
            languageUnit = null;
        }
        this.KWHzl = languageUnit;
    }

    public final java.lang.CharSequence copydefault(@androidx.annotation.StringRes final int i, @NotNull final LocalizeResources localizeResources) {
        Intrinsics.checkNotNullParameter(localizeResources, "");
        return (java.lang.CharSequence) AEQbTJ(i, localizeResources, new Function1() { // from class: o.pUn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C38319pUj.djBIcL(localizeResources, (java.lang.String) obj);
            }
        }, new Function0() { // from class: o.pUm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C38319pUj.djBIcL(this.OLrzqt, i);
            }
        }, new Function1() { // from class: o.pUp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C38319pUj.isConnected((java.lang.String) obj);
            }
        });
    }

    public static final java.lang.CharSequence djBIcL(LocalizeResources localizeResources, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return localizeResources.getText(str);
    }

    public static final java.lang.CharSequence djBIcL(C38319pUj c38319pUj, int i) {
        return c38319pUj.AEQbTJ(i);
    }

    public final java.lang.CharSequence AuCTel(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return (java.lang.CharSequence) AEQbTJ(str, new Function1() { // from class: o.pUs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C38319pUj.valueOf(this.EZpvd, (java.lang.String) obj);
            }
        }, new Function1() { // from class: o.pUt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C38319pUj.fARcdN((java.lang.String) obj);
            }
        });
    }

    public static final java.lang.CharSequence valueOf(C38319pUj c38319pUj, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return c38319pUj.AhwBna.AEQbTJ(str);
    }

    public final java.lang.CharSequence KWHzl(@androidx.annotation.PluralsRes final int i, final int i2, @NotNull final LocalizeResources localizeResources) {
        Intrinsics.checkNotNullParameter(localizeResources, "");
        return (java.lang.CharSequence) AEQbTJ(i, localizeResources, new Function1() { // from class: o.pUu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C38319pUj.EZpvd(localizeResources, i2, (java.lang.String) obj);
            }
        }, new Function0() { // from class: o.pUr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C38319pUj.KWHzl(this.EZpvd, i, i2);
            }
        }, new Function1() { // from class: o.pUq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C38319pUj.AhwBna((java.lang.String) obj);
            }
        });
    }

    public static final java.lang.CharSequence EZpvd(LocalizeResources localizeResources, int i, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return localizeResources.getQuantityText(str, i, null);
    }

    public static final java.lang.CharSequence KWHzl(C38319pUj c38319pUj, int i, int i2) {
        return c38319pUj.EZpvd(i, i2);
    }

    public final java.lang.CharSequence EZpvd(@NotNull java.lang.String str, final int i, final java.util.Map<java.lang.Object, ? extends java.lang.Object> map) {
        Intrinsics.checkNotNullParameter(str, "");
        return (java.lang.CharSequence) AEQbTJ(str, new Function1() { // from class: o.pUw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C38319pUj.copydefault(this.copydefault, i, map, (java.lang.String) obj);
            }
        }, new Function1() { // from class: o.pUz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C38319pUj.djBIcL((java.lang.String) obj);
            }
        });
    }

    public static final java.lang.CharSequence copydefault(C38319pUj c38319pUj, int i, java.util.Map map, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return c38319pUj.AhwBna.OLrzqt(str, i, (java.util.Map<java.lang.Object, ? extends java.lang.Object>) map);
    }

    public final java.lang.CharSequence[] EZpvd(@androidx.annotation.ArrayRes final int i, @NotNull final LocalizeResources localizeResources) {
        Intrinsics.checkNotNullParameter(localizeResources, "");
        return (java.lang.CharSequence[]) AEQbTJ(i, localizeResources, new Function1() { // from class: o.pUy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C38319pUj.KWHzl(localizeResources, (java.lang.String) obj);
            }
        }, new Function0() { // from class: o.pUx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C38319pUj.EZpvd(this.KWHzl, i);
            }
        }, new Function1() { // from class: o.pUv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C38319pUj.DbNXlk((java.lang.String) obj);
            }
        });
    }

    public static final java.lang.CharSequence[] KWHzl(LocalizeResources localizeResources, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return localizeResources.getTextArray(str);
    }

    public static final java.lang.CharSequence[] EZpvd(C38319pUj c38319pUj, int i) {
        return c38319pUj.OLrzqt(i);
    }

    public final java.lang.CharSequence[] ejfBZ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return (java.lang.CharSequence[]) AEQbTJ(str, new Function1() { // from class: o.pUB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C38319pUj.KWHzl(this.AEQbTJ, (java.lang.String) obj);
            }
        }, new Function1() { // from class: o.pUg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C38319pUj.AkhnZx((java.lang.String) obj);
            }
        });
    }

    public static final java.lang.CharSequence[] KWHzl(C38319pUj c38319pUj, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return c38319pUj.AhwBna.EZpvd(str);
    }

    public final java.lang.String[] AEQbTJ(@androidx.annotation.ArrayRes final int i, @NotNull final LocalizeResources localizeResources) {
        Intrinsics.checkNotNullParameter(localizeResources, "");
        return (java.lang.String[]) AEQbTJ(i, localizeResources, new Function1() { // from class: o.pUh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C38319pUj.OLrzqt(localizeResources, (java.lang.String) obj);
            }
        }, new Function0() { // from class: o.pUl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C38319pUj.AEQbTJ(this.AEQbTJ, i);
            }
        }, new Function1() { // from class: o.pUo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C38319pUj.fetchVPNInfo((java.lang.String) obj);
            }
        });
    }

    public static final java.lang.String[] OLrzqt(LocalizeResources localizeResources, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return localizeResources.getStringArray(str);
    }

    public static final java.lang.String[] AEQbTJ(C38319pUj c38319pUj, int i) {
        return c38319pUj.KWHzl(i);
    }

    public final java.lang.String[] fJNWhG(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return (java.lang.String[]) AEQbTJ(str, new Function1() { // from class: o.pUk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C38319pUj.EZpvd(this.AEQbTJ, (java.lang.String) obj);
            }
        }, new Function1() { // from class: o.pUi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C38319pUj.values((java.lang.String) obj);
            }
        });
    }

    public static final java.lang.String[] EZpvd(C38319pUj c38319pUj, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return c38319pUj.AhwBna.KWHzl(str);
    }

    public final <T> T AEQbTJ(@androidx.annotation.AnyRes int i, android.content.res.Resources resources, Function1<? super java.lang.String, ? extends T> function1, Function0<? extends T> function0, Function1<? super java.lang.String, ? extends T> function12) {
        try {
            java.lang.String strEZpvd = EZpvd(i, resources);
            if (Intrinsics.EZpvd((java.lang.Object) resources.getResourcePackageName(i), (java.lang.Object) "android")) {
                return function0.invoke();
            }
            if (!AEQbTJ()) {
                return function0.invoke();
            }
            if (!C38302pTt.KWHzl.OLrzqt(strEZpvd)) {
                T tInvoke = function12.invoke(strEZpvd);
                return tInvoke == null ? function0.invoke() : tInvoke;
            }
            if (this.valueOf) {
                return function0.invoke();
            }
            if (strEZpvd == null) {
                return function0.invoke();
            }
            T tInvoke2 = function1.invoke(strEZpvd);
            if (tInvoke2 != null) {
                return tInvoke2;
            }
            T tInvoke3 = function0.invoke();
            if (C38301pTs.OLrzqt.AEQbTJ(strEZpvd)) {
                pUU.KWHzl("LocalizeResourceRepo", "getResourceWithIdInternal, get no result for " + strEZpvd + ". defaultValue:" + tInvoke3 + ". " + this.AhwBna.AEQbTJ());
            }
            return tInvoke3;
        } catch (java.lang.Exception unused) {
            return function0.invoke();
        }
    }

    public final <T> T AEQbTJ(java.lang.String str, Function1<? super java.lang.String, ? extends T> function1, Function1<? super java.lang.String, ? extends T> function12) {
        try {
            if (!AEQbTJ()) {
                return null;
            }
            if (!C38302pTt.KWHzl.OLrzqt(str)) {
                return function12.invoke(str);
            }
            if (this.valueOf) {
                return null;
            }
            T tInvoke = function1.invoke(str);
            if (tInvoke == null && C38301pTs.OLrzqt.AEQbTJ(str)) {
                pUU.KWHzl("LocalizeResourceRepo", "getResourceWithNameInternal, get no result for " + str + ". " + this.AhwBna.AEQbTJ());
            }
            return tInvoke;
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    public final boolean AEQbTJ() {
        return oJV.AEQbTJ.values() != 0;
    }

    public final java.lang.CharSequence AEQbTJ(@androidx.annotation.StringRes int i) {
        java.lang.CharSequence text = OLrzqt().getText(i);
        Intrinsics.checkNotNullExpressionValue(text, "");
        return text;
    }

    public final java.lang.CharSequence EZpvd(@androidx.annotation.PluralsRes int i, int i2) {
        java.lang.CharSequence quantityText = OLrzqt().getResources().getQuantityText(i, i2);
        Intrinsics.checkNotNullExpressionValue(quantityText, "");
        return quantityText;
    }

    public final java.lang.CharSequence[] OLrzqt(@androidx.annotation.ArrayRes int i) {
        java.lang.CharSequence[] textArray = OLrzqt().getResources().getTextArray(i);
        Intrinsics.checkNotNullExpressionValue(textArray, "");
        return textArray;
    }

    public final java.lang.String[] KWHzl(@androidx.annotation.ArrayRes int i) {
        java.lang.String[] stringArray = OLrzqt().getResources().getStringArray(i);
        Intrinsics.checkNotNullExpressionValue(stringArray, "");
        return stringArray;
    }

    public final android.content.Context OLrzqt() {
        AppLocaleInfo appLocaleInfoDjBIcL = this.AEQbTJ.djBIcL();
        if (!AEQbTJ()) {
            android.content.Context context = this.EZpvd;
            Intrinsics.copydefault(context, "");
            android.content.Context baseContext = ((android.app.Application) context).getBaseContext();
            Intrinsics.checkNotNullExpressionValue(baseContext, "");
            return baseContext;
        }
        return this.AYXKKw.KWHzl(new LanguageUnit(appLocaleInfoDjBIcL.getMarket(), appLocaleInfoDjBIcL.getLanguageCode()));
    }

    public final java.lang.String EZpvd(@androidx.annotation.AnyRes int i, android.content.res.Resources resources) {
        try {
            return resources.getResourceEntryName(i);
        } catch (Resources.NotFoundException unused) {
            return null;
        }
    }

    public final java.lang.String copydefault() {
        this.copydefault.KWHzl();
        java.lang.String strAEQbTJ = this.AhwBna.AEQbTJ();
        boolean zEZpvd = this.copydefault.EZpvd();
        return this.KWHzl + ":" + zEZpvd + ":" + strAEQbTJ;
    }

    /* JADX INFO: renamed from: o.pUj$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.pUj.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }
}
