package com.okinc.business.market.common.constants;

import androidx.annotation.StringRes;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.SerialName;
import o.C23274hvD;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class CategoryType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ CategoryType[] $VALUES;
    public static final ActionBar Companion;
    private final int titleResId;
    private final String value;

    @SerialName("all")
    public static final CategoryType ALL = new CategoryType("ALL", 0, "all", C23274hvD.Fragment.KWHzl);

    @SerialName("kol")
    public static final CategoryType KOL = new CategoryType("KOL", 1, "kol", C23274hvD.Fragment.finit);

    @SerialName("goldDogExpert")
    public static final CategoryType GoldDogExpert = new CategoryType("GoldDogExpert", 2, "goldDogExpert", C23274hvD.Fragment.dNCPSb);

    @SerialName("sniper")
    public static final CategoryType Sniper = new CategoryType("Sniper", 3, "sniper", C23274hvD.Fragment.dvKsVJ);

    @SerialName("dev")
    public static final CategoryType Developer = new CategoryType("Developer", 4, "dev", C23274hvD.Fragment.aKErDB);

    @SerialName("fresh")
    public static final CategoryType Fresh = new CategoryType("Fresh", 5, "fresh", C23274hvD.Fragment.RcXXUw);

    @SerialName("bot")
    public static final CategoryType Bot = new CategoryType("Bot", 6, "bot", C23274hvD.Fragment.djSkpj);

    @SerialName("pumpSmartMoney")
    public static final CategoryType PumpSmartMoney = new CategoryType("PumpSmartMoney", 7, "pumpSmartMoney", C23274hvD.Fragment.dxcTrN);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ CategoryType[] $values() {
        return new CategoryType[]{ALL, KOL, GoldDogExpert, Sniper, Developer, Fresh, Bot, PumpSmartMoney};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<CategoryType> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getTitleResId() {
        return this.titleResId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getValue() {
        return this.value;
    }

    private CategoryType(String str, @StringRes int i, String str2, int i2) {
        this.value = str2;
        this.titleResId = i2;
    }

    static {
        CategoryType[] categoryTypeArr$values = $values();
        $VALUES = categoryTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(categoryTypeArr$values);
        Companion = new ActionBar(null);
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.market.common.constants.CategoryType.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    public static CategoryType valueOf(String str) {
        return (CategoryType) Enum.valueOf(CategoryType.class, str);
    }

    public static CategoryType[] values() {
        return (CategoryType[]) $VALUES.clone();
    }
}
