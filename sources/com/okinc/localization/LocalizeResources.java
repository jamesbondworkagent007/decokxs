package com.okinc.localization;

import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.LocaleList;
import androidx.annotation.AnyRes;
import androidx.annotation.ArrayRes;
import androidx.annotation.PluralsRes;
import androidx.core.os.ConfigurationCompat;
import com.okinc.di.LocalizeDIContainer;
import com.okinc.di.LocalizeDIModule;
import com.okinc.localization.LocalizeResources;
import com.okinc.localization.report.SupportType;
import java.util.Arrays;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o.C38319pUj;
import o.C43246rlf;
import o.C56392yDr;
import o.C56529yIt;
import o.C58113yvE;
import o.InterfaceC56387yDm;
import o.pSH;
import o.pSQ;
import o.pUU;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class LocalizeResources extends Resources implements pSH {
    public static final int $stable = 8;
    private final InterfaceC56387yDm localizeResourceRepo$delegate;

    public CharSequence getText(@NotNull String str) {
        return pSH.ActionBar.KWHzl(this, str);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocalizeResources(@NotNull AssetManager assetManager, @NotNull Resources resources) {
        super(assetManager, resources.getDisplayMetrics(), resources.getConfiguration());
        Intrinsics.checkNotNullParameter(assetManager, "");
        Intrinsics.checkNotNullParameter(resources, "");
        this.localizeResourceRepo$delegate = C56392yDr.copydefault(new Function0() { // from class: o.pSA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return LocalizeResources.localizeResourceRepo_delegate$lambda$0();
            }
        });
        Configuration configuration = resources.getConfiguration();
        Locale locale = LocalizeDIContainer.INSTANCE.getLanguageUsageRepo().djBIcL().getLocale();
        configuration.setLocale(locale);
        configuration.setLocales(new LocaleList(locale));
        updateConfiguration(configuration, resources.getDisplayMetrics());
    }

    private final C38319pUj getLocalizeResourceRepo() {
        return (C38319pUj) this.localizeResourceRepo$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C38319pUj localizeResourceRepo_delegate$lambda$0() {
        return ((LocalizeDIModule.Application) C58113yvE.copydefault(C43246rlf.OLrzqt.valueOf(), LocalizeDIModule.Application.class)).DAIeex();
    }

    @Override // android.content.res.Resources
    public CharSequence getText(int i, CharSequence charSequence) {
        try {
            return getText(i);
        } catch (Resources.NotFoundException unused) {
            return charSequence;
        }
    }

    public String getString(@NotNull String str) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(str, "");
        CharSequence text = getText(str);
        if (text != null) {
            return text.toString();
        }
        return null;
    }

    public String getString(@NotNull String str, @NotNull Object... objArr) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(objArr, "");
        String string = getString(str);
        if (string == null) {
            return string;
        }
        C56529yIt c56529yIt = C56529yIt.KWHzl;
        Locale locale = getLocale();
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        String str2 = String.format(locale, string, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
        Intrinsics.checkNotNullExpressionValue(str2, "");
        return str2;
    }

    @Override // android.content.res.Resources
    public CharSequence getText(int i) throws Resources.NotFoundException {
        try {
            return getLocalizeResourceRepo().copydefault(i, this);
        } catch (Resources.NotFoundException e) {
            pUU.OLrzqt("OKLocalize::Main", "getText", e);
            CharSequence text = super.getText(i);
            Intrinsics.copydefault(text);
            return text;
        }
    }

    @Override // o.pSH
    public CharSequence getText(@NotNull String str, CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(str, "");
        CharSequence charSequenceAuCTel = getLocalizeResourceRepo().AuCTel(str);
        return charSequenceAuCTel == null ? charSequence : charSequenceAuCTel;
    }

    @Override // android.content.res.Resources
    public CharSequence getQuantityText(@PluralsRes int i, int i2) throws Resources.NotFoundException {
        try {
            return getLocalizeResourceRepo().KWHzl(i, i2, this);
        } catch (Resources.NotFoundException e) {
            pUU.OLrzqt("OKLocalize::Main", "getQuantityText", e);
            CharSequence quantityText = super.getQuantityText(i, i2);
            Intrinsics.copydefault(quantityText);
            return quantityText;
        }
    }

    public String getQuantityString(@NotNull String str, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        CharSequence quantityText = getQuantityText(str, i, null);
        if (quantityText != null) {
            return quantityText.toString();
        }
        return null;
    }

    public String getQuantityString(@NotNull String str, int i, @NotNull Object... objArr) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(objArr, "");
        String quantityString = getQuantityString(str, i);
        if (quantityString == null) {
            return null;
        }
        C56529yIt c56529yIt = C56529yIt.KWHzl;
        Locale locale = getLocale();
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        String str2 = String.format(locale, quantityString, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
        Intrinsics.checkNotNullExpressionValue(str2, "");
        return str2;
    }

    public CharSequence getQuantityText(@NotNull String str, int i, Map<Object, ? extends Object> map) {
        Intrinsics.checkNotNullParameter(str, "");
        return getLocalizeResourceRepo().EZpvd(str, i, map);
    }

    @Override // android.content.res.Resources
    public String[] getStringArray(@ArrayRes int i) throws Resources.NotFoundException {
        try {
            return getLocalizeResourceRepo().AEQbTJ(i, this);
        } catch (Resources.NotFoundException e) {
            pUU.OLrzqt("OKLocalize::Main", "getStringArray", e);
            String[] stringArray = super.getStringArray(i);
            Intrinsics.copydefault(stringArray);
            return stringArray;
        }
    }

    @Override // android.content.res.Resources
    public CharSequence[] getTextArray(@ArrayRes int i) throws Resources.NotFoundException {
        try {
            return getLocalizeResourceRepo().EZpvd(i, this);
        } catch (Resources.NotFoundException e) {
            pUU.OLrzqt("OKLocalize::Main", "getTextArray", e);
            CharSequence[] textArray = super.getTextArray(i);
            Intrinsics.copydefault(textArray);
            return textArray;
        }
    }

    public String[] getStringArray(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return getLocalizeResourceRepo().fJNWhG(str);
    }

    public CharSequence[] getTextArray(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return getLocalizeResourceRepo().ejfBZ(str);
    }

    private final Locale getLocale() {
        Configuration configuration = super.getConfiguration();
        Locale locale = ConfigurationCompat.getLocales(configuration).get(0);
        if (locale != null) {
            return locale;
        }
        Locale locale2 = configuration.locale;
        Intrinsics.checkNotNullExpressionValue(locale2, "");
        return locale2;
    }

    @Override // android.content.res.Resources
    public Drawable getDrawable(int i) {
        reportUseDrawable$OKLocalization_localization(tryGetResourceEntryName(i));
        return super.getDrawable(i);
    }

    @Override // android.content.res.Resources
    public Drawable getDrawable(int i, Resources.Theme theme) {
        reportUseDrawable$OKLocalization_localization(tryGetResourceEntryName(i));
        return super.getDrawable(i, theme);
    }

    @Override // android.content.res.Resources
    public Drawable getDrawableForDensity(int i, int i2) {
        reportUseDrawable$OKLocalization_localization(tryGetResourceEntryName(i));
        return super.getDrawableForDensity(i, i2);
    }

    @Override // android.content.res.Resources
    public Drawable getDrawableForDensity(int i, int i2, Resources.Theme theme) {
        reportUseDrawable$OKLocalization_localization(tryGetResourceEntryName(i));
        return super.getDrawableForDensity(i, i2, theme);
    }

    public final void reportUseDrawable$OKLocalization_localization(String str) {
        if (str != null) {
            pSQ.reportUsedSource$default(pSQ.copydefault, str, SupportType.PIC, null, 4, null);
        }
    }

    private final String tryGetResourceEntryName(@AnyRes int i) {
        try {
            return getResourceEntryName(i);
        } catch (Resources.NotFoundException unused) {
            return null;
        }
    }
}
