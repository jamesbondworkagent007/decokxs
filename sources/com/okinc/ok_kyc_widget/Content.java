package com.okinc.ok_kyc_widget;

import android.content.Context;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import com.okinc.ok_kyc_core.data.remote.networkmodel.RichTextContent;
import com.okinc.ok_kyc_core.data.remote.networkmodel.ViewStatus;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C32113mPz;
import o.C33069mpW;
import o.C42519rVw;
import o.C43662rtX;
import o.C43834rwk;
import o.C52761wXj;
import o.C55296xhK;
import o.C56407yEf;
import o.C56444yFp;
import o.InterfaceC56445yFq;
import o.yDY;
import o.yET;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class Content extends ConstraintLayout {
    public final C43834rwk AEQbTJ;
    public final C42519rVw copydefault;

    /* JADX INFO: loaded from: classes16.dex */
    public final /* synthetic */ class StateListAnimator {
        public static final /* synthetic */ int[] AEQbTJ;
        public static final /* synthetic */ int[] copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[ViewStatus.values().length];
            try {
                iArr[ViewStatus.Result.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ViewStatus.Cta.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            copydefault = iArr;
            int[] iArr2 = new int[Alignment.values().length];
            try {
                iArr2[Alignment.CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[Alignment.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            AEQbTJ = iArr2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Content(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Content(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:int:0x0009: SGET  A[WRAPPED] o.rtX.FragmentManager.copydefault int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:25) call: com.okinc.ok_kyc_widget.Content.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ Content(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? C43662rtX.FragmentManager.copydefault : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Content(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.copydefault = new C42519rVw(context, attributeSet, i);
        this.AEQbTJ = C43834rwk.EZpvd(LayoutInflater.from(context), this, true);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: loaded from: classes16.dex */
    public static final class Alignment {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ Alignment[] $VALUES;
        public static final Alignment LEFT = new Alignment("LEFT", 0);
        public static final Alignment CENTER = new Alignment("CENTER", 1);
        public static final Alignment RIGHT = new Alignment("RIGHT", 2);

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ Alignment[] $values() {
            return new Alignment[]{LEFT, CENTER, RIGHT};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<Alignment> getEntries() {
            return $ENTRIES;
        }

        private Alignment(String str, int i) {
        }

        static {
            Alignment[] alignmentArr$values = $values();
            $VALUES = alignmentArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(alignmentArr$values);
        }

        public static Alignment valueOf(String str) {
            return (Alignment) Enum.valueOf(Alignment.class, str);
        }

        public static Alignment[] values() {
            return (Alignment[]) $VALUES.clone();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: com.okinc.ok_kyc_widget.Content */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void setContent$default(Content content, String str, String str2, List list, List list2, Alignment alignment, ViewStatus viewStatus, int i, Object obj) {
        if ((i & 8) != 0) {
            list2 = null;
        }
        List list3 = list2;
        if ((i & 16) != 0) {
            alignment = Alignment.LEFT;
        }
        Alignment alignment2 = alignment;
        if ((i & 32) != 0) {
            viewStatus = ViewStatus.Form;
        }
        content.setContent(str, str2, list, list3, alignment2, viewStatus);
    }

    public final void setContent(String str, String str2, @NotNull List<String> list, List<RichTextContent> list2, @NotNull Alignment alignment, ViewStatus viewStatus) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(alignment, "");
        if ((str == null || str.length() == 0) && (str2 == null || str2.length() == 0)) {
            TextView textView = this.AEQbTJ.KWHzl;
            Intrinsics.checkNotNullExpressionValue(textView, "");
            setTextViewMargins(textView, 0, 0, 0, 0, 0);
        }
        OLrzqt(alignment);
        StringBuilder sb = new StringBuilder();
        int i = 0;
        if (list2 == null) {
            if (!list.isEmpty()) {
                int size = list.size() - 2;
                if (size >= 0) {
                    while (true) {
                        sb.append(list.get(i));
                        sb.append('\n');
                        if (i == size) {
                            break;
                        } else {
                            i++;
                        }
                    }
                }
                sb.append(list.get(list.size() - 1));
            }
        } else {
            int size2 = list2.size() - 2;
            if (size2 >= 0) {
                while (true) {
                    sb.append(list2.get(i).getText());
                    sb.append('\n');
                    if (i == size2) {
                        break;
                    } else {
                        i++;
                    }
                }
            }
            sb.append(list2.get(list2.size() - 1).getText());
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        setTextStyle(str, str2, string, list2, viewStatus);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: com.okinc.ok_kyc_widget.Content */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void setTextStyle$default(Content content, String str, String str2, String str3, List list, ViewStatus viewStatus, int i, Object obj) {
        if ((i & 8) != 0) {
            list = null;
        }
        List list2 = list;
        if ((i & 16) != 0) {
            viewStatus = ViewStatus.Form;
        }
        content.setTextStyle(str, str2, str3, list2, viewStatus);
    }

    public final void setTextStyle(String str, String str2, String str3, List<RichTextContent> list, ViewStatus viewStatus) {
        if (str != null && str.length() != 0) {
            TextView textView = this.AEQbTJ.KWHzl;
            Intrinsics.checkNotNullExpressionValue(textView, "");
            textView.setVisibility(0);
            this.AEQbTJ.KWHzl.setText(str);
        } else {
            TextView textView2 = this.AEQbTJ.KWHzl;
            Intrinsics.checkNotNullExpressionValue(textView2, "");
            textView2.setVisibility(8);
        }
        if (str2 != null && str2.length() != 0) {
            TextView textView3 = this.AEQbTJ.copydefault;
            Intrinsics.checkNotNullExpressionValue(textView3, "");
            textView3.setVisibility(0);
            TextView textView4 = this.AEQbTJ.copydefault;
            Intrinsics.checkNotNullExpressionValue(textView4, "");
            EZpvd(textView4, str2, this.copydefault.values(), C32113mPz.Dialog.fIwbmz);
        } else {
            TextView textView5 = this.AEQbTJ.copydefault;
            Intrinsics.checkNotNullExpressionValue(textView5, "");
            textView5.setVisibility(8);
        }
        if (str3.length() > 0) {
            TextView textView6 = this.AEQbTJ.AEQbTJ;
            Intrinsics.checkNotNullExpressionValue(textView6, "");
            textView6.setVisibility(0);
            int i = viewStatus == null ? -1 : StateListAnimator.copydefault[viewStatus.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (list != null) {
                        TextView textView7 = this.AEQbTJ.AEQbTJ;
                        Intrinsics.checkNotNullExpressionValue(textView7, "");
                        setRichTextStyle(textView7, str3, copydefault(list), C52761wXj.LoaderManager.hBpjJd);
                    } else {
                        TextView textView8 = this.AEQbTJ.AEQbTJ;
                        Intrinsics.checkNotNullExpressionValue(textView8, "");
                        EZpvd(textView8, str3, this.copydefault.isConnected(), C52761wXj.LoaderManager.hBpjJd);
                    }
                } else if (list != null) {
                    TextView textView9 = this.AEQbTJ.AEQbTJ;
                    Intrinsics.checkNotNullExpressionValue(textView9, "");
                    setRichTextStyle(textView9, str3, copydefault(list), C52761wXj.LoaderManager.dHguZz);
                } else {
                    TextView textView10 = this.AEQbTJ.AEQbTJ;
                    Intrinsics.checkNotNullExpressionValue(textView10, "");
                    EZpvd(textView10, str3, this.copydefault.AhwBna(), C52761wXj.LoaderManager.dHguZz);
                }
            } else if (list != null) {
                TextView textView11 = this.AEQbTJ.AEQbTJ;
                Intrinsics.checkNotNullExpressionValue(textView11, "");
                setRichTextStyle(textView11, str3, copydefault(list), C52761wXj.LoaderManager.RdAHlO);
            } else {
                TextView textView12 = this.AEQbTJ.AEQbTJ;
                Intrinsics.checkNotNullExpressionValue(textView12, "");
                EZpvd(textView12, str3, this.copydefault.AhwBna(), C52761wXj.LoaderManager.dHguZz);
            }
            this.AEQbTJ.AEQbTJ.setTextSize(0, getResources().getDimension(C52761wXj.StateListAnimator.hUfVAv));
            return;
        }
        TextView textView13 = this.AEQbTJ.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(textView13, "");
        textView13.setVisibility(8);
    }

    public static final class ActionBar<T> implements Comparator {
        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return yET.KWHzl((Integer) ((Triple) t).getFirst(), (Integer) ((Triple) t2).getFirst());
        }
    }

    public static final class TaskDescription<T> implements Comparator {
        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return yET.KWHzl((Integer) ((Triple) t).getFirst(), (Integer) ((Triple) t2).getFirst());
        }
    }

    private final void EZpvd(TextView textView, String str, @ColorInt int i, int i2) {
        textView.setText(str);
        textView.setTextAppearance(getContext(), i2);
        textView.setTextColor(i);
    }

    public final void setRichTextStyle(TextView textView, String str, HashMap<String, String> map, int i) {
        textView.setText(EZpvd(str, map));
        textView.setTextAppearance(getContext(), i);
    }

    public final HashMap<String, String> copydefault(List<RichTextContent> list) {
        HashMap<String, String> map = new HashMap<>();
        Iterator<RichTextContent> it = list.iterator();
        while (it.hasNext()) {
            HashMap<String, String> bold = it.next().getBold();
            if (bold != null) {
                map.putAll(bold);
            }
        }
        return map;
    }

    public final SpannableString EZpvd(String str, HashMap<String, String> map) {
        int i;
        String strOLrzqt = C33069mpW.OLrzqt(str, map);
        SpannableString spannableString = new SpannableString(strOLrzqt);
        if (strOLrzqt.length() == 0) {
            return spannableString;
        }
        int i2 = 0;
        spannableString.setSpan(new ForegroundColorSpan(this.copydefault.AhwBna()), 0, spannableString.length(), 17);
        ArrayList arrayList = new ArrayList();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int i3 = 0;
        for (String str2 : map.values()) {
            Intrinsics.checkNotNullExpressionValue(str2, "");
            String str3 = str2;
            if (str3.length() != 0 && linkedHashSet.add(str3) && str3.length() >= 2) {
                int i4 = i3;
                int length = i2;
                while (length < strOLrzqt.length() && i4 < 100) {
                    i = 100;
                    int iIndexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) strOLrzqt, str3, length, false, 4, (Object) null);
                    if (iIndexOf$default == -1) {
                        break;
                    }
                    length = iIndexOf$default + str3.length();
                    if (length <= strOLrzqt.length()) {
                        arrayList.add(new Triple<>(Integer.valueOf(iIndexOf$default), Integer.valueOf(length), str3));
                        i4++;
                    }
                }
                i = 100;
                if (i4 >= i) {
                    break;
                }
                i3 = i4;
                i2 = 0;
            }
        }
        if (arrayList.size() > 1) {
            C56407yEf.copydefault(arrayList, new ActionBar());
        }
        for (Pair<Integer, Integer> pair : KWHzl(arrayList)) {
            int iIntValue = pair.component1().intValue();
            int iIntValue2 = pair.component2().intValue();
            spannableString.setSpan(new ForegroundColorSpan(this.copydefault.isConnected()), iIntValue, iIntValue2, 17);
            spannableString.setSpan(new StyleSpan(1), iIntValue, iIntValue2, 17);
        }
        return spannableString;
    }

    public final List<Pair<Integer, Integer>> KWHzl(List<Triple<Integer, Integer, String>> list) {
        if (list.isEmpty()) {
            return yDY.AhwBna();
        }
        List listEZpvd = CollectionsKt___CollectionsKt.EZpvd(list, new TaskDescription());
        ArrayList arrayList = new ArrayList();
        int iIntValue = ((Number) ((Triple) listEZpvd.get(0)).getFirst()).intValue();
        int iIntValue2 = ((Number) ((Triple) listEZpvd.get(0)).getSecond()).intValue();
        int size = listEZpvd.size();
        for (int i = 1; i < size; i++) {
            Triple triple = (Triple) listEZpvd.get(i);
            int iIntValue3 = ((Number) triple.component1()).intValue();
            int iIntValue4 = ((Number) triple.component2()).intValue();
            if (iIntValue3 <= iIntValue2) {
                iIntValue2 = Math.max(iIntValue2, iIntValue4);
            } else {
                arrayList.add(new Pair(Integer.valueOf(iIntValue), Integer.valueOf(iIntValue2)));
                iIntValue2 = iIntValue4;
                iIntValue = iIntValue3;
            }
        }
        arrayList.add(new Pair(Integer.valueOf(iIntValue), Integer.valueOf(iIntValue2)));
        return arrayList;
    }

    private final void OLrzqt(Alignment alignment) {
        float f;
        int i;
        int i2 = StateListAnimator.AEQbTJ[alignment.ordinal()];
        if (i2 == 1) {
            f = 0.5f;
            i = 17;
        } else if (i2 != 2) {
            f = 0.0f;
            i = 8388611;
        } else {
            f = 1.0f;
            i = 8388613;
        }
        ConstraintLayout constraintLayout = this.AEQbTJ.EZpvd;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
        ConstraintSet constraintSet = new ConstraintSet();
        constraintSet.clone(constraintLayout);
        constraintSet.setHorizontalBias(this.AEQbTJ.KWHzl.getId(), f);
        constraintSet.setHorizontalBias(this.AEQbTJ.copydefault.getId(), f);
        constraintSet.setHorizontalBias(this.AEQbTJ.AEQbTJ.getId(), f);
        constraintSet.applyTo(constraintLayout);
        this.AEQbTJ.KWHzl.setGravity(i);
        this.AEQbTJ.copydefault.setGravity(i);
        this.AEQbTJ.AEQbTJ.setGravity(i);
    }

    public final void setTextViewMargins(TextView textView, int i, int i2, int i3, int i4, int i5) {
        ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
        Intrinsics.copydefault(layoutParams, "");
        ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
        C55296xhK.AEQbTJ(layoutParams2, i, i2, i3, i4);
        layoutParams2.setMarginStart(i5);
        textView.setLayoutParams(layoutParams2);
    }
}
