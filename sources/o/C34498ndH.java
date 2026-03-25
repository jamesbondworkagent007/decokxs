package o;

import android.graphics.drawable.VectorDrawable;
import com.okinc.dexkline.market.features.tag.domain.CompactTag;
import com.okinc.dexkline.market.features.tag.domain.TagExtra;
import com.okinc.dexkline.market.features.tag.domain.TagMeta;
import com.okinc.dexkline.market.features.tag.domain.TagWrapper;
import kotlin.jvm.internal.Intrinsics;
import o.C34604nfI;
import o.C35964oKf;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ndH, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C34498ndH {
    public static final C34498ndH OLrzqt = new C34498ndH();

    private C34498ndH() {
    }

    public final java.lang.String AEQbTJ(@NotNull java.util.List<TagWrapper> list) {
        CompactTag compactTagEZpvd;
        TagExtra tagExtraKWHzl;
        Intrinsics.checkNotNullParameter(list, "");
        TagWrapper tagWrapperCopydefault = copydefault(list);
        java.lang.String strEZpvd = (tagWrapperCopydefault == null || (compactTagEZpvd = tagWrapperCopydefault.EZpvd()) == null || (tagExtraKWHzl = compactTagEZpvd.KWHzl()) == null) ? null : tagExtraKWHzl.EZpvd();
        return strEZpvd == null ? "" : strEZpvd;
    }

    public static /* synthetic */ int getTextColor$default(C34498ndH c34498ndH, TagWrapper tagWrapper, boolean z, java.lang.Integer num, java.lang.Boolean bool, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            num = null;
        }
        if ((i & 8) != 0) {
            bool = java.lang.Boolean.FALSE;
        }
        return c34498ndH.EZpvd(tagWrapper, z, num, bool);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int EZpvd(@NotNull TagWrapper tagWrapper, boolean z, java.lang.Integer num, java.lang.Boolean bool) {
        java.lang.String strValueOf;
        int iCopydefault;
        Intrinsics.checkNotNullParameter(tagWrapper, "");
        if (z) {
            boolean zEZpvd = Intrinsics.EZpvd(bool, java.lang.Boolean.TRUE);
            TagMeta tagMetaAEQbTJ = tagWrapper.AEQbTJ();
            if (zEZpvd) {
                strValueOf = tagMetaAEQbTJ != null ? tagMetaAEQbTJ.EZpvd() : null;
            } else if (tagMetaAEQbTJ != null) {
                strValueOf = tagMetaAEQbTJ.AhwBna();
            }
        } else {
            boolean zEZpvd2 = Intrinsics.EZpvd(bool, java.lang.Boolean.TRUE);
            TagMeta tagMetaAEQbTJ2 = tagWrapper.AEQbTJ();
            if (zEZpvd2) {
                if (tagMetaAEQbTJ2 != null) {
                    strValueOf = tagMetaAEQbTJ2.OLrzqt();
                }
            } else if (tagMetaAEQbTJ2 != null) {
                strValueOf = tagMetaAEQbTJ2.valueOf();
            }
        }
        java.lang.String str = strValueOf != null ? strValueOf : "";
        if (num != null) {
            iCopydefault = num.intValue();
        } else if (z) {
            iCopydefault = C33070mpX.copydefault(C52761wXj.Activity.zblBkD);
        } else {
            iCopydefault = C33070mpX.copydefault(C52761wXj.Activity.ixgjPv);
        }
        return C33070mpX.EZpvd(str, iCopydefault);
    }

    public static /* synthetic */ java.lang.String getIcon$default(C34498ndH c34498ndH, TagMeta tagMeta, boolean z, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return c34498ndH.OLrzqt(tagMeta, z);
    }

    public final java.lang.String OLrzqt(@NotNull TagMeta tagMeta, boolean z) {
        Intrinsics.checkNotNullParameter(tagMeta, "");
        if (z) {
            return tagMeta.gEmmrt();
        }
        return tagMeta.AYXKKw();
    }

    public final android.text.SpannedString EZpvd(@NotNull android.content.Context context, int i, int i2) {
        int iCopydefault;
        Intrinsics.checkNotNullParameter(context, "");
        java.lang.String strValueOf = (i2 > 0 || i > 0) ? java.lang.String.valueOf(i2) : "-";
        java.lang.String strKWHzl = C33069mpW.KWHzl(context, C35964oKf.Fragment.DfrfUJ, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56424yEw.gEmmrt(C56390yDp.OLrzqt("num", strValueOf), C56390yDp.OLrzqt("num2", i > 0 ? java.lang.String.valueOf(i) : "-")));
        if (i > 0) {
            iCopydefault = mUM.copydefault(C52761wXj.Activity.fdOvFl);
        } else {
            iCopydefault = mUM.copydefault(C52761wXj.Activity.DCUTEIddSDPG);
        }
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder();
        spannableStringBuilder.append((java.lang.CharSequence) strKWHzl);
        spannableStringBuilder.setSpan(new android.text.style.ForegroundColorSpan(iCopydefault), 0, strKWHzl.length(), 33);
        if (i2 > 0) {
            spannableStringBuilder.setSpan(new android.text.style.ForegroundColorSpan(mUM.copydefault(C52761wXj.Activity.gdmIOq)), 0, strValueOf.length(), 33);
        }
        return new android.text.SpannedString(spannableStringBuilder);
    }

    public final C34604nfI OLrzqt() {
        int iCopydefault;
        if (C33512mxp.AEQbTJ.AYXKKw() == 0) {
            iCopydefault = Intrinsics.EZpvd((java.lang.Object) pFN.OLrzqt.AEQbTJ(), (java.lang.Object) "kline_dark") ? C33070mpX.copydefault(C52761wXj.Activity.RIuxYh) : C33070mpX.copydefault(C52761wXj.Activity.RSDDiY);
        } else {
            iCopydefault = Intrinsics.EZpvd((java.lang.Object) pFN.OLrzqt.AEQbTJ(), (java.lang.Object) "kline_dark") ? C33070mpX.copydefault(C52761wXj.Activity.gasjUx) : C33070mpX.copydefault(C52761wXj.Activity.gGvvIC);
        }
        C34604nfI.StateListAnimator stateListAnimator = C34604nfI.Companion;
        android.graphics.drawable.Drawable drawableKWHzl = C33070mpX.KWHzl(C52761wXj.TaskDescription.hQkvHM);
        if (drawableKWHzl == null) {
            drawableKWHzl = new VectorDrawable();
        }
        return C34604nfI.StateListAnimator.buildCustomIcon$default(stateListAnimator, drawableKWHzl, C33070mpX.AYXKKw(C35964oKf.Fragment.OijiEz), C33070mpX.AYXKKw(C35964oKf.Fragment.hfdhUn), java.lang.Integer.valueOf(iCopydefault), null, 16, null);
    }

    public final TagWrapper copydefault(@NotNull java.util.List<TagWrapper> list) {
        java.lang.Object next;
        Intrinsics.checkNotNullParameter(list, "");
        java.util.Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (Intrinsics.EZpvd((java.lang.Object) ((TagWrapper) next).KWHzl(), (java.lang.Object) "kol")) {
                break;
            }
        }
        return (TagWrapper) next;
    }
}
