package com.okinc.buysell.data;

import com.okinc.buysell.data.BuyFrequencyOption;
import com.okinc.crcore.shared.net.responsebean.bsc.recurring.RecurringBuyFrequencyBean;
import com.okinc.cruilib.model.listitem.OKCRListItem;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C31351lsQ;
import o.C33070mpX;
import o.C56390yDp;
import o.C56392yDr;
import o.C56403yEb;
import o.C56424yEw;
import o.InterfaceC56387yDm;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class BuyFrequencyOption extends OKCRListItem {
    public static final int $stable = 0;
    private final String displayDescription;
    private final String displayLabel;
    private final BuyFrequencyModel frequencyModel;
    private final FrequencyType frequencyType;
    private final String id;
    private final boolean isSelected;
    public static final TaskDescription Companion = new TaskDescription(null);
    private static final InterfaceC56387yDm<BuyFrequencyOption> oneTimeInstance$delegate = C56392yDr.copydefault(new Function0() { // from class: o.ltw
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return BuyFrequencyOption.oneTimeInstance_delegate$lambda$0();
        }
    });
    private static final InterfaceC56387yDm<Map<String, Triple<FrequencyType, Integer, Integer>>> frequencyMappings$delegate = C56392yDr.copydefault(new Function0() { // from class: o.lts
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return BuyFrequencyOption.frequencyMappings_delegate$lambda$1();
        }
    });

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ BuyFrequencyOption copy$default(BuyFrequencyOption buyFrequencyOption, String str, FrequencyType frequencyType, BuyFrequencyModel buyFrequencyModel, String str2, String str3, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = buyFrequencyOption.id;
        }
        if ((i & 2) != 0) {
            frequencyType = buyFrequencyOption.frequencyType;
        }
        FrequencyType frequencyType2 = frequencyType;
        if ((i & 4) != 0) {
            buyFrequencyModel = buyFrequencyOption.frequencyModel;
        }
        BuyFrequencyModel buyFrequencyModel2 = buyFrequencyModel;
        if ((i & 8) != 0) {
            str2 = buyFrequencyOption.displayLabel;
        }
        String str4 = str2;
        if ((i & 16) != 0) {
            str3 = buyFrequencyOption.displayDescription;
        }
        String str5 = str3;
        if ((i & 32) != 0) {
            z = buyFrequencyOption.isSelected;
        }
        return buyFrequencyOption.copy(str, frequencyType2, buyFrequencyModel2, str4, str5, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final FrequencyType component2() {
        return this.frequencyType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BuyFrequencyModel component3() {
        return this.frequencyModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.displayLabel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.displayDescription;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component6() {
        return this.isSelected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BuyFrequencyOption copy(@NotNull String str, @NotNull FrequencyType frequencyType, @NotNull BuyFrequencyModel buyFrequencyModel, @NotNull String str2, @NotNull String str3, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(frequencyType, "");
        Intrinsics.checkNotNullParameter(buyFrequencyModel, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new BuyFrequencyOption(str, frequencyType, buyFrequencyModel, str2, str3, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BuyFrequencyOption)) {
            return false;
        }
        BuyFrequencyOption buyFrequencyOption = (BuyFrequencyOption) obj;
        return Intrinsics.EZpvd((Object) this.id, (Object) buyFrequencyOption.id) && this.frequencyType == buyFrequencyOption.frequencyType && Intrinsics.EZpvd(this.frequencyModel, buyFrequencyOption.frequencyModel) && Intrinsics.EZpvd((Object) this.displayLabel, (Object) buyFrequencyOption.displayLabel) && Intrinsics.EZpvd((Object) this.displayDescription, (Object) buyFrequencyOption.displayDescription) && this.isSelected == buyFrequencyOption.isSelected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDisplayDescription() {
        return this.displayDescription;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDisplayLabel() {
        return this.displayLabel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BuyFrequencyModel getFrequencyModel() {
        return this.frequencyModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final FrequencyType getFrequencyType() {
        return this.frequencyType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.cruilib.model.listitem.OKCRListItem
    public String getId() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((this.id.hashCode() * 31) + this.frequencyType.hashCode()) * 31) + this.frequencyModel.hashCode()) * 31) + this.displayLabel.hashCode()) * 31) + this.displayDescription.hashCode()) * 31) + Boolean.hashCode(this.isSelected);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isSelected() {
        return this.isSelected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "BuyFrequencyOption(id=" + this.id + ", frequencyType=" + this.frequencyType + ", frequencyModel=" + this.frequencyModel + ", displayLabel=" + this.displayLabel + ", displayDescription=" + this.displayDescription + ", isSelected=" + this.isSelected + ")";
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000c: CONSTRUCTOR 
  (r8v0 java.lang.String)
  (r9v0 com.okinc.buysell.data.FrequencyType)
  (r10v0 com.okinc.buysell.data.BuyFrequencyModel)
  (r11v0 java.lang.String)
  (r12v0 java.lang.String)
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r14v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? false : (r13v0 boolean))
 A[MD:(java.lang.String, com.okinc.buysell.data.FrequencyType, com.okinc.buysell.data.BuyFrequencyModel, java.lang.String, java.lang.String, boolean):void (m)] (LINE:10) call: com.okinc.buysell.data.BuyFrequencyOption.<init>(java.lang.String, com.okinc.buysell.data.FrequencyType, com.okinc.buysell.data.BuyFrequencyModel, java.lang.String, java.lang.String, boolean):void type: THIS */
    public /* synthetic */ BuyFrequencyOption(String str, FrequencyType frequencyType, BuyFrequencyModel buyFrequencyModel, String str2, String str3, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, frequencyType, buyFrequencyModel, str2, str3, (i & 32) != 0 ? false : z);
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.buysell.data.BuyFrequencyOption.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final BuyFrequencyOption copydefault() {
            return (BuyFrequencyOption) BuyFrequencyOption.oneTimeInstance$delegate.getValue();
        }

        public final Map<String, Triple<FrequencyType, Integer, Integer>> OLrzqt() {
            return (Map) BuyFrequencyOption.frequencyMappings$delegate.getValue();
        }

        public final BuyFrequencyOption copydefault(@NotNull RecurringBuyFrequencyBean recurringBuyFrequencyBean) {
            Intrinsics.checkNotNullParameter(recurringBuyFrequencyBean, "");
            Triple<FrequencyType, Integer, Integer> triple = OLrzqt().get(recurringBuyFrequencyBean.getFrequency());
            if (triple != null) {
                FrequencyType frequencyTypeComponent1 = triple.component1();
                int iIntValue = triple.component2().intValue();
                int iIntValue2 = triple.component3().intValue();
                int code = recurringBuyFrequencyBean.getCode();
                return new BuyFrequencyOption(String.valueOf(code), frequencyTypeComponent1, new BuyFrequencyModel(recurringBuyFrequencyBean.getCode(), recurringBuyFrequencyBean.getFrequency(), recurringBuyFrequencyBean.getLocalizedName(), recurringBuyFrequencyBean.getNextPurchaseTime()), C33070mpX.AYXKKw(iIntValue), C33070mpX.AYXKKw(iIntValue2), false, 32, null);
            }
            return KWHzl();
        }

        public final BuyFrequencyOption KWHzl() {
            return copydefault();
        }

        public final boolean OLrzqt(@NotNull BuyFrequencyOption buyFrequencyOption) {
            Intrinsics.checkNotNullParameter(buyFrequencyOption, "");
            return buyFrequencyOption.getFrequencyType() != FrequencyType.ONE_TIME;
        }

        public final List<BuyFrequencyOption> EZpvd(@NotNull List<BuyFrequencyOption> list, @NotNull BuyFrequencyOption buyFrequencyOption) {
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(buyFrequencyOption, "");
            ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(list, 10));
            for (BuyFrequencyOption buyFrequencyOption2 : list) {
                arrayList.add(BuyFrequencyOption.copy$default(buyFrequencyOption2, null, null, null, null, null, Intrinsics.EZpvd((Object) buyFrequencyOption2.getFrequencyModel().getFrequency(), (Object) buyFrequencyOption.getFrequencyModel().getFrequency()), 31, null));
            }
            return arrayList;
        }
    }

    public BuyFrequencyOption(@NotNull String str, @NotNull FrequencyType frequencyType, @NotNull BuyFrequencyModel buyFrequencyModel, @NotNull String str2, @NotNull String str3, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(frequencyType, "");
        Intrinsics.checkNotNullParameter(buyFrequencyModel, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.id = str;
        this.frequencyType = frequencyType;
        this.frequencyModel = buyFrequencyModel;
        this.displayLabel = str2;
        this.displayDescription = str3;
        this.isSelected = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BuyFrequencyOption oneTimeInstance_delegate$lambda$0() {
        FrequencyType frequencyType = FrequencyType.ONE_TIME;
        return new BuyFrequencyOption("0", frequencyType, new BuyFrequencyModel(0, frequencyType.getValue(), null, null, 12, null), C33070mpX.AYXKKw(C31351lsQ.Activity.DfrfUJ), C33070mpX.AYXKKw(C31351lsQ.Activity.cancel), true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map frequencyMappings_delegate$lambda$1() {
        FrequencyType frequencyType = FrequencyType.DAILY;
        Pair pairOLrzqt = C56390yDp.OLrzqt(frequencyType.getValue(), new Triple(frequencyType, Integer.valueOf(C31351lsQ.Activity.atDTRm), Integer.valueOf(C31351lsQ.Activity.ROgMPW)));
        FrequencyType frequencyType2 = FrequencyType.WEEKLY;
        Pair pairOLrzqt2 = C56390yDp.OLrzqt(frequencyType2.getValue(), new Triple(frequencyType2, Integer.valueOf(C31351lsQ.Activity.gBtXYZ), Integer.valueOf(C31351lsQ.Activity.aCSzUz)));
        FrequencyType frequencyType3 = FrequencyType.BIWEEKLY;
        Pair pairOLrzqt3 = C56390yDp.OLrzqt(frequencyType3.getValue(), new Triple(frequencyType3, Integer.valueOf(C31351lsQ.Activity.Rtjmuc), Integer.valueOf(C31351lsQ.Activity.ODCBUN)));
        FrequencyType frequencyType4 = FrequencyType.MONTHLY;
        return C56424yEw.gEmmrt(pairOLrzqt, pairOLrzqt2, pairOLrzqt3, C56390yDp.OLrzqt(frequencyType4.getValue(), new Triple(frequencyType4, Integer.valueOf(C31351lsQ.Activity.dPnHjp), Integer.valueOf(C31351lsQ.Activity.RuDPQV))));
    }
}
