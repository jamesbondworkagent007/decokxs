package o;

import androidx.core.content.res.ResourcesCompat;
import androidx.core.graphics.TypefaceCompat;
import com.okinc.base.thread.TPM;
import com.okinc.uilab.font.FontManager$downloadFonts$1;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.CoroutineScopeKt;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xce, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C55051xce {
    public static Function2<? super java.lang.String, ? super java.lang.String, Unit> gEmmrt;
    public static final C55051xce OLrzqt = new C55051xce();
    public static int AEQbTJ = C52761wXj.Dialog.KWHzl;
    public static int KWHzl = C52761wXj.Dialog.AEQbTJ;
    public static int EZpvd = C52761wXj.Dialog.EZpvd;
    public static final java.util.HashMap<java.lang.String, android.graphics.Typeface> djBIcL = new java.util.HashMap<>();
    public static final java.util.Map<java.lang.String, java.lang.Integer> AhwBna = C56424yEw.gEmmrt(C56390yDp.OLrzqt("harmony_sans_regular.ttf", java.lang.Integer.valueOf(AEQbTJ)), C56390yDp.OLrzqt("harmony_sans_medium.ttf", java.lang.Integer.valueOf(KWHzl)), C56390yDp.OLrzqt("harmony_sans_bold.ttf", java.lang.Integer.valueOf(EZpvd)));
    public static final ConcurrentHashMap<java.lang.String, android.graphics.Typeface> AYXKKw = new ConcurrentHashMap<>();
    public static final AtomicBoolean valueOf = new AtomicBoolean();
    public static final int copydefault = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(Function2<? super java.lang.String, ? super java.lang.String, Unit> function2) {
        gEmmrt = function2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: kotlin.jvm.functions.Function2<? super java.lang.String, ? super java.lang.String, kotlin.Unit>, kotlin.jvm.functions.Function2<java.lang.String, java.lang.String, kotlin.Unit> */
    public final Function2<java.lang.String, java.lang.String, Unit> EZpvd() {
        return gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return "/cdn/mobile/resources/fonts/okuilib/";
    }

    private C55051xce() {
    }

    public final android.graphics.Typeface copydefault(int i, java.lang.String str) {
        java.util.HashMap<java.lang.String, android.graphics.Typeface> map = djBIcL;
        if (map.get(str) == null) {
            android.graphics.Typeface font = ResourcesCompat.getFont(C52762wXk.AEQbTJ(), i);
            if (font == null) {
                return font;
            }
            map.put(str, font);
            return font;
        }
        return map.get(str);
    }

    public final android.graphics.Typeface KWHzl(int i) {
        return AEQbTJ(i != 0 ? i != 1 ? i != 2 ? null : "harmony_sans_bold.ttf" : "harmony_sans_medium.ttf" : "harmony_sans_regular.ttf");
    }

    public final android.graphics.Typeface AEQbTJ(java.lang.String str) {
        java.lang.Integer numCopydefault;
        if (str == null || (numCopydefault = copydefault(str)) == null) {
            return null;
        }
        return copydefault(numCopydefault.intValue(), str);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Integer copydefault(java.lang.String str) {
        int iOLrzqt;
        int iHashCode = str.hashCode();
        if (iHashCode != -1932827168) {
            if (iHashCode == -1735923280) {
                if (str.equals("harmony_sans_bold.ttf")) {
                    iOLrzqt = C55366xib.OLrzqt(C52761wXj.ActionBar.QwvEab, C52762wXk.AEQbTJ());
                }
            } else {
                iOLrzqt = (iHashCode == -1551864575 && str.equals("harmony_sans_regular.ttf")) ? C55366xib.OLrzqt(C52761wXj.ActionBar.Dmq, C52762wXk.AEQbTJ()) : 0;
            }
        } else if (str.equals("harmony_sans_medium.ttf")) {
            iOLrzqt = C55366xib.OLrzqt(C52761wXj.ActionBar.zblBkD, C52762wXk.AEQbTJ());
        }
        if (iOLrzqt <= 0) {
            return AhwBna.get(str);
        }
        return java.lang.Integer.valueOf(iOLrzqt);
    }

    public static /* synthetic */ android.graphics.Typeface getRegular$default(C55051xce c55051xce, int i, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = C52762wXk.KWHzl();
        }
        return c55051xce.AEQbTJ(i);
    }

    public final android.graphics.Typeface AEQbTJ(@androidx.annotation.StyleRes int i) {
        android.content.Context contextOLrzqt = C52759wXh.AEQbTJ.OLrzqt(i);
        return ResourcesCompat.getFont(contextOLrzqt, C55366xib.OLrzqt(C52761wXj.ActionBar.Dmq, contextOLrzqt));
    }

    public final android.graphics.Typeface valueOf() {
        android.app.Application applicationAEQbTJ = C52762wXk.AEQbTJ();
        return ResourcesCompat.getFont(applicationAEQbTJ, C55366xib.OLrzqt(C52761wXj.ActionBar.Dmq, applicationAEQbTJ));
    }

    public final android.graphics.Typeface OLrzqt() {
        android.app.Application applicationAEQbTJ = C52762wXk.AEQbTJ();
        return ResourcesCompat.getFont(applicationAEQbTJ, C55366xib.OLrzqt(C52761wXj.ActionBar.zblBkD, applicationAEQbTJ));
    }

    public final android.graphics.Typeface AEQbTJ() {
        android.app.Application applicationAEQbTJ = C52762wXk.AEQbTJ();
        return ResourcesCompat.getFont(applicationAEQbTJ, C55366xib.OLrzqt(C52761wXj.ActionBar.QwvEab, applicationAEQbTJ));
    }

    public final android.graphics.Typeface copydefault() {
        return getDynamicFont$default(this, "OKXSansTAB-Light.otf", 300, null, 4, null);
    }

    public final android.graphics.Typeface djBIcL() {
        return getDynamicFont$default(this, "OKXSansTAB-Thin.otf", 100, null, 4, null);
    }

    public static /* synthetic */ android.graphics.Typeface getDynamicFont$default(C55051xce c55051xce, java.lang.String str, int i, android.graphics.Typeface typeface, int i2, java.lang.Object obj) {
        if ((i2 & 4) != 0) {
            typeface = c55051xce.valueOf();
        }
        return c55051xce.AEQbTJ(str, i, typeface);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final android.graphics.Typeface AEQbTJ(java.lang.String str, int i, android.graphics.Typeface typeface) {
        java.lang.Object objM7377constructorimpl;
        java.util.Locale locale = C52762wXk.AEQbTJ().getResources().getConfiguration().getLocales().get(0);
        if (locale != null) {
            java.util.List<java.lang.String> listGEmmrt = yDY.gEmmrt("ar", "hi", "th", "vi", "zh");
            if ((listGEmmrt instanceof java.util.Collection) && listGEmmrt.isEmpty()) {
                if (OLrzqt(str)) {
                }
            } else {
                for (java.lang.String str2 : listGEmmrt) {
                    java.lang.String language = locale.getLanguage();
                    Intrinsics.checkNotNullExpressionValue(language, "");
                    java.lang.String lowerCase = language.toLowerCase(java.util.Locale.ROOT);
                    Intrinsics.checkNotNullExpressionValue(lowerCase, "");
                    if (StringsKt__StringsKt.contains$default((java.lang.CharSequence) lowerCase, (java.lang.CharSequence) str2, false, 2, (java.lang.Object) null)) {
                        break;
                    }
                }
                if (OLrzqt(str)) {
                    java.io.File fileEZpvd = EZpvd(str);
                    ConcurrentHashMap<java.lang.String, android.graphics.Typeface> concurrentHashMap = AYXKKw;
                    android.graphics.Typeface typeface2 = concurrentHashMap.get(fileEZpvd.getAbsolutePath());
                    if (typeface2 != null) {
                        return typeface2;
                    }
                    try {
                        Result.Application application = Result.Companion;
                        android.graphics.Typeface typefaceCreate = TypefaceCompat.create(C52762wXk.AEQbTJ(), android.graphics.Typeface.createFromFile(fileEZpvd), i, false);
                        concurrentHashMap.put(fileEZpvd.getAbsolutePath(), typefaceCreate);
                        objM7377constructorimpl = Result.m7377constructorimpl(typefaceCreate);
                    } catch (java.lang.Throwable th) {
                        Result.Application application2 = Result.Companion;
                        objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                    }
                    java.lang.Object obj = typeface;
                    if (!Result.m7383isFailureimpl(objM7377constructorimpl)) {
                        obj = objM7377constructorimpl;
                    }
                    return (android.graphics.Typeface) obj;
                }
            }
        }
        downloadFonts$default(this, 0L, 1, null);
        return typeface;
    }

    public final boolean gEmmrt() {
        return OLrzqt("OKXSansTAB-Light.otf");
    }

    public final boolean AhwBna() {
        return OLrzqt("OKXSansTAB-Thin.otf");
    }

    public final boolean OLrzqt(java.lang.String str) {
        java.io.File fileEZpvd = EZpvd(str);
        return fileEZpvd.exists() && fileEZpvd.isFile();
    }

    public final java.io.File EZpvd(java.lang.String str) {
        return new java.io.File(new java.io.File(C52762wXk.AEQbTJ().getFilesDir(), "fonts"), str);
    }

    public static /* synthetic */ void downloadFonts$default(C55051xce c55051xce, long j, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            j = 0;
        }
        c55051xce.AEQbTJ(j);
    }

    public final void AEQbTJ(long j) {
        if (gEmmrt() && AhwBna()) {
            return;
        }
        AtomicBoolean atomicBoolean = valueOf;
        if (atomicBoolean.get() || gEmmrt == null) {
            return;
        }
        atomicBoolean.compareAndSet(false, true);
        C6783aVr.EZpvd(CoroutineScopeKt.MainScope(), TPM.Application.Companion, "DownloadFonts", TPM.Priority.NORMAL, new FontManager$downloadFonts$1(j, null));
    }

    public final void OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2, int i, java.lang.String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        valueOf.set(false);
        pUU.copydefault("FontDownloadDelegate", "Download font error, url: " + str + ", filename: " + str2 + ", error: " + i + ", details: " + str3);
    }

    public final void KWHzl(java.lang.String str) {
        valueOf.set(false);
        pUU.KWHzl("FontDownloadDelegate", "Download font success, result: " + str);
    }
}
