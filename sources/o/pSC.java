package o;

import com.okinc.di.LocalizeDIModule;
import com.okinc.localization.OKLocalize$updateLanguage$1$1;
import com.okinc.localization.internal.repository.LanguagesListRepository;
import com.reown.foundation.util.jwt.JwtUtilsKt;
import io.reactivex.BackpressureStrategy;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineName;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class pSC {
    public static final pUA AhwBna;
    public static final LanguagesListRepository EZpvd;
    public static final int KWHzl;
    public static final pTJ copydefault;
    public static final pTU valueOf;
    public static final pSC AEQbTJ = new pSC();
    public static final java.lang.String OLrzqt = "lang_config";

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String gEmmrt() {
        return OLrzqt;
    }

    private pSC() {
    }

    static {
        C43246rlf c43246rlf = C43246rlf.OLrzqt;
        valueOf = ((LocalizeDIModule.Activity) C58113yvE.copydefault(c43246rlf.valueOf(), LocalizeDIModule.Activity.class)).gkJEwt();
        EZpvd = ((LocalizeDIModule.Application) C58113yvE.copydefault(c43246rlf.valueOf(), LocalizeDIModule.Application.class)).iRxXKY();
        copydefault = ((LocalizeDIModule.Application) C58113yvE.copydefault(c43246rlf.valueOf(), LocalizeDIModule.Application.class)).AxsJAYsNCnLh();
        AhwBna = ((LocalizeDIModule.Application) C58113yvE.copydefault(c43246rlf.valueOf(), LocalizeDIModule.Application.class)).RlQdEF();
        KWHzl = 8;
    }

    public final java.util.Locale djBIcL() {
        return AEQbTJ();
    }

    public final java.lang.String KWHzl(@NotNull java.lang.String str, @NotNull java.lang.Object... objArr) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(objArr, "");
        return AhwBna.OLrzqt(str, objArr);
    }

    public final java.lang.String KWHzl(@NotNull java.lang.String str, int i, java.util.Map<java.lang.Object, ? extends java.lang.Object> map) {
        Intrinsics.checkNotNullParameter(str, "");
        java.lang.CharSequence charSequenceOLrzqt = OLrzqt(str, i, map);
        if (charSequenceOLrzqt != null) {
            return charSequenceOLrzqt.toString();
        }
        return null;
    }

    public final java.lang.CharSequence OLrzqt(@NotNull java.lang.String str, int i, java.util.Map<java.lang.Object, ? extends java.lang.Object> map) {
        Intrinsics.checkNotNullParameter(str, "");
        return AhwBna.OLrzqt(str, i, map);
    }

    public final java.lang.String KWHzl() {
        return C38303pTu.AYXKKw(AEQbTJ());
    }

    public static /* synthetic */ AbstractC58185ywX updateLanguage$default(pSC psc, android.content.Context context, boolean z, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return psc.OLrzqt(context, z);
    }

    public final AbstractC58185ywX<pSD> OLrzqt(android.content.Context context, boolean z) {
        pUU.KWHzl("OKLocalize::Main", "updateLanguage onlyRemote: " + z + JwtUtilsKt.JWT_DELIMITER);
        AbstractC58185ywX<pSD> abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(new InterfaceC58187ywZ() { // from class: o.pSB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58187ywZ
            public final void subscribe(InterfaceC58184ywW interfaceC58184ywW) {
                pSC.copydefault(interfaceC58184ywW);
            }
        }, BackpressureStrategy.BUFFER).copydefault(yBP.AEQbTJ()).KWHzl(C58266yxz.OLrzqt());
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        return abstractC58185ywXKWHzl;
    }

    public static final void copydefault(InterfaceC58184ywW interfaceC58184ywW) {
        Intrinsics.checkNotNullParameter(interfaceC58184ywW, "");
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(new CoroutineName("updateLanguage")), null, CoroutineStart.UNDISPATCHED, new OKLocalize$updateLanguage$1$1(interfaceC58184ywW, null), 1, null);
    }

    public final AbstractC58185ywX<pSD> EZpvd(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        pUU.KWHzl("OKLocalize::Main", "updateLanguageFromRemote.");
        return OLrzqt(context, true);
    }

    public final java.util.Locale AEQbTJ() {
        return valueOf.OLrzqt().getLocale();
    }
}
