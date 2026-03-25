package o;

import com.okinc.business.market.features.tag.domain.CompactTag;
import com.okinc.business.market.features.tag.domain.TagExtra;
import com.okinc.business.market.features.tag.domain.TagMeta;
import com.okinc.business.market.features.tag.domain.TagWrapper;
import java.math.BigDecimal;
import java.math.RoundingMode;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kyV, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C29694kyV {
    public static final C29694kyV AEQbTJ = new C29694kyV();
    public static final java.util.Map<java.lang.String, java.lang.String> copydefault = C56424yEw.gEmmrt(C56390yDp.OLrzqt("communityRecognized", "label_community"), C56390yDp.OLrzqt("devHoldingStatus_buy", "label_dev_buy"), C56390yDp.OLrzqt("devHoldingStatus_sellAll", "label_dev_sell_all"));
    public static final int EZpvd = 8;

    private C29694kyV() {
    }

    public static /* synthetic */ int getTextColor$default(C29694kyV c29694kyV, TagWrapper tagWrapper, boolean z, java.lang.Integer num, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            num = null;
        }
        return c29694kyV.KWHzl(tagWrapper, z, num);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int KWHzl(@NotNull TagWrapper tagWrapper, boolean z, java.lang.Integer num) {
        java.lang.String strValueOf;
        Intrinsics.checkNotNullParameter(tagWrapper, "");
        if (z) {
            TagMeta tagMetaAEQbTJ = tagWrapper.AEQbTJ();
            strValueOf = tagMetaAEQbTJ != null ? tagMetaAEQbTJ.gEmmrt() : null;
        } else {
            TagMeta tagMetaAEQbTJ2 = tagWrapper.AEQbTJ();
            if (tagMetaAEQbTJ2 != null) {
                strValueOf = tagMetaAEQbTJ2.valueOf();
            }
        }
        return C33070mpX.EZpvd(strValueOf != null ? strValueOf : "", num != null ? num.intValue() : C25382ivf.KWHzl(C52761wXj.Activity.fdOvFl));
    }

    public static /* synthetic */ java.lang.String getIcon$default(C29694kyV c29694kyV, TagMeta tagMeta, boolean z, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return c29694kyV.KWHzl(tagMeta, z);
    }

    public final java.lang.String KWHzl(@NotNull TagMeta tagMeta, boolean z) {
        Intrinsics.checkNotNullParameter(tagMeta, "");
        if (z) {
            return tagMeta.KWHzl();
        }
        return tagMeta.AhwBna();
    }

    public final java.lang.String OLrzqt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        java.lang.String str2 = copydefault.get(str);
        return str2 == null ? "" : str2;
    }

    public final android.text.SpannedString copydefault(android.content.Context context, java.lang.Float f) {
        if (context == null) {
            return new android.text.SpannedString("");
        }
        java.lang.String percentWithoutSymbol$default = f == null ? "--" : C23311hvo.formatPercentWithoutSymbol$default(f.toString(), false, 0, new BigDecimal(0.01d), false, null, 26, null);
        int iKWHzl = C25382ivf.KWHzl(C28074kNy.OLrzqt(f));
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder();
        spannableStringBuilder.append((java.lang.CharSequence) percentWithoutSymbol$default);
        spannableStringBuilder.setSpan(new android.text.style.ForegroundColorSpan(iKWHzl), 0, percentWithoutSymbol$default.length(), 33);
        return new android.text.SpannedString(spannableStringBuilder);
    }

    public final android.text.SpannedString OLrzqt(@NotNull android.content.Context context, java.lang.Integer num, java.lang.Integer num2) {
        java.lang.String tokenCode$default;
        boolean z;
        java.lang.String tokenCode$default2;
        Intrinsics.checkNotNullParameter(context, "");
        if (num == null || num2 == null) {
            tokenCode$default = "-";
            z = true;
            tokenCode$default2 = "-";
        } else {
            C23271hvA c23271hvA = C23271hvA.copydefault;
            java.lang.String string = num.toString();
            RoundingMode roundingMode = RoundingMode.DOWN;
            tokenCode$default = C23271hvA.formatTokenCode$default(c23271hvA, string, true, roundingMode, false, null, null, 28, null);
            tokenCode$default2 = C23271hvA.formatTokenCode$default(c23271hvA, num2.toString(), true, roundingMode, false, null, null, 28, null);
            z = false;
        }
        java.lang.String strKWHzl = C33069mpW.KWHzl(context, C23274hvD.Fragment.onNewIntent, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56424yEw.gEmmrt(C56390yDp.OLrzqt("num", tokenCode$default), C56390yDp.OLrzqt("num2", tokenCode$default2)));
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder();
        spannableStringBuilder.append((java.lang.CharSequence) strKWHzl);
        if (z) {
            spannableStringBuilder.setSpan(new android.text.style.ForegroundColorSpan(C25382ivf.KWHzl(C52761wXj.Activity.fdOvFl)), 0, strKWHzl.length(), 33);
        } else {
            spannableStringBuilder.setSpan(new android.text.style.ForegroundColorSpan(C25382ivf.KWHzl(C52761wXj.Activity.fdOvFl)), 0, strKWHzl.length(), 33);
            if (C33129mqd.AhwBna(tokenCode$default) > 0) {
                spannableStringBuilder.setSpan(new android.text.style.ForegroundColorSpan(C25382ivf.KWHzl(C52761wXj.Activity.gdmIOq)), 0, tokenCode$default.length(), 33);
            }
        }
        return new android.text.SpannedString(spannableStringBuilder);
    }

    public final java.lang.String AEQbTJ(@NotNull java.util.List<TagWrapper> list) {
        java.lang.Object next;
        CompactTag compactTagCopydefault;
        TagExtra tagExtraOLrzqt;
        Intrinsics.checkNotNullParameter(list, "");
        java.util.Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((TagWrapper) next).copydefault().OLrzqt().valueOf().length() > 0) {
                break;
            }
        }
        TagWrapper tagWrapper = (TagWrapper) next;
        if (tagWrapper == null || (compactTagCopydefault = tagWrapper.copydefault()) == null || (tagExtraOLrzqt = compactTagCopydefault.OLrzqt()) == null) {
            return null;
        }
        return tagExtraOLrzqt.valueOf();
    }
}
