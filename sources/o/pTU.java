package o;

import androidx.fragment.app.FragmentActivity;
import com.google.gson.JsonObject;
import com.okinc.localization.bean.LanguageItem;
import com.okinc.localization2.bean.AppLanguagesChangeResult;
import com.okinc.localization2.bean.AppLocale;
import com.okinc.localization2.bean.LangChangeConfig;
import com.okinc.localization2.bean.LanguageUnit;
import com.okinc.localization2.bean.LanguageUpdateResult;
import com.okinc.localization2.bean.LanguagesSettingFrom;
import com.okinc.localization2.bean.LocalizeEvent;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public interface pTU {
    Flow<LocalizeEvent> AEQbTJ();

    java.lang.Object EZpvd(java.lang.String str, @NotNull Continuation<? super java.util.List<LanguageItem>> continuation);

    Flow<LanguageUpdateResult> KWHzl();

    AppLocale OLrzqt();

    java.lang.Object OLrzqt(@NotNull LanguageUnit languageUnit, @NotNull LangChangeConfig langChangeConfig, @NotNull Continuation<? super java.lang.Boolean> continuation);

    java.lang.Object OLrzqt(java.lang.String str, @NotNull Continuation<? super java.util.List<LanguageItem>> continuation);

    java.lang.Object copydefault(FragmentActivity fragmentActivity, @NotNull JsonObject jsonObject, @NotNull LanguagesSettingFrom languagesSettingFrom, @NotNull Continuation<? super AppLanguagesChangeResult> continuation);

    void copydefault();

    public static final class StateListAnimator {
        public static /* synthetic */ java.lang.Object getLanguageListFromLocal$default(pTU ptu, java.lang.String str, Continuation continuation, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getLanguageListFromLocal");
            }
            if ((i & 1) != 0) {
                str = null;
            }
            return ptu.EZpvd(str, continuation);
        }

        public static /* synthetic */ java.lang.Object getLanguageListFromRemote$default(pTU ptu, java.lang.String str, Continuation continuation, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getLanguageListFromRemote");
            }
            if ((i & 1) != 0) {
                str = null;
            }
            return ptu.OLrzqt(str, continuation);
        }
    }
}
